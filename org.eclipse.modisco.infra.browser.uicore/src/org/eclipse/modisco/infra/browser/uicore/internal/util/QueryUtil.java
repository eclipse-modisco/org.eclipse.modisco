/*******************************************************************************
 * Copyright (c) 2009, 2010 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.uicore.internal.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.infra.browser.uicore.internal.Activator;
import org.eclipse.modisco.infra.browser.uicore.internal.Messages;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.query.ModelQuery;
import org.eclipse.modisco.infra.query.core.AbstractModelQuery;
import org.eclipse.modisco.infra.query.core.ModelQuerySetCatalog;
import org.eclipse.modisco.infra.query.runtime.ModelQueryContext;
import org.eclipse.modisco.infra.query.runtime.ModelQueryParameterValue;
import org.eclipse.modisco.infra.query.runtime.ModelQueryResult;
import org.eclipse.modisco.infra.query.runtime.RuntimeFactory;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Display;

/**
 * Utility methods to evaluate MoDisco queries.
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public final class QueryUtil {

	private static final int MESSAGE_DELAY = 100;
	private static Job messageJob;
	private static List<Throwable> errors = new ArrayList<Throwable>();

	private QueryUtil() {
		// cannot be instantiated
	}

	public static Object basicEvaluate(final ModelQuery modelQuery, final EObject context) {
		final ModelQuerySetCatalog querySetCatalog = ModelQuerySetCatalog.getSingleton();
		try {
			final AbstractModelQuery modelQueryImpl = querySetCatalog.getModelQueryImpl(modelQuery);
			ModelQueryContext modelQueryContext = RuntimeFactory.eINSTANCE
					.createModelQueryContext();
			modelQueryContext.getSelectedModelElements().add(context);
			List<ModelQueryParameterValue> parameters = Collections.emptyList();
			List<ModelQueryResult> results = modelQueryImpl.evaluate(modelQueryContext, parameters);
			if (results.size() > 0) {
				ModelQueryResult modelQueryResult = results.get(0);
				Exception exc = modelQueryResult.getException();
				if (exc != null) {
					showMessageDialog(exc);
					MoDiscoLogger.logError(exc, Activator.getDefault());
				} else {
					return results.get(0).getValue();
				}
			}
			return null;
		} catch (final Throwable e) {
			showMessageDialog(e);
			MoDiscoLogger.logError(e, Activator.getDefault());
			return null;
		}
	}

	/**
	 * This waits until errors stop occurring to display a single error message
	 */
	private static void showMessageDialog(final Throwable e) {
		if (QueryUtil.messageJob == null) {
			QueryUtil.messageJob = new Job(Messages.QueryUtil_displayQueryErrorMessageJob) {
				@Override
				protected IStatus run(final IProgressMonitor monitor) {
					Display.getDefault().syncExec(new Runnable() {
						public void run() {
							if (QueryUtil.errors.size() == 1) {
								Throwable error = QueryUtil.errors.get(0);
								StackTraceElement[] stackTrace = error.getStackTrace();
								String stack = ""; //$NON-NLS-1$
								if (stackTrace.length > 0) {
									stack = "\nat:" + stackTrace[0].toString(); //$NON-NLS-1$
								}

								QueryErrorDialog.openError(null, Messages.QueryUtil_QueryError,
										error.getClass().getSimpleName() + " : " //$NON-NLS-1$
												+ error.getMessage() + stack);
							} else {
								QueryErrorDialog.openError(
										null,
										Messages.QueryUtil_QueryError,
										NLS.bind(Messages.QueryUtil_queryErrorsOccurred,
												Integer.valueOf(QueryUtil.errors.size())));
							}
							QueryUtil.errors.clear();
						}
					});
					return Status.OK_STATUS;
				}
			};
		} else {
			QueryUtil.messageJob.cancel();
		}
		QueryUtil.errors.add(e);
		QueryUtil.messageJob.setPriority(Job.DECORATE);
		QueryUtil.messageJob.schedule(QueryUtil.MESSAGE_DELAY);

	}
}
