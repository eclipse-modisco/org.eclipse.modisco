/*******************************************************************************
 * Copyright (c) 2010, 2019 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Gregoire DUPE (Mia-Software)
 *     Nicolas Bros (Mia-Software)
 *     Nicolas Guyomar (Mia-Software) - Bug 344243 - illegal API use in org.eclipse.modisco.infra.query.ui.wizards.NewQueryClassWizardPage
 *******************************************************************************/
package org.eclipse.modisco.infra.query.ui.wizards;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.jar.Manifest;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.modisco.infra.common.core.internal.utils.ProjectUtils;
import org.eclipse.modisco.infra.common.core.internal.utils.StringUtils;
import org.eclipse.modisco.facet.util.core.Logger;
import org.eclipse.modisco.infra.query.JavaModelQuery;
import org.eclipse.modisco.infra.query.ModelQuery;
import org.eclipse.modisco.infra.query.ModelQuerySet;
import org.eclipse.modisco.infra.query.QueryPackage;
import org.eclipse.modisco.infra.query.core.ModelQuerySetCatalog;
import org.eclipse.modisco.infra.query.core.internal.utils.QueryUtils;
import org.eclipse.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.modisco.infra.query.ui.Activator;
import org.eclipse.modisco.infra.query.ui.Messages;
import org.eclipse.modisco.infra.query.ui.extensions.IQueryAttributesWizardPage;
import org.eclipse.osgi.util.ManifestElement;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

/**
 * @deprecated replaced by EMF Facet, cf. https://bugs.eclipse.org/bugs/show_bug.cgi?id=470578
 */
