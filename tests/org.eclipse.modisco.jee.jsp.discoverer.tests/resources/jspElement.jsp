<%-- Rule CDATA --%>
<![CDATA[This is a CDATA tag]]>

<%-- Rule tag --%>
<ATTRIBUTESECTION 
	att1="value1" 
	att2='value2' 
	att3=value3 
	att4=<myprefix:myaction att1="value1"/>
	<fragmentJSPAction:action isTagFragment="true"/>
	>
	
</ATTRIBUTESECTION>


<JSPELEMENTSECTION>
	<DIRECTIVE>
		<%@ include nameInclude="valueInclude"%>
		<jsp:directive.page filename="myFileName" />
	</DIRECTIVE>
	
	<EXPRESSION>
		<%=myVariable%>
		<jsp:expression>myVariable</jsp:expression>
	</EXPRESSION>
	
	<SCRIPLET>
		<%This is a JSP Scriplet%>
		<jsp:scriptlet>This is a JSP Scriplet</jsp:scriptlet>
	</SCRIPLET>
	
	<DECLARATION>
		<%!int myVariable = 0;%>
		<jsp:declaration>int myVariable = 0;</jsp:declaration>
	</DECLARATION>	
	
	<COMMENT>
		<%--This is a JSP Comment--%>
	</COMMENT>
				
</JSPELEMENTSECTION>


<JSPACTIONSECTION>

</JSPACTIONSECTION>
	
<JAVASCRIPTSECTION>
	<script language="java">
		Some JavaScript
	</script>
</JAVASCRIPTSECTION>

