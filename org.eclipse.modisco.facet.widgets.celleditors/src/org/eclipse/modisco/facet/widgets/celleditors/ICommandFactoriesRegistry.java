/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Guyomar (Mia-Software) - Bug 339554 - org.eclipse.modisco.facet.widgets.celleditors API cleaning
 *******************************************************************************/
package org.eclipse.modisco.facet.widgets.celleditors;

import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.modisco.facet.widgets.celleditors.internal.CommandFactoriesRegistry;

/**
 * Registry for the "commandFactories" extension point. It is used to create EMF {@link Command}s
 * compatible with a given {@link EditingDomain}.
 * <p>
 * For example, a <code>TransactionalEditingDomain</code> doesn't work with the usual EMF commands,
 * and the model must be manipulated with {@link Command}s that use transactions.
 * @noimplement This interface is not intended to be implemented by clients.
 * @noextend This interface is not intended to be extended by clients.
 */
public interface ICommandFactoriesRegistry {

	/** the singleton {@link ICommandFactoriesRegistry} */
	static ICommandFactoriesRegistry INSTANCE = new CommandFactoriesRegistry();

	/** @return the list of registered command factories */
	List<ICommandFactory> getCommandFactories();

	/**
	 * @return a command factory compatible with the given {@link EditingDomain}, or
	 *         <code>null</code> if none is found
	 */
	ICommandFactory getCommandFactoryFor(final EditingDomain editingDomain);
}