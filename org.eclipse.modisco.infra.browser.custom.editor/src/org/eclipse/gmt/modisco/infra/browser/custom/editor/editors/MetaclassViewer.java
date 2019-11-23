/*******************************************************************************
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Nicolas Bros (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmt.modisco.infra.browser.custom.editor.editors;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.infra.browser.custom.AttributeView;
import org.eclipse.gmt.modisco.infra.browser.custom.CustomView;
import org.eclipse.gmt.modisco.infra.browser.custom.CustomViewFeature;
import org.eclipse.gmt.modisco.infra.browser.custom.MetamodelView;
import org.eclipse.gmt.modisco.infra.browser.custom.ReferenceView;
import org.eclipse.gmt.modisco.infra.browser.custom.TypeView;
import org.eclipse.gmt.modisco.infra.browser.uicore.internal.model.AttributeItem;
import org.eclipse.gmt.modisco.infra.browser.uicore.internal.model.LinkItem;
import org.eclipse.gmt.modisco.infra.browser.uicore.internal.model.ModelElementItem;
import org.eclipse.gmt.modisco.infra.browser.uicore.internal.util.ImageProvider;
import org.eclipse.gmt.modisco.infra.common.core.internal.utils.ModelUtils;
import org.eclipse.gmt.modisco.infra.facet.Facet;
import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.IFontProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

/**
 * A TreeViewer displaying a list of selectable meta-classes. Display options are handled in
 * {@link MetaclassViewConfiguration}, which are made accessible to the user through the
 * {@link MetaclassViewToolBar}.
 */
public class MetaclassViewer {

	private final TreeViewer treeViewer;
	private final MetaclassViewConfiguration metaclassViewConfiguration;
	private MetamodelView fMetamodelView;

	/** Wraps an EAttribute and adds the containing class */
	public static class Attribute {
		/** The class on which the attribute will be customized */
		private final EClass eClass;
		private final EAttribute eAttribute;

		public Attribute(final EClass eClass, final EAttribute eAttribute) {
			this.eClass = eClass;
			this.eAttribute = eAttribute;
		}

		public EClass getEClass() {
			return this.eClass;
		}

		public EAttribute getEAttribute() {
			return this.eAttribute;
		}

		@Override
		public boolean equals(final Object obj) {
			if (obj instanceof Attribute) {
				final Attribute other = (Attribute) obj;
				return this.eClass == other.eClass && this.eAttribute == other.eAttribute;
			}
			return false;
		}

		@Override
		public int hashCode() {
			final int hashPrime1 = 13;
			final int hashPrime2 = 47;
			return this.eClass.hashCode() * hashPrime2 + this.eAttribute.hashCode() + hashPrime1;
		}
	}

	/** Wraps an EReference and adds the containing class */
	public static class Reference {
		/** The class on which the reference will be customized */
		private final EClass eClass;
		private final EReference eReference;

		public Reference(final EClass eClass, final EReference eReference) {
			this.eClass = eClass;
			this.eReference = eReference;
		}

		public EClass getEClass() {
			return this.eClass;
		}

		public EReference getEReference() {
			return this.eReference;
		}

		@Override
		public boolean equals(final Object obj) {
			if (obj instanceof Reference) {
				final Reference other = (Reference) obj;
				return this.eClass == other.eClass && this.eReference == other.eReference;
			}
			return false;
		}

		@Override
		public int hashCode() {
			final int hashPrime1 = 13;
			final int hashPrime2 = 47;
			return this.eClass.hashCode() * hashPrime2 + this.eReference.hashCode() + hashPrime1;
		}
	}

	/**
	 * @param parent
	 *            the composite in which this viewer must be created
	 * @param metaclassViewConfiguration
	 *            the configuration of the metaclass viewer
	 * @param metamodelView
	 *            used to know whether an element is customized or not
	 */
	public MetaclassViewer(final Composite parent,
			final MetaclassViewConfiguration metaclassViewConfiguration,
			final MetamodelView metamodelView) {
		this.metaclassViewConfiguration = metaclassViewConfiguration;
		this.fMetamodelView = metamodelView;
		this.treeViewer = new TreeViewer(parent, SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER
				| SWT.SINGLE);

		initViewer();
	}

