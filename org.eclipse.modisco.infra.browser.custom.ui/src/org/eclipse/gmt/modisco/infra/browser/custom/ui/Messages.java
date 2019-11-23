/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.browser.custom.ui;

import org.eclipse.osgi.util.NLS;

/**
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public final class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.gmt.modisco.infra.browser.custom.ui.messages"; //$NON-NLS-1$
	public static String CustomizationsView_allQuerySets;
	public static String CustomizationsView_jobName_RefreshCustomizationsView;
	public static String CustomizationsView_metamodelColumn;
	public static String CustomizationsView_nameColumn;
	public static String CustomizationsView_querySetsColumn;
	public static String NewCustomizationFilePage_browserCustomization;
	public static String NewCustomizationFilePage_createsBrowserCustomization;
	public static String NewCustomizationFilePage_customizationInNonMoDiscoProject;
	public static String NewCustomizationWizard_newBrowserCustomization;
	public static String QuerySetsSelectionControl_allExistingQuerySets;
	public static String QuerySetsSelectionControl_availableQuerySets;
	public static String QuerySetsSelectionControl_deselectAll;
	public static String QuerySetsSelectionControl_querySetsSelectedBelowOnly;
	public static String QuerySetsSelectionControl_selectAll;
	public static String SelectMetamodelsPage_selectMetamodel;
	public static String SelectMetamodelsPage_selectMetamodelToCustomize;
	public static String SelectQuerySetsPage_selectAvailableQuerySets;
	public static String SelectQuerySetsPage_selectAvailableQuerySetsInCustomization;
	static {
		// initialize resource bundle
		NLS.initializeMessages(Messages.BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		// cannot be instantiated
	}
}
