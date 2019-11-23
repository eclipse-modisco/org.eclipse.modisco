/*******************************************************************************
 * Copyright (c) 2009, 2015 Mia-Software.
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
package org.eclipse.modisco.infra.facet.tests;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.ILogListener;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmt.modisco.infra.common.core.internal.builder.AbstractMoDiscoCatalog;
import org.eclipse.gmt.modisco.infra.common.core.internal.builder.EcoreCatalog;
import org.eclipse.gmt.modisco.infra.common.core.internal.resource.MoDiscoResourceSet;
import org.eclipse.gmt.modisco.infra.common.core.internal.utils.FileUtils;
import org.eclipse.gmt.modisco.infra.common.core.internal.utils.FolderUtils;
import org.eclipse.gmt.modisco.infra.common.core.internal.utils.IFilter;
import org.eclipse.gmt.modisco.infra.common.core.internal.utils.ProjectUtils;
import org.eclipse.gmt.modisco.infra.common.core.internal.validation.ValidationJob;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.facet.Facet;
import org.eclipse.gmt.modisco.infra.facet.FacetAttribute;
import org.eclipse.gmt.modisco.infra.facet.FacetReference;
import org.eclipse.gmt.modisco.infra.facet.FacetSet;
import org.eclipse.gmt.modisco.infra.facet.core.FacetContext;
import org.eclipse.gmt.modisco.infra.facet.core.FacetSetCatalog;
import org.eclipse.gmt.modisco.infra.query.ModelQuery;
import org.eclipse.gmt.modisco.infra.query.ModelQuerySet;
import org.eclipse.gmt.modisco.infra.query.core.ModelQuerySetCatalog;
import org.eclipse.modisco.facet.util.pde.core.internal.exported.TargetPlatformUtils;
import org.eclipse.modisco.facet.util.pde.core.internal.exported.exception.PdeCoreUtilsException;
import org.eclipse.modisco.infra.query.tests.Utils;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.osgi.framework.Bundle;

/**
 * @author Gregoire DUPE
 *
 */
@SuppressWarnings({ "nls" })
public class FacetTests {
	private static final int NB_MARKER_GETSUBCLASSES = 6;
	public static final String FILE_EXT = ".facetSet";
	public static final String QUERY_EXT = ".querySet";

	private final Utils utils = new Utils(Activator.getDefault());
	private final EPackage ecorePackage = this.utils.getEcorePackage();
	private final ResourceSet resourceSet = new ResourceSetImpl();

	@BeforeClass
	public static void loadTarget() throws PdeCoreUtilsException {
	//	TargetPlatformUtils.loadTargetPlatform();
	}
	
	/**
	 * @return the utils
	 */
	protected Utils getUtils() {
		return this.utils;
	}

	@Test
	public void test001() throws Exception {
		final String name = "test001";
		IProject projectToCreate = this.utils.createProject(name);
		IFile queryFile = FileUtils.copyFileFromBundle("resources/" + name + ".querySet",
				projectToCreate, "/" + name + ".querySet", Activator.getDefault().getBundle());
		IFile facetFile = FileUtils.copyFileFromBundle("resources/" + name + FacetTests.FILE_EXT,
				projectToCreate, "/" + name + FacetTests.FILE_EXT, Activator.getDefault()
						.getBundle());
		IFile javaFile = FileUtils.copyFileFromBundle(
				"src/org/eclipse/modisco/infra/facet/tests/samples/GetSubClasses.java",
				projectToCreate,
				"/src/org/eclipse/modisco/infra/facet/tests/samples/GetSubClasses.java",
				Activator.getDefault().getBundle());
		ProjectUtils.refresh(projectToCreate);
		FileUtils.checkNoMoreMarkerOn(javaFile, NB_MARKER_GETSUBCLASSES);
		FileUtils.checkNoMarkerOn(queryFile);
		FileUtils.checkNoMarkerOn(facetFile);
		FacetSet facetSet = FacetSetCatalog.getSingleton().getFacetSet(name);
		Assert.assertNotNull(facetSet);
		FacetContext context = new FacetContext();
		context.addFacetSet(facetSet);
		// Part 1
		Facet facet = facetSet.getFacet("EPackageFacet");
		Assert.assertNotNull(facet);
		Assert.assertTrue(context.isInstance(this.ecorePackage, facet));
		Object object = context.get(this.ecorePackage,
				facet.getEStructuralFeature("nbEClassifiers"));
		Assert.assertNotNull(object);
		Assert.assertTrue(object instanceof Integer);
		final int expectedNumberOfClassifiers = 53;
		Assert.assertEquals(new Integer(expectedNumberOfClassifiers), object);
		// Part 2
		Facet facet2 = facetSet.getFacet("EClassFacet");
		Assert.assertNotNull(facet2);
		Assert.assertTrue(context.isInstance(this.ecorePackage.getEClassifier("ENamedElement"),
				facet2));
		Object object2 = context.get(this.ecorePackage.getEClassifier("ENamedElement"),
				facet2.getEStructuralFeature("subClasses"));
		Assert.assertNotNull(object2);
		Assert.assertTrue(object2 instanceof Collection<?>);
		if (object2 instanceof Collection<?>) {
			Collection<?> collection = (Collection<?>) object2;
			final int expectedNumberOfSubclasses = 14;
			Assert.assertEquals(expectedNumberOfSubclasses, collection.size());
		} else {
			Assert.fail("Unexpected type for object2");
		}
	}

