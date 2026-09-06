package libs;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
public interface JavaLIB_WriteQueForThreadsAt_ServerConditionCode extends Library
{
    JavaLIB_WriteQueForThreadsAt_ServerConditionCode INSTANCE = (JavaLIB_WriteQueForThreadsAt_ServerConditionCode) Native.load("libCLIB_WriteQueForThreadsAt_ServerConditionCode", JavaLIB_WriteQueForThreadsAt_ServerConditionCode.class);
    Pointer CLIB_WriteEnableForThreadsAt_ServerConditionCode__App_FUNCT_generate_Program();
    byte[] CLIB_WriteEnableForThreadsAt_ServerConditionCode__App_FUNCT_get_FLAG_isPGM_INSTANTIATED();
    void CLIB_WriteEnableForThreadsAt_ServerConditionCode__App_FUNCT_terminate_Program();
    void CLIB_WriteEnableForThreadsAt_ServerConditionCode__App_FUNCT_write_End(byte[] bytes);
    void CLIB_WriteEnableForThreadsAt_ServerConditionCode__App_FUNCT_write_Start(byte[] bytes);
}