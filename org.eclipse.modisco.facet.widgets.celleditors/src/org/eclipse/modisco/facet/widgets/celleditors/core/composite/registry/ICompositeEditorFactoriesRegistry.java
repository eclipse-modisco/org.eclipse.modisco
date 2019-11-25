/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Guyomar (Mia-Software) - Bug 339554 - org.eclipse.emf.facet.widgets.celleditors API cleaning 
 *******************************************************************************/
package org.eclipse.modisco.facet.widgets.celleditors.core.composite.registry;

import org.eclipse.modisco.facet.widgets.celleditors.ICompositeEditorFactory;
import org.eclipse.modisco.facet.widgets.celleditors.internal.composite.registries.CompositeEditorFactoriesRegistry;

/**
 * Registry for the "compositeEditorFactories" extension point
 * @noimplement This interface is not intended to be implemented by clients.
 * @noextend This interface is not intended to be extended by clients.
 * @since 1.0
 */
public interface ICompositeEditorFactoriesRegistry {

	/** the singleton {@link ICompositeEditorFactoriesRegistry} */
	ICompositeEditorFactoriesRegistry INSTANCE = new CompositeEditorFactoriesRegistry();

	/** Whether there is a {@link CompositeEditorFactory} for the given type */
	boolean hasCompositeEditorFactory(final Class<?> type);

	/**
	 * @return the {@link CompositeEditorFactory} for the given type, or <code>null</code> if none is
	 *         registered
	 */
	<T> ICompositeEditorFactory<T> getCompositeEditorFactory(final Class<T> type);

}
