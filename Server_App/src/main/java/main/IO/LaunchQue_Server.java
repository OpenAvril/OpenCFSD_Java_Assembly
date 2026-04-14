package main.IO;
import com.sun.jna.Pointer;
import engine.Global;
import lib.JavaLIBLaunchQue_Server;
public class LaunchQue_Server
{
// public.
    public LaunchQue_Server()
    {

    }
    public static Pointer app_FUNCT_generate_Program()
    {
        try {
            return JavaLIBLaunchQue_Server.INSTANCE.app_FUNCT_generate_Program();
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
        return (Pointer)null;
    }
    public static void app_FUNCT_request_Wait_launch(byte[] bytes)
    {
        try {
            JavaLIBLaunchQue_Server.INSTANCE.app_FUNCT_request_Wait_launch(bytes);
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
    public static void app_FUNCT_terminate_Progaram()
    {
        try {
            JavaLIBLaunchQue_Server.INSTANCE.app_FUNCT_terminate_Progaram();
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
    public static void app_FUNCT_thread_End(byte[] bytes)
    {
        try {
            JavaLIBLaunchQue_Server.INSTANCE.app_FUNCT_thread_End(bytes);
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
    public static byte[] app_REG_get_coreId_To_launch()
    {
        try {
            return JavaLIBLaunchQue_Server.INSTANCE.app_REG_get_coreId_To_launch();
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
        return Global.stat_CONVERT_int_To_ByteArray(Integer.MAX_VALUE);
    }
    public static byte[] app_REG_get_Flag_Active()
    {
        try {
            return JavaLIBLaunchQue_Server.INSTANCE.app_REG_get_Flag_Active();
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
        return Global.stat_CONVERT_boolean_To_ByteArray(true);
    }
    public static byte[] app_REG_get_Flag_ConcurrentCoreState(byte[] bytes)
    {
        try {
            return JavaLIBLaunchQue_Server.INSTANCE.app_REG_get_Flag_ConcurrentCoreState(bytes);
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
        return Global.stat_CONVERT_boolean_To_ByteArray(true);
    }
    public static byte[] app_REG_get_Flag_Idle()
    {
        try {
            return JavaLIBLaunchQue_Server.INSTANCE.app_REG_get_Flag_Idle();
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
        return Global.stat_CONVERT_boolean_To_ByteArray(true);
    }
    public static byte[] app_REG_get_State_launchBit()
    {
        try {
            return JavaLIBLaunchQue_Server.INSTANCE.app_REG_get_State_launchBit();
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
        return Global.stat_CONVERT_boolean_To_ByteArray(true);
    }
    public static void app_REG_set_Flag_ConcurrentCoreState(byte[] bytesConcurrentThreadId, byte[] bytesValue)
    {
        try {
            JavaLIBLaunchQue_Server.INSTANCE.app_REG_set_Flag_ConcurrentCoreState(bytesConcurrentThreadId, bytesValue);
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
