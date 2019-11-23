/*******************************************************************************
 * Copyright (c) 2009, 2010 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *    Romain Dervaux (Mia-Software)
 *    Nicolas Bros (Mia-Software) - Bug 335003 - [Discoverer] : Existing Discoverers Refactoring based on new framework
 *    Fabien Giquel (Mia-Software) - Bug 342856 - improve Discoverers implementation
 *******************************************************************************/

package org.eclipse.modisco.java.discoverer.tests;

import java.util.Iterator;

import org.eclipse.modisco.java.AbstractMethodDeclaration;
import org.eclipse.modisco.java.Annotation;
import org.eclipse.modisco.java.AnnotationMemberValuePair;
import org.eclipse.modisco.java.BodyDeclaration;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.Comment;
import org.eclipse.modisco.java.CompilationUnit;
import org.eclipse.modisco.java.ConstructorDeclaration;
import org.eclipse.modisco.java.FieldDeclaration;
import org.eclipse.modisco.java.InheritanceKind;
import org.eclipse.modisco.java.Initializer;
import org.eclipse.modisco.java.InterfaceDeclaration;
import org.eclipse.modisco.java.Javadoc;
import org.eclipse.modisco.java.MethodDeclaration;
import org.eclipse.modisco.java.MethodRef;
import org.eclipse.modisco.java.NamedElement;
import org.eclipse.modisco.java.Package;
import org.eclipse.modisco.java.PackageAccess;
import org.eclipse.modisco.java.SingleVariableDeclaration;
import org.eclipse.modisco.java.TagElement;
import org.eclipse.modisco.java.TextElement;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.TypeDeclaration;
import org.eclipse.modisco.java.TypeParameter;
import org.eclipse.modisco.java.VariableDeclarationFragment;
import org.eclipse.modisco.java.VisibilityKind;
import org.eclipse.modisco.java.discoverer.tests.utils.AbstractDiscoverTest;
import org.eclipse.modisco.java.internal.util.JavaUtil;
import org.junit.Assert;
import org.junit.Test;

public class JavaJUnitEMF extends AbstractDiscoverTest {

	private static final int MAGIC_NUMBER = 3;

	@Override
	protected String getTargetProjectName() {
		return Activator.PLUGIN_ID + "_test001"; //$NON-NLS-1$
	}

	@Override
	protected String getSourcesReferencePath() {
		return "/workspace/test001/"; //$NON-NLS-1$
	}

	/**
	 * Bug 325108 - Java Discoverer : DanglingHREFException with a block comment
	 * construct
	 */
	@Test
	public void testBug325108() {
		Assert.assertTrue("Resource must not have any errors", getResource() //$NON-NLS-1$
				.getErrors().size() == 0);
	}

	@Test
	public void test001() {
		Package p1 = (Package) JavaUtil.getNamedElementByQualifiedName(
				getModel(), "test001.p1"); //$NON-NLS-1$
		Assert.assertNotNull("test001.p1 should exists", p1); //$NON-NLS-1$
		Assert.assertTrue("test001.p1 should contain only one element.", p1 //$NON-NLS-1$
				.getOwnedElements().size() == 1);
		Package p2 = (Package) JavaUtil.getNamedElementByQualifiedName(
				getModel(), "test001.p2"); //$NON-NLS-1$
		Assert.assertNotNull("test001.p2 should exists", p2); //$NON-NLS-1$
		Assert.assertTrue("test001.p2 should contain only one element.", p2 //$NON-NLS-1$
				.getOwnedElements().size() == 1);
		NamedElement class1 = JavaUtil.getNamedElementByQualifiedName(
				getModel(), "test001.p1.Class1"); //$NON-NLS-1$
		Assert.assertNotNull("test001.p1.Class1 should exists", class1); //$NON-NLS-1$
		Assert.assertFalse(
				"test001.p1.Class1 not must be a proxy", class1.isProxy()); //$NON-NLS-1$
		NamedElement class2 = JavaUtil.getNamedElementByQualifiedName(
				getModel(), "test001.p2.Class2"); //$NON-NLS-1$
		Assert.assertNotNull("java.lang.String should exists", class2); //$NON-NLS-1$
		Assert.assertFalse(
				"java.lang.String must not be a proxy", class2.isProxy()); //$NON-NLS-1$
	}

