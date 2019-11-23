/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.modisco.infra.browser.MoDiscoBrowserPlugin;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;

public final class EditingSupportUtil {

	private EditingSupportUtil() {
		// not instantiable
	}

	public static Collection<?> getNewChildDescriptors(final List<EReference> eAllReferences,
			final ResourceSet resourceSet) {
		ArrayList<CommandParameter> parameters = new ArrayList<CommandParameter>();
		for (EReference reference : eAllReferences) {
			if (reference.isContainment()) {
				createCommandParameters(parameters, reference, resourceSet);
			}
		}
		return parameters;
	}

	public static void createCommandParameters(final List<CommandParameter> parameters,
			final EReference feature, final ResourceSet resourceSet) {
		EClass featureClass = feature.getEReferenceType();
		if (!featureClass.isInterface() && !featureClass.isAbstract()) {
			parameters.add(new CommandParameter(null, feature, featureClass.getEPackage()
					.getEFactoryInstance().create(featureClass)));
		}
		Collection<EClass> eclasses = allSubClasses(feature.getEReferenceType(), resourceSet);
		for (EClass eclass : eclasses) {
			if (!eclass.isAbstract()) {
				parameters.add(new CommandParameter(null, feature, eclass.getEPackage()
						.getEFactoryInstance().create(eclass)));
			}
		}
	}

	public static Collection<EClass> allSubClasses(final EClass context,
			final ResourceSet resourceSet) {
		List<EClass> result = new ArrayList<EClass>();
		// Set<Resource> resources = new HashSet<Resource>();
		Collection<String> uris = new ArrayList<String>(EPackage.Registry.INSTANCE.keySet());
		for (String ePackageURI : uris) {
			try {
				EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(ePackageURI);
				EList<EClassifier> eClassifiers = ePackage.getEClassifiers();
				for (EClassifier eClassifier : eClassifiers) {
					if (eClassifier instanceof EClass) {
						EClass eClass = (EClass) eClassifier;
						if (isSuperTypeOf(context, eClass)) {
							result.add(eClass);
						}
					}
				}
			} catch (Exception e) {
				MoDiscoLogger.logError(e, MoDiscoBrowserPlugin.getPlugin());
			}
		}

		// if (context.eResource().getResourceSet() != null) {
		// resources.addAll(context.eResource().getResourceSet().getResources());
		// } else {
		// resources.add(context.eResource());
		// }
		// if (resourceSet != null) {
		// resources.addAll(resourceSet.getResources());
		// }
		// for (Resource resource : resources) {
		// TreeIterator<EObject> content = resource.getAllContents();
		// while (content.hasNext()) {
		// EObject eObject = content.next();
		// if (eObject instanceof EClass) {
		// EClass currentClassDeclaration = (EClass) eObject;
		// if (isSuperTypeOf(context, currentClassDeclaration)) {
		// result.add(currentClassDeclaration);
		// }
		// }
		// }
		// }
		return result;
	}

	public static boolean isSuperTypeOf(final EClass self, final EClass typeDeclaration) {
		return typeDeclaration.getEAllSuperTypes().contains(self);
	}
}
