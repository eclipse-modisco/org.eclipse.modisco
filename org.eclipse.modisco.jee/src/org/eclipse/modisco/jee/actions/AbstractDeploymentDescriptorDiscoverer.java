/*********************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Guyomar (Mia-Software) - initial API and implementation (class previously named DeploymentDescriptorDiscoverer)
 *    Nicolas Bros (Mia-Software) - refactoring for new discovery framework
 ********************************************************************************/
package org.eclipse.modisco.jee.actions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.modisco.facet.util.core.Logger;
import org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/** A default implementation for discovering JEE configuration file */
public abstract class AbstractDeploymentDescriptorDiscoverer<T> extends AbstractModelDiscoverer<T> {

	/**
	 * Determine which version of DTD/XSD is used in the .xml file
	 *
	 * @param source
	 * @return the version of the .xml file
	 */
	public static String getDescXmlVersion(final Plugin plugin, final Object source,
			final String rootName, final String dtdUrl) {

		// Step 1 : trying simple dtd DOCTYPE retrieving
		String version1 = getDescXmlVersion_step1(plugin, source, rootName);
		if (version1 != null) {
			return version1;
		}

		// Step 2 : trying XML std reading
		String version2 = getDescXmlVersion_step2(plugin, source, rootName, dtdUrl);
		if (version2 != null) {
			return version2;
		}

		return "";
	}

	// Step 1 : trying simple dtd DOCTYPE retrieving
	private static String getDescXmlVersion_step1(final Plugin plugin, final Object source, final String rootName) {
		Reader reader = null;
		try {
			reader = openReader(source);
			BufferedReader buffReader = new BufferedReader(reader);
			String line = buffReader.readLine();
			StringBuffer buffer = new StringBuffer();
			while (line != null) {
				if (line.contains("<!DOCTYPE")) { //$NON-NLS-1$
					buffer.append(line);
					if (line.contains(">")) { //$NON-NLS-1$
						break; // we found the end of the doctypeDeclaration
					}
					line = buffReader.readLine();
					while (line != null) {
						buffer.append(line);
						if (line.contains(">")) { //$NON-NLS-1$
							break; // we found the end of the
									// doctypeDeclaration
						}
						line = buffReader.readLine();
					}
				}
				line = buffReader.readLine();
			}
			if (buffer.length() > 0) {
				String http = "http://java.sun.com"; //$NON-NLS-1$
				if (buffer.indexOf(http) > 0) {
					String systemId = buffer.substring(buffer.indexOf(http));
					if (systemId.indexOf(".dtd") > 0) { //$NON-NLS-1$
						systemId = systemId.substring(0, systemId.indexOf(".dtd")); //$NON-NLS-1$

						return (systemId.substring(
								systemId.indexOf(rootName) + rootName.length() + 1,
								systemId.length())).replace("_", "."); //$NON-NLS-1$ //$NON-NLS-2$
					}
				}
			}

		} catch (FileNotFoundException e) {
			Logger.logError(e.getMessage(), plugin);
		} catch (IOException e) {
			Logger.logError(e.getMessage(), plugin);
		} finally {
			closeReader(reader);
		}
		return null;
	}

