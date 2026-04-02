package engine;

import lib.JavaLIBLaunchQue_Client;
import lib.JavaLIBWriteQue_ClientInputSend;
import lib.JavaLIBWriteQue_ClientOutputRecieve;
import com.sun.jna.Pointer;

public class Execute 
{
    private static Pointer _stat_PGM_LaunchQue_Client;
    private static Pointer _stat_PGM_WriteQue_Client_InputSend;
    private static Pointer _stat_PGM_WriteQue_Client_OutputRecieve;
// public.
    public Execute() 
    {
        System.out.printf("entered CLASS Execute()%n");
        stat_CLASS_boot0_DECLAIRE_Execute();
        stat_CLASS_boot1_DEFINE_Execute();
        stat_CLASS_boot3_INITIALISE_Execute();
        stat_REG_boot0_DECLAIRE_Execute();
        System.out.printf("exiting CLASS Execute()%n");
    }
    public void dyn_REG_boot1_DEFINE_Execute(Framework obj)
    {
        System.out.printf("entered dyn_REG_boot1_DEFINE_Execute().%n");

        System.out.printf("exiting dyn_REG_boot1_DEFINE_Execute().%n");
    }
    public void dyn_REG_boot2_SUBSTANTIATE_Execute(Framework obj)
    {
        System.out.printf("entered dyn_REG_boot2_SUBSTANTIATE_Execute().%n");

        System.out.printf("exiting dyn_REG_boot2_SUBSTANTIATE_Execute().%n");
    }
    public void dyn_REG_boot3_INITIALISE_Execute(Framework obj)
    {
        System.out.printf("entered dyn_REG_boot3_INITIALISE_Execute().%n");

        System.out.printf("exiting dyn_REG_boot3_INITIALISE_Execute().%n");
    }
    public void dyn_REG_boot4_INSTANTIATE_Execute(Framework obj)
    {
        System.out.printf("entered dyn_REG_boot4_INSTANTIATE_Execute().%n");

        System.out.printf("exiting dyn_REG_boot4_INSTANTIATE_Execute().%n");
    }
    public Pointer dyn_PGM_get_LaunchQue_Client()
    {
        return stat_PGM_get_LaunchQue_Client();
    }
    public Pointer dyn_PGM_get_WriteQue_Client_InputSend()
    {
        return stat_PGM_get_WriteQue_Client_InputSend();
    }
    public Pointer dyn_PGM_get_Client_OutputRecieve()
    {
        return stat_PGM_get_Client_OutputRecieve();
    }
    static private void stat_CLASS_boot0_DECLAIRE_Execute()
    {
        System.out.printf("entered stat_CLASS_boot0_DECLAIRE_Execute().%n");

        System.out.printf("exiting stat_CLASS_boot0_DECLAIRE_Execute().%n");
    }
    private static void stat_CLASS_boot1_DEFINE_Execute()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_Execute().%n");
        stat_PGM_boot1_DEFINE_LaunchQue_Client();
        stat_PGM_boot1_DEFINE_WriteQue_Cleient_InputSend();
        stat_PGM_boot1_DEFINE_WriteQue_Client_OutputRecieve();
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_Execute().%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_Execute()
    {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_Execute().%n");
        stat_PGM_boot3_INITIALISE_LaunchQue_Client();
        stat_PGM_boot3_INITIALISE_WriteQue_Client_InputSend();
        stat_PGM_boot3_INITIALISE_WriteQue_Client_OutputRecieve();
        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Execute().%n");
    }
    private static void stat_REG_boot0_DECLAIRE_Execute()
    {
            System.out.printf("entered stat_REG_boot0_DECLAIRE_Execute().%n");

            System.out.printf("exiting stat_REG_boot0_DECLAIRE_Execute().%n");
    }
// private.
    private static void stat_PGM_boot1_DEFINE_LaunchQue_Client()
    {
        System.out.printf("entered Execute stat_PGM_boot1_DEFINE_LaunchQue_Client().%n");
        _stat_PGM_LaunchQue_Client = null;
        System.out.printf("exiting Execute stat_PGM_boot1_DEFINE_LaunchQue_Client().%n");
    }
    private static void stat_PGM_boot1_DEFINE_WriteQue_Cleient_InputSend()
    {
        System.out.printf("entered Execute stat_PGM_boot1_DEFINE_WriteQue_Cleient_InputSend().%n");
        _stat_PGM_WriteQue_Client_InputSend = null;
        System.out.printf("exiting Execute stat_PGM_boot1_DEFINE_WriteQue_Cleient_InputSend().%n");
    }
    private static void stat_PGM_boot1_DEFINE_WriteQue_Client_OutputRecieve()
    {
        System.out.printf("entered Execute stat_PGM_boot1_DEFINE_WriteQue_Client_OutputRecieve().%n");
        _stat_PGM_WriteQue_Client_OutputRecieve = null;
        System.out.printf("exiting Execute stat_PGM_boot1_DEFINE_WriteQue_Client_OutputRecieve().%n");
    }
    private static void stat_PGM_boot3_INITIALISE_LaunchQue_Client()
    {
        System.out.printf("entered stat_PGM_boot3_INITIALISE_LaunchQue_Client().%n");
        try {
            _stat_PGM_LaunchQue_Client = JavaLIBLaunchQue_Client.INSTANCE.app_FUNCT_generate_Program();
        } 
        catch (NoClassDefFoundError e) {
                System.out.printf("NoClassDefFoundError.%n");
        }
        catch (NullPointerException e) {
                System.out.printf("NullPointerException.%n");
        }
        catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
        }
        System.out.printf("exiting stat_PGM_boot3_INITIALISE_LaunchQue_Client().%n");
    }
    private static void stat_PGM_boot3_INITIALISE_WriteQue_Client_InputSend()
    {
        System.out.printf("entered stat_PGM_boot3_INITIALISE_WriteQue_Client_InputSend().%n");
        try {
            _stat_PGM_WriteQue_Client_InputSend = JavaLIBWriteQue_ClientInputSend.INSTANCE.app_FUNCT_generate_Program();
        } 
        catch (NoClassDefFoundError e) {
                System.out.printf("NoClassDefFoundError.%n");
        }
        catch (NullPointerException e) {
                System.out.printf("NullPointerException.%n");
        }
        catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
        }
        System.out.printf("exiting stat_PGM_boot3_INITIALISE_WriteQue_Client_InputSend().%n");
    }
    private static void stat_PGM_boot3_INITIALISE_WriteQue_Client_OutputRecieve()
    {
        System.out.printf("entered stat_PGM_boot3_INITIALISE_WriteQue_Client_OutputRecieve().%n");
        try {
            _stat_PGM_WriteQue_Client_OutputRecieve = JavaLIBWriteQue_ClientOutputRecieve.INSTANCE.app_FUNCT_generate_Program();
        } 
        catch (NoClassDefFoundError e) {
                System.out.printf("NoClassDefFoundError.%n");
        }
        catch (NullPointerException e) {
                System.out.printf("NullPointerException.%n");
        }
        catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
        }
        System.out.printf("exiting stat_PGM_boot3_INITIALISE_WriteQue_Client_OutputRecieve().%n");
    }
    private static Pointer stat_PGM_get_LaunchQue_Client()
    {
        return _stat_PGM_LaunchQue_Client;
    }
    private static Pointer stat_PGM_get_WriteQue_Client_InputSend()
    {
        return _stat_PGM_WriteQue_Client_InputSend;
    }
    private static Pointer stat_PGM_get_Client_OutputRecieve()
    {
        return _stat_PGM_WriteQue_Client_OutputRecieve;
    }
}