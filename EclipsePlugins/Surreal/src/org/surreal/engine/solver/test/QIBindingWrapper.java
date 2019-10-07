package org.surreal.engine.solver.test;

import org.surreal.engine.query.QueryInstantiation;
import org.surreal.engine.query.QueryInstantiationDocument;

public class QIBindingWrapper {
	
	private int counter;
	
	public QIBindingWrapper() {
		this.counter = 0;
	}
	
	public QueryInstantiation getP1() {
		QueryInstantiation retval = new QueryInstantiation(this.counter++,"P1");
		retval.addBindingEntry("SM","GS0");
		return retval;
	}

	public QueryInstantiation getP1bis() {
		QueryInstantiation retval = new QueryInstantiation(this.counter++,"P1");
		retval.addBindingEntry("SM","GS1");
		return retval;
	}

	public QueryInstantiation getP8() {
		QueryInstantiation retval = new QueryInstantiation(this.counter++,"P8");
		retval.addBindingEntry("M","one");
		return retval;
	}

	public QueryInstantiation getP14() {
		QueryInstantiation retval = new QueryInstantiation(this.counter++,"P14");
		retval.addBindingEntry("S","GS3");
		return retval;
	}
	
	public QueryInstantiation getP14bis() {
		QueryInstantiation retval = new QueryInstantiation(this.counter++,"P14");
		retval.addBindingEntry("S","GS2");
		return retval;
	}

	public QueryInstantiationDocument getInstantiation() {
		QueryInstantiationDocument retval = new QueryInstantiationDocument();
//		retval.add(this.getP1());
//		retval.add(this.getP8());
		retval.add(this.getP14());
		retval.add(this.getP14bis());
		return retval;
	}
}