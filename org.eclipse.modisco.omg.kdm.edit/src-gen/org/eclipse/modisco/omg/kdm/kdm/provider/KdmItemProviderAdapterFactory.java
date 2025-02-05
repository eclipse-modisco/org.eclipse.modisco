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
package org.eclipse.modisco.omg.kdm.kdm.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.modisco.omg.kdm.kdm.util.KdmAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class KdmItemProviderAdapterFactory extends KdmAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KdmItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.kdm.Segment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SegmentItemProvider segmentItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.kdm.Segment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSegmentAdapter() {
		if (segmentItemProvider == null) {
			segmentItemProvider = new SegmentItemProvider(this);
		}

		return segmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.kdm.Audit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuditItemProvider auditItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.kdm.Audit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAuditAdapter() {
		if (auditItemProvider == null) {
			auditItemProvider = new AuditItemProvider(this);
		}

		return auditItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.kdm.Stereotype} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StereotypeItemProvider stereotypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.kdm.Stereotype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStereotypeAdapter() {
		if (stereotypeItemProvider == null) {
			stereotypeItemProvider = new StereotypeItemProvider(this);
		}

		return stereotypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.kdm.TagDefinition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TagDefinitionItemProvider tagDefinitionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.kdm.TagDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTagDefinitionAdapter() {
		if (tagDefinitionItemProvider == null) {
			tagDefinitionItemProvider = new TagDefinitionItemProvider(this);
		}

		return tagDefinitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.kdm.ExtensionFamily} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionFamilyItemProvider extensionFamilyItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.kdm.ExtensionFamily}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExtensionFamilyAdapter() {
		if (extensionFamilyItemProvider == null) {
			extensionFamilyItemProvider = new ExtensionFamilyItemProvider(this);
		}

		return extensionFamilyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.kdm.TaggedValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaggedValueItemProvider taggedValueItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.kdm.TaggedValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaggedValueAdapter() {
		if (taggedValueItemProvider == null) {
			taggedValueItemProvider = new TaggedValueItemProvider(this);
		}

		return taggedValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.kdm.TaggedRef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaggedRefItemProvider taggedRefItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.kdm.TaggedRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaggedRefAdapter() {
		if (taggedRefItemProvider == null) {
			taggedRefItemProvider = new TaggedRefItemProvider(this);
		}

		return taggedRefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.kdm.Attribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeItemProvider attributeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.kdm.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeAdapter() {
		if (attributeItemProvider == null) {
			attributeItemProvider = new AttributeItemProvider(this);
		}

		return attributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.modisco.omg.kdm.kdm.Annotation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationItemProvider annotationItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.modisco.omg.kdm.kdm.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAnnotationAdapter() {
		if (annotationItemProvider == null) {
			annotationItemProvider = new AnnotationItemProvider(this);
		}

		return annotationItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (segmentItemProvider != null) segmentItemProvider.dispose();
		if (auditItemProvider != null) auditItemProvider.dispose();
		if (stereotypeItemProvider != null) stereotypeItemProvider.dispose();
		if (tagDefinitionItemProvider != null) tagDefinitionItemProvider.dispose();
		if (extensionFamilyItemProvider != null) extensionFamilyItemProvider.dispose();
		if (taggedValueItemProvider != null) taggedValueItemProvider.dispose();
		if (taggedRefItemProvider != null) taggedRefItemProvider.dispose();
		if (attributeItemProvider != null) attributeItemProvider.dispose();
		if (annotationItemProvider != null) annotationItemProvider.dispose();
	}

}
