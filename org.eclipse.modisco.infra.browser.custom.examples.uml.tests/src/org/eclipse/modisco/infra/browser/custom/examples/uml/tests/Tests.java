/*******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.custom.examples.uml.tests;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.ILogListener;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.modisco.infra.common.core.internal.utils.FileUtils;
import org.eclipse.modisco.infra.common.core.internal.utils.IFilter;
import org.eclipse.modisco.infra.common.core.internal.utils.ProjectUtils;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.facet.Facet;
import org.eclipse.modisco.infra.facet.FacetReference;
import org.eclipse.modisco.infra.facet.FacetSet;
import org.eclipse.modisco.infra.facet.core.FacetContext;
import org.eclipse.modisco.infra.facet.core.FacetSetCatalog;
import org.eclipse.modisco.infra.facet.core.exception.ModiscoFacetException;
import org.eclipse.modisco.infra.query.ModelQuery;
import org.eclipse.modisco.infra.query.ModelQuerySet;
import org.eclipse.modisco.infra.query.core.AbstractModelQuery;
import org.eclipse.modisco.infra.query.core.ModelQuerySetCatalog;
import org.eclipse.modisco.infra.query.core.exception.ModelQueryException;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Property;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author Gregoire DUPE
 *
 */
@SuppressWarnings({ "boxing", "nls" })
public class Tests {

	private static final String PLUGIN_URI = "platform:/plugin/org.eclipse.modisco.infra.browser.custom.examples.uml";
	private final ResourceSet resourceSet = new ResourceSetImpl();

	@BeforeClass
	public static void beforeClass() throws CoreException {
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		for (IProject project : projects) {
			project.delete(true, new NullProgressMonitor());
		}
	}

	@Test
	public void subClassifiers() throws ModelQueryException, ModiscoFacetException {
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		ModelQuerySetCatalog catalog = ModelQuerySetCatalog.getSingleton();
		ModelQuerySet querySet = catalog.getModelQuerySet("_example_uml");
		Assert.assertNotNull(querySet);
		ModelQuery modelQuery = querySet.getQuery("subClassifiers");
		Assert.assertNotNull(modelQuery);
		URI umlModelUri = URI.createURI(Tests.PLUGIN_URI + "/umlModels/umlExample1.uml");
		Resource umlModel = this.resourceSet.getResource(umlModelUri, true);
		TreeIterator<EObject> treeIterator = umlModel.getAllContents();
		while (treeIterator.hasNext()) {
			EObject eObject = treeIterator.next();
			if (eObject instanceof Class) {
				Class classs = (Class) eObject;
				if (classs.getName().equals("Query")) {
					AbstractModelQuery modelQueryImpl = catalog.getModelQueryImpl(modelQuery);
					Object queryResult = modelQueryImpl.basicEvaluate(classs);
					if (!(queryResult instanceof List<?>)) {
						Assert.fail("Query result is expected to be a List");
					}
					List<?> eClassifiers = (List<?>) queryResult;
					Assert.assertEquals(2, eClassifiers.size());
					Class class1 = null;
					Class class2 = null;
					TreeIterator<EObject> treeIterator1 = umlModel.getAllContents();
					while (treeIterator1.hasNext()) {
						EObject eObject1 = treeIterator1.next();
						if (eObject1 instanceof Class) {
							Class classs1 = (Class) eObject1;
							if (classs1.getName().equals("OCLQuery")) {
								class1 = classs1;
							}
							if (classs1.getName().equals("JavaQuery")) {
								class2 = classs1;
							}
						}
					}
					Assert.assertTrue(eClassifiers.contains(class1));
					Assert.assertTrue(eClassifiers.contains(class2));

					FacetSetCatalog facetSetCatalog = FacetSetCatalog.getSingleton();
					FacetSet facetSet = facetSetCatalog.getFacetSet("_example_umlFacets");
					Facet facet = facetSet.getFacet("ClassifierExtension");
					FacetReference facetReference = (FacetReference) facet
							.getEStructuralFeature("subClassifiers");
					FacetContext facetContext = new FacetContext();
					facetContext.addFacet(facet);
					List<?> eClassifiers2 = (List<?>) facetContext.get(classs, facetReference);
					Assert.assertEquals(2, eClassifiers2.size());
					Assert.assertTrue(eClassifiers2.contains(class1));
					Assert.assertTrue(eClassifiers2.contains(class2));
				}
			}
		}
	}

