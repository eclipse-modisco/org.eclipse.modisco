/*******************************************************************************
 * Copyright (c) 2012, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - Bug 370806 - [table] rewrite the "allowed contents" query selection dialog for v0.2
 *     Vincent Lorenzo (CEA-LIST) -  Bug 372644 - Create Customizable tooltips for the TreeViewer using a CustomizableLabelProvider
 *******************************************************************************/
package org.eclipse.modisco.facet.efacet.ui.internal.widget;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.viewers.IOpenListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.modisco.facet.efacet.ui.internal.exported.widget.IETypedElementSelectionWidget;
import org.eclipse.ui.dialogs.FilteredTree;

public interface IETypedElementSelectionWidgetInternal extends IETypedElementSelectionWidget {

	/** Adds a listener that is notified when an element is double-clicked or the Enter key is pressed */
	void addOpenListener(IOpenListener openListener);

	/** Adds a listener that is notified when the selection changes */
	void addSelectionChangedListener(ISelectionChangedListener listener);

	/** @return the validation status : the selection is not valid if {@link IStatus#getSeverity()} >= {@link IStatus#ERROR} */
	IStatus getValidationStatus();

	/** @return whether the widget is disposed */
	boolean isDisposed();

	FilteredTree getFilteredTree();
	
	void createContents();

	void setSelection(IStructuredSelection selection);
	
}