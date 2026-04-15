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
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
        catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
        }
        return (Pointer)null;
    }
    public static Boolean app_FUNCT_get_flag_isPGM_INSTNATIATED()
    {
        try {
            return Global.stat_CONVERT_ByteArray_To_boolean(JavaLIBWriteQueSERVERINPUTRECIEVE.INSTANCE.app_FUNCT_get_flag_isPGM_INSTNATIATED());
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
    public static void app_FUNCT_write_End(int bytesInt)
    {
        try {
            JavaLIBWriteQueSERVERINPUTRECIEVE.INSTANCE.app_FUNCT_write_End(Global.stat_CONVERT_int_To_ByteArray(bytesInt));
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
    public static void app_FUNCT_write_Start(byte[] bytes)
    {
        try {
            JavaLIBWriteQueSERVERINPUTRECIEVE.INSTANCE.app_FUNCT_write_Start(bytes);
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
