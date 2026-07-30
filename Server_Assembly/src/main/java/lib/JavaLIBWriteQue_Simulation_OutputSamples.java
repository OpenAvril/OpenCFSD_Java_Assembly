package lib;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public interface JavaLIBWriteQue_Simulation_OutputSamples extends Library
{
    JavaLIBWriteQue_Simulation_OutputSamples INSTANCE = (JavaLIBWriteQue_Simulation_OutputSamples) Native.load("libCLIB_WriteQueForThreadsAt_SIMULATION_OutputSamples", JavaLIBWriteQue_Simulation_OutputSamples.class);
    Pointer CLIB_WriteEnableForThreadsAt_SIMULATION_OutputSamples__App_FUNCT_generate_Program();
    byte[] CLIB_WriteEnableForThreadsAt_SIMULATION_OutputSamples__App_FUNCT_get_flag_isPGM_INSTANTIATED();
    void CLIB_WriteEnableForThreadsAt_SIMULATION_OutputSamples__App_FUNCT_terminate_Program();
    void CLIB_WriteEnableForThreadsAt_SIMULATION_OutputSamples__App_FUNCT_write_End(byte[] bytes);
    void CLIB_WriteEnableForThreadsAt_SIMULATION_OutputSamples__App_FUNCT_write_Start(byte[] bytes);
}