/**
 * Copyright (c) 2012, 2019 Mia-Software and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *  	Grégoire Dupé (Mia-Software) - Bug 387470 - [EFacet][Custom] Editors
 */
package org.eclipse.modisco.facet.util.ui.internal.exported.util.widget.command;

import org.eclipse.core.commands.Command;
import org.eclipse.modisco.facet.util.ui.internal.exported.widget.IAbstractWidget;

/**
 * @since 0.3
 */
public interface ICommandWidget extends IAbstractWidget {

	/**
	 * Return the command for the widget specific action. The factory can be
	 * used for the creation of the {@link Command}.
	 * 
	 * @see IFacetCommandFactory
	 * 
	 * @return the command.
	 */
	Object getCommand();

	/**
	 * This method is execute when the "OK" button of the {@link #parent} is
	 * pressed.
	 */
	void onDialogValidation();
	
	<A> A adapt(Class<A> adapterType);

}