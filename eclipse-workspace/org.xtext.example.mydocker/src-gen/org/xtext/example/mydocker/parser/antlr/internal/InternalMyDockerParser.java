package org.xtext.example.mydocker.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydocker.services.MyDockerGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDockerParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_RAW_VALUE", "RULE_INT", "RULE_EXPOSE_PORT_PROTOCOL", "RULE_SH_COMMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ADD'", "'ARG'", "'CMD'", "'COPY'", "'ENTRYPOINT'", "'ENV'", "'EXPOSE'", "'FROM'", "'HEALTHCHECK'", "'LABEL'", "'MAINTAINER'", "'ONBUILD'", "'RUN'", "'SHELL'", "'STOPSIGNAL'", "'USER'", "'VOLUME'", "'WORKDIR'", "'['", "','", "']'", "'='", "'None'", "'--'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=4;
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

        public InternalMyDockerParser(TokenStream input, MyDockerGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Docker";
       	}

       	@Override
       	protected MyDockerGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDocker"
    // InternalMyDocker.g:64:1: entryRuleDocker returns [EObject current=null] : iv_ruleDocker= ruleDocker EOF ;
    public final EObject entryRuleDocker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocker = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SH_COMMENT");

        try {
            // InternalMyDocker.g:66:2: (iv_ruleDocker= ruleDocker EOF )
            // InternalMyDocker.g:67:2: iv_ruleDocker= ruleDocker EOF
            {
             newCompositeNode(grammarAccess.getDockerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocker=ruleDocker();

            state._fsp--;

             current =iv_ruleDocker; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleDocker"


    // $ANTLR start "ruleDocker"
    // InternalMyDocker.g:76:1: ruleDocker returns [EObject current=null] : ( (lv_commands_0_0= ruleCommand ) )* ;
    public final EObject ruleDocker() throws RecognitionException {
        EObject current = null;

        EObject lv_commands_0_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SH_COMMENT");

        try {
            // InternalMyDocker.g:83:2: ( ( (lv_commands_0_0= ruleCommand ) )* )
            // InternalMyDocker.g:84:2: ( (lv_commands_0_0= ruleCommand ) )*
            {
            // InternalMyDocker.g:84:2: ( (lv_commands_0_0= ruleCommand ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=31)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDocker.g:85:3: (lv_commands_0_0= ruleCommand )
            	    {
            	    // InternalMyDocker.g:85:3: (lv_commands_0_0= ruleCommand )
            	    // InternalMyDocker.g:86:4: lv_commands_0_0= ruleCommand
            	    {

            	    				newCompositeNode(grammarAccess.getDockerAccess().getCommandsCommandParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_commands_0_0=ruleCommand();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDockerRule());
            	    				}
            	    				add(
            	    					current,
            	    					"commands",
            	    					lv_commands_0_0,
            	    					"org.xtext.example.mydocker.MyDocker.Command");
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleDocker"


    // $ANTLR start "entryRuleCommand"
    // InternalMyDocker.g:109:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalMyDocker.g:109:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalMyDocker.g:110:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalMyDocker.g:116:1: ruleCommand returns [EObject current=null] : (this_Add_0= ruleAdd | this_Arg_1= ruleArg | this_Cmd_2= ruleCmd | this_Copy_3= ruleCopy | this_Entrypoint_4= ruleEntrypoint | this_Env_5= ruleEnv | this_Expose_6= ruleExpose | this_From_7= ruleFrom | this_Healthcheck_8= ruleHealthcheck | this_Label_9= ruleLabel | this_Maintainer_10= ruleMaintainer | this_Onbuild_11= ruleOnbuild | this_Run_12= ruleRun | this_Shell_13= ruleShell | this_StopSignal_14= ruleStopSignal | this_User_15= ruleUser | this_Volume_16= ruleVolume | this_Workdir_17= ruleWorkdir ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Add_0 = null;

        EObject this_Arg_1 = null;

        EObject this_Cmd_2 = null;

        EObject this_Copy_3 = null;

        EObject this_Entrypoint_4 = null;

        EObject this_Env_5 = null;

        EObject this_Expose_6 = null;

        EObject this_From_7 = null;

        EObject this_Healthcheck_8 = null;

        EObject this_Label_9 = null;

        EObject this_Maintainer_10 = null;

        EObject this_Onbuild_11 = null;

        EObject this_Run_12 = null;

        EObject this_Shell_13 = null;

        EObject this_StopSignal_14 = null;

        EObject this_User_15 = null;

        EObject this_Volume_16 = null;

        EObject this_Workdir_17 = null;



        	enterRule();

        try {
            // InternalMyDocker.g:122:2: ( (this_Add_0= ruleAdd | this_Arg_1= ruleArg | this_Cmd_2= ruleCmd | this_Copy_3= ruleCopy | this_Entrypoint_4= ruleEntrypoint | this_Env_5= ruleEnv | this_Expose_6= ruleExpose | this_From_7= ruleFrom | this_Healthcheck_8= ruleHealthcheck | this_Label_9= ruleLabel | this_Maintainer_10= ruleMaintainer | this_Onbuild_11= ruleOnbuild | this_Run_12= ruleRun | this_Shell_13= ruleShell | this_StopSignal_14= ruleStopSignal | this_User_15= ruleUser | this_Volume_16= ruleVolume | this_Workdir_17= ruleWorkdir ) )
            // InternalMyDocker.g:123:2: (this_Add_0= ruleAdd | this_Arg_1= ruleArg | this_Cmd_2= ruleCmd | this_Copy_3= ruleCopy | this_Entrypoint_4= ruleEntrypoint | this_Env_5= ruleEnv | this_Expose_6= ruleExpose | this_From_7= ruleFrom | this_Healthcheck_8= ruleHealthcheck | this_Label_9= ruleLabel | this_Maintainer_10= ruleMaintainer | this_Onbuild_11= ruleOnbuild | this_Run_12= ruleRun | this_Shell_13= ruleShell | this_StopSignal_14= ruleStopSignal | this_User_15= ruleUser | this_Volume_16= ruleVolume | this_Workdir_17= ruleWorkdir )
            {
            // InternalMyDocker.g:123:2: (this_Add_0= ruleAdd | this_Arg_1= ruleArg | this_Cmd_2= ruleCmd | this_Copy_3= ruleCopy | this_Entrypoint_4= ruleEntrypoint | this_Env_5= ruleEnv | this_Expose_6= ruleExpose | this_From_7= ruleFrom | this_Healthcheck_8= ruleHealthcheck | this_Label_9= ruleLabel | this_Maintainer_10= ruleMaintainer | this_Onbuild_11= ruleOnbuild | this_Run_12= ruleRun | this_Shell_13= ruleShell | this_StopSignal_14= ruleStopSignal | this_User_15= ruleUser | this_Volume_16= ruleVolume | this_Workdir_17= ruleWorkdir )
            int alt2=18;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            case 17:
                {
                alt2=4;
                }
                break;
            case 18:
                {
                alt2=5;
                }
                break;
            case 19:
                {
                alt2=6;
                }
                break;
            case 20:
                {
                alt2=7;
                }
                break;
            case 21:
                {
                alt2=8;
                }
                break;
            case 22:
                {
                alt2=9;
                }
                break;
            case 23:
                {
                alt2=10;
                }
                break;
            case 24:
                {
                alt2=11;
                }
                break;
            case 25:
                {
                alt2=12;
                }
                break;
            case 26:
                {
                alt2=13;
                }
                break;
            case 27:
                {
                alt2=14;
                }
                break;
            case 28:
                {
                alt2=15;
                }
                break;
            case 29:
                {
                alt2=16;
                }
                break;
            case 30:
                {
                alt2=17;
                }
                break;
            case 31:
                {
                alt2=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDocker.g:124:3: this_Add_0= ruleAdd
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getAddParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Add_0=ruleAdd();

                    state._fsp--;


                    			current = this_Add_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDocker.g:133:3: this_Arg_1= ruleArg
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getArgParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Arg_1=ruleArg();

                    state._fsp--;


                    			current = this_Arg_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDocker.g:142:3: this_Cmd_2= ruleCmd
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getCmdParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Cmd_2=ruleCmd();

                    state._fsp--;


                    			current = this_Cmd_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDocker.g:151:3: this_Copy_3= ruleCopy
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getCopyParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Copy_3=ruleCopy();

                    state._fsp--;


                    			current = this_Copy_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDocker.g:160:3: this_Entrypoint_4= ruleEntrypoint
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getEntrypointParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entrypoint_4=ruleEntrypoint();

                    state._fsp--;


                    			current = this_Entrypoint_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDocker.g:169:3: this_Env_5= ruleEnv
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getEnvParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Env_5=ruleEnv();

                    state._fsp--;


                    			current = this_Env_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDocker.g:178:3: this_Expose_6= ruleExpose
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getExposeParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Expose_6=ruleExpose();

                    state._fsp--;


                    			current = this_Expose_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMyDocker.g:187:3: this_From_7= ruleFrom
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getFromParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_From_7=ruleFrom();

                    state._fsp--;


                    			current = this_From_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalMyDocker.g:196:3: this_Healthcheck_8= ruleHealthcheck
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getHealthcheckParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Healthcheck_8=ruleHealthcheck();

                    state._fsp--;


                    			current = this_Healthcheck_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalMyDocker.g:205:3: this_Label_9= ruleLabel
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getLabelParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Label_9=ruleLabel();

                    state._fsp--;


                    			current = this_Label_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalMyDocker.g:214:3: this_Maintainer_10= ruleMaintainer
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getMaintainerParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_Maintainer_10=ruleMaintainer();

                    state._fsp--;


                    			current = this_Maintainer_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalMyDocker.g:223:3: this_Onbuild_11= ruleOnbuild
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getOnbuildParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_Onbuild_11=ruleOnbuild();

                    state._fsp--;


                    			current = this_Onbuild_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalMyDocker.g:232:3: this_Run_12= ruleRun
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getRunParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_Run_12=ruleRun();

                    state._fsp--;


                    			current = this_Run_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalMyDocker.g:241:3: this_Shell_13= ruleShell
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getShellParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_Shell_13=ruleShell();

                    state._fsp--;


                    			current = this_Shell_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalMyDocker.g:250:3: this_StopSignal_14= ruleStopSignal
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getStopSignalParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_StopSignal_14=ruleStopSignal();

                    state._fsp--;


                    			current = this_StopSignal_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalMyDocker.g:259:3: this_User_15= ruleUser
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getUserParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_User_15=ruleUser();

                    state._fsp--;


                    			current = this_User_15;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 17 :
                    // InternalMyDocker.g:268:3: this_Volume_16= ruleVolume
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getVolumeParserRuleCall_16());
                    		
                    pushFollow(FOLLOW_2);
                    this_Volume_16=ruleVolume();

                    state._fsp--;


                    			current = this_Volume_16;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 18 :
                    // InternalMyDocker.g:277:3: this_Workdir_17= ruleWorkdir
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getWorkdirParserRuleCall_17());
                    		
                    pushFollow(FOLLOW_2);
                    this_Workdir_17=ruleWorkdir();

                    state._fsp--;


                    			current = this_Workdir_17;
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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleAdd"
    // InternalMyDocker.g:289:1: entryRuleAdd returns [EObject current=null] : iv_ruleAdd= ruleAdd EOF ;
    public final EObject entryRuleAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdd = null;


        try {
            // InternalMyDocker.g:289:44: (iv_ruleAdd= ruleAdd EOF )
            // InternalMyDocker.g:290:2: iv_ruleAdd= ruleAdd EOF
            {
             newCompositeNode(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdd=ruleAdd();

            state._fsp--;

             current =iv_ruleAdd; 
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
    // $ANTLR end "entryRuleAdd"


    // $ANTLR start "ruleAdd"
    // InternalMyDocker.g:296:1: ruleAdd returns [EObject current=null] : ( ( (lv_cmd_0_0= 'ADD' ) ) ( (lv_args_1_0= ruleCommandArgs ) ) ) ;
    public final EObject ruleAdd() throws RecognitionException {
        EObject current = null;

        Token lv_cmd_0_0=null;
        EObject lv_args_1_0 = null;



        	enterRule();

        try {
            // InternalMyDocker.g:302:2: ( ( ( (lv_cmd_0_0= 'ADD' ) ) ( (lv_args_1_0= ruleCommandArgs ) ) ) )
            // InternalMyDocker.g:303:2: ( ( (lv_cmd_0_0= 'ADD' ) ) ( (lv_args_1_0= ruleCommandArgs ) ) )
            {
            // InternalMyDocker.g:303:2: ( ( (lv_cmd_0_0= 'ADD' ) ) ( (lv_args_1_0= ruleCommandArgs ) ) )
            // InternalMyDocker.g:304:3: ( (lv_cmd_0_0= 'ADD' ) ) ( (lv_args_1_0= ruleCommandArgs ) )
            {
            // InternalMyDocker.g:304:3: ( (lv_cmd_0_0= 'ADD' ) )
            // InternalMyDocker.g:305:4: (lv_cmd_0_0= 'ADD' )
            {
            // InternalMyDocker.g:305:4: (lv_cmd_0_0= 'ADD' )
            // InternalMyDocker.g:306:5: lv_cmd_0_0= 'ADD'
            {
            lv_cmd_0_0=(Token)match(input,14,FOLLOW_4); 

            					newLeafNode(lv_cmd_0_0, grammarAccess.getAddAccess().getCmdADDKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddRule());
            					}
            					setWithLastConsumed(current, "cmd", lv_cmd_0_0, "ADD");
            				

            }


            }

            // InternalMyDocker.g:318:3: ( (lv_args_1_0= ruleCommandArgs ) )
            // InternalMyDocker.g:319:4: (lv_args_1_0= ruleCommandArgs )
            {
            // InternalMyDocker.g:319:4: (lv_args_1_0= ruleCommandArgs )
            // InternalMyDocker.g:320:5: lv_args_1_0= ruleCommandArgs
            {

            					newCompositeNode(grammarAccess.getAddAccess().getArgsCommandArgsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_args_1_0=ruleCommandArgs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddRule());
            					}
            					set(
            						current,
            						"args",
            						lv_args_1_0,
            						"org.xtext.example.mydocker.MyDocker.CommandArgs");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleAdd"


    // $ANTLR start "entryRuleArg"
    // InternalMyDocker.g:341:1: entryRuleArg returns [EObject current=null] : iv_ruleArg= ruleArg EOF ;
    public final EObject entryRuleArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArg = null;


        try {
            // InternalMyDocker.g:341:44: (iv_ruleArg= ruleArg EOF )
            // InternalMyDocker.g:342:2: iv_ruleArg= ruleArg EOF
            {
             newCompositeNode(grammarAccess.getArgRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArg=ruleArg();

            state._fsp--;

             current =iv_ruleArg; 
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
    // $ANTLR end "entryRuleArg"


    // $ANTLR start "ruleArg"
    // InternalMyDocker.g:348:1: ruleArg returns [EObject current=null] : ( ( (lv_cmd_0_0= 'ARG' ) ) ( (lv_args_1_0= ruleArgArgs ) ) ) ;
    public final EObject ruleArg() throws RecognitionException {
        EObject current = null;

        Token lv_cmd_0_0=null;
        EObject lv_args_1_0 = null;



        	enterRule();

        try {
            // InternalMyDocker.g:354:2: ( ( ( (lv_cmd_0_0= 'ARG' ) ) ( (lv_args_1_0= ruleArgArgs ) ) ) )
            // InternalMyDocker.g:355:2: ( ( (lv_cmd_0_0= 'ARG' ) ) ( (lv_args_1_0= ruleArgArgs ) ) )
            {
            // InternalMyDocker.g:355:2: ( ( (lv_cmd_0_0= 'ARG' ) ) ( (lv_args_1_0= ruleArgArgs ) ) )
            // InternalMyDocker.g:356:3: ( (lv_cmd_0_0= 'ARG' ) ) ( (lv_args_1_0= ruleArgArgs ) )
            {
            // InternalMyDocker.g:356:3: ( (lv_cmd_0_0= 'ARG' ) )
            // InternalMyDocker.g:357:4: (lv_cmd_0_0= 'ARG' )
            {
            // InternalMyDocker.g:357:4: (lv_cmd_0_0= 'ARG' )
            // InternalMyDocker.g:358:5: lv_cmd_0_0= 'ARG'
            {
            lv_cmd_0_0=(Token)match(input,15,FOLLOW_4); 

            					newLeafNode(lv_cmd_0_0, grammarAccess.getArgAccess().getCmdARGKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArgRule());
            					}
            					setWithLastConsumed(current, "cmd", lv_cmd_0_0, "ARG");
            				

            }


            }

            // InternalMyDocker.g:370:3: ( (lv_args_1_0= ruleArgArgs ) )
            // InternalMyDocker.g:371:4: (lv_args_1_0= ruleArgArgs )
            {
            // InternalMyDocker.g:371:4: (lv_args_1_0= ruleArgArgs )
            // InternalMyDocker.g:372:5: lv_args_1_0= ruleArgArgs
            {

            					newCompositeNode(grammarAccess.getArgAccess().getArgsArgArgsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_args_1_0=ruleArgArgs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArgRule());
            					}
            					set(
            						current,
            						"args",
            						lv_args_1_0,
            						"org.xtext.example.mydocker.MyDocker.ArgArgs");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleArg"


    // $ANTLR start "entryRuleCmd"
    // InternalMyDocker.g:393:1: entryRuleCmd returns [EObject current=null] : iv_ruleCmd= ruleCmd EOF ;
    public final EObject entryRuleCmd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCmd = null;


        try {
            // InternalMyDocker.g:393:44: (iv_ruleCmd= ruleCmd EOF )
            // InternalMyDocker.g:394:2: iv_ruleCmd= ruleCmd EOF
            {
             newCompositeNode(grammarAccess.getCmdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCmd=ruleCmd();

            state._fsp--;

             current =iv_ruleCmd; 
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
    // $ANTLR end "entryRuleCmd"


    // $ANTLR start "ruleCmd"
    // InternalMyDocker.g:400:1: ruleCmd returns [EObject current=null] : ( ( (lv_cmd_0_0= 'CMD' ) ) ( (lv_args_1_0= ruleCommandArgs ) ) ) ;
    public final EObject ruleCmd() throws RecognitionException {
        EObject current = null;

        Token lv_cmd_0_0=null;
        EObject lv_args_1_0 = null;



        	enterRule();

        try {
            // InternalMyDocker.g:406:2: ( ( ( (lv_cmd_0_0= 'CMD' ) ) ( (lv_args_1_0= ruleCommandArgs ) ) ) )
            // InternalMyDocker.g:407:2: ( ( (lv_cmd_0_0= 'CMD' ) ) ( (lv_args_1_0= ruleCommandArgs ) ) )
            {
            // InternalMyDocker.g:407:2: ( ( (lv_cmd_0_0= 'CMD' ) ) ( (lv_args_1_0= ruleCommandArgs ) ) )
            // InternalMyDocker.g:408:3: ( (lv_cmd_0_0= 'CMD' ) ) ( (lv_args_1_0= ruleCommandArgs ) )
            {
            // InternalMyDocker.g:408:3: ( (lv_cmd_0_0= 'CMD' ) )
            // InternalMyDocker.g:409:4: (lv_cmd_0_0= 'CMD' )
            {
            // InternalMyDocker.g:409:4: (lv_cmd_0_0= 'CMD' )
            // InternalMyDocker.g:410:5: lv_cmd_0_0= 'CMD'
            {
            lv_cmd_0_0=(Token)match(input,16,FOLLOW_4); 

            					newLeafNode(lv_cmd_0_0, grammarAccess.getCmdAccess().getCmdCMDKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCmdRule());
            					}
            					setWithLastConsumed(current, "cmd", lv_cmd_0_0, "CMD");
            				

            }


            }

            // InternalMyDocker.g:422:3: ( (lv_args_1_0= ruleCommandArgs ) )
            // InternalMyDocker.g:423:4: (lv_args_1_0= ruleCommandArgs )
            {
            // InternalMyDocker.g:423:4: (lv_args_1_0= ruleCommandArgs )
            // InternalMyDocker.g:424:5: lv_args_1_0= ruleCommandArgs
            {

            					newCompositeNode(grammarAccess.getCmdAccess().getArgsCommandArgsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_args_1_0=ruleCommandArgs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCmdRule());
            					}
            					set(
            						current,
            						"args",
            						lv_args_1_0,
            						"org.xtext.example.mydocker.MyDocker.CommandArgs");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleCmd"


    // $ANTLR start "entryRuleCopy"
    // InternalMyDocker.g:445:1: entryRuleCopy returns [EObject current=null] : iv_ruleCopy= ruleCopy EOF ;
    public final EObject entryRuleCopy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCopy = null;


        try {
            // InternalMyDocker.g:445:45: (iv_ruleCopy= ruleCopy EOF )
            // InternalMyDocker.g:446:2: iv_ruleCopy= ruleCopy EOF
            {
             newCompositeNode(grammarAccess.getCopyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCopy=ruleCopy();

            state._fsp--;

             current =iv_ruleCopy; 
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
    // $ANTLR end "entryRuleCopy"


    // $ANTLR start "ruleCopy"
    // InternalMyDocker.g:452:1: ruleCopy returns [EObject current=null] : ( ( (lv_cmd_0_0= 'COPY' ) ) ( (lv_args_1_0= ruleCommandArgs ) ) ) ;
    public final EObject ruleCopy() throws RecognitionException {
        EObject current = null;

        Token lv_cmd_0_0=null;
        EObject lv_args_1_0 = null;



        	enterRule();

        try {
            // InternalMyDocker.g:458:2: ( ( ( (lv_cmd_0_0= 'COPY' ) ) ( (lv_args_1_0= ruleCommandArgs ) ) ) )
            // InternalMyDocker.g:459:2: ( ( (lv_cmd_0_0= 'COPY' ) ) ( (lv_args_1_0= ruleCommandArgs ) ) )
            {
            // InternalMyDocker.g:459:2: ( ( (lv_cmd_0_0= 'COPY' ) ) ( (lv_args_1_0= ruleCommandArgs ) ) )
            // InternalMyDocker.g:460:3: ( (lv_cmd_0_0= 'COPY' ) ) ( (lv_args_1_0= ruleCommandArgs ) )
            {
            // InternalMyDocker.g:460:3: ( (lv_cmd_0_0= 'COPY' ) )
            // InternalMyDocker.g:461:4: (lv_cmd_0_0= 'COPY' )
            {
            // InternalMyDocker.g:461:4: (lv_cmd_0_0= 'COPY' )
            // InternalMyDocker.g:462:5: lv_cmd_0_0= 'COPY'
            {
            lv_cmd_0_0=(Token)match(input,17,FOLLOW_4); 

            					newLeafNode(lv_cmd_0_0, grammarAccess.getCopyAccess().getCmdCOPYKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCopyRule());
            					}
            					setWithLastConsumed(current, "cmd", lv_cmd_0_0, "COPY");
            				

            }


            }

            // InternalMyDocker.g:474:3: ( (lv_args_1_0= ruleCommandArgs ) )
            // InternalMyDocker.g:475:4: (lv_args_1_0= ruleCommandArgs )
            {
            // InternalMyDocker.g:475:4: (lv_args_1_0= ruleCommandArgs )
            // InternalMyDocker.g:476:5: lv_args_1_0= ruleCommandArgs
            {

            					newCompositeNode(grammarAccess.getCopyAccess().getArgsCommandArgsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_args_1_0=ruleCommandArgs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCopyRule());
            					}
            					set(
            						current,
            						"args",
            						lv_args_1_0,
            						"org.xtext.example.mydocker.MyDocker.CommandArgs");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleCopy"


    // $ANTLR start "entryRuleEntrypoint"
    // InternalMyDocker.g:497:1: entryRuleEntrypoint returns [EObject current=null] : iv_ruleEntrypoint= ruleEntrypoint EOF ;
    public final EObject entryRuleEntrypoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntrypoint = null;


        try {
            // InternalMyDocker.g:497:51: (iv_ruleEntrypoint= ruleEntrypoint EOF )
            // InternalMyDocker.g:498:2: iv_ruleEntrypoint= ruleEntrypoint EOF
            {
             newCompositeNode(grammarAccess.getEntrypointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntrypoint=ruleEntrypoint();

            state._fsp--;

             current =iv_ruleEntrypoint; 
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
    // $ANTLR end "entryRuleEntrypoint"


    // $ANTLR start "ruleEntrypoint"
    // InternalMyDocker.g:504:1: ruleEntrypoint returns [EObject current=null] : ( ( (lv_cmd_0_0= 'ENTRYPOINT' ) ) ( (lv_args_1_0= ruleJSONArgs ) ) ) ;
    public final EObject ruleEntrypoint() throws RecognitionException {
        EObject current = null;

        Token lv_cmd_0_0=null;
        EObject lv_args_1_0 = null;



        	enterRule();

        try {
            // InternalMyDocker.g:510:2: ( ( ( (lv_cmd_0_0= 'ENTRYPOINT' ) ) ( (lv_args_1_0= ruleJSONArgs ) ) ) )
            // InternalMyDocker.g:511:2: ( ( (lv_cmd_0_0= 'ENTRYPOINT' ) ) ( (lv_args_1_0= ruleJSONArgs ) ) )
            {
            // InternalMyDocker.g:511:2: ( ( (lv_cmd_0_0= 'ENTRYPOINT' ) ) ( (lv_args_1_0= ruleJSONArgs ) ) )
            // InternalMyDocker.g:512:3: ( (lv_cmd_0_0= 'ENTRYPOINT' ) ) ( (lv_args_1_0= ruleJSONArgs ) )
            {
            // InternalMyDocker.g:512:3: ( (lv_cmd_0_0= 'ENTRYPOINT' ) )
            // InternalMyDocker.g:513:4: (lv_cmd_0_0= 'ENTRYPOINT' )
            {
            // InternalMyDocker.g:513:4: (lv_cmd_0_0= 'ENTRYPOINT' )
            // InternalMyDocker.g:514:5: lv_cmd_0_0= 'ENTRYPOINT'
            {
            lv_cmd_0_0=(Token)match(input,18,FOLLOW_5); 

            					newLeafNode(lv_cmd_0_0, grammarAccess.getEntrypointAccess().getCmdENTRYPOINTKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntrypointRule());
            					}
            					setWithLastConsumed(current, "cmd", lv_cmd_0_0, "ENTRYPOINT");
            				

            }


            }

            // InternalMyDocker.g:526:3: ( (lv_args_1_0= ruleJSONArgs ) )
            // InternalMyDocker.g:527:4: (lv_args_1_0= ruleJSONArgs )
            {
            // InternalMyDocker.g:527:4: (lv_args_1_0= ruleJSONArgs )
            // InternalMyDocker.g:528:5: lv_args_1_0= ruleJSONArgs
            {

            					newCompositeNode(grammarAccess.getEntrypointAccess().getArgsJSONArgsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_args_1_0=ruleJSONArgs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntrypointRule());
            					}
            					set(
            						current,
            						"args",
            						lv_args_1_0,
            						"org.xtext.example.mydocker.MyDocker.JSONArgs");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleEntrypoint"


    // $ANTLR start "entryRuleEnv"
    // InternalMyDocker.g:549:1: entryRuleEnv returns [EObject current=null] : iv_ruleEnv= ruleEnv EOF ;
    public final EObject entryRuleEnv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnv = null;


        try {
            // InternalMyDocker.g:549:44: (iv_ruleEnv= ruleEnv EOF )
            // InternalMyDocker.g:550:2: iv_ruleEnv= ruleEnv EOF
            {
             newCompositeNode(grammarAccess.getEnvRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnv=ruleEnv();

            state._fsp--;

             current =iv_ruleEnv; 
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
    // $ANTLR end "entryRuleEnv"


    // $ANTLR start "ruleEnv"
    // InternalMyDocker.g:556:1: ruleEnv returns [EObject current=null] : ( ( (lv_cmd_0_0= 'ENV' ) ) ( (lv_args_1_0= ruleNameVals ) ) ) ;
    public final EObject ruleEnv() throws RecognitionException {
        EObject current = null;

        Token lv_cmd_0_0=null;
        EObject lv_args_1_0 = null;



        	enterRule();

        try {
            // InternalMyDocker.g:562:2: ( ( ( (lv_cmd_0_0= 'ENV' ) ) ( (lv_args_1_0= ruleNameVals ) ) ) )
            // InternalMyDocker.g:563:2: ( ( (lv_cmd_0_0= 'ENV' ) ) ( (lv_args_1_0= ruleNameVals ) ) )
            {
            // InternalMyDocker.g:563:2: ( ( (lv_cmd_0_0= 'ENV' ) ) ( (lv_args_1_0= ruleNameVals ) ) )
            // InternalMyDocker.g:564:3: ( (lv_cmd_0_0= 'ENV' ) ) ( (lv_args_1_0= ruleNameVals ) )
            {
            // InternalMyDocker.g:564:3: ( (lv_cmd_0_0= 'ENV' ) )
            // InternalMyDocker.g:565:4: (lv_cmd_0_0= 'ENV' )
            {
            // InternalMyDocker.g:565:4: (lv_cmd_0_0= 'ENV' )
            // InternalMyDocker.g:566:5: lv_cmd_0_0= 'ENV'
            {
            lv_cmd_0_0=(Token)match(input,19,FOLLOW_4); 

            					newLeafNode(lv_cmd_0_0, grammarAccess.getEnvAccess().getCmdENVKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnvRule());
            					}
            					setWithLastConsumed(current, "cmd", lv_cmd_0_0, "ENV");
            				

            }


            }

            // InternalMyDocker.g:578:3: ( (lv_args_1_0= ruleNameVals ) )
            // InternalMyDocker.g:579:4: (lv_args_1_0= ruleNameVals )
            {
            // InternalMyDocker.g:579:4: (lv_args_1_0= ruleNameVals )
            // InternalMyDocker.g:580:5: lv_args_1_0= ruleNameVals
            {

            					newCompositeNode(grammarAccess.getEnvAccess().getArgsNameValsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_args_1_0=ruleNameVals();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnvRule());
            					}
            					set(
            						current,
            						"args",
            						lv_args_1_0,
            						"org.xtext.example.mydocker.MyDocker.NameVals");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleEnv"


    // $ANTLR start "entryRuleExpose"
    // InternalMyDocker.g:601:1: entryRuleExpose returns [EObject current=null] : iv_ruleExpose= ruleExpose EOF ;
    public final EObject entryRuleExpose() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpose = null;


        try {
            // InternalMyDocker.g:601:47: (iv_ruleExpose= ruleExpose EOF )
            // InternalMyDocker.g:602:2: iv_ruleExpose= ruleExpose EOF
            {
             newCompositeNode(grammarAccess.getExposeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpose=ruleExpose();

            state._fsp--;

             current =iv_ruleExpose; 
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
    // $ANTLR end "entryRuleExpose"


    // $ANTLR start "ruleExpose"
    // InternalMyDocker.g:608:1: ruleExpose returns [EObject current=null] : ( ( (lv_cmd_0_0= 'EXPOSE' ) ) ( (lv_args_1_0= ruleExposeArgs ) ) ) ;
    public final EObject ruleExpose() throws RecognitionException {
        EObject current = null;

        Token lv_cmd_0_0=null;
        EObject lv_args_1_0 = null;



        	enterRule();

        try {
            // InternalMyDocker.g:614:2: ( ( ( (lv_cmd_0_0= 'EXPOSE' ) ) ( (lv_args_1_0= ruleExposeArgs ) ) ) )
            // InternalMyDocker.g:615:2: ( ( (lv_cmd_0_0= 'EXPOSE' ) ) ( (lv_args_1_0= ruleExposeArgs ) ) )
            {
            // InternalMyDocker.g:615:2: ( ( (lv_cmd_0_0= 'EXPOSE' ) ) ( (lv_args_1_0= ruleExposeArgs ) ) )
            // InternalMyDocker.g:616:3: ( (lv_cmd_0_0= 'EXPOSE' ) ) ( (lv_args_1_0= ruleExposeArgs ) )
            {
            // InternalMyDocker.g:616:3: ( (lv_cmd_0_0= 'EXPOSE' ) )
            // InternalMyDocker.g:617:4: (lv_cmd_0_0= 'EXPOSE' )
            {
            // InternalMyDocker.g:617:4: (lv_cmd_0_0= 'EXPOSE' )
            // InternalMyDocker.g:618:5: lv_cmd_0_0= 'EXPOSE'
            {
            lv_cmd_0_0=(Token)match(input,20,FOLLOW_6); 

            					newLeafNode(lv_cmd_0_0, grammarAccess.getExposeAccess().getCmdEXPOSEKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExposeRule());
            					}
            					setWithLastConsumed(current, "cmd", lv_cmd_0_0, "EXPOSE");
            				

            }


            }

            // InternalMyDocker.g:630:3: ( (lv_args_1_0= ruleExposeArgs ) )
            // InternalMyDocker.g:631:4: (lv_args_1_0= ruleExposeArgs )
            {
            // InternalMyDocker.g:631:4: (lv_args_1_0= ruleExposeArgs )
            // InternalMyDocker.g:632:5: lv_args_1_0= ruleExposeArgs
            {

            					newCompositeNode(grammarAccess.getExposeAccess().getArgsExposeArgsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_args_1_0=ruleExposeArgs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExposeRule());
            					}
            					set(
            						current,
            						"args",
            						lv_args_1_0,
            						"org.xtext.example.mydocker.MyDocker.ExposeArgs");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleExpose"


    // $ANTLR start "entryRuleFrom"
    // InternalMyDocker.g:653:1: entryRuleFrom returns [EObject current=null] : iv_ruleFrom= ruleFrom EOF ;
    public final EObject entryRuleFrom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrom = null;


        try {
            // InternalMyDocker.g:653:45: (iv_ruleFrom= ruleFrom EOF )
            // InternalMyDocker.g:654:2: iv_ruleFrom= ruleFrom EOF
            {
             newCompositeNode(grammarAccess.getFromRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFrom=ruleFrom();

            state._fsp--;

             current =iv_ruleFrom; 
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
    // $ANTLR end "entryRuleFrom"


    // $ANTLR start "ruleFrom"
    // InternalMyDocker.g:660:1: ruleFrom returns [EObject current=null] : ( ( (lv_cmd_0_0= 'FROM' ) ) ( (lv_args_1_0= ruleCommandArgs ) ) ) ;
    public final EObject ruleFrom() throws RecognitionException {
        EObject current = null;

        Token lv_cmd_0_0=null;
        EObject lv_args_1_0 = null;



        	enterRule();

        try {
            // InternalMyDocker.g:666:2: ( ( ( (lv_cmd_0_0= 'FROM' ) ) ( (lv_args_1_0= ruleCommandArgs ) ) ) )
            // InternalMyDocker.g:667:2: ( ( (lv_cmd_0_0= 'FROM' ) ) ( (lv_args_1_0= ruleCommandArgs ) ) )
            {
            // InternalMyDocker.g:667:2: ( ( (lv_cmd_0_0= 'FROM' ) ) ( (lv_args_1_0= ruleCommandArgs ) ) )
            // InternalMyDocker.g:668:3: ( (lv_cmd_0_0= 'FROM' ) ) ( (lv_args_1_0= ruleCommandArgs ) )
            {
            // InternalMyDocker.g:668:3: ( (lv_cmd_0_0= 'FROM' ) )
            // InternalMyDocker.g:669:4: (lv_cmd_0_0= 'FROM' )
            {
            // InternalMyDocker.g:669:4: (lv_cmd_0_0= 'FROM' )
            // InternalMyDocker.g:670:5: lv_cmd_0_0= 'FROM'
            {
            lv_cmd_0_0=(Token)match(input,21,FOLLOW_4); 

            					newLeafNode(lv_cmd_0_0, grammarAccess.getFromAccess().getCmdFROMKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFromRule());
            					}
            					setWithLastConsumed(current, "cmd", lv_cmd_0_0, "FROM");
            				

            }


            }

            // InternalMyDocker.g:682:3: ( (lv_args_1_0= ruleCommandArgs ) )
            // InternalMyDocker.g:683:4: (lv_args_1_0= ruleCommandArgs )
            {
            // InternalMyDocker.g:683:4: (lv_args_1_0= ruleCommandArgs )
            // InternalMyDocker.g:684:5: lv_args_1_0= ruleCommandArgs
            {

            					newCompositeNode(grammarAccess.getFromAccess().getArgsCommandArgsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_args_1_0=ruleCommandArgs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFromRule());
            					}
            					set(
            						current,
            						"args",
            						lv_args_1_0,
            						"org.xtext.example.mydocker.MyDocker.CommandArgs");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleFrom"


    // $ANTLR start "entryRuleHealthcheck"
    // InternalMyDocker.g:705:1: entryRuleHealthcheck returns [EObject current=null] : iv_ruleHealthcheck= ruleHealthcheck EOF ;
    public final EObject entryRuleHealthcheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHealthcheck = null;


        try {
            // InternalMyDocker.g:705:52: (iv_ruleHealthcheck= ruleHealthcheck EOF )
            // InternalMyDocker.g:706:2: iv_ruleHealthcheck= ruleHealthcheck EOF
            {
             newCompositeNode(grammarAccess.getHealthcheckRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHealthcheck=ruleHealthcheck();

            state._fsp--;

             current =iv_ruleHealthcheck; 
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
    // $ANTLR end "entryRuleHealthcheck"


    // $ANTLR start "ruleHealthcheck"
    // InternalMyDocker.g:712:1: ruleHealthcheck returns [EObject current=null] : ( ( (lv_cmd_0_0= 'HEALTHCHECK' ) ) ( (lv_args_1_0= ruleHealthArgs ) ) ) ;
    public final EObject ruleHealthcheck() throws RecognitionException {
        EObject current = null;

        Token lv_cmd_0_0=null;
        EObject lv_args_1_0 = null;



        	enterRule();

        try {
            // InternalMyDocker.g:718:2: ( ( ( (lv_cmd_0_0= 'HEALTHCHECK' ) ) ( (lv_args_1_0= ruleHealthArgs ) ) ) )
            // InternalMyDocker.g:719:2: ( ( (lv_cmd_0_0= 'HEALTHCHECK' ) ) ( (lv_args_1_0= ruleHealthArgs ) ) )
            {
            // InternalMyDocker.g:719:2: ( ( (lv_cmd_0_0= 'HEALTHCHECK' ) ) ( (lv_args_1_0= ruleHealthArgs ) ) )
            // InternalMyDocker.g:720:3: ( (lv_cmd_0_0= 'HEALTHCHECK' ) ) ( (lv_args_1_0= ruleHealthArgs ) )
            {
            // InternalMyDocker.g:720:3: ( (lv_cmd_0_0= 'HEALTHCHECK' ) )
            // InternalMyDocker.g:721:4: (lv_cmd_0_0= 'HEALTHCHECK' )
            {
            // InternalMyDocker.g:721:4: (lv_cmd_0_0= 'HEALTHCHECK' )
            // InternalMyDocker.g:722:5: lv_cmd_0_0= 'HEALTHCHECK'
            {
            lv_cmd_0_0=(Token)match(input,22,FOLLOW_7); 

            					newLeafNode(lv_cmd_0_0, grammarAccess.getHealthcheckAccess().getCmdHEALTHCHECKKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHealthcheckRule());
            					}
            					setWithLastConsumed(current, "cmd", lv_cmd_0_0, "HEALTHCHECK");
            				

            }


            }

            // InternalMyDocker.g:734:3: ( (lv_args_1_0= ruleHealthArgs ) )
            // InternalMyDocker.g:735:4: (lv_args_1_0= ruleHealthArgs )
            {
            // InternalMyDocker.g:735:4: (lv_args_1_0= ruleHealthArgs )
            // InternalMyDocker.g:736:5: lv_args_1_0= ruleHealthArgs
            {

            					newCompositeNode(grammarAccess.getHealthcheckAccess().getArgsHealthArgsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_args_1_0=ruleHealthArgs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHealthcheckRule());
            					}
            					set(
            						current,
            						"args",
            						lv_args_1_0,
            						"org.xtext.example.mydocker.MyDocker.HealthArgs");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleHealthcheck"


    // $ANTLR start "entryRuleLabel"
    // InternalMyDocker.g:757:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalMyDocker.g:757:46: (iv_ruleLabel= ruleLabel EOF )
            // InternalMyDocker.g:758:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalMyDocker.g:764:1: ruleLabel returns [EObject current=null] : ( ( (lv_cmd_0_0= 'LABEL' ) ) ( (lv_args_1_0= ruleNameVals ) ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token lv_cmd_0_0=null;
        EObject lv_args_1_0 = null;



        	enterRule();

        try {
            // InternalMyDocker.g:770:2: ( ( ( (lv_cmd_0_0= 'LABEL' ) ) ( (lv_args_1_0= ruleNameVals ) ) ) )
            // InternalMyDocker.g:771:2: ( ( (lv_cmd_0_0= 'LABEL' ) ) ( (lv_args_1_0= ruleNameVals ) ) )
            {
            // InternalMyDocker.g:771:2: ( ( (lv_cmd_0_0= 'LABEL' ) ) ( (lv_args_1_0= ruleNameVals ) ) )
            // InternalMyDocker.g:772:3: ( (lv_cmd_0_0= 'LABEL' ) ) ( (lv_args_1_0= ruleNameVals ) )
            {
            // InternalMyDocker.g:772:3: ( (lv_cmd_0_0= 'LABEL' ) )
            // InternalMyDocker.g:773:4: (lv_cmd_0_0= 'LABEL' )
            {
            // InternalMyDocker.g:773:4: (lv_cmd_0_0= 'LABEL' )
            // InternalMyDocker.g:774:5: lv_cmd_0_0= 'LABEL'
            {
            lv_cmd_0_0=(Token)match(input,23,FOLLOW_4); 

            					newLeafNode(lv_cmd_0_0, grammarAccess.getLabelAccess().getCmdLABELKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLabelRule());
            					}
            					setWithLastConsumed(current, "cmd", lv_cmd_0_0, "LABEL");
            				

            }


            }

            // InternalMyDocker.g:786:3: ( (lv_args_1_0= ruleNameVals ) )
            // InternalMyDocker.g:787:4: (lv_args_1_0= ruleNameVals )
            {
            // InternalMyDocker.g:787:4: (lv_args_1_0= ruleNameVals )
            // InternalMyDocker.g:788:5: lv_args_1_0= ruleNameVals
            {

            					newCompositeNode(grammarAccess.getLabelAccess().getArgsNameValsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_args_1_0=ruleNameVals();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLabelRule());
            					}
            					set(
            						current,
            						"args",
            						lv_args_1_0,
            						"org.xtext.example.mydocker.MyDocker.NameVals");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleMaintainer"
    // InternalMyDocker.g:809:1: entryRuleMaintainer returns [EObject current=null] : iv_ruleMaintainer= ruleMaintainer EOF ;
    public final EObject entryRuleMaintainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaintainer = null;


        try {
            // InternalMyDocker.g:809:51: (iv_ruleMaintainer= ruleMaintainer EOF )
            // InternalMyDocker.g:810:2: iv_ruleMaintainer= ruleMaintainer EOF
            {
             newCompositeNode(grammarAccess.getMaintainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaintainer=ruleMaintainer();

            state._fsp--;

             current =iv_ruleMaintainer; 
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
    // $ANTLR end "entryRuleMaintainer"


    // $ANTLR start "ruleMaintainer"
    // InternalMyDocker.g:816:1: ruleMaintainer returns [EObject current=null] : ( ( (lv_cmd_0_0= 'MAINTAINER' ) ) ( (lv_args_1_0= ruleValue ) ) ) ;
    public final EObject ruleMaintainer() throws RecognitionException {
        EObject current = null;

        Token lv_cmd_0_0=null;
        AntlrDatatypeRuleToken lv_args_1_0 = null;



        	enterRule();

        try {
            // InternalMyDocker.g:822:2: ( ( ( (lv_cmd_0_0= 'MAINTAINER' ) ) ( (lv_args_1_0= ruleValue ) ) ) )
            // InternalMyDocker.g:823:2: ( ( (lv_cmd_0_0= 'MAINTAINER' ) ) ( (lv_args_1_0= ruleValue ) ) )
            {
            // InternalMyDocker.g:823:2: ( ( (lv_cmd_0_0= 'MAINTAINER' ) ) ( (lv_args_1_0= ruleValue ) ) )
            // InternalMyDocker.g:824:3: ( (lv_cmd_0_0= 'MAINTAINER' ) ) ( (lv_args_1_0= ruleValue ) )
            {
            // InternalMyDocker.g:824:3: ( (lv_cmd_0_0= 'MAINTAINER' ) )
            // InternalMyDocker.g:825:4: (lv_cmd_0_0= 'MAINTAINER' )
            {
            // InternalMyDocker.g:825:4: (lv_cmd_0_0= 'MAINTAINER' )
            // InternalMyDocker.g:826:5: lv_cmd_0_0= 'MAINTAINER'
            {
            lv_cmd_0_0=(Token)match(input,24,FOLLOW_4); 

            					newLeafNode(lv_cmd_0_0, grammarAccess.getMaintainerAccess().getCmdMAINTAINERKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaintainerRule());
            					}
            					setWithLastConsumed(current, "cmd", lv_cmd_0_0, "MAINTAINER");
            				

            }


            }

            // InternalMyDocker.g:838:3: ( (lv_args_1_0= ruleValue ) )
            // InternalMyDocker.g:839:4: (lv_args_1_0= ruleValue )
            {
            // InternalMyDocker.g:839:4: (lv_args_1_0= ruleValue )
            // InternalMyDocker.g:840:5: lv_args_1_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getMaintainerAccess().getArgsValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_args_1_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaintainerRule());
            					}
            					set(
            						current,
            						"args",
            						lv_args_1_0,
            						"org.xtext.example.mydocker.MyDocker.Value");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleMaintainer"


    // $ANTLR start "entryRuleOnbuild"
    // InternalMyDocker.g:861:1: entryRuleOnbuild returns [EObject current=null] : iv_ruleOnbuild= ruleOnbuild EOF ;
    public final EObject entryRuleOnbuild() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnbuild = null;


        try {
            // InternalMyDocker.g:861:48: (iv_ruleOnbuild= ruleOnbuild EOF )
            // InternalMyDocker.g:862:2: iv_ruleOnbuild= ruleOnbuild EOF
            {
             newCompositeNode(grammarAccess.getOnbuildRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOnbuild=ruleOnbuild();

            state._fsp--;

             current =iv_ruleOnbuild; 
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
    // $ANTLR end "entryRuleOnbuild"


    // $ANTLR start "ruleOnbuild"
    // InternalMyDocker.g:868:1: ruleOnbuild returns [EObject current=null] : ( ( (lv_cmd_0_0= 'ONBUILD' ) ) ( (lv_args_1_0= RULE_ID ) ) ) ;
    public final EObject ruleOnbuild() throws RecognitionException {
        EObject current = null;

        Token lv_cmd_0_0=null;
        Token lv_args_1_0=null;


        	enterRule();

        try {
            // InternalMyDocker.g:874:2: ( ( ( (lv_cmd_0_0= 'ONBUILD' ) ) ( (lv_args_1_0= RULE_ID ) ) ) )
            // InternalMyDocker.g:875:2: ( ( (lv_cmd_0_0= 'ONBUILD' ) ) ( (lv_args_1_0= RULE_ID ) ) )
            {
            // InternalMyDocker.g:875:2: ( ( (lv_cmd_0_0= 'ONBUILD' ) ) ( (lv_args_1_0= RULE_ID ) ) )
            // InternalMyDocker.g:876:3: ( (lv_cmd_0_0= 'ONBUILD' ) ) ( (lv_args_1_0= RULE_ID ) )
            {
            // InternalMyDocker.g:876:3: ( (lv_cmd_0_0= 'ONBUILD' ) )
            // InternalMyDocker.g:877:4: (lv_cmd_0_0= 'ONBUILD' )
            {
            // InternalMyDocker.g:877:4: (lv_cmd_0_0= 'ONBUILD' )
            // InternalMyDocker.g:878:5: lv_cmd_0_0= 'ONBUILD'
            {
            lv_cmd_0_0=(Token)match(input,25,FOLLOW_8); 

            					newLeafNode(lv_cmd_0_0, grammarAccess.getOnbuildAccess().getCmdONBUILDKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOnbuildRule());
            					}
            					setWithLastConsumed(current, "cmd", lv_cmd_0_0, "ONBUILD");
            				

            }


            }

            // InternalMyDocker.g:890:3: ( (lv_args_1_0= RULE_ID ) )
            // InternalMyDocker.g:891:4: (lv_args_1_0= RULE_ID )
            {
            // InternalMyDocker.g:891:4: (lv_args_1_0= RULE_ID )
            // InternalMyDocker.g:892:5: lv_args_1_0= RULE_ID
            {
            lv_args_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_args_1_0, grammarAccess.getOnbuildAccess().getArgsIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOnbuildRule());
            					}
            					setWithLastConsumed(
            						current,
            						"args",
            						lv_args_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleOnbuild"


    // $ANTLR start "entryRuleRun"
    // InternalMyDocker.g:912:1: entryRuleRun returns [EObject current=null] : iv_ruleRun= ruleRun EOF ;
    public final EObject entryRuleRun() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRun = null;


        try {
            // InternalMyDocker.g:912:44: (iv_ruleRun= ruleRun EOF )
            // InternalMyDocker.g:913:2: iv_ruleRun= ruleRun EOF
            {
             newCompositeNode(grammarAccess.getRunRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRun=ruleRun();

            state._fsp--;

             current =iv_ruleRun; 
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
    // $ANTLR end "entryRuleRun"


    // $ANTLR start "ruleRun"
    // InternalMyDocker.g:919:1: ruleRun returns [EObject current=null] : ( ( (lv_cmd_0_0= 'RUN' ) ) ( (lv_args_1_0= ruleCommandArgs ) ) ) ;
    public final EObject ruleRun() throws RecognitionException {
        EObject current = null;

        Token lv_cmd_0_0=null;
        EObject lv_args_1_0 = null;



        	enterRule();

        try {
            // InternalMyDocker.g:925:2: ( ( ( (lv_cmd_0_0= 'RUN' ) ) ( (lv_args_1_0= ruleCommandArgs ) ) ) )
            // InternalMyDocker.g:926:2: ( ( (lv_cmd_0_0= 'RUN' ) ) ( (lv_args_1_0= ruleCommandArgs ) ) )
            {
            // InternalMyDocker.g:926:2: ( ( (lv_cmd_0_0= 'RUN' ) ) ( (lv_args_1_0= ruleCommandArgs ) ) )
            // InternalMyDocker.g:927:3: ( (lv_cmd_0_0= 'RUN' ) ) ( (lv_args_1_0= ruleCommandArgs ) )
            {
            // InternalMyDocker.g:927:3: ( (lv_cmd_0_0= 'RUN' ) )
            // InternalMyDocker.g:928:4: (lv_cmd_0_0= 'RUN' )
            {
            // InternalMyDocker.g:928:4: (lv_cmd_0_0= 'RUN' )
            // InternalMyDocker.g:929:5: lv_cmd_0_0= 'RUN'
            {
            lv_cmd_0_0=(Token)match(input,26,FOLLOW_4); 

            					newLeafNode(lv_cmd_0_0, grammarAccess.getRunAccess().getCmdRUNKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRunRule());
            					}
            					setWithLastConsumed(current, "cmd", lv_cmd_0_0, "RUN");
            				

            }


            }

            // InternalMyDocker.g:941:3: ( (lv_args_1_0= ruleCommandArgs ) )
            // InternalMyDocker.g:942:4: (lv_args_1_0= ruleCommandArgs )
            {
            // InternalMyDocker.g:942:4: (lv_args_1_0= ruleCommandArgs )
            // InternalMyDocker.g:943:5: lv_args_1_0= ruleCommandArgs
            {

            					newCompositeNode(grammarAccess.getRunAccess().getArgsCommandArgsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_args_1_0=ruleCommandArgs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRunRule());
            					}
            					set(
            						current,
            						"args",
            						lv_args_1_0,
            						"org.xtext.example.mydocker.MyDocker.CommandArgs");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleRun"


    // $ANTLR start "entryRuleShell"
    // InternalMyDocker.g:964:1: entryRuleShell returns [EObject current=null] : iv_ruleShell= ruleShell EOF ;
    public final EObject entryRuleShell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShell = null;


        try {
            // InternalMyDocker.g:964:46: (iv_ruleShell= ruleShell EOF )
            // InternalMyDocker.g:965:2: iv_ruleShell= ruleShell EOF
            {
             newCompositeNode(grammarAccess.getShellRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShell=ruleShell();

            state._fsp--;

             current =iv_ruleShell; 
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
    // $ANTLR end "entryRuleShell"


    // $ANTLR start "ruleShell"
    // InternalMyDocker.g:971:1: ruleShell returns [EObject current=null] : ( ( (lv_cmd_0_0= 'SHELL' ) ) ( (lv_args_1_0= ruleJSONArgs ) ) ) ;
    public final EObject ruleShell() throws RecognitionException {
        EObject current = null;

        Token lv_cmd_0_0=null;
        EObject lv_args_1_0 = null;



        	enterRule();

        try {
            // InternalMyDocker.g:977:2: ( ( ( (lv_cmd_0_0= 'SHELL' ) ) ( (lv_args_1_0= ruleJSONArgs ) ) ) )
            // InternalMyDocker.g:978:2: ( ( (lv_cmd_0_0= 'SHELL' ) ) ( (lv_args_1_0= ruleJSONArgs ) ) )
            {
            // InternalMyDocker.g:978:2: ( ( (lv_cmd_0_0= 'SHELL' ) ) ( (lv_args_1_0= ruleJSONArgs ) ) )
            // InternalMyDocker.g:979:3: ( (lv_cmd_0_0= 'SHELL' ) ) ( (lv_args_1_0= ruleJSONArgs ) )
            {
            // InternalMyDocker.g:979:3: ( (lv_cmd_0_0= 'SHELL' ) )
            // InternalMyDocker.g:980:4: (lv_cmd_0_0= 'SHELL' )
            {
            // InternalMyDocker.g:980:4: (lv_cmd_0_0= 'SHELL' )
            // InternalMyDocker.g:981:5: lv_cmd_0_0= 'SHELL'
            {
            lv_cmd_0_0=(Token)match(input,27,FOLLOW_5); 

            					newLeafNode(lv_cmd_0_0, grammarAccess.getShellAccess().getCmdSHELLKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getShellRule());
            					}
            					setWithLastConsumed(current, "cmd", lv_cmd_0_0, "SHELL");
            				

            }


            }

            // InternalMyDocker.g:993:3: ( (lv_args_1_0= ruleJSONArgs ) )
            // InternalMyDocker.g:994:4: (lv_args_1_0= ruleJSONArgs )
            {
            // InternalMyDocker.g:994:4: (lv_args_1_0= ruleJSONArgs )
            // InternalMyDocker.g:995:5: lv_args_1_0= ruleJSONArgs
            {

            					newCompositeNode(grammarAccess.getShellAccess().getArgsJSONArgsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_args_1_0=ruleJSONArgs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShellRule());
            					}
            					set(
            						current,
            						"args",
            						lv_args_1_0,
            						"org.xtext.example.mydocker.MyDocker.JSONArgs");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleShell"


    // $ANTLR start "entryRuleStopSignal"
    // InternalMyDocker.g:1016:1: entryRuleStopSignal returns [EObject current=null] : iv_ruleStopSignal= ruleStopSignal EOF ;
    public final EObject entryRuleStopSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStopSignal = null;


        try {
            // InternalMyDocker.g:1016:51: (iv_ruleStopSignal= ruleStopSignal EOF )
            // InternalMyDocker.g:1017:2: iv_ruleStopSignal= ruleStopSignal EOF
            {
             newCompositeNode(grammarAccess.getStopSignalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStopSignal=ruleStopSignal();

            state._fsp--;

             current =iv_ruleStopSignal; 
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
    // $ANTLR end "entryRuleStopSignal"


    // $ANTLR start "ruleStopSignal"
    // InternalMyDocker.g:1023:1: ruleStopSignal returns [EObject current=null] : ( ( (lv_cmd_0_0= 'STOPSIGNAL' ) ) ( (lv_args_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStopSignal() throws RecognitionException {
        EObject current = null;

        Token lv_cmd_0_0=null;
        Token lv_args_1_0=null;


        	enterRule();

        try {
            // InternalMyDocker.g:1029:2: ( ( ( (lv_cmd_0_0= 'STOPSIGNAL' ) ) ( (lv_args_1_0= RULE_STRING ) ) ) )
            // InternalMyDocker.g:1030:2: ( ( (lv_cmd_0_0= 'STOPSIGNAL' ) ) ( (lv_args_1_0= RULE_STRING ) ) )
            {
            // InternalMyDocker.g:1030:2: ( ( (lv_cmd_0_0= 'STOPSIGNAL' ) ) ( (lv_args_1_0= RULE_STRING ) ) )
            // InternalMyDocker.g:1031:3: ( (lv_cmd_0_0= 'STOPSIGNAL' ) ) ( (lv_args_1_0= RULE_STRING ) )
            {
            // InternalMyDocker.g:1031:3: ( (lv_cmd_0_0= 'STOPSIGNAL' ) )
            // InternalMyDocker.g:1032:4: (lv_cmd_0_0= 'STOPSIGNAL' )
            {
            // InternalMyDocker.g:1032:4: (lv_cmd_0_0= 'STOPSIGNAL' )
            // InternalMyDocker.g:1033:5: lv_cmd_0_0= 'STOPSIGNAL'
            {
            lv_cmd_0_0=(Token)match(input,28,FOLLOW_9); 

            					newLeafNode(lv_cmd_0_0, grammarAccess.getStopSignalAccess().getCmdSTOPSIGNALKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStopSignalRule());
            					}
            					setWithLastConsumed(current, "cmd", lv_cmd_0_0, "STOPSIGNAL");
            				

            }


            }

            // InternalMyDocker.g:1045:3: ( (lv_args_1_0= RULE_STRING ) )
            // InternalMyDocker.g:1046:4: (lv_args_1_0= RULE_STRING )
            {
            // InternalMyDocker.g:1046:4: (lv_args_1_0= RULE_STRING )
            // InternalMyDocker.g:1047:5: lv_args_1_0= RULE_STRING
            {
            lv_args_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_args_1_0, grammarAccess.getStopSignalAccess().getArgsSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStopSignalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"args",
            						lv_args_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleStopSignal"


    // $ANTLR start "entryRuleUser"
    // InternalMyDocker.g:1067:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // InternalMyDocker.g:1067:45: (iv_ruleUser= ruleUser EOF )
            // InternalMyDocker.g:1068:2: iv_ruleUser= ruleUser EOF
            {
             newCompositeNode(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUser=ruleUser();

            state._fsp--;

             current =iv_ruleUser; 
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
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // InternalMyDocker.g:1074:1: ruleUser returns [EObject current=null] : ( ( (lv_cmd_0_0= 'USER' ) ) ( (lv_args_1_0= ruleValue ) ) ) ;
    public final EObject ruleUser() throws RecognitionException {
        EObject current = null;

        Token lv_cmd_0_0=null;
        AntlrDatatypeRuleToken lv_args_1_0 = null;



        	enterRule();

        try {
            // InternalMyDocker.g:1080:2: ( ( ( (lv_cmd_0_0= 'USER' ) ) ( (lv_args_1_0= ruleValue ) ) ) )
            // InternalMyDocker.g:1081:2: ( ( (lv_cmd_0_0= 'USER' ) ) ( (lv_args_1_0= ruleValue ) ) )
            {
            // InternalMyDocker.g:1081:2: ( ( (lv_cmd_0_0= 'USER' ) ) ( (lv_args_1_0= ruleValue ) ) )
            // InternalMyDocker.g:1082:3: ( (lv_cmd_0_0= 'USER' ) ) ( (lv_args_1_0= ruleValue ) )
            {
            // InternalMyDocker.g:1082:3: ( (lv_cmd_0_0= 'USER' ) )
            // InternalMyDocker.g:1083:4: (lv_cmd_0_0= 'USER' )
            {
            // InternalMyDocker.g:1083:4: (lv_cmd_0_0= 'USER' )
            // InternalMyDocker.g:1084:5: lv_cmd_0_0= 'USER'
            {
            lv_cmd_0_0=(Token)match(input,29,FOLLOW_4); 

            					newLeafNode(lv_cmd_0_0, grammarAccess.getUserAccess().getCmdUSERKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserRule());
            					}
            					setWithLastConsumed(current, "cmd", lv_cmd_0_0, "USER");
            				

            }


            }

            // InternalMyDocker.g:1096:3: ( (lv_args_1_0= ruleValue ) )
            // InternalMyDocker.g:1097:4: (lv_args_1_0= ruleValue )
            {
            // InternalMyDocker.g:1097:4: (lv_args_1_0= ruleValue )
            // InternalMyDocker.g:1098:5: lv_args_1_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getUserAccess().getArgsValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_args_1_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUserRule());
            					}
            					set(
            						current,
            						"args",
            						lv_args_1_0,
            						"org.xtext.example.mydocker.MyDocker.Value");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleUser"


    // $ANTLR start "entryRuleVolume"
    // InternalMyDocker.g:1119:1: entryRuleVolume returns [EObject current=null] : iv_ruleVolume= ruleVolume EOF ;
    public final EObject entryRuleVolume() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVolume = null;


        try {
            // InternalMyDocker.g:1119:47: (iv_ruleVolume= ruleVolume EOF )
            // InternalMyDocker.g:1120:2: iv_ruleVolume= ruleVolume EOF
            {
             newCompositeNode(grammarAccess.getVolumeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVolume=ruleVolume();

            state._fsp--;

             current =iv_ruleVolume; 
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
    // $ANTLR end "entryRuleVolume"


    // $ANTLR start "ruleVolume"
    // InternalMyDocker.g:1126:1: ruleVolume returns [EObject current=null] : ( ( (lv_cmd_0_0= 'VOLUME' ) ) ( (lv_args_1_0= ruleCommandArgs ) ) ) ;
    public final EObject ruleVolume() throws RecognitionException {
        EObject current = null;

        Token lv_cmd_0_0=null;
        EObject lv_args_1_0 = null;



        	enterRule();

        try {
            // InternalMyDocker.g:1132:2: ( ( ( (lv_cmd_0_0= 'VOLUME' ) ) ( (lv_args_1_0= ruleCommandArgs ) ) ) )
            // InternalMyDocker.g:1133:2: ( ( (lv_cmd_0_0= 'VOLUME' ) ) ( (lv_args_1_0= ruleCommandArgs ) ) )
            {
            // InternalMyDocker.g:1133:2: ( ( (lv_cmd_0_0= 'VOLUME' ) ) ( (lv_args_1_0= ruleCommandArgs ) ) )
            // InternalMyDocker.g:1134:3: ( (lv_cmd_0_0= 'VOLUME' ) ) ( (lv_args_1_0= ruleCommandArgs ) )
            {
            // InternalMyDocker.g:1134:3: ( (lv_cmd_0_0= 'VOLUME' ) )
            // InternalMyDocker.g:1135:4: (lv_cmd_0_0= 'VOLUME' )
            {
            // InternalMyDocker.g:1135:4: (lv_cmd_0_0= 'VOLUME' )
            // InternalMyDocker.g:1136:5: lv_cmd_0_0= 'VOLUME'
            {
            lv_cmd_0_0=(Token)match(input,30,FOLLOW_4); 

            					newLeafNode(lv_cmd_0_0, grammarAccess.getVolumeAccess().getCmdVOLUMEKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVolumeRule());
            					}
            					setWithLastConsumed(current, "cmd", lv_cmd_0_0, "VOLUME");
            				

            }


            }

            // InternalMyDocker.g:1148:3: ( (lv_args_1_0= ruleCommandArgs ) )
            // InternalMyDocker.g:1149:4: (lv_args_1_0= ruleCommandArgs )
            {
            // InternalMyDocker.g:1149:4: (lv_args_1_0= ruleCommandArgs )
            // InternalMyDocker.g:1150:5: lv_args_1_0= ruleCommandArgs
            {

            					newCompositeNode(grammarAccess.getVolumeAccess().getArgsCommandArgsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_args_1_0=ruleCommandArgs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVolumeRule());
            					}
            					set(
            						current,
            						"args",
            						lv_args_1_0,
            						"org.xtext.example.mydocker.MyDocker.CommandArgs");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleVolume"


    // $ANTLR start "entryRuleWorkdir"
    // InternalMyDocker.g:1171:1: entryRuleWorkdir returns [EObject current=null] : iv_ruleWorkdir= ruleWorkdir EOF ;
    public final EObject entryRuleWorkdir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkdir = null;


        try {
            // InternalMyDocker.g:1171:48: (iv_ruleWorkdir= ruleWorkdir EOF )
            // InternalMyDocker.g:1172:2: iv_ruleWorkdir= ruleWorkdir EOF
            {
             newCompositeNode(grammarAccess.getWorkdirRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkdir=ruleWorkdir();

            state._fsp--;

             current =iv_ruleWorkdir; 
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
    // $ANTLR end "entryRuleWorkdir"


    // $ANTLR start "ruleWorkdir"
    // InternalMyDocker.g:1178:1: ruleWorkdir returns [EObject current=null] : ( ( (lv_cmd_0_0= 'WORKDIR' ) ) ( (lv_args_1_0= ruleValue ) ) ) ;
    public final EObject ruleWorkdir() throws RecognitionException {
        EObject current = null;

        Token lv_cmd_0_0=null;
        AntlrDatatypeRuleToken lv_args_1_0 = null;



        	enterRule();

        try {
            // InternalMyDocker.g:1184:2: ( ( ( (lv_cmd_0_0= 'WORKDIR' ) ) ( (lv_args_1_0= ruleValue ) ) ) )
            // InternalMyDocker.g:1185:2: ( ( (lv_cmd_0_0= 'WORKDIR' ) ) ( (lv_args_1_0= ruleValue ) ) )
            {
            // InternalMyDocker.g:1185:2: ( ( (lv_cmd_0_0= 'WORKDIR' ) ) ( (lv_args_1_0= ruleValue ) ) )
            // InternalMyDocker.g:1186:3: ( (lv_cmd_0_0= 'WORKDIR' ) ) ( (lv_args_1_0= ruleValue ) )
            {
            // InternalMyDocker.g:1186:3: ( (lv_cmd_0_0= 'WORKDIR' ) )
            // InternalMyDocker.g:1187:4: (lv_cmd_0_0= 'WORKDIR' )
            {
            // InternalMyDocker.g:1187:4: (lv_cmd_0_0= 'WORKDIR' )
            // InternalMyDocker.g:1188:5: lv_cmd_0_0= 'WORKDIR'
            {
            lv_cmd_0_0=(Token)match(input,31,FOLLOW_4); 

            					newLeafNode(lv_cmd_0_0, grammarAccess.getWorkdirAccess().getCmdWORKDIRKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkdirRule());
            					}
            					setWithLastConsumed(current, "cmd", lv_cmd_0_0, "WORKDIR");
            				

            }


            }

            // InternalMyDocker.g:1200:3: ( (lv_args_1_0= ruleValue ) )
            // InternalMyDocker.g:1201:4: (lv_args_1_0= ruleValue )
            {
            // InternalMyDocker.g:1201:4: (lv_args_1_0= ruleValue )
            // InternalMyDocker.g:1202:5: lv_args_1_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getWorkdirAccess().getArgsValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_args_1_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkdirRule());
            					}
            					set(
            						current,
            						"args",
            						lv_args_1_0,
            						"org.xtext.example.mydocker.MyDocker.Value");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleWorkdir"


    // $ANTLR start "entryRuleCommandArgs"
    // InternalMyDocker.g:1223:1: entryRuleCommandArgs returns [EObject current=null] : iv_ruleCommandArgs= ruleCommandArgs EOF ;
    public final EObject entryRuleCommandArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandArgs = null;


        try {
            // InternalMyDocker.g:1223:52: (iv_ruleCommandArgs= ruleCommandArgs EOF )
            // InternalMyDocker.g:1224:2: iv_ruleCommandArgs= ruleCommandArgs EOF
            {
             newCompositeNode(grammarAccess.getCommandArgsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommandArgs=ruleCommandArgs();

            state._fsp--;

             current =iv_ruleCommandArgs; 
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
    // $ANTLR end "entryRuleCommandArgs"


    // $ANTLR start "ruleCommandArgs"
    // InternalMyDocker.g:1230:1: ruleCommandArgs returns [EObject current=null] : (this_JSONArgs_0= ruleJSONArgs | ruleSpaceArgs ) ;
    public final EObject ruleCommandArgs() throws RecognitionException {
        EObject current = null;

        EObject this_JSONArgs_0 = null;



        	enterRule();

        try {
            // InternalMyDocker.g:1236:2: ( (this_JSONArgs_0= ruleJSONArgs | ruleSpaceArgs ) )
            // InternalMyDocker.g:1237:2: (this_JSONArgs_0= ruleJSONArgs | ruleSpaceArgs )
            {
            // InternalMyDocker.g:1237:2: (this_JSONArgs_0= ruleJSONArgs | ruleSpaceArgs )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==32) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_RAW_VALUE)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDocker.g:1238:3: this_JSONArgs_0= ruleJSONArgs
                    {

                    			newCompositeNode(grammarAccess.getCommandArgsAccess().getJSONArgsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_JSONArgs_0=ruleJSONArgs();

                    state._fsp--;


                    			current = this_JSONArgs_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDocker.g:1247:3: ruleSpaceArgs
                    {

                    			newCompositeNode(grammarAccess.getCommandArgsAccess().getSpaceArgsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    ruleSpaceArgs();

                    state._fsp--;


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
    // $ANTLR end "ruleCommandArgs"


    // $ANTLR start "entryRuleJSONArgs"
    // InternalMyDocker.g:1258:1: entryRuleJSONArgs returns [EObject current=null] : iv_ruleJSONArgs= ruleJSONArgs EOF ;
    public final EObject entryRuleJSONArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSONArgs = null;


        try {
            // InternalMyDocker.g:1258:49: (iv_ruleJSONArgs= ruleJSONArgs EOF )
            // InternalMyDocker.g:1259:2: iv_ruleJSONArgs= ruleJSONArgs EOF
            {
             newCompositeNode(grammarAccess.getJSONArgsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJSONArgs=ruleJSONArgs();

            state._fsp--;

             current =iv_ruleJSONArgs; 
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
    // $ANTLR end "entryRuleJSONArgs"


    // $ANTLR start "ruleJSONArgs"
    // InternalMyDocker.g:1265:1: ruleJSONArgs returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_args_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_args_3_0= RULE_STRING ) ) )* otherlv_4= ']' ) | (otherlv_5= '[' otherlv_6= ']' ) ) ;
    public final EObject ruleJSONArgs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_args_1_0=null;
        Token otherlv_2=null;
        Token lv_args_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMyDocker.g:1271:2: ( ( (otherlv_0= '[' ( (lv_args_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_args_3_0= RULE_STRING ) ) )* otherlv_4= ']' ) | (otherlv_5= '[' otherlv_6= ']' ) ) )
            // InternalMyDocker.g:1272:2: ( (otherlv_0= '[' ( (lv_args_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_args_3_0= RULE_STRING ) ) )* otherlv_4= ']' ) | (otherlv_5= '[' otherlv_6= ']' ) )
            {
            // InternalMyDocker.g:1272:2: ( (otherlv_0= '[' ( (lv_args_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_args_3_0= RULE_STRING ) ) )* otherlv_4= ']' ) | (otherlv_5= '[' otherlv_6= ']' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==32) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_STRING) ) {
                    alt5=1;
                }
                else if ( (LA5_1==34) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDocker.g:1273:3: (otherlv_0= '[' ( (lv_args_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_args_3_0= RULE_STRING ) ) )* otherlv_4= ']' )
                    {
                    // InternalMyDocker.g:1273:3: (otherlv_0= '[' ( (lv_args_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_args_3_0= RULE_STRING ) ) )* otherlv_4= ']' )
                    // InternalMyDocker.g:1274:4: otherlv_0= '[' ( (lv_args_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_args_3_0= RULE_STRING ) ) )* otherlv_4= ']'
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getJSONArgsAccess().getLeftSquareBracketKeyword_0_0());
                    			
                    // InternalMyDocker.g:1278:4: ( (lv_args_1_0= RULE_STRING ) )
                    // InternalMyDocker.g:1279:5: (lv_args_1_0= RULE_STRING )
                    {
                    // InternalMyDocker.g:1279:5: (lv_args_1_0= RULE_STRING )
                    // InternalMyDocker.g:1280:6: lv_args_1_0= RULE_STRING
                    {
                    lv_args_1_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    						newLeafNode(lv_args_1_0, grammarAccess.getJSONArgsAccess().getArgsSTRINGTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJSONArgsRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"args",
                    							lv_args_1_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalMyDocker.g:1296:4: (otherlv_2= ',' ( (lv_args_3_0= RULE_STRING ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==33) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDocker.g:1297:5: otherlv_2= ',' ( (lv_args_3_0= RULE_STRING ) )
                    	    {
                    	    otherlv_2=(Token)match(input,33,FOLLOW_9); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getJSONArgsAccess().getCommaKeyword_0_2_0());
                    	    				
                    	    // InternalMyDocker.g:1301:5: ( (lv_args_3_0= RULE_STRING ) )
                    	    // InternalMyDocker.g:1302:6: (lv_args_3_0= RULE_STRING )
                    	    {
                    	    // InternalMyDocker.g:1302:6: (lv_args_3_0= RULE_STRING )
                    	    // InternalMyDocker.g:1303:7: lv_args_3_0= RULE_STRING
                    	    {
                    	    lv_args_3_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    	    							newLeafNode(lv_args_3_0, grammarAccess.getJSONArgsAccess().getArgsSTRINGTerminalRuleCall_0_2_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getJSONArgsRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"args",
                    	    								lv_args_3_0,
                    	    								"org.eclipse.xtext.common.Terminals.STRING");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getJSONArgsAccess().getRightSquareBracketKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDocker.g:1326:3: (otherlv_5= '[' otherlv_6= ']' )
                    {
                    // InternalMyDocker.g:1326:3: (otherlv_5= '[' otherlv_6= ']' )
                    // InternalMyDocker.g:1327:4: otherlv_5= '[' otherlv_6= ']'
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getJSONArgsAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    otherlv_6=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getJSONArgsAccess().getRightSquareBracketKeyword_1_1());
                    			

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
    // $ANTLR end "ruleJSONArgs"


    // $ANTLR start "entryRuleSpaceArgs"
    // InternalMyDocker.g:1340:1: entryRuleSpaceArgs returns [String current=null] : iv_ruleSpaceArgs= ruleSpaceArgs EOF ;
    public final String entryRuleSpaceArgs() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSpaceArgs = null;


        try {
            // InternalMyDocker.g:1340:49: (iv_ruleSpaceArgs= ruleSpaceArgs EOF )
            // InternalMyDocker.g:1341:2: iv_ruleSpaceArgs= ruleSpaceArgs EOF
            {
             newCompositeNode(grammarAccess.getSpaceArgsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpaceArgs=ruleSpaceArgs();

            state._fsp--;

             current =iv_ruleSpaceArgs.getText(); 
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
    // $ANTLR end "entryRuleSpaceArgs"


    // $ANTLR start "ruleSpaceArgs"
    // InternalMyDocker.g:1347:1: ruleSpaceArgs returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Value_0= ruleValue (this_Value_1= ruleValue )* ) ;
    public final AntlrDatatypeRuleToken ruleSpaceArgs() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Value_0 = null;

        AntlrDatatypeRuleToken this_Value_1 = null;



        	enterRule();

        try {
            // InternalMyDocker.g:1353:2: ( (this_Value_0= ruleValue (this_Value_1= ruleValue )* ) )
            // InternalMyDocker.g:1354:2: (this_Value_0= ruleValue (this_Value_1= ruleValue )* )
            {
            // InternalMyDocker.g:1354:2: (this_Value_0= ruleValue (this_Value_1= ruleValue )* )
            // InternalMyDocker.g:1355:3: this_Value_0= ruleValue (this_Value_1= ruleValue )*
            {

            			newCompositeNode(grammarAccess.getSpaceArgsAccess().getValueParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_Value_0=ruleValue();

            state._fsp--;


            			current.merge(this_Value_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalMyDocker.g:1365:3: (this_Value_1= ruleValue )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_RAW_VALUE)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDocker.g:1366:4: this_Value_1= ruleValue
            	    {

            	    				newCompositeNode(grammarAccess.getSpaceArgsAccess().getValueParserRuleCall_1());
            	    			
            	    pushFollow(FOLLOW_12);
            	    this_Value_1=ruleValue();

            	    state._fsp--;


            	    				current.merge(this_Value_1);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleSpaceArgs"


    // $ANTLR start "entryRuleNameVals"
    // InternalMyDocker.g:1381:1: entryRuleNameVals returns [EObject current=null] : iv_ruleNameVals= ruleNameVals EOF ;
    public final EObject entryRuleNameVals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameVals = null;


        try {
            // InternalMyDocker.g:1381:49: (iv_ruleNameVals= ruleNameVals EOF )
            // InternalMyDocker.g:1382:2: iv_ruleNameVals= ruleNameVals EOF
            {
             newCompositeNode(grammarAccess.getNameValsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNameVals=ruleNameVals();

            state._fsp--;

             current =iv_ruleNameVals; 
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
    // $ANTLR end "entryRuleNameVals"


    // $ANTLR start "ruleNameVals"
    // InternalMyDocker.g:1388:1: ruleNameVals returns [EObject current=null] : ( (lv_values_0_0= ruleNameVal ) )+ ;
    public final EObject ruleNameVals() throws RecognitionException {
        EObject current = null;

        EObject lv_values_0_0 = null;



        	enterRule();

        try {
            // InternalMyDocker.g:1394:2: ( ( (lv_values_0_0= ruleNameVal ) )+ )
            // InternalMyDocker.g:1395:2: ( (lv_values_0_0= ruleNameVal ) )+
            {
            // InternalMyDocker.g:1395:2: ( (lv_values_0_0= ruleNameVal ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDocker.g:1396:3: (lv_values_0_0= ruleNameVal )
            	    {
            	    // InternalMyDocker.g:1396:3: (lv_values_0_0= ruleNameVal )
            	    // InternalMyDocker.g:1397:4: lv_values_0_0= ruleNameVal
            	    {

            	    				newCompositeNode(grammarAccess.getNameValsAccess().getValuesNameValParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_12);
            	    lv_values_0_0=ruleNameVal();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getNameValsRule());
            	    				}
            	    				add(
            	    					current,
            	    					"values",
            	    					lv_values_0_0,
            	    					"org.xtext.example.mydocker.MyDocker.NameVal");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
    // $ANTLR end "ruleNameVals"


    // $ANTLR start "entryRuleNameVal"
    // InternalMyDocker.g:1417:1: entryRuleNameVal returns [EObject current=null] : iv_ruleNameVal= ruleNameVal EOF ;
    public final EObject entryRuleNameVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameVal = null;


        try {
            // InternalMyDocker.g:1417:48: (iv_ruleNameVal= ruleNameVal EOF )
            // InternalMyDocker.g:1418:2: iv_ruleNameVal= ruleNameVal EOF
            {
             newCompositeNode(grammarAccess.getNameValRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNameVal=ruleNameVal();

            state._fsp--;

             current =iv_ruleNameVal; 
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
    // $ANTLR end "entryRuleNameVal"


    // $ANTLR start "ruleNameVal"
    // InternalMyDocker.g:1424:1: ruleNameVal returns [EObject current=null] : ( ( ( (lv_key_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleValue ) ) ) | ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleValue ) ) ) ) ;
    public final EObject ruleNameVal() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token lv_key_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalMyDocker.g:1430:2: ( ( ( ( (lv_key_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleValue ) ) ) | ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleValue ) ) ) ) )
            // InternalMyDocker.g:1431:2: ( ( ( (lv_key_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleValue ) ) ) | ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleValue ) ) ) )
            {
            // InternalMyDocker.g:1431:2: ( ( ( (lv_key_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleValue ) ) ) | ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleValue ) ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( ((LA8_1>=RULE_ID && LA8_1<=RULE_RAW_VALUE)) ) {
                    alt8=1;
                }
                else if ( (LA8_1==35) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

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
                    // InternalMyDocker.g:1432:3: ( ( (lv_key_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleValue ) ) )
                    {
                    // InternalMyDocker.g:1432:3: ( ( (lv_key_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleValue ) ) )
                    // InternalMyDocker.g:1433:4: ( (lv_key_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleValue ) )
                    {
                    // InternalMyDocker.g:1433:4: ( (lv_key_0_0= RULE_ID ) )
                    // InternalMyDocker.g:1434:5: (lv_key_0_0= RULE_ID )
                    {
                    // InternalMyDocker.g:1434:5: (lv_key_0_0= RULE_ID )
                    // InternalMyDocker.g:1435:6: lv_key_0_0= RULE_ID
                    {
                    lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    						newLeafNode(lv_key_0_0, grammarAccess.getNameValAccess().getKeyIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNameValRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"key",
                    							lv_key_0_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalMyDocker.g:1451:4: ( (lv_value_1_0= ruleValue ) )
                    // InternalMyDocker.g:1452:5: (lv_value_1_0= ruleValue )
                    {
                    // InternalMyDocker.g:1452:5: (lv_value_1_0= ruleValue )
                    // InternalMyDocker.g:1453:6: lv_value_1_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getNameValAccess().getValueValueParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_1_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNameValRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.xtext.example.mydocker.MyDocker.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDocker.g:1472:3: ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleValue ) ) )
                    {
                    // InternalMyDocker.g:1472:3: ( ( (lv_key_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleValue ) ) )
                    // InternalMyDocker.g:1473:4: ( (lv_key_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleValue ) )
                    {
                    // InternalMyDocker.g:1473:4: ( (lv_key_2_0= RULE_ID ) )
                    // InternalMyDocker.g:1474:5: (lv_key_2_0= RULE_ID )
                    {
                    // InternalMyDocker.g:1474:5: (lv_key_2_0= RULE_ID )
                    // InternalMyDocker.g:1475:6: lv_key_2_0= RULE_ID
                    {
                    lv_key_2_0=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(lv_key_2_0, grammarAccess.getNameValAccess().getKeyIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNameValRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"key",
                    							lv_key_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,35,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getNameValAccess().getEqualsSignKeyword_1_1());
                    			
                    // InternalMyDocker.g:1495:4: ( (lv_value_4_0= ruleValue ) )
                    // InternalMyDocker.g:1496:5: (lv_value_4_0= ruleValue )
                    {
                    // InternalMyDocker.g:1496:5: (lv_value_4_0= ruleValue )
                    // InternalMyDocker.g:1497:6: lv_value_4_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getNameValAccess().getValueValueParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_4_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNameValRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"org.xtext.example.mydocker.MyDocker.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleNameVal"


    // $ANTLR start "entryRuleArgArgs"
    // InternalMyDocker.g:1519:1: entryRuleArgArgs returns [EObject current=null] : iv_ruleArgArgs= ruleArgArgs EOF ;
    public final EObject entryRuleArgArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgArgs = null;


        try {
            // InternalMyDocker.g:1519:48: (iv_ruleArgArgs= ruleArgArgs EOF )
            // InternalMyDocker.g:1520:2: iv_ruleArgArgs= ruleArgArgs EOF
            {
             newCompositeNode(grammarAccess.getArgArgsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArgArgs=ruleArgArgs();

            state._fsp--;

             current =iv_ruleArgArgs; 
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
    // $ANTLR end "entryRuleArgArgs"


    // $ANTLR start "ruleArgArgs"
    // InternalMyDocker.g:1526:1: ruleArgArgs returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleValue ) ) ) | ( (lv_values_2_0= ruleNameVals ) ) ) ;
    public final EObject ruleArgArgs() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;

        EObject lv_values_2_0 = null;



        	enterRule();

        try {
            // InternalMyDocker.g:1532:2: ( ( ( () ( (lv_value_1_0= ruleValue ) ) ) | ( (lv_values_2_0= ruleNameVals ) ) ) )
            // InternalMyDocker.g:1533:2: ( ( () ( (lv_value_1_0= ruleValue ) ) ) | ( (lv_values_2_0= ruleNameVals ) ) )
            {
            // InternalMyDocker.g:1533:2: ( ( () ( (lv_value_1_0= ruleValue ) ) ) | ( (lv_values_2_0= ruleNameVals ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_RAW_VALUE)) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                int LA9_2 = input.LA(2);

                if ( ((LA9_2>=RULE_ID && LA9_2<=RULE_RAW_VALUE)||LA9_2==35) ) {
                    alt9=2;
                }
                else if ( (LA9_2==EOF||(LA9_2>=14 && LA9_2<=31)) ) {
                    alt9=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDocker.g:1534:3: ( () ( (lv_value_1_0= ruleValue ) ) )
                    {
                    // InternalMyDocker.g:1534:3: ( () ( (lv_value_1_0= ruleValue ) ) )
                    // InternalMyDocker.g:1535:4: () ( (lv_value_1_0= ruleValue ) )
                    {
                    // InternalMyDocker.g:1535:4: ()
                    // InternalMyDocker.g:1536:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getArgArgsAccess().getArgArgsAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMyDocker.g:1542:4: ( (lv_value_1_0= ruleValue ) )
                    // InternalMyDocker.g:1543:5: (lv_value_1_0= ruleValue )
                    {
                    // InternalMyDocker.g:1543:5: (lv_value_1_0= ruleValue )
                    // InternalMyDocker.g:1544:6: lv_value_1_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getArgArgsAccess().getValueValueParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_1_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArgArgsRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.xtext.example.mydocker.MyDocker.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDocker.g:1563:3: ( (lv_values_2_0= ruleNameVals ) )
                    {
                    // InternalMyDocker.g:1563:3: ( (lv_values_2_0= ruleNameVals ) )
                    // InternalMyDocker.g:1564:4: (lv_values_2_0= ruleNameVals )
                    {
                    // InternalMyDocker.g:1564:4: (lv_values_2_0= ruleNameVals )
                    // InternalMyDocker.g:1565:5: lv_values_2_0= ruleNameVals
                    {

                    					newCompositeNode(grammarAccess.getArgArgsAccess().getValuesNameValsParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_values_2_0=ruleNameVals();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getArgArgsRule());
                    					}
                    					set(
                    						current,
                    						"values",
                    						lv_values_2_0,
                    						"org.xtext.example.mydocker.MyDocker.NameVals");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleArgArgs"


    // $ANTLR start "entryRuleHealthArgs"
    // InternalMyDocker.g:1586:1: entryRuleHealthArgs returns [EObject current=null] : iv_ruleHealthArgs= ruleHealthArgs EOF ;
    public final EObject entryRuleHealthArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHealthArgs = null;


        try {
            // InternalMyDocker.g:1586:51: (iv_ruleHealthArgs= ruleHealthArgs EOF )
            // InternalMyDocker.g:1587:2: iv_ruleHealthArgs= ruleHealthArgs EOF
            {
             newCompositeNode(grammarAccess.getHealthArgsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHealthArgs=ruleHealthArgs();

            state._fsp--;

             current =iv_ruleHealthArgs; 
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
    // $ANTLR end "entryRuleHealthArgs"


    // $ANTLR start "ruleHealthArgs"
    // InternalMyDocker.g:1593:1: ruleHealthArgs returns [EObject current=null] : ( ( (lv_typ_0_0= 'None' ) ) | ( ( (lv_options_1_0= ruleOptions ) ) otherlv_2= 'CMD' ( (lv_cmdArgs_3_0= ruleCommandArgs ) ) ) ) ;
    public final EObject ruleHealthArgs() throws RecognitionException {
        EObject current = null;

        Token lv_typ_0_0=null;
        Token otherlv_2=null;
        EObject lv_options_1_0 = null;

        EObject lv_cmdArgs_3_0 = null;



        	enterRule();

        try {
            // InternalMyDocker.g:1599:2: ( ( ( (lv_typ_0_0= 'None' ) ) | ( ( (lv_options_1_0= ruleOptions ) ) otherlv_2= 'CMD' ( (lv_cmdArgs_3_0= ruleCommandArgs ) ) ) ) )
            // InternalMyDocker.g:1600:2: ( ( (lv_typ_0_0= 'None' ) ) | ( ( (lv_options_1_0= ruleOptions ) ) otherlv_2= 'CMD' ( (lv_cmdArgs_3_0= ruleCommandArgs ) ) ) )
            {
            // InternalMyDocker.g:1600:2: ( ( (lv_typ_0_0= 'None' ) ) | ( ( (lv_options_1_0= ruleOptions ) ) otherlv_2= 'CMD' ( (lv_cmdArgs_3_0= ruleCommandArgs ) ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==36) ) {
                alt10=1;
            }
            else if ( (LA10_0==EOF||LA10_0==16||LA10_0==37) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDocker.g:1601:3: ( (lv_typ_0_0= 'None' ) )
                    {
                    // InternalMyDocker.g:1601:3: ( (lv_typ_0_0= 'None' ) )
                    // InternalMyDocker.g:1602:4: (lv_typ_0_0= 'None' )
                    {
                    // InternalMyDocker.g:1602:4: (lv_typ_0_0= 'None' )
                    // InternalMyDocker.g:1603:5: lv_typ_0_0= 'None'
                    {
                    lv_typ_0_0=(Token)match(input,36,FOLLOW_2); 

                    					newLeafNode(lv_typ_0_0, grammarAccess.getHealthArgsAccess().getTypNoneKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getHealthArgsRule());
                    					}
                    					setWithLastConsumed(current, "typ", lv_typ_0_0, "None");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDocker.g:1616:3: ( ( (lv_options_1_0= ruleOptions ) ) otherlv_2= 'CMD' ( (lv_cmdArgs_3_0= ruleCommandArgs ) ) )
                    {
                    // InternalMyDocker.g:1616:3: ( ( (lv_options_1_0= ruleOptions ) ) otherlv_2= 'CMD' ( (lv_cmdArgs_3_0= ruleCommandArgs ) ) )
                    // InternalMyDocker.g:1617:4: ( (lv_options_1_0= ruleOptions ) ) otherlv_2= 'CMD' ( (lv_cmdArgs_3_0= ruleCommandArgs ) )
                    {
                    // InternalMyDocker.g:1617:4: ( (lv_options_1_0= ruleOptions ) )
                    // InternalMyDocker.g:1618:5: (lv_options_1_0= ruleOptions )
                    {
                    // InternalMyDocker.g:1618:5: (lv_options_1_0= ruleOptions )
                    // InternalMyDocker.g:1619:6: lv_options_1_0= ruleOptions
                    {

                    						newCompositeNode(grammarAccess.getHealthArgsAccess().getOptionsOptionsParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_options_1_0=ruleOptions();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHealthArgsRule());
                    						}
                    						set(
                    							current,
                    							"options",
                    							lv_options_1_0,
                    							"org.xtext.example.mydocker.MyDocker.Options");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getHealthArgsAccess().getCMDKeyword_1_1());
                    			
                    // InternalMyDocker.g:1640:4: ( (lv_cmdArgs_3_0= ruleCommandArgs ) )
                    // InternalMyDocker.g:1641:5: (lv_cmdArgs_3_0= ruleCommandArgs )
                    {
                    // InternalMyDocker.g:1641:5: (lv_cmdArgs_3_0= ruleCommandArgs )
                    // InternalMyDocker.g:1642:6: lv_cmdArgs_3_0= ruleCommandArgs
                    {

                    						newCompositeNode(grammarAccess.getHealthArgsAccess().getCmdArgsCommandArgsParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_cmdArgs_3_0=ruleCommandArgs();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHealthArgsRule());
                    						}
                    						set(
                    							current,
                    							"cmdArgs",
                    							lv_cmdArgs_3_0,
                    							"org.xtext.example.mydocker.MyDocker.CommandArgs");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleHealthArgs"


    // $ANTLR start "entryRuleOptions"
    // InternalMyDocker.g:1664:1: entryRuleOptions returns [EObject current=null] : iv_ruleOptions= ruleOptions EOF ;
    public final EObject entryRuleOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptions = null;


        try {
            // InternalMyDocker.g:1664:48: (iv_ruleOptions= ruleOptions EOF )
            // InternalMyDocker.g:1665:2: iv_ruleOptions= ruleOptions EOF
            {
             newCompositeNode(grammarAccess.getOptionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptions=ruleOptions();

            state._fsp--;

             current =iv_ruleOptions; 
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
    // $ANTLR end "entryRuleOptions"


    // $ANTLR start "ruleOptions"
    // InternalMyDocker.g:1671:1: ruleOptions returns [EObject current=null] : ( () ( (lv_options_1_0= ruleOption ) )* ) ;
    public final EObject ruleOptions() throws RecognitionException {
        EObject current = null;

        EObject lv_options_1_0 = null;



        	enterRule();

        try {
            // InternalMyDocker.g:1677:2: ( ( () ( (lv_options_1_0= ruleOption ) )* ) )
            // InternalMyDocker.g:1678:2: ( () ( (lv_options_1_0= ruleOption ) )* )
            {
            // InternalMyDocker.g:1678:2: ( () ( (lv_options_1_0= ruleOption ) )* )
            // InternalMyDocker.g:1679:3: () ( (lv_options_1_0= ruleOption ) )*
            {
            // InternalMyDocker.g:1679:3: ()
            // InternalMyDocker.g:1680:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOptionsAccess().getOptionsAction_0(),
            					current);
            			

            }

            // InternalMyDocker.g:1686:3: ( (lv_options_1_0= ruleOption ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==37) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDocker.g:1687:4: (lv_options_1_0= ruleOption )
            	    {
            	    // InternalMyDocker.g:1687:4: (lv_options_1_0= ruleOption )
            	    // InternalMyDocker.g:1688:5: lv_options_1_0= ruleOption
            	    {

            	    					newCompositeNode(grammarAccess.getOptionsAccess().getOptionsOptionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_options_1_0=ruleOption();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOptionsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"options",
            	    						lv_options_1_0,
            	    						"org.xtext.example.mydocker.MyDocker.Option");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // $ANTLR end "ruleOptions"


    // $ANTLR start "entryRuleOption"
    // InternalMyDocker.g:1709:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // InternalMyDocker.g:1709:47: (iv_ruleOption= ruleOption EOF )
            // InternalMyDocker.g:1710:2: iv_ruleOption= ruleOption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
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
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // InternalMyDocker.g:1716:1: ruleOption returns [EObject current=null] : (otherlv_0= '--' ( (lv_option_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_option_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalMyDocker.g:1722:2: ( (otherlv_0= '--' ( (lv_option_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) ) )
            // InternalMyDocker.g:1723:2: (otherlv_0= '--' ( (lv_option_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) )
            {
            // InternalMyDocker.g:1723:2: (otherlv_0= '--' ( (lv_option_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) )
            // InternalMyDocker.g:1724:3: otherlv_0= '--' ( (lv_option_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getOptionAccess().getHyphenMinusHyphenMinusKeyword_0());
            		
            // InternalMyDocker.g:1728:3: ( (lv_option_1_0= RULE_ID ) )
            // InternalMyDocker.g:1729:4: (lv_option_1_0= RULE_ID )
            {
            // InternalMyDocker.g:1729:4: (lv_option_1_0= RULE_ID )
            // InternalMyDocker.g:1730:5: lv_option_1_0= RULE_ID
            {
            lv_option_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_option_1_0, grammarAccess.getOptionAccess().getOptionIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"option",
            						lv_option_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getOptionAccess().getEqualsSignKeyword_2());
            		
            // InternalMyDocker.g:1750:3: ( (lv_value_3_0= ruleValue ) )
            // InternalMyDocker.g:1751:4: (lv_value_3_0= ruleValue )
            {
            // InternalMyDocker.g:1751:4: (lv_value_3_0= ruleValue )
            // InternalMyDocker.g:1752:5: lv_value_3_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getOptionAccess().getValueValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOptionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.xtext.example.mydocker.MyDocker.Value");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleValue"
    // InternalMyDocker.g:1773:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // InternalMyDocker.g:1773:45: (iv_ruleValue= ruleValue EOF )
            // InternalMyDocker.g:1774:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue.getText(); 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalMyDocker.g:1780:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_RAW_VALUE_2= RULE_RAW_VALUE ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;
        Token this_RAW_VALUE_2=null;


        	enterRule();

        try {
            // InternalMyDocker.g:1786:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_RAW_VALUE_2= RULE_RAW_VALUE ) )
            // InternalMyDocker.g:1787:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_RAW_VALUE_2= RULE_RAW_VALUE )
            {
            // InternalMyDocker.g:1787:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_RAW_VALUE_2= RULE_RAW_VALUE )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt12=1;
                }
                break;
            case RULE_ID:
                {
                alt12=2;
                }
                break;
            case RULE_RAW_VALUE:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMyDocker.g:1788:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDocker.g:1796:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getValueAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDocker.g:1804:3: this_RAW_VALUE_2= RULE_RAW_VALUE
                    {
                    this_RAW_VALUE_2=(Token)match(input,RULE_RAW_VALUE,FOLLOW_2); 

                    			current.merge(this_RAW_VALUE_2);
                    		

                    			newLeafNode(this_RAW_VALUE_2, grammarAccess.getValueAccess().getRAW_VALUETerminalRuleCall_2());
                    		

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleExposeArgs"
    // InternalMyDocker.g:1815:1: entryRuleExposeArgs returns [EObject current=null] : iv_ruleExposeArgs= ruleExposeArgs EOF ;
    public final EObject entryRuleExposeArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExposeArgs = null;


        try {
            // InternalMyDocker.g:1815:51: (iv_ruleExposeArgs= ruleExposeArgs EOF )
            // InternalMyDocker.g:1816:2: iv_ruleExposeArgs= ruleExposeArgs EOF
            {
             newCompositeNode(grammarAccess.getExposeArgsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExposeArgs=ruleExposeArgs();

            state._fsp--;

             current =iv_ruleExposeArgs; 
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
    // $ANTLR end "entryRuleExposeArgs"


    // $ANTLR start "ruleExposeArgs"
    // InternalMyDocker.g:1822:1: ruleExposeArgs returns [EObject current=null] : ( (lv_ports_0_0= ruleExposeArg ) )+ ;
    public final EObject ruleExposeArgs() throws RecognitionException {
        EObject current = null;

        EObject lv_ports_0_0 = null;



        	enterRule();

        try {
            // InternalMyDocker.g:1828:2: ( ( (lv_ports_0_0= ruleExposeArg ) )+ )
            // InternalMyDocker.g:1829:2: ( (lv_ports_0_0= ruleExposeArg ) )+
            {
            // InternalMyDocker.g:1829:2: ( (lv_ports_0_0= ruleExposeArg ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_INT && LA13_0<=RULE_EXPOSE_PORT_PROTOCOL)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDocker.g:1830:3: (lv_ports_0_0= ruleExposeArg )
            	    {
            	    // InternalMyDocker.g:1830:3: (lv_ports_0_0= ruleExposeArg )
            	    // InternalMyDocker.g:1831:4: lv_ports_0_0= ruleExposeArg
            	    {

            	    				newCompositeNode(grammarAccess.getExposeArgsAccess().getPortsExposeArgParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_16);
            	    lv_ports_0_0=ruleExposeArg();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getExposeArgsRule());
            	    				}
            	    				add(
            	    					current,
            	    					"ports",
            	    					lv_ports_0_0,
            	    					"org.xtext.example.mydocker.MyDocker.ExposeArg");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
    // $ANTLR end "ruleExposeArgs"


    // $ANTLR start "entryRuleExposeArg"
    // InternalMyDocker.g:1851:1: entryRuleExposeArg returns [EObject current=null] : iv_ruleExposeArg= ruleExposeArg EOF ;
    public final EObject entryRuleExposeArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExposeArg = null;


        try {
            // InternalMyDocker.g:1851:50: (iv_ruleExposeArg= ruleExposeArg EOF )
            // InternalMyDocker.g:1852:2: iv_ruleExposeArg= ruleExposeArg EOF
            {
             newCompositeNode(grammarAccess.getExposeArgRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExposeArg=ruleExposeArg();

            state._fsp--;

             current =iv_ruleExposeArg; 
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
    // $ANTLR end "entryRuleExposeArg"


    // $ANTLR start "ruleExposeArg"
    // InternalMyDocker.g:1858:1: ruleExposeArg returns [EObject current=null] : ( ( (lv_port_0_0= RULE_INT ) ) | ( (lv_port_protocol_1_0= RULE_EXPOSE_PORT_PROTOCOL ) ) ) ;
    public final EObject ruleExposeArg() throws RecognitionException {
        EObject current = null;

        Token lv_port_0_0=null;
        Token lv_port_protocol_1_0=null;


        	enterRule();

        try {
            // InternalMyDocker.g:1864:2: ( ( ( (lv_port_0_0= RULE_INT ) ) | ( (lv_port_protocol_1_0= RULE_EXPOSE_PORT_PROTOCOL ) ) ) )
            // InternalMyDocker.g:1865:2: ( ( (lv_port_0_0= RULE_INT ) ) | ( (lv_port_protocol_1_0= RULE_EXPOSE_PORT_PROTOCOL ) ) )
            {
            // InternalMyDocker.g:1865:2: ( ( (lv_port_0_0= RULE_INT ) ) | ( (lv_port_protocol_1_0= RULE_EXPOSE_PORT_PROTOCOL ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_EXPOSE_PORT_PROTOCOL) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDocker.g:1866:3: ( (lv_port_0_0= RULE_INT ) )
                    {
                    // InternalMyDocker.g:1866:3: ( (lv_port_0_0= RULE_INT ) )
                    // InternalMyDocker.g:1867:4: (lv_port_0_0= RULE_INT )
                    {
                    // InternalMyDocker.g:1867:4: (lv_port_0_0= RULE_INT )
                    // InternalMyDocker.g:1868:5: lv_port_0_0= RULE_INT
                    {
                    lv_port_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_port_0_0, grammarAccess.getExposeArgAccess().getPortINTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExposeArgRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"port",
                    						lv_port_0_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDocker.g:1885:3: ( (lv_port_protocol_1_0= RULE_EXPOSE_PORT_PROTOCOL ) )
                    {
                    // InternalMyDocker.g:1885:3: ( (lv_port_protocol_1_0= RULE_EXPOSE_PORT_PROTOCOL ) )
                    // InternalMyDocker.g:1886:4: (lv_port_protocol_1_0= RULE_EXPOSE_PORT_PROTOCOL )
                    {
                    // InternalMyDocker.g:1886:4: (lv_port_protocol_1_0= RULE_EXPOSE_PORT_PROTOCOL )
                    // InternalMyDocker.g:1887:5: lv_port_protocol_1_0= RULE_EXPOSE_PORT_PROTOCOL
                    {
                    lv_port_protocol_1_0=(Token)match(input,RULE_EXPOSE_PORT_PROTOCOL,FOLLOW_2); 

                    					newLeafNode(lv_port_protocol_1_0, grammarAccess.getExposeArgAccess().getPort_protocolEXPOSE_PORT_PROTOCOLTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExposeArgRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"port_protocol",
                    						lv_port_protocol_1_0,
                    						"org.xtext.example.mydocker.MyDocker.EXPOSE_PORT_PROTOCOL");
                    				

                    }


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
    // $ANTLR end "ruleExposeArg"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000FFFFC002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000100000070L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000003000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000100000072L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000182L});

}