//Start of user code copyright
/*******************************************************************************
 * Copyright (c) 2026 OBEOSOFT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Yvan Lussaud (OBEOSOFT) - initial API and implementation
 *******************************************************************************/
//End of user code

package org.eclipse.modisco.infra.discovery.benchmark.core.internal.reporting;

//Start of user code imports
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Benchmark;


public class HtmlReportGeneratorEclipse extends HtmlReportGenerator {

	@Deprecated /* @deprecated obsolete Acceleo 3 API */
	private final List<EObject> values;

	@Deprecated /* @deprecated obsolete Acceleo 3 API */
	public HtmlReportGeneratorEclipse(IFile selected, String target) {
		super(Collections.singletonList(URI.createFileURI(selected.getLocation().toString()).toString()), target);
		this.values = null;
	}

	@Deprecated /* @deprecated obsolete Acceleo 3 API */
	public HtmlReportGeneratorEclipse(Benchmark selected, String target) {
		super(Collections.emptyList(), target);
		this.values = Collections.singletonList(selected);
	}

	@Deprecated /* @deprecated obsolete Acceleo 3 API */
	protected List<EObject> getValues(Object queryEnvironment,
			Map<EClass, List<EObject>> valuesCache, Object type, ResourceSet resourceSetForModels,
			List<Resource> modelResources, Monitor monitor) {
		return null;
	}

	@Override
	protected void standaloneInitialization(ResourceSet resourceSetForModels) {
		// nothing to do here
	}

	@Deprecated /* @deprecated obsolete Acceleo 3 API */
	protected Object createResolver() {
		return null;
	}


	@Override
	public void generate(Monitor monitor) throws IOException {
		if (target != null) {
			reportGenerator.generate(values);
		}
	}

	@Deprecated /* @deprecated obsolete Acceleo 3 API */
	protected void printDiagnostics(Object generationResult) {
	}

	@Deprecated /* @deprecated obsolete Acceleo 3 API */
	protected void printDiagnostic(Diagnostic diagnostic) {}

	@Deprecated /* @deprecated obsolete Acceleo 3 API */
	protected void printSummary(Object result) {}

	@Deprecated /* @deprecated obsolete Acceleo 3 API */
	protected void afterGeneration(Object generationResult) {}
}