	@Test
	public void test002() {
		NamedElement class1 = JavaUtil.getNamedElementByQualifiedName(
				getModel(), "test002.Class1"); //$NON-NLS-1$
		Assert.assertNotNull("test002.Class1 should exists", class1); //$NON-NLS-1$
		Assert.assertFalse(
				"test002.Class1 not must be a proxy", class1.isProxy()); //$NON-NLS-1$
		NamedElement class4 = JavaUtil.getNamedElementByQualifiedName(
				getModel(), "test002.Class1.Class4"); //$NON-NLS-1$
		Assert.assertNotNull("test002.Class1.Class4 should exists", class4); //$NON-NLS-1$
		Assert.assertFalse("test002.Class1.Class4 not must be a proxy", class4 //$NON-NLS-1$
				.isProxy());
		NamedElement class2 = JavaUtil.getNamedElementByQualifiedName(
				getModel(), "test002.Class2"); //$NON-NLS-1$
		Assert.assertNotNull("test002.Class2 should exists", class2); //$NON-NLS-1$
		Assert.assertFalse(
				"test002.Class2 not must be a proxy", class2.isProxy()); //$NON-NLS-1$
		NamedElement class3 = JavaUtil.getNamedElementByQualifiedName(
				getModel(), "test002.Class2.Class3"); //$NON-NLS-1$
		Assert.assertNotNull("test002.Class2.Class3 should exists", class3); //$NON-NLS-1$
		Assert.assertFalse("test002.Class2.Class3 not must be a proxy", class3 //$NON-NLS-1$
				.isProxy());
	}

	@Test
	public void test003() {
		NamedElement ne = JavaUtil.getNamedElementByQualifiedName(getModel(),
				"java.lang.String"); //$NON-NLS-1$
		Assert.assertNotNull("java.lang.String should exists", ne); //$NON-NLS-1$
		Assert.assertTrue("java.lang.String must be a proxy", ne.isProxy()); //$NON-NLS-1$
		ConstructorDeclaration stringConstructor = (ConstructorDeclaration) JavaUtil
				.getNamedElementByQualifiedName(getModel(),
						"java.lang.String.String()"); //$NON-NLS-1$
		Assert.assertTrue("java.lang.String.String() should be proxy", //$NON-NLS-1$
				stringConstructor.isProxy());
	}

	@Test
	public void packageaccess() {
		NamedElement ne = JavaUtil.getNamedElementByQualifiedName(getModel(),
				"packageaccess"); //$NON-NLS-1$
		Assert.assertNotNull("packageaccess should exists", ne); //$NON-NLS-1$

		NamedElement resolvedPckAccess = JavaUtil
				.getNamedElementByQualifiedName(getModel(),
						"packageaccess.PackageAccess"); //$NON-NLS-1$
		Assert.assertNotNull("packageaccess.PackageAccess should exists", //$NON-NLS-1$
				resolvedPckAccess);

		Assert.assertTrue(
				"type PackageAccess should have only one super interface", //$NON-NLS-1$
				((TypeDeclaration) resolvedPckAccess).getSuperInterfaces()
						.size() == 1);

		TypeAccess typAcc = ((TypeDeclaration) resolvedPckAccess)
				.getSuperInterfaces().get(0);

		Assert.assertTrue("super interface should be an interface", //$NON-NLS-1$
				typAcc.getType() instanceof InterfaceDeclaration);
		Assert.assertTrue("qualifier should be a PackageAccess", //$NON-NLS-1$
				typAcc.getQualifier() instanceof PackageAccess);

		PackageAccess qualifier = (PackageAccess) typAcc.getQualifier();

		Assert.assertTrue(
				"wrong qualified package name ", JavaUtil.getQualifiedName(//$NON-NLS-1$
						qualifier.getPackage()).equals(
						"javax.swing.text.html.parser")); //$NON-NLS-1$
	}

	@Test
	public void validation() {
		int nbError = JavaValidation.validate(getResource(), System.out);
		Assert.assertEquals("Validation", 0, nbError); //$NON-NLS-1$
	}

