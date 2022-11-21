/**
 * Copyright (c) 2022 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 */
package org.eclipse.modisco.usecase.modelfilter.tests;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.PackageableElement;

/**
 * Ensure that compared UML models have determinstic Package.packagedElement order. See Bug 580945.
 */
public class UMLNormalizer //implements ModelNormalizer
{
	public static interface Normalizer {
		void denormalize();
		void normalize();
	}

	public static final UMLNormalizer INSTANCE = new UMLNormalizer();

	protected static class PackageableElementComparator implements Comparator<PackageableElement>
	{
		public int compare(PackageableElement o1, PackageableElement o2) {
			String cn1 = o1.eClass().getName();
			String cn2 = o2.eClass().getName();
			int diff = cn1.compareTo(cn2);
			if (diff != 0) {
				return diff;
			}
			String n1 = o1.getName();
			String n2 = o2.getName();
			return n1.compareTo(n2);
		}
	}

	public List<Normalizer> normalize(Resource resource) {
		PackageableElementComparator packageableElementComparator = new PackageableElementComparator();
		List<org.eclipse.uml2.uml.Package> umlPackages = new ArrayList<org.eclipse.uml2.uml.Package>();
		for (TreeIterator<EObject> tit = resource.getAllContents(); tit.hasNext(); ) {
			EObject eObject = tit.next();
			if (eObject instanceof org.eclipse.uml2.uml.Package) {
				umlPackages.add((org.eclipse.uml2.uml.Package)eObject);
			}
		}
		for (org.eclipse.uml2.uml.Package umlPackage : umlPackages) {
			@SuppressWarnings("unchecked")
			EList<PackageableElement> children = umlPackage.getPackagedElements();
			ECollections.sort(children, packageableElementComparator);
		}
		List<Normalizer> normalizers = new ArrayList<Normalizer>();
		return normalizers;
	}
}