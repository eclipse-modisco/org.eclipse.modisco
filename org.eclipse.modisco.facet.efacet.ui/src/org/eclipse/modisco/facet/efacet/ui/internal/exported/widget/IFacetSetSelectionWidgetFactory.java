/*******************************************************************************
 * Copyright (c) 2012, 2019 CEA LIST and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - Bug 372865 - FacetSet selection dialog
 *******************************************************************************/
package org.eclipse.modisco.facet.efacet.ui.internal.exported.widget;

import org.eclipse.modisco.facet.efacet.ui.internal.widget.FacetSetSelectionWidgetFactory;
import org.eclipse.swt.widgets.Composite;

/**
 * Factory for {@link IFacetSetSelectionWidget}
 * 
 * @since 0.2.0
 * @noextend This interface is not intended to be extended by clients.
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface IFacetSetSelectionWidgetFactory {
	/** This is the default instance of this interface. */
	IFacetSetSelectionWidgetFactory DEFAULT = new FacetSetSelectionWidgetFactory();

	/**
	 * Open a dialog to let the user select ETypedElements
	 * 
	 * @param selectionMaxSize
	 *            the maximum number of typed elements that the user can select.
	 * @param allowEmpty
	 *            whether to allow the user to select no ETypedElement (i.e : select <code>null</code>)
	 * @param parentComposite
	 *            the parent composite
	 * @param onChange
	 *            called when the selection changes
	 */
	IFacetSetSelectionWidget createFacetSetSelectionWidget(
			int selectionMaxSize,
			boolean allowEmpty,
			Composite parentComposite,
			Runnable onChange);
}
