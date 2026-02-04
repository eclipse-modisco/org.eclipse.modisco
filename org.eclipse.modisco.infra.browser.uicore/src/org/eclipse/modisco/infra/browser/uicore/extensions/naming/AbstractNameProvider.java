/*******************************************************************************
 * Copyright (c) 2008, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *
 *******************************************************************************/

package org.eclipse.modisco.infra.browser.uicore.extensions.naming;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * An abstract {@link NameProvider} that you can reuse when implementing the
 * naming extension. It provides the
 * {@link AbstractNameProvider#getDefaultName(EObject) getDefaultName} method,
 * which finds a default name (which can be empty) for any model element.
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public abstract class AbstractNameProvider implements NameProvider {

	/**
	 * Find a default name for the given {@link EObject}.
	 *
	 * @return a name based on a 'name' attribute or a string attribute, or an
	 *         empty string if none was found
	 */
	protected String getDefaultName(final EObject eObject) {
		final EStructuralFeature feature = getLabelFeature(eObject.eClass());
		if (feature != null) {
			final Object value = eObject.eGet(feature);
			if (value != null) {
				return value.toString();
			}
		}
		return ""; //$NON-NLS-1$
	}

	/**
	 * Find a feature which can be used as a name for instances of the given
	 * {@link EClass}.
	 *
	 * @return a feature corresponding to a 'name' attribute or a string
	 *         attribute, or <code>null</code> if none was found
	 */
	protected EStructuralFeature getLabelFeature(final EClass eClass) {
		EAttribute result = null;
		for (final EAttribute eAttribute : eClass.getEAllAttributes()) {
			if (!eAttribute.isMany()
					&& eAttribute.getEType().getInstanceClass() != FeatureMap.Entry.class) {
				if ("name".equalsIgnoreCase(eAttribute.getName())) { //$NON-NLS-1$
					result = eAttribute;
					break;
				} else if (result == null) {
					result = eAttribute;
				} else if (eAttribute.getEAttributeType().getInstanceClass() == String.class
						&& result.getEAttributeType().getInstanceClass() != String.class) {
					result = eAttribute;
				}
			}
		}
		return result;
	}
}
