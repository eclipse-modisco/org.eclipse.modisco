/*******************************************************************************
 * Copyright (c) 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.query.core.internal;

import org.eclipse.osgi.util.NLS;

/*
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.modisco.infra.query.core.internal.messages"; //$NON-NLS-1$
	public static String ImplementationClassInterface_logErrorsJobName;
	public static String ImplementationClassInterface_wrongInterface;
	public static String ImplementationClassInterface_wrongInterface2;
	public static String ImplementationClassInterface_wrongInterface3;
	public static String ImplementationClassInterface_wrongInterfaceCollection;
	public static String ImplementationClassInterface_wrongInterfaceCollection2;
	public static String ImplementationClassInterface_wrongReturnType;
	public static String ImplementationClassInterface_wrongScope;
	public static String QueryBuilder_querySet;
	public static String ImplementationClassName_implementationClassDoesNotExist;
	public static String ImplementationClassName_implementationClassHasCompilationErrors;
	static {
		// initialize resource bundle
		NLS.initializeMessages(Messages.BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		// util class
	}
}
