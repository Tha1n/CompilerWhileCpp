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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:32:7: ( ')' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:32:9: ')'
            {
            match(')'); 

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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:33:7: ( 'hd' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:33:9: 'hd'
            {
            match("hd"); 


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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:34:7: ( 'tl' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:34:9: 'tl'
            {
            match("tl"); 


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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:35:7: ( 'and' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:35:9: 'and'
            {
            match("and"); 


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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:36:7: ( 'or' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:36:9: 'or'
            {
            match("or"); 


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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:37:7: ( 'not' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:37:9: 'not'
            {
            match("not"); 


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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:38:7: ( '=?' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:38:9: '=?'
            {
            match("=?"); 


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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:39:7: ( 'cons' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:39:9: 'cons'
            {
            match("cons"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "RULE_VARIABLE"
    public final void mRULE_VARIABLE() throws RecognitionException {
        try {
            int _type = RULE_VARIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1696:15: ( 'A' .. 'Z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '->' | '-' | '+' | '&' | '.' | '/' | '_' )* )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1696:17: 'A' .. 'Z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '->' | '-' | '+' | '&' | '.' | '/' | '_' )*
            {
            matchRange('A','Z'); 
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1696:26: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '->' | '-' | '+' | '&' | '.' | '/' | '_' )*
            loop1:
            do {
                int alt1=11;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1696:27: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;
            	case 2 :
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1696:36: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;
            	case 3 :
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1696:45: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;
            	case 4 :
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1696:54: '->'
            	    {
            	    match("->"); 


            	    }
            	    break;
            	case 5 :
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1696:59: '-'
            	    {
            	    match('-'); 

            	    }
            	    break;
            	case 6 :
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1696:63: '+'
            	    {
            	    match('+'); 

            	    }
            	    break;
            	case 7 :
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1696:67: '&'
            	    {
            	    match('&'); 

            	    }
            	    break;
            	case 8 :
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1696:71: '.'
            	    {
            	    match('.'); 

            	    }
            	    break;
            	case 9 :
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1696:75: '/'
            	    {
            	    match('/'); 

            	    }
            	    break;
            	case 10 :
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1696:79: '_'
            	    {
            	    match('_'); 

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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1698:13: ( 'a' .. 'z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '->' | '-' | '+' | '&' | '.' | '/' )* )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1698:15: 'a' .. 'z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '->' | '-' | '+' | '&' | '.' | '/' )*
            {
            matchRange('a','z'); 
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1698:24: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '->' | '-' | '+' | '&' | '.' | '/' )*
            loop2:
            do {
                int alt2=11;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1698:25: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;
            	case 2 :
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1698:34: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;
            	case 3 :
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1698:43: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;
            	case 4 :
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1698:52: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;
            	case 5 :
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1698:56: '->'
            	    {
            	    match("->"); 


            	    }
            	    break;
            	case 6 :
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1698:61: '-'
            	    {
            	    match('-'); 

            	    }
            	    break;
            	case 7 :
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1698:65: '+'
            	    {
            	    match('+'); 

            	    }
            	    break;
            	case 8 :
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1698:69: '&'
            	    {
            	    match('&'); 

            	    }
            	    break;
            	case 9 :
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1698:73: '.'
            	    {
            	    match('.'); 

            	    }
            	    break;
            	case 10 :
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1698:77: '/'
            	    {
            	    match('/'); 

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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1700:9: ( ( ' ' )* )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1700:11: ( ' ' )*
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1700:11: ( ' ' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1700:11: ' '
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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1702:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1702:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1702:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1702:11: '^'
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

            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1702:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1704:10: ( ( '0' .. '9' )+ )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1704:12: ( '0' .. '9' )+
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1704:12: ( '0' .. '9' )+
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
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1704:13: '0' .. '9'
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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1706:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1706:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1706:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1706:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1706:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1706:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1706:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1706:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1706:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1706:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1706:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1708:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1708:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1708:24: ( options {greedy=false; } : . )*
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
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1708:52: .
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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1710:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1710:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1710:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1710:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1710:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1710:41: ( '\\r' )? '\\n'
                    {
                    // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1710:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1710:41: '\\r'
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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1712:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1712:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1712:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1714:16: ( . )
            // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1714:18: .
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
        // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | RULE_VARIABLE | RULE_SYMBOL | RULE_LC | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=39;
        alt15 = dfa15.predict(input);
        switch (alt15) {
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
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:184: RULE_VARIABLE
                {
                mRULE_VARIABLE(); 

                }
                break;
            case 31 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:198: RULE_SYMBOL
                {
                mRULE_SYMBOL(); 

                }
                break;
            case 32 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:210: RULE_LC
                {
                mRULE_LC(); 

                }
                break;
            case 33 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:218: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 34 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:226: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 35 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:235: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 36 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:247: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 37 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:263: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 38 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:279: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 39 :
                // ../whileComp/src-gen/org/xtext/example/parser/antlr/internal/InternalWhileCpp.g:1:287: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA1_eotS =
        "\1\1\4\uffff\1\14\7\uffff";
    static final String DFA1_eofS =
        "\15\uffff";
    static final String DFA1_minS =
        "\1\46\4\uffff\1\76\7\uffff";
    static final String DFA1_maxS =
        "\1\172\4\uffff\1\76\7\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\13\1\1\1\2\1\3\1\uffff\1\6\1\7\1\10\1\11\1\12\1\4\1"+
        "\5";
    static final String DFA1_specialS =
        "\15\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\7\4\uffff\1\6\1\uffff\1\5\1\10\1\11\12\4\7\uffff\32\2\4"+
            "\uffff\1\12\1\uffff\32\3",
            "",
            "",
            "",
            "",
            "\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "()* loopback of 1696:26: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '->' | '-' | '+' | '&' | '.' | '/' | '_' )*";
        }
    }
    static final String DFA2_eotS =
        "\1\1\5\uffff\1\14\6\uffff";
    static final String DFA2_eofS =
        "\15\uffff";
    static final String DFA2_minS =
        "\1\46\5\uffff\1\76\6\uffff";
    static final String DFA2_maxS =
        "\1\172\5\uffff\1\76\6\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\13\1\1\1\2\1\3\1\4\1\uffff\1\7\1\10\1\11\1\12\1\5\1"+
        "\6";
    static final String DFA2_specialS =
        "\15\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\10\4\uffff\1\7\1\uffff\1\6\1\11\1\12\12\4\7\uffff\32\2\4"+
            "\uffff\1\5\1\uffff\32\3",
            "",
            "",
            "",
            "",
            "",
            "\1\13",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "()* loopback of 1698:24: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '->' | '-' | '+' | '&' | '.' | '/' )*";
        }
    }
    static final String DFA15_eotS =
        "\1\27\1\44\1\51\1\44\1\uffff\1\44\2\uffff\6\44\2\uffff\2\44\1\37"+
        "\1\44\1\103\1\44\1\27\1\uffff\1\37\2\uffff\3\37\2\uffff\2\44\1\116"+
        "\1\44\1\uffff\3\44\2\uffff\1\44\1\uffff\2\44\2\uffff\2\44\1\125"+
        "\1\126\1\127\1\130\1\131\1\44\1\133\1\44\2\uffff\1\135\1\44\1\uffff"+
        "\1\44\3\103\1\uffff\1\103\1\27\6\uffff\1\44\1\142\1\uffff\3\44\1"+
        "\146\1\147\1\150\5\uffff\1\44\1\uffff\1\44\1\uffff\1\153\3\44\1"+
        "\uffff\1\157\2\44\3\uffff\1\162\1\163\1\uffff\1\164\2\44\1\uffff"+
        "\1\167\1\170\3\uffff\2\44\2\uffff\1\44\1\174\1\175\2\uffff";
    static final String DFA15_eofS =
        "\176\uffff";
    static final String DFA15_minS =
        "\1\0\1\60\1\75\1\60\1\uffff\1\60\2\uffff\6\60\2\uffff\2\60\1\77"+
        "\3\60\1\11\1\uffff\1\101\2\uffff\2\0\1\52\2\uffff\2\60\1\46\1\60"+
        "\1\uffff\3\60\2\uffff\1\60\1\uffff\2\60\2\uffff\2\60\5\46\1\60\1"+
        "\46\1\60\2\uffff\1\46\1\60\1\uffff\4\60\1\uffff\1\60\1\11\6\uffff"+
        "\1\60\1\46\1\uffff\3\60\3\46\5\uffff\1\60\1\uffff\1\60\1\uffff\1"+
        "\46\3\60\1\uffff\1\46\2\60\3\uffff\2\46\1\uffff\1\46\2\60\1\uffff"+
        "\2\46\3\uffff\2\60\2\uffff\1\60\2\46\2\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\172\1\75\1\172\1\uffff\1\172\2\uffff\6\172\2\uffff\2"+
        "\172\1\77\3\172\1\40\1\uffff\1\172\2\uffff\2\uffff\1\57\2\uffff"+
        "\4\172\1\uffff\3\172\2\uffff\1\172\1\uffff\2\172\2\uffff\12\172"+
        "\2\uffff\2\172\1\uffff\4\172\1\uffff\1\172\1\40\6\uffff\2\172\1"+
        "\uffff\6\172\5\uffff\1\172\1\uffff\1\172\1\uffff\4\172\1\uffff\3"+
        "\172\3\uffff\2\172\1\uffff\3\172\1\uffff\2\172\3\uffff\2\172\2\uffff"+
        "\3\172\2\uffff";
    static final String DFA15_acceptS =
        "\4\uffff\1\4\1\uffff\1\6\1\7\6\uffff\1\25\1\26\7\uffff\1\40\1\uffff"+
        "\1\41\1\42\3\uffff\1\46\1\47\4\uffff\1\37\3\uffff\1\11\1\2\1\uffff"+
        "\1\4\2\uffff\1\6\1\7\12\uffff\1\25\1\26\2\uffff\1\34\4\uffff\1\36"+
        "\2\uffff\1\46\1\41\1\42\1\43\1\44\1\45\2\uffff\1\21\6\uffff\1\14"+
        "\1\15\1\32\1\16\1\23\1\uffff\1\30\1\uffff\1\27\4\uffff\1\13\3\uffff"+
        "\1\10\1\33\1\24\2\uffff\1\31\3\uffff\1\3\2\uffff\1\17\1\20\1\35"+
        "\2\uffff\1\5\1\12\3\uffff\1\22\1\1";
    static final String DFA15_specialS =
        "\1\0\32\uffff\1\1\1\2\141\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\37\2\36\2\37\1\36\22\37\1\26\1\37\1\33\2\37\1\4\1\37\1"+
            "\34\1\16\1\17\2\37\1\6\2\37\1\35\12\32\1\2\1\7\1\37\1\22\3\37"+
            "\32\24\3\37\1\30\1\31\1\37\1\21\1\25\1\23\1\11\1\15\1\1\1\25"+
            "\1\20\1\13\4\25\1\10\1\12\2\25\1\3\1\25\1\14\2\25\1\5\3\25\uff85"+
            "\37",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\10\45\1\42\5\45"+
            "\1\41\5\45\1\40\5\45",
            "\1\50",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\4\45\1\52\25\45",
            "",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\7\45\1\55\11\45"+
            "\1\54\10\45",
            "",
            "",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\10\45\1\61\5\45"+
            "\1\60\13\45",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\16\45\1\62\13\45",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\3\45\1\63\15\45"+
            "\1\64\10\45",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\5\45\1\65\7\45\1"+
            "\66\14\45",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\7\45\1\67\3\45\1"+
            "\70\16\45",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\13\45\1\71\16\45",
            "",
            "",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\3\45\1\74\26\45",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\15\45\1\75\14\45",
            "\1\76",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\16\45\1\77\13\45",
            "\12\102\7\uffff\32\100\4\uffff\1\104\1\uffff\32\101",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\32\45",
            "\2\106\2\uffff\1\106\22\uffff\1\105",
            "",
            "\32\107\4\uffff\1\107\1\uffff\32\107",
            "",
            "",
            "\0\111",
            "\0\111",
            "\1\112\4\uffff\1\113",
            "",
            "",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\15\45\1\114\14\45",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\21\45\1\115\10\45",
            "\1\44\4\uffff\1\44\1\uffff\3\44\12\46\7\uffff\32\43\4\uffff"+
            "\1\47\1\uffff\32\45",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\32\45",
            "",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\32\45",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\32\45",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\32\45",
            "",
            "",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\1\117\31\45",
            "",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\10\45\1\120\21\45",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\10\45\1\121\21\45",
            "",
            "",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\17\45\1\122\3\45"+
            "\1\123\6\45",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\13\45\1\124\16\45",
            "\1\44\4\uffff\1\44\1\uffff\3\44\12\46\7\uffff\32\43\4\uffff"+
            "\1\47\1\uffff\32\45",
            "\1\44\4\uffff\1\44\1\uffff\3\44\12\46\7\uffff\32\43\4\uffff"+
            "\1\47\1\uffff\32\45",
            "\1\44\4\uffff\1\44\1\uffff\3\44\12\46\7\uffff\32\43\4\uffff"+
            "\1\47\1\uffff\32\45",
            "\1\44\4\uffff\1\44\1\uffff\3\44\12\46\7\uffff\32\43\4\uffff"+
            "\1\47\1\uffff\32\45",
            "\1\44\4\uffff\1\44\1\uffff\3\44\12\46\7\uffff\32\43\4\uffff"+
            "\1\47\1\uffff\32\45",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\4\45\1\132\25\45",
            "\1\44\4\uffff\1\44\1\uffff\3\44\12\46\7\uffff\32\43\4\uffff"+
            "\1\47\1\uffff\32\45",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\22\45\1\134\7\45",
            "",
            "",
            "\1\44\4\uffff\1\44\1\uffff\3\44\12\46\7\uffff\32\43\4\uffff"+
            "\1\47\1\uffff\32\45",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\3\45\1\136\26\45",
            "",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\15\45\1\137\14\45",
            "\12\102\7\uffff\32\100\4\uffff\1\104\1\uffff\32\101",
            "\12\102\7\uffff\32\100\4\uffff\1\104\1\uffff\32\101",
            "\12\102\7\uffff\32\100\4\uffff\1\104\1\uffff\32\101",
            "",
            "\12\102\7\uffff\32\100\4\uffff\1\104\1\uffff\32\101",
            "\2\106\2\uffff\1\106\22\uffff\1\105",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\2\45\1\140\27\45",
            "\1\44\4\uffff\1\44\1\uffff\3\44\12\46\7\uffff\32\43\4\uffff"+
            "\1\47\1\uffff\4\45\1\141\25\45",
            "",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\3\45\1\143\26\45",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\23\45\1\144\6\45",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\13\45\1\145\16\45",
            "\1\44\4\uffff\1\44\1\uffff\3\44\12\46\7\uffff\32\43\4\uffff"+
            "\1\47\1\uffff\32\45",
            "\1\44\4\uffff\1\44\1\uffff\3\44\12\46\7\uffff\32\43\4\uffff"+
            "\1\47\1\uffff\32\45",
            "\1\44\4\uffff\1\44\1\uffff\3\44\12\46\7\uffff\32\43\4\uffff"+
            "\1\47\1\uffff\32\45",
            "",
            "",
            "",
            "",
            "",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\15\45\1\151\14\45",
            "",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\4\45\1\152\25\45",
            "",
            "\1\44\4\uffff\1\44\1\uffff\3\44\12\46\7\uffff\32\43\4\uffff"+
            "\1\47\1\uffff\32\45",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\22\45\1\154\7\45",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\23\45\1\155\6\45",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\1\156\31\45",
            "",
            "\1\44\4\uffff\1\44\1\uffff\3\44\12\46\7\uffff\32\43\4\uffff"+
            "\1\47\1\uffff\32\45",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\4\45\1\160\25\45",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\4\45\1\161\25\45",
            "",
            "",
            "",
            "\1\44\4\uffff\1\44\1\uffff\3\44\12\46\7\uffff\32\43\4\uffff"+
            "\1\47\1\uffff\32\45",
            "\1\44\4\uffff\1\44\1\uffff\3\44\12\46\7\uffff\32\43\4\uffff"+
            "\1\47\1\uffff\32\45",
            "",
            "\1\44\4\uffff\1\44\1\uffff\3\44\12\46\7\uffff\32\43\4\uffff"+
            "\1\47\1\uffff\32\45",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\10\45\1\165\21\45",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\2\45\1\166\27\45",
            "",
            "\1\44\4\uffff\1\44\1\uffff\3\44\12\46\7\uffff\32\43\4\uffff"+
            "\1\47\1\uffff\32\45",
            "\1\44\4\uffff\1\44\1\uffff\3\44\12\46\7\uffff\32\43\4\uffff"+
            "\1\47\1\uffff\32\45",
            "",
            "",
            "",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\16\45\1\171\13\45",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\7\45\1\172\22\45",
            "",
            "",
            "\12\46\7\uffff\32\43\4\uffff\1\47\1\uffff\15\45\1\173\14\45",
            "\1\44\4\uffff\1\44\1\uffff\3\44\12\46\7\uffff\32\43\4\uffff"+
            "\1\47\1\uffff\32\45",
            "\1\44\4\uffff\1\44\1\uffff\3\44\12\46\7\uffff\32\43\4\uffff"+
            "\1\47\1\uffff\32\45",
            "",
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
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | RULE_VARIABLE | RULE_SYMBOL | RULE_LC | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='f') ) {s = 1;}

                        else if ( (LA15_0==':') ) {s = 2;}

                        else if ( (LA15_0=='r') ) {s = 3;}

                        else if ( (LA15_0=='%') ) {s = 4;}

                        else if ( (LA15_0=='w') ) {s = 5;}

                        else if ( (LA15_0==',') ) {s = 6;}

                        else if ( (LA15_0==';') ) {s = 7;}

                        else if ( (LA15_0=='n') ) {s = 8;}

                        else if ( (LA15_0=='d') ) {s = 9;}

                        else if ( (LA15_0=='o') ) {s = 10;}

                        else if ( (LA15_0=='i') ) {s = 11;}

                        else if ( (LA15_0=='t') ) {s = 12;}

                        else if ( (LA15_0=='e') ) {s = 13;}

                        else if ( (LA15_0=='(') ) {s = 14;}

                        else if ( (LA15_0==')') ) {s = 15;}

                        else if ( (LA15_0=='h') ) {s = 16;}

                        else if ( (LA15_0=='a') ) {s = 17;}

                        else if ( (LA15_0=='=') ) {s = 18;}

                        else if ( (LA15_0=='c') ) {s = 19;}

                        else if ( ((LA15_0>='A' && LA15_0<='Z')) ) {s = 20;}

                        else if ( (LA15_0=='b'||LA15_0=='g'||(LA15_0>='j' && LA15_0<='m')||(LA15_0>='p' && LA15_0<='q')||LA15_0=='s'||(LA15_0>='u' && LA15_0<='v')||(LA15_0>='x' && LA15_0<='z')) ) {s = 21;}

                        else if ( (LA15_0==' ') ) {s = 22;}

                        else if ( (LA15_0=='^') ) {s = 24;}

                        else if ( (LA15_0=='_') ) {s = 25;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 26;}

                        else if ( (LA15_0=='\"') ) {s = 27;}

                        else if ( (LA15_0=='\'') ) {s = 28;}

                        else if ( (LA15_0=='/') ) {s = 29;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r') ) {s = 30;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='#' && LA15_0<='$')||LA15_0=='&'||(LA15_0>='*' && LA15_0<='+')||(LA15_0>='-' && LA15_0<='.')||LA15_0=='<'||(LA15_0>='>' && LA15_0<='@')||(LA15_0>='[' && LA15_0<=']')||LA15_0=='`'||(LA15_0>='{' && LA15_0<='\uFFFF')) ) {s = 31;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_27 = input.LA(1);

                        s = -1;
                        if ( ((LA15_27>='\u0000' && LA15_27<='\uFFFF')) ) {s = 73;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_28 = input.LA(1);

                        s = -1;
                        if ( ((LA15_28>='\u0000' && LA15_28<='\uFFFF')) ) {s = 73;}

                        else s = 31;

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