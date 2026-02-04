/**
 * *******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *
 *    Nicolas Guyomar (Mia-Software) - initial API and implementation
 * *******************************************************************************
 *
 */
package org.eclipse.modisco.kdm.source.extension.ui.adapters;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.kdm.source.extension.ASTNodeSourceRegion;
import org.eclipse.modisco.kdm.source.extension.ui.Activator;
import org.eclipse.modisco.kdm.source.extension.ui.interfaces.RevealingStrategy;
import org.eclipse.modisco.kdm.source.extension.ui.interfaces.SourceStrategy;
import org.eclipse.modisco.kdm.source.extension.ui.utils.Utils;
import org.eclipse.modisco.omg.kdm.source.SourceRegion;

/**
 * A new instance of this class is added to every eObject we want to synchronize
 * with its source code
 *
 */
public class SourceAccessAdapter extends AdapterImpl {

	private static final String DEBUG_ID = "org.eclipse.modisco.kdm.source.extension.ui/debug/SourceAccessAdapter/debug"; //$NON-NLS-1$
	static final boolean DEBUG = Activator.getDefault().isDebugging()
			&& new Boolean(Platform.getDebugOption(SourceAccessAdapter.DEBUG_ID))
					.booleanValue();

	private SourceStrategy sourceStrategy = null;
	private RevealingStrategy revealingStrategy = null;

	private SourceRegion sourceRegion = null;

	public SourceAccessAdapter(final SourceStrategy sourceStrategy,
			final RevealingStrategy revealingStrategy, final Notifier target) {
		super();
		this.sourceStrategy = sourceStrategy;
		this.revealingStrategy = revealingStrategy;
		this.target = target;
	}

	@Override
	public boolean isAdapterForType(final Object type) {
		return type.equals(SourceAccessAdapter.class);
	}

	/**
	 * Return the {@link SourceStrategy}
	 *
	 * @return the {@link SourceStrategy}
	 */
	public SourceStrategy getStrategySource() {
		if (SourceAccessAdapter.DEBUG) {
			System.out.println("SourceAccessAdapter.getStrategySource()"); //$NON-NLS-1$
		}
		return this.sourceStrategy;
	}

	/**
	 * Return the {@link RevealingStrategy}
	 *
	 * @return the {@link RevealingStrategy}
	 */
	public RevealingStrategy getStrategyRevealing() {
		if (SourceAccessAdapter.DEBUG) {
			System.out.println("SourceAccessAdapter.getStrategyRevealing()"); //$NON-NLS-1$
		}
		return this.revealingStrategy;
	}

	/**
	 * Call the {@link SourceStrategy} to get the {@link ASTNodeSourceRegion}
	 *
	 * @param eObject
	 * @return
	 */
	public SourceRegion getSourceRegion() {
		if (this.sourceRegion == null) {
			if (this.sourceStrategy != null) {
				return this.sourceStrategy
						.getASTNodeSourceRegion((EObject) this.target);
			}
			if (SourceAccessAdapter.DEBUG) {
				System.out
						.println("No SourceStrategy found for this selection"); //$NON-NLS-1$
			}
		}
		return this.sourceRegion;
	}

	/**
	 * Set the {@link SourceRegion}
	 *
	 * @param sourceRegion
	 */
	public void setSourceRegion(final SourceRegion sourceRegion) {
		this.sourceRegion = sourceRegion;
	}

	/**
	 * Call the {@link RevealingStrategy} to reveal the selected element in its
	 * opened editor
	 *
	 * @param sourceRegion
	 * @param eObject
	 */
	public void revealInTextEditor() {
		if (SourceAccessAdapter.DEBUG) {
			System.out.println("SourceAccessAdapter.showInTextEditor()"); //$NON-NLS-1$
		}

		if (this.revealingStrategy != null) {

			if (this.sourceRegion == null) {
				this.sourceRegion = getSourceRegion();
			}

			if (this.sourceRegion == null) {
				return;
			}
			IFile file = Utils.getIFileFromSourceRegion(this.sourceRegion);
			if (file != null) {
				if (file.exists()) {

					this.revealingStrategy.revealInTextEditor(file,
							this.sourceRegion);
				} else {
					MoDiscoLogger.logError("The file: " + file.getName() //$NON-NLS-1$
							+ " could not be found. Please update your model", //$NON-NLS-1$
							Activator.getDefault());
				}
			}
		}
	}
}
