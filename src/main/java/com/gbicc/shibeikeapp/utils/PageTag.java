package com.gbicc.shibeikeapp.utils;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

public class PageTag extends SimpleTagSupport {
    // 表单Id;
    private String formId;

    // 左边最多显示多少超链接
    private int leftPages = 4;

    // 右边最多显示多少超链接
    private int rightPages = 2;

    // 每页多少行
    private int pageCount = 1;

    // 第一页名称
    private String firstName = "首页";

    // 最后一页名称
    private String lastName = "末页";

    // 上一页名称
    private String prevName = "上一页";

    // 下一页名称
    private String nextName = "下一页";

    // 是否显示第一页
    private boolean showFirst = true;

    // 是否显示最后一页
    private boolean showLast = true;

    // 是否显示上一页(如果选了true但没有上一页，则置灰)
    private boolean showPrev = true;

    // 是否显示下一页(如果选了true但没有下一页，则置灰)
    private boolean showNext = true;

    // 封装了数据和页数信息
    private PageBean pageBean;

    // 目标页面,可以是jsp,servlet等
    // 必须由这些服务器程序将一个pageBean放置到作用域
    private String targetPage;

    // 需要显示的字段,该属性输入为字符串,以','分隔
    // 例如: name, pass, birthday
    // 为*则全部显示
    private String[] fieldNames;

    // 表头要显示的名称,该属性输入为字符串,以','分隔
    // 例如：姓名,密码,年龄
    // 如果不输入,则用fieldNames
    private String[] headerNames;

    // 页面导航样式表名称
    private String paggingClass = "sabrosus";

    // 表格样式表名称
    private String tableClass = "c1";

    @Override
    public void doTag() throws JspException, IOException {
        if(pageBean == null) return;
        StringBuffer total = new StringBuffer(1024);
        genScript(total);
//		total.append("<table class='"+tableClass+"' cellpadding='0'>");
//		genTHeader(total);
//		genTBody(total);
//		total.append("</table>");
        genPagging(total);
        this.getJspContext().getOut().print(total.toString());

    }

    private void genPagging(StringBuffer total) {
        total.append("<div class=\""+paggingClass+"\">");
        if(showFirst){
            if(!pageBean.isPrevious()){
                total.append("<span class=\"disabled\">"+firstName+"</span>");
            } else {
                total.append("<a onclick=\"goto(1);return false;\">"
                        +firstName+"</a>");
            }
        }
        if(showPrev){
            if(!pageBean.isPrevious()){
                total.append("<span class=\"disabled\">"+prevName+"</span>");
            } else {
                total.append("<a onclick=\"goto("+(pageBean.getPageNo() - 1)+")\">"
                        +prevName+"</a>");
            }
        }
		/*
		 * 例如 leftPages=5 rightPages=2显示如下
		 * 1 |2| 3  4  5 ... 9  10
		 * 1  2 |3| 4  5 ... 9  10
		 * 1  2  3 |4| 5 ... 9  10
		 * 2  3  4 |5| 6 ... 9  10
		 * 3  4  5 |6| 7 ... 9  10
		 * 1  2 ... 6 |7| 8  9  10
		 * 1  2 ... 6  7 |8| 9  10
		 * 1  2 ... 6  7  8 |9| 10
		 * 如果 leftPages=7 rightPages=2显示时就没有中间的...了
		 */
        if(leftPages + rightPages + 1 >= pageBean.getTotalPage()){
            for(int i = 1; i <= pageBean.getTotalPage(); i++){
                writeHref(total, i);
            }
        } else {
            int begin = 1;
            int end = pageBean.getTotalPage();
            if(pageBean.getPageNo() >= leftPages) {
                begin = pageBean.getPageNo() - leftPages + 2;
            }
            if(pageBean.getPageNo() + leftPages - 2 <  pageBean.getTotalPage()){
                end = pageBean.getPageNo() + leftPages - 2;
            }
            int middle = pageBean.getTotalPage() / 2;

            if(pageBean.getPageNo() < middle + 2){
                for(int i = begin; i < leftPages + begin; i++){
                    writeHref(total, i);
                }
                total.append("...");
                for(int i = pageBean.getTotalPage() - rightPages + 1; i <= pageBean.getTotalPage(); i++){
                    writeHref(total, i);
                }
            } else {
                for(int i = 1; i <= rightPages; i++){
                    writeHref(total, i);
                }
                total.append("...");
                for(int i = end - leftPages + 1; i <= end; i++){
                    writeHref(total, i);
                }
            }

        }
        if(showNext){
            if(!pageBean.isNext()){
                total.append("<span class=\"disabled\">"+nextName+"</span>");
            } else {
                total.append("<a onclick=\"goto("+(pageBean.getPageNo() + 1)+")\">"
                        +nextName+"</a>");
            }
        }
        if(showLast){
            if(!pageBean.isNext()){
                total.append("<span class=\"disabled\">"+lastName+"</span>");
            } else {
                total.append("<a onclick=\"goto("+pageBean.getTotalPage()+")\">"
                        +lastName+"</a>");
            }
        }
//		total.append("<span>共"+pageBean.getTotalCount()+"条数据</span>");
        total.append("</div>");
    }

