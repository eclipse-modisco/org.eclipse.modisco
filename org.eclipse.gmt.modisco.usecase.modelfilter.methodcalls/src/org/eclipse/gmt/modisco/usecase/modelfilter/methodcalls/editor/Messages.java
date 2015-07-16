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
 */
package org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.editor;

import org.eclipse.osgi.util.NLS;

/**
 * @author GBarbier
 * 
 * 
 * @deprecated use matching org.eclipse.modisco.x.y.z component,
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470806
 */
@Deprecated
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.editor.messages"; //$NON-NLS-1$
	public static String MethodCallsModelEditor_invalidInputType;
	public static String MethodCallsModelEditor_partName;
	public static String MethodCallsModelEditor_recursion;
	public static String MethodCallsModelEditor_rootNodeName;
	public static String PrefuseGraphInput_name;
	public static String PrefuseGraphInput_tooltip;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
