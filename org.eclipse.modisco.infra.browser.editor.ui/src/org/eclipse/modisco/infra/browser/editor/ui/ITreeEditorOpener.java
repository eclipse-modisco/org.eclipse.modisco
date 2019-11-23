/**
 * Copyright (c) 2015 Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Thomas Cicognani (Soft-Maint) - Bug 442800 - API to open new MoDisco Browser
 */
package org.eclipse.modisco.infra.browser.editor.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.modisco.infra.browser.editor.ui.exceptions.TreeEditorOpenerException;
import org.eclipse.modisco.infra.browser.editor.ui.internal.editor.TreeEditorOpener;

public interface ITreeEditorOpener {

	ITreeEditorOpener DEFAULT = new TreeEditorOpener();

	ITreeEditor openWithEObject(EObject eObject)
			throws TreeEditorOpenerException;

	ITreeEditor openWithResource(Resource resource)
			throws TreeEditorOpenerException;

	ITreeEditor openWithResourceSet(ResourceSet resourceSet)
			throws TreeEditorOpenerException;

}
