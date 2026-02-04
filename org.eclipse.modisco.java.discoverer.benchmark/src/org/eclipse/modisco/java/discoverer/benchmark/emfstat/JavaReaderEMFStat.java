/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *    Romain Dervaux (Mia-Software)
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *******************************************************************************/

package org.eclipse.modisco.java.discoverer.benchmark.emfstat;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.ITypeRoot;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.discoverer.internal.io.java.JavaReader;
import org.eclipse.modisco.java.emf.JavaFactory;

public class JavaReaderEMFStat extends JavaReader {

	private Statistics statistics;

	public JavaReaderEMFStat(final JavaFactory factory, final boolean incremental) {
		super(factory, null, null);
		setIncremental(incremental);
	}

	public void setStatistics(final Statistics statistics) {
		this.statistics = statistics;
	}

	protected Statistics getStatistics() {
		return this.statistics;
	}

	@Override
	public void readModel(final Object source, final Model resultModel1,
			final IProgressMonitor monitor) {
		if (this.statistics != null) {
			this.statistics.beginDiscovery();
		}
		super.readModel(source, resultModel1, monitor);
		if (this.statistics != null) {
			this.statistics.endDiscovery();
		}
	}

	@Override
	protected void parsePackage(final IJavaProject javaProject, final Model resultModel1,
			final IPackageFragment parent, final IProgressMonitor monitor)
			throws JavaModelException {
		if (this.statistics != null) {
			this.statistics.tabValueReport("New non empty package fragment"); //$NON-NLS-1$
			this.statistics.newPackage(parent);
		}
		super.parsePackage(javaProject, resultModel1, parent, monitor);
	}

	@Override
	protected void parseTypeRoot(final ITypeRoot cu) {
		if (this.statistics != null) {
			this.statistics.newCompilationUnit(cu);
			this.statistics.tabValueReport("New cu"); //$NON-NLS-1$
		}
		super.parseTypeRoot(cu);
	}

	@Override
	protected void finalResolveBindings(final Model resultModel1) {
		super.finalResolveBindings(resultModel1);
		if (this.statistics != null) {
			this.statistics.tabValueReport("globalBindings resolved"); //$NON-NLS-1$
		}
	}
}
