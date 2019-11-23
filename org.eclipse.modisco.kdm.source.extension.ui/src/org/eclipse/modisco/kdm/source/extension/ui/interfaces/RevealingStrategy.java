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

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.modisco.omg.kdm.source.SourceRegion;
import org.eclipse.ui.IEditorPart;

public interface RevealingStrategy {

	/**
	 * Open the file in the right editor, then uses revealInTextEditor method to
	 * select it
	 *
	 * @param file
	 * @param sourceRegion
	 */
	public void revealInTextEditor(final IFile file,
			final SourceRegion sourceRegion);

	/**
	 * Select the given soruceRegion in the given Editor
	 *
	 * @param iEditorPart
	 *            a editor
	 * @param sourceRegion
	 *            a source region
	 */
	public void selectInTextEditor(final IEditorPart iEditorPart,
			final SourceRegion sourceRegion);

	/**
	 * Return whether or not the revealing strategy is applicable to the EOBject
	 *
	 * @param eObject
	 *            the EObject
	 * @return boolean whether or not the revealing strategy is applicable to
	 *         the EOBject
	 */
	public boolean isApplicableTo(final Notifier target);

}