@Deprecated
public class NewQueryClassWizardPage extends NewClassWizardPage implements
		IQueryAttributesWizardPage {

	private final EditingDomain editingDomain;

	/**
	 * @param editingDomain
	 *            the editing domain to use to edit the query (may be
	 *            <code>null</code>)
	 */
	public NewQueryClassWizardPage(final EditingDomain editingDomain) {
		this.editingDomain = editingDomain;
	}

	public void init(final ModelQuerySet modelQuerySet, final ModelQuery modelQuery) {
		IJavaProject javaProject = findJavaProject(modelQuerySet);

		List<String> interfaceList = new ArrayList<String>();
		interfaceList.add(IJavaModelQuery.class.getName());
		setSuperInterfaces(interfaceList, false);

		JavaModelQuery javaModelQuery = (JavaModelQuery) modelQuery;
		if (javaModelQuery != null) {
			// default package
			String packageName = ""; //$NON-NLS-1$
			String implementationClassName = javaModelQuery.getImplementationClassName();
			if (implementationClassName != null) {
				int lastDotPos = implementationClassName.lastIndexOf('.');
				String name = implementationClassName.substring(lastDotPos + 1);
				setTypeName(name, true);

				if (lastDotPos != -1) {
					packageName = implementationClassName.substring(0, lastDotPos);
				}
			} else {
				packageName = ProjectUtils.packageName(javaProject.getProject().getName());
			}
			selectPackage(javaProject, packageName);
			if (implementationClassName == null || implementationClassName.trim().length() == 0) {
				String name = javaModelQuery.getName();
				if (name != null) {
					String javaName = StringUtils.inferJavaClassName(name);
					setTypeName(javaName, true);
				}
			}
		} else {
			String packageName = ProjectUtils.packageName(javaProject.getProject().getName());
			selectPackage(javaProject, packageName);
		}

		setModifiers(this.F_PUBLIC, false);
		setSuperClass("", false); //$NON-NLS-1$
		setEnclosingTypeSelection(false, false);
		setAddComments(false, false);
	}

	private void selectPackage(final IJavaProject javaProject, final String packageName) {
		try {
			for (IPackageFragmentRoot packageFragmentRootToTest : javaProject
					.getPackageFragmentRoots()) {
				if (packageFragmentRootToTest.getKind() == IPackageFragmentRoot.K_SOURCE) {
					IPackageFragmentRoot packageFragmentRoot = packageFragmentRootToTest;
					setPackageFragmentRoot(packageFragmentRoot, false);
					IPackageFragment packageFragment = packageFragmentRoot
							.getPackageFragment(packageName);
					setPackageFragment(packageFragment, true);
					break;
				}
			}
		} catch (JavaModelException e1) {
			Logger.logError(e1, Activator.getDefault());
		}
	}

	private IJavaProject findJavaProject(final ModelQuerySet modelQuerySet) {
		Resource resource = modelQuerySet.eResource();
		URI uri = resource.getURI();
		if ("modisco".equals(uri.scheme())) { //$NON-NLS-1$
			uri = ModelQuerySetCatalog.getSingleton().getURI(modelQuerySet.getName());
		}
		if (uri.isPlatformResource()) {
			String projectName = uri.segment(1);
			IWorkspace ws = ResourcesPlugin.getWorkspace();
			IProject project = ws.getRoot().getProject(projectName);
			return JavaCore.create(project);
		}
		return null;
	}

	public void apply(final ModelQuery modelQuery) {
		try {
			ICompilationUnit javaClass = createJavaClass(modelQuery);
			IProject project = javaClass.getCorrespondingResource().getProject();
			setupProject(project, modelQuery);
			// createType(new NullProgressMonitor());
			JavaModelQuery javaModelQuery = (JavaModelQuery) modelQuery;
			final String implementationClassName = javaClass.getAllTypes()[0]
					.getFullyQualifiedName();
			if (this.editingDomain != null) {
				Command command = SetCommand.create(this.editingDomain, javaModelQuery,
						QueryPackage.Literals.JAVA_MODEL_QUERY__IMPLEMENTATION_CLASS_NAME,
						implementationClassName);
				this.editingDomain.getCommandStack().execute(command);
			} else {
				javaModelQuery.setImplementationClassName(implementationClassName);
			}

			IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
					.getActivePage();
			IDE.openEditor(activePage, (IFile) javaClass.getResource());

		} catch (Exception e) {
			Logger.logError(e, Activator.getDefault());
			MessageDialog.openError(getShell(),
					Messages.NewClassCreationWizard_failedToCreateJavaClass,
					Messages.NewClassCreationWizard_failedToCreateJavaModelQueryClass);
		}
	}

	/**
	 * Setup the given project's Manifest so that metamodels referenced by the
	 * query are available on the classpath.
	 */
	private void setupProject(final IProject project, final ModelQuery modelQuery) {
		try {
			String[] requiredBundles = findRequiredBundles(modelQuery);
			// start with all and then remove those already present
			List<String> missingRequiredBundles = new ArrayList<String>();
			for (String requiredBundle : requiredBundles) {
				missingRequiredBundles.add(requiredBundle);
			}
			missingRequiredBundles.add("org.eclipse.modisco.infra.query.core"); //$NON-NLS-1$

			IFile manifestResource = (IFile) project.findMember(new Path("/META-INF/MANIFEST.MF")); //$NON-NLS-1$
			manifestResource.refreshLocal(IResource.DEPTH_ONE, new NullProgressMonitor());
			InputStream contents = manifestResource.getContents();
			Manifest manifest = new Manifest(contents);
			String requires = manifest.getMainAttributes().getValue("Require-Bundle"); //$NON-NLS-1$
			if (requires != null) {
				ManifestElement[] manifestElements = ManifestElement.parseHeader(
						"Require-Bundle", requires); //$NON-NLS-1$
				for (ManifestElement manifestElement : manifestElements) {
					// make sure it won't be duplicated
					missingRequiredBundles.remove(manifestElement.getValue());
				}
			}

			StringBuilder newRequires = new StringBuilder();
			if (requires != null) {
				newRequires.append(requires);
			}
			for (int i = 0; i < missingRequiredBundles.size(); i++) {
				String missingRequiredBundle = missingRequiredBundles.get(i);
				if (i != 0 || requires != null) {
					newRequires.append(","); //$NON-NLS-1$
				}
				newRequires.append(missingRequiredBundle);
			}

			manifest.getMainAttributes().putValue("Require-Bundle", newRequires.toString()); //$NON-NLS-1$

			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			manifest.write(outputStream);
			ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(
					outputStream.toByteArray());
			manifestResource.setContents(byteArrayInputStream, true, true,
					new NullProgressMonitor());
		} catch (Exception e) {
			Logger.logError(e, Activator.getDefault());
		}
	}

	/**
	 * Find the bundles containing the implementations of the metamodels
	 * referenced by the given query.
	 */
	private String[] findRequiredBundles(final ModelQuery modelQuery) {
		Set<String> requiredBundles = new HashSet<String>();
		Set<EPackage> requiredEPackages = new HashSet<EPackage>();
		if (modelQuery.getReturnType() != null) {
			requiredEPackages.add(modelQuery.getReturnType().getEPackage());
		}
		EList<EClass> scope = modelQuery.getScope();
		if (scope != null) {
			for (EClass scopeElement : scope) {
				requiredEPackages.add(scopeElement.getEPackage());
			}
		}

		Map<String, URI> genModelLocationMap = EcorePlugin.getEPackageNsURIToGenModelLocationMap();

		for (EPackage ePackage : requiredEPackages) {
			try {
				URI genModelURI = genModelLocationMap.get(ePackage.getNsURI());
				if (genModelURI != null) {
					ResourceSet resourceSet = new ResourceSetImpl();
					Resource resource = resourceSet.createResource(genModelURI);
					resource.load(Collections.emptyMap());
					GenModel genModel = (GenModel) resource.getContents().get(0);
					String modelPluginID = genModel.getModelPluginID();
					if (modelPluginID != null) {
						requiredBundles.add(modelPluginID);
					}
				} else {
					Logger.logWarning("Couldn't add the metamodel implementation plug-in" //$NON-NLS-1$
							+ " to the dependencies automatically because" //$NON-NLS-1$
							+ " the corresponding genmodel couldn't be found: " //$NON-NLS-1$
							+ ePackage.getNsURI(), Activator.getDefault());
				}
			} catch (Exception e) {
				Logger.logError(e, Activator.getDefault());
			}
		}
		return requiredBundles.toArray(new String[requiredBundles.size()]);
	}

	private ICompilationUnit createJavaClass(final ModelQuery modelQuery) throws JavaModelException {
		IPackageFragmentRoot root = getPackageFragmentRoot();
		IPackageFragment packageFragment = getPackageFragment();
		if (packageFragment == null) {
			packageFragment = root.getPackageFragment(""); //$NON-NLS-1$
		}

		String packageName = packageFragment.getElementName();
		if (!packageFragment.exists()) {
			packageFragment = root.createPackageFragment(packageName, true,
					new NullProgressMonitor());
		}

		String typeName = getTypeName();

		StringBuilder contents = new StringBuilder();
		createJavaClassContents(contents, typeName, packageName, modelQuery);

		String cuName = getCompilationUnitName(typeName);
		ICompilationUnit compilationUnit = packageFragment.createCompilationUnit(cuName,
				contents.toString(), false, new NullProgressMonitor());

		return compilationUnit;
	}

	private void createJavaClassContents(final StringBuilder contents, final String name,
			final String packageName, final ModelQuery modelQuery) {
		if (packageName.length() > 0) {
			contents.append("package "); //$NON-NLS-1$
			contents.append(packageName);
			contents.append(";\n"); //$NON-NLS-1$
		}
		boolean importCollection = false;

		EClassifier returnTypeClass = modelQuery.getReturnType();
		String returnType = null;
		String shortReturnType = null;
		if (returnTypeClass != null) {
			returnType = returnTypeClass.getInstanceClassName();
			if (returnType != null) {
				returnType = QueryUtils.objectType(returnType);
				int lastDotPos = returnType.lastIndexOf('.');
				if (modelQuery.getUpperBound() != 1) {
					importCollection = true;
					shortReturnType = "Collection<" + returnType.substring(lastDotPos + 1) + ">"; //$NON-NLS-1$//$NON-NLS-2$
				} else {
					shortReturnType = returnType.substring(lastDotPos + 1);
				}
			}
		}
		if (returnType == null) {
			returnType = "java.lang.Object"; //$NON-NLS-1$
			shortReturnType = "Object"; //$NON-NLS-1$
		}

		EList<EClass> scope = modelQuery.getScope();
		String scopeType = null;
		String shortScopeType = null;
		if (scope != null && scope.size() == 1) {
			EClass scopeClass = scope.get(0);
			scopeType = scopeClass.getInstanceClassName();
			if (scopeType != null) {
				scopeType = QueryUtils.objectType(scopeType);
				shortScopeType = scopeType.substring(scopeType.lastIndexOf('.') + 1);
			}
		}
		if (scopeType == null) {
			scopeType = "org.eclipse.emf.ecore.EObject"; //$NON-NLS-1$
			shortScopeType = "EObject"; //$NON-NLS-1$
		}

		if (importCollection) {
			contents.append("import java.util.Collection;\n"); //$NON-NLS-1$
		}
		if (mustImport(returnType)) {
			contents.append("import " + returnType + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
		}
		if (!returnType.equals(scopeType) && mustImport(scopeType)) {
			contents.append("import " + scopeType + ";\n"); //$NON-NLS-1$ //$NON-NLS-2$
		}
		contents.append("import org.eclipse.modisco.infra.query.core.exception.ModelQueryExecutionException;\n"); //$NON-NLS-1$
		contents.append("import org.eclipse.modisco.infra.query.core.java.IJavaModelQuery;\n"); //$NON-NLS-1$
		contents.append("import org.eclipse.modisco.infra.query.core.java.ParameterValueList;\n"); //$NON-NLS-1$
		contents.append("\n"); //$NON-NLS-1$
		String description = modelQuery.getDescription();
		if (description != null && description.trim().length() > 0) {
			contents.append("/** " + description + " */\n"); //$NON-NLS-1$ //$NON-NLS-2$
		}
		contents.append("public class " + name + " implements IJavaModelQuery<" + shortScopeType + ", " + shortReturnType + "> {\n"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
		contents.append("	public " + shortReturnType + " evaluate(final " + shortScopeType + " context, final ParameterValueList parameterValues)\n"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		contents.append("			throws ModelQueryExecutionException {\n"); //$NON-NLS-1$
		contents.append("		// TODO Auto-generated method stub\n"); //$NON-NLS-1$
		contents.append("		return null;\n"); //$NON-NLS-1$
		contents.append("	}\n"); //$NON-NLS-1$
		contents.append("}\n"); //$NON-NLS-1$
	}

	private boolean mustImport(final String type) {
		return type.contains(".") && !type.startsWith("java.lang."); //$NON-NLS-1$ //$NON-NLS-2$
	}
}
