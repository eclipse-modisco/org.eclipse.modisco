/**
 * *******************************************************************************
 * Copyright (c) 2008 Hatha Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nikolai Mansourov (Hatha Systems) - initial API and implementation
 * *******************************************************************************
 *
 * $Id$
 */
package org.eclipse.modisco.omg.kdm.data.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.modisco.omg.kdm.action.AbstractActionRelationship;
import org.eclipse.modisco.omg.kdm.core.Element;
import org.eclipse.modisco.omg.kdm.core.KDMEntity;
import org.eclipse.modisco.omg.kdm.core.KDMRelationship;
import org.eclipse.modisco.omg.kdm.core.ModelElement;
import org.eclipse.modisco.omg.kdm.data.AbstractContentElement;
import org.eclipse.modisco.omg.kdm.data.AbstractDataElement;
import org.eclipse.modisco.omg.kdm.data.AbstractDataRelationship;
import org.eclipse.modisco.omg.kdm.data.AllContent;
import org.eclipse.modisco.omg.kdm.data.Catalog;
import org.eclipse.modisco.omg.kdm.data.ChoiceContent;
import org.eclipse.modisco.omg.kdm.data.ColumnSet;
import org.eclipse.modisco.omg.kdm.data.ComplexContentType;
import org.eclipse.modisco.omg.kdm.data.ContentAttribute;
import org.eclipse.modisco.omg.kdm.data.ContentElement;
import org.eclipse.modisco.omg.kdm.data.ContentItem;
import org.eclipse.modisco.omg.kdm.data.ContentReference;
import org.eclipse.modisco.omg.kdm.data.ContentRestriction;
import org.eclipse.modisco.omg.kdm.data.DataAction;
import org.eclipse.modisco.omg.kdm.data.DataContainer;
import org.eclipse.modisco.omg.kdm.data.DataEvent;
import org.eclipse.modisco.omg.kdm.data.DataModel;
import org.eclipse.modisco.omg.kdm.data.DataPackage;
import org.eclipse.modisco.omg.kdm.data.DataRelationship;
import org.eclipse.modisco.omg.kdm.data.DataResource;
import org.eclipse.modisco.omg.kdm.data.DataSegment;
import org.eclipse.modisco.omg.kdm.data.DatatypeOf;
import org.eclipse.modisco.omg.kdm.data.ExtendedDataElement;
import org.eclipse.modisco.omg.kdm.data.ExtensionTo;
import org.eclipse.modisco.omg.kdm.data.GroupContent;
import org.eclipse.modisco.omg.kdm.data.HasContent;
import org.eclipse.modisco.omg.kdm.data.Index;
import org.eclipse.modisco.omg.kdm.data.IndexElement;
import org.eclipse.modisco.omg.kdm.data.KeyRelation;
import org.eclipse.modisco.omg.kdm.data.ManagesData;
import org.eclipse.modisco.omg.kdm.data.MixedContent;
import org.eclipse.modisco.omg.kdm.data.ProducesDataEvent;
import org.eclipse.modisco.omg.kdm.data.ReadsColumnSet;
import org.eclipse.modisco.omg.kdm.data.RecordFile;
import org.eclipse.modisco.omg.kdm.data.ReferenceKey;
import org.eclipse.modisco.omg.kdm.data.ReferenceTo;
import org.eclipse.modisco.omg.kdm.data.RelationalSchema;
import org.eclipse.modisco.omg.kdm.data.RelationalTable;
import org.eclipse.modisco.omg.kdm.data.RelationalView;
import org.eclipse.modisco.omg.kdm.data.RestrictionOf;
import org.eclipse.modisco.omg.kdm.data.SeqContent;
import org.eclipse.modisco.omg.kdm.data.SimpleContentType;
import org.eclipse.modisco.omg.kdm.data.TypedBy;
import org.eclipse.modisco.omg.kdm.data.UniqueKey;
import org.eclipse.modisco.omg.kdm.data.WritesColumnSet;
import org.eclipse.modisco.omg.kdm.data.XMLSchema;
import org.eclipse.modisco.omg.kdm.kdm.KDMFramework;
import org.eclipse.modisco.omg.kdm.kdm.KDMModel;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.modisco.omg.kdm.data.DataPackage
 * @generated
 */
