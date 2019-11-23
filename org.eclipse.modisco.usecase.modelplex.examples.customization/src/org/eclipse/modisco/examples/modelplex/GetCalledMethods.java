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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
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
public class GetCalledMethods
		implements
		IJavaModelQuery<AbstractMethodDeclaration, EList<AbstractMethodDeclaration>> {

	private final List<AbstractMethodInvocation> getAllInvocations(final AbstractMethodDeclaration source) {
		List<AbstractMethodInvocation> result = new ArrayList<AbstractMethodInvocation>();
		TreeIterator<EObject> iterator = source.eResource().getAllContents();
		while (iterator.hasNext()) {
			EObject object = iterator.next();
			if (object instanceof AbstractMethodInvocation) {
				AbstractMethodInvocation invocation = (AbstractMethodInvocation) object;
				if (source == this.getInvoker(invocation)) {
					result.add(invocation);
				}
			}
		}
		return result;
	}

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

	private static class MethodInvocationComparator implements Comparator<AbstractMethodInvocation>  {

		private static final int DEFAULT_INDEX = -2;

		MethodInvocationComparator() {
			// Only visible from the package
		}

		public int compare(final AbstractMethodInvocation invocation1,
				final AbstractMethodInvocation invocation2) {
			/*
			 * Initially, I used location in file
			 * to sort invocations, but needed information
			 * is no longer retained in java model ...
			 *
			 * Perhpas could I use index of parent element
			 * which is directly contained in block statement
			 * of the declaring method ?
			 */
			Block rootBlock1 = this.getRootBlock(invocation1);
			Block rootBlock2 = this.getRootBlock(invocation2);
			int index1 = this.computeIndex(invocation1, rootBlock1);
			int index2 = this.computeIndex(invocation2, rootBlock2);
			/*
			 * specific case:
			 * both invocations have the same index
			 * and are contained in the same block.
			 *
			 * So we have to retrieve first common parent block
			 * and use it to compute index ...
			 */
			if ((index1 == index2) && (rootBlock1 == rootBlock2)) {
				Block commonBlock = this.getFirstCommonParentBlock(invocation1, invocation2, rootBlock1);
				index1 = this.computeIndex(invocation1, commonBlock);
				index2 = this.computeIndex(invocation2, commonBlock);
			}

			int result = Integer.valueOf(index1).compareTo(Integer.valueOf(index2));
			return result;
		}

		private final int computeIndex(final EObject element, final Block rootBlock) {
			int result = MethodInvocationComparator.DEFAULT_INDEX;
			if (element.eContainer() == rootBlock) {
				result = rootBlock.getStatements().indexOf(element);
			} else {
				result = this.computeIndex(element.eContainer(), rootBlock);
			}
			return result;
		}

		private final Block getRootBlock(final EObject element) {
			Block result = null;
			if (element != null) {
				if (element instanceof AbstractMethodDeclaration) {
					result = ((AbstractMethodDeclaration) element).getBody();
				} else {
					result = this.getRootBlock(element.eContainer());
				}
			}
			return result;
		}
		/*
		 * To retrieve the first common parent block of two elements
		 * lets start from an example:
		 * block A contains another block B (with other statements)
		 * block B contains two blocks C and D which contains respectively element1 and element2
		 *
		 * Here the algorithm:
		 * From element1, I get the nearest parent block
		 * Then I will iterate on all parent blocks of element2 and test identity
		 * If not found, I have to iterate on parent block of element1
		 * And test again on all parent blocks of element2
		 * ...
		 */
		private final Block getFirstCommonParentBlock(final EObject sourceElement, final EObject element2, final Block stopper) {
			Block result = this.getParentBlock(sourceElement);
			if (result != stopper) {
				if (!this.isParentBlock(element2, result, stopper)) {
					result = this.getFirstCommonParentBlock(result, element2, stopper);
				} // else, result is the first common parent block
			}
			return result;
		}
		private final boolean isParentBlock(final EObject element, final Block target, final Block stopper) {
			boolean result = false;
			Block parent = this.getParentBlock(element);
			if (parent != stopper) {
				if (parent == target) {
					result = true;
				} else {
					result = this.isParentBlock(parent, target, stopper);
				}
			}
			return result;
		}
		private final Block getParentBlock(final EObject element) {
			Block result = null;
			if (element != null) {
				if (element.eContainer() instanceof Block) {
					result = (Block) element.eContainer();
				} else {
					result = this.getParentBlock(element.eContainer());
				}
			}
			return result;
		}
	}

	public EList<AbstractMethodDeclaration> evaluate(
			final AbstractMethodDeclaration context,
			final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		EList<AbstractMethodDeclaration> result = new BasicEList<AbstractMethodDeclaration>();

		List<AbstractMethodInvocation> invocations = this
				.getAllInvocations(context);
		Collections.sort(invocations, new MethodInvocationComparator());

		for (AbstractMethodInvocation invocation : invocations) {
			result.add(invocation.getMethod());
		}
		return result;
	}
}
