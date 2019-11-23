/*******************************************************************************
 * Copyright (c) 2011 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Guyomar (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *******************************************************************************/
package org.eclipse.modisco.kdm.source.extension.discovery;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.kdm.source.extension.ASTNodeSourceRegion;

/**
 * 
 * Represents a listener that can be added to a discoverer in order to be notified when a source
 * region is visited by a discoverer.
 * 
 * See Help Contents or http://wiki.eclipse.org/MoDisco/Components/KDMSourceExtension
 * 
 * See also {@link org.eclipse.modisco.kdm.source.extension.discovery.AbstractRegionDiscoverer}
 * 
 */
public interface SourceVisitListener {

	/**
	 * Abstract method to be implemented in composite discoverers. A typical implementation will
	 * instantiate an {@link ASTNodeSourceRegion}.
	 * 
	 * @param filePath
	 *            the path of the file containing the source region
	 * @param startOffset
	 *            the start offset of the source code region
	 * @param endOffset
	 *            the end offset of the source code region
	 * @param startLine
	 *            the first line of the source code region
	 * @param endLine
	 *            the last line of the source code region
	 * @param targetNode
	 *            the corresponding model element
	 */
	public abstract void sourceRegionVisited(final String filePath, final int startOffset,
			final int endOffset, final int startLine, final int endLine, final EObject targetNode);

}