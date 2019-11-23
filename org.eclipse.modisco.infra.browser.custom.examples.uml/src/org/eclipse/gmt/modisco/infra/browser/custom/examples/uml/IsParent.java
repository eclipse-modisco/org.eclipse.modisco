/*******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.browser.custom.examples.uml;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gmt.modisco.infra.query.ModelQueryParameter;
import org.eclipse.gmt.modisco.infra.query.QueryFactory;
import org.eclipse.gmt.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.gmt.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.gmt.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.gmt.modisco.infra.query.runtime.ModelQueryParameterValue;
import org.eclipse.uml2.uml.Classifier;

/**
 * @author Gregoire DUPE (Mia-Software)
 */
public class IsParent implements IJavaModelQuery<Classifier, Boolean> {

	public static final ModelQueryParameter PARAM_PARENT = initParentParameter();

	public Boolean evaluate(final Classifier context,
			final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		Classifier parent = (Classifier) parameterValues
				.getValue(IsParent.PARAM_PARENT);
		return new Boolean(new Parents().evaluate(context, null).contains(
				parent));
	}

	private static ModelQueryParameter initParentParameter() {
		ModelQueryParameter parameter = QueryFactory.eINSTANCE
				.createModelQueryParameter();
		parameter.setName("parent"); //$NON-NLS-1$
		parameter.setType(EcorePackage.eINSTANCE.getEPackage());
		return parameter;
	}

	public static ModelQueryParameterValue createParentParameterValue(
			final Classifier parent) {
		return ParameterValueList.createParameterValue(parent, IsParent.PARAM_PARENT);
	}

}
