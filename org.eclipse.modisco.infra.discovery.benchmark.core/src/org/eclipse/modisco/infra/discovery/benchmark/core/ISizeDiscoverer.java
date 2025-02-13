/*******************************************************************************
 * Copyright (c) 2015, 20190 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Grégoire Dupé (Mia-Sftware) - Bug 483400 - [Benchmark] The input size should be computable by the discoverer
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.benchmark.core;

import org.eclipse.core.resources.IProject;
import org.eclipse.modisco.infra.discovery.core.IDiscoverer;

public interface ISizeDiscoverer extends IDiscoverer<IProject> {
	String getUnit();
	double getSize();
}
