/**
 * Copyright (c) 2009, 2019 Hatha Systems, and Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 *     Gabriel Barbier (Mia-Software) - minor evolutions for version 1.1
 */
package org.eclipse.modisco.omg.kdm.conceptual.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.modisco.omg.kdm.action.ActionFactory;
import org.eclipse.modisco.omg.kdm.conceptual.ConceptualFactory;
import org.eclipse.modisco.omg.kdm.conceptual.ConceptualPackage;
import org.eclipse.modisco.omg.kdm.conceptual.TermUnit;
import org.eclipse.modisco.omg.kdm.core.provider.KDMEntityItemProvider;
import org.eclipse.modisco.omg.kdm.core.provider.KdmEditPlugin;
import org.eclipse.modisco.omg.kdm.source.SourceFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.modisco.omg.kdm.conceptual.TermUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TermUnitItemProvider extends KDMEntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermUnitItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addImplementationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Implementation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImplementationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractConceptualElement_implementation_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractConceptualElement_implementation_feature", "_UI_AbstractConceptualElement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ConceptualPackage.Literals.ABSTRACT_CONCEPTUAL_ELEMENT__IMPLEMENTATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ConceptualPackage.Literals.ABSTRACT_CONCEPTUAL_ELEMENT__SOURCE);
			childrenFeatures.add(ConceptualPackage.Literals.ABSTRACT_CONCEPTUAL_ELEMENT__CONCEPTUAL_RELATION);
			childrenFeatures.add(ConceptualPackage.Literals.ABSTRACT_CONCEPTUAL_ELEMENT__ABSTRACTION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns TermUnit.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TermUnit")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TermUnit)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TermUnit_type") : //$NON-NLS-1$
			getString("_UI_TermUnit_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(TermUnit.class)) {
			case ConceptualPackage.TERM_UNIT__SOURCE:
			case ConceptualPackage.TERM_UNIT__CONCEPTUAL_RELATION:
			case ConceptualPackage.TERM_UNIT__ABSTRACTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ConceptualPackage.Literals.ABSTRACT_CONCEPTUAL_ELEMENT__SOURCE,
				 SourceFactory.eINSTANCE.createSourceRef()));

		newChildDescriptors.add
			(createChildParameter
				(ConceptualPackage.Literals.ABSTRACT_CONCEPTUAL_ELEMENT__CONCEPTUAL_RELATION,
				 ConceptualFactory.eINSTANCE.createConceptualRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(ConceptualPackage.Literals.ABSTRACT_CONCEPTUAL_ELEMENT__CONCEPTUAL_RELATION,
				 ConceptualFactory.eINSTANCE.createConceptualFlow()));

		newChildDescriptors.add
			(createChildParameter
				(ConceptualPackage.Literals.ABSTRACT_CONCEPTUAL_ELEMENT__ABSTRACTION,
				 ActionFactory.eINSTANCE.createActionElement()));

		newChildDescriptors.add
			(createChildParameter
				(ConceptualPackage.Literals.ABSTRACT_CONCEPTUAL_ELEMENT__ABSTRACTION,
				 ActionFactory.eINSTANCE.createBlockUnit()));

		newChildDescriptors.add
			(createChildParameter
				(ConceptualPackage.Literals.ABSTRACT_CONCEPTUAL_ELEMENT__ABSTRACTION,
				 ActionFactory.eINSTANCE.createExceptionUnit()));

		newChildDescriptors.add
			(createChildParameter
				(ConceptualPackage.Literals.ABSTRACT_CONCEPTUAL_ELEMENT__ABSTRACTION,
				 ActionFactory.eINSTANCE.createTryUnit()));

		newChildDescriptors.add
			(createChildParameter
				(ConceptualPackage.Literals.ABSTRACT_CONCEPTUAL_ELEMENT__ABSTRACTION,
				 ActionFactory.eINSTANCE.createCatchUnit()));

		newChildDescriptors.add
			(createChildParameter
				(ConceptualPackage.Literals.ABSTRACT_CONCEPTUAL_ELEMENT__ABSTRACTION,
				 ActionFactory.eINSTANCE.createFinallyUnit()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return KdmEditPlugin.INSTANCE;
	}

}
