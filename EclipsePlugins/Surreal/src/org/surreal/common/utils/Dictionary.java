package org.surreal.common.utils;

public class Dictionary {
	final static public String profileName = "Survivability";
	
	final static public String serviceST = "service";
	
	final static public String misuseST = "misuse";
	
	final static public String indexTN = "misuse";

	final public static String recoveryST = "recovery";

	final public static String threatensST = "threatens";
	
	final public static String indexIntegerLiteral = "integerInterval";

	final public static String pluginID = "org.surreal";

	final public static String iniFileName = "configuration.ini";
	
	final public static String externalDir = "external";
	
	final public static String nusmvDir = "nusmv";

	final public static boolean embeddedToolFlag = false;
	
	final public static String getExternalDir() {
		String retval = "";
		String slash = Dictionary.getSlash();
		retval = Dictionary.externalDir + slash + Dictionary.nusmvDir + slash;
		return retval;
	}

	private static String getSlash() {
		String slash = "";
		String osname = System.getProperty("os.name");
		if (osname.contains("Windows")) {
			slash = "\\";	
		} else if (osname.contains("Linux")) {
			slash = "/";				
		}
		return slash;
	} 

}
