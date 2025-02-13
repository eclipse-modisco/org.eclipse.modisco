/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.common.core.internal.builder;

import java.util.LinkedList;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.modisco.infra.common.core.internal.Messages;

public final class CatalogJob extends Job {

	private static final long DELAY = 0;
	private static CatalogJob instance;
	private final LinkedList<Runnable> actionQueue = new LinkedList<Runnable>();

	private CatalogJob(final String name) {
		super(name);
		setRule(ResourcesPlugin.getWorkspace().getRoot());
	}

	public static synchronized CatalogJob getInstance() {
		if (CatalogJob.instance == null) {
			CatalogJob.instance = new CatalogJob(Messages.CatalogJob_catalogNotificationsJobName);
		}
		return CatalogJob.instance;
	}

	@Override
	protected IStatus run(final IProgressMonitor monitor) {
		while (true) {
			Runnable runnable;
			synchronized (this.actionQueue) {
				if (this.actionQueue.isEmpty()) {
					break;
				}
				runnable = this.actionQueue.removeFirst();
			}
			if (AbstractMoDiscoCatalog.SCHEDULING_DEBUG) {
				System.out.println(this.getClass().getSimpleName() + ": begin run: " + runnable); //$NON-NLS-1$
			}
			runnable.run();
			if (AbstractMoDiscoCatalog.SCHEDULING_DEBUG) {
				System.out.println(this.getClass().getSimpleName() + ": end run: " + runnable); //$NON-NLS-1$
			}
		}
		return Status.OK_STATUS;
	}

	public synchronized void addAction(final Runnable runnable) {
		synchronized (this.actionQueue) {
			this.actionQueue.addLast(runnable);
		}
		cancel();
		setPriority(Job.BUILD);
		schedule(CatalogJob.DELAY);
	}

	@Override
	public boolean belongsTo(final Object family) {
		return AbstractMoDiscoCatalog.belongsTo(family);
	}
}
