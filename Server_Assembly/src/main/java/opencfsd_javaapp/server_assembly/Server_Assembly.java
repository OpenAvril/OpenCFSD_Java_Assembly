package opencfsd_javaapp.server_assembly;

import com.sun.jna.Pointer;
import engine.Framework;
import engine.Global;
import main.IO;
import lib.JavaLIBConcurrentIOServer;

public class Server_Assembly {
    private static Framework _stat_PGM_ClientAssembly = null;
    private static Pointer _stat_PGMPtr_ConcurrnetIOServer = null;
    public static void main(String[] args) {
        System.out.printf("entered first member function, main()%n");
        _stat_PGM_ClientAssembly = main.IO.app_generate_Program();
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
        _stat_PGMPtr_ConcurrnetIOServer = IO.dyn_CLASS_get_Framework().dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_PGM_get_ConcurrentIOServer();
        IO.dyn_REG_set_PraiseEventId(_stat_PGMPtr_ConcurrnetIOServer, Global.stat_CONVERT_Int_To_Byte((int)(0)));
        IO.app_FUNCT_select_set_Intput_Subset(_stat_PGMPtr_ConcurrnetIOServer, Global.stat_CONVERT_Int_To_Byte((int)(0)));
        IO.dyn_REG_set_Item_input_Value_A(_stat_PGMPtr_ConcurrnetIOServer, Global.stat_CONVERT_Float_To_ByteArray((float)(1.2)));
        IO.dyn_REG_set_Item_input_Value_B(_stat_PGMPtr_ConcurrnetIOServer, Global.stat_CONVERT_Float_To_ByteArray((float)(2.6)));
        IO.app_FUNCT_flip_Input_DoubleBuffer(_stat_PGMPtr_ConcurrnetIOServer);
        IO.app_FUNCT_push_To_STACK_Of_Input(_stat_PGMPtr_ConcurrnetIOServer);
        //todo: wait for output.
        System.out.printf("1.2 + 2.6 = " + Global.stat_CONVERT_Byte_To_Int(IO.dyn_REG_get_ptr_output_Value(_stat_PGMPtr_ConcurrnetIOServer)));
       
    }
}
