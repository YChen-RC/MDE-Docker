package org.xtext.example.mydocker.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydocker.services.MyDockerGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDockerParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_RAW_VALUE", "RULE_INT", "RULE_EXPOSE_PORT_PROTOCOL", "RULE_SH_COMMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'['", "']'", "','", "'='", "'CMD'", "'--'", "'ADD'", "'ARG'", "'COPY'", "'ENTRYPOINT'", "'ENV'", "'EXPOSE'", "'FROM'", "'HEALTHCHECK'", "'LABEL'", "'MAINTAINER'", "'ONBUILD'", "'RUN'", "'SHELL'", "'STOPSIGNAL'", "'USER'", "'VOLUME'", "'WORKDIR'", "'None'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_EXPOSE_PORT_PROTOCOL=8;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int RULE_SH_COMMENT=9;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_RAW_VALUE=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDockerParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDockerParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDockerParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDocker.g"; }


    	private MyDockerGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDockerGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleDocker"
    // InternalMyDocker.g:53:1: entryRuleDocker : ruleDocker EOF ;
    public final void entryRuleDocker() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SH_COMMENT");

        try {
            // InternalMyDocker.g:57:1: ( ruleDocker EOF )
            // InternalMyDocker.g:58:1: ruleDocker EOF
            {
             before(grammarAccess.getDockerRule()); 
            pushFollow(FOLLOW_1);
            ruleDocker();

            state._fsp--;

             after(grammarAccess.getDockerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleDocker"


    // $ANTLR start "ruleDocker"
    // InternalMyDocker.g:68:1: ruleDocker : ( ( rule__Docker__CommandsAssignment )* ) ;
    public final void ruleDocker() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SH_COMMENT");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:73:2: ( ( ( rule__Docker__CommandsAssignment )* ) )
            // InternalMyDocker.g:74:2: ( ( rule__Docker__CommandsAssignment )* )
            {
            // InternalMyDocker.g:74:2: ( ( rule__Docker__CommandsAssignment )* )
            // InternalMyDocker.g:75:3: ( rule__Docker__CommandsAssignment )*
            {
             before(grammarAccess.getDockerAccess().getCommandsAssignment()); 
            // InternalMyDocker.g:76:3: ( rule__Docker__CommandsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18||(LA1_0>=20 && LA1_0<=36)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDocker.g:76:4: rule__Docker__CommandsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Docker__CommandsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDockerAccess().getCommandsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleDocker"


    // $ANTLR start "entryRuleCommand"
    // InternalMyDocker.g:86:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // InternalMyDocker.g:87:1: ( ruleCommand EOF )
            // InternalMyDocker.g:88:1: ruleCommand EOF
            {
             before(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getCommandRule()); 
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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalMyDocker.g:95:1: ruleCommand : ( ( rule__Command__Alternatives ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:99:2: ( ( ( rule__Command__Alternatives ) ) )
            // InternalMyDocker.g:100:2: ( ( rule__Command__Alternatives ) )
            {
            // InternalMyDocker.g:100:2: ( ( rule__Command__Alternatives ) )
            // InternalMyDocker.g:101:3: ( rule__Command__Alternatives )
            {
             before(grammarAccess.getCommandAccess().getAlternatives()); 
            // InternalMyDocker.g:102:3: ( rule__Command__Alternatives )
            // InternalMyDocker.g:102:4: rule__Command__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Command__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleAdd"
    // InternalMyDocker.g:111:1: entryRuleAdd : ruleAdd EOF ;
    public final void entryRuleAdd() throws RecognitionException {
        try {
            // InternalMyDocker.g:112:1: ( ruleAdd EOF )
            // InternalMyDocker.g:113:1: ruleAdd EOF
            {
             before(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_1);
            ruleAdd();

            state._fsp--;

             after(grammarAccess.getAddRule()); 
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
    // $ANTLR end "entryRuleAdd"


    // $ANTLR start "ruleAdd"
    // InternalMyDocker.g:120:1: ruleAdd : ( ( rule__Add__Group__0 ) ) ;
    public final void ruleAdd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:124:2: ( ( ( rule__Add__Group__0 ) ) )
            // InternalMyDocker.g:125:2: ( ( rule__Add__Group__0 ) )
            {
            // InternalMyDocker.g:125:2: ( ( rule__Add__Group__0 ) )
            // InternalMyDocker.g:126:3: ( rule__Add__Group__0 )
            {
             before(grammarAccess.getAddAccess().getGroup()); 
            // InternalMyDocker.g:127:3: ( rule__Add__Group__0 )
            // InternalMyDocker.g:127:4: rule__Add__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Add__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdd"


    // $ANTLR start "entryRuleArg"
    // InternalMyDocker.g:136:1: entryRuleArg : ruleArg EOF ;
    public final void entryRuleArg() throws RecognitionException {
        try {
            // InternalMyDocker.g:137:1: ( ruleArg EOF )
            // InternalMyDocker.g:138:1: ruleArg EOF
            {
             before(grammarAccess.getArgRule()); 
            pushFollow(FOLLOW_1);
            ruleArg();

            state._fsp--;

             after(grammarAccess.getArgRule()); 
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
    // $ANTLR end "entryRuleArg"


    // $ANTLR start "ruleArg"
    // InternalMyDocker.g:145:1: ruleArg : ( ( rule__Arg__Group__0 ) ) ;
    public final void ruleArg() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:149:2: ( ( ( rule__Arg__Group__0 ) ) )
            // InternalMyDocker.g:150:2: ( ( rule__Arg__Group__0 ) )
            {
            // InternalMyDocker.g:150:2: ( ( rule__Arg__Group__0 ) )
            // InternalMyDocker.g:151:3: ( rule__Arg__Group__0 )
            {
             before(grammarAccess.getArgAccess().getGroup()); 
            // InternalMyDocker.g:152:3: ( rule__Arg__Group__0 )
            // InternalMyDocker.g:152:4: rule__Arg__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Arg__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArgAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArg"


    // $ANTLR start "entryRuleCmd"
    // InternalMyDocker.g:161:1: entryRuleCmd : ruleCmd EOF ;
    public final void entryRuleCmd() throws RecognitionException {
        try {
            // InternalMyDocker.g:162:1: ( ruleCmd EOF )
            // InternalMyDocker.g:163:1: ruleCmd EOF
            {
             before(grammarAccess.getCmdRule()); 
            pushFollow(FOLLOW_1);
            ruleCmd();

            state._fsp--;

             after(grammarAccess.getCmdRule()); 
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
    // $ANTLR end "entryRuleCmd"


    // $ANTLR start "ruleCmd"
    // InternalMyDocker.g:170:1: ruleCmd : ( ( rule__Cmd__Group__0 ) ) ;
    public final void ruleCmd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:174:2: ( ( ( rule__Cmd__Group__0 ) ) )
            // InternalMyDocker.g:175:2: ( ( rule__Cmd__Group__0 ) )
            {
            // InternalMyDocker.g:175:2: ( ( rule__Cmd__Group__0 ) )
            // InternalMyDocker.g:176:3: ( rule__Cmd__Group__0 )
            {
             before(grammarAccess.getCmdAccess().getGroup()); 
            // InternalMyDocker.g:177:3: ( rule__Cmd__Group__0 )
            // InternalMyDocker.g:177:4: rule__Cmd__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cmd__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCmdAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCmd"


    // $ANTLR start "entryRuleCopy"
    // InternalMyDocker.g:186:1: entryRuleCopy : ruleCopy EOF ;
    public final void entryRuleCopy() throws RecognitionException {
        try {
            // InternalMyDocker.g:187:1: ( ruleCopy EOF )
            // InternalMyDocker.g:188:1: ruleCopy EOF
            {
             before(grammarAccess.getCopyRule()); 
            pushFollow(FOLLOW_1);
            ruleCopy();

            state._fsp--;

             after(grammarAccess.getCopyRule()); 
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
    // $ANTLR end "entryRuleCopy"


    // $ANTLR start "ruleCopy"
    // InternalMyDocker.g:195:1: ruleCopy : ( ( rule__Copy__Group__0 ) ) ;
    public final void ruleCopy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:199:2: ( ( ( rule__Copy__Group__0 ) ) )
            // InternalMyDocker.g:200:2: ( ( rule__Copy__Group__0 ) )
            {
            // InternalMyDocker.g:200:2: ( ( rule__Copy__Group__0 ) )
            // InternalMyDocker.g:201:3: ( rule__Copy__Group__0 )
            {
             before(grammarAccess.getCopyAccess().getGroup()); 
            // InternalMyDocker.g:202:3: ( rule__Copy__Group__0 )
            // InternalMyDocker.g:202:4: rule__Copy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Copy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCopyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCopy"


    // $ANTLR start "entryRuleEntrypoint"
    // InternalMyDocker.g:211:1: entryRuleEntrypoint : ruleEntrypoint EOF ;
    public final void entryRuleEntrypoint() throws RecognitionException {
        try {
            // InternalMyDocker.g:212:1: ( ruleEntrypoint EOF )
            // InternalMyDocker.g:213:1: ruleEntrypoint EOF
            {
             before(grammarAccess.getEntrypointRule()); 
            pushFollow(FOLLOW_1);
            ruleEntrypoint();

            state._fsp--;

             after(grammarAccess.getEntrypointRule()); 
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
    // $ANTLR end "entryRuleEntrypoint"


    // $ANTLR start "ruleEntrypoint"
    // InternalMyDocker.g:220:1: ruleEntrypoint : ( ( rule__Entrypoint__Group__0 ) ) ;
    public final void ruleEntrypoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:224:2: ( ( ( rule__Entrypoint__Group__0 ) ) )
            // InternalMyDocker.g:225:2: ( ( rule__Entrypoint__Group__0 ) )
            {
            // InternalMyDocker.g:225:2: ( ( rule__Entrypoint__Group__0 ) )
            // InternalMyDocker.g:226:3: ( rule__Entrypoint__Group__0 )
            {
             before(grammarAccess.getEntrypointAccess().getGroup()); 
            // InternalMyDocker.g:227:3: ( rule__Entrypoint__Group__0 )
            // InternalMyDocker.g:227:4: rule__Entrypoint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entrypoint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntrypointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntrypoint"


    // $ANTLR start "entryRuleEnv"
    // InternalMyDocker.g:236:1: entryRuleEnv : ruleEnv EOF ;
    public final void entryRuleEnv() throws RecognitionException {
        try {
            // InternalMyDocker.g:237:1: ( ruleEnv EOF )
            // InternalMyDocker.g:238:1: ruleEnv EOF
            {
             before(grammarAccess.getEnvRule()); 
            pushFollow(FOLLOW_1);
            ruleEnv();

            state._fsp--;

             after(grammarAccess.getEnvRule()); 
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
    // $ANTLR end "entryRuleEnv"


    // $ANTLR start "ruleEnv"
    // InternalMyDocker.g:245:1: ruleEnv : ( ( rule__Env__Group__0 ) ) ;
    public final void ruleEnv() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:249:2: ( ( ( rule__Env__Group__0 ) ) )
            // InternalMyDocker.g:250:2: ( ( rule__Env__Group__0 ) )
            {
            // InternalMyDocker.g:250:2: ( ( rule__Env__Group__0 ) )
            // InternalMyDocker.g:251:3: ( rule__Env__Group__0 )
            {
             before(grammarAccess.getEnvAccess().getGroup()); 
            // InternalMyDocker.g:252:3: ( rule__Env__Group__0 )
            // InternalMyDocker.g:252:4: rule__Env__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Env__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnvAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnv"


    // $ANTLR start "entryRuleExpose"
    // InternalMyDocker.g:261:1: entryRuleExpose : ruleExpose EOF ;
    public final void entryRuleExpose() throws RecognitionException {
        try {
            // InternalMyDocker.g:262:1: ( ruleExpose EOF )
            // InternalMyDocker.g:263:1: ruleExpose EOF
            {
             before(grammarAccess.getExposeRule()); 
            pushFollow(FOLLOW_1);
            ruleExpose();

            state._fsp--;

             after(grammarAccess.getExposeRule()); 
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
    // $ANTLR end "entryRuleExpose"


    // $ANTLR start "ruleExpose"
    // InternalMyDocker.g:270:1: ruleExpose : ( ( rule__Expose__Group__0 ) ) ;
    public final void ruleExpose() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:274:2: ( ( ( rule__Expose__Group__0 ) ) )
            // InternalMyDocker.g:275:2: ( ( rule__Expose__Group__0 ) )
            {
            // InternalMyDocker.g:275:2: ( ( rule__Expose__Group__0 ) )
            // InternalMyDocker.g:276:3: ( rule__Expose__Group__0 )
            {
             before(grammarAccess.getExposeAccess().getGroup()); 
            // InternalMyDocker.g:277:3: ( rule__Expose__Group__0 )
            // InternalMyDocker.g:277:4: rule__Expose__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expose__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExposeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpose"


    // $ANTLR start "entryRuleFrom"
    // InternalMyDocker.g:286:1: entryRuleFrom : ruleFrom EOF ;
    public final void entryRuleFrom() throws RecognitionException {
        try {
            // InternalMyDocker.g:287:1: ( ruleFrom EOF )
            // InternalMyDocker.g:288:1: ruleFrom EOF
            {
             before(grammarAccess.getFromRule()); 
            pushFollow(FOLLOW_1);
            ruleFrom();

            state._fsp--;

             after(grammarAccess.getFromRule()); 
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
    // $ANTLR end "entryRuleFrom"


    // $ANTLR start "ruleFrom"
    // InternalMyDocker.g:295:1: ruleFrom : ( ( rule__From__Group__0 ) ) ;
    public final void ruleFrom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:299:2: ( ( ( rule__From__Group__0 ) ) )
            // InternalMyDocker.g:300:2: ( ( rule__From__Group__0 ) )
            {
            // InternalMyDocker.g:300:2: ( ( rule__From__Group__0 ) )
            // InternalMyDocker.g:301:3: ( rule__From__Group__0 )
            {
             before(grammarAccess.getFromAccess().getGroup()); 
            // InternalMyDocker.g:302:3: ( rule__From__Group__0 )
            // InternalMyDocker.g:302:4: rule__From__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__From__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFromAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFrom"


    // $ANTLR start "entryRuleHealthcheck"
    // InternalMyDocker.g:311:1: entryRuleHealthcheck : ruleHealthcheck EOF ;
    public final void entryRuleHealthcheck() throws RecognitionException {
        try {
            // InternalMyDocker.g:312:1: ( ruleHealthcheck EOF )
            // InternalMyDocker.g:313:1: ruleHealthcheck EOF
            {
             before(grammarAccess.getHealthcheckRule()); 
            pushFollow(FOLLOW_1);
            ruleHealthcheck();

            state._fsp--;

             after(grammarAccess.getHealthcheckRule()); 
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
    // $ANTLR end "entryRuleHealthcheck"


    // $ANTLR start "ruleHealthcheck"
    // InternalMyDocker.g:320:1: ruleHealthcheck : ( ( rule__Healthcheck__Group__0 ) ) ;
    public final void ruleHealthcheck() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:324:2: ( ( ( rule__Healthcheck__Group__0 ) ) )
            // InternalMyDocker.g:325:2: ( ( rule__Healthcheck__Group__0 ) )
            {
            // InternalMyDocker.g:325:2: ( ( rule__Healthcheck__Group__0 ) )
            // InternalMyDocker.g:326:3: ( rule__Healthcheck__Group__0 )
            {
             before(grammarAccess.getHealthcheckAccess().getGroup()); 
            // InternalMyDocker.g:327:3: ( rule__Healthcheck__Group__0 )
            // InternalMyDocker.g:327:4: rule__Healthcheck__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Healthcheck__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHealthcheckAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHealthcheck"


    // $ANTLR start "entryRuleLabel"
    // InternalMyDocker.g:336:1: entryRuleLabel : ruleLabel EOF ;
    public final void entryRuleLabel() throws RecognitionException {
        try {
            // InternalMyDocker.g:337:1: ( ruleLabel EOF )
            // InternalMyDocker.g:338:1: ruleLabel EOF
            {
             before(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getLabelRule()); 
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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalMyDocker.g:345:1: ruleLabel : ( ( rule__Label__Group__0 ) ) ;
    public final void ruleLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:349:2: ( ( ( rule__Label__Group__0 ) ) )
            // InternalMyDocker.g:350:2: ( ( rule__Label__Group__0 ) )
            {
            // InternalMyDocker.g:350:2: ( ( rule__Label__Group__0 ) )
            // InternalMyDocker.g:351:3: ( rule__Label__Group__0 )
            {
             before(grammarAccess.getLabelAccess().getGroup()); 
            // InternalMyDocker.g:352:3: ( rule__Label__Group__0 )
            // InternalMyDocker.g:352:4: rule__Label__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Label__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleMaintainer"
    // InternalMyDocker.g:361:1: entryRuleMaintainer : ruleMaintainer EOF ;
    public final void entryRuleMaintainer() throws RecognitionException {
        try {
            // InternalMyDocker.g:362:1: ( ruleMaintainer EOF )
            // InternalMyDocker.g:363:1: ruleMaintainer EOF
            {
             before(grammarAccess.getMaintainerRule()); 
            pushFollow(FOLLOW_1);
            ruleMaintainer();

            state._fsp--;

             after(grammarAccess.getMaintainerRule()); 
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
    // $ANTLR end "entryRuleMaintainer"


    // $ANTLR start "ruleMaintainer"
    // InternalMyDocker.g:370:1: ruleMaintainer : ( ( rule__Maintainer__Group__0 ) ) ;
    public final void ruleMaintainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:374:2: ( ( ( rule__Maintainer__Group__0 ) ) )
            // InternalMyDocker.g:375:2: ( ( rule__Maintainer__Group__0 ) )
            {
            // InternalMyDocker.g:375:2: ( ( rule__Maintainer__Group__0 ) )
            // InternalMyDocker.g:376:3: ( rule__Maintainer__Group__0 )
            {
             before(grammarAccess.getMaintainerAccess().getGroup()); 
            // InternalMyDocker.g:377:3: ( rule__Maintainer__Group__0 )
            // InternalMyDocker.g:377:4: rule__Maintainer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Maintainer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMaintainerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMaintainer"


    // $ANTLR start "entryRuleOnbuild"
    // InternalMyDocker.g:386:1: entryRuleOnbuild : ruleOnbuild EOF ;
    public final void entryRuleOnbuild() throws RecognitionException {
        try {
            // InternalMyDocker.g:387:1: ( ruleOnbuild EOF )
            // InternalMyDocker.g:388:1: ruleOnbuild EOF
            {
             before(grammarAccess.getOnbuildRule()); 
            pushFollow(FOLLOW_1);
            ruleOnbuild();

            state._fsp--;

             after(grammarAccess.getOnbuildRule()); 
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
    // $ANTLR end "entryRuleOnbuild"


    // $ANTLR start "ruleOnbuild"
    // InternalMyDocker.g:395:1: ruleOnbuild : ( ( rule__Onbuild__Group__0 ) ) ;
    public final void ruleOnbuild() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:399:2: ( ( ( rule__Onbuild__Group__0 ) ) )
            // InternalMyDocker.g:400:2: ( ( rule__Onbuild__Group__0 ) )
            {
            // InternalMyDocker.g:400:2: ( ( rule__Onbuild__Group__0 ) )
            // InternalMyDocker.g:401:3: ( rule__Onbuild__Group__0 )
            {
             before(grammarAccess.getOnbuildAccess().getGroup()); 
            // InternalMyDocker.g:402:3: ( rule__Onbuild__Group__0 )
            // InternalMyDocker.g:402:4: rule__Onbuild__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Onbuild__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOnbuildAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOnbuild"


    // $ANTLR start "entryRuleRun"
    // InternalMyDocker.g:411:1: entryRuleRun : ruleRun EOF ;
    public final void entryRuleRun() throws RecognitionException {
        try {
            // InternalMyDocker.g:412:1: ( ruleRun EOF )
            // InternalMyDocker.g:413:1: ruleRun EOF
            {
             before(grammarAccess.getRunRule()); 
            pushFollow(FOLLOW_1);
            ruleRun();

            state._fsp--;

             after(grammarAccess.getRunRule()); 
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
    // $ANTLR end "entryRuleRun"


    // $ANTLR start "ruleRun"
    // InternalMyDocker.g:420:1: ruleRun : ( ( rule__Run__Group__0 ) ) ;
    public final void ruleRun() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:424:2: ( ( ( rule__Run__Group__0 ) ) )
            // InternalMyDocker.g:425:2: ( ( rule__Run__Group__0 ) )
            {
            // InternalMyDocker.g:425:2: ( ( rule__Run__Group__0 ) )
            // InternalMyDocker.g:426:3: ( rule__Run__Group__0 )
            {
             before(grammarAccess.getRunAccess().getGroup()); 
            // InternalMyDocker.g:427:3: ( rule__Run__Group__0 )
            // InternalMyDocker.g:427:4: rule__Run__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Run__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRunAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRun"


    // $ANTLR start "entryRuleShell"
    // InternalMyDocker.g:436:1: entryRuleShell : ruleShell EOF ;
    public final void entryRuleShell() throws RecognitionException {
        try {
            // InternalMyDocker.g:437:1: ( ruleShell EOF )
            // InternalMyDocker.g:438:1: ruleShell EOF
            {
             before(grammarAccess.getShellRule()); 
            pushFollow(FOLLOW_1);
            ruleShell();

            state._fsp--;

             after(grammarAccess.getShellRule()); 
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
    // $ANTLR end "entryRuleShell"


    // $ANTLR start "ruleShell"
    // InternalMyDocker.g:445:1: ruleShell : ( ( rule__Shell__Group__0 ) ) ;
    public final void ruleShell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:449:2: ( ( ( rule__Shell__Group__0 ) ) )
            // InternalMyDocker.g:450:2: ( ( rule__Shell__Group__0 ) )
            {
            // InternalMyDocker.g:450:2: ( ( rule__Shell__Group__0 ) )
            // InternalMyDocker.g:451:3: ( rule__Shell__Group__0 )
            {
             before(grammarAccess.getShellAccess().getGroup()); 
            // InternalMyDocker.g:452:3: ( rule__Shell__Group__0 )
            // InternalMyDocker.g:452:4: rule__Shell__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Shell__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getShellAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShell"


    // $ANTLR start "entryRuleStopSignal"
    // InternalMyDocker.g:461:1: entryRuleStopSignal : ruleStopSignal EOF ;
    public final void entryRuleStopSignal() throws RecognitionException {
        try {
            // InternalMyDocker.g:462:1: ( ruleStopSignal EOF )
            // InternalMyDocker.g:463:1: ruleStopSignal EOF
            {
             before(grammarAccess.getStopSignalRule()); 
            pushFollow(FOLLOW_1);
            ruleStopSignal();

            state._fsp--;

             after(grammarAccess.getStopSignalRule()); 
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
    // $ANTLR end "entryRuleStopSignal"


    // $ANTLR start "ruleStopSignal"
    // InternalMyDocker.g:470:1: ruleStopSignal : ( ( rule__StopSignal__Group__0 ) ) ;
    public final void ruleStopSignal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:474:2: ( ( ( rule__StopSignal__Group__0 ) ) )
            // InternalMyDocker.g:475:2: ( ( rule__StopSignal__Group__0 ) )
            {
            // InternalMyDocker.g:475:2: ( ( rule__StopSignal__Group__0 ) )
            // InternalMyDocker.g:476:3: ( rule__StopSignal__Group__0 )
            {
             before(grammarAccess.getStopSignalAccess().getGroup()); 
            // InternalMyDocker.g:477:3: ( rule__StopSignal__Group__0 )
            // InternalMyDocker.g:477:4: rule__StopSignal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StopSignal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStopSignalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStopSignal"


    // $ANTLR start "entryRuleUser"
    // InternalMyDocker.g:486:1: entryRuleUser : ruleUser EOF ;
    public final void entryRuleUser() throws RecognitionException {
        try {
            // InternalMyDocker.g:487:1: ( ruleUser EOF )
            // InternalMyDocker.g:488:1: ruleUser EOF
            {
             before(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_1);
            ruleUser();

            state._fsp--;

             after(grammarAccess.getUserRule()); 
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
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // InternalMyDocker.g:495:1: ruleUser : ( ( rule__User__Group__0 ) ) ;
    public final void ruleUser() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:499:2: ( ( ( rule__User__Group__0 ) ) )
            // InternalMyDocker.g:500:2: ( ( rule__User__Group__0 ) )
            {
            // InternalMyDocker.g:500:2: ( ( rule__User__Group__0 ) )
            // InternalMyDocker.g:501:3: ( rule__User__Group__0 )
            {
             before(grammarAccess.getUserAccess().getGroup()); 
            // InternalMyDocker.g:502:3: ( rule__User__Group__0 )
            // InternalMyDocker.g:502:4: rule__User__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__User__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUser"


    // $ANTLR start "entryRuleVolume"
    // InternalMyDocker.g:511:1: entryRuleVolume : ruleVolume EOF ;
    public final void entryRuleVolume() throws RecognitionException {
        try {
            // InternalMyDocker.g:512:1: ( ruleVolume EOF )
            // InternalMyDocker.g:513:1: ruleVolume EOF
            {
             before(grammarAccess.getVolumeRule()); 
            pushFollow(FOLLOW_1);
            ruleVolume();

            state._fsp--;

             after(grammarAccess.getVolumeRule()); 
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
    // $ANTLR end "entryRuleVolume"


    // $ANTLR start "ruleVolume"
    // InternalMyDocker.g:520:1: ruleVolume : ( ( rule__Volume__Group__0 ) ) ;
    public final void ruleVolume() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:524:2: ( ( ( rule__Volume__Group__0 ) ) )
            // InternalMyDocker.g:525:2: ( ( rule__Volume__Group__0 ) )
            {
            // InternalMyDocker.g:525:2: ( ( rule__Volume__Group__0 ) )
            // InternalMyDocker.g:526:3: ( rule__Volume__Group__0 )
            {
             before(grammarAccess.getVolumeAccess().getGroup()); 
            // InternalMyDocker.g:527:3: ( rule__Volume__Group__0 )
            // InternalMyDocker.g:527:4: rule__Volume__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Volume__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVolumeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVolume"


    // $ANTLR start "entryRuleWorkdir"
    // InternalMyDocker.g:536:1: entryRuleWorkdir : ruleWorkdir EOF ;
    public final void entryRuleWorkdir() throws RecognitionException {
        try {
            // InternalMyDocker.g:537:1: ( ruleWorkdir EOF )
            // InternalMyDocker.g:538:1: ruleWorkdir EOF
            {
             before(grammarAccess.getWorkdirRule()); 
            pushFollow(FOLLOW_1);
            ruleWorkdir();

            state._fsp--;

             after(grammarAccess.getWorkdirRule()); 
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
    // $ANTLR end "entryRuleWorkdir"


    // $ANTLR start "ruleWorkdir"
    // InternalMyDocker.g:545:1: ruleWorkdir : ( ( rule__Workdir__Group__0 ) ) ;
    public final void ruleWorkdir() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:549:2: ( ( ( rule__Workdir__Group__0 ) ) )
            // InternalMyDocker.g:550:2: ( ( rule__Workdir__Group__0 ) )
            {
            // InternalMyDocker.g:550:2: ( ( rule__Workdir__Group__0 ) )
            // InternalMyDocker.g:551:3: ( rule__Workdir__Group__0 )
            {
             before(grammarAccess.getWorkdirAccess().getGroup()); 
            // InternalMyDocker.g:552:3: ( rule__Workdir__Group__0 )
            // InternalMyDocker.g:552:4: rule__Workdir__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Workdir__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkdirAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorkdir"


    // $ANTLR start "entryRuleCommandArgs"
    // InternalMyDocker.g:561:1: entryRuleCommandArgs : ruleCommandArgs EOF ;
    public final void entryRuleCommandArgs() throws RecognitionException {
        try {
            // InternalMyDocker.g:562:1: ( ruleCommandArgs EOF )
            // InternalMyDocker.g:563:1: ruleCommandArgs EOF
            {
             before(grammarAccess.getCommandArgsRule()); 
            pushFollow(FOLLOW_1);
            ruleCommandArgs();

            state._fsp--;

             after(grammarAccess.getCommandArgsRule()); 
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
    // $ANTLR end "entryRuleCommandArgs"


    // $ANTLR start "ruleCommandArgs"
    // InternalMyDocker.g:570:1: ruleCommandArgs : ( ( rule__CommandArgs__Alternatives ) ) ;
    public final void ruleCommandArgs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:574:2: ( ( ( rule__CommandArgs__Alternatives ) ) )
            // InternalMyDocker.g:575:2: ( ( rule__CommandArgs__Alternatives ) )
            {
            // InternalMyDocker.g:575:2: ( ( rule__CommandArgs__Alternatives ) )
            // InternalMyDocker.g:576:3: ( rule__CommandArgs__Alternatives )
            {
             before(grammarAccess.getCommandArgsAccess().getAlternatives()); 
            // InternalMyDocker.g:577:3: ( rule__CommandArgs__Alternatives )
            // InternalMyDocker.g:577:4: rule__CommandArgs__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CommandArgs__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCommandArgsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommandArgs"


    // $ANTLR start "entryRuleJSONArgs"
    // InternalMyDocker.g:586:1: entryRuleJSONArgs : ruleJSONArgs EOF ;
    public final void entryRuleJSONArgs() throws RecognitionException {
        try {
            // InternalMyDocker.g:587:1: ( ruleJSONArgs EOF )
            // InternalMyDocker.g:588:1: ruleJSONArgs EOF
            {
             before(grammarAccess.getJSONArgsRule()); 
            pushFollow(FOLLOW_1);
            ruleJSONArgs();

            state._fsp--;

             after(grammarAccess.getJSONArgsRule()); 
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
    // $ANTLR end "entryRuleJSONArgs"


    // $ANTLR start "ruleJSONArgs"
    // InternalMyDocker.g:595:1: ruleJSONArgs : ( ( rule__JSONArgs__Alternatives ) ) ;
    public final void ruleJSONArgs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:599:2: ( ( ( rule__JSONArgs__Alternatives ) ) )
            // InternalMyDocker.g:600:2: ( ( rule__JSONArgs__Alternatives ) )
            {
            // InternalMyDocker.g:600:2: ( ( rule__JSONArgs__Alternatives ) )
            // InternalMyDocker.g:601:3: ( rule__JSONArgs__Alternatives )
            {
             before(grammarAccess.getJSONArgsAccess().getAlternatives()); 
            // InternalMyDocker.g:602:3: ( rule__JSONArgs__Alternatives )
            // InternalMyDocker.g:602:4: rule__JSONArgs__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__JSONArgs__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJSONArgsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJSONArgs"


    // $ANTLR start "entryRuleSpaceArgs"
    // InternalMyDocker.g:611:1: entryRuleSpaceArgs : ruleSpaceArgs EOF ;
    public final void entryRuleSpaceArgs() throws RecognitionException {
        try {
            // InternalMyDocker.g:612:1: ( ruleSpaceArgs EOF )
            // InternalMyDocker.g:613:1: ruleSpaceArgs EOF
            {
             before(grammarAccess.getSpaceArgsRule()); 
            pushFollow(FOLLOW_1);
            ruleSpaceArgs();

            state._fsp--;

             after(grammarAccess.getSpaceArgsRule()); 
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
    // $ANTLR end "entryRuleSpaceArgs"


    // $ANTLR start "ruleSpaceArgs"
    // InternalMyDocker.g:620:1: ruleSpaceArgs : ( ( rule__SpaceArgs__Group__0 ) ) ;
    public final void ruleSpaceArgs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:624:2: ( ( ( rule__SpaceArgs__Group__0 ) ) )
            // InternalMyDocker.g:625:2: ( ( rule__SpaceArgs__Group__0 ) )
            {
            // InternalMyDocker.g:625:2: ( ( rule__SpaceArgs__Group__0 ) )
            // InternalMyDocker.g:626:3: ( rule__SpaceArgs__Group__0 )
            {
             before(grammarAccess.getSpaceArgsAccess().getGroup()); 
            // InternalMyDocker.g:627:3: ( rule__SpaceArgs__Group__0 )
            // InternalMyDocker.g:627:4: rule__SpaceArgs__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SpaceArgs__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpaceArgsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpaceArgs"


    // $ANTLR start "entryRuleNameVals"
    // InternalMyDocker.g:636:1: entryRuleNameVals : ruleNameVals EOF ;
    public final void entryRuleNameVals() throws RecognitionException {
        try {
            // InternalMyDocker.g:637:1: ( ruleNameVals EOF )
            // InternalMyDocker.g:638:1: ruleNameVals EOF
            {
             before(grammarAccess.getNameValsRule()); 
            pushFollow(FOLLOW_1);
            ruleNameVals();

            state._fsp--;

             after(grammarAccess.getNameValsRule()); 
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
    // $ANTLR end "entryRuleNameVals"


    // $ANTLR start "ruleNameVals"
    // InternalMyDocker.g:645:1: ruleNameVals : ( ( ( rule__NameVals__ValuesAssignment ) ) ( ( rule__NameVals__ValuesAssignment )* ) ) ;
    public final void ruleNameVals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:649:2: ( ( ( ( rule__NameVals__ValuesAssignment ) ) ( ( rule__NameVals__ValuesAssignment )* ) ) )
            // InternalMyDocker.g:650:2: ( ( ( rule__NameVals__ValuesAssignment ) ) ( ( rule__NameVals__ValuesAssignment )* ) )
            {
            // InternalMyDocker.g:650:2: ( ( ( rule__NameVals__ValuesAssignment ) ) ( ( rule__NameVals__ValuesAssignment )* ) )
            // InternalMyDocker.g:651:3: ( ( rule__NameVals__ValuesAssignment ) ) ( ( rule__NameVals__ValuesAssignment )* )
            {
            // InternalMyDocker.g:651:3: ( ( rule__NameVals__ValuesAssignment ) )
            // InternalMyDocker.g:652:4: ( rule__NameVals__ValuesAssignment )
            {
             before(grammarAccess.getNameValsAccess().getValuesAssignment()); 
            // InternalMyDocker.g:653:4: ( rule__NameVals__ValuesAssignment )
            // InternalMyDocker.g:653:5: rule__NameVals__ValuesAssignment
            {
            pushFollow(FOLLOW_4);
            rule__NameVals__ValuesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNameValsAccess().getValuesAssignment()); 

            }

            // InternalMyDocker.g:656:3: ( ( rule__NameVals__ValuesAssignment )* )
            // InternalMyDocker.g:657:4: ( rule__NameVals__ValuesAssignment )*
            {
             before(grammarAccess.getNameValsAccess().getValuesAssignment()); 
            // InternalMyDocker.g:658:4: ( rule__NameVals__ValuesAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDocker.g:658:5: rule__NameVals__ValuesAssignment
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__NameVals__ValuesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getNameValsAccess().getValuesAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNameVals"


    // $ANTLR start "entryRuleNameVal"
    // InternalMyDocker.g:668:1: entryRuleNameVal : ruleNameVal EOF ;
    public final void entryRuleNameVal() throws RecognitionException {
        try {
            // InternalMyDocker.g:669:1: ( ruleNameVal EOF )
            // InternalMyDocker.g:670:1: ruleNameVal EOF
            {
             before(grammarAccess.getNameValRule()); 
            pushFollow(FOLLOW_1);
            ruleNameVal();

            state._fsp--;

             after(grammarAccess.getNameValRule()); 
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
    // $ANTLR end "entryRuleNameVal"


    // $ANTLR start "ruleNameVal"
    // InternalMyDocker.g:677:1: ruleNameVal : ( ( rule__NameVal__Alternatives ) ) ;
    public final void ruleNameVal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:681:2: ( ( ( rule__NameVal__Alternatives ) ) )
            // InternalMyDocker.g:682:2: ( ( rule__NameVal__Alternatives ) )
            {
            // InternalMyDocker.g:682:2: ( ( rule__NameVal__Alternatives ) )
            // InternalMyDocker.g:683:3: ( rule__NameVal__Alternatives )
            {
             before(grammarAccess.getNameValAccess().getAlternatives()); 
            // InternalMyDocker.g:684:3: ( rule__NameVal__Alternatives )
            // InternalMyDocker.g:684:4: rule__NameVal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NameVal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNameValAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNameVal"


    // $ANTLR start "entryRuleArgArgs"
    // InternalMyDocker.g:693:1: entryRuleArgArgs : ruleArgArgs EOF ;
    public final void entryRuleArgArgs() throws RecognitionException {
        try {
            // InternalMyDocker.g:694:1: ( ruleArgArgs EOF )
            // InternalMyDocker.g:695:1: ruleArgArgs EOF
            {
             before(grammarAccess.getArgArgsRule()); 
            pushFollow(FOLLOW_1);
            ruleArgArgs();

            state._fsp--;

             after(grammarAccess.getArgArgsRule()); 
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
    // $ANTLR end "entryRuleArgArgs"


    // $ANTLR start "ruleArgArgs"
    // InternalMyDocker.g:702:1: ruleArgArgs : ( ( rule__ArgArgs__Alternatives ) ) ;
    public final void ruleArgArgs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:706:2: ( ( ( rule__ArgArgs__Alternatives ) ) )
            // InternalMyDocker.g:707:2: ( ( rule__ArgArgs__Alternatives ) )
            {
            // InternalMyDocker.g:707:2: ( ( rule__ArgArgs__Alternatives ) )
            // InternalMyDocker.g:708:3: ( rule__ArgArgs__Alternatives )
            {
             before(grammarAccess.getArgArgsAccess().getAlternatives()); 
            // InternalMyDocker.g:709:3: ( rule__ArgArgs__Alternatives )
            // InternalMyDocker.g:709:4: rule__ArgArgs__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ArgArgs__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArgArgsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArgArgs"


    // $ANTLR start "entryRuleHealthArgs"
    // InternalMyDocker.g:718:1: entryRuleHealthArgs : ruleHealthArgs EOF ;
    public final void entryRuleHealthArgs() throws RecognitionException {
        try {
            // InternalMyDocker.g:719:1: ( ruleHealthArgs EOF )
            // InternalMyDocker.g:720:1: ruleHealthArgs EOF
            {
             before(grammarAccess.getHealthArgsRule()); 
            pushFollow(FOLLOW_1);
            ruleHealthArgs();

            state._fsp--;

             after(grammarAccess.getHealthArgsRule()); 
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
    // $ANTLR end "entryRuleHealthArgs"


    // $ANTLR start "ruleHealthArgs"
    // InternalMyDocker.g:727:1: ruleHealthArgs : ( ( rule__HealthArgs__Alternatives ) ) ;
    public final void ruleHealthArgs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:731:2: ( ( ( rule__HealthArgs__Alternatives ) ) )
            // InternalMyDocker.g:732:2: ( ( rule__HealthArgs__Alternatives ) )
            {
            // InternalMyDocker.g:732:2: ( ( rule__HealthArgs__Alternatives ) )
            // InternalMyDocker.g:733:3: ( rule__HealthArgs__Alternatives )
            {
             before(grammarAccess.getHealthArgsAccess().getAlternatives()); 
            // InternalMyDocker.g:734:3: ( rule__HealthArgs__Alternatives )
            // InternalMyDocker.g:734:4: rule__HealthArgs__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__HealthArgs__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHealthArgsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHealthArgs"


    // $ANTLR start "entryRuleOptions"
    // InternalMyDocker.g:743:1: entryRuleOptions : ruleOptions EOF ;
    public final void entryRuleOptions() throws RecognitionException {
        try {
            // InternalMyDocker.g:744:1: ( ruleOptions EOF )
            // InternalMyDocker.g:745:1: ruleOptions EOF
            {
             before(grammarAccess.getOptionsRule()); 
            pushFollow(FOLLOW_1);
            ruleOptions();

            state._fsp--;

             after(grammarAccess.getOptionsRule()); 
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
    // $ANTLR end "entryRuleOptions"


    // $ANTLR start "ruleOptions"
    // InternalMyDocker.g:752:1: ruleOptions : ( ( rule__Options__Group__0 ) ) ;
    public final void ruleOptions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:756:2: ( ( ( rule__Options__Group__0 ) ) )
            // InternalMyDocker.g:757:2: ( ( rule__Options__Group__0 ) )
            {
            // InternalMyDocker.g:757:2: ( ( rule__Options__Group__0 ) )
            // InternalMyDocker.g:758:3: ( rule__Options__Group__0 )
            {
             before(grammarAccess.getOptionsAccess().getGroup()); 
            // InternalMyDocker.g:759:3: ( rule__Options__Group__0 )
            // InternalMyDocker.g:759:4: rule__Options__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Options__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOptions"


    // $ANTLR start "entryRuleOption"
    // InternalMyDocker.g:768:1: entryRuleOption : ruleOption EOF ;
    public final void entryRuleOption() throws RecognitionException {
        try {
            // InternalMyDocker.g:769:1: ( ruleOption EOF )
            // InternalMyDocker.g:770:1: ruleOption EOF
            {
             before(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_1);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getOptionRule()); 
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
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // InternalMyDocker.g:777:1: ruleOption : ( ( rule__Option__Group__0 ) ) ;
    public final void ruleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:781:2: ( ( ( rule__Option__Group__0 ) ) )
            // InternalMyDocker.g:782:2: ( ( rule__Option__Group__0 ) )
            {
            // InternalMyDocker.g:782:2: ( ( rule__Option__Group__0 ) )
            // InternalMyDocker.g:783:3: ( rule__Option__Group__0 )
            {
             before(grammarAccess.getOptionAccess().getGroup()); 
            // InternalMyDocker.g:784:3: ( rule__Option__Group__0 )
            // InternalMyDocker.g:784:4: rule__Option__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Option__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleValue"
    // InternalMyDocker.g:793:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalMyDocker.g:794:1: ( ruleValue EOF )
            // InternalMyDocker.g:795:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalMyDocker.g:802:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:806:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalMyDocker.g:807:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalMyDocker.g:807:2: ( ( rule__Value__Alternatives ) )
            // InternalMyDocker.g:808:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalMyDocker.g:809:3: ( rule__Value__Alternatives )
            // InternalMyDocker.g:809:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleExposeArgs"
    // InternalMyDocker.g:818:1: entryRuleExposeArgs : ruleExposeArgs EOF ;
    public final void entryRuleExposeArgs() throws RecognitionException {
        try {
            // InternalMyDocker.g:819:1: ( ruleExposeArgs EOF )
            // InternalMyDocker.g:820:1: ruleExposeArgs EOF
            {
             before(grammarAccess.getExposeArgsRule()); 
            pushFollow(FOLLOW_1);
            ruleExposeArgs();

            state._fsp--;

             after(grammarAccess.getExposeArgsRule()); 
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
    // $ANTLR end "entryRuleExposeArgs"


    // $ANTLR start "ruleExposeArgs"
    // InternalMyDocker.g:827:1: ruleExposeArgs : ( ( ( rule__ExposeArgs__PortsAssignment ) ) ( ( rule__ExposeArgs__PortsAssignment )* ) ) ;
    public final void ruleExposeArgs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:831:2: ( ( ( ( rule__ExposeArgs__PortsAssignment ) ) ( ( rule__ExposeArgs__PortsAssignment )* ) ) )
            // InternalMyDocker.g:832:2: ( ( ( rule__ExposeArgs__PortsAssignment ) ) ( ( rule__ExposeArgs__PortsAssignment )* ) )
            {
            // InternalMyDocker.g:832:2: ( ( ( rule__ExposeArgs__PortsAssignment ) ) ( ( rule__ExposeArgs__PortsAssignment )* ) )
            // InternalMyDocker.g:833:3: ( ( rule__ExposeArgs__PortsAssignment ) ) ( ( rule__ExposeArgs__PortsAssignment )* )
            {
            // InternalMyDocker.g:833:3: ( ( rule__ExposeArgs__PortsAssignment ) )
            // InternalMyDocker.g:834:4: ( rule__ExposeArgs__PortsAssignment )
            {
             before(grammarAccess.getExposeArgsAccess().getPortsAssignment()); 
            // InternalMyDocker.g:835:4: ( rule__ExposeArgs__PortsAssignment )
            // InternalMyDocker.g:835:5: rule__ExposeArgs__PortsAssignment
            {
            pushFollow(FOLLOW_5);
            rule__ExposeArgs__PortsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getExposeArgsAccess().getPortsAssignment()); 

            }

            // InternalMyDocker.g:838:3: ( ( rule__ExposeArgs__PortsAssignment )* )
            // InternalMyDocker.g:839:4: ( rule__ExposeArgs__PortsAssignment )*
            {
             before(grammarAccess.getExposeArgsAccess().getPortsAssignment()); 
            // InternalMyDocker.g:840:4: ( rule__ExposeArgs__PortsAssignment )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_INT && LA3_0<=RULE_EXPOSE_PORT_PROTOCOL)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDocker.g:840:5: rule__ExposeArgs__PortsAssignment
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__ExposeArgs__PortsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getExposeArgsAccess().getPortsAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExposeArgs"


    // $ANTLR start "entryRuleExposeArg"
    // InternalMyDocker.g:850:1: entryRuleExposeArg : ruleExposeArg EOF ;
    public final void entryRuleExposeArg() throws RecognitionException {
        try {
            // InternalMyDocker.g:851:1: ( ruleExposeArg EOF )
            // InternalMyDocker.g:852:1: ruleExposeArg EOF
            {
             before(grammarAccess.getExposeArgRule()); 
            pushFollow(FOLLOW_1);
            ruleExposeArg();

            state._fsp--;

             after(grammarAccess.getExposeArgRule()); 
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
    // $ANTLR end "entryRuleExposeArg"


    // $ANTLR start "ruleExposeArg"
    // InternalMyDocker.g:859:1: ruleExposeArg : ( ( rule__ExposeArg__Alternatives ) ) ;
    public final void ruleExposeArg() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:863:2: ( ( ( rule__ExposeArg__Alternatives ) ) )
            // InternalMyDocker.g:864:2: ( ( rule__ExposeArg__Alternatives ) )
            {
            // InternalMyDocker.g:864:2: ( ( rule__ExposeArg__Alternatives ) )
            // InternalMyDocker.g:865:3: ( rule__ExposeArg__Alternatives )
            {
             before(grammarAccess.getExposeArgAccess().getAlternatives()); 
            // InternalMyDocker.g:866:3: ( rule__ExposeArg__Alternatives )
            // InternalMyDocker.g:866:4: rule__ExposeArg__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExposeArg__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExposeArgAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExposeArg"


    // $ANTLR start "rule__Command__Alternatives"
    // InternalMyDocker.g:874:1: rule__Command__Alternatives : ( ( ruleAdd ) | ( ruleArg ) | ( ruleCmd ) | ( ruleCopy ) | ( ruleEntrypoint ) | ( ruleEnv ) | ( ruleExpose ) | ( ruleFrom ) | ( ruleHealthcheck ) | ( ruleLabel ) | ( ruleMaintainer ) | ( ruleOnbuild ) | ( ruleRun ) | ( ruleShell ) | ( ruleStopSignal ) | ( ruleUser ) | ( ruleVolume ) | ( ruleWorkdir ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:878:1: ( ( ruleAdd ) | ( ruleArg ) | ( ruleCmd ) | ( ruleCopy ) | ( ruleEntrypoint ) | ( ruleEnv ) | ( ruleExpose ) | ( ruleFrom ) | ( ruleHealthcheck ) | ( ruleLabel ) | ( ruleMaintainer ) | ( ruleOnbuild ) | ( ruleRun ) | ( ruleShell ) | ( ruleStopSignal ) | ( ruleUser ) | ( ruleVolume ) | ( ruleWorkdir ) )
            int alt4=18;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt4=1;
                }
                break;
            case 21:
                {
                alt4=2;
                }
                break;
            case 18:
                {
                alt4=3;
                }
                break;
            case 22:
                {
                alt4=4;
                }
                break;
            case 23:
                {
                alt4=5;
                }
                break;
            case 24:
                {
                alt4=6;
                }
                break;
            case 25:
                {
                alt4=7;
                }
                break;
            case 26:
                {
                alt4=8;
                }
                break;
            case 27:
                {
                alt4=9;
                }
                break;
            case 28:
                {
                alt4=10;
                }
                break;
            case 29:
                {
                alt4=11;
                }
                break;
            case 30:
                {
                alt4=12;
                }
                break;
            case 31:
                {
                alt4=13;
                }
                break;
            case 32:
                {
                alt4=14;
                }
                break;
            case 33:
                {
                alt4=15;
                }
                break;
            case 34:
                {
                alt4=16;
                }
                break;
            case 35:
                {
                alt4=17;
                }
                break;
            case 36:
                {
                alt4=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDocker.g:879:2: ( ruleAdd )
                    {
                    // InternalMyDocker.g:879:2: ( ruleAdd )
                    // InternalMyDocker.g:880:3: ruleAdd
                    {
                     before(grammarAccess.getCommandAccess().getAddParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAdd();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getAddParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDocker.g:885:2: ( ruleArg )
                    {
                    // InternalMyDocker.g:885:2: ( ruleArg )
                    // InternalMyDocker.g:886:3: ruleArg
                    {
                     before(grammarAccess.getCommandAccess().getArgParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleArg();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getArgParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDocker.g:891:2: ( ruleCmd )
                    {
                    // InternalMyDocker.g:891:2: ( ruleCmd )
                    // InternalMyDocker.g:892:3: ruleCmd
                    {
                     before(grammarAccess.getCommandAccess().getCmdParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCmd();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getCmdParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDocker.g:897:2: ( ruleCopy )
                    {
                    // InternalMyDocker.g:897:2: ( ruleCopy )
                    // InternalMyDocker.g:898:3: ruleCopy
                    {
                     before(grammarAccess.getCommandAccess().getCopyParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCopy();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getCopyParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDocker.g:903:2: ( ruleEntrypoint )
                    {
                    // InternalMyDocker.g:903:2: ( ruleEntrypoint )
                    // InternalMyDocker.g:904:3: ruleEntrypoint
                    {
                     before(grammarAccess.getCommandAccess().getEntrypointParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleEntrypoint();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getEntrypointParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDocker.g:909:2: ( ruleEnv )
                    {
                    // InternalMyDocker.g:909:2: ( ruleEnv )
                    // InternalMyDocker.g:910:3: ruleEnv
                    {
                     before(grammarAccess.getCommandAccess().getEnvParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleEnv();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getEnvParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDocker.g:915:2: ( ruleExpose )
                    {
                    // InternalMyDocker.g:915:2: ( ruleExpose )
                    // InternalMyDocker.g:916:3: ruleExpose
                    {
                     before(grammarAccess.getCommandAccess().getExposeParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleExpose();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getExposeParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDocker.g:921:2: ( ruleFrom )
                    {
                    // InternalMyDocker.g:921:2: ( ruleFrom )
                    // InternalMyDocker.g:922:3: ruleFrom
                    {
                     before(grammarAccess.getCommandAccess().getFromParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleFrom();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getFromParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDocker.g:927:2: ( ruleHealthcheck )
                    {
                    // InternalMyDocker.g:927:2: ( ruleHealthcheck )
                    // InternalMyDocker.g:928:3: ruleHealthcheck
                    {
                     before(grammarAccess.getCommandAccess().getHealthcheckParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleHealthcheck();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getHealthcheckParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDocker.g:933:2: ( ruleLabel )
                    {
                    // InternalMyDocker.g:933:2: ( ruleLabel )
                    // InternalMyDocker.g:934:3: ruleLabel
                    {
                     before(grammarAccess.getCommandAccess().getLabelParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleLabel();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getLabelParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDocker.g:939:2: ( ruleMaintainer )
                    {
                    // InternalMyDocker.g:939:2: ( ruleMaintainer )
                    // InternalMyDocker.g:940:3: ruleMaintainer
                    {
                     before(grammarAccess.getCommandAccess().getMaintainerParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleMaintainer();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getMaintainerParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalMyDocker.g:945:2: ( ruleOnbuild )
                    {
                    // InternalMyDocker.g:945:2: ( ruleOnbuild )
                    // InternalMyDocker.g:946:3: ruleOnbuild
                    {
                     before(grammarAccess.getCommandAccess().getOnbuildParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
                    ruleOnbuild();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getOnbuildParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalMyDocker.g:951:2: ( ruleRun )
                    {
                    // InternalMyDocker.g:951:2: ( ruleRun )
                    // InternalMyDocker.g:952:3: ruleRun
                    {
                     before(grammarAccess.getCommandAccess().getRunParserRuleCall_12()); 
                    pushFollow(FOLLOW_2);
                    ruleRun();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getRunParserRuleCall_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalMyDocker.g:957:2: ( ruleShell )
                    {
                    // InternalMyDocker.g:957:2: ( ruleShell )
                    // InternalMyDocker.g:958:3: ruleShell
                    {
                     before(grammarAccess.getCommandAccess().getShellParserRuleCall_13()); 
                    pushFollow(FOLLOW_2);
                    ruleShell();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getShellParserRuleCall_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalMyDocker.g:963:2: ( ruleStopSignal )
                    {
                    // InternalMyDocker.g:963:2: ( ruleStopSignal )
                    // InternalMyDocker.g:964:3: ruleStopSignal
                    {
                     before(grammarAccess.getCommandAccess().getStopSignalParserRuleCall_14()); 
                    pushFollow(FOLLOW_2);
                    ruleStopSignal();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getStopSignalParserRuleCall_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalMyDocker.g:969:2: ( ruleUser )
                    {
                    // InternalMyDocker.g:969:2: ( ruleUser )
                    // InternalMyDocker.g:970:3: ruleUser
                    {
                     before(grammarAccess.getCommandAccess().getUserParserRuleCall_15()); 
                    pushFollow(FOLLOW_2);
                    ruleUser();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getUserParserRuleCall_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalMyDocker.g:975:2: ( ruleVolume )
                    {
                    // InternalMyDocker.g:975:2: ( ruleVolume )
                    // InternalMyDocker.g:976:3: ruleVolume
                    {
                     before(grammarAccess.getCommandAccess().getVolumeParserRuleCall_16()); 
                    pushFollow(FOLLOW_2);
                    ruleVolume();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getVolumeParserRuleCall_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalMyDocker.g:981:2: ( ruleWorkdir )
                    {
                    // InternalMyDocker.g:981:2: ( ruleWorkdir )
                    // InternalMyDocker.g:982:3: ruleWorkdir
                    {
                     before(grammarAccess.getCommandAccess().getWorkdirParserRuleCall_17()); 
                    pushFollow(FOLLOW_2);
                    ruleWorkdir();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getWorkdirParserRuleCall_17()); 

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
    // $ANTLR end "rule__Command__Alternatives"


    // $ANTLR start "rule__CommandArgs__Alternatives"
    // InternalMyDocker.g:991:1: rule__CommandArgs__Alternatives : ( ( ruleJSONArgs ) | ( ruleSpaceArgs ) );
    public final void rule__CommandArgs__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:995:1: ( ( ruleJSONArgs ) | ( ruleSpaceArgs ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_RAW_VALUE)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDocker.g:996:2: ( ruleJSONArgs )
                    {
                    // InternalMyDocker.g:996:2: ( ruleJSONArgs )
                    // InternalMyDocker.g:997:3: ruleJSONArgs
                    {
                     before(grammarAccess.getCommandArgsAccess().getJSONArgsParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleJSONArgs();

                    state._fsp--;

                     after(grammarAccess.getCommandArgsAccess().getJSONArgsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDocker.g:1002:2: ( ruleSpaceArgs )
                    {
                    // InternalMyDocker.g:1002:2: ( ruleSpaceArgs )
                    // InternalMyDocker.g:1003:3: ruleSpaceArgs
                    {
                     before(grammarAccess.getCommandArgsAccess().getSpaceArgsParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSpaceArgs();

                    state._fsp--;

                     after(grammarAccess.getCommandArgsAccess().getSpaceArgsParserRuleCall_1()); 

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
    // $ANTLR end "rule__CommandArgs__Alternatives"


    // $ANTLR start "rule__JSONArgs__Alternatives"
    // InternalMyDocker.g:1012:1: rule__JSONArgs__Alternatives : ( ( ( rule__JSONArgs__Group_0__0 ) ) | ( ( rule__JSONArgs__Group_1__0 ) ) );
    public final void rule__JSONArgs__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1016:1: ( ( ( rule__JSONArgs__Group_0__0 ) ) | ( ( rule__JSONArgs__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==15) ) {
                    alt6=2;
                }
                else if ( (LA6_1==RULE_STRING) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDocker.g:1017:2: ( ( rule__JSONArgs__Group_0__0 ) )
                    {
                    // InternalMyDocker.g:1017:2: ( ( rule__JSONArgs__Group_0__0 ) )
                    // InternalMyDocker.g:1018:3: ( rule__JSONArgs__Group_0__0 )
                    {
                     before(grammarAccess.getJSONArgsAccess().getGroup_0()); 
                    // InternalMyDocker.g:1019:3: ( rule__JSONArgs__Group_0__0 )
                    // InternalMyDocker.g:1019:4: rule__JSONArgs__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JSONArgs__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJSONArgsAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDocker.g:1023:2: ( ( rule__JSONArgs__Group_1__0 ) )
                    {
                    // InternalMyDocker.g:1023:2: ( ( rule__JSONArgs__Group_1__0 ) )
                    // InternalMyDocker.g:1024:3: ( rule__JSONArgs__Group_1__0 )
                    {
                     before(grammarAccess.getJSONArgsAccess().getGroup_1()); 
                    // InternalMyDocker.g:1025:3: ( rule__JSONArgs__Group_1__0 )
                    // InternalMyDocker.g:1025:4: rule__JSONArgs__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JSONArgs__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJSONArgsAccess().getGroup_1()); 

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
    // $ANTLR end "rule__JSONArgs__Alternatives"


    // $ANTLR start "rule__NameVal__Alternatives"
    // InternalMyDocker.g:1033:1: rule__NameVal__Alternatives : ( ( ( rule__NameVal__Group_0__0 ) ) | ( ( rule__NameVal__Group_1__0 ) ) );
    public final void rule__NameVal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1037:1: ( ( ( rule__NameVal__Group_0__0 ) ) | ( ( rule__NameVal__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==17) ) {
                    alt7=2;
                }
                else if ( ((LA7_1>=RULE_STRING && LA7_1<=RULE_RAW_VALUE)) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDocker.g:1038:2: ( ( rule__NameVal__Group_0__0 ) )
                    {
                    // InternalMyDocker.g:1038:2: ( ( rule__NameVal__Group_0__0 ) )
                    // InternalMyDocker.g:1039:3: ( rule__NameVal__Group_0__0 )
                    {
                     before(grammarAccess.getNameValAccess().getGroup_0()); 
                    // InternalMyDocker.g:1040:3: ( rule__NameVal__Group_0__0 )
                    // InternalMyDocker.g:1040:4: rule__NameVal__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NameVal__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNameValAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDocker.g:1044:2: ( ( rule__NameVal__Group_1__0 ) )
                    {
                    // InternalMyDocker.g:1044:2: ( ( rule__NameVal__Group_1__0 ) )
                    // InternalMyDocker.g:1045:3: ( rule__NameVal__Group_1__0 )
                    {
                     before(grammarAccess.getNameValAccess().getGroup_1()); 
                    // InternalMyDocker.g:1046:3: ( rule__NameVal__Group_1__0 )
                    // InternalMyDocker.g:1046:4: rule__NameVal__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NameVal__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNameValAccess().getGroup_1()); 

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
    // $ANTLR end "rule__NameVal__Alternatives"


    // $ANTLR start "rule__ArgArgs__Alternatives"
    // InternalMyDocker.g:1054:1: rule__ArgArgs__Alternatives : ( ( ( rule__ArgArgs__Group_0__0 ) ) | ( ( rule__ArgArgs__ValuesAssignment_1 ) ) );
    public final void rule__ArgArgs__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1058:1: ( ( ( rule__ArgArgs__Group_0__0 ) ) | ( ( rule__ArgArgs__ValuesAssignment_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING||LA8_0==RULE_RAW_VALUE) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                int LA8_2 = input.LA(2);

                if ( ((LA8_2>=RULE_STRING && LA8_2<=RULE_RAW_VALUE)||LA8_2==17) ) {
                    alt8=2;
                }
                else if ( (LA8_2==EOF||LA8_2==18||(LA8_2>=20 && LA8_2<=36)) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDocker.g:1059:2: ( ( rule__ArgArgs__Group_0__0 ) )
                    {
                    // InternalMyDocker.g:1059:2: ( ( rule__ArgArgs__Group_0__0 ) )
                    // InternalMyDocker.g:1060:3: ( rule__ArgArgs__Group_0__0 )
                    {
                     before(grammarAccess.getArgArgsAccess().getGroup_0()); 
                    // InternalMyDocker.g:1061:3: ( rule__ArgArgs__Group_0__0 )
                    // InternalMyDocker.g:1061:4: rule__ArgArgs__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArgArgs__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArgArgsAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDocker.g:1065:2: ( ( rule__ArgArgs__ValuesAssignment_1 ) )
                    {
                    // InternalMyDocker.g:1065:2: ( ( rule__ArgArgs__ValuesAssignment_1 ) )
                    // InternalMyDocker.g:1066:3: ( rule__ArgArgs__ValuesAssignment_1 )
                    {
                     before(grammarAccess.getArgArgsAccess().getValuesAssignment_1()); 
                    // InternalMyDocker.g:1067:3: ( rule__ArgArgs__ValuesAssignment_1 )
                    // InternalMyDocker.g:1067:4: rule__ArgArgs__ValuesAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArgArgs__ValuesAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getArgArgsAccess().getValuesAssignment_1()); 

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
    // $ANTLR end "rule__ArgArgs__Alternatives"


    // $ANTLR start "rule__HealthArgs__Alternatives"
    // InternalMyDocker.g:1075:1: rule__HealthArgs__Alternatives : ( ( ( rule__HealthArgs__TypAssignment_0 ) ) | ( ( rule__HealthArgs__Group_1__0 ) ) );
    public final void rule__HealthArgs__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1079:1: ( ( ( rule__HealthArgs__TypAssignment_0 ) ) | ( ( rule__HealthArgs__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==37) ) {
                alt9=1;
            }
            else if ( (LA9_0==EOF||(LA9_0>=18 && LA9_0<=19)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDocker.g:1080:2: ( ( rule__HealthArgs__TypAssignment_0 ) )
                    {
                    // InternalMyDocker.g:1080:2: ( ( rule__HealthArgs__TypAssignment_0 ) )
                    // InternalMyDocker.g:1081:3: ( rule__HealthArgs__TypAssignment_0 )
                    {
                     before(grammarAccess.getHealthArgsAccess().getTypAssignment_0()); 
                    // InternalMyDocker.g:1082:3: ( rule__HealthArgs__TypAssignment_0 )
                    // InternalMyDocker.g:1082:4: rule__HealthArgs__TypAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HealthArgs__TypAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHealthArgsAccess().getTypAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDocker.g:1086:2: ( ( rule__HealthArgs__Group_1__0 ) )
                    {
                    // InternalMyDocker.g:1086:2: ( ( rule__HealthArgs__Group_1__0 ) )
                    // InternalMyDocker.g:1087:3: ( rule__HealthArgs__Group_1__0 )
                    {
                     before(grammarAccess.getHealthArgsAccess().getGroup_1()); 
                    // InternalMyDocker.g:1088:3: ( rule__HealthArgs__Group_1__0 )
                    // InternalMyDocker.g:1088:4: rule__HealthArgs__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HealthArgs__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHealthArgsAccess().getGroup_1()); 

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
    // $ANTLR end "rule__HealthArgs__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalMyDocker.g:1096:1: rule__Value__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) | ( RULE_RAW_VALUE ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1100:1: ( ( RULE_STRING ) | ( RULE_ID ) | ( RULE_RAW_VALUE ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt10=1;
                }
                break;
            case RULE_ID:
                {
                alt10=2;
                }
                break;
            case RULE_RAW_VALUE:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMyDocker.g:1101:2: ( RULE_STRING )
                    {
                    // InternalMyDocker.g:1101:2: ( RULE_STRING )
                    // InternalMyDocker.g:1102:3: RULE_STRING
                    {
                     before(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDocker.g:1107:2: ( RULE_ID )
                    {
                    // InternalMyDocker.g:1107:2: ( RULE_ID )
                    // InternalMyDocker.g:1108:3: RULE_ID
                    {
                     before(grammarAccess.getValueAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDocker.g:1113:2: ( RULE_RAW_VALUE )
                    {
                    // InternalMyDocker.g:1113:2: ( RULE_RAW_VALUE )
                    // InternalMyDocker.g:1114:3: RULE_RAW_VALUE
                    {
                     before(grammarAccess.getValueAccess().getRAW_VALUETerminalRuleCall_2()); 
                    match(input,RULE_RAW_VALUE,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getRAW_VALUETerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__ExposeArg__Alternatives"
    // InternalMyDocker.g:1123:1: rule__ExposeArg__Alternatives : ( ( ( rule__ExposeArg__PortAssignment_0 ) ) | ( ( rule__ExposeArg__Port_protocolAssignment_1 ) ) );
    public final void rule__ExposeArg__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1127:1: ( ( ( rule__ExposeArg__PortAssignment_0 ) ) | ( ( rule__ExposeArg__Port_protocolAssignment_1 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_EXPOSE_PORT_PROTOCOL) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDocker.g:1128:2: ( ( rule__ExposeArg__PortAssignment_0 ) )
                    {
                    // InternalMyDocker.g:1128:2: ( ( rule__ExposeArg__PortAssignment_0 ) )
                    // InternalMyDocker.g:1129:3: ( rule__ExposeArg__PortAssignment_0 )
                    {
                     before(grammarAccess.getExposeArgAccess().getPortAssignment_0()); 
                    // InternalMyDocker.g:1130:3: ( rule__ExposeArg__PortAssignment_0 )
                    // InternalMyDocker.g:1130:4: rule__ExposeArg__PortAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExposeArg__PortAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExposeArgAccess().getPortAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDocker.g:1134:2: ( ( rule__ExposeArg__Port_protocolAssignment_1 ) )
                    {
                    // InternalMyDocker.g:1134:2: ( ( rule__ExposeArg__Port_protocolAssignment_1 ) )
                    // InternalMyDocker.g:1135:3: ( rule__ExposeArg__Port_protocolAssignment_1 )
                    {
                     before(grammarAccess.getExposeArgAccess().getPort_protocolAssignment_1()); 
                    // InternalMyDocker.g:1136:3: ( rule__ExposeArg__Port_protocolAssignment_1 )
                    // InternalMyDocker.g:1136:4: rule__ExposeArg__Port_protocolAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExposeArg__Port_protocolAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getExposeArgAccess().getPort_protocolAssignment_1()); 

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
    // $ANTLR end "rule__ExposeArg__Alternatives"


    // $ANTLR start "rule__Add__Group__0"
    // InternalMyDocker.g:1144:1: rule__Add__Group__0 : rule__Add__Group__0__Impl rule__Add__Group__1 ;
    public final void rule__Add__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1148:1: ( rule__Add__Group__0__Impl rule__Add__Group__1 )
            // InternalMyDocker.g:1149:2: rule__Add__Group__0__Impl rule__Add__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Add__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__0"


    // $ANTLR start "rule__Add__Group__0__Impl"
    // InternalMyDocker.g:1156:1: rule__Add__Group__0__Impl : ( ( rule__Add__CmdAssignment_0 ) ) ;
    public final void rule__Add__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1160:1: ( ( ( rule__Add__CmdAssignment_0 ) ) )
            // InternalMyDocker.g:1161:1: ( ( rule__Add__CmdAssignment_0 ) )
            {
            // InternalMyDocker.g:1161:1: ( ( rule__Add__CmdAssignment_0 ) )
            // InternalMyDocker.g:1162:2: ( rule__Add__CmdAssignment_0 )
            {
             before(grammarAccess.getAddAccess().getCmdAssignment_0()); 
            // InternalMyDocker.g:1163:2: ( rule__Add__CmdAssignment_0 )
            // InternalMyDocker.g:1163:3: rule__Add__CmdAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Add__CmdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getCmdAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__0__Impl"


    // $ANTLR start "rule__Add__Group__1"
    // InternalMyDocker.g:1171:1: rule__Add__Group__1 : rule__Add__Group__1__Impl ;
    public final void rule__Add__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1175:1: ( rule__Add__Group__1__Impl )
            // InternalMyDocker.g:1176:2: rule__Add__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Add__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__1"


    // $ANTLR start "rule__Add__Group__1__Impl"
    // InternalMyDocker.g:1182:1: rule__Add__Group__1__Impl : ( ( rule__Add__ArgsAssignment_1 ) ) ;
    public final void rule__Add__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1186:1: ( ( ( rule__Add__ArgsAssignment_1 ) ) )
            // InternalMyDocker.g:1187:1: ( ( rule__Add__ArgsAssignment_1 ) )
            {
            // InternalMyDocker.g:1187:1: ( ( rule__Add__ArgsAssignment_1 ) )
            // InternalMyDocker.g:1188:2: ( rule__Add__ArgsAssignment_1 )
            {
             before(grammarAccess.getAddAccess().getArgsAssignment_1()); 
            // InternalMyDocker.g:1189:2: ( rule__Add__ArgsAssignment_1 )
            // InternalMyDocker.g:1189:3: rule__Add__ArgsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Add__ArgsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getArgsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__1__Impl"


    // $ANTLR start "rule__Arg__Group__0"
    // InternalMyDocker.g:1198:1: rule__Arg__Group__0 : rule__Arg__Group__0__Impl rule__Arg__Group__1 ;
    public final void rule__Arg__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1202:1: ( rule__Arg__Group__0__Impl rule__Arg__Group__1 )
            // InternalMyDocker.g:1203:2: rule__Arg__Group__0__Impl rule__Arg__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Arg__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Arg__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arg__Group__0"


    // $ANTLR start "rule__Arg__Group__0__Impl"
    // InternalMyDocker.g:1210:1: rule__Arg__Group__0__Impl : ( ( rule__Arg__CmdAssignment_0 ) ) ;
    public final void rule__Arg__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1214:1: ( ( ( rule__Arg__CmdAssignment_0 ) ) )
            // InternalMyDocker.g:1215:1: ( ( rule__Arg__CmdAssignment_0 ) )
            {
            // InternalMyDocker.g:1215:1: ( ( rule__Arg__CmdAssignment_0 ) )
            // InternalMyDocker.g:1216:2: ( rule__Arg__CmdAssignment_0 )
            {
             before(grammarAccess.getArgAccess().getCmdAssignment_0()); 
            // InternalMyDocker.g:1217:2: ( rule__Arg__CmdAssignment_0 )
            // InternalMyDocker.g:1217:3: rule__Arg__CmdAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Arg__CmdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getArgAccess().getCmdAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arg__Group__0__Impl"


    // $ANTLR start "rule__Arg__Group__1"
    // InternalMyDocker.g:1225:1: rule__Arg__Group__1 : rule__Arg__Group__1__Impl ;
    public final void rule__Arg__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1229:1: ( rule__Arg__Group__1__Impl )
            // InternalMyDocker.g:1230:2: rule__Arg__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Arg__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arg__Group__1"


    // $ANTLR start "rule__Arg__Group__1__Impl"
    // InternalMyDocker.g:1236:1: rule__Arg__Group__1__Impl : ( ( rule__Arg__ArgsAssignment_1 ) ) ;
    public final void rule__Arg__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1240:1: ( ( ( rule__Arg__ArgsAssignment_1 ) ) )
            // InternalMyDocker.g:1241:1: ( ( rule__Arg__ArgsAssignment_1 ) )
            {
            // InternalMyDocker.g:1241:1: ( ( rule__Arg__ArgsAssignment_1 ) )
            // InternalMyDocker.g:1242:2: ( rule__Arg__ArgsAssignment_1 )
            {
             before(grammarAccess.getArgAccess().getArgsAssignment_1()); 
            // InternalMyDocker.g:1243:2: ( rule__Arg__ArgsAssignment_1 )
            // InternalMyDocker.g:1243:3: rule__Arg__ArgsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Arg__ArgsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArgAccess().getArgsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arg__Group__1__Impl"


    // $ANTLR start "rule__Cmd__Group__0"
    // InternalMyDocker.g:1252:1: rule__Cmd__Group__0 : rule__Cmd__Group__0__Impl rule__Cmd__Group__1 ;
    public final void rule__Cmd__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1256:1: ( rule__Cmd__Group__0__Impl rule__Cmd__Group__1 )
            // InternalMyDocker.g:1257:2: rule__Cmd__Group__0__Impl rule__Cmd__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Cmd__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cmd__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__Group__0"


    // $ANTLR start "rule__Cmd__Group__0__Impl"
    // InternalMyDocker.g:1264:1: rule__Cmd__Group__0__Impl : ( ( rule__Cmd__CmdAssignment_0 ) ) ;
    public final void rule__Cmd__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1268:1: ( ( ( rule__Cmd__CmdAssignment_0 ) ) )
            // InternalMyDocker.g:1269:1: ( ( rule__Cmd__CmdAssignment_0 ) )
            {
            // InternalMyDocker.g:1269:1: ( ( rule__Cmd__CmdAssignment_0 ) )
            // InternalMyDocker.g:1270:2: ( rule__Cmd__CmdAssignment_0 )
            {
             before(grammarAccess.getCmdAccess().getCmdAssignment_0()); 
            // InternalMyDocker.g:1271:2: ( rule__Cmd__CmdAssignment_0 )
            // InternalMyDocker.g:1271:3: rule__Cmd__CmdAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Cmd__CmdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCmdAccess().getCmdAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__Group__0__Impl"


    // $ANTLR start "rule__Cmd__Group__1"
    // InternalMyDocker.g:1279:1: rule__Cmd__Group__1 : rule__Cmd__Group__1__Impl ;
    public final void rule__Cmd__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1283:1: ( rule__Cmd__Group__1__Impl )
            // InternalMyDocker.g:1284:2: rule__Cmd__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cmd__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__Group__1"


    // $ANTLR start "rule__Cmd__Group__1__Impl"
    // InternalMyDocker.g:1290:1: rule__Cmd__Group__1__Impl : ( ( rule__Cmd__ArgsAssignment_1 ) ) ;
    public final void rule__Cmd__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1294:1: ( ( ( rule__Cmd__ArgsAssignment_1 ) ) )
            // InternalMyDocker.g:1295:1: ( ( rule__Cmd__ArgsAssignment_1 ) )
            {
            // InternalMyDocker.g:1295:1: ( ( rule__Cmd__ArgsAssignment_1 ) )
            // InternalMyDocker.g:1296:2: ( rule__Cmd__ArgsAssignment_1 )
            {
             before(grammarAccess.getCmdAccess().getArgsAssignment_1()); 
            // InternalMyDocker.g:1297:2: ( rule__Cmd__ArgsAssignment_1 )
            // InternalMyDocker.g:1297:3: rule__Cmd__ArgsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Cmd__ArgsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCmdAccess().getArgsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__Group__1__Impl"


    // $ANTLR start "rule__Copy__Group__0"
    // InternalMyDocker.g:1306:1: rule__Copy__Group__0 : rule__Copy__Group__0__Impl rule__Copy__Group__1 ;
    public final void rule__Copy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1310:1: ( rule__Copy__Group__0__Impl rule__Copy__Group__1 )
            // InternalMyDocker.g:1311:2: rule__Copy__Group__0__Impl rule__Copy__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Copy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Copy__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__0"


    // $ANTLR start "rule__Copy__Group__0__Impl"
    // InternalMyDocker.g:1318:1: rule__Copy__Group__0__Impl : ( ( rule__Copy__CmdAssignment_0 ) ) ;
    public final void rule__Copy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1322:1: ( ( ( rule__Copy__CmdAssignment_0 ) ) )
            // InternalMyDocker.g:1323:1: ( ( rule__Copy__CmdAssignment_0 ) )
            {
            // InternalMyDocker.g:1323:1: ( ( rule__Copy__CmdAssignment_0 ) )
            // InternalMyDocker.g:1324:2: ( rule__Copy__CmdAssignment_0 )
            {
             before(grammarAccess.getCopyAccess().getCmdAssignment_0()); 
            // InternalMyDocker.g:1325:2: ( rule__Copy__CmdAssignment_0 )
            // InternalMyDocker.g:1325:3: rule__Copy__CmdAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Copy__CmdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCopyAccess().getCmdAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__0__Impl"


    // $ANTLR start "rule__Copy__Group__1"
    // InternalMyDocker.g:1333:1: rule__Copy__Group__1 : rule__Copy__Group__1__Impl ;
    public final void rule__Copy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1337:1: ( rule__Copy__Group__1__Impl )
            // InternalMyDocker.g:1338:2: rule__Copy__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Copy__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__1"


    // $ANTLR start "rule__Copy__Group__1__Impl"
    // InternalMyDocker.g:1344:1: rule__Copy__Group__1__Impl : ( ( rule__Copy__ArgsAssignment_1 ) ) ;
    public final void rule__Copy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1348:1: ( ( ( rule__Copy__ArgsAssignment_1 ) ) )
            // InternalMyDocker.g:1349:1: ( ( rule__Copy__ArgsAssignment_1 ) )
            {
            // InternalMyDocker.g:1349:1: ( ( rule__Copy__ArgsAssignment_1 ) )
            // InternalMyDocker.g:1350:2: ( rule__Copy__ArgsAssignment_1 )
            {
             before(grammarAccess.getCopyAccess().getArgsAssignment_1()); 
            // InternalMyDocker.g:1351:2: ( rule__Copy__ArgsAssignment_1 )
            // InternalMyDocker.g:1351:3: rule__Copy__ArgsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Copy__ArgsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCopyAccess().getArgsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__1__Impl"


    // $ANTLR start "rule__Entrypoint__Group__0"
    // InternalMyDocker.g:1360:1: rule__Entrypoint__Group__0 : rule__Entrypoint__Group__0__Impl rule__Entrypoint__Group__1 ;
    public final void rule__Entrypoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1364:1: ( rule__Entrypoint__Group__0__Impl rule__Entrypoint__Group__1 )
            // InternalMyDocker.g:1365:2: rule__Entrypoint__Group__0__Impl rule__Entrypoint__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Entrypoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrypoint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrypoint__Group__0"


    // $ANTLR start "rule__Entrypoint__Group__0__Impl"
    // InternalMyDocker.g:1372:1: rule__Entrypoint__Group__0__Impl : ( ( rule__Entrypoint__CmdAssignment_0 ) ) ;
    public final void rule__Entrypoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1376:1: ( ( ( rule__Entrypoint__CmdAssignment_0 ) ) )
            // InternalMyDocker.g:1377:1: ( ( rule__Entrypoint__CmdAssignment_0 ) )
            {
            // InternalMyDocker.g:1377:1: ( ( rule__Entrypoint__CmdAssignment_0 ) )
            // InternalMyDocker.g:1378:2: ( rule__Entrypoint__CmdAssignment_0 )
            {
             before(grammarAccess.getEntrypointAccess().getCmdAssignment_0()); 
            // InternalMyDocker.g:1379:2: ( rule__Entrypoint__CmdAssignment_0 )
            // InternalMyDocker.g:1379:3: rule__Entrypoint__CmdAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Entrypoint__CmdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEntrypointAccess().getCmdAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrypoint__Group__0__Impl"


    // $ANTLR start "rule__Entrypoint__Group__1"
    // InternalMyDocker.g:1387:1: rule__Entrypoint__Group__1 : rule__Entrypoint__Group__1__Impl ;
    public final void rule__Entrypoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1391:1: ( rule__Entrypoint__Group__1__Impl )
            // InternalMyDocker.g:1392:2: rule__Entrypoint__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entrypoint__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrypoint__Group__1"


    // $ANTLR start "rule__Entrypoint__Group__1__Impl"
    // InternalMyDocker.g:1398:1: rule__Entrypoint__Group__1__Impl : ( ( rule__Entrypoint__ArgsAssignment_1 ) ) ;
    public final void rule__Entrypoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1402:1: ( ( ( rule__Entrypoint__ArgsAssignment_1 ) ) )
            // InternalMyDocker.g:1403:1: ( ( rule__Entrypoint__ArgsAssignment_1 ) )
            {
            // InternalMyDocker.g:1403:1: ( ( rule__Entrypoint__ArgsAssignment_1 ) )
            // InternalMyDocker.g:1404:2: ( rule__Entrypoint__ArgsAssignment_1 )
            {
             before(grammarAccess.getEntrypointAccess().getArgsAssignment_1()); 
            // InternalMyDocker.g:1405:2: ( rule__Entrypoint__ArgsAssignment_1 )
            // InternalMyDocker.g:1405:3: rule__Entrypoint__ArgsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entrypoint__ArgsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntrypointAccess().getArgsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrypoint__Group__1__Impl"


    // $ANTLR start "rule__Env__Group__0"
    // InternalMyDocker.g:1414:1: rule__Env__Group__0 : rule__Env__Group__0__Impl rule__Env__Group__1 ;
    public final void rule__Env__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1418:1: ( rule__Env__Group__0__Impl rule__Env__Group__1 )
            // InternalMyDocker.g:1419:2: rule__Env__Group__0__Impl rule__Env__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Env__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Env__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Env__Group__0"


    // $ANTLR start "rule__Env__Group__0__Impl"
    // InternalMyDocker.g:1426:1: rule__Env__Group__0__Impl : ( ( rule__Env__CmdAssignment_0 ) ) ;
    public final void rule__Env__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1430:1: ( ( ( rule__Env__CmdAssignment_0 ) ) )
            // InternalMyDocker.g:1431:1: ( ( rule__Env__CmdAssignment_0 ) )
            {
            // InternalMyDocker.g:1431:1: ( ( rule__Env__CmdAssignment_0 ) )
            // InternalMyDocker.g:1432:2: ( rule__Env__CmdAssignment_0 )
            {
             before(grammarAccess.getEnvAccess().getCmdAssignment_0()); 
            // InternalMyDocker.g:1433:2: ( rule__Env__CmdAssignment_0 )
            // InternalMyDocker.g:1433:3: rule__Env__CmdAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Env__CmdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEnvAccess().getCmdAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Env__Group__0__Impl"


    // $ANTLR start "rule__Env__Group__1"
    // InternalMyDocker.g:1441:1: rule__Env__Group__1 : rule__Env__Group__1__Impl ;
    public final void rule__Env__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1445:1: ( rule__Env__Group__1__Impl )
            // InternalMyDocker.g:1446:2: rule__Env__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Env__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Env__Group__1"


    // $ANTLR start "rule__Env__Group__1__Impl"
    // InternalMyDocker.g:1452:1: rule__Env__Group__1__Impl : ( ( rule__Env__ArgsAssignment_1 ) ) ;
    public final void rule__Env__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1456:1: ( ( ( rule__Env__ArgsAssignment_1 ) ) )
            // InternalMyDocker.g:1457:1: ( ( rule__Env__ArgsAssignment_1 ) )
            {
            // InternalMyDocker.g:1457:1: ( ( rule__Env__ArgsAssignment_1 ) )
            // InternalMyDocker.g:1458:2: ( rule__Env__ArgsAssignment_1 )
            {
             before(grammarAccess.getEnvAccess().getArgsAssignment_1()); 
            // InternalMyDocker.g:1459:2: ( rule__Env__ArgsAssignment_1 )
            // InternalMyDocker.g:1459:3: rule__Env__ArgsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Env__ArgsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnvAccess().getArgsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Env__Group__1__Impl"


    // $ANTLR start "rule__Expose__Group__0"
    // InternalMyDocker.g:1468:1: rule__Expose__Group__0 : rule__Expose__Group__0__Impl rule__Expose__Group__1 ;
    public final void rule__Expose__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1472:1: ( rule__Expose__Group__0__Impl rule__Expose__Group__1 )
            // InternalMyDocker.g:1473:2: rule__Expose__Group__0__Impl rule__Expose__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Expose__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expose__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expose__Group__0"


    // $ANTLR start "rule__Expose__Group__0__Impl"
    // InternalMyDocker.g:1480:1: rule__Expose__Group__0__Impl : ( ( rule__Expose__CmdAssignment_0 ) ) ;
    public final void rule__Expose__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1484:1: ( ( ( rule__Expose__CmdAssignment_0 ) ) )
            // InternalMyDocker.g:1485:1: ( ( rule__Expose__CmdAssignment_0 ) )
            {
            // InternalMyDocker.g:1485:1: ( ( rule__Expose__CmdAssignment_0 ) )
            // InternalMyDocker.g:1486:2: ( rule__Expose__CmdAssignment_0 )
            {
             before(grammarAccess.getExposeAccess().getCmdAssignment_0()); 
            // InternalMyDocker.g:1487:2: ( rule__Expose__CmdAssignment_0 )
            // InternalMyDocker.g:1487:3: rule__Expose__CmdAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Expose__CmdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExposeAccess().getCmdAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expose__Group__0__Impl"


    // $ANTLR start "rule__Expose__Group__1"
    // InternalMyDocker.g:1495:1: rule__Expose__Group__1 : rule__Expose__Group__1__Impl ;
    public final void rule__Expose__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1499:1: ( rule__Expose__Group__1__Impl )
            // InternalMyDocker.g:1500:2: rule__Expose__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expose__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expose__Group__1"


    // $ANTLR start "rule__Expose__Group__1__Impl"
    // InternalMyDocker.g:1506:1: rule__Expose__Group__1__Impl : ( ( rule__Expose__ArgsAssignment_1 ) ) ;
    public final void rule__Expose__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1510:1: ( ( ( rule__Expose__ArgsAssignment_1 ) ) )
            // InternalMyDocker.g:1511:1: ( ( rule__Expose__ArgsAssignment_1 ) )
            {
            // InternalMyDocker.g:1511:1: ( ( rule__Expose__ArgsAssignment_1 ) )
            // InternalMyDocker.g:1512:2: ( rule__Expose__ArgsAssignment_1 )
            {
             before(grammarAccess.getExposeAccess().getArgsAssignment_1()); 
            // InternalMyDocker.g:1513:2: ( rule__Expose__ArgsAssignment_1 )
            // InternalMyDocker.g:1513:3: rule__Expose__ArgsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Expose__ArgsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExposeAccess().getArgsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expose__Group__1__Impl"


    // $ANTLR start "rule__From__Group__0"
    // InternalMyDocker.g:1522:1: rule__From__Group__0 : rule__From__Group__0__Impl rule__From__Group__1 ;
    public final void rule__From__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1526:1: ( rule__From__Group__0__Impl rule__From__Group__1 )
            // InternalMyDocker.g:1527:2: rule__From__Group__0__Impl rule__From__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__From__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__From__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group__0"


    // $ANTLR start "rule__From__Group__0__Impl"
    // InternalMyDocker.g:1534:1: rule__From__Group__0__Impl : ( ( rule__From__CmdAssignment_0 ) ) ;
    public final void rule__From__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1538:1: ( ( ( rule__From__CmdAssignment_0 ) ) )
            // InternalMyDocker.g:1539:1: ( ( rule__From__CmdAssignment_0 ) )
            {
            // InternalMyDocker.g:1539:1: ( ( rule__From__CmdAssignment_0 ) )
            // InternalMyDocker.g:1540:2: ( rule__From__CmdAssignment_0 )
            {
             before(grammarAccess.getFromAccess().getCmdAssignment_0()); 
            // InternalMyDocker.g:1541:2: ( rule__From__CmdAssignment_0 )
            // InternalMyDocker.g:1541:3: rule__From__CmdAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__From__CmdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFromAccess().getCmdAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group__0__Impl"


    // $ANTLR start "rule__From__Group__1"
    // InternalMyDocker.g:1549:1: rule__From__Group__1 : rule__From__Group__1__Impl ;
    public final void rule__From__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1553:1: ( rule__From__Group__1__Impl )
            // InternalMyDocker.g:1554:2: rule__From__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__From__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group__1"


    // $ANTLR start "rule__From__Group__1__Impl"
    // InternalMyDocker.g:1560:1: rule__From__Group__1__Impl : ( ( rule__From__ArgsAssignment_1 ) ) ;
    public final void rule__From__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1564:1: ( ( ( rule__From__ArgsAssignment_1 ) ) )
            // InternalMyDocker.g:1565:1: ( ( rule__From__ArgsAssignment_1 ) )
            {
            // InternalMyDocker.g:1565:1: ( ( rule__From__ArgsAssignment_1 ) )
            // InternalMyDocker.g:1566:2: ( rule__From__ArgsAssignment_1 )
            {
             before(grammarAccess.getFromAccess().getArgsAssignment_1()); 
            // InternalMyDocker.g:1567:2: ( rule__From__ArgsAssignment_1 )
            // InternalMyDocker.g:1567:3: rule__From__ArgsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__From__ArgsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFromAccess().getArgsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__Group__1__Impl"


    // $ANTLR start "rule__Healthcheck__Group__0"
    // InternalMyDocker.g:1576:1: rule__Healthcheck__Group__0 : rule__Healthcheck__Group__0__Impl rule__Healthcheck__Group__1 ;
    public final void rule__Healthcheck__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1580:1: ( rule__Healthcheck__Group__0__Impl rule__Healthcheck__Group__1 )
            // InternalMyDocker.g:1581:2: rule__Healthcheck__Group__0__Impl rule__Healthcheck__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Healthcheck__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Healthcheck__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Healthcheck__Group__0"


    // $ANTLR start "rule__Healthcheck__Group__0__Impl"
    // InternalMyDocker.g:1588:1: rule__Healthcheck__Group__0__Impl : ( ( rule__Healthcheck__CmdAssignment_0 ) ) ;
    public final void rule__Healthcheck__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1592:1: ( ( ( rule__Healthcheck__CmdAssignment_0 ) ) )
            // InternalMyDocker.g:1593:1: ( ( rule__Healthcheck__CmdAssignment_0 ) )
            {
            // InternalMyDocker.g:1593:1: ( ( rule__Healthcheck__CmdAssignment_0 ) )
            // InternalMyDocker.g:1594:2: ( rule__Healthcheck__CmdAssignment_0 )
            {
             before(grammarAccess.getHealthcheckAccess().getCmdAssignment_0()); 
            // InternalMyDocker.g:1595:2: ( rule__Healthcheck__CmdAssignment_0 )
            // InternalMyDocker.g:1595:3: rule__Healthcheck__CmdAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Healthcheck__CmdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getHealthcheckAccess().getCmdAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Healthcheck__Group__0__Impl"


    // $ANTLR start "rule__Healthcheck__Group__1"
    // InternalMyDocker.g:1603:1: rule__Healthcheck__Group__1 : rule__Healthcheck__Group__1__Impl ;
    public final void rule__Healthcheck__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1607:1: ( rule__Healthcheck__Group__1__Impl )
            // InternalMyDocker.g:1608:2: rule__Healthcheck__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Healthcheck__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Healthcheck__Group__1"


    // $ANTLR start "rule__Healthcheck__Group__1__Impl"
    // InternalMyDocker.g:1614:1: rule__Healthcheck__Group__1__Impl : ( ( rule__Healthcheck__ArgsAssignment_1 ) ) ;
    public final void rule__Healthcheck__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1618:1: ( ( ( rule__Healthcheck__ArgsAssignment_1 ) ) )
            // InternalMyDocker.g:1619:1: ( ( rule__Healthcheck__ArgsAssignment_1 ) )
            {
            // InternalMyDocker.g:1619:1: ( ( rule__Healthcheck__ArgsAssignment_1 ) )
            // InternalMyDocker.g:1620:2: ( rule__Healthcheck__ArgsAssignment_1 )
            {
             before(grammarAccess.getHealthcheckAccess().getArgsAssignment_1()); 
            // InternalMyDocker.g:1621:2: ( rule__Healthcheck__ArgsAssignment_1 )
            // InternalMyDocker.g:1621:3: rule__Healthcheck__ArgsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Healthcheck__ArgsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHealthcheckAccess().getArgsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Healthcheck__Group__1__Impl"


    // $ANTLR start "rule__Label__Group__0"
    // InternalMyDocker.g:1630:1: rule__Label__Group__0 : rule__Label__Group__0__Impl rule__Label__Group__1 ;
    public final void rule__Label__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1634:1: ( rule__Label__Group__0__Impl rule__Label__Group__1 )
            // InternalMyDocker.g:1635:2: rule__Label__Group__0__Impl rule__Label__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Label__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Label__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__0"


    // $ANTLR start "rule__Label__Group__0__Impl"
    // InternalMyDocker.g:1642:1: rule__Label__Group__0__Impl : ( ( rule__Label__CmdAssignment_0 ) ) ;
    public final void rule__Label__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1646:1: ( ( ( rule__Label__CmdAssignment_0 ) ) )
            // InternalMyDocker.g:1647:1: ( ( rule__Label__CmdAssignment_0 ) )
            {
            // InternalMyDocker.g:1647:1: ( ( rule__Label__CmdAssignment_0 ) )
            // InternalMyDocker.g:1648:2: ( rule__Label__CmdAssignment_0 )
            {
             before(grammarAccess.getLabelAccess().getCmdAssignment_0()); 
            // InternalMyDocker.g:1649:2: ( rule__Label__CmdAssignment_0 )
            // InternalMyDocker.g:1649:3: rule__Label__CmdAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Label__CmdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getCmdAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__0__Impl"


    // $ANTLR start "rule__Label__Group__1"
    // InternalMyDocker.g:1657:1: rule__Label__Group__1 : rule__Label__Group__1__Impl ;
    public final void rule__Label__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1661:1: ( rule__Label__Group__1__Impl )
            // InternalMyDocker.g:1662:2: rule__Label__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Label__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__1"


    // $ANTLR start "rule__Label__Group__1__Impl"
    // InternalMyDocker.g:1668:1: rule__Label__Group__1__Impl : ( ( rule__Label__ArgsAssignment_1 ) ) ;
    public final void rule__Label__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1672:1: ( ( ( rule__Label__ArgsAssignment_1 ) ) )
            // InternalMyDocker.g:1673:1: ( ( rule__Label__ArgsAssignment_1 ) )
            {
            // InternalMyDocker.g:1673:1: ( ( rule__Label__ArgsAssignment_1 ) )
            // InternalMyDocker.g:1674:2: ( rule__Label__ArgsAssignment_1 )
            {
             before(grammarAccess.getLabelAccess().getArgsAssignment_1()); 
            // InternalMyDocker.g:1675:2: ( rule__Label__ArgsAssignment_1 )
            // InternalMyDocker.g:1675:3: rule__Label__ArgsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Label__ArgsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getArgsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__1__Impl"


    // $ANTLR start "rule__Maintainer__Group__0"
    // InternalMyDocker.g:1684:1: rule__Maintainer__Group__0 : rule__Maintainer__Group__0__Impl rule__Maintainer__Group__1 ;
    public final void rule__Maintainer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1688:1: ( rule__Maintainer__Group__0__Impl rule__Maintainer__Group__1 )
            // InternalMyDocker.g:1689:2: rule__Maintainer__Group__0__Impl rule__Maintainer__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Maintainer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Maintainer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Maintainer__Group__0"


    // $ANTLR start "rule__Maintainer__Group__0__Impl"
    // InternalMyDocker.g:1696:1: rule__Maintainer__Group__0__Impl : ( ( rule__Maintainer__CmdAssignment_0 ) ) ;
    public final void rule__Maintainer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1700:1: ( ( ( rule__Maintainer__CmdAssignment_0 ) ) )
            // InternalMyDocker.g:1701:1: ( ( rule__Maintainer__CmdAssignment_0 ) )
            {
            // InternalMyDocker.g:1701:1: ( ( rule__Maintainer__CmdAssignment_0 ) )
            // InternalMyDocker.g:1702:2: ( rule__Maintainer__CmdAssignment_0 )
            {
             before(grammarAccess.getMaintainerAccess().getCmdAssignment_0()); 
            // InternalMyDocker.g:1703:2: ( rule__Maintainer__CmdAssignment_0 )
            // InternalMyDocker.g:1703:3: rule__Maintainer__CmdAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Maintainer__CmdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMaintainerAccess().getCmdAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Maintainer__Group__0__Impl"


    // $ANTLR start "rule__Maintainer__Group__1"
    // InternalMyDocker.g:1711:1: rule__Maintainer__Group__1 : rule__Maintainer__Group__1__Impl ;
    public final void rule__Maintainer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1715:1: ( rule__Maintainer__Group__1__Impl )
            // InternalMyDocker.g:1716:2: rule__Maintainer__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Maintainer__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Maintainer__Group__1"


    // $ANTLR start "rule__Maintainer__Group__1__Impl"
    // InternalMyDocker.g:1722:1: rule__Maintainer__Group__1__Impl : ( ( rule__Maintainer__ArgsAssignment_1 ) ) ;
    public final void rule__Maintainer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1726:1: ( ( ( rule__Maintainer__ArgsAssignment_1 ) ) )
            // InternalMyDocker.g:1727:1: ( ( rule__Maintainer__ArgsAssignment_1 ) )
            {
            // InternalMyDocker.g:1727:1: ( ( rule__Maintainer__ArgsAssignment_1 ) )
            // InternalMyDocker.g:1728:2: ( rule__Maintainer__ArgsAssignment_1 )
            {
             before(grammarAccess.getMaintainerAccess().getArgsAssignment_1()); 
            // InternalMyDocker.g:1729:2: ( rule__Maintainer__ArgsAssignment_1 )
            // InternalMyDocker.g:1729:3: rule__Maintainer__ArgsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Maintainer__ArgsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMaintainerAccess().getArgsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Maintainer__Group__1__Impl"


    // $ANTLR start "rule__Onbuild__Group__0"
    // InternalMyDocker.g:1738:1: rule__Onbuild__Group__0 : rule__Onbuild__Group__0__Impl rule__Onbuild__Group__1 ;
    public final void rule__Onbuild__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1742:1: ( rule__Onbuild__Group__0__Impl rule__Onbuild__Group__1 )
            // InternalMyDocker.g:1743:2: rule__Onbuild__Group__0__Impl rule__Onbuild__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Onbuild__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Onbuild__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Onbuild__Group__0"


    // $ANTLR start "rule__Onbuild__Group__0__Impl"
    // InternalMyDocker.g:1750:1: rule__Onbuild__Group__0__Impl : ( ( rule__Onbuild__CmdAssignment_0 ) ) ;
    public final void rule__Onbuild__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1754:1: ( ( ( rule__Onbuild__CmdAssignment_0 ) ) )
            // InternalMyDocker.g:1755:1: ( ( rule__Onbuild__CmdAssignment_0 ) )
            {
            // InternalMyDocker.g:1755:1: ( ( rule__Onbuild__CmdAssignment_0 ) )
            // InternalMyDocker.g:1756:2: ( rule__Onbuild__CmdAssignment_0 )
            {
             before(grammarAccess.getOnbuildAccess().getCmdAssignment_0()); 
            // InternalMyDocker.g:1757:2: ( rule__Onbuild__CmdAssignment_0 )
            // InternalMyDocker.g:1757:3: rule__Onbuild__CmdAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Onbuild__CmdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOnbuildAccess().getCmdAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Onbuild__Group__0__Impl"


    // $ANTLR start "rule__Onbuild__Group__1"
    // InternalMyDocker.g:1765:1: rule__Onbuild__Group__1 : rule__Onbuild__Group__1__Impl ;
    public final void rule__Onbuild__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1769:1: ( rule__Onbuild__Group__1__Impl )
            // InternalMyDocker.g:1770:2: rule__Onbuild__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Onbuild__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Onbuild__Group__1"


    // $ANTLR start "rule__Onbuild__Group__1__Impl"
    // InternalMyDocker.g:1776:1: rule__Onbuild__Group__1__Impl : ( ( rule__Onbuild__ArgsAssignment_1 ) ) ;
    public final void rule__Onbuild__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1780:1: ( ( ( rule__Onbuild__ArgsAssignment_1 ) ) )
            // InternalMyDocker.g:1781:1: ( ( rule__Onbuild__ArgsAssignment_1 ) )
            {
            // InternalMyDocker.g:1781:1: ( ( rule__Onbuild__ArgsAssignment_1 ) )
            // InternalMyDocker.g:1782:2: ( rule__Onbuild__ArgsAssignment_1 )
            {
             before(grammarAccess.getOnbuildAccess().getArgsAssignment_1()); 
            // InternalMyDocker.g:1783:2: ( rule__Onbuild__ArgsAssignment_1 )
            // InternalMyDocker.g:1783:3: rule__Onbuild__ArgsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Onbuild__ArgsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOnbuildAccess().getArgsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Onbuild__Group__1__Impl"


    // $ANTLR start "rule__Run__Group__0"
    // InternalMyDocker.g:1792:1: rule__Run__Group__0 : rule__Run__Group__0__Impl rule__Run__Group__1 ;
    public final void rule__Run__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1796:1: ( rule__Run__Group__0__Impl rule__Run__Group__1 )
            // InternalMyDocker.g:1797:2: rule__Run__Group__0__Impl rule__Run__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Run__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Run__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Run__Group__0"


    // $ANTLR start "rule__Run__Group__0__Impl"
    // InternalMyDocker.g:1804:1: rule__Run__Group__0__Impl : ( ( rule__Run__CmdAssignment_0 ) ) ;
    public final void rule__Run__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1808:1: ( ( ( rule__Run__CmdAssignment_0 ) ) )
            // InternalMyDocker.g:1809:1: ( ( rule__Run__CmdAssignment_0 ) )
            {
            // InternalMyDocker.g:1809:1: ( ( rule__Run__CmdAssignment_0 ) )
            // InternalMyDocker.g:1810:2: ( rule__Run__CmdAssignment_0 )
            {
             before(grammarAccess.getRunAccess().getCmdAssignment_0()); 
            // InternalMyDocker.g:1811:2: ( rule__Run__CmdAssignment_0 )
            // InternalMyDocker.g:1811:3: rule__Run__CmdAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Run__CmdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRunAccess().getCmdAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Run__Group__0__Impl"


    // $ANTLR start "rule__Run__Group__1"
    // InternalMyDocker.g:1819:1: rule__Run__Group__1 : rule__Run__Group__1__Impl ;
    public final void rule__Run__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1823:1: ( rule__Run__Group__1__Impl )
            // InternalMyDocker.g:1824:2: rule__Run__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Run__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Run__Group__1"


    // $ANTLR start "rule__Run__Group__1__Impl"
    // InternalMyDocker.g:1830:1: rule__Run__Group__1__Impl : ( ( rule__Run__ArgsAssignment_1 ) ) ;
    public final void rule__Run__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1834:1: ( ( ( rule__Run__ArgsAssignment_1 ) ) )
            // InternalMyDocker.g:1835:1: ( ( rule__Run__ArgsAssignment_1 ) )
            {
            // InternalMyDocker.g:1835:1: ( ( rule__Run__ArgsAssignment_1 ) )
            // InternalMyDocker.g:1836:2: ( rule__Run__ArgsAssignment_1 )
            {
             before(grammarAccess.getRunAccess().getArgsAssignment_1()); 
            // InternalMyDocker.g:1837:2: ( rule__Run__ArgsAssignment_1 )
            // InternalMyDocker.g:1837:3: rule__Run__ArgsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Run__ArgsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRunAccess().getArgsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Run__Group__1__Impl"


    // $ANTLR start "rule__Shell__Group__0"
    // InternalMyDocker.g:1846:1: rule__Shell__Group__0 : rule__Shell__Group__0__Impl rule__Shell__Group__1 ;
    public final void rule__Shell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1850:1: ( rule__Shell__Group__0__Impl rule__Shell__Group__1 )
            // InternalMyDocker.g:1851:2: rule__Shell__Group__0__Impl rule__Shell__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Shell__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Shell__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shell__Group__0"


    // $ANTLR start "rule__Shell__Group__0__Impl"
    // InternalMyDocker.g:1858:1: rule__Shell__Group__0__Impl : ( ( rule__Shell__CmdAssignment_0 ) ) ;
    public final void rule__Shell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1862:1: ( ( ( rule__Shell__CmdAssignment_0 ) ) )
            // InternalMyDocker.g:1863:1: ( ( rule__Shell__CmdAssignment_0 ) )
            {
            // InternalMyDocker.g:1863:1: ( ( rule__Shell__CmdAssignment_0 ) )
            // InternalMyDocker.g:1864:2: ( rule__Shell__CmdAssignment_0 )
            {
             before(grammarAccess.getShellAccess().getCmdAssignment_0()); 
            // InternalMyDocker.g:1865:2: ( rule__Shell__CmdAssignment_0 )
            // InternalMyDocker.g:1865:3: rule__Shell__CmdAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Shell__CmdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getShellAccess().getCmdAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shell__Group__0__Impl"


    // $ANTLR start "rule__Shell__Group__1"
    // InternalMyDocker.g:1873:1: rule__Shell__Group__1 : rule__Shell__Group__1__Impl ;
    public final void rule__Shell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1877:1: ( rule__Shell__Group__1__Impl )
            // InternalMyDocker.g:1878:2: rule__Shell__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Shell__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shell__Group__1"


    // $ANTLR start "rule__Shell__Group__1__Impl"
    // InternalMyDocker.g:1884:1: rule__Shell__Group__1__Impl : ( ( rule__Shell__ArgsAssignment_1 ) ) ;
    public final void rule__Shell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1888:1: ( ( ( rule__Shell__ArgsAssignment_1 ) ) )
            // InternalMyDocker.g:1889:1: ( ( rule__Shell__ArgsAssignment_1 ) )
            {
            // InternalMyDocker.g:1889:1: ( ( rule__Shell__ArgsAssignment_1 ) )
            // InternalMyDocker.g:1890:2: ( rule__Shell__ArgsAssignment_1 )
            {
             before(grammarAccess.getShellAccess().getArgsAssignment_1()); 
            // InternalMyDocker.g:1891:2: ( rule__Shell__ArgsAssignment_1 )
            // InternalMyDocker.g:1891:3: rule__Shell__ArgsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Shell__ArgsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getShellAccess().getArgsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shell__Group__1__Impl"


    // $ANTLR start "rule__StopSignal__Group__0"
    // InternalMyDocker.g:1900:1: rule__StopSignal__Group__0 : rule__StopSignal__Group__0__Impl rule__StopSignal__Group__1 ;
    public final void rule__StopSignal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1904:1: ( rule__StopSignal__Group__0__Impl rule__StopSignal__Group__1 )
            // InternalMyDocker.g:1905:2: rule__StopSignal__Group__0__Impl rule__StopSignal__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__StopSignal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StopSignal__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopSignal__Group__0"


    // $ANTLR start "rule__StopSignal__Group__0__Impl"
    // InternalMyDocker.g:1912:1: rule__StopSignal__Group__0__Impl : ( ( rule__StopSignal__CmdAssignment_0 ) ) ;
    public final void rule__StopSignal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1916:1: ( ( ( rule__StopSignal__CmdAssignment_0 ) ) )
            // InternalMyDocker.g:1917:1: ( ( rule__StopSignal__CmdAssignment_0 ) )
            {
            // InternalMyDocker.g:1917:1: ( ( rule__StopSignal__CmdAssignment_0 ) )
            // InternalMyDocker.g:1918:2: ( rule__StopSignal__CmdAssignment_0 )
            {
             before(grammarAccess.getStopSignalAccess().getCmdAssignment_0()); 
            // InternalMyDocker.g:1919:2: ( rule__StopSignal__CmdAssignment_0 )
            // InternalMyDocker.g:1919:3: rule__StopSignal__CmdAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__StopSignal__CmdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStopSignalAccess().getCmdAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopSignal__Group__0__Impl"


    // $ANTLR start "rule__StopSignal__Group__1"
    // InternalMyDocker.g:1927:1: rule__StopSignal__Group__1 : rule__StopSignal__Group__1__Impl ;
    public final void rule__StopSignal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1931:1: ( rule__StopSignal__Group__1__Impl )
            // InternalMyDocker.g:1932:2: rule__StopSignal__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StopSignal__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopSignal__Group__1"


    // $ANTLR start "rule__StopSignal__Group__1__Impl"
    // InternalMyDocker.g:1938:1: rule__StopSignal__Group__1__Impl : ( ( rule__StopSignal__ArgsAssignment_1 ) ) ;
    public final void rule__StopSignal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1942:1: ( ( ( rule__StopSignal__ArgsAssignment_1 ) ) )
            // InternalMyDocker.g:1943:1: ( ( rule__StopSignal__ArgsAssignment_1 ) )
            {
            // InternalMyDocker.g:1943:1: ( ( rule__StopSignal__ArgsAssignment_1 ) )
            // InternalMyDocker.g:1944:2: ( rule__StopSignal__ArgsAssignment_1 )
            {
             before(grammarAccess.getStopSignalAccess().getArgsAssignment_1()); 
            // InternalMyDocker.g:1945:2: ( rule__StopSignal__ArgsAssignment_1 )
            // InternalMyDocker.g:1945:3: rule__StopSignal__ArgsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StopSignal__ArgsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStopSignalAccess().getArgsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopSignal__Group__1__Impl"


    // $ANTLR start "rule__User__Group__0"
    // InternalMyDocker.g:1954:1: rule__User__Group__0 : rule__User__Group__0__Impl rule__User__Group__1 ;
    public final void rule__User__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1958:1: ( rule__User__Group__0__Impl rule__User__Group__1 )
            // InternalMyDocker.g:1959:2: rule__User__Group__0__Impl rule__User__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__User__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__User__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__0"


    // $ANTLR start "rule__User__Group__0__Impl"
    // InternalMyDocker.g:1966:1: rule__User__Group__0__Impl : ( ( rule__User__CmdAssignment_0 ) ) ;
    public final void rule__User__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1970:1: ( ( ( rule__User__CmdAssignment_0 ) ) )
            // InternalMyDocker.g:1971:1: ( ( rule__User__CmdAssignment_0 ) )
            {
            // InternalMyDocker.g:1971:1: ( ( rule__User__CmdAssignment_0 ) )
            // InternalMyDocker.g:1972:2: ( rule__User__CmdAssignment_0 )
            {
             before(grammarAccess.getUserAccess().getCmdAssignment_0()); 
            // InternalMyDocker.g:1973:2: ( rule__User__CmdAssignment_0 )
            // InternalMyDocker.g:1973:3: rule__User__CmdAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__User__CmdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getCmdAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__0__Impl"


    // $ANTLR start "rule__User__Group__1"
    // InternalMyDocker.g:1981:1: rule__User__Group__1 : rule__User__Group__1__Impl ;
    public final void rule__User__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1985:1: ( rule__User__Group__1__Impl )
            // InternalMyDocker.g:1986:2: rule__User__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__User__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__1"


    // $ANTLR start "rule__User__Group__1__Impl"
    // InternalMyDocker.g:1992:1: rule__User__Group__1__Impl : ( ( rule__User__ArgsAssignment_1 ) ) ;
    public final void rule__User__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:1996:1: ( ( ( rule__User__ArgsAssignment_1 ) ) )
            // InternalMyDocker.g:1997:1: ( ( rule__User__ArgsAssignment_1 ) )
            {
            // InternalMyDocker.g:1997:1: ( ( rule__User__ArgsAssignment_1 ) )
            // InternalMyDocker.g:1998:2: ( rule__User__ArgsAssignment_1 )
            {
             before(grammarAccess.getUserAccess().getArgsAssignment_1()); 
            // InternalMyDocker.g:1999:2: ( rule__User__ArgsAssignment_1 )
            // InternalMyDocker.g:1999:3: rule__User__ArgsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__User__ArgsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getArgsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__Group__1__Impl"


    // $ANTLR start "rule__Volume__Group__0"
    // InternalMyDocker.g:2008:1: rule__Volume__Group__0 : rule__Volume__Group__0__Impl rule__Volume__Group__1 ;
    public final void rule__Volume__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2012:1: ( rule__Volume__Group__0__Impl rule__Volume__Group__1 )
            // InternalMyDocker.g:2013:2: rule__Volume__Group__0__Impl rule__Volume__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Volume__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Volume__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Volume__Group__0"


    // $ANTLR start "rule__Volume__Group__0__Impl"
    // InternalMyDocker.g:2020:1: rule__Volume__Group__0__Impl : ( ( rule__Volume__CmdAssignment_0 ) ) ;
    public final void rule__Volume__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2024:1: ( ( ( rule__Volume__CmdAssignment_0 ) ) )
            // InternalMyDocker.g:2025:1: ( ( rule__Volume__CmdAssignment_0 ) )
            {
            // InternalMyDocker.g:2025:1: ( ( rule__Volume__CmdAssignment_0 ) )
            // InternalMyDocker.g:2026:2: ( rule__Volume__CmdAssignment_0 )
            {
             before(grammarAccess.getVolumeAccess().getCmdAssignment_0()); 
            // InternalMyDocker.g:2027:2: ( rule__Volume__CmdAssignment_0 )
            // InternalMyDocker.g:2027:3: rule__Volume__CmdAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Volume__CmdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVolumeAccess().getCmdAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Volume__Group__0__Impl"


    // $ANTLR start "rule__Volume__Group__1"
    // InternalMyDocker.g:2035:1: rule__Volume__Group__1 : rule__Volume__Group__1__Impl ;
    public final void rule__Volume__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2039:1: ( rule__Volume__Group__1__Impl )
            // InternalMyDocker.g:2040:2: rule__Volume__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Volume__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Volume__Group__1"


    // $ANTLR start "rule__Volume__Group__1__Impl"
    // InternalMyDocker.g:2046:1: rule__Volume__Group__1__Impl : ( ( rule__Volume__ArgsAssignment_1 ) ) ;
    public final void rule__Volume__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2050:1: ( ( ( rule__Volume__ArgsAssignment_1 ) ) )
            // InternalMyDocker.g:2051:1: ( ( rule__Volume__ArgsAssignment_1 ) )
            {
            // InternalMyDocker.g:2051:1: ( ( rule__Volume__ArgsAssignment_1 ) )
            // InternalMyDocker.g:2052:2: ( rule__Volume__ArgsAssignment_1 )
            {
             before(grammarAccess.getVolumeAccess().getArgsAssignment_1()); 
            // InternalMyDocker.g:2053:2: ( rule__Volume__ArgsAssignment_1 )
            // InternalMyDocker.g:2053:3: rule__Volume__ArgsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Volume__ArgsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVolumeAccess().getArgsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Volume__Group__1__Impl"


    // $ANTLR start "rule__Workdir__Group__0"
    // InternalMyDocker.g:2062:1: rule__Workdir__Group__0 : rule__Workdir__Group__0__Impl rule__Workdir__Group__1 ;
    public final void rule__Workdir__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2066:1: ( rule__Workdir__Group__0__Impl rule__Workdir__Group__1 )
            // InternalMyDocker.g:2067:2: rule__Workdir__Group__0__Impl rule__Workdir__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Workdir__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Workdir__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workdir__Group__0"


    // $ANTLR start "rule__Workdir__Group__0__Impl"
    // InternalMyDocker.g:2074:1: rule__Workdir__Group__0__Impl : ( ( rule__Workdir__CmdAssignment_0 ) ) ;
    public final void rule__Workdir__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2078:1: ( ( ( rule__Workdir__CmdAssignment_0 ) ) )
            // InternalMyDocker.g:2079:1: ( ( rule__Workdir__CmdAssignment_0 ) )
            {
            // InternalMyDocker.g:2079:1: ( ( rule__Workdir__CmdAssignment_0 ) )
            // InternalMyDocker.g:2080:2: ( rule__Workdir__CmdAssignment_0 )
            {
             before(grammarAccess.getWorkdirAccess().getCmdAssignment_0()); 
            // InternalMyDocker.g:2081:2: ( rule__Workdir__CmdAssignment_0 )
            // InternalMyDocker.g:2081:3: rule__Workdir__CmdAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Workdir__CmdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getWorkdirAccess().getCmdAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workdir__Group__0__Impl"


    // $ANTLR start "rule__Workdir__Group__1"
    // InternalMyDocker.g:2089:1: rule__Workdir__Group__1 : rule__Workdir__Group__1__Impl ;
    public final void rule__Workdir__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2093:1: ( rule__Workdir__Group__1__Impl )
            // InternalMyDocker.g:2094:2: rule__Workdir__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Workdir__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workdir__Group__1"


    // $ANTLR start "rule__Workdir__Group__1__Impl"
    // InternalMyDocker.g:2100:1: rule__Workdir__Group__1__Impl : ( ( rule__Workdir__ArgsAssignment_1 ) ) ;
    public final void rule__Workdir__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2104:1: ( ( ( rule__Workdir__ArgsAssignment_1 ) ) )
            // InternalMyDocker.g:2105:1: ( ( rule__Workdir__ArgsAssignment_1 ) )
            {
            // InternalMyDocker.g:2105:1: ( ( rule__Workdir__ArgsAssignment_1 ) )
            // InternalMyDocker.g:2106:2: ( rule__Workdir__ArgsAssignment_1 )
            {
             before(grammarAccess.getWorkdirAccess().getArgsAssignment_1()); 
            // InternalMyDocker.g:2107:2: ( rule__Workdir__ArgsAssignment_1 )
            // InternalMyDocker.g:2107:3: rule__Workdir__ArgsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Workdir__ArgsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkdirAccess().getArgsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workdir__Group__1__Impl"


    // $ANTLR start "rule__JSONArgs__Group_0__0"
    // InternalMyDocker.g:2116:1: rule__JSONArgs__Group_0__0 : rule__JSONArgs__Group_0__0__Impl rule__JSONArgs__Group_0__1 ;
    public final void rule__JSONArgs__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2120:1: ( rule__JSONArgs__Group_0__0__Impl rule__JSONArgs__Group_0__1 )
            // InternalMyDocker.g:2121:2: rule__JSONArgs__Group_0__0__Impl rule__JSONArgs__Group_0__1
            {
            pushFollow(FOLLOW_11);
            rule__JSONArgs__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSONArgs__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONArgs__Group_0__0"


    // $ANTLR start "rule__JSONArgs__Group_0__0__Impl"
    // InternalMyDocker.g:2128:1: rule__JSONArgs__Group_0__0__Impl : ( '[' ) ;
    public final void rule__JSONArgs__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2132:1: ( ( '[' ) )
            // InternalMyDocker.g:2133:1: ( '[' )
            {
            // InternalMyDocker.g:2133:1: ( '[' )
            // InternalMyDocker.g:2134:2: '['
            {
             before(grammarAccess.getJSONArgsAccess().getLeftSquareBracketKeyword_0_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getJSONArgsAccess().getLeftSquareBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONArgs__Group_0__0__Impl"


    // $ANTLR start "rule__JSONArgs__Group_0__1"
    // InternalMyDocker.g:2143:1: rule__JSONArgs__Group_0__1 : rule__JSONArgs__Group_0__1__Impl rule__JSONArgs__Group_0__2 ;
    public final void rule__JSONArgs__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2147:1: ( rule__JSONArgs__Group_0__1__Impl rule__JSONArgs__Group_0__2 )
            // InternalMyDocker.g:2148:2: rule__JSONArgs__Group_0__1__Impl rule__JSONArgs__Group_0__2
            {
            pushFollow(FOLLOW_12);
            rule__JSONArgs__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSONArgs__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONArgs__Group_0__1"


    // $ANTLR start "rule__JSONArgs__Group_0__1__Impl"
    // InternalMyDocker.g:2155:1: rule__JSONArgs__Group_0__1__Impl : ( ( rule__JSONArgs__ArgsAssignment_0_1 ) ) ;
    public final void rule__JSONArgs__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2159:1: ( ( ( rule__JSONArgs__ArgsAssignment_0_1 ) ) )
            // InternalMyDocker.g:2160:1: ( ( rule__JSONArgs__ArgsAssignment_0_1 ) )
            {
            // InternalMyDocker.g:2160:1: ( ( rule__JSONArgs__ArgsAssignment_0_1 ) )
            // InternalMyDocker.g:2161:2: ( rule__JSONArgs__ArgsAssignment_0_1 )
            {
             before(grammarAccess.getJSONArgsAccess().getArgsAssignment_0_1()); 
            // InternalMyDocker.g:2162:2: ( rule__JSONArgs__ArgsAssignment_0_1 )
            // InternalMyDocker.g:2162:3: rule__JSONArgs__ArgsAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__JSONArgs__ArgsAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getJSONArgsAccess().getArgsAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONArgs__Group_0__1__Impl"


    // $ANTLR start "rule__JSONArgs__Group_0__2"
    // InternalMyDocker.g:2170:1: rule__JSONArgs__Group_0__2 : rule__JSONArgs__Group_0__2__Impl rule__JSONArgs__Group_0__3 ;
    public final void rule__JSONArgs__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2174:1: ( rule__JSONArgs__Group_0__2__Impl rule__JSONArgs__Group_0__3 )
            // InternalMyDocker.g:2175:2: rule__JSONArgs__Group_0__2__Impl rule__JSONArgs__Group_0__3
            {
            pushFollow(FOLLOW_12);
            rule__JSONArgs__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSONArgs__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONArgs__Group_0__2"


    // $ANTLR start "rule__JSONArgs__Group_0__2__Impl"
    // InternalMyDocker.g:2182:1: rule__JSONArgs__Group_0__2__Impl : ( ( rule__JSONArgs__Group_0_2__0 )* ) ;
    public final void rule__JSONArgs__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2186:1: ( ( ( rule__JSONArgs__Group_0_2__0 )* ) )
            // InternalMyDocker.g:2187:1: ( ( rule__JSONArgs__Group_0_2__0 )* )
            {
            // InternalMyDocker.g:2187:1: ( ( rule__JSONArgs__Group_0_2__0 )* )
            // InternalMyDocker.g:2188:2: ( rule__JSONArgs__Group_0_2__0 )*
            {
             before(grammarAccess.getJSONArgsAccess().getGroup_0_2()); 
            // InternalMyDocker.g:2189:2: ( rule__JSONArgs__Group_0_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDocker.g:2189:3: rule__JSONArgs__Group_0_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__JSONArgs__Group_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getJSONArgsAccess().getGroup_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONArgs__Group_0__2__Impl"


    // $ANTLR start "rule__JSONArgs__Group_0__3"
    // InternalMyDocker.g:2197:1: rule__JSONArgs__Group_0__3 : rule__JSONArgs__Group_0__3__Impl ;
    public final void rule__JSONArgs__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2201:1: ( rule__JSONArgs__Group_0__3__Impl )
            // InternalMyDocker.g:2202:2: rule__JSONArgs__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JSONArgs__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONArgs__Group_0__3"


    // $ANTLR start "rule__JSONArgs__Group_0__3__Impl"
    // InternalMyDocker.g:2208:1: rule__JSONArgs__Group_0__3__Impl : ( ']' ) ;
    public final void rule__JSONArgs__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2212:1: ( ( ']' ) )
            // InternalMyDocker.g:2213:1: ( ']' )
            {
            // InternalMyDocker.g:2213:1: ( ']' )
            // InternalMyDocker.g:2214:2: ']'
            {
             before(grammarAccess.getJSONArgsAccess().getRightSquareBracketKeyword_0_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getJSONArgsAccess().getRightSquareBracketKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONArgs__Group_0__3__Impl"


    // $ANTLR start "rule__JSONArgs__Group_0_2__0"
    // InternalMyDocker.g:2224:1: rule__JSONArgs__Group_0_2__0 : rule__JSONArgs__Group_0_2__0__Impl rule__JSONArgs__Group_0_2__1 ;
    public final void rule__JSONArgs__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2228:1: ( rule__JSONArgs__Group_0_2__0__Impl rule__JSONArgs__Group_0_2__1 )
            // InternalMyDocker.g:2229:2: rule__JSONArgs__Group_0_2__0__Impl rule__JSONArgs__Group_0_2__1
            {
            pushFollow(FOLLOW_11);
            rule__JSONArgs__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSONArgs__Group_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONArgs__Group_0_2__0"


    // $ANTLR start "rule__JSONArgs__Group_0_2__0__Impl"
    // InternalMyDocker.g:2236:1: rule__JSONArgs__Group_0_2__0__Impl : ( ',' ) ;
    public final void rule__JSONArgs__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2240:1: ( ( ',' ) )
            // InternalMyDocker.g:2241:1: ( ',' )
            {
            // InternalMyDocker.g:2241:1: ( ',' )
            // InternalMyDocker.g:2242:2: ','
            {
             before(grammarAccess.getJSONArgsAccess().getCommaKeyword_0_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getJSONArgsAccess().getCommaKeyword_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONArgs__Group_0_2__0__Impl"


    // $ANTLR start "rule__JSONArgs__Group_0_2__1"
    // InternalMyDocker.g:2251:1: rule__JSONArgs__Group_0_2__1 : rule__JSONArgs__Group_0_2__1__Impl ;
    public final void rule__JSONArgs__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2255:1: ( rule__JSONArgs__Group_0_2__1__Impl )
            // InternalMyDocker.g:2256:2: rule__JSONArgs__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JSONArgs__Group_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONArgs__Group_0_2__1"


    // $ANTLR start "rule__JSONArgs__Group_0_2__1__Impl"
    // InternalMyDocker.g:2262:1: rule__JSONArgs__Group_0_2__1__Impl : ( ( rule__JSONArgs__ArgsAssignment_0_2_1 ) ) ;
    public final void rule__JSONArgs__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2266:1: ( ( ( rule__JSONArgs__ArgsAssignment_0_2_1 ) ) )
            // InternalMyDocker.g:2267:1: ( ( rule__JSONArgs__ArgsAssignment_0_2_1 ) )
            {
            // InternalMyDocker.g:2267:1: ( ( rule__JSONArgs__ArgsAssignment_0_2_1 ) )
            // InternalMyDocker.g:2268:2: ( rule__JSONArgs__ArgsAssignment_0_2_1 )
            {
             before(grammarAccess.getJSONArgsAccess().getArgsAssignment_0_2_1()); 
            // InternalMyDocker.g:2269:2: ( rule__JSONArgs__ArgsAssignment_0_2_1 )
            // InternalMyDocker.g:2269:3: rule__JSONArgs__ArgsAssignment_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__JSONArgs__ArgsAssignment_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getJSONArgsAccess().getArgsAssignment_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONArgs__Group_0_2__1__Impl"


    // $ANTLR start "rule__JSONArgs__Group_1__0"
    // InternalMyDocker.g:2278:1: rule__JSONArgs__Group_1__0 : rule__JSONArgs__Group_1__0__Impl rule__JSONArgs__Group_1__1 ;
    public final void rule__JSONArgs__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2282:1: ( rule__JSONArgs__Group_1__0__Impl rule__JSONArgs__Group_1__1 )
            // InternalMyDocker.g:2283:2: rule__JSONArgs__Group_1__0__Impl rule__JSONArgs__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__JSONArgs__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSONArgs__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONArgs__Group_1__0"


    // $ANTLR start "rule__JSONArgs__Group_1__0__Impl"
    // InternalMyDocker.g:2290:1: rule__JSONArgs__Group_1__0__Impl : ( '[' ) ;
    public final void rule__JSONArgs__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2294:1: ( ( '[' ) )
            // InternalMyDocker.g:2295:1: ( '[' )
            {
            // InternalMyDocker.g:2295:1: ( '[' )
            // InternalMyDocker.g:2296:2: '['
            {
             before(grammarAccess.getJSONArgsAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getJSONArgsAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONArgs__Group_1__0__Impl"


    // $ANTLR start "rule__JSONArgs__Group_1__1"
    // InternalMyDocker.g:2305:1: rule__JSONArgs__Group_1__1 : rule__JSONArgs__Group_1__1__Impl ;
    public final void rule__JSONArgs__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2309:1: ( rule__JSONArgs__Group_1__1__Impl )
            // InternalMyDocker.g:2310:2: rule__JSONArgs__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JSONArgs__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONArgs__Group_1__1"


    // $ANTLR start "rule__JSONArgs__Group_1__1__Impl"
    // InternalMyDocker.g:2316:1: rule__JSONArgs__Group_1__1__Impl : ( ']' ) ;
    public final void rule__JSONArgs__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2320:1: ( ( ']' ) )
            // InternalMyDocker.g:2321:1: ( ']' )
            {
            // InternalMyDocker.g:2321:1: ( ']' )
            // InternalMyDocker.g:2322:2: ']'
            {
             before(grammarAccess.getJSONArgsAccess().getRightSquareBracketKeyword_1_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getJSONArgsAccess().getRightSquareBracketKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONArgs__Group_1__1__Impl"


    // $ANTLR start "rule__SpaceArgs__Group__0"
    // InternalMyDocker.g:2332:1: rule__SpaceArgs__Group__0 : rule__SpaceArgs__Group__0__Impl rule__SpaceArgs__Group__1 ;
    public final void rule__SpaceArgs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2336:1: ( rule__SpaceArgs__Group__0__Impl rule__SpaceArgs__Group__1 )
            // InternalMyDocker.g:2337:2: rule__SpaceArgs__Group__0__Impl rule__SpaceArgs__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__SpaceArgs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpaceArgs__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpaceArgs__Group__0"


    // $ANTLR start "rule__SpaceArgs__Group__0__Impl"
    // InternalMyDocker.g:2344:1: rule__SpaceArgs__Group__0__Impl : ( ruleValue ) ;
    public final void rule__SpaceArgs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2348:1: ( ( ruleValue ) )
            // InternalMyDocker.g:2349:1: ( ruleValue )
            {
            // InternalMyDocker.g:2349:1: ( ruleValue )
            // InternalMyDocker.g:2350:2: ruleValue
            {
             before(grammarAccess.getSpaceArgsAccess().getValueParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getSpaceArgsAccess().getValueParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpaceArgs__Group__0__Impl"


    // $ANTLR start "rule__SpaceArgs__Group__1"
    // InternalMyDocker.g:2359:1: rule__SpaceArgs__Group__1 : rule__SpaceArgs__Group__1__Impl ;
    public final void rule__SpaceArgs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2363:1: ( rule__SpaceArgs__Group__1__Impl )
            // InternalMyDocker.g:2364:2: rule__SpaceArgs__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpaceArgs__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpaceArgs__Group__1"


    // $ANTLR start "rule__SpaceArgs__Group__1__Impl"
    // InternalMyDocker.g:2370:1: rule__SpaceArgs__Group__1__Impl : ( ( ruleValue )* ) ;
    public final void rule__SpaceArgs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2374:1: ( ( ( ruleValue )* ) )
            // InternalMyDocker.g:2375:1: ( ( ruleValue )* )
            {
            // InternalMyDocker.g:2375:1: ( ( ruleValue )* )
            // InternalMyDocker.g:2376:2: ( ruleValue )*
            {
             before(grammarAccess.getSpaceArgsAccess().getValueParserRuleCall_1()); 
            // InternalMyDocker.g:2377:2: ( ruleValue )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_RAW_VALUE)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDocker.g:2377:3: ruleValue
            	    {
            	    pushFollow(FOLLOW_15);
            	    ruleValue();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getSpaceArgsAccess().getValueParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpaceArgs__Group__1__Impl"


    // $ANTLR start "rule__NameVal__Group_0__0"
    // InternalMyDocker.g:2386:1: rule__NameVal__Group_0__0 : rule__NameVal__Group_0__0__Impl rule__NameVal__Group_0__1 ;
    public final void rule__NameVal__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2390:1: ( rule__NameVal__Group_0__0__Impl rule__NameVal__Group_0__1 )
            // InternalMyDocker.g:2391:2: rule__NameVal__Group_0__0__Impl rule__NameVal__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__NameVal__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NameVal__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameVal__Group_0__0"


    // $ANTLR start "rule__NameVal__Group_0__0__Impl"
    // InternalMyDocker.g:2398:1: rule__NameVal__Group_0__0__Impl : ( ( rule__NameVal__KeyAssignment_0_0 ) ) ;
    public final void rule__NameVal__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2402:1: ( ( ( rule__NameVal__KeyAssignment_0_0 ) ) )
            // InternalMyDocker.g:2403:1: ( ( rule__NameVal__KeyAssignment_0_0 ) )
            {
            // InternalMyDocker.g:2403:1: ( ( rule__NameVal__KeyAssignment_0_0 ) )
            // InternalMyDocker.g:2404:2: ( rule__NameVal__KeyAssignment_0_0 )
            {
             before(grammarAccess.getNameValAccess().getKeyAssignment_0_0()); 
            // InternalMyDocker.g:2405:2: ( rule__NameVal__KeyAssignment_0_0 )
            // InternalMyDocker.g:2405:3: rule__NameVal__KeyAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__NameVal__KeyAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getNameValAccess().getKeyAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameVal__Group_0__0__Impl"


    // $ANTLR start "rule__NameVal__Group_0__1"
    // InternalMyDocker.g:2413:1: rule__NameVal__Group_0__1 : rule__NameVal__Group_0__1__Impl ;
    public final void rule__NameVal__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2417:1: ( rule__NameVal__Group_0__1__Impl )
            // InternalMyDocker.g:2418:2: rule__NameVal__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NameVal__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameVal__Group_0__1"


    // $ANTLR start "rule__NameVal__Group_0__1__Impl"
    // InternalMyDocker.g:2424:1: rule__NameVal__Group_0__1__Impl : ( ( rule__NameVal__ValueAssignment_0_1 ) ) ;
    public final void rule__NameVal__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2428:1: ( ( ( rule__NameVal__ValueAssignment_0_1 ) ) )
            // InternalMyDocker.g:2429:1: ( ( rule__NameVal__ValueAssignment_0_1 ) )
            {
            // InternalMyDocker.g:2429:1: ( ( rule__NameVal__ValueAssignment_0_1 ) )
            // InternalMyDocker.g:2430:2: ( rule__NameVal__ValueAssignment_0_1 )
            {
             before(grammarAccess.getNameValAccess().getValueAssignment_0_1()); 
            // InternalMyDocker.g:2431:2: ( rule__NameVal__ValueAssignment_0_1 )
            // InternalMyDocker.g:2431:3: rule__NameVal__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__NameVal__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getNameValAccess().getValueAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameVal__Group_0__1__Impl"


    // $ANTLR start "rule__NameVal__Group_1__0"
    // InternalMyDocker.g:2440:1: rule__NameVal__Group_1__0 : rule__NameVal__Group_1__0__Impl rule__NameVal__Group_1__1 ;
    public final void rule__NameVal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2444:1: ( rule__NameVal__Group_1__0__Impl rule__NameVal__Group_1__1 )
            // InternalMyDocker.g:2445:2: rule__NameVal__Group_1__0__Impl rule__NameVal__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__NameVal__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NameVal__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameVal__Group_1__0"


    // $ANTLR start "rule__NameVal__Group_1__0__Impl"
    // InternalMyDocker.g:2452:1: rule__NameVal__Group_1__0__Impl : ( ( rule__NameVal__KeyAssignment_1_0 ) ) ;
    public final void rule__NameVal__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2456:1: ( ( ( rule__NameVal__KeyAssignment_1_0 ) ) )
            // InternalMyDocker.g:2457:1: ( ( rule__NameVal__KeyAssignment_1_0 ) )
            {
            // InternalMyDocker.g:2457:1: ( ( rule__NameVal__KeyAssignment_1_0 ) )
            // InternalMyDocker.g:2458:2: ( rule__NameVal__KeyAssignment_1_0 )
            {
             before(grammarAccess.getNameValAccess().getKeyAssignment_1_0()); 
            // InternalMyDocker.g:2459:2: ( rule__NameVal__KeyAssignment_1_0 )
            // InternalMyDocker.g:2459:3: rule__NameVal__KeyAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__NameVal__KeyAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getNameValAccess().getKeyAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameVal__Group_1__0__Impl"


    // $ANTLR start "rule__NameVal__Group_1__1"
    // InternalMyDocker.g:2467:1: rule__NameVal__Group_1__1 : rule__NameVal__Group_1__1__Impl rule__NameVal__Group_1__2 ;
    public final void rule__NameVal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2471:1: ( rule__NameVal__Group_1__1__Impl rule__NameVal__Group_1__2 )
            // InternalMyDocker.g:2472:2: rule__NameVal__Group_1__1__Impl rule__NameVal__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__NameVal__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NameVal__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameVal__Group_1__1"


    // $ANTLR start "rule__NameVal__Group_1__1__Impl"
    // InternalMyDocker.g:2479:1: rule__NameVal__Group_1__1__Impl : ( '=' ) ;
    public final void rule__NameVal__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2483:1: ( ( '=' ) )
            // InternalMyDocker.g:2484:1: ( '=' )
            {
            // InternalMyDocker.g:2484:1: ( '=' )
            // InternalMyDocker.g:2485:2: '='
            {
             before(grammarAccess.getNameValAccess().getEqualsSignKeyword_1_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getNameValAccess().getEqualsSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameVal__Group_1__1__Impl"


    // $ANTLR start "rule__NameVal__Group_1__2"
    // InternalMyDocker.g:2494:1: rule__NameVal__Group_1__2 : rule__NameVal__Group_1__2__Impl ;
    public final void rule__NameVal__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2498:1: ( rule__NameVal__Group_1__2__Impl )
            // InternalMyDocker.g:2499:2: rule__NameVal__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NameVal__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameVal__Group_1__2"


    // $ANTLR start "rule__NameVal__Group_1__2__Impl"
    // InternalMyDocker.g:2505:1: rule__NameVal__Group_1__2__Impl : ( ( rule__NameVal__ValueAssignment_1_2 ) ) ;
    public final void rule__NameVal__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2509:1: ( ( ( rule__NameVal__ValueAssignment_1_2 ) ) )
            // InternalMyDocker.g:2510:1: ( ( rule__NameVal__ValueAssignment_1_2 ) )
            {
            // InternalMyDocker.g:2510:1: ( ( rule__NameVal__ValueAssignment_1_2 ) )
            // InternalMyDocker.g:2511:2: ( rule__NameVal__ValueAssignment_1_2 )
            {
             before(grammarAccess.getNameValAccess().getValueAssignment_1_2()); 
            // InternalMyDocker.g:2512:2: ( rule__NameVal__ValueAssignment_1_2 )
            // InternalMyDocker.g:2512:3: rule__NameVal__ValueAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__NameVal__ValueAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getNameValAccess().getValueAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameVal__Group_1__2__Impl"


    // $ANTLR start "rule__ArgArgs__Group_0__0"
    // InternalMyDocker.g:2521:1: rule__ArgArgs__Group_0__0 : rule__ArgArgs__Group_0__0__Impl rule__ArgArgs__Group_0__1 ;
    public final void rule__ArgArgs__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2525:1: ( rule__ArgArgs__Group_0__0__Impl rule__ArgArgs__Group_0__1 )
            // InternalMyDocker.g:2526:2: rule__ArgArgs__Group_0__0__Impl rule__ArgArgs__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__ArgArgs__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArgArgs__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgArgs__Group_0__0"


    // $ANTLR start "rule__ArgArgs__Group_0__0__Impl"
    // InternalMyDocker.g:2533:1: rule__ArgArgs__Group_0__0__Impl : ( () ) ;
    public final void rule__ArgArgs__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2537:1: ( ( () ) )
            // InternalMyDocker.g:2538:1: ( () )
            {
            // InternalMyDocker.g:2538:1: ( () )
            // InternalMyDocker.g:2539:2: ()
            {
             before(grammarAccess.getArgArgsAccess().getArgArgsAction_0_0()); 
            // InternalMyDocker.g:2540:2: ()
            // InternalMyDocker.g:2540:3: 
            {
            }

             after(grammarAccess.getArgArgsAccess().getArgArgsAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgArgs__Group_0__0__Impl"


    // $ANTLR start "rule__ArgArgs__Group_0__1"
    // InternalMyDocker.g:2548:1: rule__ArgArgs__Group_0__1 : rule__ArgArgs__Group_0__1__Impl ;
    public final void rule__ArgArgs__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2552:1: ( rule__ArgArgs__Group_0__1__Impl )
            // InternalMyDocker.g:2553:2: rule__ArgArgs__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArgArgs__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgArgs__Group_0__1"


    // $ANTLR start "rule__ArgArgs__Group_0__1__Impl"
    // InternalMyDocker.g:2559:1: rule__ArgArgs__Group_0__1__Impl : ( ( rule__ArgArgs__ValueAssignment_0_1 ) ) ;
    public final void rule__ArgArgs__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2563:1: ( ( ( rule__ArgArgs__ValueAssignment_0_1 ) ) )
            // InternalMyDocker.g:2564:1: ( ( rule__ArgArgs__ValueAssignment_0_1 ) )
            {
            // InternalMyDocker.g:2564:1: ( ( rule__ArgArgs__ValueAssignment_0_1 ) )
            // InternalMyDocker.g:2565:2: ( rule__ArgArgs__ValueAssignment_0_1 )
            {
             before(grammarAccess.getArgArgsAccess().getValueAssignment_0_1()); 
            // InternalMyDocker.g:2566:2: ( rule__ArgArgs__ValueAssignment_0_1 )
            // InternalMyDocker.g:2566:3: rule__ArgArgs__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ArgArgs__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getArgArgsAccess().getValueAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgArgs__Group_0__1__Impl"


    // $ANTLR start "rule__HealthArgs__Group_1__0"
    // InternalMyDocker.g:2575:1: rule__HealthArgs__Group_1__0 : rule__HealthArgs__Group_1__0__Impl rule__HealthArgs__Group_1__1 ;
    public final void rule__HealthArgs__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2579:1: ( rule__HealthArgs__Group_1__0__Impl rule__HealthArgs__Group_1__1 )
            // InternalMyDocker.g:2580:2: rule__HealthArgs__Group_1__0__Impl rule__HealthArgs__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__HealthArgs__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HealthArgs__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HealthArgs__Group_1__0"


    // $ANTLR start "rule__HealthArgs__Group_1__0__Impl"
    // InternalMyDocker.g:2587:1: rule__HealthArgs__Group_1__0__Impl : ( ( rule__HealthArgs__OptionsAssignment_1_0 ) ) ;
    public final void rule__HealthArgs__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2591:1: ( ( ( rule__HealthArgs__OptionsAssignment_1_0 ) ) )
            // InternalMyDocker.g:2592:1: ( ( rule__HealthArgs__OptionsAssignment_1_0 ) )
            {
            // InternalMyDocker.g:2592:1: ( ( rule__HealthArgs__OptionsAssignment_1_0 ) )
            // InternalMyDocker.g:2593:2: ( rule__HealthArgs__OptionsAssignment_1_0 )
            {
             before(grammarAccess.getHealthArgsAccess().getOptionsAssignment_1_0()); 
            // InternalMyDocker.g:2594:2: ( rule__HealthArgs__OptionsAssignment_1_0 )
            // InternalMyDocker.g:2594:3: rule__HealthArgs__OptionsAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__HealthArgs__OptionsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getHealthArgsAccess().getOptionsAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HealthArgs__Group_1__0__Impl"


    // $ANTLR start "rule__HealthArgs__Group_1__1"
    // InternalMyDocker.g:2602:1: rule__HealthArgs__Group_1__1 : rule__HealthArgs__Group_1__1__Impl rule__HealthArgs__Group_1__2 ;
    public final void rule__HealthArgs__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2606:1: ( rule__HealthArgs__Group_1__1__Impl rule__HealthArgs__Group_1__2 )
            // InternalMyDocker.g:2607:2: rule__HealthArgs__Group_1__1__Impl rule__HealthArgs__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__HealthArgs__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HealthArgs__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HealthArgs__Group_1__1"


    // $ANTLR start "rule__HealthArgs__Group_1__1__Impl"
    // InternalMyDocker.g:2614:1: rule__HealthArgs__Group_1__1__Impl : ( 'CMD' ) ;
    public final void rule__HealthArgs__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2618:1: ( ( 'CMD' ) )
            // InternalMyDocker.g:2619:1: ( 'CMD' )
            {
            // InternalMyDocker.g:2619:1: ( 'CMD' )
            // InternalMyDocker.g:2620:2: 'CMD'
            {
             before(grammarAccess.getHealthArgsAccess().getCMDKeyword_1_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getHealthArgsAccess().getCMDKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HealthArgs__Group_1__1__Impl"


    // $ANTLR start "rule__HealthArgs__Group_1__2"
    // InternalMyDocker.g:2629:1: rule__HealthArgs__Group_1__2 : rule__HealthArgs__Group_1__2__Impl ;
    public final void rule__HealthArgs__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2633:1: ( rule__HealthArgs__Group_1__2__Impl )
            // InternalMyDocker.g:2634:2: rule__HealthArgs__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HealthArgs__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HealthArgs__Group_1__2"


    // $ANTLR start "rule__HealthArgs__Group_1__2__Impl"
    // InternalMyDocker.g:2640:1: rule__HealthArgs__Group_1__2__Impl : ( ( rule__HealthArgs__CmdArgsAssignment_1_2 ) ) ;
    public final void rule__HealthArgs__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2644:1: ( ( ( rule__HealthArgs__CmdArgsAssignment_1_2 ) ) )
            // InternalMyDocker.g:2645:1: ( ( rule__HealthArgs__CmdArgsAssignment_1_2 ) )
            {
            // InternalMyDocker.g:2645:1: ( ( rule__HealthArgs__CmdArgsAssignment_1_2 ) )
            // InternalMyDocker.g:2646:2: ( rule__HealthArgs__CmdArgsAssignment_1_2 )
            {
             before(grammarAccess.getHealthArgsAccess().getCmdArgsAssignment_1_2()); 
            // InternalMyDocker.g:2647:2: ( rule__HealthArgs__CmdArgsAssignment_1_2 )
            // InternalMyDocker.g:2647:3: rule__HealthArgs__CmdArgsAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__HealthArgs__CmdArgsAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getHealthArgsAccess().getCmdArgsAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HealthArgs__Group_1__2__Impl"


    // $ANTLR start "rule__Options__Group__0"
    // InternalMyDocker.g:2656:1: rule__Options__Group__0 : rule__Options__Group__0__Impl rule__Options__Group__1 ;
    public final void rule__Options__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2660:1: ( rule__Options__Group__0__Impl rule__Options__Group__1 )
            // InternalMyDocker.g:2661:2: rule__Options__Group__0__Impl rule__Options__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Options__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Options__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__Group__0"


    // $ANTLR start "rule__Options__Group__0__Impl"
    // InternalMyDocker.g:2668:1: rule__Options__Group__0__Impl : ( () ) ;
    public final void rule__Options__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2672:1: ( ( () ) )
            // InternalMyDocker.g:2673:1: ( () )
            {
            // InternalMyDocker.g:2673:1: ( () )
            // InternalMyDocker.g:2674:2: ()
            {
             before(grammarAccess.getOptionsAccess().getOptionsAction_0()); 
            // InternalMyDocker.g:2675:2: ()
            // InternalMyDocker.g:2675:3: 
            {
            }

             after(grammarAccess.getOptionsAccess().getOptionsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__Group__0__Impl"


    // $ANTLR start "rule__Options__Group__1"
    // InternalMyDocker.g:2683:1: rule__Options__Group__1 : rule__Options__Group__1__Impl ;
    public final void rule__Options__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2687:1: ( rule__Options__Group__1__Impl )
            // InternalMyDocker.g:2688:2: rule__Options__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Options__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__Group__1"


    // $ANTLR start "rule__Options__Group__1__Impl"
    // InternalMyDocker.g:2694:1: rule__Options__Group__1__Impl : ( ( rule__Options__OptionsAssignment_1 )* ) ;
    public final void rule__Options__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2698:1: ( ( ( rule__Options__OptionsAssignment_1 )* ) )
            // InternalMyDocker.g:2699:1: ( ( rule__Options__OptionsAssignment_1 )* )
            {
            // InternalMyDocker.g:2699:1: ( ( rule__Options__OptionsAssignment_1 )* )
            // InternalMyDocker.g:2700:2: ( rule__Options__OptionsAssignment_1 )*
            {
             before(grammarAccess.getOptionsAccess().getOptionsAssignment_1()); 
            // InternalMyDocker.g:2701:2: ( rule__Options__OptionsAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==19) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDocker.g:2701:3: rule__Options__OptionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Options__OptionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getOptionsAccess().getOptionsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__Group__1__Impl"


    // $ANTLR start "rule__Option__Group__0"
    // InternalMyDocker.g:2710:1: rule__Option__Group__0 : rule__Option__Group__0__Impl rule__Option__Group__1 ;
    public final void rule__Option__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2714:1: ( rule__Option__Group__0__Impl rule__Option__Group__1 )
            // InternalMyDocker.g:2715:2: rule__Option__Group__0__Impl rule__Option__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Option__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Option__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__0"


    // $ANTLR start "rule__Option__Group__0__Impl"
    // InternalMyDocker.g:2722:1: rule__Option__Group__0__Impl : ( '--' ) ;
    public final void rule__Option__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2726:1: ( ( '--' ) )
            // InternalMyDocker.g:2727:1: ( '--' )
            {
            // InternalMyDocker.g:2727:1: ( '--' )
            // InternalMyDocker.g:2728:2: '--'
            {
             before(grammarAccess.getOptionAccess().getHyphenMinusHyphenMinusKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getOptionAccess().getHyphenMinusHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__0__Impl"


    // $ANTLR start "rule__Option__Group__1"
    // InternalMyDocker.g:2737:1: rule__Option__Group__1 : rule__Option__Group__1__Impl rule__Option__Group__2 ;
    public final void rule__Option__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2741:1: ( rule__Option__Group__1__Impl rule__Option__Group__2 )
            // InternalMyDocker.g:2742:2: rule__Option__Group__1__Impl rule__Option__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Option__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Option__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__1"


    // $ANTLR start "rule__Option__Group__1__Impl"
    // InternalMyDocker.g:2749:1: rule__Option__Group__1__Impl : ( ( rule__Option__OptionAssignment_1 ) ) ;
    public final void rule__Option__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2753:1: ( ( ( rule__Option__OptionAssignment_1 ) ) )
            // InternalMyDocker.g:2754:1: ( ( rule__Option__OptionAssignment_1 ) )
            {
            // InternalMyDocker.g:2754:1: ( ( rule__Option__OptionAssignment_1 ) )
            // InternalMyDocker.g:2755:2: ( rule__Option__OptionAssignment_1 )
            {
             before(grammarAccess.getOptionAccess().getOptionAssignment_1()); 
            // InternalMyDocker.g:2756:2: ( rule__Option__OptionAssignment_1 )
            // InternalMyDocker.g:2756:3: rule__Option__OptionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Option__OptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getOptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__1__Impl"


    // $ANTLR start "rule__Option__Group__2"
    // InternalMyDocker.g:2764:1: rule__Option__Group__2 : rule__Option__Group__2__Impl rule__Option__Group__3 ;
    public final void rule__Option__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2768:1: ( rule__Option__Group__2__Impl rule__Option__Group__3 )
            // InternalMyDocker.g:2769:2: rule__Option__Group__2__Impl rule__Option__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Option__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Option__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__2"


    // $ANTLR start "rule__Option__Group__2__Impl"
    // InternalMyDocker.g:2776:1: rule__Option__Group__2__Impl : ( '=' ) ;
    public final void rule__Option__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2780:1: ( ( '=' ) )
            // InternalMyDocker.g:2781:1: ( '=' )
            {
            // InternalMyDocker.g:2781:1: ( '=' )
            // InternalMyDocker.g:2782:2: '='
            {
             before(grammarAccess.getOptionAccess().getEqualsSignKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getOptionAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__2__Impl"


    // $ANTLR start "rule__Option__Group__3"
    // InternalMyDocker.g:2791:1: rule__Option__Group__3 : rule__Option__Group__3__Impl ;
    public final void rule__Option__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2795:1: ( rule__Option__Group__3__Impl )
            // InternalMyDocker.g:2796:2: rule__Option__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Option__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__3"


    // $ANTLR start "rule__Option__Group__3__Impl"
    // InternalMyDocker.g:2802:1: rule__Option__Group__3__Impl : ( ( rule__Option__ValueAssignment_3 ) ) ;
    public final void rule__Option__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2806:1: ( ( ( rule__Option__ValueAssignment_3 ) ) )
            // InternalMyDocker.g:2807:1: ( ( rule__Option__ValueAssignment_3 ) )
            {
            // InternalMyDocker.g:2807:1: ( ( rule__Option__ValueAssignment_3 ) )
            // InternalMyDocker.g:2808:2: ( rule__Option__ValueAssignment_3 )
            {
             before(grammarAccess.getOptionAccess().getValueAssignment_3()); 
            // InternalMyDocker.g:2809:2: ( rule__Option__ValueAssignment_3 )
            // InternalMyDocker.g:2809:3: rule__Option__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Option__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__3__Impl"


    // $ANTLR start "rule__Docker__CommandsAssignment"
    // InternalMyDocker.g:2818:1: rule__Docker__CommandsAssignment : ( ruleCommand ) ;
    public final void rule__Docker__CommandsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2822:1: ( ( ruleCommand ) )
            // InternalMyDocker.g:2823:2: ( ruleCommand )
            {
            // InternalMyDocker.g:2823:2: ( ruleCommand )
            // InternalMyDocker.g:2824:3: ruleCommand
            {
             before(grammarAccess.getDockerAccess().getCommandsCommandParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getDockerAccess().getCommandsCommandParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Docker__CommandsAssignment"


    // $ANTLR start "rule__Add__CmdAssignment_0"
    // InternalMyDocker.g:2833:1: rule__Add__CmdAssignment_0 : ( ( 'ADD' ) ) ;
    public final void rule__Add__CmdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2837:1: ( ( ( 'ADD' ) ) )
            // InternalMyDocker.g:2838:2: ( ( 'ADD' ) )
            {
            // InternalMyDocker.g:2838:2: ( ( 'ADD' ) )
            // InternalMyDocker.g:2839:3: ( 'ADD' )
            {
             before(grammarAccess.getAddAccess().getCmdADDKeyword_0_0()); 
            // InternalMyDocker.g:2840:3: ( 'ADD' )
            // InternalMyDocker.g:2841:4: 'ADD'
            {
             before(grammarAccess.getAddAccess().getCmdADDKeyword_0_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getCmdADDKeyword_0_0()); 

            }

             after(grammarAccess.getAddAccess().getCmdADDKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__CmdAssignment_0"


    // $ANTLR start "rule__Add__ArgsAssignment_1"
    // InternalMyDocker.g:2852:1: rule__Add__ArgsAssignment_1 : ( ruleCommandArgs ) ;
    public final void rule__Add__ArgsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2856:1: ( ( ruleCommandArgs ) )
            // InternalMyDocker.g:2857:2: ( ruleCommandArgs )
            {
            // InternalMyDocker.g:2857:2: ( ruleCommandArgs )
            // InternalMyDocker.g:2858:3: ruleCommandArgs
            {
             before(grammarAccess.getAddAccess().getArgsCommandArgsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCommandArgs();

            state._fsp--;

             after(grammarAccess.getAddAccess().getArgsCommandArgsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__ArgsAssignment_1"


    // $ANTLR start "rule__Arg__CmdAssignment_0"
    // InternalMyDocker.g:2867:1: rule__Arg__CmdAssignment_0 : ( ( 'ARG' ) ) ;
    public final void rule__Arg__CmdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2871:1: ( ( ( 'ARG' ) ) )
            // InternalMyDocker.g:2872:2: ( ( 'ARG' ) )
            {
            // InternalMyDocker.g:2872:2: ( ( 'ARG' ) )
            // InternalMyDocker.g:2873:3: ( 'ARG' )
            {
             before(grammarAccess.getArgAccess().getCmdARGKeyword_0_0()); 
            // InternalMyDocker.g:2874:3: ( 'ARG' )
            // InternalMyDocker.g:2875:4: 'ARG'
            {
             before(grammarAccess.getArgAccess().getCmdARGKeyword_0_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getArgAccess().getCmdARGKeyword_0_0()); 

            }

             after(grammarAccess.getArgAccess().getCmdARGKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arg__CmdAssignment_0"


    // $ANTLR start "rule__Arg__ArgsAssignment_1"
    // InternalMyDocker.g:2886:1: rule__Arg__ArgsAssignment_1 : ( ruleArgArgs ) ;
    public final void rule__Arg__ArgsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2890:1: ( ( ruleArgArgs ) )
            // InternalMyDocker.g:2891:2: ( ruleArgArgs )
            {
            // InternalMyDocker.g:2891:2: ( ruleArgArgs )
            // InternalMyDocker.g:2892:3: ruleArgArgs
            {
             before(grammarAccess.getArgAccess().getArgsArgArgsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArgArgs();

            state._fsp--;

             after(grammarAccess.getArgAccess().getArgsArgArgsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arg__ArgsAssignment_1"


    // $ANTLR start "rule__Cmd__CmdAssignment_0"
    // InternalMyDocker.g:2901:1: rule__Cmd__CmdAssignment_0 : ( ( 'CMD' ) ) ;
    public final void rule__Cmd__CmdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2905:1: ( ( ( 'CMD' ) ) )
            // InternalMyDocker.g:2906:2: ( ( 'CMD' ) )
            {
            // InternalMyDocker.g:2906:2: ( ( 'CMD' ) )
            // InternalMyDocker.g:2907:3: ( 'CMD' )
            {
             before(grammarAccess.getCmdAccess().getCmdCMDKeyword_0_0()); 
            // InternalMyDocker.g:2908:3: ( 'CMD' )
            // InternalMyDocker.g:2909:4: 'CMD'
            {
             before(grammarAccess.getCmdAccess().getCmdCMDKeyword_0_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCmdAccess().getCmdCMDKeyword_0_0()); 

            }

             after(grammarAccess.getCmdAccess().getCmdCMDKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__CmdAssignment_0"


    // $ANTLR start "rule__Cmd__ArgsAssignment_1"
    // InternalMyDocker.g:2920:1: rule__Cmd__ArgsAssignment_1 : ( ruleCommandArgs ) ;
    public final void rule__Cmd__ArgsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2924:1: ( ( ruleCommandArgs ) )
            // InternalMyDocker.g:2925:2: ( ruleCommandArgs )
            {
            // InternalMyDocker.g:2925:2: ( ruleCommandArgs )
            // InternalMyDocker.g:2926:3: ruleCommandArgs
            {
             before(grammarAccess.getCmdAccess().getArgsCommandArgsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCommandArgs();

            state._fsp--;

             after(grammarAccess.getCmdAccess().getArgsCommandArgsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cmd__ArgsAssignment_1"


    // $ANTLR start "rule__Copy__CmdAssignment_0"
    // InternalMyDocker.g:2935:1: rule__Copy__CmdAssignment_0 : ( ( 'COPY' ) ) ;
    public final void rule__Copy__CmdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2939:1: ( ( ( 'COPY' ) ) )
            // InternalMyDocker.g:2940:2: ( ( 'COPY' ) )
            {
            // InternalMyDocker.g:2940:2: ( ( 'COPY' ) )
            // InternalMyDocker.g:2941:3: ( 'COPY' )
            {
             before(grammarAccess.getCopyAccess().getCmdCOPYKeyword_0_0()); 
            // InternalMyDocker.g:2942:3: ( 'COPY' )
            // InternalMyDocker.g:2943:4: 'COPY'
            {
             before(grammarAccess.getCopyAccess().getCmdCOPYKeyword_0_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCopyAccess().getCmdCOPYKeyword_0_0()); 

            }

             after(grammarAccess.getCopyAccess().getCmdCOPYKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__CmdAssignment_0"


    // $ANTLR start "rule__Copy__ArgsAssignment_1"
    // InternalMyDocker.g:2954:1: rule__Copy__ArgsAssignment_1 : ( ruleCommandArgs ) ;
    public final void rule__Copy__ArgsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2958:1: ( ( ruleCommandArgs ) )
            // InternalMyDocker.g:2959:2: ( ruleCommandArgs )
            {
            // InternalMyDocker.g:2959:2: ( ruleCommandArgs )
            // InternalMyDocker.g:2960:3: ruleCommandArgs
            {
             before(grammarAccess.getCopyAccess().getArgsCommandArgsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCommandArgs();

            state._fsp--;

             after(grammarAccess.getCopyAccess().getArgsCommandArgsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__ArgsAssignment_1"


    // $ANTLR start "rule__Entrypoint__CmdAssignment_0"
    // InternalMyDocker.g:2969:1: rule__Entrypoint__CmdAssignment_0 : ( ( 'ENTRYPOINT' ) ) ;
    public final void rule__Entrypoint__CmdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2973:1: ( ( ( 'ENTRYPOINT' ) ) )
            // InternalMyDocker.g:2974:2: ( ( 'ENTRYPOINT' ) )
            {
            // InternalMyDocker.g:2974:2: ( ( 'ENTRYPOINT' ) )
            // InternalMyDocker.g:2975:3: ( 'ENTRYPOINT' )
            {
             before(grammarAccess.getEntrypointAccess().getCmdENTRYPOINTKeyword_0_0()); 
            // InternalMyDocker.g:2976:3: ( 'ENTRYPOINT' )
            // InternalMyDocker.g:2977:4: 'ENTRYPOINT'
            {
             before(grammarAccess.getEntrypointAccess().getCmdENTRYPOINTKeyword_0_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEntrypointAccess().getCmdENTRYPOINTKeyword_0_0()); 

            }

             after(grammarAccess.getEntrypointAccess().getCmdENTRYPOINTKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrypoint__CmdAssignment_0"


    // $ANTLR start "rule__Entrypoint__ArgsAssignment_1"
    // InternalMyDocker.g:2988:1: rule__Entrypoint__ArgsAssignment_1 : ( ruleJSONArgs ) ;
    public final void rule__Entrypoint__ArgsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:2992:1: ( ( ruleJSONArgs ) )
            // InternalMyDocker.g:2993:2: ( ruleJSONArgs )
            {
            // InternalMyDocker.g:2993:2: ( ruleJSONArgs )
            // InternalMyDocker.g:2994:3: ruleJSONArgs
            {
             before(grammarAccess.getEntrypointAccess().getArgsJSONArgsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJSONArgs();

            state._fsp--;

             after(grammarAccess.getEntrypointAccess().getArgsJSONArgsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrypoint__ArgsAssignment_1"


    // $ANTLR start "rule__Env__CmdAssignment_0"
    // InternalMyDocker.g:3003:1: rule__Env__CmdAssignment_0 : ( ( 'ENV' ) ) ;
    public final void rule__Env__CmdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3007:1: ( ( ( 'ENV' ) ) )
            // InternalMyDocker.g:3008:2: ( ( 'ENV' ) )
            {
            // InternalMyDocker.g:3008:2: ( ( 'ENV' ) )
            // InternalMyDocker.g:3009:3: ( 'ENV' )
            {
             before(grammarAccess.getEnvAccess().getCmdENVKeyword_0_0()); 
            // InternalMyDocker.g:3010:3: ( 'ENV' )
            // InternalMyDocker.g:3011:4: 'ENV'
            {
             before(grammarAccess.getEnvAccess().getCmdENVKeyword_0_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEnvAccess().getCmdENVKeyword_0_0()); 

            }

             after(grammarAccess.getEnvAccess().getCmdENVKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Env__CmdAssignment_0"


    // $ANTLR start "rule__Env__ArgsAssignment_1"
    // InternalMyDocker.g:3022:1: rule__Env__ArgsAssignment_1 : ( ruleNameVals ) ;
    public final void rule__Env__ArgsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3026:1: ( ( ruleNameVals ) )
            // InternalMyDocker.g:3027:2: ( ruleNameVals )
            {
            // InternalMyDocker.g:3027:2: ( ruleNameVals )
            // InternalMyDocker.g:3028:3: ruleNameVals
            {
             before(grammarAccess.getEnvAccess().getArgsNameValsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNameVals();

            state._fsp--;

             after(grammarAccess.getEnvAccess().getArgsNameValsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Env__ArgsAssignment_1"


    // $ANTLR start "rule__Expose__CmdAssignment_0"
    // InternalMyDocker.g:3037:1: rule__Expose__CmdAssignment_0 : ( ( 'EXPOSE' ) ) ;
    public final void rule__Expose__CmdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3041:1: ( ( ( 'EXPOSE' ) ) )
            // InternalMyDocker.g:3042:2: ( ( 'EXPOSE' ) )
            {
            // InternalMyDocker.g:3042:2: ( ( 'EXPOSE' ) )
            // InternalMyDocker.g:3043:3: ( 'EXPOSE' )
            {
             before(grammarAccess.getExposeAccess().getCmdEXPOSEKeyword_0_0()); 
            // InternalMyDocker.g:3044:3: ( 'EXPOSE' )
            // InternalMyDocker.g:3045:4: 'EXPOSE'
            {
             before(grammarAccess.getExposeAccess().getCmdEXPOSEKeyword_0_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getExposeAccess().getCmdEXPOSEKeyword_0_0()); 

            }

             after(grammarAccess.getExposeAccess().getCmdEXPOSEKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expose__CmdAssignment_0"


    // $ANTLR start "rule__Expose__ArgsAssignment_1"
    // InternalMyDocker.g:3056:1: rule__Expose__ArgsAssignment_1 : ( ruleExposeArgs ) ;
    public final void rule__Expose__ArgsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3060:1: ( ( ruleExposeArgs ) )
            // InternalMyDocker.g:3061:2: ( ruleExposeArgs )
            {
            // InternalMyDocker.g:3061:2: ( ruleExposeArgs )
            // InternalMyDocker.g:3062:3: ruleExposeArgs
            {
             before(grammarAccess.getExposeAccess().getArgsExposeArgsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExposeArgs();

            state._fsp--;

             after(grammarAccess.getExposeAccess().getArgsExposeArgsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expose__ArgsAssignment_1"


    // $ANTLR start "rule__From__CmdAssignment_0"
    // InternalMyDocker.g:3071:1: rule__From__CmdAssignment_0 : ( ( 'FROM' ) ) ;
    public final void rule__From__CmdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3075:1: ( ( ( 'FROM' ) ) )
            // InternalMyDocker.g:3076:2: ( ( 'FROM' ) )
            {
            // InternalMyDocker.g:3076:2: ( ( 'FROM' ) )
            // InternalMyDocker.g:3077:3: ( 'FROM' )
            {
             before(grammarAccess.getFromAccess().getCmdFROMKeyword_0_0()); 
            // InternalMyDocker.g:3078:3: ( 'FROM' )
            // InternalMyDocker.g:3079:4: 'FROM'
            {
             before(grammarAccess.getFromAccess().getCmdFROMKeyword_0_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFromAccess().getCmdFROMKeyword_0_0()); 

            }

             after(grammarAccess.getFromAccess().getCmdFROMKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__CmdAssignment_0"


    // $ANTLR start "rule__From__ArgsAssignment_1"
    // InternalMyDocker.g:3090:1: rule__From__ArgsAssignment_1 : ( ruleCommandArgs ) ;
    public final void rule__From__ArgsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3094:1: ( ( ruleCommandArgs ) )
            // InternalMyDocker.g:3095:2: ( ruleCommandArgs )
            {
            // InternalMyDocker.g:3095:2: ( ruleCommandArgs )
            // InternalMyDocker.g:3096:3: ruleCommandArgs
            {
             before(grammarAccess.getFromAccess().getArgsCommandArgsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCommandArgs();

            state._fsp--;

             after(grammarAccess.getFromAccess().getArgsCommandArgsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__From__ArgsAssignment_1"


    // $ANTLR start "rule__Healthcheck__CmdAssignment_0"
    // InternalMyDocker.g:3105:1: rule__Healthcheck__CmdAssignment_0 : ( ( 'HEALTHCHECK' ) ) ;
    public final void rule__Healthcheck__CmdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3109:1: ( ( ( 'HEALTHCHECK' ) ) )
            // InternalMyDocker.g:3110:2: ( ( 'HEALTHCHECK' ) )
            {
            // InternalMyDocker.g:3110:2: ( ( 'HEALTHCHECK' ) )
            // InternalMyDocker.g:3111:3: ( 'HEALTHCHECK' )
            {
             before(grammarAccess.getHealthcheckAccess().getCmdHEALTHCHECKKeyword_0_0()); 
            // InternalMyDocker.g:3112:3: ( 'HEALTHCHECK' )
            // InternalMyDocker.g:3113:4: 'HEALTHCHECK'
            {
             before(grammarAccess.getHealthcheckAccess().getCmdHEALTHCHECKKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getHealthcheckAccess().getCmdHEALTHCHECKKeyword_0_0()); 

            }

             after(grammarAccess.getHealthcheckAccess().getCmdHEALTHCHECKKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Healthcheck__CmdAssignment_0"


    // $ANTLR start "rule__Healthcheck__ArgsAssignment_1"
    // InternalMyDocker.g:3124:1: rule__Healthcheck__ArgsAssignment_1 : ( ruleHealthArgs ) ;
    public final void rule__Healthcheck__ArgsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3128:1: ( ( ruleHealthArgs ) )
            // InternalMyDocker.g:3129:2: ( ruleHealthArgs )
            {
            // InternalMyDocker.g:3129:2: ( ruleHealthArgs )
            // InternalMyDocker.g:3130:3: ruleHealthArgs
            {
             before(grammarAccess.getHealthcheckAccess().getArgsHealthArgsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHealthArgs();

            state._fsp--;

             after(grammarAccess.getHealthcheckAccess().getArgsHealthArgsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Healthcheck__ArgsAssignment_1"


    // $ANTLR start "rule__Label__CmdAssignment_0"
    // InternalMyDocker.g:3139:1: rule__Label__CmdAssignment_0 : ( ( 'LABEL' ) ) ;
    public final void rule__Label__CmdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3143:1: ( ( ( 'LABEL' ) ) )
            // InternalMyDocker.g:3144:2: ( ( 'LABEL' ) )
            {
            // InternalMyDocker.g:3144:2: ( ( 'LABEL' ) )
            // InternalMyDocker.g:3145:3: ( 'LABEL' )
            {
             before(grammarAccess.getLabelAccess().getCmdLABELKeyword_0_0()); 
            // InternalMyDocker.g:3146:3: ( 'LABEL' )
            // InternalMyDocker.g:3147:4: 'LABEL'
            {
             before(grammarAccess.getLabelAccess().getCmdLABELKeyword_0_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getCmdLABELKeyword_0_0()); 

            }

             after(grammarAccess.getLabelAccess().getCmdLABELKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__CmdAssignment_0"


    // $ANTLR start "rule__Label__ArgsAssignment_1"
    // InternalMyDocker.g:3158:1: rule__Label__ArgsAssignment_1 : ( ruleNameVals ) ;
    public final void rule__Label__ArgsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3162:1: ( ( ruleNameVals ) )
            // InternalMyDocker.g:3163:2: ( ruleNameVals )
            {
            // InternalMyDocker.g:3163:2: ( ruleNameVals )
            // InternalMyDocker.g:3164:3: ruleNameVals
            {
             before(grammarAccess.getLabelAccess().getArgsNameValsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNameVals();

            state._fsp--;

             after(grammarAccess.getLabelAccess().getArgsNameValsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__ArgsAssignment_1"


    // $ANTLR start "rule__Maintainer__CmdAssignment_0"
    // InternalMyDocker.g:3173:1: rule__Maintainer__CmdAssignment_0 : ( ( 'MAINTAINER' ) ) ;
    public final void rule__Maintainer__CmdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3177:1: ( ( ( 'MAINTAINER' ) ) )
            // InternalMyDocker.g:3178:2: ( ( 'MAINTAINER' ) )
            {
            // InternalMyDocker.g:3178:2: ( ( 'MAINTAINER' ) )
            // InternalMyDocker.g:3179:3: ( 'MAINTAINER' )
            {
             before(grammarAccess.getMaintainerAccess().getCmdMAINTAINERKeyword_0_0()); 
            // InternalMyDocker.g:3180:3: ( 'MAINTAINER' )
            // InternalMyDocker.g:3181:4: 'MAINTAINER'
            {
             before(grammarAccess.getMaintainerAccess().getCmdMAINTAINERKeyword_0_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMaintainerAccess().getCmdMAINTAINERKeyword_0_0()); 

            }

             after(grammarAccess.getMaintainerAccess().getCmdMAINTAINERKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Maintainer__CmdAssignment_0"


    // $ANTLR start "rule__Maintainer__ArgsAssignment_1"
    // InternalMyDocker.g:3192:1: rule__Maintainer__ArgsAssignment_1 : ( ruleValue ) ;
    public final void rule__Maintainer__ArgsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3196:1: ( ( ruleValue ) )
            // InternalMyDocker.g:3197:2: ( ruleValue )
            {
            // InternalMyDocker.g:3197:2: ( ruleValue )
            // InternalMyDocker.g:3198:3: ruleValue
            {
             before(grammarAccess.getMaintainerAccess().getArgsValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getMaintainerAccess().getArgsValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Maintainer__ArgsAssignment_1"


    // $ANTLR start "rule__Onbuild__CmdAssignment_0"
    // InternalMyDocker.g:3207:1: rule__Onbuild__CmdAssignment_0 : ( ( 'ONBUILD' ) ) ;
    public final void rule__Onbuild__CmdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3211:1: ( ( ( 'ONBUILD' ) ) )
            // InternalMyDocker.g:3212:2: ( ( 'ONBUILD' ) )
            {
            // InternalMyDocker.g:3212:2: ( ( 'ONBUILD' ) )
            // InternalMyDocker.g:3213:3: ( 'ONBUILD' )
            {
             before(grammarAccess.getOnbuildAccess().getCmdONBUILDKeyword_0_0()); 
            // InternalMyDocker.g:3214:3: ( 'ONBUILD' )
            // InternalMyDocker.g:3215:4: 'ONBUILD'
            {
             before(grammarAccess.getOnbuildAccess().getCmdONBUILDKeyword_0_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getOnbuildAccess().getCmdONBUILDKeyword_0_0()); 

            }

             after(grammarAccess.getOnbuildAccess().getCmdONBUILDKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Onbuild__CmdAssignment_0"


    // $ANTLR start "rule__Onbuild__ArgsAssignment_1"
    // InternalMyDocker.g:3226:1: rule__Onbuild__ArgsAssignment_1 : ( RULE_ID ) ;
    public final void rule__Onbuild__ArgsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3230:1: ( ( RULE_ID ) )
            // InternalMyDocker.g:3231:2: ( RULE_ID )
            {
            // InternalMyDocker.g:3231:2: ( RULE_ID )
            // InternalMyDocker.g:3232:3: RULE_ID
            {
             before(grammarAccess.getOnbuildAccess().getArgsIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOnbuildAccess().getArgsIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Onbuild__ArgsAssignment_1"


    // $ANTLR start "rule__Run__CmdAssignment_0"
    // InternalMyDocker.g:3241:1: rule__Run__CmdAssignment_0 : ( ( 'RUN' ) ) ;
    public final void rule__Run__CmdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3245:1: ( ( ( 'RUN' ) ) )
            // InternalMyDocker.g:3246:2: ( ( 'RUN' ) )
            {
            // InternalMyDocker.g:3246:2: ( ( 'RUN' ) )
            // InternalMyDocker.g:3247:3: ( 'RUN' )
            {
             before(grammarAccess.getRunAccess().getCmdRUNKeyword_0_0()); 
            // InternalMyDocker.g:3248:3: ( 'RUN' )
            // InternalMyDocker.g:3249:4: 'RUN'
            {
             before(grammarAccess.getRunAccess().getCmdRUNKeyword_0_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRunAccess().getCmdRUNKeyword_0_0()); 

            }

             after(grammarAccess.getRunAccess().getCmdRUNKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Run__CmdAssignment_0"


    // $ANTLR start "rule__Run__ArgsAssignment_1"
    // InternalMyDocker.g:3260:1: rule__Run__ArgsAssignment_1 : ( ruleCommandArgs ) ;
    public final void rule__Run__ArgsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3264:1: ( ( ruleCommandArgs ) )
            // InternalMyDocker.g:3265:2: ( ruleCommandArgs )
            {
            // InternalMyDocker.g:3265:2: ( ruleCommandArgs )
            // InternalMyDocker.g:3266:3: ruleCommandArgs
            {
             before(grammarAccess.getRunAccess().getArgsCommandArgsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCommandArgs();

            state._fsp--;

             after(grammarAccess.getRunAccess().getArgsCommandArgsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Run__ArgsAssignment_1"


    // $ANTLR start "rule__Shell__CmdAssignment_0"
    // InternalMyDocker.g:3275:1: rule__Shell__CmdAssignment_0 : ( ( 'SHELL' ) ) ;
    public final void rule__Shell__CmdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3279:1: ( ( ( 'SHELL' ) ) )
            // InternalMyDocker.g:3280:2: ( ( 'SHELL' ) )
            {
            // InternalMyDocker.g:3280:2: ( ( 'SHELL' ) )
            // InternalMyDocker.g:3281:3: ( 'SHELL' )
            {
             before(grammarAccess.getShellAccess().getCmdSHELLKeyword_0_0()); 
            // InternalMyDocker.g:3282:3: ( 'SHELL' )
            // InternalMyDocker.g:3283:4: 'SHELL'
            {
             before(grammarAccess.getShellAccess().getCmdSHELLKeyword_0_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getShellAccess().getCmdSHELLKeyword_0_0()); 

            }

             after(grammarAccess.getShellAccess().getCmdSHELLKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shell__CmdAssignment_0"


    // $ANTLR start "rule__Shell__ArgsAssignment_1"
    // InternalMyDocker.g:3294:1: rule__Shell__ArgsAssignment_1 : ( ruleJSONArgs ) ;
    public final void rule__Shell__ArgsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3298:1: ( ( ruleJSONArgs ) )
            // InternalMyDocker.g:3299:2: ( ruleJSONArgs )
            {
            // InternalMyDocker.g:3299:2: ( ruleJSONArgs )
            // InternalMyDocker.g:3300:3: ruleJSONArgs
            {
             before(grammarAccess.getShellAccess().getArgsJSONArgsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJSONArgs();

            state._fsp--;

             after(grammarAccess.getShellAccess().getArgsJSONArgsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shell__ArgsAssignment_1"


    // $ANTLR start "rule__StopSignal__CmdAssignment_0"
    // InternalMyDocker.g:3309:1: rule__StopSignal__CmdAssignment_0 : ( ( 'STOPSIGNAL' ) ) ;
    public final void rule__StopSignal__CmdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3313:1: ( ( ( 'STOPSIGNAL' ) ) )
            // InternalMyDocker.g:3314:2: ( ( 'STOPSIGNAL' ) )
            {
            // InternalMyDocker.g:3314:2: ( ( 'STOPSIGNAL' ) )
            // InternalMyDocker.g:3315:3: ( 'STOPSIGNAL' )
            {
             before(grammarAccess.getStopSignalAccess().getCmdSTOPSIGNALKeyword_0_0()); 
            // InternalMyDocker.g:3316:3: ( 'STOPSIGNAL' )
            // InternalMyDocker.g:3317:4: 'STOPSIGNAL'
            {
             before(grammarAccess.getStopSignalAccess().getCmdSTOPSIGNALKeyword_0_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getStopSignalAccess().getCmdSTOPSIGNALKeyword_0_0()); 

            }

             after(grammarAccess.getStopSignalAccess().getCmdSTOPSIGNALKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopSignal__CmdAssignment_0"


    // $ANTLR start "rule__StopSignal__ArgsAssignment_1"
    // InternalMyDocker.g:3328:1: rule__StopSignal__ArgsAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StopSignal__ArgsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3332:1: ( ( RULE_STRING ) )
            // InternalMyDocker.g:3333:2: ( RULE_STRING )
            {
            // InternalMyDocker.g:3333:2: ( RULE_STRING )
            // InternalMyDocker.g:3334:3: RULE_STRING
            {
             before(grammarAccess.getStopSignalAccess().getArgsSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStopSignalAccess().getArgsSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StopSignal__ArgsAssignment_1"


    // $ANTLR start "rule__User__CmdAssignment_0"
    // InternalMyDocker.g:3343:1: rule__User__CmdAssignment_0 : ( ( 'USER' ) ) ;
    public final void rule__User__CmdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3347:1: ( ( ( 'USER' ) ) )
            // InternalMyDocker.g:3348:2: ( ( 'USER' ) )
            {
            // InternalMyDocker.g:3348:2: ( ( 'USER' ) )
            // InternalMyDocker.g:3349:3: ( 'USER' )
            {
             before(grammarAccess.getUserAccess().getCmdUSERKeyword_0_0()); 
            // InternalMyDocker.g:3350:3: ( 'USER' )
            // InternalMyDocker.g:3351:4: 'USER'
            {
             before(grammarAccess.getUserAccess().getCmdUSERKeyword_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getUserAccess().getCmdUSERKeyword_0_0()); 

            }

             after(grammarAccess.getUserAccess().getCmdUSERKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__CmdAssignment_0"


    // $ANTLR start "rule__User__ArgsAssignment_1"
    // InternalMyDocker.g:3362:1: rule__User__ArgsAssignment_1 : ( ruleValue ) ;
    public final void rule__User__ArgsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3366:1: ( ( ruleValue ) )
            // InternalMyDocker.g:3367:2: ( ruleValue )
            {
            // InternalMyDocker.g:3367:2: ( ruleValue )
            // InternalMyDocker.g:3368:3: ruleValue
            {
             before(grammarAccess.getUserAccess().getArgsValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getUserAccess().getArgsValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__User__ArgsAssignment_1"


    // $ANTLR start "rule__Volume__CmdAssignment_0"
    // InternalMyDocker.g:3377:1: rule__Volume__CmdAssignment_0 : ( ( 'VOLUME' ) ) ;
    public final void rule__Volume__CmdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3381:1: ( ( ( 'VOLUME' ) ) )
            // InternalMyDocker.g:3382:2: ( ( 'VOLUME' ) )
            {
            // InternalMyDocker.g:3382:2: ( ( 'VOLUME' ) )
            // InternalMyDocker.g:3383:3: ( 'VOLUME' )
            {
             before(grammarAccess.getVolumeAccess().getCmdVOLUMEKeyword_0_0()); 
            // InternalMyDocker.g:3384:3: ( 'VOLUME' )
            // InternalMyDocker.g:3385:4: 'VOLUME'
            {
             before(grammarAccess.getVolumeAccess().getCmdVOLUMEKeyword_0_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getVolumeAccess().getCmdVOLUMEKeyword_0_0()); 

            }

             after(grammarAccess.getVolumeAccess().getCmdVOLUMEKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Volume__CmdAssignment_0"


    // $ANTLR start "rule__Volume__ArgsAssignment_1"
    // InternalMyDocker.g:3396:1: rule__Volume__ArgsAssignment_1 : ( ruleCommandArgs ) ;
    public final void rule__Volume__ArgsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3400:1: ( ( ruleCommandArgs ) )
            // InternalMyDocker.g:3401:2: ( ruleCommandArgs )
            {
            // InternalMyDocker.g:3401:2: ( ruleCommandArgs )
            // InternalMyDocker.g:3402:3: ruleCommandArgs
            {
             before(grammarAccess.getVolumeAccess().getArgsCommandArgsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCommandArgs();

            state._fsp--;

             after(grammarAccess.getVolumeAccess().getArgsCommandArgsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Volume__ArgsAssignment_1"


    // $ANTLR start "rule__Workdir__CmdAssignment_0"
    // InternalMyDocker.g:3411:1: rule__Workdir__CmdAssignment_0 : ( ( 'WORKDIR' ) ) ;
    public final void rule__Workdir__CmdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3415:1: ( ( ( 'WORKDIR' ) ) )
            // InternalMyDocker.g:3416:2: ( ( 'WORKDIR' ) )
            {
            // InternalMyDocker.g:3416:2: ( ( 'WORKDIR' ) )
            // InternalMyDocker.g:3417:3: ( 'WORKDIR' )
            {
             before(grammarAccess.getWorkdirAccess().getCmdWORKDIRKeyword_0_0()); 
            // InternalMyDocker.g:3418:3: ( 'WORKDIR' )
            // InternalMyDocker.g:3419:4: 'WORKDIR'
            {
             before(grammarAccess.getWorkdirAccess().getCmdWORKDIRKeyword_0_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getWorkdirAccess().getCmdWORKDIRKeyword_0_0()); 

            }

             after(grammarAccess.getWorkdirAccess().getCmdWORKDIRKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workdir__CmdAssignment_0"


    // $ANTLR start "rule__Workdir__ArgsAssignment_1"
    // InternalMyDocker.g:3430:1: rule__Workdir__ArgsAssignment_1 : ( ruleValue ) ;
    public final void rule__Workdir__ArgsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3434:1: ( ( ruleValue ) )
            // InternalMyDocker.g:3435:2: ( ruleValue )
            {
            // InternalMyDocker.g:3435:2: ( ruleValue )
            // InternalMyDocker.g:3436:3: ruleValue
            {
             before(grammarAccess.getWorkdirAccess().getArgsValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getWorkdirAccess().getArgsValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Workdir__ArgsAssignment_1"


    // $ANTLR start "rule__JSONArgs__ArgsAssignment_0_1"
    // InternalMyDocker.g:3445:1: rule__JSONArgs__ArgsAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__JSONArgs__ArgsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3449:1: ( ( RULE_STRING ) )
            // InternalMyDocker.g:3450:2: ( RULE_STRING )
            {
            // InternalMyDocker.g:3450:2: ( RULE_STRING )
            // InternalMyDocker.g:3451:3: RULE_STRING
            {
             before(grammarAccess.getJSONArgsAccess().getArgsSTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getJSONArgsAccess().getArgsSTRINGTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONArgs__ArgsAssignment_0_1"


    // $ANTLR start "rule__JSONArgs__ArgsAssignment_0_2_1"
    // InternalMyDocker.g:3460:1: rule__JSONArgs__ArgsAssignment_0_2_1 : ( RULE_STRING ) ;
    public final void rule__JSONArgs__ArgsAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3464:1: ( ( RULE_STRING ) )
            // InternalMyDocker.g:3465:2: ( RULE_STRING )
            {
            // InternalMyDocker.g:3465:2: ( RULE_STRING )
            // InternalMyDocker.g:3466:3: RULE_STRING
            {
             before(grammarAccess.getJSONArgsAccess().getArgsSTRINGTerminalRuleCall_0_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getJSONArgsAccess().getArgsSTRINGTerminalRuleCall_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSONArgs__ArgsAssignment_0_2_1"


    // $ANTLR start "rule__NameVals__ValuesAssignment"
    // InternalMyDocker.g:3475:1: rule__NameVals__ValuesAssignment : ( ruleNameVal ) ;
    public final void rule__NameVals__ValuesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3479:1: ( ( ruleNameVal ) )
            // InternalMyDocker.g:3480:2: ( ruleNameVal )
            {
            // InternalMyDocker.g:3480:2: ( ruleNameVal )
            // InternalMyDocker.g:3481:3: ruleNameVal
            {
             before(grammarAccess.getNameValsAccess().getValuesNameValParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNameVal();

            state._fsp--;

             after(grammarAccess.getNameValsAccess().getValuesNameValParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameVals__ValuesAssignment"


    // $ANTLR start "rule__NameVal__KeyAssignment_0_0"
    // InternalMyDocker.g:3490:1: rule__NameVal__KeyAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__NameVal__KeyAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3494:1: ( ( RULE_ID ) )
            // InternalMyDocker.g:3495:2: ( RULE_ID )
            {
            // InternalMyDocker.g:3495:2: ( RULE_ID )
            // InternalMyDocker.g:3496:3: RULE_ID
            {
             before(grammarAccess.getNameValAccess().getKeyIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNameValAccess().getKeyIDTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameVal__KeyAssignment_0_0"


    // $ANTLR start "rule__NameVal__ValueAssignment_0_1"
    // InternalMyDocker.g:3505:1: rule__NameVal__ValueAssignment_0_1 : ( ruleValue ) ;
    public final void rule__NameVal__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3509:1: ( ( ruleValue ) )
            // InternalMyDocker.g:3510:2: ( ruleValue )
            {
            // InternalMyDocker.g:3510:2: ( ruleValue )
            // InternalMyDocker.g:3511:3: ruleValue
            {
             before(grammarAccess.getNameValAccess().getValueValueParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getNameValAccess().getValueValueParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameVal__ValueAssignment_0_1"


    // $ANTLR start "rule__NameVal__KeyAssignment_1_0"
    // InternalMyDocker.g:3520:1: rule__NameVal__KeyAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__NameVal__KeyAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3524:1: ( ( RULE_ID ) )
            // InternalMyDocker.g:3525:2: ( RULE_ID )
            {
            // InternalMyDocker.g:3525:2: ( RULE_ID )
            // InternalMyDocker.g:3526:3: RULE_ID
            {
             before(grammarAccess.getNameValAccess().getKeyIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNameValAccess().getKeyIDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameVal__KeyAssignment_1_0"


    // $ANTLR start "rule__NameVal__ValueAssignment_1_2"
    // InternalMyDocker.g:3535:1: rule__NameVal__ValueAssignment_1_2 : ( ruleValue ) ;
    public final void rule__NameVal__ValueAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3539:1: ( ( ruleValue ) )
            // InternalMyDocker.g:3540:2: ( ruleValue )
            {
            // InternalMyDocker.g:3540:2: ( ruleValue )
            // InternalMyDocker.g:3541:3: ruleValue
            {
             before(grammarAccess.getNameValAccess().getValueValueParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getNameValAccess().getValueValueParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameVal__ValueAssignment_1_2"


    // $ANTLR start "rule__ArgArgs__ValueAssignment_0_1"
    // InternalMyDocker.g:3550:1: rule__ArgArgs__ValueAssignment_0_1 : ( ruleValue ) ;
    public final void rule__ArgArgs__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3554:1: ( ( ruleValue ) )
            // InternalMyDocker.g:3555:2: ( ruleValue )
            {
            // InternalMyDocker.g:3555:2: ( ruleValue )
            // InternalMyDocker.g:3556:3: ruleValue
            {
             before(grammarAccess.getArgArgsAccess().getValueValueParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getArgArgsAccess().getValueValueParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgArgs__ValueAssignment_0_1"


    // $ANTLR start "rule__ArgArgs__ValuesAssignment_1"
    // InternalMyDocker.g:3565:1: rule__ArgArgs__ValuesAssignment_1 : ( ruleNameVals ) ;
    public final void rule__ArgArgs__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3569:1: ( ( ruleNameVals ) )
            // InternalMyDocker.g:3570:2: ( ruleNameVals )
            {
            // InternalMyDocker.g:3570:2: ( ruleNameVals )
            // InternalMyDocker.g:3571:3: ruleNameVals
            {
             before(grammarAccess.getArgArgsAccess().getValuesNameValsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNameVals();

            state._fsp--;

             after(grammarAccess.getArgArgsAccess().getValuesNameValsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArgArgs__ValuesAssignment_1"


    // $ANTLR start "rule__HealthArgs__TypAssignment_0"
    // InternalMyDocker.g:3580:1: rule__HealthArgs__TypAssignment_0 : ( ( 'None' ) ) ;
    public final void rule__HealthArgs__TypAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3584:1: ( ( ( 'None' ) ) )
            // InternalMyDocker.g:3585:2: ( ( 'None' ) )
            {
            // InternalMyDocker.g:3585:2: ( ( 'None' ) )
            // InternalMyDocker.g:3586:3: ( 'None' )
            {
             before(grammarAccess.getHealthArgsAccess().getTypNoneKeyword_0_0()); 
            // InternalMyDocker.g:3587:3: ( 'None' )
            // InternalMyDocker.g:3588:4: 'None'
            {
             before(grammarAccess.getHealthArgsAccess().getTypNoneKeyword_0_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getHealthArgsAccess().getTypNoneKeyword_0_0()); 

            }

             after(grammarAccess.getHealthArgsAccess().getTypNoneKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HealthArgs__TypAssignment_0"


    // $ANTLR start "rule__HealthArgs__OptionsAssignment_1_0"
    // InternalMyDocker.g:3599:1: rule__HealthArgs__OptionsAssignment_1_0 : ( ruleOptions ) ;
    public final void rule__HealthArgs__OptionsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3603:1: ( ( ruleOptions ) )
            // InternalMyDocker.g:3604:2: ( ruleOptions )
            {
            // InternalMyDocker.g:3604:2: ( ruleOptions )
            // InternalMyDocker.g:3605:3: ruleOptions
            {
             before(grammarAccess.getHealthArgsAccess().getOptionsOptionsParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOptions();

            state._fsp--;

             after(grammarAccess.getHealthArgsAccess().getOptionsOptionsParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HealthArgs__OptionsAssignment_1_0"


    // $ANTLR start "rule__HealthArgs__CmdArgsAssignment_1_2"
    // InternalMyDocker.g:3614:1: rule__HealthArgs__CmdArgsAssignment_1_2 : ( ruleCommandArgs ) ;
    public final void rule__HealthArgs__CmdArgsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3618:1: ( ( ruleCommandArgs ) )
            // InternalMyDocker.g:3619:2: ( ruleCommandArgs )
            {
            // InternalMyDocker.g:3619:2: ( ruleCommandArgs )
            // InternalMyDocker.g:3620:3: ruleCommandArgs
            {
             before(grammarAccess.getHealthArgsAccess().getCmdArgsCommandArgsParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCommandArgs();

            state._fsp--;

             after(grammarAccess.getHealthArgsAccess().getCmdArgsCommandArgsParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HealthArgs__CmdArgsAssignment_1_2"


    // $ANTLR start "rule__Options__OptionsAssignment_1"
    // InternalMyDocker.g:3629:1: rule__Options__OptionsAssignment_1 : ( ruleOption ) ;
    public final void rule__Options__OptionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3633:1: ( ( ruleOption ) )
            // InternalMyDocker.g:3634:2: ( ruleOption )
            {
            // InternalMyDocker.g:3634:2: ( ruleOption )
            // InternalMyDocker.g:3635:3: ruleOption
            {
             before(grammarAccess.getOptionsAccess().getOptionsOptionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getOptionsAccess().getOptionsOptionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Options__OptionsAssignment_1"


    // $ANTLR start "rule__Option__OptionAssignment_1"
    // InternalMyDocker.g:3644:1: rule__Option__OptionAssignment_1 : ( RULE_ID ) ;
    public final void rule__Option__OptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3648:1: ( ( RULE_ID ) )
            // InternalMyDocker.g:3649:2: ( RULE_ID )
            {
            // InternalMyDocker.g:3649:2: ( RULE_ID )
            // InternalMyDocker.g:3650:3: RULE_ID
            {
             before(grammarAccess.getOptionAccess().getOptionIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOptionAccess().getOptionIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__OptionAssignment_1"


    // $ANTLR start "rule__Option__ValueAssignment_3"
    // InternalMyDocker.g:3659:1: rule__Option__ValueAssignment_3 : ( ruleValue ) ;
    public final void rule__Option__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3663:1: ( ( ruleValue ) )
            // InternalMyDocker.g:3664:2: ( ruleValue )
            {
            // InternalMyDocker.g:3664:2: ( ruleValue )
            // InternalMyDocker.g:3665:3: ruleValue
            {
             before(grammarAccess.getOptionAccess().getValueValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getOptionAccess().getValueValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__ValueAssignment_3"


    // $ANTLR start "rule__ExposeArgs__PortsAssignment"
    // InternalMyDocker.g:3674:1: rule__ExposeArgs__PortsAssignment : ( ruleExposeArg ) ;
    public final void rule__ExposeArgs__PortsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3678:1: ( ( ruleExposeArg ) )
            // InternalMyDocker.g:3679:2: ( ruleExposeArg )
            {
            // InternalMyDocker.g:3679:2: ( ruleExposeArg )
            // InternalMyDocker.g:3680:3: ruleExposeArg
            {
             before(grammarAccess.getExposeArgsAccess().getPortsExposeArgParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExposeArg();

            state._fsp--;

             after(grammarAccess.getExposeArgsAccess().getPortsExposeArgParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExposeArgs__PortsAssignment"


    // $ANTLR start "rule__ExposeArg__PortAssignment_0"
    // InternalMyDocker.g:3689:1: rule__ExposeArg__PortAssignment_0 : ( RULE_INT ) ;
    public final void rule__ExposeArg__PortAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3693:1: ( ( RULE_INT ) )
            // InternalMyDocker.g:3694:2: ( RULE_INT )
            {
            // InternalMyDocker.g:3694:2: ( RULE_INT )
            // InternalMyDocker.g:3695:3: RULE_INT
            {
             before(grammarAccess.getExposeArgAccess().getPortINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExposeArgAccess().getPortINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExposeArg__PortAssignment_0"


    // $ANTLR start "rule__ExposeArg__Port_protocolAssignment_1"
    // InternalMyDocker.g:3704:1: rule__ExposeArg__Port_protocolAssignment_1 : ( RULE_EXPOSE_PORT_PROTOCOL ) ;
    public final void rule__ExposeArg__Port_protocolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDocker.g:3708:1: ( ( RULE_EXPOSE_PORT_PROTOCOL ) )
            // InternalMyDocker.g:3709:2: ( RULE_EXPOSE_PORT_PROTOCOL )
            {
            // InternalMyDocker.g:3709:2: ( RULE_EXPOSE_PORT_PROTOCOL )
            // InternalMyDocker.g:3710:3: RULE_EXPOSE_PORT_PROTOCOL
            {
             before(grammarAccess.getExposeArgAccess().getPort_protocolEXPOSE_PORT_PROTOCOLTerminalRuleCall_1_0()); 
            match(input,RULE_EXPOSE_PORT_PROTOCOL,FOLLOW_2); 
             after(grammarAccess.getExposeArgAccess().getPort_protocolEXPOSE_PORT_PROTOCOLTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExposeArg__Port_protocolAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001FFFF40002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000182L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004070L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000002000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004072L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080002L});

}