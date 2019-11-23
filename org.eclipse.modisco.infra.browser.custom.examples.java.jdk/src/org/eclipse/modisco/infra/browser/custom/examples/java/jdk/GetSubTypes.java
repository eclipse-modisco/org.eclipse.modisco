/*******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *    Nicolas Guyomar (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.custom.examples.java.jdk;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.TypeDeclaration;

public class GetSubTypes implements
		IJavaModelQuery<TypeDeclaration, EList<TypeDeclaration>> {

	public EList<TypeDeclaration> evaluate(final TypeDeclaration context,
			final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		EList<TypeDeclaration> result = new BasicEList<TypeDeclaration>();
		TypeDeclaration contextClass = context;
		TreeIterator<EObject> content = context.eResource().getAllContents();
		while (content.hasNext()) {
			EObject eObject = content.next();
			if (eObject instanceof TypeDeclaration) {
				TypeDeclaration currentClassDeclaration = (TypeDeclaration) eObject;
				if (isSuperTypeOf(contextClass, currentClassDeclaration)) {
					result.add(currentClassDeclaration);
				}
			}
		}
		return result;
	}

	/**
	 * @param contextClass
	 * @return
	 */
	private boolean isSuperTypeOf(final TypeDeclaration self,
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
			if (classDeclaration.getSuperClass() != null
					&& classDeclaration.getSuperClass().getType() == self) {
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


}
