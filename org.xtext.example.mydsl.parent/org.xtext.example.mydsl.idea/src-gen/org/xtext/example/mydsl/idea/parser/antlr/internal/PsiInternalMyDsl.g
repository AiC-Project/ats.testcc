/*
 * generated by Xtext 2.9.0
 */
grammar PsiInternalMyDsl;

options {
	superClass=AbstractPsiAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.idea.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.xtext.example.mydsl.idea.lang.MyDslElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

import com.intellij.lang.PsiBuilder;
}

@parser::members {

	protected MyDslGrammarAccess grammarAccess;

	protected MyDslElementTypeProvider elementTypeProvider;

	public PsiInternalMyDslParser(PsiBuilder builder, TokenStream input, MyDslElementTypeProvider elementTypeProvider, MyDslGrammarAccess grammarAccess) {
		this(input);
		setPsiBuilder(builder);
    	this.grammarAccess = grammarAccess;
		this.elementTypeProvider = elementTypeProvider;
	}

	@Override
	protected String getFirstRuleName() {
		return "Model";
	}

}

//Entry rule entryRuleModel
entryRuleModel returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getModelElementType()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [Boolean current=false]
:
	(
		(
			(
				{
					markComposite(elementTypeProvider.getModel_IncludesIncludesParserRuleCall_0_0ElementType());
				}
				lv_includes_0_0=ruleIncludes
				{
					doneComposite();
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
			)
		)*
		(
			(
				(
					{
						markComposite(elementTypeProvider.getModel_PlanesPlaneParserRuleCall_1_0_0ElementType());
					}
					lv_planes_1_0=rulePlane
					{
						doneComposite();
						if(!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
				)
			)
			    |
			(
				(
					{
						markComposite(elementTypeProvider.getModel_AirportsAirportParserRuleCall_1_1_0ElementType());
					}
					lv_airports_2_0=ruleAirport
					{
						doneComposite();
						if(!$current) {
							associateWithSemanticElement();
							$current = true;
						}
					}
				)
			)
		)*
		(
			(
				{
					markComposite(elementTypeProvider.getModel_AirlinesAirlineParserRuleCall_2_0ElementType());
				}
				lv_airlines_3_0=ruleAirline
				{
					doneComposite();
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
			)
		)*
	)
;

//Entry rule entryRuleIncludes
entryRuleIncludes returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getIncludesElementType()); }
	iv_ruleIncludes=ruleIncludes
	{ $current=$iv_ruleIncludes.current; }
	EOF;

// Rule Includes
ruleIncludes returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getIncludes_IncludeKeyword_0ElementType());
		}
		otherlv_0='%include'
		{
			doneLeaf(otherlv_0);
		}
		{
			markLeaf(elementTypeProvider.getIncludes_LessThanSignKeyword_1ElementType());
		}
		otherlv_1='<'
		{
			doneLeaf(otherlv_1);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getIncludes_ImportURIINCLUDETerminalRuleCall_2_0ElementType());
				}
				lv_importURI_2_0=RULE_INCLUDE
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_importURI_2_0);
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getIncludes_GreaterThanSignSemicolonKeyword_3ElementType());
		}
		otherlv_3='>;'
		{
			doneLeaf(otherlv_3);
		}
	)
;

//Entry rule entryRulePlane
entryRulePlane returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getPlaneElementType()); }
	iv_rulePlane=rulePlane
	{ $current=$iv_rulePlane.current; }
	EOF;

