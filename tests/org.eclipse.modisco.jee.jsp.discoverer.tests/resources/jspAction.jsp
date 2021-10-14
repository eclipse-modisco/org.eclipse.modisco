<jsp:element name="value" name1="value1" />

<jsp:element name="value" name1="value1" >      
	   <%-- Comment JSP Element --%>
	   <%@ include name="value"%>        
</jsp:element>

<jsp:root name="value" name1="value1" >
       <%-- Comment JSP Root --%>
	   <%@ include name="value"%>
</jsp:root>

<jsp:include name="value" >
	<jsp:param name="value" name1="value1" />
</jsp:include>

<jsp:forward name="value" >
	<%-- Comment JSP Forward --%>
	<jsp:param name="value" name1="value1" />	
</jsp:forward>
<jsp:plugin name="value" name1="value1">
	<jsp:params>
	<%-- Comment JSP Params --%>
		<jsp:param name="value" name1="value1" />
	</jsp:params>
	
	<%-- Comment JSP Plugin --%>
	
	<jsp:fallback>
	<%-- Comment3 --%>
	This is some content for the fallback tag
	</jsp:fallback>
	
</jsp:plugin>

<jsp:getProperty name="value1" name="value1" />

<jsp:setProperty name="value" name1="value1" />

<jsp:doBody name="value" name1="value1" />

<jsp:output name="value" name1="value1" />

<jsp:invoke name="value" name1="value1" />

<jsp:body>
	text on top of jspbody
	<%@ include name="value"%>   
	text on bottom of jspbody
</jsp:body>

<jsp:attribute name="value" name1="value1"/>

<jsp:attribute name="value" name1="value1">
		<%-- Comment JSP Root --%>
	   <%@ include name="value"%>
</jsp:attribute>

<jsp:useBean name="value" name1="value1" />

<jsp:text>This is some text to test the jsp:text function </jsp:text>







