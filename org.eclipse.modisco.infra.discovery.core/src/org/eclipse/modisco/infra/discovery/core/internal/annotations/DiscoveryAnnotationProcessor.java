/*******************************************************************************
 * Copyright (c) 2010 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.core.internal.annotations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jdt.apt.core.env.EclipseAnnotationProcessorEnvironment;
import org.eclipse.jdt.apt.core.env.Phase;
import org.eclipse.modisco.infra.discovery.core.annotations.Parameter;
import org.eclipse.modisco.infra.discovery.core.annotations.ParameterInitialValue;

import com.sun.mirror.apt.AnnotationProcessor;
import com.sun.mirror.declaration.ClassDeclaration;
import com.sun.mirror.declaration.FieldDeclaration;
import com.sun.mirror.declaration.MemberDeclaration;
import com.sun.mirror.declaration.MethodDeclaration;
import com.sun.mirror.declaration.TypeDeclaration;
import com.sun.mirror.type.InterfaceType;

public class DiscoveryAnnotationProcessor implements AnnotationProcessor {

	private static final String PARAMETER_PB_MARKER_ID = "org.eclipse.modisco.infra.discovery.core.parameterDeclarationProblem"; //$NON-NLS-1$
	private EclipseAnnotationProcessorEnvironment env;

	public DiscoveryAnnotationProcessor() {
	}

	public void setEnvironment(final EclipseAnnotationProcessorEnvironment anEnv) {
		this.env = anEnv;
	}

	public void process() {
		if (this.env == null || this.env.getPhase().equals(Phase.RECONCILE)// rules
		// check only on compilation phase
		) {
			return;
		}
		for (TypeDeclaration type : this.env.getTypeDeclarations()) {
			Map<String, Map<MemberDeclaration, Parameter>> memberToAnnotationsMaps = new HashMap<String, Map<MemberDeclaration, Parameter>>();
			Map<String, Map<MethodDeclaration, ParameterInitialValue>> initializerMethodToAnnotationsMaps = new HashMap<String, Map<MethodDeclaration, ParameterInitialValue>>();

			List<MemberDeclaration> members = new ArrayList<MemberDeclaration>();
			retrieveMembers(type, members);

			// clean old markers
			for (MemberDeclaration member : members) {
				MarkerUtils.deleteMarkers(member,
						DiscoveryAnnotationProcessor.PARAMETER_PB_MARKER_ID);
			}

			for (MemberDeclaration member : members) {
				Parameter parameterDeclaration = member.getAnnotation(Parameter.class);
				if (parameterDeclaration != null) {
					try {
						DiscoveryAnnotationControls.checkAnnotation(parameterDeclaration, member,
								null);
					} catch (ParameterDeclarationException e) {
						MarkerUtils.createMarker(member, e.getMessage(),
								DiscoveryAnnotationProcessor.PARAMETER_PB_MARKER_ID);
					}
					Map<MemberDeclaration, Parameter> memberToParameterMap = memberToAnnotationsMaps
							.get(parameterDeclaration.name());
					if (memberToParameterMap == null) {
						memberToParameterMap = new HashMap<MemberDeclaration, Parameter>();
						memberToAnnotationsMaps.put(parameterDeclaration.name(),
								memberToParameterMap);
					}
					memberToParameterMap.put(member, parameterDeclaration);
				}
				ParameterInitialValue initializerAnnotation = member
						.getAnnotation(ParameterInitialValue.class);
				if (initializerAnnotation != null && member instanceof MethodDeclaration) {
					try {
						DiscoveryAnnotationControls.checkAnnotation(initializerAnnotation,
								(MethodDeclaration) member, null);
					} catch (ParameterDeclarationException e) {
						MarkerUtils.createMarker(member, e.getMessage(),
								DiscoveryAnnotationProcessor.PARAMETER_PB_MARKER_ID);
					}
					Map<MethodDeclaration, ParameterInitialValue> methodToParameterMap = initializerMethodToAnnotationsMaps
							.get(initializerAnnotation.name());
					if (methodToParameterMap == null) {
						methodToParameterMap = new HashMap<MethodDeclaration, ParameterInitialValue>();
						initializerMethodToAnnotationsMaps.put(initializerAnnotation.name(),
								methodToParameterMap);
					}
					methodToParameterMap.put((MethodDeclaration) member, initializerAnnotation);
				}
			}

			// Now that annotations have been collected, we can check them
			// together
			for (Map.Entry<String, Map<MemberDeclaration, Parameter>> entry : memberToAnnotationsMaps
					.entrySet()) {

				Map<MethodDeclaration, ParameterInitialValue> methodToParameterMap = initializerMethodToAnnotationsMaps
						.get(entry.getKey());

				try {
					DiscoveryAnnotationControls.checkAnnotationsForOneParameter(entry.getValue(),
							null, methodToParameterMap, null);
				} catch (ParameterDeclarationException e) {
					// do not display here errors on super classes/interfaces,
					// which may be caused by the current subclass
					Collection<MemberDeclaration> localMembers = new ArrayList<MemberDeclaration>();
					for (MemberDeclaration member : entry.getValue().keySet()) {
						if (member.getDeclaringType().equals(type)) {
							localMembers.add(member);
						}
					}

					MarkerUtils.createMarkers(localMembers, e.getMessage(),
							DiscoveryAnnotationProcessor.PARAMETER_PB_MARKER_ID);
				}
			}
		}

	}

	private void retrieveMembers(final TypeDeclaration aType, final List<MemberDeclaration> members) {
		if (aType == null) {
			return;
		}
		for (FieldDeclaration aField : aType.getFields()) {
			members.add(aField);
		}
		for (MethodDeclaration aMethod : aType.getMethods()) {
			members.add(aMethod);
		}
		for (InterfaceType anInterface : aType.getSuperinterfaces()) {
			retrieveMembers(anInterface.getDeclaration(), members);
		}
		if (aType instanceof ClassDeclaration && ((ClassDeclaration) aType).getSuperclass() != null) {
			retrieveMembers(((ClassDeclaration) aType).getSuperclass().getDeclaration(), members);
		}
	}
}
