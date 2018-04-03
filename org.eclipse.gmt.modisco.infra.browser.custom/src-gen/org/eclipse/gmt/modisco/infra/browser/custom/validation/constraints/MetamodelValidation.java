/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.browser.custom.validation.constraints;

import java.util.Collection;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.gmt.modisco.infra.browser.custom.MetamodelView;
import org.eclipse.gmt.modisco.infra.facet.FacetSet;
import org.eclipse.gmt.modisco.infra.facet.core.FacetSetCatalog;

/** Validate that the referenced metamodel exists */
public class MetamodelValidation extends AbstractModelConstraint {

	@Override
	public IStatus validate(final IValidationContext context) {
		EObject eObject = context.getTarget();
		EMFEventType eType = context.getEventType();
		// In the case of batch mode
		if (eType == EMFEventType.NULL) {
			if (eObject instanceof MetamodelView) {
				MetamodelView metamodelView = (MetamodelView) eObject;
				String metamodelURI = metamodelView.getMetamodelURI();
				if (metamodelURI == null) {
					return context.createFailureStatus("null"); //$NON-NLS-1$
				}
				EPackage ePackage = (EPackage) EPackage.Registry.INSTANCE.get(metamodelURI);
				if (ePackage == null) {
					// look in the FacetSets
					Collection<FacetSet> allFacetSets = FacetSetCatalog.getSingleton()
							.getAllFacetSets();
					for (FacetSet facetSet : allFacetSets) {
						if (metamodelURI.equals(facetSet.getNsURI())) {
							return context.createSuccessStatus();
						}
					}
					return context.createFailureStatus(metamodelURI);
				}
			}
		}
		return context.createSuccessStatus();
	}
}
