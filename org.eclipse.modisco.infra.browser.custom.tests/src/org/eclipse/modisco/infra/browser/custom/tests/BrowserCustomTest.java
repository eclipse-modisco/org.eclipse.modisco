/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *    Gregoire DUPE (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.custom.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.modisco.infra.browser.custom.CustomViewFeature;
import org.eclipse.modisco.infra.browser.custom.CustomizableFeatures;
import org.eclipse.modisco.infra.browser.custom.DerivedFeatureValue;
import org.eclipse.modisco.infra.browser.custom.MetamodelView;
import org.eclipse.modisco.infra.browser.custom.StaticFeatureValue;
import org.eclipse.modisco.infra.browser.custom.TypeView;
import org.eclipse.modisco.infra.browser.custom.core.CustomizationsCatalog;
import org.eclipse.modisco.infra.browser.uicore.internal.AppearanceConfiguration;
import org.eclipse.modisco.infra.browser.uicore.internal.customization.CustomizationEngine;
import org.eclipse.modisco.infra.browser.uicore.internal.model.AttributeItem;
import org.eclipse.modisco.infra.browser.uicore.internal.model.ItemsFactory;
import org.eclipse.modisco.infra.browser.uicore.internal.model.ModelElementItem;
import org.eclipse.modisco.infra.common.core.internal.builder.AbstractMoDiscoCatalog;
import org.eclipse.modisco.infra.common.core.internal.utils.FileUtils;
import org.eclipse.modisco.infra.common.core.internal.utils.ProjectUtils;
import org.eclipse.modisco.infra.facet.FacetAttribute;
import org.eclipse.modisco.infra.facet.FacetSet;
import org.eclipse.modisco.infra.facet.core.FacetSetCatalog;
import org.eclipse.modisco.infra.query.ModelQuery;
import org.eclipse.modisco.infra.query.ModelQuerySet;
import org.eclipse.modisco.infra.query.core.AbstractModelQuery;
import org.eclipse.modisco.infra.query.core.ModelQuerySetCatalog;
import org.eclipse.modisco.infra.query.core.exception.ModelQueryException;
import org.eclipse.swt.widgets.Display;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

@SuppressWarnings({ "restriction", "nls" })
public class BrowserCustomTest {

	public static final String FILE_EXT = "."
			+ CustomizationsCatalog.FILE_EXTENSION;

	/** Basic test for uiCustom */
	@Test
	public void testUICustom() throws Exception {
		CustomizationEngine customizationEngine = new CustomizationEngine();
		customizationEngine
				.registerCustomization(getCustomization("testCustomization"));
		customizationEngine.loadCustomizations();
		EPackage ePackage = EPackage.Registry.INSTANCE
				.getEPackage("http://www.eclipse.org/emf/2002/Ecore");
		EClass someEClass = (EClass) ePackage.getEClassifier("EOperation");
		Assert.assertTrue(customizationEngine.isTypeUnderlined(
				someEClass.eClass(), someEClass));
		Assert.assertFalse(customizationEngine.isTypeStruckthrough(
				someEClass.eClass(), someEClass));
	}

	/** Test uiCustom condition (with query) */
	@Test
	public void testUICustomWithCondition() throws Exception {
		refreshWorkspace();
		ModelQuerySetCatalog.getSingleton();
		// ModelQuerySet modelQuerySet =
		// ModelQuerySetCatalog.getSingleton().getModelQuerySet("testCustomization");
		// ModelQuery query =
		// modelQuerySet.getQuery("doesEClassNameStartWithEP");
		// JavaModelQuery javaModelQuery = (JavaModelQuery) query;
		//
		// AbstractModelQuery myModelQuery = ModelQuerySetCatalog.getSingleton()
		// .getModelQueryImpl(javaModelQuery);
		//
		CustomizationEngine customizationEngine = new CustomizationEngine();
		customizationEngine
				.registerCustomization(getCustomization("testCustomization"));
		customizationEngine.loadCustomizations();
		EPackage ePackage = EPackage.Registry.INSTANCE
				.getEPackage("http://www.eclipse.org/emf/2002/Ecore");

		EClass classFalse = (EClass) ePackage.getEClassifier("EOperation");
		EClass classTrue = (EClass) ePackage.getEClassifier("EPackage");
		// the query is "name starts with 'EP'"

		Assert.assertFalse("shouldn't be struckthrough", customizationEngine
				.isTypeStruckthrough(classFalse.eClass(), classFalse));
		Assert.assertTrue("should be struckthrough", customizationEngine
				.isTypeStruckthrough(classTrue.eClass(), classTrue));

		// doesn't work reliably on build.eclipse.org
		/*
		 * Color typeColorFalse = customizationEngine.getTypeColor(classFalse);
		 * Assert.assertTrue(typeColorFalse == null);
		 *
		 * final Color typeColorTrue =
		 * customizationEngine.getTypeColor(classTrue);
		 * Assert.assertTrue(typeColorTrue != null);
		 * Display.getDefault().syncExec(new Runnable() { public void run() {
		 * Assert
		 * .assertTrue(Display.getDefault().getSystemColor(SWT.COLOR_RED).getRGB
		 * () .equals(typeColorTrue.getRGB())); } });
		 */
	}

	/**
	 * Check that the class Display can be used.
	 */
	@Test
	public void checkDisplay() {
		Display.getCurrent();
	}

	/**
	 * Test that a customization in the workspace takes precedence over a
	 * customization with the same name from the registry.
	 */
	@SuppressWarnings("null")
	@Test
	public void testWorkspaceCustomizationHidesRegistryCustomization()
			throws Exception {
		refreshWorkspace();
		IProject project = ResourcesPlugin
				.getWorkspace()
				.getRoot()
				.getProject(
						"testWorkspaceCustomizationHidesRegistryCustomization");
		ProjectUtils.create(project, new NullProgressMonitor());
		FileUtils.copyFileFromBundle("workspaceCustomization.uiCustom",
				project, "testCustomization.uiCustom", Activator.getDefault()
						.getBundle());
		ResourcesPlugin.getWorkspace().build(
				IncrementalProjectBuilder.CLEAN_BUILD,
				new NullProgressMonitor());
		ProjectUtils.refresh(project);
		CustomizationsCatalog.getInstance().waitUntilBuilt();
		MetamodelView customization = null;
		Collection<MetamodelView> allCustomizations = CustomizationsCatalog
				.getInstance().getAllCustomizations();
		for (MetamodelView metamodelView : allCustomizations) {
			if ("testCustomization".equals(metamodelView.getName())) {
				Assert.assertTrue("several customizations with the same name",
						customization == null);
				customization = metamodelView;
			}
		}
		try {
			EList<TypeView> types = customization.getTypes();
			boolean found = false;
			for (TypeView typeView : types) {
				if ("ecore.EParameter".equals(typeView.getMetaclassName())) {
					found = true;
					CustomViewFeature customViewFeature;
					customViewFeature = typeView.getCustomizedFeatures().get(0);
					Assert.assertTrue(customViewFeature.getCustomizedFeature() == CustomizableFeatures.LABEL);
					StaticFeatureValue defaultValue = (StaticFeatureValue) customViewFeature
							.getDefaultValue();
					Assert.assertTrue(defaultValue
							.getValue()
							.equals("testWorkspaceCustomizationHidesRegistryCustomization"));
				}
			}
			Assert.assertTrue("Customization for ecore.EParameter not found",
					found);
		} catch (Exception e) {
			ResourceSet rs = new ResourceSetImpl();
			Resource r = rs.createResource(URI.createURI("tmp://"
					+ System.currentTimeMillis()));
			r.getContents().add(customization);
			ByteArrayOutputStream outputstream = new ByteArrayOutputStream();
			r.save(outputstream, Collections.emptyMap());
			throw new RuntimeException(outputstream.toString(), e);
		}
	}

	private void refreshWorkspace() throws CoreException {
		ResourcesPlugin
				.getWorkspace()
				.getRoot()
				.refreshLocal(IResource.DEPTH_INFINITE,
						new NullProgressMonitor());
	}

	/**
	 * Bug 304018 - Customization of inherited properties displayed in the
	 * browser
	 * <p>
	 * Test that an attribute or reference can be customized on a subtype.
	 * <p>
	 * The customization defines that NamedElement#name is underlined, and
	 * EClass#name is not.
	 */
	@Test
	public void testBug304018() {
		CustomizationEngine customizationEngine = new CustomizationEngine();
		customizationEngine
				.registerCustomization(getCustomization("testBug304018"));
		customizationEngine.loadCustomizations();

		EClass anEClass = EcoreFactory.eINSTANCE.createEClass();
		EPackage anEPackage = EcoreFactory.eINSTANCE.createEPackage();

		Assert.assertFalse(customizationEngine.isAttributeUnderlined(
				anEClass.eClass(), "name", anEClass));
		Assert.assertTrue(customizationEngine.isAttributeUnderlined(
				anEPackage.eClass(), "name", anEPackage));
	}

	@Test
	public void testBug299277() throws CoreException, IOException,
			InterruptedException, ModelQueryException {
		// CustomizationsCatalog.getInstance();
		String projectName = "testBug299277";
		IProject project = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(projectName);
		ProjectUtils.create(project, new NullProgressMonitor());
		FileUtils.copyFileFromBundle(Activator.getDefault().getBundle()
				.getSymbolicName()
				+ BrowserCustomTest.FILE_EXT, project, Activator.getDefault()
				.getBundle().getSymbolicName()
				+ BrowserCustomTest.FILE_EXT, Activator.getDefault()
				.getBundle());
		ResourcesPlugin.getWorkspace().build(
				IncrementalProjectBuilder.CLEAN_BUILD,
				new NullProgressMonitor());
		ProjectUtils.refresh(project);
		MetamodelView metamodelView = null;
		Assert.assertTrue(CustomizationsCatalog.getInstance()
				.getWorkspaceCustomizations().size() >= 1);
		StringBuffer listOfWorkspaceCustomization = new StringBuffer();
		Iterator<MetamodelView> iter = CustomizationsCatalog.getInstance()
				.getWorkspaceCustomizations().iterator();
		while (iter.hasNext()) {
			MetamodelView currentMetamodelView = iter.next();
			listOfWorkspaceCustomization.append(currentMetamodelView.getName());
			if (currentMetamodelView.getName().equals(
					Activator.getDefault().getBundle().getSymbolicName())) {
				metamodelView = currentMetamodelView;
			}
		}
		if (metamodelView == null) {
			throw new RuntimeException(Activator.getDefault().getBundle()
					.getSymbolicName()
					+ "not found. Available customizations are : \n"
					+ listOfWorkspaceCustomization.toString());
		}
		Assert.assertNotNull(metamodelView);
		DerivedFeatureValue derivedFeatureValue = (DerivedFeatureValue) metamodelView
				.getTypes().get(0).getCustomizedFeatures().get(0)
				.getDefaultValue();
		ModelQuery modelQuery = derivedFeatureValue.getValueCalculator();

		ModelQuerySetCatalog catalog = ModelQuerySetCatalog.getSingleton();
		AbstractModelQuery myModelQuery = catalog.getModelQueryImpl(modelQuery);
		String result = (String) myModelQuery.basicEvaluate(modelQuery);
		Assert.assertEquals(
				"org.eclipse.modisco.infra.browser.custom.tests", result);
	}

	/**
	 * Check that a query referenced by a customization is the same physical
	 * object as a query with the same name from the catalog.
	 */
	@Test
	public void test001() throws CoreException, IOException,
			InterruptedException {
		String projectName = "test001";
		IProject project = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(projectName);
		ProjectUtils.create(project, new NullProgressMonitor());
		FileUtils.copyFileFromBundle(Activator.getDefault().getBundle()
				.getSymbolicName()
				+ BrowserCustomTest.FILE_EXT, project, Activator.getDefault()
				.getBundle().getSymbolicName()
				+ BrowserCustomTest.FILE_EXT, Activator.getDefault()
				.getBundle());
		ResourcesPlugin.getWorkspace().build(
				IncrementalProjectBuilder.CLEAN_BUILD,
				new NullProgressMonitor());
		ProjectUtils.refresh(project);
		CustomizationsCatalog.getInstance().waitUntilBuilt();
		MetamodelView metamodelView = null;
		Assert.assertTrue(CustomizationsCatalog.getInstance()
				.getWorkspaceCustomizations().size() >= 1);
		Iterator<MetamodelView> iter = CustomizationsCatalog.getInstance()
				.getWorkspaceCustomizations().iterator();
		while (iter.hasNext()) {
			MetamodelView currentMetamodelView = iter.next();
			if (currentMetamodelView.getName().equals(
					Activator.getDefault().getBundle().getSymbolicName())) {
				metamodelView = currentMetamodelView;
			}
		}
		Assert.assertNotNull(metamodelView);
		@SuppressWarnings("null")
		DerivedFeatureValue derivedFeatureValue = (DerivedFeatureValue) metamodelView
				.getTypes().get(0).getCustomizedFeatures().get(0)
				.getDefaultValue();
		ModelQuery modelQuery = derivedFeatureValue.getValueCalculator();
		ModelQuerySetCatalog modelQuerySetCatalog = ModelQuerySetCatalog
				.getSingleton();
		ModelQuerySet modelQuerySet2 = modelQuerySetCatalog
				.getModelQuerySet(modelQuery.getModelQuerySet().getName());
		ModelQuery modelQuery2 = modelQuerySet2.getQuery(modelQuery.getName());
		// This checks that a query is represented by a unique object.
		Assert.assertEquals(modelQuery2, modelQuery);
	}

	private MetamodelView getCustomization(final String name) {
		Collection<MetamodelView> allCustomizations = CustomizationsCatalog
				.getInstance().getAllCustomizations();
		for (MetamodelView metamodelView : allCustomizations) {
			if (name.equals(metamodelView.getName())) {
				return metamodelView;
			}
		}
		throw new IllegalStateException("Customization not found: " + name);
	}

	private FacetSet getFacetSet(final String name) {
		FacetSet facetSet = FacetSetCatalog.getSingleton().getFacetSet(name);
		if (facetSet != null) {
			return facetSet;
		}
		throw new IllegalStateException("FacetSet not found: " + name);
	}

	/**
	 * Bug 309657 - Moving facet or query models generates wrong problem
	 * messages
	 */
	@Test
	public void bug309657() throws Exception {
		final String name = "bug309657"; //$NON-NLS-1$
		IProject project = ProjectUtils.createTestProject(name,
				org.eclipse.modisco.infra.browser.custom.tests.Activator
						.getDefault().getBundle(), ".");
		FileUtils.copyFileFromBundle(name + BrowserCustomTest.FILE_EXT,
				project, name + BrowserCustomTest.FILE_EXT, Activator
						.getDefault().getBundle());
		ProjectUtils.refresh(project);
		IFolder folder = project.getFolder("f1"); //$NON-NLS-1$
		folder.create(true, true, new NullProgressMonitor());
		IFile sourceFile = project.getFile(name + BrowserCustomTest.FILE_EXT);
		IPath sourcePath = sourceFile.getFullPath();
		IPath targetPath = new Path(folder.getFullPath() + "/" + name //$NON-NLS-1$
				+ BrowserCustomTest.FILE_EXT);
		sourceFile.move(targetPath, true, new NullProgressMonitor());
		ProjectUtils.refresh(project);
		IFile targetFile = ResourcesPlugin.getWorkspace().getRoot()
				.getFile(targetPath);
		IMarker[] markers = targetFile.findMarkers(
				AbstractMoDiscoCatalog.PROBLEM_MARKER, true,
				IResource.DEPTH_INFINITE);
		Assert.assertEquals(0, markers.length);
		targetFile.move(sourcePath, true, new NullProgressMonitor());
		ProjectUtils.refresh(project);
		markers = sourceFile.findMarkers(AbstractMoDiscoCatalog.PROBLEM_MARKER,
				true, IResource.DEPTH_INFINITE);
		Assert.assertEquals(0, markers.length);
	}

	// @Test
	// public void uniqueName() throws Exception {
	//		String name = "uniqueName"; //$NON-NLS-1$
	// wrongX(name, 2);
	// }

	// private IMarker[] wrongX(final String name, final int
	// nbOfExpectedMarkers) throws Exception {
	// IMarker[] markers = null;
	// IProject projectToCreate = this.utils.createProject(name);
	//		FileUtils.copyFileFromBundle("resources/validation/" + name //$NON-NLS-1$
	// + UnitTests.FILE_EXT, projectToCreate, name + UnitTests.FILE_EXT,
	// Activator
	// .getDefault().getBundle());
	// ProjectUtils.refresh(projectToCreate);
	// ModelQuerySetCatalog catalog = ModelQuerySetCatalog.getSingleton();
	// Assert.assertEquals(null, catalog.getModelQuerySet(name));
	// IFile file = projectToCreate.getFile(name + UnitTests.FILE_EXT);
	// markers = file
	// .findMarkers(ValidationJob.EMF_PROBLEM_MARKER, true,
	// IResource.DEPTH_INFINITE);
	// if (nbOfExpectedMarkers != markers.length) {
	// StringBuilder errorMessage = new StringBuilder();
	// errorMessage.append("Wrong number of markers. Expected " +
	// nbOfExpectedMarkers
	// + ", got " + markers.length + ":\n");
	// for (IMarker marker : markers) {
	// errorMessage.append(marker.getAttribute("message") + "\n");
	// }
	// Assert.assertTrue(errorMessage.toString(), false);
	// }
	// return markers;
	// }

	@Test
	public void modiscoProtocol() {
		URI uri = URI.createURI("modisco:/customization/testCustomization"); //$NON-NLS-1$
		ResourceSetImpl resourceSet = new ResourceSetImpl();
		Resource r = resourceSet.getResource(uri, true);
		EObject root = r.getContents().get(0);
		Assert.assertTrue(
				"A MetamodelView instance is expected as root element.", root instanceof MetamodelView); //$NON-NLS-1$
		MetamodelView metamodelView = (MetamodelView) root;
		Assert.assertEquals("testCustomization", metamodelView.getName()); //$NON-NLS-1$
	}

	/**
	 * Bug 306724 - deleting a project containing a query set does not remove
	 * the query set from its catalog
	 */
	@Test
	public void bug306724() throws Exception {
		String name = "bug306724"; //$NON-NLS-1$
		IProject project = ProjectUtils.createTestProject(name, Activator
				.getDefault().getBundle(), ".");
		FileUtils.copyFileFromBundle(name + BrowserCustomTest.FILE_EXT, //$NON-NLS-1$
				project, name + BrowserCustomTest.FILE_EXT, Activator
						.getDefault().getBundle());
		ProjectUtils.refresh(project);
		CustomizationsCatalog.getInstance().waitUntilBuilt();
		MetamodelView customization = (MetamodelView) CustomizationsCatalog
				.getInstance().getRootObject(name);
		Assert.assertNotNull(customization);
		project.close(new NullProgressMonitor());
		CustomizationsCatalog.getInstance().waitUntilBuilt();
		customization = (MetamodelView) CustomizationsCatalog.getInstance()
				.getRootObject(name);
		Assert.assertNull(customization);
		project.open(new NullProgressMonitor());
		CustomizationsCatalog.getInstance().waitUntilBuilt();
		customization = (MetamodelView) CustomizationsCatalog.getInstance()
				.getRootObject(name);
		Assert.assertNotNull(customization);
		project.delete(true, new NullProgressMonitor());
		CustomizationsCatalog.getInstance().waitUntilBuilt();
		customization = (MetamodelView) CustomizationsCatalog.getInstance()
				.getRootObject(name);
		Assert.assertNull(customization);
	}

	/**
	 * Bug 307187 - AbstractMoDiscoCatalog and name conflicts : If two
	 * customizations have the same name, only one will be registered in the
	 * catalog and the user will never be informed about this problem.
	 */
	@Test
	public void bug307187() throws Exception {
		final String name = "bug307187"; //$NON-NLS-1$
		final String dir1 = "1/"; //$NON-NLS-1$
		final String dir2 = "2/"; //$NON-NLS-1$
		IProject project = ProjectUtils.createTestProject(name, Activator
				.getDefault().getBundle(), ".");
		FileUtils.copyFileFromBundle(name + BrowserCustomTest.FILE_EXT, //$NON-NLS-1$
				project, dir1 + name + BrowserCustomTest.FILE_EXT, Activator
						.getDefault().getBundle());
		FileUtils.copyFileFromBundle(name + BrowserCustomTest.FILE_EXT, //$NON-NLS-1$
				project, dir2 + name + BrowserCustomTest.FILE_EXT, Activator
						.getDefault().getBundle());
		ProjectUtils.refresh(project);
		CustomizationsCatalog.getInstance().waitUntilBuilt();
		IFile customizationFile1 = project.getFile(new Path(dir1 + name
				+ BrowserCustomTest.FILE_EXT));
		IFile customizationFile2 = project.getFile(new Path(dir2 + name
				+ BrowserCustomTest.FILE_EXT));
		IMarker[] markers1 = customizationFile1.findMarkers(null, true,
				IResource.DEPTH_INFINITE);
		IMarker[] markers2 = customizationFile2.findMarkers(null, true,
				IResource.DEPTH_INFINITE);
		Assert.assertEquals(1, markers1.length + markers2.length);
	}

	/**
	 * Bug 336502 - Browser customization: "is Visible" and "collapse link"
	 * attributes are not taken into account for a Facet
	 */
	@Test
	public void bug336502() throws Exception {
		ModelQuerySetCatalog.getSingleton();

		CustomizationEngine customizationEngine = new CustomizationEngine();
		customizationEngine
				.registerCustomization(getCustomization("testBug304018"));
		customizationEngine.loadCustomizations();
		EPackage ePackage = EPackage.Registry.INSTANCE
				.getEPackage("http://www.eclipse.org/emf/2002/Ecore");
		EClass anEclass = (EClass) ePackage.getEClassifier("EOperation");

		AppearanceConfiguration appearanceConfiguration = new AppearanceConfiguration(
				new ItemsFactory());
		appearanceConfiguration.setShowAttributes(true);

		appearanceConfiguration.getFacetContext().addFacetSet(
				getFacetSet("bug336502"));
		appearanceConfiguration.getCustomizationEngine().registerCustomization(
				getCustomization("bug336502"));
		appearanceConfiguration.getCustomizationEngine().loadCustomizations();

		ModelElementItem modelElementItem = new ModelElementItem(anEclass,
				null, appearanceConfiguration);
		List<Object> children = modelElementItem.getChildren();

		boolean foundSelf = false;
		for (Object object : children) {
			if (object instanceof ModelElementItem) {
				ModelElementItem elementItem = (ModelElementItem) object;
				if (elementItem.getEObject() == anEclass) {
					foundSelf = true;
				}
			}
			if (object instanceof AttributeItem) {
				AttributeItem attributeItem = (AttributeItem) object;
				if (attributeItem.getAttribute() instanceof FacetAttribute) {
					fail("The customization should hide the FacetAttribute");
				}
			}
		}

		assertTrue(
				"The element should appear directly in its own children with 'collapse links' on a FacetReference with the 'identity' query",
				foundSelf);
	}

	/** Bug 341222 - customization on feature defined in another metamodel */
	@Test
	public void bug341222() throws Exception {
		final String umlPackageURI = "http://www.eclipse.org/uml2/3.0.0/UML";
		CustomizationEngine customizationEngine = new CustomizationEngine();
		customizationEngine
				.registerCustomization(getCustomization("bug341222"));
		customizationEngine.registerMetamodel(umlPackageURI);
		customizationEngine.loadCustomizations();
		EPackage umlPackage = EPackage.Registry.INSTANCE
				.getEPackage(umlPackageURI);
		EClass anEclass = (EClass) umlPackage.getEClassifier("Class");
		assertTrue(
				"customization defined on ecore.EModelElement should also apply to uml.Class",
				customizationEngine.isReferenceUnderlined(anEclass,
						"eAnnotations", null));
	}
}
