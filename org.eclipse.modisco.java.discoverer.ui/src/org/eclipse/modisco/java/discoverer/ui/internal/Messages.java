/**
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Fabien GIQUEL (Mia-Software) - initial API and implementation
 *    Romain Dervaux
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *******************************************************************************/
package org.eclipse.modisco.java.discoverer.ui.internal;

import org.eclipse.osgi.util.NLS;

public final class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.modisco.java.discoverer.ui.internal.messages"; //$NON-NLS-1$
	public static String JavaElementsToAnalyzeDialog_and;
	public static String JavaElementsToAnalyzeDialog_dontUseSource;
	public static String JavaElementsToAnalyzeDialog_libraries;
	public static String JavaElementsToAnalyzeDialog_library;
	public static String JavaElementsToAnalyzeDialog_message;
	public static String JavaElementsToAnalyzeDialog_name;
	public static String JavaElementsToAnalyzeDialog_Path;
	public static String JavaElementsToAnalyzeDialog_project;
	public static String JavaElementsToAnalyzeDialog_projects;
	public static String JavaElementsToAnalyzeDialog_selected;
	public static String JavaElementsToAnalyzeDialog_sourceNotAvailable;
	public static String JavaElementsToAnalyzeDialog_title;
	public static String JavaElementsToAnalyzeDialog_useSource;
	public static String JavaElementsToAnalyzeDialog_useSources;
	static {
		// initialize resource bundle
		NLS.initializeMessages(Messages.BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		// Nothing
	}
}
