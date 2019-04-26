I have pushed two branches 

1. one working code [master(base/pom.xml >spring-boot 2.0.5.RELEASE)] 
2. one not working code [bug/spring-2.1.x (base/pom.xml < spring-boot 2.1.4.RELEASE)]

and have created a bean (config/AppConfig.java) in base and in its PostConstruct I am just printing the statement 
 
###App Config From Base called###

Steps to reproduce:

In Master Branch(Working code Spring 2.0.X)
1. build the base project "mvn clean install" and copy the base-0.0.1-SNAPSHOT.jar to child/lib.
2. build the child project "mvn clean install"
3. run the child jar java -jar target/child-0.0.1-SNAPSHOT.jar

Observation : You can clearly see that "###App Config From Base called###" this line will be printed on console.


In bug/spring-2.1.x Branch(Working code Spring 2.1.X)
Perform same steps as above as master

Observation : You can clearly see that "###App Config From Base called###" this line will not get printed on console.
