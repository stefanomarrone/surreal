package org.surreal.samgen;

import java.util.Vector;

public class ServiceIndex extends TaggedValue {

	public ServiceIndex() {
		this.labels = new Vector<String>(4);
		this.labels.add(0,"name");
		this.labels.add(1,null);
		this.labels.add(2,"Values");
		this.labels.add(3,"Initial");
	}
}