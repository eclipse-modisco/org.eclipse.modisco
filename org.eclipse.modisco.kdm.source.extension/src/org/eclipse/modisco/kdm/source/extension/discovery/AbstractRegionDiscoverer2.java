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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer;

/**
 * This abstract discoverer should be reused for each new leaf discoverer which visits some language
 * source code, in order to have the capability to notify the visit of source regions with a generic
 * mechanism. Composite discoverers should not inherit from this class but rather listen to leaf
 * discoverers by using the proposed listening API.
 * 
 * See Help Contents or http://wiki.eclipse.org/MoDisco/Components/KDMSourceExtension
 * 
 * See also {@link org.eclipse.modisco.kdm.source.extension.discovery.SourceVisitListener}
 * 
 */
public abstract class AbstractRegionDiscoverer2<T> extends AbstractModelDiscoverer<T> implements ISourceRegionNotifier<T> {

	private List<SourceVisitListener> sourceVisitListeners;

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.kdm.source.extension.discovery.IAbstractRegionDiscoverer#notifySourceRegionVisited(java.lang.String, int, int, int, int, org.eclipse.emf.ecore.EObject)
	 */
	public final void notifySourceRegionVisited(final String filePath, final int startOffset,
			final int endOffset, final int startLine, final int endLine, final EObject targetNode) {
		if (this.sourceVisitListeners != null && !this.sourceVisitListeners.isEmpty()) {
			for (SourceVisitListener listener : new ArrayList<SourceVisitListener>(
					this.sourceVisitListeners)) {
				listener.sourceRegionVisited(filePath, startOffset, endOffset, startLine, endLine,
						targetNode);
			}
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.kdm.source.extension.discovery.IAbstractRegionDiscoverer#notifySourceRegionVisited(java.lang.String, int, int, org.eclipse.emf.ecore.EObject)
	 */
	public final void notifySourceRegionVisited(final String filePath, final int startOffset,
			final int endOffset, final EObject targetNode) {
		notifySourceRegionVisited(filePath, startOffset, endOffset, -1, -1, targetNode);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.kdm.source.extension.discovery.IAbstractRegionDiscoverer#addSourceVisitListener(org.eclipse.modisco.kdm.source.extension.discovery.SourceVisitListener)
	 */
	public final void addSourceVisitListener(final SourceVisitListener sourceVisitListener) {
		if (this.sourceVisitListeners == null) {
			this.sourceVisitListeners = new ArrayList<SourceVisitListener>();
		}
		if (sourceVisitListener != null && !this.sourceVisitListeners.contains(sourceVisitListener)) {
			this.sourceVisitListeners.add(sourceVisitListener);
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.kdm.source.extension.discovery.IAbstractRegionDiscoverer#removeSourceVisitListener(org.eclipse.modisco.kdm.source.extension.discovery.SourceVisitListener)
	 */
	public final void removeSourceVisitListener(final SourceVisitListener sourceVisitListener) {
		if (this.sourceVisitListeners != null) {
			this.sourceVisitListeners.remove(sourceVisitListener);
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.kdm.source.extension.discovery.IAbstractRegionDiscoverer#getSourceVisitListeners()
	 */
	public final List<SourceVisitListener> getSourceVisitListeners() {
		return Collections.unmodifiableList(this.sourceVisitListeners);
	}
}
