/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *		Nicolas Guyomar (Mia-Software)
 *		Gregorie Dupe (Mia-Software) - Bug 386235 - [Releng] Use tycho to build MoDisco
 *******************************************************************************/
package org.eclipse.modisco.java.composition.discoverer.tests.compatibility;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @deprecated cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=474718
 */
@SuppressWarnings("deprecation")
@RunWith(Suite.class)
@Deprecated
@SuiteClasses({ TestMemoryUsage.class, TestJavaApp.class,
	CompositeDiscoveryTests.class, StrategySourceJavaTests.class })
public class AllTestsInUIThread {
	// JUnit 4 test suite
}
