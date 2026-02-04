grammar JSP;
/*
 * Copyright (c) 2010 Mia-Software and others.
 *    All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 *   
 *   Contributors:
 *   
 *       Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
 
/*
Limitation:
-------------------------------
1. Non closed tag will be generated opened/closed without any children
2. Closed tags alone will be dealt with as Text element
3. Closed tags cannot have attribute
4. Attribute without any simple nor double quote can only contain one Digit, or onID, one tag, one jsp_element
5. Tag name cannot start with a special caracter, like <!tagName>
6. Attribute's values contained between double quote cannot contain other double quote as text
*/ 

options {
  language = Java;
}
@lexer::header {
/**
 *  Copyright (c) 2010 Mia-Software and others.
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
} 
@header { 
/**
 *  Copyright (c) 2010 Mia-Software and others.
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
  import org.eclipse.modisco.jee.jsp.*;
  import org.eclipse.modisco.jee.jsp.impl.*;
  import java.util.HashMap;
  import org.eclipse.modisco.xml.*;
  import org.eclipse.modisco.xml.emf.MoDiscoXMLFactory;
  import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
  import org.eclipse.modisco.jee.jsp.discoverer.JspActivator;
}
@lexer::members {
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
}
@members {

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
}

/**
A page is composed with tags (html, javascript) and some jsp element
*/
page[String originalFilePath, String fileName]
  :
    {
        this.page.setOriginalFilePath(originalFilePath);
        this.page.setName(fileName);
    }
    (   
    xmlDecl 
    |docType 
    |jsp_element[null]
    |tag[null]
    |endtag
    |comment[null]   
    |text[null]
    |cData[null]   
    )*         
  ;

//XML Declaration on top of file
fragment xmlDecl  :  t = XMLDECL {this.page.setXmlDeclaration(t.getText());} ;

//DTD Declaration   
fragment docType  :  t=DOCTYPE  {this.page.setDoctype(t.getText());}  ; 

CDATA
  : '<![CDATA[' (options {greedy=false;} : .)* ']]>'
  ;
fragment cData [Element parent] returns[CDATA tag]
  : 
        cData2s=CDATA 
            {
              tag = this.xmlFactory.createCDATA();
              tag.setName(cData2s.getText());
              setParent(parent, tag);
            }
   ; 

fragment jsp_element[Element parent] returns[Element tag]
  :            
        jsp_scriplet[parent]     {tag=$jsp_scriplet.tag;}     
        |jsp_expression[parent]  {tag=$jsp_expression.tag;}
        |jsp_declaration[parent] {tag=$jsp_declaration.tag;}                                                                      
        |jsp_action[ parent]     {tag=$jsp_action.tag;}
        |jsp_directive[parent]   {tag=$jsp_directive.tag;}                                  
  ;
  
fragment endtag returns[Element tag]
  :
  //
  
     '</' WS? id1=ID  (WS? ':' WS? id2=ID)? WS?'>'
     {            
      
       String endTagName =  id1.getText()+ (id2!=null?":"+id2.getText():"") ;    //\$NON-NLS-1\$     
       resolveChild(endTagName);        
     }       
  ;
      
fragment tag[Element parent] returns[Element tag]
  : 

    ( 
    {
      Boolean isJavascript = false;
      
    } 
      //HTML
      '<' WS? id1=ID 
        {                    
          isJavascript = id1.getText().equalsIgnoreCase("script");//\$NON-NLS-1\$      
          if(isJavascript)
          {
             tag = this.factory.createJavaScript();
             String tmp =  id1.getText() ;                                                      
            // tag.setName(tmp); 
             setParent(parent,tag);    
             //We Should concatenate every token we found till we meet </script>
             //But we do not want to declare "</script>" as a token because then it creates some problems           
              String text = "";//\$NON-NLS-1\$
              Boolean tagHeader = true;
              loop1:
                do {  
                      if(input.LT(1).getText()!=null && input.LT(2).getText()!=null && input.LT(3).getText()!=null){
			                    //End of script tag                                               
			                    if (input.LT(1).getText().equalsIgnoreCase("</")//\$NON-NLS-1\$ 
			                    && input.LT(2).getText().equalsIgnoreCase("script")//\$NON-NLS-1\$  
			                    && input.LT(3).getText().equalsIgnoreCase(">") ) //\$NON-NLS-1\$  
			                    {    
			                    //We need to consume the 3 next token for '</' 'script' '>'         
			                       input.consume();
			                       input.consume();
			                       input.consume();                       
			                        break loop1;
			                    }
			                    //end of the tag script element
			                    else if(input.LT(1).getText().equalsIgnoreCase(">") && tagHeader)//\$NON-NLS-1\$  
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
        }
        
        
        (
//              endtag
//              |
              attribute[tag] | WS
              |
              jsp=jsp_element[tag]
              {
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
        )*        
       ('>' |'/>')                      
      )
  ;  

fragment jsp_scriplet[Element parent] returns[JSPScriptlet tag]
  :
          //Version 1.0
          (
            '<%'  //START
              {          
               tag = this.factory.createJSPScriptlet();
               setParent(parent, tag);
               getTagContent(JSPTAGCLOSE,tag);      
              }              
            '%>' //END          
         )
         
         |
         
         //Version 2.0
         (         
           '<jsp:scriptlet>'   //START
             {       
               tag = this.factory.createJSPScriptlet();
               setParent( parent, tag);
               getTagContent(CLOSESCRIPTLET,tag);
             }          
          '</jsp:scriptlet>' //END                          
         )
  ;

fragment jsp_declaration[Element parent] returns[Element tag]
  :
   //JSPDeclaration Section  
        
        //Version 1.0
     (
        '<%!'  //START
          {        
            tag = this.factory.createJSPDeclaration();
            setParent(parent, tag);
            getTagContent(JSPTAGCLOSE,tag);                     
          }   
        '%>' //END              
     )
     
     |
     
     (
     
     '<jsp:declaration>' //START
          {    
              tag = this.factory.createJSPDeclaration();
              setParent( parent, tag);
              getTagContent(CLOSEDECL,tag);  
          }   
      '</jsp:declaration>'  //END                
     )
  ;
  
fragment jsp_directive[Element parent] returns[Element tag]
  :
   //JSPDirective Section  
    
   '<%@' WS? //START
         
        id1=ID 
          {  
            if(id1.getText().equalsIgnoreCase("taglib")){//\$NON-NLS-1\$
              tag = this.factory.createJSPTagLib();                            
            }else{
              tag = this.factory.createJSPDirective();
            }
            tag.setName(id1.getText());
            setParent( parent, tag);                               
          }  
          (attribute[tag]|WS)*
          
   '%>'   //END
                    
    |
    
    {
      tag = this.factory.createJSPDirective();
      setParent( parent, tag); 
    }
    '<jsp:directive.' WS? id2=ID (attribute[tag]|WS)*  '/>'
    { 
      tag.setName(id2.getText());       
    }
  ;
  
fragment jsp_expression[Element parent] returns[JSPExpression tag]
  : 
       //Version 1.0   
       (
          '<%=' //START
            {          
              tag = this.factory.createJSPExpression();
              setParent( parent, tag);
              getTagContent(JSPTAGCLOSE,tag);
            }             
          '%>' //END          
       ) 
       |
       //Version 2.0
       (
           '<jsp:expression>'  //START           
           {      
             tag = this.factory.createJSPExpression();           
             setParent( parent, tag);   
             getTagContent(CLOSEEXPR,tag);           
            }                
            '</jsp:expression>' //END           
        )
  ;
   
    
fragment jsp_action[Element parent] returns[JSPAction tag]
  :  
      (
       '<' WS? id1=ID WS? ':' WS? id2=ID
       {   
          tag = this.factory.createJSPAction();
          tag.setName(id1.getText()+":"+id2.getText());
          setParent( parent, tag);          
       }
        (
                attribute[tag]  
                | WS 
                |
                jsp=jsp_element[tag]
                {
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
            )*
       
       ('>' |'/>')  
   )
   |
   jsp_standard_action[parent]{tag=$jsp_standard_action.tag;}
   

  ;
  
//######################################################################################
//#######################    START OF STANDARD ACTIONS    ##############################
//######################################################################################

fragment jsp_standard_action[Element parent]returns[JSPStdAction tag]
  :
   jsp_include[parent]      {tag=$jsp_include.tag;}//JSP INCLUDE 
   |jsp_plugin[parent]      {tag=$jsp_plugin.tag;}//JSP PLUGIN
   |jsp_getProperty[parent] {tag=$jsp_getProperty.tag;}//JSP GETPROPERTY
   |jsp_setProperty[parent] {tag=$jsp_setProperty.tag;}//JSP SETPROPERTY
   |jsp_useBean[parent]     {tag=$jsp_useBean.tag;}//JSP USE BEAN
   |jsp_forward[parent]     {tag=$jsp_forward.tag;}//JSP FORWARD
   |jsp_dobody[parent]      {tag=$jsp_dobody.tag;}//JSP DOBODY
   |jsp_output[parent]      {tag=$jsp_output.tag;}//JSP OUTPUT
   |jsp_invoke[parent]      {tag=$jsp_invoke.tag;}//JSP INVOKE
   |jsp_body[parent]        {tag=$jsp_body.tag;}//JSP BODY
   |jsp_attribute[parent]   {tag=$jsp_attribute.tag;}//JSP ATTRIBUTE
   |jsp_text[parent]        {tag=$jsp_text.tag;}//JSP TEXT 
   |jsp_root[parent]        {tag=$jsp_root.tag;}//JSP ROOT
   |jsp_eltStdAct[parent]   {tag=$jsp_eltStdAct.tag;}
  ;
 
/*

*/
fragment jsp_eltStdAct[Element parent] returns [JSPStdAction tag]
  :
   {
    tag = createJSPStdAction(parent,"jsp:element");//\$NON-NLS-1\$
   }   
    
      '<jsp:element' (attribute[tag]|WS)* 
      
      ( // Left Factoring
      '/>' 
      |
      '>'      
          (jsp_element[tag]|comment[tag]| WS)*        
       '</jsp:element>'
       )
    
 
  ;

/*
<jsp:root 
   xmlns:jsp="http://.../JSP/Page" 
   [ xmlns:taglibPrefix="URI" ]+ ...  
   version="1.2 | 2.0"> 
      JSP Page  
</jsp:root>
*/    
fragment jsp_root[Element parent] returns [JSPStdAction tag]
  :
   {
      tag = createJSPStdAction(parent,"jsp:root");//\$NON-NLS-1\$
   }
  '<jsp:root' (attribute[tag]|WS)* '>'
    (comment[tag]|jsp_element[tag]|WS)*
  '</jsp:root>'
      
  ;     
fragment jsp_include [Element parent] returns [JSPStdAction tag]
  :
    {
        tag = createJSPStdAction(parent,"jsp:include");//\$NON-NLS-1\$
    }
    '<jsp:include' (attribute[tag]|WS)* 
    (
      '>'
        (jsp_param[tag] | comment[tag]|WS)* 
      '</jsp:include>'      
      |      
      '/>'
    )     
  ;
  
fragment jsp_forward[Element parent] returns [JSPStdAction tag]
  :
    {
       tag = createJSPStdAction(parent,"jsp:forward");//\$NON-NLS-1\$ 
    }
    '<jsp:forward' (attribute[tag]|WS)* '>'
      (jsp_param[tag] | comment[tag]|WS)* 
    '</jsp:forward>'  
  ;  
  
/*
<jsp:plugin type="applet" height="100%" width="100%"
  codebase="/applets"
  code="MyApplet" >
  <jsp:params>
     <jsp:param name="enableDebug" value="true" />
  </jsp:params>
  <jsp:fallback>
     Your browser does not support this
  </jsp:fallback>
</jsp:plugin>
*/  
fragment jsp_plugin[Element parent] returns [JSPStdAction tag]
  :
    {
      tag = createJSPStdAction(parent,"jsp:plugin");//\$NON-NLS-1\$
    }
    '<jsp:plugin' (attribute[tag]|WS)* '>'
      (jsp_param[tag] | jsp_fallback[tag] | comment[tag]|WS)* 
    '</jsp:plugin>'
  ;
   
/*<jsp:fallback>
Your browser does not support this
</jsp:fallback>  */
fragment jsp_fallback[Element parent] returns [JSPStdAction tag]
  :
    { 
      tag = createJSPStdAction(parent,"jsp:fallback");//\$NON-NLS-1\$         
    }   
    '<jsp:fallback>'
       {getTagContent(JSPCLOSEFALL,tag);}
    '</jsp:fallback>'  
    {
      tag.setName("jsp:fallback");
    }        
  ;
  
//<jsp:getProperty name="beanName" property="lastModification" />  
fragment jsp_getProperty[Element parent] returns [JSPStdAction tag]
  :
    {
      tag = createJSPStdAction(parent,"jsp:getProperty");//\$NON-NLS-1\$ 
    }
    '<jsp:getProperty' (attribute[tag]|comment[tag]|WS)* '/>'      
  ;  
  
/*<jsp:setProperty name="beanName"
*property="lastModification" value="<%= new Date()%>" 
/>*/  
fragment jsp_setProperty[Element parent] returns [JSPStdAction tag]
  :
    {
      tag = createJSPStdAction(parent,"jsp:setProperty");//\$NON-NLS-1\$
    }
    '<jsp:setProperty' (attribute[tag]|comment[tag]|WS)* '/>'      
  ;  
 
// <jsp:useBean id="beanName" class="package.Bean" scope="request" />  
fragment jsp_useBean [Element parent] returns [JSPStdAction tag]
  :
    {
      tag = createJSPStdAction(parent,"jsp:useBean");//\$NON-NLS-1\$
    }   
    ('<jsp:useBean') (attribute[tag]|comment[tag]|WS)* '/>'
  ;  
  
//<jsp:param name="enableDebug" value="true" /> 
fragment jsp_param[Element parent]returns [JSPStdAction tag]
  :      
    {
      tag = createJSPStdAction(parent,"jsp:param");//\$NON-NLS-1\$
    }
    '<jsp:param' (attribute[tag]|comment[tag]|WS)* '/>'      
    |    
    {
     tag = createJSPStdAction(parent,"jsp:params");//\$NON-NLS-1\$
    }
    '<jsp:params>' (jsp_param[tag]|comment[tag]|WS)* '</jsp:params>'   
  ;

/*
<jsp:doBody ({var="scopedAttributeName"  |      
    varReader="scopedAttributeName" }   
   [scope="page | request | session | application" ] />) | />
*/
fragment jsp_dobody[Element parent]returns [JSPStdAction tag]
  :
    {
      tag = createJSPStdAction(parent,"jsp:doBody");//\$NON-NLS-1\$
    }
    '<jsp:doBody' (attribute[tag]|comment[tag]|WS)*  '/>'   
  ;

/*
<jsp:output ( omit-xml-declaration="yes|no|true|false" )  
   { doctypeDecl } />
   doctypeDecl ::= ( doctype-root-element="rootElement"
   doctype-public="PubidLiteral"
   doctype-system="SystemLiteral" )
   | ( doctype-root-element="rootElement"   
      doctype-system="SystemLiteral" )
*/ 
fragment jsp_output[Element parent]returns [JSPStdAction tag]
  :
      {
        tag = createJSPStdAction(parent,"jsp:output");//\$NON-NLS-1\$
      }
      '<jsp:output' (attribute[tag]|comment[tag]|WS)* '/>'  
  ;
    
/*
<jsp:invoke fragment="fragmentName" 
({var="scopedAttributeName" | 
varReader="scopedAttributeName"}  
[scope="page | request | session | application" ] />)
 | />
*/  
fragment jsp_invoke[Element parent]returns [JSPStdAction tag]
  :
    {
      tag = createJSPStdAction(parent,"jsp:invoke");//\$NON-NLS-1\$
    }
    '<jsp:invoke' (attribute[tag]|comment[tag]|WS)* '/>'
  ;


  
/*
<jsp:body>any elements or text</jsp:body>
*/
fragment jsp_body[Element parent]returns [JSPStdAction tag]
  :
    {
       tag = createJSPStdAction(parent,"jsp:body");//\$NON-NLS-1\$
    }
    '<jsp:body>' (text[tag]|jsp_element[tag])* '</jsp:body>'
    {
      tag.setName("jsp:body");
    } 
  ;

//<jsp:attribute name="attributeName" [ trim= "true | false" ] />
fragment jsp_attribute[Element parent]returns [JSPStdAction tag]
  :
    {
      tag = createJSPStdAction(parent,"jsp:attribute");//\$NON-NLS-1\$       
    }
    (
        '<jsp:attribute' (attribute[tag]|comment[tag]|WS)* 
        (
           '/>'       
          |
          
            '>'
                 (jsp_element[tag]|comment[tag]|WS)*
            '</jsp:attribute>'
        )
    )
  ;
  
  
/*
<jsp:text>  
   template data  
</jsp:text>
*/
fragment jsp_text[Element parent]returns [JSPStdAction tag]
  :
    {
     tag = createJSPStdAction(parent,"jsp:text");//\$NON-NLS-1\$   
    }
    '<jsp:text>' {getTagContent(JSPCLOSETEXT,tag);} '</jsp:text>'
    {
      tag.setName("jsp:text"); //\$NON-NLS-1\$   
    }
  ;
  

//######################################################################################
//#######################     END OF STANDARD ACTIONS    ###############################
//######################################################################################

fragment comment[Element parent]
  :
    jsp_comment[parent]|line_comment[parent]
  ;

fragment jsp_comment[Element parent] returns[JSPComment tag]
  :
    t=JSP_COMMENT 
    { 
      tag = this.factory.createJSPComment();
      setParent(parent, tag);                      
      tag.setName(t.getText());                                  
    }
  ;
  
fragment line_comment[Element parent] returns[Comment tag]
  :
   t=LINE_COMMENT
   {
     tag = xmlFactory.createComment();
     setParent(parent, tag);  
     tag.setName(t.getText());        
   }
  ;
  
    
fragment text[Element parent] returns[Text text]
  :  
  {
  String content = "";
  }
  (  id=ID {content+= id.getText();}
  |  dig=Digit {content+= dig.getText();}
  |  speChar=SpecialCharacter { content+= speChar.getText();}
  |  DQUOTE { content+= "\"";}
  |  SQUOTE { content+= "\'";}
  |  DDOT   { content+= ":";}
  |  EQUAL  { content+= "=";}
  |  ws=WS  {if(!content.equalsIgnoreCase("")){ content+=ws.getText();} }//We do not want to get all the blank lines in the
                                                                         //model, it is useless
    //the '"' and ''' characters should not be included in the 
    //SpecialCharacter Lexer Rule
  )
  
  {    
  
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
                         
          content+= space+input.get(input.mark()).getText();  //\$NON-NLS-1\$                        
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
     
  ; 

fragment attribute[Element parent]
  :
    {
      String value="";   
       Attribute xmlAttr = this.xmlFactory.createAttribute();
       ComposedAttribute compAttr = null;   
    }
    
        /* An attribute usually seems like :
      name = "value" 
      name = 'value'
      name = value
      but also
        
      JSP = "JSP"
      JSP = 'JSP'
      JSP = JSP 
    */
      
    //NAME
    name=ID (WS? ':' WS? name2=ID)?      
    {
      String attributeName = name.getText();
      if(name2!=null){
        attributeName+=":"+name2.getText();     
      }
       xmlAttr.setName(attributeName);        
    }
   
    
    //VALUE
     (WS?'='WS? 
       (
        (
          ('"'
           (
               {
	               xmlAttr=null;
	               if(compAttr==null){compAttr = this.factory.createComposedAttribute(); }
	               createAttributeText(compAttr,value);value="";
               }
               tag[compAttr]
              |
              {
                xmlAttr=null;  
                if(compAttr==null){compAttr = this.factory.createComposedAttribute(); }   
                createAttributeText(compAttr,value);value="";
              }
                jsp_element[compAttr]
              
              |t=SpecialCharacter  {value+=t.getText();}  
              |SQUOTE {value+="'";} // Only possible when contained with double quote 
              |EQUAL {value+="=";}  //For Meta Tag with 'charset=iso-8859-1' for instance
              |DDOT {value+=":";}  //For URL for instance
              |';' {value+=";";}
              |ws=WS  {value+=ws.getText();}
              |digit1=Digit {value+=space+digit1.getText();}
              |id1=ID  {value+=space+$id1.text;}
           )*
           ('>'{value+=">";})?
           ('<'{value+="<";})?   
          
          { if(xmlAttr==null){
               if(compAttr==null){compAttr = this.factory.createComposedAttribute(); }
               createAttributeText(compAttr,value);value="";
            }
            else{xmlAttr.setValue(value);};
          }            
            
          ('"')+  //We may have several quote by mistake                                  
          )
         )
       (';'{ if(xmlAttr==null) {
                if(compAttr==null){compAttr = this.factory.createComposedAttribute(); }
                createAttributeText(compAttr,";");value="";
             }
             else{xmlAttr.setValue(xmlAttr.getValue()+";");};
        })?
       
       |
     
      ('\''
     
         (
           {
            xmlAttr=null;
            if(compAttr==null){compAttr = this.factory.createComposedAttribute(); }
            createAttributeText(compAttr,value);value="";
           }
           tag[compAttr]            
          |
          {
            xmlAttr=null;
            if(compAttr==null){compAttr = this.factory.createComposedAttribute(); }
            createAttributeText(compAttr,value);value="";
          } 
            jsp_element[compAttr]
            
          |digit2=Digit {value+=space+digit2.getText();} 
          |id1=ID  {value+=space+$id1.text;}      
          |t=SpecialCharacter  {value+=t.getText();}  
          |EQUAL {value+="=";} //For Meta Tag with 'charset=iso-8859-1' for instance
          |DDOT {value+=":";}  //For URL for instance
          |';' {value+=";";}
          |DQUOTE {value+="\"";}
          |ws=WS  {value+=ws.getText();}    
        )*
        ('>'{value+=">";})?
        ('<'{value+="<";})?
        
        { if(xmlAttr==null){
           if(compAttr==null){compAttr = this.factory.createComposedAttribute(); }
              createAttributeText(compAttr,value);value="";
          }
          else{xmlAttr.setValue(value);};
        }
        
    '\'')   
    |
      (
          id1=ID  {value+=space+$id1.text;}
          |digit2=Digit {value+=space+digit2.getText();}
          |{xmlAttr=null;
          if(compAttr==null){compAttr = this.factory.createComposedAttribute(); }
          createAttributeText(compAttr,value);value="";}jsp_element[compAttr]
          |{xmlAttr=null;
          if(compAttr==null){compAttr = this.factory.createComposedAttribute(); }
          createAttributeText(compAttr,value);value="";} tag[compAttr]                   
      )
       {if(xmlAttr!=null){xmlAttr.setValue(value);}}
    )
    
     )? //We could have just an ID ... without EQUAL character
     
     {
	     if(xmlAttr!=null){
	         setParent(parent,xmlAttr);
	     }
	     else{
	         compAttr.setName(attributeName);
	         setParent(parent,compAttr);
	     }
     }
  ;    

  
LINE_COMMENT
  :   
    '<!--' (options {greedy=false;} : .).* '-->'
  ;

JSP_COMMENT
  :
    '<%--' (options {greedy=false;} : .).* '--%>' 
  ;
  
XMLDECL
  :
  '<?'('x'|'X')('m'|'M')('l'|'L') (options {greedy=false;} : .)* '?>'
  ;
    
DOCTYPE
    :
      '<!'('D'|'d')('O'|'o')('C'|'c')('T'|'t')('Y'|'y')('P'|'p')('E'|'e')(options {greedy=false;} : .)*  '>'
    ;
  
fragment INTERNAL_DTD : '[' (options {greedy=false;} : .)* ']' ;


ID 
    : ( LETTER | '_' | '&' | '#') 
        ( options {greedy=true;} : LETTER | IDDigit | '.' | '-' | '_'  | '@' | '°')*
  ;


fragment LETTER
    :  '\u0024' |'\u00A0'
       |'\u0041'..'\u005a'        
       |'\u0061'..'\u007a' 
       |'\u00c0'..'\u00d6' 
       |'\u00d8'..'\u00f6' 
       |'\u00f8'..'\u00ff' 
       |'\u0100'..'\u1fff' 
       |'\u3040'..'\u318f' 
       |'\u3300'..'\u337f' 
       |'\u3400'..'\u3d2d' 
       |'\u4e00'..'\u9fff' 
       |'\uf900'..'\ufaff' 
       |'\u20AC'             //Symbole euro
       |'\u2032'..'\u2037'   //Guillemets simple/double/triple version italique 
       |'\u2018'..'\u201F'  // voir : http://fr.wikipedia.org/wiki/Guillemets
                                   
         
    ;


  
fragment IDDigit
  :  
    '\u0030'..'\u0039'    
  ;
  
  
SpecialCharacter 
  :
    '\u00A0'..'\u00FF'
    |'\u2400'..'\u377F'// Unicode table : http://fr.wikipedia.org/wiki/ISO_8859
    |'{'     
    |'}'      
    |'|'          
    |'!'      
    |'#'      
    |'$'     
    |'&'        
    |'('       
    |')'        
    |'*'        
    |'+'       
    |','        
    |'-'
    |'--'     
    |'.'      
    |'\/'      
    |';'   
    |'?'  
    |'['
    |']'
    |'`'
    |'%' 
    |'@'    
    |'\\'
    |'//'
    |'^'
  ;
 
SQUOTE : '\''; 
DQUOTE : '"'; 
DDOT   : ':';
EQUAL  : '=';

WS  
  : 
    //(' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;}
    (' ' |'\n')+ 
  ;

//White Space, we may have to parse them in order to make sure we
//have no loss of content in the model   
//If you remove the channel = HIDDEN you'll have to deal yourself with the WS
WS2  
  : 
    ( '\r' | '\f' | '\t' )+ {$channel = HIDDEN;}
   
  ;
  
//A digit is composed with digit from 0 to 9, and may contain 
//'.' , '%' or ',' //for float or percentage management
Digit
  :  
    //minus for digit, '#' for html color
    (('-'|'#'|'+')?)('\u0030'..'\u0039')('\u0030'..'\u0039' | '%' | ',' | '.')* 
  ;


OPENCLOSE   : '</'; // typically </br> 

//1.0 JSP Element
JSPTAGOPEN  : '<%' ;   
JSPTAGCLOSE : '%>' ;
JSPOPENEXPR : '<%=';
JSPOPENDECL : '<%!';
JSPOPENDIR  : '<%@';
JSPCLOSEACT : '/>';

//STANDARD ACTION
JSPUSEBEAN  : '<jsp:useBean';
JSPSET      : '<jsp:setProperty';
JSPGET      : '<jsp:getProperty';
JSPOPENINC  : '<jsp:include';
JSPCLOSEINC : '</jsp:include>';
JSPOPENFWD  : '<jsp:forward';
JSPCLOSEFWD : '</jsp:forward>';
JSPOPENPLUG : '<jsp:plugin';
JSPCLOSEPLUG: '</jsp:plugin>';
JSPOPENFALL : '<jsp:fallback>';
JSPCLOSEFALL: '</jsp:fallback>';
JSPOPENPARA : '<jsp:param';
JSPOPENPARAS: '<jsp:params>';
JSPCLOSEPARAS:'</jsp:params>';
JSPOPENROOT : '<jsp:root';
JSPCLOSEROOT: '</jsp:root>';
JSPOPENTEXT : '<jsp:text>';
JSPCLOSETEXT: '</jsp:text>';
JSPCLOSEATTR: '</jsp:attribute>';
JSPOPENATTR : '<jsp:attribute';
JSPOPENBODY : '<jsp:body>';
JSPCLOSEBODY: '</jsp:body>';
JSPOPENINVOKE: '<jsp:invoke';
JSPOPENDOBODY: '<jsp:doBody';
JSPOPENOUTPUT: '<jsp:output';
JSPELEMENTOP : '<jsp:element';


//2.0 JSP Element
OPENSCRIPLET: '<jsp:scriptlet>';
CLOSESCRIPTLET: '</jsp:scriptlet>';
OPENEXPR    : '<jsp:expression>';
CLOSEEXPR   : '</jsp:expression>';
OPENDECL    : '<jsp:declaration>' ;
CLOSEDECL   : '</jsp:declaration>';
OPENDIRECT  : '<jsp:directive.';

//Comment
OPENJSPCMT  : '<%--'; 
CLOSEJSPCMT : '--%>';
OPENXMLCMT  : '<!--'; 
CLOSEXMLCMT : '-->';

XMLDECLOPEN : '<?xml';
//LINK        : '<LINK';

