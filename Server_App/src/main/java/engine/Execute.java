package engine;
import main.IO.LaunchQue_Server;
import main.IO.OpenEpiCentre;
import com.sun.jna.Pointer;
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
        byte[] praiseId_DEFAULT = Global.stat_CONVERT_int_To_ByteArray((int)(Integer.MAX_VALUE));
        //LaunchQue_Server.app_FUNCT_generate_Program();
        LaunchQue_Server.app_FUNCT_request_Wait_launch(praiseId_DEFAULT);
        LaunchQue_Server.app_FUNCT_terminate_Progaram();
        LaunchQue_Server.app_FUNCT_thread_End(praiseId_DEFAULT);
        LaunchQue_Server.app_REG_get_coreId_To_launch();
        LaunchQue_Server.app_REG_get_Flag_Active();
        LaunchQue_Server.app_REG_get_Flag_ConcurrentCoreState(praiseId_DEFAULT);
        LaunchQue_Server.app_REG_get_Flag_Idle();
        LaunchQue_Server.app_REG_get_State_launchBit();
        LaunchQue_Server.app_REG_set_Flag_ConcurrentCoreState(praiseId_DEFAULT, praiseId_DEFAULT);

        int threadId_DEFAULT = (int)(0);
        OpenEpiCentre.app_FUNCT_flip_Input_DoubleBuffer();
        //ConcurrentIOServer.app_FUNCT_generate_Program();
        OpenEpiCentre.app_FUNCT_get_flag_isPGM_INSTNATIATED();
        OpenEpiCentre.app_FUNCT_pop_From_Stack_Of_Output();
        OpenEpiCentre.app_FUNCT_push_To_STACK_Of_Input();
        OpenEpiCentre.app_FUNCT_select_set_Intput_Subset(threadId_DEFAULT);
        OpenEpiCentre.app_FUNCT_terminate_Program();
        OpenEpiCentre.dyn_PGM_get_program_WriteEnableStack_ServerInputAction();
        OpenEpiCentre.dyn_PGM_get_program_WriteEnableStack_ServerOutputRecieve();
        OpenEpiCentre.dyn_REG_get_flag_IsInitialised_OpenAvrilConcurrency();
        OpenEpiCentre.dyn_REG_get_flag_isStackLoaded_Server_InputAction();
        OpenEpiCentre.dyn_REG_get_flag_isStackLoaded_Server_OutputSend();
        OpenEpiCentre.io_PRAISE_get_Item_Output_praise0_Value();
        OpenEpiCentre.io_PRAISE_set_Item_Input_praise0_Value_A(threadId_DEFAULT);
        OpenEpiCentre.io_PRAISE_set_Item_Input_praise0_Value_B(threadId_DEFAULT);
        OpenEpiCentre.io_PRAISE_set_PraiseEventId(threadId_DEFAULT);
        OpenEpiCentre.io_RPRAISE_get_ptr_PraiseEventId();
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