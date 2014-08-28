/** 
 * Copyright (c) 2015 Soft-Maint.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Thomas Cicognani (Soft-Maint) - Bug 442800 - API to open new MoDisco Browser
 */
package org.eclipse.modisco.infra.browser.editor.ui.exceptions;

public class TreeEditorOpenerException extends Exception {

	private static final long serialVersionUID = -4055299672749732009L;
	
	public TreeEditorOpenerException(final Throwable throwable) {
		super(throwable);
	}

}
