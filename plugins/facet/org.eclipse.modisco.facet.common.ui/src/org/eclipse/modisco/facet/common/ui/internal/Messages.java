/*******************************************************************************
 * Copyright (c) 2012, 2019 CEA LIST and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 372732 - [Facet] Rewrite the catalog views for 0.2
 *******************************************************************************/
package org.eclipse.modisco.facet.common.ui.internal;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.modisco.facet.common.ui.internal.messages"; //$NON-NLS-1$
	public static String ElementsView_refreshJobTitle;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
