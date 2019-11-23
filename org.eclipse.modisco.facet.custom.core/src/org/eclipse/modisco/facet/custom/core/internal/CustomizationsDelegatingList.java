/*******************************************************************************
 * Copyright (c) 2012, 2015 CEA LIST, Soft-Maint and Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Nicolas Bros (Mia-Software) - Bug 374758 - [Table] repair the table
 *    Gregoire Dupe (Mia-Software) - Bug 372626 - Aggregates
 *    Thomas Cicognani (Soft-Maint) - Bug 420192 - UnsupportedOperationException in a usefull method 
 *    Thomas Cicognani (Soft-Maint) - Bug 435882 - org.eclipse.modisco.facet.custom.core.internal.CustomizationsDelegatingList not fully implemented
 *    Thomas Cicognani (Soft-Maint) - Bug 441317 - Clearing a CustomizationsDelegatingList doesn't notify listeners
 *    Grégoire Dupé (Mia-Software) - Bug 476141 - Facet manger can fail with ConcurrentModificationException
 *******************************************************************************/
package org.eclipse.modisco.facet.custom.core.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.modisco.facet.custom.metamodel.v0_2_0.custom.Customization;
import org.eclipse.modisco.facet.efacet.metamodel.v0_2_0.efacet.FacetSet;

/** Represents a list of {@link Customization}s that exists as a subset of a delegate list of {@link FacetSet}s. */
public class CustomizationsDelegatingList implements List<Customization> {
	private final List<FacetSet> delegate;

	public CustomizationsDelegatingList(final List<FacetSet> delegate) {
		this.delegate = delegate;
	}

	private List<Customization> createSubList() {
		final List<Customization> customizations = new ArrayList<Customization>(this.delegate.size());
		for (FacetSet facetSet : this.delegate) {
			if (facetSet instanceof Customization) {
				final Customization customization = (Customization) facetSet;
				customizations.add(customization);
			}
		}
		return customizations;
	}
	
	private static void throwOutOfBoundException(final int index, final int customIndex) {
		final String message = String.format("Index: %d, Size: %d", //$NON-NLS-1$
				Integer.valueOf(index), Integer.valueOf(customIndex));
		throw new IndexOutOfBoundsException(message);
	}

	public int size() {
		return this.createSubList().size();
	}

	public boolean isEmpty() {
		return this.createSubList().isEmpty();
	}

	public boolean contains(final Object element) {
		return element instanceof Customization && this.delegate.contains(element);
	}

	public Iterator<Customization> iterator() {
		final List<Customization> customizations = createSubList();
		return customizations.iterator();
	}


	public Object[] toArray() {
		return createSubList().toArray();
	}

	public <T> T[] toArray(final T[] array) {
		return createSubList().toArray(array);
	}

	public boolean add(final Customization customization) {
		return this.delegate.add(customization);
	}

	public boolean remove(final Object element) {
		return this.delegate.remove(element);
	}

	public boolean containsAll(final Collection<?> collection) {
		return createSubList().containsAll(collection);
	}

	public boolean addAll(final Collection<? extends Customization> collection) {
		return this.delegate.addAll(collection);
	}

	public boolean addAll(final int index,
			final Collection<? extends Customization> collection) {
		boolean addAllDone = false;
		int customIndex = 0;
		for (int i = 0; i < this.delegate.size(); i++) {
			final FacetSet facetSet = this.delegate.get(i);
			if (facetSet instanceof Customization) {
				if (customIndex == index) {
					addAllDone = true;
					this.delegate.addAll(i, collection);
					break;
				}
				customIndex++;
			}
		}
		return addAllDone;
	}

	public boolean removeAll(final Collection<?> collection) {
		return this.delegate.removeAll(collection);
	}

