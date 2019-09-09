package org.surreal.samgen.modes.condition;

import java.io.IOException;

import org.surreal.common.utils.PBFactory;
import org.surreal.samgen.modes.condition.lexer.Lexer;
import org.surreal.samgen.modes.condition.lexer.LexerException;
import org.surreal.samgen.modes.condition.node.Start;
import org.surreal.samgen.modes.condition.parser.Parser;
import org.surreal.samgen.modes.condition.parser.ParserException;

public class ConditionTranslator {

	public static String translate(String input) {
		String retval = "";
		PBFactory.attach(input);
		Lexer lexer = new Lexer(PBFactory.getPBR()); 
		Parser parser = new Parser(lexer); 
		Start ast = null;
		try {
			ast = parser.parse();
			Analyser sem = new Analyser();
			ast.apply(sem);
			retval = sem.getTranslated();
		} catch (ParserException | LexerException | IOException e) {
			e.printStackTrace();
		}
		return retval;
	}
}