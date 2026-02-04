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
package org.eclipse.modisco.facet.efacet.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.modisco.facet.efacet.core.IFacetManager;
import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.FacetSet;
import org.eclipse.modisco.facet.efacet.ui.IFacetManagerProvider2.IFacetSetShortcut;
import org.eclipse.modisco.facet.efacet.ui.internal.actions.ShortcutFacetSetAction;
import org.eclipse.modisco.facet.util.ui.internal.exported.handler.HandlerUtils;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;

/**
 * @since 1.1
 * @noinstantiate This class is not intended to be instantiated by clients.
 */
public final class LoadFacetSetShortcutsMenuUtils {

	private LoadFacetSetShortcutsMenuUtils() {
		// NOT TO BE USED
	}

	public static IContributionItem[] getFacetSetItemsFromCurrentPart() {
		final IFacetManagerProvider2 facetMgrPrv = getProviderFromCurrentPart(IFacetManagerProvider2.class);
		return getFacetSetItems(facetMgrPrv);
	}

	public static IContributionItem[] getFacetSetItemsFromCurrentEditor() {
		final IFacetManagerProvider2 facetMgrPrv = getProviderFromCurrentEditor(IFacetManagerProvider2.class);
		return getFacetSetItems(facetMgrPrv);
	}

	private static IContributionItem[] getFacetSetItems(
			final IFacetManagerProvider2 facetMgrPrv) {
		final List<IContributionItem> menuList = new ArrayList<IContributionItem>();
		if (facetMgrPrv != null) {
			final List<IFacetSetShortcut> shortcuts = facetMgrPrv
					.getFacetSetShortcuts();
			final IFacetManager facetManager = facetMgrPrv.getFacetManager();
			for (IFacetSetShortcut shortcut : shortcuts) {
				final ActionContributionItem action = createFacetSetMenuItem(
						shortcut, facetManager);
				menuList.add(action);
			}
		}
		return menuList.toArray(new IContributionItem[menuList.size()]);
	}

	public static <T> T getProviderFromCurrentPart(final Class<T> providerType) {
		final IWorkbenchPart activePart = HandlerUtils.getActivePart();
		return getProviderFromCurrentPart(providerType, activePart);
	}

	public static <T> T getProviderFromCurrentEditor(
			final Class<T> providerType) {
		T result = null;
		final IWorkbenchPage activePage = HandlerUtils.getActivePage();
		if (activePage != null) {
			final IEditorPart activeEditor = activePage.getActiveEditor();
			if (activeEditor != null) {
				result = getProviderFromCurrentPart(providerType, activeEditor);
			}
		}
		return result;
	}

	private static <T> T getProviderFromCurrentPart(
			final Class<T> providerType, final IWorkbenchPart activePart) {
		T result = null;
		if (activePart != null) {
			final Object adapt = activePart.getAdapter(providerType);
			if (adapt != null) {
				/*
				 * @SuppressWarnings("unchecked") Cast safe thanks to the
				 * getAdapter method
				 */
				@SuppressWarnings("unchecked")
				final T adapted = (T) adapt;
				result = adapted;
			}
		}
		return result;
	}

	private static ActionContributionItem createFacetSetMenuItem(
			final IFacetSetShortcut shortcut, final IFacetManager facetManager) {
		final FacetSet facetSet = shortcut.getFacetSet();
		final String facetSetId = facetSet.getName();
		final Action action = new ShortcutFacetSetAction(facetSetId,
				shortcut.getLabel(), shortcut.getIcon(), facetManager);
		final List<FacetSet> activeFacetSets = facetManager
				.getManagedFacetSets();
		return createMenuItem(facetSetId, activeFacetSets, action);
	}

	public static ActionContributionItem createMenuItem(final String itemId,
			final List<? extends FacetSet> activeFacetSets,
			final Action newAction) {
		for (FacetSet activeCustom : activeFacetSets) {
			final String facetSetName = activeCustom.getName();
			if (facetSetName.equals(itemId)) {
				newAction.setChecked(true);
				break;
			}
		}
		return new ActionContributionItem(newAction);
	}
}
