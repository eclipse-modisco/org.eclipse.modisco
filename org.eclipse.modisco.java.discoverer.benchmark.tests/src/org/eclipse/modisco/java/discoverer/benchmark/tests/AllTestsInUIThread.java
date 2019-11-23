/*******************************************************************************
 * Copyright (c) 2010 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *		Nicolas Bros (Mia-Software)
 *		Fabien Giquel (Mia-Software) - Bug 339720 - MoDisco Discoverers (infra + techno) API clean
 *		Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *		Gregoire Dupe (Mia-Software) - Bug 386235 - [Releng] Use tycho to build MoDisco
 *******************************************************************************/
package org.eclipse.modisco.java.discoverer.benchmark.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ JavaDiscovererBenchmarkTest.class /*, JavaScalabilityTest.class */ })
public class AllTestsInUIThread {
	// JUnit 4 test suite
}
