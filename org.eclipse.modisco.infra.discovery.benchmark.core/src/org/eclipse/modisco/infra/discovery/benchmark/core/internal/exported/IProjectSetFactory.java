/*******************************************************************************
 * Copyright (c) 2011 INRIA. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors: Guillaume Doux - INRIA - Initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.modisco.infra.discovery.benchmark.core.internal.exported;

import org.eclipse.modisco.infra.discovery.benchmark.core.internal.ProjectSetFactory;

/**
 * Interface of the IprojectSet factory
 * @author Guillaume Doux
 *
 */
public interface IProjectSetFactory {

	/**
	 * The factory public instance
	 */
	public static IProjectSetFactory INSTANCE = new ProjectSetFactory();

	/**
	 * Create a new project set
	 * @return the newly created project set
	 */
	public abstract IProjectSet createProjectSet();

}