/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - Bug 342689 - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.kdm.source.extension.discovery;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

public interface ISourceRegionNotifier<T> {

	/**
	 * Notify all listeners that a source region has been visited
	 * 
	 * @param filePath
	 *            The path of the parent compilation unit
	 * @param startOffset
	 *            Start offset of the source code region
	 * @param endOffset
	 *            End offset of the source code region
	 * @param startLine
	 *            First line of the source code region
	 * @param endLine
	 *            Last line of the source code region
	 * @param targetNode
	 *            The corresponding model element
	 */
	public abstract void notifySourceRegionVisited(final String filePath, final int startOffset,
			final int endOffset, final int startLine, final int endLine, final EObject targetNode);

	/**
	 * Notify all listeners that a source region has been visited This method allows not to indicate
	 * the startLine and endLine and automatically put them to -1
	 * 
	 * @param filePath
	 *            The path of the parent compilation unit
	 * @param startOffset
	 *            Start offset of the source code region
	 * @param endOffset
	 *            End offset of the source code region
	 * @param targetNode
	 *            The corresponding model element
	 */
	public abstract void notifySourceRegionVisited(final String filePath, final int startOffset,
			final int endOffset, final EObject targetNode);

	/**
	 * Add a listener to the list of listener
	 * 
	 * @param sourceVisitListener
	 */
	public abstract void addSourceVisitListener(final SourceVisitListener sourceVisitListener);

	/**
	 * Remove the sourceVisitListener from the list of listeners
	 * 
	 * @param sourceVisitListener
	 */
	public abstract void removeSourceVisitListener(final SourceVisitListener sourceVisitListener);

	/**
	 * Return the list of {@link SourceVisitListener}s
	 * 
	 * @return The list of {@link SourceVisitListener}s
	 */
	public abstract List<SourceVisitListener> getSourceVisitListeners();

}