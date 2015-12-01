/*******************************************************************************
 * Copyright (c) 2012 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *		Gregoire Dupe (Mia-Software) - Bug 386235 - [Releng] Use tycho to build MoDisco
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @deprecated cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=343840
 */
@Deprecated
@RunWith(Suite.class)
@SuiteClasses({ BooleanCellEditorTest.class })
public class AllTestsInUIThread {
	// JUnit 4 test suite
}