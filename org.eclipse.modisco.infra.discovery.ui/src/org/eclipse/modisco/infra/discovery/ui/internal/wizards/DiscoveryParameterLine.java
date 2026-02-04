/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.discovery.ui.internal.wizards;

import org.eclipse.modisco.infra.discovery.catalog.DirectionKind;

/**
 * Represents a line in the table of parameters for a discoverer in the
 * {@link NewDiscovererWizard}
 */
public class DiscoveryParameterLine {

	private String name = ""; //$NON-NLS-1$
	private String description = ""; //$NON-NLS-1$
	private DirectionKind direction = DirectionKind.IN;
	private boolean required = true;
	private String type = ""; //$NON-NLS-1$
	private boolean multivalued = false;

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public DirectionKind getDirection() {
		return this.direction;
	}

	public void setDirection(final DirectionKind direction) {
		this.direction = direction;
	}

	public boolean isRequired() {
		return this.required;
	}

	public void setRequired(final boolean required) {
		this.required = required;
	}

	public String getType() {
		return this.type;
	}

	public void setType(final String type) {
		this.type = type;
	}

	public boolean isMultivalued() {
		return this.multivalued;
	}

	public void setMultivalued(final boolean multivalued) {
		this.multivalued = multivalued;
	}

}
