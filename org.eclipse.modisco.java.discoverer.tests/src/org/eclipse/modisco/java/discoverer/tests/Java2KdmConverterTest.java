/*
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 */

package org.eclipse.modisco.java.discoverer.tests;

import java.io.IOException;
import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.java.discoverer.JavaDiscoveryConstants;
import org.eclipse.modisco.java.discoverer.internal.TranslateJavaModelToKdm;
import org.eclipse.modisco.java.discoverer.tests.utils.JavaProjectFactory;
import org.eclipse.modisco.kdm.source.discoverer.IKDMDiscoveryConstants;
import org.eclipse.modisco.omg.kdm.code.ClassUnit;
import org.eclipse.modisco.omg.kdm.code.ExportKind;
import org.eclipse.modisco.omg.kdm.code.MethodUnit;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * To test result of java model to kdm model.
 *
 */
public class Java2KdmConverterTest {
	private final String referencesFolderPath = "/references/"; //$NON-NLS-1$
	private final String javaModelExtension = JavaDiscoveryConstants.JAVA_MODEL_FILE_SUFFIX;
	private final String kdmModelExtension = IKDMDiscoveryConstants.KDM_MODEL_FILE_SUFFIX;

	private final String projectName = "testProject"; //$NON-NLS-1$
	private final String modelName1 = "bug317835"; //$NON-NLS-1$
	private final String modelName2 = "bug318469"; //$NON-NLS-1$
	private final String modelName3 = "bug326584"; //$NON-NLS-1$
	private final String modelNameBug326944 = "bug326944"; //$NON-NLS-1$
	private final String modelNameBug318631 = "bug318631"; //$NON-NLS-1$

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

	/**
	 * bug 317835
	 */
	@SuppressWarnings("null")
	@Test
	public void testInterfaceMethodVisibility() throws Exception {
		/*
		 * prepare the target ... we have to create an empty project into the
		 * workspace with a real uri for atl extraction.
		 */
		final String outputPath = this.projectName + "/BasicConversion"//$NON-NLS-1$
				+ this.kdmModelExtension;
		final URI outputUri = URI.createPlatformResourceURI(outputPath, false);

		final String javaReferencePath = "/" + Activator.PLUGIN_ID + this.referencesFolderPath + this.modelName1 + this.javaModelExtension; //$NON-NLS-1$
		final URI javaReferenceUri = URI.createPlatformPluginURI(
				javaReferencePath, true);
		Assert.assertNotNull(javaReferenceUri);

		basicConversionOfJavaModelToKdmModel(javaReferenceUri, outputUri);

		Resource kdmModel = basicConversionOfJavaModelToKdmModel(
				javaReferenceUri, outputUri);

		MethodUnit mi = null;
		MethodUnit mc = null;
		Iterator<EObject> it = kdmModel.getAllContents();
		while (it.hasNext()) {
			EObject next = it.next();
			if (next instanceof MethodUnit) {
				if (((MethodUnit) next).getName().equalsIgnoreCase(
						"aMethodWithoutVisibility")) { //$NON-NLS-1$
					mi = (MethodUnit) next;
				} else if (((MethodUnit) next).getName().equalsIgnoreCase(
						"aMethodWithoutVisibility2")) { //$NON-NLS-1$
					mc = (MethodUnit) next;
				}
			}
		}
		Assert.assertNotNull(
				"Interface1.aMethodWithoutVisibility should exist", mi); //$NON-NLS-1$
		Assert.assertNotNull(
				"Interface1.aMethodWithoutVisibility2 should exist", mc); //$NON-NLS-1$

		Assert.assertEquals(mi.getExport(), ExportKind.PUBLIC);
		Assert.assertEquals(mc.getExport(), ExportKind.PROTECTED);
	}

	/**
	 * bug 318469
	 */
	@Test
	public void testArrayAsAnnotationValue() throws Exception {
		final String outputPath = this.projectName + "/BasicConversion"//$NON-NLS-1$
				+ this.kdmModelExtension;
		final URI outputUri = URI.createPlatformResourceURI(outputPath, false);
		Assert.assertNotNull(outputUri);

		final String javaReferencePath = "/" + Activator.PLUGIN_ID + this.referencesFolderPath + this.modelName2 + this.javaModelExtension; //$NON-NLS-1$
		final URI javaReferenceUri = URI.createPlatformPluginURI(
				javaReferencePath, true);
		Assert.assertNotNull(javaReferenceUri);

		basicConversionOfJavaModelToKdmModel(javaReferenceUri, outputUri);
	}

