/*******************************************************************************
 * Copyright (c) 2012 INRIA. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors: Guillaume Doux - INRIA - Initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.modisco.infra.discovery.benchmark.core.internal.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.modisco.infra.discovery.benchmark.core.internal.exported.IDiscovererList;
import org.eclipse.modisco.infra.discovery.benchmark.metamodel.internal.benchmark.Discovery;

/**
 * Discoverer list implementation, basically delegation of the list interface methods
 * @see IDiscovererList
 * @author Guillaume Doux
 *
 */
public class DiscovererList implements IDiscovererList {


	private List<Discovery> discoverers;

	public DiscovererList() {
		super();
		this.discoverers = new LinkedList<Discovery>();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		if ((this.discoverers != null) && (!this.discoverers.isEmpty())) {
			if (this.discoverers.size() == 1) {
				sb.append(this.discoverers.get(0).getDiscovererId());
			} else {
			sb.append(this.discoverers.get(0).getDiscovererId() + " and " + String.valueOf(this.discoverers.size() - 1) + " more...");
			}
		}
		return sb.toString();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.api.IDiscovererList#getDiscoverers()
	 */
	public List<Discovery> getDiscoverers() {
		return this.discoverers;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.api.IDiscovererList#add(int, org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer)
	 */
	public void add(final int index, final Discovery element) {
		this.discoverers.add(index, element);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.api.IDiscovererList#add(org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer)
	 */
	public boolean add(final Discovery e) {
		return this.discoverers.add(e);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.api.IDiscovererList#addAll(java.util.Collection)
	 */
	public boolean addAll(final Collection<? extends Discovery> c) {
		return this.discoverers.addAll(c);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.api.IDiscovererList#addAll(int, java.util.Collection)
	 */
	public boolean addAll(final int index, final Collection<? extends Discovery> c) {
		return this.discoverers.addAll(index, c);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.api.IDiscovererList#clear()
	 */
	public void clear() {
		this.discoverers.clear();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.api.IDiscovererList#contains(java.lang.Object)
	 */
	public boolean contains(final Object o) {
		return this.discoverers.contains(o);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.api.IDiscovererList#containsAll(java.util.Collection)
	 */
	public boolean containsAll(final Collection<?> c) {
		return this.discoverers.containsAll(c);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.api.IDiscovererList#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object o) {
		return this.discoverers.equals(o);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.api.IDiscovererList#get(int)
	 */
	public Discovery get(final int index) {
		return this.discoverers.get(index);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.api.IDiscovererList#hashCode()
	 */
	@Override
	public int hashCode() {
		return this.discoverers.hashCode();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.api.IDiscovererList#indexOf(java.lang.Object)
	 */
	public int indexOf(final Object o) {
		return this.discoverers.indexOf(o);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.api.IDiscovererList#isEmpty()
	 */
	public boolean isEmpty() {
		return this.discoverers.isEmpty();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.api.IDiscovererList#iterator()
	 */
	public Iterator<Discovery> iterator() {
		return this.discoverers.iterator();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.api.IDiscovererList#lastIndexOf(java.lang.Object)
	 */
	public int lastIndexOf(final Object o) {
		return this.discoverers.lastIndexOf(o);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.api.IDiscovererList#listIterator()
	 */
	public ListIterator<Discovery> listIterator() {
		return this.discoverers.listIterator();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.api.IDiscovererList#listIterator(int)
	 */
	public ListIterator<Discovery> listIterator(final int index) {
		return this.discoverers.listIterator(index);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.api.IDiscovererList#remove(int)
	 */
	public Discovery remove(final int index) {
		return this.discoverers.remove(index);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.api.IDiscovererList#remove(java.lang.Object)
	 */
	public boolean remove(final Object o) {
		return this.discoverers.remove(o);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.api.IDiscovererList#removeAll(java.util.Collection)
	 */
	public boolean removeAll(final Collection<?> c) {
		return this.discoverers.removeAll(c);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.api.IDiscovererList#retainAll(java.util.Collection)
	 */
	public boolean retainAll(final Collection<?> c) {
		return this.discoverers.retainAll(c);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.api.IDiscovererList#set(int, org.eclipse.modisco.infra.discovery.core.AbstractModelDiscoverer)
	 */
	public Discovery set(final int index, final Discovery element) {
		return this.discoverers.set(index, element);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.api.IDiscovererList#size()
	 */
	public int size() {
		return this.discoverers.size();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.api.IDiscovererList#subList(int, int)
	 */
	public List<Discovery> subList(final int fromIndex, final int toIndex) {
		return this.discoverers.subList(fromIndex, toIndex);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.api.IDiscovererList#toArray()
	 */
	public Object[] toArray() {
		return this.discoverers.toArray();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.modisco.infra.discovery.benchmark.api.IDiscovererList#toArray(T[])
	 */
	public <T> T[] toArray(final T[] a) {
		return this.discoverers.toArray(a);
	}



}