@SuppressWarnings("all")
public class DataAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAdapterFactory() {
		if (DataAdapterFactory.modelPackage == null) {
			DataAdapterFactory.modelPackage = DataPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(final Object object) {
		if (object == DataAdapterFactory.modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == DataAdapterFactory.modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSwitch<Adapter> modelSwitch =
		new DataSwitch<Adapter>() {
			@Override
			public Adapter caseDataModel(final DataModel object) {
				return createDataModelAdapter();
			}
			@Override
			public Adapter caseAbstractDataElement(final AbstractDataElement object) {
				return createAbstractDataElementAdapter();
			}
			@Override
			public Adapter caseDataResource(final DataResource object) {
				return createDataResourceAdapter();
			}
			@Override
			public Adapter caseIndexElement(final IndexElement object) {
				return createIndexElementAdapter();
			}
			@Override
			public Adapter caseUniqueKey(final UniqueKey object) {
				return createUniqueKeyAdapter();
			}
			@Override
			public Adapter caseIndex(final Index object) {
				return createIndexAdapter();
			}
			@Override
			public Adapter caseAbstractDataRelationship(final AbstractDataRelationship object) {
				return createAbstractDataRelationshipAdapter();
			}
			@Override
			public Adapter caseKeyRelation(final KeyRelation object) {
				return createKeyRelationAdapter();
			}
			@Override
			public Adapter caseReferenceKey(final ReferenceKey object) {
				return createReferenceKeyAdapter();
			}
			@Override
			public Adapter caseDataContainer(final DataContainer object) {
				return createDataContainerAdapter();
			}
			@Override
			public Adapter caseCatalog(final Catalog object) {
				return createCatalogAdapter();
			}
			@Override
			public Adapter caseRelationalSchema(final RelationalSchema object) {
				return createRelationalSchemaAdapter();
			}
			@Override
			public Adapter caseColumnSet(final ColumnSet object) {
				return createColumnSetAdapter();
			}
			@Override
			public Adapter caseRelationalTable(final RelationalTable object) {
				return createRelationalTableAdapter();
			}
			@Override
			public Adapter caseRelationalView(final RelationalView object) {
				return createRelationalViewAdapter();
			}
			@Override
			public Adapter caseRecordFile(final RecordFile object) {
				return createRecordFileAdapter();
			}
			@Override
			public Adapter caseDataEvent(final DataEvent object) {
				return createDataEventAdapter();
			}
			@Override
			public Adapter caseXMLSchema(final XMLSchema object) {
				return createXMLSchemaAdapter();
			}
			@Override
			public Adapter caseAbstractContentElement(final AbstractContentElement object) {
				return createAbstractContentElementAdapter();
			}
			@Override
			public Adapter caseComplexContentType(final ComplexContentType object) {
				return createComplexContentTypeAdapter();
			}
			@Override
			public Adapter caseAllContent(final AllContent object) {
				return createAllContentAdapter();
			}
			@Override
			public Adapter caseSeqContent(final SeqContent object) {
				return createSeqContentAdapter();
			}
			@Override
			public Adapter caseChoiceContent(final ChoiceContent object) {
				return createChoiceContentAdapter();
			}
			@Override
			public Adapter caseContentItem(final ContentItem object) {
				return createContentItemAdapter();
			}
			@Override
			public Adapter caseGroupContent(final GroupContent object) {
				return createGroupContentAdapter();
			}
			@Override
			public Adapter caseContentRestriction(final ContentRestriction object) {
				return createContentRestrictionAdapter();
			}
			@Override
			public Adapter caseSimpleContentType(final SimpleContentType object) {
				return createSimpleContentTypeAdapter();
			}
			@Override
			public Adapter caseExtendedDataElement(final ExtendedDataElement object) {
				return createExtendedDataElementAdapter();
			}
			@Override
			public Adapter caseDataRelationship(final DataRelationship object) {
				return createDataRelationshipAdapter();
			}
			@Override
			public Adapter caseMixedContent(final MixedContent object) {
				return createMixedContentAdapter();
			}
			@Override
			public Adapter caseContentReference(final ContentReference object) {
				return createContentReferenceAdapter();
			}
			@Override
			public Adapter caseDataAction(final DataAction object) {
				return createDataActionAdapter();
			}
			@Override
			public Adapter caseReadsColumnSet(final ReadsColumnSet object) {
				return createReadsColumnSetAdapter();
			}
			@Override
			public Adapter caseContentAttribute(final ContentAttribute object) {
				return createContentAttributeAdapter();
			}
			@Override
			public Adapter caseTypedBy(final TypedBy object) {
				return createTypedByAdapter();
			}
			@Override
			public Adapter caseReferenceTo(final ReferenceTo object) {
				return createReferenceToAdapter();
			}
			@Override
			public Adapter caseRestrictionOf(final RestrictionOf object) {
				return createRestrictionOfAdapter();
			}
			@Override
			public Adapter caseExtensionTo(final ExtensionTo object) {
				return createExtensionToAdapter();
			}
			@Override
			public Adapter caseDatatypeOf(final DatatypeOf object) {
				return createDatatypeOfAdapter();
			}
			@Override
			public Adapter caseHasContent(final HasContent object) {
				return createHasContentAdapter();
			}
			@Override
			public Adapter caseWritesColumnSet(final WritesColumnSet object) {
				return createWritesColumnSetAdapter();
			}
			@Override
			public Adapter caseProducesDataEvent(final ProducesDataEvent object) {
				return createProducesDataEventAdapter();
			}
			@Override
			public Adapter caseDataSegment(final DataSegment object) {
				return createDataSegmentAdapter();
			}
			@Override
			public Adapter caseContentElement(final ContentElement object) {
				return createContentElementAdapter();
			}
			@Override
			public Adapter caseManagesData(final ManagesData object) {
				return createManagesDataAdapter();
			}
			@Override
			public Adapter caseElement(final Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseModelElement(final ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter caseKDMFramework(final KDMFramework object) {
				return createKDMFrameworkAdapter();
			}
			@Override
			public Adapter caseKDMModel(final KDMModel object) {
				return createKDMModelAdapter();
			}
			@Override
			public Adapter caseKDMEntity(final KDMEntity object) {
				return createKDMEntityAdapter();
			}
			@Override
			public Adapter caseKDMRelationship(final KDMRelationship object) {
				return createKDMRelationshipAdapter();
			}
			@Override
			public Adapter caseAbstractActionRelationship(final AbstractActionRelationship object) {
				return createAbstractActionRelationshipAdapter();
			}
			@Override
			public Adapter defaultCase(final EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(final Notifier target) {
		return this.modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.DataModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.DataModel
	 * @generated
	 */
	public Adapter createDataModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.AbstractDataElement <em>Abstract Data Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.AbstractDataElement
	 * @generated
	 */
	public Adapter createAbstractDataElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.DataResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.DataResource
	 * @generated
	 */
	public Adapter createDataResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.IndexElement <em>Index Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.IndexElement
	 * @generated
	 */
	public Adapter createIndexElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.UniqueKey <em>Unique Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.UniqueKey
	 * @generated
	 */
	public Adapter createUniqueKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.Index <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.Index
	 * @generated
	 */
	public Adapter createIndexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.AbstractDataRelationship <em>Abstract Data Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.AbstractDataRelationship
	 * @generated
	 */
	public Adapter createAbstractDataRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.KeyRelation <em>Key Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.KeyRelation
	 * @generated
	 */
	public Adapter createKeyRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.ReferenceKey <em>Reference Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.ReferenceKey
	 * @generated
	 */
	public Adapter createReferenceKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.DataContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.DataContainer
	 * @generated
	 */
	public Adapter createDataContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.Catalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.Catalog
	 * @generated
	 */
	public Adapter createCatalogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.RelationalSchema <em>Relational Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.RelationalSchema
	 * @generated
	 */
	public Adapter createRelationalSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.ColumnSet <em>Column Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.ColumnSet
	 * @generated
	 */
	public Adapter createColumnSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.RelationalTable <em>Relational Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.RelationalTable
	 * @generated
	 */
	public Adapter createRelationalTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.RelationalView <em>Relational View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.RelationalView
	 * @generated
	 */
	public Adapter createRelationalViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.RecordFile <em>Record File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.RecordFile
	 * @generated
	 */
	public Adapter createRecordFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.DataEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.DataEvent
	 * @generated
	 */
	public Adapter createDataEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.XMLSchema <em>XML Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.XMLSchema
	 * @generated
	 */
	public Adapter createXMLSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.AbstractContentElement <em>Abstract Content Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.AbstractContentElement
	 * @generated
	 */
	public Adapter createAbstractContentElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.ComplexContentType <em>Complex Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.ComplexContentType
	 * @generated
	 */
	public Adapter createComplexContentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.AllContent <em>All Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.AllContent
	 * @generated
	 */
	public Adapter createAllContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.SeqContent <em>Seq Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.SeqContent
	 * @generated
	 */
	public Adapter createSeqContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.ChoiceContent <em>Choice Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.ChoiceContent
	 * @generated
	 */
	public Adapter createChoiceContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.ContentItem <em>Content Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.ContentItem
	 * @generated
	 */
	public Adapter createContentItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.GroupContent <em>Group Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.GroupContent
	 * @generated
	 */
	public Adapter createGroupContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.ContentRestriction <em>Content Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.ContentRestriction
	 * @generated
	 */
	public Adapter createContentRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.SimpleContentType <em>Simple Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.SimpleContentType
	 * @generated
	 */
	public Adapter createSimpleContentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.ExtendedDataElement <em>Extended Data Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.ExtendedDataElement
	 * @generated
	 */
	public Adapter createExtendedDataElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.DataRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.DataRelationship
	 * @generated
	 */
	public Adapter createDataRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.MixedContent <em>Mixed Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.MixedContent
	 * @generated
	 */
	public Adapter createMixedContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.ContentReference <em>Content Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.ContentReference
	 * @generated
	 */
	public Adapter createContentReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.DataAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.DataAction
	 * @generated
	 */
	public Adapter createDataActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.ReadsColumnSet <em>Reads Column Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.ReadsColumnSet
	 * @generated
	 */
	public Adapter createReadsColumnSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.ContentAttribute <em>Content Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.ContentAttribute
	 * @generated
	 */
	public Adapter createContentAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.TypedBy <em>Typed By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.TypedBy
	 * @generated
	 */
	public Adapter createTypedByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.ReferenceTo <em>Reference To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.ReferenceTo
	 * @generated
	 */
	public Adapter createReferenceToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.RestrictionOf <em>Restriction Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.RestrictionOf
	 * @generated
	 */
	public Adapter createRestrictionOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.ExtensionTo <em>Extension To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.ExtensionTo
	 * @generated
	 */
	public Adapter createExtensionToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.DatatypeOf <em>Datatype Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.DatatypeOf
	 * @generated
	 */
	public Adapter createDatatypeOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.HasContent <em>Has Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.HasContent
	 * @generated
	 */
	public Adapter createHasContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.WritesColumnSet <em>Writes Column Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.WritesColumnSet
	 * @generated
	 */
	public Adapter createWritesColumnSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.ProducesDataEvent <em>Produces Data Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.ProducesDataEvent
	 * @generated
	 */
	public Adapter createProducesDataEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.DataSegment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.DataSegment
	 * @generated
	 */
	public Adapter createDataSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.ContentElement <em>Content Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.ContentElement
	 * @generated
	 */
	public Adapter createContentElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.data.ManagesData <em>Manages Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.data.ManagesData
	 * @generated
	 */
	public Adapter createManagesDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.core.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.core.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.core.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.core.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.kdm.KDMFramework <em>KDM Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.kdm.KDMFramework
	 * @generated
	 */
	public Adapter createKDMFrameworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.kdm.KDMModel <em>KDM Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.kdm.KDMModel
	 * @generated
	 */
	public Adapter createKDMModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.core.KDMEntity <em>KDM Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.core.KDMEntity
	 * @generated
	 */
	public Adapter createKDMEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.core.KDMRelationship <em>KDM Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.core.KDMRelationship
	 * @generated
	 */
	public Adapter createKDMRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.modisco.omg.kdm.action.AbstractActionRelationship <em>Abstract Action Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.modisco.omg.kdm.action.AbstractActionRelationship
	 * @generated
	 */
	public Adapter createAbstractActionRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DataAdapterFactory
