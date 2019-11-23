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
 *    Nicolas Bros (Mia-Software) - Bug 338874
 */

package org.eclipse.modisco.java.discoverer.tests;

import java.net.URL;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.java.Expression;
import org.eclipse.modisco.java.InfixExpression;
import org.eclipse.modisco.java.SingleVariableAccess;
import org.eclipse.modisco.java.discoverer.DiscoverJavaModelFromJavaProject;
import org.eclipse.modisco.java.discoverer.JavaDiscoveryConstants;
import org.eclipse.modisco.java.discoverer.internal.TranslateJavaModelToKdm;
import org.eclipse.modisco.java.discoverer.tests.utils.JavaProjectFactory;
import org.eclipse.modisco.kdm.source.discoverer.IKDMDiscoveryConstants;
import org.eclipse.modisco.omg.kdm.action.ActionElement;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * To test result of java model to kdm model.
 *
 */
public class JavaProject2KdmTest {
	// To be able to export reference model after a change in java discovery
	private final boolean export = false;

	private final String rootSourcesPath = "/workspace/"; //$NON-NLS-1$
	private final String javaModelExtension = JavaDiscoveryConstants.JAVA_MODEL_FILE_SUFFIX;
	private final String kdmModelExtension = IKDMDiscoveryConstants.KDM_MODEL_FILE_SUFFIX;

	private final String projectName = "testProject"; //$NON-NLS-1$
	private final String modelNameBug338874 = "bug338874"; //$NON-NLS-1$

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

	private Resource basicConversionOfJavaModelToKdmModel(final URI inputURI,
			final URI outputUri) throws Exception {
		Resource kdmModel = null;
		/*
		 * prepare the target ... we have to create an empty project into the
		 * workspace with a real uri for atl extraction.
		 */
		Assert.assertNotNull(this.javaProjectFactory);
		final TranslateJavaModelToKdm kdmTranslater = new TranslateJavaModelToKdm();
		kdmModel = kdmTranslater
				.getKDMModelFromJavaModelWithCustomTransformation(inputURI,  null,
						outputUri);
		Assert.assertNotNull(kdmModel);

		if (this.export) {
			URI tmpUri = kdmModel.getURI();
			kdmModel.setURI(URI
					.createFileURI("c:/referenceModel" + this.kdmModelExtension)); //$NON-NLS-1$
			kdmModel.save(null);
			kdmModel.setURI(tmpUri);
		}
		return kdmModel;
	}

	private Resource basicDiscoveryOfJavaProject(final String sourceFolderPath)
			throws Exception {
		Resource javaModel = null;

		Assert.assertNotNull(this.javaProjectFactory);

		/*
		 * prepare the target ... we have to create an empty project into the
		 * workspace with a real uri for atl extraction. We have to fill this
		 * project with sources from our test context.
		 */
		IJavaProject javaProject = this.javaProjectFactory.getJavaProject();
		Assert.assertNotNull(javaProject);

		URL src = Activator.getDefault().getBundle().getEntry(sourceFolderPath);
		Assert.assertNotNull(src);
		this.javaProjectFactory.populateSourceFolder(sourceFolderPath,
				Activator.getDefault());

		DiscoverJavaModelFromJavaProject javaDiscoverer = new DiscoverJavaModelFromJavaProject();
		javaDiscoverer.setSerializeTarget(true);
		javaDiscoverer.discoverElement(javaProject, new NullProgressMonitor());
		javaModel = javaDiscoverer.getTargetModel();
		Assert.assertNotNull(javaModel);

		if (this.export) {
			URI tmpUri = javaModel.getURI();
			javaModel
					.setURI(URI
							.createFileURI("c:/referenceModel" + this.javaModelExtension)); //$NON-NLS-1$
			javaModel.save(null);
			javaModel.setURI(tmpUri);
		}

		return javaModel;
	}

	@SuppressWarnings("null")
	@Test
	public void testBug338874_InfixExpressionWithVariables() throws Exception {
		/*
		 * This bug happens when user code contains an infix expression with two
		 * variable access. In this case, java model contains everything,
		 * however corresponding kdm model lack variable access information.
		 *
		 * To test, we will use a specific project, then we will check that
		 * leftHandSide and rightHandSide of InfixExpression are not empty.
		 */
		final String sourceFolderPath = this.rootSourcesPath
				+ this.modelNameBug338874 + "/src"; //$NON-NLS-1$

		Resource javaModel = basicDiscoveryOfJavaProject(sourceFolderPath);
		Assert.assertNotNull(javaModel);
		// check the InfixExpression (there is only one in this model)
		InfixExpression infixExpression = null;
		TreeIterator<EObject> iterator = javaModel.getAllContents();
		while (iterator.hasNext()) {
			EObject eObject = iterator.next();
			if (eObject instanceof InfixExpression) {
				infixExpression = (InfixExpression) eObject;
			}
		}
		Assert.assertNotNull(infixExpression);

		Expression left = infixExpression.getLeftOperand();
		Assert.assertNotNull(left);
		Assert.assertTrue(left instanceof SingleVariableAccess);

		Expression right = infixExpression.getRightOperand();
		Assert.assertNotNull(right);
		Assert.assertTrue(right instanceof SingleVariableAccess);

		/*
		 * kdm translation
		 */
		final String outputPath = this.projectName + "/"//$NON-NLS-1$
				+ this.modelNameBug338874 + this.kdmModelExtension;
		final URI outputUri = URI.createPlatformResourceURI(outputPath, true);
		Resource kdmModel = basicConversionOfJavaModelToKdmModel(
				javaModel.getURI(), outputUri);
		Assert.assertNotNull(kdmModel);
		// check the InfixExpression (there is only one in this model)
		ActionElement infixElement = null;
		iterator = kdmModel.getAllContents();
		while (iterator.hasNext()) {
			EObject eObject = iterator.next();
			if (eObject instanceof ActionElement) {
				ActionElement actionElement = (ActionElement) eObject;
				if ((actionElement.getKind() != null)
						&& (actionElement.getKind().equals("infix expression"))) { //$NON-NLS-1$
					infixElement = actionElement;
				}
			}
		}
		Assert.assertNotNull(infixElement);
		Assert.assertNotNull(infixElement.getActionRelation());
		// FIXME test is broken
		// Assert.assertEquals(2, infixElement.getActionRelation().size());
		// we should test type of action relations (Reads or Addresses for
		// variable access ...)
	}
}
