/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 *     Nicolas Bros (Mia-Software)
 */
package org.eclipse.modisco.infra.query.core.internal.validation;

import java.util.Iterator;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.modisco.infra.query.Messages;
import org.eclipse.modisco.infra.query.ModelQuery;
import org.eclipse.modisco.infra.query.core.internal.Activator;
import org.eclipse.osgi.util.NLS;

/**
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class ReturnTypeValidation extends AbstractModelConstraint {

	@Override
	public IStatus validate(final IValidationContext ctx) {
		EObject eObject = ctx.getTarget();
		EMFEventType eType = ctx.getEventType();
		try {
			IStatus result = null;
			if (eType == EMFEventType.NULL) {
				ModelQuery modelQuery = (ModelQuery) eObject;
				EClassifier returnType = modelQuery.getReturnType();
				if (returnType == null) {
					return ctx.createFailureStatus(Messages.ReturnTypeValidation_noReturnType);
				}
				EPackage returnTypePackage = returnType.getEPackage();
				String returnTypePackageNsURI = returnTypePackage.getNsURI();
				boolean found = returnTypePackageNsURI.equals(EcorePackage.eINSTANCE.getNsURI());
				Iterator<EPackage> ePackages = modelQuery.getModelQuerySet()
						.getAssociatedMetamodels().iterator();
				while (!found && ePackages.hasNext()) {
					EPackage ePackage = ePackages.next();
					if (ePackage.getEClassifiers().contains(returnType)) {
						found = true;
					}
				}
				if (found) {
					result = ctx.createSuccessStatus();
				} else {
					result = ctx.createFailureStatus(NLS.bind(
							Messages.ReturnTypeValidation_wrongReturnType,
							returnType.getName()));
				}
			} else {
				result = ctx.createSuccessStatus();
			}
			return result;
		} catch (NullPointerException e) {
			IStatus status = new Status(IStatus.WARNING, Activator.PLUGIN_ID,
					Messages.ReturnTypeValidation_0 + eObject.eResource().getURI().toString(), e);
			Activator.getDefault().getLog().log(status);
			return ctx.createSuccessStatus();
		}
	}
}