	@Test
	public void test002() throws Exception {
		final String name = "test002";
		IProject projectToCreate = this.utils.createProject(name);
		IFile queryFile = FileUtils.copyFileFromBundle("resources/" + name + ".querySet",
				projectToCreate, "/" + name + ".querySet", Activator.getDefault().getBundle());
		IFile facetFile = FileUtils.copyFileFromBundle("resources/" + name + FacetTests.FILE_EXT,
				projectToCreate, "/" + name + FacetTests.FILE_EXT, Activator.getDefault()
						.getBundle());
		ProjectUtils.refresh(projectToCreate);
		FileUtils.checkNoMarkerOn(queryFile);
		FileUtils.checkNoMarkerOn(facetFile);
		FacetSet facetSet = FacetSetCatalog.getSingleton().getFacetSet(name);
		Assert.assertNotNull(facetSet);
		FacetContext context = new FacetContext();
		context.addFacetSet(facetSet);
		Facet facet = facetSet.getFacet("EPackageFacet");
		FacetAttribute attribute = (FacetAttribute) facet.getEStructuralFeature("nbEClassifiers");
		ModelQuery queryFromFacet1 = attribute.getValueQuery();
		Assert.assertEquals("x", queryFromFacet1.getDescription());
		Assert.assertFalse(queryFromFacet1.eIsProxy());
		// Changing query description value to "bis"
		FileUtils.copyFileFromBundle("resources/" + name + "bis.querySet", projectToCreate, "/"
				+ name + ".querySet", Activator.getDefault().getBundle());
		ProjectUtils.refresh(projectToCreate);
		FileUtils.checkNoMarkerOn(queryFile);
		FileUtils.checkNoMarkerOn(facetFile);
		// Checking directly the query
		ModelQuerySet querySet = ModelQuerySetCatalog.getSingleton().getModelQuerySet("test002");
		ModelQuery modelQuery = querySet.getQuery("nbEClassifiers");

		Assert.assertEquals("bis", modelQuery.getDescription());
		// Checking the query through the facet
		FacetSet facetSet2 = FacetSetCatalog.getSingleton().getFacetSet(name);
		Facet facet2 = facetSet2.getFacet("EPackageFacet");
		FacetAttribute attribute2 = (FacetAttribute) facet2.getEStructuralFeature("nbEClassifiers");
		ModelQuery queryFromFacet2 = attribute2.getValueQuery();
		Assert.assertEquals("bis", queryFromFacet2.getDescription());

		Assert.assertNotNull(queryFromFacet2);
		// Assert.assertTrue(query2.eIsProxy());
		Assert.assertEquals(queryFromFacet2.getName(), "nbEClassifiers");
		Assert.assertEquals(0, queryFromFacet2.getParameters().size());
		// EcoreUtil.resolve(query2, facet.eResource());
		// Assert.assertFalse(EcoreUtil.getURI(query2).toString(), query2
		// .eIsProxy());
		Assert.assertNotNull(modelQuery);
		Assert.assertNotNull(modelQuery.eResource());
		Assert.assertEquals(MoDiscoResourceSet.getResourceSetSingleton(), modelQuery.eResource()
				.getResourceSet());
		Assert.assertNotNull(queryFromFacet2.eResource());
		Assert.assertEquals(MoDiscoResourceSet.getResourceSetSingleton(), queryFromFacet2
				.eResource().getResourceSet());
		Assert.assertEquals(queryFromFacet2.eResource().getURI(), modelQuery.eResource().getURI());
		Assert.assertEquals(queryFromFacet2.eResource().getResourceSet(), modelQuery.eResource()
				.getResourceSet());
		// Assert.assertEquals(queryFromFacet2.eResource(),
		// modelQuery.eResource());
		Assert.assertEquals(queryFromFacet2, modelQuery);
		Assert.assertEquals("bis", modelQuery.getDescription());
	}

	/**
	 * To check if the references to the a meta-model are updated when the
	 * corresponding ecore file is reloaded
	 *
	 * @throws CoreException
	 * @throws IOException
	 * @throws InterruptedException
	 */
	@Test
	public void test003() throws Exception {
		final String name = "test003";
		IProject projectToCreate = this.utils.createProject(name);
		IFile queryFile = FileUtils.copyFileFromBundle("resources/" + name + ".querySet",
				projectToCreate, "/" + name + ".querySet", Activator.getDefault().getBundle());
		IFile facetFile = FileUtils.copyFileFromBundle("resources/" + name + ".facetSet",
				projectToCreate, "/" + name + ".facetSet", Activator.getDefault().getBundle());
		IFile ecoreFile = FileUtils.copyFileFromBundle("resources/" + name + ".ecore",
				projectToCreate, "/" + name + ".ecore", Activator.getDefault().getBundle());
		ProjectUtils.refresh(projectToCreate);
		FileUtils.checkNoMarkerOn(queryFile);
		FileUtils.checkNoMarkerOn(ecoreFile);
		FileUtils.checkNoMarkerOn(facetFile);
		FacetSet facetSet = FacetSetCatalog.getSingleton().getFacetSet(name);
		Assert.assertNotNull(facetSet);
		Facet facet = facetSet.getFacet("EPackageFacet");
		FacetReference attribute = (FacetReference) facet.getEStructuralFeature("nbEClassifiers");
		ModelQuery queryFromFacet1 = attribute.getValueQuery();
		Assert.assertFalse(((EClass) queryFromFacet1.getReturnType()).isAbstract());
		String mmNsUri = queryFromFacet1.getReturnType().getEPackage().getNsURI();
		Assert.assertFalse(queryFromFacet1.eIsProxy());
		// Changing query description value to "bis"
		FileUtils.copyFileFromBundle("resources/" + name + "bis.ecore", projectToCreate, "/" + name
				+ ".ecore", Activator.getDefault().getBundle());
		ProjectUtils.refresh(projectToCreate);
		FileUtils.checkNoMarkerOn(ecoreFile);
		// Checking directly the query
		EPackage epackage = EPackage.Registry.INSTANCE.getEPackage(mmNsUri);
		Assert.assertNotNull(epackage);
		Assert.assertTrue(((EClass) epackage.getEClassifier("Test003Class")).isAbstract());
		// Checking the query through the facet
		FacetSet facetSet2 = FacetSetCatalog.getSingleton().getFacetSet(name);
		Facet facet2 = facetSet2.getFacet("EPackageFacet");
		FacetReference attribute2 = (FacetReference) facet2.getEStructuralFeature("nbEClassifiers");
		ModelQuery queryFromFacet2 = attribute2.getValueQuery();
		Assert.assertTrue(((EClass) queryFromFacet2.getReturnType()).isAbstract());
	}

