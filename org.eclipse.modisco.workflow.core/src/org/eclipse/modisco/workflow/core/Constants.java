/**
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Payneau (Mia-Software) - initial API and implementation
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 337402 - [Discovery Workflow] refactoring
 */
package org.eclipse.modisco.workflow.core;

public final class Constants {

	private Constants() {
		// Must not be instantiated
	}

	/**
	 * Attribute of a launch configuration to serialize the elements of a
	 * workflow.
	 */
	public static final String SERIALIZED_WORKFLOW = "serializedWorkflow"; //$NON-NLS-1$
	public static final int SERIALIZED_WORKFLOW_ELEMENTS_IN_TUPLES = 3;

	public static final String LAUNCH_CONFIGURATION_TYPE = "org.eclipse.modisco.workflow.launchType"; //$NON-NLS-1$
	public static final String EXTENSION_POINT_WORKFLOW_ENGINE = "org.eclipse.modisco.workflow.engine"; //$NON-NLS-1$

	public static final String EXTENSION_POINT_ELEMENT_WORKFLOW_CORE = "workflowCore"; //$NON-NLS-1$
	public static final String EXTENSION_POINT_ELEMENT_WORKFLOW_EXECUTION = "workflowExecution"; //$NON-NLS-1$

	public static final String WORKFLOW_ENGINE = "workflowEngine"; //$NON-NLS-1$
	public static final String DEFAULT_ENGINE_ID = "org.eclipse.modisco.workflow.defaultengine"; //$NON-NLS-1$
	public static final String MODISCO_WORKFLOW_FILE_EXTENSION = "modiscoworkflow"; //$NON-NLS-1$
}
