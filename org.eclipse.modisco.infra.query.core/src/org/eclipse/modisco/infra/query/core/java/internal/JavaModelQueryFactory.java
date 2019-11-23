/**
 * Copyright (c) 2009, 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 *     Nicolas Bros (Mia-Software)
 */
package org.eclipse.modisco.infra.query.core.java.internal;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.modisco.infra.common.core.internal.resource.MoDiscoResourceSet;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.query.JavaModelQuery;
import org.eclipse.modisco.infra.query.ModelQuery;
import org.eclipse.modisco.infra.query.ModelQuerySet;
import org.eclipse.modisco.infra.query.QueryPackage;
import org.eclipse.modisco.infra.query.core.AbstractModelQuery;
import org.eclipse.modisco.infra.query.core.IModelQueryFactory;
import org.eclipse.modisco.infra.query.core.ModelQuerySetCatalog;
import org.eclipse.modisco.infra.query.core.exception.BundleClassPathException;
import org.eclipse.modisco.infra.query.core.exception.ExecutionEnvironmentException;
import org.eclipse.modisco.infra.query.core.exception.MissingBundleException;
import org.eclipse.modisco.infra.query.core.exception.ModelQueryException;
import org.eclipse.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.modisco.infra.query.core.exception.ProjectDisabledException;
import org.eclipse.modisco.infra.query.core.internal.Activator;
import org.eclipse.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.osgi.util.ManifestElement;
import org.eclipse.pde.core.plugin.IPluginAttribute;
import org.eclipse.pde.core.plugin.IPluginElement;
import org.eclipse.pde.core.plugin.IPluginExtension;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.IPluginObject;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleException;

