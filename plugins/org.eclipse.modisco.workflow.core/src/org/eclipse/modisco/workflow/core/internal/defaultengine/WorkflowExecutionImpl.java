/**
 * Copyright (c) 2010, 2019 Mia-Software and others.
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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.workflow.core.WorkflowExecution;
import org.eclipse.modisco.workflow.core.WorkflowModel;
import org.eclipse.modisco.workflow.core.internal.Activator;
import org.eclipse.modisco.workflow.core.internal.Messages;
import org.eclipse.modisco.workflow.modiscoworkflow.Element;
import org.eclipse.osgi.util.NLS;

public class WorkflowExecutionImpl implements WorkflowExecution {

	public void launchWorkflow(final ILaunchConfiguration configuration, final String mode,
			final ILaunch launch, final IProgressMonitor monitor) throws CoreException {
		WorkflowModel workflowModel = new WorkflowModelImpl();
		workflowModel.initialize(configuration);
		monitor.worked(1);
		WorkflowController workflowController = new WorkflowControllerImpl();
		String errorMessage = workflowController.validate(workflowModel);
		if (errorMessage != null) {
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, errorMessage);
			throw new CoreException(status);
		}
		monitor.worked(1);
		launchWorkflow(workflowModel, mode, launch, monitor);
	}

	/**
	 * To manage sequence of execution, even in background, we will not use the
	 * method DebugUIPlugin.launchInForeground even if the expected behaviour
	 * seems similar. Specially for the specific case of java application
	 * launch, which has not been correctly managed (use of sub-process).
	 */
	public static void launchWorkflow(final WorkflowModel workflowModel, final String mode,
			final ILaunch launch, final IProgressMonitor monitor) {
		final boolean parallelExecution = false;
		final List<ILaunch> launchResults = new ArrayList<ILaunch>();
		for (Element element : workflowModel.getAllElements()) {
			if (monitor.isCanceled() && launch.canTerminate()) {
				try {
					launch.terminate();
					for (ILaunch subLaunch : launchResults) {
						if (subLaunch.canTerminate()) {
							subLaunch.terminate();
						}
					}
				} catch (DebugException e) {
					MoDiscoLogger.logError(e, Activator.getDefault());
				}
			}
			ILaunchConfiguration conf = Utils.getLaunchConfigurationFromName(element.getName());
			ILaunchConfigurationWorkingCopy config = null;
			try {
				config = conf.getWorkingCopy();
				monitor.subTask(NLS.bind(Messages.WorkflowExecutionImpl_elementOfType,
						element.getName(), element.getType()));
				ILaunch launchChild = config.launch(mode, new SubProgressMonitor(monitor, 1));
				if (parallelExecution) {
					launchResults.add(launchChild);
				} else {
					IProcess[] processes = launchChild.getProcesses();
					for (IProcess process : processes) {
						while (!process.isTerminated()) {
							Thread.yield();
							final int sleepDuration = 10;
							Thread.sleep(sleepDuration);
						}
					}
				}
				monitor.worked(1);
			} catch (CoreException e) {
				MoDiscoLogger.logError(e, Activator.getDefault());
			} catch (InterruptedException e) {
				MoDiscoLogger.logError(e, Activator.getDefault());
			}

		}
	}

}
