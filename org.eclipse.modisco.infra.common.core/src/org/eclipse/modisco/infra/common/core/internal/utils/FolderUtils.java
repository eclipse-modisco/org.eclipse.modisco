/*******************************************************************************
 * Copyright (c) 2008, 2019 Mia-Software and others.
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

package org.eclipse.modisco.infra.common.core.internal.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.modisco.facet.util.core.Logger;
import org.eclipse.modisco.infra.common.core.internal.CommonModiscoActivator;
import org.osgi.framework.Bundle;

/** @author Gabriel Barbier */
public final class FolderUtils {
	private static final int COPY_BUFFER_SIZE = 512 * 1024;

	private static boolean debug = false;

	private static FolderUtils.ConfigurationManagementFilter configurationManagementFilter;

	private static class ConfigurationManagementFilter implements FilenameFilter {
		private static final String FILTER_NAME = "CVS"; //$NON-NLS-1$

		/**
		 * Tests if a specified file should be included in a file list.
		 *
		 *
		 * @param dir
		 *            the directory in which the file was found.
		 * @param name
		 *            the name of the file.
		 *
		 * @return <code>true</code> if and only if the name should be included
		 *         in the file list; <code>false</code> otherwise.
		 */
		@Override
		public boolean accept(final File dir, final String name) {
			boolean result = false;
			if (!name.equals(FolderUtils.ConfigurationManagementFilter.FILTER_NAME)) {
				result = true;
			}
			return result;
		}
	}

