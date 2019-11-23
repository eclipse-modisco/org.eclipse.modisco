/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
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
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

/** A dialog to set the value of a customized boolean feature with a checkbox. */
public class BooleanFeatureDialog extends EditFeatureValueDialog {

	private final String fText;

	public BooleanFeatureDialog(final Shell parentShell, final boolean withCondition,
			final boolean withDefault, final List<String> availableQuerySets,
			final List<Class<?>> expectedReturnTypes, final EClass customizedMetaclass,
			final String text) {
		super(parentShell, withCondition, withDefault, availableQuerySets, expectedReturnTypes,
				customizedMetaclass);
		this.fText = text;
	}

	private Button button;

	@Override
	protected void createValueEditor(final Composite parent) {
		this.button = new Button(parent, SWT.CHECK);
		this.button.setText(this.fText);
		this.button.setSelection(Boolean.parseBoolean(getInitialStaticValue()));
	}

	@Override
	protected void okPressed() {
		setStaticValue(Boolean.toString(this.button.getSelection()));
		super.okPressed();
	}
}
