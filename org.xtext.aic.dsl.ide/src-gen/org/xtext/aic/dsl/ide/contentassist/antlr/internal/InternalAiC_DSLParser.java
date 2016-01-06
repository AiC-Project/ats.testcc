package org.xtext.aic.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.aic.dsl.services.AiC_DSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAiC_DSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Set'", "'at'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalAiC_DSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAiC_DSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAiC_DSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAiC_DSL.g"; }


    	private AiC_DSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(AiC_DSLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalAiC_DSL.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalAiC_DSL.g:54:1: ( ruleModel EOF )
            // InternalAiC_DSL.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalAiC_DSL.g:62:1: ruleModel : ( ( rule__Model__SensorsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiC_DSL.g:66:2: ( ( ( rule__Model__SensorsAssignment )* ) )
            // InternalAiC_DSL.g:67:2: ( ( rule__Model__SensorsAssignment )* )
            {
            // InternalAiC_DSL.g:67:2: ( ( rule__Model__SensorsAssignment )* )
            // InternalAiC_DSL.g:68:3: ( rule__Model__SensorsAssignment )*
            {
             before(grammarAccess.getModelAccess().getSensorsAssignment()); 
            // InternalAiC_DSL.g:69:3: ( rule__Model__SensorsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAiC_DSL.g:69:4: rule__Model__SensorsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__SensorsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getSensorsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSensor"
    // InternalAiC_DSL.g:78:1: entryRuleSensor : ruleSensor EOF ;
    public final void entryRuleSensor() throws RecognitionException {
        try {
            // InternalAiC_DSL.g:79:1: ( ruleSensor EOF )
            // InternalAiC_DSL.g:80:1: ruleSensor EOF
            {
             before(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getSensorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalAiC_DSL.g:87:1: ruleSensor : ( ( rule__Sensor__Group__0 ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiC_DSL.g:91:2: ( ( ( rule__Sensor__Group__0 ) ) )
            // InternalAiC_DSL.g:92:2: ( ( rule__Sensor__Group__0 ) )
            {
            // InternalAiC_DSL.g:92:2: ( ( rule__Sensor__Group__0 ) )
            // InternalAiC_DSL.g:93:3: ( rule__Sensor__Group__0 )
            {
             before(grammarAccess.getSensorAccess().getGroup()); 
            // InternalAiC_DSL.g:94:3: ( rule__Sensor__Group__0 )
            // InternalAiC_DSL.g:94:4: rule__Sensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "rule__Sensor__Group__0"
    // InternalAiC_DSL.g:102:1: rule__Sensor__Group__0 : rule__Sensor__Group__0__Impl rule__Sensor__Group__1 ;
    public final void rule__Sensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiC_DSL.g:106:1: ( rule__Sensor__Group__0__Impl rule__Sensor__Group__1 )
            // InternalAiC_DSL.g:107:2: rule__Sensor__Group__0__Impl rule__Sensor__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Sensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__0"


    // $ANTLR start "rule__Sensor__Group__0__Impl"
    // InternalAiC_DSL.g:114:1: rule__Sensor__Group__0__Impl : ( 'Set' ) ;
    public final void rule__Sensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiC_DSL.g:118:1: ( ( 'Set' ) )
            // InternalAiC_DSL.g:119:1: ( 'Set' )
            {
            // InternalAiC_DSL.g:119:1: ( 'Set' )
            // InternalAiC_DSL.g:120:2: 'Set'
            {
             before(grammarAccess.getSensorAccess().getSetKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getSetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__0__Impl"


    // $ANTLR start "rule__Sensor__Group__1"
    // InternalAiC_DSL.g:129:1: rule__Sensor__Group__1 : rule__Sensor__Group__1__Impl rule__Sensor__Group__2 ;
    public final void rule__Sensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiC_DSL.g:133:1: ( rule__Sensor__Group__1__Impl rule__Sensor__Group__2 )
            // InternalAiC_DSL.g:134:2: rule__Sensor__Group__1__Impl rule__Sensor__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Sensor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__1"


    // $ANTLR start "rule__Sensor__Group__1__Impl"
    // InternalAiC_DSL.g:141:1: rule__Sensor__Group__1__Impl : ( ( rule__Sensor__NameAssignment_1 ) ) ;
    public final void rule__Sensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiC_DSL.g:145:1: ( ( ( rule__Sensor__NameAssignment_1 ) ) )
            // InternalAiC_DSL.g:146:1: ( ( rule__Sensor__NameAssignment_1 ) )
            {
            // InternalAiC_DSL.g:146:1: ( ( rule__Sensor__NameAssignment_1 ) )
            // InternalAiC_DSL.g:147:2: ( rule__Sensor__NameAssignment_1 )
            {
             before(grammarAccess.getSensorAccess().getNameAssignment_1()); 
            // InternalAiC_DSL.g:148:2: ( rule__Sensor__NameAssignment_1 )
            // InternalAiC_DSL.g:148:3: rule__Sensor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__1__Impl"


    // $ANTLR start "rule__Sensor__Group__2"
    // InternalAiC_DSL.g:156:1: rule__Sensor__Group__2 : rule__Sensor__Group__2__Impl rule__Sensor__Group__3 ;
    public final void rule__Sensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiC_DSL.g:160:1: ( rule__Sensor__Group__2__Impl rule__Sensor__Group__3 )
            // InternalAiC_DSL.g:161:2: rule__Sensor__Group__2__Impl rule__Sensor__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Sensor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__2"


    // $ANTLR start "rule__Sensor__Group__2__Impl"
    // InternalAiC_DSL.g:168:1: rule__Sensor__Group__2__Impl : ( 'at' ) ;
    public final void rule__Sensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiC_DSL.g:172:1: ( ( 'at' ) )
            // InternalAiC_DSL.g:173:1: ( 'at' )
            {
            // InternalAiC_DSL.g:173:1: ( 'at' )
            // InternalAiC_DSL.g:174:2: 'at'
            {
             before(grammarAccess.getSensorAccess().getAtKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getAtKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__2__Impl"


    // $ANTLR start "rule__Sensor__Group__3"
    // InternalAiC_DSL.g:183:1: rule__Sensor__Group__3 : rule__Sensor__Group__3__Impl ;
    public final void rule__Sensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiC_DSL.g:187:1: ( rule__Sensor__Group__3__Impl )
            // InternalAiC_DSL.g:188:2: rule__Sensor__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__3"


    // $ANTLR start "rule__Sensor__Group__3__Impl"
    // InternalAiC_DSL.g:194:1: rule__Sensor__Group__3__Impl : ( ( rule__Sensor__ValueAssignment_3 ) ) ;
    public final void rule__Sensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiC_DSL.g:198:1: ( ( ( rule__Sensor__ValueAssignment_3 ) ) )
            // InternalAiC_DSL.g:199:1: ( ( rule__Sensor__ValueAssignment_3 ) )
            {
            // InternalAiC_DSL.g:199:1: ( ( rule__Sensor__ValueAssignment_3 ) )
            // InternalAiC_DSL.g:200:2: ( rule__Sensor__ValueAssignment_3 )
            {
             before(grammarAccess.getSensorAccess().getValueAssignment_3()); 
            // InternalAiC_DSL.g:201:2: ( rule__Sensor__ValueAssignment_3 )
            // InternalAiC_DSL.g:201:3: rule__Sensor__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__3__Impl"


    // $ANTLR start "rule__Model__SensorsAssignment"
    // InternalAiC_DSL.g:210:1: rule__Model__SensorsAssignment : ( ruleSensor ) ;
    public final void rule__Model__SensorsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiC_DSL.g:214:1: ( ( ruleSensor ) )
            // InternalAiC_DSL.g:215:2: ( ruleSensor )
            {
            // InternalAiC_DSL.g:215:2: ( ruleSensor )
            // InternalAiC_DSL.g:216:3: ruleSensor
            {
             before(grammarAccess.getModelAccess().getSensorsSensorParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSensorsSensorParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SensorsAssignment"


    // $ANTLR start "rule__Sensor__NameAssignment_1"
    // InternalAiC_DSL.g:225:1: rule__Sensor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sensor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiC_DSL.g:229:1: ( ( RULE_ID ) )
            // InternalAiC_DSL.g:230:2: ( RULE_ID )
            {
            // InternalAiC_DSL.g:230:2: ( RULE_ID )
            // InternalAiC_DSL.g:231:3: RULE_ID
            {
             before(grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__NameAssignment_1"


    // $ANTLR start "rule__Sensor__ValueAssignment_3"
    // InternalAiC_DSL.g:240:1: rule__Sensor__ValueAssignment_3 : ( RULE_INT ) ;
    public final void rule__Sensor__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAiC_DSL.g:244:1: ( ( RULE_INT ) )
            // InternalAiC_DSL.g:245:2: ( RULE_INT )
            {
            // InternalAiC_DSL.g:245:2: ( RULE_INT )
            // InternalAiC_DSL.g:246:3: RULE_INT
            {
             before(grammarAccess.getSensorAccess().getValueINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getValueINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__ValueAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});

}