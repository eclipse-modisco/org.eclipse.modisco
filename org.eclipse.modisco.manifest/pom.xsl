<?xml version="1.0" encoding="UTF-8"?>
<!-- 
Copyright (c) 2015 Mia-Software and others.
All rights reserved.
This program and the accompanying materials are made available under 
the terms of the Eclipse Public License v2.0 which accompanies this distribution, 
and is available at http://www.eclipse.org/legal/epl-v20.html
Contributors:
    Grégoire Dupé (Mia-Software) - Bug 480189 - org.eclipse.modisco.manifest* and org.eclipse.modisco.eclipseplugin* should be added in the updatesite
-->
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:exsl="http://exslt.org/common"
	extension-element-prefixes="exsl"
	xmlns:m2="http://maven.apache.org/POM/4.0.0"
	xmlns="http://maven.apache.org/POM/4.0.0">
	<xsl:output indent="yes" />

	<xsl:template match="/">
		
		<project
			xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd"
			xmlns="http://maven.apache.org/POM/4.0.0"
			xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
			<xsl:apply-templates select="//m2:project/*[name()!='build']" />
			<build>
				<plugins>
					<xsl:copy-of select="//m2:project/m2:build/m2:plugins/m2:plugin[(m2:artifactId!='maven-checkstyle-plugin')and(m2:artifactId!='maven-pmd-plugin')]"/>
				</plugins>
				<xsl:copy-of select="//m2:project/build/*[name()!='plugins']"/>
			</build>
		</project>
	</xsl:template>

	<xsl:template match="m2:*|@*">
		<xsl:copy-of select="." />
	</xsl:template>

</xsl:stylesheet>
