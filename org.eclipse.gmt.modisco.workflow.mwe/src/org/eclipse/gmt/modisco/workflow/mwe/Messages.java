/*******************************************************************************
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *******************************************************************************/
package org.eclipse.gmt.modisco.workflow.mwe;

import org.eclipse.osgi.util.NLS;

/**
 * @author gdupe
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
 */
@Deprecated
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.gmt.modisco.workflow.mwe.messages"; //$NON-NLS-1$
	public static String WorkflowExecution_0;
	public static String WorkflowExecution_1;
	public static String WorkflowModelImpl_4;
	static {
		// initialize resource bundle
		NLS.initializeMessages(Messages.BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		// Empty
	}
}
