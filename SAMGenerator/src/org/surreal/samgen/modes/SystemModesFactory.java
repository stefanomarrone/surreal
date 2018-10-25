package org.surreal.samgen.modes;

import org.surreal.samgen.utils.IniReader;

public class SystemModesFactory {

	public static ServiceModes generate(String modeFileName) {
		ServiceModes retval = new ServiceModes();
		String buffer;
		try {
			IniReader reader = new IniReader(modeFileName);
			buffer = reader.get("Num");
			int number = (new Integer(buffer)).intValue();
			for (int i=0; i<number; i++) {
				String nn = reader.get("Mname_" + i); 
				String cc = reader.get("Mcond_" + i);
				buffer = reader.get("Mprio_" + i);
				int pp = (new Integer(buffer)).intValue();
				Mode gm = new Mode(nn,cc,pp);
				retval.addGM(gm);
			}
		} catch (Exception e) {
			retval = null;
		}
		return retval;
	}	
}