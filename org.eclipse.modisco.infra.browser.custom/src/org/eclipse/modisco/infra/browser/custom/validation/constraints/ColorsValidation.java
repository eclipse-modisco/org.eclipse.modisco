/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
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
import org.eclipse.modisco.infra.browser.custom.CustomizableFeatures;
import org.eclipse.modisco.infra.browser.custom.StaticFeatureValue;
import org.eclipse.modisco.infra.browser.custom.util.UicustomUtil;

public class ColorsValidation extends AbstractModelConstraint {

	@Override
	public IStatus validate(final IValidationContext context) {
		EObject eObject = context.getTarget();
		EMFEventType eType = context.getEventType();
		// for batch mode
		if (eType == EMFEventType.NULL) {
			if (eObject instanceof StaticFeatureValue) {
				StaticFeatureValue value = (StaticFeatureValue) eObject;
				CustomizableFeatures customizedFeature = UicustomUtil.getCustomizedFeature(value);
				if (customizedFeature == CustomizableFeatures.BACKGROUND_COLOR
						|| customizedFeature == CustomizableFeatures.COLOR) {
					if (!isValidColor(value.getValue())) {
						return context.createFailureStatus(value.getValue(), customizedFeature
								.getName());
					}
				}
			}
		}
		return context.createSuccessStatus();
	}

	private boolean isValidColor(final String value) {
		return (UicustomUtil.decodeColor(value) != null);
	}

}
