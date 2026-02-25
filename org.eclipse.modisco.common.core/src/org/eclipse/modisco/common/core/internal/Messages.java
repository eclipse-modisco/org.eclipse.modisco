/*******************************************************************************
 * Copyright (c) 2009, 2026 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.common.core.internal;

import org.eclipse.osgi.util.NLS;

public final class Messages extends NLS {
	private static final String PROPERTIES = "org.eclipse.modisco.common.core.internal.messages"; //$NON-NLS-1$

	public static String ProjectUtils_0;
	public static String ProjectUtils_1;
	public static String ProjectUtils_2;

	static {
		// initialize resource bundle
		NLS.initializeMessages(Messages.PROPERTIES, Messages.class);
	}

	private Messages() {
		// Nothing
	}
}
