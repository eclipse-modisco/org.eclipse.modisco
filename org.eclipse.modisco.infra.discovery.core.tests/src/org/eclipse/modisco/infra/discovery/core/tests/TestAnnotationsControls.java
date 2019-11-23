/*******************************************************************************
 * Copyright (c) 2010 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Fabien Giquel - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.core.tests;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.Assert;

import org.eclipse.modisco.infra.discovery.core.annotations.Parameter;
import org.eclipse.modisco.infra.discovery.core.internal.annotations.DiscoveryAnnotationControls;
import org.eclipse.modisco.infra.discovery.core.internal.annotations.ParameterDeclarationException;
import org.eclipse.modisco.infra.discovery.core.tests.discoverers.WrongDiscoverer;
import org.junit.Test;

public class TestAnnotationsControls {

	@Test
	public void testControls() {

		Map<String, Map<Member, Parameter>> memberToAnnotationsMaps = retrieveParametersAnnotations(WrongDiscoverer.class);

		for (Map.Entry<String, Map<Member, Parameter>> entry : memberToAnnotationsMaps
				.entrySet()) {
			String paramName = entry.getKey();
			for (Map.Entry<Member, Parameter> memberToParameterMap : entry
					.getValue().entrySet()) {
				if (paramName.equals("PARAM1")) { //$NON-NLS-1$
					if (memberToParameterMap.getKey() instanceof Method) {
						try {
							DiscoveryAnnotationControls.checkAnnotation(
									memberToParameterMap.getValue(), null,
									memberToParameterMap.getKey());
							Assert.fail("Parameter rule violation not detected for PARAM1 : annotated method must be a getter or a setter"); //$NON-NLS-1$
						} catch (ParameterDeclarationException e) {
							// ok
						}
					}
				}
				if (paramName.equals("PARAM2")) { //$NON-NLS-1$
					if (memberToParameterMap.getKey() instanceof Method) {
						try {
							DiscoveryAnnotationControls.checkAnnotation(
									memberToParameterMap.getValue(), null,
									memberToParameterMap.getKey());
							Assert.fail("Parameter rule violation not detected for PARAM2 : annotated method must be a getter or a setter"); //$NON-NLS-1$
						} catch (ParameterDeclarationException e) {
							// ok
						}
					}
				}
			}
			if (paramName.equals("PARAM3")) { //$NON-NLS-1$
				try {
					DiscoveryAnnotationControls
							.checkAnnotationsForOneParameter(null,
									entry.getValue(), null, null);
					Assert.fail("Parameter rule violation not detected for PARAM3 : no more than one field annotated with same id"); //$NON-NLS-1$
				} catch (ParameterDeclarationException e) {
					// ok
				}
			}

			if (paramName.equals("PARAM4")) { //$NON-NLS-1$
				try {
					DiscoveryAnnotationControls
							.checkAnnotationsForOneParameter(null,
									entry.getValue(), null, null);
					Assert.fail("Parameter rule violation not detected for PARAM4 : no more than one getter annotated with same id"); //$NON-NLS-1$
				} catch (ParameterDeclarationException e) {
					// ok
				}
			}

			if (paramName.equals("PARAM5")) { //$NON-NLS-1$
				try {
					DiscoveryAnnotationControls
							.checkAnnotationsForOneParameter(null,
									entry.getValue(), null, null);
					Assert.fail("Parameter rule violation not detected for PARAM5 : not the same type on field and getter"); //$NON-NLS-1$
				} catch (ParameterDeclarationException e) {
					// ok
				}
			}

			if (paramName.equals("PARAM6")) { //$NON-NLS-1$
				try {
					DiscoveryAnnotationControls
							.checkAnnotationsForOneParameter(null,
									entry.getValue(), null, null);
					Assert.fail("Parameter rule violation not detected for PARAM6 : not the same type on field and setter"); //$NON-NLS-1$
				} catch (ParameterDeclarationException e) {
					// ok
				}
			}

			if (paramName.equals("PARAM7")) { //$NON-NLS-1$
				try {
					DiscoveryAnnotationControls
							.checkAnnotationsForOneParameter(null,
									entry.getValue(), null, null);
					Assert.fail("Parameter rule violation not detected for PARAM7 : not the same type on getter and setter"); //$NON-NLS-1$
				} catch (ParameterDeclarationException e) {
					// ok
				}
			}

		}
	}

	private Map<String, Map<Member, Parameter>> retrieveParametersAnnotations(
			final Class<?> aDiscovererClass) {
		Map<String, Map<Member, Parameter>> memberToAnnotationsMaps = new HashMap<String, Map<Member, Parameter>>();
		List<Member> members = new ArrayList<Member>();

		for (Field aField : aDiscovererClass.getFields()) {
			members.add(aField);
		}
		for (Method aMethod : aDiscovererClass.getMethods()) {
			members.add(aMethod);
		}

		for (Member aMember : members) {
			Parameter annotation = null;
			if (aMember instanceof Field) {
				annotation = ((Field) aMember).getAnnotation(Parameter.class);
			}
			if (aMember instanceof Method) {
				annotation = ((Method) aMember).getAnnotation(Parameter.class);
			}
			if (annotation != null) {
				Map<Member, Parameter> memberToParameterMap = memberToAnnotationsMaps
						.get(annotation.name());
				if (memberToParameterMap == null) {
					memberToParameterMap = new HashMap<Member, Parameter>();
					memberToAnnotationsMaps.put(annotation.name(),
							memberToParameterMap);
				}
				memberToParameterMap.put(aMember, annotation);
			}

		}
		return memberToAnnotationsMaps;
	}

}
