/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *		Nicolas Bros (Mia-Software)
 *		Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *		Gregoire Dupe (Mia-Software) - Bug 386235 - [Releng] Use tycho to build MoDisco
 *		Fabien Giquel (Mia-Software) - Bug 351590 - [Java] ClassCastException while discovering Apache math commons
 *******************************************************************************/
package org.eclipse.modisco.java.discoverer.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Bug329423CommentsTest.class, Java2KdmConverterTest.class,
		JavaJUnitEMF.class, JavaProject2KdmTest.class,
		ParameterizedDiscovery.class, SimpleBlackBoxConverter.class,
		SimpleBlackBoxDiscovery.class, Bug351590ClassCastWithAnnotationMemberTest.class, TestSaveAll.class })
public class AllTestsInUIThread {
	// JUnit 4 test suite
}
