package org.surreal.samgen.bmc;

import org.surreal.samgen.modes.Mode;

public class BmcRequestM extends BmcRequest {

	protected Mode src;
	
	protected Mode trg;
	
	public BmcRequestM(Mode s, Mode t, int l) {
		this.src = s;
		this.trg = t;
		this.lenght = l;
	}
	
	public String getSource() {
		return this.src.getName();
	}

	public String getTarget() {
		return this.trg.getName();
	}
}
