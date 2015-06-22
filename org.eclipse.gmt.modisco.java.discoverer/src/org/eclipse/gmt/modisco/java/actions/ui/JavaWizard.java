/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Romain DERVAUX (Mia-Software) - initial API and implementation
 *    Fabien GIQUEL (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmt.modisco.java.actions.ui;

import java.util.Collection;

import org.eclipse.gmt.modisco.java.Messages;
import org.eclipse.gmt.modisco.java.actions.DiscoveryParametersBean;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.wizard.Wizard;

/**
 * The Java discoverer wizard.
 *  * @deprecated the whole plug-in is replaced by
 *             "org.eclipse.modisco.java.discoverer" (without the "gmt" part),
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470728
 */
@Deprecated
public class JavaWizard extends Wizard {

	private final JavaWizardFirstPage javaFirstPage;

	public JavaWizard(final IJavaProject javaProject,
			final Collection<Object> discoverableElements,
			final DiscoveryParametersBean discoveryParameters) {
		super();
		setWindowTitle(Messages.JavaWizard_title);
		this.javaFirstPage = new JavaWizardFirstPage(javaProject,
				Messages.JavaWizard_title, discoverableElements,
				discoveryParameters);
	}

	@Override
	public void addPages() {
		addPage(this.javaFirstPage);
	}

	@Override
	public boolean performFinish() {
		return true;
	}

}
