/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.core.internal.catalog;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.discovery.catalog.CatalogFactory;
import org.eclipse.modisco.infra.discovery.catalog.DirectionKind;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter;
import org.eclipse.modisco.infra.discovery.core.annotations.Parameter;
import org.eclipse.modisco.infra.discovery.core.annotations.ParameterInitialValue;
import org.eclipse.modisco.infra.discovery.core.internal.Activator;
import org.eclipse.modisco.infra.discovery.core.internal.annotations.DiscoveryAnnotationControls;
import org.eclipse.modisco.infra.discovery.core.internal.annotations.ParameterDeclarationException;

public final class DiscovererParameterUtils {

	private static final String VOID_TYPE = "void"; //$NON-NLS-1$

	private static DiscovererParameterUtils singleton = new DiscovererParameterUtils();

	private DiscovererParameterUtils() {
		// empty
	}

	public static synchronized DiscovererParameterUtils getInstance() {
		if (DiscovererParameterUtils.singleton == null) {
			DiscovererParameterUtils.singleton = new DiscovererParameterUtils();
		}
		return DiscovererParameterUtils.singleton;
	}

	/**
	 * This method computes the parameters description for one discoverer
	 * implementation
	 *
	 */
	public void computeParameters(final DiscovererDescription discovererDescription) {
		// (discoverer parameter ID, (class field or method, Parameter
		// annotation))
		Map<String, Map<Member, Parameter>> memberToParameterAnnotationMaps = new HashMap<String, Map<Member, Parameter>>();
		// (discoverer parameter ID, (class method, ParameterInitialValue
		// annotation))
		Map<String, Map<Method, ParameterInitialValue>> methodToParameterInitialValueAnnotationMaps = new HashMap<String, Map<Method, ParameterInitialValue>>();
		List<Member> members = new ArrayList<Member>();

		retrieveMembers(discovererDescription.getImplementationType(), members);

		for (Member aMember : members) {
			Parameter parameterAnnotation = null;
			ParameterInitialValue parameterInitialValueAnnotation = null;
			if (aMember instanceof Field) {
				parameterAnnotation = ((Field) aMember).getAnnotation(Parameter.class);
			}
			if (aMember instanceof Method) {
				parameterAnnotation = ((Method) aMember).getAnnotation(Parameter.class);
				parameterInitialValueAnnotation = ((Method) aMember)
						.getAnnotation(ParameterInitialValue.class);
			}
			if (parameterAnnotation != null) {
				try {
					DiscoveryAnnotationControls.checkAnnotation(parameterAnnotation, null, aMember);

					Map<Member, Parameter> memberToParameterMap = memberToParameterAnnotationMaps
							.get(parameterAnnotation.name());
					if (memberToParameterMap == null) {
						memberToParameterMap = new HashMap<Member, Parameter>();
						memberToParameterAnnotationMaps.put(parameterAnnotation.name(),
								memberToParameterMap);
					}
					memberToParameterMap.put(aMember, parameterAnnotation);

				} catch (ParameterDeclarationException e) {
					MoDiscoLogger.logError(
							"Some Discoverer parameter annotation " + parameterAnnotation //$NON-NLS-1$
									+ " has problems and will be ignored : " //$NON-NLS-1$
									+ e.getMessage(), Activator.getDefault());
				}
			}
			if (parameterInitialValueAnnotation != null) {
				try {
					DiscoveryAnnotationControls.checkAnnotation(parameterInitialValueAnnotation,
							null, (Method) aMember);

					Map<Method, ParameterInitialValue> methodToParameterInitialValueMap = methodToParameterInitialValueAnnotationMaps
							.get(parameterInitialValueAnnotation.name());
					if (methodToParameterInitialValueMap == null) {
						methodToParameterInitialValueMap = new HashMap<Method, ParameterInitialValue>();
						methodToParameterInitialValueAnnotationMaps.put(
								parameterInitialValueAnnotation.name(),
								methodToParameterInitialValueMap);
					}
					methodToParameterInitialValueMap.put((Method) aMember,
							parameterInitialValueAnnotation);

				} catch (ParameterDeclarationException e) {
					MoDiscoLogger
							.logError(
									"Some Discoverer parameter annotation " + parameterInitialValueAnnotation //$NON-NLS-1$
											+ " has problems and will be ignored : " //$NON-NLS-1$
											+ e.getMessage(), Activator.getDefault());
				}
			}
		}

		// Now that annotations have been collected, we can check them together
		// and compute some unified definitions
		for (Map.Entry<String, Map<Member, Parameter>> entry : memberToParameterAnnotationMaps
				.entrySet()) {
			Map<Method, ParameterInitialValue> methodToParameterInitialValueMap = methodToParameterInitialValueAnnotationMaps
					.get(entry.getKey());

			try {
				DiscoveryAnnotationControls.checkAnnotationsForOneParameter(null, entry.getValue(),
						null, methodToParameterInitialValueMap);
			} catch (ParameterDeclarationException e) {
				MoDiscoLogger
						.logError(
								"Some Discoverer annotations have problems and will be ignored : " + e.getMessage(), //$NON-NLS-1$
								Activator.getDefault());
			}

			Method initializer = null;
			// there should be at most one initial value method
			if (methodToParameterInitialValueMap != null
					&& methodToParameterInitialValueMap.keySet().size() > 0) {
				initializer = methodToParameterInitialValueMap.keySet().iterator().next();
			}

			DiscovererParameter discoveryParameter = CatalogFactory.eINSTANCE
					.createDiscovererParameter();

			unifyParameterProperties(entry.getValue(), initializer, discoveryParameter);

			discovererDescription.getParameterDefinitions().add(discoveryParameter);
		}

	}

