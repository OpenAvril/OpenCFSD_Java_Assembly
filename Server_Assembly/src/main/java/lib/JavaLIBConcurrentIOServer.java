package lib;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public interface JavaLIBConcurrentIOServer  extends Library
{
    JavaLIBConcurrentIOServer INSTANCE = (JavaLIBConcurrentIOServer) Native.load("LIBConcurrentIOServer", JavaLIBConcurrentIOServer.class);
    void app_FUNCT_flip_Input_DoubleBuffer(Pointer obj);
    Pointer app_FUNCT_generate_Program();
    void app_FUNCT_select_set_Intput_Subset(Pointer obj, byte[] bytes);
    void app_FUNCT_terminate_Program(Pointer obj);
    void app_FUNCT_pop_From_Stack_Of_Output(Pointer obj);
    void app_FUNCT_push_To_STACK_Of_Input(Pointer obj);
    Boolean dyn_REG_get_flag_isStackLoaded_Server_InputAction(Pointer obj);
    Boolean dyn_REG_get_flag_isStackLoaded_Server_OutputSend(Pointer obj);
    Boolean dyn_REG_get_flag_IsInitialised_OpenAvrilConcurrency(Pointer obj);
    byte[] dyn_REG_get_ptr_PraiseEventId(Pointer obj);
    byte[] dyn_REG_get_ptr_output_Value(Pointer obj);
    void dyn_REG_set_Item_input_Value_A(Pointer obj, byte[] bytes);
    void dyn_REG_set_Item_input_Value_B(Pointer obj, byte[] bytes);
    void dyn_REG_set_PraiseEventId(Pointer obj, byte[] bytes);
    Pointer dyn_PGM_get_program_WriteEnableStack_ServerInputAction(Pointer obj);
    Pointer dyn_PGM_get_program_WriteEnableStack_ServerOutputRecieve(Pointer obj);
}