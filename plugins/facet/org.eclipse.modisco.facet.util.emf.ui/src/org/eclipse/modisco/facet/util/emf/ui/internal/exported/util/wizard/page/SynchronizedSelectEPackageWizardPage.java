/**
 * Copyright (c) 2012, 2019 Mia-Software and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *  	Alban Ménager (Soft-Maint) - Bug 387470 - [EFacet][Custom] Editors
 */
package org.eclipse.modisco.facet.util.emf.ui.internal.exported.util.wizard.page;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.modisco.facet.util.core.DebugUtils;
import org.eclipse.modisco.facet.util.emf.ui.internal.Activator;
import org.eclipse.modisco.facet.util.emf.ui.internal.exported.wizard.page.ISelectEPackageWizardPage;
import org.eclipse.modisco.facet.util.ui.internal.exported.displaysync.AbstractExceptionFreeRunnable;
import org.eclipse.modisco.facet.util.ui.internal.exported.displaysync.AbstractVoidExceptionFreeRunnable;
import org.eclipse.swt.widgets.Display;

/**
 * Synchronized class for safe run.
 * 
 * @author amenager_stage
 * @since 0.3
 * 
 */
public class SynchronizedSelectEPackageWizardPage extends
		SynchronizedWizardPage<ISelectEPackageWizardPage> implements
		ISelectEPackageWizardPage {

	private static final boolean DEBUG = DebugUtils.getDebugStatus(Activator
			.getDefault());

	/**
	 * Constructor.
	 * 
	 * @param object
	 *            the to synchronized.
	 * @param display
	 *            the display.
	 */
	public SynchronizedSelectEPackageWizardPage(
			final ISelectEPackageWizardPage object, final Display display) {
		super(object, display);
	}

	public EPackage getSelectedEPackage() {
		return this.safeSyncExec(new AbstractExceptionFreeRunnable<EPackage>() {
			@Override
			public EPackage safeRun() {
				return SynchronizedSelectEPackageWizardPage.this
						.getSynchronizedObject().getSelectedEPackage();
			}
		});
	}

	public void selectPackage(final String selection) {
		this.voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			public void voidSafeRun() {
				SynchronizedSelectEPackageWizardPage.this
						.getSynchronizedObject().selectPackage(selection);
			}
		});

		// We keep the thread waiting until the selection is not done.
		// If we release the thread, the selection may not be done and made some
		// errors
		while (this.getSelectedEPackage() == null) {
			DebugUtils.debug(DEBUG, "Waiting."); //$NON-NLS-1$
		}
	}
}