	public void setInput(final Object input) {
		this.treeViewer.setInput(input);
	}

	protected class MetaclassContentProvider implements ITreeContentProvider {
		public Object[] getElements(final Object inputElement) {
			// Resource : metamodel
			if (inputElement instanceof Resource) {
				final Resource resource = (Resource) inputElement;
				final TreeIterator<EObject> allContents = resource.getAllContents();
				final List<EClass> metaclasses = new ArrayList<EClass>();
				while (allContents.hasNext()) {
					final EObject eObject = allContents.next();
					if (eObject instanceof EClass) {
						final EClass eClass = (EClass) eObject;
						metaclasses.add(eClass);
					}
				}
				return metaclasses.toArray();
			}

			return new Object[0];
		}

		public void dispose() {
			// nothing
		}

		public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
			// nothing
		}

		public Object[] getChildren(final Object parentElement) {

			if (parentElement instanceof EClass) {
				final EClass eClass = (EClass) parentElement;

				final EList<EAttribute> attributes;
				final EList<EReference> references;

				if (eClass instanceof Facet) {
					Facet facet = (Facet) eClass;
					// XXX also super-facets attributes?
					attributes = facet.getEAttributes();
					// XXX also super-facets references?
					references = facet.getEReferences();
				} else {
					attributes = eClass.getEAllAttributes();
					references = eClass.getEAllReferences();
				}

				/*
				 * The attributes and references are wrapped with added information about their
				 * class. This is necessary because a feature view can be defined for a feature of a
				 * subclass.
				 */
				final List<Object> children = new ArrayList<Object>();
				for (final EAttribute attribute : attributes) {
					if (!attribute.isDerived()
							|| MetaclassViewer.this.metaclassViewConfiguration.isShowDerivedLinks()) {
						children.add(new Attribute(eClass, attribute));
					}
				}
				for (final EReference reference : references) {
					if (!reference.isDerived()
							|| MetaclassViewer.this.metaclassViewConfiguration.isShowDerivedLinks()) {
						children.add(new Reference(eClass, reference));
					}
				}
				return children.toArray();
			}

			return new Object[0];
		}

		public Object getParent(final Object element) {
			if (element instanceof Reference) {
				return ((Reference) element).getEClass();
			}
			if (element instanceof Attribute) {
				return ((Attribute) element).getEClass();
			}
			return null;
		}

