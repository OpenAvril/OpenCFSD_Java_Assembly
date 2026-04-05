package main.IO;
import com.sun.jna.Pointer;
import engine.Framework;
import engine.Global;
import lib.JavaLIBConcurrentIOServer;
import structs.praisesubsets.Input_praise0;
import structs.praisesubsets.Output_praise0;
public class ConcurrentIOServer 
{
// public.
    public static Pointer app_FUNCT_generate_Program()
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
    public static void app_FUNCT_terminate_Program()
    {
        try {
            JavaLIBConcurrentIOServer.INSTANCE.app_FUNCT_terminate_Program();
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
    public static byte[] dyn_REG_get_flag_isStackLoaded_Server_InputAction(Pointer obj)
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
    public static byte[] dyn_REG_get_flag_isStackLoaded_Server_OutputSend(Pointer obj)
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
    public static byte[] dyn_REG_get_flag_IsInitialised_OpenAvrilConcurrency(Pointer obj)
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
    public static void app_PRAISE_Do(Framework obj, Pointer objConcurrentServer, int praiseId, Object[] inputValues)
    {

    }
    public static Object[] app_PRAISE_Get(Framework obj, Pointer objConcurrentServer, int praiseId)
    {
        Object[] outputValues;
        outputValues = null;

        return outputValues;
    }
// private.
    private static void stat_FUNCT_flip_Input_DoubleBuffer(Pointer obj)
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
    public static void stat_FUNCT_pop_From_Stack_Of_Output(Pointer obj)
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
    private static void stat_FUNCT_push_To_STACK_Of_Input(Pointer obj)
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
    private static void stat_FUNCT_select_set_Intput_Subset(Pointer obj, byte[] bytes)
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
    public static byte[] stat_REG_get_ptr_PraiseEventId(Pointer obj)
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
    private static void stat_REG_set_PraiseEventId(Pointer obj, byte[] bytes)
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
}
    