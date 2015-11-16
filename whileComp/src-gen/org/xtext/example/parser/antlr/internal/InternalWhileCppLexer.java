package org.xtext.example.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


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
    public String getGrammarFileName() { return "../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:11:7: ( 'function' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:11:9: 'function'
            {
            match("function"); 


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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:12:7: ( ':' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:12:9: ':'
            {
            match(':'); 

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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:13:7: ( 'read' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:13:9: 'read'
            {
            match("read"); 


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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:14:7: ( '%' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:14:9: '%'
            {
            match('%'); 

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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:15:7: ( 'write' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:15:9: 'write'
            {
            match("write"); 


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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:16:7: ( ',' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:16:9: ','
            {
            match(','); 

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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:17:7: ( ';' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:17:9: ';'
            {
            match(';'); 

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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:18:7: ( 'nop' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:18:9: 'nop'
            {
            match("nop"); 


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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:19:7: ( ':=' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:19:9: ':='
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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:20:7: ( 'while' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:20:9: 'while'
            {
            match("while"); 


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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:21:7: ( 'for' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:21:9: 'for'
            {
            match("for"); 


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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:22:7: ( 'do' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:22:9: 'do'
            {
            match("do"); 


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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:23:7: ( 'od' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:23:9: 'od'
            {
            match("od"); 


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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:24:7: ( 'if' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:24:9: 'if'
            {
            match("if"); 


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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:25:7: ( 'then' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:25:9: 'then'
            {
            match("then"); 


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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:26:7: ( 'else' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:26:9: 'else'
            {
            match("else"); 


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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:27:7: ( 'fi' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:27:9: 'fi'
            {
            match("fi"); 


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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:28:7: ( 'foreach' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:28:9: 'foreach'
            {
            match("foreach"); 


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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:29:7: ( 'in' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:29:9: 'in'
            {
            match("in"); 


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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:30:7: ( 'nil' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:30:9: 'nil'
            {
            match("nil"); 


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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:31:7: ( '(' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:31:9: '('
            {
            match('('); 

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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:32:7: ( 'cons' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:32:9: 'cons'
            {
            match("cons"); 


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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:33:7: ( ')' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:33:9: ')'
            {
            match(')'); 

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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:34:7: ( 'list' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:34:9: 'list'
            {
            match("list"); 


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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:35:7: ( 'hd' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:35:9: 'hd'
            {
            match("hd"); 


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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:36:7: ( 'tl' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:36:9: 'tl'
            {
            match("tl"); 


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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:37:7: ( 'and' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:37:9: 'and'
            {
            match("and"); 


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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:38:7: ( 'or' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:38:9: 'or'
            {
            match("or"); 


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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:39:7: ( 'not' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:39:9: 'not'
            {
            match("not"); 


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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:40:7: ( '=?' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:40:9: '=?'
            {
            match("=?"); 


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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1642:15: ( 'A' .. 'Z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )* )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1642:17: 'A' .. 'Z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )*
            {
            matchRange('A','Z'); 
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1642:26: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:
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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1644:13: ( 'a' .. 'z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )* )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1644:15: 'a' .. 'z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )*
            {
            matchRange('a','z'); 
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1644:24: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:
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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1646:9: ( ( ( '\\t' )* | ( '\\r' )* | ( '\\r\\n' )* | ( '\\n' )* | ( ' ' )* ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1646:11: ( ( '\\t' )* | ( '\\r' )* | ( '\\r\\n' )* | ( '\\n' )* | ( ' ' )* )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1646:11: ( ( '\\t' )* | ( '\\r' )* | ( '\\r\\n' )* | ( '\\n' )* | ( ' ' )* )
            int alt8=5;
            switch ( input.LA(1) ) {
            case '\t':
                {
                alt8=1;
                }
                break;
            case '\r':
                {
                int LA8_3 = input.LA(2);

                if ( (LA8_3=='\n') ) {
                    alt8=3;
                }
                else {
                    alt8=2;}
                }
                break;
            case '\n':
                {
                alt8=4;
                }
                break;
            case ' ':
                {
                alt8=5;
                }
                break;
            default:
                alt8=1;}

            switch (alt8) {
                case 1 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1646:12: ( '\\t' )*
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1646:12: ( '\\t' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='\t') ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1646:12: '\\t'
                    	    {
                    	    match('\t'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1646:18: ( '\\r' )*
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1646:18: ( '\\r' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\r') ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1646:18: '\\r'
                    	    {
                    	    match('\r'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1646:24: ( '\\r\\n' )*
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1646:24: ( '\\r\\n' )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\r') ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1646:24: '\\r\\n'
                    	    {
                    	    match("\r\n"); 


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;
                case 4 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1646:32: ( '\\n' )*
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1646:32: ( '\\n' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\n') ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1646:32: '\\n'
                    	    {
                    	    match('\n'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;
                case 5 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1646:38: ( ' ' )*
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1646:38: ( ' ' )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==' ') ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1646:38: ' '
                    	    {
                    	    match(' '); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


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
    // $ANTLR end "RULE_LC"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1648:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1648:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1648:11: ( '^' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='^') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1648:11: '^'
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

            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1648:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:
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
            	    break loop10;
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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1650:10: ( ( '0' .. '9' )+ )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1650:12: ( '0' .. '9' )+
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1650:12: ( '0' .. '9' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1650:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1652:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1652:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1652:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\"') ) {
                alt14=1;
            }
            else if ( (LA14_0=='\'') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1652:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1652:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='!')||(LA12_0>='#' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1652:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1652:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop12;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1652:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1652:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1652:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1652:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop13;
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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1654:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1654:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1654:24: ( options {greedy=false; } : . )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='*') ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1=='/') ) {
                        alt15=2;
                    }
                    else if ( ((LA15_1>='\u0000' && LA15_1<='.')||(LA15_1>='0' && LA15_1<='\uFFFF')) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>='\u0000' && LA15_0<=')')||(LA15_0>='+' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1654:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop15;
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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1656:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1656:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1656:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\u0000' && LA16_0<='\t')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1656:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop16;
                }
            } while (true);

            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1656:40: ( ( '\\r' )? '\\n' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\n'||LA18_0=='\r') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1656:41: ( '\\r' )? '\\n'
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1656:41: ( '\\r' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='\r') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1656:41: '\\r'
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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1658:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1658:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1658:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:
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
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1660:16: ( . )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1660:18: .
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
        // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_VARIABLE | RULE_SYMBOL | RULE_LC | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt20=40;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:190: RULE_VARIABLE
                {
                mRULE_VARIABLE(); 

                }
                break;
            case 32 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:204: RULE_SYMBOL
                {
                mRULE_SYMBOL(); 

                }
                break;
            case 33 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:216: RULE_LC
                {
                mRULE_LC(); 

                }
                break;
            case 34 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:224: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 35 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:232: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 36 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:241: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 37 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:253: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 38 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:269: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 39 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:285: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 40 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:293: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA20_eotS =
        "\1\30\1\47\1\51\1\47\1\uffff\1\47\2\uffff\6\47\1\uffff\1\47\1\uffff\3\47\1\42\1\102\1\47\1\30\1\uffff\3\30\1\42\2\uffff\3\42\1\uffff\2\47\1\120\1\47\3\uffff\1\47\1\uffff\2\47\2\uffff\2\47\1\127\1\130\1\131\1\132\1\133\1\47\1\135\1\47\1\uffff\1\47\1\uffff\1\47\1\141\1\47\1\uffff\1\102\1\uffff\1\30\1\uffff\4\30\5\uffff\1\47\1\146\1\uffff\3\47\1\152\1\153\1\154\5\uffff\1\47\1\uffff\3\47\1\uffff\1\161\1\104\2\47\1\uffff\1\164\2\47\3\uffff\1\167\1\170\1\171\1\172\1\uffff\2\47\1\uffff\1\175\1\176\4\uffff\2\47\2\uffff\1\47\1\u0082\1\u0083\2\uffff";
    static final String DFA20_eofS =
        "\u0084\uffff";
    static final String DFA20_minS =
        "\1\0\1\60\1\75\1\60\1\uffff\1\60\2\uffff\6\60\1\uffff\1\60\1\uffff\3\60\1\77\2\60\1\11\1\uffff\3\11\1\101\2\uffff\2\0\1\52\1\uffff\4\60\3\uffff\1\60\1\uffff\2\60\2\uffff\12\60\1\uffff\1\60\1\uffff\3\60\1\uffff\1\60\1\uffff\1\11\1\uffff\4\11\5\uffff\2\60\1\uffff\6\60\5\uffff\1\60\1\uffff\3\60\1\uffff\1\60\1\12\2\60\1\uffff\3\60\3\uffff\4\60\1\uffff\2\60\1\uffff\2\60\4\uffff\2\60\2\uffff\3\60\2\uffff";
    static final String DFA20_maxS =
        "\1\uffff\1\172\1\75\1\172\1\uffff\1\172\2\uffff\6\172\1\uffff\1\172\1\uffff\3\172\1\77\2\172\1\40\1\uffff\3\40\1\172\2\uffff\2\uffff\1\57\1\uffff\4\172\3\uffff\1\172\1\uffff\2\172\2\uffff\12\172\1\uffff\1\172\1\uffff\3\172\1\uffff\1\172\1\uffff\1\40\1\uffff\4\40\5\uffff\2\172\1\uffff\6\172\5\uffff\1\172\1\uffff\3\172\1\uffff\1\172\1\12\2\172\1\uffff\3\172\3\uffff\4\172\1\uffff\2\172\1\uffff\2\172\4\uffff\2\172\2\uffff\3\172\2\uffff";
    static final String DFA20_acceptS =
        "\4\uffff\1\4\1\uffff\1\6\1\7\6\uffff\1\25\1\uffff\1\27\7\uffff\1\41\4\uffff\1\42\1\43\3\uffff\1\50\4\uffff\1\40\1\11\1\2\1\uffff\1\4\2\uffff\1\6\1\7\12\uffff\1\25\1\uffff\1\27\3\uffff\1\36\1\uffff\1\37\1\uffff\1\47\4\uffff\1\42\1\43\1\44\1\45\1\46\2\uffff\1\21\6\uffff\1\14\1\15\1\34\1\16\1\23\1\uffff\1\32\3\uffff\1\31\4\uffff\1\13\3\uffff\1\10\1\35\1\24\4\uffff\1\33\2\uffff\1\3\2\uffff\1\17\1\20\1\26\1\30\2\uffff\1\5\1\12\3\uffff\1\22\1\1";
    static final String DFA20_specialS =
        "\1\2\36\uffff\1\1\1\0\143\uffff}>";
    static final String[] DFA20_transitionS = {
            "\11\42\1\27\1\32\2\42\1\31\22\42\1\33\1\42\1\37\2\42\1\4\1\42\1\40\1\16\1\20\2\42\1\6\2\42\1\41\12\36\1\2\1\7\1\42\1\24\3\42\32\25\3\42\1\34\1\35\1\42\1\23\1\26\1\17\1\11\1\15\1\1\1\26\1\22\1\13\2\26\1\21\1\26\1\10\1\12\2\26\1\3\1\26\1\14\2\26\1\5\3\26\uff85\42",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\10\46\1\45\5\46\1\44\5\46\1\43\5\46",
            "\1\50",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\52\25\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\7\46\1\55\11\46\1\54\10\46",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\10\46\1\61\5\46\1\60\13\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\16\46\1\62\13\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\3\46\1\63\15\46\1\64\10\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\5\46\1\65\7\46\1\66\14\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\7\46\1\67\3\46\1\70\16\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\13\46\1\71\16\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\16\46\1\73\13\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\10\46\1\75\21\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\3\46\1\76\26\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\15\46\1\77\14\46",
            "\1\100",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\103\1\104\2\uffff\1\104\22\uffff\1\104",
            "",
            "\1\104\1\105\2\uffff\1\106\22\uffff\1\104",
            "\1\104\1\107\2\uffff\1\104\22\uffff\1\104",
            "\2\104\2\uffff\1\104\22\uffff\1\110",
            "\32\111\4\uffff\1\111\1\uffff\32\111",
            "",
            "",
            "\0\113",
            "\0\113",
            "\1\114\4\uffff\1\115",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\15\46\1\116\14\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\21\46\1\117\10\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\1\121\31\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\10\46\1\122\21\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\10\46\1\123\21\46",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\17\46\1\124\3\46\1\125\6\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\13\46\1\126\16\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\134\25\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\22\46\1\136\7\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\15\46\1\137\14\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\22\46\1\140\7\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\3\46\1\142\26\46",
            "",
            "\12\101\7\uffff\32\101\4\uffff\1\101\1\uffff\32\101",
            "",
            "\1\103\1\104\2\uffff\1\104\22\uffff\1\104",
            "",
            "\2\104\2\uffff\1\143\22\uffff\1\104",
            "\2\104\2\uffff\1\106\22\uffff\1\104",
            "\1\104\1\107\2\uffff\1\104\22\uffff\1\104",
            "\2\104\2\uffff\1\104\22\uffff\1\110",
            "",
            "",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\2\46\1\144\27\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\145\25\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\3\46\1\147\26\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\23\46\1\150\6\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\13\46\1\151\16\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\15\46\1\155\14\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\156\25\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\22\46\1\157\7\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\23\46\1\160\6\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\105",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\23\46\1\162\6\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\1\163\31\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\165\25\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\4\46\1\166\25\46",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\10\46\1\173\21\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\2\46\1\174\27\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\16\46\1\177\13\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\7\46\1\u0080\22\46",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\15\46\1\u0081\14\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_VARIABLE | RULE_SYMBOL | RULE_LC | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_32 = input.LA(1);

                        s = -1;
                        if ( ((LA20_32>='\u0000' && LA20_32<='\uFFFF')) ) {s = 75;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_31 = input.LA(1);

                        s = -1;
                        if ( ((LA20_31>='\u0000' && LA20_31<='\uFFFF')) ) {s = 75;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_0 = input.LA(1);

                        s = -1;
                        if ( (LA20_0=='f') ) {s = 1;}

                        else if ( (LA20_0==':') ) {s = 2;}

                        else if ( (LA20_0=='r') ) {s = 3;}

                        else if ( (LA20_0=='%') ) {s = 4;}

                        else if ( (LA20_0=='w') ) {s = 5;}

                        else if ( (LA20_0==',') ) {s = 6;}

                        else if ( (LA20_0==';') ) {s = 7;}

                        else if ( (LA20_0=='n') ) {s = 8;}

                        else if ( (LA20_0=='d') ) {s = 9;}

                        else if ( (LA20_0=='o') ) {s = 10;}

                        else if ( (LA20_0=='i') ) {s = 11;}

                        else if ( (LA20_0=='t') ) {s = 12;}

                        else if ( (LA20_0=='e') ) {s = 13;}

                        else if ( (LA20_0=='(') ) {s = 14;}

                        else if ( (LA20_0=='c') ) {s = 15;}

                        else if ( (LA20_0==')') ) {s = 16;}

                        else if ( (LA20_0=='l') ) {s = 17;}

                        else if ( (LA20_0=='h') ) {s = 18;}

                        else if ( (LA20_0=='a') ) {s = 19;}

                        else if ( (LA20_0=='=') ) {s = 20;}

                        else if ( ((LA20_0>='A' && LA20_0<='Z')) ) {s = 21;}

                        else if ( (LA20_0=='b'||LA20_0=='g'||(LA20_0>='j' && LA20_0<='k')||LA20_0=='m'||(LA20_0>='p' && LA20_0<='q')||LA20_0=='s'||(LA20_0>='u' && LA20_0<='v')||(LA20_0>='x' && LA20_0<='z')) ) {s = 22;}

                        else if ( (LA20_0=='\t') ) {s = 23;}

                        else if ( (LA20_0=='\r') ) {s = 25;}

                        else if ( (LA20_0=='\n') ) {s = 26;}

                        else if ( (LA20_0==' ') ) {s = 27;}

                        else if ( (LA20_0=='^') ) {s = 28;}

                        else if ( (LA20_0=='_') ) {s = 29;}

                        else if ( ((LA20_0>='0' && LA20_0<='9')) ) {s = 30;}

                        else if ( (LA20_0=='\"') ) {s = 31;}

                        else if ( (LA20_0=='\'') ) {s = 32;}

                        else if ( (LA20_0=='/') ) {s = 33;}

                        else if ( ((LA20_0>='\u0000' && LA20_0<='\b')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='\u001F')||LA20_0=='!'||(LA20_0>='#' && LA20_0<='$')||LA20_0=='&'||(LA20_0>='*' && LA20_0<='+')||(LA20_0>='-' && LA20_0<='.')||LA20_0=='<'||(LA20_0>='>' && LA20_0<='@')||(LA20_0>='[' && LA20_0<=']')||LA20_0=='`'||(LA20_0>='{' && LA20_0<='\uFFFF')) ) {s = 34;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}