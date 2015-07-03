/**
 * Copyright (c) 2010, 2011 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gabriel Barbier (Mia-Software) - initial API and implementation
 *    Fabien Giquel (Mia-Software) - Bug 339720 : MoDisco Discoverers (infra + techno) API clean
 *******************************************************************************/

package org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.converter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmt.modisco.infra.common.core.internal.utils.ModelUtils;
import org.eclipse.gmt.modisco.infra.common.core.logging.MoDiscoLogger;
import org.eclipse.gmt.modisco.java.AbstractMethodDeclaration;
import org.eclipse.gmt.modisco.java.AbstractMethodInvocation;
import org.eclipse.gmt.modisco.java.Assignment;
import org.eclipse.gmt.modisco.java.Block;
import org.eclipse.gmt.modisco.java.BodyDeclaration;
import org.eclipse.gmt.modisco.java.ClassDeclaration;
import org.eclipse.gmt.modisco.java.ClassInstanceCreation;
import org.eclipse.gmt.modisco.java.Expression;
import org.eclipse.gmt.modisco.java.MethodInvocation;
import org.eclipse.gmt.modisco.java.SingleVariableAccess;
import org.eclipse.gmt.modisco.java.TypeAccess;
import org.eclipse.gmt.modisco.java.TypeDeclaration;
import org.eclipse.gmt.modisco.java.VariableDeclaration;
import org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.Activator;
import org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.CallNode;
import org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.CallsModel;
import org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.MethodCall;
import org.eclipse.gmt.modisco.usecase.modelfilter.methodcalls.model.methodcalls.MethodcallsFactory;

/**
 * From a java model, we will extract method calls informations to initialise a method calls model.
 * 
 * @author Gabriel Barbier
 * 
 * 
 * @deprecated use matching org.eclipse.modisco.x.y.z component
 */
@Deprecated
public class MethodCallsGraphConverter {

	private final MethodcallsFactory factory = MethodcallsFactory.eINSTANCE;
	private final Map<AbstractMethodDeclaration, CallNode> javaOperationToCallNode = new HashMap<AbstractMethodDeclaration, CallNode>();
	private final List<AbstractMethodInvocation> allInvocations = new ArrayList<AbstractMethodInvocation>();;
	private final List<TypeDeclaration> allTypes = new ArrayList<TypeDeclaration>();

