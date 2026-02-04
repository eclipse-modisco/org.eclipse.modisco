/*******************************************************************************
 * Copyright (c) 2010, 2026 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.java.generation.files;

import org.eclipse.osgi.util.NLS;

/**
 * @deprecated Will be removed,
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470701
 */
@Deprecated
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.modisco.java.generation.files.messages"; //$NON-NLS-1$
	public static String GenerateJava_0;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
