/*******************************************************************************
 * Copyright (c) 2008, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *
 *******************************************************************************/

package org.eclipse.gmt.modisco.infra.browser.core;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.infra.browser.editors.BrowserConfiguration;
import org.eclipse.gmt.modisco.infra.browser.uicore.internal.model.BigListItem;

/**
 * A list of instances of one or more metaclasses selected in the list of
 * metaclasses, displayed in the model browser tree.
 */
public class MetaclassList {

	/**
	 * The configuration of the browser used to display the list of metaclasses
	 * and the tree of model elements
	 */
	private final BrowserConfiguration browserConfiguration;

	/** The list of metaclasses whose elements must be displayed */
	private final EClass[] metaclasses;

	public MetaclassList(final BrowserConfiguration browserConfiguration, final EClass[] metaclasses) {
		this.browserConfiguration = browserConfiguration;
		this.metaclasses = metaclasses;
	}

	private int cachedElementsModCount = -1;
	private List<?> cachedElements = null;

	public synchronized List<?> getElements() {
		if (this.cachedElements == null
				|| this.cachedElementsModCount != this.browserConfiguration
						.getAppearanceConfiguration().getModCount()) {
			final ArrayList<EObject> allElements = new ArrayList<EObject>();

			final InstancesForMetaclasses instancesForMetaclasses = this.browserConfiguration
					.getInstancesForMetaclasses();
			for (final EClass eClass : this.metaclasses) {
				final InstancesForMetaclass instancesForMetaclass = instancesForMetaclasses
						.getInstancesForMetaclass(eClass);
				if (instancesForMetaclass != null) {
					if (this.browserConfiguration.getAppearanceConfiguration()
							.isDisplayInstancesOfSubclasses()) {
						allElements.addAll(instancesForMetaclass.getDerivedElements());
					} else {
						final ArrayList<EObject> elements = instancesForMetaclass.getElements();
						allElements.addAll(elements);
					}
				}
				// if null, ignore (to be expected since refresh is in a Job)
			}
			this.cachedElements = BigListItem.splitElements(null, null, allElements,
					this.browserConfiguration.getAppearanceConfiguration(), false);
			this.cachedElementsModCount = this.browserConfiguration.getAppearanceConfiguration()
					.getModCount();
		}
		return this.cachedElements;
	}
}
