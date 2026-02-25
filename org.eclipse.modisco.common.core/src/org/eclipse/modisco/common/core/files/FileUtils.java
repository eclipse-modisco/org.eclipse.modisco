/*******************************************************************************
 * Copyright (c) 2008, 2026 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software)
 *    Nicolas Bros (Mia-Software)
 *******************************************************************************/

package org.eclipse.modisco.common.core.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.modisco.common.core.Logger;
import org.eclipse.modisco.common.core.internal.Activator;
import org.osgi.framework.Bundle;

/** @author Gabriel Barbier */
public class FileUtils
{
	private static final int COPY_BUFFER_SIZE = 512 * 1024;

	private static final IFilter checkstyleFilter = new IFilter() {
		@Override
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

	public static final void copyDirectory(final File srcDir, final File destDir,
			final IFilter filter) throws IOException {
		//
		//	Build Map of folders to copy before copying to avoid recursion for Maven.
		//
		Map<File, File> src2dest = new HashMap<File, File>();
		copyDirectory2(srcDir, destDir, filter, src2dest);
		for (File srcDir2 : src2dest.keySet()) {
			File destDir2 = src2dest.get(srcDir2);
			if (!destDir2.exists()) {
				destDir2.mkdirs();
			}
			// Copies each file and directory, one by one
			for (File src : srcDir2.listFiles()) {
				if (!src.isDirectory()) {
					File dest = new File(destDir2.getPath() + File.separator + src.getName());
					if (filter.filter(dest)) {
						copyFile(src, dest);
					}
				}
			}
		}
	}

	/* Recurse to gather the directories to be copied in src2dest */
	private static final void copyDirectory2(final File srcDir, final File destDir,
			final IFilter filter, Map<File, File> src2dest) throws IOException {
		src2dest.put(srcDir, destDir);
		for (File src : srcDir.listFiles()) {
			if (src.isDirectory()) {
				File dest = new File(destDir.getPath() + File.separator + src.getName());
				if (filter.filter(dest)) {
					copyDirectory2(src, dest, filter, src2dest);
				}
			}
		}

	}

	/**
	 * Copies the source file to the target file.
	 *
	 * @return <code>true</code> if successful, <code>false</code> otherwise
	 */
	public static final boolean copyFile(final File source, final File destination) {
		boolean result = false;
		FileInputStream sourceFile = null;
		FileOutputStream destinationFile = null;
		try {
			// File creation
			destination.createNewFile();
			sourceFile = new FileInputStream(source);
			destinationFile = new FileOutputStream(destination);
			// 0.5 MiB buffer for reading
			byte[] buffer = new byte[COPY_BUFFER_SIZE];
			int nbRead;
			while ((nbRead = sourceFile.read(buffer)) != -1) {
				destinationFile.write(buffer, 0, nbRead);
			}

			// Copied
			result = true;
		} catch (java.io.FileNotFoundException f) {
			result = false;
		} catch (java.io.IOException e) {
			result = false;
		} finally {
			try {
				if (sourceFile != null) {
					sourceFile.close();
				}
				if (destinationFile != null) {
					destinationFile.close();
				}
			} catch (Exception e) {
				result = false;
			}
		}
		return result;
	}

	public static IFile copyFileFromBundle(final Bundle sourceBundle, final String sourcePath,
			final IProject targetProject, final String targetPath) throws Exception {
	//	System.out.println("copyFileFromBundle " + sourceBundle.getSymbolicName() + "[" + sourcePath + "] to " + targetProject.getName() + "[" + targetPath + "]");
		URL url = sourceBundle.getResource(sourcePath);
		if (url == null) {
			throw new IOException(sourceBundle + " has no " + sourcePath + " entry"); //$NON-NLS-1$
		}
		InputStream source = url.openStream();
		IFile javaFile = targetProject.getFile(targetPath);
		if (javaFile.exists()) {
			try {
				javaFile.delete(true, new NullProgressMonitor());
			} catch (CoreException e) {
				// problem deleting the file : try to close the project before deleting
				if (targetProject.isOpen()) {
					try {
						targetProject.close(new NullProgressMonitor());
						javaFile.delete(true, new NullProgressMonitor());
					} finally {
						targetProject.open(new NullProgressMonitor());
					}
				}
			}
		}
		if (!javaFile.getParent().exists()) {
			createFolder((IFolder) javaFile.getParent());
		}
		javaFile.create(source, true, new NullProgressMonitor());
		return javaFile;
	}

	/**
	 * Copies the source directory to the target directory. The target is
	 * created if it does not exist.
	 */
	public static void copyFolderFromBundle(final Bundle sourceBundle, final String sourcePath,
			final IProject targetProject, final String targetPath) throws IOException, CoreException {
	//	System.out.println("copyFolderFromBundle " + sourceBundle.getSymbolicName() + "[" + sourcePath + "] to " + targetProject.toString() + "[" + targetPath + "]");
		Enumeration<?> e = sourceBundle.getEntryPaths(sourcePath);
		if (e == null) {
			// it should be a file (not a folder)
			URL entry = sourceBundle.getResource(sourcePath);
			if (entry == null) {
				throw new IOException(sourceBundle + " has no " + sourcePath + " entry"); //$NON-NLS-1$
			}
			InputStream source = entry.openStream();
			IFile javaFile = targetProject.getFile(targetPath);
			if (javaFile.exists()) {
				javaFile.delete(true, new NullProgressMonitor());
			}
			javaFile.create(source, true, new NullProgressMonitor());
		} else {
			String subDestinationPath = "/"; //$NON-NLS-1$
			if (!targetPath.equals("/")) { //$NON-NLS-1$
				IFolder folder = targetProject.getFolder(targetPath);
				if (!folder.exists()) {
					try {
						folder.create(true, true, new NullProgressMonitor());
					} catch (Exception e1) {
						Logger.logError(e1, Activator.getDefault());
					}
				}
				subDestinationPath = folder.getProjectRelativePath().toString();
			}
			while (e.hasMoreElements()) {
				Object object = e.nextElement();
				if (object instanceof String) {
					String subpath = (String) object;
					if (!subpath.matches(".*/\\.svn/")) { //$NON-NLS-1$
						String dest = subDestinationPath
								+ subpath.substring(sourcePath.length() - 1);
						copyFolderFromBundle(sourceBundle, subpath, targetProject, dest);
					}
				} else {
					throw new RuntimeException("Unexpected element type"); //$NON-NLS-1$
				}
			}
		}
	}

	public static void createFolder(final IFolder folder) throws CoreException {
		if (!folder.getParent().exists()) {
			createFolder((IFolder) folder.getParent());
		}
		if (!folder.exists()) {
			folder.create(true, true, new NullProgressMonitor());
		}
	}

	public static IFilter getCheckstylefilter() {
		return checkstyleFilter;
	}

	public static final String getFileContent(final File source) {
		StringBuilder result = new StringBuilder();
		BufferedReader sourceReader = null;
		try {
			sourceReader = new BufferedReader(new FileReader(source));
			String sourceLine = sourceReader.readLine();
			while (sourceLine != null) {
				result.append(sourceLine);
				result.append("\n"); //$NON-NLS-1$
				sourceLine = sourceReader.readLine();
			}
		} catch (FileNotFoundException e) {
			Logger.logError(e, Activator.getDefault());
		} catch (IOException e) {
			Logger.logError(e, Activator.getDefault());
		} finally {
			if (sourceReader != null) {
				try {
					sourceReader.close();
				} catch (IOException e) {
					Logger.logError(e, Activator.getDefault());
				}
			}
		}
		return result.toString();
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
			Logger.logError(e, Activator.getDefault());
		}
		return false;
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

	protected FileUtils() {
		throw new IllegalStateException();
	}
}
