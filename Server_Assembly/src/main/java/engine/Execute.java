package engine;
import SIMULATION.Simulation;
import threads.IO_ListenRespond;
import com.sun.jna.Pointer;
import main.IO.*;

public class Execute {
    private static Execute_Control _stat_CLASS_Execute_Control;
    private static Thread[] _stat_REG_List_Of_Threads;
    private static Pointer _stat_PGM_WriteQue_ClientUserInput;//todo SIMULATION
    private static Pointer _stat_PGM_WriteQue_ClientUserOutput;//todo SIMULATION
    private static Pointer _stat_PGM_OpenEPiCentre;
    private static Pointer _stat_PGM_WriteQue_ServerConditionCode;
    private static Pointer _stat_PGM_WriteQue_ServerInputReceive;
    private static Pointer _stat_PGM_WriteQue_ServerOutputSend;
    private static Pointer _stat_PGM_WriteQue_SimulationIO;//todo SIMULATION

    // public.
    public Execute(Framework obj) {
        System.out.printf("entered CLASS Execute()%n");
        stat_CLASS_boot0_DECLAIRE_Execute();
        stat_CLASS_boot1_DEFINE_Execute();
        stat_CLASS_boot3_INITIALISE_Execute(obj);
        stat_REG_boot0_DECLAIRE_Execute();
        System.out.printf("exiting CLASS Execute()%n");
    }

    public void dyn_APP_Launch_Threads(Framework obj) {
        stat_APP_Launch_Threads(obj);
    }

    public Execute_Control dyn_CLASS_get_Execute_Control() {
        return stat_CLASS_get_Execute_Control();
    }

    public void dyn_REG_boot1_DEFINE_Execute() {
        System.out.printf("entered dyn_REG_boot1_DEFINE_Execute().%n");
        stat_REG_boot1_DEFINE_List_Of_Threads();
        System.out.printf("exiting dyn_REG_boot1_DEFINE_Execute().%n");
    }

    public void dyn_REG_boot2_SUBSTANTIATE_Execute(Framework obj) {
        System.out.printf("entered dyn_REG_boot2_SUBSTANTIATE_Execute().%n");
        stat_REG_boot2_SUBSTANTIATE_List_Of_Threads(obj);
        System.out.printf("exiting dyn_REG_boot2_SUBSTANTIATE_Execute().%n");
    }

    public void dyn_REG_boot3_INITIALISE_Execute(Framework obj) {
        System.out.printf("entered dyn_REG_boot3_INITIALISE_Execute().%n");
        stat_REG_boot3_INITIALISE_List_Of_Threads(obj);
        System.out.printf("exiting dyn_REG_boot3_INITIALISE_Execute().%n");
    }

