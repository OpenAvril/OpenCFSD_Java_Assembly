package lib;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public interface JavaLIB_OpenEpiCentre extends Library
{
    JavaLIB_OpenEpiCentre INSTANCE = (JavaLIB_OpenEpiCentre) Native.load("libCLIB_OpenEpiCentre", JavaLIB_OpenEpiCentre.class);
    void CLIBConcurrentServerIO__app_FUNCT_flip_Input_DoubleBuffer();
    Pointer CLIBConcurrentServerIO__app_FUNCT_generate_Program();
    byte[] CLIBConcurrentServerIO__app_FUNCT_get_flag_isPGM_INSTANTIATED();
    void CLIBConcurrentServerIO__app_FUNCT_select_set_Intput_Subset(byte[] bytes);
    void CLIBConcurrentServerIO__app_FUNCT_terminate_Program();
    void CLIBConcurrentServerIO__app_FUNCT_pop_From_Stack_Of_Output();
    void CLIBConcurrentServerIO__app_FUNCT_push_To_STACK_Of_Input();
    Pointer CLIBConcurrentServerIO__dyn_PGM_get_program_WriteEnableStack_ServerInputReceive();
    Pointer CLIBConcurrentServerIO__dyn_PGM_get_program_WriteEnableStack_ServerOutputSend();
    byte[] CLIBConcurrentServerIO__dyn_REG_get_flag_isStackLoaded_ServerInputReceive();
    byte[] CLIBConcurrentServerIO__dyn_REG_get_flag_isStackLoaded_ServerOutputSend();
    byte[] CLIBConcurrentServerIO__dyn_REG_get_flag_IsInitialised_CLIBOpenEpiCentre();
    byte[] CLIBConcurrentServerIO__io_PRAISE_get_Item_Output_praise0_Value();
    byte[] CLIBConcurrentServerIO__io_PRAISE_get_Item_Output_praise1_Value();
    byte[] CLIBConcurrentServerIO__io_PRAISE_get_Item_Output_praise2_Value();
    byte[] CLIBConcurrentServerIO__io_PRAISE_get_Item_Output_praise3_Value();
    byte[] CLIBConcurrentServerIO__io_PRAISE_get_MetaData_PraiseEventId();
    void CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise0_Value_A(byte[] bytes);
    void CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise0_Value_B(byte[] bytes);
    void CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise1_Value_A(byte[] bytes);
    void CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise1_Value_B(byte[] bytes);
    void CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise2_Value_A(byte[] bytes);
    void CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise2_Value_B(byte[] bytes);
    void CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise3_Value_A(byte[] bytes);
    void CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise3_Value_B(byte[] bytes);
    void CLIBConcurrentServerIO__io_PRAISE_set_MetaData_PraiseEventId(byte[] bytes);
}