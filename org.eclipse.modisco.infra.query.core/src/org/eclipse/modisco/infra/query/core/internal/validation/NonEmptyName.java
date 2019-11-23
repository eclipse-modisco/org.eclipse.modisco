/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.infra.query.core.internal.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.modisco.infra.query.ModelQuery;
import org.eclipse.modisco.infra.query.ModelQueryParameter;
import org.eclipse.modisco.infra.query.ModelQuerySet;

/**
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class NonEmptyName extends AbstractModelConstraint {

	@Override
	public IStatus validate(final IValidationContext ctx) {
		EObject eObj = ctx.getTarget();
		EMFEventType eType = ctx.getEventType();
		// In the case of batch mode.
		if (eType == EMFEventType.NULL) {
			String name = null;
			if (eObj instanceof ModelQuerySet) {
				name = ((ModelQuerySet) eObj).getName();
			} else if (eObj instanceof ModelQuery) {
				name = ((ModelQuery) eObj).getName();
			} else if (eObj instanceof ModelQueryParameter) {
				name = ((ModelQueryParameter) eObj).getName();
			}
			if (name == null || name.length() == 0) {
				return ctx.createFailureStatus(eObj.eClass().getName());
			}
		}
		return ctx.createSuccessStatus();
	}

}
