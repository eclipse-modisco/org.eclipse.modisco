/*
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 */
package org.eclipse.gmt.modisco.infra.prefuse;

import org.eclipse.osgi.util.NLS;

/**
 * @author GBarbier
 * @deprecated Will be removed,
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470701
 */
@Deprecated
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.gmt.modisco.infra.prefuse.messages"; //$NON-NLS-1$
	public static String PrefuseGraphContainer_BalancedTree;
	public static String PrefuseGraphContainer_Clique;
	public static String PrefuseGraphContainer_Data;
	public static String PrefuseGraphContainer_DiamondTree;
	public static String PrefuseGraphContainer_Grid;
	public static String PrefuseGraphContainer_Honeycomb;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
