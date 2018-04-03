/*********************************************************************************
 * Copyright (c) 2009, 2011, 2012 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *		Nicolas Guyomar (Mia-Software) - initial API and implementation
 *		Nicolas Bros (Mia-Software) - adapted to new discovery framework (Bug 335003)
 *		Gregoire Dupe (Mia-Software) - Bug 386235 - [Releng] Use tycho to build MoDisco
 *********************************************************************************/
package org.eclipse.modisco.jee.jsp.discoverer.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({TestJsp.class, TestJSPStdAction.class, TestMemory.class, TestHtml.class })
public class AllTestsInUIThread {
	// JUnit 4 test suite
}
