/**
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.java.composition.browser.customization.queries;

import org.eclipse.gmt.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.gmt.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.gmt.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.modisco.java.composition.javaapplication.JavaNodeSourceRegion;
import org.eclipse.modisco.kdm.source.extension.ASTNodeSourceRegion;

public class GetJavaNodeSourceRegionName implements
		IJavaModelQuery<ASTNodeSourceRegion, String> {

	public String evaluate(final ASTNodeSourceRegion context,
			final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		try {
			if (context instanceof JavaNodeSourceRegion) {
				JavaNodeSourceRegion node = (JavaNodeSourceRegion) context;
				return node.getParent().getFile().getName()
						+ " [" + node.getStartPosition() //$NON-NLS-1$
						+ "," + node.getEndPosition() + "]"; //$NON-NLS-1$ //$NON-NLS-2$
			}
			return ""; //$NON-NLS-1$
		} catch (Exception e) {
			return ""; //$NON-NLS-1$
		}

	}
}
