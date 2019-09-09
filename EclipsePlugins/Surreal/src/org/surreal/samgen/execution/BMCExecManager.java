package org.surreal.samgen.execution;

import java.io.IOException;

public class BMCExecManager extends ExecutionManager {
	
	private int blen;
	
	public BMCExecManager(int len) throws ToolNotFound {
		this.blen = len;
	}

	protected String execWrap() throws IOException, InterruptedException {
		String args = (new Integer(this.blen)).toString();
		ProcessBuilder builder = new ProcessBuilder(this.toolname,"-bmc","-bmc_length",args,this.temporaryFileName);
		return this.execute(builder);
	}
}
