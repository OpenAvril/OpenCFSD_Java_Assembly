package lib;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public interface JavaLIBConcurrentIOServer  extends Library
{
    JavaLIBConcurrentIOServer INSTANCE = (JavaLIBConcurrentIOServer) Native.load("LIBConcurrentIOServer", JavaLIBConcurrentIOServer.class);
    void app_FUNCT_flip_Input_DoubleBuffer(Pointer obj);
    Pointer app_FUNCT_generate_Program();
    boolean app_FUNCT_get_CLIBConcurrentServerIO_flag_isPGM_INSTNATIATED();
    void app_FUNCT_select_set_Intput_Subset(Pointer obj, byte[] bytes);
    void app_FUNCT_terminate_Program();
    void app_FUNCT_pop_From_Stack_Of_Output(Pointer obj);
    void app_FUNCT_push_To_STACK_Of_Input(Pointer obj);
    Pointer dyn_PGM_get_program_WriteEnableStack_ServerInputAction(Pointer obj);
    Pointer dyn_PGM_get_program_WriteEnableStack_ServerOutputRecieve(Pointer obj);
    byte[] dyn_REG_get_flag_isStackLoaded_Server_InputAction(Pointer obj);
    byte[] dyn_REG_get_flag_isStackLoaded_Server_OutputSend(Pointer obj);
    byte[] dyn_REG_get_flag_IsInitialised_OpenAvrilConcurrency(Pointer obj);
    byte[] io_PRAISE_get_Item_Output_praise0_Value(Pointer obj);
    byte[] io_RPRAISE_get_ptr_PraiseEventId(Pointer obj);
    void io_PRAISE_set_Item_Input_praise0_Value_A(Pointer obj, byte[] bytes);
    void io_PRAISE_set_Item_Input_praise0_Value_B(Pointer obj, byte[] bytes);
    void io_PRAISE_set_PraiseEventId(Pointer obj, byte[] bytes);
}