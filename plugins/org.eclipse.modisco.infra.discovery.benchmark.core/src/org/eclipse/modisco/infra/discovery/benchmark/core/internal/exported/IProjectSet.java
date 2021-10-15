/*******************************************************************************
 * Copyright (c) 2012, 2019 INRIA. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors: Guillaume Doux - INRIA - Initial API and implementation
 *
 ******************************************************************************/

package org.eclipse.modisco.infra.discovery.benchmark.core.internal.exported;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.core.resources.IProject;

/**
 * Interface for the management of project set, basically a specialization of the list interface for projects
 * @author Guillaume Doux
 *
 */
public interface IProjectSet extends List<IProject> {

	/**
	 * @see java.util.List#add(int, Object)
	 */
	public abstract void add(int arg0, IProject arg1);

	/**
	 * @see java.util.List#add(Object)
	 */
	public abstract boolean add(IProject arg0);

	/**
	 * @see java.util.List#addAll(Collection)
	 */
	public abstract boolean addAll(Collection<? extends IProject> arg0);

	/**
	 * @see java.util.List#addAll(int, Collection)
	 */
	public abstract boolean addAll(int arg0, Collection<? extends IProject> arg1);

	/**
	 * @see java.util.List#clear()
	 */
	public abstract void clear();

	/**
	 * @see java.util.List#contains(Object)
	 */
	public abstract boolean contains(Object arg0);

	/**
	 * @see java.util.List#containsAll(Collection)
	 */
	public abstract boolean containsAll(Collection<?> arg0);

	/**
	 * @see java.util.List#equals(Object)
	 */
	public abstract boolean equals(Object arg0);

	/**
	 * @see java.util.List#get(int)
	 */
	public abstract IProject get(int arg0);

	/**
	 * @see java.util.List#hashCode()
	 */
	public abstract int hashCode();

	/**
	 * @see java.util.List#indexOf(Object)
	 */
	public abstract int indexOf(Object arg0);

	/**
	 * @see java.util.List#isEmpty()
	 */
	public abstract boolean isEmpty();

	/**
	 * @see java.util.List#iterator()
	 */
	public abstract Iterator<IProject> iterator();

	/**
	 * @see java.util.List#lastIndexOf(Object)
	 */
	public abstract int lastIndexOf(Object arg0);

	/**
	 * @see java.util.List#listIterator()
	 */
	public abstract ListIterator<IProject> listIterator();

	/**
	 * @see java.util.List#listIterator(int)
	 */
	public abstract ListIterator<IProject> listIterator(int arg0);

	/**
	 * @see java.util.List#remove(int)
	 */
	public abstract IProject remove(int arg0);

	/**
	 * @see java.util.List#remove(Object)
	 */
	public abstract boolean remove(Object arg0);

	/**
	 * @see java.util.List#removeAll(Collection)
	 */
	public abstract boolean removeAll(Collection<?> arg0);

	/**
	 * @see java.util.List#retainAll(Collection)
	 */
	public abstract boolean retainAll(Collection<?> arg0);

	/**
	 * @see java.util.List#set(int, Object)
	 */
	public abstract IProject set(int arg0, IProject arg1);

	/**
	 * @see java.util.List#size()
	 */
	public abstract int size();

	/**
	 * @see java.util.List#subList(int, int)
	 */
	public abstract List<IProject> subList(int arg0, int arg1);

	/**
	 * @see java.util.List#toArray()
	 */
	public abstract Object[] toArray();

	/**
	 * @see java.util.List#toArray(Object[])
	 */
	public abstract <T> T[] toArray(T[] arg0);

	/**
	 * the set of project
	 * @return a List of IProject
	 */
	public abstract List<IProject> getProjects();

	/**
	 * sort the project and return itself.
	 * @return
	 */
	public abstract IProjectSet sortBySize();

}