/*******************************************************************************
 * Copyright (c) 2008, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *******************************************************************************/

package org.eclipse.modisco.kdm.uml2converter.tests;

import java.io.File;
import java.io.InputStream;

import org.junit.Assert;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.engine.parser.AtlParser;
import org.eclipse.modisco.infra.common.core.internal.utils.FolderUtils;
import org.eclipse.modisco.kdm.uml2converter.internal.KdmToUmlConverter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HotTransformationTest {
	// to be able to replace the reference after a change in transformation
	private final boolean export = false;

	private AtlProjectFactory projectFactory;

	@Before
	public void setUp() throws Exception {
		this.projectFactory = new AtlProjectFactory(this.getClass().getSimpleName());
	}

	@After
	public void tearDown() throws Exception {
		if (this.projectFactory != null) {
			this.projectFactory.dispose();
		}
	}

	@Test
	public void testExportTransformation() throws Exception {
		Assert.assertNotNull(this.projectFactory);
		/*
		 * we will export the atl transformation to convert kdm model to uml
		 * model.
		 */
		final KdmToUmlConverter converter = new KdmToUmlConverter();
		Assert.assertNotNull(converter);
		final String targetFilename = "KdmToUmlConversion.atl"; //$NON-NLS-1$
		final IFile targetFile = this.projectFactory.getProject().getFile(targetFilename);
		Assert.assertNotNull(targetFile);
		Assert.assertFalse(targetFile.exists());
		converter.basicExportKdmToUmlTransformation(targetFile, new NullProgressMonitor());
		Assert.assertTrue(targetFile.exists());
	}

	@Test
	public void testExportAndModelTransformation() throws Exception {
		Assert.assertNotNull(this.projectFactory);
		/*
		 * we will export the atl transformation to convert kdm model to uml
		 * model.
		 */
		final KdmToUmlConverter converter = new KdmToUmlConverter();
		Assert.assertNotNull(converter);
		final String targetFilename = "KdmToUmlConversion.atl"; //$NON-NLS-1$
		final IFile targetFile = this.projectFactory.getProject().getFile(targetFilename);
		Assert.assertNotNull(targetFile);
		Assert.assertFalse(targetFile.exists());
		converter.basicExportKdmToUmlTransformation(targetFile, new NullProgressMonitor());
		Assert.assertTrue(targetFile.exists());

		// transforms ATL file into ATL model
		InputStream sourceTransformation;
		sourceTransformation = targetFile.getContents();
		try {
			Assert.assertNotNull(sourceTransformation);
			IModel sourceModel = AtlParser.getDefault().parseToModel(sourceTransformation);
			Assert.assertNotNull(sourceModel);
			if (sourceModel instanceof EMFModel) {
				URI sourceModelUri = URI.createPlatformResourceURI(targetFile.getFullPath()
						.addFileExtension("ecore").toString(), false); //$NON-NLS-1$
				EMFModel ecoreSourceModel = (EMFModel) sourceModel;
				ecoreSourceModel.getResource().setURI(sourceModelUri);
				ecoreSourceModel.getResource().save(null);
			}
		} finally {
			sourceTransformation.close();
		}
	}

	@Test
	public void testExportModelAndAddTraceability() throws Exception {
		Assert.assertNotNull(this.projectFactory);
		/*
		 * we will export the atl transformation to convert kdm model to uml
		 * model.
		 */
		final KdmToUmlConverter converter = new KdmToUmlConverter();
		Assert.assertNotNull(converter);
		final String targetFilename = "KdmToUmlConversion.atl"; //$NON-NLS-1$
		final IFile targetFile = this.projectFactory.getProject().getFile(targetFilename);
		Assert.assertNotNull(targetFile);
		Assert.assertFalse(targetFile.exists());
		converter.basicExportKdmToUmlTransformation(targetFile, new NullProgressMonitor());
		Assert.assertTrue(targetFile.exists());

		// transforms ATL file into ATL model
		InputStream sourceTransformation;
		sourceTransformation = targetFile.getContents();
		Assert.assertNotNull(sourceTransformation);
		try {
			IModel sourceModel = AtlParser.getDefault().parseToModel(sourceTransformation);
			Assert.assertNotNull(sourceModel);
			if (sourceModel instanceof EMFModel) {
				final String sourceModelFilename = targetFilename + ".ecore"; //$NON-NLS-1$
				final IFile sourceModelFile = this.projectFactory.getProject().getFile(
						sourceModelFilename);
				Assert.assertNotNull(sourceModelFile);
				Assert.assertFalse(sourceModelFile.exists());
				URI sourceModelUri = URI.createPlatformResourceURI(sourceModelFile.getFullPath()
						.toString(), false);
				EMFModel ecoreSourceModel = (EMFModel) sourceModel;
				ecoreSourceModel.getResource().setURI(sourceModelUri);
				ecoreSourceModel.getResource().save(null);

				Assert.assertTrue(sourceModelFile.exists());
				// add traceability ...
				final String tracedFilename = targetFilename + ".withTrace.ecore"; //$NON-NLS-1$
				final IFile tracedFile = this.projectFactory.getProject().getFile(tracedFilename);
				Assert.assertNotNull(tracedFile);
				Assert.assertFalse(tracedFile.exists());
				URI tracedModelUri = URI.createPlatformResourceURI(tracedFile.getFullPath()
						.toString(), false);
				IModel tracedModel = converter.addTraceability(ecoreSourceModel, sourceModelUri,
						tracedModelUri);
				Assert.assertNotNull(tracedModel);
				Assert.assertTrue(tracedFile.exists());
			}
		} finally {
			sourceTransformation.close();
		}

	}

	@Test
	public void testProducingTransformationWithTraceability() throws Exception {
		Assert.assertNotNull(this.projectFactory);
		/*
		 * we will export the atl transformation to convert kdm model to uml
		 * model.
		 */
		final KdmToUmlConverter converter = new KdmToUmlConverter();
		Assert.assertNotNull(converter);
		final String targetFilename = "KdmToUmlConversion.atl"; //$NON-NLS-1$
		final IFile targetFile = this.projectFactory.getProject().getFile(targetFilename);
		Assert.assertNotNull(targetFile);
		Assert.assertFalse(targetFile.exists());
		converter.basicExportKdmToUmlTransformation(targetFile, new NullProgressMonitor());
		Assert.assertTrue(targetFile.exists());

		// transforms ATL file into ATL model
		InputStream sourceTransformation = targetFile.getContents();
		try {
			Assert.assertNotNull(sourceTransformation);
			final IModel sourceModel = AtlParser.getDefault().parseToModel(sourceTransformation);
			Assert.assertNotNull(sourceModel);
			if (sourceModel instanceof EMFModel) {
				final String sourceModelFilename = targetFilename + ".ecore"; //$NON-NLS-1$
				final IFile sourceModelFile = this.projectFactory.getProject().getFile(
						sourceModelFilename);
				Assert.assertNotNull(sourceModelFile);
				Assert.assertFalse(sourceModelFile.exists());
				final URI sourceModelUri = URI.createPlatformResourceURI(sourceModelFile
						.getFullPath().toString(), false);
				final EMFModel ecoreSourceModel = (EMFModel) sourceModel;
				ecoreSourceModel.getResource().setURI(sourceModelUri);
				ecoreSourceModel.getResource().save(null);
				Assert.assertTrue(sourceModelFile.exists());
				// add traceability ...
				final String tracedFilename = targetFilename + ".withTrace.ecore"; //$NON-NLS-1$
				final IFile tracedFile = this.projectFactory.getProject().getFile(tracedFilename);
				Assert.assertNotNull(tracedFile);
				Assert.assertFalse(tracedFile.exists());
				final URI tracedModelUri = URI.createPlatformResourceURI(tracedFile.getFullPath()
						.toString(), false);
				final IModel tracedModel = converter.addTraceability(ecoreSourceModel,
						sourceModelUri, tracedModelUri);
				Assert.assertNotNull(tracedModel);
				Assert.assertTrue(tracedFile.exists());
				// create atl transformation with traceability
				final String atlConvertedFilename = "KdmToUmlConverted.atl"; //$NON-NLS-1$
				final IFile atlConvertedFile = this.projectFactory.getProject().getFile(
						atlConvertedFilename);
				Assert.assertNotNull(atlConvertedFile);
				Assert.assertFalse(atlConvertedFile.exists());
				final URI atlConvertedUri = URI.createPlatformResourceURI(atlConvertedFile
						.getFullPath().toString(), false);
				final IFile lastFile = KdmToUmlConverter.parseFromModel(tracedModel,
						atlConvertedUri);
				Assert.assertNotNull(lastFile);
				Assert.assertTrue(lastFile.exists());
				Assert.assertTrue(atlConvertedFile.exists());
				if (this.export) {
					final File exportedFile = new File("c:/exportedKdmToUmlConverted.atl"); //$NON-NLS-1$
					FolderUtils.copyFile(atlConvertedFile.getLocation().toFile(), exportedFile);
				}
			}
		} finally {
			sourceTransformation.close();
		}
	}

}
