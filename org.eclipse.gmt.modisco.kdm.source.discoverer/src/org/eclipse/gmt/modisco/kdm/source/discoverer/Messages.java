/*******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *******************************************************************************/
package org.eclipse.gmt.modisco.kdm.source.discoverer;

import org.eclipse.osgi.util.NLS;

/**
 * @author gdupe
 * @deprecated the whole plug-in is replaced by org.eclipse.modisco.kdm.source.discoverer,
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=474727
 */
@Deprecated
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.gmt.modisco.kdm.source.discoverer.messages"; //$NON-NLS-1$
	public static String DiscoverSourceModelFromContainer_0;
	public static String DiscoverSourceModelFromJavaProject_4;
	static {
		// initialize resource bundle
		NLS.initializeMessages(Messages.BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		// Empty
	}
}
