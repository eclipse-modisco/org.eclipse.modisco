/*******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *    Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.query.editor;

import org.eclipse.osgi.util.NLS;

/**
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.gmt.modisco.infra.query.editor.messages"; //$NON-NLS-1$
	public static String QueryActionBarContributor_ShowIn;
	public static String LoadMetaModelResourceAction_0;
	public static String QueryEditor_25;
	public static String QueryEditor_Edition;
	public static String QueryEditor_jobRefreshErrorMarkers;
	public static String QueryModelWizard_queryInNonMoDiscoProject;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		// non instantiable
	}
}
