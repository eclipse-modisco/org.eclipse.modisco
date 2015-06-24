/*******************************************************************************
 * Copyright (c) 2010, 2015 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *    Nicolas Bros (Mia-Software)
 *    Grégoire Dupé (Mia-Software) - Bug 470578 - [Depercated] org.eclipse.gmt.modisco.infra.query
 *******************************************************************************/
package org.eclipse.modisco.infra.query.tests;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.facet.util.core.DebugUtils;
import org.eclipse.emf.facet.util.pde.core.internal.exported.TargetPlatformUtils;
import org.eclipse.emf.facet.util.pde.core.internal.exported.exception.PdeCoreUtilsException;
import org.eclipse.gmt.modisco.infra.common.core.internal.builder.AbstractMoDiscoCatalog;
import org.eclipse.gmt.modisco.infra.common.core.internal.utils.FileUtils;
import org.eclipse.gmt.modisco.infra.common.core.internal.utils.ProjectUtils;
import org.eclipse.gmt.modisco.infra.common.core.internal.validation.ValidationJob;
import org.eclipse.gmt.modisco.infra.query.JavaModelQuery;
import org.eclipse.gmt.modisco.infra.query.ModelQuery;
import org.eclipse.gmt.modisco.infra.query.ModelQueryParameter;
import org.eclipse.gmt.modisco.infra.query.ModelQuerySet;
import org.eclipse.gmt.modisco.infra.query.QueryFactory;
import org.eclipse.gmt.modisco.infra.query.core.AbstractModelQuery;
import org.eclipse.gmt.modisco.infra.query.core.ModelQuerySetCatalog;
import org.eclipse.gmt.modisco.infra.query.core.exception.ModelQueryException;
import org.eclipse.gmt.modisco.infra.query.core.exception.ModelQueryTypeCheckingException;
import org.eclipse.gmt.modisco.infra.query.runtime.ModelQueryContext;
import org.eclipse.gmt.modisco.infra.query.runtime.ModelQueryResult;
import org.eclipse.gmt.modisco.infra.query.runtime.RuntimeFactory;
import org.eclipse.modisco.infra.query.tests.samples.Bug303036Test003Query;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

@SuppressWarnings("nls")
public class UnitTests {

	private static final String FILE_EXT = ".querySet"; //$NON-NLS-1$

	private static final int NB_MARKERS_Q_FILE = 6;

	private final ResourceSet resourceSet = new ResourceSetImpl();

	private final Utils utils = new Utils(Activator.getDefault());
	private final EPackage ecorePackage = this.utils.getEcorePackage();

	@BeforeClass
	public static void loadTarget() throws PdeCoreUtilsException {
		TargetPlatformUtils.loadTargetPlatform();
	}
	
	@Test
	public void test001() throws Exception {
		final String name = "test001"; //$NON-NLS-1$
		IProject projectToCreate = this.utils.createProject(name);
		IFile file = projectToCreate.getFile(name + UnitTests.FILE_EXT);
		createQueryFile(name, projectToCreate);
		IFile javaFile = FileUtils.copyFileFromBundle(
				"src/org/eclipse/modisco/infra/query/tests/samples/Test001.java", //$NON-NLS-1$
				projectToCreate,
				"src/org/eclipse/modisco/infra/query/tests/samples/Test001.java", //$NON-NLS-1$
				Activator.getDefault().getBundle());
		ProjectUtils.refresh(projectToCreate);
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		FileUtils.checkNoMoreMarkerOn(javaFile, NB_MARKERS_Q_FILE);
		FileUtils.checkNoMarkerOn(file);
		List<ModelQueryResult> result = executeJavaQuery(name);
		Assert.assertTrue(((String) result.get(0).getValue()) == "Test001"); //$NON-NLS-1$
		changeQueryFile(projectToCreate, name);
		javaFile = FileUtils
				.copyFileFromBundle(
						"src/org/eclipse/modisco/infra/query/tests/samples/Test002.java", //$NON-NLS-1$
						projectToCreate,
						"src/org/eclipse/modisco/infra/query/tests/samples/Test002.java", Activator.getDefault().getBundle()); //$NON-NLS-1$
		ProjectUtils.refresh(projectToCreate);
		FileUtils.checkNoMoreMarkerOn(javaFile, NB_MARKERS_Q_FILE);
		FileUtils.checkNoMarkerOn(file);
		List<ModelQueryResult> result2 = executeJavaQuery(name);
		Assert.assertTrue(((String) result2.get(0).getValue()) == "Test002"); //$NON-NLS-1$
		javaFile = FileUtils
				.copyFileFromBundle(
						"resources/Test002bis.java", //$NON-NLS-1$
						projectToCreate,
						"src/org/eclipse/modisco/infra/query/tests/samples/Test002.java", Activator.getDefault().getBundle()); //$NON-NLS-1$
		ProjectUtils.refresh(projectToCreate);
		FileUtils.checkNoMoreMarkerOn(javaFile, NB_MARKERS_Q_FILE);
		FileUtils.checkNoMarkerOn(file);
		List<ModelQueryResult> result3 = executeJavaQuery(name);
		Assert.assertTrue(((String) result3.get(0).getValue()) == "Test002bis"); //$NON-NLS-1$
	}

	@Test
	public void simpleEval() throws Exception {
		final String name = "test001"; //$NON-NLS-1$
		IProject projectToCreate = this.utils.createProject(name);
		IFile file = createQueryFile(name, projectToCreate);
		IFile javaFile = FileUtils.copyFileFromBundle(
				"src/org/eclipse/modisco/infra/query/tests/samples/Test001.java", //$NON-NLS-1$
				projectToCreate,
				"src/org/eclipse/modisco/infra/query/tests/samples/Test001.java", //$NON-NLS-1$
				Activator.getDefault().getBundle());
		ProjectUtils.refresh(projectToCreate);
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		FileUtils.checkNoMoreMarkerOn(javaFile, NB_MARKERS_Q_FILE);
		FileUtils.checkNoMarkerOn(file);
		ModelQuerySetCatalog catalog = ModelQuerySetCatalog.getSingleton();
		ModelQuerySet mqs = catalog.getModelQuerySet(name);
		ModelQuery mq = mqs.getQueries().get(0);
		AbstractModelQuery amq = catalog.getModelQueryImpl(mq);
		ModelQueryResult mqr = amq.evaluate(this.ecorePackage, null);
		Assert.assertTrue(((String) mqr.getValue()) == "Test001"); //$NON-NLS-1$
		Assert.assertTrue(mqr.getException() == null);
		ModelQueryResult mqr2 = amq.evaluate(this.ecorePackage);
		Assert.assertTrue(((String) mqr2.getValue()) == "Test001"); //$NON-NLS-1$
		Assert.assertTrue(mqr2.getException() == null);
	}

