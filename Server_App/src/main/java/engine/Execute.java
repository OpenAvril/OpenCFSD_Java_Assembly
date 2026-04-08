package engine;
import main.IO.ConcurrentIOServer;
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
    public void dyn_REG_boot4_INSTANTIATE_Execute(int praiseId_DEFAULT)
    {
        System.out.printf("entered dyn_REG_boot4_INSTANTIATE_Execute().%n");
        //ConcurrentIOServer.app_FUNCT_generate_Program();
        ConcurrentIOServer.app_FUNCT_flip_Input_DoubleBuffer(_stat_PGM_ConcurrentIOServer);
        ConcurrentIOServer.app_FUNCT_get_flag_isPGM_INSTNATIATED();
        ConcurrentIOServer.app_FUNCT_pop_From_Stack_Of_Output(_stat_PGM_ConcurrentIOServer);
        ConcurrentIOServer.app_FUNCT_push_To_STACK_Of_Input(_stat_PGM_ConcurrentIOServer);
        ConcurrentIOServer.app_FUNCT_select_set_Intput_Subset(_stat_PGM_ConcurrentIOServer, praiseId_DEFAULT);
        ConcurrentIOServer.app_FUNCT_terminate_Program();
        var temp0 = ConcurrentIOServer.dyn_PGM_get_program_WriteEnableStack_ServerInputAction(_stat_PGM_ConcurrentIOServer);
        var temp1 = ConcurrentIOServer.dyn_PGM_get_program_WriteEnableStack_ServerOutputRecieve(_stat_PGM_ConcurrentIOServer);
        var temp2 = ConcurrentIOServer.dyn_REG_get_flag_IsInitialised_OpenAvrilConcurrency(_stat_PGM_ConcurrentIOServer);
        var temp3 = ConcurrentIOServer.dyn_REG_get_flag_isStackLoaded_Server_InputAction(_stat_PGM_ConcurrentIOServer);
        var temp4 = ConcurrentIOServer.dyn_REG_get_flag_isStackLoaded_Server_OutputSend(_stat_PGM_ConcurrentIOServer);
        var temp5 = ConcurrentIOServer.dyn_REG_get_ptr_Output_praise0_Value(_stat_PGM_ConcurrentIOServer);
        var temp6 = ConcurrentIOServer.dyn_REG_get_ptr_PraiseEventId(_stat_PGM_ConcurrentIOServer);
        ConcurrentIOServer.dyn_REG_set_Item_Input_praise0_Value_A(_stat_PGM_ConcurrentIOServer, praiseId_DEFAULT);
        ConcurrentIOServer.dyn_REG_set_Item_Input_praise0_Value_B(_stat_PGM_ConcurrentIOServer, praiseId_DEFAULT);
        ConcurrentIOServer.dyn_REG_set_PraiseEventId(_stat_PGM_ConcurrentIOServer, praiseId_DEFAULT);
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
        _stat_PGM_ConcurrentIOServer = ConcurrentIOServer.app_FUNCT_generate_Program();
        System.out.printf("exiting stat_PGM_boot3_INITIALISE_ConcurrentIOServer().%n");
    }
    private static Pointer stat_PGM_get_ConcurrentIOServer()
    {
        return _stat_PGM_ConcurrentIOServer;
    }
}