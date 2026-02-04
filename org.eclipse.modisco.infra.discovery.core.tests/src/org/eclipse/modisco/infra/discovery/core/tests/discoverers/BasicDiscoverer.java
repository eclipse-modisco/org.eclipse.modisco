/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Fabien Giquel - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.core.tests.discoverers;

import org.junit.Assert;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.modisco.infra.discovery.core.IDiscoverer;
import org.eclipse.modisco.infra.discovery.core.annotations.Parameter;

public class BasicDiscoverer implements IDiscoverer<Object> {

	private URI myDiscoOut;
	private Integer myDiscoIn;
	private Integer myDiscoInOut1;
	@Parameter(name = "DISCO_INOUT_2", requiresInputValue = false)
	public String myDiscoInOut2 = "One default value"; //$NON-NLS-1$

	@Parameter(name = "DISCO_OUT", description = "DISCO_OUT desc")
	public URI getMyDiscoOut() {
		return this.myDiscoOut;
	}

	@Parameter(name = "DISCO_IN", requiresInputValue = true)
	public void setMyDiscoIn(final Integer value) {
		this.myDiscoIn = value;
	}

	@Parameter(name = "DISCO_INOUT_1", description = "DISCO_INOUT_1 desc")
	public Integer getMyDiscoInOut1() {
		return this.myDiscoInOut1;
	}

	@Parameter(name = "DISCO_INOUT_1", requiresInputValue = true)
	public void setMyDiscoInOut1(final Integer myDiscoInOut1) {
		this.myDiscoInOut1 = myDiscoInOut1;
	}

	public boolean isApplicableTo(final Object source) {
		return true;
	}

	public void discoverElement(final Object source, final IProgressMonitor monitor) {
		Assert.assertNotNull(this.myDiscoInOut1);
		Assert.assertNotNull(this.myDiscoIn);
		this.myDiscoInOut2 = String.valueOf(this.myDiscoIn);
	}
}
