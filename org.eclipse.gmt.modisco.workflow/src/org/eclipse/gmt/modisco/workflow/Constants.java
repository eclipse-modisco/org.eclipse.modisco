/*
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Payneau (Mia-Software) - initial API and implementation
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 */
package org.eclipse.gmt.modisco.workflow;

/**
 * @deprecated replaced by org.eclipse.modisco.workflow, cf
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337942
 */
@Deprecated
public final class Constants {

	private Constants() {
		// Must not be instantiated
	}

	private static final String ID = Activator.PLUGIN_ID;

	public static final String attributeWorkflowExecution = Constants.ID
			+ ".workflowIdWorkflowExecution"; //$NON-NLS-1$
	public static final String attributeWorkflowListMinimalist = Constants.ID
			+ ".MoDiscoListMinimalist"; //$NON-NLS-1$
	public static final String launchTypeOfWorkflow = Constants.ID + ".workflowtransformation"; //$NON-NLS-1$
	public static final String nameExtensionPointWorkflowEngine = Constants.ID + ".engine"; //$NON-NLS-1$
	public static final String workflowCoreExtensionPointWorkflow = "workflowCore"; //$NON-NLS-1$
	public static final String workflowExecutionExtensionPointWorkflow = "workflowExecution"; //$NON-NLS-1$
	public static final String idWorkflow = Constants.ID + "IdWorkflowExecution"; //$NON-NLS-1$
	public static final String idMinimaliste = Constants.ID + ".defaultengine"; //$NON-NLS-1$
	public static final String extensionMoDiscoWorkflow = "modiscoworkflow"; //$NON-NLS-1$

	public static final String pathIconLoad = "icons/loadWork.png"; //$NON-NLS-1$
	public static final String pathIconRemove = "icons/deleteWork.png"; //$NON-NLS-1$
	public static final String pathIconUp = "icons/upWork.png"; //$NON-NLS-1$
	public static final String pathIconDown = "icons/downWork.png"; //$NON-NLS-1$
	public static final String pathLittleImage = "icons/modiscoWorkflow.png"; //$NON-NLS-1$
	public static final String pathBigImage = "icons/bigModiscoWorkflow.png"; //$NON-NLS-1$
	public static final String pathExportImage = "icons/exportIcon.png"; //$NON-NLS-1$

}
