// $ANTLR 3.2 Sep 23, 2009 12:02:23 JSP.g 2019-11-14 15:50:29

/**
 *  Copyright (c) 2010, 2019 Mia-Software and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 *  
 *  Contributors:
 *  
 *       Nicolas Guyomar (Mia-Software) - initial API and implementation
 * 
 */
  package org.eclipse.modisco.jee.jsp.discoverer.parser;
  import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.jee.jsp.discoverer.JspActivator;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class JSPLexer extends Lexer {
    public static final int DOCTYPE=5;
    public static final int CLOSEXMLCMT=64;
    public static final int JSPOPENATTR=47;
    public static final int Digit=11;
    public static final int CLOSESCRIPTLET=55;
    public static final int OPENDIRECT=60;
    public static final int OPENJSPCMT=61;
    public static final int JSPOPENEXPR=24;
    public static final int T__69=69;
    public static final int JSPUSEBEAN=28;
    public static final int OPENEXPR=56;
    public static final int JSPCLOSEFALL=38;
    public static final int JSPOPENDOBODY=51;
    public static final int JSPCLOSEINC=32;
    public static final int JSPOPENPARA=39;
    public static final int JSPCLOSEPLUG=36;
    public static final int JSPOPENROOT=42;
    public static final int DQUOTE=13;
    public static final int JSPOPENPLUG=35;
    public static final int SQUOTE=14;
    public static final int T__67=67;
    public static final int JSPOPENPARAS=40;
    public static final int CLOSEEXPR=57;
    public static final int JSPCLOSEPARAS=41;
    public static final int T__68=68;
    public static final int OPENCLOSE=21;
    public static final int JSPCLOSEACT=27;
    public static final int XMLDECLOPEN=65;
    public static final int JSPOPENDECL=25;
    public static final int INTERNAL_DTD=17;
    public static final int JSPOPENINC=31;
    public static final int JSPSET=29;
    public static final int JSPGET=30;
    public static final int JSPOPENOUTPUT=52;
    public static final int JSPCLOSEATTR=46;
    public static final int OPENXMLCMT=63;
    public static final int JSPCLOSETEXT=45;
    public static final int ID=8;
    public static final int JSPELEMENTOP=53;
    public static final int LETTER=18;
    public static final int JSPCLOSEFWD=34;
    public static final int CDATA=6;
    public static final int JSPOPENFWD=33;
    public static final int SpecialCharacter=12;
    public static final int JSPOPENTEXT=44;
    public static final int WS=7;
    public static final int JSPCLOSEROOT=43;
    public static final int T__66=66;
    public static final int JSPOPENFALL=37;
    public static final int LINE_COMMENT=10;
    public static final int JSPOPENINVOKE=50;
    public static final int DDOT=15;
    public static final int OPENDECL=58;
    public static final int JSPOPENBODY=48;
    public static final int EQUAL=16;
    public static final int OPENSCRIPLET=54;
    public static final int CLOSEJSPCMT=62;
    public static final int EOF=-1;
    public static final int JSPOPENDIR=26;
    public static final int JSP_COMMENT=9;
    public static final int CLOSEDECL=59;
    public static final int IDDigit=19;
    public static final int JSPTAGOPEN=22;
    public static final int JSPTAGCLOSE=23;
    public static final int JSPCLOSEBODY=49;
    public static final int XMLDECL=4;
    public static final int WS2=20;

    //This method redirect error messages from ANTLR to MoDisco Logger
     @Override
     public void displayRecognitionError(String[] tokenNames,
                                            RecognitionException e) {
            String hdr = getErrorHeader(e);
            String msg = getErrorMessage(e, tokenNames);
               MoDiscoLogger.logWarning("Lexer error in "+this.filePath+" "+hdr+" "+msg, JspActivator.getDefault());
        }
        private String filePath;
        public JSPLexer(CharStream input, String path) {
            super(input);
            this.filePath = path;
        }


    // delegates
    // delegators

    public JSPLexer() {;} 
    public JSPLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public JSPLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "JSP.g"; }

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:40:7: ( '>' )
            // JSP.g:40:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:41:7: ( '<' )
            // JSP.g:41:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:42:7: ( '</jsp:element>' )
            // JSP.g:42:9: '</jsp:element>'
            {
            match("</jsp:element>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:43:7: ( ';' )
            // JSP.g:43:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "CDATA"
    public final void mCDATA() throws RecognitionException {
        try {
            int _type = CDATA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:261:3: ( '<![CDATA[' ( options {greedy=false; } : . )* ']]>' )
            // JSP.g:261:5: '<![CDATA[' ( options {greedy=false; } : . )* ']]>'
            {
            match("<![CDATA["); 

            // JSP.g:261:17: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==']') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==']') ) {
                        int LA1_3 = input.LA(3);

                        if ( (LA1_3=='>') ) {
                            alt1=2;
                        }
                        else if ( ((LA1_3>='\u0000' && LA1_3<='=')||(LA1_3>='?' && LA1_3<='\uFFFF')) ) {
                            alt1=1;
                        }


                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='\\')||(LA1_1>='^' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='\\')||(LA1_0>='^' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // JSP.g:261:44: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match("]]>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CDATA"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1196:3: ( '<!--' ( options {greedy=false; } : . ) ( . )* '-->' )
            // JSP.g:1197:5: '<!--' ( options {greedy=false; } : . ) ( . )* '-->'
            {
            match("<!--"); 

            // JSP.g:1197:12: ( options {greedy=false; } : . )
            // JSP.g:1197:39: .
            {
            matchAny(); 

            }

            // JSP.g:1197:41: ( . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='-') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='-') ) {
                        int LA2_3 = input.LA(3);

                        if ( (LA2_3=='>') ) {
                            alt2=2;
                        }
                        else if ( ((LA2_3>='\u0000' && LA2_3<='=')||(LA2_3>='?' && LA2_3<='\uFFFF')) ) {
                            alt2=1;
                        }


                    }
                    else if ( ((LA2_1>='\u0000' && LA2_1<=',')||(LA2_1>='.' && LA2_1<='\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<=',')||(LA2_0>='.' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // JSP.g:1197:41: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match("-->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LINE_COMMENT"

    // $ANTLR start "JSP_COMMENT"
    public final void mJSP_COMMENT() throws RecognitionException {
        try {
            int _type = JSP_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1201:3: ( '<%--' ( options {greedy=false; } : . ) ( . )* '--%>' )
            // JSP.g:1202:5: '<%--' ( options {greedy=false; } : . ) ( . )* '--%>'
            {
            match("<%--"); 

            // JSP.g:1202:12: ( options {greedy=false; } : . )
            // JSP.g:1202:39: .
            {
            matchAny(); 

            }

            // JSP.g:1202:41: ( . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='-') ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1=='-') ) {
                        int LA3_3 = input.LA(3);

                        if ( (LA3_3=='%') ) {
                            int LA3_4 = input.LA(4);

                            if ( (LA3_4=='>') ) {
                                alt3=2;
                            }
                            else if ( ((LA3_4>='\u0000' && LA3_4<='=')||(LA3_4>='?' && LA3_4<='\uFFFF')) ) {
                                alt3=1;
                            }


                        }
                        else if ( ((LA3_3>='\u0000' && LA3_3<='$')||(LA3_3>='&' && LA3_3<='\uFFFF')) ) {
                            alt3=1;
                        }


                    }
                    else if ( ((LA3_1>='\u0000' && LA3_1<=',')||(LA3_1>='.' && LA3_1<='\uFFFF')) ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0>='\u0000' && LA3_0<=',')||(LA3_0>='.' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // JSP.g:1202:41: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match("--%>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JSP_COMMENT"

    // $ANTLR start "XMLDECL"
    public final void mXMLDECL() throws RecognitionException {
        try {
            int _type = XMLDECL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1206:3: ( '<?' ( 'x' | 'X' ) ( 'm' | 'M' ) ( 'l' | 'L' ) ( options {greedy=false; } : . )* '?>' )
            // JSP.g:1207:3: '<?' ( 'x' | 'X' ) ( 'm' | 'M' ) ( 'l' | 'L' ) ( options {greedy=false; } : . )* '?>'
            {
            match("<?"); 

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // JSP.g:1207:35: ( options {greedy=false; } : . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='?') ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1=='>') ) {
                        alt4=2;
                    }
                    else if ( ((LA4_1>='\u0000' && LA4_1<='=')||(LA4_1>='?' && LA4_1<='\uFFFF')) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0>='\u0000' && LA4_0<='>')||(LA4_0>='@' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // JSP.g:1207:62: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match("?>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "XMLDECL"

    // $ANTLR start "DOCTYPE"
    public final void mDOCTYPE() throws RecognitionException {
        try {
            int _type = DOCTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1211:5: ( '<!' ( 'D' | 'd' ) ( 'O' | 'o' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( options {greedy=false; } : . )* '>' )
            // JSP.g:1212:7: '<!' ( 'D' | 'd' ) ( 'O' | 'o' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( options {greedy=false; } : . )* '>'
            {
            match("<!"); 

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // JSP.g:1212:74: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='>') ) {
                    alt5=2;
                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='=')||(LA5_0>='?' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // JSP.g:1212:101: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOCTYPE"

    // $ANTLR start "INTERNAL_DTD"
    public final void mINTERNAL_DTD() throws RecognitionException {
        try {
            // JSP.g:1215:23: ( '[' ( options {greedy=false; } : . )* ']' )
            // JSP.g:1215:25: '[' ( options {greedy=false; } : . )* ']'
            {
            match('['); 
            // JSP.g:1215:29: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==']') ) {
                    alt6=2;
                }
                else if ( ((LA6_0>='\u0000' && LA6_0<='\\')||(LA6_0>='^' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // JSP.g:1215:56: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match(']'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "INTERNAL_DTD"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1219:5: ( ( LETTER | '_' | '&' | '#' ) ( options {greedy=true; } : LETTER | IDDigit | '.' | '-' | '_' | '@' | '°' )* )
            // JSP.g:1219:7: ( LETTER | '_' | '&' | '#' ) ( options {greedy=true; } : LETTER | IDDigit | '.' | '-' | '_' | '@' | '°' )*
            {
            if ( (input.LA(1)>='#' && input.LA(1)<='$')||input.LA(1)=='&'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00A0'||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u2018' && input.LA(1)<='\u201F')||(input.LA(1)>='\u2032' && input.LA(1)<='\u2037')||input.LA(1)=='\u20AC'||(input.LA(1)>='\u3040' && input.LA(1)<='\u318F')||(input.LA(1)>='\u3300' && input.LA(1)<='\u337F')||(input.LA(1)>='\u3400' && input.LA(1)<='\u3D2D')||(input.LA(1)>='\u4E00' && input.LA(1)<='\u9FFF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFAFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // JSP.g:1220:9: ( options {greedy=true; } : LETTER | IDDigit | '.' | '-' | '_' | '@' | '°' )*
            loop7:
            do {
                int alt7=8;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // JSP.g:1220:36: LETTER
            	    {
            	    mLETTER(); 

            	    }
            	    break;
            	case 2 :
            	    // JSP.g:1220:45: IDDigit
            	    {
            	    mIDDigit(); 

            	    }
            	    break;
            	case 3 :
            	    // JSP.g:1220:55: '.'
            	    {
            	    match('.'); 

            	    }
            	    break;
            	case 4 :
            	    // JSP.g:1220:61: '-'
            	    {
            	    match('-'); 

            	    }
            	    break;
            	case 5 :
            	    // JSP.g:1220:67: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;
            	case 6 :
            	    // JSP.g:1220:74: '@'
            	    {
            	    match('@'); 

            	    }
            	    break;
            	case 7 :
            	    // JSP.g:1220:80: '°'
            	    {
            	    match("°"); 


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // JSP.g:1225:5: ( '\\u0024' | '\\u00A0' | '\\u0041' .. '\\u005a' | '\\u0061' .. '\\u007a' | '\\u00c0' .. '\\u00d6' | '\\u00d8' .. '\\u00f6' | '\\u00f8' .. '\\u00ff' | '\\u0100' .. '\\u1fff' | '\\u3040' .. '\\u318f' | '\\u3300' .. '\\u337f' | '\\u3400' .. '\\u3d2d' | '\\u4e00' .. '\\u9fff' | '\\uf900' .. '\\ufaff' | '\\u20AC' | '\\u2032' .. '\\u2037' | '\\u2018' .. '\\u201F' )
            // JSP.g:
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00A0'||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u2018' && input.LA(1)<='\u201F')||(input.LA(1)>='\u2032' && input.LA(1)<='\u2037')||input.LA(1)=='\u20AC'||(input.LA(1)>='\u3040' && input.LA(1)<='\u318F')||(input.LA(1)>='\u3300' && input.LA(1)<='\u337F')||(input.LA(1)>='\u3400' && input.LA(1)<='\u3D2D')||(input.LA(1)>='\u4E00' && input.LA(1)<='\u9FFF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFAFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "IDDigit"
    public final void mIDDigit() throws RecognitionException {
        try {
            // JSP.g:1247:3: ( '\\u0030' .. '\\u0039' )
            // JSP.g:1248:5: '\\u0030' .. '\\u0039'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "IDDigit"

    // $ANTLR start "SpecialCharacter"
    public final void mSpecialCharacter() throws RecognitionException {
        try {
            int _type = SpecialCharacter;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1253:3: ( '\\u00A0' .. '\\u00FF' | '\\u2400' .. '\\u377F' | '{' | '}' | '|' | '!' | '#' | '$' | '&' | '(' | ')' | '*' | '+' | ',' | '-' | '--' | '.' | '\\/' | ';' | '?' | '[' | ']' | '`' | '%' | '@' | '\\\\' | '//' | '^' )
            int alt8=28;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // JSP.g:1254:5: '\\u00A0' .. '\\u00FF'
                    {
                    matchRange('\u00A0','\u00FF'); 

                    }
                    break;
                case 2 :
                    // JSP.g:1255:6: '\\u2400' .. '\\u377F'
                    {
                    matchRange('\u2400','\u377F'); 

                    }
                    break;
                case 3 :
                    // JSP.g:1256:6: '{'
                    {
                    match('{'); 

                    }
                    break;
                case 4 :
                    // JSP.g:1257:6: '}'
                    {
                    match('}'); 

                    }
                    break;
                case 5 :
                    // JSP.g:1258:6: '|'
                    {
                    match('|'); 

                    }
                    break;
                case 6 :
                    // JSP.g:1259:6: '!'
                    {
                    match('!'); 

                    }
                    break;
                case 7 :
                    // JSP.g:1260:6: '#'
                    {
                    match('#'); 

                    }
                    break;
                case 8 :
                    // JSP.g:1261:6: '$'
                    {
                    match('$'); 

                    }
                    break;
                case 9 :
                    // JSP.g:1262:6: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 10 :
                    // JSP.g:1263:6: '('
                    {
                    match('('); 

                    }
                    break;
                case 11 :
                    // JSP.g:1264:6: ')'
                    {
                    match(')'); 

                    }
                    break;
                case 12 :
                    // JSP.g:1265:6: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 13 :
                    // JSP.g:1266:6: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 14 :
                    // JSP.g:1267:6: ','
                    {
                    match(','); 

                    }
                    break;
                case 15 :
                    // JSP.g:1268:6: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 16 :
                    // JSP.g:1269:6: '--'
                    {
                    match("--"); 


                    }
                    break;
                case 17 :
                    // JSP.g:1270:6: '.'
                    {
                    match('.'); 

                    }
                    break;
                case 18 :
                    // JSP.g:1271:6: '\\/'
                    {
                    match('/'); 

                    }
                    break;
                case 19 :
                    // JSP.g:1272:6: ';'
                    {
                    match(';'); 

                    }
                    break;
                case 20 :
                    // JSP.g:1273:6: '?'
                    {
                    match('?'); 

                    }
                    break;
                case 21 :
                    // JSP.g:1274:6: '['
                    {
                    match('['); 

                    }
                    break;
                case 22 :
                    // JSP.g:1275:6: ']'
                    {
                    match(']'); 

                    }
                    break;
                case 23 :
                    // JSP.g:1276:6: '`'
                    {
                    match('`'); 

                    }
                    break;
                case 24 :
                    // JSP.g:1277:6: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 25 :
                    // JSP.g:1278:6: '@'
                    {
                    match('@'); 

                    }
                    break;
                case 26 :
                    // JSP.g:1279:6: '\\\\'
                    {
                    match('\\'); 

                    }
                    break;
                case 27 :
                    // JSP.g:1280:6: '//'
                    {
                    match("//"); 


                    }
                    break;
                case 28 :
                    // JSP.g:1281:6: '^'
                    {
                    match('^'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SpecialCharacter"

    // $ANTLR start "SQUOTE"
    public final void mSQUOTE() throws RecognitionException {
        try {
            int _type = SQUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1284:8: ( '\\'' )
            // JSP.g:1284:10: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SQUOTE"

    // $ANTLR start "DQUOTE"
    public final void mDQUOTE() throws RecognitionException {
        try {
            int _type = DQUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1285:8: ( '\"' )
            // JSP.g:1285:10: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DQUOTE"

    // $ANTLR start "DDOT"
    public final void mDDOT() throws RecognitionException {
        try {
            int _type = DDOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1286:8: ( ':' )
            // JSP.g:1286:10: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DDOT"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1287:8: ( '=' )
            // JSP.g:1287:10: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1290:3: ( ( ' ' | '\\n' )+ )
            // JSP.g:1292:5: ( ' ' | '\\n' )+
            {
            // JSP.g:1292:5: ( ' ' | '\\n' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\n'||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // JSP.g:
            	    {
            	    if ( input.LA(1)=='\n'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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
    // $ANTLR end "WS"

    // $ANTLR start "WS2"
    public final void mWS2() throws RecognitionException {
        try {
            int _type = WS2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1299:3: ( ( '\\r' | '\\f' | '\\t' )+ )
            // JSP.g:1300:5: ( '\\r' | '\\f' | '\\t' )+
            {
            // JSP.g:1300:5: ( '\\r' | '\\f' | '\\t' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\t'||(LA10_0>='\f' && LA10_0<='\r')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // JSP.g:
            	    {
            	    if ( input.LA(1)=='\t'||(input.LA(1)>='\f' && input.LA(1)<='\r') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS2"

    // $ANTLR start "Digit"
    public final void mDigit() throws RecognitionException {
        try {
            int _type = Digit;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1307:3: ( ( ( '-' | '#' | '+' )? ) ( '\\u0030' .. '\\u0039' ) ( '\\u0030' .. '\\u0039' | '%' | ',' | '.' )* )
            // JSP.g:1309:5: ( ( '-' | '#' | '+' )? ) ( '\\u0030' .. '\\u0039' ) ( '\\u0030' .. '\\u0039' | '%' | ',' | '.' )*
            {
            // JSP.g:1309:5: ( ( '-' | '#' | '+' )? )
            // JSP.g:1309:6: ( '-' | '#' | '+' )?
            {
            // JSP.g:1309:6: ( '-' | '#' | '+' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='#'||LA11_0=='+'||LA11_0=='-') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // JSP.g:
                    {
                    if ( input.LA(1)=='#'||input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            // JSP.g:1309:21: ( '\\u0030' .. '\\u0039' )
            // JSP.g:1309:22: '\\u0030' .. '\\u0039'
            {
            matchRange('0','9'); 

            }

            // JSP.g:1309:41: ( '\\u0030' .. '\\u0039' | '%' | ',' | '.' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='%'||LA12_0==','||LA12_0=='.'||(LA12_0>='0' && LA12_0<='9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // JSP.g:
            	    {
            	    if ( input.LA(1)=='%'||input.LA(1)==','||input.LA(1)=='.'||(input.LA(1)>='0' && input.LA(1)<='9') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Digit"

    // $ANTLR start "OPENCLOSE"
    public final void mOPENCLOSE() throws RecognitionException {
        try {
            int _type = OPENCLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1313:13: ( '</' )
            // JSP.g:1313:15: '</'
            {
            match("</"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPENCLOSE"

    // $ANTLR start "JSPTAGOPEN"
    public final void mJSPTAGOPEN() throws RecognitionException {
        try {
            int _type = JSPTAGOPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1316:13: ( '<%' )
            // JSP.g:1316:15: '<%'
            {
            match("<%"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JSPTAGOPEN"

    // $ANTLR start "JSPTAGCLOSE"
    public final void mJSPTAGCLOSE() throws RecognitionException {
        try {
            int _type = JSPTAGCLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1317:13: ( '%>' )
            // JSP.g:1317:15: '%>'
            {
            match("%>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JSPTAGCLOSE"

    // $ANTLR start "JSPOPENEXPR"
    public final void mJSPOPENEXPR() throws RecognitionException {
        try {
            int _type = JSPOPENEXPR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1318:13: ( '<%=' )
            // JSP.g:1318:15: '<%='
            {
            match("<%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JSPOPENEXPR"

    // $ANTLR start "JSPOPENDECL"
    public final void mJSPOPENDECL() throws RecognitionException {
        try {
            int _type = JSPOPENDECL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1319:13: ( '<%!' )
            // JSP.g:1319:15: '<%!'
            {
            match("<%!"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JSPOPENDECL"

    // $ANTLR start "JSPOPENDIR"
    public final void mJSPOPENDIR() throws RecognitionException {
        try {
            int _type = JSPOPENDIR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1320:13: ( '<%@' )
            // JSP.g:1320:15: '<%@'
            {
            match("<%@"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JSPOPENDIR"

    // $ANTLR start "JSPCLOSEACT"
    public final void mJSPCLOSEACT() throws RecognitionException {
        try {
            int _type = JSPCLOSEACT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1321:13: ( '/>' )
            // JSP.g:1321:15: '/>'
            {
            match("/>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JSPCLOSEACT"

    // $ANTLR start "JSPUSEBEAN"
    public final void mJSPUSEBEAN() throws RecognitionException {
        try {
            int _type = JSPUSEBEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1324:13: ( '<jsp:useBean' )
            // JSP.g:1324:15: '<jsp:useBean'
            {
            match("<jsp:useBean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JSPUSEBEAN"

    // $ANTLR start "JSPSET"
    public final void mJSPSET() throws RecognitionException {
        try {
            int _type = JSPSET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1325:13: ( '<jsp:setProperty' )
            // JSP.g:1325:15: '<jsp:setProperty'
            {
            match("<jsp:setProperty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JSPSET"

    // $ANTLR start "JSPGET"
    public final void mJSPGET() throws RecognitionException {
        try {
            int _type = JSPGET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1326:13: ( '<jsp:getProperty' )
            // JSP.g:1326:15: '<jsp:getProperty'
            {
            match("<jsp:getProperty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JSPGET"

    // $ANTLR start "JSPOPENINC"
    public final void mJSPOPENINC() throws RecognitionException {
        try {
            int _type = JSPOPENINC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1327:13: ( '<jsp:include' )
            // JSP.g:1327:15: '<jsp:include'
            {
            match("<jsp:include"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JSPOPENINC"

    // $ANTLR start "JSPCLOSEINC"
    public final void mJSPCLOSEINC() throws RecognitionException {
        try {
            int _type = JSPCLOSEINC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1328:13: ( '</jsp:include>' )
            // JSP.g:1328:15: '</jsp:include>'
            {
            match("</jsp:include>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JSPCLOSEINC"

    // $ANTLR start "JSPOPENFWD"
    public final void mJSPOPENFWD() throws RecognitionException {
        try {
            int _type = JSPOPENFWD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1329:13: ( '<jsp:forward' )
            // JSP.g:1329:15: '<jsp:forward'
            {
            match("<jsp:forward"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JSPOPENFWD"

    // $ANTLR start "JSPCLOSEFWD"
    public final void mJSPCLOSEFWD() throws RecognitionException {
        try {
            int _type = JSPCLOSEFWD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1330:13: ( '</jsp:forward>' )
            // JSP.g:1330:15: '</jsp:forward>'
            {
            match("</jsp:forward>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JSPCLOSEFWD"

    // $ANTLR start "JSPOPENPLUG"
    public final void mJSPOPENPLUG() throws RecognitionException {
        try {
            int _type = JSPOPENPLUG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1331:13: ( '<jsp:plugin' )
            // JSP.g:1331:15: '<jsp:plugin'
            {
            match("<jsp:plugin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JSPOPENPLUG"

    // $ANTLR start "JSPCLOSEPLUG"
    public final void mJSPCLOSEPLUG() throws RecognitionException {
        try {
            int _type = JSPCLOSEPLUG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1332:13: ( '</jsp:plugin>' )
            // JSP.g:1332:15: '</jsp:plugin>'
            {
            match("</jsp:plugin>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JSPCLOSEPLUG"

    // $ANTLR start "JSPOPENFALL"
    public final void mJSPOPENFALL() throws RecognitionException {
        try {
            int _type = JSPOPENFALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1333:13: ( '<jsp:fallback>' )
            // JSP.g:1333:15: '<jsp:fallback>'
            {
            match("<jsp:fallback>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JSPOPENFALL"

    // $ANTLR start "JSPCLOSEFALL"
    public final void mJSPCLOSEFALL() throws RecognitionException {
        try {
            int _type = JSPCLOSEFALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1334:13: ( '</jsp:fallback>' )
            // JSP.g:1334:15: '</jsp:fallback>'
            {
            match("</jsp:fallback>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JSPCLOSEFALL"

    // $ANTLR start "JSPOPENPARA"
    public final void mJSPOPENPARA() throws RecognitionException {
        try {
            int _type = JSPOPENPARA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1335:13: ( '<jsp:param' )
            // JSP.g:1335:15: '<jsp:param'
            {
            match("<jsp:param"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JSPOPENPARA"

    // $ANTLR start "JSPOPENPARAS"
    public final void mJSPOPENPARAS() throws RecognitionException {
        try {
            int _type = JSPOPENPARAS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1336:13: ( '<jsp:params>' )
            // JSP.g:1336:15: '<jsp:params>'
            {
            match("<jsp:params>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JSPOPENPARAS"

    // $ANTLR start "JSPCLOSEPARAS"
    public final void mJSPCLOSEPARAS() throws RecognitionException {
        try {
            int _type = JSPCLOSEPARAS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1337:14: ( '</jsp:params>' )
            // JSP.g:1337:15: '</jsp:params>'
            {
            match("</jsp:params>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JSPCLOSEPARAS"

    // $ANTLR start "JSPOPENROOT"
    public final void mJSPOPENROOT() throws RecognitionException {
        try {
            int _type = JSPOPENROOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1338:13: ( '<jsp:root' )
            // JSP.g:1338:15: '<jsp:root'
            {
            match("<jsp:root"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JSPOPENROOT"

    // $ANTLR start "JSPCLOSEROOT"
    public final void mJSPCLOSEROOT() throws RecognitionException {
        try {
            int _type = JSPCLOSEROOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1339:13: ( '</jsp:root>' )
            // JSP.g:1339:15: '</jsp:root>'
            {
            match("</jsp:root>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JSPCLOSEROOT"

    // $ANTLR start "JSPOPENTEXT"
    public final void mJSPOPENTEXT() throws RecognitionException {
        try {
            int _type = JSPOPENTEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1340:13: ( '<jsp:text>' )
            // JSP.g:1340:15: '<jsp:text>'
            {
            match("<jsp:text>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JSPOPENTEXT"

    // $ANTLR start "JSPCLOSETEXT"
    public final void mJSPCLOSETEXT() throws RecognitionException {
        try {
            int _type = JSPCLOSETEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1341:13: ( '</jsp:text>' )
            // JSP.g:1341:15: '</jsp:text>'
            {
            match("</jsp:text>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JSPCLOSETEXT"

    // $ANTLR start "JSPCLOSEATTR"
    public final void mJSPCLOSEATTR() throws RecognitionException {
        try {
            int _type = JSPCLOSEATTR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1342:13: ( '</jsp:attribute>' )
            // JSP.g:1342:15: '</jsp:attribute>'
            {
            match("</jsp:attribute>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JSPCLOSEATTR"

    // $ANTLR start "JSPOPENATTR"
    public final void mJSPOPENATTR() throws RecognitionException {
        try {
            int _type = JSPOPENATTR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1343:13: ( '<jsp:attribute' )
            // JSP.g:1343:15: '<jsp:attribute'
            {
            match("<jsp:attribute"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JSPOPENATTR"

    // $ANTLR start "JSPOPENBODY"
    public final void mJSPOPENBODY() throws RecognitionException {
        try {
            int _type = JSPOPENBODY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1344:13: ( '<jsp:body>' )
            // JSP.g:1344:15: '<jsp:body>'
            {
            match("<jsp:body>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JSPOPENBODY"

    // $ANTLR start "JSPCLOSEBODY"
    public final void mJSPCLOSEBODY() throws RecognitionException {
        try {
            int _type = JSPCLOSEBODY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1345:13: ( '</jsp:body>' )
            // JSP.g:1345:15: '</jsp:body>'
            {
            match("</jsp:body>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JSPCLOSEBODY"

    // $ANTLR start "JSPOPENINVOKE"
    public final void mJSPOPENINVOKE() throws RecognitionException {
        try {
            int _type = JSPOPENINVOKE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1346:14: ( '<jsp:invoke' )
            // JSP.g:1346:16: '<jsp:invoke'
            {
            match("<jsp:invoke"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JSPOPENINVOKE"

    // $ANTLR start "JSPOPENDOBODY"
    public final void mJSPOPENDOBODY() throws RecognitionException {
        try {
            int _type = JSPOPENDOBODY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1347:14: ( '<jsp:doBody' )
            // JSP.g:1347:16: '<jsp:doBody'
            {
            match("<jsp:doBody"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JSPOPENDOBODY"

    // $ANTLR start "JSPOPENOUTPUT"
    public final void mJSPOPENOUTPUT() throws RecognitionException {
        try {
            int _type = JSPOPENOUTPUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1348:14: ( '<jsp:output' )
            // JSP.g:1348:16: '<jsp:output'
            {
            match("<jsp:output"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JSPOPENOUTPUT"

    // $ANTLR start "JSPELEMENTOP"
    public final void mJSPELEMENTOP() throws RecognitionException {
        try {
            int _type = JSPELEMENTOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1349:14: ( '<jsp:element' )
            // JSP.g:1349:16: '<jsp:element'
            {
            match("<jsp:element"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JSPELEMENTOP"

    // $ANTLR start "OPENSCRIPLET"
    public final void mOPENSCRIPLET() throws RecognitionException {
        try {
            int _type = OPENSCRIPLET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1353:13: ( '<jsp:scriptlet>' )
            // JSP.g:1353:15: '<jsp:scriptlet>'
            {
            match("<jsp:scriptlet>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPENSCRIPLET"

    // $ANTLR start "CLOSESCRIPTLET"
    public final void mCLOSESCRIPTLET() throws RecognitionException {
        try {
            int _type = CLOSESCRIPTLET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1354:15: ( '</jsp:scriptlet>' )
            // JSP.g:1354:17: '</jsp:scriptlet>'
            {
            match("</jsp:scriptlet>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLOSESCRIPTLET"

    // $ANTLR start "OPENEXPR"
    public final void mOPENEXPR() throws RecognitionException {
        try {
            int _type = OPENEXPR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1355:13: ( '<jsp:expression>' )
            // JSP.g:1355:15: '<jsp:expression>'
            {
            match("<jsp:expression>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPENEXPR"

    // $ANTLR start "CLOSEEXPR"
    public final void mCLOSEEXPR() throws RecognitionException {
        try {
            int _type = CLOSEEXPR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1356:13: ( '</jsp:expression>' )
            // JSP.g:1356:15: '</jsp:expression>'
            {
            match("</jsp:expression>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLOSEEXPR"

    // $ANTLR start "OPENDECL"
    public final void mOPENDECL() throws RecognitionException {
        try {
            int _type = OPENDECL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1357:13: ( '<jsp:declaration>' )
            // JSP.g:1357:15: '<jsp:declaration>'
            {
            match("<jsp:declaration>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPENDECL"

    // $ANTLR start "CLOSEDECL"
    public final void mCLOSEDECL() throws RecognitionException {
        try {
            int _type = CLOSEDECL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1358:13: ( '</jsp:declaration>' )
            // JSP.g:1358:15: '</jsp:declaration>'
            {
            match("</jsp:declaration>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLOSEDECL"

    // $ANTLR start "OPENDIRECT"
    public final void mOPENDIRECT() throws RecognitionException {
        try {
            int _type = OPENDIRECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1359:13: ( '<jsp:directive.' )
            // JSP.g:1359:15: '<jsp:directive.'
            {
            match("<jsp:directive."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPENDIRECT"

    // $ANTLR start "OPENJSPCMT"
    public final void mOPENJSPCMT() throws RecognitionException {
        try {
            int _type = OPENJSPCMT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1362:13: ( '<%--' )
            // JSP.g:1362:15: '<%--'
            {
            match("<%--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPENJSPCMT"

    // $ANTLR start "CLOSEJSPCMT"
    public final void mCLOSEJSPCMT() throws RecognitionException {
        try {
            int _type = CLOSEJSPCMT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1363:13: ( '--%>' )
            // JSP.g:1363:15: '--%>'
            {
            match("--%>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLOSEJSPCMT"

    // $ANTLR start "OPENXMLCMT"
    public final void mOPENXMLCMT() throws RecognitionException {
        try {
            int _type = OPENXMLCMT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1364:13: ( '<!--' )
            // JSP.g:1364:15: '<!--'
            {
            match("<!--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPENXMLCMT"

    // $ANTLR start "CLOSEXMLCMT"
    public final void mCLOSEXMLCMT() throws RecognitionException {
        try {
            int _type = CLOSEXMLCMT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1365:13: ( '-->' )
            // JSP.g:1365:15: '-->'
            {
            match("-->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLOSEXMLCMT"

    // $ANTLR start "XMLDECLOPEN"
    public final void mXMLDECLOPEN() throws RecognitionException {
        try {
            int _type = XMLDECLOPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSP.g:1367:13: ( '<?xml' )
            // JSP.g:1367:15: '<?xml'
            {
            match("<?xml"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "XMLDECLOPEN"

    public void mTokens() throws RecognitionException {
        // JSP.g:1:8: ( T__66 | T__67 | T__68 | T__69 | CDATA | LINE_COMMENT | JSP_COMMENT | XMLDECL | DOCTYPE | ID | SpecialCharacter | SQUOTE | DQUOTE | DDOT | EQUAL | WS | WS2 | Digit | OPENCLOSE | JSPTAGOPEN | JSPTAGCLOSE | JSPOPENEXPR | JSPOPENDECL | JSPOPENDIR | JSPCLOSEACT | JSPUSEBEAN | JSPSET | JSPGET | JSPOPENINC | JSPCLOSEINC | JSPOPENFWD | JSPCLOSEFWD | JSPOPENPLUG | JSPCLOSEPLUG | JSPOPENFALL | JSPCLOSEFALL | JSPOPENPARA | JSPOPENPARAS | JSPCLOSEPARAS | JSPOPENROOT | JSPCLOSEROOT | JSPOPENTEXT | JSPCLOSETEXT | JSPCLOSEATTR | JSPOPENATTR | JSPOPENBODY | JSPCLOSEBODY | JSPOPENINVOKE | JSPOPENDOBODY | JSPOPENOUTPUT | JSPELEMENTOP | OPENSCRIPLET | CLOSESCRIPTLET | OPENEXPR | CLOSEEXPR | OPENDECL | CLOSEDECL | OPENDIRECT | OPENJSPCMT | CLOSEJSPCMT | OPENXMLCMT | CLOSEXMLCMT | XMLDECLOPEN )
        int alt13=63;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // JSP.g:1:10: T__66
                {
                mT__66(); 

                }
                break;
            case 2 :
                // JSP.g:1:16: T__67
                {
                mT__67(); 

                }
                break;
            case 3 :
                // JSP.g:1:22: T__68
                {
                mT__68(); 

                }
                break;
            case 4 :
                // JSP.g:1:28: T__69
                {
                mT__69(); 

                }
                break;
            case 5 :
                // JSP.g:1:34: CDATA
                {
                mCDATA(); 

                }
                break;
            case 6 :
                // JSP.g:1:40: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;
            case 7 :
                // JSP.g:1:53: JSP_COMMENT
                {
                mJSP_COMMENT(); 

                }
                break;
            case 8 :
                // JSP.g:1:65: XMLDECL
                {
                mXMLDECL(); 

                }
                break;
            case 9 :
                // JSP.g:1:73: DOCTYPE
                {
                mDOCTYPE(); 

                }
                break;
            case 10 :
                // JSP.g:1:81: ID
                {
                mID(); 

                }
                break;
            case 11 :
                // JSP.g:1:84: SpecialCharacter
                {
                mSpecialCharacter(); 

                }
                break;
            case 12 :
                // JSP.g:1:101: SQUOTE
                {
                mSQUOTE(); 

                }
                break;
            case 13 :
                // JSP.g:1:108: DQUOTE
                {
                mDQUOTE(); 

                }
                break;
            case 14 :
                // JSP.g:1:115: DDOT
                {
                mDDOT(); 

                }
                break;
            case 15 :
                // JSP.g:1:120: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 16 :
                // JSP.g:1:126: WS
                {
                mWS(); 

                }
                break;
            case 17 :
                // JSP.g:1:129: WS2
                {
                mWS2(); 

                }
                break;
            case 18 :
                // JSP.g:1:133: Digit
                {
                mDigit(); 

                }
                break;
            case 19 :
                // JSP.g:1:139: OPENCLOSE
                {
                mOPENCLOSE(); 

                }
                break;
            case 20 :
                // JSP.g:1:149: JSPTAGOPEN
                {
                mJSPTAGOPEN(); 

                }
                break;
            case 21 :
                // JSP.g:1:160: JSPTAGCLOSE
                {
                mJSPTAGCLOSE(); 

                }
                break;
            case 22 :
                // JSP.g:1:172: JSPOPENEXPR
                {
                mJSPOPENEXPR(); 

                }
                break;
            case 23 :
                // JSP.g:1:184: JSPOPENDECL
                {
                mJSPOPENDECL(); 

                }
                break;
            case 24 :
                // JSP.g:1:196: JSPOPENDIR
                {
                mJSPOPENDIR(); 

                }
                break;
            case 25 :
                // JSP.g:1:207: JSPCLOSEACT
                {
                mJSPCLOSEACT(); 

                }
                break;
            case 26 :
                // JSP.g:1:219: JSPUSEBEAN
                {
                mJSPUSEBEAN(); 

                }
                break;
            case 27 :
                // JSP.g:1:230: JSPSET
                {
                mJSPSET(); 

                }
                break;
            case 28 :
                // JSP.g:1:237: JSPGET
                {
                mJSPGET(); 

                }
                break;
            case 29 :
                // JSP.g:1:244: JSPOPENINC
                {
                mJSPOPENINC(); 

                }
                break;
            case 30 :
                // JSP.g:1:255: JSPCLOSEINC
                {
                mJSPCLOSEINC(); 

                }
                break;
            case 31 :
                // JSP.g:1:267: JSPOPENFWD
                {
                mJSPOPENFWD(); 

                }
                break;
            case 32 :
                // JSP.g:1:278: JSPCLOSEFWD
                {
                mJSPCLOSEFWD(); 

                }
                break;
            case 33 :
                // JSP.g:1:290: JSPOPENPLUG
                {
                mJSPOPENPLUG(); 

                }
                break;
            case 34 :
                // JSP.g:1:302: JSPCLOSEPLUG
                {
                mJSPCLOSEPLUG(); 

                }
                break;
            case 35 :
                // JSP.g:1:315: JSPOPENFALL
                {
                mJSPOPENFALL(); 

                }
                break;
            case 36 :
                // JSP.g:1:327: JSPCLOSEFALL
                {
                mJSPCLOSEFALL(); 

                }
                break;
            case 37 :
                // JSP.g:1:340: JSPOPENPARA
                {
                mJSPOPENPARA(); 

                }
                break;
            case 38 :
                // JSP.g:1:352: JSPOPENPARAS
                {
                mJSPOPENPARAS(); 

                }
                break;
            case 39 :
                // JSP.g:1:365: JSPCLOSEPARAS
                {
                mJSPCLOSEPARAS(); 

                }
                break;
            case 40 :
                // JSP.g:1:379: JSPOPENROOT
                {
                mJSPOPENROOT(); 

                }
                break;
            case 41 :
                // JSP.g:1:391: JSPCLOSEROOT
                {
                mJSPCLOSEROOT(); 

                }
                break;
            case 42 :
                // JSP.g:1:404: JSPOPENTEXT
                {
                mJSPOPENTEXT(); 

                }
                break;
            case 43 :
                // JSP.g:1:416: JSPCLOSETEXT
                {
                mJSPCLOSETEXT(); 

                }
                break;
            case 44 :
                // JSP.g:1:429: JSPCLOSEATTR
                {
                mJSPCLOSEATTR(); 

                }
                break;
            case 45 :
                // JSP.g:1:442: JSPOPENATTR
                {
                mJSPOPENATTR(); 

                }
                break;
            case 46 :
                // JSP.g:1:454: JSPOPENBODY
                {
                mJSPOPENBODY(); 

                }
                break;
            case 47 :
                // JSP.g:1:466: JSPCLOSEBODY
                {
                mJSPCLOSEBODY(); 

                }
                break;
            case 48 :
                // JSP.g:1:479: JSPOPENINVOKE
                {
                mJSPOPENINVOKE(); 

                }
                break;
            case 49 :
                // JSP.g:1:493: JSPOPENDOBODY
                {
                mJSPOPENDOBODY(); 

                }
                break;
            case 50 :
                // JSP.g:1:507: JSPOPENOUTPUT
                {
                mJSPOPENOUTPUT(); 

                }
                break;
            case 51 :
                // JSP.g:1:521: JSPELEMENTOP
                {
                mJSPELEMENTOP(); 

                }
                break;
            case 52 :
                // JSP.g:1:534: OPENSCRIPLET
                {
                mOPENSCRIPLET(); 

                }
                break;
            case 53 :
                // JSP.g:1:547: CLOSESCRIPTLET
                {
                mCLOSESCRIPTLET(); 

                }
                break;
            case 54 :
                // JSP.g:1:562: OPENEXPR
                {
                mOPENEXPR(); 

                }
                break;
            case 55 :
                // JSP.g:1:571: CLOSEEXPR
                {
                mCLOSEEXPR(); 

                }
                break;
            case 56 :
                // JSP.g:1:581: OPENDECL
                {
                mOPENDECL(); 

                }
                break;
            case 57 :
                // JSP.g:1:590: CLOSEDECL
                {
                mCLOSEDECL(); 

                }
                break;
            case 58 :
                // JSP.g:1:600: OPENDIRECT
                {
                mOPENDIRECT(); 

                }
                break;
            case 59 :
                // JSP.g:1:611: OPENJSPCMT
                {
                mOPENJSPCMT(); 

                }
                break;
            case 60 :
                // JSP.g:1:622: CLOSEJSPCMT
                {
                mCLOSEJSPCMT(); 

                }
                break;
            case 61 :
                // JSP.g:1:634: OPENXMLCMT
                {
                mOPENXMLCMT(); 

                }
                break;
            case 62 :
                // JSP.g:1:645: CLOSEXMLCMT
                {
                mCLOSEXMLCMT(); 

                }
                break;
            case 63 :
                // JSP.g:1:657: XMLDECLOPEN
                {
                mXMLDECLOPEN(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA7_eotS =
        "\1\1\1\uffff\1\10\7\uffff";
    static final String DFA7_eofS =
        "\12\uffff";
    static final String DFA7_minS =
        "\1\44\1\uffff\1\u00b0\7\uffff";
    static final String DFA7_maxS =
        "\1\ufaff\1\uffff\1\u00b0\7\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\10\1\uffff\1\2\1\3\1\4\1\5\1\6\1\1\1\7";
    static final String DFA7_specialS =
        "\12\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\10\10\uffff\1\5\1\4\1\uffff\12\3\6\uffff\1\7\32\10\4\uffff"+
            "\1\6\1\uffff\32\10\45\uffff\1\10\37\uffff\2\10\1\2\24\10\1\uffff"+
            "\37\10\1\uffff\u1f08\10\30\uffff\10\10\22\uffff\6\10\164\uffff"+
            "\1\10\u0f93\uffff\u0150\10\u0170\uffff\u0080\10\u0080\uffff"+
            "\u092e\10\u10d2\uffff\u5200\10\u5900\uffff\u0200\10",
            "",
            "\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "()* loopback of 1220:9: ( options {greedy=true; } : LETTER | IDDigit | '.' | '-' | '_' | '@' | '°' )*";
        }
    }
    static final String DFA8_eotS =
        "\17\uffff\1\34\1\uffff\1\36\15\uffff";
    static final String DFA8_eofS =
        "\37\uffff";
    static final String DFA8_minS =
        "\1\41\16\uffff\1\55\1\uffff\1\57\15\uffff";
    static final String DFA8_maxS =
        "\1\u377f\16\uffff\1\55\1\uffff\1\57\15\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\uffff\1\21\1\uffff\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\34\1\20\1\17\1\33\1\22";
    static final String DFA8_specialS =
        "\37\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\6\1\uffff\1\7\1\10\1\27\1\11\1\uffff\1\12\1\13\1\14\1\15"+
            "\1\16\1\17\1\20\1\21\13\uffff\1\22\3\uffff\1\23\1\30\32\uffff"+
            "\1\24\1\31\1\25\1\32\1\uffff\1\26\32\uffff\1\3\1\5\1\4\42\uffff"+
            "\140\1\u2300\uffff\u1380\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\33",
            "",
            "\1\35",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1252:1: SpecialCharacter : ( '\\u00A0' .. '\\u00FF' | '\\u2400' .. '\\u377F' | '{' | '}' | '|' | '!' | '#' | '$' | '&' | '(' | ')' | '*' | '+' | ',' | '-' | '--' | '.' | '\\/' | ';' | '?' | '[' | ']' | '`' | '%' | '@' | '\\\\' | '//' | '^' );";
        }
    }
    static final String DFA13_eotS =
        "\2\uffff\1\33\4\uffff\1\12\3\uffff\4\6\7\uffff\1\42\1\uffff\1\52"+
        "\4\uffff\1\12\1\6\17\uffff\2\12\3\uffff\1\71\1\73\7\uffff\1\77\60"+
        "\uffff\1\157\2\uffff";
    static final String DFA13_eofS =
        "\160\uffff";
    static final String DFA13_minS =
        "\1\11\1\uffff\1\41\4\uffff\1\60\3\uffff\1\60\1\55\2\76\7\uffff"+
        "\1\152\1\55\1\41\1\130\1\163\2\uffff\2\45\2\uffff\1\163\2\uffff"+
        "\1\55\1\uffff\1\55\4\uffff\1\115\1\uffff\1\160\2\45\2\uffff\1\160"+
        "\2\0\1\114\2\72\4\uffff\1\0\2\141\2\uffff\1\143\1\uffff\1\156\2"+
        "\141\4\uffff\1\145\1\uffff\2\154\1\uffff\2\141\10\uffff\1\143\3"+
        "\uffff\1\162\15\uffff\1\141\1\155\1\163\2\uffff";
    static final String DFA13_maxS =
        "\1\ufaff\1\uffff\1\152\4\uffff\1\71\3\uffff\2\71\2\76\7\uffff\1"+
        "\152\1\144\1\100\1\170\1\163\2\uffff\1\71\1\76\2\uffff\1\163\2\uffff"+
        "\1\55\1\uffff\1\55\4\uffff\1\155\1\uffff\1\160\2\71\2\uffff\1\160"+
        "\2\uffff\1\154\2\72\4\uffff\1\uffff\1\165\1\164\2\uffff\1\145\1"+
        "\uffff\1\156\1\157\1\154\4\uffff\1\157\1\uffff\2\170\1\uffff\1\157"+
        "\1\154\10\uffff\1\166\3\uffff\1\162\15\uffff\1\141\1\155\1\163\2"+
        "\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\2\12\1\13\1\uffff\3\12\4\uffff\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\5\uffff\1\2\1\4\2\uffff\1\31\1\25\1"+
        "\uffff\1\23\1\5\1\uffff\1\11\1\uffff\1\26\1\27\1\30\1\24\1\uffff"+
        "\1\10\3\uffff\1\74\1\76\6\uffff\1\6\1\75\1\7\1\73\3\uffff\1\77\1"+
        "\32\1\uffff\1\34\3\uffff\1\50\1\52\1\55\1\56\1\uffff\1\62\2\uffff"+
        "\1\36\2\uffff\1\51\1\53\1\54\1\57\1\65\1\71\1\33\1\64\1\uffff\1"+
        "\37\1\43\1\41\1\uffff\1\61\1\70\1\72\1\63\1\66\1\3\1\67\1\40\1\44"+
        "\1\42\1\47\1\35\1\60\3\uffff\1\46\1\45";
    static final String DFA13_specialS =
        "\63\uffff\1\2\1\0\7\uffff\1\1\63\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\24\1\23\1\uffff\2\24\22\uffff\1\23\1\6\1\20\1\7\1\10\1\16"+
            "\1\11\1\17\3\6\1\13\1\6\1\14\1\6\1\15\12\25\1\21\1\3\1\2\1\22"+
            "\1\1\2\6\32\12\4\6\1\12\1\6\32\12\3\6\42\uffff\1\4\37\6\27\4"+
            "\1\6\37\4\1\6\10\4\u1f00\12\30\uffff\10\12\22\uffff\6\12\164"+
            "\uffff\1\12\u0353\uffff\u0c40\6\u0150\5\u0170\6\u0080\5\u0080"+
            "\6\u0380\5\u05ae\12\u10d2\uffff\u5200\12\u5900\uffff\u0200\12",
            "",
            "\1\27\3\uffff\1\30\11\uffff\1\26\17\uffff\1\31\52\uffff\1"+
            "\32",
            "",
            "",
            "",
            "",
            "\12\35",
            "",
            "",
            "",
            "\12\25",
            "\1\36\2\uffff\12\25",
            "\1\37",
            "\1\40",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\41",
            "\1\44\26\uffff\1\45\26\uffff\1\43\10\uffff\1\45",
            "\1\50\13\uffff\1\46\17\uffff\1\47\2\uffff\1\51",
            "\1\54\37\uffff\1\53",
            "\1\55",
            "",
            "",
            "\1\25\6\uffff\1\25\1\uffff\1\57\1\uffff\12\56",
            "\1\60\30\uffff\1\61",
            "",
            "",
            "\1\62",
            "",
            "",
            "\1\63",
            "",
            "\1\64",
            "",
            "",
            "",
            "",
            "\1\54\37\uffff\1\65",
            "",
            "\1\66",
            "\1\25\6\uffff\1\25\1\uffff\1\57\1\uffff\12\56",
            "\1\25\6\uffff\1\25\1\uffff\1\57\1\uffff\12\56",
            "",
            "",
            "\1\67",
            "\0\70",
            "\0\72",
            "\1\54\37\uffff\1\74",
            "\1\75",
            "\1\76",
            "",
            "",
            "",
            "",
            "\0\54",
            "\1\110\1\111\1\uffff\1\112\1\114\1\104\1\102\1\uffff\1\103"+
            "\5\uffff\1\113\1\105\1\uffff\1\106\1\101\1\107\1\100",
            "\1\123\1\124\1\uffff\1\126\1\115\1\117\2\uffff\1\116\6\uffff"+
            "\1\120\1\uffff\1\121\1\125\1\122",
            "",
            "",
            "\1\130\1\uffff\1\127",
            "",
            "\1\131",
            "\1\133\15\uffff\1\132",
            "\1\135\12\uffff\1\134",
            "",
            "",
            "",
            "",
            "\1\137\3\uffff\1\140\5\uffff\1\136",
            "",
            "\1\141\13\uffff\1\142",
            "\1\143\13\uffff\1\144",
            "",
            "\1\146\15\uffff\1\145",
            "\1\150\12\uffff\1\147",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\151\22\uffff\1\152",
            "",
            "",
            "",
            "\1\153",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\154",
            "\1\155",
            "\1\156",
            "",
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
            return "1:1: Tokens : ( T__66 | T__67 | T__68 | T__69 | CDATA | LINE_COMMENT | JSP_COMMENT | XMLDECL | DOCTYPE | ID | SpecialCharacter | SQUOTE | DQUOTE | DDOT | EQUAL | WS | WS2 | Digit | OPENCLOSE | JSPTAGOPEN | JSPTAGCLOSE | JSPOPENEXPR | JSPOPENDECL | JSPOPENDIR | JSPCLOSEACT | JSPUSEBEAN | JSPSET | JSPGET | JSPOPENINC | JSPCLOSEINC | JSPOPENFWD | JSPCLOSEFWD | JSPOPENPLUG | JSPCLOSEPLUG | JSPOPENFALL | JSPCLOSEFALL | JSPOPENPARA | JSPOPENPARAS | JSPCLOSEPARAS | JSPOPENROOT | JSPCLOSEROOT | JSPOPENTEXT | JSPCLOSETEXT | JSPCLOSEATTR | JSPOPENATTR | JSPOPENBODY | JSPCLOSEBODY | JSPOPENINVOKE | JSPOPENDOBODY | JSPOPENOUTPUT | JSPELEMENTOP | OPENSCRIPLET | CLOSESCRIPTLET | OPENEXPR | CLOSEEXPR | OPENDECL | CLOSEDECL | OPENDIRECT | OPENJSPCMT | CLOSEJSPCMT | OPENXMLCMT | CLOSEXMLCMT | XMLDECLOPEN );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_52 = input.LA(1);

                        s = -1;
                        if ( ((LA13_52>='\u0000' && LA13_52<='\uFFFF')) ) {s = 58;}

                        else s = 59;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_60 = input.LA(1);

                        s = -1;
                        if ( ((LA13_60>='\u0000' && LA13_60<='\uFFFF')) ) {s = 44;}

                        else s = 63;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_51 = input.LA(1);

                        s = -1;
                        if ( ((LA13_51>='\u0000' && LA13_51<='\uFFFF')) ) {s = 56;}

                        else s = 57;

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