	@Test
	public void umlQuerySet() throws Exception {
		URI uri = URI.createURI(Tests.PLUGIN_URI + "/_example_uml.querySet");
		FileUtils.checkEMFResource(uri, 1);
	}

	@Test
	public void umlUiCustom() throws Exception {
		URI uri = URI.createURI(Tests.PLUGIN_URI + "/_example_uml.uiCustom");
		FileUtils.checkEMFResource(uri, 1);
	}

	@Test
	public void umlFacets() throws Exception {
		URI uri = URI.createURI(Tests.PLUGIN_URI + "/_example_umlFacets.facetSet");
		FileUtils.checkEMFResource(uri, 1);
	}

	@Test
	public void umlFacets2() throws Exception {
		URI uri = URI.createURI(Tests.PLUGIN_URI + "/_example_umlFacets2.facetSet");
		FileUtils.checkEMFResource(uri, 1);
	}

	@Test
	public void umlFacetsUiCustom() throws Exception {
		URI uri = URI.createURI(Tests.PLUGIN_URI + "/_example_umlFacetSet.uiCustom");
		FileUtils.checkEMFResource(uri, 1);
	}

	@Test
	public void umlFacets2UiCustom() throws Exception {
		URI uri = URI.createURI(Tests.PLUGIN_URI + "/_example_umlFacetSet2.uiCustom");
		FileUtils.checkEMFResource(uri, 1);
	}

	public static final String QUERY_SET_NAME = "_example_uml";

	public void isMetaClass() throws ModelQueryException {
		URI umlModelUri = URI.createURI(Tests.PLUGIN_URI + "/umlModels/umlExample1.uml");
		Resource umlModel = this.resourceSet.getResource(umlModelUri, true);
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		ModelQuerySetCatalog catalog = ModelQuerySetCatalog.getSingleton();
		ModelQuerySet querySet = catalog.getModelQuerySet(Tests.QUERY_SET_NAME);
		ModelQuery modelQuery = querySet.getQuery("isMetaClass");
		AbstractModelQuery queryImpl = catalog.getModelQueryImpl(modelQuery);
		Model model = (Model) umlModel.getContents().get(0);
		// True
		Class cUtilityAndMetaClass = (Class) model.getMember("UtilityAndMetaClass");
		Assert.assertTrue((Boolean) queryImpl.basicEvaluate(cUtilityAndMetaClass));
		Class cQuery = (Class) model.getMember("Query");
		Assert.assertTrue((Boolean) queryImpl.basicEvaluate(cQuery));
		// False
		Class cOclQuery = (Class) model.getMember("OCLQuery");
		Assert.assertFalse((Boolean) queryImpl.basicEvaluate(cOclQuery));
		Class cJavaQuery = (Class) model.getMember("JavaQuery");
		Assert.assertFalse((Boolean) queryImpl.basicEvaluate(cJavaQuery));
	}

	public void allAttributes() throws ModelQueryException {
		URI umlModelUri = URI.createURI(Tests.PLUGIN_URI + "/umlModels/umlExample1.uml");
		Resource umlModel = this.resourceSet.getResource(umlModelUri, true);
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		ModelQuerySetCatalog catalog = ModelQuerySetCatalog.getSingleton();
		ModelQuerySet querySet = catalog.getModelQuerySet(Tests.QUERY_SET_NAME);
		ModelQuery modelQuery = querySet.getQuery("allAttributes");
		AbstractModelQuery queryImpl = catalog.getModelQueryImpl(modelQuery);
		Model model = (Model) umlModel.getContents().get(0);
		Class cQuery = (Class) model.getMember("Query");
		Assert.assertEquals(2, ((List<?>) queryImpl.basicEvaluate(cQuery)).size());
		Class cOclQuery = (Class) model.getMember("OCLQuery");
		Assert.assertEquals(2, ((List<?>) queryImpl.basicEvaluate(cOclQuery)).size());
		Class cUtilityAndMetaClass = (Class) model.getMember("UtilityAndMetaClass");
		Assert.assertEquals(1, ((List<?>) queryImpl.basicEvaluate(cUtilityAndMetaClass)).size());
		Class cJavaQuery = (Class) model.getMember("JavaQuery");
		Assert.assertEquals(2, ((List<?>) queryImpl.basicEvaluate(cJavaQuery)).size());
	}

