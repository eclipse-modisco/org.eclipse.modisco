/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.uicore.internal.model;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.modisco.infra.browser.uicore.internal.AppearanceConfiguration;

/**
 * A factory that creates tree items. This allows extending these elements by
 * extending the factory and returning extended versions of the elements.
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public class ItemsFactory {
	public ModelElementItem createModelElementItem(final EObject eObject,
			final ITreeElement treeParent, final AppearanceConfiguration appearanceConfiguration) {
		return new ModelElementItem(eObject, treeParent, appearanceConfiguration);
	}

	public LinkItem createLinkItem(final EObject parent, final ITreeElement treeParent,
			final EReference reference, final AppearanceConfiguration appearanceConfiguration) {
		return new LinkItem(parent, treeParent, reference, appearanceConfiguration);
	}
}
