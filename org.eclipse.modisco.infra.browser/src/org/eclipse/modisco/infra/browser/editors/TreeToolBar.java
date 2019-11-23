/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *    Nicolas Guyomar (Mia-software)
 *******************************************************************************/

package org.eclipse.modisco.infra.browser.editors;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.modisco.infra.browser.Messages;
import org.eclipse.modisco.infra.browser.uicore.internal.util.ImageProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;

public final class TreeToolBar {

	private final ToolBar toolBar;
	private ToolItem btnShowMenu;
	private final EcoreBrowser browser;
	private final Composite fParentComposite;

	public static TreeToolBar create(final Composite parent, final EcoreBrowser browser) {
		return new TreeToolBar(parent, browser);
	}

	private TreeToolBar(final Composite parent, final EcoreBrowser browser) {
		this.fParentComposite = parent;
		this.browser = browser;

		final RowLayout layout = new RowLayout(SWT.HORIZONTAL);
		layout.wrap = true;
		parent.setLayout(layout);

		ToolBarManager toolBarManager = new ToolBarManager(SWT.FLAT);
		toolBarManager.add(this.actionCollapseAll);
		toolBarManager.add(this.actionSortInstances);
		toolBarManager.add(this.actionShowEmptyLinks);
		toolBarManager.add(this.actionShowDerivedLinks);
		this.toolBar = toolBarManager.createControl(parent);

		initialize();
		createShowMenuAction();
	}

	private void createShowMenuAction() {
		this.btnShowMenu = new ToolItem(this.toolBar, SWT.PUSH);
		this.btnShowMenu.setToolTipText(Messages.MetaclassViewToolBar_showViewMenu);
		this.btnShowMenu.setImage(ImageProvider.getInstance().getViewMenuIcon());
		Listener listener = new Listener() {
			public void handleEvent(final Event event) {
				if (event.type != SWT.MouseDown
						|| TreeToolBar.this.toolBar.getItem(new Point(event.x, event.y)) == TreeToolBar.this.btnShowMenu) {
					openViewMenu();
				}
			}
		};
		// no selection event is sent when clicking on Windows
		if (Platform.getOS().equals(Platform.OS_WIN32)) {
			// listen on the toolbar so that the menu can appear on MouseDown
			this.toolBar.addListener(SWT.MouseDown, listener);
		}
		// and for keyboard accessibility
		this.btnShowMenu.addListener(SWT.Selection, listener);
	}

	public Menu openViewMenu() {
		MenuManager menuManager = new MenuManager();
		menuManager.add(this.actionSortInstances);
		menuManager.add(this.actionShowEmptyLinks);
		menuManager.add(this.actionShowDerivedLinks);
		menuManager.add(this.actionSortLinks);
		menuManager.add(this.actionSortLinksByType);
		menuManager.add(this.actionShowFullQualifiedNames);
		menuManager.add(this.actionShowMultiplicity);
		menuManager.add(this.actionShowOrdering);
		menuManager.add(this.actionShowOppositeLinks);
		menuManager.add(this.actionShowContainer);
		menuManager.add(this.actionShowAttributes);
		menuManager.add(this.actionShowEmptyAttributes);
		menuManager.add(this.actionShowTypeOfLinks);
		menuManager.add(this.actionShowElementIDs);
		menuManager.add(this.actionShowURI);
		menuManager.add(this.actionSynchroniseModelWithSourceCode);
		Menu contextMenu = menuManager.createContextMenu(this.fParentComposite);
		Rectangle bounds = Display.getCurrent().map(this.toolBar, null,
				this.btnShowMenu.getBounds());
		contextMenu.setLocation(bounds.x, bounds.y + bounds.height);
		contextMenu.setVisible(true);
		return contextMenu;
	}

	private final Action actionShowTypeOfLinks = new Action(Messages.TreeToolBar_showTypeOfLinks,
			IAction.AS_CHECK_BOX) {
		{
			setToolTipText(Messages.TreeToolBar_showTypeOfLinks);
			setImageDescriptor(ImageProvider.getInstance().getLinkTypeIconDescriptor());
		}

		@Override
		public void run() {
			TreeToolBar.this.browser.setShowTypeOfLinks(isChecked());
		}
	};

