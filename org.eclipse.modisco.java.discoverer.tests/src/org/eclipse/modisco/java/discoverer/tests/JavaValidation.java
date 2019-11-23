/*******************************************************************************
 * Copyright (c) 2009, 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *    Romain Dervaux (Mia-Software)
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *    Fabien Giquel (Mia-Software) - Bug 342856 - improve Discoverers implementation
 *******************************************************************************/
package org.eclipse.modisco.java.discoverer.tests;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.java.AbstractMethodDeclaration;
import org.eclipse.modisco.java.AbstractMethodInvocation;
import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.AnonymousClassDeclaration;
import org.eclipse.modisco.java.BodyDeclaration;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.ClassInstanceCreation;
import org.eclipse.modisco.java.CompilationUnit;
import org.eclipse.modisco.java.FieldDeclaration;
import org.eclipse.modisco.java.ImportDeclaration;
import org.eclipse.modisco.java.Initializer;
import org.eclipse.modisco.java.InterfaceDeclaration;
import org.eclipse.modisco.java.MemberRef;
import org.eclipse.modisco.java.MethodDeclaration;
import org.eclipse.modisco.java.MethodRef;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.NamedElement;
import org.eclipse.modisco.java.Package;
import org.eclipse.modisco.java.PackageAccess;
import org.eclipse.modisco.java.PrimitiveType;
import org.eclipse.modisco.java.SingleVariableAccess;
import org.eclipse.modisco.java.SingleVariableDeclaration;
import org.eclipse.modisco.java.TagElement;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.UnresolvedItem;
import org.eclipse.modisco.java.UnresolvedItemAccess;
import org.eclipse.modisco.java.VariableDeclarationExpression;
import org.eclipse.modisco.java.VariableDeclarationFragment;
import org.eclipse.modisco.java.VariableDeclarationStatement;
import org.eclipse.modisco.java.internal.util.JavaUtil;

public class JavaValidation {

	public static int validate(final Resource resource,
			@SuppressWarnings("unused") final PrintStream ps) {
		Status status = new Status(IStatus.INFO, Activator.PLUGIN_ID,
				"Begin validation"); //$NON-NLS-1$
		Activator.getDefault().getLog().log(status);
		int nbError = 0;
		TreeIterator<EObject> treeIterator = resource.getAllContents();
		while (treeIterator.hasNext()) {
			EObject eObject = treeIterator.next();
			try {
				validate(eObject);
			} catch (Exception e) {
				Status status3 = new Status(IStatus.INFO, Activator.PLUGIN_ID,
						e.getMessage(), e);
				Activator.getDefault().getLog().log(status3);
				nbError++;
			}
		}
		Status status2 = new Status(IStatus.INFO, Activator.PLUGIN_ID,
				"End validation"); //$NON-NLS-1$
		Activator.getDefault().getLog().log(status2);
		return nbError;
	}

