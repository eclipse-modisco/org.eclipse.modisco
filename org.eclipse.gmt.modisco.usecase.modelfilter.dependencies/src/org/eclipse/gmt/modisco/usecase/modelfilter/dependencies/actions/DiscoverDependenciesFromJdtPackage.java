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

import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.AbstractDiscovererImpl;
import org.eclipse.gmt.modisco.infra.discoverymanager.Discoverer;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.java.internal.core.JavaJdtBridge;
import org.eclipse.gmt.modisco.usecase.modelfilter.dependencies.Activator;
import org.eclipse.gmt.modisco.usecase.modelfilter.dependencies.editor.DependenciesEditor;
import org.eclipse.gmt.modisco.usecase.modelfilter.dependencies.editor.PrefuseGraphInput;
import org.eclipse.gmt.modisco.usecases.modelfilter.converter.JavaConverter;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.gmt.modisco.java.Package;

/**
 * @author Gabriel Barbier
 * 
 * 
 * @deprecated use matching org.eclipse.modisco.x.y.z component,
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470806
 */
@Deprecated
public class DiscoverDependenciesFromJdtPackage extends AbstractDiscovererImpl implements
		Discoverer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmt.modisco.discoverersmanager.DiscovererInterface#applyTo
	 * (java.lang.Object)
	 */
	public boolean isApplicableTo(final Object source) {
		boolean result = false;
		if (source instanceof IPackageFragment) {
			result = true;
		}
		return result;
	}

	public String toString() {
		return Messages.DiscoverDependenciesFromJdtPackage_discoveryName;
	}

	public void discoverElement(final Object source,
			final Map<DiscoveryParameter, Object> parameters) {
		Resource resource = null;
		IPackageFragment jdtPackage = (IPackageFragment) source;

		// retrieval of Java project
		IJavaProject project = jdtPackage.getJavaProject();
		if (project != null) {
			try {
				JavaConverter discoverer = new JavaConverter(project);
				resource = discoverer.convertJavaProjectToJavaModel();

				JavaJdtBridge bridge = new JavaJdtBridge();
				Package modelPackage = bridge.getJavaPackage(resource, jdtPackage);
				PrefuseGraphInput inputTemp = null;
				if (modelPackage != null) {
					inputTemp = new PrefuseGraphInput(modelPackage, project);
				} else {
					inputTemp = new PrefuseGraphInput(resource, project);
				}

				final PrefuseGraphInput input = inputTemp;
				// access UI resources so that we can obtain the current eclipse
				// workbench activePage
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						try {
							IWorkbenchPage page = PlatformUI.getWorkbench()
									.getActiveWorkbenchWindow().getActivePage();
							// programmatically opens the java model using the
							// default editor if one is present
							IDE.openEditor(page, input, DependenciesEditor.EditorID, true);
						} catch (PartInitException e) {
							MoDiscoLogger.logError(e, Activator.getDefault());
						}
					}
				});
			} catch (JavaModelException e) {
				MoDiscoLogger.logError(e, Activator.getDefault());
			}
		} else {
			MoDiscoLogger.logInfo(Messages.DiscoverDependenciesFromJdtPackage_javaProjectNotFound,
					Activator.getDefault());
		}
		parameters.put(this.getTargetModelParameter(), resource);
	}

}
