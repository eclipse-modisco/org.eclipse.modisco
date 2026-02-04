/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *******************************************************************************/

package org.eclipse.modisco.infra.discovery.core.internal.annotations;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

import org.eclipse.jdt.apt.core.env.EclipseAnnotationProcessorEnvironment;
import org.eclipse.jdt.apt.core.env.EclipseAnnotationProcessorFactory;
import org.eclipse.modisco.infra.discovery.core.annotations.Parameter;
import org.eclipse.modisco.infra.discovery.core.annotations.ParameterInitialValue;

import com.sun.mirror.apt.AnnotationProcessor;
import com.sun.mirror.apt.AnnotationProcessorEnvironment;
import com.sun.mirror.apt.AnnotationProcessors;
import com.sun.mirror.declaration.AnnotationTypeDeclaration;

public class DiscoveryAnnotationsProcessorFactory implements EclipseAnnotationProcessorFactory {

	private final DiscoveryAnnotationProcessor processor = new DiscoveryAnnotationProcessor();
	private final Collection<String> supportedAnnotationTypes = Arrays.asList(
			Parameter.class.getName(), ParameterInitialValue.class.getName());

	public AnnotationProcessor getProcessorFor(final Set<AnnotationTypeDeclaration> atds,
			final AnnotationProcessorEnvironment env) {
		return getProcessorFor(atds, (EclipseAnnotationProcessorEnvironment) env);
	}

	public AnnotationProcessor getProcessorFor(final Set<AnnotationTypeDeclaration> atds,
			final EclipseAnnotationProcessorEnvironment env) {
		if (atds.isEmpty()) {
			return AnnotationProcessors.NO_OP;
		}

		this.processor.setEnvironment(env);
		return this.processor;

	}

	public Collection<String> supportedAnnotationTypes() {
		return this.supportedAnnotationTypes;
	}

	public Collection<String> supportedOptions() {
		return Collections.emptyList();

	}

	protected DiscoveryAnnotationProcessor getProcessor() {
		return this.processor;
	}

}