	private static void validate(final EObject eobject) {
		if (eobject instanceof BodyDeclaration) {
			BodyDeclaration typedObject = (BodyDeclaration) eobject;
			validate(typedObject);
		}
		if (eobject instanceof ClassDeclaration) {
			ClassDeclaration typedObject = (ClassDeclaration) eobject;
			validate(typedObject);
		}
		if (eobject instanceof Package) {
			Package typedObject = (Package) eobject;
			validate(typedObject);
		}
		if (eobject instanceof CompilationUnit) {
			CompilationUnit typedObject = (CompilationUnit) eobject;
			validate(typedObject);
		}
		if (eobject instanceof FieldDeclaration) {
			FieldDeclaration typedObject = (FieldDeclaration) eobject;
			validate(typedObject);
		}
		if (eobject instanceof NamedElement) {
			NamedElement typedObject = (NamedElement) eobject;
			validate(typedObject);
		}
		if (eobject instanceof VariableDeclarationFragment) {
			VariableDeclarationFragment typedObject = (VariableDeclarationFragment) eobject;
			validate(typedObject);
		}
		if (eobject instanceof MethodDeclaration) {
			MethodDeclaration typedObject = (MethodDeclaration) eobject;
			validate(typedObject);
		}
		if (eobject instanceof VariableDeclarationStatement) {
			VariableDeclarationStatement typedObject = (VariableDeclarationStatement) eobject;
			validate(typedObject);
		}
		if (eobject instanceof VariableDeclarationExpression) {
			VariableDeclarationExpression typedObject = (VariableDeclarationExpression) eobject;
			validate(typedObject);
		}
		if (eobject instanceof PrimitiveType) {
			PrimitiveType typedObject = (PrimitiveType) eobject;
			validate(typedObject);
		}
		if (eobject instanceof Model) {
			Model typedObject = (Model) eobject;
			validate(typedObject);
		}
		if (eobject instanceof InterfaceDeclaration) {
			InterfaceDeclaration typedObject = (InterfaceDeclaration) eobject;
			validate(typedObject);
		}
		if (eobject instanceof SingleVariableDeclaration) {
			SingleVariableDeclaration singleVariableDeclaration = (SingleVariableDeclaration) eobject;
			validate(singleVariableDeclaration);
		}
		if (eobject instanceof AbstractMethodDeclaration) {
			AbstractMethodDeclaration abstractMethodDeclaration = (AbstractMethodDeclaration) eobject;
			validate(abstractMethodDeclaration);
		}
		if (eobject instanceof TypeAccess) {
			TypeAccess typeAccess = (TypeAccess) eobject;
			validate(typeAccess);
		}
		if (eobject instanceof PackageAccess) {
			PackageAccess pckAccess = (PackageAccess) eobject;
			validate(pckAccess);
		}
		if (eobject instanceof SingleVariableAccess) {
			SingleVariableAccess varAccess = (SingleVariableAccess) eobject;
			validate(varAccess);
		}
		if (eobject instanceof UnresolvedItemAccess) {
			UnresolvedItemAccess unrAccess = (UnresolvedItemAccess) eobject;
			validate(unrAccess);
		}
		if (eobject instanceof AbstractMethodInvocation) {
			AbstractMethodInvocation methodInvocation = (AbstractMethodInvocation) eobject;
			validate(methodInvocation);
		}
		if (eobject instanceof MethodRef) {
			MethodRef methodRef = (MethodRef) eobject;
			validate(methodRef);
		}
		if (eobject instanceof MemberRef) {
			MemberRef memberRef = (MemberRef) eobject;
			validate(memberRef);
		}
		if (eobject instanceof TagElement) {
			TagElement tagElement = (TagElement) eobject;
			validate(tagElement);
		}
		if (eobject instanceof ImportDeclaration) {
			ImportDeclaration importDecl = (ImportDeclaration) eobject;
			validate(importDecl);
		}
	}

	private static void validate(final ClassDeclaration classDeclaration) {
		if (classDeclaration.getName() == null) {
			throw new ValidationException("Null class name: " //$NON-NLS-1$
					+ JavaUtil.getQualifiedName(classDeclaration));
		}
		if (classDeclaration.getName().length() == 0) {
			throw new ValidationException("Empty class name: " //$NON-NLS-1$
					+ JavaUtil.getQualifiedName(classDeclaration));
		}
		Iterator<BodyDeclaration> bodyDeclarations = classDeclaration
				.getBodyDeclarations().iterator();
		Map<String, Object> map = new HashMap<String, Object>();
		while (bodyDeclarations.hasNext()) {
			BodyDeclaration bodyDeclaration = bodyDeclarations.next();
			if (!(bodyDeclaration instanceof FieldDeclaration)
					&& !(bodyDeclaration instanceof Initializer)) {
				String qualifiedName = JavaUtil
						.getQualifiedName(bodyDeclaration);
				boolean exists = map.containsKey(qualifiedName);
				if (exists) {
					throw new ValidationException("Duplicate name: " //$NON-NLS-1$
							+ qualifiedName);
				}
				map.put(qualifiedName, null);
			}
		}
		if (classDeclaration.eContainer() instanceof Package
				&& (!classDeclaration.isProxy())
				&& classDeclaration.getOriginalCompilationUnit() == null) {
			throw new ValidationException(
					"Non proxy root class must refers its compilation units: " //$NON-NLS-1$
							+ JavaUtil.getQualifiedName(classDeclaration));
		}
	}

	private static boolean isOrphanType(final Type type) {
		boolean isOrphanResult;
		EObject container = type.eContainer();
		if (container instanceof Model) {
			Model model = (Model) container;
			isOrphanResult = model.getOrphanTypes().contains(type);
		} else {
			isOrphanResult = false;
		}
		return isOrphanResult;
	}