	private List<ModelQueryResult> executeJavaQuery(final String modelQuerySetName)
			throws Exception {
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		Assert.assertTrue("Query catalog must not be empty.", //$NON-NLS-1$
				ModelQuerySetCatalog.getSingleton().getAllModelQuerySets().size() > 0);
		ModelQuerySet querySet = ModelQuerySetCatalog.getSingleton().getModelQuerySet(
				modelQuerySetName);
		if (querySet == null) {
			Iterator<ModelQuerySet> mqSets = ModelQuerySetCatalog.getSingleton()
					.getAllModelQuerySets().iterator();
			StringBuffer mesg = new StringBuffer();
			while (mqSets.hasNext()) {
				ModelQuerySet modelQuerySet = mqSets.next();
				mesg.append(modelQuerySet.getName());
				if (mqSets.hasNext()) {
					mesg.append(", "); //$NON-NLS-1$
				}
			}
			IStatus status = new Status(IStatus.WARNING, Activator.PLUGIN_ID, mesg.toString());
			Activator.getDefault().getLog().log(status);
			throw new CoreException(status);
		}
		Assert.assertNotNull(querySet);
		List<ModelQueryResult> result = null;
		JavaModelQuery modelQuery = (JavaModelQuery) querySet.getQueries().get(0);
		AbstractModelQuery modelQueryInst = ModelQuerySetCatalog.getSingleton().getModelQueryImpl(
				modelQuery);
		ModelQueryContext context = RuntimeFactory.eINSTANCE.createModelQueryContext();
		context.getSelectedModelElements().add(this.ecorePackage);
		result = modelQueryInst.evaluate(context, null);
		Assert.assertEquals("Should have one result.", 1, result.size()); //$NON-NLS-1$
		Assert.assertTrue("Source must be null.", //$NON-NLS-1$
				result.get(0).getSource() == this.ecorePackage);
		return result;
	}

	private void changeQueryFile(final IProject projectToCreate, final String name)
			throws IOException {
		IFile file = projectToCreate.getFile(name + UnitTests.FILE_EXT);
		URI uri = URI.createFileURI(file.getLocation().toFile().toString());
		Resource resource = this.resourceSet.getResource(uri, true);
		ModelQuerySet modelQuerySet = (ModelQuerySet) resource.getContents().get(0);
		JavaModelQuery modelQuery = (JavaModelQuery) modelQuerySet.getQueries().get(0);
		modelQuery
				.setImplementationClassName("org.eclipse.modisco.infra.query.tests.samples.Test002"); //$NON-NLS-1$
		resource.save(new HashMap<String, String>());
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
	}

	private IFile createQueryFile(final String name, final IProject projectToCreate)
			throws IOException {
		IFile file = projectToCreate.getFile(name + UnitTests.FILE_EXT);
		URI uri = URI.createFileURI(file.getLocation().toFile().toString());
		Resource resource = this.resourceSet.createResource(uri);
		ModelQuerySet modelQuerySet = QueryFactory.eINSTANCE.createModelQuerySet();
		resource.getContents().add(modelQuerySet);
		modelQuerySet.setDescription("my query set"); //$NON-NLS-1$
		modelQuerySet.setIsEditable(true);
		modelQuerySet.setName(name);
		modelQuerySet.getAssociatedMetamodels().add(this.ecorePackage);
		JavaModelQuery modelQuery = QueryFactory.eINSTANCE.createJavaModelQuery();
		modelQuerySet.getQueries().add(modelQuery);
		modelQuery.setDescription("my query"); //$NON-NLS-1$
		modelQuery.setName("myQuery"); //$NON-NLS-1$
		modelQuery.setReturnType(this.ecorePackage.getEClassifier("EString")); //$NON-NLS-1$
		modelQuery
				.setImplementationClassName("org.eclipse.modisco.infra.query.tests.samples.Test001"); //$NON-NLS-1$
		modelQuery.getScope().add((EClass) this.ecorePackage.getEClassifier("EPackage")); //$NON-NLS-1$
		ModelQueryParameter parameter = QueryFactory.eINSTANCE.createModelQueryParameter();
		modelQuery.getParameters().add(parameter);
		parameter.setName("p1"); //$NON-NLS-1$
		parameter.setType(this.ecorePackage.getEClassifier("EBoolean")); //$NON-NLS-1$
		Map<String, String> options = new HashMap<String, String>();
		resource.save(options);
		return file;
	}

