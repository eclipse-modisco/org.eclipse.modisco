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
package org.eclipse.modisco.infra.query.ui;

import org.eclipse.osgi.util.NLS;

/**
 * @author gdupe
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public final class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.modisco.infra.query.ui.messages"; //$NON-NLS-1$
	public static String ContextPaneMenuManager_Remove;
	public static String ContextPaneMenuManager_RemoveAll;
	public static String CreateJavaQueryImplClass_cannotCreate;
	public static String CreateJavaQueryImplClass_modelURIMustBePlatform;
	public static String CreateJavaQueryImplClass_cannotCreateImplClass;
	public static String CreateJavaQueryImplClass_implClassAlreadyExists;
	public static String CreateJavaQueryImplClass_unknownError;
	public static String CreateJavaQueryImplClass_cannotCreateImplClass2;
	public static String CreateQuerySetAction_createQuerySet;
	public static String CreateQueryWizardPage_browseBtn;
	public static String CreateQueryWizardPage_createNewModelQuery;
	public static String CreateQueryWizardPage_description;
	public static String CreateQueryWizardPage_multiValuedReturnType;
	public static String CreateQueryWizardPage_parentQuerySet;
	public static String CreateQueryWizardPage_queryName;
	public static String CreateQueryWizardPage_queryType;
	public static String CreateQueryWizardPage_returnType;
	public static String CreateQueryWizardPage_scope;
	public static String ModelQueryView_description;
	public static String ModelQueryView_location;
	public static String ModelQueryView_name;
	public static String NewClassCreationWizard_failedToCreateJavaClass;
	public static String NewClassCreationWizard_failedToCreateJavaModelQueryClass;
	public static String QueryExecutionView_0;
	public static String QueryExecutionView_1;
	public static String QueryExecutionView_classpathWarning;
	public static String QueryExecutionView_errorInBundleClasspath;
	public static String QueryExecutionView_execEnvNotAvailable;
	public static String QueryExecutionView_execEnvError;
	public static String QueryExecutionView_Context;
	public static String QueryExecutionView_DisplayResultIn;
	public static String QueryExecutionView_dragAndDropHint;
	public static String QueryExecutionView_ErrorExecutingQuery;
	public static String QueryExecutionView_ExecuteButton;
	public static String QueryExecutionView_ExecuteGroup;
	public static String QueryExecutionView_NoQueryDisplayer;
	public static String QueryExecutionView_NoQuerySelected;
	public static String QueryExecutionView_NullQueryResult;
	public static String QueryExecutionView_notImplementedYet;
	public static String QueryExecutionView_Parameters;
	public static String QueryExecutionView_Query;
	public static String QueryExecutionView_QueryException;
	public static String QueryExecutionView_QueryReturnedNull;
	public static String QueryExecutionView_refreshing;
	public static String QueryExecutionView_SelectQueryToExecute;
	public static String QuerySelectionDialog_createQuery;
	public static String QuerySelectionDialog_refreshQuerySetsJob;
	public static String QuerySelectionDialog_selectQuery;
	public static String refreshingQuerySetsView;
	static {
		// initialize resource bundle
		NLS.initializeMessages(Messages.BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		// This method must not be instantiated
	}
}
