/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *******************************************************************************/
package org.eclipse.modisco.java.discoverer.ui.internal;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.modisco.facet.widgets.celleditors.AbstractCellEditorComposite;
import org.eclipse.modisco.java.discoverer.ElementsToAnalyze;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class JavaElementsToAnalyzeComposite extends
		AbstractCellEditorComposite<ElementsToAnalyze> {

	/** the control that is used to edit the contents of the cell */
	private final Button button;
	private Text text = null;
	private ElementsToAnalyze value;

	private final Composite parentControl;

	/** the original value of the cell */
	private String originalFieldValue;

	public JavaElementsToAnalyzeComposite(final Composite parent,
			final int style) {
		super(parent);
		this.parentControl = parent;

		setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
		GridLayout layout = new GridLayout(2, false);
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		layout.horizontalSpacing = 0;
		setLayout(layout);

		this.text = new Text(this, style);
		this.text.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		this.text.setEditable(false);
		this.button = new Button(this, SWT.PUSH);
		this.button.setText("..."); //$NON-NLS-1$
		GridData data = new GridData(SWT.FILL, SWT.FILL, false, true);
		this.button.setLayoutData(data);

		this.button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				ElementsToAnalyze elementsToAnalyze = getValue();
				final Shell shell = JavaElementsToAnalyzeComposite.this.getParentControl().getShell();
				if (elementsToAnalyze != null) {
					final JavaElementsToAnalyzeDialog dialog = new JavaElementsToAnalyzeDialog(
							shell, getValue()) {
						@Override
						protected void okPressed() {
							setValue(getElementsToAnalyze());
							fireChangedLocal();
							commit();
							super.okPressed();
						}
					};
					dialog.open();
				} else {
					// TODO: externalize strings
					MessageDialog.openWarning(shell, "No source", "No Java elements to analyze."); //$NON-NLS-1$//$NON-NLS-2$
				}

			}
		});

		this.button.forceFocus();
	}

	// to avoid the "synthetic access" warning
	protected void fireChangedLocal() {
		super.fireChanged();
	}

	protected void commit() {
		fireCommit();
	}

	public void setValue(final ElementsToAnalyze value) {
		this.value = value;
		if (value == null) {
			this.text.setText(""); //$NON-NLS-1$
		} else {
			this.text.setText(value.toString());
		}
	}

	public ElementsToAnalyze getValue() {
		return this.value;
	}

	public Button getButton() {
		return this.button;
	}

	public Composite getParentControl() {
		return this.parentControl;
	}

	public String getOriginalFieldValue() {
		return this.originalFieldValue;
	}

	protected Text getText() {
		return this.text;
	}
}
