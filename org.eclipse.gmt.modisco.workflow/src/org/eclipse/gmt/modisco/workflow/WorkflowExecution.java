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
package org.eclipse.gmt.modisco.workflow;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;

/**
 * API to launch the workflow
 * 
 * @author Nicolas Payneau
 * @deprecated replaced by org.eclipse.modisco.workflow, cf
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337942
 */
@Deprecated
public interface WorkflowExecution {

	/**
	 * Allows to launch a workflow
	 * 
	 * @param configuration
	 *            LaunchConfiguration of MoDiscoWorkflow
	 * @param mode
	 *            Launch mode
	 * @param launch
	 *            The launcher
	 * @param monitor
	 *            The progress monitor
	 * @throws CoreException
	 *             if the configuration is invalid
	 */
	public void launchWorkflow(ILaunchConfiguration configuration, String mode, ILaunch launch,
			IProgressMonitor monitor) throws CoreException;

}
