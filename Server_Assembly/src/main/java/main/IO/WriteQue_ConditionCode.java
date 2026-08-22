package main.IO;

import com.sun.jna.Pointer;
import engine.Global;
import libs.JavaLIBWriteQue_Simulation_InputSamples;
import libs.JavaWriteQue_ConditionCode;

public class WriteQue_ConditionCode {

    public static Pointer app_FUNCT_generate_Program()
    {
        try {
            return JavaWriteQue_ConditionCode.INSTANCE.CLIB_WriteEnableForThreadsAt_ConditionCode__App_FUNCT_generate_Program();
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
            return Global.stat_CONVERT_ByteArray_To_Boolean(JavaWriteQue_ConditionCode.INSTANCE.CLIB_WriteEnableForThreadsAt_ConditionCode_InputSamples__App_FUNCT_get_flag_isPGM_INSTANTIATED());
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
            JavaWriteQue_ConditionCode.INSTANCE.CLIB_WriteEnableForThreadsAt_ConditionCode_InputSamples__App_FUNCT_terminate_Program();
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
            JavaWriteQue_ConditionCode.INSTANCE.CLIB_WriteEnableForThreadsAt_ConditionCode_InputSamples__App_FUNCT_write_End(Global.stat_CONVERT_ByteArray_To_ReverseByteArray(Global.stat_CONVERT_Long_To_ByteArray(threadId)));
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
            JavaWriteQue_ConditionCode.INSTANCE.CLIB_WriteEnableForThreadsAt_ConditionCode_InputSamples__App_FUNCT_write_Start(Global.stat_CONVERT_ByteArray_To_ReverseByteArray(Global.stat_CONVERT_Long_To_ByteArray(threadId)));
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
