/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software and others.
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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.modisco.infra.browser.custom.editor.Messages;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

/**
 * A dialog to set the value of a customized icon feature with a resource
 * selection dialog.
 */
public class IconFeatureDialog extends EditFeatureValueDialog {

	private final Shell fParentShell;

	public IconFeatureDialog(final Shell parentShell, final boolean withCondition,
			final boolean withDefault, final List<String> availableQuerySets,
			final List<Class<?>> expectedReturnTypes, final EClass customizedMetaclass) {
		super(parentShell, withCondition, withDefault, availableQuerySets, expectedReturnTypes,
				customizedMetaclass);
		this.fParentShell = parentShell;
	}

	private Text text;

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
		button.setText(Messages.CustomizationEditor_btnOpenElementSelectionDialogText);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				IFile selectedFile = openIconSelectionDialog(getShell(), getText().getText());
				if (selectedFile != null) {
					getText().setText(selectedFile.getFullPath().toString());
				}
			}
		});
	}

	protected IFile openIconSelectionDialog(final Shell shell, final String initialText) {
		final ElementTreeSelectionDialog iconSelectionDialog = new ElementTreeSelectionDialog(
				shell, new WorkbenchLabelProvider(), new WorkbenchContentProvider());
		iconSelectionDialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
		iconSelectionDialog.setAllowMultiple(false);
		iconSelectionDialog.setMessage(Messages.CustomizationEditor_selectAnIcon);
		iconSelectionDialog.setTitle(Messages.CustomizationEditor_iconSelection);
		final IResource resource = ResourcesPlugin.getWorkspace().getRoot().findMember(initialText);
		if (resource != null) {
			iconSelectionDialog.setInitialSelection(resource);
		}
		final int result = iconSelectionDialog.open();
		if (result == Window.OK) {
			final Object firstResult = iconSelectionDialog.getFirstResult();
			if (firstResult instanceof IFile) {
				final IFile file = (IFile) firstResult;
				return file;
			}
			MessageDialog.openWarning(this.fParentShell,
					Messages.CustomizationEditor_invalidSelection,
					Messages.CustomizationEditor_notFileSelected);
		}
		return null;
	}

	@Override
	protected void okPressed() {
		if (this.text != null) {
			setStaticValue(this.text.getText());
		}
		super.okPressed();
	}

	public Text getText() {
		return this.text;
	}
}
