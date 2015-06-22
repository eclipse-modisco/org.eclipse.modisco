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
package org.eclipse.gmt.modisco.workflow.mwe.impl;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.workflow.WorkflowExecution;
import org.eclipse.gmt.modisco.workflow.WorkflowModel;
import org.eclipse.gmt.modisco.workflow.modiscoworkflow.Element;
import org.eclipse.gmt.modisco.workflow.mwe.Activator;

/**
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public class WorkflowExecutionImpl implements WorkflowExecution {

	private final boolean debug = false;
	
	public void launchWorkflow(final ILaunchConfiguration configuration, final String mode,
			final ILaunch launch, final IProgressMonitor monitor) {
		WorkflowModel workflowImpl = new WorkflowModelImpl();
		workflowImpl.initialization(configuration);
		monitor.worked(1);
		
		for (Element modiscoWork : workflowImpl.getAllElements()) {
			if (monitor.isCanceled() && launch.canTerminate()) {
				try {
					launch.terminate();
				} catch (DebugException e) {
					MoDiscoLogger.logError(e, Activator.getDefault());
				}
			}
			ILaunchConfiguration conf = getLaunchConfigurationFromName(modiscoWork
						.getName());
				ILaunchConfigurationWorkingCopy config = null;
				try {
					config = conf.getWorkingCopy();
					if (this.debug) {
						MoDiscoLogger.logInfo("Launching " + modiscoWork.getName() + " of type " + modiscoWork.getType(), Activator.getDefault());
					}
					monitor.subTask(modiscoWork.getName() + " of type " + modiscoWork.getType());
					ILaunch launchChild = config.launch(mode, new SubProgressMonitor(monitor, 1));
					if (this.debug) {
						MoDiscoLogger.logInfo("Launch " + modiscoWork.getName() + " has been launched.", Activator.getDefault());
					}
					IProcess[] processes = launchChild.getProcesses();
					for (IProcess process : processes) {
						if (this.debug) {
							MoDiscoLogger.logInfo("process " + process.getLabel() + " has ended.", Activator.getDefault());
						}
						while (!process.isTerminated()) {
							Thread.yield();
							final int sleepDuration = 10;
							Thread.sleep(sleepDuration);
						}
						if (this.debug) {
							MoDiscoLogger.logInfo("process " + process.getLabel() + " has ended.", Activator.getDefault());
						}
					}
					if (this.debug) {
						MoDiscoLogger.logInfo("Launch " + modiscoWork.getName() + " has ended.", Activator.getDefault());
					}
					monitor.worked(1);
				} catch (CoreException e) {
					MoDiscoLogger.logError(e, Activator.getDefault());
				} catch (InterruptedException e) {
					MoDiscoLogger.logError(e, Activator.getDefault());
				}
		}

	}

	/**
	 * Allows to find the good instance of LaunchCOnfiguration corresponding at
	 * path
	 * 
	 * @param configName
	 *            Name of LaunchConfiguration
	 * @return An instance of launchConfiguration corresponding at path
	 */
	private ILaunchConfiguration getLaunchConfigurationFromName(
			final String configName) {
		ILaunchConfiguration configuration = null;
		try {
			for (ILaunchConfiguration config : DebugPlugin.getDefault()
					.getLaunchManager().getLaunchConfigurations()) {
				if (config.getName().equals(configName)) {
					configuration = config;
					break;
				}
			}
		} catch (CoreException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
		return configuration;
	}
}
