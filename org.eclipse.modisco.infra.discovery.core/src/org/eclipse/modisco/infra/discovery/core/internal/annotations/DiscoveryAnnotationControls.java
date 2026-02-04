/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 338702 - [Discovery] specify initial value for Parameters
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.core.internal.annotations;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Map;
import java.util.Set;

import org.eclipse.modisco.infra.discovery.core.Messages;
import org.eclipse.modisco.infra.discovery.core.annotations.Parameter;
import org.eclipse.modisco.infra.discovery.core.annotations.ParameterInitialValue;

import com.sun.mirror.declaration.FieldDeclaration;
import com.sun.mirror.declaration.MemberDeclaration;
import com.sun.mirror.declaration.MethodDeclaration;

public final class DiscoveryAnnotationControls {

	private static final String VOID = "void"; //$NON-NLS-1$

	private DiscoveryAnnotationControls() {
	}

	/*
	 * Only one parameter memberDeclaration or member is not null. The service
	 * implements the same controls with two Java reflexive API.
	 */
	public static void checkAnnotation(final Parameter parameterAnnotation,
			final MemberDeclaration memberDeclaration, final Member member)
			throws ParameterDeclarationException {
		if (memberDeclaration instanceof MethodDeclaration || member instanceof Method) {
			checkAnnotation(parameterAnnotation, (MethodDeclaration) memberDeclaration,
					(Method) member);
		} else {
			checkAnnotation(parameterAnnotation, (FieldDeclaration) memberDeclaration,
					(Field) member);
		}
	}

	/*
	 * Only one parameter memberDeclaration or member is not null. The service
	 * implements the same controls with two Java reflexive API.
	 */
	public static void checkAnnotation(final Parameter parameterAnnotation,
			final MethodDeclaration methodDeclaration, final Method method)
			throws ParameterDeclarationException {
		checkIsPublic(parameterAnnotation, methodDeclaration, method);
		checkIsNotStatic(parameterAnnotation, methodDeclaration, method);
		checkIsAnAccessor(parameterAnnotation, methodDeclaration, method);
		checkIsNotRequiredOnGetter(parameterAnnotation, methodDeclaration, method);
	}

	/*
	 * Only one parameter memberDeclaration or member is not null. The service
	 * implements the same controls with two Java reflexive API.
	 */
	public static void checkAnnotation(final Parameter parameterAnnotation,
			final FieldDeclaration fieldDeclaration, final Field field)
			throws ParameterDeclarationException {
		checkIsPublic(parameterAnnotation, fieldDeclaration, field);
		checkIsNotStatic(parameterAnnotation, fieldDeclaration, field);
	}

	public static void checkAnnotation(final ParameterInitialValue annotation,
			final MethodDeclaration methodDeclaration, final Method method)
			throws ParameterDeclarationException {
		checkIsPublic(annotation, methodDeclaration, method);
		if (methodDeclaration != null) {
			if (methodDeclaration.getParameters().size() != 1) {
				throw new ParameterDeclarationException(
						Messages.DiscoveryAnnotationControls_initializerMethodMustHaveOneParameter);
			}
			// ParameterDeclaration parameter =
			// methodDeclaration.getParameters().iterator().next();
			// TypeMirror type = parameter.getType();
			if (methodDeclaration.getReturnType().toString()
					.equalsIgnoreCase(DiscoveryAnnotationControls.VOID)) {
				throw new ParameterDeclarationException(
						Messages.DiscoveryAnnotationControls_initializerMethodMustHaveNonVoidReturnType);
			}
		}

		if (method != null) {
			if (method.getParameterTypes().length != 1) {
				throw new ParameterDeclarationException(
						Messages.DiscoveryAnnotationControls_initializerMethodMustHaveOneParameter);
			}
			// Class<?> type = method.getParameterTypes()[0];
			if (method.getReturnType() == null
					|| method.getReturnType().getName().equals(DiscoveryAnnotationControls.VOID)) {
				throw new ParameterDeclarationException(
						Messages.DiscoveryAnnotationControls_initializerMethodMustHaveNonVoidReturnType);
			}
		}
	}

