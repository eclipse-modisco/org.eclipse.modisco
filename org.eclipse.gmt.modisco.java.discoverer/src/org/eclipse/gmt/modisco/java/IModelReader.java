/**
 * Copyright (c) 2009, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Fabien GIQUEL (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmt.modisco.java;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmt.modisco.java.io.java.binding.BindingManager;

/**
 * The interface for readers which build Java models.
 * <p>
 * A model reader reads a source (a Java project for example) and fill a given
 * {@link Model} object.
 * </p>
 * <p>
 * Concrete model readers should indicate which source type they can handle.
 * </p>
 * <p>
 * When using the methods {@code readModel} with no {@link BindingManager}, the reader uses 
 * a private blank one. 
 * Otherwise, the reader uses the given {@code BindingManager} to handle global references.
 * This is useful when linking readers.
 * </p>
 * <p>
 * After model creation, don't forget to call {@link #terminate()} to finish the process. 
 * This is <b>not</b> done automatically to allow to link readers. 
 * Clients shouldn't make modifications on the resulting {@code Model}.
 * </p>
 * 
 * @deprecated the whole plug-in is replaced by
 *             "org.eclipse.modisco.java.discoverer" (without the "gmt" part),
 *             cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470728
 */
@Deprecated
public interface IModelReader {
	
	/**
	 * This is a convenience method for {@link #readModel(Object, Model, BindingManager, IProgressMonitor)} 
	 * with a private blank {@code BindingManager}.
	 * @see #readModel(Object, Model, BindingManager, IProgressMonitor)
	 * @param source the source element to analyse
	 * @param model the resulting {@code Model}
	 * @param monitor a monitor to report progress
	 */
	public void readModel(Object source, Model model, IProgressMonitor monitor);
	
	/**
	 * Reads the source and fill the {@code model} object.
	 * This reader will use the given {@code BindingManager} to handle
	 * global references.
	 * <p>
	 * Readers implementing this method should throw an {@link IllegalArgumentException}
	 * if source is not analysable.
	 * </p>
	 * 
	 * @param source the source to analyse
	 * @param model the resulting {@code Model}
	 * @param globalBindings the global {@code BindingManager}
	 * @param monitor a monitor to report progress
	 * @throws IllegalArgumentException if the reader can not handle the source (for example, 
	 * 			a library reader can not analyse a compilation unit)
	 */
	public void readModel(Object source, Model model, BindingManager globalBindings, IProgressMonitor monitor);
	
	/**
	 * Finalize the creation of the model.
	 * <p>
	 * For a single source, should be called on the reader after analysis of the source.
	 * For multiple sources, should be called on any reader after analysis of all sources.
	 * </p>
	 * <p>
	 * Clients shouldn't make modifications on the resulting {@code Model}.
	 * </p>
	 * @param monitor a monitor to report progress
	 */
	public void terminate(IProgressMonitor monitor);
	
}
