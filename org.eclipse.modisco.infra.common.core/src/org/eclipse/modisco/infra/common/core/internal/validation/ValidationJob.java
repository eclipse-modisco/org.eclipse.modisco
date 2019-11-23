/*******************************************************************************
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software)
 *    Gregoire DUPE (Mia-Software)
 *******************************************************************************/
package org.eclipse.modisco.infra.common.core.internal.validation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.modisco.infra.common.core.internal.CommonModiscoActivator;
import org.eclipse.modisco.infra.common.core.internal.Messages;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.osgi.util.NLS;

/**
 * A job that queues requests for validation, executes the validation after a
 * delay, optimizing duplicate validation requests away.
 */
public final class ValidationJob extends Job {

	public static final String EMF_PROBLEM_MARKER = "org.eclipse.emf.ecore.diagnostic"; //$NON-NLS-1$
	private static final long DELAY = 500;

	private static ValidationJob instance;
	private final LinkedList<ValidationJob.ValidationItem> queue = new LinkedList<ValidationJob.ValidationItem>();

	public interface Callback {
		void validated(final boolean result);
	}

	private ValidationJob() {
		super(Messages.ValidationJob_validationJobName);
	}

	public static synchronized ValidationJob getInstance() {
		if (ValidationJob.instance == null) {
			ValidationJob.instance = new ValidationJob();
		}
		return ValidationJob.instance;
	}

	private static class ValidationItem {
		private final Resource resource;
		private final IFile file;
		private final Callback callback;

		public ValidationItem(final Resource resource, final IFile file, final Callback callback) {
			this.resource = resource;
			this.file = file;
			this.callback = callback;
		}

		public Resource getResource() {
			return this.resource;
		}

		public IResource getFile() {
			return this.file;
		}

		public Callback getCallback() {
			return this.callback;
		}

		@Override
		public String toString() {
			if (this.file != null) {
				return this.file.toString();
			}
			return this.resource.toString();
		}
	}

	/**
	 * @param resource
	 *            the resource to validate
	 * @param file
	 *            the corresponding file
	 * @param callback
	 *            called when the asynchronous validation is finished (may be
	 *            <code>null</code>)
	 */
	public void validateAsync(final Resource resource, final IFile file, final Callback callback) {
		synchronized (this.queue) {
			ListIterator<ValidationJob.ValidationItem> listIterator = this.queue.listIterator();
			// remove potential duplicates from the queue
			while (listIterator.hasNext()) {
				ValidationItem item = listIterator.next();
				if (resource != null && resource.equals(item.getResource())) {
					listIterator.remove();
				}
			}
			this.queue.addLast(new ValidationItem(resource, file, callback));
		}
		cancel();
		setRule(ResourcesPlugin.getWorkspace().getRoot());
		setPriority(Job.DECORATE);
		schedule(ValidationJob.DELAY);
	}

	/**
	 * @param resource
	 *            the resource to validate
	 * @param file
	 *            the corresponding file
	 */
	public boolean validateSync(final Resource resource, final IFile file) {
		synchronized (this.queue) {
			ListIterator<ValidationJob.ValidationItem> listIterator = this.queue.listIterator();
			// remove this element from the queue if it's there, since it is
			// going to be handled right now
			while (listIterator.hasNext()) {
				ValidationItem item = listIterator.next();
				if (resource != null && resource.equals(item.getResource())) {
					listIterator.remove();
				}
			}
		}
		return validateItem(new ValidationItem(resource, file, null));
	}

	@Override
	protected IStatus run(final IProgressMonitor monitor) {
		while (true) {
			ValidationItem validationItem;
			synchronized (this.queue) {
				if (this.queue.isEmpty()) {
					break;
				}
				validationItem = this.queue.removeFirst();
			}
			boolean result = validateItem(validationItem);
			Callback callback = validationItem.getCallback();
			if (callback != null) {
				callback.validated(result);
			}
		}
		return Status.OK_STATUS;
	}

	private synchronized boolean validateItem(final ValidationItem validationItem) {
		boolean result = true;
		final List<Diagnostic> diagnostics = new ArrayList<Diagnostic>();
		Resource resource = validationItem.getResource();
		List<EObject> contents;
		synchronized (resource) {
			contents = new ArrayList<EObject>(resource.getContents());
		}
		for (EObject eObject : contents) {
			Diagnostic diagnostic = Diagnostician.INSTANCE.validate(eObject);
			if (diagnostic.getSeverity() != Diagnostic.OK) {
				diagnostics.add(diagnostic);
				result &= (diagnostic.getSeverity() != Diagnostic.ERROR);
			}
		}

		if (validationItem.getFile() != null) {
			ValidationJob.printWSProblems(validationItem.getFile(), diagnostics);
		} else {
			ValidationJob.printPluginProblem(validationItem.getResource(), diagnostics);
		}
		return result;
	}

