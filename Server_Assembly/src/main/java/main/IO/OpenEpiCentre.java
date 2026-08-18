package main.IO;
import com.sun.jna.Pointer;
import engine.Global;
import java.util.Arrays;
import libs.JavaLIB_OpenEpiCentre;
public class OpenEpiCentre {
    public static void CLIBConcurrentServerIO__app_FUNCT_flip_Input_DoubleBuffer() {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__app_FUNCT_flip_Input_DoubleBuffer();
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
    public static Pointer CLIBConcurrentServerIO__app_FUNCT_generate_Program() {
        Pointer temp;
        temp = null;
        temp = (Pointer)null;
        try {
            temp = JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__app_FUNCT_generate_Program();
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
        return temp;
    }
    public static boolean CLIBConcurrentServerIO__app_FUNCT_get_flag_isPGM_INSTANTIATED() {
        byte[]  temp;
        temp = null;
        temp = new byte[1];
        temp[0] = Byte.MAX_VALUE;
        try {
            temp = JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__app_FUNCT_get_flag_isPGM_INSTANTIATED();
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
        return Global.stat_CONVERT_LsbByteArray_To_LsbBoolean(Global.stat_CONVERT_MsbByteArray_To_LsbByteArray(temp));
    }
    public static void CLIBConcurrentServerIO__app_FUNCT_select_set_Intput_Subset(long praiseId) {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__app_FUNCT_select_set_Intput_Subset(
                    Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(
                            Global.stat_CONVERT_LSBLong_To_LsbByteArray(praiseId)
                    )
            );
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
    public static void CLIBConcurrentServerIO__app_FUNCT_terminate_Program() {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__app_FUNCT_terminate_Program();
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
    public static void CLIBConcurrentServerIO__app_FUNCT_pop_From_Stack_Of_Output() {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__app_FUNCT_pop_From_Stack_Of_Output();
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
    public static void CLIBConcurrentServerIO__app_FUNCT_push_To_STACK_Of_Input() {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__app_FUNCT_push_To_STACK_Of_Input();
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
    public static Pointer CLIBConcurrentServerIO__dyn_PGM_get_program_WriteEnableStack_ServerInputReceive() {
        Pointer temp;
        temp = null;
        try {
            temp = JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__dyn_PGM_get_program_WriteEnableStack_ServerInputReceive();
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
        return temp;
    }
    public static Pointer CLIBConcurrentServerIO__dyn_PGM_get_program_WriteEnableStack_ServerOutputSend() {
        Pointer temp;
        temp = null;
        try {
            temp = JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__dyn_PGM_get_program_WriteEnableStack_ServerOutputSend();
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
        return temp;
    }
    public static boolean CLIBConcurrentServerIO__dyn_REG_get_flag_isStackLoaded_ServerInputReceive() {
        byte[]  temp;
        temp = null;
        temp = new byte[1];
        temp[0] = Byte.MAX_VALUE;
        try {
            temp = JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__dyn_REG_get_flag_isStackLoaded_ServerInputReceive();
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
        return Global.stat_CONVERT_LsbByteArray_To_LsbBoolean(Global.stat_CONVERT_MsbByteArray_To_LsbByteArray(temp));
    }
    public static boolean CLIBConcurrentServerIO__dyn_REG_get_flag_isStackLoaded_ServerOutputSend() {
        byte[]  temp;
        temp = null;
        temp = new byte[1];
        temp[0] = Byte.MAX_VALUE;
        try {
            temp = JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__dyn_REG_get_flag_isStackLoaded_ServerOutputSend();
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
        return Global.stat_CONVERT_LsbByteArray_To_LsbBoolean(Global.stat_CONVERT_MsbByteArray_To_LsbByteArray(temp));
    }
    public static boolean CLIBConcurrentServerIO__dyn_REG_get_flag_IsInitialised_CLIBOpenEpiCentre() {
        byte[]  temp;
        temp = null;
        temp = new byte[1];
        temp[0] = Byte.MAX_VALUE;
        try {
            temp = JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__dyn_REG_get_flag_IsInitialised_CLIBOpenEpiCentre();
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
        return Global.stat_CONVERT_LsbByteArray_To_LsbBoolean(Global.stat_CONVERT_MsbByteArray_To_LsbByteArray(temp));
    }
    public static double CLIBConcurrentServerIO__io_PRAISE_get_Item_CLIB_OpenEpiCentre_STRUCT__Output_praise0_Value() {
        byte[]  temp;
        temp = null;
        temp = new byte[8];
        for(byte index = 0; index < temp.length; index++) {
            temp[index] = Byte.MAX_VALUE;
        }
        try {
            temp = JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__io_PRAISE_get_Item_Output_praise0_Value();
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
        return Global.stat_CONVERT_LsbByteArray_To_LsbDouble(Global.stat_CONVERT_MsbByteArray_To_LsbByteArray(temp));
    }
    public static double CLIBConcurrentServerIO__io_PRAISE_get_Item_CLIB_OpenEpiCentre_STRUCT__Output_praise1_Value() {
        byte[]  temp;
        temp = null;
        temp = new byte[8];
        for(byte index = 0; index < temp.length; index++) {
            temp[index] = Byte.MAX_VALUE;
        }
        try {
            temp = JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__io_PRAISE_get_Item_Output_praise1_Value();
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
        return Global.stat_CONVERT_LsbByteArray_To_LsbDouble(Global.stat_CONVERT_MsbByteArray_To_LsbByteArray(temp));
    }
    public static double CLIBConcurrentServerIO__io_PRAISE_get_Item_CLIB_OpenEpiCentre_STRUCT__Output_praise2_Value() {
        byte[]  temp;
        temp = null;
        temp = new byte[8];
        for(byte index = 0; index < temp.length; index++) {
            temp[index] = Byte.MAX_VALUE;
        }
        try {
            temp = JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__io_PRAISE_get_Item_Output_praise2_Value();
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
        return Global.stat_CONVERT_LsbByteArray_To_LsbDouble(Global.stat_CONVERT_MsbByteArray_To_LsbByteArray(temp));
    }
    public static double CLIBConcurrentServerIO__io_PRAISE_get_Item_CLIB_OpenEpiCentre_STRUCT__Output_praise3_Value() {
        byte[]  temp;
        temp = null;
        temp = new byte[8];
        for(byte index = 0; index < temp.length; index++) {
            temp[index] = Byte.MAX_VALUE;
        }
        try {
            temp = JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__io_PRAISE_get_Item_Output_praise3_Value();
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
        return Global.stat_CONVERT_LsbByteArray_To_LsbDouble(Global.stat_CONVERT_MsbByteArray_To_LsbByteArray(temp));
    }
    public static long CLIBConcurrentServerIO__io_PRAISE_get_MetaData_PraiseEventId() {
        byte[] temp;
        temp = null;
        temp = new byte[8];
        for(int index = 0; index < 8; index++) {
            temp[index] = 0;
        }
        try {
            temp = JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__io_PRAISE_get_MetaData_PraiseEventId();
            System.out.printf("*%n");
            System.out.printf("*%n");
            System.out.printf("*%n");
            System.out.printf("*%n");
            System.out.printf("*%n");
            System.out.printf("*%n");
            System.out.println(Arrays.toString(temp));
            System.out.println(Arrays.toString(Global.stat_CONVERT_MsbByteArray_To_LsbByteArray(temp)));
            System.out.printf("CLIBConcurrentServerIO__io_PRAISE_get_MetaData_PraiseEventId = " + Global.stat_CONVERT_LsbByteArray_To_LSBLong(Global.stat_CONVERT_MsbByteArray_To_LsbByteArray(temp)) + "%n");//todo SIMULATION
            System.out.printf("*%n");
            System.out.printf("*%n");
            System.out.printf("*%n");
            System.out.printf("*%n");
            System.out.printf("*%n");
            System.out.printf("*%n");

        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        } catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
        }
        return Global.stat_CONVERT_LsbByteArray_To_LSBLong(Global.stat_CONVERT_MsbByteArray_To_LsbByteArray(temp));
    }
    public static void CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise0_Value_A(double value) {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise0_Value_A(
                    Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(
                            Global.stat_CONVERT_LsbDouble_To_LsbByteArray(value)
                    )
            );
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
    public static void CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise0_Value_B(double value) {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise0_Value_B(
                    Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(
                            Global.stat_CONVERT_LsbDouble_To_LsbByteArray(value)
                    )
            );
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
    public static void CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise1_Value_A(double value) {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise1_Value_A(
                    Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(
                            Global.stat_CONVERT_LsbDouble_To_LsbByteArray(value)
                    )
            );
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
    public static void CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise1_Value_B(double value) {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise1_Value_B(
                    Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(
                            Global.stat_CONVERT_LsbDouble_To_LsbByteArray(value)
                    )
            );
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
    public static void CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise2_Value_A(double value) {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise2_Value_A(
                    Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(
                            Global.stat_CONVERT_LsbDouble_To_LsbByteArray(value)
                    )
            );
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
    public static void CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise2_Value_B(double value) {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise2_Value_B(
                    Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(
                            Global.stat_CONVERT_LsbDouble_To_LsbByteArray(value)
                    )
            );
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
    public static void CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise3_Value_A(double value) {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise3_Value_A(
                    Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(
                            Global.stat_CONVERT_LsbDouble_To_LsbByteArray(value)
                    )
            );
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
    public static void CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise3_Value_B(double value) {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise3_Value_B(
                    Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(
                            Global.stat_CONVERT_LsbDouble_To_LsbByteArray(value)
                    )
            );
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
    public static void CLIBConcurrentServerIO__io_PRAISE_set_MetaData_PraiseEventId(long praiseId) {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.CLIBConcurrentServerIO__io_PRAISE_set_MetaData_PraiseEventId(
                Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(
                    Global.stat_CONVERT_LSBLong_To_LsbByteArray(praiseId)
                )
            );
            System.out.printf("*%n");
            System.out.printf("*%n");
            System.out.printf("*%n");
            System.out.printf("*%n");
            System.out.printf("*%n");
            System.out.printf("*%n");
            System.out.printf("CLIBConcurrentServerIO__io_PRAISE_set_MetaData_PraiseEventId = " + praiseId + ".%n");//TODO SIMULATION
            System.out.printf("*%n");
            System.out.printf("*%n");
            System.out.printf("*%n");
            System.out.printf("*%n");
            System.out.printf("*%n");
            System.out.printf("*%n");
        } catch (NoClassDefFoundError e) {
            System.out.printf("NoClassDefFoundError.%n");
        } catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        } catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
        }
    }
}