	private final Action actionShowEmptyLinks = new Action(Messages.TreeToolBar_showEmptyLinks,
			IAction.AS_CHECK_BOX) {
		{
			setToolTipText(Messages.TreeToolBar_showEmptyLinks);
			setImageDescriptor(ImageProvider.getInstance().getEmptyLinksImageDescriptor());
		}

		@Override
		public void run() {
			TreeToolBar.this.browser.setShowEmptyLinks(isChecked());
		}
	};

	private final Action actionShowDerivedLinks = new Action(Messages.TreeToolBar_showDerivedLinks,
			IAction.AS_CHECK_BOX) {
		{
			setToolTipText(Messages.TreeToolBar_showDerivedLinks);
			setImageDescriptor(ImageProvider.getInstance().getShowDerivedLinksImageDescriptor());
		}

		@Override
		public void run() {
			TreeToolBar.this.browser.setShowDerivedLinks(isChecked());
		}
	};

	private final Action actionSortInstances = new Action(Messages.TreeToolBar_sortInstances,
			IAction.AS_CHECK_BOX) {
		{
			setToolTipText(Messages.TreeToolBar_sortInstances);
			setImageDescriptor(ImageProvider.getInstance().getSortInstancesIcon());
		}

		@Override
		public void run() {
			TreeToolBar.this.browser.setSortInstances(isChecked());
		}
	};

	private final Action actionSortLinks = new Action(Messages.TreeToolBar_sortLinks,
			IAction.AS_CHECK_BOX) {
		{
			setToolTipText(Messages.TreeToolBar_sortLinks);
			setImageDescriptor(ImageProvider.getInstance().getSortLinksImageDescriptor());
		}

		@Override
		public void run() {
			TreeToolBar.this.browser.setSortLinks(isChecked());
		}
	};

	private final Action actionSortLinksByType = new Action(Messages.TreeToolBar_sortLinksByType,
			IAction.AS_CHECK_BOX) {
		{
			setToolTipText(Messages.TreeToolBar_sortLinksByType);
			setImageDescriptor(ImageProvider.getInstance().getSortLinksByTypeImageDescriptor());
		}

		@Override
		public void run() {
			TreeToolBar.this.browser.setSortLinksByType(isChecked());
		}
	};

	private final Action actionShowFullQualifiedNames = new Action(
			Messages.TreeToolBar_showFullQualifiedNames, IAction.AS_CHECK_BOX) {
		{
			setToolTipText(Messages.TreeToolBar_showFullQualifiedNames);
			setImageDescriptor(ImageProvider.getInstance()
					.getShowFullQualifiedNamesImageDescriptor());
		}

		@Override
		public void run() {
			TreeToolBar.this.browser.setShowFullQualifiedNames(isChecked());
		}
	};

	private final Action actionShowMultiplicity = new Action(Messages.TreeToolBar_showMultiplicity,
			IAction.AS_CHECK_BOX) {
		{
			setToolTipText(Messages.TreeToolBar_showMultiplicity);
			setImageDescriptor(ImageProvider.getInstance().getShowMultiplicityImageDescriptor());

		}

		@Override
		public void run() {
			TreeToolBar.this.browser.setShowMultiplicity(isChecked());
		}
	};

	private final Action actionShowOppositeLinks = new Action(
			Messages.TreeToolBar_showOppositeLinks, IAction.AS_CHECK_BOX) {
		{
			setToolTipText(Messages.TreeToolBar_showOppositeLinks);
			setImageDescriptor(ImageProvider.getInstance().getShowOppositeLinksImageDescriptor());
		}

		@Override
		public void run() {
			TreeToolBar.this.browser.setShowOppositeLinks(isChecked());
		}
	};

	private final Action actionShowContainer = new Action(Messages.TreeToolBar_showContainer,
			IAction.AS_CHECK_BOX) {
		{
			setToolTipText(Messages.TreeToolBar_showContainer);
			setImageDescriptor(ImageProvider.getInstance().getContainerImageDescriptor());
		}

		@Override
		public void run() {
			TreeToolBar.this.browser.setShowContainer(isChecked());
		}
	};

	private final Action actionShowAttributes = new Action(Messages.TreeToolBar_showAttributes,
			IAction.AS_CHECK_BOX) {
		{
			setToolTipText(Messages.TreeToolBar_showAttributes);
			setImageDescriptor(ImageProvider.getInstance().getAttributeImageDescriptor());
		}

		@Override
		public void run() {
			TreeToolBar.this.browser.setShowAttributes(isChecked());
			TreeToolBar.this.actionShowEmptyAttributes.setEnabled(isChecked());
		}
	};

