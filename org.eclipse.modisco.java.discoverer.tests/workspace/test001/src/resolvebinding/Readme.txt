/*******************************************************************************
 * Copyright (c) 2009 Mia-Software and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Gregoire DUPE (Mia-Software)
 *    Romain Dervaux (Mia-Software)
 *******************************************************************************/
This data set has be created to produce the following error :

?? not sure what the preceding means and we seem to use 1.8 without problem ??

--------------------
eclipse.buildId=unknown
java.version=1.6.0_13
java.vendor=Sun Microsystems Inc.
BootLoader constants: OS=win32, ARCH=x86, WS=win32, NL=fr_FR
Framework arguments:  -product org.eclipse.sdk.ide
Command-line arguments:  -product org.eclipse.sdk.ide -data C:\gregoire_dupe\wokspaces\modisco_java\org.eclipse.modisco.java.discoverer.tests\workspace -dev file:C:/gregoire_dupe/wokspaces/modisco_java/.metadata/.plugins/org.eclipse.pde.core/junit_workspace/dev.properties -debug C:\gregoire_dupe\wokspaces\modisco_java\.metadata\.plugins\org.eclipse.pde.core\junit_workspace/.options -os win32 -ws win32 -arch x86


Warning
Wed Jul 15 12:26:49 CEST 2009
Failed to compute qualifiedName:resolvebinding.p1.ResolveBindind1.m1(<<null>>) ; searchedQualifiedName= resolvebinding.p1.ResolveBindind1.SubResolveBinding1.SubResolveBinding1()

java.lang.Exception
	at org.eclipse.modisco.java.JavaDiscovererUtils.getNamedElementByQualifiedName(JavaDiscovererUtils.java:191)
	at org.eclipse.modisco.java.io.java.binding.BindingManager.searchQNInModel(BindingManager.java:296)
	at org.eclipse.modisco.java.io.java.binding.BindingManager.getTarget(BindingManager.java:199)
	at org.eclipse.modisco.java.io.java.binding.BindingManager.resolveBindings(BindingManager.java:261)
	at org.eclipse.modisco.java.discoverer.cdo.cdo2.JavaReaderCDO2.reset(JavaReaderCDO2.java:20)
	at org.eclipse.modisco.java.discoverer.tests.emfstat.JavaReaderEMFStat.readModel(JavaReaderEMFStat.java:89)
	at org.eclipse.modisco.java.discoverer.cdo.cdo2.JavaDiscovererCDO2.getJ2SE5ModelFromJavaSource(JavaDiscovererCDO2.java:15)
	at org.eclipse.modisco.java.discoverer.tests.emfstat.DiscoverJ2se5ModelFromJavaProjectEMFStat$1.run(DiscoverJ2se5ModelFromJavaProjectEMFStat.java:66)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:55)


--------------------
Happen only with CDO