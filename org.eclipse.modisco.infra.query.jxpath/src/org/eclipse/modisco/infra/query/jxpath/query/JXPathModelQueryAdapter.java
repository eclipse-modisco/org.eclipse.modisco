/**
 * Copyright (c) 2009 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.infra.query.jxpath.query;

import java.util.List;

import org.apache.commons.jxpath.JXPathContext;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.infra.query.core.AbstractModelQuery;
import org.eclipse.modisco.infra.query.core.exception.ModelQueryException;
import org.eclipse.modisco.infra.query.jxpath.JXPathModelQuery;
import org.eclipse.modisco.infra.query.runtime.ModelQueryParameterValue;

/**
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class JXPathModelQueryAdapter extends AbstractModelQuery {

	public JXPathModelQueryAdapter(final JXPathModelQuery modelQuery) {
		super(modelQuery);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object basicEvaluate(final EObject context,
			final List<ModelQueryParameterValue> parameterValues)
			throws ModelQueryException {
		Object result = JXPathContext.newContext(context).getValue(
				((JXPathModelQuery) this.getModelQuery()).getQuery());
		this.checkResult(result);
		return result;
	}
}