	public void allParents() throws ModelQueryException {
		URI umlModelUri = URI.createURI(Tests.PLUGIN_URI + "/umlModels/umlExample1.uml");
		Resource umlModel = this.resourceSet.getResource(umlModelUri, true);
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		ModelQuerySetCatalog catalog = ModelQuerySetCatalog.getSingleton();
		ModelQuerySet querySet = catalog.getModelQuerySet(Tests.QUERY_SET_NAME);
		ModelQuery modelQuery = querySet.getQuery("allParents");
		AbstractModelQuery queryImpl = catalog.getModelQueryImpl(modelQuery);
		Model model = (Model) umlModel.getContents().get(0);
		Class cQuery = (Class) model.getMember("Query");
		Assert.assertEquals(0, ((List<?>) queryImpl.basicEvaluate(cQuery)).size());
		Class cOclQuery = (Class) model.getMember("OCLQuery");
		Assert.assertEquals(1, ((List<?>) queryImpl.basicEvaluate(cOclQuery)).size());
		Class cUtilityAndMetaClass = (Class) model.getMember("UtilityAndMetaClass");
		Assert.assertEquals(0, ((List<?>) queryImpl.basicEvaluate(cUtilityAndMetaClass)).size());
		Class cJavaQuery = (Class) model.getMember("JavaQuery");
		Assert.assertEquals(1, ((List<?>) queryImpl.basicEvaluate(cJavaQuery)).size());
	}

	public void isAssociationEnd() throws ModelQueryException {
		URI umlModelUri = URI.createURI(Tests.PLUGIN_URI + "/umlModels/umlExample1.uml");
		Resource umlModel = this.resourceSet.getResource(umlModelUri, true);
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		ModelQuerySetCatalog catalog = ModelQuerySetCatalog.getSingleton();
		ModelQuerySet querySet = catalog.getModelQuerySet(Tests.QUERY_SET_NAME);
		ModelQuery modelQuery = querySet.getQuery("isAssociationEnd");
		AbstractModelQuery queryImpl = catalog.getModelQueryImpl(modelQuery);
		Model model = (Model) umlModel.getContents().get(0);
		Class cQuery = (Class) model.getMember("Query");
		for (Property property : cQuery.getAttributes()) {
			if (property.getName().equals("class_1")) {
				Assert.assertTrue((Boolean) queryImpl.basicEvaluate(property));
			} else if (property.getName().equals("Property_0")) {
				Assert.assertFalse((Boolean) queryImpl.basicEvaluate(property));
			} else {
				Assert.fail("Unexpected attribute");
			}
		}
	}

	public void parents() throws Exception {
		URI umlModelUri = URI.createURI(Tests.PLUGIN_URI + "/umlModels/umlExample1.uml");
		Resource umlModel = this.resourceSet.getResource(umlModelUri, true);
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		ModelQuerySetCatalog catalog = ModelQuerySetCatalog.getSingleton();
		ModelQuerySet querySet = catalog.getModelQuerySet(Tests.QUERY_SET_NAME);
		ModelQuery modelQuery = querySet.getQuery("parents");
		AbstractModelQuery queryImpl = catalog.getModelQueryImpl(modelQuery);
		Model model = (Model) umlModel.getContents().get(0);
		Class cQuery = (Class) model.getMember("Query");
		Assert.assertEquals(0, ((List<?>) queryImpl.basicEvaluate(cQuery)).size());
		Class cOclQuery = (Class) model.getMember("OCLQuery");
		Assert.assertEquals(1, ((List<?>) queryImpl.basicEvaluate(cOclQuery)).size());
		Class cUtilityAndMetaClass = (Class) model.getMember("UtilityAndMetaClass");
		Assert.assertEquals(0, ((List<?>) queryImpl.basicEvaluate(cUtilityAndMetaClass)).size());
		Class cJavaQuery = (Class) model.getMember("JavaQuery");
		Object result = queryImpl.basicEvaluate(cJavaQuery);
		if (result instanceof List<?>) {
			Assert.assertEquals(1, ((List<?>) result).size());
		} else {
			throw new Exception("A list is expected as result.");
		}

	}

