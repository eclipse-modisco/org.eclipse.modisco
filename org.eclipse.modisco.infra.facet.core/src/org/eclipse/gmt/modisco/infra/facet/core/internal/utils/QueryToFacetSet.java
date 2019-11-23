package org.eclipse.gmt.modisco.infra.facet.core.internal.utils;

/**
 *  Copyright (c) 2010, 2011 Mia-Software.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *
 *  	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 */

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.gmt.modisco.infra.facet.Facet;
import org.eclipse.gmt.modisco.infra.facet.FacetFactory;
import org.eclipse.gmt.modisco.infra.facet.FacetSet;
import org.eclipse.gmt.modisco.infra.query.ModelQuery;
import org.eclipse.gmt.modisco.infra.query.ModelQuerySet;

/**
 * This Class perform a model transformation from a QuerySet File to a FaceSet
 * one Query concerned are those whithout paremeters which return type is
 * EBoolean
 *
 * NsUri is generated using the static field nsUri concatenated with the
 * querySet's name facet's name in the FacetSet are directly their corresponding
 * name in the QuerySet
 *
 * @deprecated Replaced by EMF Facet
 */
@Deprecated
public final class QueryToFacetSet {

	private static String nsUri = "http://www.eclipse.org/FacetSet/"; //$NON-NLS-1$
	private static String facetSetExtension = "facetSet"; //$NON-NLS-1$

	private QueryToFacetSet() {
		// can not instantiate
	}

	public static void queryToFacetSet(final Object source) throws IOException {

		String absolutePath = null;
		URI sourceURI = null;
		URI targetURI = null;
		if (source instanceof IFile) {
			absolutePath = ((IFile) source).getFullPath().toString();
			sourceURI = URI.createURI(absolutePath);
			String targetPath = (String) absolutePath.subSequence(0, absolutePath.lastIndexOf(".")); //$NON-NLS-1$
			targetURI = URI.createURI(targetPath);
		}

		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resourceQuery = resourceSet.createResource(sourceURI);
		resourceQuery.load(Collections.EMPTY_MAP);

		ResourceSet resourceSet2 = new ResourceSetImpl();
		Resource resourceFacet = resourceSet2.createResource(targetURI);

		FacetSet facetSet = FacetFactory.eINSTANCE.createFacetSet();

		resourceFacet.getContents().add(facetSet);

		visitor(facetSet, resourceQuery);

		saveResourceAsXMI(targetURI, resourceFacet);
	}

	/**
	 * This method visits all the contained ModelQuerySet (usually one) and
	 * creates a FacetSet before visiting every contained Facet
	 *
	 * @param facetSet
	 *            the targeted facetSet
	 * @param resourceQuery
	 *            the resource in which the querySet has been loaded
	 */
	public static void visitor(final FacetSet facetSet, final Resource resourceQuery) {

		for (EObject object : resourceQuery.getContents()) {
			if (object instanceof ModelQuerySet) {
				ModelQuerySet querySet = (ModelQuerySet) object;
				facetSet.setName(querySet.getName());
				facetSet.setExtendedPackage(querySet.getAssociatedMetamodels().get(0));
				facetSet.setNsPrefix(querySet.getName());
				facetSet.setNsURI(QueryToFacetSet.nsUri + querySet.getName());

				for (ModelQuery query : querySet.getQueries()) {
					if (query.getParameters().isEmpty()
							&& query.getReturnType().getName().equalsIgnoreCase("EBoolean")) { //$NON-NLS-1$
						visitQuery(query, facetSet);
					}
				}
			}
		}
	}

	/**
	 * This Method buils a Facet based on the information contained in the query
	 *
	 * @param query
	 *            the visited query used to build a new facet
	 * @param facetSet
	 *            the facetSet to add the facet
	 */
	public static void visitQuery(final ModelQuery query, final FacetSet facetSet) {

		Facet facet = FacetFactory.eINSTANCE.createFacet();
		facet.setName(query.getName());
		facet.setConditionQuery(query);
		facet.setAbstract(true);
		facet.getESuperTypes().addAll(query.getScope());

		// Add the Facet to the FacetSet
		facetSet.getEClassifiers().add(facet);
	}

	/**
	 *
	 * @param sourceURI
	 *            the URI where the is to be saved
	 * @param resource
	 *            the resource to be saved
	 * @throws IOException
	 */
	public static void saveResourceAsXMI(final URI sourceURI, final Resource resource)
			throws IOException {

		XMIResource xmiResource = new XMIResourceImpl();
		xmiResource.getContents().addAll(resource.getContents());
		xmiResource.setURI(sourceURI.appendFileExtension(QueryToFacetSet.facetSetExtension));
		xmiResource.save(null);

	}
}
