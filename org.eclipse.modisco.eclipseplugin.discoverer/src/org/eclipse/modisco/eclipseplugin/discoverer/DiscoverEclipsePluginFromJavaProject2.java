/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Frederic Madiot (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *******************************************************************************/
package org.eclipse.modisco.eclipseplugin.discoverer;

import java.util.Iterator;
import java.util.List;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.eclipseplugin.EclipsePlugin;
import org.eclipse.modisco.eclipseplugin.EclipsepluginFactory;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.discoverer.DiscoverJavaModelFromJavaProject;
import org.eclipse.modisco.java.discoverer.JavaDiscoveryConstants;
import org.eclipse.modisco.kdm.source.discoverer.DiscoverSourceModelFromJavaElement;
import org.eclipse.modisco.kdm.source.discoverer.IKDMDiscoveryConstants;
import org.eclipse.modisco.manifest.Bundle;
import org.eclipse.modisco.manifest.discoverer.ManifestModelDiscoverer2;
import org.eclipse.modisco.omg.kdm.code.CompilationUnit;
import org.eclipse.modisco.omg.kdm.kdm.KDMModel;
import org.eclipse.modisco.omg.kdm.kdm.Segment;
import org.eclipse.modisco.omg.kdm.source.AbstractInventoryElement;
import org.eclipse.modisco.omg.kdm.source.InventoryModel;
import org.eclipse.modisco.omg.kdm.source.Project;
import org.eclipse.modisco.properties.discoverer.PropertiesModelDiscoverer2;
import org.eclipse.modisco.xml.Element;
import org.eclipse.modisco.xml.Node;
import org.eclipse.modisco.xml.Root;
import org.eclipse.modisco.xml.discoverer.XMLModelDiscoverer;
import org.eclipse.pde.core.project.IBundleProjectDescription;

public class DiscoverEclipsePluginFromJavaProject2 extends AbstractModelDiscoverer<IJavaProject> {

	public boolean isApplicableTo(final IJavaProject source) {
		try {
			return source.getProject().isAccessible()
					&& source.getProject().getNature(IBundleProjectDescription.PLUGIN_NATURE) != null;
		} catch (CoreException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
			return false;
		}
	}

	@Override
	protected void basicDiscoverElement(final IJavaProject source, final IProgressMonitor monitor)
			throws DiscoveryException {
		IProject project = source.getProject();
		setDefaultTargetURI(URI.createPlatformResourceURI(
				project.getFullPath().append(project.getName())
						+ EclipsePluginDiscoveryConstants.ECLIPSE_PLUGIN_MODEL_FILE_SUFFIX, true));
		discoverEclipsePluginModel(source, monitor);
	}

	private static IFile getFile(final IJavaProject javaProject, final String filePath) {
		IResource resource = javaProject.getProject().getFile(new Path(filePath));
		if (resource instanceof IFile) {
			return (IFile) resource;
		}
		return null;
	}

	private void discoverEclipsePluginModel(final IJavaProject javaProject,
			final IProgressMonitor monitor) throws DiscoveryException {
		// Retrieve the configuration files which compose the plug-in to analyze
		IFile manifestFile = getFile(javaProject, "META-INF/MANIFEST.MF"); //$NON-NLS-1$
		IFile buildPropertiesFile = getFile(javaProject, "build.properties"); //$NON-NLS-1$
		IFile pluginPropertiesFile = getFile(javaProject, "plugin.properties"); //$NON-NLS-1$
		IFile bundlePropertiesFile = getFile(javaProject, "OSGI-INF/I10n/bundle.properties"); //$NON-NLS-1$
		IFile classPathFile = getFile(javaProject, ".classpath"); //$NON-NLS-1$
		IFile projectXmlFile = getFile(javaProject, ".project"); //$NON-NLS-1$
		IFile pluginXmlFile = getFile(javaProject, "plugin.xml"); //$NON-NLS-1$

		// Discover the models which will compose the EclipsePlugin model
		Resource kdmSourceResource = discoverKdmSourceModel(javaProject, monitor);
		Resource javaResource = discoverJavaModel(javaProject, monitor);
		Resource manifestResource = discoverManifestModel(manifestFile, monitor);
		Resource buildPropertiesResource = discoverBuildPropertiesModel(buildPropertiesFile,
				monitor);
		Resource pluginPropertiesResource = discoverPluginPropertiesModel(pluginPropertiesFile,
				monitor);
		Resource bundlePropertiesResource = discoverBundlePropertiesModel(bundlePropertiesFile,
				monitor);
		Resource classPathResource = discoverXmlModel(classPathFile, "classpath", monitor); //$NON-NLS-1$
		Resource projectResource = discoverXmlModel(projectXmlFile, "project", monitor); //$NON-NLS-1$
		Resource pluginXmlResource = discoverXmlModel(pluginXmlFile, "plugin.xml", monitor); //$NON-NLS-1$

		// Create and initialize the EclipsePlugin resource
		EclipsePlugin eclipsePlugin = EclipsepluginFactory.eINSTANCE.createEclipsePlugin();
		createTargetModel().getContents().add(eclipsePlugin);

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
	}

	private Resource discoverKdmSourceModel(final IJavaProject javaProject,
			final IProgressMonitor monitor) throws DiscoveryException {
		DiscoverSourceModelFromJavaElement kdmSourceDiscoverer = new DiscoverSourceModelFromJavaElement();
		kdmSourceDiscoverer.setSerializeTarget(isTargetSerializationChosen());
		kdmSourceDiscoverer.setTargetURI(deriveTargetURI(null, null,
				IKDMDiscoveryConstants.KDM_MODEL_FILE_SUFFIX));
		kdmSourceDiscoverer.discoverElement(javaProject, monitor);
		Resource kdmSourceResource = kdmSourceDiscoverer.getTargetModel();
		kdmSourceResource.setURI(kdmSourceDiscoverer.getTargetURI());
		return kdmSourceResource;
	}

	private Resource discoverJavaModel(final IJavaProject javaProject,
			final IProgressMonitor monitor) throws DiscoveryException {
		DiscoverJavaModelFromJavaProject discoverer = new DiscoverJavaModelFromJavaProject();
		discoverer.setSerializeTarget(isTargetSerializationChosen());
		discoverer.setTargetURI(deriveTargetURI(null, null,
				JavaDiscoveryConstants.JAVA_MODEL_FILE_SUFFIX));
		discoverer.discoverElement(javaProject, monitor);
		Resource resource = discoverer.getTargetModel();
		resource.setURI(discoverer.getTargetURI());
		return resource;
	}

	private Resource discoverManifestModel(final IFile manifestFile, final IProgressMonitor monitor)
			throws DiscoveryException {
		if (manifestFile == null || !manifestFile.exists()) {
			return null;
		}
		ManifestModelDiscoverer2 discoverer = new ManifestModelDiscoverer2();
		discoverer.setSerializeTarget(isTargetSerializationChosen());
		discoverer.setTargetURI(deriveTargetURI(null, "MANIFEST.MF", ".xmi")); //$NON-NLS-1$//$NON-NLS-2$
		discoverer.discoverElement(manifestFile, monitor);
		Resource targetModel = discoverer.getTargetModel();
		targetModel.setURI(discoverer.getTargetURI());
		return targetModel;
	}

	private Resource discoverBuildPropertiesModel(final IFile buildPropertiesFile,
			final IProgressMonitor monitor) throws DiscoveryException {
		if (buildPropertiesFile == null || !buildPropertiesFile.exists()) {
			return null;
		}
		PropertiesModelDiscoverer2 discoverer = new PropertiesModelDiscoverer2();
		discoverer.setSerializeTarget(isTargetSerializationChosen());
		discoverer.setTargetURI(deriveTargetURI(null, "build.properties", ".xmi")); //$NON-NLS-1$//$NON-NLS-2$
		discoverer.discoverElement(buildPropertiesFile, monitor);
		Resource targetModel = discoverer.getTargetModel();
		targetModel.setURI(discoverer.getTargetURI());
		return targetModel;
	}

	private Resource discoverPluginPropertiesModel(final IFile pluginPropertiesFile,
			final IProgressMonitor monitor) throws DiscoveryException {
		if (pluginPropertiesFile == null || !pluginPropertiesFile.exists()) {
			return null;
		}
		PropertiesModelDiscoverer2 discoverer = new PropertiesModelDiscoverer2();
		discoverer.setSerializeTarget(isTargetSerializationChosen());
		discoverer.setTargetURI(deriveTargetURI(null, "plugin.properties", ".xmi")); //$NON-NLS-1$//$NON-NLS-2$
		discoverer.discoverElement(pluginPropertiesFile, monitor);
		Resource targetModel = discoverer.getTargetModel();
		targetModel.setURI(discoverer.getTargetURI());
		return targetModel;
	}

	private Resource discoverBundlePropertiesModel(final IFile bundlePropertiesFile,
			final IProgressMonitor monitor) throws DiscoveryException {
		if (bundlePropertiesFile == null || !bundlePropertiesFile.exists()) {
			return null;
		}
		PropertiesModelDiscoverer2 discoverer = new PropertiesModelDiscoverer2();
		discoverer.setSerializeTarget(isTargetSerializationChosen());
		discoverer.setTargetURI(deriveTargetURI(null, "bundle.properties", ".xmi")); //$NON-NLS-1$//$NON-NLS-2$
		discoverer.discoverElement(bundlePropertiesFile, monitor);
		Resource targetModel = discoverer.getTargetModel();
		targetModel.setURI(discoverer.getTargetURI());
		return targetModel;
	}

	private Resource discoverXmlModel(final IFile xmlFile, final String basename,
			final IProgressMonitor monitor) throws DiscoveryException {
		if (xmlFile == null || !xmlFile.exists()) {
			return null;
		}
		XMLModelDiscoverer discoverer = new XMLModelDiscoverer();
		discoverer.setSerializeTarget(isTargetSerializationChosen());
		discoverer.setTargetURI(deriveTargetURI(null, basename, ".xmi")); //$NON-NLS-1$
		discoverer.discoverElement(xmlFile, monitor);
		Resource targetModel = discoverer.getTargetModel();
		targetModel.setURI(discoverer.getTargetURI());
		return targetModel;
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

	private static String getClassPathEntry(final String kindSearch,
			final Resource classPathResource) {
		String kind = ""; //$NON-NLS-1$
		String path = ""; //$NON-NLS-1$
		String output = ""; //$NON-NLS-1$
		for (Iterator<EObject> i = classPathResource.getAllContents(); i.hasNext();) {
			EObject eo = i.next();
			if (eo instanceof Element) {
				Element element = (Element) eo;
				if (element.getName().equals("classpathentry")) { //$NON-NLS-1$
					for (Node children : element.getChildren()) {
						if (children instanceof org.eclipse.modisco.xml.Attribute) {
							org.eclipse.modisco.xml.Attribute attribute = (org.eclipse.modisco.xml.Attribute) children;
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

	/**
	 * Derive a URI for a Resource from the main URI (if any) specified by the user, or the default
	 * URI.
	 *
	 * @param directory
	 *            a sub-directory name, or <code>null</code> if the Resource must be saved at the
	 *            same level as the main one
	 * @param filename
	 *            the base file name, or <code>null</code> if it must be derived from the main
	 *            Resource URI
	 * @param suffix
	 *            a suffix
	 * @return the derived URI
	 */
	private URI deriveTargetURI(final String directory, final String filename, final String suffix) {
		String baseName = filename;
		URI mainURI = getTargetURI();
		if (mainURI == null || mainURI.toString().trim().length() == 0) {
			mainURI = getDefaultTargetURI();
		}
		String lastSegment = mainURI.lastSegment();
		if (baseName == null) {
			if (lastSegment
					.endsWith(EclipsePluginDiscoveryConstants.ECLIPSE_PLUGIN_MODEL_FILE_SUFFIX)) {
				baseName = lastSegment
						.substring(
								0,
								lastSegment.length()
										- EclipsePluginDiscoveryConstants.ECLIPSE_PLUGIN_MODEL_FILE_SUFFIX
												.length());
			} else if (lastSegment.endsWith(".xmi")) { //$NON-NLS-1$
				baseName = lastSegment.substring(0, lastSegment.length() - ".xmi".length()); //$NON-NLS-1$
			} else {
				baseName = lastSegment;
			}
		}
		mainURI = mainURI.trimSegments(1);
		if (directory != null) {
			mainURI = mainURI.appendSegment(directory);
		}
		return mainURI.appendSegment(baseName + suffix);
	}

}