	/**
	 * From a java resource, we will compute method calls graph then initialize a method calls
	 * model. And of course, we will store this model into a resource.
	 * 
	 * @param javaResource
	 * @return corresponding method calls model resource
	 */
	public Resource convertJavaResourceToMethodCallsResource(final Resource javaResource,
			final URI targetUri) {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource result = resourceSet.createResource(targetUri);
		/*
		 * Create method calls model root
		 */
		CallsModel callsModel = this.factory.createCallsModel();
		callsModel.setName(targetUri.trimFileExtension().lastSegment());
		result.getContents().add(callsModel);

		List<AbstractMethodDeclaration> allOperations = this.getAllOperations(javaResource);
		/*
		 * iterate over all operations to initialize call nodes
		 */
		for (AbstractMethodDeclaration javaOperation : allOperations) {
			/*
			 * create calls node
			 */
			CallNode callNode = this.factory.createCallNode();
			callNode.setJavaMethod(javaOperation);
			callsModel.getCallNodes().add(callNode);
			if (javaOperation.getUsages().isEmpty()) {
				callsModel.getRootNodes().add(callNode);
			}
			// init also convenient hashmap ...
			this.javaOperationToCallNode.put(javaOperation, callNode);
		}
		/*
		 * iterate over all operations to compute method calls informations
		 */
		for (AbstractMethodDeclaration javaOperation : allOperations) {
			CallNode callNode = this.javaOperationToCallNode.get(javaOperation);
			List<AbstractMethodInvocation> calledMethods = this.getCalledMethods(javaOperation);
			/*
			 * Compute call node name
			 */
			String parentName = ""; //$NON-NLS-1$
			if (javaOperation.getAbstractTypeDeclaration() != null) {
				parentName = javaOperation.getAbstractTypeDeclaration().getName();
			}
			String name = parentName + " :: " + javaOperation.getName(); //$NON-NLS-1$
			if (calledMethods.isEmpty() == false) {
				name = name + " (" + calledMethods.size() + ")"; //$NON-NLS-1$ //$NON-NLS-2$
			}
			callNode.setName(name);
			/*
			 * initialize method call elements
			 */
			for (int index = 0; index < calledMethods.size(); index++) {
				MethodCall methodCall = this.factory.createMethodCall();
				methodCall.setOrder(index);
				CallNode callee = this.javaOperationToCallNode.get(calledMethods.get(index)
						.getMethod());
				methodCall.setCallee(callee);
				/*
				 * compute filtered methods 1. we have to retrieve variable declaration which
				 * contains this method invocation, if it exists. 2. get collection of filtered
				 * potential types
				 */
				VariableDeclaration variableDeclaration = this.getVariableDeclaration(calledMethods
						.get(index));
				if (variableDeclaration != null) {
					for (TypeDeclaration subtype : this
							.getFilteredPotentialTypes(variableDeclaration)) {
						/*
						 * we have to retrieve corresponding method same name, same number of
						 * parameters same name of parameters ? -> may change same type of
						 * parameters ? may be a subtype
						 */
						for (BodyDeclaration body : subtype.getBodyDeclarations()) {
							if (body instanceof AbstractMethodDeclaration) {
								AbstractMethodDeclaration subMethod = (AbstractMethodDeclaration) body;
								if (javaOperation.getName().equals(body.getName())) {
									if (javaOperation.getParameters().size() == subMethod
											.getParameters().size()) {
										CallNode subNode = this.javaOperationToCallNode
												.get(subMethod);
										methodCall.getFilteredSubMethods().add(subNode);
									}
								}
							}
						}
					}
				}
				/*
				 * if everything is ok, we could add this method call to current call node element.
				 */
				callNode.getMethodCalls().add(methodCall);
			}
			/*
			 * initialize collection of sub methods
			 */
			TypeDeclaration parentType = this.getTypeDeclaration(javaOperation);
			for (TypeDeclaration subtype : this.getAllSubTypes(parentType)) {
				/*
				 * we have to retrieve corresponding method same name, same number of parameters
				 * same name of parameters ? -> may change same type of parameters ? may be a
				 * subtype
				 */
				for (BodyDeclaration body : subtype.getBodyDeclarations()) {
					if (body instanceof AbstractMethodDeclaration) {
						AbstractMethodDeclaration subMethod = (AbstractMethodDeclaration) body;
						if (javaOperation.getName().equals(body.getName())) {
							if (javaOperation.getParameters().size() == subMethod.getParameters()
									.size()) {
								CallNode subNode = this.javaOperationToCallNode.get(subMethod);
								callNode.getSubMethods().add(subNode);
							}
						}
					}
				}
			}
		}
		/*
		 * save result
		 */
		try {
			result.setURI(targetUri);
			result.save(null);
		} catch (IOException e) {
			MoDiscoLogger.logError(e, "Error happened while saving a resource: " + targetUri, //$NON-NLS-1$
					Activator.getDefault());
		}

		return result;
	}

	/**
	 * To retrieve all method declarations from java model.
	 * 
	 * We will also initialize collections of types and method invocations to iterate only once on
	 * all java elements.
	 * 
	 * @param javaResource
	 * @return
	 */
	private final List<AbstractMethodDeclaration> getAllOperations(Resource javaResource) {
		List<AbstractMethodDeclaration> result = new ArrayList<AbstractMethodDeclaration>();
		TreeIterator<EObject> iterator = javaResource.getAllContents();
		while (iterator.hasNext()) {
			EObject object = iterator.next();
			if (object instanceof AbstractMethodDeclaration) {
				AbstractMethodDeclaration operation = (AbstractMethodDeclaration) object;
				result.add(operation);
			} else if (object instanceof AbstractMethodInvocation) {
				AbstractMethodInvocation invocation = (AbstractMethodInvocation) object;
				this.allInvocations.add(invocation);
			} else if (object instanceof TypeDeclaration) {
				TypeDeclaration currentClassDeclaration = (TypeDeclaration) object;
				this.allTypes.add(currentClassDeclaration);
			}
		}
		return result;
	}

	/**
	 * If we want to get all the called methods from this method declaration, we have to select all
	 * usages which are contained by this method declaration. It means all instances of
	 * AbstractMethodInvocation Yet, we have also to sort this collection by its order in call
	 * sequence
	 * 
	 * @param parent
	 * @return
	 */
	private final List<AbstractMethodInvocation> getCalledMethods(AbstractMethodDeclaration parent) {
		List<AbstractMethodInvocation> invocations = this.getInvocations(parent);
		// sort invocations ...
		Collections.sort(invocations, new MethodInvocationComparator());
		return invocations;
	}

	/**
	 * To retrieve all method invocations that are contained by this method declaration element.
	 * 
	 * @param parent
	 * @return
	 */
	private final List<AbstractMethodInvocation> getInvocations(AbstractMethodDeclaration parent) {
		List<AbstractMethodInvocation> invocations = new ArrayList<AbstractMethodInvocation>();
		for (AbstractMethodInvocation invocation : this.allInvocations) {
			if (parent == this.getInvoker(invocation)) {
				invocations.add(invocation);
			}
		}
		return invocations;
	}

