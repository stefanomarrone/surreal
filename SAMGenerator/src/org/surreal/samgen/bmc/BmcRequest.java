package org.surreal.samgen.bmc;

public abstract class BmcRequest {

	protected int lenght;
	
	public abstract String getSource();

	public abstract String getTarget();
	
	public int getLength() {
		return this.lenght;
	}
}