// Rule Plane
rulePlane returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getPlane_AvionKeyword_0ElementType());
		}
		otherlv_0='Avion'
		{
			doneLeaf(otherlv_0);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getPlane_NameIDTerminalRuleCall_1_0ElementType());
				}
				lv_name_1_0=RULE_ID
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_name_1_0);
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getPlane_ColonKeyword_2ElementType());
		}
		otherlv_2=':'
		{
			doneLeaf(otherlv_2);
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getPlaneAccess().getUnorderedGroup_3());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getPlaneAccess().getUnorderedGroup_3(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getPlaneAccess().getUnorderedGroup_3(), 0);
					}
								({true}?=>({
									markLeaf(elementTypeProvider.getPlane_PassagersKeyword_3_0_0ElementType());
								}
								otherlv_4='Passagers'
								{
									doneLeaf(otherlv_4);
								}
								{
									markLeaf(elementTypeProvider.getPlane_ColonKeyword_3_0_1ElementType());
								}
								otherlv_5=':'
								{
									doneLeaf(otherlv_5);
								}
								(
									(
										{
											markLeaf(elementTypeProvider.getPlane_PassengersINTTerminalRuleCall_3_0_2_0ElementType());
										}
										lv_passengers_6_0=RULE_INT
										{
											if(!$current) {
												associateWithSemanticElement();
												$current = true;
											}
										}
										{
											doneLeaf(lv_passengers_6_0);
										}
									)
								)
								{
									markLeaf(elementTypeProvider.getPlane_SemicolonKeyword_3_0_3ElementType());
								}
								otherlv_7=';'
								{
									doneLeaf(otherlv_7);
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPlaneAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getPlaneAccess().getUnorderedGroup_3(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getPlaneAccess().getUnorderedGroup_3(), 1);
					}
								({true}?=>({
									markLeaf(elementTypeProvider.getPlane_MotorisationKeyword_3_1_0ElementType());
								}
								otherlv_8='Motorisation'
								{
									doneLeaf(otherlv_8);
								}
								{
									markLeaf(elementTypeProvider.getPlane_ColonKeyword_3_1_1ElementType());
								}
								otherlv_9=':'
								{
									doneLeaf(otherlv_9);
								}
								(
									(
										{
											markComposite(elementTypeProvider.getPlane_MotorisationEnginesEnumRuleCall_3_1_2_0ElementType());
										}
										lv_motorisation_10_0=ruleEngines
										{
											doneComposite();
											if(!$current) {
												associateWithSemanticElement();
												$current = true;
											}
										}
									)
								)
								{
									markLeaf(elementTypeProvider.getPlane_SemicolonKeyword_3_1_3ElementType());
								}
								otherlv_11=';'
								{
									doneLeaf(otherlv_11);
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPlaneAccess().getUnorderedGroup_3());
					}
				)
			)
					)+
					{getUnorderedGroupHelper().canLeave(grammarAccess.getPlaneAccess().getUnorderedGroup_3())}?
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getPlaneAccess().getUnorderedGroup_3());
				}
		)
		{
			markLeaf(elementTypeProvider.getPlane_EndKeyword_4ElementType());
		}
		otherlv_12='End.'
		{
			doneLeaf(otherlv_12);
		}
	)
;

//Entry rule entryRuleAirport
entryRuleAirport returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getAirportElementType()); }
	iv_ruleAirport=ruleAirport
	{ $current=$iv_ruleAirport.current; }
	EOF;

