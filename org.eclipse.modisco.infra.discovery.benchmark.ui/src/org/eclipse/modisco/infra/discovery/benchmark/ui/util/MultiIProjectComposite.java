/*******************************************************************************
 * Copyright (c) 2012 INRIA. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: Guillaume Doux - INRIA - Initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.modisco.infra.discovery.benchmark.ui.util;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.window.Window;
import org.eclipse.modisco.facet.widgets.celleditors.AbstractCellEditorComposite;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.exported.IProjectSet;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.exported.IProjectSetFactory;
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
import org.eclipse.ui.dialogs.ListSelectionDialog;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

/**
 * Cell editor allowing to select several projects (in a {@link IProjectSet})
 * @author Guillaume Doux
 *
 */
public class MultiIProjectComposite extends AbstractCellEditorComposite<IProjectSet> {

	/** the control that is used to edit the contents of the cell */
	private final Button button;
	private Text text = null;

	private IProjectSet projects  = null;

	private final Composite parentControl;

	public MultiIProjectComposite(final Composite parent) {
		this(parent, SWT.NONE);
	}

	public MultiIProjectComposite(final Composite parent, final int style) {
		super(parent);
		this.parentControl = parent;

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
				browseResource();
			}
		});

		// commit the cell editor when the mouse is clicked
		// anywhere outside the text field
		final Listener clickListener = new Listener() {
			public void handleEvent(final Event event) {
				if (event.widget instanceof Control) {
					Control control = (Control) event.widget;
					if (control.getShell() == getParentControl().getShell()) {
						if (event.widget != getButton() && event.widget != getText()) {
							fireCommit();
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
					fireCommit();
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

	protected Button getButton() {
		return this.button;
	}

	protected Text getText() {
		return this.text;
	}

	protected void commit() {
		fireCommit();
	}

	protected Composite getParentControl() {
		return this.parentControl;
	}

	public IProjectSet getValue() {
		return this.projects;
	}


	protected void browseResource() {
		WorkbenchContentProvider projectsContentProvider = new WorkbenchContentProvider() {
			@Override
			public Object[] getChildren(final Object element) {
				if (!(element instanceof IWorkspace)) {
					return new Object[0];
				}
				IProject[] iProjects = ((IWorkspace) element).getRoot().getProjects();
				if (iProjects == null) {
					return new Object[0];
				}
				return iProjects;
			}
		};

		ListSelectionDialog dialog = new ListSelectionDialog(getShell(), ResourcesPlugin.getWorkspace(), projectsContentProvider, new WorkbenchLabelProvider(), "Please select one or more projects");
		// TODO: externalize string
		dialog.setMessage("Please select one or more projects"); //$NON-NLS-1$
		// TODO: externalize string
		dialog.setTitle("Select Projects"); //$NON-NLS-1$
		final int code = dialog.open();
		if (code == Window.OK) {
			final Object[] result = dialog.getResult();
			if (result.length > 0) {
				final IProjectSet selectedProjects = IProjectSetFactory.INSTANCE.createProjectSet();
				for (Object object : result) {
					if (object instanceof IProject) {
						selectedProjects.add((IProject) object);
					}
				}
				setValue(selectedProjects);
				fireCommit();
			}
		}
	}

	public void setValue(final IProjectSet value) {
		this.projects = value;
		if (this.projects == null) {
			this.text.setText("");
		} else {
			if (this.projects.size() == 1) {
				this.text.setText(this.projects.get(0).getFullPath().toString());
			} else {
				if (this.projects.size() > 1) {
					this.text.setText("\"" + this.projects.get(0).getFullPath().toString() + "\" and " + (this.projects.size() - 1) + " more ...");
				} else {
					this.text.setText("");
				}
			}
		}
	}


}
