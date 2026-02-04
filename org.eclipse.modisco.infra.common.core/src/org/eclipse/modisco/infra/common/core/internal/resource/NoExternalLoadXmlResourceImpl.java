/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Guyomar (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.common.core.internal.resource;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLLoad;
import org.eclipse.emf.ecore.xmi.impl.XMLLoadImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.modisco.infra.common.core.internal.CommonModiscoActivator;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;

/**
 * An extension of XMLResourceImpl EMF class in order to open files referencing
 * DTD. The aim is to avoid issues occuring when the XML parser tries to check
 * the DTD online if Internet connection is not available.
 *
 */
public class NoExternalLoadXmlResourceImpl extends XMLResourceImpl {

	public NoExternalLoadXmlResourceImpl(final URI uri) {
		super(uri);
	}

	@Override
	protected XMLLoad createXMLLoad() {
		return new XMLLoadImpl(createXMLHelper()) {
			@Override
			protected SAXParser makeParser() throws ParserConfigurationException, SAXException {
				SAXParserFactory f = SAXParserFactory.newInstance();
				f.setValidating(false);
				SAXParser result = f.newSAXParser();
				try {
					result.getXMLReader().setFeature(
							"http://apache.org/xml/features/nonvalidating/load-external-dtd", //$NON-NLS-1$
							false);
				} catch (SAXNotRecognizedException e) {
					MoDiscoLogger.logWarning(e, CommonModiscoActivator.getDefault());
				}
				return result;
			}
		};
	}
}
