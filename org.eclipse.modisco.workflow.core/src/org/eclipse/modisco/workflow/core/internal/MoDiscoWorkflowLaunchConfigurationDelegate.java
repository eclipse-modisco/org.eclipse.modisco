/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Payneau (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 337402 - [Discovery Workflow] refactoring
 *******************************************************************************/
package org.eclipse.modisco.workflow.core.internal;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.modisco.workflow.core.Constants;
import org.eclipse.modisco.workflow.core.WorkflowExecution;
import org.eclipse.modisco.workflow.core.internal.engine.EngineFactory;

/**
 * This class defines the delegate to launch a configuration of MoDiscoWorkflow
 * type.
 *
 * @author Nicolas Payneau
 */
public class MoDiscoWorkflowLaunchConfigurationDelegate implements ILaunchConfigurationDelegate {

	/**
	 * To launch a MoDiscoWorkflow configuration
	 *
	 * @param configuration
	 *            The configuration of MoDiscoWorkflow
	 * @param mode
	 *            The mode
	 * @param launch
	 * @param monitor
	 * @see org.eclipse.debug.core.model.ILaunchConfigurationDelegate#launch(org.
	 *      eclipse.debug.core.ILaunchConfiguration, java.lang.String,
	 *      org.eclipse.debug.core.ILaunch,
	 *      org.eclipse.core.runtime.IProgressMonitor)
	 */
	public void launch(final ILaunchConfiguration configuration, final String mode,
			final ILaunch launch, final IProgressMonitor monitor) throws CoreException {
		String idWorkflow = configuration.getAttribute(Constants.WORKFLOW_ENGINE,
				Constants.DEFAULT_ENGINE_ID);
		WorkflowExecution workflowExecution = EngineFactory.INSTANCE.getEngine(idWorkflow);

		workflowExecution.launchWorkflow(configuration, mode, launch, monitor);
	}
}