    public void dyn_REG_boot4_INSTANTIATE_Execute() {
        System.out.printf("entered dyn_REG_boot4_INSTANTIATE_Execute().%n");
        int intPrimeDEFAULT = Integer.MAX_VALUE;
        double doublePRimeDEFAULT = Double.MAX_VALUE;

        System.out.printf("entered CHECK member function WriteQue_ClientUserInput().%n");
        //WriteQue_Simulation_InputSamples.app_FUNCT_generate_Program();
        Boolean tempA0 = WriteQue_ClientUserInput.app_FUNCT_get_flag_isPGM_INSTNATIATED();
        WriteQue_ClientUserInput.app_FUNCT_terminate_Program();
        WriteQue_ClientUserInput.app_FUNCT_write_End(intPrimeDEFAULT);
        WriteQue_ClientUserInput.app_FUNCT_write_Start(intPrimeDEFAULT);
        System.out.printf("done CHECK member function WriteQue_ClientUserInput().%n");

        System.out.printf("entered CHECK member functions in WriteQue_ClientUserOutput.%n");
        //WriteQue_ClientUserOutput.app_FUNCT_generate_Program();
        Boolean tempB0 = WriteQue_ClientUserOutput.app_FUNCT_get_flag_isPGM_INSTNATIATED();
        WriteQue_ClientUserOutput.app_FUNCT_terminate_Program();
        WriteQue_ClientUserOutput.app_FUNCT_write_End(intPrimeDEFAULT);
        WriteQue_ClientUserOutput.app_FUNCT_write_Start(intPrimeDEFAULT);
        System.out.printf("done CHECK member functions in WriteQue_ClientUserOutput.%n");

        System.out.printf("entered CHECK member functions in WriteQue_ServerConditionCode.%n");
        //WriteQue_ServerConditionCode.app_FUNCT_generate_Program();
        Boolean tempC0 = WriteQue_ServerConditionCode.app_FUNCT_get_flag_isPGM_INSTNATIATED();
        WriteQue_ServerConditionCode.app_FUNCT_terminate_Program();
        WriteQue_ServerConditionCode.app_FUNCT_write_End(intPrimeDEFAULT);
        WriteQue_ServerConditionCode.app_FUNCT_write_Start(intPrimeDEFAULT);
        System.out.printf("done CHECK member functions in WriteQue_ServerConditionCode.%n");

        System.out.printf("entered CHECK member functions in WriteQue_ServerInputReceive.%n");
        //WriteQue_ServerInputReceive.app_FUNCT_generate_Program();
        Boolean tempD0 = WriteQue_ServerInputReceive.app_FUNCT_get_flag_isPGM_INSTNATIATED();
        WriteQue_ServerInputReceive.app_FUNCT_terminate_Program();
        WriteQue_ServerInputReceive.app_FUNCT_write_End(intPrimeDEFAULT);
        WriteQue_ServerInputReceive.app_FUNCT_write_Start(intPrimeDEFAULT);
        System.out.printf("done CHECK member functions in WriteQue_ServerInputReceive.%n");

        System.out.printf("entered CHECK member functions in WriteQue_ServerOutputSend.%n");
        //WriteQue_ServerOutputSend.app_FUNCT_generate_Program();
        Boolean tempE0 = WriteQue_ServerOutputSend.app_FUNCT_get_flag_isPGM_INSTNATIATED();
        WriteQue_ServerOutputSend.app_FUNCT_terminate_Program();
        WriteQue_ServerOutputSend.app_FUNCT_write_End(intPrimeDEFAULT);
        WriteQue_ServerOutputSend.app_FUNCT_write_Start(intPrimeDEFAULT);
        System.out.printf("done CHECK member functions in WriteQue_ServerOutputSend.%n");

        System.out.printf("entered CHECK member functions in WriteQue_SimulationIO.%n");
        //WriteQue_SimulationIO.app_FUNCT_generate_Program();
        Boolean tempF0 = WriteQue_SimulationIO.app_FUNCT_get_flag_isPGM_INSTNATIATED();
        WriteQue_SimulationIO.app_FUNCT_terminate_Program();
        WriteQue_SimulationIO.app_FUNCT_write_End(intPrimeDEFAULT);
        WriteQue_SimulationIO.app_FUNCT_write_Start(intPrimeDEFAULT);
        System.out.printf("done CHECK member functions in WriteQue_SimulationIO.%n");

        System.out.printf("entered CHECK member functions in OpenEPiCentre.%n");
        OpenEpiCentre.CLIBConcurrentServerIO__app_FUNCT_flip_Input_DoubleBuffer();
        //Pointer tempE0 = OpenEpiCentre.CLIBConcurrentServerIO__app_FUNCT_generate_Program();
        boolean tempE1 = OpenEpiCentre.CLIBConcurrentServerIO__app_FUNCT_get_flag_isPGM_INSTANTIATED();
        OpenEpiCentre.CLIBConcurrentServerIO__app_FUNCT_select_set_Intput_Subset(intPrimeDEFAULT);
        OpenEpiCentre.CLIBConcurrentServerIO__app_FUNCT_terminate_Program();
        OpenEpiCentre.CLIBConcurrentServerIO__app_FUNCT_pop_From_Stack_Of_Output();
        OpenEpiCentre.CLIBConcurrentServerIO__app_FUNCT_push_To_STACK_Of_Input();
        OpenEpiCentre.CLIBConcurrentServerIO__dyn_PGM_WriteEnableStack_ClientUserInput_Injection__write_End();
        OpenEpiCentre.CLIBConcurrentServerIO__dyn_PGM_WriteEnableStack_ClientUserInput_Injection__write_Start();
        OpenEpiCentre.CLIBConcurrentServerIO__dyn_PGM_WriteEnableStack_ServerOutputSend_Extraction__write_End();
        OpenEpiCentre.CLIBConcurrentServerIO__dyn_PGM_WriteEnableStack_ServerOutputSend_Extraction__write_Start();
        boolean tempE4 = OpenEpiCentre.CLIBConcurrentServerIO__dyn_REG_get_flag_isStackLoaded_ClientUserInput();
        boolean tempE5 = OpenEpiCentre.CLIBConcurrentServerIO__dyn_REG_get_flag_isStackLoaded_ServerOutputSend();
        boolean tempE6 = OpenEpiCentre.CLIBConcurrentServerIO__dyn_REG_get_flag_IsInitialised_CLIBOpenEpiCentre();
        double tempE7 = OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_get_Item_CLIB_OpenEpiCentre_STRUCT__Output_praise0_Value();
        double tempE8 = OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_get_Item_CLIB_OpenEpiCentre_STRUCT__Output_praise1_Value();
        double tempE9 = OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_get_Item_CLIB_OpenEpiCentre_STRUCT__Output_praise2_Value();
        double tempE10 = OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_get_Item_CLIB_OpenEpiCentre_STRUCT__Output_praise3_Value();
        long tempE11 = OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_get_MetaData_PraiseEventId();
        OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise0_Value_A(doublePRimeDEFAULT);
        OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise0_Value_B(doublePRimeDEFAULT);
        OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise1_Value_A(doublePRimeDEFAULT);
        OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise1_Value_B(doublePRimeDEFAULT);
        OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise2_Value_A(doublePRimeDEFAULT);
        OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise2_Value_B(doublePRimeDEFAULT);
        OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise3_Value_A(doublePRimeDEFAULT);
        OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise3_Value_B(doublePRimeDEFAULT);
        OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_MetaData_PraiseEventId(intPrimeDEFAULT);
        System.out.printf("entered CHECK member functions in OpenEPiCentre.%n");

        System.out.printf("exiting dyn_REG_boot4_INSTANTIATE_Execute().%n");
    }

