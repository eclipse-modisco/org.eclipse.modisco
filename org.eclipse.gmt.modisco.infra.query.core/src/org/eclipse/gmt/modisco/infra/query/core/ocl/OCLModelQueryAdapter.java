/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 */
package org.eclipse.gmt.modisco.infra.query.core.ocl;

import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.infra.query.OCLModelQuery;
import org.eclipse.gmt.modisco.infra.query.QueryFactory;
import org.eclipse.gmt.modisco.infra.query.core.AbstractModelQuery;
import org.eclipse.gmt.modisco.infra.query.core.exception.ModelQueryException;
import org.eclipse.gmt.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.gmt.modisco.infra.query.core.internal.Activator;
import org.eclipse.gmt.modisco.infra.query.runtime.ModelQueryParameterValue;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;

/**
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class OCLModelQueryAdapter extends AbstractModelQuery {

	private OCLExpression<EClassifier> query;
	private OCL<?, EClassifier, ?, ?, ?, ?, ?, ?, ?, Constraint, EClass, EObject> ocl;
	private OCLHelper<EClassifier, ?, ?, Constraint> helper;
	private String queryString;

	public OCLModelQueryAdapter(final OCLModelQuery modelQuery) throws ModelQueryException {
		super(modelQuery);
		this.queryString = modelQuery.getQuery();
		init();
	}

	private void init() throws ModelQueryExecutionException {
		try {
			this.ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
			this.helper = this.ocl.createOCLHelper();
		} catch (Exception e) {
			ModelQueryExecutionException mqee = new ModelQueryExecutionException(
					"Failed to load modelQuery: " //$NON-NLS-1$
							+ this.getModelQuery().getName(), e);
			Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, mqee.getMessage(), mqee);
			Activator.getDefault().getLog().log(status);
			throw mqee;
		}
	}

	public OCLModelQueryAdapter(final String query) throws ModelQueryExecutionException {
		super(QueryFactory.eINSTANCE.createOCLModelQuery());
		this.queryString = query;
		init();
	}

	@Override
	public Object basicEvaluate(final EObject context,
			final List<ModelQueryParameterValue> parameterValues) throws ModelQueryException {
		Object result = evaluateWithoutCheck(context);
		this.checkResult(result);
		return result;
	}

	private Object evaluateWithoutCheck(final EObject context) throws ModelQueryExecutionException {
		Object result = null;
		try {
			this.helper.setContext(context.eClass());
			this.query = this.helper.createQuery(this.queryString);
			Query<EClassifier, EClass, EObject> eval = this.ocl.createQuery(this.query);
			result = eval.evaluate(context);
		} catch (ParserException e) {
			ModelQueryExecutionException mqee = new ModelQueryExecutionException(
					"Failed to load modelQuery: " //$NON-NLS-1$
							+ this.getModelQuery().getName(), e);
			Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, mqee.getMessage(), mqee);
			Activator.getDefault().getLog().log(status);
			throw mqee;
		}
		return result;
	}

	/**
	 * @param eObject
	 * @return
	 * @throws ModelQueryException
	 */
	public Object oclEval(final EObject eObject) throws ModelQueryException {
		return this.evaluateWithoutCheck(eObject);
	}

}
