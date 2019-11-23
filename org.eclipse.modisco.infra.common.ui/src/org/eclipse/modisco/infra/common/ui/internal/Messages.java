/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software)
 *    Gregoire DUPE (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.common.ui.internal;

import org.eclipse.osgi.util.NLS;

public final class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.modisco.infra.common.ui.internal.messages"; //$NON-NLS-1$
	public static String IContainerCellEditor_0;
	public static String IContainerCellEditor_1;
	public static String IFileCellEditor_0;
	public static String IFileCellEditor_1;
	public static String PackageRegistryView_initializing;
	public static String PackageRegistryView_copyNsURI;
	public static String PackageRegistryView_RefreshingPackageRegistryView;
	public static String PackageRegistryView_nsURI;
	public static String PackageRegistryView_Location;
	public static String PackageRegistryView_Name;
	public static String NewProjectCreationOperation_MoDiscoProjectCreation;
	public static String NewProjectCreationOperation_AddingJavaNature;
	public static String NewProjectCreationOperation_AddingPluginNature;
	public static String NewProjectWizard_modiscoProject;
	public static String NewProjectWizard_createMoDiscoProject;
	public static String GetMoDiscoResourceDialog_loadMoDiscoResource;
	public static String MetamodelSelectionControl_typeFilterText;
	public static String MetaclassSelectionDialog_metaclass;
	public static String MetaclassSelectionDialog_metamodel;
	public static String MetaclassSelectionDialog_selectClassifier;
	public static String MetaclassSelectionDialog_selectClassifiers;
	public static String MetaclassSelectionDialog_selectMetaclass;
	public static String MetaclassSelectionDialog_selectMetaclasses;
	static {
		// initialize resource bundle
		NLS.initializeMessages(Messages.BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		// Nothing
	}
}
