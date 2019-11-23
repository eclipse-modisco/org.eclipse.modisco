/*******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.custom.validation.constraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.modisco.infra.browser.custom.AttributeView;
import org.eclipse.modisco.infra.browser.custom.ReferenceView;
import org.eclipse.modisco.infra.browser.custom.TypeView;

public class NameValidation extends AbstractModelConstraint {

	@Override
	public IStatus validate(final IValidationContext context) {
		EObject eObject = context.getTarget();
		EMFEventType eType = context.getEventType();
		// In the case of batch mode
		if (eType == EMFEventType.NULL) {
			String name = null;
			if (eObject instanceof TypeView) {
				name = ((TypeView) eObject).getMetaclassName();
			} else if (eObject instanceof AttributeView) {
				name = ((AttributeView) eObject).getAttributeName();
			} else if (eObject instanceof ReferenceView) {
				name = ((ReferenceView) eObject).getReferenceName();
			}
			if (name == null || name.length() == 0) {
				return context.createFailureStatus(eObject.eClass().getName());
			}
		}
		return context.createSuccessStatus();
	}

}