	@Test
	public void wrongName() throws Exception {
		checkValidation("wrongName");
	}

	@Test
	public void wrongIsAbstract() throws Exception {
		final String name = "wrongIsAbstract";
		IProject project = this.utils.createProject(name);
		FileUtils.copyFileFromBundle("resources/validation/" + name + FacetTests.FILE_EXT, project,
				"/" + name + FacetTests.FILE_EXT, Activator.getDefault().getBundle());
		FileUtils.copyFileFromBundle("resources/validation/" + name + FacetTests.QUERY_EXT,
				project, "/" + name + FacetTests.QUERY_EXT, Activator.getDefault().getBundle());
		wrongX(name, project, 1);
	}

	// //@Test The error is automatically fixed by the meta-model implementation
	public void wrongAttrChangeable() throws Exception {
		String name = "wrongAttrChangeable";
		IProject project = createWrongProjectFromTest001(name);
		URI uri = URI.createURI("platform:/resource/" + name + "/" + name + FacetTests.FILE_EXT);
		Resource resource = this.resourceSet.getResource(uri, true);
		FacetSet facetSet = (FacetSet) resource.getContents().get(0);
		Facet facet = (Facet) facetSet.getEClassifier("EPackageFacet");
		facetSet.setName(name);
		FacetAttribute facetReference = (FacetAttribute) facet
				.getEStructuralFeature("nbEClassifiers");
		facetReference.setChangeable(true);
		resource.save(Collections.EMPTY_MAP);
		wrongX(name, project, 1);
	}

	// //@Test
	public void wrongAttrDerived() throws Exception {
		String name = "wrongRefDerived";
		IProject project = createWrongProjectFromTest001(name);
		URI uri = URI.createURI("platform:/resource/" + name + "/" + name + FacetTests.FILE_EXT);
		Resource resource = this.resourceSet.getResource(uri, true);
		FacetSet facetSet = (FacetSet) resource.getContents().get(0);
		Facet facet = (Facet) facetSet.getEClassifier("EPackageFacet");
		facetSet.setName(name);
		FacetAttribute facetReference = (FacetAttribute) facet
				.getEStructuralFeature("nbEClassifiers");
		facetReference.setDerived(false);
		resource.save(Collections.EMPTY_MAP);
		wrongX(name, project, 1);
	}

	// //@Test The error is automatically fixed by the meta-model implementation
	public void wrongAttrVolatile() throws Exception {
		String name = "wrongRefVolatile";
		IProject project = createWrongProjectFromTest001(name);
		URI uri = URI.createURI("platform:/resource/" + name + "/" + name + FacetTests.FILE_EXT);
		Resource resource = this.resourceSet.getResource(uri, true);
		FacetSet facetSet = (FacetSet) resource.getContents().get(0);
		Facet facet = (Facet) facetSet.getEClassifier("EPackageFacet");
		facetSet.setName(name);
		FacetAttribute facetReference = (FacetAttribute) facet
				.getEStructuralFeature("nbEClassifiers");
		facetReference.setVolatile(false);
		resource.save(Collections.EMPTY_MAP);
		wrongX(name, project, 1);
	}

	// //@Test The error is automatically fixed by the meta-model implementation
	public void wrongAttrUnsettable() throws Exception {
		String name = "wrongRefUnsettable";
		IProject project = createWrongProjectFromTest001(name);
		URI uri = URI.createURI("platform:/resource/" + name + "/" + name + FacetTests.FILE_EXT);
		Resource resource = this.resourceSet.getResource(uri, true);
		FacetSet facetSet = (FacetSet) resource.getContents().get(0);
		Facet facet = (Facet) facetSet.getEClassifier("EPackageFacet");
		facetSet.setName(name);
		FacetAttribute facetReference = (FacetAttribute) facet
				.getEStructuralFeature("nbEClassifiers");
		facetReference.setUnsettable(false);
		resource.save(Collections.EMPTY_MAP);
		wrongX(name, project, 1);
	}

	// //@Test The error is automatically fixed by the meta-model implementation
	public void wrongRefChangeable() throws Exception {
		String name = "wrongRefChangeable";
		IProject project = createWrongProjectFromTest001(name);
		URI uri = URI.createURI("platform:/resource/" + name + "/" + name + FacetTests.FILE_EXT);
		Resource resource = this.resourceSet.getResource(uri, true);
		FacetSet facetSet = (FacetSet) resource.getContents().get(0);
		Facet facet = (Facet) facetSet.getEClassifier("EClassFacet");
		facetSet.setName(name);
		FacetReference facetReference = (FacetReference) facet.getEStructuralFeature("subClasses");
		facetReference.setChangeable(true);
		resource.save(Collections.EMPTY_MAP);
		wrongX(name, project, 1);
	}

	// //@Test The error is automatically fixed by the meta-model implementation
	public void wrongRefDerived() throws Exception {
		String name = "wrongRefDerived";
		IProject project = createWrongProjectFromTest001(name);
		URI uri = URI.createURI("platform:/resource/" + name + "/" + name + FacetTests.FILE_EXT);
		Resource resource = this.resourceSet.getResource(uri, true);
		FacetSet facetSet = (FacetSet) resource.getContents().get(0);
		Facet facet = (Facet) facetSet.getEClassifier("EClassFacet");
		facetSet.setName(name);
		FacetReference facetReference = (FacetReference) facet.getEStructuralFeature("subClasses");
		facetReference.setDerived(false);
		resource.save(Collections.EMPTY_MAP);
		wrongX(name, project, 1);
	}

