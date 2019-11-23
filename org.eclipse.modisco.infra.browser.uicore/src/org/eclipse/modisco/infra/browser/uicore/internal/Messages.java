/*******************************************************************************
 * Copyright (c) 2009, 2010 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 *     Nicolas Payneau (Mia-Software) - Enable editability
 *******************************************************************************/
package org.eclipse.modisco.infra.browser.uicore.internal;

import org.eclipse.osgi.util.NLS;

/**
 * @deprecated Will be replaced by EMF Facet,
 *             cf https://bugs.eclipse.org/bugs/show_bug.cgi?id=470715
 */
@Deprecated
public final class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.modisco.infra.browser.uicore.internal.messages"; //$NON-NLS-1$

	static {
		NLS.initializeMessages(Messages.BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		// make uninstantiable
	}

	public static String QueryErrorDialog_stopShowing;
	public static String QueryUtil_QueryError;
	public static String QueryUtil_queryErrorsOccurred;
	public static String QueryUtil_displayQueryErrorMessageJob;
	public static String CustomizationEngine_couldNotFindMetamodel;
	public static String CustomizationEngine_conditionQueryWrongReturnType;
	public static String CustomizationEngine_coundNotFindEclass;
	public static String CustomizationEngine_errorColorString;
	public static String CustomizationEngine_errorIconString;
	public static String CustomizationEngine_errorOpeningCustomizationResource;
	public static String CustomizationEngine_metamodelNotFound;
	public static String CustomizationEngine_resourceMustNotBeNull;
	public static String CustomizationEngine_unresolvedConditionQuery;
	public static String unresolvedQuery;
	public static String BigListItem_sortingCanceled;
	public static String BigListItem_sortingInstances;
	public static String IconProvidersRegistry_notAnIconProvider;
	public static String NameProvidersRegistry_notANameProvider;
	public static String CustomTreePainter_errorDrawingFacetIcon;
}
