package org.surreal.samgen.modes;

import java.util.StringTokenizer;
import java.util.Vector;

public class SystemModesFactory {

	public static ServiceModes generate(Vector<String> modes) {
		ServiceModes retval = new ServiceModes();
		for (String s: modes) {
			StringTokenizer st = new StringTokenizer(s,",");
			String nn = "";
			String cc = "";
			int pp = 0;
			try {
				nn = st.nextToken(); 
				pp = (new Integer(st.nextToken())).intValue();
				cc = st.nextToken(); 
			} catch (Exception e) {
			}
			Mode gm = new Mode(nn,cc,pp);
			retval.addGM(gm);
		}
		return retval;
	}	

	public static ServiceModes generate(ServiceModes initial, String[] names) {
		ServiceModes retval = new ServiceModes();
		for (String s: names) {
			Mode gm = initial.getSingleModeFromName(s);
			retval.addGM(gm);
		}
		return retval;
	}	

}