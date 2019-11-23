/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *    Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.common.core.internal.builder;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.modisco.infra.common.core.internal.CommonModiscoActivator;
import org.eclipse.modisco.infra.common.core.internal.Messages;
import org.eclipse.modisco.infra.common.core.internal.resource.MoDiscoResourceSet;

/**
 * @author Gregoire DUPE
 */
public class EcoreCatalog extends AbstractMoDiscoCatalog {
	private static final String DEBUG_ID = "org.eclipse.modisco.infra.common.core/debug/EcoreCatalog/debug"; //$NON-NLS-1$
	static final boolean DEBUG = CommonModiscoActivator.getDefault().isDebugging()
			&& Boolean.parseBoolean(Platform.getDebugOption(EcoreCatalog.DEBUG_ID));

	public static final String NS_URI_CONFLICT_MARKER = CommonModiscoActivator.getDefault()
			.getBundle().getSymbolicName()
			+ ".nsuriconflict"; //$NON-NLS-1$
	private static EcoreCatalog singleton;
	private static Map<EPackage, IFile> ePackageToFileMap = new HashMap<EPackage, IFile>();
	private Map<URI, IFile> nsuriToFile;
	private static Map<String, Object> originalRegistry = null;

	static {
		EcoreCatalog.originalRegistry = new HashMap<String, Object>();
		Set<Entry<String, Object>> entrySet = EPackage.Registry.INSTANCE.entrySet();
		for (Entry<String, Object> entry : entrySet) {
			EcoreCatalog.originalRegistry.put(entry.getKey(), entry.getValue());
		}
	}

	public static synchronized EcoreCatalog getSingleton() {
		if (EcoreCatalog.singleton == null) {
			EcoreCatalog.singleton = new EcoreCatalog();
		}
		return EcoreCatalog.singleton;
	}

	protected EcoreCatalog() {
		super();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected String getMoDiscoSubProtocol() {
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected String getRegistryExtensionPoint() {
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Class<?> getRootClass() {
		return EPackage.class;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected String getRootObjectName(final EObject rootObject) {
		return ((EPackage) rootObject).getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected String getRootObjectNsUri(final EObject rootObject) {
		return ((EPackage) rootObject).getNsURI();
	}

	@Override
	protected synchronized void postOpenResource(final URI uri, final IFile file, final EObject root)
			throws Exception {
		EPackage ePackage = (EPackage) root;
		// remove old URI corresponding to this file (nsURI can have changed)
		for (URI oldURI : getNsUriToFile().keySet()) {
			IFile oldFile = getNsUriToFile().get(oldURI);
			if (oldFile != null && oldFile.equals(file)) {
				getEPackageRegistry().remove(oldURI.toString());
				restoreRegistryEntry(oldURI.toString());
			}
		}
		// EPackage generatedEPackage = null;
		// try {
		// generatedEPackage = searchPluginXml(ePackage.getNsURI(),
		// (IFile) file);
		// } catch (Exception e) {
		// IStatus status = new Status(IStatus.ERROR,
		// CommonModiscoActivator.PLUGIN_ID, e.getMessage(), e);
		// CommonModiscoActivator.getDefault().getLog().log(status);
		// }
		// if (generatedEPackage != null) {
		// ePackage = generatedEPackage;
		// } else {
		EcoreCatalog.ePackageToFileMap.put(ePackage, file);
		URI nsUri = URI.createURI(getRootObjectNsUri(ePackage));
		IFile oldFile = getNsUriToFile().get(nsUri);
		if (oldFile != null && file != null && !oldFile.getFullPath().equals(file.getFullPath())) {
			IMarker marker = file.createMarker(EcoreCatalog.NS_URI_CONFLICT_MARKER);
			marker.setAttribute(IMarker.MESSAGE,
					Messages.EcoreCatalog_uriConflict + oldFile.getFullPath());
			marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
			throw new OpenResourceException();
		}
		Resource mmResource = null;
		try {
			synchronized (MoDiscoResourceSet.getResourceSetSingleton()) {
				mmResource = MoDiscoResourceSet.getResourceSetSingleton().getResource(nsUri, false);
			}
		} catch (Exception e) {
			IStatus status = new Status(IStatus.WARNING, CommonModiscoActivator.PLUGIN_ID,
					e.getMessage(), e);
			CommonModiscoActivator.getDefault().getLog().log(status);
		}
		if (mmResource == null) {
			synchronized (MoDiscoResourceSet.getResourceSetSingleton()) {
				mmResource = MoDiscoResourceSet.getResourceSetSingleton().createResource(nsUri);
			}
		}
		synchronized (mmResource) {
			mmResource.getContents().clear();
			mmResource.getContents().add(ePackage);
		}
		String rootObjectNsUri = getRootObjectNsUri(ePackage);
		getEPackageRegistry().put(rootObjectNsUri, ePackage);
		if (EcoreCatalog.DEBUG) {
			System.out.println(this.getClass().getSimpleName() + ".postOpenResource(): " + nsUri); //$NON-NLS-1$
		}
		getNsUriToFile().put(nsUri, file);
		// }
	}

	private synchronized Map<URI, IFile> getNsUriToFile() {
		if (this.nsuriToFile == null) {
			this.nsuriToFile = new HashMap<URI, IFile>();
		}
		return this.nsuriToFile;
	}

	@Override
	protected synchronized void preRemove(final IFile declarationFile, final String pathName,
			final EObject oldRootObject) {
		if (oldRootObject != null) {
			EPackage ePackage = (EPackage) oldRootObject;
			if (EcoreCatalog.DEBUG) {
				System.out.println(this.getClass().getSimpleName()
						+ ".preRemove(): " + ePackage.getNsURI()); //$NON-NLS-1$
			}
			URI uri = URI.createURI(ePackage.getNsURI());
			getNsUriToFile().remove(uri);
			EcoreCatalog.ePackageToFileMap.remove(ePackage);
			// remove old URI corresponding to this file
			getEPackageRegistry().remove(uri.toString());
			restoreRegistryEntry(uri.toString());
		} else {
			if (EcoreCatalog.DEBUG) {
				System.out.println(this.getClass().getSimpleName()
						+ ".preRemove(): oldRootObject is null."); //$NON-NLS-1$
			}
		}
	}

	/**
	 * This method returns the original location of an EPackage
	 */
	public String getOriginalLocation(final EPackage ePackage) {
		IFile file = EcoreCatalog.ePackageToFileMap.get(ePackage);
		if (file == null) {
			return ""; //$NON-NLS-1$
		}
		return file.getFullPath().toString();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Plugin getActivator() {
		return CommonModiscoActivator.getDefault();
	}

	@Override
	public String getFileExtension() {
		return EcoreBuilder.FILE_EXTENSION;
	}

	private Registry getEPackageRegistry() {
		return EPackage.Registry.INSTANCE;
	}

	private void restoreRegistryEntry(final String nsURI) {
		if (EcoreCatalog.originalRegistry != null) {
			Object value = EcoreCatalog.originalRegistry.get(nsURI);
			if (value != null) {
				if (value instanceof EPackage) {
					EPackage ePackage = (EPackage) value;
					Resource resource = new EcoreResourceFactoryImpl().createResource(URI
							.createURI(nsURI));
					synchronized (resource) {
						resource.getContents().add(ePackage);
					}
					EPackage.Registry.INSTANCE.put(nsURI, ePackage);
				} else {
					EPackage.Registry.INSTANCE.put(nsURI, value);
				}
			}
		}
	}
}
