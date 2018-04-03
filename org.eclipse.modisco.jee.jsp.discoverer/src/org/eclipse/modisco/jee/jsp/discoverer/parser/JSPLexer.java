// $ANTLR 3.0 C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g 2010-10-25 10:23:41

/**
 *  Copyright (c) 2010 Mia-Software.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *
 *       Nicolas Guyomar (Mia-Software) - initial API and implementation
 *
 */
  package org.eclipse.modisco.jee.jsp.discoverer.parser;
  import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
  import org.eclipse.modisco.jee.jsp.discoverer.JspActivator;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class JSPLexer extends Lexer {
    public static final int JSPOPENEXPR=24;
    public static final int OPENJSPCMT=61;
    public static final int CLOSEEXPR=57;
    public static final int CDATA=6;
    public static final int JSPCLOSEFWD=34;
    public static final int JSPCLOSEFALL=38;
    public static final int LETTER=18;
    public static final int OPENDECL=58;
    public static final int DQUOTE=13;
    public static final int CLOSEXMLCMT=64;
    public static final int CLOSESCRIPTLET=55;
    public static final int JSPCLOSEACT=27;
    public static final int ID=8;
    public static final int EOF=-1;
    public static final int JSPOPENINVOKE=50;
    public static final int CLOSEDECL=59;
    public static final int JSPOPENOUTPUT=52;
    public static final int JSPCLOSEINC=32;
    public static final int JSPOPENFALL=37;
    public static final int JSP_COMMENT=9;
    public static final int T66=66;
    public static final int JSPTAGOPEN=22;
    public static final int T67=67;
    public static final int CLOSEJSPCMT=62;
    public static final int T68=68;
    public static final int T69=69;
    public static final int JSPCLOSEBODY=49;
    public static final int EQUAL=16;
    public static final int JSPOPENPLUG=35;
    public static final int OPENSCRIPLET=54;
    public static final int OPENEXPR=56;
    public static final int JSPCLOSEPARAS=41;
    public static final int DOCTYPE=5;
    public static final int XMLDECLOPEN=65;
    public static final int IDDigit=19;
    public static final int SpecialCharacter=12;
    public static final int JSPOPENPARAS=40;
    public static final int OPENDIRECT=60;
    public static final int JSPOPENTEXT=44;
    public static final int JSPCLOSEPLUG=36;
    public static final int DDOT=15;
    public static final int JSPOPENDOBODY=51;
    public static final int LINE_COMMENT=10;
    public static final int OPENCLOSE=21;
    public static final int JSPCLOSETEXT=45;
    public static final int JSPOPENDIR=26;
    public static final int XMLDECL=4;
    public static final int JSPTAGCLOSE=23;
    public static final int OPENXMLCMT=63;
    public static final int SQUOTE=14;
    public static final int INTERNAL_DTD=17;
    public static final int Digit=11;
    public static final int Tokens=70;
    public static final int JSPOPENINC=31;
    public static final int JSPOPENDECL=25;
    public static final int JSPCLOSEATTR=46;
    public static final int JSPOPENATTR=47;
    public static final int JSPCLOSEROOT=43;
    public static final int JSPOPENFWD=33;
    public static final int WS=7;
    public static final int JSPUSEBEAN=28;
    public static final int JSPSET=29;
    public static final int JSPGET=30;
    public static final int JSPOPENBODY=48;
    public static final int WS2=20;
    public static final int JSPELEMENTOP=53;
    public static final int JSPOPENPARA=39;
    public static final int JSPOPENROOT=42;

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

    public JSPLexer() {;}
    public JSPLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g"; }

    // $ANTLR start T66
    public final void mT66() throws RecognitionException {
        try {
            int _type = T66;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:39:7: ( '>' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:39:7: '>'
            {
            match('>');

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T66

    // $ANTLR start T67
    public final void mT67() throws RecognitionException {
        try {
            int _type = T67;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:40:7: ( '<' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:40:7: '<'
            {
            match('<');

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T67

    // $ANTLR start T68
    public final void mT68() throws RecognitionException {
        try {
            int _type = T68;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:41:7: ( '</jsp:element>' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:41:7: '</jsp:element>'
            {
            match("</jsp:element>");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T68

    // $ANTLR start T69
    public final void mT69() throws RecognitionException {
        try {
            int _type = T69;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:42:7: ( ';' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:42:7: ';'
            {
            match(';');

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T69

    // $ANTLR start CDATA
    public final void mCDATA() throws RecognitionException {
        try {
            int _type = CDATA;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:261:5: ( '<![CDATA[' ( options {greedy=false; } : . )* ']]>' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:261:5: '<![CDATA[' ( options {greedy=false; } : . )* ']]>'
            {
            match("<![CDATA[");

            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:261:17: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==']') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==']') ) {
                        int LA1_3 = input.LA(3);

                        if ( ((LA1_3>='\u0000' && LA1_3<='=')||(LA1_3>='?' && LA1_3<='\uFFFE')) ) {
                            alt1=1;
                        }
                        else if ( (LA1_3=='>') ) {
                            alt1=2;
                        }


                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='\\')||(LA1_1>='^' && LA1_1<='\uFFFE')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='\\')||(LA1_0>='^' && LA1_0<='\uFFFE')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:261:44: .
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CDATA

    // $ANTLR start LINE_COMMENT
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1197:5: ( '<!--' ( options {greedy=false; } : . ) ( . )* '-->' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1197:5: '<!--' ( options {greedy=false; } : . ) ( . )* '-->'
            {
            match("<!--");

            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1197:12: ( options {greedy=false; } : . )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1197:39: .
            {
            matchAny();

            }

            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1197:41: ( . )*
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
                        else if ( ((LA2_3>='\u0000' && LA2_3<='=')||(LA2_3>='?' && LA2_3<='\uFFFE')) ) {
                            alt2=1;
                        }


                    }
                    else if ( ((LA2_1>='\u0000' && LA2_1<=',')||(LA2_1>='.' && LA2_1<='\uFFFE')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<=',')||(LA2_0>='.' && LA2_0<='\uFFFE')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1197:41: .
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LINE_COMMENT

    // $ANTLR start JSP_COMMENT
    public final void mJSP_COMMENT() throws RecognitionException {
        try {
            int _type = JSP_COMMENT;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1202:5: ( '<%--' ( options {greedy=false; } : . ) ( . )* '--%>' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1202:5: '<%--' ( options {greedy=false; } : . ) ( . )* '--%>'
            {
            match("<%--");

            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1202:12: ( options {greedy=false; } : . )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1202:39: .
            {
            matchAny();

            }

            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1202:41: ( . )*
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
                            else if ( ((LA3_4>='\u0000' && LA3_4<='=')||(LA3_4>='?' && LA3_4<='\uFFFE')) ) {
                                alt3=1;
                            }


                        }
                        else if ( ((LA3_3>='\u0000' && LA3_3<='$')||(LA3_3>='&' && LA3_3<='\uFFFE')) ) {
                            alt3=1;
                        }


                    }
                    else if ( ((LA3_1>='\u0000' && LA3_1<=',')||(LA3_1>='.' && LA3_1<='\uFFFE')) ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0>='\u0000' && LA3_0<=',')||(LA3_0>='.' && LA3_0<='\uFFFE')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1202:41: .
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end JSP_COMMENT

    // $ANTLR start XMLDECL
    public final void mXMLDECL() throws RecognitionException {
        try {
            int _type = XMLDECL;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1207:3: ( '<?' ( 'x' | 'X' ) ( 'm' | 'M' ) ( 'l' | 'L' ) ( options {greedy=false; } : . )* '?>' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1207:3: '<?' ( 'x' | 'X' ) ( 'm' | 'M' ) ( 'l' | 'L' ) ( options {greedy=false; } : . )* '?>'
            {
            match("<?");

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1207:35: ( options {greedy=false; } : . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='?') ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1=='>') ) {
                        alt4=2;
                    }
                    else if ( ((LA4_1>='\u0000' && LA4_1<='=')||(LA4_1>='?' && LA4_1<='\uFFFE')) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0>='\u0000' && LA4_0<='>')||(LA4_0>='@' && LA4_0<='\uFFFE')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1207:62: .
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end XMLDECL

    // $ANTLR start DOCTYPE
    public final void mDOCTYPE() throws RecognitionException {
        try {
            int _type = DOCTYPE;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1212:7: ( '<!' ( 'D' | 'd' ) ( 'O' | 'o' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( options {greedy=false; } : . )* '>' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1212:7: '<!' ( 'D' | 'd' ) ( 'O' | 'o' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( options {greedy=false; } : . )* '>'
            {
            match("<!");

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1212:74: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='>') ) {
                    alt5=2;
                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='=')||(LA5_0>='?' && LA5_0<='\uFFFE')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1212:101: .
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOCTYPE

    // $ANTLR start INTERNAL_DTD
    public final void mINTERNAL_DTD() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1215:25: ( '[' ( options {greedy=false; } : . )* ']' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1215:25: '[' ( options {greedy=false; } : . )* ']'
            {
            match('[');
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1215:29: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==']') ) {
                    alt6=2;
                }
                else if ( ((LA6_0>='\u0000' && LA6_0<='\\')||(LA6_0>='^' && LA6_0<='\uFFFE')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1215:56: .
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
    // $ANTLR end INTERNAL_DTD

    // $ANTLR start ID
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1219:7: ( ( LETTER | '_' | '&' | '#' ) ( options {greedy=true; } : LETTER | IDDigit | '.' | '-' | '_' | '@' | '°' )* )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1219:7: ( LETTER | '_' | '&' | '#' ) ( options {greedy=true; } : LETTER | IDDigit | '.' | '-' | '_' | '@' | '°' )*
            {
            if ( (input.LA(1)>='#' && input.LA(1)<='$')||input.LA(1)=='&'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00A0'||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u2018' && input.LA(1)<='\u201F')||(input.LA(1)>='\u2032' && input.LA(1)<='\u2037')||input.LA(1)=='\u20AC'||(input.LA(1)>='\u3040' && input.LA(1)<='\u318F')||(input.LA(1)>='\u3300' && input.LA(1)<='\u337F')||(input.LA(1)>='\u3400' && input.LA(1)<='\u3D2D')||(input.LA(1)>='\u4E00' && input.LA(1)<='\u9FFF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFAFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1220:9: ( options {greedy=true; } : LETTER | IDDigit | '.' | '-' | '_' | '@' | '°' )*
            loop7:
            do {
                int alt7=8;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\u00C2') ) {
                    int LA7_2 = input.LA(2);

                    if ( (LA7_2=='\u00B0') ) {
                        alt7=7;
                    }

                    else {
                        alt7=1;
                    }

                }
                else if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=2;
                }
                else if ( (LA7_0=='.') ) {
                    alt7=3;
                }
                else if ( (LA7_0=='-') ) {
                    alt7=4;
                }
                else if ( (LA7_0=='_') ) {
                    alt7=5;
                }
                else if ( (LA7_0=='@') ) {
                    alt7=6;
                }
                else if ( (LA7_0=='$'||(LA7_0>='A' && LA7_0<='Z')||(LA7_0>='a' && LA7_0<='z')||LA7_0=='\u00A0'||(LA7_0>='\u00C0' && LA7_0<='\u00C1')||(LA7_0>='\u00C3' && LA7_0<='\u00D6')||(LA7_0>='\u00D8' && LA7_0<='\u00F6')||(LA7_0>='\u00F8' && LA7_0<='\u1FFF')||(LA7_0>='\u2018' && LA7_0<='\u201F')||(LA7_0>='\u2032' && LA7_0<='\u2037')||LA7_0=='\u20AC'||(LA7_0>='\u3040' && LA7_0<='\u318F')||(LA7_0>='\u3300' && LA7_0<='\u337F')||(LA7_0>='\u3400' && LA7_0<='\u3D2D')||(LA7_0>='\u4E00' && LA7_0<='\u9FFF')||(LA7_0>='\uF900' && LA7_0<='\uFAFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1220:36: LETTER
            	    {
            	    mLETTER();

            	    }
            	    break;
            	case 2 :
            	    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1220:45: IDDigit
            	    {
            	    mIDDigit();

            	    }
            	    break;
            	case 3 :
            	    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1220:55: '.'
            	    {
            	    match('.');

            	    }
            	    break;
            	case 4 :
            	    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1220:61: '-'
            	    {
            	    match('-');

            	    }
            	    break;
            	case 5 :
            	    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1220:67: '_'
            	    {
            	    match('_');

            	    }
            	    break;
            	case 6 :
            	    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1220:74: '@'
            	    {
            	    match('@');

            	    }
            	    break;
            	case 7 :
            	    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1220:80: '°'
            	    {
            	    match("°");


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ID

    // $ANTLR start LETTER
    public final void mLETTER() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1225:8: ( '\\u0024' | '\\u00A0' | '\\u0041' .. '\\u005a' | '\\u0061' .. '\\u007a' | '\\u00c0' .. '\\u00d6' | '\\u00d8' .. '\\u00f6' | '\\u00f8' .. '\\u00ff' | '\\u0100' .. '\\u1fff' | '\\u3040' .. '\\u318f' | '\\u3300' .. '\\u337f' | '\\u3400' .. '\\u3d2d' | '\\u4e00' .. '\\u9fff' | '\\uf900' .. '\\ufaff' | '\\u20AC' | '\\u2032' .. '\\u2037' | '\\u2018' .. '\\u201F' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00A0'||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u2018' && input.LA(1)<='\u201F')||(input.LA(1)>='\u2032' && input.LA(1)<='\u2037')||input.LA(1)=='\u20AC'||(input.LA(1)>='\u3040' && input.LA(1)<='\u318F')||(input.LA(1)>='\u3300' && input.LA(1)<='\u337F')||(input.LA(1)>='\u3400' && input.LA(1)<='\u3D2D')||(input.LA(1)>='\u4E00' && input.LA(1)<='\u9FFF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFAFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end LETTER

    // $ANTLR start IDDigit
    public final void mIDDigit() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1248:5: ( '\\u0030' .. '\\u0039' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1248:5: '\\u0030' .. '\\u0039'
            {
            matchRange('0','9');

            }

        }
        finally {
        }
    }
    // $ANTLR end IDDigit

    // $ANTLR start SpecialCharacter
    public final void mSpecialCharacter() throws RecognitionException {
        try {
            int _type = SpecialCharacter;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1254:5: ( '\\u00A0' .. '\\u00FF' | '{' | '}' | '|' | '!' | '#' | '$' | '&' | '(' | ')' | '*' | '+' | ',' | ( '-' )* | '.' | '\\/' | ';' | '?' | '[' | ']' | '`' | '%' | '@' | '\\\\' | '//' | '^' )
            int alt9=26;
            switch ( input.LA(1) ) {
            case '\u00A0':
            case '\u00A1':
            case '\u00A2':
            case '\u00A3':
            case '\u00A4':
            case '\u00A5':
            case '\u00A6':
            case '\u00A7':
            case '\u00A8':
            case '\u00A9':
            case '\u00AA':
            case '\u00AB':
            case '\u00AC':
            case '\u00AD':
            case '\u00AE':
            case '\u00AF':
            case '\u00B0':
            case '\u00B1':
            case '\u00B2':
            case '\u00B3':
            case '\u00B4':
            case '\u00B5':
            case '\u00B6':
            case '\u00B7':
            case '\u00B8':
            case '\u00B9':
            case '\u00BA':
            case '\u00BB':
            case '\u00BC':
            case '\u00BD':
            case '\u00BE':
            case '\u00BF':
            case '\u00C0':
            case '\u00C1':
            case '\u00C2':
            case '\u00C3':
            case '\u00C4':
            case '\u00C5':
            case '\u00C6':
            case '\u00C7':
            case '\u00C8':
            case '\u00C9':
            case '\u00CA':
            case '\u00CB':
            case '\u00CC':
            case '\u00CD':
            case '\u00CE':
            case '\u00CF':
            case '\u00D0':
            case '\u00D1':
            case '\u00D2':
            case '\u00D3':
            case '\u00D4':
            case '\u00D5':
            case '\u00D6':
            case '\u00D7':
            case '\u00D8':
            case '\u00D9':
            case '\u00DA':
            case '\u00DB':
            case '\u00DC':
            case '\u00DD':
            case '\u00DE':
            case '\u00DF':
            case '\u00E0':
            case '\u00E1':
            case '\u00E2':
            case '\u00E3':
            case '\u00E4':
            case '\u00E5':
            case '\u00E6':
            case '\u00E7':
            case '\u00E8':
            case '\u00E9':
            case '\u00EA':
            case '\u00EB':
            case '\u00EC':
            case '\u00ED':
            case '\u00EE':
            case '\u00EF':
            case '\u00F0':
            case '\u00F1':
            case '\u00F2':
            case '\u00F3':
            case '\u00F4':
            case '\u00F5':
            case '\u00F6':
            case '\u00F7':
            case '\u00F8':
            case '\u00F9':
            case '\u00FA':
            case '\u00FB':
            case '\u00FC':
            case '\u00FD':
            case '\u00FE':
            case '\u00FF':
                {
                alt9=1;
                }
                break;
            case '{':
                {
                alt9=2;
                }
                break;
            case '}':
                {
                alt9=3;
                }
                break;
            case '|':
                {
                alt9=4;
                }
                break;
            case '!':
                {
                alt9=5;
                }
                break;
            case '#':
                {
                alt9=6;
                }
                break;
            case '$':
                {
                alt9=7;
                }
                break;
            case '&':
                {
                alt9=8;
                }
                break;
            case '(':
                {
                alt9=9;
                }
                break;
            case ')':
                {
                alt9=10;
                }
                break;
            case '*':
                {
                alt9=11;
                }
                break;
            case '+':
                {
                alt9=12;
                }
                break;
            case ',':
                {
                alt9=13;
                }
                break;
            case '.':
                {
                alt9=15;
                }
                break;
            case '/':
                {
                int LA9_16 = input.LA(2);

                if ( (LA9_16=='/') ) {
                    alt9=25;
                }
                else {
                    alt9=16;}
                }
                break;
            case ';':
                {
                alt9=17;
                }
                break;
            case '?':
                {
                alt9=18;
                }
                break;
            case '[':
                {
                alt9=19;
                }
                break;
            case ']':
                {
                alt9=20;
                }
                break;
            case '`':
                {
                alt9=21;
                }
                break;
            case '%':
                {
                alt9=22;
                }
                break;
            case '@':
                {
                alt9=23;
                }
                break;
            case '\\':
                {
                alt9=24;
                }
                break;
            case '^':
                {
                alt9=26;
                }
                break;
            default:
                alt9=14;}

            switch (alt9) {
                case 1 :
                    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1254:5: '\\u00A0' .. '\\u00FF'
                    {
                    matchRange('\u00A0','\u00FF');

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1255:6: '{'
                    {
                    match('{');

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1256:6: '}'
                    {
                    match('}');

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1257:6: '|'
                    {
                    match('|');

                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1258:6: '!'
                    {
                    match('!');

                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1259:6: '#'
                    {
                    match('#');

                    }
                    break;
                case 7 :
                    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1260:6: '$'
                    {
                    match('$');

                    }
                    break;
                case 8 :
                    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1261:6: '&'
                    {
                    match('&');

                    }
                    break;
                case 9 :
                    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1262:6: '('
                    {
                    match('(');

                    }
                    break;
                case 10 :
                    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1263:6: ')'
                    {
                    match(')');

                    }
                    break;
                case 11 :
                    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1264:6: '*'
                    {
                    match('*');

                    }
                    break;
                case 12 :
                    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1265:6: '+'
                    {
                    match('+');

                    }
                    break;
                case 13 :
                    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1266:6: ','
                    {
                    match(',');

                    }
                    break;
                case 14 :
                    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1267:6: ( '-' )*
                    {
                    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1267:6: ( '-' )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='-') ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1267:6: '-'
                    	    {
                    	    match('-');

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;
                case 15 :
                    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1268:6: '.'
                    {
                    match('.');

                    }
                    break;
                case 16 :
                    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1269:6: '\\/'
                    {
                    match('/');

                    }
                    break;
                case 17 :
                    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1270:6: ';'
                    {
                    match(';');

                    }
                    break;
                case 18 :
                    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1271:6: '?'
                    {
                    match('?');

                    }
                    break;
                case 19 :
                    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1272:6: '['
                    {
                    match('[');

                    }
                    break;
                case 20 :
                    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1273:6: ']'
                    {
                    match(']');

                    }
                    break;
                case 21 :
                    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1274:6: '`'
                    {
                    match('`');

                    }
                    break;
                case 22 :
                    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1275:6: '%'
                    {
                    match('%');

                    }
                    break;
                case 23 :
                    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1276:6: '@'
                    {
                    match('@');

                    }
                    break;
                case 24 :
                    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1277:6: '\\\\'
                    {
                    match('\\');

                    }
                    break;
                case 25 :
                    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1278:6: '//'
                    {
                    match("//");


                    }
                    break;
                case 26 :
                    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1279:6: '^'
                    {
                    match('^');

                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SpecialCharacter

    // $ANTLR start SQUOTE
    public final void mSQUOTE() throws RecognitionException {
        try {
            int _type = SQUOTE;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1282:10: ( '\\'' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1282:10: '\\''
            {
            match('\'');

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SQUOTE

    // $ANTLR start DQUOTE
    public final void mDQUOTE() throws RecognitionException {
        try {
            int _type = DQUOTE;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1283:10: ( '\"' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1283:10: '\"'
            {
            match('\"');

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DQUOTE

    // $ANTLR start DDOT
    public final void mDDOT() throws RecognitionException {
        try {
            int _type = DDOT;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1284:10: ( ':' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1284:10: ':'
            {
            match(':');

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DDOT

    // $ANTLR start EQUAL
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1285:10: ( '=' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1285:10: '='
            {
            match('=');

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EQUAL

    // $ANTLR start WS
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1290:5: ( ( ' ' | '\\n' )+ )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1290:5: ( ' ' | '\\n' )+
            {
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1290:5: ( ' ' | '\\n' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\n'||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:
            	    {
            	    if ( input.LA(1)=='\n'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


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


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WS

    // $ANTLR start WS2
    public final void mWS2() throws RecognitionException {
        try {
            int _type = WS2;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1298:5: ( ( '\\r' | '\\f' | '\\t' )+ )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1298:5: ( '\\r' | '\\f' | '\\t' )+
            {
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1298:5: ( '\\r' | '\\f' | '\\t' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='\t'||(LA11_0>='\f' && LA11_0<='\r')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:
            	    {
            	    if ( input.LA(1)=='\t'||(input.LA(1)>='\f' && input.LA(1)<='\r') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            channel = HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WS2

    // $ANTLR start Digit
    public final void mDigit() throws RecognitionException {
        try {
            int _type = Digit;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1307:5: ( ( ( '-' | '#' | '+' )? ) ( '\\u0030' .. '\\u0039' ) ( '\\u0030' .. '\\u0039' | '%' | ',' | '.' )* )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1307:5: ( ( '-' | '#' | '+' )? ) ( '\\u0030' .. '\\u0039' ) ( '\\u0030' .. '\\u0039' | '%' | ',' | '.' )*
            {
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1307:5: ( ( '-' | '#' | '+' )? )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1307:6: ( '-' | '#' | '+' )?
            {
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1307:6: ( '-' | '#' | '+' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='#'||LA12_0=='+'||LA12_0=='-') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:
                    {
                    if ( input.LA(1)=='#'||input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }
                    break;

            }


            }

            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1307:21: ( '\\u0030' .. '\\u0039' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1307:22: '\\u0030' .. '\\u0039'
            {
            matchRange('0','9');

            }

            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1307:41: ( '\\u0030' .. '\\u0039' | '%' | ',' | '.' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='%'||LA13_0==','||LA13_0=='.'||(LA13_0>='0' && LA13_0<='9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:
            	    {
            	    if ( input.LA(1)=='%'||input.LA(1)==','||input.LA(1)=='.'||(input.LA(1)>='0' && input.LA(1)<='9') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Digit

    // $ANTLR start OPENCLOSE
    public final void mOPENCLOSE() throws RecognitionException {
        try {
            int _type = OPENCLOSE;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1311:15: ( '</' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1311:15: '</'
            {
            match("</");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end OPENCLOSE

    // $ANTLR start JSPTAGOPEN
    public final void mJSPTAGOPEN() throws RecognitionException {
        try {
            int _type = JSPTAGOPEN;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1314:15: ( '<%' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1314:15: '<%'
            {
            match("<%");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end JSPTAGOPEN

    // $ANTLR start JSPTAGCLOSE
    public final void mJSPTAGCLOSE() throws RecognitionException {
        try {
            int _type = JSPTAGCLOSE;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1315:15: ( '%>' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1315:15: '%>'
            {
            match("%>");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end JSPTAGCLOSE

    // $ANTLR start JSPOPENEXPR
    public final void mJSPOPENEXPR() throws RecognitionException {
        try {
            int _type = JSPOPENEXPR;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1316:15: ( '<%=' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1316:15: '<%='
            {
            match("<%=");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end JSPOPENEXPR

    // $ANTLR start JSPOPENDECL
    public final void mJSPOPENDECL() throws RecognitionException {
        try {
            int _type = JSPOPENDECL;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1317:15: ( '<%!' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1317:15: '<%!'
            {
            match("<%!");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end JSPOPENDECL

    // $ANTLR start JSPOPENDIR
    public final void mJSPOPENDIR() throws RecognitionException {
        try {
            int _type = JSPOPENDIR;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1318:15: ( '<%@' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1318:15: '<%@'
            {
            match("<%@");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end JSPOPENDIR

    // $ANTLR start JSPCLOSEACT
    public final void mJSPCLOSEACT() throws RecognitionException {
        try {
            int _type = JSPCLOSEACT;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1319:15: ( '/>' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1319:15: '/>'
            {
            match("/>");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end JSPCLOSEACT

    // $ANTLR start JSPUSEBEAN
    public final void mJSPUSEBEAN() throws RecognitionException {
        try {
            int _type = JSPUSEBEAN;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1322:15: ( '<jsp:useBean' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1322:15: '<jsp:useBean'
            {
            match("<jsp:useBean");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end JSPUSEBEAN

    // $ANTLR start JSPSET
    public final void mJSPSET() throws RecognitionException {
        try {
            int _type = JSPSET;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1323:15: ( '<jsp:setProperty' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1323:15: '<jsp:setProperty'
            {
            match("<jsp:setProperty");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end JSPSET

    // $ANTLR start JSPGET
    public final void mJSPGET() throws RecognitionException {
        try {
            int _type = JSPGET;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1324:15: ( '<jsp:getProperty' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1324:15: '<jsp:getProperty'
            {
            match("<jsp:getProperty");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end JSPGET

    // $ANTLR start JSPOPENINC
    public final void mJSPOPENINC() throws RecognitionException {
        try {
            int _type = JSPOPENINC;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1325:15: ( '<jsp:include' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1325:15: '<jsp:include'
            {
            match("<jsp:include");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end JSPOPENINC

    // $ANTLR start JSPCLOSEINC
    public final void mJSPCLOSEINC() throws RecognitionException {
        try {
            int _type = JSPCLOSEINC;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1326:15: ( '</jsp:include>' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1326:15: '</jsp:include>'
            {
            match("</jsp:include>");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end JSPCLOSEINC

    // $ANTLR start JSPOPENFWD
    public final void mJSPOPENFWD() throws RecognitionException {
        try {
            int _type = JSPOPENFWD;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1327:15: ( '<jsp:forward' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1327:15: '<jsp:forward'
            {
            match("<jsp:forward");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end JSPOPENFWD

    // $ANTLR start JSPCLOSEFWD
    public final void mJSPCLOSEFWD() throws RecognitionException {
        try {
            int _type = JSPCLOSEFWD;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1328:15: ( '</jsp:forward>' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1328:15: '</jsp:forward>'
            {
            match("</jsp:forward>");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end JSPCLOSEFWD

    // $ANTLR start JSPOPENPLUG
    public final void mJSPOPENPLUG() throws RecognitionException {
        try {
            int _type = JSPOPENPLUG;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1329:15: ( '<jsp:plugin' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1329:15: '<jsp:plugin'
            {
            match("<jsp:plugin");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end JSPOPENPLUG

    // $ANTLR start JSPCLOSEPLUG
    public final void mJSPCLOSEPLUG() throws RecognitionException {
        try {
            int _type = JSPCLOSEPLUG;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1330:15: ( '</jsp:plugin>' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1330:15: '</jsp:plugin>'
            {
            match("</jsp:plugin>");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end JSPCLOSEPLUG

    // $ANTLR start JSPOPENFALL
    public final void mJSPOPENFALL() throws RecognitionException {
        try {
            int _type = JSPOPENFALL;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1331:15: ( '<jsp:fallback>' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1331:15: '<jsp:fallback>'
            {
            match("<jsp:fallback>");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end JSPOPENFALL

    // $ANTLR start JSPCLOSEFALL
    public final void mJSPCLOSEFALL() throws RecognitionException {
        try {
            int _type = JSPCLOSEFALL;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1332:15: ( '</jsp:fallback>' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1332:15: '</jsp:fallback>'
            {
            match("</jsp:fallback>");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end JSPCLOSEFALL

    // $ANTLR start JSPOPENPARA
    public final void mJSPOPENPARA() throws RecognitionException {
        try {
            int _type = JSPOPENPARA;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1333:15: ( '<jsp:param' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1333:15: '<jsp:param'
            {
            match("<jsp:param");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end JSPOPENPARA

    // $ANTLR start JSPOPENPARAS
    public final void mJSPOPENPARAS() throws RecognitionException {
        try {
            int _type = JSPOPENPARAS;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1334:15: ( '<jsp:params>' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1334:15: '<jsp:params>'
            {
            match("<jsp:params>");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end JSPOPENPARAS

    // $ANTLR start JSPCLOSEPARAS
    public final void mJSPCLOSEPARAS() throws RecognitionException {
        try {
            int _type = JSPCLOSEPARAS;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1335:15: ( '</jsp:params>' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1335:15: '</jsp:params>'
            {
            match("</jsp:params>");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end JSPCLOSEPARAS

    // $ANTLR start JSPOPENROOT
    public final void mJSPOPENROOT() throws RecognitionException {
        try {
            int _type = JSPOPENROOT;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1336:15: ( '<jsp:root' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1336:15: '<jsp:root'
            {
            match("<jsp:root");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end JSPOPENROOT

    // $ANTLR start JSPCLOSEROOT
    public final void mJSPCLOSEROOT() throws RecognitionException {
        try {
            int _type = JSPCLOSEROOT;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1337:15: ( '</jsp:root>' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1337:15: '</jsp:root>'
            {
            match("</jsp:root>");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end JSPCLOSEROOT

    // $ANTLR start JSPOPENTEXT
    public final void mJSPOPENTEXT() throws RecognitionException {
        try {
            int _type = JSPOPENTEXT;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1338:15: ( '<jsp:text>' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1338:15: '<jsp:text>'
            {
            match("<jsp:text>");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end JSPOPENTEXT

    // $ANTLR start JSPCLOSETEXT
    public final void mJSPCLOSETEXT() throws RecognitionException {
        try {
            int _type = JSPCLOSETEXT;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1339:15: ( '</jsp:text>' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1339:15: '</jsp:text>'
            {
            match("</jsp:text>");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end JSPCLOSETEXT

    // $ANTLR start JSPCLOSEATTR
    public final void mJSPCLOSEATTR() throws RecognitionException {
        try {
            int _type = JSPCLOSEATTR;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1340:15: ( '</jsp:attribute>' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1340:15: '</jsp:attribute>'
            {
            match("</jsp:attribute>");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end JSPCLOSEATTR

    // $ANTLR start JSPOPENATTR
    public final void mJSPOPENATTR() throws RecognitionException {
        try {
            int _type = JSPOPENATTR;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1341:15: ( '<jsp:attribute' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1341:15: '<jsp:attribute'
            {
            match("<jsp:attribute");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end JSPOPENATTR

    // $ANTLR start JSPOPENBODY
    public final void mJSPOPENBODY() throws RecognitionException {
        try {
            int _type = JSPOPENBODY;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1342:15: ( '<jsp:body>' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1342:15: '<jsp:body>'
            {
            match("<jsp:body>");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end JSPOPENBODY

    // $ANTLR start JSPCLOSEBODY
    public final void mJSPCLOSEBODY() throws RecognitionException {
        try {
            int _type = JSPCLOSEBODY;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1343:15: ( '</jsp:body>' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1343:15: '</jsp:body>'
            {
            match("</jsp:body>");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end JSPCLOSEBODY

    // $ANTLR start JSPOPENINVOKE
    public final void mJSPOPENINVOKE() throws RecognitionException {
        try {
            int _type = JSPOPENINVOKE;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1344:16: ( '<jsp:invoke' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1344:16: '<jsp:invoke'
            {
            match("<jsp:invoke");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end JSPOPENINVOKE

    // $ANTLR start JSPOPENDOBODY
    public final void mJSPOPENDOBODY() throws RecognitionException {
        try {
            int _type = JSPOPENDOBODY;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1345:16: ( '<jsp:doBody' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1345:16: '<jsp:doBody'
            {
            match("<jsp:doBody");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end JSPOPENDOBODY

    // $ANTLR start JSPOPENOUTPUT
    public final void mJSPOPENOUTPUT() throws RecognitionException {
        try {
            int _type = JSPOPENOUTPUT;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1346:16: ( '<jsp:output' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1346:16: '<jsp:output'
            {
            match("<jsp:output");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end JSPOPENOUTPUT

    // $ANTLR start JSPELEMENTOP
    public final void mJSPELEMENTOP() throws RecognitionException {
        try {
            int _type = JSPELEMENTOP;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1347:16: ( '<jsp:element' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1347:16: '<jsp:element'
            {
            match("<jsp:element");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end JSPELEMENTOP

    // $ANTLR start OPENSCRIPLET
    public final void mOPENSCRIPLET() throws RecognitionException {
        try {
            int _type = OPENSCRIPLET;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1351:15: ( '<jsp:scriptlet>' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1351:15: '<jsp:scriptlet>'
            {
            match("<jsp:scriptlet>");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end OPENSCRIPLET

    // $ANTLR start CLOSESCRIPTLET
    public final void mCLOSESCRIPTLET() throws RecognitionException {
        try {
            int _type = CLOSESCRIPTLET;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1352:17: ( '</jsp:scriptlet>' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1352:17: '</jsp:scriptlet>'
            {
            match("</jsp:scriptlet>");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CLOSESCRIPTLET

    // $ANTLR start OPENEXPR
    public final void mOPENEXPR() throws RecognitionException {
        try {
            int _type = OPENEXPR;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1353:15: ( '<jsp:expression>' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1353:15: '<jsp:expression>'
            {
            match("<jsp:expression>");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end OPENEXPR

    // $ANTLR start CLOSEEXPR
    public final void mCLOSEEXPR() throws RecognitionException {
        try {
            int _type = CLOSEEXPR;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1354:15: ( '</jsp:expression>' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1354:15: '</jsp:expression>'
            {
            match("</jsp:expression>");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CLOSEEXPR

    // $ANTLR start OPENDECL
    public final void mOPENDECL() throws RecognitionException {
        try {
            int _type = OPENDECL;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1355:15: ( '<jsp:declaration>' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1355:15: '<jsp:declaration>'
            {
            match("<jsp:declaration>");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end OPENDECL

    // $ANTLR start CLOSEDECL
    public final void mCLOSEDECL() throws RecognitionException {
        try {
            int _type = CLOSEDECL;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1356:15: ( '</jsp:declaration>' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1356:15: '</jsp:declaration>'
            {
            match("</jsp:declaration>");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CLOSEDECL

    // $ANTLR start OPENDIRECT
    public final void mOPENDIRECT() throws RecognitionException {
        try {
            int _type = OPENDIRECT;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1357:15: ( '<jsp:directive.' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1357:15: '<jsp:directive.'
            {
            match("<jsp:directive.");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end OPENDIRECT

    // $ANTLR start OPENJSPCMT
    public final void mOPENJSPCMT() throws RecognitionException {
        try {
            int _type = OPENJSPCMT;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1360:15: ( '<%--' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1360:15: '<%--'
            {
            match("<%--");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end OPENJSPCMT

    // $ANTLR start CLOSEJSPCMT
    public final void mCLOSEJSPCMT() throws RecognitionException {
        try {
            int _type = CLOSEJSPCMT;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1361:15: ( '--%>' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1361:15: '--%>'
            {
            match("--%>");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CLOSEJSPCMT

    // $ANTLR start OPENXMLCMT
    public final void mOPENXMLCMT() throws RecognitionException {
        try {
            int _type = OPENXMLCMT;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1362:15: ( '<!--' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1362:15: '<!--'
            {
            match("<!--");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end OPENXMLCMT

    // $ANTLR start CLOSEXMLCMT
    public final void mCLOSEXMLCMT() throws RecognitionException {
        try {
            int _type = CLOSEXMLCMT;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1363:15: ( '-->' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1363:15: '-->'
            {
            match("-->");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CLOSEXMLCMT

    // $ANTLR start XMLDECLOPEN
    public final void mXMLDECLOPEN() throws RecognitionException {
        try {
            int _type = XMLDECLOPEN;
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1365:15: ( '<?xml' )
            // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1365:15: '<?xml'
            {
            match("<?xml");


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end XMLDECLOPEN

    public void mTokens() throws RecognitionException {
        // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:10: ( T66 | T67 | T68 | T69 | CDATA | LINE_COMMENT | JSP_COMMENT | XMLDECL | DOCTYPE | ID | SpecialCharacter | SQUOTE | DQUOTE | DDOT | EQUAL | WS | WS2 | Digit | OPENCLOSE | JSPTAGOPEN | JSPTAGCLOSE | JSPOPENEXPR | JSPOPENDECL | JSPOPENDIR | JSPCLOSEACT | JSPUSEBEAN | JSPSET | JSPGET | JSPOPENINC | JSPCLOSEINC | JSPOPENFWD | JSPCLOSEFWD | JSPOPENPLUG | JSPCLOSEPLUG | JSPOPENFALL | JSPCLOSEFALL | JSPOPENPARA | JSPOPENPARAS | JSPCLOSEPARAS | JSPOPENROOT | JSPCLOSEROOT | JSPOPENTEXT | JSPCLOSETEXT | JSPCLOSEATTR | JSPOPENATTR | JSPOPENBODY | JSPCLOSEBODY | JSPOPENINVOKE | JSPOPENDOBODY | JSPOPENOUTPUT | JSPELEMENTOP | OPENSCRIPLET | CLOSESCRIPTLET | OPENEXPR | CLOSEEXPR | OPENDECL | CLOSEDECL | OPENDIRECT | OPENJSPCMT | CLOSEJSPCMT | OPENXMLCMT | CLOSEXMLCMT | XMLDECLOPEN )
        int alt14=63;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:10: T66
                {
                mT66();

                }
                break;
            case 2 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:14: T67
                {
                mT67();

                }
                break;
            case 3 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:18: T68
                {
                mT68();

                }
                break;
            case 4 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:22: T69
                {
                mT69();

                }
                break;
            case 5 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:26: CDATA
                {
                mCDATA();

                }
                break;
            case 6 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:32: LINE_COMMENT
                {
                mLINE_COMMENT();

                }
                break;
            case 7 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:45: JSP_COMMENT
                {
                mJSP_COMMENT();

                }
                break;
            case 8 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:57: XMLDECL
                {
                mXMLDECL();

                }
                break;
            case 9 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:65: DOCTYPE
                {
                mDOCTYPE();

                }
                break;
            case 10 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:73: ID
                {
                mID();

                }
                break;
            case 11 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:76: SpecialCharacter
                {
                mSpecialCharacter();

                }
                break;
            case 12 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:93: SQUOTE
                {
                mSQUOTE();

                }
                break;
            case 13 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:100: DQUOTE
                {
                mDQUOTE();

                }
                break;
            case 14 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:107: DDOT
                {
                mDDOT();

                }
                break;
            case 15 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:112: EQUAL
                {
                mEQUAL();

                }
                break;
            case 16 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:118: WS
                {
                mWS();

                }
                break;
            case 17 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:121: WS2
                {
                mWS2();

                }
                break;
            case 18 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:125: Digit
                {
                mDigit();

                }
                break;
            case 19 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:131: OPENCLOSE
                {
                mOPENCLOSE();

                }
                break;
            case 20 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:141: JSPTAGOPEN
                {
                mJSPTAGOPEN();

                }
                break;
            case 21 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:152: JSPTAGCLOSE
                {
                mJSPTAGCLOSE();

                }
                break;
            case 22 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:164: JSPOPENEXPR
                {
                mJSPOPENEXPR();

                }
                break;
            case 23 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:176: JSPOPENDECL
                {
                mJSPOPENDECL();

                }
                break;
            case 24 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:188: JSPOPENDIR
                {
                mJSPOPENDIR();

                }
                break;
            case 25 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:199: JSPCLOSEACT
                {
                mJSPCLOSEACT();

                }
                break;
            case 26 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:211: JSPUSEBEAN
                {
                mJSPUSEBEAN();

                }
                break;
            case 27 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:222: JSPSET
                {
                mJSPSET();

                }
                break;
            case 28 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:229: JSPGET
                {
                mJSPGET();

                }
                break;
            case 29 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:236: JSPOPENINC
                {
                mJSPOPENINC();

                }
                break;
            case 30 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:247: JSPCLOSEINC
                {
                mJSPCLOSEINC();

                }
                break;
            case 31 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:259: JSPOPENFWD
                {
                mJSPOPENFWD();

                }
                break;
            case 32 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:270: JSPCLOSEFWD
                {
                mJSPCLOSEFWD();

                }
                break;
            case 33 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:282: JSPOPENPLUG
                {
                mJSPOPENPLUG();

                }
                break;
            case 34 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:294: JSPCLOSEPLUG
                {
                mJSPCLOSEPLUG();

                }
                break;
            case 35 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:307: JSPOPENFALL
                {
                mJSPOPENFALL();

                }
                break;
            case 36 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:319: JSPCLOSEFALL
                {
                mJSPCLOSEFALL();

                }
                break;
            case 37 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:332: JSPOPENPARA
                {
                mJSPOPENPARA();

                }
                break;
            case 38 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:344: JSPOPENPARAS
                {
                mJSPOPENPARAS();

                }
                break;
            case 39 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:357: JSPCLOSEPARAS
                {
                mJSPCLOSEPARAS();

                }
                break;
            case 40 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:371: JSPOPENROOT
                {
                mJSPOPENROOT();

                }
                break;
            case 41 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:383: JSPCLOSEROOT
                {
                mJSPCLOSEROOT();

                }
                break;
            case 42 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:396: JSPOPENTEXT
                {
                mJSPOPENTEXT();

                }
                break;
            case 43 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:408: JSPCLOSETEXT
                {
                mJSPCLOSETEXT();

                }
                break;
            case 44 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:421: JSPCLOSEATTR
                {
                mJSPCLOSEATTR();

                }
                break;
            case 45 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:434: JSPOPENATTR
                {
                mJSPOPENATTR();

                }
                break;
            case 46 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:446: JSPOPENBODY
                {
                mJSPOPENBODY();

                }
                break;
            case 47 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:458: JSPCLOSEBODY
                {
                mJSPCLOSEBODY();

                }
                break;
            case 48 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:471: JSPOPENINVOKE
                {
                mJSPOPENINVOKE();

                }
                break;
            case 49 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:485: JSPOPENDOBODY
                {
                mJSPOPENDOBODY();

                }
                break;
            case 50 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:499: JSPOPENOUTPUT
                {
                mJSPOPENOUTPUT();

                }
                break;
            case 51 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:513: JSPELEMENTOP
                {
                mJSPELEMENTOP();

                }
                break;
            case 52 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:526: OPENSCRIPLET
                {
                mOPENSCRIPLET();

                }
                break;
            case 53 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:539: CLOSESCRIPTLET
                {
                mCLOSESCRIPTLET();

                }
                break;
            case 54 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:554: OPENEXPR
                {
                mOPENEXPR();

                }
                break;
            case 55 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:563: CLOSEEXPR
                {
                mCLOSEEXPR();

                }
                break;
            case 56 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:573: OPENDECL
                {
                mOPENDECL();

                }
                break;
            case 57 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:582: CLOSEDECL
                {
                mCLOSEDECL();

                }
                break;
            case 58 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:592: OPENDIRECT
                {
                mOPENDIRECT();

                }
                break;
            case 59 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:603: OPENJSPCMT
                {
                mOPENJSPCMT();

                }
                break;
            case 60 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:614: CLOSEJSPCMT
                {
                mCLOSEJSPCMT();

                }
                break;
            case 61 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:626: OPENXMLCMT
                {
                mOPENXMLCMT();

                }
                break;
            case 62 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:637: CLOSEXMLCMT
                {
                mCLOSEXMLCMT();

                }
                break;
            case 63 :
                // C:\\Documents and Settings\\Nguyomar\\workspace\\org.eclipse.modisco.jee.jsp.discoverer\\resources\\internal\\JSP.g:1:649: XMLDECLOPEN
                {
                mXMLDECLOPEN();

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\6\1\uffff\1\32\2\uffff\1\11\4\uffff\4\6\10\uffff\1\42\2\uffff"+
        "\1\54\2\uffff\1\11\1\6\17\uffff\2\11\5\uffff\1\71\1\74\2\uffff\1"+
        "\113\63\uffff\1\156\2\uffff";
    static final String DFA14_eofS =
        "\157\uffff";
    static final String DFA14_minS =
        "\1\11\1\uffff\1\41\2\uffff\1\60\4\uffff\1\60\1\55\2\76\7\uffff"+
        "\1\163\1\152\1\130\1\55\1\41\2\uffff\2\45\2\uffff\1\160\1\163\1"+
        "\uffff\1\115\3\uffff\1\55\3\uffff\1\55\1\uffff\2\45\2\uffff\1\72"+
        "\1\160\1\114\2\0\1\141\1\72\1\0\4\uffff\1\154\1\145\1\141\1\uffff"+
        "\1\156\1\uffff\1\141\3\uffff\1\143\2\uffff\1\141\6\uffff\1\162\1"+
        "\uffff\1\143\11\uffff\1\141\1\154\1\141\2\uffff\1\141\10\uffff\1"+
        "\155\1\163\2\uffff";
    static final String DFA14_maxS =
        "\1\ufaff\1\uffff\1\152\2\uffff\1\71\4\uffff\2\71\2\76\7\uffff\1"+
        "\163\1\152\1\170\1\144\1\100\2\uffff\1\71\1\76\2\uffff\1\160\1\163"+
        "\1\uffff\1\155\3\uffff\1\55\3\uffff\1\55\1\uffff\2\71\2\uffff\1"+
        "\72\1\160\1\154\2\ufffe\1\165\1\72\1\ufffe\4\uffff\1\170\1\157\1"+
        "\154\1\uffff\1\156\1\uffff\1\157\3\uffff\1\145\2\uffff\1\164\6\uffff"+
        "\1\162\1\uffff\1\166\11\uffff\1\154\1\170\1\157\2\uffff\1\141\10"+
        "\uffff\1\155\1\163\2\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\12\1\uffff\1\13\3\12\4\uffff\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\5\uffff\1\2\1\4\2\uffff\1\31\1\25\2"+
        "\uffff\1\23\1\uffff\1\10\1\11\1\5\1\uffff\1\30\1\26\1\27\1\uffff"+
        "\1\24\2\uffff\1\76\1\74\10\uffff\1\75\1\6\1\7\1\73\3\uffff\1\34"+
        "\1\uffff\1\32\1\uffff\1\55\1\56\1\62\1\uffff\1\52\1\50\1\uffff\1"+
        "\77\1\66\1\63\1\70\1\61\1\72\1\uffff\1\41\1\uffff\1\43\1\37\1\64"+
        "\1\33\1\71\1\57\1\53\1\51\1\65\3\uffff\1\36\1\54\1\uffff\1\35\1"+
        "\60\1\47\1\42\1\3\1\67\1\44\1\40\2\uffff\1\46\1\45";
    static final String DFA14_specialS =
        "\157\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\23\1\22\1\uffff\2\23\22\uffff\1\22\1\uffff\1\17\1\5\1\7"+
            "\1\15\1\10\1\16\3\uffff\1\12\1\uffff\1\13\1\uffff\1\14\12\24"+
            "\1\20\1\3\1\2\1\21\1\1\2\uffff\32\11\4\uffff\1\11\1\uffff\32"+
            "\11\45\uffff\1\4\37\uffff\27\4\1\uffff\37\4\1\uffff\10\4\u1f00"+
            "\11\30\uffff\10\11\22\uffff\6\11\164\uffff\1\11\u0f93\uffff"+
            "\u0150\11\u0170\uffff\u0080\11\u0080\uffff\u092e\11\u10d2\uffff"+
            "\u5200\11\u5900\uffff\u0200\11",
            "",
            "\1\30\3\uffff\1\31\11\uffff\1\26\17\uffff\1\27\52\uffff\1"+
            "\25",
            "",
            "",
            "\12\34",
            "",
            "",
            "",
            "",
            "\12\24",
            "\1\35\2\uffff\12\24",
            "\1\36",
            "\1\37",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\40",
            "\1\41",
            "\1\44\37\uffff\1\43",
            "\1\47\26\uffff\1\45\26\uffff\1\46\10\uffff\1\45",
            "\1\52\13\uffff\1\53\17\uffff\1\51\2\uffff\1\50",
            "",
            "",
            "\1\24\6\uffff\1\24\1\uffff\1\56\1\uffff\12\55",
            "\1\60\30\uffff\1\57",
            "",
            "",
            "\1\61",
            "\1\62",
            "",
            "\1\44\37\uffff\1\63",
            "",
            "",
            "",
            "\1\64",
            "",
            "",
            "",
            "\1\65",
            "",
            "\1\24\6\uffff\1\24\1\uffff\1\56\1\uffff\12\55",
            "\1\24\6\uffff\1\24\1\uffff\1\56\1\uffff\12\55",
            "",
            "",
            "\1\66",
            "\1\67",
            "\1\44\37\uffff\1\70",
            "\uffff\72",
            "\uffff\73",
            "\1\104\1\105\1\uffff\1\76\1\75\1\103\1\100\1\uffff\1\101\5"+
            "\uffff\1\106\1\77\1\uffff\1\111\1\107\1\110\1\102",
            "\1\112",
            "\uffff\44",
            "",
            "",
            "",
            "",
            "\1\115\13\uffff\1\114",
            "\1\116\3\uffff\1\120\5\uffff\1\117",
            "\1\121\12\uffff\1\122",
            "",
            "\1\123",
            "",
            "\1\124\15\uffff\1\125",
            "",
            "",
            "",
            "\1\126\1\uffff\1\127",
            "",
            "",
            "\1\141\1\131\1\uffff\1\130\1\136\1\137\2\uffff\1\140\6\uffff"+
            "\1\135\1\uffff\1\133\1\134\1\132",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\142",
            "",
            "\1\143\22\uffff\1\144",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\145\12\uffff\1\146",
            "\1\147\13\uffff\1\150",
            "\1\151\15\uffff\1\152",
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
            "\1\154",
            "\1\155",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T66 | T67 | T68 | T69 | CDATA | LINE_COMMENT | JSP_COMMENT | XMLDECL | DOCTYPE | ID | SpecialCharacter | SQUOTE | DQUOTE | DDOT | EQUAL | WS | WS2 | Digit | OPENCLOSE | JSPTAGOPEN | JSPTAGCLOSE | JSPOPENEXPR | JSPOPENDECL | JSPOPENDIR | JSPCLOSEACT | JSPUSEBEAN | JSPSET | JSPGET | JSPOPENINC | JSPCLOSEINC | JSPOPENFWD | JSPCLOSEFWD | JSPOPENPLUG | JSPCLOSEPLUG | JSPOPENFALL | JSPCLOSEFALL | JSPOPENPARA | JSPOPENPARAS | JSPCLOSEPARAS | JSPOPENROOT | JSPCLOSEROOT | JSPOPENTEXT | JSPCLOSETEXT | JSPCLOSEATTR | JSPOPENATTR | JSPOPENBODY | JSPCLOSEBODY | JSPOPENINVOKE | JSPOPENDOBODY | JSPOPENOUTPUT | JSPELEMENTOP | OPENSCRIPLET | CLOSESCRIPTLET | OPENEXPR | CLOSEEXPR | OPENDECL | CLOSEDECL | OPENDIRECT | OPENJSPCMT | CLOSEJSPCMT | OPENXMLCMT | CLOSEXMLCMT | XMLDECLOPEN );";
        }
    }


}
