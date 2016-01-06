package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


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
            // InternalMyDsl.g:11:7: ( 'HELICES' )
            // InternalMyDsl.g:11:9: 'HELICES'
            {
            match("HELICES"); 


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
            // InternalMyDsl.g:12:7: ( 'PROPULSEURS' )
            // InternalMyDsl.g:12:9: 'PROPULSEURS'
            {
            match("PROPULSEURS"); 


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
            // InternalMyDsl.g:13:7: ( '%include' )
            // InternalMyDsl.g:13:9: '%include'
            {
            match("%include"); 


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
            // InternalMyDsl.g:14:7: ( '<' )
            // InternalMyDsl.g:14:9: '<'
            {
            match('<'); 

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
            // InternalMyDsl.g:15:7: ( '>;' )
            // InternalMyDsl.g:15:9: '>;'
            {
            match(">;"); 


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
            // InternalMyDsl.g:16:7: ( 'Avion' )
            // InternalMyDsl.g:16:9: 'Avion'
            {
            match("Avion"); 


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
            // InternalMyDsl.g:17:7: ( ':' )
            // InternalMyDsl.g:17:9: ':'
            {
            match(':'); 

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
            // InternalMyDsl.g:18:7: ( 'End.' )
            // InternalMyDsl.g:18:9: 'End.'
            {
            match("End."); 


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
            // InternalMyDsl.g:19:7: ( 'Passagers' )
            // InternalMyDsl.g:19:9: 'Passagers'
            {
            match("Passagers"); 


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
            // InternalMyDsl.g:20:7: ( ';' )
            // InternalMyDsl.g:20:9: ';'
            {
            match(';'); 

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
            // InternalMyDsl.g:21:7: ( 'Motorisation' )
            // InternalMyDsl.g:21:9: 'Motorisation'
            {
            match("Motorisation"); 


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
            // InternalMyDsl.g:22:7: ( 'Aeroport' )
            // InternalMyDsl.g:22:9: 'Aeroport'
            {
            match("Aeroport"); 


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
            // InternalMyDsl.g:23:7: ( 'OACI' )
            // InternalMyDsl.g:23:9: 'OACI'
            {
            match("OACI"); 


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
            // InternalMyDsl.g:24:7: ( 'Pays' )
            // InternalMyDsl.g:24:9: 'Pays'
            {
            match("Pays"); 


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
            // InternalMyDsl.g:25:7: ( 'Pistes' )
            // InternalMyDsl.g:25:9: 'Pistes'
            {
            match("Pistes"); 


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
            // InternalMyDsl.g:26:7: ( 'Ligne' )
            // InternalMyDsl.g:26:9: 'Ligne'
            {
            match("Ligne"); 


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
            // InternalMyDsl.g:27:7: ( 'Compagnie' )
            // InternalMyDsl.g:27:9: 'Compagnie'
            {
            match("Compagnie"); 


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
            // InternalMyDsl.g:28:7: ( 'Depart' )
            // InternalMyDsl.g:28:9: 'Depart'
            {
            match("Depart"); 


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
            // InternalMyDsl.g:29:7: ( 'Arrivee' )
            // InternalMyDsl.g:29:9: 'Arrivee'
            {
            match("Arrivee"); 


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
            // InternalMyDsl.g:30:7: ( 'Duree' )
            // InternalMyDsl.g:30:9: 'Duree'
            {
            match("Duree"); 


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
            // InternalMyDsl.g:31:7: ( 'REGULIERE;' )
            // InternalMyDsl.g:31:9: 'REGULIERE;'
            {
            match("REGULIERE;"); 


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
            // InternalMyDsl.g:2634:15: ( ( '0' .. '2' '0' .. '9' 'h' )? '0' .. '5' '0' .. '9' 'm' )
            // InternalMyDsl.g:2634:17: ( '0' .. '2' '0' .. '9' 'h' )? '0' .. '5' '0' .. '9' 'm'
            {
            // InternalMyDsl.g:2634:17: ( '0' .. '2' '0' .. '9' 'h' )?
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
                    // InternalMyDsl.g:2634:18: '0' .. '2' '0' .. '9' 'h'
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
            // InternalMyDsl.g:2636:11: ( 'A' .. 'Z' 'A' .. 'Z' 'A' .. 'Z' 'A' .. 'Z' )
            // InternalMyDsl.g:2636:13: 'A' .. 'Z' 'A' .. 'Z' 'A' .. 'Z' 'A' .. 'Z'
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
            // InternalMyDsl.g:2638:14: ( RULE_ID '.air' )
            // InternalMyDsl.g:2638:16: RULE_ID '.air'
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
            // InternalMyDsl.g:2640:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:2640:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDsl.g:2640:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:2640:11: '^'
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

            // InternalMyDsl.g:2640:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalMyDsl.g:2642:10: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:2642:12: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:2642:12: ( '0' .. '9' )+
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
            	    // InternalMyDsl.g:2642:13: '0' .. '9'
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
            // InternalMyDsl.g:2644:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:2644:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:2644:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalMyDsl.g:2644:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:2644:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalMyDsl.g:2644:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:2644:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalMyDsl.g:2644:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:2644:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalMyDsl.g:2644:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:2644:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalMyDsl.g:2646:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDsl.g:2646:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDsl.g:2646:24: ( options {greedy=false; } : . )*
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
            	    // InternalMyDsl.g:2646:52: .
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
            // InternalMyDsl.g:2648:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:2648:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDsl.g:2648:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:2648:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalMyDsl.g:2648:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:2648:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:2648:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalMyDsl.g:2648:41: '\\r'
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
            // InternalMyDsl.g:2650:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDsl.g:2650:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDsl.g:2650:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalMyDsl.g:2652:16: ( . )
            // InternalMyDsl.g:2652:18: .
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
        "\1\uffff\2\35\1\32\1\uffff\1\32\1\35\1\uffff\1\35\1\uffff\6\35\2\64\1\35\1\32\1\35\1\uffff\3\32\2\uffff\2\35\1\uffff\1\35\1\uffff\3\35\3\uffff\3\35\1\uffff\1\35\1\uffff\7\35\1\64\1\uffff\1\64\1\35\4\uffff\21\35\1\uffff\3\137\1\35\1\142\4\35\1\147\1\35\1\151\4\35\1\137\1\35\1\uffff\2\35\1\uffff\1\35\1\163\2\35\1\uffff\1\35\1\uffff\1\167\2\35\1\172\4\35\1\177\1\uffff\3\35\1\uffff\1\35\1\u0084\1\uffff\1\35\1\u0086\2\35\1\uffff\1\35\1\u008a\2\35\1\uffff\1\35\1\uffff\2\35\1\u0090\1\uffff\4\35\1\u0095\1\uffff\1\35\1\u0097\2\35\1\uffff\1\35\2\uffff\1\u009b\1\35\1\uffff\1\u009d\1\uffff";
    static final String DFA13_eofS =
        "\u009e\uffff";
    static final String DFA13_minS =
        "\1\0\2\56\1\151\1\uffff\1\73\1\56\1\uffff\1\56\1\uffff\6\56\2\60\1\56\1\101\1\56\1\uffff\2\0\1\52\2\uffff\2\56\1\uffff\1\56\1\uffff\3\56\3\uffff\3\56\1\uffff\1\56\1\uffff\7\56\1\150\1\uffff\1\155\1\56\4\uffff\21\56\1\uffff\11\56\1\141\10\56\1\uffff\2\56\1\uffff\4\56\1\uffff\1\56\1\uffff\11\56\1\uffff\3\56\1\uffff\2\56\1\uffff\4\56\1\uffff\4\56\1\uffff\1\56\1\uffff\3\56\1\uffff\5\56\1\uffff\4\56\1\uffff\1\56\2\uffff\2\56\1\uffff\1\56\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\2\172\1\151\1\uffff\1\73\1\172\1\uffff\1\172\1\uffff\6\172\2\71\3\172\1\uffff\2\uffff\1\57\2\uffff\2\172\1\uffff\1\172\1\uffff\3\172\3\uffff\3\172\1\uffff\1\172\1\uffff\7\172\1\155\1\uffff\1\155\1\172\4\uffff\21\172\1\uffff\11\172\1\141\10\172\1\uffff\2\172\1\uffff\4\172\1\uffff\1\172\1\uffff\11\172\1\uffff\3\172\1\uffff\2\172\1\uffff\4\172\1\uffff\4\172\1\uffff\1\172\1\uffff\3\172\1\uffff\5\172\1\uffff\4\172\1\uffff\1\172\2\uffff\2\172\1\uffff\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\4\uffff\1\4\2\uffff\1\7\1\uffff\1\12\13\uffff\1\32\3\uffff\1\36\1\37\2\uffff\1\31\1\uffff\1\30\3\uffff\1\3\1\4\1\5\3\uffff\1\7\1\uffff\1\12\10\uffff\1\32\2\uffff\1\33\1\34\1\35\1\36\21\uffff\1\26\22\uffff\1\27\2\uffff\1\16\4\uffff\1\10\1\uffff\1\15\11\uffff\1\6\3\uffff\1\20\2\uffff\1\24\4\uffff\1\17\4\uffff\1\22\1\uffff\1\1\3\uffff\1\23\5\uffff\1\14\4\uffff\1\11\1\uffff\1\21\1\25\2\uffff\1\2\1\uffff\1\13";
    static final String DFA13_specialS =
        "\1\1\25\uffff\1\0\1\2\u0086\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\32\2\31\2\32\1\31\22\32\1\31\1\32\1\26\2\32\1\3\1\32\1\27\7\32\1\30\3\20\3\21\4\25\1\7\1\11\1\4\1\32\1\5\2\32\1\6\1\22\1\15\1\16\1\10\2\22\1\1\3\22\1\14\1\12\1\22\1\13\1\2\1\22\1\17\10\22\3\32\1\23\1\24\1\32\32\24\uff85\32",
            "\1\37\1\uffff\12\36\7\uffff\4\34\1\33\25\34\4\uffff\1\36\1\uffff\32\36",
            "\1\37\1\uffff\12\36\7\uffff\21\34\1\40\10\34\4\uffff\1\36\1\uffff\1\41\7\36\1\42\21\36",
            "\1\43",
            "",
            "\1\45",
            "\1\37\1\uffff\12\36\7\uffff\32\34\4\uffff\1\36\1\uffff\4\36\1\47\14\36\1\50\3\36\1\46\4\36",
            "",
            "\1\37\1\uffff\12\36\7\uffff\32\34\4\uffff\1\36\1\uffff\15\36\1\52\14\36",
            "",
            "\1\37\1\uffff\12\36\7\uffff\32\34\4\uffff\1\36\1\uffff\16\36\1\54\13\36",
            "\1\37\1\uffff\12\36\7\uffff\1\55\31\34\4\uffff\1\36\1\uffff\32\36",
            "\1\37\1\uffff\12\36\7\uffff\32\34\4\uffff\1\36\1\uffff\10\36\1\56\21\36",
            "\1\37\1\uffff\12\36\7\uffff\32\34\4\uffff\1\36\1\uffff\16\36\1\57\13\36",
            "\1\37\1\uffff\12\36\7\uffff\32\34\4\uffff\1\36\1\uffff\4\36\1\60\17\36\1\61\5\36",
            "\1\37\1\uffff\12\36\7\uffff\4\34\1\62\25\34\4\uffff\1\36\1\uffff\32\36",
            "\12\63",
            "\12\65",
            "\1\37\1\uffff\12\36\7\uffff\32\34\4\uffff\1\36\1\uffff\32\36",
            "\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\0\67",
            "\0\67",
            "\1\70\4\uffff\1\71",
            "",
            "",
            "\1\37\1\uffff\12\36\7\uffff\13\74\1\73\16\74\4\uffff\1\36\1\uffff\32\36",
            "\1\37\1\uffff\12\36\7\uffff\32\74\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\37\1\uffff\12\36\7\uffff\16\74\1\75\13\74\4\uffff\1\36\1\uffff\32\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\22\36\1\76\5\36\1\77\1\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\22\36\1\100\7\36",
            "",
            "",
            "",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\10\36\1\101\21\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\21\36\1\102\10\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\21\36\1\103\10\36",
            "",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\3\36\1\104\26\36",
            "",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\23\36\1\105\6\36",
            "\1\37\1\uffff\12\36\7\uffff\2\74\1\106\27\74\4\uffff\1\36\1\uffff\32\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\6\36\1\107\23\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\14\36\1\110\15\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\17\36\1\111\12\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\21\36\1\112\10\36",
            "\1\37\1\uffff\12\36\7\uffff\6\74\1\113\23\74\4\uffff\1\36\1\uffff\32\36",
            "\1\114\4\uffff\1\114",
            "",
            "\1\114",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "",
            "",
            "\1\37\1\uffff\12\36\7\uffff\10\116\1\115\21\116\4\uffff\1\36\1\uffff\32\36",
            "\1\37\1\uffff\12\36\7\uffff\32\116\4\uffff\1\36\1\uffff\32\36",
            "\1\37\1\uffff\12\36\7\uffff\17\116\1\117\12\116\4\uffff\1\36\1\uffff\32\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\22\36\1\120\7\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\22\36\1\121\7\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\23\36\1\122\6\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\16\36\1\123\13\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\16\36\1\124\13\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\10\36\1\125\21\36",
            "\1\126\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\16\36\1\127\13\36",
            "\1\37\1\uffff\12\36\7\uffff\10\116\1\130\21\116\4\uffff\1\36\1\uffff\32\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\15\36\1\131\14\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\17\36\1\132\12\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\1\133\31\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\134\25\36",
            "\1\37\1\uffff\12\36\7\uffff\24\116\1\135\5\116\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\37\1\uffff\12\36\7\uffff\2\36\1\136\27\36\4\uffff\1\36\1\uffff\32\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\37\1\uffff\12\36\7\uffff\24\36\1\140\5\36\4\uffff\1\36\1\uffff\32\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\1\141\31\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\143\25\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\15\36\1\144\14\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\17\36\1\145\12\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\25\36\1\146\4\36",
            "\1\37",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\21\36\1\150\10\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\152\25\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\1\153\31\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\21\36\1\154\10\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\155\25\36",
            "\1\37\1\uffff\12\36\7\uffff\13\36\1\156\16\36\4\uffff\1\36\1\uffff\32\36",
            "\1\37\1\uffff\12\36\7\uffff\4\36\1\157\25\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\37\1\uffff\12\36\7\uffff\13\36\1\160\16\36\4\uffff\1\36\1\uffff\32\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\6\36\1\161\23\36",
            "",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\22\36\1\162\7\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\16\36\1\164\13\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\165\25\36",
            "",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\10\36\1\166\21\36",
            "",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\6\36\1\170\23\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\23\36\1\171\6\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\37\1\uffff\12\36\7\uffff\10\36\1\173\21\36\4\uffff\1\36\1\uffff\32\36",
            "\1\37\1\uffff\12\36\7\uffff\22\36\1\174\7\36\4\uffff\1\36\1\uffff\32\36",
            "\1\37\1\uffff\12\36\7\uffff\22\36\1\175\7\36\4\uffff\1\36\1\uffff\32\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\176\25\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\21\36\1\u0080\10\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\u0081\25\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\22\36\1\u0082\7\36",
            "",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\15\36\1\u0083\14\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\37\1\uffff\12\36\7\uffff\4\36\1\u0085\25\36\4\uffff\1\36\1\uffff\32\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\37\1\uffff\12\36\7\uffff\4\36\1\u0087\25\36\4\uffff\1\36\1\uffff\32\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\21\36\1\u0088\10\36",
            "",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\23\36\1\u0089\6\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\1\u008b\31\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\10\36\1\u008c\21\36",
            "",
            "\1\37\1\uffff\12\36\7\uffff\21\36\1\u008d\10\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\37\1\uffff\12\36\7\uffff\24\36\1\u008e\5\36\4\uffff\1\36\1\uffff\32\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\22\36\1\u008f\7\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\23\36\1\u0091\6\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\u0092\25\36",
            "\1\37\1\uffff\12\36\7\uffff\4\36\1\u0093\25\36\4\uffff\1\36\1\uffff\32\36",
            "\1\37\1\uffff\12\36\7\uffff\21\36\1\u0094\10\36\4\uffff\1\36\1\uffff\32\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\10\36\1\u0096\21\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\37\1\uffff\12\36\1\uffff\1\u0098\5\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\37\1\uffff\12\36\7\uffff\22\36\1\u0099\7\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\16\36\1\u009a\13\36",
            "",
            "",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\15\36\1\u009c\14\36",
            "",
            "\1\37\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
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
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='H') ) {s = 1;}

                        else if ( (LA13_0=='P') ) {s = 2;}

                        else if ( (LA13_0=='%') ) {s = 3;}

                        else if ( (LA13_0=='<') ) {s = 4;}

                        else if ( (LA13_0=='>') ) {s = 5;}

                        else if ( (LA13_0=='A') ) {s = 6;}

                        else if ( (LA13_0==':') ) {s = 7;}

                        else if ( (LA13_0=='E') ) {s = 8;}

                        else if ( (LA13_0==';') ) {s = 9;}

                        else if ( (LA13_0=='M') ) {s = 10;}

                        else if ( (LA13_0=='O') ) {s = 11;}

                        else if ( (LA13_0=='L') ) {s = 12;}

                        else if ( (LA13_0=='C') ) {s = 13;}

                        else if ( (LA13_0=='D') ) {s = 14;}

                        else if ( (LA13_0=='R') ) {s = 15;}

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
                    case 2 : 
                        int LA13_23 = input.LA(1);

                        s = -1;
                        if ( ((LA13_23>='\u0000' && LA13_23<='\uFFFF')) ) {s = 55;}

                        else s = 26;

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