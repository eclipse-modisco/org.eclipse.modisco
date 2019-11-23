/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *
 *******************************************************************************/

package org.eclipse.gmt.modisco.infra.browser.custom.ui.wizards;

import org.eclipse.core.runtime.IPath;
import org.eclipse.gmt.modisco.infra.browser.custom.ui.Messages;
import org.eclipse.gmt.modisco.infra.common.core.internal.utils.ProjectUtils;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

public class NewCustomizationFilePage extends WizardNewFileCreationPage {

	public NewCustomizationFilePage(final IStructuredSelection selection) {
		super(Messages.NewCustomizationFilePage_browserCustomization, selection);
		setTitle(Messages.NewCustomizationFilePage_browserCustomization);
		setDescription(Messages.NewCustomizationFilePage_createsBrowserCustomization);
		setFileExtension("uiCustom"); //$NON-NLS-1$
	}

	@Override
	protected boolean validatePage() {
		boolean valid = super.validatePage();
		if (valid) {
			IPath containerFullPath = getContainerFullPath();
			if (!ProjectUtils.isInMoDiscoProject(containerFullPath)) {
				setMessage(
						Messages.NewCustomizationFilePage_customizationInNonMoDiscoProject,
						IMessageProvider.WARNING);
			}
		}
		return valid;
	}
}