// Rule Airport
ruleAirport returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getAirport_AeroportKeyword_0ElementType());
		}
		otherlv_0='Aeroport'
		{
			doneLeaf(otherlv_0);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getAirport_TitleSTRINGTerminalRuleCall_1_0ElementType());
				}
				lv_title_1_0=RULE_STRING
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_title_1_0);
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getAirport_ColonKeyword_2ElementType());
		}
		otherlv_2=':'
		{
			doneLeaf(otherlv_2);
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getAirportAccess().getUnorderedGroup_3());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getAirportAccess().getUnorderedGroup_3(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getAirportAccess().getUnorderedGroup_3(), 0);
					}
								({true}?=>({
									markLeaf(elementTypeProvider.getAirport_OACIKeyword_3_0_0ElementType());
								}
								otherlv_4='OACI'
								{
									doneLeaf(otherlv_4);
								}
								{
									markLeaf(elementTypeProvider.getAirport_ColonKeyword_3_0_1ElementType());
								}
								otherlv_5=':'
								{
									doneLeaf(otherlv_5);
								}
								(
									(
										{
											markComposite(elementTypeProvider.getAirport_NameCodeOACIParserRuleCall_3_0_2_0ElementType());
										}
										lv_name_6_0=ruleCodeOACI
										{
											doneComposite();
											if(!$current) {
												associateWithSemanticElement();
												$current = true;
											}
										}
									)
								)
								{
									markLeaf(elementTypeProvider.getAirport_SemicolonKeyword_3_0_3ElementType());
								}
								otherlv_7=';'
								{
									doneLeaf(otherlv_7);
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAirportAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getAirportAccess().getUnorderedGroup_3(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getAirportAccess().getUnorderedGroup_3(), 1);
					}
								({true}?=>({
									markLeaf(elementTypeProvider.getAirport_PaysKeyword_3_1_0ElementType());
								}
								otherlv_8='Pays'
								{
									doneLeaf(otherlv_8);
								}
								{
									markLeaf(elementTypeProvider.getAirport_ColonKeyword_3_1_1ElementType());
								}
								otherlv_9=':'
								{
									doneLeaf(otherlv_9);
								}
								(
									(
										{
											markLeaf(elementTypeProvider.getAirport_CountrySTRINGTerminalRuleCall_3_1_2_0ElementType());
										}
										lv_country_10_0=RULE_STRING
										{
											if(!$current) {
												associateWithSemanticElement();
												$current = true;
											}
										}
										{
											doneLeaf(lv_country_10_0);
										}
									)
								)
								{
									markLeaf(elementTypeProvider.getAirport_SemicolonKeyword_3_1_3ElementType());
								}
								otherlv_11=';'
								{
									doneLeaf(otherlv_11);
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAirportAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getAirportAccess().getUnorderedGroup_3(), 2)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getAirportAccess().getUnorderedGroup_3(), 2);
					}
								({true}?=>({
									markLeaf(elementTypeProvider.getAirport_PistesKeyword_3_2_0ElementType());
								}
								otherlv_12='Pistes'
								{
									doneLeaf(otherlv_12);
								}
								{
									markLeaf(elementTypeProvider.getAirport_ColonKeyword_3_2_1ElementType());
								}
								otherlv_13=':'
								{
									doneLeaf(otherlv_13);
								}
								(
									(
										{
											markLeaf(elementTypeProvider.getAirport_RunwaysINTTerminalRuleCall_3_2_2_0ElementType());
										}
										lv_runways_14_0=RULE_INT
										{
											if(!$current) {
												associateWithSemanticElement();
												$current = true;
											}
										}
										{
											doneLeaf(lv_runways_14_0);
										}
									)
								)
								{
									markLeaf(elementTypeProvider.getAirport_SemicolonKeyword_3_2_3ElementType());
								}
								otherlv_15=';'
								{
									doneLeaf(otherlv_15);
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAirportAccess().getUnorderedGroup_3());
					}
				)
			)
					)+
					{getUnorderedGroupHelper().canLeave(grammarAccess.getAirportAccess().getUnorderedGroup_3())}?
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getAirportAccess().getUnorderedGroup_3());
				}
		)
		{
			markLeaf(elementTypeProvider.getAirport_EndKeyword_4ElementType());
		}
		otherlv_16='End.'
		{
			doneLeaf(otherlv_16);
		}
	)
;

//Entry rule entryRuleAirline
entryRuleAirline returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getAirlineElementType()); }
	iv_ruleAirline=ruleAirline
	{ $current=$iv_ruleAirline.current; }
	EOF;

