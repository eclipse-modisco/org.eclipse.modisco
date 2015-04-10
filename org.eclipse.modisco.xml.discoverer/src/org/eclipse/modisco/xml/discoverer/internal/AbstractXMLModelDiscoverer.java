/*********************************************************************************
 * Copyright (c) 2011, 2015 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *    Nicolas Bros (Mia-Software) - adapted to new discovery framework
 *    Grégoire Dupé (Mia-Software) - Bug 464300 - To be able to discover XML models from a folder/project
 ********************************************************************************/
package org.eclipse.modisco.xml.discoverer.internal;

import org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer;
import org.eclipse.modisco.infra.discovery.core.annotations.Parameter;

/**
 * Discover generic XML model action.
 */
public abstract class AbstractXMLModelDiscoverer<T extends Object> extends AbstractModelDiscoverer<T> {

	private boolean ignoreWhitespace = false;

	@Parameter(name = "IGNORE_WHITESPACE", description = "Whether to ignore whitespace in text portions.")
	public void setIgnoreWhitespace(final boolean ignoreWhitespace) {
		this.ignoreWhitespace = ignoreWhitespace;
	}

	private boolean lightweightModel = false;

	@Parameter(name = "LIGHTWEIGHT", description = "Minimize the memory use of the obtained model by ignoring comments and text portions consisting only of indentation or line delimiters.")
	public void setLightweightModel(final boolean lightweightModel) {
		this.lightweightModel = lightweightModel;
	}
	
	public boolean isIgnoreWhitespace() {
		return this.ignoreWhitespace;
	}

	public boolean isLightweightModel() {
		return this.lightweightModel;
	}

}
