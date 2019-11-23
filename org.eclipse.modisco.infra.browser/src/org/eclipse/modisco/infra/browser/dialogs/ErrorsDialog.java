/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.dialogs;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.modisco.infra.browser.Messages;
import org.eclipse.modisco.infra.browser.MoDiscoBrowserPlugin;
import org.eclipse.modisco.infra.browser.uicore.internal.util.ImageProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

/** A dialog to display a list of errors on EMF resources */
public class ErrorsDialog extends Dialog {
	private static final int INITIAL_WIDTH = 600;
	private static final int INITIAL_HEIGHT = 600;
	private final Diagnostic fDiagnostic;

	public ErrorsDialog(final Shell parentShell, final Diagnostic diagnostic) {
		super(parentShell);
		this.fDiagnostic = diagnostic;
	}

	@Override
	protected void configureShell(final Shell newShell) {
		super.configureShell(newShell);
		newShell.setText(Messages.ErrorsDialog_errors);
		newShell.setImage(ImageProvider.getInstance().getMoDiscoIcon());

		IDialogSettings dialogBoundsSettings = getDialogBoundsSettings();
		// initialize size if not yet saved (see Dialog#DIALOG_WIDTH)
		if (dialogBoundsSettings.get("DIALOG_WIDTH") == null) { //$NON-NLS-1$
			Rectangle parent = getParentShell().getBounds();
			// centered
			newShell.setBounds(parent.x + parent.width / 2 - ErrorsDialog.INITIAL_WIDTH / 2,
					parent.y + parent.height / 2 - ErrorsDialog.INITIAL_HEIGHT / 2,
					ErrorsDialog.INITIAL_WIDTH, ErrorsDialog.INITIAL_HEIGHT);
		}
	}

	@Override
	protected Control createDialogArea(final Composite parent) {
		final Composite composite = (Composite) super.createDialogArea(parent);

		SashForm sashForm = new SashForm(composite, SWT.NONE);
		sashForm.setOrientation(SWT.VERTICAL);
		sashForm.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		final TreeViewer treeViewer = new TreeViewer(sashForm, SWT.BORDER | SWT.SINGLE
				| SWT.H_SCROLL | SWT.V_SCROLL);
		final GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
		treeViewer.getControl().setLayoutData(gridData);

		treeViewer.setContentProvider(new ITreeContentProvider() {
			public Object[] getElements(final Object inputElement) {
				return getChildren(inputElement);
			}

			public void inputChanged(final Viewer viewer, final Object oldInput,
					final Object newInput) {
				// nothing
			}

			public void dispose() {
				// nothing
			}

			public Object[] getChildren(final Object parentElement) {
				Diagnostic diagnostic = (Diagnostic) parentElement;
				return diagnostic.getChildren().toArray();
			}

			public Object getParent(final Object element) {
				return null;
			}

			public boolean hasChildren(final Object element) {
				Diagnostic diagnostic = (Diagnostic) element;
				return !diagnostic.getChildren().isEmpty();
			}
		});

		treeViewer.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(final Object element) {
				final Diagnostic diagnostic = (Diagnostic) element;
				return diagnostic.getMessage();
			}

			@Override
			public Image getImage(final Object element) {
				Diagnostic diagnostic = (Diagnostic) element;
				int severity = diagnostic.getSeverity();
				if (severity == Diagnostic.WARNING) {
					return PlatformUI.getWorkbench().getSharedImages()
							.getImage(ISharedImages.IMG_OBJS_WARN_TSK);
				} else if (severity == Diagnostic.ERROR) {
					return PlatformUI.getWorkbench().getSharedImages()
							.getImage(ISharedImages.IMG_OBJS_ERROR_TSK);
				} else if (severity == Diagnostic.INFO) {
					return PlatformUI.getWorkbench().getSharedImages()
							.getImage(ISharedImages.IMG_OBJS_INFO_TSK);
				}
				return null;
			}
		});
		treeViewer.setInput(this.fDiagnostic);

		final Text text = new Text(sashForm, SWT.BORDER | SWT.MULTI | SWT.READ_ONLY | SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.WRAP);
		final GridData gridData2 = new GridData(SWT.FILL, SWT.FILL, true, true);
		// gridData2.minimumWidth = ErrorsDialog.LIST_MIN_WIDTH;
		// gridData2.minimumHeight = ErrorsDialog.LIST_MIN_HEIGHT;
		text.setLayoutData(gridData2);
		sashForm.setWeights(new int[] { 2, 1 });

		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@SuppressWarnings("boxing")
			public void selectionChanged(final SelectionChangedEvent event) {
				final IStructuredSelection selection = (IStructuredSelection) event.getSelection();
				if (selection == null) {
					text.setText(""); //$NON-NLS-1$
					return;
				}
				final Diagnostic diagnostic = (Diagnostic) selection.getFirstElement();
				// final String str =
				// NLS.bind(Messages.ErrorsDialog_diagnosticMessage, new
				// Object[] {
				// diagnostic.getMessage(), diagnostic.getLocation(),
				// diagnostic.getLine(),
				// diagnostic.getColumn() });
				StringBuilder builder = new StringBuilder();
				// builder.append("source: " + diagnostic.getSource());
				if (diagnostic.getMessage() != null) {
					builder.append(diagnostic.getMessage());
				}
				text.setText(builder.toString());
			}
		});

		return composite;
	}

	@Override
	protected void createButtonsForButtonBar(final Composite parent) {
		// only an OK button
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	@Override
	protected IDialogSettings getDialogBoundsSettings() {
		final String sectionName = this.getClass().getName() + ".settings"; //$NON-NLS-1$
		IDialogSettings settings = MoDiscoBrowserPlugin.getPlugin().getDialogSettings();
		IDialogSettings section = settings.getSection(sectionName);
		if (section == null) {
			section = settings.addNewSection(sectionName);
		}
		return section;
	}
}
