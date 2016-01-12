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


    // $ANTLR start "rule__Command__Alternatives"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:593:1: rule__Command__Alternatives : ( ( ( rule__Command__NopAssignment_0 ) ) | ( ( rule__Command__Group_1__0 ) ) | ( ( rule__Command__CmdWhileAssignment_2 ) ) | ( ( rule__Command__CmdIfAssignment_3 ) ) | ( ( rule__Command__CmdForEachAssignment_4 ) ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:597:1: ( ( ( rule__Command__NopAssignment_0 ) ) | ( ( rule__Command__Group_1__0 ) ) | ( ( rule__Command__CmdWhileAssignment_2 ) ) | ( ( rule__Command__CmdIfAssignment_3 ) ) | ( ( rule__Command__CmdForEachAssignment_4 ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt2=1;
                }
                break;
            case RULE_VARIABLE:
                {
                alt2=2;
                }
                break;
            case 14:
            case 35:
                {
                alt2=3;
                }
                break;
            case 25:
                {
                alt2=4;
                }
                break;
            case 29:
                {
                alt2=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:598:1: ( ( rule__Command__NopAssignment_0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:598:1: ( ( rule__Command__NopAssignment_0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:599:1: ( rule__Command__NopAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getNopAssignment_0()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:600:1: ( rule__Command__NopAssignment_0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:600:2: rule__Command__NopAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Command__NopAssignment_0_in_rule__Command__Alternatives1217);
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
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:604:6: ( ( rule__Command__Group_1__0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:604:6: ( ( rule__Command__Group_1__0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:605:1: ( rule__Command__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getGroup_1()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:606:1: ( rule__Command__Group_1__0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:606:2: rule__Command__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Command__Group_1__0_in_rule__Command__Alternatives1235);
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
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:610:6: ( ( rule__Command__CmdWhileAssignment_2 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:610:6: ( ( rule__Command__CmdWhileAssignment_2 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:611:1: ( rule__Command__CmdWhileAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getCmdWhileAssignment_2()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:612:1: ( rule__Command__CmdWhileAssignment_2 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:612:2: rule__Command__CmdWhileAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Command__CmdWhileAssignment_2_in_rule__Command__Alternatives1253);
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
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:616:6: ( ( rule__Command__CmdIfAssignment_3 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:616:6: ( ( rule__Command__CmdIfAssignment_3 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:617:1: ( rule__Command__CmdIfAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getCmdIfAssignment_3()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:618:1: ( rule__Command__CmdIfAssignment_3 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:618:2: rule__Command__CmdIfAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Command__CmdIfAssignment_3_in_rule__Command__Alternatives1271);
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
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:622:6: ( ( rule__Command__CmdForEachAssignment_4 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:622:6: ( ( rule__Command__CmdForEachAssignment_4 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:623:1: ( rule__Command__CmdForEachAssignment_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getCmdForEachAssignment_4()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:624:1: ( rule__Command__CmdForEachAssignment_4 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:624:2: rule__Command__CmdForEachAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Command__CmdForEachAssignment_4_in_rule__Command__Alternatives1289);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:633:1: rule__CommandWhile__Alternatives_0 : ( ( ( rule__CommandWhile__WAssignment_0_0 ) ) | ( 'for' ) );
    public final void rule__CommandWhile__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:637:1: ( ( ( rule__CommandWhile__WAssignment_0_0 ) ) | ( 'for' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==35) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:638:1: ( ( rule__CommandWhile__WAssignment_0_0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:638:1: ( ( rule__CommandWhile__WAssignment_0_0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:639:1: ( rule__CommandWhile__WAssignment_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandWhileAccess().getWAssignment_0_0()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:640:1: ( rule__CommandWhile__WAssignment_0_0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:640:2: rule__CommandWhile__WAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__CommandWhile__WAssignment_0_0_in_rule__CommandWhile__Alternatives_01322);
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
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:644:6: ( 'for' )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:644:6: ( 'for' )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:645:1: 'for'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandWhileAccess().getForKeyword_0_1()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__CommandWhile__Alternatives_01341); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:657:1: rule__Expr__Alternatives : ( ( ( rule__Expr__Group_0__0 ) ) | ( ( rule__Expr__ExprAndAssignment_1 ) ) );
    public final void rule__Expr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:661:1: ( ( ( rule__Expr__Group_0__0 ) ) | ( ( rule__Expr__ExprAndAssignment_1 ) ) )
            int alt4=2;
            switch ( input.LA(1) ) {
            case 36:
                {
                int LA4_1 = input.LA(2);

                if ( (synpred7_InternalWhileCpp()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_VARIABLE:
                {
                int LA4_2 = input.LA(2);

                if ( (synpred7_InternalWhileCpp()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_SYMBOL:
                {
                int LA4_3 = input.LA(2);

                if ( (synpred7_InternalWhileCpp()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            case 31:
                {
                int LA4_4 = input.LA(2);

                if ( (synpred7_InternalWhileCpp()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 4, input);

                    throw nvae;
                }
                }
                break;
            case 41:
                {
                alt4=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:662:1: ( ( rule__Expr__Group_0__0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:662:1: ( ( rule__Expr__Group_0__0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:663:1: ( rule__Expr__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprAccess().getGroup_0()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:664:1: ( rule__Expr__Group_0__0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:664:2: rule__Expr__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Expr__Group_0__0_in_rule__Expr__Alternatives1375);
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
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:668:6: ( ( rule__Expr__ExprAndAssignment_1 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:668:6: ( ( rule__Expr__ExprAndAssignment_1 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:669:1: ( rule__Expr__ExprAndAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprAccess().getExprAndAssignment_1()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:670:1: ( rule__Expr__ExprAndAssignment_1 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:670:2: rule__Expr__ExprAndAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Expr__ExprAndAssignment_1_in_rule__Expr__Alternatives1393);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:679:1: rule__ExprSimple__Alternatives : ( ( ( rule__ExprSimple__Alternatives_0 ) ) | ( ( rule__ExprSimple__Group_1__0 ) ) | ( ( rule__ExprSimple__Group_2__0 ) ) | ( ( rule__ExprSimple__Group_3__0 ) ) | ( ( rule__ExprSimple__Group_4__0 ) ) );
    public final void rule__ExprSimple__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:683:1: ( ( ( rule__ExprSimple__Alternatives_0 ) ) | ( ( rule__ExprSimple__Group_1__0 ) ) | ( ( rule__ExprSimple__Group_2__0 ) ) | ( ( rule__ExprSimple__Group_3__0 ) ) | ( ( rule__ExprSimple__Group_4__0 ) ) )
            int alt5=5;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_SYMBOL && LA5_0<=RULE_VARIABLE)||LA5_0==36) ) {
                alt5=1;
            }
            else if ( (LA5_0==31) ) {
                switch ( input.LA(2) ) {
                case RULE_SYMBOL:
                    {
                    alt5=5;
                    }
                    break;
                case 42:
                    {
                    alt5=2;
                    }
                    break;
                case 37:
                    {
                    alt5=3;
                    }
                    break;
                case 38:
                    {
                    alt5=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:684:1: ( ( rule__ExprSimple__Alternatives_0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:684:1: ( ( rule__ExprSimple__Alternatives_0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:685:1: ( rule__ExprSimple__Alternatives_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getAlternatives_0()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:686:1: ( rule__ExprSimple__Alternatives_0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:686:2: rule__ExprSimple__Alternatives_0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__Alternatives_0_in_rule__ExprSimple__Alternatives1426);
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
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:690:6: ( ( rule__ExprSimple__Group_1__0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:690:6: ( ( rule__ExprSimple__Group_1__0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:691:1: ( rule__ExprSimple__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getGroup_1()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:692:1: ( rule__ExprSimple__Group_1__0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:692:2: rule__ExprSimple__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__Group_1__0_in_rule__ExprSimple__Alternatives1444);
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
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:696:6: ( ( rule__ExprSimple__Group_2__0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:696:6: ( ( rule__ExprSimple__Group_2__0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:697:1: ( rule__ExprSimple__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getGroup_2()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:698:1: ( rule__ExprSimple__Group_2__0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:698:2: rule__ExprSimple__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__Group_2__0_in_rule__ExprSimple__Alternatives1462);
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
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:702:6: ( ( rule__ExprSimple__Group_3__0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:702:6: ( ( rule__ExprSimple__Group_3__0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:703:1: ( rule__ExprSimple__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getGroup_3()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:704:1: ( rule__ExprSimple__Group_3__0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:704:2: rule__ExprSimple__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__Group_3__0_in_rule__ExprSimple__Alternatives1480);
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
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:708:6: ( ( rule__ExprSimple__Group_4__0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:708:6: ( ( rule__ExprSimple__Group_4__0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:709:1: ( rule__ExprSimple__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getGroup_4()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:710:1: ( rule__ExprSimple__Group_4__0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:710:2: rule__ExprSimple__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__Group_4__0_in_rule__ExprSimple__Alternatives1498);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:719:1: rule__ExprSimple__Alternatives_0 : ( ( ( rule__ExprSimple__NilAssignment_0_0 ) ) | ( ( rule__ExprSimple__VariAssignment_0_1 ) ) | ( ( rule__ExprSimple__SymbAssignment_0_2 ) ) );
    public final void rule__ExprSimple__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:723:1: ( ( ( rule__ExprSimple__NilAssignment_0_0 ) ) | ( ( rule__ExprSimple__VariAssignment_0_1 ) ) | ( ( rule__ExprSimple__SymbAssignment_0_2 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt6=1;
                }
                break;
            case RULE_VARIABLE:
                {
                alt6=2;
                }
                break;
            case RULE_SYMBOL:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:724:1: ( ( rule__ExprSimple__NilAssignment_0_0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:724:1: ( ( rule__ExprSimple__NilAssignment_0_0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:725:1: ( rule__ExprSimple__NilAssignment_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getNilAssignment_0_0()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:726:1: ( rule__ExprSimple__NilAssignment_0_0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:726:2: rule__ExprSimple__NilAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__NilAssignment_0_0_in_rule__ExprSimple__Alternatives_01531);
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
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:730:6: ( ( rule__ExprSimple__VariAssignment_0_1 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:730:6: ( ( rule__ExprSimple__VariAssignment_0_1 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:731:1: ( rule__ExprSimple__VariAssignment_0_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getVariAssignment_0_1()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:732:1: ( rule__ExprSimple__VariAssignment_0_1 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:732:2: rule__ExprSimple__VariAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__VariAssignment_0_1_in_rule__ExprSimple__Alternatives_01549);
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
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:736:6: ( ( rule__ExprSimple__SymbAssignment_0_2 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:736:6: ( ( rule__ExprSimple__SymbAssignment_0_2 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:737:1: ( rule__ExprSimple__SymbAssignment_0_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getSymbAssignment_0_2()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:738:1: ( rule__ExprSimple__SymbAssignment_0_2 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:738:2: rule__ExprSimple__SymbAssignment_0_2
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__SymbAssignment_0_2_in_rule__ExprSimple__Alternatives_01567);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:747:1: rule__ExprEq__Alternatives : ( ( ( rule__ExprEq__Group_0__0 ) ) | ( ( rule__ExprEq__Group_1__0 ) ) );
    public final void rule__ExprEq__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:751:1: ( ( ( rule__ExprEq__Group_0__0 ) ) | ( ( rule__ExprEq__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==31) ) {
                int LA7_1 = input.LA(2);

                if ( (synpred14_InternalWhileCpp()) ) {
                    alt7=1;
                }
                else if ( (true) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA7_0>=RULE_SYMBOL && LA7_0<=RULE_VARIABLE)||LA7_0==36) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:752:1: ( ( rule__ExprEq__Group_0__0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:752:1: ( ( rule__ExprEq__Group_0__0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:753:1: ( rule__ExprEq__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprEqAccess().getGroup_0()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:754:1: ( rule__ExprEq__Group_0__0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:754:2: rule__ExprEq__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ExprEq__Group_0__0_in_rule__ExprEq__Alternatives1600);
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
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:758:6: ( ( rule__ExprEq__Group_1__0 ) )
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:758:6: ( ( rule__ExprEq__Group_1__0 ) )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:759:1: ( rule__ExprEq__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprEqAccess().getGroup_1()); 
                    }
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:760:1: ( rule__ExprEq__Group_1__0 )
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:760:2: rule__ExprEq__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ExprEq__Group_1__0_in_rule__ExprEq__Alternatives1618);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:771:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:775:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:776:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__01649);
            rule__Function__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__1_in_rule__Function__Group__01652);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:783:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:787:1: ( ( 'function' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:788:1: ( 'function' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:788:1: ( 'function' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:789:1: 'function'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            }
            match(input,15,FOLLOW_15_in_rule__Function__Group__0__Impl1680); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:802:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:806:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:807:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__11711);
            rule__Function__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__2_in_rule__Function__Group__11714);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:814:1: rule__Function__Group__1__Impl : ( ( rule__Function__NomAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:818:1: ( ( ( rule__Function__NomAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:819:1: ( ( rule__Function__NomAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:819:1: ( ( rule__Function__NomAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:820:1: ( rule__Function__NomAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getNomAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:821:1: ( rule__Function__NomAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:821:2: rule__Function__NomAssignment_1
            {
            pushFollow(FOLLOW_rule__Function__NomAssignment_1_in_rule__Function__Group__1__Impl1741);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:831:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:835:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:836:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__21771);
            rule__Function__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__3_in_rule__Function__Group__21774);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:843:1: rule__Function__Group__2__Impl : ( ':' ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:847:1: ( ( ':' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:848:1: ( ':' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:848:1: ( ':' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:849:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getColonKeyword_2()); 
            }
            match(input,16,FOLLOW_16_in_rule__Function__Group__2__Impl1802); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:862:1: rule__Function__Group__3 : rule__Function__Group__3__Impl ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:866:1: ( rule__Function__Group__3__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:867:2: rule__Function__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__31833);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:873:1: rule__Function__Group__3__Impl : ( ( rule__Function__DefinitionAssignment_3 ) ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:877:1: ( ( ( rule__Function__DefinitionAssignment_3 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:878:1: ( ( rule__Function__DefinitionAssignment_3 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:878:1: ( ( rule__Function__DefinitionAssignment_3 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:879:1: ( rule__Function__DefinitionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getDefinitionAssignment_3()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:880:1: ( rule__Function__DefinitionAssignment_3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:880:2: rule__Function__DefinitionAssignment_3
            {
            pushFollow(FOLLOW_rule__Function__DefinitionAssignment_3_in_rule__Function__Group__3__Impl1860);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:898:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:902:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:903:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
            {
            pushFollow(FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__01898);
            rule__Definition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__01901);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:910:1: rule__Definition__Group__0__Impl : ( 'read' ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:914:1: ( ( 'read' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:915:1: ( 'read' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:915:1: ( 'read' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:916:1: 'read'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getReadKeyword_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Definition__Group__0__Impl1929); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:929:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl rule__Definition__Group__2 ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:933:1: ( rule__Definition__Group__1__Impl rule__Definition__Group__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:934:2: rule__Definition__Group__1__Impl rule__Definition__Group__2
            {
            pushFollow(FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__11960);
            rule__Definition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__11963);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:941:1: rule__Definition__Group__1__Impl : ( ( rule__Definition__InputsAssignment_1 ) ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:945:1: ( ( ( rule__Definition__InputsAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:946:1: ( ( rule__Definition__InputsAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:946:1: ( ( rule__Definition__InputsAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:947:1: ( rule__Definition__InputsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getInputsAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:948:1: ( rule__Definition__InputsAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:948:2: rule__Definition__InputsAssignment_1
            {
            pushFollow(FOLLOW_rule__Definition__InputsAssignment_1_in_rule__Definition__Group__1__Impl1990);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:958:1: rule__Definition__Group__2 : rule__Definition__Group__2__Impl rule__Definition__Group__3 ;
    public final void rule__Definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:962:1: ( rule__Definition__Group__2__Impl rule__Definition__Group__3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:963:2: rule__Definition__Group__2__Impl rule__Definition__Group__3
            {
            pushFollow(FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__22020);
            rule__Definition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definition__Group__3_in_rule__Definition__Group__22023);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:970:1: rule__Definition__Group__2__Impl : ( '%' ) ;
    public final void rule__Definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:974:1: ( ( '%' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:975:1: ( '%' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:975:1: ( '%' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:976:1: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getPercentSignKeyword_2()); 
            }
            match(input,18,FOLLOW_18_in_rule__Definition__Group__2__Impl2051); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:989:1: rule__Definition__Group__3 : rule__Definition__Group__3__Impl rule__Definition__Group__4 ;
    public final void rule__Definition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:993:1: ( rule__Definition__Group__3__Impl rule__Definition__Group__4 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:994:2: rule__Definition__Group__3__Impl rule__Definition__Group__4
            {
            pushFollow(FOLLOW_rule__Definition__Group__3__Impl_in_rule__Definition__Group__32082);
            rule__Definition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definition__Group__4_in_rule__Definition__Group__32085);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1001:1: rule__Definition__Group__3__Impl : ( ( rule__Definition__CommandesAssignment_3 ) ) ;
    public final void rule__Definition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1005:1: ( ( ( rule__Definition__CommandesAssignment_3 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1006:1: ( ( rule__Definition__CommandesAssignment_3 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1006:1: ( ( rule__Definition__CommandesAssignment_3 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1007:1: ( rule__Definition__CommandesAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getCommandesAssignment_3()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1008:1: ( rule__Definition__CommandesAssignment_3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1008:2: rule__Definition__CommandesAssignment_3
            {
            pushFollow(FOLLOW_rule__Definition__CommandesAssignment_3_in_rule__Definition__Group__3__Impl2112);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1018:1: rule__Definition__Group__4 : rule__Definition__Group__4__Impl rule__Definition__Group__5 ;
    public final void rule__Definition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1022:1: ( rule__Definition__Group__4__Impl rule__Definition__Group__5 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1023:2: rule__Definition__Group__4__Impl rule__Definition__Group__5
            {
            pushFollow(FOLLOW_rule__Definition__Group__4__Impl_in_rule__Definition__Group__42142);
            rule__Definition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definition__Group__5_in_rule__Definition__Group__42145);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1030:1: rule__Definition__Group__4__Impl : ( '%' ) ;
    public final void rule__Definition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1034:1: ( ( '%' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1035:1: ( '%' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1035:1: ( '%' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1036:1: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getPercentSignKeyword_4()); 
            }
            match(input,18,FOLLOW_18_in_rule__Definition__Group__4__Impl2173); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1049:1: rule__Definition__Group__5 : rule__Definition__Group__5__Impl rule__Definition__Group__6 ;
    public final void rule__Definition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1053:1: ( rule__Definition__Group__5__Impl rule__Definition__Group__6 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1054:2: rule__Definition__Group__5__Impl rule__Definition__Group__6
            {
            pushFollow(FOLLOW_rule__Definition__Group__5__Impl_in_rule__Definition__Group__52204);
            rule__Definition__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definition__Group__6_in_rule__Definition__Group__52207);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1061:1: rule__Definition__Group__5__Impl : ( 'write' ) ;
    public final void rule__Definition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1065:1: ( ( 'write' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1066:1: ( 'write' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1066:1: ( 'write' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1067:1: 'write'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getWriteKeyword_5()); 
            }
            match(input,19,FOLLOW_19_in_rule__Definition__Group__5__Impl2235); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1080:1: rule__Definition__Group__6 : rule__Definition__Group__6__Impl ;
    public final void rule__Definition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1084:1: ( rule__Definition__Group__6__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1085:2: rule__Definition__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group__6__Impl_in_rule__Definition__Group__62266);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1091:1: rule__Definition__Group__6__Impl : ( ( rule__Definition__OutputsAssignment_6 ) ) ;
    public final void rule__Definition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1095:1: ( ( ( rule__Definition__OutputsAssignment_6 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1096:1: ( ( rule__Definition__OutputsAssignment_6 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1096:1: ( ( rule__Definition__OutputsAssignment_6 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1097:1: ( rule__Definition__OutputsAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getOutputsAssignment_6()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1098:1: ( rule__Definition__OutputsAssignment_6 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1098:2: rule__Definition__OutputsAssignment_6
            {
            pushFollow(FOLLOW_rule__Definition__OutputsAssignment_6_in_rule__Definition__Group__6__Impl2293);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1122:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1126:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1127:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__02337);
            rule__Input__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group__1_in_rule__Input__Group__02340);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1134:1: rule__Input__Group__0__Impl : ( ( rule__Input__Group_0__0 )* ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1138:1: ( ( ( rule__Input__Group_0__0 )* ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1139:1: ( ( rule__Input__Group_0__0 )* )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1139:1: ( ( rule__Input__Group_0__0 )* )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1140:1: ( rule__Input__Group_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getGroup_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1141:1: ( rule__Input__Group_0__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_VARIABLE) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==20) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1141:2: rule__Input__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__Input__Group_0__0_in_rule__Input__Group__0__Impl2367);
            	    rule__Input__Group_0__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1151:1: rule__Input__Group__1 : rule__Input__Group__1__Impl ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1155:1: ( rule__Input__Group__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1156:2: rule__Input__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__12398);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1162:1: rule__Input__Group__1__Impl : ( ( rule__Input__VarInAssignment_1 ) ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1166:1: ( ( ( rule__Input__VarInAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1167:1: ( ( rule__Input__VarInAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1167:1: ( ( rule__Input__VarInAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1168:1: ( rule__Input__VarInAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVarInAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1169:1: ( rule__Input__VarInAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1169:2: rule__Input__VarInAssignment_1
            {
            pushFollow(FOLLOW_rule__Input__VarInAssignment_1_in_rule__Input__Group__1__Impl2425);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1183:1: rule__Input__Group_0__0 : rule__Input__Group_0__0__Impl rule__Input__Group_0__1 ;
    public final void rule__Input__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1187:1: ( rule__Input__Group_0__0__Impl rule__Input__Group_0__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1188:2: rule__Input__Group_0__0__Impl rule__Input__Group_0__1
            {
            pushFollow(FOLLOW_rule__Input__Group_0__0__Impl_in_rule__Input__Group_0__02459);
            rule__Input__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group_0__1_in_rule__Input__Group_0__02462);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1195:1: rule__Input__Group_0__0__Impl : ( ( rule__Input__VarInAssignment_0_0 ) ) ;
    public final void rule__Input__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1199:1: ( ( ( rule__Input__VarInAssignment_0_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1200:1: ( ( rule__Input__VarInAssignment_0_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1200:1: ( ( rule__Input__VarInAssignment_0_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1201:1: ( rule__Input__VarInAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVarInAssignment_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1202:1: ( rule__Input__VarInAssignment_0_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1202:2: rule__Input__VarInAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Input__VarInAssignment_0_0_in_rule__Input__Group_0__0__Impl2489);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1212:1: rule__Input__Group_0__1 : rule__Input__Group_0__1__Impl ;
    public final void rule__Input__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1216:1: ( rule__Input__Group_0__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1217:2: rule__Input__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group_0__1__Impl_in_rule__Input__Group_0__12519);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1223:1: rule__Input__Group_0__1__Impl : ( ',' ) ;
    public final void rule__Input__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1227:1: ( ( ',' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1228:1: ( ',' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1228:1: ( ',' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1229:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getCommaKeyword_0_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__Input__Group_0__1__Impl2547); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1246:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1250:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1251:2: rule__Output__Group__0__Impl rule__Output__Group__1
            {
            pushFollow(FOLLOW_rule__Output__Group__0__Impl_in_rule__Output__Group__02582);
            rule__Output__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Output__Group__1_in_rule__Output__Group__02585);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1258:1: rule__Output__Group__0__Impl : ( ( rule__Output__Group_0__0 )* ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1262:1: ( ( ( rule__Output__Group_0__0 )* ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1263:1: ( ( rule__Output__Group_0__0 )* )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1263:1: ( ( rule__Output__Group_0__0 )* )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1264:1: ( rule__Output__Group_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getGroup_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1265:1: ( rule__Output__Group_0__0 )*
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
            	    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1265:2: rule__Output__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__Output__Group_0__0_in_rule__Output__Group__0__Impl2612);
            	    rule__Output__Group_0__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1275:1: rule__Output__Group__1 : rule__Output__Group__1__Impl ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1279:1: ( rule__Output__Group__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1280:2: rule__Output__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Output__Group__1__Impl_in_rule__Output__Group__12643);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1286:1: rule__Output__Group__1__Impl : ( ( rule__Output__VarOutAssignment_1 ) ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1290:1: ( ( ( rule__Output__VarOutAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1291:1: ( ( rule__Output__VarOutAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1291:1: ( ( rule__Output__VarOutAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1292:1: ( rule__Output__VarOutAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVarOutAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1293:1: ( rule__Output__VarOutAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1293:2: rule__Output__VarOutAssignment_1
            {
            pushFollow(FOLLOW_rule__Output__VarOutAssignment_1_in_rule__Output__Group__1__Impl2670);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1307:1: rule__Output__Group_0__0 : rule__Output__Group_0__0__Impl rule__Output__Group_0__1 ;
    public final void rule__Output__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1311:1: ( rule__Output__Group_0__0__Impl rule__Output__Group_0__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1312:2: rule__Output__Group_0__0__Impl rule__Output__Group_0__1
            {
            pushFollow(FOLLOW_rule__Output__Group_0__0__Impl_in_rule__Output__Group_0__02704);
            rule__Output__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Output__Group_0__1_in_rule__Output__Group_0__02707);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1319:1: rule__Output__Group_0__0__Impl : ( ( rule__Output__VarOutAssignment_0_0 ) ) ;
    public final void rule__Output__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1323:1: ( ( ( rule__Output__VarOutAssignment_0_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1324:1: ( ( rule__Output__VarOutAssignment_0_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1324:1: ( ( rule__Output__VarOutAssignment_0_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1325:1: ( rule__Output__VarOutAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVarOutAssignment_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1326:1: ( rule__Output__VarOutAssignment_0_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1326:2: rule__Output__VarOutAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Output__VarOutAssignment_0_0_in_rule__Output__Group_0__0__Impl2734);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1336:1: rule__Output__Group_0__1 : rule__Output__Group_0__1__Impl ;
    public final void rule__Output__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1340:1: ( rule__Output__Group_0__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1341:2: rule__Output__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Output__Group_0__1__Impl_in_rule__Output__Group_0__12764);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1347:1: rule__Output__Group_0__1__Impl : ( ',' ) ;
    public final void rule__Output__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1351:1: ( ( ',' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1352:1: ( ',' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1352:1: ( ',' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1353:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getCommaKeyword_0_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__Output__Group_0__1__Impl2792); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1370:1: rule__Vars__Group__0 : rule__Vars__Group__0__Impl rule__Vars__Group__1 ;
    public final void rule__Vars__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1374:1: ( rule__Vars__Group__0__Impl rule__Vars__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1375:2: rule__Vars__Group__0__Impl rule__Vars__Group__1
            {
            pushFollow(FOLLOW_rule__Vars__Group__0__Impl_in_rule__Vars__Group__02827);
            rule__Vars__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Vars__Group__1_in_rule__Vars__Group__02830);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1382:1: rule__Vars__Group__0__Impl : ( ( rule__Vars__Group_0__0 )* ) ;
    public final void rule__Vars__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1386:1: ( ( ( rule__Vars__Group_0__0 )* ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1387:1: ( ( rule__Vars__Group_0__0 )* )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1387:1: ( ( rule__Vars__Group_0__0 )* )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1388:1: ( rule__Vars__Group_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getGroup_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1389:1: ( rule__Vars__Group_0__0 )*
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
            	    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1389:2: rule__Vars__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__Vars__Group_0__0_in_rule__Vars__Group__0__Impl2857);
            	    rule__Vars__Group_0__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1399:1: rule__Vars__Group__1 : rule__Vars__Group__1__Impl ;
    public final void rule__Vars__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1403:1: ( rule__Vars__Group__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1404:2: rule__Vars__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Vars__Group__1__Impl_in_rule__Vars__Group__12888);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1410:1: rule__Vars__Group__1__Impl : ( ( rule__Vars__VarGenAssignment_1 ) ) ;
    public final void rule__Vars__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1414:1: ( ( ( rule__Vars__VarGenAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1415:1: ( ( rule__Vars__VarGenAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1415:1: ( ( rule__Vars__VarGenAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1416:1: ( rule__Vars__VarGenAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getVarGenAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1417:1: ( rule__Vars__VarGenAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1417:2: rule__Vars__VarGenAssignment_1
            {
            pushFollow(FOLLOW_rule__Vars__VarGenAssignment_1_in_rule__Vars__Group__1__Impl2915);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1431:1: rule__Vars__Group_0__0 : rule__Vars__Group_0__0__Impl rule__Vars__Group_0__1 ;
    public final void rule__Vars__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1435:1: ( rule__Vars__Group_0__0__Impl rule__Vars__Group_0__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1436:2: rule__Vars__Group_0__0__Impl rule__Vars__Group_0__1
            {
            pushFollow(FOLLOW_rule__Vars__Group_0__0__Impl_in_rule__Vars__Group_0__02949);
            rule__Vars__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Vars__Group_0__1_in_rule__Vars__Group_0__02952);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1443:1: rule__Vars__Group_0__0__Impl : ( ( rule__Vars__VarGenAssignment_0_0 ) ) ;
    public final void rule__Vars__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1447:1: ( ( ( rule__Vars__VarGenAssignment_0_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1448:1: ( ( rule__Vars__VarGenAssignment_0_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1448:1: ( ( rule__Vars__VarGenAssignment_0_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1449:1: ( rule__Vars__VarGenAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getVarGenAssignment_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1450:1: ( rule__Vars__VarGenAssignment_0_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1450:2: rule__Vars__VarGenAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Vars__VarGenAssignment_0_0_in_rule__Vars__Group_0__0__Impl2979);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1460:1: rule__Vars__Group_0__1 : rule__Vars__Group_0__1__Impl ;
    public final void rule__Vars__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1464:1: ( rule__Vars__Group_0__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1465:2: rule__Vars__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Vars__Group_0__1__Impl_in_rule__Vars__Group_0__13009);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1471:1: rule__Vars__Group_0__1__Impl : ( ',' ) ;
    public final void rule__Vars__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1475:1: ( ( ',' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1476:1: ( ',' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1476:1: ( ',' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1477:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getCommaKeyword_0_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__Vars__Group_0__1__Impl3037); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1494:1: rule__Commands__Group__0 : rule__Commands__Group__0__Impl rule__Commands__Group__1 ;
    public final void rule__Commands__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1498:1: ( rule__Commands__Group__0__Impl rule__Commands__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1499:2: rule__Commands__Group__0__Impl rule__Commands__Group__1
            {
            pushFollow(FOLLOW_rule__Commands__Group__0__Impl_in_rule__Commands__Group__03072);
            rule__Commands__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Commands__Group__1_in_rule__Commands__Group__03075);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1506:1: rule__Commands__Group__0__Impl : ( ( rule__Commands__Group_0__0 )* ) ;
    public final void rule__Commands__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1510:1: ( ( ( rule__Commands__Group_0__0 )* ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1511:1: ( ( rule__Commands__Group_0__0 )* )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1511:1: ( ( rule__Commands__Group_0__0 )* )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1512:1: ( rule__Commands__Group_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getGroup_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1513:1: ( rule__Commands__Group_0__0 )*
            loop11:
            do {
                int alt11=2;
                switch ( input.LA(1) ) {
                case 34:
                    {
                    int LA11_1 = input.LA(2);

                    if ( (synpred18_InternalWhileCpp()) ) {
                        alt11=1;
                    }


                    }
                    break;
                case RULE_VARIABLE:
                    {
                    int LA11_2 = input.LA(2);

                    if ( (synpred18_InternalWhileCpp()) ) {
                        alt11=1;
                    }


                    }
                    break;
                case 35:
                    {
                    int LA11_3 = input.LA(2);

                    if ( (synpred18_InternalWhileCpp()) ) {
                        alt11=1;
                    }


                    }
                    break;
                case 14:
                    {
                    int LA11_4 = input.LA(2);

                    if ( (synpred18_InternalWhileCpp()) ) {
                        alt11=1;
                    }


                    }
                    break;
                case 25:
                    {
                    int LA11_5 = input.LA(2);

                    if ( (synpred18_InternalWhileCpp()) ) {
                        alt11=1;
                    }


                    }
                    break;
                case 29:
                    {
                    int LA11_6 = input.LA(2);

                    if ( (synpred18_InternalWhileCpp()) ) {
                        alt11=1;
                    }


                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1513:2: rule__Commands__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__Commands__Group_0__0_in_rule__Commands__Group__0__Impl3102);
            	    rule__Commands__Group_0__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1523:1: rule__Commands__Group__1 : rule__Commands__Group__1__Impl ;
    public final void rule__Commands__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1527:1: ( rule__Commands__Group__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1528:2: rule__Commands__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Commands__Group__1__Impl_in_rule__Commands__Group__13133);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1534:1: rule__Commands__Group__1__Impl : ( ( rule__Commands__CommandeAssignment_1 ) ) ;
    public final void rule__Commands__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1538:1: ( ( ( rule__Commands__CommandeAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1539:1: ( ( rule__Commands__CommandeAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1539:1: ( ( rule__Commands__CommandeAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1540:1: ( rule__Commands__CommandeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getCommandeAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1541:1: ( rule__Commands__CommandeAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1541:2: rule__Commands__CommandeAssignment_1
            {
            pushFollow(FOLLOW_rule__Commands__CommandeAssignment_1_in_rule__Commands__Group__1__Impl3160);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1555:1: rule__Commands__Group_0__0 : rule__Commands__Group_0__0__Impl ;
    public final void rule__Commands__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1559:1: ( rule__Commands__Group_0__0__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1560:2: rule__Commands__Group_0__0__Impl
            {
            pushFollow(FOLLOW_rule__Commands__Group_0__0__Impl_in_rule__Commands__Group_0__03194);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1566:1: rule__Commands__Group_0__0__Impl : ( ( rule__Commands__Group_0_0__0 ) ) ;
    public final void rule__Commands__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1570:1: ( ( ( rule__Commands__Group_0_0__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1571:1: ( ( rule__Commands__Group_0_0__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1571:1: ( ( rule__Commands__Group_0_0__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1572:1: ( rule__Commands__Group_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getGroup_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1573:1: ( rule__Commands__Group_0_0__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1573:2: rule__Commands__Group_0_0__0
            {
            pushFollow(FOLLOW_rule__Commands__Group_0_0__0_in_rule__Commands__Group_0__0__Impl3221);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1585:1: rule__Commands__Group_0_0__0 : rule__Commands__Group_0_0__0__Impl rule__Commands__Group_0_0__1 ;
    public final void rule__Commands__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1589:1: ( rule__Commands__Group_0_0__0__Impl rule__Commands__Group_0_0__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1590:2: rule__Commands__Group_0_0__0__Impl rule__Commands__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__Commands__Group_0_0__0__Impl_in_rule__Commands__Group_0_0__03253);
            rule__Commands__Group_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Commands__Group_0_0__1_in_rule__Commands__Group_0_0__03256);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1597:1: rule__Commands__Group_0_0__0__Impl : ( ( rule__Commands__CommandeAssignment_0_0_0 ) ) ;
    public final void rule__Commands__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1601:1: ( ( ( rule__Commands__CommandeAssignment_0_0_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1602:1: ( ( rule__Commands__CommandeAssignment_0_0_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1602:1: ( ( rule__Commands__CommandeAssignment_0_0_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1603:1: ( rule__Commands__CommandeAssignment_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getCommandeAssignment_0_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1604:1: ( rule__Commands__CommandeAssignment_0_0_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1604:2: rule__Commands__CommandeAssignment_0_0_0
            {
            pushFollow(FOLLOW_rule__Commands__CommandeAssignment_0_0_0_in_rule__Commands__Group_0_0__0__Impl3283);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1614:1: rule__Commands__Group_0_0__1 : rule__Commands__Group_0_0__1__Impl ;
    public final void rule__Commands__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1618:1: ( rule__Commands__Group_0_0__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1619:2: rule__Commands__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Commands__Group_0_0__1__Impl_in_rule__Commands__Group_0_0__13313);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1625:1: rule__Commands__Group_0_0__1__Impl : ( ';' ) ;
    public final void rule__Commands__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1629:1: ( ( ';' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1630:1: ( ';' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1630:1: ( ';' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1631:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getSemicolonKeyword_0_0_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__Commands__Group_0_0__1__Impl3341); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1648:1: rule__Command__Group_1__0 : rule__Command__Group_1__0__Impl rule__Command__Group_1__1 ;
    public final void rule__Command__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1652:1: ( rule__Command__Group_1__0__Impl rule__Command__Group_1__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1653:2: rule__Command__Group_1__0__Impl rule__Command__Group_1__1
            {
            pushFollow(FOLLOW_rule__Command__Group_1__0__Impl_in_rule__Command__Group_1__03376);
            rule__Command__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_1__1_in_rule__Command__Group_1__03379);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1660:1: rule__Command__Group_1__0__Impl : ( ( rule__Command__VarsAssignment_1_0 ) ) ;
    public final void rule__Command__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1664:1: ( ( ( rule__Command__VarsAssignment_1_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1665:1: ( ( rule__Command__VarsAssignment_1_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1665:1: ( ( rule__Command__VarsAssignment_1_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1666:1: ( rule__Command__VarsAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getVarsAssignment_1_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1667:1: ( rule__Command__VarsAssignment_1_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1667:2: rule__Command__VarsAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Command__VarsAssignment_1_0_in_rule__Command__Group_1__0__Impl3406);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1677:1: rule__Command__Group_1__1 : rule__Command__Group_1__1__Impl rule__Command__Group_1__2 ;
    public final void rule__Command__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1681:1: ( rule__Command__Group_1__1__Impl rule__Command__Group_1__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1682:2: rule__Command__Group_1__1__Impl rule__Command__Group_1__2
            {
            pushFollow(FOLLOW_rule__Command__Group_1__1__Impl_in_rule__Command__Group_1__13436);
            rule__Command__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_1__2_in_rule__Command__Group_1__13439);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1689:1: rule__Command__Group_1__1__Impl : ( ':=' ) ;
    public final void rule__Command__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1693:1: ( ( ':=' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1694:1: ( ':=' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1694:1: ( ':=' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1695:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getColonEqualsSignKeyword_1_1()); 
            }
            match(input,22,FOLLOW_22_in_rule__Command__Group_1__1__Impl3467); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1708:1: rule__Command__Group_1__2 : rule__Command__Group_1__2__Impl ;
    public final void rule__Command__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1712:1: ( rule__Command__Group_1__2__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1713:2: rule__Command__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_1__2__Impl_in_rule__Command__Group_1__23498);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1719:1: rule__Command__Group_1__2__Impl : ( ( rule__Command__ExprsAssignment_1_2 ) ) ;
    public final void rule__Command__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1723:1: ( ( ( rule__Command__ExprsAssignment_1_2 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1724:1: ( ( rule__Command__ExprsAssignment_1_2 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1724:1: ( ( rule__Command__ExprsAssignment_1_2 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1725:1: ( rule__Command__ExprsAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExprsAssignment_1_2()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1726:1: ( rule__Command__ExprsAssignment_1_2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1726:2: rule__Command__ExprsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Command__ExprsAssignment_1_2_in_rule__Command__Group_1__2__Impl3525);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1742:1: rule__CommandWhile__Group__0 : rule__CommandWhile__Group__0__Impl rule__CommandWhile__Group__1 ;
    public final void rule__CommandWhile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1746:1: ( rule__CommandWhile__Group__0__Impl rule__CommandWhile__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1747:2: rule__CommandWhile__Group__0__Impl rule__CommandWhile__Group__1
            {
            pushFollow(FOLLOW_rule__CommandWhile__Group__0__Impl_in_rule__CommandWhile__Group__03561);
            rule__CommandWhile__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandWhile__Group__1_in_rule__CommandWhile__Group__03564);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1754:1: rule__CommandWhile__Group__0__Impl : ( ( rule__CommandWhile__Alternatives_0 ) ) ;
    public final void rule__CommandWhile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1758:1: ( ( ( rule__CommandWhile__Alternatives_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1759:1: ( ( rule__CommandWhile__Alternatives_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1759:1: ( ( rule__CommandWhile__Alternatives_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1760:1: ( rule__CommandWhile__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandWhileAccess().getAlternatives_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1761:1: ( rule__CommandWhile__Alternatives_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1761:2: rule__CommandWhile__Alternatives_0
            {
            pushFollow(FOLLOW_rule__CommandWhile__Alternatives_0_in_rule__CommandWhile__Group__0__Impl3591);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1771:1: rule__CommandWhile__Group__1 : rule__CommandWhile__Group__1__Impl rule__CommandWhile__Group__2 ;
    public final void rule__CommandWhile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1775:1: ( rule__CommandWhile__Group__1__Impl rule__CommandWhile__Group__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1776:2: rule__CommandWhile__Group__1__Impl rule__CommandWhile__Group__2
            {
            pushFollow(FOLLOW_rule__CommandWhile__Group__1__Impl_in_rule__CommandWhile__Group__13621);
            rule__CommandWhile__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandWhile__Group__2_in_rule__CommandWhile__Group__13624);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1783:1: rule__CommandWhile__Group__1__Impl : ( ( rule__CommandWhile__ExprAssignment_1 ) ) ;
    public final void rule__CommandWhile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1787:1: ( ( ( rule__CommandWhile__ExprAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1788:1: ( ( rule__CommandWhile__ExprAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1788:1: ( ( rule__CommandWhile__ExprAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1789:1: ( rule__CommandWhile__ExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandWhileAccess().getExprAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1790:1: ( rule__CommandWhile__ExprAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1790:2: rule__CommandWhile__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__CommandWhile__ExprAssignment_1_in_rule__CommandWhile__Group__1__Impl3651);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1800:1: rule__CommandWhile__Group__2 : rule__CommandWhile__Group__2__Impl rule__CommandWhile__Group__3 ;
    public final void rule__CommandWhile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1804:1: ( rule__CommandWhile__Group__2__Impl rule__CommandWhile__Group__3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1805:2: rule__CommandWhile__Group__2__Impl rule__CommandWhile__Group__3
            {
            pushFollow(FOLLOW_rule__CommandWhile__Group__2__Impl_in_rule__CommandWhile__Group__23681);
            rule__CommandWhile__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandWhile__Group__3_in_rule__CommandWhile__Group__23684);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1812:1: rule__CommandWhile__Group__2__Impl : ( 'do' ) ;
    public final void rule__CommandWhile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1816:1: ( ( 'do' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1817:1: ( 'do' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1817:1: ( 'do' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1818:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandWhileAccess().getDoKeyword_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__CommandWhile__Group__2__Impl3712); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1831:1: rule__CommandWhile__Group__3 : rule__CommandWhile__Group__3__Impl rule__CommandWhile__Group__4 ;
    public final void rule__CommandWhile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1835:1: ( rule__CommandWhile__Group__3__Impl rule__CommandWhile__Group__4 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1836:2: rule__CommandWhile__Group__3__Impl rule__CommandWhile__Group__4
            {
            pushFollow(FOLLOW_rule__CommandWhile__Group__3__Impl_in_rule__CommandWhile__Group__33743);
            rule__CommandWhile__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandWhile__Group__4_in_rule__CommandWhile__Group__33746);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1843:1: rule__CommandWhile__Group__3__Impl : ( ( rule__CommandWhile__CmdsAssignment_3 ) ) ;
    public final void rule__CommandWhile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1847:1: ( ( ( rule__CommandWhile__CmdsAssignment_3 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1848:1: ( ( rule__CommandWhile__CmdsAssignment_3 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1848:1: ( ( rule__CommandWhile__CmdsAssignment_3 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1849:1: ( rule__CommandWhile__CmdsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandWhileAccess().getCmdsAssignment_3()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1850:1: ( rule__CommandWhile__CmdsAssignment_3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1850:2: rule__CommandWhile__CmdsAssignment_3
            {
            pushFollow(FOLLOW_rule__CommandWhile__CmdsAssignment_3_in_rule__CommandWhile__Group__3__Impl3773);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1860:1: rule__CommandWhile__Group__4 : rule__CommandWhile__Group__4__Impl ;
    public final void rule__CommandWhile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1864:1: ( rule__CommandWhile__Group__4__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1865:2: rule__CommandWhile__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__CommandWhile__Group__4__Impl_in_rule__CommandWhile__Group__43803);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1871:1: rule__CommandWhile__Group__4__Impl : ( 'od' ) ;
    public final void rule__CommandWhile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1875:1: ( ( 'od' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1876:1: ( 'od' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1876:1: ( 'od' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1877:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandWhileAccess().getOdKeyword_4()); 
            }
            match(input,24,FOLLOW_24_in_rule__CommandWhile__Group__4__Impl3831); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1900:1: rule__CommandIf__Group__0 : rule__CommandIf__Group__0__Impl rule__CommandIf__Group__1 ;
    public final void rule__CommandIf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1904:1: ( rule__CommandIf__Group__0__Impl rule__CommandIf__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1905:2: rule__CommandIf__Group__0__Impl rule__CommandIf__Group__1
            {
            pushFollow(FOLLOW_rule__CommandIf__Group__0__Impl_in_rule__CommandIf__Group__03872);
            rule__CommandIf__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandIf__Group__1_in_rule__CommandIf__Group__03875);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1912:1: rule__CommandIf__Group__0__Impl : ( 'if' ) ;
    public final void rule__CommandIf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1916:1: ( ( 'if' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1917:1: ( 'if' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1917:1: ( 'if' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1918:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getIfKeyword_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__CommandIf__Group__0__Impl3903); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1931:1: rule__CommandIf__Group__1 : rule__CommandIf__Group__1__Impl rule__CommandIf__Group__2 ;
    public final void rule__CommandIf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1935:1: ( rule__CommandIf__Group__1__Impl rule__CommandIf__Group__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1936:2: rule__CommandIf__Group__1__Impl rule__CommandIf__Group__2
            {
            pushFollow(FOLLOW_rule__CommandIf__Group__1__Impl_in_rule__CommandIf__Group__13934);
            rule__CommandIf__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandIf__Group__2_in_rule__CommandIf__Group__13937);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1943:1: rule__CommandIf__Group__1__Impl : ( ( rule__CommandIf__CondAssignment_1 ) ) ;
    public final void rule__CommandIf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1947:1: ( ( ( rule__CommandIf__CondAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1948:1: ( ( rule__CommandIf__CondAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1948:1: ( ( rule__CommandIf__CondAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1949:1: ( rule__CommandIf__CondAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getCondAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1950:1: ( rule__CommandIf__CondAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1950:2: rule__CommandIf__CondAssignment_1
            {
            pushFollow(FOLLOW_rule__CommandIf__CondAssignment_1_in_rule__CommandIf__Group__1__Impl3964);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1960:1: rule__CommandIf__Group__2 : rule__CommandIf__Group__2__Impl rule__CommandIf__Group__3 ;
    public final void rule__CommandIf__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1964:1: ( rule__CommandIf__Group__2__Impl rule__CommandIf__Group__3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1965:2: rule__CommandIf__Group__2__Impl rule__CommandIf__Group__3
            {
            pushFollow(FOLLOW_rule__CommandIf__Group__2__Impl_in_rule__CommandIf__Group__23994);
            rule__CommandIf__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandIf__Group__3_in_rule__CommandIf__Group__23997);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1972:1: rule__CommandIf__Group__2__Impl : ( 'then' ) ;
    public final void rule__CommandIf__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1976:1: ( ( 'then' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1977:1: ( 'then' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1977:1: ( 'then' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1978:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getThenKeyword_2()); 
            }
            match(input,26,FOLLOW_26_in_rule__CommandIf__Group__2__Impl4025); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1991:1: rule__CommandIf__Group__3 : rule__CommandIf__Group__3__Impl rule__CommandIf__Group__4 ;
    public final void rule__CommandIf__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1995:1: ( rule__CommandIf__Group__3__Impl rule__CommandIf__Group__4 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1996:2: rule__CommandIf__Group__3__Impl rule__CommandIf__Group__4
            {
            pushFollow(FOLLOW_rule__CommandIf__Group__3__Impl_in_rule__CommandIf__Group__34056);
            rule__CommandIf__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandIf__Group__4_in_rule__CommandIf__Group__34059);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2003:1: rule__CommandIf__Group__3__Impl : ( ( rule__CommandIf__CmdsThenAssignment_3 ) ) ;
    public final void rule__CommandIf__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2007:1: ( ( ( rule__CommandIf__CmdsThenAssignment_3 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2008:1: ( ( rule__CommandIf__CmdsThenAssignment_3 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2008:1: ( ( rule__CommandIf__CmdsThenAssignment_3 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2009:1: ( rule__CommandIf__CmdsThenAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getCmdsThenAssignment_3()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2010:1: ( rule__CommandIf__CmdsThenAssignment_3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2010:2: rule__CommandIf__CmdsThenAssignment_3
            {
            pushFollow(FOLLOW_rule__CommandIf__CmdsThenAssignment_3_in_rule__CommandIf__Group__3__Impl4086);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2020:1: rule__CommandIf__Group__4 : rule__CommandIf__Group__4__Impl rule__CommandIf__Group__5 ;
    public final void rule__CommandIf__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2024:1: ( rule__CommandIf__Group__4__Impl rule__CommandIf__Group__5 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2025:2: rule__CommandIf__Group__4__Impl rule__CommandIf__Group__5
            {
            pushFollow(FOLLOW_rule__CommandIf__Group__4__Impl_in_rule__CommandIf__Group__44116);
            rule__CommandIf__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandIf__Group__5_in_rule__CommandIf__Group__44119);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2032:1: rule__CommandIf__Group__4__Impl : ( ( rule__CommandIf__Group_4__0 )? ) ;
    public final void rule__CommandIf__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2036:1: ( ( ( rule__CommandIf__Group_4__0 )? ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2037:1: ( ( rule__CommandIf__Group_4__0 )? )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2037:1: ( ( rule__CommandIf__Group_4__0 )? )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2038:1: ( rule__CommandIf__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getGroup_4()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2039:1: ( rule__CommandIf__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2039:2: rule__CommandIf__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__CommandIf__Group_4__0_in_rule__CommandIf__Group__4__Impl4146);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2049:1: rule__CommandIf__Group__5 : rule__CommandIf__Group__5__Impl ;
    public final void rule__CommandIf__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2053:1: ( rule__CommandIf__Group__5__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2054:2: rule__CommandIf__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__CommandIf__Group__5__Impl_in_rule__CommandIf__Group__54177);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2060:1: rule__CommandIf__Group__5__Impl : ( 'fi' ) ;
    public final void rule__CommandIf__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2064:1: ( ( 'fi' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2065:1: ( 'fi' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2065:1: ( 'fi' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2066:1: 'fi'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getFiKeyword_5()); 
            }
            match(input,27,FOLLOW_27_in_rule__CommandIf__Group__5__Impl4205); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2091:1: rule__CommandIf__Group_4__0 : rule__CommandIf__Group_4__0__Impl rule__CommandIf__Group_4__1 ;
    public final void rule__CommandIf__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2095:1: ( rule__CommandIf__Group_4__0__Impl rule__CommandIf__Group_4__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2096:2: rule__CommandIf__Group_4__0__Impl rule__CommandIf__Group_4__1
            {
            pushFollow(FOLLOW_rule__CommandIf__Group_4__0__Impl_in_rule__CommandIf__Group_4__04248);
            rule__CommandIf__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandIf__Group_4__1_in_rule__CommandIf__Group_4__04251);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2103:1: rule__CommandIf__Group_4__0__Impl : ( 'else' ) ;
    public final void rule__CommandIf__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2107:1: ( ( 'else' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2108:1: ( 'else' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2108:1: ( 'else' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2109:1: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getElseKeyword_4_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__CommandIf__Group_4__0__Impl4279); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2122:1: rule__CommandIf__Group_4__1 : rule__CommandIf__Group_4__1__Impl ;
    public final void rule__CommandIf__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2126:1: ( rule__CommandIf__Group_4__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2127:2: rule__CommandIf__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__CommandIf__Group_4__1__Impl_in_rule__CommandIf__Group_4__14310);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2133:1: rule__CommandIf__Group_4__1__Impl : ( ( rule__CommandIf__CmdsElseAssignment_4_1 ) ) ;
    public final void rule__CommandIf__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2137:1: ( ( ( rule__CommandIf__CmdsElseAssignment_4_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2138:1: ( ( rule__CommandIf__CmdsElseAssignment_4_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2138:1: ( ( rule__CommandIf__CmdsElseAssignment_4_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2139:1: ( rule__CommandIf__CmdsElseAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandIfAccess().getCmdsElseAssignment_4_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2140:1: ( rule__CommandIf__CmdsElseAssignment_4_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2140:2: rule__CommandIf__CmdsElseAssignment_4_1
            {
            pushFollow(FOLLOW_rule__CommandIf__CmdsElseAssignment_4_1_in_rule__CommandIf__Group_4__1__Impl4337);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2154:1: rule__CommandForEach__Group__0 : rule__CommandForEach__Group__0__Impl rule__CommandForEach__Group__1 ;
    public final void rule__CommandForEach__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2158:1: ( rule__CommandForEach__Group__0__Impl rule__CommandForEach__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2159:2: rule__CommandForEach__Group__0__Impl rule__CommandForEach__Group__1
            {
            pushFollow(FOLLOW_rule__CommandForEach__Group__0__Impl_in_rule__CommandForEach__Group__04371);
            rule__CommandForEach__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandForEach__Group__1_in_rule__CommandForEach__Group__04374);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2166:1: rule__CommandForEach__Group__0__Impl : ( 'foreach' ) ;
    public final void rule__CommandForEach__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2170:1: ( ( 'foreach' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2171:1: ( 'foreach' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2171:1: ( 'foreach' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2172:1: 'foreach'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachAccess().getForeachKeyword_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__CommandForEach__Group__0__Impl4402); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2185:1: rule__CommandForEach__Group__1 : rule__CommandForEach__Group__1__Impl rule__CommandForEach__Group__2 ;
    public final void rule__CommandForEach__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2189:1: ( rule__CommandForEach__Group__1__Impl rule__CommandForEach__Group__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2190:2: rule__CommandForEach__Group__1__Impl rule__CommandForEach__Group__2
            {
            pushFollow(FOLLOW_rule__CommandForEach__Group__1__Impl_in_rule__CommandForEach__Group__14433);
            rule__CommandForEach__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandForEach__Group__2_in_rule__CommandForEach__Group__14436);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2197:1: rule__CommandForEach__Group__1__Impl : ( ( rule__CommandForEach__ElemAssignment_1 ) ) ;
    public final void rule__CommandForEach__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2201:1: ( ( ( rule__CommandForEach__ElemAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2202:1: ( ( rule__CommandForEach__ElemAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2202:1: ( ( rule__CommandForEach__ElemAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2203:1: ( rule__CommandForEach__ElemAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachAccess().getElemAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2204:1: ( rule__CommandForEach__ElemAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2204:2: rule__CommandForEach__ElemAssignment_1
            {
            pushFollow(FOLLOW_rule__CommandForEach__ElemAssignment_1_in_rule__CommandForEach__Group__1__Impl4463);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2214:1: rule__CommandForEach__Group__2 : rule__CommandForEach__Group__2__Impl rule__CommandForEach__Group__3 ;
    public final void rule__CommandForEach__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2218:1: ( rule__CommandForEach__Group__2__Impl rule__CommandForEach__Group__3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2219:2: rule__CommandForEach__Group__2__Impl rule__CommandForEach__Group__3
            {
            pushFollow(FOLLOW_rule__CommandForEach__Group__2__Impl_in_rule__CommandForEach__Group__24493);
            rule__CommandForEach__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandForEach__Group__3_in_rule__CommandForEach__Group__24496);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2226:1: rule__CommandForEach__Group__2__Impl : ( 'in' ) ;
    public final void rule__CommandForEach__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2230:1: ( ( 'in' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2231:1: ( 'in' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2231:1: ( 'in' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2232:1: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachAccess().getInKeyword_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__CommandForEach__Group__2__Impl4524); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2245:1: rule__CommandForEach__Group__3 : rule__CommandForEach__Group__3__Impl rule__CommandForEach__Group__4 ;
    public final void rule__CommandForEach__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2249:1: ( rule__CommandForEach__Group__3__Impl rule__CommandForEach__Group__4 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2250:2: rule__CommandForEach__Group__3__Impl rule__CommandForEach__Group__4
            {
            pushFollow(FOLLOW_rule__CommandForEach__Group__3__Impl_in_rule__CommandForEach__Group__34555);
            rule__CommandForEach__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandForEach__Group__4_in_rule__CommandForEach__Group__34558);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2257:1: rule__CommandForEach__Group__3__Impl : ( ( rule__CommandForEach__EnsembAssignment_3 ) ) ;
    public final void rule__CommandForEach__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2261:1: ( ( ( rule__CommandForEach__EnsembAssignment_3 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2262:1: ( ( rule__CommandForEach__EnsembAssignment_3 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2262:1: ( ( rule__CommandForEach__EnsembAssignment_3 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2263:1: ( rule__CommandForEach__EnsembAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachAccess().getEnsembAssignment_3()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2264:1: ( rule__CommandForEach__EnsembAssignment_3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2264:2: rule__CommandForEach__EnsembAssignment_3
            {
            pushFollow(FOLLOW_rule__CommandForEach__EnsembAssignment_3_in_rule__CommandForEach__Group__3__Impl4585);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2274:1: rule__CommandForEach__Group__4 : rule__CommandForEach__Group__4__Impl rule__CommandForEach__Group__5 ;
    public final void rule__CommandForEach__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2278:1: ( rule__CommandForEach__Group__4__Impl rule__CommandForEach__Group__5 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2279:2: rule__CommandForEach__Group__4__Impl rule__CommandForEach__Group__5
            {
            pushFollow(FOLLOW_rule__CommandForEach__Group__4__Impl_in_rule__CommandForEach__Group__44615);
            rule__CommandForEach__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandForEach__Group__5_in_rule__CommandForEach__Group__44618);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2286:1: rule__CommandForEach__Group__4__Impl : ( 'do' ) ;
    public final void rule__CommandForEach__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2290:1: ( ( 'do' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2291:1: ( 'do' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2291:1: ( 'do' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2292:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachAccess().getDoKeyword_4()); 
            }
            match(input,23,FOLLOW_23_in_rule__CommandForEach__Group__4__Impl4646); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2305:1: rule__CommandForEach__Group__5 : rule__CommandForEach__Group__5__Impl rule__CommandForEach__Group__6 ;
    public final void rule__CommandForEach__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2309:1: ( rule__CommandForEach__Group__5__Impl rule__CommandForEach__Group__6 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2310:2: rule__CommandForEach__Group__5__Impl rule__CommandForEach__Group__6
            {
            pushFollow(FOLLOW_rule__CommandForEach__Group__5__Impl_in_rule__CommandForEach__Group__54677);
            rule__CommandForEach__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CommandForEach__Group__6_in_rule__CommandForEach__Group__54680);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2317:1: rule__CommandForEach__Group__5__Impl : ( ( rule__CommandForEach__CmdsAssignment_5 ) ) ;
    public final void rule__CommandForEach__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2321:1: ( ( ( rule__CommandForEach__CmdsAssignment_5 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2322:1: ( ( rule__CommandForEach__CmdsAssignment_5 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2322:1: ( ( rule__CommandForEach__CmdsAssignment_5 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2323:1: ( rule__CommandForEach__CmdsAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachAccess().getCmdsAssignment_5()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2324:1: ( rule__CommandForEach__CmdsAssignment_5 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2324:2: rule__CommandForEach__CmdsAssignment_5
            {
            pushFollow(FOLLOW_rule__CommandForEach__CmdsAssignment_5_in_rule__CommandForEach__Group__5__Impl4707);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2334:1: rule__CommandForEach__Group__6 : rule__CommandForEach__Group__6__Impl ;
    public final void rule__CommandForEach__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2338:1: ( rule__CommandForEach__Group__6__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2339:2: rule__CommandForEach__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__CommandForEach__Group__6__Impl_in_rule__CommandForEach__Group__64737);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2345:1: rule__CommandForEach__Group__6__Impl : ( 'od' ) ;
    public final void rule__CommandForEach__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2349:1: ( ( 'od' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2350:1: ( 'od' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2350:1: ( 'od' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2351:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandForEachAccess().getOdKeyword_6()); 
            }
            match(input,24,FOLLOW_24_in_rule__CommandForEach__Group__6__Impl4765); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2378:1: rule__Exprs__Group__0 : rule__Exprs__Group__0__Impl rule__Exprs__Group__1 ;
    public final void rule__Exprs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2382:1: ( rule__Exprs__Group__0__Impl rule__Exprs__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2383:2: rule__Exprs__Group__0__Impl rule__Exprs__Group__1
            {
            pushFollow(FOLLOW_rule__Exprs__Group__0__Impl_in_rule__Exprs__Group__04810);
            rule__Exprs__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Exprs__Group__1_in_rule__Exprs__Group__04813);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2390:1: rule__Exprs__Group__0__Impl : ( ( rule__Exprs__Group_0__0 )* ) ;
    public final void rule__Exprs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2394:1: ( ( ( rule__Exprs__Group_0__0 )* ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2395:1: ( ( rule__Exprs__Group_0__0 )* )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2395:1: ( ( rule__Exprs__Group_0__0 )* )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2396:1: ( rule__Exprs__Group_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getGroup_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2397:1: ( rule__Exprs__Group_0__0 )*
            loop13:
            do {
                int alt13=2;
                switch ( input.LA(1) ) {
                case 36:
                    {
                    int LA13_1 = input.LA(2);

                    if ( (synpred20_InternalWhileCpp()) ) {
                        alt13=1;
                    }


                    }
                    break;
                case RULE_VARIABLE:
                    {
                    int LA13_2 = input.LA(2);

                    if ( (synpred20_InternalWhileCpp()) ) {
                        alt13=1;
                    }


                    }
                    break;
                case RULE_SYMBOL:
                    {
                    int LA13_3 = input.LA(2);

                    if ( (synpred20_InternalWhileCpp()) ) {
                        alt13=1;
                    }


                    }
                    break;
                case 31:
                    {
                    int LA13_4 = input.LA(2);

                    if ( (synpred20_InternalWhileCpp()) ) {
                        alt13=1;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA13_5 = input.LA(2);

                    if ( (synpred20_InternalWhileCpp()) ) {
                        alt13=1;
                    }


                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2397:2: rule__Exprs__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__Exprs__Group_0__0_in_rule__Exprs__Group__0__Impl4840);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2407:1: rule__Exprs__Group__1 : rule__Exprs__Group__1__Impl ;
    public final void rule__Exprs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2411:1: ( rule__Exprs__Group__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2412:2: rule__Exprs__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Exprs__Group__1__Impl_in_rule__Exprs__Group__14871);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2418:1: rule__Exprs__Group__1__Impl : ( ( rule__Exprs__ExpGenAssignment_1 ) ) ;
    public final void rule__Exprs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2422:1: ( ( ( rule__Exprs__ExpGenAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2423:1: ( ( rule__Exprs__ExpGenAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2423:1: ( ( rule__Exprs__ExpGenAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2424:1: ( rule__Exprs__ExpGenAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExpGenAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2425:1: ( rule__Exprs__ExpGenAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2425:2: rule__Exprs__ExpGenAssignment_1
            {
            pushFollow(FOLLOW_rule__Exprs__ExpGenAssignment_1_in_rule__Exprs__Group__1__Impl4898);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2439:1: rule__Exprs__Group_0__0 : rule__Exprs__Group_0__0__Impl ;
    public final void rule__Exprs__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2443:1: ( rule__Exprs__Group_0__0__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2444:2: rule__Exprs__Group_0__0__Impl
            {
            pushFollow(FOLLOW_rule__Exprs__Group_0__0__Impl_in_rule__Exprs__Group_0__04932);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2450:1: rule__Exprs__Group_0__0__Impl : ( ( rule__Exprs__Group_0_0__0 ) ) ;
    public final void rule__Exprs__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2454:1: ( ( ( rule__Exprs__Group_0_0__0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2455:1: ( ( rule__Exprs__Group_0_0__0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2455:1: ( ( rule__Exprs__Group_0_0__0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2456:1: ( rule__Exprs__Group_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getGroup_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2457:1: ( rule__Exprs__Group_0_0__0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2457:2: rule__Exprs__Group_0_0__0
            {
            pushFollow(FOLLOW_rule__Exprs__Group_0_0__0_in_rule__Exprs__Group_0__0__Impl4959);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2469:1: rule__Exprs__Group_0_0__0 : rule__Exprs__Group_0_0__0__Impl rule__Exprs__Group_0_0__1 ;
    public final void rule__Exprs__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2473:1: ( rule__Exprs__Group_0_0__0__Impl rule__Exprs__Group_0_0__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2474:2: rule__Exprs__Group_0_0__0__Impl rule__Exprs__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__Exprs__Group_0_0__0__Impl_in_rule__Exprs__Group_0_0__04991);
            rule__Exprs__Group_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Exprs__Group_0_0__1_in_rule__Exprs__Group_0_0__04994);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2481:1: rule__Exprs__Group_0_0__0__Impl : ( ( rule__Exprs__ExpGenAssignment_0_0_0 ) ) ;
    public final void rule__Exprs__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2485:1: ( ( ( rule__Exprs__ExpGenAssignment_0_0_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2486:1: ( ( rule__Exprs__ExpGenAssignment_0_0_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2486:1: ( ( rule__Exprs__ExpGenAssignment_0_0_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2487:1: ( rule__Exprs__ExpGenAssignment_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExpGenAssignment_0_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2488:1: ( rule__Exprs__ExpGenAssignment_0_0_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2488:2: rule__Exprs__ExpGenAssignment_0_0_0
            {
            pushFollow(FOLLOW_rule__Exprs__ExpGenAssignment_0_0_0_in_rule__Exprs__Group_0_0__0__Impl5021);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2498:1: rule__Exprs__Group_0_0__1 : rule__Exprs__Group_0_0__1__Impl ;
    public final void rule__Exprs__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2502:1: ( rule__Exprs__Group_0_0__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2503:2: rule__Exprs__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Exprs__Group_0_0__1__Impl_in_rule__Exprs__Group_0_0__15051);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2509:1: rule__Exprs__Group_0_0__1__Impl : ( ',' ) ;
    public final void rule__Exprs__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2513:1: ( ( ',' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2514:1: ( ',' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2514:1: ( ',' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2515:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getCommaKeyword_0_0_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__Exprs__Group_0_0__1__Impl5079); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2532:1: rule__Expr__Group_0__0 : rule__Expr__Group_0__0__Impl ;
    public final void rule__Expr__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2536:1: ( rule__Expr__Group_0__0__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2537:2: rule__Expr__Group_0__0__Impl
            {
            pushFollow(FOLLOW_rule__Expr__Group_0__0__Impl_in_rule__Expr__Group_0__05114);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2543:1: rule__Expr__Group_0__0__Impl : ( ( rule__Expr__ExprSimpAssignment_0_0 ) ) ;
    public final void rule__Expr__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2547:1: ( ( ( rule__Expr__ExprSimpAssignment_0_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2548:1: ( ( rule__Expr__ExprSimpAssignment_0_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2548:1: ( ( rule__Expr__ExprSimpAssignment_0_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2549:1: ( rule__Expr__ExprSimpAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getExprSimpAssignment_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2550:1: ( rule__Expr__ExprSimpAssignment_0_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2550:2: rule__Expr__ExprSimpAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Expr__ExprSimpAssignment_0_0_in_rule__Expr__Group_0__0__Impl5141);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2562:1: rule__ExprSimple__Group_1__0 : rule__ExprSimple__Group_1__0__Impl rule__ExprSimple__Group_1__1 ;
    public final void rule__ExprSimple__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2566:1: ( rule__ExprSimple__Group_1__0__Impl rule__ExprSimple__Group_1__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2567:2: rule__ExprSimple__Group_1__0__Impl rule__ExprSimple__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_1__0__Impl_in_rule__ExprSimple__Group_1__05173);
            rule__ExprSimple__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_1__1_in_rule__ExprSimple__Group_1__05176);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2574:1: rule__ExprSimple__Group_1__0__Impl : ( '(' ) ;
    public final void rule__ExprSimple__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2578:1: ( ( '(' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2579:1: ( '(' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2579:1: ( '(' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2580:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__ExprSimple__Group_1__0__Impl5204); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2593:1: rule__ExprSimple__Group_1__1 : rule__ExprSimple__Group_1__1__Impl rule__ExprSimple__Group_1__2 ;
    public final void rule__ExprSimple__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2597:1: ( rule__ExprSimple__Group_1__1__Impl rule__ExprSimple__Group_1__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2598:2: rule__ExprSimple__Group_1__1__Impl rule__ExprSimple__Group_1__2
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_1__1__Impl_in_rule__ExprSimple__Group_1__15235);
            rule__ExprSimple__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_1__2_in_rule__ExprSimple__Group_1__15238);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2605:1: rule__ExprSimple__Group_1__1__Impl : ( ( rule__ExprSimple__ExprConsAssignment_1_1 ) ) ;
    public final void rule__ExprSimple__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2609:1: ( ( ( rule__ExprSimple__ExprConsAssignment_1_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2610:1: ( ( rule__ExprSimple__ExprConsAssignment_1_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2610:1: ( ( rule__ExprSimple__ExprConsAssignment_1_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2611:1: ( rule__ExprSimple__ExprConsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprConsAssignment_1_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2612:1: ( rule__ExprSimple__ExprConsAssignment_1_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2612:2: rule__ExprSimple__ExprConsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ExprSimple__ExprConsAssignment_1_1_in_rule__ExprSimple__Group_1__1__Impl5265);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2622:1: rule__ExprSimple__Group_1__2 : rule__ExprSimple__Group_1__2__Impl ;
    public final void rule__ExprSimple__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2626:1: ( rule__ExprSimple__Group_1__2__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2627:2: rule__ExprSimple__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_1__2__Impl_in_rule__ExprSimple__Group_1__25295);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2633:1: rule__ExprSimple__Group_1__2__Impl : ( ')' ) ;
    public final void rule__ExprSimple__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2637:1: ( ( ')' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2638:1: ( ')' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2638:1: ( ')' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2639:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,32,FOLLOW_32_in_rule__ExprSimple__Group_1__2__Impl5323); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2658:1: rule__ExprSimple__Group_2__0 : rule__ExprSimple__Group_2__0__Impl rule__ExprSimple__Group_2__1 ;
    public final void rule__ExprSimple__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2662:1: ( rule__ExprSimple__Group_2__0__Impl rule__ExprSimple__Group_2__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2663:2: rule__ExprSimple__Group_2__0__Impl rule__ExprSimple__Group_2__1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_2__0__Impl_in_rule__ExprSimple__Group_2__05360);
            rule__ExprSimple__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_2__1_in_rule__ExprSimple__Group_2__05363);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2670:1: rule__ExprSimple__Group_2__0__Impl : ( '(' ) ;
    public final void rule__ExprSimple__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2674:1: ( ( '(' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2675:1: ( '(' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2675:1: ( '(' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2676:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__ExprSimple__Group_2__0__Impl5391); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2689:1: rule__ExprSimple__Group_2__1 : rule__ExprSimple__Group_2__1__Impl rule__ExprSimple__Group_2__2 ;
    public final void rule__ExprSimple__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2693:1: ( rule__ExprSimple__Group_2__1__Impl rule__ExprSimple__Group_2__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2694:2: rule__ExprSimple__Group_2__1__Impl rule__ExprSimple__Group_2__2
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_2__1__Impl_in_rule__ExprSimple__Group_2__15422);
            rule__ExprSimple__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_2__2_in_rule__ExprSimple__Group_2__15425);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2701:1: rule__ExprSimple__Group_2__1__Impl : ( ( rule__ExprSimple__ExprHeadAssignment_2_1 ) ) ;
    public final void rule__ExprSimple__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2705:1: ( ( ( rule__ExprSimple__ExprHeadAssignment_2_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2706:1: ( ( rule__ExprSimple__ExprHeadAssignment_2_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2706:1: ( ( rule__ExprSimple__ExprHeadAssignment_2_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2707:1: ( rule__ExprSimple__ExprHeadAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprHeadAssignment_2_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2708:1: ( rule__ExprSimple__ExprHeadAssignment_2_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2708:2: rule__ExprSimple__ExprHeadAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ExprSimple__ExprHeadAssignment_2_1_in_rule__ExprSimple__Group_2__1__Impl5452);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2718:1: rule__ExprSimple__Group_2__2 : rule__ExprSimple__Group_2__2__Impl rule__ExprSimple__Group_2__3 ;
    public final void rule__ExprSimple__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2722:1: ( rule__ExprSimple__Group_2__2__Impl rule__ExprSimple__Group_2__3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2723:2: rule__ExprSimple__Group_2__2__Impl rule__ExprSimple__Group_2__3
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_2__2__Impl_in_rule__ExprSimple__Group_2__25482);
            rule__ExprSimple__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_2__3_in_rule__ExprSimple__Group_2__25485);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2730:1: rule__ExprSimple__Group_2__2__Impl : ( ( rule__ExprSimple__ExprHeadAttAssignment_2_2 ) ) ;
    public final void rule__ExprSimple__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2734:1: ( ( ( rule__ExprSimple__ExprHeadAttAssignment_2_2 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2735:1: ( ( rule__ExprSimple__ExprHeadAttAssignment_2_2 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2735:1: ( ( rule__ExprSimple__ExprHeadAttAssignment_2_2 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2736:1: ( rule__ExprSimple__ExprHeadAttAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprHeadAttAssignment_2_2()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2737:1: ( rule__ExprSimple__ExprHeadAttAssignment_2_2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2737:2: rule__ExprSimple__ExprHeadAttAssignment_2_2
            {
            pushFollow(FOLLOW_rule__ExprSimple__ExprHeadAttAssignment_2_2_in_rule__ExprSimple__Group_2__2__Impl5512);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2747:1: rule__ExprSimple__Group_2__3 : rule__ExprSimple__Group_2__3__Impl ;
    public final void rule__ExprSimple__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2751:1: ( rule__ExprSimple__Group_2__3__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2752:2: rule__ExprSimple__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_2__3__Impl_in_rule__ExprSimple__Group_2__35542);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2758:1: rule__ExprSimple__Group_2__3__Impl : ( ')' ) ;
    public final void rule__ExprSimple__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2762:1: ( ( ')' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2763:1: ( ')' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2763:1: ( ')' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2764:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_2_3()); 
            }
            match(input,32,FOLLOW_32_in_rule__ExprSimple__Group_2__3__Impl5570); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2785:1: rule__ExprSimple__Group_3__0 : rule__ExprSimple__Group_3__0__Impl rule__ExprSimple__Group_3__1 ;
    public final void rule__ExprSimple__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2789:1: ( rule__ExprSimple__Group_3__0__Impl rule__ExprSimple__Group_3__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2790:2: rule__ExprSimple__Group_3__0__Impl rule__ExprSimple__Group_3__1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_3__0__Impl_in_rule__ExprSimple__Group_3__05609);
            rule__ExprSimple__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_3__1_in_rule__ExprSimple__Group_3__05612);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2797:1: rule__ExprSimple__Group_3__0__Impl : ( '(' ) ;
    public final void rule__ExprSimple__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2801:1: ( ( '(' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2802:1: ( '(' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2802:1: ( '(' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2803:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__ExprSimple__Group_3__0__Impl5640); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2816:1: rule__ExprSimple__Group_3__1 : rule__ExprSimple__Group_3__1__Impl rule__ExprSimple__Group_3__2 ;
    public final void rule__ExprSimple__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2820:1: ( rule__ExprSimple__Group_3__1__Impl rule__ExprSimple__Group_3__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2821:2: rule__ExprSimple__Group_3__1__Impl rule__ExprSimple__Group_3__2
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_3__1__Impl_in_rule__ExprSimple__Group_3__15671);
            rule__ExprSimple__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_3__2_in_rule__ExprSimple__Group_3__15674);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2828:1: rule__ExprSimple__Group_3__1__Impl : ( ( rule__ExprSimple__ExprTailAssignment_3_1 ) ) ;
    public final void rule__ExprSimple__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2832:1: ( ( ( rule__ExprSimple__ExprTailAssignment_3_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2833:1: ( ( rule__ExprSimple__ExprTailAssignment_3_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2833:1: ( ( rule__ExprSimple__ExprTailAssignment_3_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2834:1: ( rule__ExprSimple__ExprTailAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprTailAssignment_3_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2835:1: ( rule__ExprSimple__ExprTailAssignment_3_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2835:2: rule__ExprSimple__ExprTailAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ExprSimple__ExprTailAssignment_3_1_in_rule__ExprSimple__Group_3__1__Impl5701);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2845:1: rule__ExprSimple__Group_3__2 : rule__ExprSimple__Group_3__2__Impl rule__ExprSimple__Group_3__3 ;
    public final void rule__ExprSimple__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2849:1: ( rule__ExprSimple__Group_3__2__Impl rule__ExprSimple__Group_3__3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2850:2: rule__ExprSimple__Group_3__2__Impl rule__ExprSimple__Group_3__3
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_3__2__Impl_in_rule__ExprSimple__Group_3__25731);
            rule__ExprSimple__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_3__3_in_rule__ExprSimple__Group_3__25734);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2857:1: rule__ExprSimple__Group_3__2__Impl : ( ( rule__ExprSimple__ExprTailAttAssignment_3_2 ) ) ;
    public final void rule__ExprSimple__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2861:1: ( ( ( rule__ExprSimple__ExprTailAttAssignment_3_2 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2862:1: ( ( rule__ExprSimple__ExprTailAttAssignment_3_2 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2862:1: ( ( rule__ExprSimple__ExprTailAttAssignment_3_2 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2863:1: ( rule__ExprSimple__ExprTailAttAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprTailAttAssignment_3_2()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2864:1: ( rule__ExprSimple__ExprTailAttAssignment_3_2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2864:2: rule__ExprSimple__ExprTailAttAssignment_3_2
            {
            pushFollow(FOLLOW_rule__ExprSimple__ExprTailAttAssignment_3_2_in_rule__ExprSimple__Group_3__2__Impl5761);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2874:1: rule__ExprSimple__Group_3__3 : rule__ExprSimple__Group_3__3__Impl ;
    public final void rule__ExprSimple__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2878:1: ( rule__ExprSimple__Group_3__3__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2879:2: rule__ExprSimple__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_3__3__Impl_in_rule__ExprSimple__Group_3__35791);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2885:1: rule__ExprSimple__Group_3__3__Impl : ( ')' ) ;
    public final void rule__ExprSimple__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2889:1: ( ( ')' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2890:1: ( ')' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2890:1: ( ')' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2891:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_3_3()); 
            }
            match(input,32,FOLLOW_32_in_rule__ExprSimple__Group_3__3__Impl5819); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2912:1: rule__ExprSimple__Group_4__0 : rule__ExprSimple__Group_4__0__Impl rule__ExprSimple__Group_4__1 ;
    public final void rule__ExprSimple__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2916:1: ( rule__ExprSimple__Group_4__0__Impl rule__ExprSimple__Group_4__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2917:2: rule__ExprSimple__Group_4__0__Impl rule__ExprSimple__Group_4__1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_4__0__Impl_in_rule__ExprSimple__Group_4__05858);
            rule__ExprSimple__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_4__1_in_rule__ExprSimple__Group_4__05861);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2924:1: rule__ExprSimple__Group_4__0__Impl : ( '(' ) ;
    public final void rule__ExprSimple__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2928:1: ( ( '(' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2929:1: ( '(' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2929:1: ( '(' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2930:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_4_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__ExprSimple__Group_4__0__Impl5889); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2943:1: rule__ExprSimple__Group_4__1 : rule__ExprSimple__Group_4__1__Impl rule__ExprSimple__Group_4__2 ;
    public final void rule__ExprSimple__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2947:1: ( rule__ExprSimple__Group_4__1__Impl rule__ExprSimple__Group_4__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2948:2: rule__ExprSimple__Group_4__1__Impl rule__ExprSimple__Group_4__2
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_4__1__Impl_in_rule__ExprSimple__Group_4__15920);
            rule__ExprSimple__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_4__2_in_rule__ExprSimple__Group_4__15923);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2955:1: rule__ExprSimple__Group_4__1__Impl : ( ( rule__ExprSimple__NomSymbAssignment_4_1 ) ) ;
    public final void rule__ExprSimple__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2959:1: ( ( ( rule__ExprSimple__NomSymbAssignment_4_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2960:1: ( ( rule__ExprSimple__NomSymbAssignment_4_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2960:1: ( ( rule__ExprSimple__NomSymbAssignment_4_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2961:1: ( rule__ExprSimple__NomSymbAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getNomSymbAssignment_4_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2962:1: ( rule__ExprSimple__NomSymbAssignment_4_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2962:2: rule__ExprSimple__NomSymbAssignment_4_1
            {
            pushFollow(FOLLOW_rule__ExprSimple__NomSymbAssignment_4_1_in_rule__ExprSimple__Group_4__1__Impl5950);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2972:1: rule__ExprSimple__Group_4__2 : rule__ExprSimple__Group_4__2__Impl rule__ExprSimple__Group_4__3 ;
    public final void rule__ExprSimple__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2976:1: ( rule__ExprSimple__Group_4__2__Impl rule__ExprSimple__Group_4__3 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2977:2: rule__ExprSimple__Group_4__2__Impl rule__ExprSimple__Group_4__3
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_4__2__Impl_in_rule__ExprSimple__Group_4__25980);
            rule__ExprSimple__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_4__3_in_rule__ExprSimple__Group_4__25983);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2984:1: rule__ExprSimple__Group_4__2__Impl : ( ( rule__ExprSimple__SymbAttAssignment_4_2 ) ) ;
    public final void rule__ExprSimple__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2988:1: ( ( ( rule__ExprSimple__SymbAttAssignment_4_2 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2989:1: ( ( rule__ExprSimple__SymbAttAssignment_4_2 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2989:1: ( ( rule__ExprSimple__SymbAttAssignment_4_2 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2990:1: ( rule__ExprSimple__SymbAttAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getSymbAttAssignment_4_2()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2991:1: ( rule__ExprSimple__SymbAttAssignment_4_2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2991:2: rule__ExprSimple__SymbAttAssignment_4_2
            {
            pushFollow(FOLLOW_rule__ExprSimple__SymbAttAssignment_4_2_in_rule__ExprSimple__Group_4__2__Impl6010);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3001:1: rule__ExprSimple__Group_4__3 : rule__ExprSimple__Group_4__3__Impl ;
    public final void rule__ExprSimple__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3005:1: ( rule__ExprSimple__Group_4__3__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3006:2: rule__ExprSimple__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_4__3__Impl_in_rule__ExprSimple__Group_4__36040);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3012:1: rule__ExprSimple__Group_4__3__Impl : ( ')' ) ;
    public final void rule__ExprSimple__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3016:1: ( ( ')' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3017:1: ( ')' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3017:1: ( ')' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3018:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_4_3()); 
            }
            match(input,32,FOLLOW_32_in_rule__ExprSimple__Group_4__3__Impl6068); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3039:1: rule__ExprAnd__Group__0 : rule__ExprAnd__Group__0__Impl rule__ExprAnd__Group__1 ;
    public final void rule__ExprAnd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3043:1: ( rule__ExprAnd__Group__0__Impl rule__ExprAnd__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3044:2: rule__ExprAnd__Group__0__Impl rule__ExprAnd__Group__1
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group__0__Impl_in_rule__ExprAnd__Group__06107);
            rule__ExprAnd__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprAnd__Group__1_in_rule__ExprAnd__Group__06110);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3051:1: rule__ExprAnd__Group__0__Impl : ( ( rule__ExprAnd__ExprOrAssignment_0 ) ) ;
    public final void rule__ExprAnd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3055:1: ( ( ( rule__ExprAnd__ExprOrAssignment_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3056:1: ( ( rule__ExprAnd__ExprOrAssignment_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3056:1: ( ( rule__ExprAnd__ExprOrAssignment_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3057:1: ( rule__ExprAnd__ExprOrAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExprOrAssignment_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3058:1: ( rule__ExprAnd__ExprOrAssignment_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3058:2: rule__ExprAnd__ExprOrAssignment_0
            {
            pushFollow(FOLLOW_rule__ExprAnd__ExprOrAssignment_0_in_rule__ExprAnd__Group__0__Impl6137);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3068:1: rule__ExprAnd__Group__1 : rule__ExprAnd__Group__1__Impl ;
    public final void rule__ExprAnd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3072:1: ( rule__ExprAnd__Group__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3073:2: rule__ExprAnd__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group__1__Impl_in_rule__ExprAnd__Group__16167);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3079:1: rule__ExprAnd__Group__1__Impl : ( ( rule__ExprAnd__Group_1__0 )? ) ;
    public final void rule__ExprAnd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3083:1: ( ( ( rule__ExprAnd__Group_1__0 )? ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3084:1: ( ( rule__ExprAnd__Group_1__0 )? )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3084:1: ( ( rule__ExprAnd__Group_1__0 )? )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3085:1: ( rule__ExprAnd__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getGroup_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3086:1: ( rule__ExprAnd__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==39) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3086:2: rule__ExprAnd__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ExprAnd__Group_1__0_in_rule__ExprAnd__Group__1__Impl6194);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3100:1: rule__ExprAnd__Group_1__0 : rule__ExprAnd__Group_1__0__Impl rule__ExprAnd__Group_1__1 ;
    public final void rule__ExprAnd__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3104:1: ( rule__ExprAnd__Group_1__0__Impl rule__ExprAnd__Group_1__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3105:2: rule__ExprAnd__Group_1__0__Impl rule__ExprAnd__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group_1__0__Impl_in_rule__ExprAnd__Group_1__06229);
            rule__ExprAnd__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprAnd__Group_1__1_in_rule__ExprAnd__Group_1__06232);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3112:1: rule__ExprAnd__Group_1__0__Impl : ( ( rule__ExprAnd__ExprAndAssignment_1_0 ) ) ;
    public final void rule__ExprAnd__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3116:1: ( ( ( rule__ExprAnd__ExprAndAssignment_1_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3117:1: ( ( rule__ExprAnd__ExprAndAssignment_1_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3117:1: ( ( rule__ExprAnd__ExprAndAssignment_1_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3118:1: ( rule__ExprAnd__ExprAndAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExprAndAssignment_1_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3119:1: ( rule__ExprAnd__ExprAndAssignment_1_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3119:2: rule__ExprAnd__ExprAndAssignment_1_0
            {
            pushFollow(FOLLOW_rule__ExprAnd__ExprAndAssignment_1_0_in_rule__ExprAnd__Group_1__0__Impl6259);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3129:1: rule__ExprAnd__Group_1__1 : rule__ExprAnd__Group_1__1__Impl ;
    public final void rule__ExprAnd__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3133:1: ( rule__ExprAnd__Group_1__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3134:2: rule__ExprAnd__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprAnd__Group_1__1__Impl_in_rule__ExprAnd__Group_1__16289);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3140:1: rule__ExprAnd__Group_1__1__Impl : ( ( rule__ExprAnd__ExprAndAttAssignment_1_1 ) ) ;
    public final void rule__ExprAnd__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3144:1: ( ( ( rule__ExprAnd__ExprAndAttAssignment_1_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3145:1: ( ( rule__ExprAnd__ExprAndAttAssignment_1_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3145:1: ( ( rule__ExprAnd__ExprAndAttAssignment_1_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3146:1: ( rule__ExprAnd__ExprAndAttAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExprAndAttAssignment_1_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3147:1: ( rule__ExprAnd__ExprAndAttAssignment_1_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3147:2: rule__ExprAnd__ExprAndAttAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ExprAnd__ExprAndAttAssignment_1_1_in_rule__ExprAnd__Group_1__1__Impl6316);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3161:1: rule__ExprOr__Group__0 : rule__ExprOr__Group__0__Impl rule__ExprOr__Group__1 ;
    public final void rule__ExprOr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3165:1: ( rule__ExprOr__Group__0__Impl rule__ExprOr__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3166:2: rule__ExprOr__Group__0__Impl rule__ExprOr__Group__1
            {
            pushFollow(FOLLOW_rule__ExprOr__Group__0__Impl_in_rule__ExprOr__Group__06350);
            rule__ExprOr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprOr__Group__1_in_rule__ExprOr__Group__06353);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3173:1: rule__ExprOr__Group__0__Impl : ( ( rule__ExprOr__ExprNotAssignment_0 ) ) ;
    public final void rule__ExprOr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3177:1: ( ( ( rule__ExprOr__ExprNotAssignment_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3178:1: ( ( rule__ExprOr__ExprNotAssignment_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3178:1: ( ( rule__ExprOr__ExprNotAssignment_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3179:1: ( rule__ExprOr__ExprNotAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExprNotAssignment_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3180:1: ( rule__ExprOr__ExprNotAssignment_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3180:2: rule__ExprOr__ExprNotAssignment_0
            {
            pushFollow(FOLLOW_rule__ExprOr__ExprNotAssignment_0_in_rule__ExprOr__Group__0__Impl6380);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3190:1: rule__ExprOr__Group__1 : rule__ExprOr__Group__1__Impl ;
    public final void rule__ExprOr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3194:1: ( rule__ExprOr__Group__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3195:2: rule__ExprOr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprOr__Group__1__Impl_in_rule__ExprOr__Group__16410);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3201:1: rule__ExprOr__Group__1__Impl : ( ( rule__ExprOr__Group_1__0 )? ) ;
    public final void rule__ExprOr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3205:1: ( ( ( rule__ExprOr__Group_1__0 )? ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3206:1: ( ( rule__ExprOr__Group_1__0 )? )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3206:1: ( ( rule__ExprOr__Group_1__0 )? )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3207:1: ( rule__ExprOr__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getGroup_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3208:1: ( rule__ExprOr__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==40) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3208:2: rule__ExprOr__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ExprOr__Group_1__0_in_rule__ExprOr__Group__1__Impl6437);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3222:1: rule__ExprOr__Group_1__0 : rule__ExprOr__Group_1__0__Impl rule__ExprOr__Group_1__1 ;
    public final void rule__ExprOr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3226:1: ( rule__ExprOr__Group_1__0__Impl rule__ExprOr__Group_1__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3227:2: rule__ExprOr__Group_1__0__Impl rule__ExprOr__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExprOr__Group_1__0__Impl_in_rule__ExprOr__Group_1__06472);
            rule__ExprOr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprOr__Group_1__1_in_rule__ExprOr__Group_1__06475);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3234:1: rule__ExprOr__Group_1__0__Impl : ( ( rule__ExprOr__ExprOrAssignment_1_0 ) ) ;
    public final void rule__ExprOr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3238:1: ( ( ( rule__ExprOr__ExprOrAssignment_1_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3239:1: ( ( rule__ExprOr__ExprOrAssignment_1_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3239:1: ( ( rule__ExprOr__ExprOrAssignment_1_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3240:1: ( rule__ExprOr__ExprOrAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExprOrAssignment_1_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3241:1: ( rule__ExprOr__ExprOrAssignment_1_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3241:2: rule__ExprOr__ExprOrAssignment_1_0
            {
            pushFollow(FOLLOW_rule__ExprOr__ExprOrAssignment_1_0_in_rule__ExprOr__Group_1__0__Impl6502);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3251:1: rule__ExprOr__Group_1__1 : rule__ExprOr__Group_1__1__Impl ;
    public final void rule__ExprOr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3255:1: ( rule__ExprOr__Group_1__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3256:2: rule__ExprOr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprOr__Group_1__1__Impl_in_rule__ExprOr__Group_1__16532);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3262:1: rule__ExprOr__Group_1__1__Impl : ( ( rule__ExprOr__ExprOrAttAssignment_1_1 ) ) ;
    public final void rule__ExprOr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3266:1: ( ( ( rule__ExprOr__ExprOrAttAssignment_1_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3267:1: ( ( rule__ExprOr__ExprOrAttAssignment_1_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3267:1: ( ( rule__ExprOr__ExprOrAttAssignment_1_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3268:1: ( rule__ExprOr__ExprOrAttAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExprOrAttAssignment_1_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3269:1: ( rule__ExprOr__ExprOrAttAssignment_1_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3269:2: rule__ExprOr__ExprOrAttAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ExprOr__ExprOrAttAssignment_1_1_in_rule__ExprOr__Group_1__1__Impl6559);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3283:1: rule__ExprNot__Group__0 : rule__ExprNot__Group__0__Impl rule__ExprNot__Group__1 ;
    public final void rule__ExprNot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3287:1: ( rule__ExprNot__Group__0__Impl rule__ExprNot__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3288:2: rule__ExprNot__Group__0__Impl rule__ExprNot__Group__1
            {
            pushFollow(FOLLOW_rule__ExprNot__Group__0__Impl_in_rule__ExprNot__Group__06593);
            rule__ExprNot__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprNot__Group__1_in_rule__ExprNot__Group__06596);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3295:1: rule__ExprNot__Group__0__Impl : ( ( rule__ExprNot__NotAssignment_0 )? ) ;
    public final void rule__ExprNot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3299:1: ( ( ( rule__ExprNot__NotAssignment_0 )? ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3300:1: ( ( rule__ExprNot__NotAssignment_0 )? )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3300:1: ( ( rule__ExprNot__NotAssignment_0 )? )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3301:1: ( rule__ExprNot__NotAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getNotAssignment_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3302:1: ( rule__ExprNot__NotAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==41) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3302:2: rule__ExprNot__NotAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ExprNot__NotAssignment_0_in_rule__ExprNot__Group__0__Impl6623);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3312:1: rule__ExprNot__Group__1 : rule__ExprNot__Group__1__Impl ;
    public final void rule__ExprNot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3316:1: ( rule__ExprNot__Group__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3317:2: rule__ExprNot__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprNot__Group__1__Impl_in_rule__ExprNot__Group__16654);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3323:1: rule__ExprNot__Group__1__Impl : ( ( rule__ExprNot__ExprEqAssignment_1 ) ) ;
    public final void rule__ExprNot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3327:1: ( ( ( rule__ExprNot__ExprEqAssignment_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3328:1: ( ( rule__ExprNot__ExprEqAssignment_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3328:1: ( ( rule__ExprNot__ExprEqAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3329:1: ( rule__ExprNot__ExprEqAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getExprEqAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3330:1: ( rule__ExprNot__ExprEqAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3330:2: rule__ExprNot__ExprEqAssignment_1
            {
            pushFollow(FOLLOW_rule__ExprNot__ExprEqAssignment_1_in_rule__ExprNot__Group__1__Impl6681);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3344:1: rule__ExprEq__Group_0__0 : rule__ExprEq__Group_0__0__Impl rule__ExprEq__Group_0__1 ;
    public final void rule__ExprEq__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3348:1: ( rule__ExprEq__Group_0__0__Impl rule__ExprEq__Group_0__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3349:2: rule__ExprEq__Group_0__0__Impl rule__ExprEq__Group_0__1
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_0__0__Impl_in_rule__ExprEq__Group_0__06715);
            rule__ExprEq__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprEq__Group_0__1_in_rule__ExprEq__Group_0__06718);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3356:1: rule__ExprEq__Group_0__0__Impl : ( '(' ) ;
    public final void rule__ExprEq__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3360:1: ( ( '(' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3361:1: ( '(' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3361:1: ( '(' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3362:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__ExprEq__Group_0__0__Impl6746); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3375:1: rule__ExprEq__Group_0__1 : rule__ExprEq__Group_0__1__Impl rule__ExprEq__Group_0__2 ;
    public final void rule__ExprEq__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3379:1: ( rule__ExprEq__Group_0__1__Impl rule__ExprEq__Group_0__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3380:2: rule__ExprEq__Group_0__1__Impl rule__ExprEq__Group_0__2
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_0__1__Impl_in_rule__ExprEq__Group_0__16777);
            rule__ExprEq__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprEq__Group_0__2_in_rule__ExprEq__Group_0__16780);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3387:1: rule__ExprEq__Group_0__1__Impl : ( ( rule__ExprEq__ExprAssignment_0_1 ) ) ;
    public final void rule__ExprEq__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3391:1: ( ( ( rule__ExprEq__ExprAssignment_0_1 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3392:1: ( ( rule__ExprEq__ExprAssignment_0_1 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3392:1: ( ( rule__ExprEq__ExprAssignment_0_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3393:1: ( rule__ExprEq__ExprAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExprAssignment_0_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3394:1: ( rule__ExprEq__ExprAssignment_0_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3394:2: rule__ExprEq__ExprAssignment_0_1
            {
            pushFollow(FOLLOW_rule__ExprEq__ExprAssignment_0_1_in_rule__ExprEq__Group_0__1__Impl6807);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3404:1: rule__ExprEq__Group_0__2 : rule__ExprEq__Group_0__2__Impl ;
    public final void rule__ExprEq__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3408:1: ( rule__ExprEq__Group_0__2__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3409:2: rule__ExprEq__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_0__2__Impl_in_rule__ExprEq__Group_0__26837);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3415:1: rule__ExprEq__Group_0__2__Impl : ( ')' ) ;
    public final void rule__ExprEq__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3419:1: ( ( ')' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3420:1: ( ')' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3420:1: ( ')' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3421:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,32,FOLLOW_32_in_rule__ExprEq__Group_0__2__Impl6865); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3440:1: rule__ExprEq__Group_1__0 : rule__ExprEq__Group_1__0__Impl rule__ExprEq__Group_1__1 ;
    public final void rule__ExprEq__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3444:1: ( rule__ExprEq__Group_1__0__Impl rule__ExprEq__Group_1__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3445:2: rule__ExprEq__Group_1__0__Impl rule__ExprEq__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_1__0__Impl_in_rule__ExprEq__Group_1__06902);
            rule__ExprEq__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprEq__Group_1__1_in_rule__ExprEq__Group_1__06905);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3452:1: rule__ExprEq__Group_1__0__Impl : ( ( rule__ExprEq__ExprSim1Assignment_1_0 ) ) ;
    public final void rule__ExprEq__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3456:1: ( ( ( rule__ExprEq__ExprSim1Assignment_1_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3457:1: ( ( rule__ExprEq__ExprSim1Assignment_1_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3457:1: ( ( rule__ExprEq__ExprSim1Assignment_1_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3458:1: ( rule__ExprEq__ExprSim1Assignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExprSim1Assignment_1_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3459:1: ( rule__ExprEq__ExprSim1Assignment_1_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3459:2: rule__ExprEq__ExprSim1Assignment_1_0
            {
            pushFollow(FOLLOW_rule__ExprEq__ExprSim1Assignment_1_0_in_rule__ExprEq__Group_1__0__Impl6932);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3469:1: rule__ExprEq__Group_1__1 : rule__ExprEq__Group_1__1__Impl rule__ExprEq__Group_1__2 ;
    public final void rule__ExprEq__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3473:1: ( rule__ExprEq__Group_1__1__Impl rule__ExprEq__Group_1__2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3474:2: rule__ExprEq__Group_1__1__Impl rule__ExprEq__Group_1__2
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_1__1__Impl_in_rule__ExprEq__Group_1__16962);
            rule__ExprEq__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprEq__Group_1__2_in_rule__ExprEq__Group_1__16965);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3481:1: rule__ExprEq__Group_1__1__Impl : ( '=?' ) ;
    public final void rule__ExprEq__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3485:1: ( ( '=?' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3486:1: ( '=?' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3486:1: ( '=?' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3487:1: '=?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getEqualsSignQuestionMarkKeyword_1_1()); 
            }
            match(input,33,FOLLOW_33_in_rule__ExprEq__Group_1__1__Impl6993); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3500:1: rule__ExprEq__Group_1__2 : rule__ExprEq__Group_1__2__Impl ;
    public final void rule__ExprEq__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3504:1: ( rule__ExprEq__Group_1__2__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3505:2: rule__ExprEq__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ExprEq__Group_1__2__Impl_in_rule__ExprEq__Group_1__27024);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3511:1: rule__ExprEq__Group_1__2__Impl : ( ( rule__ExprEq__ExprSim2Assignment_1_2 ) ) ;
    public final void rule__ExprEq__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3515:1: ( ( ( rule__ExprEq__ExprSim2Assignment_1_2 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3516:1: ( ( rule__ExprEq__ExprSim2Assignment_1_2 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3516:1: ( ( rule__ExprEq__ExprSim2Assignment_1_2 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3517:1: ( rule__ExprEq__ExprSim2Assignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExprSim2Assignment_1_2()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3518:1: ( rule__ExprEq__ExprSim2Assignment_1_2 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3518:2: rule__ExprEq__ExprSim2Assignment_1_2
            {
            pushFollow(FOLLOW_rule__ExprEq__ExprSim2Assignment_1_2_in_rule__ExprEq__Group_1__2__Impl7051);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3534:1: rule__Cons__Group__0 : rule__Cons__Group__0__Impl rule__Cons__Group__1 ;
    public final void rule__Cons__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3538:1: ( rule__Cons__Group__0__Impl rule__Cons__Group__1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3539:2: rule__Cons__Group__0__Impl rule__Cons__Group__1
            {
            pushFollow(FOLLOW_rule__Cons__Group__0__Impl_in_rule__Cons__Group__07087);
            rule__Cons__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Cons__Group__1_in_rule__Cons__Group__07090);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3546:1: rule__Cons__Group__0__Impl : ( ( rule__Cons__ExprConsAssignment_0 ) ) ;
    public final void rule__Cons__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3550:1: ( ( ( rule__Cons__ExprConsAssignment_0 ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3551:1: ( ( rule__Cons__ExprConsAssignment_0 ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3551:1: ( ( rule__Cons__ExprConsAssignment_0 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3552:1: ( rule__Cons__ExprConsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConsAccess().getExprConsAssignment_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3553:1: ( rule__Cons__ExprConsAssignment_0 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3553:2: rule__Cons__ExprConsAssignment_0
            {
            pushFollow(FOLLOW_rule__Cons__ExprConsAssignment_0_in_rule__Cons__Group__0__Impl7117);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3563:1: rule__Cons__Group__1 : rule__Cons__Group__1__Impl ;
    public final void rule__Cons__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3567:1: ( rule__Cons__Group__1__Impl )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3568:2: rule__Cons__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Cons__Group__1__Impl_in_rule__Cons__Group__17147);
            rule__Cons__Group__1__Impl();

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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3574:1: rule__Cons__Group__1__Impl : ( ( ( rule__Cons__ExprConsAttListAssignment_1 ) ) ( ( rule__Cons__ExprConsAttListAssignment_1 )* ) ) ;
    public final void rule__Cons__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3578:1: ( ( ( ( rule__Cons__ExprConsAttListAssignment_1 ) ) ( ( rule__Cons__ExprConsAttListAssignment_1 )* ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3579:1: ( ( ( rule__Cons__ExprConsAttListAssignment_1 ) ) ( ( rule__Cons__ExprConsAttListAssignment_1 )* ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3579:1: ( ( ( rule__Cons__ExprConsAttListAssignment_1 ) ) ( ( rule__Cons__ExprConsAttListAssignment_1 )* ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3580:1: ( ( rule__Cons__ExprConsAttListAssignment_1 ) ) ( ( rule__Cons__ExprConsAttListAssignment_1 )* )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3580:1: ( ( rule__Cons__ExprConsAttListAssignment_1 ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3581:1: ( rule__Cons__ExprConsAttListAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConsAccess().getExprConsAttListAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3582:1: ( rule__Cons__ExprConsAttListAssignment_1 )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3582:2: rule__Cons__ExprConsAttListAssignment_1
            {
            pushFollow(FOLLOW_rule__Cons__ExprConsAttListAssignment_1_in_rule__Cons__Group__1__Impl7176);
            rule__Cons__ExprConsAttListAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConsAccess().getExprConsAttListAssignment_1()); 
            }

            }

            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3585:1: ( ( rule__Cons__ExprConsAttListAssignment_1 )* )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3586:1: ( rule__Cons__ExprConsAttListAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConsAccess().getExprConsAttListAssignment_1()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3587:1: ( rule__Cons__ExprConsAttListAssignment_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_SYMBOL && LA17_0<=RULE_VARIABLE)||LA17_0==31||LA17_0==36||LA17_0==41) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3587:2: rule__Cons__ExprConsAttListAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Cons__ExprConsAttListAssignment_1_in_rule__Cons__Group__1__Impl7188);
            	    rule__Cons__ExprConsAttListAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConsAccess().getExprConsAttListAssignment_1()); 
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
    // $ANTLR end "rule__Cons__Group__1__Impl"


    // $ANTLR start "rule__Program__FonctionsAssignment"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3603:1: rule__Program__FonctionsAssignment : ( ruleFunction ) ;
    public final void rule__Program__FonctionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3607:1: ( ( ruleFunction ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3608:1: ( ruleFunction )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3608:1: ( ruleFunction )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3609:1: ruleFunction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getFonctionsFunctionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleFunction_in_rule__Program__FonctionsAssignment7230);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3618:1: rule__Function__NomAssignment_1 : ( RULE_SYMBOL ) ;
    public final void rule__Function__NomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3622:1: ( ( RULE_SYMBOL ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3623:1: ( RULE_SYMBOL )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3623:1: ( RULE_SYMBOL )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3624:1: RULE_SYMBOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getNomSYMBOLTerminalRuleCall_1_0()); 
            }
            match(input,RULE_SYMBOL,FOLLOW_RULE_SYMBOL_in_rule__Function__NomAssignment_17261); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3633:1: rule__Function__DefinitionAssignment_3 : ( ruleDefinition ) ;
    public final void rule__Function__DefinitionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3637:1: ( ( ruleDefinition ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3638:1: ( ruleDefinition )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3638:1: ( ruleDefinition )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3639:1: ruleDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getDefinitionDefinitionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleDefinition_in_rule__Function__DefinitionAssignment_37292);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3648:1: rule__Definition__InputsAssignment_1 : ( ruleInput ) ;
    public final void rule__Definition__InputsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3652:1: ( ( ruleInput ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3653:1: ( ruleInput )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3653:1: ( ruleInput )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3654:1: ruleInput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getInputsInputParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleInput_in_rule__Definition__InputsAssignment_17323);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3663:1: rule__Definition__CommandesAssignment_3 : ( ruleCommands ) ;
    public final void rule__Definition__CommandesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3667:1: ( ( ruleCommands ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3668:1: ( ruleCommands )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3668:1: ( ruleCommands )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3669:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getCommandesCommandsParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Definition__CommandesAssignment_37354);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3678:1: rule__Definition__OutputsAssignment_6 : ( ruleOutput ) ;
    public final void rule__Definition__OutputsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3682:1: ( ( ruleOutput ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3683:1: ( ruleOutput )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3683:1: ( ruleOutput )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3684:1: ruleOutput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitionAccess().getOutputsOutputParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleOutput_in_rule__Definition__OutputsAssignment_67385);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3693:1: rule__Input__VarInAssignment_0_0 : ( RULE_VARIABLE ) ;
    public final void rule__Input__VarInAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3697:1: ( ( RULE_VARIABLE ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3698:1: ( RULE_VARIABLE )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3698:1: ( RULE_VARIABLE )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3699:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVarInVARIABLETerminalRuleCall_0_0_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Input__VarInAssignment_0_07416); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3708:1: rule__Input__VarInAssignment_1 : ( RULE_VARIABLE ) ;
    public final void rule__Input__VarInAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3712:1: ( ( RULE_VARIABLE ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3713:1: ( RULE_VARIABLE )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3713:1: ( RULE_VARIABLE )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3714:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVarInVARIABLETerminalRuleCall_1_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Input__VarInAssignment_17447); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3723:1: rule__Output__VarOutAssignment_0_0 : ( RULE_VARIABLE ) ;
    public final void rule__Output__VarOutAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3727:1: ( ( RULE_VARIABLE ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3728:1: ( RULE_VARIABLE )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3728:1: ( RULE_VARIABLE )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3729:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVarOutVARIABLETerminalRuleCall_0_0_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Output__VarOutAssignment_0_07478); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3738:1: rule__Output__VarOutAssignment_1 : ( RULE_VARIABLE ) ;
    public final void rule__Output__VarOutAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3742:1: ( ( RULE_VARIABLE ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3743:1: ( RULE_VARIABLE )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3743:1: ( RULE_VARIABLE )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3744:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVarOutVARIABLETerminalRuleCall_1_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Output__VarOutAssignment_17509); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3753:1: rule__Vars__VarGenAssignment_0_0 : ( RULE_VARIABLE ) ;
    public final void rule__Vars__VarGenAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3757:1: ( ( RULE_VARIABLE ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3758:1: ( RULE_VARIABLE )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3758:1: ( RULE_VARIABLE )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3759:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getVarGenVARIABLETerminalRuleCall_0_0_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Vars__VarGenAssignment_0_07540); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3768:1: rule__Vars__VarGenAssignment_1 : ( RULE_VARIABLE ) ;
    public final void rule__Vars__VarGenAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3772:1: ( ( RULE_VARIABLE ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3773:1: ( RULE_VARIABLE )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3773:1: ( RULE_VARIABLE )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3774:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getVarGenVARIABLETerminalRuleCall_1_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Vars__VarGenAssignment_17571); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3783:1: rule__Commands__CommandeAssignment_0_0_0 : ( ruleCommand ) ;
    public final void rule__Commands__CommandeAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3787:1: ( ( ruleCommand ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3788:1: ( ruleCommand )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3788:1: ( ruleCommand )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3789:1: ruleCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getCommandeCommandParserRuleCall_0_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleCommand_in_rule__Commands__CommandeAssignment_0_0_07602);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3798:1: rule__Commands__CommandeAssignment_1 : ( ruleCommand ) ;
    public final void rule__Commands__CommandeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3802:1: ( ( ruleCommand ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3803:1: ( ruleCommand )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3803:1: ( ruleCommand )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3804:1: ruleCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getCommandeCommandParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleCommand_in_rule__Commands__CommandeAssignment_17633);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3813:1: rule__Command__NopAssignment_0 : ( ( 'nop' ) ) ;
    public final void rule__Command__NopAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3817:1: ( ( ( 'nop' ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3818:1: ( ( 'nop' ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3818:1: ( ( 'nop' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3819:1: ( 'nop' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNopNopKeyword_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3820:1: ( 'nop' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3821:1: 'nop'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNopNopKeyword_0_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__Command__NopAssignment_07669); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3836:1: rule__Command__VarsAssignment_1_0 : ( ruleVars ) ;
    public final void rule__Command__VarsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3840:1: ( ( ruleVars ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3841:1: ( ruleVars )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3841:1: ( ruleVars )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3842:1: ruleVars
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3851:1: rule__Command__ExprsAssignment_1_2 : ( ruleExprs ) ;
    public final void rule__Command__ExprsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3855:1: ( ( ruleExprs ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3856:1: ( ruleExprs )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3856:1: ( ruleExprs )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3857:1: ruleExprs
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3866:1: rule__Command__CmdWhileAssignment_2 : ( ruleCommandWhile ) ;
    public final void rule__Command__CmdWhileAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3870:1: ( ( ruleCommandWhile ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3871:1: ( ruleCommandWhile )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3871:1: ( ruleCommandWhile )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3872:1: ruleCommandWhile
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3881:1: rule__Command__CmdIfAssignment_3 : ( ruleCommandIf ) ;
    public final void rule__Command__CmdIfAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3885:1: ( ( ruleCommandIf ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3886:1: ( ruleCommandIf )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3886:1: ( ruleCommandIf )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3887:1: ruleCommandIf
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3896:1: rule__Command__CmdForEachAssignment_4 : ( ruleCommandForEach ) ;
    public final void rule__Command__CmdForEachAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3900:1: ( ( ruleCommandForEach ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3901:1: ( ruleCommandForEach )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3901:1: ( ruleCommandForEach )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3902:1: ruleCommandForEach
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3911:1: rule__CommandWhile__WAssignment_0_0 : ( ( 'while' ) ) ;
    public final void rule__CommandWhile__WAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3915:1: ( ( ( 'while' ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3916:1: ( ( 'while' ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3916:1: ( ( 'while' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3917:1: ( 'while' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandWhileAccess().getWWhileKeyword_0_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3918:1: ( 'while' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3919:1: 'while'
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3934:1: rule__CommandWhile__ExprAssignment_1 : ( ruleExpr ) ;
    public final void rule__CommandWhile__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3938:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3939:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3939:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3940:1: ruleExpr
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3949:1: rule__CommandWhile__CmdsAssignment_3 : ( ruleCommands ) ;
    public final void rule__CommandWhile__CmdsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3953:1: ( ( ruleCommands ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3954:1: ( ruleCommands )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3954:1: ( ruleCommands )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3955:1: ruleCommands
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3964:1: rule__CommandIf__CondAssignment_1 : ( ruleExpr ) ;
    public final void rule__CommandIf__CondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3968:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3969:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3969:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3970:1: ruleExpr
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3979:1: rule__CommandIf__CmdsThenAssignment_3 : ( ruleCommands ) ;
    public final void rule__CommandIf__CmdsThenAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3983:1: ( ( ruleCommands ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3984:1: ( ruleCommands )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3984:1: ( ruleCommands )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3985:1: ruleCommands
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3994:1: rule__CommandIf__CmdsElseAssignment_4_1 : ( ruleCommands ) ;
    public final void rule__CommandIf__CmdsElseAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3998:1: ( ( ruleCommands ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3999:1: ( ruleCommands )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:3999:1: ( ruleCommands )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4000:1: ruleCommands
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4009:1: rule__CommandForEach__ElemAssignment_1 : ( ruleExpr ) ;
    public final void rule__CommandForEach__ElemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4013:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4014:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4014:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4015:1: ruleExpr
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4024:1: rule__CommandForEach__EnsembAssignment_3 : ( ruleExpr ) ;
    public final void rule__CommandForEach__EnsembAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4028:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4029:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4029:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4030:1: ruleExpr
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4039:1: rule__CommandForEach__CmdsAssignment_5 : ( ruleCommands ) ;
    public final void rule__CommandForEach__CmdsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4043:1: ( ( ruleCommands ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4044:1: ( ruleCommands )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4044:1: ( ruleCommands )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4045:1: ruleCommands
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4054:1: rule__Exprs__ExpGenAssignment_0_0_0 : ( ruleExpr ) ;
    public final void rule__Exprs__ExpGenAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4058:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4059:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4059:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4060:1: ruleExpr
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4069:1: rule__Exprs__ExpGenAssignment_1 : ( ruleExpr ) ;
    public final void rule__Exprs__ExpGenAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4073:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4074:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4074:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4075:1: ruleExpr
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4084:1: rule__Expr__ExprSimpAssignment_0_0 : ( ruleExprSimple ) ;
    public final void rule__Expr__ExprSimpAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4088:1: ( ( ruleExprSimple ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4089:1: ( ruleExprSimple )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4089:1: ( ruleExprSimple )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4090:1: ruleExprSimple
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4099:1: rule__Expr__ExprAndAssignment_1 : ( ruleExprAnd ) ;
    public final void rule__Expr__ExprAndAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4103:1: ( ( ruleExprAnd ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4104:1: ( ruleExprAnd )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4104:1: ( ruleExprAnd )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4105:1: ruleExprAnd
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4114:1: rule__ExprSimple__NilAssignment_0_0 : ( ( 'nil' ) ) ;
    public final void rule__ExprSimple__NilAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4118:1: ( ( ( 'nil' ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4119:1: ( ( 'nil' ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4119:1: ( ( 'nil' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4120:1: ( 'nil' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getNilNilKeyword_0_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4121:1: ( 'nil' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4122:1: 'nil'
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4137:1: rule__ExprSimple__VariAssignment_0_1 : ( RULE_VARIABLE ) ;
    public final void rule__ExprSimple__VariAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4141:1: ( ( RULE_VARIABLE ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4142:1: ( RULE_VARIABLE )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4142:1: ( RULE_VARIABLE )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4143:1: RULE_VARIABLE
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4152:1: rule__ExprSimple__SymbAssignment_0_2 : ( RULE_SYMBOL ) ;
    public final void rule__ExprSimple__SymbAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4156:1: ( ( RULE_SYMBOL ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4157:1: ( RULE_SYMBOL )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4157:1: ( RULE_SYMBOL )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4158:1: RULE_SYMBOL
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4167:1: rule__ExprSimple__ExprConsAssignment_1_1 : ( ruleCons ) ;
    public final void rule__ExprSimple__ExprConsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4171:1: ( ( ruleCons ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4172:1: ( ruleCons )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4172:1: ( ruleCons )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4173:1: ruleCons
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprConsConsParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleCons_in_rule__ExprSimple__ExprConsAssignment_1_18385);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4182:1: rule__ExprSimple__ExprHeadAssignment_2_1 : ( ( 'hd' ) ) ;
    public final void rule__ExprSimple__ExprHeadAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4186:1: ( ( ( 'hd' ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4187:1: ( ( 'hd' ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4187:1: ( ( 'hd' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4188:1: ( 'hd' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprHeadHdKeyword_2_1_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4189:1: ( 'hd' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4190:1: 'hd'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprHeadHdKeyword_2_1_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__ExprSimple__ExprHeadAssignment_2_18421); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4205:1: rule__ExprSimple__ExprHeadAttAssignment_2_2 : ( ruleExpr ) ;
    public final void rule__ExprSimple__ExprHeadAttAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4209:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4210:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4210:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4211:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprHeadAttExprParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__ExprSimple__ExprHeadAttAssignment_2_28460);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4220:1: rule__ExprSimple__ExprTailAssignment_3_1 : ( ( 'tl' ) ) ;
    public final void rule__ExprSimple__ExprTailAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4224:1: ( ( ( 'tl' ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4225:1: ( ( 'tl' ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4225:1: ( ( 'tl' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4226:1: ( 'tl' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprTailTlKeyword_3_1_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4227:1: ( 'tl' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4228:1: 'tl'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprTailTlKeyword_3_1_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__ExprSimple__ExprTailAssignment_3_18496); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4243:1: rule__ExprSimple__ExprTailAttAssignment_3_2 : ( ruleExpr ) ;
    public final void rule__ExprSimple__ExprTailAttAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4247:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4248:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4248:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4249:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprTailAttExprParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__ExprSimple__ExprTailAttAssignment_3_28535);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4258:1: rule__ExprSimple__NomSymbAssignment_4_1 : ( RULE_SYMBOL ) ;
    public final void rule__ExprSimple__NomSymbAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4262:1: ( ( RULE_SYMBOL ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4263:1: ( RULE_SYMBOL )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4263:1: ( RULE_SYMBOL )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4264:1: RULE_SYMBOL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getNomSymbSYMBOLTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_SYMBOL,FOLLOW_RULE_SYMBOL_in_rule__ExprSimple__NomSymbAssignment_4_18566); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4273:1: rule__ExprSimple__SymbAttAssignment_4_2 : ( ruleExpr ) ;
    public final void rule__ExprSimple__SymbAttAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4277:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4278:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4278:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4279:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getSymbAttExprParserRuleCall_4_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__ExprSimple__SymbAttAssignment_4_28597);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4288:1: rule__ExprAnd__ExprOrAssignment_0 : ( ruleExprOr ) ;
    public final void rule__ExprAnd__ExprOrAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4292:1: ( ( ruleExprOr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4293:1: ( ruleExprOr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4293:1: ( ruleExprOr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4294:1: ruleExprOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExprOrExprOrParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExprOr_in_rule__ExprAnd__ExprOrAssignment_08628);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4303:1: rule__ExprAnd__ExprAndAssignment_1_0 : ( ( 'and' ) ) ;
    public final void rule__ExprAnd__ExprAndAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4307:1: ( ( ( 'and' ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4308:1: ( ( 'and' ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4308:1: ( ( 'and' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4309:1: ( 'and' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExprAndAndKeyword_1_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4310:1: ( 'and' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4311:1: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExprAndAndKeyword_1_0_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__ExprAnd__ExprAndAssignment_1_08664); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4326:1: rule__ExprAnd__ExprAndAttAssignment_1_1 : ( ruleExprAnd ) ;
    public final void rule__ExprAnd__ExprAndAttAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4330:1: ( ( ruleExprAnd ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4331:1: ( ruleExprAnd )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4331:1: ( ruleExprAnd )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4332:1: ruleExprAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAndAccess().getExprAndAttExprAndParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExprAnd_in_rule__ExprAnd__ExprAndAttAssignment_1_18703);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4341:1: rule__ExprOr__ExprNotAssignment_0 : ( ruleExprNot ) ;
    public final void rule__ExprOr__ExprNotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4345:1: ( ( ruleExprNot ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4346:1: ( ruleExprNot )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4346:1: ( ruleExprNot )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4347:1: ruleExprNot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExprNotExprNotParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExprNot_in_rule__ExprOr__ExprNotAssignment_08734);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4356:1: rule__ExprOr__ExprOrAssignment_1_0 : ( ( 'or' ) ) ;
    public final void rule__ExprOr__ExprOrAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4360:1: ( ( ( 'or' ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4361:1: ( ( 'or' ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4361:1: ( ( 'or' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4362:1: ( 'or' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExprOrOrKeyword_1_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4363:1: ( 'or' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4364:1: 'or'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExprOrOrKeyword_1_0_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__ExprOr__ExprOrAssignment_1_08770); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4379:1: rule__ExprOr__ExprOrAttAssignment_1_1 : ( ruleExprOr ) ;
    public final void rule__ExprOr__ExprOrAttAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4383:1: ( ( ruleExprOr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4384:1: ( ruleExprOr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4384:1: ( ruleExprOr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4385:1: ruleExprOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprOrAccess().getExprOrAttExprOrParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExprOr_in_rule__ExprOr__ExprOrAttAssignment_1_18809);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4394:1: rule__ExprNot__NotAssignment_0 : ( ( 'not' ) ) ;
    public final void rule__ExprNot__NotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4398:1: ( ( ( 'not' ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4399:1: ( ( 'not' ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4399:1: ( ( 'not' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4400:1: ( 'not' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getNotNotKeyword_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4401:1: ( 'not' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4402:1: 'not'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getNotNotKeyword_0_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__ExprNot__NotAssignment_08845); if (state.failed) return ;
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4417:1: rule__ExprNot__ExprEqAssignment_1 : ( ruleExprEq ) ;
    public final void rule__ExprNot__ExprEqAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4421:1: ( ( ruleExprEq ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4422:1: ( ruleExprEq )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4422:1: ( ruleExprEq )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4423:1: ruleExprEq
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprNotAccess().getExprEqExprEqParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExprEq_in_rule__ExprNot__ExprEqAssignment_18884);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4432:1: rule__ExprEq__ExprAssignment_0_1 : ( ruleExpr ) ;
    public final void rule__ExprEq__ExprAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4436:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4437:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4437:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4438:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExprExprParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__ExprEq__ExprAssignment_0_18915);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4447:1: rule__ExprEq__ExprSim1Assignment_1_0 : ( ruleExprSimple ) ;
    public final void rule__ExprEq__ExprSim1Assignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4451:1: ( ( ruleExprSimple ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4452:1: ( ruleExprSimple )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4452:1: ( ruleExprSimple )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4453:1: ruleExprSimple
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExprSim1ExprSimpleParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_rule__ExprEq__ExprSim1Assignment_1_08946);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4462:1: rule__ExprEq__ExprSim2Assignment_1_2 : ( ruleExprSimple ) ;
    public final void rule__ExprEq__ExprSim2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4466:1: ( ( ruleExprSimple ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4467:1: ( ruleExprSimple )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4467:1: ( ruleExprSimple )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4468:1: ruleExprSimple
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprEqAccess().getExprSim2ExprSimpleParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_rule__ExprEq__ExprSim2Assignment_1_28977);
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
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4477:1: rule__Cons__ExprConsAssignment_0 : ( ( 'cons' ) ) ;
    public final void rule__Cons__ExprConsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4481:1: ( ( ( 'cons' ) ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4482:1: ( ( 'cons' ) )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4482:1: ( ( 'cons' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4483:1: ( 'cons' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConsAccess().getExprConsConsKeyword_0_0()); 
            }
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4484:1: ( 'cons' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4485:1: 'cons'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConsAccess().getExprConsConsKeyword_0_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__Cons__ExprConsAssignment_09013); if (state.failed) return ;
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


    // $ANTLR start "rule__Cons__ExprConsAttListAssignment_1"
    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4500:1: rule__Cons__ExprConsAttListAssignment_1 : ( ruleExpr ) ;
    public final void rule__Cons__ExprConsAttListAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4504:1: ( ( ruleExpr ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4505:1: ( ruleExpr )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4505:1: ( ruleExpr )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4506:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConsAccess().getExprConsAttListExprParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Cons__ExprConsAttListAssignment_19052);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConsAccess().getExprConsAttListExprParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cons__ExprConsAttListAssignment_1"

    // $ANTLR start synpred7_InternalWhileCpp
    public final void synpred7_InternalWhileCpp_fragment() throws RecognitionException {   
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:662:1: ( ( ( rule__Expr__Group_0__0 ) ) )
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:662:1: ( ( rule__Expr__Group_0__0 ) )
        {
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:662:1: ( ( rule__Expr__Group_0__0 ) )
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:663:1: ( rule__Expr__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExprAccess().getGroup_0()); 
        }
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:664:1: ( rule__Expr__Group_0__0 )
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:664:2: rule__Expr__Group_0__0
        {
        pushFollow(FOLLOW_rule__Expr__Group_0__0_in_synpred7_InternalWhileCpp1375);
        rule__Expr__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred7_InternalWhileCpp

    // $ANTLR start synpred14_InternalWhileCpp
    public final void synpred14_InternalWhileCpp_fragment() throws RecognitionException {   
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:752:1: ( ( ( rule__ExprEq__Group_0__0 ) ) )
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:752:1: ( ( rule__ExprEq__Group_0__0 ) )
        {
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:752:1: ( ( rule__ExprEq__Group_0__0 ) )
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:753:1: ( rule__ExprEq__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExprEqAccess().getGroup_0()); 
        }
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:754:1: ( rule__ExprEq__Group_0__0 )
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:754:2: rule__ExprEq__Group_0__0
        {
        pushFollow(FOLLOW_rule__ExprEq__Group_0__0_in_synpred14_InternalWhileCpp1600);
        rule__ExprEq__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred14_InternalWhileCpp

    // $ANTLR start synpred18_InternalWhileCpp
    public final void synpred18_InternalWhileCpp_fragment() throws RecognitionException {   
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1513:2: ( rule__Commands__Group_0__0 )
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1513:2: rule__Commands__Group_0__0
        {
        pushFollow(FOLLOW_rule__Commands__Group_0__0_in_synpred18_InternalWhileCpp3102);
        rule__Commands__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalWhileCpp

    // $ANTLR start synpred20_InternalWhileCpp
    public final void synpred20_InternalWhileCpp_fragment() throws RecognitionException {   
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2397:2: ( rule__Exprs__Group_0__0 )
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:2397:2: rule__Exprs__Group_0__0
        {
        pushFollow(FOLLOW_rule__Exprs__Group_0__0_in_synpred20_InternalWhileCpp4840);
        rule__Exprs__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_InternalWhileCpp

    // Delegated rules

    public final boolean synpred7_InternalWhileCpp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalWhileCpp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalWhileCpp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalWhileCpp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalWhileCpp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalWhileCpp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalWhileCpp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalWhileCpp_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_rule__Command__NopAssignment_0_in_rule__Command__Alternatives1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__0_in_rule__Command__Alternatives1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__CmdWhileAssignment_2_in_rule__Command__Alternatives1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__CmdIfAssignment_3_in_rule__Command__Alternatives1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__CmdForEachAssignment_4_in_rule__Command__Alternatives1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandWhile__WAssignment_0_0_in_rule__CommandWhile__Alternatives_01322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__CommandWhile__Alternatives_01341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group_0__0_in_rule__Expr__Alternatives1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__ExprAndAssignment_1_in_rule__Expr__Alternatives1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Alternatives_0_in_rule__ExprSimple__Alternatives1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1__0_in_rule__ExprSimple__Alternatives1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_2__0_in_rule__ExprSimple__Alternatives1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_3__0_in_rule__ExprSimple__Alternatives1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__0_in_rule__ExprSimple__Alternatives1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__NilAssignment_0_0_in_rule__ExprSimple__Alternatives_01531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__VariAssignment_0_1_in_rule__ExprSimple__Alternatives_01549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__SymbAssignment_0_2_in_rule__ExprSimple__Alternatives_01567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__0_in_rule__ExprEq__Alternatives1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__0_in_rule__ExprEq__Alternatives1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__01649 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group__1_in_rule__Function__Group__01652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Function__Group__0__Impl1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__11711 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Function__Group__2_in_rule__Function__Group__11714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__NomAssignment_1_in_rule__Function__Group__1__Impl1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__21771 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Function__Group__3_in_rule__Function__Group__21774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Function__Group__2__Impl1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__31833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__DefinitionAssignment_3_in_rule__Function__Group__3__Impl1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__01898 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__01901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Definition__Group__0__Impl1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__11960 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__11963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__InputsAssignment_1_in_rule__Definition__Group__1__Impl1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__22020 = new BitSet(new long[]{0x0000000C22004020L});
    public static final BitSet FOLLOW_rule__Definition__Group__3_in_rule__Definition__Group__22023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Definition__Group__2__Impl2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__3__Impl_in_rule__Definition__Group__32082 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Definition__Group__4_in_rule__Definition__Group__32085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__CommandesAssignment_3_in_rule__Definition__Group__3__Impl2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__4__Impl_in_rule__Definition__Group__42142 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Definition__Group__5_in_rule__Definition__Group__42145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Definition__Group__4__Impl2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__5__Impl_in_rule__Definition__Group__52204 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Definition__Group__6_in_rule__Definition__Group__52207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Definition__Group__5__Impl2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__6__Impl_in_rule__Definition__Group__62266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__OutputsAssignment_6_in_rule__Definition__Group__6__Impl2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__02337 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Input__Group__1_in_rule__Input__Group__02340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_0__0_in_rule__Input__Group__0__Impl2367 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__12398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__VarInAssignment_1_in_rule__Input__Group__1__Impl2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_0__0__Impl_in_rule__Input__Group_0__02459 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Input__Group_0__1_in_rule__Input__Group_0__02462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__VarInAssignment_0_0_in_rule__Input__Group_0__0__Impl2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_0__1__Impl_in_rule__Input__Group_0__12519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Input__Group_0__1__Impl2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group__0__Impl_in_rule__Output__Group__02582 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Output__Group__1_in_rule__Output__Group__02585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_0__0_in_rule__Output__Group__0__Impl2612 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Output__Group__1__Impl_in_rule__Output__Group__12643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__VarOutAssignment_1_in_rule__Output__Group__1__Impl2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_0__0__Impl_in_rule__Output__Group_0__02704 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Output__Group_0__1_in_rule__Output__Group_0__02707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__VarOutAssignment_0_0_in_rule__Output__Group_0__0__Impl2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_0__1__Impl_in_rule__Output__Group_0__12764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Output__Group_0__1__Impl2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group__0__Impl_in_rule__Vars__Group__02827 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Vars__Group__1_in_rule__Vars__Group__02830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_0__0_in_rule__Vars__Group__0__Impl2857 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Vars__Group__1__Impl_in_rule__Vars__Group__12888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__VarGenAssignment_1_in_rule__Vars__Group__1__Impl2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_0__0__Impl_in_rule__Vars__Group_0__02949 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Vars__Group_0__1_in_rule__Vars__Group_0__02952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__VarGenAssignment_0_0_in_rule__Vars__Group_0__0__Impl2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_0__1__Impl_in_rule__Vars__Group_0__13009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Vars__Group_0__1__Impl3037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group__0__Impl_in_rule__Commands__Group__03072 = new BitSet(new long[]{0x0000000C22004020L});
    public static final BitSet FOLLOW_rule__Commands__Group__1_in_rule__Commands__Group__03075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_0__0_in_rule__Commands__Group__0__Impl3102 = new BitSet(new long[]{0x0000000C22004022L});
    public static final BitSet FOLLOW_rule__Commands__Group__1__Impl_in_rule__Commands__Group__13133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__CommandeAssignment_1_in_rule__Commands__Group__1__Impl3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_0__0__Impl_in_rule__Commands__Group_0__03194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_0_0__0_in_rule__Commands__Group_0__0__Impl3221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_0_0__0__Impl_in_rule__Commands__Group_0_0__03253 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Commands__Group_0_0__1_in_rule__Commands__Group_0_0__03256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__CommandeAssignment_0_0_0_in_rule__Commands__Group_0_0__0__Impl3283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_0_0__1__Impl_in_rule__Commands__Group_0_0__13313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Commands__Group_0_0__1__Impl3341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__0__Impl_in_rule__Command__Group_1__03376 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Command__Group_1__1_in_rule__Command__Group_1__03379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__VarsAssignment_1_0_in_rule__Command__Group_1__0__Impl3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__1__Impl_in_rule__Command__Group_1__13436 = new BitSet(new long[]{0x0000021080000030L});
    public static final BitSet FOLLOW_rule__Command__Group_1__2_in_rule__Command__Group_1__13439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Command__Group_1__1__Impl3467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__2__Impl_in_rule__Command__Group_1__23498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ExprsAssignment_1_2_in_rule__Command__Group_1__2__Impl3525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandWhile__Group__0__Impl_in_rule__CommandWhile__Group__03561 = new BitSet(new long[]{0x0000021080000030L});
    public static final BitSet FOLLOW_rule__CommandWhile__Group__1_in_rule__CommandWhile__Group__03564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandWhile__Alternatives_0_in_rule__CommandWhile__Group__0__Impl3591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandWhile__Group__1__Impl_in_rule__CommandWhile__Group__13621 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__CommandWhile__Group__2_in_rule__CommandWhile__Group__13624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandWhile__ExprAssignment_1_in_rule__CommandWhile__Group__1__Impl3651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandWhile__Group__2__Impl_in_rule__CommandWhile__Group__23681 = new BitSet(new long[]{0x0000000C22004020L});
    public static final BitSet FOLLOW_rule__CommandWhile__Group__3_in_rule__CommandWhile__Group__23684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CommandWhile__Group__2__Impl3712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandWhile__Group__3__Impl_in_rule__CommandWhile__Group__33743 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__CommandWhile__Group__4_in_rule__CommandWhile__Group__33746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandWhile__CmdsAssignment_3_in_rule__CommandWhile__Group__3__Impl3773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandWhile__Group__4__Impl_in_rule__CommandWhile__Group__43803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CommandWhile__Group__4__Impl3831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__0__Impl_in_rule__CommandIf__Group__03872 = new BitSet(new long[]{0x0000021080000030L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__1_in_rule__CommandIf__Group__03875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CommandIf__Group__0__Impl3903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__1__Impl_in_rule__CommandIf__Group__13934 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__2_in_rule__CommandIf__Group__13937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__CondAssignment_1_in_rule__CommandIf__Group__1__Impl3964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__2__Impl_in_rule__CommandIf__Group__23994 = new BitSet(new long[]{0x0000000C22004020L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__3_in_rule__CommandIf__Group__23997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CommandIf__Group__2__Impl4025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__3__Impl_in_rule__CommandIf__Group__34056 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__4_in_rule__CommandIf__Group__34059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__CmdsThenAssignment_3_in_rule__CommandIf__Group__3__Impl4086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__4__Impl_in_rule__CommandIf__Group__44116 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__5_in_rule__CommandIf__Group__44119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__Group_4__0_in_rule__CommandIf__Group__4__Impl4146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__Group__5__Impl_in_rule__CommandIf__Group__54177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CommandIf__Group__5__Impl4205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__Group_4__0__Impl_in_rule__CommandIf__Group_4__04248 = new BitSet(new long[]{0x0000000C22004020L});
    public static final BitSet FOLLOW_rule__CommandIf__Group_4__1_in_rule__CommandIf__Group_4__04251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__CommandIf__Group_4__0__Impl4279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__Group_4__1__Impl_in_rule__CommandIf__Group_4__14310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandIf__CmdsElseAssignment_4_1_in_rule__CommandIf__Group_4__1__Impl4337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__0__Impl_in_rule__CommandForEach__Group__04371 = new BitSet(new long[]{0x0000021080000030L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__1_in_rule__CommandForEach__Group__04374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CommandForEach__Group__0__Impl4402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__1__Impl_in_rule__CommandForEach__Group__14433 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__2_in_rule__CommandForEach__Group__14436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__ElemAssignment_1_in_rule__CommandForEach__Group__1__Impl4463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__2__Impl_in_rule__CommandForEach__Group__24493 = new BitSet(new long[]{0x0000021080000030L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__3_in_rule__CommandForEach__Group__24496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__CommandForEach__Group__2__Impl4524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__3__Impl_in_rule__CommandForEach__Group__34555 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__4_in_rule__CommandForEach__Group__34558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__EnsembAssignment_3_in_rule__CommandForEach__Group__3__Impl4585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__4__Impl_in_rule__CommandForEach__Group__44615 = new BitSet(new long[]{0x0000000C22004020L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__5_in_rule__CommandForEach__Group__44618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CommandForEach__Group__4__Impl4646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__5__Impl_in_rule__CommandForEach__Group__54677 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__6_in_rule__CommandForEach__Group__54680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__CmdsAssignment_5_in_rule__CommandForEach__Group__5__Impl4707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommandForEach__Group__6__Impl_in_rule__CommandForEach__Group__64737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CommandForEach__Group__6__Impl4765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group__0__Impl_in_rule__Exprs__Group__04810 = new BitSet(new long[]{0x0000021080000030L});
    public static final BitSet FOLLOW_rule__Exprs__Group__1_in_rule__Exprs__Group__04813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_0__0_in_rule__Exprs__Group__0__Impl4840 = new BitSet(new long[]{0x0000021080000032L});
    public static final BitSet FOLLOW_rule__Exprs__Group__1__Impl_in_rule__Exprs__Group__14871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__ExpGenAssignment_1_in_rule__Exprs__Group__1__Impl4898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_0__0__Impl_in_rule__Exprs__Group_0__04932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_0_0__0_in_rule__Exprs__Group_0__0__Impl4959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_0_0__0__Impl_in_rule__Exprs__Group_0_0__04991 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Exprs__Group_0_0__1_in_rule__Exprs__Group_0_0__04994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__ExpGenAssignment_0_0_0_in_rule__Exprs__Group_0_0__0__Impl5021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_0_0__1__Impl_in_rule__Exprs__Group_0_0__15051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Exprs__Group_0_0__1__Impl5079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group_0__0__Impl_in_rule__Expr__Group_0__05114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__ExprSimpAssignment_0_0_in_rule__Expr__Group_0__0__Impl5141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1__0__Impl_in_rule__ExprSimple__Group_1__05173 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1__1_in_rule__ExprSimple__Group_1__05176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ExprSimple__Group_1__0__Impl5204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1__1__Impl_in_rule__ExprSimple__Group_1__15235 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1__2_in_rule__ExprSimple__Group_1__15238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__ExprConsAssignment_1_1_in_rule__ExprSimple__Group_1__1__Impl5265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1__2__Impl_in_rule__ExprSimple__Group_1__25295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ExprSimple__Group_1__2__Impl5323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_2__0__Impl_in_rule__ExprSimple__Group_2__05360 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_2__1_in_rule__ExprSimple__Group_2__05363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ExprSimple__Group_2__0__Impl5391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_2__1__Impl_in_rule__ExprSimple__Group_2__15422 = new BitSet(new long[]{0x0000021080000030L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_2__2_in_rule__ExprSimple__Group_2__15425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__ExprHeadAssignment_2_1_in_rule__ExprSimple__Group_2__1__Impl5452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_2__2__Impl_in_rule__ExprSimple__Group_2__25482 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_2__3_in_rule__ExprSimple__Group_2__25485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__ExprHeadAttAssignment_2_2_in_rule__ExprSimple__Group_2__2__Impl5512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_2__3__Impl_in_rule__ExprSimple__Group_2__35542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ExprSimple__Group_2__3__Impl5570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_3__0__Impl_in_rule__ExprSimple__Group_3__05609 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_3__1_in_rule__ExprSimple__Group_3__05612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ExprSimple__Group_3__0__Impl5640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_3__1__Impl_in_rule__ExprSimple__Group_3__15671 = new BitSet(new long[]{0x0000021080000030L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_3__2_in_rule__ExprSimple__Group_3__15674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__ExprTailAssignment_3_1_in_rule__ExprSimple__Group_3__1__Impl5701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_3__2__Impl_in_rule__ExprSimple__Group_3__25731 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_3__3_in_rule__ExprSimple__Group_3__25734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__ExprTailAttAssignment_3_2_in_rule__ExprSimple__Group_3__2__Impl5761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_3__3__Impl_in_rule__ExprSimple__Group_3__35791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ExprSimple__Group_3__3__Impl5819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__0__Impl_in_rule__ExprSimple__Group_4__05858 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__1_in_rule__ExprSimple__Group_4__05861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ExprSimple__Group_4__0__Impl5889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__1__Impl_in_rule__ExprSimple__Group_4__15920 = new BitSet(new long[]{0x0000021080000030L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__2_in_rule__ExprSimple__Group_4__15923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__NomSymbAssignment_4_1_in_rule__ExprSimple__Group_4__1__Impl5950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__2__Impl_in_rule__ExprSimple__Group_4__25980 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__3_in_rule__ExprSimple__Group_4__25983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__SymbAttAssignment_4_2_in_rule__ExprSimple__Group_4__2__Impl6010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_4__3__Impl_in_rule__ExprSimple__Group_4__36040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ExprSimple__Group_4__3__Impl6068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group__0__Impl_in_rule__ExprAnd__Group__06107 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group__1_in_rule__ExprAnd__Group__06110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__ExprOrAssignment_0_in_rule__ExprAnd__Group__0__Impl6137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group__1__Impl_in_rule__ExprAnd__Group__16167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__0_in_rule__ExprAnd__Group__1__Impl6194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__0__Impl_in_rule__ExprAnd__Group_1__06229 = new BitSet(new long[]{0x0000021080000030L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__1_in_rule__ExprAnd__Group_1__06232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__ExprAndAssignment_1_0_in_rule__ExprAnd__Group_1__0__Impl6259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__Group_1__1__Impl_in_rule__ExprAnd__Group_1__16289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprAnd__ExprAndAttAssignment_1_1_in_rule__ExprAnd__Group_1__1__Impl6316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group__0__Impl_in_rule__ExprOr__Group__06350 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__ExprOr__Group__1_in_rule__ExprOr__Group__06353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__ExprNotAssignment_0_in_rule__ExprOr__Group__0__Impl6380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group__1__Impl_in_rule__ExprOr__Group__16410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__0_in_rule__ExprOr__Group__1__Impl6437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__0__Impl_in_rule__ExprOr__Group_1__06472 = new BitSet(new long[]{0x0000021080000030L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__1_in_rule__ExprOr__Group_1__06475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__ExprOrAssignment_1_0_in_rule__ExprOr__Group_1__0__Impl6502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__Group_1__1__Impl_in_rule__ExprOr__Group_1__16532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprOr__ExprOrAttAssignment_1_1_in_rule__ExprOr__Group_1__1__Impl6559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNot__Group__0__Impl_in_rule__ExprNot__Group__06593 = new BitSet(new long[]{0x0000021080000030L});
    public static final BitSet FOLLOW_rule__ExprNot__Group__1_in_rule__ExprNot__Group__06596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNot__NotAssignment_0_in_rule__ExprNot__Group__0__Impl6623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNot__Group__1__Impl_in_rule__ExprNot__Group__16654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprNot__ExprEqAssignment_1_in_rule__ExprNot__Group__1__Impl6681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__0__Impl_in_rule__ExprEq__Group_0__06715 = new BitSet(new long[]{0x0000021080000030L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__1_in_rule__ExprEq__Group_0__06718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ExprEq__Group_0__0__Impl6746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__1__Impl_in_rule__ExprEq__Group_0__16777 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__2_in_rule__ExprEq__Group_0__16780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__ExprAssignment_0_1_in_rule__ExprEq__Group_0__1__Impl6807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__2__Impl_in_rule__ExprEq__Group_0__26837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ExprEq__Group_0__2__Impl6865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__0__Impl_in_rule__ExprEq__Group_1__06902 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__1_in_rule__ExprEq__Group_1__06905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__ExprSim1Assignment_1_0_in_rule__ExprEq__Group_1__0__Impl6932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__1__Impl_in_rule__ExprEq__Group_1__16962 = new BitSet(new long[]{0x0000001080000030L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__2_in_rule__ExprEq__Group_1__16965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ExprEq__Group_1__1__Impl6993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_1__2__Impl_in_rule__ExprEq__Group_1__27024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__ExprSim2Assignment_1_2_in_rule__ExprEq__Group_1__2__Impl7051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cons__Group__0__Impl_in_rule__Cons__Group__07087 = new BitSet(new long[]{0x0000021080000030L});
    public static final BitSet FOLLOW_rule__Cons__Group__1_in_rule__Cons__Group__07090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cons__ExprConsAssignment_0_in_rule__Cons__Group__0__Impl7117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cons__Group__1__Impl_in_rule__Cons__Group__17147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cons__ExprConsAttListAssignment_1_in_rule__Cons__Group__1__Impl7176 = new BitSet(new long[]{0x0000021080000032L});
    public static final BitSet FOLLOW_rule__Cons__ExprConsAttListAssignment_1_in_rule__Cons__Group__1__Impl7188 = new BitSet(new long[]{0x0000021080000032L});
    public static final BitSet FOLLOW_ruleFunction_in_rule__Program__FonctionsAssignment7230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOL_in_rule__Function__NomAssignment_17261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_rule__Function__DefinitionAssignment_37292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_rule__Definition__InputsAssignment_17323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Definition__CommandesAssignment_37354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutput_in_rule__Definition__OutputsAssignment_67385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Input__VarInAssignment_0_07416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Input__VarInAssignment_17447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Output__VarOutAssignment_0_07478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Output__VarOutAssignment_17509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Vars__VarGenAssignment_0_07540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Vars__VarGenAssignment_17571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__Commands__CommandeAssignment_0_0_07602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__Commands__CommandeAssignment_17633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Command__NopAssignment_07669 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleCons_in_rule__ExprSimple__ExprConsAssignment_1_18385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ExprSimple__ExprHeadAssignment_2_18421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__ExprSimple__ExprHeadAttAssignment_2_28460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ExprSimple__ExprTailAssignment_3_18496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__ExprSimple__ExprTailAttAssignment_3_28535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOL_in_rule__ExprSimple__NomSymbAssignment_4_18566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__ExprSimple__SymbAttAssignment_4_28597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_rule__ExprAnd__ExprOrAssignment_08628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ExprAnd__ExprAndAssignment_1_08664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_rule__ExprAnd__ExprAndAttAssignment_1_18703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprNot_in_rule__ExprOr__ExprNotAssignment_08734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ExprOr__ExprOrAssignment_1_08770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_rule__ExprOr__ExprOrAttAssignment_1_18809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ExprNot__NotAssignment_08845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprEq_in_rule__ExprNot__ExprEqAssignment_18884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__ExprEq__ExprAssignment_0_18915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_rule__ExprEq__ExprSim1Assignment_1_08946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_rule__ExprEq__ExprSim2Assignment_1_28977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Cons__ExprConsAssignment_09013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Cons__ExprConsAttListAssignment_19052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group_0__0_in_synpred7_InternalWhileCpp1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprEq__Group_0__0_in_synpred14_InternalWhileCpp1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_0__0_in_synpred18_InternalWhileCpp3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_0__0_in_synpred20_InternalWhileCpp4840 = new BitSet(new long[]{0x0000000000000002L});

}