	/**
	 * To retrieve the method declaration element which contains the source method invocation. Type
	 * of parameter element is EObject, because we have to navigate into statements hierarchy which
	 * many different kinds of elements
	 * 
	 * @param element
	 * @return
	 */
	private final AbstractMethodDeclaration getInvoker(EObject element) {
		AbstractMethodDeclaration result = null;
		if (element != null) {
			if (element instanceof AbstractMethodDeclaration) {
				result = (AbstractMethodDeclaration) element;
			} else {
				result = this.getInvoker(element.eContainer());
			}
		}
		return result;
	}

	private static class MethodInvocationComparator implements Comparator<AbstractMethodInvocation> {

		public int compare(AbstractMethodInvocation invocation1,
				AbstractMethodInvocation invocation2) {
			int result = -1;
			/*
			 * Initially, I used location in file to sort invocations, but needed information is no
			 * longer retained in java model ...
			 * 
			 * Perhaps could I use index of parent element which is directly contained in block
			 * statement of the declaring method ?
			 */
			Block rootBlock1 = this.getRootBlock(invocation1);
			Block rootBlock2 = this.getRootBlock(invocation2);
			if ((rootBlock1 == null) || (rootBlock2 == null)) {
				result = 0;
			} else {
				int index1 = this.computeIndex(invocation1, rootBlock1);
				int index2 = this.computeIndex(invocation2, rootBlock2);
				/*
				 * specific case: both invocations have the same index and are contained in the same
				 * block.
				 * 
				 * So we have to retrieve first common parent block and use it to compute index ...
				 */
				if ((index1 == index2) && (rootBlock1 == rootBlock2)) {
					Block commonBlock = this.getFirstCommonParentBlock(invocation1, invocation2,
							rootBlock1);
					index1 = this.computeIndex(invocation1, commonBlock);
					index2 = this.computeIndex(invocation2, commonBlock);
				}

				result = Integer.valueOf(index1).compareTo(Integer.valueOf(index2));
			}
			return result;
		}

		private final int computeIndex(EObject element, Block rootBlock) {
			int result = -2;
			if (element.eContainer() == rootBlock) {
				result = rootBlock.getStatements().indexOf(element);
			} else {
				result = this.computeIndex(element.eContainer(), rootBlock);
			}
			return result;
		}

		private final Block getRootBlock(EObject element) {
			Block result = null;
			if (element != null) {
				if (element instanceof AbstractMethodDeclaration) {
					result = ((AbstractMethodDeclaration) element).getBody();
				} else {
					result = this.getRootBlock(element.eContainer());
				}
			}
			return result;
		}

		/*
		 * To retrieve the first common parent block of two elements lets start from an example:
		 * block A contains another block B (with other statements) block B contains two blocks C
		 * and D which contains respectively element1 and element2
		 * 
		 * Here the algorithm: From element1, I get the nearest parent block Then I will iterate on
		 * all parent blocks of element2 and test identity If not found, I have to iterate on parent
		 * block of element1 And test again on all parent blocks of element2 ...
		 */
		private final Block getFirstCommonParentBlock(EObject sourceElement, EObject element2,
				Block stopper) {
			Block result = this.getParentBlock(sourceElement);
			if (result != stopper) {
				if (this.isParentBlock(element2, result, stopper) == false) {
					result = this.getFirstCommonParentBlock(result, element2, stopper);
				} // else, result is the first common parent block
			}
			return result;
		}

		private final boolean isParentBlock(EObject element, Block target, Block stopper) {
			boolean result = false;
			Block parent = this.getParentBlock(element);
			if (parent != stopper) {
				if (parent == target) {
					result = true;
				} else {
					result = this.isParentBlock(parent, target, stopper);
				}
			}
			return result;
		}

		private final Block getParentBlock(EObject element) {
			Block result = null;
			if (element != null) {
				if (element.eContainer() instanceof Block) {
					result = (Block) element.eContainer();
				} else {
					result = this.getParentBlock(element.eContainer());
				}
			}
			return result;
		}
	}

	/**
	 * To retrieve the type declaration which contains source element (which is at the beginning a
	 * method declaration element)
	 * 
	 * @param element
	 * @return
	 */
	private final TypeDeclaration getTypeDeclaration(EObject element) {
		TypeDeclaration result = null;
		if (element != null) {
			if (element instanceof TypeDeclaration) {
				result = (TypeDeclaration) element;
			} else {
				result = this.getTypeDeclaration(element.eContainer());
			}
		}
		return result;
	}

	/**
	 * To retrieve all sub types of parameter (type declaration element)
	 * 
	 * @param contextClass
	 * @return
	 */
	private final Set<TypeDeclaration> getAllSubTypes(TypeDeclaration contextClass) {
		Set<TypeDeclaration> result = new HashSet<TypeDeclaration>();
		if (contextClass != null) {
			for (TypeDeclaration currentClassDeclaration : this.allTypes) {
				if (isSuperTypeOf(contextClass, currentClassDeclaration)) {
					result.add(currentClassDeclaration);
					result.addAll(this.getAllSubTypes(currentClassDeclaration));
				}
			}
		}
		return result;
	}

