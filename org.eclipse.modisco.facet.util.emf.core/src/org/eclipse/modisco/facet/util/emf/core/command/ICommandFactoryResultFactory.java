/**
 *  Copyright (c) 2012, 2019 Mia-Software and others.
 *  
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 * 
 *  Contributors:
 *  	Gregoire Dupe (Mia-Software) - Bug 369987 - [Restructuring][Table] Switch to the new customization and facet framework
 *      Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 */
package org.eclipse.modisco.facet.util.emf.core.command;

import org.eclipse.emf.common.command.Command;
import org.eclipse.modisco.facet.util.emf.core.internal.command.CommandFactoryResultFactory;

/**
 * @since 0.2
 * @noimplement This interface is not intended to be implemented by clients.
 * @noextend This interface is not intended to be extended by clients.
 */
public interface ICommandFactoryResultFactory {
	
	ICommandFactoryResultFactory DEFAULT = new CommandFactoryResultFactory();
	
	<T> ICommandFactoryResult<T> createCommandFactoryResult(Command command, T result);
}