	public boolean retainAll(final Collection<?> collection) {
		boolean modified = false;
		final Iterator<FacetSet> iterator = this.delegate.iterator();
		while (iterator.hasNext()) {
			final FacetSet next = iterator.next();
			if (next instanceof Customization && !collection.contains(next)) {
				this.delegate.remove(next);
				modified = true;
			}
		}
		return modified;
	}

	public void clear() {
		final List<Customization> customToClear = new ArrayList<Customization>();
		final Iterator<FacetSet> iterator = this.delegate.iterator();
		while (iterator.hasNext()) {
			final FacetSet facetSet = iterator.next();
			if (facetSet instanceof Customization) {
				customToClear.add((Customization) facetSet);
			}
		}
		this.delegate.removeAll(customToClear);
	}

	public Customization get(final int index) {
		Customization getValue = null;
		int customIndex = 0;
		for (FacetSet facetSet : this.delegate) {
			if (facetSet instanceof Customization) {
				if (customIndex == index) {
					getValue = (Customization) facetSet;
					break;
				}
				customIndex++;
			}
		}
		if (getValue == null) {
			throwOutOfBoundException(index, customIndex);
		}
		return getValue;
	}

	public Customization set(final int index, final Customization element) {
		Customization oldValue = null;
		int customIndex = 0;
		for (int i = 0; i < this.delegate.size(); i++) {
			final FacetSet facetSet = this.delegate.get(i);
			if (facetSet instanceof Customization) {
				if (customIndex == index) {
					oldValue = (Customization) facetSet;
					this.delegate.set(i, element);
					break;
				}
				customIndex++;
			}
		}
		if (oldValue == null) {
			throwOutOfBoundException(index, customIndex);
		}
		return oldValue;
	}

	public void add(final int index, final Customization element) {
		Customization movedFacet = null;
		int customIndex = 0;
		if (index == 0) {
			this.delegate.add(0, element);
		} else {
			for (int i = 0; i < this.delegate.size(); i++) {
				final FacetSet facetSet = this.delegate.get(i);
				if (facetSet instanceof Customization) {
					if (customIndex == index) {
						movedFacet = (Customization) facetSet;
						this.delegate.add(i, element);
						break;
					}
					customIndex++;
				}
			}
			if (movedFacet == null) {
				throwOutOfBoundException(index, customIndex);
			}
		}
	}

	public Customization remove(final int index) {
		Customization removedCustom = null;
		int customIndex = 0;
		for (int i = 0; i < this.delegate.size(); i++) {
			final FacetSet facetSet = this.delegate.get(i);
			if (facetSet instanceof Customization) {
				if (customIndex == index) {
					removedCustom = (Customization) facetSet;
					this.delegate.remove(i);
					break;
				}
				customIndex++;
			}
		}
		if (removedCustom == null) {
			throwOutOfBoundException(index, customIndex);
		}
		return removedCustom;
	}

	public int indexOf(final Object element) {
		int indexOfElement = -1;
		int customIndex = 0;
		for (FacetSet facetSet : this.delegate) {
			if (facetSet instanceof Customization) {
				if (facetSet.equals(element)) {
					indexOfElement = customIndex;
					break;
				}
				customIndex++;
			}
		}
		return indexOfElement;
	}

	public int lastIndexOf(final Object element) {
		return createSubList().lastIndexOf(element);
	}

	public ListIterator<Customization> listIterator() {
		return this.createSubList().listIterator();
	}

	public ListIterator<Customization> listIterator(final int index) {
		return createSubList().listIterator(index);
	}

	public List<Customization> subList(final int fromIndex, final int toIndex) {
		final List<Customization> subList = new ArrayList<Customization>();
		int customIndex = 0;
		for (FacetSet facetSet : this.delegate) {
			if (facetSet instanceof Customization) {
				if (customIndex >= fromIndex && customIndex < toIndex) {
					subList.add((Customization) facetSet);
				} else if (customIndex >= toIndex) {
					break;
				}
				customIndex++;
			}
		}
		return subList;
	}
}
