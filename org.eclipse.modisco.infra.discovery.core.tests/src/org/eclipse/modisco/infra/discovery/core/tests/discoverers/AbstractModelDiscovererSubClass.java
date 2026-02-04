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

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;

public class AbstractModelDiscovererSubClass extends
		AbstractModelDiscoverer<IResource> {

	public boolean isApplicableTo(final IResource source) {
		return true;
	}

	@Override
	protected void basicDiscoverElement(final IResource source,
			final IProgressMonitor monitor) throws DiscoveryException {
		createTargetModel();

		// creation of model
		EPackage pkg = EcoreFactory.eINSTANCE.createEPackage();
		pkg.setName(source.getName());

		getTargetModel().getContents().add(pkg);
	}
}
