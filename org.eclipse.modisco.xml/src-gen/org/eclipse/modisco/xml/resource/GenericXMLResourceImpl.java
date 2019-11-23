/**
 * *******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 
 *     Fabien Giquel (Mia-Software) - initial API and implementation
 * *******************************************************************************
 *
 */
package org.eclipse.modisco.xml.resource;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.xml.internal.resource.GenericXMLHandler;
import org.eclipse.modisco.xml.internal.resource.GenericXMLWriter;
import org.eclipse.modisco.xml.plugin.XmlActivator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

/**
 * A EMF Resource implementation which manages generic xml models serialization.
 * XML Metamodel referenced here differs from 
 * http://www.eclipse.org/emf/2003/XMLType one.
 * 
 * XML Metamodel referenced here is a subset of W3C XML concepts,
 * e.g. element type declarations are not present.
 *
 */
public class GenericXMLResourceImpl extends ResourceImpl {

	/**
	 * Constructor for GenericXMLResourceImpl.
	 * @param uri
	 */
	public GenericXMLResourceImpl(final URI uri) {
		super(uri);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected final void doLoad(final InputStream inputStream, 
			final Map<?, ?> options)
			throws IOException {
		try {
			SAXParserFactory f = SAXParserFactory.newInstance();
			f.setValidating(false);
			SAXParser p = f.newSAXParser();
			DefaultHandler handler = 
				new GenericXMLHandler(this, (Map<String, Object>) options);
			
			final XMLReader reader = p.getXMLReader();
			try {
				reader.setProperty(
								"http://xml.org/sax/properties/lexical-handler", //$NON-NLS-1$
								handler);
			} catch (SAXNotRecognizedException e) {
				IStatus warning = new Status(IStatus.INFO, 
						XmlActivator.PLUGIN_ID,
				"Default XML sax parser does not support lexical handling.\n"  //$NON-NLS-1$
				+ "DTDs and comment informations will not be available."); //$NON-NLS-1$
				XmlActivator.getDefault().getLog().log(warning);
			}
			
			try {
				reader.setFeature(
				"http://apache.org/xml/features/nonvalidating/load-external-dtd" //$NON-NLS-1$
						, false);
			} catch (SAXNotRecognizedException e) {
				// go on without this feature, 
				// UnknownHostException may occur when
				// a external dtd is indicated 
				// but not accessible (e.g. if www is not available)
				MoDiscoLogger.logWarning(e, XmlActivator.getDefault());
			}

			p.parse(inputStream, handler);

		} catch (ParserConfigurationException e) {
			throw new IOException(e.getMessage());
		} catch (SAXException e) {
			throw new IOException(e.getMessage());
		}

	}

	@Override
	protected final void doSave(final OutputStream outputStream, 
			final Map<?, ?> options)
			throws IOException {
		GenericXMLWriter writer = new GenericXMLWriter(outputStream);
		for (EObject topLevelObject : getContents()) {
			writer.serialize(
			(org.eclipse.modisco.xml.Element) topLevelObject);
		}
		writer.flush();
		writer.close();
	}
}