/**
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class JavaModelQueryFactory implements IModelQueryFactory {

	private static final long DELAY = 1000;
	private static IResourceChangeListener changeListener = null;
	private static HashMap<IProject, Bundle> bundleMap = new HashMap<IProject, Bundle>();
	private static HashMap<IProject, Long> disabledProjects = new HashMap<IProject, Long>();
	private static HashMap<IProject, ModelQueryException> disabledProjectsCause = new HashMap<IProject, ModelQueryException>();

	public JavaModelQueryFactory() {
		if (JavaModelQueryFactory.changeListener == null) {
			JavaModelQueryFactory.changeListener = JavaModelQueryFactory.initChangeListener();
		}
	}

	public AbstractModelQuery create(final ModelQuery modelQuery, final Bundle bundle)
			throws ModelQueryException {
		if (!(modelQuery instanceof JavaModelQuery)) {
			throw new ModelQueryException("Wrong kind of ModelQuery: " //$NON-NLS-1$
					+ modelQuery.getClass().getSimpleName() + " found, " //$NON-NLS-1$
					+ JavaModelQuery.class.getSimpleName() + " expected."); //$NON-NLS-1$
		}
		AbstractModelQuery javaModelQueryInst = null;
		IProject project = null;
		try {
			Bundle localBundle;
			JavaModelQuery javaModelQuery = (JavaModelQuery) modelQuery;
			if (javaModelQuery.getModelQuerySet() == null) {
				throw new IllegalStateException("JavaModelQuery '" //$NON-NLS-1$
						+ javaModelQuery.getName() + " 'is not in any query set"); //$NON-NLS-1$
			}
			if (bundle == null) {
				final IWorkspace ws = ResourcesPlugin.getWorkspace();
				final String querySetName = modelQuery.getModelQuerySet().getName();
				URI uri = ModelQuerySetCatalog.getSingleton().getURI(querySetName);
				if (uri == null) {
					throw new IllegalStateException("QuerySet not found: " + querySetName); //$NON-NLS-1$
				}

				Path querySetPath = new Path(uri.toPlatformString(true));
				IResource file = ws.getRoot().findMember(querySetPath);
				if (file == null) {
					throw new IllegalStateException(
							"QuerySet file not found: " + querySetPath.toString()); //$NON-NLS-1$
				}

				project = file.getProject();
				localBundle = JavaModelQueryFactory.bundleMap.get(project);
				checkProjectEnabled(project);
				if (localBundle == null) {
					localBundle = Activator.getDefault().installBundle(project);
					loadMetamodelsFromPluginXml(project, localBundle);
					JavaModelQueryFactory.bundleMap.put(project, localBundle);

					// reload the query
					ModelQuerySet oldModelQuerySet = javaModelQuery.getModelQuerySet();
					if (oldModelQuerySet == null) {
						throw new IllegalStateException("JavaModelQuery '" //$NON-NLS-1$
								+ javaModelQuery.getName() + " 'is not in any query set"); //$NON-NLS-1$
					}

					ModelQuerySet modelQuerySet = ModelQuerySetCatalog.getSingleton()
							.getModelQuerySet(querySetName);

					if (modelQuerySet == null) {
						throw new IllegalStateException("Couln't find a QuerySet named '" //$NON-NLS-1$
								+ querySetName + "'"); //$NON-NLS-1$
					}

					javaModelQuery = (JavaModelQuery) modelQuerySet.getQuery(javaModelQuery
							.getName());
					if (javaModelQuery == null) {
						throw new IllegalStateException("Couldn't reload the JavaModelQuery"); //$NON-NLS-1$
					}
				}

				checkBundleClassPath(project, localBundle);
				checkRequiredExecutionEnvironment(localBundle);
				checkDependencies(localBundle);

			} else {
				localBundle = bundle;
			}
			String className = javaModelQuery.getImplementationClassName();
			if (className == null || className.length() == 0) {
				throw new ModelQueryExecutionException("implementationClassName is empty"); //$NON-NLS-1$
			}
			Class<?> javaModelQueryClass = localBundle.loadClass(className);
			if (!IJavaModelQuery.class.isAssignableFrom(javaModelQueryClass)) {
				throw new Exception(className + " does not implement " //$NON-NLS-1$
						+ IJavaModelQuery.class.getSimpleName() + "."); //$NON-NLS-1$
			}
			javaModelQueryInst = createJavaModelQueryImpl(javaModelQuery, javaModelQueryClass);
			javaModelQueryInst.setCheckResult(bundle != null);
		} catch (ExecutionEnvironmentException e) {
			if (project != null) {
				synchronized (JavaModelQueryFactory.disabledProjects) {
					JavaModelQueryFactory.disabledProjects.put(project,
							new Long(System.currentTimeMillis()));
				}
			}
			throw e;
		} catch (MissingBundleException e) {
			if (project != null) {
				synchronized (JavaModelQueryFactory.disabledProjects) {
					JavaModelQueryFactory.disabledProjects.put(project,
							new Long(System.currentTimeMillis()));
				}
			}
			throw e;
		} catch (BundleClassPathException e) {
			if (project != null) {
				synchronized (JavaModelQueryFactory.disabledProjects) {
					JavaModelQueryFactory.disabledProjects.put(project,
							new Long(System.currentTimeMillis()));
				}
			}
			throw e;
		} catch (ProjectDisabledException e) {
			throw e;
		} catch (Exception e) {
			ModelQueryException mqe = new ModelQueryException("Failed to load the model query: " //$NON-NLS-1$
					+ modelQuery.getModelQuerySet().getName() + "::" //$NON-NLS-1$
					+ modelQuery.getName(), e);
			MoDiscoLogger.logError(mqe, Activator.getDefault());
			throw mqe;
		}
		return javaModelQueryInst;
	}

	private void checkProjectEnabled(final IProject project) throws ProjectDisabledException {
		synchronized (JavaModelQueryFactory.disabledProjects) {
			Long timestamp = JavaModelQueryFactory.disabledProjects.get(project);
			if (timestamp != null) {
				long sinceLastTry = System.currentTimeMillis() - timestamp.longValue();
				if (sinceLastTry < JavaModelQueryFactory.DELAY) {
					throw new ProjectDisabledException(
							JavaModelQueryFactory.disabledProjectsCause.get(project));
				}
				JavaModelQueryFactory.disabledProjectsCause.remove(project);
				JavaModelQueryFactory.disabledProjects.remove(project);
			}
		}
	}

	private void checkDependencies(final Bundle localBundle) throws BundleException,
			MissingBundleException {
		String dependencies = (String) localBundle.getHeaders().get(
				org.osgi.framework.Constants.REQUIRE_BUNDLE);
		ManifestElement[] manifestElements = ManifestElement.parseHeader(
				org.osgi.framework.Constants.REQUIRE_BUNDLE, dependencies);
		for (ManifestElement manifestElement : manifestElements) {
			String bundleName = manifestElement.getValue();
			if (Platform.getBundle(bundleName) == null) {
				throw new MissingBundleException(bundleName);
			}
		}
	}

	private void checkRequiredExecutionEnvironment(final Bundle localBundle)
			throws ExecutionEnvironmentException {
		String requiredExecEnv = (String) localBundle.getHeaders().get(
				org.osgi.framework.Constants.BUNDLE_REQUIREDEXECUTIONENVIRONMENT);
		Properties p = System.getProperties();
		String availableExecEnv = (String) p
				.get(org.osgi.framework.Constants.FRAMEWORK_EXECUTIONENVIRONMENT);
		if (!availableExecEnv.contains(requiredExecEnv)) {
			throw new ExecutionEnvironmentException(requiredExecEnv, availableExecEnv);
		}
	}

	/**
	 * Check that the output location of the Java project containing the query
	 * implementation is also on the Bundle-ClassPath of the project. Otherwise,
	 * The Java queries implementations it contains will not be found.
	 */
	private void checkBundleClassPath(final IProject project, final Bundle localBundle)
			throws BundleClassPathException {
		boolean found = false;
		IPath outputLocation = null;
		try {
			IJavaProject javaProject = JavaCore.create(project);
			if (javaProject != null) {
				outputLocation = javaProject.getOutputLocation();
				Object header = localBundle.getHeaders().get(
						org.osgi.framework.Constants.BUNDLE_CLASSPATH);
				if (header instanceof String) {
					String bundleClasspath = (String) header;
					String[] bundleClassPathElements = bundleClasspath.split(","); //$NON-NLS-1$
					for (String bundleClassPathEntry : bundleClassPathElements) {
						if (project.getFullPath().append(bundleClassPathEntry.trim())
								.equals(outputLocation)) {
							found = true;
						}
					}
				}

			}
		} catch (Exception e) {
			MoDiscoLogger.logError(e, "Error checking bundle classpath", Activator.getDefault()); //$NON-NLS-1$
			return;
		}

		if (!found) {
			throw new BundleClassPathException(project, outputLocation, localBundle);
		}
	}

	/** This methods is dedicated to isolate the "Unchecked cast" warning. */
	@SuppressWarnings("unchecked")
	private AbstractModelQuery createJavaModelQueryImpl(final JavaModelQuery javaModelQuery,
			final Class<?> javaModelQueryClass) throws InstantiationException,
			IllegalAccessException {
		IJavaModelQuery<EObject, ?> javaModelQueryInst;
		javaModelQueryInst = (IJavaModelQuery<EObject, ?>) javaModelQueryClass.newInstance();
		AbstractModelQuery adapter = new JavaModelQueryAdapter(javaModelQuery, javaModelQueryInst);
		return adapter;
	}

	public EClass getManagedModelQueryType() {
		return QueryPackage.eINSTANCE.getJavaModelQuery();
	}

	static HashMap<IProject, Bundle> getBundleMap() {
		return JavaModelQueryFactory.bundleMap;
	}

	/**
	 * Add a change listener that when a class is modified, removes the
	 * containing project from the bundle map, so that it gets re-installed when
	 * a query is executed.
	 */
	private static IResourceChangeListener initChangeListener() {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IResourceChangeListener listener = new IResourceChangeListener() {
			public void resourceChanged(final IResourceChangeEvent event) {
				if (event != null) {
					checkDelta(event.getDelta());
				}
			}

			private void checkDelta(final IResourceDelta delta) {
				if (delta != null) {
					for (IResourceDelta subdelta : delta.getAffectedChildren()) {
						checkDelta(subdelta);
					}

					IResource resource = delta.getResource();
					if (resource != null) {
						if ("class".equals(resource.getFileExtension())) { //$NON-NLS-1$
							IProject project = resource.getProject();
							Set<IProject> listened = JavaModelQueryFactory.getBundleMap().keySet();
							if (listened.contains(project)) {
								if (project.getLocation() != null) {
									JavaModelQueryFactory.getBundleMap().remove(project);
								}
							}
						}
					}
				}
			}
		};
		workspace.addResourceChangeListener(listener);
		return listener;
		// workspace.removeResourceChangeListener(listener);
	}

	/**
	 * Load the {@link EPackage}s containing the metamodel implementations
	 * defined in the <code>plugin.xml</code> of the given project.
	 */
	void loadMetamodelsFromPluginXml(final IProject project, final Bundle bundle) {
		final String generatedPackageExtensionPoint = EcorePlugin.getPlugin().getSymbolicName()
				+ "." //$NON-NLS-1$
				+ EcorePlugin.GENERATED_PACKAGE_PPID;

		IPluginModelBase pluginModel = PluginRegistry.findModel(project);
		IPluginExtension[] extensions = pluginModel.getExtensions().getExtensions();
		for (IPluginExtension pluginExtension : extensions) {
			if (generatedPackageExtensionPoint.equals(pluginExtension.getPoint())) {
				IPluginObject[] children = pluginExtension.getChildren();
				for (IPluginObject child : children) {
					if (child instanceof IPluginElement) {
						IPluginElement pluginElement = (IPluginElement) child;
						IPluginAttribute[] attributes = pluginElement.getAttributes();
						String uri = null;
						String className = null;
						for (IPluginAttribute pluginAttribute : attributes) {
							if ("class".equalsIgnoreCase(pluginAttribute.getName())) { //$NON-NLS-1$
								className = pluginAttribute.getValue();
							} else if ("uri".equalsIgnoreCase(pluginAttribute.getName())) { //$NON-NLS-1$
								uri = pluginAttribute.getValue();
							}
						}

						if (className == null || uri == null) {
							MoDiscoLogger.logError("Error in extension " //$NON-NLS-1$
									+ EcorePlugin.GENERATED_PACKAGE_PPID
									+ ": couldn't hotload metamodel", Activator.getDefault()); //$NON-NLS-1$
						}

						loadEPackage(bundle, uri, className);
					}
				}
			}
		}
	}

	private void loadEPackage(final Bundle bundle, final String uri, final String className) {
		try {
			Class<?> ePackageClass = bundle.loadClass(className);
			Field instanceField = ePackageClass.getField("eINSTANCE"); //$NON-NLS-1$
			EPackage ePackage = (EPackage) instanceField.get(null);
			EPackage.Registry.INSTANCE.put(ePackage.getNsURI(), ePackage);
			MoDiscoResourceSet.getResourceSetSingleton().aResourceHasBeenLoaded(
					ePackage.eResource());
		} catch (Exception e) {
			MoDiscoLogger.logError(e, "Failed to load an EPackage: " + uri, //$NON-NLS-1$
					Activator.getDefault());
		}
	}
}
