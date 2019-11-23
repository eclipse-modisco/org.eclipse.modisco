/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software) - Initial API
 *******************************************************************************/
package org.eclipse.modisco.infra.common.core.internal.builder;

import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

/**
 * The MoDisco project builder delegates build behavior to a set of classes
 * implementing this interface. This set of classes is defined though the use of
 * the <tt>org.eclipse.modisco.infra.common.core.internal.builder.register</tt> extension
 * point.
 *
 * @author Gregoire DUPE (Mia-Software)
 *
 */
public interface IModiscoBuilder {

	/**
	 * @see IncrementalProjectBuilder#build(int,Map,IProgressMonitor)
	 * @param builder
	 *            The MoDisco builder which delegates the build behavior to the
	 *            classes implementing this interface.
	 * @throws CoreException
	 */
	public IProject[] build(IncrementalProjectBuilder builder, int kind, Map<?, ?> args,
			IProgressMonitor monitor) throws CoreException;

	/**
	 * @see IncrementalProjectBuilder#clean(IProgressMonitor)
	 * @param builder
	 *            The MoDisco builder which delegates the build behavior to the
	 *            classes implementing this interface.
	 * @param monitor
	 * @throws CoreException
	 */
	public void clean(IncrementalProjectBuilder builder, IProgressMonitor monitor)
			throws CoreException;
}
