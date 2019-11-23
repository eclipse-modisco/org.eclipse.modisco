/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.core;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.modisco.infra.browser.editors.BrowserConfiguration;
import org.eclipse.modisco.infra.browser.uicore.internal.AppearanceConfiguration;
import org.eclipse.modisco.infra.browser.uicore.internal.model.ITreeElement;
import org.eclipse.modisco.infra.browser.uicore.internal.model.ItemsFactory;
import org.eclipse.modisco.infra.browser.uicore.internal.model.LinkItem;
import org.eclipse.modisco.infra.browser.uicore.internal.model.ModelElementItem;

public class ItemsFactoryEx extends ItemsFactory {

	private final BrowserConfiguration browserConfiguration;

	public ItemsFactoryEx(final BrowserConfiguration browserConfiguration) {
		this.browserConfiguration = browserConfiguration;
	}

	@Override
	public ModelElementItem createModelElementItem(final EObject eObject,
			final ITreeElement treeParent, final AppearanceConfiguration appearanceConfiguration) {
		return new ModelElementItemEx(eObject, treeParent, this.browserConfiguration);
	}

	@Override
	public LinkItem createLinkItem(final EObject parent, final ITreeElement treeParent,
			final EReference reference, final AppearanceConfiguration appearanceConfiguration) {
		return new LinkItemEx(parent, treeParent, reference, this.browserConfiguration);
	}
}
