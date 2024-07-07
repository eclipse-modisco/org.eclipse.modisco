The Tycho build automatically promotes downloads and updates, so no cron job help is necessary.
The Tycho build minimises the need for shell activity by auto-registering in P2 repos including the latest.

The qvtd.aggrcon file is in the ssh://'committer-name'@git.eclipse.org:29418/simrel/org.eclipse.simrel.build.git repo.

The updates can be checked by looking for the new entry on https://www.eclipse.org/mmt/downloads/?project=qvtd
or installing new software from e.g. http://download.eclipse.org/modeling/mdt/modisco/updates/milestones/0.20.0/S201408191819
or installing new software from e.g. http://download.eclipse.org/modeling/mdt/modisco/updates/releases/0.20.0

A new milestone build was formerly manually added to the composite repository by:

logon to build.eclipse.org
cd ~/downloads/modeling/mdt/modisco/updates/milestones/0.20.0
ant -f /shared/modeling/tools/promotion/manage-composite.xml add -Dchild.repository=S201408191819 -Dcomposite.name="QVTd 0.20.0 milestones"

The SimRel aggregator is configured by GIT\org.eclipse.simrel.build\qvtd.aggrcon to use an explicit milestone entry

So edit qvtd.aggrcon to update 
location="https://download.eclipse.org/modeling/mdt/modisco/updates/milestones/0.20.0/S201408191819"
commit with a comment such as [qvtd] 3.10.0M1 for 2019-09 and Push to Gerrit (refs/for/master)
The Push dialog identifies a Gerrit such as https://git.eclipse.org/r/149210
Open the Gerrit, Open the Buld job and its console
When the build succeeds, refresh the Gerrit, Click CodeReview+2, Click Submit.
Refresh 

RC builds are just aliases for regular S builds.
The final R build rebuilds the final RC build and is built as late as possible for contribution to the final SimRel build.
For the R  build update qvtd.aggrcon to
location="http://download.eclipse.org/modeling/mdt/modisco/updates/releases/3.10.0"

After a few hours the mirrors can be checked by:
https://www.eclipse.org/downloads/download.php?file=/modeling/mdt/modisco/updates/releases/0.20.0&format=xml

Disable the Promoter job until GIT has been updated for the next release number.

After each first repo contribution, remember to update the aggregates e.g.
cd ~/downloads/modeling/mdt/modisco/updates/milestones
ant -f /shared/modeling/tools/promotion/manage-composite.xml add -Dchild.repository=0.20.0

Downloads are accessible at
cd ~/downloads/modeling/mdt/modisco/downloads/drops/0.20.0

Archives are accessible at
cd /home/data/httpd/archive.eclipse.org/modeling/mdt/modisco/downloads/drops
cd /home/data/httpd/archive.eclipse.org/modeling/mdt/modisco/updates/releases

--------
Jenkins config:

Restrict where this project can run: migration
GIT repo: git://git.eclipse.org/gitroot/mmt/org.eclipse.qvtd.git

Build periodically: H 4 * * 0
Poll SCM schedule: 0 */6 * * *

Run XVNC during build
Create a dedicated Xauthority file per build?

Build:

apache-maven-latest
--show-version clean verify -P$BUILD_TYPE -Psign
releng/org.eclipse.qvtd.releng.tycho/pom.xml
BUILD_TYPE=$BUILD_TYPE
BUILD_ALIAS=$BUILD_ALIAS

