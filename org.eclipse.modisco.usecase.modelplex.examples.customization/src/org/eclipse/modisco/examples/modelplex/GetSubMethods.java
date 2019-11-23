/*
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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
import org.eclipse.modisco.java.AbstractMethodDeclaration;
import org.eclipse.modisco.java.BodyDeclaration;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.TypeDeclaration;
import org.eclipse.modisco.java.UnresolvedMethodDeclaration;

/**
 * @author Gabriel Barbier
 *
 */
public class GetSubMethods
		implements
		IJavaModelQuery<AbstractMethodDeclaration, EList<AbstractMethodDeclaration>> {

	private final TypeDeclaration getTypeDeclaration(final EObject element) {
		TypeDeclaration result = null;
		if (element != null) {
			if (element instanceof TypeDeclaration) {
				result = (TypeDeclaration) element;
			} else {
				result = this.getTypeDeclaration(element.eContainer());
			}
		}
		return result;
	}

	private final Set<TypeDeclaration> getAllSubTypes(
			final TypeDeclaration contextClass) {
		Set<TypeDeclaration> result = new HashSet<TypeDeclaration>();
		TreeIterator<EObject> content = contextClass.eResource()
				.getAllContents();
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

	public EList<AbstractMethodDeclaration> evaluate(
			final AbstractMethodDeclaration context,
			final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		EList<AbstractMethodDeclaration> result = new BasicEList<AbstractMethodDeclaration>();
		if (!(context instanceof UnresolvedMethodDeclaration)) {
			TypeDeclaration parentType = this.getTypeDeclaration(context);
			for (TypeDeclaration subtype : this.getAllSubTypes(parentType)) {
				/*
				 * we have to retrieve corresponding method same name, same
				 * number of parameters same name of parameters ? -> may change
				 * same type of parameters ? may be a subtype
				 */
				for (BodyDeclaration body : subtype.getBodyDeclarations()) {
					if (body instanceof AbstractMethodDeclaration) {
						AbstractMethodDeclaration subMethod = (AbstractMethodDeclaration) body;
						if (context.getName().equals(body.getName())) {
							if (context.getParameters().size() == subMethod
									.getParameters().size()) {
								result.add(subMethod);
							}
						}
					}
				}
			}
		}
		return result;
	}
}
