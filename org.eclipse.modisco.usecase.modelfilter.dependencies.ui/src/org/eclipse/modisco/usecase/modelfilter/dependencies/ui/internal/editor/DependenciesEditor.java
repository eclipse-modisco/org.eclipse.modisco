/**
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *******************************************************************************/

package org.eclipse.modisco.usecase.modelfilter.dependencies.ui.internal.editor;

import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JPanel;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.modisco.facet.util.core.Logger;
import org.eclipse.modisco.infra.prefuse.PrefuseGraphContainer;
import org.eclipse.modisco.infra.prefuse.examples.graphview.GraphViewConstants;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.NamedElement;
import org.eclipse.modisco.java.Package;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.internal.util.JavaUtil;
import org.eclipse.modisco.usecase.modelfilter.dependencies.ui.internal.Activator;
import org.eclipse.modisco.usecase.modelfilter.dependencies.ui.internal.Messages;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.FileEditorInput;

import prefuse.controls.ControlAdapter;
import prefuse.data.Edge;
import prefuse.data.Graph;
import prefuse.data.Node;
import prefuse.data.Table;
import prefuse.data.Tuple;
import prefuse.visual.VisualItem;

public class DependenciesEditor extends EditorPart {

	public static final String EDITOR_ID = "org.eclipse.modisco.usecase.modelfilter.dependencies.modeleditor.prefuse.EditorID"; //$NON-NLS-1$

	private PrefuseGraphInput editorInput;

	@Override
	public void doSave(final IProgressMonitor monitor) {
		//
	}

	@Override
	public void doSaveAs() {
		//
	}

