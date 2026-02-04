/*******************************************************************************
 * Copyright (c) 2019 Mia-Software and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Unknown - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.custom.examples.java.jdk.internal;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.common.ui.internal.wizards.AbstractExampleWizard;

public class ExampleWizard extends AbstractExampleWizard {
	@Override
	protected Plugin getActivator() {
		return Activator.getDefault();
	}

	@Override
	protected void afterImport(final IProject project) {
		try {
			// Bug 309021 - Example import wizards import non-example classes
			project.getFile(
					"src/org/eclipse/modisco/infra/browser/custom/examples/java/jdk/internal/ExampleWizard.java") //$NON-NLS-1$
					.delete(IResource.FORCE, new NullProgressMonitor());
			// Bug 309976 - Remove the folder org from the MoDisco examples
			project.getFolder("org").delete(true, new NullProgressMonitor()); //$NON-NLS-1$
		} catch (CoreException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
	}
}
