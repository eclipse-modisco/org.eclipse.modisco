/**
 * Copyright (c) 2008 Mia-Software. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributor: 
 *     Fabien Giquel
 *     Romain Dervaux
 */

package org.eclipse.gmt.modisco.kdm.source.discoverer;

import java.io.File;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.content.IContentType;
import org.eclipse.core.runtime.content.IContentTypeManager;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.gmt.modisco.kdm.source.discoverer.plugin.Activator;
import org.eclipse.gmt.modisco.omg.kdm.kdm.KdmFactory;
import org.eclipse.gmt.modisco.omg.kdm.kdm.Segment;
import org.eclipse.gmt.modisco.omg.kdm.source.Directory;
import org.eclipse.gmt.modisco.omg.kdm.source.InventoryContainer;
import org.eclipse.gmt.modisco.omg.kdm.source.InventoryItem;
import org.eclipse.gmt.modisco.omg.kdm.source.InventoryModel;
import org.eclipse.gmt.modisco.omg.kdm.source.SourceFactory;
import org.eclipse.jdt.core.IJavaProject;

/**
 * Some services for building a basic file system representation, based on Source sub package from
 * KDM metamodel.
 * 
 * @deprecated the whole plug-in is replaced by org.eclipse.modisco.kdm.source.discoverer, cf.
 *             https://bugs.eclipse.org/bugs/show_bug.cgi?id=474727
 */
@Deprecated
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
	private final IContentTypeManager contentTypeManager = Platform.getContentTypeManager();

	/**
	 * The content type corresponding to a generic text file.
	 */
	private final IContentType textContentType = this.contentTypeManager
			.getContentType(Activator.PLUGIN_ID + ".textFile"); //$NON-NLS-1$

	/**
	 * The content type corresponding to a configuration file.
	 */
	private final IContentType configContentType = this.contentTypeManager
			.getContentType(Activator.PLUGIN_ID + ".confFile"); //$NON-NLS-1$

	/**
	 * The content type corresponding to a source file.
	 */
	private final IContentType srcContentType = this.contentTypeManager
			.getContentType(Activator.PLUGIN_ID + ".srcFile"); //$NON-NLS-1$

	/**
	 * The content type corresponding to a generic binary file.
	 */
	private final IContentType binaryContentType = this.contentTypeManager
			.getContentType(Activator.PLUGIN_ID + ".binaryFile"); //$NON-NLS-1$

	/**
	 * The content type corresponding to an image.
	 */
	private final IContentType imageContentType = this.contentTypeManager
			.getContentType(Activator.PLUGIN_ID + ".imageFile"); //$NON-NLS-1$

	/**
	 * The content type corresponding to an executable file.
	 */
	private final IContentType executableContentType = this.contentTypeManager
			.getContentType(Activator.PLUGIN_ID + ".executableFile"); //$NON-NLS-1$

	/**
	 * Create a new File system representation for the given File.
	 * 
	 * @param aFile
	 *            must be a directory
	 * @return the resource containing the representation
	 */
	public final Resource getKDMModelFromDirectory(final File aFile) {
		if (!aFile.isDirectory()) {
			return null;
		}
		this.rootIsProject = false;
		this.rootContainer = null;
		return createKDMModelFromFile(aFile, aFile.getName());
	}

	/**
	 * Create a new File system representation for the given Eclipse Java project.
	 * 
	 * @param aProject
	 *            a Java project
	 * @return the resource containing the representation
	 */
	public final Resource getKDMModelFromJavaProject(final IJavaProject aProject) {
		this.rootIsProject = true;
		this.rootContainer = null;
		return createKDMModelFromFile(aProject.getResource().getLocation().toFile(),
				aProject.getElementName());
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
		return createKDMModelFromFile(aContainer.getLocation().toFile(), aContainer.getName());
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
	private Resource createKDMModelFromFile(final File directoryFile, final String name) {
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
	 * Between multiple content types for the file, search for the most specialized defined in this
	 * plugin, <br>
	 * or null if no content type is associated with this file in this plugin.
	 * 
	 * @param fileName
	 *            the file name
	 * @return the more specialized content type defined in this plugin
	 */
	private IContentType findBestContentTypeFor(final String fileName) {
		IContentType[] ct = this.contentTypeManager.findContentTypesFor(fileName);
		if (ct.length == 0) {
			return null;
		}

		IContentType bestCT = null;

		for (IContentType element : ct) {
			if (element.getId().startsWith(Activator.PLUGIN_ID)) {
				if (bestCT == null || element.isKindOf(bestCT)) {
					bestCT = element;
				}
			}
		}
		return bestCT;
	}

	/**
	 * Create the Inventory Item corresponding to the file content type.
	 * 
	 * @param child
	 *            the file
	 * @return the inventory item
	 */
	private InventoryItem getElement(final File child) {

		InventoryItem item = null;

		IContentType ct = findBestContentTypeFor(child.getName());

		if (ct != null) {

			if (ct.isKindOf(this.binaryContentType)) {
				if (ct.isKindOf(this.imageContentType)) {
					item = SourceFactory.eINSTANCE.createImage();
					return item;
				} else if (ct.isKindOf(this.executableContentType)) {
					item = SourceFactory.eINSTANCE.createExecutableFile();
					return item;
				} else {
					item = SourceFactory.eINSTANCE.createBinaryFile();
				}

			} else if (ct.isKindOf(this.textContentType)) {

				if (ct.isKindOf(this.configContentType)) {
					item = SourceFactory.eINSTANCE.createConfiguration();
				} else if (ct.isKindOf(this.srcContentType)) {
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
