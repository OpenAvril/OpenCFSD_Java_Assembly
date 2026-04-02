package main;

import com.sun.jna.Pointer;
import engine.Framework;
import lib.JavaLIBConcurrentIOServer;

public class IO 
{
    public static Framework _stat_CLASS_framework;
// public.
    public static Framework app_generate_Program()
    {
            System.out.printf("entered DESKTOP APPLICATION generate_Program().%n");

            System.out.printf("started Classes - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE.%n");
            stat_CLASS_boot1_DEFINE_framework();
            stat_CLASS_boot3_INITIALISE_framework();
            System.out.printf("done Classes - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE.%n");

            System.out.printf("started Records - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE.%n");

            System.out.printf("done Records - DECLAIRE, DEFINE INITIALISE, Registers - DECLAIRE.%n");

            System.out.printf("started Registers - DEFINE.%n");
            stat_CLASS_get_Framework().dyn_REG_boot1_DEFINE_Framework_App(stat_CLASS_get_Framework());
            System.out.printf("done Registers - DEFINE.%n");

            System.out.printf("started Registers - SUBSTANTIATE.%n");
            stat_CLASS_get_Framework().dyn_REG_boot2_SUBSTANTIATE_Framework_App(stat_CLASS_get_Framework());
            System.out.printf("done Registers - SUBSTANTIATE.%n");

            System.out.printf("started Registers - INITIALISE.%n");
            stat_CLASS_get_Framework().dyn_REG_boot3_INITIALISE_Framework_App(stat_CLASS_get_Framework());
            System.out.printf("done Registers - INITIALISE.%n");

            System.out.printf("started Program - INSTANTIATE.%n");
            stat_CLASS_get_Framework().dyn_REG_boot4_INSTANTIATE_Framework_App(stat_CLASS_get_Framework());
            System.out.printf("done Program - INSTANTIATE.%n");

            System.out.printf("exiting DESKTOP APPLICATION generate_Program().%n");
            return stat_CLASS_get_Framework();
    }
    public static void app_FUNCT_flip_Input_DoubleBuffer(Pointer obj)
    {
        try {
            JavaLIBConcurrentIOServer.INSTANCE.app_FUNCT_flip_Input_DoubleBuffer(obj);
        }
        catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
        catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
        }
    }
    public static Pointer app_FUNCT_ConcurrentIOServer_generate_Program()
    {
        try {
            return JavaLIBConcurrentIOServer.INSTANCE.app_FUNCT_generate_Program();
        }
        catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
        catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
        }
        return null;
    }
    public static void app_FUNCT_select_set_Intput_Subset(Pointer obj, byte[] bytes)
    {
        try {
            JavaLIBConcurrentIOServer.INSTANCE.app_FUNCT_select_set_Intput_Subset(obj, bytes);
        }
        catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
        catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
        }
    }
    public static void app_FUNCT_terminate_Program(Pointer obj)
    {
        try {
            JavaLIBConcurrentIOServer.INSTANCE.app_FUNCT_terminate_Program(obj);
        }
        catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
        catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
        }
    }
    public static void app_FUNCT_pop_From_Stack_Of_Output(Pointer obj)
    {
        try {
            JavaLIBConcurrentIOServer.INSTANCE.app_FUNCT_pop_From_Stack_Of_Output(obj);
        }
        catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
        catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
        }
    }
    public static void app_FUNCT_push_To_STACK_Of_Input(Pointer obj)
    {
        try {
            JavaLIBConcurrentIOServer.INSTANCE.app_FUNCT_push_To_STACK_Of_Input(obj);
        }
        catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
        catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
        }
    }
    public static Boolean dyn_REG_get_flag_isStackLoaded_Server_InputAction(Pointer obj)
    {
        try {
            return JavaLIBConcurrentIOServer.INSTANCE.dyn_REG_get_flag_isStackLoaded_Server_InputAction(obj);
        }
        catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
        catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
        }
        return null;
    }
    public static Boolean dyn_REG_get_flag_isStackLoaded_Server_OutputSend(Pointer obj)
    {
        try {
            return JavaLIBConcurrentIOServer.INSTANCE.dyn_REG_get_flag_isStackLoaded_Server_OutputSend(obj);
        }
        catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
        catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
        }
        return null;
    }
    public static Boolean dyn_REG_get_flag_IsInitialised_OpenAvrilConcurrency(Pointer obj)
    {
        try {
            return JavaLIBConcurrentIOServer.INSTANCE.dyn_REG_get_flag_IsInitialised_OpenAvrilConcurrency(obj);
        }
        catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
        catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
        }
        return null;
    }
    public static byte[] dyn_REG_get_ptr_PraiseEventId(Pointer obj)
    {
        try {
            return JavaLIBConcurrentIOServer.INSTANCE.dyn_REG_get_ptr_PraiseEventId(obj);
        }
        catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
        catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
        }
        return null;
    }
    public static byte[] dyn_REG_get_ptr_output_Value(Pointer obj)
    {
        try {
            return JavaLIBConcurrentIOServer.INSTANCE.dyn_REG_get_ptr_output_Value(obj);
        }
        catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
        catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
        }
        return null;
    }
    public static void dyn_REG_set_Item_input_Value_A(Pointer obj, byte[] bytes)
    {
        try {
            JavaLIBConcurrentIOServer.INSTANCE.dyn_REG_set_Item_input_Value_A(obj, bytes);
        }
        catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
        catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
        }
    }
    public static void dyn_REG_set_Item_input_Value_B(Pointer obj, byte[] bytes)
    {
        try {
            JavaLIBConcurrentIOServer.INSTANCE.dyn_REG_set_Item_input_Value_B(obj, bytes);
        }
        catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
        catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
        }
    }
    public static void dyn_REG_set_PraiseEventId(Pointer obj, byte[] bytes)
    {
        try {
            JavaLIBConcurrentIOServer.INSTANCE.dyn_REG_set_PraiseEventId(obj, bytes);
        }
        catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
        catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
        }
    }
    public static Pointer dyn_PGM_get_program_WriteEnableStack_ServerInputAction(Pointer obj)
    {
        try {
            return JavaLIBConcurrentIOServer.INSTANCE.dyn_PGM_get_program_WriteEnableStack_ServerInputAction(obj);
        }
        catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
        catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
        }
        return null;
    }
    public static Pointer dyn_PGM_get_program_WriteEnableStack_ServerOutputRecieve(Pointer obj)
    {
        try {
            return JavaLIBConcurrentIOServer.INSTANCE.dyn_PGM_get_program_WriteEnableStack_ServerOutputRecieve(obj);
        }
        catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
        catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
        }
        return null;
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