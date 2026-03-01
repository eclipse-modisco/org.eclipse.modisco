/*******************************************************************************
 * Copyright (c) 2009, 2026 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Sebastien Minguet (Mia-Software) - initial API and implementation
 *    Frederic Madiot (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Erwan Breton (Sodifrance) - initial API and implementation
 *    Romain Dervaux (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *******************************************************************************/

package org.eclipse.modisco.java.discoverer;

import java.io.IOException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IClassFile;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer;
import org.eclipse.modisco.infra.discovery.core.annotations.Parameter;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.discoverer.internal.IModelReader;
import org.eclipse.modisco.java.discoverer.internal.io.library.LibraryReader;
import org.eclipse.modisco.java.emf.JavaFactory;

/** Discover a Java model from a Java class file. */
public class DiscoverJavaModelFromClassFile extends AbstractModelDiscoverer<IClassFile> {

	public static final String ID = "org.eclipse.modisco.java.discoverer.class"; //$NON-NLS-1$

	private boolean fDiscoverExpressions;

	/**
	 * @since 1.6
	 */
	protected boolean isDiscoverExpressions() {
		return this.fDiscoverExpressions;
	}

	/**
	 * @since 1.6
	 */
	@Parameter(name = "DISCOVER_EXPRESSIONS", requiresInputValue = false, description = "Whether to discover the full expression AST. The standard behavior discovers just the class structure.")
	public void setDiscoverExpressions(final boolean discoverExpressions) {
		this.fDiscoverExpressions = discoverExpressions;
	}

	@Override
	public boolean isApplicableTo(final IClassFile classFile) {
		return classFile.exists();
	}

	protected static JavaFactory getEFactory() {
		return org.eclipse.modisco.java.emf.JavaFactory.eINSTANCE;
	}

	protected static IModelReader getClassReader() {
		return new LibraryReader(getEFactory());
	}

	@Override
	protected void basicDiscoverElement(final IClassFile classFile, final IProgressMonitor monitor)
			throws DiscoveryException {

		IJavaProject javaProject = classFile.getJavaProject();
		if (javaProject == null) {
			return;
		}
		IProject project = javaProject.getProject();
		String qualifiedTypeName = classFile.getParent().getElementName() + "." + classFile.getElementName();
		if (qualifiedTypeName.endsWith(".class")) {					// SuffixConstants.SUFFIX_STRING_class
			qualifiedTypeName = qualifiedTypeName.substring(0, qualifiedTypeName.length() - 6);
		}
		String qualifiedFileName = qualifiedTypeName.concat(JavaDiscoveryConstants.JAVA_MODEL_FILE_SUFFIX);
		if (qualifiedFileName.contains("$")) {
			getClass();		// XXX
		}
		setDefaultTargetURI(URI.createPlatformResourceURI(
				project.getFullPath().append(qualifiedFileName).toString(), true));

		JavaFactory eFactory = getEFactory();
		Model model = eFactory.createModel();
		createTargetModel().getContents().add(model);
	//	IModelReader reader = getClassReader();
		LibraryReader reader = new LibraryReader(eFactory);
		reader.setDiscoverExpressions(this.fDiscoverExpressions);
		reader.readModel(classFile, model, monitor);
		if (monitor.isCanceled()) {
			return;
		}
		reader.terminate(monitor);
	}

	@Override
	public void saveTargetModel() throws IOException {
		super.saveTargetModel();
	}

	@Override
	public void setResourceSet(ResourceSet resourceSet) {
		super.setResourceSet(resourceSet);
	}
}
