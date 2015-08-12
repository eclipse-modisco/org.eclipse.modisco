/**
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *******************************************************************************/

package org.eclipse.gmt.modisco.kdm.uml2converter.actions;

import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.AbstractDiscovererImpl;
import org.eclipse.gmt.modisco.infra.discoverymanager.Discoverer;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameterDirectionKind;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameterImpl;
import org.eclipse.gmt.modisco.kdm.uml2converter.KdmToUml2Activator;
import org.eclipse.gmt.modisco.kdm.uml2converter.KdmToUmlConverter;
import org.eclipse.gmt.modisco.kdm.uml2converter.Messages;
import org.eclipse.gmt.modisco.kdm.uml2converter.impl.KdmtoUmlConverterImpl;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

/**
 * @author Gabriel Barbier
 * 
 * 
 * @deprecated use matching org.eclipse.modisco.x.y.z component, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=474827
 */
@Deprecated
public class DiscoverUmlModelFromKdmModel extends AbstractDiscovererImpl implements Discoverer {

	private final String sourceExtension = "kdm"; //$NON-NLS-1$
	private final String targetExtension = "uml"; //$NON-NLS-1$

	private final DiscoveryParameter customTransformationParameter;

	public final DiscoveryParameter getCustomTransformationParameter() {
		return this.customTransformationParameter;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmt.modisco.infra.discoverymanager.DiscovererInterface#applyTo
	 * (java.lang.Object)
	 */
	public boolean isApplicableTo(final Object source) {
		boolean result = false;
		if (source instanceof IFile) {
			IFile iFile = (IFile) source;
			String extension = iFile.getFileExtension();
			if ((extension != null) && (extension.equals(this.sourceExtension))) {
				result = true;
			}
		}
		return result;
	}

	public String toString() {
		return Messages.DiscoverUmlModelFromKdmModel_4;
	}

	public DiscoverUmlModelFromKdmModel() {
		super();
		this.customTransformationParameter = new DiscoveryParameterImpl(
				"CustomTransformation", DiscoveryParameterDirectionKind.in, IFile.class, false); //$NON-NLS-1$
		this.getBasicDiscovererParameters().add(this.customTransformationParameter);
	}

	public void discoverElement(final Object source,
			final Map<DiscoveryParameter, Object> parameters) {
		Resource result = null;
		URI target = null;
		if (parameters.containsKey(this.getTargetUriParameter())) {
			Object value = parameters.get(this.getTargetUriParameter());
			if (value instanceof URI) {
				target = (URI) value;
			}
		}

		// retrieval of Java project
		final IFile iFile = (IFile) source;
		final String sourcePath = iFile.getFullPath().toString();

		// retrieval of target uri
		URI umlModelURI = null;
		if (target != null) {
			umlModelURI = target;
		} else {
			IPath tempPath = iFile.getFullPath().removeFileExtension()
					.addFileExtension(this.targetExtension);
			umlModelURI = URI.createPlatformResourceURI(tempPath.toString(), true);
		}

		try {
			final KdmToUmlConverter transfo = new KdmtoUmlConverterImpl();
			Resource kdmModel = new XMIResourceImpl();
			kdmModel.setURI(URI.createPlatformResourceURI(sourcePath, true));
			Resource[] resources = null;
			if (parameters.containsKey(this.getCustomTransformationParameter())) {
				IFile customTransfo = (IFile) parameters.get(this
						.getCustomTransformationParameter());
				resources = transfo.getUML2ModelFromKDMModelWithCustomTransformation(
						kdmModel.getURI(), false, customTransfo.getLocationURI().toURL(),
						umlModelURI);
			} else {
				resources = transfo.getUML2ModelFromKDMModel(kdmModel, false, umlModelURI);
			}
			result = resources[0];
		} catch (Exception e) {
			MoDiscoLogger.logError(e, KdmToUml2Activator.getDefault());
		} finally {
			try {
				iFile.getParent().refreshLocal(1, null);
			} catch (Exception e1) {
				MoDiscoLogger.logWarning(e1, KdmToUml2Activator.getDefault());
			}
		}
		boolean silent = false;
		if (parameters.containsKey(this.getSilentModeParameter())) {
			silent = (Boolean) parameters.get(this.getSilentModeParameter());
		}
		// access UI resources so that we can obtain the current eclipse
		// workbench activePage
		if (silent == false) {
			final URI umlModelURIf = umlModelURI;
			Display.getDefault().asyncExec(new Runnable() {
				public void run() {
					try {
						IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
						IFile ifile = null;
						if (umlModelURIf.isFile()) {
							ifile = root.getFileForLocation(new Path(umlModelURIf.toFileString()));
						} else {
							ifile = root.getFile(new Path(umlModelURIf.toPlatformString(true)));
						}
						if ((ifile != null) && ifile.exists()) {
							IWorkbenchPage page = PlatformUI.getWorkbench()
									.getActiveWorkbenchWindow().getActivePage();
							// programmatically opens the model using the
							// default editor if one is present
							IDE.openEditor(page, ifile);
						}
					} catch (PartInitException e) {
						MoDiscoLogger.logWarning(e, KdmToUml2Activator.getDefault());
					}
				}
			});
		}
		parameters.put(this.getTargetModelParameter(), result);
	}

}
