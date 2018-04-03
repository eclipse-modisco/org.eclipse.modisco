/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 *     Nicolas Bros (Mia-Software)
 */
package org.eclipse.gmt.modisco.infra.query.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.infra.query.ModelQuery;
import org.eclipse.gmt.modisco.infra.query.ModelQuerySet;
import org.eclipse.gmt.modisco.infra.query.core.exception.ModelQueryException;
import org.eclipse.gmt.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.gmt.modisco.infra.query.core.exception.ModelQueryTypeCheckingException;
import org.eclipse.gmt.modisco.infra.query.runtime.ModelQueryContext;
import org.eclipse.gmt.modisco.infra.query.runtime.ModelQueryParameterValue;
import org.eclipse.gmt.modisco.infra.query.runtime.ModelQueryResult;
import org.eclipse.gmt.modisco.infra.query.runtime.RuntimeFactory;

/**
 * To get a sub class instance of this class, the {@link ModelQuerySetCatalog}
 * must be used.
 *
 * <pre>
 * ModelQuerySetCatalog catalog = ModelQuerySetCatalog.getSingleton();
 * ModelQuerySet modelQuerySet = catalog.getModelQuerySet(&quot;modisco.infra.query.tests.01&quot;);
 * ModelQuery modelQuery = modelQuerySet.getQuery(&quot;test001&quot;);
 * AbstractModelQuery modelQueryInst = catalog.getModelQueryImpl(modelQuery);
 * </pre>
 *
 * @author Gregoire DUPE (Mia-Software)
 *
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public abstract class AbstractModelQuery {

	private final ModelQuery modelQuery;
	private boolean checkResult = true;

	/**
	 * AbstractModelQuery constructor
	 *
	 * @param modelQuery
	 *            the model query description (model element)
	 */
	public AbstractModelQuery(final ModelQuery modelQuery) {
		this.modelQuery = modelQuery;
	}

	/**
	 * This method returns the model query element passed as parameter to the
	 * constructor
	 *
	 * @return The model query element passed as parameter to the constructor
	 */
	public final ModelQuery getModelQuery() {
		return this.modelQuery;
	}

	/**
	 * This method is used to evaluate the query on a set of models and model
	 * elements described by the context parameter.
	 *
	 * The query is evaluated on each contextually referred model element and on
	 * each element of a contextually referred model.
	 *
	 * @param context
	 *            The query evaluation context described by a ModelQueryContext
	 *            instance.
	 * @param parameterValues
	 *            The query parameter values.
	 * @return A list of ModelQueryResult (one per evaluation)
	 */
	public final synchronized List<ModelQueryResult> evaluate(final ModelQueryContext context,
			final List<ModelQueryParameterValue> parameterValues) {
		List<ModelQueryResult> resultList = new ArrayList<ModelQueryResult>();
		try {
			startEvaluate();
			for (EObject eObject : context.getSelectedModelElements()) {
				executeQuery(parameterValues, resultList, eObject);
			}
			for (Resource resource : context.getSelectedModels()) {
				TreeIterator<EObject> treeIterator = resource.getAllContents();
				while (treeIterator.hasNext()) {
					EObject eObject = treeIterator.next();
					executeQuery(parameterValues, resultList, eObject);
				}
			}
		} finally {
			endEvaluate();
		}
		return resultList;
	}

	/**
	 * Called when starting evaluating a query on one or several context
	 * elements (when
	 * {@link AbstractModelQuery#evaluate(ModelQueryContext, List)} is called).
	 * <p>
	 * A subclass will receive in order:<br>
	 *
	 * <pre>
	 * startEvaluate()
	 * basicEvaluate(context1, parameters)
	 * basicEvaluate(context2, parameters)
	 * ...
	 * basicEvaluate(contextn, parameters)
	 * endEvaluate()
	 * </pre>
	 *
	 * </p>
	 *
	 * @see {@link AbstractModelQuery#endEvaluate()}
	 */
	protected void startEvaluate() {
		// meant to be overridden
	}

	/**
	 * Called when ending the evaluation of a query on one or several context
	 * elements.
	 *
	 * @see {@link AbstractModelQuery#startEvaluate()}
	 */
	protected void endEvaluate() {
		// meant to be overridden
	}

	/**
	 * This method is used to evaluate the query on one model element. The
	 * method is only usable for queries which do not have any parameters.
	 *
	 * @param context
	 *            The query evaluation context
	 * @return A ModelQueryResult instance
	 */
	public final ModelQueryResult evaluate(final EObject context) {
		ModelQueryResult modelQueryResult = RuntimeFactory.eINSTANCE.createModelQueryResult();
		try {
			modelQueryResult.setSource(context);
			modelQueryResult.setValue(basicEvaluate(context, null));
		} catch (Exception e) {
			modelQueryResult.setException(e);
		}
		return modelQueryResult;
	}

	/**
	 * This method is used to evaluate the query on one model element. The
	 * method is usable for queries which have parameters.
	 *
	 * @param context
	 *            The query evaluation context
	 * @param parameterValues
	 *            The query parameter values
	 * @return A ModelQueryResult instance
	 */
	public final ModelQueryResult evaluate(final EObject context,
			final List<ModelQueryParameterValue> parameterValues) {
		ModelQueryResult modelQueryResult = RuntimeFactory.eINSTANCE.createModelQueryResult();
		try {
			modelQueryResult.setSource(context);
			modelQueryResult.setValue(basicEvaluate(context, parameterValues));
		} catch (Exception e) {
			modelQueryResult.setException(e);
		}
		return modelQueryResult;
	}

	private final void executeQuery(final List<ModelQueryParameterValue> parameterValues,
			final List<ModelQueryResult> resultList, final EObject context) {
		ModelQueryResult modelQueryResult = RuntimeFactory.eINSTANCE.createModelQueryResult();
		resultList.add(modelQueryResult);
		modelQueryResult.setSource(context);
		boolean matched = (this.modelQuery.getScope().size() == 0);
		Iterator<EClass> queryScopes = this.modelQuery.getScope().iterator();
		while (queryScopes.hasNext() && !matched) {
			EClass eClass = queryScopes.next();
			if (eClass.isInstance(context)) {
				matched = true;
			}
		}

		if (matched && this.modelQuery.getScope().size() != 0) {
			try {
				Object result = basicEvaluate(context, parameterValues);
				modelQueryResult.setValue(result);
			} catch (ModelQueryException e) {
				modelQueryResult.setException(e);
			}
		} else {
			StringBuffer message = new StringBuffer();
			message.append("Wrong context type (for query " + toString() + "): "); //$NON-NLS-1$ //$NON-NLS-2$
			message.append(context.eClass().getName());
			message.append(" found; expected scopes are {"); //$NON-NLS-1$
			for (int i = 0; i < this.modelQuery.getScope().size(); i++) {
				EClass scope = this.modelQuery.getScope().get(i);
				message.append(scope.getName());
				if (i != this.modelQuery.getScope().size() - 1) {
					message.append(", "); //$NON-NLS-1$
				}
			}
			message.append("}"); //$NON-NLS-1$
			ModelQueryTypeCheckingException e = new ModelQueryTypeCheckingException(
					message.toString());
			modelQueryResult.setException(e);
		}
	}

	/**
	 * This method must be overridden by each sub class to implement query
	 * evaluation.
	 *
	 * @param context
	 *            The query evaluation context
	 * @param parameterValues
	 *            The query parameter values
	 * @return A list of ModelQueryResult (one per evaluation)
	 * @throws ModelQueryExecutionException
	 */
	public abstract Object basicEvaluate(final EObject context,
			final List<ModelQueryParameterValue> parameterValues) throws ModelQueryException;

	/**
	 * This method is equivalent to {@link AbstractModelQuery#evaluate(EObject)}
	 * but rather than return the errors into a ModelQueryResult instance, it
	 * throws an exception.
	 *
	 * @param context
	 *            The query evaluation context
	 * @return The query result.
	 * @throws ModelQueryExecutionException
	 */
	public final Object basicEvaluate(final EObject context) throws ModelQueryException {
		return basicEvaluate(context, new ArrayList<ModelQueryParameterValue>());
	}

	protected final void checkResult(final Object object) throws ModelQueryTypeCheckingException {
		if (this.modelQuery.getUpperBound() > 1 || this.modelQuery.getUpperBound() == -1) {
			if (!(object instanceof Collection<?>)) {
				throw new ModelQueryTypeCheckingException(
						"A collection is expected as result. The result is: " //$NON-NLS-1$
								+ object + " (on " + toString() + ")"); //$NON-NLS-1$ //$NON-NLS-2$
			}
			for (Object collectionElement : (Collection<?>) object) {
				if (this.checkResult) {
					if (!(this.modelQuery.getReturnType().isInstance(collectionElement))) {
						ModelQueryTypeCheckingException e = new ModelQueryTypeCheckingException(
								"Wrong result collection element type (" //$NON-NLS-1$
										+ this.modelQuery.getReturnType().getName()
										+ " is expected): " //$NON-NLS-1$
										+ collectionElement + " (on " //$NON-NLS-1$
										+ toString() + ")"); //$NON-NLS-1$
						throw e;
					}
				}
			}
		} else {
			if (object instanceof Collection<?>) {
				throw new ModelQueryTypeCheckingException("A " //$NON-NLS-1$
						+ this.modelQuery.getReturnType().getName()
						+ " instance is expected as result. The result is: " //$NON-NLS-1$
						+ object + " (on " + toString() + ")"); //$NON-NLS-1$//$NON-NLS-2$
			}
			if (this.checkResult) {
				if (!(this.modelQuery.getReturnType().isInstance(object))) {
					if (object != null) {
						throw new ModelQueryTypeCheckingException("Wrong result type: " //$NON-NLS-1$
								+ object.getClass().getName()
								+ " is returned while " //$NON-NLS-1$
								+ this.modelQuery.getReturnType().getInstanceClassName()
								+ " is expected." + " (on " + toString() + ")"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
					}

				}
			}
		}
	}

	public void setCheckResult(final boolean checkResult) {
		this.checkResult = checkResult;
	}

	@Override
	public String toString() {
		String queryName;
		String querySetName;
		if (this.modelQuery == null) {
			queryName = "null"; //$NON-NLS-1$
			querySetName = "null"; //$NON-NLS-1$
		} else {
			queryName = this.modelQuery.getName();
			ModelQuerySet modelQuerySet = this.modelQuery.getModelQuerySet();
			if (modelQuerySet != null) {
				querySetName = modelQuerySet.getName();
			} else {
				querySetName = "null"; //$NON-NLS-1$
			}
		}
		return querySetName + "::" + queryName; //$NON-NLS-1$
	}
}