	@Test
	public void varargs() {
		ClassDeclaration classDecl = (ClassDeclaration) JavaUtil
				.getNamedElementByQualifiedName(getModel(), "varargs.VarArgs2"); //$NON-NLS-1$
		Iterator<BodyDeclaration> bodyDeclarations = classDecl
				.getBodyDeclarations().iterator();
		while (bodyDeclarations.hasNext()) {
			BodyDeclaration bodyDeclaration = bodyDeclarations.next();
			if (bodyDeclaration.getName().equals("m1")) { //$NON-NLS-1$
				MethodDeclaration methodDeclaration = (MethodDeclaration) bodyDeclaration;
				SingleVariableDeclaration singleVariableDeclaration = methodDeclaration
						.getParameters().get(0);
				Assert.assertTrue("The parameter must be a varargs.", //$NON-NLS-1$
						singleVariableDeclaration.isVarargs());
			}
		}

	}

	@Test
	public void annotations() {
		// the annotation on the class
		NamedElement ne = JavaUtil.getNamedElementByQualifiedName(getModel(),
				"annotations.MyAnnotatedClass"); //$NON-NLS-1$
		Assert.assertNotNull("annotations.MyAnnotatedClass should exists", ne); //$NON-NLS-1$
		TypeDeclaration klass = (TypeDeclaration) ne;
		Assert.assertTrue(
				"MyAnnotatedClass should have only one annotation", klass //$NON-NLS-1$
						.getAnnotations().size() == 1);
		Annotation klassAnnotation = klass.getAnnotations().get(0);
		Assert.assertTrue("wrong qualified name of the annotation", JavaUtil //$NON-NLS-1$
						.getQualifiedName(klassAnnotation.getType().getType())
						.equals("java.lang.Deprecated")); //$NON-NLS-1$
		Assert.assertTrue(
				"values of the annotation should be empty", klassAnnotation //$NON-NLS-1$
						.getValues().size() == 0);

		// the annotation on the returnRawList() method
		NamedElement ne2 = JavaUtil.getNamedElementByQualifiedName(getModel(),
				"annotations.MyAnnotatedClass.returnRawList()"); //$NON-NLS-1$
		Assert.assertNotNull(
				"annotations.MyAnnotatedClass.returnRawList() should exists", //$NON-NLS-1$
				ne);
		MethodDeclaration method = (MethodDeclaration) ne2;
		Assert.assertTrue(
				"returnRawList() should have only one annotation", method //$NON-NLS-1$
						.getAnnotations().size() == 1);
		Annotation methodAnnotation = method.getAnnotations().get(0);
		Assert.assertTrue("wrong qualified name of the annotation", //$NON-NLS-1$
				JavaUtil.getQualifiedName(methodAnnotation.getType().getType())
						.equals("java.lang.SuppressWarnings")); //$NON-NLS-1$
		Assert.assertTrue(
				"annotation should have only one value", methodAnnotation //$NON-NLS-1$
						.getValues().size() == 1);
		AnnotationMemberValuePair ann = methodAnnotation.getValues().get(0);
		Assert.assertNull(
				"member of the annotation should be null", ann.getMember()); //$NON-NLS-1$
		Assert.assertNotNull("value of the annotation should not be null", ann //$NON-NLS-1$
				.getValue());

		// the annotation on the toString() method
		NamedElement ne4 = JavaUtil.getNamedElementByQualifiedName(getModel(),
				"annotations.MyAnnotatedClass.toString()"); //$NON-NLS-1$
		Assert.assertNotNull(
				"annotations.MyAnnotatedClass.toString() should exists", //$NON-NLS-1$
				ne);
		MethodDeclaration toString = (MethodDeclaration) ne4;
		Assert.assertTrue(
				"toString() should have only one annotation", toString //$NON-NLS-1$
						.getAnnotations().size() == 1);
		Annotation toStringAnnotation = toString.getAnnotations().get(0);
		Assert.assertTrue("wrong qualified name of the annotation", JavaUtil //$NON-NLS-1$
				.getQualifiedName(toStringAnnotation.getType().getType())
				.equals("java.lang.Override")); //$NON-NLS-1$
		Assert.assertTrue("values of the annotation should be empty", //$NON-NLS-1$
				toStringAnnotation.getValues().size() == 0);

	}

