/*
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 */
package org.eclipse.gmt.modisco.workflow.mwe;

/**
 * @deprecated replaced by org.eclipse.modisco.workflow.mwe, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=337969
*/
@Deprecated
public final class Constants {

	private Constants() {
		// Must not be instantiated
	}

	private static final String ID = Activator.PLUGIN_ID;

	public static final String idWorkflow = org.eclipse.gmt.modisco.workflow.Constants.idWorkflow;
	public static final String idMinimaliste = org.eclipse.gmt.modisco.workflow.Constants.idMinimaliste;

	public static final String workflowExtension = "workflow"; //$NON-NLS-1$

	public static final String resourcePath = Constants.ID + ".ResourcePath"; //$NON-NLS-1$
	public static final String moDiscoWorkNumber = Constants.ID + ".MoDiscoWorkNumber"; //$NON-NLS-1$
	public static final String moDiscoListSerialize = Constants.ID + ".MoDiscoListSerialize"; //$NON-NLS-1$

}
