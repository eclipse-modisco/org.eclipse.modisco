/*******************************************************************************
 * Copyright (c) 2008 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *******************************************************************************/

package org.eclipse.gmt.modisco.kdm.uml2converter.tests;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import junit.framework.Assert;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gmt.modisco.infra.common.core.internal.utils.FolderUtils;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.kdm.uml2converter.impl.KdmtoUmlConverterImpl;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.engine.parser.AtlParser;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Gabriel Barbier
 * 
 * 
 * @deprecated use matching org.eclipse.modisco.x.y.z component, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=474827
 */
@Deprecated
public class HotTransformationTest {
	// to be able to replace the reference after a change in transformation
	private final boolean export = false;

	private AtlProjectFactory projectFactory;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.projectFactory = new AtlProjectFactory(this.getClass().getSimpleName());
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		if (this.projectFactory != null) {
			this.projectFactory.dispose();
		}
	}

	@Test
	public void testExportTransformation() {
		Assert.assertNotNull(this.projectFactory);
		/*
		 * we will export the atl transformation to convert kdm model to uml
		 * model.
		 */
		final KdmtoUmlConverterImpl converter = new KdmtoUmlConverterImpl();
		Assert.assertNotNull(converter);
		final String targetFilename = "KdmToUmlConversion.atl"; //$NON-NLS-1$
		final IFile targetFile = this.projectFactory.getProject().getFile(targetFilename);
		Assert.assertNotNull(targetFile);
		Assert.assertFalse(targetFile.exists());
		try {
			converter.basicExportKdmToUmlTransformation(targetFile, new NullProgressMonitor());
		} catch (CoreException e) {
			Assert.fail(e.getMessage());
		}
		Assert.assertTrue(targetFile.exists());
	}

	@Test
	public void testExportAndModelTransformation() {
		Assert.assertNotNull(this.projectFactory);
		/*
		 * we will export the atl transformation to convert kdm model to uml
		 * model.
		 */
		final KdmtoUmlConverterImpl converter = new KdmtoUmlConverterImpl();
		Assert.assertNotNull(converter);
		final String targetFilename = "KdmToUmlConversion.atl"; //$NON-NLS-1$
		final IFile targetFile = this.projectFactory.getProject().getFile(targetFilename);
		Assert.assertNotNull(targetFile);
		Assert.assertFalse(targetFile.exists());
		try {
			converter.basicExportKdmToUmlTransformation(targetFile, new NullProgressMonitor());
		} catch (CoreException e) {
			Assert.fail(e.getMessage());
		}
		Assert.assertTrue(targetFile.exists());

		// transforms ATL file into ATL model
		InputStream sourceTransformation;
		try {
			sourceTransformation = targetFile.getContents();
			Assert.assertNotNull(sourceTransformation);
			try {
				IModel sourceModel = AtlParser.getDefault().parseToModel(sourceTransformation);
				Assert.assertNotNull(sourceModel);
				if (sourceModel instanceof EMFModel) {
					URI sourceModelUri = URI.createPlatformResourceURI(targetFile.getFullPath()
							.addFileExtension("ecore").toString(), false); //$NON-NLS-1$
					EMFModel ecoreSourceModel = (EMFModel) sourceModel;
					try {
						ecoreSourceModel.getResource().setURI(sourceModelUri);
						ecoreSourceModel.getResource().save(null);
					} catch (IOException e) {
						MoDiscoLogger.logError(e, "Error happened while saving a resource: "
								+ sourceModelUri, Activator.getDefault());
					}
				}
			} catch (ATLCoreException e) {
				Assert.fail(e.getMessage());
			} finally {
				try {
					sourceTransformation.close();
				} catch (IOException e) {
					Assert.fail(e.getMessage());
				}
			}
		} catch (CoreException e1) {
			Assert.fail(e1.getMessage());
		}

	}

	@Test
	public void testExportModelAndAddTraceability() {
		Assert.assertNotNull(this.projectFactory);
		/*
		 * we will export the atl transformation to convert kdm model to uml
		 * model.
		 */
		final KdmtoUmlConverterImpl converter = new KdmtoUmlConverterImpl();
		Assert.assertNotNull(converter);
		final String targetFilename = "KdmToUmlConversion.atl"; //$NON-NLS-1$
		final IFile targetFile = this.projectFactory.getProject().getFile(targetFilename);
		Assert.assertNotNull(targetFile);
		Assert.assertFalse(targetFile.exists());
		try {
			converter.basicExportKdmToUmlTransformation(targetFile, new NullProgressMonitor());
		} catch (CoreException e) {
			Assert.fail(e.getMessage());
		}
		Assert.assertTrue(targetFile.exists());

		// transforms ATL file into ATL model
		InputStream sourceTransformation;
		try {
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
					URI sourceModelUri = URI.createPlatformResourceURI(sourceModelFile
							.getFullPath().toString(), false);
					EMFModel ecoreSourceModel = (EMFModel) sourceModel;
					try {
						ecoreSourceModel.getResource().setURI(sourceModelUri);
						ecoreSourceModel.getResource().save(null);
					} catch (IOException e) {
						MoDiscoLogger.logError(e, "Error happened while saving a resource: "
								+ sourceModelUri, Activator.getDefault());
					}

					Assert.assertTrue(sourceModelFile.exists());
					// add traceability ...
					final String tracedFilename = targetFilename + ".withTrace.ecore"; //$NON-NLS-1$
					final IFile tracedFile = this.projectFactory.getProject().getFile(
							tracedFilename);
					Assert.assertNotNull(tracedFile);
					Assert.assertFalse(tracedFile.exists());
					URI tracedModelUri = URI.createPlatformResourceURI(tracedFile.getFullPath()
							.toString(), false);
					IModel tracedModel = converter.addTraceability(ecoreSourceModel,
							sourceModelUri, tracedModelUri);
					Assert.assertNotNull(tracedModel);
					Assert.assertTrue(tracedFile.exists());
				}
			} catch (ATLCoreException e) {
				Assert.fail(e.getMessage());
			} finally {
				try {
					sourceTransformation.close();
				} catch (IOException e) {
					Assert.fail(e.getMessage());
				}
			}
		} catch (CoreException e1) {
			Assert.fail(e1.getMessage());
		}

	}

	@Test
	public void testProducingTransformationWithTraceability() {
		Assert.assertNotNull(this.projectFactory);
		/*
		 * we will export the atl transformation to convert kdm model to uml
		 * model.
		 */
		final KdmtoUmlConverterImpl converter = new KdmtoUmlConverterImpl();
		Assert.assertNotNull(converter);
		final String targetFilename = "KdmToUmlConversion.atl"; //$NON-NLS-1$
		final IFile targetFile = this.projectFactory.getProject().getFile(targetFilename);
		Assert.assertNotNull(targetFile);
		Assert.assertFalse(targetFile.exists());
		try {
			converter.basicExportKdmToUmlTransformation(targetFile, new NullProgressMonitor());
		} catch (CoreException e) {
			Assert.fail(e.getMessage());
		}
		Assert.assertTrue(targetFile.exists());

		// transforms ATL file into ATL model
		InputStream sourceTransformation;
		try {
			sourceTransformation = targetFile.getContents();
			Assert.assertNotNull(sourceTransformation);
			try {
				final IModel sourceModel = AtlParser.getDefault()
						.parseToModel(sourceTransformation);
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
					try {
						ecoreSourceModel.getResource().setURI(sourceModelUri);
						ecoreSourceModel.getResource().save(null);
					} catch (IOException e) {
						MoDiscoLogger.logError(e, "Error happened while saving a resource: "
								+ sourceModelUri, Activator.getDefault());
					}
					Assert.assertTrue(sourceModelFile.exists());
					// add traceability ...
					final String tracedFilename = targetFilename + ".withTrace.ecore"; //$NON-NLS-1$
					final IFile tracedFile = this.projectFactory.getProject().getFile(
							tracedFilename);
					Assert.assertNotNull(tracedFile);
					Assert.assertFalse(tracedFile.exists());
					final URI tracedModelUri = URI.createPlatformResourceURI(tracedFile
							.getFullPath().toString(), false);
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
					final IFile lastFile = converter.parseFromModel(tracedModel, atlConvertedUri);
					Assert.assertNotNull(lastFile);
					Assert.assertTrue(lastFile.exists());
					Assert.assertTrue(atlConvertedFile.exists());
					if (this.export) {
						final File exportedFile = new File("c:/exportedKdmToUmlConverted.atl"); //$NON-NLS-1$
						FolderUtils.copyFile(atlConvertedFile.getLocation().toFile(), exportedFile);
					}
				}
			} catch (ATLCoreException e) {
				Assert.fail(e.getMessage());
			} catch (IOException e) {
				Assert.fail(e.getMessage());
			} finally {
				try {
					sourceTransformation.close();
				} catch (IOException e) {
					Assert.fail(e.getMessage());
				}
			}
		} catch (CoreException e1) {
			Assert.fail(e1.getMessage());
		}

	}

}
