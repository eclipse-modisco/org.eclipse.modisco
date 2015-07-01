/** 
 * Copyright (c) 2015 Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Thomas Cicognani (Soft-Maint) - Bug 471597 - [New Browser] Add a customization to display subclasses from an EClass
 */
package org.eclipse.modisco.util.emf.core.subclasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.modisco.util.emf.core.internal.subclasses.SubClassesAdapter;

/**
 * @since 1.0.0
 */
public final class SubClassesUtils {

	private static boolean initialized = false;

	private SubClassesUtils() {
		// Must not be used
	}

	public static List<EClass> getSubClasses(final EClass eClass) {
		initAdapters();
		SubClassesAdapter subClassesAdapter = getAdapterFor(eClass);
		if (subClassesAdapter == null) {
			subClassesAdapter = getAdapterFor(eClass);
		}
		final Set<EClass> subclasses = subClassesAdapter.getSubclasses();
		return Collections.unmodifiableList(new ArrayList<EClass>(subclasses));
	}

	private static void initAdapters() {
		if (!initialized) {
			for (Object object : EPackage.Registry.INSTANCE.values()) {
				if (object instanceof EPackage) {
					final EPackage ePackage = (EPackage) object;
					initAdapters(ePackage);
				}
			}
			initialized = true;
		}
	}

	private static void initAdapters(final EPackage ePackage) {
		for (EClassifier eClassifier : ePackage.getEClassifiers()) {
			if (eClassifier instanceof EClass) {
				final EClass eClass = (EClass) eClassifier;
				initAdapters(eClass);
			}
		}
		for (EPackage subPackage : ePackage.getESubpackages()) {
			initAdapters(subPackage);
		}
	}

	private static void initAdapters(final EClass eClass) {
		/* Just to init the adapter */
		getAdapterFor(eClass);
		/* Populate the subClass link */
		for (EClass superClass : eClass.getESuperTypes()) {
			final SubClassesAdapter superAdapter = getAdapterFor(superClass);
			superAdapter.add(eClass);
		}
	}

	private static SubClassesAdapter getAdapterFor(final EClass eClass) {
		SubClassesAdapter subClassesAdapter = null;
		for (Adapter adapter : eClass.eAdapters()) {
			if (adapter instanceof SubClassesAdapter) {
				subClassesAdapter = (SubClassesAdapter) adapter;
				break;
			}
		}
		if (subClassesAdapter == null) {
			subClassesAdapter = new SubClassesAdapter();
			eClass.eAdapters().add(subClassesAdapter);
		}
		return subClassesAdapter;
	}
}
