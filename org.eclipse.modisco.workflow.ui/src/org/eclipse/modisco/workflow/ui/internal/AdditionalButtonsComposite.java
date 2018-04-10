/**
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Payneau (Mia-Software) - initial API and implementation
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 337402 - [Discovery Workflow] refactoring
 */
package org.eclipse.modisco.workflow.ui.internal;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class AdditionalButtonsComposite extends Composite {
	private Button removeButton = null;
	private Button upButton = null;
	private Button downButton = null;
	private Button loadButton = null;
	private final WorkflowTab workflowTransformationTab;

	private static final int WIDTH = 63;
	private static final int HEIGHT = 202;

	/**
	 * Class constructor
	 *
	 * @param parent
	 *            The composite parent
	 * @param style
	 *            The style of composite
	 * @param table
	 *            The table of transformations
	 * @param workflowModel
	 *            The workflowModel managing the display
	 */
	public AdditionalButtonsComposite(final Composite parent, final int style,
			final WorkflowTab workflowTransformationTabParam) {
		super(parent, style);
		this.workflowTransformationTab = workflowTransformationTabParam;

		initialize();
	}

	protected WorkflowTab getWorkflowTransformationTab() {
		return this.workflowTransformationTab;
	}

	/**
	 * Create the composite representing the additional buttons
	 */
	private void initialize() {
		GridData gridDataUp = new GridData();
		gridDataUp.horizontalAlignment = GridData.FILL;
		gridDataUp.verticalAlignment = GridData.CENTER;
		GridData gridDataDown = new GridData();
		gridDataDown.horizontalAlignment = GridData.FILL;
		gridDataDown.verticalAlignment = GridData.CENTER;
		GridData gridData = new GridData();
		gridData.horizontalAlignment = GridData.FILL;
		gridData.verticalAlignment = GridData.CENTER;
		this.loadButton = new Button(this, SWT.NONE);
		this.loadButton.setText(Messages.AdditionalButtonsComposite_load);
		this.loadButton.setLayoutData(gridData);
		this.loadButton.setImage(Activator.getImageDescriptor(UIConstants.LOAD_ICON_PATH)
				.createImage());
		this.loadButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final org.eclipse.swt.events.SelectionEvent e) {
				getWorkflowTransformationTab().loadAdditionalWork();
			}
		});
		this.removeButton = new Button(this, SWT.NONE);
		this.removeButton.setText(Messages.AdditionalButtonsComposite_remove);
		this.removeButton.setLayoutData(gridData);
		this.removeButton.setImage(Activator.getImageDescriptor(UIConstants.REMOVE_ICON_PATH)
				.createImage());
		this.removeButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final org.eclipse.swt.events.SelectionEvent e) {
				getWorkflowTransformationTab().removeWork();
			}
		});
		this.upButton = new Button(this, SWT.PUSH);
		// for add one space character
		this.upButton.setText(Messages.AdditionalButtonsComposite_up);
		final int verticalIndent = 30;
		gridDataUp.verticalIndent = verticalIndent;
		this.upButton.setLayoutData(gridDataUp);
		this.upButton
				.setImage(Activator.getImageDescriptor(UIConstants.UP_ICON_PATH).createImage());
		this.upButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final org.eclipse.swt.events.SelectionEvent e) {
				getWorkflowTransformationTab().moveWorkUp();
			}
		});
		this.downButton = new Button(this, SWT.PUSH);
		this.downButton.setText(Messages.AdditionalButtonsComposite_down);
		this.downButton.setLayoutData(gridDataDown);
		this.downButton.setImage(Activator.getImageDescriptor(UIConstants.DOWN_ICON_PATH)
				.createImage());
		this.downButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final org.eclipse.swt.events.SelectionEvent e) {
				getWorkflowTransformationTab().moveWorkDown();
			}
		});

		GridData layoutData = new GridData();
		layoutData.verticalAlignment = org.eclipse.swt.layout.GridData.BEGINNING;
		setSize(new Point(AdditionalButtonsComposite.WIDTH, AdditionalButtonsComposite.HEIGHT));
		setLayout(new GridLayout());
		setLayoutData(layoutData);
	}
}
