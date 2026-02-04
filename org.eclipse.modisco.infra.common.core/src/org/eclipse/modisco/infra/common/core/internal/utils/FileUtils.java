/*******************************************************************************
 * Copyright (c) 2008, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *    Grégoire Dupé (Mia-Software) - Bug 470578 - [Depercated] org.eclipse.modisco.infra.query
 *******************************************************************************/
package org.eclipse.modisco.infra.common.core.internal.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.modisco.infra.common.core.internal.CommonModiscoActivator;
import org.eclipse.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbench;
import org.osgi.framework.Bundle;
import org.eclipse.ui.PlatformUI;

public final class FileUtils {

	private FileUtils() {
		// Nothing
	}

	/** Reads a file and returns its contents as a String */
	public static String getContents(final File file) throws java.io.IOException {
		final int bufferSize = 1024;
		StringBuilder contents = new StringBuilder(bufferSize);
		BufferedReader reader = new BufferedReader(new FileReader(file));
		char[] buffer = new char[bufferSize];
		int read = 0;
		while ((read = reader.read(buffer)) != -1) {
			contents.append(buffer, 0, read);
		}
		reader.close();
		return contents.toString();
	}

	public static IFile copyFileFromBundle(final String sourcePath, final IProject project,
			final String destinationPath, final Bundle bundleContainingResources)
			throws IOException, CoreException {
		InputStream source;
		try {
			URL url = bundleContainingResources.getResource(sourcePath);
			source = url.openStream();
		} catch (NullPointerException e) {
			// FIXME: should not catch NullPointerException
			URL url = bundleContainingResources.getEntry(sourcePath);
			try {
				source = url.openStream();
			} catch (NullPointerException e2) {
				throw new IOException(sourcePath + " not found."); //$NON-NLS-1$
			}
		}
		IFile javaFile = project.getFile(destinationPath);
		if (javaFile.exists()) {
			javaFile.delete(true, new NullProgressMonitor());
		}
		if (!javaFile.getParent().exists()) {
			FolderUtils.createFolder((IFolder) javaFile.getParent());
		}
		javaFile.create(source, true, new NullProgressMonitor());
		return javaFile;
	}

	public static void checkEMFResource(final URI uri, final int nbRoot) throws Exception {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(uri, true);
		resource.load(Collections.EMPTY_MAP);
		EcoreUtil.resolveAll(resource);
		if (!(nbRoot == resource.getContents().size())) {
			throw new Exception("Wrong number of root element: " + nbRoot + " expected, " //$NON-NLS-1$ //$NON-NLS-2$
					+ resource.getContents().size() + " found."); //$NON-NLS-1$
		}
		if (!(resource.getErrors().size() == 0)) {
			throw new Exception("The resource contains errors."); //$NON-NLS-1$
		}
	}

	/**
	 * Returns the workspace file in which the resource is defined.
	 *
	 * @param resource
	 *            the resource, with a "platform:/resource/" URI
	 */
	public static IFile getWorkspaceFile(final Resource resource) {
		URI uri = resource.getURI();
		if (uri != null && uri.isPlatformResource() && uri.segmentCount() >= 2) {
			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			IProject project = root.getProject(uri.segment(1));
			IPath path = new Path("/"); //$NON-NLS-1$
			for (int i = 2; i < uri.segmentCount(); i++) {
				path = path.append(uri.segment(i));
			}
			IFile file = project.getFile(path);
			if (file.exists()) {
				return file;
			}
		}
		return null;
	}

	/** Get the contents of a file from a Bundle */
	public static String getFileContents(final Bundle bundle, final String path) throws IOException {
		InputStream source;
		URL url = bundle.getResource(path);
		if (url == null) {
			return null;
		}
		source = url.openStream();
		return FileUtils.readInputStream(source);
	}

	public static String readInputStream(final InputStream stream) throws IOException {
		return readInputStream(stream, "UTF-8"); //$NON-NLS-1$
	}

	public static String readInputStream(final InputStream stream, final String charset)
			throws IOException {
		final int bufferSize = 65536;
		final char[] buffer = new char[bufferSize];
		StringBuilder builder = new StringBuilder();
		Reader reader = new InputStreamReader(stream, charset);
		int read;
		do {
			read = reader.read(buffer, 0, buffer.length);
			if (read > 0) {
				builder.append(buffer, 0, read);
			}
		} while (read >= 0);

		reader.close();
		return builder.toString();
	}

	public static void checkNoMarkerOn(final IFile file) throws CoreException {
		checkNoMoreMarkerOn(file, 0);
	}

	public static void checkNoMoreMarkerOn(final IFile file, final int nbMarkers)
			throws CoreException {
		IMarker[] markers = null;
		markers = file.findMarkers(IMarker.PROBLEM, true, IResource.DEPTH_INFINITE);
		if (markers.length > nbMarkers) {
			MultiStatus multiStatus = new MultiStatus(CommonModiscoActivator.PLUGIN_ID, 0,
					"Markers found on: " //$NON-NLS-1$
							+ file, new Exception());
			for (IMarker marker : markers) {
				String message = (String) marker.getAttribute(IMarker.MESSAGE);
				IStatus status = new Status(IStatus.ERROR, CommonModiscoActivator.PLUGIN_ID,
						message);
				multiStatus.add(status);
				System.out.println("bad: " + file + " - " + message);
			}
//			wait(100000);
			throw new CoreException(multiStatus);
		}
		else {
			for (IMarker marker : markers) {
				String message = (String) marker.getAttribute(IMarker.MESSAGE);
				System.out.println("ok: " + file + " - " + message);
			}
			
		}
	}

	public static void wait(int delayTimeInMilliseconds) {
		for (int i = 0; i < delayTimeInMilliseconds; i += 100) {
			flushEvents();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
		}
	}

	public static void flushEvents() {
		IWorkbench workbench = PlatformUI.getWorkbench();
		Display display = workbench.getDisplay();
		for (int i = 0; i < 10; i++) {
			while (display.readAndDispatch());
		}
		/*		for (int i = 0; i < 10; i++) {
			IWorkbench workbench = PlatformUI.getWorkbench();
			try {
				while (workbench.getDisplay().readAndDispatch())
					;
			}
//			catch (InterruptedException e) {
//				throw e;
//			}
			catch (Throwable e) {
				if (e instanceof InterruptedException) {
					throw (InterruptedException)e;
				}
				e.printStackTrace();
			}
		} */
	}

	/**
	 * Whether the given workspace file is in its project's output location
	 * (e.g. "bin" directory)
	 */
	public static boolean isInOutputLocation(final IFile file) {
		try {
			IJavaProject javaProject = JavaCore.create(file.getProject());
			if (javaProject != null) {
				if (javaProject.getOutputLocation().isPrefixOf(file.getFullPath())) {
					return true;
				}
				IClasspathEntry[] rawClasspath = javaProject.getRawClasspath();
				for (IClasspathEntry classpathEntry : rawClasspath) {
					if (classpathEntry.getContentKind() == IPackageFragmentRoot.K_SOURCE) {
						IPath outputLocation = classpathEntry.getOutputLocation();
						if (outputLocation != null && outputLocation.isPrefixOf(file.getFullPath())) {
							return true;
						}
					}
				}
			}
		} catch (JavaModelException e) {
			MoDiscoLogger.logError(e, CommonModiscoActivator.getDefault());
		}
		return false;
	}
}
