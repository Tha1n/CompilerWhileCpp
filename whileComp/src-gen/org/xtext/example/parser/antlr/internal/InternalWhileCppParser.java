package org.xtext.example.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.services.WhileCppGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalWhileCppParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SYMBOL", "RULE_VARIABLE", "RULE_LC", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'function'", "':'", "'read'", "'%'", "'write'", "','", "'nop'", "';'", "':='", "'while'", "'for'", "'do'", "'od'", "'if'", "'then'", "'else'", "'fi'", "'foreach'", "'in'", "'nil'", "'('", "'cons'", "')'", "'list'", "'hd'", "'tl'", "'and'", "'or'", "'not'", "'=?'"
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
    public String getGrammarFileName() { return "../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g"; }



     	private WhileCppGrammarAccess grammarAccess;
     	
        public InternalWhileCppParser(TokenStream input, WhileCppGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Program";	
       	}
       	
       	@Override
       	protected WhileCppGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProgram"
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:67:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:68:2: (iv_ruleProgram= ruleProgram EOF )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:69:2: iv_ruleProgram= ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram75);
            iv_ruleProgram=ruleProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProgram; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:76:1: ruleProgram returns [EObject current=null] : ( (lv_fonctions_0_0= ruleFunction ) )* ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_fonctions_0_0 = null;


         enterRule(); 
            
        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:79:28: ( ( (lv_fonctions_0_0= ruleFunction ) )* )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:80:1: ( (lv_fonctions_0_0= ruleFunction ) )*
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:80:1: ( (lv_fonctions_0_0= ruleFunction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:81:1: (lv_fonctions_0_0= ruleFunction )
            	    {
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:81:1: (lv_fonctions_0_0= ruleFunction )
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:82:3: lv_fonctions_0_0= ruleFunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProgramAccess().getFonctionsFunctionParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFunction_in_ruleProgram130);
            	    lv_fonctions_0_0=ruleFunction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"fonctions",
            	              		lv_fonctions_0_0, 
            	              		"Function");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleFunction"
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:106:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:107:2: (iv_ruleFunction= ruleFunction EOF )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:108:2: iv_ruleFunction= ruleFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction166);
            iv_ruleFunction=ruleFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction176); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:115:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_nom_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nom_1_0=null;
        Token otherlv_2=null;
        EObject lv_definition_3_0 = null;


         enterRule(); 
            
        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:118:28: ( (otherlv_0= 'function' ( (lv_nom_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:119:1: (otherlv_0= 'function' ( (lv_nom_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:119:1: (otherlv_0= 'function' ( (lv_nom_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:119:3: otherlv_0= 'function' ( (lv_nom_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleFunction213); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
                  
            }
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:123:1: ( (lv_nom_1_0= RULE_SYMBOL ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:124:1: (lv_nom_1_0= RULE_SYMBOL )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:124:1: (lv_nom_1_0= RULE_SYMBOL )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:125:3: lv_nom_1_0= RULE_SYMBOL
            {
            lv_nom_1_0=(Token)match(input,RULE_SYMBOL,FOLLOW_RULE_SYMBOL_in_ruleFunction230); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_nom_1_0, grammarAccess.getFunctionAccess().getNomSYMBOLTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFunctionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"nom",
                      		lv_nom_1_0, 
                      		"SYMBOL");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleFunction247); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getColonKeyword_2());
                  
            }
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:145:1: ( (lv_definition_3_0= ruleDefinition ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:146:1: (lv_definition_3_0= ruleDefinition )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:146:1: (lv_definition_3_0= ruleDefinition )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:147:3: lv_definition_3_0= ruleDefinition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionAccess().getDefinitionDefinitionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDefinition_in_ruleFunction268);
            lv_definition_3_0=ruleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionRule());
              	        }
                     		set(
                     			current, 
                     			"definition",
                      		lv_definition_3_0, 
                      		"Definition");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleDefinition"
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:171:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:172:2: (iv_ruleDefinition= ruleDefinition EOF )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:173:2: iv_ruleDefinition= ruleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition304);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition314); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:180:1: ruleDefinition returns [EObject current=null] : (otherlv_0= 'read' ( (lv_inputs_1_0= ruleInput ) ) otherlv_2= '%' ( (lv_commandes_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_outputs_6_0= ruleOutput ) ) ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_inputs_1_0 = null;

        EObject lv_commandes_3_0 = null;

        EObject lv_outputs_6_0 = null;


         enterRule(); 
            
        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:183:28: ( (otherlv_0= 'read' ( (lv_inputs_1_0= ruleInput ) ) otherlv_2= '%' ( (lv_commandes_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_outputs_6_0= ruleOutput ) ) ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:184:1: (otherlv_0= 'read' ( (lv_inputs_1_0= ruleInput ) ) otherlv_2= '%' ( (lv_commandes_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_outputs_6_0= ruleOutput ) ) )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:184:1: (otherlv_0= 'read' ( (lv_inputs_1_0= ruleInput ) ) otherlv_2= '%' ( (lv_commandes_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_outputs_6_0= ruleOutput ) ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:184:3: otherlv_0= 'read' ( (lv_inputs_1_0= ruleInput ) ) otherlv_2= '%' ( (lv_commandes_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_outputs_6_0= ruleOutput ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleDefinition351); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getReadKeyword_0());
                  
            }
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:188:1: ( (lv_inputs_1_0= ruleInput ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:189:1: (lv_inputs_1_0= ruleInput )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:189:1: (lv_inputs_1_0= ruleInput )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:190:3: lv_inputs_1_0= ruleInput
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDefinitionAccess().getInputsInputParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInput_in_ruleDefinition372);
            lv_inputs_1_0=ruleInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"inputs",
                      		lv_inputs_1_0, 
                      		"Input");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleDefinition384); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDefinitionAccess().getPercentSignKeyword_2());
                  
            }
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:210:1: ( (lv_commandes_3_0= ruleCommands ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:211:1: (lv_commandes_3_0= ruleCommands )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:211:1: (lv_commandes_3_0= ruleCommands )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:212:3: lv_commandes_3_0= ruleCommands
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDefinitionAccess().getCommandesCommandsParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommands_in_ruleDefinition405);
            lv_commandes_3_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"commandes",
                      		lv_commandes_3_0, 
                      		"Commands");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleDefinition417); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getDefinitionAccess().getPercentSignKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleDefinition429); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDefinitionAccess().getWriteKeyword_5());
                  
            }
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:236:1: ( (lv_outputs_6_0= ruleOutput ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:237:1: (lv_outputs_6_0= ruleOutput )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:237:1: (lv_outputs_6_0= ruleOutput )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:238:3: lv_outputs_6_0= ruleOutput
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDefinitionAccess().getOutputsOutputParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOutput_in_ruleDefinition450);
            lv_outputs_6_0=ruleOutput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"outputs",
                      		lv_outputs_6_0, 
                      		"Output");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleInput"
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:262:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:263:2: (iv_ruleInput= ruleInput EOF )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:264:2: iv_ruleInput= ruleInput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInputRule()); 
            }
            pushFollow(FOLLOW_ruleInput_in_entryRuleInput486);
            iv_ruleInput=ruleInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInput; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInput496); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:271:1: ruleInput returns [EObject current=null] : ( ( ( (lv_varIn_0_0= RULE_VARIABLE ) ) otherlv_1= ',' )* ( (lv_varIn_2_0= RULE_VARIABLE ) ) ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token lv_varIn_0_0=null;
        Token otherlv_1=null;
        Token lv_varIn_2_0=null;

         enterRule(); 
            
        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:274:28: ( ( ( ( (lv_varIn_0_0= RULE_VARIABLE ) ) otherlv_1= ',' )* ( (lv_varIn_2_0= RULE_VARIABLE ) ) ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:275:1: ( ( ( (lv_varIn_0_0= RULE_VARIABLE ) ) otherlv_1= ',' )* ( (lv_varIn_2_0= RULE_VARIABLE ) ) )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:275:1: ( ( ( (lv_varIn_0_0= RULE_VARIABLE ) ) otherlv_1= ',' )* ( (lv_varIn_2_0= RULE_VARIABLE ) ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:275:2: ( ( (lv_varIn_0_0= RULE_VARIABLE ) ) otherlv_1= ',' )* ( (lv_varIn_2_0= RULE_VARIABLE ) )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:275:2: ( ( (lv_varIn_0_0= RULE_VARIABLE ) ) otherlv_1= ',' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_VARIABLE) ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==19) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:275:3: ( (lv_varIn_0_0= RULE_VARIABLE ) ) otherlv_1= ','
            	    {
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:275:3: ( (lv_varIn_0_0= RULE_VARIABLE ) )
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:276:1: (lv_varIn_0_0= RULE_VARIABLE )
            	    {
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:276:1: (lv_varIn_0_0= RULE_VARIABLE )
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:277:3: lv_varIn_0_0= RULE_VARIABLE
            	    {
            	    lv_varIn_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_ruleInput539); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_varIn_0_0, grammarAccess.getInputAccess().getVarInVARIABLETerminalRuleCall_0_0_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getInputRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"varIn",
            	              		lv_varIn_0_0, 
            	              		"VARIABLE");
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleInput556); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getInputAccess().getCommaKeyword_0_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:297:3: ( (lv_varIn_2_0= RULE_VARIABLE ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:298:1: (lv_varIn_2_0= RULE_VARIABLE )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:298:1: (lv_varIn_2_0= RULE_VARIABLE )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:299:3: lv_varIn_2_0= RULE_VARIABLE
            {
            lv_varIn_2_0=(Token)match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_ruleInput575); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_varIn_2_0, grammarAccess.getInputAccess().getVarInVARIABLETerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInputRule());
              	        }
                     		addWithLastConsumed(
                     			current, 
                     			"varIn",
                      		lv_varIn_2_0, 
                      		"VARIABLE");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:323:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:324:2: (iv_ruleOutput= ruleOutput EOF )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:325:2: iv_ruleOutput= ruleOutput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOutputRule()); 
            }
            pushFollow(FOLLOW_ruleOutput_in_entryRuleOutput616);
            iv_ruleOutput=ruleOutput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOutput; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutput626); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:332:1: ruleOutput returns [EObject current=null] : ( ( ( (lv_varOut_0_0= RULE_VARIABLE ) ) otherlv_1= ',' )* ( (lv_varOut_2_0= RULE_VARIABLE ) ) ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token lv_varOut_0_0=null;
        Token otherlv_1=null;
        Token lv_varOut_2_0=null;

         enterRule(); 
            
        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:335:28: ( ( ( ( (lv_varOut_0_0= RULE_VARIABLE ) ) otherlv_1= ',' )* ( (lv_varOut_2_0= RULE_VARIABLE ) ) ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:336:1: ( ( ( (lv_varOut_0_0= RULE_VARIABLE ) ) otherlv_1= ',' )* ( (lv_varOut_2_0= RULE_VARIABLE ) ) )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:336:1: ( ( ( (lv_varOut_0_0= RULE_VARIABLE ) ) otherlv_1= ',' )* ( (lv_varOut_2_0= RULE_VARIABLE ) ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:336:2: ( ( (lv_varOut_0_0= RULE_VARIABLE ) ) otherlv_1= ',' )* ( (lv_varOut_2_0= RULE_VARIABLE ) )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:336:2: ( ( (lv_varOut_0_0= RULE_VARIABLE ) ) otherlv_1= ',' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_VARIABLE) ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1==19) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:336:3: ( (lv_varOut_0_0= RULE_VARIABLE ) ) otherlv_1= ','
            	    {
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:336:3: ( (lv_varOut_0_0= RULE_VARIABLE ) )
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:337:1: (lv_varOut_0_0= RULE_VARIABLE )
            	    {
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:337:1: (lv_varOut_0_0= RULE_VARIABLE )
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:338:3: lv_varOut_0_0= RULE_VARIABLE
            	    {
            	    lv_varOut_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_ruleOutput669); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_varOut_0_0, grammarAccess.getOutputAccess().getVarOutVARIABLETerminalRuleCall_0_0_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getOutputRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"varOut",
            	              		lv_varOut_0_0, 
            	              		"VARIABLE");
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleOutput686); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getCommaKeyword_0_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:358:3: ( (lv_varOut_2_0= RULE_VARIABLE ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:359:1: (lv_varOut_2_0= RULE_VARIABLE )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:359:1: (lv_varOut_2_0= RULE_VARIABLE )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:360:3: lv_varOut_2_0= RULE_VARIABLE
            {
            lv_varOut_2_0=(Token)match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_ruleOutput705); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_varOut_2_0, grammarAccess.getOutputAccess().getVarOutVARIABLETerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getOutputRule());
              	        }
                     		addWithLastConsumed(
                     			current, 
                     			"varOut",
                      		lv_varOut_2_0, 
                      		"VARIABLE");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleVars"
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:384:1: entryRuleVars returns [EObject current=null] : iv_ruleVars= ruleVars EOF ;
    public final EObject entryRuleVars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVars = null;


        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:385:2: (iv_ruleVars= ruleVars EOF )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:386:2: iv_ruleVars= ruleVars EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarsRule()); 
            }
            pushFollow(FOLLOW_ruleVars_in_entryRuleVars746);
            iv_ruleVars=ruleVars();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVars; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVars756); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVars"


    // $ANTLR start "ruleVars"
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:393:1: ruleVars returns [EObject current=null] : ( ( ( (lv_varGen_0_0= RULE_VARIABLE ) ) otherlv_1= ',' )* ( (lv_varGen_2_0= RULE_VARIABLE ) ) ) ;
    public final EObject ruleVars() throws RecognitionException {
        EObject current = null;

        Token lv_varGen_0_0=null;
        Token otherlv_1=null;
        Token lv_varGen_2_0=null;

         enterRule(); 
            
        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:396:28: ( ( ( ( (lv_varGen_0_0= RULE_VARIABLE ) ) otherlv_1= ',' )* ( (lv_varGen_2_0= RULE_VARIABLE ) ) ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:397:1: ( ( ( (lv_varGen_0_0= RULE_VARIABLE ) ) otherlv_1= ',' )* ( (lv_varGen_2_0= RULE_VARIABLE ) ) )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:397:1: ( ( ( (lv_varGen_0_0= RULE_VARIABLE ) ) otherlv_1= ',' )* ( (lv_varGen_2_0= RULE_VARIABLE ) ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:397:2: ( ( (lv_varGen_0_0= RULE_VARIABLE ) ) otherlv_1= ',' )* ( (lv_varGen_2_0= RULE_VARIABLE ) )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:397:2: ( ( (lv_varGen_0_0= RULE_VARIABLE ) ) otherlv_1= ',' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_VARIABLE) ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1==19) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:397:3: ( (lv_varGen_0_0= RULE_VARIABLE ) ) otherlv_1= ','
            	    {
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:397:3: ( (lv_varGen_0_0= RULE_VARIABLE ) )
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:398:1: (lv_varGen_0_0= RULE_VARIABLE )
            	    {
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:398:1: (lv_varGen_0_0= RULE_VARIABLE )
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:399:3: lv_varGen_0_0= RULE_VARIABLE
            	    {
            	    lv_varGen_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_ruleVars799); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_varGen_0_0, grammarAccess.getVarsAccess().getVarGenVARIABLETerminalRuleCall_0_0_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getVarsRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"varGen",
            	              		lv_varGen_0_0, 
            	              		"VARIABLE");
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleVars816); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getVarsAccess().getCommaKeyword_0_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:419:3: ( (lv_varGen_2_0= RULE_VARIABLE ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:420:1: (lv_varGen_2_0= RULE_VARIABLE )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:420:1: (lv_varGen_2_0= RULE_VARIABLE )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:421:3: lv_varGen_2_0= RULE_VARIABLE
            {
            lv_varGen_2_0=(Token)match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_ruleVars835); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_varGen_2_0, grammarAccess.getVarsAccess().getVarGenVARIABLETerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVarsRule());
              	        }
                     		addWithLastConsumed(
                     			current, 
                     			"varGen",
                      		lv_varGen_2_0, 
                      		"VARIABLE");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVars"


    // $ANTLR start "entryRuleCommands"
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:445:1: entryRuleCommands returns [EObject current=null] : iv_ruleCommands= ruleCommands EOF ;
    public final EObject entryRuleCommands() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommands = null;


        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:446:2: (iv_ruleCommands= ruleCommands EOF )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:447:2: iv_ruleCommands= ruleCommands EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandsRule()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_entryRuleCommands876);
            iv_ruleCommands=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommands; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommands886); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommands"


    // $ANTLR start "ruleCommands"
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:454:1: ruleCommands returns [EObject current=null] : ( (lv_commande_0_0= ruleCommand ) )+ ;
    public final EObject ruleCommands() throws RecognitionException {
        EObject current = null;

        EObject lv_commande_0_0 = null;


         enterRule(); 
            
        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:457:28: ( ( (lv_commande_0_0= ruleCommand ) )+ )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:458:1: ( (lv_commande_0_0= ruleCommand ) )+
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:458:1: ( (lv_commande_0_0= ruleCommand ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_VARIABLE||LA5_0==20||(LA5_0>=23 && LA5_0<=24)||LA5_0==27||LA5_0==31) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:459:1: (lv_commande_0_0= ruleCommand )
            	    {
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:459:1: (lv_commande_0_0= ruleCommand )
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:460:3: lv_commande_0_0= ruleCommand
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCommandsAccess().getCommandeCommandParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCommand_in_ruleCommands931);
            	    lv_commande_0_0=ruleCommand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCommandsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"commande",
            	              		lv_commande_0_0, 
            	              		"Command");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommands"


    // $ANTLR start "entryRuleCommand"
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:484:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:485:2: (iv_ruleCommand= ruleCommand EOF )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:486:2: iv_ruleCommand= ruleCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandRule()); 
            }
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand967);
            iv_ruleCommand=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand977); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:493:1: ruleCommand returns [EObject current=null] : ( ( ( (lv_nop_0_0= 'nop' ) ) otherlv_1= ';' ) | ( ( (lv_vars_2_0= ruleVars ) ) otherlv_3= ':=' ( ( ( ( ( ruleExpr ) ) ',' ) )=> (lv_exprs_4_0= ruleExprs ) ) otherlv_5= ';' ) | ( (lv_cmdWhile_6_0= ruleCommandWhile ) ) | ( (lv_cmdIf_7_0= ruleCommandIf ) ) | ( (lv_cmdForEach_8_0= ruleCommandForEach ) ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token lv_nop_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_vars_2_0 = null;

        EObject lv_exprs_4_0 = null;

        EObject lv_cmdWhile_6_0 = null;

        EObject lv_cmdIf_7_0 = null;

        EObject lv_cmdForEach_8_0 = null;


         enterRule(); 
            
        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:496:28: ( ( ( ( (lv_nop_0_0= 'nop' ) ) otherlv_1= ';' ) | ( ( (lv_vars_2_0= ruleVars ) ) otherlv_3= ':=' ( ( ( ( ( ruleExpr ) ) ',' ) )=> (lv_exprs_4_0= ruleExprs ) ) otherlv_5= ';' ) | ( (lv_cmdWhile_6_0= ruleCommandWhile ) ) | ( (lv_cmdIf_7_0= ruleCommandIf ) ) | ( (lv_cmdForEach_8_0= ruleCommandForEach ) ) ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:497:1: ( ( ( (lv_nop_0_0= 'nop' ) ) otherlv_1= ';' ) | ( ( (lv_vars_2_0= ruleVars ) ) otherlv_3= ':=' ( ( ( ( ( ruleExpr ) ) ',' ) )=> (lv_exprs_4_0= ruleExprs ) ) otherlv_5= ';' ) | ( (lv_cmdWhile_6_0= ruleCommandWhile ) ) | ( (lv_cmdIf_7_0= ruleCommandIf ) ) | ( (lv_cmdForEach_8_0= ruleCommandForEach ) ) )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:497:1: ( ( ( (lv_nop_0_0= 'nop' ) ) otherlv_1= ';' ) | ( ( (lv_vars_2_0= ruleVars ) ) otherlv_3= ':=' ( ( ( ( ( ruleExpr ) ) ',' ) )=> (lv_exprs_4_0= ruleExprs ) ) otherlv_5= ';' ) | ( (lv_cmdWhile_6_0= ruleCommandWhile ) ) | ( (lv_cmdIf_7_0= ruleCommandIf ) ) | ( (lv_cmdForEach_8_0= ruleCommandForEach ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt6=1;
                }
                break;
            case RULE_VARIABLE:
                {
                alt6=2;
                }
                break;
            case 23:
            case 24:
                {
                alt6=3;
                }
                break;
            case 27:
                {
                alt6=4;
                }
                break;
            case 31:
                {
                alt6=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:497:2: ( ( (lv_nop_0_0= 'nop' ) ) otherlv_1= ';' )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:497:2: ( ( (lv_nop_0_0= 'nop' ) ) otherlv_1= ';' )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:497:3: ( (lv_nop_0_0= 'nop' ) ) otherlv_1= ';'
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:497:3: ( (lv_nop_0_0= 'nop' ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:498:1: (lv_nop_0_0= 'nop' )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:498:1: (lv_nop_0_0= 'nop' )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:499:3: lv_nop_0_0= 'nop'
                    {
                    lv_nop_0_0=(Token)match(input,20,FOLLOW_20_in_ruleCommand1021); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_nop_0_0, grammarAccess.getCommandAccess().getNopNopKeyword_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCommandRule());
                      	        }
                             		setWithLastConsumed(current, "nop", lv_nop_0_0, "nop");
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleCommand1046); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getCommandAccess().getSemicolonKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:517:6: ( ( (lv_vars_2_0= ruleVars ) ) otherlv_3= ':=' ( ( ( ( ( ruleExpr ) ) ',' ) )=> (lv_exprs_4_0= ruleExprs ) ) otherlv_5= ';' )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:517:6: ( ( (lv_vars_2_0= ruleVars ) ) otherlv_3= ':=' ( ( ( ( ( ruleExpr ) ) ',' ) )=> (lv_exprs_4_0= ruleExprs ) ) otherlv_5= ';' )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:517:7: ( (lv_vars_2_0= ruleVars ) ) otherlv_3= ':=' ( ( ( ( ( ruleExpr ) ) ',' ) )=> (lv_exprs_4_0= ruleExprs ) ) otherlv_5= ';'
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:517:7: ( (lv_vars_2_0= ruleVars ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:518:1: (lv_vars_2_0= ruleVars )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:518:1: (lv_vars_2_0= ruleVars )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:519:3: lv_vars_2_0= ruleVars
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandAccess().getVarsVarsParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVars_in_ruleCommand1075);
                    lv_vars_2_0=ruleVars();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandRule());
                      	        }
                             		set(
                             			current, 
                             			"vars",
                              		lv_vars_2_0, 
                              		"Vars");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleCommand1087); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getCommandAccess().getColonEqualsSignKeyword_1_1());
                          
                    }
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:539:1: ( ( ( ( ( ruleExpr ) ) ',' ) )=> (lv_exprs_4_0= ruleExprs ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:539:2: ( ( ( ( ruleExpr ) ) ',' ) )=> (lv_exprs_4_0= ruleExprs )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:545:1: (lv_exprs_4_0= ruleExprs )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:546:3: lv_exprs_4_0= ruleExprs
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandAccess().getExprsExprsParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExprs_in_ruleCommand1126);
                    lv_exprs_4_0=ruleExprs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandRule());
                      	        }
                             		set(
                             			current, 
                             			"exprs",
                              		lv_exprs_4_0, 
                              		"Exprs");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleCommand1138); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getCommandAccess().getSemicolonKeyword_1_3());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:567:6: ( (lv_cmdWhile_6_0= ruleCommandWhile ) )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:567:6: ( (lv_cmdWhile_6_0= ruleCommandWhile ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:568:1: (lv_cmdWhile_6_0= ruleCommandWhile )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:568:1: (lv_cmdWhile_6_0= ruleCommandWhile )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:569:3: lv_cmdWhile_6_0= ruleCommandWhile
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandAccess().getCmdWhileCommandWhileParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCommandWhile_in_ruleCommand1166);
                    lv_cmdWhile_6_0=ruleCommandWhile();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandRule());
                      	        }
                             		set(
                             			current, 
                             			"cmdWhile",
                              		lv_cmdWhile_6_0, 
                              		"CommandWhile");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:586:6: ( (lv_cmdIf_7_0= ruleCommandIf ) )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:586:6: ( (lv_cmdIf_7_0= ruleCommandIf ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:587:1: (lv_cmdIf_7_0= ruleCommandIf )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:587:1: (lv_cmdIf_7_0= ruleCommandIf )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:588:3: lv_cmdIf_7_0= ruleCommandIf
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandAccess().getCmdIfCommandIfParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCommandIf_in_ruleCommand1193);
                    lv_cmdIf_7_0=ruleCommandIf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandRule());
                      	        }
                             		set(
                             			current, 
                             			"cmdIf",
                              		lv_cmdIf_7_0, 
                              		"CommandIf");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:605:6: ( (lv_cmdForEach_8_0= ruleCommandForEach ) )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:605:6: ( (lv_cmdForEach_8_0= ruleCommandForEach ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:606:1: (lv_cmdForEach_8_0= ruleCommandForEach )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:606:1: (lv_cmdForEach_8_0= ruleCommandForEach )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:607:3: lv_cmdForEach_8_0= ruleCommandForEach
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandAccess().getCmdForEachCommandForEachParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCommandForEach_in_ruleCommand1220);
                    lv_cmdForEach_8_0=ruleCommandForEach();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandRule());
                      	        }
                             		set(
                             			current, 
                             			"cmdForEach",
                              		lv_cmdForEach_8_0, 
                              		"CommandForEach");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleCommandWhile"
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:631:1: entryRuleCommandWhile returns [EObject current=null] : iv_ruleCommandWhile= ruleCommandWhile EOF ;
    public final EObject entryRuleCommandWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandWhile = null;


        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:632:2: (iv_ruleCommandWhile= ruleCommandWhile EOF )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:633:2: iv_ruleCommandWhile= ruleCommandWhile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandWhileRule()); 
            }
            pushFollow(FOLLOW_ruleCommandWhile_in_entryRuleCommandWhile1256);
            iv_ruleCommandWhile=ruleCommandWhile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommandWhile; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommandWhile1266); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommandWhile"


    // $ANTLR start "ruleCommandWhile"
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:640:1: ruleCommandWhile returns [EObject current=null] : ( ( ( (lv_w_0_0= 'while' ) ) | otherlv_1= 'for' ) ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= 'do' ( (lv_cmds_4_0= ruleCommands ) ) otherlv_5= 'od' ) ;
    public final EObject ruleCommandWhile() throws RecognitionException {
        EObject current = null;

        Token lv_w_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expr_2_0 = null;

        EObject lv_cmds_4_0 = null;


         enterRule(); 
            
        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:643:28: ( ( ( ( (lv_w_0_0= 'while' ) ) | otherlv_1= 'for' ) ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= 'do' ( (lv_cmds_4_0= ruleCommands ) ) otherlv_5= 'od' ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:644:1: ( ( ( (lv_w_0_0= 'while' ) ) | otherlv_1= 'for' ) ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= 'do' ( (lv_cmds_4_0= ruleCommands ) ) otherlv_5= 'od' )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:644:1: ( ( ( (lv_w_0_0= 'while' ) ) | otherlv_1= 'for' ) ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= 'do' ( (lv_cmds_4_0= ruleCommands ) ) otherlv_5= 'od' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:644:2: ( ( (lv_w_0_0= 'while' ) ) | otherlv_1= 'for' ) ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= 'do' ( (lv_cmds_4_0= ruleCommands ) ) otherlv_5= 'od'
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:644:2: ( ( (lv_w_0_0= 'while' ) ) | otherlv_1= 'for' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            else if ( (LA7_0==24) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:644:3: ( (lv_w_0_0= 'while' ) )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:644:3: ( (lv_w_0_0= 'while' ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:645:1: (lv_w_0_0= 'while' )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:645:1: (lv_w_0_0= 'while' )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:646:3: lv_w_0_0= 'while'
                    {
                    lv_w_0_0=(Token)match(input,23,FOLLOW_23_in_ruleCommandWhile1310); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_w_0_0, grammarAccess.getCommandWhileAccess().getWWhileKeyword_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCommandWhileRule());
                      	        }
                             		setWithLastConsumed(current, "w", lv_w_0_0, "while");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:660:7: otherlv_1= 'for'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleCommandWhile1341); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getCommandWhileAccess().getForKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:664:2: ( (lv_expr_2_0= ruleExpr ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:665:1: (lv_expr_2_0= ruleExpr )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:665:1: (lv_expr_2_0= ruleExpr )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:666:3: lv_expr_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommandWhileAccess().getExprExprParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleCommandWhile1363);
            lv_expr_2_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCommandWhileRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_2_0, 
                      		"Expr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleCommandWhile1375); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCommandWhileAccess().getDoKeyword_2());
                  
            }
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:686:1: ( (lv_cmds_4_0= ruleCommands ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:687:1: (lv_cmds_4_0= ruleCommands )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:687:1: (lv_cmds_4_0= ruleCommands )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:688:3: lv_cmds_4_0= ruleCommands
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommandWhileAccess().getCmdsCommandsParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommands_in_ruleCommandWhile1396);
            lv_cmds_4_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCommandWhileRule());
              	        }
                     		set(
                     			current, 
                     			"cmds",
                      		lv_cmds_4_0, 
                      		"Commands");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleCommandWhile1408); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCommandWhileAccess().getOdKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommandWhile"


    // $ANTLR start "entryRuleCommandIf"
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:716:1: entryRuleCommandIf returns [EObject current=null] : iv_ruleCommandIf= ruleCommandIf EOF ;
    public final EObject entryRuleCommandIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandIf = null;


        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:717:2: (iv_ruleCommandIf= ruleCommandIf EOF )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:718:2: iv_ruleCommandIf= ruleCommandIf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandIfRule()); 
            }
            pushFollow(FOLLOW_ruleCommandIf_in_entryRuleCommandIf1444);
            iv_ruleCommandIf=ruleCommandIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommandIf; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommandIf1454); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommandIf"


    // $ANTLR start "ruleCommandIf"
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:725:1: ruleCommandIf returns [EObject current=null] : (otherlv_0= 'if' ( (lv_cond_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_cmdsThen_3_0= ruleCommands ) ) (otherlv_4= 'else' ( (lv_cmdsElse_5_0= ruleCommands ) ) )? otherlv_6= 'fi' ) ;
    public final EObject ruleCommandIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_cond_1_0 = null;

        EObject lv_cmdsThen_3_0 = null;

        EObject lv_cmdsElse_5_0 = null;


         enterRule(); 
            
        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:728:28: ( (otherlv_0= 'if' ( (lv_cond_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_cmdsThen_3_0= ruleCommands ) ) (otherlv_4= 'else' ( (lv_cmdsElse_5_0= ruleCommands ) ) )? otherlv_6= 'fi' ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:729:1: (otherlv_0= 'if' ( (lv_cond_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_cmdsThen_3_0= ruleCommands ) ) (otherlv_4= 'else' ( (lv_cmdsElse_5_0= ruleCommands ) ) )? otherlv_6= 'fi' )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:729:1: (otherlv_0= 'if' ( (lv_cond_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_cmdsThen_3_0= ruleCommands ) ) (otherlv_4= 'else' ( (lv_cmdsElse_5_0= ruleCommands ) ) )? otherlv_6= 'fi' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:729:3: otherlv_0= 'if' ( (lv_cond_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_cmdsThen_3_0= ruleCommands ) ) (otherlv_4= 'else' ( (lv_cmdsElse_5_0= ruleCommands ) ) )? otherlv_6= 'fi'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleCommandIf1491); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCommandIfAccess().getIfKeyword_0());
                  
            }
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:733:1: ( (lv_cond_1_0= ruleExpr ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:734:1: (lv_cond_1_0= ruleExpr )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:734:1: (lv_cond_1_0= ruleExpr )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:735:3: lv_cond_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommandIfAccess().getCondExprParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleCommandIf1512);
            lv_cond_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCommandIfRule());
              	        }
                     		set(
                     			current, 
                     			"cond",
                      		lv_cond_1_0, 
                      		"Expr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleCommandIf1524); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCommandIfAccess().getThenKeyword_2());
                  
            }
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:755:1: ( (lv_cmdsThen_3_0= ruleCommands ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:756:1: (lv_cmdsThen_3_0= ruleCommands )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:756:1: (lv_cmdsThen_3_0= ruleCommands )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:757:3: lv_cmdsThen_3_0= ruleCommands
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommandIfAccess().getCmdsThenCommandsParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommands_in_ruleCommandIf1545);
            lv_cmdsThen_3_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCommandIfRule());
              	        }
                     		set(
                     			current, 
                     			"cmdsThen",
                      		lv_cmdsThen_3_0, 
                      		"Commands");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:773:2: (otherlv_4= 'else' ( (lv_cmdsElse_5_0= ruleCommands ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:773:4: otherlv_4= 'else' ( (lv_cmdsElse_5_0= ruleCommands ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleCommandIf1558); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getCommandIfAccess().getElseKeyword_4_0());
                          
                    }
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:777:1: ( (lv_cmdsElse_5_0= ruleCommands ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:778:1: (lv_cmdsElse_5_0= ruleCommands )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:778:1: (lv_cmdsElse_5_0= ruleCommands )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:779:3: lv_cmdsElse_5_0= ruleCommands
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandIfAccess().getCmdsElseCommandsParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCommands_in_ruleCommandIf1579);
                    lv_cmdsElse_5_0=ruleCommands();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandIfRule());
                      	        }
                             		set(
                             			current, 
                             			"cmdsElse",
                              		lv_cmdsElse_5_0, 
                              		"Commands");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleCommandIf1593); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getCommandIfAccess().getFiKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommandIf"


    // $ANTLR start "entryRuleCommandForEach"
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:807:1: entryRuleCommandForEach returns [EObject current=null] : iv_ruleCommandForEach= ruleCommandForEach EOF ;
    public final EObject entryRuleCommandForEach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandForEach = null;


        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:808:2: (iv_ruleCommandForEach= ruleCommandForEach EOF )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:809:2: iv_ruleCommandForEach= ruleCommandForEach EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandForEachRule()); 
            }
            pushFollow(FOLLOW_ruleCommandForEach_in_entryRuleCommandForEach1629);
            iv_ruleCommandForEach=ruleCommandForEach();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommandForEach; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommandForEach1639); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommandForEach"


    // $ANTLR start "ruleCommandForEach"
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:816:1: ruleCommandForEach returns [EObject current=null] : (otherlv_0= 'foreach' ( (lv_elem_1_0= ruleExpr ) ) otherlv_2= 'in' ( (lv_ensemb_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_cmds_5_0= ruleCommands ) ) otherlv_6= 'od' ) ;
    public final EObject ruleCommandForEach() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_elem_1_0 = null;

        EObject lv_ensemb_3_0 = null;

        EObject lv_cmds_5_0 = null;


         enterRule(); 
            
        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:819:28: ( (otherlv_0= 'foreach' ( (lv_elem_1_0= ruleExpr ) ) otherlv_2= 'in' ( (lv_ensemb_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_cmds_5_0= ruleCommands ) ) otherlv_6= 'od' ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:820:1: (otherlv_0= 'foreach' ( (lv_elem_1_0= ruleExpr ) ) otherlv_2= 'in' ( (lv_ensemb_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_cmds_5_0= ruleCommands ) ) otherlv_6= 'od' )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:820:1: (otherlv_0= 'foreach' ( (lv_elem_1_0= ruleExpr ) ) otherlv_2= 'in' ( (lv_ensemb_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_cmds_5_0= ruleCommands ) ) otherlv_6= 'od' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:820:3: otherlv_0= 'foreach' ( (lv_elem_1_0= ruleExpr ) ) otherlv_2= 'in' ( (lv_ensemb_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_cmds_5_0= ruleCommands ) ) otherlv_6= 'od'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleCommandForEach1676); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCommandForEachAccess().getForeachKeyword_0());
                  
            }
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:824:1: ( (lv_elem_1_0= ruleExpr ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:825:1: (lv_elem_1_0= ruleExpr )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:825:1: (lv_elem_1_0= ruleExpr )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:826:3: lv_elem_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommandForEachAccess().getElemExprParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleCommandForEach1697);
            lv_elem_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCommandForEachRule());
              	        }
                     		set(
                     			current, 
                     			"elem",
                      		lv_elem_1_0, 
                      		"Expr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleCommandForEach1709); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCommandForEachAccess().getInKeyword_2());
                  
            }
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:846:1: ( (lv_ensemb_3_0= ruleExpr ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:847:1: (lv_ensemb_3_0= ruleExpr )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:847:1: (lv_ensemb_3_0= ruleExpr )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:848:3: lv_ensemb_3_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommandForEachAccess().getEnsembExprParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleCommandForEach1730);
            lv_ensemb_3_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCommandForEachRule());
              	        }
                     		set(
                     			current, 
                     			"ensemb",
                      		lv_ensemb_3_0, 
                      		"Expr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleCommandForEach1742); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getCommandForEachAccess().getDoKeyword_4());
                  
            }
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:868:1: ( (lv_cmds_5_0= ruleCommands ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:869:1: (lv_cmds_5_0= ruleCommands )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:869:1: (lv_cmds_5_0= ruleCommands )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:870:3: lv_cmds_5_0= ruleCommands
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommandForEachAccess().getCmdsCommandsParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommands_in_ruleCommandForEach1763);
            lv_cmds_5_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCommandForEachRule());
              	        }
                     		set(
                     			current, 
                     			"cmds",
                      		lv_cmds_5_0, 
                      		"Commands");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleCommandForEach1775); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getCommandForEachAccess().getOdKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommandForEach"


    // $ANTLR start "entryRuleExprs"
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:898:1: entryRuleExprs returns [EObject current=null] : iv_ruleExprs= ruleExprs EOF ;
    public final EObject entryRuleExprs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprs = null;


        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:899:2: (iv_ruleExprs= ruleExprs EOF )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:900:2: iv_ruleExprs= ruleExprs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprsRule()); 
            }
            pushFollow(FOLLOW_ruleExprs_in_entryRuleExprs1811);
            iv_ruleExprs=ruleExprs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprs; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprs1821); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprs"


    // $ANTLR start "ruleExprs"
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:907:1: ruleExprs returns [EObject current=null] : ( ( ( ( ( ( ruleExpr ) ) ',' ) )=> ( ( (lv_expGen_0_0= ruleExpr ) ) otherlv_1= ',' ) )* ( (lv_expGen_2_0= ruleExpr ) ) ) ;
    public final EObject ruleExprs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expGen_0_0 = null;

        EObject lv_expGen_2_0 = null;


         enterRule(); 
            
        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:910:28: ( ( ( ( ( ( ( ruleExpr ) ) ',' ) )=> ( ( (lv_expGen_0_0= ruleExpr ) ) otherlv_1= ',' ) )* ( (lv_expGen_2_0= ruleExpr ) ) ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:911:1: ( ( ( ( ( ( ruleExpr ) ) ',' ) )=> ( ( (lv_expGen_0_0= ruleExpr ) ) otherlv_1= ',' ) )* ( (lv_expGen_2_0= ruleExpr ) ) )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:911:1: ( ( ( ( ( ( ruleExpr ) ) ',' ) )=> ( ( (lv_expGen_0_0= ruleExpr ) ) otherlv_1= ',' ) )* ( (lv_expGen_2_0= ruleExpr ) ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:911:2: ( ( ( ( ( ruleExpr ) ) ',' ) )=> ( ( (lv_expGen_0_0= ruleExpr ) ) otherlv_1= ',' ) )* ( (lv_expGen_2_0= ruleExpr ) )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:911:2: ( ( ( ( ( ruleExpr ) ) ',' ) )=> ( ( (lv_expGen_0_0= ruleExpr ) ) otherlv_1= ',' ) )*
            loop9:
            do {
                int alt9=2;
                switch ( input.LA(1) ) {
                case 33:
                    {
                    int LA9_1 = input.LA(2);

                    if ( (synpred2_InternalWhileCpp()) ) {
                        alt9=1;
                    }


                    }
                    break;
                case RULE_VARIABLE:
                    {
                    int LA9_2 = input.LA(2);

                    if ( (synpred2_InternalWhileCpp()) ) {
                        alt9=1;
                    }


                    }
                    break;
                case RULE_SYMBOL:
                    {
                    int LA9_3 = input.LA(2);

                    if ( (synpred2_InternalWhileCpp()) ) {
                        alt9=1;
                    }


                    }
                    break;
                case 34:
                    {
                    int LA9_4 = input.LA(2);

                    if ( (synpred2_InternalWhileCpp()) ) {
                        alt9=1;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA9_5 = input.LA(2);

                    if ( (synpred2_InternalWhileCpp()) ) {
                        alt9=1;
                    }


                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:911:3: ( ( ( ( ruleExpr ) ) ',' ) )=> ( ( (lv_expGen_0_0= ruleExpr ) ) otherlv_1= ',' )
            	    {
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:916:5: ( ( (lv_expGen_0_0= ruleExpr ) ) otherlv_1= ',' )
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:916:6: ( (lv_expGen_0_0= ruleExpr ) ) otherlv_1= ','
            	    {
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:916:6: ( (lv_expGen_0_0= ruleExpr ) )
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:917:1: (lv_expGen_0_0= ruleExpr )
            	    {
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:917:1: (lv_expGen_0_0= ruleExpr )
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:918:3: lv_expGen_0_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprsAccess().getExpGenExprParserRuleCall_0_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpr_in_ruleExprs1887);
            	    lv_expGen_0_0=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExprsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expGen",
            	              		lv_expGen_0_0, 
            	              		"Expr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleExprs1899); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getExprsAccess().getCommaKeyword_0_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:938:4: ( (lv_expGen_2_0= ruleExpr ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:939:1: (lv_expGen_2_0= ruleExpr )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:939:1: (lv_expGen_2_0= ruleExpr )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:940:3: lv_expGen_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExprsAccess().getExpGenExprParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleExprs1923);
            lv_expGen_2_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExprsRule());
              	        }
                     		add(
                     			current, 
                     			"expGen",
                      		lv_expGen_2_0, 
                      		"Expr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprs"


    // $ANTLR start "entryRuleExpr"
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:964:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:965:2: (iv_ruleExpr= ruleExpr EOF )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:966:2: iv_ruleExpr= ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr1959);
            iv_ruleExpr=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr1969); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:973:1: ruleExpr returns [EObject current=null] : ( ( ( ( ( ruleExprSimple ) ) )=> ( (lv_exprSimp_0_0= ruleExprSimple ) ) ) | ( (lv_exprAnd_1_0= ruleExprAnd ) ) ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_exprSimp_0_0 = null;

        EObject lv_exprAnd_1_0 = null;


         enterRule(); 
            
        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:976:28: ( ( ( ( ( ( ruleExprSimple ) ) )=> ( (lv_exprSimp_0_0= ruleExprSimple ) ) ) | ( (lv_exprAnd_1_0= ruleExprAnd ) ) ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:977:1: ( ( ( ( ( ruleExprSimple ) ) )=> ( (lv_exprSimp_0_0= ruleExprSimple ) ) ) | ( (lv_exprAnd_1_0= ruleExprAnd ) ) )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:977:1: ( ( ( ( ( ruleExprSimple ) ) )=> ( (lv_exprSimp_0_0= ruleExprSimple ) ) ) | ( (lv_exprAnd_1_0= ruleExprAnd ) ) )
            int alt10=2;
            switch ( input.LA(1) ) {
            case 33:
                {
                int LA10_1 = input.LA(2);

                if ( (synpred3_InternalWhileCpp()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_VARIABLE:
                {
                int LA10_2 = input.LA(2);

                if ( (synpred3_InternalWhileCpp()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_SYMBOL:
                {
                int LA10_3 = input.LA(2);

                if ( (synpred3_InternalWhileCpp()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 3, input);

                    throw nvae;
                }
                }
                break;
            case 34:
                {
                int LA10_4 = input.LA(2);

                if ( (synpred3_InternalWhileCpp()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 4, input);

                    throw nvae;
                }
                }
                break;
            case 42:
                {
                alt10=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:977:2: ( ( ( ( ruleExprSimple ) ) )=> ( (lv_exprSimp_0_0= ruleExprSimple ) ) )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:977:2: ( ( ( ( ruleExprSimple ) ) )=> ( (lv_exprSimp_0_0= ruleExprSimple ) ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:977:3: ( ( ( ruleExprSimple ) ) )=> ( (lv_exprSimp_0_0= ruleExprSimple ) )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:981:5: ( (lv_exprSimp_0_0= ruleExprSimple ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:982:1: (lv_exprSimp_0_0= ruleExprSimple )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:982:1: (lv_exprSimp_0_0= ruleExprSimple )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:983:3: lv_exprSimp_0_0= ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprAccess().getExprSimpExprSimpleParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExprSimple_in_ruleExpr2028);
                    lv_exprSimp_0_0=ruleExprSimple();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprRule());
                      	        }
                             		set(
                             			current, 
                             			"exprSimp",
                              		lv_exprSimp_0_0, 
                              		"ExprSimple");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1000:6: ( (lv_exprAnd_1_0= ruleExprAnd ) )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1000:6: ( (lv_exprAnd_1_0= ruleExprAnd ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1001:1: (lv_exprAnd_1_0= ruleExprAnd )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1001:1: (lv_exprAnd_1_0= ruleExprAnd )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1002:3: lv_exprAnd_1_0= ruleExprAnd
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprAccess().getExprAndExprAndParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExprAnd_in_ruleExpr2056);
                    lv_exprAnd_1_0=ruleExprAnd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprRule());
                      	        }
                             		set(
                             			current, 
                             			"exprAnd",
                              		lv_exprAnd_1_0, 
                              		"ExprAnd");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleExprSimple"
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1026:1: entryRuleExprSimple returns [EObject current=null] : iv_ruleExprSimple= ruleExprSimple EOF ;
    public final EObject entryRuleExprSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprSimple = null;


        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1027:2: (iv_ruleExprSimple= ruleExprSimple EOF )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1028:2: iv_ruleExprSimple= ruleExprSimple EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprSimpleRule()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_entryRuleExprSimple2092);
            iv_ruleExprSimple=ruleExprSimple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprSimple; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprSimple2102); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprSimple"


    // $ANTLR start "ruleExprSimple"
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1035:1: ruleExprSimple returns [EObject current=null] : ( ( ( (lv_nil_0_0= 'nil' ) ) | ( (lv_vari_1_0= RULE_VARIABLE ) ) | ( (lv_symb_2_0= RULE_SYMBOL ) ) ) | (otherlv_3= '(' ( (lv_exprCons_4_0= 'cons' ) ) ( (lv_exprConsAtt_5_0= ruleExpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_exprList_8_0= 'list' ) ) ( (lv_exprListAtt_9_0= ruleExpr ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_exprHead_12_0= 'hd' ) ) ( (lv_exprHeadAtt_13_0= ruleExpr ) ) otherlv_14= ')' ) | (otherlv_15= '(' ( (lv_exprTail_16_0= 'tl' ) ) ( (lv_exprTailAtt_17_0= ruleExpr ) ) otherlv_18= ')' ) | (otherlv_19= '(' ( (lv_nomSymb_20_0= RULE_SYMBOL ) ) ( (lv_symbAtt_21_0= ruleExpr ) ) otherlv_22= ')' ) ) ;
    public final EObject ruleExprSimple() throws RecognitionException {
        EObject current = null;

        Token lv_nil_0_0=null;
        Token lv_vari_1_0=null;
        Token lv_symb_2_0=null;
        Token otherlv_3=null;
        Token lv_exprCons_4_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_exprList_8_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_exprHead_12_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_exprTail_16_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_nomSymb_20_0=null;
        Token otherlv_22=null;
        EObject lv_exprConsAtt_5_0 = null;

        EObject lv_exprListAtt_9_0 = null;

        EObject lv_exprHeadAtt_13_0 = null;

        EObject lv_exprTailAtt_17_0 = null;

        EObject lv_symbAtt_21_0 = null;


         enterRule(); 
            
        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1038:28: ( ( ( ( (lv_nil_0_0= 'nil' ) ) | ( (lv_vari_1_0= RULE_VARIABLE ) ) | ( (lv_symb_2_0= RULE_SYMBOL ) ) ) | (otherlv_3= '(' ( (lv_exprCons_4_0= 'cons' ) ) ( (lv_exprConsAtt_5_0= ruleExpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_exprList_8_0= 'list' ) ) ( (lv_exprListAtt_9_0= ruleExpr ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_exprHead_12_0= 'hd' ) ) ( (lv_exprHeadAtt_13_0= ruleExpr ) ) otherlv_14= ')' ) | (otherlv_15= '(' ( (lv_exprTail_16_0= 'tl' ) ) ( (lv_exprTailAtt_17_0= ruleExpr ) ) otherlv_18= ')' ) | (otherlv_19= '(' ( (lv_nomSymb_20_0= RULE_SYMBOL ) ) ( (lv_symbAtt_21_0= ruleExpr ) ) otherlv_22= ')' ) ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1039:1: ( ( ( (lv_nil_0_0= 'nil' ) ) | ( (lv_vari_1_0= RULE_VARIABLE ) ) | ( (lv_symb_2_0= RULE_SYMBOL ) ) ) | (otherlv_3= '(' ( (lv_exprCons_4_0= 'cons' ) ) ( (lv_exprConsAtt_5_0= ruleExpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_exprList_8_0= 'list' ) ) ( (lv_exprListAtt_9_0= ruleExpr ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_exprHead_12_0= 'hd' ) ) ( (lv_exprHeadAtt_13_0= ruleExpr ) ) otherlv_14= ')' ) | (otherlv_15= '(' ( (lv_exprTail_16_0= 'tl' ) ) ( (lv_exprTailAtt_17_0= ruleExpr ) ) otherlv_18= ')' ) | (otherlv_19= '(' ( (lv_nomSymb_20_0= RULE_SYMBOL ) ) ( (lv_symbAtt_21_0= ruleExpr ) ) otherlv_22= ')' ) )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1039:1: ( ( ( (lv_nil_0_0= 'nil' ) ) | ( (lv_vari_1_0= RULE_VARIABLE ) ) | ( (lv_symb_2_0= RULE_SYMBOL ) ) ) | (otherlv_3= '(' ( (lv_exprCons_4_0= 'cons' ) ) ( (lv_exprConsAtt_5_0= ruleExpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_exprList_8_0= 'list' ) ) ( (lv_exprListAtt_9_0= ruleExpr ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_exprHead_12_0= 'hd' ) ) ( (lv_exprHeadAtt_13_0= ruleExpr ) ) otherlv_14= ')' ) | (otherlv_15= '(' ( (lv_exprTail_16_0= 'tl' ) ) ( (lv_exprTailAtt_17_0= ruleExpr ) ) otherlv_18= ')' ) | (otherlv_19= '(' ( (lv_nomSymb_20_0= RULE_SYMBOL ) ) ( (lv_symbAtt_21_0= ruleExpr ) ) otherlv_22= ')' ) )
            int alt12=6;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_SYMBOL && LA12_0<=RULE_VARIABLE)||LA12_0==33) ) {
                alt12=1;
            }
            else if ( (LA12_0==34) ) {
                switch ( input.LA(2) ) {
                case 37:
                    {
                    alt12=3;
                    }
                    break;
                case RULE_SYMBOL:
                    {
                    alt12=6;
                    }
                    break;
                case 35:
                    {
                    alt12=2;
                    }
                    break;
                case 39:
                    {
                    alt12=5;
                    }
                    break;
                case 38:
                    {
                    alt12=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1039:2: ( ( (lv_nil_0_0= 'nil' ) ) | ( (lv_vari_1_0= RULE_VARIABLE ) ) | ( (lv_symb_2_0= RULE_SYMBOL ) ) )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1039:2: ( ( (lv_nil_0_0= 'nil' ) ) | ( (lv_vari_1_0= RULE_VARIABLE ) ) | ( (lv_symb_2_0= RULE_SYMBOL ) ) )
                    int alt11=3;
                    switch ( input.LA(1) ) {
                    case 33:
                        {
                        alt11=1;
                        }
                        break;
                    case RULE_VARIABLE:
                        {
                        alt11=2;
                        }
                        break;
                    case RULE_SYMBOL:
                        {
                        alt11=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }

                    switch (alt11) {
                        case 1 :
                            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1039:3: ( (lv_nil_0_0= 'nil' ) )
                            {
                            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1039:3: ( (lv_nil_0_0= 'nil' ) )
                            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1040:1: (lv_nil_0_0= 'nil' )
                            {
                            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1040:1: (lv_nil_0_0= 'nil' )
                            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1041:3: lv_nil_0_0= 'nil'
                            {
                            lv_nil_0_0=(Token)match(input,33,FOLLOW_33_in_ruleExprSimple2146); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_nil_0_0, grammarAccess.getExprSimpleAccess().getNilNilKeyword_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExprSimpleRule());
                              	        }
                                     		setWithLastConsumed(current, "nil", lv_nil_0_0, "nil");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1055:6: ( (lv_vari_1_0= RULE_VARIABLE ) )
                            {
                            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1055:6: ( (lv_vari_1_0= RULE_VARIABLE ) )
                            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1056:1: (lv_vari_1_0= RULE_VARIABLE )
                            {
                            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1056:1: (lv_vari_1_0= RULE_VARIABLE )
                            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1057:3: lv_vari_1_0= RULE_VARIABLE
                            {
                            lv_vari_1_0=(Token)match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_ruleExprSimple2182); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_vari_1_0, grammarAccess.getExprSimpleAccess().getVariVARIABLETerminalRuleCall_0_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExprSimpleRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"vari",
                                      		lv_vari_1_0, 
                                      		"VARIABLE");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1074:6: ( (lv_symb_2_0= RULE_SYMBOL ) )
                            {
                            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1074:6: ( (lv_symb_2_0= RULE_SYMBOL ) )
                            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1075:1: (lv_symb_2_0= RULE_SYMBOL )
                            {
                            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1075:1: (lv_symb_2_0= RULE_SYMBOL )
                            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1076:3: lv_symb_2_0= RULE_SYMBOL
                            {
                            lv_symb_2_0=(Token)match(input,RULE_SYMBOL,FOLLOW_RULE_SYMBOL_in_ruleExprSimple2210); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_symb_2_0, grammarAccess.getExprSimpleAccess().getSymbSYMBOLTerminalRuleCall_0_2_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExprSimpleRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"symb",
                                      		lv_symb_2_0, 
                                      		"SYMBOL");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1093:6: (otherlv_3= '(' ( (lv_exprCons_4_0= 'cons' ) ) ( (lv_exprConsAtt_5_0= ruleExpr ) ) otherlv_6= ')' )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1093:6: (otherlv_3= '(' ( (lv_exprCons_4_0= 'cons' ) ) ( (lv_exprConsAtt_5_0= ruleExpr ) ) otherlv_6= ')' )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1093:8: otherlv_3= '(' ( (lv_exprCons_4_0= 'cons' ) ) ( (lv_exprConsAtt_5_0= ruleExpr ) ) otherlv_6= ')'
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleExprSimple2235); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1097:1: ( (lv_exprCons_4_0= 'cons' ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1098:1: (lv_exprCons_4_0= 'cons' )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1098:1: (lv_exprCons_4_0= 'cons' )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1099:3: lv_exprCons_4_0= 'cons'
                    {
                    lv_exprCons_4_0=(Token)match(input,35,FOLLOW_35_in_ruleExprSimple2253); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_exprCons_4_0, grammarAccess.getExprSimpleAccess().getExprConsConsKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExprSimpleRule());
                      	        }
                             		setWithLastConsumed(current, "exprCons", lv_exprCons_4_0, "cons");
                      	    
                    }

                    }


                    }

                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1112:2: ( (lv_exprConsAtt_5_0= ruleExpr ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1113:1: (lv_exprConsAtt_5_0= ruleExpr )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1113:1: (lv_exprConsAtt_5_0= ruleExpr )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1114:3: lv_exprConsAtt_5_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprSimpleAccess().getExprConsAttExprParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleExprSimple2287);
                    lv_exprConsAtt_5_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      	        }
                             		set(
                             			current, 
                             			"exprConsAtt",
                              		lv_exprConsAtt_5_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,36,FOLLOW_36_in_ruleExprSimple2299); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_1_3());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1135:6: (otherlv_7= '(' ( (lv_exprList_8_0= 'list' ) ) ( (lv_exprListAtt_9_0= ruleExpr ) ) otherlv_10= ')' )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1135:6: (otherlv_7= '(' ( (lv_exprList_8_0= 'list' ) ) ( (lv_exprListAtt_9_0= ruleExpr ) ) otherlv_10= ')' )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1135:8: otherlv_7= '(' ( (lv_exprList_8_0= 'list' ) ) ( (lv_exprListAtt_9_0= ruleExpr ) ) otherlv_10= ')'
                    {
                    otherlv_7=(Token)match(input,34,FOLLOW_34_in_ruleExprSimple2319); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1139:1: ( (lv_exprList_8_0= 'list' ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1140:1: (lv_exprList_8_0= 'list' )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1140:1: (lv_exprList_8_0= 'list' )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1141:3: lv_exprList_8_0= 'list'
                    {
                    lv_exprList_8_0=(Token)match(input,37,FOLLOW_37_in_ruleExprSimple2337); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_exprList_8_0, grammarAccess.getExprSimpleAccess().getExprListListKeyword_2_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExprSimpleRule());
                      	        }
                             		setWithLastConsumed(current, "exprList", lv_exprList_8_0, "list");
                      	    
                    }

                    }


                    }

                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1154:2: ( (lv_exprListAtt_9_0= ruleExpr ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1155:1: (lv_exprListAtt_9_0= ruleExpr )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1155:1: (lv_exprListAtt_9_0= ruleExpr )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1156:3: lv_exprListAtt_9_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprSimpleAccess().getExprListAttExprParserRuleCall_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleExprSimple2371);
                    lv_exprListAtt_9_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      	        }
                             		set(
                             			current, 
                             			"exprListAtt",
                              		lv_exprListAtt_9_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,36,FOLLOW_36_in_ruleExprSimple2383); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_2_3());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1177:6: (otherlv_11= '(' ( (lv_exprHead_12_0= 'hd' ) ) ( (lv_exprHeadAtt_13_0= ruleExpr ) ) otherlv_14= ')' )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1177:6: (otherlv_11= '(' ( (lv_exprHead_12_0= 'hd' ) ) ( (lv_exprHeadAtt_13_0= ruleExpr ) ) otherlv_14= ')' )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1177:8: otherlv_11= '(' ( (lv_exprHead_12_0= 'hd' ) ) ( (lv_exprHeadAtt_13_0= ruleExpr ) ) otherlv_14= ')'
                    {
                    otherlv_11=(Token)match(input,34,FOLLOW_34_in_ruleExprSimple2403); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1181:1: ( (lv_exprHead_12_0= 'hd' ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1182:1: (lv_exprHead_12_0= 'hd' )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1182:1: (lv_exprHead_12_0= 'hd' )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1183:3: lv_exprHead_12_0= 'hd'
                    {
                    lv_exprHead_12_0=(Token)match(input,38,FOLLOW_38_in_ruleExprSimple2421); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_exprHead_12_0, grammarAccess.getExprSimpleAccess().getExprHeadHdKeyword_3_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExprSimpleRule());
                      	        }
                             		setWithLastConsumed(current, "exprHead", lv_exprHead_12_0, "hd");
                      	    
                    }

                    }


                    }

                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1196:2: ( (lv_exprHeadAtt_13_0= ruleExpr ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1197:1: (lv_exprHeadAtt_13_0= ruleExpr )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1197:1: (lv_exprHeadAtt_13_0= ruleExpr )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1198:3: lv_exprHeadAtt_13_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprSimpleAccess().getExprHeadAttExprParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleExprSimple2455);
                    lv_exprHeadAtt_13_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      	        }
                             		set(
                             			current, 
                             			"exprHeadAtt",
                              		lv_exprHeadAtt_13_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,36,FOLLOW_36_in_ruleExprSimple2467); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_3_3());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1219:6: (otherlv_15= '(' ( (lv_exprTail_16_0= 'tl' ) ) ( (lv_exprTailAtt_17_0= ruleExpr ) ) otherlv_18= ')' )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1219:6: (otherlv_15= '(' ( (lv_exprTail_16_0= 'tl' ) ) ( (lv_exprTailAtt_17_0= ruleExpr ) ) otherlv_18= ')' )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1219:8: otherlv_15= '(' ( (lv_exprTail_16_0= 'tl' ) ) ( (lv_exprTailAtt_17_0= ruleExpr ) ) otherlv_18= ')'
                    {
                    otherlv_15=(Token)match(input,34,FOLLOW_34_in_ruleExprSimple2487); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_4_0());
                          
                    }
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1223:1: ( (lv_exprTail_16_0= 'tl' ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1224:1: (lv_exprTail_16_0= 'tl' )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1224:1: (lv_exprTail_16_0= 'tl' )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1225:3: lv_exprTail_16_0= 'tl'
                    {
                    lv_exprTail_16_0=(Token)match(input,39,FOLLOW_39_in_ruleExprSimple2505); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_exprTail_16_0, grammarAccess.getExprSimpleAccess().getExprTailTlKeyword_4_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExprSimpleRule());
                      	        }
                             		setWithLastConsumed(current, "exprTail", lv_exprTail_16_0, "tl");
                      	    
                    }

                    }


                    }

                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1238:2: ( (lv_exprTailAtt_17_0= ruleExpr ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1239:1: (lv_exprTailAtt_17_0= ruleExpr )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1239:1: (lv_exprTailAtt_17_0= ruleExpr )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1240:3: lv_exprTailAtt_17_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprSimpleAccess().getExprTailAttExprParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleExprSimple2539);
                    lv_exprTailAtt_17_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      	        }
                             		set(
                             			current, 
                             			"exprTailAtt",
                              		lv_exprTailAtt_17_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_18=(Token)match(input,36,FOLLOW_36_in_ruleExprSimple2551); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_4_3());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1261:6: (otherlv_19= '(' ( (lv_nomSymb_20_0= RULE_SYMBOL ) ) ( (lv_symbAtt_21_0= ruleExpr ) ) otherlv_22= ')' )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1261:6: (otherlv_19= '(' ( (lv_nomSymb_20_0= RULE_SYMBOL ) ) ( (lv_symbAtt_21_0= ruleExpr ) ) otherlv_22= ')' )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1261:8: otherlv_19= '(' ( (lv_nomSymb_20_0= RULE_SYMBOL ) ) ( (lv_symbAtt_21_0= ruleExpr ) ) otherlv_22= ')'
                    {
                    otherlv_19=(Token)match(input,34,FOLLOW_34_in_ruleExprSimple2571); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_5_0());
                          
                    }
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1265:1: ( (lv_nomSymb_20_0= RULE_SYMBOL ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1266:1: (lv_nomSymb_20_0= RULE_SYMBOL )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1266:1: (lv_nomSymb_20_0= RULE_SYMBOL )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1267:3: lv_nomSymb_20_0= RULE_SYMBOL
                    {
                    lv_nomSymb_20_0=(Token)match(input,RULE_SYMBOL,FOLLOW_RULE_SYMBOL_in_ruleExprSimple2588); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_nomSymb_20_0, grammarAccess.getExprSimpleAccess().getNomSymbSYMBOLTerminalRuleCall_5_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExprSimpleRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"nomSymb",
                              		lv_nomSymb_20_0, 
                              		"SYMBOL");
                      	    
                    }

                    }


                    }

                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1283:2: ( (lv_symbAtt_21_0= ruleExpr ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1284:1: (lv_symbAtt_21_0= ruleExpr )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1284:1: (lv_symbAtt_21_0= ruleExpr )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1285:3: lv_symbAtt_21_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprSimpleAccess().getSymbAttExprParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleExprSimple2614);
                    lv_symbAtt_21_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      	        }
                             		set(
                             			current, 
                             			"symbAtt",
                              		lv_symbAtt_21_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_22=(Token)match(input,36,FOLLOW_36_in_ruleExprSimple2626); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_5_3());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprSimple"


    // $ANTLR start "entryRuleExprAnd"
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1313:1: entryRuleExprAnd returns [EObject current=null] : iv_ruleExprAnd= ruleExprAnd EOF ;
    public final EObject entryRuleExprAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprAnd = null;


        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1314:2: (iv_ruleExprAnd= ruleExprAnd EOF )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1315:2: iv_ruleExprAnd= ruleExprAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprAndRule()); 
            }
            pushFollow(FOLLOW_ruleExprAnd_in_entryRuleExprAnd2663);
            iv_ruleExprAnd=ruleExprAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprAnd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprAnd2673); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprAnd"


    // $ANTLR start "ruleExprAnd"
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1322:1: ruleExprAnd returns [EObject current=null] : ( ( (lv_exprOr_0_0= ruleExprOr ) ) ( ( (lv_exprAnd_1_0= 'and' ) ) ( (lv_exprAndAtt_2_0= ruleExprAnd ) ) )? ) ;
    public final EObject ruleExprAnd() throws RecognitionException {
        EObject current = null;

        Token lv_exprAnd_1_0=null;
        EObject lv_exprOr_0_0 = null;

        EObject lv_exprAndAtt_2_0 = null;


         enterRule(); 
            
        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1325:28: ( ( ( (lv_exprOr_0_0= ruleExprOr ) ) ( ( (lv_exprAnd_1_0= 'and' ) ) ( (lv_exprAndAtt_2_0= ruleExprAnd ) ) )? ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1326:1: ( ( (lv_exprOr_0_0= ruleExprOr ) ) ( ( (lv_exprAnd_1_0= 'and' ) ) ( (lv_exprAndAtt_2_0= ruleExprAnd ) ) )? )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1326:1: ( ( (lv_exprOr_0_0= ruleExprOr ) ) ( ( (lv_exprAnd_1_0= 'and' ) ) ( (lv_exprAndAtt_2_0= ruleExprAnd ) ) )? )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1326:2: ( (lv_exprOr_0_0= ruleExprOr ) ) ( ( (lv_exprAnd_1_0= 'and' ) ) ( (lv_exprAndAtt_2_0= ruleExprAnd ) ) )?
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1326:2: ( (lv_exprOr_0_0= ruleExprOr ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1327:1: (lv_exprOr_0_0= ruleExprOr )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1327:1: (lv_exprOr_0_0= ruleExprOr )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1328:3: lv_exprOr_0_0= ruleExprOr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExprAndAccess().getExprOrExprOrParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExprOr_in_ruleExprAnd2719);
            lv_exprOr_0_0=ruleExprOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExprAndRule());
              	        }
                     		set(
                     			current, 
                     			"exprOr",
                      		lv_exprOr_0_0, 
                      		"ExprOr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1344:2: ( ( (lv_exprAnd_1_0= 'and' ) ) ( (lv_exprAndAtt_2_0= ruleExprAnd ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==40) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1344:3: ( (lv_exprAnd_1_0= 'and' ) ) ( (lv_exprAndAtt_2_0= ruleExprAnd ) )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1344:3: ( (lv_exprAnd_1_0= 'and' ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1345:1: (lv_exprAnd_1_0= 'and' )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1345:1: (lv_exprAnd_1_0= 'and' )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1346:3: lv_exprAnd_1_0= 'and'
                    {
                    lv_exprAnd_1_0=(Token)match(input,40,FOLLOW_40_in_ruleExprAnd2738); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_exprAnd_1_0, grammarAccess.getExprAndAccess().getExprAndAndKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExprAndRule());
                      	        }
                             		setWithLastConsumed(current, "exprAnd", lv_exprAnd_1_0, "and");
                      	    
                    }

                    }


                    }

                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1359:2: ( (lv_exprAndAtt_2_0= ruleExprAnd ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1360:1: (lv_exprAndAtt_2_0= ruleExprAnd )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1360:1: (lv_exprAndAtt_2_0= ruleExprAnd )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1361:3: lv_exprAndAtt_2_0= ruleExprAnd
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprAndAccess().getExprAndAttExprAndParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExprAnd_in_ruleExprAnd2772);
                    lv_exprAndAtt_2_0=ruleExprAnd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprAndRule());
                      	        }
                             		set(
                             			current, 
                             			"exprAndAtt",
                              		lv_exprAndAtt_2_0, 
                              		"ExprAnd");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprAnd"


    // $ANTLR start "entryRuleExprOr"
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1385:1: entryRuleExprOr returns [EObject current=null] : iv_ruleExprOr= ruleExprOr EOF ;
    public final EObject entryRuleExprOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprOr = null;


        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1386:2: (iv_ruleExprOr= ruleExprOr EOF )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1387:2: iv_ruleExprOr= ruleExprOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprOrRule()); 
            }
            pushFollow(FOLLOW_ruleExprOr_in_entryRuleExprOr2810);
            iv_ruleExprOr=ruleExprOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprOr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprOr2820); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprOr"


    // $ANTLR start "ruleExprOr"
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1394:1: ruleExprOr returns [EObject current=null] : ( ( (lv_exprNot_0_0= ruleExprNot ) ) ( ( (lv_exprOr_1_0= 'or' ) ) ( (lv_exprOrAtt_2_0= ruleExprOr ) ) )? ) ;
    public final EObject ruleExprOr() throws RecognitionException {
        EObject current = null;

        Token lv_exprOr_1_0=null;
        EObject lv_exprNot_0_0 = null;

        EObject lv_exprOrAtt_2_0 = null;


         enterRule(); 
            
        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1397:28: ( ( ( (lv_exprNot_0_0= ruleExprNot ) ) ( ( (lv_exprOr_1_0= 'or' ) ) ( (lv_exprOrAtt_2_0= ruleExprOr ) ) )? ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1398:1: ( ( (lv_exprNot_0_0= ruleExprNot ) ) ( ( (lv_exprOr_1_0= 'or' ) ) ( (lv_exprOrAtt_2_0= ruleExprOr ) ) )? )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1398:1: ( ( (lv_exprNot_0_0= ruleExprNot ) ) ( ( (lv_exprOr_1_0= 'or' ) ) ( (lv_exprOrAtt_2_0= ruleExprOr ) ) )? )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1398:2: ( (lv_exprNot_0_0= ruleExprNot ) ) ( ( (lv_exprOr_1_0= 'or' ) ) ( (lv_exprOrAtt_2_0= ruleExprOr ) ) )?
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1398:2: ( (lv_exprNot_0_0= ruleExprNot ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1399:1: (lv_exprNot_0_0= ruleExprNot )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1399:1: (lv_exprNot_0_0= ruleExprNot )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1400:3: lv_exprNot_0_0= ruleExprNot
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExprOrAccess().getExprNotExprNotParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExprNot_in_ruleExprOr2866);
            lv_exprNot_0_0=ruleExprNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExprOrRule());
              	        }
                     		set(
                     			current, 
                     			"exprNot",
                      		lv_exprNot_0_0, 
                      		"ExprNot");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1416:2: ( ( (lv_exprOr_1_0= 'or' ) ) ( (lv_exprOrAtt_2_0= ruleExprOr ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==41) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1416:3: ( (lv_exprOr_1_0= 'or' ) ) ( (lv_exprOrAtt_2_0= ruleExprOr ) )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1416:3: ( (lv_exprOr_1_0= 'or' ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1417:1: (lv_exprOr_1_0= 'or' )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1417:1: (lv_exprOr_1_0= 'or' )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1418:3: lv_exprOr_1_0= 'or'
                    {
                    lv_exprOr_1_0=(Token)match(input,41,FOLLOW_41_in_ruleExprOr2885); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_exprOr_1_0, grammarAccess.getExprOrAccess().getExprOrOrKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExprOrRule());
                      	        }
                             		setWithLastConsumed(current, "exprOr", lv_exprOr_1_0, "or");
                      	    
                    }

                    }


                    }

                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1431:2: ( (lv_exprOrAtt_2_0= ruleExprOr ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1432:1: (lv_exprOrAtt_2_0= ruleExprOr )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1432:1: (lv_exprOrAtt_2_0= ruleExprOr )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1433:3: lv_exprOrAtt_2_0= ruleExprOr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprOrAccess().getExprOrAttExprOrParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExprOr_in_ruleExprOr2919);
                    lv_exprOrAtt_2_0=ruleExprOr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprOrRule());
                      	        }
                             		set(
                             			current, 
                             			"exprOrAtt",
                              		lv_exprOrAtt_2_0, 
                              		"ExprOr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprOr"


    // $ANTLR start "entryRuleExprNot"
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1457:1: entryRuleExprNot returns [EObject current=null] : iv_ruleExprNot= ruleExprNot EOF ;
    public final EObject entryRuleExprNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprNot = null;


        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1458:2: (iv_ruleExprNot= ruleExprNot EOF )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1459:2: iv_ruleExprNot= ruleExprNot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprNotRule()); 
            }
            pushFollow(FOLLOW_ruleExprNot_in_entryRuleExprNot2957);
            iv_ruleExprNot=ruleExprNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprNot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprNot2967); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprNot"


    // $ANTLR start "ruleExprNot"
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1466:1: ruleExprNot returns [EObject current=null] : ( ( (lv_not_0_0= 'not' ) )? ( (lv_exprEq_1_0= ruleExprEq ) ) ) ;
    public final EObject ruleExprNot() throws RecognitionException {
        EObject current = null;

        Token lv_not_0_0=null;
        EObject lv_exprEq_1_0 = null;


         enterRule(); 
            
        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1469:28: ( ( ( (lv_not_0_0= 'not' ) )? ( (lv_exprEq_1_0= ruleExprEq ) ) ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1470:1: ( ( (lv_not_0_0= 'not' ) )? ( (lv_exprEq_1_0= ruleExprEq ) ) )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1470:1: ( ( (lv_not_0_0= 'not' ) )? ( (lv_exprEq_1_0= ruleExprEq ) ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1470:2: ( (lv_not_0_0= 'not' ) )? ( (lv_exprEq_1_0= ruleExprEq ) )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1470:2: ( (lv_not_0_0= 'not' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==42) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1471:1: (lv_not_0_0= 'not' )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1471:1: (lv_not_0_0= 'not' )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1472:3: lv_not_0_0= 'not'
                    {
                    lv_not_0_0=(Token)match(input,42,FOLLOW_42_in_ruleExprNot3010); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_not_0_0, grammarAccess.getExprNotAccess().getNotNotKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExprNotRule());
                      	        }
                             		setWithLastConsumed(current, "not", lv_not_0_0, "not");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1485:3: ( (lv_exprEq_1_0= ruleExprEq ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1486:1: (lv_exprEq_1_0= ruleExprEq )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1486:1: (lv_exprEq_1_0= ruleExprEq )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1487:3: lv_exprEq_1_0= ruleExprEq
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExprNotAccess().getExprEqExprEqParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExprEq_in_ruleExprNot3045);
            lv_exprEq_1_0=ruleExprEq();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExprNotRule());
              	        }
                     		set(
                     			current, 
                     			"exprEq",
                      		lv_exprEq_1_0, 
                      		"ExprEq");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprNot"


    // $ANTLR start "entryRuleExprEq"
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1511:1: entryRuleExprEq returns [EObject current=null] : iv_ruleExprEq= ruleExprEq EOF ;
    public final EObject entryRuleExprEq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprEq = null;


        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1512:2: (iv_ruleExprEq= ruleExprEq EOF )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1513:2: iv_ruleExprEq= ruleExprEq EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprEqRule()); 
            }
            pushFollow(FOLLOW_ruleExprEq_in_entryRuleExprEq3081);
            iv_ruleExprEq=ruleExprEq();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprEq; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprEq3091); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprEq"


    // $ANTLR start "ruleExprEq"
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1520:1: ruleExprEq returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ')' ) | ( ( (lv_exprSim1_3_0= ruleExprSimple ) ) otherlv_4= '=?' ( (lv_exprSim2_5_0= ruleExprSimple ) ) ) ) ;
    public final EObject ruleExprEq() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_1_0 = null;

        EObject lv_exprSim1_3_0 = null;

        EObject lv_exprSim2_5_0 = null;


         enterRule(); 
            
        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1523:28: ( ( (otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ')' ) | ( ( (lv_exprSim1_3_0= ruleExprSimple ) ) otherlv_4= '=?' ( (lv_exprSim2_5_0= ruleExprSimple ) ) ) ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1524:1: ( (otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ')' ) | ( ( (lv_exprSim1_3_0= ruleExprSimple ) ) otherlv_4= '=?' ( (lv_exprSim2_5_0= ruleExprSimple ) ) ) )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1524:1: ( (otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ')' ) | ( ( (lv_exprSim1_3_0= ruleExprSimple ) ) otherlv_4= '=?' ( (lv_exprSim2_5_0= ruleExprSimple ) ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                switch ( input.LA(2) ) {
                case 35:
                case 37:
                case 38:
                case 39:
                    {
                    alt16=2;
                    }
                    break;
                case RULE_SYMBOL:
                    {
                    int LA16_3 = input.LA(3);

                    if ( (LA16_3==36||LA16_3==43) ) {
                        alt16=1;
                    }
                    else if ( ((LA16_3>=RULE_SYMBOL && LA16_3<=RULE_VARIABLE)||(LA16_3>=33 && LA16_3<=34)||LA16_3==42) ) {
                        alt16=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_VARIABLE:
                case 33:
                case 34:
                case 42:
                    {
                    alt16=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }

            }
            else if ( ((LA16_0>=RULE_SYMBOL && LA16_0<=RULE_VARIABLE)||LA16_0==33) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1524:2: (otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ')' )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1524:2: (otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ')' )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1524:4: otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleExprEq3129); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getExprEqAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1528:1: ( (lv_expr_1_0= ruleExpr ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1529:1: (lv_expr_1_0= ruleExpr )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1529:1: (lv_expr_1_0= ruleExpr )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1530:3: lv_expr_1_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprEqAccess().getExprExprParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleExprEq3150);
                    lv_expr_1_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprEqRule());
                      	        }
                             		set(
                             			current, 
                             			"expr",
                              		lv_expr_1_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleExprEq3162); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getExprEqAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1551:6: ( ( (lv_exprSim1_3_0= ruleExprSimple ) ) otherlv_4= '=?' ( (lv_exprSim2_5_0= ruleExprSimple ) ) )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1551:6: ( ( (lv_exprSim1_3_0= ruleExprSimple ) ) otherlv_4= '=?' ( (lv_exprSim2_5_0= ruleExprSimple ) ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1551:7: ( (lv_exprSim1_3_0= ruleExprSimple ) ) otherlv_4= '=?' ( (lv_exprSim2_5_0= ruleExprSimple ) )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1551:7: ( (lv_exprSim1_3_0= ruleExprSimple ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1552:1: (lv_exprSim1_3_0= ruleExprSimple )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1552:1: (lv_exprSim1_3_0= ruleExprSimple )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1553:3: lv_exprSim1_3_0= ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprEqAccess().getExprSim1ExprSimpleParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExprSimple_in_ruleExprEq3191);
                    lv_exprSim1_3_0=ruleExprSimple();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprEqRule());
                      	        }
                             		set(
                             			current, 
                             			"exprSim1",
                              		lv_exprSim1_3_0, 
                              		"ExprSimple");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleExprEq3203); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getExprEqAccess().getEqualsSignQuestionMarkKeyword_1_1());
                          
                    }
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1573:1: ( (lv_exprSim2_5_0= ruleExprSimple ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1574:1: (lv_exprSim2_5_0= ruleExprSimple )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1574:1: (lv_exprSim2_5_0= ruleExprSimple )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1575:3: lv_exprSim2_5_0= ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprEqAccess().getExprSim2ExprSimpleParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExprSimple_in_ruleExprEq3224);
                    lv_exprSim2_5_0=ruleExprSimple();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprEqRule());
                      	        }
                             		set(
                             			current, 
                             			"exprSim2",
                              		lv_exprSim2_5_0, 
                              		"ExprSimple");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprEq"

    // $ANTLR start synpred2_InternalWhileCpp
    public final void synpred2_InternalWhileCpp_fragment() throws RecognitionException {   
        // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:911:3: ( ( ( ( ruleExpr ) ) ',' ) )
        // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:911:4: ( ( ( ruleExpr ) ) ',' )
        {
        // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:911:4: ( ( ( ruleExpr ) ) ',' )
        // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:911:5: ( ( ruleExpr ) ) ','
        {
        // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:911:5: ( ( ruleExpr ) )
        // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:912:1: ( ruleExpr )
        {
        // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:912:1: ( ruleExpr )
        // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:913:1: ruleExpr
        {
        pushFollow(FOLLOW_ruleExpr_in_synpred2_InternalWhileCpp1862);
        ruleExpr();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,19,FOLLOW_19_in_synpred2_InternalWhileCpp1868); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalWhileCpp

    // $ANTLR start synpred3_InternalWhileCpp
    public final void synpred3_InternalWhileCpp_fragment() throws RecognitionException {   
        // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:977:3: ( ( ( ruleExprSimple ) ) )
        // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:977:4: ( ( ruleExprSimple ) )
        {
        // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:977:4: ( ( ruleExprSimple ) )
        // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:978:1: ( ruleExprSimple )
        {
        // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:978:1: ( ruleExprSimple )
        // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:979:1: ruleExprSimple
        {
        pushFollow(FOLLOW_ruleExprSimple_in_synpred3_InternalWhileCpp2009);
        ruleExprSimple();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred3_InternalWhileCpp

    // Delegated rules

    public final boolean synpred2_InternalWhileCpp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalWhileCpp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalWhileCpp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalWhileCpp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleProgram130 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleFunction213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_SYMBOL_in_ruleFunction230 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFunction247 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleDefinition_in_ruleFunction268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleDefinition351 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleInput_in_ruleDefinition372 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDefinition384 = new BitSet(new long[]{0x0000000089900020L});
    public static final BitSet FOLLOW_ruleCommands_in_ruleDefinition405 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDefinition417 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDefinition429 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleOutput_in_ruleDefinition450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_entryRuleInput486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInput496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_ruleInput539 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleInput556 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_ruleInput575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutput_in_entryRuleOutput616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutput626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_ruleOutput669 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleOutput686 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_ruleOutput705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_entryRuleVars746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVars756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_ruleVars799 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleVars816 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_ruleVars835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_entryRuleCommands876 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommands886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleCommands931 = new BitSet(new long[]{0x0000000089900022L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCommand1021 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleCommand1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_ruleCommand1075 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleCommand1087 = new BitSet(new long[]{0x0000040600000030L});
    public static final BitSet FOLLOW_ruleExprs_in_ruleCommand1126 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleCommand1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandWhile_in_ruleCommand1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandIf_in_ruleCommand1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandForEach_in_ruleCommand1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandWhile_in_entryRuleCommandWhile1256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommandWhile1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleCommandWhile1310 = new BitSet(new long[]{0x0000040600000030L});
    public static final BitSet FOLLOW_24_in_ruleCommandWhile1341 = new BitSet(new long[]{0x0000040600000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleCommandWhile1363 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleCommandWhile1375 = new BitSet(new long[]{0x0000000089900020L});
    public static final BitSet FOLLOW_ruleCommands_in_ruleCommandWhile1396 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleCommandWhile1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandIf_in_entryRuleCommandIf1444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommandIf1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleCommandIf1491 = new BitSet(new long[]{0x0000040600000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleCommandIf1512 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCommandIf1524 = new BitSet(new long[]{0x0000000089900020L});
    public static final BitSet FOLLOW_ruleCommands_in_ruleCommandIf1545 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29_in_ruleCommandIf1558 = new BitSet(new long[]{0x0000000089900020L});
    public static final BitSet FOLLOW_ruleCommands_in_ruleCommandIf1579 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleCommandIf1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandForEach_in_entryRuleCommandForEach1629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommandForEach1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleCommandForEach1676 = new BitSet(new long[]{0x0000040600000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleCommandForEach1697 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleCommandForEach1709 = new BitSet(new long[]{0x0000040600000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleCommandForEach1730 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleCommandForEach1742 = new BitSet(new long[]{0x0000000089900020L});
    public static final BitSet FOLLOW_ruleCommands_in_ruleCommandForEach1763 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleCommandForEach1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprs_in_entryRuleExprs1811 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprs1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprs1887 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleExprs1899 = new BitSet(new long[]{0x0000040600000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprs1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr1959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_ruleExpr2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_ruleExpr2056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_entryRuleExprSimple2092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprSimple2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleExprSimple2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_ruleExprSimple2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOL_in_ruleExprSimple2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleExprSimple2235 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleExprSimple2253 = new BitSet(new long[]{0x0000040600000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprSimple2287 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleExprSimple2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleExprSimple2319 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleExprSimple2337 = new BitSet(new long[]{0x0000040600000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprSimple2371 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleExprSimple2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleExprSimple2403 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleExprSimple2421 = new BitSet(new long[]{0x0000040600000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprSimple2455 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleExprSimple2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleExprSimple2487 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleExprSimple2505 = new BitSet(new long[]{0x0000040600000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprSimple2539 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleExprSimple2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleExprSimple2571 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_SYMBOL_in_ruleExprSimple2588 = new BitSet(new long[]{0x0000040600000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprSimple2614 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleExprSimple2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_entryRuleExprAnd2663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprAnd2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_ruleExprAnd2719 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleExprAnd2738 = new BitSet(new long[]{0x0000040600000030L});
    public static final BitSet FOLLOW_ruleExprAnd_in_ruleExprAnd2772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_entryRuleExprOr2810 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprOr2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprNot_in_ruleExprOr2866 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleExprOr2885 = new BitSet(new long[]{0x0000040600000030L});
    public static final BitSet FOLLOW_ruleExprOr_in_ruleExprOr2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprNot_in_entryRuleExprNot2957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprNot2967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleExprNot3010 = new BitSet(new long[]{0x0000040600000030L});
    public static final BitSet FOLLOW_ruleExprEq_in_ruleExprNot3045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprEq_in_entryRuleExprEq3081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprEq3091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleExprEq3129 = new BitSet(new long[]{0x0000040600000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprEq3150 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleExprEq3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_ruleExprEq3191 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleExprEq3203 = new BitSet(new long[]{0x0000000600000030L});
    public static final BitSet FOLLOW_ruleExprSimple_in_ruleExprEq3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_synpred2_InternalWhileCpp1862 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_synpred2_InternalWhileCpp1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_synpred3_InternalWhileCpp2009 = new BitSet(new long[]{0x0000000000000002L});

}