	/*
	 * Only one parameter memberDeclaration or member is not null. The service
	 * implements the same controls with two Java reflexive API.
	 */
	public static void checkAnnotationsForOneParameter(
			final Map<MemberDeclaration, Parameter> memberDeclarationToAnnotationsMap,
			final Map<Member, Parameter> memberToAnnotationsMap,
			final Map<MethodDeclaration, ParameterInitialValue> initializerMethodDeclarationToAnnotationsMap,
			final Map<Method, ParameterInitialValue> initializerMethodToAnnotationsMap)
			throws ParameterDeclarationException {
		checkTypeCoherence(memberDeclarationToAnnotationsMap, memberToAnnotationsMap,
				initializerMethodDeclarationToAnnotationsMap, initializerMethodToAnnotationsMap);
		checkAnnotationsNumber(memberDeclarationToAnnotationsMap, memberToAnnotationsMap);
	}

	/**
	 * Only one parameter memberDeclaration or member is not null. The service
	 * implements the same controls with two Java reflexive API.
	 *
	 * @param parameterAnnotation
	 * @param methodDeclaration
	 * @param method
	 * @throws ParameterDeclarationException
	 */
	private static void checkIsAnAccessor(final Parameter parameterAnnotation,
			final MethodDeclaration methodDeclaration, final Method method)
			throws ParameterDeclarationException {
		boolean error = method != null && (!isGetter(method) && !isSetter(method));
		error = error
				|| (methodDeclaration != null && (!isGetter(methodDeclaration) && !isSetter(methodDeclaration)));

		if (error) {
			throw new ParameterDeclarationException(Messages.DiscoveryAnnotationControls_0);
		}
	}

	/*
	 * Only one parameter memberDeclaration or member is not null. The service
	 * implements the same controls with two Java reflexive API.
	 */
	private static void checkIsNotRequiredOnGetter(final Parameter parameterAnnotation,
			final MethodDeclaration methodDeclaration, final Method method)
			throws ParameterDeclarationException {
		boolean error = (method != null) && isGetter(method)
				&& parameterAnnotation.requiresInputValue();
		error = error
				|| ((methodDeclaration != null) && isGetter(methodDeclaration) && parameterAnnotation
						.requiresInputValue());

		if (error) {
			throw new ParameterDeclarationException(Messages.DiscoveryAnnotationControls_1);
		}

	}

	/**
	 * Only one parameter memberDeclaration or member is not null. The service
	 * implements the same controls with two Java reflexive API.
	 *
	 * @param parameterAnnotation
	 * @param memberDeclaration
	 * @param member
	 * @throws ParameterDeclarationException
	 */
	private static void checkIsPublic(final Parameter parameterAnnotation,
			final MemberDeclaration memberDeclaration, final Member member)
			throws ParameterDeclarationException {
		boolean error = (member != null && !Modifier.isPublic(member.getModifiers()));
		error = error
				|| (memberDeclaration != null && !memberDeclaration.getModifiers().contains(
						com.sun.mirror.declaration.Modifier.PUBLIC));
		if (error) {
			throw new ParameterDeclarationException(Messages.DiscoveryAnnotationControls_2);
		}
	}

	/**
	 * @param annotation
	 * @param memberDeclaration
	 * @param member
	 * @throws ParameterDeclarationException
	 */
	private static void checkIsPublic(final ParameterInitialValue annotation,
			final MemberDeclaration memberDeclaration, final Member member)
			throws ParameterDeclarationException {
		boolean error = (member != null && !Modifier.isPublic(member.getModifiers()));
		error = error
				|| (memberDeclaration != null && !memberDeclaration.getModifiers().contains(
						com.sun.mirror.declaration.Modifier.PUBLIC));
		if (error) {
			throw new ParameterDeclarationException(
					Messages.DiscoveryAnnotationControls_methodMustBePublic);
		}
	}

