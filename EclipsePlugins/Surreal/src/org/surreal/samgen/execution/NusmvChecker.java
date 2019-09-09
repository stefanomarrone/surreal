package org.surreal.samgen.execution;

import java.io.IOException;

public class NusmvChecker implements ToolChecker {

	@Override
	public boolean check(String toolName) {
		boolean retval = false;
		String signature = "*** This is NuSMV";
		try {
			ExecutionManager checkerEM = new ExecutionManager(toolName);
			String actualSign = checkerEM.execWrap();
			retval = actualSign.startsWith(signature);
		} catch (ToolNotFound | IOException | InterruptedException e) {
			e.printStackTrace();
		}
		return retval;
	}
}