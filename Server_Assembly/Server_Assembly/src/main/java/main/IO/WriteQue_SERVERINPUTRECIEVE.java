package main.IO;

import com.sun.jna.Pointer;
import engine.Global;
import lib.JavaLIBWriteQueSERVERINPUTRECIEVE;

public class WriteQue_SERVERINPUTRECIEVE
{
    public WriteQue_SERVERINPUTRECIEVE()
    {

    }
    public static Pointer app_FUNCT_generate_Program()
    {
        try {
            return JavaLIBWriteQueSERVERINPUTRECIEVE.INSTANCE.app_FUNCT_generate_Program();
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
    public static Boolean app_FUNCT_get_flag_isPGM_INSTNATIATED()
    {
        try {
            return Global.stat_CONVERT_MsbByteArray_To_LsbBoolean(JavaLIBWriteQueSERVERINPUTRECIEVE.INSTANCE.app_FUNCT_get_flag_isPGM_INSTNATIATED());
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
    public static void app_FUNCT_terminate_Program()
    {
        try {
            JavaLIBWriteQueSERVERINPUTRECIEVE.INSTANCE.app_FUNCT_terminate_Program();
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
            JavaLIBWriteQueSERVERINPUTRECIEVE.INSTANCE.app_FUNCT_write_End(Global.stat_CONVERT_int_To_ByteArray(threadId));
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
            JavaLIBWriteQueSERVERINPUTRECIEVE.INSTANCE.app_FUNCT_write_Start(Global.stat_CONVERT_int_To_ByteArray(threadId));
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