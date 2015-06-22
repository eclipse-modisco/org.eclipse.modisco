/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Sebastien Minguet (Mia-Software) - initial API and implementation
 *    Frederic Madiot (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - initial API and implementation
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Erwan Breton (Sodifrance) - initial API and implementation
 *    Romain Dervaux (Mia-Software) - initial API and implementation
 *******************************************************************************/

package org.eclipse.gmt.modisco.java.io.java.binding;

/**
 * <code>Binding</code> representing a featured Java entity.
 * @deprecated the whole plug-in is replaced by
 *             "org.eclipse.modisco.java.discoverer" (without the "gmt" part),
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470728
 */
@Deprecated
public abstract class FeatureBinding extends Binding {

	private ClassBinding declaringClass = null;

	/**
	 * @return Returns the declaringClass.
	 */
	public ClassBinding getDeclaringClass() {
		return this.declaringClass;
	}

	/**
	 * @param declaringClass
	 *            The declaringClass to set.
	 */
	public void setDeclaringClass(final ClassBinding declaringClass) {
		this.declaringClass = declaringClass;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		if (getDeclaringClass() != null) {
			result.append(getDeclaringClass().toString());
			result.append("."); //$NON-NLS-1$
		}
		result.append(getName());
		return result.toString();
	}

}
