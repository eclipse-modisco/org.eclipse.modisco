/*******************************************************************************
 * Copyright (c) 2008, 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *
 *******************************************************************************/

package org.eclipse.modisco.infra.browser.core;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.infra.browser.editors.BrowserConfiguration;
import org.eclipse.modisco.infra.browser.uicore.internal.model.BigListItem;

/**
 * A list of instances which match a search string provided by the user, for
 * displaying in the model browser tree.
 */
public class SearchResults {

	/** The elements that match the search */
	private final ArrayList<EObject> elements = new ArrayList<EObject>();

	/** The configuration of the editor */
	private final BrowserConfiguration browserConfiguration;

	public SearchResults(final BrowserConfiguration browserConfiguration) {
		this.browserConfiguration = browserConfiguration;
	}

	public List<?> getElements() {
		return BigListItem.splitElements(null, null, this.elements, this.browserConfiguration
				.getAppearanceConfiguration(), false);
	}

	/** Add this instance to the list of instances matching the search */
	public void add(final EObject object) {
		this.elements.add(object);
	}
}
