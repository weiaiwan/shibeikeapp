package com.gbicc.shibeikeapp.utils;

import java.util.Collection;
import java.util.Collections;

public class PageBean {
    private Collection objs = Collections.EMPTY_LIST;

    private int totalCount;//总数据条数

    private int pageNo = 1;//当前页

    private int pageCount = 10;//每页显示行数

    private int totalPage;//总页数



    public PageBean() {
        super();
        // TODO Auto-generated constructor stub
    }
    public PageBean(Collection collection, int totalCount, int pageNo, int pageCount) {
        super();
        this.objs = collection;
        this.totalCount = totalCount;
        this.pageNo = pageNo;
        this.pageCount = pageCount;
        if(this.totalCount % this.pageCount ==0)
            this.totalPage = this.totalCount / this.pageCount;
        else
            this.totalPage = this.totalCount / this.pageCount + 1;
    }
    //是否有下一页
    public boolean isNext(){
        return pageNo < this.getTotalPage();
    }
    //是否有前一页
    public boolean isPrevious(){
        return pageNo > 1;
    }


    public int getTotalPage() {

        this.totalPage =(this.getTotalCount() - 1) / this.getPageCount() + 1;

        return totalPage;
    }
    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPageNo() {
        return pageNo;
    }
    public Collection getObjs() {
        return objs;
    }

    public void setObjs(Collection collection) {
        this.objs = collection;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }
}
