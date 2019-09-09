package org.surreal.common.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Configuration {
	
	private static Configuration singleton = null;
	
	private IniReader reader;
	
	public static Configuration generate() {
		Configuration retval = null;
		if (Configuration.singleton == null) {
			String pluginID = Dictionary.pluginID;
			String inifilename = Dictionary.iniFileName;
			String urlName = "platform:/plugin/" + pluginID;
			URL u = null;
			try {
				u = new URL(urlName + "/configuration/" + inifilename);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
			retval = new Configuration(u);
			Configuration.singleton = retval;
		} else {
			retval = Configuration.singleton;
		}
		return retval;
	}
	
	private Configuration(URL u) {
		try {
			this.reader = new IniReader(u);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	} 
	
    public String get(String propName) {
        return this.reader.get(propName);
    }

    public boolean test(String propName) {
    	return this.reader.test(propName); 
    }
}