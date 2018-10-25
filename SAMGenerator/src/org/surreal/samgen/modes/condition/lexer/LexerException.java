/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.surreal.samgen.modes.condition.lexer;

import org.surreal.samgen.modes.condition.node.*;

@SuppressWarnings("serial")
public class LexerException extends Exception
{
    private InvalidToken invalidToken;
    
    public LexerException(@SuppressWarnings("hiding") InvalidToken invalidToken, String message)
    {
        super(message);
        this.invalidToken = invalidToken;
    }

    public InvalidToken getToken()
    {
        return this.invalidToken;
    }
}
