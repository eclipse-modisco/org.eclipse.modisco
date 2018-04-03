/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.browser.editors.table;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmt.modisco.infra.browser.Messages;
import org.eclipse.gmt.modisco.infra.browser.core.InstancesForMetaclass;
import org.eclipse.gmt.modisco.infra.browser.editors.BrowserConfiguration;
import org.eclipse.gmt.modisco.infra.facet.Facet;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

public class TableEditorInput implements IEditorInput {

	/** The elements that are displayed in the table */
	private final List<TableElement> elements;
	/** Union of all the elements' structural features */
	private final List<EStructuralFeature> fFeatures;

	/** The main browser's configuration */
	private final BrowserConfiguration browserConfiguration;
	/** A textual description of what is shown in the browser */
	private final String description;
	/** All the metaclasses of the elements */
	private HashSet<EClass> metaclasses;

	/**
	 * Create an input for all the given elements
	 *
	 * @param browserConfiguration
	 *            the main browser's configuration
	 * @param tableElements
	 *            the elements to show as rows in the table
	 * @param description
	 *            a descriptive String of what will be displayed in the table
	 *            view editor
	 */
	public TableEditorInput(final BrowserConfiguration browserConfiguration,
			final List<TableElement> tableElements, final String description) {
		this.browserConfiguration = browserConfiguration;
		this.elements = tableElements;
		this.description = description;

		this.metaclasses = new HashSet<EClass>();
		for (final TableElement tableElement : tableElements) {
			Object element = tableElement.getElement();
			if (element instanceof EObject) {
				EObject eObject = (EObject) element;
				this.metaclasses.add(eObject.eClass());
				List<Facet> facets = this.browserConfiguration.getAppearanceConfiguration()
						.getFacetContext().getFacets(eObject);
				this.metaclasses.addAll(facets);
			}
		}

		// all the attributes of the metaclasses of the elements
		final List<EStructuralFeature> features = new BasicEList<EStructuralFeature>() {
			private static final long serialVersionUID = -2429276823183270956L;

			@Override
			protected boolean isUnique() {
				return true;
			}
		};
		for (final EClass eClass : this.metaclasses) {
			features.addAll(eClass.getEAllStructuralFeatures());
		}

		this.fFeatures = new ArrayList<EStructuralFeature>(features);
	}

	/**
	 * Create an input for all elements of the given class
	 *
	 * @param browserConfiguration
	 *            the main editor configuration
	 * @param eClass
	 *            the metaclass of the elements to show
	 * @param description
	 *            a descriptive String of what will be displayed in the table
	 *            view editor
	 * */
	public TableEditorInput(final BrowserConfiguration browserConfiguration, final EClass eClass,
			final String description) {
		this.browserConfiguration = browserConfiguration;
		this.description = description;
		final InstancesForMetaclass instances = this.browserConfiguration
				.getInstancesForMetaclasses().getInstancesForMetaclass(eClass);
		this.elements = new ArrayList<TableElement>();
		ArrayList<EObject> instanceElements = instances.getElements();
		for (EObject eObject : instanceElements) {
			this.elements.add(new TableElement(eObject));
		}
		this.fFeatures = new ArrayList<EStructuralFeature>(eClass.getEAllStructuralFeatures());
	}

	public List<TableElement> getElements() {
		return this.elements;
	}

	public List<EStructuralFeature> getFeatures() {
		return this.fFeatures;
	}

	public String getDescription() {
		return this.description;
	}

	public BrowserConfiguration getBrowserConfiguration() {
		return this.browserConfiguration;
	}

	public boolean exists() {
		return false;
	}

	public ImageDescriptor getImageDescriptor() {
		return null;
	}

	public String getName() {
		return Messages.TableEditorInput_editorName_TableViewer;
	}

	public IPersistableElement getPersistable() {
		return null;
	}

	public String getToolTipText() {
		return Messages.TableEditorInput_tooltip_TableViewer;
	}

	@SuppressWarnings("unchecked")
	public Object getAdapter(final Class adapter) {
		return null;
	}

	public EClass[] getMetaclasses() {
		return this.metaclasses.toArray(new EClass[this.metaclasses.size()]);
	}

	public static class ElementsDescription {
		private boolean containsEObjects;
		private boolean containsPrimitiveTypes;
		private boolean containsContexts;

		public boolean containsEObjects() {
			return this.containsEObjects;
		}

		public boolean containsPrimitiveTypes() {
			return this.containsPrimitiveTypes;
		}

		public boolean containsContexts() {
			return this.containsContexts;
		}
	}

	public ElementsDescription getElementsDescription() {
		ElementsDescription elementsDescription = new ElementsDescription();
		for (TableElement tableElement : this.elements) {
			if (tableElement instanceof TableElementWithContext) {
				elementsDescription.containsContexts = true;
			}
			Object element = tableElement.getElement();
			if (element instanceof EObject) {
				elementsDescription.containsEObjects = true;
			} else {
				elementsDescription.containsPrimitiveTypes = true;
			}
		}
		return elementsDescription;
	}
}