// Rule Airline
ruleAirline returns [Boolean current=false]
:
	(
		{
			markLeaf(elementTypeProvider.getAirline_LigneKeyword_0ElementType());
		}
		otherlv_0='Ligne'
		{
			doneLeaf(otherlv_0);
		}
		(
			(
				{
					markLeaf(elementTypeProvider.getAirline_NameSTRINGTerminalRuleCall_1_0ElementType());
				}
				lv_name_1_0=RULE_STRING
				{
					if(!$current) {
						associateWithSemanticElement();
						$current = true;
					}
				}
				{
					doneLeaf(lv_name_1_0);
				}
			)
		)
		{
			markLeaf(elementTypeProvider.getAirline_ColonKeyword_2ElementType());
		}
		otherlv_2=':'
		{
			doneLeaf(otherlv_2);
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getAirlineAccess().getUnorderedGroup_3());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getAirlineAccess().getUnorderedGroup_3(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getAirlineAccess().getUnorderedGroup_3(), 0);
					}
								({true}?=>({
									markLeaf(elementTypeProvider.getAirline_AvionKeyword_3_0_0ElementType());
								}
								otherlv_4='Avion'
								{
									doneLeaf(otherlv_4);
								}
								{
									markLeaf(elementTypeProvider.getAirline_ColonKeyword_3_0_1ElementType());
								}
								otherlv_5=':'
								{
									doneLeaf(otherlv_5);
								}
								(
									(
										{
											if (!$current) {
												associateWithSemanticElement();
												$current = true;
											}
										}
										{
											markLeaf(elementTypeProvider.getAirline_PlanePlaneCrossReference_3_0_2_0ElementType());
										}
										otherlv_6=RULE_ID
										{
											doneLeaf(otherlv_6);
										}
									)
								)
								{
									markLeaf(elementTypeProvider.getAirline_SemicolonKeyword_3_0_3ElementType());
								}
								otherlv_7=';'
								{
									doneLeaf(otherlv_7);
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAirlineAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getAirlineAccess().getUnorderedGroup_3(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getAirlineAccess().getUnorderedGroup_3(), 1);
					}
								({true}?=>({
									markLeaf(elementTypeProvider.getAirline_CompagnieKeyword_3_1_0ElementType());
								}
								otherlv_8='Compagnie'
								{
									doneLeaf(otherlv_8);
								}
								{
									markLeaf(elementTypeProvider.getAirline_ColonKeyword_3_1_1ElementType());
								}
								otherlv_9=':'
								{
									doneLeaf(otherlv_9);
								}
								(
									(
										{
											markLeaf(elementTypeProvider.getAirline_CompanySTRINGTerminalRuleCall_3_1_2_0ElementType());
										}
										lv_company_10_0=RULE_STRING
										{
											if(!$current) {
												associateWithSemanticElement();
												$current = true;
											}
										}
										{
											doneLeaf(lv_company_10_0);
										}
									)
								)
								{
									markLeaf(elementTypeProvider.getAirline_SemicolonKeyword_3_1_3ElementType());
								}
								otherlv_11=';'
								{
									doneLeaf(otherlv_11);
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAirlineAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getAirlineAccess().getUnorderedGroup_3(), 2)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getAirlineAccess().getUnorderedGroup_3(), 2);
					}
								({true}?=>({
									markLeaf(elementTypeProvider.getAirline_DepartKeyword_3_2_0ElementType());
								}
								otherlv_12='Depart'
								{
									doneLeaf(otherlv_12);
								}
								{
									markLeaf(elementTypeProvider.getAirline_ColonKeyword_3_2_1ElementType());
								}
								otherlv_13=':'
								{
									doneLeaf(otherlv_13);
								}
								(
									(
										{
											if (!$current) {
												associateWithSemanticElement();
												$current = true;
											}
										}
										{
											markLeaf(elementTypeProvider.getAirline_DepartureCodeOACICrossReference_3_2_2_0ElementType());
										}
										otherlv_14=RULE_OACI
										{
											doneLeaf(otherlv_14);
										}
									)
								)
								{
									markLeaf(elementTypeProvider.getAirline_SemicolonKeyword_3_2_3ElementType());
								}
								otherlv_15=';'
								{
									doneLeaf(otherlv_15);
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAirlineAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getAirlineAccess().getUnorderedGroup_3(), 3)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getAirlineAccess().getUnorderedGroup_3(), 3);
					}
								({true}?=>({
									markLeaf(elementTypeProvider.getAirline_ArriveeKeyword_3_3_0ElementType());
								}
								otherlv_16='Arrivee'
								{
									doneLeaf(otherlv_16);
								}
								{
									markLeaf(elementTypeProvider.getAirline_ColonKeyword_3_3_1ElementType());
								}
								otherlv_17=':'
								{
									doneLeaf(otherlv_17);
								}
								(
									(
										{
											if (!$current) {
												associateWithSemanticElement();
												$current = true;
											}
										}
										{
											markLeaf(elementTypeProvider.getAirline_ArrivalCodeOACICrossReference_3_3_2_0ElementType());
										}
										otherlv_18=RULE_OACI
										{
											doneLeaf(otherlv_18);
										}
									)
								)
								{
									markLeaf(elementTypeProvider.getAirline_SemicolonKeyword_3_3_3ElementType());
								}
								otherlv_19=';'
								{
									doneLeaf(otherlv_19);
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAirlineAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getAirlineAccess().getUnorderedGroup_3(), 4)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getAirlineAccess().getUnorderedGroup_3(), 4);
					}
								({true}?=>({
									markLeaf(elementTypeProvider.getAirline_DureeKeyword_3_4_0ElementType());
								}
								otherlv_20='Duree'
								{
									doneLeaf(otherlv_20);
								}
								{
									markLeaf(elementTypeProvider.getAirline_ColonKeyword_3_4_1ElementType());
								}
								otherlv_21=':'
								{
									doneLeaf(otherlv_21);
								}
								(
									(
										{
											markLeaf(elementTypeProvider.getAirline_DurationDURATIONTerminalRuleCall_3_4_2_0ElementType());
										}
										lv_duration_22_0=RULE_DURATION
										{
											if(!$current) {
												associateWithSemanticElement();
												$current = true;
											}
										}
										{
											doneLeaf(lv_duration_22_0);
										}
									)
								)
								{
									markLeaf(elementTypeProvider.getAirline_SemicolonKeyword_3_4_3ElementType());
								}
								otherlv_23=';'
								{
									doneLeaf(otherlv_23);
								}
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAirlineAccess().getUnorderedGroup_3());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getAirlineAccess().getUnorderedGroup_3(), 5)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getAirlineAccess().getUnorderedGroup_3(), 5);
					}
								({true}?=>((
									{
										markLeaf(elementTypeProvider.getAirline_RegularREGULIEREKeyword_3_5_0ElementType());
									}
									lv_regular_24_0='REGULIERE;'
									{
										doneLeaf(lv_regular_24_0);
									}
									{
										if (!$current) {
											associateWithSemanticElement();
											$current = true;
										}
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAirlineAccess().getUnorderedGroup_3());
					}
				)
			)
					)+
					{getUnorderedGroupHelper().canLeave(grammarAccess.getAirlineAccess().getUnorderedGroup_3())}?
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getAirlineAccess().getUnorderedGroup_3());
				}
		)
		{
			markLeaf(elementTypeProvider.getAirline_EndKeyword_4ElementType());
		}
		otherlv_25='End.'
		{
			doneLeaf(otherlv_25);
		}
	)