	@Override
	public void init(final IEditorSite site, final IEditorInput input)
			throws PartInitException {
		setSite(site);
		setPartName(Messages.DependenciesEditor_partName);
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
				Logger.logError(e, Activator.getDefault());
			}
			// initialize the editor input
			this.editorInput = new PrefuseGraphInput(result, tempProject);
			setInput(this.editorInput);
		} else {
			throw new PartInitException(
					Messages.DependenciesEditor_incorrectInputType);
		}
	}

	@Override
	public boolean isDirty() {
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	@Override
	public void createPartControl(final Composite parent) {
		if (this.editorInput != null) {
			Graph graph = null;
			if (this.editorInput.getInputResource() != null) {
				Resource resource = this.editorInput.getInputResource();
				Model model = null;
				for (EObject eObject : resource.getContents()) {
					if (eObject instanceof Model) {
						model = (Model) eObject;
					}
				}
				if (model != null) {
					setPartName(Messages.DependenciesEditor_modelPartName
							+ model.getName());
					graph = this.initializeDependenciesGraph(model);
				}
			} else if (this.editorInput.getInputPackage() != null) {
				Package packageNode = this.editorInput.getInputPackage();
				setPartName(Messages.DependenciesEditor_packagePartName
						+ JavaUtil.getQualifiedName(packageNode));
				graph = this.initializeDependenciesGraph(packageNode);
			} else if (this.editorInput.getInputType() != null) {
				Type typeNode = this.editorInput.getInputType();
				setPartName(Messages.DependenciesEditor_typePartName
						+ JavaUtil.getQualifiedName(typeNode));
				graph = this.initializeDependenciesGraph(typeNode);
			}
			JPanel treeview = PrefuseGraphContainer.getInstance()
					.initializeGraphViewContainer(graph, this.nameAttribute,
							initializeControlAdapter());
			PrefuseGraphContainer.getInstance().createPartControl(parent,
					treeview);
		}

	}

	@Override
	public void setFocus() {
		//
	}

	private final ControlAdapter initializeControlAdapter() {
		ControlAdapter controlAdapter = new ControlAdapter() {
			@Override
			public void itemClicked(final VisualItem item, final MouseEvent e) {
				/*
				 * Left button and double click
				 */
				if (e.getButton() == MouseEvent.BUTTON1) {
					if (e.getClickCount() == 1) {
						completeDependenciesGraph(item);
					} else if (e.getClickCount() > 1) {
						updateDependenciesGraph(item);
					}
				}
			}
		};
		return controlAdapter;
	}

	protected final void completeDependenciesGraph(final VisualItem item) {
		/*
		 * We get the source object (Node) with method "item.getSourceTuple()"
		 *
		 * From the tuple, we could get the source element (underground
		 * attribute)
		 */
		Tuple tuple = item.getSourceTuple();
		if (tuple.canGet(this.javaElement, NamedElement.class)) {
			NamedElement element = (NamedElement) tuple.get(this.javaElement);
			/*
			 * if it is a package, then we have to open it and discover its
			 * element dependencies if it is a type, then we will have to one
			 * corresponding java editor.
			 */
			if (element instanceof Type) {
				generateDependenciesNode(null, element);
			}
		}
	}

	protected final void updateDependenciesGraph(final VisualItem item) {
		/*
		 * We get the source object (Node) with method "item.getSourceTuple()"
		 *
		 * From the tuple, we could get the source element (underground
		 * attribute)
		 */
		Tuple tuple = item.getSourceTuple();
		if (tuple.canGet(this.javaElement, NamedElement.class)) {
			NamedElement element = (NamedElement) tuple.get(this.javaElement);
			/*
			 * if it is a package, then we have to open it and discover its
			 * element dependencies if it is a type, then we will have to one
			 * corresponding java editor.
			 */
			if (element instanceof Type) {
				// BrowseJavaCode browserUtil = new BrowseJavaCode();
				// browserUtil.browseJavaCode(element);
				Logger.logWarning("not implemented", Activator.getDefault()); //$NON-NLS-1$
			} else if (element instanceof Package) {
				clearData();
				Package packElement = (Package) element;
				for (Package ownedPackage : packElement.getOwnedPackages()) {
					generateDependenciesNode(null, ownedPackage);
				}
				for (Type ownedType : packElement.getOwnedElements()) {
					generateDependenciesNode(null, ownedType);
				}
				item.getVisualization().run(GraphViewConstants.draw);
			} // else, nothing to do
		}
	}

	private final void clearData() {
		this.dependenciesNodes.clear();
		this.currentGraph.clear();
	}

	private final String nameAttribute = "name"; //$NON-NLS-1$
	private final String javaElement = "javaElement"; //$NON-NLS-1$
	// private final String jdtProject = "jdtProject";

	private Graph currentGraph = null;
	private final Map<NamedElement, Node> dependenciesNodes = new HashMap<NamedElement, Node>();

	private final Graph initializeDependenciesGraph(final Model root) {
		Graph result = intializeDependenciesGraph();

		for (Package rootElement : root.getOwnedElements()) {
			generateDependenciesNode(null, rootElement);
		}
		return result;
	}

	private final Graph initializeDependenciesGraph(
			final NamedElement packageNode) {
		Graph result = intializeDependenciesGraph();
		/*
		 * we will start creation of dependencies here from the provided
		 * package.
		 */
		generateDependenciesNode(null, packageNode);

		return result;
	}

	private final Graph intializeDependenciesGraph() {
		this.currentGraph = new Graph(true);
		/*
		 * initialise prefuse graph informations
		 */
		Table nodes = this.currentGraph.getNodeTable();

		// add attribute name for each node
		nodes.addColumn(this.nameAttribute, String.class);
		nodes.addColumn(this.javaElement, NamedElement.class);
		// nodes.addColumn(this.jdtProject, IJavaProject.class);

		return this.currentGraph;
	}

	private final void generateDependenciesNode(final Node parentNode,
			final NamedElement element) {
		Node activeNode = null;
		if (this.dependenciesNodes.containsKey(element)) {
			// This element has been already managed (recursion)
			activeNode = this.dependenciesNodes.get(element);
		} else {
			activeNode = this.currentGraph.addNode();
			activeNode.set(this.javaElement, element);
			// activeNode.set(this.jdtProject, this.editorInput
			// .getJavaProject());

			activeNode.set(this.nameAttribute,
					JavaUtil.getQualifiedName(element));

			// manage recursion
			this.dependenciesNodes.put(element, activeNode);
		}
		if (activeNode != null) {
			if (parentNode != null) {
				/*
				 * we will now create edges between parent and active nodes if
				 * it does not exist
				 */
				Edge edge = this.currentGraph.getEdge(parentNode, activeNode);
				if (edge == null) {
					edge = this.currentGraph.addEdge(parentNode, activeNode);
				} // else, nothing to do ...
			} else {
				// recursion on used elements ...
				if (element instanceof Package) {
					GetUsedPackages query = new GetUsedPackages();
					for (Package usedPackage : query
							.getUsedPackages((Package) element)) {
						generateDependenciesNode(activeNode, usedPackage);
					}
				} else if (element instanceof Type) {
					GetUsedTypes query = new GetUsedTypes();
					for (Type usedType : query.getUsedTypes((Type) element)) {
						generateDependenciesNode(activeNode, usedType);
					}
				}
			}
		}
	}

}
