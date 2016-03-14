/**
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 337402 - [Discovery Workflow] refactoring
 */
package org.eclipse.modisco.workflow.core.internal.engine;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.workflow.core.Constants;
import org.eclipse.modisco.workflow.core.WorkflowExecution;
import org.eclipse.modisco.workflow.core.internal.Activator;
import org.eclipse.modisco.workflow.core.internal.defaultengine.WorkflowExecutionImpl;

public class EngineFactoryImpl implements EngineFactory {

	private Map<String, WorkflowExecution> workflowEngines;

	public WorkflowExecution getEngine(final String engineId) {
		return new WorkflowExecutionImpl();
	}

	private final Map<String, WorkflowExecution> getWorkflowEngines() {
		if (this.workflowEngines == null) {
			this.workflowEngines = new HashMap<String, WorkflowExecution>();
			initializeWorkflowEngines();
		}
		return this.workflowEngines;
	}

	/**
	 * Load the plug-in to refer the point extension
	 * Constant.nameExtensionPointWorkflow
	 */
	private void initializeWorkflowEngines() {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IExtensionPoint point = registry
				.getExtensionPoint(Constants.EXTENSION_POINT_WORKFLOW_ENGINE);

		for (IExtension extension : point.getExtensions()) {
			for (IConfigurationElement element : extension.getConfigurationElements()) {
				// We take into account the first extension
				if (element.getName().equals(Constants.EXTENSION_POINT_ELEMENT_WORKFLOW_EXECUTION)) {
					try {
						getWorkflowEngines().put(extension.getUniqueIdentifier(),
								(WorkflowExecution) element.createExecutableExtension("class")); //$NON-NLS-1$
					} catch (Throwable e) {
						MoDiscoLogger.logError(e, Activator.getDefault());
					}
				}
			}
		}
	}
}
