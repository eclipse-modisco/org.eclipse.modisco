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

package org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.editor;

import java.awt.Frame;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComponent;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.java.AbstractMethodDeclaration;
import org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.Activator;
import org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.converter.PrefuseGraphContainerForJava;
import org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.CallNode;
import org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.CallsModel;
import org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.MethodCall;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.FileEditorInput;

import prefuse.data.Graph;
import prefuse.data.Node;
import prefuse.data.Table;
import prefuse.data.Tree;

/**
 * @author Gabriel Barbier
 * 
 * 
 * @deprecated use matching org.eclipse.modisco.x.y.z component,
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470806
 */
@Deprecated
public class MethodCallsModelEditor extends EditorPart {

	public static final String EditorID = "org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.modeleditor.prefuse.EditorID"; //$NON-NLS-1$

	private PrefuseGraphInput editorInput;

	/*
	 * (non-Javadoc)
	 * 
	 * @seeorg.eclipse.ui.part.EditorPart#doSave(org.eclipse.core.runtime. IProgressMonitor)
	 */
	@Override
	public void doSave(IProgressMonitor monitor) {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.EditorPart#doSaveAs()
	 */
	@Override
	public void doSaveAs() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.EditorPart#init(org.eclipse.ui.IEditorSite,
	 * org.eclipse.ui.IEditorInput)
	 */
	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		this.setSite(site);
		this.setPartName(Messages.MethodCallsModelEditor_partName);
		if (input instanceof PrefuseGraphInput) {
			this.editorInput = (PrefuseGraphInput) input;
			setInput(this.editorInput);
		} else if (input instanceof FileEditorInput) {
			ResourceSet resourceSet = new ResourceSetImpl();
			// Load the resource
			final URI resourceURI = EditUIUtil.getURI(input);
			Resource result = resourceSet.getResource(resourceURI, true);
			// try to find corresponding java project
			IJavaProject tempProject = null;
			IProject project = ((FileEditorInput) input).getFile().getProject();
			try {
				if (project.hasNature(JavaCore.NATURE_ID)) {
					tempProject = JavaCore.create(project);
				} // else, nothing to do
			} catch (CoreException e) {
				MoDiscoLogger.logError(e, Activator.getDefault());
			}
			// initialize the editor input
			this.editorInput = new PrefuseGraphInput(result, tempProject);
			setInput(this.editorInput);
		} else {
			throw new PartInitException(Messages.MethodCallsModelEditor_invalidInputType);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.EditorPart#isDirty()
	 */
	@Override
	public boolean isDirty() {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.EditorPart#isSaveAsAllowed()
	 */
	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets .Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {
		if (this.editorInput != null) {
			Graph graph = null;
			if (this.editorInput.getInputResource() != null) {
				Resource resource = this.editorInput.getInputResource();
				CallsModel root = (CallsModel) resource.getContents().get(0);
				this.setPartName(root.getName());
				graph = this.initializeMethodCallsGraph(root);
			} else if (this.editorInput.getInputCallNode() != null) {
				CallNode callNode = this.editorInput.getInputCallNode();
				this.setPartName(callNode.getName());
				graph = this.initializeMethodCallsGraph(callNode);
			}
			JComponent treeview;
			treeview = PrefuseGraphContainerForJava.getInstance().initializeTreeViewContainer(
					graph, this.nameAttribute, null);
			Composite composite = new Composite(parent, SWT.EMBEDDED | SWT.NO_BACKGROUND);
			Frame frame = SWT_AWT.new_Frame(composite);

			frame.add(treeview);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {

	}

	private final String nameAttribute = "name"; //$NON-NLS-1$

	private final List<CallNode> parents = new ArrayList<CallNode>();

	/*
	 * From a uml model, we have to represent method calls as a graph. First step is to find all
	 * root methods (methods that have no dependencies pointing on them) Second step is to create
	 * links by following dependencies relationships. Third step is to manage cycles ? Forth step is
	 * to be able to get back to the code from a selected node Fifth step is to represents methods
	 * from real types (bis: have constraints to restrain possibilities)
	 */
	private final Tree initializeMethodCallsGraph(CallsModel root) {
		Tree result = new Tree();
		Node parentNode = this.intializeMethodCallsGraph(result, root.getName());

		for (CallNode rootElement : root.getRootNodes()) {
			this.generateMethodCallsNode(result, parentNode, rootElement);
		}
		return result;
	}

	private final Tree initializeMethodCallsGraph(CallNode callNode) {
		Tree result = new Tree();
		Node parentNode = this.intializeMethodCallsGraph(result, callNode.getName());

		this.generateMethodCallsNode(result, parentNode, callNode);

		return result;
	}

	private final Node intializeMethodCallsGraph(final Tree result, final String rootName) {
		/*
		 * initialise prefuse graph informations
		 */
		Table nodes = result.getNodeTable();
		Node activeNode = null;

		// add attribute name for each node
		nodes.addColumn(this.nameAttribute, String.class);
		nodes.addColumn(PrefuseGraphContainerForJava.javaOperation, AbstractMethodDeclaration.class);
		nodes.addColumn(PrefuseGraphContainerForJava.jdtProject, IJavaProject.class);

		// add root element
		activeNode = result.addRoot();
		activeNode.set(this.nameAttribute, Messages.MethodCallsModelEditor_rootNodeName + rootName);
		return activeNode;
	}

	private final void generateMethodCallsNode(final Tree result, final Node parentNode,
			final CallNode element) {
		Node activeNode = result.addChild(parentNode);
		activeNode.set(PrefuseGraphContainerForJava.javaOperation, element.getJavaMethod());
		activeNode.set(PrefuseGraphContainerForJava.jdtProject, this.editorInput.getJavaProject());

		if (this.parents.contains(element)) {
			// This element has been already managed (recursion)
			activeNode.set(this.nameAttribute,
					Messages.MethodCallsModelEditor_recursion + element.getName());
		} else {
			// manage recursion
			this.parents.add(element);
			activeNode.set(this.nameAttribute, element.getName());

			List<MethodCall> calledMethods = element.getMethodCalls();
			if (calledMethods.isEmpty()) {
				/*
				 * Check that parent type is an interface ? if yes, we would like to continue the
				 * graph with implementations class/methods
				 * 
				 * A better check could be to test body of the method: no body = abstract method All
				 * cases are handled, no matter if it is an interface or an abstract class !
				 */
				if (element.getJavaMethod().getBody() == null) {
					activeNode.set(this.nameAttribute, element.getName() + "[" //$NON-NLS-1$
							+ element.getSubMethods().size() + "]"); //$NON-NLS-1$
					for (CallNode subMethod : element.getSubMethods()) {
						this.generateMethodCallsNode(result, activeNode, subMethod);
					}
				}
			}
			for (MethodCall child : calledMethods) {
				this.generateMethodCallsNode(result, activeNode, child.getCallee());
			}
			// manage recursion
			this.parents.remove(element);
		}
	}

}
