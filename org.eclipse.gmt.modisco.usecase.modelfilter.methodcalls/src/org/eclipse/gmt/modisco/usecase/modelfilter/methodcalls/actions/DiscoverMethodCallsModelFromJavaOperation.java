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

package org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.actions;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.discoverymanager.AbstractDiscovererImpl;
import org.eclipse.gmt.modisco.infra.discoverymanager.Discoverer;
import org.eclipse.gmt.modisco.infra.discoverymanager.DiscoveryParameter;
import org.eclipse.gmt.modisco.java.AbstractMethodDeclaration;
import org.eclipse.gmt.modisco.java.internal.core.JavaJdtBridge;
import org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.Activator;
import org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.converter.MethodCallsGraphConverter;
import org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.converter.MethodCallsJavaBridge;
import org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.editor.MethodCallsModelEditor;
import org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.editor.PrefuseGraphInput;
import org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.CallNode;
import org.eclipse.gmt.modisco.usecases.modelfilter.converter.JavaConverter;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.JavaModelException;
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
public class DiscoverMethodCallsModelFromJavaOperation extends AbstractDiscovererImpl implements
		Discoverer {

	private final String methodCallsModelExtension = "methodcalls"; //$NON-NLS-1$

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmt.modisco.discoverersmanager.DiscovererInterface#applyTo
	 * (java.lang.Object)
	 */
	public boolean isApplicableTo(final Object source) {
		boolean result = false;
		if (source instanceof IMethod) {
			result = true;
		}
		return result;
	}

	public String toString() {
		return Messages.DiscoverMethodCallsModelFromJavaOperation_discoveryName;
	}

	public void discoverElement(final Object source,
			final Map<DiscoveryParameter, Object> parameters) {
		Resource resource = null;
		IMethod method = (IMethod) source;
		// retrieval of Java project
		final IJavaProject project = method.getJavaProject();
		if (project != null) {

			try {
				JavaConverter discoverer = new JavaConverter(project);
				Resource javaResource = discoverer.convertJavaProjectToJavaModel();
				URI targetUri = javaResource.getURI().trimFileExtension()
						.appendFileExtension(this.methodCallsModelExtension);
				if (parameters.containsKey(this.getTargetUriParameter())) {
					targetUri = (URI) parameters.get(this.getTargetUriParameter());
				} // else use default
				MethodCallsGraphConverter callsConverter = new MethodCallsGraphConverter();
				resource = callsConverter.convertJavaResourceToMethodCallsResource(javaResource,
						targetUri);

				/*
				 * we will retrieve java operation (in model), corresponding to java method if not,
				 * we will use the whole model
				 */
				PrefuseGraphInput inputTemp = null;
				JavaJdtBridge bridge = new JavaJdtBridge();
				AbstractMethodDeclaration targetOperation = bridge.getJavaOperation(javaResource,
						method);
				MethodCallsJavaBridge callBridge = new MethodCallsJavaBridge();
				CallNode callNode = callBridge.getCallNode(resource, targetOperation);
				if (callNode != null) {
					inputTemp = new PrefuseGraphInput(callNode, project);
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
							// programmatically opens the j2se5 model using the
							// default editor if one is present
							IDE.openEditor(page, input, MethodCallsModelEditor.EditorID, true);
						} catch (PartInitException e) {
							MoDiscoLogger.logError(e, Activator.getDefault());
						}
					}
				});
			} catch (JavaModelException e) {
				MoDiscoLogger.logError(e, Activator.getDefault());
			}
		} else {

		}
		parameters.put(this.getTargetModelParameter(), resource);
	}

}
