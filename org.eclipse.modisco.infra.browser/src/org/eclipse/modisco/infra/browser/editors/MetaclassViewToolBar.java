/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *
 *******************************************************************************/

package org.eclipse.modisco.infra.browser.editors;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.modisco.infra.browser.Messages;
import org.eclipse.modisco.infra.browser.uicore.internal.AppearanceConfiguration;
import org.eclipse.modisco.infra.browser.uicore.internal.AppearanceConfiguration.MetaclassesSortMode;
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

public class MetaclassViewToolBar {
	private final ToolBar toolBar;
	private ToolItem btnShowMenu;
	private MetaclassViewer metaclassViewer;
	private final BrowserConfiguration browserConfiguration;
	private final Composite fParentComposite;

	public MetaclassViewToolBar(final Composite parent,
			final BrowserConfiguration browserConfiguration) {
		this.fParentComposite = parent;
		this.browserConfiguration = browserConfiguration;

		final RowLayout layout = new RowLayout(SWT.HORIZONTAL);
		layout.wrap = true;
		parent.setLayout(layout);

		ToolBarManager toolBarManager = new ToolBarManager(SWT.FLAT);
		toolBarManager.add(this.actionShowEmptyMetaclasses);
		toolBarManager.add(this.actionDisplayInstancesOfSubclasses);
		toolBarManager.add(this.actionDerivationTree);
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
						|| MetaclassViewToolBar.this.toolBar.getItem(new Point(event.x, event.y)) == MetaclassViewToolBar.this.btnShowMenu) {
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
		menuManager.add(this.actionShowEmptyMetaclasses);
		menuManager.add(this.actionDisplayInstancesOfSubclasses);
		menuManager.add(this.actionDerivationTree);
		menuManager.add(this.actionSortByName);
		menuManager.add(this.actionSortByCount);
		menuManager.add(this.actionShowMetaclassesFullQualifiedName);
		menuManager.add(this.actionGroupByPackage);
		Menu contextMenu = menuManager.createContextMenu(this.fParentComposite);
		Rectangle bounds = Display.getCurrent().map(this.toolBar, null,
				this.btnShowMenu.getBounds());
		contextMenu.setLocation(bounds.x, bounds.y + bounds.height);
		contextMenu.setVisible(true);
		return contextMenu;
	}

	private final Action actionDisplayInstancesOfSubclasses = new Action(
			Messages.MetaclassViewToolBar_displayInstancesOfSubclasses, IAction.AS_CHECK_BOX) {
		{
			setToolTipText(Messages.MetaclassViewToolBar_displayInstancesOfSubclasses);
			setImageDescriptor(ImageProvider.getInstance().getDerivedInstancesImageDescriptor());
		}

		@Override
		public void run() {
			MetaclassViewToolBar.this.metaclassViewer.setDisplayInstancesOfSubclasses(isChecked());
		}
	};

	private final Action actionSortByName = new Action(Messages.MetaclassViewToolBar_sortByName,
			IAction.AS_RADIO_BUTTON) {
		{
			setToolTipText(Messages.MetaclassViewToolBar_sortByName);
			setImageDescriptor(ImageProvider.getInstance().getSortInstancesIcon());
		}

		@Override
		public void run() {

			MetaclassViewToolBar.this.metaclassViewer
					.setSortMode(AppearanceConfiguration.MetaclassesSortMode.ByName);
		}
	};

	private final Action actionSortByCount = new Action(Messages.MetaclassViewToolBar_sortByCount,
			IAction.AS_RADIO_BUTTON) {
		{
			setToolTipText(Messages.MetaclassViewToolBar_sortByCount);
			setImageDescriptor(ImageProvider.getInstance().getSortNumericallyIcon());
		}

		@Override
		public void run() {
			MetaclassViewToolBar.this.metaclassViewer
					.setSortMode(AppearanceConfiguration.MetaclassesSortMode.ByCount);
		}
	};

	private final Action actionShowMetaclassesFullQualifiedName = new Action(
			Messages.MetaclassViewToolBar_showFullQualifiedNames, SWT.CHECK) {
		{
			setToolTipText(Messages.MetaclassViewToolBar_showFullQualifiedNames);
			setImageDescriptor(ImageProvider.getInstance()
					.getShowFullQualifiedNamesImageDescriptor());
		}

		@Override
		public void run() {
			MetaclassViewToolBar.this.metaclassViewer
					.setShowMetaclassesFullQualifiedNames(isChecked());
		}
	};

	private final Action actionShowEmptyMetaclasses = new Action(
			Messages.MetaclassViewToolBar_showEmptyMetaclasses, IAction.AS_CHECK_BOX) {
		{
			setToolTipText(Messages.MetaclassViewToolBar_showEmptyMetaclasses);
			setImageDescriptor(ImageProvider.getInstance().getShowEmptyMetaclassesIcon());
		}

		@Override
		public void run() {
			MetaclassViewToolBar.this.metaclassViewer.setShowEmptyMetaclasses(isChecked());
		}
	};

	private final Action actionGroupByPackage = new Action(
			Messages.MetaclassViewToolBar_groupByPackage, IAction.AS_CHECK_BOX) {
		{
			setToolTipText(Messages.MetaclassViewToolBar_groupByPackage);
			setImageDescriptor(ImageProvider.getInstance().getPackageImageDescriptor());
		}

		@Override
		public void run() {
			MetaclassViewToolBar.this.metaclassViewer.setGroupByPackage(isChecked());
		}
	};

	private final Action actionDerivationTree = new Action(
			Messages.MetaclassViewToolBar_showDerivationTree, IAction.AS_CHECK_BOX) {
		{
			setToolTipText(Messages.MetaclassViewToolBar_showDerivationTree);
			setImageDescriptor(ImageProvider.getInstance().getDerivationTreeIcon());
		}

		@Override
		public void run() {
			MetaclassViewToolBar.this.metaclassViewer.setShowDerivationTree(isChecked());
			MetaclassViewToolBar.this.actionGroupByPackage.setEnabled(!isChecked());
		}
	};

	public void setMetaclassViewer(final MetaclassViewer metaclassViewer) {
		this.metaclassViewer = metaclassViewer;
	}

	/** Initialize the tool bar buttons with their initial value */
	private void initialize() {
		final MetaclassesSortMode metaclassesSortMode = this.browserConfiguration
				.getAppearanceConfiguration().getMetaclassesSortMode();
		this.actionSortByName.setChecked(metaclassesSortMode == MetaclassesSortMode.ByName);
		this.actionSortByCount.setChecked(metaclassesSortMode == MetaclassesSortMode.ByCount);
		this.actionShowMetaclassesFullQualifiedName.setChecked(this.browserConfiguration
				.getAppearanceConfiguration().isShowMetaclassesFullQualifiedNames());
		this.actionShowEmptyMetaclasses.setChecked(this.browserConfiguration
				.getAppearanceConfiguration().isShowEmptyMetaclasses());
		this.actionGroupByPackage.setChecked(this.browserConfiguration.getAppearanceConfiguration()
				.isGroupByPackage());
		this.actionDisplayInstancesOfSubclasses.setChecked(this.browserConfiguration
				.getAppearanceConfiguration().isDisplayInstancesOfSubclasses());
		this.actionDerivationTree.setChecked(this.browserConfiguration.getAppearanceConfiguration()
				.isShowDerivationTree());

		this.actionGroupByPackage.setEnabled(!this.browserConfiguration
				.getAppearanceConfiguration().isShowDerivationTree());
	}
}
