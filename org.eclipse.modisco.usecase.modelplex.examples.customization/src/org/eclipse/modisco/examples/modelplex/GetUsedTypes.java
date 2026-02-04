/*
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 */

package org.eclipse.modisco.examples.modelplex;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;

/**
 * @author Gabriel Barbier
 *
 */
public class GetUsedTypes implements IJavaModelQuery<Type, EList<Type>> {

	public final Set<Type> getUsedTypes(final Type contextType) {
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

	private final Type getContainerType(final EObject source) {
		Type result = null;
		if (source.eContainer() instanceof Type) {
			result = (Type) source.eContainer();
		} else {
			result = this.getContainerType(source.eContainer());
		}
		return result;
	}

	public EList<Type> evaluate(final Type context,
			final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		EList<Type> result = new BasicEList<Type>();
		for (Type subtype : this.getUsedTypes(context)) {
			result.add(subtype);
		}
		return result;
	}
}
