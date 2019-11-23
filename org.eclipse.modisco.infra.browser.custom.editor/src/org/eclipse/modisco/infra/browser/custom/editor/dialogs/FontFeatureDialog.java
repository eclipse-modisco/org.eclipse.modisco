/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.custom.editor.dialogs;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.modisco.infra.browser.custom.editor.Messages;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FontDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/** A dialog to set the value of a customized font feature with a font dialog. */
public class FontFeatureDialog extends EditFeatureValueDialog {

	private Text text;
	private final Shell fParentShell;

	public FontFeatureDialog(final Shell parentShell, final boolean withCondition,
			final boolean withDefault, final List<String> availableQuerySets,
			final List<Class<?>> expectedReturnTypes, final EClass customizedMetaclass) {
		super(parentShell, withCondition, withDefault, availableQuerySets, expectedReturnTypes,
				customizedMetaclass);
		this.fParentShell = parentShell;
	}

	@Override
	protected void createValueEditor(final Composite parent) {
		final Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		this.text = new Text(composite, SWT.BORDER);
		this.text.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		if (getInitialStaticValue() != null) {
			this.text.setText(getInitialStaticValue());
		}

		final Button button = new Button(composite, SWT.PUSH);
		button.setText(Messages.CustomizationEditor_btnOpenFontDialogText);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				final FontDialog fontDialog = new FontDialog(FontFeatureDialog.this.fParentShell);
				final int fontHeight = 10;
				fontDialog.setFontList(new FontData[] { new FontData(getText().getText(),
						fontHeight, 0) });
				final FontData font = fontDialog.open();
				if (font != null) {
					getText().setText(font.getName());
				}
			}
		});
	}

	@Override
	protected void okPressed() {
		setStaticValue(this.text.getText());
		super.okPressed();
	}

	public Text getText() {
		return this.text;
	}

}
