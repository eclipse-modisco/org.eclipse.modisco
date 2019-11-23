/*******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.gmt.modisco.java.browser.customization.internal;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.common.ui.internal.wizards.AbstractExampleWizard;

/**
 * @deprecated cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=474970
 */
@Deprecated
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
					"src/org/eclipse/gmt/modisco/java/browser/customization/internal/ExampleWizard.java") //$NON-NLS-1$
					.delete(IResource.FORCE, new NullProgressMonitor());
			// Bug 309976 - Remove the folder org from the MoDisco examples
			project.getFolder("org").delete(true, new NullProgressMonitor()); //$NON-NLS-1$
		} catch (CoreException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
	}
}
