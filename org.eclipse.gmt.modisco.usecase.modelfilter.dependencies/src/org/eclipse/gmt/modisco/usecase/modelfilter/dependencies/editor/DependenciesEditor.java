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

package org.eclipse.gmt.modisco.usecase.modelfilter.dependencies.editor;

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
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.infra.prefuse.PrefuseGraphContainer;
import org.eclipse.gmt.modisco.infra.prefuse.examples.graphview.GraphViewConstants;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.NamedElement;
import org.eclipse.gmt.modisco.java.Package;
import org.eclipse.gmt.modisco.java.Type;
import org.eclipse.gmt.modisco.java.actions.BrowseJavaCode;
import org.eclipse.gmt.modisco.java.internal.util.JavaUtil;
import org.eclipse.gmt.modisco.usecase.modelfilter.dependencies.Activator;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
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

/**
 * @author Gabriel Barbier
 * 
 * 
 * @deprecated use matching org.eclipse.modisco.x.y.z component,
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470806
 */
@Deprecated
public class DependenciesEditor extends EditorPart {

	public static final String EditorID = "org.eclipse.gmt.modisco.usecase.modelfilter.dependencies.modeleditor.prefuse.EditorID"; //$NON-NLS-1$

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
		this.setPartName(Messages.DependenciesEditor_partName);
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
			throw new PartInitException(Messages.DependenciesEditor_incorrectInputType);
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
				Model model = null;
				for (EObject eObject : resource.getContents()) {
					if (eObject instanceof Model) {
						model = (Model) eObject;
					}
				}
				if (model != null) {
					this.setPartName(Messages.DependenciesEditor_modelPartName + model.getName());
					graph = this.initializeDependenciesGraph(model);
				}
			} else if (this.editorInput.getInputPackage() != null) {
				Package packageNode = this.editorInput.getInputPackage();
				this.setPartName(Messages.DependenciesEditor_packagePartName
						+ JavaUtil.getQualifiedName(packageNode));
				graph = this.initializeDependenciesGraph(packageNode);
			} else if (this.editorInput.getInputType() != null) {
				Type typeNode = this.editorInput.getInputType();
				this.setPartName(Messages.DependenciesEditor_typePartName
						+ JavaUtil.getQualifiedName(typeNode));
				graph = this.initializeDependenciesGraph(typeNode);
			}
			JPanel treeview = PrefuseGraphContainer.getInstance().initializeGraphViewContainer(
					graph, this.nameAttribute, this.initializeControlAdapter());
			PrefuseGraphContainer.getInstance().createPartControl(parent, treeview);
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

	private final ControlAdapter initializeControlAdapter() {
		ControlAdapter controlAdapter = new ControlAdapter() {
			/*
			 * (non-Javadoc)
			 * 
			 * @see prefuse.controls.ControlAdapter#itemClicked(prefuse.visual.VisualItem ,
			 * java.awt.event.MouseEvent)
			 */
			@Override
			public void itemClicked(VisualItem item, MouseEvent e) {
				/*
				 * Left button and double click
				 */
				if (e.getButton() == MouseEvent.BUTTON1) {
					if (e.getClickCount() == 1) {
						DependenciesEditor.this.completeDependenciesGraph(item);
					} else if (e.getClickCount() > 1) {
						DependenciesEditor.this.updateDependenciesGraph(item);
					}
				}
			}
		};
		return controlAdapter;
	}

	private final void completeDependenciesGraph(VisualItem item) {
		/*
		 * We get the source object (Node) with method "item.getSourceTuple()"
		 * 
		 * From the tuple, we could get the source element (underground attribute)
		 */
		Tuple tuple = item.getSourceTuple();
		if (tuple.canGet(this.javaElement, NamedElement.class)) {
			NamedElement element = (NamedElement) tuple.get(this.javaElement);
			/*
			 * if it is a package, then we have to open it and discover its element dependencies if
			 * it is a type, then we will have to one corresponding java editor.
			 */
			if (element instanceof Type) {
				this.generateDependenciesNode(null, element);
			}
		}
	}

	private final void updateDependenciesGraph(VisualItem item) {
		/*
		 * We get the source object (Node) with method "item.getSourceTuple()"
		 * 
		 * From the tuple, we could get the source element (underground attribute)
		 */
		Tuple tuple = item.getSourceTuple();
		if (tuple.canGet(this.javaElement, NamedElement.class)) {
			NamedElement element = (NamedElement) tuple.get(this.javaElement);
			/*
			 * if it is a package, then we have to open it and discover its element dependencies if
			 * it is a type, then we will have to one corresponding java editor.
			 */
			if (element instanceof Type) {
				BrowseJavaCode browserUtil = new BrowseJavaCode();
				browserUtil.browseJavaCode(element);
			} else if (element instanceof Package) {
				this.clearData();
				Package packElement = (Package) element;
				for (Package ownedPackage : packElement.getOwnedPackages()) {
					this.generateDependenciesNode(null, ownedPackage);
				}
				for (Type ownedType : packElement.getOwnedElements()) {
					this.generateDependenciesNode(null, ownedType);
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

	private final Graph initializeDependenciesGraph(Model root) {
		Graph result = this.intializeDependenciesGraph();

		for (Package rootElement : root.getOwnedElements()) {
			this.generateDependenciesNode(null, rootElement);
		}
		return result;
	}

	private final Graph initializeDependenciesGraph(NamedElement packageNode) {
		Graph result = this.intializeDependenciesGraph();
		/*
		 * we will start creation of dependencies here from the provided package.
		 */
		this.generateDependenciesNode(null, packageNode);

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

	private final void generateDependenciesNode(final Node parentNode, final NamedElement element) {
		Node activeNode = null;
		if (this.dependenciesNodes.containsKey(element)) {
			// This element has been already managed (recursion)
			activeNode = this.dependenciesNodes.get(element);
		} else {
			activeNode = this.currentGraph.addNode();
			activeNode.set(this.javaElement, element);
			// activeNode.set(this.jdtProject, this.editorInput
			// .getJavaProject());

			activeNode.set(this.nameAttribute, JavaUtil.getQualifiedName(element));

			// manage recursion
			this.dependenciesNodes.put(element, activeNode);
		}
		if (activeNode != null) {
			if (parentNode != null) {
				/*
				 * we will now create edges between parent and active nodes if it does not exist
				 */
				Edge edge = this.currentGraph.getEdge(parentNode, activeNode);
				if (edge == null) {
					edge = this.currentGraph.addEdge(parentNode, activeNode);
				} // else, nothing to do ...
			} else {
				// recursion on used elements ...
				if (element instanceof Package) {
					GetUsedPackages query = new GetUsedPackages();
					for (Package usedPackage : query.getUsedPackages((Package) element)) {
						this.generateDependenciesNode(activeNode, usedPackage);
					}
				} else if (element instanceof Type) {
					GetUsedTypes query = new GetUsedTypes();
					for (Type usedType : query.getUsedTypes((Type) element)) {
						this.generateDependenciesNode(activeNode, usedType);
					}
				}
			}
		}
	}

}
