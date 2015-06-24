/**
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *******************************************************************************/

package org.eclipse.gmt.modisco.usecase.modelfilter.dependencies.actions;

import java.io.IOException;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.infra.common.core.internal.utils.ModelUtils;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.AbstractDiscovererImpl;
import org.eclipse.gmt.modisco.infra.discoverymanager.Discoverer;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.usecase.modelfilter.dependencies.Activator;
import org.eclipse.gmt.modisco.usecase.modelfilter.dependencies.editor.DependenciesEditor;
import org.eclipse.gmt.modisco.usecase.modelfilter.dependencies.editor.PrefuseGraphInput;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

/**
 * @author Gabriel Barbier
 * 
 * 
 * @deprecated use matching org.eclipse.modisco.x.y.z component,
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470806
 */
@Deprecated
public class DiscoverDependenciesFromJavaModel extends AbstractDiscovererImpl implements Discoverer {

	private final String sourceSuffix = "javaxmi"; //$NON-NLS-1$

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmt.modisco.discoverersmanager.DiscovererInterface#applyTo
	 * (java.lang.Object)
	 */
	public boolean isApplicableTo(final Object source) {
		boolean result = false;
		if (source instanceof IFile) {
			IFile ifile = (IFile) source;
			if (ifile.getFileExtension().equalsIgnoreCase(this.sourceSuffix)) {
				result = true;
			}
		}
		return result;
	}

	public String toString() {
		return Messages.DiscoverDependenciesFromJavaModel_discoveryName;
	}

	public void discoverElement(final Object source,
			final Map<DiscoveryParameter, Object> parameters) {
		Resource resource = null;
		final IFile ifile = (IFile) source;
		IProject tempProject = ifile.getProject();
		IJavaProject project = null;
		try {
			if (tempProject.hasNature(JavaCore.NATURE_ID)) {
				project = JavaCore.create(tempProject);
			}
		} catch (CoreException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
		if (project != null) {

			resource = this.loadJavaModel(ifile);
			final PrefuseGraphInput input = new PrefuseGraphInput(resource, project);
			// access UI resources so that we can obtain the current eclipse
			// workbench activePage
			Display.getDefault().asyncExec(new Runnable() {
				public void run() {
					try {
						IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
								.getActivePage();
						// programmatically opens the j2se5 model using the
						// default editor if one is present
						IDE.openEditor(page, input, DependenciesEditor.EditorID, true);
					} catch (PartInitException e) {
						MoDiscoLogger.logError(e, Activator.getDefault());
					}
				}
			});
		} else {
			MoDiscoLogger.logInfo(Messages.DiscoverDependenciesFromJavaModel_javaProjectNotFound,
					Activator.getDefault());
		}
		parameters.put(this.getTargetModelParameter(), resource);
	}

	/**
	 * @param ifile
	 * @return
	 */
	private Resource loadJavaModel(IFile ifile) {
		Resource result = null;
		try {
			result = ModelUtils.loadModel(ifile.getLocation().toFile());
		} catch (IOException e) {
			MoDiscoLogger.logError(e, Activator.getDefault());
		}
		return result;
	}

}
