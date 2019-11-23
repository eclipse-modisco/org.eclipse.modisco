/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *		Nicolas Bros (Mia-Software)
 *		Gregoire Dupe (Mia-Software) - Bug 386235 - [Releng] Use tycho to build MoDisco
 *******************************************************************************/
package org.eclipse.modisco.jee.webapp.discoverer.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	TestCommentedDocType.class,
	TestNoVersion.class,
	TestNoUri.class,
	TestWebXml22.class,
	TestWebXml23.class,
	TestWebXml24.class,
	TestWebXml25.class,
	TestWebXml30.class
	})
public class AllTestsInUIThread {
	// JUnit 4 test suite
}