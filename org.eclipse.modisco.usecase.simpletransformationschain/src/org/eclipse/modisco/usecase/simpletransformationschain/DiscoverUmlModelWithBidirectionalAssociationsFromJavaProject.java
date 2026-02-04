/**
 * Copyright (c) 2009, 2020 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *    Fabien Giquel (Mia-Software) - Bug 559115 : Maintain currency with UML 2.5
 *******************************************************************************/

package org.eclipse.modisco.usecase.simpletransformationschain;

import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.m2m.atl.common.ATLLogger;
import org.eclipse.modisco.infra.common.core.internal.logging.MoDiscoLogHandler;
import org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer;
import org.eclipse.modisco.infra.discovery.core.annotations.Parameter;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Property;

/**
 * @deprecated See Bug 559506- the KDMtoUML transformation has not been revised for UML2 5.0.0.
 */
@Deprecated
public class DiscoverUmlModelWithBidirectionalAssociationsFromJavaProject extends
		AbstractModelDiscoverer<IJavaProject> {

	private static final String MODEL_FILE_SUFFIX = "_BidirectionalAssociations.uml"; //$NON-NLS-1$

	private URL customTransformation = null;

	@Parameter(name = "CUSTOM_TRANSFORMATION", description = "A URL pointing to an ATL transformation that will be used instead of the default one.")
	public void setCustomTransformation(final URL customTransformation) {
		this.customTransformation = customTransformation;
	}

	protected URL getCustomTransformation() {
		return this.customTransformation;
	}

	@Override
	public boolean isApplicableTo(final IJavaProject source) {
		return source.getProject().isAccessible();
	}

	@Override
	protected void basicDiscoverElement(final IJavaProject source, final IProgressMonitor monitor)
			throws DiscoveryException {
		IProject project = source.getProject();
		setDefaultTargetURI(URI.createPlatformResourceURI(
				project.getFullPath().append(project.getName()) + DiscoverUmlModelWithBidirectionalAssociationsFromJavaProject.MODEL_FILE_SUFFIX, true));
		final Logger logger = Logger.getLogger(ATLLogger.LOGGER_ID);
		final MoDiscoLogHandler logHandler = new MoDiscoLogHandler(project.getLocation()
				.append(project.getName()).toString()
				+ ".log"); //$NON-NLS-1$
		logger.addHandler(logHandler);
		try {
			Resource uml2Model = DiscoverUmlModelFromJavaProject.getUML2ModelFromJavaProject(
					source, getCustomTransformation());
			createBidirectionalAssociations(uml2Model);

			setTargetModel(uml2Model);
		} catch (Exception e) {
			throw new DiscoveryException(e);
		} finally {
			logger.removeHandler(logHandler);
			logHandler.close();
		}
	}

	/*
	 * The purpose of this refinement is that two unidirectional "opposite" associations become one bidirectional association.
	 * Two associations are considered as opposite when (same as old BidirectionalAssociation.atl conditions) :
	 * - {source,target} types are the same (but inverse)
	 * - there is only one property on each side referencing the other side as type.
	 *
	 */
	private void createBidirectionalAssociations(final Resource uml2Model) {
		Set<Association> associationsToRemove = new HashSet<>();
		Set<Property> propertiesToRemove = new HashSet<>();
		for (Iterator<EObject> i = uml2Model.getAllContents(); i.hasNext();) {
			final EObject childEObject = i.next();
			if (childEObject instanceof Association && !associationsToRemove.contains(childEObject)) {
				Association currentAssociation = (Association) childEObject;
				Association oppositeAssociation = searchAndMergeOppositeAssociation(currentAssociation);
				if (oppositeAssociation != null) {
					// we have found and merged an opposite unidirectional association, we remove it
					associationsToRemove.add(oppositeAssociation);
					propertiesToRemove.addAll(currentAssociation.getOwnedEnds());
				}
			}
		}

		EcoreUtil.deleteAll(associationsToRemove, true);
		EcoreUtil.deleteAll(propertiesToRemove, true);
	}

	private Association searchAndMergeOppositeAssociation(final Association association) {
		Association oppositeAssociation = null;

		List<org.eclipse.uml2.uml.Class> endTypes = association.getEndTypes().stream()
										.filter(org.eclipse.uml2.uml.Class.class::isInstance).
										map(org.eclipse.uml2.uml.Class.class::cast).collect(Collectors.toList());
		if (endTypes.size() == 1) {
			// May be a self association
			oppositeAssociation = searchAndMergeSelfOppositeAssociation(association,
					endTypes);
		} else if (endTypes.size() == 2) {
			org.eclipse.uml2.uml.Class sourceType = endTypes.get(0);
			org.eclipse.uml2.uml.Class targetType = endTypes.get(1);
			// We are looking to have exactly one property
			// which type is the opposite class in each class

			List<Property> sourceMatchingAtts = sourceType.getAttributes().stream().filter(att -> targetType.equals(att.getType())
					&& att.getAssociation() != null).collect(Collectors.toList());
			List<Property> targetMatchingAtts = targetType.getAttributes().stream().filter(att -> sourceType.equals(att.getType())
					&& att.getAssociation() != null).collect(Collectors.toList());

			if (sourceMatchingAtts.size() == 1 && targetMatchingAtts.size() == 1) {
				if (sourceMatchingAtts.get(0).getAssociation() == association) {
					oppositeAssociation = targetMatchingAtts.get(0).getAssociation();
					targetMatchingAtts.get(0).setAssociation(association);
				} else {
					oppositeAssociation = sourceMatchingAtts.get(0).getAssociation();
					sourceMatchingAtts.get(0).setAssociation(association);
				}
			}
		}

		return oppositeAssociation;
	}

	private Association searchAndMergeSelfOppositeAssociation(final Association association,
			final List<org.eclipse.uml2.uml.Class> endTypes) {
		org.eclipse.uml2.uml.Class sourceType = endTypes.get(0);
		Association oppositeAssociation = null;

		// May be a self association, so to have a bidirectional association
		// we have to have a collection of property which type is sourceClass
		// and which is linked to an association
		// and this collection shall have a size equals to 2
		List<Property> sourceMatchingAtts = sourceType.getAttributes().stream().filter(att -> sourceType.equals(att.getType())
				&& att.getAssociation() != null).collect(Collectors.toList());
		if (sourceMatchingAtts.size() == 2) {
			if (sourceMatchingAtts.get(0).getAssociation() == association) {
				oppositeAssociation = sourceMatchingAtts.get(1).getAssociation();
				sourceMatchingAtts.get(1).setAssociation(association);
			} else {
				oppositeAssociation = sourceMatchingAtts.get(0).getAssociation();
				sourceMatchingAtts.get(0).setAssociation(association);
			}
		}
		return oppositeAssociation;
	}
}