	private static void printPluginProblem(final Resource resource,
			final List<Diagnostic> diagnostics) {
		for (Diagnostic diagnostic : diagnostics) {
			ValidationJob.convertDiagnosticToLog(resource, diagnostic);
		}
	}

	private static void printWSProblems(final IResource file, final List<Diagnostic> diagnostics) {
		if (file == null) {
			throw new IllegalArgumentException("null file"); //$NON-NLS-1$
		}
		WorkspaceJob job = new WorkspaceJob(NLS.bind(
				Messages.ValidationJob_creatingValidationMarkersJobName, file.getFullPath())) {
			@Override
			public IStatus runInWorkspace(final IProgressMonitor monitor) {
				if (file.exists()) {
					try {
						file.deleteMarkers(ValidationJob.EMF_PROBLEM_MARKER, true,
								IResource.DEPTH_INFINITE);
					} catch (CoreException e) {
						MoDiscoLogger.logError(e,
								"Failed to delete marker for: " + file.getFullPath(), //$NON-NLS-1$
								CommonModiscoActivator.getDefault());
					}
					for (Diagnostic diagnostic : diagnostics) {
						try {
							ValidationJob.convertDiagnosticToMarker(file, diagnostic);
						} catch (CoreException e) {
							MoDiscoLogger.logError(e, null);
						}
					}
				}
				return Status.OK_STATUS;
			}
		};
		job.setRule(file.getProject());
		job.schedule();
	}

	/** Log messages corresponding to the given diagnostic and its children. */
	static void convertDiagnosticToLog(final Resource resource, final Diagnostic diagnostic) {
		if (diagnostic.getChildren().size() > 0) {
			for (Diagnostic subDiagnostic : diagnostic.getChildren()) {
				ValidationJob.convertDiagnosticToLog(resource, subDiagnostic);
			}
		} else {
			String diagnosticMessage = "The following problem has been found while validating " //$NON-NLS-1$
					+ resource.getURI().toString() + " : " + diagnostic.getMessage(); //$NON-NLS-1$
			if (diagnostic.getSeverity() == Diagnostic.ERROR) {
				MoDiscoLogger.logError(diagnosticMessage, CommonModiscoActivator.getDefault());
			} else if (diagnostic.getSeverity() == Diagnostic.WARNING) {
				MoDiscoLogger.logWarning(diagnosticMessage, CommonModiscoActivator.getDefault());
			} else if (diagnostic.getSeverity() == Diagnostic.INFO) {
				MoDiscoLogger.logInfo(diagnosticMessage, CommonModiscoActivator.getDefault());
			}
		}

	}

	/**
	 * Creates markers on the given file corresponding to the given diagnostic
	 * and its children.
	 */
	static void convertDiagnosticToMarker(final IResource file, final Diagnostic diagnostic)
			throws CoreException {
		if (diagnostic.getChildren().size() > 0) {
			for (Diagnostic subDiagnostic : diagnostic.getChildren()) {
				ValidationJob.convertDiagnosticToMarker(file, subDiagnostic);
			}
		} else {
			IMarker marker = file.createMarker(ValidationJob.EMF_PROBLEM_MARKER);
			marker.setAttribute(IMarker.MESSAGE, diagnostic.getMessage());

			if (diagnostic.getSeverity() == Diagnostic.ERROR) {
				marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
			} else if (diagnostic.getSeverity() == Diagnostic.WARNING) {
				marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
			} else if (diagnostic.getSeverity() == Diagnostic.INFO) {
				marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_INFO);
			}
			marker.setAttribute(IMarker.LOCATION, diagnostic.getSource());

			List<?> data = diagnostic.getData();
			if (data.size() > 0) {
				Object object = data.get(0);
				if (object instanceof EObject) {
					EObject target = (EObject) object;
					marker.setAttribute(EValidator.URI_ATTRIBUTE, EcoreUtil.getURI(target)
							.toString());
				}
			}
		}
	}

	@Override
	public boolean belongsTo(final Object family) {
		return family == ResourcesPlugin.FAMILY_MANUAL_BUILD
				|| family == ResourcesPlugin.FAMILY_AUTO_BUILD
				|| family == ResourcesPlugin.FAMILY_MANUAL_REFRESH;
	}
}
