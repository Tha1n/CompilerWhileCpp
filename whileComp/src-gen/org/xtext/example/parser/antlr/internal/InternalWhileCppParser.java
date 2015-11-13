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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SYMBOL", "RULE_VARIABLE", "RULE_LC", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "'nop'", "':='", "'while'", "'for'", "'do'", "'od'", "'if'", "'then'", "'else'", "'fi'", "'foreach'", "'in'", "'nil'", "'('", "'cons'", "')'", "'list'", "'hd'", "'tl'", "'and'", "'or'", "'not'", "'=?'"
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
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:180:1: ruleDefinition returns [EObject current=null] : (otherlv_0= 'read' ( (lv_inputs_1_0= ruleInput ) ) otherlv_2= '%' ( ( ( ( ( ruleCommand ) ) ';' ) )=> (lv_commandes_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_outputs_6_0= ruleOutput ) ) ) ;
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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:183:28: ( (otherlv_0= 'read' ( (lv_inputs_1_0= ruleInput ) ) otherlv_2= '%' ( ( ( ( ( ruleCommand ) ) ';' ) )=> (lv_commandes_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_outputs_6_0= ruleOutput ) ) ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:184:1: (otherlv_0= 'read' ( (lv_inputs_1_0= ruleInput ) ) otherlv_2= '%' ( ( ( ( ( ruleCommand ) ) ';' ) )=> (lv_commandes_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_outputs_6_0= ruleOutput ) ) )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:184:1: (otherlv_0= 'read' ( (lv_inputs_1_0= ruleInput ) ) otherlv_2= '%' ( ( ( ( ( ruleCommand ) ) ';' ) )=> (lv_commandes_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_outputs_6_0= ruleOutput ) ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:184:3: otherlv_0= 'read' ( (lv_inputs_1_0= ruleInput ) ) otherlv_2= '%' ( ( ( ( ( ruleCommand ) ) ';' ) )=> (lv_commandes_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_outputs_6_0= ruleOutput ) )
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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:210:1: ( ( ( ( ( ruleCommand ) ) ';' ) )=> (lv_commandes_3_0= ruleCommands ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:210:2: ( ( ( ( ruleCommand ) ) ';' ) )=> (lv_commandes_3_0= ruleCommands )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:216:1: (lv_commandes_3_0= ruleCommands )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:217:3: lv_commandes_3_0= ruleCommands
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDefinitionAccess().getCommandesCommandsParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommands_in_ruleDefinition423);
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

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleDefinition435); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getDefinitionAccess().getPercentSignKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleDefinition447); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDefinitionAccess().getWriteKeyword_5());
                  
            }
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:241:1: ( (lv_outputs_6_0= ruleOutput ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:242:1: (lv_outputs_6_0= ruleOutput )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:242:1: (lv_outputs_6_0= ruleOutput )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:243:3: lv_outputs_6_0= ruleOutput
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDefinitionAccess().getOutputsOutputParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOutput_in_ruleDefinition468);
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
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:267:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:268:2: (iv_ruleInput= ruleInput EOF )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:269:2: iv_ruleInput= ruleInput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInputRule()); 
            }
            pushFollow(FOLLOW_ruleInput_in_entryRuleInput504);
            iv_ruleInput=ruleInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInput; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInput514); if (state.failed) return current;

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
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:276:1: ruleInput returns [EObject current=null] : ( ( ( (lv_varIn_0_0= RULE_VARIABLE ) ) otherlv_1= ',' )* ( (lv_varIn_2_0= RULE_VARIABLE ) ) ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token lv_varIn_0_0=null;
        Token otherlv_1=null;
        Token lv_varIn_2_0=null;

         enterRule(); 
            
        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:279:28: ( ( ( ( (lv_varIn_0_0= RULE_VARIABLE ) ) otherlv_1= ',' )* ( (lv_varIn_2_0= RULE_VARIABLE ) ) ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:280:1: ( ( ( (lv_varIn_0_0= RULE_VARIABLE ) ) otherlv_1= ',' )* ( (lv_varIn_2_0= RULE_VARIABLE ) ) )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:280:1: ( ( ( (lv_varIn_0_0= RULE_VARIABLE ) ) otherlv_1= ',' )* ( (lv_varIn_2_0= RULE_VARIABLE ) ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:280:2: ( ( (lv_varIn_0_0= RULE_VARIABLE ) ) otherlv_1= ',' )* ( (lv_varIn_2_0= RULE_VARIABLE ) )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:280:2: ( ( (lv_varIn_0_0= RULE_VARIABLE ) ) otherlv_1= ',' )*
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
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:280:3: ( (lv_varIn_0_0= RULE_VARIABLE ) ) otherlv_1= ','
            	    {
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:280:3: ( (lv_varIn_0_0= RULE_VARIABLE ) )
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:281:1: (lv_varIn_0_0= RULE_VARIABLE )
            	    {
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:281:1: (lv_varIn_0_0= RULE_VARIABLE )
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:282:3: lv_varIn_0_0= RULE_VARIABLE
            	    {
            	    lv_varIn_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_ruleInput557); if (state.failed) return current;
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

            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleInput574); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getInputAccess().getCommaKeyword_0_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:302:3: ( (lv_varIn_2_0= RULE_VARIABLE ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:303:1: (lv_varIn_2_0= RULE_VARIABLE )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:303:1: (lv_varIn_2_0= RULE_VARIABLE )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:304:3: lv_varIn_2_0= RULE_VARIABLE
            {
            lv_varIn_2_0=(Token)match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_ruleInput593); if (state.failed) return current;
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
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:328:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:329:2: (iv_ruleOutput= ruleOutput EOF )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:330:2: iv_ruleOutput= ruleOutput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOutputRule()); 
            }
            pushFollow(FOLLOW_ruleOutput_in_entryRuleOutput634);
            iv_ruleOutput=ruleOutput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOutput; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutput644); if (state.failed) return current;

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
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:337:1: ruleOutput returns [EObject current=null] : ( ( ( (lv_varOut_0_0= RULE_VARIABLE ) ) otherlv_1= ',' )* ( (lv_varOut_2_0= RULE_VARIABLE ) ) ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token lv_varOut_0_0=null;
        Token otherlv_1=null;
        Token lv_varOut_2_0=null;

         enterRule(); 
            
        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:340:28: ( ( ( ( (lv_varOut_0_0= RULE_VARIABLE ) ) otherlv_1= ',' )* ( (lv_varOut_2_0= RULE_VARIABLE ) ) ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:341:1: ( ( ( (lv_varOut_0_0= RULE_VARIABLE ) ) otherlv_1= ',' )* ( (lv_varOut_2_0= RULE_VARIABLE ) ) )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:341:1: ( ( ( (lv_varOut_0_0= RULE_VARIABLE ) ) otherlv_1= ',' )* ( (lv_varOut_2_0= RULE_VARIABLE ) ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:341:2: ( ( (lv_varOut_0_0= RULE_VARIABLE ) ) otherlv_1= ',' )* ( (lv_varOut_2_0= RULE_VARIABLE ) )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:341:2: ( ( (lv_varOut_0_0= RULE_VARIABLE ) ) otherlv_1= ',' )*
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
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:341:3: ( (lv_varOut_0_0= RULE_VARIABLE ) ) otherlv_1= ','
            	    {
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:341:3: ( (lv_varOut_0_0= RULE_VARIABLE ) )
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:342:1: (lv_varOut_0_0= RULE_VARIABLE )
            	    {
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:342:1: (lv_varOut_0_0= RULE_VARIABLE )
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:343:3: lv_varOut_0_0= RULE_VARIABLE
            	    {
            	    lv_varOut_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_ruleOutput687); if (state.failed) return current;
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

            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleOutput704); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getCommaKeyword_0_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:363:3: ( (lv_varOut_2_0= RULE_VARIABLE ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:364:1: (lv_varOut_2_0= RULE_VARIABLE )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:364:1: (lv_varOut_2_0= RULE_VARIABLE )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:365:3: lv_varOut_2_0= RULE_VARIABLE
            {
            lv_varOut_2_0=(Token)match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_ruleOutput723); if (state.failed) return current;
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
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:389:1: entryRuleVars returns [EObject current=null] : iv_ruleVars= ruleVars EOF ;
    public final EObject entryRuleVars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVars = null;


        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:390:2: (iv_ruleVars= ruleVars EOF )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:391:2: iv_ruleVars= ruleVars EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarsRule()); 
            }
            pushFollow(FOLLOW_ruleVars_in_entryRuleVars764);
            iv_ruleVars=ruleVars();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVars; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVars774); if (state.failed) return current;

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
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:398:1: ruleVars returns [EObject current=null] : ( ( ( (lv_varGen_0_0= RULE_VARIABLE ) ) otherlv_1= ',' )* ( (lv_varGen_2_0= RULE_VARIABLE ) ) ) ;
    public final EObject ruleVars() throws RecognitionException {
        EObject current = null;

        Token lv_varGen_0_0=null;
        Token otherlv_1=null;
        Token lv_varGen_2_0=null;

         enterRule(); 
            
        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:401:28: ( ( ( ( (lv_varGen_0_0= RULE_VARIABLE ) ) otherlv_1= ',' )* ( (lv_varGen_2_0= RULE_VARIABLE ) ) ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:402:1: ( ( ( (lv_varGen_0_0= RULE_VARIABLE ) ) otherlv_1= ',' )* ( (lv_varGen_2_0= RULE_VARIABLE ) ) )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:402:1: ( ( ( (lv_varGen_0_0= RULE_VARIABLE ) ) otherlv_1= ',' )* ( (lv_varGen_2_0= RULE_VARIABLE ) ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:402:2: ( ( (lv_varGen_0_0= RULE_VARIABLE ) ) otherlv_1= ',' )* ( (lv_varGen_2_0= RULE_VARIABLE ) )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:402:2: ( ( (lv_varGen_0_0= RULE_VARIABLE ) ) otherlv_1= ',' )*
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
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:402:3: ( (lv_varGen_0_0= RULE_VARIABLE ) ) otherlv_1= ','
            	    {
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:402:3: ( (lv_varGen_0_0= RULE_VARIABLE ) )
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:403:1: (lv_varGen_0_0= RULE_VARIABLE )
            	    {
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:403:1: (lv_varGen_0_0= RULE_VARIABLE )
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:404:3: lv_varGen_0_0= RULE_VARIABLE
            	    {
            	    lv_varGen_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_ruleVars817); if (state.failed) return current;
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

            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleVars834); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getVarsAccess().getCommaKeyword_0_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:424:3: ( (lv_varGen_2_0= RULE_VARIABLE ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:425:1: (lv_varGen_2_0= RULE_VARIABLE )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:425:1: (lv_varGen_2_0= RULE_VARIABLE )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:426:3: lv_varGen_2_0= RULE_VARIABLE
            {
            lv_varGen_2_0=(Token)match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_ruleVars853); if (state.failed) return current;
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
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:450:1: entryRuleCommands returns [EObject current=null] : iv_ruleCommands= ruleCommands EOF ;
    public final EObject entryRuleCommands() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommands = null;


        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:451:2: (iv_ruleCommands= ruleCommands EOF )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:452:2: iv_ruleCommands= ruleCommands EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandsRule()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_entryRuleCommands894);
            iv_ruleCommands=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommands; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommands904); if (state.failed) return current;

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
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:459:1: ruleCommands returns [EObject current=null] : ( ( ( ( ( ( ruleCommand ) ) ';' ) )=> ( ( (lv_commande_0_0= ruleCommand ) ) otherlv_1= ';' ) )* ( (lv_commande_2_0= ruleCommand ) ) ) ;
    public final EObject ruleCommands() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_commande_0_0 = null;

        EObject lv_commande_2_0 = null;


         enterRule(); 
            
        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:462:28: ( ( ( ( ( ( ( ruleCommand ) ) ';' ) )=> ( ( (lv_commande_0_0= ruleCommand ) ) otherlv_1= ';' ) )* ( (lv_commande_2_0= ruleCommand ) ) ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:463:1: ( ( ( ( ( ( ruleCommand ) ) ';' ) )=> ( ( (lv_commande_0_0= ruleCommand ) ) otherlv_1= ';' ) )* ( (lv_commande_2_0= ruleCommand ) ) )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:463:1: ( ( ( ( ( ( ruleCommand ) ) ';' ) )=> ( ( (lv_commande_0_0= ruleCommand ) ) otherlv_1= ';' ) )* ( (lv_commande_2_0= ruleCommand ) ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:463:2: ( ( ( ( ( ruleCommand ) ) ';' ) )=> ( ( (lv_commande_0_0= ruleCommand ) ) otherlv_1= ';' ) )* ( (lv_commande_2_0= ruleCommand ) )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:463:2: ( ( ( ( ( ruleCommand ) ) ';' ) )=> ( ( (lv_commande_0_0= ruleCommand ) ) otherlv_1= ';' ) )*
            loop5:
            do {
                int alt5=2;
                switch ( input.LA(1) ) {
                case 21:
                    {
                    int LA5_1 = input.LA(2);

                    if ( (synpred2_InternalWhileCpp()) ) {
                        alt5=1;
                    }


                    }
                    break;
                case RULE_VARIABLE:
                    {
                    int LA5_2 = input.LA(2);

                    if ( (synpred2_InternalWhileCpp()) ) {
                        alt5=1;
                    }


                    }
                    break;
                case 23:
                    {
                    int LA5_3 = input.LA(2);

                    if ( (synpred2_InternalWhileCpp()) ) {
                        alt5=1;
                    }


                    }
                    break;
                case 24:
                    {
                    int LA5_4 = input.LA(2);

                    if ( (synpred2_InternalWhileCpp()) ) {
                        alt5=1;
                    }


                    }
                    break;
                case 27:
                    {
                    int LA5_5 = input.LA(2);

                    if ( (synpred2_InternalWhileCpp()) ) {
                        alt5=1;
                    }


                    }
                    break;
                case 31:
                    {
                    int LA5_6 = input.LA(2);

                    if ( (synpred2_InternalWhileCpp()) ) {
                        alt5=1;
                    }


                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:463:3: ( ( ( ( ruleCommand ) ) ';' ) )=> ( ( (lv_commande_0_0= ruleCommand ) ) otherlv_1= ';' )
            	    {
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:468:5: ( ( (lv_commande_0_0= ruleCommand ) ) otherlv_1= ';' )
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:468:6: ( (lv_commande_0_0= ruleCommand ) ) otherlv_1= ';'
            	    {
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:468:6: ( (lv_commande_0_0= ruleCommand ) )
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:469:1: (lv_commande_0_0= ruleCommand )
            	    {
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:469:1: (lv_commande_0_0= ruleCommand )
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:470:3: lv_commande_0_0= ruleCommand
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCommandsAccess().getCommandeCommandParserRuleCall_0_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCommand_in_ruleCommands970);
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

            	    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleCommands982); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getCommandsAccess().getSemicolonKeyword_0_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:490:4: ( (lv_commande_2_0= ruleCommand ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:491:1: (lv_commande_2_0= ruleCommand )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:491:1: (lv_commande_2_0= ruleCommand )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:492:3: lv_commande_2_0= ruleCommand
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommandsAccess().getCommandeCommandParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommand_in_ruleCommands1006);
            lv_commande_2_0=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCommandsRule());
              	        }
                     		add(
                     			current, 
                     			"commande",
                      		lv_commande_2_0, 
                      		"Command");
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
    // $ANTLR end "ruleCommands"


    // $ANTLR start "entryRuleCommand"
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:516:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:517:2: (iv_ruleCommand= ruleCommand EOF )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:518:2: iv_ruleCommand= ruleCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandRule()); 
            }
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand1042);
            iv_ruleCommand=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand1052); if (state.failed) return current;

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
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:525:1: ruleCommand returns [EObject current=null] : ( ( (lv_nop_0_0= 'nop' ) ) | ( ( (lv_vars_1_0= ruleVars ) ) otherlv_2= ':=' ( ( ( ( ( ruleExpr ) ) ',' ) )=> (lv_exprs_3_0= ruleExprs ) ) ) | ( (lv_cmdWhile_4_0= ruleCommandWhile ) ) | ( (lv_cmdIf_5_0= ruleCommandIf ) ) | ( (lv_cmdForEach_6_0= ruleCommandForEach ) ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token lv_nop_0_0=null;
        Token otherlv_2=null;
        EObject lv_vars_1_0 = null;

        EObject lv_exprs_3_0 = null;

        EObject lv_cmdWhile_4_0 = null;

        EObject lv_cmdIf_5_0 = null;

        EObject lv_cmdForEach_6_0 = null;


         enterRule(); 
            
        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:528:28: ( ( ( (lv_nop_0_0= 'nop' ) ) | ( ( (lv_vars_1_0= ruleVars ) ) otherlv_2= ':=' ( ( ( ( ( ruleExpr ) ) ',' ) )=> (lv_exprs_3_0= ruleExprs ) ) ) | ( (lv_cmdWhile_4_0= ruleCommandWhile ) ) | ( (lv_cmdIf_5_0= ruleCommandIf ) ) | ( (lv_cmdForEach_6_0= ruleCommandForEach ) ) ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:529:1: ( ( (lv_nop_0_0= 'nop' ) ) | ( ( (lv_vars_1_0= ruleVars ) ) otherlv_2= ':=' ( ( ( ( ( ruleExpr ) ) ',' ) )=> (lv_exprs_3_0= ruleExprs ) ) ) | ( (lv_cmdWhile_4_0= ruleCommandWhile ) ) | ( (lv_cmdIf_5_0= ruleCommandIf ) ) | ( (lv_cmdForEach_6_0= ruleCommandForEach ) ) )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:529:1: ( ( (lv_nop_0_0= 'nop' ) ) | ( ( (lv_vars_1_0= ruleVars ) ) otherlv_2= ':=' ( ( ( ( ( ruleExpr ) ) ',' ) )=> (lv_exprs_3_0= ruleExprs ) ) ) | ( (lv_cmdWhile_4_0= ruleCommandWhile ) ) | ( (lv_cmdIf_5_0= ruleCommandIf ) ) | ( (lv_cmdForEach_6_0= ruleCommandForEach ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 21:
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
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:529:2: ( (lv_nop_0_0= 'nop' ) )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:529:2: ( (lv_nop_0_0= 'nop' ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:530:1: (lv_nop_0_0= 'nop' )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:530:1: (lv_nop_0_0= 'nop' )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:531:3: lv_nop_0_0= 'nop'
                    {
                    lv_nop_0_0=(Token)match(input,21,FOLLOW_21_in_ruleCommand1095); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_nop_0_0, grammarAccess.getCommandAccess().getNopNopKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCommandRule());
                      	        }
                             		setWithLastConsumed(current, "nop", lv_nop_0_0, "nop");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:545:6: ( ( (lv_vars_1_0= ruleVars ) ) otherlv_2= ':=' ( ( ( ( ( ruleExpr ) ) ',' ) )=> (lv_exprs_3_0= ruleExprs ) ) )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:545:6: ( ( (lv_vars_1_0= ruleVars ) ) otherlv_2= ':=' ( ( ( ( ( ruleExpr ) ) ',' ) )=> (lv_exprs_3_0= ruleExprs ) ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:545:7: ( (lv_vars_1_0= ruleVars ) ) otherlv_2= ':=' ( ( ( ( ( ruleExpr ) ) ',' ) )=> (lv_exprs_3_0= ruleExprs ) )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:545:7: ( (lv_vars_1_0= ruleVars ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:546:1: (lv_vars_1_0= ruleVars )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:546:1: (lv_vars_1_0= ruleVars )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:547:3: lv_vars_1_0= ruleVars
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandAccess().getVarsVarsParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVars_in_ruleCommand1136);
                    lv_vars_1_0=ruleVars();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandRule());
                      	        }
                             		set(
                             			current, 
                             			"vars",
                              		lv_vars_1_0, 
                              		"Vars");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleCommand1148); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getCommandAccess().getColonEqualsSignKeyword_1_1());
                          
                    }
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:567:1: ( ( ( ( ( ruleExpr ) ) ',' ) )=> (lv_exprs_3_0= ruleExprs ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:567:2: ( ( ( ( ruleExpr ) ) ',' ) )=> (lv_exprs_3_0= ruleExprs )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:573:1: (lv_exprs_3_0= ruleExprs )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:574:3: lv_exprs_3_0= ruleExprs
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandAccess().getExprsExprsParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExprs_in_ruleCommand1187);
                    lv_exprs_3_0=ruleExprs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandRule());
                      	        }
                             		set(
                             			current, 
                             			"exprs",
                              		lv_exprs_3_0, 
                              		"Exprs");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:591:6: ( (lv_cmdWhile_4_0= ruleCommandWhile ) )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:591:6: ( (lv_cmdWhile_4_0= ruleCommandWhile ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:592:1: (lv_cmdWhile_4_0= ruleCommandWhile )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:592:1: (lv_cmdWhile_4_0= ruleCommandWhile )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:593:3: lv_cmdWhile_4_0= ruleCommandWhile
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandAccess().getCmdWhileCommandWhileParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCommandWhile_in_ruleCommand1215);
                    lv_cmdWhile_4_0=ruleCommandWhile();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandRule());
                      	        }
                             		set(
                             			current, 
                             			"cmdWhile",
                              		lv_cmdWhile_4_0, 
                              		"CommandWhile");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:610:6: ( (lv_cmdIf_5_0= ruleCommandIf ) )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:610:6: ( (lv_cmdIf_5_0= ruleCommandIf ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:611:1: (lv_cmdIf_5_0= ruleCommandIf )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:611:1: (lv_cmdIf_5_0= ruleCommandIf )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:612:3: lv_cmdIf_5_0= ruleCommandIf
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandAccess().getCmdIfCommandIfParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCommandIf_in_ruleCommand1242);
                    lv_cmdIf_5_0=ruleCommandIf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandRule());
                      	        }
                             		set(
                             			current, 
                             			"cmdIf",
                              		lv_cmdIf_5_0, 
                              		"CommandIf");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:629:6: ( (lv_cmdForEach_6_0= ruleCommandForEach ) )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:629:6: ( (lv_cmdForEach_6_0= ruleCommandForEach ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:630:1: (lv_cmdForEach_6_0= ruleCommandForEach )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:630:1: (lv_cmdForEach_6_0= ruleCommandForEach )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:631:3: lv_cmdForEach_6_0= ruleCommandForEach
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandAccess().getCmdForEachCommandForEachParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCommandForEach_in_ruleCommand1269);
                    lv_cmdForEach_6_0=ruleCommandForEach();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandRule());
                      	        }
                             		set(
                             			current, 
                             			"cmdForEach",
                              		lv_cmdForEach_6_0, 
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
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:655:1: entryRuleCommandWhile returns [EObject current=null] : iv_ruleCommandWhile= ruleCommandWhile EOF ;
    public final EObject entryRuleCommandWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandWhile = null;


        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:656:2: (iv_ruleCommandWhile= ruleCommandWhile EOF )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:657:2: iv_ruleCommandWhile= ruleCommandWhile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandWhileRule()); 
            }
            pushFollow(FOLLOW_ruleCommandWhile_in_entryRuleCommandWhile1305);
            iv_ruleCommandWhile=ruleCommandWhile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommandWhile; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommandWhile1315); if (state.failed) return current;

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
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:664:1: ruleCommandWhile returns [EObject current=null] : ( ( ( (lv_w_0_0= 'while' ) ) | otherlv_1= 'for' ) ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= 'do' ( ( ( ( ( ruleCommand ) ) ';' ) )=> (lv_cmds_4_0= ruleCommands ) ) otherlv_5= 'od' ) ;
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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:667:28: ( ( ( ( (lv_w_0_0= 'while' ) ) | otherlv_1= 'for' ) ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= 'do' ( ( ( ( ( ruleCommand ) ) ';' ) )=> (lv_cmds_4_0= ruleCommands ) ) otherlv_5= 'od' ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:668:1: ( ( ( (lv_w_0_0= 'while' ) ) | otherlv_1= 'for' ) ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= 'do' ( ( ( ( ( ruleCommand ) ) ';' ) )=> (lv_cmds_4_0= ruleCommands ) ) otherlv_5= 'od' )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:668:1: ( ( ( (lv_w_0_0= 'while' ) ) | otherlv_1= 'for' ) ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= 'do' ( ( ( ( ( ruleCommand ) ) ';' ) )=> (lv_cmds_4_0= ruleCommands ) ) otherlv_5= 'od' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:668:2: ( ( (lv_w_0_0= 'while' ) ) | otherlv_1= 'for' ) ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= 'do' ( ( ( ( ( ruleCommand ) ) ';' ) )=> (lv_cmds_4_0= ruleCommands ) ) otherlv_5= 'od'
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:668:2: ( ( (lv_w_0_0= 'while' ) ) | otherlv_1= 'for' )
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
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:668:3: ( (lv_w_0_0= 'while' ) )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:668:3: ( (lv_w_0_0= 'while' ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:669:1: (lv_w_0_0= 'while' )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:669:1: (lv_w_0_0= 'while' )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:670:3: lv_w_0_0= 'while'
                    {
                    lv_w_0_0=(Token)match(input,23,FOLLOW_23_in_ruleCommandWhile1359); if (state.failed) return current;
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
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:684:7: otherlv_1= 'for'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleCommandWhile1390); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getCommandWhileAccess().getForKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:688:2: ( (lv_expr_2_0= ruleExpr ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:689:1: (lv_expr_2_0= ruleExpr )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:689:1: (lv_expr_2_0= ruleExpr )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:690:3: lv_expr_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommandWhileAccess().getExprExprParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleCommandWhile1412);
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

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleCommandWhile1424); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCommandWhileAccess().getDoKeyword_2());
                  
            }
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:710:1: ( ( ( ( ( ruleCommand ) ) ';' ) )=> (lv_cmds_4_0= ruleCommands ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:710:2: ( ( ( ( ruleCommand ) ) ';' ) )=> (lv_cmds_4_0= ruleCommands )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:716:1: (lv_cmds_4_0= ruleCommands )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:717:3: lv_cmds_4_0= ruleCommands
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommandWhileAccess().getCmdsCommandsParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommands_in_ruleCommandWhile1463);
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

            otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleCommandWhile1475); if (state.failed) return current;
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
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:745:1: entryRuleCommandIf returns [EObject current=null] : iv_ruleCommandIf= ruleCommandIf EOF ;
    public final EObject entryRuleCommandIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandIf = null;


        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:746:2: (iv_ruleCommandIf= ruleCommandIf EOF )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:747:2: iv_ruleCommandIf= ruleCommandIf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandIfRule()); 
            }
            pushFollow(FOLLOW_ruleCommandIf_in_entryRuleCommandIf1511);
            iv_ruleCommandIf=ruleCommandIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommandIf; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommandIf1521); if (state.failed) return current;

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
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:754:1: ruleCommandIf returns [EObject current=null] : (otherlv_0= 'if' ( (lv_cond_1_0= ruleExpr ) ) otherlv_2= 'then' ( ( ( ( ( ruleCommand ) ) ';' ) )=> (lv_cmdsThen_3_0= ruleCommands ) ) (otherlv_4= 'else' ( ( ( ( ( ruleCommand ) ) ';' ) )=> (lv_cmdsElse_5_0= ruleCommands ) ) )? otherlv_6= 'fi' ) ;
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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:757:28: ( (otherlv_0= 'if' ( (lv_cond_1_0= ruleExpr ) ) otherlv_2= 'then' ( ( ( ( ( ruleCommand ) ) ';' ) )=> (lv_cmdsThen_3_0= ruleCommands ) ) (otherlv_4= 'else' ( ( ( ( ( ruleCommand ) ) ';' ) )=> (lv_cmdsElse_5_0= ruleCommands ) ) )? otherlv_6= 'fi' ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:758:1: (otherlv_0= 'if' ( (lv_cond_1_0= ruleExpr ) ) otherlv_2= 'then' ( ( ( ( ( ruleCommand ) ) ';' ) )=> (lv_cmdsThen_3_0= ruleCommands ) ) (otherlv_4= 'else' ( ( ( ( ( ruleCommand ) ) ';' ) )=> (lv_cmdsElse_5_0= ruleCommands ) ) )? otherlv_6= 'fi' )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:758:1: (otherlv_0= 'if' ( (lv_cond_1_0= ruleExpr ) ) otherlv_2= 'then' ( ( ( ( ( ruleCommand ) ) ';' ) )=> (lv_cmdsThen_3_0= ruleCommands ) ) (otherlv_4= 'else' ( ( ( ( ( ruleCommand ) ) ';' ) )=> (lv_cmdsElse_5_0= ruleCommands ) ) )? otherlv_6= 'fi' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:758:3: otherlv_0= 'if' ( (lv_cond_1_0= ruleExpr ) ) otherlv_2= 'then' ( ( ( ( ( ruleCommand ) ) ';' ) )=> (lv_cmdsThen_3_0= ruleCommands ) ) (otherlv_4= 'else' ( ( ( ( ( ruleCommand ) ) ';' ) )=> (lv_cmdsElse_5_0= ruleCommands ) ) )? otherlv_6= 'fi'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleCommandIf1558); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCommandIfAccess().getIfKeyword_0());
                  
            }
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:762:1: ( (lv_cond_1_0= ruleExpr ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:763:1: (lv_cond_1_0= ruleExpr )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:763:1: (lv_cond_1_0= ruleExpr )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:764:3: lv_cond_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommandIfAccess().getCondExprParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleCommandIf1579);
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

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleCommandIf1591); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCommandIfAccess().getThenKeyword_2());
                  
            }
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:784:1: ( ( ( ( ( ruleCommand ) ) ';' ) )=> (lv_cmdsThen_3_0= ruleCommands ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:784:2: ( ( ( ( ruleCommand ) ) ';' ) )=> (lv_cmdsThen_3_0= ruleCommands )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:790:1: (lv_cmdsThen_3_0= ruleCommands )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:791:3: lv_cmdsThen_3_0= ruleCommands
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommandIfAccess().getCmdsThenCommandsParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommands_in_ruleCommandIf1630);
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

            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:807:2: (otherlv_4= 'else' ( ( ( ( ( ruleCommand ) ) ';' ) )=> (lv_cmdsElse_5_0= ruleCommands ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:807:4: otherlv_4= 'else' ( ( ( ( ( ruleCommand ) ) ';' ) )=> (lv_cmdsElse_5_0= ruleCommands ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleCommandIf1643); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getCommandIfAccess().getElseKeyword_4_0());
                          
                    }
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:811:1: ( ( ( ( ( ruleCommand ) ) ';' ) )=> (lv_cmdsElse_5_0= ruleCommands ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:811:2: ( ( ( ( ruleCommand ) ) ';' ) )=> (lv_cmdsElse_5_0= ruleCommands )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:817:1: (lv_cmdsElse_5_0= ruleCommands )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:818:3: lv_cmdsElse_5_0= ruleCommands
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandIfAccess().getCmdsElseCommandsParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCommands_in_ruleCommandIf1682);
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

            otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleCommandIf1696); if (state.failed) return current;
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
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:846:1: entryRuleCommandForEach returns [EObject current=null] : iv_ruleCommandForEach= ruleCommandForEach EOF ;
    public final EObject entryRuleCommandForEach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandForEach = null;


        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:847:2: (iv_ruleCommandForEach= ruleCommandForEach EOF )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:848:2: iv_ruleCommandForEach= ruleCommandForEach EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandForEachRule()); 
            }
            pushFollow(FOLLOW_ruleCommandForEach_in_entryRuleCommandForEach1732);
            iv_ruleCommandForEach=ruleCommandForEach();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommandForEach; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommandForEach1742); if (state.failed) return current;

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
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:855:1: ruleCommandForEach returns [EObject current=null] : (otherlv_0= 'foreach' ( (lv_elem_1_0= ruleExpr ) ) otherlv_2= 'in' ( (lv_ensemb_3_0= ruleExpr ) ) otherlv_4= 'do' ( ( ( ( ( ruleCommand ) ) ';' ) )=> (lv_cmds_5_0= ruleCommands ) ) otherlv_6= 'od' ) ;
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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:858:28: ( (otherlv_0= 'foreach' ( (lv_elem_1_0= ruleExpr ) ) otherlv_2= 'in' ( (lv_ensemb_3_0= ruleExpr ) ) otherlv_4= 'do' ( ( ( ( ( ruleCommand ) ) ';' ) )=> (lv_cmds_5_0= ruleCommands ) ) otherlv_6= 'od' ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:859:1: (otherlv_0= 'foreach' ( (lv_elem_1_0= ruleExpr ) ) otherlv_2= 'in' ( (lv_ensemb_3_0= ruleExpr ) ) otherlv_4= 'do' ( ( ( ( ( ruleCommand ) ) ';' ) )=> (lv_cmds_5_0= ruleCommands ) ) otherlv_6= 'od' )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:859:1: (otherlv_0= 'foreach' ( (lv_elem_1_0= ruleExpr ) ) otherlv_2= 'in' ( (lv_ensemb_3_0= ruleExpr ) ) otherlv_4= 'do' ( ( ( ( ( ruleCommand ) ) ';' ) )=> (lv_cmds_5_0= ruleCommands ) ) otherlv_6= 'od' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:859:3: otherlv_0= 'foreach' ( (lv_elem_1_0= ruleExpr ) ) otherlv_2= 'in' ( (lv_ensemb_3_0= ruleExpr ) ) otherlv_4= 'do' ( ( ( ( ( ruleCommand ) ) ';' ) )=> (lv_cmds_5_0= ruleCommands ) ) otherlv_6= 'od'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleCommandForEach1779); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCommandForEachAccess().getForeachKeyword_0());
                  
            }
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:863:1: ( (lv_elem_1_0= ruleExpr ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:864:1: (lv_elem_1_0= ruleExpr )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:864:1: (lv_elem_1_0= ruleExpr )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:865:3: lv_elem_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommandForEachAccess().getElemExprParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleCommandForEach1800);
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

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleCommandForEach1812); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCommandForEachAccess().getInKeyword_2());
                  
            }
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:885:1: ( (lv_ensemb_3_0= ruleExpr ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:886:1: (lv_ensemb_3_0= ruleExpr )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:886:1: (lv_ensemb_3_0= ruleExpr )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:887:3: lv_ensemb_3_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommandForEachAccess().getEnsembExprParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleCommandForEach1833);
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

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleCommandForEach1845); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getCommandForEachAccess().getDoKeyword_4());
                  
            }
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:907:1: ( ( ( ( ( ruleCommand ) ) ';' ) )=> (lv_cmds_5_0= ruleCommands ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:907:2: ( ( ( ( ruleCommand ) ) ';' ) )=> (lv_cmds_5_0= ruleCommands )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:913:1: (lv_cmds_5_0= ruleCommands )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:914:3: lv_cmds_5_0= ruleCommands
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommandForEachAccess().getCmdsCommandsParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommands_in_ruleCommandForEach1884);
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

            otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleCommandForEach1896); if (state.failed) return current;
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
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:942:1: entryRuleExprs returns [EObject current=null] : iv_ruleExprs= ruleExprs EOF ;
    public final EObject entryRuleExprs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprs = null;


        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:943:2: (iv_ruleExprs= ruleExprs EOF )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:944:2: iv_ruleExprs= ruleExprs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprsRule()); 
            }
            pushFollow(FOLLOW_ruleExprs_in_entryRuleExprs1932);
            iv_ruleExprs=ruleExprs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprs; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprs1942); if (state.failed) return current;

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
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:951:1: ruleExprs returns [EObject current=null] : ( ( ( ( ( ( ruleExpr ) ) ',' ) )=> ( ( (lv_expGen_0_0= ruleExpr ) ) otherlv_1= ',' ) )* ( (lv_expGen_2_0= ruleExpr ) ) ) ;
    public final EObject ruleExprs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expGen_0_0 = null;

        EObject lv_expGen_2_0 = null;


         enterRule(); 
            
        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:954:28: ( ( ( ( ( ( ( ruleExpr ) ) ',' ) )=> ( ( (lv_expGen_0_0= ruleExpr ) ) otherlv_1= ',' ) )* ( (lv_expGen_2_0= ruleExpr ) ) ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:955:1: ( ( ( ( ( ( ruleExpr ) ) ',' ) )=> ( ( (lv_expGen_0_0= ruleExpr ) ) otherlv_1= ',' ) )* ( (lv_expGen_2_0= ruleExpr ) ) )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:955:1: ( ( ( ( ( ( ruleExpr ) ) ',' ) )=> ( ( (lv_expGen_0_0= ruleExpr ) ) otherlv_1= ',' ) )* ( (lv_expGen_2_0= ruleExpr ) ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:955:2: ( ( ( ( ( ruleExpr ) ) ',' ) )=> ( ( (lv_expGen_0_0= ruleExpr ) ) otherlv_1= ',' ) )* ( (lv_expGen_2_0= ruleExpr ) )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:955:2: ( ( ( ( ( ruleExpr ) ) ',' ) )=> ( ( (lv_expGen_0_0= ruleExpr ) ) otherlv_1= ',' ) )*
            loop9:
            do {
                int alt9=2;
                switch ( input.LA(1) ) {
                case 33:
                    {
                    int LA9_1 = input.LA(2);

                    if ( (synpred8_InternalWhileCpp()) ) {
                        alt9=1;
                    }


                    }
                    break;
                case RULE_VARIABLE:
                    {
                    int LA9_2 = input.LA(2);

                    if ( (synpred8_InternalWhileCpp()) ) {
                        alt9=1;
                    }


                    }
                    break;
                case RULE_SYMBOL:
                    {
                    int LA9_3 = input.LA(2);

                    if ( (synpred8_InternalWhileCpp()) ) {
                        alt9=1;
                    }


                    }
                    break;
                case 34:
                    {
                    int LA9_4 = input.LA(2);

                    if ( (synpred8_InternalWhileCpp()) ) {
                        alt9=1;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA9_5 = input.LA(2);

                    if ( (synpred8_InternalWhileCpp()) ) {
                        alt9=1;
                    }


                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:955:3: ( ( ( ( ruleExpr ) ) ',' ) )=> ( ( (lv_expGen_0_0= ruleExpr ) ) otherlv_1= ',' )
            	    {
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:960:5: ( ( (lv_expGen_0_0= ruleExpr ) ) otherlv_1= ',' )
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:960:6: ( (lv_expGen_0_0= ruleExpr ) ) otherlv_1= ','
            	    {
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:960:6: ( (lv_expGen_0_0= ruleExpr ) )
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:961:1: (lv_expGen_0_0= ruleExpr )
            	    {
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:961:1: (lv_expGen_0_0= ruleExpr )
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:962:3: lv_expGen_0_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprsAccess().getExpGenExprParserRuleCall_0_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpr_in_ruleExprs2008);
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

            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleExprs2020); if (state.failed) return current;
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

            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:982:4: ( (lv_expGen_2_0= ruleExpr ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:983:1: (lv_expGen_2_0= ruleExpr )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:983:1: (lv_expGen_2_0= ruleExpr )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:984:3: lv_expGen_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExprsAccess().getExpGenExprParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleExprs2044);
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
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1008:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1009:2: (iv_ruleExpr= ruleExpr EOF )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1010:2: iv_ruleExpr= ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr2080);
            iv_ruleExpr=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr2090); if (state.failed) return current;

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
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1017:1: ruleExpr returns [EObject current=null] : ( ( ( ( ( ruleExprSimple ) ) )=> ( (lv_exprSimp_0_0= ruleExprSimple ) ) ) | ( (lv_exprAnd_1_0= ruleExprAnd ) ) ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_exprSimp_0_0 = null;

        EObject lv_exprAnd_1_0 = null;


         enterRule(); 
            
        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1020:28: ( ( ( ( ( ( ruleExprSimple ) ) )=> ( (lv_exprSimp_0_0= ruleExprSimple ) ) ) | ( (lv_exprAnd_1_0= ruleExprAnd ) ) ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1021:1: ( ( ( ( ( ruleExprSimple ) ) )=> ( (lv_exprSimp_0_0= ruleExprSimple ) ) ) | ( (lv_exprAnd_1_0= ruleExprAnd ) ) )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1021:1: ( ( ( ( ( ruleExprSimple ) ) )=> ( (lv_exprSimp_0_0= ruleExprSimple ) ) ) | ( (lv_exprAnd_1_0= ruleExprAnd ) ) )
            int alt10=2;
            switch ( input.LA(1) ) {
            case 33:
                {
                int LA10_1 = input.LA(2);

                if ( (synpred9_InternalWhileCpp()) ) {
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

                if ( (synpred9_InternalWhileCpp()) ) {
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

                if ( (synpred9_InternalWhileCpp()) ) {
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

                if ( (synpred9_InternalWhileCpp()) ) {
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
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1021:2: ( ( ( ( ruleExprSimple ) ) )=> ( (lv_exprSimp_0_0= ruleExprSimple ) ) )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1021:2: ( ( ( ( ruleExprSimple ) ) )=> ( (lv_exprSimp_0_0= ruleExprSimple ) ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1021:3: ( ( ( ruleExprSimple ) ) )=> ( (lv_exprSimp_0_0= ruleExprSimple ) )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1025:5: ( (lv_exprSimp_0_0= ruleExprSimple ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1026:1: (lv_exprSimp_0_0= ruleExprSimple )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1026:1: (lv_exprSimp_0_0= ruleExprSimple )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1027:3: lv_exprSimp_0_0= ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprAccess().getExprSimpExprSimpleParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExprSimple_in_ruleExpr2149);
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
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1044:6: ( (lv_exprAnd_1_0= ruleExprAnd ) )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1044:6: ( (lv_exprAnd_1_0= ruleExprAnd ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1045:1: (lv_exprAnd_1_0= ruleExprAnd )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1045:1: (lv_exprAnd_1_0= ruleExprAnd )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1046:3: lv_exprAnd_1_0= ruleExprAnd
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprAccess().getExprAndExprAndParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExprAnd_in_ruleExpr2177);
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
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1070:1: entryRuleExprSimple returns [EObject current=null] : iv_ruleExprSimple= ruleExprSimple EOF ;
    public final EObject entryRuleExprSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprSimple = null;


        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1071:2: (iv_ruleExprSimple= ruleExprSimple EOF )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1072:2: iv_ruleExprSimple= ruleExprSimple EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprSimpleRule()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_entryRuleExprSimple2213);
            iv_ruleExprSimple=ruleExprSimple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprSimple; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprSimple2223); if (state.failed) return current;

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
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1079:1: ruleExprSimple returns [EObject current=null] : ( ( ( (lv_nil_0_0= 'nil' ) ) | ( (lv_vari_1_0= RULE_VARIABLE ) ) | ( (lv_symb_2_0= RULE_SYMBOL ) ) ) | (otherlv_3= '(' ( (lv_exprCons_4_0= 'cons' ) ) ( (lv_exprConsAtt_5_0= ruleExpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_exprList_8_0= 'list' ) ) ( (lv_exprListAtt_9_0= ruleExpr ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_exprHead_12_0= 'hd' ) ) ( (lv_exprHeadAtt_13_0= ruleExpr ) ) otherlv_14= ')' ) | (otherlv_15= '(' ( (lv_exprTail_16_0= 'tl' ) ) ( (lv_exprTailAtt_17_0= ruleExpr ) ) otherlv_18= ')' ) | (otherlv_19= '(' ( (lv_nomSymb_20_0= RULE_SYMBOL ) ) ( (lv_symbAtt_21_0= ruleExpr ) ) otherlv_22= ')' ) ) ;
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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1082:28: ( ( ( ( (lv_nil_0_0= 'nil' ) ) | ( (lv_vari_1_0= RULE_VARIABLE ) ) | ( (lv_symb_2_0= RULE_SYMBOL ) ) ) | (otherlv_3= '(' ( (lv_exprCons_4_0= 'cons' ) ) ( (lv_exprConsAtt_5_0= ruleExpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_exprList_8_0= 'list' ) ) ( (lv_exprListAtt_9_0= ruleExpr ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_exprHead_12_0= 'hd' ) ) ( (lv_exprHeadAtt_13_0= ruleExpr ) ) otherlv_14= ')' ) | (otherlv_15= '(' ( (lv_exprTail_16_0= 'tl' ) ) ( (lv_exprTailAtt_17_0= ruleExpr ) ) otherlv_18= ')' ) | (otherlv_19= '(' ( (lv_nomSymb_20_0= RULE_SYMBOL ) ) ( (lv_symbAtt_21_0= ruleExpr ) ) otherlv_22= ')' ) ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1083:1: ( ( ( (lv_nil_0_0= 'nil' ) ) | ( (lv_vari_1_0= RULE_VARIABLE ) ) | ( (lv_symb_2_0= RULE_SYMBOL ) ) ) | (otherlv_3= '(' ( (lv_exprCons_4_0= 'cons' ) ) ( (lv_exprConsAtt_5_0= ruleExpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_exprList_8_0= 'list' ) ) ( (lv_exprListAtt_9_0= ruleExpr ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_exprHead_12_0= 'hd' ) ) ( (lv_exprHeadAtt_13_0= ruleExpr ) ) otherlv_14= ')' ) | (otherlv_15= '(' ( (lv_exprTail_16_0= 'tl' ) ) ( (lv_exprTailAtt_17_0= ruleExpr ) ) otherlv_18= ')' ) | (otherlv_19= '(' ( (lv_nomSymb_20_0= RULE_SYMBOL ) ) ( (lv_symbAtt_21_0= ruleExpr ) ) otherlv_22= ')' ) )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1083:1: ( ( ( (lv_nil_0_0= 'nil' ) ) | ( (lv_vari_1_0= RULE_VARIABLE ) ) | ( (lv_symb_2_0= RULE_SYMBOL ) ) ) | (otherlv_3= '(' ( (lv_exprCons_4_0= 'cons' ) ) ( (lv_exprConsAtt_5_0= ruleExpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_exprList_8_0= 'list' ) ) ( (lv_exprListAtt_9_0= ruleExpr ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_exprHead_12_0= 'hd' ) ) ( (lv_exprHeadAtt_13_0= ruleExpr ) ) otherlv_14= ')' ) | (otherlv_15= '(' ( (lv_exprTail_16_0= 'tl' ) ) ( (lv_exprTailAtt_17_0= ruleExpr ) ) otherlv_18= ')' ) | (otherlv_19= '(' ( (lv_nomSymb_20_0= RULE_SYMBOL ) ) ( (lv_symbAtt_21_0= ruleExpr ) ) otherlv_22= ')' ) )
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
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1083:2: ( ( (lv_nil_0_0= 'nil' ) ) | ( (lv_vari_1_0= RULE_VARIABLE ) ) | ( (lv_symb_2_0= RULE_SYMBOL ) ) )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1083:2: ( ( (lv_nil_0_0= 'nil' ) ) | ( (lv_vari_1_0= RULE_VARIABLE ) ) | ( (lv_symb_2_0= RULE_SYMBOL ) ) )
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
                            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1083:3: ( (lv_nil_0_0= 'nil' ) )
                            {
                            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1083:3: ( (lv_nil_0_0= 'nil' ) )
                            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1084:1: (lv_nil_0_0= 'nil' )
                            {
                            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1084:1: (lv_nil_0_0= 'nil' )
                            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1085:3: lv_nil_0_0= 'nil'
                            {
                            lv_nil_0_0=(Token)match(input,33,FOLLOW_33_in_ruleExprSimple2267); if (state.failed) return current;
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
                            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1099:6: ( (lv_vari_1_0= RULE_VARIABLE ) )
                            {
                            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1099:6: ( (lv_vari_1_0= RULE_VARIABLE ) )
                            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1100:1: (lv_vari_1_0= RULE_VARIABLE )
                            {
                            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1100:1: (lv_vari_1_0= RULE_VARIABLE )
                            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1101:3: lv_vari_1_0= RULE_VARIABLE
                            {
                            lv_vari_1_0=(Token)match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_ruleExprSimple2303); if (state.failed) return current;
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
                            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1118:6: ( (lv_symb_2_0= RULE_SYMBOL ) )
                            {
                            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1118:6: ( (lv_symb_2_0= RULE_SYMBOL ) )
                            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1119:1: (lv_symb_2_0= RULE_SYMBOL )
                            {
                            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1119:1: (lv_symb_2_0= RULE_SYMBOL )
                            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1120:3: lv_symb_2_0= RULE_SYMBOL
                            {
                            lv_symb_2_0=(Token)match(input,RULE_SYMBOL,FOLLOW_RULE_SYMBOL_in_ruleExprSimple2331); if (state.failed) return current;
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
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1137:6: (otherlv_3= '(' ( (lv_exprCons_4_0= 'cons' ) ) ( (lv_exprConsAtt_5_0= ruleExpr ) ) otherlv_6= ')' )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1137:6: (otherlv_3= '(' ( (lv_exprCons_4_0= 'cons' ) ) ( (lv_exprConsAtt_5_0= ruleExpr ) ) otherlv_6= ')' )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1137:8: otherlv_3= '(' ( (lv_exprCons_4_0= 'cons' ) ) ( (lv_exprConsAtt_5_0= ruleExpr ) ) otherlv_6= ')'
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleExprSimple2356); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1141:1: ( (lv_exprCons_4_0= 'cons' ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1142:1: (lv_exprCons_4_0= 'cons' )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1142:1: (lv_exprCons_4_0= 'cons' )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1143:3: lv_exprCons_4_0= 'cons'
                    {
                    lv_exprCons_4_0=(Token)match(input,35,FOLLOW_35_in_ruleExprSimple2374); if (state.failed) return current;
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

                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1156:2: ( (lv_exprConsAtt_5_0= ruleExpr ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1157:1: (lv_exprConsAtt_5_0= ruleExpr )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1157:1: (lv_exprConsAtt_5_0= ruleExpr )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1158:3: lv_exprConsAtt_5_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprSimpleAccess().getExprConsAttExprParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleExprSimple2408);
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

                    otherlv_6=(Token)match(input,36,FOLLOW_36_in_ruleExprSimple2420); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_1_3());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1179:6: (otherlv_7= '(' ( (lv_exprList_8_0= 'list' ) ) ( (lv_exprListAtt_9_0= ruleExpr ) ) otherlv_10= ')' )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1179:6: (otherlv_7= '(' ( (lv_exprList_8_0= 'list' ) ) ( (lv_exprListAtt_9_0= ruleExpr ) ) otherlv_10= ')' )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1179:8: otherlv_7= '(' ( (lv_exprList_8_0= 'list' ) ) ( (lv_exprListAtt_9_0= ruleExpr ) ) otherlv_10= ')'
                    {
                    otherlv_7=(Token)match(input,34,FOLLOW_34_in_ruleExprSimple2440); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1183:1: ( (lv_exprList_8_0= 'list' ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1184:1: (lv_exprList_8_0= 'list' )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1184:1: (lv_exprList_8_0= 'list' )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1185:3: lv_exprList_8_0= 'list'
                    {
                    lv_exprList_8_0=(Token)match(input,37,FOLLOW_37_in_ruleExprSimple2458); if (state.failed) return current;
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

                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1198:2: ( (lv_exprListAtt_9_0= ruleExpr ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1199:1: (lv_exprListAtt_9_0= ruleExpr )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1199:1: (lv_exprListAtt_9_0= ruleExpr )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1200:3: lv_exprListAtt_9_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprSimpleAccess().getExprListAttExprParserRuleCall_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleExprSimple2492);
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

                    otherlv_10=(Token)match(input,36,FOLLOW_36_in_ruleExprSimple2504); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_2_3());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1221:6: (otherlv_11= '(' ( (lv_exprHead_12_0= 'hd' ) ) ( (lv_exprHeadAtt_13_0= ruleExpr ) ) otherlv_14= ')' )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1221:6: (otherlv_11= '(' ( (lv_exprHead_12_0= 'hd' ) ) ( (lv_exprHeadAtt_13_0= ruleExpr ) ) otherlv_14= ')' )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1221:8: otherlv_11= '(' ( (lv_exprHead_12_0= 'hd' ) ) ( (lv_exprHeadAtt_13_0= ruleExpr ) ) otherlv_14= ')'
                    {
                    otherlv_11=(Token)match(input,34,FOLLOW_34_in_ruleExprSimple2524); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1225:1: ( (lv_exprHead_12_0= 'hd' ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1226:1: (lv_exprHead_12_0= 'hd' )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1226:1: (lv_exprHead_12_0= 'hd' )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1227:3: lv_exprHead_12_0= 'hd'
                    {
                    lv_exprHead_12_0=(Token)match(input,38,FOLLOW_38_in_ruleExprSimple2542); if (state.failed) return current;
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

                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1240:2: ( (lv_exprHeadAtt_13_0= ruleExpr ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1241:1: (lv_exprHeadAtt_13_0= ruleExpr )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1241:1: (lv_exprHeadAtt_13_0= ruleExpr )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1242:3: lv_exprHeadAtt_13_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprSimpleAccess().getExprHeadAttExprParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleExprSimple2576);
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

                    otherlv_14=(Token)match(input,36,FOLLOW_36_in_ruleExprSimple2588); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_3_3());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1263:6: (otherlv_15= '(' ( (lv_exprTail_16_0= 'tl' ) ) ( (lv_exprTailAtt_17_0= ruleExpr ) ) otherlv_18= ')' )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1263:6: (otherlv_15= '(' ( (lv_exprTail_16_0= 'tl' ) ) ( (lv_exprTailAtt_17_0= ruleExpr ) ) otherlv_18= ')' )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1263:8: otherlv_15= '(' ( (lv_exprTail_16_0= 'tl' ) ) ( (lv_exprTailAtt_17_0= ruleExpr ) ) otherlv_18= ')'
                    {
                    otherlv_15=(Token)match(input,34,FOLLOW_34_in_ruleExprSimple2608); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_4_0());
                          
                    }
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1267:1: ( (lv_exprTail_16_0= 'tl' ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1268:1: (lv_exprTail_16_0= 'tl' )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1268:1: (lv_exprTail_16_0= 'tl' )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1269:3: lv_exprTail_16_0= 'tl'
                    {
                    lv_exprTail_16_0=(Token)match(input,39,FOLLOW_39_in_ruleExprSimple2626); if (state.failed) return current;
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

                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1282:2: ( (lv_exprTailAtt_17_0= ruleExpr ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1283:1: (lv_exprTailAtt_17_0= ruleExpr )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1283:1: (lv_exprTailAtt_17_0= ruleExpr )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1284:3: lv_exprTailAtt_17_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprSimpleAccess().getExprTailAttExprParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleExprSimple2660);
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

                    otherlv_18=(Token)match(input,36,FOLLOW_36_in_ruleExprSimple2672); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_4_3());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1305:6: (otherlv_19= '(' ( (lv_nomSymb_20_0= RULE_SYMBOL ) ) ( (lv_symbAtt_21_0= ruleExpr ) ) otherlv_22= ')' )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1305:6: (otherlv_19= '(' ( (lv_nomSymb_20_0= RULE_SYMBOL ) ) ( (lv_symbAtt_21_0= ruleExpr ) ) otherlv_22= ')' )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1305:8: otherlv_19= '(' ( (lv_nomSymb_20_0= RULE_SYMBOL ) ) ( (lv_symbAtt_21_0= ruleExpr ) ) otherlv_22= ')'
                    {
                    otherlv_19=(Token)match(input,34,FOLLOW_34_in_ruleExprSimple2692); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_5_0());
                          
                    }
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1309:1: ( (lv_nomSymb_20_0= RULE_SYMBOL ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1310:1: (lv_nomSymb_20_0= RULE_SYMBOL )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1310:1: (lv_nomSymb_20_0= RULE_SYMBOL )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1311:3: lv_nomSymb_20_0= RULE_SYMBOL
                    {
                    lv_nomSymb_20_0=(Token)match(input,RULE_SYMBOL,FOLLOW_RULE_SYMBOL_in_ruleExprSimple2709); if (state.failed) return current;
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

                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1327:2: ( (lv_symbAtt_21_0= ruleExpr ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1328:1: (lv_symbAtt_21_0= ruleExpr )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1328:1: (lv_symbAtt_21_0= ruleExpr )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1329:3: lv_symbAtt_21_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprSimpleAccess().getSymbAttExprParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleExprSimple2735);
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

                    otherlv_22=(Token)match(input,36,FOLLOW_36_in_ruleExprSimple2747); if (state.failed) return current;
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
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1357:1: entryRuleExprAnd returns [EObject current=null] : iv_ruleExprAnd= ruleExprAnd EOF ;
    public final EObject entryRuleExprAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprAnd = null;


        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1358:2: (iv_ruleExprAnd= ruleExprAnd EOF )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1359:2: iv_ruleExprAnd= ruleExprAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprAndRule()); 
            }
            pushFollow(FOLLOW_ruleExprAnd_in_entryRuleExprAnd2784);
            iv_ruleExprAnd=ruleExprAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprAnd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprAnd2794); if (state.failed) return current;

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
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1366:1: ruleExprAnd returns [EObject current=null] : ( ( (lv_exprOr_0_0= ruleExprOr ) ) ( ( (lv_exprAnd_1_0= 'and' ) ) ( (lv_exprAndAtt_2_0= ruleExprAnd ) ) )? ) ;
    public final EObject ruleExprAnd() throws RecognitionException {
        EObject current = null;

        Token lv_exprAnd_1_0=null;
        EObject lv_exprOr_0_0 = null;

        EObject lv_exprAndAtt_2_0 = null;


         enterRule(); 
            
        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1369:28: ( ( ( (lv_exprOr_0_0= ruleExprOr ) ) ( ( (lv_exprAnd_1_0= 'and' ) ) ( (lv_exprAndAtt_2_0= ruleExprAnd ) ) )? ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1370:1: ( ( (lv_exprOr_0_0= ruleExprOr ) ) ( ( (lv_exprAnd_1_0= 'and' ) ) ( (lv_exprAndAtt_2_0= ruleExprAnd ) ) )? )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1370:1: ( ( (lv_exprOr_0_0= ruleExprOr ) ) ( ( (lv_exprAnd_1_0= 'and' ) ) ( (lv_exprAndAtt_2_0= ruleExprAnd ) ) )? )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1370:2: ( (lv_exprOr_0_0= ruleExprOr ) ) ( ( (lv_exprAnd_1_0= 'and' ) ) ( (lv_exprAndAtt_2_0= ruleExprAnd ) ) )?
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1370:2: ( (lv_exprOr_0_0= ruleExprOr ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1371:1: (lv_exprOr_0_0= ruleExprOr )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1371:1: (lv_exprOr_0_0= ruleExprOr )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1372:3: lv_exprOr_0_0= ruleExprOr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExprAndAccess().getExprOrExprOrParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExprOr_in_ruleExprAnd2840);
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

            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1388:2: ( ( (lv_exprAnd_1_0= 'and' ) ) ( (lv_exprAndAtt_2_0= ruleExprAnd ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==40) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1388:3: ( (lv_exprAnd_1_0= 'and' ) ) ( (lv_exprAndAtt_2_0= ruleExprAnd ) )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1388:3: ( (lv_exprAnd_1_0= 'and' ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1389:1: (lv_exprAnd_1_0= 'and' )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1389:1: (lv_exprAnd_1_0= 'and' )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1390:3: lv_exprAnd_1_0= 'and'
                    {
                    lv_exprAnd_1_0=(Token)match(input,40,FOLLOW_40_in_ruleExprAnd2859); if (state.failed) return current;
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

                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1403:2: ( (lv_exprAndAtt_2_0= ruleExprAnd ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1404:1: (lv_exprAndAtt_2_0= ruleExprAnd )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1404:1: (lv_exprAndAtt_2_0= ruleExprAnd )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1405:3: lv_exprAndAtt_2_0= ruleExprAnd
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprAndAccess().getExprAndAttExprAndParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExprAnd_in_ruleExprAnd2893);
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
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1429:1: entryRuleExprOr returns [EObject current=null] : iv_ruleExprOr= ruleExprOr EOF ;
    public final EObject entryRuleExprOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprOr = null;


        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1430:2: (iv_ruleExprOr= ruleExprOr EOF )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1431:2: iv_ruleExprOr= ruleExprOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprOrRule()); 
            }
            pushFollow(FOLLOW_ruleExprOr_in_entryRuleExprOr2931);
            iv_ruleExprOr=ruleExprOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprOr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprOr2941); if (state.failed) return current;

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
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1438:1: ruleExprOr returns [EObject current=null] : ( ( (lv_exprNot_0_0= ruleExprNot ) ) ( ( (lv_exprOr_1_0= 'or' ) ) ( (lv_exprOrAtt_2_0= ruleExprOr ) ) )? ) ;
    public final EObject ruleExprOr() throws RecognitionException {
        EObject current = null;

        Token lv_exprOr_1_0=null;
        EObject lv_exprNot_0_0 = null;

        EObject lv_exprOrAtt_2_0 = null;


         enterRule(); 
            
        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1441:28: ( ( ( (lv_exprNot_0_0= ruleExprNot ) ) ( ( (lv_exprOr_1_0= 'or' ) ) ( (lv_exprOrAtt_2_0= ruleExprOr ) ) )? ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1442:1: ( ( (lv_exprNot_0_0= ruleExprNot ) ) ( ( (lv_exprOr_1_0= 'or' ) ) ( (lv_exprOrAtt_2_0= ruleExprOr ) ) )? )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1442:1: ( ( (lv_exprNot_0_0= ruleExprNot ) ) ( ( (lv_exprOr_1_0= 'or' ) ) ( (lv_exprOrAtt_2_0= ruleExprOr ) ) )? )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1442:2: ( (lv_exprNot_0_0= ruleExprNot ) ) ( ( (lv_exprOr_1_0= 'or' ) ) ( (lv_exprOrAtt_2_0= ruleExprOr ) ) )?
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1442:2: ( (lv_exprNot_0_0= ruleExprNot ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1443:1: (lv_exprNot_0_0= ruleExprNot )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1443:1: (lv_exprNot_0_0= ruleExprNot )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1444:3: lv_exprNot_0_0= ruleExprNot
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExprOrAccess().getExprNotExprNotParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExprNot_in_ruleExprOr2987);
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

            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1460:2: ( ( (lv_exprOr_1_0= 'or' ) ) ( (lv_exprOrAtt_2_0= ruleExprOr ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==41) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1460:3: ( (lv_exprOr_1_0= 'or' ) ) ( (lv_exprOrAtt_2_0= ruleExprOr ) )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1460:3: ( (lv_exprOr_1_0= 'or' ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1461:1: (lv_exprOr_1_0= 'or' )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1461:1: (lv_exprOr_1_0= 'or' )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1462:3: lv_exprOr_1_0= 'or'
                    {
                    lv_exprOr_1_0=(Token)match(input,41,FOLLOW_41_in_ruleExprOr3006); if (state.failed) return current;
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

                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1475:2: ( (lv_exprOrAtt_2_0= ruleExprOr ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1476:1: (lv_exprOrAtt_2_0= ruleExprOr )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1476:1: (lv_exprOrAtt_2_0= ruleExprOr )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1477:3: lv_exprOrAtt_2_0= ruleExprOr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprOrAccess().getExprOrAttExprOrParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExprOr_in_ruleExprOr3040);
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
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1501:1: entryRuleExprNot returns [EObject current=null] : iv_ruleExprNot= ruleExprNot EOF ;
    public final EObject entryRuleExprNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprNot = null;


        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1502:2: (iv_ruleExprNot= ruleExprNot EOF )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1503:2: iv_ruleExprNot= ruleExprNot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprNotRule()); 
            }
            pushFollow(FOLLOW_ruleExprNot_in_entryRuleExprNot3078);
            iv_ruleExprNot=ruleExprNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprNot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprNot3088); if (state.failed) return current;

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
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1510:1: ruleExprNot returns [EObject current=null] : ( ( (lv_not_0_0= 'not' ) )? ( (lv_exprEq_1_0= ruleExprEq ) ) ) ;
    public final EObject ruleExprNot() throws RecognitionException {
        EObject current = null;

        Token lv_not_0_0=null;
        EObject lv_exprEq_1_0 = null;


         enterRule(); 
            
        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1513:28: ( ( ( (lv_not_0_0= 'not' ) )? ( (lv_exprEq_1_0= ruleExprEq ) ) ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1514:1: ( ( (lv_not_0_0= 'not' ) )? ( (lv_exprEq_1_0= ruleExprEq ) ) )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1514:1: ( ( (lv_not_0_0= 'not' ) )? ( (lv_exprEq_1_0= ruleExprEq ) ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1514:2: ( (lv_not_0_0= 'not' ) )? ( (lv_exprEq_1_0= ruleExprEq ) )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1514:2: ( (lv_not_0_0= 'not' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==42) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1515:1: (lv_not_0_0= 'not' )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1515:1: (lv_not_0_0= 'not' )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1516:3: lv_not_0_0= 'not'
                    {
                    lv_not_0_0=(Token)match(input,42,FOLLOW_42_in_ruleExprNot3131); if (state.failed) return current;
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

            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1529:3: ( (lv_exprEq_1_0= ruleExprEq ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1530:1: (lv_exprEq_1_0= ruleExprEq )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1530:1: (lv_exprEq_1_0= ruleExprEq )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1531:3: lv_exprEq_1_0= ruleExprEq
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExprNotAccess().getExprEqExprEqParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExprEq_in_ruleExprNot3166);
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
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1555:1: entryRuleExprEq returns [EObject current=null] : iv_ruleExprEq= ruleExprEq EOF ;
    public final EObject entryRuleExprEq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprEq = null;


        try {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1556:2: (iv_ruleExprEq= ruleExprEq EOF )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1557:2: iv_ruleExprEq= ruleExprEq EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprEqRule()); 
            }
            pushFollow(FOLLOW_ruleExprEq_in_entryRuleExprEq3202);
            iv_ruleExprEq=ruleExprEq();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprEq; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprEq3212); if (state.failed) return current;

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
    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1564:1: ruleExprEq returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ')' ) | ( ( (lv_exprSim1_3_0= ruleExprSimple ) ) otherlv_4= '=?' ( (lv_exprSim2_5_0= ruleExprSimple ) ) ) ) ;
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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1567:28: ( ( (otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ')' ) | ( ( (lv_exprSim1_3_0= ruleExprSimple ) ) otherlv_4= '=?' ( (lv_exprSim2_5_0= ruleExprSimple ) ) ) ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1568:1: ( (otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ')' ) | ( ( (lv_exprSim1_3_0= ruleExprSimple ) ) otherlv_4= '=?' ( (lv_exprSim2_5_0= ruleExprSimple ) ) ) )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1568:1: ( (otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ')' ) | ( ( (lv_exprSim1_3_0= ruleExprSimple ) ) otherlv_4= '=?' ( (lv_exprSim2_5_0= ruleExprSimple ) ) ) )
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
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1568:2: (otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ')' )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1568:2: (otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ')' )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1568:4: otherlv_0= '(' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleExprEq3250); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getExprEqAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1572:1: ( (lv_expr_1_0= ruleExpr ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1573:1: (lv_expr_1_0= ruleExpr )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1573:1: (lv_expr_1_0= ruleExpr )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1574:3: lv_expr_1_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprEqAccess().getExprExprParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleExprEq3271);
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

                    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleExprEq3283); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getExprEqAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1595:6: ( ( (lv_exprSim1_3_0= ruleExprSimple ) ) otherlv_4= '=?' ( (lv_exprSim2_5_0= ruleExprSimple ) ) )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1595:6: ( ( (lv_exprSim1_3_0= ruleExprSimple ) ) otherlv_4= '=?' ( (lv_exprSim2_5_0= ruleExprSimple ) ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1595:7: ( (lv_exprSim1_3_0= ruleExprSimple ) ) otherlv_4= '=?' ( (lv_exprSim2_5_0= ruleExprSimple ) )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1595:7: ( (lv_exprSim1_3_0= ruleExprSimple ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1596:1: (lv_exprSim1_3_0= ruleExprSimple )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1596:1: (lv_exprSim1_3_0= ruleExprSimple )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1597:3: lv_exprSim1_3_0= ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprEqAccess().getExprSim1ExprSimpleParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExprSimple_in_ruleExprEq3312);
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

                    otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleExprEq3324); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getExprEqAccess().getEqualsSignQuestionMarkKeyword_1_1());
                          
                    }
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1617:1: ( (lv_exprSim2_5_0= ruleExprSimple ) )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1618:1: (lv_exprSim2_5_0= ruleExprSimple )
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1618:1: (lv_exprSim2_5_0= ruleExprSimple )
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1619:3: lv_exprSim2_5_0= ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprEqAccess().getExprSim2ExprSimpleParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExprSimple_in_ruleExprEq3345);
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
        // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:463:3: ( ( ( ( ruleCommand ) ) ';' ) )
        // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:463:4: ( ( ( ruleCommand ) ) ';' )
        {
        // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:463:4: ( ( ( ruleCommand ) ) ';' )
        // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:463:5: ( ( ruleCommand ) ) ';'
        {
        // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:463:5: ( ( ruleCommand ) )
        // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:464:1: ( ruleCommand )
        {
        // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:464:1: ( ruleCommand )
        // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:465:1: ruleCommand
        {
        pushFollow(FOLLOW_ruleCommand_in_synpred2_InternalWhileCpp945);
        ruleCommand();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,20,FOLLOW_20_in_synpred2_InternalWhileCpp951); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalWhileCpp

    // $ANTLR start synpred8_InternalWhileCpp
    public final void synpred8_InternalWhileCpp_fragment() throws RecognitionException {   
        // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:955:3: ( ( ( ( ruleExpr ) ) ',' ) )
        // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:955:4: ( ( ( ruleExpr ) ) ',' )
        {
        // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:955:4: ( ( ( ruleExpr ) ) ',' )
        // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:955:5: ( ( ruleExpr ) ) ','
        {
        // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:955:5: ( ( ruleExpr ) )
        // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:956:1: ( ruleExpr )
        {
        // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:956:1: ( ruleExpr )
        // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:957:1: ruleExpr
        {
        pushFollow(FOLLOW_ruleExpr_in_synpred8_InternalWhileCpp1983);
        ruleExpr();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,19,FOLLOW_19_in_synpred8_InternalWhileCpp1989); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalWhileCpp

    // $ANTLR start synpred9_InternalWhileCpp
    public final void synpred9_InternalWhileCpp_fragment() throws RecognitionException {   
        // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1021:3: ( ( ( ruleExprSimple ) ) )
        // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1021:4: ( ( ruleExprSimple ) )
        {
        // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1021:4: ( ( ruleExprSimple ) )
        // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1022:1: ( ruleExprSimple )
        {
        // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1022:1: ( ruleExprSimple )
        // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1023:1: ruleExprSimple
        {
        pushFollow(FOLLOW_ruleExprSimple_in_synpred9_InternalWhileCpp2130);
        ruleExprSimple();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred9_InternalWhileCpp

    // Delegated rules

    public final boolean synpred9_InternalWhileCpp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalWhileCpp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public static final BitSet FOLLOW_17_in_ruleDefinition384 = new BitSet(new long[]{0x0000000089A00020L});
    public static final BitSet FOLLOW_ruleCommands_in_ruleDefinition423 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDefinition435 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDefinition447 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleOutput_in_ruleDefinition468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_entryRuleInput504 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInput514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_ruleInput557 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleInput574 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_ruleInput593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutput_in_entryRuleOutput634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutput644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_ruleOutput687 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleOutput704 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_ruleOutput723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_entryRuleVars764 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVars774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_ruleVars817 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleVars834 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_ruleVars853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_entryRuleCommands894 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommands904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleCommands970 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCommands982 = new BitSet(new long[]{0x0000000089A00020L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleCommands1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand1042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleCommand1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_ruleCommand1136 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleCommand1148 = new BitSet(new long[]{0x0000040600000030L});
    public static final BitSet FOLLOW_ruleExprs_in_ruleCommand1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandWhile_in_ruleCommand1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandIf_in_ruleCommand1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandForEach_in_ruleCommand1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandWhile_in_entryRuleCommandWhile1305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommandWhile1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleCommandWhile1359 = new BitSet(new long[]{0x0000040600000030L});
    public static final BitSet FOLLOW_24_in_ruleCommandWhile1390 = new BitSet(new long[]{0x0000040600000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleCommandWhile1412 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleCommandWhile1424 = new BitSet(new long[]{0x0000000089A00020L});
    public static final BitSet FOLLOW_ruleCommands_in_ruleCommandWhile1463 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleCommandWhile1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandIf_in_entryRuleCommandIf1511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommandIf1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleCommandIf1558 = new BitSet(new long[]{0x0000040600000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleCommandIf1579 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCommandIf1591 = new BitSet(new long[]{0x0000000089A00020L});
    public static final BitSet FOLLOW_ruleCommands_in_ruleCommandIf1630 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29_in_ruleCommandIf1643 = new BitSet(new long[]{0x0000000089A00020L});
    public static final BitSet FOLLOW_ruleCommands_in_ruleCommandIf1682 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleCommandIf1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommandForEach_in_entryRuleCommandForEach1732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommandForEach1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleCommandForEach1779 = new BitSet(new long[]{0x0000040600000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleCommandForEach1800 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleCommandForEach1812 = new BitSet(new long[]{0x0000040600000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleCommandForEach1833 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleCommandForEach1845 = new BitSet(new long[]{0x0000000089A00020L});
    public static final BitSet FOLLOW_ruleCommands_in_ruleCommandForEach1884 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleCommandForEach1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprs_in_entryRuleExprs1932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprs1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprs2008 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleExprs2020 = new BitSet(new long[]{0x0000040600000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprs2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr2080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_ruleExpr2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_ruleExpr2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_entryRuleExprSimple2213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprSimple2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleExprSimple2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_ruleExprSimple2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOL_in_ruleExprSimple2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleExprSimple2356 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleExprSimple2374 = new BitSet(new long[]{0x0000040600000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprSimple2408 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleExprSimple2420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleExprSimple2440 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleExprSimple2458 = new BitSet(new long[]{0x0000040600000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprSimple2492 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleExprSimple2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleExprSimple2524 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleExprSimple2542 = new BitSet(new long[]{0x0000040600000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprSimple2576 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleExprSimple2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleExprSimple2608 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleExprSimple2626 = new BitSet(new long[]{0x0000040600000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprSimple2660 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleExprSimple2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleExprSimple2692 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_SYMBOL_in_ruleExprSimple2709 = new BitSet(new long[]{0x0000040600000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprSimple2735 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleExprSimple2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprAnd_in_entryRuleExprAnd2784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprAnd2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_ruleExprAnd2840 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleExprAnd2859 = new BitSet(new long[]{0x0000040600000030L});
    public static final BitSet FOLLOW_ruleExprAnd_in_ruleExprAnd2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprOr_in_entryRuleExprOr2931 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprOr2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprNot_in_ruleExprOr2987 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleExprOr3006 = new BitSet(new long[]{0x0000040600000030L});
    public static final BitSet FOLLOW_ruleExprOr_in_ruleExprOr3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprNot_in_entryRuleExprNot3078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprNot3088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleExprNot3131 = new BitSet(new long[]{0x0000040600000030L});
    public static final BitSet FOLLOW_ruleExprEq_in_ruleExprNot3166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprEq_in_entryRuleExprEq3202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprEq3212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleExprEq3250 = new BitSet(new long[]{0x0000040600000030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprEq3271 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleExprEq3283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_ruleExprEq3312 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleExprEq3324 = new BitSet(new long[]{0x0000000600000030L});
    public static final BitSet FOLLOW_ruleExprSimple_in_ruleExprEq3345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_synpred2_InternalWhileCpp945 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_synpred2_InternalWhileCpp951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_synpred8_InternalWhileCpp1983 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_synpred8_InternalWhileCpp1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_synpred9_InternalWhileCpp2130 = new BitSet(new long[]{0x0000000000000002L});

}