	@Test
	public void duplicateproxy() {
		NamedElement ne = JavaUtil.getNamedElementByQualifiedName(getModel(),
				"java.util.ArrayList"); //$NON-NLS-1$
		Assert.assertNotNull("java.util.ArrayList should exists", ne); //$NON-NLS-1$

		NamedElement ne2 = JavaUtil.getNamedElementByQualifiedName(getModel(),
				"java.util.ArrayList.ArrayList()"); //$NON-NLS-1$
		Assert.assertNotNull(
				"java.util.ArrayList.ArrayList() should exists", ne); //$NON-NLS-1$

		Assert.assertTrue(
				"method should be a constructor", //$NON-NLS-1$
				((AbstractMethodDeclaration) ne2) instanceof ConstructorDeclaration);

		Assert.assertTrue("method should be a proxy", ne2.isProxy()); //$NON-NLS-1$

		Assert.assertTrue(
				"method should have only 3 usages", //$NON-NLS-1$
				((AbstractMethodDeclaration) ne2).getUsages().size() == JavaJUnitEMF.MAGIC_NUMBER);
	}

	@Test
	public void initializer() {
		NamedElement ne = JavaUtil.getNamedElementByQualifiedName(getModel(),
				"initializer.InitializerTest"); //$NON-NLS-1$
		Assert.assertNotNull("initializer.InitializerTest should exists", ne); //$NON-NLS-1$

		TypeDeclaration test = (TypeDeclaration) ne;
		Assert.assertTrue("class should have only 2 body declarations", test //$NON-NLS-1$
				.getBodyDeclarations().size() == 2);
		Assert.assertTrue("body declaration should be an Initializer", test //$NON-NLS-1$
				.getBodyDeclarations().get(0) instanceof Initializer);
		Assert.assertTrue("body declaration should be an Initializer", test //$NON-NLS-1$
				.getBodyDeclarations().get(1) instanceof Initializer);
	}

	@Test
	public void comments() {
		NamedElement ne = JavaUtil.getNamedElementByQualifiedName(getModel(),
				"comments.Comments"); //$NON-NLS-1$
		Assert.assertNotNull("comments.Comments should exists", ne); //$NON-NLS-1$

		TypeDeclaration type = (TypeDeclaration) ne;
		CompilationUnit cu = ne.getOriginalCompilationUnit();
		Assert.assertEquals(
				"CompilationUnit should have 1 comments", 1, cu.getComments().size()); //$NON-NLS-1$

		Assert.assertTrue(
				"CompilationUnit comment should be located at the beginning", //$NON-NLS-1$
				cu.getComments().get(0).isPrefixOfParent());
		Assert.assertTrue(
				"CompilationUnit comment should be located at the beginning", //$NON-NLS-1$
				!cu.getComments().get(0).isEnclosedByParent());

		Assert.assertEquals(
				"type should have 2 comments", 2, type.getComments().size()); //$NON-NLS-1$
		Assert.assertTrue(
				"second comment of type should be located at the end", //$NON-NLS-1$
				!type.getComments().get(1).isPrefixOfParent());
		Assert.assertTrue(
				"second comment of type should be located at the end", //$NON-NLS-1$
				!type.getComments().get(1).isEnclosedByParent());

		Comment c = type.getComments().get(0);
		Assert.assertTrue(
				"first comment should be a Javadoc", c instanceof Javadoc); //$NON-NLS-1$
		Javadoc firstDoc = (Javadoc) c;
		Assert.assertTrue("first comment should be 3 tags", firstDoc.getTags() //$NON-NLS-1$
				.size() == JavaJUnitEMF.MAGIC_NUMBER);

		Assert.assertTrue("1st tag should have only 2 fragments", firstDoc //$NON-NLS-1$
				.getTags().get(0).getFragments().size() == 2);

		Assert.assertTrue(
				"1st fragment should be a TextElement", //$NON-NLS-1$
				firstDoc.getTags().get(0).getFragments().get(0) instanceof TextElement);
		Assert.assertTrue("1st fragment should have no tag name", firstDoc //$NON-NLS-1$
				.getTags().get(0).getTagName() == null
				|| firstDoc.getTags().get(0).getTagName().length() == 0);
		Assert.assertTrue(
				"2nd fragment should be a TagElement", //$NON-NLS-1$
				firstDoc.getTags().get(0).getFragments().get(1) instanceof TagElement);
		Assert.assertTrue("2nd fragment should have '@link' as tag name", //$NON-NLS-1$
				((TagElement) firstDoc.getTags().get(0).getFragments().get(1))
						.getTagName().equals("@link")); //$NON-NLS-1$

		Assert.assertTrue("2nd tag should have '@author' as tag name", //$NON-NLS-1$
				firstDoc.getTags().get(1).getTagName().equals("@author")); //$NON-NLS-1$

		Assert.assertTrue("3rd tag should have '@see' as tag name", firstDoc //$NON-NLS-1$
				.getTags().get(2).getTagName().equals("@see")); //$NON-NLS-1$
		Assert.assertTrue("3rd tag should have one fragment", firstDoc //$NON-NLS-1$
				.getTags().get(2).getFragments().size() == 1);
		Assert.assertTrue(
				"1st fragment should be a MethodRef", //$NON-NLS-1$
				firstDoc.getTags().get(2).getFragments().get(0) instanceof MethodRef);
		MethodRef methodref = (MethodRef) firstDoc.getTags().get(2)
				.getFragments().get(0);
		Assert.assertTrue(
				"wrong qualified name for method", JavaUtil //$NON-NLS-1$
						.getQualifiedName(methodref.getMethod()).equals(
								"java.lang.String.toString()")); //$NON-NLS-1$
		Assert.assertNotNull("qualifier should not be null", methodref //$NON-NLS-1$
				.getQualifier());

	}

