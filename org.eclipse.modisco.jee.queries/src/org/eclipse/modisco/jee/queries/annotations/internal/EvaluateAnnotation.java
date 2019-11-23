/**
 * *******************************************************************************
 * Copyright (c) 2010 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *
 * 	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 * *******************************************************************************
 */
package org.eclipse.modisco.jee.queries.annotations.internal;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.modisco.java.Annotation;
import org.eclipse.modisco.java.BodyDeclaration;
import org.eclipse.modisco.jee.queries.JEEQueriesActivator;

public final class EvaluateAnnotation {
	private EvaluateAnnotation() {
		// utility class
	}

	public static Boolean evaluate(final BodyDeclaration context, final String annotationName)
			throws ModelQueryExecutionException {

		List<Status> statusList = new ArrayList<Status>();
		try {
			for (Annotation an : context.getAnnotations()) {
				try {
					if (an.getType().getType().getName().equalsIgnoreCase(annotationName)) {
						return Boolean.TRUE;
					}
				} catch (NullPointerException e) {
					statusList.add(new Status(IStatus.ERROR, JEEQueriesActivator.PLUGIN_ID,
							"NullPointer", e)); //$NON-NLS-1$
				} catch (Exception e) {
					statusList.add(new Status(IStatus.ERROR, JEEQueriesActivator.PLUGIN_ID,
							"Unknown..", e)); //$NON-NLS-1$
				}
			}

		} catch (NullPointerException e) {
			throw new ModelQueryExecutionException("Null context not expected"); //$NON-NLS-1$
		} catch (Exception e) {
			return Boolean.FALSE;
		}
		if (!statusList.isEmpty()) {
			MultiStatus multiStatus = new MultiStatus(JEEQueriesActivator.PLUGIN_ID, IStatus.ERROR,
					statusList.toArray(new Status[] {}), "", //$NON-NLS-1$
					new Exception());
			Exception cause = new CoreException(multiStatus);
			throw new ModelQueryExecutionException(cause);
		}
		return Boolean.FALSE;
	}

}
