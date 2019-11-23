package org.eclipse.modisco.infra.browser.custom.tests.queries;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.modisco.infra.query.core.java.ParameterValueList;

public class DoesEClassNameStartWithEP implements
		IJavaModelQuery<EClass, Boolean> {
	public Boolean evaluate(final EClass context,
			final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		return new Boolean(context.getName().startsWith("EP")); //$NON-NLS-1$
	}
}
