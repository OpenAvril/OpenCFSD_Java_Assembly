package libs;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
public interface JavaLIB_WriteQueForThreadsAt_ClientUserInput extends Library
{
    JavaLIB_WriteQueForThreadsAt_ClientUserInput INSTANCE = (JavaLIB_WriteQueForThreadsAt_ClientUserInput) Native.load("libCLIB_WriteQueForThreadsAt_ClientUserInput", JavaLIB_WriteQueForThreadsAt_ClientUserInput.class);
    Pointer CLIB_WriteEnableForThreadsAt_ClientUserInput__App_FUNCT_generate_Program();
    byte[] CLIB_WriteEnableForThreadsAt_ClientUserInput__App_FUNCT_get_FLAG_isPGM_INSTANTIATED();
    void CLIB_WriteEnableForThreadsAt_ClientUserInput__App_FUNCT_terminate_Program();
    void CLIB_WriteEnableForThreadsAt_ClientUserInput__App_FUNCT_write_End(byte[] bytes);
    void CLIB_WriteEnableForThreadsAt_ClientUserInput__App_FUNCT_write_Start(byte[] bytes);
}