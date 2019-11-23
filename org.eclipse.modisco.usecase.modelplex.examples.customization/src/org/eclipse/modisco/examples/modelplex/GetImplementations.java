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
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.InterfaceDeclaration;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.TypeDeclaration;

/**
 * @author Gabriel Barbier
 *
 */
public class GetImplementations implements
		IJavaModelQuery<InterfaceDeclaration, EList<ClassDeclaration>> {

	private final Set<TypeDeclaration> getAllSubTypes(final TypeDeclaration contextClass) {
		Set<TypeDeclaration> result = new HashSet<TypeDeclaration>();
		TreeIterator<EObject> content = contextClass.eResource().getAllContents();
		while (content.hasNext()) {
			EObject eObject = content.next();
			if (eObject instanceof TypeDeclaration) {
				TypeDeclaration currentClassDeclaration = (TypeDeclaration) eObject;
				if (isSuperTypeOf(contextClass, currentClassDeclaration)) {
					result.add(currentClassDeclaration);
					result.addAll(this.getAllSubTypes(currentClassDeclaration));
				}
			}
		}
		return result;
	}
	/**
	 * @param contextClass
	 * @return
	 */
	private final boolean isSuperTypeOf(final TypeDeclaration self,
			final TypeDeclaration typeDeclaration) {
		if (typeDeclaration.getSuperInterfaces().contains(self)) {
			return true;
		}
		for (TypeAccess superTypeAccess : typeDeclaration.getSuperInterfaces()) {
			if (superTypeAccess.getType() instanceof TypeDeclaration) {
				TypeDeclaration superType = (TypeDeclaration) superTypeAccess
						.getType();
				if (superType == self || isSuperTypeOf(self, superType)) {
					return true;
				}
			}
		}
		if (typeDeclaration instanceof ClassDeclaration) {
			ClassDeclaration classDeclaration = (ClassDeclaration) typeDeclaration;
			if (classDeclaration.getSuperClass() != null && classDeclaration.getSuperClass().getType() == self) {
				return true;
			}
			if (classDeclaration.getSuperClass() != null
					&& classDeclaration.getSuperClass().getType() instanceof TypeDeclaration) {
				TypeDeclaration superType = (TypeDeclaration) classDeclaration
						.getSuperClass().getType();
				if (isSuperTypeOf(self, superType)) {
					return true;
				}
			}
		}
		return false;
	}

	public EList<ClassDeclaration> evaluate(final InterfaceDeclaration context,
			final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		EList<ClassDeclaration> result = new BasicEList<ClassDeclaration>();
		for (TypeDeclaration child : this.getAllSubTypes(context)) {
			if (child instanceof ClassDeclaration) {
				result.add((ClassDeclaration) child);
			}
		}
		return result;
	}
}
