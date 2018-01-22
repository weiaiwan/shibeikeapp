package com.gbicc.shibeikeapp.utils;

import java.io.PrintStream;
import java.io.PrintWriter;
/**
 * 
 * @author Administrator
 *
 */
public class RuntimeBussinessException extends GbiccJsmoException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public RuntimeBussinessException(String message) {
		
		super(message);
		
	}
	
	public String toString() {
        String message = getLocalizedMessage();
        return (message != null) ? message : "";
    }
	
	public void printStackTrace(PrintStream s) {
        synchronized (s) {
            s.println(this); 
        }
    }
	public void printStackTrace(PrintWriter s) {
        synchronized (s) {
            s.println(this); 
        }
    }
}
