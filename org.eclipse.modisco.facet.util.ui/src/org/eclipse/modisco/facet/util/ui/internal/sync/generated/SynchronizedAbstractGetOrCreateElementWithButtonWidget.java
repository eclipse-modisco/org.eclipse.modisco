/**
 * Copyright (c) 2012, 2019 Mia-Software and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *  	Grégoire Dupé (Mia-Software) - Bug 387470 - [EFacet][Custom] Editors
 */
package org.eclipse.modisco.facet.util.ui.internal.sync.generated;

import org.eclipse.modisco.facet.util.ui.internal.exported.displaysync.AbstractExceptionFreeRunnable;
import org.eclipse.modisco.facet.util.ui.internal.exported.displaysync.AbstractVoidExceptionFreeRunnable;
import org.eclipse.modisco.facet.util.ui.internal.exported.displaysync.SynchronizedObject;
import org.eclipse.swt.widgets.Display;

public class SynchronizedAbstractGetOrCreateElementWithButtonWidget<D extends java.lang.Object>
		extends
		SynchronizedObject<org.eclipse.modisco.facet.util.ui.internal.exported.widget.getorcreate.IAbstractGetOrCreateElementWithButtonWidget<D>>
		implements
		org.eclipse.modisco.facet.util.ui.internal.exported.widget.getorcreate.IAbstractGetOrCreateElementWithButtonWidget<D> {

	public SynchronizedAbstractGetOrCreateElementWithButtonWidget(
			final org.eclipse.modisco.facet.util.ui.internal.exported.widget.getorcreate.IAbstractGetOrCreateElementWithButtonWidget<D> object,
			final Display display) {
		super(object, display);
	}

	public final void addListener(
			final org.eclipse.modisco.facet.util.ui.internal.exported.util.widget.AbstractWidget parm0) {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			public void voidSafeRun() {
				SynchronizedAbstractGetOrCreateElementWithButtonWidget.this
						.getSynchronizedObject().addListener(parm0);
			}
		});
	}

	public final void createWidgetContent() {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			public void voidSafeRun() {
				SynchronizedAbstractGetOrCreateElementWithButtonWidget.this
						.getSynchronizedObject().createWidgetContent();
			}
		});
	}

	public final java.lang.String getError() {
		return safeSyncExec(new AbstractExceptionFreeRunnable<java.lang.String>() {
			@Override
			public java.lang.String safeRun() {
				return SynchronizedAbstractGetOrCreateElementWithButtonWidget.this
						.getSynchronizedObject().getError();
			}
		});
	}

	public final void notifyChanged() {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			public void voidSafeRun() {
				SynchronizedAbstractGetOrCreateElementWithButtonWidget.this
						.getSynchronizedObject().notifyChanged();
			}
		});
	}

	public final java.lang.String getText() {
		return safeSyncExec(new AbstractExceptionFreeRunnable<java.lang.String>() {
			@Override
			public java.lang.String safeRun() {
				return SynchronizedAbstractGetOrCreateElementWithButtonWidget.this
						.getSynchronizedObject().getText();
			}
		});
	}

	public final void setText(final java.lang.String parm0) {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			public void voidSafeRun() {
				SynchronizedAbstractGetOrCreateElementWithButtonWidget.this
						.getSynchronizedObject().setText(parm0);
			}
		});
	}

	public final D pressButton() {
		return safeSyncExec(new AbstractExceptionFreeRunnable<D>() {
			@Override
			public D safeRun() {
				return SynchronizedAbstractGetOrCreateElementWithButtonWidget.this
						.getSynchronizedObject().pressButton();
			}
		});
	}

	public final void setButtonEnabled(final boolean parm0) {
		voidExceptionFreeRunnable(new AbstractVoidExceptionFreeRunnable() {
			@Override
			public void voidSafeRun() {
				SynchronizedAbstractGetOrCreateElementWithButtonWidget.this
						.getSynchronizedObject().setButtonEnabled(parm0);
			}
		});
	}

}
