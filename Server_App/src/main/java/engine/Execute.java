package engine;
import com.sun.jna.Pointer;
import lib.JavaLIBWriteQueSERVERINPUTRECIEVE;
import main.IO.LaunchQue_Server;
import main.IO.WriteQue_SERVERINPUTRECIEVE;
import main.IO.WriteQue_SERVEROUTPUTSEND;
import main.IO.OpenEpiCentre;
public class Execute
{
    private static Pointer _stat_PGM_ConcurrentIOServer;
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
    public void dyn_REG_boot4_INSTANTIATE_Execute()
    {
        System.out.printf("entered dyn_REG_boot4_INSTANTIATE_Execute().%n");
        int intPrimeDEFAULT = Integer.MAX_VALUE;
        boolean booleanPrimeDEFAULT = true;

        System.out.printf("entered CHECK member function WriteQue_SERVERINPUTRECIEVE().%n");
        //WriteQue_SERVERINPUTRECIEVE.app_FUNCT_generate_Program();
        var tempA0 = WriteQue_SERVERINPUTRECIEVE.app_FUNCT_get_flag_isPGM_INSTNATIATED();
        WriteQue_SERVERINPUTRECIEVE.app_FUNCT_terminate_Program();
        WriteQue_SERVERINPUTRECIEVE.app_FUNCT_write_End(intPrimeDEFAULT);
        WriteQue_SERVERINPUTRECIEVE.app_FUNCT_write_Start(intPrimeDEFAULT);
        System.out.printf("done CHECK member function WriteQue_SERVERINPUTRECIEVE().%n");

        System.out.printf("entered CHECK member function LaunchQue_Server().%n");
        //LaunchQue_Server.app_FUNCT_generate_Program();
        LaunchQue_Server.app_FUNCT_request_Wait_launch(intPrimeDEFAULT);
        LaunchQue_Server.app_FUNCT_terminate_Progaram();
        LaunchQue_Server.app_FUNCT_thread_End(intPrimeDEFAULT);
        var tempB0 = LaunchQue_Server.app_REG_get_coreId_To_launch();
        var tempB1 = LaunchQue_Server.app_REG_get_Flag_Active();
        var tempB2 = LaunchQue_Server.app_REG_get_Flag_ConcurrentCoreState(intPrimeDEFAULT);
        var tempB3 = LaunchQue_Server.app_REG_get_Flag_Idle();
        var tempB4 = LaunchQue_Server.app_REG_get_State_launchBit();
        LaunchQue_Server.app_REG_set_Flag_ConcurrentCoreState(intPrimeDEFAULT, booleanPrimeDEFAULT);
        System.out.printf("done CHECK member function LaunchQue_Server().%n");

        System.out.printf("entered CHECK member function WriteQue_SERVEROUTPUTSEND().%n");
        //WriteQue_SERVERINPUTRECIEVE.app_FUNCT_generate_Program();
        var tempC0 = WriteQue_SERVEROUTPUTSEND.app_FUNCT_get_flag_isPGM_INSTNATIATED();
        WriteQue_SERVEROUTPUTSEND.app_FUNCT_terminate_Program();
        WriteQue_SERVEROUTPUTSEND.app_FUNCT_write_End(intPrimeDEFAULT);
        WriteQue_SERVEROUTPUTSEND.app_FUNCT_write_Start(intPrimeDEFAULT);
        System.out.printf("done CHECK member function WriteQue_SERVEROUTPUTSEND().%n");

        System.out.printf("entered CHECK member function OpenEpiCentre().%n");
        OpenEpiCentre.app_FUNCT_flip_Input_DoubleBuffer();
        OpenEpiCentre.app_FUNCT_generate_Program();
        OpenEpiCentre.app_FUNCT_select_set_Intput_Subset(intPrimeDEFAULT);
        OpenEpiCentre.app_FUNCT_terminate_Program();
        OpenEpiCentre.app_FUNCT_pop_From_Stack_Of_Output();
        OpenEpiCentre.app_FUNCT_push_To_STACK_Of_Input();
        var tempD0 = OpenEpiCentre.dyn_PGM_get_program_WriteEnableStack_ServerInputAction();
        var tempD1 = OpenEpiCentre.dyn_PGM_get_program_WriteEnableStack_ServerOutputRecieve();
        var tempD2 = OpenEpiCentre.dyn_REG_get_flag_isStackLoaded_Server_InputAction();
        var tempD3 = OpenEpiCentre.dyn_REG_get_flag_isStackLoaded_Server_OutputSend();
        var tempD4 = OpenEpiCentre.dyn_REG_get_flag_IsInitialised_OpenAvrilConcurrency();
        var tempD5 = OpenEpiCentre.io_PRAISE_get_Item_Output_praise0_Value();
        var tempD6 = OpenEpiCentre.io_RPRAISE_get_ptr_PraiseEventId();
        OpenEpiCentre.io_PRAISE_set_Item_Input_praise0_Value_A(intPrimeDEFAULT);
        OpenEpiCentre.io_PRAISE_set_Item_Input_praise0_Value_B(intPrimeDEFAULT);
        OpenEpiCentre.io_PRAISE_set_PraiseEventId(intPrimeDEFAULT);
        System.out.printf("done CHECK member function OpenEpiCentre().%n");

        System.out.printf("exiting dyn_REG_boot4_INSTANTIATE_Execute().%n");
    }
    public Pointer dyn_PGM_get_ConcurrentIOServer()
    {
        return stat_PGM_get_ConcurrentIOServer();
    }
    static private void stat_CLASS_boot0_DECLAIRE_Execute()
    {
        System.out.printf("entered stat_CLASS_boot0_DECLAIRE_Execute().%n");

        System.out.printf("exiting stat_CLASS_boot0_DECLAIRE_Execute().%n");
    }
    private static void stat_CLASS_boot1_DEFINE_Execute()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_Execute().%n");
        stat_PGM_boot1_DEFINE_ConcurrentIOServer();
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_Execute().%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_Execute()
    {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_Execute().%n");
        stat_PGM_boot3_INITIALISE_ConcurrentIOServer();
        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Execute().%n");
    }
    private static void stat_REG_boot0_DECLAIRE_Execute()
    {
        System.out.printf("entered stat_REG_boot0_DECLAIRE_Execute().%n");

        System.out.printf("exiting stat_REG_boot0_DECLAIRE_Execute().%n");
    }
// private.
    private static void stat_PGM_boot1_DEFINE_ConcurrentIOServer()
    {
        System.out.printf("entered Execute stat_PGM_boot1_DEFINE_ConcurrentIOServer().%n");
        _stat_PGM_ConcurrentIOServer = null;
        System.out.printf("exiting Execute stat_PGM_boot1_DEFINE_ConcurrentIOServer().%n");
    }
    private static void stat_PGM_boot3_INITIALISE_ConcurrentIOServer()
    {
        System.out.printf("entered stat_PGM_boot3_INITIALISE_ConcurrentIOServer().%n");
        _stat_PGM_ConcurrentIOServer = OpenEpiCentre.app_FUNCT_generate_Program();
        System.out.printf("exiting stat_PGM_boot3_INITIALISE_ConcurrentIOServer().%n");
    }
    private static Pointer stat_PGM_get_ConcurrentIOServer()
    {
        return _stat_PGM_ConcurrentIOServer;
    }
}