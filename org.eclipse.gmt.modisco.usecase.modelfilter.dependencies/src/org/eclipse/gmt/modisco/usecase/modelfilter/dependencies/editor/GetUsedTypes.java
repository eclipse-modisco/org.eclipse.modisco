/**
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 */

package org.eclipse.gmt.modisco.usecase.modelfilter.dependencies.editor;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.java.Type;
import org.eclipse.gmt.modisco.java.TypeAccess;

/**
 * @author Gabriel Barbier
 * 
 * 
 * @deprecated use matching org.eclipse.modisco.x.y.z component,
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470806
 */
@Deprecated
public class GetUsedTypes {

	final Set<Type> getUsedTypes(Type contextType) {
		Set<Type> result = new HashSet<Type>();
		TreeIterator<EObject> content = contextType.eResource().getAllContents();
		while (content.hasNext()) {
			EObject eObject = content.next();
			if (eObject instanceof Type) {
				Type currentType = (Type) eObject;
				for (TypeAccess typeAccess : currentType.getUsagesInTypeAccess()) {
					Type containerType = this.getContainerType(typeAccess);
					if (contextType == containerType) {
						result.add(currentType);
					}
				}
			}
		}
		return result;
	}

	private final Type getContainerType(EObject source) {
		Type result = null;
		if (source.eContainer() instanceof Type) {
			result = (Type) source.eContainer();
		} else {
			result = this.getContainerType(source.eContainer());
		}
		return result;
	}
}