	@Test
	public void classorifaceproxy() {
		NamedElement ne1 = JavaUtil.getNamedElementByQualifiedName(getModel(),
				"classorifaceproxy.p1.Iface1"); //$NON-NLS-1$
		Assert.assertNotNull("classorifaceproxy.p1.Iface1 should exists", ne1); //$NON-NLS-1$

		NamedElement ne2 = JavaUtil.getNamedElementByQualifiedName(getModel(),
				"classorifaceproxy.p2.Iface2"); //$NON-NLS-1$
		Assert.assertNotNull("classorifaceproxy.p2.Iface2 should exists", ne2); //$NON-NLS-1$

		Assert.assertTrue("Iface1 should be an interface", //$NON-NLS-1$
				ne1 instanceof InterfaceDeclaration);
		Assert.assertTrue("Iface2 should be an interface", //$NON-NLS-1$
				ne2 instanceof InterfaceDeclaration);
	}

	@Test
	public void parameterizedtypeinmethoddecl() {
		NamedElement ne = JavaUtil.getNamedElementByQualifiedName(getModel(),
				"parameterizedtypeinmethoddecl.Class1"); //$NON-NLS-1$
		Assert.assertNotNull(
				"parameterizedtypeinmethoddecl.Class1 should exist", ne); //$NON-NLS-1$
		for (BodyDeclaration body : ((TypeDeclaration) ne)
				.getBodyDeclarations()) {
			if (body.getName().equals("accept")) { //$NON-NLS-1$

				MethodDeclaration method = (MethodDeclaration) body;
				Assert.assertTrue(
						"method accept() should have 2 type parameters", //$NON-NLS-1$
						method.getTypeParameters().size() == 2);
				TypeParameter returnType = method.getTypeParameters().get(0);
				TypeParameter parameter = method.getTypeParameters().get(1);
				Assert.assertSame(
						"types should be equal", returnType, method.getReturnType() //$NON-NLS-1$
								.getType());
				Assert.assertSame(
						"types should be equal", parameter, method.getParameters() //$NON-NLS-1$
								.get(1).getType().getType());
			}
		}
	}

