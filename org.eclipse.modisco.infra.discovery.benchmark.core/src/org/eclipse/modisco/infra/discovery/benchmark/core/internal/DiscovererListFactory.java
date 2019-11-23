/*******************************************************************************
 * Copyright (c) 2011 INRIA.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Guillaume Doux - INRIA - Initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.modisco.infra.discovery.benchmark.core.internal;

import org.eclipse.modisco.infra.discovery.benchmark.core.internal.exported.IDiscovererList;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.exported.IDiscovererListFactory;
import org.eclipse.modisco.infra.discovery.benchmark.core.internal.impl.DiscovererList;

/**
 * Factory to initialize a new list of discoverers
 * @author Guillaume Doux
 *
 */
public class DiscovererListFactory implements IDiscovererListFactory {

	/**
	 * Create a new DiscovererList
	 */
	public IDiscovererList createDiscovererList() {
		return new DiscovererList();
	}

}
