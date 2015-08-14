/*******************************************************************************
 * Copyright (c) 2010, 2012 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Guyomar (Mia-Software)
 *     Gregoire Dupe (Mia-Software) - Bug 386235 - [Releng] Use tycho to build MoDisco
 *******************************************************************************/
package org.eclipse.modisco.jee.webapp.discoverer.tests.compatibility;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
/**
 * @deprecated cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=474893
 */
@Deprecated
@RunWith(Suite.class)
@SuiteClasses({
	TestCommentedDocType.class,
	TestNoVersion.class,
	/* TestNoUri.class, disabled because of Bug 354468 : the test doesn't finish */
	TestWebXml22.class,
	TestWebXml23.class,
	TestWebXml24.class,
	TestWebXml25.class,
	TestWebXml30.class
	})
public class AllTestsInUIThread {
	// JUnit 4 test suite
}