/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *    Nicolas Bros (Mia-Software) - Bug 337402 - [Discovery Workflow] refactoring
 *******************************************************************************/
package org.eclipse.modisco.workflow.ui.internal;

import org.eclipse.osgi.util.NLS;

/**
 * @author gdupe
 *
 */
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.modisco.workflow.ui.internal.messages"; //$NON-NLS-1$

	public static String AdditionalButtonsComposite_down;
	public static String AdditionalButtonsComposite_load;
	public static String AdditionalButtonsComposite_remove;
	public static String AdditionalButtonsComposite_up;
	public static String ContextualMenuInWorkflowTable_Down;
	public static String ContextualMenuInWorkflowTable_Load;
	public static String ContextualMenuInWorkflowTable_Remove;
	public static String ContextualMenuInWorkflowTable_Up;
	public static String LaunchersPage_launchersList;
	public static String LaunchersPage_message;
	public static String LaunchersPage_messageExtended;
	public static String LaunchersPage_selectLaunchConfig;
	public static String LaunchersPage_wizardDescription;
	public static String WizardToSelectLaunchers_selectLaunch;
	public static String WorkflowTab_basicLabel;
	public static String WorkflowTab_name;

	static {
		// initialize resource bundle
		NLS.initializeMessages(Messages.BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		// Empty
	}
}