	/**
	 * Only one parameter memberDeclaration or member is not null. The service
	 * implements the same controls with two Java reflexive API.
	 *
	 * @param parameterAnnotation
	 * @param memberDeclaration
	 * @param member
	 * @throws ParameterDeclarationException
	 */
	private static void checkIsNotStatic(final Parameter parameterAnnotation,
			final MemberDeclaration memberDeclaration, final Member member)
			throws ParameterDeclarationException {
		boolean error = (member != null && Modifier.isStatic(member.getModifiers()));
		error = error
				|| (memberDeclaration != null && memberDeclaration.getModifiers().contains(
						com.sun.mirror.declaration.Modifier.STATIC));
		if (error) {
			throw new ParameterDeclarationException(Messages.DiscoveryAnnotationControls_3);
		}
	}

	/*
	 * Only one parameter memberDeclaration or member is not null. The service
	 * implements the same controls with two Java reflexive API.
	 */
	private static void checkTypeCoherence(
			final Map<MemberDeclaration, Parameter> memberDeclarationToAnnotationsMap,
			final Map<Member, Parameter> memberToAnnotationsMap,
			final Map<MethodDeclaration, ParameterInitialValue> initializerMethodDeclarationToAnnotationsMap,
			final Map<Method, ParameterInitialValue> initializerMethodToAnnotationsMap)
			throws ParameterDeclarationException {

		Object fieldType = null;
		Object getterType = null;
		Object setterType = null;
		Object initializerType = null;

		if (memberDeclarationToAnnotationsMap != null) {
			for (MemberDeclaration member : memberDeclarationToAnnotationsMap.keySet()) {
				if (member instanceof FieldDeclaration) {
					fieldType = ((FieldDeclaration) member).getType();
				} else if (member instanceof MethodDeclaration) {
					if (isGetter((MethodDeclaration) member)) {
						getterType = ((MethodDeclaration) member).getReturnType();
					} else if (isSetter((MethodDeclaration) member)) {
						setterType = ((MethodDeclaration) member).getParameters().iterator().next()
								.getType();
					}
				}
			}
		}

		if (memberToAnnotationsMap != null) {
			for (Member member : memberToAnnotationsMap.keySet()) {
				if (member instanceof Field) {
					fieldType = ((Field) member).getType();
				} else if (member instanceof Method) {
					if (isGetter((Method) member)) {
						getterType = ((Method) member).getReturnType();
					} else if (isSetter((Method) member)) {
						setterType = ((Method) member).getParameterTypes()[0];
					}
				}
			}
		}

		if (initializerMethodDeclarationToAnnotationsMap != null) {
			Set<MethodDeclaration> methodDeclarations = initializerMethodDeclarationToAnnotationsMap
					.keySet();
			if (methodDeclarations.size() > 1) {
				throw new ParameterDeclarationException(
						Messages.DiscoveryAnnotationControls_noMoreThanOneInitializer);
			} else if (methodDeclarations.size() == 1) {
				MethodDeclaration initializerMethod = methodDeclarations.iterator().next();
				initializerType = initializerMethod.getReturnType();
			}
		}

		if (initializerMethodToAnnotationsMap != null) {
			Set<Method> methods = initializerMethodToAnnotationsMap.keySet();
			if (methods.size() > 1) {
				throw new ParameterDeclarationException(
						Messages.DiscoveryAnnotationControls_noMoreThanOneInitializer);
			} else if (methods.size() == 1) {
				Method initializerMethod = methods.iterator().next();
				initializerType = initializerMethod.getReturnType();
			}
		}

		if ((fieldType != null) && (getterType != null) && (!fieldType.equals(getterType))) {
			throw new ParameterDeclarationException(Messages.DiscoveryAnnotationControls_4);
		}
		if ((fieldType != null) && (setterType != null) && (!fieldType.equals(setterType))) {
			throw new ParameterDeclarationException(Messages.DiscoveryAnnotationControls_5);
		}
		if ((setterType != null) && (getterType != null) && (!setterType.equals(getterType))) {
			throw new ParameterDeclarationException(Messages.DiscoveryAnnotationControls_6);
		}

		if ((fieldType != null) && (initializerType != null)
				&& (!fieldType.equals(initializerType))) {
			throw new ParameterDeclarationException(
					Messages.DiscoveryAnnotationControls_initializerTypeMatchesFieldType);
		}
		if ((getterType != null) && (initializerType != null)
				&& (!getterType.equals(initializerType))) {
			throw new ParameterDeclarationException(
					Messages.DiscoveryAnnotationControls_initializerTypeMatchesGetterType);
		}
		if ((setterType != null) && (initializerType != null)
				&& (!setterType.equals(initializerType))) {
			throw new ParameterDeclarationException(
					Messages.DiscoveryAnnotationControls_initializerTypeMatchesSetterType);
		}
	}

