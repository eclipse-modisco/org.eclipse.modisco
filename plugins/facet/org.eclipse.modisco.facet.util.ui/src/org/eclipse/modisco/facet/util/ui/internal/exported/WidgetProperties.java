/**
 * Copyright (c) 2012, 2019 Mia-Software and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *  	Alban Ménager (Soft-Maint) - Bug 387470 - [EFacet][Custom] Editors
 *  	Grégoire Dupé (Mia-Software) - Bug 387470 - [EFacet][Custom] Editors
 */
package org.eclipse.modisco.facet.util.ui.internal.exported;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.ETypedElement;

/**
 * This class contain all the possible properties for the facets creations.
 * 
 * @since 0.3
 */
public class WidgetProperties<T extends Object> {

	// TODO This class must not be exposed.

	private final Map<T, PropertyElement> properties;

	public WidgetProperties() {
		this.properties = new HashMap<T, PropertyElement>();
	}

	/**
	 * Add a new property in the map.
	 * 
	 * @param element
	 *            the key, the {@link ETypedElement} of the property.
	 * @param property
	 *            the property.
	 */
	public void addProperty(final T element,
 final PropertyElement property) {
		getProperties().put(element, property);
	}

	/**
	 * Get the list of properties.
	 * 
	 * @return a map of the properties.
	 */
	private Map<T, PropertyElement> getProperties() {
		return this.properties;
	}

	/**
	 * Return the {@link PropertyElement} for the given element.
	 * 
	 * @param element
	 *            the element.
	 * @return the property.
	 */
	public PropertyElement getProperty(final T element) {
		return getProperties().get(element);
	}
}