	// //@Test The error is automatically fixed by the meta-model implementation
	public void wrongRefVolatile() throws Exception {
		String name = "wrongRefVolatile";
		IProject project = createWrongProjectFromTest001(name);
		URI uri = URI.createURI("platform:/resource/" + name + "/" + name + FacetTests.FILE_EXT);
		Resource resource = this.resourceSet.getResource(uri, true);
		FacetSet facetSet = (FacetSet) resource.getContents().get(0);
		Facet facet = (Facet) facetSet.getEClassifier("EClassFacet");
		facetSet.setName(name);
		FacetReference facetReference = (FacetReference) facet.getEStructuralFeature("subClasses");
		facetReference.setVolatile(false);
		resource.save(Collections.EMPTY_MAP);
		wrongX(name, project, 1);
	}

	// //@Test The error is automatically fixed by the meta-model implementation
	public void wrongRefContainment() throws Exception {
		String name = "wrongRefVolatile";
		IProject project = createWrongProjectFromTest001(name);
		URI uri = URI.createURI("platform:/resource/" + name + "/" + name + FacetTests.FILE_EXT);
		Resource resource = this.resourceSet.getResource(uri, true);
		FacetSet facetSet = (FacetSet) resource.getContents().get(0);
		Facet facet = (Facet) facetSet.getEClassifier("EClassFacet");
		facetSet.setName(name);
		FacetReference facetReference = (FacetReference) facet.getEStructuralFeature("subClasses");
		facetReference.setContainment(true);
		resource.save(Collections.EMPTY_MAP);
		wrongX(name, project, 1);
	}

	// //@Test The error is automatically fixed by the meta-model implementation
	public void wrongRefUnsettable() throws Exception {
		String name = "wrongRefUnsettable";
		IProject project = createWrongProjectFromTest001(name);
		URI uri = URI.createURI("platform:/resource/" + name + "/" + name + FacetTests.FILE_EXT);
		Resource resource = this.resourceSet.getResource(uri, true);
		FacetSet facetSet = (FacetSet) resource.getContents().get(0);
		Facet facet = (Facet) facetSet.getEClassifier("EClassFacet");
		facetSet.setName(name);
		FacetReference facetReference = (FacetReference) facet.getEStructuralFeature("subClasses");
		facetReference.setUnsettable(false);
		resource.save(Collections.EMPTY_MAP);
		wrongX(name, project, 1);
	}

	@Test
	public void wrongNbOfSuperType() throws Exception {
		String name = "wrongNbOfSuperType";
		IProject project = this.utils.createProject(name);
		FileUtils.copyFileFromBundle("resources/validation/" + name + FacetTests.FILE_EXT, project,
				"/" + name + FacetTests.FILE_EXT, Activator.getDefault().getBundle());
		// URI uri = URI.createURI("platform:/resource/" + name + "/" + name
		// + FacetTests.FILE_EXT);
		// Resource resource = this.resourceSet.getResource(uri, true);
		// FacetSet facetSet = (FacetSet) resource.getContents().get(0);
		// Facet facet = (Facet) facetSet.getEClassifier("EClassFacet");
		// facet.getESuperTypes().clear();
		// resource.save(Collections.EMPTY_MAP);
		// ProjectUtils.refresh(project);
		wrongX(name, project, 1);
	}

	@Test
	public void emptyNsURI() throws Exception {
		checkValidation("emptyNsURI");
	}

	@Test
	public void emptyNsPrefix() throws Exception {
		checkValidation("emptyNsPrefix");
	}

	@Test
	public void emptyExtendedPackages() throws Exception {
		checkValidation("emptyExtendedPackages");
	}

	private void checkValidation(final String name) throws Exception {
		IProject project = this.utils.createProject(name);
		FileUtils.copyFileFromBundle("resources/validation/" + name + FacetTests.FILE_EXT, project,
				"/" + name + FacetTests.FILE_EXT, Activator.getDefault().getBundle());
		wrongX(name, project, 1);
	}

	private IProject createWrongProjectFromTest001(final String name) throws Exception {
		IProject projectToCreate = this.utils.createProject(name);
		FileUtils.copyFileFromBundle("resources/test001.querySet", projectToCreate, "/" + name
				+ ".querySet", Activator.getDefault().getBundle());
		FileUtils.copyFileFromBundle("resources/test001" + FacetTests.FILE_EXT, projectToCreate,
				"/" + name + FacetTests.FILE_EXT, Activator.getDefault().getBundle());
		changeQuerySetName(name, projectToCreate);
		changeFacetsetName(name, projectToCreate);
		return projectToCreate;
	}

	private void changeQuerySetName(final String name, final IProject project) throws IOException {
		URI uri = URI.createURI("platform:/resource/" + project.getName() + "/" + name
				+ ".querySet");
		Resource r = this.resourceSet.getResource(uri, true);
		ModelQuerySet queryset = (ModelQuerySet) r.getContents().get(0);
		queryset.setName(name);
		r.save(Collections.EMPTY_MAP);
	}

	private void changeFacetsetName(final String name, final IProject project) throws IOException {
		URI uri = URI.createURI("platform:/resource/" + project.getName() + "/" + name
				+ FacetTests.FILE_EXT);
		Resource r = this.resourceSet.getResource(uri, true);
		FacetSet facetSet = (FacetSet) r.getContents().get(0);
		facetSet.setName(name);
		r.save(Collections.EMPTY_MAP);
	}

	private IMarker[] wrongX(final String name, final IProject project,
			final int nbOfExpectedMarkers) throws CoreException, InterruptedException {
		return wrongX(name, project, nbOfExpectedMarkers, ValidationJob.EMF_PROBLEM_MARKER);
	}

