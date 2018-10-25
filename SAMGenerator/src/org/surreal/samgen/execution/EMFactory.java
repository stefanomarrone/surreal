package org.surreal.samgen.execution;

public class EMFactory {
	
	public static ExecutionManager generate(String kind, int len) {
		ExecutionManager retval = null;
		if (kind.equals("CTL")) {
			retval = new ExecutionManager();
		} else if (kind.equals("BMC")) {
			retval = new BMCExecManager(len);
		}
		return retval;
	}

	public static ExecutionManager generate(String kind) {
		return EMFactory.generate(kind,0);
	}
}