	public void isStringProperty() throws ModelQueryException {
		URI umlModelUri = URI.createURI(Tests.PLUGIN_URI + "/umlModels/umlExample1.uml");
		Resource umlModel = this.resourceSet.getResource(umlModelUri, true);
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		ModelQuerySetCatalog catalog = ModelQuerySetCatalog.getSingleton();
		ModelQuerySet querySet = catalog.getModelQuerySet(Tests.QUERY_SET_NAME);
		ModelQuery modelQuery = querySet.getQuery("isStringProperty");
		AbstractModelQuery queryImpl = catalog.getModelQueryImpl(modelQuery);
		Model model = (Model) umlModel.getContents().get(0);
		Class cQuery = (Class) model.getMember("Query");
		for (Property property : cQuery.getAttributes()) {
			if (property.getName().equals("class_1")) {
				Assert.assertFalse((Boolean) queryImpl.basicEvaluate(property));
			} else if (property.getName().equals("Property_0")) {
				Assert.assertTrue((Boolean) queryImpl.basicEvaluate(property));
			} else {
				Assert.fail("Unexpected attribute");
			}
		}
	}

	public void subClassifiers2() throws Exception {
		URI umlModelUri = URI.createURI(Tests.PLUGIN_URI + "/umlModels/umlExample1.uml");
		Resource umlModel = this.resourceSet.getResource(umlModelUri, true);
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		ModelQuerySetCatalog catalog = ModelQuerySetCatalog.getSingleton();
		ModelQuerySet querySet = catalog.getModelQuerySet(Tests.QUERY_SET_NAME);
		ModelQuery modelQuery = querySet.getQuery("subClassifiers");
		AbstractModelQuery queryImpl = catalog.getModelQueryImpl(modelQuery);
		Model model = (Model) umlModel.getContents().get(0);
		Class cQuery = (Class) model.getMember("Query");
		Assert.assertEquals(2, ((List<?>) queryImpl.basicEvaluate(cQuery)).size());
		Class cOclQuery = (Class) model.getMember("OCLQuery");
		Assert.assertEquals(0, ((List<?>) queryImpl.basicEvaluate(cOclQuery)).size());
		Class cUtilityAndMetaClass = (Class) model.getMember("UtilityAndMetaClass");
		Assert.assertEquals(0, ((List<?>) queryImpl.basicEvaluate(cUtilityAndMetaClass)).size());
		Class cJavaQuery = (Class) model.getMember("JavaQuery");
		Object result = queryImpl.basicEvaluate(cJavaQuery);
		if (result instanceof List<?>) {
			Assert.assertEquals(0, ((List<?>) result).size());
		} else {
			throw new Exception("A list is expected as result.");
		}

	}

