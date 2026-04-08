package opencfsd_java_assembly.server_app;
import com.sun.jna.Pointer;
import engine.Framework;
import main.IO.ServerAssembly;
import main.IO.ConcurrentIOServer;
public class Server_App 
{
    private static Framework _stat_PGM_ClientAssembly = null;
    private static Pointer _stat_PGMPtr_ConcurrnetIOServer = null;
// public. 
    public static void main(String[] args) {
        System.out.printf("entered first member function, main()%n");
        _stat_PGM_ClientAssembly = ServerAssembly.app_generate_Program();
        System.out.printf("%n");
        System.out.printf("        ,     \\      /      ,%n");
        System.out.printf("       / \\    )\\ __ /(     / \\ %n");
        System.out.printf("      /   \\   (_\\  /_)    /   \\ %n");
        System.out.printf("____ / ____\\__ \\@  @/ ___/_____\\_____%n");
        System.out.printf("|              |\\../|               |%n");
        System.out.printf("|               \\VV/                |%n");
        System.out.printf("|        OpenCFSD Java Assembly     |%n");
        System.out.printf("|  - High Level Hardware Language.  |%n");
        System.out.printf("|  - A Dynamic Link Library.      |%n");
        System.out.printf("|___________________________________|%n");
        System.out.printf("|    / \\ /        \\\\        \\ /\\    |%n");
        System.out.printf("|  /    V          ))        V   \\  |%n");
        System.out.printf("|/                //               \\|%n");
        System.out.printf("`                 V                 '%n");
        System.out.printf("%n");
        System.out.printf("==========%n");
        System.out.printf("decliration.%n");
        System.out.printf("definition.%n");
        System.out.printf("substanciation.%n");
        System.out.printf("initialisation.%n");
        System.out.printf("instanciation.%n");
        System.out.printf("running.%n");
        System.out.printf("==========%n");
        System.out.printf("SIMULATION%n");
        _stat_PGMPtr_ConcurrnetIOServer = ServerAssembly.dyn_CLASS_get_Framework().dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_PGM_get_ConcurrentIOServer();
        
        byte praiseId;
        praiseId = (byte)0;
        float praise0_Input_valueA;
        praise0_Input_valueA = (float)1.2;
        float praise0_Input_valueB;
        praise0_Input_valueB = (float)2.6;
        Object[] inputValues;
        inputValues = new Object[2];
        inputValues[0] = (Object)praise0_Input_valueA;
        inputValues[1] = (Object)praise0_Input_valueB;
        
        //ConcurrentIOServer.app_DoPRAISE(_stat_PGMPtr_ConcurrnetIOServer, praiseId, inputValues);
       
    }
}
