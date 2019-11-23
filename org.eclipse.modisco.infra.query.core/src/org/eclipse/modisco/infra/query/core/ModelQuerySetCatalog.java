/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.infra.query.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.modisco.infra.common.core.internal.builder.AbstractMoDiscoCatalog;
import org.eclipse.modisco.infra.common.core.internal.builder.EcoreCatalog;
import org.eclipse.modisco.infra.query.ModelQuery;
import org.eclipse.modisco.infra.query.ModelQuerySet;
import org.eclipse.modisco.infra.query.QueryPackage;
import org.eclipse.modisco.infra.query.core.exception.ModelQueryException;
import org.eclipse.modisco.infra.query.core.internal.Activator;
import org.eclipse.modisco.infra.query.core.internal.validation.EValidatorAdapter;
import org.osgi.framework.Bundle;

/**
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public final class ModelQuerySetCatalog extends AbstractMoDiscoCatalog {

	public static final String REGISTRATION_EXTENSION_POINT_ID = "org.eclipse.modisco.infra.query.registration"; //$NON-NLS-1$
	public static final String FACTORY_EXTENSION_POINT_ID = "org.eclipse.modisco.infra.query.factory"; //$NON-NLS-1$
	public static final String FILE_EXTENSION = "querySet"; //$NON-NLS-1$

	private static ModelQuerySetCatalog singleton = null;

	private final List<IModelQueryFactory> installedModelQueryFactory = new ArrayList<IModelQueryFactory>();

	public static synchronized ModelQuerySetCatalog getSingleton() {
		if (ModelQuerySetCatalog.singleton == null) {
			EValidator validator = EValidator.Registry.INSTANCE
					.getEValidator(QueryPackage.eINSTANCE);
			if (validator == null) {
				// Registers the validator adapter in the EMF validator registry
				// Bug 309438: if query validator is not registered, this may
				// produce validation problems
				EValidator.Registry.INSTANCE.put(QueryPackage.eINSTANCE, new EValidatorAdapter());
			}
			EcoreCatalog.getSingleton();
			ModelQuerySetCatalog.singleton = new ModelQuerySetCatalog();
		}
		return ModelQuerySetCatalog.singleton;
	}

	private ModelQuerySetCatalog() {
		super();
		initInstalledModelQueryFactory();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected String getRootObjectName(final EObject rootObject) {
		return ((ModelQuerySet) rootObject).getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected String getRootObjectNsUri(final EObject rootObject) {
		return "modisco:/query/" + ((ModelQuerySet) rootObject).getName(); //$NON-NLS-1$
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Class<?> getRootClass() {
		return ModelQuerySet.class;
	}

	/**
	 * This method returns the model query set of the resource having for name
	 * the "name" parameter value.
	 *
	 * @param name
	 *            the name of a resource contained in the catalog
	 * @return return a model query set
	 */
	public ModelQuerySet getModelQuerySet(final String name) {
		return (ModelQuerySet) getRootObject(name);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected String getRegistryExtensionPoint() {
		return ModelQuerySetCatalog.REGISTRATION_EXTENSION_POINT_ID;
	}

	/**
	 * This methods returns the query sets of all the resources contained in the
	 * catalog.
	 *
	 * @return returns all the query sets
	 */
	public Collection<ModelQuerySet> getAllModelQuerySets() {
		Collection<ModelQuerySet> result = new ArrayList<ModelQuerySet>();
		for (EObject eObject : getAllRootObjects()) {
			if (eObject instanceof ModelQuerySet) {
				ModelQuerySet querySet = (ModelQuerySet) eObject;
				result.add(querySet);
			}
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	private synchronized void initInstalledModelQueryFactory() {
		IConfigurationElement[] configs = Platform.getExtensionRegistry()
				.getConfigurationElementsFor(ModelQuerySetCatalog.FACTORY_EXTENSION_POINT_ID);
		for (IConfigurationElement config : configs) {
			if (!"factory".equals(config.getName())) { //$NON-NLS-1$
				continue;
			}
			String className = config.getAttribute("class"); //$NON-NLS-1$
			Bundle bundle = Platform.getBundle(config.getNamespaceIdentifier());
			Class<? extends IModelQueryFactory> modelQueryFactoryClass = null;
			try {
				Class<?> aClass = bundle.loadClass(className);
				for (Class<?> interfaces : aClass.getInterfaces()) {
					if (interfaces == IModelQueryFactory.class) {
						modelQueryFactoryClass = (Class<? extends IModelQueryFactory>) aClass;
					}
					break;
				}
				if (modelQueryFactoryClass != null) {
					this.installedModelQueryFactory.add(modelQueryFactoryClass.newInstance());
				} else {
					throw new Exception("aClass does not implements IModelQueryFactory."); //$NON-NLS-1$
				}
			} catch (Exception e) {
				IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
						"Failed to load IJavaModelFactory for: " //$NON-NLS-1$
								+ config.getNamespaceIdentifier(), e);
				Activator.getDefault().getLog().log(status);
			}
		}
	}

	/**
	 * This method returns the list of the installed model query factory.
	 *
	 * @return model query factories
	 */
	public List<IModelQueryFactory> getInstalledModelQueryFactory() {
		return this.installedModelQueryFactory;
	}

	/**
	 * This method return a java object containing the model query
	 * implementation.
	 *
	 * @param modelQuery
	 *            a model query
	 * @return a model query implementation instance
	 * @throws ModelQueryException
	 */
	public synchronized AbstractModelQuery getModelQueryImpl(final ModelQuery modelQuery)
			throws ModelQueryException {
		AbstractModelQuery modelQueryInst = null;
		boolean factoryFound = false;
		for (IModelQueryFactory modelQueryFactory : this.installedModelQueryFactory) {
			factoryFound = modelQueryFactory.getManagedModelQueryType().getName()
					.equals(modelQuery.eClass().getName());
			if (factoryFound) {
				modelQueryInst = modelQueryFactory.create(modelQuery,
						getBundle(modelQuery.getModelQuerySet()));
				break;
			}
		}
		if (!factoryFound) {
			StringBuffer sb = new StringBuffer();
			sb.append("No factory implementation found for: "); //$NON-NLS-1$
			sb.append(modelQuery.eClass().getName());
			sb.append(":"); //$NON-NLS-1$
			sb.append(modelQuery.getName());
			sb.append("\n Available ModelQuery types are: "); //$NON-NLS-1$
			for (IModelQueryFactory modelQueryFactory : this.installedModelQueryFactory) {
				sb.append(modelQueryFactory.getManagedModelQueryType().getName());
				sb.append(", "); //$NON-NLS-1$
			}
			ModelQueryException e = new ModelQueryException(sb.toString());
			throw e;
		}
		return modelQueryInst;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected String getMoDiscoSubProtocol() {
		return "query"; //$NON-NLS-1$
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.modisco.infra.common.core.builder.AbstractMoDiscoCatalog#
	 * getActivator()
	 */
	@Override
	protected Plugin getActivator() {
		return Activator.getDefault();
	}

	@Override
	public String getFileExtension() {
		return ModelQuerySetCatalog.FILE_EXTENSION;
	}

	@Override
	protected void preRemove(final IFile declarationFile, final String pathName,
			final EObject oldRootObject) {
		// Empty
	}

	@Override
	protected void postOpenResource(final URI uri, final IFile file, final EObject root) {
		// Empty
	}

}