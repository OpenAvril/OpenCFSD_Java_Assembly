package main.IO;
import engine.Framework;
import com.sun.jna.Pointer;
public class ServerAssembly 
{
    public static Framework _stat_CLASS_framework;
// public.
    public static Framework app_generate_Program()
    {
        System.out.printf("entered DESKTOP APPLICATION generate_Program().%n");

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
        stat_CLASS_get_Framework().dyn_STRUCT_get_User_Output();

        System.out.printf("started independent STRUCT Input() - Registers - DEFINE, SUBSTANTIATE, INITIALISE.%n");
        stat_CLASS_get_Framework().dyn_STRUCT_get_Input();

        System.out.printf("started independent STRUCT Algorithim(() - Registers - DEFINE, SUBSTANTIATE, INITIALISE.%n");
        stat_CLASS_get_Framework().dyn_STRUCT_get_Algorithim();

        System.out.printf("started independent STRUCT Output() - Registers - DEFINE, SUBSTANTIATE, INITIALISE.%n");
        stat_CLASS_get_Framework().dyn_STRUCT_get_Output();

        stat_CLASS_get_Framework().dyn_STRUCT_get_IO_ListenRespond().dyn_REG_boot1_DEFINE_IO_Listen_Respond();
        stat_CLASS_get_Framework().dyn_STRUCT_get_IO_ListenRespond().dyn_REG_boot2_SUBSTANTIATE_IO_Listen_Respond();
        stat_CLASS_get_Framework().dyn_STRUCT_get_IO_ListenRespond().dyn_REG_boot3_INITIALISE_IO_Listen_Respond();

        System.out.printf("done STRUCTS generate.%n");

        System.out.printf("started architectured classes - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE.%n");
        stat_CLASS_boot1_DEFINE_framework();
        stat_CLASS_boot3_INITIALISE_framework();
        System.out.printf("done architectured classes - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE.%n");

        System.out.printf("started ARCHITECTURE generate.%n");
        System.out.printf("started architectured classes - Registers - DEFINE.%n");
        stat_CLASS_get_Framework().dyn_REG_boot1_DEFINE_Framework_App(stat_CLASS_get_Framework());
        stat_CLASS_get_Framework().dyn_CLASS_get_App().dyn_REG_boot1_DEFINE_App(_stat_CLASS_framework);
        stat_CLASS_get_Framework().dyn_CLASS_get_App().dyn_CLASS_get_Global().dyn_REG_boot1_DEFINE_Global(_stat_CLASS_framework);
        stat_CLASS_get_Framework().dyn_CLASS_get_App().dyn_CLASS_get_Algorithims().dyn_REG_boot1_DEFINE_Algorithims(_stat_CLASS_framework);
        stat_CLASS_get_Framework().dyn_CLASS_get_App().dyn_CLASS_get_Data().dyn_REG_boot1_DEFINE_Data(_stat_CLASS_framework);
        stat_CLASS_get_Framework().dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_REG_boot1_DEFINE_Execute(_stat_CLASS_framework);
        System.out.printf("done architectured classes -Registers - DEFINE.%n");

        System.out.printf("started architectured classes - Registers - SUBSTANTIATE.%n");
        stat_CLASS_get_Framework().dyn_REG_boot2_SUBSTANTIATE_Framework_App(stat_CLASS_get_Framework());
        stat_CLASS_get_Framework().dyn_CLASS_get_App().dyn_REG_boot2_SUBSTANTIATE_App(_stat_CLASS_framework);
        stat_CLASS_get_Framework().dyn_CLASS_get_App().dyn_CLASS_get_Global().dyn_REG_boot2_SUBSTANTIATE_Global(_stat_CLASS_framework);
        stat_CLASS_get_Framework().dyn_CLASS_get_App().dyn_CLASS_get_Algorithims().dyn_REG_boot2_SUBSTANTIATE_Algorithims(_stat_CLASS_framework);
        stat_CLASS_get_Framework().dyn_CLASS_get_App().dyn_CLASS_get_Data().dyn_REG_boot2_SUBSTANTIATE_Data(_stat_CLASS_framework);
        stat_CLASS_get_Framework().dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_REG_boot2_SUBSTANTIATE_Execute(_stat_CLASS_framework);
        System.out.printf("done architectured classes -Registers - SUBSTANTIATE.%n");

        System.out.printf("started architectured classes - Registers - INITIALISE.%n");
        stat_CLASS_get_Framework().dyn_REG_boot3_INITIALISE_Framework_App(stat_CLASS_get_Framework());
        stat_CLASS_get_Framework().dyn_CLASS_get_App().dyn_REG_boot3_INITIALISE_App(_stat_CLASS_framework);
        stat_CLASS_get_Framework().dyn_CLASS_get_App().dyn_CLASS_get_Global().dyn_REG_boot3_INITIALISE_Global(_stat_CLASS_framework);
        stat_CLASS_get_Framework().dyn_CLASS_get_App().dyn_CLASS_get_Algorithims().dyn_REG_boot3_INITIALISE_Algorithims(_stat_CLASS_framework);
        stat_CLASS_get_Framework().dyn_CLASS_get_App().dyn_CLASS_get_Data().dyn_REG_boot3_INITIALISE_Data(_stat_CLASS_framework);
        stat_CLASS_get_Framework().dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_REG_boot3_INITIALISE_Execute(_stat_CLASS_framework);
        System.out.printf("done architectured classes - Registers - INITIALISE.%n");
        System.out.printf("done ARCHITECTURE generate.%n");

        System.out.printf("started PROGRAM - INSTANTIATE.%n");
        stat_CLASS_get_Framework().dyn_REG_boot4_INSTANTIATE_Framework_App(stat_CLASS_get_Framework());
        System.out.printf("done PROGRAM - INSTANTIATE.%n");

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
    private static void stat_CLASS_boot3_INITIALISE_framework()
    {
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