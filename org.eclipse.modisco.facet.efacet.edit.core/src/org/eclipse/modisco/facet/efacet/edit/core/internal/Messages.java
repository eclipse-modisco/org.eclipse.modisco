/*******************************************************************************
 * Copyright (c) 2015 Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Jonathan Pepin (Soft-Maint) - Bug 474418 - Edit Facet features with Properties View and Commands
 *******************************************************************************/

package org.eclipse.modisco.facet.efacet.edit.core.internal;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.emf.facet.efacet.edit.core.internal.messages"; //$NON-NLS-1$
	public static String FacetAddAllCommand_Descriptor;
	public static String FacetAddAllCommand_Label;
	public static String FacetAddCommand_Description;
	public static String FacetAddCommand_Label;
	public static String FacetRemoveAllCommand_Description;
	public static String FacetRemoveAllCommand_Label;
	public static String FacetRemoveCommand_Description;
	public static String FacetRemoveCommand_Label;
	public static String FacetSetCommand_Description;
	public static String FacetSetCommand_Label;
	public static String FacetUnSetCommand_Description;
	public static String FacetUnSetCommand_Label;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