	/**
	 * Tests that when the implementation of a Java query is modified, the new
	 * implementation is used instead of the old
	 */
	@Test
	public void osgiReload() throws Exception {
		String name = "test002"; //$NON-NLS-1$
		IProject projectToCreate = this.utils.createProject(name);
		IFile file = FileUtils.copyFileFromBundle("resources/" + name //$NON-NLS-1$
				+ UnitTests.FILE_EXT, projectToCreate, name + UnitTests.FILE_EXT, Activator
				.getDefault().getBundle());
		IFile javaFile = FileUtils.copyFileFromBundle(
				"src/org/eclipse/modisco/infra/query/tests/samples/Test002.java", //$NON-NLS-1$
				projectToCreate,
				"src/org/eclipse/modisco/infra/query/tests/samples/Test002.java", //$NON-NLS-1$
				Activator.getDefault().getBundle());
		ProjectUtils.refresh(projectToCreate);
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		FileUtils.checkNoMoreMarkerOn(javaFile, NB_MARKERS_Q_FILE);
		FileUtils.checkNoMarkerOn(file);
		AbstractModelQuery modelQueryInst = null;
		Assert.assertTrue("Query catalog must not be empty.", //$NON-NLS-1$
				ModelQuerySetCatalog.getSingleton().getAllModelQuerySets().size() > 1);
		ModelQuerySet modelQuerySet = ModelQuerySetCatalog.getSingleton().getModelQuerySet(name);
		JavaModelQuery modelQuery = (JavaModelQuery) modelQuerySet.getQueries().get(0);
		modelQueryInst = ModelQuerySetCatalog.getSingleton().getModelQueryImpl(modelQuery);
		ModelQueryContext context = RuntimeFactory.eINSTANCE.createModelQueryContext();
		context.getSelectedModelElements().add(this.ecorePackage);
		List<ModelQueryResult> result = modelQueryInst.evaluate(context, null);
		Assert.assertEquals("Should have one result.", 1, result.size()); //$NON-NLS-1$
		Assert.assertTrue("Source must be null.", //$NON-NLS-1$
				result.get(0).getSource() == this.ecorePackage);
		Assert.assertTrue(result.get(0) != null);
		Assert.assertTrue(((String) result.get(0).getValue()) == "Test002"); //$NON-NLS-1$
		javaFile = FileUtils.copyFileFromBundle(
				"resources/Test002bis.java", //$NON-NLS-1$
				projectToCreate,
				"src/org/eclipse/modisco/infra/query/tests/samples/Test002.java", //$NON-NLS-1$
				Activator.getDefault().getBundle());
		ProjectUtils.refresh(projectToCreate);
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		FileUtils.checkNoMoreMarkerOn(javaFile, NB_MARKERS_Q_FILE);
		List<ModelQueryResult> result3 = executeJavaQuery(name);
		Assert.assertTrue(((String) result3.get(0).getValue()) == "Test002bis"); //$NON-NLS-1$
		ModelQueryContext context2 = RuntimeFactory.eINSTANCE.createModelQueryContext();
		context2.getSelectedModelElements().add(this.ecorePackage);
		List<ModelQueryResult> result4 = modelQueryInst.evaluate(context2, null);
		Assert.assertTrue(((String) result4.get(0).getValue()) == "Test002"); //$NON-NLS-1$
	}

	@Test
	public void oclQueryTest() throws Exception {
		String name = "oclQueryTest"; //$NON-NLS-1$
		IProject projectToCreate = this.utils.createProject(name);
		IFile file = FileUtils.copyFileFromBundle("resources/" + name + UnitTests.FILE_EXT, //$NON-NLS-1$
				projectToCreate, name + UnitTests.FILE_EXT, Activator.getDefault().getBundle());
		ProjectUtils.refresh(projectToCreate);
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		FileUtils.checkNoMarkerOn(file);
		ModelQuerySetCatalog catalog = ModelQuerySetCatalog.getSingleton();
		ModelQuerySet modelQuerySet = catalog.getModelQuerySet(name);
		ModelQuery modelQuery = modelQuerySet.getQuery("oclQueryTest"); //$NON-NLS-1$
		AbstractModelQuery modelQueryInst = catalog.getModelQueryImpl(modelQuery);
		ModelQueryContext context = RuntimeFactory.eINSTANCE.createModelQueryContext();
		context.getSelectedModelElements().add(this.ecorePackage);
		List<ModelQueryResult> result = modelQueryInst.evaluate(context, null);
		Assert.assertEquals(this.ecorePackage, result.get(0).getValue());

	}

	@Test
	public void oclQueryTest2() throws Exception {
		String name = "oclQueryTest2"; //$NON-NLS-1$
		IProject projectToCreate = this.utils.createProject(name);
		IFile file = FileUtils.copyFileFromBundle("resources/" + name + UnitTests.FILE_EXT, //$NON-NLS-1$
				projectToCreate, name + UnitTests.FILE_EXT, Activator.getDefault().getBundle());
		ProjectUtils.refresh(projectToCreate);
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		FileUtils.checkNoMarkerOn(file);
		ModelQuerySetCatalog catalog = ModelQuerySetCatalog.getSingleton();
		ModelQuerySet modelQuerySet = catalog.getModelQuerySet(name);
		ModelQuery modelQuery = modelQuerySet.getQuery("oclQueryTest"); //$NON-NLS-1$
		AbstractModelQuery modelQueryInst = catalog.getModelQueryImpl(modelQuery);
		ModelQueryContext context = RuntimeFactory.eINSTANCE.createModelQueryContext();
		context.getSelectedModelElements().add(this.ecorePackage);
		modelQueryInst.evaluate(context, null);
		List<ModelQueryResult> result = modelQueryInst.evaluate(context, null);
		Assert.assertTrue(result.get(0).getException() instanceof ModelQueryTypeCheckingException);
	}

	@Test
	public void oclQueryTest3() throws Exception {
		String name = "oclQueryTest3"; //$NON-NLS-1$
		IProject projectToCreate = this.utils.createProject(name);
		IFile file = FileUtils.copyFileFromBundle("resources/" + name + UnitTests.FILE_EXT, //$NON-NLS-1$
				projectToCreate, name + UnitTests.FILE_EXT, Activator.getDefault().getBundle());
		ProjectUtils.refresh(projectToCreate);
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		FileUtils.checkNoMarkerOn(file);
		ModelQuerySetCatalog catalog = ModelQuerySetCatalog.getSingleton();
		ModelQuerySet modelQuerySet = catalog.getModelQuerySet(name);
		ModelQuery modelQuery = modelQuerySet.getQuery("oclQueryTest"); //$NON-NLS-1$
		AbstractModelQuery modelQueryInst = catalog.getModelQueryImpl(modelQuery);
		ModelQueryContext context = RuntimeFactory.eINSTANCE.createModelQueryContext();
		context.getSelectedModelElements().add(this.ecorePackage);
		List<ModelQueryResult> result = modelQueryInst.evaluate(context, null);
		Assert.assertTrue(result.get(0).getException() instanceof ModelQueryTypeCheckingException);
	}

	private static final int EMFMQQUERYTEST_EXPECTED_RESULT = 5;

