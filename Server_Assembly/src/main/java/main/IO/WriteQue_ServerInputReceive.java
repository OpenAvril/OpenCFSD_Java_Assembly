package main.IO;
import com.sun.jna.Pointer;
import engine.Global;
import libs.JavaLIB_WriteQueForThreadsAt_ServerInputReceive;
public class WriteQue_ServerInputReceive
{
    public static Pointer app_FUNCT_generate_Program()
    {
        try {
            return JavaLIB_WriteQueForThreadsAt_ServerInputReceive.INSTANCE.CLIB_WriteEnableForThreadsAt_ServerInputReceive__App_FUNCT_generate_Program();
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
            return Global.stat_CONVERT_ByteArray_To_Boolean(JavaLIB_WriteQueForThreadsAt_ServerInputReceive.INSTANCE.CLIB_WriteEnableForThreadsAt_ServerInputReceive__App_FUNCT_get_FLAG_isPGM_INSTANTIATED());
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
            JavaLIB_WriteQueForThreadsAt_ServerInputReceive.INSTANCE.CLIB_WriteEnableForThreadsAt_ServerInputReceive__App_FUNCT_terminate_Program();
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
            JavaLIB_WriteQueForThreadsAt_ServerInputReceive.INSTANCE.CLIB_WriteEnableForThreadsAt_ServerInputReceive__App_FUNCT_write_End(Global.stat_CONVERT_ByteArray_To_ReverseByteArray(Global.stat_CONVERT_int_To_ByteArray(threadId)));
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
            JavaLIB_WriteQueForThreadsAt_ServerInputReceive.INSTANCE.CLIB_WriteEnableForThreadsAt_ServerInputReceive__App_FUNCT_write_Start(Global.stat_CONVERT_ByteArray_To_ReverseByteArray(Global.stat_CONVERT_int_To_ByteArray(threadId)));
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