/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 *     Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 */
package org.eclipse.modisco.java.discoverer.benchmark.cdo.client.nousage;

import java.util.Properties;

import org.eclipse.modisco.java.discoverer.benchmark.Messages;
import org.eclipse.modisco.java.discoverer.benchmark.cdo.client.BenchmarkJavaDiscovererCDO;
import org.eclipse.modisco.java.discoverer.benchmark.emfstat.DiscoverJavaModelFromJavaProjectEMFStat;
import org.eclipse.modisco.java.emf.JavaFactory;

public class JavaDiscovererCDONoUsages extends BenchmarkJavaDiscovererCDO {

	@Override
	public JavaFactory getEFactory() {
		org.eclipse.modisco.java.nousages.cdo.impl.JavaPackageImpl.init();
		return org.eclipse.modisco.java.nousages.cdo.meta.JavaFactory.eINSTANCE;
	}

	@Override
	protected Properties getProperties() {
		Properties properties = super.getProperties();
		properties.put(DiscoverJavaModelFromJavaProjectEMFStat.MM_VARIANT,
				Messages.JavaDiscovererCDONoUsages_0);
		return properties;
	}

}