	@Test
	public void emfmqQueryTest() throws Exception {
		String name = "emfmqQueryTest"; //$NON-NLS-1$
		IProject projectToCreate = this.utils.createProject(name);
		IFile file = FileUtils.copyFileFromBundle("resources/" + name + UnitTests.FILE_EXT, //$NON-NLS-1$
				projectToCreate, name + UnitTests.FILE_EXT, Activator.getDefault().getBundle());
		IFile javaFile = FileUtils.copyFileFromBundle(
				"src/org/eclipse/modisco/infra/query/tests/samples/EmfmqQueryTest.java", //$NON-NLS-1$
				projectToCreate,
				"src/org/eclipse/modisco/infra/query/tests/samples/EmfmqQueryTest.java", //$NON-NLS-1$
				Activator.getDefault().getBundle());
		ProjectUtils.refresh(projectToCreate);
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		FileUtils.checkNoMoreMarkerOn(javaFile, NB_MARKERS_Q_FILE);
		FileUtils.checkNoMarkerOn(file);
		ModelQuerySetCatalog catalog = ModelQuerySetCatalog.getSingleton();
		ModelQuerySet modelQuerySet = catalog.getModelQuerySet(name);
		ModelQuery modelQuery = modelQuerySet.getQueries().get(0);
		AbstractModelQuery modelQueryInst = catalog.getModelQueryImpl(modelQuery);
		ModelQueryContext context = RuntimeFactory.eINSTANCE.createModelQueryContext();
		context.getSelectedModelElements().add(this.ecorePackage);
		List<ModelQueryResult> result = modelQueryInst.evaluate(context, null);
		if (result.get(0).getException() != null) {
			throw new Exception(result.get(0).getException());
		}
		Assert.assertEquals(UnitTests.EMFMQQUERYTEST_EXPECTED_RESULT, ((Collection<?>) result
				.get(0).getValue()).size());
	}

	@Test
	public void jxpathQueryTest() throws Exception {
		String name = "jxpathQueryTest"; //$NON-NLS-1$
		IProject projectToCreate = this.utils.createProject(name);
		IFile file = FileUtils.copyFileFromBundle("resources/" + name + UnitTests.FILE_EXT, //$NON-NLS-1$
				projectToCreate, name + UnitTests.FILE_EXT, Activator.getDefault().getBundle());
		ProjectUtils.refresh(projectToCreate);
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		FileUtils.checkNoMarkerOn(file);
		ModelQuerySetCatalog catalog = ModelQuerySetCatalog.getSingleton();
		ModelQuerySet modelQuerySet = catalog.getModelQuerySet(name);
		ModelQuery modelQuery = modelQuerySet.getQueries().get(0);
		AbstractModelQuery modelQueryInst = catalog.getModelQueryImpl(modelQuery);
		ModelQueryContext context = RuntimeFactory.eINSTANCE.createModelQueryContext();
		context.getSelectedModelElements().add(this.ecorePackage);
		List<ModelQueryResult> result = modelQueryInst.evaluate(context, null);
		Assert.assertEquals("ecore", result.get(0).getValue()); //$NON-NLS-1$
		// Assert.assertEquals(5,((Collection<?>)result.get(0).getValue()).size());
	}

	/**
	 * Using platform protocol to refer Ecore model.
	 *
	 * @throws ModelQueryException
	 */
	@Test
	public void installedQuery01() throws ModelQueryException {
		ModelQuerySetCatalog catalog = ModelQuerySetCatalog.getSingleton();
		ModelQuerySet modelQuerySet = catalog.getModelQuerySet("modisco.infra.query.tests.01"); //$NON-NLS-1$
		ModelQuery modelQuery = modelQuerySet.getQueries().get(0);
		AbstractModelQuery modelQueryInst = catalog.getModelQueryImpl(modelQuery);
		ModelQueryContext context = RuntimeFactory.eINSTANCE.createModelQueryContext();
		context.getSelectedModelElements().add(this.ecorePackage);
		List<ModelQueryResult> result = modelQueryInst.evaluate(context, null);
		if (result.get(0).getException() != null) {
			Exception e = result.get(0).getException();
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
			Activator.getDefault().getLog().log(status);
			Assert.fail("No exception is expected."); //$NON-NLS-1$
		}
		Assert.assertEquals("", "Test001", result.get(0) //$NON-NLS-1$ //$NON-NLS-2$
				.getValue());
	}

	/**
	 * Using http protocol to refer Ecore model.
	 *
	 * @throws ModelQueryException
	 */
	@Test
	public void installedQuery02() throws ModelQueryException {
		ModelQuerySetCatalog catalog = ModelQuerySetCatalog.getSingleton();
		ModelQuerySet modelQuerySet = catalog.getModelQuerySet("modisco.infra.query.tests.02"); //$NON-NLS-1$
		ModelQuery modelQuery = modelQuerySet.getQueries().get(0);
		AbstractModelQuery modelQueryInst = catalog.getModelQueryImpl(modelQuery);
		ModelQueryContext context = RuntimeFactory.eINSTANCE.createModelQueryContext();
		context.getSelectedModelElements().add(this.ecorePackage);
		List<ModelQueryResult> result = modelQueryInst.evaluate(context, null);
		if (result.get(0).getException() != null) {
			Exception e = result.get(0).getException();
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
			Activator.getDefault().getLog().log(status);
			Assert.fail("No exception is expected."); //$NON-NLS-1$
		}
		Assert.assertEquals("", "Test001", result.get(0) //$NON-NLS-1$ //$NON-NLS-2$
				.getValue());
	}

	@Test
	public void wrongName() throws Exception {
		String name = "wrongName"; //$NON-NLS-1$
		wrongX(name, 1);
	}

	@Test
	public void wrongResultType() throws Exception {
		String name = "wrongResultType"; //$NON-NLS-1$
		wrongX(name, 1);
	}

	@Test
	public void wrongScope() throws Exception {
		String name = "wrongScope"; //$NON-NLS-1$
		wrongX(name, 1);
	}

	@Test
	public void nullResultType() throws Exception {
		String name = "nullResultType"; //$NON-NLS-1$
		wrongX(name, 2);
	}

	@Test
	public void uniqueName() throws Exception {
		String name = "uniqueName"; //$NON-NLS-1$
		wrongX(name, 2);
	}

	@Test
	public void parameterUniqueName() throws Exception {
		String name = "parameterUniqueName"; //$NON-NLS-1$
		wrongX(name, 2);
	}

	/**
	 * The query declares that it returns EBoolean, whereas the implementation
	 * class returns an Integer
	 */
	@Test
	public void returnType() throws Exception {
		String name = "returnType"; //$NON-NLS-1$
		wrongX(name, 1);
	}

