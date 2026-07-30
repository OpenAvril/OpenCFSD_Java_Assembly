package libs;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public interface JavaLIBWriteQueSERVEROUTPUTSEND extends Library
{
    JavaLIBWriteQueSERVEROUTPUTSEND INSTANCE = (JavaLIBWriteQueSERVEROUTPUTSEND) Native.load("libCLIB_WriteQueForThreadsAt_ServerOutputSend", JavaLIBWriteQueSERVEROUTPUTSEND.class);
    Pointer CLIB_WriteEnableForThreadsAt_ServerOutputSend__App_FUNCT_generate_Program();
    byte[] CLIB_WriteEnableForThreadsAt_ServerOutputSend__App_FUNCT_get_flag_isPGM_INSTANTIATED();
    void CLIB_WriteEnableForThreadsAt_ServerOutputSend__App_FUNCT_terminate_Program();
    void CLIB_WriteEnableForThreadsAt_ServerOutputSend__App_FUNCT_write_End(byte[] bytes);
    void CLIB_WriteEnableForThreadsAt_ServerOutputSend__App_FUNCT_write_Start(byte[] bytes);

}
