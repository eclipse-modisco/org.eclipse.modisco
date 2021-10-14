/**
 *  Copyright (c) 2013, 2019 Soft-Maint.
 *  
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 * 
 *  Contributors:
 *      David Couvrand (Soft-Maint) - Bug 422058 - Implementation of strikethrough and underline in the CustomizedLabelProvider
 */
package org.eclipse.modisco.facet.custom.ui;

import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.FacetOperation;

/**
 * @since 0.4
 * @noimplement This interface is not intended to be implemented by clients.
 * @noextend This interface is not intended to be extended by clients.
 */
public interface IFontPropertiesHandler {

	FacetOperation getBackgroundProperty();

	FacetOperation getForegroundProperty();

	FacetOperation getFontNameProperty();

	FacetOperation getFontSizeProperty();

	FacetOperation getIsBoldProperty();

	FacetOperation getIsItalicProperty();

	FacetOperation getIsVisible();

	FacetOperation getIsUnderlinedProperty();

	FacetOperation getIsStruckthroughProperty();
}
