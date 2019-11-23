/**
 * Copyright (c) 2012, 2019 Mia-Software.
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
package org.eclipse.modisco.facet.util.ui.internal.exported.widget.getorcreate;

import org.eclipse.modisco.facet.util.ui.internal.exported.util.widget.component.getorcreate.AbstractGetOrCreateElementWidget;
import org.eclipse.modisco.facet.util.ui.internal.exported.widget.IAbstractWidget;


/**
 * Interface.
 * 
 * 
 * @see AbstractGetOrCreateElementWidget
 * @since 0.3
 * @noextend This interface is not intended to be extended by clients.
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface IAbstractGetOrCreateElementWidget extends IAbstractWidget {

	/**
	 * @return the text field.
	 */
	String getText();
	
	/**
	 * Set the text field.
	 * 
	 * @param text
	 *            the new text.
	 */
	void setText(String text);

}