	private static void validate(
			final org.eclipse.modisco.java.InterfaceDeclaration interfaceDeclaration) {
		EObject container = interfaceDeclaration.eContainer();
		if ((!isOrphanType(interfaceDeclaration))
				&& (!interfaceDeclaration.isProxy())
				&& (container instanceof Package || container instanceof Model)
				&& interfaceDeclaration.getOriginalCompilationUnit() == null) {
			throw new ValidationException(
					"Non proxy Root interface must refers its compilation units: " //$NON-NLS-1$
							+ JavaUtil.getQualifiedName(interfaceDeclaration));
		}
	}

	private static void validate(final org.eclipse.modisco.java.Package aPackage) {
		if (aPackage.getName() == null) {
			throw new ValidationException("Null package name: " //$NON-NLS-1$
					+ JavaUtil.getQualifiedName(aPackage));
		}
		if (aPackage.getName().length() == 0) {
			throw new ValidationException("Empty package name: " //$NON-NLS-1$
					+ JavaUtil.getQualifiedName(aPackage));
		}
		Iterator<AbstractTypeDeclaration> abstractTypeDeclarations = aPackage
				.getOwnedElements().iterator();
		Map<String, Object> map = new HashMap<String, Object>();
		while (abstractTypeDeclarations.hasNext()) {
			AbstractTypeDeclaration abstractTypeDeclaration = abstractTypeDeclarations
					.next();
			boolean exists = map.containsKey(abstractTypeDeclaration.getName());
			if (exists) {
				throw new ValidationException("Duplicate name:" //$NON-NLS-1$
						+ abstractTypeDeclaration.getName());
			}
			map.put(abstractTypeDeclaration.getName(), null);
		}
		if (aPackage.getOriginalCompilationUnit() != null) {
			throw new ValidationException(
					"Package orginal compilcation unit must be null: " //$NON-NLS-1$
							+ JavaUtil.getQualifiedName(aPackage));
		}
	}

	private static void validate(
			final org.eclipse.modisco.java.BodyDeclaration bodyDeclaration) {
		if (!(bodyDeclaration instanceof FieldDeclaration)
				&& !(bodyDeclaration instanceof Initializer)) {
			if (bodyDeclaration.getName() == null) {
				throw new ValidationException("Null BodyDeclaration name: " //$NON-NLS-1$
						+ JavaUtil.getQualifiedName(bodyDeclaration));
			}
			if (bodyDeclaration.getName().length() == 0) {
				if (bodyDeclaration.eContainer().eContainer() instanceof ClassInstanceCreation) {
					ClassInstanceCreation classInstanceCreation = (ClassInstanceCreation) bodyDeclaration
							.eContainer().eContainer();
					if (classInstanceCreation.getMethod() != bodyDeclaration) {
						throw new ValidationException(
								"Empty BodyDeclaration name: " //$NON-NLS-1$
										+ JavaUtil
												.getQualifiedName(bodyDeclaration)
										+ " type=" //$NON-NLS-1$
										+ bodyDeclaration.getClass().getName());
					}
				} else {
					throw new ValidationException(
							"Empty BodyDeclaration name: " //$NON-NLS-1$
									+ JavaUtil
											.getQualifiedName(bodyDeclaration)
									+ " type=" //$NON-NLS-1$
									+ bodyDeclaration.getClass().getName());
				}
			}
		}
	}

	private static void validate(
			final org.eclipse.modisco.java.CompilationUnit compilationUnit) {
		if (compilationUnit.getName() == null) {
			throw new ValidationException("Null compilation unit name"); //$NON-NLS-1$
		}
		if (compilationUnit.getName().length() == 0) {
			throw new ValidationException("Empty compilation unit name"); //$NON-NLS-1$
		}
	}

	private static void validate(
			final org.eclipse.modisco.java.FieldDeclaration fieldDeclaration) {
		if (fieldDeclaration.getFragments().size() == 0) {
			throw new ValidationException(
					"FieldDeclaration must have one or more fragment"); //$NON-NLS-1$
		}
	}

	private static void validate(
			final org.eclipse.modisco.java.VariableDeclarationFragment variableDeclarationFragment) {
		if (variableDeclarationFragment.getName() == null) {
			throw new ValidationException("Null FieldDeclaration name: " //$NON-NLS-1$
					+ JavaUtil.getQualifiedName(variableDeclarationFragment));
		}
		if (variableDeclarationFragment.getName().length() == 0) {
			throw new ValidationException("Empty FieldDeclaration name" //$NON-NLS-1$
					+ JavaUtil.getQualifiedName(variableDeclarationFragment));
		}
	}

