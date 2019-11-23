/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.facet.examples.kdm;

import java.io.File;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.modisco.omg.kdm.source.AbstractInventoryElement;
import org.eclipse.modisco.omg.kdm.source.InventoryContainer;
import org.eclipse.modisco.omg.kdm.source.InventoryItem;
/**
 * @deprecated Replaced by EMF Facet
 */
@Deprecated
public abstract class AbstractRecursiveCount implements IJavaModelQuery<EObject, Integer> {
	public Integer evaluate(final EObject context, final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		if (context instanceof InventoryItem) {
			InventoryItem inventoryItem = (InventoryItem) context;
			return count(new File(inventoryItem.getPath()));
		} else if (context instanceof InventoryContainer) {
			InventoryContainer inventoryContainer = (InventoryContainer) context;
			EList<AbstractInventoryElement> children = inventoryContainer.getInventoryElement();
			int count = 0;
			for (AbstractInventoryElement child : children) {
				count += evaluate(child, null);
			}
			return count;
		}
		return 0;
	}

	protected abstract Integer count(final File file);
}
