package org.surreal.samgen.results;

public class ModeEvent extends Event {

	public ModeEvent(String a, String v) {
		super(a, v);
	}

	@Override
	public String toString() {
		return this.inner("(S)");
	}

	@Override
	public boolean isProtectionActivation() {
		return false;
	}
}
