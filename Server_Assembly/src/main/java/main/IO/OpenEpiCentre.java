package main.IO;
import com.sun.jna.Pointer;
import engine.Global;
import lib.JavaLIB_OpenEpiCentre;
import java.io.IOException;
public class OpenEpiCentre
{
// public.
    public OpenEpiCentre()
    {
        
    }
    public static void app_FUNCT_flip_Input_DoubleBuffer() {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__app_FUNCT_flip_Input_DoubleBuffer();
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static Pointer app_FUNCT_generate_Program() {
        Pointer temp = null;
        try {
            temp =  JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__app_FUNCT_generate_Program();
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
            return (Pointer)null;
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
            return (Pointer)null;
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
        return temp;
    }
    public static boolean app_FUNCT_get_flag_isPGM_INSTNATIATED() {
        byte[] temp;
        temp = new byte[1];
        temp[0] = Byte.MAX_VALUE;
        try {
            temp = JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__app_FUNCT_get_flag_isPGM_INSTANTIATED();
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
        return Global.stat_CONVERT_LsbByteArray_To_LsbBoolean(Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(temp));
    }
    public static void app_FUNCT_select_set_Intput_Subset(int praiseId) {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__app_FUNCT_select_set_Intput_Subset(Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(Global.stat_CONVERT_LsbInt_To_LsbByteArray(praiseId)));
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static void app_FUNCT_terminate_Program() {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__app_FUNCT_terminate_Program();
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static void app_FUNCT_pop_From_Stack_Of_Output() {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__app_FUNCT_pop_From_Stack_Of_Output();
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static void app_FUNCT_push_To_STACK_Of_Input() {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__app_FUNCT_push_To_STACK_Of_Input();
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static Pointer dyn_PGM_get_program_WriteEnableStack_ServerInputAction()
    {
        Pointer temp = null;
        try {
            temp = JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__dyn_PGM_get_program_WriteEnableStack_ServerInputReceive();
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
            return (Pointer)null;
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
            return (Pointer)null;
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
        return temp;
    }
    public static Pointer dyn_PGM_get_program_WriteEnableStack_ServerOutputRecieve()
    {
        Pointer temp = null;
        try {
            temp = JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__dyn_PGM_get_program_WriteEnableStack_ServerOutputSend();
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
            return (Pointer)null;
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
            return (Pointer)null;
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
        return temp;
    }
    public static boolean dyn_REG_get_flag_isStackLoaded_Server_InputAction()
    {
        byte[] temp;
        temp = new byte[1];
        try {
            temp = JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__dyn_REG_get_flag_isStackLoaded_ServerInputReceive();
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
        return Global.stat_CONVERT_LsbByteArray_To_LsbBoolean(Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(temp));
    }
    public static boolean dyn_REG_get_flag_isStackLoaded_Server_OutputSend()
    {
        byte[] temp;
        temp = new byte[1];
        try {
            temp = JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__dyn_REG_get_flag_isStackLoaded_ServerOutputSend();
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
            temp[0] = Byte.MAX_VALUE;
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
            temp[0] = Byte.MAX_VALUE;
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
        return Global.stat_CONVERT_LsbByteArray_To_LsbBoolean(Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(temp));
    }
    public static boolean dyn_REG_get_flag_IsInitialised_OpenAvrilConcurrency()
    {
        byte[] temp;
        temp = new byte[1];
        try {
            temp = JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__dyn_REG_get_flag_IsInitialised_CLIBOpenEpiCentre();
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
        return Global.stat_CONVERT_LsbByteArray_To_LsbBoolean(Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(temp));
    }
    public static double io_PRAISE_get_Item_Output_praise0_Value()
    {
        byte[] temp;
        temp = new byte[8];
        try {
            temp = JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__io_PRAISE_get_Item_Output_praise0_Value();
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
        return Global.stat_CONVERT_LsbByteArray_To_LsbDouble(Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(temp));
    }
    public static double io_PRAISE_get_Item_Output_praise1_Value() {
        byte[] temp;
        temp = new byte[8];
        try {
            temp = JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__io_PRAISE_get_Item_Output_praise1_Value();
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
        return Global.stat_CONVERT_LsbByteArray_To_LsbDouble(Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(temp));
    }
    public static double io_PRAISE_get_Item_Output_praise2_Value()
    {
        byte[] temp;
        temp = new byte[8];
        try {
            temp = JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__io_PRAISE_get_Item_Output_praise2_Value();
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
        return Global.stat_CONVERT_LsbByteArray_To_LsbDouble(Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(temp));
    }
    public static double io_PRAISE_get_Item_Output_praise3_Value()
    {
        byte[] temp;
        temp = new byte[8];
        try {
            temp = JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__io_PRAISE_get_Item_Output_praise3_Value();
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
        return Global.stat_CONVERT_LsbByteArray_To_LsbDouble(Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(temp));
    }
    public static int io_RPRAISE_get_MetaData_PraiseEventId()
    {
        byte[] temp;
        temp = new byte[4];
        try {
            temp = JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__io_PRAISE_get_MetaData_PraiseEventId();
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
        return Global.stat_CONVERT_LsbByteArray_To_LsbInt(Global.stat_CONVERT_MsbByteArray_To_LsbByteArray(temp));
    }
    public static void io_PRAISE_set_Item_Input_praise0_Value_A(float inputValueA)
    {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise0_Value_A(Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(Global.stat_CONVERT_LsbFloat_To_LsbByteArray(inputValueA)));
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static void io_PRAISE_set_Item_Input_praise0_Value_B(float inputValueB)
    {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise0_Value_B(Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(Global.stat_CONVERT_LsbFloat_To_LsbByteArray(inputValueB)));
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static void io_PRAISE_set_Item_Input_praise1_Value_A(float inputValueA)
    {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise1_Value_A(Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(Global.stat_CONVERT_LsbFloat_To_LsbByteArray(inputValueA)));
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static void io_PRAISE_set_Item_Input_praise1_Value_B(float inputValueB)
    {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise1_Value_B(Global.stat_CONVERT_LsbFloat_To_LsbByteArray(inputValueB));
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static void io_PRAISE_set_Item_Input_praise2_Value_A(float inputValueA)
    {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise2_Value_A(Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(Global.stat_CONVERT_LsbFloat_To_LsbByteArray(inputValueA)));
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static void io_PRAISE_set_Item_Input_praise2_Value_B(float inputValueB)
    {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise2_Value_B(Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(Global.stat_CONVERT_LsbFloat_To_LsbByteArray(inputValueB)));
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static void io_PRAISE_set_Item_Input_praise3_Value_A(float inputValueA)
    {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise3_Value_A(Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(Global.stat_CONVERT_LsbFloat_To_LsbByteArray(inputValueA)));
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static void io_PRAISE_set_Item_Input_praise3_Value_B(float inputValueB)
    {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise3_Value_B(Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(Global.stat_CONVERT_LsbFloat_To_LsbByteArray(inputValueB)));
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static void io_PRAISE_set_MetaData_PraiseEventId(int praiseId)
    {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__io_PRAISE_set_MetaData_PraiseEventId(Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(Global.stat_CONVERT_LsbInt_To_LsbByteArray(praiseId)));
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("NullPointerException.%n");
        } catch (NullPointerException e) {
            throw new NullPointerException("NullPointerException.%n");
        }
    }
}
    