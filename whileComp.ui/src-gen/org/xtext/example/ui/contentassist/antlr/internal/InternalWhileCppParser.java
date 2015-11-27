package org.xtext.example.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.services.WhileCppGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalWhileCppParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SYMBOL", "RULE_VARIABLE", "RULE_LC", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'for'", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "':='", "'do'", "'od'", "'if'", "'then'", "'fi'", "'else'", "'foreach'", "'in'", "'('", "')'", "'=?'", "'nop'", "'while'", "'nil'", "'cons'", "'list'", "'hd'", "'tl'", "'and'", "'or'", "'not'"
    };
    public static final int RULE_LC=6;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int RULE_ID=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=12;
    public static final int RULE_VARIABLE=5;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_SYMBOL=4;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalWhileCppParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWhileCppParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWhileCppParser.tokenNames; }
    public String getGrammarFileName() { return "../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g"; }


     
     	private WhileCppGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(WhileCppGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleProgram"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:61:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:62:1: ( ruleProgram EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:63:1: ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram67);
            ruleProgram();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram74); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:70:1: ruleProgram : ( ( rule__Program__FonctionsAssignment )* ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:74:2: ( ( ( rule__Program__FonctionsAssignment )* ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:75:1: ( ( rule__Program__FonctionsAssignment )* )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:75:1: ( ( rule__Program__FonctionsAssignment )* )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:76:1: ( rule__Program__FonctionsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getFonctionsAssignment()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:77:1: ( rule__Program__FonctionsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:77:2: rule__Program__FonctionsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Program__FonctionsAssignment_in_ruleProgram100);
            	    rule__Program__FonctionsAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getFonctionsAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleFunction"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:89:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:90:1: ( ruleFunction EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:91:1: ruleFunction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction128);
            ruleFunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction135); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:98:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:102:2: ( ( ( rule__Function__Group__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:103:1: ( ( rule__Function__Group__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:103:1: ( ( rule__Function__Group__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:104:1: ( rule__Function__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getGroup()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:105:1: ( rule__Function__Group__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:105:2: rule__Function__Group__0
            {
            pushFollow(FOLLOW_rule__Function__Group__0_in_ruleFunction161);
            rule__Function__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleDefinition"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:117:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:118:1: ( ruleDefinition EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:119:1: ruleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition188);
            ruleDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition195); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:126:1: ruleDefinition : ( ( rule__Definition__Group__0 ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:130:2: ( ( ( rule__Definition__Group__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:131:1: ( ( rule__Definition__Group__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:131:1: ( ( rule__Definition__Group__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:132:1: ( rule__Definition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getGroup()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:133:1: ( rule__Definition__Group__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:133:2: rule__Definition__Group__0
            {
            pushFollow(FOLLOW_rule__Definition__Group__0_in_ruleDefinition221);
            rule__Definition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleInput"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:145:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:146:1: ( ruleInput EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:147:1: ruleInput EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputRule()); 
            }
            pushFollow(FOLLOW_ruleInput_in_entryRuleInput248);
            ruleInput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInput255); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:154:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:158:2: ( ( ( rule__Input__Group__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:159:1: ( ( rule__Input__Group__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:159:1: ( ( rule__Input__Group__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:160:1: ( rule__Input__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getGroup()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:161:1: ( rule__Input__Group__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:161:2: rule__Input__Group__0
            {
            pushFollow(FOLLOW_rule__Input__Group__0_in_ruleInput281);
            rule__Input__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:173:1: entryRuleOutput : ruleOutput EOF ;
    public final void entryRuleOutput() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:174:1: ( ruleOutput EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:175:1: ruleOutput EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputRule()); 
            }
            pushFollow(FOLLOW_ruleOutput_in_entryRuleOutput308);
            ruleOutput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutput315); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:182:1: ruleOutput : ( ( rule__Output__Group__0 ) ) ;
    public final void ruleOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:186:2: ( ( ( rule__Output__Group__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:187:1: ( ( rule__Output__Group__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:187:1: ( ( rule__Output__Group__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:188:1: ( rule__Output__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getGroup()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:189:1: ( rule__Output__Group__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:189:2: rule__Output__Group__0
            {
            pushFollow(FOLLOW_rule__Output__Group__0_in_ruleOutput341);
            rule__Output__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleVars"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:201:1: entryRuleVars : ruleVars EOF ;
    public final void entryRuleVars() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:202:1: ( ruleVars EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:203:1: ruleVars EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsRule()); 
            }
            pushFollow(FOLLOW_ruleVars_in_entryRuleVars368);
            ruleVars();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVars375); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVars"


    // $ANTLR start "ruleVars"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:210:1: ruleVars : ( ( rule__Vars__Group__0 ) ) ;
    public final void ruleVars() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:214:2: ( ( ( rule__Vars__Group__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:215:1: ( ( rule__Vars__Group__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:215:1: ( ( rule__Vars__Group__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:216:1: ( rule__Vars__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getGroup()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:217:1: ( rule__Vars__Group__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:217:2: rule__Vars__Group__0
            {
            pushFollow(FOLLOW_rule__Vars__Group__0_in_ruleVars401);
            rule__Vars__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVars"


    // $ANTLR start "entryRuleCommands"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:229:1: entryRuleCommands : ruleCommands EOF ;
    public final void entryRuleCommands() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:230:1: ( ruleCommands EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:231:1: ruleCommands EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsRule()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_entryRuleCommands428);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommands435); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommands"


    // $ANTLR start "ruleCommands"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:238:1: ruleCommands : ( ( ( rule__Commands__CommandeAssignment ) ) ( ( rule__Commands__CommandeAssignment )* ) ) ;
    public final void ruleCommands() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:242:2: ( ( ( ( rule__Commands__CommandeAssignment ) ) ( ( rule__Commands__CommandeAssignment )* ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:243:1: ( ( ( rule__Commands__CommandeAssignment ) ) ( ( rule__Commands__CommandeAssignment )* ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:243:1: ( ( ( rule__Commands__CommandeAssignment ) ) ( ( rule__Commands__CommandeAssignment )* ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:244:1: ( ( rule__Commands__CommandeAssignment ) ) ( ( rule__Commands__CommandeAssignment )* )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:244:1: ( ( rule__Commands__CommandeAssignment ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:245:1: ( rule__Commands__CommandeAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getCommandeAssignment()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:246:1: ( rule__Commands__CommandeAssignment )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:246:2: rule__Commands__CommandeAssignment
            {
            pushFollow(FOLLOW_rule__Commands__CommandeAssignment_in_ruleCommands463);
            rule__Commands__CommandeAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getCommandeAssignment()); 
            }

            }

            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:249:1: ( ( rule__Commands__CommandeAssignment )* )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:250:1: ( rule__Commands__CommandeAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getCommandeAssignment()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:251:1: ( rule__Commands__CommandeAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_VARIABLE||LA2_0==14||LA2_0==25||LA2_0==29||(LA2_0>=34 && LA2_0<=35)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:251:2: rule__Commands__CommandeAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Commands__CommandeAssignment_in_ruleCommands475);
            	    rule__Commands__CommandeAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getCommandeAssignment()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommands"


    // $ANTLR start "entryRuleCommand"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:264:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:265:1: ( ruleCommand EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:266:1: ruleCommand EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandRule()); 
            }
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand505);
            ruleCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand512); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:273:1: ruleCommand : ( ( rule__Command__Alternatives ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:277:2: ( ( ( rule__Command__Alternatives ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:278:1: ( ( rule__Command__Alternatives ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:278:1: ( ( rule__Command__Alternatives ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:279:1: ( rule__Command__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getAlternatives()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:280:1: ( rule__Command__Alternatives )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:280:2: rule__Command__Alternatives
            {
            pushFollow(FOLLOW_rule__Command__Alternatives_in_ruleCommand538);
            rule__Command__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleCommandWhile"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:292:1: entryRuleCommandWhile : ruleCommandWhile EOF ;
    public final void entryRuleCommandWhile() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:293:1: ( ruleCommandWhile EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:294:1: ruleCommandWhile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandWhileRule()); 
            }
            pushFollow(FOLLOW_ruleCommandWhile_in_entryRuleCommandWhile565);
            ruleCommandWhile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandWhileRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommandWhile572); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommandWhile"


    // $ANTLR start "ruleCommandWhile"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:301:1: ruleCommandWhile : ( ( rule__CommandWhile__Group__0 ) ) ;
    public final void ruleCommandWhile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:305:2: ( ( ( rule__CommandWhile__Group__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:306:1: ( ( rule__CommandWhile__Group__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:306:1: ( ( rule__CommandWhile__Group__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:307:1: ( rule__CommandWhile__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandWhileAccess().getGroup()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:308:1: ( rule__CommandWhile__Group__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:308:2: rule__CommandWhile__Group__0
            {
            pushFollow(FOLLOW_rule__CommandWhile__Group__0_in_ruleCommandWhile598);
            rule__CommandWhile__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandWhileAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommandWhile"


    // $ANTLR start "entryRuleCommandIf"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:320:1: entryRuleCommandIf : ruleCommandIf EOF ;
    public final void entryRuleCommandIf() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:321:1: ( ruleCommandIf EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:322:1: ruleCommandIf EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfRule()); 
            }
            pushFollow(FOLLOW_ruleCommandIf_in_entryRuleCommandIf625);
            ruleCommandIf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandIfRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommandIf632); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommandIf"


    // $ANTLR start "ruleCommandIf"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:329:1: ruleCommandIf : ( ( rule__CommandIf__Group__0 ) ) ;
    public final void ruleCommandIf() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:333:2: ( ( ( rule__CommandIf__Group__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:334:1: ( ( rule__CommandIf__Group__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:334:1: ( ( rule__CommandIf__Group__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:335:1: ( rule__CommandIf__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getGroup()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:336:1: ( rule__CommandIf__Group__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:336:2: rule__CommandIf__Group__0
            {
            pushFollow(FOLLOW_rule__CommandIf__Group__0_in_ruleCommandIf658);
            rule__CommandIf__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandIfAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommandIf"


    // $ANTLR start "entryRuleCommandForEach"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:348:1: entryRuleCommandForEach : ruleCommandForEach EOF ;
    public final void entryRuleCommandForEach() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:349:1: ( ruleCommandForEach EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:350:1: ruleCommandForEach EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachRule()); 
            }
            pushFollow(FOLLOW_ruleCommandForEach_in_entryRuleCommandForEach685);
            ruleCommandForEach();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandForEachRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommandForEach692); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommandForEach"


    // $ANTLR start "ruleCommandForEach"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:357:1: ruleCommandForEach : ( ( rule__CommandForEach__Group__0 ) ) ;
    public final void ruleCommandForEach() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:361:2: ( ( ( rule__CommandForEach__Group__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:362:1: ( ( rule__CommandForEach__Group__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:362:1: ( ( rule__CommandForEach__Group__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:363:1: ( rule__CommandForEach__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachAccess().getGroup()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:364:1: ( rule__CommandForEach__Group__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:364:2: rule__CommandForEach__Group__0
            {
            pushFollow(FOLLOW_rule__CommandForEach__Group__0_in_ruleCommandForEach718);
            rule__CommandForEach__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandForEachAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommandForEach"


    // $ANTLR start "entryRuleExprs"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:376:1: entryRuleExprs : ruleExprs EOF ;
    public final void entryRuleExprs() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:377:1: ( ruleExprs EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:378:1: ruleExprs EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsRule()); 
            }
            pushFollow(FOLLOW_ruleExprs_in_entryRuleExprs745);
            ruleExprs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprs752); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExprs"


    // $ANTLR start "ruleExprs"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:385:1: ruleExprs : ( ( rule__Exprs__Group__0 ) ) ;
    public final void ruleExprs() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:389:2: ( ( ( rule__Exprs__Group__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:390:1: ( ( rule__Exprs__Group__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:390:1: ( ( rule__Exprs__Group__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:391:1: ( rule__Exprs__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getGroup()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:392:1: ( rule__Exprs__Group__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:392:2: rule__Exprs__Group__0
            {
            pushFollow(FOLLOW_rule__Exprs__Group__0_in_ruleExprs778);
            rule__Exprs__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExprs"


    // $ANTLR start "entryRuleExpr"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:404:1: entryRuleExpr : ruleExpr EOF ;
    public final void entryRuleExpr() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:405:1: ( ruleExpr EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:406:1: ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr805);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr812); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:413:1: ruleExpr : ( ( rule__Expr__Alternatives ) ) ;
    public final void ruleExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:417:2: ( ( ( rule__Expr__Alternatives ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:418:1: ( ( rule__Expr__Alternatives ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:418:1: ( ( rule__Expr__Alternatives ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:419:1: ( rule__Expr__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getAlternatives()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:420:1: ( rule__Expr__Alternatives )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:420:2: rule__Expr__Alternatives
            {
            pushFollow(FOLLOW_rule__Expr__Alternatives_in_ruleExpr838);
            rule__Expr__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleExprSimple"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:432:1: entryRuleExprSimple : ruleExprSimple EOF ;
    public final void entryRuleExprSimple() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:433:1: ( ruleExprSimple EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:434:1: ruleExprSimple EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleRule()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_entryRuleExprSimple865);
            ruleExprSimple();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprSimple872); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExprSimple"


    // $ANTLR start "ruleExprSimple"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:441:1: ruleExprSimple : ( ( rule__ExprSimple__Alternatives ) ) ;
    public final void ruleExprSimple() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:445:2: ( ( ( rule__ExprSimple__Alternatives ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:446:1: ( ( rule__ExprSimple__Alternatives ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:446:1: ( ( rule__ExprSimple__Alternatives ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:447:1: ( rule__ExprSimple__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getAlternatives()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:448:1: ( rule__ExprSimple__Alternatives )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:448:2: rule__ExprSimple__Alternatives
            {
            pushFollow(FOLLOW_rule__ExprSimple__Alternatives_in_ruleExprSimple898);
            rule__ExprSimple__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExprSimple"


    // $ANTLR start "entryRuleExprAnd"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:460:1: entryRuleExprAnd : ruleExprAnd EOF ;
    public final void entryRuleExprAnd() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:461:1: ( ruleExprAnd EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:462:1: ruleExprAnd EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndRule()); 
            }
            pushFollow(FOLLOW_ruleExprAnd_in_entryRuleExprAnd925);
            ruleExprAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprAnd932); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExprAnd"


    // $ANTLR start "ruleExprAnd"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:469:1: ruleExprAnd : ( ( rule__ExprAnd__Group__0 ) ) ;
    public final void ruleExprAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:473:2: ( ( ( rule__ExprAnd__Group__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:474:1: ( ( rule__ExprAnd__Group__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:474:1: ( ( rule__ExprAnd__Group__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:475:1: ( rule__ExprAnd__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getGroup()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:476:1: ( rule__ExprAnd__Group__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:476:2: rule__ExprAnd__Group__0
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group__0_in_ruleExprAnd958);
            rule__ExprAnd__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExprAnd"


    // $ANTLR start "entryRuleExprOr"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:488:1: entryRuleExprOr : ruleExprOr EOF ;
    public final void entryRuleExprOr() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:489:1: ( ruleExprOr EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:490:1: ruleExprOr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrRule()); 
            }
            pushFollow(FOLLOW_ruleExprOr_in_entryRuleExprOr985);
            ruleExprOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprOr992); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExprOr"


    // $ANTLR start "ruleExprOr"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:497:1: ruleExprOr : ( ( rule__ExprOr__Group__0 ) ) ;
    public final void ruleExprOr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:501:2: ( ( ( rule__ExprOr__Group__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:502:1: ( ( rule__ExprOr__Group__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:502:1: ( ( rule__ExprOr__Group__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:503:1: ( rule__ExprOr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getGroup()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:504:1: ( rule__ExprOr__Group__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:504:2: rule__ExprOr__Group__0
            {
            pushFollow(FOLLOW_rule__ExprOr__Group__0_in_ruleExprOr1018);
            rule__ExprOr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExprOr"


    // $ANTLR start "entryRuleExprNot"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:516:1: entryRuleExprNot : ruleExprNot EOF ;
    public final void entryRuleExprNot() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:517:1: ( ruleExprNot EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:518:1: ruleExprNot EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotRule()); 
            }
            pushFollow(FOLLOW_ruleExprNot_in_entryRuleExprNot1045);
            ruleExprNot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprNot1052); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExprNot"


    // $ANTLR start "ruleExprNot"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:525:1: ruleExprNot : ( ( rule__ExprNot__Group__0 ) ) ;
    public final void ruleExprNot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:529:2: ( ( ( rule__ExprNot__Group__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:530:1: ( ( rule__ExprNot__Group__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:530:1: ( ( rule__ExprNot__Group__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:531:1: ( rule__ExprNot__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getGroup()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:532:1: ( rule__ExprNot__Group__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:532:2: rule__ExprNot__Group__0
            {
            pushFollow(FOLLOW_rule__ExprNot__Group__0_in_ruleExprNot1078);
            rule__ExprNot__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExprNot"


    // $ANTLR start "entryRuleExprEq"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:544:1: entryRuleExprEq : ruleExprEq EOF ;
    public final void entryRuleExprEq() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:545:1: ( ruleExprEq EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:546:1: ruleExprEq EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqRule()); 
            }
            pushFollow(FOLLOW_ruleExprEq_in_entryRuleExprEq1105);
            ruleExprEq();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprEq1112); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExprEq"


    // $ANTLR start "ruleExprEq"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:553:1: ruleExprEq : ( ( rule__ExprEq__Alternatives ) ) ;
    public final void ruleExprEq() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:557:2: ( ( ( rule__ExprEq__Alternatives ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:558:1: ( ( rule__ExprEq__Alternatives ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:558:1: ( ( rule__ExprEq__Alternatives ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:559:1: ( rule__ExprEq__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getAlternatives()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:560:1: ( rule__ExprEq__Alternatives )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:560:2: rule__ExprEq__Alternatives
            {
            pushFollow(FOLLOW_rule__ExprEq__Alternatives_in_ruleExprEq1138);
            rule__ExprEq__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExprEq"


    // $ANTLR start "rule__Command__Alternatives"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:572:1: rule__Command__Alternatives : ( ( ( rule__Command__Group_0__0 ) ) | ( ( rule__Command__Group_1__0 ) ) | ( ( rule__Command__CmdWhileAssignment_2 ) ) | ( ( rule__Command__CmdIfAssignment_3 ) ) | ( ( rule__Command__CmdForEachAssignment_4 ) ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:576:1: ( ( ( rule__Command__Group_0__0 ) ) | ( ( rule__Command__Group_1__0 ) ) | ( ( rule__Command__CmdWhileAssignment_2 ) ) | ( ( rule__Command__CmdIfAssignment_3 ) ) | ( ( rule__Command__CmdForEachAssignment_4 ) ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt3=1;
                }
                break;
            case RULE_VARIABLE:
                {
                alt3=2;
                }
                break;
            case 14:
            case 35:
                {
                alt3=3;
                }
                break;
            case 25:
                {
                alt3=4;
                }
                break;
            case 29:
                {
                alt3=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:577:1: ( ( rule__Command__Group_0__0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:577:1: ( ( rule__Command__Group_0__0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:578:1: ( rule__Command__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getGroup_0()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:579:1: ( rule__Command__Group_0__0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:579:2: rule__Command__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Command__Group_0__0_in_rule__Command__Alternatives1174);
                    rule__Command__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:583:6: ( ( rule__Command__Group_1__0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:583:6: ( ( rule__Command__Group_1__0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:584:1: ( rule__Command__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getGroup_1()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:585:1: ( rule__Command__Group_1__0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:585:2: rule__Command__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Command__Group_1__0_in_rule__Command__Alternatives1192);
                    rule__Command__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:589:6: ( ( rule__Command__CmdWhileAssignment_2 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:589:6: ( ( rule__Command__CmdWhileAssignment_2 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:590:1: ( rule__Command__CmdWhileAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getCmdWhileAssignment_2()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:591:1: ( rule__Command__CmdWhileAssignment_2 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:591:2: rule__Command__CmdWhileAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Command__CmdWhileAssignment_2_in_rule__Command__Alternatives1210);
                    rule__Command__CmdWhileAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getCmdWhileAssignment_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:595:6: ( ( rule__Command__CmdIfAssignment_3 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:595:6: ( ( rule__Command__CmdIfAssignment_3 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:596:1: ( rule__Command__CmdIfAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getCmdIfAssignment_3()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:597:1: ( rule__Command__CmdIfAssignment_3 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:597:2: rule__Command__CmdIfAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Command__CmdIfAssignment_3_in_rule__Command__Alternatives1228);
                    rule__Command__CmdIfAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getCmdIfAssignment_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:601:6: ( ( rule__Command__CmdForEachAssignment_4 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:601:6: ( ( rule__Command__CmdForEachAssignment_4 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:602:1: ( rule__Command__CmdForEachAssignment_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getCmdForEachAssignment_4()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:603:1: ( rule__Command__CmdForEachAssignment_4 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:603:2: rule__Command__CmdForEachAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Command__CmdForEachAssignment_4_in_rule__Command__Alternatives1246);
                    rule__Command__CmdForEachAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getCmdForEachAssignment_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Alternatives"


    // $ANTLR start "rule__CommandWhile__Alternatives_0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:612:1: rule__CommandWhile__Alternatives_0 : ( ( ( rule__CommandWhile__WAssignment_0_0 ) ) | ( 'for' ) );
    public final void rule__CommandWhile__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:616:1: ( ( ( rule__CommandWhile__WAssignment_0_0 ) ) | ( 'for' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==35) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:617:1: ( ( rule__CommandWhile__WAssignment_0_0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:617:1: ( ( rule__CommandWhile__WAssignment_0_0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:618:1: ( rule__CommandWhile__WAssignment_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandWhileAccess().getWAssignment_0_0()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:619:1: ( rule__CommandWhile__WAssignment_0_0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:619:2: rule__CommandWhile__WAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__CommandWhile__WAssignment_0_0_in_rule__CommandWhile__Alternatives_01279);
                    rule__CommandWhile__WAssignment_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandWhileAccess().getWAssignment_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:623:6: ( 'for' )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:623:6: ( 'for' )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:624:1: 'for'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandWhileAccess().getForKeyword_0_1()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__CommandWhile__Alternatives_01298); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandWhileAccess().getForKeyword_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandWhile__Alternatives_0"


    // $ANTLR start "rule__Expr__Alternatives"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:636:1: rule__Expr__Alternatives : ( ( ( rule__Expr__Group_0__0 ) ) | ( ( rule__Expr__ExprAndAssignment_1 ) ) );
    public final void rule__Expr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:640:1: ( ( ( rule__Expr__Group_0__0 ) ) | ( ( rule__Expr__ExprAndAssignment_1 ) ) )
            int alt5=2;
            switch ( input.LA(1) ) {
            case 36:
                {
                int LA5_1 = input.LA(2);

                if ( (synpred8_InternalWhileCpp()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_VARIABLE:
                {
                int LA5_2 = input.LA(2);

                if ( (synpred8_InternalWhileCpp()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_SYMBOL:
                {
                int LA5_3 = input.LA(2);

                if ( (synpred8_InternalWhileCpp()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;
                }
                }
                break;
            case 31:
                {
                int LA5_4 = input.LA(2);

                if ( (synpred8_InternalWhileCpp()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 4, input);

                    throw nvae;
                }
                }
                break;
            case 43:
                {
                alt5=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:641:1: ( ( rule__Expr__Group_0__0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:641:1: ( ( rule__Expr__Group_0__0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:642:1: ( rule__Expr__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprAccess().getGroup_0()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:643:1: ( rule__Expr__Group_0__0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:643:2: rule__Expr__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Expr__Group_0__0_in_rule__Expr__Alternatives1332);
                    rule__Expr__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:647:6: ( ( rule__Expr__ExprAndAssignment_1 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:647:6: ( ( rule__Expr__ExprAndAssignment_1 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:648:1: ( rule__Expr__ExprAndAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprAccess().getExprAndAssignment_1()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:649:1: ( rule__Expr__ExprAndAssignment_1 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:649:2: rule__Expr__ExprAndAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Expr__ExprAndAssignment_1_in_rule__Expr__Alternatives1350);
                    rule__Expr__ExprAndAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprAccess().getExprAndAssignment_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Alternatives"


    // $ANTLR start "rule__ExprSimple__Alternatives"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:658:1: rule__ExprSimple__Alternatives : ( ( ( rule__ExprSimple__Alternatives_0 ) ) | ( ( rule__ExprSimple__Group_1__0 ) ) | ( ( rule__ExprSimple__Group_2__0 ) ) | ( ( rule__ExprSimple__Group_3__0 ) ) | ( ( rule__ExprSimple__Group_4__0 ) ) | ( ( rule__ExprSimple__Group_5__0 ) ) );
    public final void rule__ExprSimple__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:662:1: ( ( ( rule__ExprSimple__Alternatives_0 ) ) | ( ( rule__ExprSimple__Group_1__0 ) ) | ( ( rule__ExprSimple__Group_2__0 ) ) | ( ( rule__ExprSimple__Group_3__0 ) ) | ( ( rule__ExprSimple__Group_4__0 ) ) | ( ( rule__ExprSimple__Group_5__0 ) ) )
            int alt6=6;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_SYMBOL && LA6_0<=RULE_VARIABLE)||LA6_0==36) ) {
                alt6=1;
            }
            else if ( (LA6_0==31) ) {
                switch ( input.LA(2) ) {
                case RULE_SYMBOL:
                    {
                    alt6=6;
                    }
                    break;
                case 37:
                    {
                    alt6=2;
                    }
                    break;
                case 38:
                    {
                    alt6=3;
                    }
                    break;
                case 39:
                    {
                    alt6=4;
                    }
                    break;
                case 40:
                    {
                    alt6=5;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:663:1: ( ( rule__ExprSimple__Alternatives_0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:663:1: ( ( rule__ExprSimple__Alternatives_0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:664:1: ( rule__ExprSimple__Alternatives_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getAlternatives_0()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:665:1: ( rule__ExprSimple__Alternatives_0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:665:2: rule__ExprSimple__Alternatives_0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__Alternatives_0_in_rule__ExprSimple__Alternatives1383);
                    rule__ExprSimple__Alternatives_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getAlternatives_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:669:6: ( ( rule__ExprSimple__Group_1__0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:669:6: ( ( rule__ExprSimple__Group_1__0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:670:1: ( rule__ExprSimple__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getGroup_1()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:671:1: ( rule__ExprSimple__Group_1__0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:671:2: rule__ExprSimple__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__Group_1__0_in_rule__ExprSimple__Alternatives1401);
                    rule__ExprSimple__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:675:6: ( ( rule__ExprSimple__Group_2__0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:675:6: ( ( rule__ExprSimple__Group_2__0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:676:1: ( rule__ExprSimple__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getGroup_2()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:677:1: ( rule__ExprSimple__Group_2__0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:677:2: rule__ExprSimple__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__Group_2__0_in_rule__ExprSimple__Alternatives1419);
                    rule__ExprSimple__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:681:6: ( ( rule__ExprSimple__Group_3__0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:681:6: ( ( rule__ExprSimple__Group_3__0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:682:1: ( rule__ExprSimple__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getGroup_3()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:683:1: ( rule__ExprSimple__Group_3__0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:683:2: rule__ExprSimple__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__Group_3__0_in_rule__ExprSimple__Alternatives1437);
                    rule__ExprSimple__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:687:6: ( ( rule__ExprSimple__Group_4__0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:687:6: ( ( rule__ExprSimple__Group_4__0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:688:1: ( rule__ExprSimple__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getGroup_4()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:689:1: ( rule__ExprSimple__Group_4__0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:689:2: rule__ExprSimple__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__Group_4__0_in_rule__ExprSimple__Alternatives1455);
                    rule__ExprSimple__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:693:6: ( ( rule__ExprSimple__Group_5__0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:693:6: ( ( rule__ExprSimple__Group_5__0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:694:1: ( rule__ExprSimple__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getGroup_5()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:695:1: ( rule__ExprSimple__Group_5__0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:695:2: rule__ExprSimple__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__Group_5__0_in_rule__ExprSimple__Alternatives1473);
                    rule__ExprSimple__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Alternatives"


    // $ANTLR start "rule__ExprSimple__Alternatives_0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:704:1: rule__ExprSimple__Alternatives_0 : ( ( ( rule__ExprSimple__NilAssignment_0_0 ) ) | ( ( rule__ExprSimple__VariAssignment_0_1 ) ) | ( ( rule__ExprSimple__SymbAssignment_0_2 ) ) );
    public final void rule__ExprSimple__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:708:1: ( ( ( rule__ExprSimple__NilAssignment_0_0 ) ) | ( ( rule__ExprSimple__VariAssignment_0_1 ) ) | ( ( rule__ExprSimple__SymbAssignment_0_2 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt7=1;
                }
                break;
            case RULE_VARIABLE:
                {
                alt7=2;
                }
                break;
            case RULE_SYMBOL:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:709:1: ( ( rule__ExprSimple__NilAssignment_0_0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:709:1: ( ( rule__ExprSimple__NilAssignment_0_0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:710:1: ( rule__ExprSimple__NilAssignment_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getNilAssignment_0_0()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:711:1: ( rule__ExprSimple__NilAssignment_0_0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:711:2: rule__ExprSimple__NilAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__NilAssignment_0_0_in_rule__ExprSimple__Alternatives_01506);
                    rule__ExprSimple__NilAssignment_0_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getNilAssignment_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:715:6: ( ( rule__ExprSimple__VariAssignment_0_1 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:715:6: ( ( rule__ExprSimple__VariAssignment_0_1 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:716:1: ( rule__ExprSimple__VariAssignment_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getVariAssignment_0_1()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:717:1: ( rule__ExprSimple__VariAssignment_0_1 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:717:2: rule__ExprSimple__VariAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__VariAssignment_0_1_in_rule__ExprSimple__Alternatives_01524);
                    rule__ExprSimple__VariAssignment_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getVariAssignment_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:721:6: ( ( rule__ExprSimple__SymbAssignment_0_2 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:721:6: ( ( rule__ExprSimple__SymbAssignment_0_2 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:722:1: ( rule__ExprSimple__SymbAssignment_0_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getSymbAssignment_0_2()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:723:1: ( rule__ExprSimple__SymbAssignment_0_2 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:723:2: rule__ExprSimple__SymbAssignment_0_2
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__SymbAssignment_0_2_in_rule__ExprSimple__Alternatives_01542);
                    rule__ExprSimple__SymbAssignment_0_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getSymbAssignment_0_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Alternatives_0"


    // $ANTLR start "rule__ExprEq__Alternatives"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:732:1: rule__ExprEq__Alternatives : ( ( ( rule__ExprEq__Group_0__0 ) ) | ( ( rule__ExprEq__Group_1__0 ) ) );
    public final void rule__ExprEq__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:736:1: ( ( ( rule__ExprEq__Group_0__0 ) ) | ( ( rule__ExprEq__Group_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==31) ) {
                int LA8_1 = input.LA(2);

                if ( (synpred16_InternalWhileCpp()) ) {
                    alt8=1;
                }
                else if ( (true) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA8_0>=RULE_SYMBOL && LA8_0<=RULE_VARIABLE)||LA8_0==36) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:737:1: ( ( rule__ExprEq__Group_0__0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:737:1: ( ( rule__ExprEq__Group_0__0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:738:1: ( rule__ExprEq__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprEqAccess().getGroup_0()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:739:1: ( rule__ExprEq__Group_0__0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:739:2: rule__ExprEq__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ExprEq__Group_0__0_in_rule__ExprEq__Alternatives1575);
                    rule__ExprEq__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprEqAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:743:6: ( ( rule__ExprEq__Group_1__0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:743:6: ( ( rule__ExprEq__Group_1__0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:744:1: ( rule__ExprEq__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprEqAccess().getGroup_1()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:745:1: ( rule__ExprEq__Group_1__0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:745:2: rule__ExprEq__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ExprEq__Group_1__0_in_rule__ExprEq__Alternatives1593);
                    rule__ExprEq__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprEqAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Alternatives"


    // $ANTLR start "rule__Function__Group__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:756:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:760:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:761:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__01624);
            rule__Function__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__1_in_rule__Function__Group__01627);
            rule__Function__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:768:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:772:1: ( ( 'function' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:773:1: ( 'function' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:773:1: ( 'function' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:774:1: 'function'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            }
            match(input,15,FOLLOW_15_in_rule__Function__Group__0__Impl1655); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:787:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:791:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:792:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__11686);
            rule__Function__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__2_in_rule__Function__Group__11689);
            rule__Function__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:799:1: rule__Function__Group__1__Impl : ( ( rule__Function__NomAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:803:1: ( ( ( rule__Function__NomAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:804:1: ( ( rule__Function__NomAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:804:1: ( ( rule__Function__NomAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:805:1: ( rule__Function__NomAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getNomAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:806:1: ( rule__Function__NomAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:806:2: rule__Function__NomAssignment_1
            {
            pushFollow(FOLLOW_rule__Function__NomAssignment_1_in_rule__Function__Group__1__Impl1716);
            rule__Function__NomAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getNomAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:816:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:820:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:821:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__21746);
            rule__Function__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__3_in_rule__Function__Group__21749);
            rule__Function__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2"


    // $ANTLR start "rule__Function__Group__2__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:828:1: rule__Function__Group__2__Impl : ( ':' ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:832:1: ( ( ':' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:833:1: ( ':' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:833:1: ( ':' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:834:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getColonKeyword_2()); 
            }
            match(input,16,FOLLOW_16_in_rule__Function__Group__2__Impl1777); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getColonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__3"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:847:1: rule__Function__Group__3 : rule__Function__Group__3__Impl ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:851:1: ( rule__Function__Group__3__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:852:2: rule__Function__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__31808);
            rule__Function__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3"


    // $ANTLR start "rule__Function__Group__3__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:858:1: rule__Function__Group__3__Impl : ( ( rule__Function__DefinitionAssignment_3 ) ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:862:1: ( ( ( rule__Function__DefinitionAssignment_3 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:863:1: ( ( rule__Function__DefinitionAssignment_3 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:863:1: ( ( rule__Function__DefinitionAssignment_3 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:864:1: ( rule__Function__DefinitionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getDefinitionAssignment_3()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:865:1: ( rule__Function__DefinitionAssignment_3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:865:2: rule__Function__DefinitionAssignment_3
            {
            pushFollow(FOLLOW_rule__Function__DefinitionAssignment_3_in_rule__Function__Group__3__Impl1835);
            rule__Function__DefinitionAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getDefinitionAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3__Impl"


    // $ANTLR start "rule__Definition__Group__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:883:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:887:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:888:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
            {
            pushFollow(FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__01873);
            rule__Definition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__01876);
            rule__Definition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__0"


    // $ANTLR start "rule__Definition__Group__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:895:1: rule__Definition__Group__0__Impl : ( 'read' ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:899:1: ( ( 'read' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:900:1: ( 'read' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:900:1: ( 'read' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:901:1: 'read'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getReadKeyword_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Definition__Group__0__Impl1904); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getReadKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__0__Impl"


    // $ANTLR start "rule__Definition__Group__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:914:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl rule__Definition__Group__2 ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:918:1: ( rule__Definition__Group__1__Impl rule__Definition__Group__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:919:2: rule__Definition__Group__1__Impl rule__Definition__Group__2
            {
            pushFollow(FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__11935);
            rule__Definition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__11938);
            rule__Definition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__1"


    // $ANTLR start "rule__Definition__Group__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:926:1: rule__Definition__Group__1__Impl : ( ( rule__Definition__InputsAssignment_1 ) ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:930:1: ( ( ( rule__Definition__InputsAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:931:1: ( ( rule__Definition__InputsAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:931:1: ( ( rule__Definition__InputsAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:932:1: ( rule__Definition__InputsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getInputsAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:933:1: ( rule__Definition__InputsAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:933:2: rule__Definition__InputsAssignment_1
            {
            pushFollow(FOLLOW_rule__Definition__InputsAssignment_1_in_rule__Definition__Group__1__Impl1965);
            rule__Definition__InputsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getInputsAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__1__Impl"


    // $ANTLR start "rule__Definition__Group__2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:943:1: rule__Definition__Group__2 : rule__Definition__Group__2__Impl rule__Definition__Group__3 ;
    public final void rule__Definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:947:1: ( rule__Definition__Group__2__Impl rule__Definition__Group__3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:948:2: rule__Definition__Group__2__Impl rule__Definition__Group__3
            {
            pushFollow(FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__21995);
            rule__Definition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definition__Group__3_in_rule__Definition__Group__21998);
            rule__Definition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__2"


    // $ANTLR start "rule__Definition__Group__2__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:955:1: rule__Definition__Group__2__Impl : ( '%' ) ;
    public final void rule__Definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:959:1: ( ( '%' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:960:1: ( '%' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:960:1: ( '%' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:961:1: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getPercentSignKeyword_2()); 
            }
            match(input,18,FOLLOW_18_in_rule__Definition__Group__2__Impl2026); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getPercentSignKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__2__Impl"


    // $ANTLR start "rule__Definition__Group__3"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:974:1: rule__Definition__Group__3 : rule__Definition__Group__3__Impl rule__Definition__Group__4 ;
    public final void rule__Definition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:978:1: ( rule__Definition__Group__3__Impl rule__Definition__Group__4 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:979:2: rule__Definition__Group__3__Impl rule__Definition__Group__4
            {
            pushFollow(FOLLOW_rule__Definition__Group__3__Impl_in_rule__Definition__Group__32057);
            rule__Definition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definition__Group__4_in_rule__Definition__Group__32060);
            rule__Definition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__3"


    // $ANTLR start "rule__Definition__Group__3__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:986:1: rule__Definition__Group__3__Impl : ( ( rule__Definition__CommandesAssignment_3 ) ) ;
    public final void rule__Definition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:990:1: ( ( ( rule__Definition__CommandesAssignment_3 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:991:1: ( ( rule__Definition__CommandesAssignment_3 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:991:1: ( ( rule__Definition__CommandesAssignment_3 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:992:1: ( rule__Definition__CommandesAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getCommandesAssignment_3()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:993:1: ( rule__Definition__CommandesAssignment_3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:993:2: rule__Definition__CommandesAssignment_3
            {
            pushFollow(FOLLOW_rule__Definition__CommandesAssignment_3_in_rule__Definition__Group__3__Impl2087);
            rule__Definition__CommandesAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getCommandesAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__3__Impl"


    // $ANTLR start "rule__Definition__Group__4"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1003:1: rule__Definition__Group__4 : rule__Definition__Group__4__Impl rule__Definition__Group__5 ;
    public final void rule__Definition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1007:1: ( rule__Definition__Group__4__Impl rule__Definition__Group__5 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1008:2: rule__Definition__Group__4__Impl rule__Definition__Group__5
            {
            pushFollow(FOLLOW_rule__Definition__Group__4__Impl_in_rule__Definition__Group__42117);
            rule__Definition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definition__Group__5_in_rule__Definition__Group__42120);
            rule__Definition__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__4"


    // $ANTLR start "rule__Definition__Group__4__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1015:1: rule__Definition__Group__4__Impl : ( '%' ) ;
    public final void rule__Definition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1019:1: ( ( '%' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1020:1: ( '%' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1020:1: ( '%' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1021:1: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getPercentSignKeyword_4()); 
            }
            match(input,18,FOLLOW_18_in_rule__Definition__Group__4__Impl2148); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getPercentSignKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__4__Impl"


    // $ANTLR start "rule__Definition__Group__5"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1034:1: rule__Definition__Group__5 : rule__Definition__Group__5__Impl rule__Definition__Group__6 ;
    public final void rule__Definition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1038:1: ( rule__Definition__Group__5__Impl rule__Definition__Group__6 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1039:2: rule__Definition__Group__5__Impl rule__Definition__Group__6
            {
            pushFollow(FOLLOW_rule__Definition__Group__5__Impl_in_rule__Definition__Group__52179);
            rule__Definition__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definition__Group__6_in_rule__Definition__Group__52182);
            rule__Definition__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__5"


    // $ANTLR start "rule__Definition__Group__5__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1046:1: rule__Definition__Group__5__Impl : ( 'write' ) ;
    public final void rule__Definition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1050:1: ( ( 'write' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1051:1: ( 'write' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1051:1: ( 'write' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1052:1: 'write'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getWriteKeyword_5()); 
            }
            match(input,19,FOLLOW_19_in_rule__Definition__Group__5__Impl2210); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getWriteKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__5__Impl"


    // $ANTLR start "rule__Definition__Group__6"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1065:1: rule__Definition__Group__6 : rule__Definition__Group__6__Impl ;
    public final void rule__Definition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1069:1: ( rule__Definition__Group__6__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1070:2: rule__Definition__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group__6__Impl_in_rule__Definition__Group__62241);
            rule__Definition__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__6"


    // $ANTLR start "rule__Definition__Group__6__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1076:1: rule__Definition__Group__6__Impl : ( ( rule__Definition__OutputsAssignment_6 ) ) ;
    public final void rule__Definition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1080:1: ( ( ( rule__Definition__OutputsAssignment_6 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1081:1: ( ( rule__Definition__OutputsAssignment_6 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1081:1: ( ( rule__Definition__OutputsAssignment_6 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1082:1: ( rule__Definition__OutputsAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getOutputsAssignment_6()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1083:1: ( rule__Definition__OutputsAssignment_6 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1083:2: rule__Definition__OutputsAssignment_6
            {
            pushFollow(FOLLOW_rule__Definition__OutputsAssignment_6_in_rule__Definition__Group__6__Impl2268);
            rule__Definition__OutputsAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getOutputsAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__6__Impl"


    // $ANTLR start "rule__Input__Group__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1107:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1111:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1112:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__02312);
            rule__Input__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group__1_in_rule__Input__Group__02315);
            rule__Input__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0"


    // $ANTLR start "rule__Input__Group__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1119:1: rule__Input__Group__0__Impl : ( ( rule__Input__Group_0__0 )* ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1123:1: ( ( ( rule__Input__Group_0__0 )* ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1124:1: ( ( rule__Input__Group_0__0 )* )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1124:1: ( ( rule__Input__Group_0__0 )* )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1125:1: ( rule__Input__Group_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getGroup_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1126:1: ( rule__Input__Group_0__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_VARIABLE) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==20) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1126:2: rule__Input__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__Input__Group_0__0_in_rule__Input__Group__0__Impl2342);
            	    rule__Input__Group_0__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0__Impl"


    // $ANTLR start "rule__Input__Group__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1136:1: rule__Input__Group__1 : rule__Input__Group__1__Impl ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1140:1: ( rule__Input__Group__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1141:2: rule__Input__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__12373);
            rule__Input__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1"


    // $ANTLR start "rule__Input__Group__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1147:1: rule__Input__Group__1__Impl : ( ( rule__Input__VarInAssignment_1 ) ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1151:1: ( ( ( rule__Input__VarInAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1152:1: ( ( rule__Input__VarInAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1152:1: ( ( rule__Input__VarInAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1153:1: ( rule__Input__VarInAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVarInAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1154:1: ( rule__Input__VarInAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1154:2: rule__Input__VarInAssignment_1
            {
            pushFollow(FOLLOW_rule__Input__VarInAssignment_1_in_rule__Input__Group__1__Impl2400);
            rule__Input__VarInAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getVarInAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1__Impl"


    // $ANTLR start "rule__Input__Group_0__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1168:1: rule__Input__Group_0__0 : rule__Input__Group_0__0__Impl rule__Input__Group_0__1 ;
    public final void rule__Input__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1172:1: ( rule__Input__Group_0__0__Impl rule__Input__Group_0__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1173:2: rule__Input__Group_0__0__Impl rule__Input__Group_0__1
            {
            pushFollow(FOLLOW_rule__Input__Group_0__0__Impl_in_rule__Input__Group_0__02434);
            rule__Input__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group_0__1_in_rule__Input__Group_0__02437);
            rule__Input__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_0__0"


    // $ANTLR start "rule__Input__Group_0__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1180:1: rule__Input__Group_0__0__Impl : ( ( rule__Input__VarInAssignment_0_0 ) ) ;
    public final void rule__Input__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1184:1: ( ( ( rule__Input__VarInAssignment_0_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1185:1: ( ( rule__Input__VarInAssignment_0_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1185:1: ( ( rule__Input__VarInAssignment_0_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1186:1: ( rule__Input__VarInAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVarInAssignment_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1187:1: ( rule__Input__VarInAssignment_0_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1187:2: rule__Input__VarInAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Input__VarInAssignment_0_0_in_rule__Input__Group_0__0__Impl2464);
            rule__Input__VarInAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getVarInAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_0__0__Impl"


    // $ANTLR start "rule__Input__Group_0__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1197:1: rule__Input__Group_0__1 : rule__Input__Group_0__1__Impl ;
    public final void rule__Input__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1201:1: ( rule__Input__Group_0__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1202:2: rule__Input__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group_0__1__Impl_in_rule__Input__Group_0__12494);
            rule__Input__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_0__1"


    // $ANTLR start "rule__Input__Group_0__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1208:1: rule__Input__Group_0__1__Impl : ( ',' ) ;
    public final void rule__Input__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1212:1: ( ( ',' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1213:1: ( ',' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1213:1: ( ',' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1214:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getCommaKeyword_0_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__Input__Group_0__1__Impl2522); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getCommaKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_0__1__Impl"


    // $ANTLR start "rule__Output__Group__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1231:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1235:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1236:2: rule__Output__Group__0__Impl rule__Output__Group__1
            {
            pushFollow(FOLLOW_rule__Output__Group__0__Impl_in_rule__Output__Group__02557);
            rule__Output__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Output__Group__1_in_rule__Output__Group__02560);
            rule__Output__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__0"


    // $ANTLR start "rule__Output__Group__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1243:1: rule__Output__Group__0__Impl : ( ( rule__Output__Group_0__0 )* ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1247:1: ( ( ( rule__Output__Group_0__0 )* ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1248:1: ( ( rule__Output__Group_0__0 )* )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1248:1: ( ( rule__Output__Group_0__0 )* )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1249:1: ( rule__Output__Group_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getGroup_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1250:1: ( rule__Output__Group_0__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_VARIABLE) ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1==20) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1250:2: rule__Output__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__Output__Group_0__0_in_rule__Output__Group__0__Impl2587);
            	    rule__Output__Group_0__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__0__Impl"


    // $ANTLR start "rule__Output__Group__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1260:1: rule__Output__Group__1 : rule__Output__Group__1__Impl ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1264:1: ( rule__Output__Group__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1265:2: rule__Output__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Output__Group__1__Impl_in_rule__Output__Group__12618);
            rule__Output__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__1"


    // $ANTLR start "rule__Output__Group__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1271:1: rule__Output__Group__1__Impl : ( ( rule__Output__VarOutAssignment_1 ) ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1275:1: ( ( ( rule__Output__VarOutAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1276:1: ( ( rule__Output__VarOutAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1276:1: ( ( rule__Output__VarOutAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1277:1: ( rule__Output__VarOutAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVarOutAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1278:1: ( rule__Output__VarOutAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1278:2: rule__Output__VarOutAssignment_1
            {
            pushFollow(FOLLOW_rule__Output__VarOutAssignment_1_in_rule__Output__Group__1__Impl2645);
            rule__Output__VarOutAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getVarOutAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__1__Impl"


    // $ANTLR start "rule__Output__Group_0__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1292:1: rule__Output__Group_0__0 : rule__Output__Group_0__0__Impl rule__Output__Group_0__1 ;
    public final void rule__Output__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1296:1: ( rule__Output__Group_0__0__Impl rule__Output__Group_0__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1297:2: rule__Output__Group_0__0__Impl rule__Output__Group_0__1
            {
            pushFollow(FOLLOW_rule__Output__Group_0__0__Impl_in_rule__Output__Group_0__02679);
            rule__Output__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Output__Group_0__1_in_rule__Output__Group_0__02682);
            rule__Output__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_0__0"


    // $ANTLR start "rule__Output__Group_0__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1304:1: rule__Output__Group_0__0__Impl : ( ( rule__Output__VarOutAssignment_0_0 ) ) ;
    public final void rule__Output__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1308:1: ( ( ( rule__Output__VarOutAssignment_0_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1309:1: ( ( rule__Output__VarOutAssignment_0_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1309:1: ( ( rule__Output__VarOutAssignment_0_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1310:1: ( rule__Output__VarOutAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVarOutAssignment_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1311:1: ( rule__Output__VarOutAssignment_0_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1311:2: rule__Output__VarOutAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Output__VarOutAssignment_0_0_in_rule__Output__Group_0__0__Impl2709);
            rule__Output__VarOutAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getVarOutAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_0__0__Impl"


    // $ANTLR start "rule__Output__Group_0__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1321:1: rule__Output__Group_0__1 : rule__Output__Group_0__1__Impl ;
    public final void rule__Output__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1325:1: ( rule__Output__Group_0__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1326:2: rule__Output__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Output__Group_0__1__Impl_in_rule__Output__Group_0__12739);
            rule__Output__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_0__1"


    // $ANTLR start "rule__Output__Group_0__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1332:1: rule__Output__Group_0__1__Impl : ( ',' ) ;
    public final void rule__Output__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1336:1: ( ( ',' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1337:1: ( ',' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1337:1: ( ',' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1338:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getCommaKeyword_0_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__Output__Group_0__1__Impl2767); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getCommaKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_0__1__Impl"


    // $ANTLR start "rule__Vars__Group__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1355:1: rule__Vars__Group__0 : rule__Vars__Group__0__Impl rule__Vars__Group__1 ;
    public final void rule__Vars__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1359:1: ( rule__Vars__Group__0__Impl rule__Vars__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1360:2: rule__Vars__Group__0__Impl rule__Vars__Group__1
            {
            pushFollow(FOLLOW_rule__Vars__Group__0__Impl_in_rule__Vars__Group__02802);
            rule__Vars__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Vars__Group__1_in_rule__Vars__Group__02805);
            rule__Vars__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group__0"


    // $ANTLR start "rule__Vars__Group__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1367:1: rule__Vars__Group__0__Impl : ( ( rule__Vars__Group_0__0 )* ) ;
    public final void rule__Vars__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1371:1: ( ( ( rule__Vars__Group_0__0 )* ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1372:1: ( ( rule__Vars__Group_0__0 )* )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1372:1: ( ( rule__Vars__Group_0__0 )* )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1373:1: ( rule__Vars__Group_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getGroup_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1374:1: ( rule__Vars__Group_0__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_VARIABLE) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==20) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1374:2: rule__Vars__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__Vars__Group_0__0_in_rule__Vars__Group__0__Impl2832);
            	    rule__Vars__Group_0__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group__0__Impl"


    // $ANTLR start "rule__Vars__Group__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1384:1: rule__Vars__Group__1 : rule__Vars__Group__1__Impl ;
    public final void rule__Vars__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1388:1: ( rule__Vars__Group__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1389:2: rule__Vars__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Vars__Group__1__Impl_in_rule__Vars__Group__12863);
            rule__Vars__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group__1"


    // $ANTLR start "rule__Vars__Group__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1395:1: rule__Vars__Group__1__Impl : ( ( rule__Vars__VarGenAssignment_1 ) ) ;
    public final void rule__Vars__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1399:1: ( ( ( rule__Vars__VarGenAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1400:1: ( ( rule__Vars__VarGenAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1400:1: ( ( rule__Vars__VarGenAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1401:1: ( rule__Vars__VarGenAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getVarGenAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1402:1: ( rule__Vars__VarGenAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1402:2: rule__Vars__VarGenAssignment_1
            {
            pushFollow(FOLLOW_rule__Vars__VarGenAssignment_1_in_rule__Vars__Group__1__Impl2890);
            rule__Vars__VarGenAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getVarGenAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group__1__Impl"


    // $ANTLR start "rule__Vars__Group_0__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1416:1: rule__Vars__Group_0__0 : rule__Vars__Group_0__0__Impl rule__Vars__Group_0__1 ;
    public final void rule__Vars__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1420:1: ( rule__Vars__Group_0__0__Impl rule__Vars__Group_0__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1421:2: rule__Vars__Group_0__0__Impl rule__Vars__Group_0__1
            {
            pushFollow(FOLLOW_rule__Vars__Group_0__0__Impl_in_rule__Vars__Group_0__02924);
            rule__Vars__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Vars__Group_0__1_in_rule__Vars__Group_0__02927);
            rule__Vars__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group_0__0"


    // $ANTLR start "rule__Vars__Group_0__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1428:1: rule__Vars__Group_0__0__Impl : ( ( rule__Vars__VarGenAssignment_0_0 ) ) ;
    public final void rule__Vars__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1432:1: ( ( ( rule__Vars__VarGenAssignment_0_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1433:1: ( ( rule__Vars__VarGenAssignment_0_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1433:1: ( ( rule__Vars__VarGenAssignment_0_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1434:1: ( rule__Vars__VarGenAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getVarGenAssignment_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1435:1: ( rule__Vars__VarGenAssignment_0_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1435:2: rule__Vars__VarGenAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Vars__VarGenAssignment_0_0_in_rule__Vars__Group_0__0__Impl2954);
            rule__Vars__VarGenAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getVarGenAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group_0__0__Impl"


    // $ANTLR start "rule__Vars__Group_0__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1445:1: rule__Vars__Group_0__1 : rule__Vars__Group_0__1__Impl ;
    public final void rule__Vars__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1449:1: ( rule__Vars__Group_0__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1450:2: rule__Vars__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Vars__Group_0__1__Impl_in_rule__Vars__Group_0__12984);
            rule__Vars__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group_0__1"


    // $ANTLR start "rule__Vars__Group_0__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1456:1: rule__Vars__Group_0__1__Impl : ( ',' ) ;
    public final void rule__Vars__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1460:1: ( ( ',' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1461:1: ( ',' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1461:1: ( ',' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1462:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getCommaKeyword_0_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__Vars__Group_0__1__Impl3012); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getCommaKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group_0__1__Impl"


    // $ANTLR start "rule__Command__Group_0__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1479:1: rule__Command__Group_0__0 : rule__Command__Group_0__0__Impl rule__Command__Group_0__1 ;
    public final void rule__Command__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1483:1: ( rule__Command__Group_0__0__Impl rule__Command__Group_0__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1484:2: rule__Command__Group_0__0__Impl rule__Command__Group_0__1
            {
            pushFollow(FOLLOW_rule__Command__Group_0__0__Impl_in_rule__Command__Group_0__03047);
            rule__Command__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_0__1_in_rule__Command__Group_0__03050);
            rule__Command__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_0__0"


    // $ANTLR start "rule__Command__Group_0__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1491:1: rule__Command__Group_0__0__Impl : ( ( rule__Command__NopAssignment_0_0 ) ) ;
    public final void rule__Command__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1495:1: ( ( ( rule__Command__NopAssignment_0_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1496:1: ( ( rule__Command__NopAssignment_0_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1496:1: ( ( rule__Command__NopAssignment_0_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1497:1: ( rule__Command__NopAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNopAssignment_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1498:1: ( rule__Command__NopAssignment_0_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1498:2: rule__Command__NopAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Command__NopAssignment_0_0_in_rule__Command__Group_0__0__Impl3077);
            rule__Command__NopAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getNopAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_0__0__Impl"


    // $ANTLR start "rule__Command__Group_0__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1508:1: rule__Command__Group_0__1 : rule__Command__Group_0__1__Impl ;
    public final void rule__Command__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1512:1: ( rule__Command__Group_0__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1513:2: rule__Command__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_0__1__Impl_in_rule__Command__Group_0__13107);
            rule__Command__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_0__1"


    // $ANTLR start "rule__Command__Group_0__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1519:1: rule__Command__Group_0__1__Impl : ( ';' ) ;
    public final void rule__Command__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1523:1: ( ( ';' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1524:1: ( ';' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1524:1: ( ';' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1525:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getSemicolonKeyword_0_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__Command__Group_0__1__Impl3135); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getSemicolonKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_0__1__Impl"


    // $ANTLR start "rule__Command__Group_1__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1542:1: rule__Command__Group_1__0 : rule__Command__Group_1__0__Impl rule__Command__Group_1__1 ;
    public final void rule__Command__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1546:1: ( rule__Command__Group_1__0__Impl rule__Command__Group_1__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1547:2: rule__Command__Group_1__0__Impl rule__Command__Group_1__1
            {
            pushFollow(FOLLOW_rule__Command__Group_1__0__Impl_in_rule__Command__Group_1__03170);
            rule__Command__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_1__1_in_rule__Command__Group_1__03173);
            rule__Command__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_1__0"


    // $ANTLR start "rule__Command__Group_1__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1554:1: rule__Command__Group_1__0__Impl : ( ( rule__Command__VarsAssignment_1_0 ) ) ;
    public final void rule__Command__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1558:1: ( ( ( rule__Command__VarsAssignment_1_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1559:1: ( ( rule__Command__VarsAssignment_1_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1559:1: ( ( rule__Command__VarsAssignment_1_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1560:1: ( rule__Command__VarsAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getVarsAssignment_1_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1561:1: ( rule__Command__VarsAssignment_1_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1561:2: rule__Command__VarsAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Command__VarsAssignment_1_0_in_rule__Command__Group_1__0__Impl3200);
            rule__Command__VarsAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getVarsAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_1__0__Impl"


    // $ANTLR start "rule__Command__Group_1__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1571:1: rule__Command__Group_1__1 : rule__Command__Group_1__1__Impl rule__Command__Group_1__2 ;
    public final void rule__Command__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1575:1: ( rule__Command__Group_1__1__Impl rule__Command__Group_1__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1576:2: rule__Command__Group_1__1__Impl rule__Command__Group_1__2
            {
            pushFollow(FOLLOW_rule__Command__Group_1__1__Impl_in_rule__Command__Group_1__13230);
            rule__Command__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_1__2_in_rule__Command__Group_1__13233);
            rule__Command__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_1__1"


    // $ANTLR start "rule__Command__Group_1__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1583:1: rule__Command__Group_1__1__Impl : ( ':=' ) ;
    public final void rule__Command__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1587:1: ( ( ':=' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1588:1: ( ':=' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1588:1: ( ':=' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1589:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getColonEqualsSignKeyword_1_1()); 
            }
            match(input,22,FOLLOW_22_in_rule__Command__Group_1__1__Impl3261); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getColonEqualsSignKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_1__1__Impl"


    // $ANTLR start "rule__Command__Group_1__2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1602:1: rule__Command__Group_1__2 : rule__Command__Group_1__2__Impl rule__Command__Group_1__3 ;
    public final void rule__Command__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1606:1: ( rule__Command__Group_1__2__Impl rule__Command__Group_1__3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1607:2: rule__Command__Group_1__2__Impl rule__Command__Group_1__3
            {
            pushFollow(FOLLOW_rule__Command__Group_1__2__Impl_in_rule__Command__Group_1__23292);
            rule__Command__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_1__3_in_rule__Command__Group_1__23295);
            rule__Command__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_1__2"


    // $ANTLR start "rule__Command__Group_1__2__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1614:1: rule__Command__Group_1__2__Impl : ( ( rule__Command__ExprsAssignment_1_2 ) ) ;
    public final void rule__Command__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1618:1: ( ( ( rule__Command__ExprsAssignment_1_2 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1619:1: ( ( rule__Command__ExprsAssignment_1_2 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1619:1: ( ( rule__Command__ExprsAssignment_1_2 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1620:1: ( rule__Command__ExprsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExprsAssignment_1_2()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1621:1: ( rule__Command__ExprsAssignment_1_2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1621:2: rule__Command__ExprsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Command__ExprsAssignment_1_2_in_rule__Command__Group_1__2__Impl3322);
            rule__Command__ExprsAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getExprsAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_1__2__Impl"


    // $ANTLR start "rule__Command__Group_1__3"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1631:1: rule__Command__Group_1__3 : rule__Command__Group_1__3__Impl ;
    public final void rule__Command__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1635:1: ( rule__Command__Group_1__3__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1636:2: rule__Command__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_1__3__Impl_in_rule__Command__Group_1__33352);
            rule__Command__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_1__3"


    // $ANTLR start "rule__Command__Group_1__3__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1642:1: rule__Command__Group_1__3__Impl : ( ';' ) ;
    public final void rule__Command__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1646:1: ( ( ';' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1647:1: ( ';' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1647:1: ( ';' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1648:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getSemicolonKeyword_1_3()); 
            }
            match(input,21,FOLLOW_21_in_rule__Command__Group_1__3__Impl3380); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getSemicolonKeyword_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_1__3__Impl"


    // $ANTLR start "rule__CommandWhile__Group__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1669:1: rule__CommandWhile__Group__0 : rule__CommandWhile__Group__0__Impl rule__CommandWhile__Group__1 ;
    public final void rule__CommandWhile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1673:1: ( rule__CommandWhile__Group__0__Impl rule__CommandWhile__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1674:2: rule__CommandWhile__Group__0__Impl rule__CommandWhile__Group__1
            {
            pushFollow(FOLLOW_rule__CommandWhile__Group__0__Impl_in_rule__CommandWhile__Group__03419);
            rule__CommandWhile__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandWhile__Group__1_in_rule__CommandWhile__Group__03422);
            rule__CommandWhile__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandWhile__Group__0"


    // $ANTLR start "rule__CommandWhile__Group__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1681:1: rule__CommandWhile__Group__0__Impl : ( ( rule__CommandWhile__Alternatives_0 ) ) ;
    public final void rule__CommandWhile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1685:1: ( ( ( rule__CommandWhile__Alternatives_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1686:1: ( ( rule__CommandWhile__Alternatives_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1686:1: ( ( rule__CommandWhile__Alternatives_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1687:1: ( rule__CommandWhile__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandWhileAccess().getAlternatives_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1688:1: ( rule__CommandWhile__Alternatives_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1688:2: rule__CommandWhile__Alternatives_0
            {
            pushFollow(FOLLOW_rule__CommandWhile__Alternatives_0_in_rule__CommandWhile__Group__0__Impl3449);
            rule__CommandWhile__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandWhileAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandWhile__Group__0__Impl"


    // $ANTLR start "rule__CommandWhile__Group__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1698:1: rule__CommandWhile__Group__1 : rule__CommandWhile__Group__1__Impl rule__CommandWhile__Group__2 ;
    public final void rule__CommandWhile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1702:1: ( rule__CommandWhile__Group__1__Impl rule__CommandWhile__Group__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1703:2: rule__CommandWhile__Group__1__Impl rule__CommandWhile__Group__2
            {
            pushFollow(FOLLOW_rule__CommandWhile__Group__1__Impl_in_rule__CommandWhile__Group__13479);
            rule__CommandWhile__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandWhile__Group__2_in_rule__CommandWhile__Group__13482);
            rule__CommandWhile__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandWhile__Group__1"


    // $ANTLR start "rule__CommandWhile__Group__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1710:1: rule__CommandWhile__Group__1__Impl : ( ( rule__CommandWhile__ExprAssignment_1 ) ) ;
    public final void rule__CommandWhile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1714:1: ( ( ( rule__CommandWhile__ExprAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1715:1: ( ( rule__CommandWhile__ExprAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1715:1: ( ( rule__CommandWhile__ExprAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1716:1: ( rule__CommandWhile__ExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandWhileAccess().getExprAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1717:1: ( rule__CommandWhile__ExprAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1717:2: rule__CommandWhile__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__CommandWhile__ExprAssignment_1_in_rule__CommandWhile__Group__1__Impl3509);
            rule__CommandWhile__ExprAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandWhileAccess().getExprAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandWhile__Group__1__Impl"


    // $ANTLR start "rule__CommandWhile__Group__2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1727:1: rule__CommandWhile__Group__2 : rule__CommandWhile__Group__2__Impl rule__CommandWhile__Group__3 ;
    public final void rule__CommandWhile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1731:1: ( rule__CommandWhile__Group__2__Impl rule__CommandWhile__Group__3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1732:2: rule__CommandWhile__Group__2__Impl rule__CommandWhile__Group__3
            {
            pushFollow(FOLLOW_rule__CommandWhile__Group__2__Impl_in_rule__CommandWhile__Group__23539);
            rule__CommandWhile__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandWhile__Group__3_in_rule__CommandWhile__Group__23542);
            rule__CommandWhile__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandWhile__Group__2"


    // $ANTLR start "rule__CommandWhile__Group__2__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1739:1: rule__CommandWhile__Group__2__Impl : ( 'do' ) ;
    public final void rule__CommandWhile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1743:1: ( ( 'do' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1744:1: ( 'do' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1744:1: ( 'do' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1745:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandWhileAccess().getDoKeyword_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__CommandWhile__Group__2__Impl3570); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandWhileAccess().getDoKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandWhile__Group__2__Impl"


    // $ANTLR start "rule__CommandWhile__Group__3"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1758:1: rule__CommandWhile__Group__3 : rule__CommandWhile__Group__3__Impl rule__CommandWhile__Group__4 ;
    public final void rule__CommandWhile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1762:1: ( rule__CommandWhile__Group__3__Impl rule__CommandWhile__Group__4 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1763:2: rule__CommandWhile__Group__3__Impl rule__CommandWhile__Group__4
            {
            pushFollow(FOLLOW_rule__CommandWhile__Group__3__Impl_in_rule__CommandWhile__Group__33601);
            rule__CommandWhile__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandWhile__Group__4_in_rule__CommandWhile__Group__33604);
            rule__CommandWhile__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandWhile__Group__3"


    // $ANTLR start "rule__CommandWhile__Group__3__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1770:1: rule__CommandWhile__Group__3__Impl : ( ( rule__CommandWhile__CmdsAssignment_3 ) ) ;
    public final void rule__CommandWhile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1774:1: ( ( ( rule__CommandWhile__CmdsAssignment_3 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1775:1: ( ( rule__CommandWhile__CmdsAssignment_3 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1775:1: ( ( rule__CommandWhile__CmdsAssignment_3 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1776:1: ( rule__CommandWhile__CmdsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandWhileAccess().getCmdsAssignment_3()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1777:1: ( rule__CommandWhile__CmdsAssignment_3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1777:2: rule__CommandWhile__CmdsAssignment_3
            {
            pushFollow(FOLLOW_rule__CommandWhile__CmdsAssignment_3_in_rule__CommandWhile__Group__3__Impl3631);
            rule__CommandWhile__CmdsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandWhileAccess().getCmdsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandWhile__Group__3__Impl"


    // $ANTLR start "rule__CommandWhile__Group__4"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1787:1: rule__CommandWhile__Group__4 : rule__CommandWhile__Group__4__Impl ;
    public final void rule__CommandWhile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1791:1: ( rule__CommandWhile__Group__4__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1792:2: rule__CommandWhile__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__CommandWhile__Group__4__Impl_in_rule__CommandWhile__Group__43661);
            rule__CommandWhile__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandWhile__Group__4"


    // $ANTLR start "rule__CommandWhile__Group__4__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1798:1: rule__CommandWhile__Group__4__Impl : ( 'od' ) ;
    public final void rule__CommandWhile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1802:1: ( ( 'od' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1803:1: ( 'od' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1803:1: ( 'od' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1804:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandWhileAccess().getOdKeyword_4()); 
            }
            match(input,24,FOLLOW_24_in_rule__CommandWhile__Group__4__Impl3689); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandWhileAccess().getOdKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandWhile__Group__4__Impl"


    // $ANTLR start "rule__CommandIf__Group__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1827:1: rule__CommandIf__Group__0 : rule__CommandIf__Group__0__Impl rule__CommandIf__Group__1 ;
    public final void rule__CommandIf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1831:1: ( rule__CommandIf__Group__0__Impl rule__CommandIf__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1832:2: rule__CommandIf__Group__0__Impl rule__CommandIf__Group__1
            {
            pushFollow(FOLLOW_rule__CommandIf__Group__0__Impl_in_rule__CommandIf__Group__03730);
            rule__CommandIf__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandIf__Group__1_in_rule__CommandIf__Group__03733);
            rule__CommandIf__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandIf__Group__0"


    // $ANTLR start "rule__CommandIf__Group__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1839:1: rule__CommandIf__Group__0__Impl : ( 'if' ) ;
    public final void rule__CommandIf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1843:1: ( ( 'if' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1844:1: ( 'if' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1844:1: ( 'if' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1845:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getIfKeyword_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__CommandIf__Group__0__Impl3761); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandIfAccess().getIfKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandIf__Group__0__Impl"


    // $ANTLR start "rule__CommandIf__Group__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1858:1: rule__CommandIf__Group__1 : rule__CommandIf__Group__1__Impl rule__CommandIf__Group__2 ;
    public final void rule__CommandIf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1862:1: ( rule__CommandIf__Group__1__Impl rule__CommandIf__Group__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1863:2: rule__CommandIf__Group__1__Impl rule__CommandIf__Group__2
            {
            pushFollow(FOLLOW_rule__CommandIf__Group__1__Impl_in_rule__CommandIf__Group__13792);
            rule__CommandIf__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandIf__Group__2_in_rule__CommandIf__Group__13795);
            rule__CommandIf__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandIf__Group__1"


    // $ANTLR start "rule__CommandIf__Group__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1870:1: rule__CommandIf__Group__1__Impl : ( ( rule__CommandIf__CondAssignment_1 ) ) ;
    public final void rule__CommandIf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1874:1: ( ( ( rule__CommandIf__CondAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1875:1: ( ( rule__CommandIf__CondAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1875:1: ( ( rule__CommandIf__CondAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1876:1: ( rule__CommandIf__CondAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getCondAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1877:1: ( rule__CommandIf__CondAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1877:2: rule__CommandIf__CondAssignment_1
            {
            pushFollow(FOLLOW_rule__CommandIf__CondAssignment_1_in_rule__CommandIf__Group__1__Impl3822);
            rule__CommandIf__CondAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandIfAccess().getCondAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandIf__Group__1__Impl"


    // $ANTLR start "rule__CommandIf__Group__2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1887:1: rule__CommandIf__Group__2 : rule__CommandIf__Group__2__Impl rule__CommandIf__Group__3 ;
    public final void rule__CommandIf__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1891:1: ( rule__CommandIf__Group__2__Impl rule__CommandIf__Group__3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1892:2: rule__CommandIf__Group__2__Impl rule__CommandIf__Group__3
            {
            pushFollow(FOLLOW_rule__CommandIf__Group__2__Impl_in_rule__CommandIf__Group__23852);
            rule__CommandIf__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandIf__Group__3_in_rule__CommandIf__Group__23855);
            rule__CommandIf__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandIf__Group__2"


    // $ANTLR start "rule__CommandIf__Group__2__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1899:1: rule__CommandIf__Group__2__Impl : ( 'then' ) ;
    public final void rule__CommandIf__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1903:1: ( ( 'then' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1904:1: ( 'then' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1904:1: ( 'then' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1905:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getThenKeyword_2()); 
            }
            match(input,26,FOLLOW_26_in_rule__CommandIf__Group__2__Impl3883); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandIfAccess().getThenKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandIf__Group__2__Impl"


    // $ANTLR start "rule__CommandIf__Group__3"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1918:1: rule__CommandIf__Group__3 : rule__CommandIf__Group__3__Impl rule__CommandIf__Group__4 ;
    public final void rule__CommandIf__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1922:1: ( rule__CommandIf__Group__3__Impl rule__CommandIf__Group__4 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1923:2: rule__CommandIf__Group__3__Impl rule__CommandIf__Group__4
            {
            pushFollow(FOLLOW_rule__CommandIf__Group__3__Impl_in_rule__CommandIf__Group__33914);
            rule__CommandIf__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandIf__Group__4_in_rule__CommandIf__Group__33917);
            rule__CommandIf__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandIf__Group__3"


    // $ANTLR start "rule__CommandIf__Group__3__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1930:1: rule__CommandIf__Group__3__Impl : ( ( rule__CommandIf__CmdsThenAssignment_3 ) ) ;
    public final void rule__CommandIf__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1934:1: ( ( ( rule__CommandIf__CmdsThenAssignment_3 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1935:1: ( ( rule__CommandIf__CmdsThenAssignment_3 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1935:1: ( ( rule__CommandIf__CmdsThenAssignment_3 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1936:1: ( rule__CommandIf__CmdsThenAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getCmdsThenAssignment_3()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1937:1: ( rule__CommandIf__CmdsThenAssignment_3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1937:2: rule__CommandIf__CmdsThenAssignment_3
            {
            pushFollow(FOLLOW_rule__CommandIf__CmdsThenAssignment_3_in_rule__CommandIf__Group__3__Impl3944);
            rule__CommandIf__CmdsThenAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandIfAccess().getCmdsThenAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandIf__Group__3__Impl"


    // $ANTLR start "rule__CommandIf__Group__4"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1947:1: rule__CommandIf__Group__4 : rule__CommandIf__Group__4__Impl rule__CommandIf__Group__5 ;
    public final void rule__CommandIf__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1951:1: ( rule__CommandIf__Group__4__Impl rule__CommandIf__Group__5 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1952:2: rule__CommandIf__Group__4__Impl rule__CommandIf__Group__5
            {
            pushFollow(FOLLOW_rule__CommandIf__Group__4__Impl_in_rule__CommandIf__Group__43974);
            rule__CommandIf__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandIf__Group__5_in_rule__CommandIf__Group__43977);
            rule__CommandIf__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandIf__Group__4"


    // $ANTLR start "rule__CommandIf__Group__4__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1959:1: rule__CommandIf__Group__4__Impl : ( ( rule__CommandIf__Group_4__0 )? ) ;
    public final void rule__CommandIf__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1963:1: ( ( ( rule__CommandIf__Group_4__0 )? ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1964:1: ( ( rule__CommandIf__Group_4__0 )? )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1964:1: ( ( rule__CommandIf__Group_4__0 )? )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1965:1: ( rule__CommandIf__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getGroup_4()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1966:1: ( rule__CommandIf__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1966:2: rule__CommandIf__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__CommandIf__Group_4__0_in_rule__CommandIf__Group__4__Impl4004);
                    rule__CommandIf__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandIfAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandIf__Group__4__Impl"


    // $ANTLR start "rule__CommandIf__Group__5"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1976:1: rule__CommandIf__Group__5 : rule__CommandIf__Group__5__Impl ;
    public final void rule__CommandIf__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1980:1: ( rule__CommandIf__Group__5__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1981:2: rule__CommandIf__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__CommandIf__Group__5__Impl_in_rule__CommandIf__Group__54035);
            rule__CommandIf__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandIf__Group__5"


    // $ANTLR start "rule__CommandIf__Group__5__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1987:1: rule__CommandIf__Group__5__Impl : ( 'fi' ) ;
    public final void rule__CommandIf__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1991:1: ( ( 'fi' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1992:1: ( 'fi' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1992:1: ( 'fi' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1993:1: 'fi'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getFiKeyword_5()); 
            }
            match(input,27,FOLLOW_27_in_rule__CommandIf__Group__5__Impl4063); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandIfAccess().getFiKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandIf__Group__5__Impl"


    // $ANTLR start "rule__CommandIf__Group_4__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2018:1: rule__CommandIf__Group_4__0 : rule__CommandIf__Group_4__0__Impl rule__CommandIf__Group_4__1 ;
    public final void rule__CommandIf__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2022:1: ( rule__CommandIf__Group_4__0__Impl rule__CommandIf__Group_4__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2023:2: rule__CommandIf__Group_4__0__Impl rule__CommandIf__Group_4__1
            {
            pushFollow(FOLLOW_rule__CommandIf__Group_4__0__Impl_in_rule__CommandIf__Group_4__04106);
            rule__CommandIf__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandIf__Group_4__1_in_rule__CommandIf__Group_4__04109);
            rule__CommandIf__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandIf__Group_4__0"


    // $ANTLR start "rule__CommandIf__Group_4__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2030:1: rule__CommandIf__Group_4__0__Impl : ( 'else' ) ;
    public final void rule__CommandIf__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2034:1: ( ( 'else' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2035:1: ( 'else' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2035:1: ( 'else' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2036:1: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getElseKeyword_4_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__CommandIf__Group_4__0__Impl4137); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandIfAccess().getElseKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandIf__Group_4__0__Impl"


    // $ANTLR start "rule__CommandIf__Group_4__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2049:1: rule__CommandIf__Group_4__1 : rule__CommandIf__Group_4__1__Impl ;
    public final void rule__CommandIf__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2053:1: ( rule__CommandIf__Group_4__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2054:2: rule__CommandIf__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__CommandIf__Group_4__1__Impl_in_rule__CommandIf__Group_4__14168);
            rule__CommandIf__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandIf__Group_4__1"


    // $ANTLR start "rule__CommandIf__Group_4__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2060:1: rule__CommandIf__Group_4__1__Impl : ( ( rule__CommandIf__CmdsElseAssignment_4_1 ) ) ;
    public final void rule__CommandIf__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2064:1: ( ( ( rule__CommandIf__CmdsElseAssignment_4_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2065:1: ( ( rule__CommandIf__CmdsElseAssignment_4_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2065:1: ( ( rule__CommandIf__CmdsElseAssignment_4_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2066:1: ( rule__CommandIf__CmdsElseAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getCmdsElseAssignment_4_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2067:1: ( rule__CommandIf__CmdsElseAssignment_4_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2067:2: rule__CommandIf__CmdsElseAssignment_4_1
            {
            pushFollow(FOLLOW_rule__CommandIf__CmdsElseAssignment_4_1_in_rule__CommandIf__Group_4__1__Impl4195);
            rule__CommandIf__CmdsElseAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandIfAccess().getCmdsElseAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandIf__Group_4__1__Impl"


    // $ANTLR start "rule__CommandForEach__Group__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2081:1: rule__CommandForEach__Group__0 : rule__CommandForEach__Group__0__Impl rule__CommandForEach__Group__1 ;
    public final void rule__CommandForEach__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2085:1: ( rule__CommandForEach__Group__0__Impl rule__CommandForEach__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2086:2: rule__CommandForEach__Group__0__Impl rule__CommandForEach__Group__1
            {
            pushFollow(FOLLOW_rule__CommandForEach__Group__0__Impl_in_rule__CommandForEach__Group__04229);
            rule__CommandForEach__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandForEach__Group__1_in_rule__CommandForEach__Group__04232);
            rule__CommandForEach__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandForEach__Group__0"


    // $ANTLR start "rule__CommandForEach__Group__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2093:1: rule__CommandForEach__Group__0__Impl : ( 'foreach' ) ;
    public final void rule__CommandForEach__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2097:1: ( ( 'foreach' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2098:1: ( 'foreach' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2098:1: ( 'foreach' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2099:1: 'foreach'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachAccess().getForeachKeyword_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__CommandForEach__Group__0__Impl4260); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandForEachAccess().getForeachKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandForEach__Group__0__Impl"


    // $ANTLR start "rule__CommandForEach__Group__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2112:1: rule__CommandForEach__Group__1 : rule__CommandForEach__Group__1__Impl rule__CommandForEach__Group__2 ;
    public final void rule__CommandForEach__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2116:1: ( rule__CommandForEach__Group__1__Impl rule__CommandForEach__Group__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2117:2: rule__CommandForEach__Group__1__Impl rule__CommandForEach__Group__2
            {
            pushFollow(FOLLOW_rule__CommandForEach__Group__1__Impl_in_rule__CommandForEach__Group__14291);
            rule__CommandForEach__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandForEach__Group__2_in_rule__CommandForEach__Group__14294);
            rule__CommandForEach__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandForEach__Group__1"


    // $ANTLR start "rule__CommandForEach__Group__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2124:1: rule__CommandForEach__Group__1__Impl : ( ( rule__CommandForEach__ElemAssignment_1 ) ) ;
    public final void rule__CommandForEach__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2128:1: ( ( ( rule__CommandForEach__ElemAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2129:1: ( ( rule__CommandForEach__ElemAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2129:1: ( ( rule__CommandForEach__ElemAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2130:1: ( rule__CommandForEach__ElemAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachAccess().getElemAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2131:1: ( rule__CommandForEach__ElemAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2131:2: rule__CommandForEach__ElemAssignment_1
            {
            pushFollow(FOLLOW_rule__CommandForEach__ElemAssignment_1_in_rule__CommandForEach__Group__1__Impl4321);
            rule__CommandForEach__ElemAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandForEachAccess().getElemAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandForEach__Group__1__Impl"


    // $ANTLR start "rule__CommandForEach__Group__2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2141:1: rule__CommandForEach__Group__2 : rule__CommandForEach__Group__2__Impl rule__CommandForEach__Group__3 ;
    public final void rule__CommandForEach__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2145:1: ( rule__CommandForEach__Group__2__Impl rule__CommandForEach__Group__3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2146:2: rule__CommandForEach__Group__2__Impl rule__CommandForEach__Group__3
            {
            pushFollow(FOLLOW_rule__CommandForEach__Group__2__Impl_in_rule__CommandForEach__Group__24351);
            rule__CommandForEach__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandForEach__Group__3_in_rule__CommandForEach__Group__24354);
            rule__CommandForEach__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandForEach__Group__2"


    // $ANTLR start "rule__CommandForEach__Group__2__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2153:1: rule__CommandForEach__Group__2__Impl : ( 'in' ) ;
    public final void rule__CommandForEach__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2157:1: ( ( 'in' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2158:1: ( 'in' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2158:1: ( 'in' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2159:1: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachAccess().getInKeyword_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__CommandForEach__Group__2__Impl4382); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandForEachAccess().getInKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandForEach__Group__2__Impl"


    // $ANTLR start "rule__CommandForEach__Group__3"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2172:1: rule__CommandForEach__Group__3 : rule__CommandForEach__Group__3__Impl rule__CommandForEach__Group__4 ;
    public final void rule__CommandForEach__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2176:1: ( rule__CommandForEach__Group__3__Impl rule__CommandForEach__Group__4 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2177:2: rule__CommandForEach__Group__3__Impl rule__CommandForEach__Group__4
            {
            pushFollow(FOLLOW_rule__CommandForEach__Group__3__Impl_in_rule__CommandForEach__Group__34413);
            rule__CommandForEach__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandForEach__Group__4_in_rule__CommandForEach__Group__34416);
            rule__CommandForEach__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandForEach__Group__3"


    // $ANTLR start "rule__CommandForEach__Group__3__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2184:1: rule__CommandForEach__Group__3__Impl : ( ( rule__CommandForEach__EnsembAssignment_3 ) ) ;
    public final void rule__CommandForEach__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2188:1: ( ( ( rule__CommandForEach__EnsembAssignment_3 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2189:1: ( ( rule__CommandForEach__EnsembAssignment_3 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2189:1: ( ( rule__CommandForEach__EnsembAssignment_3 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2190:1: ( rule__CommandForEach__EnsembAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachAccess().getEnsembAssignment_3()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2191:1: ( rule__CommandForEach__EnsembAssignment_3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2191:2: rule__CommandForEach__EnsembAssignment_3
            {
            pushFollow(FOLLOW_rule__CommandForEach__EnsembAssignment_3_in_rule__CommandForEach__Group__3__Impl4443);
            rule__CommandForEach__EnsembAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandForEachAccess().getEnsembAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandForEach__Group__3__Impl"


    // $ANTLR start "rule__CommandForEach__Group__4"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2201:1: rule__CommandForEach__Group__4 : rule__CommandForEach__Group__4__Impl rule__CommandForEach__Group__5 ;
    public final void rule__CommandForEach__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2205:1: ( rule__CommandForEach__Group__4__Impl rule__CommandForEach__Group__5 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2206:2: rule__CommandForEach__Group__4__Impl rule__CommandForEach__Group__5
            {
            pushFollow(FOLLOW_rule__CommandForEach__Group__4__Impl_in_rule__CommandForEach__Group__44473);
            rule__CommandForEach__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandForEach__Group__5_in_rule__CommandForEach__Group__44476);
            rule__CommandForEach__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandForEach__Group__4"


    // $ANTLR start "rule__CommandForEach__Group__4__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2213:1: rule__CommandForEach__Group__4__Impl : ( 'do' ) ;
    public final void rule__CommandForEach__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2217:1: ( ( 'do' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2218:1: ( 'do' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2218:1: ( 'do' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2219:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachAccess().getDoKeyword_4()); 
            }
            match(input,23,FOLLOW_23_in_rule__CommandForEach__Group__4__Impl4504); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandForEachAccess().getDoKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandForEach__Group__4__Impl"


    // $ANTLR start "rule__CommandForEach__Group__5"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2232:1: rule__CommandForEach__Group__5 : rule__CommandForEach__Group__5__Impl rule__CommandForEach__Group__6 ;
    public final void rule__CommandForEach__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2236:1: ( rule__CommandForEach__Group__5__Impl rule__CommandForEach__Group__6 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2237:2: rule__CommandForEach__Group__5__Impl rule__CommandForEach__Group__6
            {
            pushFollow(FOLLOW_rule__CommandForEach__Group__5__Impl_in_rule__CommandForEach__Group__54535);
            rule__CommandForEach__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandForEach__Group__6_in_rule__CommandForEach__Group__54538);
            rule__CommandForEach__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandForEach__Group__5"


    // $ANTLR start "rule__CommandForEach__Group__5__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2244:1: rule__CommandForEach__Group__5__Impl : ( ( rule__CommandForEach__CmdsAssignment_5 ) ) ;
    public final void rule__CommandForEach__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2248:1: ( ( ( rule__CommandForEach__CmdsAssignment_5 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2249:1: ( ( rule__CommandForEach__CmdsAssignment_5 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2249:1: ( ( rule__CommandForEach__CmdsAssignment_5 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2250:1: ( rule__CommandForEach__CmdsAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachAccess().getCmdsAssignment_5()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2251:1: ( rule__CommandForEach__CmdsAssignment_5 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2251:2: rule__CommandForEach__CmdsAssignment_5
            {
            pushFollow(FOLLOW_rule__CommandForEach__CmdsAssignment_5_in_rule__CommandForEach__Group__5__Impl4565);
            rule__CommandForEach__CmdsAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandForEachAccess().getCmdsAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandForEach__Group__5__Impl"


    // $ANTLR start "rule__CommandForEach__Group__6"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2261:1: rule__CommandForEach__Group__6 : rule__CommandForEach__Group__6__Impl ;
    public final void rule__CommandForEach__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2265:1: ( rule__CommandForEach__Group__6__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2266:2: rule__CommandForEach__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__CommandForEach__Group__6__Impl_in_rule__CommandForEach__Group__64595);
            rule__CommandForEach__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandForEach__Group__6"


    // $ANTLR start "rule__CommandForEach__Group__6__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2272:1: rule__CommandForEach__Group__6__Impl : ( 'od' ) ;
    public final void rule__CommandForEach__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2276:1: ( ( 'od' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2277:1: ( 'od' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2277:1: ( 'od' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2278:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachAccess().getOdKeyword_6()); 
            }
            match(input,24,FOLLOW_24_in_rule__CommandForEach__Group__6__Impl4623); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandForEachAccess().getOdKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandForEach__Group__6__Impl"


    // $ANTLR start "rule__Exprs__Group__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2305:1: rule__Exprs__Group__0 : rule__Exprs__Group__0__Impl rule__Exprs__Group__1 ;
    public final void rule__Exprs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2309:1: ( rule__Exprs__Group__0__Impl rule__Exprs__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2310:2: rule__Exprs__Group__0__Impl rule__Exprs__Group__1
            {
            pushFollow(FOLLOW_rule__Exprs__Group__0__Impl_in_rule__Exprs__Group__04668);
            rule__Exprs__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Exprs__Group__1_in_rule__Exprs__Group__04671);
            rule__Exprs__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group__0"


    // $ANTLR start "rule__Exprs__Group__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2317:1: rule__Exprs__Group__0__Impl : ( ( rule__Exprs__Group_0__0 )* ) ;
    public final void rule__Exprs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2321:1: ( ( ( rule__Exprs__Group_0__0 )* ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2322:1: ( ( rule__Exprs__Group_0__0 )* )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2322:1: ( ( rule__Exprs__Group_0__0 )* )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2323:1: ( rule__Exprs__Group_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getGroup_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2324:1: ( rule__Exprs__Group_0__0 )*
            loop13:
            do {
                int alt13=2;
                switch ( input.LA(1) ) {
                case 36:
                    {
                    int LA13_1 = input.LA(2);

                    if ( (synpred21_InternalWhileCpp()) ) {
                        alt13=1;
                    }


                    }
                    break;
                case RULE_VARIABLE:
                    {
                    int LA13_2 = input.LA(2);

                    if ( (synpred21_InternalWhileCpp()) ) {
                        alt13=1;
                    }


                    }
                    break;
                case RULE_SYMBOL:
                    {
                    int LA13_3 = input.LA(2);

                    if ( (synpred21_InternalWhileCpp()) ) {
                        alt13=1;
                    }


                    }
                    break;
                case 31:
                    {
                    int LA13_4 = input.LA(2);

                    if ( (synpred21_InternalWhileCpp()) ) {
                        alt13=1;
                    }


                    }
                    break;
                case 43:
                    {
                    int LA13_5 = input.LA(2);

                    if ( (synpred21_InternalWhileCpp()) ) {
                        alt13=1;
                    }


                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2324:2: rule__Exprs__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__Exprs__Group_0__0_in_rule__Exprs__Group__0__Impl4698);
            	    rule__Exprs__Group_0__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group__0__Impl"


    // $ANTLR start "rule__Exprs__Group__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2334:1: rule__Exprs__Group__1 : rule__Exprs__Group__1__Impl ;
    public final void rule__Exprs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2338:1: ( rule__Exprs__Group__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2339:2: rule__Exprs__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Exprs__Group__1__Impl_in_rule__Exprs__Group__14729);
            rule__Exprs__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group__1"


    // $ANTLR start "rule__Exprs__Group__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2345:1: rule__Exprs__Group__1__Impl : ( ( rule__Exprs__ExpGenAssignment_1 ) ) ;
    public final void rule__Exprs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2349:1: ( ( ( rule__Exprs__ExpGenAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2350:1: ( ( rule__Exprs__ExpGenAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2350:1: ( ( rule__Exprs__ExpGenAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2351:1: ( rule__Exprs__ExpGenAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExpGenAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2352:1: ( rule__Exprs__ExpGenAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2352:2: rule__Exprs__ExpGenAssignment_1
            {
            pushFollow(FOLLOW_rule__Exprs__ExpGenAssignment_1_in_rule__Exprs__Group__1__Impl4756);
            rule__Exprs__ExpGenAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getExpGenAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group__1__Impl"


    // $ANTLR start "rule__Exprs__Group_0__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2366:1: rule__Exprs__Group_0__0 : rule__Exprs__Group_0__0__Impl ;
    public final void rule__Exprs__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2370:1: ( rule__Exprs__Group_0__0__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2371:2: rule__Exprs__Group_0__0__Impl
            {
            pushFollow(FOLLOW_rule__Exprs__Group_0__0__Impl_in_rule__Exprs__Group_0__04790);
            rule__Exprs__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group_0__0"


    // $ANTLR start "rule__Exprs__Group_0__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2377:1: rule__Exprs__Group_0__0__Impl : ( ( rule__Exprs__Group_0_0__0 ) ) ;
    public final void rule__Exprs__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2381:1: ( ( ( rule__Exprs__Group_0_0__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2382:1: ( ( rule__Exprs__Group_0_0__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2382:1: ( ( rule__Exprs__Group_0_0__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2383:1: ( rule__Exprs__Group_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getGroup_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2384:1: ( rule__Exprs__Group_0_0__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2384:2: rule__Exprs__Group_0_0__0
            {
            pushFollow(FOLLOW_rule__Exprs__Group_0_0__0_in_rule__Exprs__Group_0__0__Impl4817);
            rule__Exprs__Group_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getGroup_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group_0__0__Impl"


    // $ANTLR start "rule__Exprs__Group_0_0__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2396:1: rule__Exprs__Group_0_0__0 : rule__Exprs__Group_0_0__0__Impl rule__Exprs__Group_0_0__1 ;
    public final void rule__Exprs__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2400:1: ( rule__Exprs__Group_0_0__0__Impl rule__Exprs__Group_0_0__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2401:2: rule__Exprs__Group_0_0__0__Impl rule__Exprs__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__Exprs__Group_0_0__0__Impl_in_rule__Exprs__Group_0_0__04849);
            rule__Exprs__Group_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Exprs__Group_0_0__1_in_rule__Exprs__Group_0_0__04852);
            rule__Exprs__Group_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group_0_0__0"


    // $ANTLR start "rule__Exprs__Group_0_0__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2408:1: rule__Exprs__Group_0_0__0__Impl : ( ( rule__Exprs__ExpGenAssignment_0_0_0 ) ) ;
    public final void rule__Exprs__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2412:1: ( ( ( rule__Exprs__ExpGenAssignment_0_0_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2413:1: ( ( rule__Exprs__ExpGenAssignment_0_0_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2413:1: ( ( rule__Exprs__ExpGenAssignment_0_0_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2414:1: ( rule__Exprs__ExpGenAssignment_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExpGenAssignment_0_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2415:1: ( rule__Exprs__ExpGenAssignment_0_0_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2415:2: rule__Exprs__ExpGenAssignment_0_0_0
            {
            pushFollow(FOLLOW_rule__Exprs__ExpGenAssignment_0_0_0_in_rule__Exprs__Group_0_0__0__Impl4879);
            rule__Exprs__ExpGenAssignment_0_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getExpGenAssignment_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group_0_0__0__Impl"


    // $ANTLR start "rule__Exprs__Group_0_0__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2425:1: rule__Exprs__Group_0_0__1 : rule__Exprs__Group_0_0__1__Impl ;
    public final void rule__Exprs__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2429:1: ( rule__Exprs__Group_0_0__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2430:2: rule__Exprs__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Exprs__Group_0_0__1__Impl_in_rule__Exprs__Group_0_0__14909);
            rule__Exprs__Group_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group_0_0__1"


    // $ANTLR start "rule__Exprs__Group_0_0__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2436:1: rule__Exprs__Group_0_0__1__Impl : ( ',' ) ;
    public final void rule__Exprs__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2440:1: ( ( ',' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2441:1: ( ',' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2441:1: ( ',' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2442:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getCommaKeyword_0_0_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__Exprs__Group_0_0__1__Impl4937); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getCommaKeyword_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group_0_0__1__Impl"


    // $ANTLR start "rule__Expr__Group_0__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2459:1: rule__Expr__Group_0__0 : rule__Expr__Group_0__0__Impl ;
    public final void rule__Expr__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2463:1: ( rule__Expr__Group_0__0__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2464:2: rule__Expr__Group_0__0__Impl
            {
            pushFollow(FOLLOW_rule__Expr__Group_0__0__Impl_in_rule__Expr__Group_0__04972);
            rule__Expr__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_0__0"


    // $ANTLR start "rule__Expr__Group_0__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2470:1: rule__Expr__Group_0__0__Impl : ( ( rule__Expr__ExprSimpAssignment_0_0 ) ) ;
    public final void rule__Expr__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2474:1: ( ( ( rule__Expr__ExprSimpAssignment_0_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2475:1: ( ( rule__Expr__ExprSimpAssignment_0_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2475:1: ( ( rule__Expr__ExprSimpAssignment_0_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2476:1: ( rule__Expr__ExprSimpAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getExprSimpAssignment_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2477:1: ( rule__Expr__ExprSimpAssignment_0_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2477:2: rule__Expr__ExprSimpAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Expr__ExprSimpAssignment_0_0_in_rule__Expr__Group_0__0__Impl4999);
            rule__Expr__ExprSimpAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAccess().getExprSimpAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_0__0__Impl"


    // $ANTLR start "rule__ExprSimple__Group_1__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2489:1: rule__ExprSimple__Group_1__0 : rule__ExprSimple__Group_1__0__Impl rule__ExprSimple__Group_1__1 ;
    public final void rule__ExprSimple__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2493:1: ( rule__ExprSimple__Group_1__0__Impl rule__ExprSimple__Group_1__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2494:2: rule__ExprSimple__Group_1__0__Impl rule__ExprSimple__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_1__0__Impl_in_rule__ExprSimple__Group_1__05031);
            rule__ExprSimple__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_1__1_in_rule__ExprSimple__Group_1__05034);
            rule__ExprSimple__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_1__0"


    // $ANTLR start "rule__ExprSimple__Group_1__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2501:1: rule__ExprSimple__Group_1__0__Impl : ( '(' ) ;
    public final void rule__ExprSimple__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2505:1: ( ( '(' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2506:1: ( '(' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2506:1: ( '(' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2507:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__ExprSimple__Group_1__0__Impl5062); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_1__0__Impl"


    // $ANTLR start "rule__ExprSimple__Group_1__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2520:1: rule__ExprSimple__Group_1__1 : rule__ExprSimple__Group_1__1__Impl rule__ExprSimple__Group_1__2 ;
    public final void rule__ExprSimple__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2524:1: ( rule__ExprSimple__Group_1__1__Impl rule__ExprSimple__Group_1__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2525:2: rule__ExprSimple__Group_1__1__Impl rule__ExprSimple__Group_1__2
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_1__1__Impl_in_rule__ExprSimple__Group_1__15093);
            rule__ExprSimple__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_1__2_in_rule__ExprSimple__Group_1__15096);
            rule__ExprSimple__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_1__1"


    // $ANTLR start "rule__ExprSimple__Group_1__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2532:1: rule__ExprSimple__Group_1__1__Impl : ( ( rule__ExprSimple__ExprConsAssignment_1_1 ) ) ;
    public final void rule__ExprSimple__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2536:1: ( ( ( rule__ExprSimple__ExprConsAssignment_1_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2537:1: ( ( rule__ExprSimple__ExprConsAssignment_1_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2537:1: ( ( rule__ExprSimple__ExprConsAssignment_1_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2538:1: ( rule__ExprSimple__ExprConsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprConsAssignment_1_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2539:1: ( rule__ExprSimple__ExprConsAssignment_1_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2539:2: rule__ExprSimple__ExprConsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ExprSimple__ExprConsAssignment_1_1_in_rule__ExprSimple__Group_1__1__Impl5123);
            rule__ExprSimple__ExprConsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprConsAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_1__1__Impl"


    // $ANTLR start "rule__ExprSimple__Group_1__2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2549:1: rule__ExprSimple__Group_1__2 : rule__ExprSimple__Group_1__2__Impl rule__ExprSimple__Group_1__3 ;
    public final void rule__ExprSimple__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2553:1: ( rule__ExprSimple__Group_1__2__Impl rule__ExprSimple__Group_1__3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2554:2: rule__ExprSimple__Group_1__2__Impl rule__ExprSimple__Group_1__3
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_1__2__Impl_in_rule__ExprSimple__Group_1__25153);
            rule__ExprSimple__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_1__3_in_rule__ExprSimple__Group_1__25156);
            rule__ExprSimple__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_1__2"


    // $ANTLR start "rule__ExprSimple__Group_1__2__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2561:1: rule__ExprSimple__Group_1__2__Impl : ( ( rule__ExprSimple__ExprConsAttAssignment_1_2 ) ) ;
    public final void rule__ExprSimple__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2565:1: ( ( ( rule__ExprSimple__ExprConsAttAssignment_1_2 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2566:1: ( ( rule__ExprSimple__ExprConsAttAssignment_1_2 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2566:1: ( ( rule__ExprSimple__ExprConsAttAssignment_1_2 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2567:1: ( rule__ExprSimple__ExprConsAttAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprConsAttAssignment_1_2()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2568:1: ( rule__ExprSimple__ExprConsAttAssignment_1_2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2568:2: rule__ExprSimple__ExprConsAttAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ExprSimple__ExprConsAttAssignment_1_2_in_rule__ExprSimple__Group_1__2__Impl5183);
            rule__ExprSimple__ExprConsAttAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprConsAttAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_1__2__Impl"


    // $ANTLR start "rule__ExprSimple__Group_1__3"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2578:1: rule__ExprSimple__Group_1__3 : rule__ExprSimple__Group_1__3__Impl ;
    public final void rule__ExprSimple__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2582:1: ( rule__ExprSimple__Group_1__3__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2583:2: rule__ExprSimple__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_1__3__Impl_in_rule__ExprSimple__Group_1__35213);
            rule__ExprSimple__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_1__3"


    // $ANTLR start "rule__ExprSimple__Group_1__3__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2589:1: rule__ExprSimple__Group_1__3__Impl : ( ')' ) ;
    public final void rule__ExprSimple__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2593:1: ( ( ')' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2594:1: ( ')' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2594:1: ( ')' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2595:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_1_3()); 
            }
            match(input,32,FOLLOW_32_in_rule__ExprSimple__Group_1__3__Impl5241); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_1__3__Impl"


    // $ANTLR start "rule__ExprSimple__Group_2__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2616:1: rule__ExprSimple__Group_2__0 : rule__ExprSimple__Group_2__0__Impl rule__ExprSimple__Group_2__1 ;
    public final void rule__ExprSimple__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2620:1: ( rule__ExprSimple__Group_2__0__Impl rule__ExprSimple__Group_2__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2621:2: rule__ExprSimple__Group_2__0__Impl rule__ExprSimple__Group_2__1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_2__0__Impl_in_rule__ExprSimple__Group_2__05280);
            rule__ExprSimple__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_2__1_in_rule__ExprSimple__Group_2__05283);
            rule__ExprSimple__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_2__0"


    // $ANTLR start "rule__ExprSimple__Group_2__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2628:1: rule__ExprSimple__Group_2__0__Impl : ( '(' ) ;
    public final void rule__ExprSimple__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2632:1: ( ( '(' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2633:1: ( '(' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2633:1: ( '(' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2634:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__ExprSimple__Group_2__0__Impl5311); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_2__0__Impl"


    // $ANTLR start "rule__ExprSimple__Group_2__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2647:1: rule__ExprSimple__Group_2__1 : rule__ExprSimple__Group_2__1__Impl rule__ExprSimple__Group_2__2 ;
    public final void rule__ExprSimple__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2651:1: ( rule__ExprSimple__Group_2__1__Impl rule__ExprSimple__Group_2__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2652:2: rule__ExprSimple__Group_2__1__Impl rule__ExprSimple__Group_2__2
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_2__1__Impl_in_rule__ExprSimple__Group_2__15342);
            rule__ExprSimple__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_2__2_in_rule__ExprSimple__Group_2__15345);
            rule__ExprSimple__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_2__1"


    // $ANTLR start "rule__ExprSimple__Group_2__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2659:1: rule__ExprSimple__Group_2__1__Impl : ( ( rule__ExprSimple__ExprListAssignment_2_1 ) ) ;
    public final void rule__ExprSimple__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2663:1: ( ( ( rule__ExprSimple__ExprListAssignment_2_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2664:1: ( ( rule__ExprSimple__ExprListAssignment_2_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2664:1: ( ( rule__ExprSimple__ExprListAssignment_2_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2665:1: ( rule__ExprSimple__ExprListAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprListAssignment_2_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2666:1: ( rule__ExprSimple__ExprListAssignment_2_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2666:2: rule__ExprSimple__ExprListAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ExprSimple__ExprListAssignment_2_1_in_rule__ExprSimple__Group_2__1__Impl5372);
            rule__ExprSimple__ExprListAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprListAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_2__1__Impl"


    // $ANTLR start "rule__ExprSimple__Group_2__2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2676:1: rule__ExprSimple__Group_2__2 : rule__ExprSimple__Group_2__2__Impl rule__ExprSimple__Group_2__3 ;
    public final void rule__ExprSimple__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2680:1: ( rule__ExprSimple__Group_2__2__Impl rule__ExprSimple__Group_2__3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2681:2: rule__ExprSimple__Group_2__2__Impl rule__ExprSimple__Group_2__3
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_2__2__Impl_in_rule__ExprSimple__Group_2__25402);
            rule__ExprSimple__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_2__3_in_rule__ExprSimple__Group_2__25405);
            rule__ExprSimple__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_2__2"


    // $ANTLR start "rule__ExprSimple__Group_2__2__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2688:1: rule__ExprSimple__Group_2__2__Impl : ( ( rule__ExprSimple__ExprListAttAssignment_2_2 ) ) ;
    public final void rule__ExprSimple__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2692:1: ( ( ( rule__ExprSimple__ExprListAttAssignment_2_2 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2693:1: ( ( rule__ExprSimple__ExprListAttAssignment_2_2 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2693:1: ( ( rule__ExprSimple__ExprListAttAssignment_2_2 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2694:1: ( rule__ExprSimple__ExprListAttAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprListAttAssignment_2_2()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2695:1: ( rule__ExprSimple__ExprListAttAssignment_2_2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2695:2: rule__ExprSimple__ExprListAttAssignment_2_2
            {
            pushFollow(FOLLOW_rule__ExprSimple__ExprListAttAssignment_2_2_in_rule__ExprSimple__Group_2__2__Impl5432);
            rule__ExprSimple__ExprListAttAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprListAttAssignment_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_2__2__Impl"


    // $ANTLR start "rule__ExprSimple__Group_2__3"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2705:1: rule__ExprSimple__Group_2__3 : rule__ExprSimple__Group_2__3__Impl ;
    public final void rule__ExprSimple__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2709:1: ( rule__ExprSimple__Group_2__3__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2710:2: rule__ExprSimple__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_2__3__Impl_in_rule__ExprSimple__Group_2__35462);
            rule__ExprSimple__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_2__3"


    // $ANTLR start "rule__ExprSimple__Group_2__3__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2716:1: rule__ExprSimple__Group_2__3__Impl : ( ')' ) ;
    public final void rule__ExprSimple__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2720:1: ( ( ')' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2721:1: ( ')' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2721:1: ( ')' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2722:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_2_3()); 
            }
            match(input,32,FOLLOW_32_in_rule__ExprSimple__Group_2__3__Impl5490); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_2__3__Impl"


    // $ANTLR start "rule__ExprSimple__Group_3__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2743:1: rule__ExprSimple__Group_3__0 : rule__ExprSimple__Group_3__0__Impl rule__ExprSimple__Group_3__1 ;
    public final void rule__ExprSimple__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2747:1: ( rule__ExprSimple__Group_3__0__Impl rule__ExprSimple__Group_3__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2748:2: rule__ExprSimple__Group_3__0__Impl rule__ExprSimple__Group_3__1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_3__0__Impl_in_rule__ExprSimple__Group_3__05529);
            rule__ExprSimple__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_3__1_in_rule__ExprSimple__Group_3__05532);
            rule__ExprSimple__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_3__0"


    // $ANTLR start "rule__ExprSimple__Group_3__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2755:1: rule__ExprSimple__Group_3__0__Impl : ( '(' ) ;
    public final void rule__ExprSimple__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2759:1: ( ( '(' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2760:1: ( '(' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2760:1: ( '(' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2761:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__ExprSimple__Group_3__0__Impl5560); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_3__0__Impl"


    // $ANTLR start "rule__ExprSimple__Group_3__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2774:1: rule__ExprSimple__Group_3__1 : rule__ExprSimple__Group_3__1__Impl rule__ExprSimple__Group_3__2 ;
    public final void rule__ExprSimple__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2778:1: ( rule__ExprSimple__Group_3__1__Impl rule__ExprSimple__Group_3__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2779:2: rule__ExprSimple__Group_3__1__Impl rule__ExprSimple__Group_3__2
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_3__1__Impl_in_rule__ExprSimple__Group_3__15591);
            rule__ExprSimple__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_3__2_in_rule__ExprSimple__Group_3__15594);
            rule__ExprSimple__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_3__1"


    // $ANTLR start "rule__ExprSimple__Group_3__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2786:1: rule__ExprSimple__Group_3__1__Impl : ( ( rule__ExprSimple__ExprHeadAssignment_3_1 ) ) ;
    public final void rule__ExprSimple__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2790:1: ( ( ( rule__ExprSimple__ExprHeadAssignment_3_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2791:1: ( ( rule__ExprSimple__ExprHeadAssignment_3_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2791:1: ( ( rule__ExprSimple__ExprHeadAssignment_3_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2792:1: ( rule__ExprSimple__ExprHeadAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprHeadAssignment_3_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2793:1: ( rule__ExprSimple__ExprHeadAssignment_3_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2793:2: rule__ExprSimple__ExprHeadAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ExprSimple__ExprHeadAssignment_3_1_in_rule__ExprSimple__Group_3__1__Impl5621);
            rule__ExprSimple__ExprHeadAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprHeadAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_3__1__Impl"


    // $ANTLR start "rule__ExprSimple__Group_3__2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2803:1: rule__ExprSimple__Group_3__2 : rule__ExprSimple__Group_3__2__Impl rule__ExprSimple__Group_3__3 ;
    public final void rule__ExprSimple__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2807:1: ( rule__ExprSimple__Group_3__2__Impl rule__ExprSimple__Group_3__3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2808:2: rule__ExprSimple__Group_3__2__Impl rule__ExprSimple__Group_3__3
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_3__2__Impl_in_rule__ExprSimple__Group_3__25651);
            rule__ExprSimple__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_3__3_in_rule__ExprSimple__Group_3__25654);
            rule__ExprSimple__Group_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_3__2"


    // $ANTLR start "rule__ExprSimple__Group_3__2__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2815:1: rule__ExprSimple__Group_3__2__Impl : ( ( rule__ExprSimple__ExprHeadAttAssignment_3_2 ) ) ;
    public final void rule__ExprSimple__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2819:1: ( ( ( rule__ExprSimple__ExprHeadAttAssignment_3_2 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2820:1: ( ( rule__ExprSimple__ExprHeadAttAssignment_3_2 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2820:1: ( ( rule__ExprSimple__ExprHeadAttAssignment_3_2 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2821:1: ( rule__ExprSimple__ExprHeadAttAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprHeadAttAssignment_3_2()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2822:1: ( rule__ExprSimple__ExprHeadAttAssignment_3_2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2822:2: rule__ExprSimple__ExprHeadAttAssignment_3_2
            {
            pushFollow(FOLLOW_rule__ExprSimple__ExprHeadAttAssignment_3_2_in_rule__ExprSimple__Group_3__2__Impl5681);
            rule__ExprSimple__ExprHeadAttAssignment_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprHeadAttAssignment_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_3__2__Impl"


    // $ANTLR start "rule__ExprSimple__Group_3__3"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2832:1: rule__ExprSimple__Group_3__3 : rule__ExprSimple__Group_3__3__Impl ;
    public final void rule__ExprSimple__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2836:1: ( rule__ExprSimple__Group_3__3__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2837:2: rule__ExprSimple__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_3__3__Impl_in_rule__ExprSimple__Group_3__35711);
            rule__ExprSimple__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_3__3"


    // $ANTLR start "rule__ExprSimple__Group_3__3__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2843:1: rule__ExprSimple__Group_3__3__Impl : ( ')' ) ;
    public final void rule__ExprSimple__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2847:1: ( ( ')' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2848:1: ( ')' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2848:1: ( ')' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2849:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_3_3()); 
            }
            match(input,32,FOLLOW_32_in_rule__ExprSimple__Group_3__3__Impl5739); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_3_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_3__3__Impl"


    // $ANTLR start "rule__ExprSimple__Group_4__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2870:1: rule__ExprSimple__Group_4__0 : rule__ExprSimple__Group_4__0__Impl rule__ExprSimple__Group_4__1 ;
    public final void rule__ExprSimple__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2874:1: ( rule__ExprSimple__Group_4__0__Impl rule__ExprSimple__Group_4__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2875:2: rule__ExprSimple__Group_4__0__Impl rule__ExprSimple__Group_4__1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_4__0__Impl_in_rule__ExprSimple__Group_4__05778);
            rule__ExprSimple__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_4__1_in_rule__ExprSimple__Group_4__05781);
            rule__ExprSimple__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_4__0"


    // $ANTLR start "rule__ExprSimple__Group_4__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2882:1: rule__ExprSimple__Group_4__0__Impl : ( '(' ) ;
    public final void rule__ExprSimple__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2886:1: ( ( '(' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2887:1: ( '(' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2887:1: ( '(' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2888:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_4_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__ExprSimple__Group_4__0__Impl5809); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_4__0__Impl"


    // $ANTLR start "rule__ExprSimple__Group_4__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2901:1: rule__ExprSimple__Group_4__1 : rule__ExprSimple__Group_4__1__Impl rule__ExprSimple__Group_4__2 ;
    public final void rule__ExprSimple__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2905:1: ( rule__ExprSimple__Group_4__1__Impl rule__ExprSimple__Group_4__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2906:2: rule__ExprSimple__Group_4__1__Impl rule__ExprSimple__Group_4__2
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_4__1__Impl_in_rule__ExprSimple__Group_4__15840);
            rule__ExprSimple__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_4__2_in_rule__ExprSimple__Group_4__15843);
            rule__ExprSimple__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_4__1"


    // $ANTLR start "rule__ExprSimple__Group_4__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2913:1: rule__ExprSimple__Group_4__1__Impl : ( ( rule__ExprSimple__ExprTailAssignment_4_1 ) ) ;
    public final void rule__ExprSimple__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2917:1: ( ( ( rule__ExprSimple__ExprTailAssignment_4_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2918:1: ( ( rule__ExprSimple__ExprTailAssignment_4_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2918:1: ( ( rule__ExprSimple__ExprTailAssignment_4_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2919:1: ( rule__ExprSimple__ExprTailAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprTailAssignment_4_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2920:1: ( rule__ExprSimple__ExprTailAssignment_4_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2920:2: rule__ExprSimple__ExprTailAssignment_4_1
            {
            pushFollow(FOLLOW_rule__ExprSimple__ExprTailAssignment_4_1_in_rule__ExprSimple__Group_4__1__Impl5870);
            rule__ExprSimple__ExprTailAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprTailAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_4__1__Impl"


    // $ANTLR start "rule__ExprSimple__Group_4__2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2930:1: rule__ExprSimple__Group_4__2 : rule__ExprSimple__Group_4__2__Impl rule__ExprSimple__Group_4__3 ;
    public final void rule__ExprSimple__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2934:1: ( rule__ExprSimple__Group_4__2__Impl rule__ExprSimple__Group_4__3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2935:2: rule__ExprSimple__Group_4__2__Impl rule__ExprSimple__Group_4__3
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_4__2__Impl_in_rule__ExprSimple__Group_4__25900);
            rule__ExprSimple__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_4__3_in_rule__ExprSimple__Group_4__25903);
            rule__ExprSimple__Group_4__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_4__2"


    // $ANTLR start "rule__ExprSimple__Group_4__2__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2942:1: rule__ExprSimple__Group_4__2__Impl : ( ( rule__ExprSimple__ExprTailAttAssignment_4_2 ) ) ;
    public final void rule__ExprSimple__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2946:1: ( ( ( rule__ExprSimple__ExprTailAttAssignment_4_2 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2947:1: ( ( rule__ExprSimple__ExprTailAttAssignment_4_2 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2947:1: ( ( rule__ExprSimple__ExprTailAttAssignment_4_2 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2948:1: ( rule__ExprSimple__ExprTailAttAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprTailAttAssignment_4_2()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2949:1: ( rule__ExprSimple__ExprTailAttAssignment_4_2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2949:2: rule__ExprSimple__ExprTailAttAssignment_4_2
            {
            pushFollow(FOLLOW_rule__ExprSimple__ExprTailAttAssignment_4_2_in_rule__ExprSimple__Group_4__2__Impl5930);
            rule__ExprSimple__ExprTailAttAssignment_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprTailAttAssignment_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_4__2__Impl"


    // $ANTLR start "rule__ExprSimple__Group_4__3"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2959:1: rule__ExprSimple__Group_4__3 : rule__ExprSimple__Group_4__3__Impl ;
    public final void rule__ExprSimple__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2963:1: ( rule__ExprSimple__Group_4__3__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2964:2: rule__ExprSimple__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_4__3__Impl_in_rule__ExprSimple__Group_4__35960);
            rule__ExprSimple__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_4__3"


    // $ANTLR start "rule__ExprSimple__Group_4__3__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2970:1: rule__ExprSimple__Group_4__3__Impl : ( ')' ) ;
    public final void rule__ExprSimple__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2974:1: ( ( ')' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2975:1: ( ')' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2975:1: ( ')' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2976:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_4_3()); 
            }
            match(input,32,FOLLOW_32_in_rule__ExprSimple__Group_4__3__Impl5988); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_4_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_4__3__Impl"


    // $ANTLR start "rule__ExprSimple__Group_5__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2997:1: rule__ExprSimple__Group_5__0 : rule__ExprSimple__Group_5__0__Impl rule__ExprSimple__Group_5__1 ;
    public final void rule__ExprSimple__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3001:1: ( rule__ExprSimple__Group_5__0__Impl rule__ExprSimple__Group_5__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3002:2: rule__ExprSimple__Group_5__0__Impl rule__ExprSimple__Group_5__1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_5__0__Impl_in_rule__ExprSimple__Group_5__06027);
            rule__ExprSimple__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_5__1_in_rule__ExprSimple__Group_5__06030);
            rule__ExprSimple__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_5__0"


    // $ANTLR start "rule__ExprSimple__Group_5__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3009:1: rule__ExprSimple__Group_5__0__Impl : ( '(' ) ;
    public final void rule__ExprSimple__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3013:1: ( ( '(' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3014:1: ( '(' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3014:1: ( '(' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3015:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_5_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__ExprSimple__Group_5__0__Impl6058); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_5__0__Impl"


    // $ANTLR start "rule__ExprSimple__Group_5__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3028:1: rule__ExprSimple__Group_5__1 : rule__ExprSimple__Group_5__1__Impl rule__ExprSimple__Group_5__2 ;
    public final void rule__ExprSimple__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3032:1: ( rule__ExprSimple__Group_5__1__Impl rule__ExprSimple__Group_5__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3033:2: rule__ExprSimple__Group_5__1__Impl rule__ExprSimple__Group_5__2
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_5__1__Impl_in_rule__ExprSimple__Group_5__16089);
            rule__ExprSimple__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_5__2_in_rule__ExprSimple__Group_5__16092);
            rule__ExprSimple__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_5__1"


    // $ANTLR start "rule__ExprSimple__Group_5__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3040:1: rule__ExprSimple__Group_5__1__Impl : ( ( rule__ExprSimple__NomSymbAssignment_5_1 ) ) ;
    public final void rule__ExprSimple__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3044:1: ( ( ( rule__ExprSimple__NomSymbAssignment_5_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3045:1: ( ( rule__ExprSimple__NomSymbAssignment_5_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3045:1: ( ( rule__ExprSimple__NomSymbAssignment_5_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3046:1: ( rule__ExprSimple__NomSymbAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getNomSymbAssignment_5_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3047:1: ( rule__ExprSimple__NomSymbAssignment_5_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3047:2: rule__ExprSimple__NomSymbAssignment_5_1
            {
            pushFollow(FOLLOW_rule__ExprSimple__NomSymbAssignment_5_1_in_rule__ExprSimple__Group_5__1__Impl6119);
            rule__ExprSimple__NomSymbAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getNomSymbAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_5__1__Impl"


    // $ANTLR start "rule__ExprSimple__Group_5__2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3057:1: rule__ExprSimple__Group_5__2 : rule__ExprSimple__Group_5__2__Impl rule__ExprSimple__Group_5__3 ;
    public final void rule__ExprSimple__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3061:1: ( rule__ExprSimple__Group_5__2__Impl rule__ExprSimple__Group_5__3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3062:2: rule__ExprSimple__Group_5__2__Impl rule__ExprSimple__Group_5__3
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_5__2__Impl_in_rule__ExprSimple__Group_5__26149);
            rule__ExprSimple__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_5__3_in_rule__ExprSimple__Group_5__26152);
            rule__ExprSimple__Group_5__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_5__2"


    // $ANTLR start "rule__ExprSimple__Group_5__2__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3069:1: rule__ExprSimple__Group_5__2__Impl : ( ( rule__ExprSimple__SymbAttAssignment_5_2 ) ) ;
    public final void rule__ExprSimple__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3073:1: ( ( ( rule__ExprSimple__SymbAttAssignment_5_2 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3074:1: ( ( rule__ExprSimple__SymbAttAssignment_5_2 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3074:1: ( ( rule__ExprSimple__SymbAttAssignment_5_2 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3075:1: ( rule__ExprSimple__SymbAttAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getSymbAttAssignment_5_2()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3076:1: ( rule__ExprSimple__SymbAttAssignment_5_2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3076:2: rule__ExprSimple__SymbAttAssignment_5_2
            {
            pushFollow(FOLLOW_rule__ExprSimple__SymbAttAssignment_5_2_in_rule__ExprSimple__Group_5__2__Impl6179);
            rule__ExprSimple__SymbAttAssignment_5_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getSymbAttAssignment_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_5__2__Impl"


    // $ANTLR start "rule__ExprSimple__Group_5__3"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3086:1: rule__ExprSimple__Group_5__3 : rule__ExprSimple__Group_5__3__Impl ;
    public final void rule__ExprSimple__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3090:1: ( rule__ExprSimple__Group_5__3__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3091:2: rule__ExprSimple__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_5__3__Impl_in_rule__ExprSimple__Group_5__36209);
            rule__ExprSimple__Group_5__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_5__3"


    // $ANTLR start "rule__ExprSimple__Group_5__3__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3097:1: rule__ExprSimple__Group_5__3__Impl : ( ')' ) ;
    public final void rule__ExprSimple__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3101:1: ( ( ')' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3102:1: ( ')' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3102:1: ( ')' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3103:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_5_3()); 
            }
            match(input,32,FOLLOW_32_in_rule__ExprSimple__Group_5__3__Impl6237); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_5_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_5__3__Impl"


    // $ANTLR start "rule__ExprAnd__Group__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3124:1: rule__ExprAnd__Group__0 : rule__ExprAnd__Group__0__Impl rule__ExprAnd__Group__1 ;
    public final void rule__ExprAnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3128:1: ( rule__ExprAnd__Group__0__Impl rule__ExprAnd__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3129:2: rule__ExprAnd__Group__0__Impl rule__ExprAnd__Group__1
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group__0__Impl_in_rule__ExprAnd__Group__06276);
            rule__ExprAnd__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprAnd__Group__1_in_rule__ExprAnd__Group__06279);
            rule__ExprAnd__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__Group__0"


    // $ANTLR start "rule__ExprAnd__Group__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3136:1: rule__ExprAnd__Group__0__Impl : ( ( rule__ExprAnd__ExprOrAssignment_0 ) ) ;
    public final void rule__ExprAnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3140:1: ( ( ( rule__ExprAnd__ExprOrAssignment_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3141:1: ( ( rule__ExprAnd__ExprOrAssignment_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3141:1: ( ( rule__ExprAnd__ExprOrAssignment_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3142:1: ( rule__ExprAnd__ExprOrAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExprOrAssignment_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3143:1: ( rule__ExprAnd__ExprOrAssignment_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3143:2: rule__ExprAnd__ExprOrAssignment_0
            {
            pushFollow(FOLLOW_rule__ExprAnd__ExprOrAssignment_0_in_rule__ExprAnd__Group__0__Impl6306);
            rule__ExprAnd__ExprOrAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndAccess().getExprOrAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__Group__0__Impl"


    // $ANTLR start "rule__ExprAnd__Group__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3153:1: rule__ExprAnd__Group__1 : rule__ExprAnd__Group__1__Impl ;
    public final void rule__ExprAnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3157:1: ( rule__ExprAnd__Group__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3158:2: rule__ExprAnd__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group__1__Impl_in_rule__ExprAnd__Group__16336);
            rule__ExprAnd__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__Group__1"


    // $ANTLR start "rule__ExprAnd__Group__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3164:1: rule__ExprAnd__Group__1__Impl : ( ( rule__ExprAnd__Group_1__0 )? ) ;
    public final void rule__ExprAnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3168:1: ( ( ( rule__ExprAnd__Group_1__0 )? ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3169:1: ( ( rule__ExprAnd__Group_1__0 )? )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3169:1: ( ( rule__ExprAnd__Group_1__0 )? )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3170:1: ( rule__ExprAnd__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getGroup_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3171:1: ( rule__ExprAnd__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==41) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3171:2: rule__ExprAnd__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ExprAnd__Group_1__0_in_rule__ExprAnd__Group__1__Impl6363);
                    rule__ExprAnd__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__Group__1__Impl"


    // $ANTLR start "rule__ExprAnd__Group_1__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3185:1: rule__ExprAnd__Group_1__0 : rule__ExprAnd__Group_1__0__Impl rule__ExprAnd__Group_1__1 ;
    public final void rule__ExprAnd__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3189:1: ( rule__ExprAnd__Group_1__0__Impl rule__ExprAnd__Group_1__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3190:2: rule__ExprAnd__Group_1__0__Impl rule__ExprAnd__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group_1__0__Impl_in_rule__ExprAnd__Group_1__06398);
            rule__ExprAnd__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprAnd__Group_1__1_in_rule__ExprAnd__Group_1__06401);
            rule__ExprAnd__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__Group_1__0"


    // $ANTLR start "rule__ExprAnd__Group_1__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3197:1: rule__ExprAnd__Group_1__0__Impl : ( ( rule__ExprAnd__ExprAndAssignment_1_0 ) ) ;
    public final void rule__ExprAnd__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3201:1: ( ( ( rule__ExprAnd__ExprAndAssignment_1_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3202:1: ( ( rule__ExprAnd__ExprAndAssignment_1_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3202:1: ( ( rule__ExprAnd__ExprAndAssignment_1_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3203:1: ( rule__ExprAnd__ExprAndAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExprAndAssignment_1_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3204:1: ( rule__ExprAnd__ExprAndAssignment_1_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3204:2: rule__ExprAnd__ExprAndAssignment_1_0
            {
            pushFollow(FOLLOW_rule__ExprAnd__ExprAndAssignment_1_0_in_rule__ExprAnd__Group_1__0__Impl6428);
            rule__ExprAnd__ExprAndAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndAccess().getExprAndAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__Group_1__0__Impl"


    // $ANTLR start "rule__ExprAnd__Group_1__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3214:1: rule__ExprAnd__Group_1__1 : rule__ExprAnd__Group_1__1__Impl ;
    public final void rule__ExprAnd__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3218:1: ( rule__ExprAnd__Group_1__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3219:2: rule__ExprAnd__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group_1__1__Impl_in_rule__ExprAnd__Group_1__16458);
            rule__ExprAnd__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__Group_1__1"


    // $ANTLR start "rule__ExprAnd__Group_1__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3225:1: rule__ExprAnd__Group_1__1__Impl : ( ( rule__ExprAnd__ExprAndAttAssignment_1_1 ) ) ;
    public final void rule__ExprAnd__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3229:1: ( ( ( rule__ExprAnd__ExprAndAttAssignment_1_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3230:1: ( ( rule__ExprAnd__ExprAndAttAssignment_1_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3230:1: ( ( rule__ExprAnd__ExprAndAttAssignment_1_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3231:1: ( rule__ExprAnd__ExprAndAttAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExprAndAttAssignment_1_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3232:1: ( rule__ExprAnd__ExprAndAttAssignment_1_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3232:2: rule__ExprAnd__ExprAndAttAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ExprAnd__ExprAndAttAssignment_1_1_in_rule__ExprAnd__Group_1__1__Impl6485);
            rule__ExprAnd__ExprAndAttAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndAccess().getExprAndAttAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__Group_1__1__Impl"


    // $ANTLR start "rule__ExprOr__Group__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3246:1: rule__ExprOr__Group__0 : rule__ExprOr__Group__0__Impl rule__ExprOr__Group__1 ;
    public final void rule__ExprOr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3250:1: ( rule__ExprOr__Group__0__Impl rule__ExprOr__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3251:2: rule__ExprOr__Group__0__Impl rule__ExprOr__Group__1
            {
            pushFollow(FOLLOW_rule__ExprOr__Group__0__Impl_in_rule__ExprOr__Group__06519);
            rule__ExprOr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprOr__Group__1_in_rule__ExprOr__Group__06522);
            rule__ExprOr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__Group__0"


    // $ANTLR start "rule__ExprOr__Group__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3258:1: rule__ExprOr__Group__0__Impl : ( ( rule__ExprOr__ExprNotAssignment_0 ) ) ;
    public final void rule__ExprOr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3262:1: ( ( ( rule__ExprOr__ExprNotAssignment_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3263:1: ( ( rule__ExprOr__ExprNotAssignment_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3263:1: ( ( rule__ExprOr__ExprNotAssignment_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3264:1: ( rule__ExprOr__ExprNotAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExprNotAssignment_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3265:1: ( rule__ExprOr__ExprNotAssignment_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3265:2: rule__ExprOr__ExprNotAssignment_0
            {
            pushFollow(FOLLOW_rule__ExprOr__ExprNotAssignment_0_in_rule__ExprOr__Group__0__Impl6549);
            rule__ExprOr__ExprNotAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrAccess().getExprNotAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__Group__0__Impl"


    // $ANTLR start "rule__ExprOr__Group__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3275:1: rule__ExprOr__Group__1 : rule__ExprOr__Group__1__Impl ;
    public final void rule__ExprOr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3279:1: ( rule__ExprOr__Group__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3280:2: rule__ExprOr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprOr__Group__1__Impl_in_rule__ExprOr__Group__16579);
            rule__ExprOr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__Group__1"


    // $ANTLR start "rule__ExprOr__Group__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3286:1: rule__ExprOr__Group__1__Impl : ( ( rule__ExprOr__Group_1__0 )? ) ;
    public final void rule__ExprOr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3290:1: ( ( ( rule__ExprOr__Group_1__0 )? ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3291:1: ( ( rule__ExprOr__Group_1__0 )? )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3291:1: ( ( rule__ExprOr__Group_1__0 )? )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3292:1: ( rule__ExprOr__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getGroup_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3293:1: ( rule__ExprOr__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==42) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3293:2: rule__ExprOr__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ExprOr__Group_1__0_in_rule__ExprOr__Group__1__Impl6606);
                    rule__ExprOr__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__Group__1__Impl"


    // $ANTLR start "rule__ExprOr__Group_1__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3307:1: rule__ExprOr__Group_1__0 : rule__ExprOr__Group_1__0__Impl rule__ExprOr__Group_1__1 ;
    public final void rule__ExprOr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3311:1: ( rule__ExprOr__Group_1__0__Impl rule__ExprOr__Group_1__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3312:2: rule__ExprOr__Group_1__0__Impl rule__ExprOr__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExprOr__Group_1__0__Impl_in_rule__ExprOr__Group_1__06641);
            rule__ExprOr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprOr__Group_1__1_in_rule__ExprOr__Group_1__06644);
            rule__ExprOr__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__Group_1__0"


    // $ANTLR start "rule__ExprOr__Group_1__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3319:1: rule__ExprOr__Group_1__0__Impl : ( ( rule__ExprOr__ExprOrAssignment_1_0 ) ) ;
    public final void rule__ExprOr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3323:1: ( ( ( rule__ExprOr__ExprOrAssignment_1_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3324:1: ( ( rule__ExprOr__ExprOrAssignment_1_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3324:1: ( ( rule__ExprOr__ExprOrAssignment_1_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3325:1: ( rule__ExprOr__ExprOrAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExprOrAssignment_1_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3326:1: ( rule__ExprOr__ExprOrAssignment_1_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3326:2: rule__ExprOr__ExprOrAssignment_1_0
            {
            pushFollow(FOLLOW_rule__ExprOr__ExprOrAssignment_1_0_in_rule__ExprOr__Group_1__0__Impl6671);
            rule__ExprOr__ExprOrAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrAccess().getExprOrAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__Group_1__0__Impl"


    // $ANTLR start "rule__ExprOr__Group_1__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3336:1: rule__ExprOr__Group_1__1 : rule__ExprOr__Group_1__1__Impl ;
    public final void rule__ExprOr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3340:1: ( rule__ExprOr__Group_1__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3341:2: rule__ExprOr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprOr__Group_1__1__Impl_in_rule__ExprOr__Group_1__16701);
            rule__ExprOr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__Group_1__1"


    // $ANTLR start "rule__ExprOr__Group_1__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3347:1: rule__ExprOr__Group_1__1__Impl : ( ( rule__ExprOr__ExprOrAttAssignment_1_1 ) ) ;
    public final void rule__ExprOr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3351:1: ( ( ( rule__ExprOr__ExprOrAttAssignment_1_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3352:1: ( ( rule__ExprOr__ExprOrAttAssignment_1_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3352:1: ( ( rule__ExprOr__ExprOrAttAssignment_1_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3353:1: ( rule__ExprOr__ExprOrAttAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExprOrAttAssignment_1_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3354:1: ( rule__ExprOr__ExprOrAttAssignment_1_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3354:2: rule__ExprOr__ExprOrAttAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ExprOr__ExprOrAttAssignment_1_1_in_rule__ExprOr__Group_1__1__Impl6728);
            rule__ExprOr__ExprOrAttAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrAccess().getExprOrAttAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__Group_1__1__Impl"


    // $ANTLR start "rule__ExprNot__Group__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3368:1: rule__ExprNot__Group__0 : rule__ExprNot__Group__0__Impl rule__ExprNot__Group__1 ;
    public final void rule__ExprNot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3372:1: ( rule__ExprNot__Group__0__Impl rule__ExprNot__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3373:2: rule__ExprNot__Group__0__Impl rule__ExprNot__Group__1
            {
            pushFollow(FOLLOW_rule__ExprNot__Group__0__Impl_in_rule__ExprNot__Group__06762);
            rule__ExprNot__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprNot__Group__1_in_rule__ExprNot__Group__06765);
            rule__ExprNot__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprNot__Group__0"


    // $ANTLR start "rule__ExprNot__Group__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3380:1: rule__ExprNot__Group__0__Impl : ( ( rule__ExprNot__NotAssignment_0 )? ) ;
    public final void rule__ExprNot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3384:1: ( ( ( rule__ExprNot__NotAssignment_0 )? ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3385:1: ( ( rule__ExprNot__NotAssignment_0 )? )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3385:1: ( ( rule__ExprNot__NotAssignment_0 )? )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3386:1: ( rule__ExprNot__NotAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getNotAssignment_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3387:1: ( rule__ExprNot__NotAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==43) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3387:2: rule__ExprNot__NotAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ExprNot__NotAssignment_0_in_rule__ExprNot__Group__0__Impl6792);
                    rule__ExprNot__NotAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotAccess().getNotAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprNot__Group__0__Impl"


    // $ANTLR start "rule__ExprNot__Group__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3397:1: rule__ExprNot__Group__1 : rule__ExprNot__Group__1__Impl ;
    public final void rule__ExprNot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3401:1: ( rule__ExprNot__Group__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3402:2: rule__ExprNot__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprNot__Group__1__Impl_in_rule__ExprNot__Group__16823);
            rule__ExprNot__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprNot__Group__1"


    // $ANTLR start "rule__ExprNot__Group__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3408:1: rule__ExprNot__Group__1__Impl : ( ( rule__ExprNot__ExprEqAssignment_1 ) ) ;
    public final void rule__ExprNot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3412:1: ( ( ( rule__ExprNot__ExprEqAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3413:1: ( ( rule__ExprNot__ExprEqAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3413:1: ( ( rule__ExprNot__ExprEqAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3414:1: ( rule__ExprNot__ExprEqAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getExprEqAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3415:1: ( rule__ExprNot__ExprEqAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3415:2: rule__ExprNot__ExprEqAssignment_1
            {
            pushFollow(FOLLOW_rule__ExprNot__ExprEqAssignment_1_in_rule__ExprNot__Group__1__Impl6850);
            rule__ExprNot__ExprEqAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotAccess().getExprEqAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprNot__Group__1__Impl"


    // $ANTLR start "rule__ExprEq__Group_0__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3429:1: rule__ExprEq__Group_0__0 : rule__ExprEq__Group_0__0__Impl rule__ExprEq__Group_0__1 ;
    public final void rule__ExprEq__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3433:1: ( rule__ExprEq__Group_0__0__Impl rule__ExprEq__Group_0__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3434:2: rule__ExprEq__Group_0__0__Impl rule__ExprEq__Group_0__1
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_0__0__Impl_in_rule__ExprEq__Group_0__06884);
            rule__ExprEq__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprEq__Group_0__1_in_rule__ExprEq__Group_0__06887);
            rule__ExprEq__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_0__0"


    // $ANTLR start "rule__ExprEq__Group_0__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3441:1: rule__ExprEq__Group_0__0__Impl : ( '(' ) ;
    public final void rule__ExprEq__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3445:1: ( ( '(' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3446:1: ( '(' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3446:1: ( '(' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3447:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__ExprEq__Group_0__0__Impl6915); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getLeftParenthesisKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_0__0__Impl"


    // $ANTLR start "rule__ExprEq__Group_0__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3460:1: rule__ExprEq__Group_0__1 : rule__ExprEq__Group_0__1__Impl rule__ExprEq__Group_0__2 ;
    public final void rule__ExprEq__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3464:1: ( rule__ExprEq__Group_0__1__Impl rule__ExprEq__Group_0__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3465:2: rule__ExprEq__Group_0__1__Impl rule__ExprEq__Group_0__2
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_0__1__Impl_in_rule__ExprEq__Group_0__16946);
            rule__ExprEq__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprEq__Group_0__2_in_rule__ExprEq__Group_0__16949);
            rule__ExprEq__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_0__1"


    // $ANTLR start "rule__ExprEq__Group_0__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3472:1: rule__ExprEq__Group_0__1__Impl : ( ( rule__ExprEq__ExprAssignment_0_1 ) ) ;
    public final void rule__ExprEq__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3476:1: ( ( ( rule__ExprEq__ExprAssignment_0_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3477:1: ( ( rule__ExprEq__ExprAssignment_0_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3477:1: ( ( rule__ExprEq__ExprAssignment_0_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3478:1: ( rule__ExprEq__ExprAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExprAssignment_0_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3479:1: ( rule__ExprEq__ExprAssignment_0_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3479:2: rule__ExprEq__ExprAssignment_0_1
            {
            pushFollow(FOLLOW_rule__ExprEq__ExprAssignment_0_1_in_rule__ExprEq__Group_0__1__Impl6976);
            rule__ExprEq__ExprAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getExprAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_0__1__Impl"


    // $ANTLR start "rule__ExprEq__Group_0__2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3489:1: rule__ExprEq__Group_0__2 : rule__ExprEq__Group_0__2__Impl ;
    public final void rule__ExprEq__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3493:1: ( rule__ExprEq__Group_0__2__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3494:2: rule__ExprEq__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_0__2__Impl_in_rule__ExprEq__Group_0__27006);
            rule__ExprEq__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_0__2"


    // $ANTLR start "rule__ExprEq__Group_0__2__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3500:1: rule__ExprEq__Group_0__2__Impl : ( ')' ) ;
    public final void rule__ExprEq__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3504:1: ( ( ')' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3505:1: ( ')' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3505:1: ( ')' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3506:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,32,FOLLOW_32_in_rule__ExprEq__Group_0__2__Impl7034); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getRightParenthesisKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_0__2__Impl"


    // $ANTLR start "rule__ExprEq__Group_1__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3525:1: rule__ExprEq__Group_1__0 : rule__ExprEq__Group_1__0__Impl rule__ExprEq__Group_1__1 ;
    public final void rule__ExprEq__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3529:1: ( rule__ExprEq__Group_1__0__Impl rule__ExprEq__Group_1__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3530:2: rule__ExprEq__Group_1__0__Impl rule__ExprEq__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_1__0__Impl_in_rule__ExprEq__Group_1__07071);
            rule__ExprEq__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprEq__Group_1__1_in_rule__ExprEq__Group_1__07074);
            rule__ExprEq__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_1__0"


    // $ANTLR start "rule__ExprEq__Group_1__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3537:1: rule__ExprEq__Group_1__0__Impl : ( ( rule__ExprEq__ExprSim1Assignment_1_0 ) ) ;
    public final void rule__ExprEq__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3541:1: ( ( ( rule__ExprEq__ExprSim1Assignment_1_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3542:1: ( ( rule__ExprEq__ExprSim1Assignment_1_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3542:1: ( ( rule__ExprEq__ExprSim1Assignment_1_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3543:1: ( rule__ExprEq__ExprSim1Assignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExprSim1Assignment_1_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3544:1: ( rule__ExprEq__ExprSim1Assignment_1_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3544:2: rule__ExprEq__ExprSim1Assignment_1_0
            {
            pushFollow(FOLLOW_rule__ExprEq__ExprSim1Assignment_1_0_in_rule__ExprEq__Group_1__0__Impl7101);
            rule__ExprEq__ExprSim1Assignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getExprSim1Assignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_1__0__Impl"


    // $ANTLR start "rule__ExprEq__Group_1__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3554:1: rule__ExprEq__Group_1__1 : rule__ExprEq__Group_1__1__Impl rule__ExprEq__Group_1__2 ;
    public final void rule__ExprEq__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3558:1: ( rule__ExprEq__Group_1__1__Impl rule__ExprEq__Group_1__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3559:2: rule__ExprEq__Group_1__1__Impl rule__ExprEq__Group_1__2
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_1__1__Impl_in_rule__ExprEq__Group_1__17131);
            rule__ExprEq__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprEq__Group_1__2_in_rule__ExprEq__Group_1__17134);
            rule__ExprEq__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_1__1"


    // $ANTLR start "rule__ExprEq__Group_1__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3566:1: rule__ExprEq__Group_1__1__Impl : ( '=?' ) ;
    public final void rule__ExprEq__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3570:1: ( ( '=?' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3571:1: ( '=?' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3571:1: ( '=?' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3572:1: '=?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getEqualsSignQuestionMarkKeyword_1_1()); 
            }
            match(input,33,FOLLOW_33_in_rule__ExprEq__Group_1__1__Impl7162); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getEqualsSignQuestionMarkKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_1__1__Impl"


    // $ANTLR start "rule__ExprEq__Group_1__2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3585:1: rule__ExprEq__Group_1__2 : rule__ExprEq__Group_1__2__Impl ;
    public final void rule__ExprEq__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3589:1: ( rule__ExprEq__Group_1__2__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3590:2: rule__ExprEq__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_1__2__Impl_in_rule__ExprEq__Group_1__27193);
            rule__ExprEq__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_1__2"


    // $ANTLR start "rule__ExprEq__Group_1__2__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3596:1: rule__ExprEq__Group_1__2__Impl : ( ( rule__ExprEq__ExprSim2Assignment_1_2 ) ) ;
    public final void rule__ExprEq__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3600:1: ( ( ( rule__ExprEq__ExprSim2Assignment_1_2 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3601:1: ( ( rule__ExprEq__ExprSim2Assignment_1_2 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3601:1: ( ( rule__ExprEq__ExprSim2Assignment_1_2 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3602:1: ( rule__ExprEq__ExprSim2Assignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExprSim2Assignment_1_2()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3603:1: ( rule__ExprEq__ExprSim2Assignment_1_2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3603:2: rule__ExprEq__ExprSim2Assignment_1_2
            {
            pushFollow(FOLLOW_rule__ExprEq__ExprSim2Assignment_1_2_in_rule__ExprEq__Group_1__2__Impl7220);
            rule__ExprEq__ExprSim2Assignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getExprSim2Assignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__Group_1__2__Impl"


    // $ANTLR start "rule__Program__FonctionsAssignment"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3620:1: rule__Program__FonctionsAssignment : ( ruleFunction ) ;
    public final void rule__Program__FonctionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3624:1: ( ( ruleFunction ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3625:1: ( ruleFunction )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3625:1: ( ruleFunction )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3626:1: ruleFunction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getFonctionsFunctionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleFunction_in_rule__Program__FonctionsAssignment7261);
            ruleFunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getFonctionsFunctionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__FonctionsAssignment"


    // $ANTLR start "rule__Function__NomAssignment_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3635:1: rule__Function__NomAssignment_1 : ( RULE_SYMBOL ) ;
    public final void rule__Function__NomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3639:1: ( ( RULE_SYMBOL ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3640:1: ( RULE_SYMBOL )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3640:1: ( RULE_SYMBOL )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3641:1: RULE_SYMBOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getNomSYMBOLTerminalRuleCall_1_0()); 
            }
            match(input,RULE_SYMBOL,FOLLOW_RULE_SYMBOL_in_rule__Function__NomAssignment_17292); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getNomSYMBOLTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__NomAssignment_1"


    // $ANTLR start "rule__Function__DefinitionAssignment_3"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3650:1: rule__Function__DefinitionAssignment_3 : ( ruleDefinition ) ;
    public final void rule__Function__DefinitionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3654:1: ( ( ruleDefinition ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3655:1: ( ruleDefinition )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3655:1: ( ruleDefinition )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3656:1: ruleDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getDefinitionDefinitionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleDefinition_in_rule__Function__DefinitionAssignment_37323);
            ruleDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getDefinitionDefinitionParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__DefinitionAssignment_3"


    // $ANTLR start "rule__Definition__InputsAssignment_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3665:1: rule__Definition__InputsAssignment_1 : ( ruleInput ) ;
    public final void rule__Definition__InputsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3669:1: ( ( ruleInput ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3670:1: ( ruleInput )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3670:1: ( ruleInput )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3671:1: ruleInput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getInputsInputParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleInput_in_rule__Definition__InputsAssignment_17354);
            ruleInput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getInputsInputParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__InputsAssignment_1"


    // $ANTLR start "rule__Definition__CommandesAssignment_3"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3680:1: rule__Definition__CommandesAssignment_3 : ( ruleCommands ) ;
    public final void rule__Definition__CommandesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3684:1: ( ( ruleCommands ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3685:1: ( ruleCommands )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3685:1: ( ruleCommands )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3686:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getCommandesCommandsParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Definition__CommandesAssignment_37385);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getCommandesCommandsParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__CommandesAssignment_3"


    // $ANTLR start "rule__Definition__OutputsAssignment_6"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3695:1: rule__Definition__OutputsAssignment_6 : ( ruleOutput ) ;
    public final void rule__Definition__OutputsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3699:1: ( ( ruleOutput ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3700:1: ( ruleOutput )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3700:1: ( ruleOutput )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3701:1: ruleOutput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getOutputsOutputParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleOutput_in_rule__Definition__OutputsAssignment_67416);
            ruleOutput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitionAccess().getOutputsOutputParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__OutputsAssignment_6"


    // $ANTLR start "rule__Input__VarInAssignment_0_0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3710:1: rule__Input__VarInAssignment_0_0 : ( RULE_VARIABLE ) ;
    public final void rule__Input__VarInAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3714:1: ( ( RULE_VARIABLE ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3715:1: ( RULE_VARIABLE )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3715:1: ( RULE_VARIABLE )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3716:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVarInVARIABLETerminalRuleCall_0_0_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Input__VarInAssignment_0_07447); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getVarInVARIABLETerminalRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__VarInAssignment_0_0"


    // $ANTLR start "rule__Input__VarInAssignment_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3725:1: rule__Input__VarInAssignment_1 : ( RULE_VARIABLE ) ;
    public final void rule__Input__VarInAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3729:1: ( ( RULE_VARIABLE ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3730:1: ( RULE_VARIABLE )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3730:1: ( RULE_VARIABLE )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3731:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVarInVARIABLETerminalRuleCall_1_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Input__VarInAssignment_17478); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getVarInVARIABLETerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__VarInAssignment_1"


    // $ANTLR start "rule__Output__VarOutAssignment_0_0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3740:1: rule__Output__VarOutAssignment_0_0 : ( RULE_VARIABLE ) ;
    public final void rule__Output__VarOutAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3744:1: ( ( RULE_VARIABLE ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3745:1: ( RULE_VARIABLE )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3745:1: ( RULE_VARIABLE )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3746:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVarOutVARIABLETerminalRuleCall_0_0_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Output__VarOutAssignment_0_07509); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getVarOutVARIABLETerminalRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__VarOutAssignment_0_0"


    // $ANTLR start "rule__Output__VarOutAssignment_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3755:1: rule__Output__VarOutAssignment_1 : ( RULE_VARIABLE ) ;
    public final void rule__Output__VarOutAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3759:1: ( ( RULE_VARIABLE ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3760:1: ( RULE_VARIABLE )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3760:1: ( RULE_VARIABLE )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3761:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVarOutVARIABLETerminalRuleCall_1_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Output__VarOutAssignment_17540); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getVarOutVARIABLETerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__VarOutAssignment_1"


    // $ANTLR start "rule__Vars__VarGenAssignment_0_0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3770:1: rule__Vars__VarGenAssignment_0_0 : ( RULE_VARIABLE ) ;
    public final void rule__Vars__VarGenAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3774:1: ( ( RULE_VARIABLE ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3775:1: ( RULE_VARIABLE )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3775:1: ( RULE_VARIABLE )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3776:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getVarGenVARIABLETerminalRuleCall_0_0_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Vars__VarGenAssignment_0_07571); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getVarGenVARIABLETerminalRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__VarGenAssignment_0_0"


    // $ANTLR start "rule__Vars__VarGenAssignment_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3785:1: rule__Vars__VarGenAssignment_1 : ( RULE_VARIABLE ) ;
    public final void rule__Vars__VarGenAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3789:1: ( ( RULE_VARIABLE ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3790:1: ( RULE_VARIABLE )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3790:1: ( RULE_VARIABLE )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3791:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getVarGenVARIABLETerminalRuleCall_1_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Vars__VarGenAssignment_17602); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getVarGenVARIABLETerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__VarGenAssignment_1"


    // $ANTLR start "rule__Commands__CommandeAssignment"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3800:1: rule__Commands__CommandeAssignment : ( ruleCommand ) ;
    public final void rule__Commands__CommandeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3804:1: ( ( ruleCommand ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3805:1: ( ruleCommand )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3805:1: ( ruleCommand )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3806:1: ruleCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getCommandeCommandParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleCommand_in_rule__Commands__CommandeAssignment7633);
            ruleCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getCommandeCommandParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__CommandeAssignment"


    // $ANTLR start "rule__Command__NopAssignment_0_0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3815:1: rule__Command__NopAssignment_0_0 : ( ( 'nop' ) ) ;
    public final void rule__Command__NopAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3819:1: ( ( ( 'nop' ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3820:1: ( ( 'nop' ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3820:1: ( ( 'nop' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3821:1: ( 'nop' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNopNopKeyword_0_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3822:1: ( 'nop' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3823:1: 'nop'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNopNopKeyword_0_0_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__Command__NopAssignment_0_07669); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getNopNopKeyword_0_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getNopNopKeyword_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__NopAssignment_0_0"


    // $ANTLR start "rule__Command__VarsAssignment_1_0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3838:1: rule__Command__VarsAssignment_1_0 : ( ruleVars ) ;
    public final void rule__Command__VarsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3842:1: ( ( ruleVars ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3843:1: ( ruleVars )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3843:1: ( ruleVars )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3844:1: ruleVars
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getVarsVarsParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleVars_in_rule__Command__VarsAssignment_1_07708);
            ruleVars();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getVarsVarsParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__VarsAssignment_1_0"


    // $ANTLR start "rule__Command__ExprsAssignment_1_2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3853:1: rule__Command__ExprsAssignment_1_2 : ( ruleExprs ) ;
    public final void rule__Command__ExprsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3857:1: ( ( ruleExprs ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3858:1: ( ruleExprs )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3858:1: ( ruleExprs )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3859:1: ruleExprs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExprsExprsParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleExprs_in_rule__Command__ExprsAssignment_1_27739);
            ruleExprs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getExprsExprsParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__ExprsAssignment_1_2"


    // $ANTLR start "rule__Command__CmdWhileAssignment_2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3868:1: rule__Command__CmdWhileAssignment_2 : ( ruleCommandWhile ) ;
    public final void rule__Command__CmdWhileAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3872:1: ( ( ruleCommandWhile ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3873:1: ( ruleCommandWhile )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3873:1: ( ruleCommandWhile )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3874:1: ruleCommandWhile
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getCmdWhileCommandWhileParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleCommandWhile_in_rule__Command__CmdWhileAssignment_27770);
            ruleCommandWhile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getCmdWhileCommandWhileParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__CmdWhileAssignment_2"


    // $ANTLR start "rule__Command__CmdIfAssignment_3"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3883:1: rule__Command__CmdIfAssignment_3 : ( ruleCommandIf ) ;
    public final void rule__Command__CmdIfAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3887:1: ( ( ruleCommandIf ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3888:1: ( ruleCommandIf )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3888:1: ( ruleCommandIf )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3889:1: ruleCommandIf
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getCmdIfCommandIfParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleCommandIf_in_rule__Command__CmdIfAssignment_37801);
            ruleCommandIf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getCmdIfCommandIfParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__CmdIfAssignment_3"


    // $ANTLR start "rule__Command__CmdForEachAssignment_4"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3898:1: rule__Command__CmdForEachAssignment_4 : ( ruleCommandForEach ) ;
    public final void rule__Command__CmdForEachAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3902:1: ( ( ruleCommandForEach ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3903:1: ( ruleCommandForEach )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3903:1: ( ruleCommandForEach )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3904:1: ruleCommandForEach
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getCmdForEachCommandForEachParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleCommandForEach_in_rule__Command__CmdForEachAssignment_47832);
            ruleCommandForEach();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getCmdForEachCommandForEachParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__CmdForEachAssignment_4"


    // $ANTLR start "rule__CommandWhile__WAssignment_0_0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3913:1: rule__CommandWhile__WAssignment_0_0 : ( ( 'while' ) ) ;
    public final void rule__CommandWhile__WAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3917:1: ( ( ( 'while' ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3918:1: ( ( 'while' ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3918:1: ( ( 'while' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3919:1: ( 'while' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandWhileAccess().getWWhileKeyword_0_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3920:1: ( 'while' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3921:1: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandWhileAccess().getWWhileKeyword_0_0_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__CommandWhile__WAssignment_0_07868); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandWhileAccess().getWWhileKeyword_0_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandWhileAccess().getWWhileKeyword_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandWhile__WAssignment_0_0"


    // $ANTLR start "rule__CommandWhile__ExprAssignment_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3936:1: rule__CommandWhile__ExprAssignment_1 : ( ruleExpr ) ;
    public final void rule__CommandWhile__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3940:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3941:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3941:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3942:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandWhileAccess().getExprExprParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__CommandWhile__ExprAssignment_17907);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandWhileAccess().getExprExprParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandWhile__ExprAssignment_1"


    // $ANTLR start "rule__CommandWhile__CmdsAssignment_3"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3951:1: rule__CommandWhile__CmdsAssignment_3 : ( ruleCommands ) ;
    public final void rule__CommandWhile__CmdsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3955:1: ( ( ruleCommands ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3956:1: ( ruleCommands )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3956:1: ( ruleCommands )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3957:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandWhileAccess().getCmdsCommandsParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__CommandWhile__CmdsAssignment_37938);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandWhileAccess().getCmdsCommandsParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandWhile__CmdsAssignment_3"


    // $ANTLR start "rule__CommandIf__CondAssignment_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3966:1: rule__CommandIf__CondAssignment_1 : ( ruleExpr ) ;
    public final void rule__CommandIf__CondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3970:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3971:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3971:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3972:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getCondExprParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__CommandIf__CondAssignment_17969);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandIfAccess().getCondExprParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandIf__CondAssignment_1"


    // $ANTLR start "rule__CommandIf__CmdsThenAssignment_3"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3981:1: rule__CommandIf__CmdsThenAssignment_3 : ( ruleCommands ) ;
    public final void rule__CommandIf__CmdsThenAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3985:1: ( ( ruleCommands ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3986:1: ( ruleCommands )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3986:1: ( ruleCommands )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3987:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getCmdsThenCommandsParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__CommandIf__CmdsThenAssignment_38000);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandIfAccess().getCmdsThenCommandsParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandIf__CmdsThenAssignment_3"


    // $ANTLR start "rule__CommandIf__CmdsElseAssignment_4_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3996:1: rule__CommandIf__CmdsElseAssignment_4_1 : ( ruleCommands ) ;
    public final void rule__CommandIf__CmdsElseAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4000:1: ( ( ruleCommands ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4001:1: ( ruleCommands )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4001:1: ( ruleCommands )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4002:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getCmdsElseCommandsParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__CommandIf__CmdsElseAssignment_4_18031);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandIfAccess().getCmdsElseCommandsParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandIf__CmdsElseAssignment_4_1"


    // $ANTLR start "rule__CommandForEach__ElemAssignment_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4011:1: rule__CommandForEach__ElemAssignment_1 : ( ruleExpr ) ;
    public final void rule__CommandForEach__ElemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4015:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4016:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4016:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4017:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachAccess().getElemExprParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__CommandForEach__ElemAssignment_18062);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandForEachAccess().getElemExprParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandForEach__ElemAssignment_1"


    // $ANTLR start "rule__CommandForEach__EnsembAssignment_3"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4026:1: rule__CommandForEach__EnsembAssignment_3 : ( ruleExpr ) ;
    public final void rule__CommandForEach__EnsembAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4030:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4031:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4031:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4032:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachAccess().getEnsembExprParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__CommandForEach__EnsembAssignment_38093);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandForEachAccess().getEnsembExprParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandForEach__EnsembAssignment_3"


    // $ANTLR start "rule__CommandForEach__CmdsAssignment_5"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4041:1: rule__CommandForEach__CmdsAssignment_5 : ( ruleCommands ) ;
    public final void rule__CommandForEach__CmdsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4045:1: ( ( ruleCommands ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4046:1: ( ruleCommands )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4046:1: ( ruleCommands )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4047:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachAccess().getCmdsCommandsParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__CommandForEach__CmdsAssignment_58124);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandForEachAccess().getCmdsCommandsParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommandForEach__CmdsAssignment_5"


    // $ANTLR start "rule__Exprs__ExpGenAssignment_0_0_0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4056:1: rule__Exprs__ExpGenAssignment_0_0_0 : ( ruleExpr ) ;
    public final void rule__Exprs__ExpGenAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4060:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4061:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4061:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4062:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExpGenExprParserRuleCall_0_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Exprs__ExpGenAssignment_0_0_08155);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getExpGenExprParserRuleCall_0_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__ExpGenAssignment_0_0_0"


    // $ANTLR start "rule__Exprs__ExpGenAssignment_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4071:1: rule__Exprs__ExpGenAssignment_1 : ( ruleExpr ) ;
    public final void rule__Exprs__ExpGenAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4075:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4076:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4076:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4077:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExpGenExprParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Exprs__ExpGenAssignment_18186);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getExpGenExprParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__ExpGenAssignment_1"


    // $ANTLR start "rule__Expr__ExprSimpAssignment_0_0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4086:1: rule__Expr__ExprSimpAssignment_0_0 : ( ruleExprSimple ) ;
    public final void rule__Expr__ExprSimpAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4090:1: ( ( ruleExprSimple ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4091:1: ( ruleExprSimple )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4091:1: ( ruleExprSimple )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4092:1: ruleExprSimple
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getExprSimpExprSimpleParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_rule__Expr__ExprSimpAssignment_0_08217);
            ruleExprSimple();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAccess().getExprSimpExprSimpleParserRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__ExprSimpAssignment_0_0"


    // $ANTLR start "rule__Expr__ExprAndAssignment_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4101:1: rule__Expr__ExprAndAssignment_1 : ( ruleExprAnd ) ;
    public final void rule__Expr__ExprAndAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4105:1: ( ( ruleExprAnd ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4106:1: ( ruleExprAnd )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4106:1: ( ruleExprAnd )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4107:1: ruleExprAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getExprAndExprAndParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExprAnd_in_rule__Expr__ExprAndAssignment_18248);
            ruleExprAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAccess().getExprAndExprAndParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__ExprAndAssignment_1"


    // $ANTLR start "rule__ExprSimple__NilAssignment_0_0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4116:1: rule__ExprSimple__NilAssignment_0_0 : ( ( 'nil' ) ) ;
    public final void rule__ExprSimple__NilAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4120:1: ( ( ( 'nil' ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4121:1: ( ( 'nil' ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4121:1: ( ( 'nil' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4122:1: ( 'nil' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getNilNilKeyword_0_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4123:1: ( 'nil' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4124:1: 'nil'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getNilNilKeyword_0_0_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__ExprSimple__NilAssignment_0_08284); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getNilNilKeyword_0_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getNilNilKeyword_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__NilAssignment_0_0"


    // $ANTLR start "rule__ExprSimple__VariAssignment_0_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4139:1: rule__ExprSimple__VariAssignment_0_1 : ( RULE_VARIABLE ) ;
    public final void rule__ExprSimple__VariAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4143:1: ( ( RULE_VARIABLE ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4144:1: ( RULE_VARIABLE )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4144:1: ( RULE_VARIABLE )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4145:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getVariVARIABLETerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__ExprSimple__VariAssignment_0_18323); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getVariVARIABLETerminalRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__VariAssignment_0_1"


    // $ANTLR start "rule__ExprSimple__SymbAssignment_0_2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4154:1: rule__ExprSimple__SymbAssignment_0_2 : ( RULE_SYMBOL ) ;
    public final void rule__ExprSimple__SymbAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4158:1: ( ( RULE_SYMBOL ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4159:1: ( RULE_SYMBOL )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4159:1: ( RULE_SYMBOL )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4160:1: RULE_SYMBOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getSymbSYMBOLTerminalRuleCall_0_2_0()); 
            }
            match(input,RULE_SYMBOL,FOLLOW_RULE_SYMBOL_in_rule__ExprSimple__SymbAssignment_0_28354); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getSymbSYMBOLTerminalRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__SymbAssignment_0_2"


    // $ANTLR start "rule__ExprSimple__ExprConsAssignment_1_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4169:1: rule__ExprSimple__ExprConsAssignment_1_1 : ( ( 'cons' ) ) ;
    public final void rule__ExprSimple__ExprConsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4173:1: ( ( ( 'cons' ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4174:1: ( ( 'cons' ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4174:1: ( ( 'cons' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4175:1: ( 'cons' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprConsConsKeyword_1_1_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4176:1: ( 'cons' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4177:1: 'cons'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprConsConsKeyword_1_1_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__ExprSimple__ExprConsAssignment_1_18390); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprConsConsKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprConsConsKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__ExprConsAssignment_1_1"


    // $ANTLR start "rule__ExprSimple__ExprConsAttAssignment_1_2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4192:1: rule__ExprSimple__ExprConsAttAssignment_1_2 : ( ruleExpr ) ;
    public final void rule__ExprSimple__ExprConsAttAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4196:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4197:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4197:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4198:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprConsAttExprParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__ExprSimple__ExprConsAttAssignment_1_28429);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprConsAttExprParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__ExprConsAttAssignment_1_2"


    // $ANTLR start "rule__ExprSimple__ExprListAssignment_2_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4207:1: rule__ExprSimple__ExprListAssignment_2_1 : ( ( 'list' ) ) ;
    public final void rule__ExprSimple__ExprListAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4211:1: ( ( ( 'list' ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4212:1: ( ( 'list' ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4212:1: ( ( 'list' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4213:1: ( 'list' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprListListKeyword_2_1_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4214:1: ( 'list' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4215:1: 'list'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprListListKeyword_2_1_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__ExprSimple__ExprListAssignment_2_18465); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprListListKeyword_2_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprListListKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__ExprListAssignment_2_1"


    // $ANTLR start "rule__ExprSimple__ExprListAttAssignment_2_2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4230:1: rule__ExprSimple__ExprListAttAssignment_2_2 : ( ruleExpr ) ;
    public final void rule__ExprSimple__ExprListAttAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4234:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4235:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4235:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4236:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprListAttExprParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__ExprSimple__ExprListAttAssignment_2_28504);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprListAttExprParserRuleCall_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__ExprListAttAssignment_2_2"


    // $ANTLR start "rule__ExprSimple__ExprHeadAssignment_3_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4245:1: rule__ExprSimple__ExprHeadAssignment_3_1 : ( ( 'hd' ) ) ;
    public final void rule__ExprSimple__ExprHeadAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4249:1: ( ( ( 'hd' ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4250:1: ( ( 'hd' ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4250:1: ( ( 'hd' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4251:1: ( 'hd' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprHeadHdKeyword_3_1_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4252:1: ( 'hd' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4253:1: 'hd'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprHeadHdKeyword_3_1_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__ExprSimple__ExprHeadAssignment_3_18540); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprHeadHdKeyword_3_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprHeadHdKeyword_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__ExprHeadAssignment_3_1"


    // $ANTLR start "rule__ExprSimple__ExprHeadAttAssignment_3_2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4268:1: rule__ExprSimple__ExprHeadAttAssignment_3_2 : ( ruleExpr ) ;
    public final void rule__ExprSimple__ExprHeadAttAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4272:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4273:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4273:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4274:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprHeadAttExprParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__ExprSimple__ExprHeadAttAssignment_3_28579);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprHeadAttExprParserRuleCall_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__ExprHeadAttAssignment_3_2"


    // $ANTLR start "rule__ExprSimple__ExprTailAssignment_4_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4283:1: rule__ExprSimple__ExprTailAssignment_4_1 : ( ( 'tl' ) ) ;
    public final void rule__ExprSimple__ExprTailAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4287:1: ( ( ( 'tl' ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4288:1: ( ( 'tl' ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4288:1: ( ( 'tl' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4289:1: ( 'tl' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprTailTlKeyword_4_1_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4290:1: ( 'tl' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4291:1: 'tl'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprTailTlKeyword_4_1_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__ExprSimple__ExprTailAssignment_4_18615); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprTailTlKeyword_4_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprTailTlKeyword_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__ExprTailAssignment_4_1"


    // $ANTLR start "rule__ExprSimple__ExprTailAttAssignment_4_2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4306:1: rule__ExprSimple__ExprTailAttAssignment_4_2 : ( ruleExpr ) ;
    public final void rule__ExprSimple__ExprTailAttAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4310:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4311:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4311:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4312:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprTailAttExprParserRuleCall_4_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__ExprSimple__ExprTailAttAssignment_4_28654);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprTailAttExprParserRuleCall_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__ExprTailAttAssignment_4_2"


    // $ANTLR start "rule__ExprSimple__NomSymbAssignment_5_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4321:1: rule__ExprSimple__NomSymbAssignment_5_1 : ( RULE_SYMBOL ) ;
    public final void rule__ExprSimple__NomSymbAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4325:1: ( ( RULE_SYMBOL ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4326:1: ( RULE_SYMBOL )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4326:1: ( RULE_SYMBOL )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4327:1: RULE_SYMBOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getNomSymbSYMBOLTerminalRuleCall_5_1_0()); 
            }
            match(input,RULE_SYMBOL,FOLLOW_RULE_SYMBOL_in_rule__ExprSimple__NomSymbAssignment_5_18685); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getNomSymbSYMBOLTerminalRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__NomSymbAssignment_5_1"


    // $ANTLR start "rule__ExprSimple__SymbAttAssignment_5_2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4336:1: rule__ExprSimple__SymbAttAssignment_5_2 : ( ruleExpr ) ;
    public final void rule__ExprSimple__SymbAttAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4340:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4341:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4341:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4342:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getSymbAttExprParserRuleCall_5_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__ExprSimple__SymbAttAssignment_5_28716);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getSymbAttExprParserRuleCall_5_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__SymbAttAssignment_5_2"


    // $ANTLR start "rule__ExprAnd__ExprOrAssignment_0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4351:1: rule__ExprAnd__ExprOrAssignment_0 : ( ruleExprOr ) ;
    public final void rule__ExprAnd__ExprOrAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4355:1: ( ( ruleExprOr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4356:1: ( ruleExprOr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4356:1: ( ruleExprOr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4357:1: ruleExprOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExprOrExprOrParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExprOr_in_rule__ExprAnd__ExprOrAssignment_08747);
            ruleExprOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndAccess().getExprOrExprOrParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__ExprOrAssignment_0"


    // $ANTLR start "rule__ExprAnd__ExprAndAssignment_1_0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4366:1: rule__ExprAnd__ExprAndAssignment_1_0 : ( ( 'and' ) ) ;
    public final void rule__ExprAnd__ExprAndAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4370:1: ( ( ( 'and' ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4371:1: ( ( 'and' ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4371:1: ( ( 'and' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4372:1: ( 'and' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExprAndAndKeyword_1_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4373:1: ( 'and' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4374:1: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExprAndAndKeyword_1_0_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__ExprAnd__ExprAndAssignment_1_08783); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndAccess().getExprAndAndKeyword_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndAccess().getExprAndAndKeyword_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__ExprAndAssignment_1_0"


    // $ANTLR start "rule__ExprAnd__ExprAndAttAssignment_1_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4389:1: rule__ExprAnd__ExprAndAttAssignment_1_1 : ( ruleExprAnd ) ;
    public final void rule__ExprAnd__ExprAndAttAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4393:1: ( ( ruleExprAnd ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4394:1: ( ruleExprAnd )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4394:1: ( ruleExprAnd )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4395:1: ruleExprAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExprAndAttExprAndParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExprAnd_in_rule__ExprAnd__ExprAndAttAssignment_1_18822);
            ruleExprAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndAccess().getExprAndAttExprAndParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprAnd__ExprAndAttAssignment_1_1"


    // $ANTLR start "rule__ExprOr__ExprNotAssignment_0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4404:1: rule__ExprOr__ExprNotAssignment_0 : ( ruleExprNot ) ;
    public final void rule__ExprOr__ExprNotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4408:1: ( ( ruleExprNot ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4409:1: ( ruleExprNot )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4409:1: ( ruleExprNot )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4410:1: ruleExprNot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExprNotExprNotParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExprNot_in_rule__ExprOr__ExprNotAssignment_08853);
            ruleExprNot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrAccess().getExprNotExprNotParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__ExprNotAssignment_0"


    // $ANTLR start "rule__ExprOr__ExprOrAssignment_1_0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4419:1: rule__ExprOr__ExprOrAssignment_1_0 : ( ( 'or' ) ) ;
    public final void rule__ExprOr__ExprOrAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4423:1: ( ( ( 'or' ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4424:1: ( ( 'or' ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4424:1: ( ( 'or' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4425:1: ( 'or' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExprOrOrKeyword_1_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4426:1: ( 'or' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4427:1: 'or'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExprOrOrKeyword_1_0_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__ExprOr__ExprOrAssignment_1_08889); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrAccess().getExprOrOrKeyword_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrAccess().getExprOrOrKeyword_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__ExprOrAssignment_1_0"


    // $ANTLR start "rule__ExprOr__ExprOrAttAssignment_1_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4442:1: rule__ExprOr__ExprOrAttAssignment_1_1 : ( ruleExprOr ) ;
    public final void rule__ExprOr__ExprOrAttAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4446:1: ( ( ruleExprOr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4447:1: ( ruleExprOr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4447:1: ( ruleExprOr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4448:1: ruleExprOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExprOrAttExprOrParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExprOr_in_rule__ExprOr__ExprOrAttAssignment_1_18928);
            ruleExprOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrAccess().getExprOrAttExprOrParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprOr__ExprOrAttAssignment_1_1"


    // $ANTLR start "rule__ExprNot__NotAssignment_0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4457:1: rule__ExprNot__NotAssignment_0 : ( ( 'not' ) ) ;
    public final void rule__ExprNot__NotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4461:1: ( ( ( 'not' ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4462:1: ( ( 'not' ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4462:1: ( ( 'not' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4463:1: ( 'not' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getNotNotKeyword_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4464:1: ( 'not' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4465:1: 'not'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getNotNotKeyword_0_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__ExprNot__NotAssignment_08964); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotAccess().getNotNotKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotAccess().getNotNotKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprNot__NotAssignment_0"


    // $ANTLR start "rule__ExprNot__ExprEqAssignment_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4480:1: rule__ExprNot__ExprEqAssignment_1 : ( ruleExprEq ) ;
    public final void rule__ExprNot__ExprEqAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4484:1: ( ( ruleExprEq ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4485:1: ( ruleExprEq )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4485:1: ( ruleExprEq )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4486:1: ruleExprEq
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getExprEqExprEqParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExprEq_in_rule__ExprNot__ExprEqAssignment_19003);
            ruleExprEq();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotAccess().getExprEqExprEqParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprNot__ExprEqAssignment_1"


    // $ANTLR start "rule__ExprEq__ExprAssignment_0_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4495:1: rule__ExprEq__ExprAssignment_0_1 : ( ruleExpr ) ;
    public final void rule__ExprEq__ExprAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4499:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4500:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4500:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4501:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExprExprParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__ExprEq__ExprAssignment_0_19034);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getExprExprParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__ExprAssignment_0_1"


    // $ANTLR start "rule__ExprEq__ExprSim1Assignment_1_0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4510:1: rule__ExprEq__ExprSim1Assignment_1_0 : ( ruleExprSimple ) ;
    public final void rule__ExprEq__ExprSim1Assignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4514:1: ( ( ruleExprSimple ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4515:1: ( ruleExprSimple )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4515:1: ( ruleExprSimple )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4516:1: ruleExprSimple
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExprSim1ExprSimpleParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_rule__ExprEq__ExprSim1Assignment_1_09065);
            ruleExprSimple();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getExprSim1ExprSimpleParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__ExprSim1Assignment_1_0"


    // $ANTLR start "rule__ExprEq__ExprSim2Assignment_1_2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4525:1: rule__ExprEq__ExprSim2Assignment_1_2 : ( ruleExprSimple ) ;
    public final void rule__ExprEq__ExprSim2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4529:1: ( ( ruleExprSimple ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4530:1: ( ruleExprSimple )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4530:1: ( ruleExprSimple )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4531:1: ruleExprSimple
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExprSim2ExprSimpleParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_rule__ExprEq__ExprSim2Assignment_1_29096);
            ruleExprSimple();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqAccess().getExprSim2ExprSimpleParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprEq__ExprSim2Assignment_1_2"

    // $ANTLR start synpred8_InternalWhileCpp
    public final void synpred8_InternalWhileCpp_fragment() throws RecognitionException {   
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:641:1: ( ( ( rule__Expr__Group_0__0 ) ) )
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:641:1: ( ( rule__Expr__Group_0__0 ) )
        {
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:641:1: ( ( rule__Expr__Group_0__0 ) )
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:642:1: ( rule__Expr__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExprAccess().getGroup_0()); 
        }
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:643:1: ( rule__Expr__Group_0__0 )
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:643:2: rule__Expr__Group_0__0
        {
        pushFollow(FOLLOW_rule__Expr__Group_0__0_in_synpred8_InternalWhileCpp1332);
        rule__Expr__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred8_InternalWhileCpp

    // $ANTLR start synpred16_InternalWhileCpp
    public final void synpred16_InternalWhileCpp_fragment() throws RecognitionException {   
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:737:1: ( ( ( rule__ExprEq__Group_0__0 ) ) )
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:737:1: ( ( rule__ExprEq__Group_0__0 ) )
        {
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:737:1: ( ( rule__ExprEq__Group_0__0 ) )
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:738:1: ( rule__ExprEq__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExprEqAccess().getGroup_0()); 
        }
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:739:1: ( rule__ExprEq__Group_0__0 )
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:739:2: rule__ExprEq__Group_0__0
        {
        pushFollow(FOLLOW_rule__ExprEq__Group_0__0_in_synpred16_InternalWhileCpp1575);
        rule__ExprEq__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred16_InternalWhileCpp

    // $ANTLR start synpred21_InternalWhileCpp
    public final void synpred21_InternalWhileCpp_fragment() throws RecognitionException {   
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2324:2: ( rule__Exprs__Group_0__0 )
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2324:2: rule__Exprs__Group_0__0
        {
        pushFollow(FOLLOW_rule__Exprs__Group_0__0_in_synpred21_InternalWhileCpp4698);
        rule__Exprs__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_InternalWhileCpp

    // Delegated rules

    public final boolean synpred8_InternalWhileCpp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalWhileCpp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalWhileCpp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalWhileCpp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalWhileCpp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalWhileCpp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__FonctionsAssignment_in_ruleProgram100 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0_in_ruleFunction161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0_in_ruleDefinition221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_entryRuleInput248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInput255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__0_in_ruleInput281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutput_in_entryRuleOutput308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutput315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group__0_in_ruleOutput341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_entryRuleVars368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVars375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group__0_in_ruleVars401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_entryRuleCommands428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommands435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__CommandeAssignment_in_ruleCommands463 = new BitSet(new long[]{0x0000000C22004022L});
    public static final BitSet FOLLOW_rule__Commands__CommandeAssignment_in_ruleCommands475 = new BitSet(new long[]{0x0000000C22004022L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Alternatives_in_ruleCommand538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandWhile_in_entryRuleCommandWhile565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommandWhile572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandWhile__Group__0_in_ruleCommandWhile598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandIf_in_entryRuleCommandIf625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommandIf632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__0_in_ruleCommandIf658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandForEach_in_entryRuleCommandForEach685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommandForEach692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__0_in_ruleCommandForEach718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprs_in_entryRuleExprs745 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprs752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group__0_in_ruleExprs778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Alternatives_in_ruleExpr838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_entryRuleExprSimple865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprSimple872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Alternatives_in_ruleExprSimple898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_entryRuleExprAnd925 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprAnd932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group__0_in_ruleExprAnd958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_entryRuleExprOr985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprOr992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group__0_in_ruleExprOr1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprNot_in_entryRuleExprNot1045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprNot1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNot__Group__0_in_ruleExprNot1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprEq_in_entryRuleExprEq1105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprEq1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Alternatives_in_ruleExprEq1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_0__0_in_rule__Command__Alternatives1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__0_in_rule__Command__Alternatives1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__CmdWhileAssignment_2_in_rule__Command__Alternatives1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__CmdIfAssignment_3_in_rule__Command__Alternatives1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__CmdForEachAssignment_4_in_rule__Command__Alternatives1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandWhile__WAssignment_0_0_in_rule__CommandWhile__Alternatives_01279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__CommandWhile__Alternatives_01298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group_0__0_in_rule__Expr__Alternatives1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__ExprAndAssignment_1_in_rule__Expr__Alternatives1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Alternatives_0_in_rule__ExprSimple__Alternatives1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1__0_in_rule__ExprSimple__Alternatives1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_2__0_in_rule__ExprSimple__Alternatives1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_3__0_in_rule__ExprSimple__Alternatives1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__0_in_rule__ExprSimple__Alternatives1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_5__0_in_rule__ExprSimple__Alternatives1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__NilAssignment_0_0_in_rule__ExprSimple__Alternatives_01506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__VariAssignment_0_1_in_rule__ExprSimple__Alternatives_01524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__SymbAssignment_0_2_in_rule__ExprSimple__Alternatives_01542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__0_in_rule__ExprEq__Alternatives1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__0_in_rule__ExprEq__Alternatives1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__01624 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group__1_in_rule__Function__Group__01627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Function__Group__0__Impl1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__11686 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Function__Group__2_in_rule__Function__Group__11689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__NomAssignment_1_in_rule__Function__Group__1__Impl1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__21746 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Function__Group__3_in_rule__Function__Group__21749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Function__Group__2__Impl1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__31808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__DefinitionAssignment_3_in_rule__Function__Group__3__Impl1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__01873 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__01876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Definition__Group__0__Impl1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__11935 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__11938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__InputsAssignment_1_in_rule__Definition__Group__1__Impl1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__21995 = new BitSet(new long[]{0x0000000C22004020L});
    public static final BitSet FOLLOW_rule__Definition__Group__3_in_rule__Definition__Group__21998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Definition__Group__2__Impl2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__3__Impl_in_rule__Definition__Group__32057 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Definition__Group__4_in_rule__Definition__Group__32060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__CommandesAssignment_3_in_rule__Definition__Group__3__Impl2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__4__Impl_in_rule__Definition__Group__42117 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Definition__Group__5_in_rule__Definition__Group__42120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Definition__Group__4__Impl2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__5__Impl_in_rule__Definition__Group__52179 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Definition__Group__6_in_rule__Definition__Group__52182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Definition__Group__5__Impl2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__6__Impl_in_rule__Definition__Group__62241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__OutputsAssignment_6_in_rule__Definition__Group__6__Impl2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__02312 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Input__Group__1_in_rule__Input__Group__02315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_0__0_in_rule__Input__Group__0__Impl2342 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__12373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__VarInAssignment_1_in_rule__Input__Group__1__Impl2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_0__0__Impl_in_rule__Input__Group_0__02434 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Input__Group_0__1_in_rule__Input__Group_0__02437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__VarInAssignment_0_0_in_rule__Input__Group_0__0__Impl2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_0__1__Impl_in_rule__Input__Group_0__12494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Input__Group_0__1__Impl2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group__0__Impl_in_rule__Output__Group__02557 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Output__Group__1_in_rule__Output__Group__02560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_0__0_in_rule__Output__Group__0__Impl2587 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Output__Group__1__Impl_in_rule__Output__Group__12618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__VarOutAssignment_1_in_rule__Output__Group__1__Impl2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_0__0__Impl_in_rule__Output__Group_0__02679 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Output__Group_0__1_in_rule__Output__Group_0__02682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__VarOutAssignment_0_0_in_rule__Output__Group_0__0__Impl2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_0__1__Impl_in_rule__Output__Group_0__12739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Output__Group_0__1__Impl2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group__0__Impl_in_rule__Vars__Group__02802 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Vars__Group__1_in_rule__Vars__Group__02805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_0__0_in_rule__Vars__Group__0__Impl2832 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Vars__Group__1__Impl_in_rule__Vars__Group__12863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__VarGenAssignment_1_in_rule__Vars__Group__1__Impl2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_0__0__Impl_in_rule__Vars__Group_0__02924 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Vars__Group_0__1_in_rule__Vars__Group_0__02927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__VarGenAssignment_0_0_in_rule__Vars__Group_0__0__Impl2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_0__1__Impl_in_rule__Vars__Group_0__12984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Vars__Group_0__1__Impl3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_0__0__Impl_in_rule__Command__Group_0__03047 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Command__Group_0__1_in_rule__Command__Group_0__03050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__NopAssignment_0_0_in_rule__Command__Group_0__0__Impl3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_0__1__Impl_in_rule__Command__Group_0__13107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Command__Group_0__1__Impl3135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__0__Impl_in_rule__Command__Group_1__03170 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Command__Group_1__1_in_rule__Command__Group_1__03173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__VarsAssignment_1_0_in_rule__Command__Group_1__0__Impl3200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__1__Impl_in_rule__Command__Group_1__13230 = new BitSet(new long[]{0x0000081080000030L});
    public static final BitSet FOLLOW_rule__Command__Group_1__2_in_rule__Command__Group_1__13233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Command__Group_1__1__Impl3261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__2__Impl_in_rule__Command__Group_1__23292 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Command__Group_1__3_in_rule__Command__Group_1__23295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ExprsAssignment_1_2_in_rule__Command__Group_1__2__Impl3322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__3__Impl_in_rule__Command__Group_1__33352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Command__Group_1__3__Impl3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandWhile__Group__0__Impl_in_rule__CommandWhile__Group__03419 = new BitSet(new long[]{0x0000081080000030L});
    public static final BitSet FOLLOW_rule__CommandWhile__Group__1_in_rule__CommandWhile__Group__03422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandWhile__Alternatives_0_in_rule__CommandWhile__Group__0__Impl3449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandWhile__Group__1__Impl_in_rule__CommandWhile__Group__13479 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__CommandWhile__Group__2_in_rule__CommandWhile__Group__13482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandWhile__ExprAssignment_1_in_rule__CommandWhile__Group__1__Impl3509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandWhile__Group__2__Impl_in_rule__CommandWhile__Group__23539 = new BitSet(new long[]{0x0000000C22004020L});
    public static final BitSet FOLLOW_rule__CommandWhile__Group__3_in_rule__CommandWhile__Group__23542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CommandWhile__Group__2__Impl3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandWhile__Group__3__Impl_in_rule__CommandWhile__Group__33601 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__CommandWhile__Group__4_in_rule__CommandWhile__Group__33604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandWhile__CmdsAssignment_3_in_rule__CommandWhile__Group__3__Impl3631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandWhile__Group__4__Impl_in_rule__CommandWhile__Group__43661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CommandWhile__Group__4__Impl3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__0__Impl_in_rule__CommandIf__Group__03730 = new BitSet(new long[]{0x0000081080000030L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__1_in_rule__CommandIf__Group__03733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CommandIf__Group__0__Impl3761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__1__Impl_in_rule__CommandIf__Group__13792 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__2_in_rule__CommandIf__Group__13795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__CondAssignment_1_in_rule__CommandIf__Group__1__Impl3822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__2__Impl_in_rule__CommandIf__Group__23852 = new BitSet(new long[]{0x0000000C22004020L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__3_in_rule__CommandIf__Group__23855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CommandIf__Group__2__Impl3883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__3__Impl_in_rule__CommandIf__Group__33914 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__4_in_rule__CommandIf__Group__33917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__CmdsThenAssignment_3_in_rule__CommandIf__Group__3__Impl3944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__4__Impl_in_rule__CommandIf__Group__43974 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__5_in_rule__CommandIf__Group__43977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__Group_4__0_in_rule__CommandIf__Group__4__Impl4004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__5__Impl_in_rule__CommandIf__Group__54035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CommandIf__Group__5__Impl4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__Group_4__0__Impl_in_rule__CommandIf__Group_4__04106 = new BitSet(new long[]{0x0000000C22004020L});
    public static final BitSet FOLLOW_rule__CommandIf__Group_4__1_in_rule__CommandIf__Group_4__04109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__CommandIf__Group_4__0__Impl4137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__Group_4__1__Impl_in_rule__CommandIf__Group_4__14168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__CmdsElseAssignment_4_1_in_rule__CommandIf__Group_4__1__Impl4195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__0__Impl_in_rule__CommandForEach__Group__04229 = new BitSet(new long[]{0x0000081080000030L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__1_in_rule__CommandForEach__Group__04232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CommandForEach__Group__0__Impl4260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__1__Impl_in_rule__CommandForEach__Group__14291 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__2_in_rule__CommandForEach__Group__14294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__ElemAssignment_1_in_rule__CommandForEach__Group__1__Impl4321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__2__Impl_in_rule__CommandForEach__Group__24351 = new BitSet(new long[]{0x0000081080000030L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__3_in_rule__CommandForEach__Group__24354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__CommandForEach__Group__2__Impl4382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__3__Impl_in_rule__CommandForEach__Group__34413 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__4_in_rule__CommandForEach__Group__34416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__EnsembAssignment_3_in_rule__CommandForEach__Group__3__Impl4443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__4__Impl_in_rule__CommandForEach__Group__44473 = new BitSet(new long[]{0x0000000C22004020L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__5_in_rule__CommandForEach__Group__44476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CommandForEach__Group__4__Impl4504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__5__Impl_in_rule__CommandForEach__Group__54535 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__6_in_rule__CommandForEach__Group__54538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__CmdsAssignment_5_in_rule__CommandForEach__Group__5__Impl4565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__6__Impl_in_rule__CommandForEach__Group__64595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CommandForEach__Group__6__Impl4623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group__0__Impl_in_rule__Exprs__Group__04668 = new BitSet(new long[]{0x0000081080000030L});
    public static final BitSet FOLLOW_rule__Exprs__Group__1_in_rule__Exprs__Group__04671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_0__0_in_rule__Exprs__Group__0__Impl4698 = new BitSet(new long[]{0x0000081080000032L});
    public static final BitSet FOLLOW_rule__Exprs__Group__1__Impl_in_rule__Exprs__Group__14729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__ExpGenAssignment_1_in_rule__Exprs__Group__1__Impl4756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_0__0__Impl_in_rule__Exprs__Group_0__04790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_0_0__0_in_rule__Exprs__Group_0__0__Impl4817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_0_0__0__Impl_in_rule__Exprs__Group_0_0__04849 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Exprs__Group_0_0__1_in_rule__Exprs__Group_0_0__04852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__ExpGenAssignment_0_0_0_in_rule__Exprs__Group_0_0__0__Impl4879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_0_0__1__Impl_in_rule__Exprs__Group_0_0__14909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Exprs__Group_0_0__1__Impl4937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group_0__0__Impl_in_rule__Expr__Group_0__04972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__ExprSimpAssignment_0_0_in_rule__Expr__Group_0__0__Impl4999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1__0__Impl_in_rule__ExprSimple__Group_1__05031 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1__1_in_rule__ExprSimple__Group_1__05034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ExprSimple__Group_1__0__Impl5062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1__1__Impl_in_rule__ExprSimple__Group_1__15093 = new BitSet(new long[]{0x0000081080000030L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1__2_in_rule__ExprSimple__Group_1__15096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__ExprConsAssignment_1_1_in_rule__ExprSimple__Group_1__1__Impl5123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1__2__Impl_in_rule__ExprSimple__Group_1__25153 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1__3_in_rule__ExprSimple__Group_1__25156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__ExprConsAttAssignment_1_2_in_rule__ExprSimple__Group_1__2__Impl5183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1__3__Impl_in_rule__ExprSimple__Group_1__35213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ExprSimple__Group_1__3__Impl5241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_2__0__Impl_in_rule__ExprSimple__Group_2__05280 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_2__1_in_rule__ExprSimple__Group_2__05283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ExprSimple__Group_2__0__Impl5311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_2__1__Impl_in_rule__ExprSimple__Group_2__15342 = new BitSet(new long[]{0x0000081080000030L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_2__2_in_rule__ExprSimple__Group_2__15345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__ExprListAssignment_2_1_in_rule__ExprSimple__Group_2__1__Impl5372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_2__2__Impl_in_rule__ExprSimple__Group_2__25402 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_2__3_in_rule__ExprSimple__Group_2__25405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__ExprListAttAssignment_2_2_in_rule__ExprSimple__Group_2__2__Impl5432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_2__3__Impl_in_rule__ExprSimple__Group_2__35462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ExprSimple__Group_2__3__Impl5490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_3__0__Impl_in_rule__ExprSimple__Group_3__05529 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_3__1_in_rule__ExprSimple__Group_3__05532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ExprSimple__Group_3__0__Impl5560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_3__1__Impl_in_rule__ExprSimple__Group_3__15591 = new BitSet(new long[]{0x0000081080000030L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_3__2_in_rule__ExprSimple__Group_3__15594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__ExprHeadAssignment_3_1_in_rule__ExprSimple__Group_3__1__Impl5621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_3__2__Impl_in_rule__ExprSimple__Group_3__25651 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_3__3_in_rule__ExprSimple__Group_3__25654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__ExprHeadAttAssignment_3_2_in_rule__ExprSimple__Group_3__2__Impl5681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_3__3__Impl_in_rule__ExprSimple__Group_3__35711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ExprSimple__Group_3__3__Impl5739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__0__Impl_in_rule__ExprSimple__Group_4__05778 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__1_in_rule__ExprSimple__Group_4__05781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ExprSimple__Group_4__0__Impl5809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__1__Impl_in_rule__ExprSimple__Group_4__15840 = new BitSet(new long[]{0x0000081080000030L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__2_in_rule__ExprSimple__Group_4__15843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__ExprTailAssignment_4_1_in_rule__ExprSimple__Group_4__1__Impl5870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__2__Impl_in_rule__ExprSimple__Group_4__25900 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__3_in_rule__ExprSimple__Group_4__25903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__ExprTailAttAssignment_4_2_in_rule__ExprSimple__Group_4__2__Impl5930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__3__Impl_in_rule__ExprSimple__Group_4__35960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ExprSimple__Group_4__3__Impl5988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_5__0__Impl_in_rule__ExprSimple__Group_5__06027 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_5__1_in_rule__ExprSimple__Group_5__06030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ExprSimple__Group_5__0__Impl6058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_5__1__Impl_in_rule__ExprSimple__Group_5__16089 = new BitSet(new long[]{0x0000081080000030L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_5__2_in_rule__ExprSimple__Group_5__16092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__NomSymbAssignment_5_1_in_rule__ExprSimple__Group_5__1__Impl6119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_5__2__Impl_in_rule__ExprSimple__Group_5__26149 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_5__3_in_rule__ExprSimple__Group_5__26152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__SymbAttAssignment_5_2_in_rule__ExprSimple__Group_5__2__Impl6179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_5__3__Impl_in_rule__ExprSimple__Group_5__36209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ExprSimple__Group_5__3__Impl6237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group__0__Impl_in_rule__ExprAnd__Group__06276 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group__1_in_rule__ExprAnd__Group__06279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__ExprOrAssignment_0_in_rule__ExprAnd__Group__0__Impl6306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group__1__Impl_in_rule__ExprAnd__Group__16336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__0_in_rule__ExprAnd__Group__1__Impl6363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__0__Impl_in_rule__ExprAnd__Group_1__06398 = new BitSet(new long[]{0x0000081080000030L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__1_in_rule__ExprAnd__Group_1__06401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__ExprAndAssignment_1_0_in_rule__ExprAnd__Group_1__0__Impl6428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__1__Impl_in_rule__ExprAnd__Group_1__16458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__ExprAndAttAssignment_1_1_in_rule__ExprAnd__Group_1__1__Impl6485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group__0__Impl_in_rule__ExprOr__Group__06519 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__ExprOr__Group__1_in_rule__ExprOr__Group__06522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__ExprNotAssignment_0_in_rule__ExprOr__Group__0__Impl6549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group__1__Impl_in_rule__ExprOr__Group__16579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__0_in_rule__ExprOr__Group__1__Impl6606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__0__Impl_in_rule__ExprOr__Group_1__06641 = new BitSet(new long[]{0x0000081080000030L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__1_in_rule__ExprOr__Group_1__06644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__ExprOrAssignment_1_0_in_rule__ExprOr__Group_1__0__Impl6671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__1__Impl_in_rule__ExprOr__Group_1__16701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__ExprOrAttAssignment_1_1_in_rule__ExprOr__Group_1__1__Impl6728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNot__Group__0__Impl_in_rule__ExprNot__Group__06762 = new BitSet(new long[]{0x0000081080000030L});
    public static final BitSet FOLLOW_rule__ExprNot__Group__1_in_rule__ExprNot__Group__06765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNot__NotAssignment_0_in_rule__ExprNot__Group__0__Impl6792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNot__Group__1__Impl_in_rule__ExprNot__Group__16823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNot__ExprEqAssignment_1_in_rule__ExprNot__Group__1__Impl6850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__0__Impl_in_rule__ExprEq__Group_0__06884 = new BitSet(new long[]{0x0000081080000030L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__1_in_rule__ExprEq__Group_0__06887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ExprEq__Group_0__0__Impl6915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__1__Impl_in_rule__ExprEq__Group_0__16946 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__2_in_rule__ExprEq__Group_0__16949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__ExprAssignment_0_1_in_rule__ExprEq__Group_0__1__Impl6976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__2__Impl_in_rule__ExprEq__Group_0__27006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ExprEq__Group_0__2__Impl7034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__0__Impl_in_rule__ExprEq__Group_1__07071 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__1_in_rule__ExprEq__Group_1__07074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__ExprSim1Assignment_1_0_in_rule__ExprEq__Group_1__0__Impl7101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__1__Impl_in_rule__ExprEq__Group_1__17131 = new BitSet(new long[]{0x0000001080000030L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__2_in_rule__ExprEq__Group_1__17134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ExprEq__Group_1__1__Impl7162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__2__Impl_in_rule__ExprEq__Group_1__27193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__ExprSim2Assignment_1_2_in_rule__ExprEq__Group_1__2__Impl7220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_rule__Program__FonctionsAssignment7261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOL_in_rule__Function__NomAssignment_17292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_rule__Function__DefinitionAssignment_37323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_rule__Definition__InputsAssignment_17354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Definition__CommandesAssignment_37385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutput_in_rule__Definition__OutputsAssignment_67416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Input__VarInAssignment_0_07447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Input__VarInAssignment_17478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Output__VarOutAssignment_0_07509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Output__VarOutAssignment_17540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Vars__VarGenAssignment_0_07571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Vars__VarGenAssignment_17602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__Commands__CommandeAssignment7633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Command__NopAssignment_0_07669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_rule__Command__VarsAssignment_1_07708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprs_in_rule__Command__ExprsAssignment_1_27739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandWhile_in_rule__Command__CmdWhileAssignment_27770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandIf_in_rule__Command__CmdIfAssignment_37801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandForEach_in_rule__Command__CmdForEachAssignment_47832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__CommandWhile__WAssignment_0_07868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__CommandWhile__ExprAssignment_17907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__CommandWhile__CmdsAssignment_37938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__CommandIf__CondAssignment_17969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__CommandIf__CmdsThenAssignment_38000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__CommandIf__CmdsElseAssignment_4_18031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__CommandForEach__ElemAssignment_18062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__CommandForEach__EnsembAssignment_38093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__CommandForEach__CmdsAssignment_58124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Exprs__ExpGenAssignment_0_0_08155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Exprs__ExpGenAssignment_18186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_rule__Expr__ExprSimpAssignment_0_08217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_rule__Expr__ExprAndAssignment_18248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ExprSimple__NilAssignment_0_08284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__ExprSimple__VariAssignment_0_18323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOL_in_rule__ExprSimple__SymbAssignment_0_28354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ExprSimple__ExprConsAssignment_1_18390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__ExprSimple__ExprConsAttAssignment_1_28429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ExprSimple__ExprListAssignment_2_18465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__ExprSimple__ExprListAttAssignment_2_28504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ExprSimple__ExprHeadAssignment_3_18540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__ExprSimple__ExprHeadAttAssignment_3_28579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ExprSimple__ExprTailAssignment_4_18615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__ExprSimple__ExprTailAttAssignment_4_28654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOL_in_rule__ExprSimple__NomSymbAssignment_5_18685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__ExprSimple__SymbAttAssignment_5_28716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_rule__ExprAnd__ExprOrAssignment_08747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ExprAnd__ExprAndAssignment_1_08783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_rule__ExprAnd__ExprAndAttAssignment_1_18822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprNot_in_rule__ExprOr__ExprNotAssignment_08853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ExprOr__ExprOrAssignment_1_08889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_rule__ExprOr__ExprOrAttAssignment_1_18928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ExprNot__NotAssignment_08964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprEq_in_rule__ExprNot__ExprEqAssignment_19003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__ExprEq__ExprAssignment_0_19034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_rule__ExprEq__ExprSim1Assignment_1_09065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_rule__ExprEq__ExprSim2Assignment_1_29096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group_0__0_in_synpred8_InternalWhileCpp1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__0_in_synpred16_InternalWhileCpp1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_0__0_in_synpred21_InternalWhileCpp4698 = new BitSet(new long[]{0x0000000000000002L});

}