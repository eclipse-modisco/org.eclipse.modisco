/**
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Payneau (Mia-Software) - initial API and implementation
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 337402 - [Discovery Workflow] refactoring
 */
package org.eclipse.modisco.workflow.core.internal.defaultengine;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.workflow.core.Constants;
import org.eclipse.modisco.workflow.core.WorkflowModel;
import org.eclipse.modisco.workflow.core.internal.Activator;
import org.eclipse.modisco.workflow.core.internal.Messages;
import org.eclipse.modisco.workflow.modiscoworkflow.Element;
import org.eclipse.modisco.workflow.modiscoworkflow.Workflow;

public class WorkflowControllerImpl implements WorkflowController {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.debug.ui.workflow.WorkflowController#validate(org.eclipse
	 * .debug.ui.workflow.WorkflowModel)
	 */
	public String validate(final WorkflowModel workflowModel) {
		String message = null;
		// check existence of launch configuration (may happens after a rename)
		String unknownLaunch = verifyExistence(workflowModel.getAllElements());
		if (unknownLaunch != null) {
			message = Messages.WorkflowControllerImpl_launchConfigurationNotFound + unknownLaunch;
		}
		// check recursion
		if (verifyLoops(workflowModel.getAllElements(), workflowModel.getName())) {
			message = Messages.WorkflowControllerImpl_recursionError;
		}
		return message;
	}

	/**
	 * @param allElements
	 * @return
	 */
	private static String verifyExistence(final List<Element> allElements) {
		String unknownLaunch = null;
		for (Element element : allElements) {
			ILaunchConfiguration launch = Utils.getLaunchConfigurationFromName(element.getName());
			if (launch == null) {
				unknownLaunch = element.getName();
				break;
			}
		}
		return unknownLaunch;
	}

	/**
	 * Allows to verify the loop in the Workflow
	 *
	 * @param elements
	 *            All elements contained in Workflow
	 * @param name
	 *            The name of root
	 * @return True if Workflow contains a loop otherwise false
	 */
	private boolean verifyLoops(final List<Element> elements, final String name) {
		boolean loop = false;
		for (Element element : elements) {
			if (element instanceof Workflow) {
				if (element.getName().equals(name)) {
					loop = true;
					break;
				}
				WorkflowModel workflowModel = new WorkflowModelImpl();
				ILaunchConfiguration launch = Utils.getLaunchConfigurationFromName(element
						.getName());
				if (launch != null) {
					workflowModel.initialize(launch);
					loop = verifyLoops(workflowModel.getAllElements(), name);
				}
			}
		}
		return loop;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.debug.ui.workflow.WorkflowController#hasPotentialRecursion
	 * (java.lang.String, org.eclipse.debug.core.ILaunchConfiguration)
	 */
	public boolean hasPotentialRecursion(final String rootConfigName,
			final ILaunchConfiguration launch) {
		boolean result = false;
		// basic test with the name
		if (launch.getName().equals(rootConfigName)) {
			result = true;
		} else {
			/*
			 * test the type of launch config, then if it is workflow we will
			 * test inner elements (recurse)
			 */
			try {
				String type = launch.getType().getIdentifier();
				if (type.equals(Constants.LAUNCH_CONFIGURATION_TYPE)) {
					WorkflowModel workflowModel = new WorkflowModelImpl();
					workflowModel.initialize(launch);
					result = verifyLoops(workflowModel.getAllElements(), rootConfigName);
				}
			} catch (CoreException e) {
				MoDiscoLogger.logError(e, Activator.getDefault());
			}
		}
		return result;
	}

}
