package org.surreal.samgen.results;

import java.util.Vector;

public class AnalyserCTL extends Analyser {
	
    public AnalyserCTL(Vector<String> ms) {
		this.ef = new EventFactory(ms);
	}
}
