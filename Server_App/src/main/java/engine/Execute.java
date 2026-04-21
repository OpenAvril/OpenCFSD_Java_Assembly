package engine;
import com.sun.jna.Pointer;
import lib.JavaLIBWriteQueSERVERINPUTRECIEVE;
import main.IO.LaunchQue_Server;
import main.IO.WriteQue_SERVERINPUTRECIEVE;
import main.IO.WriteQue_SERVEROUTPUTSEND;
import main.IO.OpenEpiCentre;
import main.IO.WriteQue_Simulation_IO;

import java.util.Scanner;

public class Execute
{
    private static Execute_Control _stat_CLASS_Execute_Control;
    private static Thread[] _stat_REG_List_Of_Threads;
    private static Pointer _stat_PGM_ConcurrentIOServer;
    private static Pointer _stat_PGM_WriteQue_Simulation_IO;//SIMULATION

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
    public void dyn_APP_Launch_Threads(Framework obj)
    {
        stat_APP_Launch_Threads(obj);
    }
    public Execute_Control dyn_CLASS_get_Execute_Control()
    {
        return stat_CLASS_get_Execute_Control();
    }
    public void dyn_REG_boot1_DEFINE_Execute()
    {
        System.out.printf("entered dyn_REG_boot1_DEFINE_Execute().%n");
        stat_REG_boot1_DEFINE_List_Of_Threads();
        System.out.printf("exiting dyn_REG_boot1_DEFINE_Execute().%n");
    }
    public void dyn_REG_boot2_SUBSTANTIATE_Execute(Framework obj)
    {
        System.out.printf("entered dyn_REG_boot2_SUBSTANTIATE_Execute().%n");
        stat_REG_boot2_SUBSTANTIATE_List_Of_Threads(obj);
        System.out.printf("exiting dyn_REG_boot2_SUBSTANTIATE_Execute().%n");
    }
    public void dyn_REG_boot3_INITIALISE_Execute(Framework obj)
    {
        System.out.printf("entered dyn_REG_boot3_INITIALISE_Execute().%n");
        stat_REG_boot3_INITIALISE_List_Of_Threads(obj);
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

        System.out.printf("entered CHECK member function WriteQue_Simulation_IO().%n");
        //WriteQue_Simulation_IO.app_FUNCT_generate_Program();
        var tempE0 = WriteQue_Simulation_IO.app_FUNCT_get_flag_isPGM_INSTNATIATED();
        WriteQue_Simulation_IO.app_FUNCT_terminate_Program();
        WriteQue_Simulation_IO.app_FUNCT_write_End(intPrimeDEFAULT);
        WriteQue_Simulation_IO.app_FUNCT_write_Start(intPrimeDEFAULT);
        System.out.printf("done CHECK member function WriteQue_Simulation_IO().%n");

        System.out.printf("exiting dyn_REG_boot4_INSTANTIATE_Execute().%n");
    }
    public Pointer dyn_PGM_get_ConcurrentIOServer()
    {
        return stat_PGM_get_ConcurrentIOServer();
    }
    public Pointer dyn_PGM_get_WriteQue_Simulation_IO()
    {
        return stat_PGM_get_WriteQue_Simulation_IO();
    }
    static private void stat_CLASS_boot0_DECLAIRE_Execute()
    {
        System.out.printf("entered stat_CLASS_boot0_DECLAIRE_Execute().%n");

        System.out.printf("exiting stat_CLASS_boot0_DECLAIRE_Execute().%n");
    }
    private static void stat_CLASS_boot1_DEFINE_Execute()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_Execute().%n");
        stat_CLASS_boot1_DEFINE_Execute_Control();
        stat_PGM_boot1_DEFINE_ConcurrentIOServer();
        stat_PGM_boot1_DEFINE_WriteQue_Simulation_IO();
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_Execute().%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_Execute()
    {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_Execute().%n");
        stat_CLASS_boot3_INITIALISE_Execute_Control();
        stat_PGM_boot3_INITIALISE_ConcurrentIOServer();
        stat_PGM_boot3_INITIALISE_WriteQue_Simulation_IO();
        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Execute().%n");
    }
    private static void stat_REG_boot0_DECLAIRE_Execute()
    {
        System.out.printf("entered stat_REG_boot0_DECLAIRE_Execute().%n");

        System.out.printf("exiting stat_REG_boot0_DECLAIRE_Execute().%n");
    }
// private.
    private static void stat_APP_Launch_Threads(Framework obj)
    {
        System.out.printf("entered *** Launch Threads ***.%n");

        _stat_REG_List_Of_Threads[0].start();
        System.out.printf("exiting *** Launch Threads ***.%n");
    }
    private static void stat_CLASS_boot1_DEFINE_Execute_Control()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_Execute_Control().%n");
        _stat_CLASS_Execute_Control = null;
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_Execute_Control().%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_Execute_Control()
    {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_Execute_Control().%n");
        _stat_CLASS_Execute_Control = new Execute_Control();
        try {
            stat_CLASS_get_Execute_Control();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Execute_Control().%n");
    }
    private static Execute_Control stat_CLASS_get_Execute_Control()
    {
        return _stat_CLASS_Execute_Control;
    }
    private static void stat_REG_boot1_DEFINE_List_Of_Threads()
    {
        _stat_REG_List_Of_Threads = null;
    }
    private static void stat_REG_boot2_SUBSTANTIATE_List_Of_Threads(Framework obj)
    {
        _stat_REG_List_Of_Threads = new Thread[obj.dyn_CLASS_get_Global().dyn_REG_get_numberOfCores()];
        try {
            stat_REG_get_ptr_List_Of_Threads();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
        for (int threadId = 0; threadId < _stat_REG_List_Of_Threads.length; threadId++)
        {
            _stat_REG_List_Of_Threads[threadId] = null;
        }
    }
    private static void stat_REG_boot3_INITIALISE_List_Of_Threads(Framework obj)
    {
        System.out.printf("entered Execute stat_REG_boot3_INITIALISE_List_Of_Threads().%n");
        _stat_REG_List_Of_Threads[0] = new Thread(() -> obj.dyn_STRUCT_get_IO_ListenRespond().app_Thread_IO_Listen_Respond(obj, 0));
        System.out.printf("exiting Execute stat_REG_boot3_INITIALISE_List_Of_Threads().%n");
    }
    private static Thread[] stat_REG_get_ptr_List_Of_Threads()
    {
        return _stat_REG_List_Of_Threads;
    }
    private static void stat_PGM_boot1_DEFINE_ConcurrentIOServer()
    {
        System.out.printf("entered Execute stat_PGM_boot1_DEFINE_ConcurrentIOServer().%n");
        _stat_PGM_ConcurrentIOServer = null;
        System.out.printf("exiting Execute stat_PGM_boot1_DEFINE_ConcurrentIOServer().%n");
    }
    private static void stat_PGM_boot1_DEFINE_WriteQue_Simulation_IO()
    {
        System.out.printf("entered Execute stat_PGM_boot1_DEFINE_WriteQue_Client_InputSend().%n");
        _stat_PGM_WriteQue_Simulation_IO = null;
        System.out.printf("exiting Execute stat_PGM_boot1_DEFINE_WriteQue_Client_InputSend().%n");
    }
    private static void stat_PGM_boot3_INITIALISE_ConcurrentIOServer()
    {
        System.out.printf("entered stat_PGM_boot3_INITIALISE_ConcurrentIOServer().%n");
        _stat_PGM_ConcurrentIOServer = OpenEpiCentre.app_FUNCT_generate_Program();
        System.out.printf("exiting stat_PGM_boot3_INITIALISE_ConcurrentIOServer().%n");
    }
    private static void stat_PGM_boot3_INITIALISE_WriteQue_Simulation_IO()
    {
        System.out.printf("entered stat_PGM_boot3_INITIALISE_WriteQue_Client_InputSend().%n");
        _stat_PGM_WriteQue_Simulation_IO = WriteQue_Simulation_IO.app_FUNCT_generate_Program();
        System.out.printf("exiting stat_PGM_boot3_INITIALISE_WriteQue_Client_InputSend().%n");
    }
    private static Pointer stat_PGM_get_ConcurrentIOServer()
    {
        return _stat_PGM_ConcurrentIOServer;
    }
    private static Pointer stat_PGM_get_WriteQue_Simulation_IO()
    {
        return _stat_PGM_WriteQue_Simulation_IO;
    }
}