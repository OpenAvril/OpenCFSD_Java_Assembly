package main.IO;

import com.sun.jna.Pointer;
import engine.Global;
import libs.JavaWriteQue_SimulationIO;

public class WriteQue_SimulationIO {

    public static Pointer app_FUNCT_generate_Program()
    {
        try {
            return JavaWriteQue_SimulationIO.INSTANCE.CLIB_WriteEnableForThreadsAt_SimulationIO__App_FUNCT_generate_Program();
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
            return Global.stat_CONVERT_LsbByteArray_To_LsbBoolean(JavaWriteQue_SimulationIO.INSTANCE.CLIB_WriteEnableForThreadsAt_SimulationIO_InputSamples__App_FUNCT_get_flag_isPGM_INSTANTIATED());
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
            JavaWriteQue_SimulationIO.INSTANCE.CLIB_WriteEnableForThreadsAt_SimulationIO_InputSamples__App_FUNCT_terminate_Program();
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
            JavaWriteQue_SimulationIO.INSTANCE.CLIB_WriteEnableForThreadsAt_SimulationIO_InputSamples__App_FUNCT_write_End(Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(Global.stat_CONVERT_LSBLong_To_LsbByteArray(threadId)));
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
            JavaWriteQue_SimulationIO.INSTANCE.CLIB_WriteEnableForThreadsAt_SimulationIO_InputSamples__App_FUNCT_write_Start(Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(Global.stat_CONVERT_LSBLong_To_LsbByteArray(threadId)));
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
