/*
 * generated by Xtext
 */
package org.xtext.example.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.services.WhileCppGrammarAccess;

public class WhileCppParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private WhileCppGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_LC");
	}
	
	@Override
	protected org.xtext.example.parser.antlr.internal.InternalWhileCppParser createParser(XtextTokenStream stream) {
		return new org.xtext.example.parser.antlr.internal.InternalWhileCppParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Program";
	}
	
	public WhileCppGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(WhileCppGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
