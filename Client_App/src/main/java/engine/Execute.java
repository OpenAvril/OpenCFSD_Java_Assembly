package engine;
import main.IO.LaunchQue_Client;
import main.IO.WriteQue_Client_InputSend;
import main.IO.WriteQue_Client_OutputRecieve;
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
    public void dyn_REG_boot4_INSTANTIATE_Execute(int threadId_DEFAULT)
    {
        System.out.printf("entered dyn_REG_boot4_INSTANTIATE_Execute().%n");
          
        //LaunchQue_Client.app_FUNCT_generate_Program();
        LaunchQue_Client.app_FUNCT_request_Wait_launch(_stat_PGM_LaunchQue_Client, threadId_DEFAULT);
        LaunchQue_Client.app_FUNCT_terminate_Progaram();
        LaunchQue_Client.app_FUNCT_thread_End(_stat_PGM_LaunchQue_Client, threadId_DEFAULT);
        var temp0 = LaunchQue_Client.app_REG_get_Flag_Active(_stat_PGM_LaunchQue_Client);
        var temp1 = LaunchQue_Client.app_REG_get_Flag_ConcurrentCoreState(_stat_PGM_LaunchQue_Client, threadId_DEFAULT);
        var temp2 = LaunchQue_Client.app_REG_get_Flag_Idle(_stat_PGM_LaunchQue_Client);
        var temp3 = LaunchQue_Client.app_REG_get_State_launchBit(_stat_PGM_LaunchQue_Client);
        var temp4 = LaunchQue_Client.app_REG_get_coreId_To_launch(_stat_PGM_LaunchQue_Client);
        LaunchQue_Client.app_REG_set_Flag_ConcurrentCoreState(_stat_PGM_LaunchQue_Client, threadId_DEFAULT, true);
        
        //WriteQue_Client_InputSend.app_FUNCT_generate_Program();
        WriteQue_Client_InputSend.app_FUNCT_terminate_Program();
        WriteQue_Client_InputSend.app_FUNCT_write_End(_stat_PGM_LaunchQue_Client, threadId_DEFAULT);
        WriteQue_Client_InputSend.app_FUNCT_write_Start(_stat_PGM_LaunchQue_Client, threadId_DEFAULT);
        
        //WriteQue_Client_OutputRecieve.app_FUNCT_generate_Program();
        WriteQue_Client_OutputRecieve.app_FUNCT_terminate_Program();
        WriteQue_Client_OutputRecieve.app_FUNCT_write_End(_stat_PGM_LaunchQue_Client, threadId_DEFAULT);
        WriteQue_Client_OutputRecieve.app_FUNCT_write_Start(_stat_PGM_LaunchQue_Client, threadId_DEFAULT);
        
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
    public Pointer dyn_PGM_get_WriteQue_Client_OutputRecieve()
    {
        return stat_PGM_get_WriteQue_Client_OutputRecieve();
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
        stat_PGM_boot1_DEFINE_WriteQue_Client_InputSend();
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
    private static void stat_PGM_boot1_DEFINE_WriteQue_Client_InputSend()
    {
        System.out.printf("entered Execute stat_PGM_boot1_DEFINE_WriteQue_Client_InputSend().%n");
        _stat_PGM_WriteQue_Client_InputSend = null;
        System.out.printf("exiting Execute stat_PGM_boot1_DEFINE_WriteQue_Client_InputSend().%n");
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
        _stat_PGM_LaunchQue_Client = LaunchQue_Client.app_FUNCT_generate_Program();
        System.out.printf("exiting stat_PGM_boot3_INITIALISE_LaunchQue_Client().%n");
    }
    private static void stat_PGM_boot3_INITIALISE_WriteQue_Client_InputSend()
    {
        System.out.printf("entered stat_PGM_boot3_INITIALISE_WriteQue_Client_InputSend().%n");
        _stat_PGM_WriteQue_Client_InputSend = WriteQue_Client_InputSend.app_FUNCT_generate_Program();
        System.out.printf("exiting stat_PGM_boot3_INITIALISE_WriteQue_Client_InputSend().%n");
    }
    private static void stat_PGM_boot3_INITIALISE_WriteQue_Client_OutputRecieve()
    {
        System.out.printf("entered stat_PGM_boot3_INITIALISE_WriteQue_Client_OutputRecieve().%n");
        _stat_PGM_WriteQue_Client_OutputRecieve = WriteQue_Client_OutputRecieve.app_FUNCT_generate_Program();
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
    private static Pointer stat_PGM_get_WriteQue_Client_OutputRecieve()
    {
        return _stat_PGM_WriteQue_Client_OutputRecieve;
    }
}