	/**
	 * The query declares that it returns a collection of EClass, whereas the
	 * implementation class returns a collection of Boolean
	 */
	@Test
	public void returnTypeMulti() throws Exception {
		String name = "returnTypeMulti"; //$NON-NLS-1$
		wrongX(name, 1);
	}

	/**
	 * The query declares EObject as a scope, whereas the implementation class
	 * defines EClass (which is more restrictive)
	 */
	@Test
	public void scope() throws Exception {
		String name = "scope"; //$NON-NLS-1$
		wrongX(name, 1);
	}

	private IMarker[] wrongX(final String name, final int nbOfExpectedMarkers) throws Exception {
		return wrongX(name, nbOfExpectedMarkers, new Runnable() {

			public void run(final IProject project) throws Exception {
				// Empty
			}
		});
	}

	private IMarker[] wrongX(final String name, final int nbOfExpectedMarkers,
			final Runnable runnable) throws Exception {
		IMarker[] markers = null;
		IProject projectToCreate = this.utils.createProject(name);
		FileUtils.copyFileFromBundle("resources/validation/" + name //$NON-NLS-1$
				+ UnitTests.FILE_EXT, projectToCreate, name + UnitTests.FILE_EXT, Activator
				.getDefault().getBundle());
		runnable.run(projectToCreate);
		ProjectUtils.refresh(projectToCreate);
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		ModelQuerySetCatalog catalog = ModelQuerySetCatalog.getSingleton();
		Assert.assertEquals(null, catalog.getModelQuerySet(name));
		IFile file = projectToCreate.getFile(name + UnitTests.FILE_EXT);
		markers = file
				.findMarkers(ValidationJob.EMF_PROBLEM_MARKER, true, IResource.DEPTH_INFINITE);
		if (nbOfExpectedMarkers != markers.length) {
			StringBuilder errorMessage = new StringBuilder();
			errorMessage.append("Wrong number of markers. Expected " + nbOfExpectedMarkers
					+ ", got " + markers.length + ":\n");
			for (IMarker marker : markers) {
				errorMessage.append(marker.getAttribute("message") + "\n");
			}
			Assert.assertTrue(errorMessage.toString(), false);
		}
		return markers;
	}

	@Test
	public void wrongNameInInstalledQuerySet() {
		ModelQuerySetCatalog catalog = ModelQuerySetCatalog.getSingleton();
		Assert.assertEquals(null, catalog.getModelQuerySet("modisco.infra.query.tests.03.querySet")); //$NON-NLS-1$
	}

	@Test
	public void resourceSet() throws Exception {
		String name = "test002"; //$NON-NLS-1$
		IProject projectToCreate = this.utils.createProject(name);
		IFile file = FileUtils.copyFileFromBundle("resources/" + name + UnitTests.FILE_EXT, //$NON-NLS-1$
				projectToCreate, name + UnitTests.FILE_EXT, Activator.getDefault().getBundle());
		IFile javaFile = FileUtils.copyFileFromBundle(
				"src/org/eclipse/modisco/infra/query/tests/samples/Test002.java", //$NON-NLS-1$
				projectToCreate,
				"src/org/eclipse/modisco/infra/query/tests/samples/Test002.java", //$NON-NLS-1$
				Activator.getDefault().getBundle());
		ProjectUtils.refresh(projectToCreate);
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		FileUtils.checkNoMoreMarkerOn(javaFile, NB_MARKERS_Q_FILE);
		FileUtils.checkNoMarkerOn(file);
		ModelQuerySet mqs = ModelQuerySetCatalog.getSingleton().getModelQuerySet(name);

		URI ecoreMmUri = URI.createURI("http://www.eclipse.org/MoDisco/infra/query/0.8.incubation"); //$NON-NLS-1$
		Resource queryMmResource = this.resourceSet.getResource(ecoreMmUri, true);
		EPackage queryPackage = (EPackage) queryMmResource.getContents().get(0);
		EClass mqsEClass = (EClass) queryPackage.getEClassifier("ModelQuerySet"); //$NON-NLS-1$
		Assert.assertEquals("", mqs.eClass(), mqsEClass); //$NON-NLS-1$
	}

	@Test
	public void resourceSet2() throws Exception {
		String name = "resourceSet2"; //$NON-NLS-1$
		IProject projectToCreate = this.utils.createProject(name);
		IFile file = FileUtils.copyFileFromBundle("resources/" + name + UnitTests.FILE_EXT, //$NON-NLS-1$
				projectToCreate, name + UnitTests.FILE_EXT, Activator.getDefault().getBundle());
		ProjectUtils.refresh(projectToCreate);
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		FileUtils.checkNoMarkerOn(file);
		ModelQuerySet mqs = ModelQuerySetCatalog.getSingleton().getModelQuerySet(name);
		EClass mqsEClass = getMqsMetaClass("platform:/plugin/org.eclipse.gmt.modisco.infra.query/model/query.ecore"); //$NON-NLS-1$
		Assert.assertNotNull(mqs);
		Assert.assertNotSame("", mqs.eClass(), mqsEClass); //$NON-NLS-1$
	}

	@Test
	public void resourceSet3() {
		EClass mqsEClass = getMqsMetaClass("platform:/plugin/org.eclipse.gmt.modisco.infra.query/model/query.ecore"); //$NON-NLS-1$
		EClass mqsEClass2 = getMqsMetaClass("http://www.eclipse.org/MoDisco/infra/query/0.8.incubation"); //$NON-NLS-1$
		Assert.assertNotSame("", mqsEClass, mqsEClass2); //$NON-NLS-1$
	}

	private EClass getMqsMetaClass(final String uri) {
		URI ecoreMmUri = URI.createURI(uri);
		Resource queryMmResource = this.resourceSet.getResource(ecoreMmUri, true);
		EPackage queryPackage = (EPackage) queryMmResource.getContents().get(0);
		EClass mqsEClass = (EClass) queryPackage.getEClassifier("ModelQuerySet"); //$NON-NLS-1$
		return mqsEClass;
	}

