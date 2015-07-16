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

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.CallNode;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

/**
 * @author Gabriel Barbier
 * 
 * 
 * @deprecated use matching org.eclipse.modisco.x.y.z component,
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470806
 */
@Deprecated
public class PrefuseGraphInput implements IEditorInput {

	private final IFile inputFile;
	private final Resource inputResource;
	private final IJavaProject javaProject;
	private final CallNode inputCallNode;

	/**
	 * @param ifile
	 */
	public PrefuseGraphInput(IFile ifile, IJavaProject project) {
		this.inputFile = ifile;
		this.javaProject = project;
		this.inputResource = null;
		this.inputCallNode = null;
	}

	/**
	 * @param ifile
	 */
	public PrefuseGraphInput(Resource resource, IJavaProject project) {
		this.inputFile = null;
		this.inputResource = resource;
		this.javaProject = project;
		this.inputCallNode = null;
	}

	/**
	 * @param ifile
	 */
	public PrefuseGraphInput(CallNode callNode, IJavaProject project) {
		this.inputFile = null;
		this.javaProject = project;
		this.inputResource = null;
		this.inputCallNode = callNode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IEditorInput#exists()
	 */
	public boolean exists() {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IEditorInput#getImageDescriptor()
	 */
	public ImageDescriptor getImageDescriptor() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IEditorInput#getName()
	 */
	public String getName() {
		return Messages.PrefuseGraphInput_name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IEditorInput#getPersistable()
	 */
	public IPersistableElement getPersistable() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IEditorInput#getToolTipText()
	 */
	public String getToolTipText() {
		return Messages.PrefuseGraphInput_tooltip;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
	 */
	public Object getAdapter(Class adapter) {
		return null;
	}

	/**
	 * @return the inputFile
	 */
	public IFile getInputFile() {
		return this.inputFile;
	}

	/**
	 * @return the inputResource
	 */
	public Resource getInputResource() {
		return this.inputResource;
	}

	/**
	 * @return the javaProject
	 */
	public IJavaProject getJavaProject() {
		return this.javaProject;
	}

	/**
	 * @return the inputCallNode
	 */
	public CallNode getInputCallNode() {
		return this.inputCallNode;
	}

}