;

//Entry rule entryRuleCodeOACI
entryRuleCodeOACI returns [Boolean current=false]:
	{ markComposite(elementTypeProvider.getCodeOACIElementType()); }
	iv_ruleCodeOACI=ruleCodeOACI
	{ $current=$iv_ruleCodeOACI.current; }
	EOF;

// Rule CodeOACI
ruleCodeOACI returns [Boolean current=false]
:
	(
		(
			{
				markLeaf(elementTypeProvider.getCodeOACI_NameOACITerminalRuleCall_0ElementType());
			}
			lv_name_0_0=RULE_OACI
			{
				if(!$current) {
					associateWithSemanticElement();
					$current = true;
				}
			}
			{
				doneLeaf(lv_name_0_0);
			}
		)
	)
;

// Rule Engines
ruleEngines returns [Boolean current=false]
:
	(
		(
			{
				markLeaf(elementTypeProvider.getEngines_PROPELLEREnumLiteralDeclaration_0ElementType());
			}
			enumLiteral_0='HELICES'
			{
				doneLeaf(enumLiteral_0);
			}
		)
		    |
		(
			{
				markLeaf(elementTypeProvider.getEngines_ENGINEEnumLiteralDeclaration_1ElementType());
			}
			enumLiteral_1='PROPULSEURS'
			{
				doneLeaf(enumLiteral_1);
			}
		)
	)
;

RULE_DURATION : ('0'..'2' '0'..'9' 'h')? '0'..'5' '0'..'9' 'm';

RULE_OACI : 'A'..'Z' 'A'..'Z' 'A'..'Z' 'A'..'Z';

RULE_INCLUDE : RULE_ID '.air';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;