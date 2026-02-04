/**
 * Copyright (c) 2015, 2019 Soft-Maint, and Mia-Software
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Thomas Cicognani (Soft-Maint) - Bug 471020 - Ecore Explorer View
 *    Thomas Cicognani (Soft-Maint) - Bug 472041 - [New Browser] Add a customization counting instances by EClass in the same Resource
 *    Grégoire Dupé (Mia-Software) - Bug 471020 - Ecore Explorer View
 */
package org.eclipse.modisco.infra.browser.ecore.ui.internal.exported;

import java.util.Collection;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * @noextend
 * @noimplement
 */
public interface IEcoreExplorerWidget extends IAdaptable {

	void changeInput(Collection<EObject> eObjects);

	Set<EObject> getInstancesOfFromCurrentResources(EClass eClass);

	Set<EObject> getInstancesOfFromCurrentResourceSets(EClass eClass);

}
