/*******************************************************************************
 * Copyright (c) 2010 Mia-Software and others.
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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.modisco.infra.common.core.internal.utils.FolderUtils;
import org.eclipse.modisco.java.generation.tests.utils.DiffGeneratedJavaTest;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.osgi.framework.Bundle;

public class Bug329672CommentsTest extends DiffGeneratedJavaTest {

	private static final String RESOURCES_XMI = "resources/Bug329672.javaxmi"; //$NON-NLS-1$
	private static final String RESOURCES_JAVA = "workspace/bug329672/src/"; //$NON-NLS-1$
	private static final String DEPLOYED_JAVA = "bug329672/"; //$NON-NLS-1$

	@Override
	protected String getJavaXmiFilePath() {
		return Bug329672CommentsTest.RESOURCES_XMI;
	}

	@Override
	protected String getCodeSourceReferencePath() {
		return Bug329672CommentsTest.RESOURCES_JAVA;
	}

	@Override
	protected String getDeployedCodeSourceReferencePath() {
		return Bug329672CommentsTest.DEPLOYED_JAVA;
	}

	@Override
	protected Bundle getCodeSourceReferenceBundle() {
		return Activator.getDefault().getBundle();
	}

	@Test
	public final void testBug329672Comments() throws CoreException, IOException {
		File sourceJavaModel = getInputModelFile();
		File targetJavaDirectory = prepareOutputDirectory();
		generateJavaCode(sourceJavaModel, targetJavaDirectory);
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
