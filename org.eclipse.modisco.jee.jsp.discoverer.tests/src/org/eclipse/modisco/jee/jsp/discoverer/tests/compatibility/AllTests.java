/**
 * *******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 
 * 	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 * *******************************************************************************
 */
package org.eclipse.modisco.jee.jsp.discoverer.tests.compatibility;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @deprecated cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=474894
 */
@Deprecated
@SuppressWarnings("deprecation")
@RunWith(Suite.class)
@SuiteClasses({TestJsp.class, TestJSPStdAction.class, TestMemory.class, TestHtml.class })
public class AllTests {
	// JUnit 4 test suite
}
