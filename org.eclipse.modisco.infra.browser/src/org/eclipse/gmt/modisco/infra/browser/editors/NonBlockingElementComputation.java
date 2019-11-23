/*******************************************************************************
 * Copyright (c) 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 341463 - [Model browser] stays on "loading..." indefinitely
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.browser.editors;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.gmt.modisco.infra.browser.Messages;
import org.eclipse.gmt.modisco.infra.browser.MoDiscoBrowserPlugin;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.ui.progress.IWorkbenchSiteProgressService;

/**
 * Computes a value synchronously initially, and continues asynchronously if the
 * computation takes too much time.
 *
 * @param <T>
 *            The type of the result of the computation.
 */
public abstract class NonBlockingElementComputation<T> {

	private static final boolean DEBUG = false;
	private static final int MAX_SYNCHRONOUS_WAIT_DELAY = 200;
	private final Set<Object> computing = Collections.synchronizedSet(new HashSet<Object>());
	private final IWorkbenchSiteProgressService progressService;

	private class ValueRef {
		private T value;

		public T getValue() {
			return this.value;
		}

		public void setValue(final T value) {
			this.value = value;
		}
	}

	public NonBlockingElementComputation(final IWorkbenchSiteProgressService progressService) {
		this.progressService = progressService;
	}

	protected abstract T basicCompute(final Object element);

	protected abstract T getTemporaryDefaultValue();

	public T computeValue(final Object element) {
		if (this.computing.contains(element)) {
			return getTemporaryDefaultValue();
		}

		final ValueRef valueRef = new ValueRef();
		final Object signal = new Object();
		final boolean[] finished = new boolean[1];
		final boolean[] needsRefresh = new boolean[1];

		Job job = new Job(Messages.BrowserContentProvider_computingChildren) {
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				try {
					debugPrint("computing"); //$NON-NLS-1$
					NonBlockingElementComputation.this.computing.add(element);
					T value = basicCompute(element);
					valueRef.setValue(value);
					finished[0] = true;
					boolean localNeedsRefresh;
					synchronized (signal) {
						signal.notify();
						localNeedsRefresh = needsRefresh[0];
					}
					if (localNeedsRefresh) {
						computationFinished();
					}
					return Status.OK_STATUS;
				} finally {
					NonBlockingElementComputation.this.computing.remove(element);
				}
			}
		};
		job.setSystem(true);
		job.setPriority(Job.LONG);
		this.progressService.schedule(job, 0);
		try {
			// See Bug 327633: [Model Browser] avoid blocking the UI
			synchronized (signal) {
				signal.wait(NonBlockingElementComputation.MAX_SYNCHRONOUS_WAIT_DELAY);
			}
			if (!finished[0]) {
				debugPrint("asynchronous"); //$NON-NLS-1$
				/*
				 * Return a temporary "loading..." object. It will be
				 * automatically replaced by real content thanks to the model
				 * change notifications that trigger a refresh.
				 */
				synchronized (signal) {
					needsRefresh[0] = true;
				}
				return getTemporaryDefaultValue();
			}
		} catch (InterruptedException e) {
			MoDiscoLogger.logError(e, MoDiscoBrowserPlugin.getPlugin());
		}
		debugPrint("synchronous"); //$NON-NLS-1$
		return valueRef.getValue();
	}

	private void debugPrint(final String message) {
		if (NonBlockingElementComputation.DEBUG) {
			System.out.println(message + " [" //$NON-NLS-1$
					+ NonBlockingElementComputation.this.getClass().getSimpleName() + "]"); //$NON-NLS-1$
		}
	}

	protected abstract void computationFinished();

	public boolean isComputing() {
		return !this.computing.isEmpty();
	}

}
