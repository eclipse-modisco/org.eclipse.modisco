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
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/** A dialog to set the value of a customized label feature with a text field. */
public class TextFeatureDialog extends EditFeatureValueDialog {

	private final String fText;

	public TextFeatureDialog(final Shell parentShell, final boolean withCondition,
			final boolean withDefault, final List<String> availableQuerySets,
			final List<Class<?>> expectedReturnTypes, final EClass customizedMetaclass,
			final String text) {
		super(parentShell, withCondition, withDefault, availableQuerySets, expectedReturnTypes,
				customizedMetaclass);
		this.fText = text;
	}

	private Text text;

	@Override
	protected void createValueEditor(final Composite parent) {
		final Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		final Label label = new Label(composite, SWT.NONE);
		label.setText(this.fText);
		this.text = new Text(composite, SWT.BORDER);
		this.text.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		if (getInitialStaticValue() != null) {
			this.text.setText(getInitialStaticValue());
		}
	}

	@Override
	protected void okPressed() {
		setStaticValue(this.text.getText());
		super.okPressed();
	}
}
