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
            return (Pointer)null;
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
            return (Pointer)null;
        }
        catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
            return (Pointer)null;
        }
    }
    public static boolean app_FUNCT_get_flag_isPGM_INSTNATIATED()
    {
        try {
            return Global.stat_CONVERT_MsbByteArray_To_LsbBoolean(JavaLIBLaunchQue_Server.INSTANCE.app_FUNCT_get_flag_isPGM_INSTNATIATED());
        }
        catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
            return true;
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
            return true;
        }
        catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
            return true;
        }
    }
    public static void app_FUNCT_request_Wait_launch(int threadId)
    {
        try {
            JavaLIBLaunchQue_Server.INSTANCE.app_FUNCT_request_Wait_launch(Global.stat_CONVERT_int_To_ByteArray(threadId));
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
    public static void app_FUNCT_thread_End(int threadId)
    {
        try {
            JavaLIBLaunchQue_Server.INSTANCE.app_FUNCT_thread_End(Global.stat_CONVERT_int_To_ByteArray(threadId));
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
    public static int app_REG_get_coreId_To_launch()
    {
        try {
            return Global.stat_CONVERT_ByteArray_To_int(JavaLIBLaunchQue_Server.INSTANCE.app_REG_get_coreId_To_launch());
        }
        catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
            return Integer.MAX_VALUE;
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
            return Integer.MAX_VALUE;
        }
        catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
            return Integer.MAX_VALUE;
        }
    }
    public static boolean app_REG_get_Flag_Active()
    {
        try {
            return Global.stat_CONVERT_MsbByteArray_To_LsbBoolean(JavaLIBLaunchQue_Server.INSTANCE.app_REG_get_Flag_Active());
        }
        catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
            return true;
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
            return true;
        }
        catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
            return true;
        }
    }
    public static boolean app_REG_get_Flag_ConcurrentCoreState(int threadId)
    {
        try {
            return Global.stat_CONVERT_MsbByteArray_To_LsbBoolean(JavaLIBLaunchQue_Server.INSTANCE.app_REG_get_Flag_ConcurrentCoreState(Global.stat_CONVERT_int_To_ByteArray(threadId)));
        }
        catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
            return true;
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
            return true;
        }
        catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
            return true;
        }
    }
    public static boolean app_REG_get_Flag_Idle()
    {
        try {
            return Global.stat_CONVERT_MsbByteArray_To_LsbBoolean(JavaLIBLaunchQue_Server.INSTANCE.app_REG_get_Flag_Idle());
        }
        catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
            return true;
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
            return true;
        }
        catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
            return true;
        }
    }
    public static boolean app_REG_get_State_launchBit()
    {
        try {
            return Global.stat_CONVERT_MsbByteArray_To_LsbBoolean(JavaLIBLaunchQue_Server.INSTANCE.app_REG_get_State_launchBit());
        }
        catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
            return true;
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
            return true;
        }
        catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
            return true;
        }
    }
    public static void app_REG_set_Flag_ConcurrentCoreState(int concurrentThreadId, boolean state)
    {
        try {
            JavaLIBLaunchQue_Server.INSTANCE.app_REG_set_Flag_ConcurrentCoreState(Global.stat_CONVERT_int_To_ByteArray(concurrentThreadId), Global.stat_CONVERT_LsbBoolean_To_MsbByteArray(state));
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
