/*******************************************************************************
 * Copyright (c) 2010 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Fabien Giquel - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.core.tests.discoverers;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.modisco.infra.discovery.core.IDiscoverer;
import org.eclipse.modisco.infra.discovery.core.annotations.Parameter;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;

public class WrongDiscoverer implements IDiscoverer<Object> {

	@Parameter(name = "PARAM1")
	public void notACorrectGetter() {
		//
	}

	@SuppressWarnings("unused") // for tests
	@Parameter(name = "PARAM2")
	public void notACorrectSetter(final Object param1, final Object param2) {
		//
	}

	@Parameter(name = "PARAM3")
	public Object moreThanOneAnnotatedField;
	@Parameter(name = "PARAM3")
	public Object moreThanOneAnnotatedField2;

	@Parameter(name = "PARAM4")
	public Object moreThanOneAnnotatedGetter() {
		return null;
	}

	@Parameter(name = "PARAM4")
	public Object moreThanOneAnnotatedGetter2() {
		return null;
	}

	@Parameter(name = "PARAM5")
	public String notACoherentTypeField;

	@SuppressWarnings("unused") // for tests
	@Parameter(name = "PARAM5")
	public void notACoherentTypeSetter(final Integer value) {
		//
	}

	@Parameter(name = "PARAM6")
	public String notACoherentTypeField2;

	@Parameter(name = "PARAM6")
	public Integer notACoherentTypeGetter2() {
		return null;
	}

	@Parameter(name = "PARAM7")
	public String notACoherentTypeGetter3() {
		return null;
	}

	@SuppressWarnings("unused") // for tests
	@Parameter(name = "PARAM7")
	public void notACoherentTypeSetter3(final Integer value) {
		//
	}

	public boolean isApplicableTo(final Object source) {
		// nothing
		return true;
	}

	public void discoverElement(final Object source, final IProgressMonitor monitor)
			throws DiscoveryException {
		// nothing
	}

}
