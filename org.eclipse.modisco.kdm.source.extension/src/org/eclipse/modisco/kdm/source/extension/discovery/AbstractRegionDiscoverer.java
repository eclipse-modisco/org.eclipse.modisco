/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Guyomar (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *******************************************************************************/
package org.eclipse.modisco.kdm.source.extension.discovery;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.infra.discoverymanager.Discoverer;

/**
 * This abstract discoverer should be reused for each new leaf discoverer which visits some language
 * source code, in order to have the capability to notify the visit of source regions with a generic
 * mechanism. Composite discoverers should not inherit from this class but rather listen to leaf
 * discoverers in using the proposed listening API.
 * 
 * See Help Contents or http://wiki.eclipse.org/MoDisco/Components/KDMSourceExtension
 * 
 * See also {@link org.eclipse.modisco.kdm.source.extension.discovery.SourceVisitListener}
 * 
 * @deprecated use AbstractRegionDiscoverer2 with the new discovery framework, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=474730
 */
@Deprecated
public abstract class AbstractRegionDiscoverer implements Discoverer {

	private List<SourceVisitListener> listSourceVisitListener;

	/**
	 * * Notify all the listeners that a source region has been visited
	 * 
	 * @param filePath
	 *            The path of the parent compilation unit
	 * @param startPosition
	 *            Start Position of the source code region
	 * @param endPosition
	 *            EndPosition of the source code region
	 * @param startLine
	 *            Start line of the source code region
	 * @param endLine
	 *            End line of the source code region
	 * @param targetNode
	 *            The Java Node to be documented
	 */
	public final void notifyRegionSourceVisit(final String filePath, final int startPosition,
			final int endPosition, final int startLine, final int endLine, final EObject targetNode) {
		if (this.listSourceVisitListener != null && !this.listSourceVisitListener.isEmpty()) {
			for (SourceVisitListener listener : this.listSourceVisitListener) {
				listener.sourceRegionVisited(filePath, startPosition, endPosition, startLine,
						endLine, targetNode);
			}
		}
	}

	/**
	 * Notify all the listeners that a source region has been visited This method allows not to
	 * indicate the startLine and endLine and automatically put them to -1
	 * 
	 * @param filePath
	 *            The path of the parent compilation unit
	 * @param startPosition
	 *            Start Position of the source code region
	 * @param endPosition
	 *            EndPosition of the source code region
	 * @param targetNode
	 *            The Java Node to be documented
	 */
	public final void notifyRegionSourceVisit(final String filePath, final int startPosition,
			final int endPosition, final EObject targetNode) {
		notifyRegionSourceVisit(filePath, startPosition, endPosition, -1, -1, targetNode);
	}

	/**
	 * Add a listener to the list of listener
	 * 
	 * @param sourceVisitListener
	 */
	public final void addSourceVisitListener(final SourceVisitListener sourceVisitListener) {
		if (this.listSourceVisitListener == null) {
			this.listSourceVisitListener = new ArrayList<SourceVisitListener>();
		}
		this.listSourceVisitListener.add(sourceVisitListener);
	}

	/**
	 * Remove the sourceVisitListener from the list
	 * 
	 * @param sourceVisitListener
	 */
	public final void removeSourceVisitListener(final SourceVisitListener sourceVisitListener) {
		if (this.listSourceVisitListener != null) {
			this.listSourceVisitListener.remove(sourceVisitListener);
		}
	}

	/**
	 * Return the list of sourceVisitListener
	 * 
	 * @return The list of sourceVisitListener
	 */
	public final List<SourceVisitListener> getListSourceVisitListener() {
		return this.listSourceVisitListener;
	}
}
