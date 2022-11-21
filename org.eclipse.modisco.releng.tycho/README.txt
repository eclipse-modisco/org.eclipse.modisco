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
