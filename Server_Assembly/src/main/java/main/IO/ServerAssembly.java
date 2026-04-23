package main.IO;
import engine.Framework;
import com.sun.jna.Pointer;

import java.io.IOException;

public class ServerAssembly
{
    public static Framework _stat_CLASS_framework;
// public.
    public static Framework app_generate_Program() throws IOException {
        System.out.printf("entered DESKTOP APPLICATION generate_Program().%n");

        System.out.printf("started architectured classes - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE.%n");
        stat_CLASS_boot1_DEFINE_framework();
        stat_CLASS_boot3_INITIALISE_framework();
        System.out.printf("done architectured classes - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE.%n");

        System.out.printf("started Global Meta-Data and Settings.%n");
        stat_CLASS_get_Framework().dyn_CLASS_create_Global_and_Settings();
        stat_CLASS_get_Framework().dyn_CLASS_get_Global().dyn_REG_boot1_DEFINE_Global();
        stat_CLASS_get_Framework().dyn_CLASS_get_Global().dyn_REG_boot2_SUBSTANTIATE_Global();
        stat_CLASS_get_Framework().dyn_CLASS_get_Global().dyn_REG_boot3_INITIALISE_Global();
        System.out.printf("done Global Meta-Data and Settings.%n");

        System.out.printf("started STRUCTS generate.%n");
        System.out.printf("started independent STRUCT classes - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE.%n");
        stat_CLASS_get_Framework().dyn_STRUCT_boot0_DECLAIRE();
        stat_CLASS_get_Framework().dyn_SRUCT_boot1_DEFINE();
        stat_CLASS_get_Framework().dyn_STRUCT_boot3_INITIALISE();
        System.out.printf("done independent STRUCT classes - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE.%n");

        System.out.printf("started independent STRUCT User_Input() - Registers - DEFINE, SUBSTANTIATE, INITIALISE.%n");
        stat_CLASS_get_Framework().dyn_STRUCT_get_User_Input().dyn_REG_boot1_DEFINE_User_Input();
        stat_CLASS_get_Framework().dyn_STRUCT_get_User_Input().dyn_REG_boot2_SUBSTANTIATE_User_Input();
        stat_CLASS_get_Framework().dyn_STRUCT_get_User_Input().dyn_REG_boot3_INITIALISE_User_Input();
        System.out.printf("done independent STRUCT User_Input() - Registers - DEFINE, SUBSTANTIATE, INITIALISE.%n");

        System.out.printf("started independent STRUCT User_Algorithim() - Registers - DEFINE, SUBSTANTIATE, INITIALISE.%n");
        stat_CLASS_get_Framework().dyn_STRUCT_get_User_Algorithim().dyn_REG_boot1_DEFINE_User_Algorithim();
        stat_CLASS_get_Framework().dyn_STRUCT_get_User_Algorithim().dyn_REG_boot2_SUBSTANTIATE_User_Algorithim();
        stat_CLASS_get_Framework().dyn_STRUCT_get_User_Algorithim().dyn_REG_boot3_INITIALISE_User_Algorithim();
        System.out.printf("done independent STRUCT User_Algorithim() - Registers - DEFINE, SUBSTANTIATE, INITIALISE.%n");

        System.out.printf("started independent STRUCT User_Output(() - Registers - DEFINE, SUBSTANTIATE, INITIALISE.%n");
        stat_CLASS_get_Framework().dyn_STRUCT_get_User_Output().dyn_REG_boot1_DEFINE_User_Output();
        stat_CLASS_get_Framework().dyn_STRUCT_get_User_Output().dyn_REG_boot2_SUBSTANTIATE_User_Output();
        stat_CLASS_get_Framework().dyn_STRUCT_get_User_Output().dyn_REG_boot3_INITIALISE_User_Output();
        System.out.printf("done independent STRUCT User_Output(() - Registers - DEFINE, SUBSTANTIATE, INITIALISE.%n");

        System.out.printf("started independent STRUCT Input() - Registers - DEFINE, SUBSTANTIATE, INITIALISE.%n");
        stat_CLASS_get_Framework().dyn_STRUCT_get_Input().dyn_REG_boot1_DEFINE_Input();
        stat_CLASS_get_Framework().dyn_STRUCT_get_Input().dyn_REG_boot2_SUBSTANTIATE_Input();
        stat_CLASS_get_Framework().dyn_STRUCT_get_Input().dyn_REG_boot3_INITIALISE_Input(stat_CLASS_get_Framework().dyn_STRUCT_get_User_Input());
        System.out.printf("done independent STRUCT Input() - Registers - DEFINE, SUBSTANTIATE, INITIALISE.%n");

        System.out.printf("started independent STRUCT Algorithim(() - Registers - DEFINE, SUBSTANTIATE, INITIALISE.%n");
        stat_CLASS_get_Framework().dyn_STRUCT_get_Algorithim().dyn_REG_boot1_DEFINE_Algorithim();
        stat_CLASS_get_Framework().dyn_STRUCT_get_Algorithim().dyn_REG_boot2_SUBSTANTIATE_Algorithim();
        stat_CLASS_get_Framework().dyn_STRUCT_get_Algorithim().dyn_REG_boot3_INITIALISE_Algorithim(stat_CLASS_get_Framework().dyn_STRUCT_get_User_Algorithim());
        System.out.printf("done independent STRUCT Algorithim(() - Registers - DEFINE, SUBSTANTIATE, INITIALISE.%n");

        System.out.printf("started independent STRUCT Output() - Registers - DEFINE, SUBSTANTIATE, INITIALISE.%n");
        stat_CLASS_get_Framework().dyn_STRUCT_get_Output().dyn_REG_boot1_DEFINE_Output();
        stat_CLASS_get_Framework().dyn_STRUCT_get_Output().dyn_REG_boot2_SUBSTANTIATE_Output();
        stat_CLASS_get_Framework().dyn_STRUCT_get_Output().dyn_REG_boot3_INITIALISE_Output(stat_CLASS_get_Framework().dyn_STRUCT_get_User_Output());
        System.out.printf("started independent STRUCT Output() - Registers - DEFINE, SUBSTANTIATE, INITIALISE.%n");

        System.out.printf("started independent STRUCT IO_ListenRespond() - Registers - DEFINE, SUBSTANTIATE, INITIALISE.%n");
        //stat_CLASS_get_Framework().dyn_STRUCT_get_IO_ListenRespond().dyn_REG_boot1_DEFINE_IO_Listen_Respond();
        //stat_CLASS_get_Framework().dyn_STRUCT_get_IO_ListenRespond().dyn_REG_boot2_SUBSTANTIATE_IO_Listen_Respond();
        //stat_CLASS_get_Framework().dyn_STRUCT_get_IO_ListenRespond().dyn_REG_boot3_INITIALISE_IO_Listen_Respond();
        System.out.printf("done independent STRUCT IO_ListenRespond() - Registers - DEFINE, SUBSTANTIATE, INITIALISE.%n");
        System.out.printf("done STRUCTS generate.%n");

        System.out.printf("started ARCHITECTURE generate.%n");
        System.out.printf("started architectured classes - Registers - DEFINE.%n");
        stat_CLASS_get_Framework().dyn_REG_boot1_DEFINE_Framework_App(stat_CLASS_get_Framework());
        stat_CLASS_get_Framework().dyn_CLASS_get_App().dyn_REG_boot1_DEFINE_App();
        stat_CLASS_get_Framework().dyn_CLASS_get_App().dyn_CLASS_get_Algorithims().dyn_REG_boot1_DEFINE_Algorithims(_stat_CLASS_framework);
        //stat_CLASS_get_Framework().dyn_CLASS_get_App().dyn_CLASS_get_Data().dyn_CLASS_get_Data().dyn_REG_boot1_DEFINE_Data();
        stat_CLASS_get_Framework().dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_REG_boot1_DEFINE_Execute();
        System.out.printf("done architectured classes -Registers - DEFINE.%n");

        System.out.printf("started architectured classes - Registers - SUBSTANTIATE.%n");
        stat_CLASS_get_Framework().dyn_REG_boot2_SUBSTANTIATE_Framework_App(stat_CLASS_get_Framework());
        stat_CLASS_get_Framework().dyn_CLASS_get_App().dyn_REG_boot2_SUBSTANTIATE_App();
        stat_CLASS_get_Framework().dyn_CLASS_get_App().dyn_CLASS_get_Algorithims().dyn_REG_boot2_SUBSTANTIATE_Algorithims(_stat_CLASS_framework);
        //stat_CLASS_get_Framework().dyn_CLASS_get_App().dyn_CLASS_get_Data().dyn_REG_boot2_SUBSTANTIATE_Data(_stat_CLASS_framework);
        stat_CLASS_get_Framework().dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_REG_boot2_SUBSTANTIATE_Execute(_stat_CLASS_framework);
        System.out.printf("done architectured classes -Registers - SUBSTANTIATE.%n");

        System.out.printf("started architectured classes - Registers - INITIALISE.%n");
        stat_CLASS_get_Framework().dyn_REG_boot3_INITIALISE_Framework_App(stat_CLASS_get_Framework(), stat_CLASS_get_Framework().dyn_STRUCT_get_Input(), stat_CLASS_get_Framework().dyn_STRUCT_get_Output());
        stat_CLASS_get_Framework().dyn_CLASS_get_App().dyn_REG_boot3_INITIALISE_App();
        stat_CLASS_get_Framework().dyn_CLASS_get_App().dyn_CLASS_get_Algorithims().dyn_REG_boot3_INITIALISE_Algorithims(_stat_CLASS_framework);
        //stat_CLASS_get_Framework().dyn_CLASS_get_App().dyn_CLASS_get_Data().dyn_REG_boot3_INITIALISE_Data(_stat_CLASS_framework);
        stat_CLASS_get_Framework().dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_REG_boot3_INITIALISE_Execute(_stat_CLASS_framework);
        System.out.printf("done architectured classes - Registers - INITIALISE.%n");
        System.out.printf("done ARCHITECTURE generate.%n");

        System.out.printf("started PROGRAM - INSTANTIATE.%n");
        stat_CLASS_get_Framework().dyn_REG_boot4_INSTANTIATE_Framework_App(stat_CLASS_get_Framework());
        System.out.printf("done PROGRAM - INSTANTIATE.%n");

        System.out.printf("%n");
        System.out.printf("        ,     \\      /      ,%n");
        System.out.printf("       / \\    )\\ __ /(     / \\ %n");
        System.out.printf("      /   \\   (_\\  /_)    /   \\ %n");
        System.out.printf("____ / ____\\__ \\@  @/ ___/_____\\_____%n");
        System.out.printf("|              |\\../|               |%n");
        System.out.printf("|               \\VV/                |%n");
        System.out.printf("|           OpenEpiCentre           |%n");
        System.out.printf("|          Open Source MIT          |%n");
        System.out.printf("| Concurrent Full Stack Development |%n");
        System.out.printf("|___________________________________|%n");
        System.out.printf("|    / \\ /        \\\\        \\ /\\    |%n");
        System.out.printf("|  /    V          ))        V   \\  |%n");
        System.out.printf("|/                //               \\|%n");
        System.out.printf("`                 V                 '%n");
        System.out.printf("%n");

        System.out.printf("started PROGRAM - LAUNCH THREADS.%n");
        stat_CLASS_get_Framework().dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_APP_Launch_Threads(stat_CLASS_get_Framework());
        System.out.printf("exiting PROGRAM - LAUNCH THREADS.%n");

        System.out.printf("exiting DESKTOP APPLICATION generate_Program().%n");

        return stat_CLASS_get_Framework();
    }
    public static Framework dyn_CLASS_get_Framework()
    {
        return stat_CLASS_get_Framework();
    }
// private.
    private static void stat_CLASS_boot1_DEFINE_framework()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_framework().%n");
        _stat_CLASS_framework = null;
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_framework().%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_framework() throws IOException {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_framework().%n");
        _stat_CLASS_framework = new Framework();
        try {
            stat_CLASS_get_Framework();
        } 
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_framework().%n");
    }
    private static Framework stat_CLASS_get_Framework()
    {
        return _stat_CLASS_framework;
    }
}