/**
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 */

package org.eclipse.modisco.usecase.modelfilter.dependencies.ui.internal.editor;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.java.Package;
import org.eclipse.modisco.java.Type;

public class GetUsedPackages {

	final Set<Package> getUsedPackages(final Package contextPackage) {
		Set<Package> result = new HashSet<Package>();
		/*
		 * calculate used packages from owned elements 1. owned types 2. owned packages
		 */
		GetUsedTypes typesFinder = new GetUsedTypes();
		for (Type ownedType : contextPackage.getOwnedElements()) {
			for (Type usedType : typesFinder.getUsedTypes(ownedType)) {
				result.add(getContainerPackage(usedType));
			}
		}

		for (Package ownedPackage : contextPackage.getOwnedPackages()) {
			result.addAll(getUsedPackages(ownedPackage));
		}
		/*
		 * We should filter used packages to keep only first common parent package. We should also
		 * remove all children packages.
		 */
		Iterator<Package> iter = result.iterator();
		while (iter.hasNext()) {
			Package used = iter.next();
			if (isParentPackage(contextPackage, used)) {
				iter.remove();
			}
		}
		// heavy filter, only if it contains an empty package (no type inside)
		if (contextPackage.getOwnedElements().isEmpty()) {
			result = filterUsedPackages(result);
		}
		/*
		 * there is sometimes a null element in collection we have to find where it comes from. But
		 * in case of, we will remove null value every time
		 */
		result.remove(null);
		return result;
	}

	private final Package getContainerPackage(final EObject source) {
		Package result = null;
		if (source != null) {
			if (source.eContainer() instanceof Package) {
				result = (Package) source.eContainer();
			} else {
				result = getContainerPackage(source.eContainer());
			}
		}
		return result;
	}

	/**
	 * We should filter used packages to keep only first common parent package. example: initial
	 * list of used packages = a.b.c, a.b.d, e.f, e.g
	 *
	 * final list of used packages = a.b, e
	 *
	 * @param usedPackages
	 * @return a collection of common packages
	 */
	private final Set<Package> filterUsedPackages(final Set<Package> usedPackages) {
		Set<Package> result = new HashSet<Package>();

		for (Package usedPackage : usedPackages) {
			Package common = this.getFirstCommonPackage(usedPackage, usedPackages);
			result.add(common);
		}
		return result;
	}

	/**
	 * This is a particular algorithm, even if we look at a parent package which is common to all
	 * packages provided as parameters, we consider that packages which have no common hierarchy
	 * don't have to be compared. For example, if we have two packages a.b and c.d, then result will
	 * be a.b But if we have three packages a.b, a.c and d.e, then result will be a
	 *
	 * @param usedPackage
	 * @param usedPackages
	 * @return the package which is common of both packages, usedPackage otherwise
	 */
	private final Package getFirstCommonPackage(final Package usedPackage,
			final Set<Package> usedPackages) {
		Package common = usedPackage;
		if (usedPackages.contains(usedPackage)) {
			Set<Package> subset = new HashSet<Package>(usedPackages);
			subset.remove(usedPackage);
			common = this.getFirstCommonPackage(usedPackage, subset);
		} else {
			for (Package otherPackage : usedPackages) {
				Package commonTemp = this.getFirstCommonPackage(usedPackage, otherPackage);
				if (commonTemp != null) {
					if (common == null) {
						common = commonTemp;
					} else if (isParentPackage(commonTemp, common)) {
						common = commonTemp;
					} // else, common is a parent package of commonTemp.
				} // else, compared packages have no common hierarchy of packages
			}
		}
		return common;
	}

	/**
	 *
	 * @param usedPackage
	 * @param otherPackage
	 * @return the package which is common of both packages, null otherwise
	 */
	private final Package getFirstCommonPackage(final Package usedPackage,
			final Package otherPackage) {
		Package common = null;
		Package current = usedPackage;
		while ((common == null) && (current != null)) {
			if (isParentPackage(current, otherPackage)) {
				common = current;
			} else {
				current = current.getPackage();
			}
		}
		return common;
	}

	/**
	 * @param parent
	 * @param otherPackage
	 * @return true if current is in parent hierarchy of otherPackage, false otherwise
	 */
	private boolean isParentPackage(final Package parent, final Package otherPackage) {
		boolean result = false;
		if ((parent != null) && (otherPackage != null)) {
			if (parent == otherPackage) {
				result = true;
			} else {
				result = isParentPackage(parent, otherPackage.getPackage());
			}
		}
		return result;
	}
}
