/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.custom.validation.constraints;

import java.util.Collection;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.modisco.infra.browser.custom.TypeView;
import org.eclipse.modisco.infra.facet.FacetSet;
import org.eclipse.modisco.infra.facet.core.FacetSetCatalog;

/** Validate that each TypeView references an existing metaclass */
public class MetaclassValidation extends AbstractModelConstraint {

	@Override
	public IStatus validate(final IValidationContext context) {
		EObject eObject = context.getTarget();
		EMFEventType eType = context.getEventType();
		// In the case of batch mode
		if (eType == EMFEventType.NULL) {
			if (eObject instanceof TypeView) {
				TypeView typeView = (TypeView) eObject;
				String metaclassName = typeView.getMetaclassName();
				if (metaclassName == null) {
					return context.createFailureStatus("null"); //$NON-NLS-1$
				}
				String metamodelURI = typeView.getMetamodelView().getMetamodelURI();
				EPackage ePackage = (EPackage) EPackage.Registry.INSTANCE.get(metamodelURI);

				if (ePackage == null) {
					// look in the FacetSets
					Collection<FacetSet> allFacetSets = FacetSetCatalog.getSingleton()
							.getAllFacetSets();
					for (FacetSet facetSet : allFacetSets) {
						if (metamodelURI.equals(facetSet.getNsURI())) {
							ePackage = facetSet;
						}
					}
				}

				if (ePackage != null) {
					String packageName = ePackage.getName();
					EList<EClassifier> eClassifiers = ePackage.getEClassifiers();
					for (EClassifier eClassifier : eClassifiers) {
						if (metaclassName.equals(packageName + "." + eClassifier.getName())) { //$NON-NLS-1$
							return context.createSuccessStatus();
						}
					}
				}
				return context.createFailureStatus(metaclassName);
			}
		}
		return context.createSuccessStatus();
	}

}
