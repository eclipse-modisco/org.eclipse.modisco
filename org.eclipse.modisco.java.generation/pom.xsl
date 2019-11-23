<?xml version="1.0" encoding="UTF-8"?>
<!-- Copyright (c) 2012, 2015 Mia-Software. -->
<!-- All rights reserved. -->
<!-- This program and the accompanying materials are made available under 
	the terms of the Eclipse Public License v1.0 which accompanies this distribution, 
	and is available at http://www.eclipse.org/legal/epl-v10.html -->
<!-- Contributors: -->
<!-- Grégoire Dupé (Mia-Software) - Bug 413749 - Missing GenerateJava.emtl file in modisco java generator plugin -->
<!-- Grégoire Dupé (Mia-Software) - Bug 468685 - [Unit Test Failure] org.eclipse.modisco.java.generation.tests.TestGlobal001.test001  -->
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
			<xsl:apply-templates select="//m2:project/*[name()!='build']" />
			<properties>
				<eclipse-site>http://download.eclipse.org/releases/indigo</eclipse-site>
				<platform-version>[3.7,3.8)</platform-version>
			</properties>
			<repositories>
				<repository>
					<id>Eclipse - Acceleo Snapshots</id>
					<url>https://repo.eclipse.org/content/repositories/acceleo-snapshots</url>
				</repository>
				<repository>
					<id>Eclipse - Acceleo Release</id>
					<url>https://repo.eclipse.org/content/repositories/acceleo-releases</url>
				</repository>
			</repositories>
		
			<pluginRepositories>
				<pluginRepository>
					<id>Eclipse - Acceleo Snapshots</id>
					<url>https://repo.eclipse.org/content/repositories/acceleo-snapshots</url>
				</pluginRepository>
				<pluginRepository>
					<id>Eclipse - Acceleo Release</id>
					<url>https://repo.eclipse.org/content/repositories/acceleo-releases</url>
				</pluginRepository>
			</pluginRepositories>

			<dependencies>
				<dependency>
					<groupId>org.eclipse.acceleo</groupId>
					<artifactId>org.eclipse.acceleo.maven</artifactId>
					<version>3.5.0-SNAPSHOT</version>
				</dependency>
				<dependency>
					<groupId>org.eclipse.acceleo</groupId>
					<artifactId>org.eclipse.acceleo.engine</artifactId>
					<version>3.5.0-SNAPSHOT</version>
				</dependency>
				<dependency>
					<groupId>org.slf4j</groupId>
					<artifactId>slf4j-simple</artifactId>
					<version>1.6.4</version>
				</dependency>
			</dependencies>
			
			<build>
				<plugins>
					<xsl:copy-of select="//m2:project/build/plugins/*"/>
					<plugin>
						<groupId>org.eclipse.acceleo</groupId>
						<artifactId>org.eclipse.acceleo.maven</artifactId>
						<version>3.5.0-SNAPSHOT</version>
						<executions>
							<execution>
								<goals>
									<goal>acceleo-compile</goal>
								</goals>
								<phase>compile</phase>
							</execution>
						</executions>
						<configuration>
							<useBinaryResources>false</useBinaryResources>
							<usePlatformResourcePath>true</usePlatformResourcePath>
							<acceleoProject>
								<root>${basedir}</root>
								<entries>
									<entry>
										<input>src/</input>
										<output>__target__/classes</output>
									</entry>
								</entries>
								<jars>
									<jar>p2.eclipse-plugin:org.eclipse.emf.ecore</jar>
									<jar>org.eclipse.mdt:org.eclipse.gmt.modisco.java</jar>
								</jars>
							</acceleoProject>
							<packagesToRegister>
								<packageToRegister>org.eclipse.emf.ecore.EcorePackage</packageToRegister>
								<packageToRegister>org.eclipse.gmt.modisco.java.emf.JavaPackage</packageToRegister>
							</packagesToRegister>
							<uriHandler>org.eclipse.acceleo.maven.AcceleoURIHandler</uriHandler>
						</configuration>
					</plugin>
					<plugin>
						<groupId>org.apache.maven.plugins</groupId>
						<artifactId>maven-resources-plugin</artifactId>
						<version>2.4.1</version>
						<configuration>
							<encoding>ISO-8859-1</encoding>
						</configuration>
					</plugin>
				</plugins>
				<xsl:copy-of select="//m2:project/build/*[name()!='plugins']"/>
			</build>
		</project>
	</xsl:template>

	<xsl:template match="m2:*|@*">
		<xsl:copy-of select="." />
	</xsl:template>

</xsl:stylesheet>
