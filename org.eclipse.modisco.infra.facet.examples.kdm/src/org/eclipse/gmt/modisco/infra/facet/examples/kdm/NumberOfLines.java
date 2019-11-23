/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.facet.examples.kdm;

import java.io.File;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.infra.query.core.java.IJavaModelQuery;

/**
 * The number of lines in this InventoryItem
 * @deprecated Replaced by EMF Facet
 */
@Deprecated
public class NumberOfLines extends AbstractRecursiveCount implements
		IJavaModelQuery<EObject, Integer> {
	@Override
	protected Integer count(final File file) {
		return LineCountHelper.getInstance().numberOfLines(file);
	}
}
