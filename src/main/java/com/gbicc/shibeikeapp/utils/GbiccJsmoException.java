package com.gbicc.shibeikeapp.utils;

import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * 
 * @author Administrator
 *
 */
public class GbiccJsmoException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GbiccJsmoException() {
	}

	public GbiccJsmoException(String message) {
		super(message);
	}

	public GbiccJsmoException(Throwable cause) {
		super(cause);
	}

	public GbiccJsmoException(String message, Throwable cause) {
		super(message, cause);
	}

	public String toString() {

		String s = getClass().getName();
		String message = getLocalizedMessage();
		if (null!=getCause() && getCause() instanceof RuntimeBussinessException) {
			String causeMessage = getCause().getLocalizedMessage();
			if (causeMessage == null) {
				causeMessage = "";
			}
			return (message != null) ? message : "" + causeMessage;
		}
		return (message != null) ? (s + ": " + message) : s;
	}

	public void printStackTrace(PrintStream s) {
		synchronized (s) {
			if (null!=getCause() && getCause() instanceof RuntimeBussinessException) {
				s.println(this);
				return;
			}
		}
		super.printStackTrace(s);
	}

	public void printStackTrace(PrintWriter s) {
		synchronized (s) {
			if (null!=getCause() && getCause() instanceof RuntimeBussinessException) {
				s.println(this);
				return;
			}
		}
		super.printStackTrace(s);
	}

	public String getMessage() {
		String causeMessage="";
		if(null!=getCause()){
			causeMessage = getCause().getLocalizedMessage();
		}
		String messge = super.getMessage();
		if (null == messge) {
			messge = causeMessage;
		} else {
			if(null!=causeMessage && !"".equals(causeMessage.trim())){
				messge = messge + "-" + causeMessage;
			}
		}
		return messge;
	}
}
