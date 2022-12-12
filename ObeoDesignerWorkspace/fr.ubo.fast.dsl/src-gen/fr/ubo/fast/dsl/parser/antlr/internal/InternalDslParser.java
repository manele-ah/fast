package fr.ubo.fast.dsl.parser.antlr.internal;

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
import fr.ubo.fast.dsl.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Tools'", "'{'", "';'", "'}'", "'Data'", "'Sensors'", "'TimeSeries'", "'HwArchitecture'", "'Computers'", "'Networks'", "'Tool'", "'('", "'on'", "','", "')'", "'userTime'", "'pingTime'", "'rawDataThreshold'", "'preComputedDataThreshold'", "'startTime'", "'endTime'", "'period'", "'database'", "'measures'", "'in'", "'metadata'", "'Computer'", "'-'", "'networkInterfaces'", "'Docker'", "'network'", "'interface'", "'scale'", "'['", "']'", "'.'", "'E'", "'e'", "'Celsius'", "'Meter'", "'MeterPerSecond'", "'Bar'", "'Liter'", "'Gram'", "'Radian'", "'None'", "'Millisecond'", "'Second'", "'Minute'", "'Hour'", "'Day'", "'Month'", "'Year'", "'Linux'", "'Windows'", "'MacOS'", "'TimeScaleDB'", "'InfluxDB'", "'NavigationDirections'", "'GeoServer'", "'Apache'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;

        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "TimeSeriesFramework";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTimeSeriesFramework"
    // InternalDsl.g:65:1: entryRuleTimeSeriesFramework returns [EObject current=null] : iv_ruleTimeSeriesFramework= ruleTimeSeriesFramework EOF ;
    public final EObject entryRuleTimeSeriesFramework() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeSeriesFramework = null;


        try {
            // InternalDsl.g:65:60: (iv_ruleTimeSeriesFramework= ruleTimeSeriesFramework EOF )
            // InternalDsl.g:66:2: iv_ruleTimeSeriesFramework= ruleTimeSeriesFramework EOF
            {
             newCompositeNode(grammarAccess.getTimeSeriesFrameworkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeSeriesFramework=ruleTimeSeriesFramework();

            state._fsp--;

             current =iv_ruleTimeSeriesFramework; 
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
    // $ANTLR end "entryRuleTimeSeriesFramework"


    // $ANTLR start "ruleTimeSeriesFramework"
    // InternalDsl.g:72:1: ruleTimeSeriesFramework returns [EObject current=null] : ( ( (lv_platform_0_0= rulePlatform ) ) ( (lv_data_1_0= ruleData ) ) otherlv_2= 'Tools' otherlv_3= '{' ( (lv_clients_4_0= ruleVisualizationClient ) ) otherlv_5= ';' ( ( (lv_clients_6_0= ruleVisualizationClient ) ) otherlv_7= ';' )* otherlv_8= '}' otherlv_9= ';' ) ;
    public final EObject ruleTimeSeriesFramework() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_platform_0_0 = null;

        EObject lv_data_1_0 = null;

        EObject lv_clients_4_0 = null;

        EObject lv_clients_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:78:2: ( ( ( (lv_platform_0_0= rulePlatform ) ) ( (lv_data_1_0= ruleData ) ) otherlv_2= 'Tools' otherlv_3= '{' ( (lv_clients_4_0= ruleVisualizationClient ) ) otherlv_5= ';' ( ( (lv_clients_6_0= ruleVisualizationClient ) ) otherlv_7= ';' )* otherlv_8= '}' otherlv_9= ';' ) )
            // InternalDsl.g:79:2: ( ( (lv_platform_0_0= rulePlatform ) ) ( (lv_data_1_0= ruleData ) ) otherlv_2= 'Tools' otherlv_3= '{' ( (lv_clients_4_0= ruleVisualizationClient ) ) otherlv_5= ';' ( ( (lv_clients_6_0= ruleVisualizationClient ) ) otherlv_7= ';' )* otherlv_8= '}' otherlv_9= ';' )
            {
            // InternalDsl.g:79:2: ( ( (lv_platform_0_0= rulePlatform ) ) ( (lv_data_1_0= ruleData ) ) otherlv_2= 'Tools' otherlv_3= '{' ( (lv_clients_4_0= ruleVisualizationClient ) ) otherlv_5= ';' ( ( (lv_clients_6_0= ruleVisualizationClient ) ) otherlv_7= ';' )* otherlv_8= '}' otherlv_9= ';' )
            // InternalDsl.g:80:3: ( (lv_platform_0_0= rulePlatform ) ) ( (lv_data_1_0= ruleData ) ) otherlv_2= 'Tools' otherlv_3= '{' ( (lv_clients_4_0= ruleVisualizationClient ) ) otherlv_5= ';' ( ( (lv_clients_6_0= ruleVisualizationClient ) ) otherlv_7= ';' )* otherlv_8= '}' otherlv_9= ';'
            {
            // InternalDsl.g:80:3: ( (lv_platform_0_0= rulePlatform ) )
            // InternalDsl.g:81:4: (lv_platform_0_0= rulePlatform )
            {
            // InternalDsl.g:81:4: (lv_platform_0_0= rulePlatform )
            // InternalDsl.g:82:5: lv_platform_0_0= rulePlatform
            {

            					newCompositeNode(grammarAccess.getTimeSeriesFrameworkAccess().getPlatformPlatformParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_platform_0_0=rulePlatform();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeSeriesFrameworkRule());
            					}
            					set(
            						current,
            						"platform",
            						lv_platform_0_0,
            						"fr.ubo.fast.dsl.Dsl.Platform");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:99:3: ( (lv_data_1_0= ruleData ) )
            // InternalDsl.g:100:4: (lv_data_1_0= ruleData )
            {
            // InternalDsl.g:100:4: (lv_data_1_0= ruleData )
            // InternalDsl.g:101:5: lv_data_1_0= ruleData
            {

            					newCompositeNode(grammarAccess.getTimeSeriesFrameworkAccess().getDataDataParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_data_1_0=ruleData();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeSeriesFrameworkRule());
            					}
            					set(
            						current,
            						"data",
            						lv_data_1_0,
            						"fr.ubo.fast.dsl.Dsl.Data");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTimeSeriesFrameworkAccess().getToolsKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getTimeSeriesFrameworkAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:126:3: ( (lv_clients_4_0= ruleVisualizationClient ) )
            // InternalDsl.g:127:4: (lv_clients_4_0= ruleVisualizationClient )
            {
            // InternalDsl.g:127:4: (lv_clients_4_0= ruleVisualizationClient )
            // InternalDsl.g:128:5: lv_clients_4_0= ruleVisualizationClient
            {

            					newCompositeNode(grammarAccess.getTimeSeriesFrameworkAccess().getClientsVisualizationClientParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_clients_4_0=ruleVisualizationClient();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeSeriesFrameworkRule());
            					}
            					add(
            						current,
            						"clients",
            						lv_clients_4_0,
            						"fr.ubo.fast.dsl.Dsl.VisualizationClient");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getTimeSeriesFrameworkAccess().getSemicolonKeyword_5());
            		
            // InternalDsl.g:149:3: ( ( (lv_clients_6_0= ruleVisualizationClient ) ) otherlv_7= ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:150:4: ( (lv_clients_6_0= ruleVisualizationClient ) ) otherlv_7= ';'
            	    {
            	    // InternalDsl.g:150:4: ( (lv_clients_6_0= ruleVisualizationClient ) )
            	    // InternalDsl.g:151:5: (lv_clients_6_0= ruleVisualizationClient )
            	    {
            	    // InternalDsl.g:151:5: (lv_clients_6_0= ruleVisualizationClient )
            	    // InternalDsl.g:152:6: lv_clients_6_0= ruleVisualizationClient
            	    {

            	    						newCompositeNode(grammarAccess.getTimeSeriesFrameworkAccess().getClientsVisualizationClientParserRuleCall_6_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_clients_6_0=ruleVisualizationClient();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTimeSeriesFrameworkRule());
            	    						}
            	    						add(
            	    							current,
            	    							"clients",
            	    							lv_clients_6_0,
            	    							"fr.ubo.fast.dsl.Dsl.VisualizationClient");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_7=(Token)match(input,13,FOLLOW_8); 

            	    				newLeafNode(otherlv_7, grammarAccess.getTimeSeriesFrameworkAccess().getSemicolonKeyword_6_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getTimeSeriesFrameworkAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getTimeSeriesFrameworkAccess().getSemicolonKeyword_8());
            		

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
    // $ANTLR end "ruleTimeSeriesFramework"


    // $ANTLR start "entryRuleVisualizationClient"
    // InternalDsl.g:186:1: entryRuleVisualizationClient returns [EObject current=null] : iv_ruleVisualizationClient= ruleVisualizationClient EOF ;
    public final EObject entryRuleVisualizationClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisualizationClient = null;


        try {
            // InternalDsl.g:186:60: (iv_ruleVisualizationClient= ruleVisualizationClient EOF )
            // InternalDsl.g:187:2: iv_ruleVisualizationClient= ruleVisualizationClient EOF
            {
             newCompositeNode(grammarAccess.getVisualizationClientRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVisualizationClient=ruleVisualizationClient();

            state._fsp--;

             current =iv_ruleVisualizationClient; 
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
    // $ANTLR end "entryRuleVisualizationClient"


    // $ANTLR start "ruleVisualizationClient"
    // InternalDsl.g:193:1: ruleVisualizationClient returns [EObject current=null] : this_MinMaxVisualizationClient_0= ruleMinMaxVisualizationClient ;
    public final EObject ruleVisualizationClient() throws RecognitionException {
        EObject current = null;

        EObject this_MinMaxVisualizationClient_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:199:2: (this_MinMaxVisualizationClient_0= ruleMinMaxVisualizationClient )
            // InternalDsl.g:200:2: this_MinMaxVisualizationClient_0= ruleMinMaxVisualizationClient
            {

            		newCompositeNode(grammarAccess.getVisualizationClientAccess().getMinMaxVisualizationClientParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_MinMaxVisualizationClient_0=ruleMinMaxVisualizationClient();

            state._fsp--;


            		current = this_MinMaxVisualizationClient_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleVisualizationClient"


    // $ANTLR start "entryRuleScale"
    // InternalDsl.g:211:1: entryRuleScale returns [EObject current=null] : iv_ruleScale= ruleScale EOF ;
    public final EObject entryRuleScale() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScale = null;


        try {
            // InternalDsl.g:211:46: (iv_ruleScale= ruleScale EOF )
            // InternalDsl.g:212:2: iv_ruleScale= ruleScale EOF
            {
             newCompositeNode(grammarAccess.getScaleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScale=ruleScale();

            state._fsp--;

             current =iv_ruleScale; 
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
    // $ANTLR end "entryRuleScale"


    // $ANTLR start "ruleScale"
    // InternalDsl.g:218:1: ruleScale returns [EObject current=null] : (this_CalendarScale_0= ruleCalendarScale | this_FactorScale_1= ruleFactorScale ) ;
    public final EObject ruleScale() throws RecognitionException {
        EObject current = null;

        EObject this_CalendarScale_0 = null;

        EObject this_FactorScale_1 = null;



        	enterRule();

        try {
            // InternalDsl.g:224:2: ( (this_CalendarScale_0= ruleCalendarScale | this_FactorScale_1= ruleFactorScale ) )
            // InternalDsl.g:225:2: (this_CalendarScale_0= ruleCalendarScale | this_FactorScale_1= ruleFactorScale )
            {
            // InternalDsl.g:225:2: (this_CalendarScale_0= ruleCalendarScale | this_FactorScale_1= ruleFactorScale )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==43) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_STRING) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==22) ) {
                        int LA2_4 = input.LA(4);

                        if ( (LA2_4==RULE_INT||LA2_4==38) ) {
                            alt2=2;
                        }
                        else if ( (LA2_4==44) ) {
                            alt2=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA2_1==RULE_ID) ) {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3==22) ) {
                        int LA2_4 = input.LA(4);

                        if ( (LA2_4==RULE_INT||LA2_4==38) ) {
                            alt2=2;
                        }
                        else if ( (LA2_4==44) ) {
                            alt2=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:226:3: this_CalendarScale_0= ruleCalendarScale
                    {

                    			newCompositeNode(grammarAccess.getScaleAccess().getCalendarScaleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CalendarScale_0=ruleCalendarScale();

                    state._fsp--;


                    			current = this_CalendarScale_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:235:3: this_FactorScale_1= ruleFactorScale
                    {

                    			newCompositeNode(grammarAccess.getScaleAccess().getFactorScaleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FactorScale_1=ruleFactorScale();

                    state._fsp--;


                    			current = this_FactorScale_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleScale"


    // $ANTLR start "entryRuleService"
    // InternalDsl.g:247:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalDsl.g:247:48: (iv_ruleService= ruleService EOF )
            // InternalDsl.g:248:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalDsl.g:254:1: ruleService returns [EObject current=null] : (this_Database_0= ruleDatabase | this_WebServer_1= ruleWebServer | this_File_2= ruleFile ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        EObject this_Database_0 = null;

        EObject this_WebServer_1 = null;

        EObject this_File_2 = null;



        	enterRule();

        try {
            // InternalDsl.g:260:2: ( (this_Database_0= ruleDatabase | this_WebServer_1= ruleWebServer | this_File_2= ruleFile ) )
            // InternalDsl.g:261:2: (this_Database_0= ruleDatabase | this_WebServer_1= ruleWebServer | this_File_2= ruleFile )
            {
            // InternalDsl.g:261:2: (this_Database_0= ruleDatabase | this_WebServer_1= ruleWebServer | this_File_2= ruleFile )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==22) ) {
                    switch ( input.LA(3) ) {
                    case RULE_STRING:
                    case RULE_ID:
                        {
                        alt3=3;
                        }
                        break;
                    case 67:
                    case 68:
                        {
                        alt3=1;
                        }
                        break;
                    case 70:
                    case 71:
                        {
                        alt3=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==RULE_ID) ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==22) ) {
                    switch ( input.LA(3) ) {
                    case RULE_STRING:
                    case RULE_ID:
                        {
                        alt3=3;
                        }
                        break;
                    case 67:
                    case 68:
                        {
                        alt3=1;
                        }
                        break;
                    case 70:
                    case 71:
                        {
                        alt3=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:262:3: this_Database_0= ruleDatabase
                    {

                    			newCompositeNode(grammarAccess.getServiceAccess().getDatabaseParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Database_0=ruleDatabase();

                    state._fsp--;


                    			current = this_Database_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:271:3: this_WebServer_1= ruleWebServer
                    {

                    			newCompositeNode(grammarAccess.getServiceAccess().getWebServerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_WebServer_1=ruleWebServer();

                    state._fsp--;


                    			current = this_WebServer_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:280:3: this_File_2= ruleFile
                    {

                    			newCompositeNode(grammarAccess.getServiceAccess().getFileParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_File_2=ruleFile();

                    state._fsp--;


                    			current = this_File_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleData"
    // InternalDsl.g:292:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // InternalDsl.g:292:45: (iv_ruleData= ruleData EOF )
            // InternalDsl.g:293:2: iv_ruleData= ruleData EOF
            {
             newCompositeNode(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleData=ruleData();

            state._fsp--;

             current =iv_ruleData; 
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
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // InternalDsl.g:299:1: ruleData returns [EObject current=null] : (otherlv_0= 'Data' otherlv_1= '{' otherlv_2= 'Sensors' otherlv_3= '{' ( (lv_sensorsData_4_0= ruleSensor ) ) otherlv_5= ';' ( ( (lv_sensorsData_6_0= ruleSensor ) ) otherlv_7= ';' )* otherlv_8= '}' otherlv_9= ';' otherlv_10= 'TimeSeries' otherlv_11= '{' ( (lv_timeSeriesData_12_0= ruleTimeSeries ) ) otherlv_13= ';' ( ( (lv_timeSeriesData_14_0= ruleTimeSeries ) ) otherlv_15= ';' )* otherlv_16= '}' otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        EObject lv_sensorsData_4_0 = null;

        EObject lv_sensorsData_6_0 = null;

        EObject lv_timeSeriesData_12_0 = null;

        EObject lv_timeSeriesData_14_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:305:2: ( (otherlv_0= 'Data' otherlv_1= '{' otherlv_2= 'Sensors' otherlv_3= '{' ( (lv_sensorsData_4_0= ruleSensor ) ) otherlv_5= ';' ( ( (lv_sensorsData_6_0= ruleSensor ) ) otherlv_7= ';' )* otherlv_8= '}' otherlv_9= ';' otherlv_10= 'TimeSeries' otherlv_11= '{' ( (lv_timeSeriesData_12_0= ruleTimeSeries ) ) otherlv_13= ';' ( ( (lv_timeSeriesData_14_0= ruleTimeSeries ) ) otherlv_15= ';' )* otherlv_16= '}' otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' ) )
            // InternalDsl.g:306:2: (otherlv_0= 'Data' otherlv_1= '{' otherlv_2= 'Sensors' otherlv_3= '{' ( (lv_sensorsData_4_0= ruleSensor ) ) otherlv_5= ';' ( ( (lv_sensorsData_6_0= ruleSensor ) ) otherlv_7= ';' )* otherlv_8= '}' otherlv_9= ';' otherlv_10= 'TimeSeries' otherlv_11= '{' ( (lv_timeSeriesData_12_0= ruleTimeSeries ) ) otherlv_13= ';' ( ( (lv_timeSeriesData_14_0= ruleTimeSeries ) ) otherlv_15= ';' )* otherlv_16= '}' otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' )
            {
            // InternalDsl.g:306:2: (otherlv_0= 'Data' otherlv_1= '{' otherlv_2= 'Sensors' otherlv_3= '{' ( (lv_sensorsData_4_0= ruleSensor ) ) otherlv_5= ';' ( ( (lv_sensorsData_6_0= ruleSensor ) ) otherlv_7= ';' )* otherlv_8= '}' otherlv_9= ';' otherlv_10= 'TimeSeries' otherlv_11= '{' ( (lv_timeSeriesData_12_0= ruleTimeSeries ) ) otherlv_13= ';' ( ( (lv_timeSeriesData_14_0= ruleTimeSeries ) ) otherlv_15= ';' )* otherlv_16= '}' otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' )
            // InternalDsl.g:307:3: otherlv_0= 'Data' otherlv_1= '{' otherlv_2= 'Sensors' otherlv_3= '{' ( (lv_sensorsData_4_0= ruleSensor ) ) otherlv_5= ';' ( ( (lv_sensorsData_6_0= ruleSensor ) ) otherlv_7= ';' )* otherlv_8= '}' otherlv_9= ';' otherlv_10= 'TimeSeries' otherlv_11= '{' ( (lv_timeSeriesData_12_0= ruleTimeSeries ) ) otherlv_13= ';' ( ( (lv_timeSeriesData_14_0= ruleTimeSeries ) ) otherlv_15= ';' )* otherlv_16= '}' otherlv_17= ';' otherlv_18= '}' otherlv_19= ';'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDataAccess().getDataKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getDataAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getDataAccess().getSensorsKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getDataAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:323:3: ( (lv_sensorsData_4_0= ruleSensor ) )
            // InternalDsl.g:324:4: (lv_sensorsData_4_0= ruleSensor )
            {
            // InternalDsl.g:324:4: (lv_sensorsData_4_0= ruleSensor )
            // InternalDsl.g:325:5: lv_sensorsData_4_0= ruleSensor
            {

            					newCompositeNode(grammarAccess.getDataAccess().getSensorsDataSensorParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_sensorsData_4_0=ruleSensor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataRule());
            					}
            					add(
            						current,
            						"sensorsData",
            						lv_sensorsData_4_0,
            						"fr.ubo.fast.dsl.Dsl.Sensor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getDataAccess().getSemicolonKeyword_5());
            		
            // InternalDsl.g:346:3: ( ( (lv_sensorsData_6_0= ruleSensor ) ) otherlv_7= ';' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDsl.g:347:4: ( (lv_sensorsData_6_0= ruleSensor ) ) otherlv_7= ';'
            	    {
            	    // InternalDsl.g:347:4: ( (lv_sensorsData_6_0= ruleSensor ) )
            	    // InternalDsl.g:348:5: (lv_sensorsData_6_0= ruleSensor )
            	    {
            	    // InternalDsl.g:348:5: (lv_sensorsData_6_0= ruleSensor )
            	    // InternalDsl.g:349:6: lv_sensorsData_6_0= ruleSensor
            	    {

            	    						newCompositeNode(grammarAccess.getDataAccess().getSensorsDataSensorParserRuleCall_6_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_sensorsData_6_0=ruleSensor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDataRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sensorsData",
            	    							lv_sensorsData_6_0,
            	    							"fr.ubo.fast.dsl.Dsl.Sensor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_7=(Token)match(input,13,FOLLOW_11); 

            	    				newLeafNode(otherlv_7, grammarAccess.getDataAccess().getSemicolonKeyword_6_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getDataAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getDataAccess().getSemicolonKeyword_8());
            		
            otherlv_10=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_10, grammarAccess.getDataAccess().getTimeSeriesKeyword_9());
            		
            otherlv_11=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_11, grammarAccess.getDataAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalDsl.g:387:3: ( (lv_timeSeriesData_12_0= ruleTimeSeries ) )
            // InternalDsl.g:388:4: (lv_timeSeriesData_12_0= ruleTimeSeries )
            {
            // InternalDsl.g:388:4: (lv_timeSeriesData_12_0= ruleTimeSeries )
            // InternalDsl.g:389:5: lv_timeSeriesData_12_0= ruleTimeSeries
            {

            					newCompositeNode(grammarAccess.getDataAccess().getTimeSeriesDataTimeSeriesParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_7);
            lv_timeSeriesData_12_0=ruleTimeSeries();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataRule());
            					}
            					add(
            						current,
            						"timeSeriesData",
            						lv_timeSeriesData_12_0,
            						"fr.ubo.fast.dsl.Dsl.TimeSeries");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_13, grammarAccess.getDataAccess().getSemicolonKeyword_12());
            		
            // InternalDsl.g:410:3: ( ( (lv_timeSeriesData_14_0= ruleTimeSeries ) ) otherlv_15= ';' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDsl.g:411:4: ( (lv_timeSeriesData_14_0= ruleTimeSeries ) ) otherlv_15= ';'
            	    {
            	    // InternalDsl.g:411:4: ( (lv_timeSeriesData_14_0= ruleTimeSeries ) )
            	    // InternalDsl.g:412:5: (lv_timeSeriesData_14_0= ruleTimeSeries )
            	    {
            	    // InternalDsl.g:412:5: (lv_timeSeriesData_14_0= ruleTimeSeries )
            	    // InternalDsl.g:413:6: lv_timeSeriesData_14_0= ruleTimeSeries
            	    {

            	    						newCompositeNode(grammarAccess.getDataAccess().getTimeSeriesDataTimeSeriesParserRuleCall_13_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_timeSeriesData_14_0=ruleTimeSeries();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDataRule());
            	    						}
            	    						add(
            	    							current,
            	    							"timeSeriesData",
            	    							lv_timeSeriesData_14_0,
            	    							"fr.ubo.fast.dsl.Dsl.TimeSeries");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_15=(Token)match(input,13,FOLLOW_11); 

            	    				newLeafNode(otherlv_15, grammarAccess.getDataAccess().getSemicolonKeyword_13_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_16=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_16, grammarAccess.getDataAccess().getRightCurlyBracketKeyword_14());
            		
            otherlv_17=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_17, grammarAccess.getDataAccess().getSemicolonKeyword_15());
            		
            otherlv_18=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_18, grammarAccess.getDataAccess().getRightCurlyBracketKeyword_16());
            		
            otherlv_19=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getDataAccess().getSemicolonKeyword_17());
            		

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
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRulePlatform"
    // InternalDsl.g:455:1: entryRulePlatform returns [EObject current=null] : iv_rulePlatform= rulePlatform EOF ;
    public final EObject entryRulePlatform() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatform = null;


        try {
            // InternalDsl.g:455:49: (iv_rulePlatform= rulePlatform EOF )
            // InternalDsl.g:456:2: iv_rulePlatform= rulePlatform EOF
            {
             newCompositeNode(grammarAccess.getPlatformRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatform=rulePlatform();

            state._fsp--;

             current =iv_rulePlatform; 
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
    // $ANTLR end "entryRulePlatform"


    // $ANTLR start "rulePlatform"
    // InternalDsl.g:462:1: rulePlatform returns [EObject current=null] : (otherlv_0= 'HwArchitecture' otherlv_1= '{' otherlv_2= 'Computers' otherlv_3= '{' ( (lv_computersPlatform_4_0= ruleComputer ) ) otherlv_5= ';' ( ( (lv_computersPlatform_6_0= ruleComputer ) ) otherlv_7= ';' )* otherlv_8= '}' otherlv_9= ';' otherlv_10= 'Networks' otherlv_11= '{' ( (lv_networksPlatform_12_0= ruleNetwork ) ) otherlv_13= ';' ( ( (lv_networksPlatform_14_0= ruleNetwork ) ) otherlv_15= ';' )* otherlv_16= '}' otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' ) ;
    public final EObject rulePlatform() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        EObject lv_computersPlatform_4_0 = null;

        EObject lv_computersPlatform_6_0 = null;

        EObject lv_networksPlatform_12_0 = null;

        EObject lv_networksPlatform_14_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:468:2: ( (otherlv_0= 'HwArchitecture' otherlv_1= '{' otherlv_2= 'Computers' otherlv_3= '{' ( (lv_computersPlatform_4_0= ruleComputer ) ) otherlv_5= ';' ( ( (lv_computersPlatform_6_0= ruleComputer ) ) otherlv_7= ';' )* otherlv_8= '}' otherlv_9= ';' otherlv_10= 'Networks' otherlv_11= '{' ( (lv_networksPlatform_12_0= ruleNetwork ) ) otherlv_13= ';' ( ( (lv_networksPlatform_14_0= ruleNetwork ) ) otherlv_15= ';' )* otherlv_16= '}' otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' ) )
            // InternalDsl.g:469:2: (otherlv_0= 'HwArchitecture' otherlv_1= '{' otherlv_2= 'Computers' otherlv_3= '{' ( (lv_computersPlatform_4_0= ruleComputer ) ) otherlv_5= ';' ( ( (lv_computersPlatform_6_0= ruleComputer ) ) otherlv_7= ';' )* otherlv_8= '}' otherlv_9= ';' otherlv_10= 'Networks' otherlv_11= '{' ( (lv_networksPlatform_12_0= ruleNetwork ) ) otherlv_13= ';' ( ( (lv_networksPlatform_14_0= ruleNetwork ) ) otherlv_15= ';' )* otherlv_16= '}' otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' )
            {
            // InternalDsl.g:469:2: (otherlv_0= 'HwArchitecture' otherlv_1= '{' otherlv_2= 'Computers' otherlv_3= '{' ( (lv_computersPlatform_4_0= ruleComputer ) ) otherlv_5= ';' ( ( (lv_computersPlatform_6_0= ruleComputer ) ) otherlv_7= ';' )* otherlv_8= '}' otherlv_9= ';' otherlv_10= 'Networks' otherlv_11= '{' ( (lv_networksPlatform_12_0= ruleNetwork ) ) otherlv_13= ';' ( ( (lv_networksPlatform_14_0= ruleNetwork ) ) otherlv_15= ';' )* otherlv_16= '}' otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' )
            // InternalDsl.g:470:3: otherlv_0= 'HwArchitecture' otherlv_1= '{' otherlv_2= 'Computers' otherlv_3= '{' ( (lv_computersPlatform_4_0= ruleComputer ) ) otherlv_5= ';' ( ( (lv_computersPlatform_6_0= ruleComputer ) ) otherlv_7= ';' )* otherlv_8= '}' otherlv_9= ';' otherlv_10= 'Networks' otherlv_11= '{' ( (lv_networksPlatform_12_0= ruleNetwork ) ) otherlv_13= ';' ( ( (lv_networksPlatform_14_0= ruleNetwork ) ) otherlv_15= ';' )* otherlv_16= '}' otherlv_17= ';' otherlv_18= '}' otherlv_19= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPlatformAccess().getHwArchitectureKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getPlatformAccess().getComputersKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:486:3: ( (lv_computersPlatform_4_0= ruleComputer ) )
            // InternalDsl.g:487:4: (lv_computersPlatform_4_0= ruleComputer )
            {
            // InternalDsl.g:487:4: (lv_computersPlatform_4_0= ruleComputer )
            // InternalDsl.g:488:5: lv_computersPlatform_4_0= ruleComputer
            {

            					newCompositeNode(grammarAccess.getPlatformAccess().getComputersPlatformComputerParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_computersPlatform_4_0=ruleComputer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlatformRule());
            					}
            					add(
            						current,
            						"computersPlatform",
            						lv_computersPlatform_4_0,
            						"fr.ubo.fast.dsl.Dsl.Computer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getPlatformAccess().getSemicolonKeyword_5());
            		
            // InternalDsl.g:509:3: ( ( (lv_computersPlatform_6_0= ruleComputer ) ) otherlv_7= ';' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==37) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDsl.g:510:4: ( (lv_computersPlatform_6_0= ruleComputer ) ) otherlv_7= ';'
            	    {
            	    // InternalDsl.g:510:4: ( (lv_computersPlatform_6_0= ruleComputer ) )
            	    // InternalDsl.g:511:5: (lv_computersPlatform_6_0= ruleComputer )
            	    {
            	    // InternalDsl.g:511:5: (lv_computersPlatform_6_0= ruleComputer )
            	    // InternalDsl.g:512:6: lv_computersPlatform_6_0= ruleComputer
            	    {

            	    						newCompositeNode(grammarAccess.getPlatformAccess().getComputersPlatformComputerParserRuleCall_6_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_computersPlatform_6_0=ruleComputer();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlatformRule());
            	    						}
            	    						add(
            	    							current,
            	    							"computersPlatform",
            	    							lv_computersPlatform_6_0,
            	    							"fr.ubo.fast.dsl.Dsl.Computer");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_7=(Token)match(input,13,FOLLOW_16); 

            	    				newLeafNode(otherlv_7, grammarAccess.getPlatformAccess().getSemicolonKeyword_6_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_9, grammarAccess.getPlatformAccess().getSemicolonKeyword_8());
            		
            otherlv_10=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_10, grammarAccess.getPlatformAccess().getNetworksKeyword_9());
            		
            otherlv_11=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_11, grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalDsl.g:550:3: ( (lv_networksPlatform_12_0= ruleNetwork ) )
            // InternalDsl.g:551:4: (lv_networksPlatform_12_0= ruleNetwork )
            {
            // InternalDsl.g:551:4: (lv_networksPlatform_12_0= ruleNetwork )
            // InternalDsl.g:552:5: lv_networksPlatform_12_0= ruleNetwork
            {

            					newCompositeNode(grammarAccess.getPlatformAccess().getNetworksPlatformNetworkParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_7);
            lv_networksPlatform_12_0=ruleNetwork();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlatformRule());
            					}
            					add(
            						current,
            						"networksPlatform",
            						lv_networksPlatform_12_0,
            						"fr.ubo.fast.dsl.Dsl.Network");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_13, grammarAccess.getPlatformAccess().getSemicolonKeyword_12());
            		
            // InternalDsl.g:573:3: ( ( (lv_networksPlatform_14_0= ruleNetwork ) ) otherlv_15= ';' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==41) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDsl.g:574:4: ( (lv_networksPlatform_14_0= ruleNetwork ) ) otherlv_15= ';'
            	    {
            	    // InternalDsl.g:574:4: ( (lv_networksPlatform_14_0= ruleNetwork ) )
            	    // InternalDsl.g:575:5: (lv_networksPlatform_14_0= ruleNetwork )
            	    {
            	    // InternalDsl.g:575:5: (lv_networksPlatform_14_0= ruleNetwork )
            	    // InternalDsl.g:576:6: lv_networksPlatform_14_0= ruleNetwork
            	    {

            	    						newCompositeNode(grammarAccess.getPlatformAccess().getNetworksPlatformNetworkParserRuleCall_13_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_networksPlatform_14_0=ruleNetwork();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlatformRule());
            	    						}
            	    						add(
            	    							current,
            	    							"networksPlatform",
            	    							lv_networksPlatform_14_0,
            	    							"fr.ubo.fast.dsl.Dsl.Network");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_15=(Token)match(input,13,FOLLOW_19); 

            	    				newLeafNode(otherlv_15, grammarAccess.getPlatformAccess().getSemicolonKeyword_13_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_16=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_16, grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_14());
            		
            otherlv_17=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_17, grammarAccess.getPlatformAccess().getSemicolonKeyword_15());
            		
            otherlv_18=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_18, grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_16());
            		
            otherlv_19=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getPlatformAccess().getSemicolonKeyword_17());
            		

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
    // $ANTLR end "rulePlatform"


    // $ANTLR start "entryRuleMinMaxVisualizationClient"
    // InternalDsl.g:618:1: entryRuleMinMaxVisualizationClient returns [EObject current=null] : iv_ruleMinMaxVisualizationClient= ruleMinMaxVisualizationClient EOF ;
    public final EObject entryRuleMinMaxVisualizationClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinMaxVisualizationClient = null;


        try {
            // InternalDsl.g:618:66: (iv_ruleMinMaxVisualizationClient= ruleMinMaxVisualizationClient EOF )
            // InternalDsl.g:619:2: iv_ruleMinMaxVisualizationClient= ruleMinMaxVisualizationClient EOF
            {
             newCompositeNode(grammarAccess.getMinMaxVisualizationClientRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMinMaxVisualizationClient=ruleMinMaxVisualizationClient();

            state._fsp--;

             current =iv_ruleMinMaxVisualizationClient; 
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
    // $ANTLR end "entryRuleMinMaxVisualizationClient"


    // $ANTLR start "ruleMinMaxVisualizationClient"
    // InternalDsl.g:625:1: ruleMinMaxVisualizationClient returns [EObject current=null] : (otherlv_0= 'Tool' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( ruleEString ) ) otherlv_4= 'on' ( ( ruleEString ) ) otherlv_6= ',' ( (lv_chartWidth_7_0= ruleEInt ) ) otherlv_8= ',' ( (lv_chartHeight_9_0= ruleEInt ) ) otherlv_10= ',' ( (lv_axisFactor_11_0= ruleEInt ) ) otherlv_12= ')' otherlv_13= '{' ( (lv_userPolicy_14_0= ruleUserPolicy ) ) otherlv_15= ';' ( (lv_clientScale_16_0= ruleScale ) ) otherlv_17= ';' otherlv_18= 'userTime' ( (lv_userTime_19_0= ruleEDouble ) ) otherlv_20= ';' otherlv_21= 'pingTime' ( (lv_pingTime_22_0= ruleEDouble ) ) otherlv_23= ';' otherlv_24= 'rawDataThreshold' ( (lv_rawDataThreshold_25_0= ruleEDouble ) ) otherlv_26= ';' otherlv_27= 'preComputedDataThreshold' ( (lv_preComputedDataThreshold_28_0= ruleEDouble ) ) otherlv_29= ';' otherlv_30= '}' ) ;
    public final EObject ruleMinMaxVisualizationClient() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_chartWidth_7_0 = null;

        AntlrDatatypeRuleToken lv_chartHeight_9_0 = null;

        AntlrDatatypeRuleToken lv_axisFactor_11_0 = null;

        Enumerator lv_userPolicy_14_0 = null;

        EObject lv_clientScale_16_0 = null;

        AntlrDatatypeRuleToken lv_userTime_19_0 = null;

        AntlrDatatypeRuleToken lv_pingTime_22_0 = null;

        AntlrDatatypeRuleToken lv_rawDataThreshold_25_0 = null;

        AntlrDatatypeRuleToken lv_preComputedDataThreshold_28_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:631:2: ( (otherlv_0= 'Tool' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( ruleEString ) ) otherlv_4= 'on' ( ( ruleEString ) ) otherlv_6= ',' ( (lv_chartWidth_7_0= ruleEInt ) ) otherlv_8= ',' ( (lv_chartHeight_9_0= ruleEInt ) ) otherlv_10= ',' ( (lv_axisFactor_11_0= ruleEInt ) ) otherlv_12= ')' otherlv_13= '{' ( (lv_userPolicy_14_0= ruleUserPolicy ) ) otherlv_15= ';' ( (lv_clientScale_16_0= ruleScale ) ) otherlv_17= ';' otherlv_18= 'userTime' ( (lv_userTime_19_0= ruleEDouble ) ) otherlv_20= ';' otherlv_21= 'pingTime' ( (lv_pingTime_22_0= ruleEDouble ) ) otherlv_23= ';' otherlv_24= 'rawDataThreshold' ( (lv_rawDataThreshold_25_0= ruleEDouble ) ) otherlv_26= ';' otherlv_27= 'preComputedDataThreshold' ( (lv_preComputedDataThreshold_28_0= ruleEDouble ) ) otherlv_29= ';' otherlv_30= '}' ) )
            // InternalDsl.g:632:2: (otherlv_0= 'Tool' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( ruleEString ) ) otherlv_4= 'on' ( ( ruleEString ) ) otherlv_6= ',' ( (lv_chartWidth_7_0= ruleEInt ) ) otherlv_8= ',' ( (lv_chartHeight_9_0= ruleEInt ) ) otherlv_10= ',' ( (lv_axisFactor_11_0= ruleEInt ) ) otherlv_12= ')' otherlv_13= '{' ( (lv_userPolicy_14_0= ruleUserPolicy ) ) otherlv_15= ';' ( (lv_clientScale_16_0= ruleScale ) ) otherlv_17= ';' otherlv_18= 'userTime' ( (lv_userTime_19_0= ruleEDouble ) ) otherlv_20= ';' otherlv_21= 'pingTime' ( (lv_pingTime_22_0= ruleEDouble ) ) otherlv_23= ';' otherlv_24= 'rawDataThreshold' ( (lv_rawDataThreshold_25_0= ruleEDouble ) ) otherlv_26= ';' otherlv_27= 'preComputedDataThreshold' ( (lv_preComputedDataThreshold_28_0= ruleEDouble ) ) otherlv_29= ';' otherlv_30= '}' )
            {
            // InternalDsl.g:632:2: (otherlv_0= 'Tool' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( ruleEString ) ) otherlv_4= 'on' ( ( ruleEString ) ) otherlv_6= ',' ( (lv_chartWidth_7_0= ruleEInt ) ) otherlv_8= ',' ( (lv_chartHeight_9_0= ruleEInt ) ) otherlv_10= ',' ( (lv_axisFactor_11_0= ruleEInt ) ) otherlv_12= ')' otherlv_13= '{' ( (lv_userPolicy_14_0= ruleUserPolicy ) ) otherlv_15= ';' ( (lv_clientScale_16_0= ruleScale ) ) otherlv_17= ';' otherlv_18= 'userTime' ( (lv_userTime_19_0= ruleEDouble ) ) otherlv_20= ';' otherlv_21= 'pingTime' ( (lv_pingTime_22_0= ruleEDouble ) ) otherlv_23= ';' otherlv_24= 'rawDataThreshold' ( (lv_rawDataThreshold_25_0= ruleEDouble ) ) otherlv_26= ';' otherlv_27= 'preComputedDataThreshold' ( (lv_preComputedDataThreshold_28_0= ruleEDouble ) ) otherlv_29= ';' otherlv_30= '}' )
            // InternalDsl.g:633:3: otherlv_0= 'Tool' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( ruleEString ) ) otherlv_4= 'on' ( ( ruleEString ) ) otherlv_6= ',' ( (lv_chartWidth_7_0= ruleEInt ) ) otherlv_8= ',' ( (lv_chartHeight_9_0= ruleEInt ) ) otherlv_10= ',' ( (lv_axisFactor_11_0= ruleEInt ) ) otherlv_12= ')' otherlv_13= '{' ( (lv_userPolicy_14_0= ruleUserPolicy ) ) otherlv_15= ';' ( (lv_clientScale_16_0= ruleScale ) ) otherlv_17= ';' otherlv_18= 'userTime' ( (lv_userTime_19_0= ruleEDouble ) ) otherlv_20= ';' otherlv_21= 'pingTime' ( (lv_pingTime_22_0= ruleEDouble ) ) otherlv_23= ';' otherlv_24= 'rawDataThreshold' ( (lv_rawDataThreshold_25_0= ruleEDouble ) ) otherlv_26= ';' otherlv_27= 'preComputedDataThreshold' ( (lv_preComputedDataThreshold_28_0= ruleEDouble ) ) otherlv_29= ';' otherlv_30= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getMinMaxVisualizationClientAccess().getToolKeyword_0());
            		
            // InternalDsl.g:637:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:638:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:638:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:639:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMinMaxVisualizationClientAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMinMaxVisualizationClientRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.ubo.fast.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getMinMaxVisualizationClientAccess().getLeftParenthesisKeyword_2());
            		
            // InternalDsl.g:660:3: ( ( ruleEString ) )
            // InternalDsl.g:661:4: ( ruleEString )
            {
            // InternalDsl.g:661:4: ( ruleEString )
            // InternalDsl.g:662:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMinMaxVisualizationClientRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMinMaxVisualizationClientAccess().getTimeSeriesSelectedTimeSeriesCrossReference_3_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getMinMaxVisualizationClientAccess().getOnKeyword_4());
            		
            // InternalDsl.g:680:3: ( ( ruleEString ) )
            // InternalDsl.g:681:4: ( ruleEString )
            {
            // InternalDsl.g:681:4: ( ruleEString )
            // InternalDsl.g:682:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMinMaxVisualizationClientRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMinMaxVisualizationClientAccess().getClientComputerComputerCrossReference_5_0());
            				
            pushFollow(FOLLOW_22);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_23); 

            			newLeafNode(otherlv_6, grammarAccess.getMinMaxVisualizationClientAccess().getCommaKeyword_6());
            		
            // InternalDsl.g:700:3: ( (lv_chartWidth_7_0= ruleEInt ) )
            // InternalDsl.g:701:4: (lv_chartWidth_7_0= ruleEInt )
            {
            // InternalDsl.g:701:4: (lv_chartWidth_7_0= ruleEInt )
            // InternalDsl.g:702:5: lv_chartWidth_7_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getMinMaxVisualizationClientAccess().getChartWidthEIntParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_22);
            lv_chartWidth_7_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMinMaxVisualizationClientRule());
            					}
            					set(
            						current,
            						"chartWidth",
            						lv_chartWidth_7_0,
            						"fr.ubo.fast.dsl.Dsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,24,FOLLOW_23); 

            			newLeafNode(otherlv_8, grammarAccess.getMinMaxVisualizationClientAccess().getCommaKeyword_8());
            		
            // InternalDsl.g:723:3: ( (lv_chartHeight_9_0= ruleEInt ) )
            // InternalDsl.g:724:4: (lv_chartHeight_9_0= ruleEInt )
            {
            // InternalDsl.g:724:4: (lv_chartHeight_9_0= ruleEInt )
            // InternalDsl.g:725:5: lv_chartHeight_9_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getMinMaxVisualizationClientAccess().getChartHeightEIntParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_22);
            lv_chartHeight_9_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMinMaxVisualizationClientRule());
            					}
            					set(
            						current,
            						"chartHeight",
            						lv_chartHeight_9_0,
            						"fr.ubo.fast.dsl.Dsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,24,FOLLOW_23); 

            			newLeafNode(otherlv_10, grammarAccess.getMinMaxVisualizationClientAccess().getCommaKeyword_10());
            		
            // InternalDsl.g:746:3: ( (lv_axisFactor_11_0= ruleEInt ) )
            // InternalDsl.g:747:4: (lv_axisFactor_11_0= ruleEInt )
            {
            // InternalDsl.g:747:4: (lv_axisFactor_11_0= ruleEInt )
            // InternalDsl.g:748:5: lv_axisFactor_11_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getMinMaxVisualizationClientAccess().getAxisFactorEIntParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_24);
            lv_axisFactor_11_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMinMaxVisualizationClientRule());
            					}
            					set(
            						current,
            						"axisFactor",
            						lv_axisFactor_11_0,
            						"fr.ubo.fast.dsl.Dsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_12, grammarAccess.getMinMaxVisualizationClientAccess().getRightParenthesisKeyword_12());
            		
            otherlv_13=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_13, grammarAccess.getMinMaxVisualizationClientAccess().getLeftCurlyBracketKeyword_13());
            		
            // InternalDsl.g:773:3: ( (lv_userPolicy_14_0= ruleUserPolicy ) )
            // InternalDsl.g:774:4: (lv_userPolicy_14_0= ruleUserPolicy )
            {
            // InternalDsl.g:774:4: (lv_userPolicy_14_0= ruleUserPolicy )
            // InternalDsl.g:775:5: lv_userPolicy_14_0= ruleUserPolicy
            {

            					newCompositeNode(grammarAccess.getMinMaxVisualizationClientAccess().getUserPolicyUserPolicyEnumRuleCall_14_0());
            				
            pushFollow(FOLLOW_7);
            lv_userPolicy_14_0=ruleUserPolicy();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMinMaxVisualizationClientRule());
            					}
            					set(
            						current,
            						"userPolicy",
            						lv_userPolicy_14_0,
            						"fr.ubo.fast.dsl.Dsl.UserPolicy");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,13,FOLLOW_26); 

            			newLeafNode(otherlv_15, grammarAccess.getMinMaxVisualizationClientAccess().getSemicolonKeyword_15());
            		
            // InternalDsl.g:796:3: ( (lv_clientScale_16_0= ruleScale ) )
            // InternalDsl.g:797:4: (lv_clientScale_16_0= ruleScale )
            {
            // InternalDsl.g:797:4: (lv_clientScale_16_0= ruleScale )
            // InternalDsl.g:798:5: lv_clientScale_16_0= ruleScale
            {

            					newCompositeNode(grammarAccess.getMinMaxVisualizationClientAccess().getClientScaleScaleParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_7);
            lv_clientScale_16_0=ruleScale();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMinMaxVisualizationClientRule());
            					}
            					set(
            						current,
            						"clientScale",
            						lv_clientScale_16_0,
            						"fr.ubo.fast.dsl.Dsl.Scale");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,13,FOLLOW_27); 

            			newLeafNode(otherlv_17, grammarAccess.getMinMaxVisualizationClientAccess().getSemicolonKeyword_17());
            		
            otherlv_18=(Token)match(input,26,FOLLOW_28); 

            			newLeafNode(otherlv_18, grammarAccess.getMinMaxVisualizationClientAccess().getUserTimeKeyword_18());
            		
            // InternalDsl.g:823:3: ( (lv_userTime_19_0= ruleEDouble ) )
            // InternalDsl.g:824:4: (lv_userTime_19_0= ruleEDouble )
            {
            // InternalDsl.g:824:4: (lv_userTime_19_0= ruleEDouble )
            // InternalDsl.g:825:5: lv_userTime_19_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getMinMaxVisualizationClientAccess().getUserTimeEDoubleParserRuleCall_19_0());
            				
            pushFollow(FOLLOW_7);
            lv_userTime_19_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMinMaxVisualizationClientRule());
            					}
            					set(
            						current,
            						"userTime",
            						lv_userTime_19_0,
            						"fr.ubo.fast.dsl.Dsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_20=(Token)match(input,13,FOLLOW_29); 

            			newLeafNode(otherlv_20, grammarAccess.getMinMaxVisualizationClientAccess().getSemicolonKeyword_20());
            		
            otherlv_21=(Token)match(input,27,FOLLOW_28); 

            			newLeafNode(otherlv_21, grammarAccess.getMinMaxVisualizationClientAccess().getPingTimeKeyword_21());
            		
            // InternalDsl.g:850:3: ( (lv_pingTime_22_0= ruleEDouble ) )
            // InternalDsl.g:851:4: (lv_pingTime_22_0= ruleEDouble )
            {
            // InternalDsl.g:851:4: (lv_pingTime_22_0= ruleEDouble )
            // InternalDsl.g:852:5: lv_pingTime_22_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getMinMaxVisualizationClientAccess().getPingTimeEDoubleParserRuleCall_22_0());
            				
            pushFollow(FOLLOW_7);
            lv_pingTime_22_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMinMaxVisualizationClientRule());
            					}
            					set(
            						current,
            						"pingTime",
            						lv_pingTime_22_0,
            						"fr.ubo.fast.dsl.Dsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_23=(Token)match(input,13,FOLLOW_30); 

            			newLeafNode(otherlv_23, grammarAccess.getMinMaxVisualizationClientAccess().getSemicolonKeyword_23());
            		
            otherlv_24=(Token)match(input,28,FOLLOW_28); 

            			newLeafNode(otherlv_24, grammarAccess.getMinMaxVisualizationClientAccess().getRawDataThresholdKeyword_24());
            		
            // InternalDsl.g:877:3: ( (lv_rawDataThreshold_25_0= ruleEDouble ) )
            // InternalDsl.g:878:4: (lv_rawDataThreshold_25_0= ruleEDouble )
            {
            // InternalDsl.g:878:4: (lv_rawDataThreshold_25_0= ruleEDouble )
            // InternalDsl.g:879:5: lv_rawDataThreshold_25_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getMinMaxVisualizationClientAccess().getRawDataThresholdEDoubleParserRuleCall_25_0());
            				
            pushFollow(FOLLOW_7);
            lv_rawDataThreshold_25_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMinMaxVisualizationClientRule());
            					}
            					set(
            						current,
            						"rawDataThreshold",
            						lv_rawDataThreshold_25_0,
            						"fr.ubo.fast.dsl.Dsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_26=(Token)match(input,13,FOLLOW_31); 

            			newLeafNode(otherlv_26, grammarAccess.getMinMaxVisualizationClientAccess().getSemicolonKeyword_26());
            		
            otherlv_27=(Token)match(input,29,FOLLOW_28); 

            			newLeafNode(otherlv_27, grammarAccess.getMinMaxVisualizationClientAccess().getPreComputedDataThresholdKeyword_27());
            		
            // InternalDsl.g:904:3: ( (lv_preComputedDataThreshold_28_0= ruleEDouble ) )
            // InternalDsl.g:905:4: (lv_preComputedDataThreshold_28_0= ruleEDouble )
            {
            // InternalDsl.g:905:4: (lv_preComputedDataThreshold_28_0= ruleEDouble )
            // InternalDsl.g:906:5: lv_preComputedDataThreshold_28_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getMinMaxVisualizationClientAccess().getPreComputedDataThresholdEDoubleParserRuleCall_28_0());
            				
            pushFollow(FOLLOW_7);
            lv_preComputedDataThreshold_28_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMinMaxVisualizationClientRule());
            					}
            					set(
            						current,
            						"preComputedDataThreshold",
            						lv_preComputedDataThreshold_28_0,
            						"fr.ubo.fast.dsl.Dsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_29=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_29, grammarAccess.getMinMaxVisualizationClientAccess().getSemicolonKeyword_29());
            		
            otherlv_30=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_30, grammarAccess.getMinMaxVisualizationClientAccess().getRightCurlyBracketKeyword_30());
            		

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
    // $ANTLR end "ruleMinMaxVisualizationClient"


    // $ANTLR start "entryRuleTimeSeries"
    // InternalDsl.g:935:1: entryRuleTimeSeries returns [EObject current=null] : iv_ruleTimeSeries= ruleTimeSeries EOF ;
    public final EObject entryRuleTimeSeries() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeSeries = null;


        try {
            // InternalDsl.g:935:51: (iv_ruleTimeSeries= ruleTimeSeries EOF )
            // InternalDsl.g:936:2: iv_ruleTimeSeries= ruleTimeSeries EOF
            {
             newCompositeNode(grammarAccess.getTimeSeriesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeSeries=ruleTimeSeries();

            state._fsp--;

             current =iv_ruleTimeSeries; 
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
    // $ANTLR end "entryRuleTimeSeries"


    // $ANTLR start "ruleTimeSeries"
    // InternalDsl.g:942:1: ruleTimeSeries returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ')' otherlv_4= '{' otherlv_5= 'startTime' ( (lv_startTime_6_0= ruleEString ) ) otherlv_7= ';' otherlv_8= 'endTime' ( (lv_endTime_9_0= ruleEString ) ) otherlv_10= ';' otherlv_11= 'period' ( (lv_period_12_0= ruleEDouble ) ) otherlv_13= ';' otherlv_14= 'database' ( ( ruleEString ) ) otherlv_16= ';' otherlv_17= '}' ) ;
    public final EObject ruleTimeSeries() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_startTime_6_0 = null;

        AntlrDatatypeRuleToken lv_endTime_9_0 = null;

        AntlrDatatypeRuleToken lv_period_12_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:948:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ')' otherlv_4= '{' otherlv_5= 'startTime' ( (lv_startTime_6_0= ruleEString ) ) otherlv_7= ';' otherlv_8= 'endTime' ( (lv_endTime_9_0= ruleEString ) ) otherlv_10= ';' otherlv_11= 'period' ( (lv_period_12_0= ruleEDouble ) ) otherlv_13= ';' otherlv_14= 'database' ( ( ruleEString ) ) otherlv_16= ';' otherlv_17= '}' ) )
            // InternalDsl.g:949:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ')' otherlv_4= '{' otherlv_5= 'startTime' ( (lv_startTime_6_0= ruleEString ) ) otherlv_7= ';' otherlv_8= 'endTime' ( (lv_endTime_9_0= ruleEString ) ) otherlv_10= ';' otherlv_11= 'period' ( (lv_period_12_0= ruleEDouble ) ) otherlv_13= ';' otherlv_14= 'database' ( ( ruleEString ) ) otherlv_16= ';' otherlv_17= '}' )
            {
            // InternalDsl.g:949:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ')' otherlv_4= '{' otherlv_5= 'startTime' ( (lv_startTime_6_0= ruleEString ) ) otherlv_7= ';' otherlv_8= 'endTime' ( (lv_endTime_9_0= ruleEString ) ) otherlv_10= ';' otherlv_11= 'period' ( (lv_period_12_0= ruleEDouble ) ) otherlv_13= ';' otherlv_14= 'database' ( ( ruleEString ) ) otherlv_16= ';' otherlv_17= '}' )
            // InternalDsl.g:950:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ')' otherlv_4= '{' otherlv_5= 'startTime' ( (lv_startTime_6_0= ruleEString ) ) otherlv_7= ';' otherlv_8= 'endTime' ( (lv_endTime_9_0= ruleEString ) ) otherlv_10= ';' otherlv_11= 'period' ( (lv_period_12_0= ruleEDouble ) ) otherlv_13= ';' otherlv_14= 'database' ( ( ruleEString ) ) otherlv_16= ';' otherlv_17= '}'
            {
            // InternalDsl.g:950:3: ( (lv_name_0_0= ruleEString ) )
            // InternalDsl.g:951:4: (lv_name_0_0= ruleEString )
            {
            // InternalDsl.g:951:4: (lv_name_0_0= ruleEString )
            // InternalDsl.g:952:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTimeSeriesAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeSeriesRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"fr.ubo.fast.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeSeriesAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDsl.g:973:3: ( ( ruleEString ) )
            // InternalDsl.g:974:4: ( ruleEString )
            {
            // InternalDsl.g:974:4: ( ruleEString )
            // InternalDsl.g:975:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeSeriesRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTimeSeriesAccess().getTimeSeriesMeasuredVariableMeasuredVariableCrossReference_2_0());
            				
            pushFollow(FOLLOW_24);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getTimeSeriesAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_4, grammarAccess.getTimeSeriesAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,30,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getTimeSeriesAccess().getStartTimeKeyword_5());
            		
            // InternalDsl.g:1001:3: ( (lv_startTime_6_0= ruleEString ) )
            // InternalDsl.g:1002:4: (lv_startTime_6_0= ruleEString )
            {
            // InternalDsl.g:1002:4: (lv_startTime_6_0= ruleEString )
            // InternalDsl.g:1003:5: lv_startTime_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTimeSeriesAccess().getStartTimeEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_startTime_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeSeriesRule());
            					}
            					set(
            						current,
            						"startTime",
            						lv_startTime_6_0,
            						"fr.ubo.fast.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_33); 

            			newLeafNode(otherlv_7, grammarAccess.getTimeSeriesAccess().getSemicolonKeyword_7());
            		
            otherlv_8=(Token)match(input,31,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getTimeSeriesAccess().getEndTimeKeyword_8());
            		
            // InternalDsl.g:1028:3: ( (lv_endTime_9_0= ruleEString ) )
            // InternalDsl.g:1029:4: (lv_endTime_9_0= ruleEString )
            {
            // InternalDsl.g:1029:4: (lv_endTime_9_0= ruleEString )
            // InternalDsl.g:1030:5: lv_endTime_9_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTimeSeriesAccess().getEndTimeEStringParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_7);
            lv_endTime_9_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeSeriesRule());
            					}
            					set(
            						current,
            						"endTime",
            						lv_endTime_9_0,
            						"fr.ubo.fast.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,13,FOLLOW_34); 

            			newLeafNode(otherlv_10, grammarAccess.getTimeSeriesAccess().getSemicolonKeyword_10());
            		
            otherlv_11=(Token)match(input,32,FOLLOW_28); 

            			newLeafNode(otherlv_11, grammarAccess.getTimeSeriesAccess().getPeriodKeyword_11());
            		
            // InternalDsl.g:1055:3: ( (lv_period_12_0= ruleEDouble ) )
            // InternalDsl.g:1056:4: (lv_period_12_0= ruleEDouble )
            {
            // InternalDsl.g:1056:4: (lv_period_12_0= ruleEDouble )
            // InternalDsl.g:1057:5: lv_period_12_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getTimeSeriesAccess().getPeriodEDoubleParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_7);
            lv_period_12_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeSeriesRule());
            					}
            					set(
            						current,
            						"period",
            						lv_period_12_0,
            						"fr.ubo.fast.dsl.Dsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,13,FOLLOW_35); 

            			newLeafNode(otherlv_13, grammarAccess.getTimeSeriesAccess().getSemicolonKeyword_13());
            		
            otherlv_14=(Token)match(input,33,FOLLOW_10); 

            			newLeafNode(otherlv_14, grammarAccess.getTimeSeriesAccess().getDatabaseKeyword_14());
            		
            // InternalDsl.g:1082:3: ( ( ruleEString ) )
            // InternalDsl.g:1083:4: ( ruleEString )
            {
            // InternalDsl.g:1083:4: ( ruleEString )
            // InternalDsl.g:1084:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeSeriesRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTimeSeriesAccess().getTimeSeriesDataSourceDataSourceCrossReference_15_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_16=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_16, grammarAccess.getTimeSeriesAccess().getSemicolonKeyword_16());
            		
            otherlv_17=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getTimeSeriesAccess().getRightCurlyBracketKeyword_17());
            		

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
    // $ANTLR end "ruleTimeSeries"


    // $ANTLR start "entryRuleSensor"
    // InternalDsl.g:1110:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalDsl.g:1110:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalDsl.g:1111:2: iv_ruleSensor= ruleSensor EOF
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
    // InternalDsl.g:1117:1: ruleSensor returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'measures' otherlv_2= '{' ( ( (lv_sensorMetaData_3_0= ruleMetaData ) ) otherlv_4= ';' ( ( (lv_sensorMetaData_5_0= ruleMetaData ) ) otherlv_6= ';' )* )? ( (lv_sensorMeasuredVariables_7_0= ruleMeasuredVariable ) ) otherlv_8= ';' ( ( (lv_sensorMeasuredVariables_9_0= ruleMeasuredVariable ) ) otherlv_10= ';' )* otherlv_11= '}' ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_sensorMetaData_3_0 = null;

        EObject lv_sensorMetaData_5_0 = null;

        EObject lv_sensorMeasuredVariables_7_0 = null;

        EObject lv_sensorMeasuredVariables_9_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1123:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'measures' otherlv_2= '{' ( ( (lv_sensorMetaData_3_0= ruleMetaData ) ) otherlv_4= ';' ( ( (lv_sensorMetaData_5_0= ruleMetaData ) ) otherlv_6= ';' )* )? ( (lv_sensorMeasuredVariables_7_0= ruleMeasuredVariable ) ) otherlv_8= ';' ( ( (lv_sensorMeasuredVariables_9_0= ruleMeasuredVariable ) ) otherlv_10= ';' )* otherlv_11= '}' ) )
            // InternalDsl.g:1124:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'measures' otherlv_2= '{' ( ( (lv_sensorMetaData_3_0= ruleMetaData ) ) otherlv_4= ';' ( ( (lv_sensorMetaData_5_0= ruleMetaData ) ) otherlv_6= ';' )* )? ( (lv_sensorMeasuredVariables_7_0= ruleMeasuredVariable ) ) otherlv_8= ';' ( ( (lv_sensorMeasuredVariables_9_0= ruleMeasuredVariable ) ) otherlv_10= ';' )* otherlv_11= '}' )
            {
            // InternalDsl.g:1124:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'measures' otherlv_2= '{' ( ( (lv_sensorMetaData_3_0= ruleMetaData ) ) otherlv_4= ';' ( ( (lv_sensorMetaData_5_0= ruleMetaData ) ) otherlv_6= ';' )* )? ( (lv_sensorMeasuredVariables_7_0= ruleMeasuredVariable ) ) otherlv_8= ';' ( ( (lv_sensorMeasuredVariables_9_0= ruleMeasuredVariable ) ) otherlv_10= ';' )* otherlv_11= '}' )
            // InternalDsl.g:1125:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'measures' otherlv_2= '{' ( ( (lv_sensorMetaData_3_0= ruleMetaData ) ) otherlv_4= ';' ( ( (lv_sensorMetaData_5_0= ruleMetaData ) ) otherlv_6= ';' )* )? ( (lv_sensorMeasuredVariables_7_0= ruleMeasuredVariable ) ) otherlv_8= ';' ( ( (lv_sensorMeasuredVariables_9_0= ruleMeasuredVariable ) ) otherlv_10= ';' )* otherlv_11= '}'
            {
            // InternalDsl.g:1125:3: ( (lv_name_0_0= ruleEString ) )
            // InternalDsl.g:1126:4: (lv_name_0_0= ruleEString )
            {
            // InternalDsl.g:1126:4: (lv_name_0_0= ruleEString )
            // InternalDsl.g:1127:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_36);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"fr.ubo.fast.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSensorAccess().getMeasuresKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:1152:3: ( ( (lv_sensorMetaData_3_0= ruleMetaData ) ) otherlv_4= ';' ( ( (lv_sensorMetaData_5_0= ruleMetaData ) ) otherlv_6= ';' )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==36) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:1153:4: ( (lv_sensorMetaData_3_0= ruleMetaData ) ) otherlv_4= ';' ( ( (lv_sensorMetaData_5_0= ruleMetaData ) ) otherlv_6= ';' )*
                    {
                    // InternalDsl.g:1153:4: ( (lv_sensorMetaData_3_0= ruleMetaData ) )
                    // InternalDsl.g:1154:5: (lv_sensorMetaData_3_0= ruleMetaData )
                    {
                    // InternalDsl.g:1154:5: (lv_sensorMetaData_3_0= ruleMetaData )
                    // InternalDsl.g:1155:6: lv_sensorMetaData_3_0= ruleMetaData
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getSensorMetaDataMetaDataParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_sensorMetaData_3_0=ruleMetaData();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						add(
                    							current,
                    							"sensorMetaData",
                    							lv_sensorMetaData_3_0,
                    							"fr.ubo.fast.dsl.Dsl.MetaData");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,13,FOLLOW_37); 

                    				newLeafNode(otherlv_4, grammarAccess.getSensorAccess().getSemicolonKeyword_3_1());
                    			
                    // InternalDsl.g:1176:4: ( ( (lv_sensorMetaData_5_0= ruleMetaData ) ) otherlv_6= ';' )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==36) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalDsl.g:1177:5: ( (lv_sensorMetaData_5_0= ruleMetaData ) ) otherlv_6= ';'
                    	    {
                    	    // InternalDsl.g:1177:5: ( (lv_sensorMetaData_5_0= ruleMetaData ) )
                    	    // InternalDsl.g:1178:6: (lv_sensorMetaData_5_0= ruleMetaData )
                    	    {
                    	    // InternalDsl.g:1178:6: (lv_sensorMetaData_5_0= ruleMetaData )
                    	    // InternalDsl.g:1179:7: lv_sensorMetaData_5_0= ruleMetaData
                    	    {

                    	    							newCompositeNode(grammarAccess.getSensorAccess().getSensorMetaDataMetaDataParserRuleCall_3_2_0_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_sensorMetaData_5_0=ruleMetaData();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSensorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"sensorMetaData",
                    	    								lv_sensorMetaData_5_0,
                    	    								"fr.ubo.fast.dsl.Dsl.MetaData");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_6=(Token)match(input,13,FOLLOW_37); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getSensorAccess().getSemicolonKeyword_3_2_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalDsl.g:1202:3: ( (lv_sensorMeasuredVariables_7_0= ruleMeasuredVariable ) )
            // InternalDsl.g:1203:4: (lv_sensorMeasuredVariables_7_0= ruleMeasuredVariable )
            {
            // InternalDsl.g:1203:4: (lv_sensorMeasuredVariables_7_0= ruleMeasuredVariable )
            // InternalDsl.g:1204:5: lv_sensorMeasuredVariables_7_0= ruleMeasuredVariable
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getSensorMeasuredVariablesMeasuredVariableParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_sensorMeasuredVariables_7_0=ruleMeasuredVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					add(
            						current,
            						"sensorMeasuredVariables",
            						lv_sensorMeasuredVariables_7_0,
            						"fr.ubo.fast.dsl.Dsl.MeasuredVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_38); 

            			newLeafNode(otherlv_8, grammarAccess.getSensorAccess().getSemicolonKeyword_5());
            		
            // InternalDsl.g:1225:3: ( ( (lv_sensorMeasuredVariables_9_0= ruleMeasuredVariable ) ) otherlv_10= ';' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:1226:4: ( (lv_sensorMeasuredVariables_9_0= ruleMeasuredVariable ) ) otherlv_10= ';'
            	    {
            	    // InternalDsl.g:1226:4: ( (lv_sensorMeasuredVariables_9_0= ruleMeasuredVariable ) )
            	    // InternalDsl.g:1227:5: (lv_sensorMeasuredVariables_9_0= ruleMeasuredVariable )
            	    {
            	    // InternalDsl.g:1227:5: (lv_sensorMeasuredVariables_9_0= ruleMeasuredVariable )
            	    // InternalDsl.g:1228:6: lv_sensorMeasuredVariables_9_0= ruleMeasuredVariable
            	    {

            	    						newCompositeNode(grammarAccess.getSensorAccess().getSensorMeasuredVariablesMeasuredVariableParserRuleCall_6_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_sensorMeasuredVariables_9_0=ruleMeasuredVariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSensorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sensorMeasuredVariables",
            	    							lv_sensorMeasuredVariables_9_0,
            	    							"fr.ubo.fast.dsl.Dsl.MeasuredVariable");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_10=(Token)match(input,13,FOLLOW_38); 

            	    				newLeafNode(otherlv_10, grammarAccess.getSensorAccess().getSemicolonKeyword_6_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleMeasuredVariable"
    // InternalDsl.g:1258:1: entryRuleMeasuredVariable returns [EObject current=null] : iv_ruleMeasuredVariable= ruleMeasuredVariable EOF ;
    public final EObject entryRuleMeasuredVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasuredVariable = null;


        try {
            // InternalDsl.g:1258:57: (iv_ruleMeasuredVariable= ruleMeasuredVariable EOF )
            // InternalDsl.g:1259:2: iv_ruleMeasuredVariable= ruleMeasuredVariable EOF
            {
             newCompositeNode(grammarAccess.getMeasuredVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasuredVariable=ruleMeasuredVariable();

            state._fsp--;

             current =iv_ruleMeasuredVariable; 
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
    // $ANTLR end "entryRuleMeasuredVariable"


    // $ANTLR start "ruleMeasuredVariable"
    // InternalDsl.g:1265:1: ruleMeasuredVariable returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'in' ( (lv_unit_2_0= ruleMeasurementDataUnit ) ) (otherlv_3= '{' ( (lv_measuredVariableMetaData_4_0= ruleMetaData ) ) otherlv_5= ';' ( ( (lv_measuredVariableMetaData_6_0= ruleMetaData ) ) otherlv_7= ';' )* otherlv_8= '}' )? ) ;
    public final EObject ruleMeasuredVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        Enumerator lv_unit_2_0 = null;

        EObject lv_measuredVariableMetaData_4_0 = null;

        EObject lv_measuredVariableMetaData_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1271:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'in' ( (lv_unit_2_0= ruleMeasurementDataUnit ) ) (otherlv_3= '{' ( (lv_measuredVariableMetaData_4_0= ruleMetaData ) ) otherlv_5= ';' ( ( (lv_measuredVariableMetaData_6_0= ruleMetaData ) ) otherlv_7= ';' )* otherlv_8= '}' )? ) )
            // InternalDsl.g:1272:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'in' ( (lv_unit_2_0= ruleMeasurementDataUnit ) ) (otherlv_3= '{' ( (lv_measuredVariableMetaData_4_0= ruleMetaData ) ) otherlv_5= ';' ( ( (lv_measuredVariableMetaData_6_0= ruleMetaData ) ) otherlv_7= ';' )* otherlv_8= '}' )? )
            {
            // InternalDsl.g:1272:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'in' ( (lv_unit_2_0= ruleMeasurementDataUnit ) ) (otherlv_3= '{' ( (lv_measuredVariableMetaData_4_0= ruleMetaData ) ) otherlv_5= ';' ( ( (lv_measuredVariableMetaData_6_0= ruleMetaData ) ) otherlv_7= ';' )* otherlv_8= '}' )? )
            // InternalDsl.g:1273:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'in' ( (lv_unit_2_0= ruleMeasurementDataUnit ) ) (otherlv_3= '{' ( (lv_measuredVariableMetaData_4_0= ruleMetaData ) ) otherlv_5= ';' ( ( (lv_measuredVariableMetaData_6_0= ruleMetaData ) ) otherlv_7= ';' )* otherlv_8= '}' )?
            {
            // InternalDsl.g:1273:3: ( (lv_name_0_0= ruleEString ) )
            // InternalDsl.g:1274:4: (lv_name_0_0= ruleEString )
            {
            // InternalDsl.g:1274:4: (lv_name_0_0= ruleEString )
            // InternalDsl.g:1275:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasuredVariableAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_39);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasuredVariableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"fr.ubo.fast.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getMeasuredVariableAccess().getInKeyword_1());
            		
            // InternalDsl.g:1296:3: ( (lv_unit_2_0= ruleMeasurementDataUnit ) )
            // InternalDsl.g:1297:4: (lv_unit_2_0= ruleMeasurementDataUnit )
            {
            // InternalDsl.g:1297:4: (lv_unit_2_0= ruleMeasurementDataUnit )
            // InternalDsl.g:1298:5: lv_unit_2_0= ruleMeasurementDataUnit
            {

            					newCompositeNode(grammarAccess.getMeasuredVariableAccess().getUnitMeasurementDataUnitEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_41);
            lv_unit_2_0=ruleMeasurementDataUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasuredVariableRule());
            					}
            					set(
            						current,
            						"unit",
            						lv_unit_2_0,
            						"fr.ubo.fast.dsl.Dsl.MeasurementDataUnit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:1315:3: (otherlv_3= '{' ( (lv_measuredVariableMetaData_4_0= ruleMetaData ) ) otherlv_5= ';' ( ( (lv_measuredVariableMetaData_6_0= ruleMetaData ) ) otherlv_7= ';' )* otherlv_8= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==12) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:1316:4: otherlv_3= '{' ( (lv_measuredVariableMetaData_4_0= ruleMetaData ) ) otherlv_5= ';' ( ( (lv_measuredVariableMetaData_6_0= ruleMetaData ) ) otherlv_7= ';' )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_42); 

                    				newLeafNode(otherlv_3, grammarAccess.getMeasuredVariableAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalDsl.g:1320:4: ( (lv_measuredVariableMetaData_4_0= ruleMetaData ) )
                    // InternalDsl.g:1321:5: (lv_measuredVariableMetaData_4_0= ruleMetaData )
                    {
                    // InternalDsl.g:1321:5: (lv_measuredVariableMetaData_4_0= ruleMetaData )
                    // InternalDsl.g:1322:6: lv_measuredVariableMetaData_4_0= ruleMetaData
                    {

                    						newCompositeNode(grammarAccess.getMeasuredVariableAccess().getMeasuredVariableMetaDataMetaDataParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_measuredVariableMetaData_4_0=ruleMetaData();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasuredVariableRule());
                    						}
                    						add(
                    							current,
                    							"measuredVariableMetaData",
                    							lv_measuredVariableMetaData_4_0,
                    							"fr.ubo.fast.dsl.Dsl.MetaData");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,13,FOLLOW_43); 

                    				newLeafNode(otherlv_5, grammarAccess.getMeasuredVariableAccess().getSemicolonKeyword_3_2());
                    			
                    // InternalDsl.g:1343:4: ( ( (lv_measuredVariableMetaData_6_0= ruleMetaData ) ) otherlv_7= ';' )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==36) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalDsl.g:1344:5: ( (lv_measuredVariableMetaData_6_0= ruleMetaData ) ) otherlv_7= ';'
                    	    {
                    	    // InternalDsl.g:1344:5: ( (lv_measuredVariableMetaData_6_0= ruleMetaData ) )
                    	    // InternalDsl.g:1345:6: (lv_measuredVariableMetaData_6_0= ruleMetaData )
                    	    {
                    	    // InternalDsl.g:1345:6: (lv_measuredVariableMetaData_6_0= ruleMetaData )
                    	    // InternalDsl.g:1346:7: lv_measuredVariableMetaData_6_0= ruleMetaData
                    	    {

                    	    							newCompositeNode(grammarAccess.getMeasuredVariableAccess().getMeasuredVariableMetaDataMetaDataParserRuleCall_3_3_0_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_measuredVariableMetaData_6_0=ruleMetaData();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMeasuredVariableRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"measuredVariableMetaData",
                    	    								lv_measuredVariableMetaData_6_0,
                    	    								"fr.ubo.fast.dsl.Dsl.MetaData");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_7=(Token)match(input,13,FOLLOW_43); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getMeasuredVariableAccess().getSemicolonKeyword_3_3_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getMeasuredVariableAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleMeasuredVariable"


    // $ANTLR start "entryRuleMetaData"
    // InternalDsl.g:1377:1: entryRuleMetaData returns [EObject current=null] : iv_ruleMetaData= ruleMetaData EOF ;
    public final EObject entryRuleMetaData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaData = null;


        try {
            // InternalDsl.g:1377:49: (iv_ruleMetaData= ruleMetaData EOF )
            // InternalDsl.g:1378:2: iv_ruleMetaData= ruleMetaData EOF
            {
             newCompositeNode(grammarAccess.getMetaDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetaData=ruleMetaData();

            state._fsp--;

             current =iv_ruleMetaData; 
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
    // $ANTLR end "entryRuleMetaData"


    // $ANTLR start "ruleMetaData"
    // InternalDsl.g:1384:1: ruleMetaData returns [EObject current=null] : (otherlv_0= 'metadata' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_value_3_0= ruleEString ) ) otherlv_4= ')' ) ;
    public final EObject ruleMetaData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1390:2: ( (otherlv_0= 'metadata' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_value_3_0= ruleEString ) ) otherlv_4= ')' ) )
            // InternalDsl.g:1391:2: (otherlv_0= 'metadata' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_value_3_0= ruleEString ) ) otherlv_4= ')' )
            {
            // InternalDsl.g:1391:2: (otherlv_0= 'metadata' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_value_3_0= ruleEString ) ) otherlv_4= ')' )
            // InternalDsl.g:1392:3: otherlv_0= 'metadata' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_value_3_0= ruleEString ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getMetaDataAccess().getMetadataKeyword_0());
            		
            // InternalDsl.g:1396:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:1397:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:1397:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:1398:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMetaDataAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMetaDataRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.ubo.fast.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getMetaDataAccess().getLeftParenthesisKeyword_2());
            		
            // InternalDsl.g:1419:3: ( (lv_value_3_0= ruleEString ) )
            // InternalDsl.g:1420:4: (lv_value_3_0= ruleEString )
            {
            // InternalDsl.g:1420:4: (lv_value_3_0= ruleEString )
            // InternalDsl.g:1421:5: lv_value_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMetaDataAccess().getValueEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
            lv_value_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMetaDataRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"fr.ubo.fast.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMetaDataAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleMetaData"


    // $ANTLR start "entryRuleDatabase"
    // InternalDsl.g:1446:1: entryRuleDatabase returns [EObject current=null] : iv_ruleDatabase= ruleDatabase EOF ;
    public final EObject entryRuleDatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabase = null;


        try {
            // InternalDsl.g:1446:49: (iv_ruleDatabase= ruleDatabase EOF )
            // InternalDsl.g:1447:2: iv_ruleDatabase= ruleDatabase EOF
            {
             newCompositeNode(grammarAccess.getDatabaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatabase=ruleDatabase();

            state._fsp--;

             current =iv_ruleDatabase; 
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
    // $ANTLR end "entryRuleDatabase"


    // $ANTLR start "ruleDatabase"
    // InternalDsl.g:1453:1: ruleDatabase returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( (lv_dbms_2_0= ruleDatabaseType ) ) otherlv_3= ',' ( (lv_port_4_0= ruleEInt ) ) otherlv_5= ',' ( (lv_username_6_0= ruleEString ) ) otherlv_7= ',' ( (lv_password_8_0= ruleEString ) ) otherlv_9= ',' ( (lv_dataDirectory_10_0= ruleEString ) ) otherlv_11= ')' ) ;
    public final EObject ruleDatabase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        Enumerator lv_dbms_2_0 = null;

        AntlrDatatypeRuleToken lv_port_4_0 = null;

        AntlrDatatypeRuleToken lv_username_6_0 = null;

        AntlrDatatypeRuleToken lv_password_8_0 = null;

        AntlrDatatypeRuleToken lv_dataDirectory_10_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1459:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( (lv_dbms_2_0= ruleDatabaseType ) ) otherlv_3= ',' ( (lv_port_4_0= ruleEInt ) ) otherlv_5= ',' ( (lv_username_6_0= ruleEString ) ) otherlv_7= ',' ( (lv_password_8_0= ruleEString ) ) otherlv_9= ',' ( (lv_dataDirectory_10_0= ruleEString ) ) otherlv_11= ')' ) )
            // InternalDsl.g:1460:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( (lv_dbms_2_0= ruleDatabaseType ) ) otherlv_3= ',' ( (lv_port_4_0= ruleEInt ) ) otherlv_5= ',' ( (lv_username_6_0= ruleEString ) ) otherlv_7= ',' ( (lv_password_8_0= ruleEString ) ) otherlv_9= ',' ( (lv_dataDirectory_10_0= ruleEString ) ) otherlv_11= ')' )
            {
            // InternalDsl.g:1460:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( (lv_dbms_2_0= ruleDatabaseType ) ) otherlv_3= ',' ( (lv_port_4_0= ruleEInt ) ) otherlv_5= ',' ( (lv_username_6_0= ruleEString ) ) otherlv_7= ',' ( (lv_password_8_0= ruleEString ) ) otherlv_9= ',' ( (lv_dataDirectory_10_0= ruleEString ) ) otherlv_11= ')' )
            // InternalDsl.g:1461:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( (lv_dbms_2_0= ruleDatabaseType ) ) otherlv_3= ',' ( (lv_port_4_0= ruleEInt ) ) otherlv_5= ',' ( (lv_username_6_0= ruleEString ) ) otherlv_7= ',' ( (lv_password_8_0= ruleEString ) ) otherlv_9= ',' ( (lv_dataDirectory_10_0= ruleEString ) ) otherlv_11= ')'
            {
            // InternalDsl.g:1461:3: ( (lv_name_0_0= ruleEString ) )
            // InternalDsl.g:1462:4: (lv_name_0_0= ruleEString )
            {
            // InternalDsl.g:1462:4: (lv_name_0_0= ruleEString )
            // InternalDsl.g:1463:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDatabaseAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatabaseRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"fr.ubo.fast.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getDatabaseAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDsl.g:1484:3: ( (lv_dbms_2_0= ruleDatabaseType ) )
            // InternalDsl.g:1485:4: (lv_dbms_2_0= ruleDatabaseType )
            {
            // InternalDsl.g:1485:4: (lv_dbms_2_0= ruleDatabaseType )
            // InternalDsl.g:1486:5: lv_dbms_2_0= ruleDatabaseType
            {

            					newCompositeNode(grammarAccess.getDatabaseAccess().getDbmsDatabaseTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_dbms_2_0=ruleDatabaseType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatabaseRule());
            					}
            					set(
            						current,
            						"dbms",
            						lv_dbms_2_0,
            						"fr.ubo.fast.dsl.Dsl.DatabaseType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getDatabaseAccess().getCommaKeyword_3());
            		
            // InternalDsl.g:1507:3: ( (lv_port_4_0= ruleEInt ) )
            // InternalDsl.g:1508:4: (lv_port_4_0= ruleEInt )
            {
            // InternalDsl.g:1508:4: (lv_port_4_0= ruleEInt )
            // InternalDsl.g:1509:5: lv_port_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getDatabaseAccess().getPortEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
            lv_port_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatabaseRule());
            					}
            					set(
            						current,
            						"port",
            						lv_port_4_0,
            						"fr.ubo.fast.dsl.Dsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getDatabaseAccess().getCommaKeyword_5());
            		
            // InternalDsl.g:1530:3: ( (lv_username_6_0= ruleEString ) )
            // InternalDsl.g:1531:4: (lv_username_6_0= ruleEString )
            {
            // InternalDsl.g:1531:4: (lv_username_6_0= ruleEString )
            // InternalDsl.g:1532:5: lv_username_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDatabaseAccess().getUsernameEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_22);
            lv_username_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatabaseRule());
            					}
            					set(
            						current,
            						"username",
            						lv_username_6_0,
            						"fr.ubo.fast.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getDatabaseAccess().getCommaKeyword_7());
            		
            // InternalDsl.g:1553:3: ( (lv_password_8_0= ruleEString ) )
            // InternalDsl.g:1554:4: (lv_password_8_0= ruleEString )
            {
            // InternalDsl.g:1554:4: (lv_password_8_0= ruleEString )
            // InternalDsl.g:1555:5: lv_password_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDatabaseAccess().getPasswordEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_22);
            lv_password_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatabaseRule());
            					}
            					set(
            						current,
            						"password",
            						lv_password_8_0,
            						"fr.ubo.fast.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getDatabaseAccess().getCommaKeyword_9());
            		
            // InternalDsl.g:1576:3: ( (lv_dataDirectory_10_0= ruleEString ) )
            // InternalDsl.g:1577:4: (lv_dataDirectory_10_0= ruleEString )
            {
            // InternalDsl.g:1577:4: (lv_dataDirectory_10_0= ruleEString )
            // InternalDsl.g:1578:5: lv_dataDirectory_10_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDatabaseAccess().getDataDirectoryEStringParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_24);
            lv_dataDirectory_10_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatabaseRule());
            					}
            					set(
            						current,
            						"dataDirectory",
            						lv_dataDirectory_10_0,
            						"fr.ubo.fast.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getDatabaseAccess().getRightParenthesisKeyword_11());
            		

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
    // $ANTLR end "ruleDatabase"


    // $ANTLR start "entryRuleFile"
    // InternalDsl.g:1603:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // InternalDsl.g:1603:45: (iv_ruleFile= ruleFile EOF )
            // InternalDsl.g:1604:2: iv_ruleFile= ruleFile EOF
            {
             newCompositeNode(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFile=ruleFile();

            state._fsp--;

             current =iv_ruleFile; 
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
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // InternalDsl.g:1610:1: ruleFile returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( (lv_path_2_0= ruleEString ) ) otherlv_3= ')' ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_path_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1616:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( (lv_path_2_0= ruleEString ) ) otherlv_3= ')' ) )
            // InternalDsl.g:1617:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( (lv_path_2_0= ruleEString ) ) otherlv_3= ')' )
            {
            // InternalDsl.g:1617:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( (lv_path_2_0= ruleEString ) ) otherlv_3= ')' )
            // InternalDsl.g:1618:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( (lv_path_2_0= ruleEString ) ) otherlv_3= ')'
            {
            // InternalDsl.g:1618:3: ( (lv_name_0_0= ruleEString ) )
            // InternalDsl.g:1619:4: (lv_name_0_0= ruleEString )
            {
            // InternalDsl.g:1619:4: (lv_name_0_0= ruleEString )
            // InternalDsl.g:1620:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFileAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFileRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"fr.ubo.fast.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getFileAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDsl.g:1641:3: ( (lv_path_2_0= ruleEString ) )
            // InternalDsl.g:1642:4: (lv_path_2_0= ruleEString )
            {
            // InternalDsl.g:1642:4: (lv_path_2_0= ruleEString )
            // InternalDsl.g:1643:5: lv_path_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFileAccess().getPathEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_path_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFileRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_2_0,
            						"fr.ubo.fast.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFileAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleComputer"
    // InternalDsl.g:1668:1: entryRuleComputer returns [EObject current=null] : iv_ruleComputer= ruleComputer EOF ;
    public final EObject entryRuleComputer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputer = null;


        try {
            // InternalDsl.g:1668:49: (iv_ruleComputer= ruleComputer EOF )
            // InternalDsl.g:1669:2: iv_ruleComputer= ruleComputer EOF
            {
             newCompositeNode(grammarAccess.getComputerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComputer=ruleComputer();

            state._fsp--;

             current =iv_ruleComputer; 
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
    // $ANTLR end "entryRuleComputer"


    // $ANTLR start "ruleComputer"
    // InternalDsl.g:1675:1: ruleComputer returns [EObject current=null] : (otherlv_0= 'Computer' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_os_3_0= ruleOSType ) ) otherlv_4= ',' ( (lv_ramMemory_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_storageMemory_7_0= ruleEInt ) ) otherlv_8= ',' ( (lv_cpuNumber_9_0= ruleEInt ) ) otherlv_10= '-' ( (lv_cpuCoresNumber_11_0= ruleEInt ) ) otherlv_12= ',' ( (lv_cpuFrequency_13_0= ruleEInt ) ) otherlv_14= ',' ( (lv_username_15_0= ruleEString ) ) otherlv_16= ',' ( (lv_password_17_0= ruleEString ) ) otherlv_18= ')' otherlv_19= '{' otherlv_20= 'networkInterfaces' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_23= ';' ( ( (lv_computerServices_24_0= ruleService ) ) otherlv_25= ';' ( ( (lv_computerServices_26_0= ruleService ) ) otherlv_27= ';' )* )? ( ( (lv_deployment_28_0= ruleDockerDeployment ) ) otherlv_29= ';' )? otherlv_30= '}' ) ;
    public final EObject ruleComputer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_os_3_0 = null;

        AntlrDatatypeRuleToken lv_ramMemory_5_0 = null;

        AntlrDatatypeRuleToken lv_storageMemory_7_0 = null;

        AntlrDatatypeRuleToken lv_cpuNumber_9_0 = null;

        AntlrDatatypeRuleToken lv_cpuCoresNumber_11_0 = null;

        AntlrDatatypeRuleToken lv_cpuFrequency_13_0 = null;

        AntlrDatatypeRuleToken lv_username_15_0 = null;

        AntlrDatatypeRuleToken lv_password_17_0 = null;

        EObject lv_computerServices_24_0 = null;

        EObject lv_computerServices_26_0 = null;

        EObject lv_deployment_28_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1681:2: ( (otherlv_0= 'Computer' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_os_3_0= ruleOSType ) ) otherlv_4= ',' ( (lv_ramMemory_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_storageMemory_7_0= ruleEInt ) ) otherlv_8= ',' ( (lv_cpuNumber_9_0= ruleEInt ) ) otherlv_10= '-' ( (lv_cpuCoresNumber_11_0= ruleEInt ) ) otherlv_12= ',' ( (lv_cpuFrequency_13_0= ruleEInt ) ) otherlv_14= ',' ( (lv_username_15_0= ruleEString ) ) otherlv_16= ',' ( (lv_password_17_0= ruleEString ) ) otherlv_18= ')' otherlv_19= '{' otherlv_20= 'networkInterfaces' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_23= ';' ( ( (lv_computerServices_24_0= ruleService ) ) otherlv_25= ';' ( ( (lv_computerServices_26_0= ruleService ) ) otherlv_27= ';' )* )? ( ( (lv_deployment_28_0= ruleDockerDeployment ) ) otherlv_29= ';' )? otherlv_30= '}' ) )
            // InternalDsl.g:1682:2: (otherlv_0= 'Computer' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_os_3_0= ruleOSType ) ) otherlv_4= ',' ( (lv_ramMemory_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_storageMemory_7_0= ruleEInt ) ) otherlv_8= ',' ( (lv_cpuNumber_9_0= ruleEInt ) ) otherlv_10= '-' ( (lv_cpuCoresNumber_11_0= ruleEInt ) ) otherlv_12= ',' ( (lv_cpuFrequency_13_0= ruleEInt ) ) otherlv_14= ',' ( (lv_username_15_0= ruleEString ) ) otherlv_16= ',' ( (lv_password_17_0= ruleEString ) ) otherlv_18= ')' otherlv_19= '{' otherlv_20= 'networkInterfaces' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_23= ';' ( ( (lv_computerServices_24_0= ruleService ) ) otherlv_25= ';' ( ( (lv_computerServices_26_0= ruleService ) ) otherlv_27= ';' )* )? ( ( (lv_deployment_28_0= ruleDockerDeployment ) ) otherlv_29= ';' )? otherlv_30= '}' )
            {
            // InternalDsl.g:1682:2: (otherlv_0= 'Computer' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_os_3_0= ruleOSType ) ) otherlv_4= ',' ( (lv_ramMemory_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_storageMemory_7_0= ruleEInt ) ) otherlv_8= ',' ( (lv_cpuNumber_9_0= ruleEInt ) ) otherlv_10= '-' ( (lv_cpuCoresNumber_11_0= ruleEInt ) ) otherlv_12= ',' ( (lv_cpuFrequency_13_0= ruleEInt ) ) otherlv_14= ',' ( (lv_username_15_0= ruleEString ) ) otherlv_16= ',' ( (lv_password_17_0= ruleEString ) ) otherlv_18= ')' otherlv_19= '{' otherlv_20= 'networkInterfaces' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_23= ';' ( ( (lv_computerServices_24_0= ruleService ) ) otherlv_25= ';' ( ( (lv_computerServices_26_0= ruleService ) ) otherlv_27= ';' )* )? ( ( (lv_deployment_28_0= ruleDockerDeployment ) ) otherlv_29= ';' )? otherlv_30= '}' )
            // InternalDsl.g:1683:3: otherlv_0= 'Computer' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_os_3_0= ruleOSType ) ) otherlv_4= ',' ( (lv_ramMemory_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_storageMemory_7_0= ruleEInt ) ) otherlv_8= ',' ( (lv_cpuNumber_9_0= ruleEInt ) ) otherlv_10= '-' ( (lv_cpuCoresNumber_11_0= ruleEInt ) ) otherlv_12= ',' ( (lv_cpuFrequency_13_0= ruleEInt ) ) otherlv_14= ',' ( (lv_username_15_0= ruleEString ) ) otherlv_16= ',' ( (lv_password_17_0= ruleEString ) ) otherlv_18= ')' otherlv_19= '{' otherlv_20= 'networkInterfaces' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_23= ';' ( ( (lv_computerServices_24_0= ruleService ) ) otherlv_25= ';' ( ( (lv_computerServices_26_0= ruleService ) ) otherlv_27= ';' )* )? ( ( (lv_deployment_28_0= ruleDockerDeployment ) ) otherlv_29= ';' )? otherlv_30= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getComputerAccess().getComputerKeyword_0());
            		
            // InternalDsl.g:1687:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:1688:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:1688:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:1689:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComputerAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComputerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.ubo.fast.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getComputerAccess().getLeftParenthesisKeyword_2());
            		
            // InternalDsl.g:1710:3: ( (lv_os_3_0= ruleOSType ) )
            // InternalDsl.g:1711:4: (lv_os_3_0= ruleOSType )
            {
            // InternalDsl.g:1711:4: (lv_os_3_0= ruleOSType )
            // InternalDsl.g:1712:5: lv_os_3_0= ruleOSType
            {

            					newCompositeNode(grammarAccess.getComputerAccess().getOsOSTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_os_3_0=ruleOSType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComputerRule());
            					}
            					set(
            						current,
            						"os",
            						lv_os_3_0,
            						"fr.ubo.fast.dsl.Dsl.OSType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getComputerAccess().getCommaKeyword_4());
            		
            // InternalDsl.g:1733:3: ( (lv_ramMemory_5_0= ruleEInt ) )
            // InternalDsl.g:1734:4: (lv_ramMemory_5_0= ruleEInt )
            {
            // InternalDsl.g:1734:4: (lv_ramMemory_5_0= ruleEInt )
            // InternalDsl.g:1735:5: lv_ramMemory_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getComputerAccess().getRamMemoryEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_22);
            lv_ramMemory_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComputerRule());
            					}
            					set(
            						current,
            						"ramMemory",
            						lv_ramMemory_5_0,
            						"fr.ubo.fast.dsl.Dsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_23); 

            			newLeafNode(otherlv_6, grammarAccess.getComputerAccess().getCommaKeyword_6());
            		
            // InternalDsl.g:1756:3: ( (lv_storageMemory_7_0= ruleEInt ) )
            // InternalDsl.g:1757:4: (lv_storageMemory_7_0= ruleEInt )
            {
            // InternalDsl.g:1757:4: (lv_storageMemory_7_0= ruleEInt )
            // InternalDsl.g:1758:5: lv_storageMemory_7_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getComputerAccess().getStorageMemoryEIntParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_22);
            lv_storageMemory_7_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComputerRule());
            					}
            					set(
            						current,
            						"storageMemory",
            						lv_storageMemory_7_0,
            						"fr.ubo.fast.dsl.Dsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,24,FOLLOW_23); 

            			newLeafNode(otherlv_8, grammarAccess.getComputerAccess().getCommaKeyword_8());
            		
            // InternalDsl.g:1779:3: ( (lv_cpuNumber_9_0= ruleEInt ) )
            // InternalDsl.g:1780:4: (lv_cpuNumber_9_0= ruleEInt )
            {
            // InternalDsl.g:1780:4: (lv_cpuNumber_9_0= ruleEInt )
            // InternalDsl.g:1781:5: lv_cpuNumber_9_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getComputerAccess().getCpuNumberEIntParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_46);
            lv_cpuNumber_9_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComputerRule());
            					}
            					set(
            						current,
            						"cpuNumber",
            						lv_cpuNumber_9_0,
            						"fr.ubo.fast.dsl.Dsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,38,FOLLOW_23); 

            			newLeafNode(otherlv_10, grammarAccess.getComputerAccess().getHyphenMinusKeyword_10());
            		
            // InternalDsl.g:1802:3: ( (lv_cpuCoresNumber_11_0= ruleEInt ) )
            // InternalDsl.g:1803:4: (lv_cpuCoresNumber_11_0= ruleEInt )
            {
            // InternalDsl.g:1803:4: (lv_cpuCoresNumber_11_0= ruleEInt )
            // InternalDsl.g:1804:5: lv_cpuCoresNumber_11_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getComputerAccess().getCpuCoresNumberEIntParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_22);
            lv_cpuCoresNumber_11_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComputerRule());
            					}
            					set(
            						current,
            						"cpuCoresNumber",
            						lv_cpuCoresNumber_11_0,
            						"fr.ubo.fast.dsl.Dsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,24,FOLLOW_23); 

            			newLeafNode(otherlv_12, grammarAccess.getComputerAccess().getCommaKeyword_12());
            		
            // InternalDsl.g:1825:3: ( (lv_cpuFrequency_13_0= ruleEInt ) )
            // InternalDsl.g:1826:4: (lv_cpuFrequency_13_0= ruleEInt )
            {
            // InternalDsl.g:1826:4: (lv_cpuFrequency_13_0= ruleEInt )
            // InternalDsl.g:1827:5: lv_cpuFrequency_13_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getComputerAccess().getCpuFrequencyEIntParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_22);
            lv_cpuFrequency_13_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComputerRule());
            					}
            					set(
            						current,
            						"cpuFrequency",
            						lv_cpuFrequency_13_0,
            						"fr.ubo.fast.dsl.Dsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_14, grammarAccess.getComputerAccess().getCommaKeyword_14());
            		
            // InternalDsl.g:1848:3: ( (lv_username_15_0= ruleEString ) )
            // InternalDsl.g:1849:4: (lv_username_15_0= ruleEString )
            {
            // InternalDsl.g:1849:4: (lv_username_15_0= ruleEString )
            // InternalDsl.g:1850:5: lv_username_15_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComputerAccess().getUsernameEStringParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_22);
            lv_username_15_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComputerRule());
            					}
            					set(
            						current,
            						"username",
            						lv_username_15_0,
            						"fr.ubo.fast.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_16=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_16, grammarAccess.getComputerAccess().getCommaKeyword_16());
            		
            // InternalDsl.g:1871:3: ( (lv_password_17_0= ruleEString ) )
            // InternalDsl.g:1872:4: (lv_password_17_0= ruleEString )
            {
            // InternalDsl.g:1872:4: (lv_password_17_0= ruleEString )
            // InternalDsl.g:1873:5: lv_password_17_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComputerAccess().getPasswordEStringParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_24);
            lv_password_17_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComputerRule());
            					}
            					set(
            						current,
            						"password",
            						lv_password_17_0,
            						"fr.ubo.fast.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_18=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_18, grammarAccess.getComputerAccess().getRightParenthesisKeyword_18());
            		
            otherlv_19=(Token)match(input,12,FOLLOW_47); 

            			newLeafNode(otherlv_19, grammarAccess.getComputerAccess().getLeftCurlyBracketKeyword_19());
            		
            otherlv_20=(Token)match(input,39,FOLLOW_10); 

            			newLeafNode(otherlv_20, grammarAccess.getComputerAccess().getNetworkInterfacesKeyword_20());
            		
            // InternalDsl.g:1902:3: ( ( ruleEString ) )
            // InternalDsl.g:1903:4: ( ruleEString )
            {
            // InternalDsl.g:1903:4: ( ruleEString )
            // InternalDsl.g:1904:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComputerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComputerAccess().getComputerNetworkInterfacesNetworkInterfaceCrossReference_21_0());
            				
            pushFollow(FOLLOW_48);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:1918:3: ( ( ruleEString ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDsl.g:1919:4: ( ruleEString )
            	    {
            	    // InternalDsl.g:1919:4: ( ruleEString )
            	    // InternalDsl.g:1920:5: ruleEString
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getComputerRule());
            	    					}
            	    				

            	    					newCompositeNode(grammarAccess.getComputerAccess().getComputerNetworkInterfacesNetworkInterfaceCrossReference_22_0());
            	    				
            	    pushFollow(FOLLOW_48);
            	    ruleEString();

            	    state._fsp--;


            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_23=(Token)match(input,13,FOLLOW_49); 

            			newLeafNode(otherlv_23, grammarAccess.getComputerAccess().getSemicolonKeyword_23());
            		
            // InternalDsl.g:1938:3: ( ( (lv_computerServices_24_0= ruleService ) ) otherlv_25= ';' ( ( (lv_computerServices_26_0= ruleService ) ) otherlv_27= ';' )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_ID)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDsl.g:1939:4: ( (lv_computerServices_24_0= ruleService ) ) otherlv_25= ';' ( ( (lv_computerServices_26_0= ruleService ) ) otherlv_27= ';' )*
                    {
                    // InternalDsl.g:1939:4: ( (lv_computerServices_24_0= ruleService ) )
                    // InternalDsl.g:1940:5: (lv_computerServices_24_0= ruleService )
                    {
                    // InternalDsl.g:1940:5: (lv_computerServices_24_0= ruleService )
                    // InternalDsl.g:1941:6: lv_computerServices_24_0= ruleService
                    {

                    						newCompositeNode(grammarAccess.getComputerAccess().getComputerServicesServiceParserRuleCall_24_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_computerServices_24_0=ruleService();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComputerRule());
                    						}
                    						add(
                    							current,
                    							"computerServices",
                    							lv_computerServices_24_0,
                    							"fr.ubo.fast.dsl.Dsl.Service");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_25=(Token)match(input,13,FOLLOW_49); 

                    				newLeafNode(otherlv_25, grammarAccess.getComputerAccess().getSemicolonKeyword_24_1());
                    			
                    // InternalDsl.g:1962:4: ( ( (lv_computerServices_26_0= ruleService ) ) otherlv_27= ';' )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalDsl.g:1963:5: ( (lv_computerServices_26_0= ruleService ) ) otherlv_27= ';'
                    	    {
                    	    // InternalDsl.g:1963:5: ( (lv_computerServices_26_0= ruleService ) )
                    	    // InternalDsl.g:1964:6: (lv_computerServices_26_0= ruleService )
                    	    {
                    	    // InternalDsl.g:1964:6: (lv_computerServices_26_0= ruleService )
                    	    // InternalDsl.g:1965:7: lv_computerServices_26_0= ruleService
                    	    {

                    	    							newCompositeNode(grammarAccess.getComputerAccess().getComputerServicesServiceParserRuleCall_24_2_0_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_computerServices_26_0=ruleService();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComputerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"computerServices",
                    	    								lv_computerServices_26_0,
                    	    								"fr.ubo.fast.dsl.Dsl.Service");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_27=(Token)match(input,13,FOLLOW_49); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getComputerAccess().getSemicolonKeyword_24_2_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalDsl.g:1988:3: ( ( (lv_deployment_28_0= ruleDockerDeployment ) ) otherlv_29= ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==40) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDsl.g:1989:4: ( (lv_deployment_28_0= ruleDockerDeployment ) ) otherlv_29= ';'
                    {
                    // InternalDsl.g:1989:4: ( (lv_deployment_28_0= ruleDockerDeployment ) )
                    // InternalDsl.g:1990:5: (lv_deployment_28_0= ruleDockerDeployment )
                    {
                    // InternalDsl.g:1990:5: (lv_deployment_28_0= ruleDockerDeployment )
                    // InternalDsl.g:1991:6: lv_deployment_28_0= ruleDockerDeployment
                    {

                    						newCompositeNode(grammarAccess.getComputerAccess().getDeploymentDockerDeploymentParserRuleCall_25_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_deployment_28_0=ruleDockerDeployment();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComputerRule());
                    						}
                    						set(
                    							current,
                    							"deployment",
                    							lv_deployment_28_0,
                    							"fr.ubo.fast.dsl.Dsl.DockerDeployment");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_29=(Token)match(input,13,FOLLOW_13); 

                    				newLeafNode(otherlv_29, grammarAccess.getComputerAccess().getSemicolonKeyword_25_1());
                    			

                    }
                    break;

            }

            otherlv_30=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_30, grammarAccess.getComputerAccess().getRightCurlyBracketKeyword_26());
            		

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
    // $ANTLR end "ruleComputer"


    // $ANTLR start "entryRuleDockerDeployment"
    // InternalDsl.g:2021:1: entryRuleDockerDeployment returns [EObject current=null] : iv_ruleDockerDeployment= ruleDockerDeployment EOF ;
    public final EObject entryRuleDockerDeployment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDockerDeployment = null;


        try {
            // InternalDsl.g:2021:57: (iv_ruleDockerDeployment= ruleDockerDeployment EOF )
            // InternalDsl.g:2022:2: iv_ruleDockerDeployment= ruleDockerDeployment EOF
            {
             newCompositeNode(grammarAccess.getDockerDeploymentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDockerDeployment=ruleDockerDeployment();

            state._fsp--;

             current =iv_ruleDockerDeployment; 
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
    // $ANTLR end "entryRuleDockerDeployment"


    // $ANTLR start "ruleDockerDeployment"
    // InternalDsl.g:2028:1: ruleDockerDeployment returns [EObject current=null] : (otherlv_0= 'Docker' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_directory_3_0= ruleEString ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_deploymentContainers_6_0= ruleContainer ) ) otherlv_7= ';' ( ( (lv_deploymentContainers_8_0= ruleContainer ) ) otherlv_9= ';' )* otherlv_10= '}' ) ;
    public final EObject ruleDockerDeployment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_directory_3_0 = null;

        EObject lv_deploymentContainers_6_0 = null;

        EObject lv_deploymentContainers_8_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2034:2: ( (otherlv_0= 'Docker' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_directory_3_0= ruleEString ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_deploymentContainers_6_0= ruleContainer ) ) otherlv_7= ';' ( ( (lv_deploymentContainers_8_0= ruleContainer ) ) otherlv_9= ';' )* otherlv_10= '}' ) )
            // InternalDsl.g:2035:2: (otherlv_0= 'Docker' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_directory_3_0= ruleEString ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_deploymentContainers_6_0= ruleContainer ) ) otherlv_7= ';' ( ( (lv_deploymentContainers_8_0= ruleContainer ) ) otherlv_9= ';' )* otherlv_10= '}' )
            {
            // InternalDsl.g:2035:2: (otherlv_0= 'Docker' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_directory_3_0= ruleEString ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_deploymentContainers_6_0= ruleContainer ) ) otherlv_7= ';' ( ( (lv_deploymentContainers_8_0= ruleContainer ) ) otherlv_9= ';' )* otherlv_10= '}' )
            // InternalDsl.g:2036:3: otherlv_0= 'Docker' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_directory_3_0= ruleEString ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_deploymentContainers_6_0= ruleContainer ) ) otherlv_7= ';' ( ( (lv_deploymentContainers_8_0= ruleContainer ) ) otherlv_9= ';' )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDockerDeploymentAccess().getDockerKeyword_0());
            		
            // InternalDsl.g:2040:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:2041:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:2041:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:2042:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDockerDeploymentAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDockerDeploymentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.ubo.fast.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDockerDeploymentAccess().getLeftParenthesisKeyword_2());
            		
            // InternalDsl.g:2063:3: ( (lv_directory_3_0= ruleEString ) )
            // InternalDsl.g:2064:4: (lv_directory_3_0= ruleEString )
            {
            // InternalDsl.g:2064:4: (lv_directory_3_0= ruleEString )
            // InternalDsl.g:2065:5: lv_directory_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDockerDeploymentAccess().getDirectoryEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
            lv_directory_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDockerDeploymentRule());
            					}
            					set(
            						current,
            						"directory",
            						lv_directory_3_0,
            						"fr.ubo.fast.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getDockerDeploymentAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getDockerDeploymentAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalDsl.g:2090:3: ( (lv_deploymentContainers_6_0= ruleContainer ) )
            // InternalDsl.g:2091:4: (lv_deploymentContainers_6_0= ruleContainer )
            {
            // InternalDsl.g:2091:4: (lv_deploymentContainers_6_0= ruleContainer )
            // InternalDsl.g:2092:5: lv_deploymentContainers_6_0= ruleContainer
            {

            					newCompositeNode(grammarAccess.getDockerDeploymentAccess().getDeploymentContainersContainerParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_deploymentContainers_6_0=ruleContainer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDockerDeploymentRule());
            					}
            					add(
            						current,
            						"deploymentContainers",
            						lv_deploymentContainers_6_0,
            						"fr.ubo.fast.dsl.Dsl.Container");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getDockerDeploymentAccess().getSemicolonKeyword_7());
            		
            // InternalDsl.g:2113:3: ( ( (lv_deploymentContainers_8_0= ruleContainer ) ) otherlv_9= ';' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_ID)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDsl.g:2114:4: ( (lv_deploymentContainers_8_0= ruleContainer ) ) otherlv_9= ';'
            	    {
            	    // InternalDsl.g:2114:4: ( (lv_deploymentContainers_8_0= ruleContainer ) )
            	    // InternalDsl.g:2115:5: (lv_deploymentContainers_8_0= ruleContainer )
            	    {
            	    // InternalDsl.g:2115:5: (lv_deploymentContainers_8_0= ruleContainer )
            	    // InternalDsl.g:2116:6: lv_deploymentContainers_8_0= ruleContainer
            	    {

            	    						newCompositeNode(grammarAccess.getDockerDeploymentAccess().getDeploymentContainersContainerParserRuleCall_8_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_deploymentContainers_8_0=ruleContainer();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDockerDeploymentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"deploymentContainers",
            	    							lv_deploymentContainers_8_0,
            	    							"fr.ubo.fast.dsl.Dsl.Container");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_9=(Token)match(input,13,FOLLOW_11); 

            	    				newLeafNode(otherlv_9, grammarAccess.getDockerDeploymentAccess().getSemicolonKeyword_8_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getDockerDeploymentAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleDockerDeployment"


    // $ANTLR start "entryRuleNetwork"
    // InternalDsl.g:2146:1: entryRuleNetwork returns [EObject current=null] : iv_ruleNetwork= ruleNetwork EOF ;
    public final EObject entryRuleNetwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetwork = null;


        try {
            // InternalDsl.g:2146:48: (iv_ruleNetwork= ruleNetwork EOF )
            // InternalDsl.g:2147:2: iv_ruleNetwork= ruleNetwork EOF
            {
             newCompositeNode(grammarAccess.getNetworkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNetwork=ruleNetwork();

            state._fsp--;

             current =iv_ruleNetwork; 
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
    // $ANTLR end "entryRuleNetwork"


    // $ANTLR start "ruleNetwork"
    // InternalDsl.g:2153:1: ruleNetwork returns [EObject current=null] : (otherlv_0= 'network' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_prefix_3_0= ruleEString ) ) otherlv_4= ',' ( (lv_mask_5_0= ruleEString ) ) otherlv_6= ',' ( (lv_gateway_7_0= ruleEString ) ) otherlv_8= ',' ( (lv_domainName_9_0= ruleEString ) ) otherlv_10= ')' otherlv_11= '{' ( (lv_networkInterfaces_12_0= ruleNetworkInterface ) ) otherlv_13= ';' ( ( (lv_networkInterfaces_14_0= ruleNetworkInterface ) ) otherlv_15= ';' )* otherlv_16= '}' ) ;
    public final EObject ruleNetwork() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_prefix_3_0 = null;

        AntlrDatatypeRuleToken lv_mask_5_0 = null;

        AntlrDatatypeRuleToken lv_gateway_7_0 = null;

        AntlrDatatypeRuleToken lv_domainName_9_0 = null;

        EObject lv_networkInterfaces_12_0 = null;

        EObject lv_networkInterfaces_14_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2159:2: ( (otherlv_0= 'network' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_prefix_3_0= ruleEString ) ) otherlv_4= ',' ( (lv_mask_5_0= ruleEString ) ) otherlv_6= ',' ( (lv_gateway_7_0= ruleEString ) ) otherlv_8= ',' ( (lv_domainName_9_0= ruleEString ) ) otherlv_10= ')' otherlv_11= '{' ( (lv_networkInterfaces_12_0= ruleNetworkInterface ) ) otherlv_13= ';' ( ( (lv_networkInterfaces_14_0= ruleNetworkInterface ) ) otherlv_15= ';' )* otherlv_16= '}' ) )
            // InternalDsl.g:2160:2: (otherlv_0= 'network' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_prefix_3_0= ruleEString ) ) otherlv_4= ',' ( (lv_mask_5_0= ruleEString ) ) otherlv_6= ',' ( (lv_gateway_7_0= ruleEString ) ) otherlv_8= ',' ( (lv_domainName_9_0= ruleEString ) ) otherlv_10= ')' otherlv_11= '{' ( (lv_networkInterfaces_12_0= ruleNetworkInterface ) ) otherlv_13= ';' ( ( (lv_networkInterfaces_14_0= ruleNetworkInterface ) ) otherlv_15= ';' )* otherlv_16= '}' )
            {
            // InternalDsl.g:2160:2: (otherlv_0= 'network' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_prefix_3_0= ruleEString ) ) otherlv_4= ',' ( (lv_mask_5_0= ruleEString ) ) otherlv_6= ',' ( (lv_gateway_7_0= ruleEString ) ) otherlv_8= ',' ( (lv_domainName_9_0= ruleEString ) ) otherlv_10= ')' otherlv_11= '{' ( (lv_networkInterfaces_12_0= ruleNetworkInterface ) ) otherlv_13= ';' ( ( (lv_networkInterfaces_14_0= ruleNetworkInterface ) ) otherlv_15= ';' )* otherlv_16= '}' )
            // InternalDsl.g:2161:3: otherlv_0= 'network' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_prefix_3_0= ruleEString ) ) otherlv_4= ',' ( (lv_mask_5_0= ruleEString ) ) otherlv_6= ',' ( (lv_gateway_7_0= ruleEString ) ) otherlv_8= ',' ( (lv_domainName_9_0= ruleEString ) ) otherlv_10= ')' otherlv_11= '{' ( (lv_networkInterfaces_12_0= ruleNetworkInterface ) ) otherlv_13= ';' ( ( (lv_networkInterfaces_14_0= ruleNetworkInterface ) ) otherlv_15= ';' )* otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getNetworkAccess().getNetworkKeyword_0());
            		
            // InternalDsl.g:2165:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:2166:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:2166:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:2167:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNetworkAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNetworkRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.ubo.fast.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getNetworkAccess().getLeftParenthesisKeyword_2());
            		
            // InternalDsl.g:2188:3: ( (lv_prefix_3_0= ruleEString ) )
            // InternalDsl.g:2189:4: (lv_prefix_3_0= ruleEString )
            {
            // InternalDsl.g:2189:4: (lv_prefix_3_0= ruleEString )
            // InternalDsl.g:2190:5: lv_prefix_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNetworkAccess().getPrefixEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_prefix_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNetworkRule());
            					}
            					set(
            						current,
            						"prefix",
            						lv_prefix_3_0,
            						"fr.ubo.fast.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getNetworkAccess().getCommaKeyword_4());
            		
            // InternalDsl.g:2211:3: ( (lv_mask_5_0= ruleEString ) )
            // InternalDsl.g:2212:4: (lv_mask_5_0= ruleEString )
            {
            // InternalDsl.g:2212:4: (lv_mask_5_0= ruleEString )
            // InternalDsl.g:2213:5: lv_mask_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNetworkAccess().getMaskEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_22);
            lv_mask_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNetworkRule());
            					}
            					set(
            						current,
            						"mask",
            						lv_mask_5_0,
            						"fr.ubo.fast.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getNetworkAccess().getCommaKeyword_6());
            		
            // InternalDsl.g:2234:3: ( (lv_gateway_7_0= ruleEString ) )
            // InternalDsl.g:2235:4: (lv_gateway_7_0= ruleEString )
            {
            // InternalDsl.g:2235:4: (lv_gateway_7_0= ruleEString )
            // InternalDsl.g:2236:5: lv_gateway_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNetworkAccess().getGatewayEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_22);
            lv_gateway_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNetworkRule());
            					}
            					set(
            						current,
            						"gateway",
            						lv_gateway_7_0,
            						"fr.ubo.fast.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getNetworkAccess().getCommaKeyword_8());
            		
            // InternalDsl.g:2257:3: ( (lv_domainName_9_0= ruleEString ) )
            // InternalDsl.g:2258:4: (lv_domainName_9_0= ruleEString )
            {
            // InternalDsl.g:2258:4: (lv_domainName_9_0= ruleEString )
            // InternalDsl.g:2259:5: lv_domainName_9_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNetworkAccess().getDomainNameEStringParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_24);
            lv_domainName_9_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNetworkRule());
            					}
            					set(
            						current,
            						"domainName",
            						lv_domainName_9_0,
            						"fr.ubo.fast.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_10, grammarAccess.getNetworkAccess().getRightParenthesisKeyword_10());
            		
            otherlv_11=(Token)match(input,12,FOLLOW_50); 

            			newLeafNode(otherlv_11, grammarAccess.getNetworkAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalDsl.g:2284:3: ( (lv_networkInterfaces_12_0= ruleNetworkInterface ) )
            // InternalDsl.g:2285:4: (lv_networkInterfaces_12_0= ruleNetworkInterface )
            {
            // InternalDsl.g:2285:4: (lv_networkInterfaces_12_0= ruleNetworkInterface )
            // InternalDsl.g:2286:5: lv_networkInterfaces_12_0= ruleNetworkInterface
            {

            					newCompositeNode(grammarAccess.getNetworkAccess().getNetworkInterfacesNetworkInterfaceParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_7);
            lv_networkInterfaces_12_0=ruleNetworkInterface();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNetworkRule());
            					}
            					add(
            						current,
            						"networkInterfaces",
            						lv_networkInterfaces_12_0,
            						"fr.ubo.fast.dsl.Dsl.NetworkInterface");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,13,FOLLOW_51); 

            			newLeafNode(otherlv_13, grammarAccess.getNetworkAccess().getSemicolonKeyword_13());
            		
            // InternalDsl.g:2307:3: ( ( (lv_networkInterfaces_14_0= ruleNetworkInterface ) ) otherlv_15= ';' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==42) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDsl.g:2308:4: ( (lv_networkInterfaces_14_0= ruleNetworkInterface ) ) otherlv_15= ';'
            	    {
            	    // InternalDsl.g:2308:4: ( (lv_networkInterfaces_14_0= ruleNetworkInterface ) )
            	    // InternalDsl.g:2309:5: (lv_networkInterfaces_14_0= ruleNetworkInterface )
            	    {
            	    // InternalDsl.g:2309:5: (lv_networkInterfaces_14_0= ruleNetworkInterface )
            	    // InternalDsl.g:2310:6: lv_networkInterfaces_14_0= ruleNetworkInterface
            	    {

            	    						newCompositeNode(grammarAccess.getNetworkAccess().getNetworkInterfacesNetworkInterfaceParserRuleCall_14_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_networkInterfaces_14_0=ruleNetworkInterface();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNetworkRule());
            	    						}
            	    						add(
            	    							current,
            	    							"networkInterfaces",
            	    							lv_networkInterfaces_14_0,
            	    							"fr.ubo.fast.dsl.Dsl.NetworkInterface");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_15=(Token)match(input,13,FOLLOW_51); 

            	    				newLeafNode(otherlv_15, grammarAccess.getNetworkAccess().getSemicolonKeyword_14_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_16=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getNetworkAccess().getRightCurlyBracketKeyword_15());
            		

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
    // $ANTLR end "ruleNetwork"


    // $ANTLR start "entryRuleContainer"
    // InternalDsl.g:2340:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalDsl.g:2340:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalDsl.g:2341:2: iv_ruleContainer= ruleContainer EOF
            {
             newCompositeNode(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainer=ruleContainer();

            state._fsp--;

             current =iv_ruleContainer; 
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
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalDsl.g:2347:1: ruleContainer returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_containerServices_5_0= ruleService ) ) otherlv_6= ';' ( ( (lv_containerServices_7_0= ruleService ) ) otherlv_8= ';' )* otherlv_9= '}' ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_containerServices_5_0 = null;

        EObject lv_containerServices_7_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2353:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_containerServices_5_0= ruleService ) ) otherlv_6= ';' ( ( (lv_containerServices_7_0= ruleService ) ) otherlv_8= ';' )* otherlv_9= '}' ) )
            // InternalDsl.g:2354:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_containerServices_5_0= ruleService ) ) otherlv_6= ';' ( ( (lv_containerServices_7_0= ruleService ) ) otherlv_8= ';' )* otherlv_9= '}' )
            {
            // InternalDsl.g:2354:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_containerServices_5_0= ruleService ) ) otherlv_6= ';' ( ( (lv_containerServices_7_0= ruleService ) ) otherlv_8= ';' )* otherlv_9= '}' )
            // InternalDsl.g:2355:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_containerServices_5_0= ruleService ) ) otherlv_6= ';' ( ( (lv_containerServices_7_0= ruleService ) ) otherlv_8= ';' )* otherlv_9= '}'
            {
            // InternalDsl.g:2355:3: ( (lv_name_0_0= ruleEString ) )
            // InternalDsl.g:2356:4: (lv_name_0_0= ruleEString )
            {
            // InternalDsl.g:2356:4: (lv_name_0_0= ruleEString )
            // InternalDsl.g:2357:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getContainerAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContainerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"fr.ubo.fast.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getContainerAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDsl.g:2378:3: ( ( ruleEString ) )
            // InternalDsl.g:2379:4: ( ruleEString )
            {
            // InternalDsl.g:2379:4: ( ruleEString )
            // InternalDsl.g:2380:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContainerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getContainerAccess().getContainerNetworkInterfaceNetworkInterfaceCrossReference_2_0());
            				
            pushFollow(FOLLOW_24);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getContainerAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalDsl.g:2402:3: ( (lv_containerServices_5_0= ruleService ) )
            // InternalDsl.g:2403:4: (lv_containerServices_5_0= ruleService )
            {
            // InternalDsl.g:2403:4: (lv_containerServices_5_0= ruleService )
            // InternalDsl.g:2404:5: lv_containerServices_5_0= ruleService
            {

            					newCompositeNode(grammarAccess.getContainerAccess().getContainerServicesServiceParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_containerServices_5_0=ruleService();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContainerRule());
            					}
            					add(
            						current,
            						"containerServices",
            						lv_containerServices_5_0,
            						"fr.ubo.fast.dsl.Dsl.Service");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getContainerAccess().getSemicolonKeyword_6());
            		
            // InternalDsl.g:2425:3: ( ( (lv_containerServices_7_0= ruleService ) ) otherlv_8= ';' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_ID)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDsl.g:2426:4: ( (lv_containerServices_7_0= ruleService ) ) otherlv_8= ';'
            	    {
            	    // InternalDsl.g:2426:4: ( (lv_containerServices_7_0= ruleService ) )
            	    // InternalDsl.g:2427:5: (lv_containerServices_7_0= ruleService )
            	    {
            	    // InternalDsl.g:2427:5: (lv_containerServices_7_0= ruleService )
            	    // InternalDsl.g:2428:6: lv_containerServices_7_0= ruleService
            	    {

            	    						newCompositeNode(grammarAccess.getContainerAccess().getContainerServicesServiceParserRuleCall_7_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_containerServices_7_0=ruleService();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getContainerRule());
            	    						}
            	    						add(
            	    							current,
            	    							"containerServices",
            	    							lv_containerServices_7_0,
            	    							"fr.ubo.fast.dsl.Dsl.Service");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_8=(Token)match(input,13,FOLLOW_11); 

            	    				newLeafNode(otherlv_8, grammarAccess.getContainerAccess().getSemicolonKeyword_7_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleNetworkInterface"
    // InternalDsl.g:2458:1: entryRuleNetworkInterface returns [EObject current=null] : iv_ruleNetworkInterface= ruleNetworkInterface EOF ;
    public final EObject entryRuleNetworkInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworkInterface = null;


        try {
            // InternalDsl.g:2458:57: (iv_ruleNetworkInterface= ruleNetworkInterface EOF )
            // InternalDsl.g:2459:2: iv_ruleNetworkInterface= ruleNetworkInterface EOF
            {
             newCompositeNode(grammarAccess.getNetworkInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNetworkInterface=ruleNetworkInterface();

            state._fsp--;

             current =iv_ruleNetworkInterface; 
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
    // $ANTLR end "entryRuleNetworkInterface"


    // $ANTLR start "ruleNetworkInterface"
    // InternalDsl.g:2465:1: ruleNetworkInterface returns [EObject current=null] : (otherlv_0= 'interface' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_ipAddress_3_0= ruleEString ) ) otherlv_4= ')' ) ;
    public final EObject ruleNetworkInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_ipAddress_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2471:2: ( (otherlv_0= 'interface' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_ipAddress_3_0= ruleEString ) ) otherlv_4= ')' ) )
            // InternalDsl.g:2472:2: (otherlv_0= 'interface' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_ipAddress_3_0= ruleEString ) ) otherlv_4= ')' )
            {
            // InternalDsl.g:2472:2: (otherlv_0= 'interface' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_ipAddress_3_0= ruleEString ) ) otherlv_4= ')' )
            // InternalDsl.g:2473:3: otherlv_0= 'interface' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_ipAddress_3_0= ruleEString ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getNetworkInterfaceAccess().getInterfaceKeyword_0());
            		
            // InternalDsl.g:2477:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:2478:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:2478:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:2479:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNetworkInterfaceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNetworkInterfaceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.ubo.fast.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getNetworkInterfaceAccess().getLeftParenthesisKeyword_2());
            		
            // InternalDsl.g:2500:3: ( (lv_ipAddress_3_0= ruleEString ) )
            // InternalDsl.g:2501:4: (lv_ipAddress_3_0= ruleEString )
            {
            // InternalDsl.g:2501:4: (lv_ipAddress_3_0= ruleEString )
            // InternalDsl.g:2502:5: lv_ipAddress_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNetworkInterfaceAccess().getIpAddressEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
            lv_ipAddress_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNetworkInterfaceRule());
            					}
            					set(
            						current,
            						"ipAddress",
            						lv_ipAddress_3_0,
            						"fr.ubo.fast.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getNetworkInterfaceAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleNetworkInterface"


    // $ANTLR start "entryRuleWebServer"
    // InternalDsl.g:2527:1: entryRuleWebServer returns [EObject current=null] : iv_ruleWebServer= ruleWebServer EOF ;
    public final EObject entryRuleWebServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWebServer = null;


        try {
            // InternalDsl.g:2527:50: (iv_ruleWebServer= ruleWebServer EOF )
            // InternalDsl.g:2528:2: iv_ruleWebServer= ruleWebServer EOF
            {
             newCompositeNode(grammarAccess.getWebServerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWebServer=ruleWebServer();

            state._fsp--;

             current =iv_ruleWebServer; 
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
    // $ANTLR end "entryRuleWebServer"


    // $ANTLR start "ruleWebServer"
    // InternalDsl.g:2534:1: ruleWebServer returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( (lv_type_2_0= ruleWebServerType ) ) otherlv_3= ',' ( (lv_port_4_0= ruleEInt ) ) (otherlv_5= ',' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? otherlv_9= ')' ) ;
    public final EObject ruleWebServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        Enumerator lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_port_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2540:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( (lv_type_2_0= ruleWebServerType ) ) otherlv_3= ',' ( (lv_port_4_0= ruleEInt ) ) (otherlv_5= ',' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? otherlv_9= ')' ) )
            // InternalDsl.g:2541:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( (lv_type_2_0= ruleWebServerType ) ) otherlv_3= ',' ( (lv_port_4_0= ruleEInt ) ) (otherlv_5= ',' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? otherlv_9= ')' )
            {
            // InternalDsl.g:2541:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( (lv_type_2_0= ruleWebServerType ) ) otherlv_3= ',' ( (lv_port_4_0= ruleEInt ) ) (otherlv_5= ',' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? otherlv_9= ')' )
            // InternalDsl.g:2542:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( (lv_type_2_0= ruleWebServerType ) ) otherlv_3= ',' ( (lv_port_4_0= ruleEInt ) ) (otherlv_5= ',' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? otherlv_9= ')'
            {
            // InternalDsl.g:2542:3: ( (lv_name_0_0= ruleEString ) )
            // InternalDsl.g:2543:4: (lv_name_0_0= ruleEString )
            {
            // InternalDsl.g:2543:4: (lv_name_0_0= ruleEString )
            // InternalDsl.g:2544:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWebServerAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWebServerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"fr.ubo.fast.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_52); 

            			newLeafNode(otherlv_1, grammarAccess.getWebServerAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDsl.g:2565:3: ( (lv_type_2_0= ruleWebServerType ) )
            // InternalDsl.g:2566:4: (lv_type_2_0= ruleWebServerType )
            {
            // InternalDsl.g:2566:4: (lv_type_2_0= ruleWebServerType )
            // InternalDsl.g:2567:5: lv_type_2_0= ruleWebServerType
            {

            					newCompositeNode(grammarAccess.getWebServerAccess().getTypeWebServerTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_type_2_0=ruleWebServerType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWebServerRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"fr.ubo.fast.dsl.Dsl.WebServerType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getWebServerAccess().getCommaKeyword_3());
            		
            // InternalDsl.g:2588:3: ( (lv_port_4_0= ruleEInt ) )
            // InternalDsl.g:2589:4: (lv_port_4_0= ruleEInt )
            {
            // InternalDsl.g:2589:4: (lv_port_4_0= ruleEInt )
            // InternalDsl.g:2590:5: lv_port_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getWebServerAccess().getPortEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_53);
            lv_port_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWebServerRule());
            					}
            					set(
            						current,
            						"port",
            						lv_port_4_0,
            						"fr.ubo.fast.dsl.Dsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:2607:3: (otherlv_5= ',' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDsl.g:2608:4: otherlv_5= ',' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getWebServerAccess().getCommaKeyword_5_0());
                    			
                    // InternalDsl.g:2612:4: ( ( ruleEString ) )
                    // InternalDsl.g:2613:5: ( ruleEString )
                    {
                    // InternalDsl.g:2613:5: ( ruleEString )
                    // InternalDsl.g:2614:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWebServerRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getWebServerAccess().getProxyDataSourceCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_53);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:2628:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==24) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalDsl.g:2629:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,24,FOLLOW_10); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getWebServerAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalDsl.g:2633:5: ( ( ruleEString ) )
                    	    // InternalDsl.g:2634:6: ( ruleEString )
                    	    {
                    	    // InternalDsl.g:2634:6: ( ruleEString )
                    	    // InternalDsl.g:2635:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getWebServerRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getWebServerAccess().getProxyDataSourceCrossReference_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_53);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getWebServerAccess().getRightParenthesisKeyword_6());
            		

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
    // $ANTLR end "ruleWebServer"


    // $ANTLR start "entryRuleCalendarScale"
    // InternalDsl.g:2659:1: entryRuleCalendarScale returns [EObject current=null] : iv_ruleCalendarScale= ruleCalendarScale EOF ;
    public final EObject entryRuleCalendarScale() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalendarScale = null;


        try {
            // InternalDsl.g:2659:54: (iv_ruleCalendarScale= ruleCalendarScale EOF )
            // InternalDsl.g:2660:2: iv_ruleCalendarScale= ruleCalendarScale EOF
            {
             newCompositeNode(grammarAccess.getCalendarScaleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCalendarScale=ruleCalendarScale();

            state._fsp--;

             current =iv_ruleCalendarScale; 
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
    // $ANTLR end "entryRuleCalendarScale"


    // $ANTLR start "ruleCalendarScale"
    // InternalDsl.g:2666:1: ruleCalendarScale returns [EObject current=null] : (otherlv_0= 'scale' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' otherlv_3= '[' ( (lv_factors_4_0= ruleELong ) ) ( (lv_periods_5_0= rulePeriod ) ) (otherlv_6= ',' ( (lv_factors_7_0= ruleELong ) ) ( (lv_periods_8_0= rulePeriod ) ) )* otherlv_9= ']' otherlv_10= ')' ) ;
    public final EObject ruleCalendarScale() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_factors_4_0 = null;

        Enumerator lv_periods_5_0 = null;

        AntlrDatatypeRuleToken lv_factors_7_0 = null;

        Enumerator lv_periods_8_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2672:2: ( (otherlv_0= 'scale' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' otherlv_3= '[' ( (lv_factors_4_0= ruleELong ) ) ( (lv_periods_5_0= rulePeriod ) ) (otherlv_6= ',' ( (lv_factors_7_0= ruleELong ) ) ( (lv_periods_8_0= rulePeriod ) ) )* otherlv_9= ']' otherlv_10= ')' ) )
            // InternalDsl.g:2673:2: (otherlv_0= 'scale' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' otherlv_3= '[' ( (lv_factors_4_0= ruleELong ) ) ( (lv_periods_5_0= rulePeriod ) ) (otherlv_6= ',' ( (lv_factors_7_0= ruleELong ) ) ( (lv_periods_8_0= rulePeriod ) ) )* otherlv_9= ']' otherlv_10= ')' )
            {
            // InternalDsl.g:2673:2: (otherlv_0= 'scale' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' otherlv_3= '[' ( (lv_factors_4_0= ruleELong ) ) ( (lv_periods_5_0= rulePeriod ) ) (otherlv_6= ',' ( (lv_factors_7_0= ruleELong ) ) ( (lv_periods_8_0= rulePeriod ) ) )* otherlv_9= ']' otherlv_10= ')' )
            // InternalDsl.g:2674:3: otherlv_0= 'scale' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' otherlv_3= '[' ( (lv_factors_4_0= ruleELong ) ) ( (lv_periods_5_0= rulePeriod ) ) (otherlv_6= ',' ( (lv_factors_7_0= ruleELong ) ) ( (lv_periods_8_0= rulePeriod ) ) )* otherlv_9= ']' otherlv_10= ')'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getCalendarScaleAccess().getScaleKeyword_0());
            		
            // InternalDsl.g:2678:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:2679:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:2679:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:2680:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCalendarScaleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCalendarScaleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.ubo.fast.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_54); 

            			newLeafNode(otherlv_2, grammarAccess.getCalendarScaleAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,44,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getCalendarScaleAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalDsl.g:2705:3: ( (lv_factors_4_0= ruleELong ) )
            // InternalDsl.g:2706:4: (lv_factors_4_0= ruleELong )
            {
            // InternalDsl.g:2706:4: (lv_factors_4_0= ruleELong )
            // InternalDsl.g:2707:5: lv_factors_4_0= ruleELong
            {

            					newCompositeNode(grammarAccess.getCalendarScaleAccess().getFactorsELongParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_55);
            lv_factors_4_0=ruleELong();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCalendarScaleRule());
            					}
            					add(
            						current,
            						"factors",
            						lv_factors_4_0,
            						"fr.ubo.fast.dsl.Dsl.ELong");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:2724:3: ( (lv_periods_5_0= rulePeriod ) )
            // InternalDsl.g:2725:4: (lv_periods_5_0= rulePeriod )
            {
            // InternalDsl.g:2725:4: (lv_periods_5_0= rulePeriod )
            // InternalDsl.g:2726:5: lv_periods_5_0= rulePeriod
            {

            					newCompositeNode(grammarAccess.getCalendarScaleAccess().getPeriodsPeriodEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_56);
            lv_periods_5_0=rulePeriod();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCalendarScaleRule());
            					}
            					add(
            						current,
            						"periods",
            						lv_periods_5_0,
            						"fr.ubo.fast.dsl.Dsl.Period");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:2743:3: (otherlv_6= ',' ( (lv_factors_7_0= ruleELong ) ) ( (lv_periods_8_0= rulePeriod ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==24) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDsl.g:2744:4: otherlv_6= ',' ( (lv_factors_7_0= ruleELong ) ) ( (lv_periods_8_0= rulePeriod ) )
            	    {
            	    otherlv_6=(Token)match(input,24,FOLLOW_23); 

            	    				newLeafNode(otherlv_6, grammarAccess.getCalendarScaleAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalDsl.g:2748:4: ( (lv_factors_7_0= ruleELong ) )
            	    // InternalDsl.g:2749:5: (lv_factors_7_0= ruleELong )
            	    {
            	    // InternalDsl.g:2749:5: (lv_factors_7_0= ruleELong )
            	    // InternalDsl.g:2750:6: lv_factors_7_0= ruleELong
            	    {

            	    						newCompositeNode(grammarAccess.getCalendarScaleAccess().getFactorsELongParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_55);
            	    lv_factors_7_0=ruleELong();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCalendarScaleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"factors",
            	    							lv_factors_7_0,
            	    							"fr.ubo.fast.dsl.Dsl.ELong");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalDsl.g:2767:4: ( (lv_periods_8_0= rulePeriod ) )
            	    // InternalDsl.g:2768:5: (lv_periods_8_0= rulePeriod )
            	    {
            	    // InternalDsl.g:2768:5: (lv_periods_8_0= rulePeriod )
            	    // InternalDsl.g:2769:6: lv_periods_8_0= rulePeriod
            	    {

            	    						newCompositeNode(grammarAccess.getCalendarScaleAccess().getPeriodsPeriodEnumRuleCall_6_2_0());
            	    					
            	    pushFollow(FOLLOW_56);
            	    lv_periods_8_0=rulePeriod();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCalendarScaleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"periods",
            	    							lv_periods_8_0,
            	    							"fr.ubo.fast.dsl.Dsl.Period");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_9=(Token)match(input,45,FOLLOW_24); 

            			newLeafNode(otherlv_9, grammarAccess.getCalendarScaleAccess().getRightSquareBracketKeyword_7());
            		
            otherlv_10=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getCalendarScaleAccess().getRightParenthesisKeyword_8());
            		

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
    // $ANTLR end "ruleCalendarScale"


    // $ANTLR start "entryRuleFactorScale"
    // InternalDsl.g:2799:1: entryRuleFactorScale returns [EObject current=null] : iv_ruleFactorScale= ruleFactorScale EOF ;
    public final EObject entryRuleFactorScale() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactorScale = null;


        try {
            // InternalDsl.g:2799:52: (iv_ruleFactorScale= ruleFactorScale EOF )
            // InternalDsl.g:2800:2: iv_ruleFactorScale= ruleFactorScale EOF
            {
             newCompositeNode(grammarAccess.getFactorScaleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactorScale=ruleFactorScale();

            state._fsp--;

             current =iv_ruleFactorScale; 
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
    // $ANTLR end "entryRuleFactorScale"


    // $ANTLR start "ruleFactorScale"
    // InternalDsl.g:2806:1: ruleFactorScale returns [EObject current=null] : (otherlv_0= 'scale' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_factor_3_0= ruleEInt ) ) otherlv_4= ',' ( (lv_zoomsNumber_5_0= ruleEInt ) ) otherlv_6= ')' ) ;
    public final EObject ruleFactorScale() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_factor_3_0 = null;

        AntlrDatatypeRuleToken lv_zoomsNumber_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2812:2: ( (otherlv_0= 'scale' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_factor_3_0= ruleEInt ) ) otherlv_4= ',' ( (lv_zoomsNumber_5_0= ruleEInt ) ) otherlv_6= ')' ) )
            // InternalDsl.g:2813:2: (otherlv_0= 'scale' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_factor_3_0= ruleEInt ) ) otherlv_4= ',' ( (lv_zoomsNumber_5_0= ruleEInt ) ) otherlv_6= ')' )
            {
            // InternalDsl.g:2813:2: (otherlv_0= 'scale' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_factor_3_0= ruleEInt ) ) otherlv_4= ',' ( (lv_zoomsNumber_5_0= ruleEInt ) ) otherlv_6= ')' )
            // InternalDsl.g:2814:3: otherlv_0= 'scale' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_factor_3_0= ruleEInt ) ) otherlv_4= ',' ( (lv_zoomsNumber_5_0= ruleEInt ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getFactorScaleAccess().getScaleKeyword_0());
            		
            // InternalDsl.g:2818:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDsl.g:2819:4: (lv_name_1_0= ruleEString )
            {
            // InternalDsl.g:2819:4: (lv_name_1_0= ruleEString )
            // InternalDsl.g:2820:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFactorScaleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFactorScaleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.ubo.fast.dsl.Dsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getFactorScaleAccess().getLeftParenthesisKeyword_2());
            		
            // InternalDsl.g:2841:3: ( (lv_factor_3_0= ruleEInt ) )
            // InternalDsl.g:2842:4: (lv_factor_3_0= ruleEInt )
            {
            // InternalDsl.g:2842:4: (lv_factor_3_0= ruleEInt )
            // InternalDsl.g:2843:5: lv_factor_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getFactorScaleAccess().getFactorEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_factor_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFactorScaleRule());
            					}
            					set(
            						current,
            						"factor",
            						lv_factor_3_0,
            						"fr.ubo.fast.dsl.Dsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getFactorScaleAccess().getCommaKeyword_4());
            		
            // InternalDsl.g:2864:3: ( (lv_zoomsNumber_5_0= ruleEInt ) )
            // InternalDsl.g:2865:4: (lv_zoomsNumber_5_0= ruleEInt )
            {
            // InternalDsl.g:2865:4: (lv_zoomsNumber_5_0= ruleEInt )
            // InternalDsl.g:2866:5: lv_zoomsNumber_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getFactorScaleAccess().getZoomsNumberEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_24);
            lv_zoomsNumber_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFactorScaleRule());
            					}
            					set(
            						current,
            						"zoomsNumber",
            						lv_zoomsNumber_5_0,
            						"fr.ubo.fast.dsl.Dsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getFactorScaleAccess().getRightParenthesisKeyword_6());
            		

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
    // $ANTLR end "ruleFactorScale"


    // $ANTLR start "entryRuleELong"
    // InternalDsl.g:2891:1: entryRuleELong returns [String current=null] : iv_ruleELong= ruleELong EOF ;
    public final String entryRuleELong() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleELong = null;


        try {
            // InternalDsl.g:2891:45: (iv_ruleELong= ruleELong EOF )
            // InternalDsl.g:2892:2: iv_ruleELong= ruleELong EOF
            {
             newCompositeNode(grammarAccess.getELongRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleELong=ruleELong();

            state._fsp--;

             current =iv_ruleELong.getText(); 
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
    // $ANTLR end "entryRuleELong"


    // $ANTLR start "ruleELong"
    // InternalDsl.g:2898:1: ruleELong returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleELong() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDsl.g:2904:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalDsl.g:2905:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalDsl.g:2905:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalDsl.g:2906:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalDsl.g:2906:3: (kw= '-' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDsl.g:2907:4: kw= '-'
                    {
                    kw=(Token)match(input,38,FOLLOW_57); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getELongAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getELongAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleELong"


    // $ANTLR start "entryRuleEString"
    // InternalDsl.g:2924:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDsl.g:2924:47: (iv_ruleEString= ruleEString EOF )
            // InternalDsl.g:2925:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDsl.g:2931:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDsl.g:2937:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDsl.g:2938:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDsl.g:2938:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_STRING) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_ID) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalDsl.g:2939:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:2947:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEDouble"
    // InternalDsl.g:2958:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalDsl.g:2958:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalDsl.g:2959:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalDsl.g:2965:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalDsl.g:2971:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalDsl.g:2972:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalDsl.g:2972:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalDsl.g:2973:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalDsl.g:2973:3: (kw= '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDsl.g:2974:4: kw= '-'
                    {
                    kw=(Token)match(input,38,FOLLOW_58); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalDsl.g:2980:3: (this_INT_1= RULE_INT )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDsl.g:2981:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_59); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,46,FOLLOW_57); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_60); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalDsl.g:3001:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=47 && LA29_0<=48)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDsl.g:3002:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalDsl.g:3002:4: (kw= 'E' | kw= 'e' )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==47) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==48) ) {
                        alt27=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalDsl.g:3003:5: kw= 'E'
                            {
                            kw=(Token)match(input,47,FOLLOW_23); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDsl.g:3009:5: kw= 'e'
                            {
                            kw=(Token)match(input,48,FOLLOW_23); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalDsl.g:3015:4: (kw= '-' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==38) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalDsl.g:3016:5: kw= '-'
                            {
                            kw=(Token)match(input,38,FOLLOW_57); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEInt"
    // InternalDsl.g:3034:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalDsl.g:3034:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalDsl.g:3035:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalDsl.g:3041:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDsl.g:3047:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalDsl.g:3048:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalDsl.g:3048:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalDsl.g:3049:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalDsl.g:3049:3: (kw= '-' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==38) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDsl.g:3050:4: kw= '-'
                    {
                    kw=(Token)match(input,38,FOLLOW_57); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleMeasurementDataUnit"
    // InternalDsl.g:3067:1: ruleMeasurementDataUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'Celsius' ) | (enumLiteral_1= 'Meter' ) | (enumLiteral_2= 'MeterPerSecond' ) | (enumLiteral_3= 'Bar' ) | (enumLiteral_4= 'Liter' ) | (enumLiteral_5= 'Gram' ) | (enumLiteral_6= 'Radian' ) | (enumLiteral_7= 'None' ) ) ;
    public final Enumerator ruleMeasurementDataUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalDsl.g:3073:2: ( ( (enumLiteral_0= 'Celsius' ) | (enumLiteral_1= 'Meter' ) | (enumLiteral_2= 'MeterPerSecond' ) | (enumLiteral_3= 'Bar' ) | (enumLiteral_4= 'Liter' ) | (enumLiteral_5= 'Gram' ) | (enumLiteral_6= 'Radian' ) | (enumLiteral_7= 'None' ) ) )
            // InternalDsl.g:3074:2: ( (enumLiteral_0= 'Celsius' ) | (enumLiteral_1= 'Meter' ) | (enumLiteral_2= 'MeterPerSecond' ) | (enumLiteral_3= 'Bar' ) | (enumLiteral_4= 'Liter' ) | (enumLiteral_5= 'Gram' ) | (enumLiteral_6= 'Radian' ) | (enumLiteral_7= 'None' ) )
            {
            // InternalDsl.g:3074:2: ( (enumLiteral_0= 'Celsius' ) | (enumLiteral_1= 'Meter' ) | (enumLiteral_2= 'MeterPerSecond' ) | (enumLiteral_3= 'Bar' ) | (enumLiteral_4= 'Liter' ) | (enumLiteral_5= 'Gram' ) | (enumLiteral_6= 'Radian' ) | (enumLiteral_7= 'None' ) )
            int alt31=8;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt31=1;
                }
                break;
            case 50:
                {
                alt31=2;
                }
                break;
            case 51:
                {
                alt31=3;
                }
                break;
            case 52:
                {
                alt31=4;
                }
                break;
            case 53:
                {
                alt31=5;
                }
                break;
            case 54:
                {
                alt31=6;
                }
                break;
            case 55:
                {
                alt31=7;
                }
                break;
            case 56:
                {
                alt31=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalDsl.g:3075:3: (enumLiteral_0= 'Celsius' )
                    {
                    // InternalDsl.g:3075:3: (enumLiteral_0= 'Celsius' )
                    // InternalDsl.g:3076:4: enumLiteral_0= 'Celsius'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getMeasurementDataUnitAccess().getCelsiusEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMeasurementDataUnitAccess().getCelsiusEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:3083:3: (enumLiteral_1= 'Meter' )
                    {
                    // InternalDsl.g:3083:3: (enumLiteral_1= 'Meter' )
                    // InternalDsl.g:3084:4: enumLiteral_1= 'Meter'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getMeasurementDataUnitAccess().getMeterEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMeasurementDataUnitAccess().getMeterEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:3091:3: (enumLiteral_2= 'MeterPerSecond' )
                    {
                    // InternalDsl.g:3091:3: (enumLiteral_2= 'MeterPerSecond' )
                    // InternalDsl.g:3092:4: enumLiteral_2= 'MeterPerSecond'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getMeasurementDataUnitAccess().getMeterPerSecondEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMeasurementDataUnitAccess().getMeterPerSecondEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:3099:3: (enumLiteral_3= 'Bar' )
                    {
                    // InternalDsl.g:3099:3: (enumLiteral_3= 'Bar' )
                    // InternalDsl.g:3100:4: enumLiteral_3= 'Bar'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getMeasurementDataUnitAccess().getBarEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMeasurementDataUnitAccess().getBarEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:3107:3: (enumLiteral_4= 'Liter' )
                    {
                    // InternalDsl.g:3107:3: (enumLiteral_4= 'Liter' )
                    // InternalDsl.g:3108:4: enumLiteral_4= 'Liter'
                    {
                    enumLiteral_4=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getMeasurementDataUnitAccess().getLiterEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getMeasurementDataUnitAccess().getLiterEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:3115:3: (enumLiteral_5= 'Gram' )
                    {
                    // InternalDsl.g:3115:3: (enumLiteral_5= 'Gram' )
                    // InternalDsl.g:3116:4: enumLiteral_5= 'Gram'
                    {
                    enumLiteral_5=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getMeasurementDataUnitAccess().getGramEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getMeasurementDataUnitAccess().getGramEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:3123:3: (enumLiteral_6= 'Radian' )
                    {
                    // InternalDsl.g:3123:3: (enumLiteral_6= 'Radian' )
                    // InternalDsl.g:3124:4: enumLiteral_6= 'Radian'
                    {
                    enumLiteral_6=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getMeasurementDataUnitAccess().getRadianEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getMeasurementDataUnitAccess().getRadianEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalDsl.g:3131:3: (enumLiteral_7= 'None' )
                    {
                    // InternalDsl.g:3131:3: (enumLiteral_7= 'None' )
                    // InternalDsl.g:3132:4: enumLiteral_7= 'None'
                    {
                    enumLiteral_7=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getMeasurementDataUnitAccess().getNoneEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getMeasurementDataUnitAccess().getNoneEnumLiteralDeclaration_7());
                    			

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
    // $ANTLR end "ruleMeasurementDataUnit"


    // $ANTLR start "rulePeriod"
    // InternalDsl.g:3142:1: rulePeriod returns [Enumerator current=null] : ( (enumLiteral_0= 'Millisecond' ) | (enumLiteral_1= 'Second' ) | (enumLiteral_2= 'Minute' ) | (enumLiteral_3= 'Hour' ) | (enumLiteral_4= 'Day' ) | (enumLiteral_5= 'Month' ) | (enumLiteral_6= 'Year' ) ) ;
    public final Enumerator rulePeriod() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalDsl.g:3148:2: ( ( (enumLiteral_0= 'Millisecond' ) | (enumLiteral_1= 'Second' ) | (enumLiteral_2= 'Minute' ) | (enumLiteral_3= 'Hour' ) | (enumLiteral_4= 'Day' ) | (enumLiteral_5= 'Month' ) | (enumLiteral_6= 'Year' ) ) )
            // InternalDsl.g:3149:2: ( (enumLiteral_0= 'Millisecond' ) | (enumLiteral_1= 'Second' ) | (enumLiteral_2= 'Minute' ) | (enumLiteral_3= 'Hour' ) | (enumLiteral_4= 'Day' ) | (enumLiteral_5= 'Month' ) | (enumLiteral_6= 'Year' ) )
            {
            // InternalDsl.g:3149:2: ( (enumLiteral_0= 'Millisecond' ) | (enumLiteral_1= 'Second' ) | (enumLiteral_2= 'Minute' ) | (enumLiteral_3= 'Hour' ) | (enumLiteral_4= 'Day' ) | (enumLiteral_5= 'Month' ) | (enumLiteral_6= 'Year' ) )
            int alt32=7;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt32=1;
                }
                break;
            case 58:
                {
                alt32=2;
                }
                break;
            case 59:
                {
                alt32=3;
                }
                break;
            case 60:
                {
                alt32=4;
                }
                break;
            case 61:
                {
                alt32=5;
                }
                break;
            case 62:
                {
                alt32=6;
                }
                break;
            case 63:
                {
                alt32=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalDsl.g:3150:3: (enumLiteral_0= 'Millisecond' )
                    {
                    // InternalDsl.g:3150:3: (enumLiteral_0= 'Millisecond' )
                    // InternalDsl.g:3151:4: enumLiteral_0= 'Millisecond'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getPeriodAccess().getMillisecondEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPeriodAccess().getMillisecondEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:3158:3: (enumLiteral_1= 'Second' )
                    {
                    // InternalDsl.g:3158:3: (enumLiteral_1= 'Second' )
                    // InternalDsl.g:3159:4: enumLiteral_1= 'Second'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getPeriodAccess().getSecondEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPeriodAccess().getSecondEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:3166:3: (enumLiteral_2= 'Minute' )
                    {
                    // InternalDsl.g:3166:3: (enumLiteral_2= 'Minute' )
                    // InternalDsl.g:3167:4: enumLiteral_2= 'Minute'
                    {
                    enumLiteral_2=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getPeriodAccess().getMinuteEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPeriodAccess().getMinuteEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:3174:3: (enumLiteral_3= 'Hour' )
                    {
                    // InternalDsl.g:3174:3: (enumLiteral_3= 'Hour' )
                    // InternalDsl.g:3175:4: enumLiteral_3= 'Hour'
                    {
                    enumLiteral_3=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getPeriodAccess().getHourEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPeriodAccess().getHourEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:3182:3: (enumLiteral_4= 'Day' )
                    {
                    // InternalDsl.g:3182:3: (enumLiteral_4= 'Day' )
                    // InternalDsl.g:3183:4: enumLiteral_4= 'Day'
                    {
                    enumLiteral_4=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getPeriodAccess().getDayEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPeriodAccess().getDayEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:3190:3: (enumLiteral_5= 'Month' )
                    {
                    // InternalDsl.g:3190:3: (enumLiteral_5= 'Month' )
                    // InternalDsl.g:3191:4: enumLiteral_5= 'Month'
                    {
                    enumLiteral_5=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getPeriodAccess().getMonthEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPeriodAccess().getMonthEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:3198:3: (enumLiteral_6= 'Year' )
                    {
                    // InternalDsl.g:3198:3: (enumLiteral_6= 'Year' )
                    // InternalDsl.g:3199:4: enumLiteral_6= 'Year'
                    {
                    enumLiteral_6=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getPeriodAccess().getYearEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPeriodAccess().getYearEnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "rulePeriod"


    // $ANTLR start "ruleOSType"
    // InternalDsl.g:3209:1: ruleOSType returns [Enumerator current=null] : ( (enumLiteral_0= 'Linux' ) | (enumLiteral_1= 'Windows' ) | (enumLiteral_2= 'MacOS' ) ) ;
    public final Enumerator ruleOSType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDsl.g:3215:2: ( ( (enumLiteral_0= 'Linux' ) | (enumLiteral_1= 'Windows' ) | (enumLiteral_2= 'MacOS' ) ) )
            // InternalDsl.g:3216:2: ( (enumLiteral_0= 'Linux' ) | (enumLiteral_1= 'Windows' ) | (enumLiteral_2= 'MacOS' ) )
            {
            // InternalDsl.g:3216:2: ( (enumLiteral_0= 'Linux' ) | (enumLiteral_1= 'Windows' ) | (enumLiteral_2= 'MacOS' ) )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt33=1;
                }
                break;
            case 65:
                {
                alt33=2;
                }
                break;
            case 66:
                {
                alt33=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalDsl.g:3217:3: (enumLiteral_0= 'Linux' )
                    {
                    // InternalDsl.g:3217:3: (enumLiteral_0= 'Linux' )
                    // InternalDsl.g:3218:4: enumLiteral_0= 'Linux'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getOSTypeAccess().getLinuxEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOSTypeAccess().getLinuxEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:3225:3: (enumLiteral_1= 'Windows' )
                    {
                    // InternalDsl.g:3225:3: (enumLiteral_1= 'Windows' )
                    // InternalDsl.g:3226:4: enumLiteral_1= 'Windows'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getOSTypeAccess().getWindowsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOSTypeAccess().getWindowsEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:3233:3: (enumLiteral_2= 'MacOS' )
                    {
                    // InternalDsl.g:3233:3: (enumLiteral_2= 'MacOS' )
                    // InternalDsl.g:3234:4: enumLiteral_2= 'MacOS'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getOSTypeAccess().getMacOSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOSTypeAccess().getMacOSEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleOSType"


    // $ANTLR start "ruleDatabaseType"
    // InternalDsl.g:3244:1: ruleDatabaseType returns [Enumerator current=null] : ( (enumLiteral_0= 'TimeScaleDB' ) | (enumLiteral_1= 'InfluxDB' ) ) ;
    public final Enumerator ruleDatabaseType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDsl.g:3250:2: ( ( (enumLiteral_0= 'TimeScaleDB' ) | (enumLiteral_1= 'InfluxDB' ) ) )
            // InternalDsl.g:3251:2: ( (enumLiteral_0= 'TimeScaleDB' ) | (enumLiteral_1= 'InfluxDB' ) )
            {
            // InternalDsl.g:3251:2: ( (enumLiteral_0= 'TimeScaleDB' ) | (enumLiteral_1= 'InfluxDB' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==67) ) {
                alt34=1;
            }
            else if ( (LA34_0==68) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalDsl.g:3252:3: (enumLiteral_0= 'TimeScaleDB' )
                    {
                    // InternalDsl.g:3252:3: (enumLiteral_0= 'TimeScaleDB' )
                    // InternalDsl.g:3253:4: enumLiteral_0= 'TimeScaleDB'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getDatabaseTypeAccess().getTimeScaleDBEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDatabaseTypeAccess().getTimeScaleDBEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:3260:3: (enumLiteral_1= 'InfluxDB' )
                    {
                    // InternalDsl.g:3260:3: (enumLiteral_1= 'InfluxDB' )
                    // InternalDsl.g:3261:4: enumLiteral_1= 'InfluxDB'
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getDatabaseTypeAccess().getInfluxDBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDatabaseTypeAccess().getInfluxDBEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleDatabaseType"


    // $ANTLR start "ruleUserPolicy"
    // InternalDsl.g:3271:1: ruleUserPolicy returns [Enumerator current=null] : (enumLiteral_0= 'NavigationDirections' ) ;
    public final Enumerator ruleUserPolicy() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalDsl.g:3277:2: ( (enumLiteral_0= 'NavigationDirections' ) )
            // InternalDsl.g:3278:2: (enumLiteral_0= 'NavigationDirections' )
            {
            // InternalDsl.g:3278:2: (enumLiteral_0= 'NavigationDirections' )
            // InternalDsl.g:3279:3: enumLiteral_0= 'NavigationDirections'
            {
            enumLiteral_0=(Token)match(input,69,FOLLOW_2); 

            			current = grammarAccess.getUserPolicyAccess().getNavigationDirectionsEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getUserPolicyAccess().getNavigationDirectionsEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleUserPolicy"


    // $ANTLR start "ruleWebServerType"
    // InternalDsl.g:3288:1: ruleWebServerType returns [Enumerator current=null] : ( (enumLiteral_0= 'GeoServer' ) | (enumLiteral_1= 'Apache' ) ) ;
    public final Enumerator ruleWebServerType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDsl.g:3294:2: ( ( (enumLiteral_0= 'GeoServer' ) | (enumLiteral_1= 'Apache' ) ) )
            // InternalDsl.g:3295:2: ( (enumLiteral_0= 'GeoServer' ) | (enumLiteral_1= 'Apache' ) )
            {
            // InternalDsl.g:3295:2: ( (enumLiteral_0= 'GeoServer' ) | (enumLiteral_1= 'Apache' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==70) ) {
                alt35=1;
            }
            else if ( (LA35_0==71) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalDsl.g:3296:3: (enumLiteral_0= 'GeoServer' )
                    {
                    // InternalDsl.g:3296:3: (enumLiteral_0= 'GeoServer' )
                    // InternalDsl.g:3297:4: enumLiteral_0= 'GeoServer'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getWebServerTypeAccess().getGeoServerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWebServerTypeAccess().getGeoServerEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:3304:3: (enumLiteral_1= 'Apache' )
                    {
                    // InternalDsl.g:3304:3: (enumLiteral_1= 'Apache' )
                    // InternalDsl.g:3305:4: enumLiteral_1= 'Apache'
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getWebServerTypeAccess().getApacheEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWebServerTypeAccess().getApacheEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleWebServerType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004060L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002000004000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000020000004000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000404000000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001000000060L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000001000004060L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x01FE000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000001000004000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000002060L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000010000004060L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000040000004000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0xFE00000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000200001000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0001800000000002L});

}