/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *
 *******************************************************************************/

package org.eclipse.modisco.infra.browser.editors;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * The left pane in the model editor, containing the list (tree) of metaclasses
 * and the list of model services
 */
public class LeftPane {

	/** The viewer where a list of metaclasses is shown */
	private MetaclassViewer metaclassViewer;
	private final BrowserConfiguration editorConfiguration;
	private MetaclassViewToolBar toolbar;
	private Composite toolBarComposite;
	private final Composite parent;
	private final Composite toolbarParent;
	private final FormToolkit formToolkit;
	private final IWorkbenchPartSite site;

	public LeftPane(final Composite toolbarParent, final Composite parent,
			final BrowserConfiguration editorConfiguration, final FormToolkit formToolkit,
			final IWorkbenchPartSite site) {
		this.editorConfiguration = editorConfiguration;
		this.parent = parent;
		this.formToolkit = formToolkit;
		this.site = site;
		this.toolbarParent = toolbarParent;

		// GridLayout gridLayout = new GridLayout(1, false);
		// gridLayout.marginBottom = 5;
		// gridLayout.marginHeight = 0;
		// gridLayout.marginWidth = 0;
		// parent.setLayout(gridLayout);

		// GridData metaclassViewerGridData = new GridData();
		// metaclassViewerGridData.grabExcessHorizontalSpace = true;
		// metaclassViewerGridData.grabExcessVerticalSpace = true;
		// metaclassViewerGridData.horizontalAlignment = SWT.FILL;
		// metaclassViewerGridData.verticalAlignment = SWT.FILL;
		// this.metaclassViewer.getViewer().getControl().setLayoutData(metaclassViewerGridData);
	}

	public Composite getToolBarComposite() {
		if (this.toolbar == null) {
			createToolBar(this.toolbarParent);
		}
		return this.toolBarComposite;
	}

	public MetaclassViewToolBar getToolbar() {
		if (this.toolbar == null) {
			createToolBar(this.toolbarParent);
		}
		return this.toolbar;
	}

	private void createToolBar(final Composite pParent) {
		this.toolBarComposite = new Composite(pParent, SWT.WRAP);
		// GridData toolBarGridData = new GridData();
		// toolBarGridData.grabExcessHorizontalSpace = true;
		// toolBarGridData.horizontalAlignment = SWT.FILL;
		// toolBarComposite.setLayoutData(toolBarGridData);

		this.toolbar = new MetaclassViewToolBar(this.toolBarComposite, this.editorConfiguration);
		this.toolbar.setMetaclassViewer(getMetaclassViewer());
	}

	public MetaclassViewer getMetaclassViewer() {
		if (this.metaclassViewer == null) {
			this.metaclassViewer = new MetaclassViewer(this.parent, this.editorConfiguration,
					this.formToolkit, this.site);
		}
		return this.metaclassViewer;
	}
}
