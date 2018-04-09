/*******************************************************************************
 * Copyright (c) 2011 INRIA. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: Guillaume Doux - INRIA - Initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.modisco.infra.discovery.benchmark.core.internal.exported;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery;

/**
 * Interface for Discoverer List operations, basically a specialization of the list interface for discoverers
 * @author Guillaume Doux
 *
 */
public interface IDiscovererList extends List<Discovery> {

	/**
	 * Return the list of Discovery elements
	 * @return the list
	 */
	public List<Discovery> getDiscoverers();

	/**
	 * @see java.util.List#add(int, Object)
	 */
	public void add(int index, Discovery element);

	/**
	 * @see java.util.List#add(Object)
	 */
	public boolean add(Discovery e);

	/**
	 * @see java.util.List#addAll(Collection)
	 */
	public boolean addAll(Collection<? extends Discovery> c);

	/**
	 * @see java.util.List#addAll(int, Collection)
	 */
	public boolean addAll(int index, Collection<? extends Discovery> c);

	/**
	 * @see java.util.List#clear()
	 */
	public void clear();

	/**
	 * @see java.util.List#contains(Object)
	 */
	public boolean contains(Object o);

	/**
	 * @see java.util.List#containsAll(Collection)
	 */
	public boolean containsAll(Collection<?> c);

	/**
	 * @see java.util.List#equals(Object)
	 */
	public boolean equals(Object o);

	/**
	 * @see java.util.List#get(int)
	 */
	public Discovery get(int index);

	/**
	 * @see java.util.List#hashCode()
	 */
	public int hashCode();

	/**
	 * @see java.util.List#indexOf(Object)
	 */
	public int indexOf(Object o);

	/**
	 * @see java.util.List#isEmpty()
	 */
	public boolean isEmpty();

	/**
	 * @see java.util.List#iterator()
	 */
	public Iterator<Discovery> iterator();

	/**
	 * @see java.util.List#lastIndexOf(Object)
	 */
	public int lastIndexOf(Object o);

	/**
	 * @see java.util.List#listIterator()
	 */
	public ListIterator<Discovery> listIterator();

	/**
	 * @see java.util.List#listIterator(int)
	 */
	public ListIterator<Discovery> listIterator(
			int index);

	/**
	 * @see java.util.List#remove(int)
	 */
	public Discovery remove(int index);

	/**
	 * @see java.util.List#remove(Object)
	 */
	public boolean remove(Object o);

	/**
	 * @see java.util.List#removeAll(Collection)
	 */
	public boolean removeAll(Collection<?> c);

	/**
	 * @see java.util.List#retainAll(Collection)
	 */
	public boolean retainAll(Collection<?> c);

	/**
	 * @see java.util.List#set(int, Object)
	 */
	public Discovery set(int index,
			Discovery element);

	/**
	 * @see java.util.List#size()
	 */
	public int size();

	/**
	 * @see java.util.List#subList(int, int)
	 */
	public List<Discovery> subList(int fromIndex, int toIndex);

	/**
	 * @see java.util.List#toArray()
	 */
	public Object[] toArray();

	/**
	 * @see java.util.List#toArray(Object[])
	 */
	public <T> T[] toArray(T[] a);

	/**
	 * @see java.util.List#toString()
	 */
	public String toString();

}