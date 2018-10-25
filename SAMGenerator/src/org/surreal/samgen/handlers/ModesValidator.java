package org.surreal.samgen.handlers;

import org.eclipse.core.resources.IResource;
import org.surreal.samgen.utils.IniReader;

public class ModesValidator implements SelectionValidator {

	@Override
	public boolean isValid(IResource res) {
		boolean retval = false;
		try {
			IniReader reader = new IniReader(res);
			retval = reader.test("SanityCheck");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retval;
	}

}