	@Test
	public void modiscoProtocol() {
		URI uri = URI.createURI("modisco:/query/modisco.infra.query.tests.01"); //$NON-NLS-1$
		Resource r = this.resourceSet.getResource(uri, true);
		EObject root = r.getContents().get(0);
		if (root instanceof ModelQuerySet) {
			ModelQuerySet mqs = (ModelQuerySet) root;
			Assert.assertEquals("modisco.infra.query.tests.01", mqs.getName()); //$NON-NLS-1$
		} else {
			Assert.fail("A ModelQuerySet instance is expected as root element."); //$NON-NLS-1$
		}

	}

	// //@Test
	// public void propertiesTest() {
	// try {
	// String name = "propertiesTest";
	// IProject projectToCreate = this.utils.createProject(name);
	// this.utils.copyFileFormBundle("resources/" + name + UnitTests.FILE_EXT,
	// projectToCreate, name + UnitTests.FILE_EXT);
	// this.utils.copyFileFormBundle("resources/" + name + ".mdProperties",
	// projectToCreate, name + ".mdProperties");
	// ProjectUtils.refresh(projectToCreate);
	//
	// ModelQuerySetCatalog catalog = ModelQuerySetCatalog.getSingleton();
	// ModelQuerySet modelQuerySet = catalog.getModelQuerySet(name);
	//
	// List<Object> objectList = modelQuerySet.getValue("simpleProperty");
	// Assert.assertEquals(2, objectList.size());
	// Assert.assertTrue(objectList.contains("a"));
	// Assert.assertTrue(objectList.contains("b"));
	// List<Object> objectList2 = modelQuerySet.getValue("propertyType1");
	// Assert.assertEquals(1, objectList2.size());
	// Assert.assertTrue(objectList2.contains("val1"));
	// List<Object> objectList3 = modelQuerySet.getValue("object");
	// Assert.assertEquals(1, objectList3.size());
	// Assert.assertTrue(objectList3.contains(this.ecorePackage));
	// } catch (Exception e) {
	// IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e
	// .getMessage(), e);
	// Activator.getDefault().getLog().log(status);
	// Assert.fail(e.getMessage());
	// }
	// }

	/** Bug 303036 - implements IJavaModelQuery may be done by a superclass */
	@Test
	public void bug303036() throws ModelQueryException {
		ModelQuerySetCatalog catalog = ModelQuerySetCatalog.getSingleton();
		ModelQuerySet modelQuerySet = catalog.getModelQuerySet("Bug303036"); //$NON-NLS-1$
		ModelQuery modelQueryDescription = null;
		for (ModelQuery modelQuery : modelQuerySet.getQueries()) {
			if (modelQuery.getName().equals("bug303036")) { //$NON-NLS-1$
				modelQueryDescription = modelQuery;
				break;
			}
		}
		Assert.assertNotNull(modelQueryDescription);
		AbstractModelQuery myModelQuery = catalog.getModelQueryImpl(modelQueryDescription);
		String result = (String) myModelQuery.basicEvaluate(modelQuerySet);
		Assert.assertEquals(result, Bug303036Test003Query.RESULT);
	}

	@Test
	public void wrongImplementationClassName() throws Exception {
		String name = "wrongImplementationClassName"; //$NON-NLS-1$
		wrongX(name, 1);
	}

	@Test
	public void wrongImplementationClassInterface() throws Exception {
		String name = "wrongImplementationClassInterface"; //$NON-NLS-1$
		wrongX(name, 1, new Runnable() {
			public void run(final IProject project) throws Exception {
				FileUtils
						.copyFileFromBundle(
								"src/org/eclipse/modisco/infra/query/tests/samples/WrongImplementationClassInterface.java", //$NON-NLS-1$
								project,
								"src/org/eclipse/modisco/infra/query/tests/samples/WrongImplementationClassInterface.java", //$NON-NLS-1$
								Activator.getDefault().getBundle());
			}
		});

	}

	private interface Runnable {
		public void run(IProject project) throws Exception;
	}

	/**
	 * Bug 306724 - deleting a project containing a query set does not remove
	 * the query set from its catalog
	 */
	@Test
	public void bug306724() throws Exception {
		String name = "bug306724"; //$NON-NLS-1$
		IProject project = this.utils.createProject(name);
		IFile file = FileUtils.copyFileFromBundle("resources/" + name + UnitTests.FILE_EXT, //$NON-NLS-1$
				project, name + UnitTests.FILE_EXT, Activator.getDefault().getBundle());
		ProjectUtils.refresh(project);
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		FileUtils.checkNoMarkerOn(file);
		ModelQuerySet querySet = ModelQuerySetCatalog.getSingleton().getModelQuerySet(name);
		Assert.assertNotNull(querySet);
		project.close(new NullProgressMonitor());
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		querySet = ModelQuerySetCatalog.getSingleton().getModelQuerySet(name);
		Assert.assertNull(querySet);
		project.open(new NullProgressMonitor());
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		FileUtils.checkNoMarkerOn(file);
		querySet = ModelQuerySetCatalog.getSingleton().getModelQuerySet(name);
		Assert.assertNotNull(querySet);
		project.delete(true, new NullProgressMonitor());
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		querySet = ModelQuerySetCatalog.getSingleton().getModelQuerySet(name);
		Assert.assertNull(querySet);
	}

	/**
	 * Bug 307095 - the validation state of a Java query is not updated when the
	 * Java class is fixed
	 */
	@Test
	public void bug307095() throws Exception {
		final String name = "bug307095"; //$NON-NLS-1$
		IProject project = this.utils.createProject(name);
		FileUtils.copyFileFromBundle("resources/" + name + UnitTests.FILE_EXT, //$NON-NLS-1$
				project, name + UnitTests.FILE_EXT, Activator.getDefault().getBundle());
		ProjectUtils.refresh(project);
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		IFile queryFile = project.getFile(name + UnitTests.FILE_EXT);
		IMarker[] markers = queryFile.findMarkers(ValidationJob.EMF_PROBLEM_MARKER, true,
				IResource.DEPTH_INFINITE);
		Assert.assertEquals(1, markers.length);
		FileUtils.copyFileFromBundle(
				"src/org/eclipse/modisco/infra/query/tests/samples/Test001.java", //$NON-NLS-1$
				project, "src/org/eclipse/modisco/infra/query/tests/samples/Test001.java", //$NON-NLS-1$
				Activator.getDefault().getBundle());
		ProjectUtils.refresh(project);
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		markers = queryFile.findMarkers(ValidationJob.EMF_PROBLEM_MARKER, true,
				IResource.DEPTH_INFINITE);
		Assert.assertEquals(0, markers.length);

	}

