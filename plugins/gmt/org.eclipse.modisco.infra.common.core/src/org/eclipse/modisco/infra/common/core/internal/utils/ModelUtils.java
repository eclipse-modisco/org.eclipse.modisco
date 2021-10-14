/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 *
 *******************************************************************************/
package org.eclipse.modisco.infra.common.core.internal.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;

/**
 * Utility class for models.
 *
 */
public final class ModelUtils {
	private static ResourceSet resourceSet = new ResourceSetImpl();

	private static AdapterFactory composedAdapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

	/**
	 * Utility classes don't need to (and shouldn't) be instantiated.
	 */
	private ModelUtils() {
		// prevents instantiation
	}

	/**
	 * Loads a model from a {@link java.io.File File} in a given
	 * {@link ResourceSet}.
	 *
	 * @param file
	 *            where the model is stored.
	 * @return The model loaded from the URI.
	 * @throws IOException
	 *             If the given file does not exist.
	 */
	public static Resource loadModel(final File file) throws IOException {
		URI modelURI = URI.createFileURI(file.getPath());
		return ModelUtils.loadModel(modelURI);
	}

	/**
	 * Loads a model from a {@link URI}.
	 *
	 * @param modelURI
	 *            the URI of the model.
	 * @return The model loaded from the URI.
	 * @throws IOException
	 *             If the model couldn't be loaded.
	 */
	public static Resource loadModel(final URI modelURI) throws IOException {
		String fileExtension = modelURI.fileExtension();
		if (fileExtension == null || fileExtension.length() == 0) {
			fileExtension = Resource.Factory.Registry.DEFAULT_EXTENSION;
		}

		final Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		final Object resourceFactory = reg.getExtensionToFactoryMap().get(fileExtension);
		if (resourceFactory != null) {
			ModelUtils.resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
					.put(fileExtension, resourceFactory);
		} else {
			ModelUtils.resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
					.put(fileExtension, new XMIResourceFactoryImpl());
		}

		final Resource result = ModelUtils.resourceSet.createResource(modelURI);
		if (result != null) {
			result.load(null);
		}
		return result;
	}

	private static Set<EObject> getElementsByType(final Resource extent, final String type) {
		Set<EObject> ret = new HashSet<EObject>();
		for (Iterator<EObject> i = extent.getAllContents(); i.hasNext();) {
			EObject eo = i.next();
			if (eo.eClass().getName().equals(type)) {
				ret.add(eo);
			}
		}
		return ret;
	}

	/**
	 * Metamodel register : allows to open/compare specific models.
	 *
	 * @param metamodelURI
	 *            the metamodel URI
	 * @throws IOException
	 */
	public static void registerMetamodel(final URI metamodelURI) throws IOException {
		if (EPackage.Registry.INSTANCE.getEPackage(metamodelURI.toString()) != null) {
			return;
		}
		Resource.Factory myEcoreFactory = new EcoreResourceFactoryImpl();
		Resource mmExtent = myEcoreFactory.createResource(metamodelURI);
		mmExtent.load(new FileInputStream(metamodelURI.toFileString()), Collections.EMPTY_MAP);
		for (EObject eObject : ModelUtils.getElementsByType(mmExtent, "EPackage")) { //$NON-NLS-1$
			EPackage p = (EPackage) eObject;
			String nsURI = p.getNsURI();
			if (nsURI == null) {
				nsURI = p.getName();
				p.setNsURI(nsURI);
			}
			EPackage.Registry.INSTANCE.put(nsURI, p);
		}

		for (EObject eo : ModelUtils.getElementsByType(mmExtent, "EDataType")) { //$NON-NLS-1$
			EStructuralFeature sf;
			sf = eo.eClass().getEStructuralFeature("name"); //$NON-NLS-1$
			String tname = (String) eo.eGet(sf);
			String icn = null;
			if (tname.equals("Boolean")) { //$NON-NLS-1$
				icn = "java.lang.Boolean"; //$NON-NLS-1$
			} else if (tname.equals("Double") || tname.equals("Real")) { //$NON-NLS-1$ //$NON-NLS-2$
				icn = "java.lang.Double"; //$NON-NLS-1$
			} else if (tname.equals("Float")) { //$NON-NLS-1$
				icn = "java.lang.Float"; //$NON-NLS-1$
			} else if (tname.equals("Integer")) { //$NON-NLS-1$
				icn = "java.lang.Integer"; //$NON-NLS-1$
			} else if (tname.equals("String")) { //$NON-NLS-1$
				icn = "java.lang.String"; //$NON-NLS-1$
			}

			if (icn != null) {
				sf = eo.eClass().getEStructuralFeature("instanceClassName"); //$NON-NLS-1$
				eo.eSet(sf, icn);
			}
		}
	}

