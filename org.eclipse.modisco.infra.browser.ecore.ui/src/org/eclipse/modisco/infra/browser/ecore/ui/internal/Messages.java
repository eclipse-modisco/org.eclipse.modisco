/** 
 * Copyright (c) 2015 Soft-Maint, and Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Thomas Cicognani (Soft-Maint) - Bug 471020 - Ecore Explorer View
 *    Thomas Cicognani (Mia-Software) - Bug 470962 - Add shortcuts to activate customs
 */
package org.eclipse.modisco.infra.browser.ecore.ui.internal;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = Messages.class.getPackage().getName() + ".messages"; //$NON-NLS-1$
	
	public static String EcoreInstancesExplorerComposite_Instances;
	public static String EcoreMetaExplorerComposite_Metas;
	public static String EcoreExplorerShortcutUtils_NbInstancesEClassByResource;
	public static String EcoreExplorerShortcutUtils_NbInstancesEClassByResourceSet;
	public static String EcoreExplorerShortcutUtils_EClassFromEPackage;
	public static String EcoreExplorerShortcutUtils_EClassSubclasses;
	public static String EcoreExplorerShortcutUtils_EClassHierarchy;
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(Messages.BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		// Empty
	}
}
