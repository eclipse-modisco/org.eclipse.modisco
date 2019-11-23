/*
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
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
import org.eclipse.modisco.java.Block;

/**
 * @author Gabriel Barbier
 *
 */
public class ComputeInvocationOrder implements
		IJavaModelQuery<AbstractMethodInvocation, Integer> {

	private static final int DEFAULT_INDEX = -2;

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

	private final int computeIndex(final EObject element, final Block rootBlock) {
		int result = ComputeInvocationOrder.DEFAULT_INDEX;
		if (element.eContainer() == rootBlock) {
			result = rootBlock.getStatements().indexOf(element);
		} else {
			result = this.computeIndex(element.eContainer(), rootBlock);
		}
		return result;
	}

	public Integer evaluate(final AbstractMethodInvocation context,
			final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		int result = -1;
		/*
		 * First, retrieve the top element (method declaration) which contains
		 * this invocation. Then go back to the block element (reference body)
		 * And get the index of the parent statement (reference statements)
		 */
		AbstractMethodDeclaration caller = this.getInvoker(context);
		if (caller != null) {
			Block rootBlock = caller.getBody();
			result = this.computeIndex(context, rootBlock);
		}
		return new Integer(result);
	}
}
