package org.surreal.samgen.results;

import java.io.IOException;
import java.util.Vector;

import org.surreal.samgen.results.lexer.Lexer;
import org.surreal.samgen.results.lexer.LexerException;
import org.surreal.samgen.results.node.Start;
import org.surreal.samgen.results.parser.Parser;
import org.surreal.samgen.results.parser.ParserException;
import org.surreal.samgen.utils.PBFactory;

public class ResultTranslator {
	
	private Analyser sem;
	
	private Vector<String> ms;
	
	public ResultTranslator(Vector<String> modes) {
		this.sem = null;
		this.ms = modes;
	}
	
	public void innerTranslation(String input) {
		PBFactory.attach(input);
		Lexer lexer = new Lexer(PBFactory.getPBR()); 
		Parser parser = new Parser(lexer); 
		Start ast = null;
		try {
			ast = parser.parse();
			ast.apply(this.sem);
		} catch (ParserException | LexerException | IOException e) {
			e.printStackTrace();
		}
	}
	
	public void translate_ctl(String input) {
		this.sem = new AnalyserCTL(this.ms);
		this.innerTranslation(input);		
	}

	public void translate_ltl(String input) {
		this.sem = new AnalyserLTL(this.ms);
		this.innerTranslation(input);		
	}

	public String getStartingMode() {
		return this.sem.getSourceMode();
	}

	public int getSpaceSize() {
		return this.sem.getCounterXLenght();
	}

	public String getTargetMode() {
		return this.sem.getTargetMode();
	}

	public Vector<Step> getSequence() {
		return this.sem.getSequence();
	}
}