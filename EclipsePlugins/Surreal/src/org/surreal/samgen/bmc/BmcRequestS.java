package org.surreal.samgen.bmc;

public class BmcRequestS extends BmcRequest {

	protected String src;
	
	protected String trg;
	
	public BmcRequestS(String s, String t, int l) {
		this.src = s;
		this.trg = t;
		this.lenght = l;
	}
	
	public String getSource() {
		return this.src;
	}

	public String getTarget() {
		return this.trg;
	}
}
