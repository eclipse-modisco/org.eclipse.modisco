/*
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 */

package org.eclipse.modisco.examples.modelplex;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.modisco.java.AbstractMethodDeclaration;
import org.eclipse.modisco.java.AbstractMethodInvocation;

/**
 * @author Gabriel Barbier
 *
 */
public class GetCallerFromInvocation implements
		IJavaModelQuery<AbstractMethodInvocation, AbstractMethodDeclaration> {

	private final AbstractMethodDeclaration getInvoker(final EObject element) {
		AbstractMethodDeclaration result = null;
		if (element != null) {
			if (element instanceof AbstractMethodDeclaration) {
				result = (AbstractMethodDeclaration) element;
			} else {
				result = this.getInvoker(element.eContainer());
			}
		}
		return result;
	}

	public AbstractMethodDeclaration evaluate(
			final AbstractMethodInvocation context,
			final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		AbstractMethodDeclaration result = null;
		result = this.getInvoker(context);
		return result;
	}
}
