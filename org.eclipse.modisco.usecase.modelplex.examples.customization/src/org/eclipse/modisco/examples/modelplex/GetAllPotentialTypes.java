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
import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.InterfaceDeclaration;
import org.eclipse.modisco.java.ParameterizedType;
import org.eclipse.modisco.java.SingleVariableDeclaration;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.VariableDeclaration;
import org.eclipse.modisco.java.VariableDeclarationFragment;

/**
 * @author Gabriel Barbier
 *
 */
public class GetAllPotentialTypes implements
		IJavaModelQuery<VariableDeclaration, EList<Type>> {

	private final Type getType(final VariableDeclaration element) {
		Type result = null;
		if (element != null) {
			if (element instanceof SingleVariableDeclaration) {
				SingleVariableDeclaration variable = (SingleVariableDeclaration) element;
				result = variable.getType().getType();
			} else if (element instanceof VariableDeclarationFragment) {
				VariableDeclarationFragment variable = (VariableDeclarationFragment) element;
				result = variable.getVariablesContainer().getType().getType();
			} else {
				// it is an EnumConstantDeclaration -> no types
				result = (Type) element.eContainer();
			}
		}
		return result;
	}

	private final Set<Type> getAllSubTypes(final Type contextType) {
		Set<Type> result = new HashSet<Type>();
		TreeIterator<EObject> content = contextType.eResource()
				.getAllContents();
		while (content.hasNext()) {
			EObject eObject = content.next();
			if (eObject instanceof Type) {
				Type currentType = (Type) eObject;
				if (isSuperTypeOf(contextType, currentType)) {
					result.add(currentType);
					result.addAll(getAllSubTypes(currentType));
				}
			}
		}
		return result;
	}

	/**
	 * @param contextClass
	 * @return
	 */
	private final boolean isSuperTypeOf(final Type parent, final Type type) {
		boolean result = false;
		if (type instanceof ParameterizedType) {
			ParameterizedType parameterizedType = (ParameterizedType) type;
			result = isSuperTypeOf(parent, parameterizedType.getType()
					.getType());
		} else if (type instanceof AbstractTypeDeclaration) {
			AbstractTypeDeclaration abstractTypeDeclaration = (AbstractTypeDeclaration) type;
			for (TypeAccess superTypeAccess : abstractTypeDeclaration
					.getSuperInterfaces()) {
				Type superType = superTypeAccess.getType();
				if ((superType == parent)
						|| (isSuperTypeOf(parent, superType))) {
					result = true;
				}
			}
			if (!result) {
				if (type instanceof ClassDeclaration) {
					ClassDeclaration classDeclaration = (ClassDeclaration) type;
					if (classDeclaration.getSuperClass() != null) {
						Type superType = classDeclaration.getSuperClass()
								.getType();
						if ((superType == parent)
								|| (isSuperTypeOf(parent, superType))) {
							result = true;
						}
					}
				}
			}
		}
		/*
		 * else : nothing to check ? It could be only ArrayType, PrimitiveType
		 * or TypeParameter
		 */

		return result;
	}

	public EList<Type> evaluate(final VariableDeclaration context,
			final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		return getAllPotentialTypes(context);
	}

	public EList<Type> getAllPotentialTypes(final VariableDeclaration context) {
		EList<Type> result = new BasicEList<Type>();
		Type sourceType = getType(context);
		if (sourceType != null) {
			for (Type subtype : getAllSubTypes(sourceType)) {
				if (subtype instanceof AbstractTypeDeclaration) {
					if (!(subtype instanceof InterfaceDeclaration)) {
						result.add(subtype);
					}
				} else {
					result.add(subtype);
				}
			}
		}
		return result;
	}
}
