# OpenCFSD_Java_Assembly.
## Implements.
 - OpenAvrilConcurrency dll.
 - CLIBWriteQue dll(s),
 - CLBILaunchQue dll(s).
  
## Using.
### Windows 11 Home.
Version: 25H2.
Build id: 26200.7840.

### Apache NetBeans IDE.
Version: Apache NetBeans IDE 25.

## Dependencies.
### The Java Development Kit (JDK).
Version: 25.0.2.
 - https://www.oracle.com/anz/java/technologies/downloads/#java25

### Apache Maven. 
 - https://maven.apache.org/install.html

### Java Native Access Library.
 - https://github.com/java-native-access/jna

 #### edit pom.xml.
````
 <dependency>
	    <groupId>net.java.dev.jna</groupId>
	    <artifactId>jna</artifactId>
	    <version>5.18.1</version> <!-- Use the latest version -->
	</dependency>
	<dependency>
	    <groupId>net.java.dev.jna</groupId>
	    <artifactId>jna-platform</artifactId>
	    <version>5.18.1</version> <!-- Use the latest version -->
	</dependency>
````