	private IMarker[] wrongX(final String name, final IProject project,
			final int nbOfExpectedMarkers, final String markerType) throws CoreException,
			InterruptedException {
		ProjectUtils.refresh(project);
		IMarker[] markers = null;
		FacetSetCatalog catalog = FacetSetCatalog.getSingleton();
		if (nbOfExpectedMarkers != 0) {
			Assert.assertNull(catalog.getFacetSet(name));
		}
		IFile file = project.getFile(name + FacetTests.FILE_EXT);
		markers = file.findMarkers(markerType, true, IResource.DEPTH_INFINITE);
		Assert.assertEquals("nbOfExpectedMarkers", nbOfExpectedMarkers, markers.length);
		return markers;
	}

	/**
	 * Assert that the number of markers (of any type) on the given FacetSet is
	 * equal to nbOfExpectedMarkers
	 */
	private IMarker[] expectXMarkers(final String name, final IProject project,
			final int nbOfExpectedMarkers) throws CoreException, InterruptedException {
		ProjectUtils.refresh(project);
		IMarker[] markers = null;
		FacetSetCatalog catalog = FacetSetCatalog.getSingleton();
		if (nbOfExpectedMarkers != 0) {
			Assert.assertNull(catalog.getFacetSet(name));
		}
		IFile file = project.getFile(name + FacetTests.FILE_EXT);
		markers = file.findMarkers(IMarker.PROBLEM, true, IResource.DEPTH_INFINITE);
		Assert.assertEquals("nbOfExpectedMarkers", nbOfExpectedMarkers, markers.length);
		return markers;
	}

	@Test
	public void compo() throws Exception {
		final String name = "compo";
		IProject projectToCreate = this.utils.createProject(name);
		IFile facetFile = FileUtils.copyFileFromBundle("resources/" + name + FacetTests.FILE_EXT,
				projectToCreate, "/" + name + FacetTests.FILE_EXT, Activator.getDefault()
						.getBundle());
		ProjectUtils.refresh(projectToCreate);
		FileUtils.checkNoMarkerOn(facetFile);
		// Create model 1
		URI uriR1 = URI.createURI("platform:/resource/" + name + "/r1.xmi");
		Resource r1 = this.resourceSet.createResource(uriR1);
		EClass eClass1 = EcoreFactory.eINSTANCE.createEClass();
		eClass1.setName("eClass1");
		r1.getContents().add(eClass1);
		r1.save(Collections.EMPTY_MAP);
		// Create model 2
		URI uriR2 = URI.createURI("platform:/resource/" + name + "/r2.xmi");
		Resource r2 = this.resourceSet.createResource(uriR2);
		EEnum eEnum1 = EcoreFactory.eINSTANCE.createEEnum();
		eEnum1.setName("eEnum2");
		r2.getContents().add(eEnum1);
		r2.save(Collections.EMPTY_MAP);
		// Create composed model
		URI compModelUri = URI.createURI("platform:/resource/" + name + "/compo.xmi");
		Resource compoModel = this.resourceSet.createResource(compModelUri);
		EPackage compMmPackage = EPackage.Registry.INSTANCE
				.getEPackage("http://www.eclipse.org/MoDisco/facet/test/compo");
		Assert.assertNotNull(compMmPackage);
		EClass eClassToEEnum = (EClass) compMmPackage.getEClassifier("EClassToEEnum");
		Assert.assertNotNull(compMmPackage.getEFactoryInstance());
		EObject eClassToEENumInst = compMmPackage.getEFactoryInstance().create(eClassToEEnum);
		eClassToEENumInst.eSet(eClassToEEnum.getEStructuralFeature("toEEnum"), eEnum1);
		eClassToEENumInst.eSet(eClassToEEnum.getEStructuralFeature("toEClass"), eClass1);
		compoModel.getContents().add(eClassToEENumInst);
		compoModel.save(Collections.EMPTY_MAP);
		// Request on the composed model
		FacetSet facetSet = FacetSetCatalog.getSingleton().getFacetSet("compo");
		FacetContext facetContext = new FacetContext();
		facetContext.addFacetSet(facetSet);
		facetContext.setResources(Collections.singleton(compoModel));
		Facet eClassExt = (Facet) facetSet.getEClassifier("ClassExt");
		Assert.assertNotNull(eClassExt);
		Assert.assertNotNull(eClassExt.getEStructuralFeature("toEClass2EEnum"));
		EObject eClass2EEnum1 = (EObject) facetContext.get(eClass1,
				eClassExt.getEStructuralFeature("toEClass2EEnum"));
		Assert.assertEquals(compoModel.getContents().get(0), eClass2EEnum1);
		EObject toEEnum = (EObject) facetContext.get(eClass1,
				eClassExt.getEStructuralFeature("toEEnum"));
		Assert.assertEquals(eEnum1, toEEnum);
		Facet eEnumExt = (Facet) facetSet.getEClassifier("EnumExt");
		EObject eClass2EEnum2 = (EObject) facetContext.get(eEnum1,
				eEnumExt.getEStructuralFeature("toEClass2EEnum"));
		Assert.assertEquals(compoModel.getContents().get(0), eClass2EEnum2);
		EObject toEClass = (EObject) facetContext.get(eEnum1,
				eEnumExt.getEStructuralFeature("toEClass"));
		Assert.assertEquals(eClass1, toEClass);
	}

	@Test
	public void bug301692() {
		URI uri = URI
				.createURI("platform:/plugin/org.eclipse.modisco.infra.facet.tests/resources/test001.facetSet");
		Resource r = this.resourceSet.getResource(uri, true);
		FacetSet fs = (FacetSet) r.getContents().get(0);
		Facet f = fs.getFacets().get(0);
		Assert.assertEquals(f.getFacetSet(), fs);
	}

