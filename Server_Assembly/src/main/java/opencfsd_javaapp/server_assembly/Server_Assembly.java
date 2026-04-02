package opencfsd_javaapp.server_assembly;

import com.sun.jna.Pointer;
import engine.Framework;
import engine.Global;
import main.IO;

public class Server_Assembly {
    private static Framework _stat_PGM_ClientAssembly = null;
    private static Pointer _stat_PGMPtr_ConcurrnetIOServer = null;
    public static void main(String[] args) {
        System.out.printf("entered first member function, main()%n");
        _stat_PGM_ClientAssembly = IO.app_generate_Program();
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
        int praiseId;
        praiseId = 0;
        IO.dyn_REG_set_PraiseEventId(_stat_PGMPtr_ConcurrnetIOServer, Global.stat_CONVERT_int_To_ByteArray(praiseId));
        IO.app_FUNCT_select_set_Intput_Subset(_stat_PGMPtr_ConcurrnetIOServer, Global.stat_CONVERT_int_To_ByteArray(praiseId));
        float praise0_Input_valueA;
        praise0_Input_valueA = (float)1.2;
        IO.dyn_REG_set_Item_input_Value_A(_stat_PGMPtr_ConcurrnetIOServer, Global.stat_CONVERT_Float_To_ByteArray(praise0_Input_valueA));
        float praise0_Input_valueB;
        praise0_Input_valueB = (float)2.6;
        IO.dyn_REG_set_Item_input_Value_B(_stat_PGMPtr_ConcurrnetIOServer, Global.stat_CONVERT_Float_To_ByteArray(praise0_Input_valueB));
        IO.app_FUNCT_flip_Input_DoubleBuffer(_stat_PGMPtr_ConcurrnetIOServer);
        IO.app_FUNCT_push_To_STACK_Of_Input(_stat_PGMPtr_ConcurrnetIOServer);
        //todo: wait for output.
        while(IO.dyn_REG_get_flag_isStackLoaded_Server_OutputSend(_stat_PGMPtr_ConcurrnetIOServer) == false) { }
        IO.app_FUNCT_pop_From_Stack_Of_Output(_stat_PGMPtr_ConcurrnetIOServer);
        var Output_praiseId = IO.dyn_REG_get_ptr_PraiseEventId(_stat_PGMPtr_ConcurrnetIOServer);
        var Output_value = IO.dyn_REG_get_ptr_output_Value(_stat_PGMPtr_ConcurrnetIOServer);
        System.out.printf("1.2 + 2.6 = " + Output_value);
       
    }
}
