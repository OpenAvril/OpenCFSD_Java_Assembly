package lib;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public interface JavaLIBLaunchQue_Client  extends Library
{
    JavaLIBLaunchQue_Client INSTANCE = (JavaLIBLaunchQue_Client) Native.load("Assignment_1_-_the_dll", JavaLIBLaunchQue_Client.class);
    Pointer app_FUNCT_generate_Program();
    void app_FUNCT_request_Wait_launch(Pointer obj, byte[] bytes);
    void app_FUNCT_terminate_Progaram();
    void app_FUNCT_thread_End(Pointer obj, byte[] bytes);
    byte[] app_FUNCT_get_coreId_To_launch(Pointer obj);
    boolean app_FUNCT_get_Flag_Active(Pointer obj);
    boolean app_FUNCT_get_Flag_ConcurrentCoreState(Pointer obj, byte[] bytes);
    boolean app_FUNCT_get_Flag_Idle(Pointer obj);
    boolean app_FUNCT_get_State_launchBit(Pointer obj);
    void app_FUNCT_set_Flag_ConcurrentCoreState(Pointer obj, byte[] bytes, boolean newValue);
}
