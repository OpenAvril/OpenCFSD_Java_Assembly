package lib;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public interface JavaWriteQue_SimulationIO extends Library {
    JavaWriteQue_SimulationIO INSTANCE = (JavaWriteQue_SimulationIO) Native.load("libCLIB_WriteQueForThreadsAt_SIMULATION", JavaWriteQue_SimulationIO.class);
    Pointer CLIB_WriteEnableForThreadsAt_SimulationIO__App_FUNCT_generate_Program();
    byte[] CLIB_WriteEnableForThreadsAt_SimulationIO_InputSamples__App_FUNCT_get_flag_isPGM_INSTANTIATED();
    void CLIB_WriteEnableForThreadsAt_SimulationIO_InputSamples__App_FUNCT_terminate_Program();
    void CLIB_WriteEnableForThreadsAt_SimulationIO_InputSamples__App_FUNCT_write_End(byte[] bytes);
    void CLIB_WriteEnableForThreadsAt_SimulationIO_InputSamples__App_FUNCT_write_Start(byte[] bytes);
}