package libs;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public interface JavaLIB_WriteQueForThreadsAt_ServerOutputSend extends Library
{
    JavaLIB_WriteQueForThreadsAt_ServerOutputSend INSTANCE = (JavaLIB_WriteQueForThreadsAt_ServerOutputSend) Native.load("libCLIB_WriteQueForThreadsAt_ServerOutputSend", JavaLIB_WriteQueForThreadsAt_ServerOutputSend.class);
    Pointer CLIB_WriteEnableForThreadsAt_ServerOutputSend__App_FUNCT_generate_Program();
    byte[] CLIB_WriteEnableForThreadsAt_ServerOutputSend__App_FUNCT_get_FLAG_isPGM_INSTANTIATED();
    void CLIB_WriteEnableForThreadsAt_ServerOutputSend__App_FUNCT_terminate_Program();
    void CLIB_WriteEnableForThreadsAt_ServerOutputSend__App_FUNCT_write_End(byte[] bytes);
    void CLIB_WriteEnableForThreadsAt_ServerOutputSend__App_FUNCT_write_Start(byte[] bytes);
}