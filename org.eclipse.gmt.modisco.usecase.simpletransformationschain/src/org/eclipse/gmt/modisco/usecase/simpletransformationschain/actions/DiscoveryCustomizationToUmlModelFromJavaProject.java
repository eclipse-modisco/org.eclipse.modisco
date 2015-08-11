<<<<<<< HEAD   (3a7127 Bug 474680 - [Deprecated] org.eclipse.gmt.modisco.usecase.si)
=======
/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *******************************************************************************/

package org.eclipse.gmt.modisco.usecase.simpletransformationschain.actions;

import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.AbstractDiscovererImpl;
import org.eclipse.gmt.modisco.infra.discoverymanager.Discoverer;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.Messages;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.ModelplexKnowledgeDiscoveryFrameworkPlugin;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.controller.ControllerServices;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.controller.impl.ControllerImpl;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.ModelReadWriteServices;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.model.impl.ModelImpl;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.ui.ModelplexWizard;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * @author Gabriel Barbier
 * 
 * 
 * @deprecated use matching org.eclipse.modisco.x.y.z component,
 *  cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=474680
 */
@Deprecated
public class DiscoveryCustomizationToUmlModelFromJavaProject extends AbstractDiscovererImpl
		implements Discoverer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmt.modisco.infra.discoverymanager.DiscovererInterface#applyTo
	 * (java.lang.Object)
	 */
	public boolean isApplicableTo(final Object source) {
		boolean result = false;
		if (source instanceof IJavaProject) {
			result = ((IJavaProject) source).getProject().isAccessible();
		} else if (source instanceof IProject) {
			IProject project = (IProject) source;
			try {
				if ((project.isAccessible()) && (project.hasNature(JavaCore.NATURE_ID))) {
					result = true;
				}
			} catch (CoreException e) {
				MoDiscoLogger.logError(e, ModelplexKnowledgeDiscoveryFrameworkPlugin.getDefault());
			}
		}
		return result;
	}

	@Override
	public String toString() {
		return Messages.DiscoveryCustomizationToUmlModelFromJavaProject_0;
	}

	public DiscoveryCustomizationToUmlModelFromJavaProject() {
		super();
	}

	public void discoverElement(final Object source,
			final Map<DiscoveryParameter, Object> parameters) {
		// retrieval of Java project
		IJavaProject tempProject = null;
		if (source instanceof IJavaProject) {
			tempProject = (IJavaProject) source;
		} else if (source instanceof IProject) {
			IProject project = (IProject) source;
			try {
				if (project.hasNature(JavaCore.NATURE_ID)) {
					tempProject = JavaCore.create(project);
				}
			} catch (CoreException e) {
				MoDiscoLogger.logError(e, ModelplexKnowledgeDiscoveryFrameworkPlugin.getDefault());
			}
		}
		final IJavaProject project = tempProject;

		final ModelReadWriteServices modelServices = new ModelImpl(project);
		final ControllerServices controller = new ControllerImpl(project, modelServices);

		// access UI resources so that we can obtain the current eclipse
		// workbench activePage
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				// Create the wizard
				final ModelplexWizard wizard = new ModelplexWizard(controller);
				// initialize dialog icon and store old one
				Image oldImage = Window.getDefaultImage();
				Window.setDefaultImage(ModelplexKnowledgeDiscoveryFrameworkPlugin
						.getImageDescriptor("resources/images/NewEcore2Ecore.gif").createImage()); //$NON-NLS-1$
				// Create the wizard dialog
				WizardDialog dialog = new WizardDialog(new Shell(), wizard);
				// Open the wizard dialog
				dialog.open();
				// restore default icon
				Window.setDefaultImage(oldImage);
			}
		});

	}

}
>>>>>>> BRANCH (6b51ed Merge remote-tracking branch 'origin/maintenance-0.13')