	public void isUtility() throws ModelQueryException {
		URI umlModelUri = URI.createURI(Tests.PLUGIN_URI + "/umlModels/umlExample1.uml");
		Resource umlModel = this.resourceSet.getResource(umlModelUri, true);
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		ModelQuerySetCatalog catalog = ModelQuerySetCatalog.getSingleton();
		ModelQuerySet querySet = catalog.getModelQuerySet(Tests.QUERY_SET_NAME);
		ModelQuery modelQuery = querySet.getQuery("isUtility");
		AbstractModelQuery queryImpl = catalog.getModelQueryImpl(modelQuery);
		Model model = (Model) umlModel.getContents().get(0);
		// True
		Class cUtilityAndMetaClass = (Class) model.getMember("UtilityAndMetaClass");
		Assert.assertTrue((Boolean) queryImpl.basicEvaluate(cUtilityAndMetaClass));
		Class cQueryManager = (Class) model.getMember("QueryManager");
		Assert.assertTrue((Boolean) queryImpl.basicEvaluate(cQueryManager));
		// False
		Class cJavaQuery = (Class) model.getMember("JavaQuery");
		Assert.assertFalse((Boolean) queryImpl.basicEvaluate(cJavaQuery));
		Class cModelBrowser = (Class) model.getMember("ModelBrowser");
		Assert.assertFalse((Boolean) queryImpl.basicEvaluate(cModelBrowser));
		Class cOclQuery = (Class) model.getMember("OCLQuery");
		Assert.assertFalse((Boolean) queryImpl.basicEvaluate(cOclQuery));
	}

	public void isQuery() throws ModelQueryException {
		URI umlModelUri = URI.createURI(Tests.PLUGIN_URI + "/umlModels/umlExample1.uml");
		Resource umlModel = this.resourceSet.getResource(umlModelUri, true);
		ModelQuerySetCatalog.getSingleton().waitUntilBuilt();
		ModelQuerySetCatalog catalog = ModelQuerySetCatalog.getSingleton();
		ModelQuerySet querySet = catalog.getModelQuerySet(Tests.QUERY_SET_NAME);
		ModelQuery modelQuery = querySet.getQuery("isQuery");
		AbstractModelQuery queryImpl = catalog.getModelQueryImpl(modelQuery);
		Model model = (Model) umlModel.getContents().get(0);
		Class cOclQuery = (Class) model.getMember("OCLQuery");
		Assert.assertTrue((Boolean) queryImpl.basicEvaluate(cOclQuery));
		Class cUtilityAndMetaClass = (Class) model.getMember("UtilityAndMetaClass");
		Assert.assertFalse((Boolean) queryImpl.basicEvaluate(cUtilityAndMetaClass));
		Class cJavaQuery = (Class) model.getMember("JavaQuery");
		Assert.assertTrue((Boolean) queryImpl.basicEvaluate(cJavaQuery));
		Class cModelBrowser = (Class) model.getMember("ModelBrowser");
		Assert.assertFalse((Boolean) queryImpl.basicEvaluate(cModelBrowser));
	}

	@Test
	public void bug308991() throws CoreException, IOException,
			InterruptedException {
		final List<IStatus> statusList = new ArrayList<IStatus>();
		ILogListener listener = new ILogListener() {
			public void logging(final IStatus status, final String plugin) {
				statusList.add(status);
			}
		};
		ILog log = Platform.getLog(Platform
				.getBundle("org.eclipse.modisco.infra.common.core"));
		log.addLogListener(listener);
		ProjectUtils
				.importPlugin(
						Platform.getBundle("org.eclipse.modisco.infra.browser.custom.examples.uml"),
						new IFilter() {
							public boolean filter(final Object object) {
								boolean result = true;
								if (object instanceof File) {
									File file = (File) object;
									result = !file.getName().equals(
											".checkstyle"); //$NON-NLS-1$
								} else if (object instanceof String) {
									String str = (String) object;
									result = !str.equals(".checkstyle"); //$NON-NLS-1$
								}
								return result;
							}
						});
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(
				"org.eclipse.modisco.infra.browser.custom.examples.uml");
		ProjectUtils.refresh(project);
		log.removeLogListener(listener);
		if (!statusList.isEmpty()) {
			MultiStatus status = new MultiStatus(Activator.getDefault()
					.getBundle().getSymbolicName(), IStatus.ERROR, statusList
					.toArray(new IStatus[] {}), "Test failed.", new Exception());
			CoreException e = new CoreException(status);
			MoDiscoLogger.logError(e, Activator.getDefault());
			throw e;
		}
	}
}
