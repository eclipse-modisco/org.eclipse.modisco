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
package org.eclipse.modisco.workflow.ui.internal;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

/**
 *
 * @author Nicolas Payneau
 */
public class MoDiscoWorkflowTabGroup extends AbstractLaunchConfigurationTabGroup {
	private WorkflowTab workflowTab;
	private CommonTab commonTab;

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.debug.ui.ILaunchConfigurationTabGroup#createTabs(org.eclipse
	 * .debug.ui.ILaunchConfigurationDialog, java.lang.String)
	 */
	public void createTabs(final ILaunchConfigurationDialog dialog, final String mode) {
		this.workflowTab = new WorkflowTab();
		this.commonTab = new CommonTab();
		setTabs(new ILaunchConfigurationTab[] { this.workflowTab, this.commonTab });
	}

}