	/**
	 * Serializes the given EObjet as a String.
	 *
	 * @param root
	 *            Root of the objects to be serialized.
	 * @return The given EObjet serialized as a String.
	 * @throws IOException
	 *             Thrown if an I/O operation has failed or been interrupted
	 *             during the saving process.
	 */
	public static String serialize(final EObject root) throws IOException {
		if (root == null) {
			throw new NullPointerException("ModelUtils.NullSaveRoot"); //$NON-NLS-1$
		}
		final XMIResourceImpl newResource = new XMIResourceImpl();
		final StringWriter writer = new StringWriter();
		newResource.getContents().add(root);
		newResource.save(writer, Collections.EMPTY_MAP);
		return writer.toString();
	}

	/**
	 * Returns a name for the given model element from the EMF global registry,
	 * or use a default name taken from a String attribute.
	 *
	 * @return a name for the given element
	 */
	public static String getName(final EObject eObject) {
		IItemLabelProvider itemLabelProvider = (IItemLabelProvider) ModelUtils.composedAdapterFactory
				.adapt(eObject, IItemLabelProvider.class);
		if (itemLabelProvider != null) {
			return itemLabelProvider.getText(eObject);
		}
		return ModelUtils.getDefaultName(eObject);
	}

	/**
	 * @return a default name based on a string feature of the given
	 *         {@link EObject}
	 */
	public static String getDefaultName(final EObject eObject) {
		// find a feature that can be used as a name
		final EStructuralFeature feature = ModelUtils.getLabelFeature(eObject.eClass());
		if (feature != null) {
			final Object value = eObject.eGet(feature);
			if (value != null) {
				return StringUtils.truncateBeforeNewline(value.toString());
			}
		}
		if (eObject.eIsProxy()) {
			return StringUtils.truncateBeforeNewline(EcoreUtil.getURI(eObject).toString());
		}
		return ""; //$NON-NLS-1$
	}

	/** Copied from ReflectiveItemProvider class */
	private static EStructuralFeature getLabelFeature(final EClass eClass) {
		EAttribute result = null;
		for (final EAttribute eAttribute : eClass.getEAllAttributes()) {
			if (!eAttribute.isMany()
					&& eAttribute.getEType().getInstanceClass() != FeatureMap.Entry.class) {
				if ("name".equalsIgnoreCase(eAttribute.getName())) { //$NON-NLS-1$
					result = eAttribute;
					break;
				} else if (result == null) {
					result = eAttribute;
				} else if (eAttribute.getEAttributeType().getInstanceClass() == String.class
						&& result.getEAttributeType().getInstanceClass() != String.class) {
					result = eAttribute;
				}
			}
		}
		return result;
	}

	/** @return the qualified name of the given metaclass */
	public static String getMetaclassQualifiedName(final EClassifier eClass) {
		final ArrayList<String> qualifiedNameParts = new ArrayList<String>();
		final StringBuilder builder = new StringBuilder();

		EPackage ePackage = eClass.getEPackage();
		while (ePackage != null) {
			qualifiedNameParts.add(ePackage.getName());
			ePackage = ePackage.getESuperPackage();
		}

		for (int i = qualifiedNameParts.size() - 1; i >= 0; i--) {
			builder.append(qualifiedNameParts.get(i) + "."); //$NON-NLS-1$
		}

		builder.append(eClass.getName());

		return builder.toString();
	}

