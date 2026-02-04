/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Fabien Giquel (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.java.generation.tests;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.modisco.infra.common.core.internal.utils.FolderUtils;
import org.eclipse.modisco.java.generation.tests.utils.DiffGeneratedJavaTest;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.osgi.framework.Bundle;

public class TestGlobal001 extends DiffGeneratedJavaTest {

	private static final String RESOURCES_TEST1_XML = "resources/org.eclipse.modisco.java.discoverer.tests_test001.javaxmi"; //$NON-NLS-1$
	private static final String RESOURCES_TEST1_JAVA = "workspace/test001/src/"; //$NON-NLS-1$
	private static final String DEPLOYED_TEST1_JAVA = "test001/"; //$NON-NLS-1$
	private static final String JAVA_DISCOVERER_TESTS_PLUGINID = org.eclipse.modisco.java.discoverer.tests.Activator.PLUGIN_ID;

	@Override
	protected Bundle getCodeSourceReferenceBundle() {
		Bundle javaDiscoveryTestsBundle = Platform
		.getBundle(TestGlobal001.JAVA_DISCOVERER_TESTS_PLUGINID);
		return javaDiscoveryTestsBundle;
	}

	@Override
	protected String getJavaXmiFilePath() {
		return TestGlobal001.RESOURCES_TEST1_XML;
	}

	@Override
	protected String getCodeSourceReferencePath() {
		return TestGlobal001.RESOURCES_TEST1_JAVA;
	}

	@Override
	protected String getDeployedCodeSourceReferencePath() {
		return TestGlobal001.DEPLOYED_TEST1_JAVA;
	}

	/**
	 * Launch a java files generation, and compares result with from reference
	 * java files.
	 *
	 * @throws URISyntaxException
	 * @throws IOException
	 * @throws CoreException
	 */
	@Ignore //cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=468685
	@Test
	public final void test001_3() throws URISyntaxException, CoreException,
			IOException {
		File sourceJavaModel = getInputModelFile();
		File targetJavaDirectory = prepareOutputDirectory();
		generateJavaCode3(sourceJavaModel, targetJavaDirectory);
		Assert.assertTrue("Generation Output folder is empty", //$NON-NLS-1$
				targetJavaDirectory.listFiles().length > 0);

		File sourceJavaDirectory = getJavaSourceDirectory();
		Assert.assertTrue("Reference folder is empty", //$NON-NLS-1$
				sourceJavaDirectory.listFiles().length > 0);

		boolean compareOldAndNewFiles = FolderUtils.compareFolders(
				sourceJavaDirectory, targetJavaDirectory, new JavaFileFilter(),
				new JavaFileComparator());

		Assert.assertTrue(
				Messages.DiffGeneratedJavaTest_folders_comparison_failure
						+ Messages.DiffGeneratedJavaTest_folders_check_invitation
						+ sourceJavaDirectory.getAbsolutePath()
						+ Messages.DiffGeneratedJavaTest_7
						+ Messages.DiffGeneratedJavaTest_8
						+ targetJavaDirectory.getAbsolutePath(),
				compareOldAndNewFiles);
	}

	/**
	 * Launch a java files generation, and compares result with from reference
	 * java files.
	 *
	 * @throws URISyntaxException
	 * @throws IOException
	 * @throws CoreException
	 */
	@Ignore //cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=468685
	@Test
	public final void test001_4() throws URISyntaxException, CoreException,
			IOException {
		File sourceJavaModel = getInputModelFile();
		File targetJavaDirectory = prepareOutputDirectory();
		generateJavaCode4(sourceJavaModel, targetJavaDirectory);
		Assert.assertTrue("Generation Output folder is empty", //$NON-NLS-1$
				targetJavaDirectory.listFiles().length > 0);

		File sourceJavaDirectory = getJavaSourceDirectory();
		Assert.assertTrue("Reference folder is empty", //$NON-NLS-1$
				sourceJavaDirectory.listFiles().length > 0);

		boolean compareOldAndNewFiles = FolderUtils.compareFolders(
				sourceJavaDirectory, targetJavaDirectory, new JavaFileFilter(),
				new JavaFileComparator());

		Assert.assertTrue(
				Messages.DiffGeneratedJavaTest_folders_comparison_failure
						+ Messages.DiffGeneratedJavaTest_folders_check_invitation
						+ sourceJavaDirectory.getAbsolutePath()
						+ Messages.DiffGeneratedJavaTest_7
						+ Messages.DiffGeneratedJavaTest_8
						+ targetJavaDirectory.getAbsolutePath(),
				compareOldAndNewFiles);
	}
}
