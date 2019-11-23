/*******************************************************************************
 * Copyright (c) 2011 INRIA. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors: Guillaume Doux - INRIA - Initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.modisco.infra.discovery.benchmark.core.internal.api;

import org.eclipse.core.resources.IFile;

/**
 * Interface for file filters
 * @author Guillaume Doux
 *
 */
public interface IFileFilter {

	/**
	 * Say if the file in parameter is accepted by the filter
	 * @param file to test
	 * @return true if file is accepted
	 */
	public abstract boolean accept(IFile file);

}
