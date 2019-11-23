/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.query.runtime.emf.tests;

import org.eclipse.osgi.util.NLS;

/**
 * @author gdupe
 *
 */
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.modisco.infra.query.runtime.emf.tests.messages"; //$NON-NLS-1$
	public static String RuntimeExample_0;
	public static String RuntimeExample_2;
	public static String RuntimeExample_4;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		// This class must not be instantiated
	}
}
