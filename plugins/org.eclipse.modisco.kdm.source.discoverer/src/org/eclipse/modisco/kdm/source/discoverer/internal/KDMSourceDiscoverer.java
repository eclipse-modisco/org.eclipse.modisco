/*******************************************************************************
 * Copyright (c) 2011, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Fabien Giquel (Mia-Software)
 *    Romain Dervaux (Mia-Software)
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *******************************************************************************/
package org.eclipse.modisco.kdm.source.discoverer.internal;

import java.io.File;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.content.IContentType;
import org.eclipse.core.runtime.content.IContentTypeManager;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.modisco.omg.kdm.kdm.KdmFactory;
import org.eclipse.modisco.omg.kdm.kdm.Segment;
import org.eclipse.modisco.omg.kdm.source.Directory;
import org.eclipse.modisco.omg.kdm.source.InventoryContainer;
import org.eclipse.modisco.omg.kdm.source.InventoryItem;
import org.eclipse.modisco.omg.kdm.source.InventoryModel;
import org.eclipse.modisco.omg.kdm.source.SourceFactory;

/**
 * Services for building a basic file system representation, based on the Source
 * package from the KDM metamodel.
 */
public class KDMSourceDiscoverer {

	/**
	 * Memorize if top level container is a project.
	 */
	private boolean rootIsProject = false;

	/**
	 * Memorize top level container.
	 */
	private InventoryContainer rootContainer = null;

	/**
	 * The ContentTypeManager of the Platform.
	 */
	private static final IContentTypeManager CONTENT_TYPE_MANAGER = Platform
			.getContentTypeManager();

	/**
	 * The content type corresponding to a generic text file.
	 */
	private static final IContentType TEXT_CONTENT_TYPE = KDMSourceDiscoverer.CONTENT_TYPE_MANAGER
			.getContentType(Activator.PLUGIN_ID + ".textFile"); //$NON-NLS-1$

	/**
	 * The content type corresponding to a configuration file.
	 */
	private static final IContentType CONFIG_CONTENT_TYPE = KDMSourceDiscoverer.CONTENT_TYPE_MANAGER
			.getContentType(Activator.PLUGIN_ID + ".confFile"); //$NON-NLS-1$

	/**
	 * The content type corresponding to a source file.
	 */
	private static final IContentType SRC_CONTENT_TYPE = KDMSourceDiscoverer.CONTENT_TYPE_MANAGER
			.getContentType(Activator.PLUGIN_ID + ".srcFile"); //$NON-NLS-1$

	/**
	 * The content type corresponding to a generic binary file.
	 */
	private static final IContentType BIN_CONTENT_TYPE = KDMSourceDiscoverer.CONTENT_TYPE_MANAGER
			.getContentType(Activator.PLUGIN_ID + ".binaryFile"); //$NON-NLS-1$

	/**
	 * The content type corresponding to an image.
	 */
	private static final IContentType IMAGE_CONTENT_TYPE = KDMSourceDiscoverer.CONTENT_TYPE_MANAGER
			.getContentType(Activator.PLUGIN_ID + ".imageFile"); //$NON-NLS-1$

	/**
	 * The content type corresponding to an executable file.
	 */
	private static final IContentType EXECUTABLE_CONTENT_TYPE = KDMSourceDiscoverer.CONTENT_TYPE_MANAGER
			.getContentType(Activator.PLUGIN_ID + ".executableFile"); //$NON-NLS-1$

	/**
	 * Create a new File system representation for the given File.
	 *
	 * @param file
	 *            must be a directory
	 * @return the resource containing the representation
	 */
	public final Resource getKDMModelFromDirectory(final File file) {
		if (!file.isDirectory()) {
			return null;
		}
		this.rootIsProject = false;
		this.rootContainer = null;
		return createKDMModelFromDirectory(file, file.getName());
	}

	/**
	 * Create a new File system representation for the given project.
	 *
	 * @param project
	 *            a project
	 * @return the resource containing the representation
	 */
	public final Resource getKDMModelFromProject(final IProject project) {
		this.rootIsProject = true;
		this.rootContainer = null;
		return createKDMModelFromDirectory(project.getLocation().toFile(), project.getName());
	}

	/**
	 * Create a new File system representation for the given Eclipse container.
	 *
	 * @param aContainer
	 *            a Eclipse container
	 * @return the resource containing the representation
	 */
	public final Resource getKDMModelFromContainer(final IContainer aContainer) {
		this.rootIsProject = (aContainer == aContainer.getProject());
		this.rootContainer = null;
		return createKDMModelFromDirectory(aContainer.getLocation().toFile(), aContainer.getName());
	}

