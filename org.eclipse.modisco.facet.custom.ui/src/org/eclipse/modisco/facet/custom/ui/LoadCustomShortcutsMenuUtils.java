/*******************************************************************************
 * Copyright (c) 2015, 2019 Mia-Software
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Thomas Cicognani (Mia-Software) - Bug 472075 - Update API to create UI shortcuts to activate FacetSets
 *     Grégoire Dupé (Mia-Software) - Bug 472075 - Update API to create UI shortcuts to activate FacetSets 
 *******************************************************************************/
package org.eclipse.modisco.facet.custom.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.modisco.facet.custom.core.ICustomizationManager;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.custom.Customization;
import org.eclipse.modisco.facet.custom.ui.ICustomizationManagerProvider2.ICustomShortcut;
import org.eclipse.modisco.facet.custom.ui.internal.action.ShortcutCustomAction;
import org.eclipse.modisco.facet.efacet.ui.LoadFacetSetShortcutsMenuUtils;

/**
 * @since 1.1
 * @noinstantiate This class is not intended to be instantiated by clients.
 */
public final class LoadCustomShortcutsMenuUtils {

	private LoadCustomShortcutsMenuUtils() {
		// NOT TO BE USED
	}

	public static IContributionItem[] getCustomItemsFromCurrentPart() {
		final ICustomizationManagerProvider2 customMgrPrv = LoadFacetSetShortcutsMenuUtils
				.getProviderFromCurrentPart(ICustomizationManagerProvider2.class);
		return getCustomItems(customMgrPrv);
	}

	public static IContributionItem[] getCustomItemsFromCurrentEditor() {
		final ICustomizationManagerProvider2 customMgrPrv = LoadFacetSetShortcutsMenuUtils
				.getProviderFromCurrentEditor(ICustomizationManagerProvider2.class);
		return getCustomItems(customMgrPrv);
	}

	private static IContributionItem[] getCustomItems(
			final ICustomizationManagerProvider2 customMgrPrv) {
		final List<IContributionItem> menuList = new ArrayList<IContributionItem>();
		if (customMgrPrv != null) {
			final List<ICustomShortcut> shortcuts = customMgrPrv
					.getCustomShortcuts();
			final ICustomizationManager customManager = customMgrPrv
					.getCustomizationManager();
			for (ICustomShortcut shortcut : shortcuts) {
				final ActionContributionItem action = createCustomMenuItem(
						shortcut, customManager);
				menuList.add(action);
			}
		}
		return menuList.toArray(new IContributionItem[menuList.size()]);
	}

	private static ActionContributionItem createCustomMenuItem(
			final ICustomShortcut shortcut,
			final ICustomizationManager customManager) {
		final Customization custom = shortcut.getCustom();
		final String customId = custom.getName();
		final Action action = new ShortcutCustomAction(customId,
				shortcut.getLabel(), shortcut.getIcon(), customManager);
		final List<Customization> activeCustoms = customManager
				.getManagedCustomizations();
		return LoadFacetSetShortcutsMenuUtils.createMenuItem(customId,
				activeCustoms, action);
	}

}