    private void writeHref(StringBuffer total, int i) {
        if(i == pageBean.getPageNo()){ // 当前页
            total.append("<span class=\"current\">"+i+"</span>");
        } else {
            total.append("<a onclick=\"goto("+i+")\">"+i+"</a>");
        }
    }

    private void genTBody(StringBuffer body) {
        body.append("<tbody>");
        for (Iterator iter = pageBean.getObjs().iterator(); iter.hasNext();) {
            body.append("<tr>");
            Object o = (Object) iter.next();
            for (int i = 0; i < fieldNames.length; i++) {
                String field = fieldNames[i].trim();
                Object value = null;
                try {
                    Method m = o.getClass().getMethod(field2Method(field,"get"), new Class[]{});
                    if(m == null){
                        m = o.getClass().getMethod(field2Method(field,"is"), new Class[]{});
                    }
                    if(m == null) {
                        throw new RuntimeException("没有对应的方法");
                    }
                    value = m.invoke(o, null);
                } catch (Exception e) {
                }
                body.append("<td>");
                body.append((value==null)?"":value.toString());
                body.append("</td>");
            }
            body.append("</tr>");
        }
        body.append("</tbody>");
    }

    private void genTHeader(StringBuffer header) {
        header.append("<thead>");
        if(headerNames == null) {
            headerNames = fieldNames;
        }
        for (int i = 0; i < headerNames.length; i++) {
            String field = headerNames[i];
            header.append("<th>");
            header.append(field);
            header.append("</th>");
        }
        header.append("</thead>");
    }

    private void genScript(StringBuffer script) {
        script.append("<script type=\"text/javascript\">\n");
        script.append("jQuery(document).ready(function(){\n"+
                // 添加表格的偶数行背景和鼠标移动效果
                "jQuery('."+tableClass+" tr')\n" +
                ".mouseover(function(){jQuery(this).addClass('over');})\n"+
                ".mouseout(function(){jQuery(this).removeClass('over');});\n"+
                "jQuery('."+tableClass+" tr:even').addClass('alt');\n" +
                // 检查表单中是否有pageNo和pageCount表单域，没有则添加
                "var input1 = \"<input id='pageNo' type='hidden' name='pageNo' value='1'/>\";\n" +
                "var input2 = \"<input id='pageCount' type='hidden' name='pageCount' value='"+pageCount+"'/>\";\n" +
                "if(jQuery('#"+formId+" > input[id=\"pageNo\"]').length == 0) {\n" +
                "jQuery('#"+formId+"').append(jQuery(input1));\n" +
                "}\n" +
                "if(jQuery('#"+formId+" > input[id=\"pageCount\"]').length == 0) {\n" +
                "jQuery('#"+formId+"').append(jQuery(input2));\n" +
                "}\n" +
                "});\n");


        script.append("function goto(pageNo) {\n" +
                "var form = jQuery('#"+formId+"');\n" +
                "jQuery('#pageNo').attr('value',pageNo);\n" +
                "form.attr('action','"+targetPage+"');\n" +
                "form.attr('method','POST');\n" +
                "form.submit();\n" +
                "}\n");
        script.append("</script>");
    }

