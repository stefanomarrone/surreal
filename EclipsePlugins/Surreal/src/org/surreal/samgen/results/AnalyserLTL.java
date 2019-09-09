package org.surreal.samgen.results;

import java.util.Vector;

public class AnalyserLTL extends Analyser {
	
    public AnalyserLTL(Vector<String> ms) {
		this.ef = new EventFactory(ms);
	}
}
