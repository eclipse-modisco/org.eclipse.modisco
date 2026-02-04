/**
 * Copyright (c) 2015, 2019 Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Thomas Cicognani (Soft-Maint) - Bug 442800 - API to open new MoDisco Browser
 *    Grégoire Dupé (Mia-Software) - Bug 442800 - API to open new MoDisco Browser
 */
package org.eclipse.modisco.infra.browser.editor.ui.exceptions;

/**
 * @noextend clients must not extend this class
 * @noinstantiate clients must not instantiate this class
 */
public class TreeEditorOpenerException extends Exception {

	private static final long serialVersionUID = -4055299672749732009L;

	public TreeEditorOpenerException(final Throwable throwable) {
		super(throwable);
	}

}