    public String field2Method(String fieldName, String prefix) {
        StringBuffer buffer = new StringBuffer();
        char upperCaseChar = Character.toUpperCase(fieldName.charAt(0));
        buffer.append(prefix).append(upperCaseChar).append(fieldName.substring(1));
        return buffer.toString();
    }

    public int getLeftPages() {
        return leftPages;
    }


    public void setLeftPages(int leftPages) {
        this.leftPages = leftPages;
    }


    public PageBean getPageBean() {
        return pageBean;
    }


    public void setPageBean(PageBean pageBean) {
        this.pageBean = pageBean;
    }


    public int getRightPages() {
        return rightPages;
    }


    public void setRightPages(int rightPages) {
        this.rightPages = rightPages;
    }

    public void setFieldNames(String fieldNames) {
        if(! "*".equals(fieldNames)) {
            this.fieldNames = fieldNames.split(",");
        } else {
            ArrayList fields = new ArrayList();
            if(pageBean == null || pageBean.getObjs().size() == 0) {
                this.fieldNames = new String[0];
                return;
            }
            Class clazz = pageBean.getObjs().iterator().next().getClass();
            Method[] methods = clazz.getMethods();
            for (int i = 0; i < methods.length; i++) {
                String methodName = methods[i].getName();
                if(methodName.startsWith("get")){
                    methodName = methodName.substring(3);
                    methodName = Character.toLowerCase(methodName.charAt(0)) + methodName.substring(1);
                } else if(methodName.startsWith("is")){
                    methodName = methodName.substring(2);
                    methodName = Character.toLowerCase(methodName.charAt(0)) + methodName.substring(1);
                } else {
                    continue;
                }
                fields.add(methodName);
            }
            this.fieldNames = (String[])fields.toArray(new String[]{});
        }
    }

    public void setHeaderNames(String headerNames) {
        this.headerNames = headerNames.split(",");
    }

    public String getNextName() {
        return nextName;
    }

    public void setNextName(String nextName) {
        this.nextName = nextName;
    }

    public String getPrevName() {
        return prevName;
    }

    public void setPrevName(String prevName) {
        this.prevName = prevName;
    }

    public boolean isShowNext() {
        return showNext;
    }

    public void setShowNext(boolean showNext) {
        this.showNext = showNext;
    }

    public boolean isShowPrev() {
        return showPrev;
    }

    public void setShowPrev(boolean showPrev) {
        this.showPrev = showPrev;
    }

    public String getTargetPage() {
        return targetPage;
    }

    public void setTargetPage(String targetPage) {
        this.targetPage = targetPage;
    }

    public String getFormId() {
        return formId;
    }

    public void setFormId(String formId) {
        this.formId = formId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isShowFirst() {
        return showFirst;
    }

    public void setShowFirst(boolean showFirst) {
        this.showFirst = showFirst;
    }

    public boolean isShowLast() {
        return showLast;
    }

    public void setShowLast(boolean showLast) {
        this.showLast = showLast;
    }

    public String getPaggingClass() {
        return paggingClass;
    }

    public void setPaggingClass(String paggingClass) {
        this.paggingClass = paggingClass;
    }

    public String getTableClass() {
        return tableClass;
    }

    public void setTableClass(String tableClass) {
        this.tableClass = tableClass;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

}
