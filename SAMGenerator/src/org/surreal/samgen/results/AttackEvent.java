package org.surreal.samgen.results;

public class AttackEvent extends Event {

	public AttackEvent(String a, String v) {
		super(a, v);
	}

	@Override
	public String toString() {
		return this.inner("(A)");
	}
}
