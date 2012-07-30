ee6-webapp
==========
Tested on JBoss AS 7.0.1.Final Web profile

JPA 2.0, JSF 2.0, JSFUnit, CDI, AS7 example

!!! Ensure that JBoss is up !!!

* Remote JBoss AS Test
mvn -Pjbossas-remote-7 test
* Redeploy (no tests)
mvn package -Dmaven.test.skip=true jboss-as:redeploy

JBOSS ROCKS!!!
