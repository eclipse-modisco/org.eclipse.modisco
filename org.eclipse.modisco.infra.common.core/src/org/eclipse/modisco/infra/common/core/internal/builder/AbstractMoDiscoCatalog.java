/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 *     Nicolas BROS (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.common.core.internal.builder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EventListener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.modisco.infra.common.core.internal.CommonModiscoActivator;
import org.eclipse.modisco.infra.common.core.internal.Messages;
import org.eclipse.modisco.infra.common.core.internal.protocol.ModiscoProtocolException;
import org.eclipse.modisco.infra.common.core.internal.resource.BrokenRefException;
import org.eclipse.modisco.infra.common.core.internal.resource.IMoDiscoResourceListener;
import org.eclipse.modisco.infra.common.core.internal.resource.MoDiscoResourceSet;
import org.eclipse.modisco.infra.common.core.internal.utils.FileUtils;
import org.eclipse.modisco.infra.common.core.internal.utils.ModelUtils;
import org.eclipse.modisco.infra.common.core.internal.utils.ProjectUtils;
import org.eclipse.modisco.infra.common.core.internal.validation.ValidationJob;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.osgi.util.NLS;
import org.osgi.framework.Bundle;

/**
 * @author Gregoire DUPE (Mia-Software)
 */
public abstract class AbstractMoDiscoCatalog implements IMoDiscoResourceListener,
		IResourceChangeListener {

	private static final String SCHEDULING_DEBUG_ID = "org.eclipse.modisco.infra.common.core/debug/AbstractMoDiscoCatalog/scheduling_debug"; //$NON-NLS-1$
	static final boolean SCHEDULING_DEBUG = CommonModiscoActivator.getDefault().isDebugging()
			&& Boolean.parseBoolean(Platform.getDebugOption(AbstractMoDiscoCatalog.SCHEDULING_DEBUG_ID));
	private static final String BUNDLE_DEBUG_ID = "org.eclipse.modisco.infra.common.core/debug/AbstractMoDiscoCatalog/bundle_debug"; //$NON-NLS-1$
	private static final boolean DEBUG_BUNDLE = CommonModiscoActivator.getDefault().isDebugging()
			&& Boolean.parseBoolean(Platform.getDebugOption(AbstractMoDiscoCatalog.BUNDLE_DEBUG_ID));
	public static final String PROBLEM_MARKER = CommonModiscoActivator.getDefault().getBundle()
			.getSymbolicName()
			+ ".problemmarker"; //$NON-NLS-1$
	public static final String NAME_CONFLICTS_MARKER = CommonModiscoActivator.getDefault()
			.getBundle().getSymbolicName()
			+ ".nameconflicts"; //$NON-NLS-1$
	public static final String BROKEN_REF_MARKER = CommonModiscoActivator.getDefault().getBundle()
			.getSymbolicName()
			+ ".brokenref"; //$NON-NLS-1$
	public static final String NB_ROOTS_MARKER = CommonModiscoActivator.getDefault().getBundle()
			.getSymbolicName()
			+ ".nbroots"; //$NON-NLS-1$
	private static final String WRONG_ROOT_MARKER = CommonModiscoActivator.getDefault().getBundle()
			.getSymbolicName()
			+ ".wrongroot"; //$NON-NLS-1$;
	/** To avoid saving the catalog before it is fully initialized */
	private boolean saveEnabled = false;
	private static List<AbstractMoDiscoCatalog> catalogs = new ArrayList<AbstractMoDiscoCatalog>();
	private final MoDiscoResourceSet resourceSet = MoDiscoResourceSet.getResourceSetSingleton();
	private final Map<String, EObject> nameToInstalledEObjectMap = Collections
			.synchronizedMap(new HashMap<String, EObject>());
	private final Map<String, EObject> nameToConcreteInstalledEObjectMap = Collections
			.synchronizedMap(new HashMap<String, EObject>());
	private final Map<String, EObject> nameToWorkspaceEObjectMap = Collections
			.synchronizedMap(new HashMap<String, EObject>());
	private final Map<String, EObject> concreteUriToEObjectMap = Collections
			.synchronizedMap(new HashMap<String, EObject>());
	private final Map<EObject, Bundle> eObjectToBundleMap = Collections
			.synchronizedMap(new HashMap<EObject, Bundle>());
	private final File registryFile;
	private final File nonValidFilesFile;
	private final Map<String, URI> nameToConcreteUriMap = Collections
			.synchronizedMap(new HashMap<String, URI>());
	// private final Map<String, URI> modiscoUriMap = Collections
	// .synchronizedMap(new HashMap<String, URI>());
	private final List<ModiscoCatalogChangeListener> changeListeners = new ArrayList<ModiscoCatalogChangeListener>();
	private final Set<IFile> nonValidFiles = Collections.synchronizedSet(new HashSet<IFile>());
	private final List<NonValidFileListener> nonValidFileListeners = new ArrayList<NonValidFileListener>();
	private final Map<String, List<IFile>> nameToFileInConflict = new HashMap<String, List<IFile>>();

	protected AbstractMoDiscoCatalog() {
		AbstractMoDiscoCatalog.getCatalogs().add(this);
		IPath absolutePath = getActivator().getStateLocation().append(getRegistryFileName());
		this.registryFile = absolutePath.toFile();
		IPath nonValidFilesAbsolutePath = getActivator().getStateLocation().append(
				getRegistryFileName() + "_nonValid"); //$NON-NLS-1$
		this.nonValidFilesFile = nonValidFilesAbsolutePath.toFile();
		initInstalledRootObject();
		initWorkspaceRootObject();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
		this.saveEnabled = true;
		save();
	}

	protected abstract Plugin getActivator();

	private void initWorkspaceRootObject() {
		try {
			if (this.registryFile.exists()) {
				BufferedReader br = new BufferedReader(new FileReader(this.registryFile));
				String line = br.readLine();
				while (line != null) {
					URI uri = URI.createURI(line);
					String path = uri.toPlatformString(true);
					if (path != null) {
						IResource resource = ResourcesPlugin.getWorkspace().getRoot()
								.findMember(path);
						if (resource instanceof IFile) {
							IFile file = (IFile) resource;
							internalAddWSFile(file, false);
						}
					}
					line = br.readLine();
				}
				br.close();
			}
			if (this.nonValidFilesFile.exists()) {
				BufferedReader br = new BufferedReader(new FileReader(this.nonValidFilesFile));
				String line = br.readLine();
				while (line != null) {
					IPath path = new Path(line);
					IWorkspaceRoot wsr = ResourcesPlugin.getWorkspace().getRoot();
					IResource resource = wsr.findMember(path);
					if (resource == null || !resource.exists() || !(resource instanceof IFile)) {
						MoDiscoLogger.logError("The resource " + line + " has not be found.", //$NON-NLS-1$//$NON-NLS-2$
								CommonModiscoActivator.getDefault());
					} else {
						internalAddWSFile((IFile) resource, false);
					}
					line = br.readLine();
				}
				br.close();
			}
		} catch (Exception e) {
			MoDiscoLogger.logError(e, getActivator());
		}
	}

	/**
	 * Save method called by the plug-in activator
	 */
	public synchronized void save() {
		if (this.saveEnabled) {
			try {
				PrintStream ps = new PrintStream(this.registryFile);
				for (EObject rootObject : getNameToWorkspaceEObjectMap().values()) {
					ps.println(getURI(getRootObjectName(rootObject)));
				}
				ps.close();
				ps = new PrintStream(this.nonValidFilesFile);
				for (IResource resource : this.nonValidFiles) {
					ps.println(resource.getFullPath());
				}
				ps.close();
			} catch (FileNotFoundException e) {
				MoDiscoLogger.logError(e, getActivator());
			}
		}

	}

	protected Map<String, EObject> getNameToInstalledEObjectMap() {
		return this.nameToInstalledEObjectMap;
	}

	protected Map<String, EObject> getNameToWorkspaceEObjectMap() {
		return this.nameToWorkspaceEObjectMap;
	}

	private void initInstalledRootObject() {
		// (see also restoreInstalledURI)
		if (getRegistryExtensionPoint() != null) {
			IConfigurationElement[] configs = Platform.getExtensionRegistry()
					.getConfigurationElementsFor(getRegistryExtensionPoint());
			for (IConfigurationElement config : configs) {
				String fileName = config.getAttribute("file"); //$NON-NLS-1$
				URI uri = URI.createURI("platform:/plugin/" //$NON-NLS-1$
						+ config.getContributor().getName() + "/" + fileName); //$NON-NLS-1$
				openInstalledResource(config, uri);
			}
		}
	}

	private void openInstalledResource(final IConfigurationElement config, final URI uri) {
		EObject rootObject = openResource(uri, null);
		if (rootObject != null) {
			Bundle bundle;
			if (config != null) {
				bundle = Platform.getBundle(config.getContributor().getName());
			} else {
				bundle = Platform.getBundle(uri.segment(1));
			}
			if (AbstractMoDiscoCatalog.DEBUG_BUNDLE) {
				System.out.println(this.getClass().getSimpleName()
						+ ".openInstalledResource(): this.eObjectToBundleMap.put(rootObject=" //$NON-NLS-1$
						+ rootObject + ", bundle" + bundle + ")"); //$NON-NLS-1$ //$NON-NLS-2$
			}
			this.eObjectToBundleMap.put(rootObject, bundle);
			String name = getRootObjectName(rootObject);
			this.nameToInstalledEObjectMap.put(name, rootObject);
			Resource concreteResource;
			synchronized (MoDiscoResourceSet.getResourceSetSingleton()) {
				concreteResource = MoDiscoResourceSet.getResourceSetSingleton().getResource(uri,
						true);
			}
			if (concreteResource.getContents().size() > 0) {
				EObject concreteRootEObject = concreteResource.getContents().get(0);
				this.nameToConcreteInstalledEObjectMap.put(name, concreteRootEObject);
			}
		}
	}

	/**
	 * This method returns the name of the given rootObject. This method must be
	 * implemented by {@link AbstractMoDiscoCatalog} sub classes.
	 *
	 * @param rootObject
	 *            a resource root object
	 * @return rootObject name
	 */
	protected abstract String getRootObjectName(EObject rootObject);

	/**
	 * This method returns the id of the extension point that will be used to
	 * declare installed models which must be stored in the catalog. This method
	 * must be implemented by {@link AbstractMoDiscoCatalog} sub classes.
	 *
	 * @return the extension point id
	 */
	protected abstract String getRegistryExtensionPoint();

	/**
	 * Contains the procedure to open a resource, check it, and add it into the
	 * specific maps.
	 *
	 * @param uri
	 *            the resource URI to open
	 * @param file
	 *            the file containing the resource (markers will be applied on
	 *            this file).
	 * @return the root object of the resource
	 */
	protected synchronized EObject openResource(final URI uri, final IFile file) {
		EObject rootObject = null;
		Class<?> expectedClass = getRootClass();
		Resource resource = null;
		try {
			try {
				synchronized (this.resourceSet) {
					resource = this.resourceSet.getResource(uri, this);
				}
			} catch (Exception e) {
				if (e.getCause() instanceof ModiscoProtocolException) {
					ModiscoProtocolException mpe = (ModiscoProtocolException) e.getCause();
					if (file != null) {
						IMarker marker = file
								.createMarker(AbstractMoDiscoCatalog.BROKEN_REF_MARKER);
						marker.setAttribute(IMarker.MESSAGE,
								Messages.AbstractMoDiscoCatalog_brokenRef + uri.toString());
						marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
					}
					throw mpe;
				}
				throw e;
			}
			checkIsBroken(uri, file, resource);
			EObject root;
			synchronized (resource) {
				if (resource.getContents().size() != 1) {
					if (file != null) {
						IMarker marker = file.createMarker(AbstractMoDiscoCatalog.NB_ROOTS_MARKER);
						marker.setAttribute(IMarker.MESSAGE,
								Messages.AbstractMoDiscoCatalog_oneRootOnly);
						marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
					}
					throw new OpenResourceException(
							"One and only one root is expected in a model from the catalog; " //$NON-NLS-1$
									+ resource.getContents().size() + " found."); //$NON-NLS-1$
				}
				root = resource.getContents().get(0);
			}
			if (!ValidationJob.getInstance().validateSync(resource, file)) {
				if (file != null) {
					nonValidFileNotify(file, resource);
				}
				throw new OpenResourceException("Non valid model."); //$NON-NLS-1$
			}
			if (!expectedClass.isInstance(root)) {
				if (file != null) {
					IMarker marker = file.createMarker(AbstractMoDiscoCatalog.WRONG_ROOT_MARKER);
					marker.setAttribute(IMarker.MESSAGE,
							Messages.AbstractMoDiscoCatalog_wrontKindOfRoot);
					marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
				}
				throw new OpenResourceException("Wrong kind of root in " //$NON-NLS-1$
						+ uri.toString()
						+ " : " //$NON-NLS-1$
						+ root.getClass().getSimpleName()
						+ "; expected " + getRootClass().getSimpleName()); //$NON-NLS-1$
			}
			checkNameConflicts(uri, file, root);
			String rootObjectName = getRootObjectName(root);
			this.nameToConcreteUriMap.put(rootObjectName, uri);
			rootObject = copyToMoDiscoResource(root, rootObjectName);
			this.concreteUriToEObjectMap.put(uri.toString(), rootObject);
			postOpenResource(uri, file, rootObject);
			this.nonValidFiles.remove(file);
		} catch (OpenResourceException e) {
			if (uri.isPlatformPlugin()) {
				MoDiscoLogger.logError(e, "Failed to load: " + uri, getActivator()); //$NON-NLS-1$
			}
			invalidateWSFile(file);
		} catch (ModiscoProtocolException e) {
			if (uri.isPlatformPlugin()) {
				MoDiscoLogger.logError(e, "Failed to load: " + uri, getActivator()); //$NON-NLS-1$
			}
			invalidateWSFile(file);
		} catch (Exception e) {
			MoDiscoLogger.logError(e, "Failed to load: " + uri, getActivator()); //$NON-NLS-1$
			invalidateWSFile(file);
		} finally {
			// avoid platform:/ resources in the MoDiscoResourceSet
			if (resource != null) {
				synchronized (this.resourceSet) {
					this.resourceSet.getResources().remove(resource);
				}
			}
		}
		return rootObject;
	}

	protected abstract void postOpenResource(final URI uri, final IFile file, final EObject root)
			throws Exception;

	private void checkIsBroken(final URI uri, final IFile file, final Resource resource)
			throws OpenResourceException {
		boolean brokenRefFound = false;
		for (Diagnostic diagnostic : resource.getErrors()) {
			if (diagnostic instanceof BrokenRefException) {
				brokenRefFound = true;
				BrokenRefException brokenRef = (BrokenRefException) diagnostic;
				if (file != null) {
					try {
						IMarker marker = file
								.createMarker(AbstractMoDiscoCatalog.BROKEN_REF_MARKER);
						marker.setAttribute(
								IMarker.MESSAGE,
								Messages.AbstractMoDiscoCatalog_brokenRef
										+ brokenRef.getTargetLocation());
						marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
						marker.setAttribute(EValidator.URI_ATTRIBUTE, brokenRef.getLocation());
					} catch (CoreException e) {
						MoDiscoLogger.logError(e, "Failed to load: " + uri, getActivator()); //$NON-NLS-1$
					}
				} else {
					MoDiscoLogger.logError(brokenRef, "Failed to load: " + uri, getActivator()); //$NON-NLS-1$
				}
			}
		}
		if (brokenRefFound) {
			throw new OpenResourceException("Broken references."); //$NON-NLS-1$
		}
	}

	private EObject copyToMoDiscoResource(final EObject root, final String rootObjectName) {
		if (getMoDiscoSubProtocol() != null) {
			URI modiscoUri = URI.createURI("modisco:/" //$NON-NLS-1$
					+ getMoDiscoSubProtocol() + "/" //$NON-NLS-1$
					+ rootObjectName);
			Resource modiscoResource;
			synchronized (this.resourceSet) {
				modiscoResource = this.resourceSet.getResource(modiscoUri, false);
				if (modiscoResource == null) {
					modiscoResource = this.resourceSet.createResource(modiscoUri);
				}
			}
			modiscoResource.getContents().clear();
			EObject modiscoResourceRoot = EcoreUtil.copy(root);
			modiscoResource.getContents().add(modiscoResourceRoot);
			// this.modiscoUriMap.put(rootObjectName, modiscoUri);
			return modiscoResourceRoot;
		}
		return root;
	}

	private void checkNameConflicts(final URI uri, final IResource file, final EObject rootObject)
			throws ElementWithSameNameException {
		EObject objectWithSameName = getNameToWorkspaceEObjectMap().get(
				getRootObjectName(rootObject));
		if (objectWithSameName != null) {
			URI registeredURI = this.nameToConcreteUriMap.get(getRootObjectName(rootObject));
			if (registeredURI != null && uri.isPlatformResource()
					&& registeredURI.isPlatformResource() && !uri.equals(registeredURI)) {
				try {
					IMarker marker = file
							.createMarker(AbstractMoDiscoCatalog.NAME_CONFLICTS_MARKER);
					marker.setAttribute(IMarker.MESSAGE,
							NLS.bind(Messages.AbstractMoDiscoCatalog_nameConflict, registeredURI));
					marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
				} catch (CoreException e1) {
					MoDiscoLogger.logError(e1, "Failed to add markers to " //$NON-NLS-1$
							+ file.getLocation().toString(), getActivator());
				}
				synchronized (this.nameToFileInConflict) {
					if (file instanceof IFile) {
						IFile iFile = (IFile) file;
						List<IFile> filesInConflict = this.nameToFileInConflict
								.get(getRootObjectName(rootObject));
						if (filesInConflict == null) {
							filesInConflict = new ArrayList<IFile>();
							this.nameToFileInConflict.put(getRootObjectName(rootObject),
									filesInConflict);
						}
						filesInConflict.add(iFile);
					}
				}
				throw new ElementWithSameNameException(uri + " in conflicts with " //$NON-NLS-1$
						+ registeredURI);
			}
		}
	}

	/**
	 * This method returns the string representing the modisco sub protocol
	 * (modisco:/&lt;subprotocol&gt;/), that will be used to access the
	 * resources stored by the {@link AbstractMoDiscoCatalog} sub class. This
	 * method must be implemented by {@link AbstractMoDiscoCatalog} sub classes.
	 *
	 * @return the string representing the modisco sub protocol
	 */
	protected abstract String getMoDiscoSubProtocol();

	/**
	 * This method returns the expected root element. This method must be
	 * implemented by {@link AbstractMoDiscoCatalog} sub classes.
	 */
	protected abstract Class<?> getRootClass();

	/**
	 * This methods returns the root objects of all the resources contained in
	 * the catalog.
	 *
	 * @return root objects
	 */
	public final Collection<EObject> getAllRootObjects() {
		return getAllRootObjectMap().values();
	}

	protected Map<String, EObject> getAllRootObjectMap() {
		HashMap<String, EObject> allRootObject = new HashMap<String, EObject>();
		allRootObject.putAll(this.nameToInstalledEObjectMap);
		allRootObject.putAll(this.nameToWorkspaceEObjectMap);
		return allRootObject;
	}

	/**
	 * This method returns the root object of the resource having for name the
	 * "name" parameter value.
	 *
	 * @param name
	 *            the name of a resource contained in the catalog
	 * @return a root object
	 */
	public final EObject getRootObject(final String name) {
		return getAllRootObjectMap().get(name);
	}

	public final synchronized void scheduleAddWSFile(final IFile declarationFile) {
		Runnable action = new Runnable() {
			public void run() {
				synchronized (AbstractMoDiscoCatalog.this) {
					if (AbstractMoDiscoCatalog.SCHEDULING_DEBUG) {
						System.out
								.println("Executing add ws file: " + this + " file=" + declarationFile); //$NON-NLS-1$ //$NON-NLS-2$
					}
					internalAddWSFile(declarationFile, false);
				}
			}
		};
		if (AbstractMoDiscoCatalog.SCHEDULING_DEBUG) {
			System.out.println("scheduleAddWSFile: " + action + " file=" + declarationFile); //$NON-NLS-1$ //$NON-NLS-2$
		}
		CatalogJob.getInstance().addAction(action);
	}

	private synchronized void invalidateWSFile(final IFile file) {
		if (file != null) {
			this.nonValidFiles.add(file);
			scheduleRemoveWSFile(file);
		}
	}

	protected abstract void preRemove(final IFile declarationFile, final String pathName,
			final EObject oldRootObject);

	/**
	 * This method must no be used outside this class.
	 *
	 * @param declarationFile
	 * @param pathName
	 */
	void removeWSFile(final IFile declarationFile, final String pathName) {
		if (AbstractMoDiscoCatalog.SCHEDULING_DEBUG) {
			System.out.println(this.getClass().getSimpleName()
					+ ".removeWSFile(): file=" + declarationFile); //$NON-NLS-1$
		}
		URI rootObjectURI = URI.createPlatformResourceURI(pathName, false);
		EObject oldRootObject = this.concreteUriToEObjectMap.get(rootObjectURI.toString());
		preRemove(declarationFile, pathName, oldRootObject);
		if (oldRootObject != null) {
			String rootObjectName = getRootObjectName(oldRootObject);
			if (AbstractMoDiscoCatalog.SCHEDULING_DEBUG
					&& !this.nameToWorkspaceEObjectMap.containsKey(rootObjectName)) {
				System.out
						.println(this.getClass().getSimpleName()
								+ ".removeWSFile(): rootObject not contained in this.nameToWorkspaceEObjectMap"); //$NON-NLS-1$
			}
			this.nameToWorkspaceEObjectMap.remove(rootObjectName);
			this.concreteUriToEObjectMap.remove(rootObjectURI.toString());
			this.nameToConcreteUriMap.remove(rootObjectName);
			if (AbstractMoDiscoCatalog.SCHEDULING_DEBUG) {
				System.out.println(this.getClass().getSimpleName()
						+ ".removeWSFiles: oldRootObject=" + oldRootObject); //$NON-NLS-1$
			}
			Resource oldResource = oldRootObject.eResource();
			if (oldResource != null) {
				oldResource.unload();
				synchronized (this.resourceSet) {
					this.resourceSet.getResources().remove(oldResource);
				}
			}
			EObject installedVersion = this.nameToConcreteInstalledEObjectMap.get(rootObjectName);
			if (installedVersion != null) {
				if (AbstractMoDiscoCatalog.SCHEDULING_DEBUG
						&& !this.nameToWorkspaceEObjectMap.containsKey(rootObjectName)) {
					System.out
							.println(this.getClass().getSimpleName()
									+ ".removeWSFile(): replacing the removed ws root object by the installed version."); //$NON-NLS-1$
				}
				EObject modiscoResourceRoot = copyToMoDiscoResource(installedVersion,
						rootObjectName);
				this.nameToInstalledEObjectMap.put(rootObjectName, modiscoResourceRoot);
				restoreInstalledURI(rootObjectName, modiscoResourceRoot);
				postRestoreInstalledURI(modiscoResourceRoot);
				updateNotify(modiscoResourceRoot, null);
				// MoDiscoResourceSet.getResourceSetSingleton().aResourceHasBeenUnLoaded(oldResource);
				MoDiscoResourceSet.getResourceSetSingleton().removeListener(this, rootObjectURI);
				MoDiscoResourceSet.getResourceSetSingleton().aResourceHasBeenLoaded(
						modiscoResourceRoot.eResource());
			} else {
				removeNotify(declarationFile);
				if (oldResource != null) {
					MoDiscoResourceSet.getResourceSetSingleton().aResourceHasBeenUnLoaded(
							oldResource);
				}
			}
			synchronized (this.nameToFileInConflict) {
				List<IFile> filesInConflict = this.nameToFileInConflict.get(rootObjectName);
				if (filesInConflict != null) {
					for (IFile fileInConflict : filesInConflict) {
						scheduleUpdateWSFile(fileInConflict);
					}
				}
			}
		} else {
			if (AbstractMoDiscoCatalog.SCHEDULING_DEBUG) {
				System.out.println(this.getClass().getSimpleName()
						+ ".removeWSFiles: oldRootObject=null"); //$NON-NLS-1$
			}
		}
		save();
	}

	/**
	 * @param modiscoResourceRoot
	 *            the root object of the MoDisco resource
	 */
	protected void postRestoreInstalledURI(final EObject modiscoResourceRoot) {
		// to be implemented in derived classes
	}

	/**
	 * Put the URI for the installed element back in the
	 * {@link #nameToConcreteUriMap}. The URI is reloaded from the extension
	 * registry, because it was lost when a workspace version replaced the
	 * installed version.
	 *
	 * @param modiscoResourceRoot
	 */
	private void restoreInstalledURI(final String rootObjectName, final EObject modiscoResourceRoot) {
		// the filename must be the same as the object name (this is validated)
		String rootObjectFileName = rootObjectName + "." + getFileExtension(); //$NON-NLS-1$
		if (getRegistryExtensionPoint() != null) {
			IConfigurationElement[] configs = Platform.getExtensionRegistry()
					.getConfigurationElementsFor(getRegistryExtensionPoint());
			for (IConfigurationElement config : configs) {
				String fileName = config.getAttribute("file"); //$NON-NLS-1$
				if (rootObjectFileName.equals(fileName)) {
					URI uri = URI.createURI("platform:/plugin/" //$NON-NLS-1$
							+ config.getContributor().getName() + "/" + fileName); //$NON-NLS-1$
					Bundle bundle = Platform.getBundle(config.getContributor().getName());
					if (AbstractMoDiscoCatalog.DEBUG_BUNDLE) {
						System.out.println(this.getClass().getSimpleName()
								+ ".restoreInstalledURI(): this.eObjectToBundleMap.put(rootObject=" //$NON-NLS-1$
								+ modiscoResourceRoot + ", bundle=" + bundle + ")"); //$NON-NLS-1$ //$NON-NLS-2$
					}
					this.eObjectToBundleMap.put(modiscoResourceRoot, bundle);
					this.nameToConcreteUriMap.put(rootObjectName, uri);
				}
			}
		}
	}

	public void scheduleRemoveWSFiles(final List<IFile> toBeRemoved) {
		List<IStatus> statusList = new ArrayList<IStatus>();
		final Map<IFile, String> pathNames = new HashMap<IFile, String>();
		for (IFile file : toBeRemoved) {
			try {
				pathNames.put(file, getPath(file));
			} catch (RuntimeException e) {
				IStatus status = new Status(IStatus.ERROR, CommonModiscoActivator.PLUGIN_ID,
						"An error happen while getting path of: " + file); //$NON-NLS-1$
				statusList.add(status);
			}
		}
		Runnable action = new Runnable() {
			public void run() {
				synchronized (AbstractMoDiscoCatalog.this) {
					for (IFile declarationFile : pathNames.keySet()) {
						if (AbstractMoDiscoCatalog.SCHEDULING_DEBUG) {
							System.out
									.println("executing remove ws files: " + this + "file=" + declarationFile); //$NON-NLS-1$ //$NON-NLS-2$
						}
						removeWSFile(declarationFile, pathNames.get(declarationFile));
					}
				}
			}
		};
		if (AbstractMoDiscoCatalog.SCHEDULING_DEBUG) {
			System.out.println("scheduleRemoveWSFiles: " + action); //$NON-NLS-1$
		}
		CatalogJob.getInstance().addAction(action);
	}

	public synchronized void scheduleRemoveWSFile(final IFile declarationFile) {
		final String pathName = getPath(declarationFile);
		Runnable action = new Runnable() {
			public void run() {
				if (AbstractMoDiscoCatalog.SCHEDULING_DEBUG) {
					System.out
							.println("executing remove ws file: " + this + " file=" + declarationFile); //$NON-NLS-1$ //$NON-NLS-2$
				}
				removeWSFile(declarationFile, pathName);
			}
		};
		if (AbstractMoDiscoCatalog.SCHEDULING_DEBUG) {
			System.out.println("scheduleRemoveWSFile: " + action + " file=" + declarationFile); //$NON-NLS-1$ //$NON-NLS-2$
		}
		CatalogJob.getInstance().addAction(action);
	}

	private String getPath(final IFile declarationFile) {
		if (declarationFile == null) {
			throw new IllegalArgumentException("declarationFile is null"); //$NON-NLS-1$
		}
		if (declarationFile.getProject() == null) {
			throw new IllegalStateException("declarationFile's project is null"); //$NON-NLS-1$
		}
		final String pathName = declarationFile.getProject().getName() + "/" //$NON-NLS-1$
				+ declarationFile.getProjectRelativePath().toString();
		return pathName;
	}

	/**
	 * This method returns the nsURI of a given rootObject. This method must be
	 * implemented by {@link AbstractMoDiscoCatalog} sub classes.
	 *
	 * @param rootObject
	 *            a root eObject
	 * @return a nsURI
	 */
	protected abstract String getRootObjectNsUri(EObject rootObject);

	/**
	 * This method must not be used outside this class.
	 */
	final synchronized EObject internalAddWSFile(final IFile declarationFile, final boolean update) {
		if (declarationFile == null) {
			throw new IllegalArgumentException("declarationFile must not be null"); //$NON-NLS-1$
		}

		// Bug 317154 - Modisco name conflicts when a querySet
		// is under the src directory
		if (FileUtils.isInOutputLocation(declarationFile)) {
			return null;
		}

		if (AbstractMoDiscoCatalog.SCHEDULING_DEBUG) {
			System.out.println("internalAddWSFile: file=" + declarationFile); //$NON-NLS-1$
		}
		EObject rootEObject = null;
		if (declarationFile.exists()
				&& getFileExtension().equals(declarationFile.getFileExtension())) {
			try {
				String pathName = declarationFile.getProject().getName() + "/" //$NON-NLS-1$
						+ declarationFile.getProjectRelativePath().toString();
				URI rootObjectURI = URI.createPlatformResourceURI(pathName, false);
				if (update) {
					declarationFile.deleteMarkers(AbstractMoDiscoCatalog.PROBLEM_MARKER, true,
							IResource.DEPTH_ONE);
				}
				rootEObject = openResource(rootObjectURI, declarationFile);
				if (rootEObject != null) {
					getNameToWorkspaceEObjectMap().put(getRootObjectName(rootEObject), rootEObject);
					this.resourceSet.aResourceHasBeenLoaded(rootEObject.eResource());
					if (update) {
						updateNotify(rootEObject, declarationFile);
					} else {
						addNotify(rootEObject, declarationFile);
					}
				}
			} catch (Exception e) {
				final String verb;
				if (update) {
					verb = "update"; //$NON-NLS-1$
				} else {
					verb = "add"; //$NON-NLS-1$
				}
				String message = "Failed to " + verb + " a workspace file in " //$NON-NLS-1$ //$NON-NLS-2$
						+ this.getClass().getSimpleName() + " : " + declarationFile.getLocation(); //$NON-NLS-1$
				MoDiscoLogger.logError(e, message, getActivator());
			}
			save();
		}
		return rootEObject;
	}

	/**
	 * This method is used by builders to update resources in the catalog.
	 *
	 * @param declarationFile
	 *            the EMF resource file
	 * @return the root object of the resource
	 */
	public final synchronized void scheduleUpdateWSFile(final IFile declarationFile) {
		final String path = getPath(declarationFile);
		Runnable action = new Runnable() {
			public void run() {
				synchronized (AbstractMoDiscoCatalog.this) {
					if (AbstractMoDiscoCatalog.SCHEDULING_DEBUG) {
						System.out
								.println("executing UpdateWSFile: " + this + " file=" + declarationFile); //$NON-NLS-1$ //$NON-NLS-2$
					}
					if (declarationFile.exists()) {
						internalAddWSFile(declarationFile, true);
					} else {
						removeWSFile(declarationFile, path);
					}
				}
			}
		};
		if (AbstractMoDiscoCatalog.SCHEDULING_DEBUG) {
			System.out.println("scheduleUpdateWSFile: " + action + " file=" + declarationFile); //$NON-NLS-1$ //$NON-NLS-2$
		}
		CatalogJob.getInstance().addAction(action);
	}

	public void addNotify(final EObject rootObject, final IFile file) {
		if (AbstractMoDiscoCatalog.SCHEDULING_DEBUG) {
			System.out.println(this.getClass().getSimpleName() + ".addNotify(): " + rootObject); //$NON-NLS-1$
		}
		final List<ModiscoCatalogChangeListener> tmpChangeListeners = this.changeListeners;
		Runnable runnable = new Runnable() {
			public void run() {
				for (ModiscoCatalogChangeListener listener : tmpChangeListeners) {
					if (AbstractMoDiscoCatalog.SCHEDULING_DEBUG) {
						System.out
								.println(AbstractMoDiscoCatalog.this.getClass().getSimpleName()
										+ ".addNotify() executing: " + rootObject + " -> " + listener.toString()); //$NON-NLS-1$ //$NON-NLS-2$
					}
					listener.added(rootObject, file);
				}
			}
		};
		NotificationJob.getInstance().addAction(runnable);
	}

	public void removeNotify(final IFile file) {
		if (AbstractMoDiscoCatalog.SCHEDULING_DEBUG) {
			System.out.println(this.getClass().getSimpleName() + ".removeNotify(): " + file); //$NON-NLS-1$
		}
		final List<ModiscoCatalogChangeListener> tmpChangeListeners = this.changeListeners;
		Runnable runnable = new Runnable() {
			public void run() {
				for (ModiscoCatalogChangeListener listener : tmpChangeListeners) {
					if (AbstractMoDiscoCatalog.SCHEDULING_DEBUG) {
						System.out.println(AbstractMoDiscoCatalog.this.getClass().getSimpleName()
								+ ".removeNotify() executing: " + listener.toString()); //$NON-NLS-1$
					}
					listener.removed(file);
				}
			}
		};
		NotificationJob.getInstance().addAction(runnable);
	}

	public void updateNotify(final EObject rootObject, final IFile file) {
		if (AbstractMoDiscoCatalog.SCHEDULING_DEBUG) {
			System.out.println(this.getClass().getSimpleName() + ".updateNotify(): " + rootObject); //$NON-NLS-1$
		}
		final List<ModiscoCatalogChangeListener> tmpChangeListeners = this.changeListeners;
		Runnable runnable = new Runnable() {
			public void run() {
				for (ModiscoCatalogChangeListener listener : tmpChangeListeners) {
					if (AbstractMoDiscoCatalog.SCHEDULING_DEBUG) {
						System.out
								.println(AbstractMoDiscoCatalog.this.getClass().getSimpleName()
										+ ".updateNotify() executing:" + rootObject + " -> " + listener.toString()); //$NON-NLS-1$ //$NON-NLS-2$
					}
					listener.changed(rootObject, file);
				}
			}
		};
		NotificationJob.getInstance().addAction(runnable);
	}

	public void addNonValidFileListener(final NonValidFileListener nonValidFileListener) {
		if (!this.nonValidFileListeners.contains(nonValidFileListener)) {
			this.nonValidFileListeners.add(nonValidFileListener);
		}
	}

	public void removeNonValidFileListener(final NonValidFileListener nonValidFileListener) {
		this.nonValidFileListeners.remove(nonValidFileListener);
	}

	private void nonValidFileNotify(final IFile file, final Resource resource) {
		for (NonValidFileListener nonValidFileListener : this.nonValidFileListeners) {
			nonValidFileListener.nonValidFile(file, resource);
		}
	}

	/**
	 * This method returns the URI of the file containing the root object with
	 * the given name.
	 *
	 * @param name
	 *            a root object name
	 * @return the URI of a file
	 */
	public URI getURI(final String name) {
		if (name != null) {
			return this.nameToConcreteUriMap.get(name);
		}
		return null;
	}

	/** A listener for change notifications */
	public interface ModiscoCatalogChangeListener extends EventListener {
		void changed(final EObject eObject, final IFile file);

		void added(final EObject eObject, final IFile file);

		void removed(final IFile file);
	}

	/** A listener for non valid file detection notification */
	public interface NonValidFileListener {
		void nonValidFile(IFile file, Resource resource);
	}

	/**
	 * This method is used to add a listener for catalog changes. This method is
	 * called by the views presenting the catalog contents
	 *
	 * @param modiscoCatalogChangeListener
	 *            a listener
	 */
	public void addChangeListener(final ModiscoCatalogChangeListener modiscoCatalogChangeListener) {
		if (AbstractMoDiscoCatalog.SCHEDULING_DEBUG) {
			System.out.println(this.getClass().getSimpleName()
					+ ".addChangeListener(): " + modiscoCatalogChangeListener.toString()); //$NON-NLS-1$
		}
		if (!this.changeListeners.contains(modiscoCatalogChangeListener)) {
			this.changeListeners.add(modiscoCatalogChangeListener);
		}
	}

	/**
	 * This method is used to remove a catalog change listener. This method is
	 * called by the views presenting the catalog contents
	 *
	 * @param modiscoCatalogChangeListener
	 *            listener to remove
	 */
	public void removeChangeListener(final ModiscoCatalogChangeListener modiscoCatalogChangeListener) {
		if (AbstractMoDiscoCatalog.SCHEDULING_DEBUG) {
			System.out.println(this.getClass().getSimpleName()
					+ ".removeChangeListener(): " + modiscoCatalogChangeListener.toString()); //$NON-NLS-1$
		}
		this.changeListeners.remove(modiscoCatalogChangeListener);
	}

	/**
	 * This method is called by builders to clean the catalog contents.
	 *
	 * @param project
	 *            project to clean
	 */
	public synchronized void clean(final IProject project) {
		// remove error markers
		try {
			project.accept(new IResourceVisitor() {
				public boolean visit(final IResource resource) throws CoreException {
					String fileExtension = resource.getFileExtension();
					if (getFileExtension().equals(fileExtension)) {
						try {
							if (resource.exists()) {
								resource.deleteMarkers(ValidationJob.EMF_PROBLEM_MARKER, true,
										IResource.DEPTH_ONE);
								resource.deleteMarkers(AbstractMoDiscoCatalog.PROBLEM_MARKER, true,
										IResource.DEPTH_ONE);
							}
						} catch (CoreException e) {
							final String message = "An error happened while removing markers"; //$NON-NLS-1$
							MoDiscoLogger.logError(e, message, CommonModiscoActivator.getDefault());
						}
					}
					return true;
				}
			});
		} catch (CoreException e) {
			MoDiscoLogger.logError(e, getActivator());
		}

		// remove non-valid files in the cleaned project
		List<IFile> oldNonValidFiles = new ArrayList<IFile>(this.nonValidFiles);
		this.nonValidFiles.clear();
		for (IFile nonValidFile : oldNonValidFiles) {
			if (nonValidFile.getProject() != project) {
				this.nonValidFiles.add(nonValidFile);
			}
		}

		List<String> toBeRemovedList = new ArrayList<String>();
		List<IFile> toBeRemovedFileList = new ArrayList<IFile>();
		for (String rootObjectName : getNameToWorkspaceEObjectMap().keySet()) {
			EObject rootObject = getNameToWorkspaceEObjectMap().get(rootObjectName);
			if (rootObject.eResource() == null) {
				toBeRemovedList.add(rootObjectName);
			} else {
				URI uri = getURI(rootObjectName);
				if (uri.isPlatformResource()) {
					IFile file = (IFile) ResourcesPlugin.getWorkspace().getRoot()
							.findMember(uri.toPlatformString(true));
					if (file != null && project == file.getProject()) {
						toBeRemovedFileList.add(file);
					}
				}
			}
		}
		for (String toBeRemoved : toBeRemovedList) {
			getNameToWorkspaceEObjectMap().remove(toBeRemoved);
		}
		if (!toBeRemovedList.isEmpty()) {
			removeNotify(null);
		}
		for (IFile file : toBeRemovedFileList) {
			scheduleRemoveWSFile(file);
		}
		if (!toBeRemovedFileList.isEmpty()) {
			removeNotify(null);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	public void aListenedResourceHasChanged(final URI resourceUri, final URI dependingResourceURI) {
		IFile declarationFile = null;
		URI uri;
		if (dependingResourceURI.isPlatformPlugin()) {
			openInstalledResource(null, dependingResourceURI);
		} else {
			if (dependingResourceURI.isPlatformResource()) {
				uri = dependingResourceURI;
				declarationFile = ResourcesPlugin.getWorkspace().getRoot()
						.getFile(new Path(uri.toPlatformString(true)));
			} else if (dependingResourceURI.scheme().equals("modisco")) { //$NON-NLS-1$
				uri = getURI(dependingResourceURI.segment(1));
				declarationFile = ResourcesPlugin.getWorkspace().getRoot()
						.getFile(new Path(uri.toPlatformString(true)));
			} else {
				MoDiscoLogger.logError("Unexpected uri: " //$NON-NLS-1$
						+ dependingResourceURI, getActivator());
				return;
			}
			if (MoDiscoResourceSet.DEBUG) {
				String message = this.getClass().getSimpleName()
						+ ".aListenedResourceHasChanged(): Reloading: file= " //$NON-NLS-1$
						+ declarationFile;
				System.out.println(message);
				// IStatus status = new Status(IStatus.INFO,
				// getActivator().getBundle()
				// .getSymbolicName(), message);
				// getActivator().getLog().log(status);
			}
			scheduleUpdateWSFile(declarationFile);
		}
	}

	private final String getRegistryFileName() {
		return this.getClass().getName() + "Registry"; //$NON-NLS-1$
	}

	/**
	 * This method returns the installed bundle containing the resource file
	 * from which the eObject parameter has been created
	 *
	 * @param rootObject
	 *            an eObject (must be a resource root)
	 * @return the installed bundle containing eObject
	 */
	protected Bundle getBundle(final EObject rootObject) {
		return this.eObjectToBundleMap.get(rootObject);
	}

	public static List<AbstractMoDiscoCatalog> getCatalogs() {
		return AbstractMoDiscoCatalog.catalogs;
	}

	public void resourceChanged(final IResourceChangeEvent event) {
		try {
			IResource resource = event.getResource();
			if (resource instanceof IProject) {
				IProject project = (IProject) resource;
				if (ProjectUtils.isMoDiscoProject(project)) {
					if (event.getType() == IResourceChangeEvent.PRE_CLOSE
							|| event.getType() == IResourceChangeEvent.PRE_DELETE) {
						final List<IFile> toBeRemoved = new ArrayList<IFile>();
						project.accept(new IResourceVisitor() {
							public boolean visit(final IResource visitedResource)
									throws CoreException {
								if (visitedResource instanceof IFile) {
									IFile file = (IFile) visitedResource;
									if (AbstractMoDiscoCatalog.this.getFileExtension().equals(
											file.getFileExtension())) {
										toBeRemoved.add(file);
										AbstractMoDiscoCatalog.this.nonValidFiles.remove(file);
									}
								}
								return true;
							}
						});
						AbstractMoDiscoCatalog.this.scheduleRemoveWSFiles(toBeRemoved);
					}
				}
			} else if (event.getType() == IResourceChangeEvent.POST_CHANGE
					&& event.getResource() == null) {
				checkOpenResource(event);
			}
		} catch (CoreException e) {
			MoDiscoLogger.logError(e, CommonModiscoActivator.getDefault());
		}
	}

	private void checkOpenResource(final IResourceChangeEvent event) throws CoreException {
		IResourceDelta delta = event.getDelta();
		IResourceDelta[] projectDeltas = delta.getAffectedChildren();
		for (IResourceDelta projectDelta : projectDeltas) {
			int kind = projectDelta.getKind();
			int flags = projectDelta.getFlags();
			if (kind == IResourceDelta.CHANGED && ((flags & IResourceDelta.OPEN) != 0)) {
				IProject project = (IProject) projectDelta.getResource();
				if (project.isOpen() && ProjectUtils.isMoDiscoProject(project)) {
					project.accept(new IResourceVisitor() {
						public boolean visit(final IResource visitedResource) throws CoreException {
							if (visitedResource instanceof IFile) {
								IFile file = (IFile) visitedResource;
								AbstractMoDiscoCatalog.this.scheduleAddWSFile(file);
							}
							return true;
						}
					});
				}
			}
		}
	}

	public abstract String getFileExtension();

	public synchronized void revalidateAll(final IProject project) {
		if (AbstractMoDiscoCatalog.SCHEDULING_DEBUG) {
			System.out.println("revalidateAll: project=" + project); //$NON-NLS-1$
		}
		for (String name : getNameToWorkspaceEObjectMap().keySet()) {
			URI uri = this.nameToConcreteUriMap.get(name);
			final IFile file = ModelUtils.getIFileFromPlatformURI(uri);
			if (file != null) {
				if (file.getProject() == project && !this.nonValidFiles.contains(file)) {
					scheduleUpdateWSFile(file);
					// try {
					// URI modiscoURI = this.modiscoUriMap.get(name);
					// final Resource resource =
					// this.resourceSet.getResource(modiscoURI, this);
					// if (resource != null) {
					// ValidationJob.getInstance().validateAsync(resource, file,
					// new ValidationJob.Callback() {
					// public void validated(final boolean result) {
					// validatedCallback(file, result);
					// }
					// });
					// } else {
					// updateWSFile(file);
					// }
					// } catch (IOException e) {
					// MoDiscoLogger.logError(e, getActivator());
					// }
				}
			} else {
				MoDiscoLogger
						.logError(
								"No file found for: " + uri.toString(), CommonModiscoActivator.getDefault()); //$NON-NLS-1$
			}
		}
		for (IFile file : new ArrayList<IFile>(this.nonValidFiles)) {
			if (file.getProject() == project) {
				scheduleUpdateWSFile(file);
			}
		}
	}

	synchronized void validatedCallback(final IFile file, final boolean result) {
		if (result) {
			this.nonValidFiles.remove(file);
		} else {
			invalidateWSFile(file);
		}
	}

	/**
	 * Blocks until the catalog is completely built (the builders are finished).
	 * <p>
	 * Only use this method if you know what you are doing, since it can
	 * deadlock if used improperly.
	 * <p>
	 * See also: {@link AbstractMoDiscoCatalog#whenBuilt(Runnable) whenBuilt}
	 */
	public void waitUntilBuilt() {
		AbstractMoDiscoCatalog.joinJobs();
	}

	/**
	 * Schedules the given {@link Runnable} to be executed when the catalog has
	 * finished building (waits until the build jobs are all finished).
	 *
	 * @param runnable
	 *            the runnable to be run when the catalog has finished building
	 */
	public static void whenBuilt(final Runnable runnable) {
		Job job = new Job(Messages.AbstractMoDiscoCatalog_waitingCatalogJobName) {
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				AbstractMoDiscoCatalog.joinJobs();
				runnable.run();
				return Status.OK_STATUS;
			}
		};
		job.setSystem(true);
		job.schedule();
	}

	static void joinJobs() {
		try {
			// ValidationJob.getInstance().join();
			// CatalogJob.getInstance().join();
			Job.getJobManager().join(ResourcesPlugin.FAMILY_MANUAL_REFRESH, null);
			Job.getJobManager().join(ResourcesPlugin.FAMILY_AUTO_REFRESH, null);
			Job.getJobManager().join(ResourcesPlugin.FAMILY_MANUAL_BUILD, null);
			Job.getJobManager().join(ResourcesPlugin.FAMILY_AUTO_BUILD, null);
		} catch (InterruptedException e) {
			MoDiscoLogger.logError(e, "Unexpected error.", CommonModiscoActivator.getDefault()); //$NON-NLS-1$
		}
	}

	protected static boolean belongsTo(final Object family) {
		return family == ResourcesPlugin.FAMILY_MANUAL_BUILD
				|| family == ResourcesPlugin.FAMILY_AUTO_BUILD
				|| family == ResourcesPlugin.FAMILY_MANUAL_REFRESH;
	}

	/**
	 * This method is used by builders to update resources in the catalog.
	 *
	 * @param declarationFile
	 *            the EMF resource file
	 * @return the root object of the resource
	 * @deprecated This method has been replaced by
	 *             {@link AbstractMoDiscoCatalog#scheduleUpdateWSFile(IFile)}
	 *             This method will be removed in version 0.10.0. (since 0.8.0
	 *             M7)
	 */
	@Deprecated
	public final EObject updateWSFile(final IFile declarationFile) {
		scheduleAddWSFile(declarationFile);
		AbstractMoDiscoCatalog.joinJobs();
		URI uri = URI.createFileURI(declarationFile.getLocation().toFile().getPath());
		return this.concreteUriToEObjectMap.get(uri);
	}

	/**
	 * This method is used by builders to add resources into the catalog.
	 *
	 * @param declarationFile
	 *            the EMF resource file
	 * @return the root object of the resource
	 * @deprecated This method has been replaced by
	 *             {@link AbstractMoDiscoCatalog#scheduleAddWSFile(IFile)} This
	 *             method will be removed in version 0.10.0. (since 0.8.0 M7)
	 */
	@Deprecated
	public final EObject addWSFile(final IFile declarationFile) {
		scheduleAddWSFile(declarationFile);
		AbstractMoDiscoCatalog.joinJobs();
		URI uri = URI.createFileURI(declarationFile.getLocation().toFile().getPath());
		return this.concreteUriToEObjectMap.get(uri);
	}

	/**
	 * This method is used by builders to remove resources from the catalog.
	 *
	 * @param declarationFile
	 *            the EMF resource file
	 * @deprecated This method has been replaced by
	 *             {@link AbstractMoDiscoCatalog#scheduleRemoveWSFile(IFile)}.
	 *             This method will be removed in version 0.10.0. (since 0.8.0
	 *             M7)
	 */
	@Deprecated
	public void removeWSFile(final IFile declarationFile) {
		scheduleRemoveWSFile(declarationFile);
		AbstractMoDiscoCatalog.joinJobs();
	}

	/**
	 * This method is used by builders to update resources in the catalog.
	 *
	 * @param declarationFile
	 *            the EMF resource file
	 * @param update
	 *            whether the resource is being updated instead of added
	 * @return the root object of the resource
	 * @deprecated This method has been replaced by
	 *             {@link AbstractMoDiscoCatalog#scheduleAddWSFile(IFile)} and
	 *             {@link AbstractMoDiscoCatalog#scheduleUpdateWSFile(IFile)}.
	 *             This method will be removed in version 0.10.0. (since 0.8.0
	 *             M7)
	 */
	@Deprecated
	public final EObject addWSFile(final IFile declarationFile, final boolean update) {
		if (update) {
			scheduleUpdateWSFile(declarationFile);
		} else {
			scheduleAddWSFile(declarationFile);
		}
		AbstractMoDiscoCatalog.joinJobs();
		URI uri = URI.createFileURI(declarationFile.getLocation().toFile().getPath());
		return this.concreteUriToEObjectMap.get(uri);
	}

}
