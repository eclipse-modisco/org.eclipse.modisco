/*******************************************************************************
 * Copyright (c) 2008, 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *    Nicolas Guyomar (Mia-Software) - Bug 340339 - Need some Utils class for Folder/File/Project management
 *    Nicolas Guyomar (Mia-Software) - Bug 342451 - To be able to edit derived facet attributes and derived facet references in a table
 *    Gregoire Dupe (Mia-Software) - Bug 373078 - API Cleaning
 *    Thomas Cicognani (Soft-Maint) - Bug 398079 - org.eclipse.modisco.facet.util.core.internal.exported.FileUtils.copyFolderFromBundle 
 *    E.D.Willink de-depulicate
 *******************************************************************************/
package org.eclipse.modisco.common.tests;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.modisco.common.core.Logger;
import org.eclipse.modisco.common.core.files.FileUtils;
import org.eclipse.modisco.common.core.files.IFilter;
import org.osgi.framework.Bundle;

/**
 * @since 0.2
 */
public final class TestFileUtils
{

	// This class has been deduplicated from org.eclipse.modisco.facet.infra.common.core.internal.utils.FileUtils

	private static boolean debug = false;

	private TestFileUtils() {
		throw new IllegalStateException();
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

	public static void checkNoMarkerOn(final IFile file) throws CoreException {
		checkNoMoreMarkerOn(file, 0);
	}

	public static void checkNoMoreMarkerOn(final IFile file, final int nbMarkers)
			throws CoreException {
		IMarker[] markers = null;
		markers = file.findMarkers(IMarker.PROBLEM, true, IResource.DEPTH_INFINITE);
		if (markers.length > nbMarkers) {
			MultiStatus multiStatus = new MultiStatus(Activator.PLUGIN_ID, 0,
					"Markers found on: " //$NON-NLS-1$
							+ file, new Exception());
			for (IMarker marker : markers) {
				String message = (String) marker.getAttribute(IMarker.MESSAGE);
				IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
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

	public static final void clearFolder(final File dirtyFolder) {
		assert dirtyFolder != null;
		assert dirtyFolder.exists();
		assert dirtyFolder.isDirectory();
		/*
		 * To delete the contents of this folder, we recurse on all elements
		 * (File) in this folder. In the case of a directory, we first delete
		 * its own contents before deleting it. In the case of a file, we just
		 * delete the file.
		 */
		File[] files = dirtyFolder.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				clearFolder(file);
			}
			file.delete();
		}
	}

	public static final boolean compareFiles(final File source, final File target,
			final Comparator<File> fileComparator) {
		assert ((source.isFile()) && (target.isFile()));
		boolean result = (fileComparator.compare(source, target) == 0);
		if (debug && result) {
			Logger.logInfo(
							"Files " + source.getName() + " and " + target.getName() + " are equal.", Activator.getDefault()); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		}
		return result;
	}

	public static final boolean compareFolders(final File folderSource, final File folderTarget,
			final FilenameFilter filter, final Comparator<File> fileComparison) {
		assert ((folderSource != null) && (folderTarget != null));
		assert ((folderSource.isDirectory()) && (folderTarget.isDirectory()));
		boolean result = false;
		if (folderSource.equals(folderTarget)) {
			result = true;
		} else {
			result = recursiveCompareFolders(folderSource, folderTarget, filter,
					fileComparison);
			if (debug && !result) {
				Logger
						.logError(
								"folders " + folderSource.getName() + " and " + folderTarget.getName() + " are not equal.", Activator.getDefault()); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			}
		}
		return result;
	}

	/**
	 * Copies the source directory to the target directory. The target is
	 * created if it does not exist.
	 */
	public static final void copyDirectory(final File srcDir, final File destDir)
			throws IOException {
		FileUtils.copyDirectory(srcDir, destDir, new IFilter() {
			@Override
			public boolean filter(final Object object) {
				return true;
			}
		});
	}

	public static void deepCopy(final Bundle sourceBundle, final String sourcePath, final IProject targetProject, final String targetPath) throws Exception {
	//	System.out.println("deepCopy " + sourceBundle.getSymbolicName() + "[" + sourcePath + "] to " + targetProject.getName() + "[" + targetPath + "]");
		Enumeration<?> entryPaths = sourceBundle.getEntryPaths(sourcePath);
		if (entryPaths == null) {
			try {
				// destinationPath);
				InputStream source = sourceBundle.getEntry(sourcePath).openStream();
				IFile javaFile = targetProject.getFile(targetPath);
				if (javaFile.exists()) {
					javaFile.delete(true, new NullProgressMonitor());
				}
				javaFile.create(source, true, new NullProgressMonitor());
				// + destinationPath);
			} catch (Exception e1) {
				Logger.logError(e1, Activator.getDefault());
			}
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
			while (entryPaths.hasMoreElements()) {
				Object object = entryPaths.nextElement();
				if (object instanceof String) {
					String subpath = (String) object;
					if (!subpath.matches(".*/\\.svn/") && !subpath.endsWith("/bin/")) { //$NON-NLS-1$
						String dest = subDestinationPath
								+ subpath.substring(sourcePath.length() - 1);
						deepCopy(sourceBundle, subpath, targetProject, dest);
					}
				} else {
					throw new RuntimeException("Unexpected element type"); //$NON-NLS-1$
				}
			}
		}
	}

	private static final File getCorrespondingTargetContent(final File sourceContent,
			final File[] targetContents) {
		File targetContent = null;
		for (File temp : targetContents) {
			if (sourceContent.getName().equals(temp.getName())) {
				targetContent = temp;
			}
		}
		return targetContent;
	}

	/**
	 * This method compares two folders (in fact the contents of these two
	 * folders). It is recursive into each folder
	 */
	private static final boolean recursiveCompareFolders(final File folderSource,
			final File folderTarget, final FilenameFilter filter,
			final Comparator<File> fileComparison) {
		if (debug) {
			Logger.logError(
							"comparison of " + folderSource.getName() + " and " + folderTarget.getName(), Activator.getDefault()); //$NON-NLS-1$ //$NON-NLS-2$
		}
		boolean result = true;

		File[] sourceContents = folderSource.listFiles(filter);
		File[] targetContents = folderTarget.listFiles(filter);
		if (sourceContents.length != targetContents.length) {
			result = false;
			if (debug) {
				Logger.logError("folders " + folderSource.getName() + " and " //$NON-NLS-1$//$NON-NLS-2$
						+ folderTarget.getName() + " do not have the same number of children (" //$NON-NLS-1$
						+ sourceContents.length + ", " + targetContents.length + ")", //$NON-NLS-1$ //$NON-NLS-2$
						Activator.getDefault());
			}
		} else {
			for (File sourceContent : sourceContents) {
				/*
				 * For each File in the current directory, we test if it has a
				 * counterpart in the contents of the target directory. The
				 * search is based on the path name, so there can be problems if
				 * a file has the same name as a directory.
				 */
				File targetContent = getCorrespondingTargetContent(sourceContent, targetContents);
				if (targetContent == null) {
					result = false;
					if (debug) {
						Logger.logError(
										"There is no corresponding element in target folder for " + sourceContent.getName(), Activator.getDefault()); //$NON-NLS-1$
					}
				} else {
					/*
					 * Two cases: for a directory, recurse into its contents,
					 * and for a file, compare the contents of the two files.
					 */
					if (sourceContent.isDirectory()) {
						boolean subResult = recursiveCompareFolders(sourceContent,
								targetContent, filter, fileComparison);
						result = result && subResult;

						if (debug && !subResult) {
							Logger.logError(
											"folders " + sourceContent.getName() + " and " + targetContent.getName() + " are not equal.", Activator.getDefault()); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						}
					} else {
						boolean subResult = compareFiles(sourceContent, targetContent,
								fileComparison);
						result = result && subResult;
						if (debug && !subResult) {
							Logger.logError(
											"files " + sourceContent.getName() + " and " + targetContent.getName() + " are not equal.", Activator.getDefault()); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						}
					}
				}
			}
		}
		return result;
	}
}
