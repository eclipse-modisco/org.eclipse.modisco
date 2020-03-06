/*
 * Copyright (c) 2010, 2020 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *    Nicolas Bros (Mia-Software) - Bug 378965 - Tests disabled due to EMF Compare API change
 */

package org.eclipse.modisco.java.discoverer.tests;

import java.util.List;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.modisco.common.tests.TestModelUtils;
import org.eclipse.modisco.infra.common.core.internal.utils.ModelUtils;
import org.eclipse.modisco.java.discoverer.JavaDiscoveryConstants;
import org.eclipse.modisco.java.discoverer.internal.TranslateJavaModelToKdm;
import org.eclipse.modisco.java.discoverer.tests.utils.JavaProjectFactory;
import org.eclipse.modisco.kdm.source.discoverer.IKDMDiscoveryConstants;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * To test conversion of java model to kdm model.
 *
 */
public class SimpleBlackBoxConverter {
	// To be able to export reference model after a change in atl transformation
	private final boolean export = false;

	private final String referencesFolderPath = "/references/"; //$NON-NLS-1$
	private final String javaModelExtension = JavaDiscoveryConstants.JAVA_MODEL_FILE_SUFFIX;
	private final String kdmModelExtension = IKDMDiscoveryConstants.KDM_MODEL_FILE_SUFFIX;
	private final String projectName = "test001"; //$NON-NLS-1$

	private JavaProjectFactory javaProjectFactory;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.javaProjectFactory = new JavaProjectFactory(this.projectName);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		if (this.javaProjectFactory != null) {
			this.javaProjectFactory.dispose();
		}
	}

	@Test
	public void testConversionOfJavaModelToKdmModel() throws Exception {
		/*
		 * prepare the target ... we have to create an empty project into the
		 * workspace with a real uri for atl extraction.
		 */
		final String outputPath = this.projectName + "/BasicConversion"//$NON-NLS-1$
				+ this.kdmModelExtension;
		final URI outputUri = URI.createPlatformResourceURI(outputPath, false);
		Assert.assertNotNull(outputUri);
		basicConversionOfJavaModelToKdmModel(outputUri);
	}

	private Resource basicConversionOfJavaModelToKdmModel(final URI outputUri)
			throws Exception {
		Assert.assertNotNull(this.javaProjectFactory);
		/*
		 * load the java model from references
		 */
		final String javaReferencePath = "/" + Activator.PLUGIN_ID + this.referencesFolderPath + this.projectName + this.javaModelExtension; //$NON-NLS-1$
		final URI javaReferenceUri = URI.createPlatformPluginURI(
				javaReferencePath, true);
		Assert.assertNotNull(javaReferenceUri);
		final TranslateJavaModelToKdm kdmTranslater = new TranslateJavaModelToKdm();
		final Resource output = kdmTranslater
				.getKDMModelFromJavaModelWithCustomTransformation(
						javaReferenceUri, null, outputUri);
		Assert.assertNotNull(output);

		/*
		 * Because everything looks great, well we have to test model content.
		 * In details we will compare current resource with a reference (checked
		 * manually)
		 */
		String referencePath = "/" + Activator.PLUGIN_ID + this.referencesFolderPath + this.projectName + this.kdmModelExtension; //$NON-NLS-1$
		URI referenceUri = URI.createPlatformPluginURI(referencePath, true);
		Assert.assertNotNull(referenceUri);
		Resource referenceModel = ModelUtils.loadModel(referenceUri);
		Assert.assertNotNull(referenceModel);
		boolean result = TestModelUtils.compareModels(referenceModel, output);

		if (this.export) {
			output.setURI(URI
					.createFileURI("c:/referenceModel" + this.kdmModelExtension)); //$NON-NLS-1$
			output.save(null);
		}
		Assert.assertTrue("Comparison of UML models has failed !", result); //$NON-NLS-1$
		return output;

	}

	@Test
	public void testValidationOfKdmModelConvertedFromJavaModel()
			throws Exception {
		/*
		 * prepare the target ... we have to create an empty project into the
		 * workspace with a real uri for atl extraction.
		 */
		final String outputPath = this.projectName + "/ConversionValidated"//$NON-NLS-1$
				+ this.kdmModelExtension;
		final URI outputUri = URI.createPlatformResourceURI(outputPath, false);
		Assert.assertNotNull(outputUri);
		Resource outputModel = basicConversionOfJavaModelToKdmModel(outputUri);
		Assert.assertNotNull(outputModel);

		Diagnostician diagnostician = new Diagnostician();
		BasicDiagnostic diagnosticChain = new BasicDiagnostic();
		/*
		 * For one of the root object, we expect a failure in validation, with
		 * two errors (one for System.out field which have no type, and one for
		 * a parameterized type which have currently no type, ie. which is a
		 * wildcard.
		 */
		for (EObject eObject : outputModel.getContents()) {
			boolean result = diagnostician.validate(eObject, diagnosticChain);
			if (!result) {
				Assert.assertNotNull(diagnosticChain);
				List<Diagnostic> diagnostics = diagnosticChain.getChildren();
				Assert.assertNotNull(diagnostics);
				Assert.assertEquals(2, diagnostics.size());
			}
		}
	}
}
