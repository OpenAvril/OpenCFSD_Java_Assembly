package lib;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public interface JavaLIBLaunchQue_Server extends Library
{
    JavaLIBLaunchQue_Server INSTANCE = (JavaLIBLaunchQue_Server) Native.load("libCLIB_LaunchQueForThreadsAt_Server", JavaLIBLaunchQue_Server.class);
    Pointer CLIB_LaunchEnableForConcurrentThreadsAt_Server__app_FUNCT_generate_Program();
    byte[] CLIB_LaunchEnableForConcurrentThreadsAt_Server__app_FUNCT_get_flag_isPGM_INSTANTIATED();
    void CLIB_LaunchEnableForConcurrentThreadsAt_Server__app_FUNCT_request_Wait_launch(byte[] bytes);
    void CLIB_LaunchEnableForConcurrentThreadsAt_Server__app_FUNCT_terminate_Program();
    void CLIB_LaunchEnableForConcurrentThreadsAt_Server__app_FUNCT_thread_End(byte[] bytes);
    byte[] CLIB_LaunchEnableForConcurrentThreadsAt_Server__app_REG_get_coreId_To_launch();
    byte[] CLIB_LaunchEnableForConcurrentThreadsAt_Server__app_REG_get_Flag_Active();
    byte[] CLIB_LaunchEnableForConcurrentThreadsAt_Server__app_REG_get_Flag_ConcurrentCoreState(byte[] bytes);
    byte[] CLIB_LaunchEnableForConcurrentThreadsAt_Server__app_REG_get_Flag_Idle();
    byte[] CLIB_LaunchEnableForConcurrentThreadsAt_Server__app_REG_get_State_launchBit();
    void CLIB_LaunchEnableForConcurrentThreadsAt_Server__app_REG_set_Flag_ConcurrentCoreState(byte[] bytesThreadId, byte[] byteBool);
}
