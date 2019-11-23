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

package org.eclipse.gmt.modisco.examples.modelplex.custom;

import org.eclipse.gmt.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.gmt.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.gmt.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.gmt.modisco.java.BodyDeclaration;
import org.eclipse.gmt.modisco.java.ClassDeclaration;
import org.eclipse.gmt.modisco.java.MethodDeclaration;

/**
 * @author Gabriel Barbier
 *
 */
public class HasMainMethod implements IJavaModelQuery<ClassDeclaration, Boolean> {

	public Boolean evaluate(final ClassDeclaration context,
			final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		boolean result = false;
		if (context.getBodyDeclarations() != null) {
			/*
			 * inspect body of current class to find main method.
			 */
			for (BodyDeclaration bodyDeclaration : context.getBodyDeclarations()) {
				/*
				 * check if it is a method declaration
				 */
				if (bodyDeclaration instanceof MethodDeclaration) {
					MethodDeclaration methodDeclaration = (MethodDeclaration) bodyDeclaration;
					/*
					 * a main method is mandatory named "main" and is static.
					 */
					if ((methodDeclaration.getName().equals("main")) //$NON-NLS-1$
							&& (methodDeclaration.getModifier().isStatic())) {
						result = true;
					}
				}
			}
		}
		return new Boolean(result);
	}
}
