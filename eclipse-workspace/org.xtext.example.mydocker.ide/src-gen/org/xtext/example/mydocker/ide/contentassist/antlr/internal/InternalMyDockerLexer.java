package org.xtext.example.mydocker.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDockerLexer extends Lexer {
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

    public InternalMyDockerLexer() {;} 
    public InternalMyDockerLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDockerLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDocker.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDocker.g:11:7: ( '[' )
            // InternalMyDocker.g:11:9: '['
            {
            match('['); 

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
            // InternalMyDocker.g:12:7: ( ']' )
            // InternalMyDocker.g:12:9: ']'
            {
            match(']'); 

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
            // InternalMyDocker.g:13:7: ( ',' )
            // InternalMyDocker.g:13:9: ','
            {
            match(','); 

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
            // InternalMyDocker.g:14:7: ( '=' )
            // InternalMyDocker.g:14:9: '='
            {
            match('='); 

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
            // InternalMyDocker.g:15:7: ( 'CMD' )
            // InternalMyDocker.g:15:9: 'CMD'
            {
            match("CMD"); 


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
            // InternalMyDocker.g:16:7: ( '--' )
            // InternalMyDocker.g:16:9: '--'
            {
            match("--"); 


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
            // InternalMyDocker.g:17:7: ( 'ADD' )
            // InternalMyDocker.g:17:9: 'ADD'
            {
            match("ADD"); 


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
            // InternalMyDocker.g:18:7: ( 'ARG' )
            // InternalMyDocker.g:18:9: 'ARG'
            {
            match("ARG"); 


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
            // InternalMyDocker.g:19:7: ( 'COPY' )
            // InternalMyDocker.g:19:9: 'COPY'
            {
            match("COPY"); 


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
            // InternalMyDocker.g:20:7: ( 'ENTRYPOINT' )
            // InternalMyDocker.g:20:9: 'ENTRYPOINT'
            {
            match("ENTRYPOINT"); 


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
            // InternalMyDocker.g:21:7: ( 'ENV' )
            // InternalMyDocker.g:21:9: 'ENV'
            {
            match("ENV"); 


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
            // InternalMyDocker.g:22:7: ( 'EXPOSE' )
            // InternalMyDocker.g:22:9: 'EXPOSE'
            {
            match("EXPOSE"); 


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
            // InternalMyDocker.g:23:7: ( 'FROM' )
            // InternalMyDocker.g:23:9: 'FROM'
            {
            match("FROM"); 


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
            // InternalMyDocker.g:24:7: ( 'HEALTHCHECK' )
            // InternalMyDocker.g:24:9: 'HEALTHCHECK'
            {
            match("HEALTHCHECK"); 


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
            // InternalMyDocker.g:25:7: ( 'LABEL' )
            // InternalMyDocker.g:25:9: 'LABEL'
            {
            match("LABEL"); 


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
            // InternalMyDocker.g:26:7: ( 'MAINTAINER' )
            // InternalMyDocker.g:26:9: 'MAINTAINER'
            {
            match("MAINTAINER"); 


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
            // InternalMyDocker.g:27:7: ( 'ONBUILD' )
            // InternalMyDocker.g:27:9: 'ONBUILD'
            {
            match("ONBUILD"); 


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
            // InternalMyDocker.g:28:7: ( 'RUN' )
            // InternalMyDocker.g:28:9: 'RUN'
            {
            match("RUN"); 


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
            // InternalMyDocker.g:29:7: ( 'SHELL' )
            // InternalMyDocker.g:29:9: 'SHELL'
            {
            match("SHELL"); 


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
            // InternalMyDocker.g:30:7: ( 'STOPSIGNAL' )
            // InternalMyDocker.g:30:9: 'STOPSIGNAL'
            {
            match("STOPSIGNAL"); 


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
            // InternalMyDocker.g:31:7: ( 'USER' )
            // InternalMyDocker.g:31:9: 'USER'
            {
            match("USER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDocker.g:32:7: ( 'VOLUME' )
            // InternalMyDocker.g:32:9: 'VOLUME'
            {
            match("VOLUME"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDocker.g:33:7: ( 'WORKDIR' )
            // InternalMyDocker.g:33:9: 'WORKDIR'
            {
            match("WORKDIR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDocker.g:34:7: ( 'None' )
            // InternalMyDocker.g:34:9: 'None'
            {
            match("None"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "RULE_EXPOSE_PORT_PROTOCOL"
    public final void mRULE_EXPOSE_PORT_PROTOCOL() throws RecognitionException {
        try {
            int _type = RULE_EXPOSE_PORT_PROTOCOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDocker.g:3719:27: ( ( '0' .. '9' )+ '/' ( 'a' .. 'z' | '_' | '-' )+ )
            // InternalMyDocker.g:3719:29: ( '0' .. '9' )+ '/' ( 'a' .. 'z' | '_' | '-' )+
            {
            // InternalMyDocker.g:3719:29: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDocker.g:3719:30: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            match('/'); 
            // InternalMyDocker.g:3719:45: ( 'a' .. 'z' | '_' | '-' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='-'||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDocker.g:
            	    {
            	    if ( input.LA(1)=='-'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPOSE_PORT_PROTOCOL"

    // $ANTLR start "RULE_RAW_VALUE"
    public final void mRULE_RAW_VALUE() throws RecognitionException {
        try {
            int _type = RULE_RAW_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDocker.g:3721:16: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '/' | '.' | '\\\\' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' | '/' | '.' | '\\\\' | ':' )* )
            // InternalMyDocker.g:3721:18: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '/' | '.' | '\\\\' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' | '/' | '.' | '\\\\' | ':' )*
            {
            if ( (input.LA(1)>='-' && input.LA(1)<='/')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='\\'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDocker.g:3721:59: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' | '/' | '.' | '\\\\' | ':' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='-' && LA3_0<=':')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='\\'||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDocker.g:
            	    {
            	    if ( (input.LA(1)>='-' && input.LA(1)<=':')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='\\'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
    // $ANTLR end "RULE_RAW_VALUE"

    // $ANTLR start "RULE_SH_COMMENT"
    public final void mRULE_SH_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SH_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDocker.g:3723:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDocker.g:3723:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // InternalMyDocker.g:3723:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDocker.g:3723:23: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop4;
                }
            } while (true);

            // InternalMyDocker.g:3723:39: ( ( '\\r' )? '\\n' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDocker.g:3723:40: ( '\\r' )? '\\n'
                    {
                    // InternalMyDocker.g:3723:40: ( '\\r' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\r') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalMyDocker.g:3723:40: '\\r'
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
    // $ANTLR end "RULE_SH_COMMENT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDocker.g:3725:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDocker.g:3725:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDocker.g:3725:11: ( '^' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='^') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDocker.g:3725:11: '^'
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

            // InternalMyDocker.g:3725:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDocker.g:
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
            	    break loop8;
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
            // InternalMyDocker.g:3727:10: ( ( '0' .. '9' )+ )
            // InternalMyDocker.g:3727:12: ( '0' .. '9' )+
            {
            // InternalMyDocker.g:3727:12: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDocker.g:3727:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
            // InternalMyDocker.g:3729:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDocker.g:3729:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDocker.g:3729:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"') ) {
                alt12=1;
            }
            else if ( (LA12_0=='\'') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDocker.g:3729:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDocker.g:3729:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalMyDocker.g:3729:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDocker.g:3729:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDocker.g:3729:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDocker.g:3729:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalMyDocker.g:3729:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDocker.g:3729:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop11;
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
            // InternalMyDocker.g:3731:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDocker.g:3731:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDocker.g:3731:24: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='/') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='.')||(LA13_1>='0' && LA13_1<='\uFFFF')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDocker.g:3731:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
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
            // InternalMyDocker.g:3733:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDocker.g:3733:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDocker.g:3733:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDocker.g:3733:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop14;
                }
            } while (true);

            // InternalMyDocker.g:3733:40: ( ( '\\r' )? '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\n'||LA16_0=='\r') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDocker.g:3733:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDocker.g:3733:41: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalMyDocker.g:3733:41: '\\r'
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
            // InternalMyDocker.g:3735:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDocker.g:3735:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDocker.g:3735:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDocker.g:
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
            // InternalMyDocker.g:3737:16: ( . )
            // InternalMyDocker.g:3737:18: .
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
        // InternalMyDocker.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_EXPOSE_PORT_PROTOCOL | RULE_RAW_VALUE | RULE_SH_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt18=34;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // InternalMyDocker.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalMyDocker.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalMyDocker.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalMyDocker.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalMyDocker.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalMyDocker.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalMyDocker.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalMyDocker.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalMyDocker.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalMyDocker.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalMyDocker.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalMyDocker.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalMyDocker.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalMyDocker.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalMyDocker.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalMyDocker.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalMyDocker.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalMyDocker.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalMyDocker.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalMyDocker.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalMyDocker.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalMyDocker.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalMyDocker.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalMyDocker.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalMyDocker.g:1:154: RULE_EXPOSE_PORT_PROTOCOL
                {
                mRULE_EXPOSE_PORT_PROTOCOL(); 

                }
                break;
            case 26 :
                // InternalMyDocker.g:1:180: RULE_RAW_VALUE
                {
                mRULE_RAW_VALUE(); 

                }
                break;
            case 27 :
                // InternalMyDocker.g:1:195: RULE_SH_COMMENT
                {
                mRULE_SH_COMMENT(); 

                }
                break;
            case 28 :
                // InternalMyDocker.g:1:211: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 29 :
                // InternalMyDocker.g:1:219: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 30 :
                // InternalMyDocker.g:1:228: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 31 :
                // InternalMyDocker.g:1:240: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 32 :
                // InternalMyDocker.g:1:256: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 33 :
                // InternalMyDocker.g:1:272: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 34 :
                // InternalMyDocker.g:1:280: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\5\uffff\17\45\1\71\1\45\1\uffff\1\35\1\45\2\35\7\uffff\3\45\1\uffff\1\102\20\45\1\uffff\1\71\4\uffff\1\45\2\uffff\1\126\1\45\1\uffff\1\130\1\131\1\45\1\133\6\45\1\142\7\45\2\uffff\1\151\2\uffff\1\45\1\uffff\1\45\1\154\4\45\1\uffff\2\45\1\163\2\45\1\166\1\uffff\2\45\1\uffff\1\45\1\172\2\45\1\175\1\45\1\uffff\2\45\1\uffff\1\45\1\u0082\1\45\1\uffff\2\45\1\uffff\1\45\1\u0087\2\45\1\uffff\2\45\1\u008c\1\45\1\uffff\1\u008e\3\45\1\uffff\1\45\1\uffff\4\45\1\u0097\1\45\1\u0099\1\u009a\1\uffff\1\u009b\3\uffff";
    static final String DFA18_eofS =
        "\u009c\uffff";
    static final String DFA18_minS =
        "\1\0\4\uffff\1\60\1\55\15\60\1\57\1\60\1\uffff\1\101\1\52\2\0\7\uffff\3\60\1\uffff\1\55\20\60\1\uffff\1\57\4\uffff\1\0\2\uffff\1\55\1\60\1\uffff\2\55\1\60\1\55\6\60\1\55\6\60\1\0\2\uffff\1\55\2\uffff\1\60\1\uffff\1\60\1\55\4\60\1\uffff\2\60\1\55\2\60\1\55\1\uffff\2\60\1\uffff\1\60\1\55\2\60\1\55\1\60\1\uffff\2\60\1\uffff\1\60\1\55\1\60\1\uffff\2\60\1\uffff\1\60\1\55\2\60\1\uffff\2\60\1\55\1\60\1\uffff\1\55\3\60\1\uffff\1\60\1\uffff\4\60\1\55\1\60\2\55\1\uffff\1\55\3\uffff";
    static final String DFA18_maxS =
        "\1\uffff\4\uffff\1\172\1\55\15\172\1\71\1\172\1\uffff\1\172\1\57\2\uffff\7\uffff\3\172\1\uffff\21\172\1\uffff\1\71\4\uffff\1\uffff\2\uffff\2\172\1\uffff\21\172\1\uffff\2\uffff\1\172\2\uffff\1\172\1\uffff\6\172\1\uffff\6\172\1\uffff\2\172\1\uffff\6\172\1\uffff\2\172\1\uffff\3\172\1\uffff\2\172\1\uffff\4\172\1\uffff\4\172\1\uffff\4\172\1\uffff\1\172\1\uffff\10\172\1\uffff\1\172\3\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\21\uffff\1\33\4\uffff\1\32\1\41\1\42\1\1\1\2\1\3\1\4\3\uffff\1\32\21\uffff\1\31\1\uffff\1\35\1\33\1\34\1\37\1\uffff\1\36\1\41\2\uffff\1\6\22\uffff\1\40\1\5\1\uffff\1\7\1\10\1\uffff\1\13\6\uffff\1\22\6\uffff\1\11\2\uffff\1\15\6\uffff\1\25\2\uffff\1\30\3\uffff\1\17\2\uffff\1\23\4\uffff\1\14\4\uffff\1\26\4\uffff\1\21\1\uffff\1\27\10\uffff\1\12\1\uffff\1\20\1\24\1\16";
    static final String DFA18_specialS =
        "\1\3\30\uffff\1\4\1\1\42\uffff\1\2\26\uffff\1\0\107\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\35\2\34\2\35\1\34\22\35\1\34\1\35\1\31\1\26\3\35\1\32\4\35\1\3\1\6\1\33\1\30\12\24\3\35\1\4\3\35\1\7\1\25\1\5\1\25\1\10\1\11\1\25\1\12\3\25\1\13\1\14\1\23\1\15\2\25\1\16\1\17\1\25\1\20\1\21\1\22\3\25\1\1\1\33\1\2\1\27\1\25\1\35\32\25\uff85\35",
            "",
            "",
            "",
            "",
            "\12\44\7\uffff\14\44\1\42\1\44\1\43\13\44\4\uffff\1\44\1\uffff\32\44",
            "\1\46",
            "\12\44\7\uffff\3\44\1\47\15\44\1\50\10\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\15\44\1\51\11\44\1\52\2\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\21\44\1\53\10\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\4\44\1\54\25\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\1\55\31\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\1\56\31\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\15\44\1\57\14\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\24\44\1\60\5\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\7\44\1\61\13\44\1\62\6\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\22\44\1\63\7\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\16\44\1\64\13\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\16\44\1\65\13\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\16\44\1\66\13\44",
            "\1\67\12\70",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\74\4\uffff\1\75",
            "\0\76",
            "\0\76",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\44\7\uffff\3\44\1\100\26\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\17\44\1\101\12\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\16\45\6\uffff\32\45\1\uffff\1\45\2\uffff\1\45\1\uffff\32\45",
            "\12\44\7\uffff\3\44\1\103\26\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\6\44\1\104\23\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\23\44\1\105\1\44\1\106\4\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\17\44\1\107\12\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\16\44\1\110\13\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\1\111\31\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\1\44\1\112\30\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\10\44\1\113\21\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\1\44\1\114\30\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\15\44\1\115\14\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\4\44\1\116\25\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\16\44\1\117\13\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\4\44\1\120\25\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\13\44\1\121\16\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\21\44\1\122\10\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\15\44\1\123\14\44",
            "",
            "\1\67\12\70",
            "",
            "",
            "",
            "",
            "\55\125\16\124\6\125\32\124\1\125\1\124\2\125\1\124\1\125\32\124\uff85\125",
            "",
            "",
            "\3\45\12\44\1\45\6\uffff\32\44\1\uffff\1\45\2\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\30\44\1\127\1\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\3\45\12\44\1\45\6\uffff\32\44\1\uffff\1\45\2\uffff\1\44\1\uffff\32\44",
            "\3\45\12\44\1\45\6\uffff\32\44\1\uffff\1\45\2\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\21\44\1\132\10\44\4\uffff\1\44\1\uffff\32\44",
            "\3\45\12\44\1\45\6\uffff\32\44\1\uffff\1\45\2\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\16\44\1\134\13\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\14\44\1\135\15\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\13\44\1\136\16\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\4\44\1\137\25\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\15\44\1\140\14\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\24\44\1\141\5\44\4\uffff\1\44\1\uffff\32\44",
            "\3\45\12\44\1\45\6\uffff\32\44\1\uffff\1\45\2\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\13\44\1\143\16\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\17\44\1\144\12\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\21\44\1\145\10\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\24\44\1\146\5\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\12\44\1\147\17\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\4\44\1\150\25\44",
            "\55\125\16\124\6\125\32\124\1\125\1\124\2\125\1\124\1\125\32\124\uff85\125",
            "",
            "",
            "\3\45\12\44\1\45\6\uffff\32\44\1\uffff\1\45\2\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\12\44\7\uffff\30\44\1\152\1\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\22\44\1\153\7\44\4\uffff\1\44\1\uffff\32\44",
            "\3\45\12\44\1\45\6\uffff\32\44\1\uffff\1\45\2\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\23\44\1\155\6\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\13\44\1\156\16\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\23\44\1\157\6\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\10\44\1\160\21\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\13\44\1\161\16\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\22\44\1\162\7\44\4\uffff\1\44\1\uffff\32\44",
            "\3\45\12\44\1\45\6\uffff\32\44\1\uffff\1\45\2\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\14\44\1\164\15\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\3\44\1\165\26\44\4\uffff\1\44\1\uffff\32\44",
            "\3\45\12\44\1\45\6\uffff\32\44\1\uffff\1\45\2\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\17\44\1\167\12\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\4\44\1\170\25\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\7\44\1\171\22\44\4\uffff\1\44\1\uffff\32\44",
            "\3\45\12\44\1\45\6\uffff\32\44\1\uffff\1\45\2\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\1\173\31\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\13\44\1\174\16\44\4\uffff\1\44\1\uffff\32\44",
            "\3\45\12\44\1\45\6\uffff\32\44\1\uffff\1\45\2\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\10\44\1\176\21\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\4\44\1\177\25\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\10\44\1\u0080\21\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\16\44\1\u0081\13\44\4\uffff\1\44\1\uffff\32\44",
            "\3\45\12\44\1\45\6\uffff\32\44\1\uffff\1\45\2\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\2\44\1\u0083\27\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\10\44\1\u0084\21\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\3\44\1\u0085\26\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\6\44\1\u0086\23\44\4\uffff\1\44\1\uffff\32\44",
            "\3\45\12\44\1\45\6\uffff\32\44\1\uffff\1\45\2\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\21\44\1\u0088\10\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\10\44\1\u0089\21\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\7\44\1\u008a\22\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\15\44\1\u008b\14\44\4\uffff\1\44\1\uffff\32\44",
            "\3\45\12\44\1\45\6\uffff\32\44\1\uffff\1\45\2\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\15\44\1\u008d\14\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\3\45\12\44\1\45\6\uffff\32\44\1\uffff\1\45\2\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\15\44\1\u008f\14\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\4\44\1\u0090\25\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\4\44\1\u0091\25\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\1\u0092\31\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\23\44\1\u0093\6\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\2\44\1\u0094\27\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\21\44\1\u0095\10\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\13\44\1\u0096\16\44\4\uffff\1\44\1\uffff\32\44",
            "\3\45\12\44\1\45\6\uffff\32\44\1\uffff\1\45\2\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\12\44\1\u0098\17\44\4\uffff\1\44\1\uffff\32\44",
            "\3\45\12\44\1\45\6\uffff\32\44\1\uffff\1\45\2\uffff\1\44\1\uffff\32\44",
            "\3\45\12\44\1\45\6\uffff\32\44\1\uffff\1\45\2\uffff\1\44\1\uffff\32\44",
            "",
            "\3\45\12\44\1\45\6\uffff\32\44\1\uffff\1\45\2\uffff\1\44\1\uffff\32\44",
            "",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_EXPOSE_PORT_PROTOCOL | RULE_RAW_VALUE | RULE_SH_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_84 = input.LA(1);

                        s = -1;
                        if ( ((LA18_84>='-' && LA18_84<=':')||(LA18_84>='A' && LA18_84<='Z')||LA18_84=='\\'||LA18_84=='_'||(LA18_84>='a' && LA18_84<='z')) ) {s = 84;}

                        else if ( ((LA18_84>='\u0000' && LA18_84<=',')||(LA18_84>=';' && LA18_84<='@')||LA18_84=='['||(LA18_84>=']' && LA18_84<='^')||LA18_84=='`'||(LA18_84>='{' && LA18_84<='\uFFFF')) ) {s = 85;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_26 = input.LA(1);

                        s = -1;
                        if ( ((LA18_26>='\u0000' && LA18_26<='\uFFFF')) ) {s = 62;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_61 = input.LA(1);

                        s = -1;
                        if ( ((LA18_61>='-' && LA18_61<=':')||(LA18_61>='A' && LA18_61<='Z')||LA18_61=='\\'||LA18_61=='_'||(LA18_61>='a' && LA18_61<='z')) ) {s = 84;}

                        else if ( ((LA18_61>='\u0000' && LA18_61<=',')||(LA18_61>=';' && LA18_61<='@')||LA18_61=='['||(LA18_61>=']' && LA18_61<='^')||LA18_61=='`'||(LA18_61>='{' && LA18_61<='\uFFFF')) ) {s = 85;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0=='[') ) {s = 1;}

                        else if ( (LA18_0==']') ) {s = 2;}

                        else if ( (LA18_0==',') ) {s = 3;}

                        else if ( (LA18_0=='=') ) {s = 4;}

                        else if ( (LA18_0=='C') ) {s = 5;}

                        else if ( (LA18_0=='-') ) {s = 6;}

                        else if ( (LA18_0=='A') ) {s = 7;}

                        else if ( (LA18_0=='E') ) {s = 8;}

                        else if ( (LA18_0=='F') ) {s = 9;}

                        else if ( (LA18_0=='H') ) {s = 10;}

                        else if ( (LA18_0=='L') ) {s = 11;}

                        else if ( (LA18_0=='M') ) {s = 12;}

                        else if ( (LA18_0=='O') ) {s = 13;}

                        else if ( (LA18_0=='R') ) {s = 14;}

                        else if ( (LA18_0=='S') ) {s = 15;}

                        else if ( (LA18_0=='U') ) {s = 16;}

                        else if ( (LA18_0=='V') ) {s = 17;}

                        else if ( (LA18_0=='W') ) {s = 18;}

                        else if ( (LA18_0=='N') ) {s = 19;}

                        else if ( ((LA18_0>='0' && LA18_0<='9')) ) {s = 20;}

                        else if ( (LA18_0=='B'||LA18_0=='D'||LA18_0=='G'||(LA18_0>='I' && LA18_0<='K')||(LA18_0>='P' && LA18_0<='Q')||LA18_0=='T'||(LA18_0>='X' && LA18_0<='Z')||LA18_0=='_'||(LA18_0>='a' && LA18_0<='z')) ) {s = 21;}

                        else if ( (LA18_0=='#') ) {s = 22;}

                        else if ( (LA18_0=='^') ) {s = 23;}

                        else if ( (LA18_0=='/') ) {s = 24;}

                        else if ( (LA18_0=='\"') ) {s = 25;}

                        else if ( (LA18_0=='\'') ) {s = 26;}

                        else if ( (LA18_0=='.'||LA18_0=='\\') ) {s = 27;}

                        else if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {s = 28;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\b')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\u001F')||LA18_0=='!'||(LA18_0>='$' && LA18_0<='&')||(LA18_0>='(' && LA18_0<='+')||(LA18_0>=':' && LA18_0<='<')||(LA18_0>='>' && LA18_0<='@')||LA18_0=='`'||(LA18_0>='{' && LA18_0<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA18_25 = input.LA(1);

                        s = -1;
                        if ( ((LA18_25>='\u0000' && LA18_25<='\uFFFF')) ) {s = 62;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}