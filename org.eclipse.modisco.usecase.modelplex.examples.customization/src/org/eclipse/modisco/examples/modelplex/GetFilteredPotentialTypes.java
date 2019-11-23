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

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.modisco.java.Assignment;
import org.eclipse.modisco.java.ClassInstanceCreation;
import org.eclipse.modisco.java.Expression;
import org.eclipse.modisco.java.SingleVariableAccess;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.VariableDeclaration;

/**
 * @author Gabriel Barbier
 *
 */
public class GetFilteredPotentialTypes implements
		IJavaModelQuery<VariableDeclaration, EList<Type>> {

	public EList<Type> getFilteredPotentialTypes(final VariableDeclaration source) {
		EList<VariableDeclaration> parents = new BasicEList<VariableDeclaration>();
		EList<Type> result = this.getBasicFilteredPotentialTypes(source, parents);
		return result;
	}

	private final EList<Type> getBasicFilteredPotentialTypes(final VariableDeclaration source, final EList<VariableDeclaration> parents) {
		EList<Type> result = new BasicEList<Type>();
		if (!parents.contains(source)) {
			parents.add(source);

			Expression initializer = source.getInitializer();
			if ((initializer != null) && (initializer instanceof ClassInstanceCreation)) {
				ClassInstanceCreation classInstanceCreation = (ClassInstanceCreation) initializer;
				result.add(classInstanceCreation.getType().getType());
			}
			result.addAll(this.filterAssignement(source, parents));
		}
		return result;
	}
	private final EList<Type> filterAssignement(final VariableDeclaration source, final EList<VariableDeclaration> parents) {
		EList<Type> result = new BasicEList<Type>();
		for (SingleVariableAccess access : source.getUsageInVariableAccess()) {
			EObject container = access.eContainer();
			if (container instanceof Assignment) {
				Assignment assignment = (Assignment) container;
				Expression expression = assignment.getRightHandSide();
				if (expression instanceof ClassInstanceCreation) {
					ClassInstanceCreation classInstanceCreation = (ClassInstanceCreation) expression;
					result.add(classInstanceCreation.getType().getType());
				} else if (expression instanceof SingleVariableAccess) {
					/*
					 * potential infinite recursion
					 *
					 * Object tmp;
					 * Object src = tmp;
					 * ...
					 * tmp = src;
					 */
					SingleVariableAccess singleVariableAccess = (SingleVariableAccess) expression;
					result.addAll(this.getBasicFilteredPotentialTypes(singleVariableAccess.getVariable(), parents));
				}
			}
		}
		return result;
	}

	public EList<Type> evaluate(final VariableDeclaration context,
			final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		return this.getFilteredPotentialTypes(context);
	}
}
