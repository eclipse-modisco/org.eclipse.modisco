/*
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software)
 */

package org.eclipse.modisco.infra.discovery.ui.internal.launch.data;

import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererDescription;
import org.eclipse.modisco.infra.discovery.catalog.DiscovererParameter;
import org.eclipse.modisco.infra.discovery.core.IDiscoveryManager;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.modisco.infra.discovery.ui.Activator;
import org.eclipse.modisco.infra.discovery.ui.internal.launch.DiscovererUpdate;

public class DiscovererParameterDisplayImpl implements DiscovererParameterDisplay {

	private Object value = null;
	private final DiscovererParameter delegate;
	private final DiscovererUpdate updater;
	private final DiscovererDescription discoverer;

	public DiscovererParameterDisplayImpl(final DiscovererParameter realParameterInput,
			final DiscovererDescription discoverer, final DiscovererUpdate updater) {
		this.discoverer = discoverer;
		this.updater = updater;
		this.delegate = realParameterInput;
	}

	/**
	 * @return the value
	 */
	public Object getValue() {
		return this.value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(final Object value) {
		this.value = value;
		this.updater.update();
	}

	public DiscovererParameter getParameterDescription() {
		return this.delegate;
	}

	@Override
	public String toString() {
		if (this.delegate != null) {
			return this.delegate.getId() + " = " + this.value; //$NON-NLS-1$
		}
		return super.toString();
	}

	public void initialize(final Object source) {
		if (IDiscoveryManager.INSTANCE.hasInitialValue(this.delegate, this.discoverer)) {
			try {
				Object initialValue = IDiscoveryManager.INSTANCE.getInitialValue(this.delegate,
						this.discoverer, source);
				setValue(initialValue);
			} catch (DiscoveryException e) {
				MoDiscoLogger.logError(e, Activator.getDefault());
			}
		}
	}

}