	@Test
	public void bug305688() throws Exception {
		final String name = "test001";

		test001();

		FacetSet facetSet = FacetSetCatalog.getSingleton().getFacetSet(name);
		URI uri = URI.createURI("platform:/resource/" + name + "/2" + name + FacetTests.FILE_EXT);
		Resource r = this.resourceSet.createResource(uri);
		r.getContents().add(facetSet);
		r.save(Collections.EMPTY_MAP);
	}

	@Test
	public void bug307715() throws CoreException, IOException {
		final List<IStatus> statusList = new ArrayList<IStatus>();
		ILogListener listener = new ILogListener() {
			public void logging(final IStatus status, final String plugin) {
				statusList.add(status);
			}
		};
		ILog log = Platform.getLog(Platform.getBundle("org.eclipse.gmt.modisco.infra.facet.core"));
		log.addLogListener(listener);
		ProjectUtils.importPlugin(Platform.getBundle("org.eclipse.gmt.modisco.java.queries"),
				new IFilter() {
					public boolean filter(final Object object) {
						boolean result = true;
						if (object instanceof File) {
							File file = (File) object;
							result = !file.getName().equals(".checkstyle");
						} else if (object instanceof String) {
							String str = (String) object;
							result = !str.equals(".checkstyle");
						}
						return result;
					}
				});
		log.removeLogListener(listener);
		if (!statusList.isEmpty()) {
			MultiStatus status = new MultiStatus(Activator.getDefault().getBundle()
					.getSymbolicName(), IStatus.ERROR, statusList.toArray(new IStatus[] {}),
					"Test failed.", new Exception());
			throw new CoreException(status);
		}

	}

	/**
	 * Detects the problem only when it is launch in a clean workspace and
	 * without any other tests before.
	 *
	 * @throws CoreException
	 * @throws IOException
	 * @throws InterruptedException
	 */
	@Test
	public void bug307715v2() throws CoreException, IOException, InterruptedException {

		final List<IStatus> statusList = new ArrayList<IStatus>();
		ILogListener listener = new ILogListener() {
			public void logging(final IStatus status, final String plugin) {
				statusList.add(status);
			}
		};
		ILog log = Platform.getLog(Platform.getBundle("org.eclipse.gmt.modisco.infra.facet.core"));
		log.addLogListener(listener);
		// Clean the workspace
		ResourcesPlugin.getWorkspace().getRoot().delete(true, true, new NullProgressMonitor());
		ResourcesPlugin.getWorkspace().build(IncrementalProjectBuilder.CLEAN_BUILD,
				new NullProgressMonitor());
		joinJobs();
		// create the project org.eclipse.gmt.modisco.java.queries
		final IProject project = ResourcesPlugin.getWorkspace().getRoot()
				.getProject("org.eclipse.gmt.modisco.java.queries");
		ProjectUtils.create(project, new NullProgressMonitor());
		Bundle javaQueriesBundle = Platform.getBundle("org.eclipse.gmt.modisco.java.queries");
		// create the querySet
		FileUtils.copyFileFromBundle("META-INF/MANIFEST.MF", project, "META-INF/MANIFEST.MF",
				javaQueriesBundle);
		FolderUtils.copyFolderFromBundle("/src", javaQueriesBundle, "/src", project);
		FileUtils.copyFileFromBundle("textJavaQueries.querySet", project, "/"
				+ "textJavaQueries.querySet", javaQueriesBundle);
		// addWSFile querySet
		IFile f = project.getFile("textJavaQueries.querySet");
		// ModelQuerySetCatalog.getSingleton().addWSFile(f);
		ModelQuerySetCatalog.getSingleton().scheduleAddWSFile(f);
		// removeWSFile querySet
		// ModelQuerySetCatalog.getSingleton().removeWSFile(f);
		ModelQuerySetCatalog.getSingleton().scheduleRemoveWSFile(f);
		FacetSetCatalog.getSingleton();
		log.removeLogListener(listener);
		if (!statusList.isEmpty()) {
			MultiStatus status = new MultiStatus(Activator.getDefault().getBundle()
					.getSymbolicName(), IStatus.ERROR, statusList.toArray(new IStatus[] {}),
					"Test failed.", new Exception());
			CoreException e = new CoreException(status);
			MoDiscoLogger.logError(e, Activator.getDefault());
			throw e;
		}
	}

	@Test
	public void bug304798() throws Exception {
		String name = "bug304798";
		Bundle bundle = Activator.getDefault().getBundle();
		IProject project = ProjectUtils.createTestProject(name, bundle, ".");
		IFile queryFile = FileUtils.copyFileFromBundle("/resources/" + name + FacetTests.QUERY_EXT,
				project, "/" + name + FacetTests.QUERY_EXT, bundle);
		IFile facetFile = FileUtils.copyFileFromBundle("/resources/" + name + FacetTests.FILE_EXT,
				project, "/" + name + FacetTests.FILE_EXT, bundle);
		ProjectUtils.refresh(project);
		FileUtils.checkNoMarkerOn(queryFile);
		FileUtils.checkNoMarkerOn(facetFile);
		project.getFile(name + FacetTests.QUERY_EXT).delete(true, new NullProgressMonitor());
		ProjectUtils.refresh(project);
		// IFile facetFile = project.getFile(name + FacetTests.FILE_EXT);
		IMarker[] markers = facetFile.findMarkers(AbstractMoDiscoCatalog.BROKEN_REF_MARKER, true,
				IResource.DEPTH_INFINITE);
		Assert.assertTrue(markers.length > 0);
	}

