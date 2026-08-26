package main.IO;
import com.sun.jna.Pointer;
import engine.Global;
import libs.JavaLIBWriteQue_Simulation_InputSamples;

public class WriteQue_Simulation_InputSamples
{
    public static Pointer app_FUNCT_generate_Program()
    {
        try {
            return JavaLIBWriteQue_Simulation_InputSamples.INSTANCE.CLIB_WriteEnableForThreadsAt_SIMULATION_InputSamples__App_FUNCT_generate_Program();
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
    public static Boolean app_FUNCT_get_flag_isPGM_INSTNATIATED()
    {
        try {
            return Global.stat_CONVERT_ByteArray_To_Boolean(JavaLIBWriteQue_Simulation_InputSamples.INSTANCE.CLIB_WriteEnableForThreadsAt_SIMULATION_InputSamples__App_FUNCT_get_flag_isPGM_INSTANTIATED());
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
        return true;
    }
    public static void app_FUNCT_terminate_Program()
    {
        try {
            JavaLIBWriteQue_Simulation_InputSamples.INSTANCE.CLIB_WriteEnableForThreadsAt_SIMULATION_InputSamples__App_FUNCT_terminate_Program();
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
    public static void app_FUNCT_write_End(long threadId)
    {
        try {
            JavaLIBWriteQue_Simulation_InputSamples.INSTANCE.CLIB_WriteEnableForThreadsAt_SIMULATION_InputSamples__App_FUNCT_write_End(Global.stat_CONVERT_ByteArray_To_ReverseByteArray(Global.stat_CONVERT_Long_To_ByteArray(threadId)));
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
    public static void app_FUNCT_write_Start(long threadId)
    {
        try {
            JavaLIBWriteQue_Simulation_InputSamples.INSTANCE.CLIB_WriteEnableForThreadsAt_SIMULATION_InputSamples__App_FUNCT_write_Start(Global.stat_CONVERT_ByteArray_To_ReverseByteArray(Global.stat_CONVERT_Long_To_ByteArray(threadId)));
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
