package org.xtext.example.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWhileCppLexer extends Lexer {
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

    public InternalWhileCppLexer() {;} 
    public InternalWhileCppLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalWhileCppLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:11:7: ( 'for' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:11:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:12:7: ( 'function' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:12:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:13:7: ( ':' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:13:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:14:7: ( 'read' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:14:9: 'read'
            {
            match("read"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:15:7: ( '%' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:15:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:16:7: ( 'write' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:16:9: 'write'
            {
            match("write"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:17:7: ( ',' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:17:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:18:7: ( ';' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:18:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:19:7: ( ':=' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:19:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:20:7: ( 'do' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:20:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:21:7: ( 'od' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:21:9: 'od'
            {
            match("od"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:22:7: ( 'if' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:22:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:23:7: ( 'then' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:23:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:24:7: ( 'fi' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:24:9: 'fi'
            {
            match("fi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:25:7: ( 'else' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:25:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:26:7: ( 'foreach' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:26:9: 'foreach'
            {
            match("foreach"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:27:7: ( 'in' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:27:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:28:7: ( '(' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:28:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:29:7: ( ')' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:29:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:30:7: ( '=?' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:30:9: '=?'
            {
            match("=?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:31:7: ( 'nop' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:31:9: 'nop'
            {
            match("nop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:32:7: ( 'while' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:32:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:33:7: ( 'nil' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:33:9: 'nil'
            {
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:34:7: ( 'cons' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:34:9: 'cons'
            {
            match("cons"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:35:7: ( 'list' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:35:9: 'list'
            {
            match("list"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:36:7: ( 'hd' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:36:9: 'hd'
            {
            match("hd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:37:7: ( 'tl' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:37:9: 'tl'
            {
            match("tl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:38:7: ( 'and' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:38:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:39:7: ( 'or' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:39:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:40:7: ( 'not' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:40:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "RULE_VARIABLE"
    public final void mRULE_VARIABLE() throws RecognitionException {
        try {
            int _type = RULE_VARIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4607:15: ( 'A' .. 'Z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )* )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4607:17: 'A' .. 'Z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )*
            {
            matchRange('A','Z'); 
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4607:26: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VARIABLE"

    // $ANTLR start "RULE_SYMBOL"
    public final void mRULE_SYMBOL() throws RecognitionException {
        try {
            int _type = RULE_SYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4609:13: ( 'a' .. 'z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )* )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4609:15: 'a' .. 'z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )*
            {
            matchRange('a','z'); 
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4609:24: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SYMBOL"

    // $ANTLR start "RULE_LC"
    public final void mRULE_LC() throws RecognitionException {
        try {
            int _type = RULE_LC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4611:9: ( ( ' ' )* )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4611:11: ( ' ' )*
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4611:11: ( ' ' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4611:11: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LC"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4613:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4613:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4613:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4613:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4613:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4615:10: ( ( '0' .. '9' )+ )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4615:12: ( '0' .. '9' )+
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4615:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4615:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4617:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4617:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4617:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4617:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4617:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4617:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4617:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4617:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4617:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4617:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4617:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4619:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4619:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4619:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4619:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4621:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4621:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4621:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4621:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4621:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4621:41: ( '\\r' )? '\\n'
                    {
                    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4621:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4621:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4623:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4623:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4623:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4625:16: ( . )
            // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:4625:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_VARIABLE | RULE_SYMBOL | RULE_LC | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=40;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:190: RULE_VARIABLE
                {
                mRULE_VARIABLE(); 

                }
                break;
            case 32 :
                // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:204: RULE_SYMBOL
                {
                mRULE_SYMBOL(); 

                }
                break;
            case 33 :
                // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:216: RULE_LC
                {
                mRULE_LC(); 

                }
                break;
            case 34 :
                // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:224: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 35 :
                // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:232: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 36 :
                // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:241: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 37 :
                // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:253: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 38 :
                // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:269: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 39 :
                // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:285: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 40 :
                // ../whileComp.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalWhileCpp.g:1:293: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\30\1\45\1\47\1\45\1\uffff\1\45\2\uffff\5\45\2\uffff\1\40\5\45\1\100\1\45\1\30\1\uffff\1\40\2\uffff\3\40\2\uffff\2\45\1\112\1\45\3\uffff\1\45\1\uffff\2\45\2\uffff\1\116\1\117\1\120\1\121\1\122\1\45\1\124\1\45\3\uffff\4\45\1\133\1\45\1\100\1\uffff\1\30\6\uffff\1\136\1\45\1\uffff\3\45\5\uffff\1\45\1\uffff\1\45\1\145\1\146\1\147\2\45\1\uffff\1\152\1\45\1\uffff\1\45\1\155\2\45\1\160\1\161\3\uffff\1\162\1\163\1\uffff\2\45\1\uffff\1\166\1\167\4\uffff\2\45\2\uffff\1\172\1\45\1\uffff\1\174\1\uffff";
    static final String DFA15_eofS =
        "\175\uffff";
    static final String DFA15_minS =
        "\1\0\1\60\1\75\1\60\1\uffff\1\60\2\uffff\5\60\2\uffff\1\77\7\60\1\11\1\uffff\1\101\2\uffff\2\0\1\52\2\uffff\4\60\3\uffff\1\60\1\uffff\2\60\2\uffff\10\60\3\uffff\7\60\1\uffff\1\11\6\uffff\2\60\1\uffff\3\60\5\uffff\1\60\1\uffff\6\60\1\uffff\2\60\1\uffff\6\60\3\uffff\2\60\1\uffff\2\60\1\uffff\2\60\4\uffff\2\60\2\uffff\2\60\1\uffff\1\60\1\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\172\1\75\1\172\1\uffff\1\172\2\uffff\5\172\2\uffff\1\77\7\172\1\40\1\uffff\1\172\2\uffff\2\uffff\1\57\2\uffff\4\172\3\uffff\1\172\1\uffff\2\172\2\uffff\10\172\3\uffff\7\172\1\uffff\1\40\6\uffff\2\172\1\uffff\3\172\5\uffff\1\172\1\uffff\6\172\1\uffff\2\172\1\uffff\6\172\3\uffff\2\172\1\uffff\2\172\1\uffff\2\172\4\uffff\2\172\2\uffff\2\172\1\uffff\1\172\1\uffff";
    static final String DFA15_acceptS =
        "\4\uffff\1\5\1\uffff\1\7\1\10\5\uffff\1\22\1\23\11\uffff\1\41\1\uffff\1\42\1\43\3\uffff\1\47\1\50\4\uffff\1\40\1\11\1\3\1\uffff\1\5\2\uffff\1\7\1\10\10\uffff\1\22\1\23\1\24\7\uffff\1\37\1\uffff\1\47\1\42\1\43\1\44\1\45\1\46\2\uffff\1\16\3\uffff\1\12\1\13\1\35\1\14\1\21\1\uffff\1\33\6\uffff\1\32\2\uffff\1\1\6\uffff\1\25\1\36\1\27\2\uffff\1\34\2\uffff\1\4\2\uffff\1\15\1\17\1\30\1\31\2\uffff\1\6\1\26\2\uffff\1\20\1\uffff\1\2";
    static final String DFA15_specialS =
        "\1\1\33\uffff\1\0\1\2\137\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\40\2\37\2\40\1\37\22\40\1\27\1\40\1\34\2\40\1\4\1\40\1\35\1\15\1\16\2\40\1\6\2\40\1\36\12\33\1\2\1\7\1\40\1\17\3\40\32\25\3\40\1\31\1\32\1\40\1\24\1\26\1\21\1\10\1\14\1\1\1\26\1\23\1\12\2\26\1\22\1\26\1\20\1\11\2\26\1\3\1\26\1\13\2\26\1\5\3\26\uff85\40",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\10\44\1\43\5\44\1\41\5\44\1\42\5\44",
            "\1\46",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\4\44\1\50\25\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\7\44\1\53\11\44\1\52\10\44",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\16\44\1\56\13\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\3\44\1\57\15\44\1\60\10\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\5\44\1\61\7\44\1\62\14\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\7\44\1\63\3\44\1\64\16\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\13\44\1\65\16\44",
            "",
            "",
            "\1\70",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\10\44\1\72\5\44\1\71\13\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\16\44\1\73\13\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\10\44\1\74\21\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\3\44\1\75\26\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\15\44\1\76\14\44",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\2\102\2\uffff\1\102\22\uffff\1\101",
            "",
            "\32\103\4\uffff\1\103\1\uffff\32\103",
            "",
            "",
            "\0\105",
            "\0\105",
            "\1\106\4\uffff\1\107",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\21\44\1\110\10\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\15\44\1\111\14\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\1\113\31\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\10\44\1\114\21\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\10\44\1\115\21\44",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\4\44\1\123\25\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\22\44\1\125\7\44",
            "",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\17\44\1\126\3\44\1\127\6\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\13\44\1\130\16\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\15\44\1\131\14\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\22\44\1\132\7\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\3\44\1\134\26\44",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "",
            "\2\102\2\uffff\1\102\22\uffff\1\101",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\4\44\1\135\25\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\2\44\1\137\27\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\3\44\1\140\26\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\23\44\1\141\6\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\13\44\1\142\16\44",
            "",
            "",
            "",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\15\44\1\143\14\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\4\44\1\144\25\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\22\44\1\150\7\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\23\44\1\151\6\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\1\153\31\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\23\44\1\154\6\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\4\44\1\156\25\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\4\44\1\157\25\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\2\44\1\164\27\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\10\44\1\165\21\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\7\44\1\170\22\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\16\44\1\171\13\44",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\15\44\1\173\14\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_VARIABLE | RULE_SYMBOL | RULE_LC | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_28 = input.LA(1);

                        s = -1;
                        if ( ((LA15_28>='\u0000' && LA15_28<='\uFFFF')) ) {s = 69;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='f') ) {s = 1;}

                        else if ( (LA15_0==':') ) {s = 2;}

                        else if ( (LA15_0=='r') ) {s = 3;}

                        else if ( (LA15_0=='%') ) {s = 4;}

                        else if ( (LA15_0=='w') ) {s = 5;}

                        else if ( (LA15_0==',') ) {s = 6;}

                        else if ( (LA15_0==';') ) {s = 7;}

                        else if ( (LA15_0=='d') ) {s = 8;}

                        else if ( (LA15_0=='o') ) {s = 9;}

                        else if ( (LA15_0=='i') ) {s = 10;}

                        else if ( (LA15_0=='t') ) {s = 11;}

                        else if ( (LA15_0=='e') ) {s = 12;}

                        else if ( (LA15_0=='(') ) {s = 13;}

                        else if ( (LA15_0==')') ) {s = 14;}

                        else if ( (LA15_0=='=') ) {s = 15;}

                        else if ( (LA15_0=='n') ) {s = 16;}

                        else if ( (LA15_0=='c') ) {s = 17;}

                        else if ( (LA15_0=='l') ) {s = 18;}

                        else if ( (LA15_0=='h') ) {s = 19;}

                        else if ( (LA15_0=='a') ) {s = 20;}

                        else if ( ((LA15_0>='A' && LA15_0<='Z')) ) {s = 21;}

                        else if ( (LA15_0=='b'||LA15_0=='g'||(LA15_0>='j' && LA15_0<='k')||LA15_0=='m'||(LA15_0>='p' && LA15_0<='q')||LA15_0=='s'||(LA15_0>='u' && LA15_0<='v')||(LA15_0>='x' && LA15_0<='z')) ) {s = 22;}

                        else if ( (LA15_0==' ') ) {s = 23;}

                        else if ( (LA15_0=='^') ) {s = 25;}

                        else if ( (LA15_0=='_') ) {s = 26;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 27;}

                        else if ( (LA15_0=='\"') ) {s = 28;}

                        else if ( (LA15_0=='\'') ) {s = 29;}

                        else if ( (LA15_0=='/') ) {s = 30;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r') ) {s = 31;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='#' && LA15_0<='$')||LA15_0=='&'||(LA15_0>='*' && LA15_0<='+')||(LA15_0>='-' && LA15_0<='.')||LA15_0=='<'||(LA15_0>='>' && LA15_0<='@')||(LA15_0>='[' && LA15_0<=']')||LA15_0=='`'||(LA15_0>='{' && LA15_0<='\uFFFF')) ) {s = 32;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_29 = input.LA(1);

                        s = -1;
                        if ( ((LA15_29>='\u0000' && LA15_29<='\uFFFF')) ) {s = 69;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}