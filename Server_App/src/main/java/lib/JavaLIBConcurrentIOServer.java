package lib;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public interface JavaLIBConcurrentIOServer  extends Library
{
    JavaLIBConcurrentIOServer INSTANCE = (JavaLIBConcurrentIOServer) Native.load("LIBConcurrentIOServer", JavaLIBConcurrentIOServer.class);
    void app_FUNCT_flip_Input_DoubleBuffer();
    Pointer app_FUNCT_generate_Program();
    byte[]app_FUNCT_get_flag_isPGM_INSTNATIATED();
    void app_FUNCT_select_set_Intput_Subset(byte[] bytes);
    void app_FUNCT_terminate_Program();
    void app_FUNCT_pop_From_Stack_Of_Output();
    void app_FUNCT_push_To_STACK_Of_Input();
    Pointer dyn_PGM_get_program_WriteEnableStack_ServerInputAction();
    Pointer dyn_PGM_get_program_WriteEnableStack_ServerOutputRecieve();
    byte[] dyn_REG_get_flag_isStackLoaded_Server_InputAction();
    byte[] dyn_REG_get_flag_isStackLoaded_Server_OutputSend();
    byte[] dyn_REG_get_flag_IsInitialised_OpenAvrilConcurrency();
    byte[] io_PRAISE_get_Item_Output_praise0_Value();
    byte[] io_RPRAISE_get_ptr_PraiseEventId();
    void io_PRAISE_set_Item_Input_praise0_Value_A(byte[] bytes);
    void io_PRAISE_set_Item_Input_praise0_Value_B(byte[] bytes);
    void io_PRAISE_set_PraiseEventId(byte[] bytes);
}