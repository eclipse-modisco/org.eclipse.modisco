/*******************************************************************************
 * Copyright (c) 2012 CEA LIST and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - Bug 372865 - FacetSet selection dialog
 *******************************************************************************/
package org.eclipse.modisco.facet.efacet.ui.internal.widget;

import org.eclipse.modisco.facet.efacet.ui.internal.exported.widget.IFacetSetSelectionWidget;
import org.eclipse.modisco.facet.efacet.ui.internal.exported.widget.IFacetSetSelectionWidgetFactory;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public class FacetSetSelectionWidgetFactory implements IFacetSetSelectionWidgetFactory {

	public IFacetSetSelectionWidget createFacetSetSelectionWidget(final int selectionMaxSize, final boolean allowEmpty,
			final Composite parentComposite, final Runnable onChange) {
		final FacetSetSelectionControl[] control = new FacetSetSelectionControl[1];
		// must be synchronous, otherwise the shell is not created before SynchronizedFacetSetSelectionWidget, and
		// SynchronizedComposite throws a NPE
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				control[0] = new FacetSetSelectionControl(parentComposite, selectionMaxSize, allowEmpty, onChange);
				control[0].createContents();
			}
		});
		return new SynchronizedFacetSetSelectionWidget(control[0]);
	}
}