    static private void stat_CLASS_boot0_DECLAIRE_Execute() {
        System.out.printf("entered stat_CLASS_boot0_DECLAIRE_Execute().%n");

        System.out.printf("exiting stat_CLASS_boot0_DECLAIRE_Execute().%n");
    }

    private static void stat_CLASS_boot1_DEFINE_Execute() {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_Execute().%n");
        stat_CLASS_boot1_DEFINE_Execute_Control();
        stat_CLASS_boot1_DEFINE_Execute_Control();
        stat_PGM_boot1_DEFINE_WriteQue_ClientUserInput();
        stat_PGM_boot1_DEFINE_WriteQue_ClientUserOutput();
        stat_PGM_boot1_DEFINE_OpenEPiCentre();
        stat_PGM_boot1_DEFINE_WriteQue_ServerConditionCode();
        stat_PGM_boot1_DEFINE_WriteQue_ServerInputReceive();//TODO SIMULATION
        stat_PGM_boot1_DEFINE_WriteQue_ServerOutputSend();//TODO SIMULATION
        stat_PGM_boot1_DEFINE_WriteQue_SimulationIO();//TODO SIMULATION
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_Execute().%n");
    }

    private static void stat_CLASS_boot3_INITIALISE_Execute(Framework obj) {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_Execute().%n");
        stat_CLASS_boot3_INITIALISE_Execute_Control();
        stat_PGM_boot3_INITIALISE_WriteQue_ClientUserInput();
        stat_PGM_boot3_INITIALISE_WriteQue_ClientUserOutput();
        stat_PGM_boot3_INITIALISE_OpenEPiCentre();
        stat_PGM_boot3_INITIALISE_WriteQue_ServerConditionCode();
        stat_PGM_boot3_INITIALISE_WriteQue_ServerInputReceive();//TODO SIMULATION
        stat_PGM_boot3_INITIALISE_WriteQue_ServerOutputSend();//TODO SIMULATION
        stat_PGM_boot3_INITIALISE_WriteQue_SimulationIO();//TODO SIMULATION
        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Execute().%n");
    }

    private static void stat_REG_boot0_DECLAIRE_Execute() {
        System.out.printf("entered stat_REG_boot0_DECLAIRE_Execute().%n");

        System.out.printf("exiting stat_REG_boot0_DECLAIRE_Execute().%n");
    }

    // private.
    private static void stat_APP_Launch_Threads(Framework obj) {
        System.out.printf("entered *** Launch Threads ***.%n");
        for (int threadId = 0; threadId < _stat_REG_List_Of_Threads.length; threadId++) {
            _stat_REG_List_Of_Threads[threadId].start();
        }
        System.out.printf("exiting *** Launch Threads ***.%n");
    }

    private static void stat_CLASS_boot1_DEFINE_Execute_Control() {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_Execute_Control().%n");
        _stat_CLASS_Execute_Control = null;
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_Execute_Control().%n");
    }

