/**
 *  Copyright (c) 2011, 2019 Mia-Software and others.
 *  
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 * 
 *  Contributors:
 *      Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 *      Gregoire Dupe (Mia-Software) - Bug 376576 - [EFacet] Change the multiplicity of Facet::extendedFacet
 *      David Couvrand (Soft-Maint) - Bug 418418 - [Customization] Overlay icons not implemented
 */
package org.eclipse.modisco.facet.custom.core.internal.exported;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.modisco.facet.custom.core.ICustomizationManager;
import org.eclipse.modisco.facet.custom.core.exception.CustomizationException;
import org.eclipse.modisco.facet.custom.core.internal.Activator;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.custom.Customization;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.custom.EClassCustomization;
import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.custom.FacetCustomization;
import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.FacetOperation;
import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.FacetSet;
import org.eclipse.modisco.facet.util.core.Logger;

/**
 * @since 0.2
 */
public final class CustomizationUtils {

	private static final String FILE_EXTENSION = "custom"; //$NON-NLS-1$

	private CustomizationUtils() {
		// Must not be used
	}

	public static EPackage getCustomizedEPackage(
			final Customization customization) {
		EPackage result = null;
		for (EClassifier eClassifier : customization.getEClassifiers()) {
			for (EPackage ePackage : getExtendedEPackage(eClassifier)) {
				if (ePackage != null && !(ePackage instanceof FacetSet)) {
					result = ePackage;
					break;
				}
			}
		}
		return result;
	}

	private static List<EPackage> getExtendedEPackage(
			final EClassifier eClassifier) {
		final List<EClassifier> extended = new ArrayList<EClassifier>();
		if (eClassifier instanceof FacetCustomization) {
			final FacetCustomization facetCustom = (FacetCustomization) eClassifier;
			extended.addAll(facetCustom.getExtendedFacets());
		} else if (eClassifier instanceof EClassCustomization) {
			final EClassCustomization eClassCustom = (EClassCustomization) eClassifier;
			extended.add(eClassCustom.getExtendedMetaclass());
		}
		final List<EPackage> ePackages = new LinkedList<EPackage>();
		for (EClassifier extCassifier : extended) {
			if (extCassifier != null) {
				ePackages.add(extCassifier.getEPackage());
			}
		}
		return ePackages;
	}

	/**
	 * Return the default file extension of a customization file.
	 * 
	 * @return the file extension without the dot.
	 */
	public static String getDefaultFileExtension() {
		return CustomizationUtils.FILE_EXTENSION;
	}
	
	/**
	 * Find a Customization with the given name among the given list of Customizations. If several Customizations have the same name,
	 * then return the first one.
	 * 
	 * @param customizations
	 *            where to look for
	 * @param name
	 *            the name of the Customization to find
	 * @return the Customization, or <code>null</code> if not found in the given list
	 */
	public static Customization getCustomization(final Collection<Customization> customizations, final String name) {
		Customization result = null;
		for (Customization customization : customizations) {
			if (name.equals(customization.getName())) {
				result = customization;
			}
		}
		return result;
	}

	public static <T> T getPropertyValue(
			final ICustomizationManager customManager, final Object element,
			final FacetOperation property, final ETypedElement eTypedElement,
			final Class<T> classs) {
		T result = null;
		if (element instanceof EObject) {
			final EObject eObject = (EObject) element;
			try {
				if (eTypedElement == null) {
					result = customManager.getCustomValueOf(eObject, property,
							classs);
				} else {
					result = customManager.getCustomValueOf(eObject,
							eTypedElement, property, classs);
				}
			} catch (final CustomizationException e) {
				Logger.logError(
						e,
						"Failed to get the value of '" + property.getName() + "' for " + element, //$NON-NLS-1$ //$NON-NLS-2$
						Activator.getDefault());
			}
		}
		return result;
	}
}
