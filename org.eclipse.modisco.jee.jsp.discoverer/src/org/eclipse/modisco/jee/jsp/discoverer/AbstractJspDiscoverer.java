/*********************************************************************************
 * Copyright (c) 2009,2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - adapted to new discovery framework (Bug 335003)
 *    Fabien Giquel (Mia-Software) - upper case files extensions are not supported (Bug 463078)
 *********************************************************************************/
package org.eclipse.modisco.jee.jsp.discoverer;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.eclipse.core.runtime.Path;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.jee.jsp.JspFactory;
import org.eclipse.modisco.jee.jsp.Model;
import org.eclipse.modisco.jee.jsp.discoverer.parser.JSPLexer;
import org.eclipse.modisco.jee.jsp.discoverer.parser.JSPParser;

public abstract class AbstractJspDiscoverer<T> extends AbstractModelDiscoverer<T> {

	public static final String JSP_FILE_EXTENSION = "jsp"; //$NON-NLS-1$
	public static final String[] EXTENSION_LIST = {
			"jsp", "jspf", "jspx", "jtpl", "jsv", "jsw", "tag", "tagf", "tagx", "htm", "html" }; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ //$NON-NLS-9$ //$NON-NLS-10$ //$NON-NLS-11$
	private static ArrayList<String> extensionList = null;

	/**
	 * get the JSP Factory
	 *
	 * @return the JSP Factory
	 */
	protected static JspFactory getEFactory() {
		return JspFactory.eINSTANCE;
	}

	/** @return the list of valid extensions for a JSP */
	protected static List<String> getExtensionList() {
		if (AbstractJspDiscoverer.extensionList == null) {
			AbstractJspDiscoverer.extensionList = new ArrayList<String>();
			for (String extension : AbstractJspDiscoverer.EXTENSION_LIST) {
				AbstractJspDiscoverer.extensionList.add(extension);
			}
		}
		return AbstractJspDiscoverer.extensionList;
	}

	public static boolean isJspExtension(final String extension) {
		boolean result = false;
		if (extension != null) {
			result = getExtensionList().contains(extension.toLowerCase());
		}
		return result;
	}

	/** Discovers the given file into the given JSP model. */
	protected static void discoverFile(final File file, final Model model)
			throws DiscoveryException {
		try {
			FileInputStream inputStream = new FileInputStream(file);
			ANTLRInputStream input = new ANTLRInputStream(inputStream);
			JSPLexer lexer = new JSPLexer(input, file.getName());
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			JSPParser parser = new JSPParser(tokens);
			parser.page(file.getPath(), file.getName());
			model.getPages().add(parser.page);
		} catch (OutOfMemoryError e) {
			MoDiscoLogger.logError(e, "Discovery encountered an error on \"" //$NON-NLS-1$
					+ file.getAbsolutePath() + "\".", //$NON-NLS-1$
					JspActivator.getDefault());
		} catch (Exception e) {
			throw new DiscoveryException("Error discovering JSP \"" //$NON-NLS-1$
					+ file.getAbsolutePath() + "\".", e); //$NON-NLS-1$
		}
	}

	/**
	 * Recursively discover all JSP files contained in the given directory into the given JSP model
	 *
	 * @throws DiscoveryException
	 */
	protected static void discoverDirectory(final File directory, final Model model)
			throws DiscoveryException {
		if (!directory.isDirectory()) {
			throw new IllegalArgumentException("not a directory"); //$NON-NLS-1$
		}
		File[] files = directory.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				discoverDirectory(file, model);
			} else {
				String fileExtension = new Path(file.getPath()).getFileExtension();
				if (AbstractJspDiscoverer.isJspExtension(fileExtension)) {
					discoverFile(file, model);
				}
			}
		}
	}
}
