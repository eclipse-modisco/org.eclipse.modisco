/*******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Payneau (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmt.modisco.workflow.actions;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.gmt.modisco.workflow.Constants;
import org.eclipse.gmt.modisco.workflow.WorkflowExecution;
import org.eclipse.gmt.modisco.workflow.internal.engine.EngineFactory;

/**
 * This class defines the delegate to launch a configuration of MoDiscoWorkflow type.
 * 
 * @author Nicolas Payneau
 * @deprecated replaced by org.eclipse.modisco.workflow, cf
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337942
 */
@Deprecated
public class MoDiscoWorkflowDelegate implements ILaunchConfigurationDelegate {

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
	 *      org.eclipse.debug.core.ILaunch, org.eclipse.core.runtime.IProgressMonitor)
	 */
	public void launch(final ILaunchConfiguration configuration, final String mode,
			final ILaunch launch, final IProgressMonitor monitor) throws CoreException {
		String idWorkflow = configuration.getAttribute(Constants.idWorkflow,
				Constants.idMinimaliste);
		WorkflowExecution workflowExecution = EngineFactory.INSTANCE.getEngine(idWorkflow);

		workflowExecution.launchWorkflow(configuration, mode, launch, monitor);
	}
}
