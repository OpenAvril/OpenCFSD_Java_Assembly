package main.IO;
import com.sun.jna.Pointer;
import engine.Global;
import lib.JavaLIBWriteQue_Simulation_IO;

public class WriteQue_Simulation_IO 
{
    public static Pointer app_FUNCT_generate_Program()
    {
        try {
            return JavaLIBWriteQue_Simulation_IO.INSTANCE.app_FUNCT_generate_Program();
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
            return Global.stat_CONVERT_MsbByteArray_To_LsbBoolean(JavaLIBWriteQue_Simulation_IO.INSTANCE.app_FUNCT_get_flag_isPGM_INSTNATIATED());
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
            JavaLIBWriteQue_Simulation_IO.INSTANCE.app_FUNCT_terminate_Program();
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
            JavaLIBWriteQue_Simulation_IO.INSTANCE.app_FUNCT_write_End(Global.stat_CONVERT_LsbInt_To_MsbByteArray(threadId));
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
            JavaLIBWriteQue_Simulation_IO.INSTANCE.app_FUNCT_write_Start(Global.stat_CONVERT_LsbInt_To_MsbByteArray(threadId));
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
