/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *		Nicolas Bros (Mia-Software)
 *		Fabien Giquel (Mia-Software) - Bug 339720 - MoDisco Discoverers (infra + techno) API clean
 *		Gregoire Dupe (Mia-Software) - Bug 386235 - [Releng] Use tycho to build MoDisco
 *******************************************************************************/
package org.eclipse.gmt.modisco.kdm.uml2converter.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @deprecated use matching org.eclipse.modisco.x.y.z component,
 *             cf.https://bugs.eclipse.org/bugs/show_bug.cgi?id=474827
 */
@Deprecated
@RunWith(Suite.class)
@SuiteClasses({ HotTransformationTest.class, KdmToUml2ConverterTest.class })
public class AllTestsInUIThread {
	// JUnit 4 test suite
}
