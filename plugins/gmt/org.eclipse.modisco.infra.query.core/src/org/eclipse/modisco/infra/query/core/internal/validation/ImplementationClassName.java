/**
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 *     Nicolas Bros (Mia-Software)
 */
package org.eclipse.modisco.infra.query.core.internal.validation;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.query.JavaModelQuery;
import org.eclipse.modisco.infra.query.core.internal.Activator;
import org.eclipse.modisco.infra.query.core.internal.Messages;
import org.eclipse.osgi.util.NLS;
import org.osgi.framework.Bundle;

/**
 * Check that the implementation class exists and has no compilation errors.
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class ImplementationClassName extends AbstractModelConstraint {

	@Override
	public IStatus validate(final IValidationContext ctx) {
		JavaModelQuery modelQuery = (JavaModelQuery) ctx.getTarget();
		EMFEventType eType = ctx.getEventType();
		if (eType == EMFEventType.NULL) {
			if (modelQuery.getImplementationClassName() == null) {
				return ctx.createFailureStatus(NLS.bind(
						Messages.ImplementationClassName_implementationClassDoesNotExist, modelQuery
								.getImplementationClassName()));
			}
			URI uri = modelQuery.eResource().getURI();

			if ("modisco".equals(uri.scheme())) { //$NON-NLS-1$
				/*
				 * If it's using the modisco protocol it means it was
				 * successfully loaded, and not yet modified, so no need to
				 * check again.
				 */
				return ctx.createSuccessStatus();
			}

			String containerName = uri.segment(1);
			if (uri.segment(0).equals("plugin")) { //$NON-NLS-1$
				Bundle bundle = Platform.getBundle(containerName);
				try {
					bundle.loadClass(modelQuery.getImplementationClassName());
				} catch (ClassNotFoundException e) {
					return ctx.createFailureStatus(NLS.bind(
							Messages.ImplementationClassName_implementationClassDoesNotExist, modelQuery
									.getImplementationClassName()));
				}
			} else if (uri.segment(0).equals("resource")) { //$NON-NLS-1$
				IWorkspace ws = ResourcesPlugin.getWorkspace();
				IWorkspaceRoot wsr = ws.getRoot();
				IProject iproject = wsr.getProject(containerName);
				IJavaProject javaProject = JavaCore.create(iproject);
				try {
					IType type = javaProject.findType(modelQuery.getImplementationClassName());
					if (type == null) {
						return ctx.createFailureStatus(NLS.bind(
								Messages.ImplementationClassName_implementationClassDoesNotExist, modelQuery
										.getImplementationClassName()));
					}
					try {
						// test if the class has compilation errors
						IMarker[] markers = type.getResource().findMarkers(IMarker.PROBLEM, true,
								IResource.DEPTH_ONE);
						for (IMarker marker : markers) {
							Object severity = marker.getAttribute(IMarker.SEVERITY);
							if (IMarker.SEVERITY_ERROR == ((Integer) severity).intValue()) {
								return ctx.createFailureStatus(NLS.bind(
										Messages.ImplementationClassName_implementationClassHasCompilationErrors,
										modelQuery.getImplementationClassName()));
							}
						}
					} catch (Exception e) {
						MoDiscoLogger.logError(e, Activator.getDefault());
					}
				} catch (JavaModelException e) {
					MoDiscoLogger.logError(e, Activator.getDefault());
				}
			} else {
				Exception e = new Exception("Unexpected query model location:" //$NON-NLS-1$
						+ uri.toString());
				MoDiscoLogger.logError(e, Activator.getDefault());
			}

		}
		return ctx.createSuccessStatus();
	}

}
