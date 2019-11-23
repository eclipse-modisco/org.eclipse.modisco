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
package org.eclipse.modisco.infra.browser.custom.editor.editors;

import org.eclipse.modisco.infra.browser.custom.editor.Messages;
import org.eclipse.modisco.infra.browser.uicore.internal.util.ImageProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;

/**
 * A toolbar with buttons to set options for the {@link MetaclassViewer}, using
 * {@link MetaclassViewConfiguration}.
 */
public class MetaclassViewToolBar {
	private final ToolBar toolBar;
	private MetaclassViewer metaclassViewer;
	private ToolItem btnShowMetaclassesFullQualifiedName;
	private ToolItem btnShowMultiplicity;
	private ToolItem btnSortLinks;
	private ToolItem btnSortLinksByType;
	private ToolItem btnShowDerivedLinks;
	private final MetaclassViewConfiguration metaclassViewConfiguration;
	private final Composite fParent;

	public MetaclassViewToolBar(final Composite parent,
			final MetaclassViewConfiguration metaclassViewConfiguration) {
		this.fParent = parent;
		this.metaclassViewConfiguration = metaclassViewConfiguration;
		final GridLayout gridLayout = new GridLayout();
		parent.setLayout(gridLayout);

		this.toolBar = new ToolBar(parent, SWT.NONE);
		final GridData toolBarGridData = new GridData();
		toolBarGridData.grabExcessHorizontalSpace = false;
		toolBarGridData.horizontalAlignment = SWT.FILL;
		this.toolBar.setLayoutData(toolBarGridData);

		createToolButtons();
		initialize();
	}

	public Composite getParentComposite() {
		return this.fParent;
	}

	public void setMetaclassViewer(final MetaclassViewer metaclassViewer) {
		this.metaclassViewer = metaclassViewer;
	}

	private void createToolButtons() {
		createShowMetaclassesFullQualifiedNameButton();
		createShowMultiplicityButton();
		createSortLinksButton();
		createSortLinksByTypeButton();
		createShowDerivedLinksButton();
	}

	private void createShowMetaclassesFullQualifiedNameButton() {
		this.btnShowMetaclassesFullQualifiedName = new ToolItem(this.toolBar, SWT.CHECK);
		this.btnShowMetaclassesFullQualifiedName
				.setToolTipText(Messages.MetaclassViewToolBar_showFullQualifiedNames);
		this.btnShowMetaclassesFullQualifiedName.setImage(ImageProvider.getInstance()
				.getShowFullQualifiedNamesIcon());
		this.btnShowMetaclassesFullQualifiedName.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				MetaclassViewToolBar.this.metaclassViewConfiguration
						.setShowMetaclassesFullQualifiedNames(MetaclassViewToolBar.this.btnShowMetaclassesFullQualifiedName
								.getSelection());
				MetaclassViewToolBar.this.metaclassViewer.refresh();
			}
		});
	}

	private void createShowMultiplicityButton() {
		this.btnShowMultiplicity = new ToolItem(this.toolBar, SWT.CHECK);
		this.btnShowMultiplicity.setToolTipText(Messages.MetaclassViewToolBar_showMultiplicity);
		this.btnShowMultiplicity.setImage(ImageProvider.getInstance().getShowMultiplicityIcon());
		this.btnShowMultiplicity.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				MetaclassViewToolBar.this.metaclassViewConfiguration
						.setShowMultiplicity(MetaclassViewToolBar.this.btnShowMultiplicity
								.getSelection());
				MetaclassViewToolBar.this.metaclassViewer.refresh();
			}
		});
	}

	private void createSortLinksButton() {
		this.btnSortLinks = new ToolItem(this.toolBar, SWT.CHECK);
		this.btnSortLinks.setToolTipText(Messages.MetaclassViewToolBar_sortLinks);
		this.btnSortLinks.setImage(ImageProvider.getInstance().getSortLinksIcon());

		this.btnSortLinks.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent event) {
				MetaclassViewToolBar.this.metaclassViewConfiguration
						.setSortLinks(MetaclassViewToolBar.this.btnSortLinks.getSelection());
				MetaclassViewToolBar.this.metaclassViewer.refresh();
			}
		});
	}

	private void createSortLinksByTypeButton() {
		this.btnSortLinksByType = new ToolItem(this.toolBar, SWT.CHECK);
		this.btnSortLinksByType.setToolTipText(Messages.MetaclassViewToolBar_sortLinksByType);
		this.btnSortLinksByType.setImage(ImageProvider.getInstance().getSortLinksByTypeIcon());

		this.btnSortLinksByType.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent event) {
				MetaclassViewToolBar.this.metaclassViewConfiguration
						.setSortLinksByType(MetaclassViewToolBar.this.btnSortLinksByType
								.getSelection());
				MetaclassViewToolBar.this.metaclassViewer.refresh();
			}
		});
	}

	private void createShowDerivedLinksButton() {
		this.btnShowDerivedLinks = new ToolItem(this.toolBar, SWT.CHECK);
		this.btnShowDerivedLinks.setToolTipText(Messages.MetaclassViewToolBar_showDerivedLinks);
		this.btnShowDerivedLinks.setImage(ImageProvider.getInstance().getShowDerivedLinksIcon());
		this.btnShowDerivedLinks.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				MetaclassViewToolBar.this.metaclassViewConfiguration
						.setShowDerivedLinks(MetaclassViewToolBar.this.btnShowDerivedLinks
								.getSelection());
				MetaclassViewToolBar.this.metaclassViewer.refresh();
			}
		});
	}

	/** Initialize the tool bar buttons with their initial value */
	private void initialize() {
		this.btnShowDerivedLinks.setSelection(this.metaclassViewConfiguration.isShowDerivedLinks());
		this.btnShowMetaclassesFullQualifiedName.setSelection(this.metaclassViewConfiguration
				.isShowMetaclassesFullQualifiedNames());
		this.btnShowMultiplicity.setSelection(this.metaclassViewConfiguration.isShowMultiplicity());
		this.btnSortLinks.setSelection(this.metaclassViewConfiguration.isSortLinks());
		this.btnSortLinksByType.setSelection(this.metaclassViewConfiguration.isSortLinksByType());
	}
}