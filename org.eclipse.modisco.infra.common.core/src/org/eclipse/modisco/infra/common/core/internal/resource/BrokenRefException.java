/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.common.core.internal.resource;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class BrokenRefException extends Exception implements Resource.Diagnostic {

	private static final long serialVersionUID = -2774251759867331337L;
	private EObject referringEObject;
	private EObject referredEObject;
	private Resource resource;

	public Resource getResource() {
		return this.resource;
	}

	public EObject getReferringEObject() {
		return this.referringEObject;
	}

	public EObject getReferredEObject() {
		return this.referredEObject;
	}

	public BrokenRefException(final String message) {
		super(message);
	}

	public BrokenRefException(final Throwable cause) {
		super(cause);
	}

	public BrokenRefException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public BrokenRefException(final EObject referringEObject, final EObject referredEObject) {
		this("A proxy with a null resource has been found: " //$NON-NLS-1$
				+ EcoreUtil.getURI(referredEObject).toString());
		this.referringEObject = referringEObject;
		this.referredEObject = referredEObject;
	}

	public BrokenRefException(final Resource resource) {
		this.resource = resource;
	}

	public String getLocation() {
		if (this.referringEObject != null) {
			return EcoreUtil.getURI(this.referringEObject).toString();
		} else if (this.resource != null) {
			return this.resource.getURI().toString();
		}
		return ""; //$NON-NLS-1$
	}

	public String getTargetLocation() {
		if (this.referredEObject != null) {
			return EcoreUtil.getURI(this.referredEObject).toString();
		}
		return ""; //$NON-NLS-1$
	}

	public int getLine() {
		return 0;
	}

	public int getColumn() {
		return 0;
	}

}
