/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.doc.tests;

import java.net.URL;

import junit.framework.Assert;

import org.eclipse.core.runtime.Platform;
import org.junit.Test;

public class InfraDocTest {

	private static final String INFRA_DOC_BUNDLE_ID = "org.eclipse.modisco.infrastructure.doc"; //$NON-NLS-1$

	/**
	 * MoDisco help content is generated automatically in nightly builds.
	 * Make sure this releng step has worked well.
	 */
	@Test
	public void testDocPresence() {
		URL tocResource = Platform.getBundle(InfraDocTest.INFRA_DOC_BUNDLE_ID).getResource("toc.xml"); //$NON-NLS-1$
		Assert.assertNotNull("Help content toc.xml file was not found for " + InfraDocTest.INFRA_DOC_BUNDLE_ID, tocResource); //$NON-NLS-1$

		URL docResource = Platform.getBundle(InfraDocTest.INFRA_DOC_BUNDLE_ID).getResource("mediawiki/model_browser/user.html"); //$NON-NLS-1$
		Assert.assertNotNull("Generated HTML doc not found for " + InfraDocTest.INFRA_DOC_BUNDLE_ID, docResource); //$NON-NLS-1$

	}
}
