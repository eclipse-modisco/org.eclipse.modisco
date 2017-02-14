<?xml version="1.0" encoding="UTF-8"?>
<!-- Copyright (c) 2012 Mia-Software. -->
<!-- All rights reserved. -->
<!-- This program and the accompanying materials are made available under 
	the terms of the Eclipse Public License v1.0 which accompanies this distribution, 
	and is available at http://www.eclipse.org/legal/epl-v10.html -->
<!-- Contributors: -->
<!-- Grégoire Dupé (Mia-Software) -->
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:exsl="http://exslt.org/common"
	extension-element-prefixes="exsl" xmlns:m2="http://maven.apache.org/POM/4.0.0"
	xmlns="http://maven.apache.org/POM/4.0.0">
	<xsl:output indent="yes" />

	<xsl:template match="/">
		<project
			xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd"
			xmlns="http://maven.apache.org/POM/4.0.0"
			xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
			<xsl:apply-templates select="//m2:project/*" />
			<dependencies>
				<dependency>
					<groupId>org.eclipse.mdt</groupId>
					<artifactId>org.eclipse.modisco.tests</artifactId>
<<<<<<< HEAD   (a3639a Bug 507622 - [New Browser] The copy handler hides handlers o)
					<version>0.13.2-SNAPSHOT</version>
=======
					<version>0.12.2-SNAPSHOT</version>
>>>>>>> BRANCH (96a465 The new version of the releng dosen't support the use of var)
					<type>eclipse-test-plugin</type>
				</dependency>
			</dependencies>
		</project>
	</xsl:template>

	<xsl:template match="m2:*|@*">
		<xsl:copy-of select="." />
	</xsl:template>

</xsl:stylesheet>
