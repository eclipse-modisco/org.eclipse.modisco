/** 
 * Copyright (c) 2014, 2015 Mia-Software, and Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Gregoire Dupe (Mia-Software) - Bug 358914 - [Move to EMF Facet][Browser] Switch to EMF Facet
 *    Thomas Cicognani (Soft-Maint) - Bug 442800 - API to open new MoDisco Browser
 */
package org.eclipse.modisco.infra.browser.editor.ui.internal;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = Messages.class.getPackage().getName() + ".messages"; //$NON-NLS-1$
	
	public static String ResourceBrowserOpener_MoDiscoDefaultTreeBrowser;
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
