/**
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 */

package org.eclipse.modisco.usecase.modelfilter.dependencies.ui.internal.editor;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;

public class GetUsedTypes {

	final Set<Type> getUsedTypes(final Type contextType) {
		Set<Type> result = new HashSet<Type>();
		TreeIterator<EObject> content = contextType.eResource().getAllContents();
		while (content.hasNext()) {
			EObject eObject = content.next();
			if (eObject instanceof Type) {
				Type currentType = (Type) eObject;
				for (TypeAccess typeAccess : currentType.getUsagesInTypeAccess()) {
					Type containerType = getContainerType(typeAccess);
					if (contextType == containerType) {
						result.add(currentType);
					}
				}
			}
		}
		return result;
	}

	private final Type getContainerType(final EObject source) {
		Type result = null;
		if (source.eContainer() instanceof Type) {
			result = (Type) source.eContainer();
		} else {
			result = getContainerType(source.eContainer());
		}
		return result;
	}
}
