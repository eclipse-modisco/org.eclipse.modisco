<<<<<<< HEAD   (3a7127 Bug 474680 - [Deprecated] org.eclipse.gmt.modisco.usecase.si)
=======
/*
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *******************************************************************************/

package org.eclipse.gmt.modisco.usecase.simpletransformationschain.actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.infra.common.core.internal.logging.MoDiscoLogHandler;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.Discoverer;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameterDirectionKind;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameterImpl;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.KnowledgeDiscoveryInterface;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.ModelplexKnowledgeDiscoveryFramework;
import org.eclipse.gmt.modisco.usecase.simpletransformationschain.ModelplexKnowledgeDiscoveryFrameworkPlugin;
import org.eclipse.m2m.atl.common.ATLLogger;
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
 *  cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=474680
 */
@Deprecated
public class DiscoverBidirectionalAssociationsInUmlModel implements Discoverer {

	private final String targetExtension = "uml"; //$NON-NLS-1$

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
			if (this.targetExtension.equals(iFile.getProjectRelativePath().getFileExtension())) {
				result = true;
			}
		}
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seeorg.eclipse.gmt.modisco.infra.discoverymanager.DiscovererInterface#
	 * discoverElement(java.lang.Object, org.eclipse.emf.common.util.URI)
	 */
	public Resource discoverElement(final Object source, final URI target) {
		Resource resource = null;
		final Logger logger = Logger.getLogger(ATLLogger.LOGGER_ID);
		// retrieval of Java project
		final IFile iFile = (IFile) source;

		final MoDiscoLogHandler logHandler = new MoDiscoLogHandler(iFile.getLocation().toString()
				+ ".log"); //$NON-NLS-1$
		logger.addHandler(logHandler);
		try {
			final KnowledgeDiscoveryInterface discoverer = new ModelplexKnowledgeDiscoveryFramework();
			discoverer.detectBidirectionalAssociationsInUmlModel(iFile, null);

		} catch (Exception e) {
			logger.log(Level.WARNING, "Error in discovery of java project", e); //$NON-NLS-1$
		} finally {
			logger.removeHandler(logHandler);
			logHandler.close();
			try {
				iFile.getParent().refreshLocal(1, null);
			} catch (Exception e1) {
				// give up
			}
		}
		// access UI resources so that we can obtain the current eclipse
		// workbench activePage
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				try {
					IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
							.getActivePage();
					IDE.openEditor(page, iFile);

				} catch (PartInitException e) {
					MoDiscoLogger.logError(e,
							ModelplexKnowledgeDiscoveryFrameworkPlugin.getDefault());
				}
			}
		});

		return resource;
	}

	@Override
	public String toString() {
		return "Discover bidirectional associations in UML model"; //$NON-NLS-1$
	}

	public DiscoverBidirectionalAssociationsInUmlModel() {
		this.targetModel = new DiscoveryParameterImpl("TargetModel", //$NON-NLS-1$
				DiscoveryParameterDirectionKind.out, Resource.class, false);
		this.discovererParameters.add(this.targetModel);
		this.targetUri = new DiscoveryParameterImpl("TargetUri", //$NON-NLS-1$
				DiscoveryParameterDirectionKind.in, URI.class, false);
		this.discovererParameters.add(this.targetUri);
	}

	private final DiscoveryParameterImpl targetModel;
	private final DiscoveryParameterImpl targetUri;
	private final List<DiscoveryParameter> discovererParameters = new ArrayList<DiscoveryParameter>();

	public void discoverElement(final Object source,
			final Map<DiscoveryParameter, Object> parameters) {
		URI targetUri = null;
		if (parameters.containsKey(this.targetUri)) {
			Object value = parameters.get(this.targetUri);
			if (value instanceof URI) {
				targetUri = (URI) value;
			}
		}
		Resource result = this.discoverElement(source, targetUri);
		parameters.put(this.targetModel, result);
	}

	public List<DiscoveryParameter> getDiscovererParameters() {
		return Collections.unmodifiableList(this.discovererParameters);
	}
}
>>>>>>> BRANCH (6b51ed Merge remote-tracking branch 'origin/maintenance-0.13')
