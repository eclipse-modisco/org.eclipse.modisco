/*******************************************************************************
 * Copyright (c) 2012, 2015 Mia-Software, and CEA-LIST.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - Bug 370806 - [table] rewrite the "allowed contents" query selection dialog for v0.2
 *     Vincent Lorenzo (CEA-LIST) -  Bug 372644 - Create Customizable tooltips for the TreeViewer using a CustomizableLabelProvider
 *     Gregoire Dupe (Mia-Software) - Bug 372626 - Aggregates
 *     Thomas Cicognani (Mia-Software) - Bug 472075 - Update API to create UI shortcuts to activate FacetSets 
 *******************************************************************************/
package org.eclipse.modisco.facet.efacet.ui.internal.widget;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.facet.custom.core.ICustomizationManager;
import org.eclipse.modisco.facet.efacet.ui.internal.exported.widget.IETypedElementSelectionWidget;
import org.eclipse.modisco.facet.efacet.ui.internal.exported.widget.IETypedElementSelectionWidgetFactory;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public class ETypedElementSelectionWidgetFactory implements IETypedElementSelectionWidgetFactory {

	public IETypedElementSelectionWidget createETypedElementSelectionWidget(
			final int selectionMaxSize, final boolean allowEmpty,
			final Composite parentComposite,
			final ICustomizationManager customManager,
			final Collection<? extends EObject> knownEPackage) {
		final ETypedElementSelectionControlManager[] control = new ETypedElementSelectionControlManager[1];
		// must be synchronous, otherwise the shell is not created before SynchronizedETypedElementSelectionWidget, and SynchronizedComposite throws a NPE
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				control[0] = new ETypedElementSelectionControlManager(
						parentComposite, selectionMaxSize, allowEmpty,
						knownEPackage);
				control[0].createContents();
			}
		});
		return new SynchronizedETypedElementSelectionWidget(control[0]);
	}
}
