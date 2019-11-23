/**
 * Copyright (c) 2009 Mia-Software.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Nicolas Guyomar (Mia-Software) - initial API and implementation
 */
package org.eclipse.modisco.java.queries.text;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.modisco.infra.query.core.exception.ModelQueryExecutionException;
import org.eclipse.modisco.infra.query.core.java.IJavaModelQuery;
import org.eclipse.modisco.infra.query.core.java.ParameterValueList;
import org.eclipse.modisco.java.ASTNode;
import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.AbstractVariablesContainer;
import org.eclipse.modisco.java.Annotation;
import org.eclipse.modisco.java.ArrayAccess;
import org.eclipse.modisco.java.ArrayCreation;
import org.eclipse.modisco.java.ArrayInitializer;
import org.eclipse.modisco.java.ArrayLengthAccess;
import org.eclipse.modisco.java.Assignment;
import org.eclipse.modisco.java.BooleanLiteral;
import org.eclipse.modisco.java.CastExpression;
import org.eclipse.modisco.java.CharacterLiteral;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.ClassInstanceCreation;
import org.eclipse.modisco.java.ConditionalExpression;
import org.eclipse.modisco.java.ConstructorDeclaration;
import org.eclipse.modisco.java.FieldAccess;
import org.eclipse.modisco.java.InfixExpression;
import org.eclipse.modisco.java.InstanceofExpression;
import org.eclipse.modisco.java.MethodDeclaration;
import org.eclipse.modisco.java.MethodInvocation;
import org.eclipse.modisco.java.NullLiteral;
import org.eclipse.modisco.java.NumberLiteral;
import org.eclipse.modisco.java.ParenthesizedExpression;
import org.eclipse.modisco.java.PostfixExpression;
import org.eclipse.modisco.java.PrefixExpression;
import org.eclipse.modisco.java.PrimitiveTypeBoolean;
import org.eclipse.modisco.java.PrimitiveTypeChar;
import org.eclipse.modisco.java.PrimitiveTypeDouble;
import org.eclipse.modisco.java.PrimitiveTypeFloat;
import org.eclipse.modisco.java.PrimitiveTypeInt;
import org.eclipse.modisco.java.SingleVariableAccess;
import org.eclipse.modisco.java.SingleVariableDeclaration;
import org.eclipse.modisco.java.StringLiteral;
import org.eclipse.modisco.java.SuperFieldAccess;
import org.eclipse.modisco.java.SuperMethodInvocation;
import org.eclipse.modisco.java.ThisExpression;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.TypeLiteral;
import org.eclipse.modisco.java.UnresolvedItemAccess;
import org.eclipse.modisco.java.VariableDeclarationFragment;

public class GetTypeRef implements IJavaModelQuery<ASTNode, Type> {