	private static void validate(
			final org.eclipse.modisco.java.NamedElement namedElement) {
		if (!namedElement.isProxy()) {
			EObject container = namedElement.eContainer();
			while (container != null) {
				if (container instanceof NamedElement) {
					NamedElement neConainter = (NamedElement) container;
					if (neConainter.isProxy()) {
						throw new ValidationException(
								"A non proxy element could not be contained into a proxy element: " //$NON-NLS-1$
										+ JavaUtil
												.getQualifiedName(namedElement));
					}
				}
				container = container.eContainer();
			}
		} else {
			if (namedElement.getOriginalCompilationUnit() != null) {
				throw new ValidationException(
						"A proxy elememt should not have an orignal compilation unit: " //$NON-NLS-1$
								+ JavaUtil.getQualifiedName(namedElement));
			}
		}
	}

	private static Model getModel(final NamedElement namedElement) {
		Model resultModel = null;
		Iterator<EObject> roots = namedElement.eResource().getContents()
				.iterator();
		while (roots.hasNext()) {
			EObject root = roots.next();
			if (root instanceof Model) {
				resultModel = (Model) root;
			}
		}
		return resultModel;
	}

	private static void validate(
			final org.eclipse.modisco.java.AbstractMethodDeclaration abstractMethodDeclaration) {
		if (abstractMethodDeclaration.getName().indexOf('>') != -1
				|| abstractMethodDeclaration.getName().indexOf('<') != -1) {
			throw new ValidationException("Invalide methode name " //$NON-NLS-1$
					+ JavaUtil.getQualifiedName(abstractMethodDeclaration));
		}
	}

	private static void validate(
			final org.eclipse.modisco.java.AbstractMethodInvocation abstractMethodInvocation) {
		if (abstractMethodInvocation.getMethod() == null) {
			throw new ValidationException(
					"null method on method invocation : " + abstractMethodInvocation); //$NON-NLS-1$
		}
	}

	private static void validate(final org.eclipse.modisco.java.MethodRef methodref) {
		if (methodref.getMethod() == null) {
			throw new ValidationException(
					"null method on method ref : " + methodref); //$NON-NLS-1$
		}
	}

	private static void validate(final org.eclipse.modisco.java.MemberRef memberref) {
		if (memberref.getMember() == null) {
			throw new ValidationException(
					"null member on member ref : " + memberref); //$NON-NLS-1$
		}
	}

	private static void validate(final org.eclipse.modisco.java.TagElement tag) {
		if (tag.getFragments().size() == 0) {
			throw new ValidationException(
					"tag element should have at least one element : " + tag); //$NON-NLS-1$
		}
	}

	private static void validate(
			final org.eclipse.modisco.java.MethodDeclaration methodDeclaration) {
		String classDeclarationName;
		if (methodDeclaration.eContainer() instanceof AbstractTypeDeclaration) {
			AbstractTypeDeclaration abstractTypeDeclaration = (AbstractTypeDeclaration) methodDeclaration
					.eContainer();
			classDeclarationName = abstractTypeDeclaration.getName();
		} else if (methodDeclaration.eContainer() instanceof AnonymousClassDeclaration) {
			classDeclarationName = ""; //$NON-NLS-1$
		} else if (methodDeclaration.eContainer() instanceof Model) {
			Model model = (Model) methodDeclaration.eContainer();
			if (!model.getUnresolvedItems().contains(methodDeclaration)) {
				throw new ValidationException("Unexpected container:" //$NON-NLS-1$
						+ JavaUtil.getQualifiedName(methodDeclaration)
						+ " is contained by" //$NON-NLS-1$
						+ methodDeclaration.eContainer().getClass().getName());
			}
			classDeclarationName = ""; //$NON-NLS-1$
		} else {
			throw new ValidationException("Unexpected container:" //$NON-NLS-1$
					+ JavaUtil.getQualifiedName(methodDeclaration)
					+ " is contained by" //$NON-NLS-1$
					+ methodDeclaration.eContainer().getClass().getName());
		}
		if (methodDeclaration.getName().equals(classDeclarationName)) {
			throw new ValidationException("The method " //$NON-NLS-1$
					+ JavaUtil.getQualifiedName(methodDeclaration)
					+ " should be a constructor."); //$NON-NLS-1$
		}
	}

