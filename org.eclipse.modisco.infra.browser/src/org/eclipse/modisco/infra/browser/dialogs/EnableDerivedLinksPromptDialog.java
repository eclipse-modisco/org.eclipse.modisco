/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.dialogs;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.modisco.infra.browser.Messages;
import org.eclipse.modisco.infra.browser.MoDiscoBrowserPlugin;
import org.eclipse.modisco.infra.browser.preferences.PreferenceConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

public final class EnableDerivedLinksPromptDialog extends MessageDialog {

	private Button cbRememberSetting;
	private boolean rememberSetting;

	private EnableDerivedLinksPromptDialog(final Shell parentShell, final String dialogTitle,
			final Image dialogTitleImage, final String dialogMessage, final int dialogImageType,
			final String[] dialogButtonLabels, final int defaultIndex) {
		super(parentShell, dialogTitle, dialogTitleImage, dialogMessage, dialogImageType,
				dialogButtonLabels, defaultIndex);
	}

	@Override
	protected Control createCustomArea(final Composite parent) {
		this.cbRememberSetting = new Button(parent, SWT.CHECK);
		this.cbRememberSetting.setText(Messages.EnableDerivedLinksPromptDialog_rememberDecision);
		return this.cbRememberSetting;
	}

	@Override
	public boolean close() {
		this.rememberSetting = this.cbRememberSetting.getSelection();
		return super.close();
	}

	private boolean isRememberSetting() {
		return this.rememberSetting;
	}

	public static boolean open(final Shell parent) {
		String message = Messages.EnableDerivedLinksPromptDialog_enableDerivedLinksLong;
		EnableDerivedLinksPromptDialog dialog = new EnableDerivedLinksPromptDialog(parent,
				Messages.EnableDerivedLinksPromptDialog_enableDerivedLinks, null, message,
				MessageDialog.QUESTION, new String[] { IDialogConstants.YES_LABEL,
						IDialogConstants.NO_LABEL }, 0);
		dialog.setShellStyle(dialog.getShellStyle() | SWT.SHEET);
		int result = dialog.open();
		final int yesButton = 0;
		final int noButton = 1;
		if (dialog.isRememberSetting()) {
			IPreferenceStore preferenceStore = MoDiscoBrowserPlugin.getPlugin()
					.getPreferenceStore();
			if (result == yesButton) {
				preferenceStore.setValue(
						PreferenceConstants.P_BROWSER_ENABLE_DERIVED_LINKS_SETTING,
						PreferenceConstants.P_BROWSER_ENABLE_DERIVED_LINKS_ALWAYS);
			} else if (result == noButton) {
				preferenceStore.setValue(
						PreferenceConstants.P_BROWSER_ENABLE_DERIVED_LINKS_SETTING,
						PreferenceConstants.P_BROWSER_ENABLE_DERIVED_LINKS_NEVER);
			}
		}
		return result == 0;
	}
}
