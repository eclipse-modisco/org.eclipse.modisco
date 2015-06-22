/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *******************************************************************************/
package org.eclipse.modisco.kdm.source.extension.discovery;

import org.eclipse.osgi.util.NLS;

/**
 * @deprecated Will be removed,
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470701
 */
@Deprecated
public final class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.modisco.kdm.source.extension.discovery.messages"; //$NON-NLS-1$
	public static String AbstractComposedKDMSourceDiscoverer_0;
	public static String AbstractComposedKDMSourceDiscoverer_1;
	static {
		// initialize resource bundle
		NLS.initializeMessages(Messages.BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		// empty block
	}
}
