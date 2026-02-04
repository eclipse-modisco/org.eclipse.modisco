/*
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software)
 */

package org.eclipse.modisco.infra.discovery.ui.internal.launch.data;

import org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter;

public interface DiscovererParameterDisplay {
	/**
	 *
	 * @return the value associated to this discoverer parameter.
	 */
	public Object getValue();

	/**
	 * To initialize the value of the discoverer parameter.
	 *
	 * @param value
	 */
	public void setValue(Object value);

	/**
	 *
	 * @return the associated discoverer parameter description
	 */
	public DiscovererParameter getParameterDescription();

	/**
	 * Initialize the parameter with an initial value.
	 *
	 * @param source
	 *            the source of the discovery
	 */
	public void initialize(Object source);
}
