/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 342832 - [Discovery] Values lost when clicking anywhere in the launch config dialog
 *    Nicolas Bros (Mia-Software) - Bug 344244 - illegal API use in org.eclipse.modisco.infra.discovery.ui.internal.celleditors.composite.TargetURIComposite
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.ui.internal.celleditors.composite;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.common.util.URI;
import org.eclipse.modisco.facet.widgets.celleditors.AbstractCellEditorComposite;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.discovery.ui.Activator;
import org.eclipse.modisco.infra.discovery.ui.Messages;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

public class TargetURIComposite extends AbstractCellEditorComposite<URI> {

	private static final String DIALOG_TITLE = Messages.TargetURIComposite_selectPlatformURI;
	private final Button button;
	private Text text = null;
	private final Composite fParentControl;

	public TargetURIComposite(final Composite parent, final int style) {
		super(parent);
		this.fParentControl = parent;

		GridLayout gd = new GridLayout(2, false);
		gd.marginHeight = 0;
		gd.marginWidth = 0;
		gd.horizontalSpacing = 0;
		setLayout(gd);

		this.text = new Text(this, style);
		this.text.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		this.button = new Button(this, SWT.PUSH);
		this.button.setText("..."); //$NON-NLS-1$
		GridData data = new GridData(SWT.FILL, SWT.FILL, false, true);
		this.button.setLayoutData(data);

		this.button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				URI originalUri = TargetURIComposite.this.getValue();
				IPath originalPath = null;
				if (originalUri != null) {
					try {
						if (originalUri.isPlatformResource()) {
							originalPath = new Path(originalUri.toPlatformString(true));
						}
					} catch (IllegalArgumentException iae) {
						MoDiscoLogger.logInfo(iae, Activator.getDefault());
					}
				}

				URI targetUri = null;
				IFile newFile = WorkspaceResourceDialog.openNewFile(parent.getShell(),
						TargetURIComposite.DIALOG_TITLE, TargetURIComposite.DIALOG_TITLE,
						originalPath, null);
				if (newFile != null) {
					targetUri = URI.createPlatformResourceURI(newFile.getFullPath().toString(),
							true);
					TargetURIComposite.this.setValue(targetUri);
				}
			}
		});

		// commit the cell editor when the mouse is clicked
		// anywhere outside the text field
		final Listener clickListener = new Listener() {
			public void handleEvent(final Event event) {
				if (event.widget instanceof Control) {
					Control control = (Control) event.widget;
					if (control.getShell() == TargetURIComposite.this.getParentControl().getShell()) {
						if (event.widget != TargetURIComposite.this.getButton()
								&& event.widget != TargetURIComposite.this.getText()) {
							if (TargetURIComposite.this.getText().getEditable()) {
								TargetURIComposite.this.fireCommit();
							}
						}
					}
				}
			}
		};
		Display.getDefault().addFilter(SWT.MouseDown, clickListener);

		// this listener is only here to remove
		// the other listener from the Display
		this.text.addDisposeListener(new DisposeListener() {
			public void widgetDisposed(final DisposeEvent e) {
				Display.getDefault().removeFilter(SWT.MouseDown, clickListener);
			}
		});

		this.text.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(final KeyEvent event) {
				// Enter key pressed
				if ((event.keyCode == SWT.CR && event.stateMask == 0)
						|| (event.keyCode == SWT.KEYPAD_CR && event.stateMask == 0)) {
					if (TargetURIComposite.this.getText().getEditable()) {
						TargetURIComposite.this.fireCommit();
					}
				} else if (event.keyCode == SWT.ESC && event.stateMask == 0) {
					// Escape key pressed
					close();
				}
			}
		});

		this.text.addModifyListener(new ModifyListener() {
			public void modifyText(final ModifyEvent e) {
				fireChanged();
			}
		});

		this.text.forceFocus();
	}

	public void setValue(final URI value) {
		if (value != null) {
			this.text.setText(value.toString());
		}
	}

	public URI getValue() {
		return URI.createURI(this.text.getText());
	}

	protected Composite getParentControl() {
		return this.fParentControl;
	}

	protected Text getText() {
		return this.text;
	}

	protected Button getButton() {
		return this.button;
	}
}
