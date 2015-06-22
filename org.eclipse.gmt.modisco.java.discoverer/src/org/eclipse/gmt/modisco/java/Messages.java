/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Fabien GIQUEL (Mia-Software) - initial API and implementation
 *    Romain Dervaux
 *******************************************************************************/
package org.eclipse.gmt.modisco.java;

import org.eclipse.osgi.util.NLS;

/**
 * @deprecated the whole plug-in is replaced by
 *             "org.eclipse.modisco.java.discoverer" (without the "gmt" part),
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470728
 */
@Deprecated
public final class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.gmt.modisco.java.messages"; //$NON-NLS-1$
	public static String BrowseJavaCode_noFileFound;
	public static String BrowseJavaCode_notHandledJavaElement;
	public static String BrowseJavaCode_projectNotFound;
	public static String DefaultDiscoverer_savingTaskLabel;
	public static String DiscoverJavaModelFromClassFile_jobLabel;
	public static String DiscoverJavaModelFromClassFile_title;
	public static String DiscoverJavaModelFromJavaProject_browseJavaModel;
	public static String DiscoverJavaModelFromJavaProject_jobLabel;
	public static String DiscoverJavaModelFromJavaProject_title;
	public static String DiscoverJavaModelFromLibrary_jobLabel;
	public static String DiscoverJavaModelFromLibrary_title;
	public static String DiscoverKdmModelFromJavaModel_title;
	public static String DiscoverKdmModelFromJavaProject_title;
	public static String TranslateJavaModelToKdm_ConvertJavaToKDM;
	public static String JavaWizard_title;
	public static String JavaWizardFirstPage_analyseAllElements0;
	public static String JavaWizardFirstPage_analysisLevel;
	public static String JavaWizardFirstPage_and;
	public static String JavaWizardFirstPage_dependencies;
	public static String JavaWizardFirstPage_excludedElements;
	public static String JavaWizardFirstPage_filter;
	public static String JavaWizardFirstPage_filterElements;
	public static String JavaWizardFirstPage_filterToolTip;
	public static String JavaWizardFirstPage_firstProjectSelection;
	public static String JavaWizardFirstPage_fullAnalysis;
	public static String JavaWizardFirstPage_incorrectFiltered;
	public static String JavaWizardFirstPage_JavaWizardFirstPage_includedElements;
	public static String JavaWizardFirstPage_libraries;
	public static String JavaWizardFirstPage_library;
	public static String JavaWizardFirstPage_limitedAnalysis;
	public static String JavaWizardFirstPage_mode;
	public static String JavaWizardFirstPage_name;
	public static String JavaWizardFirstPage_Path;
	public static String JavaWizardFirstPage_project;
	public static String JavaWizardFirstPage_projects;
	public static String JavaWizardFirstPage_regExpExcludedElementsNecessary0;
	public static String JavaWizardFirstPage_regExpIncludedElementsNecessary0;
	public static String JavaWizardFirstPage_selected;
	public static String JavaWizardFirstPage_selectProjects;
	public static String JavaWizardFirstPage_settingsLabel;
	public static String JavaWizardFirstPage_useIncremental;
	public static String JavaWizardFirstPage_useSourceOn;
	public static String JavaWizardFirstPage_useSources;
	public static String JavaJdtBridge_0;
	public static String JavaJdtBridge_1;
	public static String JavaJdtBridge_2;
	public static String JavaJdtBridge_3;
	public static String JavaJdtBridge_4;
	public static String JavaJdtBridge_5;
	public static String JavaJdtBridge_6;
	public static String JavaJdtBridge_7;
	public static String JavaReader_bindingsTask;
	public static String JavaReader_discoveringTask;
	public static String JavaReader_redefinitionsTask;
	public static String JDTDelegateBindingFactory_10;
	public static String LibraryReader_BindingTask;
	public static String LibraryReader_DiscoveringTask;
	public static String LibraryReader_RedefinitionsTask;
	static {
		// initialize resource bundle
		NLS.initializeMessages(Messages.BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		// Nothing
	}
}