	/**
	 * Bug 307095 - the validation state of a Java query is not updated when the
	 * Java class is fixed
	 */
	@Test
	public void bug307095v2() throws Exception {
		final String name = "bug307095v2"; //$NON-NLS-1$
		IProject project = this.utils.createProject(name);
		FileUtils.copyFileFromBundle("resources/" + name + UnitTests.FILE_EXT, //$NON-NLS-1$
				project, name + UnitTests.FILE_EXT, Activator.getDefault().getBundle());
		FileUtils.copyFileFromBundle("resources/bug307095v2_Test001.java", //$NON-NLS-1$
				project, "src/org/eclipse/modisco/infra/query/tests/samples/Test001.java", //$NON-NLS-1$
				Activator.getDefault().getBundle());
		ProjectUtils.refresh(project);
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		IFile queryFile = project.getFile(name + UnitTests.FILE_EXT);
		IMarker[] markers = queryFile.findMarkers(ValidationJob.EMF_PROBLEM_MARKER, true,
				IResource.DEPTH_INFINITE);
		Assert.assertEquals(1, markers.length);
		FileUtils.copyFileFromBundle(
				"src/org/eclipse/modisco/infra/query/tests/samples/Test001.java", //$NON-NLS-1$
				project, "src/org/eclipse/modisco/infra/query/tests/samples/Test001.java", //$NON-NLS-1$
				Activator.getDefault().getBundle());
		ProjectUtils.refresh(project);
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		markers = queryFile.findMarkers(ValidationJob.EMF_PROBLEM_MARKER, true,
				IResource.DEPTH_INFINITE);
		Assert.assertEquals(0, markers.length);
		FileUtils.copyFileFromBundle("resources/bug307095v2_Test001.java", //$NON-NLS-1$
				project, "src/org/eclipse/modisco/infra/query/tests/samples/Test001.java", //$NON-NLS-1$
				Activator.getDefault().getBundle());
		ProjectUtils.refresh(project);
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		markers = queryFile.findMarkers(ValidationJob.EMF_PROBLEM_MARKER, true,
				IResource.DEPTH_INFINITE);
		Assert.assertEquals(1, markers.length);

	}

	/**
	 * Bug 307095 - the validation state of a Java query is not updated when the
	 * Java class is fixed
	 */
	@Test
	public void bug307095v3() throws Exception {
		final String name = "bug307095v3"; //$NON-NLS-1$
		// Create MoDisco project
		IProject project = this.utils.createProject(name);
		FileUtils.copyFileFromBundle("resources/" + name + UnitTests.FILE_EXT, //$NON-NLS-1$
				project, name + UnitTests.FILE_EXT, Activator.getDefault().getBundle());
		FileUtils.copyFileFromBundle(
				"src/org/eclipse/modisco/infra/query/tests/samples/Bug307095v3.java", //$NON-NLS-1$
				project, "src/org/eclipse/modisco/infra/query/tests/samples/Bug307095v3.java", //$NON-NLS-1$
				Activator.getDefault().getBundle());
		ProjectUtils.refresh(project);
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		IFile queryFile = project.getFile(name + UnitTests.FILE_EXT);
		IMarker[] markers = queryFile.findMarkers(ValidationJob.EMF_PROBLEM_MARKER, true,
				IResource.DEPTH_INFINITE);
		Assert.assertEquals(1, markers.length);
		// Create helper project
		IProject projectHelper = ProjectUtils.createTestPluginProject(
				name + "helper", Activator.getDefault().getBundle(), "."); //$NON-NLS-1$ //$NON-NLS-2$
		FileUtils
				.copyFileFromBundle(
						"src/org/eclipse/modisco/infra/query/tests/samples/bug307095/HelperBug307095v3.java", //$NON-NLS-1$
						projectHelper,
						"src/org/eclipse/modisco/infra/query/tests/samples/bug307095/HelperBug307095v3.java", //$NON-NLS-1$
						Activator.getDefault().getBundle());
		ProjectUtils.refresh(projectHelper);
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		markers = queryFile.findMarkers(ValidationJob.EMF_PROBLEM_MARKER, true,
				IResource.DEPTH_INFINITE);
		Assert.assertEquals(0, markers.length);

	}

	/**
	 * Bug 307187 - AbstractMoDiscoCatalog and name conflicts : If two querySets
	 * have the same name, only one will be registered in the catalog and the
	 * user will never be informed about this problem.
	 */
	@Test
	public void bug307187() throws Exception {
		final String name = "bug307187"; //$NON-NLS-1$
		final String dir1 = "1/"; //$NON-NLS-1$
		final String dir2 = "2/"; //$NON-NLS-1$
		IProject project = this.utils.createProject(name);
		FileUtils.copyFileFromBundle("resources/" + name + UnitTests.FILE_EXT, //$NON-NLS-1$
				project, dir1 + name + UnitTests.FILE_EXT, Activator.getDefault().getBundle());
		FileUtils.copyFileFromBundle("resources/" + name + UnitTests.FILE_EXT, //$NON-NLS-1$
				project, dir2 + name + UnitTests.FILE_EXT, Activator.getDefault().getBundle());
		ProjectUtils.refresh(project);
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		IFile queryFile1 = project.getFile(new Path(dir1 + name + UnitTests.FILE_EXT));
		IFile queryFile2 = project.getFile(new Path(dir2 + name + UnitTests.FILE_EXT));
		IMarker[] markers1 = queryFile1.findMarkers(null, true, IResource.DEPTH_INFINITE);
		IMarker[] markers2 = queryFile2.findMarkers(null, true, IResource.DEPTH_INFINITE);
		Assert.assertEquals(1, markers1.length + markers2.length);
	}

