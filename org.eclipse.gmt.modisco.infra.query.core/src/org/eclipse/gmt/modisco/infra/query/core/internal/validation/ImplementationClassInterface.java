/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Gregoire DUPE (Mia-Software) - initial API and implementation
 *     Nicolas Bros (Mia-Software)
 */
package org.eclipse.gmt.modisco.infra.query.core.internal.validation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.query.JavaModelQuery;
import org.eclipse.gmt.modisco.infra.query.core.internal.Activator;
import org.eclipse.gmt.modisco.infra.query.core.internal.Messages;
import org.eclipse.gmt.modisco.infra.query.core.internal.utils.QueryUtils;
import org.eclipse.gmt.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.jdt.core.IJavaModelMarker;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;
import org.eclipse.osgi.util.NLS;
import org.osgi.framework.Bundle;

/**
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class ImplementationClassInterface extends AbstractModelConstraint {

	private class UnresolvedType extends Exception {
		private static final long serialVersionUID = -1954221535388576391L;

		private final String typeQualifiedName;
		private final String location;

		// public UnresolvedType(final String typeQualifiedName) {
		// this.typeQualifiedName = typeQualifiedName;
		//			this.location = ""; //$NON-NLS-1$
		// }

		public UnresolvedType(final String returnTypeName, final String location) {
			this.typeQualifiedName = returnTypeName;
			this.location = " in " + location; //$NON-NLS-1$
		}

		@Override
		public String getMessage() {
			return "Couldn't resolve type " + this.typeQualifiedName + this.location; //$NON-NLS-1$
		}
	}

	private static final long LOG_JOB_DELAY = 5000;

	@Override
	public IStatus validate(final IValidationContext ctx) {
		JavaModelQuery modelQuery = (JavaModelQuery) ctx.getTarget();
		EMFEventType eType = ctx.getEventType();
		if (eType == EMFEventType.NULL) {
			if (modelQuery.getImplementationClassName() == null || modelQuery.eResource() == null) {
				return ctx.createSuccessStatus();
			}
			URI uri = modelQuery.eResource().getURI();
			String containerName = uri.segment(1);
			if (uri.segment(0).equals("plugin")) { //$NON-NLS-1$
				Bundle bundle = Platform.getBundle(containerName);
				return validateInstalledQuery(ctx, modelQuery, bundle);
			} else if (uri.segment(0).equals("resource")) { //$NON-NLS-1$
				IWorkspace ws = ResourcesPlugin.getWorkspace();
				IWorkspaceRoot wsr = ws.getRoot();
				IProject project = wsr.getProject(containerName);
				IJavaProject javaProject = JavaCore.create(project);
				return validateWorkspaceQuery(ctx, modelQuery, javaProject);
			}
		}
		return ctx.createSuccessStatus();
	}

	private IStatus validateInstalledQuery(final IValidationContext ctx,
			final JavaModelQuery modelQuery, final Bundle bundle) {
		try {
			Class<?> c = bundle.loadClass(modelQuery.getImplementationClassName());
			if (!IJavaModelQuery.class.isAssignableFrom(c)) {
				return ctx.createFailureStatus(NLS.bind(Messages.ImplementationClassInterface_wrongInterface,
						modelQuery.getImplementationClassName()));
			}
			return ctx.createSuccessStatus();
		} catch (ClassNotFoundException e) {
			return ctx.createSuccessStatus();
		}
	}

	private IStatus validateWorkspaceQuery(final IValidationContext ctx,
			final JavaModelQuery modelQuery, final IJavaProject javaProject) {
		try {
			IType type = javaProject.findType(modelQuery.getImplementationClassName());
			if (type == null) {
				return ctx.createSuccessStatus();
			}

			String[] superInterfaceTypeSignatures = type.getSuperInterfaceTypeSignatures();
			for (String superInterfaceTypeSignature : superInterfaceTypeSignatures) {
				String typeErasure = Signature.getTypeErasure(superInterfaceTypeSignature);
				String implementedInterface = Signature.getSignatureSimpleName(typeErasure);

				// check that this is the right interface (IJavaModelQuery)
				if (IJavaModelQuery.class.getSimpleName().equals(implementedInterface)) {
					String[] typeArguments = Signature
							.getTypeArguments(superInterfaceTypeSignature);
					// now, check the generic type arguments
					if (typeArguments.length == 2) {
						String contextType = typeArguments[0];
						String returnType = typeArguments[1];

						IStatus contextTypeValidationResult;
						try {
							contextTypeValidationResult = validateContextType(contextType, type,
									modelQuery, ctx, javaProject);
							if (!contextTypeValidationResult.isOK()) {
								return contextTypeValidationResult;
							}
						} catch (final UnresolvedType e) {
							ifNoMarkers(type, new Runnable() {
								public void run() {
									MoDiscoLogger.logWarning(e,
											"Unresolved type while validating query context type: " //$NON-NLS-1$
													+ modelQuery.getName(), Activator.getDefault());
								}
							});
						}

						try {
							IStatus returnTypeValidationResult = validateReturnType(returnType,
									type, modelQuery, ctx, javaProject);
							if (!returnTypeValidationResult.isOK()) {
								return returnTypeValidationResult;
							}
						} catch (final UnresolvedType e) {
							ifNoMarkers(type, new Runnable() {
								public void run() {
									MoDiscoLogger.logWarning(e,
											"Unresolved type while validating query return type: " //$NON-NLS-1$
													+ modelQuery.getName(), Activator.getDefault());
								}
							});
						}

						return ctx.createSuccessStatus();
					}
					return ctx.createFailureStatus(NLS.bind(
							Messages.ImplementationClassInterface_wrongInterface2,
							modelQuery.getImplementationClassName()));
				}
			}
			return ctx.createFailureStatus(NLS.bind(Messages.ImplementationClassInterface_wrongInterface3,
					modelQuery.getImplementationClassName()));
		} catch (JavaModelException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
		return ctx.createSuccessStatus();
	}

	private IStatus validateReturnType(final String returnType, final IType type,
			final JavaModelQuery modelQuery, final IValidationContext ctx,
			final IJavaProject javaProject) throws JavaModelException,
			ImplementationClassInterface.UnresolvedType {
		String returnTypeQualifiedName = findTypeQualifiedName(returnType, type);

		if (modelQuery.getReturnType() == null) {
			return ctx.createSuccessStatus();
		}

		String instanceClassName = modelQuery.getReturnType().getInstanceClassName();
		// instanceClassName can be null if the ReturnType is an unresolved proxy
		if (instanceClassName != null) {
			final String expectedReturnTypeInstanceClassName = QueryUtils
					.qualifiedObjectType(instanceClassName);
			final String expectedReturnType = Signature.createTypeSignature(
					expectedReturnTypeInstanceClassName, false);

			if (modelQuery.getUpperBound() != 1) {
				IType tReturnType = javaProject.findType(returnTypeQualifiedName);
				try {
					if (!validateType(tReturnType, "java.util.Collection", type, javaProject)) { //$NON-NLS-1$
						return ctx.createFailureStatus(NLS.bind(
								Messages.ImplementationClassInterface_wrongInterfaceCollection, modelQuery
										.getImplementationClassName(),
								expectedReturnTypeInstanceClassName));
					}
				} catch (final UnresolvedType e) {
					ifNoMarkers(type, new Runnable() {
						public void run() {
							MoDiscoLogger.logWarning(e,
									"Unresolved type while validating multi-valued return type in query: " //$NON-NLS-1$
											+ modelQuery.getName(), Activator.getDefault());
						}
					});
				}

				String[] returnTypeArguments = Signature.getTypeArguments(returnType);
				if (returnTypeArguments.length == 1) {
					String returnTypeArgument = returnTypeArguments[0];
					if (returnTypeArgument.length() > 0) {
						char c = returnTypeArgument.charAt(0);
						if (c == Signature.C_EXTENDS || c == Signature.C_SUPER) {
							returnTypeArgument = returnTypeArgument.substring(1);
						}
					}
					String returnTypeArgumentQualifiedName;
					try {
						returnTypeArgumentQualifiedName = findTypeQualifiedName(returnTypeArgument,
								type);

						if (returnTypeArgumentQualifiedName != null
								&& !expectedReturnType.equals(Signature.createTypeSignature(
										returnTypeArgumentQualifiedName, false))) {
							return ctx
									.createFailureStatus(NLS
											.bind(
													Messages.ImplementationClassInterface_wrongInterfaceCollection2,
													new Object[] {
															modelQuery.getImplementationClassName(),
															Signature
																	.getSimpleName(returnTypeArgument),
															expectedReturnTypeInstanceClassName }));
						}
					} catch (final UnresolvedType e) {
						ifNoMarkers(type, new Runnable() {
							public void run() {
								MoDiscoLogger.logWarning(e,
										"Unresolved type while validating multi-valued return type argument in query: " //$NON-NLS-1$
												+ modelQuery.getName(), Activator.getDefault());
							}
						});
					}
				}

			} else {
				String returnTypeSignature = Signature.createTypeSignature(returnTypeQualifiedName,
						false);

				if (!expectedReturnType.equals(returnTypeSignature)) {
					return ctx
							.createFailureStatus(NLS.bind(
									Messages.ImplementationClassInterface_wrongReturnType,
									new Object[] { modelQuery.getImplementationClassName(),
											returnTypeQualifiedName,
											expectedReturnTypeInstanceClassName }));
				}
			}
		}
		return ctx.createSuccessStatus();
	}

	/**
	 * Check that each possible context of the query is a sub-type of the
	 * context type defined in the Java implementation class.
	 * 
	 * @param contextType
	 *            the context defined on the implementation class
	 * @param queryImplType
	 *            the type for the query implementation class
	 * @param modelQuery
	 *            the query whose context is being checked
	 * @param ctx
	 *            the validation context
	 * @param javaProject
	 *            the project in which the query resides
	 * @return a validation status
	 * @throws JavaModelException
	 * @throws UnresolvedType
	 */
	private IStatus validateContextType(final String contextType, final IType queryImplType,
			final JavaModelQuery modelQuery, final IValidationContext ctx,
			final IJavaProject javaProject) throws JavaModelException,
			ImplementationClassInterface.UnresolvedType {
		String contextTypeQualifiedName = findTypeQualifiedName(contextType, queryImplType);

		EList<EClass> scopes = modelQuery.getScope();
		for (EClass scope : scopes) {
			String scopeClassName = scope.getInstanceClassName();
			if (scopeClassName != null) {
				IType tScope = javaProject.findType(scopeClassName);
				if (tScope != null) {
					try {
						if (!validateType(tScope, contextTypeQualifiedName, queryImplType,
								javaProject)) {
							return ctx.createFailureStatus(NLS.bind(
									Messages.ImplementationClassInterface_wrongScope,
									new Object[] { modelQuery.getImplementationClassName(),
											contextTypeQualifiedName, scopeClassName }));
						}
					} catch (final UnresolvedType e) {
						ifNoMarkers(queryImplType, new Runnable() {
							public void run() {
								MoDiscoLogger.logWarning(e,
										"Unresolved type while validating scope in query: " //$NON-NLS-1$
												+ modelQuery.getName(), Activator.getDefault());
							}
						});

					}
				} else {
					MoDiscoLogger
							.logWarning(
									"Couldn't resolve scope type " + scopeClassName, Activator.getDefault()); //$NON-NLS-1$
				}
			} else {
				MoDiscoLogger
						.logWarning(
								"Couldn't resolve scope type because InstanceClassName is null: " + scope.getName(), Activator.getDefault()); //$NON-NLS-1$
			}
		}

		return ctx.createSuccessStatus();
	}

	/**
	 * Returns whether the given type matches the expected type, or one of its
	 * sub-types.
	 * 
	 * @param type
	 *            the type to validate
	 * @param expectedType
	 *            the expected type fully qualified name
	 * @param contextType
	 *            the type in the source of which the type to validate appears
	 * @param javaProject
	 *            the containing Java project
	 * @return whether the type is a sub-type of the expectedType
	 */
	private boolean validateType(final IType type, final String expectedType,
			final IType contextType, final IJavaProject javaProject) throws JavaModelException,
			ImplementationClassInterface.UnresolvedType {
		if (type == null) {
			return false;
		}

		String fullyQualifiedName = type.getFullyQualifiedName();
		if (expectedType.equals(fullyQualifiedName)) {
			return true;
		}

		String expectedTypeSignature = Signature.createTypeSignature(expectedType, true);
		return isSubType(type, expectedTypeSignature, contextType, javaProject);
	}

	private boolean isSubType(final IType type, final String expectedTypeSignature,
			final IType contextType, final IJavaProject javaProject) throws JavaModelException,
			ImplementationClassInterface.UnresolvedType {

		String fullyQualifiedName = type.getFullyQualifiedName();
		if (expectedTypeSignature.equals(Signature.createTypeSignature(fullyQualifiedName, true))
				|| expectedTypeSignature.equals(Signature.createTypeSignature(fullyQualifiedName,
						false))) {
			return true;
		}

		String[] returnTypeSuperInterfaceTypeSignatures = type.getSuperInterfaceTypeSignatures();
		List<String> allSuperTypes = new ArrayList<String>();

		String superclassTypeSignature = type.getSuperclassTypeSignature();
		if (superclassTypeSignature != null) {
			allSuperTypes.add(superclassTypeSignature);
		}

		for (String returnTypeSuperInterfaceTypeSignature : returnTypeSuperInterfaceTypeSignatures) {
			if (expectedTypeSignature.equals(Signature
					.getTypeErasure(returnTypeSuperInterfaceTypeSignature))) {
				return true;
			}
			allSuperTypes.add(returnTypeSuperInterfaceTypeSignature);
		}

		// resolve super type and recurse
		for (String superType : allSuperTypes) {
			String superTypeQualifiedName = findTypeQualifiedName(superType, type);
			IType tSuperType = javaProject.findType(Signature
					.getTypeErasure(superTypeQualifiedName));
			if (tSuperType == null) {
				throw new UnresolvedType(superTypeQualifiedName, "project " //$NON-NLS-1$
						+ javaProject.getElementName());
			}
			if (isSubType(tSuperType, expectedTypeSignature, contextType, javaProject)) {
				return true;
			}
		}

		return false;
	}

	private String findTypeQualifiedName(final String typeName, final IType contextType)
			throws JavaModelException, ImplementationClassInterface.UnresolvedType {
		String qualifier = Signature.getSignatureQualifier(typeName);
		String simpleName = Signature.getSignatureSimpleName(typeName);

		String qualifiedName;
		if (qualifier.length() > 0) {
			qualifiedName = qualifier + "." //$NON-NLS-1$
					+ simpleName;
		} else {
			String[][] resolvedTypes = contextType.resolveType(simpleName);
			if (resolvedTypes != null && resolvedTypes.length > 0) {
				qualifiedName = resolvedTypes[0][0] + "." //$NON-NLS-1$
						+ resolvedTypes[0][1];
			} else {
				throw new UnresolvedType(simpleName, contextType.getCompilationUnit()
						.getElementName());
			}
		}
		return qualifiedName;
	}

	class LogJobItem {
		private final IResource resource;
		private final Runnable runnable;

		public LogJobItem(final IResource resource, final Runnable runnable) {
			this.resource = resource;
			this.runnable = runnable;
		}

		public IResource getResource() {
			return this.resource;
		}

		public Runnable getRunnable() {
			return this.runnable;
		}
	}

	/**
	 * This job is used to log warnings (when an unresolved type was found),
	 * unless the class has compilation errors. Since error markers are added by
	 * the Java builder, this job waits for it to finish before logging.
	 */
	class LogJob extends Job {
		public LogJob() {
			super(Messages.ImplementationClassInterface_logErrorsJobName);
		}

		private final List<ImplementationClassInterface.LogJobItem> items = Collections
				.synchronizedList(new ArrayList<ImplementationClassInterface.LogJobItem>());

		@Override
		protected IStatus run(final IProgressMonitor monitor) {
			// wait for the Java build job to be finished, so that error markers
			// are set
			try {
				Job.getJobManager().join(ResourcesPlugin.FAMILY_MANUAL_BUILD, null);
				Job.getJobManager().join(ResourcesPlugin.FAMILY_AUTO_BUILD, null);
			} catch (InterruptedException e) {
				MoDiscoLogger.logError(e, Activator.getDefault());
			}

			for (LogJobItem logJobItem : this.items) {
				if (!hasCompilationErrors(logJobItem.getResource())) {
					logJobItem.getRunnable().run();
				}
			}
			return Status.OK_STATUS;
		}

		public void add(final LogJobItem logJobItem) {
			this.items.add(logJobItem);
		}
	}

	private LogJob logJob = null;

	private void ifNoMarkers(final IType type, final Runnable runnable) {
		IResource resource = type.getResource();
		if (resource != null) {
			if (this.logJob == null) {
				this.logJob = new LogJob();
				this.logJob.setSystem(true);
				this.logJob.setPriority(Job.DECORATE);
			} else {
				this.logJob.cancel();
			}
			this.logJob.add(new LogJobItem(resource, runnable));
			this.logJob.schedule(ImplementationClassInterface.LOG_JOB_DELAY);
		}
	}

	protected boolean hasCompilationErrors(final IResource resource) {
		try {
			IMarker[] markers = resource.findMarkers(IJavaModelMarker.JAVA_MODEL_PROBLEM_MARKER,
					true, IResource.DEPTH_INFINITE);
			for (IMarker marker : markers) {
				if (IMarker.SEVERITY_ERROR == ((Integer) marker.getAttribute(IMarker.SEVERITY))
						.intValue()) {
					return true;
				}
			}
		} catch (Exception e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
		return false;
	}
}
