package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int RULE_DURATION=9;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_OACI=8;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_INCLUDE=4;

    // delegates
    // delegators

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:11:7: ( '%include' )
            // InternalMyDsl.g:11:9: '%include'
            {
            match("%include"); 


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
            // InternalMyDsl.g:12:7: ( '<' )
            // InternalMyDsl.g:12:9: '<'
            {
            match('<'); 

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
            // InternalMyDsl.g:13:7: ( '>;' )
            // InternalMyDsl.g:13:9: '>;'
            {
            match(">;"); 


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
            // InternalMyDsl.g:14:7: ( 'Avion' )
            // InternalMyDsl.g:14:9: 'Avion'
            {
            match("Avion"); 


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
            // InternalMyDsl.g:15:7: ( ':' )
            // InternalMyDsl.g:15:9: ':'
            {
            match(':'); 

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
            // InternalMyDsl.g:16:7: ( 'Passagers' )
            // InternalMyDsl.g:16:9: 'Passagers'
            {
            match("Passagers"); 


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
            // InternalMyDsl.g:17:7: ( ';' )
            // InternalMyDsl.g:17:9: ';'
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
            // InternalMyDsl.g:18:7: ( 'Motorisation' )
            // InternalMyDsl.g:18:9: 'Motorisation'
            {
            match("Motorisation"); 


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
            // InternalMyDsl.g:19:7: ( 'End.' )
            // InternalMyDsl.g:19:9: 'End.'
            {
            match("End."); 


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
            // InternalMyDsl.g:20:7: ( 'Aeroport' )
            // InternalMyDsl.g:20:9: 'Aeroport'
            {
            match("Aeroport"); 


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
            // InternalMyDsl.g:21:7: ( 'OACI' )
            // InternalMyDsl.g:21:9: 'OACI'
            {
            match("OACI"); 


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
            // InternalMyDsl.g:22:7: ( 'Pays' )
            // InternalMyDsl.g:22:9: 'Pays'
            {
            match("Pays"); 


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
            // InternalMyDsl.g:23:7: ( 'Pistes' )
            // InternalMyDsl.g:23:9: 'Pistes'
            {
            match("Pistes"); 


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
            // InternalMyDsl.g:24:7: ( 'Ligne' )
            // InternalMyDsl.g:24:9: 'Ligne'
            {
            match("Ligne"); 


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
            // InternalMyDsl.g:25:7: ( 'Compagnie' )
            // InternalMyDsl.g:25:9: 'Compagnie'
            {
            match("Compagnie"); 


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
            // InternalMyDsl.g:26:7: ( 'Depart' )
            // InternalMyDsl.g:26:9: 'Depart'
            {
            match("Depart"); 


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
            // InternalMyDsl.g:27:7: ( 'Arrivee' )
            // InternalMyDsl.g:27:9: 'Arrivee'
            {
            match("Arrivee"); 


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
            // InternalMyDsl.g:28:7: ( 'Duree' )
            // InternalMyDsl.g:28:9: 'Duree'
            {
            match("Duree"); 


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
            // InternalMyDsl.g:29:7: ( 'REGULIERE;' )
            // InternalMyDsl.g:29:9: 'REGULIERE;'
            {
            match("REGULIERE;"); 


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
            // InternalMyDsl.g:30:7: ( 'HELICES' )
            // InternalMyDsl.g:30:9: 'HELICES'
            {
            match("HELICES"); 


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
            // InternalMyDsl.g:31:7: ( 'PROPULSEURS' )
            // InternalMyDsl.g:31:9: 'PROPULSEURS'
            {
            match("PROPULSEURS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "RULE_DURATION"
    public final void mRULE_DURATION() throws RecognitionException {
        try {
            int _type = RULE_DURATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:885:15: ( ( '0' .. '2' '0' .. '9' 'h' )? '0' .. '5' '0' .. '9' 'm' )
            // InternalMyDsl.g:885:17: ( '0' .. '2' '0' .. '9' 'h' )? '0' .. '5' '0' .. '9' 'm'
            {
            // InternalMyDsl.g:885:17: ( '0' .. '2' '0' .. '9' 'h' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>='0' && LA1_0<='2')) ) {
                int LA1_1 = input.LA(2);

                if ( ((LA1_1>='0' && LA1_1<='9')) ) {
                    int LA1_3 = input.LA(3);

                    if ( (LA1_3=='h') ) {
                        alt1=1;
                    }
                }
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:885:18: '0' .. '2' '0' .. '9' 'h'
                    {
                    matchRange('0','2'); 
                    matchRange('0','9'); 
                    match('h'); 

                    }
                    break;

            }

            matchRange('0','5'); 
            matchRange('0','9'); 
            match('m'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DURATION"

    // $ANTLR start "RULE_OACI"
    public final void mRULE_OACI() throws RecognitionException {
        try {
            int _type = RULE_OACI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:887:11: ( 'A' .. 'Z' 'A' .. 'Z' 'A' .. 'Z' 'A' .. 'Z' )
            // InternalMyDsl.g:887:13: 'A' .. 'Z' 'A' .. 'Z' 'A' .. 'Z' 'A' .. 'Z'
            {
            matchRange('A','Z'); 
            matchRange('A','Z'); 
            matchRange('A','Z'); 
            matchRange('A','Z'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OACI"

    // $ANTLR start "RULE_INCLUDE"
    public final void mRULE_INCLUDE() throws RecognitionException {
        try {
            int _type = RULE_INCLUDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:889:14: ( RULE_ID '.air' )
            // InternalMyDsl.g:889:16: RULE_ID '.air'
            {
            mRULE_ID(); 
            match(".air"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INCLUDE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:891:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:891:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDsl.g:891:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:891:11: '^'
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

            // InternalMyDsl.g:891:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:
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
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:893:10: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:893:12: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:893:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:893:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
            // InternalMyDsl.g:895:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:895:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:895:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:895:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:895:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyDsl.g:895:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:895:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:895:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:895:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMyDsl.g:895:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:895:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop6;
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
            // InternalMyDsl.g:897:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDsl.g:897:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDsl.g:897:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:897:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // InternalMyDsl.g:899:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:899:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDsl.g:899:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:899:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop9;
                }
            } while (true);

            // InternalMyDsl.g:899:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:899:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:899:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalMyDsl.g:899:41: '\\r'
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
            // InternalMyDsl.g:901:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDsl.g:901:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDsl.g:901:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
            // InternalMyDsl.g:903:16: ( . )
            // InternalMyDsl.g:903:18: .
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
        // InternalMyDsl.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | RULE_DURATION | RULE_OACI | RULE_INCLUDE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=31;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalMyDsl.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalMyDsl.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalMyDsl.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalMyDsl.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalMyDsl.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalMyDsl.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalMyDsl.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalMyDsl.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalMyDsl.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalMyDsl.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalMyDsl.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalMyDsl.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalMyDsl.g:1:136: RULE_DURATION
                {
                mRULE_DURATION(); 

                }
                break;
            case 23 :
                // InternalMyDsl.g:1:150: RULE_OACI
                {
                mRULE_OACI(); 

                }
                break;
            case 24 :
                // InternalMyDsl.g:1:160: RULE_INCLUDE
                {
                mRULE_INCLUDE(); 

                }
                break;
            case 25 :
                // InternalMyDsl.g:1:173: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 26 :
                // InternalMyDsl.g:1:181: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 27 :
                // InternalMyDsl.g:1:190: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 28 :
                // InternalMyDsl.g:1:202: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 29 :
                // InternalMyDsl.g:1:218: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 30 :
                // InternalMyDsl.g:1:234: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 31 :
                // InternalMyDsl.g:1:242: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\32\1\uffff\1\32\1\42\1\uffff\1\42\1\uffff\10\42\2\64\1\42\1\32\1\42\1\uffff\3\32\5\uffff\4\42\1\uffff\1\42\2\uffff\3\42\1\uffff\11\42\1\64\1\uffff\1\64\1\42\4\uffff\21\42\1\uffff\3\42\1\141\1\42\1\143\1\42\1\141\1\42\1\147\1\150\4\42\2\141\1\157\2\42\1\uffff\1\42\1\uffff\3\42\2\uffff\1\166\2\42\1\171\2\42\1\uffff\3\42\1\177\2\42\1\uffff\1\42\1\u0083\1\uffff\3\42\1\u0087\1\42\1\uffff\3\42\1\uffff\1\42\1\u008d\1\u008e\1\uffff\5\42\2\uffff\1\u0094\2\42\1\u0097\1\42\1\uffff\2\42\2\uffff\1\u009b\1\42\1\uffff\1\u009d\1\uffff";
    static final String DFA13_eofS =
        "\u009e\uffff";
    static final String DFA13_minS =
        "\1\0\1\151\1\uffff\1\73\1\56\1\uffff\1\56\1\uffff\10\56\2\60\1\56\1\101\1\56\1\uffff\2\0\1\52\5\uffff\4\56\1\uffff\1\56\2\uffff\3\56\1\uffff\11\56\1\150\1\uffff\1\155\1\56\4\uffff\21\56\1\uffff\11\56\1\141\12\56\1\uffff\1\56\1\uffff\3\56\2\uffff\6\56\1\uffff\6\56\1\uffff\2\56\1\uffff\5\56\1\uffff\3\56\1\uffff\3\56\1\uffff\5\56\2\uffff\5\56\1\uffff\2\56\2\uffff\2\56\1\uffff\1\56\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\151\1\uffff\1\73\1\172\1\uffff\1\172\1\uffff\10\172\2\71\3\172\1\uffff\2\uffff\1\57\5\uffff\4\172\1\uffff\1\172\2\uffff\3\172\1\uffff\11\172\1\155\1\uffff\1\155\1\172\4\uffff\21\172\1\uffff\11\172\1\141\12\172\1\uffff\1\172\1\uffff\3\172\2\uffff\6\172\1\uffff\6\172\1\uffff\2\172\1\uffff\5\172\1\uffff\3\172\1\uffff\3\172\1\uffff\5\172\2\uffff\5\172\1\uffff\2\172\2\uffff\2\172\1\uffff\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\2\uffff\1\5\1\uffff\1\7\15\uffff\1\32\3\uffff\1\36\1\37\1\1\1\2\1\3\4\uffff\1\31\1\uffff\1\30\1\5\3\uffff\1\7\12\uffff\1\32\2\uffff\1\33\1\34\1\35\1\36\21\uffff\1\26\24\uffff\1\27\1\uffff\1\14\3\uffff\1\11\1\13\6\uffff\1\4\6\uffff\1\16\2\uffff\1\22\5\uffff\1\15\3\uffff\1\20\3\uffff\1\21\5\uffff\1\24\1\12\5\uffff\1\6\2\uffff\1\17\1\23\2\uffff\1\25\1\uffff\1\10";
    static final String DFA13_specialS =
        "\1\2\25\uffff\1\0\1\1\u0086\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\32\2\31\2\32\1\31\22\32\1\31\1\32\1\26\2\32\1\1\1\32\1\27\7\32\1\30\3\20\3\21\4\25\1\5\1\7\1\2\1\32\1\3\2\32\1\4\1\22\1\14\1\15\1\11\2\22\1\17\3\22\1\13\1\10\1\22\1\12\1\6\1\22\1\16\10\22\3\32\1\23\1\24\1\32\32\24\uff85\32",
            "\1\33",
            "",
            "\1\35",
            "\1\44\1\uffff\12\43\7\uffff\32\41\4\uffff\1\43\1\uffff\4\43\1\37\14\43\1\40\3\43\1\36\4\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\21\41\1\50\10\41\4\uffff\1\43\1\uffff\1\46\7\43\1\47\21\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\41\4\uffff\1\43\1\uffff\16\43\1\52\13\43",
            "\1\44\1\uffff\12\43\7\uffff\32\41\4\uffff\1\43\1\uffff\15\43\1\53\14\43",
            "\1\44\1\uffff\12\43\7\uffff\1\54\31\41\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\41\4\uffff\1\43\1\uffff\10\43\1\55\21\43",
            "\1\44\1\uffff\12\43\7\uffff\32\41\4\uffff\1\43\1\uffff\16\43\1\56\13\43",
            "\1\44\1\uffff\12\43\7\uffff\32\41\4\uffff\1\43\1\uffff\4\43\1\57\17\43\1\60\5\43",
            "\1\44\1\uffff\12\43\7\uffff\4\41\1\61\25\41\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\4\41\1\62\25\41\4\uffff\1\43\1\uffff\32\43",
            "\12\63",
            "\12\65",
            "\1\44\1\uffff\12\43\7\uffff\32\41\4\uffff\1\43\1\uffff\32\43",
            "\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\0\67",
            "\0\67",
            "\1\70\4\uffff\1\71",
            "",
            "",
            "",
            "",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\73\21\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\21\43\1\74\10\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\21\43\1\75\10\43",
            "\1\44\1\uffff\12\43\7\uffff\32\76\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\22\43\1\77\5\43\1\100\1\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\22\43\1\101\7\43",
            "\1\44\1\uffff\12\43\7\uffff\16\76\1\102\13\76\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\103\6\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\3\43\1\104\26\43",
            "\1\44\1\uffff\12\43\7\uffff\2\76\1\105\27\76\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\6\43\1\106\23\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\14\43\1\107\15\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\17\43\1\110\12\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\21\43\1\111\10\43",
            "\1\44\1\uffff\12\43\7\uffff\6\76\1\112\23\76\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\13\76\1\113\16\76\4\uffff\1\43\1\uffff\32\43",
            "\1\114\4\uffff\1\114",
            "",
            "\1\114",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\16\43\1\115\13\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\16\43\1\116\13\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\117\21\43",
            "\1\44\1\uffff\12\43\7\uffff\32\120\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\22\43\1\121\7\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\22\43\1\122\7\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\123\6\43",
            "\1\44\1\uffff\12\43\7\uffff\17\120\1\124\12\120\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\16\43\1\125\13\43",
            "\1\126\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\10\120\1\127\21\120\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\130\14\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\17\43\1\131\12\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\1\132\31\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\133\25\43",
            "\1\44\1\uffff\12\43\7\uffff\24\120\1\134\5\120\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\10\120\1\135\21\120\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\136\14\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\17\43\1\137\12\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\25\43\1\140\4\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\1\142\31\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\144\25\43",
            "\1\44\1\uffff\12\43\7\uffff\24\43\1\145\5\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\21\43\1\146\10\43",
            "\1\44",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\151\25\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\1\152\31\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\21\43\1\153\10\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\154\25\43",
            "\1\44\1\uffff\12\43\7\uffff\13\43\1\155\16\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\2\43\1\156\27\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\16\43\1\160\13\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\161\25\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\6\43\1\162\23\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\22\43\1\163\7\43",
            "\1\44\1\uffff\12\43\7\uffff\13\43\1\164\16\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\165\21\43",
            "",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\6\43\1\167\23\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\170\6\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\10\43\1\172\21\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\4\43\1\173\25\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\21\43\1\174\10\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\175\25\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\176\25\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\22\43\1\u0080\7\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\22\43\1\u0081\7\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\u0082\14\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\4\43\1\u0084\25\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\22\43\1\u0085\7\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\u0086\6\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\21\43\1\u0088\10\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\4\43\1\u0089\25\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\1\u008a\31\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\u008b\21\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\21\43\1\u008c\10\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\22\43\1\u008f\7\43",
            "\1\44\1\uffff\12\43\7\uffff\24\43\1\u0090\5\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\u0091\6\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\u0092\25\43",
            "\1\44\1\uffff\12\43\7\uffff\4\43\1\u0093\25\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\21\43\1\u0095\10\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\10\43\1\u0096\21\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\1\uffff\1\u0098\5\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\22\43\1\u0099\7\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\16\43\1\u009a\13\43",
            "",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\15\43\1\u009c\14\43",
            "",
            "\1\44\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | RULE_DURATION | RULE_OACI | RULE_INCLUDE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_22 = input.LA(1);

                        s = -1;
                        if ( ((LA13_22>='\u0000' && LA13_22<='\uFFFF')) ) {s = 55;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_23 = input.LA(1);

                        s = -1;
                        if ( ((LA13_23>='\u0000' && LA13_23<='\uFFFF')) ) {s = 55;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='%') ) {s = 1;}

                        else if ( (LA13_0=='<') ) {s = 2;}

                        else if ( (LA13_0=='>') ) {s = 3;}

                        else if ( (LA13_0=='A') ) {s = 4;}

                        else if ( (LA13_0==':') ) {s = 5;}

                        else if ( (LA13_0=='P') ) {s = 6;}

                        else if ( (LA13_0==';') ) {s = 7;}

                        else if ( (LA13_0=='M') ) {s = 8;}

                        else if ( (LA13_0=='E') ) {s = 9;}

                        else if ( (LA13_0=='O') ) {s = 10;}

                        else if ( (LA13_0=='L') ) {s = 11;}

                        else if ( (LA13_0=='C') ) {s = 12;}

                        else if ( (LA13_0=='D') ) {s = 13;}

                        else if ( (LA13_0=='R') ) {s = 14;}

                        else if ( (LA13_0=='H') ) {s = 15;}

                        else if ( ((LA13_0>='0' && LA13_0<='2')) ) {s = 16;}

                        else if ( ((LA13_0>='3' && LA13_0<='5')) ) {s = 17;}

                        else if ( (LA13_0=='B'||(LA13_0>='F' && LA13_0<='G')||(LA13_0>='I' && LA13_0<='K')||LA13_0=='N'||LA13_0=='Q'||(LA13_0>='S' && LA13_0<='Z')) ) {s = 18;}

                        else if ( (LA13_0=='^') ) {s = 19;}

                        else if ( (LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')) ) {s = 20;}

                        else if ( ((LA13_0>='6' && LA13_0<='9')) ) {s = 21;}

                        else if ( (LA13_0=='\"') ) {s = 22;}

                        else if ( (LA13_0=='\'') ) {s = 23;}

                        else if ( (LA13_0=='/') ) {s = 24;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 25;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='$')||LA13_0=='&'||(LA13_0>='(' && LA13_0<='.')||LA13_0=='='||(LA13_0>='?' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||(LA13_0>='{' && LA13_0<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}