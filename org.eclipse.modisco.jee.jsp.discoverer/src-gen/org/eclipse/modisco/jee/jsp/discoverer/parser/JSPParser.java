// $ANTLR 3.2 Sep 23, 2009 12:02:23 JSP.g 2019-11-14 15:50:28
 
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
  import org.eclipse.modisco.jee.jsp.*;
  import org.eclipse.modisco.jee.jsp.impl.*;
  import java.util.HashMap;
  import org.eclipse.gmt.modisco.xml.*;
  import org.eclipse.gmt.modisco.xml.emf.MoDiscoXMLFactory;
  import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
  import org.eclipse.modisco.jee.jsp.discoverer.JspActivator;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class JSPParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "XMLDECL", "DOCTYPE", "CDATA", "WS", "ID", "JSP_COMMENT", "LINE_COMMENT", "Digit", "SpecialCharacter", "DQUOTE", "SQUOTE", "DDOT", "EQUAL", "INTERNAL_DTD", "LETTER", "IDDigit", "WS2", "OPENCLOSE", "JSPTAGOPEN", "JSPTAGCLOSE", "JSPOPENEXPR", "JSPOPENDECL", "JSPOPENDIR", "JSPCLOSEACT", "JSPUSEBEAN", "JSPSET", "JSPGET", "JSPOPENINC", "JSPCLOSEINC", "JSPOPENFWD", "JSPCLOSEFWD", "JSPOPENPLUG", "JSPCLOSEPLUG", "JSPOPENFALL", "JSPCLOSEFALL", "JSPOPENPARA", "JSPOPENPARAS", "JSPCLOSEPARAS", "JSPOPENROOT", "JSPCLOSEROOT", "JSPOPENTEXT", "JSPCLOSETEXT", "JSPCLOSEATTR", "JSPOPENATTR", "JSPOPENBODY", "JSPCLOSEBODY", "JSPOPENINVOKE", "JSPOPENDOBODY", "JSPOPENOUTPUT", "JSPELEMENTOP", "OPENSCRIPLET", "CLOSESCRIPTLET", "OPENEXPR", "CLOSEEXPR", "OPENDECL", "CLOSEDECL", "OPENDIRECT", "OPENJSPCMT", "CLOSEJSPCMT", "OPENXMLCMT", "CLOSEXMLCMT", "XMLDECLOPEN", "'>'", "'<'", "'</jsp:element>'", "';'"
    };
    public static final int DOCTYPE=5;
    public static final int CLOSEXMLCMT=64;
    public static final int JSPOPENATTR=47;
    public static final int Digit=11;
    public static final int OPENJSPCMT=61;
    public static final int OPENDIRECT=60;
    public static final int CLOSESCRIPTLET=55;
    public static final int JSPOPENEXPR=24;
    public static final int T__69=69;
    public static final int OPENEXPR=56;
    public static final int JSPUSEBEAN=28;
    public static final int JSPCLOSEFALL=38;
    public static final int JSPOPENDOBODY=51;
    public static final int JSPCLOSEINC=32;
    public static final int JSPCLOSEPLUG=36;
    public static final int JSPOPENPARA=39;
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
    public static final int JSPOPENTEXT=44;
    public static final int SpecialCharacter=12;
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
    public static final int CLOSEDECL=59;
    public static final int JSP_COMMENT=9;
    public static final int IDDigit=19;
    public static final int JSPTAGOPEN=22;
    public static final int JSPTAGCLOSE=23;
    public static final int JSPCLOSEBODY=49;
    public static final int XMLDECL=4;
    public static final int WS2=20;

    // delegates
    // delegators


        public JSPParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public JSPParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return JSPParser.tokenNames; }
    public String getGrammarFileName() { return "JSP.g"; }



        //This method redirect error messages from ANTLR to MoDisco Logger
        @Override
        public void displayRecognitionError(String[] tokenNames,
                                            RecognitionException e) {
            String hdr = getErrorHeader(e);
            String msg = getErrorMessage(e, tokenNames);
            MoDiscoLogger.logWarning("Parser error in "+this.page.getOriginalFilePath()+" "+hdr+" "+msg, JspActivator.getDefault());  
        }
        
      private JspFactory factory = new JspFactoryImpl();
      private MoDiscoXMLFactory xmlFactory = MoDiscoXMLFactory.eINSTANCE;
      public String space = "";
       
      private ArrayList<Node> closedTagList = new ArrayList<Node>(); 
      private ArrayList<Node> tagList = new ArrayList<Node>();
      private ArrayList<Node> javaScriptParentList = new ArrayList<Node>();
      public Page page = factory.createPage();
      
      /**
      * Method to factorize some code in the JavaScript rule
      */
      public void createJavascriptText(Element tag, String text){
        if(!text.equalsIgnoreCase("")){
    	    Text textElt = this.xmlFactory.createText();
    	    textElt.setName(text);
    	    tag.getChildren().add(textElt);
    	  }
                                              
      }
      
      /** 
       * Generic method which link a child to his parent
       * @param parentPage The page itself
       * @param parentTag  The parent tag
       * @param child      The child
       */
      public void setParent( Element parentTag, Node child) { 
          if(parentTag!=null && child !=null)
             {
               parentTag.getChildren().add(child);                      
             }
           else if(child!=null){
              //All tag are by default child of the page 
              this.page.getOwnedElements().add(child);   
              //We put all the tags in the list         
              tagList.add(child);
           }
      }
      
      public void createAttributeText(Element att, String textContent){
        if(!textContent.equalsIgnoreCase("")&&att!=null){
          Text text = this.xmlFactory.createText();
          text.setName(textContent);
          att.getChildren().add(text);
        }
      }
        
       /**
        * This method recreates the tree hierarchy of the file
        * Given the name of a closing tag, it look in the list of all the
        * encountered tags to find the opening one. Every tag between those two
        * is considered to be a son of the opening one
        * @param closeTagName the name of the closing tag encountered
        */
       public void resolveChild(String closeTagName)
          {       
                 
                  Element tag = null;
                  //We first need to check that this closed tag is a real one, meaning
                  //if it does have a openTag 
                  int k = tagList.size()-1;
                  boolean isARealClosedTag = false;
                   while(k>=0) 
                  {     
                    if(tagList.get(k)!=null){
                      if(tagList.get(k) instanceof Element){
                         tag = (Element) tagList.get(k);
                         //If we find the related open tag
                          if(tag.getName().equalsIgnoreCase(closeTagName)&& !closedTagList.contains(tag)){
                            isARealClosedTag =  true;  
                            closedTagList.add(tag); 
                            break;
                          }
                      }                        
                    }
                    k--;
                  }
                  
                  int endIndex = tagList.size()-1;
                  int numberOfChildren = endIndex-k;
                  
                  if(!tagList.isEmpty() && isARealClosedTag){              
                      for(int j=0;j<numberOfChildren;j++){
                        tag.getChildren().add(tagList.get(k+1));
                        tagList.remove(k+1);
                      }
                  }
                  //We are facing a closed element out of nowhere, but we still need to process it   
                  else{
                        Text elt =this.xmlFactory.createText();
                        elt.setName("</"+closeTagName+">");
                        this.page.getOwnedElements().add(elt);   
                  }                                                           
          }
                  
        /**
       * This method concatenate every token contained within the beginning of the tag
       * and the token matching the given token ID
       * It is very usefull to retriveve content for JSP Scriplet for instance
       * @param tokenID the ID of the closing token in the token list
       * @param tag the tag we need the content for
       */
      public void getTagContent(int tokenID, Element tag){
         String text = "";
         
         loop1:
             do {
                  //Avoid index out of bound exception
                  if(input.mark()== input.size())
                   {
                     break loop1;
                   }
                                                                
                 if ( (input.LA(1)==tokenID) ) {
                     break loop1;
                 }
                 else{                                     
                     text+= space+input.get(input.mark()).getText();   
                     matchAny(input);                   
                  }
               } while (true);
                        
              Text textElmt = xmlFactory.createText();
               while(text.startsWith("\n") ||text.startsWith(" ") ){
                    text = text.substring(1);
               }
              textElmt.setName(text);
              setParent(tag, textElmt);                            
              tag.setName(""); 
      }
      
      public JSPStdAction createJSPStdAction(Element parent,String name){
         JSPStdAction tag = this.factory.createJSPStdAction();
         setParent(parent, tag);
         tag.setName(name);
         return tag;
      }



    // $ANTLR start "page"
    // JSP.g:233:1: page[String originalFilePath, String fileName] : ( xmlDecl | docType | jsp_element[null] | tag[null] | endtag | comment[null] | text[null] | cData[null] )* ;
    public final void page(String originalFilePath, String fileName) throws RecognitionException {
        try {
            // JSP.g:237:3: ( ( xmlDecl | docType | jsp_element[null] | tag[null] | endtag | comment[null] | text[null] | cData[null] )* )
            // JSP.g:238:5: ( xmlDecl | docType | jsp_element[null] | tag[null] | endtag | comment[null] | text[null] | cData[null] )*
            {

                    this.page.setOriginalFilePath(originalFilePath);
                    this.page.setName(fileName);
                
            // JSP.g:242:5: ( xmlDecl | docType | jsp_element[null] | tag[null] | endtag | comment[null] | text[null] | cData[null] )*
            loop1:
            do {
                int alt1=9;
                alt1 = dfa1.predict(input);
                switch (alt1) {
            	case 1 :
            	    // JSP.g:243:5: xmlDecl
            	    {
            	    pushFollow(FOLLOW_xmlDecl_in_page82);
            	    xmlDecl();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // JSP.g:244:6: docType
            	    {
            	    pushFollow(FOLLOW_docType_in_page90);
            	    docType();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // JSP.g:245:6: jsp_element[null]
            	    {
            	    pushFollow(FOLLOW_jsp_element_in_page98);
            	    jsp_element(null);

            	    state._fsp--;


            	    }
            	    break;
            	case 4 :
            	    // JSP.g:246:6: tag[null]
            	    {
            	    pushFollow(FOLLOW_tag_in_page106);
            	    tag(null);

            	    state._fsp--;


            	    }
            	    break;
            	case 5 :
            	    // JSP.g:247:6: endtag
            	    {
            	    pushFollow(FOLLOW_endtag_in_page114);
            	    endtag();

            	    state._fsp--;


            	    }
            	    break;
            	case 6 :
            	    // JSP.g:248:6: comment[null]
            	    {
            	    pushFollow(FOLLOW_comment_in_page121);
            	    comment(null);

            	    state._fsp--;


            	    }
            	    break;
            	case 7 :
            	    // JSP.g:249:6: text[null]
            	    {
            	    pushFollow(FOLLOW_text_in_page132);
            	    text(null);

            	    state._fsp--;


            	    }
            	    break;
            	case 8 :
            	    // JSP.g:250:6: cData[null]
            	    {
            	    pushFollow(FOLLOW_cData_in_page140);
            	    cData(null);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "page"


    // $ANTLR start "xmlDecl"
    // JSP.g:255:10: fragment xmlDecl : t= XMLDECL ;
    public final void xmlDecl() throws RecognitionException {
        Token t=null;

        try {
            // JSP.g:255:19: (t= XMLDECL )
            // JSP.g:255:22: t= XMLDECL
            {
            t=(Token)match(input,XMLDECL,FOLLOW_XMLDECL_in_xmlDecl180); 
            this.page.setXmlDeclaration(t.getText());

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
    // $ANTLR end "xmlDecl"


    // $ANTLR start "docType"
    // JSP.g:258:10: fragment docType : t= DOCTYPE ;
    public final void docType() throws RecognitionException {
        Token t=null;

        try {
            // JSP.g:258:19: (t= DOCTYPE )
            // JSP.g:258:22: t= DOCTYPE
            {
            t=(Token)match(input,DOCTYPE,FOLLOW_DOCTYPE_in_docType198); 
            this.page.setDoctype(t.getText());

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
    // $ANTLR end "docType"


    // $ANTLR start "cData"
    // JSP.g:263:10: fragment cData[Element parent] returns [CDATA tag] : cData2s= CDATA ;
    public final CDATA cData(Element parent) throws RecognitionException {
        CDATA tag = null;

        Token cData2s=null;

        try {
            // JSP.g:264:3: (cData2s= CDATA )
            // JSP.g:265:9: cData2s= CDATA
            {
            cData2s=(Token)match(input,CDATA,FOLLOW_CDATA_in_cData260); 

                          tag = this.xmlFactory.createCDATA();
                          tag.setName(cData2s.getText());
                          setParent(parent, tag);
                        

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return tag;
    }
    // $ANTLR end "cData"


    // $ANTLR start "jsp_element"
    // JSP.g:273:10: fragment jsp_element[Element parent] returns [Element tag] : ( jsp_scriplet[parent] | jsp_expression[parent] | jsp_declaration[parent] | jsp_action[ parent] | jsp_directive[parent] );
    public final Element jsp_element(Element parent) throws RecognitionException {
        Element tag = null;

        JSPScriptlet jsp_scriplet1 = null;

        JSPExpression jsp_expression2 = null;

        Element jsp_declaration3 = null;

        JSPAction jsp_action4 = null;

        Element jsp_directive5 = null;


        try {
            // JSP.g:274:3: ( jsp_scriplet[parent] | jsp_expression[parent] | jsp_declaration[parent] | jsp_action[ parent] | jsp_directive[parent] )
            int alt2=5;
            switch ( input.LA(1) ) {
            case JSPTAGOPEN:
            case OPENSCRIPLET:
                {
                alt2=1;
                }
                break;
            case JSPOPENEXPR:
            case OPENEXPR:
                {
                alt2=2;
                }
                break;
            case JSPOPENDECL:
            case OPENDECL:
                {
                alt2=3;
                }
                break;
            case JSPUSEBEAN:
            case JSPSET:
            case JSPGET:
            case JSPOPENINC:
            case JSPOPENFWD:
            case JSPOPENPLUG:
            case JSPOPENROOT:
            case JSPOPENTEXT:
            case JSPOPENATTR:
            case JSPOPENBODY:
            case JSPOPENINVOKE:
            case JSPOPENDOBODY:
            case JSPOPENOUTPUT:
            case JSPELEMENTOP:
            case 67:
                {
                alt2=4;
                }
                break;
            case JSPOPENDIR:
            case OPENDIRECT:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // JSP.g:275:9: jsp_scriplet[parent]
                    {
                    pushFollow(FOLLOW_jsp_scriplet_in_jsp_element316);
                    jsp_scriplet1=jsp_scriplet(parent);

                    state._fsp--;

                    tag=jsp_scriplet1;

                    }
                    break;
                case 2 :
                    // JSP.g:276:10: jsp_expression[parent]
                    {
                    pushFollow(FOLLOW_jsp_expression_in_jsp_element339);
                    jsp_expression2=jsp_expression(parent);

                    state._fsp--;

                    tag=jsp_expression2;

                    }
                    break;
                case 3 :
                    // JSP.g:277:10: jsp_declaration[parent]
                    {
                    pushFollow(FOLLOW_jsp_declaration_in_jsp_element354);
                    jsp_declaration3=jsp_declaration(parent);

                    state._fsp--;

                    tag=jsp_declaration3;

                    }
                    break;
                case 4 :
                    // JSP.g:278:10: jsp_action[ parent]
                    {
                    pushFollow(FOLLOW_jsp_action_in_jsp_element438);
                    jsp_action4=jsp_action(parent);

                    state._fsp--;

                    tag=jsp_action4;

                    }
                    break;
                case 5 :
                    // JSP.g:279:10: jsp_directive[parent]
                    {
                    pushFollow(FOLLOW_jsp_directive_in_jsp_element456);
                    jsp_directive5=jsp_directive(parent);

                    state._fsp--;

                    tag=jsp_directive5;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return tag;
    }
    // $ANTLR end "jsp_element"


    // $ANTLR start "endtag"
    // JSP.g:282:10: fragment endtag returns [Element tag] : '</' ( WS )? id1= ID ( ( WS )? ':' ( WS )? id2= ID )? ( WS )? '>' ;
    public final Element endtag() throws RecognitionException {
        Element tag = null;

        Token id1=null;
        Token id2=null;

        try {
            // JSP.g:283:3: ( '</' ( WS )? id1= ID ( ( WS )? ':' ( WS )? id2= ID )? ( WS )? '>' )
            // JSP.g:286:6: '</' ( WS )? id1= ID ( ( WS )? ':' ( WS )? id2= ID )? ( WS )? '>'
            {
            match(input,OPENCLOSE,FOLLOW_OPENCLOSE_in_endtag526); 
            // JSP.g:286:11: ( WS )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==WS) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // JSP.g:286:11: WS
                    {
                    match(input,WS,FOLLOW_WS_in_endtag528); 

                    }
                    break;

            }

            id1=(Token)match(input,ID,FOLLOW_ID_in_endtag533); 
            // JSP.g:286:23: ( ( WS )? ':' ( WS )? id2= ID )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==WS) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==DDOT) ) {
                    alt6=1;
                }
            }
            else if ( (LA6_0==DDOT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // JSP.g:286:24: ( WS )? ':' ( WS )? id2= ID
                    {
                    // JSP.g:286:24: ( WS )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==WS) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // JSP.g:286:24: WS
                            {
                            match(input,WS,FOLLOW_WS_in_endtag537); 

                            }
                            break;

                    }

                    match(input,DDOT,FOLLOW_DDOT_in_endtag540); 
                    // JSP.g:286:32: ( WS )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==WS) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // JSP.g:286:32: WS
                            {
                            match(input,WS,FOLLOW_WS_in_endtag542); 

                            }
                            break;

                    }

                    id2=(Token)match(input,ID,FOLLOW_ID_in_endtag547); 

                    }
                    break;

            }

            // JSP.g:286:45: ( WS )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==WS) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // JSP.g:286:45: WS
                    {
                    match(input,WS,FOLLOW_WS_in_endtag551); 

                    }
                    break;

            }

            match(input,66,FOLLOW_66_in_endtag553); 
                        
                  
                   String endTagName =  id1.getText()+ (id2!=null?":"+id2.getText():"") ;    //$NON-NLS-1$     
                   resolveChild(endTagName);        
                 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return tag;
    }
    // $ANTLR end "endtag"


    // $ANTLR start "tag"
    // JSP.g:294:10: fragment tag[Element parent] returns [Element tag] : ( '<' ( WS )? id1= ID ( attribute[tag] | WS | jsp= jsp_element[tag] )* ( '>' | '/>' ) ) ;
    public final Element tag(Element parent) throws RecognitionException {
        Element tag = null;

        Token id1=null;
        Element jsp = null;


        try {
            // JSP.g:295:3: ( ( '<' ( WS )? id1= ID ( attribute[tag] | WS | jsp= jsp_element[tag] )* ( '>' | '/>' ) ) )
            // JSP.g:297:5: ( '<' ( WS )? id1= ID ( attribute[tag] | WS | jsp= jsp_element[tag] )* ( '>' | '/>' ) )
            {
            // JSP.g:297:5: ( '<' ( WS )? id1= ID ( attribute[tag] | WS | jsp= jsp_element[tag] )* ( '>' | '/>' ) )
            // JSP.g:298:5: '<' ( WS )? id1= ID ( attribute[tag] | WS | jsp= jsp_element[tag] )* ( '>' | '/>' )
            {

                  Boolean isJavascript = false;
                  
                
            match(input,67,FOLLOW_67_in_tag621); 
            // JSP.g:303:11: ( WS )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==WS) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // JSP.g:303:11: WS
                    {
                    match(input,WS,FOLLOW_WS_in_tag623); 

                    }
                    break;

            }

            id1=(Token)match(input,ID,FOLLOW_ID_in_tag628); 
                                
                      isJavascript = id1.getText().equalsIgnoreCase("script");//$NON-NLS-1$      
                      if(isJavascript)
                      {
                         tag = this.factory.createJavaScript();
                         String tmp =  id1.getText() ;                                                      
                        // tag.setName(tmp); 
                         setParent(parent,tag);    
                         //We Should concatenate every token we found till we meet </script>
                         //But we do not want to declare "</script>" as a token because then it creates some problems           
                          String text = "";//$NON-NLS-1$
                          Boolean tagHeader = true;
                          loop1:
                            do {  
                                  if(input.LT(1).getText()!=null && input.LT(2).getText()!=null && input.LT(3).getText()!=null){
            			                    //End of script tag                                               
            			                    if (input.LT(1).getText().equalsIgnoreCase("</")//$NON-NLS-1$ 
            			                    && input.LT(2).getText().equalsIgnoreCase("script")//$NON-NLS-1$  
            			                    && input.LT(3).getText().equalsIgnoreCase(">") ) //$NON-NLS-1$  
            			                    {    
            			                    //We need to consume the 3 next token for '</' 'script' '>'         
            			                       input.consume();
            			                       input.consume();
            			                       input.consume();                       
            			                        break loop1;
            			                    }
            			                    //end of the tag script element
            			                    else if(input.LT(1).getText().equalsIgnoreCase(">") && tagHeader)//$NON-NLS-1$  
            			                    {                      
            			                        //We need to retrieve the content of the tag, eg : attributes
            			                       tag.setName(text);
            			                      
            			                       //We do not want to change the title
            			                       tagHeader = false;
            			                       matchAny(input); 
            			                       text="";
            			                    }
            			                    else  
            			                    {   
            			                   
            			                   /**This is the part where occured the JSP element detection
            			                   * This part is static, meaning if some token's name is changed in the grammar rule
            			                   * it has to be manually changed here
            			                   **/                  
            			                    switch ( input.LA(1) ) {
            			                    
            			                    //SCRIPLET CASE
            									            case JSPTAGOPEN:
            									            case OPENSCRIPLET:
            									                {
            									                  createJavascriptText(tag,text); text = "";
            									                  jsp_scriplet(tag);
            									                }
            									                break;
            									                
            									                //JSP EXPRESSION CASE
            									            case JSPOPENEXPR:
            									            case OPENEXPR:
            									                {
            										                createJavascriptText(tag,text); text = "";
            										                jsp_expression(tag);
            									                }
            									                break;
            									                
            									           //JSP DECLARATION CASE
            									            case JSPOPENDECL:
            									            case OPENDECL:
            									                {
            									                  createJavascriptText(tag,text); text = "";
            									                jsp_declaration(tag);
            									                }
            									                break;
            									                
            									                //JSP STANDART ACTION CASE
            									            case JSPUSEBEAN:
            									            case JSPSET:
            									            case JSPGET:
            									            case JSPOPENINC:
            									            case JSPOPENFWD:
            									            case JSPOPENPLUG:
            									            case JSPOPENROOT:
            									            case JSPOPENTEXT:
            									            case JSPOPENATTR:
            									            case JSPOPENBODY:
            									            case JSPOPENINVOKE:
            									            case JSPOPENDOBODY:
            									            case JSPOPENOUTPUT:
            									            case JSPELEMENTOP:		 				            
            									                {
            										                createJavascriptText(tag,text); text = "";
            										                jsp_action(tag);
            									                }
            									                break;
            									         
            									         //JSP ACTION CASE
            									         //The constant has to match to token id of the '<' caracter
            									            case 67:
            									              {
            			                              if(input.LA(2) == ID && input.LA(3)==DDOT && input.LA(4)== ID){
            			                                 createJavascriptText(tag,text); text = "";
            			                                 jsp_action(tag);
            			                              }
            			                              else{
            				                              text+=space+input.get(input.mark()).getText();
            				                              matchAny(input); 
            			                              }
            			                           }
            			                           break;
            									         
            									         //JSP DIRECTIVE CASE
            									            case JSPOPENDIR:
            									            case OPENDIRECT:
            									                {
            										                createJavascriptText(tag,text); text = "";
            										                jsp_directive(tag);
            									                }
            									                break;
            									                
            									                //JSP COMMENT CASE
            									              case JSP_COMMENT:
            									              {
            				                            createJavascriptText(tag,text); text = "";
            				                            comment(tag);
            			                           }
            									                break;
            									              //Case of a closing tag
            									              case 21:
            									              {
            									                createJavascriptText(tag,text); text = "";
            			                                          
            													        Boolean parentFound = false;
            							                    String closingTagName=input.LT(2).getText()+
            							                    input.LT(3).getText()+input.LT(4).getText();
            							                    
            							                    Node parentNode = null;
            			                           
            			                            ArrayList<Node> toBeAdded = new ArrayList<Node>();                                                                          
            			                            
            			                            for(Node node : tag.getChildren()){  
            			                               if(!parentFound){
            			                                  if(node.getName().equalsIgnoreCase(closingTagName)){
            			                                     parentFound = true;                                    
            			                                     parentNode = node;                                     
            			                                  }                             
            			                               }else
            			                               {
            			                                   toBeAdded.add(node);
            			                               }
            			                            }
            			                             
            			                            for(Node child:toBeAdded){                             
            			                               ((Element)parentNode).getChildren().add(child);
            			                            }
            			                                                                   
            							                    input.consume();
            							                    input.consume();
            							                    input.consume();
            							                    input.consume();
            							                    input.consume();
            							                  }  
            									              break;
            									              
            									            default:
            									              text+=space+input.get(input.mark()).getText();
            			                          matchAny(input); 
            									            }						                                                                                    
            			                    }   
                                }else{
                                //This case would appear if there is a problem in the file formation, or the
                                // abscence of the </script> tag
                               MoDiscoLogger.logInfo("The </script> was not detected ", JspActivator.getDefault());
                               break loop1; 
                                }                            
                            } while (true);
                           
                           createJavascriptText(tag,text); text = "";
                          
                           return tag;
                                
                      }        
                      else
                      {
                         tag = xmlFactory.createElement();
                      }  
                      String tmp = id1.getText() ;                                                   
                      tag.setName(tmp); 
                      setParent(parent,tag);                                                                      
                    
            // JSP.g:494:9: ( attribute[tag] | WS | jsp= jsp_element[tag] )*
            loop9:
            do {
                int alt9=4;
                switch ( input.LA(1) ) {
                case ID:
                    {
                    alt9=1;
                    }
                    break;
                case WS:
                    {
                    alt9=2;
                    }
                    break;
                case JSPTAGOPEN:
                case JSPOPENEXPR:
                case JSPOPENDECL:
                case JSPOPENDIR:
                case JSPUSEBEAN:
                case JSPSET:
                case JSPGET:
                case JSPOPENINC:
                case JSPOPENFWD:
                case JSPOPENPLUG:
                case JSPOPENROOT:
                case JSPOPENTEXT:
                case JSPOPENATTR:
                case JSPOPENBODY:
                case JSPOPENINVOKE:
                case JSPOPENDOBODY:
                case JSPOPENOUTPUT:
                case JSPELEMENTOP:
                case OPENSCRIPLET:
                case OPENEXPR:
                case OPENDECL:
                case OPENDIRECT:
                case 67:
                    {
                    alt9=3;
                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // JSP.g:497:15: attribute[tag]
            	    {
            	    pushFollow(FOLLOW_attribute_in_tag685);
            	    attribute(tag);

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // JSP.g:497:32: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_tag690); 

            	    }
            	    break;
            	case 3 :
            	    // JSP.g:499:15: jsp= jsp_element[tag]
            	    {
            	    pushFollow(FOLLOW_jsp_element_in_tag724);
            	    jsp=jsp_element(tag);

            	    state._fsp--;


            	                  //We need to know when a JSP element is contained in the tag
            	                  //or if it is just a casual children
            	                  if(jsp instanceof JSPScript){
            	                       ((JSPScript)jsp).setIsTagFragment(true);
            	                     }                         
            	                     else if(jsp instanceof JSPAction ){
            	                       ((JSPAction)jsp).setIsTagFragment(true);
            	                     }
            	                     else if(jsp instanceof JSPComment){
            	                       ((JSPComment)jsp).setIsTagFragment(true);
            	                     }
            	                   

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( input.LA(1)==JSPCLOSEACT||input.LA(1)==66 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return tag;
    }
    // $ANTLR end "tag"


    // $ANTLR start "jsp_scriplet"
    // JSP.g:518:10: fragment jsp_scriplet[Element parent] returns [JSPScriptlet tag] : ( ( '<%' '%>' ) | ( '<jsp:scriptlet>' '</jsp:scriptlet>' ) );
    public final JSPScriptlet jsp_scriplet(Element parent) throws RecognitionException {
        JSPScriptlet tag = null;

        try {
            // JSP.g:519:3: ( ( '<%' '%>' ) | ( '<jsp:scriptlet>' '</jsp:scriptlet>' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==JSPTAGOPEN) ) {
                alt10=1;
            }
            else if ( (LA10_0==OPENSCRIPLET) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // JSP.g:521:11: ( '<%' '%>' )
                    {
                    // JSP.g:521:11: ( '<%' '%>' )
                    // JSP.g:522:13: '<%' '%>'
                    {
                    match(input,JSPTAGOPEN,FOLLOW_JSPTAGOPEN_in_jsp_scriplet860); 
                              
                                   tag = this.factory.createJSPScriptlet();
                                   setParent(parent, tag);
                                   getTagContent(JSPTAGCLOSE,tag);      
                                  
                    match(input,JSPTAGCLOSE,FOLLOW_JSPTAGCLOSE_in_jsp_scriplet906); 

                    }


                    }
                    break;
                case 2 :
                    // JSP.g:534:10: ( '<jsp:scriptlet>' '</jsp:scriptlet>' )
                    {
                    // JSP.g:534:10: ( '<jsp:scriptlet>' '</jsp:scriptlet>' )
                    // JSP.g:535:12: '<jsp:scriptlet>' '</jsp:scriptlet>'
                    {
                    match(input,OPENSCRIPLET,FOLLOW_OPENSCRIPLET_in_jsp_scriplet992); 
                           
                                   tag = this.factory.createJSPScriptlet();
                                   setParent( parent, tag);
                                   getTagContent(CLOSESCRIPTLET,tag);
                                 
                    match(input,CLOSESCRIPTLET,FOLLOW_CLOSESCRIPTLET_in_jsp_scriplet1032); 

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
        }
        return tag;
    }
    // $ANTLR end "jsp_scriplet"


    // $ANTLR start "jsp_declaration"
    // JSP.g:545:10: fragment jsp_declaration[Element parent] returns [Element tag] : ( ( '<%!' '%>' ) | ( '<jsp:declaration>' '</jsp:declaration>' ) );
    public final Element jsp_declaration(Element parent) throws RecognitionException {
        Element tag = null;

        try {
            // JSP.g:546:3: ( ( '<%!' '%>' ) | ( '<jsp:declaration>' '</jsp:declaration>' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==JSPOPENDECL) ) {
                alt11=1;
            }
            else if ( (LA11_0==OPENDECL) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // JSP.g:550:6: ( '<%!' '%>' )
                    {
                    // JSP.g:550:6: ( '<%!' '%>' )
                    // JSP.g:551:9: '<%!' '%>'
                    {
                    match(input,JSPOPENDECL,FOLLOW_JSPOPENDECL_in_jsp_declaration1100); 
                            
                                tag = this.factory.createJSPDeclaration();
                                setParent(parent, tag);
                                getTagContent(JSPTAGCLOSE,tag);                     
                              
                    match(input,JSPTAGCLOSE,FOLLOW_JSPTAGCLOSE_in_jsp_declaration1127); 

                    }


                    }
                    break;
                case 2 :
                    // JSP.g:562:6: ( '<jsp:declaration>' '</jsp:declaration>' )
                    {
                    // JSP.g:562:6: ( '<jsp:declaration>' '</jsp:declaration>' )
                    // JSP.g:564:6: '<jsp:declaration>' '</jsp:declaration>'
                    {
                    match(input,OPENDECL,FOLLOW_OPENDECL_in_jsp_declaration1174); 
                        
                                  tag = this.factory.createJSPDeclaration();
                                  setParent( parent, tag);
                                  getTagContent(CLOSEDECL,tag);  
                              
                    match(input,CLOSEDECL,FOLLOW_CLOSEDECL_in_jsp_declaration1198); 

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
        }
        return tag;
    }
    // $ANTLR end "jsp_declaration"


    // $ANTLR start "jsp_directive"
    // JSP.g:574:10: fragment jsp_directive[Element parent] returns [Element tag] : ( '<%@' ( WS )? id1= ID ( attribute[tag] | WS )* '%>' | '<jsp:directive.' ( WS )? id2= ID ( attribute[tag] | WS )* '/>' );
    public final Element jsp_directive(Element parent) throws RecognitionException {
        Element tag = null;

        Token id1=null;
        Token id2=null;

        try {
            // JSP.g:575:3: ( '<%@' ( WS )? id1= ID ( attribute[tag] | WS )* '%>' | '<jsp:directive.' ( WS )? id2= ID ( attribute[tag] | WS )* '/>' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==JSPOPENDIR) ) {
                alt16=1;
            }
            else if ( (LA16_0==OPENDIRECT) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // JSP.g:578:4: '<%@' ( WS )? id1= ID ( attribute[tag] | WS )* '%>'
                    {
                    match(input,JSPOPENDIR,FOLLOW_JSPOPENDIR_in_jsp_directive1240); 
                    // JSP.g:578:10: ( WS )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==WS) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // JSP.g:578:10: WS
                            {
                            match(input,WS,FOLLOW_WS_in_jsp_directive1242); 

                            }
                            break;

                    }

                    id1=(Token)match(input,ID,FOLLOW_ID_in_jsp_directive1266); 
                      
                                if(id1.getText().equalsIgnoreCase("taglib")){//$NON-NLS-1$
                                  tag = this.factory.createJSPTagLib();                            
                                }else{
                                  tag = this.factory.createJSPDirective();
                                }
                                tag.setName(id1.getText());
                                setParent( parent, tag);                               
                              
                    // JSP.g:590:11: ( attribute[tag] | WS )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==ID) ) {
                            alt13=1;
                        }
                        else if ( (LA13_0==WS) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // JSP.g:590:12: attribute[tag]
                    	    {
                    	    pushFollow(FOLLOW_attribute_in_jsp_directive1294);
                    	    attribute(tag);

                    	    state._fsp--;


                    	    }
                    	    break;
                    	case 2 :
                    	    // JSP.g:590:27: WS
                    	    {
                    	    match(input,WS,FOLLOW_WS_in_jsp_directive1297); 

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    match(input,JSPTAGCLOSE,FOLLOW_JSPTAGCLOSE_in_jsp_directive1315); 

                    }
                    break;
                case 2 :
                    // JSP.g:596:5: '<jsp:directive.' ( WS )? id2= ID ( attribute[tag] | WS )* '/>'
                    {

                          tag = this.factory.createJSPDirective();
                          setParent( parent, tag); 
                        
                    match(input,OPENDIRECT,FOLLOW_OPENDIRECT_in_jsp_directive1362); 
                    // JSP.g:600:23: ( WS )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==WS) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // JSP.g:600:23: WS
                            {
                            match(input,WS,FOLLOW_WS_in_jsp_directive1364); 

                            }
                            break;

                    }

                    id2=(Token)match(input,ID,FOLLOW_ID_in_jsp_directive1369); 
                    // JSP.g:600:34: ( attribute[tag] | WS )*
                    loop15:
                    do {
                        int alt15=3;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==ID) ) {
                            alt15=1;
                        }
                        else if ( (LA15_0==WS) ) {
                            alt15=2;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // JSP.g:600:35: attribute[tag]
                    	    {
                    	    pushFollow(FOLLOW_attribute_in_jsp_directive1372);
                    	    attribute(tag);

                    	    state._fsp--;


                    	    }
                    	    break;
                    	case 2 :
                    	    // JSP.g:600:50: WS
                    	    {
                    	    match(input,WS,FOLLOW_WS_in_jsp_directive1375); 

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    match(input,JSPCLOSEACT,FOLLOW_JSPCLOSEACT_in_jsp_directive1380); 
                     
                          tag.setName(id2.getText());       
                        

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return tag;
    }
    // $ANTLR end "jsp_directive"


    // $ANTLR start "jsp_expression"
    // JSP.g:606:10: fragment jsp_expression[Element parent] returns [JSPExpression tag] : ( ( '<%=' '%>' ) | ( '<jsp:expression>' '</jsp:expression>' ) );
    public final JSPExpression jsp_expression(Element parent) throws RecognitionException {
        JSPExpression tag = null;

        try {
            // JSP.g:607:3: ( ( '<%=' '%>' ) | ( '<jsp:expression>' '</jsp:expression>' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==JSPOPENEXPR) ) {
                alt17=1;
            }
            else if ( (LA17_0==OPENEXPR) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // JSP.g:609:8: ( '<%=' '%>' )
                    {
                    // JSP.g:609:8: ( '<%=' '%>' )
                    // JSP.g:610:11: '<%=' '%>'
                    {
                    match(input,JSPOPENEXPR,FOLLOW_JSPOPENEXPR_in_jsp_expression1435); 
                              
                                  tag = this.factory.createJSPExpression();
                                  setParent( parent, tag);
                                  getTagContent(JSPTAGCLOSE,tag);
                                
                    match(input,JSPTAGCLOSE,FOLLOW_JSPTAGCLOSE_in_jsp_expression1475); 

                    }


                    }
                    break;
                case 2 :
                    // JSP.g:620:8: ( '<jsp:expression>' '</jsp:expression>' )
                    {
                    // JSP.g:620:8: ( '<jsp:expression>' '</jsp:expression>' )
                    // JSP.g:621:12: '<jsp:expression>' '</jsp:expression>'
                    {
                    match(input,OPENEXPR,FOLLOW_OPENEXPR_in_jsp_expression1525); 
                          
                                 tag = this.factory.createJSPExpression();           
                                 setParent( parent, tag);   
                                 getTagContent(CLOSEEXPR,tag);           
                                
                    match(input,CLOSEEXPR,FOLLOW_CLOSEEXPR_in_jsp_expression1570); 

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
        }
        return tag;
    }
    // $ANTLR end "jsp_expression"


    // $ANTLR start "jsp_action"
    // JSP.g:632:10: fragment jsp_action[Element parent] returns [JSPAction tag] : ( ( '<' ( WS )? id1= ID ( WS )? ':' ( WS )? id2= ID ( attribute[tag] | WS | jsp= jsp_element[tag] )* ( '>' | '/>' ) ) | jsp_standard_action[parent] );
    public final JSPAction jsp_action(Element parent) throws RecognitionException {
        JSPAction tag = null;

        Token id1=null;
        Token id2=null;
        Element jsp = null;

        JSPStdAction jsp_standard_action6 = null;


        try {
            // JSP.g:633:3: ( ( '<' ( WS )? id1= ID ( WS )? ':' ( WS )? id2= ID ( attribute[tag] | WS | jsp= jsp_element[tag] )* ( '>' | '/>' ) ) | jsp_standard_action[parent] )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==67) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=JSPUSEBEAN && LA22_0<=JSPOPENINC)||LA22_0==JSPOPENFWD||LA22_0==JSPOPENPLUG||LA22_0==JSPOPENROOT||LA22_0==JSPOPENTEXT||(LA22_0>=JSPOPENATTR && LA22_0<=JSPOPENBODY)||(LA22_0>=JSPOPENINVOKE && LA22_0<=JSPELEMENTOP)) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // JSP.g:634:7: ( '<' ( WS )? id1= ID ( WS )? ':' ( WS )? id2= ID ( attribute[tag] | WS | jsp= jsp_element[tag] )* ( '>' | '/>' ) )
                    {
                    // JSP.g:634:7: ( '<' ( WS )? id1= ID ( WS )? ':' ( WS )? id2= ID ( attribute[tag] | WS | jsp= jsp_element[tag] )* ( '>' | '/>' ) )
                    // JSP.g:635:8: '<' ( WS )? id1= ID ( WS )? ':' ( WS )? id2= ID ( attribute[tag] | WS | jsp= jsp_element[tag] )* ( '>' | '/>' )
                    {
                    match(input,67,FOLLOW_67_in_jsp_action1625); 
                    // JSP.g:635:12: ( WS )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==WS) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // JSP.g:635:12: WS
                            {
                            match(input,WS,FOLLOW_WS_in_jsp_action1627); 

                            }
                            break;

                    }

                    id1=(Token)match(input,ID,FOLLOW_ID_in_jsp_action1632); 
                    // JSP.g:635:23: ( WS )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==WS) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // JSP.g:635:23: WS
                            {
                            match(input,WS,FOLLOW_WS_in_jsp_action1634); 

                            }
                            break;

                    }

                    match(input,DDOT,FOLLOW_DDOT_in_jsp_action1637); 
                    // JSP.g:635:31: ( WS )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==WS) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // JSP.g:635:31: WS
                            {
                            match(input,WS,FOLLOW_WS_in_jsp_action1639); 

                            }
                            break;

                    }

                    id2=(Token)match(input,ID,FOLLOW_ID_in_jsp_action1644); 
                       
                              tag = this.factory.createJSPAction();
                              tag.setName(id1.getText()+":"+id2.getText());
                              setParent( parent, tag);          
                           
                    // JSP.g:641:9: ( attribute[tag] | WS | jsp= jsp_element[tag] )*
                    loop21:
                    do {
                        int alt21=4;
                        switch ( input.LA(1) ) {
                        case ID:
                            {
                            alt21=1;
                            }
                            break;
                        case WS:
                            {
                            alt21=2;
                            }
                            break;
                        case JSPTAGOPEN:
                        case JSPOPENEXPR:
                        case JSPOPENDECL:
                        case JSPOPENDIR:
                        case JSPUSEBEAN:
                        case JSPSET:
                        case JSPGET:
                        case JSPOPENINC:
                        case JSPOPENFWD:
                        case JSPOPENPLUG:
                        case JSPOPENROOT:
                        case JSPOPENTEXT:
                        case JSPOPENATTR:
                        case JSPOPENBODY:
                        case JSPOPENINVOKE:
                        case JSPOPENDOBODY:
                        case JSPOPENOUTPUT:
                        case JSPELEMENTOP:
                        case OPENSCRIPLET:
                        case OPENEXPR:
                        case OPENDECL:
                        case OPENDIRECT:
                        case 67:
                            {
                            alt21=3;
                            }
                            break;

                        }

                        switch (alt21) {
                    	case 1 :
                    	    // JSP.g:642:17: attribute[tag]
                    	    {
                    	    pushFollow(FOLLOW_attribute_in_jsp_action1681);
                    	    attribute(tag);

                    	    state._fsp--;


                    	    }
                    	    break;
                    	case 2 :
                    	    // JSP.g:643:19: WS
                    	    {
                    	    match(input,WS,FOLLOW_WS_in_jsp_action1704); 

                    	    }
                    	    break;
                    	case 3 :
                    	    // JSP.g:645:17: jsp= jsp_element[tag]
                    	    {
                    	    pushFollow(FOLLOW_jsp_element_in_jsp_action1743);
                    	    jsp=jsp_element(tag);

                    	    state._fsp--;


                    	                    //We need to know when a JSP element is contained in the tag
                    	                    //or if it is just a casual children
                    	                    if(jsp instanceof JSPScript){
                    	                         ((JSPScript)jsp).setIsTagFragment(true);
                    	                       }                         
                    	                       else if(jsp instanceof JSPAction ){
                    	                         ((JSPAction)jsp).setIsTagFragment(true);
                    	                       }
                    	                       else if(jsp instanceof JSPComment){
                    	                         ((JSPComment)jsp).setIsTagFragment(true);
                    	                       }
                    	                     

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    if ( input.LA(1)==JSPCLOSEACT||input.LA(1)==66 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }


                    }
                    break;
                case 2 :
                    // JSP.g:664:4: jsp_standard_action[parent]
                    {
                    pushFollow(FOLLOW_jsp_standard_action_in_jsp_action1816);
                    jsp_standard_action6=jsp_standard_action(parent);

                    state._fsp--;

                    tag=jsp_standard_action6;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return tag;
    }
    // $ANTLR end "jsp_action"


    // $ANTLR start "jsp_standard_action"
    // JSP.g:673:10: fragment jsp_standard_action[Element parent] returns [JSPStdAction tag] : ( jsp_include[parent] | jsp_plugin[parent] | jsp_getProperty[parent] | jsp_setProperty[parent] | jsp_useBean[parent] | jsp_forward[parent] | jsp_dobody[parent] | jsp_output[parent] | jsp_invoke[parent] | jsp_body[parent] | jsp_attribute[parent] | jsp_text[parent] | jsp_root[parent] | jsp_eltStdAct[parent] );
    public final JSPStdAction jsp_standard_action(Element parent) throws RecognitionException {
        JSPStdAction tag = null;

        JSPStdAction jsp_include7 = null;

        JSPStdAction jsp_plugin8 = null;

        JSPStdAction jsp_getProperty9 = null;

        JSPStdAction jsp_setProperty10 = null;

        JSPStdAction jsp_useBean11 = null;

        JSPStdAction jsp_forward12 = null;

        JSPStdAction jsp_dobody13 = null;

        JSPStdAction jsp_output14 = null;

        JSPStdAction jsp_invoke15 = null;

        JSPStdAction jsp_body16 = null;

        JSPStdAction jsp_attribute17 = null;

        JSPStdAction jsp_text18 = null;

        JSPStdAction jsp_root19 = null;

        JSPStdAction jsp_eltStdAct20 = null;


        try {
            // JSP.g:674:3: ( jsp_include[parent] | jsp_plugin[parent] | jsp_getProperty[parent] | jsp_setProperty[parent] | jsp_useBean[parent] | jsp_forward[parent] | jsp_dobody[parent] | jsp_output[parent] | jsp_invoke[parent] | jsp_body[parent] | jsp_attribute[parent] | jsp_text[parent] | jsp_root[parent] | jsp_eltStdAct[parent] )
            int alt23=14;
            switch ( input.LA(1) ) {
            case JSPOPENINC:
                {
                alt23=1;
                }
                break;
            case JSPOPENPLUG:
                {
                alt23=2;
                }
                break;
            case JSPGET:
                {
                alt23=3;
                }
                break;
            case JSPSET:
                {
                alt23=4;
                }
                break;
            case JSPUSEBEAN:
                {
                alt23=5;
                }
                break;
            case JSPOPENFWD:
                {
                alt23=6;
                }
                break;
            case JSPOPENDOBODY:
                {
                alt23=7;
                }
                break;
            case JSPOPENOUTPUT:
                {
                alt23=8;
                }
                break;
            case JSPOPENINVOKE:
                {
                alt23=9;
                }
                break;
            case JSPOPENBODY:
                {
                alt23=10;
                }
                break;
            case JSPOPENATTR:
                {
                alt23=11;
                }
                break;
            case JSPOPENTEXT:
                {
                alt23=12;
                }
                break;
            case JSPOPENROOT:
                {
                alt23=13;
                }
                break;
            case JSPELEMENTOP:
                {
                alt23=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // JSP.g:675:4: jsp_include[parent]
                    {
                    pushFollow(FOLLOW_jsp_include_in_jsp_standard_action1850);
                    jsp_include7=jsp_include(parent);

                    state._fsp--;

                    tag=jsp_include7;

                    }
                    break;
                case 2 :
                    // JSP.g:676:5: jsp_plugin[parent]
                    {
                    pushFollow(FOLLOW_jsp_plugin_in_jsp_standard_action1864);
                    jsp_plugin8=jsp_plugin(parent);

                    state._fsp--;

                    tag=jsp_plugin8;

                    }
                    break;
                case 3 :
                    // JSP.g:677:5: jsp_getProperty[parent]
                    {
                    pushFollow(FOLLOW_jsp_getProperty_in_jsp_standard_action1878);
                    jsp_getProperty9=jsp_getProperty(parent);

                    state._fsp--;

                    tag=jsp_getProperty9;

                    }
                    break;
                case 4 :
                    // JSP.g:678:5: jsp_setProperty[parent]
                    {
                    pushFollow(FOLLOW_jsp_setProperty_in_jsp_standard_action1887);
                    jsp_setProperty10=jsp_setProperty(parent);

                    state._fsp--;

                    tag=jsp_setProperty10;

                    }
                    break;
                case 5 :
                    // JSP.g:679:5: jsp_useBean[parent]
                    {
                    pushFollow(FOLLOW_jsp_useBean_in_jsp_standard_action1896);
                    jsp_useBean11=jsp_useBean(parent);

                    state._fsp--;

                    tag=jsp_useBean11;

                    }
                    break;
                case 6 :
                    // JSP.g:680:5: jsp_forward[parent]
                    {
                    pushFollow(FOLLOW_jsp_forward_in_jsp_standard_action1909);
                    jsp_forward12=jsp_forward(parent);

                    state._fsp--;

                    tag=jsp_forward12;

                    }
                    break;
                case 7 :
                    // JSP.g:681:5: jsp_dobody[parent]
                    {
                    pushFollow(FOLLOW_jsp_dobody_in_jsp_standard_action1922);
                    jsp_dobody13=jsp_dobody(parent);

                    state._fsp--;

                    tag=jsp_dobody13;

                    }
                    break;
                case 8 :
                    // JSP.g:682:5: jsp_output[parent]
                    {
                    pushFollow(FOLLOW_jsp_output_in_jsp_standard_action1936);
                    jsp_output14=jsp_output(parent);

                    state._fsp--;

                    tag=jsp_output14;

                    }
                    break;
                case 9 :
                    // JSP.g:683:5: jsp_invoke[parent]
                    {
                    pushFollow(FOLLOW_jsp_invoke_in_jsp_standard_action1950);
                    jsp_invoke15=jsp_invoke(parent);

                    state._fsp--;

                    tag=jsp_invoke15;

                    }
                    break;
                case 10 :
                    // JSP.g:684:5: jsp_body[parent]
                    {
                    pushFollow(FOLLOW_jsp_body_in_jsp_standard_action1964);
                    jsp_body16=jsp_body(parent);

                    state._fsp--;

                    tag=jsp_body16;

                    }
                    break;
                case 11 :
                    // JSP.g:685:5: jsp_attribute[parent]
                    {
                    pushFollow(FOLLOW_jsp_attribute_in_jsp_standard_action1980);
                    jsp_attribute17=jsp_attribute(parent);

                    state._fsp--;

                    tag=jsp_attribute17;

                    }
                    break;
                case 12 :
                    // JSP.g:686:5: jsp_text[parent]
                    {
                    pushFollow(FOLLOW_jsp_text_in_jsp_standard_action1991);
                    jsp_text18=jsp_text(parent);

                    state._fsp--;

                    tag=jsp_text18;

                    }
                    break;
                case 13 :
                    // JSP.g:687:5: jsp_root[parent]
                    {
                    pushFollow(FOLLOW_jsp_root_in_jsp_standard_action2007);
                    jsp_root19=jsp_root(parent);

                    state._fsp--;

                    tag=jsp_root19;

                    }
                    break;
                case 14 :
                    // JSP.g:688:5: jsp_eltStdAct[parent]
                    {
                    pushFollow(FOLLOW_jsp_eltStdAct_in_jsp_standard_action2023);
                    jsp_eltStdAct20=jsp_eltStdAct(parent);

                    state._fsp--;

                    tag=jsp_eltStdAct20;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return tag;
    }
    // $ANTLR end "jsp_standard_action"


    // $ANTLR start "jsp_eltStdAct"
    // JSP.g:694:10: fragment jsp_eltStdAct[Element parent] returns [JSPStdAction tag] : '<jsp:element' ( attribute[tag] | WS )* ( '/>' | '>' ( jsp_element[tag] | comment[tag] | WS )* '</jsp:element>' ) ;
    public final JSPStdAction jsp_eltStdAct(Element parent) throws RecognitionException {
        JSPStdAction tag = null;

        try {
            // JSP.g:695:3: ( '<jsp:element' ( attribute[tag] | WS )* ( '/>' | '>' ( jsp_element[tag] | comment[tag] | WS )* '</jsp:element>' ) )
            // JSP.g:696:4: '<jsp:element' ( attribute[tag] | WS )* ( '/>' | '>' ( jsp_element[tag] | comment[tag] | WS )* '</jsp:element>' )
            {

                tag = createJSPStdAction(parent,"jsp:element");//$NON-NLS-1$
               
            match(input,JSPELEMENTOP,FOLLOW_JSPELEMENTOP_in_jsp_eltStdAct2070); 
            // JSP.g:700:22: ( attribute[tag] | WS )*
            loop24:
            do {
                int alt24=3;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==ID) ) {
                    alt24=1;
                }
                else if ( (LA24_0==WS) ) {
                    alt24=2;
                }


                switch (alt24) {
            	case 1 :
            	    // JSP.g:700:23: attribute[tag]
            	    {
            	    pushFollow(FOLLOW_attribute_in_jsp_eltStdAct2073);
            	    attribute(tag);

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // JSP.g:700:38: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_jsp_eltStdAct2076); 

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // JSP.g:702:7: ( '/>' | '>' ( jsp_element[tag] | comment[tag] | WS )* '</jsp:element>' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==JSPCLOSEACT) ) {
                alt26=1;
            }
            else if ( (LA26_0==66) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // JSP.g:703:7: '/>'
                    {
                    match(input,JSPCLOSEACT,FOLLOW_JSPCLOSEACT_in_jsp_eltStdAct2103); 

                    }
                    break;
                case 2 :
                    // JSP.g:705:7: '>' ( jsp_element[tag] | comment[tag] | WS )* '</jsp:element>'
                    {
                    match(input,66,FOLLOW_66_in_jsp_eltStdAct2120); 
                    // JSP.g:706:11: ( jsp_element[tag] | comment[tag] | WS )*
                    loop25:
                    do {
                        int alt25=4;
                        switch ( input.LA(1) ) {
                        case JSPTAGOPEN:
                        case JSPOPENEXPR:
                        case JSPOPENDECL:
                        case JSPOPENDIR:
                        case JSPUSEBEAN:
                        case JSPSET:
                        case JSPGET:
                        case JSPOPENINC:
                        case JSPOPENFWD:
                        case JSPOPENPLUG:
                        case JSPOPENROOT:
                        case JSPOPENTEXT:
                        case JSPOPENATTR:
                        case JSPOPENBODY:
                        case JSPOPENINVOKE:
                        case JSPOPENDOBODY:
                        case JSPOPENOUTPUT:
                        case JSPELEMENTOP:
                        case OPENSCRIPLET:
                        case OPENEXPR:
                        case OPENDECL:
                        case OPENDIRECT:
                        case 67:
                            {
                            alt25=1;
                            }
                            break;
                        case JSP_COMMENT:
                        case LINE_COMMENT:
                            {
                            alt25=2;
                            }
                            break;
                        case WS:
                            {
                            alt25=3;
                            }
                            break;

                        }

                        switch (alt25) {
                    	case 1 :
                    	    // JSP.g:706:12: jsp_element[tag]
                    	    {
                    	    pushFollow(FOLLOW_jsp_element_in_jsp_eltStdAct2139);
                    	    jsp_element(tag);

                    	    state._fsp--;


                    	    }
                    	    break;
                    	case 2 :
                    	    // JSP.g:706:29: comment[tag]
                    	    {
                    	    pushFollow(FOLLOW_comment_in_jsp_eltStdAct2142);
                    	    comment(tag);

                    	    state._fsp--;


                    	    }
                    	    break;
                    	case 3 :
                    	    // JSP.g:706:43: WS
                    	    {
                    	    match(input,WS,FOLLOW_WS_in_jsp_eltStdAct2146); 

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    match(input,68,FOLLOW_68_in_jsp_eltStdAct2165); 

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return tag;
    }
    // $ANTLR end "jsp_eltStdAct"


    // $ANTLR start "jsp_root"
    // JSP.g:721:10: fragment jsp_root[Element parent] returns [JSPStdAction tag] : '<jsp:root' ( attribute[tag] | WS )* '>' ( comment[tag] | jsp_element[tag] | WS )* '</jsp:root>' ;
    public final JSPStdAction jsp_root(Element parent) throws RecognitionException {
        JSPStdAction tag = null;

        try {
            // JSP.g:722:3: ( '<jsp:root' ( attribute[tag] | WS )* '>' ( comment[tag] | jsp_element[tag] | WS )* '</jsp:root>' )
            // JSP.g:723:4: '<jsp:root' ( attribute[tag] | WS )* '>' ( comment[tag] | jsp_element[tag] | WS )* '</jsp:root>'
            {

                  tag = createJSPStdAction(parent,"jsp:root");//$NON-NLS-1$
               
            match(input,JSPOPENROOT,FOLLOW_JSPOPENROOT_in_jsp_root2214); 
            // JSP.g:726:15: ( attribute[tag] | WS )*
            loop27:
            do {
                int alt27=3;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==ID) ) {
                    alt27=1;
                }
                else if ( (LA27_0==WS) ) {
                    alt27=2;
                }


                switch (alt27) {
            	case 1 :
            	    // JSP.g:726:16: attribute[tag]
            	    {
            	    pushFollow(FOLLOW_attribute_in_jsp_root2217);
            	    attribute(tag);

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // JSP.g:726:31: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_jsp_root2220); 

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            match(input,66,FOLLOW_66_in_jsp_root2224); 
            // JSP.g:727:5: ( comment[tag] | jsp_element[tag] | WS )*
            loop28:
            do {
                int alt28=4;
                switch ( input.LA(1) ) {
                case JSP_COMMENT:
                case LINE_COMMENT:
                    {
                    alt28=1;
                    }
                    break;
                case JSPTAGOPEN:
                case JSPOPENEXPR:
                case JSPOPENDECL:
                case JSPOPENDIR:
                case JSPUSEBEAN:
                case JSPSET:
                case JSPGET:
                case JSPOPENINC:
                case JSPOPENFWD:
                case JSPOPENPLUG:
                case JSPOPENROOT:
                case JSPOPENTEXT:
                case JSPOPENATTR:
                case JSPOPENBODY:
                case JSPOPENINVOKE:
                case JSPOPENDOBODY:
                case JSPOPENOUTPUT:
                case JSPELEMENTOP:
                case OPENSCRIPLET:
                case OPENEXPR:
                case OPENDECL:
                case OPENDIRECT:
                case 67:
                    {
                    alt28=2;
                    }
                    break;
                case WS:
                    {
                    alt28=3;
                    }
                    break;

                }

                switch (alt28) {
            	case 1 :
            	    // JSP.g:727:6: comment[tag]
            	    {
            	    pushFollow(FOLLOW_comment_in_jsp_root2231);
            	    comment(tag);

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // JSP.g:727:19: jsp_element[tag]
            	    {
            	    pushFollow(FOLLOW_jsp_element_in_jsp_root2234);
            	    jsp_element(tag);

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // JSP.g:727:36: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_jsp_root2237); 

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            match(input,JSPCLOSEROOT,FOLLOW_JSPCLOSEROOT_in_jsp_root2243); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return tag;
    }
    // $ANTLR end "jsp_root"


    // $ANTLR start "jsp_include"
    // JSP.g:731:10: fragment jsp_include[Element parent] returns [JSPStdAction tag] : '<jsp:include' ( attribute[tag] | WS )* ( '>' ( jsp_param[tag] | comment[tag] | WS )* '</jsp:include>' | '/>' ) ;
    public final JSPStdAction jsp_include(Element parent) throws RecognitionException {
        JSPStdAction tag = null;

        try {
            // JSP.g:732:3: ( '<jsp:include' ( attribute[tag] | WS )* ( '>' ( jsp_param[tag] | comment[tag] | WS )* '</jsp:include>' | '/>' ) )
            // JSP.g:733:5: '<jsp:include' ( attribute[tag] | WS )* ( '>' ( jsp_param[tag] | comment[tag] | WS )* '</jsp:include>' | '/>' )
            {

                    tag = createJSPStdAction(parent,"jsp:include");//$NON-NLS-1$
                
            match(input,JSPOPENINC,FOLLOW_JSPOPENINC_in_jsp_include2285); 
            // JSP.g:736:20: ( attribute[tag] | WS )*
            loop29:
            do {
                int alt29=3;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==ID) ) {
                    alt29=1;
                }
                else if ( (LA29_0==WS) ) {
                    alt29=2;
                }


                switch (alt29) {
            	case 1 :
            	    // JSP.g:736:21: attribute[tag]
            	    {
            	    pushFollow(FOLLOW_attribute_in_jsp_include2288);
            	    attribute(tag);

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // JSP.g:736:36: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_jsp_include2291); 

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // JSP.g:737:5: ( '>' ( jsp_param[tag] | comment[tag] | WS )* '</jsp:include>' | '/>' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==66) ) {
                alt31=1;
            }
            else if ( (LA31_0==JSPCLOSEACT) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // JSP.g:738:7: '>' ( jsp_param[tag] | comment[tag] | WS )* '</jsp:include>'
                    {
                    match(input,66,FOLLOW_66_in_jsp_include2308); 
                    // JSP.g:739:9: ( jsp_param[tag] | comment[tag] | WS )*
                    loop30:
                    do {
                        int alt30=4;
                        switch ( input.LA(1) ) {
                        case JSPOPENPARA:
                        case JSPOPENPARAS:
                            {
                            alt30=1;
                            }
                            break;
                        case JSP_COMMENT:
                        case LINE_COMMENT:
                            {
                            alt30=2;
                            }
                            break;
                        case WS:
                            {
                            alt30=3;
                            }
                            break;

                        }

                        switch (alt30) {
                    	case 1 :
                    	    // JSP.g:739:10: jsp_param[tag]
                    	    {
                    	    pushFollow(FOLLOW_jsp_param_in_jsp_include2319);
                    	    jsp_param(tag);

                    	    state._fsp--;


                    	    }
                    	    break;
                    	case 2 :
                    	    // JSP.g:739:27: comment[tag]
                    	    {
                    	    pushFollow(FOLLOW_comment_in_jsp_include2324);
                    	    comment(tag);

                    	    state._fsp--;


                    	    }
                    	    break;
                    	case 3 :
                    	    // JSP.g:739:40: WS
                    	    {
                    	    match(input,WS,FOLLOW_WS_in_jsp_include2327); 

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    match(input,JSPCLOSEINC,FOLLOW_JSPCLOSEINC_in_jsp_include2338); 

                    }
                    break;
                case 2 :
                    // JSP.g:742:7: '/>'
                    {
                    match(input,JSPCLOSEACT,FOLLOW_JSPCLOSEACT_in_jsp_include2366); 

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return tag;
    }
    // $ANTLR end "jsp_include"


    // $ANTLR start "jsp_forward"
    // JSP.g:746:10: fragment jsp_forward[Element parent] returns [JSPStdAction tag] : '<jsp:forward' ( attribute[tag] | WS )* '>' ( jsp_param[tag] | comment[tag] | WS )* '</jsp:forward>' ;
    public final JSPStdAction jsp_forward(Element parent) throws RecognitionException {
        JSPStdAction tag = null;

        try {
            // JSP.g:747:3: ( '<jsp:forward' ( attribute[tag] | WS )* '>' ( jsp_param[tag] | comment[tag] | WS )* '</jsp:forward>' )
            // JSP.g:748:5: '<jsp:forward' ( attribute[tag] | WS )* '>' ( jsp_param[tag] | comment[tag] | WS )* '</jsp:forward>'
            {

                   tag = createJSPStdAction(parent,"jsp:forward");//$NON-NLS-1$ 
                
            match(input,JSPOPENFWD,FOLLOW_JSPOPENFWD_in_jsp_forward2409); 
            // JSP.g:751:20: ( attribute[tag] | WS )*
            loop32:
            do {
                int alt32=3;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==ID) ) {
                    alt32=1;
                }
                else if ( (LA32_0==WS) ) {
                    alt32=2;
                }


                switch (alt32) {
            	case 1 :
            	    // JSP.g:751:21: attribute[tag]
            	    {
            	    pushFollow(FOLLOW_attribute_in_jsp_forward2412);
            	    attribute(tag);

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // JSP.g:751:36: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_jsp_forward2415); 

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            match(input,66,FOLLOW_66_in_jsp_forward2419); 
            // JSP.g:752:7: ( jsp_param[tag] | comment[tag] | WS )*
            loop33:
            do {
                int alt33=4;
                switch ( input.LA(1) ) {
                case JSPOPENPARA:
                case JSPOPENPARAS:
                    {
                    alt33=1;
                    }
                    break;
                case JSP_COMMENT:
                case LINE_COMMENT:
                    {
                    alt33=2;
                    }
                    break;
                case WS:
                    {
                    alt33=3;
                    }
                    break;

                }

                switch (alt33) {
            	case 1 :
            	    // JSP.g:752:8: jsp_param[tag]
            	    {
            	    pushFollow(FOLLOW_jsp_param_in_jsp_forward2428);
            	    jsp_param(tag);

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // JSP.g:752:25: comment[tag]
            	    {
            	    pushFollow(FOLLOW_comment_in_jsp_forward2433);
            	    comment(tag);

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // JSP.g:752:38: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_jsp_forward2436); 

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            match(input,JSPCLOSEFWD,FOLLOW_JSPCLOSEFWD_in_jsp_forward2445); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return tag;
    }
    // $ANTLR end "jsp_forward"


    // $ANTLR start "jsp_plugin"
    // JSP.g:768:10: fragment jsp_plugin[Element parent] returns [JSPStdAction tag] : '<jsp:plugin' ( attribute[tag] | WS )* '>' ( jsp_param[tag] | jsp_fallback[tag] | comment[tag] | WS )* '</jsp:plugin>' ;
    public final JSPStdAction jsp_plugin(Element parent) throws RecognitionException {
        JSPStdAction tag = null;

        try {
            // JSP.g:769:3: ( '<jsp:plugin' ( attribute[tag] | WS )* '>' ( jsp_param[tag] | jsp_fallback[tag] | comment[tag] | WS )* '</jsp:plugin>' )
            // JSP.g:770:5: '<jsp:plugin' ( attribute[tag] | WS )* '>' ( jsp_param[tag] | jsp_fallback[tag] | comment[tag] | WS )* '</jsp:plugin>'
            {

                  tag = createJSPStdAction(parent,"jsp:plugin");//$NON-NLS-1$
                
            match(input,JSPOPENPLUG,FOLLOW_JSPOPENPLUG_in_jsp_plugin2485); 
            // JSP.g:773:19: ( attribute[tag] | WS )*
            loop34:
            do {
                int alt34=3;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==ID) ) {
                    alt34=1;
                }
                else if ( (LA34_0==WS) ) {
                    alt34=2;
                }


                switch (alt34) {
            	case 1 :
            	    // JSP.g:773:20: attribute[tag]
            	    {
            	    pushFollow(FOLLOW_attribute_in_jsp_plugin2488);
            	    attribute(tag);

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // JSP.g:773:35: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_jsp_plugin2491); 

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            match(input,66,FOLLOW_66_in_jsp_plugin2495); 
            // JSP.g:774:7: ( jsp_param[tag] | jsp_fallback[tag] | comment[tag] | WS )*
            loop35:
            do {
                int alt35=5;
                switch ( input.LA(1) ) {
                case JSPOPENPARA:
                case JSPOPENPARAS:
                    {
                    alt35=1;
                    }
                    break;
                case JSPOPENFALL:
                    {
                    alt35=2;
                    }
                    break;
                case JSP_COMMENT:
                case LINE_COMMENT:
                    {
                    alt35=3;
                    }
                    break;
                case WS:
                    {
                    alt35=4;
                    }
                    break;

                }

                switch (alt35) {
            	case 1 :
            	    // JSP.g:774:8: jsp_param[tag]
            	    {
            	    pushFollow(FOLLOW_jsp_param_in_jsp_plugin2504);
            	    jsp_param(tag);

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // JSP.g:774:25: jsp_fallback[tag]
            	    {
            	    pushFollow(FOLLOW_jsp_fallback_in_jsp_plugin2509);
            	    jsp_fallback(tag);

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // JSP.g:774:45: comment[tag]
            	    {
            	    pushFollow(FOLLOW_comment_in_jsp_plugin2514);
            	    comment(tag);

            	    state._fsp--;


            	    }
            	    break;
            	case 4 :
            	    // JSP.g:774:58: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_jsp_plugin2517); 

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            match(input,JSPCLOSEPLUG,FOLLOW_JSPCLOSEPLUG_in_jsp_plugin2526); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return tag;
    }
    // $ANTLR end "jsp_plugin"


    // $ANTLR start "jsp_fallback"
    // JSP.g:781:10: fragment jsp_fallback[Element parent] returns [JSPStdAction tag] : '<jsp:fallback>' '</jsp:fallback>' ;
    public final JSPStdAction jsp_fallback(Element parent) throws RecognitionException {
        JSPStdAction tag = null;

        try {
            // JSP.g:782:3: ( '<jsp:fallback>' '</jsp:fallback>' )
            // JSP.g:783:5: '<jsp:fallback>' '</jsp:fallback>'
            {
             
                  tag = createJSPStdAction(parent,"jsp:fallback");//$NON-NLS-1$         
                
            match(input,JSPOPENFALL,FOLLOW_JSPOPENFALL_in_jsp_fallback2564); 
            getTagContent(JSPCLOSEFALL,tag);
            match(input,JSPCLOSEFALL,FOLLOW_JSPCLOSEFALL_in_jsp_fallback2579); 

                  tag.setName("jsp:fallback");
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return tag;
    }
    // $ANTLR end "jsp_fallback"


    // $ANTLR start "jsp_getProperty"
    // JSP.g:795:10: fragment jsp_getProperty[Element parent] returns [JSPStdAction tag] : '<jsp:getProperty' ( attribute[tag] | comment[tag] | WS )* '/>' ;
    public final JSPStdAction jsp_getProperty(Element parent) throws RecognitionException {
        JSPStdAction tag = null;

        try {
            // JSP.g:796:3: ( '<jsp:getProperty' ( attribute[tag] | comment[tag] | WS )* '/>' )
            // JSP.g:797:5: '<jsp:getProperty' ( attribute[tag] | comment[tag] | WS )* '/>'
            {

                  tag = createJSPStdAction(parent,"jsp:getProperty");//$NON-NLS-1$ 
                
            match(input,JSPGET,FOLLOW_JSPGET_in_jsp_getProperty2628); 
            // JSP.g:800:24: ( attribute[tag] | comment[tag] | WS )*
            loop36:
            do {
                int alt36=4;
                switch ( input.LA(1) ) {
                case ID:
                    {
                    alt36=1;
                    }
                    break;
                case JSP_COMMENT:
                case LINE_COMMENT:
                    {
                    alt36=2;
                    }
                    break;
                case WS:
                    {
                    alt36=3;
                    }
                    break;

                }

                switch (alt36) {
            	case 1 :
            	    // JSP.g:800:25: attribute[tag]
            	    {
            	    pushFollow(FOLLOW_attribute_in_jsp_getProperty2631);
            	    attribute(tag);

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // JSP.g:800:40: comment[tag]
            	    {
            	    pushFollow(FOLLOW_comment_in_jsp_getProperty2634);
            	    comment(tag);

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // JSP.g:800:53: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_jsp_getProperty2637); 

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            match(input,JSPCLOSEACT,FOLLOW_JSPCLOSEACT_in_jsp_getProperty2641); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return tag;
    }
    // $ANTLR end "jsp_getProperty"


    // $ANTLR start "jsp_setProperty"
    // JSP.g:806:10: fragment jsp_setProperty[Element parent] returns [JSPStdAction tag] : '<jsp:setProperty' ( attribute[tag] | comment[tag] | WS )* '/>' ;
    public final JSPStdAction jsp_setProperty(Element parent) throws RecognitionException {
        JSPStdAction tag = null;

        try {
            // JSP.g:807:3: ( '<jsp:setProperty' ( attribute[tag] | comment[tag] | WS )* '/>' )
            // JSP.g:808:5: '<jsp:setProperty' ( attribute[tag] | comment[tag] | WS )* '/>'
            {

                  tag = createJSPStdAction(parent,"jsp:setProperty");//$NON-NLS-1$
                
            match(input,JSPSET,FOLLOW_JSPSET_in_jsp_setProperty2685); 
            // JSP.g:811:24: ( attribute[tag] | comment[tag] | WS )*
            loop37:
            do {
                int alt37=4;
                switch ( input.LA(1) ) {
                case ID:
                    {
                    alt37=1;
                    }
                    break;
                case JSP_COMMENT:
                case LINE_COMMENT:
                    {
                    alt37=2;
                    }
                    break;
                case WS:
                    {
                    alt37=3;
                    }
                    break;

                }

                switch (alt37) {
            	case 1 :
            	    // JSP.g:811:25: attribute[tag]
            	    {
            	    pushFollow(FOLLOW_attribute_in_jsp_setProperty2688);
            	    attribute(tag);

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // JSP.g:811:40: comment[tag]
            	    {
            	    pushFollow(FOLLOW_comment_in_jsp_setProperty2691);
            	    comment(tag);

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // JSP.g:811:53: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_jsp_setProperty2694); 

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            match(input,JSPCLOSEACT,FOLLOW_JSPCLOSEACT_in_jsp_setProperty2698); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return tag;
    }
    // $ANTLR end "jsp_setProperty"


    // $ANTLR start "jsp_useBean"
    // JSP.g:815:10: fragment jsp_useBean[Element parent] returns [JSPStdAction tag] : ( '<jsp:useBean' ) ( attribute[tag] | comment[tag] | WS )* '/>' ;
    public final JSPStdAction jsp_useBean(Element parent) throws RecognitionException {
        JSPStdAction tag = null;

        try {
            // JSP.g:816:3: ( ( '<jsp:useBean' ) ( attribute[tag] | comment[tag] | WS )* '/>' )
            // JSP.g:817:5: ( '<jsp:useBean' ) ( attribute[tag] | comment[tag] | WS )* '/>'
            {

                  tag = createJSPStdAction(parent,"jsp:useBean");//$NON-NLS-1$
                
            // JSP.g:820:5: ( '<jsp:useBean' )
            // JSP.g:820:6: '<jsp:useBean'
            {
            match(input,JSPUSEBEAN,FOLLOW_JSPUSEBEAN_in_jsp_useBean2743); 

            }

            // JSP.g:820:22: ( attribute[tag] | comment[tag] | WS )*
            loop38:
            do {
                int alt38=4;
                switch ( input.LA(1) ) {
                case ID:
                    {
                    alt38=1;
                    }
                    break;
                case JSP_COMMENT:
                case LINE_COMMENT:
                    {
                    alt38=2;
                    }
                    break;
                case WS:
                    {
                    alt38=3;
                    }
                    break;

                }

                switch (alt38) {
            	case 1 :
            	    // JSP.g:820:23: attribute[tag]
            	    {
            	    pushFollow(FOLLOW_attribute_in_jsp_useBean2747);
            	    attribute(tag);

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // JSP.g:820:38: comment[tag]
            	    {
            	    pushFollow(FOLLOW_comment_in_jsp_useBean2750);
            	    comment(tag);

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // JSP.g:820:51: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_jsp_useBean2753); 

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            match(input,JSPCLOSEACT,FOLLOW_JSPCLOSEACT_in_jsp_useBean2757); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return tag;
    }
    // $ANTLR end "jsp_useBean"


    // $ANTLR start "jsp_param"
    // JSP.g:824:10: fragment jsp_param[Element parent] returns [JSPStdAction tag] : ( '<jsp:param' ( attribute[tag] | comment[tag] | WS )* '/>' | '<jsp:params>' ( jsp_param[tag] | comment[tag] | WS )* '</jsp:params>' );
    public final JSPStdAction jsp_param(Element parent) throws RecognitionException {
        JSPStdAction tag = null;

        try {
            // JSP.g:825:3: ( '<jsp:param' ( attribute[tag] | comment[tag] | WS )* '/>' | '<jsp:params>' ( jsp_param[tag] | comment[tag] | WS )* '</jsp:params>' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==JSPOPENPARA) ) {
                alt41=1;
            }
            else if ( (LA41_0==JSPOPENPARAS) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // JSP.g:826:5: '<jsp:param' ( attribute[tag] | comment[tag] | WS )* '/>'
                    {

                          tag = createJSPStdAction(parent,"jsp:param");//$NON-NLS-1$
                        
                    match(input,JSPOPENPARA,FOLLOW_JSPOPENPARA_in_jsp_param2797); 
                    // JSP.g:829:18: ( attribute[tag] | comment[tag] | WS )*
                    loop39:
                    do {
                        int alt39=4;
                        switch ( input.LA(1) ) {
                        case ID:
                            {
                            alt39=1;
                            }
                            break;
                        case JSP_COMMENT:
                        case LINE_COMMENT:
                            {
                            alt39=2;
                            }
                            break;
                        case WS:
                            {
                            alt39=3;
                            }
                            break;

                        }

                        switch (alt39) {
                    	case 1 :
                    	    // JSP.g:829:19: attribute[tag]
                    	    {
                    	    pushFollow(FOLLOW_attribute_in_jsp_param2800);
                    	    attribute(tag);

                    	    state._fsp--;


                    	    }
                    	    break;
                    	case 2 :
                    	    // JSP.g:829:34: comment[tag]
                    	    {
                    	    pushFollow(FOLLOW_comment_in_jsp_param2803);
                    	    comment(tag);

                    	    state._fsp--;


                    	    }
                    	    break;
                    	case 3 :
                    	    // JSP.g:829:47: WS
                    	    {
                    	    match(input,WS,FOLLOW_WS_in_jsp_param2806); 

                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    match(input,JSPCLOSEACT,FOLLOW_JSPCLOSEACT_in_jsp_param2810); 

                    }
                    break;
                case 2 :
                    // JSP.g:831:5: '<jsp:params>' ( jsp_param[tag] | comment[tag] | WS )* '</jsp:params>'
                    {

                         tag = createJSPStdAction(parent,"jsp:params");//$NON-NLS-1$
                        
                    match(input,JSPOPENPARAS,FOLLOW_JSPOPENPARAS_in_jsp_param2838); 
                    // JSP.g:834:20: ( jsp_param[tag] | comment[tag] | WS )*
                    loop40:
                    do {
                        int alt40=4;
                        switch ( input.LA(1) ) {
                        case JSPOPENPARA:
                        case JSPOPENPARAS:
                            {
                            alt40=1;
                            }
                            break;
                        case JSP_COMMENT:
                        case LINE_COMMENT:
                            {
                            alt40=2;
                            }
                            break;
                        case WS:
                            {
                            alt40=3;
                            }
                            break;

                        }

                        switch (alt40) {
                    	case 1 :
                    	    // JSP.g:834:21: jsp_param[tag]
                    	    {
                    	    pushFollow(FOLLOW_jsp_param_in_jsp_param2841);
                    	    jsp_param(tag);

                    	    state._fsp--;


                    	    }
                    	    break;
                    	case 2 :
                    	    // JSP.g:834:36: comment[tag]
                    	    {
                    	    pushFollow(FOLLOW_comment_in_jsp_param2844);
                    	    comment(tag);

                    	    state._fsp--;


                    	    }
                    	    break;
                    	case 3 :
                    	    // JSP.g:834:49: WS
                    	    {
                    	    match(input,WS,FOLLOW_WS_in_jsp_param2847); 

                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    match(input,JSPCLOSEPARAS,FOLLOW_JSPCLOSEPARAS_in_jsp_param2851); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return tag;
    }
    // $ANTLR end "jsp_param"


    // $ANTLR start "jsp_dobody"
    // JSP.g:842:10: fragment jsp_dobody[Element parent] returns [JSPStdAction tag] : '<jsp:doBody' ( attribute[tag] | comment[tag] | WS )* '/>' ;
    public final JSPStdAction jsp_dobody(Element parent) throws RecognitionException {
        JSPStdAction tag = null;

        try {
            // JSP.g:843:3: ( '<jsp:doBody' ( attribute[tag] | comment[tag] | WS )* '/>' )
            // JSP.g:844:5: '<jsp:doBody' ( attribute[tag] | comment[tag] | WS )* '/>'
            {

                  tag = createJSPStdAction(parent,"jsp:doBody");//$NON-NLS-1$
                
            match(input,JSPOPENDOBODY,FOLLOW_JSPOPENDOBODY_in_jsp_dobody2885); 
            // JSP.g:847:19: ( attribute[tag] | comment[tag] | WS )*
            loop42:
            do {
                int alt42=4;
                switch ( input.LA(1) ) {
                case ID:
                    {
                    alt42=1;
                    }
                    break;
                case JSP_COMMENT:
                case LINE_COMMENT:
                    {
                    alt42=2;
                    }
                    break;
                case WS:
                    {
                    alt42=3;
                    }
                    break;

                }

                switch (alt42) {
            	case 1 :
            	    // JSP.g:847:20: attribute[tag]
            	    {
            	    pushFollow(FOLLOW_attribute_in_jsp_dobody2888);
            	    attribute(tag);

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // JSP.g:847:35: comment[tag]
            	    {
            	    pushFollow(FOLLOW_comment_in_jsp_dobody2891);
            	    comment(tag);

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // JSP.g:847:48: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_jsp_dobody2894); 

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            match(input,JSPCLOSEACT,FOLLOW_JSPCLOSEACT_in_jsp_dobody2899); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return tag;
    }
    // $ANTLR end "jsp_dobody"


    // $ANTLR start "jsp_output"
    // JSP.g:859:10: fragment jsp_output[Element parent] returns [JSPStdAction tag] : '<jsp:output' ( attribute[tag] | comment[tag] | WS )* '/>' ;
    public final JSPStdAction jsp_output(Element parent) throws RecognitionException {
        JSPStdAction tag = null;

        try {
            // JSP.g:860:3: ( '<jsp:output' ( attribute[tag] | comment[tag] | WS )* '/>' )
            // JSP.g:861:7: '<jsp:output' ( attribute[tag] | comment[tag] | WS )* '/>'
            {

                    tag = createJSPStdAction(parent,"jsp:output");//$NON-NLS-1$
                  
            match(input,JSPOPENOUTPUT,FOLLOW_JSPOPENOUTPUT_in_jsp_output2938); 
            // JSP.g:864:21: ( attribute[tag] | comment[tag] | WS )*
            loop43:
            do {
                int alt43=4;
                switch ( input.LA(1) ) {
                case ID:
                    {
                    alt43=1;
                    }
                    break;
                case JSP_COMMENT:
                case LINE_COMMENT:
                    {
                    alt43=2;
                    }
                    break;
                case WS:
                    {
                    alt43=3;
                    }
                    break;

                }

                switch (alt43) {
            	case 1 :
            	    // JSP.g:864:22: attribute[tag]
            	    {
            	    pushFollow(FOLLOW_attribute_in_jsp_output2941);
            	    attribute(tag);

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // JSP.g:864:37: comment[tag]
            	    {
            	    pushFollow(FOLLOW_comment_in_jsp_output2944);
            	    comment(tag);

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // JSP.g:864:50: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_jsp_output2947); 

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            match(input,JSPCLOSEACT,FOLLOW_JSPCLOSEACT_in_jsp_output2951); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return tag;
    }
    // $ANTLR end "jsp_output"


    // $ANTLR start "jsp_invoke"
    // JSP.g:874:10: fragment jsp_invoke[Element parent] returns [JSPStdAction tag] : '<jsp:invoke' ( attribute[tag] | comment[tag] | WS )* '/>' ;
    public final JSPStdAction jsp_invoke(Element parent) throws RecognitionException {
        JSPStdAction tag = null;

        try {
            // JSP.g:875:3: ( '<jsp:invoke' ( attribute[tag] | comment[tag] | WS )* '/>' )
            // JSP.g:876:5: '<jsp:invoke' ( attribute[tag] | comment[tag] | WS )* '/>'
            {

                  tag = createJSPStdAction(parent,"jsp:invoke");//$NON-NLS-1$
                
            match(input,JSPOPENINVOKE,FOLLOW_JSPOPENINVOKE_in_jsp_invoke2990); 
            // JSP.g:879:19: ( attribute[tag] | comment[tag] | WS )*
            loop44:
            do {
                int alt44=4;
                switch ( input.LA(1) ) {
                case ID:
                    {
                    alt44=1;
                    }
                    break;
                case JSP_COMMENT:
                case LINE_COMMENT:
                    {
                    alt44=2;
                    }
                    break;
                case WS:
                    {
                    alt44=3;
                    }
                    break;

                }

                switch (alt44) {
            	case 1 :
            	    // JSP.g:879:20: attribute[tag]
            	    {
            	    pushFollow(FOLLOW_attribute_in_jsp_invoke2993);
            	    attribute(tag);

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // JSP.g:879:35: comment[tag]
            	    {
            	    pushFollow(FOLLOW_comment_in_jsp_invoke2996);
            	    comment(tag);

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // JSP.g:879:48: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_jsp_invoke2999); 

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            match(input,JSPCLOSEACT,FOLLOW_JSPCLOSEACT_in_jsp_invoke3003); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return tag;
    }
    // $ANTLR end "jsp_invoke"


    // $ANTLR start "jsp_body"
    // JSP.g:887:10: fragment jsp_body[Element parent] returns [JSPStdAction tag] : '<jsp:body>' ( text[tag] | jsp_element[tag] )* '</jsp:body>' ;
    public final JSPStdAction jsp_body(Element parent) throws RecognitionException {
        JSPStdAction tag = null;

        try {
            // JSP.g:888:3: ( '<jsp:body>' ( text[tag] | jsp_element[tag] )* '</jsp:body>' )
            // JSP.g:889:5: '<jsp:body>' ( text[tag] | jsp_element[tag] )* '</jsp:body>'
            {

                   tag = createJSPStdAction(parent,"jsp:body");//$NON-NLS-1$
                
            match(input,JSPOPENBODY,FOLLOW_JSPOPENBODY_in_jsp_body3038); 
            // JSP.g:892:18: ( text[tag] | jsp_element[tag] )*
            loop45:
            do {
                int alt45=3;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=WS && LA45_0<=ID)||(LA45_0>=Digit && LA45_0<=EQUAL)) ) {
                    alt45=1;
                }
                else if ( (LA45_0==JSPTAGOPEN||(LA45_0>=JSPOPENEXPR && LA45_0<=JSPOPENDIR)||(LA45_0>=JSPUSEBEAN && LA45_0<=JSPOPENINC)||LA45_0==JSPOPENFWD||LA45_0==JSPOPENPLUG||LA45_0==JSPOPENROOT||LA45_0==JSPOPENTEXT||(LA45_0>=JSPOPENATTR && LA45_0<=JSPOPENBODY)||(LA45_0>=JSPOPENINVOKE && LA45_0<=OPENSCRIPLET)||LA45_0==OPENEXPR||LA45_0==OPENDECL||LA45_0==OPENDIRECT||LA45_0==67) ) {
                    alt45=2;
                }


                switch (alt45) {
            	case 1 :
            	    // JSP.g:892:19: text[tag]
            	    {
            	    pushFollow(FOLLOW_text_in_jsp_body3041);
            	    text(tag);

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // JSP.g:892:29: jsp_element[tag]
            	    {
            	    pushFollow(FOLLOW_jsp_element_in_jsp_body3044);
            	    jsp_element(tag);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            match(input,JSPCLOSEBODY,FOLLOW_JSPCLOSEBODY_in_jsp_body3049); 

                  tag.setName("jsp:body");
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return tag;
    }
    // $ANTLR end "jsp_body"


    // $ANTLR start "jsp_attribute"
    // JSP.g:899:10: fragment jsp_attribute[Element parent] returns [JSPStdAction tag] : ( '<jsp:attribute' ( attribute[tag] | comment[tag] | WS )* ( '/>' | '>' ( jsp_element[tag] | comment[tag] | WS )* '</jsp:attribute>' ) ) ;
    public final JSPStdAction jsp_attribute(Element parent) throws RecognitionException {
        JSPStdAction tag = null;

        try {
            // JSP.g:900:3: ( ( '<jsp:attribute' ( attribute[tag] | comment[tag] | WS )* ( '/>' | '>' ( jsp_element[tag] | comment[tag] | WS )* '</jsp:attribute>' ) ) )
            // JSP.g:901:5: ( '<jsp:attribute' ( attribute[tag] | comment[tag] | WS )* ( '/>' | '>' ( jsp_element[tag] | comment[tag] | WS )* '</jsp:attribute>' ) )
            {

                  tag = createJSPStdAction(parent,"jsp:attribute");//$NON-NLS-1$       
                
            // JSP.g:904:5: ( '<jsp:attribute' ( attribute[tag] | comment[tag] | WS )* ( '/>' | '>' ( jsp_element[tag] | comment[tag] | WS )* '</jsp:attribute>' ) )
            // JSP.g:905:9: '<jsp:attribute' ( attribute[tag] | comment[tag] | WS )* ( '/>' | '>' ( jsp_element[tag] | comment[tag] | WS )* '</jsp:attribute>' )
            {
            match(input,JSPOPENATTR,FOLLOW_JSPOPENATTR_in_jsp_attribute3096); 
            // JSP.g:905:26: ( attribute[tag] | comment[tag] | WS )*
            loop46:
            do {
                int alt46=4;
                switch ( input.LA(1) ) {
                case ID:
                    {
                    alt46=1;
                    }
                    break;
                case JSP_COMMENT:
                case LINE_COMMENT:
                    {
                    alt46=2;
                    }
                    break;
                case WS:
                    {
                    alt46=3;
                    }
                    break;

                }

                switch (alt46) {
            	case 1 :
            	    // JSP.g:905:27: attribute[tag]
            	    {
            	    pushFollow(FOLLOW_attribute_in_jsp_attribute3099);
            	    attribute(tag);

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // JSP.g:905:42: comment[tag]
            	    {
            	    pushFollow(FOLLOW_comment_in_jsp_attribute3102);
            	    comment(tag);

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // JSP.g:905:55: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_jsp_attribute3105); 

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            // JSP.g:906:9: ( '/>' | '>' ( jsp_element[tag] | comment[tag] | WS )* '</jsp:attribute>' )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==JSPCLOSEACT) ) {
                alt48=1;
            }
            else if ( (LA48_0==66) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // JSP.g:907:12: '/>'
                    {
                    match(input,JSPCLOSEACT,FOLLOW_JSPCLOSEACT_in_jsp_attribute3131); 

                    }
                    break;
                case 2 :
                    // JSP.g:910:13: '>' ( jsp_element[tag] | comment[tag] | WS )* '</jsp:attribute>'
                    {
                    match(input,66,FOLLOW_66_in_jsp_attribute3175); 
                    // JSP.g:911:18: ( jsp_element[tag] | comment[tag] | WS )*
                    loop47:
                    do {
                        int alt47=4;
                        switch ( input.LA(1) ) {
                        case JSPTAGOPEN:
                        case JSPOPENEXPR:
                        case JSPOPENDECL:
                        case JSPOPENDIR:
                        case JSPUSEBEAN:
                        case JSPSET:
                        case JSPGET:
                        case JSPOPENINC:
                        case JSPOPENFWD:
                        case JSPOPENPLUG:
                        case JSPOPENROOT:
                        case JSPOPENTEXT:
                        case JSPOPENATTR:
                        case JSPOPENBODY:
                        case JSPOPENINVOKE:
                        case JSPOPENDOBODY:
                        case JSPOPENOUTPUT:
                        case JSPELEMENTOP:
                        case OPENSCRIPLET:
                        case OPENEXPR:
                        case OPENDECL:
                        case OPENDIRECT:
                        case 67:
                            {
                            alt47=1;
                            }
                            break;
                        case JSP_COMMENT:
                        case LINE_COMMENT:
                            {
                            alt47=2;
                            }
                            break;
                        case WS:
                            {
                            alt47=3;
                            }
                            break;

                        }

                        switch (alt47) {
                    	case 1 :
                    	    // JSP.g:911:19: jsp_element[tag]
                    	    {
                    	    pushFollow(FOLLOW_jsp_element_in_jsp_attribute3195);
                    	    jsp_element(tag);

                    	    state._fsp--;


                    	    }
                    	    break;
                    	case 2 :
                    	    // JSP.g:911:36: comment[tag]
                    	    {
                    	    pushFollow(FOLLOW_comment_in_jsp_attribute3198);
                    	    comment(tag);

                    	    state._fsp--;


                    	    }
                    	    break;
                    	case 3 :
                    	    // JSP.g:911:49: WS
                    	    {
                    	    match(input,WS,FOLLOW_WS_in_jsp_attribute3201); 

                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    match(input,JSPCLOSEATTR,FOLLOW_JSPCLOSEATTR_in_jsp_attribute3217); 

                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return tag;
    }
    // $ANTLR end "jsp_attribute"


    // $ANTLR start "jsp_text"
    // JSP.g:923:10: fragment jsp_text[Element parent] returns [JSPStdAction tag] : '<jsp:text>' '</jsp:text>' ;
    public final JSPStdAction jsp_text(Element parent) throws RecognitionException {
        JSPStdAction tag = null;

        try {
            // JSP.g:924:3: ( '<jsp:text>' '</jsp:text>' )
            // JSP.g:925:5: '<jsp:text>' '</jsp:text>'
            {

                 tag = createJSPStdAction(parent,"jsp:text");//$NON-NLS-1$   
                
            match(input,JSPOPENTEXT,FOLLOW_JSPOPENTEXT_in_jsp_text3269); 
            getTagContent(JSPCLOSETEXT,tag);
            match(input,JSPCLOSETEXT,FOLLOW_JSPCLOSETEXT_in_jsp_text3273); 

                  tag.setName("jsp:text"); //$NON-NLS-1$   
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return tag;
    }
    // $ANTLR end "jsp_text"


    // $ANTLR start "comment"
    // JSP.g:939:10: fragment comment[Element parent] : ( jsp_comment[parent] | line_comment[parent] );
    public final void comment(Element parent) throws RecognitionException {
        try {
            // JSP.g:940:3: ( jsp_comment[parent] | line_comment[parent] )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==JSP_COMMENT) ) {
                alt49=1;
            }
            else if ( (LA49_0==LINE_COMMENT) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // JSP.g:941:5: jsp_comment[parent]
                    {
                    pushFollow(FOLLOW_jsp_comment_in_comment3306);
                    jsp_comment(parent);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // JSP.g:941:25: line_comment[parent]
                    {
                    pushFollow(FOLLOW_line_comment_in_comment3309);
                    line_comment(parent);

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "comment"


    // $ANTLR start "jsp_comment"
    // JSP.g:944:10: fragment jsp_comment[Element parent] returns [JSPComment tag] : t= JSP_COMMENT ;
    public final JSPComment jsp_comment(Element parent) throws RecognitionException {
        JSPComment tag = null;

        Token t=null;

        try {
            // JSP.g:945:3: (t= JSP_COMMENT )
            // JSP.g:946:5: t= JSP_COMMENT
            {
            t=(Token)match(input,JSP_COMMENT,FOLLOW_JSP_COMMENT_in_jsp_comment3335); 
             
                  tag = this.factory.createJSPComment();
                  setParent(parent, tag);                      
                  tag.setName(t.getText());                                  
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return tag;
    }
    // $ANTLR end "jsp_comment"


    // $ANTLR start "line_comment"
    // JSP.g:954:10: fragment line_comment[Element parent] returns [Comment tag] : t= LINE_COMMENT ;
    public final Comment line_comment(Element parent) throws RecognitionException {
        Comment tag = null;

        Token t=null;

        try {
            // JSP.g:955:3: (t= LINE_COMMENT )
            // JSP.g:956:4: t= LINE_COMMENT
            {
            t=(Token)match(input,LINE_COMMENT,FOLLOW_LINE_COMMENT_in_line_comment3368); 

                 tag = xmlFactory.createComment();
                 setParent(parent, tag);  
                 tag.setName(t.getText());        
               

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return tag;
    }
    // $ANTLR end "line_comment"


    // $ANTLR start "text"
    // JSP.g:965:10: fragment text[Element parent] returns [Text text] : (id= ID | dig= Digit | speChar= SpecialCharacter | DQUOTE | SQUOTE | DDOT | EQUAL | ws= WS ) ;
    public final Text text(Element parent) throws RecognitionException {
        Text text = null;

        Token id=null;
        Token dig=null;
        Token speChar=null;
        Token ws=null;

        try {
            // JSP.g:966:3: ( (id= ID | dig= Digit | speChar= SpecialCharacter | DQUOTE | SQUOTE | DDOT | EQUAL | ws= WS ) )
            // JSP.g:967:3: (id= ID | dig= Digit | speChar= SpecialCharacter | DQUOTE | SQUOTE | DDOT | EQUAL | ws= WS )
            {

              String content = "";
              
            // JSP.g:970:3: (id= ID | dig= Digit | speChar= SpecialCharacter | DQUOTE | SQUOTE | DDOT | EQUAL | ws= WS )
            int alt50=8;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt50=1;
                }
                break;
            case Digit:
                {
                alt50=2;
                }
                break;
            case SpecialCharacter:
                {
                alt50=3;
                }
                break;
            case DQUOTE:
                {
                alt50=4;
                }
                break;
            case SQUOTE:
                {
                alt50=5;
                }
                break;
            case DDOT:
                {
                alt50=6;
                }
                break;
            case EQUAL:
                {
                alt50=7;
                }
                break;
            case WS:
                {
                alt50=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // JSP.g:970:6: id= ID
                    {
                    id=(Token)match(input,ID,FOLLOW_ID_in_text3412); 
                    content+= id.getText();

                    }
                    break;
                case 2 :
                    // JSP.g:971:6: dig= Digit
                    {
                    dig=(Token)match(input,Digit,FOLLOW_Digit_in_text3423); 
                    content+= dig.getText();

                    }
                    break;
                case 3 :
                    // JSP.g:972:6: speChar= SpecialCharacter
                    {
                    speChar=(Token)match(input,SpecialCharacter,FOLLOW_SpecialCharacter_in_text3434); 
                     content+= speChar.getText();

                    }
                    break;
                case 4 :
                    // JSP.g:973:6: DQUOTE
                    {
                    match(input,DQUOTE,FOLLOW_DQUOTE_in_text3443); 
                     content+= "\"";

                    }
                    break;
                case 5 :
                    // JSP.g:974:6: SQUOTE
                    {
                    match(input,SQUOTE,FOLLOW_SQUOTE_in_text3452); 
                     content+= "\'";

                    }
                    break;
                case 6 :
                    // JSP.g:975:6: DDOT
                    {
                    match(input,DDOT,FOLLOW_DDOT_in_text3461); 
                     content+= ":";

                    }
                    break;
                case 7 :
                    // JSP.g:976:6: EQUAL
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_text3472); 
                     content+= "=";

                    }
                    break;
                case 8 :
                    // JSP.g:977:6: ws= WS
                    {
                    ws=(Token)match(input,WS,FOLLOW_WS_in_text3484); 
                    if(!content.equalsIgnoreCase("")){ content+=ws.getText();} 

                    }
                    break;

            }

                
              
                loop21:
                    do {    
                       if(input.mark()== input.size())
                           {
                             break loop21;
                           }
                           
                         switch ( input.LA(1) ) {
                            //The first case is the token number for character '<'
                            case 67:  
                            case EOF:                   
                            case XMLDECL:                   
                            case DOCTYPE:                    
                            case JSPTAGOPEN:                   
                            case OPENSCRIPLET:                   
                            case JSPOPENEXPR:                    
                            case OPENEXPR:                    
                            case JSPOPENDECL:                    
                            case OPENDECL:                    
                            case JSPOPENINC:                   
                            case JSPOPENPLUG:                    
                            case JSPGET:                    
                            case JSPSET:                    
                            case JSPUSEBEAN:                   
                            case JSPOPENFWD:                   
                            case JSPOPENDOBODY:                   
                            case JSPOPENOUTPUT:                   
                            case JSPOPENINVOKE:                   
                            case JSPOPENBODY:                   
                            case JSPOPENATTR:                   
                            case JSPOPENTEXT:                   
                            case JSPOPENROOT:                   
                            case JSPELEMENTOP:                    
                            case JSPOPENDIR:                   
                            case OPENDIRECT:                                                   
                            case OPENCLOSE:                   
                            case JSP_COMMENT:                   
                            case LINE_COMMENT: 
                            case JSPCLOSEBODY:  
                            case CDATA:              
                            {
                               break loop21;
                            }
                        }                  
                                     
                      content+= space+input.get(input.mark()).getText();  //$NON-NLS-1$                        
                      matchAny(input); 
                                                                             
                 } while (true);
                 
                 //We need to remove the \n character which appears at the beginning of
                 //each new line
                 while(content.startsWith("\n")){
                            content = content.substring(1);
                       }
                 if(!content.equalsIgnoreCase("") && !content.equalsIgnoreCase("\n")){
                     Text textElmt = xmlFactory.createText();            
                     textElmt.setName(content);      
                     setParent(parent, textElmt);            
                 }   
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return text;
    }
    // $ANTLR end "text"


    // $ANTLR start "attribute"
    // JSP.g:1049:10: fragment attribute[Element parent] : name= ID ( ( WS )? ':' ( WS )? name2= ID )? ( ( WS )? '=' ( WS )? ( ( ( '\"' ( tag[compAttr] | jsp_element[compAttr] | t= SpecialCharacter | SQUOTE | EQUAL | DDOT | ';' | ws= WS | digit1= Digit | id1= ID )* ( '>' )? ( '<' )? ( '\"' )+ ) ) ( ';' )? | ( '\\'' ( tag[compAttr] | jsp_element[compAttr] | digit2= Digit | id1= ID | t= SpecialCharacter | EQUAL | DDOT | ';' | DQUOTE | ws= WS )* ( '>' )? ( '<' )? '\\'' ) | (id1= ID | digit2= Digit | jsp_element[compAttr] | tag[compAttr] ) ) )? ;
    public final void attribute(Element parent) throws RecognitionException {
        Token name=null;
        Token name2=null;
        Token t=null;
        Token ws=null;
        Token digit1=null;
        Token id1=null;
        Token digit2=null;

        try {
            // JSP.g:1050:3: (name= ID ( ( WS )? ':' ( WS )? name2= ID )? ( ( WS )? '=' ( WS )? ( ( ( '\"' ( tag[compAttr] | jsp_element[compAttr] | t= SpecialCharacter | SQUOTE | EQUAL | DDOT | ';' | ws= WS | digit1= Digit | id1= ID )* ( '>' )? ( '<' )? ( '\"' )+ ) ) ( ';' )? | ( '\\'' ( tag[compAttr] | jsp_element[compAttr] | digit2= Digit | id1= ID | t= SpecialCharacter | EQUAL | DDOT | ';' | DQUOTE | ws= WS )* ( '>' )? ( '<' )? '\\'' ) | (id1= ID | digit2= Digit | jsp_element[compAttr] | tag[compAttr] ) ) )? )
            // JSP.g:1051:5: name= ID ( ( WS )? ':' ( WS )? name2= ID )? ( ( WS )? '=' ( WS )? ( ( ( '\"' ( tag[compAttr] | jsp_element[compAttr] | t= SpecialCharacter | SQUOTE | EQUAL | DDOT | ';' | ws= WS | digit1= Digit | id1= ID )* ( '>' )? ( '<' )? ( '\"' )+ ) ) ( ';' )? | ( '\\'' ( tag[compAttr] | jsp_element[compAttr] | digit2= Digit | id1= ID | t= SpecialCharacter | EQUAL | DDOT | ';' | DQUOTE | ws= WS )* ( '>' )? ( '<' )? '\\'' ) | (id1= ID | digit2= Digit | jsp_element[compAttr] | tag[compAttr] ) ) )?
            {

                  String value="";   
                   Attribute xmlAttr = this.xmlFactory.createAttribute();
                   ComposedAttribute compAttr = null;   
                
            name=(Token)match(input,ID,FOLLOW_ID_in_attribute3644); 
            // JSP.g:1069:13: ( ( WS )? ':' ( WS )? name2= ID )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==WS) ) {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==DDOT) ) {
                    alt53=1;
                }
            }
            else if ( (LA53_0==DDOT) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // JSP.g:1069:14: ( WS )? ':' ( WS )? name2= ID
                    {
                    // JSP.g:1069:14: ( WS )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==WS) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // JSP.g:1069:14: WS
                            {
                            match(input,WS,FOLLOW_WS_in_attribute3647); 

                            }
                            break;

                    }

                    match(input,DDOT,FOLLOW_DDOT_in_attribute3650); 
                    // JSP.g:1069:22: ( WS )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==WS) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // JSP.g:1069:22: WS
                            {
                            match(input,WS,FOLLOW_WS_in_attribute3652); 

                            }
                            break;

                    }

                    name2=(Token)match(input,ID,FOLLOW_ID_in_attribute3657); 

                    }
                    break;

            }


                  String attributeName = name.getText();
                  if(name2!=null){
                    attributeName+=":"+name2.getText();     
                  }
                   xmlAttr.setName(attributeName);        
                
            // JSP.g:1080:6: ( ( WS )? '=' ( WS )? ( ( ( '\"' ( tag[compAttr] | jsp_element[compAttr] | t= SpecialCharacter | SQUOTE | EQUAL | DDOT | ';' | ws= WS | digit1= Digit | id1= ID )* ( '>' )? ( '<' )? ( '\"' )+ ) ) ( ';' )? | ( '\\'' ( tag[compAttr] | jsp_element[compAttr] | digit2= Digit | id1= ID | t= SpecialCharacter | EQUAL | DDOT | ';' | DQUOTE | ws= WS )* ( '>' )? ( '<' )? '\\'' ) | (id1= ID | digit2= Digit | jsp_element[compAttr] | tag[compAttr] ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==WS) ) {
                int LA66_1 = input.LA(2);

                if ( (LA66_1==EQUAL) ) {
                    alt66=1;
                }
            }
            else if ( (LA66_0==EQUAL) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // JSP.g:1080:7: ( WS )? '=' ( WS )? ( ( ( '\"' ( tag[compAttr] | jsp_element[compAttr] | t= SpecialCharacter | SQUOTE | EQUAL | DDOT | ';' | ws= WS | digit1= Digit | id1= ID )* ( '>' )? ( '<' )? ( '\"' )+ ) ) ( ';' )? | ( '\\'' ( tag[compAttr] | jsp_element[compAttr] | digit2= Digit | id1= ID | t= SpecialCharacter | EQUAL | DDOT | ';' | DQUOTE | ws= WS )* ( '>' )? ( '<' )? '\\'' ) | (id1= ID | digit2= Digit | jsp_element[compAttr] | tag[compAttr] ) )
                    {
                    // JSP.g:1080:7: ( WS )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==WS) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // JSP.g:1080:7: WS
                            {
                            match(input,WS,FOLLOW_WS_in_attribute3693); 

                            }
                            break;

                    }

                    match(input,EQUAL,FOLLOW_EQUAL_in_attribute3695); 
                    // JSP.g:1080:13: ( WS )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==WS) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // JSP.g:1080:13: WS
                            {
                            match(input,WS,FOLLOW_WS_in_attribute3696); 

                            }
                            break;

                    }

                    // JSP.g:1081:8: ( ( ( '\"' ( tag[compAttr] | jsp_element[compAttr] | t= SpecialCharacter | SQUOTE | EQUAL | DDOT | ';' | ws= WS | digit1= Digit | id1= ID )* ( '>' )? ( '<' )? ( '\"' )+ ) ) ( ';' )? | ( '\\'' ( tag[compAttr] | jsp_element[compAttr] | digit2= Digit | id1= ID | t= SpecialCharacter | EQUAL | DDOT | ';' | DQUOTE | ws= WS )* ( '>' )? ( '<' )? '\\'' ) | (id1= ID | digit2= Digit | jsp_element[compAttr] | tag[compAttr] ) )
                    int alt65=3;
                    switch ( input.LA(1) ) {
                    case DQUOTE:
                        {
                        alt65=1;
                        }
                        break;
                    case SQUOTE:
                        {
                        alt65=2;
                        }
                        break;
                    case ID:
                    case Digit:
                    case JSPTAGOPEN:
                    case JSPOPENEXPR:
                    case JSPOPENDECL:
                    case JSPOPENDIR:
                    case JSPUSEBEAN:
                    case JSPSET:
                    case JSPGET:
                    case JSPOPENINC:
                    case JSPOPENFWD:
                    case JSPOPENPLUG:
                    case JSPOPENROOT:
                    case JSPOPENTEXT:
                    case JSPOPENATTR:
                    case JSPOPENBODY:
                    case JSPOPENINVOKE:
                    case JSPOPENDOBODY:
                    case JSPOPENOUTPUT:
                    case JSPELEMENTOP:
                    case OPENSCRIPLET:
                    case OPENEXPR:
                    case OPENDECL:
                    case OPENDIRECT:
                    case 67:
                        {
                        alt65=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 65, 0, input);

                        throw nvae;
                    }

                    switch (alt65) {
                        case 1 :
                            // JSP.g:1082:9: ( ( '\"' ( tag[compAttr] | jsp_element[compAttr] | t= SpecialCharacter | SQUOTE | EQUAL | DDOT | ';' | ws= WS | digit1= Digit | id1= ID )* ( '>' )? ( '<' )? ( '\"' )+ ) ) ( ';' )?
                            {
                            // JSP.g:1082:9: ( ( '\"' ( tag[compAttr] | jsp_element[compAttr] | t= SpecialCharacter | SQUOTE | EQUAL | DDOT | ';' | ws= WS | digit1= Digit | id1= ID )* ( '>' )? ( '<' )? ( '\"' )+ ) )
                            // JSP.g:1083:11: ( '\"' ( tag[compAttr] | jsp_element[compAttr] | t= SpecialCharacter | SQUOTE | EQUAL | DDOT | ';' | ws= WS | digit1= Digit | id1= ID )* ( '>' )? ( '<' )? ( '\"' )+ )
                            {
                            // JSP.g:1083:11: ( '\"' ( tag[compAttr] | jsp_element[compAttr] | t= SpecialCharacter | SQUOTE | EQUAL | DDOT | ';' | ws= WS | digit1= Digit | id1= ID )* ( '>' )? ( '<' )? ( '\"' )+ )
                            // JSP.g:1083:12: '\"' ( tag[compAttr] | jsp_element[compAttr] | t= SpecialCharacter | SQUOTE | EQUAL | DDOT | ';' | ws= WS | digit1= Digit | id1= ID )* ( '>' )? ( '<' )? ( '\"' )+
                            {
                            match(input,DQUOTE,FOLLOW_DQUOTE_in_attribute3730); 
                            // JSP.g:1084:12: ( tag[compAttr] | jsp_element[compAttr] | t= SpecialCharacter | SQUOTE | EQUAL | DDOT | ';' | ws= WS | digit1= Digit | id1= ID )*
                            loop56:
                            do {
                                int alt56=11;
                                alt56 = dfa56.predict(input);
                                switch (alt56) {
                            	case 1 :
                            	    // JSP.g:1085:16: tag[compAttr]
                            	    {

                            	    	               xmlAttr=null;
                            	    	               if(compAttr==null){compAttr = this.factory.createComposedAttribute(); }
                            	    	               createAttributeText(compAttr,value);value="";
                            	                   
                            	    pushFollow(FOLLOW_tag_in_attribute3777);
                            	    tag(compAttr);

                            	    state._fsp--;


                            	    }
                            	    break;
                            	case 2 :
                            	    // JSP.g:1092:15: jsp_element[compAttr]
                            	    {

                            	                    xmlAttr=null;  
                            	                    if(compAttr==null){compAttr = this.factory.createComposedAttribute(); }   
                            	                    createAttributeText(compAttr,value);value="";
                            	                  
                            	    pushFollow(FOLLOW_jsp_element_in_attribute3828);
                            	    jsp_element(compAttr);

                            	    state._fsp--;


                            	    }
                            	    break;
                            	case 3 :
                            	    // JSP.g:1099:16: t= SpecialCharacter
                            	    {
                            	    t=(Token)match(input,SpecialCharacter,FOLLOW_SpecialCharacter_in_attribute3863); 
                            	    value+=t.getText();

                            	    }
                            	    break;
                            	case 4 :
                            	    // JSP.g:1100:16: SQUOTE
                            	    {
                            	    match(input,SQUOTE,FOLLOW_SQUOTE_in_attribute3885); 
                            	    value+="'";

                            	    }
                            	    break;
                            	case 5 :
                            	    // JSP.g:1101:16: EQUAL
                            	    {
                            	    match(input,EQUAL,FOLLOW_EQUAL_in_attribute3905); 
                            	    value+="=";

                            	    }
                            	    break;
                            	case 6 :
                            	    // JSP.g:1102:16: DDOT
                            	    {
                            	    match(input,DDOT,FOLLOW_DDOT_in_attribute3926); 
                            	    value+=":";

                            	    }
                            	    break;
                            	case 7 :
                            	    // JSP.g:1103:16: ';'
                            	    {
                            	    match(input,69,FOLLOW_69_in_attribute3947); 
                            	    value+=";";

                            	    }
                            	    break;
                            	case 8 :
                            	    // JSP.g:1104:16: ws= WS
                            	    {
                            	    ws=(Token)match(input,WS,FOLLOW_WS_in_attribute3968); 
                            	    value+=ws.getText();

                            	    }
                            	    break;
                            	case 9 :
                            	    // JSP.g:1105:16: digit1= Digit
                            	    {
                            	    digit1=(Token)match(input,Digit,FOLLOW_Digit_in_attribute3990); 
                            	    value+=space+digit1.getText();

                            	    }
                            	    break;
                            	case 10 :
                            	    // JSP.g:1106:16: id1= ID
                            	    {
                            	    id1=(Token)match(input,ID,FOLLOW_ID_in_attribute4011); 
                            	    value+=space+(id1!=null?id1.getText():null);

                            	    }
                            	    break;

                            	default :
                            	    break loop56;
                                }
                            } while (true);

                            // JSP.g:1108:12: ( '>' )?
                            int alt57=2;
                            int LA57_0 = input.LA(1);

                            if ( (LA57_0==66) ) {
                                alt57=1;
                            }
                            switch (alt57) {
                                case 1 :
                                    // JSP.g:1108:13: '>'
                                    {
                                    match(input,66,FOLLOW_66_in_attribute4042); 
                                    value+=">";

                                    }
                                    break;

                            }

                            // JSP.g:1109:12: ( '<' )?
                            int alt58=2;
                            int LA58_0 = input.LA(1);

                            if ( (LA58_0==67) ) {
                                alt58=1;
                            }
                            switch (alt58) {
                                case 1 :
                                    // JSP.g:1109:13: '<'
                                    {
                                    match(input,67,FOLLOW_67_in_attribute4059); 
                                    value+="<";

                                    }
                                    break;

                            }

                             if(xmlAttr==null){
                                           if(compAttr==null){compAttr = this.factory.createComposedAttribute(); }
                                           createAttributeText(compAttr,value);value="";
                                        }
                                        else{xmlAttr.setValue(value);};
                                      
                            // JSP.g:1118:11: ( '\"' )+
                            int cnt59=0;
                            loop59:
                            do {
                                int alt59=2;
                                int LA59_0 = input.LA(1);

                                if ( (LA59_0==DQUOTE) ) {
                                    alt59=1;
                                }


                                switch (alt59) {
                            	case 1 :
                            	    // JSP.g:1118:12: '\"'
                            	    {
                            	    match(input,DQUOTE,FOLLOW_DQUOTE_in_attribute4126); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt59 >= 1 ) break loop59;
                                        EarlyExitException eee =
                                            new EarlyExitException(59, input);
                                        throw eee;
                                }
                                cnt59++;
                            } while (true);


                            }


                            }

                            // JSP.g:1121:8: ( ';' )?
                            int alt60=2;
                            int LA60_0 = input.LA(1);

                            if ( (LA60_0==69) ) {
                                alt60=1;
                            }
                            switch (alt60) {
                                case 1 :
                                    // JSP.g:1121:9: ';'
                                    {
                                    match(input,69,FOLLOW_69_in_attribute4163); 
                                     if(xmlAttr==null) {
                                                    if(compAttr==null){compAttr = this.factory.createComposedAttribute(); }
                                                    createAttributeText(compAttr,";");value="";
                                                 }
                                                 else{xmlAttr.setValue(xmlAttr.getValue()+";");};
                                            

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // JSP.g:1130:7: ( '\\'' ( tag[compAttr] | jsp_element[compAttr] | digit2= Digit | id1= ID | t= SpecialCharacter | EQUAL | DDOT | ';' | DQUOTE | ws= WS )* ( '>' )? ( '<' )? '\\'' )
                            {
                            // JSP.g:1130:7: ( '\\'' ( tag[compAttr] | jsp_element[compAttr] | digit2= Digit | id1= ID | t= SpecialCharacter | EQUAL | DDOT | ';' | DQUOTE | ws= WS )* ( '>' )? ( '<' )? '\\'' )
                            // JSP.g:1130:8: '\\'' ( tag[compAttr] | jsp_element[compAttr] | digit2= Digit | id1= ID | t= SpecialCharacter | EQUAL | DDOT | ';' | DQUOTE | ws= WS )* ( '>' )? ( '<' )? '\\''
                            {
                            match(input,SQUOTE,FOLLOW_SQUOTE_in_attribute4198); 
                            // JSP.g:1132:10: ( tag[compAttr] | jsp_element[compAttr] | digit2= Digit | id1= ID | t= SpecialCharacter | EQUAL | DDOT | ';' | DQUOTE | ws= WS )*
                            loop61:
                            do {
                                int alt61=11;
                                alt61 = dfa61.predict(input);
                                switch (alt61) {
                            	case 1 :
                            	    // JSP.g:1133:12: tag[compAttr]
                            	    {

                            	                xmlAttr=null;
                            	                if(compAttr==null){compAttr = this.factory.createComposedAttribute(); }
                            	                createAttributeText(compAttr,value);value="";
                            	               
                            	    pushFollow(FOLLOW_tag_in_attribute4241);
                            	    tag(compAttr);

                            	    state._fsp--;


                            	    }
                            	    break;
                            	case 2 :
                            	    // JSP.g:1140:11: jsp_element[compAttr]
                            	    {

                            	                xmlAttr=null;
                            	                if(compAttr==null){compAttr = this.factory.createComposedAttribute(); }
                            	                createAttributeText(compAttr,value);value="";
                            	              
                            	    pushFollow(FOLLOW_jsp_element_in_attribute4293);
                            	    jsp_element(compAttr);

                            	    state._fsp--;


                            	    }
                            	    break;
                            	case 3 :
                            	    // JSP.g:1147:12: digit2= Digit
                            	    {
                            	    digit2=(Token)match(input,Digit,FOLLOW_Digit_in_attribute4322); 
                            	    value+=space+digit2.getText();

                            	    }
                            	    break;
                            	case 4 :
                            	    // JSP.g:1148:12: id1= ID
                            	    {
                            	    id1=(Token)match(input,ID,FOLLOW_ID_in_attribute4340); 
                            	    value+=space+(id1!=null?id1.getText():null);

                            	    }
                            	    break;
                            	case 5 :
                            	    // JSP.g:1149:12: t= SpecialCharacter
                            	    {
                            	    t=(Token)match(input,SpecialCharacter,FOLLOW_SpecialCharacter_in_attribute4364); 
                            	    value+=t.getText();

                            	    }
                            	    break;
                            	case 6 :
                            	    // JSP.g:1150:12: EQUAL
                            	    {
                            	    match(input,EQUAL,FOLLOW_EQUAL_in_attribute4382); 
                            	    value+="=";

                            	    }
                            	    break;
                            	case 7 :
                            	    // JSP.g:1151:12: DDOT
                            	    {
                            	    match(input,DDOT,FOLLOW_DDOT_in_attribute4398); 
                            	    value+=":";

                            	    }
                            	    break;
                            	case 8 :
                            	    // JSP.g:1152:12: ';'
                            	    {
                            	    match(input,69,FOLLOW_69_in_attribute4415); 
                            	    value+=";";

                            	    }
                            	    break;
                            	case 9 :
                            	    // JSP.g:1153:12: DQUOTE
                            	    {
                            	    match(input,DQUOTE,FOLLOW_DQUOTE_in_attribute4430); 
                            	    value+="\"";

                            	    }
                            	    break;
                            	case 10 :
                            	    // JSP.g:1154:12: ws= WS
                            	    {
                            	    ws=(Token)match(input,WS,FOLLOW_WS_in_attribute4447); 
                            	    value+=ws.getText();

                            	    }
                            	    break;

                            	default :
                            	    break loop61;
                                }
                            } while (true);

                            // JSP.g:1156:9: ( '>' )?
                            int alt62=2;
                            int LA62_0 = input.LA(1);

                            if ( (LA62_0==66) ) {
                                alt62=1;
                            }
                            switch (alt62) {
                                case 1 :
                                    // JSP.g:1156:10: '>'
                                    {
                                    match(input,66,FOLLOW_66_in_attribute4476); 
                                    value+=">";

                                    }
                                    break;

                            }

                            // JSP.g:1157:9: ( '<' )?
                            int alt63=2;
                            int LA63_0 = input.LA(1);

                            if ( (LA63_0==67) ) {
                                alt63=1;
                            }
                            switch (alt63) {
                                case 1 :
                                    // JSP.g:1157:10: '<'
                                    {
                                    match(input,67,FOLLOW_67_in_attribute4490); 
                                    value+="<";

                                    }
                                    break;

                            }

                             if(xmlAttr==null){
                                       if(compAttr==null){compAttr = this.factory.createComposedAttribute(); }
                                          createAttributeText(compAttr,value);value="";
                                      }
                                      else{xmlAttr.setValue(value);};
                                    
                            match(input,SQUOTE,FOLLOW_SQUOTE_in_attribute4527); 

                            }


                            }
                            break;
                        case 3 :
                            // JSP.g:1168:7: (id1= ID | digit2= Digit | jsp_element[compAttr] | tag[compAttr] )
                            {
                            // JSP.g:1168:7: (id1= ID | digit2= Digit | jsp_element[compAttr] | tag[compAttr] )
                            int alt64=4;
                            switch ( input.LA(1) ) {
                            case ID:
                                {
                                alt64=1;
                                }
                                break;
                            case Digit:
                                {
                                alt64=2;
                                }
                                break;
                            case JSPTAGOPEN:
                            case JSPOPENEXPR:
                            case JSPOPENDECL:
                            case JSPOPENDIR:
                            case JSPUSEBEAN:
                            case JSPSET:
                            case JSPGET:
                            case JSPOPENINC:
                            case JSPOPENFWD:
                            case JSPOPENPLUG:
                            case JSPOPENROOT:
                            case JSPOPENTEXT:
                            case JSPOPENATTR:
                            case JSPOPENBODY:
                            case JSPOPENINVOKE:
                            case JSPOPENDOBODY:
                            case JSPOPENOUTPUT:
                            case JSPELEMENTOP:
                            case OPENSCRIPLET:
                            case OPENEXPR:
                            case OPENDECL:
                            case OPENDIRECT:
                                {
                                alt64=3;
                                }
                                break;
                            case 67:
                                {
                                int LA64_4 = input.LA(2);

                                if ( (LA64_4==WS) ) {
                                    int LA64_5 = input.LA(3);

                                    if ( (LA64_5==ID) ) {
                                        switch ( input.LA(4) ) {
                                        case WS:
                                            {
                                            int LA64_7 = input.LA(5);

                                            if ( ((LA64_7>=WS && LA64_7<=ID)||LA64_7==JSPTAGOPEN||(LA64_7>=JSPOPENEXPR && LA64_7<=JSPOPENINC)||LA64_7==JSPOPENFWD||LA64_7==JSPOPENPLUG||LA64_7==JSPOPENROOT||LA64_7==JSPOPENTEXT||(LA64_7>=JSPOPENATTR && LA64_7<=JSPOPENBODY)||(LA64_7>=JSPOPENINVOKE && LA64_7<=OPENSCRIPLET)||LA64_7==OPENEXPR||LA64_7==OPENDECL||LA64_7==OPENDIRECT||(LA64_7>=66 && LA64_7<=67)) ) {
                                                alt64=4;
                                            }
                                            else if ( (LA64_7==DDOT) ) {
                                                alt64=3;
                                            }
                                            else {
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 64, 7, input);

                                                throw nvae;
                                            }
                                            }
                                            break;
                                        case DDOT:
                                            {
                                            alt64=3;
                                            }
                                            break;
                                        case ID:
                                        case JSPTAGOPEN:
                                        case JSPOPENEXPR:
                                        case JSPOPENDECL:
                                        case JSPOPENDIR:
                                        case JSPCLOSEACT:
                                        case JSPUSEBEAN:
                                        case JSPSET:
                                        case JSPGET:
                                        case JSPOPENINC:
                                        case JSPOPENFWD:
                                        case JSPOPENPLUG:
                                        case JSPOPENROOT:
                                        case JSPOPENTEXT:
                                        case JSPOPENATTR:
                                        case JSPOPENBODY:
                                        case JSPOPENINVOKE:
                                        case JSPOPENDOBODY:
                                        case JSPOPENOUTPUT:
                                        case JSPELEMENTOP:
                                        case OPENSCRIPLET:
                                        case OPENEXPR:
                                        case OPENDECL:
                                        case OPENDIRECT:
                                        case 66:
                                        case 67:
                                            {
                                            alt64=4;
                                            }
                                            break;
                                        default:
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 64, 6, input);

                                            throw nvae;
                                        }

                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 64, 5, input);

                                        throw nvae;
                                    }
                                }
                                else if ( (LA64_4==ID) ) {
                                    switch ( input.LA(3) ) {
                                    case WS:
                                        {
                                        int LA64_7 = input.LA(4);

                                        if ( ((LA64_7>=WS && LA64_7<=ID)||LA64_7==JSPTAGOPEN||(LA64_7>=JSPOPENEXPR && LA64_7<=JSPOPENINC)||LA64_7==JSPOPENFWD||LA64_7==JSPOPENPLUG||LA64_7==JSPOPENROOT||LA64_7==JSPOPENTEXT||(LA64_7>=JSPOPENATTR && LA64_7<=JSPOPENBODY)||(LA64_7>=JSPOPENINVOKE && LA64_7<=OPENSCRIPLET)||LA64_7==OPENEXPR||LA64_7==OPENDECL||LA64_7==OPENDIRECT||(LA64_7>=66 && LA64_7<=67)) ) {
                                            alt64=4;
                                        }
                                        else if ( (LA64_7==DDOT) ) {
                                            alt64=3;
                                        }
                                        else {
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 64, 7, input);

                                            throw nvae;
                                        }
                                        }
                                        break;
                                    case DDOT:
                                        {
                                        alt64=3;
                                        }
                                        break;
                                    case ID:
                                    case JSPTAGOPEN:
                                    case JSPOPENEXPR:
                                    case JSPOPENDECL:
                                    case JSPOPENDIR:
                                    case JSPCLOSEACT:
                                    case JSPUSEBEAN:
                                    case JSPSET:
                                    case JSPGET:
                                    case JSPOPENINC:
                                    case JSPOPENFWD:
                                    case JSPOPENPLUG:
                                    case JSPOPENROOT:
                                    case JSPOPENTEXT:
                                    case JSPOPENATTR:
                                    case JSPOPENBODY:
                                    case JSPOPENINVOKE:
                                    case JSPOPENDOBODY:
                                    case JSPOPENOUTPUT:
                                    case JSPELEMENTOP:
                                    case OPENSCRIPLET:
                                    case OPENEXPR:
                                    case OPENDECL:
                                    case OPENDIRECT:
                                    case 66:
                                    case 67:
                                        {
                                        alt64=4;
                                        }
                                        break;
                                    default:
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 64, 6, input);

                                        throw nvae;
                                    }

                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 64, 4, input);

                                    throw nvae;
                                }
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 64, 0, input);

                                throw nvae;
                            }

                            switch (alt64) {
                                case 1 :
                                    // JSP.g:1169:11: id1= ID
                                    {
                                    id1=(Token)match(input,ID,FOLLOW_ID_in_attribute4559); 
                                    value+=space+(id1!=null?id1.getText():null);

                                    }
                                    break;
                                case 2 :
                                    // JSP.g:1170:12: digit2= Digit
                                    {
                                    digit2=(Token)match(input,Digit,FOLLOW_Digit_in_attribute4577); 
                                    value+=space+digit2.getText();

                                    }
                                    break;
                                case 3 :
                                    // JSP.g:1171:12: jsp_element[compAttr]
                                    {
                                    xmlAttr=null;
                                              if(compAttr==null){compAttr = this.factory.createComposedAttribute(); }
                                              createAttributeText(compAttr,value);value="";
                                    pushFollow(FOLLOW_jsp_element_in_attribute4593);
                                    jsp_element(compAttr);

                                    state._fsp--;


                                    }
                                    break;
                                case 4 :
                                    // JSP.g:1174:12: tag[compAttr]
                                    {
                                    xmlAttr=null;
                                              if(compAttr==null){compAttr = this.factory.createComposedAttribute(); }
                                              createAttributeText(compAttr,value);value="";
                                    pushFollow(FOLLOW_tag_in_attribute4609);
                                    tag(compAttr);

                                    state._fsp--;


                                    }
                                    break;

                            }

                            if(xmlAttr!=null){xmlAttr.setValue(value);}

                            }
                            break;

                    }


                    }
                    break;

            }


            	     if(xmlAttr!=null){
            	         setParent(parent,xmlAttr);
            	     }
            	     else{
            	         compAttr.setName(attributeName);
            	         setParent(parent,compAttr);
            	     }
                 

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
    // $ANTLR end "attribute"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA61 dfa61 = new DFA61(this);
    static final String DFA1_eotS =
        "\16\uffff";
    static final String DFA1_eofS =
        "\1\1\15\uffff";
    static final String DFA1_minS =
        "\1\4\4\uffff\1\7\4\uffff\1\10\1\7\1\uffff\1\7";
    static final String DFA1_maxS =
        "\1\103\4\uffff\1\10\4\uffff\1\10\1\103\1\uffff\1\103";
    static final String DFA1_acceptS =
        "\1\uffff\1\11\1\1\1\2\1\3\1\uffff\1\5\1\6\1\7\1\10\2\uffff\1\4"+
        "\1\uffff";
    static final String DFA1_specialS =
        "\16\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\1\3\1\11\2\10\2\7\6\10\4\uffff\1\6\1\4\1\uffff\3\4\1\uffff"+
            "\4\4\1\uffff\1\4\1\uffff\1\4\6\uffff\1\4\1\uffff\1\4\2\uffff"+
            "\2\4\1\uffff\5\4\1\uffff\1\4\1\uffff\1\4\1\uffff\1\4\6\uffff"+
            "\1\5",
            "",
            "",
            "",
            "",
            "\1\12\1\13",
            "",
            "",
            "",
            "",
            "\1\13",
            "\1\15\1\14\6\uffff\1\4\6\uffff\1\14\1\uffff\10\14\1\uffff"+
            "\1\14\1\uffff\1\14\6\uffff\1\14\1\uffff\1\14\2\uffff\2\14\1"+
            "\uffff\5\14\1\uffff\1\14\1\uffff\1\14\1\uffff\1\14\5\uffff\2"+
            "\14",
            "",
            "\2\14\6\uffff\1\4\6\uffff\1\14\1\uffff\10\14\1\uffff\1\14"+
            "\1\uffff\1\14\6\uffff\1\14\1\uffff\1\14\2\uffff\2\14\1\uffff"+
            "\5\14\1\uffff\1\14\1\uffff\1\14\1\uffff\1\14\5\uffff\2\14"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "()* loopback of 242:5: ( xmlDecl | docType | jsp_element[null] | tag[null] | endtag | comment[null] | text[null] | cData[null] )*";
        }
    }
    static final String DFA56_eotS =
        "\20\uffff";
    static final String DFA56_eofS =
        "\20\uffff";
    static final String DFA56_minS =
        "\1\7\1\uffff\1\7\11\uffff\1\10\2\7\1\uffff";
    static final String DFA56_maxS =
        "\1\105\1\uffff\1\15\11\uffff\1\10\2\103\1\uffff";
    static final String DFA56_acceptS =
        "\1\uffff\1\13\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\3"+
        "\uffff\1\1";
    static final String DFA56_specialS =
        "\20\uffff}>";
    static final String[] DFA56_transitionS = {
            "\1\11\1\13\2\uffff\1\12\1\4\1\1\1\5\1\7\1\6\5\uffff\1\3\1\uffff"+
            "\3\3\1\uffff\4\3\1\uffff\1\3\1\uffff\1\3\6\uffff\1\3\1\uffff"+
            "\1\3\2\uffff\2\3\1\uffff\5\3\1\uffff\1\3\1\uffff\1\3\1\uffff"+
            "\1\3\5\uffff\1\1\1\2\1\uffff\1\10",
            "",
            "\1\14\1\15\4\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\15",
            "\1\16\1\17\6\uffff\1\3\6\uffff\1\17\1\uffff\10\17\1\uffff"+
            "\1\17\1\uffff\1\17\6\uffff\1\17\1\uffff\1\17\2\uffff\2\17\1"+
            "\uffff\5\17\1\uffff\1\17\1\uffff\1\17\1\uffff\1\17\5\uffff\2"+
            "\17",
            "\2\17\6\uffff\1\3\6\uffff\1\17\1\uffff\10\17\1\uffff\1\17"+
            "\1\uffff\1\17\6\uffff\1\17\1\uffff\1\17\2\uffff\2\17\1\uffff"+
            "\5\17\1\uffff\1\17\1\uffff\1\17\1\uffff\1\17\5\uffff\2\17",
            ""
    };

    static final short[] DFA56_eot = DFA.unpackEncodedString(DFA56_eotS);
    static final short[] DFA56_eof = DFA.unpackEncodedString(DFA56_eofS);
    static final char[] DFA56_min = DFA.unpackEncodedStringToUnsignedChars(DFA56_minS);
    static final char[] DFA56_max = DFA.unpackEncodedStringToUnsignedChars(DFA56_maxS);
    static final short[] DFA56_accept = DFA.unpackEncodedString(DFA56_acceptS);
    static final short[] DFA56_special = DFA.unpackEncodedString(DFA56_specialS);
    static final short[][] DFA56_transition;

    static {
        int numStates = DFA56_transitionS.length;
        DFA56_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA56_transition[i] = DFA.unpackEncodedString(DFA56_transitionS[i]);
        }
    }

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = DFA56_eot;
            this.eof = DFA56_eof;
            this.min = DFA56_min;
            this.max = DFA56_max;
            this.accept = DFA56_accept;
            this.special = DFA56_special;
            this.transition = DFA56_transition;
        }
        public String getDescription() {
            return "()* loopback of 1084:12: ( tag[compAttr] | jsp_element[compAttr] | t= SpecialCharacter | SQUOTE | EQUAL | DDOT | ';' | ws= WS | digit1= Digit | id1= ID )*";
        }
    }
    static final String DFA61_eotS =
        "\20\uffff";
    static final String DFA61_eofS =
        "\20\uffff";
    static final String DFA61_minS =
        "\1\7\1\uffff\1\7\11\uffff\1\10\2\7\1\uffff";
    static final String DFA61_maxS =
        "\1\105\1\uffff\1\16\11\uffff\1\10\2\103\1\uffff";
    static final String DFA61_acceptS =
        "\1\uffff\1\13\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\3"+
        "\uffff\1\1";
    static final String DFA61_specialS =
        "\20\uffff}>";
    static final String[] DFA61_transitionS = {
            "\1\13\1\5\2\uffff\1\4\1\6\1\12\1\1\1\10\1\7\5\uffff\1\3\1\uffff"+
            "\3\3\1\uffff\4\3\1\uffff\1\3\1\uffff\1\3\6\uffff\1\3\1\uffff"+
            "\1\3\2\uffff\2\3\1\uffff\5\3\1\uffff\1\3\1\uffff\1\3\1\uffff"+
            "\1\3\5\uffff\1\1\1\2\1\uffff\1\11",
            "",
            "\1\14\1\15\5\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\15",
            "\1\16\1\17\6\uffff\1\3\6\uffff\1\17\1\uffff\10\17\1\uffff"+
            "\1\17\1\uffff\1\17\6\uffff\1\17\1\uffff\1\17\2\uffff\2\17\1"+
            "\uffff\5\17\1\uffff\1\17\1\uffff\1\17\1\uffff\1\17\5\uffff\2"+
            "\17",
            "\2\17\6\uffff\1\3\6\uffff\1\17\1\uffff\10\17\1\uffff\1\17"+
            "\1\uffff\1\17\6\uffff\1\17\1\uffff\1\17\2\uffff\2\17\1\uffff"+
            "\5\17\1\uffff\1\17\1\uffff\1\17\1\uffff\1\17\5\uffff\2\17",
            ""
    };

    static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
    static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
    static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
    static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
    static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
    static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
    static final short[][] DFA61_transition;

    static {
        int numStates = DFA61_transitionS.length;
        DFA61_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = DFA61_eot;
            this.eof = DFA61_eof;
            this.min = DFA61_min;
            this.max = DFA61_max;
            this.accept = DFA61_accept;
            this.special = DFA61_special;
            this.transition = DFA61_transition;
        }
        public String getDescription() {
            return "()* loopback of 1132:10: ( tag[compAttr] | jsp_element[compAttr] | digit2= Digit | id1= ID | t= SpecialCharacter | EQUAL | DDOT | ';' | DQUOTE | ws= WS )*";
        }
    }
 

    public static final BitSet FOLLOW_xmlDecl_in_page82 = new BitSet(new long[]{0x157D940AF761FFF2L,0x0000000000000008L});
    public static final BitSet FOLLOW_docType_in_page90 = new BitSet(new long[]{0x157D940AF761FFF2L,0x0000000000000008L});
    public static final BitSet FOLLOW_jsp_element_in_page98 = new BitSet(new long[]{0x157D940AF761FFF2L,0x0000000000000008L});
    public static final BitSet FOLLOW_tag_in_page106 = new BitSet(new long[]{0x157D940AF761FFF2L,0x0000000000000008L});
    public static final BitSet FOLLOW_endtag_in_page114 = new BitSet(new long[]{0x157D940AF761FFF2L,0x0000000000000008L});
    public static final BitSet FOLLOW_comment_in_page121 = new BitSet(new long[]{0x157D940AF761FFF2L,0x0000000000000008L});
    public static final BitSet FOLLOW_text_in_page132 = new BitSet(new long[]{0x157D940AF761FFF2L,0x0000000000000008L});
    public static final BitSet FOLLOW_cData_in_page140 = new BitSet(new long[]{0x157D940AF761FFF2L,0x0000000000000008L});
    public static final BitSet FOLLOW_XMLDECL_in_xmlDecl180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOCTYPE_in_docType198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CDATA_in_cData260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsp_scriplet_in_jsp_element316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsp_expression_in_jsp_element339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsp_declaration_in_jsp_element354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsp_action_in_jsp_element438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsp_directive_in_jsp_element456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENCLOSE_in_endtag526 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_WS_in_endtag528 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_endtag533 = new BitSet(new long[]{0x0000000000008080L,0x0000000000000004L});
    public static final BitSet FOLLOW_WS_in_endtag537 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DDOT_in_endtag540 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_WS_in_endtag542 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_endtag547 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000004L});
    public static final BitSet FOLLOW_WS_in_endtag551 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_endtag553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_tag621 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_WS_in_tag623 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_tag628 = new BitSet(new long[]{0x157D940AFF400180L,0x000000000000000CL});
    public static final BitSet FOLLOW_attribute_in_tag685 = new BitSet(new long[]{0x157D940AFF400180L,0x000000000000000CL});
    public static final BitSet FOLLOW_WS_in_tag690 = new BitSet(new long[]{0x157D940AFF400180L,0x000000000000000CL});
    public static final BitSet FOLLOW_jsp_element_in_tag724 = new BitSet(new long[]{0x157D940AFF400180L,0x000000000000000CL});
    public static final BitSet FOLLOW_set_in_tag769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JSPTAGOPEN_in_jsp_scriplet860 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_JSPTAGCLOSE_in_jsp_scriplet906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENSCRIPLET_in_jsp_scriplet992 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_CLOSESCRIPTLET_in_jsp_scriplet1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JSPOPENDECL_in_jsp_declaration1100 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_JSPTAGCLOSE_in_jsp_declaration1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENDECL_in_jsp_declaration1174 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_CLOSEDECL_in_jsp_declaration1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JSPOPENDIR_in_jsp_directive1240 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_WS_in_jsp_directive1242 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_jsp_directive1266 = new BitSet(new long[]{0x0000000000800180L});
    public static final BitSet FOLLOW_attribute_in_jsp_directive1294 = new BitSet(new long[]{0x0000000000800180L});
    public static final BitSet FOLLOW_WS_in_jsp_directive1297 = new BitSet(new long[]{0x0000000000800180L});
    public static final BitSet FOLLOW_JSPTAGCLOSE_in_jsp_directive1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENDIRECT_in_jsp_directive1362 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_WS_in_jsp_directive1364 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_jsp_directive1369 = new BitSet(new long[]{0x0000000008000180L});
    public static final BitSet FOLLOW_attribute_in_jsp_directive1372 = new BitSet(new long[]{0x0000000008000180L});
    public static final BitSet FOLLOW_WS_in_jsp_directive1375 = new BitSet(new long[]{0x0000000008000180L});
    public static final BitSet FOLLOW_JSPCLOSEACT_in_jsp_directive1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JSPOPENEXPR_in_jsp_expression1435 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_JSPTAGCLOSE_in_jsp_expression1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPENEXPR_in_jsp_expression1525 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_CLOSEEXPR_in_jsp_expression1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_jsp_action1625 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_WS_in_jsp_action1627 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_jsp_action1632 = new BitSet(new long[]{0x0000000000008080L});
    public static final BitSet FOLLOW_WS_in_jsp_action1634 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DDOT_in_jsp_action1637 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_WS_in_jsp_action1639 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_jsp_action1644 = new BitSet(new long[]{0x157D940AFF400180L,0x000000000000000CL});
    public static final BitSet FOLLOW_attribute_in_jsp_action1681 = new BitSet(new long[]{0x157D940AFF400180L,0x000000000000000CL});
    public static final BitSet FOLLOW_WS_in_jsp_action1704 = new BitSet(new long[]{0x157D940AFF400180L,0x000000000000000CL});
    public static final BitSet FOLLOW_jsp_element_in_jsp_action1743 = new BitSet(new long[]{0x157D940AFF400180L,0x000000000000000CL});
    public static final BitSet FOLLOW_set_in_jsp_action1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsp_standard_action_in_jsp_action1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsp_include_in_jsp_standard_action1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsp_plugin_in_jsp_standard_action1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsp_getProperty_in_jsp_standard_action1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsp_setProperty_in_jsp_standard_action1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsp_useBean_in_jsp_standard_action1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsp_forward_in_jsp_standard_action1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsp_dobody_in_jsp_standard_action1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsp_output_in_jsp_standard_action1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsp_invoke_in_jsp_standard_action1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsp_body_in_jsp_standard_action1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsp_attribute_in_jsp_standard_action1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsp_text_in_jsp_standard_action1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsp_root_in_jsp_standard_action2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsp_eltStdAct_in_jsp_standard_action2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JSPELEMENTOP_in_jsp_eltStdAct2070 = new BitSet(new long[]{0x0000000008000180L,0x0000000000000004L});
    public static final BitSet FOLLOW_attribute_in_jsp_eltStdAct2073 = new BitSet(new long[]{0x0000000008000180L,0x0000000000000004L});
    public static final BitSet FOLLOW_WS_in_jsp_eltStdAct2076 = new BitSet(new long[]{0x0000000008000180L,0x0000000000000004L});
    public static final BitSet FOLLOW_JSPCLOSEACT_in_jsp_eltStdAct2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_jsp_eltStdAct2120 = new BitSet(new long[]{0x157D940AF7400680L,0x0000000000000018L});
    public static final BitSet FOLLOW_jsp_element_in_jsp_eltStdAct2139 = new BitSet(new long[]{0x157D940AF7400680L,0x0000000000000018L});
    public static final BitSet FOLLOW_comment_in_jsp_eltStdAct2142 = new BitSet(new long[]{0x157D940AF7400680L,0x0000000000000018L});
    public static final BitSet FOLLOW_WS_in_jsp_eltStdAct2146 = new BitSet(new long[]{0x157D940AF7400680L,0x0000000000000018L});
    public static final BitSet FOLLOW_68_in_jsp_eltStdAct2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JSPOPENROOT_in_jsp_root2214 = new BitSet(new long[]{0x0000000000000180L,0x0000000000000004L});
    public static final BitSet FOLLOW_attribute_in_jsp_root2217 = new BitSet(new long[]{0x0000000000000180L,0x0000000000000004L});
    public static final BitSet FOLLOW_WS_in_jsp_root2220 = new BitSet(new long[]{0x0000000000000180L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_jsp_root2224 = new BitSet(new long[]{0x157D9C0AF7400680L,0x0000000000000008L});
    public static final BitSet FOLLOW_comment_in_jsp_root2231 = new BitSet(new long[]{0x157D9C0AF7400680L,0x0000000000000008L});
    public static final BitSet FOLLOW_jsp_element_in_jsp_root2234 = new BitSet(new long[]{0x157D9C0AF7400680L,0x0000000000000008L});
    public static final BitSet FOLLOW_WS_in_jsp_root2237 = new BitSet(new long[]{0x157D9C0AF7400680L,0x0000000000000008L});
    public static final BitSet FOLLOW_JSPCLOSEROOT_in_jsp_root2243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JSPOPENINC_in_jsp_include2285 = new BitSet(new long[]{0x0000000008000180L,0x0000000000000004L});
    public static final BitSet FOLLOW_attribute_in_jsp_include2288 = new BitSet(new long[]{0x0000000008000180L,0x0000000000000004L});
    public static final BitSet FOLLOW_WS_in_jsp_include2291 = new BitSet(new long[]{0x0000000008000180L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_jsp_include2308 = new BitSet(new long[]{0x0000018100000680L});
    public static final BitSet FOLLOW_jsp_param_in_jsp_include2319 = new BitSet(new long[]{0x0000018100000680L});
    public static final BitSet FOLLOW_comment_in_jsp_include2324 = new BitSet(new long[]{0x0000018100000680L});
    public static final BitSet FOLLOW_WS_in_jsp_include2327 = new BitSet(new long[]{0x0000018100000680L});
    public static final BitSet FOLLOW_JSPCLOSEINC_in_jsp_include2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JSPCLOSEACT_in_jsp_include2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JSPOPENFWD_in_jsp_forward2409 = new BitSet(new long[]{0x0000000000000180L,0x0000000000000004L});
    public static final BitSet FOLLOW_attribute_in_jsp_forward2412 = new BitSet(new long[]{0x0000000000000180L,0x0000000000000004L});
    public static final BitSet FOLLOW_WS_in_jsp_forward2415 = new BitSet(new long[]{0x0000000000000180L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_jsp_forward2419 = new BitSet(new long[]{0x0000018400000680L});
    public static final BitSet FOLLOW_jsp_param_in_jsp_forward2428 = new BitSet(new long[]{0x0000018400000680L});
    public static final BitSet FOLLOW_comment_in_jsp_forward2433 = new BitSet(new long[]{0x0000018400000680L});
    public static final BitSet FOLLOW_WS_in_jsp_forward2436 = new BitSet(new long[]{0x0000018400000680L});
    public static final BitSet FOLLOW_JSPCLOSEFWD_in_jsp_forward2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JSPOPENPLUG_in_jsp_plugin2485 = new BitSet(new long[]{0x0000000000000180L,0x0000000000000004L});
    public static final BitSet FOLLOW_attribute_in_jsp_plugin2488 = new BitSet(new long[]{0x0000000000000180L,0x0000000000000004L});
    public static final BitSet FOLLOW_WS_in_jsp_plugin2491 = new BitSet(new long[]{0x0000000000000180L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_jsp_plugin2495 = new BitSet(new long[]{0x000001B000000680L});
    public static final BitSet FOLLOW_jsp_param_in_jsp_plugin2504 = new BitSet(new long[]{0x000001B000000680L});
    public static final BitSet FOLLOW_jsp_fallback_in_jsp_plugin2509 = new BitSet(new long[]{0x000001B000000680L});
    public static final BitSet FOLLOW_comment_in_jsp_plugin2514 = new BitSet(new long[]{0x000001B000000680L});
    public static final BitSet FOLLOW_WS_in_jsp_plugin2517 = new BitSet(new long[]{0x000001B000000680L});
    public static final BitSet FOLLOW_JSPCLOSEPLUG_in_jsp_plugin2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JSPOPENFALL_in_jsp_fallback2564 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_JSPCLOSEFALL_in_jsp_fallback2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JSPGET_in_jsp_getProperty2628 = new BitSet(new long[]{0x0000000008000780L});
    public static final BitSet FOLLOW_attribute_in_jsp_getProperty2631 = new BitSet(new long[]{0x0000000008000780L});
    public static final BitSet FOLLOW_comment_in_jsp_getProperty2634 = new BitSet(new long[]{0x0000000008000780L});
    public static final BitSet FOLLOW_WS_in_jsp_getProperty2637 = new BitSet(new long[]{0x0000000008000780L});
    public static final BitSet FOLLOW_JSPCLOSEACT_in_jsp_getProperty2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JSPSET_in_jsp_setProperty2685 = new BitSet(new long[]{0x0000000008000780L});
    public static final BitSet FOLLOW_attribute_in_jsp_setProperty2688 = new BitSet(new long[]{0x0000000008000780L});
    public static final BitSet FOLLOW_comment_in_jsp_setProperty2691 = new BitSet(new long[]{0x0000000008000780L});
    public static final BitSet FOLLOW_WS_in_jsp_setProperty2694 = new BitSet(new long[]{0x0000000008000780L});
    public static final BitSet FOLLOW_JSPCLOSEACT_in_jsp_setProperty2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JSPUSEBEAN_in_jsp_useBean2743 = new BitSet(new long[]{0x0000000008000780L});
    public static final BitSet FOLLOW_attribute_in_jsp_useBean2747 = new BitSet(new long[]{0x0000000008000780L});
    public static final BitSet FOLLOW_comment_in_jsp_useBean2750 = new BitSet(new long[]{0x0000000008000780L});
    public static final BitSet FOLLOW_WS_in_jsp_useBean2753 = new BitSet(new long[]{0x0000000008000780L});
    public static final BitSet FOLLOW_JSPCLOSEACT_in_jsp_useBean2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JSPOPENPARA_in_jsp_param2797 = new BitSet(new long[]{0x0000000008000780L});
    public static final BitSet FOLLOW_attribute_in_jsp_param2800 = new BitSet(new long[]{0x0000000008000780L});
    public static final BitSet FOLLOW_comment_in_jsp_param2803 = new BitSet(new long[]{0x0000000008000780L});
    public static final BitSet FOLLOW_WS_in_jsp_param2806 = new BitSet(new long[]{0x0000000008000780L});
    public static final BitSet FOLLOW_JSPCLOSEACT_in_jsp_param2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JSPOPENPARAS_in_jsp_param2838 = new BitSet(new long[]{0x0000038000000680L});
    public static final BitSet FOLLOW_jsp_param_in_jsp_param2841 = new BitSet(new long[]{0x0000038000000680L});
    public static final BitSet FOLLOW_comment_in_jsp_param2844 = new BitSet(new long[]{0x0000038000000680L});
    public static final BitSet FOLLOW_WS_in_jsp_param2847 = new BitSet(new long[]{0x0000038000000680L});
    public static final BitSet FOLLOW_JSPCLOSEPARAS_in_jsp_param2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JSPOPENDOBODY_in_jsp_dobody2885 = new BitSet(new long[]{0x0000000008000780L});
    public static final BitSet FOLLOW_attribute_in_jsp_dobody2888 = new BitSet(new long[]{0x0000000008000780L});
    public static final BitSet FOLLOW_comment_in_jsp_dobody2891 = new BitSet(new long[]{0x0000000008000780L});
    public static final BitSet FOLLOW_WS_in_jsp_dobody2894 = new BitSet(new long[]{0x0000000008000780L});
    public static final BitSet FOLLOW_JSPCLOSEACT_in_jsp_dobody2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JSPOPENOUTPUT_in_jsp_output2938 = new BitSet(new long[]{0x0000000008000780L});
    public static final BitSet FOLLOW_attribute_in_jsp_output2941 = new BitSet(new long[]{0x0000000008000780L});
    public static final BitSet FOLLOW_comment_in_jsp_output2944 = new BitSet(new long[]{0x0000000008000780L});
    public static final BitSet FOLLOW_WS_in_jsp_output2947 = new BitSet(new long[]{0x0000000008000780L});
    public static final BitSet FOLLOW_JSPCLOSEACT_in_jsp_output2951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JSPOPENINVOKE_in_jsp_invoke2990 = new BitSet(new long[]{0x0000000008000780L});
    public static final BitSet FOLLOW_attribute_in_jsp_invoke2993 = new BitSet(new long[]{0x0000000008000780L});
    public static final BitSet FOLLOW_comment_in_jsp_invoke2996 = new BitSet(new long[]{0x0000000008000780L});
    public static final BitSet FOLLOW_WS_in_jsp_invoke2999 = new BitSet(new long[]{0x0000000008000780L});
    public static final BitSet FOLLOW_JSPCLOSEACT_in_jsp_invoke3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JSPOPENBODY_in_jsp_body3038 = new BitSet(new long[]{0x157F940AF741F980L,0x0000000000000008L});
    public static final BitSet FOLLOW_text_in_jsp_body3041 = new BitSet(new long[]{0x157F940AF741F980L,0x0000000000000008L});
    public static final BitSet FOLLOW_jsp_element_in_jsp_body3044 = new BitSet(new long[]{0x157F940AF741F980L,0x0000000000000008L});
    public static final BitSet FOLLOW_JSPCLOSEBODY_in_jsp_body3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JSPOPENATTR_in_jsp_attribute3096 = new BitSet(new long[]{0x0000000008000780L,0x0000000000000004L});
    public static final BitSet FOLLOW_attribute_in_jsp_attribute3099 = new BitSet(new long[]{0x0000000008000780L,0x0000000000000004L});
    public static final BitSet FOLLOW_comment_in_jsp_attribute3102 = new BitSet(new long[]{0x0000000008000780L,0x0000000000000004L});
    public static final BitSet FOLLOW_WS_in_jsp_attribute3105 = new BitSet(new long[]{0x0000000008000780L,0x0000000000000004L});
    public static final BitSet FOLLOW_JSPCLOSEACT_in_jsp_attribute3131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_jsp_attribute3175 = new BitSet(new long[]{0x157DD40AF7400680L,0x0000000000000008L});
    public static final BitSet FOLLOW_jsp_element_in_jsp_attribute3195 = new BitSet(new long[]{0x157DD40AF7400680L,0x0000000000000008L});
    public static final BitSet FOLLOW_comment_in_jsp_attribute3198 = new BitSet(new long[]{0x157DD40AF7400680L,0x0000000000000008L});
    public static final BitSet FOLLOW_WS_in_jsp_attribute3201 = new BitSet(new long[]{0x157DD40AF7400680L,0x0000000000000008L});
    public static final BitSet FOLLOW_JSPCLOSEATTR_in_jsp_attribute3217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JSPOPENTEXT_in_jsp_text3269 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_JSPCLOSETEXT_in_jsp_text3273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsp_comment_in_comment3306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_comment_in_comment3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JSP_COMMENT_in_jsp_comment3335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_COMMENT_in_line_comment3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_text3412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Digit_in_text3423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SpecialCharacter_in_text3434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DQUOTE_in_text3443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQUOTE_in_text3452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DDOT_in_text3461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_text3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_text3484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_attribute3644 = new BitSet(new long[]{0x0000000000018082L});
    public static final BitSet FOLLOW_WS_in_attribute3647 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DDOT_in_attribute3650 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_WS_in_attribute3652 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_attribute3657 = new BitSet(new long[]{0x0000000000010082L});
    public static final BitSet FOLLOW_WS_in_attribute3693 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_EQUAL_in_attribute3695 = new BitSet(new long[]{0x157D940AF7406980L,0x0000000000000008L});
    public static final BitSet FOLLOW_WS_in_attribute3696 = new BitSet(new long[]{0x157D940AF7406900L,0x0000000000000008L});
    public static final BitSet FOLLOW_DQUOTE_in_attribute3730 = new BitSet(new long[]{0x157D940AF741F980L,0x000000000000002CL});
    public static final BitSet FOLLOW_tag_in_attribute3777 = new BitSet(new long[]{0x157D940AF741F980L,0x000000000000002CL});
    public static final BitSet FOLLOW_jsp_element_in_attribute3828 = new BitSet(new long[]{0x157D940AF741F980L,0x000000000000002CL});
    public static final BitSet FOLLOW_SpecialCharacter_in_attribute3863 = new BitSet(new long[]{0x157D940AF741F980L,0x000000000000002CL});
    public static final BitSet FOLLOW_SQUOTE_in_attribute3885 = new BitSet(new long[]{0x157D940AF741F980L,0x000000000000002CL});
    public static final BitSet FOLLOW_EQUAL_in_attribute3905 = new BitSet(new long[]{0x157D940AF741F980L,0x000000000000002CL});
    public static final BitSet FOLLOW_DDOT_in_attribute3926 = new BitSet(new long[]{0x157D940AF741F980L,0x000000000000002CL});
    public static final BitSet FOLLOW_69_in_attribute3947 = new BitSet(new long[]{0x157D940AF741F980L,0x000000000000002CL});
    public static final BitSet FOLLOW_WS_in_attribute3968 = new BitSet(new long[]{0x157D940AF741F980L,0x000000000000002CL});
    public static final BitSet FOLLOW_Digit_in_attribute3990 = new BitSet(new long[]{0x157D940AF741F980L,0x000000000000002CL});
    public static final BitSet FOLLOW_ID_in_attribute4011 = new BitSet(new long[]{0x157D940AF741F980L,0x000000000000002CL});
    public static final BitSet FOLLOW_66_in_attribute4042 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_attribute4059 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_DQUOTE_in_attribute4126 = new BitSet(new long[]{0x0000000000002002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_attribute4163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQUOTE_in_attribute4198 = new BitSet(new long[]{0x157D940AF741F980L,0x000000000000002CL});
    public static final BitSet FOLLOW_tag_in_attribute4241 = new BitSet(new long[]{0x157D940AF741F980L,0x000000000000002CL});
    public static final BitSet FOLLOW_jsp_element_in_attribute4293 = new BitSet(new long[]{0x157D940AF741F980L,0x000000000000002CL});
    public static final BitSet FOLLOW_Digit_in_attribute4322 = new BitSet(new long[]{0x157D940AF741F980L,0x000000000000002CL});
    public static final BitSet FOLLOW_ID_in_attribute4340 = new BitSet(new long[]{0x157D940AF741F980L,0x000000000000002CL});
    public static final BitSet FOLLOW_SpecialCharacter_in_attribute4364 = new BitSet(new long[]{0x157D940AF741F980L,0x000000000000002CL});
    public static final BitSet FOLLOW_EQUAL_in_attribute4382 = new BitSet(new long[]{0x157D940AF741F980L,0x000000000000002CL});
    public static final BitSet FOLLOW_DDOT_in_attribute4398 = new BitSet(new long[]{0x157D940AF741F980L,0x000000000000002CL});
    public static final BitSet FOLLOW_69_in_attribute4415 = new BitSet(new long[]{0x157D940AF741F980L,0x000000000000002CL});
    public static final BitSet FOLLOW_DQUOTE_in_attribute4430 = new BitSet(new long[]{0x157D940AF741F980L,0x000000000000002CL});
    public static final BitSet FOLLOW_WS_in_attribute4447 = new BitSet(new long[]{0x157D940AF741F980L,0x000000000000002CL});
    public static final BitSet FOLLOW_66_in_attribute4476 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_attribute4490 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_SQUOTE_in_attribute4527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_attribute4559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Digit_in_attribute4577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsp_element_in_attribute4593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tag_in_attribute4609 = new BitSet(new long[]{0x0000000000000002L});

}