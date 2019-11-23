/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 *     Fabien Giquel (Mia-Software) - initial API and implementation
 *     Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 */
package org.eclipse.modisco.java.discoverer.benchmark.emf.client;

import java.util.Properties;

import org.eclipse.modisco.java.discoverer.benchmark.Messages;
import org.eclipse.modisco.java.discoverer.benchmark.emfstat.DiscoverJavaModelFromJavaProjectEMFStat;
import org.eclipse.modisco.java.discoverer.benchmark.emfstat.JavaReaderEMFStat;
import org.eclipse.modisco.java.emf.JavaFactory;

public class JavaDiscovererIncrementalClassicalEMF extends DiscoverJavaModelFromJavaProjectEMFStat {

	@Override
	protected JavaReaderEMFStat getJavaReader(final java.util.Map<String, Object> elementOptions) {
		JavaReaderEMFStat javaReader = new JavaReaderEMFStat(getEFactory(), true);
		javaReader.setStatistics(getStatistics());
		return javaReader;
	}

	@Override
	public Properties getProperties() {
		Properties properties = super.getProperties();
		properties.put(DiscoverJavaModelFromJavaProjectEMFStat.ALGO_VARIANT,
				Messages.JavaDiscoverIncrementalClassicalEMF_0);
		properties.put(DiscoverJavaModelFromJavaProjectEMFStat.MM_VARIANT, "Classic EObject"); //$NON-NLS-1$
		return properties;
	}

	@Override
	public JavaFactory getEFactory() {
		return org.eclipse.modisco.java.emf.classic.JavaFactory.eINSTANCE;
	}
}
