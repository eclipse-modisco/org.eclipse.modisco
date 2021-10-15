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
 *    Fabien Giquel (Mia-Software) - Bug 343642 - Remove useless ui dependencies
 *******************************************************************************/

package org.eclipse.modisco.usecase.modelfilter.methodcalls.discoverer.ui.internal.editor;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.modisco.usecase.modelfilter.methodcalls.discoverer.ui.internal.Messages;
import org.eclipse.modisco.usecase.modelfilter.methodcalls.methodcalls.CallNode;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

public class PrefuseGraphInput implements IEditorInput {

	private final IFile inputFile;
	private final Resource inputResource;
	private final IJavaProject javaProject;
	private final CallNode inputCallNode;

	/**
	 * @param ifile
	 */
	public PrefuseGraphInput(final IFile ifile, final IJavaProject project) {
		this.inputFile = ifile;
		this.javaProject = project;
		this.inputResource = null;
		this.inputCallNode = null;
	}

	/**
	 * @param ifile
	 */
	public PrefuseGraphInput(final Resource resource, final IJavaProject project) {
		this.inputFile = null;
		this.inputResource = resource;
		this.javaProject = project;
		this.inputCallNode = null;
	}

	/**
	 * @param ifile
	 */
	public PrefuseGraphInput(final CallNode callNode, final IJavaProject project) {
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
	@SuppressWarnings("rawtypes") // conform to interface signature
	public Object getAdapter(final Class adapter) {
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
