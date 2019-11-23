/*******************************************************************************
 * Copyright (c) 2009 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Gregoire Dupe (Mia-Software) - Bug 347833 - Wrong plug-in providers and missing incubation tags.
 *******************************************************************************/
package org.eclipse.modisco.tests;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.eclipse.core.runtime.Platform;
import org.junit.Test;
import org.osgi.framework.Bundle;

public class NameAndProviderTest {

	@Test
	public void name() {
		test("Bundle-Name", ".*\\(Incubation\\)");
	}

	@Test
	public void provider() {
		test("Bundle-Vendor", "Eclipse Modeling Project");
	}

	private void test(final String property, final String regex) {
		List<Bundle> wrongBundle = new ArrayList<Bundle>();
		Bundle[] bundles = Platform.getBundle("org.eclipse.modisco.tests").getBundleContext()
				.getBundles();
		for (int i = 0; i < bundles.length; i++) {
			String symbolicName = bundles[i].getSymbolicName();
			if (symbolicName.matches("org\\.eclipse\\.modisco\\..*")) {
				if (!bundles[i].getHeaders().get(property).toString().matches(regex)) {
					wrongBundle.add(bundles[i]);
				}
			}
		}
		if (wrongBundle.size() > 0) {
			StringBuffer sb = new StringBuffer("Wrong " + property + " in:");
			for (Bundle bundle : wrongBundle) {
				sb.append('\n' + bundle.getSymbolicName() + " -> "
						+ bundle.getHeaders().get(property));
			}
			Assert.fail(sb.toString());
		}
	}
}