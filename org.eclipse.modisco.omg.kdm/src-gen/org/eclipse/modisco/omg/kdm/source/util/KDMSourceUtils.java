/**
 * *******************************************************************************
 * Copyright (c) 2010 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 
 * 	   Nicolas Guyomar (Mia-Software) - initial API and implementation
 * *******************************************************************************
 */
package org.eclipse.modisco.omg.kdm.source.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.modisco.omg.kdm.source.AbstractInventoryElement;
import org.eclipse.modisco.omg.kdm.source.BinaryFile;
import org.eclipse.modisco.omg.kdm.source.Directory;
import org.eclipse.modisco.omg.kdm.source.InventoryContainer;
import org.eclipse.modisco.omg.kdm.source.SourceFile;
import org.eclipse.modisco.omg.kdm.source.impl.BinaryFileImpl;
import org.eclipse.modisco.omg.kdm.source.impl.DirectoryImpl;
import org.eclipse.modisco.omg.kdm.source.impl.SourceFileImpl;

/**
 * Utils for KDMSource Model exploitation
 */
public class KDMSourceUtils {

	/**
	 * Return all instance of the given itemType contained in the InventoryContainer.
	 * Explorer recursively if recurseOnSubDirectories is set to TRUE
	 * @param container
	 *            The container
	 * @param filteredDirectoryName
	 *            The names of directories excluded from the search
	 * @param itemType
	 *            The type of item to return
	 * @param recurseOnSubDirectories
	 *            Add the subDirectories to the search
	 * @return The list of itemType contained in the container
	 */
	private static List<AbstractInventoryElement> getInventoryItemFromContainer(
			InventoryContainer container, List<String> filteredDirectoryName,
			Class<?> itemType, boolean recurseOnSubDirectories) {

		List<AbstractInventoryElement> list = new ArrayList<AbstractInventoryElement>();
		for (AbstractInventoryElement elt : container.getInventoryElement()) {
			if (!isFiltered(elt.getName(), filteredDirectoryName)) {
				if (elt.getClass().equals(itemType)) {
					list.add(elt);
				}
				if (elt instanceof InventoryContainer
						&& recurseOnSubDirectories) {
					list.addAll(getInventoryItemFromContainer(
							(InventoryContainer) elt, filteredDirectoryName,
							itemType, recurseOnSubDirectories));
				}
			}
		}
		return list;
	}

	/**
	 * Return all the binary files from a InventoryModel
	 * 
	 * @param inventoryModel
	 *            The inventoryModel from which to retrieve the binary files
	 * @param filteredDirectoryName
	 *            The names of directories excluded from the search
	 * @param recurseOnSubDirectories
	 *            Add the subDirectories to the search
	 * @return The list of all the binary files contained in the segment
	 */
	public static List<BinaryFile> getBinaryFilesFromInventoryModel(
			InventoryContainer container,
			ArrayList<String> filteredDirectoryName,
			boolean recurseOnSubDirectories) {

		List<BinaryFile> binaryFileList = new ArrayList<BinaryFile>();

		// Loop to avoid unchecked cast warning on the whole list
		for (AbstractInventoryElement elt : getInventoryItemFromContainer(
				container, filteredDirectoryName, BinaryFileImpl.class,
				recurseOnSubDirectories)) {
			binaryFileList.add((BinaryFile) elt);
		}
		return binaryFileList;
	}

	/**
	 * Return all the source files contained in the inventoryModel
	 * 
	 * @param inventoryModel
	 *            The inventoryModel from which to retrieve the source files
	 * @param filteredDirectoryName
	 *            The names of directories excluded from the search
	 * @param recurseOnSubDirectories
	 *            Add the subDirectories to the search
	 * @return
	 */
	public static List<SourceFile> getSourceFileFromInventoryModel(
			InventoryContainer container, List<String> filteredDirectoryName,
			boolean recurseOnSubDirectories) {

		List<SourceFile> sourceFileList = new ArrayList<SourceFile>();

		// Loop to avoid unchecked cast warning on the whole list
		for (AbstractInventoryElement elt : getInventoryItemFromContainer(
				container, filteredDirectoryName, SourceFileImpl.class,
				recurseOnSubDirectories)) {
			sourceFileList.add((SourceFile) elt);
		}
		return sourceFileList;
	}

	/**
	 * Return all the directories from a inventoryModel
	 * 
	 * @param inventoryContainer
	 *            The inventoryModel from which to retrieve the Directory
	 * @param filteredDirectoryName
	 *            The names of directories excluded from the search
	 * @param recurseOnSubDirectories
	 *            Add the subDirectories to the search
	 * @return
	 */
	public static List<Directory> getDirectoriesFromInventoryModel(
			InventoryContainer container, List<String> filteredDirectoryName,
			boolean recurseOnSubDirectories) {

		List<Directory> directoriesList = new ArrayList<Directory>();

		// Loop to avoid unchecked cast warning on the whole list
		for (AbstractInventoryElement elt : getInventoryItemFromContainer(
				container, filteredDirectoryName, DirectoryImpl.class,
				recurseOnSubDirectories)) {
			directoriesList.add((Directory) elt);
		}

		return directoriesList;
	}

	/**
	 * Check if the name given in parameter is contained in the list
	 * 
	 * @param name
	 *            the name to check
	 * @param filteredDirectoryName
	 *            The names of directories excluded from the search
	 * @return
	 */
	private static boolean isFiltered(String name,
			List<String> filteredDirectoryName) {
		return filteredDirectoryName == null ? false : filteredDirectoryName
				.contains(name);
	}

	/**
	 * Utility classes don't need to (and shouldn't) be instantiated.
	 */
	private KDMSourceUtils() {
		// prevents instantiation
	}

	/**
	 * Return the Directory corresponding to the given path
	 * 
	 * @param path
	 *            The path to look for a Directory
	 * @param inventoryContainer
	 *            The Container to look for the Directory
	 * @return the Directory which path matches the given path in parameter or null
	 */
	public static Directory getDirectoryByPath(String path,
			InventoryContainer inventoryContainer) {
		for (Directory dir : getDirectoriesFromInventoryModel(
				inventoryContainer, null, true)) {
			if (dir.getPath().equalsIgnoreCase(path)) {
				return dir;
			}
		}
		return null;
	}

}
