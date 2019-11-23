/**
 * Copyright (c) 2010, 2011 Mia-Software and others.
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

package org.eclipse.modisco.usecase.modelfilter.dependencies.ui.internal.editor;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.modisco.java.Package;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.usecase.modelfilter.dependencies.ui.internal.Messages;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

public class PrefuseGraphInput implements IEditorInput {

	private final IFile inputFile;
	private final Resource inputResource;
	private final Package inputPackage;
	private final Type inputType;
	private final IJavaProject javaProject;

	/**
	 * @param ifile
	 */
	public PrefuseGraphInput(final IFile ifile, final IJavaProject project) {
		this.inputFile = ifile;
		this.javaProject = project;
		this.inputResource = null;
		this.inputPackage = null;
		this.inputType = null;
	}

	/**
	 * @param ifile
	 */
	public PrefuseGraphInput(final Resource resource, final IJavaProject project) {
		this.inputFile = null;
		this.inputResource = resource;
		this.javaProject = project;
		this.inputPackage = null;
		this.inputType = null;
	}

	/**
	 * @param ifile
	 */
	public PrefuseGraphInput(final Package inPackage, final IJavaProject project) {
		this.inputFile = null;
		this.javaProject = project;
		this.inputResource = null;
		this.inputPackage = inPackage;
		this.inputType = null;
	}

	public PrefuseGraphInput(final Type type, final IJavaProject project) {
		this.inputFile = null;
		this.javaProject = project;
		this.inputResource = null;
		this.inputPackage = null;
		this.inputType = type;
	}


	/**
	 * @param ifile
	 *            public PrefuseGraphInput(Type type, IJavaProject project) { this.inputFile = null;
	 *            this.javaProject = project; this.inputResource = null; this.inputPackage = null;
	 *            this.inputType = type; }
	 *
	 *            /* (non-Javadoc)
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
		return Messages.PrefuseGraphInput_title;
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
	 * @return the inputPackage
	 */
	public Package getInputPackage() {
		return this.inputPackage;
	}

	/**
	 * @return the inputType
	 */
	public Type getInputType() {
		return this.inputType;
	}

}