	@Test
	public void modifiers() {
		NamedElement ne = JavaUtil.getNamedElementByQualifiedName(getModel(),
				"modifiers.Modifiers"); //$NON-NLS-1$
		Assert.assertNotNull("modifiers.Modifiers should exist", ne); //$NON-NLS-1$
		TypeDeclaration type = (TypeDeclaration) ne;
		Assert.assertTrue(type.getModifier().getVisibility()
				.equals(VisibilityKind.PUBLIC));
		Assert.assertTrue(type.getModifier().getInheritance()
				.equals(InheritanceKind.ABSTRACT));

		NamedElement ne1 = JavaUtil.getNamedElementByQualifiedName(getModel(),
				"modifiers.Modifiers.f"); //$NON-NLS-1$
		Assert.assertNotNull("modifiers.Modifiers.f should exist", ne1); //$NON-NLS-1$

		VariableDeclarationFragment var = (VariableDeclarationFragment) ne1;
		FieldDeclaration field = (FieldDeclaration) var.getVariablesContainer();
		Assert.assertTrue(field.getModifier().getInheritance()
				.equals(InheritanceKind.NONE));
		Assert.assertTrue(field.getModifier().getVisibility()
				.equals(VisibilityKind.PRIVATE));
		Assert.assertTrue(field.getModifier().isStatic());
		Assert.assertTrue(field.getModifier().isTransient());
		Assert.assertTrue(field.getModifier().isVolatile());
		Assert.assertFalse(field.getModifier().isNative());
		Assert.assertFalse(field.getModifier().isStrictfp());
		Assert.assertFalse(field.getModifier().isSynchronized());

		NamedElement ne2 = JavaUtil.getNamedElementByQualifiedName(getModel(),
				"modifiers.Modifiers.method()"); //$NON-NLS-1$
		Assert.assertNotNull("modifiers.Modifiers.method() should exist", ne2); //$NON-NLS-1$
		MethodDeclaration method = (MethodDeclaration) ne2;
		Assert.assertTrue(method.getModifier().getInheritance()
				.equals(InheritanceKind.FINAL));
		Assert.assertTrue(method.getModifier().getVisibility()
				.equals(VisibilityKind.PROTECTED));
		Assert.assertTrue(method.getModifier().isSynchronized());
		Assert.assertTrue(method.getModifier().isNative());
		Assert.assertFalse(method.getModifier().isStatic());
		Assert.assertFalse(method.getModifier().isStrictfp());
		Assert.assertFalse(method.getModifier().isTransient());
		Assert.assertFalse(method.getModifier().isVolatile());
	}

