# Import / Export Wrapper(s).

## Client.

### Native C++ Libraries.
#### LIB_LaunchEnableForConcurrentThreadsAt_CLIENT.dll.
##### Header.
````

````
##### source.
````

````

#### LIB_WriteEnableForThreadsAt_CLIENTINPUTACTION.dll.
##### Header.
````

````
##### Source.
````

````

#### LIB_WriteEnableForThreadsAt_CLIENTOUTPUTRECIEVE.dll.
##### Header.
````

````
##### Source.
````

````

### Java Imports.
#### JavaLIBLaunchQue_Client.java.
````

````

#### JavaLIBWriteQue_ClientInputSend.java.
````
package lib;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public interface JavaLIBWriteQue_ClientInputSend extends Library
{
    JavaLIBWriteQue_ClientInputSend INSTANCE = (JavaLIBWriteQue_ClientInputSend) Native.load("LIB_WriteEnableForThreadsAt_CLIENTINPUTACTION", JavaLIBWriteQue_ClientInputSend.class);
    Pointer app_FUNCT_generate_Program();
    boolean app_FUNCT_get_flag_isPGM_INSTNATIATED();
    void app_FUNCT_terminate_Program();
    void app_FUNCT_write_End(Pointer obj, byte[] bytes);
    void app_FUNCT_write_Start(Pointer obj, byte[] bytes);
}
````

#### JavaLIBWriteQue_ClientOutputRecieve.java.
````

````

### C# Imports.
#### ImportCLIBLaunchEnableForConcurrentThreadsAtCLIENT.cs.
````

````
#### ImportCLIBWriteEnableForThreadsAtCLIENTINPUTACTION.cs.
````

````

#### ImportCLIBWriteEnableForThreadsAtCLIENTOUTPUTRECIEVE.cs.
````

````

## Server.
### Native C++ Libraries.
#### LIB_LaunchEnableForConcurrentThreadsAt_SERVER.dll.
##### Header.
````

````
##### Source.
````

````

#### LIB_WriteEnableForThreadsAt_SERVERINPUTACTION.dll.
##### Header.
````

````
##### Source.
````

````

#### LIB_WriteEnableForThreadsAt_SERVEROUTPUTRECIEVE.dll.
##### Header.
````

````
#### Source.
````

````

#### LIB_OpenAvrilConcurrent_IO_Server.dll.
##### Header.
````

````
##### Source.
````

````

### Java Imports.
#### JavaLIBConcurrentIOServer.java.
````

````

### C# Imports.
#### ImportCLIBConcurrentServerIO.cs.
````

````
