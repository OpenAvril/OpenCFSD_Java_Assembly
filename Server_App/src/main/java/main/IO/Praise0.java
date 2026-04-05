package main.IO;

import com.sun.jna.Pointer;
import lib.JavaLIBConcurrentIOServer;

public class Praise0 
{
    public static byte[] dyn_REG_get_ptr_output_Value(Pointer obj)
    {
        try {
            return JavaLIBConcurrentIOServer.INSTANCE.dyn_REG_get_ptr_output_Value(obj);
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
    public static void dyn_REG_set_Item_input_Value_A(Pointer obj, byte[] bytes)
    {
        try {
            JavaLIBConcurrentIOServer.INSTANCE.dyn_REG_set_Item_input_Value_A(obj, bytes);
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
    public static void dyn_REG_set_Item_input_Value_B(Pointer obj, byte[] bytes)
    {
        try {
            JavaLIBConcurrentIOServer.INSTANCE.dyn_REG_set_Item_input_Value_B(obj, bytes);
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
