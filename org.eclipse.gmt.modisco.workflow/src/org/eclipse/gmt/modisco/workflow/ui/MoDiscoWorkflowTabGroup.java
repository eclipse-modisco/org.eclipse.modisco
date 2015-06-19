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
package org.eclipse.gmt.modisco.workflow.ui;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.gmt.modisco.workflow.internal.ui.MoDiscoExportTab;
import org.eclipse.gmt.modisco.workflow.internal.ui.WorkflowTab;

/**
 * 
 * @author Nicolas Payneau
 * @deprecated replaced by org.eclipse.modisco.workflow, cf
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337942
 */
@Deprecated
public class MoDiscoWorkflowTabGroup extends AbstractLaunchConfigurationTabGroup {
	private WorkflowTab workflowTab;
	private MoDiscoExportTab exportTab;
	private CommonTab commonTab;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTabGroup#createTabs(org.eclipse
	 * .debug.ui.ILaunchConfigurationDialog, java.lang.String)
	 */
	public void createTabs(final ILaunchConfigurationDialog dialog, final String mode) {
		this.workflowTab = new WorkflowTab();
		this.exportTab = new MoDiscoExportTab();
		this.commonTab = new CommonTab();
		setTabs(new ILaunchConfigurationTab[] { this.workflowTab, this.exportTab, this.commonTab });
	}

}
