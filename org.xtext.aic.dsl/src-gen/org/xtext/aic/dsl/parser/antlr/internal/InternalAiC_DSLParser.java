package org.xtext.aic.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.aic.dsl.services.AiC_DSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAiC_DSLParser extends AbstractInternalAntlrParser {
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

        public InternalAiC_DSLParser(TokenStream input, AiC_DSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected AiC_DSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalAiC_DSL.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalAiC_DSL.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalAiC_DSL.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalAiC_DSL.g:71:1: ruleModel returns [EObject current=null] : ( (lv_sensors_0_0= ruleSensor ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_sensors_0_0 = null;



        	enterRule();

        try {
            // InternalAiC_DSL.g:77:2: ( ( (lv_sensors_0_0= ruleSensor ) )* )
            // InternalAiC_DSL.g:78:2: ( (lv_sensors_0_0= ruleSensor ) )*
            {
            // InternalAiC_DSL.g:78:2: ( (lv_sensors_0_0= ruleSensor ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAiC_DSL.g:79:3: (lv_sensors_0_0= ruleSensor )
            	    {
            	    // InternalAiC_DSL.g:79:3: (lv_sensors_0_0= ruleSensor )
            	    // InternalAiC_DSL.g:80:4: lv_sensors_0_0= ruleSensor
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getSensorsSensorParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_sensors_0_0=ruleSensor();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"sensors",
            	    					lv_sensors_0_0,
            	    					"org.xtext.aic.dsl.AiC_DSL.Sensor");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSensor"
    // InternalAiC_DSL.g:100:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalAiC_DSL.g:100:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalAiC_DSL.g:101:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalAiC_DSL.g:107:1: ruleSensor returns [EObject current=null] : (otherlv_0= 'Set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'at' ( (lv_value_3_0= RULE_INT ) ) ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalAiC_DSL.g:113:2: ( (otherlv_0= 'Set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'at' ( (lv_value_3_0= RULE_INT ) ) ) )
            // InternalAiC_DSL.g:114:2: (otherlv_0= 'Set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'at' ( (lv_value_3_0= RULE_INT ) ) )
            {
            // InternalAiC_DSL.g:114:2: (otherlv_0= 'Set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'at' ( (lv_value_3_0= RULE_INT ) ) )
            // InternalAiC_DSL.g:115:3: otherlv_0= 'Set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'at' ( (lv_value_3_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSetKeyword_0());
            		
            // InternalAiC_DSL.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAiC_DSL.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAiC_DSL.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalAiC_DSL.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorAccess().getAtKeyword_2());
            		
            // InternalAiC_DSL.g:141:3: ( (lv_value_3_0= RULE_INT ) )
            // InternalAiC_DSL.g:142:4: (lv_value_3_0= RULE_INT )
            {
            // InternalAiC_DSL.g:142:4: (lv_value_3_0= RULE_INT )
            // InternalAiC_DSL.g:143:5: lv_value_3_0= RULE_INT
            {
            lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getSensorAccess().getValueINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensor"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});

}