	private FolderUtils() {
		// prevent instantiation
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
				FolderUtils.clearFolder(file);
			}
			file.delete();
		}
	}

	/**
	 * This method compares two folders (in fact the contents of these two
	 * folders). It is recursive into each folder
	 */
	public static final boolean compareFolders(final File folderSource, final File folderTarget) {
		return FolderUtils.compareFolders(folderSource, folderTarget,
				FolderUtils.configurationManagementFilter, FolderUtils.getDefaultFileComparator());
	}

	public static final boolean compareFolders(final File folderSource, final File folderTarget,
			final FilenameFilter filter) {
		return FolderUtils.compareFolders(folderSource, folderTarget, filter,
				FolderUtils.getDefaultFileComparator());
	}

	public static final boolean compareFolders(final File folderSource, final File folderTarget,
			final FilenameFilter filter, final Comparator<File> fileComparison) {
		assert ((folderSource != null) && (folderTarget != null));
		assert ((folderSource.isDirectory()) && (folderTarget.isDirectory()));
		boolean result = false;
		if (folderSource.equals(folderTarget)) {
			result = true;
		} else {
			result = FolderUtils.recursiveCompareFolders(folderSource, folderTarget, filter,
					fileComparison);
			if (FolderUtils.debug && !result) {
				Logger
						.logError(
								"folders " + folderSource.getName() + " and " + folderTarget.getName() + " are not equal.", CommonModiscoActivator.getDefault()); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			}
		}
		return result;
	}

	public static final boolean compareFiles(final File source, final File target) {
		return FolderUtils.compareFiles(source, target, FolderUtils.getDefaultFileComparator());
	}

	private static final Comparator<File> getDefaultFileComparator() {
		return new Comparator<File>() {
			@Override
			public int compare(final File source, final File target) {
				boolean result = true;
				if (!source.getName().equals(target.getName())) {
					result = false;
				} else {
					// Compare file line by line
					BufferedReader sourceReader = null;
					BufferedReader targetReader = null;
					try {
						sourceReader = new BufferedReader(new FileReader(source));
						targetReader = new BufferedReader(new FileReader(target));
						String sourceLine = sourceReader.readLine();
						String targetLine = targetReader.readLine();
						while ((sourceLine != null) && (targetLine != null)) {
							result = result && sourceLine.equals(targetLine);
							sourceLine = sourceReader.readLine();
							targetLine = targetReader.readLine();
						}
						if ((sourceLine != null) || (targetLine != null)) {
							result = false;
							Logger
									.logError(
											"These files do not have the same number of lines.", CommonModiscoActivator.getDefault()); //$NON-NLS-1$
						}
					} catch (FileNotFoundException e) {
						result = false;
					} catch (IOException e) {
						result = false;
					} finally {
						if (sourceReader != null) {
							try {
								sourceReader.close();
							} catch (IOException e) {
								Logger.logError(e, CommonModiscoActivator.getDefault());
							}
						}
						if (targetReader != null) {
							try {
								targetReader.close();
							} catch (IOException e) {
								Logger.logError(e, CommonModiscoActivator.getDefault());
							}
						}
					}
				}
				if (result) {
					return 0;
				}
				return -1;
			}
		};
	}

	public static final boolean compareFiles(final File source, final File target,
			final Comparator<File> fileComparator) {
		assert ((source.isFile()) && (target.isFile()));
		boolean result = (fileComparator.compare(source, target) == 0);
		if (FolderUtils.debug && result) {
			Logger
					.logInfo(
							"Files " + source.getName() + " and " + target.getName() + " are equal.", CommonModiscoActivator.getDefault()); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		}
		return result;
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
			Logger.logError(e, CommonModiscoActivator.getDefault());
		} catch (IOException e) {
			Logger.logError(e, CommonModiscoActivator.getDefault());
		} finally {
			if (sourceReader != null) {
				try {
					sourceReader.close();
				} catch (IOException e) {
					Logger.logError(e, CommonModiscoActivator.getDefault());
				}
			}
		}
		return result.toString();
	}

	/**
	 * This method compares two folders (in fact the contents of these two
	 * folders). It is recursive into each folder
	 */
	private static final boolean recursiveCompareFolders(final File folderSource,
			final File folderTarget, final FilenameFilter filter,
			final Comparator<File> fileComparison) {
		if (FolderUtils.debug) {
			Logger
					.logError(
							"comparison of " + folderSource.getName() + " and " + folderTarget.getName(), CommonModiscoActivator.getDefault()); //$NON-NLS-1$ //$NON-NLS-2$
		}
		boolean result = true;

		File[] sourceContents = folderSource.listFiles(filter);
		File[] targetContents = folderTarget.listFiles(filter);
		if (sourceContents.length != targetContents.length) {
			result = false;
			if (FolderUtils.debug) {
				Logger.logError("folders " + folderSource.getName() + " and " //$NON-NLS-1$//$NON-NLS-2$
						+ folderTarget.getName() + " do not have the same number of children (" //$NON-NLS-1$
						+ sourceContents.length + ", " + targetContents.length + ")", //$NON-NLS-1$ //$NON-NLS-2$
						CommonModiscoActivator.getDefault());
			}
		} else {
			for (File sourceContent : sourceContents) {
				/*
				 * For each File in the current directory, we test if it has a
				 * counterpart in the contents of the target directory. The
				 * search is based on the path name, so there can be problems if
				 * a file has the same name as a directory.
				 */
				File targetContent = FolderUtils.getCorrespondingTargetContent(sourceContent,
						targetContents);
				if (targetContent == null) {
					result = false;
					if (FolderUtils.debug) {
						Logger
								.logError(
										"There is no corresponding element in target folder for " + sourceContent.getName(), CommonModiscoActivator.getDefault()); //$NON-NLS-1$
					}
				} else {
					/*
					 * Two cases: for a directory, recurse into its contents,
					 * and for a file, compare the contents of the two files.
					 */
					if (sourceContent.isDirectory()) {
						boolean subResult = FolderUtils.recursiveCompareFolders(sourceContent,
								targetContent, filter, fileComparison);
						result = result && subResult;

						if (FolderUtils.debug && !subResult) {
							Logger
									.logError(
											"folders " + sourceContent.getName() + " and " + targetContent.getName() + " are not equal.", CommonModiscoActivator.getDefault()); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						}
					} else {
						boolean subResult = FolderUtils.compareFiles(sourceContent, targetContent,
								fileComparison);
						result = result && subResult;
						if (FolderUtils.debug && !subResult) {
							Logger
									.logError(
											"files " + sourceContent.getName() + " and " + targetContent.getName() + " are not equal.", CommonModiscoActivator.getDefault()); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						}
					}
				}
			}
		}
		return result;
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
	 * Copies the source directory to the target directory. The target is
	 * created if it does not exist.
	 */
	public static final void copyDirectory(final File srcDir, final File destDir)
			throws IOException {
		FolderUtils.copyDirectory(srcDir, destDir, new IFilter() {
			@Override
			public boolean filter(final Object object) {
				return true;
			}
		});
	}

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
						FolderUtils.copyFile(src, dest);
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
					FolderUtils.copyDirectory2(src, dest, filter, src2dest);
				}
			}
		}

	}

	public static void copyFolderFromBundle(final String sourcePath, final Plugin sourcePlugin,
			final String destinationPath, final IProject project) throws IOException, CoreException {
		FolderUtils.copyFolderFromBundle(sourcePath, sourcePlugin.getBundle(), destinationPath,
				project);
	}

	/**
	 * Copies the source directory to the target directory. The target is
	 * created if it does not exist.
	 */
	public static void copyFolderFromBundle(final String sourcePath, final Bundle sourceBundle,
			final String destinationPath, final IProject project) throws IOException, CoreException {
		Enumeration<?> e = sourceBundle.getEntryPaths(sourcePath);
		if (e == null) {
			// it should be a file (not a folder)
			try {
				InputStream source = sourceBundle.getEntry(sourcePath).openStream();
				IFile javaFile = project.getFile(destinationPath);
				if (javaFile.exists()) {
					javaFile.delete(true, new NullProgressMonitor());
				}
				javaFile.create(source, true, new NullProgressMonitor());
			} catch (Exception e1) {
				Logger.logError(e1, CommonModiscoActivator.getDefault());
			}
		} else {
			String subDestinationPath = "/"; //$NON-NLS-1$
			if (!destinationPath.equals("/")) { //$NON-NLS-1$
				IFolder folder = project.getFolder(destinationPath);
				if (!folder.exists()) {
					try {
						folder.create(true, true, new NullProgressMonitor());
					} catch (Exception e1) {
						Logger.logError(e1, CommonModiscoActivator.getDefault());
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
						FolderUtils.copyFolderFromBundle(subpath, sourceBundle, dest, project);
					}
				} else {
					throw new RuntimeException("Unexpected element type"); //$NON-NLS-1$
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
			byte[] buffer = new byte[FolderUtils.COPY_BUFFER_SIZE];
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

	/**
	 * Recursively delete a directory.
	 *
	 * @param directory
	 *            directory to delete
	 * @throws IOException
	 *             in case deletion is unsuccessful
	 */
	public static final void deleteDirectory(final File directory) throws IOException {
		if (!directory.exists()) {
			return;
		}

		FolderUtils.clearFolder(directory);
		if (directory.list().length == 0) {
			// delete directory
			if (!directory.delete()) {
				String message = "Unable to delete directory " + directory + "."; //$NON-NLS-1$ //$NON-NLS-2$
				throw new IOException(message);
			}
		}
	}

	public static void createFolder(final IFolder folder) throws CoreException {
		if (!folder.getParent().exists()) {
			FolderUtils.createFolder((IFolder) folder.getParent());
		}
		if (!folder.exists()) {
			folder.create(true, true, new NullProgressMonitor());
		}
	}

	/**
	 * write a new content into a given file.
	 *
	 * @param source
	 *            source file. It will be created if it does not exist.
	 * @param newContent
	 * @throws IOException
	 */
	public static final void writeFileContent(final File source, final String newContent)
			throws IOException {
		FileWriter fw = new FileWriter(source, false);
		fw.write(newContent);
		fw.close();
	}
}
