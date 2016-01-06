package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INCLUDE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_OACI", "RULE_DURATION", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'%include'", "'<'", "'>;'", "'Avion'", "':'", "'Passagers'", "';'", "'Motorisation'", "'End.'", "'Aeroport'", "'OACI'", "'Pays'", "'Pistes'", "'Ligne'", "'Compagnie'", "'Depart'", "'Arrivee'", "'Duree'", "'REGULIERE;'", "'HELICES'", "'PROPULSEURS'"
    };
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


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:66:2: iv_ruleModel= ruleModel EOF
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
    // InternalMyDsl.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_includes_0_0= ruleIncludes ) )* ( ( (lv_planes_1_0= rulePlane ) ) | ( (lv_airports_2_0= ruleAirport ) ) )* ( (lv_airlines_3_0= ruleAirline ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_includes_0_0 = null;

        EObject lv_planes_1_0 = null;

        EObject lv_airports_2_0 = null;

        EObject lv_airlines_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( ( (lv_includes_0_0= ruleIncludes ) )* ( ( (lv_planes_1_0= rulePlane ) ) | ( (lv_airports_2_0= ruleAirport ) ) )* ( (lv_airlines_3_0= ruleAirline ) )* ) )
            // InternalMyDsl.g:79:2: ( ( (lv_includes_0_0= ruleIncludes ) )* ( ( (lv_planes_1_0= rulePlane ) ) | ( (lv_airports_2_0= ruleAirport ) ) )* ( (lv_airlines_3_0= ruleAirline ) )* )
            {
            // InternalMyDsl.g:79:2: ( ( (lv_includes_0_0= ruleIncludes ) )* ( ( (lv_planes_1_0= rulePlane ) ) | ( (lv_airports_2_0= ruleAirport ) ) )* ( (lv_airlines_3_0= ruleAirline ) )* )
            // InternalMyDsl.g:80:3: ( (lv_includes_0_0= ruleIncludes ) )* ( ( (lv_planes_1_0= rulePlane ) ) | ( (lv_airports_2_0= ruleAirport ) ) )* ( (lv_airlines_3_0= ruleAirline ) )*
            {
            // InternalMyDsl.g:80:3: ( (lv_includes_0_0= ruleIncludes ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:81:4: (lv_includes_0_0= ruleIncludes )
            	    {
            	    // InternalMyDsl.g:81:4: (lv_includes_0_0= ruleIncludes )
            	    // InternalMyDsl.g:82:5: lv_includes_0_0= ruleIncludes
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getIncludesIncludesParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_includes_0_0=ruleIncludes();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"includes",
            	    						lv_includes_0_0,
            	    						"org.xtext.example.mydsl.MyDsl.Includes");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyDsl.g:99:3: ( ( (lv_planes_1_0= rulePlane ) ) | ( (lv_airports_2_0= ruleAirport ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }
                else if ( (LA2_0==23) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:100:4: ( (lv_planes_1_0= rulePlane ) )
            	    {
            	    // InternalMyDsl.g:100:4: ( (lv_planes_1_0= rulePlane ) )
            	    // InternalMyDsl.g:101:5: (lv_planes_1_0= rulePlane )
            	    {
            	    // InternalMyDsl.g:101:5: (lv_planes_1_0= rulePlane )
            	    // InternalMyDsl.g:102:6: lv_planes_1_0= rulePlane
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getPlanesPlaneParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_planes_1_0=rulePlane();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"planes",
            	    							lv_planes_1_0,
            	    							"org.xtext.example.mydsl.MyDsl.Plane");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:120:4: ( (lv_airports_2_0= ruleAirport ) )
            	    {
            	    // InternalMyDsl.g:120:4: ( (lv_airports_2_0= ruleAirport ) )
            	    // InternalMyDsl.g:121:5: (lv_airports_2_0= ruleAirport )
            	    {
            	    // InternalMyDsl.g:121:5: (lv_airports_2_0= ruleAirport )
            	    // InternalMyDsl.g:122:6: lv_airports_2_0= ruleAirport
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getAirportsAirportParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_airports_2_0=ruleAirport();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"airports",
            	    							lv_airports_2_0,
            	    							"org.xtext.example.mydsl.MyDsl.Airport");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalMyDsl.g:140:3: ( (lv_airlines_3_0= ruleAirline ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==27) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:141:4: (lv_airlines_3_0= ruleAirline )
            	    {
            	    // InternalMyDsl.g:141:4: (lv_airlines_3_0= ruleAirline )
            	    // InternalMyDsl.g:142:5: lv_airlines_3_0= ruleAirline
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getAirlinesAirlineParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_airlines_3_0=ruleAirline();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"airlines",
            	    						lv_airlines_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.Airline");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleIncludes"
    // InternalMyDsl.g:163:1: entryRuleIncludes returns [EObject current=null] : iv_ruleIncludes= ruleIncludes EOF ;
    public final EObject entryRuleIncludes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncludes = null;


        try {
            // InternalMyDsl.g:163:49: (iv_ruleIncludes= ruleIncludes EOF )
            // InternalMyDsl.g:164:2: iv_ruleIncludes= ruleIncludes EOF
            {
             newCompositeNode(grammarAccess.getIncludesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIncludes=ruleIncludes();

            state._fsp--;

             current =iv_ruleIncludes; 
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
    // $ANTLR end "entryRuleIncludes"


    // $ANTLR start "ruleIncludes"
    // InternalMyDsl.g:170:1: ruleIncludes returns [EObject current=null] : (otherlv_0= '%include' otherlv_1= '<' ( (lv_importURI_2_0= RULE_INCLUDE ) ) otherlv_3= '>;' ) ;
    public final EObject ruleIncludes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_importURI_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:176:2: ( (otherlv_0= '%include' otherlv_1= '<' ( (lv_importURI_2_0= RULE_INCLUDE ) ) otherlv_3= '>;' ) )
            // InternalMyDsl.g:177:2: (otherlv_0= '%include' otherlv_1= '<' ( (lv_importURI_2_0= RULE_INCLUDE ) ) otherlv_3= '>;' )
            {
            // InternalMyDsl.g:177:2: (otherlv_0= '%include' otherlv_1= '<' ( (lv_importURI_2_0= RULE_INCLUDE ) ) otherlv_3= '>;' )
            // InternalMyDsl.g:178:3: otherlv_0= '%include' otherlv_1= '<' ( (lv_importURI_2_0= RULE_INCLUDE ) ) otherlv_3= '>;'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getIncludesAccess().getIncludeKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getIncludesAccess().getLessThanSignKeyword_1());
            		
            // InternalMyDsl.g:186:3: ( (lv_importURI_2_0= RULE_INCLUDE ) )
            // InternalMyDsl.g:187:4: (lv_importURI_2_0= RULE_INCLUDE )
            {
            // InternalMyDsl.g:187:4: (lv_importURI_2_0= RULE_INCLUDE )
            // InternalMyDsl.g:188:5: lv_importURI_2_0= RULE_INCLUDE
            {
            lv_importURI_2_0=(Token)match(input,RULE_INCLUDE,FOLLOW_8); 

            					newLeafNode(lv_importURI_2_0, grammarAccess.getIncludesAccess().getImportURIINCLUDETerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIncludesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"importURI",
            						lv_importURI_2_0,
            						"org.xtext.example.mydsl.MyDsl.INCLUDE");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getIncludesAccess().getGreaterThanSignSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleIncludes"


    // $ANTLR start "entryRulePlane"
    // InternalMyDsl.g:212:1: entryRulePlane returns [EObject current=null] : iv_rulePlane= rulePlane EOF ;
    public final EObject entryRulePlane() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlane = null;


        try {
            // InternalMyDsl.g:212:46: (iv_rulePlane= rulePlane EOF )
            // InternalMyDsl.g:213:2: iv_rulePlane= rulePlane EOF
            {
             newCompositeNode(grammarAccess.getPlaneRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlane=rulePlane();

            state._fsp--;

             current =iv_rulePlane; 
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
    // $ANTLR end "entryRulePlane"


    // $ANTLR start "rulePlane"
    // InternalMyDsl.g:219:1: rulePlane returns [EObject current=null] : (otherlv_0= 'Avion' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Passagers' otherlv_5= ':' ( (lv_passengers_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Motorisation' otherlv_9= ':' ( (lv_motorisation_10_0= ruleEngines ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) ) otherlv_12= 'End.' ) ;
    public final EObject rulePlane() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_passengers_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Enumerator lv_motorisation_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:225:2: ( (otherlv_0= 'Avion' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Passagers' otherlv_5= ':' ( (lv_passengers_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Motorisation' otherlv_9= ':' ( (lv_motorisation_10_0= ruleEngines ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) ) otherlv_12= 'End.' ) )
            // InternalMyDsl.g:226:2: (otherlv_0= 'Avion' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Passagers' otherlv_5= ':' ( (lv_passengers_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Motorisation' otherlv_9= ':' ( (lv_motorisation_10_0= ruleEngines ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) ) otherlv_12= 'End.' )
            {
            // InternalMyDsl.g:226:2: (otherlv_0= 'Avion' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Passagers' otherlv_5= ':' ( (lv_passengers_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Motorisation' otherlv_9= ':' ( (lv_motorisation_10_0= ruleEngines ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) ) otherlv_12= 'End.' )
            // InternalMyDsl.g:227:3: otherlv_0= 'Avion' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Passagers' otherlv_5= ':' ( (lv_passengers_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Motorisation' otherlv_9= ':' ( (lv_motorisation_10_0= ruleEngines ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) ) otherlv_12= 'End.'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPlaneAccess().getAvionKeyword_0());
            		
            // InternalMyDsl.g:231:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:232:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:232:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:233:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlaneAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlaneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getPlaneAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:253:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Passagers' otherlv_5= ':' ( (lv_passengers_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Motorisation' otherlv_9= ':' ( (lv_motorisation_10_0= ruleEngines ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) )
            // InternalMyDsl.g:254:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Passagers' otherlv_5= ':' ( (lv_passengers_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Motorisation' otherlv_9= ':' ( (lv_motorisation_10_0= ruleEngines ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) )
            {
            // InternalMyDsl.g:254:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Passagers' otherlv_5= ':' ( (lv_passengers_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Motorisation' otherlv_9= ':' ( (lv_motorisation_10_0= ruleEngines ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) )
            // InternalMyDsl.g:255:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'Passagers' otherlv_5= ':' ( (lv_passengers_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Motorisation' otherlv_9= ':' ( (lv_motorisation_10_0= ruleEngines ) ) otherlv_11= ';' ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getPlaneAccess().getUnorderedGroup_3());
            				
            // InternalMyDsl.g:258:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'Passagers' otherlv_5= ':' ( (lv_passengers_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Motorisation' otherlv_9= ':' ( (lv_motorisation_10_0= ruleEngines ) ) otherlv_11= ';' ) ) ) ) )+ {...}?)
            // InternalMyDsl.g:259:6: ( ({...}? => ( ({...}? => (otherlv_4= 'Passagers' otherlv_5= ':' ( (lv_passengers_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Motorisation' otherlv_9= ':' ( (lv_motorisation_10_0= ruleEngines ) ) otherlv_11= ';' ) ) ) ) )+ {...}?
            {
            // InternalMyDsl.g:259:6: ( ({...}? => ( ({...}? => (otherlv_4= 'Passagers' otherlv_5= ':' ( (lv_passengers_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Motorisation' otherlv_9= ':' ( (lv_motorisation_10_0= ruleEngines ) ) otherlv_11= ';' ) ) ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( LA4_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlaneAccess().getUnorderedGroup_3(), 0) ) {
                    alt4=1;
                }
                else if ( LA4_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlaneAccess().getUnorderedGroup_3(), 1) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:260:4: ({...}? => ( ({...}? => (otherlv_4= 'Passagers' otherlv_5= ':' ( (lv_passengers_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // InternalMyDsl.g:260:4: ({...}? => ( ({...}? => (otherlv_4= 'Passagers' otherlv_5= ':' ( (lv_passengers_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) )
            	    // InternalMyDsl.g:261:5: {...}? => ( ({...}? => (otherlv_4= 'Passagers' otherlv_5= ':' ( (lv_passengers_6_0= RULE_INT ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlaneAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePlane", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlaneAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalMyDsl.g:261:102: ( ({...}? => (otherlv_4= 'Passagers' otherlv_5= ':' ( (lv_passengers_6_0= RULE_INT ) ) otherlv_7= ';' ) ) )
            	    // InternalMyDsl.g:262:6: ({...}? => (otherlv_4= 'Passagers' otherlv_5= ':' ( (lv_passengers_6_0= RULE_INT ) ) otherlv_7= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPlaneAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalMyDsl.g:265:9: ({...}? => (otherlv_4= 'Passagers' otherlv_5= ':' ( (lv_passengers_6_0= RULE_INT ) ) otherlv_7= ';' ) )
            	    // InternalMyDsl.g:265:10: {...}? => (otherlv_4= 'Passagers' otherlv_5= ':' ( (lv_passengers_6_0= RULE_INT ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePlane", "true");
            	    }
            	    // InternalMyDsl.g:265:19: (otherlv_4= 'Passagers' otherlv_5= ':' ( (lv_passengers_6_0= RULE_INT ) ) otherlv_7= ';' )
            	    // InternalMyDsl.g:265:20: otherlv_4= 'Passagers' otherlv_5= ':' ( (lv_passengers_6_0= RULE_INT ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,19,FOLLOW_10); 

            	    									newLeafNode(otherlv_4, grammarAccess.getPlaneAccess().getPassagersKeyword_3_0_0());
            	    								
            	    otherlv_5=(Token)match(input,18,FOLLOW_12); 

            	    									newLeafNode(otherlv_5, grammarAccess.getPlaneAccess().getColonKeyword_3_0_1());
            	    								
            	    // InternalMyDsl.g:273:9: ( (lv_passengers_6_0= RULE_INT ) )
            	    // InternalMyDsl.g:274:10: (lv_passengers_6_0= RULE_INT )
            	    {
            	    // InternalMyDsl.g:274:10: (lv_passengers_6_0= RULE_INT )
            	    // InternalMyDsl.g:275:11: lv_passengers_6_0= RULE_INT
            	    {
            	    lv_passengers_6_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            	    											newLeafNode(lv_passengers_6_0, grammarAccess.getPlaneAccess().getPassengersINTTerminalRuleCall_3_0_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getPlaneRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"passengers",
            	    												lv_passengers_6_0,
            	    												"org.eclipse.xtext.common.Terminals.INT");
            	    										

            	    }


            	    }

            	    otherlv_7=(Token)match(input,20,FOLLOW_14); 

            	    									newLeafNode(otherlv_7, grammarAccess.getPlaneAccess().getSemicolonKeyword_3_0_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPlaneAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:301:4: ({...}? => ( ({...}? => (otherlv_8= 'Motorisation' otherlv_9= ':' ( (lv_motorisation_10_0= ruleEngines ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // InternalMyDsl.g:301:4: ({...}? => ( ({...}? => (otherlv_8= 'Motorisation' otherlv_9= ':' ( (lv_motorisation_10_0= ruleEngines ) ) otherlv_11= ';' ) ) ) )
            	    // InternalMyDsl.g:302:5: {...}? => ( ({...}? => (otherlv_8= 'Motorisation' otherlv_9= ':' ( (lv_motorisation_10_0= ruleEngines ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlaneAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePlane", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlaneAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalMyDsl.g:302:102: ( ({...}? => (otherlv_8= 'Motorisation' otherlv_9= ':' ( (lv_motorisation_10_0= ruleEngines ) ) otherlv_11= ';' ) ) )
            	    // InternalMyDsl.g:303:6: ({...}? => (otherlv_8= 'Motorisation' otherlv_9= ':' ( (lv_motorisation_10_0= ruleEngines ) ) otherlv_11= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPlaneAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalMyDsl.g:306:9: ({...}? => (otherlv_8= 'Motorisation' otherlv_9= ':' ( (lv_motorisation_10_0= ruleEngines ) ) otherlv_11= ';' ) )
            	    // InternalMyDsl.g:306:10: {...}? => (otherlv_8= 'Motorisation' otherlv_9= ':' ( (lv_motorisation_10_0= ruleEngines ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePlane", "true");
            	    }
            	    // InternalMyDsl.g:306:19: (otherlv_8= 'Motorisation' otherlv_9= ':' ( (lv_motorisation_10_0= ruleEngines ) ) otherlv_11= ';' )
            	    // InternalMyDsl.g:306:20: otherlv_8= 'Motorisation' otherlv_9= ':' ( (lv_motorisation_10_0= ruleEngines ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,21,FOLLOW_10); 

            	    									newLeafNode(otherlv_8, grammarAccess.getPlaneAccess().getMotorisationKeyword_3_1_0());
            	    								
            	    otherlv_9=(Token)match(input,18,FOLLOW_15); 

            	    									newLeafNode(otherlv_9, grammarAccess.getPlaneAccess().getColonKeyword_3_1_1());
            	    								
            	    // InternalMyDsl.g:314:9: ( (lv_motorisation_10_0= ruleEngines ) )
            	    // InternalMyDsl.g:315:10: (lv_motorisation_10_0= ruleEngines )
            	    {
            	    // InternalMyDsl.g:315:10: (lv_motorisation_10_0= ruleEngines )
            	    // InternalMyDsl.g:316:11: lv_motorisation_10_0= ruleEngines
            	    {

            	    											newCompositeNode(grammarAccess.getPlaneAccess().getMotorisationEnginesEnumRuleCall_3_1_2_0());
            	    										
            	    pushFollow(FOLLOW_13);
            	    lv_motorisation_10_0=ruleEngines();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPlaneRule());
            	    											}
            	    											set(
            	    												current,
            	    												"motorisation",
            	    												lv_motorisation_10_0,
            	    												"org.xtext.example.mydsl.MyDsl.Engines");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_11=(Token)match(input,20,FOLLOW_14); 

            	    									newLeafNode(otherlv_11, grammarAccess.getPlaneAccess().getSemicolonKeyword_3_1_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPlaneAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getPlaneAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "rulePlane", "getUnorderedGroupHelper().canLeave(grammarAccess.getPlaneAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getPlaneAccess().getUnorderedGroup_3());
            				

            }

            otherlv_12=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getPlaneAccess().getEndKeyword_4());
            		

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
    // $ANTLR end "rulePlane"


    // $ANTLR start "entryRuleAirport"
    // InternalMyDsl.g:359:1: entryRuleAirport returns [EObject current=null] : iv_ruleAirport= ruleAirport EOF ;
    public final EObject entryRuleAirport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAirport = null;


        try {
            // InternalMyDsl.g:359:48: (iv_ruleAirport= ruleAirport EOF )
            // InternalMyDsl.g:360:2: iv_ruleAirport= ruleAirport EOF
            {
             newCompositeNode(grammarAccess.getAirportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAirport=ruleAirport();

            state._fsp--;

             current =iv_ruleAirport; 
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
    // $ANTLR end "entryRuleAirport"


    // $ANTLR start "ruleAirport"
    // InternalMyDsl.g:366:1: ruleAirport returns [EObject current=null] : (otherlv_0= 'Aeroport' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'OACI' otherlv_5= ':' ( (lv_name_6_0= ruleCodeOACI ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Pays' otherlv_9= ':' ( (lv_country_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Pistes' otherlv_13= ':' ( (lv_runways_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) ) )+ {...}?) ) ) otherlv_16= 'End.' ) ;
    public final EObject ruleAirport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_country_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_runways_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_name_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:372:2: ( (otherlv_0= 'Aeroport' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'OACI' otherlv_5= ':' ( (lv_name_6_0= ruleCodeOACI ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Pays' otherlv_9= ':' ( (lv_country_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Pistes' otherlv_13= ':' ( (lv_runways_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) ) )+ {...}?) ) ) otherlv_16= 'End.' ) )
            // InternalMyDsl.g:373:2: (otherlv_0= 'Aeroport' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'OACI' otherlv_5= ':' ( (lv_name_6_0= ruleCodeOACI ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Pays' otherlv_9= ':' ( (lv_country_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Pistes' otherlv_13= ':' ( (lv_runways_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) ) )+ {...}?) ) ) otherlv_16= 'End.' )
            {
            // InternalMyDsl.g:373:2: (otherlv_0= 'Aeroport' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'OACI' otherlv_5= ':' ( (lv_name_6_0= ruleCodeOACI ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Pays' otherlv_9= ':' ( (lv_country_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Pistes' otherlv_13= ':' ( (lv_runways_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) ) )+ {...}?) ) ) otherlv_16= 'End.' )
            // InternalMyDsl.g:374:3: otherlv_0= 'Aeroport' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'OACI' otherlv_5= ':' ( (lv_name_6_0= ruleCodeOACI ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Pays' otherlv_9= ':' ( (lv_country_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Pistes' otherlv_13= ':' ( (lv_runways_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) ) )+ {...}?) ) ) otherlv_16= 'End.'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getAirportAccess().getAeroportKeyword_0());
            		
            // InternalMyDsl.g:378:3: ( (lv_title_1_0= RULE_STRING ) )
            // InternalMyDsl.g:379:4: (lv_title_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:379:4: (lv_title_1_0= RULE_STRING )
            // InternalMyDsl.g:380:5: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_title_1_0, grammarAccess.getAirportAccess().getTitleSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAirportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getAirportAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:400:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'OACI' otherlv_5= ':' ( (lv_name_6_0= ruleCodeOACI ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Pays' otherlv_9= ':' ( (lv_country_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Pistes' otherlv_13= ':' ( (lv_runways_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) ) )+ {...}?) ) )
            // InternalMyDsl.g:401:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'OACI' otherlv_5= ':' ( (lv_name_6_0= ruleCodeOACI ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Pays' otherlv_9= ':' ( (lv_country_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Pistes' otherlv_13= ':' ( (lv_runways_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) ) )+ {...}?) )
            {
            // InternalMyDsl.g:401:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'OACI' otherlv_5= ':' ( (lv_name_6_0= ruleCodeOACI ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Pays' otherlv_9= ':' ( (lv_country_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Pistes' otherlv_13= ':' ( (lv_runways_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) ) )+ {...}?) )
            // InternalMyDsl.g:402:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'OACI' otherlv_5= ':' ( (lv_name_6_0= ruleCodeOACI ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Pays' otherlv_9= ':' ( (lv_country_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Pistes' otherlv_13= ':' ( (lv_runways_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getAirportAccess().getUnorderedGroup_3());
            				
            // InternalMyDsl.g:405:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'OACI' otherlv_5= ':' ( (lv_name_6_0= ruleCodeOACI ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Pays' otherlv_9= ':' ( (lv_country_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Pistes' otherlv_13= ':' ( (lv_runways_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) ) )+ {...}?)
            // InternalMyDsl.g:406:6: ( ({...}? => ( ({...}? => (otherlv_4= 'OACI' otherlv_5= ':' ( (lv_name_6_0= ruleCodeOACI ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Pays' otherlv_9= ':' ( (lv_country_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Pistes' otherlv_13= ':' ( (lv_runways_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) ) )+ {...}?
            {
            // InternalMyDsl.g:406:6: ( ({...}? => ( ({...}? => (otherlv_4= 'OACI' otherlv_5= ':' ( (lv_name_6_0= ruleCodeOACI ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Pays' otherlv_9= ':' ( (lv_country_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Pistes' otherlv_13= ':' ( (lv_runways_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=4;
                int LA5_0 = input.LA(1);

                if ( LA5_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getAirportAccess().getUnorderedGroup_3(), 0) ) {
                    alt5=1;
                }
                else if ( LA5_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getAirportAccess().getUnorderedGroup_3(), 1) ) {
                    alt5=2;
                }
                else if ( LA5_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getAirportAccess().getUnorderedGroup_3(), 2) ) {
                    alt5=3;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:407:4: ({...}? => ( ({...}? => (otherlv_4= 'OACI' otherlv_5= ':' ( (lv_name_6_0= ruleCodeOACI ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // InternalMyDsl.g:407:4: ({...}? => ( ({...}? => (otherlv_4= 'OACI' otherlv_5= ':' ( (lv_name_6_0= ruleCodeOACI ) ) otherlv_7= ';' ) ) ) )
            	    // InternalMyDsl.g:408:5: {...}? => ( ({...}? => (otherlv_4= 'OACI' otherlv_5= ':' ( (lv_name_6_0= ruleCodeOACI ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAirportAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAirport", "getUnorderedGroupHelper().canSelect(grammarAccess.getAirportAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalMyDsl.g:408:104: ( ({...}? => (otherlv_4= 'OACI' otherlv_5= ':' ( (lv_name_6_0= ruleCodeOACI ) ) otherlv_7= ';' ) ) )
            	    // InternalMyDsl.g:409:6: ({...}? => (otherlv_4= 'OACI' otherlv_5= ':' ( (lv_name_6_0= ruleCodeOACI ) ) otherlv_7= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAirportAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalMyDsl.g:412:9: ({...}? => (otherlv_4= 'OACI' otherlv_5= ':' ( (lv_name_6_0= ruleCodeOACI ) ) otherlv_7= ';' ) )
            	    // InternalMyDsl.g:412:10: {...}? => (otherlv_4= 'OACI' otherlv_5= ':' ( (lv_name_6_0= ruleCodeOACI ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAirport", "true");
            	    }
            	    // InternalMyDsl.g:412:19: (otherlv_4= 'OACI' otherlv_5= ':' ( (lv_name_6_0= ruleCodeOACI ) ) otherlv_7= ';' )
            	    // InternalMyDsl.g:412:20: otherlv_4= 'OACI' otherlv_5= ':' ( (lv_name_6_0= ruleCodeOACI ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,24,FOLLOW_10); 

            	    									newLeafNode(otherlv_4, grammarAccess.getAirportAccess().getOACIKeyword_3_0_0());
            	    								
            	    otherlv_5=(Token)match(input,18,FOLLOW_18); 

            	    									newLeafNode(otherlv_5, grammarAccess.getAirportAccess().getColonKeyword_3_0_1());
            	    								
            	    // InternalMyDsl.g:420:9: ( (lv_name_6_0= ruleCodeOACI ) )
            	    // InternalMyDsl.g:421:10: (lv_name_6_0= ruleCodeOACI )
            	    {
            	    // InternalMyDsl.g:421:10: (lv_name_6_0= ruleCodeOACI )
            	    // InternalMyDsl.g:422:11: lv_name_6_0= ruleCodeOACI
            	    {

            	    											newCompositeNode(grammarAccess.getAirportAccess().getNameCodeOACIParserRuleCall_3_0_2_0());
            	    										
            	    pushFollow(FOLLOW_13);
            	    lv_name_6_0=ruleCodeOACI();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getAirportRule());
            	    											}
            	    											set(
            	    												current,
            	    												"name",
            	    												lv_name_6_0,
            	    												"org.xtext.example.mydsl.MyDsl.CodeOACI");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_7=(Token)match(input,20,FOLLOW_19); 

            	    									newLeafNode(otherlv_7, grammarAccess.getAirportAccess().getSemicolonKeyword_3_0_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAirportAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:449:4: ({...}? => ( ({...}? => (otherlv_8= 'Pays' otherlv_9= ':' ( (lv_country_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // InternalMyDsl.g:449:4: ({...}? => ( ({...}? => (otherlv_8= 'Pays' otherlv_9= ':' ( (lv_country_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // InternalMyDsl.g:450:5: {...}? => ( ({...}? => (otherlv_8= 'Pays' otherlv_9= ':' ( (lv_country_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAirportAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAirport", "getUnorderedGroupHelper().canSelect(grammarAccess.getAirportAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalMyDsl.g:450:104: ( ({...}? => (otherlv_8= 'Pays' otherlv_9= ':' ( (lv_country_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // InternalMyDsl.g:451:6: ({...}? => (otherlv_8= 'Pays' otherlv_9= ':' ( (lv_country_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAirportAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalMyDsl.g:454:9: ({...}? => (otherlv_8= 'Pays' otherlv_9= ':' ( (lv_country_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // InternalMyDsl.g:454:10: {...}? => (otherlv_8= 'Pays' otherlv_9= ':' ( (lv_country_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAirport", "true");
            	    }
            	    // InternalMyDsl.g:454:19: (otherlv_8= 'Pays' otherlv_9= ':' ( (lv_country_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // InternalMyDsl.g:454:20: otherlv_8= 'Pays' otherlv_9= ':' ( (lv_country_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,25,FOLLOW_10); 

            	    									newLeafNode(otherlv_8, grammarAccess.getAirportAccess().getPaysKeyword_3_1_0());
            	    								
            	    otherlv_9=(Token)match(input,18,FOLLOW_16); 

            	    									newLeafNode(otherlv_9, grammarAccess.getAirportAccess().getColonKeyword_3_1_1());
            	    								
            	    // InternalMyDsl.g:462:9: ( (lv_country_10_0= RULE_STRING ) )
            	    // InternalMyDsl.g:463:10: (lv_country_10_0= RULE_STRING )
            	    {
            	    // InternalMyDsl.g:463:10: (lv_country_10_0= RULE_STRING )
            	    // InternalMyDsl.g:464:11: lv_country_10_0= RULE_STRING
            	    {
            	    lv_country_10_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            	    											newLeafNode(lv_country_10_0, grammarAccess.getAirportAccess().getCountrySTRINGTerminalRuleCall_3_1_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAirportRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"country",
            	    												lv_country_10_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    otherlv_11=(Token)match(input,20,FOLLOW_19); 

            	    									newLeafNode(otherlv_11, grammarAccess.getAirportAccess().getSemicolonKeyword_3_1_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAirportAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:490:4: ({...}? => ( ({...}? => (otherlv_12= 'Pistes' otherlv_13= ':' ( (lv_runways_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // InternalMyDsl.g:490:4: ({...}? => ( ({...}? => (otherlv_12= 'Pistes' otherlv_13= ':' ( (lv_runways_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) )
            	    // InternalMyDsl.g:491:5: {...}? => ( ({...}? => (otherlv_12= 'Pistes' otherlv_13= ':' ( (lv_runways_14_0= RULE_INT ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAirportAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleAirport", "getUnorderedGroupHelper().canSelect(grammarAccess.getAirportAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalMyDsl.g:491:104: ( ({...}? => (otherlv_12= 'Pistes' otherlv_13= ':' ( (lv_runways_14_0= RULE_INT ) ) otherlv_15= ';' ) ) )
            	    // InternalMyDsl.g:492:6: ({...}? => (otherlv_12= 'Pistes' otherlv_13= ':' ( (lv_runways_14_0= RULE_INT ) ) otherlv_15= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAirportAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalMyDsl.g:495:9: ({...}? => (otherlv_12= 'Pistes' otherlv_13= ':' ( (lv_runways_14_0= RULE_INT ) ) otherlv_15= ';' ) )
            	    // InternalMyDsl.g:495:10: {...}? => (otherlv_12= 'Pistes' otherlv_13= ':' ( (lv_runways_14_0= RULE_INT ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAirport", "true");
            	    }
            	    // InternalMyDsl.g:495:19: (otherlv_12= 'Pistes' otherlv_13= ':' ( (lv_runways_14_0= RULE_INT ) ) otherlv_15= ';' )
            	    // InternalMyDsl.g:495:20: otherlv_12= 'Pistes' otherlv_13= ':' ( (lv_runways_14_0= RULE_INT ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,26,FOLLOW_10); 

            	    									newLeafNode(otherlv_12, grammarAccess.getAirportAccess().getPistesKeyword_3_2_0());
            	    								
            	    otherlv_13=(Token)match(input,18,FOLLOW_12); 

            	    									newLeafNode(otherlv_13, grammarAccess.getAirportAccess().getColonKeyword_3_2_1());
            	    								
            	    // InternalMyDsl.g:503:9: ( (lv_runways_14_0= RULE_INT ) )
            	    // InternalMyDsl.g:504:10: (lv_runways_14_0= RULE_INT )
            	    {
            	    // InternalMyDsl.g:504:10: (lv_runways_14_0= RULE_INT )
            	    // InternalMyDsl.g:505:11: lv_runways_14_0= RULE_INT
            	    {
            	    lv_runways_14_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            	    											newLeafNode(lv_runways_14_0, grammarAccess.getAirportAccess().getRunwaysINTTerminalRuleCall_3_2_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAirportRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"runways",
            	    												lv_runways_14_0,
            	    												"org.eclipse.xtext.common.Terminals.INT");
            	    										

            	    }


            	    }

            	    otherlv_15=(Token)match(input,20,FOLLOW_19); 

            	    									newLeafNode(otherlv_15, grammarAccess.getAirportAccess().getSemicolonKeyword_3_2_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAirportAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getAirportAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleAirport", "getUnorderedGroupHelper().canLeave(grammarAccess.getAirportAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getAirportAccess().getUnorderedGroup_3());
            				

            }

            otherlv_16=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getAirportAccess().getEndKeyword_4());
            		

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
    // $ANTLR end "ruleAirport"


    // $ANTLR start "entryRuleAirline"
    // InternalMyDsl.g:547:1: entryRuleAirline returns [EObject current=null] : iv_ruleAirline= ruleAirline EOF ;
    public final EObject entryRuleAirline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAirline = null;


        try {
            // InternalMyDsl.g:547:48: (iv_ruleAirline= ruleAirline EOF )
            // InternalMyDsl.g:548:2: iv_ruleAirline= ruleAirline EOF
            {
             newCompositeNode(grammarAccess.getAirlineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAirline=ruleAirline();

            state._fsp--;

             current =iv_ruleAirline; 
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
    // $ANTLR end "entryRuleAirline"


    // $ANTLR start "ruleAirline"
    // InternalMyDsl.g:554:1: ruleAirline returns [EObject current=null] : (otherlv_0= 'Ligne' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Avion' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Compagnie' otherlv_9= ':' ( (lv_company_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Depart' otherlv_13= ':' ( (otherlv_14= RULE_OACI ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Arrivee' otherlv_17= ':' ( (otherlv_18= RULE_OACI ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'Duree' otherlv_21= ':' ( (lv_duration_22_0= RULE_DURATION ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_regular_24_0= 'REGULIERE;' ) ) ) ) ) )+ {...}?) ) ) otherlv_25= 'End.' ) ;
    public final EObject ruleAirline() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_company_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_duration_22_0=null;
        Token otherlv_23=null;
        Token lv_regular_24_0=null;
        Token otherlv_25=null;


        	enterRule();

        try {
            // InternalMyDsl.g:560:2: ( (otherlv_0= 'Ligne' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Avion' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Compagnie' otherlv_9= ':' ( (lv_company_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Depart' otherlv_13= ':' ( (otherlv_14= RULE_OACI ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Arrivee' otherlv_17= ':' ( (otherlv_18= RULE_OACI ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'Duree' otherlv_21= ':' ( (lv_duration_22_0= RULE_DURATION ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_regular_24_0= 'REGULIERE;' ) ) ) ) ) )+ {...}?) ) ) otherlv_25= 'End.' ) )
            // InternalMyDsl.g:561:2: (otherlv_0= 'Ligne' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Avion' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Compagnie' otherlv_9= ':' ( (lv_company_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Depart' otherlv_13= ':' ( (otherlv_14= RULE_OACI ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Arrivee' otherlv_17= ':' ( (otherlv_18= RULE_OACI ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'Duree' otherlv_21= ':' ( (lv_duration_22_0= RULE_DURATION ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_regular_24_0= 'REGULIERE;' ) ) ) ) ) )+ {...}?) ) ) otherlv_25= 'End.' )
            {
            // InternalMyDsl.g:561:2: (otherlv_0= 'Ligne' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Avion' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Compagnie' otherlv_9= ':' ( (lv_company_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Depart' otherlv_13= ':' ( (otherlv_14= RULE_OACI ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Arrivee' otherlv_17= ':' ( (otherlv_18= RULE_OACI ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'Duree' otherlv_21= ':' ( (lv_duration_22_0= RULE_DURATION ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_regular_24_0= 'REGULIERE;' ) ) ) ) ) )+ {...}?) ) ) otherlv_25= 'End.' )
            // InternalMyDsl.g:562:3: otherlv_0= 'Ligne' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Avion' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Compagnie' otherlv_9= ':' ( (lv_company_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Depart' otherlv_13= ':' ( (otherlv_14= RULE_OACI ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Arrivee' otherlv_17= ':' ( (otherlv_18= RULE_OACI ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'Duree' otherlv_21= ':' ( (lv_duration_22_0= RULE_DURATION ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_regular_24_0= 'REGULIERE;' ) ) ) ) ) )+ {...}?) ) ) otherlv_25= 'End.'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getAirlineAccess().getLigneKeyword_0());
            		
            // InternalMyDsl.g:566:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyDsl.g:567:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyDsl.g:567:4: (lv_name_1_0= RULE_STRING )
            // InternalMyDsl.g:568:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAirlineAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAirlineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getAirlineAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:588:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Avion' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Compagnie' otherlv_9= ':' ( (lv_company_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Depart' otherlv_13= ':' ( (otherlv_14= RULE_OACI ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Arrivee' otherlv_17= ':' ( (otherlv_18= RULE_OACI ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'Duree' otherlv_21= ':' ( (lv_duration_22_0= RULE_DURATION ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_regular_24_0= 'REGULIERE;' ) ) ) ) ) )+ {...}?) ) )
            // InternalMyDsl.g:589:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Avion' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Compagnie' otherlv_9= ':' ( (lv_company_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Depart' otherlv_13= ':' ( (otherlv_14= RULE_OACI ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Arrivee' otherlv_17= ':' ( (otherlv_18= RULE_OACI ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'Duree' otherlv_21= ':' ( (lv_duration_22_0= RULE_DURATION ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_regular_24_0= 'REGULIERE;' ) ) ) ) ) )+ {...}?) )
            {
            // InternalMyDsl.g:589:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'Avion' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Compagnie' otherlv_9= ':' ( (lv_company_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Depart' otherlv_13= ':' ( (otherlv_14= RULE_OACI ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Arrivee' otherlv_17= ':' ( (otherlv_18= RULE_OACI ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'Duree' otherlv_21= ':' ( (lv_duration_22_0= RULE_DURATION ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_regular_24_0= 'REGULIERE;' ) ) ) ) ) )+ {...}?) )
            // InternalMyDsl.g:590:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'Avion' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Compagnie' otherlv_9= ':' ( (lv_company_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Depart' otherlv_13= ':' ( (otherlv_14= RULE_OACI ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Arrivee' otherlv_17= ':' ( (otherlv_18= RULE_OACI ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'Duree' otherlv_21= ':' ( (lv_duration_22_0= RULE_DURATION ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_regular_24_0= 'REGULIERE;' ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getAirlineAccess().getUnorderedGroup_3());
            				
            // InternalMyDsl.g:593:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'Avion' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Compagnie' otherlv_9= ':' ( (lv_company_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Depart' otherlv_13= ':' ( (otherlv_14= RULE_OACI ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Arrivee' otherlv_17= ':' ( (otherlv_18= RULE_OACI ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'Duree' otherlv_21= ':' ( (lv_duration_22_0= RULE_DURATION ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_regular_24_0= 'REGULIERE;' ) ) ) ) ) )+ {...}?)
            // InternalMyDsl.g:594:6: ( ({...}? => ( ({...}? => (otherlv_4= 'Avion' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Compagnie' otherlv_9= ':' ( (lv_company_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Depart' otherlv_13= ':' ( (otherlv_14= RULE_OACI ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Arrivee' otherlv_17= ':' ( (otherlv_18= RULE_OACI ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'Duree' otherlv_21= ':' ( (lv_duration_22_0= RULE_DURATION ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_regular_24_0= 'REGULIERE;' ) ) ) ) ) )+ {...}?
            {
            // InternalMyDsl.g:594:6: ( ({...}? => ( ({...}? => (otherlv_4= 'Avion' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'Compagnie' otherlv_9= ':' ( (lv_company_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'Depart' otherlv_13= ':' ( (otherlv_14= RULE_OACI ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'Arrivee' otherlv_17= ':' ( (otherlv_18= RULE_OACI ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'Duree' otherlv_21= ':' ( (lv_duration_22_0= RULE_DURATION ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_regular_24_0= 'REGULIERE;' ) ) ) ) ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=7;
                int LA6_0 = input.LA(1);

                if ( LA6_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getAirlineAccess().getUnorderedGroup_3(), 0) ) {
                    alt6=1;
                }
                else if ( LA6_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getAirlineAccess().getUnorderedGroup_3(), 1) ) {
                    alt6=2;
                }
                else if ( LA6_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getAirlineAccess().getUnorderedGroup_3(), 2) ) {
                    alt6=3;
                }
                else if ( LA6_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getAirlineAccess().getUnorderedGroup_3(), 3) ) {
                    alt6=4;
                }
                else if ( LA6_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getAirlineAccess().getUnorderedGroup_3(), 4) ) {
                    alt6=5;
                }
                else if ( LA6_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getAirlineAccess().getUnorderedGroup_3(), 5) ) {
                    alt6=6;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:595:4: ({...}? => ( ({...}? => (otherlv_4= 'Avion' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // InternalMyDsl.g:595:4: ({...}? => ( ({...}? => (otherlv_4= 'Avion' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) )
            	    // InternalMyDsl.g:596:5: {...}? => ( ({...}? => (otherlv_4= 'Avion' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAirlineAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAirline", "getUnorderedGroupHelper().canSelect(grammarAccess.getAirlineAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalMyDsl.g:596:104: ( ({...}? => (otherlv_4= 'Avion' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) )
            	    // InternalMyDsl.g:597:6: ({...}? => (otherlv_4= 'Avion' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAirlineAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalMyDsl.g:600:9: ({...}? => (otherlv_4= 'Avion' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) )
            	    // InternalMyDsl.g:600:10: {...}? => (otherlv_4= 'Avion' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAirline", "true");
            	    }
            	    // InternalMyDsl.g:600:19: (otherlv_4= 'Avion' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' )
            	    // InternalMyDsl.g:600:20: otherlv_4= 'Avion' otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_10); 

            	    									newLeafNode(otherlv_4, grammarAccess.getAirlineAccess().getAvionKeyword_3_0_0());
            	    								
            	    otherlv_5=(Token)match(input,18,FOLLOW_9); 

            	    									newLeafNode(otherlv_5, grammarAccess.getAirlineAccess().getColonKeyword_3_0_1());
            	    								
            	    // InternalMyDsl.g:608:9: ( (otherlv_6= RULE_ID ) )
            	    // InternalMyDsl.g:609:10: (otherlv_6= RULE_ID )
            	    {
            	    // InternalMyDsl.g:609:10: (otherlv_6= RULE_ID )
            	    // InternalMyDsl.g:610:11: otherlv_6= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAirlineRule());
            	    											}
            	    										
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_13); 

            	    											newLeafNode(otherlv_6, grammarAccess.getAirlineAccess().getPlanePlaneCrossReference_3_0_2_0());
            	    										

            	    }


            	    }

            	    otherlv_7=(Token)match(input,20,FOLLOW_21); 

            	    									newLeafNode(otherlv_7, grammarAccess.getAirlineAccess().getSemicolonKeyword_3_0_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAirlineAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:631:4: ({...}? => ( ({...}? => (otherlv_8= 'Compagnie' otherlv_9= ':' ( (lv_company_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // InternalMyDsl.g:631:4: ({...}? => ( ({...}? => (otherlv_8= 'Compagnie' otherlv_9= ':' ( (lv_company_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // InternalMyDsl.g:632:5: {...}? => ( ({...}? => (otherlv_8= 'Compagnie' otherlv_9= ':' ( (lv_company_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAirlineAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAirline", "getUnorderedGroupHelper().canSelect(grammarAccess.getAirlineAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalMyDsl.g:632:104: ( ({...}? => (otherlv_8= 'Compagnie' otherlv_9= ':' ( (lv_company_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // InternalMyDsl.g:633:6: ({...}? => (otherlv_8= 'Compagnie' otherlv_9= ':' ( (lv_company_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAirlineAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalMyDsl.g:636:9: ({...}? => (otherlv_8= 'Compagnie' otherlv_9= ':' ( (lv_company_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // InternalMyDsl.g:636:10: {...}? => (otherlv_8= 'Compagnie' otherlv_9= ':' ( (lv_company_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAirline", "true");
            	    }
            	    // InternalMyDsl.g:636:19: (otherlv_8= 'Compagnie' otherlv_9= ':' ( (lv_company_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // InternalMyDsl.g:636:20: otherlv_8= 'Compagnie' otherlv_9= ':' ( (lv_company_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,28,FOLLOW_10); 

            	    									newLeafNode(otherlv_8, grammarAccess.getAirlineAccess().getCompagnieKeyword_3_1_0());
            	    								
            	    otherlv_9=(Token)match(input,18,FOLLOW_16); 

            	    									newLeafNode(otherlv_9, grammarAccess.getAirlineAccess().getColonKeyword_3_1_1());
            	    								
            	    // InternalMyDsl.g:644:9: ( (lv_company_10_0= RULE_STRING ) )
            	    // InternalMyDsl.g:645:10: (lv_company_10_0= RULE_STRING )
            	    {
            	    // InternalMyDsl.g:645:10: (lv_company_10_0= RULE_STRING )
            	    // InternalMyDsl.g:646:11: lv_company_10_0= RULE_STRING
            	    {
            	    lv_company_10_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            	    											newLeafNode(lv_company_10_0, grammarAccess.getAirlineAccess().getCompanySTRINGTerminalRuleCall_3_1_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAirlineRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"company",
            	    												lv_company_10_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    otherlv_11=(Token)match(input,20,FOLLOW_21); 

            	    									newLeafNode(otherlv_11, grammarAccess.getAirlineAccess().getSemicolonKeyword_3_1_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAirlineAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:672:4: ({...}? => ( ({...}? => (otherlv_12= 'Depart' otherlv_13= ':' ( (otherlv_14= RULE_OACI ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // InternalMyDsl.g:672:4: ({...}? => ( ({...}? => (otherlv_12= 'Depart' otherlv_13= ':' ( (otherlv_14= RULE_OACI ) ) otherlv_15= ';' ) ) ) )
            	    // InternalMyDsl.g:673:5: {...}? => ( ({...}? => (otherlv_12= 'Depart' otherlv_13= ':' ( (otherlv_14= RULE_OACI ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAirlineAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleAirline", "getUnorderedGroupHelper().canSelect(grammarAccess.getAirlineAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalMyDsl.g:673:104: ( ({...}? => (otherlv_12= 'Depart' otherlv_13= ':' ( (otherlv_14= RULE_OACI ) ) otherlv_15= ';' ) ) )
            	    // InternalMyDsl.g:674:6: ({...}? => (otherlv_12= 'Depart' otherlv_13= ':' ( (otherlv_14= RULE_OACI ) ) otherlv_15= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAirlineAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalMyDsl.g:677:9: ({...}? => (otherlv_12= 'Depart' otherlv_13= ':' ( (otherlv_14= RULE_OACI ) ) otherlv_15= ';' ) )
            	    // InternalMyDsl.g:677:10: {...}? => (otherlv_12= 'Depart' otherlv_13= ':' ( (otherlv_14= RULE_OACI ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAirline", "true");
            	    }
            	    // InternalMyDsl.g:677:19: (otherlv_12= 'Depart' otherlv_13= ':' ( (otherlv_14= RULE_OACI ) ) otherlv_15= ';' )
            	    // InternalMyDsl.g:677:20: otherlv_12= 'Depart' otherlv_13= ':' ( (otherlv_14= RULE_OACI ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,29,FOLLOW_10); 

            	    									newLeafNode(otherlv_12, grammarAccess.getAirlineAccess().getDepartKeyword_3_2_0());
            	    								
            	    otherlv_13=(Token)match(input,18,FOLLOW_18); 

            	    									newLeafNode(otherlv_13, grammarAccess.getAirlineAccess().getColonKeyword_3_2_1());
            	    								
            	    // InternalMyDsl.g:685:9: ( (otherlv_14= RULE_OACI ) )
            	    // InternalMyDsl.g:686:10: (otherlv_14= RULE_OACI )
            	    {
            	    // InternalMyDsl.g:686:10: (otherlv_14= RULE_OACI )
            	    // InternalMyDsl.g:687:11: otherlv_14= RULE_OACI
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAirlineRule());
            	    											}
            	    										
            	    otherlv_14=(Token)match(input,RULE_OACI,FOLLOW_13); 

            	    											newLeafNode(otherlv_14, grammarAccess.getAirlineAccess().getDepartureCodeOACICrossReference_3_2_2_0());
            	    										

            	    }


            	    }

            	    otherlv_15=(Token)match(input,20,FOLLOW_21); 

            	    									newLeafNode(otherlv_15, grammarAccess.getAirlineAccess().getSemicolonKeyword_3_2_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAirlineAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMyDsl.g:708:4: ({...}? => ( ({...}? => (otherlv_16= 'Arrivee' otherlv_17= ':' ( (otherlv_18= RULE_OACI ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // InternalMyDsl.g:708:4: ({...}? => ( ({...}? => (otherlv_16= 'Arrivee' otherlv_17= ':' ( (otherlv_18= RULE_OACI ) ) otherlv_19= ';' ) ) ) )
            	    // InternalMyDsl.g:709:5: {...}? => ( ({...}? => (otherlv_16= 'Arrivee' otherlv_17= ':' ( (otherlv_18= RULE_OACI ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAirlineAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleAirline", "getUnorderedGroupHelper().canSelect(grammarAccess.getAirlineAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalMyDsl.g:709:104: ( ({...}? => (otherlv_16= 'Arrivee' otherlv_17= ':' ( (otherlv_18= RULE_OACI ) ) otherlv_19= ';' ) ) )
            	    // InternalMyDsl.g:710:6: ({...}? => (otherlv_16= 'Arrivee' otherlv_17= ':' ( (otherlv_18= RULE_OACI ) ) otherlv_19= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAirlineAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalMyDsl.g:713:9: ({...}? => (otherlv_16= 'Arrivee' otherlv_17= ':' ( (otherlv_18= RULE_OACI ) ) otherlv_19= ';' ) )
            	    // InternalMyDsl.g:713:10: {...}? => (otherlv_16= 'Arrivee' otherlv_17= ':' ( (otherlv_18= RULE_OACI ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAirline", "true");
            	    }
            	    // InternalMyDsl.g:713:19: (otherlv_16= 'Arrivee' otherlv_17= ':' ( (otherlv_18= RULE_OACI ) ) otherlv_19= ';' )
            	    // InternalMyDsl.g:713:20: otherlv_16= 'Arrivee' otherlv_17= ':' ( (otherlv_18= RULE_OACI ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,30,FOLLOW_10); 

            	    									newLeafNode(otherlv_16, grammarAccess.getAirlineAccess().getArriveeKeyword_3_3_0());
            	    								
            	    otherlv_17=(Token)match(input,18,FOLLOW_18); 

            	    									newLeafNode(otherlv_17, grammarAccess.getAirlineAccess().getColonKeyword_3_3_1());
            	    								
            	    // InternalMyDsl.g:721:9: ( (otherlv_18= RULE_OACI ) )
            	    // InternalMyDsl.g:722:10: (otherlv_18= RULE_OACI )
            	    {
            	    // InternalMyDsl.g:722:10: (otherlv_18= RULE_OACI )
            	    // InternalMyDsl.g:723:11: otherlv_18= RULE_OACI
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAirlineRule());
            	    											}
            	    										
            	    otherlv_18=(Token)match(input,RULE_OACI,FOLLOW_13); 

            	    											newLeafNode(otherlv_18, grammarAccess.getAirlineAccess().getArrivalCodeOACICrossReference_3_3_2_0());
            	    										

            	    }


            	    }

            	    otherlv_19=(Token)match(input,20,FOLLOW_21); 

            	    									newLeafNode(otherlv_19, grammarAccess.getAirlineAccess().getSemicolonKeyword_3_3_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAirlineAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMyDsl.g:744:4: ({...}? => ( ({...}? => (otherlv_20= 'Duree' otherlv_21= ':' ( (lv_duration_22_0= RULE_DURATION ) ) otherlv_23= ';' ) ) ) )
            	    {
            	    // InternalMyDsl.g:744:4: ({...}? => ( ({...}? => (otherlv_20= 'Duree' otherlv_21= ':' ( (lv_duration_22_0= RULE_DURATION ) ) otherlv_23= ';' ) ) ) )
            	    // InternalMyDsl.g:745:5: {...}? => ( ({...}? => (otherlv_20= 'Duree' otherlv_21= ':' ( (lv_duration_22_0= RULE_DURATION ) ) otherlv_23= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAirlineAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleAirline", "getUnorderedGroupHelper().canSelect(grammarAccess.getAirlineAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalMyDsl.g:745:104: ( ({...}? => (otherlv_20= 'Duree' otherlv_21= ':' ( (lv_duration_22_0= RULE_DURATION ) ) otherlv_23= ';' ) ) )
            	    // InternalMyDsl.g:746:6: ({...}? => (otherlv_20= 'Duree' otherlv_21= ':' ( (lv_duration_22_0= RULE_DURATION ) ) otherlv_23= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAirlineAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalMyDsl.g:749:9: ({...}? => (otherlv_20= 'Duree' otherlv_21= ':' ( (lv_duration_22_0= RULE_DURATION ) ) otherlv_23= ';' ) )
            	    // InternalMyDsl.g:749:10: {...}? => (otherlv_20= 'Duree' otherlv_21= ':' ( (lv_duration_22_0= RULE_DURATION ) ) otherlv_23= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAirline", "true");
            	    }
            	    // InternalMyDsl.g:749:19: (otherlv_20= 'Duree' otherlv_21= ':' ( (lv_duration_22_0= RULE_DURATION ) ) otherlv_23= ';' )
            	    // InternalMyDsl.g:749:20: otherlv_20= 'Duree' otherlv_21= ':' ( (lv_duration_22_0= RULE_DURATION ) ) otherlv_23= ';'
            	    {
            	    otherlv_20=(Token)match(input,31,FOLLOW_10); 

            	    									newLeafNode(otherlv_20, grammarAccess.getAirlineAccess().getDureeKeyword_3_4_0());
            	    								
            	    otherlv_21=(Token)match(input,18,FOLLOW_22); 

            	    									newLeafNode(otherlv_21, grammarAccess.getAirlineAccess().getColonKeyword_3_4_1());
            	    								
            	    // InternalMyDsl.g:757:9: ( (lv_duration_22_0= RULE_DURATION ) )
            	    // InternalMyDsl.g:758:10: (lv_duration_22_0= RULE_DURATION )
            	    {
            	    // InternalMyDsl.g:758:10: (lv_duration_22_0= RULE_DURATION )
            	    // InternalMyDsl.g:759:11: lv_duration_22_0= RULE_DURATION
            	    {
            	    lv_duration_22_0=(Token)match(input,RULE_DURATION,FOLLOW_13); 

            	    											newLeafNode(lv_duration_22_0, grammarAccess.getAirlineAccess().getDurationDURATIONTerminalRuleCall_3_4_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAirlineRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"duration",
            	    												lv_duration_22_0,
            	    												"org.xtext.example.mydsl.MyDsl.DURATION");
            	    										

            	    }


            	    }

            	    otherlv_23=(Token)match(input,20,FOLLOW_21); 

            	    									newLeafNode(otherlv_23, grammarAccess.getAirlineAccess().getSemicolonKeyword_3_4_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAirlineAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalMyDsl.g:785:4: ({...}? => ( ({...}? => ( (lv_regular_24_0= 'REGULIERE;' ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:785:4: ({...}? => ( ({...}? => ( (lv_regular_24_0= 'REGULIERE;' ) ) ) ) )
            	    // InternalMyDsl.g:786:5: {...}? => ( ({...}? => ( (lv_regular_24_0= 'REGULIERE;' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAirlineAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleAirline", "getUnorderedGroupHelper().canSelect(grammarAccess.getAirlineAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // InternalMyDsl.g:786:104: ( ({...}? => ( (lv_regular_24_0= 'REGULIERE;' ) ) ) )
            	    // InternalMyDsl.g:787:6: ({...}? => ( (lv_regular_24_0= 'REGULIERE;' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAirlineAccess().getUnorderedGroup_3(), 5);
            	    					
            	    // InternalMyDsl.g:790:9: ({...}? => ( (lv_regular_24_0= 'REGULIERE;' ) ) )
            	    // InternalMyDsl.g:790:10: {...}? => ( (lv_regular_24_0= 'REGULIERE;' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAirline", "true");
            	    }
            	    // InternalMyDsl.g:790:19: ( (lv_regular_24_0= 'REGULIERE;' ) )
            	    // InternalMyDsl.g:790:20: (lv_regular_24_0= 'REGULIERE;' )
            	    {
            	    // InternalMyDsl.g:790:20: (lv_regular_24_0= 'REGULIERE;' )
            	    // InternalMyDsl.g:791:10: lv_regular_24_0= 'REGULIERE;'
            	    {
            	    lv_regular_24_0=(Token)match(input,32,FOLLOW_21); 

            	    										newLeafNode(lv_regular_24_0, grammarAccess.getAirlineAccess().getRegularREGULIEREKeyword_3_5_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getAirlineRule());
            	    										}
            	    										setWithLastConsumed(current, "regular", true, "REGULIERE;");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAirlineAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getAirlineAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleAirline", "getUnorderedGroupHelper().canLeave(grammarAccess.getAirlineAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getAirlineAccess().getUnorderedGroup_3());
            				

            }

            otherlv_25=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getAirlineAccess().getEndKeyword_4());
            		

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
    // $ANTLR end "ruleAirline"


    // $ANTLR start "entryRuleCodeOACI"
    // InternalMyDsl.g:824:1: entryRuleCodeOACI returns [EObject current=null] : iv_ruleCodeOACI= ruleCodeOACI EOF ;
    public final EObject entryRuleCodeOACI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeOACI = null;


        try {
            // InternalMyDsl.g:824:49: (iv_ruleCodeOACI= ruleCodeOACI EOF )
            // InternalMyDsl.g:825:2: iv_ruleCodeOACI= ruleCodeOACI EOF
            {
             newCompositeNode(grammarAccess.getCodeOACIRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCodeOACI=ruleCodeOACI();

            state._fsp--;

             current =iv_ruleCodeOACI; 
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
    // $ANTLR end "entryRuleCodeOACI"


    // $ANTLR start "ruleCodeOACI"
    // InternalMyDsl.g:831:1: ruleCodeOACI returns [EObject current=null] : ( (lv_name_0_0= RULE_OACI ) ) ;
    public final EObject ruleCodeOACI() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:837:2: ( ( (lv_name_0_0= RULE_OACI ) ) )
            // InternalMyDsl.g:838:2: ( (lv_name_0_0= RULE_OACI ) )
            {
            // InternalMyDsl.g:838:2: ( (lv_name_0_0= RULE_OACI ) )
            // InternalMyDsl.g:839:3: (lv_name_0_0= RULE_OACI )
            {
            // InternalMyDsl.g:839:3: (lv_name_0_0= RULE_OACI )
            // InternalMyDsl.g:840:4: lv_name_0_0= RULE_OACI
            {
            lv_name_0_0=(Token)match(input,RULE_OACI,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getCodeOACIAccess().getNameOACITerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCodeOACIRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.xtext.example.mydsl.MyDsl.OACI");
            			

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
    // $ANTLR end "ruleCodeOACI"


    // $ANTLR start "ruleEngines"
    // InternalMyDsl.g:859:1: ruleEngines returns [Enumerator current=null] : ( (enumLiteral_0= 'HELICES' ) | (enumLiteral_1= 'PROPULSEURS' ) ) ;
    public final Enumerator ruleEngines() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:865:2: ( ( (enumLiteral_0= 'HELICES' ) | (enumLiteral_1= 'PROPULSEURS' ) ) )
            // InternalMyDsl.g:866:2: ( (enumLiteral_0= 'HELICES' ) | (enumLiteral_1= 'PROPULSEURS' ) )
            {
            // InternalMyDsl.g:866:2: ( (enumLiteral_0= 'HELICES' ) | (enumLiteral_1= 'PROPULSEURS' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==33) ) {
                alt7=1;
            }
            else if ( (LA7_0==34) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:867:3: (enumLiteral_0= 'HELICES' )
                    {
                    // InternalMyDsl.g:867:3: (enumLiteral_0= 'HELICES' )
                    // InternalMyDsl.g:868:4: enumLiteral_0= 'HELICES'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getEnginesAccess().getPROPELLEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEnginesAccess().getPROPELLEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:875:3: (enumLiteral_1= 'PROPULSEURS' )
                    {
                    // InternalMyDsl.g:875:3: (enumLiteral_1= 'PROPULSEURS' )
                    // InternalMyDsl.g:876:4: enumLiteral_1= 'PROPULSEURS'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getEnginesAccess().getENGINEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEnginesAccess().getENGINEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleEngines"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008824002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000008820002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000680000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000007400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000001F0020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000001F0420000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000200L});

}
