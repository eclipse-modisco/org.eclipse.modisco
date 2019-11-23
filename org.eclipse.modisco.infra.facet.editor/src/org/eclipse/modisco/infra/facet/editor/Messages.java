/*******************************************************************************
 * Copyright (c) 2010 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.facet.editor;

import org.eclipse.osgi.util.NLS;

/**
 * @deprecated Replaced by EMF Facet
 */
@Deprecated
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.modisco.infra.facet.editor.messages"; //$NON-NLS-1$
	public static String FacetEditor_Edition;
	public static String FacetEditor_refreshErrorMarkersJobName;
	public static String FacetModelWizard_facetInNonMoDiscoProject;
	public static String LoadMetaModelResourceAction_LoadMetamodelResource;
	public static String LoadMoDiscoResourceAction_0;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		// cannot be instantiated
	}
}
