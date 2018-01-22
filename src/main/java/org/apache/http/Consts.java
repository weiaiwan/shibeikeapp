package org.apache.http;

import java.nio.charset.Charset;

public final class Consts {
	 public static final int CR = 13; // <US-ASCII CR, carriage return (13)>
	    public static final int LF = 10; // <US-ASCII LF, linefeed (10)>
	    public static final int SP = 32; // <US-ASCII SP, space (32)>
	    public static final int HT = 9;  // <US-ASCII HT, horizontal-tab (9)>

	    public static final Charset UTF_8 = Charset.forName("UTF-8");
	    public static final Charset ASCII = Charset.forName("US-ASCII");
	    public static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");

	    private Consts() {
	    }
}
