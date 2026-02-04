/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.ui;

import org.eclipse.osgi.util.NLS;

/**
 * @deprecated Will become internal cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470609
 */
@Deprecated
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.modisco.infra.discovery.ui.messages"; //$NON-NLS-1$
	public static String ContributionItemForMoDiscoMenu_discoverersMenuLabel;
	public static String ContributionItemForMoDiscoMenu_noApplicableDiscoverer;
	public static String DiscovererLaunchConfigurationDelegate_discoveringModel;
	public static String DiscoverersView_declaringBundle;
	public static String DiscoverersView_description;
	public static String DiscoverersView_direction;
	public static String DiscoverersView_horizontal;
	public static String DiscoverersView_implClass;
	public static String DiscoverersView_inputType;
	public static String DiscoverersView_name;
	public static String DiscoverersView_params;
	public static String DiscoverersView_required;
	public static String DiscoverersView_title;
	public static String DiscoverersView_type;
	public static String DiscoverersView_vertical;
	public static String NewDiscovererMainWizardPage_add;
	public static String NewDiscovererMainWizardPage_browse;
	public static String NewDiscovererMainWizardPage_chooseInputType;
	public static String NewDiscovererMainWizardPage_chooseInputTypeLong;
	public static String NewDiscovererMainWizardPage_className;
	public static String NewDiscovererMainWizardPage_createNewDiscoverer;
	public static String NewDiscovererMainWizardPage_description;
	public static String NewDiscovererMainWizardPage_direction;
	public static String NewDiscovererMainWizardPage_discovererLabel;
	public static String NewDiscovererMainWizardPage_discovererLabelTooltip;
	public static String NewDiscovererMainWizardPage_discoverParamsDecl;
	public static String NewDiscovererMainWizardPage_extendAbstractModelDiscoverer;
	public static String NewDiscovererMainWizardPage_handlesModel;
	public static String NewDiscovererMainWizardPage_inputType;
	public static String NewDiscovererMainWizardPage_inputTypeFieldInvalid;
	public static String NewDiscovererMainWizardPage_makeUIContributions;
	public static String NewDiscovererMainWizardPage_multivalued;
	public static String NewDiscovererMainWizardPage_NA;
	public static String NewDiscovererMainWizardPage_name;
	public static String NewDiscovererMainWizardPage_newMoDiscoDiscoverer;
	public static String NewDiscovererMainWizardPage_noSpecialChars;
	public static String NewDiscovererMainWizardPage_parameterMustHaveDescription;
	public static String NewDiscovererMainWizardPage_parameterWithEmptyName;
	public static String NewDiscovererMainWizardPage_registerMenuAction;
	public static String NewDiscovererMainWizardPage_registerMenuActionTooltip;
	public static String NewDiscovererMainWizardPage_remove;
	public static String NewDiscovererMainWizardPage_required;
	public static String NewDiscovererMainWizardPage_type;
	public static String NewDiscovererMainWizardPage_uiName;
	public static String NewDiscovererMainWizardPage_uiNameIsEmpty;
	public static String NewDiscovererWizard_newMoDiscoDiscoverer;
	public static String TargetURIComposite_selectPlatformURI;
	public static String TypeCellEditor_chooseParamType;
	public static String TypeCellEditor_chooseParamTypeLong;
	public static String DiscovererParametersComposite_DiscovererParams;
	public static String DiscovererParametersComposite_inParams;
	public static String DiscovererParametersComposite_inoutParams;
	public static String DiscovererParametersComposite_outParams;
	public static String ParametersTableComposite_name;
	public static String ParametersTableComposite_usage;
	public static String ParametersTableComposite_required;
	public static String ParametersTableComposite_optional;
	public static String ParametersTableComposite_value;
	public static String ParametersTableComposite_type;
	public static String DiscoverersMainTab_sourceElement;
	public static String DiscoverersMainTab_discovererKind;
	public static String DiscoverersMainTab_selectDiscoverer;
	public static String DiscoverersMainTab_discovererNotFound;
	public static String DiscoverersMainTab_discoverer;
	public static String DiscoverersMainTab_noCellEditorRegisteredForType;
	public static String DiscoverersMainTab_openModelInEditorAfterDiscovery;
	public static String DiscoverersMainTab_pleaseSelectDiscoverer;
	public static String GenericParametersDialog_fieldIsEmpty;
	public static String GenericParametersDialog_invalidField1;
	public static String GenericParametersDialog_invalidField2;
	public static String GenericParametersDialog_marksRequiredParam;
	public static String GenericParametersDialog_name;
	public static String GenericParametersDialog_openModelEditor;
	public static String GenericParametersDialog_shellText;
	public static String GenericParametersDialog_title;
	public static String GenericParametersDialog_type;
	public static String GenericParametersDialog_value;
	public static String LaunchModelUtils_discovererNotApplicableOnSource;
	public static String LaunchModelUtils_sourceMustBeExistingResource;
	public static String LaunchModelUtils_sourceMustBeSet;
	public static String LaunchModelUtils_valueNotSet;
	public static String MoDiscoMenuSelectionListener_discovering;
	public static String MoDiscoMenuSelectionListener_discoveringModel;
	public static String MoDiscoMenuSelectionListener_discoveryError;
	public static String MoDiscoMenuSelectionListener_errorInDiscovery;
	public static String MoDiscoMenuSelectionListener_modiscoDiscovererJobLabel;
	static {
		// initialize resource bundle
		NLS.initializeMessages(Messages.BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
