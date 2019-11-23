/*******************************************************************************
 * Copyright (c) 2009, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software) - initial API and implementation
 *******************************************************************************/
package org.eclipse.modisco.infra.query.editor.presentation;

import java.util.Arrays;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.presentation.EcoreEditorPlugin;
import org.eclipse.emf.ecore.provider.EcoreEditPlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.ui.action.LoadResourceAction;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.modisco.infra.common.ui.internal.util.AnywhereFilterMatcher;
import org.eclipse.modisco.infra.query.editor.Messages;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * @author gdupe
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class LoadMetaModelResourceAction extends LoadResourceAction {

	public LoadMetaModelResourceAction() {
		super();
		setText(Messages.LoadMetaModelResourceAction_0);
	}

	@Override
	public void run() {
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getShell();

		RegisteredPackageDialog registeredPackageDialog = new RegisteredPackageDialog(
				shell);
		registeredPackageDialog.open();
		Object[] results = registeredPackageDialog.getResult();
		ResourceSet resourceSet = this.domain.getResourceSet();
		for (Object result : results) {
			URI uri = URI.createURI(result.toString());
			Resource r = resourceSet.getResource(uri, true);
			if (!resourceSet.getResources().contains(r))
	        {
	          Registry packageRegistry = resourceSet.getPackageRegistry();
	          for (EObject eObject : r.getContents())
	          {
	        	if (eObject instanceof EPackage) {
					EPackage ePackage = (EPackage) eObject;
		            packageRegistry.put(ePackage.getNsURI(), ePackage);
				}
	          }
	          resourceSet.getResources().add(r);
	        }
		}
	}
	
	public class RegisteredPackageDialog extends ElementListSelectionDialog {

		public RegisteredPackageDialog(Shell parent) {
			super(parent, new LabelProvider() {
				@Override
				public Image getImage(Object element) {
					return ExtendedImageRegistry.getInstance().getImage(
							EcoreEditPlugin.INSTANCE
									.getImage("full/obj16/EPackage")); //$NON-NLS-1$
				}
			});

			setMultipleSelection(true);
			setMessage(EcoreEditorPlugin.INSTANCE
					.getString("_UI_SelectRegisteredPackageURI")); //$NON-NLS-1$
			setTitle(EcoreEditorPlugin.INSTANCE
					.getString("_UI_PackageSelection_label")); //$NON-NLS-1$
			Object[] result = EPackage.Registry.INSTANCE.keySet().toArray(
					new Object[EPackage.Registry.INSTANCE.size()]);
			Arrays.sort(result);
			setElements(result);
		}
		
		@Override
		protected Control createDialogArea(final Composite parent) {
			Composite composite = (Composite) super.createDialogArea(parent);
			this.fFilteredList.setFilterMatcher(new AnywhereFilterMatcher());
			return composite;
		}
	}

}