	private static void validate(
			final VariableDeclarationStatement variableDeclarationStatement) {
		if (variableDeclarationStatement.getOriginalCompilationUnit() == null) {
			throw new ValidationException(
					"A variable declaration statement should have an original compilation unit : " //$NON-NLS-1$
							+ variableDeclarationStatement);
		}
		if (variableDeclarationStatement.getFragments().size() == 0) {
			throw new ValidationException(
					"A variable declaration statement should have at least one fragment : " + //$NON-NLS-1$
							variableDeclarationStatement);
		}
	}

	private static void validate(
			final VariableDeclarationExpression variableDeclarationExpression) {
		if (variableDeclarationExpression.getOriginalCompilationUnit() == null) {
			throw new ValidationException(
					"A variable declaration expression should have an original compilation unit : " //$NON-NLS-1$
							+ variableDeclarationExpression);
		}
		if (variableDeclarationExpression.getFragments().size() == 0) {
			throw new ValidationException(
					"A variable declaration expression should have at least one fragment : " + //$NON-NLS-1$
							variableDeclarationExpression);
		}
	}

	private static void validate(final PrimitiveType primitiveType) {
		if (!getModel(primitiveType).getOrphanTypes().contains(primitiveType)) {
			throw new ValidationException(
					"A primitive type must be contained in to the model's orphan types"); //$NON-NLS-1$
		}
	}

	private static void validate(final Model model) {
		if (model.eResource().getContents().size() != 1) {
			throw new ValidationException("Only one resource root is expected"); //$NON-NLS-1$
		}
	}

	private static void validate(
			final SingleVariableDeclaration singleVariableDeclaration) {
		EObject container = singleVariableDeclaration.eContainer();
		if (container instanceof AbstractMethodDeclaration) {
			AbstractMethodDeclaration abstractMethodDeclaration = (AbstractMethodDeclaration) container;
			if (abstractMethodDeclaration.isProxy()) {
				if (!singleVariableDeclaration.isProxy()) {
					throw new ValidationException(
							"Parameters of proxy methods must be proxies:" //$NON-NLS-1$
									+ JavaUtil
											.getQualifiedName(singleVariableDeclaration));
				}
			} else {
				if (singleVariableDeclaration.isProxy()) {
					throw new ValidationException(
							"Parameters of non-proxy methods must be non-proxies:" //$NON-NLS-1$
									+ JavaUtil
											.getQualifiedName(singleVariableDeclaration));
				}
				if (singleVariableDeclaration.getName() == null
						|| singleVariableDeclaration.getName().length() == 0) {
					throw new ValidationException(
							"Non-proxy parameters must be named:" //$NON-NLS-1$
									+ JavaUtil
											.getQualifiedName(singleVariableDeclaration));
				}
			}
		}
	}

	private static void validate(final TypeAccess typeAccess) {
		if (typeAccess.getType() == null) {
			throw new ValidationException("typeAccess.getType() == null"); //$NON-NLS-1$
		}
	}

	private static void validate(final PackageAccess pckAccess) {
		if (pckAccess.getPackage() == null) {
			throw new ValidationException("pckAccess.getPackage() == null"); //$NON-NLS-1$
		}
	}

	private static void validate(final SingleVariableAccess varAccess) {
		if (varAccess.getVariable() == null) {
			throw new ValidationException("varAccess.getVariable() == null"); //$NON-NLS-1$
		}
	}

	private static void validate(final UnresolvedItemAccess unrAccess) {
		if (unrAccess.getElement() == null) {
			throw new ValidationException("unrAccess.getElement() == null"); //$NON-NLS-1$
		}
	}

	private static void validate(final ImportDeclaration importDecl) {
		if (importDecl.getOriginalCompilationUnit() == null) {
			throw new ValidationException(
					"This import declaration should have an original compilation unit : " + importDecl); //$NON-NLS-1$
		}
		if (importDecl.getImportedElement() == null) {
			throw new ValidationException(
					"This import declaration should import something : " + importDecl); //$NON-NLS-1$
		}
		if (importDecl.getImportedElement() instanceof UnresolvedItem
				&& importDecl.getImportedElement().getName() == null
				|| importDecl.getImportedElement().getName().length() == 0) {
			throw new ValidationException(
					"This unresolved imported element should have a name : " + importDecl); //$NON-NLS-1$
		}
	}

}
