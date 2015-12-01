/** 
 * Copyright (c) 2015 Soft-Maint, and Mia-Software
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Thomas Cicognani (Soft-Maint) - Bug 471020 - Ecore Explorer View
 *    Grégoire Dupé (Mia-Software) - Bug 471020 - Ecore Explorer View
 */
package org.eclipse.modisco.infra.browser.ecore.ui.internal.exported;

//TODO Must be moved to org.eclipe.modisco.util.ui

/**
 * @noextend
 * @noimplement
 */
public interface IView<W extends Object> {

	W getWidget();
	
}