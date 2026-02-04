/*******************************************************************************
 * Copyright (c) 2008, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *******************************************************************************/

package org.eclipse.modisco.infra.common.core.internal.amwpropparser;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/**
 * @author Gabriel Barbier
 *
 */
public class AmwPropContentHandler implements ContentHandler {

	public void characters(final char[] value, final int offset, final int count)
			throws SAXException {
		if (this.startModelPath) {
			String path = new String(value, offset, count);
			this.weavedModelsPaths.add(path);
		}
	}

	public void endDocument() throws SAXException {
		// Nothing
	}

	public void endElement(final String uri, final String localName, final String qName)
			throws SAXException {
		if (localName.equals(AmwPropContentHandler.MODEL_PATH)) {
			this.startModelPath = false;
		}
	}

	public void endPrefixMapping(final String arg0) throws SAXException {
		// Nothing
	}

	public void ignorableWhitespace(final char[] arg0, final int arg1, final int arg2)
			throws SAXException {
		// Nothing
	}

	public void processingInstruction(final String arg0, final String arg1) throws SAXException {
		// Nothing
	}

	public void setDocumentLocator(final Locator arg0) {
		// Nothing
	}

	public void skippedEntity(final String arg0) throws SAXException {
		// Nothing
	}

	public void startDocument() throws SAXException {
		// Nothing
	}

	public void startElement(final String uri, final String localName, final String qName,
			final Attributes attributes) throws SAXException {
		if (localName.equals(AmwPropContentHandler.MODEL_PATH)) {
			this.startModelPath = true;
		}
	}

	public void startPrefixMapping(final String arg0, final String arg1) {
		// Nothing
	}

	private boolean startModelPath = false;
	private static final String MODEL_PATH = "model-relative-path"; //$NON-NLS-1$
	private final List<String> weavedModelsPaths = new ArrayList<String>();

	public List<String> getWeavedModelsPaths() {
		return this.weavedModelsPaths;
	}
}
