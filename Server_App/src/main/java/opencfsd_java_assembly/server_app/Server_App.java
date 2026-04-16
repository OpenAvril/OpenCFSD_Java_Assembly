package opencfsd_java_assembly.server_app;
import engine.Framework;
import main.IO.OpenEpiCentre;
import main.IO.ServerAssembly;
public class Server_App
{
    private static Framework _stat_PGM_ClientAssembly = null;
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

        OpenEpiCentre.app_FUNCT_select_set_Intput_Subset((int)(0));
        OpenEpiCentre.io_PRAISE_set_Item_Input_praise0_Value_A((float)(1.2));
        OpenEpiCentre.io_PRAISE_set_Item_Input_praise0_Value_B((float)(2.6));
        OpenEpiCentre.app_FUNCT_flip_Input_DoubleBuffer();
        OpenEpiCentre.app_FUNCT_push_To_STACK_Of_Input();

    }
}
