/**
 * Copyright (c) 2010, 2011 Mia-Software and others.
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
package org.eclipse.modisco.workflow.core.internal.defaultengine;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.modisco.workflow.core.WorkflowModel;

public interface WorkflowController {

	/**
	 * To validate the workflow model, for problems like a recursion in the
	 * launch sequence
	 *
	 * @param workflowModel
	 *            the model to validate
	 * @return <code>null</code> if valid, or a message to indicate the error
	 */
	public String validate(WorkflowModel workflowModel);

	/**
	 * Check if the launch configuration identified by its name (rootConfigName)
	 * could be launched directly or indirectly from the current launch
	 * configuration (launch)
	 *
	 * @param rootConfigName
	 *            name of a launch configuration to test for recursion
	 * @param launch
	 *            the launch configuration to check
	 * @return <code>true</code> if recursion occurs, <code>false</code>
	 *         otherwise
	 */
	public boolean hasPotentialRecursion(String rootConfigName, ILaunchConfiguration launch);
}