	public Type evaluate(final ASTNode context, final ParameterValueList parameterValues)
			throws ModelQueryExecutionException {
		Type result = null;
		if (context instanceof AbstractVariablesContainer) {
			AbstractVariablesContainer contextCasted = (AbstractVariablesContainer) context;
			result = getType(contextCasted);
		} else if (context instanceof Annotation) {
			Annotation contextCasted = (Annotation) context;
			result = getType(contextCasted);
		} else if (context instanceof ArrayAccess) {
			ArrayAccess contextCasted = (ArrayAccess) context;
			result = getType(contextCasted);
		} else if (context instanceof ArrayCreation) {
			ArrayCreation contextCasted = (ArrayCreation) context;
			result = getType(contextCasted);
		} else if (context instanceof ArrayInitializer) {
			// null
			assert (true); // for non null block
		} else if (context instanceof ArrayLengthAccess) {
			ArrayLengthAccess contextCasted = (ArrayLengthAccess) context;
			result = getType(contextCasted);
		} else if (context instanceof Assignment) {
			Assignment contextCasted = (Assignment) context;
			result = getType(contextCasted);
		} else if (context instanceof BooleanLiteral) {
			BooleanLiteral contextCasted = (BooleanLiteral) context;
			result = getType(contextCasted);
		} else if (context instanceof CastExpression) {
			CastExpression contextCasted = (CastExpression) context;
			result = getType(contextCasted);
		} else if (context instanceof CharacterLiteral) {
			CharacterLiteral contextCasted = (CharacterLiteral) context;
			result = getType(contextCasted);
		} else if (context instanceof ClassInstanceCreation) {
			ClassInstanceCreation contextCasted = (ClassInstanceCreation) context;
			result = getType(contextCasted);
		} else if (context instanceof ConditionalExpression) {
			// null
			assert (true); // for non null block
		} else if (context instanceof InfixExpression) {
			// null
			assert (true); // for non null block
		} else if (context instanceof InstanceofExpression) {
			InstanceofExpression contextCasted = (InstanceofExpression) context;
			result = getType(contextCasted);
		} else if (context instanceof FieldAccess) {
			FieldAccess contextCasted = (FieldAccess) context;
			result = getType(contextCasted);
		} else if (context instanceof MethodInvocation) {
			MethodInvocation contextCasted = (MethodInvocation) context;
			result = getType(contextCasted);
		} else if (context instanceof NumberLiteral) {
			NumberLiteral contextCasted = (NumberLiteral) context;
			result = getType(contextCasted);
		} else if (context instanceof NullLiteral) {
			// null
			assert (true); // for non null block
		} else if (context instanceof ParenthesizedExpression) {
			ParenthesizedExpression contextCasted = (ParenthesizedExpression) context;
			result = getType(contextCasted);
		} else if (context instanceof PostfixExpression) {
			PostfixExpression contextCasted = (PostfixExpression) context;
			result = getType(contextCasted);
		} else if (context instanceof PrefixExpression) {
			PrefixExpression contextCasted = (PrefixExpression) context;
			result = getType(contextCasted);
		} else if (context instanceof SingleVariableAccess) {
			SingleVariableAccess contextCasted = (SingleVariableAccess) context;
			result = getType(contextCasted);
		} else if (context instanceof SuperFieldAccess) {
			SuperFieldAccess contextCasted = (SuperFieldAccess) context;
			result = getType(contextCasted);
		} else if (context instanceof StringLiteral) {
			StringLiteral contextCasted = (StringLiteral) context;
			result = getType(contextCasted);
		} else if (context instanceof SuperMethodInvocation) {
			SuperMethodInvocation contextCasted = (SuperMethodInvocation) context;
			result = getType(contextCasted);
		} else if (context instanceof ThisExpression) {
			ThisExpression contextCasted = (ThisExpression) context;
			result = getType(contextCasted);
		} else if (context instanceof TypeAccess) {
			TypeAccess contextCasted = (TypeAccess) context;
			if (contextCasted.getType() != null) {
				result = contextCasted.getType();
			}
		} else if (context instanceof TypeLiteral) {
			TypeLiteral contextCasted = (TypeLiteral) context;
			result = getType(contextCasted);
		} else if (context instanceof UnresolvedItemAccess) {
			// null
			assert (true); // for non null block
		} else {
			throw new ModelQueryExecutionException(
					"Unexpected context type: " //$NON-NLS-1$
							+ context.getClass().getSimpleName()
							+ " expected: AbstractVariablesContainer or Expression in " + this.getClass().getSimpleName()); //$NON-NLS-1$
		}
		return result;
	}

	private Type getType(final AbstractVariablesContainer contextCasted) {
		Type result = null;
		if (contextCasted.getType() != null) {
			result = contextCasted.getType().getType();
		}
		return result;
	}

	private Type getType(final Annotation contextCasted) {
		Type result = null;
		if (contextCasted.getType() != null) {
			result = contextCasted.getType().getType();
		}
		return result;
	}

	private Type getType(final ArrayAccess contextCasted) throws ModelQueryExecutionException {
		Type result = null;
		if (contextCasted.getArray() != null) {
			result = evaluate(contextCasted.getArray(), null);
		}
		return result;
	}

