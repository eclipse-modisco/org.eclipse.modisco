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
 */

package org.eclipse.modisco.java.discoverer.tests;

import java.net.URL;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.common.tests.TestModelUtils;
import org.eclipse.modisco.infra.common.core.internal.utils.ModelUtils;
import org.eclipse.modisco.java.Assignment;
import org.eclipse.modisco.java.Expression;
import org.eclipse.modisco.java.FieldAccess;
import org.eclipse.modisco.java.SingleVariableAccess;
import org.eclipse.modisco.java.UnresolvedItem;
import org.eclipse.modisco.java.UnresolvedItemAccess;
import org.eclipse.modisco.java.UnresolvedVariableDeclarationFragment;
import org.eclipse.modisco.java.VariableDeclaration;
import org.eclipse.modisco.java.discoverer.DiscoverJavaModelFromJavaProject;
import org.eclipse.modisco.java.discoverer.JavaDiscoveryConstants;
import org.eclipse.modisco.java.discoverer.tests.utils.JavaProjectFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Gabriel Barbier
 *
 */
public class SimpleBlackBoxDiscovery {
	// To be able to export reference model after a change in java discovery
	private final boolean export = false;

	private final String rootSourcesPath = "/workspace/"; //$NON-NLS-1$
	private final String referencesFolderPath = "/references/"; //$NON-NLS-1$
	private final String javaModelExtension = JavaDiscoveryConstants.JAVA_MODEL_FILE_SUFFIX;
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
	public void testJavaModelDiscoveryFromJavaProject() throws Exception {
		Assert.assertNotNull(this.javaProjectFactory);

		IJavaProject javaProject = this.javaProjectFactory.getJavaProject();
		Assert.assertNotNull(javaProject);

		String sourceFolderPath = this.rootSourcesPath + this.projectName
				+ "/src"; //$NON-NLS-1$
		URL src = Activator.getDefault().getBundle().getEntry(sourceFolderPath);
		Assert.assertNotNull(src);
		this.javaProjectFactory.populateSourceFolder(sourceFolderPath,
				Activator.getDefault());

		DiscoverJavaModelFromJavaProject javaDiscoverer = new DiscoverJavaModelFromJavaProject();
		javaDiscoverer.discoverElement(javaProject, new NullProgressMonitor());
		Resource output = javaDiscoverer.getTargetModel();
		Assert.assertNotNull(output);

		if (this.export) {
			output.setURI(URI
					.createFileURI("c:/referenceModel" + this.javaModelExtension)); //$NON-NLS-1$
			output.save(null);
		}
	}

	// @Test
	public void testJavaModelFromJavaProjectWithReferenceModel()
			throws Exception {
		Assert.assertNotNull(this.javaProjectFactory);
		IJavaProject javaProject = this.javaProjectFactory.getJavaProject();
		Assert.assertNotNull(javaProject);

		String sourceFolderPath = this.rootSourcesPath + this.projectName
				+ "/src"; //$NON-NLS-1$
		URL src = Activator.getDefault().getBundle().getEntry(sourceFolderPath);
		Assert.assertNotNull(src);
		this.javaProjectFactory.populateSourceFolder(sourceFolderPath,
				Activator.getDefault());

		DiscoverJavaModelFromJavaProject javaDiscoverer = new DiscoverJavaModelFromJavaProject();
		javaDiscoverer.discoverElement(javaProject, new NullProgressMonitor());
		Resource output = javaDiscoverer.getTargetModel();
		Assert.assertNotNull(output);

		/*
		 * Because everything looks great, well we have to test model content.
		 * In details we will compare current resource with a reference (checked
		 * manually)
		 *
		 * Warning, because the java model store the "filepath" of discovered
		 * java code, the compilation units elements could not be the same !!!!
		 */
		String referencePath = "/" + Activator.PLUGIN_ID + this.referencesFolderPath + this.projectName + this.javaModelExtension; //$NON-NLS-1$
		URI referenceUri = URI.createPlatformPluginURI(referencePath, true);
		Assert.assertNotNull(referenceUri);
		Resource referenceModel = ModelUtils.loadModel(referenceUri);
		Assert.assertNotNull(referenceModel);
		boolean result = TestModelUtils.compareModels(referenceModel, output);
		Assert.assertTrue("Comparison of Java models has failed !", result); //$NON-NLS-1$
	}

	@Test
	public void testValidationOfJavaModelDiscoveryFromJavaProject()
			throws Exception {
		Assert.assertNotNull(this.javaProjectFactory);

		IJavaProject javaProject = this.javaProjectFactory.getJavaProject();
		Assert.assertNotNull(javaProject);

		String sourceFolderPath = this.rootSourcesPath + this.projectName
				+ "/src"; //$NON-NLS-1$
		URL src = Activator.getDefault().getBundle().getEntry(sourceFolderPath);
		Assert.assertNotNull(src);
		this.javaProjectFactory.populateSourceFolder(sourceFolderPath,
				Activator.getDefault());

		DiscoverJavaModelFromJavaProject javaDiscoverer = new DiscoverJavaModelFromJavaProject();
		javaDiscoverer.discoverElement(javaProject, new NullProgressMonitor());
		Resource outputModel = javaDiscoverer.getTargetModel();
		Assert.assertNotNull(outputModel);

		Diagnostician diagnostician = new Diagnostician();
		BasicDiagnostic defaultDiagnostic = diagnostician.createDefaultDiagnostic(outputModel.getContents().get(0));
		for (EObject eObject : outputModel.getContents()) {
			boolean result = diagnostician.validate(eObject, defaultDiagnostic);
			Assert.assertTrue(result);
		}
	}

