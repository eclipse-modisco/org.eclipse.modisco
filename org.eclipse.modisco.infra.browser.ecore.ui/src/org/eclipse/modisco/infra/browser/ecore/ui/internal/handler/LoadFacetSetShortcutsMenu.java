/**
 * Copyright (c) 2015, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Thomas Cicognani (Mia-Software) - Bug 470962 - Add shortcuts to activate customs
 */
package org.eclipse.modisco.infra.browser.ecore.ui.internal.handler;

import org.eclipse.jface.action.IContributionItem;
import org.eclipse.modisco.facet.efacet.ui.LoadFacetSetShortcutsMenuUtils;
import org.eclipse.ui.actions.CompoundContributionItem;

public class LoadFacetSetShortcutsMenu extends CompoundContributionItem {

	@Override
	protected IContributionItem[] getContributionItems() {
		return LoadFacetSetShortcutsMenuUtils.getFacetSetItemsFromCurrentPart();
	}

}
