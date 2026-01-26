/*******************************************************************************
 * Copyright (c) 2026 OBEOSOFT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Yvan Lussaud (OBEOSOFT) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.java.generation.files;

import org.eclipse.modisco.java.ASTNode;

/**
 * Services for the GenerateJava generator.
 * @since 1.6
 */
public class GenerateJavaServices {

	/**
	 * Gets brackets of the given dimension for the given {@link ASTNode}.
	 * 
	 * @param node
	 *            the {@link ASTNode}
	 * @param dimension
	 *            the dimension
	 * @return brackets of the given dimension for the given {@link ASTNode}
	 */
	public String writeBrackets(ASTNode node, int dimension) {
		StringBuilder res = new StringBuilder();

		for (int i = 0; i < dimension; i++) {
			res.append("[]"); //$NON-NLS-1$
		}

		return res.toString();
	}

}