	private Type getType(final ArrayCreation contextCasted) {
		Type result = null;
		if (contextCasted.getType() != null) {
			result = contextCasted.getType().getType();
		}
		return result;
	}

	private Type getType(final ArrayLengthAccess contextCasted) {
		Type result = null;
		List<PrimitiveTypeInt> candidates = retrieveType(contextCasted.eResource(),
				"int", PrimitiveTypeInt.class); //$NON-NLS-1$
		if (!candidates.isEmpty()) {
			result = candidates.get(0);
		}
		return result;
	}

	private Type getType(final Assignment contextCasted) throws ModelQueryExecutionException {
		Type result = null;
		if (contextCasted.getRightHandSide() != null) {
			result = evaluate(contextCasted.getRightHandSide(), null);
		}
		return result;
	}

	private Type getType(final BooleanLiteral contextCasted) {
		Type result = null;
		List<PrimitiveTypeBoolean> candidates = retrieveType(contextCasted.eResource(),
				"boolean", PrimitiveTypeBoolean.class); //$NON-NLS-1$
		if (!candidates.isEmpty()) {
			result = candidates.get(0);
		}
		return result;
	}

	private Type getType(final CastExpression contextCasted) {
		Type result = null;
		if (contextCasted.getType() != null) {
			result = contextCasted.getType().getType();
		}
		return result;
	}

	private Type getType(final CharacterLiteral contextCasted) {
		Type result = null;
		List<PrimitiveTypeChar> candidates = retrieveType(contextCasted.eResource(),
				"char", PrimitiveTypeChar.class); //$NON-NLS-1$
		if (!candidates.isEmpty()) {
			result = candidates.get(0);
		}
		return result;
	}

	private Type getType(final ClassInstanceCreation contextCasted) {
		Type result = null;
		if (contextCasted.getType() != null) {
			result = contextCasted.getType().getType();
		}
		return result;
	}

	private Type getType(final FieldAccess contextCasted) {
		Type result = null;
		if (contextCasted.getField() != null) {
			result = getType(contextCasted.getField());
		}
		return result;
	}

	private Type getType(final InstanceofExpression contextCasted) {
		Type result = null;
		List<PrimitiveTypeBoolean> candidates = retrieveType(contextCasted.eResource(),
				"boolean", PrimitiveTypeBoolean.class); //$NON-NLS-1$
		if (!candidates.isEmpty()) {
			result = candidates.get(0);
		}
		return result;
	}

	private Type getType(final MethodInvocation contextCasted) {
		Type result = null;
		if (contextCasted.getMethod() != null) {
			if (contextCasted.getMethod() instanceof MethodDeclaration
					&& ((MethodDeclaration) contextCasted.getMethod()).getReturnType() != null) {
				result = ((MethodDeclaration) contextCasted.getMethod()).getReturnType().getType();
			} else if (contextCasted.getMethod() instanceof ConstructorDeclaration) {
				result = ((ConstructorDeclaration) contextCasted.getMethod())
						.getAbstractTypeDeclaration();
			}

		}
		return result;
	}

	private Type getType(final NumberLiteral contextCasted) {
		Type result = null;
		// make some approximation here to choose between Integer, Float and
		// Double
		try {
			Integer.parseInt(contextCasted.getTokenValue());
			List<PrimitiveTypeInt> candidates = retrieveType(contextCasted.eResource(),
					"int", PrimitiveTypeInt.class); //$NON-NLS-1$
			if (!candidates.isEmpty()) {
				result = candidates.get(0);
			}
		} catch (NumberFormatException e) {
			List<PrimitiveTypeDouble> candidates = retrieveType(contextCasted.eResource(),
					"double", PrimitiveTypeDouble.class); //$NON-NLS-1$
			if (candidates.isEmpty()) {
				List<PrimitiveTypeFloat> candidates2 = retrieveType(contextCasted.eResource(),
						"float", PrimitiveTypeFloat.class); //$NON-NLS-1$
				if (!candidates2.isEmpty()) {
					result = candidates2.get(0);
				}
			} else {
				result = candidates.get(0);
			}
		}

		return result;
	}

