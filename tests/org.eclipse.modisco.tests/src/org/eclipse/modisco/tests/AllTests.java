/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *		Nicolas Bros (Mia-Software) - initial API and implementation
 *		Gregorie Dupe (Mia-Software) - Bug 386235 - [Releng] Use tycho to build MoDisco
 *******************************************************************************/
package org.eclipse.modisco.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ org.eclipse.modisco.xml.discoverer.tests.AllTestsInUIThread.class,
		org.eclipse.modisco.infra.query.tests.AllTestsInUIThread.class,
		org.eclipse.modisco.infra.facet.tests.AllTestsInUIThread.class,
		org.eclipse.modisco.infra.browser.custom.examples.uml.tests.AllTestsInUIThread.class,
		org.eclipse.modisco.infra.browser.custom.tests.AllTestsInUIThread.class,
		org.eclipse.modisco.infra.common.core.tests.AllTestsInUIThread.class,
		org.eclipse.modisco.java.discoverer.tests.AllTestsInUIThread.class,
		org.eclipse.modisco.java.queries.tests.AllTestsInUIThread.class,
		org.eclipse.modisco.java.discoverer.benchmark.tests.AllTestsInUIThread.class,
//  see Bug 363302 - Disabled junit test java.discoverer.cdo.tests
		org.eclipse.modisco.java.discoverer.cdo.tests.AllTestsInUIThread.class,
		org.eclipse.modisco.infra.browser.custom.examples.java.jdk.tests.AllTestsInUIThread.class,
		org.eclipse.modisco.java.browser.customization.test.AllTestsInUIThread.class,
		org.eclipse.modisco.java.generation.tests.AllTestsInUIThread.class,
		org.eclipse.modisco.infra.doc.tests.AllTestsInUIThread.class,
		org.eclipse.modisco.jee.ejbjar.discoverer.tests.AllTestsInUIThread.class,
		org.eclipse.modisco.jee.webapp.discoverer.tests.AllTestsInUIThread.class,
		org.eclipse.modisco.jee.jsp.discoverer.tests.AllTestsInUIThread.class,
		org.eclipse.modisco.jee.jsp.generation.tests.DiffGeneratedJspTest.class,
		org.eclipse.modisco.kdm.uml2converter.tests.AllTestsInUIThread.class,
		org.eclipse.modisco.jee.queries.tests.AllTestsInUIThread.class,
		org.eclipse.modisco.java.composition.discoverer.tests.AllTestsInUIThread.class,
		org.eclipse.modisco.infra.discovery.core.tests.AllTestsInUIThread.class,
		org.eclipse.modisco.infra.discovery.ui.tests.AllTestsInUIThread.class,
		org.eclipse.modisco.xml.discoverer.tests.AllTestsInUIThread.class,
//		org.eclipse.modisco.utils.chart.birt.core.tests.AllTestsInUIThread.class,
		BundleTest.class
	})
public class AllTests {
	// JUnit 4 test suite
}