	public static IFile getIFileFormEObject(final EObject eObject) {
		URI uri = eObject.eResource().getURI();
		return ModelUtils.getIFileFromPlatformURI(uri);
	}

	public static IFile getIFileFromPlatformURI(final URI uri) {
		IFile iFile = null;
		if (uri.isPlatformResource()) {
			String projectName = uri.segment(1);
			IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
			StringBuilder path = new StringBuilder();
			String[] segments = uri.segments();
			for (int i = 2; i < segments.length; i++) {
				path.append("/").append(segments[i]); //$NON-NLS-1$
			}
			iFile = project.getFile(path.toString());
		}
		return iFile;
	}

	/**
	 * Compute the resources referenced directly or indirectly from a given
	 * resource
	 *
	 * @param resource
	 * @param allReferencedResources
	 *            parameter inout which is completed with the referenced
	 *            resources
	 */
	public static void computeReferencedResources(final Resource resource,
			final Set<Resource> allReferencedResources) {
		if (resource == null) {
			return;
		}
		final Set<Resource> directReferencedResources = new HashSet<Resource>();

		for (EObject root : resource.getContents()) {
			Map<EObject, Collection<EStructuralFeature.Setting>> externalReferences = EcoreUtil.ExternalCrossReferencer
					.find(root);
			if (!externalReferences.isEmpty()) {
				for (EObject external : externalReferences.keySet()) {
					Resource externalResource;
					if (external.eIsProxy()) {
						externalResource = EcoreUtil.resolve(external, root).eResource();
					} else {
						externalResource = external.eResource();
					}
					if (externalResource != null) {
						directReferencedResources.add(externalResource);
					}
				}
			}
		}

		// recurse on sub-resources
		for (Resource directlyReferencedResource : directReferencedResources) {
			// avoid infinite recursion in the case of mutually referencing
			// resources
			if (!allReferencedResources.contains(directlyReferencedResource)) {
				allReferencedResources.add(directlyReferencedResource);
				computeReferencedResources(directlyReferencedResource, allReferencedResources);
			}
		}
	}

	private static class CrossReferencer extends EcoreUtil.CrossReferencer {

		private static final long serialVersionUID = 4564174659913803329L;

		public CrossReferencer(final Resource resource) {
			super(resource);
		}

		@Override
		protected boolean resolve() {
			return false;
		}

		public EcoreUtil.CrossReferencer findReferences() {
			crossReference();
			done();
			return this;
		}
	}

	public static Set<URI> computeReferencedResourcesURIs(final Resource resource) {
		if (resource == null) {
			return null;
		}
		final Set<URI> referencedResourceURIs = new HashSet<URI>();

		CrossReferencer crossReferencer = new CrossReferencer(resource);
		crossReferencer.findReferences();

		if (!crossReferencer.isEmpty()) {
			for (EObject externalEObject : crossReferencer.keySet()) {
				URI uri = EcoreUtil.getURI(externalEObject);
				if (uri != null) {
					referencedResourceURIs.add(uri.trimFragment());
				}
			}
		}

		return referencedResourceURIs;
	}

	/**
	 * Computes the packages referenced, directly or indirectly, from the given
	 * EPackage. "referenced" term covers here inheritance, references composite
	 * or not.
	 *
	 * @param aPackage
	 * @return
	 */
	public static Set<EPackage> computeReferencedPackages(final EPackage aPackage) {
		Set<Resource> referencedResources = new HashSet<Resource>();
		Set<EPackage> referencedPackages = new HashSet<EPackage>();
		// assume that EPackages are loaded in separate Resource instances
		computeReferencedResources(aPackage.eResource(), referencedResources);

		for (Resource aReferencedResource : referencedResources) {
			final TreeIterator<EObject> allContents = aReferencedResource.getAllContents();
			while (allContents.hasNext()) {
				final EObject eObject = allContents.next();
				if (eObject instanceof EPackage) {
					referencedPackages.add((EPackage) eObject);
				}
			}
		}

		return referencedPackages;
	}

}
