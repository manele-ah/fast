package fr.ubo.fast.dsl.ide.contentassist.antlr.internal;

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
import fr.ubo.fast.dsl.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NavigationDirections'", "'E'", "'e'", "'Celsius'", "'Meter'", "'MeterPerSecond'", "'Bar'", "'Liter'", "'Gram'", "'Radian'", "'None'", "'Millisecond'", "'Second'", "'Minute'", "'Hour'", "'Day'", "'Month'", "'Year'", "'Linux'", "'Windows'", "'MacOS'", "'TimeScaleDB'", "'InfluxDB'", "'GeoServer'", "'Apache'", "'Tools'", "'{'", "';'", "'}'", "'Data'", "'Sensors'", "'TimeSeries'", "'HwArchitecture'", "'Computers'", "'Networks'", "'Tool'", "'('", "'on'", "','", "')'", "'userTime'", "'pingTime'", "'rawDataThreshold'", "'preComputedDataThreshold'", "'startTime'", "'endTime'", "'period'", "'database'", "'measures'", "'in'", "'metadata'", "'Computer'", "'-'", "'networkInterfaces'", "'Docker'", "'network'", "'interface'", "'scale'", "'['", "']'", "'.'"
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
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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
    public static final int RULE_STRING=4;
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

    	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleTimeSeriesFramework"
    // InternalDsl.g:53:1: entryRuleTimeSeriesFramework : ruleTimeSeriesFramework EOF ;
    public final void entryRuleTimeSeriesFramework() throws RecognitionException {
        try {
            // InternalDsl.g:54:1: ( ruleTimeSeriesFramework EOF )
            // InternalDsl.g:55:1: ruleTimeSeriesFramework EOF
            {
             before(grammarAccess.getTimeSeriesFrameworkRule()); 
            pushFollow(FOLLOW_1);
            ruleTimeSeriesFramework();

            state._fsp--;

             after(grammarAccess.getTimeSeriesFrameworkRule()); 
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
    // $ANTLR end "entryRuleTimeSeriesFramework"


    // $ANTLR start "ruleTimeSeriesFramework"
    // InternalDsl.g:62:1: ruleTimeSeriesFramework : ( ( rule__TimeSeriesFramework__Group__0 ) ) ;
    public final void ruleTimeSeriesFramework() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:66:2: ( ( ( rule__TimeSeriesFramework__Group__0 ) ) )
            // InternalDsl.g:67:2: ( ( rule__TimeSeriesFramework__Group__0 ) )
            {
            // InternalDsl.g:67:2: ( ( rule__TimeSeriesFramework__Group__0 ) )
            // InternalDsl.g:68:3: ( rule__TimeSeriesFramework__Group__0 )
            {
             before(grammarAccess.getTimeSeriesFrameworkAccess().getGroup()); 
            // InternalDsl.g:69:3: ( rule__TimeSeriesFramework__Group__0 )
            // InternalDsl.g:69:4: rule__TimeSeriesFramework__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TimeSeriesFramework__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeSeriesFrameworkAccess().getGroup()); 

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
    // $ANTLR end "ruleTimeSeriesFramework"


    // $ANTLR start "entryRuleVisualizationClient"
    // InternalDsl.g:78:1: entryRuleVisualizationClient : ruleVisualizationClient EOF ;
    public final void entryRuleVisualizationClient() throws RecognitionException {
        try {
            // InternalDsl.g:79:1: ( ruleVisualizationClient EOF )
            // InternalDsl.g:80:1: ruleVisualizationClient EOF
            {
             before(grammarAccess.getVisualizationClientRule()); 
            pushFollow(FOLLOW_1);
            ruleVisualizationClient();

            state._fsp--;

             after(grammarAccess.getVisualizationClientRule()); 
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
    // $ANTLR end "entryRuleVisualizationClient"


    // $ANTLR start "ruleVisualizationClient"
    // InternalDsl.g:87:1: ruleVisualizationClient : ( ruleMinMaxVisualizationClient ) ;
    public final void ruleVisualizationClient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:91:2: ( ( ruleMinMaxVisualizationClient ) )
            // InternalDsl.g:92:2: ( ruleMinMaxVisualizationClient )
            {
            // InternalDsl.g:92:2: ( ruleMinMaxVisualizationClient )
            // InternalDsl.g:93:3: ruleMinMaxVisualizationClient
            {
             before(grammarAccess.getVisualizationClientAccess().getMinMaxVisualizationClientParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleMinMaxVisualizationClient();

            state._fsp--;

             after(grammarAccess.getVisualizationClientAccess().getMinMaxVisualizationClientParserRuleCall()); 

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
    // $ANTLR end "ruleVisualizationClient"


    // $ANTLR start "entryRuleScale"
    // InternalDsl.g:103:1: entryRuleScale : ruleScale EOF ;
    public final void entryRuleScale() throws RecognitionException {
        try {
            // InternalDsl.g:104:1: ( ruleScale EOF )
            // InternalDsl.g:105:1: ruleScale EOF
            {
             before(grammarAccess.getScaleRule()); 
            pushFollow(FOLLOW_1);
            ruleScale();

            state._fsp--;

             after(grammarAccess.getScaleRule()); 
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
    // $ANTLR end "entryRuleScale"


    // $ANTLR start "ruleScale"
    // InternalDsl.g:112:1: ruleScale : ( ( rule__Scale__Alternatives ) ) ;
    public final void ruleScale() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:116:2: ( ( ( rule__Scale__Alternatives ) ) )
            // InternalDsl.g:117:2: ( ( rule__Scale__Alternatives ) )
            {
            // InternalDsl.g:117:2: ( ( rule__Scale__Alternatives ) )
            // InternalDsl.g:118:3: ( rule__Scale__Alternatives )
            {
             before(grammarAccess.getScaleAccess().getAlternatives()); 
            // InternalDsl.g:119:3: ( rule__Scale__Alternatives )
            // InternalDsl.g:119:4: rule__Scale__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Scale__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getScaleAccess().getAlternatives()); 

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
    // $ANTLR end "ruleScale"


    // $ANTLR start "entryRuleService"
    // InternalDsl.g:128:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // InternalDsl.g:129:1: ( ruleService EOF )
            // InternalDsl.g:130:1: ruleService EOF
            {
             before(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleService();

            state._fsp--;

             after(grammarAccess.getServiceRule()); 
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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalDsl.g:137:1: ruleService : ( ( rule__Service__Alternatives ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:141:2: ( ( ( rule__Service__Alternatives ) ) )
            // InternalDsl.g:142:2: ( ( rule__Service__Alternatives ) )
            {
            // InternalDsl.g:142:2: ( ( rule__Service__Alternatives ) )
            // InternalDsl.g:143:3: ( rule__Service__Alternatives )
            {
             before(grammarAccess.getServiceAccess().getAlternatives()); 
            // InternalDsl.g:144:3: ( rule__Service__Alternatives )
            // InternalDsl.g:144:4: rule__Service__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Service__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getAlternatives()); 

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleData"
    // InternalDsl.g:153:1: entryRuleData : ruleData EOF ;
    public final void entryRuleData() throws RecognitionException {
        try {
            // InternalDsl.g:154:1: ( ruleData EOF )
            // InternalDsl.g:155:1: ruleData EOF
            {
             before(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_1);
            ruleData();

            state._fsp--;

             after(grammarAccess.getDataRule()); 
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
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // InternalDsl.g:162:1: ruleData : ( ( rule__Data__Group__0 ) ) ;
    public final void ruleData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:166:2: ( ( ( rule__Data__Group__0 ) ) )
            // InternalDsl.g:167:2: ( ( rule__Data__Group__0 ) )
            {
            // InternalDsl.g:167:2: ( ( rule__Data__Group__0 ) )
            // InternalDsl.g:168:3: ( rule__Data__Group__0 )
            {
             before(grammarAccess.getDataAccess().getGroup()); 
            // InternalDsl.g:169:3: ( rule__Data__Group__0 )
            // InternalDsl.g:169:4: rule__Data__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Data__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getGroup()); 

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
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRulePlatform"
    // InternalDsl.g:178:1: entryRulePlatform : rulePlatform EOF ;
    public final void entryRulePlatform() throws RecognitionException {
        try {
            // InternalDsl.g:179:1: ( rulePlatform EOF )
            // InternalDsl.g:180:1: rulePlatform EOF
            {
             before(grammarAccess.getPlatformRule()); 
            pushFollow(FOLLOW_1);
            rulePlatform();

            state._fsp--;

             after(grammarAccess.getPlatformRule()); 
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
    // $ANTLR end "entryRulePlatform"


    // $ANTLR start "rulePlatform"
    // InternalDsl.g:187:1: rulePlatform : ( ( rule__Platform__Group__0 ) ) ;
    public final void rulePlatform() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:191:2: ( ( ( rule__Platform__Group__0 ) ) )
            // InternalDsl.g:192:2: ( ( rule__Platform__Group__0 ) )
            {
            // InternalDsl.g:192:2: ( ( rule__Platform__Group__0 ) )
            // InternalDsl.g:193:3: ( rule__Platform__Group__0 )
            {
             before(grammarAccess.getPlatformAccess().getGroup()); 
            // InternalDsl.g:194:3: ( rule__Platform__Group__0 )
            // InternalDsl.g:194:4: rule__Platform__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Platform__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getGroup()); 

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
    // $ANTLR end "rulePlatform"


    // $ANTLR start "entryRuleMinMaxVisualizationClient"
    // InternalDsl.g:203:1: entryRuleMinMaxVisualizationClient : ruleMinMaxVisualizationClient EOF ;
    public final void entryRuleMinMaxVisualizationClient() throws RecognitionException {
        try {
            // InternalDsl.g:204:1: ( ruleMinMaxVisualizationClient EOF )
            // InternalDsl.g:205:1: ruleMinMaxVisualizationClient EOF
            {
             before(grammarAccess.getMinMaxVisualizationClientRule()); 
            pushFollow(FOLLOW_1);
            ruleMinMaxVisualizationClient();

            state._fsp--;

             after(grammarAccess.getMinMaxVisualizationClientRule()); 
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
    // $ANTLR end "entryRuleMinMaxVisualizationClient"


    // $ANTLR start "ruleMinMaxVisualizationClient"
    // InternalDsl.g:212:1: ruleMinMaxVisualizationClient : ( ( rule__MinMaxVisualizationClient__Group__0 ) ) ;
    public final void ruleMinMaxVisualizationClient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:216:2: ( ( ( rule__MinMaxVisualizationClient__Group__0 ) ) )
            // InternalDsl.g:217:2: ( ( rule__MinMaxVisualizationClient__Group__0 ) )
            {
            // InternalDsl.g:217:2: ( ( rule__MinMaxVisualizationClient__Group__0 ) )
            // InternalDsl.g:218:3: ( rule__MinMaxVisualizationClient__Group__0 )
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getGroup()); 
            // InternalDsl.g:219:3: ( rule__MinMaxVisualizationClient__Group__0 )
            // InternalDsl.g:219:4: rule__MinMaxVisualizationClient__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMinMaxVisualizationClientAccess().getGroup()); 

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
    // $ANTLR end "ruleMinMaxVisualizationClient"


    // $ANTLR start "entryRuleTimeSeries"
    // InternalDsl.g:228:1: entryRuleTimeSeries : ruleTimeSeries EOF ;
    public final void entryRuleTimeSeries() throws RecognitionException {
        try {
            // InternalDsl.g:229:1: ( ruleTimeSeries EOF )
            // InternalDsl.g:230:1: ruleTimeSeries EOF
            {
             before(grammarAccess.getTimeSeriesRule()); 
            pushFollow(FOLLOW_1);
            ruleTimeSeries();

            state._fsp--;

             after(grammarAccess.getTimeSeriesRule()); 
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
    // $ANTLR end "entryRuleTimeSeries"


    // $ANTLR start "ruleTimeSeries"
    // InternalDsl.g:237:1: ruleTimeSeries : ( ( rule__TimeSeries__Group__0 ) ) ;
    public final void ruleTimeSeries() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:241:2: ( ( ( rule__TimeSeries__Group__0 ) ) )
            // InternalDsl.g:242:2: ( ( rule__TimeSeries__Group__0 ) )
            {
            // InternalDsl.g:242:2: ( ( rule__TimeSeries__Group__0 ) )
            // InternalDsl.g:243:3: ( rule__TimeSeries__Group__0 )
            {
             before(grammarAccess.getTimeSeriesAccess().getGroup()); 
            // InternalDsl.g:244:3: ( rule__TimeSeries__Group__0 )
            // InternalDsl.g:244:4: rule__TimeSeries__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TimeSeries__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeSeriesAccess().getGroup()); 

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
    // $ANTLR end "ruleTimeSeries"


    // $ANTLR start "entryRuleSensor"
    // InternalDsl.g:253:1: entryRuleSensor : ruleSensor EOF ;
    public final void entryRuleSensor() throws RecognitionException {
        try {
            // InternalDsl.g:254:1: ( ruleSensor EOF )
            // InternalDsl.g:255:1: ruleSensor EOF
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
    // InternalDsl.g:262:1: ruleSensor : ( ( rule__Sensor__Group__0 ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:266:2: ( ( ( rule__Sensor__Group__0 ) ) )
            // InternalDsl.g:267:2: ( ( rule__Sensor__Group__0 ) )
            {
            // InternalDsl.g:267:2: ( ( rule__Sensor__Group__0 ) )
            // InternalDsl.g:268:3: ( rule__Sensor__Group__0 )
            {
             before(grammarAccess.getSensorAccess().getGroup()); 
            // InternalDsl.g:269:3: ( rule__Sensor__Group__0 )
            // InternalDsl.g:269:4: rule__Sensor__Group__0
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


    // $ANTLR start "entryRuleMeasuredVariable"
    // InternalDsl.g:278:1: entryRuleMeasuredVariable : ruleMeasuredVariable EOF ;
    public final void entryRuleMeasuredVariable() throws RecognitionException {
        try {
            // InternalDsl.g:279:1: ( ruleMeasuredVariable EOF )
            // InternalDsl.g:280:1: ruleMeasuredVariable EOF
            {
             before(grammarAccess.getMeasuredVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleMeasuredVariable();

            state._fsp--;

             after(grammarAccess.getMeasuredVariableRule()); 
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
    // $ANTLR end "entryRuleMeasuredVariable"


    // $ANTLR start "ruleMeasuredVariable"
    // InternalDsl.g:287:1: ruleMeasuredVariable : ( ( rule__MeasuredVariable__Group__0 ) ) ;
    public final void ruleMeasuredVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:291:2: ( ( ( rule__MeasuredVariable__Group__0 ) ) )
            // InternalDsl.g:292:2: ( ( rule__MeasuredVariable__Group__0 ) )
            {
            // InternalDsl.g:292:2: ( ( rule__MeasuredVariable__Group__0 ) )
            // InternalDsl.g:293:3: ( rule__MeasuredVariable__Group__0 )
            {
             before(grammarAccess.getMeasuredVariableAccess().getGroup()); 
            // InternalDsl.g:294:3: ( rule__MeasuredVariable__Group__0 )
            // InternalDsl.g:294:4: rule__MeasuredVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MeasuredVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMeasuredVariableAccess().getGroup()); 

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
    // $ANTLR end "ruleMeasuredVariable"


    // $ANTLR start "entryRuleMetaData"
    // InternalDsl.g:303:1: entryRuleMetaData : ruleMetaData EOF ;
    public final void entryRuleMetaData() throws RecognitionException {
        try {
            // InternalDsl.g:304:1: ( ruleMetaData EOF )
            // InternalDsl.g:305:1: ruleMetaData EOF
            {
             before(grammarAccess.getMetaDataRule()); 
            pushFollow(FOLLOW_1);
            ruleMetaData();

            state._fsp--;

             after(grammarAccess.getMetaDataRule()); 
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
    // $ANTLR end "entryRuleMetaData"


    // $ANTLR start "ruleMetaData"
    // InternalDsl.g:312:1: ruleMetaData : ( ( rule__MetaData__Group__0 ) ) ;
    public final void ruleMetaData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:316:2: ( ( ( rule__MetaData__Group__0 ) ) )
            // InternalDsl.g:317:2: ( ( rule__MetaData__Group__0 ) )
            {
            // InternalDsl.g:317:2: ( ( rule__MetaData__Group__0 ) )
            // InternalDsl.g:318:3: ( rule__MetaData__Group__0 )
            {
             before(grammarAccess.getMetaDataAccess().getGroup()); 
            // InternalDsl.g:319:3: ( rule__MetaData__Group__0 )
            // InternalDsl.g:319:4: rule__MetaData__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MetaData__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetaDataAccess().getGroup()); 

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
    // $ANTLR end "ruleMetaData"


    // $ANTLR start "entryRuleDatabase"
    // InternalDsl.g:328:1: entryRuleDatabase : ruleDatabase EOF ;
    public final void entryRuleDatabase() throws RecognitionException {
        try {
            // InternalDsl.g:329:1: ( ruleDatabase EOF )
            // InternalDsl.g:330:1: ruleDatabase EOF
            {
             before(grammarAccess.getDatabaseRule()); 
            pushFollow(FOLLOW_1);
            ruleDatabase();

            state._fsp--;

             after(grammarAccess.getDatabaseRule()); 
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
    // $ANTLR end "entryRuleDatabase"


    // $ANTLR start "ruleDatabase"
    // InternalDsl.g:337:1: ruleDatabase : ( ( rule__Database__Group__0 ) ) ;
    public final void ruleDatabase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:341:2: ( ( ( rule__Database__Group__0 ) ) )
            // InternalDsl.g:342:2: ( ( rule__Database__Group__0 ) )
            {
            // InternalDsl.g:342:2: ( ( rule__Database__Group__0 ) )
            // InternalDsl.g:343:3: ( rule__Database__Group__0 )
            {
             before(grammarAccess.getDatabaseAccess().getGroup()); 
            // InternalDsl.g:344:3: ( rule__Database__Group__0 )
            // InternalDsl.g:344:4: rule__Database__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Database__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getGroup()); 

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
    // $ANTLR end "ruleDatabase"


    // $ANTLR start "entryRuleFile"
    // InternalDsl.g:353:1: entryRuleFile : ruleFile EOF ;
    public final void entryRuleFile() throws RecognitionException {
        try {
            // InternalDsl.g:354:1: ( ruleFile EOF )
            // InternalDsl.g:355:1: ruleFile EOF
            {
             before(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_1);
            ruleFile();

            state._fsp--;

             after(grammarAccess.getFileRule()); 
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
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // InternalDsl.g:362:1: ruleFile : ( ( rule__File__Group__0 ) ) ;
    public final void ruleFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:366:2: ( ( ( rule__File__Group__0 ) ) )
            // InternalDsl.g:367:2: ( ( rule__File__Group__0 ) )
            {
            // InternalDsl.g:367:2: ( ( rule__File__Group__0 ) )
            // InternalDsl.g:368:3: ( rule__File__Group__0 )
            {
             before(grammarAccess.getFileAccess().getGroup()); 
            // InternalDsl.g:369:3: ( rule__File__Group__0 )
            // InternalDsl.g:369:4: rule__File__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__File__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getGroup()); 

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
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleComputer"
    // InternalDsl.g:378:1: entryRuleComputer : ruleComputer EOF ;
    public final void entryRuleComputer() throws RecognitionException {
        try {
            // InternalDsl.g:379:1: ( ruleComputer EOF )
            // InternalDsl.g:380:1: ruleComputer EOF
            {
             before(grammarAccess.getComputerRule()); 
            pushFollow(FOLLOW_1);
            ruleComputer();

            state._fsp--;

             after(grammarAccess.getComputerRule()); 
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
    // $ANTLR end "entryRuleComputer"


    // $ANTLR start "ruleComputer"
    // InternalDsl.g:387:1: ruleComputer : ( ( rule__Computer__Group__0 ) ) ;
    public final void ruleComputer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:391:2: ( ( ( rule__Computer__Group__0 ) ) )
            // InternalDsl.g:392:2: ( ( rule__Computer__Group__0 ) )
            {
            // InternalDsl.g:392:2: ( ( rule__Computer__Group__0 ) )
            // InternalDsl.g:393:3: ( rule__Computer__Group__0 )
            {
             before(grammarAccess.getComputerAccess().getGroup()); 
            // InternalDsl.g:394:3: ( rule__Computer__Group__0 )
            // InternalDsl.g:394:4: rule__Computer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Computer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComputerAccess().getGroup()); 

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
    // $ANTLR end "ruleComputer"


    // $ANTLR start "entryRuleDockerDeployment"
    // InternalDsl.g:403:1: entryRuleDockerDeployment : ruleDockerDeployment EOF ;
    public final void entryRuleDockerDeployment() throws RecognitionException {
        try {
            // InternalDsl.g:404:1: ( ruleDockerDeployment EOF )
            // InternalDsl.g:405:1: ruleDockerDeployment EOF
            {
             before(grammarAccess.getDockerDeploymentRule()); 
            pushFollow(FOLLOW_1);
            ruleDockerDeployment();

            state._fsp--;

             after(grammarAccess.getDockerDeploymentRule()); 
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
    // $ANTLR end "entryRuleDockerDeployment"


    // $ANTLR start "ruleDockerDeployment"
    // InternalDsl.g:412:1: ruleDockerDeployment : ( ( rule__DockerDeployment__Group__0 ) ) ;
    public final void ruleDockerDeployment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:416:2: ( ( ( rule__DockerDeployment__Group__0 ) ) )
            // InternalDsl.g:417:2: ( ( rule__DockerDeployment__Group__0 ) )
            {
            // InternalDsl.g:417:2: ( ( rule__DockerDeployment__Group__0 ) )
            // InternalDsl.g:418:3: ( rule__DockerDeployment__Group__0 )
            {
             before(grammarAccess.getDockerDeploymentAccess().getGroup()); 
            // InternalDsl.g:419:3: ( rule__DockerDeployment__Group__0 )
            // InternalDsl.g:419:4: rule__DockerDeployment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DockerDeployment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDockerDeploymentAccess().getGroup()); 

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
    // $ANTLR end "ruleDockerDeployment"


    // $ANTLR start "entryRuleNetwork"
    // InternalDsl.g:428:1: entryRuleNetwork : ruleNetwork EOF ;
    public final void entryRuleNetwork() throws RecognitionException {
        try {
            // InternalDsl.g:429:1: ( ruleNetwork EOF )
            // InternalDsl.g:430:1: ruleNetwork EOF
            {
             before(grammarAccess.getNetworkRule()); 
            pushFollow(FOLLOW_1);
            ruleNetwork();

            state._fsp--;

             after(grammarAccess.getNetworkRule()); 
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
    // $ANTLR end "entryRuleNetwork"


    // $ANTLR start "ruleNetwork"
    // InternalDsl.g:437:1: ruleNetwork : ( ( rule__Network__Group__0 ) ) ;
    public final void ruleNetwork() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:441:2: ( ( ( rule__Network__Group__0 ) ) )
            // InternalDsl.g:442:2: ( ( rule__Network__Group__0 ) )
            {
            // InternalDsl.g:442:2: ( ( rule__Network__Group__0 ) )
            // InternalDsl.g:443:3: ( rule__Network__Group__0 )
            {
             before(grammarAccess.getNetworkAccess().getGroup()); 
            // InternalDsl.g:444:3: ( rule__Network__Group__0 )
            // InternalDsl.g:444:4: rule__Network__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Network__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNetworkAccess().getGroup()); 

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
    // $ANTLR end "ruleNetwork"


    // $ANTLR start "entryRuleContainer"
    // InternalDsl.g:453:1: entryRuleContainer : ruleContainer EOF ;
    public final void entryRuleContainer() throws RecognitionException {
        try {
            // InternalDsl.g:454:1: ( ruleContainer EOF )
            // InternalDsl.g:455:1: ruleContainer EOF
            {
             before(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getContainerRule()); 
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
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalDsl.g:462:1: ruleContainer : ( ( rule__Container__Group__0 ) ) ;
    public final void ruleContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:466:2: ( ( ( rule__Container__Group__0 ) ) )
            // InternalDsl.g:467:2: ( ( rule__Container__Group__0 ) )
            {
            // InternalDsl.g:467:2: ( ( rule__Container__Group__0 ) )
            // InternalDsl.g:468:3: ( rule__Container__Group__0 )
            {
             before(grammarAccess.getContainerAccess().getGroup()); 
            // InternalDsl.g:469:3: ( rule__Container__Group__0 )
            // InternalDsl.g:469:4: rule__Container__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getGroup()); 

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
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleNetworkInterface"
    // InternalDsl.g:478:1: entryRuleNetworkInterface : ruleNetworkInterface EOF ;
    public final void entryRuleNetworkInterface() throws RecognitionException {
        try {
            // InternalDsl.g:479:1: ( ruleNetworkInterface EOF )
            // InternalDsl.g:480:1: ruleNetworkInterface EOF
            {
             before(grammarAccess.getNetworkInterfaceRule()); 
            pushFollow(FOLLOW_1);
            ruleNetworkInterface();

            state._fsp--;

             after(grammarAccess.getNetworkInterfaceRule()); 
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
    // $ANTLR end "entryRuleNetworkInterface"


    // $ANTLR start "ruleNetworkInterface"
    // InternalDsl.g:487:1: ruleNetworkInterface : ( ( rule__NetworkInterface__Group__0 ) ) ;
    public final void ruleNetworkInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:491:2: ( ( ( rule__NetworkInterface__Group__0 ) ) )
            // InternalDsl.g:492:2: ( ( rule__NetworkInterface__Group__0 ) )
            {
            // InternalDsl.g:492:2: ( ( rule__NetworkInterface__Group__0 ) )
            // InternalDsl.g:493:3: ( rule__NetworkInterface__Group__0 )
            {
             before(grammarAccess.getNetworkInterfaceAccess().getGroup()); 
            // InternalDsl.g:494:3: ( rule__NetworkInterface__Group__0 )
            // InternalDsl.g:494:4: rule__NetworkInterface__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NetworkInterface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNetworkInterfaceAccess().getGroup()); 

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
    // $ANTLR end "ruleNetworkInterface"


    // $ANTLR start "entryRuleWebServer"
    // InternalDsl.g:503:1: entryRuleWebServer : ruleWebServer EOF ;
    public final void entryRuleWebServer() throws RecognitionException {
        try {
            // InternalDsl.g:504:1: ( ruleWebServer EOF )
            // InternalDsl.g:505:1: ruleWebServer EOF
            {
             before(grammarAccess.getWebServerRule()); 
            pushFollow(FOLLOW_1);
            ruleWebServer();

            state._fsp--;

             after(grammarAccess.getWebServerRule()); 
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
    // $ANTLR end "entryRuleWebServer"


    // $ANTLR start "ruleWebServer"
    // InternalDsl.g:512:1: ruleWebServer : ( ( rule__WebServer__Group__0 ) ) ;
    public final void ruleWebServer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:516:2: ( ( ( rule__WebServer__Group__0 ) ) )
            // InternalDsl.g:517:2: ( ( rule__WebServer__Group__0 ) )
            {
            // InternalDsl.g:517:2: ( ( rule__WebServer__Group__0 ) )
            // InternalDsl.g:518:3: ( rule__WebServer__Group__0 )
            {
             before(grammarAccess.getWebServerAccess().getGroup()); 
            // InternalDsl.g:519:3: ( rule__WebServer__Group__0 )
            // InternalDsl.g:519:4: rule__WebServer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WebServer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWebServerAccess().getGroup()); 

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
    // $ANTLR end "ruleWebServer"


    // $ANTLR start "entryRuleCalendarScale"
    // InternalDsl.g:528:1: entryRuleCalendarScale : ruleCalendarScale EOF ;
    public final void entryRuleCalendarScale() throws RecognitionException {
        try {
            // InternalDsl.g:529:1: ( ruleCalendarScale EOF )
            // InternalDsl.g:530:1: ruleCalendarScale EOF
            {
             before(grammarAccess.getCalendarScaleRule()); 
            pushFollow(FOLLOW_1);
            ruleCalendarScale();

            state._fsp--;

             after(grammarAccess.getCalendarScaleRule()); 
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
    // $ANTLR end "entryRuleCalendarScale"


    // $ANTLR start "ruleCalendarScale"
    // InternalDsl.g:537:1: ruleCalendarScale : ( ( rule__CalendarScale__Group__0 ) ) ;
    public final void ruleCalendarScale() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:541:2: ( ( ( rule__CalendarScale__Group__0 ) ) )
            // InternalDsl.g:542:2: ( ( rule__CalendarScale__Group__0 ) )
            {
            // InternalDsl.g:542:2: ( ( rule__CalendarScale__Group__0 ) )
            // InternalDsl.g:543:3: ( rule__CalendarScale__Group__0 )
            {
             before(grammarAccess.getCalendarScaleAccess().getGroup()); 
            // InternalDsl.g:544:3: ( rule__CalendarScale__Group__0 )
            // InternalDsl.g:544:4: rule__CalendarScale__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CalendarScale__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCalendarScaleAccess().getGroup()); 

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
    // $ANTLR end "ruleCalendarScale"


    // $ANTLR start "entryRuleFactorScale"
    // InternalDsl.g:553:1: entryRuleFactorScale : ruleFactorScale EOF ;
    public final void entryRuleFactorScale() throws RecognitionException {
        try {
            // InternalDsl.g:554:1: ( ruleFactorScale EOF )
            // InternalDsl.g:555:1: ruleFactorScale EOF
            {
             before(grammarAccess.getFactorScaleRule()); 
            pushFollow(FOLLOW_1);
            ruleFactorScale();

            state._fsp--;

             after(grammarAccess.getFactorScaleRule()); 
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
    // $ANTLR end "entryRuleFactorScale"


    // $ANTLR start "ruleFactorScale"
    // InternalDsl.g:562:1: ruleFactorScale : ( ( rule__FactorScale__Group__0 ) ) ;
    public final void ruleFactorScale() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:566:2: ( ( ( rule__FactorScale__Group__0 ) ) )
            // InternalDsl.g:567:2: ( ( rule__FactorScale__Group__0 ) )
            {
            // InternalDsl.g:567:2: ( ( rule__FactorScale__Group__0 ) )
            // InternalDsl.g:568:3: ( rule__FactorScale__Group__0 )
            {
             before(grammarAccess.getFactorScaleAccess().getGroup()); 
            // InternalDsl.g:569:3: ( rule__FactorScale__Group__0 )
            // InternalDsl.g:569:4: rule__FactorScale__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FactorScale__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFactorScaleAccess().getGroup()); 

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
    // $ANTLR end "ruleFactorScale"


    // $ANTLR start "entryRuleELong"
    // InternalDsl.g:578:1: entryRuleELong : ruleELong EOF ;
    public final void entryRuleELong() throws RecognitionException {
        try {
            // InternalDsl.g:579:1: ( ruleELong EOF )
            // InternalDsl.g:580:1: ruleELong EOF
            {
             before(grammarAccess.getELongRule()); 
            pushFollow(FOLLOW_1);
            ruleELong();

            state._fsp--;

             after(grammarAccess.getELongRule()); 
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
    // $ANTLR end "entryRuleELong"


    // $ANTLR start "ruleELong"
    // InternalDsl.g:587:1: ruleELong : ( ( rule__ELong__Group__0 ) ) ;
    public final void ruleELong() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:591:2: ( ( ( rule__ELong__Group__0 ) ) )
            // InternalDsl.g:592:2: ( ( rule__ELong__Group__0 ) )
            {
            // InternalDsl.g:592:2: ( ( rule__ELong__Group__0 ) )
            // InternalDsl.g:593:3: ( rule__ELong__Group__0 )
            {
             before(grammarAccess.getELongAccess().getGroup()); 
            // InternalDsl.g:594:3: ( rule__ELong__Group__0 )
            // InternalDsl.g:594:4: rule__ELong__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ELong__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getELongAccess().getGroup()); 

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
    // $ANTLR end "ruleELong"


    // $ANTLR start "entryRuleEString"
    // InternalDsl.g:603:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalDsl.g:604:1: ( ruleEString EOF )
            // InternalDsl.g:605:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDsl.g:612:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:616:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalDsl.g:617:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalDsl.g:617:2: ( ( rule__EString__Alternatives ) )
            // InternalDsl.g:618:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalDsl.g:619:3: ( rule__EString__Alternatives )
            // InternalDsl.g:619:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEDouble"
    // InternalDsl.g:628:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalDsl.g:629:1: ( ruleEDouble EOF )
            // InternalDsl.g:630:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalDsl.g:637:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:641:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalDsl.g:642:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalDsl.g:642:2: ( ( rule__EDouble__Group__0 ) )
            // InternalDsl.g:643:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalDsl.g:644:3: ( rule__EDouble__Group__0 )
            // InternalDsl.g:644:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEInt"
    // InternalDsl.g:653:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalDsl.g:654:1: ( ruleEInt EOF )
            // InternalDsl.g:655:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalDsl.g:662:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:666:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalDsl.g:667:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalDsl.g:667:2: ( ( rule__EInt__Group__0 ) )
            // InternalDsl.g:668:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalDsl.g:669:3: ( rule__EInt__Group__0 )
            // InternalDsl.g:669:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleMeasurementDataUnit"
    // InternalDsl.g:678:1: ruleMeasurementDataUnit : ( ( rule__MeasurementDataUnit__Alternatives ) ) ;
    public final void ruleMeasurementDataUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:682:1: ( ( ( rule__MeasurementDataUnit__Alternatives ) ) )
            // InternalDsl.g:683:2: ( ( rule__MeasurementDataUnit__Alternatives ) )
            {
            // InternalDsl.g:683:2: ( ( rule__MeasurementDataUnit__Alternatives ) )
            // InternalDsl.g:684:3: ( rule__MeasurementDataUnit__Alternatives )
            {
             before(grammarAccess.getMeasurementDataUnitAccess().getAlternatives()); 
            // InternalDsl.g:685:3: ( rule__MeasurementDataUnit__Alternatives )
            // InternalDsl.g:685:4: rule__MeasurementDataUnit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementDataUnit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementDataUnitAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMeasurementDataUnit"


    // $ANTLR start "rulePeriod"
    // InternalDsl.g:694:1: rulePeriod : ( ( rule__Period__Alternatives ) ) ;
    public final void rulePeriod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:698:1: ( ( ( rule__Period__Alternatives ) ) )
            // InternalDsl.g:699:2: ( ( rule__Period__Alternatives ) )
            {
            // InternalDsl.g:699:2: ( ( rule__Period__Alternatives ) )
            // InternalDsl.g:700:3: ( rule__Period__Alternatives )
            {
             before(grammarAccess.getPeriodAccess().getAlternatives()); 
            // InternalDsl.g:701:3: ( rule__Period__Alternatives )
            // InternalDsl.g:701:4: rule__Period__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Period__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPeriodAccess().getAlternatives()); 

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
    // $ANTLR end "rulePeriod"


    // $ANTLR start "ruleOSType"
    // InternalDsl.g:710:1: ruleOSType : ( ( rule__OSType__Alternatives ) ) ;
    public final void ruleOSType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:714:1: ( ( ( rule__OSType__Alternatives ) ) )
            // InternalDsl.g:715:2: ( ( rule__OSType__Alternatives ) )
            {
            // InternalDsl.g:715:2: ( ( rule__OSType__Alternatives ) )
            // InternalDsl.g:716:3: ( rule__OSType__Alternatives )
            {
             before(grammarAccess.getOSTypeAccess().getAlternatives()); 
            // InternalDsl.g:717:3: ( rule__OSType__Alternatives )
            // InternalDsl.g:717:4: rule__OSType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OSType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOSTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOSType"


    // $ANTLR start "ruleDatabaseType"
    // InternalDsl.g:726:1: ruleDatabaseType : ( ( rule__DatabaseType__Alternatives ) ) ;
    public final void ruleDatabaseType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:730:1: ( ( ( rule__DatabaseType__Alternatives ) ) )
            // InternalDsl.g:731:2: ( ( rule__DatabaseType__Alternatives ) )
            {
            // InternalDsl.g:731:2: ( ( rule__DatabaseType__Alternatives ) )
            // InternalDsl.g:732:3: ( rule__DatabaseType__Alternatives )
            {
             before(grammarAccess.getDatabaseTypeAccess().getAlternatives()); 
            // InternalDsl.g:733:3: ( rule__DatabaseType__Alternatives )
            // InternalDsl.g:733:4: rule__DatabaseType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DatabaseType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDatabaseType"


    // $ANTLR start "ruleUserPolicy"
    // InternalDsl.g:742:1: ruleUserPolicy : ( ( 'NavigationDirections' ) ) ;
    public final void ruleUserPolicy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:746:1: ( ( ( 'NavigationDirections' ) ) )
            // InternalDsl.g:747:2: ( ( 'NavigationDirections' ) )
            {
            // InternalDsl.g:747:2: ( ( 'NavigationDirections' ) )
            // InternalDsl.g:748:3: ( 'NavigationDirections' )
            {
             before(grammarAccess.getUserPolicyAccess().getNavigationDirectionsEnumLiteralDeclaration()); 
            // InternalDsl.g:749:3: ( 'NavigationDirections' )
            // InternalDsl.g:749:4: 'NavigationDirections'
            {
            match(input,11,FOLLOW_2); 

            }

             after(grammarAccess.getUserPolicyAccess().getNavigationDirectionsEnumLiteralDeclaration()); 

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
    // $ANTLR end "ruleUserPolicy"


    // $ANTLR start "ruleWebServerType"
    // InternalDsl.g:758:1: ruleWebServerType : ( ( rule__WebServerType__Alternatives ) ) ;
    public final void ruleWebServerType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:762:1: ( ( ( rule__WebServerType__Alternatives ) ) )
            // InternalDsl.g:763:2: ( ( rule__WebServerType__Alternatives ) )
            {
            // InternalDsl.g:763:2: ( ( rule__WebServerType__Alternatives ) )
            // InternalDsl.g:764:3: ( rule__WebServerType__Alternatives )
            {
             before(grammarAccess.getWebServerTypeAccess().getAlternatives()); 
            // InternalDsl.g:765:3: ( rule__WebServerType__Alternatives )
            // InternalDsl.g:765:4: rule__WebServerType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__WebServerType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWebServerTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleWebServerType"


    // $ANTLR start "rule__Scale__Alternatives"
    // InternalDsl.g:773:1: rule__Scale__Alternatives : ( ( ruleCalendarScale ) | ( ruleFactorScale ) );
    public final void rule__Scale__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:777:1: ( ( ruleCalendarScale ) | ( ruleFactorScale ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==68) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_STRING) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==47) ) {
                        int LA1_4 = input.LA(4);

                        if ( (LA1_4==RULE_INT||LA1_4==63) ) {
                            alt1=2;
                        }
                        else if ( (LA1_4==69) ) {
                            alt1=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA1_1==RULE_ID) ) {
                    int LA1_3 = input.LA(3);

                    if ( (LA1_3==47) ) {
                        int LA1_4 = input.LA(4);

                        if ( (LA1_4==RULE_INT||LA1_4==63) ) {
                            alt1=2;
                        }
                        else if ( (LA1_4==69) ) {
                            alt1=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDsl.g:778:2: ( ruleCalendarScale )
                    {
                    // InternalDsl.g:778:2: ( ruleCalendarScale )
                    // InternalDsl.g:779:3: ruleCalendarScale
                    {
                     before(grammarAccess.getScaleAccess().getCalendarScaleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCalendarScale();

                    state._fsp--;

                     after(grammarAccess.getScaleAccess().getCalendarScaleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:784:2: ( ruleFactorScale )
                    {
                    // InternalDsl.g:784:2: ( ruleFactorScale )
                    // InternalDsl.g:785:3: ruleFactorScale
                    {
                     before(grammarAccess.getScaleAccess().getFactorScaleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFactorScale();

                    state._fsp--;

                     after(grammarAccess.getScaleAccess().getFactorScaleParserRuleCall_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Scale__Alternatives"


    // $ANTLR start "rule__Service__Alternatives"
    // InternalDsl.g:794:1: rule__Service__Alternatives : ( ( ruleDatabase ) | ( ruleWebServer ) | ( ruleFile ) );
    public final void rule__Service__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:798:1: ( ( ruleDatabase ) | ( ruleWebServer ) | ( ruleFile ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==47) ) {
                    switch ( input.LA(3) ) {
                    case 32:
                    case 33:
                        {
                        alt2=1;
                        }
                        break;
                    case RULE_STRING:
                    case RULE_ID:
                        {
                        alt2=3;
                        }
                        break;
                    case 34:
                    case 35:
                        {
                        alt2=2;
                        }
                        break;
                    default:
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
            else if ( (LA2_0==RULE_ID) ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==47) ) {
                    switch ( input.LA(3) ) {
                    case 32:
                    case 33:
                        {
                        alt2=1;
                        }
                        break;
                    case RULE_STRING:
                    case RULE_ID:
                        {
                        alt2=3;
                        }
                        break;
                    case 34:
                    case 35:
                        {
                        alt2=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

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
                    // InternalDsl.g:799:2: ( ruleDatabase )
                    {
                    // InternalDsl.g:799:2: ( ruleDatabase )
                    // InternalDsl.g:800:3: ruleDatabase
                    {
                     before(grammarAccess.getServiceAccess().getDatabaseParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDatabase();

                    state._fsp--;

                     after(grammarAccess.getServiceAccess().getDatabaseParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:805:2: ( ruleWebServer )
                    {
                    // InternalDsl.g:805:2: ( ruleWebServer )
                    // InternalDsl.g:806:3: ruleWebServer
                    {
                     before(grammarAccess.getServiceAccess().getWebServerParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleWebServer();

                    state._fsp--;

                     after(grammarAccess.getServiceAccess().getWebServerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:811:2: ( ruleFile )
                    {
                    // InternalDsl.g:811:2: ( ruleFile )
                    // InternalDsl.g:812:3: ruleFile
                    {
                     before(grammarAccess.getServiceAccess().getFileParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFile();

                    state._fsp--;

                     after(grammarAccess.getServiceAccess().getFileParserRuleCall_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Service__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalDsl.g:821:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:825:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:826:2: ( RULE_STRING )
                    {
                    // InternalDsl.g:826:2: ( RULE_STRING )
                    // InternalDsl.g:827:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:832:2: ( RULE_ID )
                    {
                    // InternalDsl.g:832:2: ( RULE_ID )
                    // InternalDsl.g:833:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalDsl.g:842:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:846:1: ( ( 'E' ) | ( 'e' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:847:2: ( 'E' )
                    {
                    // InternalDsl.g:847:2: ( 'E' )
                    // InternalDsl.g:848:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:853:2: ( 'e' )
                    {
                    // InternalDsl.g:853:2: ( 'e' )
                    // InternalDsl.g:854:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__MeasurementDataUnit__Alternatives"
    // InternalDsl.g:863:1: rule__MeasurementDataUnit__Alternatives : ( ( ( 'Celsius' ) ) | ( ( 'Meter' ) ) | ( ( 'MeterPerSecond' ) ) | ( ( 'Bar' ) ) | ( ( 'Liter' ) ) | ( ( 'Gram' ) ) | ( ( 'Radian' ) ) | ( ( 'None' ) ) );
    public final void rule__MeasurementDataUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:867:1: ( ( ( 'Celsius' ) ) | ( ( 'Meter' ) ) | ( ( 'MeterPerSecond' ) ) | ( ( 'Bar' ) ) | ( ( 'Liter' ) ) | ( ( 'Gram' ) ) | ( ( 'Radian' ) ) | ( ( 'None' ) ) )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt5=1;
                }
                break;
            case 15:
                {
                alt5=2;
                }
                break;
            case 16:
                {
                alt5=3;
                }
                break;
            case 17:
                {
                alt5=4;
                }
                break;
            case 18:
                {
                alt5=5;
                }
                break;
            case 19:
                {
                alt5=6;
                }
                break;
            case 20:
                {
                alt5=7;
                }
                break;
            case 21:
                {
                alt5=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDsl.g:868:2: ( ( 'Celsius' ) )
                    {
                    // InternalDsl.g:868:2: ( ( 'Celsius' ) )
                    // InternalDsl.g:869:3: ( 'Celsius' )
                    {
                     before(grammarAccess.getMeasurementDataUnitAccess().getCelsiusEnumLiteralDeclaration_0()); 
                    // InternalDsl.g:870:3: ( 'Celsius' )
                    // InternalDsl.g:870:4: 'Celsius'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getMeasurementDataUnitAccess().getCelsiusEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:874:2: ( ( 'Meter' ) )
                    {
                    // InternalDsl.g:874:2: ( ( 'Meter' ) )
                    // InternalDsl.g:875:3: ( 'Meter' )
                    {
                     before(grammarAccess.getMeasurementDataUnitAccess().getMeterEnumLiteralDeclaration_1()); 
                    // InternalDsl.g:876:3: ( 'Meter' )
                    // InternalDsl.g:876:4: 'Meter'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getMeasurementDataUnitAccess().getMeterEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:880:2: ( ( 'MeterPerSecond' ) )
                    {
                    // InternalDsl.g:880:2: ( ( 'MeterPerSecond' ) )
                    // InternalDsl.g:881:3: ( 'MeterPerSecond' )
                    {
                     before(grammarAccess.getMeasurementDataUnitAccess().getMeterPerSecondEnumLiteralDeclaration_2()); 
                    // InternalDsl.g:882:3: ( 'MeterPerSecond' )
                    // InternalDsl.g:882:4: 'MeterPerSecond'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getMeasurementDataUnitAccess().getMeterPerSecondEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:886:2: ( ( 'Bar' ) )
                    {
                    // InternalDsl.g:886:2: ( ( 'Bar' ) )
                    // InternalDsl.g:887:3: ( 'Bar' )
                    {
                     before(grammarAccess.getMeasurementDataUnitAccess().getBarEnumLiteralDeclaration_3()); 
                    // InternalDsl.g:888:3: ( 'Bar' )
                    // InternalDsl.g:888:4: 'Bar'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getMeasurementDataUnitAccess().getBarEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:892:2: ( ( 'Liter' ) )
                    {
                    // InternalDsl.g:892:2: ( ( 'Liter' ) )
                    // InternalDsl.g:893:3: ( 'Liter' )
                    {
                     before(grammarAccess.getMeasurementDataUnitAccess().getLiterEnumLiteralDeclaration_4()); 
                    // InternalDsl.g:894:3: ( 'Liter' )
                    // InternalDsl.g:894:4: 'Liter'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getMeasurementDataUnitAccess().getLiterEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:898:2: ( ( 'Gram' ) )
                    {
                    // InternalDsl.g:898:2: ( ( 'Gram' ) )
                    // InternalDsl.g:899:3: ( 'Gram' )
                    {
                     before(grammarAccess.getMeasurementDataUnitAccess().getGramEnumLiteralDeclaration_5()); 
                    // InternalDsl.g:900:3: ( 'Gram' )
                    // InternalDsl.g:900:4: 'Gram'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getMeasurementDataUnitAccess().getGramEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:904:2: ( ( 'Radian' ) )
                    {
                    // InternalDsl.g:904:2: ( ( 'Radian' ) )
                    // InternalDsl.g:905:3: ( 'Radian' )
                    {
                     before(grammarAccess.getMeasurementDataUnitAccess().getRadianEnumLiteralDeclaration_6()); 
                    // InternalDsl.g:906:3: ( 'Radian' )
                    // InternalDsl.g:906:4: 'Radian'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getMeasurementDataUnitAccess().getRadianEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDsl.g:910:2: ( ( 'None' ) )
                    {
                    // InternalDsl.g:910:2: ( ( 'None' ) )
                    // InternalDsl.g:911:3: ( 'None' )
                    {
                     before(grammarAccess.getMeasurementDataUnitAccess().getNoneEnumLiteralDeclaration_7()); 
                    // InternalDsl.g:912:3: ( 'None' )
                    // InternalDsl.g:912:4: 'None'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getMeasurementDataUnitAccess().getNoneEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__MeasurementDataUnit__Alternatives"


    // $ANTLR start "rule__Period__Alternatives"
    // InternalDsl.g:920:1: rule__Period__Alternatives : ( ( ( 'Millisecond' ) ) | ( ( 'Second' ) ) | ( ( 'Minute' ) ) | ( ( 'Hour' ) ) | ( ( 'Day' ) ) | ( ( 'Month' ) ) | ( ( 'Year' ) ) );
    public final void rule__Period__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:924:1: ( ( ( 'Millisecond' ) ) | ( ( 'Second' ) ) | ( ( 'Minute' ) ) | ( ( 'Hour' ) ) | ( ( 'Day' ) ) | ( ( 'Month' ) ) | ( ( 'Year' ) ) )
            int alt6=7;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt6=1;
                }
                break;
            case 23:
                {
                alt6=2;
                }
                break;
            case 24:
                {
                alt6=3;
                }
                break;
            case 25:
                {
                alt6=4;
                }
                break;
            case 26:
                {
                alt6=5;
                }
                break;
            case 27:
                {
                alt6=6;
                }
                break;
            case 28:
                {
                alt6=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDsl.g:925:2: ( ( 'Millisecond' ) )
                    {
                    // InternalDsl.g:925:2: ( ( 'Millisecond' ) )
                    // InternalDsl.g:926:3: ( 'Millisecond' )
                    {
                     before(grammarAccess.getPeriodAccess().getMillisecondEnumLiteralDeclaration_0()); 
                    // InternalDsl.g:927:3: ( 'Millisecond' )
                    // InternalDsl.g:927:4: 'Millisecond'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getPeriodAccess().getMillisecondEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:931:2: ( ( 'Second' ) )
                    {
                    // InternalDsl.g:931:2: ( ( 'Second' ) )
                    // InternalDsl.g:932:3: ( 'Second' )
                    {
                     before(grammarAccess.getPeriodAccess().getSecondEnumLiteralDeclaration_1()); 
                    // InternalDsl.g:933:3: ( 'Second' )
                    // InternalDsl.g:933:4: 'Second'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getPeriodAccess().getSecondEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:937:2: ( ( 'Minute' ) )
                    {
                    // InternalDsl.g:937:2: ( ( 'Minute' ) )
                    // InternalDsl.g:938:3: ( 'Minute' )
                    {
                     before(grammarAccess.getPeriodAccess().getMinuteEnumLiteralDeclaration_2()); 
                    // InternalDsl.g:939:3: ( 'Minute' )
                    // InternalDsl.g:939:4: 'Minute'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getPeriodAccess().getMinuteEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:943:2: ( ( 'Hour' ) )
                    {
                    // InternalDsl.g:943:2: ( ( 'Hour' ) )
                    // InternalDsl.g:944:3: ( 'Hour' )
                    {
                     before(grammarAccess.getPeriodAccess().getHourEnumLiteralDeclaration_3()); 
                    // InternalDsl.g:945:3: ( 'Hour' )
                    // InternalDsl.g:945:4: 'Hour'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getPeriodAccess().getHourEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:949:2: ( ( 'Day' ) )
                    {
                    // InternalDsl.g:949:2: ( ( 'Day' ) )
                    // InternalDsl.g:950:3: ( 'Day' )
                    {
                     before(grammarAccess.getPeriodAccess().getDayEnumLiteralDeclaration_4()); 
                    // InternalDsl.g:951:3: ( 'Day' )
                    // InternalDsl.g:951:4: 'Day'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getPeriodAccess().getDayEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:955:2: ( ( 'Month' ) )
                    {
                    // InternalDsl.g:955:2: ( ( 'Month' ) )
                    // InternalDsl.g:956:3: ( 'Month' )
                    {
                     before(grammarAccess.getPeriodAccess().getMonthEnumLiteralDeclaration_5()); 
                    // InternalDsl.g:957:3: ( 'Month' )
                    // InternalDsl.g:957:4: 'Month'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getPeriodAccess().getMonthEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:961:2: ( ( 'Year' ) )
                    {
                    // InternalDsl.g:961:2: ( ( 'Year' ) )
                    // InternalDsl.g:962:3: ( 'Year' )
                    {
                     before(grammarAccess.getPeriodAccess().getYearEnumLiteralDeclaration_6()); 
                    // InternalDsl.g:963:3: ( 'Year' )
                    // InternalDsl.g:963:4: 'Year'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getPeriodAccess().getYearEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Period__Alternatives"


    // $ANTLR start "rule__OSType__Alternatives"
    // InternalDsl.g:971:1: rule__OSType__Alternatives : ( ( ( 'Linux' ) ) | ( ( 'Windows' ) ) | ( ( 'MacOS' ) ) );
    public final void rule__OSType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:975:1: ( ( ( 'Linux' ) ) | ( ( 'Windows' ) ) | ( ( 'MacOS' ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt7=1;
                }
                break;
            case 30:
                {
                alt7=2;
                }
                break;
            case 31:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDsl.g:976:2: ( ( 'Linux' ) )
                    {
                    // InternalDsl.g:976:2: ( ( 'Linux' ) )
                    // InternalDsl.g:977:3: ( 'Linux' )
                    {
                     before(grammarAccess.getOSTypeAccess().getLinuxEnumLiteralDeclaration_0()); 
                    // InternalDsl.g:978:3: ( 'Linux' )
                    // InternalDsl.g:978:4: 'Linux'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getOSTypeAccess().getLinuxEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:982:2: ( ( 'Windows' ) )
                    {
                    // InternalDsl.g:982:2: ( ( 'Windows' ) )
                    // InternalDsl.g:983:3: ( 'Windows' )
                    {
                     before(grammarAccess.getOSTypeAccess().getWindowsEnumLiteralDeclaration_1()); 
                    // InternalDsl.g:984:3: ( 'Windows' )
                    // InternalDsl.g:984:4: 'Windows'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getOSTypeAccess().getWindowsEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:988:2: ( ( 'MacOS' ) )
                    {
                    // InternalDsl.g:988:2: ( ( 'MacOS' ) )
                    // InternalDsl.g:989:3: ( 'MacOS' )
                    {
                     before(grammarAccess.getOSTypeAccess().getMacOSEnumLiteralDeclaration_2()); 
                    // InternalDsl.g:990:3: ( 'MacOS' )
                    // InternalDsl.g:990:4: 'MacOS'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getOSTypeAccess().getMacOSEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__OSType__Alternatives"


    // $ANTLR start "rule__DatabaseType__Alternatives"
    // InternalDsl.g:998:1: rule__DatabaseType__Alternatives : ( ( ( 'TimeScaleDB' ) ) | ( ( 'InfluxDB' ) ) );
    public final void rule__DatabaseType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1002:1: ( ( ( 'TimeScaleDB' ) ) | ( ( 'InfluxDB' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==32) ) {
                alt8=1;
            }
            else if ( (LA8_0==33) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalDsl.g:1003:2: ( ( 'TimeScaleDB' ) )
                    {
                    // InternalDsl.g:1003:2: ( ( 'TimeScaleDB' ) )
                    // InternalDsl.g:1004:3: ( 'TimeScaleDB' )
                    {
                     before(grammarAccess.getDatabaseTypeAccess().getTimeScaleDBEnumLiteralDeclaration_0()); 
                    // InternalDsl.g:1005:3: ( 'TimeScaleDB' )
                    // InternalDsl.g:1005:4: 'TimeScaleDB'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatabaseTypeAccess().getTimeScaleDBEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1009:2: ( ( 'InfluxDB' ) )
                    {
                    // InternalDsl.g:1009:2: ( ( 'InfluxDB' ) )
                    // InternalDsl.g:1010:3: ( 'InfluxDB' )
                    {
                     before(grammarAccess.getDatabaseTypeAccess().getInfluxDBEnumLiteralDeclaration_1()); 
                    // InternalDsl.g:1011:3: ( 'InfluxDB' )
                    // InternalDsl.g:1011:4: 'InfluxDB'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getDatabaseTypeAccess().getInfluxDBEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__DatabaseType__Alternatives"


    // $ANTLR start "rule__WebServerType__Alternatives"
    // InternalDsl.g:1019:1: rule__WebServerType__Alternatives : ( ( ( 'GeoServer' ) ) | ( ( 'Apache' ) ) );
    public final void rule__WebServerType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1023:1: ( ( ( 'GeoServer' ) ) | ( ( 'Apache' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==34) ) {
                alt9=1;
            }
            else if ( (LA9_0==35) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:1024:2: ( ( 'GeoServer' ) )
                    {
                    // InternalDsl.g:1024:2: ( ( 'GeoServer' ) )
                    // InternalDsl.g:1025:3: ( 'GeoServer' )
                    {
                     before(grammarAccess.getWebServerTypeAccess().getGeoServerEnumLiteralDeclaration_0()); 
                    // InternalDsl.g:1026:3: ( 'GeoServer' )
                    // InternalDsl.g:1026:4: 'GeoServer'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getWebServerTypeAccess().getGeoServerEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1030:2: ( ( 'Apache' ) )
                    {
                    // InternalDsl.g:1030:2: ( ( 'Apache' ) )
                    // InternalDsl.g:1031:3: ( 'Apache' )
                    {
                     before(grammarAccess.getWebServerTypeAccess().getApacheEnumLiteralDeclaration_1()); 
                    // InternalDsl.g:1032:3: ( 'Apache' )
                    // InternalDsl.g:1032:4: 'Apache'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getWebServerTypeAccess().getApacheEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__WebServerType__Alternatives"


    // $ANTLR start "rule__TimeSeriesFramework__Group__0"
    // InternalDsl.g:1040:1: rule__TimeSeriesFramework__Group__0 : rule__TimeSeriesFramework__Group__0__Impl rule__TimeSeriesFramework__Group__1 ;
    public final void rule__TimeSeriesFramework__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1044:1: ( rule__TimeSeriesFramework__Group__0__Impl rule__TimeSeriesFramework__Group__1 )
            // InternalDsl.g:1045:2: rule__TimeSeriesFramework__Group__0__Impl rule__TimeSeriesFramework__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TimeSeriesFramework__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSeriesFramework__Group__1();

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
    // $ANTLR end "rule__TimeSeriesFramework__Group__0"


    // $ANTLR start "rule__TimeSeriesFramework__Group__0__Impl"
    // InternalDsl.g:1052:1: rule__TimeSeriesFramework__Group__0__Impl : ( ( rule__TimeSeriesFramework__PlatformAssignment_0 ) ) ;
    public final void rule__TimeSeriesFramework__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1056:1: ( ( ( rule__TimeSeriesFramework__PlatformAssignment_0 ) ) )
            // InternalDsl.g:1057:1: ( ( rule__TimeSeriesFramework__PlatformAssignment_0 ) )
            {
            // InternalDsl.g:1057:1: ( ( rule__TimeSeriesFramework__PlatformAssignment_0 ) )
            // InternalDsl.g:1058:2: ( rule__TimeSeriesFramework__PlatformAssignment_0 )
            {
             before(grammarAccess.getTimeSeriesFrameworkAccess().getPlatformAssignment_0()); 
            // InternalDsl.g:1059:2: ( rule__TimeSeriesFramework__PlatformAssignment_0 )
            // InternalDsl.g:1059:3: rule__TimeSeriesFramework__PlatformAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TimeSeriesFramework__PlatformAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTimeSeriesFrameworkAccess().getPlatformAssignment_0()); 

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
    // $ANTLR end "rule__TimeSeriesFramework__Group__0__Impl"


    // $ANTLR start "rule__TimeSeriesFramework__Group__1"
    // InternalDsl.g:1067:1: rule__TimeSeriesFramework__Group__1 : rule__TimeSeriesFramework__Group__1__Impl rule__TimeSeriesFramework__Group__2 ;
    public final void rule__TimeSeriesFramework__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1071:1: ( rule__TimeSeriesFramework__Group__1__Impl rule__TimeSeriesFramework__Group__2 )
            // InternalDsl.g:1072:2: rule__TimeSeriesFramework__Group__1__Impl rule__TimeSeriesFramework__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TimeSeriesFramework__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSeriesFramework__Group__2();

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
    // $ANTLR end "rule__TimeSeriesFramework__Group__1"


    // $ANTLR start "rule__TimeSeriesFramework__Group__1__Impl"
    // InternalDsl.g:1079:1: rule__TimeSeriesFramework__Group__1__Impl : ( ( rule__TimeSeriesFramework__DataAssignment_1 ) ) ;
    public final void rule__TimeSeriesFramework__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1083:1: ( ( ( rule__TimeSeriesFramework__DataAssignment_1 ) ) )
            // InternalDsl.g:1084:1: ( ( rule__TimeSeriesFramework__DataAssignment_1 ) )
            {
            // InternalDsl.g:1084:1: ( ( rule__TimeSeriesFramework__DataAssignment_1 ) )
            // InternalDsl.g:1085:2: ( rule__TimeSeriesFramework__DataAssignment_1 )
            {
             before(grammarAccess.getTimeSeriesFrameworkAccess().getDataAssignment_1()); 
            // InternalDsl.g:1086:2: ( rule__TimeSeriesFramework__DataAssignment_1 )
            // InternalDsl.g:1086:3: rule__TimeSeriesFramework__DataAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TimeSeriesFramework__DataAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTimeSeriesFrameworkAccess().getDataAssignment_1()); 

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
    // $ANTLR end "rule__TimeSeriesFramework__Group__1__Impl"


    // $ANTLR start "rule__TimeSeriesFramework__Group__2"
    // InternalDsl.g:1094:1: rule__TimeSeriesFramework__Group__2 : rule__TimeSeriesFramework__Group__2__Impl rule__TimeSeriesFramework__Group__3 ;
    public final void rule__TimeSeriesFramework__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1098:1: ( rule__TimeSeriesFramework__Group__2__Impl rule__TimeSeriesFramework__Group__3 )
            // InternalDsl.g:1099:2: rule__TimeSeriesFramework__Group__2__Impl rule__TimeSeriesFramework__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__TimeSeriesFramework__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSeriesFramework__Group__3();

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
    // $ANTLR end "rule__TimeSeriesFramework__Group__2"


    // $ANTLR start "rule__TimeSeriesFramework__Group__2__Impl"
    // InternalDsl.g:1106:1: rule__TimeSeriesFramework__Group__2__Impl : ( 'Tools' ) ;
    public final void rule__TimeSeriesFramework__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1110:1: ( ( 'Tools' ) )
            // InternalDsl.g:1111:1: ( 'Tools' )
            {
            // InternalDsl.g:1111:1: ( 'Tools' )
            // InternalDsl.g:1112:2: 'Tools'
            {
             before(grammarAccess.getTimeSeriesFrameworkAccess().getToolsKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTimeSeriesFrameworkAccess().getToolsKeyword_2()); 

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
    // $ANTLR end "rule__TimeSeriesFramework__Group__2__Impl"


    // $ANTLR start "rule__TimeSeriesFramework__Group__3"
    // InternalDsl.g:1121:1: rule__TimeSeriesFramework__Group__3 : rule__TimeSeriesFramework__Group__3__Impl rule__TimeSeriesFramework__Group__4 ;
    public final void rule__TimeSeriesFramework__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1125:1: ( rule__TimeSeriesFramework__Group__3__Impl rule__TimeSeriesFramework__Group__4 )
            // InternalDsl.g:1126:2: rule__TimeSeriesFramework__Group__3__Impl rule__TimeSeriesFramework__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__TimeSeriesFramework__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSeriesFramework__Group__4();

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
    // $ANTLR end "rule__TimeSeriesFramework__Group__3"


    // $ANTLR start "rule__TimeSeriesFramework__Group__3__Impl"
    // InternalDsl.g:1133:1: rule__TimeSeriesFramework__Group__3__Impl : ( '{' ) ;
    public final void rule__TimeSeriesFramework__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1137:1: ( ( '{' ) )
            // InternalDsl.g:1138:1: ( '{' )
            {
            // InternalDsl.g:1138:1: ( '{' )
            // InternalDsl.g:1139:2: '{'
            {
             before(grammarAccess.getTimeSeriesFrameworkAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTimeSeriesFrameworkAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__TimeSeriesFramework__Group__3__Impl"


    // $ANTLR start "rule__TimeSeriesFramework__Group__4"
    // InternalDsl.g:1148:1: rule__TimeSeriesFramework__Group__4 : rule__TimeSeriesFramework__Group__4__Impl rule__TimeSeriesFramework__Group__5 ;
    public final void rule__TimeSeriesFramework__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1152:1: ( rule__TimeSeriesFramework__Group__4__Impl rule__TimeSeriesFramework__Group__5 )
            // InternalDsl.g:1153:2: rule__TimeSeriesFramework__Group__4__Impl rule__TimeSeriesFramework__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__TimeSeriesFramework__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSeriesFramework__Group__5();

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
    // $ANTLR end "rule__TimeSeriesFramework__Group__4"


    // $ANTLR start "rule__TimeSeriesFramework__Group__4__Impl"
    // InternalDsl.g:1160:1: rule__TimeSeriesFramework__Group__4__Impl : ( ( rule__TimeSeriesFramework__ClientsAssignment_4 ) ) ;
    public final void rule__TimeSeriesFramework__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1164:1: ( ( ( rule__TimeSeriesFramework__ClientsAssignment_4 ) ) )
            // InternalDsl.g:1165:1: ( ( rule__TimeSeriesFramework__ClientsAssignment_4 ) )
            {
            // InternalDsl.g:1165:1: ( ( rule__TimeSeriesFramework__ClientsAssignment_4 ) )
            // InternalDsl.g:1166:2: ( rule__TimeSeriesFramework__ClientsAssignment_4 )
            {
             before(grammarAccess.getTimeSeriesFrameworkAccess().getClientsAssignment_4()); 
            // InternalDsl.g:1167:2: ( rule__TimeSeriesFramework__ClientsAssignment_4 )
            // InternalDsl.g:1167:3: rule__TimeSeriesFramework__ClientsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__TimeSeriesFramework__ClientsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTimeSeriesFrameworkAccess().getClientsAssignment_4()); 

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
    // $ANTLR end "rule__TimeSeriesFramework__Group__4__Impl"


    // $ANTLR start "rule__TimeSeriesFramework__Group__5"
    // InternalDsl.g:1175:1: rule__TimeSeriesFramework__Group__5 : rule__TimeSeriesFramework__Group__5__Impl rule__TimeSeriesFramework__Group__6 ;
    public final void rule__TimeSeriesFramework__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1179:1: ( rule__TimeSeriesFramework__Group__5__Impl rule__TimeSeriesFramework__Group__6 )
            // InternalDsl.g:1180:2: rule__TimeSeriesFramework__Group__5__Impl rule__TimeSeriesFramework__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__TimeSeriesFramework__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSeriesFramework__Group__6();

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
    // $ANTLR end "rule__TimeSeriesFramework__Group__5"


    // $ANTLR start "rule__TimeSeriesFramework__Group__5__Impl"
    // InternalDsl.g:1187:1: rule__TimeSeriesFramework__Group__5__Impl : ( ';' ) ;
    public final void rule__TimeSeriesFramework__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1191:1: ( ( ';' ) )
            // InternalDsl.g:1192:1: ( ';' )
            {
            // InternalDsl.g:1192:1: ( ';' )
            // InternalDsl.g:1193:2: ';'
            {
             before(grammarAccess.getTimeSeriesFrameworkAccess().getSemicolonKeyword_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTimeSeriesFrameworkAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__TimeSeriesFramework__Group__5__Impl"


    // $ANTLR start "rule__TimeSeriesFramework__Group__6"
    // InternalDsl.g:1202:1: rule__TimeSeriesFramework__Group__6 : rule__TimeSeriesFramework__Group__6__Impl rule__TimeSeriesFramework__Group__7 ;
    public final void rule__TimeSeriesFramework__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1206:1: ( rule__TimeSeriesFramework__Group__6__Impl rule__TimeSeriesFramework__Group__7 )
            // InternalDsl.g:1207:2: rule__TimeSeriesFramework__Group__6__Impl rule__TimeSeriesFramework__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__TimeSeriesFramework__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSeriesFramework__Group__7();

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
    // $ANTLR end "rule__TimeSeriesFramework__Group__6"


    // $ANTLR start "rule__TimeSeriesFramework__Group__6__Impl"
    // InternalDsl.g:1214:1: rule__TimeSeriesFramework__Group__6__Impl : ( ( rule__TimeSeriesFramework__Group_6__0 )* ) ;
    public final void rule__TimeSeriesFramework__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1218:1: ( ( ( rule__TimeSeriesFramework__Group_6__0 )* ) )
            // InternalDsl.g:1219:1: ( ( rule__TimeSeriesFramework__Group_6__0 )* )
            {
            // InternalDsl.g:1219:1: ( ( rule__TimeSeriesFramework__Group_6__0 )* )
            // InternalDsl.g:1220:2: ( rule__TimeSeriesFramework__Group_6__0 )*
            {
             before(grammarAccess.getTimeSeriesFrameworkAccess().getGroup_6()); 
            // InternalDsl.g:1221:2: ( rule__TimeSeriesFramework__Group_6__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==46) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:1221:3: rule__TimeSeriesFramework__Group_6__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__TimeSeriesFramework__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getTimeSeriesFrameworkAccess().getGroup_6()); 

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
    // $ANTLR end "rule__TimeSeriesFramework__Group__6__Impl"


    // $ANTLR start "rule__TimeSeriesFramework__Group__7"
    // InternalDsl.g:1229:1: rule__TimeSeriesFramework__Group__7 : rule__TimeSeriesFramework__Group__7__Impl rule__TimeSeriesFramework__Group__8 ;
    public final void rule__TimeSeriesFramework__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1233:1: ( rule__TimeSeriesFramework__Group__7__Impl rule__TimeSeriesFramework__Group__8 )
            // InternalDsl.g:1234:2: rule__TimeSeriesFramework__Group__7__Impl rule__TimeSeriesFramework__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__TimeSeriesFramework__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSeriesFramework__Group__8();

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
    // $ANTLR end "rule__TimeSeriesFramework__Group__7"


    // $ANTLR start "rule__TimeSeriesFramework__Group__7__Impl"
    // InternalDsl.g:1241:1: rule__TimeSeriesFramework__Group__7__Impl : ( '}' ) ;
    public final void rule__TimeSeriesFramework__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1245:1: ( ( '}' ) )
            // InternalDsl.g:1246:1: ( '}' )
            {
            // InternalDsl.g:1246:1: ( '}' )
            // InternalDsl.g:1247:2: '}'
            {
             before(grammarAccess.getTimeSeriesFrameworkAccess().getRightCurlyBracketKeyword_7()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTimeSeriesFrameworkAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__TimeSeriesFramework__Group__7__Impl"


    // $ANTLR start "rule__TimeSeriesFramework__Group__8"
    // InternalDsl.g:1256:1: rule__TimeSeriesFramework__Group__8 : rule__TimeSeriesFramework__Group__8__Impl ;
    public final void rule__TimeSeriesFramework__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1260:1: ( rule__TimeSeriesFramework__Group__8__Impl )
            // InternalDsl.g:1261:2: rule__TimeSeriesFramework__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TimeSeriesFramework__Group__8__Impl();

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
    // $ANTLR end "rule__TimeSeriesFramework__Group__8"


    // $ANTLR start "rule__TimeSeriesFramework__Group__8__Impl"
    // InternalDsl.g:1267:1: rule__TimeSeriesFramework__Group__8__Impl : ( ';' ) ;
    public final void rule__TimeSeriesFramework__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1271:1: ( ( ';' ) )
            // InternalDsl.g:1272:1: ( ';' )
            {
            // InternalDsl.g:1272:1: ( ';' )
            // InternalDsl.g:1273:2: ';'
            {
             before(grammarAccess.getTimeSeriesFrameworkAccess().getSemicolonKeyword_8()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTimeSeriesFrameworkAccess().getSemicolonKeyword_8()); 

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
    // $ANTLR end "rule__TimeSeriesFramework__Group__8__Impl"


    // $ANTLR start "rule__TimeSeriesFramework__Group_6__0"
    // InternalDsl.g:1283:1: rule__TimeSeriesFramework__Group_6__0 : rule__TimeSeriesFramework__Group_6__0__Impl rule__TimeSeriesFramework__Group_6__1 ;
    public final void rule__TimeSeriesFramework__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1287:1: ( rule__TimeSeriesFramework__Group_6__0__Impl rule__TimeSeriesFramework__Group_6__1 )
            // InternalDsl.g:1288:2: rule__TimeSeriesFramework__Group_6__0__Impl rule__TimeSeriesFramework__Group_6__1
            {
            pushFollow(FOLLOW_7);
            rule__TimeSeriesFramework__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSeriesFramework__Group_6__1();

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
    // $ANTLR end "rule__TimeSeriesFramework__Group_6__0"


    // $ANTLR start "rule__TimeSeriesFramework__Group_6__0__Impl"
    // InternalDsl.g:1295:1: rule__TimeSeriesFramework__Group_6__0__Impl : ( ( rule__TimeSeriesFramework__ClientsAssignment_6_0 ) ) ;
    public final void rule__TimeSeriesFramework__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1299:1: ( ( ( rule__TimeSeriesFramework__ClientsAssignment_6_0 ) ) )
            // InternalDsl.g:1300:1: ( ( rule__TimeSeriesFramework__ClientsAssignment_6_0 ) )
            {
            // InternalDsl.g:1300:1: ( ( rule__TimeSeriesFramework__ClientsAssignment_6_0 ) )
            // InternalDsl.g:1301:2: ( rule__TimeSeriesFramework__ClientsAssignment_6_0 )
            {
             before(grammarAccess.getTimeSeriesFrameworkAccess().getClientsAssignment_6_0()); 
            // InternalDsl.g:1302:2: ( rule__TimeSeriesFramework__ClientsAssignment_6_0 )
            // InternalDsl.g:1302:3: rule__TimeSeriesFramework__ClientsAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__TimeSeriesFramework__ClientsAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getTimeSeriesFrameworkAccess().getClientsAssignment_6_0()); 

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
    // $ANTLR end "rule__TimeSeriesFramework__Group_6__0__Impl"


    // $ANTLR start "rule__TimeSeriesFramework__Group_6__1"
    // InternalDsl.g:1310:1: rule__TimeSeriesFramework__Group_6__1 : rule__TimeSeriesFramework__Group_6__1__Impl ;
    public final void rule__TimeSeriesFramework__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1314:1: ( rule__TimeSeriesFramework__Group_6__1__Impl )
            // InternalDsl.g:1315:2: rule__TimeSeriesFramework__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TimeSeriesFramework__Group_6__1__Impl();

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
    // $ANTLR end "rule__TimeSeriesFramework__Group_6__1"


    // $ANTLR start "rule__TimeSeriesFramework__Group_6__1__Impl"
    // InternalDsl.g:1321:1: rule__TimeSeriesFramework__Group_6__1__Impl : ( ';' ) ;
    public final void rule__TimeSeriesFramework__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1325:1: ( ( ';' ) )
            // InternalDsl.g:1326:1: ( ';' )
            {
            // InternalDsl.g:1326:1: ( ';' )
            // InternalDsl.g:1327:2: ';'
            {
             before(grammarAccess.getTimeSeriesFrameworkAccess().getSemicolonKeyword_6_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTimeSeriesFrameworkAccess().getSemicolonKeyword_6_1()); 

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
    // $ANTLR end "rule__TimeSeriesFramework__Group_6__1__Impl"


    // $ANTLR start "rule__Data__Group__0"
    // InternalDsl.g:1337:1: rule__Data__Group__0 : rule__Data__Group__0__Impl rule__Data__Group__1 ;
    public final void rule__Data__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1341:1: ( rule__Data__Group__0__Impl rule__Data__Group__1 )
            // InternalDsl.g:1342:2: rule__Data__Group__0__Impl rule__Data__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Data__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__1();

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
    // $ANTLR end "rule__Data__Group__0"


    // $ANTLR start "rule__Data__Group__0__Impl"
    // InternalDsl.g:1349:1: rule__Data__Group__0__Impl : ( 'Data' ) ;
    public final void rule__Data__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1353:1: ( ( 'Data' ) )
            // InternalDsl.g:1354:1: ( 'Data' )
            {
            // InternalDsl.g:1354:1: ( 'Data' )
            // InternalDsl.g:1355:2: 'Data'
            {
             before(grammarAccess.getDataAccess().getDataKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getDataKeyword_0()); 

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
    // $ANTLR end "rule__Data__Group__0__Impl"


    // $ANTLR start "rule__Data__Group__1"
    // InternalDsl.g:1364:1: rule__Data__Group__1 : rule__Data__Group__1__Impl rule__Data__Group__2 ;
    public final void rule__Data__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1368:1: ( rule__Data__Group__1__Impl rule__Data__Group__2 )
            // InternalDsl.g:1369:2: rule__Data__Group__1__Impl rule__Data__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Data__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__2();

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
    // $ANTLR end "rule__Data__Group__1"


    // $ANTLR start "rule__Data__Group__1__Impl"
    // InternalDsl.g:1376:1: rule__Data__Group__1__Impl : ( '{' ) ;
    public final void rule__Data__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1380:1: ( ( '{' ) )
            // InternalDsl.g:1381:1: ( '{' )
            {
            // InternalDsl.g:1381:1: ( '{' )
            // InternalDsl.g:1382:2: '{'
            {
             before(grammarAccess.getDataAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Data__Group__1__Impl"


    // $ANTLR start "rule__Data__Group__2"
    // InternalDsl.g:1391:1: rule__Data__Group__2 : rule__Data__Group__2__Impl rule__Data__Group__3 ;
    public final void rule__Data__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1395:1: ( rule__Data__Group__2__Impl rule__Data__Group__3 )
            // InternalDsl.g:1396:2: rule__Data__Group__2__Impl rule__Data__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Data__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__3();

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
    // $ANTLR end "rule__Data__Group__2"


    // $ANTLR start "rule__Data__Group__2__Impl"
    // InternalDsl.g:1403:1: rule__Data__Group__2__Impl : ( 'Sensors' ) ;
    public final void rule__Data__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1407:1: ( ( 'Sensors' ) )
            // InternalDsl.g:1408:1: ( 'Sensors' )
            {
            // InternalDsl.g:1408:1: ( 'Sensors' )
            // InternalDsl.g:1409:2: 'Sensors'
            {
             before(grammarAccess.getDataAccess().getSensorsKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getSensorsKeyword_2()); 

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
    // $ANTLR end "rule__Data__Group__2__Impl"


    // $ANTLR start "rule__Data__Group__3"
    // InternalDsl.g:1418:1: rule__Data__Group__3 : rule__Data__Group__3__Impl rule__Data__Group__4 ;
    public final void rule__Data__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1422:1: ( rule__Data__Group__3__Impl rule__Data__Group__4 )
            // InternalDsl.g:1423:2: rule__Data__Group__3__Impl rule__Data__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Data__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__4();

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
    // $ANTLR end "rule__Data__Group__3"


    // $ANTLR start "rule__Data__Group__3__Impl"
    // InternalDsl.g:1430:1: rule__Data__Group__3__Impl : ( '{' ) ;
    public final void rule__Data__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1434:1: ( ( '{' ) )
            // InternalDsl.g:1435:1: ( '{' )
            {
            // InternalDsl.g:1435:1: ( '{' )
            // InternalDsl.g:1436:2: '{'
            {
             before(grammarAccess.getDataAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Data__Group__3__Impl"


    // $ANTLR start "rule__Data__Group__4"
    // InternalDsl.g:1445:1: rule__Data__Group__4 : rule__Data__Group__4__Impl rule__Data__Group__5 ;
    public final void rule__Data__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1449:1: ( rule__Data__Group__4__Impl rule__Data__Group__5 )
            // InternalDsl.g:1450:2: rule__Data__Group__4__Impl rule__Data__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Data__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__5();

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
    // $ANTLR end "rule__Data__Group__4"


    // $ANTLR start "rule__Data__Group__4__Impl"
    // InternalDsl.g:1457:1: rule__Data__Group__4__Impl : ( ( rule__Data__SensorsDataAssignment_4 ) ) ;
    public final void rule__Data__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1461:1: ( ( ( rule__Data__SensorsDataAssignment_4 ) ) )
            // InternalDsl.g:1462:1: ( ( rule__Data__SensorsDataAssignment_4 ) )
            {
            // InternalDsl.g:1462:1: ( ( rule__Data__SensorsDataAssignment_4 ) )
            // InternalDsl.g:1463:2: ( rule__Data__SensorsDataAssignment_4 )
            {
             before(grammarAccess.getDataAccess().getSensorsDataAssignment_4()); 
            // InternalDsl.g:1464:2: ( rule__Data__SensorsDataAssignment_4 )
            // InternalDsl.g:1464:3: rule__Data__SensorsDataAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Data__SensorsDataAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getSensorsDataAssignment_4()); 

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
    // $ANTLR end "rule__Data__Group__4__Impl"


    // $ANTLR start "rule__Data__Group__5"
    // InternalDsl.g:1472:1: rule__Data__Group__5 : rule__Data__Group__5__Impl rule__Data__Group__6 ;
    public final void rule__Data__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1476:1: ( rule__Data__Group__5__Impl rule__Data__Group__6 )
            // InternalDsl.g:1477:2: rule__Data__Group__5__Impl rule__Data__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Data__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__6();

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
    // $ANTLR end "rule__Data__Group__5"


    // $ANTLR start "rule__Data__Group__5__Impl"
    // InternalDsl.g:1484:1: rule__Data__Group__5__Impl : ( ';' ) ;
    public final void rule__Data__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1488:1: ( ( ';' ) )
            // InternalDsl.g:1489:1: ( ';' )
            {
            // InternalDsl.g:1489:1: ( ';' )
            // InternalDsl.g:1490:2: ';'
            {
             before(grammarAccess.getDataAccess().getSemicolonKeyword_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__Data__Group__5__Impl"


    // $ANTLR start "rule__Data__Group__6"
    // InternalDsl.g:1499:1: rule__Data__Group__6 : rule__Data__Group__6__Impl rule__Data__Group__7 ;
    public final void rule__Data__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1503:1: ( rule__Data__Group__6__Impl rule__Data__Group__7 )
            // InternalDsl.g:1504:2: rule__Data__Group__6__Impl rule__Data__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__Data__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__7();

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
    // $ANTLR end "rule__Data__Group__6"


    // $ANTLR start "rule__Data__Group__6__Impl"
    // InternalDsl.g:1511:1: rule__Data__Group__6__Impl : ( ( rule__Data__Group_6__0 )* ) ;
    public final void rule__Data__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1515:1: ( ( ( rule__Data__Group_6__0 )* ) )
            // InternalDsl.g:1516:1: ( ( rule__Data__Group_6__0 )* )
            {
            // InternalDsl.g:1516:1: ( ( rule__Data__Group_6__0 )* )
            // InternalDsl.g:1517:2: ( rule__Data__Group_6__0 )*
            {
             before(grammarAccess.getDataAccess().getGroup_6()); 
            // InternalDsl.g:1518:2: ( rule__Data__Group_6__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:1518:3: rule__Data__Group_6__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Data__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getDataAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Data__Group__6__Impl"


    // $ANTLR start "rule__Data__Group__7"
    // InternalDsl.g:1526:1: rule__Data__Group__7 : rule__Data__Group__7__Impl rule__Data__Group__8 ;
    public final void rule__Data__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1530:1: ( rule__Data__Group__7__Impl rule__Data__Group__8 )
            // InternalDsl.g:1531:2: rule__Data__Group__7__Impl rule__Data__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__Data__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__8();

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
    // $ANTLR end "rule__Data__Group__7"


    // $ANTLR start "rule__Data__Group__7__Impl"
    // InternalDsl.g:1538:1: rule__Data__Group__7__Impl : ( '}' ) ;
    public final void rule__Data__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1542:1: ( ( '}' ) )
            // InternalDsl.g:1543:1: ( '}' )
            {
            // InternalDsl.g:1543:1: ( '}' )
            // InternalDsl.g:1544:2: '}'
            {
             before(grammarAccess.getDataAccess().getRightCurlyBracketKeyword_7()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Data__Group__7__Impl"


    // $ANTLR start "rule__Data__Group__8"
    // InternalDsl.g:1553:1: rule__Data__Group__8 : rule__Data__Group__8__Impl rule__Data__Group__9 ;
    public final void rule__Data__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1557:1: ( rule__Data__Group__8__Impl rule__Data__Group__9 )
            // InternalDsl.g:1558:2: rule__Data__Group__8__Impl rule__Data__Group__9
            {
            pushFollow(FOLLOW_14);
            rule__Data__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__9();

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
    // $ANTLR end "rule__Data__Group__8"


    // $ANTLR start "rule__Data__Group__8__Impl"
    // InternalDsl.g:1565:1: rule__Data__Group__8__Impl : ( ';' ) ;
    public final void rule__Data__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1569:1: ( ( ';' ) )
            // InternalDsl.g:1570:1: ( ';' )
            {
            // InternalDsl.g:1570:1: ( ';' )
            // InternalDsl.g:1571:2: ';'
            {
             before(grammarAccess.getDataAccess().getSemicolonKeyword_8()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getSemicolonKeyword_8()); 

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
    // $ANTLR end "rule__Data__Group__8__Impl"


    // $ANTLR start "rule__Data__Group__9"
    // InternalDsl.g:1580:1: rule__Data__Group__9 : rule__Data__Group__9__Impl rule__Data__Group__10 ;
    public final void rule__Data__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1584:1: ( rule__Data__Group__9__Impl rule__Data__Group__10 )
            // InternalDsl.g:1585:2: rule__Data__Group__9__Impl rule__Data__Group__10
            {
            pushFollow(FOLLOW_5);
            rule__Data__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__10();

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
    // $ANTLR end "rule__Data__Group__9"


    // $ANTLR start "rule__Data__Group__9__Impl"
    // InternalDsl.g:1592:1: rule__Data__Group__9__Impl : ( 'TimeSeries' ) ;
    public final void rule__Data__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1596:1: ( ( 'TimeSeries' ) )
            // InternalDsl.g:1597:1: ( 'TimeSeries' )
            {
            // InternalDsl.g:1597:1: ( 'TimeSeries' )
            // InternalDsl.g:1598:2: 'TimeSeries'
            {
             before(grammarAccess.getDataAccess().getTimeSeriesKeyword_9()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getTimeSeriesKeyword_9()); 

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
    // $ANTLR end "rule__Data__Group__9__Impl"


    // $ANTLR start "rule__Data__Group__10"
    // InternalDsl.g:1607:1: rule__Data__Group__10 : rule__Data__Group__10__Impl rule__Data__Group__11 ;
    public final void rule__Data__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1611:1: ( rule__Data__Group__10__Impl rule__Data__Group__11 )
            // InternalDsl.g:1612:2: rule__Data__Group__10__Impl rule__Data__Group__11
            {
            pushFollow(FOLLOW_11);
            rule__Data__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__11();

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
    // $ANTLR end "rule__Data__Group__10"


    // $ANTLR start "rule__Data__Group__10__Impl"
    // InternalDsl.g:1619:1: rule__Data__Group__10__Impl : ( '{' ) ;
    public final void rule__Data__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1623:1: ( ( '{' ) )
            // InternalDsl.g:1624:1: ( '{' )
            {
            // InternalDsl.g:1624:1: ( '{' )
            // InternalDsl.g:1625:2: '{'
            {
             before(grammarAccess.getDataAccess().getLeftCurlyBracketKeyword_10()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getLeftCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__Data__Group__10__Impl"


    // $ANTLR start "rule__Data__Group__11"
    // InternalDsl.g:1634:1: rule__Data__Group__11 : rule__Data__Group__11__Impl rule__Data__Group__12 ;
    public final void rule__Data__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1638:1: ( rule__Data__Group__11__Impl rule__Data__Group__12 )
            // InternalDsl.g:1639:2: rule__Data__Group__11__Impl rule__Data__Group__12
            {
            pushFollow(FOLLOW_7);
            rule__Data__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__12();

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
    // $ANTLR end "rule__Data__Group__11"


    // $ANTLR start "rule__Data__Group__11__Impl"
    // InternalDsl.g:1646:1: rule__Data__Group__11__Impl : ( ( rule__Data__TimeSeriesDataAssignment_11 ) ) ;
    public final void rule__Data__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1650:1: ( ( ( rule__Data__TimeSeriesDataAssignment_11 ) ) )
            // InternalDsl.g:1651:1: ( ( rule__Data__TimeSeriesDataAssignment_11 ) )
            {
            // InternalDsl.g:1651:1: ( ( rule__Data__TimeSeriesDataAssignment_11 ) )
            // InternalDsl.g:1652:2: ( rule__Data__TimeSeriesDataAssignment_11 )
            {
             before(grammarAccess.getDataAccess().getTimeSeriesDataAssignment_11()); 
            // InternalDsl.g:1653:2: ( rule__Data__TimeSeriesDataAssignment_11 )
            // InternalDsl.g:1653:3: rule__Data__TimeSeriesDataAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Data__TimeSeriesDataAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getTimeSeriesDataAssignment_11()); 

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
    // $ANTLR end "rule__Data__Group__11__Impl"


    // $ANTLR start "rule__Data__Group__12"
    // InternalDsl.g:1661:1: rule__Data__Group__12 : rule__Data__Group__12__Impl rule__Data__Group__13 ;
    public final void rule__Data__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1665:1: ( rule__Data__Group__12__Impl rule__Data__Group__13 )
            // InternalDsl.g:1666:2: rule__Data__Group__12__Impl rule__Data__Group__13
            {
            pushFollow(FOLLOW_12);
            rule__Data__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__13();

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
    // $ANTLR end "rule__Data__Group__12"


    // $ANTLR start "rule__Data__Group__12__Impl"
    // InternalDsl.g:1673:1: rule__Data__Group__12__Impl : ( ';' ) ;
    public final void rule__Data__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1677:1: ( ( ';' ) )
            // InternalDsl.g:1678:1: ( ';' )
            {
            // InternalDsl.g:1678:1: ( ';' )
            // InternalDsl.g:1679:2: ';'
            {
             before(grammarAccess.getDataAccess().getSemicolonKeyword_12()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getSemicolonKeyword_12()); 

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
    // $ANTLR end "rule__Data__Group__12__Impl"


    // $ANTLR start "rule__Data__Group__13"
    // InternalDsl.g:1688:1: rule__Data__Group__13 : rule__Data__Group__13__Impl rule__Data__Group__14 ;
    public final void rule__Data__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1692:1: ( rule__Data__Group__13__Impl rule__Data__Group__14 )
            // InternalDsl.g:1693:2: rule__Data__Group__13__Impl rule__Data__Group__14
            {
            pushFollow(FOLLOW_12);
            rule__Data__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__14();

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
    // $ANTLR end "rule__Data__Group__13"


    // $ANTLR start "rule__Data__Group__13__Impl"
    // InternalDsl.g:1700:1: rule__Data__Group__13__Impl : ( ( rule__Data__Group_13__0 )* ) ;
    public final void rule__Data__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1704:1: ( ( ( rule__Data__Group_13__0 )* ) )
            // InternalDsl.g:1705:1: ( ( rule__Data__Group_13__0 )* )
            {
            // InternalDsl.g:1705:1: ( ( rule__Data__Group_13__0 )* )
            // InternalDsl.g:1706:2: ( rule__Data__Group_13__0 )*
            {
             before(grammarAccess.getDataAccess().getGroup_13()); 
            // InternalDsl.g:1707:2: ( rule__Data__Group_13__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:1707:3: rule__Data__Group_13__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Data__Group_13__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getDataAccess().getGroup_13()); 

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
    // $ANTLR end "rule__Data__Group__13__Impl"


    // $ANTLR start "rule__Data__Group__14"
    // InternalDsl.g:1715:1: rule__Data__Group__14 : rule__Data__Group__14__Impl rule__Data__Group__15 ;
    public final void rule__Data__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1719:1: ( rule__Data__Group__14__Impl rule__Data__Group__15 )
            // InternalDsl.g:1720:2: rule__Data__Group__14__Impl rule__Data__Group__15
            {
            pushFollow(FOLLOW_7);
            rule__Data__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__15();

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
    // $ANTLR end "rule__Data__Group__14"


    // $ANTLR start "rule__Data__Group__14__Impl"
    // InternalDsl.g:1727:1: rule__Data__Group__14__Impl : ( '}' ) ;
    public final void rule__Data__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1731:1: ( ( '}' ) )
            // InternalDsl.g:1732:1: ( '}' )
            {
            // InternalDsl.g:1732:1: ( '}' )
            // InternalDsl.g:1733:2: '}'
            {
             before(grammarAccess.getDataAccess().getRightCurlyBracketKeyword_14()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getRightCurlyBracketKeyword_14()); 

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
    // $ANTLR end "rule__Data__Group__14__Impl"


    // $ANTLR start "rule__Data__Group__15"
    // InternalDsl.g:1742:1: rule__Data__Group__15 : rule__Data__Group__15__Impl rule__Data__Group__16 ;
    public final void rule__Data__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1746:1: ( rule__Data__Group__15__Impl rule__Data__Group__16 )
            // InternalDsl.g:1747:2: rule__Data__Group__15__Impl rule__Data__Group__16
            {
            pushFollow(FOLLOW_15);
            rule__Data__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__16();

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
    // $ANTLR end "rule__Data__Group__15"


    // $ANTLR start "rule__Data__Group__15__Impl"
    // InternalDsl.g:1754:1: rule__Data__Group__15__Impl : ( ';' ) ;
    public final void rule__Data__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1758:1: ( ( ';' ) )
            // InternalDsl.g:1759:1: ( ';' )
            {
            // InternalDsl.g:1759:1: ( ';' )
            // InternalDsl.g:1760:2: ';'
            {
             before(grammarAccess.getDataAccess().getSemicolonKeyword_15()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getSemicolonKeyword_15()); 

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
    // $ANTLR end "rule__Data__Group__15__Impl"


    // $ANTLR start "rule__Data__Group__16"
    // InternalDsl.g:1769:1: rule__Data__Group__16 : rule__Data__Group__16__Impl rule__Data__Group__17 ;
    public final void rule__Data__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1773:1: ( rule__Data__Group__16__Impl rule__Data__Group__17 )
            // InternalDsl.g:1774:2: rule__Data__Group__16__Impl rule__Data__Group__17
            {
            pushFollow(FOLLOW_7);
            rule__Data__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__17();

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
    // $ANTLR end "rule__Data__Group__16"


    // $ANTLR start "rule__Data__Group__16__Impl"
    // InternalDsl.g:1781:1: rule__Data__Group__16__Impl : ( '}' ) ;
    public final void rule__Data__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1785:1: ( ( '}' ) )
            // InternalDsl.g:1786:1: ( '}' )
            {
            // InternalDsl.g:1786:1: ( '}' )
            // InternalDsl.g:1787:2: '}'
            {
             before(grammarAccess.getDataAccess().getRightCurlyBracketKeyword_16()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getRightCurlyBracketKeyword_16()); 

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
    // $ANTLR end "rule__Data__Group__16__Impl"


    // $ANTLR start "rule__Data__Group__17"
    // InternalDsl.g:1796:1: rule__Data__Group__17 : rule__Data__Group__17__Impl ;
    public final void rule__Data__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1800:1: ( rule__Data__Group__17__Impl )
            // InternalDsl.g:1801:2: rule__Data__Group__17__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Data__Group__17__Impl();

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
    // $ANTLR end "rule__Data__Group__17"


    // $ANTLR start "rule__Data__Group__17__Impl"
    // InternalDsl.g:1807:1: rule__Data__Group__17__Impl : ( ';' ) ;
    public final void rule__Data__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1811:1: ( ( ';' ) )
            // InternalDsl.g:1812:1: ( ';' )
            {
            // InternalDsl.g:1812:1: ( ';' )
            // InternalDsl.g:1813:2: ';'
            {
             before(grammarAccess.getDataAccess().getSemicolonKeyword_17()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getSemicolonKeyword_17()); 

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
    // $ANTLR end "rule__Data__Group__17__Impl"


    // $ANTLR start "rule__Data__Group_6__0"
    // InternalDsl.g:1823:1: rule__Data__Group_6__0 : rule__Data__Group_6__0__Impl rule__Data__Group_6__1 ;
    public final void rule__Data__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1827:1: ( rule__Data__Group_6__0__Impl rule__Data__Group_6__1 )
            // InternalDsl.g:1828:2: rule__Data__Group_6__0__Impl rule__Data__Group_6__1
            {
            pushFollow(FOLLOW_7);
            rule__Data__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group_6__1();

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
    // $ANTLR end "rule__Data__Group_6__0"


    // $ANTLR start "rule__Data__Group_6__0__Impl"
    // InternalDsl.g:1835:1: rule__Data__Group_6__0__Impl : ( ( rule__Data__SensorsDataAssignment_6_0 ) ) ;
    public final void rule__Data__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1839:1: ( ( ( rule__Data__SensorsDataAssignment_6_0 ) ) )
            // InternalDsl.g:1840:1: ( ( rule__Data__SensorsDataAssignment_6_0 ) )
            {
            // InternalDsl.g:1840:1: ( ( rule__Data__SensorsDataAssignment_6_0 ) )
            // InternalDsl.g:1841:2: ( rule__Data__SensorsDataAssignment_6_0 )
            {
             before(grammarAccess.getDataAccess().getSensorsDataAssignment_6_0()); 
            // InternalDsl.g:1842:2: ( rule__Data__SensorsDataAssignment_6_0 )
            // InternalDsl.g:1842:3: rule__Data__SensorsDataAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__Data__SensorsDataAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getSensorsDataAssignment_6_0()); 

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
    // $ANTLR end "rule__Data__Group_6__0__Impl"


    // $ANTLR start "rule__Data__Group_6__1"
    // InternalDsl.g:1850:1: rule__Data__Group_6__1 : rule__Data__Group_6__1__Impl ;
    public final void rule__Data__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1854:1: ( rule__Data__Group_6__1__Impl )
            // InternalDsl.g:1855:2: rule__Data__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Data__Group_6__1__Impl();

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
    // $ANTLR end "rule__Data__Group_6__1"


    // $ANTLR start "rule__Data__Group_6__1__Impl"
    // InternalDsl.g:1861:1: rule__Data__Group_6__1__Impl : ( ';' ) ;
    public final void rule__Data__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1865:1: ( ( ';' ) )
            // InternalDsl.g:1866:1: ( ';' )
            {
            // InternalDsl.g:1866:1: ( ';' )
            // InternalDsl.g:1867:2: ';'
            {
             before(grammarAccess.getDataAccess().getSemicolonKeyword_6_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getSemicolonKeyword_6_1()); 

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
    // $ANTLR end "rule__Data__Group_6__1__Impl"


    // $ANTLR start "rule__Data__Group_13__0"
    // InternalDsl.g:1877:1: rule__Data__Group_13__0 : rule__Data__Group_13__0__Impl rule__Data__Group_13__1 ;
    public final void rule__Data__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1881:1: ( rule__Data__Group_13__0__Impl rule__Data__Group_13__1 )
            // InternalDsl.g:1882:2: rule__Data__Group_13__0__Impl rule__Data__Group_13__1
            {
            pushFollow(FOLLOW_7);
            rule__Data__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group_13__1();

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
    // $ANTLR end "rule__Data__Group_13__0"


    // $ANTLR start "rule__Data__Group_13__0__Impl"
    // InternalDsl.g:1889:1: rule__Data__Group_13__0__Impl : ( ( rule__Data__TimeSeriesDataAssignment_13_0 ) ) ;
    public final void rule__Data__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1893:1: ( ( ( rule__Data__TimeSeriesDataAssignment_13_0 ) ) )
            // InternalDsl.g:1894:1: ( ( rule__Data__TimeSeriesDataAssignment_13_0 ) )
            {
            // InternalDsl.g:1894:1: ( ( rule__Data__TimeSeriesDataAssignment_13_0 ) )
            // InternalDsl.g:1895:2: ( rule__Data__TimeSeriesDataAssignment_13_0 )
            {
             before(grammarAccess.getDataAccess().getTimeSeriesDataAssignment_13_0()); 
            // InternalDsl.g:1896:2: ( rule__Data__TimeSeriesDataAssignment_13_0 )
            // InternalDsl.g:1896:3: rule__Data__TimeSeriesDataAssignment_13_0
            {
            pushFollow(FOLLOW_2);
            rule__Data__TimeSeriesDataAssignment_13_0();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getTimeSeriesDataAssignment_13_0()); 

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
    // $ANTLR end "rule__Data__Group_13__0__Impl"


    // $ANTLR start "rule__Data__Group_13__1"
    // InternalDsl.g:1904:1: rule__Data__Group_13__1 : rule__Data__Group_13__1__Impl ;
    public final void rule__Data__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1908:1: ( rule__Data__Group_13__1__Impl )
            // InternalDsl.g:1909:2: rule__Data__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Data__Group_13__1__Impl();

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
    // $ANTLR end "rule__Data__Group_13__1"


    // $ANTLR start "rule__Data__Group_13__1__Impl"
    // InternalDsl.g:1915:1: rule__Data__Group_13__1__Impl : ( ';' ) ;
    public final void rule__Data__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1919:1: ( ( ';' ) )
            // InternalDsl.g:1920:1: ( ';' )
            {
            // InternalDsl.g:1920:1: ( ';' )
            // InternalDsl.g:1921:2: ';'
            {
             before(grammarAccess.getDataAccess().getSemicolonKeyword_13_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getSemicolonKeyword_13_1()); 

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
    // $ANTLR end "rule__Data__Group_13__1__Impl"


    // $ANTLR start "rule__Platform__Group__0"
    // InternalDsl.g:1931:1: rule__Platform__Group__0 : rule__Platform__Group__0__Impl rule__Platform__Group__1 ;
    public final void rule__Platform__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1935:1: ( rule__Platform__Group__0__Impl rule__Platform__Group__1 )
            // InternalDsl.g:1936:2: rule__Platform__Group__0__Impl rule__Platform__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Platform__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group__1();

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
    // $ANTLR end "rule__Platform__Group__0"


    // $ANTLR start "rule__Platform__Group__0__Impl"
    // InternalDsl.g:1943:1: rule__Platform__Group__0__Impl : ( 'HwArchitecture' ) ;
    public final void rule__Platform__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1947:1: ( ( 'HwArchitecture' ) )
            // InternalDsl.g:1948:1: ( 'HwArchitecture' )
            {
            // InternalDsl.g:1948:1: ( 'HwArchitecture' )
            // InternalDsl.g:1949:2: 'HwArchitecture'
            {
             before(grammarAccess.getPlatformAccess().getHwArchitectureKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getHwArchitectureKeyword_0()); 

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
    // $ANTLR end "rule__Platform__Group__0__Impl"


    // $ANTLR start "rule__Platform__Group__1"
    // InternalDsl.g:1958:1: rule__Platform__Group__1 : rule__Platform__Group__1__Impl rule__Platform__Group__2 ;
    public final void rule__Platform__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1962:1: ( rule__Platform__Group__1__Impl rule__Platform__Group__2 )
            // InternalDsl.g:1963:2: rule__Platform__Group__1__Impl rule__Platform__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Platform__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group__2();

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
    // $ANTLR end "rule__Platform__Group__1"


    // $ANTLR start "rule__Platform__Group__1__Impl"
    // InternalDsl.g:1970:1: rule__Platform__Group__1__Impl : ( '{' ) ;
    public final void rule__Platform__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1974:1: ( ( '{' ) )
            // InternalDsl.g:1975:1: ( '{' )
            {
            // InternalDsl.g:1975:1: ( '{' )
            // InternalDsl.g:1976:2: '{'
            {
             before(grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Platform__Group__1__Impl"


    // $ANTLR start "rule__Platform__Group__2"
    // InternalDsl.g:1985:1: rule__Platform__Group__2 : rule__Platform__Group__2__Impl rule__Platform__Group__3 ;
    public final void rule__Platform__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1989:1: ( rule__Platform__Group__2__Impl rule__Platform__Group__3 )
            // InternalDsl.g:1990:2: rule__Platform__Group__2__Impl rule__Platform__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Platform__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group__3();

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
    // $ANTLR end "rule__Platform__Group__2"


    // $ANTLR start "rule__Platform__Group__2__Impl"
    // InternalDsl.g:1997:1: rule__Platform__Group__2__Impl : ( 'Computers' ) ;
    public final void rule__Platform__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2001:1: ( ( 'Computers' ) )
            // InternalDsl.g:2002:1: ( 'Computers' )
            {
            // InternalDsl.g:2002:1: ( 'Computers' )
            // InternalDsl.g:2003:2: 'Computers'
            {
             before(grammarAccess.getPlatformAccess().getComputersKeyword_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getComputersKeyword_2()); 

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
    // $ANTLR end "rule__Platform__Group__2__Impl"


    // $ANTLR start "rule__Platform__Group__3"
    // InternalDsl.g:2012:1: rule__Platform__Group__3 : rule__Platform__Group__3__Impl rule__Platform__Group__4 ;
    public final void rule__Platform__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2016:1: ( rule__Platform__Group__3__Impl rule__Platform__Group__4 )
            // InternalDsl.g:2017:2: rule__Platform__Group__3__Impl rule__Platform__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Platform__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group__4();

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
    // $ANTLR end "rule__Platform__Group__3"


    // $ANTLR start "rule__Platform__Group__3__Impl"
    // InternalDsl.g:2024:1: rule__Platform__Group__3__Impl : ( '{' ) ;
    public final void rule__Platform__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2028:1: ( ( '{' ) )
            // InternalDsl.g:2029:1: ( '{' )
            {
            // InternalDsl.g:2029:1: ( '{' )
            // InternalDsl.g:2030:2: '{'
            {
             before(grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Platform__Group__3__Impl"


    // $ANTLR start "rule__Platform__Group__4"
    // InternalDsl.g:2039:1: rule__Platform__Group__4 : rule__Platform__Group__4__Impl rule__Platform__Group__5 ;
    public final void rule__Platform__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2043:1: ( rule__Platform__Group__4__Impl rule__Platform__Group__5 )
            // InternalDsl.g:2044:2: rule__Platform__Group__4__Impl rule__Platform__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Platform__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group__5();

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
    // $ANTLR end "rule__Platform__Group__4"


    // $ANTLR start "rule__Platform__Group__4__Impl"
    // InternalDsl.g:2051:1: rule__Platform__Group__4__Impl : ( ( rule__Platform__ComputersPlatformAssignment_4 ) ) ;
    public final void rule__Platform__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2055:1: ( ( ( rule__Platform__ComputersPlatformAssignment_4 ) ) )
            // InternalDsl.g:2056:1: ( ( rule__Platform__ComputersPlatformAssignment_4 ) )
            {
            // InternalDsl.g:2056:1: ( ( rule__Platform__ComputersPlatformAssignment_4 ) )
            // InternalDsl.g:2057:2: ( rule__Platform__ComputersPlatformAssignment_4 )
            {
             before(grammarAccess.getPlatformAccess().getComputersPlatformAssignment_4()); 
            // InternalDsl.g:2058:2: ( rule__Platform__ComputersPlatformAssignment_4 )
            // InternalDsl.g:2058:3: rule__Platform__ComputersPlatformAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Platform__ComputersPlatformAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getComputersPlatformAssignment_4()); 

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
    // $ANTLR end "rule__Platform__Group__4__Impl"


    // $ANTLR start "rule__Platform__Group__5"
    // InternalDsl.g:2066:1: rule__Platform__Group__5 : rule__Platform__Group__5__Impl rule__Platform__Group__6 ;
    public final void rule__Platform__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2070:1: ( rule__Platform__Group__5__Impl rule__Platform__Group__6 )
            // InternalDsl.g:2071:2: rule__Platform__Group__5__Impl rule__Platform__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__Platform__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group__6();

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
    // $ANTLR end "rule__Platform__Group__5"


    // $ANTLR start "rule__Platform__Group__5__Impl"
    // InternalDsl.g:2078:1: rule__Platform__Group__5__Impl : ( ';' ) ;
    public final void rule__Platform__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2082:1: ( ( ';' ) )
            // InternalDsl.g:2083:1: ( ';' )
            {
            // InternalDsl.g:2083:1: ( ';' )
            // InternalDsl.g:2084:2: ';'
            {
             before(grammarAccess.getPlatformAccess().getSemicolonKeyword_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__Platform__Group__5__Impl"


    // $ANTLR start "rule__Platform__Group__6"
    // InternalDsl.g:2093:1: rule__Platform__Group__6 : rule__Platform__Group__6__Impl rule__Platform__Group__7 ;
    public final void rule__Platform__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2097:1: ( rule__Platform__Group__6__Impl rule__Platform__Group__7 )
            // InternalDsl.g:2098:2: rule__Platform__Group__6__Impl rule__Platform__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Platform__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group__7();

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
    // $ANTLR end "rule__Platform__Group__6"


    // $ANTLR start "rule__Platform__Group__6__Impl"
    // InternalDsl.g:2105:1: rule__Platform__Group__6__Impl : ( ( rule__Platform__Group_6__0 )* ) ;
    public final void rule__Platform__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2109:1: ( ( ( rule__Platform__Group_6__0 )* ) )
            // InternalDsl.g:2110:1: ( ( rule__Platform__Group_6__0 )* )
            {
            // InternalDsl.g:2110:1: ( ( rule__Platform__Group_6__0 )* )
            // InternalDsl.g:2111:2: ( rule__Platform__Group_6__0 )*
            {
             before(grammarAccess.getPlatformAccess().getGroup_6()); 
            // InternalDsl.g:2112:2: ( rule__Platform__Group_6__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==62) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDsl.g:2112:3: rule__Platform__Group_6__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Platform__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getPlatformAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Platform__Group__6__Impl"


    // $ANTLR start "rule__Platform__Group__7"
    // InternalDsl.g:2120:1: rule__Platform__Group__7 : rule__Platform__Group__7__Impl rule__Platform__Group__8 ;
    public final void rule__Platform__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2124:1: ( rule__Platform__Group__7__Impl rule__Platform__Group__8 )
            // InternalDsl.g:2125:2: rule__Platform__Group__7__Impl rule__Platform__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__Platform__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group__8();

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
    // $ANTLR end "rule__Platform__Group__7"


    // $ANTLR start "rule__Platform__Group__7__Impl"
    // InternalDsl.g:2132:1: rule__Platform__Group__7__Impl : ( '}' ) ;
    public final void rule__Platform__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2136:1: ( ( '}' ) )
            // InternalDsl.g:2137:1: ( '}' )
            {
            // InternalDsl.g:2137:1: ( '}' )
            // InternalDsl.g:2138:2: '}'
            {
             before(grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_7()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Platform__Group__7__Impl"


    // $ANTLR start "rule__Platform__Group__8"
    // InternalDsl.g:2147:1: rule__Platform__Group__8 : rule__Platform__Group__8__Impl rule__Platform__Group__9 ;
    public final void rule__Platform__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2151:1: ( rule__Platform__Group__8__Impl rule__Platform__Group__9 )
            // InternalDsl.g:2152:2: rule__Platform__Group__8__Impl rule__Platform__Group__9
            {
            pushFollow(FOLLOW_20);
            rule__Platform__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group__9();

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
    // $ANTLR end "rule__Platform__Group__8"


    // $ANTLR start "rule__Platform__Group__8__Impl"
    // InternalDsl.g:2159:1: rule__Platform__Group__8__Impl : ( ';' ) ;
    public final void rule__Platform__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2163:1: ( ( ';' ) )
            // InternalDsl.g:2164:1: ( ';' )
            {
            // InternalDsl.g:2164:1: ( ';' )
            // InternalDsl.g:2165:2: ';'
            {
             before(grammarAccess.getPlatformAccess().getSemicolonKeyword_8()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getSemicolonKeyword_8()); 

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
    // $ANTLR end "rule__Platform__Group__8__Impl"


    // $ANTLR start "rule__Platform__Group__9"
    // InternalDsl.g:2174:1: rule__Platform__Group__9 : rule__Platform__Group__9__Impl rule__Platform__Group__10 ;
    public final void rule__Platform__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2178:1: ( rule__Platform__Group__9__Impl rule__Platform__Group__10 )
            // InternalDsl.g:2179:2: rule__Platform__Group__9__Impl rule__Platform__Group__10
            {
            pushFollow(FOLLOW_5);
            rule__Platform__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group__10();

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
    // $ANTLR end "rule__Platform__Group__9"


    // $ANTLR start "rule__Platform__Group__9__Impl"
    // InternalDsl.g:2186:1: rule__Platform__Group__9__Impl : ( 'Networks' ) ;
    public final void rule__Platform__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2190:1: ( ( 'Networks' ) )
            // InternalDsl.g:2191:1: ( 'Networks' )
            {
            // InternalDsl.g:2191:1: ( 'Networks' )
            // InternalDsl.g:2192:2: 'Networks'
            {
             before(grammarAccess.getPlatformAccess().getNetworksKeyword_9()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getNetworksKeyword_9()); 

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
    // $ANTLR end "rule__Platform__Group__9__Impl"


    // $ANTLR start "rule__Platform__Group__10"
    // InternalDsl.g:2201:1: rule__Platform__Group__10 : rule__Platform__Group__10__Impl rule__Platform__Group__11 ;
    public final void rule__Platform__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2205:1: ( rule__Platform__Group__10__Impl rule__Platform__Group__11 )
            // InternalDsl.g:2206:2: rule__Platform__Group__10__Impl rule__Platform__Group__11
            {
            pushFollow(FOLLOW_21);
            rule__Platform__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group__11();

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
    // $ANTLR end "rule__Platform__Group__10"


    // $ANTLR start "rule__Platform__Group__10__Impl"
    // InternalDsl.g:2213:1: rule__Platform__Group__10__Impl : ( '{' ) ;
    public final void rule__Platform__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2217:1: ( ( '{' ) )
            // InternalDsl.g:2218:1: ( '{' )
            {
            // InternalDsl.g:2218:1: ( '{' )
            // InternalDsl.g:2219:2: '{'
            {
             before(grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_10()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__Platform__Group__10__Impl"


    // $ANTLR start "rule__Platform__Group__11"
    // InternalDsl.g:2228:1: rule__Platform__Group__11 : rule__Platform__Group__11__Impl rule__Platform__Group__12 ;
    public final void rule__Platform__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2232:1: ( rule__Platform__Group__11__Impl rule__Platform__Group__12 )
            // InternalDsl.g:2233:2: rule__Platform__Group__11__Impl rule__Platform__Group__12
            {
            pushFollow(FOLLOW_7);
            rule__Platform__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group__12();

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
    // $ANTLR end "rule__Platform__Group__11"


    // $ANTLR start "rule__Platform__Group__11__Impl"
    // InternalDsl.g:2240:1: rule__Platform__Group__11__Impl : ( ( rule__Platform__NetworksPlatformAssignment_11 ) ) ;
    public final void rule__Platform__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2244:1: ( ( ( rule__Platform__NetworksPlatformAssignment_11 ) ) )
            // InternalDsl.g:2245:1: ( ( rule__Platform__NetworksPlatformAssignment_11 ) )
            {
            // InternalDsl.g:2245:1: ( ( rule__Platform__NetworksPlatformAssignment_11 ) )
            // InternalDsl.g:2246:2: ( rule__Platform__NetworksPlatformAssignment_11 )
            {
             before(grammarAccess.getPlatformAccess().getNetworksPlatformAssignment_11()); 
            // InternalDsl.g:2247:2: ( rule__Platform__NetworksPlatformAssignment_11 )
            // InternalDsl.g:2247:3: rule__Platform__NetworksPlatformAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Platform__NetworksPlatformAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getNetworksPlatformAssignment_11()); 

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
    // $ANTLR end "rule__Platform__Group__11__Impl"


    // $ANTLR start "rule__Platform__Group__12"
    // InternalDsl.g:2255:1: rule__Platform__Group__12 : rule__Platform__Group__12__Impl rule__Platform__Group__13 ;
    public final void rule__Platform__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2259:1: ( rule__Platform__Group__12__Impl rule__Platform__Group__13 )
            // InternalDsl.g:2260:2: rule__Platform__Group__12__Impl rule__Platform__Group__13
            {
            pushFollow(FOLLOW_22);
            rule__Platform__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group__13();

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
    // $ANTLR end "rule__Platform__Group__12"


    // $ANTLR start "rule__Platform__Group__12__Impl"
    // InternalDsl.g:2267:1: rule__Platform__Group__12__Impl : ( ';' ) ;
    public final void rule__Platform__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2271:1: ( ( ';' ) )
            // InternalDsl.g:2272:1: ( ';' )
            {
            // InternalDsl.g:2272:1: ( ';' )
            // InternalDsl.g:2273:2: ';'
            {
             before(grammarAccess.getPlatformAccess().getSemicolonKeyword_12()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getSemicolonKeyword_12()); 

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
    // $ANTLR end "rule__Platform__Group__12__Impl"


    // $ANTLR start "rule__Platform__Group__13"
    // InternalDsl.g:2282:1: rule__Platform__Group__13 : rule__Platform__Group__13__Impl rule__Platform__Group__14 ;
    public final void rule__Platform__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2286:1: ( rule__Platform__Group__13__Impl rule__Platform__Group__14 )
            // InternalDsl.g:2287:2: rule__Platform__Group__13__Impl rule__Platform__Group__14
            {
            pushFollow(FOLLOW_22);
            rule__Platform__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group__14();

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
    // $ANTLR end "rule__Platform__Group__13"


    // $ANTLR start "rule__Platform__Group__13__Impl"
    // InternalDsl.g:2294:1: rule__Platform__Group__13__Impl : ( ( rule__Platform__Group_13__0 )* ) ;
    public final void rule__Platform__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2298:1: ( ( ( rule__Platform__Group_13__0 )* ) )
            // InternalDsl.g:2299:1: ( ( rule__Platform__Group_13__0 )* )
            {
            // InternalDsl.g:2299:1: ( ( rule__Platform__Group_13__0 )* )
            // InternalDsl.g:2300:2: ( rule__Platform__Group_13__0 )*
            {
             before(grammarAccess.getPlatformAccess().getGroup_13()); 
            // InternalDsl.g:2301:2: ( rule__Platform__Group_13__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==66) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDsl.g:2301:3: rule__Platform__Group_13__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Platform__Group_13__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getPlatformAccess().getGroup_13()); 

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
    // $ANTLR end "rule__Platform__Group__13__Impl"


    // $ANTLR start "rule__Platform__Group__14"
    // InternalDsl.g:2309:1: rule__Platform__Group__14 : rule__Platform__Group__14__Impl rule__Platform__Group__15 ;
    public final void rule__Platform__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2313:1: ( rule__Platform__Group__14__Impl rule__Platform__Group__15 )
            // InternalDsl.g:2314:2: rule__Platform__Group__14__Impl rule__Platform__Group__15
            {
            pushFollow(FOLLOW_7);
            rule__Platform__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group__15();

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
    // $ANTLR end "rule__Platform__Group__14"


    // $ANTLR start "rule__Platform__Group__14__Impl"
    // InternalDsl.g:2321:1: rule__Platform__Group__14__Impl : ( '}' ) ;
    public final void rule__Platform__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2325:1: ( ( '}' ) )
            // InternalDsl.g:2326:1: ( '}' )
            {
            // InternalDsl.g:2326:1: ( '}' )
            // InternalDsl.g:2327:2: '}'
            {
             before(grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_14()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_14()); 

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
    // $ANTLR end "rule__Platform__Group__14__Impl"


    // $ANTLR start "rule__Platform__Group__15"
    // InternalDsl.g:2336:1: rule__Platform__Group__15 : rule__Platform__Group__15__Impl rule__Platform__Group__16 ;
    public final void rule__Platform__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2340:1: ( rule__Platform__Group__15__Impl rule__Platform__Group__16 )
            // InternalDsl.g:2341:2: rule__Platform__Group__15__Impl rule__Platform__Group__16
            {
            pushFollow(FOLLOW_15);
            rule__Platform__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group__16();

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
    // $ANTLR end "rule__Platform__Group__15"


    // $ANTLR start "rule__Platform__Group__15__Impl"
    // InternalDsl.g:2348:1: rule__Platform__Group__15__Impl : ( ';' ) ;
    public final void rule__Platform__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2352:1: ( ( ';' ) )
            // InternalDsl.g:2353:1: ( ';' )
            {
            // InternalDsl.g:2353:1: ( ';' )
            // InternalDsl.g:2354:2: ';'
            {
             before(grammarAccess.getPlatformAccess().getSemicolonKeyword_15()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getSemicolonKeyword_15()); 

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
    // $ANTLR end "rule__Platform__Group__15__Impl"


    // $ANTLR start "rule__Platform__Group__16"
    // InternalDsl.g:2363:1: rule__Platform__Group__16 : rule__Platform__Group__16__Impl rule__Platform__Group__17 ;
    public final void rule__Platform__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2367:1: ( rule__Platform__Group__16__Impl rule__Platform__Group__17 )
            // InternalDsl.g:2368:2: rule__Platform__Group__16__Impl rule__Platform__Group__17
            {
            pushFollow(FOLLOW_7);
            rule__Platform__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group__17();

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
    // $ANTLR end "rule__Platform__Group__16"


    // $ANTLR start "rule__Platform__Group__16__Impl"
    // InternalDsl.g:2375:1: rule__Platform__Group__16__Impl : ( '}' ) ;
    public final void rule__Platform__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2379:1: ( ( '}' ) )
            // InternalDsl.g:2380:1: ( '}' )
            {
            // InternalDsl.g:2380:1: ( '}' )
            // InternalDsl.g:2381:2: '}'
            {
             before(grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_16()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_16()); 

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
    // $ANTLR end "rule__Platform__Group__16__Impl"


    // $ANTLR start "rule__Platform__Group__17"
    // InternalDsl.g:2390:1: rule__Platform__Group__17 : rule__Platform__Group__17__Impl ;
    public final void rule__Platform__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2394:1: ( rule__Platform__Group__17__Impl )
            // InternalDsl.g:2395:2: rule__Platform__Group__17__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Platform__Group__17__Impl();

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
    // $ANTLR end "rule__Platform__Group__17"


    // $ANTLR start "rule__Platform__Group__17__Impl"
    // InternalDsl.g:2401:1: rule__Platform__Group__17__Impl : ( ';' ) ;
    public final void rule__Platform__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2405:1: ( ( ';' ) )
            // InternalDsl.g:2406:1: ( ';' )
            {
            // InternalDsl.g:2406:1: ( ';' )
            // InternalDsl.g:2407:2: ';'
            {
             before(grammarAccess.getPlatformAccess().getSemicolonKeyword_17()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getSemicolonKeyword_17()); 

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
    // $ANTLR end "rule__Platform__Group__17__Impl"


    // $ANTLR start "rule__Platform__Group_6__0"
    // InternalDsl.g:2417:1: rule__Platform__Group_6__0 : rule__Platform__Group_6__0__Impl rule__Platform__Group_6__1 ;
    public final void rule__Platform__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2421:1: ( rule__Platform__Group_6__0__Impl rule__Platform__Group_6__1 )
            // InternalDsl.g:2422:2: rule__Platform__Group_6__0__Impl rule__Platform__Group_6__1
            {
            pushFollow(FOLLOW_7);
            rule__Platform__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group_6__1();

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
    // $ANTLR end "rule__Platform__Group_6__0"


    // $ANTLR start "rule__Platform__Group_6__0__Impl"
    // InternalDsl.g:2429:1: rule__Platform__Group_6__0__Impl : ( ( rule__Platform__ComputersPlatformAssignment_6_0 ) ) ;
    public final void rule__Platform__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2433:1: ( ( ( rule__Platform__ComputersPlatformAssignment_6_0 ) ) )
            // InternalDsl.g:2434:1: ( ( rule__Platform__ComputersPlatformAssignment_6_0 ) )
            {
            // InternalDsl.g:2434:1: ( ( rule__Platform__ComputersPlatformAssignment_6_0 ) )
            // InternalDsl.g:2435:2: ( rule__Platform__ComputersPlatformAssignment_6_0 )
            {
             before(grammarAccess.getPlatformAccess().getComputersPlatformAssignment_6_0()); 
            // InternalDsl.g:2436:2: ( rule__Platform__ComputersPlatformAssignment_6_0 )
            // InternalDsl.g:2436:3: rule__Platform__ComputersPlatformAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__Platform__ComputersPlatformAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getComputersPlatformAssignment_6_0()); 

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
    // $ANTLR end "rule__Platform__Group_6__0__Impl"


    // $ANTLR start "rule__Platform__Group_6__1"
    // InternalDsl.g:2444:1: rule__Platform__Group_6__1 : rule__Platform__Group_6__1__Impl ;
    public final void rule__Platform__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2448:1: ( rule__Platform__Group_6__1__Impl )
            // InternalDsl.g:2449:2: rule__Platform__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Platform__Group_6__1__Impl();

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
    // $ANTLR end "rule__Platform__Group_6__1"


    // $ANTLR start "rule__Platform__Group_6__1__Impl"
    // InternalDsl.g:2455:1: rule__Platform__Group_6__1__Impl : ( ';' ) ;
    public final void rule__Platform__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2459:1: ( ( ';' ) )
            // InternalDsl.g:2460:1: ( ';' )
            {
            // InternalDsl.g:2460:1: ( ';' )
            // InternalDsl.g:2461:2: ';'
            {
             before(grammarAccess.getPlatformAccess().getSemicolonKeyword_6_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getSemicolonKeyword_6_1()); 

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
    // $ANTLR end "rule__Platform__Group_6__1__Impl"


    // $ANTLR start "rule__Platform__Group_13__0"
    // InternalDsl.g:2471:1: rule__Platform__Group_13__0 : rule__Platform__Group_13__0__Impl rule__Platform__Group_13__1 ;
    public final void rule__Platform__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2475:1: ( rule__Platform__Group_13__0__Impl rule__Platform__Group_13__1 )
            // InternalDsl.g:2476:2: rule__Platform__Group_13__0__Impl rule__Platform__Group_13__1
            {
            pushFollow(FOLLOW_7);
            rule__Platform__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platform__Group_13__1();

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
    // $ANTLR end "rule__Platform__Group_13__0"


    // $ANTLR start "rule__Platform__Group_13__0__Impl"
    // InternalDsl.g:2483:1: rule__Platform__Group_13__0__Impl : ( ( rule__Platform__NetworksPlatformAssignment_13_0 ) ) ;
    public final void rule__Platform__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2487:1: ( ( ( rule__Platform__NetworksPlatformAssignment_13_0 ) ) )
            // InternalDsl.g:2488:1: ( ( rule__Platform__NetworksPlatformAssignment_13_0 ) )
            {
            // InternalDsl.g:2488:1: ( ( rule__Platform__NetworksPlatformAssignment_13_0 ) )
            // InternalDsl.g:2489:2: ( rule__Platform__NetworksPlatformAssignment_13_0 )
            {
             before(grammarAccess.getPlatformAccess().getNetworksPlatformAssignment_13_0()); 
            // InternalDsl.g:2490:2: ( rule__Platform__NetworksPlatformAssignment_13_0 )
            // InternalDsl.g:2490:3: rule__Platform__NetworksPlatformAssignment_13_0
            {
            pushFollow(FOLLOW_2);
            rule__Platform__NetworksPlatformAssignment_13_0();

            state._fsp--;


            }

             after(grammarAccess.getPlatformAccess().getNetworksPlatformAssignment_13_0()); 

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
    // $ANTLR end "rule__Platform__Group_13__0__Impl"


    // $ANTLR start "rule__Platform__Group_13__1"
    // InternalDsl.g:2498:1: rule__Platform__Group_13__1 : rule__Platform__Group_13__1__Impl ;
    public final void rule__Platform__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2502:1: ( rule__Platform__Group_13__1__Impl )
            // InternalDsl.g:2503:2: rule__Platform__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Platform__Group_13__1__Impl();

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
    // $ANTLR end "rule__Platform__Group_13__1"


    // $ANTLR start "rule__Platform__Group_13__1__Impl"
    // InternalDsl.g:2509:1: rule__Platform__Group_13__1__Impl : ( ';' ) ;
    public final void rule__Platform__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2513:1: ( ( ';' ) )
            // InternalDsl.g:2514:1: ( ';' )
            {
            // InternalDsl.g:2514:1: ( ';' )
            // InternalDsl.g:2515:2: ';'
            {
             before(grammarAccess.getPlatformAccess().getSemicolonKeyword_13_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPlatformAccess().getSemicolonKeyword_13_1()); 

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
    // $ANTLR end "rule__Platform__Group_13__1__Impl"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__0"
    // InternalDsl.g:2525:1: rule__MinMaxVisualizationClient__Group__0 : rule__MinMaxVisualizationClient__Group__0__Impl rule__MinMaxVisualizationClient__Group__1 ;
    public final void rule__MinMaxVisualizationClient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2529:1: ( rule__MinMaxVisualizationClient__Group__0__Impl rule__MinMaxVisualizationClient__Group__1 )
            // InternalDsl.g:2530:2: rule__MinMaxVisualizationClient__Group__0__Impl rule__MinMaxVisualizationClient__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__MinMaxVisualizationClient__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__Group__1();

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__0"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__0__Impl"
    // InternalDsl.g:2537:1: rule__MinMaxVisualizationClient__Group__0__Impl : ( 'Tool' ) ;
    public final void rule__MinMaxVisualizationClient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2541:1: ( ( 'Tool' ) )
            // InternalDsl.g:2542:1: ( 'Tool' )
            {
            // InternalDsl.g:2542:1: ( 'Tool' )
            // InternalDsl.g:2543:2: 'Tool'
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getToolKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getMinMaxVisualizationClientAccess().getToolKeyword_0()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__0__Impl"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__1"
    // InternalDsl.g:2552:1: rule__MinMaxVisualizationClient__Group__1 : rule__MinMaxVisualizationClient__Group__1__Impl rule__MinMaxVisualizationClient__Group__2 ;
    public final void rule__MinMaxVisualizationClient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2556:1: ( rule__MinMaxVisualizationClient__Group__1__Impl rule__MinMaxVisualizationClient__Group__2 )
            // InternalDsl.g:2557:2: rule__MinMaxVisualizationClient__Group__1__Impl rule__MinMaxVisualizationClient__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__MinMaxVisualizationClient__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__Group__2();

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__1"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__1__Impl"
    // InternalDsl.g:2564:1: rule__MinMaxVisualizationClient__Group__1__Impl : ( ( rule__MinMaxVisualizationClient__NameAssignment_1 ) ) ;
    public final void rule__MinMaxVisualizationClient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2568:1: ( ( ( rule__MinMaxVisualizationClient__NameAssignment_1 ) ) )
            // InternalDsl.g:2569:1: ( ( rule__MinMaxVisualizationClient__NameAssignment_1 ) )
            {
            // InternalDsl.g:2569:1: ( ( rule__MinMaxVisualizationClient__NameAssignment_1 ) )
            // InternalDsl.g:2570:2: ( rule__MinMaxVisualizationClient__NameAssignment_1 )
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getNameAssignment_1()); 
            // InternalDsl.g:2571:2: ( rule__MinMaxVisualizationClient__NameAssignment_1 )
            // InternalDsl.g:2571:3: rule__MinMaxVisualizationClient__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMinMaxVisualizationClientAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__1__Impl"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__2"
    // InternalDsl.g:2579:1: rule__MinMaxVisualizationClient__Group__2 : rule__MinMaxVisualizationClient__Group__2__Impl rule__MinMaxVisualizationClient__Group__3 ;
    public final void rule__MinMaxVisualizationClient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2583:1: ( rule__MinMaxVisualizationClient__Group__2__Impl rule__MinMaxVisualizationClient__Group__3 )
            // InternalDsl.g:2584:2: rule__MinMaxVisualizationClient__Group__2__Impl rule__MinMaxVisualizationClient__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__MinMaxVisualizationClient__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__Group__3();

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__2"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__2__Impl"
    // InternalDsl.g:2591:1: rule__MinMaxVisualizationClient__Group__2__Impl : ( '(' ) ;
    public final void rule__MinMaxVisualizationClient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2595:1: ( ( '(' ) )
            // InternalDsl.g:2596:1: ( '(' )
            {
            // InternalDsl.g:2596:1: ( '(' )
            // InternalDsl.g:2597:2: '('
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getLeftParenthesisKeyword_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getMinMaxVisualizationClientAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__2__Impl"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__3"
    // InternalDsl.g:2606:1: rule__MinMaxVisualizationClient__Group__3 : rule__MinMaxVisualizationClient__Group__3__Impl rule__MinMaxVisualizationClient__Group__4 ;
    public final void rule__MinMaxVisualizationClient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2610:1: ( rule__MinMaxVisualizationClient__Group__3__Impl rule__MinMaxVisualizationClient__Group__4 )
            // InternalDsl.g:2611:2: rule__MinMaxVisualizationClient__Group__3__Impl rule__MinMaxVisualizationClient__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__MinMaxVisualizationClient__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__Group__4();

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__3"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__3__Impl"
    // InternalDsl.g:2618:1: rule__MinMaxVisualizationClient__Group__3__Impl : ( ( rule__MinMaxVisualizationClient__TimeSeriesSelectedAssignment_3 ) ) ;
    public final void rule__MinMaxVisualizationClient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2622:1: ( ( ( rule__MinMaxVisualizationClient__TimeSeriesSelectedAssignment_3 ) ) )
            // InternalDsl.g:2623:1: ( ( rule__MinMaxVisualizationClient__TimeSeriesSelectedAssignment_3 ) )
            {
            // InternalDsl.g:2623:1: ( ( rule__MinMaxVisualizationClient__TimeSeriesSelectedAssignment_3 ) )
            // InternalDsl.g:2624:2: ( rule__MinMaxVisualizationClient__TimeSeriesSelectedAssignment_3 )
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getTimeSeriesSelectedAssignment_3()); 
            // InternalDsl.g:2625:2: ( rule__MinMaxVisualizationClient__TimeSeriesSelectedAssignment_3 )
            // InternalDsl.g:2625:3: rule__MinMaxVisualizationClient__TimeSeriesSelectedAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__TimeSeriesSelectedAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMinMaxVisualizationClientAccess().getTimeSeriesSelectedAssignment_3()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__3__Impl"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__4"
    // InternalDsl.g:2633:1: rule__MinMaxVisualizationClient__Group__4 : rule__MinMaxVisualizationClient__Group__4__Impl rule__MinMaxVisualizationClient__Group__5 ;
    public final void rule__MinMaxVisualizationClient__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2637:1: ( rule__MinMaxVisualizationClient__Group__4__Impl rule__MinMaxVisualizationClient__Group__5 )
            // InternalDsl.g:2638:2: rule__MinMaxVisualizationClient__Group__4__Impl rule__MinMaxVisualizationClient__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__MinMaxVisualizationClient__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__Group__5();

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__4"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__4__Impl"
    // InternalDsl.g:2645:1: rule__MinMaxVisualizationClient__Group__4__Impl : ( 'on' ) ;
    public final void rule__MinMaxVisualizationClient__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2649:1: ( ( 'on' ) )
            // InternalDsl.g:2650:1: ( 'on' )
            {
            // InternalDsl.g:2650:1: ( 'on' )
            // InternalDsl.g:2651:2: 'on'
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getOnKeyword_4()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getMinMaxVisualizationClientAccess().getOnKeyword_4()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__4__Impl"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__5"
    // InternalDsl.g:2660:1: rule__MinMaxVisualizationClient__Group__5 : rule__MinMaxVisualizationClient__Group__5__Impl rule__MinMaxVisualizationClient__Group__6 ;
    public final void rule__MinMaxVisualizationClient__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2664:1: ( rule__MinMaxVisualizationClient__Group__5__Impl rule__MinMaxVisualizationClient__Group__6 )
            // InternalDsl.g:2665:2: rule__MinMaxVisualizationClient__Group__5__Impl rule__MinMaxVisualizationClient__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__MinMaxVisualizationClient__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__Group__6();

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__5"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__5__Impl"
    // InternalDsl.g:2672:1: rule__MinMaxVisualizationClient__Group__5__Impl : ( ( rule__MinMaxVisualizationClient__ClientComputerAssignment_5 ) ) ;
    public final void rule__MinMaxVisualizationClient__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2676:1: ( ( ( rule__MinMaxVisualizationClient__ClientComputerAssignment_5 ) ) )
            // InternalDsl.g:2677:1: ( ( rule__MinMaxVisualizationClient__ClientComputerAssignment_5 ) )
            {
            // InternalDsl.g:2677:1: ( ( rule__MinMaxVisualizationClient__ClientComputerAssignment_5 ) )
            // InternalDsl.g:2678:2: ( rule__MinMaxVisualizationClient__ClientComputerAssignment_5 )
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getClientComputerAssignment_5()); 
            // InternalDsl.g:2679:2: ( rule__MinMaxVisualizationClient__ClientComputerAssignment_5 )
            // InternalDsl.g:2679:3: rule__MinMaxVisualizationClient__ClientComputerAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__ClientComputerAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMinMaxVisualizationClientAccess().getClientComputerAssignment_5()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__5__Impl"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__6"
    // InternalDsl.g:2687:1: rule__MinMaxVisualizationClient__Group__6 : rule__MinMaxVisualizationClient__Group__6__Impl rule__MinMaxVisualizationClient__Group__7 ;
    public final void rule__MinMaxVisualizationClient__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2691:1: ( rule__MinMaxVisualizationClient__Group__6__Impl rule__MinMaxVisualizationClient__Group__7 )
            // InternalDsl.g:2692:2: rule__MinMaxVisualizationClient__Group__6__Impl rule__MinMaxVisualizationClient__Group__7
            {
            pushFollow(FOLLOW_27);
            rule__MinMaxVisualizationClient__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__Group__7();

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__6"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__6__Impl"
    // InternalDsl.g:2699:1: rule__MinMaxVisualizationClient__Group__6__Impl : ( ',' ) ;
    public final void rule__MinMaxVisualizationClient__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2703:1: ( ( ',' ) )
            // InternalDsl.g:2704:1: ( ',' )
            {
            // InternalDsl.g:2704:1: ( ',' )
            // InternalDsl.g:2705:2: ','
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getCommaKeyword_6()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getMinMaxVisualizationClientAccess().getCommaKeyword_6()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__6__Impl"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__7"
    // InternalDsl.g:2714:1: rule__MinMaxVisualizationClient__Group__7 : rule__MinMaxVisualizationClient__Group__7__Impl rule__MinMaxVisualizationClient__Group__8 ;
    public final void rule__MinMaxVisualizationClient__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2718:1: ( rule__MinMaxVisualizationClient__Group__7__Impl rule__MinMaxVisualizationClient__Group__8 )
            // InternalDsl.g:2719:2: rule__MinMaxVisualizationClient__Group__7__Impl rule__MinMaxVisualizationClient__Group__8
            {
            pushFollow(FOLLOW_26);
            rule__MinMaxVisualizationClient__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__Group__8();

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__7"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__7__Impl"
    // InternalDsl.g:2726:1: rule__MinMaxVisualizationClient__Group__7__Impl : ( ( rule__MinMaxVisualizationClient__ChartWidthAssignment_7 ) ) ;
    public final void rule__MinMaxVisualizationClient__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2730:1: ( ( ( rule__MinMaxVisualizationClient__ChartWidthAssignment_7 ) ) )
            // InternalDsl.g:2731:1: ( ( rule__MinMaxVisualizationClient__ChartWidthAssignment_7 ) )
            {
            // InternalDsl.g:2731:1: ( ( rule__MinMaxVisualizationClient__ChartWidthAssignment_7 ) )
            // InternalDsl.g:2732:2: ( rule__MinMaxVisualizationClient__ChartWidthAssignment_7 )
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getChartWidthAssignment_7()); 
            // InternalDsl.g:2733:2: ( rule__MinMaxVisualizationClient__ChartWidthAssignment_7 )
            // InternalDsl.g:2733:3: rule__MinMaxVisualizationClient__ChartWidthAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__ChartWidthAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getMinMaxVisualizationClientAccess().getChartWidthAssignment_7()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__7__Impl"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__8"
    // InternalDsl.g:2741:1: rule__MinMaxVisualizationClient__Group__8 : rule__MinMaxVisualizationClient__Group__8__Impl rule__MinMaxVisualizationClient__Group__9 ;
    public final void rule__MinMaxVisualizationClient__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2745:1: ( rule__MinMaxVisualizationClient__Group__8__Impl rule__MinMaxVisualizationClient__Group__9 )
            // InternalDsl.g:2746:2: rule__MinMaxVisualizationClient__Group__8__Impl rule__MinMaxVisualizationClient__Group__9
            {
            pushFollow(FOLLOW_27);
            rule__MinMaxVisualizationClient__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__Group__9();

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__8"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__8__Impl"
    // InternalDsl.g:2753:1: rule__MinMaxVisualizationClient__Group__8__Impl : ( ',' ) ;
    public final void rule__MinMaxVisualizationClient__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2757:1: ( ( ',' ) )
            // InternalDsl.g:2758:1: ( ',' )
            {
            // InternalDsl.g:2758:1: ( ',' )
            // InternalDsl.g:2759:2: ','
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getCommaKeyword_8()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getMinMaxVisualizationClientAccess().getCommaKeyword_8()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__8__Impl"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__9"
    // InternalDsl.g:2768:1: rule__MinMaxVisualizationClient__Group__9 : rule__MinMaxVisualizationClient__Group__9__Impl rule__MinMaxVisualizationClient__Group__10 ;
    public final void rule__MinMaxVisualizationClient__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2772:1: ( rule__MinMaxVisualizationClient__Group__9__Impl rule__MinMaxVisualizationClient__Group__10 )
            // InternalDsl.g:2773:2: rule__MinMaxVisualizationClient__Group__9__Impl rule__MinMaxVisualizationClient__Group__10
            {
            pushFollow(FOLLOW_26);
            rule__MinMaxVisualizationClient__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__Group__10();

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__9"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__9__Impl"
    // InternalDsl.g:2780:1: rule__MinMaxVisualizationClient__Group__9__Impl : ( ( rule__MinMaxVisualizationClient__ChartHeightAssignment_9 ) ) ;
    public final void rule__MinMaxVisualizationClient__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2784:1: ( ( ( rule__MinMaxVisualizationClient__ChartHeightAssignment_9 ) ) )
            // InternalDsl.g:2785:1: ( ( rule__MinMaxVisualizationClient__ChartHeightAssignment_9 ) )
            {
            // InternalDsl.g:2785:1: ( ( rule__MinMaxVisualizationClient__ChartHeightAssignment_9 ) )
            // InternalDsl.g:2786:2: ( rule__MinMaxVisualizationClient__ChartHeightAssignment_9 )
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getChartHeightAssignment_9()); 
            // InternalDsl.g:2787:2: ( rule__MinMaxVisualizationClient__ChartHeightAssignment_9 )
            // InternalDsl.g:2787:3: rule__MinMaxVisualizationClient__ChartHeightAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__ChartHeightAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getMinMaxVisualizationClientAccess().getChartHeightAssignment_9()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__9__Impl"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__10"
    // InternalDsl.g:2795:1: rule__MinMaxVisualizationClient__Group__10 : rule__MinMaxVisualizationClient__Group__10__Impl rule__MinMaxVisualizationClient__Group__11 ;
    public final void rule__MinMaxVisualizationClient__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2799:1: ( rule__MinMaxVisualizationClient__Group__10__Impl rule__MinMaxVisualizationClient__Group__11 )
            // InternalDsl.g:2800:2: rule__MinMaxVisualizationClient__Group__10__Impl rule__MinMaxVisualizationClient__Group__11
            {
            pushFollow(FOLLOW_27);
            rule__MinMaxVisualizationClient__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__Group__11();

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__10"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__10__Impl"
    // InternalDsl.g:2807:1: rule__MinMaxVisualizationClient__Group__10__Impl : ( ',' ) ;
    public final void rule__MinMaxVisualizationClient__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2811:1: ( ( ',' ) )
            // InternalDsl.g:2812:1: ( ',' )
            {
            // InternalDsl.g:2812:1: ( ',' )
            // InternalDsl.g:2813:2: ','
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getCommaKeyword_10()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getMinMaxVisualizationClientAccess().getCommaKeyword_10()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__10__Impl"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__11"
    // InternalDsl.g:2822:1: rule__MinMaxVisualizationClient__Group__11 : rule__MinMaxVisualizationClient__Group__11__Impl rule__MinMaxVisualizationClient__Group__12 ;
    public final void rule__MinMaxVisualizationClient__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2826:1: ( rule__MinMaxVisualizationClient__Group__11__Impl rule__MinMaxVisualizationClient__Group__12 )
            // InternalDsl.g:2827:2: rule__MinMaxVisualizationClient__Group__11__Impl rule__MinMaxVisualizationClient__Group__12
            {
            pushFollow(FOLLOW_28);
            rule__MinMaxVisualizationClient__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__Group__12();

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__11"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__11__Impl"
    // InternalDsl.g:2834:1: rule__MinMaxVisualizationClient__Group__11__Impl : ( ( rule__MinMaxVisualizationClient__AxisFactorAssignment_11 ) ) ;
    public final void rule__MinMaxVisualizationClient__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2838:1: ( ( ( rule__MinMaxVisualizationClient__AxisFactorAssignment_11 ) ) )
            // InternalDsl.g:2839:1: ( ( rule__MinMaxVisualizationClient__AxisFactorAssignment_11 ) )
            {
            // InternalDsl.g:2839:1: ( ( rule__MinMaxVisualizationClient__AxisFactorAssignment_11 ) )
            // InternalDsl.g:2840:2: ( rule__MinMaxVisualizationClient__AxisFactorAssignment_11 )
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getAxisFactorAssignment_11()); 
            // InternalDsl.g:2841:2: ( rule__MinMaxVisualizationClient__AxisFactorAssignment_11 )
            // InternalDsl.g:2841:3: rule__MinMaxVisualizationClient__AxisFactorAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__AxisFactorAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getMinMaxVisualizationClientAccess().getAxisFactorAssignment_11()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__11__Impl"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__12"
    // InternalDsl.g:2849:1: rule__MinMaxVisualizationClient__Group__12 : rule__MinMaxVisualizationClient__Group__12__Impl rule__MinMaxVisualizationClient__Group__13 ;
    public final void rule__MinMaxVisualizationClient__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2853:1: ( rule__MinMaxVisualizationClient__Group__12__Impl rule__MinMaxVisualizationClient__Group__13 )
            // InternalDsl.g:2854:2: rule__MinMaxVisualizationClient__Group__12__Impl rule__MinMaxVisualizationClient__Group__13
            {
            pushFollow(FOLLOW_5);
            rule__MinMaxVisualizationClient__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__Group__13();

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__12"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__12__Impl"
    // InternalDsl.g:2861:1: rule__MinMaxVisualizationClient__Group__12__Impl : ( ')' ) ;
    public final void rule__MinMaxVisualizationClient__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2865:1: ( ( ')' ) )
            // InternalDsl.g:2866:1: ( ')' )
            {
            // InternalDsl.g:2866:1: ( ')' )
            // InternalDsl.g:2867:2: ')'
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getRightParenthesisKeyword_12()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getMinMaxVisualizationClientAccess().getRightParenthesisKeyword_12()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__12__Impl"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__13"
    // InternalDsl.g:2876:1: rule__MinMaxVisualizationClient__Group__13 : rule__MinMaxVisualizationClient__Group__13__Impl rule__MinMaxVisualizationClient__Group__14 ;
    public final void rule__MinMaxVisualizationClient__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2880:1: ( rule__MinMaxVisualizationClient__Group__13__Impl rule__MinMaxVisualizationClient__Group__14 )
            // InternalDsl.g:2881:2: rule__MinMaxVisualizationClient__Group__13__Impl rule__MinMaxVisualizationClient__Group__14
            {
            pushFollow(FOLLOW_29);
            rule__MinMaxVisualizationClient__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__Group__14();

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__13"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__13__Impl"
    // InternalDsl.g:2888:1: rule__MinMaxVisualizationClient__Group__13__Impl : ( '{' ) ;
    public final void rule__MinMaxVisualizationClient__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2892:1: ( ( '{' ) )
            // InternalDsl.g:2893:1: ( '{' )
            {
            // InternalDsl.g:2893:1: ( '{' )
            // InternalDsl.g:2894:2: '{'
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getLeftCurlyBracketKeyword_13()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMinMaxVisualizationClientAccess().getLeftCurlyBracketKeyword_13()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__13__Impl"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__14"
    // InternalDsl.g:2903:1: rule__MinMaxVisualizationClient__Group__14 : rule__MinMaxVisualizationClient__Group__14__Impl rule__MinMaxVisualizationClient__Group__15 ;
    public final void rule__MinMaxVisualizationClient__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2907:1: ( rule__MinMaxVisualizationClient__Group__14__Impl rule__MinMaxVisualizationClient__Group__15 )
            // InternalDsl.g:2908:2: rule__MinMaxVisualizationClient__Group__14__Impl rule__MinMaxVisualizationClient__Group__15
            {
            pushFollow(FOLLOW_7);
            rule__MinMaxVisualizationClient__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__Group__15();

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__14"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__14__Impl"
    // InternalDsl.g:2915:1: rule__MinMaxVisualizationClient__Group__14__Impl : ( ( rule__MinMaxVisualizationClient__UserPolicyAssignment_14 ) ) ;
    public final void rule__MinMaxVisualizationClient__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2919:1: ( ( ( rule__MinMaxVisualizationClient__UserPolicyAssignment_14 ) ) )
            // InternalDsl.g:2920:1: ( ( rule__MinMaxVisualizationClient__UserPolicyAssignment_14 ) )
            {
            // InternalDsl.g:2920:1: ( ( rule__MinMaxVisualizationClient__UserPolicyAssignment_14 ) )
            // InternalDsl.g:2921:2: ( rule__MinMaxVisualizationClient__UserPolicyAssignment_14 )
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getUserPolicyAssignment_14()); 
            // InternalDsl.g:2922:2: ( rule__MinMaxVisualizationClient__UserPolicyAssignment_14 )
            // InternalDsl.g:2922:3: rule__MinMaxVisualizationClient__UserPolicyAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__UserPolicyAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getMinMaxVisualizationClientAccess().getUserPolicyAssignment_14()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__14__Impl"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__15"
    // InternalDsl.g:2930:1: rule__MinMaxVisualizationClient__Group__15 : rule__MinMaxVisualizationClient__Group__15__Impl rule__MinMaxVisualizationClient__Group__16 ;
    public final void rule__MinMaxVisualizationClient__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2934:1: ( rule__MinMaxVisualizationClient__Group__15__Impl rule__MinMaxVisualizationClient__Group__16 )
            // InternalDsl.g:2935:2: rule__MinMaxVisualizationClient__Group__15__Impl rule__MinMaxVisualizationClient__Group__16
            {
            pushFollow(FOLLOW_30);
            rule__MinMaxVisualizationClient__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__Group__16();

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__15"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__15__Impl"
    // InternalDsl.g:2942:1: rule__MinMaxVisualizationClient__Group__15__Impl : ( ';' ) ;
    public final void rule__MinMaxVisualizationClient__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2946:1: ( ( ';' ) )
            // InternalDsl.g:2947:1: ( ';' )
            {
            // InternalDsl.g:2947:1: ( ';' )
            // InternalDsl.g:2948:2: ';'
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getSemicolonKeyword_15()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMinMaxVisualizationClientAccess().getSemicolonKeyword_15()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__15__Impl"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__16"
    // InternalDsl.g:2957:1: rule__MinMaxVisualizationClient__Group__16 : rule__MinMaxVisualizationClient__Group__16__Impl rule__MinMaxVisualizationClient__Group__17 ;
    public final void rule__MinMaxVisualizationClient__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2961:1: ( rule__MinMaxVisualizationClient__Group__16__Impl rule__MinMaxVisualizationClient__Group__17 )
            // InternalDsl.g:2962:2: rule__MinMaxVisualizationClient__Group__16__Impl rule__MinMaxVisualizationClient__Group__17
            {
            pushFollow(FOLLOW_7);
            rule__MinMaxVisualizationClient__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__Group__17();

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__16"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__16__Impl"
    // InternalDsl.g:2969:1: rule__MinMaxVisualizationClient__Group__16__Impl : ( ( rule__MinMaxVisualizationClient__ClientScaleAssignment_16 ) ) ;
    public final void rule__MinMaxVisualizationClient__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2973:1: ( ( ( rule__MinMaxVisualizationClient__ClientScaleAssignment_16 ) ) )
            // InternalDsl.g:2974:1: ( ( rule__MinMaxVisualizationClient__ClientScaleAssignment_16 ) )
            {
            // InternalDsl.g:2974:1: ( ( rule__MinMaxVisualizationClient__ClientScaleAssignment_16 ) )
            // InternalDsl.g:2975:2: ( rule__MinMaxVisualizationClient__ClientScaleAssignment_16 )
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getClientScaleAssignment_16()); 
            // InternalDsl.g:2976:2: ( rule__MinMaxVisualizationClient__ClientScaleAssignment_16 )
            // InternalDsl.g:2976:3: rule__MinMaxVisualizationClient__ClientScaleAssignment_16
            {
            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__ClientScaleAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getMinMaxVisualizationClientAccess().getClientScaleAssignment_16()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__16__Impl"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__17"
    // InternalDsl.g:2984:1: rule__MinMaxVisualizationClient__Group__17 : rule__MinMaxVisualizationClient__Group__17__Impl rule__MinMaxVisualizationClient__Group__18 ;
    public final void rule__MinMaxVisualizationClient__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2988:1: ( rule__MinMaxVisualizationClient__Group__17__Impl rule__MinMaxVisualizationClient__Group__18 )
            // InternalDsl.g:2989:2: rule__MinMaxVisualizationClient__Group__17__Impl rule__MinMaxVisualizationClient__Group__18
            {
            pushFollow(FOLLOW_31);
            rule__MinMaxVisualizationClient__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__Group__18();

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__17"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__17__Impl"
    // InternalDsl.g:2996:1: rule__MinMaxVisualizationClient__Group__17__Impl : ( ';' ) ;
    public final void rule__MinMaxVisualizationClient__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3000:1: ( ( ';' ) )
            // InternalDsl.g:3001:1: ( ';' )
            {
            // InternalDsl.g:3001:1: ( ';' )
            // InternalDsl.g:3002:2: ';'
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getSemicolonKeyword_17()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMinMaxVisualizationClientAccess().getSemicolonKeyword_17()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__17__Impl"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__18"
    // InternalDsl.g:3011:1: rule__MinMaxVisualizationClient__Group__18 : rule__MinMaxVisualizationClient__Group__18__Impl rule__MinMaxVisualizationClient__Group__19 ;
    public final void rule__MinMaxVisualizationClient__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3015:1: ( rule__MinMaxVisualizationClient__Group__18__Impl rule__MinMaxVisualizationClient__Group__19 )
            // InternalDsl.g:3016:2: rule__MinMaxVisualizationClient__Group__18__Impl rule__MinMaxVisualizationClient__Group__19
            {
            pushFollow(FOLLOW_32);
            rule__MinMaxVisualizationClient__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__Group__19();

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__18"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__18__Impl"
    // InternalDsl.g:3023:1: rule__MinMaxVisualizationClient__Group__18__Impl : ( 'userTime' ) ;
    public final void rule__MinMaxVisualizationClient__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3027:1: ( ( 'userTime' ) )
            // InternalDsl.g:3028:1: ( 'userTime' )
            {
            // InternalDsl.g:3028:1: ( 'userTime' )
            // InternalDsl.g:3029:2: 'userTime'
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getUserTimeKeyword_18()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMinMaxVisualizationClientAccess().getUserTimeKeyword_18()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__18__Impl"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__19"
    // InternalDsl.g:3038:1: rule__MinMaxVisualizationClient__Group__19 : rule__MinMaxVisualizationClient__Group__19__Impl rule__MinMaxVisualizationClient__Group__20 ;
    public final void rule__MinMaxVisualizationClient__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3042:1: ( rule__MinMaxVisualizationClient__Group__19__Impl rule__MinMaxVisualizationClient__Group__20 )
            // InternalDsl.g:3043:2: rule__MinMaxVisualizationClient__Group__19__Impl rule__MinMaxVisualizationClient__Group__20
            {
            pushFollow(FOLLOW_7);
            rule__MinMaxVisualizationClient__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__Group__20();

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__19"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__19__Impl"
    // InternalDsl.g:3050:1: rule__MinMaxVisualizationClient__Group__19__Impl : ( ( rule__MinMaxVisualizationClient__UserTimeAssignment_19 ) ) ;
    public final void rule__MinMaxVisualizationClient__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3054:1: ( ( ( rule__MinMaxVisualizationClient__UserTimeAssignment_19 ) ) )
            // InternalDsl.g:3055:1: ( ( rule__MinMaxVisualizationClient__UserTimeAssignment_19 ) )
            {
            // InternalDsl.g:3055:1: ( ( rule__MinMaxVisualizationClient__UserTimeAssignment_19 ) )
            // InternalDsl.g:3056:2: ( rule__MinMaxVisualizationClient__UserTimeAssignment_19 )
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getUserTimeAssignment_19()); 
            // InternalDsl.g:3057:2: ( rule__MinMaxVisualizationClient__UserTimeAssignment_19 )
            // InternalDsl.g:3057:3: rule__MinMaxVisualizationClient__UserTimeAssignment_19
            {
            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__UserTimeAssignment_19();

            state._fsp--;


            }

             after(grammarAccess.getMinMaxVisualizationClientAccess().getUserTimeAssignment_19()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__19__Impl"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__20"
    // InternalDsl.g:3065:1: rule__MinMaxVisualizationClient__Group__20 : rule__MinMaxVisualizationClient__Group__20__Impl rule__MinMaxVisualizationClient__Group__21 ;
    public final void rule__MinMaxVisualizationClient__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3069:1: ( rule__MinMaxVisualizationClient__Group__20__Impl rule__MinMaxVisualizationClient__Group__21 )
            // InternalDsl.g:3070:2: rule__MinMaxVisualizationClient__Group__20__Impl rule__MinMaxVisualizationClient__Group__21
            {
            pushFollow(FOLLOW_33);
            rule__MinMaxVisualizationClient__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__Group__21();

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__20"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__20__Impl"
    // InternalDsl.g:3077:1: rule__MinMaxVisualizationClient__Group__20__Impl : ( ';' ) ;
    public final void rule__MinMaxVisualizationClient__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3081:1: ( ( ';' ) )
            // InternalDsl.g:3082:1: ( ';' )
            {
            // InternalDsl.g:3082:1: ( ';' )
            // InternalDsl.g:3083:2: ';'
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getSemicolonKeyword_20()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMinMaxVisualizationClientAccess().getSemicolonKeyword_20()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__20__Impl"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__21"
    // InternalDsl.g:3092:1: rule__MinMaxVisualizationClient__Group__21 : rule__MinMaxVisualizationClient__Group__21__Impl rule__MinMaxVisualizationClient__Group__22 ;
    public final void rule__MinMaxVisualizationClient__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3096:1: ( rule__MinMaxVisualizationClient__Group__21__Impl rule__MinMaxVisualizationClient__Group__22 )
            // InternalDsl.g:3097:2: rule__MinMaxVisualizationClient__Group__21__Impl rule__MinMaxVisualizationClient__Group__22
            {
            pushFollow(FOLLOW_32);
            rule__MinMaxVisualizationClient__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__Group__22();

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__21"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__21__Impl"
    // InternalDsl.g:3104:1: rule__MinMaxVisualizationClient__Group__21__Impl : ( 'pingTime' ) ;
    public final void rule__MinMaxVisualizationClient__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3108:1: ( ( 'pingTime' ) )
            // InternalDsl.g:3109:1: ( 'pingTime' )
            {
            // InternalDsl.g:3109:1: ( 'pingTime' )
            // InternalDsl.g:3110:2: 'pingTime'
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getPingTimeKeyword_21()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getMinMaxVisualizationClientAccess().getPingTimeKeyword_21()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__21__Impl"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__22"
    // InternalDsl.g:3119:1: rule__MinMaxVisualizationClient__Group__22 : rule__MinMaxVisualizationClient__Group__22__Impl rule__MinMaxVisualizationClient__Group__23 ;
    public final void rule__MinMaxVisualizationClient__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3123:1: ( rule__MinMaxVisualizationClient__Group__22__Impl rule__MinMaxVisualizationClient__Group__23 )
            // InternalDsl.g:3124:2: rule__MinMaxVisualizationClient__Group__22__Impl rule__MinMaxVisualizationClient__Group__23
            {
            pushFollow(FOLLOW_7);
            rule__MinMaxVisualizationClient__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__Group__23();

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__22"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__22__Impl"
    // InternalDsl.g:3131:1: rule__MinMaxVisualizationClient__Group__22__Impl : ( ( rule__MinMaxVisualizationClient__PingTimeAssignment_22 ) ) ;
    public final void rule__MinMaxVisualizationClient__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3135:1: ( ( ( rule__MinMaxVisualizationClient__PingTimeAssignment_22 ) ) )
            // InternalDsl.g:3136:1: ( ( rule__MinMaxVisualizationClient__PingTimeAssignment_22 ) )
            {
            // InternalDsl.g:3136:1: ( ( rule__MinMaxVisualizationClient__PingTimeAssignment_22 ) )
            // InternalDsl.g:3137:2: ( rule__MinMaxVisualizationClient__PingTimeAssignment_22 )
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getPingTimeAssignment_22()); 
            // InternalDsl.g:3138:2: ( rule__MinMaxVisualizationClient__PingTimeAssignment_22 )
            // InternalDsl.g:3138:3: rule__MinMaxVisualizationClient__PingTimeAssignment_22
            {
            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__PingTimeAssignment_22();

            state._fsp--;


            }

             after(grammarAccess.getMinMaxVisualizationClientAccess().getPingTimeAssignment_22()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__22__Impl"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__23"
    // InternalDsl.g:3146:1: rule__MinMaxVisualizationClient__Group__23 : rule__MinMaxVisualizationClient__Group__23__Impl rule__MinMaxVisualizationClient__Group__24 ;
    public final void rule__MinMaxVisualizationClient__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3150:1: ( rule__MinMaxVisualizationClient__Group__23__Impl rule__MinMaxVisualizationClient__Group__24 )
            // InternalDsl.g:3151:2: rule__MinMaxVisualizationClient__Group__23__Impl rule__MinMaxVisualizationClient__Group__24
            {
            pushFollow(FOLLOW_34);
            rule__MinMaxVisualizationClient__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__Group__24();

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__23"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__23__Impl"
    // InternalDsl.g:3158:1: rule__MinMaxVisualizationClient__Group__23__Impl : ( ';' ) ;
    public final void rule__MinMaxVisualizationClient__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3162:1: ( ( ';' ) )
            // InternalDsl.g:3163:1: ( ';' )
            {
            // InternalDsl.g:3163:1: ( ';' )
            // InternalDsl.g:3164:2: ';'
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getSemicolonKeyword_23()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMinMaxVisualizationClientAccess().getSemicolonKeyword_23()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__23__Impl"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__24"
    // InternalDsl.g:3173:1: rule__MinMaxVisualizationClient__Group__24 : rule__MinMaxVisualizationClient__Group__24__Impl rule__MinMaxVisualizationClient__Group__25 ;
    public final void rule__MinMaxVisualizationClient__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3177:1: ( rule__MinMaxVisualizationClient__Group__24__Impl rule__MinMaxVisualizationClient__Group__25 )
            // InternalDsl.g:3178:2: rule__MinMaxVisualizationClient__Group__24__Impl rule__MinMaxVisualizationClient__Group__25
            {
            pushFollow(FOLLOW_32);
            rule__MinMaxVisualizationClient__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__Group__25();

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__24"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__24__Impl"
    // InternalDsl.g:3185:1: rule__MinMaxVisualizationClient__Group__24__Impl : ( 'rawDataThreshold' ) ;
    public final void rule__MinMaxVisualizationClient__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3189:1: ( ( 'rawDataThreshold' ) )
            // InternalDsl.g:3190:1: ( 'rawDataThreshold' )
            {
            // InternalDsl.g:3190:1: ( 'rawDataThreshold' )
            // InternalDsl.g:3191:2: 'rawDataThreshold'
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getRawDataThresholdKeyword_24()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getMinMaxVisualizationClientAccess().getRawDataThresholdKeyword_24()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__24__Impl"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__25"
    // InternalDsl.g:3200:1: rule__MinMaxVisualizationClient__Group__25 : rule__MinMaxVisualizationClient__Group__25__Impl rule__MinMaxVisualizationClient__Group__26 ;
    public final void rule__MinMaxVisualizationClient__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3204:1: ( rule__MinMaxVisualizationClient__Group__25__Impl rule__MinMaxVisualizationClient__Group__26 )
            // InternalDsl.g:3205:2: rule__MinMaxVisualizationClient__Group__25__Impl rule__MinMaxVisualizationClient__Group__26
            {
            pushFollow(FOLLOW_7);
            rule__MinMaxVisualizationClient__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__Group__26();

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__25"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__25__Impl"
    // InternalDsl.g:3212:1: rule__MinMaxVisualizationClient__Group__25__Impl : ( ( rule__MinMaxVisualizationClient__RawDataThresholdAssignment_25 ) ) ;
    public final void rule__MinMaxVisualizationClient__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3216:1: ( ( ( rule__MinMaxVisualizationClient__RawDataThresholdAssignment_25 ) ) )
            // InternalDsl.g:3217:1: ( ( rule__MinMaxVisualizationClient__RawDataThresholdAssignment_25 ) )
            {
            // InternalDsl.g:3217:1: ( ( rule__MinMaxVisualizationClient__RawDataThresholdAssignment_25 ) )
            // InternalDsl.g:3218:2: ( rule__MinMaxVisualizationClient__RawDataThresholdAssignment_25 )
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getRawDataThresholdAssignment_25()); 
            // InternalDsl.g:3219:2: ( rule__MinMaxVisualizationClient__RawDataThresholdAssignment_25 )
            // InternalDsl.g:3219:3: rule__MinMaxVisualizationClient__RawDataThresholdAssignment_25
            {
            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__RawDataThresholdAssignment_25();

            state._fsp--;


            }

             after(grammarAccess.getMinMaxVisualizationClientAccess().getRawDataThresholdAssignment_25()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__25__Impl"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__26"
    // InternalDsl.g:3227:1: rule__MinMaxVisualizationClient__Group__26 : rule__MinMaxVisualizationClient__Group__26__Impl rule__MinMaxVisualizationClient__Group__27 ;
    public final void rule__MinMaxVisualizationClient__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3231:1: ( rule__MinMaxVisualizationClient__Group__26__Impl rule__MinMaxVisualizationClient__Group__27 )
            // InternalDsl.g:3232:2: rule__MinMaxVisualizationClient__Group__26__Impl rule__MinMaxVisualizationClient__Group__27
            {
            pushFollow(FOLLOW_35);
            rule__MinMaxVisualizationClient__Group__26__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__Group__27();

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__26"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__26__Impl"
    // InternalDsl.g:3239:1: rule__MinMaxVisualizationClient__Group__26__Impl : ( ';' ) ;
    public final void rule__MinMaxVisualizationClient__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3243:1: ( ( ';' ) )
            // InternalDsl.g:3244:1: ( ';' )
            {
            // InternalDsl.g:3244:1: ( ';' )
            // InternalDsl.g:3245:2: ';'
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getSemicolonKeyword_26()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMinMaxVisualizationClientAccess().getSemicolonKeyword_26()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__26__Impl"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__27"
    // InternalDsl.g:3254:1: rule__MinMaxVisualizationClient__Group__27 : rule__MinMaxVisualizationClient__Group__27__Impl rule__MinMaxVisualizationClient__Group__28 ;
    public final void rule__MinMaxVisualizationClient__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3258:1: ( rule__MinMaxVisualizationClient__Group__27__Impl rule__MinMaxVisualizationClient__Group__28 )
            // InternalDsl.g:3259:2: rule__MinMaxVisualizationClient__Group__27__Impl rule__MinMaxVisualizationClient__Group__28
            {
            pushFollow(FOLLOW_32);
            rule__MinMaxVisualizationClient__Group__27__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__Group__28();

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__27"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__27__Impl"
    // InternalDsl.g:3266:1: rule__MinMaxVisualizationClient__Group__27__Impl : ( 'preComputedDataThreshold' ) ;
    public final void rule__MinMaxVisualizationClient__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3270:1: ( ( 'preComputedDataThreshold' ) )
            // InternalDsl.g:3271:1: ( 'preComputedDataThreshold' )
            {
            // InternalDsl.g:3271:1: ( 'preComputedDataThreshold' )
            // InternalDsl.g:3272:2: 'preComputedDataThreshold'
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getPreComputedDataThresholdKeyword_27()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getMinMaxVisualizationClientAccess().getPreComputedDataThresholdKeyword_27()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__27__Impl"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__28"
    // InternalDsl.g:3281:1: rule__MinMaxVisualizationClient__Group__28 : rule__MinMaxVisualizationClient__Group__28__Impl rule__MinMaxVisualizationClient__Group__29 ;
    public final void rule__MinMaxVisualizationClient__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3285:1: ( rule__MinMaxVisualizationClient__Group__28__Impl rule__MinMaxVisualizationClient__Group__29 )
            // InternalDsl.g:3286:2: rule__MinMaxVisualizationClient__Group__28__Impl rule__MinMaxVisualizationClient__Group__29
            {
            pushFollow(FOLLOW_7);
            rule__MinMaxVisualizationClient__Group__28__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__Group__29();

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__28"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__28__Impl"
    // InternalDsl.g:3293:1: rule__MinMaxVisualizationClient__Group__28__Impl : ( ( rule__MinMaxVisualizationClient__PreComputedDataThresholdAssignment_28 ) ) ;
    public final void rule__MinMaxVisualizationClient__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3297:1: ( ( ( rule__MinMaxVisualizationClient__PreComputedDataThresholdAssignment_28 ) ) )
            // InternalDsl.g:3298:1: ( ( rule__MinMaxVisualizationClient__PreComputedDataThresholdAssignment_28 ) )
            {
            // InternalDsl.g:3298:1: ( ( rule__MinMaxVisualizationClient__PreComputedDataThresholdAssignment_28 ) )
            // InternalDsl.g:3299:2: ( rule__MinMaxVisualizationClient__PreComputedDataThresholdAssignment_28 )
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getPreComputedDataThresholdAssignment_28()); 
            // InternalDsl.g:3300:2: ( rule__MinMaxVisualizationClient__PreComputedDataThresholdAssignment_28 )
            // InternalDsl.g:3300:3: rule__MinMaxVisualizationClient__PreComputedDataThresholdAssignment_28
            {
            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__PreComputedDataThresholdAssignment_28();

            state._fsp--;


            }

             after(grammarAccess.getMinMaxVisualizationClientAccess().getPreComputedDataThresholdAssignment_28()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__28__Impl"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__29"
    // InternalDsl.g:3308:1: rule__MinMaxVisualizationClient__Group__29 : rule__MinMaxVisualizationClient__Group__29__Impl rule__MinMaxVisualizationClient__Group__30 ;
    public final void rule__MinMaxVisualizationClient__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3312:1: ( rule__MinMaxVisualizationClient__Group__29__Impl rule__MinMaxVisualizationClient__Group__30 )
            // InternalDsl.g:3313:2: rule__MinMaxVisualizationClient__Group__29__Impl rule__MinMaxVisualizationClient__Group__30
            {
            pushFollow(FOLLOW_15);
            rule__MinMaxVisualizationClient__Group__29__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__Group__30();

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__29"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__29__Impl"
    // InternalDsl.g:3320:1: rule__MinMaxVisualizationClient__Group__29__Impl : ( ';' ) ;
    public final void rule__MinMaxVisualizationClient__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3324:1: ( ( ';' ) )
            // InternalDsl.g:3325:1: ( ';' )
            {
            // InternalDsl.g:3325:1: ( ';' )
            // InternalDsl.g:3326:2: ';'
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getSemicolonKeyword_29()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMinMaxVisualizationClientAccess().getSemicolonKeyword_29()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__29__Impl"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__30"
    // InternalDsl.g:3335:1: rule__MinMaxVisualizationClient__Group__30 : rule__MinMaxVisualizationClient__Group__30__Impl ;
    public final void rule__MinMaxVisualizationClient__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3339:1: ( rule__MinMaxVisualizationClient__Group__30__Impl )
            // InternalDsl.g:3340:2: rule__MinMaxVisualizationClient__Group__30__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MinMaxVisualizationClient__Group__30__Impl();

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__30"


    // $ANTLR start "rule__MinMaxVisualizationClient__Group__30__Impl"
    // InternalDsl.g:3346:1: rule__MinMaxVisualizationClient__Group__30__Impl : ( '}' ) ;
    public final void rule__MinMaxVisualizationClient__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3350:1: ( ( '}' ) )
            // InternalDsl.g:3351:1: ( '}' )
            {
            // InternalDsl.g:3351:1: ( '}' )
            // InternalDsl.g:3352:2: '}'
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getRightCurlyBracketKeyword_30()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getMinMaxVisualizationClientAccess().getRightCurlyBracketKeyword_30()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__Group__30__Impl"


    // $ANTLR start "rule__TimeSeries__Group__0"
    // InternalDsl.g:3362:1: rule__TimeSeries__Group__0 : rule__TimeSeries__Group__0__Impl rule__TimeSeries__Group__1 ;
    public final void rule__TimeSeries__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3366:1: ( rule__TimeSeries__Group__0__Impl rule__TimeSeries__Group__1 )
            // InternalDsl.g:3367:2: rule__TimeSeries__Group__0__Impl rule__TimeSeries__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__TimeSeries__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSeries__Group__1();

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
    // $ANTLR end "rule__TimeSeries__Group__0"


    // $ANTLR start "rule__TimeSeries__Group__0__Impl"
    // InternalDsl.g:3374:1: rule__TimeSeries__Group__0__Impl : ( ( rule__TimeSeries__NameAssignment_0 ) ) ;
    public final void rule__TimeSeries__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3378:1: ( ( ( rule__TimeSeries__NameAssignment_0 ) ) )
            // InternalDsl.g:3379:1: ( ( rule__TimeSeries__NameAssignment_0 ) )
            {
            // InternalDsl.g:3379:1: ( ( rule__TimeSeries__NameAssignment_0 ) )
            // InternalDsl.g:3380:2: ( rule__TimeSeries__NameAssignment_0 )
            {
             before(grammarAccess.getTimeSeriesAccess().getNameAssignment_0()); 
            // InternalDsl.g:3381:2: ( rule__TimeSeries__NameAssignment_0 )
            // InternalDsl.g:3381:3: rule__TimeSeries__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TimeSeries__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTimeSeriesAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__TimeSeries__Group__0__Impl"


    // $ANTLR start "rule__TimeSeries__Group__1"
    // InternalDsl.g:3389:1: rule__TimeSeries__Group__1 : rule__TimeSeries__Group__1__Impl rule__TimeSeries__Group__2 ;
    public final void rule__TimeSeries__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3393:1: ( rule__TimeSeries__Group__1__Impl rule__TimeSeries__Group__2 )
            // InternalDsl.g:3394:2: rule__TimeSeries__Group__1__Impl rule__TimeSeries__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__TimeSeries__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSeries__Group__2();

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
    // $ANTLR end "rule__TimeSeries__Group__1"


    // $ANTLR start "rule__TimeSeries__Group__1__Impl"
    // InternalDsl.g:3401:1: rule__TimeSeries__Group__1__Impl : ( '(' ) ;
    public final void rule__TimeSeries__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3405:1: ( ( '(' ) )
            // InternalDsl.g:3406:1: ( '(' )
            {
            // InternalDsl.g:3406:1: ( '(' )
            // InternalDsl.g:3407:2: '('
            {
             before(grammarAccess.getTimeSeriesAccess().getLeftParenthesisKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getTimeSeriesAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__TimeSeries__Group__1__Impl"


    // $ANTLR start "rule__TimeSeries__Group__2"
    // InternalDsl.g:3416:1: rule__TimeSeries__Group__2 : rule__TimeSeries__Group__2__Impl rule__TimeSeries__Group__3 ;
    public final void rule__TimeSeries__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3420:1: ( rule__TimeSeries__Group__2__Impl rule__TimeSeries__Group__3 )
            // InternalDsl.g:3421:2: rule__TimeSeries__Group__2__Impl rule__TimeSeries__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__TimeSeries__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSeries__Group__3();

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
    // $ANTLR end "rule__TimeSeries__Group__2"


    // $ANTLR start "rule__TimeSeries__Group__2__Impl"
    // InternalDsl.g:3428:1: rule__TimeSeries__Group__2__Impl : ( ( rule__TimeSeries__TimeSeriesMeasuredVariableAssignment_2 ) ) ;
    public final void rule__TimeSeries__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3432:1: ( ( ( rule__TimeSeries__TimeSeriesMeasuredVariableAssignment_2 ) ) )
            // InternalDsl.g:3433:1: ( ( rule__TimeSeries__TimeSeriesMeasuredVariableAssignment_2 ) )
            {
            // InternalDsl.g:3433:1: ( ( rule__TimeSeries__TimeSeriesMeasuredVariableAssignment_2 ) )
            // InternalDsl.g:3434:2: ( rule__TimeSeries__TimeSeriesMeasuredVariableAssignment_2 )
            {
             before(grammarAccess.getTimeSeriesAccess().getTimeSeriesMeasuredVariableAssignment_2()); 
            // InternalDsl.g:3435:2: ( rule__TimeSeries__TimeSeriesMeasuredVariableAssignment_2 )
            // InternalDsl.g:3435:3: rule__TimeSeries__TimeSeriesMeasuredVariableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TimeSeries__TimeSeriesMeasuredVariableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTimeSeriesAccess().getTimeSeriesMeasuredVariableAssignment_2()); 

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
    // $ANTLR end "rule__TimeSeries__Group__2__Impl"


    // $ANTLR start "rule__TimeSeries__Group__3"
    // InternalDsl.g:3443:1: rule__TimeSeries__Group__3 : rule__TimeSeries__Group__3__Impl rule__TimeSeries__Group__4 ;
    public final void rule__TimeSeries__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3447:1: ( rule__TimeSeries__Group__3__Impl rule__TimeSeries__Group__4 )
            // InternalDsl.g:3448:2: rule__TimeSeries__Group__3__Impl rule__TimeSeries__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__TimeSeries__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSeries__Group__4();

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
    // $ANTLR end "rule__TimeSeries__Group__3"


    // $ANTLR start "rule__TimeSeries__Group__3__Impl"
    // InternalDsl.g:3455:1: rule__TimeSeries__Group__3__Impl : ( ')' ) ;
    public final void rule__TimeSeries__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3459:1: ( ( ')' ) )
            // InternalDsl.g:3460:1: ( ')' )
            {
            // InternalDsl.g:3460:1: ( ')' )
            // InternalDsl.g:3461:2: ')'
            {
             before(grammarAccess.getTimeSeriesAccess().getRightParenthesisKeyword_3()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getTimeSeriesAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__TimeSeries__Group__3__Impl"


    // $ANTLR start "rule__TimeSeries__Group__4"
    // InternalDsl.g:3470:1: rule__TimeSeries__Group__4 : rule__TimeSeries__Group__4__Impl rule__TimeSeries__Group__5 ;
    public final void rule__TimeSeries__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3474:1: ( rule__TimeSeries__Group__4__Impl rule__TimeSeries__Group__5 )
            // InternalDsl.g:3475:2: rule__TimeSeries__Group__4__Impl rule__TimeSeries__Group__5
            {
            pushFollow(FOLLOW_36);
            rule__TimeSeries__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSeries__Group__5();

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
    // $ANTLR end "rule__TimeSeries__Group__4"


    // $ANTLR start "rule__TimeSeries__Group__4__Impl"
    // InternalDsl.g:3482:1: rule__TimeSeries__Group__4__Impl : ( '{' ) ;
    public final void rule__TimeSeries__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3486:1: ( ( '{' ) )
            // InternalDsl.g:3487:1: ( '{' )
            {
            // InternalDsl.g:3487:1: ( '{' )
            // InternalDsl.g:3488:2: '{'
            {
             before(grammarAccess.getTimeSeriesAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTimeSeriesAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__TimeSeries__Group__4__Impl"


    // $ANTLR start "rule__TimeSeries__Group__5"
    // InternalDsl.g:3497:1: rule__TimeSeries__Group__5 : rule__TimeSeries__Group__5__Impl rule__TimeSeries__Group__6 ;
    public final void rule__TimeSeries__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3501:1: ( rule__TimeSeries__Group__5__Impl rule__TimeSeries__Group__6 )
            // InternalDsl.g:3502:2: rule__TimeSeries__Group__5__Impl rule__TimeSeries__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__TimeSeries__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSeries__Group__6();

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
    // $ANTLR end "rule__TimeSeries__Group__5"


    // $ANTLR start "rule__TimeSeries__Group__5__Impl"
    // InternalDsl.g:3509:1: rule__TimeSeries__Group__5__Impl : ( 'startTime' ) ;
    public final void rule__TimeSeries__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3513:1: ( ( 'startTime' ) )
            // InternalDsl.g:3514:1: ( 'startTime' )
            {
            // InternalDsl.g:3514:1: ( 'startTime' )
            // InternalDsl.g:3515:2: 'startTime'
            {
             before(grammarAccess.getTimeSeriesAccess().getStartTimeKeyword_5()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getTimeSeriesAccess().getStartTimeKeyword_5()); 

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
    // $ANTLR end "rule__TimeSeries__Group__5__Impl"


    // $ANTLR start "rule__TimeSeries__Group__6"
    // InternalDsl.g:3524:1: rule__TimeSeries__Group__6 : rule__TimeSeries__Group__6__Impl rule__TimeSeries__Group__7 ;
    public final void rule__TimeSeries__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3528:1: ( rule__TimeSeries__Group__6__Impl rule__TimeSeries__Group__7 )
            // InternalDsl.g:3529:2: rule__TimeSeries__Group__6__Impl rule__TimeSeries__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__TimeSeries__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSeries__Group__7();

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
    // $ANTLR end "rule__TimeSeries__Group__6"


    // $ANTLR start "rule__TimeSeries__Group__6__Impl"
    // InternalDsl.g:3536:1: rule__TimeSeries__Group__6__Impl : ( ( rule__TimeSeries__StartTimeAssignment_6 ) ) ;
    public final void rule__TimeSeries__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3540:1: ( ( ( rule__TimeSeries__StartTimeAssignment_6 ) ) )
            // InternalDsl.g:3541:1: ( ( rule__TimeSeries__StartTimeAssignment_6 ) )
            {
            // InternalDsl.g:3541:1: ( ( rule__TimeSeries__StartTimeAssignment_6 ) )
            // InternalDsl.g:3542:2: ( rule__TimeSeries__StartTimeAssignment_6 )
            {
             before(grammarAccess.getTimeSeriesAccess().getStartTimeAssignment_6()); 
            // InternalDsl.g:3543:2: ( rule__TimeSeries__StartTimeAssignment_6 )
            // InternalDsl.g:3543:3: rule__TimeSeries__StartTimeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__TimeSeries__StartTimeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTimeSeriesAccess().getStartTimeAssignment_6()); 

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
    // $ANTLR end "rule__TimeSeries__Group__6__Impl"


    // $ANTLR start "rule__TimeSeries__Group__7"
    // InternalDsl.g:3551:1: rule__TimeSeries__Group__7 : rule__TimeSeries__Group__7__Impl rule__TimeSeries__Group__8 ;
    public final void rule__TimeSeries__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3555:1: ( rule__TimeSeries__Group__7__Impl rule__TimeSeries__Group__8 )
            // InternalDsl.g:3556:2: rule__TimeSeries__Group__7__Impl rule__TimeSeries__Group__8
            {
            pushFollow(FOLLOW_37);
            rule__TimeSeries__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSeries__Group__8();

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
    // $ANTLR end "rule__TimeSeries__Group__7"


    // $ANTLR start "rule__TimeSeries__Group__7__Impl"
    // InternalDsl.g:3563:1: rule__TimeSeries__Group__7__Impl : ( ';' ) ;
    public final void rule__TimeSeries__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3567:1: ( ( ';' ) )
            // InternalDsl.g:3568:1: ( ';' )
            {
            // InternalDsl.g:3568:1: ( ';' )
            // InternalDsl.g:3569:2: ';'
            {
             before(grammarAccess.getTimeSeriesAccess().getSemicolonKeyword_7()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTimeSeriesAccess().getSemicolonKeyword_7()); 

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
    // $ANTLR end "rule__TimeSeries__Group__7__Impl"


    // $ANTLR start "rule__TimeSeries__Group__8"
    // InternalDsl.g:3578:1: rule__TimeSeries__Group__8 : rule__TimeSeries__Group__8__Impl rule__TimeSeries__Group__9 ;
    public final void rule__TimeSeries__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3582:1: ( rule__TimeSeries__Group__8__Impl rule__TimeSeries__Group__9 )
            // InternalDsl.g:3583:2: rule__TimeSeries__Group__8__Impl rule__TimeSeries__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__TimeSeries__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSeries__Group__9();

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
    // $ANTLR end "rule__TimeSeries__Group__8"


    // $ANTLR start "rule__TimeSeries__Group__8__Impl"
    // InternalDsl.g:3590:1: rule__TimeSeries__Group__8__Impl : ( 'endTime' ) ;
    public final void rule__TimeSeries__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3594:1: ( ( 'endTime' ) )
            // InternalDsl.g:3595:1: ( 'endTime' )
            {
            // InternalDsl.g:3595:1: ( 'endTime' )
            // InternalDsl.g:3596:2: 'endTime'
            {
             before(grammarAccess.getTimeSeriesAccess().getEndTimeKeyword_8()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getTimeSeriesAccess().getEndTimeKeyword_8()); 

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
    // $ANTLR end "rule__TimeSeries__Group__8__Impl"


    // $ANTLR start "rule__TimeSeries__Group__9"
    // InternalDsl.g:3605:1: rule__TimeSeries__Group__9 : rule__TimeSeries__Group__9__Impl rule__TimeSeries__Group__10 ;
    public final void rule__TimeSeries__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3609:1: ( rule__TimeSeries__Group__9__Impl rule__TimeSeries__Group__10 )
            // InternalDsl.g:3610:2: rule__TimeSeries__Group__9__Impl rule__TimeSeries__Group__10
            {
            pushFollow(FOLLOW_7);
            rule__TimeSeries__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSeries__Group__10();

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
    // $ANTLR end "rule__TimeSeries__Group__9"


    // $ANTLR start "rule__TimeSeries__Group__9__Impl"
    // InternalDsl.g:3617:1: rule__TimeSeries__Group__9__Impl : ( ( rule__TimeSeries__EndTimeAssignment_9 ) ) ;
    public final void rule__TimeSeries__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3621:1: ( ( ( rule__TimeSeries__EndTimeAssignment_9 ) ) )
            // InternalDsl.g:3622:1: ( ( rule__TimeSeries__EndTimeAssignment_9 ) )
            {
            // InternalDsl.g:3622:1: ( ( rule__TimeSeries__EndTimeAssignment_9 ) )
            // InternalDsl.g:3623:2: ( rule__TimeSeries__EndTimeAssignment_9 )
            {
             before(grammarAccess.getTimeSeriesAccess().getEndTimeAssignment_9()); 
            // InternalDsl.g:3624:2: ( rule__TimeSeries__EndTimeAssignment_9 )
            // InternalDsl.g:3624:3: rule__TimeSeries__EndTimeAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__TimeSeries__EndTimeAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getTimeSeriesAccess().getEndTimeAssignment_9()); 

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
    // $ANTLR end "rule__TimeSeries__Group__9__Impl"


    // $ANTLR start "rule__TimeSeries__Group__10"
    // InternalDsl.g:3632:1: rule__TimeSeries__Group__10 : rule__TimeSeries__Group__10__Impl rule__TimeSeries__Group__11 ;
    public final void rule__TimeSeries__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3636:1: ( rule__TimeSeries__Group__10__Impl rule__TimeSeries__Group__11 )
            // InternalDsl.g:3637:2: rule__TimeSeries__Group__10__Impl rule__TimeSeries__Group__11
            {
            pushFollow(FOLLOW_38);
            rule__TimeSeries__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSeries__Group__11();

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
    // $ANTLR end "rule__TimeSeries__Group__10"


    // $ANTLR start "rule__TimeSeries__Group__10__Impl"
    // InternalDsl.g:3644:1: rule__TimeSeries__Group__10__Impl : ( ';' ) ;
    public final void rule__TimeSeries__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3648:1: ( ( ';' ) )
            // InternalDsl.g:3649:1: ( ';' )
            {
            // InternalDsl.g:3649:1: ( ';' )
            // InternalDsl.g:3650:2: ';'
            {
             before(grammarAccess.getTimeSeriesAccess().getSemicolonKeyword_10()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTimeSeriesAccess().getSemicolonKeyword_10()); 

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
    // $ANTLR end "rule__TimeSeries__Group__10__Impl"


    // $ANTLR start "rule__TimeSeries__Group__11"
    // InternalDsl.g:3659:1: rule__TimeSeries__Group__11 : rule__TimeSeries__Group__11__Impl rule__TimeSeries__Group__12 ;
    public final void rule__TimeSeries__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3663:1: ( rule__TimeSeries__Group__11__Impl rule__TimeSeries__Group__12 )
            // InternalDsl.g:3664:2: rule__TimeSeries__Group__11__Impl rule__TimeSeries__Group__12
            {
            pushFollow(FOLLOW_32);
            rule__TimeSeries__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSeries__Group__12();

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
    // $ANTLR end "rule__TimeSeries__Group__11"


    // $ANTLR start "rule__TimeSeries__Group__11__Impl"
    // InternalDsl.g:3671:1: rule__TimeSeries__Group__11__Impl : ( 'period' ) ;
    public final void rule__TimeSeries__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3675:1: ( ( 'period' ) )
            // InternalDsl.g:3676:1: ( 'period' )
            {
            // InternalDsl.g:3676:1: ( 'period' )
            // InternalDsl.g:3677:2: 'period'
            {
             before(grammarAccess.getTimeSeriesAccess().getPeriodKeyword_11()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getTimeSeriesAccess().getPeriodKeyword_11()); 

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
    // $ANTLR end "rule__TimeSeries__Group__11__Impl"


    // $ANTLR start "rule__TimeSeries__Group__12"
    // InternalDsl.g:3686:1: rule__TimeSeries__Group__12 : rule__TimeSeries__Group__12__Impl rule__TimeSeries__Group__13 ;
    public final void rule__TimeSeries__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3690:1: ( rule__TimeSeries__Group__12__Impl rule__TimeSeries__Group__13 )
            // InternalDsl.g:3691:2: rule__TimeSeries__Group__12__Impl rule__TimeSeries__Group__13
            {
            pushFollow(FOLLOW_7);
            rule__TimeSeries__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSeries__Group__13();

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
    // $ANTLR end "rule__TimeSeries__Group__12"


    // $ANTLR start "rule__TimeSeries__Group__12__Impl"
    // InternalDsl.g:3698:1: rule__TimeSeries__Group__12__Impl : ( ( rule__TimeSeries__PeriodAssignment_12 ) ) ;
    public final void rule__TimeSeries__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3702:1: ( ( ( rule__TimeSeries__PeriodAssignment_12 ) ) )
            // InternalDsl.g:3703:1: ( ( rule__TimeSeries__PeriodAssignment_12 ) )
            {
            // InternalDsl.g:3703:1: ( ( rule__TimeSeries__PeriodAssignment_12 ) )
            // InternalDsl.g:3704:2: ( rule__TimeSeries__PeriodAssignment_12 )
            {
             before(grammarAccess.getTimeSeriesAccess().getPeriodAssignment_12()); 
            // InternalDsl.g:3705:2: ( rule__TimeSeries__PeriodAssignment_12 )
            // InternalDsl.g:3705:3: rule__TimeSeries__PeriodAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__TimeSeries__PeriodAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getTimeSeriesAccess().getPeriodAssignment_12()); 

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
    // $ANTLR end "rule__TimeSeries__Group__12__Impl"


    // $ANTLR start "rule__TimeSeries__Group__13"
    // InternalDsl.g:3713:1: rule__TimeSeries__Group__13 : rule__TimeSeries__Group__13__Impl rule__TimeSeries__Group__14 ;
    public final void rule__TimeSeries__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3717:1: ( rule__TimeSeries__Group__13__Impl rule__TimeSeries__Group__14 )
            // InternalDsl.g:3718:2: rule__TimeSeries__Group__13__Impl rule__TimeSeries__Group__14
            {
            pushFollow(FOLLOW_39);
            rule__TimeSeries__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSeries__Group__14();

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
    // $ANTLR end "rule__TimeSeries__Group__13"


    // $ANTLR start "rule__TimeSeries__Group__13__Impl"
    // InternalDsl.g:3725:1: rule__TimeSeries__Group__13__Impl : ( ';' ) ;
    public final void rule__TimeSeries__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3729:1: ( ( ';' ) )
            // InternalDsl.g:3730:1: ( ';' )
            {
            // InternalDsl.g:3730:1: ( ';' )
            // InternalDsl.g:3731:2: ';'
            {
             before(grammarAccess.getTimeSeriesAccess().getSemicolonKeyword_13()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTimeSeriesAccess().getSemicolonKeyword_13()); 

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
    // $ANTLR end "rule__TimeSeries__Group__13__Impl"


    // $ANTLR start "rule__TimeSeries__Group__14"
    // InternalDsl.g:3740:1: rule__TimeSeries__Group__14 : rule__TimeSeries__Group__14__Impl rule__TimeSeries__Group__15 ;
    public final void rule__TimeSeries__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3744:1: ( rule__TimeSeries__Group__14__Impl rule__TimeSeries__Group__15 )
            // InternalDsl.g:3745:2: rule__TimeSeries__Group__14__Impl rule__TimeSeries__Group__15
            {
            pushFollow(FOLLOW_11);
            rule__TimeSeries__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSeries__Group__15();

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
    // $ANTLR end "rule__TimeSeries__Group__14"


    // $ANTLR start "rule__TimeSeries__Group__14__Impl"
    // InternalDsl.g:3752:1: rule__TimeSeries__Group__14__Impl : ( 'database' ) ;
    public final void rule__TimeSeries__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3756:1: ( ( 'database' ) )
            // InternalDsl.g:3757:1: ( 'database' )
            {
            // InternalDsl.g:3757:1: ( 'database' )
            // InternalDsl.g:3758:2: 'database'
            {
             before(grammarAccess.getTimeSeriesAccess().getDatabaseKeyword_14()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getTimeSeriesAccess().getDatabaseKeyword_14()); 

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
    // $ANTLR end "rule__TimeSeries__Group__14__Impl"


    // $ANTLR start "rule__TimeSeries__Group__15"
    // InternalDsl.g:3767:1: rule__TimeSeries__Group__15 : rule__TimeSeries__Group__15__Impl rule__TimeSeries__Group__16 ;
    public final void rule__TimeSeries__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3771:1: ( rule__TimeSeries__Group__15__Impl rule__TimeSeries__Group__16 )
            // InternalDsl.g:3772:2: rule__TimeSeries__Group__15__Impl rule__TimeSeries__Group__16
            {
            pushFollow(FOLLOW_7);
            rule__TimeSeries__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSeries__Group__16();

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
    // $ANTLR end "rule__TimeSeries__Group__15"


    // $ANTLR start "rule__TimeSeries__Group__15__Impl"
    // InternalDsl.g:3779:1: rule__TimeSeries__Group__15__Impl : ( ( rule__TimeSeries__TimeSeriesDataSourceAssignment_15 ) ) ;
    public final void rule__TimeSeries__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3783:1: ( ( ( rule__TimeSeries__TimeSeriesDataSourceAssignment_15 ) ) )
            // InternalDsl.g:3784:1: ( ( rule__TimeSeries__TimeSeriesDataSourceAssignment_15 ) )
            {
            // InternalDsl.g:3784:1: ( ( rule__TimeSeries__TimeSeriesDataSourceAssignment_15 ) )
            // InternalDsl.g:3785:2: ( rule__TimeSeries__TimeSeriesDataSourceAssignment_15 )
            {
             before(grammarAccess.getTimeSeriesAccess().getTimeSeriesDataSourceAssignment_15()); 
            // InternalDsl.g:3786:2: ( rule__TimeSeries__TimeSeriesDataSourceAssignment_15 )
            // InternalDsl.g:3786:3: rule__TimeSeries__TimeSeriesDataSourceAssignment_15
            {
            pushFollow(FOLLOW_2);
            rule__TimeSeries__TimeSeriesDataSourceAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getTimeSeriesAccess().getTimeSeriesDataSourceAssignment_15()); 

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
    // $ANTLR end "rule__TimeSeries__Group__15__Impl"


    // $ANTLR start "rule__TimeSeries__Group__16"
    // InternalDsl.g:3794:1: rule__TimeSeries__Group__16 : rule__TimeSeries__Group__16__Impl rule__TimeSeries__Group__17 ;
    public final void rule__TimeSeries__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3798:1: ( rule__TimeSeries__Group__16__Impl rule__TimeSeries__Group__17 )
            // InternalDsl.g:3799:2: rule__TimeSeries__Group__16__Impl rule__TimeSeries__Group__17
            {
            pushFollow(FOLLOW_15);
            rule__TimeSeries__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeSeries__Group__17();

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
    // $ANTLR end "rule__TimeSeries__Group__16"


    // $ANTLR start "rule__TimeSeries__Group__16__Impl"
    // InternalDsl.g:3806:1: rule__TimeSeries__Group__16__Impl : ( ';' ) ;
    public final void rule__TimeSeries__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3810:1: ( ( ';' ) )
            // InternalDsl.g:3811:1: ( ';' )
            {
            // InternalDsl.g:3811:1: ( ';' )
            // InternalDsl.g:3812:2: ';'
            {
             before(grammarAccess.getTimeSeriesAccess().getSemicolonKeyword_16()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTimeSeriesAccess().getSemicolonKeyword_16()); 

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
    // $ANTLR end "rule__TimeSeries__Group__16__Impl"


    // $ANTLR start "rule__TimeSeries__Group__17"
    // InternalDsl.g:3821:1: rule__TimeSeries__Group__17 : rule__TimeSeries__Group__17__Impl ;
    public final void rule__TimeSeries__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3825:1: ( rule__TimeSeries__Group__17__Impl )
            // InternalDsl.g:3826:2: rule__TimeSeries__Group__17__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TimeSeries__Group__17__Impl();

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
    // $ANTLR end "rule__TimeSeries__Group__17"


    // $ANTLR start "rule__TimeSeries__Group__17__Impl"
    // InternalDsl.g:3832:1: rule__TimeSeries__Group__17__Impl : ( '}' ) ;
    public final void rule__TimeSeries__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3836:1: ( ( '}' ) )
            // InternalDsl.g:3837:1: ( '}' )
            {
            // InternalDsl.g:3837:1: ( '}' )
            // InternalDsl.g:3838:2: '}'
            {
             before(grammarAccess.getTimeSeriesAccess().getRightCurlyBracketKeyword_17()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTimeSeriesAccess().getRightCurlyBracketKeyword_17()); 

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
    // $ANTLR end "rule__TimeSeries__Group__17__Impl"


    // $ANTLR start "rule__Sensor__Group__0"
    // InternalDsl.g:3848:1: rule__Sensor__Group__0 : rule__Sensor__Group__0__Impl rule__Sensor__Group__1 ;
    public final void rule__Sensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3852:1: ( rule__Sensor__Group__0__Impl rule__Sensor__Group__1 )
            // InternalDsl.g:3853:2: rule__Sensor__Group__0__Impl rule__Sensor__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalDsl.g:3860:1: rule__Sensor__Group__0__Impl : ( ( rule__Sensor__NameAssignment_0 ) ) ;
    public final void rule__Sensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3864:1: ( ( ( rule__Sensor__NameAssignment_0 ) ) )
            // InternalDsl.g:3865:1: ( ( rule__Sensor__NameAssignment_0 ) )
            {
            // InternalDsl.g:3865:1: ( ( rule__Sensor__NameAssignment_0 ) )
            // InternalDsl.g:3866:2: ( rule__Sensor__NameAssignment_0 )
            {
             before(grammarAccess.getSensorAccess().getNameAssignment_0()); 
            // InternalDsl.g:3867:2: ( rule__Sensor__NameAssignment_0 )
            // InternalDsl.g:3867:3: rule__Sensor__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getNameAssignment_0()); 

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
    // InternalDsl.g:3875:1: rule__Sensor__Group__1 : rule__Sensor__Group__1__Impl rule__Sensor__Group__2 ;
    public final void rule__Sensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3879:1: ( rule__Sensor__Group__1__Impl rule__Sensor__Group__2 )
            // InternalDsl.g:3880:2: rule__Sensor__Group__1__Impl rule__Sensor__Group__2
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
    // InternalDsl.g:3887:1: rule__Sensor__Group__1__Impl : ( 'measures' ) ;
    public final void rule__Sensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3891:1: ( ( 'measures' ) )
            // InternalDsl.g:3892:1: ( 'measures' )
            {
            // InternalDsl.g:3892:1: ( 'measures' )
            // InternalDsl.g:3893:2: 'measures'
            {
             before(grammarAccess.getSensorAccess().getMeasuresKeyword_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getMeasuresKeyword_1()); 

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
    // InternalDsl.g:3902:1: rule__Sensor__Group__2 : rule__Sensor__Group__2__Impl rule__Sensor__Group__3 ;
    public final void rule__Sensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3906:1: ( rule__Sensor__Group__2__Impl rule__Sensor__Group__3 )
            // InternalDsl.g:3907:2: rule__Sensor__Group__2__Impl rule__Sensor__Group__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalDsl.g:3914:1: rule__Sensor__Group__2__Impl : ( '{' ) ;
    public final void rule__Sensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3918:1: ( ( '{' ) )
            // InternalDsl.g:3919:1: ( '{' )
            {
            // InternalDsl.g:3919:1: ( '{' )
            // InternalDsl.g:3920:2: '{'
            {
             before(grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_2()); 

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
    // InternalDsl.g:3929:1: rule__Sensor__Group__3 : rule__Sensor__Group__3__Impl rule__Sensor__Group__4 ;
    public final void rule__Sensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3933:1: ( rule__Sensor__Group__3__Impl rule__Sensor__Group__4 )
            // InternalDsl.g:3934:2: rule__Sensor__Group__3__Impl rule__Sensor__Group__4
            {
            pushFollow(FOLLOW_41);
            rule__Sensor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__4();

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
    // InternalDsl.g:3941:1: rule__Sensor__Group__3__Impl : ( ( rule__Sensor__Group_3__0 )? ) ;
    public final void rule__Sensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3945:1: ( ( ( rule__Sensor__Group_3__0 )? ) )
            // InternalDsl.g:3946:1: ( ( rule__Sensor__Group_3__0 )? )
            {
            // InternalDsl.g:3946:1: ( ( rule__Sensor__Group_3__0 )? )
            // InternalDsl.g:3947:2: ( rule__Sensor__Group_3__0 )?
            {
             before(grammarAccess.getSensorAccess().getGroup_3()); 
            // InternalDsl.g:3948:2: ( rule__Sensor__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==61) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDsl.g:3948:3: rule__Sensor__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sensor__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSensorAccess().getGroup_3()); 

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


    // $ANTLR start "rule__Sensor__Group__4"
    // InternalDsl.g:3956:1: rule__Sensor__Group__4 : rule__Sensor__Group__4__Impl rule__Sensor__Group__5 ;
    public final void rule__Sensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3960:1: ( rule__Sensor__Group__4__Impl rule__Sensor__Group__5 )
            // InternalDsl.g:3961:2: rule__Sensor__Group__4__Impl rule__Sensor__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Sensor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__5();

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
    // $ANTLR end "rule__Sensor__Group__4"


    // $ANTLR start "rule__Sensor__Group__4__Impl"
    // InternalDsl.g:3968:1: rule__Sensor__Group__4__Impl : ( ( rule__Sensor__SensorMeasuredVariablesAssignment_4 ) ) ;
    public final void rule__Sensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3972:1: ( ( ( rule__Sensor__SensorMeasuredVariablesAssignment_4 ) ) )
            // InternalDsl.g:3973:1: ( ( rule__Sensor__SensorMeasuredVariablesAssignment_4 ) )
            {
            // InternalDsl.g:3973:1: ( ( rule__Sensor__SensorMeasuredVariablesAssignment_4 ) )
            // InternalDsl.g:3974:2: ( rule__Sensor__SensorMeasuredVariablesAssignment_4 )
            {
             before(grammarAccess.getSensorAccess().getSensorMeasuredVariablesAssignment_4()); 
            // InternalDsl.g:3975:2: ( rule__Sensor__SensorMeasuredVariablesAssignment_4 )
            // InternalDsl.g:3975:3: rule__Sensor__SensorMeasuredVariablesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__SensorMeasuredVariablesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getSensorMeasuredVariablesAssignment_4()); 

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
    // $ANTLR end "rule__Sensor__Group__4__Impl"


    // $ANTLR start "rule__Sensor__Group__5"
    // InternalDsl.g:3983:1: rule__Sensor__Group__5 : rule__Sensor__Group__5__Impl rule__Sensor__Group__6 ;
    public final void rule__Sensor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3987:1: ( rule__Sensor__Group__5__Impl rule__Sensor__Group__6 )
            // InternalDsl.g:3988:2: rule__Sensor__Group__5__Impl rule__Sensor__Group__6
            {
            pushFollow(FOLLOW_42);
            rule__Sensor__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__6();

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
    // $ANTLR end "rule__Sensor__Group__5"


    // $ANTLR start "rule__Sensor__Group__5__Impl"
    // InternalDsl.g:3995:1: rule__Sensor__Group__5__Impl : ( ';' ) ;
    public final void rule__Sensor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3999:1: ( ( ';' ) )
            // InternalDsl.g:4000:1: ( ';' )
            {
            // InternalDsl.g:4000:1: ( ';' )
            // InternalDsl.g:4001:2: ';'
            {
             before(grammarAccess.getSensorAccess().getSemicolonKeyword_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__Sensor__Group__5__Impl"


    // $ANTLR start "rule__Sensor__Group__6"
    // InternalDsl.g:4010:1: rule__Sensor__Group__6 : rule__Sensor__Group__6__Impl rule__Sensor__Group__7 ;
    public final void rule__Sensor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4014:1: ( rule__Sensor__Group__6__Impl rule__Sensor__Group__7 )
            // InternalDsl.g:4015:2: rule__Sensor__Group__6__Impl rule__Sensor__Group__7
            {
            pushFollow(FOLLOW_42);
            rule__Sensor__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__7();

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
    // $ANTLR end "rule__Sensor__Group__6"


    // $ANTLR start "rule__Sensor__Group__6__Impl"
    // InternalDsl.g:4022:1: rule__Sensor__Group__6__Impl : ( ( rule__Sensor__Group_6__0 )* ) ;
    public final void rule__Sensor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4026:1: ( ( ( rule__Sensor__Group_6__0 )* ) )
            // InternalDsl.g:4027:1: ( ( rule__Sensor__Group_6__0 )* )
            {
            // InternalDsl.g:4027:1: ( ( rule__Sensor__Group_6__0 )* )
            // InternalDsl.g:4028:2: ( rule__Sensor__Group_6__0 )*
            {
             before(grammarAccess.getSensorAccess().getGroup_6()); 
            // InternalDsl.g:4029:2: ( rule__Sensor__Group_6__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDsl.g:4029:3: rule__Sensor__Group_6__0
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__Sensor__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getSensorAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Sensor__Group__6__Impl"


    // $ANTLR start "rule__Sensor__Group__7"
    // InternalDsl.g:4037:1: rule__Sensor__Group__7 : rule__Sensor__Group__7__Impl ;
    public final void rule__Sensor__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4041:1: ( rule__Sensor__Group__7__Impl )
            // InternalDsl.g:4042:2: rule__Sensor__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__7__Impl();

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
    // $ANTLR end "rule__Sensor__Group__7"


    // $ANTLR start "rule__Sensor__Group__7__Impl"
    // InternalDsl.g:4048:1: rule__Sensor__Group__7__Impl : ( '}' ) ;
    public final void rule__Sensor__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4052:1: ( ( '}' ) )
            // InternalDsl.g:4053:1: ( '}' )
            {
            // InternalDsl.g:4053:1: ( '}' )
            // InternalDsl.g:4054:2: '}'
            {
             before(grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_7()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Sensor__Group__7__Impl"


    // $ANTLR start "rule__Sensor__Group_3__0"
    // InternalDsl.g:4064:1: rule__Sensor__Group_3__0 : rule__Sensor__Group_3__0__Impl rule__Sensor__Group_3__1 ;
    public final void rule__Sensor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4068:1: ( rule__Sensor__Group_3__0__Impl rule__Sensor__Group_3__1 )
            // InternalDsl.g:4069:2: rule__Sensor__Group_3__0__Impl rule__Sensor__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Sensor__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_3__1();

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
    // $ANTLR end "rule__Sensor__Group_3__0"


    // $ANTLR start "rule__Sensor__Group_3__0__Impl"
    // InternalDsl.g:4076:1: rule__Sensor__Group_3__0__Impl : ( ( rule__Sensor__SensorMetaDataAssignment_3_0 ) ) ;
    public final void rule__Sensor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4080:1: ( ( ( rule__Sensor__SensorMetaDataAssignment_3_0 ) ) )
            // InternalDsl.g:4081:1: ( ( rule__Sensor__SensorMetaDataAssignment_3_0 ) )
            {
            // InternalDsl.g:4081:1: ( ( rule__Sensor__SensorMetaDataAssignment_3_0 ) )
            // InternalDsl.g:4082:2: ( rule__Sensor__SensorMetaDataAssignment_3_0 )
            {
             before(grammarAccess.getSensorAccess().getSensorMetaDataAssignment_3_0()); 
            // InternalDsl.g:4083:2: ( rule__Sensor__SensorMetaDataAssignment_3_0 )
            // InternalDsl.g:4083:3: rule__Sensor__SensorMetaDataAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__SensorMetaDataAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getSensorMetaDataAssignment_3_0()); 

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
    // $ANTLR end "rule__Sensor__Group_3__0__Impl"


    // $ANTLR start "rule__Sensor__Group_3__1"
    // InternalDsl.g:4091:1: rule__Sensor__Group_3__1 : rule__Sensor__Group_3__1__Impl rule__Sensor__Group_3__2 ;
    public final void rule__Sensor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4095:1: ( rule__Sensor__Group_3__1__Impl rule__Sensor__Group_3__2 )
            // InternalDsl.g:4096:2: rule__Sensor__Group_3__1__Impl rule__Sensor__Group_3__2
            {
            pushFollow(FOLLOW_44);
            rule__Sensor__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_3__2();

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
    // $ANTLR end "rule__Sensor__Group_3__1"


    // $ANTLR start "rule__Sensor__Group_3__1__Impl"
    // InternalDsl.g:4103:1: rule__Sensor__Group_3__1__Impl : ( ';' ) ;
    public final void rule__Sensor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4107:1: ( ( ';' ) )
            // InternalDsl.g:4108:1: ( ';' )
            {
            // InternalDsl.g:4108:1: ( ';' )
            // InternalDsl.g:4109:2: ';'
            {
             before(grammarAccess.getSensorAccess().getSemicolonKeyword_3_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getSemicolonKeyword_3_1()); 

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
    // $ANTLR end "rule__Sensor__Group_3__1__Impl"


    // $ANTLR start "rule__Sensor__Group_3__2"
    // InternalDsl.g:4118:1: rule__Sensor__Group_3__2 : rule__Sensor__Group_3__2__Impl ;
    public final void rule__Sensor__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4122:1: ( rule__Sensor__Group_3__2__Impl )
            // InternalDsl.g:4123:2: rule__Sensor__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group_3__2__Impl();

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
    // $ANTLR end "rule__Sensor__Group_3__2"


    // $ANTLR start "rule__Sensor__Group_3__2__Impl"
    // InternalDsl.g:4129:1: rule__Sensor__Group_3__2__Impl : ( ( rule__Sensor__Group_3_2__0 )* ) ;
    public final void rule__Sensor__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4133:1: ( ( ( rule__Sensor__Group_3_2__0 )* ) )
            // InternalDsl.g:4134:1: ( ( rule__Sensor__Group_3_2__0 )* )
            {
            // InternalDsl.g:4134:1: ( ( rule__Sensor__Group_3_2__0 )* )
            // InternalDsl.g:4135:2: ( rule__Sensor__Group_3_2__0 )*
            {
             before(grammarAccess.getSensorAccess().getGroup_3_2()); 
            // InternalDsl.g:4136:2: ( rule__Sensor__Group_3_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==61) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDsl.g:4136:3: rule__Sensor__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__Sensor__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getSensorAccess().getGroup_3_2()); 

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
    // $ANTLR end "rule__Sensor__Group_3__2__Impl"


    // $ANTLR start "rule__Sensor__Group_3_2__0"
    // InternalDsl.g:4145:1: rule__Sensor__Group_3_2__0 : rule__Sensor__Group_3_2__0__Impl rule__Sensor__Group_3_2__1 ;
    public final void rule__Sensor__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4149:1: ( rule__Sensor__Group_3_2__0__Impl rule__Sensor__Group_3_2__1 )
            // InternalDsl.g:4150:2: rule__Sensor__Group_3_2__0__Impl rule__Sensor__Group_3_2__1
            {
            pushFollow(FOLLOW_7);
            rule__Sensor__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_3_2__1();

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
    // $ANTLR end "rule__Sensor__Group_3_2__0"


    // $ANTLR start "rule__Sensor__Group_3_2__0__Impl"
    // InternalDsl.g:4157:1: rule__Sensor__Group_3_2__0__Impl : ( ( rule__Sensor__SensorMetaDataAssignment_3_2_0 ) ) ;
    public final void rule__Sensor__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4161:1: ( ( ( rule__Sensor__SensorMetaDataAssignment_3_2_0 ) ) )
            // InternalDsl.g:4162:1: ( ( rule__Sensor__SensorMetaDataAssignment_3_2_0 ) )
            {
            // InternalDsl.g:4162:1: ( ( rule__Sensor__SensorMetaDataAssignment_3_2_0 ) )
            // InternalDsl.g:4163:2: ( rule__Sensor__SensorMetaDataAssignment_3_2_0 )
            {
             before(grammarAccess.getSensorAccess().getSensorMetaDataAssignment_3_2_0()); 
            // InternalDsl.g:4164:2: ( rule__Sensor__SensorMetaDataAssignment_3_2_0 )
            // InternalDsl.g:4164:3: rule__Sensor__SensorMetaDataAssignment_3_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__SensorMetaDataAssignment_3_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getSensorMetaDataAssignment_3_2_0()); 

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
    // $ANTLR end "rule__Sensor__Group_3_2__0__Impl"


    // $ANTLR start "rule__Sensor__Group_3_2__1"
    // InternalDsl.g:4172:1: rule__Sensor__Group_3_2__1 : rule__Sensor__Group_3_2__1__Impl ;
    public final void rule__Sensor__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4176:1: ( rule__Sensor__Group_3_2__1__Impl )
            // InternalDsl.g:4177:2: rule__Sensor__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__Sensor__Group_3_2__1"


    // $ANTLR start "rule__Sensor__Group_3_2__1__Impl"
    // InternalDsl.g:4183:1: rule__Sensor__Group_3_2__1__Impl : ( ';' ) ;
    public final void rule__Sensor__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4187:1: ( ( ';' ) )
            // InternalDsl.g:4188:1: ( ';' )
            {
            // InternalDsl.g:4188:1: ( ';' )
            // InternalDsl.g:4189:2: ';'
            {
             before(grammarAccess.getSensorAccess().getSemicolonKeyword_3_2_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getSemicolonKeyword_3_2_1()); 

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
    // $ANTLR end "rule__Sensor__Group_3_2__1__Impl"


    // $ANTLR start "rule__Sensor__Group_6__0"
    // InternalDsl.g:4199:1: rule__Sensor__Group_6__0 : rule__Sensor__Group_6__0__Impl rule__Sensor__Group_6__1 ;
    public final void rule__Sensor__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4203:1: ( rule__Sensor__Group_6__0__Impl rule__Sensor__Group_6__1 )
            // InternalDsl.g:4204:2: rule__Sensor__Group_6__0__Impl rule__Sensor__Group_6__1
            {
            pushFollow(FOLLOW_7);
            rule__Sensor__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_6__1();

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
    // $ANTLR end "rule__Sensor__Group_6__0"


    // $ANTLR start "rule__Sensor__Group_6__0__Impl"
    // InternalDsl.g:4211:1: rule__Sensor__Group_6__0__Impl : ( ( rule__Sensor__SensorMeasuredVariablesAssignment_6_0 ) ) ;
    public final void rule__Sensor__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4215:1: ( ( ( rule__Sensor__SensorMeasuredVariablesAssignment_6_0 ) ) )
            // InternalDsl.g:4216:1: ( ( rule__Sensor__SensorMeasuredVariablesAssignment_6_0 ) )
            {
            // InternalDsl.g:4216:1: ( ( rule__Sensor__SensorMeasuredVariablesAssignment_6_0 ) )
            // InternalDsl.g:4217:2: ( rule__Sensor__SensorMeasuredVariablesAssignment_6_0 )
            {
             before(grammarAccess.getSensorAccess().getSensorMeasuredVariablesAssignment_6_0()); 
            // InternalDsl.g:4218:2: ( rule__Sensor__SensorMeasuredVariablesAssignment_6_0 )
            // InternalDsl.g:4218:3: rule__Sensor__SensorMeasuredVariablesAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__SensorMeasuredVariablesAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getSensorMeasuredVariablesAssignment_6_0()); 

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
    // $ANTLR end "rule__Sensor__Group_6__0__Impl"


    // $ANTLR start "rule__Sensor__Group_6__1"
    // InternalDsl.g:4226:1: rule__Sensor__Group_6__1 : rule__Sensor__Group_6__1__Impl ;
    public final void rule__Sensor__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4230:1: ( rule__Sensor__Group_6__1__Impl )
            // InternalDsl.g:4231:2: rule__Sensor__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group_6__1__Impl();

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
    // $ANTLR end "rule__Sensor__Group_6__1"


    // $ANTLR start "rule__Sensor__Group_6__1__Impl"
    // InternalDsl.g:4237:1: rule__Sensor__Group_6__1__Impl : ( ';' ) ;
    public final void rule__Sensor__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4241:1: ( ( ';' ) )
            // InternalDsl.g:4242:1: ( ';' )
            {
            // InternalDsl.g:4242:1: ( ';' )
            // InternalDsl.g:4243:2: ';'
            {
             before(grammarAccess.getSensorAccess().getSemicolonKeyword_6_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getSemicolonKeyword_6_1()); 

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
    // $ANTLR end "rule__Sensor__Group_6__1__Impl"


    // $ANTLR start "rule__MeasuredVariable__Group__0"
    // InternalDsl.g:4253:1: rule__MeasuredVariable__Group__0 : rule__MeasuredVariable__Group__0__Impl rule__MeasuredVariable__Group__1 ;
    public final void rule__MeasuredVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4257:1: ( rule__MeasuredVariable__Group__0__Impl rule__MeasuredVariable__Group__1 )
            // InternalDsl.g:4258:2: rule__MeasuredVariable__Group__0__Impl rule__MeasuredVariable__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__MeasuredVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasuredVariable__Group__1();

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
    // $ANTLR end "rule__MeasuredVariable__Group__0"


    // $ANTLR start "rule__MeasuredVariable__Group__0__Impl"
    // InternalDsl.g:4265:1: rule__MeasuredVariable__Group__0__Impl : ( ( rule__MeasuredVariable__NameAssignment_0 ) ) ;
    public final void rule__MeasuredVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4269:1: ( ( ( rule__MeasuredVariable__NameAssignment_0 ) ) )
            // InternalDsl.g:4270:1: ( ( rule__MeasuredVariable__NameAssignment_0 ) )
            {
            // InternalDsl.g:4270:1: ( ( rule__MeasuredVariable__NameAssignment_0 ) )
            // InternalDsl.g:4271:2: ( rule__MeasuredVariable__NameAssignment_0 )
            {
             before(grammarAccess.getMeasuredVariableAccess().getNameAssignment_0()); 
            // InternalDsl.g:4272:2: ( rule__MeasuredVariable__NameAssignment_0 )
            // InternalDsl.g:4272:3: rule__MeasuredVariable__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MeasuredVariable__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMeasuredVariableAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__MeasuredVariable__Group__0__Impl"


    // $ANTLR start "rule__MeasuredVariable__Group__1"
    // InternalDsl.g:4280:1: rule__MeasuredVariable__Group__1 : rule__MeasuredVariable__Group__1__Impl rule__MeasuredVariable__Group__2 ;
    public final void rule__MeasuredVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4284:1: ( rule__MeasuredVariable__Group__1__Impl rule__MeasuredVariable__Group__2 )
            // InternalDsl.g:4285:2: rule__MeasuredVariable__Group__1__Impl rule__MeasuredVariable__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__MeasuredVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasuredVariable__Group__2();

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
    // $ANTLR end "rule__MeasuredVariable__Group__1"


    // $ANTLR start "rule__MeasuredVariable__Group__1__Impl"
    // InternalDsl.g:4292:1: rule__MeasuredVariable__Group__1__Impl : ( 'in' ) ;
    public final void rule__MeasuredVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4296:1: ( ( 'in' ) )
            // InternalDsl.g:4297:1: ( 'in' )
            {
            // InternalDsl.g:4297:1: ( 'in' )
            // InternalDsl.g:4298:2: 'in'
            {
             before(grammarAccess.getMeasuredVariableAccess().getInKeyword_1()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getMeasuredVariableAccess().getInKeyword_1()); 

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
    // $ANTLR end "rule__MeasuredVariable__Group__1__Impl"


    // $ANTLR start "rule__MeasuredVariable__Group__2"
    // InternalDsl.g:4307:1: rule__MeasuredVariable__Group__2 : rule__MeasuredVariable__Group__2__Impl rule__MeasuredVariable__Group__3 ;
    public final void rule__MeasuredVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4311:1: ( rule__MeasuredVariable__Group__2__Impl rule__MeasuredVariable__Group__3 )
            // InternalDsl.g:4312:2: rule__MeasuredVariable__Group__2__Impl rule__MeasuredVariable__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__MeasuredVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasuredVariable__Group__3();

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
    // $ANTLR end "rule__MeasuredVariable__Group__2"


    // $ANTLR start "rule__MeasuredVariable__Group__2__Impl"
    // InternalDsl.g:4319:1: rule__MeasuredVariable__Group__2__Impl : ( ( rule__MeasuredVariable__UnitAssignment_2 ) ) ;
    public final void rule__MeasuredVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4323:1: ( ( ( rule__MeasuredVariable__UnitAssignment_2 ) ) )
            // InternalDsl.g:4324:1: ( ( rule__MeasuredVariable__UnitAssignment_2 ) )
            {
            // InternalDsl.g:4324:1: ( ( rule__MeasuredVariable__UnitAssignment_2 ) )
            // InternalDsl.g:4325:2: ( rule__MeasuredVariable__UnitAssignment_2 )
            {
             before(grammarAccess.getMeasuredVariableAccess().getUnitAssignment_2()); 
            // InternalDsl.g:4326:2: ( rule__MeasuredVariable__UnitAssignment_2 )
            // InternalDsl.g:4326:3: rule__MeasuredVariable__UnitAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MeasuredVariable__UnitAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMeasuredVariableAccess().getUnitAssignment_2()); 

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
    // $ANTLR end "rule__MeasuredVariable__Group__2__Impl"


    // $ANTLR start "rule__MeasuredVariable__Group__3"
    // InternalDsl.g:4334:1: rule__MeasuredVariable__Group__3 : rule__MeasuredVariable__Group__3__Impl ;
    public final void rule__MeasuredVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4338:1: ( rule__MeasuredVariable__Group__3__Impl )
            // InternalDsl.g:4339:2: rule__MeasuredVariable__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MeasuredVariable__Group__3__Impl();

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
    // $ANTLR end "rule__MeasuredVariable__Group__3"


    // $ANTLR start "rule__MeasuredVariable__Group__3__Impl"
    // InternalDsl.g:4345:1: rule__MeasuredVariable__Group__3__Impl : ( ( rule__MeasuredVariable__Group_3__0 )? ) ;
    public final void rule__MeasuredVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4349:1: ( ( ( rule__MeasuredVariable__Group_3__0 )? ) )
            // InternalDsl.g:4350:1: ( ( rule__MeasuredVariable__Group_3__0 )? )
            {
            // InternalDsl.g:4350:1: ( ( rule__MeasuredVariable__Group_3__0 )? )
            // InternalDsl.g:4351:2: ( rule__MeasuredVariable__Group_3__0 )?
            {
             before(grammarAccess.getMeasuredVariableAccess().getGroup_3()); 
            // InternalDsl.g:4352:2: ( rule__MeasuredVariable__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDsl.g:4352:3: rule__MeasuredVariable__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MeasuredVariable__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeasuredVariableAccess().getGroup_3()); 

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
    // $ANTLR end "rule__MeasuredVariable__Group__3__Impl"


    // $ANTLR start "rule__MeasuredVariable__Group_3__0"
    // InternalDsl.g:4361:1: rule__MeasuredVariable__Group_3__0 : rule__MeasuredVariable__Group_3__0__Impl rule__MeasuredVariable__Group_3__1 ;
    public final void rule__MeasuredVariable__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4365:1: ( rule__MeasuredVariable__Group_3__0__Impl rule__MeasuredVariable__Group_3__1 )
            // InternalDsl.g:4366:2: rule__MeasuredVariable__Group_3__0__Impl rule__MeasuredVariable__Group_3__1
            {
            pushFollow(FOLLOW_44);
            rule__MeasuredVariable__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasuredVariable__Group_3__1();

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
    // $ANTLR end "rule__MeasuredVariable__Group_3__0"


    // $ANTLR start "rule__MeasuredVariable__Group_3__0__Impl"
    // InternalDsl.g:4373:1: rule__MeasuredVariable__Group_3__0__Impl : ( '{' ) ;
    public final void rule__MeasuredVariable__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4377:1: ( ( '{' ) )
            // InternalDsl.g:4378:1: ( '{' )
            {
            // InternalDsl.g:4378:1: ( '{' )
            // InternalDsl.g:4379:2: '{'
            {
             before(grammarAccess.getMeasuredVariableAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMeasuredVariableAccess().getLeftCurlyBracketKeyword_3_0()); 

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
    // $ANTLR end "rule__MeasuredVariable__Group_3__0__Impl"


    // $ANTLR start "rule__MeasuredVariable__Group_3__1"
    // InternalDsl.g:4388:1: rule__MeasuredVariable__Group_3__1 : rule__MeasuredVariable__Group_3__1__Impl rule__MeasuredVariable__Group_3__2 ;
    public final void rule__MeasuredVariable__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4392:1: ( rule__MeasuredVariable__Group_3__1__Impl rule__MeasuredVariable__Group_3__2 )
            // InternalDsl.g:4393:2: rule__MeasuredVariable__Group_3__1__Impl rule__MeasuredVariable__Group_3__2
            {
            pushFollow(FOLLOW_7);
            rule__MeasuredVariable__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasuredVariable__Group_3__2();

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
    // $ANTLR end "rule__MeasuredVariable__Group_3__1"


    // $ANTLR start "rule__MeasuredVariable__Group_3__1__Impl"
    // InternalDsl.g:4400:1: rule__MeasuredVariable__Group_3__1__Impl : ( ( rule__MeasuredVariable__MeasuredVariableMetaDataAssignment_3_1 ) ) ;
    public final void rule__MeasuredVariable__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4404:1: ( ( ( rule__MeasuredVariable__MeasuredVariableMetaDataAssignment_3_1 ) ) )
            // InternalDsl.g:4405:1: ( ( rule__MeasuredVariable__MeasuredVariableMetaDataAssignment_3_1 ) )
            {
            // InternalDsl.g:4405:1: ( ( rule__MeasuredVariable__MeasuredVariableMetaDataAssignment_3_1 ) )
            // InternalDsl.g:4406:2: ( rule__MeasuredVariable__MeasuredVariableMetaDataAssignment_3_1 )
            {
             before(grammarAccess.getMeasuredVariableAccess().getMeasuredVariableMetaDataAssignment_3_1()); 
            // InternalDsl.g:4407:2: ( rule__MeasuredVariable__MeasuredVariableMetaDataAssignment_3_1 )
            // InternalDsl.g:4407:3: rule__MeasuredVariable__MeasuredVariableMetaDataAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MeasuredVariable__MeasuredVariableMetaDataAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMeasuredVariableAccess().getMeasuredVariableMetaDataAssignment_3_1()); 

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
    // $ANTLR end "rule__MeasuredVariable__Group_3__1__Impl"


    // $ANTLR start "rule__MeasuredVariable__Group_3__2"
    // InternalDsl.g:4415:1: rule__MeasuredVariable__Group_3__2 : rule__MeasuredVariable__Group_3__2__Impl rule__MeasuredVariable__Group_3__3 ;
    public final void rule__MeasuredVariable__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4419:1: ( rule__MeasuredVariable__Group_3__2__Impl rule__MeasuredVariable__Group_3__3 )
            // InternalDsl.g:4420:2: rule__MeasuredVariable__Group_3__2__Impl rule__MeasuredVariable__Group_3__3
            {
            pushFollow(FOLLOW_48);
            rule__MeasuredVariable__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasuredVariable__Group_3__3();

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
    // $ANTLR end "rule__MeasuredVariable__Group_3__2"


    // $ANTLR start "rule__MeasuredVariable__Group_3__2__Impl"
    // InternalDsl.g:4427:1: rule__MeasuredVariable__Group_3__2__Impl : ( ';' ) ;
    public final void rule__MeasuredVariable__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4431:1: ( ( ';' ) )
            // InternalDsl.g:4432:1: ( ';' )
            {
            // InternalDsl.g:4432:1: ( ';' )
            // InternalDsl.g:4433:2: ';'
            {
             before(grammarAccess.getMeasuredVariableAccess().getSemicolonKeyword_3_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMeasuredVariableAccess().getSemicolonKeyword_3_2()); 

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
    // $ANTLR end "rule__MeasuredVariable__Group_3__2__Impl"


    // $ANTLR start "rule__MeasuredVariable__Group_3__3"
    // InternalDsl.g:4442:1: rule__MeasuredVariable__Group_3__3 : rule__MeasuredVariable__Group_3__3__Impl rule__MeasuredVariable__Group_3__4 ;
    public final void rule__MeasuredVariable__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4446:1: ( rule__MeasuredVariable__Group_3__3__Impl rule__MeasuredVariable__Group_3__4 )
            // InternalDsl.g:4447:2: rule__MeasuredVariable__Group_3__3__Impl rule__MeasuredVariable__Group_3__4
            {
            pushFollow(FOLLOW_48);
            rule__MeasuredVariable__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasuredVariable__Group_3__4();

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
    // $ANTLR end "rule__MeasuredVariable__Group_3__3"


    // $ANTLR start "rule__MeasuredVariable__Group_3__3__Impl"
    // InternalDsl.g:4454:1: rule__MeasuredVariable__Group_3__3__Impl : ( ( rule__MeasuredVariable__Group_3_3__0 )* ) ;
    public final void rule__MeasuredVariable__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4458:1: ( ( ( rule__MeasuredVariable__Group_3_3__0 )* ) )
            // InternalDsl.g:4459:1: ( ( rule__MeasuredVariable__Group_3_3__0 )* )
            {
            // InternalDsl.g:4459:1: ( ( rule__MeasuredVariable__Group_3_3__0 )* )
            // InternalDsl.g:4460:2: ( rule__MeasuredVariable__Group_3_3__0 )*
            {
             before(grammarAccess.getMeasuredVariableAccess().getGroup_3_3()); 
            // InternalDsl.g:4461:2: ( rule__MeasuredVariable__Group_3_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==61) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDsl.g:4461:3: rule__MeasuredVariable__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__MeasuredVariable__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getMeasuredVariableAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__MeasuredVariable__Group_3__3__Impl"


    // $ANTLR start "rule__MeasuredVariable__Group_3__4"
    // InternalDsl.g:4469:1: rule__MeasuredVariable__Group_3__4 : rule__MeasuredVariable__Group_3__4__Impl ;
    public final void rule__MeasuredVariable__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4473:1: ( rule__MeasuredVariable__Group_3__4__Impl )
            // InternalDsl.g:4474:2: rule__MeasuredVariable__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MeasuredVariable__Group_3__4__Impl();

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
    // $ANTLR end "rule__MeasuredVariable__Group_3__4"


    // $ANTLR start "rule__MeasuredVariable__Group_3__4__Impl"
    // InternalDsl.g:4480:1: rule__MeasuredVariable__Group_3__4__Impl : ( '}' ) ;
    public final void rule__MeasuredVariable__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4484:1: ( ( '}' ) )
            // InternalDsl.g:4485:1: ( '}' )
            {
            // InternalDsl.g:4485:1: ( '}' )
            // InternalDsl.g:4486:2: '}'
            {
             before(grammarAccess.getMeasuredVariableAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getMeasuredVariableAccess().getRightCurlyBracketKeyword_3_4()); 

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
    // $ANTLR end "rule__MeasuredVariable__Group_3__4__Impl"


    // $ANTLR start "rule__MeasuredVariable__Group_3_3__0"
    // InternalDsl.g:4496:1: rule__MeasuredVariable__Group_3_3__0 : rule__MeasuredVariable__Group_3_3__0__Impl rule__MeasuredVariable__Group_3_3__1 ;
    public final void rule__MeasuredVariable__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4500:1: ( rule__MeasuredVariable__Group_3_3__0__Impl rule__MeasuredVariable__Group_3_3__1 )
            // InternalDsl.g:4501:2: rule__MeasuredVariable__Group_3_3__0__Impl rule__MeasuredVariable__Group_3_3__1
            {
            pushFollow(FOLLOW_7);
            rule__MeasuredVariable__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeasuredVariable__Group_3_3__1();

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
    // $ANTLR end "rule__MeasuredVariable__Group_3_3__0"


    // $ANTLR start "rule__MeasuredVariable__Group_3_3__0__Impl"
    // InternalDsl.g:4508:1: rule__MeasuredVariable__Group_3_3__0__Impl : ( ( rule__MeasuredVariable__MeasuredVariableMetaDataAssignment_3_3_0 ) ) ;
    public final void rule__MeasuredVariable__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4512:1: ( ( ( rule__MeasuredVariable__MeasuredVariableMetaDataAssignment_3_3_0 ) ) )
            // InternalDsl.g:4513:1: ( ( rule__MeasuredVariable__MeasuredVariableMetaDataAssignment_3_3_0 ) )
            {
            // InternalDsl.g:4513:1: ( ( rule__MeasuredVariable__MeasuredVariableMetaDataAssignment_3_3_0 ) )
            // InternalDsl.g:4514:2: ( rule__MeasuredVariable__MeasuredVariableMetaDataAssignment_3_3_0 )
            {
             before(grammarAccess.getMeasuredVariableAccess().getMeasuredVariableMetaDataAssignment_3_3_0()); 
            // InternalDsl.g:4515:2: ( rule__MeasuredVariable__MeasuredVariableMetaDataAssignment_3_3_0 )
            // InternalDsl.g:4515:3: rule__MeasuredVariable__MeasuredVariableMetaDataAssignment_3_3_0
            {
            pushFollow(FOLLOW_2);
            rule__MeasuredVariable__MeasuredVariableMetaDataAssignment_3_3_0();

            state._fsp--;


            }

             after(grammarAccess.getMeasuredVariableAccess().getMeasuredVariableMetaDataAssignment_3_3_0()); 

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
    // $ANTLR end "rule__MeasuredVariable__Group_3_3__0__Impl"


    // $ANTLR start "rule__MeasuredVariable__Group_3_3__1"
    // InternalDsl.g:4523:1: rule__MeasuredVariable__Group_3_3__1 : rule__MeasuredVariable__Group_3_3__1__Impl ;
    public final void rule__MeasuredVariable__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4527:1: ( rule__MeasuredVariable__Group_3_3__1__Impl )
            // InternalDsl.g:4528:2: rule__MeasuredVariable__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MeasuredVariable__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__MeasuredVariable__Group_3_3__1"


    // $ANTLR start "rule__MeasuredVariable__Group_3_3__1__Impl"
    // InternalDsl.g:4534:1: rule__MeasuredVariable__Group_3_3__1__Impl : ( ';' ) ;
    public final void rule__MeasuredVariable__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4538:1: ( ( ';' ) )
            // InternalDsl.g:4539:1: ( ';' )
            {
            // InternalDsl.g:4539:1: ( ';' )
            // InternalDsl.g:4540:2: ';'
            {
             before(grammarAccess.getMeasuredVariableAccess().getSemicolonKeyword_3_3_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMeasuredVariableAccess().getSemicolonKeyword_3_3_1()); 

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
    // $ANTLR end "rule__MeasuredVariable__Group_3_3__1__Impl"


    // $ANTLR start "rule__MetaData__Group__0"
    // InternalDsl.g:4550:1: rule__MetaData__Group__0 : rule__MetaData__Group__0__Impl rule__MetaData__Group__1 ;
    public final void rule__MetaData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4554:1: ( rule__MetaData__Group__0__Impl rule__MetaData__Group__1 )
            // InternalDsl.g:4555:2: rule__MetaData__Group__0__Impl rule__MetaData__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__MetaData__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetaData__Group__1();

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
    // $ANTLR end "rule__MetaData__Group__0"


    // $ANTLR start "rule__MetaData__Group__0__Impl"
    // InternalDsl.g:4562:1: rule__MetaData__Group__0__Impl : ( 'metadata' ) ;
    public final void rule__MetaData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4566:1: ( ( 'metadata' ) )
            // InternalDsl.g:4567:1: ( 'metadata' )
            {
            // InternalDsl.g:4567:1: ( 'metadata' )
            // InternalDsl.g:4568:2: 'metadata'
            {
             before(grammarAccess.getMetaDataAccess().getMetadataKeyword_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getMetaDataAccess().getMetadataKeyword_0()); 

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
    // $ANTLR end "rule__MetaData__Group__0__Impl"


    // $ANTLR start "rule__MetaData__Group__1"
    // InternalDsl.g:4577:1: rule__MetaData__Group__1 : rule__MetaData__Group__1__Impl rule__MetaData__Group__2 ;
    public final void rule__MetaData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4581:1: ( rule__MetaData__Group__1__Impl rule__MetaData__Group__2 )
            // InternalDsl.g:4582:2: rule__MetaData__Group__1__Impl rule__MetaData__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__MetaData__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetaData__Group__2();

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
    // $ANTLR end "rule__MetaData__Group__1"


    // $ANTLR start "rule__MetaData__Group__1__Impl"
    // InternalDsl.g:4589:1: rule__MetaData__Group__1__Impl : ( ( rule__MetaData__NameAssignment_1 ) ) ;
    public final void rule__MetaData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4593:1: ( ( ( rule__MetaData__NameAssignment_1 ) ) )
            // InternalDsl.g:4594:1: ( ( rule__MetaData__NameAssignment_1 ) )
            {
            // InternalDsl.g:4594:1: ( ( rule__MetaData__NameAssignment_1 ) )
            // InternalDsl.g:4595:2: ( rule__MetaData__NameAssignment_1 )
            {
             before(grammarAccess.getMetaDataAccess().getNameAssignment_1()); 
            // InternalDsl.g:4596:2: ( rule__MetaData__NameAssignment_1 )
            // InternalDsl.g:4596:3: rule__MetaData__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MetaData__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMetaDataAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__MetaData__Group__1__Impl"


    // $ANTLR start "rule__MetaData__Group__2"
    // InternalDsl.g:4604:1: rule__MetaData__Group__2 : rule__MetaData__Group__2__Impl rule__MetaData__Group__3 ;
    public final void rule__MetaData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4608:1: ( rule__MetaData__Group__2__Impl rule__MetaData__Group__3 )
            // InternalDsl.g:4609:2: rule__MetaData__Group__2__Impl rule__MetaData__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__MetaData__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetaData__Group__3();

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
    // $ANTLR end "rule__MetaData__Group__2"


    // $ANTLR start "rule__MetaData__Group__2__Impl"
    // InternalDsl.g:4616:1: rule__MetaData__Group__2__Impl : ( '(' ) ;
    public final void rule__MetaData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4620:1: ( ( '(' ) )
            // InternalDsl.g:4621:1: ( '(' )
            {
            // InternalDsl.g:4621:1: ( '(' )
            // InternalDsl.g:4622:2: '('
            {
             before(grammarAccess.getMetaDataAccess().getLeftParenthesisKeyword_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getMetaDataAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__MetaData__Group__2__Impl"


    // $ANTLR start "rule__MetaData__Group__3"
    // InternalDsl.g:4631:1: rule__MetaData__Group__3 : rule__MetaData__Group__3__Impl rule__MetaData__Group__4 ;
    public final void rule__MetaData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4635:1: ( rule__MetaData__Group__3__Impl rule__MetaData__Group__4 )
            // InternalDsl.g:4636:2: rule__MetaData__Group__3__Impl rule__MetaData__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__MetaData__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetaData__Group__4();

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
    // $ANTLR end "rule__MetaData__Group__3"


    // $ANTLR start "rule__MetaData__Group__3__Impl"
    // InternalDsl.g:4643:1: rule__MetaData__Group__3__Impl : ( ( rule__MetaData__ValueAssignment_3 ) ) ;
    public final void rule__MetaData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4647:1: ( ( ( rule__MetaData__ValueAssignment_3 ) ) )
            // InternalDsl.g:4648:1: ( ( rule__MetaData__ValueAssignment_3 ) )
            {
            // InternalDsl.g:4648:1: ( ( rule__MetaData__ValueAssignment_3 ) )
            // InternalDsl.g:4649:2: ( rule__MetaData__ValueAssignment_3 )
            {
             before(grammarAccess.getMetaDataAccess().getValueAssignment_3()); 
            // InternalDsl.g:4650:2: ( rule__MetaData__ValueAssignment_3 )
            // InternalDsl.g:4650:3: rule__MetaData__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MetaData__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMetaDataAccess().getValueAssignment_3()); 

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
    // $ANTLR end "rule__MetaData__Group__3__Impl"


    // $ANTLR start "rule__MetaData__Group__4"
    // InternalDsl.g:4658:1: rule__MetaData__Group__4 : rule__MetaData__Group__4__Impl ;
    public final void rule__MetaData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4662:1: ( rule__MetaData__Group__4__Impl )
            // InternalDsl.g:4663:2: rule__MetaData__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MetaData__Group__4__Impl();

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
    // $ANTLR end "rule__MetaData__Group__4"


    // $ANTLR start "rule__MetaData__Group__4__Impl"
    // InternalDsl.g:4669:1: rule__MetaData__Group__4__Impl : ( ')' ) ;
    public final void rule__MetaData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4673:1: ( ( ')' ) )
            // InternalDsl.g:4674:1: ( ')' )
            {
            // InternalDsl.g:4674:1: ( ')' )
            // InternalDsl.g:4675:2: ')'
            {
             before(grammarAccess.getMetaDataAccess().getRightParenthesisKeyword_4()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getMetaDataAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__MetaData__Group__4__Impl"


    // $ANTLR start "rule__Database__Group__0"
    // InternalDsl.g:4685:1: rule__Database__Group__0 : rule__Database__Group__0__Impl rule__Database__Group__1 ;
    public final void rule__Database__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4689:1: ( rule__Database__Group__0__Impl rule__Database__Group__1 )
            // InternalDsl.g:4690:2: rule__Database__Group__0__Impl rule__Database__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Database__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Database__Group__1();

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
    // $ANTLR end "rule__Database__Group__0"


    // $ANTLR start "rule__Database__Group__0__Impl"
    // InternalDsl.g:4697:1: rule__Database__Group__0__Impl : ( ( rule__Database__NameAssignment_0 ) ) ;
    public final void rule__Database__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4701:1: ( ( ( rule__Database__NameAssignment_0 ) ) )
            // InternalDsl.g:4702:1: ( ( rule__Database__NameAssignment_0 ) )
            {
            // InternalDsl.g:4702:1: ( ( rule__Database__NameAssignment_0 ) )
            // InternalDsl.g:4703:2: ( rule__Database__NameAssignment_0 )
            {
             before(grammarAccess.getDatabaseAccess().getNameAssignment_0()); 
            // InternalDsl.g:4704:2: ( rule__Database__NameAssignment_0 )
            // InternalDsl.g:4704:3: rule__Database__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Database__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Database__Group__0__Impl"


    // $ANTLR start "rule__Database__Group__1"
    // InternalDsl.g:4712:1: rule__Database__Group__1 : rule__Database__Group__1__Impl rule__Database__Group__2 ;
    public final void rule__Database__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4716:1: ( rule__Database__Group__1__Impl rule__Database__Group__2 )
            // InternalDsl.g:4717:2: rule__Database__Group__1__Impl rule__Database__Group__2
            {
            pushFollow(FOLLOW_49);
            rule__Database__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Database__Group__2();

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
    // $ANTLR end "rule__Database__Group__1"


    // $ANTLR start "rule__Database__Group__1__Impl"
    // InternalDsl.g:4724:1: rule__Database__Group__1__Impl : ( '(' ) ;
    public final void rule__Database__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4728:1: ( ( '(' ) )
            // InternalDsl.g:4729:1: ( '(' )
            {
            // InternalDsl.g:4729:1: ( '(' )
            // InternalDsl.g:4730:2: '('
            {
             before(grammarAccess.getDatabaseAccess().getLeftParenthesisKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getDatabaseAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Database__Group__1__Impl"


    // $ANTLR start "rule__Database__Group__2"
    // InternalDsl.g:4739:1: rule__Database__Group__2 : rule__Database__Group__2__Impl rule__Database__Group__3 ;
    public final void rule__Database__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4743:1: ( rule__Database__Group__2__Impl rule__Database__Group__3 )
            // InternalDsl.g:4744:2: rule__Database__Group__2__Impl rule__Database__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Database__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Database__Group__3();

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
    // $ANTLR end "rule__Database__Group__2"


    // $ANTLR start "rule__Database__Group__2__Impl"
    // InternalDsl.g:4751:1: rule__Database__Group__2__Impl : ( ( rule__Database__DbmsAssignment_2 ) ) ;
    public final void rule__Database__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4755:1: ( ( ( rule__Database__DbmsAssignment_2 ) ) )
            // InternalDsl.g:4756:1: ( ( rule__Database__DbmsAssignment_2 ) )
            {
            // InternalDsl.g:4756:1: ( ( rule__Database__DbmsAssignment_2 ) )
            // InternalDsl.g:4757:2: ( rule__Database__DbmsAssignment_2 )
            {
             before(grammarAccess.getDatabaseAccess().getDbmsAssignment_2()); 
            // InternalDsl.g:4758:2: ( rule__Database__DbmsAssignment_2 )
            // InternalDsl.g:4758:3: rule__Database__DbmsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Database__DbmsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getDbmsAssignment_2()); 

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
    // $ANTLR end "rule__Database__Group__2__Impl"


    // $ANTLR start "rule__Database__Group__3"
    // InternalDsl.g:4766:1: rule__Database__Group__3 : rule__Database__Group__3__Impl rule__Database__Group__4 ;
    public final void rule__Database__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4770:1: ( rule__Database__Group__3__Impl rule__Database__Group__4 )
            // InternalDsl.g:4771:2: rule__Database__Group__3__Impl rule__Database__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__Database__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Database__Group__4();

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
    // $ANTLR end "rule__Database__Group__3"


    // $ANTLR start "rule__Database__Group__3__Impl"
    // InternalDsl.g:4778:1: rule__Database__Group__3__Impl : ( ',' ) ;
    public final void rule__Database__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4782:1: ( ( ',' ) )
            // InternalDsl.g:4783:1: ( ',' )
            {
            // InternalDsl.g:4783:1: ( ',' )
            // InternalDsl.g:4784:2: ','
            {
             before(grammarAccess.getDatabaseAccess().getCommaKeyword_3()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getDatabaseAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__Database__Group__3__Impl"


    // $ANTLR start "rule__Database__Group__4"
    // InternalDsl.g:4793:1: rule__Database__Group__4 : rule__Database__Group__4__Impl rule__Database__Group__5 ;
    public final void rule__Database__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4797:1: ( rule__Database__Group__4__Impl rule__Database__Group__5 )
            // InternalDsl.g:4798:2: rule__Database__Group__4__Impl rule__Database__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__Database__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Database__Group__5();

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
    // $ANTLR end "rule__Database__Group__4"


    // $ANTLR start "rule__Database__Group__4__Impl"
    // InternalDsl.g:4805:1: rule__Database__Group__4__Impl : ( ( rule__Database__PortAssignment_4 ) ) ;
    public final void rule__Database__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4809:1: ( ( ( rule__Database__PortAssignment_4 ) ) )
            // InternalDsl.g:4810:1: ( ( rule__Database__PortAssignment_4 ) )
            {
            // InternalDsl.g:4810:1: ( ( rule__Database__PortAssignment_4 ) )
            // InternalDsl.g:4811:2: ( rule__Database__PortAssignment_4 )
            {
             before(grammarAccess.getDatabaseAccess().getPortAssignment_4()); 
            // InternalDsl.g:4812:2: ( rule__Database__PortAssignment_4 )
            // InternalDsl.g:4812:3: rule__Database__PortAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Database__PortAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getPortAssignment_4()); 

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
    // $ANTLR end "rule__Database__Group__4__Impl"


    // $ANTLR start "rule__Database__Group__5"
    // InternalDsl.g:4820:1: rule__Database__Group__5 : rule__Database__Group__5__Impl rule__Database__Group__6 ;
    public final void rule__Database__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4824:1: ( rule__Database__Group__5__Impl rule__Database__Group__6 )
            // InternalDsl.g:4825:2: rule__Database__Group__5__Impl rule__Database__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Database__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Database__Group__6();

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
    // $ANTLR end "rule__Database__Group__5"


    // $ANTLR start "rule__Database__Group__5__Impl"
    // InternalDsl.g:4832:1: rule__Database__Group__5__Impl : ( ',' ) ;
    public final void rule__Database__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4836:1: ( ( ',' ) )
            // InternalDsl.g:4837:1: ( ',' )
            {
            // InternalDsl.g:4837:1: ( ',' )
            // InternalDsl.g:4838:2: ','
            {
             before(grammarAccess.getDatabaseAccess().getCommaKeyword_5()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getDatabaseAccess().getCommaKeyword_5()); 

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
    // $ANTLR end "rule__Database__Group__5__Impl"


    // $ANTLR start "rule__Database__Group__6"
    // InternalDsl.g:4847:1: rule__Database__Group__6 : rule__Database__Group__6__Impl rule__Database__Group__7 ;
    public final void rule__Database__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4851:1: ( rule__Database__Group__6__Impl rule__Database__Group__7 )
            // InternalDsl.g:4852:2: rule__Database__Group__6__Impl rule__Database__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__Database__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Database__Group__7();

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
    // $ANTLR end "rule__Database__Group__6"


    // $ANTLR start "rule__Database__Group__6__Impl"
    // InternalDsl.g:4859:1: rule__Database__Group__6__Impl : ( ( rule__Database__UsernameAssignment_6 ) ) ;
    public final void rule__Database__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4863:1: ( ( ( rule__Database__UsernameAssignment_6 ) ) )
            // InternalDsl.g:4864:1: ( ( rule__Database__UsernameAssignment_6 ) )
            {
            // InternalDsl.g:4864:1: ( ( rule__Database__UsernameAssignment_6 ) )
            // InternalDsl.g:4865:2: ( rule__Database__UsernameAssignment_6 )
            {
             before(grammarAccess.getDatabaseAccess().getUsernameAssignment_6()); 
            // InternalDsl.g:4866:2: ( rule__Database__UsernameAssignment_6 )
            // InternalDsl.g:4866:3: rule__Database__UsernameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Database__UsernameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getUsernameAssignment_6()); 

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
    // $ANTLR end "rule__Database__Group__6__Impl"


    // $ANTLR start "rule__Database__Group__7"
    // InternalDsl.g:4874:1: rule__Database__Group__7 : rule__Database__Group__7__Impl rule__Database__Group__8 ;
    public final void rule__Database__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4878:1: ( rule__Database__Group__7__Impl rule__Database__Group__8 )
            // InternalDsl.g:4879:2: rule__Database__Group__7__Impl rule__Database__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__Database__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Database__Group__8();

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
    // $ANTLR end "rule__Database__Group__7"


    // $ANTLR start "rule__Database__Group__7__Impl"
    // InternalDsl.g:4886:1: rule__Database__Group__7__Impl : ( ',' ) ;
    public final void rule__Database__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4890:1: ( ( ',' ) )
            // InternalDsl.g:4891:1: ( ',' )
            {
            // InternalDsl.g:4891:1: ( ',' )
            // InternalDsl.g:4892:2: ','
            {
             before(grammarAccess.getDatabaseAccess().getCommaKeyword_7()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getDatabaseAccess().getCommaKeyword_7()); 

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
    // $ANTLR end "rule__Database__Group__7__Impl"


    // $ANTLR start "rule__Database__Group__8"
    // InternalDsl.g:4901:1: rule__Database__Group__8 : rule__Database__Group__8__Impl rule__Database__Group__9 ;
    public final void rule__Database__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4905:1: ( rule__Database__Group__8__Impl rule__Database__Group__9 )
            // InternalDsl.g:4906:2: rule__Database__Group__8__Impl rule__Database__Group__9
            {
            pushFollow(FOLLOW_26);
            rule__Database__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Database__Group__9();

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
    // $ANTLR end "rule__Database__Group__8"


    // $ANTLR start "rule__Database__Group__8__Impl"
    // InternalDsl.g:4913:1: rule__Database__Group__8__Impl : ( ( rule__Database__PasswordAssignment_8 ) ) ;
    public final void rule__Database__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4917:1: ( ( ( rule__Database__PasswordAssignment_8 ) ) )
            // InternalDsl.g:4918:1: ( ( rule__Database__PasswordAssignment_8 ) )
            {
            // InternalDsl.g:4918:1: ( ( rule__Database__PasswordAssignment_8 ) )
            // InternalDsl.g:4919:2: ( rule__Database__PasswordAssignment_8 )
            {
             before(grammarAccess.getDatabaseAccess().getPasswordAssignment_8()); 
            // InternalDsl.g:4920:2: ( rule__Database__PasswordAssignment_8 )
            // InternalDsl.g:4920:3: rule__Database__PasswordAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Database__PasswordAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getPasswordAssignment_8()); 

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
    // $ANTLR end "rule__Database__Group__8__Impl"


    // $ANTLR start "rule__Database__Group__9"
    // InternalDsl.g:4928:1: rule__Database__Group__9 : rule__Database__Group__9__Impl rule__Database__Group__10 ;
    public final void rule__Database__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4932:1: ( rule__Database__Group__9__Impl rule__Database__Group__10 )
            // InternalDsl.g:4933:2: rule__Database__Group__9__Impl rule__Database__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__Database__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Database__Group__10();

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
    // $ANTLR end "rule__Database__Group__9"


    // $ANTLR start "rule__Database__Group__9__Impl"
    // InternalDsl.g:4940:1: rule__Database__Group__9__Impl : ( ',' ) ;
    public final void rule__Database__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4944:1: ( ( ',' ) )
            // InternalDsl.g:4945:1: ( ',' )
            {
            // InternalDsl.g:4945:1: ( ',' )
            // InternalDsl.g:4946:2: ','
            {
             before(grammarAccess.getDatabaseAccess().getCommaKeyword_9()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getDatabaseAccess().getCommaKeyword_9()); 

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
    // $ANTLR end "rule__Database__Group__9__Impl"


    // $ANTLR start "rule__Database__Group__10"
    // InternalDsl.g:4955:1: rule__Database__Group__10 : rule__Database__Group__10__Impl rule__Database__Group__11 ;
    public final void rule__Database__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4959:1: ( rule__Database__Group__10__Impl rule__Database__Group__11 )
            // InternalDsl.g:4960:2: rule__Database__Group__10__Impl rule__Database__Group__11
            {
            pushFollow(FOLLOW_28);
            rule__Database__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Database__Group__11();

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
    // $ANTLR end "rule__Database__Group__10"


    // $ANTLR start "rule__Database__Group__10__Impl"
    // InternalDsl.g:4967:1: rule__Database__Group__10__Impl : ( ( rule__Database__DataDirectoryAssignment_10 ) ) ;
    public final void rule__Database__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4971:1: ( ( ( rule__Database__DataDirectoryAssignment_10 ) ) )
            // InternalDsl.g:4972:1: ( ( rule__Database__DataDirectoryAssignment_10 ) )
            {
            // InternalDsl.g:4972:1: ( ( rule__Database__DataDirectoryAssignment_10 ) )
            // InternalDsl.g:4973:2: ( rule__Database__DataDirectoryAssignment_10 )
            {
             before(grammarAccess.getDatabaseAccess().getDataDirectoryAssignment_10()); 
            // InternalDsl.g:4974:2: ( rule__Database__DataDirectoryAssignment_10 )
            // InternalDsl.g:4974:3: rule__Database__DataDirectoryAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Database__DataDirectoryAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getDataDirectoryAssignment_10()); 

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
    // $ANTLR end "rule__Database__Group__10__Impl"


    // $ANTLR start "rule__Database__Group__11"
    // InternalDsl.g:4982:1: rule__Database__Group__11 : rule__Database__Group__11__Impl ;
    public final void rule__Database__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4986:1: ( rule__Database__Group__11__Impl )
            // InternalDsl.g:4987:2: rule__Database__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Database__Group__11__Impl();

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
    // $ANTLR end "rule__Database__Group__11"


    // $ANTLR start "rule__Database__Group__11__Impl"
    // InternalDsl.g:4993:1: rule__Database__Group__11__Impl : ( ')' ) ;
    public final void rule__Database__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4997:1: ( ( ')' ) )
            // InternalDsl.g:4998:1: ( ')' )
            {
            // InternalDsl.g:4998:1: ( ')' )
            // InternalDsl.g:4999:2: ')'
            {
             before(grammarAccess.getDatabaseAccess().getRightParenthesisKeyword_11()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getDatabaseAccess().getRightParenthesisKeyword_11()); 

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
    // $ANTLR end "rule__Database__Group__11__Impl"


    // $ANTLR start "rule__File__Group__0"
    // InternalDsl.g:5009:1: rule__File__Group__0 : rule__File__Group__0__Impl rule__File__Group__1 ;
    public final void rule__File__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5013:1: ( rule__File__Group__0__Impl rule__File__Group__1 )
            // InternalDsl.g:5014:2: rule__File__Group__0__Impl rule__File__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__File__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group__1();

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
    // $ANTLR end "rule__File__Group__0"


    // $ANTLR start "rule__File__Group__0__Impl"
    // InternalDsl.g:5021:1: rule__File__Group__0__Impl : ( ( rule__File__NameAssignment_0 ) ) ;
    public final void rule__File__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5025:1: ( ( ( rule__File__NameAssignment_0 ) ) )
            // InternalDsl.g:5026:1: ( ( rule__File__NameAssignment_0 ) )
            {
            // InternalDsl.g:5026:1: ( ( rule__File__NameAssignment_0 ) )
            // InternalDsl.g:5027:2: ( rule__File__NameAssignment_0 )
            {
             before(grammarAccess.getFileAccess().getNameAssignment_0()); 
            // InternalDsl.g:5028:2: ( rule__File__NameAssignment_0 )
            // InternalDsl.g:5028:3: rule__File__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__File__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__File__Group__0__Impl"


    // $ANTLR start "rule__File__Group__1"
    // InternalDsl.g:5036:1: rule__File__Group__1 : rule__File__Group__1__Impl rule__File__Group__2 ;
    public final void rule__File__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5040:1: ( rule__File__Group__1__Impl rule__File__Group__2 )
            // InternalDsl.g:5041:2: rule__File__Group__1__Impl rule__File__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__File__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group__2();

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
    // $ANTLR end "rule__File__Group__1"


    // $ANTLR start "rule__File__Group__1__Impl"
    // InternalDsl.g:5048:1: rule__File__Group__1__Impl : ( '(' ) ;
    public final void rule__File__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5052:1: ( ( '(' ) )
            // InternalDsl.g:5053:1: ( '(' )
            {
            // InternalDsl.g:5053:1: ( '(' )
            // InternalDsl.g:5054:2: '('
            {
             before(grammarAccess.getFileAccess().getLeftParenthesisKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getFileAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__File__Group__1__Impl"


    // $ANTLR start "rule__File__Group__2"
    // InternalDsl.g:5063:1: rule__File__Group__2 : rule__File__Group__2__Impl rule__File__Group__3 ;
    public final void rule__File__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5067:1: ( rule__File__Group__2__Impl rule__File__Group__3 )
            // InternalDsl.g:5068:2: rule__File__Group__2__Impl rule__File__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__File__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__File__Group__3();

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
    // $ANTLR end "rule__File__Group__2"


    // $ANTLR start "rule__File__Group__2__Impl"
    // InternalDsl.g:5075:1: rule__File__Group__2__Impl : ( ( rule__File__PathAssignment_2 ) ) ;
    public final void rule__File__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5079:1: ( ( ( rule__File__PathAssignment_2 ) ) )
            // InternalDsl.g:5080:1: ( ( rule__File__PathAssignment_2 ) )
            {
            // InternalDsl.g:5080:1: ( ( rule__File__PathAssignment_2 ) )
            // InternalDsl.g:5081:2: ( rule__File__PathAssignment_2 )
            {
             before(grammarAccess.getFileAccess().getPathAssignment_2()); 
            // InternalDsl.g:5082:2: ( rule__File__PathAssignment_2 )
            // InternalDsl.g:5082:3: rule__File__PathAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__File__PathAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFileAccess().getPathAssignment_2()); 

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
    // $ANTLR end "rule__File__Group__2__Impl"


    // $ANTLR start "rule__File__Group__3"
    // InternalDsl.g:5090:1: rule__File__Group__3 : rule__File__Group__3__Impl ;
    public final void rule__File__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5094:1: ( rule__File__Group__3__Impl )
            // InternalDsl.g:5095:2: rule__File__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__File__Group__3__Impl();

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
    // $ANTLR end "rule__File__Group__3"


    // $ANTLR start "rule__File__Group__3__Impl"
    // InternalDsl.g:5101:1: rule__File__Group__3__Impl : ( ')' ) ;
    public final void rule__File__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5105:1: ( ( ')' ) )
            // InternalDsl.g:5106:1: ( ')' )
            {
            // InternalDsl.g:5106:1: ( ')' )
            // InternalDsl.g:5107:2: ')'
            {
             before(grammarAccess.getFileAccess().getRightParenthesisKeyword_3()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getFileAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__File__Group__3__Impl"


    // $ANTLR start "rule__Computer__Group__0"
    // InternalDsl.g:5117:1: rule__Computer__Group__0 : rule__Computer__Group__0__Impl rule__Computer__Group__1 ;
    public final void rule__Computer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5121:1: ( rule__Computer__Group__0__Impl rule__Computer__Group__1 )
            // InternalDsl.g:5122:2: rule__Computer__Group__0__Impl rule__Computer__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Computer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Computer__Group__1();

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
    // $ANTLR end "rule__Computer__Group__0"


    // $ANTLR start "rule__Computer__Group__0__Impl"
    // InternalDsl.g:5129:1: rule__Computer__Group__0__Impl : ( 'Computer' ) ;
    public final void rule__Computer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5133:1: ( ( 'Computer' ) )
            // InternalDsl.g:5134:1: ( 'Computer' )
            {
            // InternalDsl.g:5134:1: ( 'Computer' )
            // InternalDsl.g:5135:2: 'Computer'
            {
             before(grammarAccess.getComputerAccess().getComputerKeyword_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getComputerAccess().getComputerKeyword_0()); 

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
    // $ANTLR end "rule__Computer__Group__0__Impl"


    // $ANTLR start "rule__Computer__Group__1"
    // InternalDsl.g:5144:1: rule__Computer__Group__1 : rule__Computer__Group__1__Impl rule__Computer__Group__2 ;
    public final void rule__Computer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5148:1: ( rule__Computer__Group__1__Impl rule__Computer__Group__2 )
            // InternalDsl.g:5149:2: rule__Computer__Group__1__Impl rule__Computer__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Computer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Computer__Group__2();

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
    // $ANTLR end "rule__Computer__Group__1"


    // $ANTLR start "rule__Computer__Group__1__Impl"
    // InternalDsl.g:5156:1: rule__Computer__Group__1__Impl : ( ( rule__Computer__NameAssignment_1 ) ) ;
    public final void rule__Computer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5160:1: ( ( ( rule__Computer__NameAssignment_1 ) ) )
            // InternalDsl.g:5161:1: ( ( rule__Computer__NameAssignment_1 ) )
            {
            // InternalDsl.g:5161:1: ( ( rule__Computer__NameAssignment_1 ) )
            // InternalDsl.g:5162:2: ( rule__Computer__NameAssignment_1 )
            {
             before(grammarAccess.getComputerAccess().getNameAssignment_1()); 
            // InternalDsl.g:5163:2: ( rule__Computer__NameAssignment_1 )
            // InternalDsl.g:5163:3: rule__Computer__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Computer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComputerAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Computer__Group__1__Impl"


    // $ANTLR start "rule__Computer__Group__2"
    // InternalDsl.g:5171:1: rule__Computer__Group__2 : rule__Computer__Group__2__Impl rule__Computer__Group__3 ;
    public final void rule__Computer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5175:1: ( rule__Computer__Group__2__Impl rule__Computer__Group__3 )
            // InternalDsl.g:5176:2: rule__Computer__Group__2__Impl rule__Computer__Group__3
            {
            pushFollow(FOLLOW_50);
            rule__Computer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Computer__Group__3();

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
    // $ANTLR end "rule__Computer__Group__2"


    // $ANTLR start "rule__Computer__Group__2__Impl"
    // InternalDsl.g:5183:1: rule__Computer__Group__2__Impl : ( '(' ) ;
    public final void rule__Computer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5187:1: ( ( '(' ) )
            // InternalDsl.g:5188:1: ( '(' )
            {
            // InternalDsl.g:5188:1: ( '(' )
            // InternalDsl.g:5189:2: '('
            {
             before(grammarAccess.getComputerAccess().getLeftParenthesisKeyword_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getComputerAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Computer__Group__2__Impl"


    // $ANTLR start "rule__Computer__Group__3"
    // InternalDsl.g:5198:1: rule__Computer__Group__3 : rule__Computer__Group__3__Impl rule__Computer__Group__4 ;
    public final void rule__Computer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5202:1: ( rule__Computer__Group__3__Impl rule__Computer__Group__4 )
            // InternalDsl.g:5203:2: rule__Computer__Group__3__Impl rule__Computer__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__Computer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Computer__Group__4();

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
    // $ANTLR end "rule__Computer__Group__3"


    // $ANTLR start "rule__Computer__Group__3__Impl"
    // InternalDsl.g:5210:1: rule__Computer__Group__3__Impl : ( ( rule__Computer__OsAssignment_3 ) ) ;
    public final void rule__Computer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5214:1: ( ( ( rule__Computer__OsAssignment_3 ) ) )
            // InternalDsl.g:5215:1: ( ( rule__Computer__OsAssignment_3 ) )
            {
            // InternalDsl.g:5215:1: ( ( rule__Computer__OsAssignment_3 ) )
            // InternalDsl.g:5216:2: ( rule__Computer__OsAssignment_3 )
            {
             before(grammarAccess.getComputerAccess().getOsAssignment_3()); 
            // InternalDsl.g:5217:2: ( rule__Computer__OsAssignment_3 )
            // InternalDsl.g:5217:3: rule__Computer__OsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Computer__OsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComputerAccess().getOsAssignment_3()); 

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
    // $ANTLR end "rule__Computer__Group__3__Impl"


    // $ANTLR start "rule__Computer__Group__4"
    // InternalDsl.g:5225:1: rule__Computer__Group__4 : rule__Computer__Group__4__Impl rule__Computer__Group__5 ;
    public final void rule__Computer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5229:1: ( rule__Computer__Group__4__Impl rule__Computer__Group__5 )
            // InternalDsl.g:5230:2: rule__Computer__Group__4__Impl rule__Computer__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__Computer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Computer__Group__5();

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
    // $ANTLR end "rule__Computer__Group__4"


    // $ANTLR start "rule__Computer__Group__4__Impl"
    // InternalDsl.g:5237:1: rule__Computer__Group__4__Impl : ( ',' ) ;
    public final void rule__Computer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5241:1: ( ( ',' ) )
            // InternalDsl.g:5242:1: ( ',' )
            {
            // InternalDsl.g:5242:1: ( ',' )
            // InternalDsl.g:5243:2: ','
            {
             before(grammarAccess.getComputerAccess().getCommaKeyword_4()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getComputerAccess().getCommaKeyword_4()); 

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
    // $ANTLR end "rule__Computer__Group__4__Impl"


    // $ANTLR start "rule__Computer__Group__5"
    // InternalDsl.g:5252:1: rule__Computer__Group__5 : rule__Computer__Group__5__Impl rule__Computer__Group__6 ;
    public final void rule__Computer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5256:1: ( rule__Computer__Group__5__Impl rule__Computer__Group__6 )
            // InternalDsl.g:5257:2: rule__Computer__Group__5__Impl rule__Computer__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__Computer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Computer__Group__6();

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
    // $ANTLR end "rule__Computer__Group__5"


    // $ANTLR start "rule__Computer__Group__5__Impl"
    // InternalDsl.g:5264:1: rule__Computer__Group__5__Impl : ( ( rule__Computer__RamMemoryAssignment_5 ) ) ;
    public final void rule__Computer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5268:1: ( ( ( rule__Computer__RamMemoryAssignment_5 ) ) )
            // InternalDsl.g:5269:1: ( ( rule__Computer__RamMemoryAssignment_5 ) )
            {
            // InternalDsl.g:5269:1: ( ( rule__Computer__RamMemoryAssignment_5 ) )
            // InternalDsl.g:5270:2: ( rule__Computer__RamMemoryAssignment_5 )
            {
             before(grammarAccess.getComputerAccess().getRamMemoryAssignment_5()); 
            // InternalDsl.g:5271:2: ( rule__Computer__RamMemoryAssignment_5 )
            // InternalDsl.g:5271:3: rule__Computer__RamMemoryAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Computer__RamMemoryAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getComputerAccess().getRamMemoryAssignment_5()); 

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
    // $ANTLR end "rule__Computer__Group__5__Impl"


    // $ANTLR start "rule__Computer__Group__6"
    // InternalDsl.g:5279:1: rule__Computer__Group__6 : rule__Computer__Group__6__Impl rule__Computer__Group__7 ;
    public final void rule__Computer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5283:1: ( rule__Computer__Group__6__Impl rule__Computer__Group__7 )
            // InternalDsl.g:5284:2: rule__Computer__Group__6__Impl rule__Computer__Group__7
            {
            pushFollow(FOLLOW_27);
            rule__Computer__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Computer__Group__7();

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
    // $ANTLR end "rule__Computer__Group__6"


    // $ANTLR start "rule__Computer__Group__6__Impl"
    // InternalDsl.g:5291:1: rule__Computer__Group__6__Impl : ( ',' ) ;
    public final void rule__Computer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5295:1: ( ( ',' ) )
            // InternalDsl.g:5296:1: ( ',' )
            {
            // InternalDsl.g:5296:1: ( ',' )
            // InternalDsl.g:5297:2: ','
            {
             before(grammarAccess.getComputerAccess().getCommaKeyword_6()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getComputerAccess().getCommaKeyword_6()); 

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
    // $ANTLR end "rule__Computer__Group__6__Impl"


    // $ANTLR start "rule__Computer__Group__7"
    // InternalDsl.g:5306:1: rule__Computer__Group__7 : rule__Computer__Group__7__Impl rule__Computer__Group__8 ;
    public final void rule__Computer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5310:1: ( rule__Computer__Group__7__Impl rule__Computer__Group__8 )
            // InternalDsl.g:5311:2: rule__Computer__Group__7__Impl rule__Computer__Group__8
            {
            pushFollow(FOLLOW_26);
            rule__Computer__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Computer__Group__8();

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
    // $ANTLR end "rule__Computer__Group__7"


    // $ANTLR start "rule__Computer__Group__7__Impl"
    // InternalDsl.g:5318:1: rule__Computer__Group__7__Impl : ( ( rule__Computer__StorageMemoryAssignment_7 ) ) ;
    public final void rule__Computer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5322:1: ( ( ( rule__Computer__StorageMemoryAssignment_7 ) ) )
            // InternalDsl.g:5323:1: ( ( rule__Computer__StorageMemoryAssignment_7 ) )
            {
            // InternalDsl.g:5323:1: ( ( rule__Computer__StorageMemoryAssignment_7 ) )
            // InternalDsl.g:5324:2: ( rule__Computer__StorageMemoryAssignment_7 )
            {
             before(grammarAccess.getComputerAccess().getStorageMemoryAssignment_7()); 
            // InternalDsl.g:5325:2: ( rule__Computer__StorageMemoryAssignment_7 )
            // InternalDsl.g:5325:3: rule__Computer__StorageMemoryAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Computer__StorageMemoryAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getComputerAccess().getStorageMemoryAssignment_7()); 

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
    // $ANTLR end "rule__Computer__Group__7__Impl"


    // $ANTLR start "rule__Computer__Group__8"
    // InternalDsl.g:5333:1: rule__Computer__Group__8 : rule__Computer__Group__8__Impl rule__Computer__Group__9 ;
    public final void rule__Computer__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5337:1: ( rule__Computer__Group__8__Impl rule__Computer__Group__9 )
            // InternalDsl.g:5338:2: rule__Computer__Group__8__Impl rule__Computer__Group__9
            {
            pushFollow(FOLLOW_27);
            rule__Computer__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Computer__Group__9();

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
    // $ANTLR end "rule__Computer__Group__8"


    // $ANTLR start "rule__Computer__Group__8__Impl"
    // InternalDsl.g:5345:1: rule__Computer__Group__8__Impl : ( ',' ) ;
    public final void rule__Computer__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5349:1: ( ( ',' ) )
            // InternalDsl.g:5350:1: ( ',' )
            {
            // InternalDsl.g:5350:1: ( ',' )
            // InternalDsl.g:5351:2: ','
            {
             before(grammarAccess.getComputerAccess().getCommaKeyword_8()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getComputerAccess().getCommaKeyword_8()); 

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
    // $ANTLR end "rule__Computer__Group__8__Impl"


    // $ANTLR start "rule__Computer__Group__9"
    // InternalDsl.g:5360:1: rule__Computer__Group__9 : rule__Computer__Group__9__Impl rule__Computer__Group__10 ;
    public final void rule__Computer__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5364:1: ( rule__Computer__Group__9__Impl rule__Computer__Group__10 )
            // InternalDsl.g:5365:2: rule__Computer__Group__9__Impl rule__Computer__Group__10
            {
            pushFollow(FOLLOW_51);
            rule__Computer__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Computer__Group__10();

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
    // $ANTLR end "rule__Computer__Group__9"


    // $ANTLR start "rule__Computer__Group__9__Impl"
    // InternalDsl.g:5372:1: rule__Computer__Group__9__Impl : ( ( rule__Computer__CpuNumberAssignment_9 ) ) ;
    public final void rule__Computer__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5376:1: ( ( ( rule__Computer__CpuNumberAssignment_9 ) ) )
            // InternalDsl.g:5377:1: ( ( rule__Computer__CpuNumberAssignment_9 ) )
            {
            // InternalDsl.g:5377:1: ( ( rule__Computer__CpuNumberAssignment_9 ) )
            // InternalDsl.g:5378:2: ( rule__Computer__CpuNumberAssignment_9 )
            {
             before(grammarAccess.getComputerAccess().getCpuNumberAssignment_9()); 
            // InternalDsl.g:5379:2: ( rule__Computer__CpuNumberAssignment_9 )
            // InternalDsl.g:5379:3: rule__Computer__CpuNumberAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Computer__CpuNumberAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getComputerAccess().getCpuNumberAssignment_9()); 

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
    // $ANTLR end "rule__Computer__Group__9__Impl"


    // $ANTLR start "rule__Computer__Group__10"
    // InternalDsl.g:5387:1: rule__Computer__Group__10 : rule__Computer__Group__10__Impl rule__Computer__Group__11 ;
    public final void rule__Computer__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5391:1: ( rule__Computer__Group__10__Impl rule__Computer__Group__11 )
            // InternalDsl.g:5392:2: rule__Computer__Group__10__Impl rule__Computer__Group__11
            {
            pushFollow(FOLLOW_27);
            rule__Computer__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Computer__Group__11();

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
    // $ANTLR end "rule__Computer__Group__10"


    // $ANTLR start "rule__Computer__Group__10__Impl"
    // InternalDsl.g:5399:1: rule__Computer__Group__10__Impl : ( '-' ) ;
    public final void rule__Computer__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5403:1: ( ( '-' ) )
            // InternalDsl.g:5404:1: ( '-' )
            {
            // InternalDsl.g:5404:1: ( '-' )
            // InternalDsl.g:5405:2: '-'
            {
             before(grammarAccess.getComputerAccess().getHyphenMinusKeyword_10()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getComputerAccess().getHyphenMinusKeyword_10()); 

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
    // $ANTLR end "rule__Computer__Group__10__Impl"


    // $ANTLR start "rule__Computer__Group__11"
    // InternalDsl.g:5414:1: rule__Computer__Group__11 : rule__Computer__Group__11__Impl rule__Computer__Group__12 ;
    public final void rule__Computer__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5418:1: ( rule__Computer__Group__11__Impl rule__Computer__Group__12 )
            // InternalDsl.g:5419:2: rule__Computer__Group__11__Impl rule__Computer__Group__12
            {
            pushFollow(FOLLOW_26);
            rule__Computer__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Computer__Group__12();

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
    // $ANTLR end "rule__Computer__Group__11"


    // $ANTLR start "rule__Computer__Group__11__Impl"
    // InternalDsl.g:5426:1: rule__Computer__Group__11__Impl : ( ( rule__Computer__CpuCoresNumberAssignment_11 ) ) ;
    public final void rule__Computer__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5430:1: ( ( ( rule__Computer__CpuCoresNumberAssignment_11 ) ) )
            // InternalDsl.g:5431:1: ( ( rule__Computer__CpuCoresNumberAssignment_11 ) )
            {
            // InternalDsl.g:5431:1: ( ( rule__Computer__CpuCoresNumberAssignment_11 ) )
            // InternalDsl.g:5432:2: ( rule__Computer__CpuCoresNumberAssignment_11 )
            {
             before(grammarAccess.getComputerAccess().getCpuCoresNumberAssignment_11()); 
            // InternalDsl.g:5433:2: ( rule__Computer__CpuCoresNumberAssignment_11 )
            // InternalDsl.g:5433:3: rule__Computer__CpuCoresNumberAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Computer__CpuCoresNumberAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getComputerAccess().getCpuCoresNumberAssignment_11()); 

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
    // $ANTLR end "rule__Computer__Group__11__Impl"


    // $ANTLR start "rule__Computer__Group__12"
    // InternalDsl.g:5441:1: rule__Computer__Group__12 : rule__Computer__Group__12__Impl rule__Computer__Group__13 ;
    public final void rule__Computer__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5445:1: ( rule__Computer__Group__12__Impl rule__Computer__Group__13 )
            // InternalDsl.g:5446:2: rule__Computer__Group__12__Impl rule__Computer__Group__13
            {
            pushFollow(FOLLOW_27);
            rule__Computer__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Computer__Group__13();

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
    // $ANTLR end "rule__Computer__Group__12"


    // $ANTLR start "rule__Computer__Group__12__Impl"
    // InternalDsl.g:5453:1: rule__Computer__Group__12__Impl : ( ',' ) ;
    public final void rule__Computer__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5457:1: ( ( ',' ) )
            // InternalDsl.g:5458:1: ( ',' )
            {
            // InternalDsl.g:5458:1: ( ',' )
            // InternalDsl.g:5459:2: ','
            {
             before(grammarAccess.getComputerAccess().getCommaKeyword_12()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getComputerAccess().getCommaKeyword_12()); 

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
    // $ANTLR end "rule__Computer__Group__12__Impl"


    // $ANTLR start "rule__Computer__Group__13"
    // InternalDsl.g:5468:1: rule__Computer__Group__13 : rule__Computer__Group__13__Impl rule__Computer__Group__14 ;
    public final void rule__Computer__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5472:1: ( rule__Computer__Group__13__Impl rule__Computer__Group__14 )
            // InternalDsl.g:5473:2: rule__Computer__Group__13__Impl rule__Computer__Group__14
            {
            pushFollow(FOLLOW_26);
            rule__Computer__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Computer__Group__14();

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
    // $ANTLR end "rule__Computer__Group__13"


    // $ANTLR start "rule__Computer__Group__13__Impl"
    // InternalDsl.g:5480:1: rule__Computer__Group__13__Impl : ( ( rule__Computer__CpuFrequencyAssignment_13 ) ) ;
    public final void rule__Computer__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5484:1: ( ( ( rule__Computer__CpuFrequencyAssignment_13 ) ) )
            // InternalDsl.g:5485:1: ( ( rule__Computer__CpuFrequencyAssignment_13 ) )
            {
            // InternalDsl.g:5485:1: ( ( rule__Computer__CpuFrequencyAssignment_13 ) )
            // InternalDsl.g:5486:2: ( rule__Computer__CpuFrequencyAssignment_13 )
            {
             before(grammarAccess.getComputerAccess().getCpuFrequencyAssignment_13()); 
            // InternalDsl.g:5487:2: ( rule__Computer__CpuFrequencyAssignment_13 )
            // InternalDsl.g:5487:3: rule__Computer__CpuFrequencyAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Computer__CpuFrequencyAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getComputerAccess().getCpuFrequencyAssignment_13()); 

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
    // $ANTLR end "rule__Computer__Group__13__Impl"


    // $ANTLR start "rule__Computer__Group__14"
    // InternalDsl.g:5495:1: rule__Computer__Group__14 : rule__Computer__Group__14__Impl rule__Computer__Group__15 ;
    public final void rule__Computer__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5499:1: ( rule__Computer__Group__14__Impl rule__Computer__Group__15 )
            // InternalDsl.g:5500:2: rule__Computer__Group__14__Impl rule__Computer__Group__15
            {
            pushFollow(FOLLOW_11);
            rule__Computer__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Computer__Group__15();

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
    // $ANTLR end "rule__Computer__Group__14"


    // $ANTLR start "rule__Computer__Group__14__Impl"
    // InternalDsl.g:5507:1: rule__Computer__Group__14__Impl : ( ',' ) ;
    public final void rule__Computer__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5511:1: ( ( ',' ) )
            // InternalDsl.g:5512:1: ( ',' )
            {
            // InternalDsl.g:5512:1: ( ',' )
            // InternalDsl.g:5513:2: ','
            {
             before(grammarAccess.getComputerAccess().getCommaKeyword_14()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getComputerAccess().getCommaKeyword_14()); 

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
    // $ANTLR end "rule__Computer__Group__14__Impl"


    // $ANTLR start "rule__Computer__Group__15"
    // InternalDsl.g:5522:1: rule__Computer__Group__15 : rule__Computer__Group__15__Impl rule__Computer__Group__16 ;
    public final void rule__Computer__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5526:1: ( rule__Computer__Group__15__Impl rule__Computer__Group__16 )
            // InternalDsl.g:5527:2: rule__Computer__Group__15__Impl rule__Computer__Group__16
            {
            pushFollow(FOLLOW_26);
            rule__Computer__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Computer__Group__16();

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
    // $ANTLR end "rule__Computer__Group__15"


    // $ANTLR start "rule__Computer__Group__15__Impl"
    // InternalDsl.g:5534:1: rule__Computer__Group__15__Impl : ( ( rule__Computer__UsernameAssignment_15 ) ) ;
    public final void rule__Computer__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5538:1: ( ( ( rule__Computer__UsernameAssignment_15 ) ) )
            // InternalDsl.g:5539:1: ( ( rule__Computer__UsernameAssignment_15 ) )
            {
            // InternalDsl.g:5539:1: ( ( rule__Computer__UsernameAssignment_15 ) )
            // InternalDsl.g:5540:2: ( rule__Computer__UsernameAssignment_15 )
            {
             before(grammarAccess.getComputerAccess().getUsernameAssignment_15()); 
            // InternalDsl.g:5541:2: ( rule__Computer__UsernameAssignment_15 )
            // InternalDsl.g:5541:3: rule__Computer__UsernameAssignment_15
            {
            pushFollow(FOLLOW_2);
            rule__Computer__UsernameAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getComputerAccess().getUsernameAssignment_15()); 

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
    // $ANTLR end "rule__Computer__Group__15__Impl"


    // $ANTLR start "rule__Computer__Group__16"
    // InternalDsl.g:5549:1: rule__Computer__Group__16 : rule__Computer__Group__16__Impl rule__Computer__Group__17 ;
    public final void rule__Computer__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5553:1: ( rule__Computer__Group__16__Impl rule__Computer__Group__17 )
            // InternalDsl.g:5554:2: rule__Computer__Group__16__Impl rule__Computer__Group__17
            {
            pushFollow(FOLLOW_11);
            rule__Computer__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Computer__Group__17();

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
    // $ANTLR end "rule__Computer__Group__16"


    // $ANTLR start "rule__Computer__Group__16__Impl"
    // InternalDsl.g:5561:1: rule__Computer__Group__16__Impl : ( ',' ) ;
    public final void rule__Computer__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5565:1: ( ( ',' ) )
            // InternalDsl.g:5566:1: ( ',' )
            {
            // InternalDsl.g:5566:1: ( ',' )
            // InternalDsl.g:5567:2: ','
            {
             before(grammarAccess.getComputerAccess().getCommaKeyword_16()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getComputerAccess().getCommaKeyword_16()); 

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
    // $ANTLR end "rule__Computer__Group__16__Impl"


    // $ANTLR start "rule__Computer__Group__17"
    // InternalDsl.g:5576:1: rule__Computer__Group__17 : rule__Computer__Group__17__Impl rule__Computer__Group__18 ;
    public final void rule__Computer__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5580:1: ( rule__Computer__Group__17__Impl rule__Computer__Group__18 )
            // InternalDsl.g:5581:2: rule__Computer__Group__17__Impl rule__Computer__Group__18
            {
            pushFollow(FOLLOW_28);
            rule__Computer__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Computer__Group__18();

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
    // $ANTLR end "rule__Computer__Group__17"


    // $ANTLR start "rule__Computer__Group__17__Impl"
    // InternalDsl.g:5588:1: rule__Computer__Group__17__Impl : ( ( rule__Computer__PasswordAssignment_17 ) ) ;
    public final void rule__Computer__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5592:1: ( ( ( rule__Computer__PasswordAssignment_17 ) ) )
            // InternalDsl.g:5593:1: ( ( rule__Computer__PasswordAssignment_17 ) )
            {
            // InternalDsl.g:5593:1: ( ( rule__Computer__PasswordAssignment_17 ) )
            // InternalDsl.g:5594:2: ( rule__Computer__PasswordAssignment_17 )
            {
             before(grammarAccess.getComputerAccess().getPasswordAssignment_17()); 
            // InternalDsl.g:5595:2: ( rule__Computer__PasswordAssignment_17 )
            // InternalDsl.g:5595:3: rule__Computer__PasswordAssignment_17
            {
            pushFollow(FOLLOW_2);
            rule__Computer__PasswordAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getComputerAccess().getPasswordAssignment_17()); 

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
    // $ANTLR end "rule__Computer__Group__17__Impl"


    // $ANTLR start "rule__Computer__Group__18"
    // InternalDsl.g:5603:1: rule__Computer__Group__18 : rule__Computer__Group__18__Impl rule__Computer__Group__19 ;
    public final void rule__Computer__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5607:1: ( rule__Computer__Group__18__Impl rule__Computer__Group__19 )
            // InternalDsl.g:5608:2: rule__Computer__Group__18__Impl rule__Computer__Group__19
            {
            pushFollow(FOLLOW_5);
            rule__Computer__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Computer__Group__19();

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
    // $ANTLR end "rule__Computer__Group__18"


    // $ANTLR start "rule__Computer__Group__18__Impl"
    // InternalDsl.g:5615:1: rule__Computer__Group__18__Impl : ( ')' ) ;
    public final void rule__Computer__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5619:1: ( ( ')' ) )
            // InternalDsl.g:5620:1: ( ')' )
            {
            // InternalDsl.g:5620:1: ( ')' )
            // InternalDsl.g:5621:2: ')'
            {
             before(grammarAccess.getComputerAccess().getRightParenthesisKeyword_18()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getComputerAccess().getRightParenthesisKeyword_18()); 

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
    // $ANTLR end "rule__Computer__Group__18__Impl"


    // $ANTLR start "rule__Computer__Group__19"
    // InternalDsl.g:5630:1: rule__Computer__Group__19 : rule__Computer__Group__19__Impl rule__Computer__Group__20 ;
    public final void rule__Computer__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5634:1: ( rule__Computer__Group__19__Impl rule__Computer__Group__20 )
            // InternalDsl.g:5635:2: rule__Computer__Group__19__Impl rule__Computer__Group__20
            {
            pushFollow(FOLLOW_52);
            rule__Computer__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Computer__Group__20();

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
    // $ANTLR end "rule__Computer__Group__19"


    // $ANTLR start "rule__Computer__Group__19__Impl"
    // InternalDsl.g:5642:1: rule__Computer__Group__19__Impl : ( '{' ) ;
    public final void rule__Computer__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5646:1: ( ( '{' ) )
            // InternalDsl.g:5647:1: ( '{' )
            {
            // InternalDsl.g:5647:1: ( '{' )
            // InternalDsl.g:5648:2: '{'
            {
             before(grammarAccess.getComputerAccess().getLeftCurlyBracketKeyword_19()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getComputerAccess().getLeftCurlyBracketKeyword_19()); 

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
    // $ANTLR end "rule__Computer__Group__19__Impl"


    // $ANTLR start "rule__Computer__Group__20"
    // InternalDsl.g:5657:1: rule__Computer__Group__20 : rule__Computer__Group__20__Impl rule__Computer__Group__21 ;
    public final void rule__Computer__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5661:1: ( rule__Computer__Group__20__Impl rule__Computer__Group__21 )
            // InternalDsl.g:5662:2: rule__Computer__Group__20__Impl rule__Computer__Group__21
            {
            pushFollow(FOLLOW_11);
            rule__Computer__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Computer__Group__21();

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
    // $ANTLR end "rule__Computer__Group__20"


    // $ANTLR start "rule__Computer__Group__20__Impl"
    // InternalDsl.g:5669:1: rule__Computer__Group__20__Impl : ( 'networkInterfaces' ) ;
    public final void rule__Computer__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5673:1: ( ( 'networkInterfaces' ) )
            // InternalDsl.g:5674:1: ( 'networkInterfaces' )
            {
            // InternalDsl.g:5674:1: ( 'networkInterfaces' )
            // InternalDsl.g:5675:2: 'networkInterfaces'
            {
             before(grammarAccess.getComputerAccess().getNetworkInterfacesKeyword_20()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getComputerAccess().getNetworkInterfacesKeyword_20()); 

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
    // $ANTLR end "rule__Computer__Group__20__Impl"


    // $ANTLR start "rule__Computer__Group__21"
    // InternalDsl.g:5684:1: rule__Computer__Group__21 : rule__Computer__Group__21__Impl rule__Computer__Group__22 ;
    public final void rule__Computer__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5688:1: ( rule__Computer__Group__21__Impl rule__Computer__Group__22 )
            // InternalDsl.g:5689:2: rule__Computer__Group__21__Impl rule__Computer__Group__22
            {
            pushFollow(FOLLOW_53);
            rule__Computer__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Computer__Group__22();

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
    // $ANTLR end "rule__Computer__Group__21"


    // $ANTLR start "rule__Computer__Group__21__Impl"
    // InternalDsl.g:5696:1: rule__Computer__Group__21__Impl : ( ( rule__Computer__ComputerNetworkInterfacesAssignment_21 ) ) ;
    public final void rule__Computer__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5700:1: ( ( ( rule__Computer__ComputerNetworkInterfacesAssignment_21 ) ) )
            // InternalDsl.g:5701:1: ( ( rule__Computer__ComputerNetworkInterfacesAssignment_21 ) )
            {
            // InternalDsl.g:5701:1: ( ( rule__Computer__ComputerNetworkInterfacesAssignment_21 ) )
            // InternalDsl.g:5702:2: ( rule__Computer__ComputerNetworkInterfacesAssignment_21 )
            {
             before(grammarAccess.getComputerAccess().getComputerNetworkInterfacesAssignment_21()); 
            // InternalDsl.g:5703:2: ( rule__Computer__ComputerNetworkInterfacesAssignment_21 )
            // InternalDsl.g:5703:3: rule__Computer__ComputerNetworkInterfacesAssignment_21
            {
            pushFollow(FOLLOW_2);
            rule__Computer__ComputerNetworkInterfacesAssignment_21();

            state._fsp--;


            }

             after(grammarAccess.getComputerAccess().getComputerNetworkInterfacesAssignment_21()); 

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
    // $ANTLR end "rule__Computer__Group__21__Impl"


    // $ANTLR start "rule__Computer__Group__22"
    // InternalDsl.g:5711:1: rule__Computer__Group__22 : rule__Computer__Group__22__Impl rule__Computer__Group__23 ;
    public final void rule__Computer__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5715:1: ( rule__Computer__Group__22__Impl rule__Computer__Group__23 )
            // InternalDsl.g:5716:2: rule__Computer__Group__22__Impl rule__Computer__Group__23
            {
            pushFollow(FOLLOW_53);
            rule__Computer__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Computer__Group__23();

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
    // $ANTLR end "rule__Computer__Group__22"


    // $ANTLR start "rule__Computer__Group__22__Impl"
    // InternalDsl.g:5723:1: rule__Computer__Group__22__Impl : ( ( rule__Computer__ComputerNetworkInterfacesAssignment_22 )* ) ;
    public final void rule__Computer__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5727:1: ( ( ( rule__Computer__ComputerNetworkInterfacesAssignment_22 )* ) )
            // InternalDsl.g:5728:1: ( ( rule__Computer__ComputerNetworkInterfacesAssignment_22 )* )
            {
            // InternalDsl.g:5728:1: ( ( rule__Computer__ComputerNetworkInterfacesAssignment_22 )* )
            // InternalDsl.g:5729:2: ( rule__Computer__ComputerNetworkInterfacesAssignment_22 )*
            {
             before(grammarAccess.getComputerAccess().getComputerNetworkInterfacesAssignment_22()); 
            // InternalDsl.g:5730:2: ( rule__Computer__ComputerNetworkInterfacesAssignment_22 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDsl.g:5730:3: rule__Computer__ComputerNetworkInterfacesAssignment_22
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Computer__ComputerNetworkInterfacesAssignment_22();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getComputerAccess().getComputerNetworkInterfacesAssignment_22()); 

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
    // $ANTLR end "rule__Computer__Group__22__Impl"


    // $ANTLR start "rule__Computer__Group__23"
    // InternalDsl.g:5738:1: rule__Computer__Group__23 : rule__Computer__Group__23__Impl rule__Computer__Group__24 ;
    public final void rule__Computer__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5742:1: ( rule__Computer__Group__23__Impl rule__Computer__Group__24 )
            // InternalDsl.g:5743:2: rule__Computer__Group__23__Impl rule__Computer__Group__24
            {
            pushFollow(FOLLOW_54);
            rule__Computer__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Computer__Group__24();

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
    // $ANTLR end "rule__Computer__Group__23"


    // $ANTLR start "rule__Computer__Group__23__Impl"
    // InternalDsl.g:5750:1: rule__Computer__Group__23__Impl : ( ';' ) ;
    public final void rule__Computer__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5754:1: ( ( ';' ) )
            // InternalDsl.g:5755:1: ( ';' )
            {
            // InternalDsl.g:5755:1: ( ';' )
            // InternalDsl.g:5756:2: ';'
            {
             before(grammarAccess.getComputerAccess().getSemicolonKeyword_23()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getComputerAccess().getSemicolonKeyword_23()); 

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
    // $ANTLR end "rule__Computer__Group__23__Impl"


    // $ANTLR start "rule__Computer__Group__24"
    // InternalDsl.g:5765:1: rule__Computer__Group__24 : rule__Computer__Group__24__Impl rule__Computer__Group__25 ;
    public final void rule__Computer__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5769:1: ( rule__Computer__Group__24__Impl rule__Computer__Group__25 )
            // InternalDsl.g:5770:2: rule__Computer__Group__24__Impl rule__Computer__Group__25
            {
            pushFollow(FOLLOW_54);
            rule__Computer__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Computer__Group__25();

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
    // $ANTLR end "rule__Computer__Group__24"


    // $ANTLR start "rule__Computer__Group__24__Impl"
    // InternalDsl.g:5777:1: rule__Computer__Group__24__Impl : ( ( rule__Computer__Group_24__0 )? ) ;
    public final void rule__Computer__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5781:1: ( ( ( rule__Computer__Group_24__0 )? ) )
            // InternalDsl.g:5782:1: ( ( rule__Computer__Group_24__0 )? )
            {
            // InternalDsl.g:5782:1: ( ( rule__Computer__Group_24__0 )? )
            // InternalDsl.g:5783:2: ( rule__Computer__Group_24__0 )?
            {
             before(grammarAccess.getComputerAccess().getGroup_24()); 
            // InternalDsl.g:5784:2: ( rule__Computer__Group_24__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_ID)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDsl.g:5784:3: rule__Computer__Group_24__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Computer__Group_24__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComputerAccess().getGroup_24()); 

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
    // $ANTLR end "rule__Computer__Group__24__Impl"


    // $ANTLR start "rule__Computer__Group__25"
    // InternalDsl.g:5792:1: rule__Computer__Group__25 : rule__Computer__Group__25__Impl rule__Computer__Group__26 ;
    public final void rule__Computer__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5796:1: ( rule__Computer__Group__25__Impl rule__Computer__Group__26 )
            // InternalDsl.g:5797:2: rule__Computer__Group__25__Impl rule__Computer__Group__26
            {
            pushFollow(FOLLOW_54);
            rule__Computer__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Computer__Group__26();

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
    // $ANTLR end "rule__Computer__Group__25"


    // $ANTLR start "rule__Computer__Group__25__Impl"
    // InternalDsl.g:5804:1: rule__Computer__Group__25__Impl : ( ( rule__Computer__Group_25__0 )? ) ;
    public final void rule__Computer__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5808:1: ( ( ( rule__Computer__Group_25__0 )? ) )
            // InternalDsl.g:5809:1: ( ( rule__Computer__Group_25__0 )? )
            {
            // InternalDsl.g:5809:1: ( ( rule__Computer__Group_25__0 )? )
            // InternalDsl.g:5810:2: ( rule__Computer__Group_25__0 )?
            {
             before(grammarAccess.getComputerAccess().getGroup_25()); 
            // InternalDsl.g:5811:2: ( rule__Computer__Group_25__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==65) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDsl.g:5811:3: rule__Computer__Group_25__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Computer__Group_25__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComputerAccess().getGroup_25()); 

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
    // $ANTLR end "rule__Computer__Group__25__Impl"


    // $ANTLR start "rule__Computer__Group__26"
    // InternalDsl.g:5819:1: rule__Computer__Group__26 : rule__Computer__Group__26__Impl ;
    public final void rule__Computer__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5823:1: ( rule__Computer__Group__26__Impl )
            // InternalDsl.g:5824:2: rule__Computer__Group__26__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Computer__Group__26__Impl();

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
    // $ANTLR end "rule__Computer__Group__26"


    // $ANTLR start "rule__Computer__Group__26__Impl"
    // InternalDsl.g:5830:1: rule__Computer__Group__26__Impl : ( '}' ) ;
    public final void rule__Computer__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5834:1: ( ( '}' ) )
            // InternalDsl.g:5835:1: ( '}' )
            {
            // InternalDsl.g:5835:1: ( '}' )
            // InternalDsl.g:5836:2: '}'
            {
             before(grammarAccess.getComputerAccess().getRightCurlyBracketKeyword_26()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getComputerAccess().getRightCurlyBracketKeyword_26()); 

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
    // $ANTLR end "rule__Computer__Group__26__Impl"


    // $ANTLR start "rule__Computer__Group_24__0"
    // InternalDsl.g:5846:1: rule__Computer__Group_24__0 : rule__Computer__Group_24__0__Impl rule__Computer__Group_24__1 ;
    public final void rule__Computer__Group_24__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5850:1: ( rule__Computer__Group_24__0__Impl rule__Computer__Group_24__1 )
            // InternalDsl.g:5851:2: rule__Computer__Group_24__0__Impl rule__Computer__Group_24__1
            {
            pushFollow(FOLLOW_7);
            rule__Computer__Group_24__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Computer__Group_24__1();

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
    // $ANTLR end "rule__Computer__Group_24__0"


    // $ANTLR start "rule__Computer__Group_24__0__Impl"
    // InternalDsl.g:5858:1: rule__Computer__Group_24__0__Impl : ( ( rule__Computer__ComputerServicesAssignment_24_0 ) ) ;
    public final void rule__Computer__Group_24__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5862:1: ( ( ( rule__Computer__ComputerServicesAssignment_24_0 ) ) )
            // InternalDsl.g:5863:1: ( ( rule__Computer__ComputerServicesAssignment_24_0 ) )
            {
            // InternalDsl.g:5863:1: ( ( rule__Computer__ComputerServicesAssignment_24_0 ) )
            // InternalDsl.g:5864:2: ( rule__Computer__ComputerServicesAssignment_24_0 )
            {
             before(grammarAccess.getComputerAccess().getComputerServicesAssignment_24_0()); 
            // InternalDsl.g:5865:2: ( rule__Computer__ComputerServicesAssignment_24_0 )
            // InternalDsl.g:5865:3: rule__Computer__ComputerServicesAssignment_24_0
            {
            pushFollow(FOLLOW_2);
            rule__Computer__ComputerServicesAssignment_24_0();

            state._fsp--;


            }

             after(grammarAccess.getComputerAccess().getComputerServicesAssignment_24_0()); 

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
    // $ANTLR end "rule__Computer__Group_24__0__Impl"


    // $ANTLR start "rule__Computer__Group_24__1"
    // InternalDsl.g:5873:1: rule__Computer__Group_24__1 : rule__Computer__Group_24__1__Impl rule__Computer__Group_24__2 ;
    public final void rule__Computer__Group_24__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5877:1: ( rule__Computer__Group_24__1__Impl rule__Computer__Group_24__2 )
            // InternalDsl.g:5878:2: rule__Computer__Group_24__1__Impl rule__Computer__Group_24__2
            {
            pushFollow(FOLLOW_11);
            rule__Computer__Group_24__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Computer__Group_24__2();

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
    // $ANTLR end "rule__Computer__Group_24__1"


    // $ANTLR start "rule__Computer__Group_24__1__Impl"
    // InternalDsl.g:5885:1: rule__Computer__Group_24__1__Impl : ( ';' ) ;
    public final void rule__Computer__Group_24__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5889:1: ( ( ';' ) )
            // InternalDsl.g:5890:1: ( ';' )
            {
            // InternalDsl.g:5890:1: ( ';' )
            // InternalDsl.g:5891:2: ';'
            {
             before(grammarAccess.getComputerAccess().getSemicolonKeyword_24_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getComputerAccess().getSemicolonKeyword_24_1()); 

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
    // $ANTLR end "rule__Computer__Group_24__1__Impl"


    // $ANTLR start "rule__Computer__Group_24__2"
    // InternalDsl.g:5900:1: rule__Computer__Group_24__2 : rule__Computer__Group_24__2__Impl ;
    public final void rule__Computer__Group_24__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5904:1: ( rule__Computer__Group_24__2__Impl )
            // InternalDsl.g:5905:2: rule__Computer__Group_24__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Computer__Group_24__2__Impl();

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
    // $ANTLR end "rule__Computer__Group_24__2"


    // $ANTLR start "rule__Computer__Group_24__2__Impl"
    // InternalDsl.g:5911:1: rule__Computer__Group_24__2__Impl : ( ( rule__Computer__Group_24_2__0 )* ) ;
    public final void rule__Computer__Group_24__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5915:1: ( ( ( rule__Computer__Group_24_2__0 )* ) )
            // InternalDsl.g:5916:1: ( ( rule__Computer__Group_24_2__0 )* )
            {
            // InternalDsl.g:5916:1: ( ( rule__Computer__Group_24_2__0 )* )
            // InternalDsl.g:5917:2: ( rule__Computer__Group_24_2__0 )*
            {
             before(grammarAccess.getComputerAccess().getGroup_24_2()); 
            // InternalDsl.g:5918:2: ( rule__Computer__Group_24_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_ID)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalDsl.g:5918:3: rule__Computer__Group_24_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Computer__Group_24_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getComputerAccess().getGroup_24_2()); 

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
    // $ANTLR end "rule__Computer__Group_24__2__Impl"


    // $ANTLR start "rule__Computer__Group_24_2__0"
    // InternalDsl.g:5927:1: rule__Computer__Group_24_2__0 : rule__Computer__Group_24_2__0__Impl rule__Computer__Group_24_2__1 ;
    public final void rule__Computer__Group_24_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5931:1: ( rule__Computer__Group_24_2__0__Impl rule__Computer__Group_24_2__1 )
            // InternalDsl.g:5932:2: rule__Computer__Group_24_2__0__Impl rule__Computer__Group_24_2__1
            {
            pushFollow(FOLLOW_7);
            rule__Computer__Group_24_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Computer__Group_24_2__1();

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
    // $ANTLR end "rule__Computer__Group_24_2__0"


    // $ANTLR start "rule__Computer__Group_24_2__0__Impl"
    // InternalDsl.g:5939:1: rule__Computer__Group_24_2__0__Impl : ( ( rule__Computer__ComputerServicesAssignment_24_2_0 ) ) ;
    public final void rule__Computer__Group_24_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5943:1: ( ( ( rule__Computer__ComputerServicesAssignment_24_2_0 ) ) )
            // InternalDsl.g:5944:1: ( ( rule__Computer__ComputerServicesAssignment_24_2_0 ) )
            {
            // InternalDsl.g:5944:1: ( ( rule__Computer__ComputerServicesAssignment_24_2_0 ) )
            // InternalDsl.g:5945:2: ( rule__Computer__ComputerServicesAssignment_24_2_0 )
            {
             before(grammarAccess.getComputerAccess().getComputerServicesAssignment_24_2_0()); 
            // InternalDsl.g:5946:2: ( rule__Computer__ComputerServicesAssignment_24_2_0 )
            // InternalDsl.g:5946:3: rule__Computer__ComputerServicesAssignment_24_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Computer__ComputerServicesAssignment_24_2_0();

            state._fsp--;


            }

             after(grammarAccess.getComputerAccess().getComputerServicesAssignment_24_2_0()); 

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
    // $ANTLR end "rule__Computer__Group_24_2__0__Impl"


    // $ANTLR start "rule__Computer__Group_24_2__1"
    // InternalDsl.g:5954:1: rule__Computer__Group_24_2__1 : rule__Computer__Group_24_2__1__Impl ;
    public final void rule__Computer__Group_24_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5958:1: ( rule__Computer__Group_24_2__1__Impl )
            // InternalDsl.g:5959:2: rule__Computer__Group_24_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Computer__Group_24_2__1__Impl();

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
    // $ANTLR end "rule__Computer__Group_24_2__1"


    // $ANTLR start "rule__Computer__Group_24_2__1__Impl"
    // InternalDsl.g:5965:1: rule__Computer__Group_24_2__1__Impl : ( ';' ) ;
    public final void rule__Computer__Group_24_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5969:1: ( ( ';' ) )
            // InternalDsl.g:5970:1: ( ';' )
            {
            // InternalDsl.g:5970:1: ( ';' )
            // InternalDsl.g:5971:2: ';'
            {
             before(grammarAccess.getComputerAccess().getSemicolonKeyword_24_2_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getComputerAccess().getSemicolonKeyword_24_2_1()); 

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
    // $ANTLR end "rule__Computer__Group_24_2__1__Impl"


    // $ANTLR start "rule__Computer__Group_25__0"
    // InternalDsl.g:5981:1: rule__Computer__Group_25__0 : rule__Computer__Group_25__0__Impl rule__Computer__Group_25__1 ;
    public final void rule__Computer__Group_25__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5985:1: ( rule__Computer__Group_25__0__Impl rule__Computer__Group_25__1 )
            // InternalDsl.g:5986:2: rule__Computer__Group_25__0__Impl rule__Computer__Group_25__1
            {
            pushFollow(FOLLOW_7);
            rule__Computer__Group_25__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Computer__Group_25__1();

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
    // $ANTLR end "rule__Computer__Group_25__0"


    // $ANTLR start "rule__Computer__Group_25__0__Impl"
    // InternalDsl.g:5993:1: rule__Computer__Group_25__0__Impl : ( ( rule__Computer__DeploymentAssignment_25_0 ) ) ;
    public final void rule__Computer__Group_25__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5997:1: ( ( ( rule__Computer__DeploymentAssignment_25_0 ) ) )
            // InternalDsl.g:5998:1: ( ( rule__Computer__DeploymentAssignment_25_0 ) )
            {
            // InternalDsl.g:5998:1: ( ( rule__Computer__DeploymentAssignment_25_0 ) )
            // InternalDsl.g:5999:2: ( rule__Computer__DeploymentAssignment_25_0 )
            {
             before(grammarAccess.getComputerAccess().getDeploymentAssignment_25_0()); 
            // InternalDsl.g:6000:2: ( rule__Computer__DeploymentAssignment_25_0 )
            // InternalDsl.g:6000:3: rule__Computer__DeploymentAssignment_25_0
            {
            pushFollow(FOLLOW_2);
            rule__Computer__DeploymentAssignment_25_0();

            state._fsp--;


            }

             after(grammarAccess.getComputerAccess().getDeploymentAssignment_25_0()); 

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
    // $ANTLR end "rule__Computer__Group_25__0__Impl"


    // $ANTLR start "rule__Computer__Group_25__1"
    // InternalDsl.g:6008:1: rule__Computer__Group_25__1 : rule__Computer__Group_25__1__Impl ;
    public final void rule__Computer__Group_25__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6012:1: ( rule__Computer__Group_25__1__Impl )
            // InternalDsl.g:6013:2: rule__Computer__Group_25__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Computer__Group_25__1__Impl();

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
    // $ANTLR end "rule__Computer__Group_25__1"


    // $ANTLR start "rule__Computer__Group_25__1__Impl"
    // InternalDsl.g:6019:1: rule__Computer__Group_25__1__Impl : ( ';' ) ;
    public final void rule__Computer__Group_25__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6023:1: ( ( ';' ) )
            // InternalDsl.g:6024:1: ( ';' )
            {
            // InternalDsl.g:6024:1: ( ';' )
            // InternalDsl.g:6025:2: ';'
            {
             before(grammarAccess.getComputerAccess().getSemicolonKeyword_25_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getComputerAccess().getSemicolonKeyword_25_1()); 

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
    // $ANTLR end "rule__Computer__Group_25__1__Impl"


    // $ANTLR start "rule__DockerDeployment__Group__0"
    // InternalDsl.g:6035:1: rule__DockerDeployment__Group__0 : rule__DockerDeployment__Group__0__Impl rule__DockerDeployment__Group__1 ;
    public final void rule__DockerDeployment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6039:1: ( rule__DockerDeployment__Group__0__Impl rule__DockerDeployment__Group__1 )
            // InternalDsl.g:6040:2: rule__DockerDeployment__Group__0__Impl rule__DockerDeployment__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__DockerDeployment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DockerDeployment__Group__1();

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
    // $ANTLR end "rule__DockerDeployment__Group__0"


    // $ANTLR start "rule__DockerDeployment__Group__0__Impl"
    // InternalDsl.g:6047:1: rule__DockerDeployment__Group__0__Impl : ( 'Docker' ) ;
    public final void rule__DockerDeployment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6051:1: ( ( 'Docker' ) )
            // InternalDsl.g:6052:1: ( 'Docker' )
            {
            // InternalDsl.g:6052:1: ( 'Docker' )
            // InternalDsl.g:6053:2: 'Docker'
            {
             before(grammarAccess.getDockerDeploymentAccess().getDockerKeyword_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getDockerDeploymentAccess().getDockerKeyword_0()); 

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
    // $ANTLR end "rule__DockerDeployment__Group__0__Impl"


    // $ANTLR start "rule__DockerDeployment__Group__1"
    // InternalDsl.g:6062:1: rule__DockerDeployment__Group__1 : rule__DockerDeployment__Group__1__Impl rule__DockerDeployment__Group__2 ;
    public final void rule__DockerDeployment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6066:1: ( rule__DockerDeployment__Group__1__Impl rule__DockerDeployment__Group__2 )
            // InternalDsl.g:6067:2: rule__DockerDeployment__Group__1__Impl rule__DockerDeployment__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__DockerDeployment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DockerDeployment__Group__2();

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
    // $ANTLR end "rule__DockerDeployment__Group__1"


    // $ANTLR start "rule__DockerDeployment__Group__1__Impl"
    // InternalDsl.g:6074:1: rule__DockerDeployment__Group__1__Impl : ( ( rule__DockerDeployment__NameAssignment_1 ) ) ;
    public final void rule__DockerDeployment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6078:1: ( ( ( rule__DockerDeployment__NameAssignment_1 ) ) )
            // InternalDsl.g:6079:1: ( ( rule__DockerDeployment__NameAssignment_1 ) )
            {
            // InternalDsl.g:6079:1: ( ( rule__DockerDeployment__NameAssignment_1 ) )
            // InternalDsl.g:6080:2: ( rule__DockerDeployment__NameAssignment_1 )
            {
             before(grammarAccess.getDockerDeploymentAccess().getNameAssignment_1()); 
            // InternalDsl.g:6081:2: ( rule__DockerDeployment__NameAssignment_1 )
            // InternalDsl.g:6081:3: rule__DockerDeployment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DockerDeployment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDockerDeploymentAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DockerDeployment__Group__1__Impl"


    // $ANTLR start "rule__DockerDeployment__Group__2"
    // InternalDsl.g:6089:1: rule__DockerDeployment__Group__2 : rule__DockerDeployment__Group__2__Impl rule__DockerDeployment__Group__3 ;
    public final void rule__DockerDeployment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6093:1: ( rule__DockerDeployment__Group__2__Impl rule__DockerDeployment__Group__3 )
            // InternalDsl.g:6094:2: rule__DockerDeployment__Group__2__Impl rule__DockerDeployment__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__DockerDeployment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DockerDeployment__Group__3();

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
    // $ANTLR end "rule__DockerDeployment__Group__2"


    // $ANTLR start "rule__DockerDeployment__Group__2__Impl"
    // InternalDsl.g:6101:1: rule__DockerDeployment__Group__2__Impl : ( '(' ) ;
    public final void rule__DockerDeployment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6105:1: ( ( '(' ) )
            // InternalDsl.g:6106:1: ( '(' )
            {
            // InternalDsl.g:6106:1: ( '(' )
            // InternalDsl.g:6107:2: '('
            {
             before(grammarAccess.getDockerDeploymentAccess().getLeftParenthesisKeyword_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getDockerDeploymentAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__DockerDeployment__Group__2__Impl"


    // $ANTLR start "rule__DockerDeployment__Group__3"
    // InternalDsl.g:6116:1: rule__DockerDeployment__Group__3 : rule__DockerDeployment__Group__3__Impl rule__DockerDeployment__Group__4 ;
    public final void rule__DockerDeployment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6120:1: ( rule__DockerDeployment__Group__3__Impl rule__DockerDeployment__Group__4 )
            // InternalDsl.g:6121:2: rule__DockerDeployment__Group__3__Impl rule__DockerDeployment__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__DockerDeployment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DockerDeployment__Group__4();

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
    // $ANTLR end "rule__DockerDeployment__Group__3"


    // $ANTLR start "rule__DockerDeployment__Group__3__Impl"
    // InternalDsl.g:6128:1: rule__DockerDeployment__Group__3__Impl : ( ( rule__DockerDeployment__DirectoryAssignment_3 ) ) ;
    public final void rule__DockerDeployment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6132:1: ( ( ( rule__DockerDeployment__DirectoryAssignment_3 ) ) )
            // InternalDsl.g:6133:1: ( ( rule__DockerDeployment__DirectoryAssignment_3 ) )
            {
            // InternalDsl.g:6133:1: ( ( rule__DockerDeployment__DirectoryAssignment_3 ) )
            // InternalDsl.g:6134:2: ( rule__DockerDeployment__DirectoryAssignment_3 )
            {
             before(grammarAccess.getDockerDeploymentAccess().getDirectoryAssignment_3()); 
            // InternalDsl.g:6135:2: ( rule__DockerDeployment__DirectoryAssignment_3 )
            // InternalDsl.g:6135:3: rule__DockerDeployment__DirectoryAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DockerDeployment__DirectoryAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDockerDeploymentAccess().getDirectoryAssignment_3()); 

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
    // $ANTLR end "rule__DockerDeployment__Group__3__Impl"


    // $ANTLR start "rule__DockerDeployment__Group__4"
    // InternalDsl.g:6143:1: rule__DockerDeployment__Group__4 : rule__DockerDeployment__Group__4__Impl rule__DockerDeployment__Group__5 ;
    public final void rule__DockerDeployment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6147:1: ( rule__DockerDeployment__Group__4__Impl rule__DockerDeployment__Group__5 )
            // InternalDsl.g:6148:2: rule__DockerDeployment__Group__4__Impl rule__DockerDeployment__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__DockerDeployment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DockerDeployment__Group__5();

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
    // $ANTLR end "rule__DockerDeployment__Group__4"


    // $ANTLR start "rule__DockerDeployment__Group__4__Impl"
    // InternalDsl.g:6155:1: rule__DockerDeployment__Group__4__Impl : ( ')' ) ;
    public final void rule__DockerDeployment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6159:1: ( ( ')' ) )
            // InternalDsl.g:6160:1: ( ')' )
            {
            // InternalDsl.g:6160:1: ( ')' )
            // InternalDsl.g:6161:2: ')'
            {
             before(grammarAccess.getDockerDeploymentAccess().getRightParenthesisKeyword_4()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getDockerDeploymentAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__DockerDeployment__Group__4__Impl"


    // $ANTLR start "rule__DockerDeployment__Group__5"
    // InternalDsl.g:6170:1: rule__DockerDeployment__Group__5 : rule__DockerDeployment__Group__5__Impl rule__DockerDeployment__Group__6 ;
    public final void rule__DockerDeployment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6174:1: ( rule__DockerDeployment__Group__5__Impl rule__DockerDeployment__Group__6 )
            // InternalDsl.g:6175:2: rule__DockerDeployment__Group__5__Impl rule__DockerDeployment__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__DockerDeployment__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DockerDeployment__Group__6();

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
    // $ANTLR end "rule__DockerDeployment__Group__5"


    // $ANTLR start "rule__DockerDeployment__Group__5__Impl"
    // InternalDsl.g:6182:1: rule__DockerDeployment__Group__5__Impl : ( '{' ) ;
    public final void rule__DockerDeployment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6186:1: ( ( '{' ) )
            // InternalDsl.g:6187:1: ( '{' )
            {
            // InternalDsl.g:6187:1: ( '{' )
            // InternalDsl.g:6188:2: '{'
            {
             before(grammarAccess.getDockerDeploymentAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDockerDeploymentAccess().getLeftCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__DockerDeployment__Group__5__Impl"


    // $ANTLR start "rule__DockerDeployment__Group__6"
    // InternalDsl.g:6197:1: rule__DockerDeployment__Group__6 : rule__DockerDeployment__Group__6__Impl rule__DockerDeployment__Group__7 ;
    public final void rule__DockerDeployment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6201:1: ( rule__DockerDeployment__Group__6__Impl rule__DockerDeployment__Group__7 )
            // InternalDsl.g:6202:2: rule__DockerDeployment__Group__6__Impl rule__DockerDeployment__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__DockerDeployment__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DockerDeployment__Group__7();

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
    // $ANTLR end "rule__DockerDeployment__Group__6"


    // $ANTLR start "rule__DockerDeployment__Group__6__Impl"
    // InternalDsl.g:6209:1: rule__DockerDeployment__Group__6__Impl : ( ( rule__DockerDeployment__DeploymentContainersAssignment_6 ) ) ;
    public final void rule__DockerDeployment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6213:1: ( ( ( rule__DockerDeployment__DeploymentContainersAssignment_6 ) ) )
            // InternalDsl.g:6214:1: ( ( rule__DockerDeployment__DeploymentContainersAssignment_6 ) )
            {
            // InternalDsl.g:6214:1: ( ( rule__DockerDeployment__DeploymentContainersAssignment_6 ) )
            // InternalDsl.g:6215:2: ( rule__DockerDeployment__DeploymentContainersAssignment_6 )
            {
             before(grammarAccess.getDockerDeploymentAccess().getDeploymentContainersAssignment_6()); 
            // InternalDsl.g:6216:2: ( rule__DockerDeployment__DeploymentContainersAssignment_6 )
            // InternalDsl.g:6216:3: rule__DockerDeployment__DeploymentContainersAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__DockerDeployment__DeploymentContainersAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDockerDeploymentAccess().getDeploymentContainersAssignment_6()); 

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
    // $ANTLR end "rule__DockerDeployment__Group__6__Impl"


    // $ANTLR start "rule__DockerDeployment__Group__7"
    // InternalDsl.g:6224:1: rule__DockerDeployment__Group__7 : rule__DockerDeployment__Group__7__Impl rule__DockerDeployment__Group__8 ;
    public final void rule__DockerDeployment__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6228:1: ( rule__DockerDeployment__Group__7__Impl rule__DockerDeployment__Group__8 )
            // InternalDsl.g:6229:2: rule__DockerDeployment__Group__7__Impl rule__DockerDeployment__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__DockerDeployment__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DockerDeployment__Group__8();

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
    // $ANTLR end "rule__DockerDeployment__Group__7"


    // $ANTLR start "rule__DockerDeployment__Group__7__Impl"
    // InternalDsl.g:6236:1: rule__DockerDeployment__Group__7__Impl : ( ';' ) ;
    public final void rule__DockerDeployment__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6240:1: ( ( ';' ) )
            // InternalDsl.g:6241:1: ( ';' )
            {
            // InternalDsl.g:6241:1: ( ';' )
            // InternalDsl.g:6242:2: ';'
            {
             before(grammarAccess.getDockerDeploymentAccess().getSemicolonKeyword_7()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getDockerDeploymentAccess().getSemicolonKeyword_7()); 

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
    // $ANTLR end "rule__DockerDeployment__Group__7__Impl"


    // $ANTLR start "rule__DockerDeployment__Group__8"
    // InternalDsl.g:6251:1: rule__DockerDeployment__Group__8 : rule__DockerDeployment__Group__8__Impl rule__DockerDeployment__Group__9 ;
    public final void rule__DockerDeployment__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6255:1: ( rule__DockerDeployment__Group__8__Impl rule__DockerDeployment__Group__9 )
            // InternalDsl.g:6256:2: rule__DockerDeployment__Group__8__Impl rule__DockerDeployment__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__DockerDeployment__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DockerDeployment__Group__9();

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
    // $ANTLR end "rule__DockerDeployment__Group__8"


    // $ANTLR start "rule__DockerDeployment__Group__8__Impl"
    // InternalDsl.g:6263:1: rule__DockerDeployment__Group__8__Impl : ( ( rule__DockerDeployment__Group_8__0 )* ) ;
    public final void rule__DockerDeployment__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6267:1: ( ( ( rule__DockerDeployment__Group_8__0 )* ) )
            // InternalDsl.g:6268:1: ( ( rule__DockerDeployment__Group_8__0 )* )
            {
            // InternalDsl.g:6268:1: ( ( rule__DockerDeployment__Group_8__0 )* )
            // InternalDsl.g:6269:2: ( rule__DockerDeployment__Group_8__0 )*
            {
             before(grammarAccess.getDockerDeploymentAccess().getGroup_8()); 
            // InternalDsl.g:6270:2: ( rule__DockerDeployment__Group_8__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_ID)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalDsl.g:6270:3: rule__DockerDeployment__Group_8__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__DockerDeployment__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getDockerDeploymentAccess().getGroup_8()); 

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
    // $ANTLR end "rule__DockerDeployment__Group__8__Impl"


    // $ANTLR start "rule__DockerDeployment__Group__9"
    // InternalDsl.g:6278:1: rule__DockerDeployment__Group__9 : rule__DockerDeployment__Group__9__Impl ;
    public final void rule__DockerDeployment__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6282:1: ( rule__DockerDeployment__Group__9__Impl )
            // InternalDsl.g:6283:2: rule__DockerDeployment__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DockerDeployment__Group__9__Impl();

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
    // $ANTLR end "rule__DockerDeployment__Group__9"


    // $ANTLR start "rule__DockerDeployment__Group__9__Impl"
    // InternalDsl.g:6289:1: rule__DockerDeployment__Group__9__Impl : ( '}' ) ;
    public final void rule__DockerDeployment__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6293:1: ( ( '}' ) )
            // InternalDsl.g:6294:1: ( '}' )
            {
            // InternalDsl.g:6294:1: ( '}' )
            // InternalDsl.g:6295:2: '}'
            {
             before(grammarAccess.getDockerDeploymentAccess().getRightCurlyBracketKeyword_9()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDockerDeploymentAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__DockerDeployment__Group__9__Impl"


    // $ANTLR start "rule__DockerDeployment__Group_8__0"
    // InternalDsl.g:6305:1: rule__DockerDeployment__Group_8__0 : rule__DockerDeployment__Group_8__0__Impl rule__DockerDeployment__Group_8__1 ;
    public final void rule__DockerDeployment__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6309:1: ( rule__DockerDeployment__Group_8__0__Impl rule__DockerDeployment__Group_8__1 )
            // InternalDsl.g:6310:2: rule__DockerDeployment__Group_8__0__Impl rule__DockerDeployment__Group_8__1
            {
            pushFollow(FOLLOW_7);
            rule__DockerDeployment__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DockerDeployment__Group_8__1();

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
    // $ANTLR end "rule__DockerDeployment__Group_8__0"


    // $ANTLR start "rule__DockerDeployment__Group_8__0__Impl"
    // InternalDsl.g:6317:1: rule__DockerDeployment__Group_8__0__Impl : ( ( rule__DockerDeployment__DeploymentContainersAssignment_8_0 ) ) ;
    public final void rule__DockerDeployment__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6321:1: ( ( ( rule__DockerDeployment__DeploymentContainersAssignment_8_0 ) ) )
            // InternalDsl.g:6322:1: ( ( rule__DockerDeployment__DeploymentContainersAssignment_8_0 ) )
            {
            // InternalDsl.g:6322:1: ( ( rule__DockerDeployment__DeploymentContainersAssignment_8_0 ) )
            // InternalDsl.g:6323:2: ( rule__DockerDeployment__DeploymentContainersAssignment_8_0 )
            {
             before(grammarAccess.getDockerDeploymentAccess().getDeploymentContainersAssignment_8_0()); 
            // InternalDsl.g:6324:2: ( rule__DockerDeployment__DeploymentContainersAssignment_8_0 )
            // InternalDsl.g:6324:3: rule__DockerDeployment__DeploymentContainersAssignment_8_0
            {
            pushFollow(FOLLOW_2);
            rule__DockerDeployment__DeploymentContainersAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getDockerDeploymentAccess().getDeploymentContainersAssignment_8_0()); 

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
    // $ANTLR end "rule__DockerDeployment__Group_8__0__Impl"


    // $ANTLR start "rule__DockerDeployment__Group_8__1"
    // InternalDsl.g:6332:1: rule__DockerDeployment__Group_8__1 : rule__DockerDeployment__Group_8__1__Impl ;
    public final void rule__DockerDeployment__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6336:1: ( rule__DockerDeployment__Group_8__1__Impl )
            // InternalDsl.g:6337:2: rule__DockerDeployment__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DockerDeployment__Group_8__1__Impl();

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
    // $ANTLR end "rule__DockerDeployment__Group_8__1"


    // $ANTLR start "rule__DockerDeployment__Group_8__1__Impl"
    // InternalDsl.g:6343:1: rule__DockerDeployment__Group_8__1__Impl : ( ';' ) ;
    public final void rule__DockerDeployment__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6347:1: ( ( ';' ) )
            // InternalDsl.g:6348:1: ( ';' )
            {
            // InternalDsl.g:6348:1: ( ';' )
            // InternalDsl.g:6349:2: ';'
            {
             before(grammarAccess.getDockerDeploymentAccess().getSemicolonKeyword_8_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getDockerDeploymentAccess().getSemicolonKeyword_8_1()); 

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
    // $ANTLR end "rule__DockerDeployment__Group_8__1__Impl"


    // $ANTLR start "rule__Network__Group__0"
    // InternalDsl.g:6359:1: rule__Network__Group__0 : rule__Network__Group__0__Impl rule__Network__Group__1 ;
    public final void rule__Network__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6363:1: ( rule__Network__Group__0__Impl rule__Network__Group__1 )
            // InternalDsl.g:6364:2: rule__Network__Group__0__Impl rule__Network__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Network__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group__1();

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
    // $ANTLR end "rule__Network__Group__0"


    // $ANTLR start "rule__Network__Group__0__Impl"
    // InternalDsl.g:6371:1: rule__Network__Group__0__Impl : ( 'network' ) ;
    public final void rule__Network__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6375:1: ( ( 'network' ) )
            // InternalDsl.g:6376:1: ( 'network' )
            {
            // InternalDsl.g:6376:1: ( 'network' )
            // InternalDsl.g:6377:2: 'network'
            {
             before(grammarAccess.getNetworkAccess().getNetworkKeyword_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getNetworkAccess().getNetworkKeyword_0()); 

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
    // $ANTLR end "rule__Network__Group__0__Impl"


    // $ANTLR start "rule__Network__Group__1"
    // InternalDsl.g:6386:1: rule__Network__Group__1 : rule__Network__Group__1__Impl rule__Network__Group__2 ;
    public final void rule__Network__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6390:1: ( rule__Network__Group__1__Impl rule__Network__Group__2 )
            // InternalDsl.g:6391:2: rule__Network__Group__1__Impl rule__Network__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Network__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group__2();

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
    // $ANTLR end "rule__Network__Group__1"


    // $ANTLR start "rule__Network__Group__1__Impl"
    // InternalDsl.g:6398:1: rule__Network__Group__1__Impl : ( ( rule__Network__NameAssignment_1 ) ) ;
    public final void rule__Network__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6402:1: ( ( ( rule__Network__NameAssignment_1 ) ) )
            // InternalDsl.g:6403:1: ( ( rule__Network__NameAssignment_1 ) )
            {
            // InternalDsl.g:6403:1: ( ( rule__Network__NameAssignment_1 ) )
            // InternalDsl.g:6404:2: ( rule__Network__NameAssignment_1 )
            {
             before(grammarAccess.getNetworkAccess().getNameAssignment_1()); 
            // InternalDsl.g:6405:2: ( rule__Network__NameAssignment_1 )
            // InternalDsl.g:6405:3: rule__Network__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Network__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNetworkAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Network__Group__1__Impl"


    // $ANTLR start "rule__Network__Group__2"
    // InternalDsl.g:6413:1: rule__Network__Group__2 : rule__Network__Group__2__Impl rule__Network__Group__3 ;
    public final void rule__Network__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6417:1: ( rule__Network__Group__2__Impl rule__Network__Group__3 )
            // InternalDsl.g:6418:2: rule__Network__Group__2__Impl rule__Network__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Network__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group__3();

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
    // $ANTLR end "rule__Network__Group__2"


    // $ANTLR start "rule__Network__Group__2__Impl"
    // InternalDsl.g:6425:1: rule__Network__Group__2__Impl : ( '(' ) ;
    public final void rule__Network__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6429:1: ( ( '(' ) )
            // InternalDsl.g:6430:1: ( '(' )
            {
            // InternalDsl.g:6430:1: ( '(' )
            // InternalDsl.g:6431:2: '('
            {
             before(grammarAccess.getNetworkAccess().getLeftParenthesisKeyword_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getNetworkAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Network__Group__2__Impl"


    // $ANTLR start "rule__Network__Group__3"
    // InternalDsl.g:6440:1: rule__Network__Group__3 : rule__Network__Group__3__Impl rule__Network__Group__4 ;
    public final void rule__Network__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6444:1: ( rule__Network__Group__3__Impl rule__Network__Group__4 )
            // InternalDsl.g:6445:2: rule__Network__Group__3__Impl rule__Network__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__Network__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group__4();

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
    // $ANTLR end "rule__Network__Group__3"


    // $ANTLR start "rule__Network__Group__3__Impl"
    // InternalDsl.g:6452:1: rule__Network__Group__3__Impl : ( ( rule__Network__PrefixAssignment_3 ) ) ;
    public final void rule__Network__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6456:1: ( ( ( rule__Network__PrefixAssignment_3 ) ) )
            // InternalDsl.g:6457:1: ( ( rule__Network__PrefixAssignment_3 ) )
            {
            // InternalDsl.g:6457:1: ( ( rule__Network__PrefixAssignment_3 ) )
            // InternalDsl.g:6458:2: ( rule__Network__PrefixAssignment_3 )
            {
             before(grammarAccess.getNetworkAccess().getPrefixAssignment_3()); 
            // InternalDsl.g:6459:2: ( rule__Network__PrefixAssignment_3 )
            // InternalDsl.g:6459:3: rule__Network__PrefixAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Network__PrefixAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNetworkAccess().getPrefixAssignment_3()); 

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
    // $ANTLR end "rule__Network__Group__3__Impl"


    // $ANTLR start "rule__Network__Group__4"
    // InternalDsl.g:6467:1: rule__Network__Group__4 : rule__Network__Group__4__Impl rule__Network__Group__5 ;
    public final void rule__Network__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6471:1: ( rule__Network__Group__4__Impl rule__Network__Group__5 )
            // InternalDsl.g:6472:2: rule__Network__Group__4__Impl rule__Network__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Network__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group__5();

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
    // $ANTLR end "rule__Network__Group__4"


    // $ANTLR start "rule__Network__Group__4__Impl"
    // InternalDsl.g:6479:1: rule__Network__Group__4__Impl : ( ',' ) ;
    public final void rule__Network__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6483:1: ( ( ',' ) )
            // InternalDsl.g:6484:1: ( ',' )
            {
            // InternalDsl.g:6484:1: ( ',' )
            // InternalDsl.g:6485:2: ','
            {
             before(grammarAccess.getNetworkAccess().getCommaKeyword_4()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getNetworkAccess().getCommaKeyword_4()); 

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
    // $ANTLR end "rule__Network__Group__4__Impl"


    // $ANTLR start "rule__Network__Group__5"
    // InternalDsl.g:6494:1: rule__Network__Group__5 : rule__Network__Group__5__Impl rule__Network__Group__6 ;
    public final void rule__Network__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6498:1: ( rule__Network__Group__5__Impl rule__Network__Group__6 )
            // InternalDsl.g:6499:2: rule__Network__Group__5__Impl rule__Network__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__Network__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group__6();

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
    // $ANTLR end "rule__Network__Group__5"


    // $ANTLR start "rule__Network__Group__5__Impl"
    // InternalDsl.g:6506:1: rule__Network__Group__5__Impl : ( ( rule__Network__MaskAssignment_5 ) ) ;
    public final void rule__Network__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6510:1: ( ( ( rule__Network__MaskAssignment_5 ) ) )
            // InternalDsl.g:6511:1: ( ( rule__Network__MaskAssignment_5 ) )
            {
            // InternalDsl.g:6511:1: ( ( rule__Network__MaskAssignment_5 ) )
            // InternalDsl.g:6512:2: ( rule__Network__MaskAssignment_5 )
            {
             before(grammarAccess.getNetworkAccess().getMaskAssignment_5()); 
            // InternalDsl.g:6513:2: ( rule__Network__MaskAssignment_5 )
            // InternalDsl.g:6513:3: rule__Network__MaskAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Network__MaskAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getNetworkAccess().getMaskAssignment_5()); 

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
    // $ANTLR end "rule__Network__Group__5__Impl"


    // $ANTLR start "rule__Network__Group__6"
    // InternalDsl.g:6521:1: rule__Network__Group__6 : rule__Network__Group__6__Impl rule__Network__Group__7 ;
    public final void rule__Network__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6525:1: ( rule__Network__Group__6__Impl rule__Network__Group__7 )
            // InternalDsl.g:6526:2: rule__Network__Group__6__Impl rule__Network__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Network__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group__7();

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
    // $ANTLR end "rule__Network__Group__6"


    // $ANTLR start "rule__Network__Group__6__Impl"
    // InternalDsl.g:6533:1: rule__Network__Group__6__Impl : ( ',' ) ;
    public final void rule__Network__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6537:1: ( ( ',' ) )
            // InternalDsl.g:6538:1: ( ',' )
            {
            // InternalDsl.g:6538:1: ( ',' )
            // InternalDsl.g:6539:2: ','
            {
             before(grammarAccess.getNetworkAccess().getCommaKeyword_6()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getNetworkAccess().getCommaKeyword_6()); 

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
    // $ANTLR end "rule__Network__Group__6__Impl"


    // $ANTLR start "rule__Network__Group__7"
    // InternalDsl.g:6548:1: rule__Network__Group__7 : rule__Network__Group__7__Impl rule__Network__Group__8 ;
    public final void rule__Network__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6552:1: ( rule__Network__Group__7__Impl rule__Network__Group__8 )
            // InternalDsl.g:6553:2: rule__Network__Group__7__Impl rule__Network__Group__8
            {
            pushFollow(FOLLOW_26);
            rule__Network__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group__8();

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
    // $ANTLR end "rule__Network__Group__7"


    // $ANTLR start "rule__Network__Group__7__Impl"
    // InternalDsl.g:6560:1: rule__Network__Group__7__Impl : ( ( rule__Network__GatewayAssignment_7 ) ) ;
    public final void rule__Network__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6564:1: ( ( ( rule__Network__GatewayAssignment_7 ) ) )
            // InternalDsl.g:6565:1: ( ( rule__Network__GatewayAssignment_7 ) )
            {
            // InternalDsl.g:6565:1: ( ( rule__Network__GatewayAssignment_7 ) )
            // InternalDsl.g:6566:2: ( rule__Network__GatewayAssignment_7 )
            {
             before(grammarAccess.getNetworkAccess().getGatewayAssignment_7()); 
            // InternalDsl.g:6567:2: ( rule__Network__GatewayAssignment_7 )
            // InternalDsl.g:6567:3: rule__Network__GatewayAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Network__GatewayAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getNetworkAccess().getGatewayAssignment_7()); 

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
    // $ANTLR end "rule__Network__Group__7__Impl"


    // $ANTLR start "rule__Network__Group__8"
    // InternalDsl.g:6575:1: rule__Network__Group__8 : rule__Network__Group__8__Impl rule__Network__Group__9 ;
    public final void rule__Network__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6579:1: ( rule__Network__Group__8__Impl rule__Network__Group__9 )
            // InternalDsl.g:6580:2: rule__Network__Group__8__Impl rule__Network__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__Network__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group__9();

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
    // $ANTLR end "rule__Network__Group__8"


    // $ANTLR start "rule__Network__Group__8__Impl"
    // InternalDsl.g:6587:1: rule__Network__Group__8__Impl : ( ',' ) ;
    public final void rule__Network__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6591:1: ( ( ',' ) )
            // InternalDsl.g:6592:1: ( ',' )
            {
            // InternalDsl.g:6592:1: ( ',' )
            // InternalDsl.g:6593:2: ','
            {
             before(grammarAccess.getNetworkAccess().getCommaKeyword_8()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getNetworkAccess().getCommaKeyword_8()); 

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
    // $ANTLR end "rule__Network__Group__8__Impl"


    // $ANTLR start "rule__Network__Group__9"
    // InternalDsl.g:6602:1: rule__Network__Group__9 : rule__Network__Group__9__Impl rule__Network__Group__10 ;
    public final void rule__Network__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6606:1: ( rule__Network__Group__9__Impl rule__Network__Group__10 )
            // InternalDsl.g:6607:2: rule__Network__Group__9__Impl rule__Network__Group__10
            {
            pushFollow(FOLLOW_28);
            rule__Network__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group__10();

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
    // $ANTLR end "rule__Network__Group__9"


    // $ANTLR start "rule__Network__Group__9__Impl"
    // InternalDsl.g:6614:1: rule__Network__Group__9__Impl : ( ( rule__Network__DomainNameAssignment_9 ) ) ;
    public final void rule__Network__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6618:1: ( ( ( rule__Network__DomainNameAssignment_9 ) ) )
            // InternalDsl.g:6619:1: ( ( rule__Network__DomainNameAssignment_9 ) )
            {
            // InternalDsl.g:6619:1: ( ( rule__Network__DomainNameAssignment_9 ) )
            // InternalDsl.g:6620:2: ( rule__Network__DomainNameAssignment_9 )
            {
             before(grammarAccess.getNetworkAccess().getDomainNameAssignment_9()); 
            // InternalDsl.g:6621:2: ( rule__Network__DomainNameAssignment_9 )
            // InternalDsl.g:6621:3: rule__Network__DomainNameAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Network__DomainNameAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getNetworkAccess().getDomainNameAssignment_9()); 

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
    // $ANTLR end "rule__Network__Group__9__Impl"


    // $ANTLR start "rule__Network__Group__10"
    // InternalDsl.g:6629:1: rule__Network__Group__10 : rule__Network__Group__10__Impl rule__Network__Group__11 ;
    public final void rule__Network__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6633:1: ( rule__Network__Group__10__Impl rule__Network__Group__11 )
            // InternalDsl.g:6634:2: rule__Network__Group__10__Impl rule__Network__Group__11
            {
            pushFollow(FOLLOW_5);
            rule__Network__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group__11();

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
    // $ANTLR end "rule__Network__Group__10"


    // $ANTLR start "rule__Network__Group__10__Impl"
    // InternalDsl.g:6641:1: rule__Network__Group__10__Impl : ( ')' ) ;
    public final void rule__Network__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6645:1: ( ( ')' ) )
            // InternalDsl.g:6646:1: ( ')' )
            {
            // InternalDsl.g:6646:1: ( ')' )
            // InternalDsl.g:6647:2: ')'
            {
             before(grammarAccess.getNetworkAccess().getRightParenthesisKeyword_10()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getNetworkAccess().getRightParenthesisKeyword_10()); 

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
    // $ANTLR end "rule__Network__Group__10__Impl"


    // $ANTLR start "rule__Network__Group__11"
    // InternalDsl.g:6656:1: rule__Network__Group__11 : rule__Network__Group__11__Impl rule__Network__Group__12 ;
    public final void rule__Network__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6660:1: ( rule__Network__Group__11__Impl rule__Network__Group__12 )
            // InternalDsl.g:6661:2: rule__Network__Group__11__Impl rule__Network__Group__12
            {
            pushFollow(FOLLOW_55);
            rule__Network__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group__12();

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
    // $ANTLR end "rule__Network__Group__11"


    // $ANTLR start "rule__Network__Group__11__Impl"
    // InternalDsl.g:6668:1: rule__Network__Group__11__Impl : ( '{' ) ;
    public final void rule__Network__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6672:1: ( ( '{' ) )
            // InternalDsl.g:6673:1: ( '{' )
            {
            // InternalDsl.g:6673:1: ( '{' )
            // InternalDsl.g:6674:2: '{'
            {
             before(grammarAccess.getNetworkAccess().getLeftCurlyBracketKeyword_11()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getNetworkAccess().getLeftCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__Network__Group__11__Impl"


    // $ANTLR start "rule__Network__Group__12"
    // InternalDsl.g:6683:1: rule__Network__Group__12 : rule__Network__Group__12__Impl rule__Network__Group__13 ;
    public final void rule__Network__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6687:1: ( rule__Network__Group__12__Impl rule__Network__Group__13 )
            // InternalDsl.g:6688:2: rule__Network__Group__12__Impl rule__Network__Group__13
            {
            pushFollow(FOLLOW_7);
            rule__Network__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group__13();

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
    // $ANTLR end "rule__Network__Group__12"


    // $ANTLR start "rule__Network__Group__12__Impl"
    // InternalDsl.g:6695:1: rule__Network__Group__12__Impl : ( ( rule__Network__NetworkInterfacesAssignment_12 ) ) ;
    public final void rule__Network__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6699:1: ( ( ( rule__Network__NetworkInterfacesAssignment_12 ) ) )
            // InternalDsl.g:6700:1: ( ( rule__Network__NetworkInterfacesAssignment_12 ) )
            {
            // InternalDsl.g:6700:1: ( ( rule__Network__NetworkInterfacesAssignment_12 ) )
            // InternalDsl.g:6701:2: ( rule__Network__NetworkInterfacesAssignment_12 )
            {
             before(grammarAccess.getNetworkAccess().getNetworkInterfacesAssignment_12()); 
            // InternalDsl.g:6702:2: ( rule__Network__NetworkInterfacesAssignment_12 )
            // InternalDsl.g:6702:3: rule__Network__NetworkInterfacesAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Network__NetworkInterfacesAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getNetworkAccess().getNetworkInterfacesAssignment_12()); 

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
    // $ANTLR end "rule__Network__Group__12__Impl"


    // $ANTLR start "rule__Network__Group__13"
    // InternalDsl.g:6710:1: rule__Network__Group__13 : rule__Network__Group__13__Impl rule__Network__Group__14 ;
    public final void rule__Network__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6714:1: ( rule__Network__Group__13__Impl rule__Network__Group__14 )
            // InternalDsl.g:6715:2: rule__Network__Group__13__Impl rule__Network__Group__14
            {
            pushFollow(FOLLOW_56);
            rule__Network__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group__14();

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
    // $ANTLR end "rule__Network__Group__13"


    // $ANTLR start "rule__Network__Group__13__Impl"
    // InternalDsl.g:6722:1: rule__Network__Group__13__Impl : ( ';' ) ;
    public final void rule__Network__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6726:1: ( ( ';' ) )
            // InternalDsl.g:6727:1: ( ';' )
            {
            // InternalDsl.g:6727:1: ( ';' )
            // InternalDsl.g:6728:2: ';'
            {
             before(grammarAccess.getNetworkAccess().getSemicolonKeyword_13()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getNetworkAccess().getSemicolonKeyword_13()); 

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
    // $ANTLR end "rule__Network__Group__13__Impl"


    // $ANTLR start "rule__Network__Group__14"
    // InternalDsl.g:6737:1: rule__Network__Group__14 : rule__Network__Group__14__Impl rule__Network__Group__15 ;
    public final void rule__Network__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6741:1: ( rule__Network__Group__14__Impl rule__Network__Group__15 )
            // InternalDsl.g:6742:2: rule__Network__Group__14__Impl rule__Network__Group__15
            {
            pushFollow(FOLLOW_56);
            rule__Network__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group__15();

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
    // $ANTLR end "rule__Network__Group__14"


    // $ANTLR start "rule__Network__Group__14__Impl"
    // InternalDsl.g:6749:1: rule__Network__Group__14__Impl : ( ( rule__Network__Group_14__0 )* ) ;
    public final void rule__Network__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6753:1: ( ( ( rule__Network__Group_14__0 )* ) )
            // InternalDsl.g:6754:1: ( ( rule__Network__Group_14__0 )* )
            {
            // InternalDsl.g:6754:1: ( ( rule__Network__Group_14__0 )* )
            // InternalDsl.g:6755:2: ( rule__Network__Group_14__0 )*
            {
             before(grammarAccess.getNetworkAccess().getGroup_14()); 
            // InternalDsl.g:6756:2: ( rule__Network__Group_14__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==67) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalDsl.g:6756:3: rule__Network__Group_14__0
            	    {
            	    pushFollow(FOLLOW_57);
            	    rule__Network__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getNetworkAccess().getGroup_14()); 

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
    // $ANTLR end "rule__Network__Group__14__Impl"


    // $ANTLR start "rule__Network__Group__15"
    // InternalDsl.g:6764:1: rule__Network__Group__15 : rule__Network__Group__15__Impl ;
    public final void rule__Network__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6768:1: ( rule__Network__Group__15__Impl )
            // InternalDsl.g:6769:2: rule__Network__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Network__Group__15__Impl();

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
    // $ANTLR end "rule__Network__Group__15"


    // $ANTLR start "rule__Network__Group__15__Impl"
    // InternalDsl.g:6775:1: rule__Network__Group__15__Impl : ( '}' ) ;
    public final void rule__Network__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6779:1: ( ( '}' ) )
            // InternalDsl.g:6780:1: ( '}' )
            {
            // InternalDsl.g:6780:1: ( '}' )
            // InternalDsl.g:6781:2: '}'
            {
             before(grammarAccess.getNetworkAccess().getRightCurlyBracketKeyword_15()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getNetworkAccess().getRightCurlyBracketKeyword_15()); 

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
    // $ANTLR end "rule__Network__Group__15__Impl"


    // $ANTLR start "rule__Network__Group_14__0"
    // InternalDsl.g:6791:1: rule__Network__Group_14__0 : rule__Network__Group_14__0__Impl rule__Network__Group_14__1 ;
    public final void rule__Network__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6795:1: ( rule__Network__Group_14__0__Impl rule__Network__Group_14__1 )
            // InternalDsl.g:6796:2: rule__Network__Group_14__0__Impl rule__Network__Group_14__1
            {
            pushFollow(FOLLOW_7);
            rule__Network__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group_14__1();

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
    // $ANTLR end "rule__Network__Group_14__0"


    // $ANTLR start "rule__Network__Group_14__0__Impl"
    // InternalDsl.g:6803:1: rule__Network__Group_14__0__Impl : ( ( rule__Network__NetworkInterfacesAssignment_14_0 ) ) ;
    public final void rule__Network__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6807:1: ( ( ( rule__Network__NetworkInterfacesAssignment_14_0 ) ) )
            // InternalDsl.g:6808:1: ( ( rule__Network__NetworkInterfacesAssignment_14_0 ) )
            {
            // InternalDsl.g:6808:1: ( ( rule__Network__NetworkInterfacesAssignment_14_0 ) )
            // InternalDsl.g:6809:2: ( rule__Network__NetworkInterfacesAssignment_14_0 )
            {
             before(grammarAccess.getNetworkAccess().getNetworkInterfacesAssignment_14_0()); 
            // InternalDsl.g:6810:2: ( rule__Network__NetworkInterfacesAssignment_14_0 )
            // InternalDsl.g:6810:3: rule__Network__NetworkInterfacesAssignment_14_0
            {
            pushFollow(FOLLOW_2);
            rule__Network__NetworkInterfacesAssignment_14_0();

            state._fsp--;


            }

             after(grammarAccess.getNetworkAccess().getNetworkInterfacesAssignment_14_0()); 

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
    // $ANTLR end "rule__Network__Group_14__0__Impl"


    // $ANTLR start "rule__Network__Group_14__1"
    // InternalDsl.g:6818:1: rule__Network__Group_14__1 : rule__Network__Group_14__1__Impl ;
    public final void rule__Network__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6822:1: ( rule__Network__Group_14__1__Impl )
            // InternalDsl.g:6823:2: rule__Network__Group_14__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Network__Group_14__1__Impl();

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
    // $ANTLR end "rule__Network__Group_14__1"


    // $ANTLR start "rule__Network__Group_14__1__Impl"
    // InternalDsl.g:6829:1: rule__Network__Group_14__1__Impl : ( ';' ) ;
    public final void rule__Network__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6833:1: ( ( ';' ) )
            // InternalDsl.g:6834:1: ( ';' )
            {
            // InternalDsl.g:6834:1: ( ';' )
            // InternalDsl.g:6835:2: ';'
            {
             before(grammarAccess.getNetworkAccess().getSemicolonKeyword_14_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getNetworkAccess().getSemicolonKeyword_14_1()); 

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
    // $ANTLR end "rule__Network__Group_14__1__Impl"


    // $ANTLR start "rule__Container__Group__0"
    // InternalDsl.g:6845:1: rule__Container__Group__0 : rule__Container__Group__0__Impl rule__Container__Group__1 ;
    public final void rule__Container__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6849:1: ( rule__Container__Group__0__Impl rule__Container__Group__1 )
            // InternalDsl.g:6850:2: rule__Container__Group__0__Impl rule__Container__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Container__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__1();

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
    // $ANTLR end "rule__Container__Group__0"


    // $ANTLR start "rule__Container__Group__0__Impl"
    // InternalDsl.g:6857:1: rule__Container__Group__0__Impl : ( ( rule__Container__NameAssignment_0 ) ) ;
    public final void rule__Container__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6861:1: ( ( ( rule__Container__NameAssignment_0 ) ) )
            // InternalDsl.g:6862:1: ( ( rule__Container__NameAssignment_0 ) )
            {
            // InternalDsl.g:6862:1: ( ( rule__Container__NameAssignment_0 ) )
            // InternalDsl.g:6863:2: ( rule__Container__NameAssignment_0 )
            {
             before(grammarAccess.getContainerAccess().getNameAssignment_0()); 
            // InternalDsl.g:6864:2: ( rule__Container__NameAssignment_0 )
            // InternalDsl.g:6864:3: rule__Container__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Container__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Container__Group__0__Impl"


    // $ANTLR start "rule__Container__Group__1"
    // InternalDsl.g:6872:1: rule__Container__Group__1 : rule__Container__Group__1__Impl rule__Container__Group__2 ;
    public final void rule__Container__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6876:1: ( rule__Container__Group__1__Impl rule__Container__Group__2 )
            // InternalDsl.g:6877:2: rule__Container__Group__1__Impl rule__Container__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Container__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__2();

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
    // $ANTLR end "rule__Container__Group__1"


    // $ANTLR start "rule__Container__Group__1__Impl"
    // InternalDsl.g:6884:1: rule__Container__Group__1__Impl : ( '(' ) ;
    public final void rule__Container__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6888:1: ( ( '(' ) )
            // InternalDsl.g:6889:1: ( '(' )
            {
            // InternalDsl.g:6889:1: ( '(' )
            // InternalDsl.g:6890:2: '('
            {
             before(grammarAccess.getContainerAccess().getLeftParenthesisKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Container__Group__1__Impl"


    // $ANTLR start "rule__Container__Group__2"
    // InternalDsl.g:6899:1: rule__Container__Group__2 : rule__Container__Group__2__Impl rule__Container__Group__3 ;
    public final void rule__Container__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6903:1: ( rule__Container__Group__2__Impl rule__Container__Group__3 )
            // InternalDsl.g:6904:2: rule__Container__Group__2__Impl rule__Container__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Container__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__3();

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
    // $ANTLR end "rule__Container__Group__2"


    // $ANTLR start "rule__Container__Group__2__Impl"
    // InternalDsl.g:6911:1: rule__Container__Group__2__Impl : ( ( rule__Container__ContainerNetworkInterfaceAssignment_2 ) ) ;
    public final void rule__Container__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6915:1: ( ( ( rule__Container__ContainerNetworkInterfaceAssignment_2 ) ) )
            // InternalDsl.g:6916:1: ( ( rule__Container__ContainerNetworkInterfaceAssignment_2 ) )
            {
            // InternalDsl.g:6916:1: ( ( rule__Container__ContainerNetworkInterfaceAssignment_2 ) )
            // InternalDsl.g:6917:2: ( rule__Container__ContainerNetworkInterfaceAssignment_2 )
            {
             before(grammarAccess.getContainerAccess().getContainerNetworkInterfaceAssignment_2()); 
            // InternalDsl.g:6918:2: ( rule__Container__ContainerNetworkInterfaceAssignment_2 )
            // InternalDsl.g:6918:3: rule__Container__ContainerNetworkInterfaceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Container__ContainerNetworkInterfaceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getContainerNetworkInterfaceAssignment_2()); 

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
    // $ANTLR end "rule__Container__Group__2__Impl"


    // $ANTLR start "rule__Container__Group__3"
    // InternalDsl.g:6926:1: rule__Container__Group__3 : rule__Container__Group__3__Impl rule__Container__Group__4 ;
    public final void rule__Container__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6930:1: ( rule__Container__Group__3__Impl rule__Container__Group__4 )
            // InternalDsl.g:6931:2: rule__Container__Group__3__Impl rule__Container__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Container__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__4();

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
    // $ANTLR end "rule__Container__Group__3"


    // $ANTLR start "rule__Container__Group__3__Impl"
    // InternalDsl.g:6938:1: rule__Container__Group__3__Impl : ( ')' ) ;
    public final void rule__Container__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6942:1: ( ( ')' ) )
            // InternalDsl.g:6943:1: ( ')' )
            {
            // InternalDsl.g:6943:1: ( ')' )
            // InternalDsl.g:6944:2: ')'
            {
             before(grammarAccess.getContainerAccess().getRightParenthesisKeyword_3()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Container__Group__3__Impl"


    // $ANTLR start "rule__Container__Group__4"
    // InternalDsl.g:6953:1: rule__Container__Group__4 : rule__Container__Group__4__Impl rule__Container__Group__5 ;
    public final void rule__Container__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6957:1: ( rule__Container__Group__4__Impl rule__Container__Group__5 )
            // InternalDsl.g:6958:2: rule__Container__Group__4__Impl rule__Container__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Container__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__5();

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
    // $ANTLR end "rule__Container__Group__4"


    // $ANTLR start "rule__Container__Group__4__Impl"
    // InternalDsl.g:6965:1: rule__Container__Group__4__Impl : ( '{' ) ;
    public final void rule__Container__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6969:1: ( ( '{' ) )
            // InternalDsl.g:6970:1: ( '{' )
            {
            // InternalDsl.g:6970:1: ( '{' )
            // InternalDsl.g:6971:2: '{'
            {
             before(grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Container__Group__4__Impl"


    // $ANTLR start "rule__Container__Group__5"
    // InternalDsl.g:6980:1: rule__Container__Group__5 : rule__Container__Group__5__Impl rule__Container__Group__6 ;
    public final void rule__Container__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6984:1: ( rule__Container__Group__5__Impl rule__Container__Group__6 )
            // InternalDsl.g:6985:2: rule__Container__Group__5__Impl rule__Container__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Container__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__6();

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
    // $ANTLR end "rule__Container__Group__5"


    // $ANTLR start "rule__Container__Group__5__Impl"
    // InternalDsl.g:6992:1: rule__Container__Group__5__Impl : ( ( rule__Container__ContainerServicesAssignment_5 ) ) ;
    public final void rule__Container__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6996:1: ( ( ( rule__Container__ContainerServicesAssignment_5 ) ) )
            // InternalDsl.g:6997:1: ( ( rule__Container__ContainerServicesAssignment_5 ) )
            {
            // InternalDsl.g:6997:1: ( ( rule__Container__ContainerServicesAssignment_5 ) )
            // InternalDsl.g:6998:2: ( rule__Container__ContainerServicesAssignment_5 )
            {
             before(grammarAccess.getContainerAccess().getContainerServicesAssignment_5()); 
            // InternalDsl.g:6999:2: ( rule__Container__ContainerServicesAssignment_5 )
            // InternalDsl.g:6999:3: rule__Container__ContainerServicesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Container__ContainerServicesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getContainerServicesAssignment_5()); 

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
    // $ANTLR end "rule__Container__Group__5__Impl"


    // $ANTLR start "rule__Container__Group__6"
    // InternalDsl.g:7007:1: rule__Container__Group__6 : rule__Container__Group__6__Impl rule__Container__Group__7 ;
    public final void rule__Container__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7011:1: ( rule__Container__Group__6__Impl rule__Container__Group__7 )
            // InternalDsl.g:7012:2: rule__Container__Group__6__Impl rule__Container__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__Container__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__7();

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
    // $ANTLR end "rule__Container__Group__6"


    // $ANTLR start "rule__Container__Group__6__Impl"
    // InternalDsl.g:7019:1: rule__Container__Group__6__Impl : ( ';' ) ;
    public final void rule__Container__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7023:1: ( ( ';' ) )
            // InternalDsl.g:7024:1: ( ';' )
            {
            // InternalDsl.g:7024:1: ( ';' )
            // InternalDsl.g:7025:2: ';'
            {
             before(grammarAccess.getContainerAccess().getSemicolonKeyword_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getSemicolonKeyword_6()); 

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
    // $ANTLR end "rule__Container__Group__6__Impl"


    // $ANTLR start "rule__Container__Group__7"
    // InternalDsl.g:7034:1: rule__Container__Group__7 : rule__Container__Group__7__Impl rule__Container__Group__8 ;
    public final void rule__Container__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7038:1: ( rule__Container__Group__7__Impl rule__Container__Group__8 )
            // InternalDsl.g:7039:2: rule__Container__Group__7__Impl rule__Container__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__Container__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group__8();

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
    // $ANTLR end "rule__Container__Group__7"


    // $ANTLR start "rule__Container__Group__7__Impl"
    // InternalDsl.g:7046:1: rule__Container__Group__7__Impl : ( ( rule__Container__Group_7__0 )* ) ;
    public final void rule__Container__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7050:1: ( ( ( rule__Container__Group_7__0 )* ) )
            // InternalDsl.g:7051:1: ( ( rule__Container__Group_7__0 )* )
            {
            // InternalDsl.g:7051:1: ( ( rule__Container__Group_7__0 )* )
            // InternalDsl.g:7052:2: ( rule__Container__Group_7__0 )*
            {
             before(grammarAccess.getContainerAccess().getGroup_7()); 
            // InternalDsl.g:7053:2: ( rule__Container__Group_7__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_ID)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalDsl.g:7053:3: rule__Container__Group_7__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Container__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getContainerAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Container__Group__7__Impl"


    // $ANTLR start "rule__Container__Group__8"
    // InternalDsl.g:7061:1: rule__Container__Group__8 : rule__Container__Group__8__Impl ;
    public final void rule__Container__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7065:1: ( rule__Container__Group__8__Impl )
            // InternalDsl.g:7066:2: rule__Container__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group__8__Impl();

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
    // $ANTLR end "rule__Container__Group__8"


    // $ANTLR start "rule__Container__Group__8__Impl"
    // InternalDsl.g:7072:1: rule__Container__Group__8__Impl : ( '}' ) ;
    public final void rule__Container__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7076:1: ( ( '}' ) )
            // InternalDsl.g:7077:1: ( '}' )
            {
            // InternalDsl.g:7077:1: ( '}' )
            // InternalDsl.g:7078:2: '}'
            {
             before(grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_8()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Container__Group__8__Impl"


    // $ANTLR start "rule__Container__Group_7__0"
    // InternalDsl.g:7088:1: rule__Container__Group_7__0 : rule__Container__Group_7__0__Impl rule__Container__Group_7__1 ;
    public final void rule__Container__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7092:1: ( rule__Container__Group_7__0__Impl rule__Container__Group_7__1 )
            // InternalDsl.g:7093:2: rule__Container__Group_7__0__Impl rule__Container__Group_7__1
            {
            pushFollow(FOLLOW_7);
            rule__Container__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Container__Group_7__1();

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
    // $ANTLR end "rule__Container__Group_7__0"


    // $ANTLR start "rule__Container__Group_7__0__Impl"
    // InternalDsl.g:7100:1: rule__Container__Group_7__0__Impl : ( ( rule__Container__ContainerServicesAssignment_7_0 ) ) ;
    public final void rule__Container__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7104:1: ( ( ( rule__Container__ContainerServicesAssignment_7_0 ) ) )
            // InternalDsl.g:7105:1: ( ( rule__Container__ContainerServicesAssignment_7_0 ) )
            {
            // InternalDsl.g:7105:1: ( ( rule__Container__ContainerServicesAssignment_7_0 ) )
            // InternalDsl.g:7106:2: ( rule__Container__ContainerServicesAssignment_7_0 )
            {
             before(grammarAccess.getContainerAccess().getContainerServicesAssignment_7_0()); 
            // InternalDsl.g:7107:2: ( rule__Container__ContainerServicesAssignment_7_0 )
            // InternalDsl.g:7107:3: rule__Container__ContainerServicesAssignment_7_0
            {
            pushFollow(FOLLOW_2);
            rule__Container__ContainerServicesAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getContainerAccess().getContainerServicesAssignment_7_0()); 

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
    // $ANTLR end "rule__Container__Group_7__0__Impl"


    // $ANTLR start "rule__Container__Group_7__1"
    // InternalDsl.g:7115:1: rule__Container__Group_7__1 : rule__Container__Group_7__1__Impl ;
    public final void rule__Container__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7119:1: ( rule__Container__Group_7__1__Impl )
            // InternalDsl.g:7120:2: rule__Container__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Container__Group_7__1__Impl();

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
    // $ANTLR end "rule__Container__Group_7__1"


    // $ANTLR start "rule__Container__Group_7__1__Impl"
    // InternalDsl.g:7126:1: rule__Container__Group_7__1__Impl : ( ';' ) ;
    public final void rule__Container__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7130:1: ( ( ';' ) )
            // InternalDsl.g:7131:1: ( ';' )
            {
            // InternalDsl.g:7131:1: ( ';' )
            // InternalDsl.g:7132:2: ';'
            {
             before(grammarAccess.getContainerAccess().getSemicolonKeyword_7_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getContainerAccess().getSemicolonKeyword_7_1()); 

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
    // $ANTLR end "rule__Container__Group_7__1__Impl"


    // $ANTLR start "rule__NetworkInterface__Group__0"
    // InternalDsl.g:7142:1: rule__NetworkInterface__Group__0 : rule__NetworkInterface__Group__0__Impl rule__NetworkInterface__Group__1 ;
    public final void rule__NetworkInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7146:1: ( rule__NetworkInterface__Group__0__Impl rule__NetworkInterface__Group__1 )
            // InternalDsl.g:7147:2: rule__NetworkInterface__Group__0__Impl rule__NetworkInterface__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__NetworkInterface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkInterface__Group__1();

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
    // $ANTLR end "rule__NetworkInterface__Group__0"


    // $ANTLR start "rule__NetworkInterface__Group__0__Impl"
    // InternalDsl.g:7154:1: rule__NetworkInterface__Group__0__Impl : ( 'interface' ) ;
    public final void rule__NetworkInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7158:1: ( ( 'interface' ) )
            // InternalDsl.g:7159:1: ( 'interface' )
            {
            // InternalDsl.g:7159:1: ( 'interface' )
            // InternalDsl.g:7160:2: 'interface'
            {
             before(grammarAccess.getNetworkInterfaceAccess().getInterfaceKeyword_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getNetworkInterfaceAccess().getInterfaceKeyword_0()); 

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
    // $ANTLR end "rule__NetworkInterface__Group__0__Impl"


    // $ANTLR start "rule__NetworkInterface__Group__1"
    // InternalDsl.g:7169:1: rule__NetworkInterface__Group__1 : rule__NetworkInterface__Group__1__Impl rule__NetworkInterface__Group__2 ;
    public final void rule__NetworkInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7173:1: ( rule__NetworkInterface__Group__1__Impl rule__NetworkInterface__Group__2 )
            // InternalDsl.g:7174:2: rule__NetworkInterface__Group__1__Impl rule__NetworkInterface__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__NetworkInterface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkInterface__Group__2();

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
    // $ANTLR end "rule__NetworkInterface__Group__1"


    // $ANTLR start "rule__NetworkInterface__Group__1__Impl"
    // InternalDsl.g:7181:1: rule__NetworkInterface__Group__1__Impl : ( ( rule__NetworkInterface__NameAssignment_1 ) ) ;
    public final void rule__NetworkInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7185:1: ( ( ( rule__NetworkInterface__NameAssignment_1 ) ) )
            // InternalDsl.g:7186:1: ( ( rule__NetworkInterface__NameAssignment_1 ) )
            {
            // InternalDsl.g:7186:1: ( ( rule__NetworkInterface__NameAssignment_1 ) )
            // InternalDsl.g:7187:2: ( rule__NetworkInterface__NameAssignment_1 )
            {
             before(grammarAccess.getNetworkInterfaceAccess().getNameAssignment_1()); 
            // InternalDsl.g:7188:2: ( rule__NetworkInterface__NameAssignment_1 )
            // InternalDsl.g:7188:3: rule__NetworkInterface__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NetworkInterface__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNetworkInterfaceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__NetworkInterface__Group__1__Impl"


    // $ANTLR start "rule__NetworkInterface__Group__2"
    // InternalDsl.g:7196:1: rule__NetworkInterface__Group__2 : rule__NetworkInterface__Group__2__Impl rule__NetworkInterface__Group__3 ;
    public final void rule__NetworkInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7200:1: ( rule__NetworkInterface__Group__2__Impl rule__NetworkInterface__Group__3 )
            // InternalDsl.g:7201:2: rule__NetworkInterface__Group__2__Impl rule__NetworkInterface__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__NetworkInterface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkInterface__Group__3();

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
    // $ANTLR end "rule__NetworkInterface__Group__2"


    // $ANTLR start "rule__NetworkInterface__Group__2__Impl"
    // InternalDsl.g:7208:1: rule__NetworkInterface__Group__2__Impl : ( '(' ) ;
    public final void rule__NetworkInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7212:1: ( ( '(' ) )
            // InternalDsl.g:7213:1: ( '(' )
            {
            // InternalDsl.g:7213:1: ( '(' )
            // InternalDsl.g:7214:2: '('
            {
             before(grammarAccess.getNetworkInterfaceAccess().getLeftParenthesisKeyword_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getNetworkInterfaceAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__NetworkInterface__Group__2__Impl"


    // $ANTLR start "rule__NetworkInterface__Group__3"
    // InternalDsl.g:7223:1: rule__NetworkInterface__Group__3 : rule__NetworkInterface__Group__3__Impl rule__NetworkInterface__Group__4 ;
    public final void rule__NetworkInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7227:1: ( rule__NetworkInterface__Group__3__Impl rule__NetworkInterface__Group__4 )
            // InternalDsl.g:7228:2: rule__NetworkInterface__Group__3__Impl rule__NetworkInterface__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__NetworkInterface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkInterface__Group__4();

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
    // $ANTLR end "rule__NetworkInterface__Group__3"


    // $ANTLR start "rule__NetworkInterface__Group__3__Impl"
    // InternalDsl.g:7235:1: rule__NetworkInterface__Group__3__Impl : ( ( rule__NetworkInterface__IpAddressAssignment_3 ) ) ;
    public final void rule__NetworkInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7239:1: ( ( ( rule__NetworkInterface__IpAddressAssignment_3 ) ) )
            // InternalDsl.g:7240:1: ( ( rule__NetworkInterface__IpAddressAssignment_3 ) )
            {
            // InternalDsl.g:7240:1: ( ( rule__NetworkInterface__IpAddressAssignment_3 ) )
            // InternalDsl.g:7241:2: ( rule__NetworkInterface__IpAddressAssignment_3 )
            {
             before(grammarAccess.getNetworkInterfaceAccess().getIpAddressAssignment_3()); 
            // InternalDsl.g:7242:2: ( rule__NetworkInterface__IpAddressAssignment_3 )
            // InternalDsl.g:7242:3: rule__NetworkInterface__IpAddressAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__NetworkInterface__IpAddressAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNetworkInterfaceAccess().getIpAddressAssignment_3()); 

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
    // $ANTLR end "rule__NetworkInterface__Group__3__Impl"


    // $ANTLR start "rule__NetworkInterface__Group__4"
    // InternalDsl.g:7250:1: rule__NetworkInterface__Group__4 : rule__NetworkInterface__Group__4__Impl ;
    public final void rule__NetworkInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7254:1: ( rule__NetworkInterface__Group__4__Impl )
            // InternalDsl.g:7255:2: rule__NetworkInterface__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NetworkInterface__Group__4__Impl();

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
    // $ANTLR end "rule__NetworkInterface__Group__4"


    // $ANTLR start "rule__NetworkInterface__Group__4__Impl"
    // InternalDsl.g:7261:1: rule__NetworkInterface__Group__4__Impl : ( ')' ) ;
    public final void rule__NetworkInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7265:1: ( ( ')' ) )
            // InternalDsl.g:7266:1: ( ')' )
            {
            // InternalDsl.g:7266:1: ( ')' )
            // InternalDsl.g:7267:2: ')'
            {
             before(grammarAccess.getNetworkInterfaceAccess().getRightParenthesisKeyword_4()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getNetworkInterfaceAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__NetworkInterface__Group__4__Impl"


    // $ANTLR start "rule__WebServer__Group__0"
    // InternalDsl.g:7277:1: rule__WebServer__Group__0 : rule__WebServer__Group__0__Impl rule__WebServer__Group__1 ;
    public final void rule__WebServer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7281:1: ( rule__WebServer__Group__0__Impl rule__WebServer__Group__1 )
            // InternalDsl.g:7282:2: rule__WebServer__Group__0__Impl rule__WebServer__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__WebServer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WebServer__Group__1();

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
    // $ANTLR end "rule__WebServer__Group__0"


    // $ANTLR start "rule__WebServer__Group__0__Impl"
    // InternalDsl.g:7289:1: rule__WebServer__Group__0__Impl : ( ( rule__WebServer__NameAssignment_0 ) ) ;
    public final void rule__WebServer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7293:1: ( ( ( rule__WebServer__NameAssignment_0 ) ) )
            // InternalDsl.g:7294:1: ( ( rule__WebServer__NameAssignment_0 ) )
            {
            // InternalDsl.g:7294:1: ( ( rule__WebServer__NameAssignment_0 ) )
            // InternalDsl.g:7295:2: ( rule__WebServer__NameAssignment_0 )
            {
             before(grammarAccess.getWebServerAccess().getNameAssignment_0()); 
            // InternalDsl.g:7296:2: ( rule__WebServer__NameAssignment_0 )
            // InternalDsl.g:7296:3: rule__WebServer__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__WebServer__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getWebServerAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__WebServer__Group__0__Impl"


    // $ANTLR start "rule__WebServer__Group__1"
    // InternalDsl.g:7304:1: rule__WebServer__Group__1 : rule__WebServer__Group__1__Impl rule__WebServer__Group__2 ;
    public final void rule__WebServer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7308:1: ( rule__WebServer__Group__1__Impl rule__WebServer__Group__2 )
            // InternalDsl.g:7309:2: rule__WebServer__Group__1__Impl rule__WebServer__Group__2
            {
            pushFollow(FOLLOW_58);
            rule__WebServer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WebServer__Group__2();

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
    // $ANTLR end "rule__WebServer__Group__1"


    // $ANTLR start "rule__WebServer__Group__1__Impl"
    // InternalDsl.g:7316:1: rule__WebServer__Group__1__Impl : ( '(' ) ;
    public final void rule__WebServer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7320:1: ( ( '(' ) )
            // InternalDsl.g:7321:1: ( '(' )
            {
            // InternalDsl.g:7321:1: ( '(' )
            // InternalDsl.g:7322:2: '('
            {
             before(grammarAccess.getWebServerAccess().getLeftParenthesisKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getWebServerAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__WebServer__Group__1__Impl"


    // $ANTLR start "rule__WebServer__Group__2"
    // InternalDsl.g:7331:1: rule__WebServer__Group__2 : rule__WebServer__Group__2__Impl rule__WebServer__Group__3 ;
    public final void rule__WebServer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7335:1: ( rule__WebServer__Group__2__Impl rule__WebServer__Group__3 )
            // InternalDsl.g:7336:2: rule__WebServer__Group__2__Impl rule__WebServer__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__WebServer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WebServer__Group__3();

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
    // $ANTLR end "rule__WebServer__Group__2"


    // $ANTLR start "rule__WebServer__Group__2__Impl"
    // InternalDsl.g:7343:1: rule__WebServer__Group__2__Impl : ( ( rule__WebServer__TypeAssignment_2 ) ) ;
    public final void rule__WebServer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7347:1: ( ( ( rule__WebServer__TypeAssignment_2 ) ) )
            // InternalDsl.g:7348:1: ( ( rule__WebServer__TypeAssignment_2 ) )
            {
            // InternalDsl.g:7348:1: ( ( rule__WebServer__TypeAssignment_2 ) )
            // InternalDsl.g:7349:2: ( rule__WebServer__TypeAssignment_2 )
            {
             before(grammarAccess.getWebServerAccess().getTypeAssignment_2()); 
            // InternalDsl.g:7350:2: ( rule__WebServer__TypeAssignment_2 )
            // InternalDsl.g:7350:3: rule__WebServer__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__WebServer__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWebServerAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__WebServer__Group__2__Impl"


    // $ANTLR start "rule__WebServer__Group__3"
    // InternalDsl.g:7358:1: rule__WebServer__Group__3 : rule__WebServer__Group__3__Impl rule__WebServer__Group__4 ;
    public final void rule__WebServer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7362:1: ( rule__WebServer__Group__3__Impl rule__WebServer__Group__4 )
            // InternalDsl.g:7363:2: rule__WebServer__Group__3__Impl rule__WebServer__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__WebServer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WebServer__Group__4();

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
    // $ANTLR end "rule__WebServer__Group__3"


    // $ANTLR start "rule__WebServer__Group__3__Impl"
    // InternalDsl.g:7370:1: rule__WebServer__Group__3__Impl : ( ',' ) ;
    public final void rule__WebServer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7374:1: ( ( ',' ) )
            // InternalDsl.g:7375:1: ( ',' )
            {
            // InternalDsl.g:7375:1: ( ',' )
            // InternalDsl.g:7376:2: ','
            {
             before(grammarAccess.getWebServerAccess().getCommaKeyword_3()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getWebServerAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__WebServer__Group__3__Impl"


    // $ANTLR start "rule__WebServer__Group__4"
    // InternalDsl.g:7385:1: rule__WebServer__Group__4 : rule__WebServer__Group__4__Impl rule__WebServer__Group__5 ;
    public final void rule__WebServer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7389:1: ( rule__WebServer__Group__4__Impl rule__WebServer__Group__5 )
            // InternalDsl.g:7390:2: rule__WebServer__Group__4__Impl rule__WebServer__Group__5
            {
            pushFollow(FOLLOW_59);
            rule__WebServer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WebServer__Group__5();

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
    // $ANTLR end "rule__WebServer__Group__4"


    // $ANTLR start "rule__WebServer__Group__4__Impl"
    // InternalDsl.g:7397:1: rule__WebServer__Group__4__Impl : ( ( rule__WebServer__PortAssignment_4 ) ) ;
    public final void rule__WebServer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7401:1: ( ( ( rule__WebServer__PortAssignment_4 ) ) )
            // InternalDsl.g:7402:1: ( ( rule__WebServer__PortAssignment_4 ) )
            {
            // InternalDsl.g:7402:1: ( ( rule__WebServer__PortAssignment_4 ) )
            // InternalDsl.g:7403:2: ( rule__WebServer__PortAssignment_4 )
            {
             before(grammarAccess.getWebServerAccess().getPortAssignment_4()); 
            // InternalDsl.g:7404:2: ( rule__WebServer__PortAssignment_4 )
            // InternalDsl.g:7404:3: rule__WebServer__PortAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__WebServer__PortAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getWebServerAccess().getPortAssignment_4()); 

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
    // $ANTLR end "rule__WebServer__Group__4__Impl"


    // $ANTLR start "rule__WebServer__Group__5"
    // InternalDsl.g:7412:1: rule__WebServer__Group__5 : rule__WebServer__Group__5__Impl rule__WebServer__Group__6 ;
    public final void rule__WebServer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7416:1: ( rule__WebServer__Group__5__Impl rule__WebServer__Group__6 )
            // InternalDsl.g:7417:2: rule__WebServer__Group__5__Impl rule__WebServer__Group__6
            {
            pushFollow(FOLLOW_59);
            rule__WebServer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WebServer__Group__6();

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
    // $ANTLR end "rule__WebServer__Group__5"


    // $ANTLR start "rule__WebServer__Group__5__Impl"
    // InternalDsl.g:7424:1: rule__WebServer__Group__5__Impl : ( ( rule__WebServer__Group_5__0 )? ) ;
    public final void rule__WebServer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7428:1: ( ( ( rule__WebServer__Group_5__0 )? ) )
            // InternalDsl.g:7429:1: ( ( rule__WebServer__Group_5__0 )? )
            {
            // InternalDsl.g:7429:1: ( ( rule__WebServer__Group_5__0 )? )
            // InternalDsl.g:7430:2: ( rule__WebServer__Group_5__0 )?
            {
             before(grammarAccess.getWebServerAccess().getGroup_5()); 
            // InternalDsl.g:7431:2: ( rule__WebServer__Group_5__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==49) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDsl.g:7431:3: rule__WebServer__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WebServer__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWebServerAccess().getGroup_5()); 

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
    // $ANTLR end "rule__WebServer__Group__5__Impl"


    // $ANTLR start "rule__WebServer__Group__6"
    // InternalDsl.g:7439:1: rule__WebServer__Group__6 : rule__WebServer__Group__6__Impl ;
    public final void rule__WebServer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7443:1: ( rule__WebServer__Group__6__Impl )
            // InternalDsl.g:7444:2: rule__WebServer__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WebServer__Group__6__Impl();

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
    // $ANTLR end "rule__WebServer__Group__6"


    // $ANTLR start "rule__WebServer__Group__6__Impl"
    // InternalDsl.g:7450:1: rule__WebServer__Group__6__Impl : ( ')' ) ;
    public final void rule__WebServer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7454:1: ( ( ')' ) )
            // InternalDsl.g:7455:1: ( ')' )
            {
            // InternalDsl.g:7455:1: ( ')' )
            // InternalDsl.g:7456:2: ')'
            {
             before(grammarAccess.getWebServerAccess().getRightParenthesisKeyword_6()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getWebServerAccess().getRightParenthesisKeyword_6()); 

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
    // $ANTLR end "rule__WebServer__Group__6__Impl"


    // $ANTLR start "rule__WebServer__Group_5__0"
    // InternalDsl.g:7466:1: rule__WebServer__Group_5__0 : rule__WebServer__Group_5__0__Impl rule__WebServer__Group_5__1 ;
    public final void rule__WebServer__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7470:1: ( rule__WebServer__Group_5__0__Impl rule__WebServer__Group_5__1 )
            // InternalDsl.g:7471:2: rule__WebServer__Group_5__0__Impl rule__WebServer__Group_5__1
            {
            pushFollow(FOLLOW_11);
            rule__WebServer__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WebServer__Group_5__1();

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
    // $ANTLR end "rule__WebServer__Group_5__0"


    // $ANTLR start "rule__WebServer__Group_5__0__Impl"
    // InternalDsl.g:7478:1: rule__WebServer__Group_5__0__Impl : ( ',' ) ;
    public final void rule__WebServer__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7482:1: ( ( ',' ) )
            // InternalDsl.g:7483:1: ( ',' )
            {
            // InternalDsl.g:7483:1: ( ',' )
            // InternalDsl.g:7484:2: ','
            {
             before(grammarAccess.getWebServerAccess().getCommaKeyword_5_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getWebServerAccess().getCommaKeyword_5_0()); 

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
    // $ANTLR end "rule__WebServer__Group_5__0__Impl"


    // $ANTLR start "rule__WebServer__Group_5__1"
    // InternalDsl.g:7493:1: rule__WebServer__Group_5__1 : rule__WebServer__Group_5__1__Impl rule__WebServer__Group_5__2 ;
    public final void rule__WebServer__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7497:1: ( rule__WebServer__Group_5__1__Impl rule__WebServer__Group_5__2 )
            // InternalDsl.g:7498:2: rule__WebServer__Group_5__1__Impl rule__WebServer__Group_5__2
            {
            pushFollow(FOLLOW_26);
            rule__WebServer__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WebServer__Group_5__2();

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
    // $ANTLR end "rule__WebServer__Group_5__1"


    // $ANTLR start "rule__WebServer__Group_5__1__Impl"
    // InternalDsl.g:7505:1: rule__WebServer__Group_5__1__Impl : ( ( rule__WebServer__ProxyAssignment_5_1 ) ) ;
    public final void rule__WebServer__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7509:1: ( ( ( rule__WebServer__ProxyAssignment_5_1 ) ) )
            // InternalDsl.g:7510:1: ( ( rule__WebServer__ProxyAssignment_5_1 ) )
            {
            // InternalDsl.g:7510:1: ( ( rule__WebServer__ProxyAssignment_5_1 ) )
            // InternalDsl.g:7511:2: ( rule__WebServer__ProxyAssignment_5_1 )
            {
             before(grammarAccess.getWebServerAccess().getProxyAssignment_5_1()); 
            // InternalDsl.g:7512:2: ( rule__WebServer__ProxyAssignment_5_1 )
            // InternalDsl.g:7512:3: rule__WebServer__ProxyAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__WebServer__ProxyAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getWebServerAccess().getProxyAssignment_5_1()); 

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
    // $ANTLR end "rule__WebServer__Group_5__1__Impl"


    // $ANTLR start "rule__WebServer__Group_5__2"
    // InternalDsl.g:7520:1: rule__WebServer__Group_5__2 : rule__WebServer__Group_5__2__Impl ;
    public final void rule__WebServer__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7524:1: ( rule__WebServer__Group_5__2__Impl )
            // InternalDsl.g:7525:2: rule__WebServer__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WebServer__Group_5__2__Impl();

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
    // $ANTLR end "rule__WebServer__Group_5__2"


    // $ANTLR start "rule__WebServer__Group_5__2__Impl"
    // InternalDsl.g:7531:1: rule__WebServer__Group_5__2__Impl : ( ( rule__WebServer__Group_5_2__0 )* ) ;
    public final void rule__WebServer__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7535:1: ( ( ( rule__WebServer__Group_5_2__0 )* ) )
            // InternalDsl.g:7536:1: ( ( rule__WebServer__Group_5_2__0 )* )
            {
            // InternalDsl.g:7536:1: ( ( rule__WebServer__Group_5_2__0 )* )
            // InternalDsl.g:7537:2: ( rule__WebServer__Group_5_2__0 )*
            {
             before(grammarAccess.getWebServerAccess().getGroup_5_2()); 
            // InternalDsl.g:7538:2: ( rule__WebServer__Group_5_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==49) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalDsl.g:7538:3: rule__WebServer__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_60);
            	    rule__WebServer__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getWebServerAccess().getGroup_5_2()); 

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
    // $ANTLR end "rule__WebServer__Group_5__2__Impl"


    // $ANTLR start "rule__WebServer__Group_5_2__0"
    // InternalDsl.g:7547:1: rule__WebServer__Group_5_2__0 : rule__WebServer__Group_5_2__0__Impl rule__WebServer__Group_5_2__1 ;
    public final void rule__WebServer__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7551:1: ( rule__WebServer__Group_5_2__0__Impl rule__WebServer__Group_5_2__1 )
            // InternalDsl.g:7552:2: rule__WebServer__Group_5_2__0__Impl rule__WebServer__Group_5_2__1
            {
            pushFollow(FOLLOW_11);
            rule__WebServer__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WebServer__Group_5_2__1();

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
    // $ANTLR end "rule__WebServer__Group_5_2__0"


    // $ANTLR start "rule__WebServer__Group_5_2__0__Impl"
    // InternalDsl.g:7559:1: rule__WebServer__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__WebServer__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7563:1: ( ( ',' ) )
            // InternalDsl.g:7564:1: ( ',' )
            {
            // InternalDsl.g:7564:1: ( ',' )
            // InternalDsl.g:7565:2: ','
            {
             before(grammarAccess.getWebServerAccess().getCommaKeyword_5_2_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getWebServerAccess().getCommaKeyword_5_2_0()); 

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
    // $ANTLR end "rule__WebServer__Group_5_2__0__Impl"


    // $ANTLR start "rule__WebServer__Group_5_2__1"
    // InternalDsl.g:7574:1: rule__WebServer__Group_5_2__1 : rule__WebServer__Group_5_2__1__Impl ;
    public final void rule__WebServer__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7578:1: ( rule__WebServer__Group_5_2__1__Impl )
            // InternalDsl.g:7579:2: rule__WebServer__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WebServer__Group_5_2__1__Impl();

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
    // $ANTLR end "rule__WebServer__Group_5_2__1"


    // $ANTLR start "rule__WebServer__Group_5_2__1__Impl"
    // InternalDsl.g:7585:1: rule__WebServer__Group_5_2__1__Impl : ( ( rule__WebServer__ProxyAssignment_5_2_1 ) ) ;
    public final void rule__WebServer__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7589:1: ( ( ( rule__WebServer__ProxyAssignment_5_2_1 ) ) )
            // InternalDsl.g:7590:1: ( ( rule__WebServer__ProxyAssignment_5_2_1 ) )
            {
            // InternalDsl.g:7590:1: ( ( rule__WebServer__ProxyAssignment_5_2_1 ) )
            // InternalDsl.g:7591:2: ( rule__WebServer__ProxyAssignment_5_2_1 )
            {
             before(grammarAccess.getWebServerAccess().getProxyAssignment_5_2_1()); 
            // InternalDsl.g:7592:2: ( rule__WebServer__ProxyAssignment_5_2_1 )
            // InternalDsl.g:7592:3: rule__WebServer__ProxyAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__WebServer__ProxyAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getWebServerAccess().getProxyAssignment_5_2_1()); 

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
    // $ANTLR end "rule__WebServer__Group_5_2__1__Impl"


    // $ANTLR start "rule__CalendarScale__Group__0"
    // InternalDsl.g:7601:1: rule__CalendarScale__Group__0 : rule__CalendarScale__Group__0__Impl rule__CalendarScale__Group__1 ;
    public final void rule__CalendarScale__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7605:1: ( rule__CalendarScale__Group__0__Impl rule__CalendarScale__Group__1 )
            // InternalDsl.g:7606:2: rule__CalendarScale__Group__0__Impl rule__CalendarScale__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__CalendarScale__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalendarScale__Group__1();

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
    // $ANTLR end "rule__CalendarScale__Group__0"


    // $ANTLR start "rule__CalendarScale__Group__0__Impl"
    // InternalDsl.g:7613:1: rule__CalendarScale__Group__0__Impl : ( 'scale' ) ;
    public final void rule__CalendarScale__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7617:1: ( ( 'scale' ) )
            // InternalDsl.g:7618:1: ( 'scale' )
            {
            // InternalDsl.g:7618:1: ( 'scale' )
            // InternalDsl.g:7619:2: 'scale'
            {
             before(grammarAccess.getCalendarScaleAccess().getScaleKeyword_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getCalendarScaleAccess().getScaleKeyword_0()); 

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
    // $ANTLR end "rule__CalendarScale__Group__0__Impl"


    // $ANTLR start "rule__CalendarScale__Group__1"
    // InternalDsl.g:7628:1: rule__CalendarScale__Group__1 : rule__CalendarScale__Group__1__Impl rule__CalendarScale__Group__2 ;
    public final void rule__CalendarScale__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7632:1: ( rule__CalendarScale__Group__1__Impl rule__CalendarScale__Group__2 )
            // InternalDsl.g:7633:2: rule__CalendarScale__Group__1__Impl rule__CalendarScale__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__CalendarScale__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalendarScale__Group__2();

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
    // $ANTLR end "rule__CalendarScale__Group__1"


    // $ANTLR start "rule__CalendarScale__Group__1__Impl"
    // InternalDsl.g:7640:1: rule__CalendarScale__Group__1__Impl : ( ( rule__CalendarScale__NameAssignment_1 ) ) ;
    public final void rule__CalendarScale__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7644:1: ( ( ( rule__CalendarScale__NameAssignment_1 ) ) )
            // InternalDsl.g:7645:1: ( ( rule__CalendarScale__NameAssignment_1 ) )
            {
            // InternalDsl.g:7645:1: ( ( rule__CalendarScale__NameAssignment_1 ) )
            // InternalDsl.g:7646:2: ( rule__CalendarScale__NameAssignment_1 )
            {
             before(grammarAccess.getCalendarScaleAccess().getNameAssignment_1()); 
            // InternalDsl.g:7647:2: ( rule__CalendarScale__NameAssignment_1 )
            // InternalDsl.g:7647:3: rule__CalendarScale__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CalendarScale__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCalendarScaleAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__CalendarScale__Group__1__Impl"


    // $ANTLR start "rule__CalendarScale__Group__2"
    // InternalDsl.g:7655:1: rule__CalendarScale__Group__2 : rule__CalendarScale__Group__2__Impl rule__CalendarScale__Group__3 ;
    public final void rule__CalendarScale__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7659:1: ( rule__CalendarScale__Group__2__Impl rule__CalendarScale__Group__3 )
            // InternalDsl.g:7660:2: rule__CalendarScale__Group__2__Impl rule__CalendarScale__Group__3
            {
            pushFollow(FOLLOW_61);
            rule__CalendarScale__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalendarScale__Group__3();

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
    // $ANTLR end "rule__CalendarScale__Group__2"


    // $ANTLR start "rule__CalendarScale__Group__2__Impl"
    // InternalDsl.g:7667:1: rule__CalendarScale__Group__2__Impl : ( '(' ) ;
    public final void rule__CalendarScale__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7671:1: ( ( '(' ) )
            // InternalDsl.g:7672:1: ( '(' )
            {
            // InternalDsl.g:7672:1: ( '(' )
            // InternalDsl.g:7673:2: '('
            {
             before(grammarAccess.getCalendarScaleAccess().getLeftParenthesisKeyword_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getCalendarScaleAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__CalendarScale__Group__2__Impl"


    // $ANTLR start "rule__CalendarScale__Group__3"
    // InternalDsl.g:7682:1: rule__CalendarScale__Group__3 : rule__CalendarScale__Group__3__Impl rule__CalendarScale__Group__4 ;
    public final void rule__CalendarScale__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7686:1: ( rule__CalendarScale__Group__3__Impl rule__CalendarScale__Group__4 )
            // InternalDsl.g:7687:2: rule__CalendarScale__Group__3__Impl rule__CalendarScale__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__CalendarScale__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalendarScale__Group__4();

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
    // $ANTLR end "rule__CalendarScale__Group__3"


    // $ANTLR start "rule__CalendarScale__Group__3__Impl"
    // InternalDsl.g:7694:1: rule__CalendarScale__Group__3__Impl : ( '[' ) ;
    public final void rule__CalendarScale__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7698:1: ( ( '[' ) )
            // InternalDsl.g:7699:1: ( '[' )
            {
            // InternalDsl.g:7699:1: ( '[' )
            // InternalDsl.g:7700:2: '['
            {
             before(grammarAccess.getCalendarScaleAccess().getLeftSquareBracketKeyword_3()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getCalendarScaleAccess().getLeftSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__CalendarScale__Group__3__Impl"


    // $ANTLR start "rule__CalendarScale__Group__4"
    // InternalDsl.g:7709:1: rule__CalendarScale__Group__4 : rule__CalendarScale__Group__4__Impl rule__CalendarScale__Group__5 ;
    public final void rule__CalendarScale__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7713:1: ( rule__CalendarScale__Group__4__Impl rule__CalendarScale__Group__5 )
            // InternalDsl.g:7714:2: rule__CalendarScale__Group__4__Impl rule__CalendarScale__Group__5
            {
            pushFollow(FOLLOW_62);
            rule__CalendarScale__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalendarScale__Group__5();

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
    // $ANTLR end "rule__CalendarScale__Group__4"


    // $ANTLR start "rule__CalendarScale__Group__4__Impl"
    // InternalDsl.g:7721:1: rule__CalendarScale__Group__4__Impl : ( ( rule__CalendarScale__FactorsAssignment_4 ) ) ;
    public final void rule__CalendarScale__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7725:1: ( ( ( rule__CalendarScale__FactorsAssignment_4 ) ) )
            // InternalDsl.g:7726:1: ( ( rule__CalendarScale__FactorsAssignment_4 ) )
            {
            // InternalDsl.g:7726:1: ( ( rule__CalendarScale__FactorsAssignment_4 ) )
            // InternalDsl.g:7727:2: ( rule__CalendarScale__FactorsAssignment_4 )
            {
             before(grammarAccess.getCalendarScaleAccess().getFactorsAssignment_4()); 
            // InternalDsl.g:7728:2: ( rule__CalendarScale__FactorsAssignment_4 )
            // InternalDsl.g:7728:3: rule__CalendarScale__FactorsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CalendarScale__FactorsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCalendarScaleAccess().getFactorsAssignment_4()); 

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
    // $ANTLR end "rule__CalendarScale__Group__4__Impl"


    // $ANTLR start "rule__CalendarScale__Group__5"
    // InternalDsl.g:7736:1: rule__CalendarScale__Group__5 : rule__CalendarScale__Group__5__Impl rule__CalendarScale__Group__6 ;
    public final void rule__CalendarScale__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7740:1: ( rule__CalendarScale__Group__5__Impl rule__CalendarScale__Group__6 )
            // InternalDsl.g:7741:2: rule__CalendarScale__Group__5__Impl rule__CalendarScale__Group__6
            {
            pushFollow(FOLLOW_63);
            rule__CalendarScale__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalendarScale__Group__6();

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
    // $ANTLR end "rule__CalendarScale__Group__5"


    // $ANTLR start "rule__CalendarScale__Group__5__Impl"
    // InternalDsl.g:7748:1: rule__CalendarScale__Group__5__Impl : ( ( rule__CalendarScale__PeriodsAssignment_5 ) ) ;
    public final void rule__CalendarScale__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7752:1: ( ( ( rule__CalendarScale__PeriodsAssignment_5 ) ) )
            // InternalDsl.g:7753:1: ( ( rule__CalendarScale__PeriodsAssignment_5 ) )
            {
            // InternalDsl.g:7753:1: ( ( rule__CalendarScale__PeriodsAssignment_5 ) )
            // InternalDsl.g:7754:2: ( rule__CalendarScale__PeriodsAssignment_5 )
            {
             before(grammarAccess.getCalendarScaleAccess().getPeriodsAssignment_5()); 
            // InternalDsl.g:7755:2: ( rule__CalendarScale__PeriodsAssignment_5 )
            // InternalDsl.g:7755:3: rule__CalendarScale__PeriodsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__CalendarScale__PeriodsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCalendarScaleAccess().getPeriodsAssignment_5()); 

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
    // $ANTLR end "rule__CalendarScale__Group__5__Impl"


    // $ANTLR start "rule__CalendarScale__Group__6"
    // InternalDsl.g:7763:1: rule__CalendarScale__Group__6 : rule__CalendarScale__Group__6__Impl rule__CalendarScale__Group__7 ;
    public final void rule__CalendarScale__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7767:1: ( rule__CalendarScale__Group__6__Impl rule__CalendarScale__Group__7 )
            // InternalDsl.g:7768:2: rule__CalendarScale__Group__6__Impl rule__CalendarScale__Group__7
            {
            pushFollow(FOLLOW_63);
            rule__CalendarScale__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalendarScale__Group__7();

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
    // $ANTLR end "rule__CalendarScale__Group__6"


    // $ANTLR start "rule__CalendarScale__Group__6__Impl"
    // InternalDsl.g:7775:1: rule__CalendarScale__Group__6__Impl : ( ( rule__CalendarScale__Group_6__0 )* ) ;
    public final void rule__CalendarScale__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7779:1: ( ( ( rule__CalendarScale__Group_6__0 )* ) )
            // InternalDsl.g:7780:1: ( ( rule__CalendarScale__Group_6__0 )* )
            {
            // InternalDsl.g:7780:1: ( ( rule__CalendarScale__Group_6__0 )* )
            // InternalDsl.g:7781:2: ( rule__CalendarScale__Group_6__0 )*
            {
             before(grammarAccess.getCalendarScaleAccess().getGroup_6()); 
            // InternalDsl.g:7782:2: ( rule__CalendarScale__Group_6__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==49) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalDsl.g:7782:3: rule__CalendarScale__Group_6__0
            	    {
            	    pushFollow(FOLLOW_60);
            	    rule__CalendarScale__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getCalendarScaleAccess().getGroup_6()); 

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
    // $ANTLR end "rule__CalendarScale__Group__6__Impl"


    // $ANTLR start "rule__CalendarScale__Group__7"
    // InternalDsl.g:7790:1: rule__CalendarScale__Group__7 : rule__CalendarScale__Group__7__Impl rule__CalendarScale__Group__8 ;
    public final void rule__CalendarScale__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7794:1: ( rule__CalendarScale__Group__7__Impl rule__CalendarScale__Group__8 )
            // InternalDsl.g:7795:2: rule__CalendarScale__Group__7__Impl rule__CalendarScale__Group__8
            {
            pushFollow(FOLLOW_28);
            rule__CalendarScale__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalendarScale__Group__8();

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
    // $ANTLR end "rule__CalendarScale__Group__7"


    // $ANTLR start "rule__CalendarScale__Group__7__Impl"
    // InternalDsl.g:7802:1: rule__CalendarScale__Group__7__Impl : ( ']' ) ;
    public final void rule__CalendarScale__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7806:1: ( ( ']' ) )
            // InternalDsl.g:7807:1: ( ']' )
            {
            // InternalDsl.g:7807:1: ( ']' )
            // InternalDsl.g:7808:2: ']'
            {
             before(grammarAccess.getCalendarScaleAccess().getRightSquareBracketKeyword_7()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getCalendarScaleAccess().getRightSquareBracketKeyword_7()); 

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
    // $ANTLR end "rule__CalendarScale__Group__7__Impl"


    // $ANTLR start "rule__CalendarScale__Group__8"
    // InternalDsl.g:7817:1: rule__CalendarScale__Group__8 : rule__CalendarScale__Group__8__Impl ;
    public final void rule__CalendarScale__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7821:1: ( rule__CalendarScale__Group__8__Impl )
            // InternalDsl.g:7822:2: rule__CalendarScale__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CalendarScale__Group__8__Impl();

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
    // $ANTLR end "rule__CalendarScale__Group__8"


    // $ANTLR start "rule__CalendarScale__Group__8__Impl"
    // InternalDsl.g:7828:1: rule__CalendarScale__Group__8__Impl : ( ')' ) ;
    public final void rule__CalendarScale__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7832:1: ( ( ')' ) )
            // InternalDsl.g:7833:1: ( ')' )
            {
            // InternalDsl.g:7833:1: ( ')' )
            // InternalDsl.g:7834:2: ')'
            {
             before(grammarAccess.getCalendarScaleAccess().getRightParenthesisKeyword_8()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getCalendarScaleAccess().getRightParenthesisKeyword_8()); 

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
    // $ANTLR end "rule__CalendarScale__Group__8__Impl"


    // $ANTLR start "rule__CalendarScale__Group_6__0"
    // InternalDsl.g:7844:1: rule__CalendarScale__Group_6__0 : rule__CalendarScale__Group_6__0__Impl rule__CalendarScale__Group_6__1 ;
    public final void rule__CalendarScale__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7848:1: ( rule__CalendarScale__Group_6__0__Impl rule__CalendarScale__Group_6__1 )
            // InternalDsl.g:7849:2: rule__CalendarScale__Group_6__0__Impl rule__CalendarScale__Group_6__1
            {
            pushFollow(FOLLOW_27);
            rule__CalendarScale__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalendarScale__Group_6__1();

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
    // $ANTLR end "rule__CalendarScale__Group_6__0"


    // $ANTLR start "rule__CalendarScale__Group_6__0__Impl"
    // InternalDsl.g:7856:1: rule__CalendarScale__Group_6__0__Impl : ( ',' ) ;
    public final void rule__CalendarScale__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7860:1: ( ( ',' ) )
            // InternalDsl.g:7861:1: ( ',' )
            {
            // InternalDsl.g:7861:1: ( ',' )
            // InternalDsl.g:7862:2: ','
            {
             before(grammarAccess.getCalendarScaleAccess().getCommaKeyword_6_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getCalendarScaleAccess().getCommaKeyword_6_0()); 

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
    // $ANTLR end "rule__CalendarScale__Group_6__0__Impl"


    // $ANTLR start "rule__CalendarScale__Group_6__1"
    // InternalDsl.g:7871:1: rule__CalendarScale__Group_6__1 : rule__CalendarScale__Group_6__1__Impl rule__CalendarScale__Group_6__2 ;
    public final void rule__CalendarScale__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7875:1: ( rule__CalendarScale__Group_6__1__Impl rule__CalendarScale__Group_6__2 )
            // InternalDsl.g:7876:2: rule__CalendarScale__Group_6__1__Impl rule__CalendarScale__Group_6__2
            {
            pushFollow(FOLLOW_62);
            rule__CalendarScale__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalendarScale__Group_6__2();

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
    // $ANTLR end "rule__CalendarScale__Group_6__1"


    // $ANTLR start "rule__CalendarScale__Group_6__1__Impl"
    // InternalDsl.g:7883:1: rule__CalendarScale__Group_6__1__Impl : ( ( rule__CalendarScale__FactorsAssignment_6_1 ) ) ;
    public final void rule__CalendarScale__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7887:1: ( ( ( rule__CalendarScale__FactorsAssignment_6_1 ) ) )
            // InternalDsl.g:7888:1: ( ( rule__CalendarScale__FactorsAssignment_6_1 ) )
            {
            // InternalDsl.g:7888:1: ( ( rule__CalendarScale__FactorsAssignment_6_1 ) )
            // InternalDsl.g:7889:2: ( rule__CalendarScale__FactorsAssignment_6_1 )
            {
             before(grammarAccess.getCalendarScaleAccess().getFactorsAssignment_6_1()); 
            // InternalDsl.g:7890:2: ( rule__CalendarScale__FactorsAssignment_6_1 )
            // InternalDsl.g:7890:3: rule__CalendarScale__FactorsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__CalendarScale__FactorsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getCalendarScaleAccess().getFactorsAssignment_6_1()); 

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
    // $ANTLR end "rule__CalendarScale__Group_6__1__Impl"


    // $ANTLR start "rule__CalendarScale__Group_6__2"
    // InternalDsl.g:7898:1: rule__CalendarScale__Group_6__2 : rule__CalendarScale__Group_6__2__Impl ;
    public final void rule__CalendarScale__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7902:1: ( rule__CalendarScale__Group_6__2__Impl )
            // InternalDsl.g:7903:2: rule__CalendarScale__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CalendarScale__Group_6__2__Impl();

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
    // $ANTLR end "rule__CalendarScale__Group_6__2"


    // $ANTLR start "rule__CalendarScale__Group_6__2__Impl"
    // InternalDsl.g:7909:1: rule__CalendarScale__Group_6__2__Impl : ( ( rule__CalendarScale__PeriodsAssignment_6_2 ) ) ;
    public final void rule__CalendarScale__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7913:1: ( ( ( rule__CalendarScale__PeriodsAssignment_6_2 ) ) )
            // InternalDsl.g:7914:1: ( ( rule__CalendarScale__PeriodsAssignment_6_2 ) )
            {
            // InternalDsl.g:7914:1: ( ( rule__CalendarScale__PeriodsAssignment_6_2 ) )
            // InternalDsl.g:7915:2: ( rule__CalendarScale__PeriodsAssignment_6_2 )
            {
             before(grammarAccess.getCalendarScaleAccess().getPeriodsAssignment_6_2()); 
            // InternalDsl.g:7916:2: ( rule__CalendarScale__PeriodsAssignment_6_2 )
            // InternalDsl.g:7916:3: rule__CalendarScale__PeriodsAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__CalendarScale__PeriodsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getCalendarScaleAccess().getPeriodsAssignment_6_2()); 

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
    // $ANTLR end "rule__CalendarScale__Group_6__2__Impl"


    // $ANTLR start "rule__FactorScale__Group__0"
    // InternalDsl.g:7925:1: rule__FactorScale__Group__0 : rule__FactorScale__Group__0__Impl rule__FactorScale__Group__1 ;
    public final void rule__FactorScale__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7929:1: ( rule__FactorScale__Group__0__Impl rule__FactorScale__Group__1 )
            // InternalDsl.g:7930:2: rule__FactorScale__Group__0__Impl rule__FactorScale__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__FactorScale__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FactorScale__Group__1();

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
    // $ANTLR end "rule__FactorScale__Group__0"


    // $ANTLR start "rule__FactorScale__Group__0__Impl"
    // InternalDsl.g:7937:1: rule__FactorScale__Group__0__Impl : ( 'scale' ) ;
    public final void rule__FactorScale__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7941:1: ( ( 'scale' ) )
            // InternalDsl.g:7942:1: ( 'scale' )
            {
            // InternalDsl.g:7942:1: ( 'scale' )
            // InternalDsl.g:7943:2: 'scale'
            {
             before(grammarAccess.getFactorScaleAccess().getScaleKeyword_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getFactorScaleAccess().getScaleKeyword_0()); 

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
    // $ANTLR end "rule__FactorScale__Group__0__Impl"


    // $ANTLR start "rule__FactorScale__Group__1"
    // InternalDsl.g:7952:1: rule__FactorScale__Group__1 : rule__FactorScale__Group__1__Impl rule__FactorScale__Group__2 ;
    public final void rule__FactorScale__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7956:1: ( rule__FactorScale__Group__1__Impl rule__FactorScale__Group__2 )
            // InternalDsl.g:7957:2: rule__FactorScale__Group__1__Impl rule__FactorScale__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__FactorScale__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FactorScale__Group__2();

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
    // $ANTLR end "rule__FactorScale__Group__1"


    // $ANTLR start "rule__FactorScale__Group__1__Impl"
    // InternalDsl.g:7964:1: rule__FactorScale__Group__1__Impl : ( ( rule__FactorScale__NameAssignment_1 ) ) ;
    public final void rule__FactorScale__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7968:1: ( ( ( rule__FactorScale__NameAssignment_1 ) ) )
            // InternalDsl.g:7969:1: ( ( rule__FactorScale__NameAssignment_1 ) )
            {
            // InternalDsl.g:7969:1: ( ( rule__FactorScale__NameAssignment_1 ) )
            // InternalDsl.g:7970:2: ( rule__FactorScale__NameAssignment_1 )
            {
             before(grammarAccess.getFactorScaleAccess().getNameAssignment_1()); 
            // InternalDsl.g:7971:2: ( rule__FactorScale__NameAssignment_1 )
            // InternalDsl.g:7971:3: rule__FactorScale__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FactorScale__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFactorScaleAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__FactorScale__Group__1__Impl"


    // $ANTLR start "rule__FactorScale__Group__2"
    // InternalDsl.g:7979:1: rule__FactorScale__Group__2 : rule__FactorScale__Group__2__Impl rule__FactorScale__Group__3 ;
    public final void rule__FactorScale__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7983:1: ( rule__FactorScale__Group__2__Impl rule__FactorScale__Group__3 )
            // InternalDsl.g:7984:2: rule__FactorScale__Group__2__Impl rule__FactorScale__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__FactorScale__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FactorScale__Group__3();

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
    // $ANTLR end "rule__FactorScale__Group__2"


    // $ANTLR start "rule__FactorScale__Group__2__Impl"
    // InternalDsl.g:7991:1: rule__FactorScale__Group__2__Impl : ( '(' ) ;
    public final void rule__FactorScale__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:7995:1: ( ( '(' ) )
            // InternalDsl.g:7996:1: ( '(' )
            {
            // InternalDsl.g:7996:1: ( '(' )
            // InternalDsl.g:7997:2: '('
            {
             before(grammarAccess.getFactorScaleAccess().getLeftParenthesisKeyword_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getFactorScaleAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__FactorScale__Group__2__Impl"


    // $ANTLR start "rule__FactorScale__Group__3"
    // InternalDsl.g:8006:1: rule__FactorScale__Group__3 : rule__FactorScale__Group__3__Impl rule__FactorScale__Group__4 ;
    public final void rule__FactorScale__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8010:1: ( rule__FactorScale__Group__3__Impl rule__FactorScale__Group__4 )
            // InternalDsl.g:8011:2: rule__FactorScale__Group__3__Impl rule__FactorScale__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__FactorScale__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FactorScale__Group__4();

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
    // $ANTLR end "rule__FactorScale__Group__3"


    // $ANTLR start "rule__FactorScale__Group__3__Impl"
    // InternalDsl.g:8018:1: rule__FactorScale__Group__3__Impl : ( ( rule__FactorScale__FactorAssignment_3 ) ) ;
    public final void rule__FactorScale__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8022:1: ( ( ( rule__FactorScale__FactorAssignment_3 ) ) )
            // InternalDsl.g:8023:1: ( ( rule__FactorScale__FactorAssignment_3 ) )
            {
            // InternalDsl.g:8023:1: ( ( rule__FactorScale__FactorAssignment_3 ) )
            // InternalDsl.g:8024:2: ( rule__FactorScale__FactorAssignment_3 )
            {
             before(grammarAccess.getFactorScaleAccess().getFactorAssignment_3()); 
            // InternalDsl.g:8025:2: ( rule__FactorScale__FactorAssignment_3 )
            // InternalDsl.g:8025:3: rule__FactorScale__FactorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__FactorScale__FactorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFactorScaleAccess().getFactorAssignment_3()); 

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
    // $ANTLR end "rule__FactorScale__Group__3__Impl"


    // $ANTLR start "rule__FactorScale__Group__4"
    // InternalDsl.g:8033:1: rule__FactorScale__Group__4 : rule__FactorScale__Group__4__Impl rule__FactorScale__Group__5 ;
    public final void rule__FactorScale__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8037:1: ( rule__FactorScale__Group__4__Impl rule__FactorScale__Group__5 )
            // InternalDsl.g:8038:2: rule__FactorScale__Group__4__Impl rule__FactorScale__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__FactorScale__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FactorScale__Group__5();

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
    // $ANTLR end "rule__FactorScale__Group__4"


    // $ANTLR start "rule__FactorScale__Group__4__Impl"
    // InternalDsl.g:8045:1: rule__FactorScale__Group__4__Impl : ( ',' ) ;
    public final void rule__FactorScale__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8049:1: ( ( ',' ) )
            // InternalDsl.g:8050:1: ( ',' )
            {
            // InternalDsl.g:8050:1: ( ',' )
            // InternalDsl.g:8051:2: ','
            {
             before(grammarAccess.getFactorScaleAccess().getCommaKeyword_4()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getFactorScaleAccess().getCommaKeyword_4()); 

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
    // $ANTLR end "rule__FactorScale__Group__4__Impl"


    // $ANTLR start "rule__FactorScale__Group__5"
    // InternalDsl.g:8060:1: rule__FactorScale__Group__5 : rule__FactorScale__Group__5__Impl rule__FactorScale__Group__6 ;
    public final void rule__FactorScale__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8064:1: ( rule__FactorScale__Group__5__Impl rule__FactorScale__Group__6 )
            // InternalDsl.g:8065:2: rule__FactorScale__Group__5__Impl rule__FactorScale__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__FactorScale__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FactorScale__Group__6();

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
    // $ANTLR end "rule__FactorScale__Group__5"


    // $ANTLR start "rule__FactorScale__Group__5__Impl"
    // InternalDsl.g:8072:1: rule__FactorScale__Group__5__Impl : ( ( rule__FactorScale__ZoomsNumberAssignment_5 ) ) ;
    public final void rule__FactorScale__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8076:1: ( ( ( rule__FactorScale__ZoomsNumberAssignment_5 ) ) )
            // InternalDsl.g:8077:1: ( ( rule__FactorScale__ZoomsNumberAssignment_5 ) )
            {
            // InternalDsl.g:8077:1: ( ( rule__FactorScale__ZoomsNumberAssignment_5 ) )
            // InternalDsl.g:8078:2: ( rule__FactorScale__ZoomsNumberAssignment_5 )
            {
             before(grammarAccess.getFactorScaleAccess().getZoomsNumberAssignment_5()); 
            // InternalDsl.g:8079:2: ( rule__FactorScale__ZoomsNumberAssignment_5 )
            // InternalDsl.g:8079:3: rule__FactorScale__ZoomsNumberAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__FactorScale__ZoomsNumberAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFactorScaleAccess().getZoomsNumberAssignment_5()); 

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
    // $ANTLR end "rule__FactorScale__Group__5__Impl"


    // $ANTLR start "rule__FactorScale__Group__6"
    // InternalDsl.g:8087:1: rule__FactorScale__Group__6 : rule__FactorScale__Group__6__Impl ;
    public final void rule__FactorScale__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8091:1: ( rule__FactorScale__Group__6__Impl )
            // InternalDsl.g:8092:2: rule__FactorScale__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FactorScale__Group__6__Impl();

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
    // $ANTLR end "rule__FactorScale__Group__6"


    // $ANTLR start "rule__FactorScale__Group__6__Impl"
    // InternalDsl.g:8098:1: rule__FactorScale__Group__6__Impl : ( ')' ) ;
    public final void rule__FactorScale__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8102:1: ( ( ')' ) )
            // InternalDsl.g:8103:1: ( ')' )
            {
            // InternalDsl.g:8103:1: ( ')' )
            // InternalDsl.g:8104:2: ')'
            {
             before(grammarAccess.getFactorScaleAccess().getRightParenthesisKeyword_6()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getFactorScaleAccess().getRightParenthesisKeyword_6()); 

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
    // $ANTLR end "rule__FactorScale__Group__6__Impl"


    // $ANTLR start "rule__ELong__Group__0"
    // InternalDsl.g:8114:1: rule__ELong__Group__0 : rule__ELong__Group__0__Impl rule__ELong__Group__1 ;
    public final void rule__ELong__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8118:1: ( rule__ELong__Group__0__Impl rule__ELong__Group__1 )
            // InternalDsl.g:8119:2: rule__ELong__Group__0__Impl rule__ELong__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__ELong__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ELong__Group__1();

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
    // $ANTLR end "rule__ELong__Group__0"


    // $ANTLR start "rule__ELong__Group__0__Impl"
    // InternalDsl.g:8126:1: rule__ELong__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__ELong__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8130:1: ( ( ( '-' )? ) )
            // InternalDsl.g:8131:1: ( ( '-' )? )
            {
            // InternalDsl.g:8131:1: ( ( '-' )? )
            // InternalDsl.g:8132:2: ( '-' )?
            {
             before(grammarAccess.getELongAccess().getHyphenMinusKeyword_0()); 
            // InternalDsl.g:8133:2: ( '-' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==63) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDsl.g:8133:3: '-'
                    {
                    match(input,63,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getELongAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__ELong__Group__0__Impl"


    // $ANTLR start "rule__ELong__Group__1"
    // InternalDsl.g:8141:1: rule__ELong__Group__1 : rule__ELong__Group__1__Impl ;
    public final void rule__ELong__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8145:1: ( rule__ELong__Group__1__Impl )
            // InternalDsl.g:8146:2: rule__ELong__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ELong__Group__1__Impl();

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
    // $ANTLR end "rule__ELong__Group__1"


    // $ANTLR start "rule__ELong__Group__1__Impl"
    // InternalDsl.g:8152:1: rule__ELong__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__ELong__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8156:1: ( ( RULE_INT ) )
            // InternalDsl.g:8157:1: ( RULE_INT )
            {
            // InternalDsl.g:8157:1: ( RULE_INT )
            // InternalDsl.g:8158:2: RULE_INT
            {
             before(grammarAccess.getELongAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getELongAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__ELong__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalDsl.g:8168:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8172:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalDsl.g:8173:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

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
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalDsl.g:8180:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8184:1: ( ( ( '-' )? ) )
            // InternalDsl.g:8185:1: ( ( '-' )? )
            {
            // InternalDsl.g:8185:1: ( ( '-' )? )
            // InternalDsl.g:8186:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalDsl.g:8187:2: ( '-' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==63) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDsl.g:8187:3: '-'
                    {
                    match(input,63,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalDsl.g:8195:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8199:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalDsl.g:8200:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

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
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalDsl.g:8207:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8211:1: ( ( ( RULE_INT )? ) )
            // InternalDsl.g:8212:1: ( ( RULE_INT )? )
            {
            // InternalDsl.g:8212:1: ( ( RULE_INT )? )
            // InternalDsl.g:8213:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalDsl.g:8214:2: ( RULE_INT )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_INT) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDsl.g:8214:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalDsl.g:8222:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8226:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalDsl.g:8227:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_64);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

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
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalDsl.g:8234:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8238:1: ( ( '.' ) )
            // InternalDsl.g:8239:1: ( '.' )
            {
            // InternalDsl.g:8239:1: ( '.' )
            // InternalDsl.g:8240:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalDsl.g:8249:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8253:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalDsl.g:8254:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_65);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

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
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalDsl.g:8261:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8265:1: ( ( RULE_INT ) )
            // InternalDsl.g:8266:1: ( RULE_INT )
            {
            // InternalDsl.g:8266:1: ( RULE_INT )
            // InternalDsl.g:8267:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalDsl.g:8276:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8280:1: ( rule__EDouble__Group__4__Impl )
            // InternalDsl.g:8281:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

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
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalDsl.g:8287:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8291:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalDsl.g:8292:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalDsl.g:8292:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalDsl.g:8293:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalDsl.g:8294:2: ( rule__EDouble__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=12 && LA33_0<=13)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDsl.g:8294:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

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
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalDsl.g:8303:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8307:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalDsl.g:8308:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_27);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

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
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalDsl.g:8315:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8319:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalDsl.g:8320:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalDsl.g:8320:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalDsl.g:8321:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalDsl.g:8322:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalDsl.g:8322:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

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
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalDsl.g:8330:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8334:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalDsl.g:8335:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_27);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

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
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalDsl.g:8342:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8346:1: ( ( ( '-' )? ) )
            // InternalDsl.g:8347:1: ( ( '-' )? )
            {
            // InternalDsl.g:8347:1: ( ( '-' )? )
            // InternalDsl.g:8348:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalDsl.g:8349:2: ( '-' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==63) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDsl.g:8349:3: '-'
                    {
                    match(input,63,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

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
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalDsl.g:8357:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8361:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalDsl.g:8362:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

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
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalDsl.g:8368:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8372:1: ( ( RULE_INT ) )
            // InternalDsl.g:8373:1: ( RULE_INT )
            {
            // InternalDsl.g:8373:1: ( RULE_INT )
            // InternalDsl.g:8374:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

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
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalDsl.g:8384:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8388:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalDsl.g:8389:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalDsl.g:8396:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8400:1: ( ( ( '-' )? ) )
            // InternalDsl.g:8401:1: ( ( '-' )? )
            {
            // InternalDsl.g:8401:1: ( ( '-' )? )
            // InternalDsl.g:8402:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalDsl.g:8403:2: ( '-' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==63) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDsl.g:8403:3: '-'
                    {
                    match(input,63,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalDsl.g:8411:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8415:1: ( rule__EInt__Group__1__Impl )
            // InternalDsl.g:8416:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalDsl.g:8422:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8426:1: ( ( RULE_INT ) )
            // InternalDsl.g:8427:1: ( RULE_INT )
            {
            // InternalDsl.g:8427:1: ( RULE_INT )
            // InternalDsl.g:8428:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__TimeSeriesFramework__PlatformAssignment_0"
    // InternalDsl.g:8438:1: rule__TimeSeriesFramework__PlatformAssignment_0 : ( rulePlatform ) ;
    public final void rule__TimeSeriesFramework__PlatformAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8442:1: ( ( rulePlatform ) )
            // InternalDsl.g:8443:2: ( rulePlatform )
            {
            // InternalDsl.g:8443:2: ( rulePlatform )
            // InternalDsl.g:8444:3: rulePlatform
            {
             before(grammarAccess.getTimeSeriesFrameworkAccess().getPlatformPlatformParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePlatform();

            state._fsp--;

             after(grammarAccess.getTimeSeriesFrameworkAccess().getPlatformPlatformParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__TimeSeriesFramework__PlatformAssignment_0"


    // $ANTLR start "rule__TimeSeriesFramework__DataAssignment_1"
    // InternalDsl.g:8453:1: rule__TimeSeriesFramework__DataAssignment_1 : ( ruleData ) ;
    public final void rule__TimeSeriesFramework__DataAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8457:1: ( ( ruleData ) )
            // InternalDsl.g:8458:2: ( ruleData )
            {
            // InternalDsl.g:8458:2: ( ruleData )
            // InternalDsl.g:8459:3: ruleData
            {
             before(grammarAccess.getTimeSeriesFrameworkAccess().getDataDataParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getTimeSeriesFrameworkAccess().getDataDataParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__TimeSeriesFramework__DataAssignment_1"


    // $ANTLR start "rule__TimeSeriesFramework__ClientsAssignment_4"
    // InternalDsl.g:8468:1: rule__TimeSeriesFramework__ClientsAssignment_4 : ( ruleVisualizationClient ) ;
    public final void rule__TimeSeriesFramework__ClientsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8472:1: ( ( ruleVisualizationClient ) )
            // InternalDsl.g:8473:2: ( ruleVisualizationClient )
            {
            // InternalDsl.g:8473:2: ( ruleVisualizationClient )
            // InternalDsl.g:8474:3: ruleVisualizationClient
            {
             before(grammarAccess.getTimeSeriesFrameworkAccess().getClientsVisualizationClientParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleVisualizationClient();

            state._fsp--;

             after(grammarAccess.getTimeSeriesFrameworkAccess().getClientsVisualizationClientParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__TimeSeriesFramework__ClientsAssignment_4"


    // $ANTLR start "rule__TimeSeriesFramework__ClientsAssignment_6_0"
    // InternalDsl.g:8483:1: rule__TimeSeriesFramework__ClientsAssignment_6_0 : ( ruleVisualizationClient ) ;
    public final void rule__TimeSeriesFramework__ClientsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8487:1: ( ( ruleVisualizationClient ) )
            // InternalDsl.g:8488:2: ( ruleVisualizationClient )
            {
            // InternalDsl.g:8488:2: ( ruleVisualizationClient )
            // InternalDsl.g:8489:3: ruleVisualizationClient
            {
             before(grammarAccess.getTimeSeriesFrameworkAccess().getClientsVisualizationClientParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVisualizationClient();

            state._fsp--;

             after(grammarAccess.getTimeSeriesFrameworkAccess().getClientsVisualizationClientParserRuleCall_6_0_0()); 

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
    // $ANTLR end "rule__TimeSeriesFramework__ClientsAssignment_6_0"


    // $ANTLR start "rule__Data__SensorsDataAssignment_4"
    // InternalDsl.g:8498:1: rule__Data__SensorsDataAssignment_4 : ( ruleSensor ) ;
    public final void rule__Data__SensorsDataAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8502:1: ( ( ruleSensor ) )
            // InternalDsl.g:8503:2: ( ruleSensor )
            {
            // InternalDsl.g:8503:2: ( ruleSensor )
            // InternalDsl.g:8504:3: ruleSensor
            {
             before(grammarAccess.getDataAccess().getSensorsDataSensorParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getDataAccess().getSensorsDataSensorParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Data__SensorsDataAssignment_4"


    // $ANTLR start "rule__Data__SensorsDataAssignment_6_0"
    // InternalDsl.g:8513:1: rule__Data__SensorsDataAssignment_6_0 : ( ruleSensor ) ;
    public final void rule__Data__SensorsDataAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8517:1: ( ( ruleSensor ) )
            // InternalDsl.g:8518:2: ( ruleSensor )
            {
            // InternalDsl.g:8518:2: ( ruleSensor )
            // InternalDsl.g:8519:3: ruleSensor
            {
             before(grammarAccess.getDataAccess().getSensorsDataSensorParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getDataAccess().getSensorsDataSensorParserRuleCall_6_0_0()); 

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
    // $ANTLR end "rule__Data__SensorsDataAssignment_6_0"


    // $ANTLR start "rule__Data__TimeSeriesDataAssignment_11"
    // InternalDsl.g:8528:1: rule__Data__TimeSeriesDataAssignment_11 : ( ruleTimeSeries ) ;
    public final void rule__Data__TimeSeriesDataAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8532:1: ( ( ruleTimeSeries ) )
            // InternalDsl.g:8533:2: ( ruleTimeSeries )
            {
            // InternalDsl.g:8533:2: ( ruleTimeSeries )
            // InternalDsl.g:8534:3: ruleTimeSeries
            {
             before(grammarAccess.getDataAccess().getTimeSeriesDataTimeSeriesParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeSeries();

            state._fsp--;

             after(grammarAccess.getDataAccess().getTimeSeriesDataTimeSeriesParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__Data__TimeSeriesDataAssignment_11"


    // $ANTLR start "rule__Data__TimeSeriesDataAssignment_13_0"
    // InternalDsl.g:8543:1: rule__Data__TimeSeriesDataAssignment_13_0 : ( ruleTimeSeries ) ;
    public final void rule__Data__TimeSeriesDataAssignment_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8547:1: ( ( ruleTimeSeries ) )
            // InternalDsl.g:8548:2: ( ruleTimeSeries )
            {
            // InternalDsl.g:8548:2: ( ruleTimeSeries )
            // InternalDsl.g:8549:3: ruleTimeSeries
            {
             before(grammarAccess.getDataAccess().getTimeSeriesDataTimeSeriesParserRuleCall_13_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeSeries();

            state._fsp--;

             after(grammarAccess.getDataAccess().getTimeSeriesDataTimeSeriesParserRuleCall_13_0_0()); 

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
    // $ANTLR end "rule__Data__TimeSeriesDataAssignment_13_0"


    // $ANTLR start "rule__Platform__ComputersPlatformAssignment_4"
    // InternalDsl.g:8558:1: rule__Platform__ComputersPlatformAssignment_4 : ( ruleComputer ) ;
    public final void rule__Platform__ComputersPlatformAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8562:1: ( ( ruleComputer ) )
            // InternalDsl.g:8563:2: ( ruleComputer )
            {
            // InternalDsl.g:8563:2: ( ruleComputer )
            // InternalDsl.g:8564:3: ruleComputer
            {
             before(grammarAccess.getPlatformAccess().getComputersPlatformComputerParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleComputer();

            state._fsp--;

             after(grammarAccess.getPlatformAccess().getComputersPlatformComputerParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Platform__ComputersPlatformAssignment_4"


    // $ANTLR start "rule__Platform__ComputersPlatformAssignment_6_0"
    // InternalDsl.g:8573:1: rule__Platform__ComputersPlatformAssignment_6_0 : ( ruleComputer ) ;
    public final void rule__Platform__ComputersPlatformAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8577:1: ( ( ruleComputer ) )
            // InternalDsl.g:8578:2: ( ruleComputer )
            {
            // InternalDsl.g:8578:2: ( ruleComputer )
            // InternalDsl.g:8579:3: ruleComputer
            {
             before(grammarAccess.getPlatformAccess().getComputersPlatformComputerParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleComputer();

            state._fsp--;

             after(grammarAccess.getPlatformAccess().getComputersPlatformComputerParserRuleCall_6_0_0()); 

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
    // $ANTLR end "rule__Platform__ComputersPlatformAssignment_6_0"


    // $ANTLR start "rule__Platform__NetworksPlatformAssignment_11"
    // InternalDsl.g:8588:1: rule__Platform__NetworksPlatformAssignment_11 : ( ruleNetwork ) ;
    public final void rule__Platform__NetworksPlatformAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8592:1: ( ( ruleNetwork ) )
            // InternalDsl.g:8593:2: ( ruleNetwork )
            {
            // InternalDsl.g:8593:2: ( ruleNetwork )
            // InternalDsl.g:8594:3: ruleNetwork
            {
             before(grammarAccess.getPlatformAccess().getNetworksPlatformNetworkParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleNetwork();

            state._fsp--;

             after(grammarAccess.getPlatformAccess().getNetworksPlatformNetworkParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__Platform__NetworksPlatformAssignment_11"


    // $ANTLR start "rule__Platform__NetworksPlatformAssignment_13_0"
    // InternalDsl.g:8603:1: rule__Platform__NetworksPlatformAssignment_13_0 : ( ruleNetwork ) ;
    public final void rule__Platform__NetworksPlatformAssignment_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8607:1: ( ( ruleNetwork ) )
            // InternalDsl.g:8608:2: ( ruleNetwork )
            {
            // InternalDsl.g:8608:2: ( ruleNetwork )
            // InternalDsl.g:8609:3: ruleNetwork
            {
             before(grammarAccess.getPlatformAccess().getNetworksPlatformNetworkParserRuleCall_13_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNetwork();

            state._fsp--;

             after(grammarAccess.getPlatformAccess().getNetworksPlatformNetworkParserRuleCall_13_0_0()); 

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
    // $ANTLR end "rule__Platform__NetworksPlatformAssignment_13_0"


    // $ANTLR start "rule__MinMaxVisualizationClient__NameAssignment_1"
    // InternalDsl.g:8618:1: rule__MinMaxVisualizationClient__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__MinMaxVisualizationClient__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8622:1: ( ( ruleEString ) )
            // InternalDsl.g:8623:2: ( ruleEString )
            {
            // InternalDsl.g:8623:2: ( ruleEString )
            // InternalDsl.g:8624:3: ruleEString
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMinMaxVisualizationClientAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__NameAssignment_1"


    // $ANTLR start "rule__MinMaxVisualizationClient__TimeSeriesSelectedAssignment_3"
    // InternalDsl.g:8633:1: rule__MinMaxVisualizationClient__TimeSeriesSelectedAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__MinMaxVisualizationClient__TimeSeriesSelectedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8637:1: ( ( ( ruleEString ) ) )
            // InternalDsl.g:8638:2: ( ( ruleEString ) )
            {
            // InternalDsl.g:8638:2: ( ( ruleEString ) )
            // InternalDsl.g:8639:3: ( ruleEString )
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getTimeSeriesSelectedTimeSeriesCrossReference_3_0()); 
            // InternalDsl.g:8640:3: ( ruleEString )
            // InternalDsl.g:8641:4: ruleEString
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getTimeSeriesSelectedTimeSeriesEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMinMaxVisualizationClientAccess().getTimeSeriesSelectedTimeSeriesEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getMinMaxVisualizationClientAccess().getTimeSeriesSelectedTimeSeriesCrossReference_3_0()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__TimeSeriesSelectedAssignment_3"


    // $ANTLR start "rule__MinMaxVisualizationClient__ClientComputerAssignment_5"
    // InternalDsl.g:8652:1: rule__MinMaxVisualizationClient__ClientComputerAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__MinMaxVisualizationClient__ClientComputerAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8656:1: ( ( ( ruleEString ) ) )
            // InternalDsl.g:8657:2: ( ( ruleEString ) )
            {
            // InternalDsl.g:8657:2: ( ( ruleEString ) )
            // InternalDsl.g:8658:3: ( ruleEString )
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getClientComputerComputerCrossReference_5_0()); 
            // InternalDsl.g:8659:3: ( ruleEString )
            // InternalDsl.g:8660:4: ruleEString
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getClientComputerComputerEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMinMaxVisualizationClientAccess().getClientComputerComputerEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getMinMaxVisualizationClientAccess().getClientComputerComputerCrossReference_5_0()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__ClientComputerAssignment_5"


    // $ANTLR start "rule__MinMaxVisualizationClient__ChartWidthAssignment_7"
    // InternalDsl.g:8671:1: rule__MinMaxVisualizationClient__ChartWidthAssignment_7 : ( ruleEInt ) ;
    public final void rule__MinMaxVisualizationClient__ChartWidthAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8675:1: ( ( ruleEInt ) )
            // InternalDsl.g:8676:2: ( ruleEInt )
            {
            // InternalDsl.g:8676:2: ( ruleEInt )
            // InternalDsl.g:8677:3: ruleEInt
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getChartWidthEIntParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMinMaxVisualizationClientAccess().getChartWidthEIntParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__ChartWidthAssignment_7"


    // $ANTLR start "rule__MinMaxVisualizationClient__ChartHeightAssignment_9"
    // InternalDsl.g:8686:1: rule__MinMaxVisualizationClient__ChartHeightAssignment_9 : ( ruleEInt ) ;
    public final void rule__MinMaxVisualizationClient__ChartHeightAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8690:1: ( ( ruleEInt ) )
            // InternalDsl.g:8691:2: ( ruleEInt )
            {
            // InternalDsl.g:8691:2: ( ruleEInt )
            // InternalDsl.g:8692:3: ruleEInt
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getChartHeightEIntParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMinMaxVisualizationClientAccess().getChartHeightEIntParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__ChartHeightAssignment_9"


    // $ANTLR start "rule__MinMaxVisualizationClient__AxisFactorAssignment_11"
    // InternalDsl.g:8701:1: rule__MinMaxVisualizationClient__AxisFactorAssignment_11 : ( ruleEInt ) ;
    public final void rule__MinMaxVisualizationClient__AxisFactorAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8705:1: ( ( ruleEInt ) )
            // InternalDsl.g:8706:2: ( ruleEInt )
            {
            // InternalDsl.g:8706:2: ( ruleEInt )
            // InternalDsl.g:8707:3: ruleEInt
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getAxisFactorEIntParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMinMaxVisualizationClientAccess().getAxisFactorEIntParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__AxisFactorAssignment_11"


    // $ANTLR start "rule__MinMaxVisualizationClient__UserPolicyAssignment_14"
    // InternalDsl.g:8716:1: rule__MinMaxVisualizationClient__UserPolicyAssignment_14 : ( ruleUserPolicy ) ;
    public final void rule__MinMaxVisualizationClient__UserPolicyAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8720:1: ( ( ruleUserPolicy ) )
            // InternalDsl.g:8721:2: ( ruleUserPolicy )
            {
            // InternalDsl.g:8721:2: ( ruleUserPolicy )
            // InternalDsl.g:8722:3: ruleUserPolicy
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getUserPolicyUserPolicyEnumRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleUserPolicy();

            state._fsp--;

             after(grammarAccess.getMinMaxVisualizationClientAccess().getUserPolicyUserPolicyEnumRuleCall_14_0()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__UserPolicyAssignment_14"


    // $ANTLR start "rule__MinMaxVisualizationClient__ClientScaleAssignment_16"
    // InternalDsl.g:8731:1: rule__MinMaxVisualizationClient__ClientScaleAssignment_16 : ( ruleScale ) ;
    public final void rule__MinMaxVisualizationClient__ClientScaleAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8735:1: ( ( ruleScale ) )
            // InternalDsl.g:8736:2: ( ruleScale )
            {
            // InternalDsl.g:8736:2: ( ruleScale )
            // InternalDsl.g:8737:3: ruleScale
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getClientScaleScaleParserRuleCall_16_0()); 
            pushFollow(FOLLOW_2);
            ruleScale();

            state._fsp--;

             after(grammarAccess.getMinMaxVisualizationClientAccess().getClientScaleScaleParserRuleCall_16_0()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__ClientScaleAssignment_16"


    // $ANTLR start "rule__MinMaxVisualizationClient__UserTimeAssignment_19"
    // InternalDsl.g:8746:1: rule__MinMaxVisualizationClient__UserTimeAssignment_19 : ( ruleEDouble ) ;
    public final void rule__MinMaxVisualizationClient__UserTimeAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8750:1: ( ( ruleEDouble ) )
            // InternalDsl.g:8751:2: ( ruleEDouble )
            {
            // InternalDsl.g:8751:2: ( ruleEDouble )
            // InternalDsl.g:8752:3: ruleEDouble
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getUserTimeEDoubleParserRuleCall_19_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getMinMaxVisualizationClientAccess().getUserTimeEDoubleParserRuleCall_19_0()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__UserTimeAssignment_19"


    // $ANTLR start "rule__MinMaxVisualizationClient__PingTimeAssignment_22"
    // InternalDsl.g:8761:1: rule__MinMaxVisualizationClient__PingTimeAssignment_22 : ( ruleEDouble ) ;
    public final void rule__MinMaxVisualizationClient__PingTimeAssignment_22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8765:1: ( ( ruleEDouble ) )
            // InternalDsl.g:8766:2: ( ruleEDouble )
            {
            // InternalDsl.g:8766:2: ( ruleEDouble )
            // InternalDsl.g:8767:3: ruleEDouble
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getPingTimeEDoubleParserRuleCall_22_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getMinMaxVisualizationClientAccess().getPingTimeEDoubleParserRuleCall_22_0()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__PingTimeAssignment_22"


    // $ANTLR start "rule__MinMaxVisualizationClient__RawDataThresholdAssignment_25"
    // InternalDsl.g:8776:1: rule__MinMaxVisualizationClient__RawDataThresholdAssignment_25 : ( ruleEDouble ) ;
    public final void rule__MinMaxVisualizationClient__RawDataThresholdAssignment_25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8780:1: ( ( ruleEDouble ) )
            // InternalDsl.g:8781:2: ( ruleEDouble )
            {
            // InternalDsl.g:8781:2: ( ruleEDouble )
            // InternalDsl.g:8782:3: ruleEDouble
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getRawDataThresholdEDoubleParserRuleCall_25_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getMinMaxVisualizationClientAccess().getRawDataThresholdEDoubleParserRuleCall_25_0()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__RawDataThresholdAssignment_25"


    // $ANTLR start "rule__MinMaxVisualizationClient__PreComputedDataThresholdAssignment_28"
    // InternalDsl.g:8791:1: rule__MinMaxVisualizationClient__PreComputedDataThresholdAssignment_28 : ( ruleEDouble ) ;
    public final void rule__MinMaxVisualizationClient__PreComputedDataThresholdAssignment_28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8795:1: ( ( ruleEDouble ) )
            // InternalDsl.g:8796:2: ( ruleEDouble )
            {
            // InternalDsl.g:8796:2: ( ruleEDouble )
            // InternalDsl.g:8797:3: ruleEDouble
            {
             before(grammarAccess.getMinMaxVisualizationClientAccess().getPreComputedDataThresholdEDoubleParserRuleCall_28_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getMinMaxVisualizationClientAccess().getPreComputedDataThresholdEDoubleParserRuleCall_28_0()); 

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
    // $ANTLR end "rule__MinMaxVisualizationClient__PreComputedDataThresholdAssignment_28"


    // $ANTLR start "rule__TimeSeries__NameAssignment_0"
    // InternalDsl.g:8806:1: rule__TimeSeries__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__TimeSeries__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8810:1: ( ( ruleEString ) )
            // InternalDsl.g:8811:2: ( ruleEString )
            {
            // InternalDsl.g:8811:2: ( ruleEString )
            // InternalDsl.g:8812:3: ruleEString
            {
             before(grammarAccess.getTimeSeriesAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTimeSeriesAccess().getNameEStringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__TimeSeries__NameAssignment_0"


    // $ANTLR start "rule__TimeSeries__TimeSeriesMeasuredVariableAssignment_2"
    // InternalDsl.g:8821:1: rule__TimeSeries__TimeSeriesMeasuredVariableAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__TimeSeries__TimeSeriesMeasuredVariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8825:1: ( ( ( ruleEString ) ) )
            // InternalDsl.g:8826:2: ( ( ruleEString ) )
            {
            // InternalDsl.g:8826:2: ( ( ruleEString ) )
            // InternalDsl.g:8827:3: ( ruleEString )
            {
             before(grammarAccess.getTimeSeriesAccess().getTimeSeriesMeasuredVariableMeasuredVariableCrossReference_2_0()); 
            // InternalDsl.g:8828:3: ( ruleEString )
            // InternalDsl.g:8829:4: ruleEString
            {
             before(grammarAccess.getTimeSeriesAccess().getTimeSeriesMeasuredVariableMeasuredVariableEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTimeSeriesAccess().getTimeSeriesMeasuredVariableMeasuredVariableEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getTimeSeriesAccess().getTimeSeriesMeasuredVariableMeasuredVariableCrossReference_2_0()); 

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
    // $ANTLR end "rule__TimeSeries__TimeSeriesMeasuredVariableAssignment_2"


    // $ANTLR start "rule__TimeSeries__StartTimeAssignment_6"
    // InternalDsl.g:8840:1: rule__TimeSeries__StartTimeAssignment_6 : ( ruleEString ) ;
    public final void rule__TimeSeries__StartTimeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8844:1: ( ( ruleEString ) )
            // InternalDsl.g:8845:2: ( ruleEString )
            {
            // InternalDsl.g:8845:2: ( ruleEString )
            // InternalDsl.g:8846:3: ruleEString
            {
             before(grammarAccess.getTimeSeriesAccess().getStartTimeEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTimeSeriesAccess().getStartTimeEStringParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__TimeSeries__StartTimeAssignment_6"


    // $ANTLR start "rule__TimeSeries__EndTimeAssignment_9"
    // InternalDsl.g:8855:1: rule__TimeSeries__EndTimeAssignment_9 : ( ruleEString ) ;
    public final void rule__TimeSeries__EndTimeAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8859:1: ( ( ruleEString ) )
            // InternalDsl.g:8860:2: ( ruleEString )
            {
            // InternalDsl.g:8860:2: ( ruleEString )
            // InternalDsl.g:8861:3: ruleEString
            {
             before(grammarAccess.getTimeSeriesAccess().getEndTimeEStringParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTimeSeriesAccess().getEndTimeEStringParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__TimeSeries__EndTimeAssignment_9"


    // $ANTLR start "rule__TimeSeries__PeriodAssignment_12"
    // InternalDsl.g:8870:1: rule__TimeSeries__PeriodAssignment_12 : ( ruleEDouble ) ;
    public final void rule__TimeSeries__PeriodAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8874:1: ( ( ruleEDouble ) )
            // InternalDsl.g:8875:2: ( ruleEDouble )
            {
            // InternalDsl.g:8875:2: ( ruleEDouble )
            // InternalDsl.g:8876:3: ruleEDouble
            {
             before(grammarAccess.getTimeSeriesAccess().getPeriodEDoubleParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getTimeSeriesAccess().getPeriodEDoubleParserRuleCall_12_0()); 

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
    // $ANTLR end "rule__TimeSeries__PeriodAssignment_12"


    // $ANTLR start "rule__TimeSeries__TimeSeriesDataSourceAssignment_15"
    // InternalDsl.g:8885:1: rule__TimeSeries__TimeSeriesDataSourceAssignment_15 : ( ( ruleEString ) ) ;
    public final void rule__TimeSeries__TimeSeriesDataSourceAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8889:1: ( ( ( ruleEString ) ) )
            // InternalDsl.g:8890:2: ( ( ruleEString ) )
            {
            // InternalDsl.g:8890:2: ( ( ruleEString ) )
            // InternalDsl.g:8891:3: ( ruleEString )
            {
             before(grammarAccess.getTimeSeriesAccess().getTimeSeriesDataSourceDataSourceCrossReference_15_0()); 
            // InternalDsl.g:8892:3: ( ruleEString )
            // InternalDsl.g:8893:4: ruleEString
            {
             before(grammarAccess.getTimeSeriesAccess().getTimeSeriesDataSourceDataSourceEStringParserRuleCall_15_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTimeSeriesAccess().getTimeSeriesDataSourceDataSourceEStringParserRuleCall_15_0_1()); 

            }

             after(grammarAccess.getTimeSeriesAccess().getTimeSeriesDataSourceDataSourceCrossReference_15_0()); 

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
    // $ANTLR end "rule__TimeSeries__TimeSeriesDataSourceAssignment_15"


    // $ANTLR start "rule__Sensor__NameAssignment_0"
    // InternalDsl.g:8904:1: rule__Sensor__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Sensor__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8908:1: ( ( ruleEString ) )
            // InternalDsl.g:8909:2: ( ruleEString )
            {
            // InternalDsl.g:8909:2: ( ruleEString )
            // InternalDsl.g:8910:3: ruleEString
            {
             before(grammarAccess.getSensorAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getNameEStringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Sensor__NameAssignment_0"


    // $ANTLR start "rule__Sensor__SensorMetaDataAssignment_3_0"
    // InternalDsl.g:8919:1: rule__Sensor__SensorMetaDataAssignment_3_0 : ( ruleMetaData ) ;
    public final void rule__Sensor__SensorMetaDataAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8923:1: ( ( ruleMetaData ) )
            // InternalDsl.g:8924:2: ( ruleMetaData )
            {
            // InternalDsl.g:8924:2: ( ruleMetaData )
            // InternalDsl.g:8925:3: ruleMetaData
            {
             before(grammarAccess.getSensorAccess().getSensorMetaDataMetaDataParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMetaData();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getSensorMetaDataMetaDataParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__Sensor__SensorMetaDataAssignment_3_0"


    // $ANTLR start "rule__Sensor__SensorMetaDataAssignment_3_2_0"
    // InternalDsl.g:8934:1: rule__Sensor__SensorMetaDataAssignment_3_2_0 : ( ruleMetaData ) ;
    public final void rule__Sensor__SensorMetaDataAssignment_3_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8938:1: ( ( ruleMetaData ) )
            // InternalDsl.g:8939:2: ( ruleMetaData )
            {
            // InternalDsl.g:8939:2: ( ruleMetaData )
            // InternalDsl.g:8940:3: ruleMetaData
            {
             before(grammarAccess.getSensorAccess().getSensorMetaDataMetaDataParserRuleCall_3_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMetaData();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getSensorMetaDataMetaDataParserRuleCall_3_2_0_0()); 

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
    // $ANTLR end "rule__Sensor__SensorMetaDataAssignment_3_2_0"


    // $ANTLR start "rule__Sensor__SensorMeasuredVariablesAssignment_4"
    // InternalDsl.g:8949:1: rule__Sensor__SensorMeasuredVariablesAssignment_4 : ( ruleMeasuredVariable ) ;
    public final void rule__Sensor__SensorMeasuredVariablesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8953:1: ( ( ruleMeasuredVariable ) )
            // InternalDsl.g:8954:2: ( ruleMeasuredVariable )
            {
            // InternalDsl.g:8954:2: ( ruleMeasuredVariable )
            // InternalDsl.g:8955:3: ruleMeasuredVariable
            {
             before(grammarAccess.getSensorAccess().getSensorMeasuredVariablesMeasuredVariableParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMeasuredVariable();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getSensorMeasuredVariablesMeasuredVariableParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Sensor__SensorMeasuredVariablesAssignment_4"


    // $ANTLR start "rule__Sensor__SensorMeasuredVariablesAssignment_6_0"
    // InternalDsl.g:8964:1: rule__Sensor__SensorMeasuredVariablesAssignment_6_0 : ( ruleMeasuredVariable ) ;
    public final void rule__Sensor__SensorMeasuredVariablesAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8968:1: ( ( ruleMeasuredVariable ) )
            // InternalDsl.g:8969:2: ( ruleMeasuredVariable )
            {
            // InternalDsl.g:8969:2: ( ruleMeasuredVariable )
            // InternalDsl.g:8970:3: ruleMeasuredVariable
            {
             before(grammarAccess.getSensorAccess().getSensorMeasuredVariablesMeasuredVariableParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMeasuredVariable();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getSensorMeasuredVariablesMeasuredVariableParserRuleCall_6_0_0()); 

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
    // $ANTLR end "rule__Sensor__SensorMeasuredVariablesAssignment_6_0"


    // $ANTLR start "rule__MeasuredVariable__NameAssignment_0"
    // InternalDsl.g:8979:1: rule__MeasuredVariable__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__MeasuredVariable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8983:1: ( ( ruleEString ) )
            // InternalDsl.g:8984:2: ( ruleEString )
            {
            // InternalDsl.g:8984:2: ( ruleEString )
            // InternalDsl.g:8985:3: ruleEString
            {
             before(grammarAccess.getMeasuredVariableAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMeasuredVariableAccess().getNameEStringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__MeasuredVariable__NameAssignment_0"


    // $ANTLR start "rule__MeasuredVariable__UnitAssignment_2"
    // InternalDsl.g:8994:1: rule__MeasuredVariable__UnitAssignment_2 : ( ruleMeasurementDataUnit ) ;
    public final void rule__MeasuredVariable__UnitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:8998:1: ( ( ruleMeasurementDataUnit ) )
            // InternalDsl.g:8999:2: ( ruleMeasurementDataUnit )
            {
            // InternalDsl.g:8999:2: ( ruleMeasurementDataUnit )
            // InternalDsl.g:9000:3: ruleMeasurementDataUnit
            {
             before(grammarAccess.getMeasuredVariableAccess().getUnitMeasurementDataUnitEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMeasurementDataUnit();

            state._fsp--;

             after(grammarAccess.getMeasuredVariableAccess().getUnitMeasurementDataUnitEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__MeasuredVariable__UnitAssignment_2"


    // $ANTLR start "rule__MeasuredVariable__MeasuredVariableMetaDataAssignment_3_1"
    // InternalDsl.g:9009:1: rule__MeasuredVariable__MeasuredVariableMetaDataAssignment_3_1 : ( ruleMetaData ) ;
    public final void rule__MeasuredVariable__MeasuredVariableMetaDataAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9013:1: ( ( ruleMetaData ) )
            // InternalDsl.g:9014:2: ( ruleMetaData )
            {
            // InternalDsl.g:9014:2: ( ruleMetaData )
            // InternalDsl.g:9015:3: ruleMetaData
            {
             before(grammarAccess.getMeasuredVariableAccess().getMeasuredVariableMetaDataMetaDataParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMetaData();

            state._fsp--;

             after(grammarAccess.getMeasuredVariableAccess().getMeasuredVariableMetaDataMetaDataParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__MeasuredVariable__MeasuredVariableMetaDataAssignment_3_1"


    // $ANTLR start "rule__MeasuredVariable__MeasuredVariableMetaDataAssignment_3_3_0"
    // InternalDsl.g:9024:1: rule__MeasuredVariable__MeasuredVariableMetaDataAssignment_3_3_0 : ( ruleMetaData ) ;
    public final void rule__MeasuredVariable__MeasuredVariableMetaDataAssignment_3_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9028:1: ( ( ruleMetaData ) )
            // InternalDsl.g:9029:2: ( ruleMetaData )
            {
            // InternalDsl.g:9029:2: ( ruleMetaData )
            // InternalDsl.g:9030:3: ruleMetaData
            {
             before(grammarAccess.getMeasuredVariableAccess().getMeasuredVariableMetaDataMetaDataParserRuleCall_3_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMetaData();

            state._fsp--;

             after(grammarAccess.getMeasuredVariableAccess().getMeasuredVariableMetaDataMetaDataParserRuleCall_3_3_0_0()); 

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
    // $ANTLR end "rule__MeasuredVariable__MeasuredVariableMetaDataAssignment_3_3_0"


    // $ANTLR start "rule__MetaData__NameAssignment_1"
    // InternalDsl.g:9039:1: rule__MetaData__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__MetaData__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9043:1: ( ( ruleEString ) )
            // InternalDsl.g:9044:2: ( ruleEString )
            {
            // InternalDsl.g:9044:2: ( ruleEString )
            // InternalDsl.g:9045:3: ruleEString
            {
             before(grammarAccess.getMetaDataAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMetaDataAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__MetaData__NameAssignment_1"


    // $ANTLR start "rule__MetaData__ValueAssignment_3"
    // InternalDsl.g:9054:1: rule__MetaData__ValueAssignment_3 : ( ruleEString ) ;
    public final void rule__MetaData__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9058:1: ( ( ruleEString ) )
            // InternalDsl.g:9059:2: ( ruleEString )
            {
            // InternalDsl.g:9059:2: ( ruleEString )
            // InternalDsl.g:9060:3: ruleEString
            {
             before(grammarAccess.getMetaDataAccess().getValueEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMetaDataAccess().getValueEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__MetaData__ValueAssignment_3"


    // $ANTLR start "rule__Database__NameAssignment_0"
    // InternalDsl.g:9069:1: rule__Database__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Database__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9073:1: ( ( ruleEString ) )
            // InternalDsl.g:9074:2: ( ruleEString )
            {
            // InternalDsl.g:9074:2: ( ruleEString )
            // InternalDsl.g:9075:3: ruleEString
            {
             before(grammarAccess.getDatabaseAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDatabaseAccess().getNameEStringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Database__NameAssignment_0"


    // $ANTLR start "rule__Database__DbmsAssignment_2"
    // InternalDsl.g:9084:1: rule__Database__DbmsAssignment_2 : ( ruleDatabaseType ) ;
    public final void rule__Database__DbmsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9088:1: ( ( ruleDatabaseType ) )
            // InternalDsl.g:9089:2: ( ruleDatabaseType )
            {
            // InternalDsl.g:9089:2: ( ruleDatabaseType )
            // InternalDsl.g:9090:3: ruleDatabaseType
            {
             before(grammarAccess.getDatabaseAccess().getDbmsDatabaseTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDatabaseType();

            state._fsp--;

             after(grammarAccess.getDatabaseAccess().getDbmsDatabaseTypeEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Database__DbmsAssignment_2"


    // $ANTLR start "rule__Database__PortAssignment_4"
    // InternalDsl.g:9099:1: rule__Database__PortAssignment_4 : ( ruleEInt ) ;
    public final void rule__Database__PortAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9103:1: ( ( ruleEInt ) )
            // InternalDsl.g:9104:2: ( ruleEInt )
            {
            // InternalDsl.g:9104:2: ( ruleEInt )
            // InternalDsl.g:9105:3: ruleEInt
            {
             before(grammarAccess.getDatabaseAccess().getPortEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getDatabaseAccess().getPortEIntParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Database__PortAssignment_4"


    // $ANTLR start "rule__Database__UsernameAssignment_6"
    // InternalDsl.g:9114:1: rule__Database__UsernameAssignment_6 : ( ruleEString ) ;
    public final void rule__Database__UsernameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9118:1: ( ( ruleEString ) )
            // InternalDsl.g:9119:2: ( ruleEString )
            {
            // InternalDsl.g:9119:2: ( ruleEString )
            // InternalDsl.g:9120:3: ruleEString
            {
             before(grammarAccess.getDatabaseAccess().getUsernameEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDatabaseAccess().getUsernameEStringParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Database__UsernameAssignment_6"


    // $ANTLR start "rule__Database__PasswordAssignment_8"
    // InternalDsl.g:9129:1: rule__Database__PasswordAssignment_8 : ( ruleEString ) ;
    public final void rule__Database__PasswordAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9133:1: ( ( ruleEString ) )
            // InternalDsl.g:9134:2: ( ruleEString )
            {
            // InternalDsl.g:9134:2: ( ruleEString )
            // InternalDsl.g:9135:3: ruleEString
            {
             before(grammarAccess.getDatabaseAccess().getPasswordEStringParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDatabaseAccess().getPasswordEStringParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Database__PasswordAssignment_8"


    // $ANTLR start "rule__Database__DataDirectoryAssignment_10"
    // InternalDsl.g:9144:1: rule__Database__DataDirectoryAssignment_10 : ( ruleEString ) ;
    public final void rule__Database__DataDirectoryAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9148:1: ( ( ruleEString ) )
            // InternalDsl.g:9149:2: ( ruleEString )
            {
            // InternalDsl.g:9149:2: ( ruleEString )
            // InternalDsl.g:9150:3: ruleEString
            {
             before(grammarAccess.getDatabaseAccess().getDataDirectoryEStringParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDatabaseAccess().getDataDirectoryEStringParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__Database__DataDirectoryAssignment_10"


    // $ANTLR start "rule__File__NameAssignment_0"
    // InternalDsl.g:9159:1: rule__File__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__File__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9163:1: ( ( ruleEString ) )
            // InternalDsl.g:9164:2: ( ruleEString )
            {
            // InternalDsl.g:9164:2: ( ruleEString )
            // InternalDsl.g:9165:3: ruleEString
            {
             before(grammarAccess.getFileAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFileAccess().getNameEStringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__File__NameAssignment_0"


    // $ANTLR start "rule__File__PathAssignment_2"
    // InternalDsl.g:9174:1: rule__File__PathAssignment_2 : ( ruleEString ) ;
    public final void rule__File__PathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9178:1: ( ( ruleEString ) )
            // InternalDsl.g:9179:2: ( ruleEString )
            {
            // InternalDsl.g:9179:2: ( ruleEString )
            // InternalDsl.g:9180:3: ruleEString
            {
             before(grammarAccess.getFileAccess().getPathEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFileAccess().getPathEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__File__PathAssignment_2"


    // $ANTLR start "rule__Computer__NameAssignment_1"
    // InternalDsl.g:9189:1: rule__Computer__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Computer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9193:1: ( ( ruleEString ) )
            // InternalDsl.g:9194:2: ( ruleEString )
            {
            // InternalDsl.g:9194:2: ( ruleEString )
            // InternalDsl.g:9195:3: ruleEString
            {
             before(grammarAccess.getComputerAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComputerAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Computer__NameAssignment_1"


    // $ANTLR start "rule__Computer__OsAssignment_3"
    // InternalDsl.g:9204:1: rule__Computer__OsAssignment_3 : ( ruleOSType ) ;
    public final void rule__Computer__OsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9208:1: ( ( ruleOSType ) )
            // InternalDsl.g:9209:2: ( ruleOSType )
            {
            // InternalDsl.g:9209:2: ( ruleOSType )
            // InternalDsl.g:9210:3: ruleOSType
            {
             before(grammarAccess.getComputerAccess().getOsOSTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleOSType();

            state._fsp--;

             after(grammarAccess.getComputerAccess().getOsOSTypeEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__Computer__OsAssignment_3"


    // $ANTLR start "rule__Computer__RamMemoryAssignment_5"
    // InternalDsl.g:9219:1: rule__Computer__RamMemoryAssignment_5 : ( ruleEInt ) ;
    public final void rule__Computer__RamMemoryAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9223:1: ( ( ruleEInt ) )
            // InternalDsl.g:9224:2: ( ruleEInt )
            {
            // InternalDsl.g:9224:2: ( ruleEInt )
            // InternalDsl.g:9225:3: ruleEInt
            {
             before(grammarAccess.getComputerAccess().getRamMemoryEIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getComputerAccess().getRamMemoryEIntParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Computer__RamMemoryAssignment_5"


    // $ANTLR start "rule__Computer__StorageMemoryAssignment_7"
    // InternalDsl.g:9234:1: rule__Computer__StorageMemoryAssignment_7 : ( ruleEInt ) ;
    public final void rule__Computer__StorageMemoryAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9238:1: ( ( ruleEInt ) )
            // InternalDsl.g:9239:2: ( ruleEInt )
            {
            // InternalDsl.g:9239:2: ( ruleEInt )
            // InternalDsl.g:9240:3: ruleEInt
            {
             before(grammarAccess.getComputerAccess().getStorageMemoryEIntParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getComputerAccess().getStorageMemoryEIntParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Computer__StorageMemoryAssignment_7"


    // $ANTLR start "rule__Computer__CpuNumberAssignment_9"
    // InternalDsl.g:9249:1: rule__Computer__CpuNumberAssignment_9 : ( ruleEInt ) ;
    public final void rule__Computer__CpuNumberAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9253:1: ( ( ruleEInt ) )
            // InternalDsl.g:9254:2: ( ruleEInt )
            {
            // InternalDsl.g:9254:2: ( ruleEInt )
            // InternalDsl.g:9255:3: ruleEInt
            {
             before(grammarAccess.getComputerAccess().getCpuNumberEIntParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getComputerAccess().getCpuNumberEIntParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Computer__CpuNumberAssignment_9"


    // $ANTLR start "rule__Computer__CpuCoresNumberAssignment_11"
    // InternalDsl.g:9264:1: rule__Computer__CpuCoresNumberAssignment_11 : ( ruleEInt ) ;
    public final void rule__Computer__CpuCoresNumberAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9268:1: ( ( ruleEInt ) )
            // InternalDsl.g:9269:2: ( ruleEInt )
            {
            // InternalDsl.g:9269:2: ( ruleEInt )
            // InternalDsl.g:9270:3: ruleEInt
            {
             before(grammarAccess.getComputerAccess().getCpuCoresNumberEIntParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getComputerAccess().getCpuCoresNumberEIntParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__Computer__CpuCoresNumberAssignment_11"


    // $ANTLR start "rule__Computer__CpuFrequencyAssignment_13"
    // InternalDsl.g:9279:1: rule__Computer__CpuFrequencyAssignment_13 : ( ruleEInt ) ;
    public final void rule__Computer__CpuFrequencyAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9283:1: ( ( ruleEInt ) )
            // InternalDsl.g:9284:2: ( ruleEInt )
            {
            // InternalDsl.g:9284:2: ( ruleEInt )
            // InternalDsl.g:9285:3: ruleEInt
            {
             before(grammarAccess.getComputerAccess().getCpuFrequencyEIntParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getComputerAccess().getCpuFrequencyEIntParserRuleCall_13_0()); 

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
    // $ANTLR end "rule__Computer__CpuFrequencyAssignment_13"


    // $ANTLR start "rule__Computer__UsernameAssignment_15"
    // InternalDsl.g:9294:1: rule__Computer__UsernameAssignment_15 : ( ruleEString ) ;
    public final void rule__Computer__UsernameAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9298:1: ( ( ruleEString ) )
            // InternalDsl.g:9299:2: ( ruleEString )
            {
            // InternalDsl.g:9299:2: ( ruleEString )
            // InternalDsl.g:9300:3: ruleEString
            {
             before(grammarAccess.getComputerAccess().getUsernameEStringParserRuleCall_15_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComputerAccess().getUsernameEStringParserRuleCall_15_0()); 

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
    // $ANTLR end "rule__Computer__UsernameAssignment_15"


    // $ANTLR start "rule__Computer__PasswordAssignment_17"
    // InternalDsl.g:9309:1: rule__Computer__PasswordAssignment_17 : ( ruleEString ) ;
    public final void rule__Computer__PasswordAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9313:1: ( ( ruleEString ) )
            // InternalDsl.g:9314:2: ( ruleEString )
            {
            // InternalDsl.g:9314:2: ( ruleEString )
            // InternalDsl.g:9315:3: ruleEString
            {
             before(grammarAccess.getComputerAccess().getPasswordEStringParserRuleCall_17_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComputerAccess().getPasswordEStringParserRuleCall_17_0()); 

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
    // $ANTLR end "rule__Computer__PasswordAssignment_17"


    // $ANTLR start "rule__Computer__ComputerNetworkInterfacesAssignment_21"
    // InternalDsl.g:9324:1: rule__Computer__ComputerNetworkInterfacesAssignment_21 : ( ( ruleEString ) ) ;
    public final void rule__Computer__ComputerNetworkInterfacesAssignment_21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9328:1: ( ( ( ruleEString ) ) )
            // InternalDsl.g:9329:2: ( ( ruleEString ) )
            {
            // InternalDsl.g:9329:2: ( ( ruleEString ) )
            // InternalDsl.g:9330:3: ( ruleEString )
            {
             before(grammarAccess.getComputerAccess().getComputerNetworkInterfacesNetworkInterfaceCrossReference_21_0()); 
            // InternalDsl.g:9331:3: ( ruleEString )
            // InternalDsl.g:9332:4: ruleEString
            {
             before(grammarAccess.getComputerAccess().getComputerNetworkInterfacesNetworkInterfaceEStringParserRuleCall_21_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComputerAccess().getComputerNetworkInterfacesNetworkInterfaceEStringParserRuleCall_21_0_1()); 

            }

             after(grammarAccess.getComputerAccess().getComputerNetworkInterfacesNetworkInterfaceCrossReference_21_0()); 

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
    // $ANTLR end "rule__Computer__ComputerNetworkInterfacesAssignment_21"


    // $ANTLR start "rule__Computer__ComputerNetworkInterfacesAssignment_22"
    // InternalDsl.g:9343:1: rule__Computer__ComputerNetworkInterfacesAssignment_22 : ( ( ruleEString ) ) ;
    public final void rule__Computer__ComputerNetworkInterfacesAssignment_22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9347:1: ( ( ( ruleEString ) ) )
            // InternalDsl.g:9348:2: ( ( ruleEString ) )
            {
            // InternalDsl.g:9348:2: ( ( ruleEString ) )
            // InternalDsl.g:9349:3: ( ruleEString )
            {
             before(grammarAccess.getComputerAccess().getComputerNetworkInterfacesNetworkInterfaceCrossReference_22_0()); 
            // InternalDsl.g:9350:3: ( ruleEString )
            // InternalDsl.g:9351:4: ruleEString
            {
             before(grammarAccess.getComputerAccess().getComputerNetworkInterfacesNetworkInterfaceEStringParserRuleCall_22_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComputerAccess().getComputerNetworkInterfacesNetworkInterfaceEStringParserRuleCall_22_0_1()); 

            }

             after(grammarAccess.getComputerAccess().getComputerNetworkInterfacesNetworkInterfaceCrossReference_22_0()); 

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
    // $ANTLR end "rule__Computer__ComputerNetworkInterfacesAssignment_22"


    // $ANTLR start "rule__Computer__ComputerServicesAssignment_24_0"
    // InternalDsl.g:9362:1: rule__Computer__ComputerServicesAssignment_24_0 : ( ruleService ) ;
    public final void rule__Computer__ComputerServicesAssignment_24_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9366:1: ( ( ruleService ) )
            // InternalDsl.g:9367:2: ( ruleService )
            {
            // InternalDsl.g:9367:2: ( ruleService )
            // InternalDsl.g:9368:3: ruleService
            {
             before(grammarAccess.getComputerAccess().getComputerServicesServiceParserRuleCall_24_0_0()); 
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;

             after(grammarAccess.getComputerAccess().getComputerServicesServiceParserRuleCall_24_0_0()); 

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
    // $ANTLR end "rule__Computer__ComputerServicesAssignment_24_0"


    // $ANTLR start "rule__Computer__ComputerServicesAssignment_24_2_0"
    // InternalDsl.g:9377:1: rule__Computer__ComputerServicesAssignment_24_2_0 : ( ruleService ) ;
    public final void rule__Computer__ComputerServicesAssignment_24_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9381:1: ( ( ruleService ) )
            // InternalDsl.g:9382:2: ( ruleService )
            {
            // InternalDsl.g:9382:2: ( ruleService )
            // InternalDsl.g:9383:3: ruleService
            {
             before(grammarAccess.getComputerAccess().getComputerServicesServiceParserRuleCall_24_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;

             after(grammarAccess.getComputerAccess().getComputerServicesServiceParserRuleCall_24_2_0_0()); 

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
    // $ANTLR end "rule__Computer__ComputerServicesAssignment_24_2_0"


    // $ANTLR start "rule__Computer__DeploymentAssignment_25_0"
    // InternalDsl.g:9392:1: rule__Computer__DeploymentAssignment_25_0 : ( ruleDockerDeployment ) ;
    public final void rule__Computer__DeploymentAssignment_25_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9396:1: ( ( ruleDockerDeployment ) )
            // InternalDsl.g:9397:2: ( ruleDockerDeployment )
            {
            // InternalDsl.g:9397:2: ( ruleDockerDeployment )
            // InternalDsl.g:9398:3: ruleDockerDeployment
            {
             before(grammarAccess.getComputerAccess().getDeploymentDockerDeploymentParserRuleCall_25_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDockerDeployment();

            state._fsp--;

             after(grammarAccess.getComputerAccess().getDeploymentDockerDeploymentParserRuleCall_25_0_0()); 

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
    // $ANTLR end "rule__Computer__DeploymentAssignment_25_0"


    // $ANTLR start "rule__DockerDeployment__NameAssignment_1"
    // InternalDsl.g:9407:1: rule__DockerDeployment__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__DockerDeployment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9411:1: ( ( ruleEString ) )
            // InternalDsl.g:9412:2: ( ruleEString )
            {
            // InternalDsl.g:9412:2: ( ruleEString )
            // InternalDsl.g:9413:3: ruleEString
            {
             before(grammarAccess.getDockerDeploymentAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDockerDeploymentAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__DockerDeployment__NameAssignment_1"


    // $ANTLR start "rule__DockerDeployment__DirectoryAssignment_3"
    // InternalDsl.g:9422:1: rule__DockerDeployment__DirectoryAssignment_3 : ( ruleEString ) ;
    public final void rule__DockerDeployment__DirectoryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9426:1: ( ( ruleEString ) )
            // InternalDsl.g:9427:2: ( ruleEString )
            {
            // InternalDsl.g:9427:2: ( ruleEString )
            // InternalDsl.g:9428:3: ruleEString
            {
             before(grammarAccess.getDockerDeploymentAccess().getDirectoryEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDockerDeploymentAccess().getDirectoryEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__DockerDeployment__DirectoryAssignment_3"


    // $ANTLR start "rule__DockerDeployment__DeploymentContainersAssignment_6"
    // InternalDsl.g:9437:1: rule__DockerDeployment__DeploymentContainersAssignment_6 : ( ruleContainer ) ;
    public final void rule__DockerDeployment__DeploymentContainersAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9441:1: ( ( ruleContainer ) )
            // InternalDsl.g:9442:2: ( ruleContainer )
            {
            // InternalDsl.g:9442:2: ( ruleContainer )
            // InternalDsl.g:9443:3: ruleContainer
            {
             before(grammarAccess.getDockerDeploymentAccess().getDeploymentContainersContainerParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getDockerDeploymentAccess().getDeploymentContainersContainerParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__DockerDeployment__DeploymentContainersAssignment_6"


    // $ANTLR start "rule__DockerDeployment__DeploymentContainersAssignment_8_0"
    // InternalDsl.g:9452:1: rule__DockerDeployment__DeploymentContainersAssignment_8_0 : ( ruleContainer ) ;
    public final void rule__DockerDeployment__DeploymentContainersAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9456:1: ( ( ruleContainer ) )
            // InternalDsl.g:9457:2: ( ruleContainer )
            {
            // InternalDsl.g:9457:2: ( ruleContainer )
            // InternalDsl.g:9458:3: ruleContainer
            {
             before(grammarAccess.getDockerDeploymentAccess().getDeploymentContainersContainerParserRuleCall_8_0_0()); 
            pushFollow(FOLLOW_2);
            ruleContainer();

            state._fsp--;

             after(grammarAccess.getDockerDeploymentAccess().getDeploymentContainersContainerParserRuleCall_8_0_0()); 

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
    // $ANTLR end "rule__DockerDeployment__DeploymentContainersAssignment_8_0"


    // $ANTLR start "rule__Network__NameAssignment_1"
    // InternalDsl.g:9467:1: rule__Network__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Network__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9471:1: ( ( ruleEString ) )
            // InternalDsl.g:9472:2: ( ruleEString )
            {
            // InternalDsl.g:9472:2: ( ruleEString )
            // InternalDsl.g:9473:3: ruleEString
            {
             before(grammarAccess.getNetworkAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNetworkAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Network__NameAssignment_1"


    // $ANTLR start "rule__Network__PrefixAssignment_3"
    // InternalDsl.g:9482:1: rule__Network__PrefixAssignment_3 : ( ruleEString ) ;
    public final void rule__Network__PrefixAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9486:1: ( ( ruleEString ) )
            // InternalDsl.g:9487:2: ( ruleEString )
            {
            // InternalDsl.g:9487:2: ( ruleEString )
            // InternalDsl.g:9488:3: ruleEString
            {
             before(grammarAccess.getNetworkAccess().getPrefixEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNetworkAccess().getPrefixEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Network__PrefixAssignment_3"


    // $ANTLR start "rule__Network__MaskAssignment_5"
    // InternalDsl.g:9497:1: rule__Network__MaskAssignment_5 : ( ruleEString ) ;
    public final void rule__Network__MaskAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9501:1: ( ( ruleEString ) )
            // InternalDsl.g:9502:2: ( ruleEString )
            {
            // InternalDsl.g:9502:2: ( ruleEString )
            // InternalDsl.g:9503:3: ruleEString
            {
             before(grammarAccess.getNetworkAccess().getMaskEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNetworkAccess().getMaskEStringParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Network__MaskAssignment_5"


    // $ANTLR start "rule__Network__GatewayAssignment_7"
    // InternalDsl.g:9512:1: rule__Network__GatewayAssignment_7 : ( ruleEString ) ;
    public final void rule__Network__GatewayAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9516:1: ( ( ruleEString ) )
            // InternalDsl.g:9517:2: ( ruleEString )
            {
            // InternalDsl.g:9517:2: ( ruleEString )
            // InternalDsl.g:9518:3: ruleEString
            {
             before(grammarAccess.getNetworkAccess().getGatewayEStringParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNetworkAccess().getGatewayEStringParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Network__GatewayAssignment_7"


    // $ANTLR start "rule__Network__DomainNameAssignment_9"
    // InternalDsl.g:9527:1: rule__Network__DomainNameAssignment_9 : ( ruleEString ) ;
    public final void rule__Network__DomainNameAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9531:1: ( ( ruleEString ) )
            // InternalDsl.g:9532:2: ( ruleEString )
            {
            // InternalDsl.g:9532:2: ( ruleEString )
            // InternalDsl.g:9533:3: ruleEString
            {
             before(grammarAccess.getNetworkAccess().getDomainNameEStringParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNetworkAccess().getDomainNameEStringParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Network__DomainNameAssignment_9"


    // $ANTLR start "rule__Network__NetworkInterfacesAssignment_12"
    // InternalDsl.g:9542:1: rule__Network__NetworkInterfacesAssignment_12 : ( ruleNetworkInterface ) ;
    public final void rule__Network__NetworkInterfacesAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9546:1: ( ( ruleNetworkInterface ) )
            // InternalDsl.g:9547:2: ( ruleNetworkInterface )
            {
            // InternalDsl.g:9547:2: ( ruleNetworkInterface )
            // InternalDsl.g:9548:3: ruleNetworkInterface
            {
             before(grammarAccess.getNetworkAccess().getNetworkInterfacesNetworkInterfaceParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleNetworkInterface();

            state._fsp--;

             after(grammarAccess.getNetworkAccess().getNetworkInterfacesNetworkInterfaceParserRuleCall_12_0()); 

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
    // $ANTLR end "rule__Network__NetworkInterfacesAssignment_12"


    // $ANTLR start "rule__Network__NetworkInterfacesAssignment_14_0"
    // InternalDsl.g:9557:1: rule__Network__NetworkInterfacesAssignment_14_0 : ( ruleNetworkInterface ) ;
    public final void rule__Network__NetworkInterfacesAssignment_14_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9561:1: ( ( ruleNetworkInterface ) )
            // InternalDsl.g:9562:2: ( ruleNetworkInterface )
            {
            // InternalDsl.g:9562:2: ( ruleNetworkInterface )
            // InternalDsl.g:9563:3: ruleNetworkInterface
            {
             before(grammarAccess.getNetworkAccess().getNetworkInterfacesNetworkInterfaceParserRuleCall_14_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNetworkInterface();

            state._fsp--;

             after(grammarAccess.getNetworkAccess().getNetworkInterfacesNetworkInterfaceParserRuleCall_14_0_0()); 

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
    // $ANTLR end "rule__Network__NetworkInterfacesAssignment_14_0"


    // $ANTLR start "rule__Container__NameAssignment_0"
    // InternalDsl.g:9572:1: rule__Container__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Container__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9576:1: ( ( ruleEString ) )
            // InternalDsl.g:9577:2: ( ruleEString )
            {
            // InternalDsl.g:9577:2: ( ruleEString )
            // InternalDsl.g:9578:3: ruleEString
            {
             before(grammarAccess.getContainerAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getNameEStringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Container__NameAssignment_0"


    // $ANTLR start "rule__Container__ContainerNetworkInterfaceAssignment_2"
    // InternalDsl.g:9587:1: rule__Container__ContainerNetworkInterfaceAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Container__ContainerNetworkInterfaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9591:1: ( ( ( ruleEString ) ) )
            // InternalDsl.g:9592:2: ( ( ruleEString ) )
            {
            // InternalDsl.g:9592:2: ( ( ruleEString ) )
            // InternalDsl.g:9593:3: ( ruleEString )
            {
             before(grammarAccess.getContainerAccess().getContainerNetworkInterfaceNetworkInterfaceCrossReference_2_0()); 
            // InternalDsl.g:9594:3: ( ruleEString )
            // InternalDsl.g:9595:4: ruleEString
            {
             before(grammarAccess.getContainerAccess().getContainerNetworkInterfaceNetworkInterfaceEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getContainerNetworkInterfaceNetworkInterfaceEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getContainerAccess().getContainerNetworkInterfaceNetworkInterfaceCrossReference_2_0()); 

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
    // $ANTLR end "rule__Container__ContainerNetworkInterfaceAssignment_2"


    // $ANTLR start "rule__Container__ContainerServicesAssignment_5"
    // InternalDsl.g:9606:1: rule__Container__ContainerServicesAssignment_5 : ( ruleService ) ;
    public final void rule__Container__ContainerServicesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9610:1: ( ( ruleService ) )
            // InternalDsl.g:9611:2: ( ruleService )
            {
            // InternalDsl.g:9611:2: ( ruleService )
            // InternalDsl.g:9612:3: ruleService
            {
             before(grammarAccess.getContainerAccess().getContainerServicesServiceParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getContainerServicesServiceParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Container__ContainerServicesAssignment_5"


    // $ANTLR start "rule__Container__ContainerServicesAssignment_7_0"
    // InternalDsl.g:9621:1: rule__Container__ContainerServicesAssignment_7_0 : ( ruleService ) ;
    public final void rule__Container__ContainerServicesAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9625:1: ( ( ruleService ) )
            // InternalDsl.g:9626:2: ( ruleService )
            {
            // InternalDsl.g:9626:2: ( ruleService )
            // InternalDsl.g:9627:3: ruleService
            {
             before(grammarAccess.getContainerAccess().getContainerServicesServiceParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;

             after(grammarAccess.getContainerAccess().getContainerServicesServiceParserRuleCall_7_0_0()); 

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
    // $ANTLR end "rule__Container__ContainerServicesAssignment_7_0"


    // $ANTLR start "rule__NetworkInterface__NameAssignment_1"
    // InternalDsl.g:9636:1: rule__NetworkInterface__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__NetworkInterface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9640:1: ( ( ruleEString ) )
            // InternalDsl.g:9641:2: ( ruleEString )
            {
            // InternalDsl.g:9641:2: ( ruleEString )
            // InternalDsl.g:9642:3: ruleEString
            {
             before(grammarAccess.getNetworkInterfaceAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNetworkInterfaceAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__NetworkInterface__NameAssignment_1"


    // $ANTLR start "rule__NetworkInterface__IpAddressAssignment_3"
    // InternalDsl.g:9651:1: rule__NetworkInterface__IpAddressAssignment_3 : ( ruleEString ) ;
    public final void rule__NetworkInterface__IpAddressAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9655:1: ( ( ruleEString ) )
            // InternalDsl.g:9656:2: ( ruleEString )
            {
            // InternalDsl.g:9656:2: ( ruleEString )
            // InternalDsl.g:9657:3: ruleEString
            {
             before(grammarAccess.getNetworkInterfaceAccess().getIpAddressEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNetworkInterfaceAccess().getIpAddressEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__NetworkInterface__IpAddressAssignment_3"


    // $ANTLR start "rule__WebServer__NameAssignment_0"
    // InternalDsl.g:9666:1: rule__WebServer__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__WebServer__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9670:1: ( ( ruleEString ) )
            // InternalDsl.g:9671:2: ( ruleEString )
            {
            // InternalDsl.g:9671:2: ( ruleEString )
            // InternalDsl.g:9672:3: ruleEString
            {
             before(grammarAccess.getWebServerAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWebServerAccess().getNameEStringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__WebServer__NameAssignment_0"


    // $ANTLR start "rule__WebServer__TypeAssignment_2"
    // InternalDsl.g:9681:1: rule__WebServer__TypeAssignment_2 : ( ruleWebServerType ) ;
    public final void rule__WebServer__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9685:1: ( ( ruleWebServerType ) )
            // InternalDsl.g:9686:2: ( ruleWebServerType )
            {
            // InternalDsl.g:9686:2: ( ruleWebServerType )
            // InternalDsl.g:9687:3: ruleWebServerType
            {
             before(grammarAccess.getWebServerAccess().getTypeWebServerTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleWebServerType();

            state._fsp--;

             after(grammarAccess.getWebServerAccess().getTypeWebServerTypeEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__WebServer__TypeAssignment_2"


    // $ANTLR start "rule__WebServer__PortAssignment_4"
    // InternalDsl.g:9696:1: rule__WebServer__PortAssignment_4 : ( ruleEInt ) ;
    public final void rule__WebServer__PortAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9700:1: ( ( ruleEInt ) )
            // InternalDsl.g:9701:2: ( ruleEInt )
            {
            // InternalDsl.g:9701:2: ( ruleEInt )
            // InternalDsl.g:9702:3: ruleEInt
            {
             before(grammarAccess.getWebServerAccess().getPortEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getWebServerAccess().getPortEIntParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__WebServer__PortAssignment_4"


    // $ANTLR start "rule__WebServer__ProxyAssignment_5_1"
    // InternalDsl.g:9711:1: rule__WebServer__ProxyAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__WebServer__ProxyAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9715:1: ( ( ( ruleEString ) ) )
            // InternalDsl.g:9716:2: ( ( ruleEString ) )
            {
            // InternalDsl.g:9716:2: ( ( ruleEString ) )
            // InternalDsl.g:9717:3: ( ruleEString )
            {
             before(grammarAccess.getWebServerAccess().getProxyDataSourceCrossReference_5_1_0()); 
            // InternalDsl.g:9718:3: ( ruleEString )
            // InternalDsl.g:9719:4: ruleEString
            {
             before(grammarAccess.getWebServerAccess().getProxyDataSourceEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWebServerAccess().getProxyDataSourceEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getWebServerAccess().getProxyDataSourceCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__WebServer__ProxyAssignment_5_1"


    // $ANTLR start "rule__WebServer__ProxyAssignment_5_2_1"
    // InternalDsl.g:9730:1: rule__WebServer__ProxyAssignment_5_2_1 : ( ( ruleEString ) ) ;
    public final void rule__WebServer__ProxyAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9734:1: ( ( ( ruleEString ) ) )
            // InternalDsl.g:9735:2: ( ( ruleEString ) )
            {
            // InternalDsl.g:9735:2: ( ( ruleEString ) )
            // InternalDsl.g:9736:3: ( ruleEString )
            {
             before(grammarAccess.getWebServerAccess().getProxyDataSourceCrossReference_5_2_1_0()); 
            // InternalDsl.g:9737:3: ( ruleEString )
            // InternalDsl.g:9738:4: ruleEString
            {
             before(grammarAccess.getWebServerAccess().getProxyDataSourceEStringParserRuleCall_5_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWebServerAccess().getProxyDataSourceEStringParserRuleCall_5_2_1_0_1()); 

            }

             after(grammarAccess.getWebServerAccess().getProxyDataSourceCrossReference_5_2_1_0()); 

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
    // $ANTLR end "rule__WebServer__ProxyAssignment_5_2_1"


    // $ANTLR start "rule__CalendarScale__NameAssignment_1"
    // InternalDsl.g:9749:1: rule__CalendarScale__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CalendarScale__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9753:1: ( ( ruleEString ) )
            // InternalDsl.g:9754:2: ( ruleEString )
            {
            // InternalDsl.g:9754:2: ( ruleEString )
            // InternalDsl.g:9755:3: ruleEString
            {
             before(grammarAccess.getCalendarScaleAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCalendarScaleAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__CalendarScale__NameAssignment_1"


    // $ANTLR start "rule__CalendarScale__FactorsAssignment_4"
    // InternalDsl.g:9764:1: rule__CalendarScale__FactorsAssignment_4 : ( ruleELong ) ;
    public final void rule__CalendarScale__FactorsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9768:1: ( ( ruleELong ) )
            // InternalDsl.g:9769:2: ( ruleELong )
            {
            // InternalDsl.g:9769:2: ( ruleELong )
            // InternalDsl.g:9770:3: ruleELong
            {
             before(grammarAccess.getCalendarScaleAccess().getFactorsELongParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleELong();

            state._fsp--;

             after(grammarAccess.getCalendarScaleAccess().getFactorsELongParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__CalendarScale__FactorsAssignment_4"


    // $ANTLR start "rule__CalendarScale__PeriodsAssignment_5"
    // InternalDsl.g:9779:1: rule__CalendarScale__PeriodsAssignment_5 : ( rulePeriod ) ;
    public final void rule__CalendarScale__PeriodsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9783:1: ( ( rulePeriod ) )
            // InternalDsl.g:9784:2: ( rulePeriod )
            {
            // InternalDsl.g:9784:2: ( rulePeriod )
            // InternalDsl.g:9785:3: rulePeriod
            {
             before(grammarAccess.getCalendarScaleAccess().getPeriodsPeriodEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            rulePeriod();

            state._fsp--;

             after(grammarAccess.getCalendarScaleAccess().getPeriodsPeriodEnumRuleCall_5_0()); 

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
    // $ANTLR end "rule__CalendarScale__PeriodsAssignment_5"


    // $ANTLR start "rule__CalendarScale__FactorsAssignment_6_1"
    // InternalDsl.g:9794:1: rule__CalendarScale__FactorsAssignment_6_1 : ( ruleELong ) ;
    public final void rule__CalendarScale__FactorsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9798:1: ( ( ruleELong ) )
            // InternalDsl.g:9799:2: ( ruleELong )
            {
            // InternalDsl.g:9799:2: ( ruleELong )
            // InternalDsl.g:9800:3: ruleELong
            {
             before(grammarAccess.getCalendarScaleAccess().getFactorsELongParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleELong();

            state._fsp--;

             after(grammarAccess.getCalendarScaleAccess().getFactorsELongParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__CalendarScale__FactorsAssignment_6_1"


    // $ANTLR start "rule__CalendarScale__PeriodsAssignment_6_2"
    // InternalDsl.g:9809:1: rule__CalendarScale__PeriodsAssignment_6_2 : ( rulePeriod ) ;
    public final void rule__CalendarScale__PeriodsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9813:1: ( ( rulePeriod ) )
            // InternalDsl.g:9814:2: ( rulePeriod )
            {
            // InternalDsl.g:9814:2: ( rulePeriod )
            // InternalDsl.g:9815:3: rulePeriod
            {
             before(grammarAccess.getCalendarScaleAccess().getPeriodsPeriodEnumRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            rulePeriod();

            state._fsp--;

             after(grammarAccess.getCalendarScaleAccess().getPeriodsPeriodEnumRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__CalendarScale__PeriodsAssignment_6_2"


    // $ANTLR start "rule__FactorScale__NameAssignment_1"
    // InternalDsl.g:9824:1: rule__FactorScale__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__FactorScale__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9828:1: ( ( ruleEString ) )
            // InternalDsl.g:9829:2: ( ruleEString )
            {
            // InternalDsl.g:9829:2: ( ruleEString )
            // InternalDsl.g:9830:3: ruleEString
            {
             before(grammarAccess.getFactorScaleAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFactorScaleAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__FactorScale__NameAssignment_1"


    // $ANTLR start "rule__FactorScale__FactorAssignment_3"
    // InternalDsl.g:9839:1: rule__FactorScale__FactorAssignment_3 : ( ruleEInt ) ;
    public final void rule__FactorScale__FactorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9843:1: ( ( ruleEInt ) )
            // InternalDsl.g:9844:2: ( ruleEInt )
            {
            // InternalDsl.g:9844:2: ( ruleEInt )
            // InternalDsl.g:9845:3: ruleEInt
            {
             before(grammarAccess.getFactorScaleAccess().getFactorEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getFactorScaleAccess().getFactorEIntParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__FactorScale__FactorAssignment_3"


    // $ANTLR start "rule__FactorScale__ZoomsNumberAssignment_5"
    // InternalDsl.g:9854:1: rule__FactorScale__ZoomsNumberAssignment_5 : ( ruleEInt ) ;
    public final void rule__FactorScale__ZoomsNumberAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:9858:1: ( ( ruleEInt ) )
            // InternalDsl.g:9859:2: ( ruleEInt )
            {
            // InternalDsl.g:9859:2: ( ruleEInt )
            // InternalDsl.g:9860:3: ruleEInt
            {
             before(grammarAccess.getFactorScaleAccess().getZoomsNumberEIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getFactorScaleAccess().getZoomsNumberEIntParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__FactorScale__ZoomsNumberAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000408000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000008000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x4000008000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x8000000000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x8000000000000040L,0x0000000000000080L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x2000000000000030L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x2000008000000030L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x2000000000000032L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x00000000003FC000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x2000008000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000004000000030L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000008000000030L,0x0000000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x000000001FC00000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000003000L});

}