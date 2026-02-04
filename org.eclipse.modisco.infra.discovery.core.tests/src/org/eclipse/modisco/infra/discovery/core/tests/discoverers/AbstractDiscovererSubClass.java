/*******************************************************************************
 * Copyright (c) 2019 Mia-Software and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Unknown - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.core.tests.discoverers;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.modisco.infra.discovery.core.AbstractDiscoverer;
import org.eclipse.modisco.infra.discovery.core.annotations.Parameter;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;

public class AbstractDiscovererSubClass extends AbstractDiscoverer<Object> {

	private String myDiscoIn;
	private String myDiscoIn2 = "Some Default Value"; //$NON-NLS-1$

	@Parameter(name = "DISCO_IN")
	public String getMyDiscoIn() {
		return this.myDiscoIn;
	}

	@Parameter(name = "DISCO_IN", requiresInputValue = true)
	public void setMyDiscoIn(final String myDiscoIn) {
		this.myDiscoIn = myDiscoIn;
	}

	@Parameter(name = "DISCO_IN2")
	public String getMyDiscoIn2() {
		return this.myDiscoIn2;
	}

	@Parameter(name = "DISCO_IN2")
	// , requiresInputValue = false)
	public void setMyDiscoIn2(final String myDiscoIn2) {
		this.myDiscoIn2 = myDiscoIn2;
	}

	public boolean isApplicableTo(final Object source) {
		return isAnIFileWithExtension(source, "ext"); //$NON-NLS-1$
	}

	@Override
	protected void basicDiscoverElement(final Object source, final IProgressMonitor monitor)
			throws DiscoveryException {
		//
	}

}
