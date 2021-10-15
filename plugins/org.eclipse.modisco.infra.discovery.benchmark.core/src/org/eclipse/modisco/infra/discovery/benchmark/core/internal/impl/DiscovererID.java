/*******************************************************************************
 * Copyright (c) 2012, 2019 INRIA. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors: Guillaume Doux - INRIA - Initial API and implementation
 *
 ******************************************************************************/

package org.eclipse.modisco.infra.discovery.benchmark.core.internal.impl;

import org.eclipse.modisco.infra.discovery.benchmark.core.internal.api.IDiscovererID;

/**
 * The discover Id implementation class
 * @see IDiscovererID
 * @author Guillaume Doux
 *
 */
public class DiscovererID implements IDiscovererID {

	private String id;

	public String getId() {
		return this.id;
	}

	public DiscovererID(final String id) {
		super();
		this.id = id;
	}

}
