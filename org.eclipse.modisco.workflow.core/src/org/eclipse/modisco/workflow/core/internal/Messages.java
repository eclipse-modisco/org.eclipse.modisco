/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *    Nicolas Bros (Mia-Software) - Bug 337402 - [Discovery Workflow] refactoring
 *******************************************************************************/
package org.eclipse.modisco.workflow.core.internal;

import org.eclipse.osgi.util.NLS;

/**
 * @author gdupe
 *
 */
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.modisco.workflow.core.internal.messages"; //$NON-NLS-1$
	public static String WorkflowControllerImpl_launchConfigurationNotFound;
	public static String WorkflowControllerImpl_recursionError;
	public static String WorkflowExecutionImpl_elementOfType;

	static {
		// initialize resource bundle
		NLS.initializeMessages(Messages.BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		// Empty
	}
}