		public boolean hasChildren(final Object element) {
			if (element instanceof EClass) {
				return getChildren(element).length > 0;
			}
			return false;
		}
	}

	protected class MetaclassLabelProvider extends LabelProvider implements IColorProvider,
			IFontProvider {

		private final RGB rgbGray = new RGB(128, 128, 128);
		private final Color colorGrayedOut;
		private final Font boldFont;

		public MetaclassLabelProvider() {
			this.colorGrayedOut = new Color(Display.getDefault(), this.rgbGray);

			FontDescriptor fontDescriptor = JFaceResources.getDefaultFontDescriptor();
			fontDescriptor = fontDescriptor.setStyle(SWT.BOLD);
			this.boldFont = fontDescriptor.createFont(Display.getDefault());
		}

		@Override
		public String getText(final Object element) {
			if (element instanceof EClass) {
				final EClass eClass = (EClass) element;
				return getClassDisplayName(eClass);
			}
			if (element instanceof Reference) {
				final EReference reference = ((Reference) element).getEReference();
				final boolean showMultiplicity = MetaclassViewer.this.metaclassViewConfiguration
						.isShowMultiplicity();
				return LinkItem.getStaticText(reference, showMultiplicity, false, null);
			}
			if (element instanceof Attribute) {
				final EAttribute attribute = ((Attribute) element).getEAttribute();
				final boolean showMultiplicity = MetaclassViewer.this.metaclassViewConfiguration
						.isShowMultiplicity();
				return AttributeItem.getStaticText(attribute, showMultiplicity, null);
			}

			return element.toString();
		}

		@Override
		public Image getImage(final Object element) {
			if (element instanceof EClass) {
				return ImageProvider.getInstance().getEClassIcon();
			}
			if (element instanceof Reference) {
				final EReference reference = ((Reference) element).getEReference();
				return LinkItem.getImageFor(reference);
			}
			if (element instanceof Attribute) {
				return ImageProvider.getInstance().getAttributeIcon();
			}

			return null;
		}

		@Override
		public void dispose() {
			this.colorGrayedOut.dispose();
			this.boldFont.dispose();
			super.dispose();
		}

		public Color getBackground(final Object element) {
			return null;
		}

		public Color getForeground(final Object element) {
			if (isCustomized(element)) {
				return null;
			}
			// gray if not customized
			return this.colorGrayedOut;
		}

		private boolean isCustomized(final Object element) {
			final MetamodelView metamodelView = MetaclassViewer.this.fMetamodelView;
			if (element instanceof EClass) {
				final EClass eClass = (EClass) element;
				for (final TypeView typeView : metamodelView.getTypes()) {
					if (typeView.getMetaclassName().equals(
							ModelUtils.getMetaclassQualifiedName(eClass))) {
						if (containsInformation(typeView)) {
							return true;
						}
						// test contained attributes and references
						final EList<AttributeView> attributes = typeView.getAttributes();
						for (final AttributeView attributeView : attributes) {
							if (containsInformation(attributeView)) {
								return true;
							}
						}
						final EList<ReferenceView> references = typeView.getReferences();
						for (final ReferenceView referenceView : references) {
							if (containsInformation(referenceView)) {
								return true;
							}
						}
					}
				}
				return false;
			} else if (element instanceof Reference) {
				final Reference reference = (Reference) element;
				final EReference eReference = reference.getEReference();
				final EClass eClass = reference.getEClass();
				for (final TypeView typeView : metamodelView.getTypes()) {
					if (typeView.getMetaclassName().equals(
							ModelUtils.getMetaclassQualifiedName(eClass))) {
						final EList<ReferenceView> references = typeView.getReferences();
						for (final ReferenceView referenceView : references) {
							if (referenceView.getReferenceName().equals(eReference.getName())) {
								return containsInformation(referenceView);
							}
						}
					}
				}
			} else if (element instanceof Attribute) {
				final Attribute attribute = (Attribute) element;
				final EAttribute eAttribute = attribute.getEAttribute();
				final EClass eClass = attribute.getEClass();
				for (final TypeView typeView : metamodelView.getTypes()) {
					if (typeView.getMetaclassName().equals(
							ModelUtils.getMetaclassQualifiedName(eClass))) {
						final EList<AttributeView> attributes = typeView.getAttributes();
						for (final AttributeView attributeView : attributes) {
							if (attributeView.getAttributeName().equals(eAttribute.getName())) {
								return containsInformation(attributeView);
							}
						}
					}
				}
			}
			return false;
		}

		private boolean containsInformation(final CustomView customView) {
			final EList<CustomViewFeature> customizedFeatures = customView.getCustomizedFeatures();
			for (final CustomViewFeature customViewFeature : customizedFeatures) {
				if (customViewFeature.getDefaultValue() != null
						|| customViewFeature.getValueCases().size() > 0) {
					return true;
				}
			}
			return false;
		}

		public Font getFont(final Object element) {
			if (isCustomized(element)) {
				return this.boldFont;
			}
			return null;
		}

	}

	/** Initialize the viewer with a content and label provider */
	private void initViewer() {

		this.treeViewer.setContentProvider(new MetaclassContentProvider());
		final MetaclassLabelProvider labelProvider = new MetaclassLabelProvider();
		this.treeViewer.setLabelProvider(labelProvider);

		this.treeViewer.setComparator(new ViewerComparator() {
			@Override
			public int compare(final Viewer viewer, final Object e1, final Object e2) {
				if (e1 instanceof EClass && e2 instanceof EClass) {
					final EClass eClass1 = (EClass) e1;
					final EClass eClass2 = (EClass) e2;
					return safeCompare(getClassDisplayName(eClass1), getClassDisplayName(eClass2));
				}

				if (e1 instanceof Attribute && e2 instanceof Reference) {
					return -1;
				}
				if (e1 instanceof Reference && e2 instanceof Attribute) {
					return 1;
				}

				if (e1 instanceof Attribute && e2 instanceof Attribute) {
					final EAttribute attribute1 = ((Attribute) e1).getEAttribute();
					final EAttribute attribute2 = ((Attribute) e2).getEAttribute();
					final int derived1;
					if (attribute1.isDerived()) {
						derived1 = 1;
					} else {
						derived1 = 0;
					}
					final int derived2;
					if (attribute2.isDerived()) {
						derived2 = 1;
					} else {
						derived2 = 0;
					}
					final int derivedDiff = derived1 - derived2;
					if (derivedDiff != 0) {
						return derivedDiff;
					}
					return safeCompare(attribute1.getName(), attribute2.getName());
				}

				if (e1 instanceof Reference && e2 instanceof Reference) {
					final EReference ref1 = ((Reference) e1).getEReference();
					final EReference ref2 = ((Reference) e2).getEReference();

					if (MetaclassViewer.this.metaclassViewConfiguration.isSortLinksByType()) {
						final int rank1 = ModelElementItem.getReferenceRank(ref1);
						final int rank2 = ModelElementItem.getReferenceRank(ref2);
						final int diffRank = rank1 - rank2;
						if (diffRank != 0) {
							return diffRank;
						}
					}
					if (MetaclassViewer.this.metaclassViewConfiguration.isSortLinks()) {
						return safeCompare(ref1.getName(), ref2.getName());
					}
					return 0;
				}

				return 0;
			}

			private int safeCompare(final String name1, final String name2) {
				if (name1 == null) {
					return -1;
				}
				return name1.compareTo(name2);
			}
		});
	}

	public String getClassDisplayName(final EClass eClass) {
		if (this.metaclassViewConfiguration.isShowMetaclassesFullQualifiedNames()) {
			return ModelUtils.getMetaclassQualifiedName(eClass);
		}
		return eClass.getName();
	}

	public void refresh() {
		if (!this.treeViewer.getTree().isDisposed()) {
			try {
				this.treeViewer.getTree().setRedraw(false);
				this.treeViewer.refresh();
			} finally {
				this.treeViewer.getTree().setRedraw(true);
			}
		}
	}

	public void addSelectionChangedListener(final ISelectionChangedListener selectionChangedListener) {
		this.treeViewer.addSelectionChangedListener(selectionChangedListener);
	}

	public void clearSelection() {
		this.treeViewer.setSelection(null);
	}

	public ISelection getSelection() {
		return this.treeViewer.getSelection();
	}

	public Viewer getViewer() {
		return this.treeViewer;
	}

	public void select(final CustomView customView) {
		Object element = findTreeElement(customView);
		if (element != null) {
			this.treeViewer.setSelection(new StructuredSelection(element), true);
		}
	}

	public Object findTreeElement(final CustomView customView) {
		Object input = this.treeViewer.getInput();
		ITreeContentProvider contentProvider = (ITreeContentProvider) this.treeViewer
				.getContentProvider();
		Object[] elements = contentProvider.getElements(input);
		for (Object element : elements) {
			EClass eClass = (EClass) element;
			String qualifiedName = ModelUtils.getMetaclassQualifiedName(eClass);

			if (customView instanceof TypeView) {
				TypeView typeView = (TypeView) customView;
				if (qualifiedName.equals(typeView.getMetaclassName())) {
					return eClass;
				}
			} else if (customView instanceof AttributeView) {
				AttributeView attributeView = (AttributeView) customView;
				if (qualifiedName.equals(attributeView.getType().getMetaclassName())) {
					Object[] children = contentProvider.getChildren(eClass);
					for (Object child : children) {
						if (child instanceof Attribute) {
							Attribute attribute = (Attribute) child;
							if (attribute.getEAttribute().getName()
									.equals(attributeView.getAttributeName())) {
								return attribute;
							}
						}
					}
					return eClass;
				}

			} else if (customView instanceof ReferenceView) {
				ReferenceView referenceView = (ReferenceView) customView;
				if (qualifiedName.equals(referenceView.getType().getMetaclassName())) {
					Object[] children = contentProvider.getChildren(eClass);
					for (Object child : children) {
						if (child instanceof Reference) {
							Reference reference = (Reference) child;
							if (reference.getEReference().getName()
									.equals(referenceView.getReferenceName())) {
								return reference;
							}
						}
					}
					return eClass;
				}
			}
		}
		return null;
	}

	public void setMetamodelView(final MetamodelView metamodelView) {
		this.fMetamodelView = metamodelView;
	}
}