	/**
	 * To compute a boolean which indicate if a type (self) is in parent hierarchy of an other type
	 * (typeDeclaration).
	 * 
	 * @param self
	 * @param typeDeclaration
	 * @return true if self is a super type of typeDeclaration
	 */
	private final boolean isSuperTypeOf(TypeDeclaration self, TypeDeclaration typeDeclaration) {
		if (typeDeclaration.getSuperInterfaces().contains(self)) {
			return true;
		}
		for (TypeAccess superTypeAccess : typeDeclaration.getSuperInterfaces()) {
			if (superTypeAccess.getType() instanceof TypeDeclaration) {
				TypeDeclaration superType = (TypeDeclaration) superTypeAccess.getType();
				if (superType == self || isSuperTypeOf(self, superType)) {
					return true;
				}
			}
		}
		if (typeDeclaration instanceof ClassDeclaration) {
			ClassDeclaration classDeclaration = (ClassDeclaration) typeDeclaration;
			if (classDeclaration.getSuperClass() != null
					&& classDeclaration.getSuperClass().getType() == self) {
				return true;
			}
			if (classDeclaration.getSuperClass() != null
					&& classDeclaration.getSuperClass().getType() instanceof TypeDeclaration) {
				TypeDeclaration superType = (TypeDeclaration) classDeclaration.getSuperClass()
						.getType();
				if (isSuperTypeOf(self, superType)) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * @param abstractMethodInvocation
	 * @return
	 */
	private final VariableDeclaration getVariableDeclaration(
			AbstractMethodInvocation abstractMethodInvocation) {
		VariableDeclaration result = null;
		if (abstractMethodInvocation instanceof MethodInvocation) {
			MethodInvocation methodInvocation = (MethodInvocation) abstractMethodInvocation;
			if ((methodInvocation.getExpression() != null)
					&& (methodInvocation.getExpression() instanceof SingleVariableAccess)) {
				SingleVariableAccess singleVariableAccess = (SingleVariableAccess) methodInvocation
						.getExpression();
				result = singleVariableAccess.getVariable();
			}
		}
		return result;
	}

	/**
	 * @param variableDeclaration
	 * @return
	 */
	private final Set<TypeDeclaration> getFilteredPotentialTypes(
			VariableDeclaration variableDeclaration) {
		List<VariableDeclaration> parents = new ArrayList<VariableDeclaration>();
		Set<TypeDeclaration> result = this.getBasicFilteredPotentialTypes(variableDeclaration,
				parents);
		return result;
	}

	private final Set<TypeDeclaration> getBasicFilteredPotentialTypes(VariableDeclaration source,
			List<VariableDeclaration> parents) {
		Set<TypeDeclaration> result = new HashSet<TypeDeclaration>();
		if (parents.contains(source) == false) {
			parents.add(source);

			Expression initializer = source.getInitializer();
			if ((initializer != null) && (initializer instanceof ClassInstanceCreation)) {
				ClassInstanceCreation classInstanceCreation = (ClassInstanceCreation) initializer;
				if (classInstanceCreation.getType().getType() instanceof TypeDeclaration) {
					result.add((TypeDeclaration) classInstanceCreation.getType().getType());
				}
			}
			result.addAll(this.filterAssignement(source, parents));
		}
		return result;
	}

	private final Set<TypeDeclaration> filterAssignement(VariableDeclaration source,
			List<VariableDeclaration> parents) {
		Set<TypeDeclaration> result = new HashSet<TypeDeclaration>();
		for (SingleVariableAccess access : source.getUsageInVariableAccess()) {
			EObject container = access.eContainer();
			if (container instanceof Assignment) {
				Assignment assignment = (Assignment) container;
				Expression expression = assignment.getRightHandSide();
				if (expression instanceof ClassInstanceCreation) {
					ClassInstanceCreation classInstanceCreation = (ClassInstanceCreation) expression;
					if (classInstanceCreation.getType().getType() instanceof TypeDeclaration) {
						result.add((TypeDeclaration) classInstanceCreation.getType().getType());
					}
				} else if (expression instanceof SingleVariableAccess) {
					/*
					 * potential infinite recursion
					 * 
					 * Object tmp; Object src = tmp; ... tmp = src;
					 */
					SingleVariableAccess singleVariableAccess = (SingleVariableAccess) expression;
					result.addAll(this.getBasicFilteredPotentialTypes(
							singleVariableAccess.getVariable(), parents));
				}
			}
		}
		return result;
	}

}