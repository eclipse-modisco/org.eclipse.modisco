/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.uicore.internal.util;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.modisco.infra.browser.uicore.internal.Messages;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

/**
 * A dialog used to display query errors, that contains a checkbox to let the user prevent the
 * dialog from displaying again during the current session.
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public class QueryErrorDialog extends MessageDialog {

	private Button cbDontShowAnymore;
	private static boolean dontShowAnymore = false;

	public QueryErrorDialog(final Shell parentShell, final String dialogTitle,
			final Image dialogTitleImage, final String dialogMessage, final int dialogImageType,
			final String[] dialogButtonLabels, final int defaultIndex) {
		super(parentShell, dialogTitle, dialogTitleImage, dialogMessage, dialogImageType,
				dialogButtonLabels, defaultIndex);
	}

	@Override
	protected Control createCustomArea(final Composite parent) {
		this.cbDontShowAnymore = new Button(parent, SWT.CHECK);
		this.cbDontShowAnymore.setText(Messages.QueryErrorDialog_stopShowing);
		this.cbDontShowAnymore.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				QueryErrorDialog.dontShowAnymore = QueryErrorDialog.this.cbDontShowAnymore
						.getSelection();
			}
		});
		return this.cbDontShowAnymore;
	}

	public static void openError(final Shell parent, final String title, final String message) {
		if (QueryErrorDialog.dontShowAnymore) {
			return;
		}
		QueryErrorDialog dialog = new QueryErrorDialog(parent, title, null, message,
				MessageDialog.ERROR, new String[] { IDialogConstants.OK_LABEL }, 0);
		dialog.setShellStyle(dialog.getShellStyle() | SWT.SHEET);
		dialog.open();
	}
}
