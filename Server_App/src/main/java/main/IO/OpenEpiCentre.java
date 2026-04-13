package main.IO;
import com.sun.jna.Pointer;
import engine.Global;
import lib.JavaLIBConcurrentIOServer;
public class OpenEpiCentre
{
// public.
    public OpenEpiCentre()
    {
        
    }
    public static void app_FUNCT_flip_Input_DoubleBuffer()
    {
        try {
            JavaLIBConcurrentIOServer.INSTANCE.app_FUNCT_flip_Input_DoubleBuffer();
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
    public static Pointer app_FUNCT_generate_Program()
    {
        try {
            return JavaLIBConcurrentIOServer.INSTANCE.app_FUNCT_generate_Program();
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
    public static byte[] app_FUNCT_get_flag_isPGM_INSTNATIATED()
    {
        try {
            return JavaLIBConcurrentIOServer.INSTANCE.app_FUNCT_get_flag_isPGM_INSTNATIATED();
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
    public static void app_FUNCT_select_set_Intput_Subset(int praiseId)
    {
        try {
            JavaLIBConcurrentIOServer.INSTANCE.app_FUNCT_select_set_Intput_Subset(Global.stat_CONVERT_int_To_ByteArray(praiseId));
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
    public static void app_FUNCT_terminate_Program()
    {
        try {
            JavaLIBConcurrentIOServer.INSTANCE.app_FUNCT_terminate_Program();
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
    public static void app_FUNCT_pop_From_Stack_Of_Output()
    {
        try {
            JavaLIBConcurrentIOServer.INSTANCE.app_FUNCT_pop_From_Stack_Of_Output();
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
    public static void app_FUNCT_push_To_STACK_Of_Input()
    {
        try {
            JavaLIBConcurrentIOServer.INSTANCE.app_FUNCT_push_To_STACK_Of_Input();
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
    public static Pointer dyn_PGM_get_program_WriteEnableStack_ServerInputAction()
    {
        try {
            return JavaLIBConcurrentIOServer.INSTANCE.dyn_PGM_get_program_WriteEnableStack_ServerInputAction();
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
    public static Pointer dyn_PGM_get_program_WriteEnableStack_ServerOutputRecieve()
    {
        try {
            return JavaLIBConcurrentIOServer.INSTANCE.dyn_PGM_get_program_WriteEnableStack_ServerOutputRecieve();
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
    public static byte[] dyn_REG_get_flag_isStackLoaded_Server_InputAction()
    {
        try {
            return JavaLIBConcurrentIOServer.INSTANCE.dyn_REG_get_flag_isStackLoaded_Server_InputAction();
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
    public static byte[] dyn_REG_get_flag_isStackLoaded_Server_OutputSend()
    {
        try {
            return JavaLIBConcurrentIOServer.INSTANCE.dyn_REG_get_flag_isStackLoaded_Server_OutputSend();
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
    public static byte[] dyn_REG_get_flag_IsInitialised_OpenAvrilConcurrency()
    {
        try {
            return JavaLIBConcurrentIOServer.INSTANCE.dyn_REG_get_flag_IsInitialised_OpenAvrilConcurrency();
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
    public static double io_PRAISE_get_Item_Output_praise0_Value()
    {
        try {
            return Global.stat_CONVERT_ByteArray_To_Double(JavaLIBConcurrentIOServer.INSTANCE.io_PRAISE_get_Item_Output_praise0_Value());
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
        return (double)(Double.MAX_VALUE);
    }
    public static int io_RPRAISE_get_ptr_PraiseEventId()
    {
        try {
            return Global.stat_CONVERT_ByteArray_To_int(JavaLIBConcurrentIOServer.INSTANCE.io_RPRAISE_get_ptr_PraiseEventId());
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
        return (int)(Integer.MAX_VALUE);
    }
    public static void io_PRAISE_set_Item_Input_praise0_Value_A(float inputValueA)
    {
        try {
            JavaLIBConcurrentIOServer.INSTANCE.io_PRAISE_set_Item_Input_praise0_Value_A(Global.stat_CONVERT_Float_To_ByteArray(inputValueA));
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
    public static void io_PRAISE_set_Item_Input_praise0_Value_B(float inputValueB)
    {
        try {
            JavaLIBConcurrentIOServer.INSTANCE.io_PRAISE_set_Item_Input_praise0_Value_B(Global.stat_CONVERT_Float_To_ByteArray(inputValueB));
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
    public static void io_PRAISE_set_PraiseEventId(int praiseId)
    {
        try {
            JavaLIBConcurrentIOServer.INSTANCE.io_PRAISE_set_PraiseEventId(Global.stat_CONVERT_int_To_ByteArray(praiseId));
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
    