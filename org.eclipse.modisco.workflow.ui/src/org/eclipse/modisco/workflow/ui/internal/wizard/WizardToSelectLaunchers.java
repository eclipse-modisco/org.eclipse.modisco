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
package org.eclipse.modisco.workflow.ui.internal.wizard;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.modisco.facet.util.core.Logger;
import org.eclipse.modisco.workflow.core.Constants;
import org.eclipse.modisco.workflow.core.WorkflowModel;
import org.eclipse.modisco.workflow.modiscoworkflow.Element;
import org.eclipse.modisco.workflow.modiscoworkflow.ModiscoworkflowFactory;
import org.eclipse.modisco.workflow.ui.internal.Activator;
import org.eclipse.modisco.workflow.ui.internal.Messages;
import org.eclipse.swt.widgets.TableItem;

//TODO: replace by a TitleAreaDialog?
public class WizardToSelectLaunchers extends Wizard {

	private LaunchersPage loadLauncher;
	private final WorkflowModel workflowModel;

	/**
	 * Class constructor
	 *
	 * @param controllerWorkflow
	 *            The controller managing the workflow
	 */
	public WizardToSelectLaunchers(final WorkflowModel workflowModelParam) {
		setWindowTitle(Messages.WizardToSelectLaunchers_selectLaunch);
		this.workflowModel = workflowModelParam;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public final void addPages() {
		this.loadLauncher = new LaunchersPage(this.workflowModel.getName());
		addPage(this.loadLauncher);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		try {
			for (TableItem item : this.loadLauncher.getItemsSelected()) {
				ILaunchConfiguration launchConfiguration = this.loadLauncher
						.getLaunchConfigurationMap().get(item);
				Element element;
				final String type = launchConfiguration.getType().getIdentifier();
				if (type.equals(Constants.LAUNCH_CONFIGURATION_TYPE)) {
					element = ModiscoworkflowFactory.eINSTANCE.createWorkflow();
				} else {
					element = ModiscoworkflowFactory.eINSTANCE.createWork();
				}
				element.setName(item.getText());
				element.setType(type);
				this.workflowModel.addElement(element);
			}
		} catch (CoreException e) {
			Logger.logError(e, Activator.getDefault());
		}
		return true;
	}

}
