/**
 * *******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *
 * 	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 * *******************************************************************************
 */
package org.eclipse.modisco.jee.queries.annotations.internal;

import java.util.List;

import org.eclipse.modisco.java.BodyDeclaration;
import org.eclipse.modisco.java.ClassDeclaration;

public class ResolveInheritance {

	public Boolean evaluate(final BodyDeclaration context,
			final String superTypeName) {

		if (context instanceof ClassDeclaration) {
			ClassDeclaration classDeclaration = (ClassDeclaration) context;
			return evaluateSuperClass(classDeclaration, superTypeName);
		}
		return Boolean.FALSE;
	}

	public Boolean evaluateSuperClass(final ClassDeclaration classDeclaration,
			final String superTypeName) {

		if (classDeclaration.getSuperClass() != null) {
			if (classDeclaration.getSuperClass().getType() != null) {
				if (classDeclaration.getSuperClass().getType().getName()
						.equalsIgnoreCase(superTypeName)) {
					return Boolean.TRUE;
				}

				if (classDeclaration.getSuperClass().getType() instanceof ClassDeclaration) {
					return evaluateSuperClass(
							(ClassDeclaration) classDeclaration.getSuperClass()
									.getType(), superTypeName);
				}
			}
		}

		return Boolean.FALSE;
	}

	public Boolean evaluate(final BodyDeclaration context,
			final List<String> nameList) {

		for (String aName : nameList) {
			if (evaluate(context, aName).equals(Boolean.TRUE)) {
				return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
	}

}