	@Test
	public void proxyField() {
		// PFClass1
		NamedElement ne1 = JavaUtil.getNamedElementByQualifiedName(getModel(),
				"proxyField.p1.PFClass1.s1"); //$NON-NLS-1$
		Assert.assertNotNull("proxyField.p1.PFClass1.s1 should exist", ne1); //$NON-NLS-1$
		Assert.assertFalse(
				"proxyField.p1.PFClass1.s1 should not be a proxy", ne1 //$NON-NLS-1$
						.isProxy());

		NamedElement ne2 = JavaUtil.getNamedElementByQualifiedName(getModel(),
				"proxyField.p1.PFClass1.s2"); //$NON-NLS-1$
		Assert.assertNotNull("proxyField.p1.PFClass1.s2 should exist", ne2); //$NON-NLS-1$
		Assert.assertFalse(
				"proxyField.p1.PFClass1.s2 should not be a proxy", ne2 //$NON-NLS-1$
						.isProxy());

		NamedElement ne3 = JavaUtil.getNamedElementByQualifiedName(getModel(),
				"proxyField.p1.PFClass1"); //$NON-NLS-1$
		Assert.assertNotNull("proxyField.p1.PFClass1 should exist", ne3); //$NON-NLS-1$
		TypeDeclaration pfClass1 = (TypeDeclaration) ne3;

		for (BodyDeclaration body : pfClass1.getBodyDeclarations()) {
			if (body instanceof FieldDeclaration) {
				Assert.assertTrue("field should have 2 fragments", //$NON-NLS-1$
						((FieldDeclaration) body).getFragments().size() == 2);
				Assert.assertSame(ne1, ((FieldDeclaration) body).getFragments()
						.get(0));
				Assert.assertSame(ne2, ((FieldDeclaration) body).getFragments()
						.get(1));
			}
		}

		// PFClass2
		NamedElement ne5 = JavaUtil.getNamedElementByQualifiedName(getModel(),
				"proxyField.p2.PFClass2.a1"); //$NON-NLS-1$
		Assert.assertNotNull("proxyField.p2.PFClass2.a1 should exist", ne5); //$NON-NLS-1$
		Assert.assertFalse(
				"proxyField.p2.PFClass2.a1 should not be a proxy", ne5 //$NON-NLS-1$
						.isProxy());

		NamedElement ne6 = JavaUtil.getNamedElementByQualifiedName(getModel(),
				"proxyField.p2.PFClass2.a2"); //$NON-NLS-1$
		Assert.assertNotNull("proxyField.p2.PFClass2.a2 should exist", ne6); //$NON-NLS-1$
		Assert.assertFalse(
				"proxyField.p2.PFClass2.a2 should not be a proxy", ne6 //$NON-NLS-1$
						.isProxy());

		Assert.assertSame(
				"fragments should have the same fieldDeclaration", ne5 //$NON-NLS-1$
						.eContainer(), ne6.eContainer());

		NamedElement ne7 = JavaUtil.getNamedElementByQualifiedName(getModel(),
				"proxyField.p2.PFClass2.b1"); //$NON-NLS-1$
		Assert.assertNotNull("proxyField.p2.PFClass2.b1 should exist", ne7); //$NON-NLS-1$
		Assert.assertFalse(
				"proxyField.p2.PFClass2.b1 should not be a proxy", ne7 //$NON-NLS-1$
						.isProxy());

		NamedElement ne8 = JavaUtil.getNamedElementByQualifiedName(getModel(),
				"proxyField.p2.PFClass2.b2"); //$NON-NLS-1$
		Assert.assertNotNull("proxyField.p2.PFClass2.b2 should exist", ne8); //$NON-NLS-1$
		Assert.assertFalse(
				"proxyField.p2.PFClass2.b2 should not be a proxy", ne8 //$NON-NLS-1$
						.isProxy());

		Assert.assertSame(
				"fragments should have the same fieldDeclaration", ne7 //$NON-NLS-1$
						.eContainer(), ne8.eContainer());

		NamedElement ne9 = JavaUtil.getNamedElementByQualifiedName(getModel(),
				"proxyField.p2.PFClass2.c1"); //$NON-NLS-1$
		Assert.assertNotNull("proxyField.p2.PFClass2.c1 should exist", ne9); //$NON-NLS-1$
		Assert.assertFalse(
				"proxyField.p2.PFClass2.c1 should not be a proxy", ne9 //$NON-NLS-1$
						.isProxy());

		NamedElement ne10 = JavaUtil.getNamedElementByQualifiedName(getModel(),
				"proxyField.p2.PFClass2.c2"); //$NON-NLS-1$
		Assert.assertNotNull("proxyField.p2.PFClass2.c2 should exist", ne10); //$NON-NLS-1$
		Assert.assertFalse(
				"proxyField.p2.PFClass2.c2 should not be a proxy", ne10 //$NON-NLS-1$
						.isProxy());

		Assert.assertSame(
				"fragments should have the same fieldDeclaration", ne9 //$NON-NLS-1$
						.eContainer(), ne10.eContainer());

		NamedElement ne11 = JavaUtil.getNamedElementByQualifiedName(getModel(),
				"proxyField.p2.PFClass2"); //$NON-NLS-1$
		Assert.assertNotNull("proxyField.p2.PFClass2 should exist", ne11); //$NON-NLS-1$
		TypeDeclaration pfClass2 = (TypeDeclaration) ne11;

		for (BodyDeclaration body : pfClass2.getBodyDeclarations()) {
			if (body instanceof FieldDeclaration) {
				Assert.assertTrue("field should have 2 fragments", //$NON-NLS-1$
						((FieldDeclaration) body).getFragments().size() == 2);
			}
		}
	}

}
