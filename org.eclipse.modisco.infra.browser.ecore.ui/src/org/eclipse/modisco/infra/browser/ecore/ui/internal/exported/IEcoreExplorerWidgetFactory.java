/**
 * Copyright (c) 2015 Soft-Maint, and Mia-Software
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Thomas Cicognani (Soft-Maint) - Bug 471020 - Ecore Explorer View
 *    Grégoire Dupé (Mia-Software) - Bug 471020 - Ecore Explorer View
 */
package org.eclipse.modisco.infra.browser.ecore.ui.internal.exported;

import org.eclipse.jface.action.MenuManager;
import org.eclipse.modisco.infra.browser.ecore.ui.internal.widget.EcoreExplorerWidgetFactory;
import org.eclipse.swt.widgets.Composite;

/**
 * @noextend
 * @noimplement
 */
public interface IEcoreExplorerWidgetFactory {

	IEcoreExplorerWidgetFactory DEFAULT = new EcoreExplorerWidgetFactory();

	/**
	 * Constructor called by a Dialog window because a Dialog doesn't have any
	 * MenuManager. A default MenuManager is created.
	 */
	IEcoreExplorerWidget createWidget(Composite parent);

	IEcoreExplorerWidget createWidget(Composite parent, MenuManager menuManager);

}