Publish JUnit test report: tests/*.test*/target/surefire-reports/*.xml,tests/*.test*/target/surefire-reports/*/*.xml

Archive the artefacts: releng/org.eclipse.qvtd.releng.build-site/target/*.zip,releng/org.eclipse.qvtd.releng.build-site/target/publisher.properties,releng/org.eclipse.qvtd.releng.build-site/target/downloads.sh,releng/org.eclipse.qvtd.releng.build-site/target/updates.sh
Trigger Promoter when stable using releng/org.eclipse.qvtd.releng.build-site/target/publisher.properties




-- Drops maintenance -- https://download.eclipse.org/modeling/mdt/modisco/downloads/drops
ssh genie.modisco@projects-storage.eclipse.org ls -la /home/data/httpd/download.eclipse.org/modeling/mdt/modisco/downloads/drops/1.5.2
ssh genie.modisco@projects-storage.eclipse.org rm -rf  /home/data/httpd/download.eclipse.org/modeling/mdt/modisco/downloads/drops/1.5.2/N201909*

-- Updates maintenance -- https://download.eclipse.org/modeling/mdt/modisco/updates
ssh genie.modisco@projects-storage.eclipse.org ls -la /home/data/httpd/download.eclipse.org/modeling/mdt/modisco/updates/releases
ssh genie.modisco@projects-storage.eclipse.org pwd ; cd /home/data/httpd/download.eclipse.org/modeling/mdt/modisco/updates/releases ; pwd ; ls -la
ssh genie.modisco@projects-storage.eclipse.org cd /home/data/httpd/download.eclipse.org/modeling/mdt/modisco/updates/releases ; export JAVA_HOME=/shared/common/jdk1.8.0_x64-latest ; java -version ; /shared/common/apache-ant-latest/bin/ant -f /shared/modeling/tools/promotion/manage-composite.xml remove -Dchild.repository=0.14.0
ssh genie.modisco@projects-storage.eclipse.org rm -rf /home/data/httpd/download.eclipse.org/modeling/mdt/modisco/updates/releases/0.14.0

ssh genie.modisco@projects-storage.eclipse.org cd /home/data/httpd/download.eclipse.org/modeling/mdt/modisco/updates/milestones ; export JAVA_HOME=/shared/common/jdk1.8.0_x64-latest ; java -version ; /shared/common/apache-ant-latest/bin/ant -f /shared/modeling/tools/promotion/manage-composite.xml remove -Dchild.repository=0.20.0
ssh genie.modisco@projects-storage.eclipse.org rm -rf /home/data/httpd/download.eclipse.org/modeling/mdt/modisco/updates/milestones/0.20.0

ssh genie.modisco@projects-storage.eclipse.org cd /home/data/httpd/download.eclipse.org/modeling/mdt/modisco/updates/nightly ; export JAVA_HOME=/shared/common/jdk1.8.0_x64-latest ; java -version ; /shared/common/apache-ant-latest/bin/ant -f /shared/modeling/tools/promotion/manage-composite.xml remove -Dchild.repository=0.20.0
ssh genie.modisco@projects-storage.eclipse.org rm -rf /home/data/httpd/download.eclipse.org/modeling/mdt/modisco/updates/nightly/0.20.0


-- Drops archiving -- https://archive.eclipse.org/modeling/mdt/modisco/downloads/drops ---- and edit GIT\mdt\downloads\extras-modisco.php
ssh genie.modisco@projects-storage.eclipse.org ls -la /home/data/httpd/archive.eclipse.org/modeling/mdt/modisco/downloads/drops
ssh genie.modisco@projects-storage.eclipse.org cd /home/data/httpd/download.eclipse.org/modeling/mdt/modisco/downloads/drops ; mv 0.14.0 /home/data/httpd/archive.eclipse.org/modeling/mdt/modisco/downloads/drops

-- Updates archiving
ssh genie.modisco@projects-storage.eclipse.org ls -la /home/data/httpd/archive.eclipse.org/modeling/mdt/modisco/updates/releases
ssh genie.modisco@projects-storage.eclipse.org rm -rf /home/data/httpd/archive.eclipse.org/modeling/mdt/modisco/updates/releases/zz*

ssh genie.modisco@projects-storage.eclipse.org cd /home/data/httpd/download.eclipse.org/modeling/mdt/modisco/updates/releases ; export JAVA_HOME=/shared/common/jdk1.8.0_x64-latest ; java -version ; /shared/common/apache-ant-latest/bin/ant -f /shared/modeling/tools/promotion/manage-composite.xml remove -Dchild.repository=0.14.0
ssh genie.modisco@projects-storage.eclipse.org cd /home/data/httpd/download.eclipse.org/modeling/mdt/modisco/updates/releases ; mv 0.14.0 /home/data/httpd/archive.eclipse.org/modeling/mdt/modisco/updates/releases
ssh genie.modisco@projects-storage.eclipse.org cd /home/data/httpd/archive.eclipse.org/modeling/mdt/modisco/updates/releases ; export JAVA_HOME=/shared/common/jdk1.8.0_x64-latest ; java -version ; /shared/common/apache-ant-latest/bin/ant -f /shared/modeling/tools/promotion/manage-composite.xml add -Dchild.repository=0.14.0

[INFO] [1mReactor Build Order:[m
[INFO] 
[INFO] org.eclipse.modisco.releng.tycho                                   [pom]
[INFO] org.eclipse.modisco-folder                                         [pom]
[INFO] org.eclipse.modisco.facet.common.core                   [eclipse-plugin]
[INFO] org.eclipse.modisco.facet.util.core                     [eclipse-plugin]
[INFO] org.eclipse.modisco.facet.common.ui                     [eclipse-plugin]
[INFO] org.eclipse.modisco.facet.util.emf.catalog.metamodel    [eclipse-plugin]
[INFO] org.eclipse.modisco.facet.util.emf.catalog              [eclipse-plugin]
[INFO] org.eclipse.modisco.facet.util.pde.core                 [eclipse-plugin]
[INFO] org.eclipse.modisco.facet.util.emf.core                 [eclipse-plugin]
[INFO] org.eclipse.modisco.facet.efacet.metamodel              [eclipse-plugin]
[INFO] org.eclipse.modisco.facet.util.ui                       [eclipse-plugin]
[INFO] org.eclipse.modisco.facet.util.swt                      [eclipse-plugin]
[INFO] org.eclipse.modisco.facet.util.emf.ui                   [eclipse-plugin]
[INFO] org.eclipse.modisco.facet.efacet.core                   [eclipse-plugin]
[INFO] org.eclipse.modisco.facet.custom.metamodel              [eclipse-plugin]
[INFO] org.eclipse.modisco.facet.custom.core                   [eclipse-plugin]
[INFO] org.eclipse.modisco.facet.query.java.metamodel          [eclipse-plugin]
[INFO] org.eclipse.modisco.facet.query.java.core               [eclipse-plugin]
[INFO] org.eclipse.modisco.facet.util.jface.ui                 [eclipse-plugin]
[INFO] org.eclipse.modisco.facet.efacet.ui                     [eclipse-plugin]
[INFO] org.eclipse.modisco.facet.custom.ui                     [eclipse-plugin]
[INFO] org.eclipse.modisco.facet.efacet.edit.core              [eclipse-plugin]
[INFO] org.eclipse.modisco.facet.widgets                       [eclipse-plugin]
[INFO] org.eclipse.modisco.facet.widgets.celleditors           [eclipse-plugin]
[INFO] org.eclipse.modisco.facet.widgets.celleditors.ecore     [eclipse-plugin]
[INFO] org.eclipse.modisco.examples                            [eclipse-plugin]
[INFO] org.eclipse.modisco.infra.common.core                   [eclipse-plugin]
[INFO] org.eclipse.modisco.infra.common.ui                     [eclipse-plugin]
[INFO] org.eclipse.modisco.infra.query                         [eclipse-plugin]
[INFO] org.eclipse.modisco.infra.facet                         [eclipse-plugin]
[INFO] org.eclipse.modisco.util.emf.core                       [eclipse-plugin]
[INFO] org.eclipse.modisco.infra.query.core                    [eclipse-plugin]
[INFO] org.eclipse.modisco.infra.facet.core                    [eclipse-plugin]
[INFO] org.eclipse.modisco.infra.browser.custom                [eclipse-plugin]
[INFO] org.eclipse.modisco.infra.browser.custom.core           [eclipse-plugin]
[INFO] org.eclipse.modisco.infra.browser.uicore                [eclipse-plugin]
[INFO] org.eclipse.modisco.infra.query.edit                    [eclipse-plugin]
[INFO] org.eclipse.modisco.infra.facet.edit                    [eclipse-plugin]
[INFO] org.eclipse.modisco.infra.facet.editor                  [eclipse-plugin]
[INFO] org.eclipse.modisco.infra.facet.ui                      [eclipse-plugin]
[INFO] org.eclipse.modisco.infra.query.editor                  [eclipse-plugin]
[INFO] org.eclipse.modisco.infra.query.ui                      [eclipse-plugin]
[INFO] org.eclipse.modisco.infra.browser                       [eclipse-plugin]
[INFO] org.eclipse.modisco.infra.browser.custom.ui             [eclipse-plugin]
[INFO] org.eclipse.modisco.infra.browser.custom.editor         [eclipse-plugin]
[INFO] org.eclipse.modisco.java                                [eclipse-plugin]
[INFO] org.eclipse.modisco.java.queries                        [eclipse-plugin]
[INFO] org.eclipse.modisco.infra.browser.custom.examples.java.jdk [eclipse-plugin]
[INFO] org.eclipse.modisco.infra.browser.custom.examples.uml   [eclipse-plugin]
[INFO] org.eclipse.modisco.infra.browser.uicore.examples.cnf   [eclipse-plugin]
[INFO] org.eclipse.modisco.infra.capabilities                  [eclipse-plugin]
[INFO] org.eclipse.modisco.infra.common.cdo                    [eclipse-plugin]
[INFO] org.eclipse.modisco.infra.common.cdo.derby              [eclipse-plugin]
[INFO] org.eclipse.modisco.infra.prefuse                       [eclipse-plugin]
[INFO] org.eclipse.modisco.infra.query.jxpath                  [eclipse-plugin]
[INFO] org.eclipse.modisco.java.browser.customization          [eclipse-plugin]
[INFO] org.eclipse.modisco.java.cdo                            [eclipse-plugin]
[INFO] org.eclipse.modisco.util.atl.core                       [eclipse-plugin]
[INFO] org.eclipse.modisco.infra.discovery                     [eclipse-plugin]
[INFO] org.eclipse.modisco.infra.discovery.core                [eclipse-plugin]
[INFO] org.eclipse.modisco.omg.kdm                             [eclipse-plugin]
[INFO] org.eclipse.modisco.kdm.source.discoverer               [eclipse-plugin]
[INFO] org.eclipse.modisco.kdm.source.extension                [eclipse-plugin]
[INFO] org.eclipse.modisco.java.discoverer                     [eclipse-plugin]
[INFO] org.eclipse.modisco.java.generation                     [eclipse-plugin]
[INFO] org.eclipse.modisco.omg.kdm.edit                        [eclipse-plugin]
[INFO] org.eclipse.modisco.tool.metricsvisualizationbuilder    [eclipse-plugin]
[INFO] org.eclipse.modisco.xml                                 [eclipse-plugin]
[INFO] org.eclipse.modisco.xml.browser.customization           [eclipse-plugin]
[INFO] org.eclipse.modisco.manifest                            [eclipse-plugin]
[INFO] org.eclipse.modisco.eclipseplugin                       [eclipse-plugin]
[INFO] org.eclipse.modisco.manifest.discoverer                 [eclipse-plugin]
[INFO] org.eclipse.modisco.properties.discoverer               [eclipse-plugin]
[INFO] org.eclipse.modisco.xml.discoverer                      [eclipse-plugin]
[INFO] org.eclipse.modisco.eclipseplugin.discoverer            [eclipse-plugin]
[INFO] org.eclipse.modisco.infra.discovery.ui                  [eclipse-plugin]
[INFO] org.eclipse.modisco.eclipseplugin.discoverer.ui         [eclipse-plugin]
[INFO] org.eclipse.modisco.infra.browser.ecore.core            [eclipse-plugin]
[INFO] org.eclipse.modisco.infra.browser.editor.ui             [eclipse-plugin]
[INFO] org.eclipse.modisco.utils.chart.metamodel               [eclipse-plugin]
[INFO] org.eclipse.modisco.infra.discovery.benchmark.metamodel [eclipse-plugin]
[INFO] org.eclipse.modisco.utils.chart.birt.core               [eclipse-plugin]
[INFO] org.eclipse.modisco.utils.core                          [eclipse-plugin]
[INFO] org.eclipse.modisco.infra.discovery.benchmark.core      [eclipse-plugin]
[INFO] org.eclipse.modisco.infra.discovery.benchmark.ui        [eclipse-plugin]
[INFO] org.eclipse.modisco.java.composition                    [eclipse-plugin]
[INFO] org.eclipse.modisco.java.composition.browser.customization [eclipse-plugin]
[INFO] org.eclipse.modisco.java.composition.discoverer         [eclipse-plugin]
[INFO] org.eclipse.modisco.java.composition.discoverer.ui      [eclipse-plugin]
[INFO] org.eclipse.modisco.kdm.source.extension.ui             [eclipse-plugin]
[INFO] org.eclipse.modisco.java.composition.ui                 [eclipse-plugin]
[INFO] org.eclipse.modisco.java.discoverer.cdo                 [eclipse-plugin]
[INFO] org.eclipse.modisco.java.discoverer.ui                  [eclipse-plugin]
[INFO] org.eclipse.modisco.jee                                 [eclipse-plugin]
[INFO] org.eclipse.modisco.jee.ejbjar                          [eclipse-plugin]
[INFO] org.eclipse.modisco.jee.ejbjar.discoverer               [eclipse-plugin]
[INFO] org.eclipse.modisco.jee.ejbjar.discoverer.ui            [eclipse-plugin]
[INFO] org.eclipse.modisco.jee.facet                           [eclipse-plugin]
[INFO] org.eclipse.modisco.jee.jsp                             [eclipse-plugin]
[INFO] org.eclipse.modisco.jee.jsp.browser.customization       [eclipse-plugin]
[INFO] org.eclipse.modisco.jee.jsp.discoverer                  [eclipse-plugin]
[INFO] org.eclipse.modisco.jee.jsp.discoverer.ui               [eclipse-plugin]
[INFO] org.eclipse.modisco.jee.jsp.generation                  [eclipse-plugin]
[INFO] org.eclipse.modisco.jee.queries                         [eclipse-plugin]
[INFO] org.eclipse.modisco.jee.webapp                          [eclipse-plugin]
[INFO] org.eclipse.modisco.jee.webapp.discoverer               [eclipse-plugin]
[INFO] org.eclipse.modisco.jee.webapp.discoverer.ui            [eclipse-plugin]
[INFO] org.eclipse.modisco.kdm.source.discoverer.ui            [eclipse-plugin]
[INFO] org.eclipse.modisco.kdm.uml2converter                   [eclipse-plugin]
[INFO] org.eclipse.modisco.kdm.uml2converter.ui                [eclipse-plugin]
[INFO] org.eclipse.modisco.manifest.discoverer.ui              [eclipse-plugin]
[INFO] org.eclipse.modisco.omg.gastm                           [eclipse-plugin]
[INFO] org.eclipse.modisco.omg.smm                             [eclipse-plugin]
[INFO] org.eclipse.modisco.properties.discoverer.ui            [eclipse-plugin]
[INFO] org.eclipse.modisco.usecase.simpletransformationschain  [eclipse-plugin]
[INFO] org.eclipse.modisco.usecase.modelfilter                 [eclipse-plugin]
[INFO] org.eclipse.modisco.usecase.modelfilter.dependencies.ui [eclipse-plugin]
[INFO] org.eclipse.modisco.usecase.modelfilter.methodcalls     [eclipse-plugin]
[INFO] org.eclipse.modisco.usecase.modelfilter.methodcalls.discoverer [eclipse-plugin]
[INFO] org.eclipse.modisco.usecase.modelfilter.methodcalls.discoverer.ui [eclipse-plugin]
[INFO] org.eclipse.modisco.usecase.modelfilter.ui              [eclipse-plugin]
[INFO] org.eclipse.modisco.usecase.simpletransformationschain.ui [eclipse-plugin]
[INFO] org.eclipse.modisco.workflow                            [eclipse-plugin]
[INFO] org.eclipse.modisco.workflow.core                       [eclipse-plugin]
[INFO] org.eclipse.modisco.workflow.ui                         [eclipse-plugin]
[INFO] org.eclipse.modisco.xml.discoverer.ui                   [eclipse-plugin]
[INFO] org.eclipse.modisco.infra.omg.doc                       [eclipse-plugin]
[INFO] org.eclipse.modisco.infra.omg.feature                  [eclipse-feature]
[INFO] org.eclipse.modisco.examples.feature                   [eclipse-feature]
[INFO] org.eclipse.modisco.java.cdo.feature                   [eclipse-feature]
[INFO] org.eclipse.modisco.java.doc                            [eclipse-plugin]
[INFO] org.eclipse.modisco.java.feature                       [eclipse-feature]
[INFO] org.eclipse.modisco.jee.doc                             [eclipse-plugin]
[INFO] org.eclipse.modisco.jee.feature                        [eclipse-feature]
[INFO] org.eclipse.modisco.facet.feature                      [eclipse-feature]
[INFO] org.eclipse.modisco.infrastructure.doc                  [eclipse-plugin]
[INFO] org.eclipse.modisco.infra.browser.feature              [eclipse-feature]
[INFO] org.eclipse.modisco.doc                                 [eclipse-plugin]
[INFO] org.eclipse.modisco.infrastructure.feature             [eclipse-feature]
[INFO] org.eclipse.modisco.xml.doc                             [eclipse-plugin]
[INFO] org.eclipse.modisco.xml.feature                        [eclipse-feature]
[INFO] org.eclipse.modisco.eclipse.feature                    [eclipse-feature]
[INFO] org.eclipse.modisco.sdk.feature                        [eclipse-feature]
[INFO] org.eclipse.modisco.all.feature                        [eclipse-feature]
[INFO] org.eclipse.modisco.infra.cdo.derby.feature            [eclipse-feature]
[INFO] org.eclipse.modisco.utils.chart.feature                [eclipse-feature]
[INFO] org.eclipse.modisco.infra.discovery.benchmark.feature  [eclipse-feature]
[INFO] org.eclipse.modisco.thirdparties                       [eclipse-feature]
[INFO] org.eclipse.modisco.usecase.modelfilter.doc             [eclipse-plugin]
[INFO] org.eclipse.modisco.usecase.modelfilter.feature        [eclipse-feature]
[INFO] org.eclipse.modisco.usecase.simpletransformationchain.doc [eclipse-plugin]
[INFO] org.eclipse.modisco.usecase.simpletransformationschain.feature [eclipse-feature]
[INFO] org.eclipse.modisco.common.tests                        [eclipse-plugin]
[INFO] org.eclipse.modisco.facet.util.tests.swtbot             [eclipse-plugin]
[INFO] org.eclipse.modisco.infra.discovery.benchmark           [eclipse-plugin]
[INFO] org.eclipse.modisco.java.classiceobject                 [eclipse-plugin]
[INFO] org.eclipse.modisco.java.nousages                       [eclipse-plugin]
[INFO] org.eclipse.modisco.java.discoverer.benchmark.javaBenchmark [eclipse-plugin]
[INFO] org.eclipse.modisco.java.nousages.cdo                   [eclipse-plugin]
[INFO] org.eclipse.modisco.java.discoverer.benchmark           [eclipse-plugin]
[INFO] org.eclipse.modisco.infra.browser.custom.examples.java.jdk.tests [eclipse-test-plugin]
[INFO] org.eclipse.modisco.infra.browser.custom.examples.uml.tests [eclipse-test-plugin]
[INFO] org.eclipse.modisco.infra.query.tests              [eclipse-test-plugin]
[INFO] org.eclipse.modisco.infra.browser.custom.tests     [eclipse-test-plugin]
[INFO] org.eclipse.modisco.infra.browser.tests            [eclipse-test-plugin]
[INFO] org.eclipse.modisco.infra.common.core.tests        [eclipse-test-plugin]
[INFO] org.eclipse.modisco.infra.discovery.core.tests     [eclipse-test-plugin]
[INFO] org.eclipse.modisco.infra.discovery.ui.tests       [eclipse-test-plugin]
[INFO] org.eclipse.modisco.infra.doc.tests                [eclipse-test-plugin]
[INFO] org.eclipse.modisco.infra.facet.tests              [eclipse-test-plugin]
[INFO] org.eclipse.modisco.java.browser.customization.tests [eclipse-test-plugin]
[INFO] org.eclipse.modisco.java.discoverer.tests          [eclipse-test-plugin]
[INFO] org.eclipse.modisco.java.composition.discoverer.tests [eclipse-test-plugin]
[INFO] org.eclipse.modisco.java.discoverer.benchmark.tests [eclipse-test-plugin]
[INFO] org.eclipse.modisco.java.discoverer.cdo.tests      [eclipse-test-plugin]
[INFO] org.eclipse.modisco.java.generation.tests          [eclipse-test-plugin]
[INFO] org.eclipse.modisco.java.queries.tests             [eclipse-test-plugin]
[INFO] org.eclipse.modisco.jee.ejbjar.discoverer.tests    [eclipse-test-plugin]
[INFO] org.eclipse.modisco.jee.jsp.discoverer.tests       [eclipse-test-plugin]
[INFO] org.eclipse.modisco.jee.jsp.generation.tests       [eclipse-test-plugin]
[INFO] org.eclipse.modisco.jee.queries.tests              [eclipse-test-plugin]
[INFO] org.eclipse.modisco.jee.webapp.discoverer.tests    [eclipse-test-plugin]
[INFO] org.eclipse.modisco.kdm.uml2converter.tests        [eclipse-test-plugin]
[INFO] org.eclipse.modisco.xml.discoverer.tests           [eclipse-test-plugin]
[INFO] org.eclipse.modisco.tests                          [eclipse-test-plugin]
[INFO] org.eclipse.modisco.usecase.modelfilter.tests      [eclipse-test-plugin]
[INFO] org.eclipse.modisco.updatesite                      [eclipse-repository]
