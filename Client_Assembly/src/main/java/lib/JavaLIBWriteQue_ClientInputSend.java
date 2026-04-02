package lib;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public interface JavaLIBWriteQue_ClientInputSend  extends Library
{
    JavaLIBLaunchQue_Client INSTANCE = (JavaLIBLaunchQue_Client) Native.load("Assignment_1_-_the_dll", JavaLIBLaunchQue_Client.class);
    Pointer app_FUNCT_generate_Program();
    void app_FUNCT_terminate_Program();
    void app_FUNCT_write_End(Pointer obj, byte[] bytes);
    void app_FUNCT_write_Start(Pointer obj, byte[] bytes);
}