	/**
	 * Create a new File system representation for the given directory.
	 *
	 * @param directoryFile
	 *            a directory
	 * @param name
	 *            name of the model
	 * @return the resource containing the representation
	 */
	private Resource createKDMModelFromDirectory(final File directoryFile, final String name) {
		Resource resultModel = new XMIResourceImpl();
		Segment segment = KdmFactory.eINSTANCE.createSegment();

		InventoryModel inventoryModel = SourceFactory.eINSTANCE.createInventoryModel();
		inventoryModel.setName(name);
		// resultModel.getContents().add(inventoryModel);
		segment.getModel().add(inventoryModel);
		resultModel.getContents().add(segment);

		InventoryContainer project = createFileSystemTree(directoryFile);
		inventoryModel.getInventoryElement().add(project);
		return resultModel;
	}

	/**
	 * Create a new File system representation for the given directory.
	 *
	 * @param directory
	 *            a directory
	 * @return the inventory container
	 */
	private InventoryContainer createFileSystemTree(final File directory) {
		InventoryContainer resultDirectory;
		if (this.rootContainer == null && this.rootIsProject) {
			resultDirectory = SourceFactory.eINSTANCE.createProject();
			this.rootContainer = resultDirectory;
		} else {
			resultDirectory = SourceFactory.eINSTANCE.createDirectory();
			((Directory) resultDirectory).setPath(directory.getAbsolutePath());
			if (this.rootContainer == null) {
				this.rootContainer = resultDirectory;
			}
		}
		resultDirectory.setName(directory.getName());

		File[] children = directory.listFiles();
		for (File child : children) {
			if (child.isFile()) {
				InventoryItem childItem = getElement(child);
				childItem.setPath(child.getAbsolutePath());
				childItem.setName(child.getName());
				resultDirectory.getInventoryElement().add(childItem);
			} else {
				Directory childDirectory = (Directory) createFileSystemTree(child);
				resultDirectory.getInventoryElement().add(childDirectory);
			}
		}
		return resultDirectory;
	}

	/**
	 * Between multiple content types for the file, search for the most
	 * specialized defined in this plug-in, or <code>null</code> if no content
	 * type is associated with this file in this plug-in.
	 *
	 * @param fileName
	 *            the file name
	 * @return the more specialized content type defined in this plug-in
	 */
	private static IContentType findBestContentTypeFor(final String fileName) {
		IContentType[] contentTypes = KDMSourceDiscoverer.CONTENT_TYPE_MANAGER
				.findContentTypesFor(fileName);

		IContentType bestContentType = null;

		for (IContentType contentType : contentTypes) {
			if (contentType.getId().startsWith(Activator.PLUGIN_ID)) {
				if (bestContentType == null || contentType.isKindOf(bestContentType)) {
					bestContentType = contentType;
				}
			}
		}
		return bestContentType;
	}

	/**
	 * Create the Inventory Item corresponding to the given file's content type.
	 *
	 * @param file
	 *            the file
	 * @return the inventory item
	 */
	private static InventoryItem getElement(final File file) {

		InventoryItem item = null;

		IContentType contentType = findBestContentTypeFor(file.getName());

		if (contentType != null) {

			if (contentType.isKindOf(KDMSourceDiscoverer.BIN_CONTENT_TYPE)) {
				if (contentType.isKindOf(KDMSourceDiscoverer.IMAGE_CONTENT_TYPE)) {
					item = SourceFactory.eINSTANCE.createImage();
					return item;
				} else if (contentType.isKindOf(KDMSourceDiscoverer.EXECUTABLE_CONTENT_TYPE)) {
					item = SourceFactory.eINSTANCE.createExecutableFile();
					return item;
				} else {
					item = SourceFactory.eINSTANCE.createBinaryFile();
				}

			} else if (contentType.isKindOf(KDMSourceDiscoverer.TEXT_CONTENT_TYPE)) {

				if (contentType.isKindOf(KDMSourceDiscoverer.CONFIG_CONTENT_TYPE)) {
					item = SourceFactory.eINSTANCE.createConfiguration();
				} else if (contentType.isKindOf(KDMSourceDiscoverer.SRC_CONTENT_TYPE)) {
					item = SourceFactory.eINSTANCE.createSourceFile();
				}
			}
		}
		if (item == null) {
			item = SourceFactory.eINSTANCE.createSourceFile();
		}
		return item;
	}

}
