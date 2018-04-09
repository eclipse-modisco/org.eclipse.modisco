/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 338702 - [Discovery] specify initial value for Parameters
 *    Fabien Giquel (Mia-Software) - Bug 343834 - [Discovery] improve new Discoverers implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.core.tests.discoverers;

import junit.framework.Assert;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.modisco.infra.discovery.core.IDiscoverer;
import org.eclipse.modisco.infra.discovery.core.annotations.Parameter;
import org.eclipse.modisco.infra.discovery.core.annotations.ParameterInitialValue;

public class BasicDiscovererWithInitialValue implements IDiscoverer<Object> {

	public static final Integer DEFAULT_VALUE = Integer.valueOf(46);
	private Integer myDiscoIn;

	@Parameter(name = "DISCO_IN", requiresInputValue = true)
	public void setMyDiscoIn(final Integer value) {
		this.myDiscoIn = value;
	}

	@SuppressWarnings("unused") // framework defined signature
	@ParameterInitialValue(name = "DISCO_IN")
	public static Integer getMyDiscoInInitialValue(final Object source) {
		return BasicDiscovererWithInitialValue.DEFAULT_VALUE;
	}

	public boolean isApplicableTo(final Object source) {
		return true;
	}

	public void discoverElement(final Object source,
			final IProgressMonitor monitor) {
		Assert.assertNotNull(this.myDiscoIn);
	}
}
