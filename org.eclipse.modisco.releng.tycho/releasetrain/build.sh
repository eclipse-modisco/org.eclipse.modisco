#!/bin/sh
# Copyright (c) 2016 Mia-Software.
# All rights reserved. This program and the accompanying materials
# are made available under the terms of the Eclipse Public License v1.0
# which accompanies this distribution, and is available at
# http://www.eclipse.org/legal/epl-v10.html
#
# Contributors:
#    Grégoire Dupé - initial implementation

<<<<<<< HEAD   (f0d4aa Merge branch 'maintenance-0.13' into maintenance-1.0)
RT_VERSION=Neon_maintenance

echo $DISPLAY
echo $PATH

rm -rf org.eclipse.simrel.build
git clone --branch $RT_VERSION http://git.eclipse.org/gitroot/simrel/org.eclipse.simrel.build.git org.eclipse.simrel.build

rm -rf org.eclipse.emf.facet.releng
git clone --branch master http://git.eclipse.org/gitroot/facet/org.eclipse.emf.facet.releng.git org.eclipse.emf.facet.releng

rm -rf org.eclipse.emf.facet.main
git clone --branch master http://git.eclipse.org/gitroot/facet/org.eclipse.emf.facet.main.git org.eclipse.emf.facet.main
rm -rf org.eclipse.emf.facet.archi.tech.rules
ln -s org.eclipse.emf.facet.main/org.eclipse.emf.facet.archi.tech.rules

#Bug 415657 - Disabling of 'org.eclipse.modisco.jee.jsp.discoverer' to deliver to Luna M1
#rm -rf org.eclipse.modisco.releasetrain/org.eclipse.modisco.jee.jsp.discoverer*

rm -rf org.eclipse.modisco.releasetrain/org.eclipse.modisco.archi.tech.targetplatform/org.eclipse.modisco.archi.tech.targetplatform-indigo.target

# UI tests needs a window manager
metacity --replace --sm-disable &

#### BEING : Remove the plug-ins requiring Birt #####
#
#rm -rf org.eclipse.modisco.releasetrain/org.eclipse.gmt.modisco.java.discoverer.benchmark*
#rm -rf org.eclipse.modisco.releasetrain/org.eclipse.modisco.utils.chart.*
#rm -rf org.eclipse.modisco.releasetrain/org.eclipse.modisco.infra.discovery.benchmark.*
#rm -rf org.eclipse.modisco.releasetrain/org.eclipse.modisco.java.discoverer.benchmark*
#rm -rf org.eclipse.modisco.releasetrain/org.eclipse.modisco.java.composition.discoverer.benchmark
#
#SOURCE=org.eclipse.modisco.releasetrain/org.eclipse.modisco.updatesite/site.xml
#BACKUP=$SOURCE-`date +%Y%m%d-%H%M%S%N`.xml
#mv $SOURCE $BACKUP
#sed '/discovery.benchmark/{N;N;d}' $BACKUP > $SOURCE
#
#SOURCE=org.eclipse.modisco.releasetrain/org.eclipse.modisco.doc.api.report.eclipsepackage/org.eclipse.modisco.doc.api.report.eclipsepackage.product
#BACKUP=$SOURCE-`date +%Y%m%d-%H%M%S%N`.xml
#mv $SOURCE $BACKUP
#sed '/org.eclipse.modisco.utils.chart.feature/d' $BACKUP > $SOURCE
#
#SOURCE=org.eclipse.modisco.releasetrain/org.eclipse.modisco.doc.api.report.eclipsepackage/org.eclipse.modisco.doc.api.report.eclipsepackage.product
#BACKUP=$SOURCE-`date +%Y%m%d-%H%M%S%N`.xml
#mv $SOURCE $BACKUP
#sed '/org.eclipse.modisco.infra.discovery.benchmark/d' $BACKUP > $SOURCE
#
#SOURCE=org.eclipse.modisco.releasetrain/org.eclipse.modisco.doc.api.report.eclipsepackage/org.eclipse.modisco.doc.api.report.eclipsepackage.product
#BACKUP=$SOURCE-`date +%Y%m%d-%H%M%S%N`.xml
#mv $SOURCE $BACKUP
#sed '/org.eclipse.modisco.java.discoverer.benchmark/d' $BACKUP > $SOURCE
#
#### END: Remove the plug-ins requiring Birt #####

=======
RT_VERSION=Mars_maintenance

echo $DISPLAY
echo $PATH

rm -rf org.eclipse.simrel.build
git clone --branch $RT_VERSION http://git.eclipse.org/gitroot/simrel/org.eclipse.simrel.build.git org.eclipse.simrel.build

rm -rf org.eclipse.emf.facet.releng
git clone --branch master http://git.eclipse.org/gitroot/facet/org.eclipse.emf.facet.releng.git org.eclipse.emf.facet.releng

rm -rf org.eclipse.emf.facet.main
git clone --branch master http://git.eclipse.org/gitroot/facet/org.eclipse.emf.facet.main.git org.eclipse.emf.facet.main
rm -rf org.eclipse.emf.facet.archi.tech.rules
ln -s org.eclipse.emf.facet.main/org.eclipse.emf.facet.archi.tech.rules

rm -rf org.eclipse.modisco.releasetrain/org.eclipse.modisco.archi.tech.targetplatform/org.eclipse.modisco.archi.tech.targetplatform-indigo.target

# UI tests needs a window manager
metacity --replace --sm-disable &
>>>>>>> BRANCH (384d1d The new version of the releng dosen't support the use of var)
