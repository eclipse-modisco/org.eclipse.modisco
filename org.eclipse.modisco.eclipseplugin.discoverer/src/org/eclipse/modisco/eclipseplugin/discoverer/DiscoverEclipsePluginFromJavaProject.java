<<<<<<< HEAD   (ea4f67 Bug 337942 - [Deprecated] org.eclipse.gmt.modisco.workflow)
=======
/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Frederic Madiot (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.eclipseplugin.discoverer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.Discoverer;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameterDirectionKind;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameterImpl;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.actions.DefaultDiscoverer;
import org.eclipse.gmt.modisco.java.actions.DiscoverJavaModelFromJavaProject;
import org.eclipse.gmt.modisco.kdm.source.discoverer.KDMSourceDiscoverer;
import org.eclipse.gmt.modisco.omg.kdm.code.CompilationUnit;
import org.eclipse.gmt.modisco.omg.kdm.kdm.KDMModel;
import org.eclipse.gmt.modisco.omg.kdm.kdm.Segment;
import org.eclipse.gmt.modisco.omg.kdm.source.AbstractInventoryElement;
import org.eclipse.gmt.modisco.omg.kdm.source.InventoryModel;
import org.eclipse.gmt.modisco.omg.kdm.source.Project;
import org.eclipse.gmt.modisco.xml.Element;
import org.eclipse.gmt.modisco.xml.Node;
import org.eclipse.gmt.modisco.xml.Root;
import org.eclipse.gmt.modisco.xml.discoverer.actions.XMLModelDiscoverer;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.modisco.eclipseplugin.EclipsePlugin;
import org.eclipse.modisco.eclipseplugin.EclipsepluginFactory;
import org.eclipse.modisco.manifest.Bundle;
import org.eclipse.modisco.manifest.discoverer.ManifestModelDiscoverer;
import org.eclipse.modisco.properties.discoverer.PropertiesModelDiscoverer;

/**
 * @deprecated use {@link DiscoverEclipsePluginFromJavaProject2}, cf
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=472760
 */
@Deprecated
public class DiscoverEclipsePluginFromJavaProject implements Discoverer {

	public static final boolean SAVE_MODELS = true;
	private static final List<DiscoveryParameter> PARAMETER_KEYS = new ArrayList<DiscoveryParameter>();

	/**
	 * A parameter key for indicating an output target Resource instance.
	 */
	public static final DiscoveryParameter PARAMETER_TARGET_RESOURCE = new DiscoveryParameterImpl(
			"TARGET_RESOURCE", DiscoveryParameterDirectionKind.out, //$NON-NLS-1$
			Resource.class, false);

	static {
		DiscoverEclipsePluginFromJavaProject.PARAMETER_KEYS
				.add(DiscoverEclipsePluginFromJavaProject.PARAMETER_TARGET_RESOURCE);
	}

	public boolean isApplicableTo(final Object source) {
		boolean result = false;
		if (source instanceof IProject) {
			IProject iProject = (IProject) source;
			IJavaProject javaProject = JavaCore.create(iProject);
			if (javaProject.exists()) {
				result = true;
			}
		} else if (source instanceof IJavaProject) {
			result = true;
		}
		return result;
	}

	public List<DiscoveryParameter> getDiscovererParameters() {
		return DiscoverEclipsePluginFromJavaProject.PARAMETER_KEYS;
	}

	public final void discoverElement(final Object source,
			final Map<DiscoveryParameter, Object> parameters) {
		final IJavaProject javaProject;
		if (source instanceof IJavaProject) {
			javaProject = (IJavaProject) source;
		} else if (source instanceof IProject) {
			javaProject = JavaCore.create((IProject) source);
		} else {
			throw new RuntimeException("Unexpected source: " + source.getClass().getName()); //$NON-NLS-1$
		}
		Resource result = discoverEclipsePluginModel(javaProject);
		parameters.put(DiscoverEclipsePluginFromJavaProject.PARAMETER_TARGET_RESOURCE, result);
	}

	private static IResource getFile(final IJavaProject javaProject, final String filePath) {
		IResource resource = javaProject.getProject().getFile(new Path(filePath));
		return resource;
	}

	private static void saveResource(final Resource resource) {
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
	}

	/**
	 * @param javaProject
	 * @return Resource
	 */
	private static Resource discoverEclipsePluginModel(final IJavaProject javaProject) {

		// Retrieve the configuration files which compose the plugin to analyze
		IResource manifestFile = getFile(javaProject, "META-INF/MANIFEST.MF"); //$NON-NLS-1$
		IResource buildPropertiesFile = getFile(javaProject, "build.properties"); //$NON-NLS-1$
		IResource pluginPropertiesFile = getFile(javaProject, "plugin.properties"); //$NON-NLS-1$
		IResource bundlePropertiesFile = getFile(javaProject, "bundle.properties"); //$NON-NLS-1$
		IResource classPathFile = getFile(javaProject, ".classpath"); //$NON-NLS-1$
		IResource projectXmlFile = getFile(javaProject, ".project"); //$NON-NLS-1$
		IResource pluginXmlFile = getFile(javaProject, "plugin.xml"); //$NON-NLS-1$

		// Discover the models which will compose the EclipsePlugin model
		Resource kdmSourceResource = discoverKdmSourceModel(javaProject);
		Resource javaResource = discoverJavaModel(javaProject);
		Resource manifestResource = discoverManifestModel(manifestFile);
		Resource buildPropertiesResource = discoverBuildPropertiesModel(buildPropertiesFile);
		Resource pluginPropertiesResource = discoverPluginPropertiesModel(pluginPropertiesFile);
		Resource bundlePropertiesResource = discoverBundlePropertiesModel(bundlePropertiesFile);
		Resource classPathResource = discoverXmlModel(classPathFile);
		Resource projectResource = discoverXmlModel(projectXmlFile);
		Resource pluginXmlResource = discoverXmlModel(pluginXmlFile);

		// Create and initialize the EclipsePlugin resource
		Resource eclipsePluginResource = new XMIResourceImpl();

		EclipsePlugin eclipsePlugin = EclipsepluginFactory.eINSTANCE.createEclipsePlugin();
		eclipsePluginResource.getContents().add(eclipsePlugin);

		// Complete the EObject representing the EclipsePlugin
		eclipsePlugin.setJavaModel((Model) getFirstRoot(javaResource));
		eclipsePlugin.setBuildProperties((CompilationUnit) getFirstRoot(buildPropertiesResource));
		eclipsePlugin.setBundleProperties((CompilationUnit) getFirstRoot(bundlePropertiesResource));
		eclipsePlugin.setPluginProperties((CompilationUnit) getFirstRoot(pluginPropertiesResource));
		eclipsePlugin.setInventoryProject(getKdmProject(kdmSourceResource));
		Bundle bundle = (Bundle) getFirstRoot(manifestResource);
		if (bundle != null) {
			eclipsePlugin.setBundle(bundle);
			eclipsePlugin.setName(bundle.getSymbolicName());
		}

		// Can't serialize references to elements of XML model
		eclipsePlugin.setClassPathRoot((Root) getFirstRoot(classPathResource));
		eclipsePlugin.setProject((Root) getFirstRoot(projectResource));
		eclipsePlugin.setPluginXml((Root) getFirstRoot(pluginXmlResource));
		eclipsePlugin.setOutputDirectory(getClassPathEntry("output", //$NON-NLS-1$
				classPathResource));
		eclipsePlugin.setSrcDirectory(getClassPathEntry("src", //$NON-NLS-1$
				classPathResource));

		URI uri = URI
				.createURI("platform:/resource/" + javaProject.getProject().getName() + "/" + javaProject.getProject().getName() + ".eclipseplugin.xmi"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		eclipsePluginResource.setURI(uri);

		if (DiscoverEclipsePluginFromJavaProject.SAVE_MODELS) {
			saveResource(eclipsePluginResource);
		}

		return eclipsePluginResource;
	}

	@Deprecated
	public Resource discoverElement(final Object source, final URI target) {
		return null;
	}

	private static Resource discoverKdmSourceModel(final IJavaProject javaProject) {
		KDMSourceDiscoverer kdmSourceDiscoverer = new KDMSourceDiscoverer();
		Resource kdmSourceResource = kdmSourceDiscoverer.getKDMModelFromJavaProject(javaProject);
		URI uri = URI.createURI("platform:/resource" //$NON-NLS-1$
				+ javaProject.getProject().getFullPath()
				+ javaProject.getProject().getFullPath()
				+ ".source.xmi"); //$NON-NLS-1$
		kdmSourceResource.setURI(uri);
		if (DiscoverEclipsePluginFromJavaProject.SAVE_MODELS) {
			saveResource(kdmSourceResource);
		}
		return kdmSourceResource;
	}

	private static Resource discoverJavaModel(final IJavaProject javaProject) {
		DiscoverJavaModelFromJavaProject discoverer = new DiscoverJavaModelFromJavaProject();
		return executeDiscoverer(discoverer, javaProject,
				DefaultDiscoverer.PARAMETER_TARGET_RESOURCE,
				DefaultDiscoverer.PARAMETER_SILENT_MODE, DefaultDiscoverer.PARAMETER_BROWSE_RESULT);
	}

	private static Resource discoverManifestModel(final IResource manifestFile) {
		ManifestModelDiscoverer discoverer = new ManifestModelDiscoverer();
		return executeDiscoverer(discoverer, manifestFile,
				ManifestModelDiscoverer.PARAMETER_TARGET_RESOURCE, null, null);
	}

	private static Resource discoverBuildPropertiesModel(final IResource buildPropertiesFile) {
		PropertiesModelDiscoverer discoverer = new PropertiesModelDiscoverer();
		return executeDiscoverer(discoverer, buildPropertiesFile,
				PropertiesModelDiscoverer.PARAMETER_TARGET_RESOURCE, null, null);
	}

	private static Resource discoverPluginPropertiesModel(final IResource pluginPropertiesFile) {
		PropertiesModelDiscoverer discoverer = new PropertiesModelDiscoverer();
		return executeDiscoverer(discoverer, pluginPropertiesFile,
				PropertiesModelDiscoverer.PARAMETER_TARGET_RESOURCE, null, null);
	}

	private static Resource discoverBundlePropertiesModel(final IResource bundlePropertiesFile) {
		PropertiesModelDiscoverer discoverer = new PropertiesModelDiscoverer();
		return executeDiscoverer(discoverer, bundlePropertiesFile,
				PropertiesModelDiscoverer.PARAMETER_TARGET_RESOURCE, null, null);
	}

	private static Resource discoverXmlModel(final IResource classPathFile) {
		XMLModelDiscoverer discoverer = new XMLModelDiscoverer();
		return executeDiscoverer(discoverer, classPathFile,
				XMLModelDiscoverer.PARAMETER_TARGET_RESOURCE,
				XMLModelDiscoverer.PARAMETER_SILENT_MODE, null);
	}

	private static Project getKdmProject(final Resource kdmSourceResource) {
		Segment kdmSegment = (Segment) getFirstRoot(kdmSourceResource);
		if (kdmSegment != null) {
			List<KDMModel> models = kdmSegment.getModel();
			if (models.size() > 0) {
				InventoryModel kdmModel = (InventoryModel) kdmSegment.getModel().get(0);
				List<AbstractInventoryElement> inventoryElements = kdmModel.getInventoryElement();
				if (inventoryElements.size() > 0) {
					return (Project) inventoryElements.get(0);
				}
			}
		}
		return null;
	}

	private static EObject getFirstRoot(final Resource resource) {
		if (resource != null && resource.getContents() != null && resource.getContents().size() > 0) {
			return resource.getContents().get(0);
		}
		return null;
	}

	private static Resource executeDiscoverer(final Discoverer discoverer, final IResource source,
			final DiscoveryParameter targetResourceParam, final DiscoveryParameter silentModeParam,
			final DiscoveryParameter browseResultParam) {
		Resource resource = null;
		if (discoverer.isApplicableTo(source)) {
			Map<DiscoveryParameter, Object> discoveryParameters = new HashMap<DiscoveryParameter, Object>();
			if (silentModeParam != null) {
				discoveryParameters.put(silentModeParam, Boolean.TRUE);
			}
			if (browseResultParam != null) {
				discoveryParameters.put(browseResultParam, Boolean.FALSE);
			}
			discoverer.discoverElement(source, discoveryParameters);
			resource = (Resource) discoveryParameters.get(targetResourceParam);
			if (resource != null && DiscoverEclipsePluginFromJavaProject.SAVE_MODELS) {
				saveResource(resource);
			}
		}
		return resource;
	}

	private static Resource executeDiscoverer(final Discoverer discoverer, final IJavaProject source,
			final DiscoveryParameter targetResourceParam, final DiscoveryParameter silentModeParam,
			final DiscoveryParameter browseResultParam) {

		Resource resource = null;
		if (discoverer.isApplicableTo(source)) {
			Map<DiscoveryParameter, Object> discoveryParameters = new HashMap<DiscoveryParameter, Object>();
			if (silentModeParam != null) {
				discoveryParameters.put(silentModeParam, Boolean.TRUE);
			}
			if (browseResultParam != null) {
				discoveryParameters.put(browseResultParam, Boolean.FALSE);
			}
			discoverer.discoverElement(source, discoveryParameters);
			resource = (Resource) discoveryParameters.get(targetResourceParam);
			if (resource != null && DiscoverEclipsePluginFromJavaProject.SAVE_MODELS) {
				saveResource(resource);
			}
		}
		return resource;
	}

	private static String getClassPathEntry(final String kindSearch, final Resource classPathResource) {
		String kind = ""; //$NON-NLS-1$
		String path = ""; //$NON-NLS-1$
		String output = ""; //$NON-NLS-1$
		for (Iterator<EObject> i = classPathResource.getAllContents(); i.hasNext();) {
			EObject eo = i.next();
			if (eo instanceof Element) {
				Element element = (Element) eo;
				if (element.getName().equals("classpathentry")) { //$NON-NLS-1$
					for (Node children : element.getChildren()) {
						if (children instanceof org.eclipse.gmt.modisco.xml.Attribute) {
							org.eclipse.gmt.modisco.xml.Attribute attribute = (org.eclipse.gmt.modisco.xml.Attribute) children;
							if (attribute.getName().equals("kind")) { //$NON-NLS-1$
								kind = attribute.getValue();
							}
							if (attribute.getName().equals("path")) { //$NON-NLS-1$
								path = attribute.getValue();
							}
						}
					}
					if (kind.equals(kindSearch)) {
						output = path;
					}
				}
			}
		}
		return output;
	}

}
>>>>>>> BRANCH (345a23 Merge branch 'maintenance-0.13')
