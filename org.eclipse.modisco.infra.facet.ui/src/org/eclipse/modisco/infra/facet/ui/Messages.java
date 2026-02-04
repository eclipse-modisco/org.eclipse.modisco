/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *    Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.facet.ui;

import org.eclipse.osgi.util.NLS;

/**
 * @author gdupe
 * @deprecated Replaced by EMF Facet
 */
@Deprecated
public final class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.modisco.infra.facet.ui.messages"; //$NON-NLS-1$
	public static String FacetView_0;
	public static String FacetView_1;
	public static String FacetView_2;
	public static String FacetView_3;
	public static String FacetView_name;
	public static String FacetView_location;
	public static String FacetView_JobName_refreshingFacetSetsView;
	static {
		// initialize resource bundle
		NLS.initializeMessages(Messages.BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		// This method must not be instantiated
	}
}
