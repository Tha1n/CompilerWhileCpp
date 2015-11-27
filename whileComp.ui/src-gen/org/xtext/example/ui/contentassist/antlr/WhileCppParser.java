/*
 * generated by Xtext
 */
package org.xtext.example.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.example.services.WhileCppGrammarAccess;

public class WhileCppParser extends AbstractContentAssistParser {
	
	@Inject
	private WhileCppGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.example.ui.contentassist.antlr.internal.InternalWhileCppParser createParser() {
		org.xtext.example.ui.contentassist.antlr.internal.InternalWhileCppParser result = new org.xtext.example.ui.contentassist.antlr.internal.InternalWhileCppParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getCommandAccess().getAlternatives(), "rule__Command__Alternatives");
					put(grammarAccess.getCommandWhileAccess().getAlternatives_0(), "rule__CommandWhile__Alternatives_0");
					put(grammarAccess.getExprAccess().getAlternatives(), "rule__Expr__Alternatives");
					put(grammarAccess.getExprSimpleAccess().getAlternatives(), "rule__ExprSimple__Alternatives");
					put(grammarAccess.getExprSimpleAccess().getAlternatives_0(), "rule__ExprSimple__Alternatives_0");
					put(grammarAccess.getExprEqAccess().getAlternatives(), "rule__ExprEq__Alternatives");
					put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
					put(grammarAccess.getDefinitionAccess().getGroup(), "rule__Definition__Group__0");
					put(grammarAccess.getInputAccess().getGroup(), "rule__Input__Group__0");
					put(grammarAccess.getInputAccess().getGroup_0(), "rule__Input__Group_0__0");
					put(grammarAccess.getOutputAccess().getGroup(), "rule__Output__Group__0");
					put(grammarAccess.getOutputAccess().getGroup_0(), "rule__Output__Group_0__0");
					put(grammarAccess.getVarsAccess().getGroup(), "rule__Vars__Group__0");
					put(grammarAccess.getVarsAccess().getGroup_0(), "rule__Vars__Group_0__0");
					put(grammarAccess.getCommandAccess().getGroup_0(), "rule__Command__Group_0__0");
					put(grammarAccess.getCommandAccess().getGroup_1(), "rule__Command__Group_1__0");
					put(grammarAccess.getCommandWhileAccess().getGroup(), "rule__CommandWhile__Group__0");
					put(grammarAccess.getCommandIfAccess().getGroup(), "rule__CommandIf__Group__0");
					put(grammarAccess.getCommandIfAccess().getGroup_4(), "rule__CommandIf__Group_4__0");
					put(grammarAccess.getCommandForEachAccess().getGroup(), "rule__CommandForEach__Group__0");
					put(grammarAccess.getExprsAccess().getGroup(), "rule__Exprs__Group__0");
					put(grammarAccess.getExprsAccess().getGroup_0(), "rule__Exprs__Group_0__0");
					put(grammarAccess.getExprsAccess().getGroup_0_0(), "rule__Exprs__Group_0_0__0");
					put(grammarAccess.getExprAccess().getGroup_0(), "rule__Expr__Group_0__0");
					put(grammarAccess.getExprSimpleAccess().getGroup_1(), "rule__ExprSimple__Group_1__0");
					put(grammarAccess.getExprSimpleAccess().getGroup_2(), "rule__ExprSimple__Group_2__0");
					put(grammarAccess.getExprSimpleAccess().getGroup_3(), "rule__ExprSimple__Group_3__0");
					put(grammarAccess.getExprSimpleAccess().getGroup_4(), "rule__ExprSimple__Group_4__0");
					put(grammarAccess.getExprSimpleAccess().getGroup_5(), "rule__ExprSimple__Group_5__0");
					put(grammarAccess.getExprAndAccess().getGroup(), "rule__ExprAnd__Group__0");
					put(grammarAccess.getExprAndAccess().getGroup_1(), "rule__ExprAnd__Group_1__0");
					put(grammarAccess.getExprOrAccess().getGroup(), "rule__ExprOr__Group__0");
					put(grammarAccess.getExprOrAccess().getGroup_1(), "rule__ExprOr__Group_1__0");
					put(grammarAccess.getExprNotAccess().getGroup(), "rule__ExprNot__Group__0");
					put(grammarAccess.getExprEqAccess().getGroup_0(), "rule__ExprEq__Group_0__0");
					put(grammarAccess.getExprEqAccess().getGroup_1(), "rule__ExprEq__Group_1__0");
					put(grammarAccess.getProgramAccess().getFonctionsAssignment(), "rule__Program__FonctionsAssignment");
					put(grammarAccess.getFunctionAccess().getNomAssignment_1(), "rule__Function__NomAssignment_1");
					put(grammarAccess.getFunctionAccess().getDefinitionAssignment_3(), "rule__Function__DefinitionAssignment_3");
					put(grammarAccess.getDefinitionAccess().getInputsAssignment_1(), "rule__Definition__InputsAssignment_1");
					put(grammarAccess.getDefinitionAccess().getCommandesAssignment_3(), "rule__Definition__CommandesAssignment_3");
					put(grammarAccess.getDefinitionAccess().getOutputsAssignment_6(), "rule__Definition__OutputsAssignment_6");
					put(grammarAccess.getInputAccess().getVarInAssignment_0_0(), "rule__Input__VarInAssignment_0_0");
					put(grammarAccess.getInputAccess().getVarInAssignment_1(), "rule__Input__VarInAssignment_1");
					put(grammarAccess.getOutputAccess().getVarOutAssignment_0_0(), "rule__Output__VarOutAssignment_0_0");
					put(grammarAccess.getOutputAccess().getVarOutAssignment_1(), "rule__Output__VarOutAssignment_1");
					put(grammarAccess.getVarsAccess().getVarGenAssignment_0_0(), "rule__Vars__VarGenAssignment_0_0");
					put(grammarAccess.getVarsAccess().getVarGenAssignment_1(), "rule__Vars__VarGenAssignment_1");
					put(grammarAccess.getCommandsAccess().getCommandeAssignment(), "rule__Commands__CommandeAssignment");
					put(grammarAccess.getCommandAccess().getNopAssignment_0_0(), "rule__Command__NopAssignment_0_0");
					put(grammarAccess.getCommandAccess().getVarsAssignment_1_0(), "rule__Command__VarsAssignment_1_0");
					put(grammarAccess.getCommandAccess().getExprsAssignment_1_2(), "rule__Command__ExprsAssignment_1_2");
					put(grammarAccess.getCommandAccess().getCmdWhileAssignment_2(), "rule__Command__CmdWhileAssignment_2");
					put(grammarAccess.getCommandAccess().getCmdIfAssignment_3(), "rule__Command__CmdIfAssignment_3");
					put(grammarAccess.getCommandAccess().getCmdForEachAssignment_4(), "rule__Command__CmdForEachAssignment_4");
					put(grammarAccess.getCommandWhileAccess().getWAssignment_0_0(), "rule__CommandWhile__WAssignment_0_0");
					put(grammarAccess.getCommandWhileAccess().getExprAssignment_1(), "rule__CommandWhile__ExprAssignment_1");
					put(grammarAccess.getCommandWhileAccess().getCmdsAssignment_3(), "rule__CommandWhile__CmdsAssignment_3");
					put(grammarAccess.getCommandIfAccess().getCondAssignment_1(), "rule__CommandIf__CondAssignment_1");
					put(grammarAccess.getCommandIfAccess().getCmdsThenAssignment_3(), "rule__CommandIf__CmdsThenAssignment_3");
					put(grammarAccess.getCommandIfAccess().getCmdsElseAssignment_4_1(), "rule__CommandIf__CmdsElseAssignment_4_1");
					put(grammarAccess.getCommandForEachAccess().getElemAssignment_1(), "rule__CommandForEach__ElemAssignment_1");
					put(grammarAccess.getCommandForEachAccess().getEnsembAssignment_3(), "rule__CommandForEach__EnsembAssignment_3");
					put(grammarAccess.getCommandForEachAccess().getCmdsAssignment_5(), "rule__CommandForEach__CmdsAssignment_5");
					put(grammarAccess.getExprsAccess().getExpGenAssignment_0_0_0(), "rule__Exprs__ExpGenAssignment_0_0_0");
					put(grammarAccess.getExprsAccess().getExpGenAssignment_1(), "rule__Exprs__ExpGenAssignment_1");
					put(grammarAccess.getExprAccess().getExprSimpAssignment_0_0(), "rule__Expr__ExprSimpAssignment_0_0");
					put(grammarAccess.getExprAccess().getExprAndAssignment_1(), "rule__Expr__ExprAndAssignment_1");
					put(grammarAccess.getExprSimpleAccess().getNilAssignment_0_0(), "rule__ExprSimple__NilAssignment_0_0");
					put(grammarAccess.getExprSimpleAccess().getVariAssignment_0_1(), "rule__ExprSimple__VariAssignment_0_1");
					put(grammarAccess.getExprSimpleAccess().getSymbAssignment_0_2(), "rule__ExprSimple__SymbAssignment_0_2");
					put(grammarAccess.getExprSimpleAccess().getExprConsAssignment_1_1(), "rule__ExprSimple__ExprConsAssignment_1_1");
					put(grammarAccess.getExprSimpleAccess().getExprConsAttAssignment_1_2(), "rule__ExprSimple__ExprConsAttAssignment_1_2");
					put(grammarAccess.getExprSimpleAccess().getExprListAssignment_2_1(), "rule__ExprSimple__ExprListAssignment_2_1");
					put(grammarAccess.getExprSimpleAccess().getExprListAttAssignment_2_2(), "rule__ExprSimple__ExprListAttAssignment_2_2");
					put(grammarAccess.getExprSimpleAccess().getExprHeadAssignment_3_1(), "rule__ExprSimple__ExprHeadAssignment_3_1");
					put(grammarAccess.getExprSimpleAccess().getExprHeadAttAssignment_3_2(), "rule__ExprSimple__ExprHeadAttAssignment_3_2");
					put(grammarAccess.getExprSimpleAccess().getExprTailAssignment_4_1(), "rule__ExprSimple__ExprTailAssignment_4_1");
					put(grammarAccess.getExprSimpleAccess().getExprTailAttAssignment_4_2(), "rule__ExprSimple__ExprTailAttAssignment_4_2");
					put(grammarAccess.getExprSimpleAccess().getNomSymbAssignment_5_1(), "rule__ExprSimple__NomSymbAssignment_5_1");
					put(grammarAccess.getExprSimpleAccess().getSymbAttAssignment_5_2(), "rule__ExprSimple__SymbAttAssignment_5_2");
					put(grammarAccess.getExprAndAccess().getExprOrAssignment_0(), "rule__ExprAnd__ExprOrAssignment_0");
					put(grammarAccess.getExprAndAccess().getExprAndAssignment_1_0(), "rule__ExprAnd__ExprAndAssignment_1_0");
					put(grammarAccess.getExprAndAccess().getExprAndAttAssignment_1_1(), "rule__ExprAnd__ExprAndAttAssignment_1_1");
					put(grammarAccess.getExprOrAccess().getExprNotAssignment_0(), "rule__ExprOr__ExprNotAssignment_0");
					put(grammarAccess.getExprOrAccess().getExprOrAssignment_1_0(), "rule__ExprOr__ExprOrAssignment_1_0");
					put(grammarAccess.getExprOrAccess().getExprOrAttAssignment_1_1(), "rule__ExprOr__ExprOrAttAssignment_1_1");
					put(grammarAccess.getExprNotAccess().getNotAssignment_0(), "rule__ExprNot__NotAssignment_0");
					put(grammarAccess.getExprNotAccess().getExprEqAssignment_1(), "rule__ExprNot__ExprEqAssignment_1");
					put(grammarAccess.getExprEqAccess().getExprAssignment_0_1(), "rule__ExprEq__ExprAssignment_0_1");
					put(grammarAccess.getExprEqAccess().getExprSim1Assignment_1_0(), "rule__ExprEq__ExprSim1Assignment_1_0");
					put(grammarAccess.getExprEqAccess().getExprSim2Assignment_1_2(), "rule__ExprEq__ExprSim2Assignment_1_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.example.ui.contentassist.antlr.internal.InternalWhileCppParser typedParser = (org.xtext.example.ui.contentassist.antlr.internal.InternalWhileCppParser) parser;
			typedParser.entryRuleProgram();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_LC", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public WhileCppGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(WhileCppGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