	@Test
	public void bug308614() throws Exception {
		String name = "bug308614";
		Bundle bundle = Activator.getDefault().getBundle();
		IProject project = ProjectUtils.createTestProject(name, bundle, ".");
		FileUtils.copyFileFromBundle("/resources/" + name + "_1" + FacetTests.FILE_EXT, project,
				"/" + name + "_1" + FacetTests.FILE_EXT, bundle);
		FileUtils.copyFileFromBundle("/resources/" + name + "_2" + FacetTests.FILE_EXT, project,
				"/" + name + "_2" + FacetTests.FILE_EXT, bundle);
		ProjectUtils.refresh(project);
		IFile facetFile1 = project.getFile(name + "_1" + FacetTests.FILE_EXT);
		IMarker[] markers1 = facetFile1.findMarkers(EcoreCatalog.NS_URI_CONFLICT_MARKER, true,
				IResource.DEPTH_INFINITE);
		IFile facetFile2 = project.getFile(name + "_2" + FacetTests.FILE_EXT);
		IMarker[] markers2 = facetFile2.findMarkers(EcoreCatalog.NS_URI_CONFLICT_MARKER, true,
				IResource.DEPTH_INFINITE);
		Assert.assertEquals(1, markers1.length + markers2.length);
		project.build(IncrementalProjectBuilder.CLEAN_BUILD, new NullProgressMonitor());
		project.build(IncrementalProjectBuilder.FULL_BUILD, new NullProgressMonitor());
		joinJobs();
		markers1 = facetFile1.findMarkers(EcoreCatalog.NS_URI_CONFLICT_MARKER, true,
				IResource.DEPTH_INFINITE);
		markers2 = facetFile2.findMarkers(EcoreCatalog.NS_URI_CONFLICT_MARKER, true,
				IResource.DEPTH_INFINITE);
		Assert.assertEquals(1, markers1.length + markers2.length);
	}

	@Test
	public void bug308947() throws CoreException, IOException, InterruptedException {

		final List<IStatus> statusList = new ArrayList<IStatus>();
		ILogListener listener = new ILogListener() {
			public void logging(final IStatus status, final String plugin) {
				statusList.add(status);
			}
		};
		ILog log = Platform.getLog(Platform.getBundle("org.eclipse.gmt.modisco.infra.facet.core"));
		log.addLogListener(listener);
		String pluginName = "org.eclipse.gmt.modisco.infra.browser.custom.examples.java.jdk";
		ProjectUtils.importPlugin(Platform.getBundle(pluginName), new IFilter() {
			public boolean filter(final Object object) {
				boolean result = true;
				if (object instanceof File) {
					File file = (File) object;
					result = !file.getName().equals(".checkstyle");
				} else if (object instanceof String) {
					String str = (String) object;
					result = !str.equals(".checkstyle");
				}
				return result;
			}
		});
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(pluginName);
		ProjectUtils.refresh(project);
		project.close(new NullProgressMonitor());
		joinJobs();
		project.open(new NullProgressMonitor());
		ProjectUtils.refresh(project);
		log.removeLogListener(listener);
		if (!statusList.isEmpty()) {
			MultiStatus status = new MultiStatus(Activator.getDefault().getBundle()
					.getSymbolicName(), IStatus.ERROR, statusList.toArray(new IStatus[] {}),
					"Test failed.", new Exception());
			CoreException e = new CoreException(status);
			MoDiscoLogger.logError(e, Activator.getDefault());
			throw e;
		}
	}

	private void joinJobs() throws InterruptedException {
		Job.getJobManager().join(ResourcesPlugin.FAMILY_MANUAL_REFRESH, null);
		Job.getJobManager().join(ResourcesPlugin.FAMILY_AUTO_REFRESH, null);
		Job.getJobManager().join(ResourcesPlugin.FAMILY_MANUAL_BUILD, null);
		Job.getJobManager().join(ResourcesPlugin.FAMILY_AUTO_BUILD, null);
	}

	@Test
	public void bug309657() throws Exception {
		final String name = "bug309657";
		IProject project = this.utils.createProject(name);
		FileUtils.copyFileFromBundle("resources/" + name + FacetTests.FILE_EXT, project, name
				+ FacetTests.FILE_EXT, Activator.getDefault().getBundle());
		ProjectUtils.refresh(project);
		IFolder folder = project.getFolder("f1");
		folder.create(true, true, new NullProgressMonitor());
		IFile sourceFile = project.getFile(name + FacetTests.FILE_EXT);
		IPath sourcePath = sourceFile.getFullPath();
		IPath targetPath = new Path(folder.getFullPath() + "/" + name + FacetTests.FILE_EXT);
		sourceFile.move(targetPath, true, new NullProgressMonitor());
		ProjectUtils.refresh(project);
		IFile targetFile = ResourcesPlugin.getWorkspace().getRoot().getFile(targetPath);
		IMarker[] markers = targetFile.findMarkers(AbstractMoDiscoCatalog.PROBLEM_MARKER, true,
				IResource.DEPTH_INFINITE);
		Assert.assertEquals(0, markers.length);
		targetFile.move(sourcePath, true, new NullProgressMonitor());
		ProjectUtils.refresh(project);
		markers = sourceFile.findMarkers(AbstractMoDiscoCatalog.PROBLEM_MARKER, true,
				IResource.DEPTH_INFINITE);
		Assert.assertEquals(0, markers.length);
	}