	@Test
	public void testBug328143_unboundVM() throws Exception {
		/*
		 * This bug happens when a java project try to set an unbound vm for its
		 * execution environment. For instance, if it try to use a jvm 1.6 and
		 * there is only an install of jvm 1.5
		 */
		Assert.assertNotNull(this.javaProjectFactory);

		IJavaProject javaProject = this.javaProjectFactory.getJavaProject();
		Assert.assertNotNull(javaProject);

		String sourceFolderPath = this.rootSourcesPath + this.projectName
				+ "/src"; //$NON-NLS-1$
		URL src = Activator.getDefault().getBundle().getEntry(sourceFolderPath);
		Assert.assertNotNull(src);
		this.javaProjectFactory.populateSourceFolder(sourceFolderPath,
				Activator.getDefault());

		// set the execution environment with an unbound vm
		this.javaProjectFactory.setExecutionEnvironmentWithUnboundVm();

		DiscoverJavaModelFromJavaProject javaDiscoverer = new DiscoverJavaModelFromJavaProject();
		javaDiscoverer.setSerializeTarget(true);
		javaDiscoverer.discoverElement(javaProject, new NullProgressMonitor());
		Resource output = javaDiscoverer.getTargetModel();
		Assert.assertNotNull(output);
		// because, every exceptions have been caught in the discoverer,
		// a way to check if every element has been attached to the resource
		// is to save the resource.
		output.save(null);

		if (this.export) {
			output.setURI(URI
					.createFileURI("c:/referenceModel" + this.javaModelExtension)); //$NON-NLS-1$
			output.save(null);
		}
	}

	@SuppressWarnings("null")
	@Test
	public void testBug312080_unresolvedFields() throws Exception {
		/*
		 * This bug happens when user code contains a field use with no field
		 * declaration (there is a compiler error). If a field has the same name
		 * as the declared package in the file, Modisco Java Discoverer does not
		 * handle the field, but creates an expression with both leftHandSide
		 * and rightHandSide with empty elements.
		 *
		 * To test, we will use a specific project, then we will check that
		 * leftHandSide and rightHandSide of Assignment are not empty. Actually,
		 * for the leftHandSide, we have a FieldAccess which references a
		 * SingleVariableAccess which references nothing, it should be an
		 * UnresolvedSingleVariableDeclaration. For the rightHandSide, we have
		 * an UnresolvedItemAccess which references nothing, it should be an
		 * UnresolvedItem.
		 */
		Assert.assertNotNull(this.javaProjectFactory);

		IJavaProject javaProject = this.javaProjectFactory.getJavaProject();
		Assert.assertNotNull(javaProject);

		String sourceFolderPath = this.rootSourcesPath + "bug312080/src"; //$NON-NLS-1$
		URL src = Activator.getDefault().getBundle().getEntry(sourceFolderPath);
		Assert.assertNotNull(src);
		this.javaProjectFactory.populateSourceFolder(sourceFolderPath,
				Activator.getDefault());

		DiscoverJavaModelFromJavaProject javaDiscoverer = new DiscoverJavaModelFromJavaProject();
		javaDiscoverer.discoverElement(javaProject, new NullProgressMonitor());
		Resource output = javaDiscoverer.getTargetModel();
		Assert.assertNotNull(output);

		if (this.export) {
			output.setURI(URI
					.createFileURI("c:/referenceModel" + this.javaModelExtension)); //$NON-NLS-1$
			output.save(null);
		}

		// check the Assignment (there is only one in this model)
		Assignment assignment = null;
		TreeIterator<EObject> iterator = output.getAllContents();
		while (iterator.hasNext()) {
			EObject eObject = iterator.next();
			if (eObject instanceof Assignment) {
				assignment = (Assignment) eObject;
			}
		}
		Assert.assertNotNull(assignment);

		Expression left = assignment.getLeftHandSide();
		Assert.assertNotNull(left);
		Assert.assertTrue(left instanceof FieldAccess);
		FieldAccess fieldAccess = (FieldAccess) left;
		SingleVariableAccess singleVariableAccess = fieldAccess.getField();
		Assert.assertNotNull(singleVariableAccess);
		VariableDeclaration variableDeclaration = singleVariableAccess
				.getVariable();
		Assert.assertNotNull(variableDeclaration);
		Assert.assertTrue(variableDeclaration instanceof UnresolvedVariableDeclarationFragment);

		Expression right = assignment.getRightHandSide();
		Assert.assertNotNull(right);
		Assert.assertTrue(right instanceof UnresolvedItemAccess);
		UnresolvedItemAccess unresolvedItemAccess = (UnresolvedItemAccess) right;
		UnresolvedItem unresolvedItem = unresolvedItemAccess.getElement();
		Assert.assertNotNull(unresolvedItem);
		Assert.assertTrue(unresolvedItem instanceof UnresolvedVariableDeclarationFragment);
	}
}
