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
package org.eclipse.modisco.infra.query.core.java.internal;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.infra.query.ModelQuery;
import org.eclipse.modisco.infra.query.core.AbstractModelQuery;
import org.eclipse.modisco.infra.query.core.exception.ModelQueryException;
import org.eclipse.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.modisco.infra.query.runtime.ModelQueryParameterValue;

/**
 * @author Gregoire DUPE (Mia-Software)
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class JavaModelQueryAdapter extends AbstractModelQuery {

	private final IJavaModelQuery<EObject, ?> javaModelQuery;

	public JavaModelQueryAdapter(final ModelQuery modelQuery,
			final IJavaModelQuery<EObject, ?> javaModelQuery) {
		super(modelQuery);
		this.javaModelQuery = javaModelQuery;
	}

	@Override
	public Object basicEvaluate(final EObject context,
			final List<ModelQueryParameterValue> parameterValues) throws ModelQueryException {
		ParameterValueList plist = new ParameterValueList();
		if (parameterValues != null) {
			plist.addAll(parameterValues);
		}
		Object result = this.javaModelQuery.evaluate(context, plist);
		this.checkResult(result);
		return result;
	}
}
