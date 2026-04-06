package lib;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public interface JavaLIBWriteQue_ClientInputSend extends Library
{
    JavaLIBWriteQue_ClientInputSend INSTANCE = (JavaLIBWriteQue_ClientInputSend) Native.load("LIB_WriteEnableForThreadsAt_CLIENTINPUTACTION", JavaLIBWriteQue_ClientInputSend.class);
    Pointer app_FUNCT_generate_Program();
    void app_FUNCT_terminate_Program();
    void app_FUNCT_write_End(Pointer obj, byte[] bytes);
    void app_FUNCT_write_Start(Pointer obj, byte[] bytes);
}