	/**
	 * bug 326584
	 */
	@SuppressWarnings("null")
	@Test
	public void testKdmComments() throws Exception {
		final String outputPath = this.projectName + "/BasicConversion"//$NON-NLS-1$
				+ this.kdmModelExtension;
		final URI outputUri = URI.createPlatformResourceURI(outputPath, false);
		Assert.assertNotNull(outputUri);

		final String javaReferencePath = "/" + Activator.PLUGIN_ID + this.referencesFolderPath + this.modelName3 + this.javaModelExtension; //$NON-NLS-1$
		final URI javaReferenceUri = URI.createPlatformPluginURI(
				javaReferencePath, true);
		Assert.assertNotNull(javaReferenceUri);

		Resource kdmModel = basicConversionOfJavaModelToKdmModel(
				javaReferenceUri, outputUri);

		Iterator<EObject> it = kdmModel.getAllContents();
		ClassUnit cuWithJavaDoc = null;
		while (it.hasNext()) {
			EObject next = it.next();
			if (next instanceof ClassUnit) {
				ClassUnit cu = (ClassUnit) next;
				if (cu.getName().equalsIgnoreCase("ASimpleClassWithComments")) { //$NON-NLS-1$
					cuWithJavaDoc = cu;
				}
			}
		}
		Assert.assertNotNull(cuWithJavaDoc);
		Assert.assertFalse(cuWithJavaDoc.getComment().isEmpty());
	}

	private Resource basicConversionOfJavaModelToKdmModel(final URI inputURI,
			final URI outputUri) throws IOException {
		Resource kdmModel = null;
		Assert.assertNotNull(this.javaProjectFactory);
		final TranslateJavaModelToKdm kdmTranslater = new TranslateJavaModelToKdm();
		kdmModel = kdmTranslater
				.getKDMModelFromJavaModelWithCustomTransformation(inputURI,
						null, outputUri);
		Assert.assertNotNull(kdmModel);
		return kdmModel;
	}

	@Test
	public void testBug326944_JavaToKdmTransformation() throws Exception {
		/*
		 * prepare the target ... we have to create an empty project into the
		 * workspace with a real uri for atl extraction.
		 */
		final String outputPath = this.projectName + "/"//$NON-NLS-1$
				+ this.modelNameBug326944 + this.kdmModelExtension;
		final URI outputUri = URI.createPlatformResourceURI(outputPath, false);

		final String javaReferencePath = "/" + Activator.PLUGIN_ID + this.referencesFolderPath + this.modelNameBug326944 + this.javaModelExtension; //$NON-NLS-1$
		final URI javaReferenceUri = URI.createPlatformPluginURI(
				javaReferencePath, true);
		Assert.assertNotNull(javaReferenceUri);

		Resource kdmModel = basicConversionOfJavaModelToKdmModel(
				javaReferenceUri, outputUri);
		Assert.assertNotNull(kdmModel);
	}

	@Test
	public void testBug318631_JavaToKdmTransformation() throws Exception {
		/*
		 * prepare the target ... we have to create an empty project into the
		 * workspace with a real uri for atl extraction.
		 */
		final String outputPath = this.projectName + "/"//$NON-NLS-1$
				+ this.modelNameBug318631 + this.kdmModelExtension;
		final URI outputUri = URI.createPlatformResourceURI(outputPath, false);

		final String javaReferencePath = "/" + Activator.PLUGIN_ID + this.referencesFolderPath + this.modelNameBug318631 + this.javaModelExtension; //$NON-NLS-1$
		final URI javaReferenceUri = URI.createPlatformPluginURI(
				javaReferencePath, true);
		Assert.assertNotNull(javaReferenceUri);

		Resource kdmModel = basicConversionOfJavaModelToKdmModel(
				javaReferenceUri, outputUri);
		Assert.assertNotNull(kdmModel);
	}
}
