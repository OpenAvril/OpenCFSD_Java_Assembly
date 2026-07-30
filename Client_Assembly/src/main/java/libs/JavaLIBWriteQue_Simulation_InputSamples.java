package libs;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public interface JavaLIBWriteQue_Simulation_InputSamples extends Library
{
    JavaLIBWriteQue_Simulation_InputSamples INSTANCE = (JavaLIBWriteQue_Simulation_InputSamples) Native.load("libCLIB_WriteQueForThreadsAt_SIMULATION_InputSamples", JavaLIBWriteQue_Simulation_InputSamples.class);
    Pointer CLIB_WriteEnableForThreadsAt_SIMULATION_InputSamples__App_FUNCT_generate_Program();
    byte[] CLIB_WriteEnableForThreadsAt_SIMULATION_InputSamples__App_FUNCT_get_flag_isPGM_INSTANTIATED();
    void CLIB_WriteEnableForThreadsAt_SIMULATION_InputSamples__App_FUNCT_terminate_Program();
    void CLIB_WriteEnableForThreadsAt_SIMULATION_InputSamples__App_FUNCT_write_End(byte[] bytes);
    void CLIB_WriteEnableForThreadsAt_SIMULATION_InputSamples__App_FUNCT_write_Start(byte[] bytes);
}