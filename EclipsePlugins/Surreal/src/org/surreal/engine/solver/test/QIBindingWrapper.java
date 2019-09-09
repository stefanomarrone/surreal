package org.surreal.engine.solver.test;

import org.surreal.engine.query.QueryBinding;
import org.surreal.engine.query.QueryInstantiation;

public class QIBindingWrapper {
	
	private int counter;
	
	public QIBindingWrapper() {
		this.counter = 0;
	}
	
	public QueryBinding getP1() {
		QueryBinding retval = new QueryBinding(this.counter++,"P1");
		retval.addBindingEntry("SM","GS0");
		return retval;
	}

	public QueryBinding getP1bis() {
		QueryBinding retval = new QueryBinding(this.counter++,"P1");
		retval.addBindingEntry("SM","GS1");
		return retval;
	}

	public QueryBinding getP8() {
		QueryBinding retval = new QueryBinding(this.counter++,"P8");
		retval.addBindingEntry("M","one");
		return retval;
	}

	public QueryBinding getP14() {
		QueryBinding retval = new QueryBinding(this.counter++,"P14");
		retval.addBindingEntry("S","GS3");
		return retval;
	}
	
	public QueryBinding getP14bis() {
		QueryBinding retval = new QueryBinding(this.counter++,"P14");
		retval.addBindingEntry("S","GS2");
		return retval;
	}

	public QueryInstantiation getInstantiation() {
		QueryInstantiation retval = new QueryInstantiation();
//		retval.add(this.getP1());
//		retval.add(this.getP8());
		retval.add(this.getP14());
		retval.add(this.getP14bis());
		return retval;
	}
}