/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.query.core;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gmt.modisco.infra.query.ModelQuery;
import org.eclipse.swt.custom.StyledText;

/**
 * Implement this interface if you want to customize the tooltip that is shown
 * for a specific kind of queries.
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public interface IModelQueryTooltip {
	/**
	 * Set the tooltip text into the {@link StyledText} component.
	 * 
	 * @param modelQuery
	 *            the query that is beeing hovered, and for which the tooltip
	 *            should be displayed
	 * @param styledText
	 *            the component that is used to display the text, which can be
	 *            formatted with styles (bold, etc.)
	 */
	void setTextFor(final ModelQuery modelQuery, final StyledText styledText);

	/** Defines the type of query that this tooltip appears for. */
	EClass getHandledQueryType();
}