	/*
	 * Only one parameter memberDeclaration map or member map is not null. The
	 * service implements the same controls with two Java reflexive API.
	 */
	private static void checkAnnotationsNumber(
			final Map<MemberDeclaration, Parameter> memberDeclarationToAnnotationsMap,
			final Map<Member, Parameter> memberToAnnotationsMap)
			throws ParameterDeclarationException {
		int nbField = 0;
		int nbGetter = 0;
		int nbSetter = 0;
		if (memberDeclarationToAnnotationsMap != null) {
			for (MemberDeclaration member : memberDeclarationToAnnotationsMap.keySet()) {
				if (member instanceof FieldDeclaration) {
					nbField++;
				} else if (member instanceof MethodDeclaration) {
					if (isGetter((MethodDeclaration) member)) {
						nbGetter++;
					} else if (isSetter((MethodDeclaration) member)) {
						nbSetter++;
					}
				}
			}
		}
		if (memberToAnnotationsMap != null) {
			for (Member member : memberToAnnotationsMap.keySet()) {
				if (member instanceof Field) {
					nbField++;
				} else if (member instanceof Method) {
					if (isGetter((Method) member)) {
						nbGetter++;
					} else if (isSetter((Method) member)) {
						nbSetter++;
					}
				}
			}
		}
		if (nbField > 1) {
			throw new ParameterDeclarationException(Messages.DiscoveryAnnotationControls_7);
		}
		if (nbGetter > 1) {
			throw new ParameterDeclarationException(Messages.DiscoveryAnnotationControls_8);
		}
		if (nbSetter > 1) {
			throw new ParameterDeclarationException(Messages.DiscoveryAnnotationControls_9);
		}
	}

	private static boolean isGetter(final Method method) {
		boolean result = true;
		result = result && method.getParameterTypes().length == 0;
		result = result && method.getReturnType() != null;
		result = result
				&& !method.getReturnType().getName().equals(DiscoveryAnnotationControls.VOID);
		result = result && !Modifier.isStatic(method.getModifiers());
		return result;
	}

	private static boolean isSetter(final Method method) {
		boolean result = true;
		result = result && method.getParameterTypes().length == 1;
		result = result && !Modifier.isStatic(method.getModifiers());
		return result;
	}

	private static boolean isGetter(final MethodDeclaration method) {
		boolean result = true;
		result = result && method.getParameters().size() == 0;
		result = result && method.getReturnType() != null;
		result = result
				&& !method.getReturnType().toString()
						.equalsIgnoreCase(DiscoveryAnnotationControls.VOID);
		result = result
				&& !method.getModifiers().contains(com.sun.mirror.declaration.Modifier.STATIC);
		return result;

	}

	private static boolean isSetter(final MethodDeclaration method) {
		boolean result = true;
		result = result && method.getParameters().size() == 1;
		result = result
				&& !method.getModifiers().contains(com.sun.mirror.declaration.Modifier.STATIC);
		return result;
	}
}
