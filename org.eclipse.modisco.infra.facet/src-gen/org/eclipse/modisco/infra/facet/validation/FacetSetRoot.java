/**
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.infra.facet.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.modisco.infra.facet.FacetSet;

/**
 * @deprecated Replaced by EMF Facet
 */
@Deprecated
public class FacetSetRoot extends AbstractModelConstraint {

	@Override
	public IStatus validate(final IValidationContext ctx) {
		EObject eObject = ctx.getTarget();
		EMFEventType eType = ctx.getEventType();
		if (eType == EMFEventType.NULL) {
			if (eObject.eResource().getContents().size() != 1) {
				return ctx.createFailureStatus(new Integer(eObject.eResource()
						.getContents().size()));
			}
			if (!(eObject.eResource().getContents().get(0) instanceof FacetSet)) {
				return ctx.createFailureStatus(new Integer(eObject.eResource()
						.getContents().size()));
			}
		}
		return ctx.createSuccessStatus();
	}

}