	/**
	 * Check that when we change the nsURI of an Ecore file the old nsURI is
	 * removed from the EPackage.Registry. Check that when we remove an ecore
	 * file the corresponding EPackage is removed from the EPackage.Registry
	 *
	 * @throws Exception
	 */
	@Test
	public void bug309990() throws Exception {
		final String name = "bug309990";
		String nsURI = "http://www.eclipse.org/MoDisco/facet/bug309990";
		Assert.assertNull(EPackage.Registry.INSTANCE.get(nsURI));
		IProject project = ProjectUtils.createTestProject(name, Activator.getDefault().getBundle(),
				".");
		FileUtils.copyFileFromBundle("resources/" + name + FacetTests.FILE_EXT, project, name
				+ FacetTests.FILE_EXT, Activator.getDefault().getBundle());
		ProjectUtils.refresh(project);
		Assert.assertNotNull(EPackage.Registry.INSTANCE.get(nsURI));
		FileUtils.copyFileFromBundle("resources/" + name + "_bis" + FacetTests.FILE_EXT, project,
				name + FacetTests.FILE_EXT, Activator.getDefault().getBundle());
		ProjectUtils.refresh(project);
		Assert.assertNotNull(EPackage.Registry.INSTANCE.get(nsURI + "_bis"));
		Assert.assertNull(EPackage.Registry.INSTANCE.get(nsURI));
		project.getFile(name + FacetTests.FILE_EXT).delete(true, new NullProgressMonitor());
		ProjectUtils.refresh(project);
		Assert.assertNull(EPackage.Registry.INSTANCE.get(nsURI + "_bis"));
	}

	/** Bug 310279 - Only 1 listener works per referenced resource */
	@Test
	public void bug310279() throws Exception {
		IProject project = this.utils.createProject("310279");

		FileUtils.copyFileFromBundle("src/Bug310279.java", project, "src/Bug310279.java", Activator
				.getDefault().getBundle());
		FileUtils.copyFileFromBundle("resources/bug310279_1" + FacetTests.FILE_EXT, project,
				"bug310279_1" + FacetTests.FILE_EXT, Activator.getDefault().getBundle());
		FileUtils.copyFileFromBundle("resources/bug310279_2" + FacetTests.FILE_EXT, project,
				"bug310279_2" + FacetTests.FILE_EXT, Activator.getDefault().getBundle());
		FileUtils.copyFileFromBundle("resources/bug310279" + FacetTests.QUERY_EXT, project,
				"bug310279" + FacetTests.QUERY_EXT, Activator.getDefault().getBundle());
		ProjectUtils.refresh(project);
		joinJobs();
		expectXMarkers("bug310279_1", project, 0);
		expectXMarkers("bug310279_2", project, 0);

		FileUtils.copyFileFromBundle("resources/bug310279_2" + FacetTests.QUERY_EXT, project,
				"bug310279" + FacetTests.QUERY_EXT, Activator.getDefault().getBundle());
		ProjectUtils.refresh(project);
		joinJobs();
		expectXMarkers("bug310279_1", project, 1);
		expectXMarkers("bug310279_2", project, 1);
	}

	/** Bug 310279 - Only 1 listener works per referenced resource */
	@Test
	public void bug310279_3() throws Exception {
		if (Platform.inDebugMode()) {
			System.out.println("--- bug310279 ---");
		}
		IProject project = this.utils.createProject("310279");

		FileUtils.copyFileFromBundle("resources/bug310279_1" + FacetTests.FILE_EXT, project,
				"bug310279_1" + FacetTests.FILE_EXT, Activator.getDefault().getBundle());
		FileUtils.copyFileFromBundle("resources/bug310279_2" + FacetTests.FILE_EXT, project,
				"bug310279_2" + FacetTests.FILE_EXT, Activator.getDefault().getBundle());
		FileUtils.copyFileFromBundle("resources/bug310279_3" + FacetTests.QUERY_EXT, project,
				"bug310279" + FacetTests.QUERY_EXT, Activator.getDefault().getBundle());
		if (Platform.inDebugMode()) {
			System.out.println("--- bug310279 -> refresh ---");
		}
		ProjectUtils.refresh(project);
		joinJobs();
		IFile query = project.getFile("bug310279" + FacetTests.QUERY_EXT);
		IMarker[] queryFileMarkers = query.findMarkers(AbstractMoDiscoCatalog.PROBLEM_MARKER, true,
				IResource.DEPTH_INFINITE);
		Assert.assertEquals(0, queryFileMarkers.length);
		FacetSet fs1 = FacetSetCatalog.getSingleton().getFacetSet("bug310279_1");
		Assert.assertNotNull(fs1);
		FacetSet fs2 = FacetSetCatalog.getSingleton().getFacetSet("bug310279_2");
		Assert.assertNotNull(fs2);
		if (Platform.inDebugMode()) {
			System.out.println("--- update ---");
		}
		FileUtils.copyFileFromBundle("resources/bug310279_2" + FacetTests.QUERY_EXT, project,
				"bug310279" + FacetTests.QUERY_EXT, Activator.getDefault().getBundle());
		ProjectUtils.refresh(project);
		joinJobs();
		wrongX("bug310279_1", project, 1, AbstractMoDiscoCatalog.BROKEN_REF_MARKER);
		wrongX("bug310279_2", project, 1, AbstractMoDiscoCatalog.BROKEN_REF_MARKER);
	}

	/**
	 * Bug 311684 - dependencies not revalidated when replacing a workspace
	 * query by a registered one
	 */
	@Test
	public void bug311684() throws Exception {
		IProject project = FacetTests.this.utils.createProject("311684");
		FileUtils.copyFileFromBundle("src/Bug311684.java", project, "src/Bug311684.java", Activator
				.getDefault().getBundle());
		IFile queryFile = FileUtils.copyFileFromBundle("resources/bug311684_workspace"
				+ FacetTests.QUERY_EXT, project, "bug311684" + FacetTests.QUERY_EXT, Activator
				.getDefault().getBundle());
		FileUtils.copyFileFromBundle("resources/bug311684" + FacetTests.FILE_EXT, project,
				"bug311684" + FacetTests.FILE_EXT, Activator.getDefault().getBundle());

		FacetSetCatalog.getSingleton().waitUntilBuilt();
		wrongX("bug311684", project, 1, IMarker.PROBLEM);
		queryFile.delete(false, new NullProgressMonitor());
		FacetSetCatalog.getSingleton().waitUntilBuilt();
		wrongX("bug311684", project, 0, IMarker.PROBLEM);
	}

}
