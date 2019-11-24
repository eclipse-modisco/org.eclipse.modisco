/**
 *  Copyright (c) 2010, 2019 Mia-Software and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 *
 *  Contributors:
 *
 *  	   Fabien Giquel (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.jee.jsp.generation.tests;

import java.io.File;
import java.util.Comparator;

/**
 * TODO specific file comparator : neutralize JSP shape variations
 *
 */
public class JSPFileComparator implements Comparator<File> {

	public int compare(final File source, final File target) {
		if (!source.getName().equals(target.getName())) {
			return -1;
		}
		return 0;
	}

}
