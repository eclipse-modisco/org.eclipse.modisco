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
package org.eclipse.gmt.modisco.infra.browser.custom.examples.java.jdk;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.java.ClassDeclaration;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.Type;
import org.eclipse.gmt.modisco.java.TypeAccess;
import org.eclipse.gmt.modisco.java.TypeDeclaration;
import org.eclipse.gmt.modisco.java.internal.util.JavaUtil;

public final class Utils {

	private static final boolean DEBUG = false;

	private Utils() {
		// This is an utility class
	}

	private static boolean contains(final EList<TypeAccess> superInterfaces,
			final TypeDeclaration type) {
		for (TypeAccess typeAccess : superInterfaces) {
			if (typeAccess.getType() == type) {
				return true;
			}
		}
		return false;
	}

	public static boolean isKindOf(final TypeDeclaration typeDeclaration,
			final TypeDeclaration superType) {
		if (contains(typeDeclaration.getSuperInterfaces(), superType)) {
			return true;
		}
		if (typeDeclaration instanceof ClassDeclaration) {
			ClassDeclaration classDeclaration = (ClassDeclaration) typeDeclaration;
			if (classDeclaration.getSuperClass() != null) {
				if (classDeclaration.getSuperClass().getType() == superType) {
					return true;
				}
				Type parent = classDeclaration.getSuperClass().getType();
				if (parent instanceof TypeDeclaration) {
					if (isKindOf((TypeDeclaration) parent, superType)) {
						return true;
					}
				}
			}
		}
		for (TypeAccess superInterfaceTA : typeDeclaration.getSuperInterfaces()) {
			if (superInterfaceTA.getType() instanceof TypeDeclaration) {
				TypeDeclaration typeDeclaration2 = (TypeDeclaration) superInterfaceTA.getType();
				if (isKindOf(typeDeclaration2, superType)) {
					return true;
				}
			}
		}
		return false;
	}

	public static TypeDeclaration getInterface(final TypeDeclaration typeDeclaration,
			final String qualifiedName) {
		for (EObject eObject : typeDeclaration.eResource().getContents()) {
			if (eObject instanceof Model) {
				Model model = (Model) eObject;
				model.getOwnedElements();
				EObject foundEObject = JavaUtil
						.getNamedElementByQualifiedName(model, qualifiedName);
				if (foundEObject instanceof TypeDeclaration) {
					TypeDeclaration type = (TypeDeclaration) foundEObject;
					return type;
				}
				if (Utils.DEBUG) {
					System.err.println(qualifiedName + " is not an InterfaceDeclaration."); //$NON-NLS-1$
				}
			}
		}
		if (Utils.DEBUG) {
			System.err.println(qualifiedName + " not found."); //$NON-NLS-1$
		}
		return null;
	}

}
