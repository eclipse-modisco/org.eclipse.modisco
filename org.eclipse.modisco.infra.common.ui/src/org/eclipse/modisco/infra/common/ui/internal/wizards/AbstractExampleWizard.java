/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *    Gregoire DUPE (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.common.ui.internal.wizards;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.modisco.infra.common.core.internal.utils.FileUtils;
import org.eclipse.modisco.infra.common.core.internal.utils.IFilter;
import org.eclipse.modisco.infra.common.core.internal.utils.ProjectUtils;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * The base implementation of a wizard that imports a bundle into the user's
 * workspace.
 */
public abstract class AbstractExampleWizard extends Wizard implements INewWizard {

	private static final String CHECKSTYLE_NATURE = "net.sf.eclipsecs.core.CheckstyleNature"; //$NON-NLS-1$
	private static final String CHECKSTYLE_BUILDER = "net.sf.eclipsecs.core.CheckstyleBuilder"; //$NON-NLS-1$

	public void init(final IWorkbench workbench, final IStructuredSelection selection) {
		// nothing
	}

	protected abstract Plugin getActivator();

	private final IFilter checkstyleFilter = new IFilter() {
		public boolean filter(final Object object) {
			boolean result = true;
			if (object instanceof File) {
				File file = (File) object;
				result = !file.getName().equals(".checkstyle"); //$NON-NLS-1$
			} else if (object instanceof String) {
				String str = (String) object;
				result = !str.equals(".checkstyle"); //$NON-NLS-1$
			}
			return result;
		}
	};

	@Override
	public boolean performFinish() {
		WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
			@Override
			protected void execute(final IProgressMonitor monitor) throws CoreException,
					InvocationTargetException, InterruptedException {
				try {
					beforeImport();
					IProject project = ProjectUtils.importPlugin(getActivator().getBundle(),
							AbstractExampleWizard.this.checkstyleFilter);
					removeWizardExtension(project);
					removeCheckstyleNatureAndBuilder(project);
					changeBundleId(project);
					afterImport(project);
				} catch (Exception e) {
					MoDiscoLogger.logError(e, getActivator());
				}
			}

		};

		try {
			getContainer().run(true, false, operation);
		} catch (Exception e) {
			MoDiscoLogger.logError(e, getActivator());
			return false;
		}
		return true;
	}

	private void removeWizardExtension(final IProject project) {
		try {
			boolean success = false;
			IFile pluginXML = project.getFile("plugin.xml"); //$NON-NLS-1$
			if (pluginXML.exists()) {
				String contents = FileUtils.readInputStream(pluginXML.getContents(true));
				final String startStr = "<extension point=\"org.eclipse.ui.newWizards\">"; //$NON-NLS-1$
				final String endStr = "</extension>"; //$NON-NLS-1$
				int start = contents.indexOf(startStr);
				if (start != -1) {
					int end = contents.indexOf(endStr, start + startStr.length());
					if (end != -1) {
						end += endStr.length();
						String result = contents.substring(0, start)
								+ contents.substring(end, contents.length());
						pluginXML.setContents(new ByteArrayInputStream(result.getBytes()), true,
								true, new NullProgressMonitor());
						success = true;
					}
				}
			}
			if (!success) {
				MoDiscoLogger.logWarning(
						"Couldn't clean " + pluginXML.getFullPath(), getActivator()); //$NON-NLS-1$
			}
		} catch (Exception e) {
			MoDiscoLogger.logError("Error cleaning plugin.xml", getActivator()); //$NON-NLS-1$
		}
	}

	private void removeCheckstyleNatureAndBuilder(final IProject project) {
		try {
			IProjectDescription description;
			description = project.getDescription();
			String[] natures = description.getNatureIds();
			ArrayList<String> list = new ArrayList<String>();
			for (String nature : natures) {
				if (!AbstractExampleWizard.CHECKSTYLE_NATURE.equals(nature)) {
					list.add(nature);
				}
			}
			description.setNatureIds(list.toArray(new String[list.size()]));

			ICommand[] oldBuildSpec = description.getBuildSpec();
			ArrayList<ICommand> newBuildSpec = new ArrayList<ICommand>();
			for (ICommand command : oldBuildSpec) {
				if (!AbstractExampleWizard.CHECKSTYLE_BUILDER.equals(command.getBuilderName())) {
					newBuildSpec.add(command);
				}
			}
			description.setBuildSpec(newBuildSpec.toArray(new ICommand[newBuildSpec.size()]));

			project.setDescription(description, new NullProgressMonitor());
		} catch (Exception e) {
			MoDiscoLogger.logError("Error cleaning example project", getActivator()); //$NON-NLS-1$
		}
	}

	private void changeBundleId(final IProject project) {
		try {
			IFile manifestFile = project.getFile("META-INF/MANIFEST.MF"); //$NON-NLS-1$
			if (manifestFile.exists()) {
				String contents = FileUtils.readInputStream(manifestFile.getContents(true));
				contents = contents.replaceFirst("Bundle-SymbolicName:\\s*org\\.eclipse\\.", //$NON-NLS-1$
						"Bundle-SymbolicName: "); //$NON-NLS-1$
				manifestFile.setContents(new ByteArrayInputStream(contents.getBytes()), true, true,
						new NullProgressMonitor());
			}
		} catch (Exception e) {
			MoDiscoLogger.logError("Error changing imported bundle id", getActivator()); //$NON-NLS-1$
		}
	}

	protected void beforeImport() {
		// nothing by default
	}

	/**
	 * @param project
	 *            the imported project
	 */
	protected void afterImport(final IProject project) {
		// nothing by default
	}

}
