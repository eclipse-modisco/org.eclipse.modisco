/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.infra.query.core.internal.validation;

import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.modisco.infra.query.ModelQuery;
import org.eclipse.modisco.infra.query.core.internal.Activator;

/**
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class ScopeValidation extends AbstractModelConstraint {

	@Override
	public IStatus validate(final IValidationContext ctx) {
		EObject eObject = ctx.getTarget();
		EMFEventType eType = ctx.getEventType();
		if (eType == EMFEventType.NULL) {
			if (eObject instanceof ModelQuery) {
				ModelQuery modelQuery = (ModelQuery) eObject;
				List<EClass> scopes = modelQuery.getScope();
				boolean found = false;
				for (EClass scope : scopes) {
					for (EPackage ePackage : modelQuery.getModelQuerySet()
							.getAssociatedMetamodels()) {
						if (ePackage.getEClassifiers().contains(scope)) {
							found = true;
							break;
						}
					}
					if (!found) {
						return ctx.createFailureStatus(scope.getName(),
								modelQuery.getName());
					}
				}
			} else {
				Exception e = new Exception(
						"Wrong validation context. ModelQuery object was expected, " //$NON-NLS-1$
								+ eObject.eClass().getName() + " object found."); //$NON-NLS-1$
				IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
						e.getMessage(), e);
				Activator.getDefault().getLog().log(status);
			}
		}
		return ctx.createSuccessStatus();
	}

}
