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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

/**
 * @author Gabriel Barbier
 *
 */
public class AmwPropParser {

	public List<String> getWeavedModels(final File amwPropFile) {
		List<String> result;
		/*
		 * Creates the content handler
		 */
		AmwPropContentHandler contentHandler = new AmwPropContentHandler();
		/*
		 * Creates the XMLReader
		 */
		try {
			XMLReader reader = XMLReaderFactory.createXMLReader();
			reader.setContentHandler(contentHandler);
			FileReader fileReader = new FileReader(amwPropFile);
			InputSource inputSource = new InputSource(fileReader);

			reader.parse(inputSource);

			/*
			 * And now, retrieve weaved model paths
			 */
			result = contentHandler.getWeavedModelsPaths();
		} catch (SAXException e) {
			result = null;
		} catch (FileNotFoundException e) {
			result = null;
		} catch (IOException e) {
			result = null;
		}
		return result;
	}
}
