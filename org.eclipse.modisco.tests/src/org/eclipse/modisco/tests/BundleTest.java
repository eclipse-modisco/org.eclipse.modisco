/*******************************************************************************
 * Copyright (c) 2011, 2020 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Gregoire Dupe (Mia-Software) - Bug 347946 - Wrong Bundle-Version
 *******************************************************************************/
package org.eclipse.modisco.tests;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.junit.Assert;
import org.junit.Test;
import org.osgi.framework.Bundle;

public class BundleTest {

	private static final String BUNDLE_ID_REGEX = "org\\.eclipse\\.modisco\\..*"; //$NON-NLS-1$
	private final Bundle testBundle = Platform.getBundle("org.eclipse.modisco.tests"); //$NON-NLS-1$

	@Test
	public void name() {
		testManifestProperty("Bundle-Name", "MoDisco .*?( Source){0,1}+"); //$NON-NLS-1$ //$NON-NLS-2$
	}

	@Test
	public void provider() {
		testManifestProperty("Bundle-Vendor", "Eclipse Modeling Project"); //$NON-NLS-1$//$NON-NLS-2$
	}

	@Test
	public void version() {
		testManifestProperty("Bundle-Version", "1\\.5\\.\\d+\\..*"); //$NON-NLS-1$ //$NON-NLS-2$
	}

	@Test
	public void about() {
		List<Bundle> wrongBundle = test(new RunnableTest() {
			@Override
			public void run(final Bundle bundle) {
				URL url = bundle.getResource("/about.html"); //$NON-NLS-1$
				Assert.assertNotNull(url);
			}
		});
		if (wrongBundle.size() > 0) {
			StringBuffer sb = new StringBuffer("About files are missing in:"); //$NON-NLS-1$
			for (Bundle bundle : wrongBundle) {
				sb.append('\n' + bundle.getSymbolicName());
			}
			Assert.fail(sb.toString());
		}
	}

	private void testManifestProperty(final String property, final String regex) {
		List<Bundle> wrongBundle = test(new RunnableTest() {
			@Override
			public void run(final Bundle bundle) {
				Assert.assertTrue(bundle.getHeaders().get(property).toString().matches(regex));
			}
		});
		if (wrongBundle.size() > 0) {
			StringBuffer sb = new StringBuffer("Wrong " + property + " in:"); //$NON-NLS-1$//$NON-NLS-2$
			for (Bundle bundle : wrongBundle) {
				sb.append('\n' + bundle.getSymbolicName() + " -> " + //$NON-NLS-1$
						bundle.getHeaders().get(property));
			}
			Assert.fail(sb.toString());
		}

	}

	private List<Bundle> test(final RunnableTest runable) {
		List<Bundle> wrongBundle = new ArrayList<Bundle>();
		Bundle[] bundles = this.testBundle.getBundleContext().getBundles();
		for (Bundle bundle : bundles) {
			String symbolicName = bundle.getSymbolicName();
			if (symbolicName.matches(BundleTest.BUNDLE_ID_REGEX)) {
				try {
					runable.run(bundle);
				} catch (AssertionError  e) {
					wrongBundle.add(bundle);
				}
			}
		}
		return wrongBundle;
	}

	private interface RunnableTest {
		public void run(Bundle bundle);
	}
}
