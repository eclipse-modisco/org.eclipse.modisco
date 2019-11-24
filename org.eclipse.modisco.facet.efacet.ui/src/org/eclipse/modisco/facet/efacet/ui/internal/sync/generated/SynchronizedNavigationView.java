/**
 * Copyright (c) 2015, 2019 Mia-Software and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *   Grégoire Dupé (Mia-Software) - Bug 480654 - IllegalStateException in NavigationView.addEObjects (611)
 */

package org.eclipse.modisco.facet.efacet.ui.internal.sync.generated;

import org.eclipse.modisco.facet.util.ui.internal.exported.displaysync.AbstractExceptionFreeRunnable;
import org.eclipse.modisco.facet.util.ui.internal.exported.displaysync.AbstractVoidExceptionFreeRunnable;
import org.eclipse.modisco.facet.util.ui.internal.exported.displaysync.SynchronizedObject;
import org.eclipse.swt.widgets.Display;

@SuppressWarnings("PMD.ExcessivePublicCount")
public class SynchronizedNavigationView extends SynchronizedObject<org.eclipse.modisco.facet.efacet.ui.internal.exported.view.INavigationView> implements org.eclipse.modisco.facet.efacet.ui.internal.exported.view.INavigationView {

	public SynchronizedNavigationView(final org.eclipse.modisco.facet.efacet.ui.internal.exported.view.INavigationView object, final Display display) {
		super(object, display);
	}
	public final void addEObjects(final java.util.Collection<? extends org.eclipse.emf.ecore.EObject> parm0) {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			public void voidSafeRun() {
				SynchronizedNavigationView.this.getSynchronizedObject().addEObjects(parm0);
			}
		});
	}
	
	public final org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IOkDialog addEObjects2(final java.util.Collection<? extends org.eclipse.emf.ecore.EObject> parm0) {
		return safeSyncExec(new AbstractExceptionFreeRunnable<org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IOkDialog>() {
			@Override
			public org.eclipse.modisco.facet.util.ui.internal.exported.dialog.IOkDialog safeRun() {
				return SynchronizedNavigationView.this.getSynchronizedObject().addEObjects2(parm0);
			}
		});
	}
	
	public final java.util.List<org.eclipse.modisco.facet.efacet.ui.IETypedElementResultDisplayerOpener> getAvailableSelectedDisplayers() {
		return safeSyncExec(new AbstractExceptionFreeRunnable<java.util.List<org.eclipse.modisco.facet.efacet.ui.IETypedElementResultDisplayerOpener>>() {
			@Override
			public java.util.List<org.eclipse.modisco.facet.efacet.ui.IETypedElementResultDisplayerOpener> safeRun() {
				return SynchronizedNavigationView.this.getSynchronizedObject().getAvailableSelectedDisplayers();
			}
		});
	}
	
	public final org.eclipse.modisco.facet.efacet.ui.IETypedElementResultDisplayerOpener getSelectedDisplayer() {
		return safeSyncExec(new AbstractExceptionFreeRunnable<org.eclipse.modisco.facet.efacet.ui.IETypedElementResultDisplayerOpener>() {
			@Override
			public org.eclipse.modisco.facet.efacet.ui.IETypedElementResultDisplayerOpener safeRun() {
				return SynchronizedNavigationView.this.getSynchronizedObject().getSelectedDisplayer();
			}
		});
	}
	
	public final org.eclipse.emf.ecore.ETypedElement getSelectedETypedElement() {
		return safeSyncExec(new AbstractExceptionFreeRunnable<org.eclipse.emf.ecore.ETypedElement>() {
			@Override
			public org.eclipse.emf.ecore.ETypedElement safeRun() {
				return SynchronizedNavigationView.this.getSynchronizedObject().getSelectedETypedElement();
			}
		});
	}
	
	public final java.util.List<org.eclipse.emf.ecore.EClassifier> getUsableEClassifiers() {
		return safeSyncExec(new AbstractExceptionFreeRunnable<java.util.List<org.eclipse.emf.ecore.EClassifier>>() {
			@Override
			public java.util.List<org.eclipse.emf.ecore.EClassifier> safeRun() {
				return SynchronizedNavigationView.this.getSynchronizedObject().getUsableEClassifiers();
			}
		});
	}
	
	public final org.eclipse.ui.part.WorkbenchPart preform() {
		return safeSyncExec(new AbstractExceptionFreeRunnable<org.eclipse.ui.part.WorkbenchPart>() {
			@Override
			public org.eclipse.ui.part.WorkbenchPart safeRun() {
				return SynchronizedNavigationView.this.getSynchronizedObject().preform();
			}
		});
	}
	
	public final void removeAllEObjects() {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			public void voidSafeRun() {
				SynchronizedNavigationView.this.getSynchronizedObject().removeAllEObjects();
			}
		});
	}
	
	public final void removeEObject(final org.eclipse.emf.ecore.EObject parm0) {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			public void voidSafeRun() {
				SynchronizedNavigationView.this.getSynchronizedObject().removeEObject(parm0);
			}
		});
	}
	
	public final void removeEObjects(final java.util.List<? extends org.eclipse.emf.ecore.EObject> parm0) {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			public void voidSafeRun() {
				SynchronizedNavigationView.this.getSynchronizedObject().removeEObjects(parm0);
			}
		});
	}
	
	public final void selectETypedElement(final org.eclipse.emf.ecore.ETypedElement parm0) {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			public void voidSafeRun() {
				SynchronizedNavigationView.this.getSynchronizedObject().selectETypedElement(parm0);
			}
		});
	}
	
	public final void setSelectDisplayer(final org.eclipse.modisco.facet.efacet.ui.IETypedElementResultDisplayerOpener parm0) {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			public void voidSafeRun() {
				SynchronizedNavigationView.this.getSynchronizedObject().setSelectDisplayer(parm0);
			}
		});
	}
	
}