	/*
	 * Iterate on annotations to retrieve and unify the parameter properties.
	 * Annotations coherence is supposed to be already checked : we compute here
	 * a very basic initialization, may be with redundant affectations
	 */
	private static synchronized void unifyParameterProperties(
			final Map<Member, Parameter> memberToAnnotationMap, final Method initializer,
			final DiscovererParameter discoveryParameter) {
		boolean required = false;
		Class<?> type = null;
		String name = null;
		String description = null;
		DirectionKind direction = null;
		Field field = null;
		Method getter = null;
		Method setter = null;
		List<Parameter> declaringAnnotations = new ArrayList<Parameter>();
		for (Map.Entry<Member, Parameter> entry : memberToAnnotationMap.entrySet()) {
			if (entry.getValue().name() != null && entry.getValue().name().length() > 0) {
				name = entry.getValue().name();
			}
			if (entry.getValue().description() != null
					&& entry.getValue().description().length() > 0) {
				description = entry.getValue().description();
			}

			required = required || entry.getValue().requiresInputValue();

			declaringAnnotations.add(entry.getValue());

			if (entry.getKey() instanceof Field) {
				field = (Field) entry.getKey();

				if (Modifier.isPublic(field.getModifiers())) {
					direction = DirectionKind.INOUT;
					type = field.getType();
				}
			} else if (entry.getKey() instanceof Method) {
				Method method = (Method) entry.getKey();
				if (isGetter(method)) {
					type = method.getReturnType();
					getter = method;
					if (direction == null) {
						direction = DirectionKind.OUT;
					} else {
						direction = DirectionKind.INOUT;
					}
				} else if (isSetter(method)) {
					type = method.getParameterTypes()[0];
					setter = method;
					if (direction == null) {
						direction = DirectionKind.IN;
					} else {
						direction = DirectionKind.INOUT;
					}
				}
			}
		}

		discoveryParameter.setId(name);
		discoveryParameter.setDescription(description);
		discoveryParameter.setRequiredInput(required);
		discoveryParameter.setType(type);
		discoveryParameter.setDirection(direction);
		discoveryParameter.setField(field);
		discoveryParameter.setGetter(getter);
		discoveryParameter.setSetter(setter);
		discoveryParameter.setInitializer(initializer);
	}

	private void retrieveMembers(final Class<?> aClass, final List<Member> members) {
		for (Field aField : aClass.getFields()) {
			members.add(aField);
		}
		for (Method aMethod : aClass.getMethods()) {
			members.add(aMethod);
		}
		for (Class<?> anInterface : aClass.getInterfaces()) {
			retrieveMembers(anInterface, members);
		}
		if (aClass.getSuperclass() != null) {
			retrieveMembers(aClass.getSuperclass(), members);
		}
	}

	private static boolean isGetter(final Method method) {
		// Methods are supposed to be already checked : we do not compute all
		// conditions here for a getter
		return method.getReturnType() != null
				&& !method.getReturnType().getName().equals(DiscovererParameterUtils.VOID_TYPE);
	}

	private static boolean isSetter(final Method method) {
		// Methods are supposed to be already checked : we do not compute all
		// conditions here for a setter
		return method.getParameterTypes().length > 0;
	}

}
