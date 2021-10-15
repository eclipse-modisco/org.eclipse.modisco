/*******************************************************************************
 * Copyright (c) 2011, 2019 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Guillaume Doux - INRIA - Initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.modisco.infra.discovery.benchmark.core.internal.api;

/**
 * Interface for the discoverer ID element
 * @author Guillaume Doux
 *
 */
public interface IDiscovererID {

	/**
	 * Give the discoverer ID in a String
	 * @return the String version of the discoverer ID
	 */
	public String getId();

}
