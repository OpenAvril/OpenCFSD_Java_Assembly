# OpenCFSD Java Assembly.
## main Branch.

---
## Branches.
 - main.
 - DEVELOPMENT.

---
## Using.
### Ubuntu LINUX.
version: Ubuntu 24.04.4 LTS

### IntelliJ IDEA 2026.1.
Build #IU-261.22158.277, built on March 25, 2026.

### Dependencies.
#### The Java Development Kit (JDK).
#### Java Runtime Eenvironment (JRE).
#### GCC toolchain.
#### IntelliJ-idea.
#### Apache Maven. 

Terminal install of the above.
````
sudo apt install openjdk-8-jdk
sudo apt install openjdk-8-jre
sudo apt install build-essential gdb
sudo snap install intellij-idea --channel=2026.1/stable --classic
````

#### Java Native Access Library.
##### edit pom.xml.
````
 <dependency>
	    <groupId>net.java.dev.jna</groupId>
	    <artifactId>jna</artifactId>
	    <version>5.13.0</version> <!-- Use the latest version -->
	</dependency>
	<dependency>
	    <groupId>net.java.dev.jna</groupId>
	    <artifactId>jna-platform</artifactId>
	    <version>5.13.0</version> <!-- Use the latest version -->
	</dependency>
````

---
## Implements.
 - ### CLIBWriteQue dll(s).
 - ### CLBILaunchQue dll(s).
 - ### OpenEpiCentre dll.

---
## How To Guildes.
### Stack Flow - From Client Input Scanner To Server And Back To Client.
 - [GitHub ReadMe - How To Guide.](https://github.com/OpenAvril/OpenCFSD_Java_Assembly/blob/main/readme/How%20To%20Guide%20-%20Stack%20Flow%20From%20Client%20Input%20Scanner%20To%20Server%20And%20Back%20To%20Client.md)
### Wrapper Imports / Exports and Native IO.
 - [Wrapper Imports and Native IO.](https://github.com/OpenAvril/OpenCFSD_Java_Assembly/blob/main/readme/Wrapper_Imports.md)
