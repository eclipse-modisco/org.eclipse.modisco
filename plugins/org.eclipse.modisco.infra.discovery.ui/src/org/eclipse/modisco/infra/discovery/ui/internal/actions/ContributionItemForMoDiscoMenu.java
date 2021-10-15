/*******************************************************************************
 * Copyright (c) 2009-2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - refactoring for new discovery framework
 *    Nicolas Bros (Mia-Software) - Bug 344117 - NPE during context menu generation prevents 'Progress' view from coming up
 *    Gregoire Dupe (Mia-Software) - Bug 422168 - Discovery menu breakable by an extension exception
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.ui.internal.actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.ContributionItem;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription;
import org.eclipse.modisco.infra.discovery.core.IDiscoveryManager;
import org.eclipse.modisco.infra.discovery.ui.Activator;
import org.eclipse.modisco.infra.discovery.ui.Messages;
import org.eclipse.modisco.infra.discovery.ui.internal.registry.DiscovererUI;
import org.eclipse.modisco.infra.discovery.ui.internal.registry.DiscovererUIRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MenuEvent;
import org.eclipse.swt.events.MenuListener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.menus.IWorkbenchContribution;
import org.eclipse.ui.services.IServiceLocator;

/** Populates the MoDisco menu dynamically (and lazily, when it is shown). */
public class ContributionItemForMoDiscoMenu extends ContributionItem implements
		IWorkbenchContribution {

	private Shell shell;
	private ISelectionService selectionService;

	public void initialize(final IServiceLocator serviceLocator) {
		this.selectionService = (ISelectionService) serviceLocator
				.getService(ISelectionService.class);
	}

	@Override
	public void fill(final Menu menu, final int index) {
		super.fill(menu, index);
		this.shell = menu.getShell();

		ISelection selection = this.selectionService.getSelection();
		// ClassCastException in Eclipse 3.5 : TextSelection /
		// IStructuredSelection ...
		if (selection instanceof IStructuredSelection && !selection.isEmpty()) {
			final IStructuredSelection structuredSelection = (IStructuredSelection) selection;

			MenuItem modiscoItem = new MenuItem(menu, SWT.CASCADE, index);
			modiscoItem.setText(Messages.ContributionItemForMoDiscoMenu_discoverersMenuLabel);

			// modiscoItem.setImage(getMoDiscoImage());

			// Add MoDisco menu
			final Menu modiscoMenu = new Menu(modiscoItem);
			modiscoItem.setMenu(modiscoMenu);

			modiscoMenu.addMenuListener(new MenuListener() {
				public void menuShown(final MenuEvent event) {
					for (MenuItem menuItem : modiscoMenu.getItems()) {
						menuItem.dispose();
					}
					/*
					 * Items and sub-menus will only be available if they match
					 * selected resources.
					 *
					 * First, retrieve selected resource
					 *
					 * Second, check if available discoverers handle it
					 *
					 * Third, if discoverers list is not empty, we will create a
					 * menu item for each. For each menu item, we have to link
					 * menu action to menu event like usual menu.
					 */
					final List<DiscovererDescription> discoverers = new ArrayList<DiscovererDescription>();
					// retrieve selected item
					try {
						/*
						 * for multiple selection, we have to check each
						 * selected object separately.
						 */
						Object[] selectedObjects = structuredSelection.toArray();

						for (DiscovererDescription discoverer : IDiscoveryManager.INSTANCE
								.getDiscoverers()) {

							boolean applicable = true;
							for (final Object selectedObject : selectedObjects) {
								// check discoverer compatibility
								try {
									if (!IDiscoveryManager.INSTANCE.isApplicable(discoverer,
											selectedObject)) {
										applicable = false;
										break;
									}
								} catch (Exception e) {
									MoDiscoLogger.logError(e, Activator.getDefault());
								}
							}
							if (applicable) {
								discoverers.add(discoverer);
							}
						}

						if (discoverers.size() > 0) {
							// sort, in order to avoid random order each time
							// the menu is created
							Collections.sort(discoverers,
									ContributionItemForMoDiscoMenu.DISCOVERERS_COMPARATOR);

							for (DiscovererDescription discoverer : discoverers) {
								// management of intermediate menu
								createMenuForDiscoverer(discoverer, modiscoMenu, selectedObjects);
							}
						} else {
							MenuItem discovererMenu = new MenuItem(modiscoMenu, SWT.PUSH);
							discovererMenu
									.setText(Messages.ContributionItemForMoDiscoMenu_noApplicableDiscoverer);
							discovererMenu.setEnabled(false);
						}
					} catch (Exception e) {
						MoDiscoLogger.logError(e, Activator.getDefault());
					}
				}

				public void menuHidden(final MenuEvent e) {
					//
				}
			});
		}
	}

	private final void createMenuForDiscoverer(final DiscovererDescription discoverer,
			final Menu modiscoMenu, final Object[] selectedObjects) {
		Menu parentMenu = modiscoMenu;
		DiscovererUI discovererUI = DiscovererUIRegistry.getInstance().getDiscovererUI(
				discoverer.getId());
		if (discovererUI == null) {
			if (Platform.inDebugMode()) {
				MoDiscoLogger
						.logWarning(
								"No discoverer UI defined for discoverer " + discoverer.getId() //$NON-NLS-1$
										+ ". It will not appear in the MoDisco menu.", Activator.getDefault()); //$NON-NLS-1$
			}
			return;
		}

		final String[] pathParts;
		if (discovererUI.getPath().length() == 0) {
			pathParts = new String[0];
		} else {
			pathParts = discovererUI.getPath().split("/"); //$NON-NLS-1$
		}

		if (pathParts.length > 0) {
			for (String pathEntry : pathParts) {
				MenuItem intermediateMenu = null;
				for (MenuItem item : parentMenu.getItems()) {
					if (item.getText().equalsIgnoreCase(pathEntry)) {
						intermediateMenu = item;
					}
				}
				if (intermediateMenu == null) {
					intermediateMenu = new MenuItem(parentMenu, SWT.CASCADE,
							parentMenu.getItemCount());
					intermediateMenu.setText(pathEntry);
					parentMenu = new Menu(intermediateMenu);
					intermediateMenu.setMenu(parentMenu);
				} else {
					parentMenu = intermediateMenu.getMenu();
				}
			}
		}
		// final menu
		MenuItem discovererMenu = new MenuItem(parentMenu, SWT.PUSH, 0);
		String label = discovererUI.getLabel();
		if (!label.trim().endsWith("...")) { //$NON-NLS-1$
			if (!MoDiscoMenuSelectionListener.getExpectedInputParameters(discoverer).isEmpty()) {
				// add ellipsis to follow Eclipse guidelines for an item that
				// opens a dialog before doing something
				label += "..."; //$NON-NLS-1$
			}
		}

		discovererMenu.setText(label);
		if (discovererUI.getImageIcon() != null) {
			discovererMenu.setImage(discovererUI.getImageIcon());
		}
		MoDiscoMenuSelectionListener handler = new MoDiscoMenuSelectionListener(discoverer,
				selectedObjects, this.shell);
		discovererMenu.addSelectionListener(handler);
	}

	// private Image image;

	// private final Image getMoDiscoImage() {
	// if (this.image == null) {
	//			ImageDescriptor descriptor = Activator.getImageDescriptor("icons/discoverer16x16.png"); //$NON-NLS-1$
	// if (descriptor != null) {
	// this.image = descriptor.createImage();
	// }
	// }
	// return this.image;
	// }

	@Override
	public boolean isDynamic() {
		return true;
	}

	private static final Comparator<DiscovererDescription> DISCOVERERS_COMPARATOR = new Comparator<DiscovererDescription>() {
		public int compare(final DiscovererDescription o1, final DiscovererDescription o2) {
			String str1 = null;
			String str2 = null;

			if (o1 != null && o1.getId() != null) {
				DiscovererUI ui1 = DiscovererUIRegistry.getInstance().getDiscovererUI(o1.getId());
				if (ui1 != null) {
					str1 = ui1.getLabel();
				}
			}

			if (str1 == null) {
				return 1;
			}
			if (o2 != null && o2.getId() != null) {
				DiscovererUI ui2 = DiscovererUIRegistry.getInstance().getDiscovererUI(o2.getId());
				if (ui2 != null) {
					str2 = ui2.getLabel();
				}
			}

			if (str2 == null) {
				return -1;
			}

			return str2.compareToIgnoreCase(str1);
		}
	};
}