	/**
	 * Bug 309657 - Moving facet or query models generates wrong problem
	 * messages
	 */
	@Test
	public void bug309657() throws Exception {
		final String name = "bug309657"; //$NON-NLS-1$
		IProject project = this.utils.createProject(name);
		FileUtils.copyFileFromBundle("resources/" + name + UnitTests.FILE_EXT, //$NON-NLS-1$
				project, name + UnitTests.FILE_EXT, Activator.getDefault().getBundle());
		ProjectUtils.refresh(project);
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		IFolder folder = project.getFolder("f1");
		folder.create(true, true, new NullProgressMonitor());
		// for (int i = 0; i < 5; i++) {
		IFile sourceFile = project.getFile(name + UnitTests.FILE_EXT);
		IPath sourcePath = sourceFile.getFullPath();
		IPath targetPath = new Path(folder.getFullPath() + "/" + name + UnitTests.FILE_EXT);
		sourceFile.move(targetPath, true, new NullProgressMonitor());
		ProjectUtils.refresh(project);
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		IFile targetFile = ResourcesPlugin.getWorkspace().getRoot().getFile(targetPath);
		IMarker[] markers = targetFile.findMarkers(AbstractMoDiscoCatalog.NAME_CONFLICTS_MARKER,
				true, IResource.DEPTH_INFINITE);
		Assert.assertEquals(0, markers.length);
		targetFile.move(sourcePath, true, new NullProgressMonitor());
		ProjectUtils.refresh(project);
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		markers = sourceFile.findMarkers(AbstractMoDiscoCatalog.NAME_CONFLICTS_MARKER, true,
				IResource.DEPTH_INFINITE);
		Assert.assertEquals(0, markers.length);
		// }
	}

	/**
	 * Check that a model stored in the catalog in contained in resource.
	 *
	 * @throws Exception
	 */
	@Test
	public void bug310269() throws Exception {
		final String name = "bug310269"; //$NON-NLS-1$
		IProject project = this.utils.createProject(name);
		IFile file = FileUtils.copyFileFromBundle("modisco/" + name + UnitTests.FILE_EXT, //$NON-NLS-1$
				project, name + UnitTests.FILE_EXT, Activator.getDefault().getBundle());
		ProjectUtils.refresh(project);
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		FileUtils.checkNoMarkerOn(file);
		ModelQuerySet mqs = ModelQuerySetCatalog.getSingleton().getModelQuerySet(name);
		Assert.assertNotNull(mqs);
		Assert.assertNotNull(mqs.eResource());
		project.getFile(name + UnitTests.FILE_EXT).delete(true, new NullProgressMonitor());
		ProjectUtils.refresh(project);
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		mqs = ModelQuerySetCatalog.getSingleton().getModelQuerySet(name);
		Assert.assertNotNull(mqs);
		Assert.assertNotNull(mqs.eResource());
	}

	/**
	 * Name conflict markers not cleared when closing or deleting other project
	 *
	 * @throws Exception
	 */
	@Test
	public void bug310599() throws Exception {
		final String name = "bug310599"; //$NON-NLS-1$
		IProject project1 = this.utils.createProject(name + "_1");
		IFile file1 = FileUtils.copyFileFromBundle("resources/" + name + UnitTests.FILE_EXT, //$NON-NLS-1$
				project1, name + UnitTests.FILE_EXT, Activator.getDefault().getBundle());
		ProjectUtils.refresh(project1);
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		IProject project2 = this.utils.createProject(name + "_2");
		IFile file2 = FileUtils.copyFileFromBundle("resources/" + name + UnitTests.FILE_EXT, //$NON-NLS-1$
				project2, name + UnitTests.FILE_EXT, Activator.getDefault().getBundle());
		ProjectUtils.refresh(project2);
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		IMarker[] markers1 = file1.findMarkers(null, true, IResource.DEPTH_INFINITE);
		IMarker[] markers2 = file2.findMarkers(null, true, IResource.DEPTH_INFINITE);
		Assert.assertEquals(1, markers1.length + markers2.length);
		if (markers2.length == 1) {
			project1.close(new NullProgressMonitor());
			ProjectUtils.refresh(project2);
			ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
			FileUtils.checkNoMarkerOn(file2);
		} else {
			project2.close(new NullProgressMonitor());
			ProjectUtils.refresh(project1);
			ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
			FileUtils.checkNoMarkerOn(file1);
		}
	}

	/**
	 * Name conflict markers not cleared when closing or deleting other project
	 *
	 * @throws Exception
	 */
	@Test
	public void bug310599v2() throws Exception {
		final String name = "bug310599"; //$NON-NLS-1$
		IProject project1 = this.utils.createProject(name + "_1");
		IFile file1 = FileUtils.copyFileFromBundle("resources/" + name + UnitTests.FILE_EXT, //$NON-NLS-1$
				project1, name + UnitTests.FILE_EXT, Activator.getDefault().getBundle());
		ProjectUtils.refresh(project1);
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		IProject project2 = this.utils.createProject(name + "_2");
		IFile file2 = FileUtils.copyFileFromBundle("resources/" + name + UnitTests.FILE_EXT, //$NON-NLS-1$
				project2, name + UnitTests.FILE_EXT, Activator.getDefault().getBundle());
		ProjectUtils.refresh(project2);
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		IProject project3 = this.utils.createProject(name + "_3");
		IFile file3 = FileUtils.copyFileFromBundle("resources/" + name + UnitTests.FILE_EXT, //$NON-NLS-1$
				project3, name + UnitTests.FILE_EXT, Activator.getDefault().getBundle());
		ProjectUtils.refresh(project3);
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		IMarker[] markers1 = file1.findMarkers(null, true, IResource.DEPTH_INFINITE);
		IMarker[] markers2 = file2.findMarkers(null, true, IResource.DEPTH_INFINITE);
		IMarker[] markers3 = file3.findMarkers(null, true, IResource.DEPTH_INFINITE);
		Assert.assertEquals(2, markers1.length + markers2.length + markers3.length);
		if (markers1.length == 0) {
			project1.close(new NullProgressMonitor());
			project2.close(new NullProgressMonitor());
			ProjectUtils.refresh(project3);
			ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
			FileUtils.checkNoMarkerOn(file3);
		} else if (markers2.length == 0) {
			project2.close(new NullProgressMonitor());
			project3.close(new NullProgressMonitor());
			ProjectUtils.refresh(project1);
			ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
			FileUtils.checkNoMarkerOn(file1);
		} else {
			project3.close(new NullProgressMonitor());
			project1.close(new NullProgressMonitor());
			ProjectUtils.refresh(project2);
			ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
			FileUtils.checkNoMarkerOn(file2);
		}
	}

}
