package main.IO;
import com.sun.jna.Pointer;
import engine.Global;
import lib.JavaLIBWriteQue_Simulation_IO;

public class WriteQue_Simulation_IO 
{
    public static Pointer app_FUNCT_generate_Program()
    {
        try {
            return JavaLIBWriteQue_Simulation_IO.INSTANCE.CLIB_WriteEnableForThreadsAt_SIMULATION__App_FUNCT_generate_Program();
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
            return Global.stat_CONVERT_LsbByteArray_To_LsbBoolean(JavaLIBWriteQue_Simulation_IO.INSTANCE.CLIB_WriteEnableForThreadsAt_SIMULATION__App_FUNCT_get_flag_isPGM_INSTANTIATED());
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
            JavaLIBWriteQue_Simulation_IO.INSTANCE.CLIB_WriteEnableForThreadsAt_SIMULATION__App_FUNCT_terminate_Program();
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
    public static void app_FUNCT_write_End(int threadId)
    {
        try {
            JavaLIBWriteQue_Simulation_IO.INSTANCE.CLIB_WriteEnableForThreadsAt_SIMULATION__App_FUNCT_write_End(Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(Global.stat_CONVERT_LsbInt_To_LsbByteArray(threadId)));
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
    public static void app_FUNCT_write_Start(int threadId)
    {
        try {
            JavaLIBWriteQue_Simulation_IO.INSTANCE.CLIB_WriteEnableForThreadsAt_SIMULATION__App_FUNCT_write_Start(Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(Global.stat_CONVERT_LsbInt_To_LsbByteArray(threadId)));
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
