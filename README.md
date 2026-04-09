# OpenCFSD_Java_Assembly.

## Using.
### Windows 11 Home.
Version: 25H2.
Build id: 26200.7840.

### Apache NetBeans IDE.
Version: Apache NetBeans IDE 25.

## Implements.
 - OpenAvrilConcurrency dll.
 - CLIBWriteQue dll(s),
 - CLBILaunchQue dll(s).

## How To Implement.
### How To Guide - Stack Flow From Client Input Scanner To Server And Back To Client.
 - [GitHub ReadMe - How To Guide.](https://github.com/OpenAvril/OpenAvrilCFSD-TEMPLATE-for-Concurrenct-Full-Stack-Development/blob/master/blob/How%20To%20Guide%20-%20Stack%20Flow%20From%20Client%20Input%20Scanner%20To%20Server%20And%20Back%20To%20Client.md)

### Wrapper Imports / Exports and Native IO.
 - [Wrapper Imports and Native IO](https://github.com/OpenAvril/OpenAvrilCFSD_APP_Templates/edit/master/blob/Wrapper_Imports.md)
   
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
