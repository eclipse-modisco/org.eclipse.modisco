<?xml version="1.0"?>
<!--
 Copyright (c) 2011 Mia-Software and others.
 
 All rights reserved. This program and the accompanying materials
 are made available under the terms of the Eclipse Public License v2.0
 which accompanies this distribution, and is available at
 http://www.eclipse.org/legal/epl-v20.html
 
 Contributors:
    Gregoire Dupe (Mia-Software) - Bug 337584 - Documentation set up
    Nicolas Bros (Mia-Software) - Bug 356051 - Move documentation to mediawiki files in documentation plug-ins
-->
<xsl:stylesheet version="1.1"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:output 
		method="xml" indent="yes" encoding="ISO-8859-1" 
		doctype-public="-//W3C//DTD HTML 4.01 Transitional//EN"
      	doctype-system="http://www.w3.org/TR/html4/loose.dtd"
      />

	<xsl:template name="toctpl" match="toc">
		<xsl:param name="location" />
		<xsl:param name="first" />
		<xsl:choose>
			<xsl:when test="$first='notfirst'">
				<li>
					<xsl:value-of select="@label" />
				</li>
				<ul>
					<xsl:apply-templates select="topic">
						<xsl:with-param name="location" select="$location" />
						<xsl:with-param name="first" select="$first"></xsl:with-param>
					</xsl:apply-templates>
				</ul>
			</xsl:when>
			<xsl:otherwise>
				<html>
					<head>
						<style type="text/css">
							a { text-decoration:none; color:#000099;}
							ul { list-style-type:square; margin-left: 0.75em; padding-left: 0.75em; }
							ul ul { list-style-type:square; margin-left: 0.75em; padding-left: 0.75em; }
						</style>
						<title><xsl:value-of select="@label" /> - table of contents</title>
					</head>
					<body>
						<h1>
							<xsl:value-of select="@label" />
						</h1>
						<xsl:apply-templates select="topic">
							<xsl:with-param name="location" select="$location" />
							<xsl:with-param name="first" select="'notfirst'"></xsl:with-param>
						</xsl:apply-templates>
					</body>
				</html>



			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>

	<xsl:template match="topic" name="topictpl">
		<xsl:param name="location" />
		<xsl:param name="first" />

			<xsl:choose>
				<xsl:when test="@href">
					<li>
					<xsl:choose>
						<xsl:when test="$location">
							<a href="{$location}/{@href}" target="content">
								<xsl:value-of select="@label" />
							</a>
						</xsl:when>
						<xsl:otherwise>
							<a href="{@href}" target="content">
								<xsl:value-of select="@label" />
							</a>
						</xsl:otherwise>
					</xsl:choose>
					</li>
				</xsl:when>
				<xsl:when test="link">
					<xsl:apply-templates select="link">
						<xsl:with-param name="location" select="$location" />
						<xsl:with-param name="first" select="$first" />
					</xsl:apply-templates>
				</xsl:when>
				<xsl:otherwise>
					<h2><xsl:value-of select="@label" /></h2>
				</xsl:otherwise>
			</xsl:choose>

			<xsl:if test="descendant::topic">
				<ul>
					<xsl:apply-templates>
						<xsl:with-param name="location" select="$location" />
						<xsl:with-param name="first" select="$first" />
					</xsl:apply-templates>
				</ul>
			</xsl:if>
		
	</xsl:template>

	<xsl:template match="link">
		<xsl:param name="first" />
		<xsl:apply-templates select="document(@toc)">
			<xsl:with-param name="location" select="concat('./',concat(@toc,'/..'))" />
			<xsl:with-param name="first" select="$first" />
		</xsl:apply-templates>
	</xsl:template>

</xsl:stylesheet>

