package lib;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public interface JavaLIBWriteQue_Simulation_IO extends Library
{
    JavaLIBWriteQue_Simulation_IO INSTANCE = (JavaLIBWriteQue_Simulation_IO) Native.load("libCLIB_WriteQueForThreadsAt_SIMULATION", JavaLIBWriteQue_Simulation_IO.class);
    Pointer CLIB_WriteEnableForThreadsAt_SIMULATION__App_FUNCT_generate_Program();
    byte[] CLIB_WriteEnableForThreadsAt_SIMULATION__App_FUNCT_get_flag_isPGM_INSTANTIATED();
    void CLIB_WriteEnableForThreadsAt_SIMULATION__App_FUNCT_terminate_Program();
    void CLIB_WriteEnableForThreadsAt_SIMULATION__App_FUNCT_write_End(byte[] bytes);
    void CLIB_WriteEnableForThreadsAt_SIMULATION__App_FUNCT_write_Start(byte[] bytes);
}