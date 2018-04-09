/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Payneau (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 337402 - [Discovery Workflow] refactoring
 *******************************************************************************/
package org.eclipse.modisco.workflow.core;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;

/**
 * API to launch a workflow
 *
 * @author Nicolas Payneau
 */
public interface WorkflowExecution {

	/**
	 * Launch a workflow
	 *
	 * @param configuration
	 *            LaunchConfiguration of MoDiscoWorkflow
	 * @param mode
	 *            launch mode
	 * @param launch
	 *            the launcher
	 * @param monitor
	 *            a progress monitor
	 * @throws CoreException
	 *             if the configuration is invalid
	 */
	public void launchWorkflow(ILaunchConfiguration configuration, String mode, ILaunch launch,
			IProgressMonitor monitor) throws CoreException;

}
