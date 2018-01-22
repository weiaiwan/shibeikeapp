package com.gbicc.shibeikeapp.utils;

import java.io.File;
import java.net.ConnectException;

import com.artofsolving.jodconverter.DocumentConverter;
import com.artofsolving.jodconverter.openoffice.connection.OpenOfficeConnection;
import com.artofsolving.jodconverter.openoffice.connection.SocketOpenOfficeConnection;
import com.artofsolving.jodconverter.openoffice.converter.OpenOfficeDocumentConverter;

public class Converter {

	/**
	 * 转为PDF
	 * 
	 * @param file
	 */
	private static void doc2pdf(File docFile, File pdfFile) {
		OpenOfficeConnection connection = new SocketOpenOfficeConnection("localhost", 8100);// IP地址
		try {
			connection.connect();
		} catch (ConnectException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				connection.disconnect();
			}
		}
		DocumentConverter converter = new OpenOfficeDocumentConverter(connection);
		converter.convert(docFile, pdfFile);
	}

	/**
	 * 转换成 swf
	 */
	private static void pdf2swf(String name) {
		Runtime r = Runtime.getRuntime();
		System.out.println("pdf2swf" + "\t \"" + name + ".pdf\"" + "\t" + "-o  \"" + name + ".swf\" -T 9   "
				+ ">>   /ccc/swf.log 2>&1");
		Process p;
		try {
			//p = r.exec("pdf2swf" + "\t \"" + name + ".pdf\"" + "\t" + "-o  \"" + name + ".swf\" -T 9  ");
			p = r.exec("D://pdf2swf" + "\t \"" + name + ".pdf\"" + "\t" + "-o  \"" + name + ".swf\" -T 9  ");
			p.waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 转换主方法
	 */
	public static void conver(String fileName) throws Exception {
		File file = new File(fileName);
		if (file.exists()) {
			int index = fileName.lastIndexOf(".");
			String suffix = fileName.substring(index + 1).trim();
			String name = fileName.substring(0, index);
			if ("pdf".equals(suffix)) {
				pdf2swf(name);
			} else {
				File pdfFile = new File(name + ".pdf");
				doc2pdf(file, pdfFile);
				pdf2swf(name);
			}
		}
	}
	public static void main(String[] args) throws Exception {
		conver("D://px.doc");
	}
}
