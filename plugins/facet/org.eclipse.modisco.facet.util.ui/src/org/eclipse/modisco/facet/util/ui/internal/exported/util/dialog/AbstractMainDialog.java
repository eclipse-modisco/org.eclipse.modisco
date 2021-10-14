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
package org.eclipse.modisco.facet.util.ui.internal.exported.util.dialog;

import org.eclipse.modisco.facet.util.ui.internal.exported.WidgetProperties;
import org.eclipse.modisco.facet.util.ui.internal.exported.util.widget.AbstractWidget;
import org.eclipse.modisco.facet.util.ui.internal.exported.util.widget.command.AbstractCommandWidget;
import org.eclipse.modisco.facet.util.ui.internal.exported.util.widget.command.ICommandWidget;

/**
 * This abstract class will create a dialog. All the action's dialog must
 * extends this class. It provides a simple way to create a standard dialog for
 * this ui.</p>
 * 
 * A single {@link AbstractCommandWidget} is created by the dialog wich will
 * contain all the subwidgets {@link AbstractWidget}.
 * 
 * The dialog have to create all the properties {@link WidgetProperties} that
 * the widgets {@link AbstractCommandWidget} will need.
 * 
 * @see AbstractCommandWidget
 * @see AbstractWidget
 * @see AbstractAddElementDialog
 * @since 0.3
 */
public abstract class AbstractMainDialog<W extends ICommandWidget>
		extends AbstractDialog<Object, W> {

	private final Object selection;

	/**
	 * Constructor.
	 * 
	 * @param callback
	 *            the callback.
	 * @param editedElement
	 *            the selection in the model (ecore file).
	 */
	protected AbstractMainDialog(final Object editedElement) {
		super();
		this.selection = editedElement;
	}

	/**
	 * @return the selection in the model.
	 */
	protected Object getSelection() {
		return this.selection;
	}


}
