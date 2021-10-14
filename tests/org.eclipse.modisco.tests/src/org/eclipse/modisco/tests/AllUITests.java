/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - Bug 334669 - run SWTBot tests during build
 *******************************************************************************/
package org.eclipse.modisco.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	org.eclipse.modisco.infra.browser.tests.TestMetaclasses.class,
	org.eclipse.modisco.infra.browser.tests.TestOpenModel.class,
	org.eclipse.modisco.infra.browser.tests.TestSearch.class,
	org.eclipse.modisco.infra.browser.tests.TestURIDialog.class
})
public class AllUITests {
	// JUnit 4 test suite
}