    private static void stat_CLASS_boot3_INITIALISE_Execute_Control() {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_Execute_Control().%n");
        _stat_CLASS_Execute_Control = new Execute_Control();
        try {
            stat_CLASS_get_Execute_Control();
        } catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
            throw new RuntimeException("NullPointerException.%n", e);
        }
        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Execute_Control().%n");
    }

    private static Execute_Control stat_CLASS_get_Execute_Control() {
        return _stat_CLASS_Execute_Control;
    }

    private static void stat_REG_boot1_DEFINE_List_Of_Threads() {
        _stat_REG_List_Of_Threads = null;
    }
    private static void stat_REG_boot2_SUBSTANTIATE_List_Of_Threads(Framework obj) {
        try {
            _stat_REG_List_Of_Threads = new Thread[Math.toIntExact(Global.dyn_REG_get_numberOfCores())];
        } catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
            throw new RuntimeException("NullPointerException.%n", e);
        }
        for (int threadId = 0; threadId < _stat_REG_List_Of_Threads.length; threadId++) {
            _stat_REG_List_Of_Threads[threadId] = null;
        }
    }
    private static void stat_REG_boot3_INITIALISE_List_Of_Threads(Framework obj) {
        System.out.printf("entered Execute stat_REG_boot3_INITIALISE_List_Of_Threads().%n");
        _stat_REG_List_Of_Threads[0] = new Thread(() -> {
            obj.dyn_STRUCT_get_IO_ListenRespond().dyn_App_Thread_IO(obj, (byte) 0);
        });
        _stat_REG_List_Of_Threads[1] = new Thread(() -> {
            obj.dyn_CLASS_get_SIMULATION().Thread_Input_Peripheral_Scanner(obj, (byte) 1);
        });
        _stat_REG_List_Of_Threads[2] = new Thread(() -> {
            obj.dyn_CLASS_get_SIMULATION().Thread_Output_Draw(obj, (byte) 2);
        });
        System.out.printf("exiting Execute stat_REG_boot3_INITIALISE_List_Of_Threads().%n");
    }
    
    private static void stat_PGM_boot1_DEFINE_WriteQue_ClientUserInput() {
        System.out.printf("entered Execute stat_PGM_boot1_DEFINE_WriteQue_ClientUserInput().%n");
        _stat_PGM_WriteQue_ClientUserInput = null;
        System.out.printf("exiting Execute stat_PGM_boot1_DEFINE_WriteQue_ClientUserInput().%n");
    }
    private static void stat_PGM_boot1_DEFINE_WriteQue_ClientUserOutput() {
        System.out.printf("entered Execute stat_PGM_boot1_DEFINE_WriteQue_ClientUserOutput().%n");
        _stat_PGM_WriteQue_ClientUserOutput = null;
        System.out.printf("exiting Execute stat_PGM_boot1_DEFINE_WriteQue_ClientUserOutput().%n");
    }
    private static void stat_PGM_boot1_DEFINE_OpenEPiCentre() {
        System.out.printf("entered Execute stat_PGM_boot1_DEFINE_OpenEPiCentre().%n");
        _stat_PGM_OpenEPiCentre = null;
        System.out.printf("exiting Execute stat_PGM_boot1_DEFINE_OpenEPiCentre().%n");
    }
    private static void stat_PGM_boot1_DEFINE_WriteQue_ServerConditionCode() {
        System.out.printf("entered Execute stat_PGM_boot1_DEFINE_WriteQue_ServerConditionCode().%n");
        _stat_PGM_WriteQue_ServerConditionCode = null;
        System.out.printf("exiting Execute stat_PGM_boot1_DEFINE_WriteQue_ServerConditionCode().%n");
    }
    private static void stat_PGM_boot1_DEFINE_WriteQue_ServerInputReceive() {
        System.out.printf("entered Execute stat_PGM_boot1_DEFINE_WriteQue_ServerInputReceive().%n");
        _stat_PGM_WriteQue_ServerInputReceive = null;
        System.out.printf("exiting Execute stat_PGM_boot1_DEFINE_WriteQue_ServerInputReceive().%n");
    }
    private static void stat_PGM_boot1_DEFINE_WriteQue_ServerOutputSend() {
        System.out.printf("entered Execute stat_PGM_boot1_DEFINE_WriteQue_ServerOutputSend().%n");
        _stat_PGM_WriteQue_ServerOutputSend = null;
        System.out.printf("exiting Execute stat_PGM_boot1_DEFINE_WriteQue_ServerOutputSend().%n");
    }
    private static void stat_PGM_boot1_DEFINE_WriteQue_SimulationIO() {
        System.out.printf("entered Execute stat_PGM_boot1_DEFINE_WriteQue_SimulationIO().%n");
        _stat_PGM_WriteQue_SimulationIO = null;
        System.out.printf("exiting Execute stat_PGM_boot1_DEFINE_WriteQue_SimulationIO().%n");
    }
    private static void stat_PGM_boot3_INITIALISE_WriteQue_ClientUserInput() {        
        System.out.printf("entered stat_PGM_boot3_INITIALISE_WriteQue_ClientUserInput().%n");
        try {
            _stat_PGM_WriteQue_ClientUserInput = WriteQue_ClientUserInput.app_FUNCT_generate_Program();
        } catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
            throw new RuntimeException("NullPointerException.%n", e);
        }
        System.out.printf("exiting stat_PGM_boot3_INITIALISE_WriteQue_ClientUserInput().%n");
    }
    private static void stat_PGM_boot3_INITIALISE_WriteQue_ClientUserOutput() {
        System.out.printf("entered stat_PGM_boot3_INITIALISE_WriteQue_ClientUserOutput().%n");
        try {
            _stat_PGM_WriteQue_ClientUserOutput = WriteQue_ClientUserOutput.app_FUNCT_generate_Program();
        } catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
            throw new RuntimeException("NullPointerException.%n", e);
        }
        System.out.printf("exiting stat_PGM_boot3_INITIALISE_WriteQue_ClientUserOutput().%n");
    }
    private static void stat_PGM_boot3_INITIALISE_OpenEPiCentre() {
        System.out.printf("entered stat_PGM_boot3_INITIALISE_OpenEPiCentre().%n");
        try {
            _stat_PGM_OpenEPiCentre = OpenEpiCentre.CLIBConcurrentServerIO__app_FUNCT_generate_Program();
        } catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
            throw new RuntimeException("NullPointerException.%n", e);
        }
        System.out.printf("exiting stat_PGM_boot3_INITIALISE_OpenEPiCentre().%n");
    }
    private static void stat_PGM_boot3_INITIALISE_WriteQue_ServerConditionCode() {
        System.out.printf("entered stat_PGM_boot3_INITIALISE_WriteQue_ServerConditionCode().%n");
        try {
            _stat_PGM_WriteQue_ServerConditionCode = WriteQue_ServerConditionCode.app_FUNCT_generate_Program();
        } catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
            throw new RuntimeException("NullPointerException.%n", e);
        }
        System.out.printf("exiting stat_PGM_boot3_INITIALISE_WriteQue_ServerConditionCode().%n");
    }
    private static void stat_PGM_boot3_INITIALISE_WriteQue_ServerInputReceive() {
        System.out.printf("entered stat_PGM_boot3_INITIALISE_WriteQue_ServerInputReceive().%n");
        try {
            _stat_PGM_WriteQue_ServerInputReceive = WriteQue_ServerInputReceive.app_FUNCT_generate_Program();
        } catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
            throw new RuntimeException("NullPointerException.%n", e);
        }
        System.out.printf("exiting stat_PGM_boot3_INITIALISE_WriteQue_ServerInputReceive().%n");
    }
    private static void stat_PGM_boot3_INITIALISE_WriteQue_ServerOutputSend() {
        System.out.printf("entered stat_PGM_boot3_INITIALISE_WriteQue_ServerOutputSend().%n");
        try {
            _stat_PGM_WriteQue_ServerOutputSend = WriteQue_ClientUserInput.app_FUNCT_generate_Program();
        } catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
            throw new RuntimeException("NullPointerException.%n", e);
        }
        System.out.printf("exiting stat_PGM_boot3_INITIALISE_WriteQue_ServerOutputSend().%n");
    }
    private static void stat_PGM_boot3_INITIALISE_WriteQue_SimulationIO() {
        System.out.printf("entered stat_PGM_boot3_INITIALISE_WriteQue_ClientUserInput().%n");
        try {
            _stat_PGM_WriteQue_SimulationIO = WriteQue_SimulationIO.app_FUNCT_generate_Program();
        } catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
            throw new RuntimeException("NullPointerException.%n", e);
        }
        System.out.printf("exiting stat_PGM_boot3_INITIALISE_WriteQue_ClientUserInput().%n");
    }
}