	private final Action actionShowEmptyAttributes = new Action(
			Messages.TreeToolBar_showEmptyAttributes, IAction.AS_CHECK_BOX) {
		{
			setToolTipText(Messages.TreeToolBar_showEmptyAttributes);
			setImageDescriptor(ImageProvider.getInstance().getEmptyAttributeImageDescriptor());
		}

		@Override
		public void run() {
			TreeToolBar.this.browser.setShowEmptyAttributes(isChecked());
		}
	};

	private final Action actionShowOrdering = new Action(Messages.TreeToolBar_showOrdering,
			IAction.AS_CHECK_BOX) {
		{
			setToolTipText(Messages.TreeToolBar_showOrdering);
			setImageDescriptor(ImageProvider.getInstance().getOrderingImageDescriptor());
		}

		@Override
		public void run() {
			TreeToolBar.this.browser.setShowOrdering(isChecked());
		}
	};

	private final Action actionShowElementIDs = new Action(Messages.TreeToolBar_showElementIDs,
			IAction.AS_CHECK_BOX) {
		{
			setToolTipText(Messages.TreeToolBar_showElementIDs);
			setImageDescriptor(ImageProvider.getInstance().getShowElementIDsDescriptor());
		}

		@Override
		public void run() {
			TreeToolBar.this.browser.setShowElementIDs(isChecked());
		}
	};

	private final Action actionShowURI = new Action(Messages.TreeToolBar_showURI,
			IAction.AS_CHECK_BOX) {
		{
			setToolTipText(Messages.TreeToolBar_showURI);
			setImageDescriptor(ImageProvider.getInstance().getShowURIDescriptor());
		}

		@Override
		public void run() {
			TreeToolBar.this.browser.setShowURI(isChecked());
		}
	};

	private final Action actionCollapseAll = new Action(Messages.TreeToolBar_collapseAll,
			IAction.AS_PUSH_BUTTON) {
		{
			setToolTipText(Messages.TreeToolBar_collapseAll);
			setImageDescriptor(ImageProvider.getInstance().getCollapseAllDescriptor());
		}

		@Override
		public void run() {
			TreeToolBar.this.browser.getTreeViewer().collapseAll();
		}
	};

	private final Action actionSynchroniseModelWithSourceCode = new Action(Messages.TreeToolBar_synchronizeSourceCode,
			IAction.AS_CHECK_BOX) {
		{
			setToolTipText(Messages.TreeToolBar_synchronizeSourceCode);
			setImageDescriptor(ImageProvider.getInstance().getSynchronizeSourceCodeDescriptor());
		}

		@Override
		public void run() {
			TreeToolBar.this.browser.setSynchronizeSourceCode(isChecked());
		}
	};

	public void refresh() {
		initialize();
	}

	private void initialize() {
		this.actionShowEmptyLinks.setChecked(this.browser.isShowEmptyLinks());
		this.actionSortInstances.setChecked(this.browser.isSortInstances());
		this.actionSortLinks.setChecked(this.browser.isSortLinks());
		this.actionSortLinksByType.setChecked(this.browser.isSortLinksByType());
		this.actionShowDerivedLinks.setChecked(this.browser.isShowDerivedLinks());
		this.actionShowFullQualifiedNames.setChecked(this.browser.isShowFullQualifiedNames());
		this.actionShowMultiplicity.setChecked(this.browser.isShowMultiplicity());
		this.actionShowOppositeLinks.setChecked(this.browser.isShowOppositeLinks());
		this.actionShowContainer.setChecked(this.browser.isShowContainer());
		this.actionShowAttributes.setChecked(this.browser.isShowAttributes());
		this.actionShowEmptyAttributes.setChecked(this.browser.isShowEmptyAttributes());
		this.actionShowOrdering.setChecked(this.browser.isShowOrdering());
		this.actionShowTypeOfLinks.setChecked(this.browser.isShowTypeOfLinks());
		this.actionShowElementIDs.setChecked(this.browser.isShowElementIDs());
		this.actionShowURI.setChecked(this.browser.isShowURI());
		this.actionSynchroniseModelWithSourceCode.setChecked(this.browser.isSynchronizeSourceCode());

		this.actionShowEmptyAttributes.setEnabled(this.browser.isShowAttributes());

	}
}
