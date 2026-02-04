/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 *     Nicolas Payneau (Mia-Software) - Enable editability
 *     Nicolas Guyomar (Mia-Software) - Code Synchronisation
 *     Nicolas Guyomar (Mia_software) - Bug 333651 Remove of the MoDisco EPackage view and of the metamodel browsing button
 *******************************************************************************/
package org.eclipse.modisco.infra.browser;

import org.eclipse.osgi.util.NLS;

public final class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.modisco.infra.browser.messages"; //$NON-NLS-1$

	static {
		NLS.initializeMessages(Messages.BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		// make uninstantiable
	}

	public static String DialogUriSelection_RegisteredEPackages;
	public static String DialogUriSelection_title_OpenModelFromEMFRegistry;
	public static String EcoreActionBarContributor_actionBrowse;
	public static String EcoreActionBarContributor_cannotOpenTableEditorNotModelElements;
	public static String EcoreActionBarContributor_decreaseFontSize;
	public static String EcoreActionBarContributor_elementsSelection;
	public static String EcoreActionBarContributor_elementsSelectionUnknowMetamodel;
	public static String EcoreActionBarContributor_increaseFontSize;
	public static String EcoreActionBarContributor_restoreFontSize;
	public static String EcoreBrowser_cannotFindEPackageWithThatURI;
	public static String EcoreBrowser_cannotOpenModelFromURI;
	public static String EcoreBrowser_chooseLoadProxiesDepth;
	public static String EcoreBrowser_error;
	public static String EcoreBrowser_errorLoadingModel;
	public static String EcoreBrowser_errorLoadingResource;
	public static String EcoreBrowser_errors;
	public static String EcoreBrowser_errorsAndWarnings;
	public static String EcoreBrowser_errorSavingResource;
	public static String EcoreBrowser_info;
	public static String EcoreBrowser_infos;
	public static String EcoreBrowser_instances;
	public static String EcoreBrowser_jobName_SearchInModelEditor;
	public static String EcoreBrowser_jobOpeningModelInMoDiscoBrowser;
	public static String EcoreBrowser_loadingModelPlaceholder;
	public static String EcoreBrowser_typeFilterText;
	public static String InstancesForMetaclass_notFound;

	public static String LoadCustomizationsDialog_Add;
	public static String LoadCustomizationsDialog_AddAll;
	public static String LoadCustomizationsDialog_Loading;
	public static String LoadCustomizationsDialog_loadReferencedFacetsCheckbox;
	public static String LoadCustomizationsDialog_Remove;
	public static String LoadCustomizationsDialog_RemoveAll;
	public static String LoadCustomizationsDialog_title_LoadCustomizations;
	public static String LoadFacetsAction_LoadingFacet;
	public static String LoadFacetsAction_LoadingFacets;
	public static String LoadFacetsDialog_LoadedCustomizations;
	public static String LoadFacetsDialog_AvailableCustomizationsLabel;
	public static String LoadFacetsDialog_FilterTextMessage;
	public static String LoadFacetsDialog_AddTooltip;
	public static String LoadFacetsDialog_RemoveTooltip;
	public static String LoadFacetsDialog_AddAllTooltip;
	public static String LoadFacetsDialog_RemoveAllTooltip;
	public static String LoadFacetsDialog_UpLabel;
	public static String LoadFacetsDialog_DownLabel;

	public static String BrowserActionBarContributor_chooseFacetToLoad;
	public static String BrowserActionBarContributor_chooseMetamodel;
	public static String BrowserActionBarContributor_delete;
	public static String BrowserActionBarContributor_deleteButNotUnlink;
	public static String BrowserActionBarContributor_deleteElement;
	public static String BrowserActionBarContributor_deleteOrRemove;
	public static String BrowserActionBarContributor_deleteOrRemove2;
	public static String BrowserActionBarContributor_dialogTitle_LoadFacets;
	public static String BrowserActionBarContributor_loadCustomization;
	public static String BrowserActionBarContributor_loadingCustomizationFailed;
	public static String BrowserActionBarContributor_loadFacets;
	public static String BrowserActionBarContributor_loadMetamodel;
	public static String BrowserActionBarContributor_missingRequiredFacet;
	public static String BrowserActionBarContributor_remove;
	public static String BrowserActionBarContributor_removeButNotDelete;
	public static String BrowserActionBarContributor_removeElement;
	public static String BrowserContentProvider_computingChildren;
	public static String BrowserNavigationLocation_emptySelection;
	public static String BrowserNavigationLocation_multiSelection;
	public static String BrowserNavigationLocation_singleSelection;
	public static String BrowserNavigationLocation_singleSelectionUnknownClass;
	public static String BrowserPreferencePage_askLoadingDepthEachTime;
	public static String BrowserPreferencePage_defaultLoadingDepth;
	public static String BrowserPreferencePage_overridesMetamodelSpecificSettings;
	public static String MetaclassViewerMenuManager_instancesOf;
	public static String MetaclassViewToolBar_displayInstancesOfSubclasses;
	public static String MetaclassViewToolBar_groupByPackage;
	public static String MetaclassViewToolBar_showDerivationTree;
	public static String MetaclassViewToolBar_showEmptyMetaclasses;
	public static String MetaclassViewToolBar_showFullQualifiedNames;
	public static String MetaclassViewToolBar_sortByCount;
	public static String MetaclassViewToolBar_sortByName;
	public static String MetaclassViewToolBar_showViewMenu;
	public static String ModelElementItem_nullQuerySelected;

	public static String openTableEditorOnSelection;
	public static String EcoreActionBarContributor_showPropertiesView;
	public static String RefreshViewerAction_refreshViewer;

	public static String EcoreBrowser_noObjectSelected;
	public static String EcoreBrowser_noSynchronisationExtensionFound;
	public static String EcoreBrowser_notAPositiveInteger;
	public static String EcoreBrowser_selectDepthReferencedResources;
	public static String EcoreBrowser_separator;
	public static String EcoreBrowser_singleObjectSelected;
	public static String EcoreBrowser_metaclasses;
	public static String EcoreBrowser_modelContainsProxies;
	public static String EcoreBrowser_MoDisco_Model_Browser;
	public static String EcoreBrowser_multiObjectSelected;
	public static String EcoreBrowser_refreshingModelViewers;
	public static String EcoreBrowser_ReloadingFacets;
	public static String EcoreBrowser_warning;
	public static String EcoreBrowser_warnings;

	public static String EnableDerivedLinksPromptDialog_enableDerivedLinks;
	public static String EnableDerivedLinksPromptDialog_enableDerivedLinksLong;
	public static String EnableDerivedLinksPromptDialog_rememberDecision;
	public static String SelectQueryAction_addQueryOnElement;
	public static String SelectQueryAction_addQueryOnElements;
	public static String ShowBothPanelsAction_title;
	public static String ShowOnlyInstancesPanelAction_title;
	public static String ShowOnlyTypesPanelAction_title;

	public static String ExecuteQueryAction_executeSelectedQuery;
	public static String ExecuteQueryAction_executeQueries;

	public static String RemoveQueryAction_removeQuery;
	public static String RemoveQueryAction_removeQueries;

	public static String TableEditor_browse;
	public static String TableEditor_columnName_Label;
	public static String TableEditor_columnName_Metaclass;
	public static String TableEditor_ColumnName_queryContext;
	public static String TableEditor_contentsDescription;
	public static String TableEditor_Description_modelQueryResults;
	public static String TableEditor_tableViewer;
	public static String TableEditorInput_editorName_TableViewer;
	public static String TableEditorInput_tooltip_TableViewer;
	public static String TableEditorLabelProvider_error;
	public static String TableEditorLabelProvider_indexOutOfBounds;
	public static String TableEditorLabelProvider_NA;
	public static String TableEditorLabelProvider_none;
	public static String TableEditorLabelProvider_nullContext;
	public static String TableEditorLabelProvider_unexpectedColumnType;
	public static String TableEditorToolBar_tooltip_HideEmtpyColumns;
	public static String TableEditorToolBar_tooltip_OnlyShowCommonColumns;
	public static String TableEditorToolBar_tooltip_sortColumnsByType;
	public static String TreeToolBar_collapseAll;
	public static String TreeToolBar_showAttributes;
	public static String TreeToolBar_showContainer;
	public static String TreeToolBar_showDerivedLinks;
	public static String TreeToolBar_showEmptyAttributes;
	public static String TreeToolBar_showEmptyLinks;
	public static String TreeToolBar_showFullQualifiedNames;
	public static String TreeToolBar_showMultiplicity;
	public static String TreeToolBar_showOppositeLinks;
	public static String TreeToolBar_showOrdering;
	public static String TreeToolBar_showTypeOfLinks;
	public static String TreeToolBar_sortInstances;
	public static String TreeToolBar_sortLinks;
	public static String TreeToolBar_sortLinksByType;
	public static String TreeToolBar_showElementIDs;
	public static String TreeToolBar_showURI;
	public static String TreeToolBar_synchronizeSourceCode;

	public static String UI_FileConflict_label;
	public static String WARN_FileConflict;
	public static String UI_ErrorFile_message;
	public static String UI_modiscoEditor_menu;
	public static String UI_CreateChild_menu_item;

	public static String ErrorsDialog_errors;

	// public static String UI_CreateSibling_menu_item;
}