	// Step 2 : trying XML std reading
	private static String getDescXmlVersion_step2(final Plugin plugin, final Object source,
			final String rootName, final String dtdUrl) {
		// SAX reading could be better, but files are pretty small
		String extension = ".xsd"; //$NON-NLS-1$
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db;
	
		Reader reader = null;
		try {
			reader = openReader(source);
			InputSource inputSource = new InputSource(reader);
		//	File file = null;
	
		//	if (source instanceof IFile && ((IFile) source).exists()) {
		//		file = new File(((IFile) source).getLocation().toString());
		//	} else {
		//		file = (File) source;
		//	}
			db = dbf.newDocumentBuilder();
			Document doc = db.parse(inputSource);
			doc.getDocumentElement().normalize();
	
			if (!doc.getDocumentElement().getNodeName().equalsIgnoreCase(rootName)) {
				return "0"; //$NON-NLS-1$
			}
	
			// We check the version
			if (!doc.getDocumentElement().getAttribute("version").toString()//$NON-NLS-1$
					.equalsIgnoreCase("")) { //$NON-NLS-1$
				return doc.getDocumentElement().getAttribute("version")//$NON-NLS-1$
						.toString();
	
				// if no "version" attribute present, look for the xsd
				// declaration
			} else if (!doc.getDocumentElement()
					.getAttribute("xsi:schemaLocation").toString().equalsIgnoreCase("")) { //$NON-NLS-1$ //$NON-NLS-2$
				String schemaLocation = doc.getDocumentElement().getAttribute("xsi:schemaLocation"); //$NON-NLS-1$
	
				if (schemaLocation.contains(rootName)) {
					return ((String) schemaLocation.subSequence(schemaLocation.indexOf(rootName)
							+ rootName.length() + 1, schemaLocation.length() - extension.length()))
							.replace("_", "."); //$NON-NLS-1$ //$NON-NLS-2$
				}
	
			} else {
				if (doc.getDoctype() != null) {
					String systemId = doc.getDoctype().getSystemId();
	
					// example of systemId:
					// http://java.sun.com/j2ee/dtds/web-app_2_2.dtd
					return (systemId.substring(systemId.indexOf(rootName) + rootName.length()
							+ 1, systemId.length() - extension.length())).replace("_", "."); //$NON-NLS-1$ //$NON-NLS-2$
				} else {
					// DOCTYPE might be commented
					return getDoctypeVersion(plugin, source, rootName, dtdUrl);
				}
			}
		} catch (ParserConfigurationException e) {
			Logger.logError(e.getMessage(), plugin);
		} catch (IOException e) {
			Logger.logError(e.getMessage(), plugin);
		} catch (SAXException e) {
			Logger.logError(e.getMessage(), plugin);
		} finally {
			closeReader(reader);
		}
		return null;
	}

	/**
	 * Look for a DOCTYPE declaration, then a dtd one. Assume that the right DTD is declared right
	 * after the DOCTYPE
	 *
	 * @param file
	 * @return the version of the hibernate-configuration.xml file
	 */
	public static String getDoctypeVersion(final Plugin plugin, final Object source,
			final String rootName, final String baseUrl) {
		String version = ""; //$NON-NLS-1$
		String docType = "DOCTYPE"; //$NON-NLS-1$
		String dtdFileExtension = ".dtd"; //$NON-NLS-1$

		// Number of line used to create a single String
		final int dtdDeclarationSize = 5;

	//	File file = null;

	//	if (source instanceof IFile && ((IFile) source).exists()) {
	//		file = new File(((IFile) source).getLocation().toString());
	//	} else {
	//		file = (File) source;
	//	}

		Reader reader = null;
		try {
			reader = openReader(source);
		//	InputStream ips = new FileInputStream(file.getPath());
		//	InputStreamReader ipsr = new InputStreamReader(ips);
			BufferedReader br = new BufferedReader(reader);
			String line;

			while ((line = br.readLine()) != null) {

				// Only on DOCTYPE declaration is allowed
				if (line.contains(docType)) {

					// The DTD declaration might be on several different lines
					String bigLine = line;
					for (int i = 0; i < dtdDeclarationSize; i++) {
						bigLine += br.readLine();
					}

					bigLine = bigLine.replaceAll("\\s+", ""); //$NON-NLS-1$ //$NON-NLS-2$

					if (bigLine.contains(baseUrl)) {
						// SubSequence from the url of the DTD
						String subSq = (String) bigLine.subSequence(bigLine.indexOf(baseUrl),
								bigLine.length());

						version = subSq.substring(
								subSq.indexOf(rootName) + rootName.length() + 1,
								subSq.indexOf(rootName) + rootName.length()
										+ dtdFileExtension.length()).replace("_", "."); //$NON-NLS-1$ //$NON-NLS-2$

						break;
					}
				}
			}
		//	br.close();
		} catch (Exception e) {
			Logger.logWarning(Messages.DeployementDescriptorDiscoverer_1 + e.toString(),
					plugin);
		} finally {
			closeReader(reader);
		}
		return version;
	}

	private static void closeReader(Reader reader) {
		if (reader != null) {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static Reader openReader(final Object source) throws IOException {
		if (source instanceof URI) {
			InputStream inputStream = URIConverter.INSTANCE.createInputStream((URI)source);
			return new InputStreamReader(inputStream);
		}		
		File file = null;

		if (source instanceof IFile && ((IFile) source).exists()) {
			file = new File(((IFile) source).getLocation().toString());
		} else {
			file = (File) source;
		}
		return new FileReader(file);
	}
}
