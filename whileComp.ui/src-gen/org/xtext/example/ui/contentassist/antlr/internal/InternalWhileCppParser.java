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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SYMBOL", "RULE_VARIABLE", "RULE_LC", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'for'", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "':='", "'do'", "'od'", "'if'", "'then'", "'fi'", "'else'", "'foreach'", "'in'", "'('", "')'", "'=?'", "'nop'", "'while'", "'nil'", "'hd'", "'tl'", "'and'", "'or'", "'not'", "'cons'"
    };
    public static final int RULE_LC=6;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=7;
    public static final int RULE_WS=12;
    public static final int RULE_VARIABLE=5;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int RULE_SYMBOL=4;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:238:1: ruleCommands : ( ( rule__Commands__Group__0 ) ) ;
    public final void ruleCommands() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:242:2: ( ( ( rule__Commands__Group__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:243:1: ( ( rule__Commands__Group__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:243:1: ( ( rule__Commands__Group__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:244:1: ( rule__Commands__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getGroup()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:245:1: ( rule__Commands__Group__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:245:2: rule__Commands__Group__0
            {
            pushFollow(FOLLOW_rule__Commands__Group__0_in_ruleCommands461);
            rule__Commands__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getGroup()); 
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:257:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:258:1: ( ruleCommand EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:259:1: ruleCommand EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandRule()); 
            }
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand488);
            ruleCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand495); if (state.failed) return ;

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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:266:1: ruleCommand : ( ( rule__Command__Alternatives ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:270:2: ( ( ( rule__Command__Alternatives ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:271:1: ( ( rule__Command__Alternatives ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:271:1: ( ( rule__Command__Alternatives ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:272:1: ( rule__Command__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getAlternatives()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:273:1: ( rule__Command__Alternatives )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:273:2: rule__Command__Alternatives
            {
            pushFollow(FOLLOW_rule__Command__Alternatives_in_ruleCommand521);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:285:1: entryRuleCommandWhile : ruleCommandWhile EOF ;
    public final void entryRuleCommandWhile() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:286:1: ( ruleCommandWhile EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:287:1: ruleCommandWhile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandWhileRule()); 
            }
            pushFollow(FOLLOW_ruleCommandWhile_in_entryRuleCommandWhile548);
            ruleCommandWhile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandWhileRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommandWhile555); if (state.failed) return ;

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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:294:1: ruleCommandWhile : ( ( rule__CommandWhile__Group__0 ) ) ;
    public final void ruleCommandWhile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:298:2: ( ( ( rule__CommandWhile__Group__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:299:1: ( ( rule__CommandWhile__Group__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:299:1: ( ( rule__CommandWhile__Group__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:300:1: ( rule__CommandWhile__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandWhileAccess().getGroup()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:301:1: ( rule__CommandWhile__Group__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:301:2: rule__CommandWhile__Group__0
            {
            pushFollow(FOLLOW_rule__CommandWhile__Group__0_in_ruleCommandWhile581);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:313:1: entryRuleCommandIf : ruleCommandIf EOF ;
    public final void entryRuleCommandIf() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:314:1: ( ruleCommandIf EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:315:1: ruleCommandIf EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfRule()); 
            }
            pushFollow(FOLLOW_ruleCommandIf_in_entryRuleCommandIf608);
            ruleCommandIf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandIfRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommandIf615); if (state.failed) return ;

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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:322:1: ruleCommandIf : ( ( rule__CommandIf__Group__0 ) ) ;
    public final void ruleCommandIf() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:326:2: ( ( ( rule__CommandIf__Group__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:327:1: ( ( rule__CommandIf__Group__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:327:1: ( ( rule__CommandIf__Group__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:328:1: ( rule__CommandIf__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getGroup()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:329:1: ( rule__CommandIf__Group__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:329:2: rule__CommandIf__Group__0
            {
            pushFollow(FOLLOW_rule__CommandIf__Group__0_in_ruleCommandIf641);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:341:1: entryRuleCommandForEach : ruleCommandForEach EOF ;
    public final void entryRuleCommandForEach() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:342:1: ( ruleCommandForEach EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:343:1: ruleCommandForEach EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachRule()); 
            }
            pushFollow(FOLLOW_ruleCommandForEach_in_entryRuleCommandForEach668);
            ruleCommandForEach();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandForEachRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommandForEach675); if (state.failed) return ;

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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:350:1: ruleCommandForEach : ( ( rule__CommandForEach__Group__0 ) ) ;
    public final void ruleCommandForEach() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:354:2: ( ( ( rule__CommandForEach__Group__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:355:1: ( ( rule__CommandForEach__Group__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:355:1: ( ( rule__CommandForEach__Group__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:356:1: ( rule__CommandForEach__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachAccess().getGroup()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:357:1: ( rule__CommandForEach__Group__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:357:2: rule__CommandForEach__Group__0
            {
            pushFollow(FOLLOW_rule__CommandForEach__Group__0_in_ruleCommandForEach701);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:369:1: entryRuleExprs : ruleExprs EOF ;
    public final void entryRuleExprs() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:370:1: ( ruleExprs EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:371:1: ruleExprs EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsRule()); 
            }
            pushFollow(FOLLOW_ruleExprs_in_entryRuleExprs728);
            ruleExprs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprs735); if (state.failed) return ;

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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:378:1: ruleExprs : ( ( rule__Exprs__Group__0 ) ) ;
    public final void ruleExprs() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:382:2: ( ( ( rule__Exprs__Group__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:383:1: ( ( rule__Exprs__Group__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:383:1: ( ( rule__Exprs__Group__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:384:1: ( rule__Exprs__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getGroup()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:385:1: ( rule__Exprs__Group__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:385:2: rule__Exprs__Group__0
            {
            pushFollow(FOLLOW_rule__Exprs__Group__0_in_ruleExprs761);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:397:1: entryRuleExpr : ruleExpr EOF ;
    public final void entryRuleExpr() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:398:1: ( ruleExpr EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:399:1: ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr788);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr795); if (state.failed) return ;

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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:406:1: ruleExpr : ( ( rule__Expr__Alternatives ) ) ;
    public final void ruleExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:410:2: ( ( ( rule__Expr__Alternatives ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:411:1: ( ( rule__Expr__Alternatives ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:411:1: ( ( rule__Expr__Alternatives ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:412:1: ( rule__Expr__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getAlternatives()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:413:1: ( rule__Expr__Alternatives )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:413:2: rule__Expr__Alternatives
            {
            pushFollow(FOLLOW_rule__Expr__Alternatives_in_ruleExpr821);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:425:1: entryRuleExprSimple : ruleExprSimple EOF ;
    public final void entryRuleExprSimple() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:426:1: ( ruleExprSimple EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:427:1: ruleExprSimple EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleRule()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_entryRuleExprSimple848);
            ruleExprSimple();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprSimple855); if (state.failed) return ;

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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:434:1: ruleExprSimple : ( ( rule__ExprSimple__Alternatives ) ) ;
    public final void ruleExprSimple() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:438:2: ( ( ( rule__ExprSimple__Alternatives ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:439:1: ( ( rule__ExprSimple__Alternatives ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:439:1: ( ( rule__ExprSimple__Alternatives ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:440:1: ( rule__ExprSimple__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getAlternatives()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:441:1: ( rule__ExprSimple__Alternatives )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:441:2: rule__ExprSimple__Alternatives
            {
            pushFollow(FOLLOW_rule__ExprSimple__Alternatives_in_ruleExprSimple881);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:453:1: entryRuleExprAnd : ruleExprAnd EOF ;
    public final void entryRuleExprAnd() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:454:1: ( ruleExprAnd EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:455:1: ruleExprAnd EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndRule()); 
            }
            pushFollow(FOLLOW_ruleExprAnd_in_entryRuleExprAnd908);
            ruleExprAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAndRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprAnd915); if (state.failed) return ;

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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:462:1: ruleExprAnd : ( ( rule__ExprAnd__Group__0 ) ) ;
    public final void ruleExprAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:466:2: ( ( ( rule__ExprAnd__Group__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:467:1: ( ( rule__ExprAnd__Group__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:467:1: ( ( rule__ExprAnd__Group__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:468:1: ( rule__ExprAnd__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getGroup()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:469:1: ( rule__ExprAnd__Group__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:469:2: rule__ExprAnd__Group__0
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group__0_in_ruleExprAnd941);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:481:1: entryRuleExprOr : ruleExprOr EOF ;
    public final void entryRuleExprOr() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:482:1: ( ruleExprOr EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:483:1: ruleExprOr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrRule()); 
            }
            pushFollow(FOLLOW_ruleExprOr_in_entryRuleExprOr968);
            ruleExprOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprOrRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprOr975); if (state.failed) return ;

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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:490:1: ruleExprOr : ( ( rule__ExprOr__Group__0 ) ) ;
    public final void ruleExprOr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:494:2: ( ( ( rule__ExprOr__Group__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:495:1: ( ( rule__ExprOr__Group__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:495:1: ( ( rule__ExprOr__Group__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:496:1: ( rule__ExprOr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getGroup()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:497:1: ( rule__ExprOr__Group__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:497:2: rule__ExprOr__Group__0
            {
            pushFollow(FOLLOW_rule__ExprOr__Group__0_in_ruleExprOr1001);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:509:1: entryRuleExprNot : ruleExprNot EOF ;
    public final void entryRuleExprNot() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:510:1: ( ruleExprNot EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:511:1: ruleExprNot EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotRule()); 
            }
            pushFollow(FOLLOW_ruleExprNot_in_entryRuleExprNot1028);
            ruleExprNot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprNotRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprNot1035); if (state.failed) return ;

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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:518:1: ruleExprNot : ( ( rule__ExprNot__Group__0 ) ) ;
    public final void ruleExprNot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:522:2: ( ( ( rule__ExprNot__Group__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:523:1: ( ( rule__ExprNot__Group__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:523:1: ( ( rule__ExprNot__Group__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:524:1: ( rule__ExprNot__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getGroup()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:525:1: ( rule__ExprNot__Group__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:525:2: rule__ExprNot__Group__0
            {
            pushFollow(FOLLOW_rule__ExprNot__Group__0_in_ruleExprNot1061);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:537:1: entryRuleExprEq : ruleExprEq EOF ;
    public final void entryRuleExprEq() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:538:1: ( ruleExprEq EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:539:1: ruleExprEq EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqRule()); 
            }
            pushFollow(FOLLOW_ruleExprEq_in_entryRuleExprEq1088);
            ruleExprEq();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprEqRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprEq1095); if (state.failed) return ;

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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:546:1: ruleExprEq : ( ( rule__ExprEq__Alternatives ) ) ;
    public final void ruleExprEq() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:550:2: ( ( ( rule__ExprEq__Alternatives ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:551:1: ( ( rule__ExprEq__Alternatives ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:551:1: ( ( rule__ExprEq__Alternatives ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:552:1: ( rule__ExprEq__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getAlternatives()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:553:1: ( rule__ExprEq__Alternatives )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:553:2: rule__ExprEq__Alternatives
            {
            pushFollow(FOLLOW_rule__ExprEq__Alternatives_in_ruleExprEq1121);
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


    // $ANTLR start "entryRuleCons"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:565:1: entryRuleCons : ruleCons EOF ;
    public final void entryRuleCons() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:566:1: ( ruleCons EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:567:1: ruleCons EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConsRule()); 
            }
            pushFollow(FOLLOW_ruleCons_in_entryRuleCons1148);
            ruleCons();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCons1155); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCons"


    // $ANTLR start "ruleCons"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:574:1: ruleCons : ( ( rule__Cons__Group__0 ) ) ;
    public final void ruleCons() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:578:2: ( ( ( rule__Cons__Group__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:579:1: ( ( rule__Cons__Group__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:579:1: ( ( rule__Cons__Group__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:580:1: ( rule__Cons__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConsAccess().getGroup()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:581:1: ( rule__Cons__Group__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:581:2: rule__Cons__Group__0
            {
            pushFollow(FOLLOW_rule__Cons__Group__0_in_ruleCons1181);
            rule__Cons__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConsAccess().getGroup()); 
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
    // $ANTLR end "ruleCons"


    // $ANTLR start "entryRuleConsAttList"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:593:1: entryRuleConsAttList : ruleConsAttList EOF ;
    public final void entryRuleConsAttList() throws RecognitionException {
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:594:1: ( ruleConsAttList EOF )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:595:1: ruleConsAttList EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConsAttListRule()); 
            }
            pushFollow(FOLLOW_ruleConsAttList_in_entryRuleConsAttList1208);
            ruleConsAttList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConsAttListRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConsAttList1215); if (state.failed) return ;

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
    // $ANTLR end "entryRuleConsAttList"


    // $ANTLR start "ruleConsAttList"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:602:1: ruleConsAttList : ( ( ( rule__ConsAttList__ConsListAssignment ) ) ( ( rule__ConsAttList__ConsListAssignment )* ) ) ;
    public final void ruleConsAttList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:606:2: ( ( ( ( rule__ConsAttList__ConsListAssignment ) ) ( ( rule__ConsAttList__ConsListAssignment )* ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:607:1: ( ( ( rule__ConsAttList__ConsListAssignment ) ) ( ( rule__ConsAttList__ConsListAssignment )* ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:607:1: ( ( ( rule__ConsAttList__ConsListAssignment ) ) ( ( rule__ConsAttList__ConsListAssignment )* ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:608:1: ( ( rule__ConsAttList__ConsListAssignment ) ) ( ( rule__ConsAttList__ConsListAssignment )* )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:608:1: ( ( rule__ConsAttList__ConsListAssignment ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:609:1: ( rule__ConsAttList__ConsListAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConsAttListAccess().getConsListAssignment()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:610:1: ( rule__ConsAttList__ConsListAssignment )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:610:2: rule__ConsAttList__ConsListAssignment
            {
            pushFollow(FOLLOW_rule__ConsAttList__ConsListAssignment_in_ruleConsAttList1243);
            rule__ConsAttList__ConsListAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConsAttListAccess().getConsListAssignment()); 
            }

            }

            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:613:1: ( ( rule__ConsAttList__ConsListAssignment )* )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:614:1: ( rule__ConsAttList__ConsListAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConsAttListAccess().getConsListAssignment()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:615:1: ( rule__ConsAttList__ConsListAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_SYMBOL && LA2_0<=RULE_VARIABLE)||LA2_0==31||LA2_0==36||LA2_0==41) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:615:2: rule__ConsAttList__ConsListAssignment
            	    {
            	    pushFollow(FOLLOW_rule__ConsAttList__ConsListAssignment_in_ruleConsAttList1255);
            	    rule__ConsAttList__ConsListAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConsAttListAccess().getConsListAssignment()); 
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
    // $ANTLR end "ruleConsAttList"


    // $ANTLR start "rule__Command__Alternatives"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:628:1: rule__Command__Alternatives : ( ( ( rule__Command__NopAssignment_0 ) ) | ( ( rule__Command__Group_1__0 ) ) | ( ( rule__Command__CmdWhileAssignment_2 ) ) | ( ( rule__Command__CmdIfAssignment_3 ) ) | ( ( rule__Command__CmdForEachAssignment_4 ) ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:632:1: ( ( ( rule__Command__NopAssignment_0 ) ) | ( ( rule__Command__Group_1__0 ) ) | ( ( rule__Command__CmdWhileAssignment_2 ) ) | ( ( rule__Command__CmdIfAssignment_3 ) ) | ( ( rule__Command__CmdForEachAssignment_4 ) ) )
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
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:633:1: ( ( rule__Command__NopAssignment_0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:633:1: ( ( rule__Command__NopAssignment_0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:634:1: ( rule__Command__NopAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getNopAssignment_0()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:635:1: ( rule__Command__NopAssignment_0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:635:2: rule__Command__NopAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Command__NopAssignment_0_in_rule__Command__Alternatives1294);
                    rule__Command__NopAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getNopAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:639:6: ( ( rule__Command__Group_1__0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:639:6: ( ( rule__Command__Group_1__0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:640:1: ( rule__Command__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getGroup_1()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:641:1: ( rule__Command__Group_1__0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:641:2: rule__Command__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Command__Group_1__0_in_rule__Command__Alternatives1312);
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
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:645:6: ( ( rule__Command__CmdWhileAssignment_2 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:645:6: ( ( rule__Command__CmdWhileAssignment_2 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:646:1: ( rule__Command__CmdWhileAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getCmdWhileAssignment_2()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:647:1: ( rule__Command__CmdWhileAssignment_2 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:647:2: rule__Command__CmdWhileAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Command__CmdWhileAssignment_2_in_rule__Command__Alternatives1330);
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
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:651:6: ( ( rule__Command__CmdIfAssignment_3 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:651:6: ( ( rule__Command__CmdIfAssignment_3 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:652:1: ( rule__Command__CmdIfAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getCmdIfAssignment_3()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:653:1: ( rule__Command__CmdIfAssignment_3 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:653:2: rule__Command__CmdIfAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Command__CmdIfAssignment_3_in_rule__Command__Alternatives1348);
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
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:657:6: ( ( rule__Command__CmdForEachAssignment_4 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:657:6: ( ( rule__Command__CmdForEachAssignment_4 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:658:1: ( rule__Command__CmdForEachAssignment_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getCmdForEachAssignment_4()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:659:1: ( rule__Command__CmdForEachAssignment_4 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:659:2: rule__Command__CmdForEachAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Command__CmdForEachAssignment_4_in_rule__Command__Alternatives1366);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:668:1: rule__CommandWhile__Alternatives_0 : ( ( ( rule__CommandWhile__WAssignment_0_0 ) ) | ( 'for' ) );
    public final void rule__CommandWhile__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:672:1: ( ( ( rule__CommandWhile__WAssignment_0_0 ) ) | ( 'for' ) )
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
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:673:1: ( ( rule__CommandWhile__WAssignment_0_0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:673:1: ( ( rule__CommandWhile__WAssignment_0_0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:674:1: ( rule__CommandWhile__WAssignment_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandWhileAccess().getWAssignment_0_0()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:675:1: ( rule__CommandWhile__WAssignment_0_0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:675:2: rule__CommandWhile__WAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__CommandWhile__WAssignment_0_0_in_rule__CommandWhile__Alternatives_01399);
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
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:679:6: ( 'for' )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:679:6: ( 'for' )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:680:1: 'for'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandWhileAccess().getForKeyword_0_1()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__CommandWhile__Alternatives_01418); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:692:1: rule__Expr__Alternatives : ( ( ( rule__Expr__Group_0__0 ) ) | ( ( rule__Expr__ExprAndAssignment_1 ) ) );
    public final void rule__Expr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:696:1: ( ( ( rule__Expr__Group_0__0 ) ) | ( ( rule__Expr__ExprAndAssignment_1 ) ) )
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
            case 41:
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
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:697:1: ( ( rule__Expr__Group_0__0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:697:1: ( ( rule__Expr__Group_0__0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:698:1: ( rule__Expr__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprAccess().getGroup_0()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:699:1: ( rule__Expr__Group_0__0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:699:2: rule__Expr__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Expr__Group_0__0_in_rule__Expr__Alternatives1452);
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
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:703:6: ( ( rule__Expr__ExprAndAssignment_1 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:703:6: ( ( rule__Expr__ExprAndAssignment_1 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:704:1: ( rule__Expr__ExprAndAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprAccess().getExprAndAssignment_1()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:705:1: ( rule__Expr__ExprAndAssignment_1 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:705:2: rule__Expr__ExprAndAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Expr__ExprAndAssignment_1_in_rule__Expr__Alternatives1470);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:714:1: rule__ExprSimple__Alternatives : ( ( ( rule__ExprSimple__Alternatives_0 ) ) | ( ( rule__ExprSimple__Group_1__0 ) ) | ( ( rule__ExprSimple__Group_2__0 ) ) | ( ( rule__ExprSimple__Group_3__0 ) ) | ( ( rule__ExprSimple__Group_4__0 ) ) );
    public final void rule__ExprSimple__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:718:1: ( ( ( rule__ExprSimple__Alternatives_0 ) ) | ( ( rule__ExprSimple__Group_1__0 ) ) | ( ( rule__ExprSimple__Group_2__0 ) ) | ( ( rule__ExprSimple__Group_3__0 ) ) | ( ( rule__ExprSimple__Group_4__0 ) ) )
            int alt6=5;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_SYMBOL && LA6_0<=RULE_VARIABLE)||LA6_0==36) ) {
                alt6=1;
            }
            else if ( (LA6_0==31) ) {
                switch ( input.LA(2) ) {
                case 37:
                    {
                    alt6=3;
                    }
                    break;
                case 38:
                    {
                    alt6=4;
                    }
                    break;
                case RULE_SYMBOL:
                    {
                    alt6=5;
                    }
                    break;
                case 42:
                    {
                    alt6=2;
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
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:719:1: ( ( rule__ExprSimple__Alternatives_0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:719:1: ( ( rule__ExprSimple__Alternatives_0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:720:1: ( rule__ExprSimple__Alternatives_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getAlternatives_0()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:721:1: ( rule__ExprSimple__Alternatives_0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:721:2: rule__ExprSimple__Alternatives_0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__Alternatives_0_in_rule__ExprSimple__Alternatives1503);
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
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:725:6: ( ( rule__ExprSimple__Group_1__0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:725:6: ( ( rule__ExprSimple__Group_1__0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:726:1: ( rule__ExprSimple__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getGroup_1()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:727:1: ( rule__ExprSimple__Group_1__0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:727:2: rule__ExprSimple__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__Group_1__0_in_rule__ExprSimple__Alternatives1521);
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
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:731:6: ( ( rule__ExprSimple__Group_2__0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:731:6: ( ( rule__ExprSimple__Group_2__0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:732:1: ( rule__ExprSimple__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getGroup_2()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:733:1: ( rule__ExprSimple__Group_2__0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:733:2: rule__ExprSimple__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__Group_2__0_in_rule__ExprSimple__Alternatives1539);
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
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:737:6: ( ( rule__ExprSimple__Group_3__0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:737:6: ( ( rule__ExprSimple__Group_3__0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:738:1: ( rule__ExprSimple__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getGroup_3()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:739:1: ( rule__ExprSimple__Group_3__0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:739:2: rule__ExprSimple__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__Group_3__0_in_rule__ExprSimple__Alternatives1557);
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
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:743:6: ( ( rule__ExprSimple__Group_4__0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:743:6: ( ( rule__ExprSimple__Group_4__0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:744:1: ( rule__ExprSimple__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getGroup_4()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:745:1: ( rule__ExprSimple__Group_4__0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:745:2: rule__ExprSimple__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__Group_4__0_in_rule__ExprSimple__Alternatives1575);
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

            }
        }
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:754:1: rule__ExprSimple__Alternatives_0 : ( ( ( rule__ExprSimple__NilAssignment_0_0 ) ) | ( ( rule__ExprSimple__VariAssignment_0_1 ) ) | ( ( rule__ExprSimple__SymbAssignment_0_2 ) ) );
    public final void rule__ExprSimple__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:758:1: ( ( ( rule__ExprSimple__NilAssignment_0_0 ) ) | ( ( rule__ExprSimple__VariAssignment_0_1 ) ) | ( ( rule__ExprSimple__SymbAssignment_0_2 ) ) )
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
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:759:1: ( ( rule__ExprSimple__NilAssignment_0_0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:759:1: ( ( rule__ExprSimple__NilAssignment_0_0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:760:1: ( rule__ExprSimple__NilAssignment_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getNilAssignment_0_0()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:761:1: ( rule__ExprSimple__NilAssignment_0_0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:761:2: rule__ExprSimple__NilAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__NilAssignment_0_0_in_rule__ExprSimple__Alternatives_01608);
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
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:765:6: ( ( rule__ExprSimple__VariAssignment_0_1 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:765:6: ( ( rule__ExprSimple__VariAssignment_0_1 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:766:1: ( rule__ExprSimple__VariAssignment_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getVariAssignment_0_1()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:767:1: ( rule__ExprSimple__VariAssignment_0_1 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:767:2: rule__ExprSimple__VariAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__VariAssignment_0_1_in_rule__ExprSimple__Alternatives_01626);
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
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:771:6: ( ( rule__ExprSimple__SymbAssignment_0_2 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:771:6: ( ( rule__ExprSimple__SymbAssignment_0_2 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:772:1: ( rule__ExprSimple__SymbAssignment_0_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getSymbAssignment_0_2()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:773:1: ( rule__ExprSimple__SymbAssignment_0_2 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:773:2: rule__ExprSimple__SymbAssignment_0_2
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__SymbAssignment_0_2_in_rule__ExprSimple__Alternatives_01644);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:782:1: rule__ExprEq__Alternatives : ( ( ( rule__ExprEq__Group_0__0 ) ) | ( ( rule__ExprEq__Group_1__0 ) ) );
    public final void rule__ExprEq__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:786:1: ( ( ( rule__ExprEq__Group_0__0 ) ) | ( ( rule__ExprEq__Group_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==31) ) {
                int LA8_1 = input.LA(2);

                if ( (synpred15_InternalWhileCpp()) ) {
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
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:787:1: ( ( rule__ExprEq__Group_0__0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:787:1: ( ( rule__ExprEq__Group_0__0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:788:1: ( rule__ExprEq__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprEqAccess().getGroup_0()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:789:1: ( rule__ExprEq__Group_0__0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:789:2: rule__ExprEq__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ExprEq__Group_0__0_in_rule__ExprEq__Alternatives1677);
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
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:793:6: ( ( rule__ExprEq__Group_1__0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:793:6: ( ( rule__ExprEq__Group_1__0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:794:1: ( rule__ExprEq__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprEqAccess().getGroup_1()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:795:1: ( rule__ExprEq__Group_1__0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:795:2: rule__ExprEq__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ExprEq__Group_1__0_in_rule__ExprEq__Alternatives1695);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:806:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:810:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:811:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__01726);
            rule__Function__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__1_in_rule__Function__Group__01729);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:818:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:822:1: ( ( 'function' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:823:1: ( 'function' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:823:1: ( 'function' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:824:1: 'function'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            }
            match(input,15,FOLLOW_15_in_rule__Function__Group__0__Impl1757); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:837:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:841:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:842:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__11788);
            rule__Function__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__2_in_rule__Function__Group__11791);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:849:1: rule__Function__Group__1__Impl : ( ( rule__Function__NomAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:853:1: ( ( ( rule__Function__NomAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:854:1: ( ( rule__Function__NomAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:854:1: ( ( rule__Function__NomAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:855:1: ( rule__Function__NomAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getNomAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:856:1: ( rule__Function__NomAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:856:2: rule__Function__NomAssignment_1
            {
            pushFollow(FOLLOW_rule__Function__NomAssignment_1_in_rule__Function__Group__1__Impl1818);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:866:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:870:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:871:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__21848);
            rule__Function__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__3_in_rule__Function__Group__21851);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:878:1: rule__Function__Group__2__Impl : ( ':' ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:882:1: ( ( ':' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:883:1: ( ':' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:883:1: ( ':' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:884:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getColonKeyword_2()); 
            }
            match(input,16,FOLLOW_16_in_rule__Function__Group__2__Impl1879); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:897:1: rule__Function__Group__3 : rule__Function__Group__3__Impl ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:901:1: ( rule__Function__Group__3__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:902:2: rule__Function__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__31910);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:908:1: rule__Function__Group__3__Impl : ( ( rule__Function__DefinitionAssignment_3 ) ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:912:1: ( ( ( rule__Function__DefinitionAssignment_3 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:913:1: ( ( rule__Function__DefinitionAssignment_3 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:913:1: ( ( rule__Function__DefinitionAssignment_3 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:914:1: ( rule__Function__DefinitionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getDefinitionAssignment_3()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:915:1: ( rule__Function__DefinitionAssignment_3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:915:2: rule__Function__DefinitionAssignment_3
            {
            pushFollow(FOLLOW_rule__Function__DefinitionAssignment_3_in_rule__Function__Group__3__Impl1937);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:933:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:937:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:938:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
            {
            pushFollow(FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__01975);
            rule__Definition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__01978);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:945:1: rule__Definition__Group__0__Impl : ( 'read' ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:949:1: ( ( 'read' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:950:1: ( 'read' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:950:1: ( 'read' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:951:1: 'read'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getReadKeyword_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Definition__Group__0__Impl2006); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:964:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl rule__Definition__Group__2 ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:968:1: ( rule__Definition__Group__1__Impl rule__Definition__Group__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:969:2: rule__Definition__Group__1__Impl rule__Definition__Group__2
            {
            pushFollow(FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__12037);
            rule__Definition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__12040);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:976:1: rule__Definition__Group__1__Impl : ( ( rule__Definition__InputsAssignment_1 ) ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:980:1: ( ( ( rule__Definition__InputsAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:981:1: ( ( rule__Definition__InputsAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:981:1: ( ( rule__Definition__InputsAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:982:1: ( rule__Definition__InputsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getInputsAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:983:1: ( rule__Definition__InputsAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:983:2: rule__Definition__InputsAssignment_1
            {
            pushFollow(FOLLOW_rule__Definition__InputsAssignment_1_in_rule__Definition__Group__1__Impl2067);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:993:1: rule__Definition__Group__2 : rule__Definition__Group__2__Impl rule__Definition__Group__3 ;
    public final void rule__Definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:997:1: ( rule__Definition__Group__2__Impl rule__Definition__Group__3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:998:2: rule__Definition__Group__2__Impl rule__Definition__Group__3
            {
            pushFollow(FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__22097);
            rule__Definition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definition__Group__3_in_rule__Definition__Group__22100);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1005:1: rule__Definition__Group__2__Impl : ( '%' ) ;
    public final void rule__Definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1009:1: ( ( '%' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1010:1: ( '%' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1010:1: ( '%' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1011:1: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getPercentSignKeyword_2()); 
            }
            match(input,18,FOLLOW_18_in_rule__Definition__Group__2__Impl2128); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1024:1: rule__Definition__Group__3 : rule__Definition__Group__3__Impl rule__Definition__Group__4 ;
    public final void rule__Definition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1028:1: ( rule__Definition__Group__3__Impl rule__Definition__Group__4 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1029:2: rule__Definition__Group__3__Impl rule__Definition__Group__4
            {
            pushFollow(FOLLOW_rule__Definition__Group__3__Impl_in_rule__Definition__Group__32159);
            rule__Definition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definition__Group__4_in_rule__Definition__Group__32162);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1036:1: rule__Definition__Group__3__Impl : ( ( rule__Definition__CommandesAssignment_3 ) ) ;
    public final void rule__Definition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1040:1: ( ( ( rule__Definition__CommandesAssignment_3 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1041:1: ( ( rule__Definition__CommandesAssignment_3 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1041:1: ( ( rule__Definition__CommandesAssignment_3 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1042:1: ( rule__Definition__CommandesAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getCommandesAssignment_3()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1043:1: ( rule__Definition__CommandesAssignment_3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1043:2: rule__Definition__CommandesAssignment_3
            {
            pushFollow(FOLLOW_rule__Definition__CommandesAssignment_3_in_rule__Definition__Group__3__Impl2189);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1053:1: rule__Definition__Group__4 : rule__Definition__Group__4__Impl rule__Definition__Group__5 ;
    public final void rule__Definition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1057:1: ( rule__Definition__Group__4__Impl rule__Definition__Group__5 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1058:2: rule__Definition__Group__4__Impl rule__Definition__Group__5
            {
            pushFollow(FOLLOW_rule__Definition__Group__4__Impl_in_rule__Definition__Group__42219);
            rule__Definition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definition__Group__5_in_rule__Definition__Group__42222);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1065:1: rule__Definition__Group__4__Impl : ( '%' ) ;
    public final void rule__Definition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1069:1: ( ( '%' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1070:1: ( '%' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1070:1: ( '%' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1071:1: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getPercentSignKeyword_4()); 
            }
            match(input,18,FOLLOW_18_in_rule__Definition__Group__4__Impl2250); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1084:1: rule__Definition__Group__5 : rule__Definition__Group__5__Impl rule__Definition__Group__6 ;
    public final void rule__Definition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1088:1: ( rule__Definition__Group__5__Impl rule__Definition__Group__6 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1089:2: rule__Definition__Group__5__Impl rule__Definition__Group__6
            {
            pushFollow(FOLLOW_rule__Definition__Group__5__Impl_in_rule__Definition__Group__52281);
            rule__Definition__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definition__Group__6_in_rule__Definition__Group__52284);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1096:1: rule__Definition__Group__5__Impl : ( 'write' ) ;
    public final void rule__Definition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1100:1: ( ( 'write' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1101:1: ( 'write' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1101:1: ( 'write' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1102:1: 'write'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getWriteKeyword_5()); 
            }
            match(input,19,FOLLOW_19_in_rule__Definition__Group__5__Impl2312); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1115:1: rule__Definition__Group__6 : rule__Definition__Group__6__Impl ;
    public final void rule__Definition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1119:1: ( rule__Definition__Group__6__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1120:2: rule__Definition__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group__6__Impl_in_rule__Definition__Group__62343);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1126:1: rule__Definition__Group__6__Impl : ( ( rule__Definition__OutputsAssignment_6 ) ) ;
    public final void rule__Definition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1130:1: ( ( ( rule__Definition__OutputsAssignment_6 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1131:1: ( ( rule__Definition__OutputsAssignment_6 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1131:1: ( ( rule__Definition__OutputsAssignment_6 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1132:1: ( rule__Definition__OutputsAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getOutputsAssignment_6()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1133:1: ( rule__Definition__OutputsAssignment_6 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1133:2: rule__Definition__OutputsAssignment_6
            {
            pushFollow(FOLLOW_rule__Definition__OutputsAssignment_6_in_rule__Definition__Group__6__Impl2370);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1157:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1161:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1162:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__02414);
            rule__Input__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group__1_in_rule__Input__Group__02417);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1169:1: rule__Input__Group__0__Impl : ( ( rule__Input__Group_0__0 )* ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1173:1: ( ( ( rule__Input__Group_0__0 )* ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1174:1: ( ( rule__Input__Group_0__0 )* )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1174:1: ( ( rule__Input__Group_0__0 )* )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1175:1: ( rule__Input__Group_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getGroup_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1176:1: ( rule__Input__Group_0__0 )*
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
            	    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1176:2: rule__Input__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__Input__Group_0__0_in_rule__Input__Group__0__Impl2444);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1186:1: rule__Input__Group__1 : rule__Input__Group__1__Impl ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1190:1: ( rule__Input__Group__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1191:2: rule__Input__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__12475);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1197:1: rule__Input__Group__1__Impl : ( ( rule__Input__VarInAssignment_1 ) ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1201:1: ( ( ( rule__Input__VarInAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1202:1: ( ( rule__Input__VarInAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1202:1: ( ( rule__Input__VarInAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1203:1: ( rule__Input__VarInAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVarInAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1204:1: ( rule__Input__VarInAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1204:2: rule__Input__VarInAssignment_1
            {
            pushFollow(FOLLOW_rule__Input__VarInAssignment_1_in_rule__Input__Group__1__Impl2502);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1218:1: rule__Input__Group_0__0 : rule__Input__Group_0__0__Impl rule__Input__Group_0__1 ;
    public final void rule__Input__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1222:1: ( rule__Input__Group_0__0__Impl rule__Input__Group_0__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1223:2: rule__Input__Group_0__0__Impl rule__Input__Group_0__1
            {
            pushFollow(FOLLOW_rule__Input__Group_0__0__Impl_in_rule__Input__Group_0__02536);
            rule__Input__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group_0__1_in_rule__Input__Group_0__02539);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1230:1: rule__Input__Group_0__0__Impl : ( ( rule__Input__VarInAssignment_0_0 ) ) ;
    public final void rule__Input__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1234:1: ( ( ( rule__Input__VarInAssignment_0_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1235:1: ( ( rule__Input__VarInAssignment_0_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1235:1: ( ( rule__Input__VarInAssignment_0_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1236:1: ( rule__Input__VarInAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVarInAssignment_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1237:1: ( rule__Input__VarInAssignment_0_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1237:2: rule__Input__VarInAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Input__VarInAssignment_0_0_in_rule__Input__Group_0__0__Impl2566);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1247:1: rule__Input__Group_0__1 : rule__Input__Group_0__1__Impl ;
    public final void rule__Input__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1251:1: ( rule__Input__Group_0__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1252:2: rule__Input__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group_0__1__Impl_in_rule__Input__Group_0__12596);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1258:1: rule__Input__Group_0__1__Impl : ( ',' ) ;
    public final void rule__Input__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1262:1: ( ( ',' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1263:1: ( ',' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1263:1: ( ',' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1264:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getCommaKeyword_0_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__Input__Group_0__1__Impl2624); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1281:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1285:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1286:2: rule__Output__Group__0__Impl rule__Output__Group__1
            {
            pushFollow(FOLLOW_rule__Output__Group__0__Impl_in_rule__Output__Group__02659);
            rule__Output__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Output__Group__1_in_rule__Output__Group__02662);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1293:1: rule__Output__Group__0__Impl : ( ( rule__Output__Group_0__0 )* ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1297:1: ( ( ( rule__Output__Group_0__0 )* ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1298:1: ( ( rule__Output__Group_0__0 )* )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1298:1: ( ( rule__Output__Group_0__0 )* )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1299:1: ( rule__Output__Group_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getGroup_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1300:1: ( rule__Output__Group_0__0 )*
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
            	    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1300:2: rule__Output__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__Output__Group_0__0_in_rule__Output__Group__0__Impl2689);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1310:1: rule__Output__Group__1 : rule__Output__Group__1__Impl ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1314:1: ( rule__Output__Group__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1315:2: rule__Output__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Output__Group__1__Impl_in_rule__Output__Group__12720);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1321:1: rule__Output__Group__1__Impl : ( ( rule__Output__VarOutAssignment_1 ) ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1325:1: ( ( ( rule__Output__VarOutAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1326:1: ( ( rule__Output__VarOutAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1326:1: ( ( rule__Output__VarOutAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1327:1: ( rule__Output__VarOutAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVarOutAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1328:1: ( rule__Output__VarOutAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1328:2: rule__Output__VarOutAssignment_1
            {
            pushFollow(FOLLOW_rule__Output__VarOutAssignment_1_in_rule__Output__Group__1__Impl2747);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1342:1: rule__Output__Group_0__0 : rule__Output__Group_0__0__Impl rule__Output__Group_0__1 ;
    public final void rule__Output__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1346:1: ( rule__Output__Group_0__0__Impl rule__Output__Group_0__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1347:2: rule__Output__Group_0__0__Impl rule__Output__Group_0__1
            {
            pushFollow(FOLLOW_rule__Output__Group_0__0__Impl_in_rule__Output__Group_0__02781);
            rule__Output__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Output__Group_0__1_in_rule__Output__Group_0__02784);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1354:1: rule__Output__Group_0__0__Impl : ( ( rule__Output__VarOutAssignment_0_0 ) ) ;
    public final void rule__Output__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1358:1: ( ( ( rule__Output__VarOutAssignment_0_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1359:1: ( ( rule__Output__VarOutAssignment_0_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1359:1: ( ( rule__Output__VarOutAssignment_0_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1360:1: ( rule__Output__VarOutAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVarOutAssignment_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1361:1: ( rule__Output__VarOutAssignment_0_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1361:2: rule__Output__VarOutAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Output__VarOutAssignment_0_0_in_rule__Output__Group_0__0__Impl2811);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1371:1: rule__Output__Group_0__1 : rule__Output__Group_0__1__Impl ;
    public final void rule__Output__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1375:1: ( rule__Output__Group_0__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1376:2: rule__Output__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Output__Group_0__1__Impl_in_rule__Output__Group_0__12841);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1382:1: rule__Output__Group_0__1__Impl : ( ',' ) ;
    public final void rule__Output__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1386:1: ( ( ',' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1387:1: ( ',' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1387:1: ( ',' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1388:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getCommaKeyword_0_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__Output__Group_0__1__Impl2869); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1405:1: rule__Vars__Group__0 : rule__Vars__Group__0__Impl rule__Vars__Group__1 ;
    public final void rule__Vars__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1409:1: ( rule__Vars__Group__0__Impl rule__Vars__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1410:2: rule__Vars__Group__0__Impl rule__Vars__Group__1
            {
            pushFollow(FOLLOW_rule__Vars__Group__0__Impl_in_rule__Vars__Group__02904);
            rule__Vars__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Vars__Group__1_in_rule__Vars__Group__02907);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1417:1: rule__Vars__Group__0__Impl : ( ( rule__Vars__Group_0__0 )* ) ;
    public final void rule__Vars__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1421:1: ( ( ( rule__Vars__Group_0__0 )* ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1422:1: ( ( rule__Vars__Group_0__0 )* )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1422:1: ( ( rule__Vars__Group_0__0 )* )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1423:1: ( rule__Vars__Group_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getGroup_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1424:1: ( rule__Vars__Group_0__0 )*
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
            	    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1424:2: rule__Vars__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__Vars__Group_0__0_in_rule__Vars__Group__0__Impl2934);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1434:1: rule__Vars__Group__1 : rule__Vars__Group__1__Impl ;
    public final void rule__Vars__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1438:1: ( rule__Vars__Group__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1439:2: rule__Vars__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Vars__Group__1__Impl_in_rule__Vars__Group__12965);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1445:1: rule__Vars__Group__1__Impl : ( ( rule__Vars__VarGenAssignment_1 ) ) ;
    public final void rule__Vars__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1449:1: ( ( ( rule__Vars__VarGenAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1450:1: ( ( rule__Vars__VarGenAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1450:1: ( ( rule__Vars__VarGenAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1451:1: ( rule__Vars__VarGenAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getVarGenAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1452:1: ( rule__Vars__VarGenAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1452:2: rule__Vars__VarGenAssignment_1
            {
            pushFollow(FOLLOW_rule__Vars__VarGenAssignment_1_in_rule__Vars__Group__1__Impl2992);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1466:1: rule__Vars__Group_0__0 : rule__Vars__Group_0__0__Impl rule__Vars__Group_0__1 ;
    public final void rule__Vars__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1470:1: ( rule__Vars__Group_0__0__Impl rule__Vars__Group_0__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1471:2: rule__Vars__Group_0__0__Impl rule__Vars__Group_0__1
            {
            pushFollow(FOLLOW_rule__Vars__Group_0__0__Impl_in_rule__Vars__Group_0__03026);
            rule__Vars__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Vars__Group_0__1_in_rule__Vars__Group_0__03029);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1478:1: rule__Vars__Group_0__0__Impl : ( ( rule__Vars__VarGenAssignment_0_0 ) ) ;
    public final void rule__Vars__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1482:1: ( ( ( rule__Vars__VarGenAssignment_0_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1483:1: ( ( rule__Vars__VarGenAssignment_0_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1483:1: ( ( rule__Vars__VarGenAssignment_0_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1484:1: ( rule__Vars__VarGenAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getVarGenAssignment_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1485:1: ( rule__Vars__VarGenAssignment_0_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1485:2: rule__Vars__VarGenAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Vars__VarGenAssignment_0_0_in_rule__Vars__Group_0__0__Impl3056);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1495:1: rule__Vars__Group_0__1 : rule__Vars__Group_0__1__Impl ;
    public final void rule__Vars__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1499:1: ( rule__Vars__Group_0__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1500:2: rule__Vars__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Vars__Group_0__1__Impl_in_rule__Vars__Group_0__13086);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1506:1: rule__Vars__Group_0__1__Impl : ( ',' ) ;
    public final void rule__Vars__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1510:1: ( ( ',' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1511:1: ( ',' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1511:1: ( ',' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1512:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getCommaKeyword_0_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__Vars__Group_0__1__Impl3114); if (state.failed) return ;
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


    // $ANTLR start "rule__Commands__Group__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1529:1: rule__Commands__Group__0 : rule__Commands__Group__0__Impl rule__Commands__Group__1 ;
    public final void rule__Commands__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1533:1: ( rule__Commands__Group__0__Impl rule__Commands__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1534:2: rule__Commands__Group__0__Impl rule__Commands__Group__1
            {
            pushFollow(FOLLOW_rule__Commands__Group__0__Impl_in_rule__Commands__Group__03149);
            rule__Commands__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Commands__Group__1_in_rule__Commands__Group__03152);
            rule__Commands__Group__1();

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
    // $ANTLR end "rule__Commands__Group__0"


    // $ANTLR start "rule__Commands__Group__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1541:1: rule__Commands__Group__0__Impl : ( ( rule__Commands__Group_0__0 )* ) ;
    public final void rule__Commands__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1545:1: ( ( ( rule__Commands__Group_0__0 )* ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1546:1: ( ( rule__Commands__Group_0__0 )* )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1546:1: ( ( rule__Commands__Group_0__0 )* )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1547:1: ( rule__Commands__Group_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getGroup_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1548:1: ( rule__Commands__Group_0__0 )*
            loop12:
            do {
                int alt12=2;
                switch ( input.LA(1) ) {
                case 34:
                    {
                    int LA12_1 = input.LA(2);

                    if ( (synpred19_InternalWhileCpp()) ) {
                        alt12=1;
                    }


                    }
                    break;
                case RULE_VARIABLE:
                    {
                    int LA12_2 = input.LA(2);

                    if ( (synpred19_InternalWhileCpp()) ) {
                        alt12=1;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA12_3 = input.LA(2);

                    if ( (synpred19_InternalWhileCpp()) ) {
                        alt12=1;
                    }


                    }
                    break;
                case 14:
                    {
                    int LA12_4 = input.LA(2);

                    if ( (synpred19_InternalWhileCpp()) ) {
                        alt12=1;
                    }


                    }
                    break;
                case 25:
                    {
                    int LA12_5 = input.LA(2);

                    if ( (synpred19_InternalWhileCpp()) ) {
                        alt12=1;
                    }


                    }
                    break;
                case 29:
                    {
                    int LA12_6 = input.LA(2);

                    if ( (synpred19_InternalWhileCpp()) ) {
                        alt12=1;
                    }


                    }
                    break;

                }

                switch (alt12) {
            	case 1 :
            	    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1548:2: rule__Commands__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__Commands__Group_0__0_in_rule__Commands__Group__0__Impl3179);
            	    rule__Commands__Group_0__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getGroup_0()); 
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
    // $ANTLR end "rule__Commands__Group__0__Impl"


    // $ANTLR start "rule__Commands__Group__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1558:1: rule__Commands__Group__1 : rule__Commands__Group__1__Impl ;
    public final void rule__Commands__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1562:1: ( rule__Commands__Group__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1563:2: rule__Commands__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Commands__Group__1__Impl_in_rule__Commands__Group__13210);
            rule__Commands__Group__1__Impl();

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
    // $ANTLR end "rule__Commands__Group__1"


    // $ANTLR start "rule__Commands__Group__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1569:1: rule__Commands__Group__1__Impl : ( ( rule__Commands__CommandeAssignment_1 ) ) ;
    public final void rule__Commands__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1573:1: ( ( ( rule__Commands__CommandeAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1574:1: ( ( rule__Commands__CommandeAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1574:1: ( ( rule__Commands__CommandeAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1575:1: ( rule__Commands__CommandeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getCommandeAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1576:1: ( rule__Commands__CommandeAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1576:2: rule__Commands__CommandeAssignment_1
            {
            pushFollow(FOLLOW_rule__Commands__CommandeAssignment_1_in_rule__Commands__Group__1__Impl3237);
            rule__Commands__CommandeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getCommandeAssignment_1()); 
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
    // $ANTLR end "rule__Commands__Group__1__Impl"


    // $ANTLR start "rule__Commands__Group_0__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1590:1: rule__Commands__Group_0__0 : rule__Commands__Group_0__0__Impl ;
    public final void rule__Commands__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1594:1: ( rule__Commands__Group_0__0__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1595:2: rule__Commands__Group_0__0__Impl
            {
            pushFollow(FOLLOW_rule__Commands__Group_0__0__Impl_in_rule__Commands__Group_0__03271);
            rule__Commands__Group_0__0__Impl();

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
    // $ANTLR end "rule__Commands__Group_0__0"


    // $ANTLR start "rule__Commands__Group_0__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1601:1: rule__Commands__Group_0__0__Impl : ( ( rule__Commands__Group_0_0__0 ) ) ;
    public final void rule__Commands__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1605:1: ( ( ( rule__Commands__Group_0_0__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1606:1: ( ( rule__Commands__Group_0_0__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1606:1: ( ( rule__Commands__Group_0_0__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1607:1: ( rule__Commands__Group_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getGroup_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1608:1: ( rule__Commands__Group_0_0__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1608:2: rule__Commands__Group_0_0__0
            {
            pushFollow(FOLLOW_rule__Commands__Group_0_0__0_in_rule__Commands__Group_0__0__Impl3298);
            rule__Commands__Group_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getGroup_0_0()); 
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
    // $ANTLR end "rule__Commands__Group_0__0__Impl"


    // $ANTLR start "rule__Commands__Group_0_0__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1620:1: rule__Commands__Group_0_0__0 : rule__Commands__Group_0_0__0__Impl rule__Commands__Group_0_0__1 ;
    public final void rule__Commands__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1624:1: ( rule__Commands__Group_0_0__0__Impl rule__Commands__Group_0_0__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1625:2: rule__Commands__Group_0_0__0__Impl rule__Commands__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__Commands__Group_0_0__0__Impl_in_rule__Commands__Group_0_0__03330);
            rule__Commands__Group_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Commands__Group_0_0__1_in_rule__Commands__Group_0_0__03333);
            rule__Commands__Group_0_0__1();

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
    // $ANTLR end "rule__Commands__Group_0_0__0"


    // $ANTLR start "rule__Commands__Group_0_0__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1632:1: rule__Commands__Group_0_0__0__Impl : ( ( rule__Commands__CommandeAssignment_0_0_0 ) ) ;
    public final void rule__Commands__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1636:1: ( ( ( rule__Commands__CommandeAssignment_0_0_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1637:1: ( ( rule__Commands__CommandeAssignment_0_0_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1637:1: ( ( rule__Commands__CommandeAssignment_0_0_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1638:1: ( rule__Commands__CommandeAssignment_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getCommandeAssignment_0_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1639:1: ( rule__Commands__CommandeAssignment_0_0_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1639:2: rule__Commands__CommandeAssignment_0_0_0
            {
            pushFollow(FOLLOW_rule__Commands__CommandeAssignment_0_0_0_in_rule__Commands__Group_0_0__0__Impl3360);
            rule__Commands__CommandeAssignment_0_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getCommandeAssignment_0_0_0()); 
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
    // $ANTLR end "rule__Commands__Group_0_0__0__Impl"


    // $ANTLR start "rule__Commands__Group_0_0__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1649:1: rule__Commands__Group_0_0__1 : rule__Commands__Group_0_0__1__Impl ;
    public final void rule__Commands__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1653:1: ( rule__Commands__Group_0_0__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1654:2: rule__Commands__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Commands__Group_0_0__1__Impl_in_rule__Commands__Group_0_0__13390);
            rule__Commands__Group_0_0__1__Impl();

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
    // $ANTLR end "rule__Commands__Group_0_0__1"


    // $ANTLR start "rule__Commands__Group_0_0__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1660:1: rule__Commands__Group_0_0__1__Impl : ( ';' ) ;
    public final void rule__Commands__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1664:1: ( ( ';' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1665:1: ( ';' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1665:1: ( ';' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1666:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getSemicolonKeyword_0_0_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__Commands__Group_0_0__1__Impl3418); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getSemicolonKeyword_0_0_1()); 
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
    // $ANTLR end "rule__Commands__Group_0_0__1__Impl"


    // $ANTLR start "rule__Command__Group_1__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1683:1: rule__Command__Group_1__0 : rule__Command__Group_1__0__Impl rule__Command__Group_1__1 ;
    public final void rule__Command__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1687:1: ( rule__Command__Group_1__0__Impl rule__Command__Group_1__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1688:2: rule__Command__Group_1__0__Impl rule__Command__Group_1__1
            {
            pushFollow(FOLLOW_rule__Command__Group_1__0__Impl_in_rule__Command__Group_1__03453);
            rule__Command__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_1__1_in_rule__Command__Group_1__03456);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1695:1: rule__Command__Group_1__0__Impl : ( ( rule__Command__VarsAssignment_1_0 ) ) ;
    public final void rule__Command__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1699:1: ( ( ( rule__Command__VarsAssignment_1_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1700:1: ( ( rule__Command__VarsAssignment_1_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1700:1: ( ( rule__Command__VarsAssignment_1_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1701:1: ( rule__Command__VarsAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getVarsAssignment_1_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1702:1: ( rule__Command__VarsAssignment_1_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1702:2: rule__Command__VarsAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Command__VarsAssignment_1_0_in_rule__Command__Group_1__0__Impl3483);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1712:1: rule__Command__Group_1__1 : rule__Command__Group_1__1__Impl rule__Command__Group_1__2 ;
    public final void rule__Command__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1716:1: ( rule__Command__Group_1__1__Impl rule__Command__Group_1__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1717:2: rule__Command__Group_1__1__Impl rule__Command__Group_1__2
            {
            pushFollow(FOLLOW_rule__Command__Group_1__1__Impl_in_rule__Command__Group_1__13513);
            rule__Command__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_1__2_in_rule__Command__Group_1__13516);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1724:1: rule__Command__Group_1__1__Impl : ( ':=' ) ;
    public final void rule__Command__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1728:1: ( ( ':=' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1729:1: ( ':=' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1729:1: ( ':=' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1730:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getColonEqualsSignKeyword_1_1()); 
            }
            match(input,22,FOLLOW_22_in_rule__Command__Group_1__1__Impl3544); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1743:1: rule__Command__Group_1__2 : rule__Command__Group_1__2__Impl ;
    public final void rule__Command__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1747:1: ( rule__Command__Group_1__2__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1748:2: rule__Command__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_1__2__Impl_in_rule__Command__Group_1__23575);
            rule__Command__Group_1__2__Impl();

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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1754:1: rule__Command__Group_1__2__Impl : ( ( rule__Command__ExprsAssignment_1_2 ) ) ;
    public final void rule__Command__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1758:1: ( ( ( rule__Command__ExprsAssignment_1_2 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1759:1: ( ( rule__Command__ExprsAssignment_1_2 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1759:1: ( ( rule__Command__ExprsAssignment_1_2 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1760:1: ( rule__Command__ExprsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExprsAssignment_1_2()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1761:1: ( rule__Command__ExprsAssignment_1_2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1761:2: rule__Command__ExprsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Command__ExprsAssignment_1_2_in_rule__Command__Group_1__2__Impl3602);
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


    // $ANTLR start "rule__CommandWhile__Group__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1777:1: rule__CommandWhile__Group__0 : rule__CommandWhile__Group__0__Impl rule__CommandWhile__Group__1 ;
    public final void rule__CommandWhile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1781:1: ( rule__CommandWhile__Group__0__Impl rule__CommandWhile__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1782:2: rule__CommandWhile__Group__0__Impl rule__CommandWhile__Group__1
            {
            pushFollow(FOLLOW_rule__CommandWhile__Group__0__Impl_in_rule__CommandWhile__Group__03638);
            rule__CommandWhile__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandWhile__Group__1_in_rule__CommandWhile__Group__03641);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1789:1: rule__CommandWhile__Group__0__Impl : ( ( rule__CommandWhile__Alternatives_0 ) ) ;
    public final void rule__CommandWhile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1793:1: ( ( ( rule__CommandWhile__Alternatives_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1794:1: ( ( rule__CommandWhile__Alternatives_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1794:1: ( ( rule__CommandWhile__Alternatives_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1795:1: ( rule__CommandWhile__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandWhileAccess().getAlternatives_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1796:1: ( rule__CommandWhile__Alternatives_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1796:2: rule__CommandWhile__Alternatives_0
            {
            pushFollow(FOLLOW_rule__CommandWhile__Alternatives_0_in_rule__CommandWhile__Group__0__Impl3668);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1806:1: rule__CommandWhile__Group__1 : rule__CommandWhile__Group__1__Impl rule__CommandWhile__Group__2 ;
    public final void rule__CommandWhile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1810:1: ( rule__CommandWhile__Group__1__Impl rule__CommandWhile__Group__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1811:2: rule__CommandWhile__Group__1__Impl rule__CommandWhile__Group__2
            {
            pushFollow(FOLLOW_rule__CommandWhile__Group__1__Impl_in_rule__CommandWhile__Group__13698);
            rule__CommandWhile__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandWhile__Group__2_in_rule__CommandWhile__Group__13701);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1818:1: rule__CommandWhile__Group__1__Impl : ( ( rule__CommandWhile__ExprAssignment_1 ) ) ;
    public final void rule__CommandWhile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1822:1: ( ( ( rule__CommandWhile__ExprAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1823:1: ( ( rule__CommandWhile__ExprAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1823:1: ( ( rule__CommandWhile__ExprAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1824:1: ( rule__CommandWhile__ExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandWhileAccess().getExprAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1825:1: ( rule__CommandWhile__ExprAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1825:2: rule__CommandWhile__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__CommandWhile__ExprAssignment_1_in_rule__CommandWhile__Group__1__Impl3728);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1835:1: rule__CommandWhile__Group__2 : rule__CommandWhile__Group__2__Impl rule__CommandWhile__Group__3 ;
    public final void rule__CommandWhile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1839:1: ( rule__CommandWhile__Group__2__Impl rule__CommandWhile__Group__3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1840:2: rule__CommandWhile__Group__2__Impl rule__CommandWhile__Group__3
            {
            pushFollow(FOLLOW_rule__CommandWhile__Group__2__Impl_in_rule__CommandWhile__Group__23758);
            rule__CommandWhile__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandWhile__Group__3_in_rule__CommandWhile__Group__23761);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1847:1: rule__CommandWhile__Group__2__Impl : ( 'do' ) ;
    public final void rule__CommandWhile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1851:1: ( ( 'do' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1852:1: ( 'do' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1852:1: ( 'do' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1853:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandWhileAccess().getDoKeyword_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__CommandWhile__Group__2__Impl3789); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1866:1: rule__CommandWhile__Group__3 : rule__CommandWhile__Group__3__Impl rule__CommandWhile__Group__4 ;
    public final void rule__CommandWhile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1870:1: ( rule__CommandWhile__Group__3__Impl rule__CommandWhile__Group__4 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1871:2: rule__CommandWhile__Group__3__Impl rule__CommandWhile__Group__4
            {
            pushFollow(FOLLOW_rule__CommandWhile__Group__3__Impl_in_rule__CommandWhile__Group__33820);
            rule__CommandWhile__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandWhile__Group__4_in_rule__CommandWhile__Group__33823);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1878:1: rule__CommandWhile__Group__3__Impl : ( ( rule__CommandWhile__CmdsAssignment_3 ) ) ;
    public final void rule__CommandWhile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1882:1: ( ( ( rule__CommandWhile__CmdsAssignment_3 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1883:1: ( ( rule__CommandWhile__CmdsAssignment_3 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1883:1: ( ( rule__CommandWhile__CmdsAssignment_3 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1884:1: ( rule__CommandWhile__CmdsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandWhileAccess().getCmdsAssignment_3()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1885:1: ( rule__CommandWhile__CmdsAssignment_3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1885:2: rule__CommandWhile__CmdsAssignment_3
            {
            pushFollow(FOLLOW_rule__CommandWhile__CmdsAssignment_3_in_rule__CommandWhile__Group__3__Impl3850);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1895:1: rule__CommandWhile__Group__4 : rule__CommandWhile__Group__4__Impl ;
    public final void rule__CommandWhile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1899:1: ( rule__CommandWhile__Group__4__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1900:2: rule__CommandWhile__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__CommandWhile__Group__4__Impl_in_rule__CommandWhile__Group__43880);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1906:1: rule__CommandWhile__Group__4__Impl : ( 'od' ) ;
    public final void rule__CommandWhile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1910:1: ( ( 'od' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1911:1: ( 'od' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1911:1: ( 'od' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1912:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandWhileAccess().getOdKeyword_4()); 
            }
            match(input,24,FOLLOW_24_in_rule__CommandWhile__Group__4__Impl3908); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1935:1: rule__CommandIf__Group__0 : rule__CommandIf__Group__0__Impl rule__CommandIf__Group__1 ;
    public final void rule__CommandIf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1939:1: ( rule__CommandIf__Group__0__Impl rule__CommandIf__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1940:2: rule__CommandIf__Group__0__Impl rule__CommandIf__Group__1
            {
            pushFollow(FOLLOW_rule__CommandIf__Group__0__Impl_in_rule__CommandIf__Group__03949);
            rule__CommandIf__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandIf__Group__1_in_rule__CommandIf__Group__03952);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1947:1: rule__CommandIf__Group__0__Impl : ( 'if' ) ;
    public final void rule__CommandIf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1951:1: ( ( 'if' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1952:1: ( 'if' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1952:1: ( 'if' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1953:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getIfKeyword_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__CommandIf__Group__0__Impl3980); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1966:1: rule__CommandIf__Group__1 : rule__CommandIf__Group__1__Impl rule__CommandIf__Group__2 ;
    public final void rule__CommandIf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1970:1: ( rule__CommandIf__Group__1__Impl rule__CommandIf__Group__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1971:2: rule__CommandIf__Group__1__Impl rule__CommandIf__Group__2
            {
            pushFollow(FOLLOW_rule__CommandIf__Group__1__Impl_in_rule__CommandIf__Group__14011);
            rule__CommandIf__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandIf__Group__2_in_rule__CommandIf__Group__14014);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1978:1: rule__CommandIf__Group__1__Impl : ( ( rule__CommandIf__CondAssignment_1 ) ) ;
    public final void rule__CommandIf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1982:1: ( ( ( rule__CommandIf__CondAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1983:1: ( ( rule__CommandIf__CondAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1983:1: ( ( rule__CommandIf__CondAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1984:1: ( rule__CommandIf__CondAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getCondAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1985:1: ( rule__CommandIf__CondAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1985:2: rule__CommandIf__CondAssignment_1
            {
            pushFollow(FOLLOW_rule__CommandIf__CondAssignment_1_in_rule__CommandIf__Group__1__Impl4041);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1995:1: rule__CommandIf__Group__2 : rule__CommandIf__Group__2__Impl rule__CommandIf__Group__3 ;
    public final void rule__CommandIf__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1999:1: ( rule__CommandIf__Group__2__Impl rule__CommandIf__Group__3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2000:2: rule__CommandIf__Group__2__Impl rule__CommandIf__Group__3
            {
            pushFollow(FOLLOW_rule__CommandIf__Group__2__Impl_in_rule__CommandIf__Group__24071);
            rule__CommandIf__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandIf__Group__3_in_rule__CommandIf__Group__24074);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2007:1: rule__CommandIf__Group__2__Impl : ( 'then' ) ;
    public final void rule__CommandIf__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2011:1: ( ( 'then' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2012:1: ( 'then' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2012:1: ( 'then' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2013:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getThenKeyword_2()); 
            }
            match(input,26,FOLLOW_26_in_rule__CommandIf__Group__2__Impl4102); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2026:1: rule__CommandIf__Group__3 : rule__CommandIf__Group__3__Impl rule__CommandIf__Group__4 ;
    public final void rule__CommandIf__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2030:1: ( rule__CommandIf__Group__3__Impl rule__CommandIf__Group__4 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2031:2: rule__CommandIf__Group__3__Impl rule__CommandIf__Group__4
            {
            pushFollow(FOLLOW_rule__CommandIf__Group__3__Impl_in_rule__CommandIf__Group__34133);
            rule__CommandIf__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandIf__Group__4_in_rule__CommandIf__Group__34136);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2038:1: rule__CommandIf__Group__3__Impl : ( ( rule__CommandIf__CmdsThenAssignment_3 ) ) ;
    public final void rule__CommandIf__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2042:1: ( ( ( rule__CommandIf__CmdsThenAssignment_3 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2043:1: ( ( rule__CommandIf__CmdsThenAssignment_3 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2043:1: ( ( rule__CommandIf__CmdsThenAssignment_3 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2044:1: ( rule__CommandIf__CmdsThenAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getCmdsThenAssignment_3()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2045:1: ( rule__CommandIf__CmdsThenAssignment_3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2045:2: rule__CommandIf__CmdsThenAssignment_3
            {
            pushFollow(FOLLOW_rule__CommandIf__CmdsThenAssignment_3_in_rule__CommandIf__Group__3__Impl4163);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2055:1: rule__CommandIf__Group__4 : rule__CommandIf__Group__4__Impl rule__CommandIf__Group__5 ;
    public final void rule__CommandIf__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2059:1: ( rule__CommandIf__Group__4__Impl rule__CommandIf__Group__5 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2060:2: rule__CommandIf__Group__4__Impl rule__CommandIf__Group__5
            {
            pushFollow(FOLLOW_rule__CommandIf__Group__4__Impl_in_rule__CommandIf__Group__44193);
            rule__CommandIf__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandIf__Group__5_in_rule__CommandIf__Group__44196);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2067:1: rule__CommandIf__Group__4__Impl : ( ( rule__CommandIf__Group_4__0 )? ) ;
    public final void rule__CommandIf__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2071:1: ( ( ( rule__CommandIf__Group_4__0 )? ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2072:1: ( ( rule__CommandIf__Group_4__0 )? )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2072:1: ( ( rule__CommandIf__Group_4__0 )? )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2073:1: ( rule__CommandIf__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getGroup_4()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2074:1: ( rule__CommandIf__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2074:2: rule__CommandIf__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__CommandIf__Group_4__0_in_rule__CommandIf__Group__4__Impl4223);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2084:1: rule__CommandIf__Group__5 : rule__CommandIf__Group__5__Impl ;
    public final void rule__CommandIf__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2088:1: ( rule__CommandIf__Group__5__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2089:2: rule__CommandIf__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__CommandIf__Group__5__Impl_in_rule__CommandIf__Group__54254);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2095:1: rule__CommandIf__Group__5__Impl : ( 'fi' ) ;
    public final void rule__CommandIf__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2099:1: ( ( 'fi' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2100:1: ( 'fi' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2100:1: ( 'fi' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2101:1: 'fi'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getFiKeyword_5()); 
            }
            match(input,27,FOLLOW_27_in_rule__CommandIf__Group__5__Impl4282); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2126:1: rule__CommandIf__Group_4__0 : rule__CommandIf__Group_4__0__Impl rule__CommandIf__Group_4__1 ;
    public final void rule__CommandIf__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2130:1: ( rule__CommandIf__Group_4__0__Impl rule__CommandIf__Group_4__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2131:2: rule__CommandIf__Group_4__0__Impl rule__CommandIf__Group_4__1
            {
            pushFollow(FOLLOW_rule__CommandIf__Group_4__0__Impl_in_rule__CommandIf__Group_4__04325);
            rule__CommandIf__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandIf__Group_4__1_in_rule__CommandIf__Group_4__04328);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2138:1: rule__CommandIf__Group_4__0__Impl : ( 'else' ) ;
    public final void rule__CommandIf__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2142:1: ( ( 'else' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2143:1: ( 'else' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2143:1: ( 'else' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2144:1: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getElseKeyword_4_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__CommandIf__Group_4__0__Impl4356); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2157:1: rule__CommandIf__Group_4__1 : rule__CommandIf__Group_4__1__Impl ;
    public final void rule__CommandIf__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2161:1: ( rule__CommandIf__Group_4__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2162:2: rule__CommandIf__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__CommandIf__Group_4__1__Impl_in_rule__CommandIf__Group_4__14387);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2168:1: rule__CommandIf__Group_4__1__Impl : ( ( rule__CommandIf__CmdsElseAssignment_4_1 ) ) ;
    public final void rule__CommandIf__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2172:1: ( ( ( rule__CommandIf__CmdsElseAssignment_4_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2173:1: ( ( rule__CommandIf__CmdsElseAssignment_4_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2173:1: ( ( rule__CommandIf__CmdsElseAssignment_4_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2174:1: ( rule__CommandIf__CmdsElseAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getCmdsElseAssignment_4_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2175:1: ( rule__CommandIf__CmdsElseAssignment_4_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2175:2: rule__CommandIf__CmdsElseAssignment_4_1
            {
            pushFollow(FOLLOW_rule__CommandIf__CmdsElseAssignment_4_1_in_rule__CommandIf__Group_4__1__Impl4414);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2189:1: rule__CommandForEach__Group__0 : rule__CommandForEach__Group__0__Impl rule__CommandForEach__Group__1 ;
    public final void rule__CommandForEach__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2193:1: ( rule__CommandForEach__Group__0__Impl rule__CommandForEach__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2194:2: rule__CommandForEach__Group__0__Impl rule__CommandForEach__Group__1
            {
            pushFollow(FOLLOW_rule__CommandForEach__Group__0__Impl_in_rule__CommandForEach__Group__04448);
            rule__CommandForEach__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandForEach__Group__1_in_rule__CommandForEach__Group__04451);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2201:1: rule__CommandForEach__Group__0__Impl : ( 'foreach' ) ;
    public final void rule__CommandForEach__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2205:1: ( ( 'foreach' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2206:1: ( 'foreach' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2206:1: ( 'foreach' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2207:1: 'foreach'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachAccess().getForeachKeyword_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__CommandForEach__Group__0__Impl4479); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2220:1: rule__CommandForEach__Group__1 : rule__CommandForEach__Group__1__Impl rule__CommandForEach__Group__2 ;
    public final void rule__CommandForEach__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2224:1: ( rule__CommandForEach__Group__1__Impl rule__CommandForEach__Group__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2225:2: rule__CommandForEach__Group__1__Impl rule__CommandForEach__Group__2
            {
            pushFollow(FOLLOW_rule__CommandForEach__Group__1__Impl_in_rule__CommandForEach__Group__14510);
            rule__CommandForEach__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandForEach__Group__2_in_rule__CommandForEach__Group__14513);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2232:1: rule__CommandForEach__Group__1__Impl : ( ( rule__CommandForEach__ElemAssignment_1 ) ) ;
    public final void rule__CommandForEach__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2236:1: ( ( ( rule__CommandForEach__ElemAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2237:1: ( ( rule__CommandForEach__ElemAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2237:1: ( ( rule__CommandForEach__ElemAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2238:1: ( rule__CommandForEach__ElemAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachAccess().getElemAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2239:1: ( rule__CommandForEach__ElemAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2239:2: rule__CommandForEach__ElemAssignment_1
            {
            pushFollow(FOLLOW_rule__CommandForEach__ElemAssignment_1_in_rule__CommandForEach__Group__1__Impl4540);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2249:1: rule__CommandForEach__Group__2 : rule__CommandForEach__Group__2__Impl rule__CommandForEach__Group__3 ;
    public final void rule__CommandForEach__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2253:1: ( rule__CommandForEach__Group__2__Impl rule__CommandForEach__Group__3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2254:2: rule__CommandForEach__Group__2__Impl rule__CommandForEach__Group__3
            {
            pushFollow(FOLLOW_rule__CommandForEach__Group__2__Impl_in_rule__CommandForEach__Group__24570);
            rule__CommandForEach__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandForEach__Group__3_in_rule__CommandForEach__Group__24573);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2261:1: rule__CommandForEach__Group__2__Impl : ( 'in' ) ;
    public final void rule__CommandForEach__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2265:1: ( ( 'in' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2266:1: ( 'in' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2266:1: ( 'in' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2267:1: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachAccess().getInKeyword_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__CommandForEach__Group__2__Impl4601); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2280:1: rule__CommandForEach__Group__3 : rule__CommandForEach__Group__3__Impl rule__CommandForEach__Group__4 ;
    public final void rule__CommandForEach__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2284:1: ( rule__CommandForEach__Group__3__Impl rule__CommandForEach__Group__4 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2285:2: rule__CommandForEach__Group__3__Impl rule__CommandForEach__Group__4
            {
            pushFollow(FOLLOW_rule__CommandForEach__Group__3__Impl_in_rule__CommandForEach__Group__34632);
            rule__CommandForEach__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandForEach__Group__4_in_rule__CommandForEach__Group__34635);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2292:1: rule__CommandForEach__Group__3__Impl : ( ( rule__CommandForEach__EnsembAssignment_3 ) ) ;
    public final void rule__CommandForEach__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2296:1: ( ( ( rule__CommandForEach__EnsembAssignment_3 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2297:1: ( ( rule__CommandForEach__EnsembAssignment_3 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2297:1: ( ( rule__CommandForEach__EnsembAssignment_3 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2298:1: ( rule__CommandForEach__EnsembAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachAccess().getEnsembAssignment_3()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2299:1: ( rule__CommandForEach__EnsembAssignment_3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2299:2: rule__CommandForEach__EnsembAssignment_3
            {
            pushFollow(FOLLOW_rule__CommandForEach__EnsembAssignment_3_in_rule__CommandForEach__Group__3__Impl4662);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2309:1: rule__CommandForEach__Group__4 : rule__CommandForEach__Group__4__Impl rule__CommandForEach__Group__5 ;
    public final void rule__CommandForEach__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2313:1: ( rule__CommandForEach__Group__4__Impl rule__CommandForEach__Group__5 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2314:2: rule__CommandForEach__Group__4__Impl rule__CommandForEach__Group__5
            {
            pushFollow(FOLLOW_rule__CommandForEach__Group__4__Impl_in_rule__CommandForEach__Group__44692);
            rule__CommandForEach__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandForEach__Group__5_in_rule__CommandForEach__Group__44695);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2321:1: rule__CommandForEach__Group__4__Impl : ( 'do' ) ;
    public final void rule__CommandForEach__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2325:1: ( ( 'do' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2326:1: ( 'do' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2326:1: ( 'do' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2327:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachAccess().getDoKeyword_4()); 
            }
            match(input,23,FOLLOW_23_in_rule__CommandForEach__Group__4__Impl4723); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2340:1: rule__CommandForEach__Group__5 : rule__CommandForEach__Group__5__Impl rule__CommandForEach__Group__6 ;
    public final void rule__CommandForEach__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2344:1: ( rule__CommandForEach__Group__5__Impl rule__CommandForEach__Group__6 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2345:2: rule__CommandForEach__Group__5__Impl rule__CommandForEach__Group__6
            {
            pushFollow(FOLLOW_rule__CommandForEach__Group__5__Impl_in_rule__CommandForEach__Group__54754);
            rule__CommandForEach__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandForEach__Group__6_in_rule__CommandForEach__Group__54757);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2352:1: rule__CommandForEach__Group__5__Impl : ( ( rule__CommandForEach__CmdsAssignment_5 ) ) ;
    public final void rule__CommandForEach__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2356:1: ( ( ( rule__CommandForEach__CmdsAssignment_5 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2357:1: ( ( rule__CommandForEach__CmdsAssignment_5 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2357:1: ( ( rule__CommandForEach__CmdsAssignment_5 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2358:1: ( rule__CommandForEach__CmdsAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachAccess().getCmdsAssignment_5()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2359:1: ( rule__CommandForEach__CmdsAssignment_5 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2359:2: rule__CommandForEach__CmdsAssignment_5
            {
            pushFollow(FOLLOW_rule__CommandForEach__CmdsAssignment_5_in_rule__CommandForEach__Group__5__Impl4784);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2369:1: rule__CommandForEach__Group__6 : rule__CommandForEach__Group__6__Impl ;
    public final void rule__CommandForEach__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2373:1: ( rule__CommandForEach__Group__6__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2374:2: rule__CommandForEach__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__CommandForEach__Group__6__Impl_in_rule__CommandForEach__Group__64814);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2380:1: rule__CommandForEach__Group__6__Impl : ( 'od' ) ;
    public final void rule__CommandForEach__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2384:1: ( ( 'od' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2385:1: ( 'od' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2385:1: ( 'od' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2386:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachAccess().getOdKeyword_6()); 
            }
            match(input,24,FOLLOW_24_in_rule__CommandForEach__Group__6__Impl4842); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2413:1: rule__Exprs__Group__0 : rule__Exprs__Group__0__Impl rule__Exprs__Group__1 ;
    public final void rule__Exprs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2417:1: ( rule__Exprs__Group__0__Impl rule__Exprs__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2418:2: rule__Exprs__Group__0__Impl rule__Exprs__Group__1
            {
            pushFollow(FOLLOW_rule__Exprs__Group__0__Impl_in_rule__Exprs__Group__04887);
            rule__Exprs__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Exprs__Group__1_in_rule__Exprs__Group__04890);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2425:1: rule__Exprs__Group__0__Impl : ( ( rule__Exprs__Group_0__0 )* ) ;
    public final void rule__Exprs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2429:1: ( ( ( rule__Exprs__Group_0__0 )* ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2430:1: ( ( rule__Exprs__Group_0__0 )* )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2430:1: ( ( rule__Exprs__Group_0__0 )* )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2431:1: ( rule__Exprs__Group_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getGroup_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2432:1: ( rule__Exprs__Group_0__0 )*
            loop14:
            do {
                int alt14=2;
                switch ( input.LA(1) ) {
                case 36:
                    {
                    int LA14_1 = input.LA(2);

                    if ( (synpred21_InternalWhileCpp()) ) {
                        alt14=1;
                    }


                    }
                    break;
                case RULE_VARIABLE:
                    {
                    int LA14_2 = input.LA(2);

                    if ( (synpred21_InternalWhileCpp()) ) {
                        alt14=1;
                    }


                    }
                    break;
                case RULE_SYMBOL:
                    {
                    int LA14_3 = input.LA(2);

                    if ( (synpred21_InternalWhileCpp()) ) {
                        alt14=1;
                    }


                    }
                    break;
                case 31:
                    {
                    int LA14_4 = input.LA(2);

                    if ( (synpred21_InternalWhileCpp()) ) {
                        alt14=1;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA14_5 = input.LA(2);

                    if ( (synpred21_InternalWhileCpp()) ) {
                        alt14=1;
                    }


                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2432:2: rule__Exprs__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__Exprs__Group_0__0_in_rule__Exprs__Group__0__Impl4917);
            	    rule__Exprs__Group_0__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2442:1: rule__Exprs__Group__1 : rule__Exprs__Group__1__Impl ;
    public final void rule__Exprs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2446:1: ( rule__Exprs__Group__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2447:2: rule__Exprs__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Exprs__Group__1__Impl_in_rule__Exprs__Group__14948);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2453:1: rule__Exprs__Group__1__Impl : ( ( rule__Exprs__ExpGenAssignment_1 ) ) ;
    public final void rule__Exprs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2457:1: ( ( ( rule__Exprs__ExpGenAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2458:1: ( ( rule__Exprs__ExpGenAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2458:1: ( ( rule__Exprs__ExpGenAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2459:1: ( rule__Exprs__ExpGenAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExpGenAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2460:1: ( rule__Exprs__ExpGenAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2460:2: rule__Exprs__ExpGenAssignment_1
            {
            pushFollow(FOLLOW_rule__Exprs__ExpGenAssignment_1_in_rule__Exprs__Group__1__Impl4975);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2474:1: rule__Exprs__Group_0__0 : rule__Exprs__Group_0__0__Impl ;
    public final void rule__Exprs__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2478:1: ( rule__Exprs__Group_0__0__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2479:2: rule__Exprs__Group_0__0__Impl
            {
            pushFollow(FOLLOW_rule__Exprs__Group_0__0__Impl_in_rule__Exprs__Group_0__05009);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2485:1: rule__Exprs__Group_0__0__Impl : ( ( rule__Exprs__Group_0_0__0 ) ) ;
    public final void rule__Exprs__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2489:1: ( ( ( rule__Exprs__Group_0_0__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2490:1: ( ( rule__Exprs__Group_0_0__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2490:1: ( ( rule__Exprs__Group_0_0__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2491:1: ( rule__Exprs__Group_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getGroup_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2492:1: ( rule__Exprs__Group_0_0__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2492:2: rule__Exprs__Group_0_0__0
            {
            pushFollow(FOLLOW_rule__Exprs__Group_0_0__0_in_rule__Exprs__Group_0__0__Impl5036);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2504:1: rule__Exprs__Group_0_0__0 : rule__Exprs__Group_0_0__0__Impl rule__Exprs__Group_0_0__1 ;
    public final void rule__Exprs__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2508:1: ( rule__Exprs__Group_0_0__0__Impl rule__Exprs__Group_0_0__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2509:2: rule__Exprs__Group_0_0__0__Impl rule__Exprs__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__Exprs__Group_0_0__0__Impl_in_rule__Exprs__Group_0_0__05068);
            rule__Exprs__Group_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Exprs__Group_0_0__1_in_rule__Exprs__Group_0_0__05071);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2516:1: rule__Exprs__Group_0_0__0__Impl : ( ( rule__Exprs__ExpGenAssignment_0_0_0 ) ) ;
    public final void rule__Exprs__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2520:1: ( ( ( rule__Exprs__ExpGenAssignment_0_0_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2521:1: ( ( rule__Exprs__ExpGenAssignment_0_0_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2521:1: ( ( rule__Exprs__ExpGenAssignment_0_0_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2522:1: ( rule__Exprs__ExpGenAssignment_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExpGenAssignment_0_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2523:1: ( rule__Exprs__ExpGenAssignment_0_0_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2523:2: rule__Exprs__ExpGenAssignment_0_0_0
            {
            pushFollow(FOLLOW_rule__Exprs__ExpGenAssignment_0_0_0_in_rule__Exprs__Group_0_0__0__Impl5098);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2533:1: rule__Exprs__Group_0_0__1 : rule__Exprs__Group_0_0__1__Impl ;
    public final void rule__Exprs__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2537:1: ( rule__Exprs__Group_0_0__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2538:2: rule__Exprs__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Exprs__Group_0_0__1__Impl_in_rule__Exprs__Group_0_0__15128);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2544:1: rule__Exprs__Group_0_0__1__Impl : ( ',' ) ;
    public final void rule__Exprs__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2548:1: ( ( ',' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2549:1: ( ',' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2549:1: ( ',' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2550:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getCommaKeyword_0_0_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__Exprs__Group_0_0__1__Impl5156); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2567:1: rule__Expr__Group_0__0 : rule__Expr__Group_0__0__Impl ;
    public final void rule__Expr__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2571:1: ( rule__Expr__Group_0__0__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2572:2: rule__Expr__Group_0__0__Impl
            {
            pushFollow(FOLLOW_rule__Expr__Group_0__0__Impl_in_rule__Expr__Group_0__05191);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2578:1: rule__Expr__Group_0__0__Impl : ( ( rule__Expr__ExprSimpAssignment_0_0 ) ) ;
    public final void rule__Expr__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2582:1: ( ( ( rule__Expr__ExprSimpAssignment_0_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2583:1: ( ( rule__Expr__ExprSimpAssignment_0_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2583:1: ( ( rule__Expr__ExprSimpAssignment_0_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2584:1: ( rule__Expr__ExprSimpAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getExprSimpAssignment_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2585:1: ( rule__Expr__ExprSimpAssignment_0_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2585:2: rule__Expr__ExprSimpAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Expr__ExprSimpAssignment_0_0_in_rule__Expr__Group_0__0__Impl5218);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2597:1: rule__ExprSimple__Group_1__0 : rule__ExprSimple__Group_1__0__Impl rule__ExprSimple__Group_1__1 ;
    public final void rule__ExprSimple__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2601:1: ( rule__ExprSimple__Group_1__0__Impl rule__ExprSimple__Group_1__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2602:2: rule__ExprSimple__Group_1__0__Impl rule__ExprSimple__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_1__0__Impl_in_rule__ExprSimple__Group_1__05250);
            rule__ExprSimple__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_1__1_in_rule__ExprSimple__Group_1__05253);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2609:1: rule__ExprSimple__Group_1__0__Impl : ( '(' ) ;
    public final void rule__ExprSimple__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2613:1: ( ( '(' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2614:1: ( '(' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2614:1: ( '(' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2615:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__ExprSimple__Group_1__0__Impl5281); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2628:1: rule__ExprSimple__Group_1__1 : rule__ExprSimple__Group_1__1__Impl rule__ExprSimple__Group_1__2 ;
    public final void rule__ExprSimple__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2632:1: ( rule__ExprSimple__Group_1__1__Impl rule__ExprSimple__Group_1__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2633:2: rule__ExprSimple__Group_1__1__Impl rule__ExprSimple__Group_1__2
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_1__1__Impl_in_rule__ExprSimple__Group_1__15312);
            rule__ExprSimple__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_1__2_in_rule__ExprSimple__Group_1__15315);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2640:1: rule__ExprSimple__Group_1__1__Impl : ( ( rule__ExprSimple__ExprConsAssignment_1_1 ) ) ;
    public final void rule__ExprSimple__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2644:1: ( ( ( rule__ExprSimple__ExprConsAssignment_1_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2645:1: ( ( rule__ExprSimple__ExprConsAssignment_1_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2645:1: ( ( rule__ExprSimple__ExprConsAssignment_1_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2646:1: ( rule__ExprSimple__ExprConsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprConsAssignment_1_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2647:1: ( rule__ExprSimple__ExprConsAssignment_1_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2647:2: rule__ExprSimple__ExprConsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ExprSimple__ExprConsAssignment_1_1_in_rule__ExprSimple__Group_1__1__Impl5342);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2657:1: rule__ExprSimple__Group_1__2 : rule__ExprSimple__Group_1__2__Impl ;
    public final void rule__ExprSimple__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2661:1: ( rule__ExprSimple__Group_1__2__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2662:2: rule__ExprSimple__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_1__2__Impl_in_rule__ExprSimple__Group_1__25372);
            rule__ExprSimple__Group_1__2__Impl();

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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2668:1: rule__ExprSimple__Group_1__2__Impl : ( ')' ) ;
    public final void rule__ExprSimple__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2672:1: ( ( ')' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2673:1: ( ')' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2673:1: ( ')' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2674:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,32,FOLLOW_32_in_rule__ExprSimple__Group_1__2__Impl5400); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_1_2()); 
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


    // $ANTLR start "rule__ExprSimple__Group_2__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2693:1: rule__ExprSimple__Group_2__0 : rule__ExprSimple__Group_2__0__Impl rule__ExprSimple__Group_2__1 ;
    public final void rule__ExprSimple__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2697:1: ( rule__ExprSimple__Group_2__0__Impl rule__ExprSimple__Group_2__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2698:2: rule__ExprSimple__Group_2__0__Impl rule__ExprSimple__Group_2__1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_2__0__Impl_in_rule__ExprSimple__Group_2__05437);
            rule__ExprSimple__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_2__1_in_rule__ExprSimple__Group_2__05440);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2705:1: rule__ExprSimple__Group_2__0__Impl : ( '(' ) ;
    public final void rule__ExprSimple__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2709:1: ( ( '(' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2710:1: ( '(' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2710:1: ( '(' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2711:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__ExprSimple__Group_2__0__Impl5468); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2724:1: rule__ExprSimple__Group_2__1 : rule__ExprSimple__Group_2__1__Impl rule__ExprSimple__Group_2__2 ;
    public final void rule__ExprSimple__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2728:1: ( rule__ExprSimple__Group_2__1__Impl rule__ExprSimple__Group_2__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2729:2: rule__ExprSimple__Group_2__1__Impl rule__ExprSimple__Group_2__2
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_2__1__Impl_in_rule__ExprSimple__Group_2__15499);
            rule__ExprSimple__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_2__2_in_rule__ExprSimple__Group_2__15502);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2736:1: rule__ExprSimple__Group_2__1__Impl : ( ( rule__ExprSimple__ExprHeadAssignment_2_1 ) ) ;
    public final void rule__ExprSimple__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2740:1: ( ( ( rule__ExprSimple__ExprHeadAssignment_2_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2741:1: ( ( rule__ExprSimple__ExprHeadAssignment_2_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2741:1: ( ( rule__ExprSimple__ExprHeadAssignment_2_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2742:1: ( rule__ExprSimple__ExprHeadAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprHeadAssignment_2_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2743:1: ( rule__ExprSimple__ExprHeadAssignment_2_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2743:2: rule__ExprSimple__ExprHeadAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ExprSimple__ExprHeadAssignment_2_1_in_rule__ExprSimple__Group_2__1__Impl5529);
            rule__ExprSimple__ExprHeadAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprHeadAssignment_2_1()); 
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2753:1: rule__ExprSimple__Group_2__2 : rule__ExprSimple__Group_2__2__Impl rule__ExprSimple__Group_2__3 ;
    public final void rule__ExprSimple__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2757:1: ( rule__ExprSimple__Group_2__2__Impl rule__ExprSimple__Group_2__3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2758:2: rule__ExprSimple__Group_2__2__Impl rule__ExprSimple__Group_2__3
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_2__2__Impl_in_rule__ExprSimple__Group_2__25559);
            rule__ExprSimple__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_2__3_in_rule__ExprSimple__Group_2__25562);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2765:1: rule__ExprSimple__Group_2__2__Impl : ( ( rule__ExprSimple__ExprHeadAttAssignment_2_2 ) ) ;
    public final void rule__ExprSimple__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2769:1: ( ( ( rule__ExprSimple__ExprHeadAttAssignment_2_2 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2770:1: ( ( rule__ExprSimple__ExprHeadAttAssignment_2_2 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2770:1: ( ( rule__ExprSimple__ExprHeadAttAssignment_2_2 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2771:1: ( rule__ExprSimple__ExprHeadAttAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprHeadAttAssignment_2_2()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2772:1: ( rule__ExprSimple__ExprHeadAttAssignment_2_2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2772:2: rule__ExprSimple__ExprHeadAttAssignment_2_2
            {
            pushFollow(FOLLOW_rule__ExprSimple__ExprHeadAttAssignment_2_2_in_rule__ExprSimple__Group_2__2__Impl5589);
            rule__ExprSimple__ExprHeadAttAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprHeadAttAssignment_2_2()); 
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2782:1: rule__ExprSimple__Group_2__3 : rule__ExprSimple__Group_2__3__Impl ;
    public final void rule__ExprSimple__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2786:1: ( rule__ExprSimple__Group_2__3__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2787:2: rule__ExprSimple__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_2__3__Impl_in_rule__ExprSimple__Group_2__35619);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2793:1: rule__ExprSimple__Group_2__3__Impl : ( ')' ) ;
    public final void rule__ExprSimple__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2797:1: ( ( ')' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2798:1: ( ')' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2798:1: ( ')' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2799:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_2_3()); 
            }
            match(input,32,FOLLOW_32_in_rule__ExprSimple__Group_2__3__Impl5647); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2820:1: rule__ExprSimple__Group_3__0 : rule__ExprSimple__Group_3__0__Impl rule__ExprSimple__Group_3__1 ;
    public final void rule__ExprSimple__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2824:1: ( rule__ExprSimple__Group_3__0__Impl rule__ExprSimple__Group_3__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2825:2: rule__ExprSimple__Group_3__0__Impl rule__ExprSimple__Group_3__1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_3__0__Impl_in_rule__ExprSimple__Group_3__05686);
            rule__ExprSimple__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_3__1_in_rule__ExprSimple__Group_3__05689);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2832:1: rule__ExprSimple__Group_3__0__Impl : ( '(' ) ;
    public final void rule__ExprSimple__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2836:1: ( ( '(' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2837:1: ( '(' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2837:1: ( '(' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2838:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__ExprSimple__Group_3__0__Impl5717); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2851:1: rule__ExprSimple__Group_3__1 : rule__ExprSimple__Group_3__1__Impl rule__ExprSimple__Group_3__2 ;
    public final void rule__ExprSimple__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2855:1: ( rule__ExprSimple__Group_3__1__Impl rule__ExprSimple__Group_3__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2856:2: rule__ExprSimple__Group_3__1__Impl rule__ExprSimple__Group_3__2
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_3__1__Impl_in_rule__ExprSimple__Group_3__15748);
            rule__ExprSimple__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_3__2_in_rule__ExprSimple__Group_3__15751);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2863:1: rule__ExprSimple__Group_3__1__Impl : ( ( rule__ExprSimple__ExprTailAssignment_3_1 ) ) ;
    public final void rule__ExprSimple__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2867:1: ( ( ( rule__ExprSimple__ExprTailAssignment_3_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2868:1: ( ( rule__ExprSimple__ExprTailAssignment_3_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2868:1: ( ( rule__ExprSimple__ExprTailAssignment_3_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2869:1: ( rule__ExprSimple__ExprTailAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprTailAssignment_3_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2870:1: ( rule__ExprSimple__ExprTailAssignment_3_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2870:2: rule__ExprSimple__ExprTailAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ExprSimple__ExprTailAssignment_3_1_in_rule__ExprSimple__Group_3__1__Impl5778);
            rule__ExprSimple__ExprTailAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprTailAssignment_3_1()); 
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2880:1: rule__ExprSimple__Group_3__2 : rule__ExprSimple__Group_3__2__Impl rule__ExprSimple__Group_3__3 ;
    public final void rule__ExprSimple__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2884:1: ( rule__ExprSimple__Group_3__2__Impl rule__ExprSimple__Group_3__3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2885:2: rule__ExprSimple__Group_3__2__Impl rule__ExprSimple__Group_3__3
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_3__2__Impl_in_rule__ExprSimple__Group_3__25808);
            rule__ExprSimple__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_3__3_in_rule__ExprSimple__Group_3__25811);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2892:1: rule__ExprSimple__Group_3__2__Impl : ( ( rule__ExprSimple__ExprTailAttAssignment_3_2 ) ) ;
    public final void rule__ExprSimple__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2896:1: ( ( ( rule__ExprSimple__ExprTailAttAssignment_3_2 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2897:1: ( ( rule__ExprSimple__ExprTailAttAssignment_3_2 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2897:1: ( ( rule__ExprSimple__ExprTailAttAssignment_3_2 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2898:1: ( rule__ExprSimple__ExprTailAttAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprTailAttAssignment_3_2()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2899:1: ( rule__ExprSimple__ExprTailAttAssignment_3_2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2899:2: rule__ExprSimple__ExprTailAttAssignment_3_2
            {
            pushFollow(FOLLOW_rule__ExprSimple__ExprTailAttAssignment_3_2_in_rule__ExprSimple__Group_3__2__Impl5838);
            rule__ExprSimple__ExprTailAttAssignment_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprTailAttAssignment_3_2()); 
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2909:1: rule__ExprSimple__Group_3__3 : rule__ExprSimple__Group_3__3__Impl ;
    public final void rule__ExprSimple__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2913:1: ( rule__ExprSimple__Group_3__3__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2914:2: rule__ExprSimple__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_3__3__Impl_in_rule__ExprSimple__Group_3__35868);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2920:1: rule__ExprSimple__Group_3__3__Impl : ( ')' ) ;
    public final void rule__ExprSimple__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2924:1: ( ( ')' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2925:1: ( ')' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2925:1: ( ')' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2926:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_3_3()); 
            }
            match(input,32,FOLLOW_32_in_rule__ExprSimple__Group_3__3__Impl5896); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2947:1: rule__ExprSimple__Group_4__0 : rule__ExprSimple__Group_4__0__Impl rule__ExprSimple__Group_4__1 ;
    public final void rule__ExprSimple__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2951:1: ( rule__ExprSimple__Group_4__0__Impl rule__ExprSimple__Group_4__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2952:2: rule__ExprSimple__Group_4__0__Impl rule__ExprSimple__Group_4__1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_4__0__Impl_in_rule__ExprSimple__Group_4__05935);
            rule__ExprSimple__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_4__1_in_rule__ExprSimple__Group_4__05938);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2959:1: rule__ExprSimple__Group_4__0__Impl : ( '(' ) ;
    public final void rule__ExprSimple__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2963:1: ( ( '(' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2964:1: ( '(' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2964:1: ( '(' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2965:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_4_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__ExprSimple__Group_4__0__Impl5966); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2978:1: rule__ExprSimple__Group_4__1 : rule__ExprSimple__Group_4__1__Impl rule__ExprSimple__Group_4__2 ;
    public final void rule__ExprSimple__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2982:1: ( rule__ExprSimple__Group_4__1__Impl rule__ExprSimple__Group_4__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2983:2: rule__ExprSimple__Group_4__1__Impl rule__ExprSimple__Group_4__2
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_4__1__Impl_in_rule__ExprSimple__Group_4__15997);
            rule__ExprSimple__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_4__2_in_rule__ExprSimple__Group_4__16000);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2990:1: rule__ExprSimple__Group_4__1__Impl : ( ( rule__ExprSimple__NomSymbAssignment_4_1 ) ) ;
    public final void rule__ExprSimple__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2994:1: ( ( ( rule__ExprSimple__NomSymbAssignment_4_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2995:1: ( ( rule__ExprSimple__NomSymbAssignment_4_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2995:1: ( ( rule__ExprSimple__NomSymbAssignment_4_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2996:1: ( rule__ExprSimple__NomSymbAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getNomSymbAssignment_4_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2997:1: ( rule__ExprSimple__NomSymbAssignment_4_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2997:2: rule__ExprSimple__NomSymbAssignment_4_1
            {
            pushFollow(FOLLOW_rule__ExprSimple__NomSymbAssignment_4_1_in_rule__ExprSimple__Group_4__1__Impl6027);
            rule__ExprSimple__NomSymbAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getNomSymbAssignment_4_1()); 
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3007:1: rule__ExprSimple__Group_4__2 : rule__ExprSimple__Group_4__2__Impl rule__ExprSimple__Group_4__3 ;
    public final void rule__ExprSimple__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3011:1: ( rule__ExprSimple__Group_4__2__Impl rule__ExprSimple__Group_4__3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3012:2: rule__ExprSimple__Group_4__2__Impl rule__ExprSimple__Group_4__3
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_4__2__Impl_in_rule__ExprSimple__Group_4__26057);
            rule__ExprSimple__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_4__3_in_rule__ExprSimple__Group_4__26060);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3019:1: rule__ExprSimple__Group_4__2__Impl : ( ( rule__ExprSimple__SymbAttAssignment_4_2 ) ) ;
    public final void rule__ExprSimple__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3023:1: ( ( ( rule__ExprSimple__SymbAttAssignment_4_2 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3024:1: ( ( rule__ExprSimple__SymbAttAssignment_4_2 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3024:1: ( ( rule__ExprSimple__SymbAttAssignment_4_2 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3025:1: ( rule__ExprSimple__SymbAttAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getSymbAttAssignment_4_2()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3026:1: ( rule__ExprSimple__SymbAttAssignment_4_2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3026:2: rule__ExprSimple__SymbAttAssignment_4_2
            {
            pushFollow(FOLLOW_rule__ExprSimple__SymbAttAssignment_4_2_in_rule__ExprSimple__Group_4__2__Impl6087);
            rule__ExprSimple__SymbAttAssignment_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getSymbAttAssignment_4_2()); 
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3036:1: rule__ExprSimple__Group_4__3 : rule__ExprSimple__Group_4__3__Impl ;
    public final void rule__ExprSimple__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3040:1: ( rule__ExprSimple__Group_4__3__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3041:2: rule__ExprSimple__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_4__3__Impl_in_rule__ExprSimple__Group_4__36117);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3047:1: rule__ExprSimple__Group_4__3__Impl : ( ')' ) ;
    public final void rule__ExprSimple__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3051:1: ( ( ')' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3052:1: ( ')' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3052:1: ( ')' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3053:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_4_3()); 
            }
            match(input,32,FOLLOW_32_in_rule__ExprSimple__Group_4__3__Impl6145); if (state.failed) return ;
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


    // $ANTLR start "rule__ExprAnd__Group__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3074:1: rule__ExprAnd__Group__0 : rule__ExprAnd__Group__0__Impl rule__ExprAnd__Group__1 ;
    public final void rule__ExprAnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3078:1: ( rule__ExprAnd__Group__0__Impl rule__ExprAnd__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3079:2: rule__ExprAnd__Group__0__Impl rule__ExprAnd__Group__1
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group__0__Impl_in_rule__ExprAnd__Group__06184);
            rule__ExprAnd__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprAnd__Group__1_in_rule__ExprAnd__Group__06187);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3086:1: rule__ExprAnd__Group__0__Impl : ( ( rule__ExprAnd__ExprOrAssignment_0 ) ) ;
    public final void rule__ExprAnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3090:1: ( ( ( rule__ExprAnd__ExprOrAssignment_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3091:1: ( ( rule__ExprAnd__ExprOrAssignment_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3091:1: ( ( rule__ExprAnd__ExprOrAssignment_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3092:1: ( rule__ExprAnd__ExprOrAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExprOrAssignment_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3093:1: ( rule__ExprAnd__ExprOrAssignment_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3093:2: rule__ExprAnd__ExprOrAssignment_0
            {
            pushFollow(FOLLOW_rule__ExprAnd__ExprOrAssignment_0_in_rule__ExprAnd__Group__0__Impl6214);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3103:1: rule__ExprAnd__Group__1 : rule__ExprAnd__Group__1__Impl ;
    public final void rule__ExprAnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3107:1: ( rule__ExprAnd__Group__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3108:2: rule__ExprAnd__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group__1__Impl_in_rule__ExprAnd__Group__16244);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3114:1: rule__ExprAnd__Group__1__Impl : ( ( rule__ExprAnd__Group_1__0 )? ) ;
    public final void rule__ExprAnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3118:1: ( ( ( rule__ExprAnd__Group_1__0 )? ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3119:1: ( ( rule__ExprAnd__Group_1__0 )? )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3119:1: ( ( rule__ExprAnd__Group_1__0 )? )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3120:1: ( rule__ExprAnd__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getGroup_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3121:1: ( rule__ExprAnd__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3121:2: rule__ExprAnd__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ExprAnd__Group_1__0_in_rule__ExprAnd__Group__1__Impl6271);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3135:1: rule__ExprAnd__Group_1__0 : rule__ExprAnd__Group_1__0__Impl rule__ExprAnd__Group_1__1 ;
    public final void rule__ExprAnd__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3139:1: ( rule__ExprAnd__Group_1__0__Impl rule__ExprAnd__Group_1__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3140:2: rule__ExprAnd__Group_1__0__Impl rule__ExprAnd__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group_1__0__Impl_in_rule__ExprAnd__Group_1__06306);
            rule__ExprAnd__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprAnd__Group_1__1_in_rule__ExprAnd__Group_1__06309);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3147:1: rule__ExprAnd__Group_1__0__Impl : ( ( rule__ExprAnd__ExprAndAssignment_1_0 ) ) ;
    public final void rule__ExprAnd__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3151:1: ( ( ( rule__ExprAnd__ExprAndAssignment_1_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3152:1: ( ( rule__ExprAnd__ExprAndAssignment_1_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3152:1: ( ( rule__ExprAnd__ExprAndAssignment_1_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3153:1: ( rule__ExprAnd__ExprAndAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExprAndAssignment_1_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3154:1: ( rule__ExprAnd__ExprAndAssignment_1_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3154:2: rule__ExprAnd__ExprAndAssignment_1_0
            {
            pushFollow(FOLLOW_rule__ExprAnd__ExprAndAssignment_1_0_in_rule__ExprAnd__Group_1__0__Impl6336);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3164:1: rule__ExprAnd__Group_1__1 : rule__ExprAnd__Group_1__1__Impl ;
    public final void rule__ExprAnd__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3168:1: ( rule__ExprAnd__Group_1__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3169:2: rule__ExprAnd__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group_1__1__Impl_in_rule__ExprAnd__Group_1__16366);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3175:1: rule__ExprAnd__Group_1__1__Impl : ( ( rule__ExprAnd__ExprAndAttAssignment_1_1 ) ) ;
    public final void rule__ExprAnd__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3179:1: ( ( ( rule__ExprAnd__ExprAndAttAssignment_1_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3180:1: ( ( rule__ExprAnd__ExprAndAttAssignment_1_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3180:1: ( ( rule__ExprAnd__ExprAndAttAssignment_1_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3181:1: ( rule__ExprAnd__ExprAndAttAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExprAndAttAssignment_1_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3182:1: ( rule__ExprAnd__ExprAndAttAssignment_1_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3182:2: rule__ExprAnd__ExprAndAttAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ExprAnd__ExprAndAttAssignment_1_1_in_rule__ExprAnd__Group_1__1__Impl6393);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3196:1: rule__ExprOr__Group__0 : rule__ExprOr__Group__0__Impl rule__ExprOr__Group__1 ;
    public final void rule__ExprOr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3200:1: ( rule__ExprOr__Group__0__Impl rule__ExprOr__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3201:2: rule__ExprOr__Group__0__Impl rule__ExprOr__Group__1
            {
            pushFollow(FOLLOW_rule__ExprOr__Group__0__Impl_in_rule__ExprOr__Group__06427);
            rule__ExprOr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprOr__Group__1_in_rule__ExprOr__Group__06430);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3208:1: rule__ExprOr__Group__0__Impl : ( ( rule__ExprOr__ExprNotAssignment_0 ) ) ;
    public final void rule__ExprOr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3212:1: ( ( ( rule__ExprOr__ExprNotAssignment_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3213:1: ( ( rule__ExprOr__ExprNotAssignment_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3213:1: ( ( rule__ExprOr__ExprNotAssignment_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3214:1: ( rule__ExprOr__ExprNotAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExprNotAssignment_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3215:1: ( rule__ExprOr__ExprNotAssignment_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3215:2: rule__ExprOr__ExprNotAssignment_0
            {
            pushFollow(FOLLOW_rule__ExprOr__ExprNotAssignment_0_in_rule__ExprOr__Group__0__Impl6457);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3225:1: rule__ExprOr__Group__1 : rule__ExprOr__Group__1__Impl ;
    public final void rule__ExprOr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3229:1: ( rule__ExprOr__Group__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3230:2: rule__ExprOr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprOr__Group__1__Impl_in_rule__ExprOr__Group__16487);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3236:1: rule__ExprOr__Group__1__Impl : ( ( rule__ExprOr__Group_1__0 )? ) ;
    public final void rule__ExprOr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3240:1: ( ( ( rule__ExprOr__Group_1__0 )? ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3241:1: ( ( rule__ExprOr__Group_1__0 )? )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3241:1: ( ( rule__ExprOr__Group_1__0 )? )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3242:1: ( rule__ExprOr__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getGroup_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3243:1: ( rule__ExprOr__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==40) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3243:2: rule__ExprOr__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ExprOr__Group_1__0_in_rule__ExprOr__Group__1__Impl6514);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3257:1: rule__ExprOr__Group_1__0 : rule__ExprOr__Group_1__0__Impl rule__ExprOr__Group_1__1 ;
    public final void rule__ExprOr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3261:1: ( rule__ExprOr__Group_1__0__Impl rule__ExprOr__Group_1__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3262:2: rule__ExprOr__Group_1__0__Impl rule__ExprOr__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExprOr__Group_1__0__Impl_in_rule__ExprOr__Group_1__06549);
            rule__ExprOr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprOr__Group_1__1_in_rule__ExprOr__Group_1__06552);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3269:1: rule__ExprOr__Group_1__0__Impl : ( ( rule__ExprOr__ExprOrAssignment_1_0 ) ) ;
    public final void rule__ExprOr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3273:1: ( ( ( rule__ExprOr__ExprOrAssignment_1_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3274:1: ( ( rule__ExprOr__ExprOrAssignment_1_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3274:1: ( ( rule__ExprOr__ExprOrAssignment_1_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3275:1: ( rule__ExprOr__ExprOrAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExprOrAssignment_1_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3276:1: ( rule__ExprOr__ExprOrAssignment_1_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3276:2: rule__ExprOr__ExprOrAssignment_1_0
            {
            pushFollow(FOLLOW_rule__ExprOr__ExprOrAssignment_1_0_in_rule__ExprOr__Group_1__0__Impl6579);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3286:1: rule__ExprOr__Group_1__1 : rule__ExprOr__Group_1__1__Impl ;
    public final void rule__ExprOr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3290:1: ( rule__ExprOr__Group_1__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3291:2: rule__ExprOr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprOr__Group_1__1__Impl_in_rule__ExprOr__Group_1__16609);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3297:1: rule__ExprOr__Group_1__1__Impl : ( ( rule__ExprOr__ExprOrAttAssignment_1_1 ) ) ;
    public final void rule__ExprOr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3301:1: ( ( ( rule__ExprOr__ExprOrAttAssignment_1_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3302:1: ( ( rule__ExprOr__ExprOrAttAssignment_1_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3302:1: ( ( rule__ExprOr__ExprOrAttAssignment_1_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3303:1: ( rule__ExprOr__ExprOrAttAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExprOrAttAssignment_1_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3304:1: ( rule__ExprOr__ExprOrAttAssignment_1_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3304:2: rule__ExprOr__ExprOrAttAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ExprOr__ExprOrAttAssignment_1_1_in_rule__ExprOr__Group_1__1__Impl6636);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3318:1: rule__ExprNot__Group__0 : rule__ExprNot__Group__0__Impl rule__ExprNot__Group__1 ;
    public final void rule__ExprNot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3322:1: ( rule__ExprNot__Group__0__Impl rule__ExprNot__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3323:2: rule__ExprNot__Group__0__Impl rule__ExprNot__Group__1
            {
            pushFollow(FOLLOW_rule__ExprNot__Group__0__Impl_in_rule__ExprNot__Group__06670);
            rule__ExprNot__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprNot__Group__1_in_rule__ExprNot__Group__06673);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3330:1: rule__ExprNot__Group__0__Impl : ( ( rule__ExprNot__NotAssignment_0 )? ) ;
    public final void rule__ExprNot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3334:1: ( ( ( rule__ExprNot__NotAssignment_0 )? ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3335:1: ( ( rule__ExprNot__NotAssignment_0 )? )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3335:1: ( ( rule__ExprNot__NotAssignment_0 )? )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3336:1: ( rule__ExprNot__NotAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getNotAssignment_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3337:1: ( rule__ExprNot__NotAssignment_0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==41) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3337:2: rule__ExprNot__NotAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ExprNot__NotAssignment_0_in_rule__ExprNot__Group__0__Impl6700);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3347:1: rule__ExprNot__Group__1 : rule__ExprNot__Group__1__Impl ;
    public final void rule__ExprNot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3351:1: ( rule__ExprNot__Group__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3352:2: rule__ExprNot__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprNot__Group__1__Impl_in_rule__ExprNot__Group__16731);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3358:1: rule__ExprNot__Group__1__Impl : ( ( rule__ExprNot__ExprEqAssignment_1 ) ) ;
    public final void rule__ExprNot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3362:1: ( ( ( rule__ExprNot__ExprEqAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3363:1: ( ( rule__ExprNot__ExprEqAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3363:1: ( ( rule__ExprNot__ExprEqAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3364:1: ( rule__ExprNot__ExprEqAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getExprEqAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3365:1: ( rule__ExprNot__ExprEqAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3365:2: rule__ExprNot__ExprEqAssignment_1
            {
            pushFollow(FOLLOW_rule__ExprNot__ExprEqAssignment_1_in_rule__ExprNot__Group__1__Impl6758);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3379:1: rule__ExprEq__Group_0__0 : rule__ExprEq__Group_0__0__Impl rule__ExprEq__Group_0__1 ;
    public final void rule__ExprEq__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3383:1: ( rule__ExprEq__Group_0__0__Impl rule__ExprEq__Group_0__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3384:2: rule__ExprEq__Group_0__0__Impl rule__ExprEq__Group_0__1
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_0__0__Impl_in_rule__ExprEq__Group_0__06792);
            rule__ExprEq__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprEq__Group_0__1_in_rule__ExprEq__Group_0__06795);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3391:1: rule__ExprEq__Group_0__0__Impl : ( '(' ) ;
    public final void rule__ExprEq__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3395:1: ( ( '(' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3396:1: ( '(' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3396:1: ( '(' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3397:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__ExprEq__Group_0__0__Impl6823); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3410:1: rule__ExprEq__Group_0__1 : rule__ExprEq__Group_0__1__Impl rule__ExprEq__Group_0__2 ;
    public final void rule__ExprEq__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3414:1: ( rule__ExprEq__Group_0__1__Impl rule__ExprEq__Group_0__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3415:2: rule__ExprEq__Group_0__1__Impl rule__ExprEq__Group_0__2
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_0__1__Impl_in_rule__ExprEq__Group_0__16854);
            rule__ExprEq__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprEq__Group_0__2_in_rule__ExprEq__Group_0__16857);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3422:1: rule__ExprEq__Group_0__1__Impl : ( ( rule__ExprEq__ExprAssignment_0_1 ) ) ;
    public final void rule__ExprEq__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3426:1: ( ( ( rule__ExprEq__ExprAssignment_0_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3427:1: ( ( rule__ExprEq__ExprAssignment_0_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3427:1: ( ( rule__ExprEq__ExprAssignment_0_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3428:1: ( rule__ExprEq__ExprAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExprAssignment_0_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3429:1: ( rule__ExprEq__ExprAssignment_0_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3429:2: rule__ExprEq__ExprAssignment_0_1
            {
            pushFollow(FOLLOW_rule__ExprEq__ExprAssignment_0_1_in_rule__ExprEq__Group_0__1__Impl6884);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3439:1: rule__ExprEq__Group_0__2 : rule__ExprEq__Group_0__2__Impl ;
    public final void rule__ExprEq__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3443:1: ( rule__ExprEq__Group_0__2__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3444:2: rule__ExprEq__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_0__2__Impl_in_rule__ExprEq__Group_0__26914);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3450:1: rule__ExprEq__Group_0__2__Impl : ( ')' ) ;
    public final void rule__ExprEq__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3454:1: ( ( ')' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3455:1: ( ')' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3455:1: ( ')' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3456:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,32,FOLLOW_32_in_rule__ExprEq__Group_0__2__Impl6942); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3475:1: rule__ExprEq__Group_1__0 : rule__ExprEq__Group_1__0__Impl rule__ExprEq__Group_1__1 ;
    public final void rule__ExprEq__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3479:1: ( rule__ExprEq__Group_1__0__Impl rule__ExprEq__Group_1__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3480:2: rule__ExprEq__Group_1__0__Impl rule__ExprEq__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_1__0__Impl_in_rule__ExprEq__Group_1__06979);
            rule__ExprEq__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprEq__Group_1__1_in_rule__ExprEq__Group_1__06982);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3487:1: rule__ExprEq__Group_1__0__Impl : ( ( rule__ExprEq__ExprSim1Assignment_1_0 ) ) ;
    public final void rule__ExprEq__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3491:1: ( ( ( rule__ExprEq__ExprSim1Assignment_1_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3492:1: ( ( rule__ExprEq__ExprSim1Assignment_1_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3492:1: ( ( rule__ExprEq__ExprSim1Assignment_1_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3493:1: ( rule__ExprEq__ExprSim1Assignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExprSim1Assignment_1_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3494:1: ( rule__ExprEq__ExprSim1Assignment_1_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3494:2: rule__ExprEq__ExprSim1Assignment_1_0
            {
            pushFollow(FOLLOW_rule__ExprEq__ExprSim1Assignment_1_0_in_rule__ExprEq__Group_1__0__Impl7009);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3504:1: rule__ExprEq__Group_1__1 : rule__ExprEq__Group_1__1__Impl rule__ExprEq__Group_1__2 ;
    public final void rule__ExprEq__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3508:1: ( rule__ExprEq__Group_1__1__Impl rule__ExprEq__Group_1__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3509:2: rule__ExprEq__Group_1__1__Impl rule__ExprEq__Group_1__2
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_1__1__Impl_in_rule__ExprEq__Group_1__17039);
            rule__ExprEq__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprEq__Group_1__2_in_rule__ExprEq__Group_1__17042);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3516:1: rule__ExprEq__Group_1__1__Impl : ( '=?' ) ;
    public final void rule__ExprEq__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3520:1: ( ( '=?' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3521:1: ( '=?' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3521:1: ( '=?' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3522:1: '=?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getEqualsSignQuestionMarkKeyword_1_1()); 
            }
            match(input,33,FOLLOW_33_in_rule__ExprEq__Group_1__1__Impl7070); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3535:1: rule__ExprEq__Group_1__2 : rule__ExprEq__Group_1__2__Impl ;
    public final void rule__ExprEq__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3539:1: ( rule__ExprEq__Group_1__2__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3540:2: rule__ExprEq__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_1__2__Impl_in_rule__ExprEq__Group_1__27101);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3546:1: rule__ExprEq__Group_1__2__Impl : ( ( rule__ExprEq__ExprSim2Assignment_1_2 ) ) ;
    public final void rule__ExprEq__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3550:1: ( ( ( rule__ExprEq__ExprSim2Assignment_1_2 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3551:1: ( ( rule__ExprEq__ExprSim2Assignment_1_2 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3551:1: ( ( rule__ExprEq__ExprSim2Assignment_1_2 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3552:1: ( rule__ExprEq__ExprSim2Assignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExprSim2Assignment_1_2()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3553:1: ( rule__ExprEq__ExprSim2Assignment_1_2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3553:2: rule__ExprEq__ExprSim2Assignment_1_2
            {
            pushFollow(FOLLOW_rule__ExprEq__ExprSim2Assignment_1_2_in_rule__ExprEq__Group_1__2__Impl7128);
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


    // $ANTLR start "rule__Cons__Group__0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3569:1: rule__Cons__Group__0 : rule__Cons__Group__0__Impl rule__Cons__Group__1 ;
    public final void rule__Cons__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3573:1: ( rule__Cons__Group__0__Impl rule__Cons__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3574:2: rule__Cons__Group__0__Impl rule__Cons__Group__1
            {
            pushFollow(FOLLOW_rule__Cons__Group__0__Impl_in_rule__Cons__Group__07164);
            rule__Cons__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Cons__Group__1_in_rule__Cons__Group__07167);
            rule__Cons__Group__1();

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
    // $ANTLR end "rule__Cons__Group__0"


    // $ANTLR start "rule__Cons__Group__0__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3581:1: rule__Cons__Group__0__Impl : ( ( rule__Cons__ExprConsAssignment_0 ) ) ;
    public final void rule__Cons__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3585:1: ( ( ( rule__Cons__ExprConsAssignment_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3586:1: ( ( rule__Cons__ExprConsAssignment_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3586:1: ( ( rule__Cons__ExprConsAssignment_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3587:1: ( rule__Cons__ExprConsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConsAccess().getExprConsAssignment_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3588:1: ( rule__Cons__ExprConsAssignment_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3588:2: rule__Cons__ExprConsAssignment_0
            {
            pushFollow(FOLLOW_rule__Cons__ExprConsAssignment_0_in_rule__Cons__Group__0__Impl7194);
            rule__Cons__ExprConsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConsAccess().getExprConsAssignment_0()); 
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
    // $ANTLR end "rule__Cons__Group__0__Impl"


    // $ANTLR start "rule__Cons__Group__1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3598:1: rule__Cons__Group__1 : rule__Cons__Group__1__Impl rule__Cons__Group__2 ;
    public final void rule__Cons__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3602:1: ( rule__Cons__Group__1__Impl rule__Cons__Group__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3603:2: rule__Cons__Group__1__Impl rule__Cons__Group__2
            {
            pushFollow(FOLLOW_rule__Cons__Group__1__Impl_in_rule__Cons__Group__17224);
            rule__Cons__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Cons__Group__2_in_rule__Cons__Group__17227);
            rule__Cons__Group__2();

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
    // $ANTLR end "rule__Cons__Group__1"


    // $ANTLR start "rule__Cons__Group__1__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3610:1: rule__Cons__Group__1__Impl : ( ( rule__Cons__ExprConsAtt1Assignment_1 ) ) ;
    public final void rule__Cons__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3614:1: ( ( ( rule__Cons__ExprConsAtt1Assignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3615:1: ( ( rule__Cons__ExprConsAtt1Assignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3615:1: ( ( rule__Cons__ExprConsAtt1Assignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3616:1: ( rule__Cons__ExprConsAtt1Assignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConsAccess().getExprConsAtt1Assignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3617:1: ( rule__Cons__ExprConsAtt1Assignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3617:2: rule__Cons__ExprConsAtt1Assignment_1
            {
            pushFollow(FOLLOW_rule__Cons__ExprConsAtt1Assignment_1_in_rule__Cons__Group__1__Impl7254);
            rule__Cons__ExprConsAtt1Assignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConsAccess().getExprConsAtt1Assignment_1()); 
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
    // $ANTLR end "rule__Cons__Group__1__Impl"


    // $ANTLR start "rule__Cons__Group__2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3627:1: rule__Cons__Group__2 : rule__Cons__Group__2__Impl ;
    public final void rule__Cons__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3631:1: ( rule__Cons__Group__2__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3632:2: rule__Cons__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Cons__Group__2__Impl_in_rule__Cons__Group__27284);
            rule__Cons__Group__2__Impl();

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
    // $ANTLR end "rule__Cons__Group__2"


    // $ANTLR start "rule__Cons__Group__2__Impl"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3638:1: rule__Cons__Group__2__Impl : ( ( rule__Cons__ExprConsAttListAssignment_2 ) ) ;
    public final void rule__Cons__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3642:1: ( ( ( rule__Cons__ExprConsAttListAssignment_2 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3643:1: ( ( rule__Cons__ExprConsAttListAssignment_2 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3643:1: ( ( rule__Cons__ExprConsAttListAssignment_2 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3644:1: ( rule__Cons__ExprConsAttListAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConsAccess().getExprConsAttListAssignment_2()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3645:1: ( rule__Cons__ExprConsAttListAssignment_2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3645:2: rule__Cons__ExprConsAttListAssignment_2
            {
            pushFollow(FOLLOW_rule__Cons__ExprConsAttListAssignment_2_in_rule__Cons__Group__2__Impl7311);
            rule__Cons__ExprConsAttListAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConsAccess().getExprConsAttListAssignment_2()); 
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
    // $ANTLR end "rule__Cons__Group__2__Impl"


    // $ANTLR start "rule__Program__FonctionsAssignment"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3662:1: rule__Program__FonctionsAssignment : ( ruleFunction ) ;
    public final void rule__Program__FonctionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3666:1: ( ( ruleFunction ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3667:1: ( ruleFunction )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3667:1: ( ruleFunction )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3668:1: ruleFunction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getFonctionsFunctionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleFunction_in_rule__Program__FonctionsAssignment7352);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3677:1: rule__Function__NomAssignment_1 : ( RULE_SYMBOL ) ;
    public final void rule__Function__NomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3681:1: ( ( RULE_SYMBOL ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3682:1: ( RULE_SYMBOL )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3682:1: ( RULE_SYMBOL )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3683:1: RULE_SYMBOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getNomSYMBOLTerminalRuleCall_1_0()); 
            }
            match(input,RULE_SYMBOL,FOLLOW_RULE_SYMBOL_in_rule__Function__NomAssignment_17383); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3692:1: rule__Function__DefinitionAssignment_3 : ( ruleDefinition ) ;
    public final void rule__Function__DefinitionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3696:1: ( ( ruleDefinition ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3697:1: ( ruleDefinition )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3697:1: ( ruleDefinition )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3698:1: ruleDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getDefinitionDefinitionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleDefinition_in_rule__Function__DefinitionAssignment_37414);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3707:1: rule__Definition__InputsAssignment_1 : ( ruleInput ) ;
    public final void rule__Definition__InputsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3711:1: ( ( ruleInput ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3712:1: ( ruleInput )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3712:1: ( ruleInput )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3713:1: ruleInput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getInputsInputParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleInput_in_rule__Definition__InputsAssignment_17445);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3722:1: rule__Definition__CommandesAssignment_3 : ( ruleCommands ) ;
    public final void rule__Definition__CommandesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3726:1: ( ( ruleCommands ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3727:1: ( ruleCommands )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3727:1: ( ruleCommands )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3728:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getCommandesCommandsParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Definition__CommandesAssignment_37476);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3737:1: rule__Definition__OutputsAssignment_6 : ( ruleOutput ) ;
    public final void rule__Definition__OutputsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3741:1: ( ( ruleOutput ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3742:1: ( ruleOutput )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3742:1: ( ruleOutput )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3743:1: ruleOutput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getOutputsOutputParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleOutput_in_rule__Definition__OutputsAssignment_67507);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3752:1: rule__Input__VarInAssignment_0_0 : ( RULE_VARIABLE ) ;
    public final void rule__Input__VarInAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3756:1: ( ( RULE_VARIABLE ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3757:1: ( RULE_VARIABLE )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3757:1: ( RULE_VARIABLE )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3758:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVarInVARIABLETerminalRuleCall_0_0_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Input__VarInAssignment_0_07538); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3767:1: rule__Input__VarInAssignment_1 : ( RULE_VARIABLE ) ;
    public final void rule__Input__VarInAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3771:1: ( ( RULE_VARIABLE ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3772:1: ( RULE_VARIABLE )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3772:1: ( RULE_VARIABLE )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3773:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVarInVARIABLETerminalRuleCall_1_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Input__VarInAssignment_17569); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3782:1: rule__Output__VarOutAssignment_0_0 : ( RULE_VARIABLE ) ;
    public final void rule__Output__VarOutAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3786:1: ( ( RULE_VARIABLE ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3787:1: ( RULE_VARIABLE )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3787:1: ( RULE_VARIABLE )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3788:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVarOutVARIABLETerminalRuleCall_0_0_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Output__VarOutAssignment_0_07600); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3797:1: rule__Output__VarOutAssignment_1 : ( RULE_VARIABLE ) ;
    public final void rule__Output__VarOutAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3801:1: ( ( RULE_VARIABLE ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3802:1: ( RULE_VARIABLE )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3802:1: ( RULE_VARIABLE )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3803:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVarOutVARIABLETerminalRuleCall_1_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Output__VarOutAssignment_17631); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3812:1: rule__Vars__VarGenAssignment_0_0 : ( RULE_VARIABLE ) ;
    public final void rule__Vars__VarGenAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3816:1: ( ( RULE_VARIABLE ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3817:1: ( RULE_VARIABLE )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3817:1: ( RULE_VARIABLE )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3818:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getVarGenVARIABLETerminalRuleCall_0_0_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Vars__VarGenAssignment_0_07662); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3827:1: rule__Vars__VarGenAssignment_1 : ( RULE_VARIABLE ) ;
    public final void rule__Vars__VarGenAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3831:1: ( ( RULE_VARIABLE ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3832:1: ( RULE_VARIABLE )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3832:1: ( RULE_VARIABLE )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3833:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getVarGenVARIABLETerminalRuleCall_1_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Vars__VarGenAssignment_17693); if (state.failed) return ;
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


    // $ANTLR start "rule__Commands__CommandeAssignment_0_0_0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3842:1: rule__Commands__CommandeAssignment_0_0_0 : ( ruleCommand ) ;
    public final void rule__Commands__CommandeAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3846:1: ( ( ruleCommand ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3847:1: ( ruleCommand )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3847:1: ( ruleCommand )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3848:1: ruleCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getCommandeCommandParserRuleCall_0_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleCommand_in_rule__Commands__CommandeAssignment_0_0_07724);
            ruleCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getCommandeCommandParserRuleCall_0_0_0_0()); 
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
    // $ANTLR end "rule__Commands__CommandeAssignment_0_0_0"


    // $ANTLR start "rule__Commands__CommandeAssignment_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3857:1: rule__Commands__CommandeAssignment_1 : ( ruleCommand ) ;
    public final void rule__Commands__CommandeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3861:1: ( ( ruleCommand ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3862:1: ( ruleCommand )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3862:1: ( ruleCommand )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3863:1: ruleCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getCommandeCommandParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleCommand_in_rule__Commands__CommandeAssignment_17755);
            ruleCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getCommandeCommandParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Commands__CommandeAssignment_1"


    // $ANTLR start "rule__Command__NopAssignment_0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3872:1: rule__Command__NopAssignment_0 : ( ( 'nop' ) ) ;
    public final void rule__Command__NopAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3876:1: ( ( ( 'nop' ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3877:1: ( ( 'nop' ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3877:1: ( ( 'nop' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3878:1: ( 'nop' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNopNopKeyword_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3879:1: ( 'nop' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3880:1: 'nop'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNopNopKeyword_0_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__Command__NopAssignment_07791); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getNopNopKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getNopNopKeyword_0_0()); 
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
    // $ANTLR end "rule__Command__NopAssignment_0"


    // $ANTLR start "rule__Command__VarsAssignment_1_0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3895:1: rule__Command__VarsAssignment_1_0 : ( ruleVars ) ;
    public final void rule__Command__VarsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3899:1: ( ( ruleVars ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3900:1: ( ruleVars )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3900:1: ( ruleVars )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3901:1: ruleVars
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getVarsVarsParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleVars_in_rule__Command__VarsAssignment_1_07830);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3910:1: rule__Command__ExprsAssignment_1_2 : ( ruleExprs ) ;
    public final void rule__Command__ExprsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3914:1: ( ( ruleExprs ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3915:1: ( ruleExprs )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3915:1: ( ruleExprs )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3916:1: ruleExprs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExprsExprsParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleExprs_in_rule__Command__ExprsAssignment_1_27861);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3925:1: rule__Command__CmdWhileAssignment_2 : ( ruleCommandWhile ) ;
    public final void rule__Command__CmdWhileAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3929:1: ( ( ruleCommandWhile ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3930:1: ( ruleCommandWhile )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3930:1: ( ruleCommandWhile )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3931:1: ruleCommandWhile
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getCmdWhileCommandWhileParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleCommandWhile_in_rule__Command__CmdWhileAssignment_27892);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3940:1: rule__Command__CmdIfAssignment_3 : ( ruleCommandIf ) ;
    public final void rule__Command__CmdIfAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3944:1: ( ( ruleCommandIf ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3945:1: ( ruleCommandIf )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3945:1: ( ruleCommandIf )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3946:1: ruleCommandIf
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getCmdIfCommandIfParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleCommandIf_in_rule__Command__CmdIfAssignment_37923);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3955:1: rule__Command__CmdForEachAssignment_4 : ( ruleCommandForEach ) ;
    public final void rule__Command__CmdForEachAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3959:1: ( ( ruleCommandForEach ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3960:1: ( ruleCommandForEach )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3960:1: ( ruleCommandForEach )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3961:1: ruleCommandForEach
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getCmdForEachCommandForEachParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleCommandForEach_in_rule__Command__CmdForEachAssignment_47954);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3970:1: rule__CommandWhile__WAssignment_0_0 : ( ( 'while' ) ) ;
    public final void rule__CommandWhile__WAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3974:1: ( ( ( 'while' ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3975:1: ( ( 'while' ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3975:1: ( ( 'while' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3976:1: ( 'while' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandWhileAccess().getWWhileKeyword_0_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3977:1: ( 'while' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3978:1: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandWhileAccess().getWWhileKeyword_0_0_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__CommandWhile__WAssignment_0_07990); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3993:1: rule__CommandWhile__ExprAssignment_1 : ( ruleExpr ) ;
    public final void rule__CommandWhile__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3997:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3998:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3998:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3999:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandWhileAccess().getExprExprParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__CommandWhile__ExprAssignment_18029);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4008:1: rule__CommandWhile__CmdsAssignment_3 : ( ruleCommands ) ;
    public final void rule__CommandWhile__CmdsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4012:1: ( ( ruleCommands ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4013:1: ( ruleCommands )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4013:1: ( ruleCommands )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4014:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandWhileAccess().getCmdsCommandsParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__CommandWhile__CmdsAssignment_38060);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4023:1: rule__CommandIf__CondAssignment_1 : ( ruleExpr ) ;
    public final void rule__CommandIf__CondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4027:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4028:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4028:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4029:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getCondExprParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__CommandIf__CondAssignment_18091);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4038:1: rule__CommandIf__CmdsThenAssignment_3 : ( ruleCommands ) ;
    public final void rule__CommandIf__CmdsThenAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4042:1: ( ( ruleCommands ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4043:1: ( ruleCommands )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4043:1: ( ruleCommands )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4044:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getCmdsThenCommandsParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__CommandIf__CmdsThenAssignment_38122);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4053:1: rule__CommandIf__CmdsElseAssignment_4_1 : ( ruleCommands ) ;
    public final void rule__CommandIf__CmdsElseAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4057:1: ( ( ruleCommands ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4058:1: ( ruleCommands )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4058:1: ( ruleCommands )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4059:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getCmdsElseCommandsParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__CommandIf__CmdsElseAssignment_4_18153);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4068:1: rule__CommandForEach__ElemAssignment_1 : ( ruleExpr ) ;
    public final void rule__CommandForEach__ElemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4072:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4073:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4073:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4074:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachAccess().getElemExprParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__CommandForEach__ElemAssignment_18184);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4083:1: rule__CommandForEach__EnsembAssignment_3 : ( ruleExpr ) ;
    public final void rule__CommandForEach__EnsembAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4087:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4088:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4088:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4089:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachAccess().getEnsembExprParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__CommandForEach__EnsembAssignment_38215);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4098:1: rule__CommandForEach__CmdsAssignment_5 : ( ruleCommands ) ;
    public final void rule__CommandForEach__CmdsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4102:1: ( ( ruleCommands ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4103:1: ( ruleCommands )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4103:1: ( ruleCommands )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4104:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachAccess().getCmdsCommandsParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__CommandForEach__CmdsAssignment_58246);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4113:1: rule__Exprs__ExpGenAssignment_0_0_0 : ( ruleExpr ) ;
    public final void rule__Exprs__ExpGenAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4117:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4118:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4118:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4119:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExpGenExprParserRuleCall_0_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Exprs__ExpGenAssignment_0_0_08277);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4128:1: rule__Exprs__ExpGenAssignment_1 : ( ruleExpr ) ;
    public final void rule__Exprs__ExpGenAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4132:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4133:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4133:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4134:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExpGenExprParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Exprs__ExpGenAssignment_18308);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4143:1: rule__Expr__ExprSimpAssignment_0_0 : ( ruleExprSimple ) ;
    public final void rule__Expr__ExprSimpAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4147:1: ( ( ruleExprSimple ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4148:1: ( ruleExprSimple )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4148:1: ( ruleExprSimple )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4149:1: ruleExprSimple
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getExprSimpExprSimpleParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_rule__Expr__ExprSimpAssignment_0_08339);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4158:1: rule__Expr__ExprAndAssignment_1 : ( ruleExprAnd ) ;
    public final void rule__Expr__ExprAndAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4162:1: ( ( ruleExprAnd ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4163:1: ( ruleExprAnd )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4163:1: ( ruleExprAnd )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4164:1: ruleExprAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getExprAndExprAndParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExprAnd_in_rule__Expr__ExprAndAssignment_18370);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4173:1: rule__ExprSimple__NilAssignment_0_0 : ( ( 'nil' ) ) ;
    public final void rule__ExprSimple__NilAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4177:1: ( ( ( 'nil' ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4178:1: ( ( 'nil' ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4178:1: ( ( 'nil' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4179:1: ( 'nil' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getNilNilKeyword_0_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4180:1: ( 'nil' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4181:1: 'nil'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getNilNilKeyword_0_0_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__ExprSimple__NilAssignment_0_08406); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4196:1: rule__ExprSimple__VariAssignment_0_1 : ( RULE_VARIABLE ) ;
    public final void rule__ExprSimple__VariAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4200:1: ( ( RULE_VARIABLE ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4201:1: ( RULE_VARIABLE )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4201:1: ( RULE_VARIABLE )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4202:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getVariVARIABLETerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__ExprSimple__VariAssignment_0_18445); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4211:1: rule__ExprSimple__SymbAssignment_0_2 : ( RULE_SYMBOL ) ;
    public final void rule__ExprSimple__SymbAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4215:1: ( ( RULE_SYMBOL ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4216:1: ( RULE_SYMBOL )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4216:1: ( RULE_SYMBOL )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4217:1: RULE_SYMBOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getSymbSYMBOLTerminalRuleCall_0_2_0()); 
            }
            match(input,RULE_SYMBOL,FOLLOW_RULE_SYMBOL_in_rule__ExprSimple__SymbAssignment_0_28476); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4226:1: rule__ExprSimple__ExprConsAssignment_1_1 : ( ruleCons ) ;
    public final void rule__ExprSimple__ExprConsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4230:1: ( ( ruleCons ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4231:1: ( ruleCons )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4231:1: ( ruleCons )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4232:1: ruleCons
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprConsConsParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleCons_in_rule__ExprSimple__ExprConsAssignment_1_18507);
            ruleCons();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprConsConsParserRuleCall_1_1_0()); 
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


    // $ANTLR start "rule__ExprSimple__ExprHeadAssignment_2_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4241:1: rule__ExprSimple__ExprHeadAssignment_2_1 : ( ( 'hd' ) ) ;
    public final void rule__ExprSimple__ExprHeadAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4245:1: ( ( ( 'hd' ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4246:1: ( ( 'hd' ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4246:1: ( ( 'hd' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4247:1: ( 'hd' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprHeadHdKeyword_2_1_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4248:1: ( 'hd' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4249:1: 'hd'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprHeadHdKeyword_2_1_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__ExprSimple__ExprHeadAssignment_2_18543); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprHeadHdKeyword_2_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprHeadHdKeyword_2_1_0()); 
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
    // $ANTLR end "rule__ExprSimple__ExprHeadAssignment_2_1"


    // $ANTLR start "rule__ExprSimple__ExprHeadAttAssignment_2_2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4264:1: rule__ExprSimple__ExprHeadAttAssignment_2_2 : ( ruleExpr ) ;
    public final void rule__ExprSimple__ExprHeadAttAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4268:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4269:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4269:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4270:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprHeadAttExprParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__ExprSimple__ExprHeadAttAssignment_2_28582);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprHeadAttExprParserRuleCall_2_2_0()); 
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
    // $ANTLR end "rule__ExprSimple__ExprHeadAttAssignment_2_2"


    // $ANTLR start "rule__ExprSimple__ExprTailAssignment_3_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4279:1: rule__ExprSimple__ExprTailAssignment_3_1 : ( ( 'tl' ) ) ;
    public final void rule__ExprSimple__ExprTailAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4283:1: ( ( ( 'tl' ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4284:1: ( ( 'tl' ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4284:1: ( ( 'tl' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4285:1: ( 'tl' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprTailTlKeyword_3_1_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4286:1: ( 'tl' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4287:1: 'tl'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprTailTlKeyword_3_1_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__ExprSimple__ExprTailAssignment_3_18618); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprTailTlKeyword_3_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprTailTlKeyword_3_1_0()); 
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
    // $ANTLR end "rule__ExprSimple__ExprTailAssignment_3_1"


    // $ANTLR start "rule__ExprSimple__ExprTailAttAssignment_3_2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4302:1: rule__ExprSimple__ExprTailAttAssignment_3_2 : ( ruleExpr ) ;
    public final void rule__ExprSimple__ExprTailAttAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4306:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4307:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4307:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4308:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprTailAttExprParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__ExprSimple__ExprTailAttAssignment_3_28657);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprTailAttExprParserRuleCall_3_2_0()); 
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
    // $ANTLR end "rule__ExprSimple__ExprTailAttAssignment_3_2"


    // $ANTLR start "rule__ExprSimple__NomSymbAssignment_4_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4317:1: rule__ExprSimple__NomSymbAssignment_4_1 : ( RULE_SYMBOL ) ;
    public final void rule__ExprSimple__NomSymbAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4321:1: ( ( RULE_SYMBOL ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4322:1: ( RULE_SYMBOL )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4322:1: ( RULE_SYMBOL )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4323:1: RULE_SYMBOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getNomSymbSYMBOLTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_SYMBOL,FOLLOW_RULE_SYMBOL_in_rule__ExprSimple__NomSymbAssignment_4_18688); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getNomSymbSYMBOLTerminalRuleCall_4_1_0()); 
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
    // $ANTLR end "rule__ExprSimple__NomSymbAssignment_4_1"


    // $ANTLR start "rule__ExprSimple__SymbAttAssignment_4_2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4332:1: rule__ExprSimple__SymbAttAssignment_4_2 : ( ruleExpr ) ;
    public final void rule__ExprSimple__SymbAttAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4336:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4337:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4337:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4338:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getSymbAttExprParserRuleCall_4_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__ExprSimple__SymbAttAssignment_4_28719);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getSymbAttExprParserRuleCall_4_2_0()); 
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
    // $ANTLR end "rule__ExprSimple__SymbAttAssignment_4_2"


    // $ANTLR start "rule__ExprAnd__ExprOrAssignment_0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4347:1: rule__ExprAnd__ExprOrAssignment_0 : ( ruleExprOr ) ;
    public final void rule__ExprAnd__ExprOrAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4351:1: ( ( ruleExprOr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4352:1: ( ruleExprOr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4352:1: ( ruleExprOr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4353:1: ruleExprOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExprOrExprOrParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExprOr_in_rule__ExprAnd__ExprOrAssignment_08750);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4362:1: rule__ExprAnd__ExprAndAssignment_1_0 : ( ( 'and' ) ) ;
    public final void rule__ExprAnd__ExprAndAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4366:1: ( ( ( 'and' ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4367:1: ( ( 'and' ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4367:1: ( ( 'and' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4368:1: ( 'and' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExprAndAndKeyword_1_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4369:1: ( 'and' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4370:1: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExprAndAndKeyword_1_0_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__ExprAnd__ExprAndAssignment_1_08786); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4385:1: rule__ExprAnd__ExprAndAttAssignment_1_1 : ( ruleExprAnd ) ;
    public final void rule__ExprAnd__ExprAndAttAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4389:1: ( ( ruleExprAnd ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4390:1: ( ruleExprAnd )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4390:1: ( ruleExprAnd )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4391:1: ruleExprAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExprAndAttExprAndParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExprAnd_in_rule__ExprAnd__ExprAndAttAssignment_1_18825);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4400:1: rule__ExprOr__ExprNotAssignment_0 : ( ruleExprNot ) ;
    public final void rule__ExprOr__ExprNotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4404:1: ( ( ruleExprNot ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4405:1: ( ruleExprNot )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4405:1: ( ruleExprNot )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4406:1: ruleExprNot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExprNotExprNotParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExprNot_in_rule__ExprOr__ExprNotAssignment_08856);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4415:1: rule__ExprOr__ExprOrAssignment_1_0 : ( ( 'or' ) ) ;
    public final void rule__ExprOr__ExprOrAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4419:1: ( ( ( 'or' ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4420:1: ( ( 'or' ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4420:1: ( ( 'or' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4421:1: ( 'or' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExprOrOrKeyword_1_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4422:1: ( 'or' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4423:1: 'or'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExprOrOrKeyword_1_0_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__ExprOr__ExprOrAssignment_1_08892); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4438:1: rule__ExprOr__ExprOrAttAssignment_1_1 : ( ruleExprOr ) ;
    public final void rule__ExprOr__ExprOrAttAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4442:1: ( ( ruleExprOr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4443:1: ( ruleExprOr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4443:1: ( ruleExprOr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4444:1: ruleExprOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExprOrAttExprOrParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExprOr_in_rule__ExprOr__ExprOrAttAssignment_1_18931);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4453:1: rule__ExprNot__NotAssignment_0 : ( ( 'not' ) ) ;
    public final void rule__ExprNot__NotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4457:1: ( ( ( 'not' ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4458:1: ( ( 'not' ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4458:1: ( ( 'not' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4459:1: ( 'not' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getNotNotKeyword_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4460:1: ( 'not' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4461:1: 'not'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getNotNotKeyword_0_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__ExprNot__NotAssignment_08967); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4476:1: rule__ExprNot__ExprEqAssignment_1 : ( ruleExprEq ) ;
    public final void rule__ExprNot__ExprEqAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4480:1: ( ( ruleExprEq ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4481:1: ( ruleExprEq )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4481:1: ( ruleExprEq )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4482:1: ruleExprEq
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getExprEqExprEqParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExprEq_in_rule__ExprNot__ExprEqAssignment_19006);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4491:1: rule__ExprEq__ExprAssignment_0_1 : ( ruleExpr ) ;
    public final void rule__ExprEq__ExprAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4495:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4496:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4496:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4497:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExprExprParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__ExprEq__ExprAssignment_0_19037);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4506:1: rule__ExprEq__ExprSim1Assignment_1_0 : ( ruleExprSimple ) ;
    public final void rule__ExprEq__ExprSim1Assignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4510:1: ( ( ruleExprSimple ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4511:1: ( ruleExprSimple )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4511:1: ( ruleExprSimple )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4512:1: ruleExprSimple
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExprSim1ExprSimpleParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_rule__ExprEq__ExprSim1Assignment_1_09068);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4521:1: rule__ExprEq__ExprSim2Assignment_1_2 : ( ruleExprSimple ) ;
    public final void rule__ExprEq__ExprSim2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4525:1: ( ( ruleExprSimple ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4526:1: ( ruleExprSimple )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4526:1: ( ruleExprSimple )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4527:1: ruleExprSimple
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExprSim2ExprSimpleParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_rule__ExprEq__ExprSim2Assignment_1_29099);
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


    // $ANTLR start "rule__Cons__ExprConsAssignment_0"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4536:1: rule__Cons__ExprConsAssignment_0 : ( ( 'cons' ) ) ;
    public final void rule__Cons__ExprConsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4540:1: ( ( ( 'cons' ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4541:1: ( ( 'cons' ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4541:1: ( ( 'cons' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4542:1: ( 'cons' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConsAccess().getExprConsConsKeyword_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4543:1: ( 'cons' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4544:1: 'cons'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConsAccess().getExprConsConsKeyword_0_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__Cons__ExprConsAssignment_09135); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConsAccess().getExprConsConsKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConsAccess().getExprConsConsKeyword_0_0()); 
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
    // $ANTLR end "rule__Cons__ExprConsAssignment_0"


    // $ANTLR start "rule__Cons__ExprConsAtt1Assignment_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4559:1: rule__Cons__ExprConsAtt1Assignment_1 : ( ruleExpr ) ;
    public final void rule__Cons__ExprConsAtt1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4563:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4564:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4564:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4565:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConsAccess().getExprConsAtt1ExprParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Cons__ExprConsAtt1Assignment_19174);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConsAccess().getExprConsAtt1ExprParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Cons__ExprConsAtt1Assignment_1"


    // $ANTLR start "rule__Cons__ExprConsAttListAssignment_2"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4574:1: rule__Cons__ExprConsAttListAssignment_2 : ( ruleConsAttList ) ;
    public final void rule__Cons__ExprConsAttListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4578:1: ( ( ruleConsAttList ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4579:1: ( ruleConsAttList )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4579:1: ( ruleConsAttList )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4580:1: ruleConsAttList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConsAccess().getExprConsAttListConsAttListParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleConsAttList_in_rule__Cons__ExprConsAttListAssignment_29205);
            ruleConsAttList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConsAccess().getExprConsAttListConsAttListParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Cons__ExprConsAttListAssignment_2"


    // $ANTLR start "rule__ConsAttList__ConsListAssignment"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4589:1: rule__ConsAttList__ConsListAssignment : ( ruleExpr ) ;
    public final void rule__ConsAttList__ConsListAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4593:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4594:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4594:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4595:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConsAttListAccess().getConsListExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__ConsAttList__ConsListAssignment9236);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConsAttListAccess().getConsListExprParserRuleCall_0()); 
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
    // $ANTLR end "rule__ConsAttList__ConsListAssignment"

    // $ANTLR start synpred8_InternalWhileCpp
    public final void synpred8_InternalWhileCpp_fragment() throws RecognitionException {   
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:697:1: ( ( ( rule__Expr__Group_0__0 ) ) )
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:697:1: ( ( rule__Expr__Group_0__0 ) )
        {
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:697:1: ( ( rule__Expr__Group_0__0 ) )
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:698:1: ( rule__Expr__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExprAccess().getGroup_0()); 
        }
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:699:1: ( rule__Expr__Group_0__0 )
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:699:2: rule__Expr__Group_0__0
        {
        pushFollow(FOLLOW_rule__Expr__Group_0__0_in_synpred8_InternalWhileCpp1452);
        rule__Expr__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred8_InternalWhileCpp

    // $ANTLR start synpred15_InternalWhileCpp
    public final void synpred15_InternalWhileCpp_fragment() throws RecognitionException {   
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:787:1: ( ( ( rule__ExprEq__Group_0__0 ) ) )
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:787:1: ( ( rule__ExprEq__Group_0__0 ) )
        {
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:787:1: ( ( rule__ExprEq__Group_0__0 ) )
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:788:1: ( rule__ExprEq__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExprEqAccess().getGroup_0()); 
        }
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:789:1: ( rule__ExprEq__Group_0__0 )
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:789:2: rule__ExprEq__Group_0__0
        {
        pushFollow(FOLLOW_rule__ExprEq__Group_0__0_in_synpred15_InternalWhileCpp1677);
        rule__ExprEq__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred15_InternalWhileCpp

    // $ANTLR start synpred19_InternalWhileCpp
    public final void synpred19_InternalWhileCpp_fragment() throws RecognitionException {   
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1548:2: ( rule__Commands__Group_0__0 )
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1548:2: rule__Commands__Group_0__0
        {
        pushFollow(FOLLOW_rule__Commands__Group_0__0_in_synpred19_InternalWhileCpp3179);
        rule__Commands__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_InternalWhileCpp

    // $ANTLR start synpred21_InternalWhileCpp
    public final void synpred21_InternalWhileCpp_fragment() throws RecognitionException {   
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2432:2: ( rule__Exprs__Group_0__0 )
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2432:2: rule__Exprs__Group_0__0
        {
        pushFollow(FOLLOW_rule__Exprs__Group_0__0_in_synpred21_InternalWhileCpp4917);
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
    public final boolean synpred15_InternalWhileCpp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalWhileCpp_fragment(); // can never throw exception
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
    public final boolean synpred19_InternalWhileCpp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalWhileCpp_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_rule__Commands__Group__0_in_ruleCommands461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Alternatives_in_ruleCommand521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandWhile_in_entryRuleCommandWhile548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommandWhile555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandWhile__Group__0_in_ruleCommandWhile581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandIf_in_entryRuleCommandIf608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommandIf615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__0_in_ruleCommandIf641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandForEach_in_entryRuleCommandForEach668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommandForEach675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__0_in_ruleCommandForEach701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprs_in_entryRuleExprs728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprs735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group__0_in_ruleExprs761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Alternatives_in_ruleExpr821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_entryRuleExprSimple848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprSimple855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Alternatives_in_ruleExprSimple881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_entryRuleExprAnd908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprAnd915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group__0_in_ruleExprAnd941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_entryRuleExprOr968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprOr975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group__0_in_ruleExprOr1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprNot_in_entryRuleExprNot1028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprNot1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNot__Group__0_in_ruleExprNot1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprEq_in_entryRuleExprEq1088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprEq1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Alternatives_in_ruleExprEq1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCons_in_entryRuleCons1148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCons1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cons__Group__0_in_ruleCons1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConsAttList_in_entryRuleConsAttList1208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConsAttList1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConsAttList__ConsListAssignment_in_ruleConsAttList1243 = new BitSet(new long[]{0x0000021080000032L});
    public static final BitSet FOLLOW_rule__ConsAttList__ConsListAssignment_in_ruleConsAttList1255 = new BitSet(new long[]{0x0000021080000032L});
    public static final BitSet FOLLOW_rule__Command__NopAssignment_0_in_rule__Command__Alternatives1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__0_in_rule__Command__Alternatives1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__CmdWhileAssignment_2_in_rule__Command__Alternatives1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__CmdIfAssignment_3_in_rule__Command__Alternatives1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__CmdForEachAssignment_4_in_rule__Command__Alternatives1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandWhile__WAssignment_0_0_in_rule__CommandWhile__Alternatives_01399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__CommandWhile__Alternatives_01418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group_0__0_in_rule__Expr__Alternatives1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__ExprAndAssignment_1_in_rule__Expr__Alternatives1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Alternatives_0_in_rule__ExprSimple__Alternatives1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1__0_in_rule__ExprSimple__Alternatives1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_2__0_in_rule__ExprSimple__Alternatives1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_3__0_in_rule__ExprSimple__Alternatives1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__0_in_rule__ExprSimple__Alternatives1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__NilAssignment_0_0_in_rule__ExprSimple__Alternatives_01608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__VariAssignment_0_1_in_rule__ExprSimple__Alternatives_01626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__SymbAssignment_0_2_in_rule__ExprSimple__Alternatives_01644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__0_in_rule__ExprEq__Alternatives1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__0_in_rule__ExprEq__Alternatives1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__01726 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group__1_in_rule__Function__Group__01729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Function__Group__0__Impl1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__11788 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Function__Group__2_in_rule__Function__Group__11791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__NomAssignment_1_in_rule__Function__Group__1__Impl1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__21848 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Function__Group__3_in_rule__Function__Group__21851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Function__Group__2__Impl1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__31910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__DefinitionAssignment_3_in_rule__Function__Group__3__Impl1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__01975 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__01978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Definition__Group__0__Impl2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__12037 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__12040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__InputsAssignment_1_in_rule__Definition__Group__1__Impl2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__22097 = new BitSet(new long[]{0x0000000C22004020L});
    public static final BitSet FOLLOW_rule__Definition__Group__3_in_rule__Definition__Group__22100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Definition__Group__2__Impl2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__3__Impl_in_rule__Definition__Group__32159 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Definition__Group__4_in_rule__Definition__Group__32162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__CommandesAssignment_3_in_rule__Definition__Group__3__Impl2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__4__Impl_in_rule__Definition__Group__42219 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Definition__Group__5_in_rule__Definition__Group__42222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Definition__Group__4__Impl2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__5__Impl_in_rule__Definition__Group__52281 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Definition__Group__6_in_rule__Definition__Group__52284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Definition__Group__5__Impl2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__6__Impl_in_rule__Definition__Group__62343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__OutputsAssignment_6_in_rule__Definition__Group__6__Impl2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__02414 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Input__Group__1_in_rule__Input__Group__02417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_0__0_in_rule__Input__Group__0__Impl2444 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__12475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__VarInAssignment_1_in_rule__Input__Group__1__Impl2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_0__0__Impl_in_rule__Input__Group_0__02536 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Input__Group_0__1_in_rule__Input__Group_0__02539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__VarInAssignment_0_0_in_rule__Input__Group_0__0__Impl2566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_0__1__Impl_in_rule__Input__Group_0__12596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Input__Group_0__1__Impl2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group__0__Impl_in_rule__Output__Group__02659 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Output__Group__1_in_rule__Output__Group__02662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_0__0_in_rule__Output__Group__0__Impl2689 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Output__Group__1__Impl_in_rule__Output__Group__12720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__VarOutAssignment_1_in_rule__Output__Group__1__Impl2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_0__0__Impl_in_rule__Output__Group_0__02781 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Output__Group_0__1_in_rule__Output__Group_0__02784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__VarOutAssignment_0_0_in_rule__Output__Group_0__0__Impl2811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_0__1__Impl_in_rule__Output__Group_0__12841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Output__Group_0__1__Impl2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group__0__Impl_in_rule__Vars__Group__02904 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Vars__Group__1_in_rule__Vars__Group__02907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_0__0_in_rule__Vars__Group__0__Impl2934 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Vars__Group__1__Impl_in_rule__Vars__Group__12965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__VarGenAssignment_1_in_rule__Vars__Group__1__Impl2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_0__0__Impl_in_rule__Vars__Group_0__03026 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Vars__Group_0__1_in_rule__Vars__Group_0__03029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__VarGenAssignment_0_0_in_rule__Vars__Group_0__0__Impl3056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_0__1__Impl_in_rule__Vars__Group_0__13086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Vars__Group_0__1__Impl3114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group__0__Impl_in_rule__Commands__Group__03149 = new BitSet(new long[]{0x0000000C22004020L});
    public static final BitSet FOLLOW_rule__Commands__Group__1_in_rule__Commands__Group__03152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_0__0_in_rule__Commands__Group__0__Impl3179 = new BitSet(new long[]{0x0000000C22004022L});
    public static final BitSet FOLLOW_rule__Commands__Group__1__Impl_in_rule__Commands__Group__13210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__CommandeAssignment_1_in_rule__Commands__Group__1__Impl3237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_0__0__Impl_in_rule__Commands__Group_0__03271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_0_0__0_in_rule__Commands__Group_0__0__Impl3298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_0_0__0__Impl_in_rule__Commands__Group_0_0__03330 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Commands__Group_0_0__1_in_rule__Commands__Group_0_0__03333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__CommandeAssignment_0_0_0_in_rule__Commands__Group_0_0__0__Impl3360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_0_0__1__Impl_in_rule__Commands__Group_0_0__13390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Commands__Group_0_0__1__Impl3418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__0__Impl_in_rule__Command__Group_1__03453 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Command__Group_1__1_in_rule__Command__Group_1__03456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__VarsAssignment_1_0_in_rule__Command__Group_1__0__Impl3483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__1__Impl_in_rule__Command__Group_1__13513 = new BitSet(new long[]{0x0000021080000030L});
    public static final BitSet FOLLOW_rule__Command__Group_1__2_in_rule__Command__Group_1__13516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Command__Group_1__1__Impl3544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__2__Impl_in_rule__Command__Group_1__23575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ExprsAssignment_1_2_in_rule__Command__Group_1__2__Impl3602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandWhile__Group__0__Impl_in_rule__CommandWhile__Group__03638 = new BitSet(new long[]{0x0000021080000030L});
    public static final BitSet FOLLOW_rule__CommandWhile__Group__1_in_rule__CommandWhile__Group__03641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandWhile__Alternatives_0_in_rule__CommandWhile__Group__0__Impl3668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandWhile__Group__1__Impl_in_rule__CommandWhile__Group__13698 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__CommandWhile__Group__2_in_rule__CommandWhile__Group__13701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandWhile__ExprAssignment_1_in_rule__CommandWhile__Group__1__Impl3728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandWhile__Group__2__Impl_in_rule__CommandWhile__Group__23758 = new BitSet(new long[]{0x0000000C22004020L});
    public static final BitSet FOLLOW_rule__CommandWhile__Group__3_in_rule__CommandWhile__Group__23761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CommandWhile__Group__2__Impl3789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandWhile__Group__3__Impl_in_rule__CommandWhile__Group__33820 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__CommandWhile__Group__4_in_rule__CommandWhile__Group__33823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandWhile__CmdsAssignment_3_in_rule__CommandWhile__Group__3__Impl3850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandWhile__Group__4__Impl_in_rule__CommandWhile__Group__43880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CommandWhile__Group__4__Impl3908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__0__Impl_in_rule__CommandIf__Group__03949 = new BitSet(new long[]{0x0000021080000030L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__1_in_rule__CommandIf__Group__03952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CommandIf__Group__0__Impl3980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__1__Impl_in_rule__CommandIf__Group__14011 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__2_in_rule__CommandIf__Group__14014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__CondAssignment_1_in_rule__CommandIf__Group__1__Impl4041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__2__Impl_in_rule__CommandIf__Group__24071 = new BitSet(new long[]{0x0000000C22004020L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__3_in_rule__CommandIf__Group__24074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CommandIf__Group__2__Impl4102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__3__Impl_in_rule__CommandIf__Group__34133 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__4_in_rule__CommandIf__Group__34136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__CmdsThenAssignment_3_in_rule__CommandIf__Group__3__Impl4163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__4__Impl_in_rule__CommandIf__Group__44193 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__5_in_rule__CommandIf__Group__44196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__Group_4__0_in_rule__CommandIf__Group__4__Impl4223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__5__Impl_in_rule__CommandIf__Group__54254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CommandIf__Group__5__Impl4282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__Group_4__0__Impl_in_rule__CommandIf__Group_4__04325 = new BitSet(new long[]{0x0000000C22004020L});
    public static final BitSet FOLLOW_rule__CommandIf__Group_4__1_in_rule__CommandIf__Group_4__04328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__CommandIf__Group_4__0__Impl4356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__Group_4__1__Impl_in_rule__CommandIf__Group_4__14387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__CmdsElseAssignment_4_1_in_rule__CommandIf__Group_4__1__Impl4414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__0__Impl_in_rule__CommandForEach__Group__04448 = new BitSet(new long[]{0x0000021080000030L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__1_in_rule__CommandForEach__Group__04451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CommandForEach__Group__0__Impl4479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__1__Impl_in_rule__CommandForEach__Group__14510 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__2_in_rule__CommandForEach__Group__14513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__ElemAssignment_1_in_rule__CommandForEach__Group__1__Impl4540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__2__Impl_in_rule__CommandForEach__Group__24570 = new BitSet(new long[]{0x0000021080000030L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__3_in_rule__CommandForEach__Group__24573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__CommandForEach__Group__2__Impl4601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__3__Impl_in_rule__CommandForEach__Group__34632 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__4_in_rule__CommandForEach__Group__34635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__EnsembAssignment_3_in_rule__CommandForEach__Group__3__Impl4662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__4__Impl_in_rule__CommandForEach__Group__44692 = new BitSet(new long[]{0x0000000C22004020L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__5_in_rule__CommandForEach__Group__44695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CommandForEach__Group__4__Impl4723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__5__Impl_in_rule__CommandForEach__Group__54754 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__6_in_rule__CommandForEach__Group__54757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__CmdsAssignment_5_in_rule__CommandForEach__Group__5__Impl4784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__6__Impl_in_rule__CommandForEach__Group__64814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CommandForEach__Group__6__Impl4842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group__0__Impl_in_rule__Exprs__Group__04887 = new BitSet(new long[]{0x0000021080000030L});
    public static final BitSet FOLLOW_rule__Exprs__Group__1_in_rule__Exprs__Group__04890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_0__0_in_rule__Exprs__Group__0__Impl4917 = new BitSet(new long[]{0x0000021080000032L});
    public static final BitSet FOLLOW_rule__Exprs__Group__1__Impl_in_rule__Exprs__Group__14948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__ExpGenAssignment_1_in_rule__Exprs__Group__1__Impl4975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_0__0__Impl_in_rule__Exprs__Group_0__05009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_0_0__0_in_rule__Exprs__Group_0__0__Impl5036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_0_0__0__Impl_in_rule__Exprs__Group_0_0__05068 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Exprs__Group_0_0__1_in_rule__Exprs__Group_0_0__05071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__ExpGenAssignment_0_0_0_in_rule__Exprs__Group_0_0__0__Impl5098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_0_0__1__Impl_in_rule__Exprs__Group_0_0__15128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Exprs__Group_0_0__1__Impl5156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group_0__0__Impl_in_rule__Expr__Group_0__05191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__ExprSimpAssignment_0_0_in_rule__Expr__Group_0__0__Impl5218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1__0__Impl_in_rule__ExprSimple__Group_1__05250 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1__1_in_rule__ExprSimple__Group_1__05253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ExprSimple__Group_1__0__Impl5281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1__1__Impl_in_rule__ExprSimple__Group_1__15312 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1__2_in_rule__ExprSimple__Group_1__15315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__ExprConsAssignment_1_1_in_rule__ExprSimple__Group_1__1__Impl5342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1__2__Impl_in_rule__ExprSimple__Group_1__25372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ExprSimple__Group_1__2__Impl5400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_2__0__Impl_in_rule__ExprSimple__Group_2__05437 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_2__1_in_rule__ExprSimple__Group_2__05440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ExprSimple__Group_2__0__Impl5468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_2__1__Impl_in_rule__ExprSimple__Group_2__15499 = new BitSet(new long[]{0x0000021080000030L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_2__2_in_rule__ExprSimple__Group_2__15502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__ExprHeadAssignment_2_1_in_rule__ExprSimple__Group_2__1__Impl5529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_2__2__Impl_in_rule__ExprSimple__Group_2__25559 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_2__3_in_rule__ExprSimple__Group_2__25562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__ExprHeadAttAssignment_2_2_in_rule__ExprSimple__Group_2__2__Impl5589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_2__3__Impl_in_rule__ExprSimple__Group_2__35619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ExprSimple__Group_2__3__Impl5647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_3__0__Impl_in_rule__ExprSimple__Group_3__05686 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_3__1_in_rule__ExprSimple__Group_3__05689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ExprSimple__Group_3__0__Impl5717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_3__1__Impl_in_rule__ExprSimple__Group_3__15748 = new BitSet(new long[]{0x0000021080000030L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_3__2_in_rule__ExprSimple__Group_3__15751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__ExprTailAssignment_3_1_in_rule__ExprSimple__Group_3__1__Impl5778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_3__2__Impl_in_rule__ExprSimple__Group_3__25808 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_3__3_in_rule__ExprSimple__Group_3__25811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__ExprTailAttAssignment_3_2_in_rule__ExprSimple__Group_3__2__Impl5838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_3__3__Impl_in_rule__ExprSimple__Group_3__35868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ExprSimple__Group_3__3__Impl5896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__0__Impl_in_rule__ExprSimple__Group_4__05935 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__1_in_rule__ExprSimple__Group_4__05938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ExprSimple__Group_4__0__Impl5966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__1__Impl_in_rule__ExprSimple__Group_4__15997 = new BitSet(new long[]{0x0000021080000030L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__2_in_rule__ExprSimple__Group_4__16000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__NomSymbAssignment_4_1_in_rule__ExprSimple__Group_4__1__Impl6027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__2__Impl_in_rule__ExprSimple__Group_4__26057 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__3_in_rule__ExprSimple__Group_4__26060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__SymbAttAssignment_4_2_in_rule__ExprSimple__Group_4__2__Impl6087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__3__Impl_in_rule__ExprSimple__Group_4__36117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ExprSimple__Group_4__3__Impl6145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group__0__Impl_in_rule__ExprAnd__Group__06184 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group__1_in_rule__ExprAnd__Group__06187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__ExprOrAssignment_0_in_rule__ExprAnd__Group__0__Impl6214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group__1__Impl_in_rule__ExprAnd__Group__16244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__0_in_rule__ExprAnd__Group__1__Impl6271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__0__Impl_in_rule__ExprAnd__Group_1__06306 = new BitSet(new long[]{0x0000021080000030L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__1_in_rule__ExprAnd__Group_1__06309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__ExprAndAssignment_1_0_in_rule__ExprAnd__Group_1__0__Impl6336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__1__Impl_in_rule__ExprAnd__Group_1__16366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__ExprAndAttAssignment_1_1_in_rule__ExprAnd__Group_1__1__Impl6393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group__0__Impl_in_rule__ExprOr__Group__06427 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__ExprOr__Group__1_in_rule__ExprOr__Group__06430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__ExprNotAssignment_0_in_rule__ExprOr__Group__0__Impl6457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group__1__Impl_in_rule__ExprOr__Group__16487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__0_in_rule__ExprOr__Group__1__Impl6514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__0__Impl_in_rule__ExprOr__Group_1__06549 = new BitSet(new long[]{0x0000021080000030L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__1_in_rule__ExprOr__Group_1__06552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__ExprOrAssignment_1_0_in_rule__ExprOr__Group_1__0__Impl6579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__1__Impl_in_rule__ExprOr__Group_1__16609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__ExprOrAttAssignment_1_1_in_rule__ExprOr__Group_1__1__Impl6636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNot__Group__0__Impl_in_rule__ExprNot__Group__06670 = new BitSet(new long[]{0x0000021080000030L});
    public static final BitSet FOLLOW_rule__ExprNot__Group__1_in_rule__ExprNot__Group__06673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNot__NotAssignment_0_in_rule__ExprNot__Group__0__Impl6700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNot__Group__1__Impl_in_rule__ExprNot__Group__16731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNot__ExprEqAssignment_1_in_rule__ExprNot__Group__1__Impl6758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__0__Impl_in_rule__ExprEq__Group_0__06792 = new BitSet(new long[]{0x0000021080000030L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__1_in_rule__ExprEq__Group_0__06795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ExprEq__Group_0__0__Impl6823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__1__Impl_in_rule__ExprEq__Group_0__16854 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__2_in_rule__ExprEq__Group_0__16857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__ExprAssignment_0_1_in_rule__ExprEq__Group_0__1__Impl6884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__2__Impl_in_rule__ExprEq__Group_0__26914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ExprEq__Group_0__2__Impl6942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__0__Impl_in_rule__ExprEq__Group_1__06979 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__1_in_rule__ExprEq__Group_1__06982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__ExprSim1Assignment_1_0_in_rule__ExprEq__Group_1__0__Impl7009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__1__Impl_in_rule__ExprEq__Group_1__17039 = new BitSet(new long[]{0x0000001080000030L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__2_in_rule__ExprEq__Group_1__17042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ExprEq__Group_1__1__Impl7070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__2__Impl_in_rule__ExprEq__Group_1__27101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__ExprSim2Assignment_1_2_in_rule__ExprEq__Group_1__2__Impl7128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cons__Group__0__Impl_in_rule__Cons__Group__07164 = new BitSet(new long[]{0x0000021080000030L});
    public static final BitSet FOLLOW_rule__Cons__Group__1_in_rule__Cons__Group__07167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cons__ExprConsAssignment_0_in_rule__Cons__Group__0__Impl7194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cons__Group__1__Impl_in_rule__Cons__Group__17224 = new BitSet(new long[]{0x0000021080000030L});
    public static final BitSet FOLLOW_rule__Cons__Group__2_in_rule__Cons__Group__17227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cons__ExprConsAtt1Assignment_1_in_rule__Cons__Group__1__Impl7254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cons__Group__2__Impl_in_rule__Cons__Group__27284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cons__ExprConsAttListAssignment_2_in_rule__Cons__Group__2__Impl7311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_rule__Program__FonctionsAssignment7352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOL_in_rule__Function__NomAssignment_17383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_rule__Function__DefinitionAssignment_37414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_rule__Definition__InputsAssignment_17445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Definition__CommandesAssignment_37476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutput_in_rule__Definition__OutputsAssignment_67507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Input__VarInAssignment_0_07538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Input__VarInAssignment_17569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Output__VarOutAssignment_0_07600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Output__VarOutAssignment_17631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Vars__VarGenAssignment_0_07662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Vars__VarGenAssignment_17693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__Commands__CommandeAssignment_0_0_07724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__Commands__CommandeAssignment_17755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Command__NopAssignment_07791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_rule__Command__VarsAssignment_1_07830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprs_in_rule__Command__ExprsAssignment_1_27861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandWhile_in_rule__Command__CmdWhileAssignment_27892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandIf_in_rule__Command__CmdIfAssignment_37923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandForEach_in_rule__Command__CmdForEachAssignment_47954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__CommandWhile__WAssignment_0_07990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__CommandWhile__ExprAssignment_18029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__CommandWhile__CmdsAssignment_38060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__CommandIf__CondAssignment_18091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__CommandIf__CmdsThenAssignment_38122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__CommandIf__CmdsElseAssignment_4_18153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__CommandForEach__ElemAssignment_18184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__CommandForEach__EnsembAssignment_38215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__CommandForEach__CmdsAssignment_58246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Exprs__ExpGenAssignment_0_0_08277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Exprs__ExpGenAssignment_18308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_rule__Expr__ExprSimpAssignment_0_08339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_rule__Expr__ExprAndAssignment_18370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ExprSimple__NilAssignment_0_08406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__ExprSimple__VariAssignment_0_18445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOL_in_rule__ExprSimple__SymbAssignment_0_28476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCons_in_rule__ExprSimple__ExprConsAssignment_1_18507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ExprSimple__ExprHeadAssignment_2_18543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__ExprSimple__ExprHeadAttAssignment_2_28582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ExprSimple__ExprTailAssignment_3_18618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__ExprSimple__ExprTailAttAssignment_3_28657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOL_in_rule__ExprSimple__NomSymbAssignment_4_18688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__ExprSimple__SymbAttAssignment_4_28719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_rule__ExprAnd__ExprOrAssignment_08750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ExprAnd__ExprAndAssignment_1_08786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_rule__ExprAnd__ExprAndAttAssignment_1_18825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprNot_in_rule__ExprOr__ExprNotAssignment_08856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ExprOr__ExprOrAssignment_1_08892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_rule__ExprOr__ExprOrAttAssignment_1_18931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ExprNot__NotAssignment_08967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprEq_in_rule__ExprNot__ExprEqAssignment_19006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__ExprEq__ExprAssignment_0_19037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_rule__ExprEq__ExprSim1Assignment_1_09068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_rule__ExprEq__ExprSim2Assignment_1_29099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Cons__ExprConsAssignment_09135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Cons__ExprConsAtt1Assignment_19174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConsAttList_in_rule__Cons__ExprConsAttListAssignment_29205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__ConsAttList__ConsListAssignment9236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group_0__0_in_synpred8_InternalWhileCpp1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__0_in_synpred15_InternalWhileCpp1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_0__0_in_synpred19_InternalWhileCpp3179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_0__0_in_synpred21_InternalWhileCpp4917 = new BitSet(new long[]{0x0000000000000002L});

}