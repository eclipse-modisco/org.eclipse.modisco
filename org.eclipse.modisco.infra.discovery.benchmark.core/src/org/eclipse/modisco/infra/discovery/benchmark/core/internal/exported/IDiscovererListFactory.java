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
package org.eclipse.modisco.infra.discovery.benchmark.core.internal.exported;

import org.eclipse.modisco.infra.discovery.benchmark.core.internal.DiscovererListFactory;

/**
 * Interface of the DiscovererList factory
 * @author Guillaume Doux
 *
 */
public interface IDiscovererListFactory {

	/**
	 * Instance of the factroy
	 */
	public static IDiscovererListFactory INSTANCE = new DiscovererListFactory();

	/**
	 * Creation of a new DiscovererList
	 * @return the new DiscovererList
	 */
	public IDiscovererList createDiscovererList();

}
