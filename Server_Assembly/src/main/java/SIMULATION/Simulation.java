package SIMULATION;
import engine.Framework;
import main.IO.*;
import structs.Input;
import structs.Output;
import structs.praise_sets.Input_praise0;
import structs.praise_sets.Input_praise1;
import structs.praise_sets.Input_praise2;
import structs.praise_sets.Input_praise3;
import structs.praise_sets.Output_praise0;
import structs.praise_sets.Output_praise1;
import structs.praise_sets.Output_praise2;
import structs.praise_sets.Output_praise3;

import java.util.Scanner;

public class Simulation
{
    private static Framework obj;
    public static Input _SIM_stat_REG_input_Sample;
    public static Output _SIM_stat_REG_output_Sample;
    private static Scanner _stat_REG_scanner;
    public Simulation(Framework obj, Input _DEFAULT_inputSample, Output _DEFAULT_outputSample)
    {
        _SIM_stat_REG_input_Sample = null;
        _SIM_stat_REG_input_Sample = _DEFAULT_inputSample;
        _SIM_stat_REG_input_Sample.dyn_REG_boot2_SUBSTANTIATE_Input();
        _SIM_stat_REG_input_Sample = _DEFAULT_inputSample;
        _SIM_stat_REG_output_Sample = null;
        _SIM_stat_REG_output_Sample = _DEFAULT_outputSample;
        _SIM_stat_REG_output_Sample.dyn_REG_boot2_SUBSTANTIATE_Output();
        _SIM_stat_REG_output_Sample = _DEFAULT_outputSample;
        _stat_REG_scanner = null;
        _stat_REG_scanner = new Scanner(System.in);
    }
    public void Thread_Input_Peripheral_Scanner(Framework obj, byte threadId) {
        System.out.printf("thread " + threadId + ": Enter THREAD member function on thread.%n");
        boolean doneOnce = false;
        boolean checkPass = false;
        while(!checkPass) {
            WriteQue_SimulationIO.app_FUNCT_write_Start(1);//todo SIMULATION
            WriteQue_ConditionCode.app_FUNCT_write_Start(1);
            if (!doneOnce)
            {
                obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_set_Item_On_List_Of_Flag_ThreadInitialised(threadId, true);
                System.out.printf("thread " + threadId + ": isThreadInitialised => " + obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Item_On_List_Of_Flag_ThreadInitialised(threadId) + ".%n");
                doneOnce = true;
            }
            boolean temp = true;
            for(byte index = 0; index < 3; index++) {
                if(!obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Item_On_List_Of_Flag_ThreadInitialised(index)) {
                    temp = false;
                }
            }
            obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_set_Flag_is_SystemInitialised(temp);
            if(obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised()) {
                checkPass = true;
            }
            WriteQue_ConditionCode.app_FUNCT_write_End(1);
            WriteQue_SimulationIO.app_FUNCT_write_End(1);//todo SIMULATION
        }
        System.out.printf("thread " + threadId + ": Initialised Thread.%n");
        checkPass = false;
        while(!checkPass) {
            WriteQue_SimulationIO.app_FUNCT_write_Start(1);//todo SIMULATION
            WriteQue_ConditionCode.app_FUNCT_write_Start(1);
            if (obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised()) {
                checkPass = true;
            }
            WriteQue_ConditionCode.app_FUNCT_write_End(1);
            WriteQue_SimulationIO.app_FUNCT_write_End(1);
        }
        System.out.printf("thread " + threadId + ": Starting THREAD.%n");
        checkPass = false;
        boolean doneOnce2 = false;
        while(!checkPass) {
            WriteQue_SimulationIO.app_FUNCT_write_Start(1);//todo SIMULATION
            WriteQue_ConditionCode.app_FUNCT_write_Start(1);
            System.out.printf("thread " + threadId + ": OPEN ACCESS 'WriteQue_SimulationIO' @id=1.%n");
            if(obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised()) {
                if(!doneOnce2) {
                    WriteQue_ConditionCode.app_FUNCT_write_End(1);
                    _SIM_stat_REG_input_Sample = obj.dyn_STRUCT_get_Input();
                    System.out.printf("<=%n");
                    System.out.printf("<=%n");
                    System.out.printf("<=%n");
                    System.out.printf("<=%n");
                    System.out.printf("<=%n");
                    System.out.printf("<=%n");
                    System.out.printf("<=%n");
                    System.out.printf("<=%n");
                    System.out.printf("<=%n");
                    _SIM_stat_REG_input_Sample.dyn_REG_set_Input_praiseId(0);//todo process of input
                    System.out.printf("PraiseEventId: " + _SIM_stat_REG_input_Sample.dyn_REG_get_Input_praiseId() + ".%n");
                    _SIM_stat_REG_input_Sample.dyn_REG_set_InputSubset(obj, _SIM_stat_REG_input_Sample.dyn_REG_get_Input_praiseId());//todo process of input
                    Input_praise0 subset_of_input_for_praise0 = null;
                    try {
                        subset_of_input_for_praise0 = (Input_praise0)_SIM_stat_REG_input_Sample.dyn_REG_get_InputSubset();//todo process of input
                        subset_of_input_for_praise0.dyn_REG_set_input_praise0_valueA(2.2);//todo process of input
                        subset_of_input_for_praise0.dyn_REG_set_input_praise0_valueB(3.7);//todo process of input
                        System.out.printf("value_A: " + subset_of_input_for_praise0.dyn_REG_get_input_praise0_valueA() + ".%n");
                        System.out.printf("value_B: " + subset_of_input_for_praise0.dyn_REG_get_input_praise0_valueB() + ".%n");
                    }
                    catch (NoClassDefFoundError e) {
                        System.out.printf("NoClassDefFoundError.%n");
                    }
                    System.out.printf("<=%n");
                    System.out.printf("<=%n");
                    System.out.printf("<=%n");
                    System.out.printf("<=%n");
                    System.out.printf("<=%n");
                    System.out.printf("<=%n");
                    System.out.printf("<=%n");
                    System.out.printf("<=%n");
                    System.out.printf("<=%n");
                    obj.dyn_STRUCT_get_IO_ListenRespond().dyn_REG_set_flag__isNewOutputReady(true);
                    doneOnce2 = true;
                }
            }
            else {
                WriteQue_ConditionCode.app_FUNCT_write_End(1);
            }
            WriteQue_ConditionCode.app_FUNCT_write_Start(1);
            if(!obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised()) {
                checkPass = true;
            }
            WriteQue_ConditionCode.app_FUNCT_write_End(1);
            System.out.printf("thread " + threadId + ": CLOSE ACCESS 'WriteQue_SimulationIO' @id=1.%n");
            WriteQue_SimulationIO.app_FUNCT_write_End(1);//todo SIMULATION
        }
        obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().app_Terminate_All_Threads(obj);
        Terminate_stat_REG_scanner();
    }
    public void Thread_Output_Draw(Framework obj, byte threadId) {
        System.out.printf("thread " + threadId + ": Enter THREAD member function on thread.%n");
        boolean doneOnce = false;
        boolean checkPass = false;
        while(!checkPass) {
            WriteQue_SimulationIO.app_FUNCT_write_Start(2);//todo SIMULATION
            WriteQue_ConditionCode.app_FUNCT_write_Start(2);
            if (!doneOnce)
            {
                obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_set_Item_On_List_Of_Flag_ThreadInitialised(threadId, true);
                System.out.printf("thread " + threadId + ": isThreadInitialised => " + obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Item_On_List_Of_Flag_ThreadInitialised(threadId) + ".%n");
                doneOnce = true;
            }
            boolean temp = true;
            for(byte index = 0; index < 3; index++) {
                if(!obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Item_On_List_Of_Flag_ThreadInitialised(index)) {
                    temp = false;
                }
            }
            obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_set_Flag_is_SystemInitialised(temp);
            if(obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised()) {
                checkPass = true;
            }
            WriteQue_ConditionCode.app_FUNCT_write_End(2);
            WriteQue_SimulationIO.app_FUNCT_write_End(2);//todo SIMULATION
        }
        System.out.printf("thread " + threadId + ": Initialised Thread.%n");
        checkPass = false;
        while(!checkPass) {
            WriteQue_SimulationIO.app_FUNCT_write_Start(2);//todo SIMULATION
            WriteQue_ConditionCode.app_FUNCT_write_Start(2);
            if (obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised()) {
                checkPass = true;
            }
            WriteQue_ConditionCode.app_FUNCT_write_End(2);
            WriteQue_SimulationIO.app_FUNCT_write_End(2);//todo SIMULATION
        }
        System.out.printf("thread " + threadId + ": Starting THREAD.%n");
        checkPass = false;
        while(!checkPass) {
            WriteQue_SimulationIO.app_FUNCT_write_Start(2);//todo SIMULATION
            WriteQue_ConditionCode.app_FUNCT_write_Start(2);
            System.out.printf("thread " + threadId + ": OPEN ACCESS 'WriteQue_SimulationIO' @id=2.%n");
            if(obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised()) {
                if(obj.dyn_STRUCT_get_IO_ListenRespond().dyn_REG_get_flag__isNewOutputReady()) {
                    WriteQue_ConditionCode.app_FUNCT_write_End(2);
                    _SIM_stat_REG_output_Sample = obj.dyn_STRUCT_get_Output();
                    System.out.printf("=>%n");
                    System.out.printf("=>%n");
                    System.out.printf("=>%n");
                    System.out.printf("=>%n");
                    System.out.printf("=>%n");
                    System.out.printf("=>%n");
                    System.out.printf("=>%n");
                    System.out.printf("=>%n");
                    System.out.printf("=>%n");
                    System.out.printf("PraiseEventId: " + _SIM_stat_REG_output_Sample.dyn_REG_get_Output_praiseId() + ".%n");
                    Output_praise0 output_subset0 = null;
                    try {
                        output_subset0 = (Output_praise0)_SIM_stat_REG_output_Sample.dyn_REG_get_OutputSubset();
                        System.out.printf("output subset0 value: " + output_subset0.dyn_REG_get_output_praise0_value() + ".%n");
                    }
                    catch (NoClassDefFoundError e) {
                        System.out.printf("NoClassDefFoundError.%n");
                    }
                    catch (ClassCastException e) {
                        System.out.printf("ClassCastException.%n");
                    }
                    System.out.printf("=>%n");
                    System.out.printf("=>%n");
                    System.out.printf("=>%n");
                    System.out.printf("=>%n");
                    System.out.printf("=>%n");
                    System.out.printf("=>%n");
                    System.out.printf("=>%n");
                    System.out.printf("=>%n");
                    System.out.printf("=>%n");
                    obj.dyn_STRUCT_get_IO_ListenRespond().dyn_REG_set_flag__isNewOutputReady(false);
                }
                else {
                    WriteQue_ConditionCode.app_FUNCT_write_End(2);
                }
            }
            else {
                WriteQue_ConditionCode.app_FUNCT_write_End(2);
            }
            WriteQue_ConditionCode.app_FUNCT_write_Start(2);
            if(!obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised()) {
                checkPass = true;
            }
            WriteQue_ConditionCode.app_FUNCT_write_End(2);
            System.out.printf("thread " + threadId + ": CLOSE ACCESS 'WriteQue_SimulationIO' @id=2.%n");
            WriteQue_SimulationIO.app_FUNCT_write_End(2);//todo SIMULATION
        }
    }
    public static void Terminate_stat_REG_scanner()
    {
        _stat_REG_scanner.close();
    }
    /*
    public static void Get_Praise_Event_Id_And_Data(Input input) {
        WriteQue_SimulationIO.app_FUNCT_write_Start(0);//SIMULATION
        System.out.printf("Enter PraiseEventId: ");
        int praiseEventId = _stat_REG_scanner.nextInt(); // Program waits here
        input.dyn_REG_set_Input_praiseId(praiseEventId);
        input.dyn_REG_set_InputSubset(obj, praiseEventId);
        switch(input.dyn_REG_get_Input_praiseId())
        {
            case (int)0:
                Input_praise0 input_subset0 = (Input_praise0)input.dyn_REG_get_InputSubset();
                System.out.printf("Enter input Subset0 valueA: ");
                input_subset0.dyn_REG_set_input_praise0_valueA(_stat_REG_scanner.nextFloat());
                System.out.printf("Enter input Subset0 valueB: ");
                input_subset0.dyn_REG_set_input_praise0_valueB(_stat_REG_scanner.nextFloat()); // Program waits here
                break;

            case (int)1:
                Input_praise1 input_subset1 = (Input_praise1)input.dyn_REG_get_InputSubset();
                System.out.printf("Enter input Subset1 valueA: ");
                input_subset1.dyn_REG_set_input_praise1_valueA(_stat_REG_scanner.nextFloat());
                System.out.printf("Enter input Subset1 valueB: ");
                input_subset1.dyn_REG_set_input_praise1_valueB(_stat_REG_scanner.nextFloat()); // Program waits here
                break;

            case (int)2:
                Input_praise2 input_suber2 = (Input_praise2)input.dyn_REG_get_InputSubset();
                System.out.printf("Enter input Subset2 valueA: ");
                input_suber2.dyn_REG_set_input_praise2_valueA(_stat_REG_scanner.nextFloat());
                System.out.printf("Enter input Subset2 valueB: ");
                input_suber2.dyn_REG_set_input_praise2_valueB(_stat_REG_scanner.nextFloat()); // Program waits here
                break;

            case (int)3:
                Input_praise3 input_suber3 = (Input_praise3)input.dyn_REG_get_InputSubset();
                System.out.printf("Enter input Subset3 valueA: ");
                input_suber3.dyn_REG_set_input_praise3_valueA(_stat_REG_scanner.nextFloat());
                System.out.printf("Enter input Subset3 valueB: ");
                input_suber3.dyn_REG_set_input_praise3_valueB(_stat_REG_scanner.nextFloat()); // Program waits here
                break;
        }
        WriteQue_SimulationIO.app_FUNCT_write_End(0);//SIMULATION
    }
    public static void Print_PraiseEvent(Output output) {
        WriteQue_SimulationIO.app_FUNCT_write_Start(1);//SIMULATION
        System.out.printf("PraiseEventId: " + output.dyn_REG_get_Output_praiseId() + ".%n");
        switch(output.dyn_REG_get_Output_praiseId())
        {
            case 0:
                Output_praise0 output_subset0 = (Output_praise0)output.dyn_REG_get_OutputSubset();
                System.out.printf("output subset0 value: " + output_subset0.dyn_REG_get_output_praise0_value() + ".%n");
                break;

            case 1:
                Output_praise1 output_subset1 = (Output_praise1)output.dyn_REG_get_OutputSubset();
                System.out.printf("output subset1 value: " + output_subset1.dyn_REG_get_output_praise1_value() + ".%n");
                break;

            case 2:
                Output_praise2 output_subset2 = (Output_praise2)output.dyn_REG_get_OutputSubset();
                System.out.printf("output subset2 value: " + output_subset2.dyn_REG_get_output_praise2_value() + ".%n");
                break;

            case 3:
                Output_praise3 output_subset3 = (Output_praise3)output.dyn_REG_get_OutputSubset();
                System.out.printf("output subset3 value: " + output_subset3.dyn_REG_get_output_praise3_value() + ".%n");
                break;
        }
        WriteQue_SimulationIO.app_FUNCT_write_End(1);//SIMULATION
    }
    private static void app_Do_Process_Of_Input(Framework obj) {
        WriteQue_ServerInputReceive.app_FUNCT_write_Start(0);
        _SIM_stat_REG_input_Sample = obj.dyn_STRUCT_get_Input();
        //_stat_REG_Buffer_For_Input = new byte[1024]; //todo network capture and write to buffer.
        //app_Decode_NetworkingSteam_At_Server_Input_Recieve(_SIM_stat_REG_input_Sample, _stat_REG_Buffer_For_Input);
        Simulation.Get_Praise_Event_Id_And_Data(_SIM_stat_REG_input_Sample);//SIMULATION
        OpenEpiCentre.CLIBConcurrentServerIO__app_FUNCT_select_set_Intput_Subset(_SIM_stat_REG_input_Sample.dyn_REG_get_Input_praiseId());
        switch (_SIM_stat_REG_input_Sample.dyn_REG_get_Input_praiseId())
        {
            case (int)0:
                Input_praise0 subset_of_input_for_praise0 = (Input_praise0)_SIM_stat_REG_input_Sample.dyn_REG_get_InputSubset();
                OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_MetaData_PraiseEventId(_SIM_stat_REG_input_Sample.dyn_REG_get_Input_praiseId());
                OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise0_Value_A(subset_of_input_for_praise0.dyn_REG_get_input_praise0_valueA());
                OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise0_Value_B(subset_of_input_for_praise0.dyn_REG_get_input_praise0_valueB());
                break;

            case (int)1:
                Input_praise1 subset_of_input_for_praise1 = (Input_praise1)_SIM_stat_REG_input_Sample.dyn_REG_get_InputSubset();
                OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_MetaData_PraiseEventId(_SIM_stat_REG_input_Sample.dyn_REG_get_Input_praiseId());
                OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise0_Value_A(subset_of_input_for_praise1.dyn_REG_get_input_praise1_valueA());
                OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise0_Value_B(subset_of_input_for_praise1.dyn_REG_get_input_praise1_valueB());
                break;

            case (int)2:
                Input_praise2 subset_of_input_for_praise2 = (Input_praise2)_SIM_stat_REG_input_Sample.dyn_REG_get_InputSubset();
                OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_MetaData_PraiseEventId(_SIM_stat_REG_input_Sample.dyn_REG_get_Input_praiseId());
                OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise0_Value_A(subset_of_input_for_praise2.dyn_REG_get_input_praise2_valueA());
                OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise0_Value_B(subset_of_input_for_praise2.dyn_REG_get_input_praise2_valueB());
                break;

            case (int)3:
                Input_praise3 subset_of_input_for_praise3 = (Input_praise3)_SIM_stat_REG_input_Sample.dyn_REG_get_InputSubset();
                OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_MetaData_PraiseEventId(_SIM_stat_REG_input_Sample.dyn_REG_get_Input_praiseId());
                OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise0_Value_A(subset_of_input_for_praise3.dyn_REG_get_input_praise3_valueA());
                OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise0_Value_B(subset_of_input_for_praise3.dyn_REG_get_input_praise3_valueB());
                break;
        }
        OpenEpiCentre.CLIBConcurrentServerIO__app_FUNCT_flip_Input_DoubleBuffer();
        OpenEpiCentre.CLIBConcurrentServerIO__app_FUNCT_push_To_STACK_Of_Input();
        WriteQue_ServerInputReceive.app_FUNCT_write_End(0);
    }
    private static void app_Do_Process_Of_Output(Framework obj) {
        if(OpenEpiCentre.CLIBConcurrentServerIO__dyn_REG_get_flag_isStackLoaded_ServerOutputSend())
        {
            WriteQue_ServerInputReceive.app_FUNCT_write_Start(0);
            //_stat_REG_Buffer_For_Ouput = new byte[1024];
            _SIM_stat_REG_output_Sample = obj.dyn_STRUCT_get_Output();
            while(OpenEpiCentre.CLIBConcurrentServerIO__dyn_REG_get_flag_isStackLoaded_ServerOutputSend()) {
                OpenEpiCentre.CLIBConcurrentServerIO__app_FUNCT_pop_From_Stack_Of_Output();
                _SIM_stat_REG_output_Sample.dyn_REG_set_Output_praiseId(OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_get_MetaData_PraiseEventId());
                _SIM_stat_REG_output_Sample.dyn_REG_set_OutputSubset(obj, _SIM_stat_REG_output_Sample.dyn_REG_get_Output_praiseId());
                switch (_SIM_stat_REG_output_Sample.dyn_REG_get_Output_praiseId()) {
                    case 0:
                        Output_praise0 subset_of_output_for_praise0 = (Output_praise0) _SIM_stat_REG_output_Sample.dyn_REG_get_OutputSubset();
                        subset_of_output_for_praise0.dyn_REG_set_output_praise0_value(OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_get_Item_CLIB_OpenEpiCentre_STRUCT__Output_praise0_Value());
                        break;

                    case 1:
                        Output_praise1 subset_of_output_for_praise1 = (Output_praise1) _SIM_stat_REG_output_Sample.dyn_REG_get_OutputSubset();
                        subset_of_output_for_praise1.dyn_REG_set_output_praise1_value(OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_get_Item_CLIB_OpenEpiCentre_STRUCT__Output_praise1_Value());
                        break;

                    case 2:
                        Output_praise0 subset_of_output_for_praise2 = (Output_praise0) _SIM_stat_REG_output_Sample.dyn_REG_get_OutputSubset();
                        subset_of_output_for_praise2.dyn_REG_set_output_praise0_value(OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_get_Item_CLIB_OpenEpiCentre_STRUCT__Output_praise2_Value());
                        break;

                    case 3:
                        Output_praise0 subset_of_output_for_praise3 = (Output_praise0) _SIM_stat_REG_output_Sample.dyn_REG_get_OutputSubset();
                        subset_of_output_for_praise3.dyn_REG_set_output_praise0_value(OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_get_Item_CLIB_OpenEpiCentre_STRUCT__Output_praise3_Value());
                        break;
                }
                //app_Encode_NetworkingSteam_At_Server_Output_Send(obj, _SIM_stat_REG_output_Sample, _stat_REG_Buffer_For_Ouput);
                Simulation.Print_PraiseEvent(_SIM_stat_REG_output_Sample);
                //todo send.
            }
            WriteQue_ServerInputReceive.app_FUNCT_write_End(0);
        }
    }
    */
    public void dyn_REG_boot1_DEFINE__SIMULATION() {
        stat_REG_boot1_DEFINE__SIMULATION();
    }
    public void dyn_REG_boot2_SUBSTANTIATE__SIMULATION(Input sample) {
        stat_REG_boot2_SUBSTANTIATE__SIMULATION(sample);
    }
    public void dyn_REG_boot3_INITIALISE__SIMULATION(Input sample) {
        stat_REG_boot3_INITIALISE__SIMULATION(sample);
    }
    public void stat_REG_boot1_DEFINE__SIMULATION() {
        stat_CLASS_boot1_DEFINE_SIMULATION__stat_REG_input_Sample();
    }
    private static void stat_CLASS_boot1_DEFINE_SIMULATION__stat_REG_input_Sample() {
        _SIM_stat_REG_input_Sample = null;
    }
    public void stat_REG_boot2_SUBSTANTIATE__SIMULATION(Input sample) {
        stat_REG_boot2_SUBSTANTIATE__SIMULATION__SIM_stat_REG_input_Sample(sample);
    }
    private static void stat_REG_boot2_SUBSTANTIATE__SIMULATION__SIM_stat_REG_input_Sample(Input sample) {
        sample.dyn_REG_boot2_SUBSTANTIATE_Input();
        _SIM_stat_REG_input_Sample = sample;
    }
    public void stat_REG_boot3_INITIALISE__SIMULATION(Input sample) {
        stat_REG_boot3_INITIALISE__SIMULATION__SIM_stat_REG_input_Sample(sample);
    }
    private static void stat_REG_boot3_INITIALISE__SIMULATION__SIM_stat_REG_input_Sample(Input sample) {
        _SIM_stat_REG_input_Sample = sample;
    }
}