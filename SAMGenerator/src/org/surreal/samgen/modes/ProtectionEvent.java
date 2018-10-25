package org.surreal.samgen.modes;

import org.surreal.samgen.results.Event;

public class ProtectionEvent extends Event {

	public ProtectionEvent(String a, String v) {
		super(a, v);
	}

	@Override
	public String toString() {
		return this.inner("(P)");
	}
}