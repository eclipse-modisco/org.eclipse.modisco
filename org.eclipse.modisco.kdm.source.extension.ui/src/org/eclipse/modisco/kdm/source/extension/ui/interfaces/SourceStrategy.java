/**
 * *******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *
 *    Nicolas Guyomar (Mia-Software) - initial API and implementation
 * *******************************************************************************
 *
 */
package org.eclipse.modisco.kdm.source.extension.ui.interfaces;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.kdm.source.extension.ASTNodeSourceRegion;

public interface SourceStrategy {

	/**
	 * Return the ASTNodeSourceRegion corresponding to the EObject in parameter
	 *
	 * @param eObject
	 *            the EObject from which we want the ASTNodeSourceRegion
	 * @return the ASTNodeSourceRegion
	 */
	public ASTNodeSourceRegion getASTNodeSourceRegion(final EObject eObject);

	/**
	 * Return whether or not the source strategy is applicable to the EOBject
	 *
	 * @param eObject
	 *            the EObject
	 * @return boolean whether or not the source strategy is applicable to the
	 *         EOBject
	 */
	public boolean isApplicableTo(final Notifier target);

}