	private Type getType(final ParenthesizedExpression contextCasted)
			throws ModelQueryExecutionException {
		Type result = null;
		if (contextCasted.getExpression() != null) {
			result = evaluate(contextCasted.getExpression(), null);
		}
		return result;
	}

	private Type getType(final PostfixExpression contextCasted) throws ModelQueryExecutionException {
		Type result = null;
		if (contextCasted.getOperand() != null) {
			result = evaluate(contextCasted.getOperand(), null);
		}
		return result;
	}

	private Type getType(final PrefixExpression contextCasted) throws ModelQueryExecutionException {
		Type result = null;
		if (contextCasted.getOperand() != null) {
			result = evaluate(contextCasted.getOperand(), null);
		}
		return result;
	}

	private Type getType(final SingleVariableAccess contextCasted) {
		Type result = null;
		if (contextCasted.getVariable() != null) {
			if (contextCasted.getVariable() instanceof SingleVariableDeclaration) {
				if (((SingleVariableDeclaration) contextCasted.getVariable()).getType() != null) {
					result = ((SingleVariableDeclaration) contextCasted.getVariable()).getType()
							.getType();
				}
			} else if (contextCasted.getVariable() instanceof VariableDeclarationFragment) {
				result = getType(((VariableDeclarationFragment) contextCasted.getVariable())
						.getVariablesContainer());
			}
		}
		return result;
	}

	private Type getType(final StringLiteral contextCasted) {
		Type result = null;
		List<ClassDeclaration> candidates = retrieveType(contextCasted.eResource(),
				"String", ClassDeclaration.class); //$NON-NLS-1$
		for (ClassDeclaration aCandidate : candidates) {
			if (aCandidate.getPackage() != null && aCandidate.getPackage().getName().equals("lang")) { //$NON-NLS-1$
				result = aCandidate;
			}
		}
		return result;
	}

	private Type getType(final SuperFieldAccess contextCasted) {
		Type result = null;
		if (contextCasted.getField() != null) {
			result = getType(contextCasted.getField());
		}
		return result;
	}

	private Type getType(final SuperMethodInvocation contextCasted) {
		Type result = null;
		if (contextCasted.getMethod() != null) {
			if (contextCasted.getMethod() instanceof MethodDeclaration
					&& ((MethodDeclaration) contextCasted.getMethod()).getReturnType() != null) {
				result = ((MethodDeclaration) contextCasted.getMethod()).getReturnType().getType();
			} else if (contextCasted.getMethod() instanceof ConstructorDeclaration) {
				result = ((ConstructorDeclaration) contextCasted.getMethod())
						.getAbstractTypeDeclaration();
			}

		}
		return result;
	}

	private Type getType(final ThisExpression contextCasted) {
		Type result = null;
		if (contextCasted.getQualifier() != null) {
			result = contextCasted.getQualifier().getType();
		} else {
			EObject container = contextCasted.eContainer();
			while (!(container instanceof AbstractTypeDeclaration)) {
				container = container.eContainer();
			}
			result = (AbstractTypeDeclaration) container;
		}
		return result;
	}

	private Type getType(final TypeLiteral contextCasted) {
		Type result = null;
		List<ClassDeclaration> candidates = retrieveType(contextCasted.eResource(),
				"Class", ClassDeclaration.class); //$NON-NLS-1$
		for (ClassDeclaration aCandidate : candidates) {
			if (aCandidate.getPackage() != null && aCandidate.getPackage().getName().equals("lang")) { //$NON-NLS-1$
				result = aCandidate;
			}
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	private <T> List<T> retrieveType(final Resource aResource, final String name,
			final Class<T> type) {
		List<T> types = new ArrayList<T>();

		TreeIterator<EObject> content = aResource.getAllContents();
		while (content.hasNext()) {
			EObject eObject = content.next();
			if (type.isInstance(eObject) && (eObject instanceof Type)
					&& ((Type) eObject).getName().equals(name)) {
				types.add((T) eObject);
			}
		}

		return types;
	}

}
