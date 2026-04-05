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
    public void dyn_REG_boot4_INSTANTIATE_Execute()
    {
        System.out.printf("entered dyn_REG_boot4_INSTANTIATE_Execute().%n");
        Object[] vars;
        vars = null;
        vars = new Object[8];
        for(byte index = 0; index < 8; index++)
        {
            vars[index] = null;
        }
        var pgmQriteWue_ServerInputSend = ConcurrentIOServer.dyn_PGM_get_program_WriteEnableStack_ServerInputAction(_stat_PGM_ConcurrentIOServer);
        vars[0] = (Object)pgmQriteWue_ServerInputSend;
        
        var pgmQriteWue_ServerOutputRecieve = ConcurrentIOServer.dyn_PGM_get_program_WriteEnableStack_ServerOutputRecieve(_stat_PGM_ConcurrentIOServer);
        vars[1] = (Object)pgmQriteWue_ServerOutputRecieve;
        
        var isFLAG_StackLoaded_ServerInputSend = ConcurrentIOServer.dyn_REG_get_flag_isStackLoaded_Server_InputAction(_stat_PGM_ConcurrentIOServer);
        vars[2] = (Object)isFLAG_StackLoaded_ServerInputSend;
        
        var isFLAG_StackLoaded_ServerOutputRecieve = ConcurrentIOServer.dyn_REG_get_flag_isStackLoaded_Server_OutputSend(_stat_PGM_ConcurrentIOServer);
        vars[3] = (Object)isFLAG_StackLoaded_ServerOutputRecieve;
        
        var isFLAG_AssemblyInitialised = ConcurrentIOServer.dyn_REG_get_flag_IsInitialised_OpenAvrilConcurrency(_stat_PGM_ConcurrentIOServer);
        vars[4] = (Object)isFLAG_AssemblyInitialised;
        //ConcurrentIOServer.app_PRAISE_Do();
        //ConcurrentIOServer.app_PRAISE_Get();
        //ConcurrentIOServer.app_FUNCT_terminate_Program();
        
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
        System.out.printf("entered Execute stat_PGM_boot3_INITIALISE_ConcurrentIOServer().%n");
        _stat_PGM_ConcurrentIOServer = null;
        System.out.printf("exiting Execute stat_PGM_boot3_INITIALISE_ConcurrentIOServer().%n");
    }
    private static void stat_PGM_boot3_INITIALISE_ConcurrentIOServer()
    {
        System.out.printf("entered stat_PGM_boot3_INITIALISE_ConcurrentIOServer().%n");
        try {
            _stat_PGM_ConcurrentIOServer = ConcurrentIOServer.app_FUNCT_generate_Program();
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
        System.out.printf("exiting stat_PGM_boot3_INITIALISE_ConcurrentIOServer().%n");
    }
    private static Pointer stat_PGM_get_ConcurrentIOServer()
    {
        return _stat_PGM_ConcurrentIOServer;
    }
}