/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *    Nicolas Bros (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.common.core.internal.builder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.modisco.infra.common.core.internal.CommonModiscoActivator;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;

/**
 * This class is the MoDisco project builder implementation.
 *
 * @author Gregoire DUPE (Mia-Software)
 */
public class ModiscoProjectBuilder extends IncrementalProjectBuilder {

	private static final String EXTENSION_POINT_ID = "org.eclipse.modisco.common.core.builder.register"; //$NON-NLS-1$
	/**
	 * The MoDisco builder id
	 */
	public static final String BUILDER_NAME = "org.eclipse.modisco.common.core.builder"; //$NON-NLS-1$
	private static ArrayList<BuilderDescriptor> modiscoBuilders = null;
	private static Object modiscoBuildersLock = new Object();

	public ModiscoProjectBuilder() {
		super();
		synchronized (ModiscoProjectBuilder.modiscoBuildersLock) {
			if (ModiscoProjectBuilder.modiscoBuilders == null) {
				ModiscoProjectBuilder.modiscoBuilders = new ArrayList<BuilderDescriptor>();
				IConfigurationElement[] configs = Platform.getExtensionRegistry()
						.getConfigurationElementsFor(ModiscoProjectBuilder.EXTENSION_POINT_ID);
				for (IConfigurationElement config : configs) {
					try {
						String id = config.getDeclaringExtension().getUniqueIdentifier();
						IModiscoBuilder builderInst = (IModiscoBuilder) config
								.createExecutableExtension("class"); //$NON-NLS-1$
						BuilderDescriptor builderDescriptor = new BuilderDescriptor(builderInst, id);
						ModiscoProjectBuilder.modiscoBuilders.add(builderDescriptor);
						for (IConfigurationElement depends : config.getChildren("depends")) { //$NON-NLS-1$
							builderDescriptor.getDependsOn().add(depends.getAttribute("builder")); //$NON-NLS-1$
						}
					} catch (Exception e) {
						MoDiscoLogger.logError(e, CommonModiscoActivator.getDefault());
					}
				}
				ModiscoProjectBuilder.modiscoBuilders = sortBuilders(ModiscoProjectBuilder.modiscoBuilders);
			}
		}
		validateBuilderDependencies();
	}

	/**
	 * Sort builders by dependencies : first those that depend on nothing, then
	 * those that depend on those already in the list, etc.
	 */
	private ArrayList<BuilderDescriptor> sortBuilders(final ArrayList<BuilderDescriptor> builders) {
		ArrayList<BuilderDescriptor> result = new ArrayList<ModiscoProjectBuilder.BuilderDescriptor>();
		List<BuilderDescriptor> remaining = new LinkedList<ModiscoProjectBuilder.BuilderDescriptor>();
		remaining.addAll(builders);

		while (!remaining.isEmpty()) {
			boolean stuck = true;
			ListIterator<BuilderDescriptor> listIterator = remaining.listIterator();
			while (listIterator.hasNext()) {
				BuilderDescriptor builder = listIterator.next();
				// if it depends only on builders that are already in the list
				// before it, then add it here
				if (dependensOnlyOn(builder, result)) {
					result.add(builder);
					listIterator.remove();
					stuck = false;
				}
			}
			if (stuck) {
				throw new RuntimeException("Cannot order builders due to incoherent dependencies"); //$NON-NLS-1$
			}
		}

		return result;
	}

	/** Whether the given builder only depends on those in the list. */
	private boolean dependensOnlyOn(final BuilderDescriptor builder,
			final ArrayList<BuilderDescriptor> list) {
		List<String> dependsOn = builder.getDependsOn();
		for (String dep : dependsOn) {
			boolean found = false;
			for (BuilderDescriptor prev : list) {
				if (prev.getId().equals(dep)) {
					found = true;
					break;
				}
			}
			if (!found) {
				return false;
			}
		}
		return true;
	}

	private void validateBuilderDependencies() {
		List<String> idList = new ArrayList<String>();
		for (BuilderDescriptor descriptor : ModiscoProjectBuilder.modiscoBuilders) {
			idList.add(descriptor.getId());
		}
		for (BuilderDescriptor descriptor : ModiscoProjectBuilder.modiscoBuilders) {
			for (String dependsOn : descriptor.getDependsOn()) {
				if (!idList.contains(dependsOn)) {
					MoDiscoLogger.logWarning("The builder " + descriptor.getId() + " depends on " //$NON-NLS-1$//$NON-NLS-2$
							+ dependsOn + " which does not exist.", CommonModiscoActivator //$NON-NLS-1$
							.getDefault());
				}
			}
		}

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void clean(final IProgressMonitor monitor) throws CoreException {
		synchronized (ModiscoProjectBuilder.modiscoBuilders) {
			Iterator<BuilderDescriptor> builders = ModiscoProjectBuilder.modiscoBuilders.iterator();
			while (builders.hasNext()) {
				BuilderDescriptor builder = builders.next();
				builder.getBuilderInst().clean(this, monitor);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	@Override
	protected IProject[] build(final int kind, final Map args, final IProgressMonitor monitor)
			throws CoreException {
		synchronized (ModiscoProjectBuilder.modiscoBuilders) {
			Iterator<BuilderDescriptor> builders = ModiscoProjectBuilder.modiscoBuilders.iterator();
			while (builders.hasNext()) {
				BuilderDescriptor builder = builders.next();
				builder.getBuilderInst().build(this, kind, args, monitor);
			}
		}
		return null;
	}

	/**
	 * This class is used to hold the builder id, the builder instance and the
	 * builder dependencies in a single structure.
	 */
	private static class BuilderDescriptor {
		private final IModiscoBuilder builderInst;

		private final List<String> dependsOn = new ArrayList<String>();

		private final String id;

		/**
		 * @param builderInst
		 *            an instance of the described builder
		 * @param id
		 *            the id of the described builder
		 */
		public BuilderDescriptor(final IModiscoBuilder builderInst, final String id) {
			this.builderInst = builderInst;
			this.id = id;
		}

		public String getId() {
			return this.id;
		}

		/**
		 * @return the list of dependencies on other MoDisco builders.
		 */
		public List<String> getDependsOn() {
			return this.dependsOn;
		}

		/**
		 * @return the instance of the described builder
		 */
		public IModiscoBuilder getBuilderInst() {
			return this.builderInst;
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return this.id + "(" + this.builderInst.getClass().getName() + ")"; //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

}
