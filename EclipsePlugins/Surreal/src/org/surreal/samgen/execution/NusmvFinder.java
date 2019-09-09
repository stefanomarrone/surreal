package org.surreal.samgen.execution;

public class NusmvFinder extends ToolFinder {

	@Override
	protected void set() {
		this.checker = new NusmvChecker();
		this.defaultNames.add("nusmv");
		this.defaultNames.add("NUSMV");
//		this.defaultNames.add("NuSMV");
	}
}