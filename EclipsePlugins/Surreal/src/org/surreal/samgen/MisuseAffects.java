package org.surreal.samgen;

import java.util.Vector;

public class MisuseAffects extends TaggedValue {

	public MisuseAffects() {
		this.labels = new Vector<String>(5);
		this.labels.add(0,"index");
		this.labels.add(1,null);
		this.labels.add(2,"set");
		this.labels.add(3,"incr");
		this.labels.add(4,"decr");
	}
}