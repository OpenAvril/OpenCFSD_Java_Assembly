package main.IO;
import com.sun.jna.Pointer;
import engine.Global;
import lib.JavaLIB_OpenEpiCentre;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class OpenEpiCentre
{
// public.
    public OpenEpiCentre()
    {
        
    }
    public static void app_FUNCT_flip_Input_DoubleBuffer()
    {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.app_FUNCT_flip_Input_DoubleBuffer();
        }
        catch (NullPointerException e) {
            //System.out.printf("NullPointerException.%n");
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static Pointer app_FUNCT_generate_Program() throws IOException {
        try {
            return JavaLIB_OpenEpiCentre.INSTANCE.app_FUNCT_generate_Program();
        } catch (UnsatisfiedLinkError e) {
            //System.out.printf("NullPointerException.%n");
            throw new UnsatisfiedLinkError("NullPointerException.%n");
        } catch (NullPointerException e) {
            //System.out.printf("NullPointerException.%n");
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static boolean app_FUNCT_get_flag_isPGM_INSTNATIATED() throws ClassNotFoundException {
        try {
            return Global.stat_CONVERT_MsbByteArray_To_LsbBoolean(JavaLIB_OpenEpiCentre.INSTANCE.app_FUNCT_get_flag_isPGM_INSTNATIATED());
        }
        catch (NullPointerException e) {
            //System.out.printf("NullPointerException.%n");
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static void app_FUNCT_select_set_Intput_Subset(int praiseId)
    {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.app_FUNCT_select_set_Intput_Subset(Global.stat_CONVERT_int_To_ByteArray(praiseId));
        }
        catch (NullPointerException e) {
            //System.out.printf("NullPointerException.%n");
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static void app_FUNCT_terminate_Program()
    {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.app_FUNCT_terminate_Program();
        }
        catch (NullPointerException e) {
            //System.out.printf("NullPointerException.%n");
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static void app_FUNCT_pop_From_Stack_Of_Output()
    {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.app_FUNCT_pop_From_Stack_Of_Output();
        }
        catch (NullPointerException e) {
            //System.out.printf("NullPointerException.%n");
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static void app_FUNCT_push_To_STACK_Of_Input()
    {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.app_FUNCT_push_To_STACK_Of_Input();
        }
        catch (NullPointerException e) {
            //System.out.printf("NullPointerException.%n");
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static Pointer dyn_PGM_get_program_WriteEnableStack_ServerInputAction()
    {
        try {
            return JavaLIB_OpenEpiCentre.INSTANCE.dyn_PGM_get_program_WriteEnableStack_ServerInputAction();
        }
        catch (NullPointerException e) {
            //System.out.printf("NullPointerException.%n");
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static Pointer dyn_PGM_get_program_WriteEnableStack_ServerOutputRecieve()
    {
        try {
            return JavaLIB_OpenEpiCentre.INSTANCE.dyn_PGM_get_program_WriteEnableStack_ServerOutputRecieve();
        }
        catch (NullPointerException e) {
            //System.out.printf("NullPointerException.%n");
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static boolean dyn_REG_get_flag_isStackLoaded_Server_InputAction()
    {
        try {
            return Global.stat_CONVERT_MsbByteArray_To_LsbBoolean(JavaLIB_OpenEpiCentre.INSTANCE.dyn_REG_get_flag_isStackLoaded_Server_InputAction());
        }
        catch (NullPointerException e) {
            //System.out.printf("NullPointerException.%n");
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static boolean dyn_REG_get_flag_isStackLoaded_Server_OutputSend()
    {
        try {
            return Global.stat_CONVERT_MsbByteArray_To_LsbBoolean(JavaLIB_OpenEpiCentre.INSTANCE.dyn_REG_get_flag_isStackLoaded_Server_OutputSend());
        }
        catch (NullPointerException e) {
            //System.out.printf("NullPointerException.%n");
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static boolean dyn_REG_get_flag_IsInitialised_OpenAvrilConcurrency()
    {
        try {
            return Global.stat_CONVERT_MsbByteArray_To_LsbBoolean(JavaLIB_OpenEpiCentre.INSTANCE.dyn_REG_get_flag_IsInitialised_OpenAvrilConcurrency());
        }
        catch (NullPointerException e) {
            //System.out.printf("NullPointerException.%n");
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static double io_PRAISE_get_Item_Output_praise0_Value()
    {
        try {
            return Global.stat_CONVERT_ByteArray_To_Double(JavaLIB_OpenEpiCentre.INSTANCE.io_PRAISE_get_Item_Output_praise0_Value());
        }
        catch (NullPointerException e) {
            //System.out.printf("NullPointerException.%n");
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static double io_PRAISE_get_Item_Output_praise1_Value() {
        try {
            return Global.stat_CONVERT_ByteArray_To_Double(JavaLIB_OpenEpiCentre.INSTANCE.io_PRAISE_get_Item_Output_praise1_Value());
        }
        catch (NullPointerException e) {
            //System.out.printf("NullPointerException.%n");
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static double io_PRAISE_get_Item_Output_praise2_Value()
    {
        try {
            return Global.stat_CONVERT_ByteArray_To_Double(JavaLIB_OpenEpiCentre.INSTANCE.io_PRAISE_get_Item_Output_praise2_Value());
        }
        catch (NullPointerException e) {
            //System.out.printf("NullPointerException.%n");
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static double io_PRAISE_get_Item_Output_praise3_Value()
    {
        try {
            return Global.stat_CONVERT_ByteArray_To_Double(JavaLIB_OpenEpiCentre.INSTANCE.io_PRAISE_get_Item_Output_praise3_Value());
        }
        catch (NullPointerException e) {
            //System.out.printf("NullPointerException.%n");
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static int io_RPRAISE_get_ptr_PraiseEventId()
    {
        try {
            return Global.stat_CONVERT_ByteArray_To_int(JavaLIB_OpenEpiCentre.INSTANCE.io_RPRAISE_get_MetaData_PraiseEventId());
        }
        catch (NullPointerException e) {
            //System.out.printf("NullPointerException.%n");
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static void io_PRAISE_set_Item_Input_praise0_Value_A(float inputValueA)
    {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.io_PRAISE_set_Item_Input_praise0_Value_A(Global.stat_CONVERT_Float_To_ByteArray(inputValueA));
        }
        catch (NullPointerException e) {
            //System.out.printf("NullPointerException.%n");
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static void io_PRAISE_set_Item_Input_praise0_Value_B(float inputValueB)
    {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.io_PRAISE_set_Item_Input_praise0_Value_B(Global.stat_CONVERT_Float_To_ByteArray(inputValueB));
        }
        catch (NullPointerException e) {
            //System.out.printf("NullPointerException.%n");
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static void io_PRAISE_set_Item_Input_praise1_Value_A(float inputValueA)
    {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.io_PRAISE_set_Item_Input_praise1_Value_A(Global.stat_CONVERT_Float_To_ByteArray(inputValueA));
        }
        catch (NullPointerException e) {
            //System.out.printf("NullPointerException.%n");
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static void io_PRAISE_set_Item_Input_praise1_Value_B(float inputValueB)
    {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.io_PRAISE_set_Item_Input_praise1_Value_B(Global.stat_CONVERT_Float_To_ByteArray(inputValueB));
        }
        catch (NullPointerException e) {
            //System.out.printf("NullPointerException.%n");
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static void io_PRAISE_set_Item_Input_praise2_Value_A(float inputValueA)
    {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.io_PRAISE_set_Item_Input_praise2_Value_A(Global.stat_CONVERT_Float_To_ByteArray(inputValueA));
        }
        catch (NullPointerException e) {
            //System.out.printf("NullPointerException.%n");
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static void io_PRAISE_set_Item_Input_praise2_Value_B(float inputValueB)
    {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.io_PRAISE_set_Item_Input_praise2_Value_B(Global.stat_CONVERT_Float_To_ByteArray(inputValueB));
        }
        catch (NullPointerException e) {
            //System.out.printf("NullPointerException.%n");
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static void io_PRAISE_set_Item_Input_praise3_Value_A(float inputValueA)
    {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.io_PRAISE_set_Item_Input_praise3_Value_A(Global.stat_CONVERT_Float_To_ByteArray(inputValueA));
        }
        catch (NullPointerException e) {
            //System.out.printf("NullPointerException.%n");
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static void io_PRAISE_set_Item_Input_praise3_Value_B(float inputValueB)
    {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.io_PRAISE_set_Item_Input_praise3_Value_B(Global.stat_CONVERT_Float_To_ByteArray(inputValueB));
        }
        catch (NullPointerException e) {
            //System.out.printf("NullPointerException.%n");
            throw new NullPointerException("NullPointerException.%n");
        }
    }
    public static void io_PRAISE_set_PraiseEventId(int praiseId)
    {
        try {
            JavaLIB_OpenEpiCentre.INSTANCE.io_PRAISE_set_MetaData_PraiseEventId(Global.stat_CONVERT_int_To_ByteArray(praiseId));
        }
        catch (NullPointerException e) {
            //System.out.printf("NullPointerException.%n");
            throw new NullPointerException("NullPointerException.%n");
        }
    }
}
    