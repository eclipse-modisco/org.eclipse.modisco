/*******************************************************************************
 * Copyright (c) 2011, 2019 INRIA. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors: Guillaume Doux - INRIA - Initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.modisco.infra.discovery.benchmark.core.internal;

import org.eclipse.modisco.infra.discovery.benchmark.core.internal.exported.IProjectSet;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.exported.IProjectSetFactory;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.impl.ProjectSet;

/**
 * Factory for creating project sets
 * @author Guillaume Doux
 *
 */
public class ProjectSetFactory implements IProjectSetFactory {

	/**
	 * Create a new ProjectSet
	 */
	public IProjectSet createProjectSet() {
		return new ProjectSet();
	}

}
