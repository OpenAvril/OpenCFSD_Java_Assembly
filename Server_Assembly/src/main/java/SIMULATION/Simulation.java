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
        _SIM_stat_REG_input_Sample.dyn_REG_boot3_INITIALISE_Input(obj.dyn_STRUCT_get_User_Input());
        _SIM_stat_REG_input_Sample = _DEFAULT_inputSample;
        _SIM_stat_REG_output_Sample = null;
        _SIM_stat_REG_output_Sample = _DEFAULT_outputSample;
        _SIM_stat_REG_output_Sample.dyn_REG_boot2_SUBSTANTIATE_Output();
        _SIM_stat_REG_output_Sample.dyn_REG_boot3_INITIALISE_Output(obj.dyn_STRUCT_get_User_Output());
        _SIM_stat_REG_output_Sample = _DEFAULT_outputSample;
        _stat_REG_scanner = null;
        _stat_REG_scanner = new Scanner(System.in);
    }
    public void Thread_Input_Peripheral_Scanner(Framework obj, byte threadId) {
        System.out.printf("thread " + threadId + " :: Enter THREAD member function on thread.%n");
        boolean doneOnce = false;
        boolean checkPass = false;
        while (!checkPass) {
            WriteQue_ConditionCode.app_FUNCT_write_Start(0);
            System.out.printf("thread " + threadId + " :: SIM IN => : OPEN ACCESS 'WriteQue_ConditionCode'.%n");//todo SIMULATION
            WriteQue_SimulationIO.app_FUNCT_write_Start(0);//todo SIMULATION
            System.out.printf("thread " + threadId + " :: SIM IN => : OPEN ACCESS 'WriteQue_SimulationIO'.%n");//todo SIMULATION
            if (!doneOnce) {
                obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_set_Item_On_List_Of_Flag_ThreadInitialised(threadId, true);
                System.out.printf("thread " + threadId + " :: isThreadInitialised => " + obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Item_On_List_Of_Flag_ThreadInitialised(threadId) + ".%n");
                doneOnce = true;
            }
            WriteQue_SimulationIO.app_FUNCT_write_End(0);//todo SIMULATION
            System.out.printf("thread " + threadId + " :: SIM IN => : CLOSE ACCESS 'WriteQue_SimulationIO'.%n");//todo SIMULATION
            WriteQue_ConditionCode.app_FUNCT_write_End(0);
            System.out.printf("thread " + threadId + " :: SIM IN => : CLOSE ACCESS 'WriteQue_ConditionCode'.%n");//todo SIMULATION
            checkPass = true;
        }
        System.out.printf("thread " + threadId + " :: Initialised Thread.%n");
        checkPass = false;
        while(!checkPass) {
            WriteQue_ConditionCode.app_FUNCT_write_Start(1);
            System.out.printf("thread " + threadId + " :: SIM IN <= : OPEN ACCESS 'WriteQue_ConditionCode'.%n");//todo SIMULATION
            WriteQue_SimulationIO.app_FUNCT_write_Start(1);//todo SIMULATION
            System.out.printf("thread " + threadId + " :: SIM IN <= : OPEN ACCESS 'WriteQue_SimulationIO'.%n");//todo SIMULATION
            if (obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised()) {
                checkPass = true;
            }
            WriteQue_SimulationIO.app_FUNCT_write_End(1);
            System.out.printf("thread " + threadId + " :: SIM IN <= : CLOSE ACCESS 'WriteQue_SimulationIO'.%n");//todo SIMULATION
            WriteQue_ConditionCode.app_FUNCT_write_End(1);
            System.out.printf("thread " + threadId + " :: SIM IN <= : CLOSE ACCESS 'WriteQue_ConditionCode'.%n");//todo SIMULATION
        }
        System.out.printf("thread " + threadId + " :: Starting THREAD.%n");//todo SIMULATION
        checkPass = false;
        boolean doneOnce2 = false;
        while(!checkPass) {
            WriteQue_ConditionCode.app_FUNCT_write_Start(1);
            System.out.printf("thread " + threadId + " :: CC : OPEN ACCESS 'WriteQue_ConditionCode' @id=1.%n");//todo SIMULATION
            WriteQue_SimulationIO.app_FUNCT_write_Start(1);//todo SIMULATION
            System.out.printf("thread " + threadId + " :: SIM IN <= : OPEN ACCESS 'WriteQue_SimulationIO' @id=1.%n");//todo SIMULATION
            if(obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised()) {
                System.out.printf("thread " + threadId + " :: dyn_REG_get_Flag_is_SystemInitialised() => " + true + ".%n");//todo SIMULATION
                if(!obj.dyn_STRUCT_get_IO_ListenRespond().dyn_REG_get_flag__isNewInputReady()) {
                    System.out.printf("thread " + threadId + " :: dyn_REG_get_flag__isNewInputReady() => " + false + ".%n");//todo SIMULATION
                    //System.out.printf("thread " + threadId + " :: CC : CLOSE ACCESS 'WriteQue_ConditionCode' @id=1.%n");//todo SIMULATION
                    //WriteQue_ConditionCode.app_FUNCT_write_End(1);//todo SIMULATION
                    if(!doneOnce2) {
                        _SIM_stat_REG_input_Sample = obj.dyn_STRUCT_get_Input();
                        System.out.printf("thread " + threadId + " :: SIM IN <=%n");//todo SIMULATION
                        System.out.printf("thread " + threadId + " :: SIM IN <=%n");//todo SIMULATION
                        System.out.printf("thread " + threadId + " :: SIM IN <=%n");//todo SIMULATION
                        System.out.printf("thread " + threadId + " :: SIM IN <=%n");//todo SIMULATION
                        System.out.printf("thread " + threadId + " :: SIM IN <=%n");//todo SIMULATION
                        System.out.printf("thread " + threadId + " :: SIM IN <=%n");//todo SIMULATION
                        for(long praiseIdIndex = 0; praiseIdIndex < 4; praiseIdIndex++) {
                            _SIM_stat_REG_input_Sample.dyn_REG_set_Input_praiseId(praiseIdIndex);//todo process of input
                            System.out.printf("thread " + threadId + " :: PraiseEventId: " + _SIM_stat_REG_input_Sample.dyn_REG_get_Input_praiseId() + ".%n");//todo SIMULATION
                            _SIM_stat_REG_input_Sample.dyn_REG_set_InputSubset(obj, _SIM_stat_REG_input_Sample.dyn_REG_get_Input_praiseId());//todo process of input
                            Input_praise0 subset_of_input_for_praise0 = null;
                            Input_praise1 subset_of_input_for_praise1 = null;
                            Input_praise2 subset_of_input_for_praise2 = null;
                            Input_praise3 subset_of_input_for_praise3 = null;
                            boolean[] sim_in_bits = new boolean[64];
                            boolean[] sim_in_bitsA = new boolean[32];
                            boolean[] sim_in_bitsB = new boolean[32];
                            int sim_in_switch_A = 0;
                            int sim_in_switch_B = 0;
                            for (int i = 0; i < 64; i++) {
                                sim_in_bits[i] = ((_SIM_stat_REG_input_Sample.dyn_REG_get_Input_praiseId() >> i) & 1) == 1;
                            }
                            for (int indexA = 0; indexA < 32; indexA++) {
                                sim_in_bitsA[indexA] = sim_in_bits[32 + indexA];
                                sim_in_bitsB[indexA] = sim_in_bits[indexA];
                            }
                            for (int indexB = 0; indexB < 32; indexB++) {
                                sim_in_switch_A = (sim_in_switch_A << 1) | (sim_in_bitsA[indexB] ? 1 : 0);
                                sim_in_switch_B = (sim_in_switch_B << 1) | (sim_in_bitsB[indexB] ? 1 : 0);
                            }
                            System.out.printf("thread " + threadId + " :: switch(" + sim_in_switch_A + ", " + sim_in_switch_B + ").%n");//todo SIMULATION
                            switch (sim_in_switch_A) {
                                case 0:
                                    switch (sim_in_switch_B) {
                                        case 0:
                                            try {
                                                subset_of_input_for_praise0 = (Input_praise0)_SIM_stat_REG_input_Sample.dyn_REG_get_InputSubset();//todo process of input

                                            } catch (NoClassDefFoundError e) {
                                                System.out.printf("thread " + threadId + " :: NoClassDefFoundError.%n");
                                            } catch (ClassCastException e) {
                                                System.out.printf("thread " + threadId + " :: ClassCastException.%n");
                                            }
                                            subset_of_input_for_praise0.dyn_REG_set_input_praise0_valueA(2.2);//todo process of input
                                            subset_of_input_for_praise0.dyn_REG_set_input_praise0_valueB(3.7);//todo process of input
                                            System.out.printf("thread " + threadId + " :: value_A: " + subset_of_input_for_praise0.dyn_REG_get_input_praise0_valueA() + ".%n");//todo SIMULATION
                                            System.out.printf("thread " + threadId + " :: value_B: " + subset_of_input_for_praise0.dyn_REG_get_input_praise0_valueB() + ".%n");//todo SIMULATION
                                            break;

                                        case 1:
                                            try {
                                                subset_of_input_for_praise1 = (Input_praise1)_SIM_stat_REG_input_Sample.dyn_REG_get_InputSubset();//todo process of input

                                            } catch (NoClassDefFoundError e) {
                                                System.out.printf("thread " + threadId + " :: NoClassDefFoundError.%n");
                                            } catch (ClassCastException e) {
                                                System.out.printf("thread " + threadId + " :: ClassCastException.%n");
                                            }
                                            subset_of_input_for_praise1.dyn_REG_set_input_praise1_valueA(2.2);//todo process of input
                                            subset_of_input_for_praise1.dyn_REG_set_input_praise1_valueB(3.7);//todo process of input
                                            System.out.printf("thread " + threadId + " :: value_A: " + subset_of_input_for_praise1.dyn_REG_get_input_praise1_valueA() + ".%n");//todo SIMULATION
                                            System.out.printf("thread " + threadId + " :: value_B: " + subset_of_input_for_praise1.dyn_REG_get_input_praise1_valueB() + ".%n");//todo SIMULATION
                                            break;

                                        case 2:
                                            try {
                                                subset_of_input_for_praise2 = (Input_praise2)_SIM_stat_REG_input_Sample.dyn_REG_get_InputSubset();//todo process of input

                                            } catch (NoClassDefFoundError e) {
                                                System.out.printf("thread " + threadId + " :: NoClassDefFoundError.%n");
                                            } catch (ClassCastException e) {
                                                System.out.printf("thread " + threadId + " :: ClassCastException.%n");
                                            }
                                            subset_of_input_for_praise2.dyn_REG_set_input_praise2_valueA(2.2);//todo process of input
                                            subset_of_input_for_praise2.dyn_REG_set_input_praise2_valueB(3.7);//todo process of input
                                            System.out.printf("thread " + threadId + " :: value_A: " + subset_of_input_for_praise2.dyn_REG_get_input_praise2_valueA() + ".%n");//todo SIMULATION
                                            System.out.printf("thread " + threadId + " :: value_B: " + subset_of_input_for_praise2.dyn_REG_get_input_praise2_valueB() + ".%n");//todo SIMULATION
                                            break;

                                        case 3:
                                            try {
                                                subset_of_input_for_praise3 = (Input_praise3)_SIM_stat_REG_input_Sample.dyn_REG_get_InputSubset();//todo process of input

                                            } catch (NoClassDefFoundError e) {
                                                System.out.printf("thread " + threadId + " :: NoClassDefFoundError.%n");
                                            } catch (ClassCastException e) {
                                                System.out.printf("thread " + threadId + " :: ClassCastException.%n");
                                            }
                                            subset_of_input_for_praise3.dyn_REG_set_input_praise3_valueA(2.2);//todo process of input
                                            subset_of_input_for_praise3.dyn_REG_set_input_praise3_valueB(3.7);//todo process of input
                                            System.out.printf("thread " + threadId + " :: value_A: " + subset_of_input_for_praise3.dyn_REG_get_input_praise3_valueA() + ".%n");//todo SIMULATION
                                            System.out.printf("thread " + threadId + " :: value_B: " + subset_of_input_for_praise3.dyn_REG_get_input_praise3_valueB() + ".%n");//todo SIMULATION
                                            break;

                                        default:
                                            System.out.printf("thread " + threadId + " :: case(" + sim_in_switch_A + ", " + sim_in_switch_B + ").%n");//todo SIMULATION
                                            break;
                                    }
                                default:
                                    System.out.printf("thread " + threadId + " :: case(" + sim_in_switch_A + ", " + sim_in_switch_B + ").%n");//todo SIMULATION
                                    break;
                            }
                        }
                        System.out.printf("thread " + threadId + " :: SIM IN <=%n");//todo SIMULATION
                        System.out.printf("thread " + threadId + " :: SIM IN <=%n");//todo SIMULATION
                        System.out.printf("thread " + threadId + " :: SIM IN <=%n");//todo SIMULATION
                        System.out.printf("thread " + threadId + " :: SIM IN <=%n");//todo SIMULATION
                        System.out.printf("thread " + threadId + " :: SIM IN <=%n");//todo SIMULATION
                        System.out.printf("thread " + threadId + " :: SIM IN <=%n");//todo SIMULATION
                        obj.dyn_STRUCT_get_IO_ListenRespond().dyn_REG_set_flag__isNewInputReady(true);
                        doneOnce2 = true;
                    }
                }
            }
            else {
                //WriteQue_ConditionCode.app_FUNCT_write_End(1);
                //System.out.printf("thread " + threadId + ":: CC : CLOSE ACCESS 'WriteQue_ConditionCode' @id=1.%n");//todo SIMULATION
            }
           // WriteQue_ConditionCode.app_FUNCT_write_Start(1);
           // System.out.printf("thread " + threadId + " :: CC : OPEN ACCESS 'WriteQue_ConditionCode' @id=1.%n");//todo SIMULATION
            if(!obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised()) {
                checkPass = true;
            }
            System.out.printf("thread " + threadId + ":: CC : CLOSE ACCESS 'WriteQue_ConditionCode' @id=1.%n");//todo SIMULATION
            WriteQue_ConditionCode.app_FUNCT_write_End(1);
            System.out.printf("thread " + threadId + ":: SIM IN <= : CLOSE ACCESS 'WriteQue_SimulationIO' @id=1.%n");//todo SIMULATION
            WriteQue_SimulationIO.app_FUNCT_write_End(1);//todo SIMULATION
        }
        Terminate_stat_REG_scanner();
    }
    public void Thread_Output_Draw(Framework obj, byte threadId) {
        System.out.printf("thread " + threadId + " :: Enter THREAD member function on thread.%n");//todo SIMULATION
        boolean doneOnce = false;
        boolean checkPass = false;
        while (!checkPass) {
            WriteQue_ConditionCode.app_FUNCT_write_Start(0);
            System.out.printf("thread " + threadId + " :: SIM OUT => : OPEN ACCESS 'WriteQue_ConditionCode'.%n");//todo SIMULATION
            WriteQue_SimulationIO.app_FUNCT_write_Start(0);//todo SIMULATION
            System.out.printf("thread " + threadId + " :: SIM OUT => : OPEN ACCESS 'WriteQue_SimulationIO'.%n");//todo SIMULATION
            if (!doneOnce) {
                obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_set_Item_On_List_Of_Flag_ThreadInitialised(threadId, true);
                System.out.printf("thread " + threadId + " :: isThreadInitialised => " + obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Item_On_List_Of_Flag_ThreadInitialised(threadId) + ".%n");
                doneOnce = true;
            }
            WriteQue_SimulationIO.app_FUNCT_write_End(0);//todo SIMULATION
            System.out.printf("thread " + threadId + " :: SIM OUT => : CLOSE ACCESS 'WriteQue_SimulationIO'.%n");//todo SIMULATION
            WriteQue_ConditionCode.app_FUNCT_write_End(0);
            System.out.printf("thread " + threadId + " :: SIM OUT => : CLOSE ACCESS 'WriteQue_ConditionCode'.%n");//todo SIMULATION
            checkPass = true;
        }
        System.out.printf("thread " + threadId + " :: Initialised Thread.%n");//todo SIMULATION
        checkPass = false;
        while(!checkPass) {
            WriteQue_ConditionCode.app_FUNCT_write_Start(1);
            System.out.printf("thread " + threadId + " :: SIM OUT <= : OPEN ACCESS 'WriteQue_ConditionCode'.%n");//todo SIMULATION
            WriteQue_SimulationIO.app_FUNCT_write_Start(1);//todo SIMULATION
            System.out.printf("thread " + threadId + " :: SIM OUT <= : OPEN ACCESS 'WriteQue_SimulationIO'.%n");//todo SIMULATION
            if (obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised()) {
                checkPass = true;
            }
            WriteQue_SimulationIO.app_FUNCT_write_End(1);
            System.out.printf("thread " + threadId + " :: SIM OUT <= : CLOSE ACCESS 'WriteQue_SimulationIO'.%n");//todo SIMULATION
            WriteQue_ConditionCode.app_FUNCT_write_End(1);
            System.out.printf("thread " + threadId + " :: SIM OUT <= : CLOSE ACCESS 'WriteQue_ConditionCode'.%n");//todo SIMULATION
        }
        System.out.printf("thread " + threadId + " :: Starting THREAD.%n");//todo SIMULATION
        checkPass = false;
        while(!checkPass) {
            WriteQue_ConditionCode.app_FUNCT_write_Start(2);
            System.out.printf("thread " + threadId + " :: CC : OPEN ACCESS 'WriteQue_ConditionCode'.%n");//todo SIMULATION
            WriteQue_SimulationIO.app_FUNCT_write_Start(2);//todo SIMULATION
            System.out.printf("thread " + threadId + " :: SIM OUT => : OPEN ACCESS 'WriteQue_SimulationIO'.%n");//todo SIMULATION
            if(obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised()) {
                System.out.printf("thread " + threadId + " :: dyn_REG_get_Flag_is_SystemInitialised() => " + obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised() + ".%n");//todo SIMULATION
                while (OpenEpiCentre.CLIBConcurrentServerIO__dyn_REG_get_flag_isStackLoaded_ServerOutputSend()) {
                    System.out.printf("thread " + threadId + " :: loop iterator : while 'is' stack loaded at output.%n");//todo SIMULATION
                    if (obj.dyn_STRUCT_get_IO_ListenRespond().dyn_REG_get_flag__isNewOutputReady()) {
                        System.out.printf("thread " + threadId + " :: stat_REG_get_flag__isNewInputReady() => " + obj.dyn_STRUCT_get_IO_ListenRespond().dyn_REG_get_flag__isNewOutputReady() + ".%n");//todo SIMULATION
                        //System.out.printf("thread " + threadId + " :: CC : CLOSE ACCESS 'WriteQue_ConditionCode'.%n");//todo SIMULATION
                        //WriteQue_ConditionCode.app_FUNCT_write_End(2);//todo SIMULATION
                        _SIM_stat_REG_output_Sample = obj.dyn_STRUCT_get_Output();
                        System.out.printf("thread " + threadId + " :: SIM OUT =>%n");
                        System.out.printf("thread " + threadId + " :: SIM OUT =>%n");
                        System.out.printf("thread " + threadId + " :: SIM OUT =>%n");
                        System.out.printf("thread " + threadId + " :: SIM OUT =>%n");
                        System.out.printf("thread " + threadId + " :: SIM OUT =>%n");
                        System.out.printf("thread " + threadId + " :: SIM OUT =>%n");
                        for (long praiseIdIndex = 0; praiseIdIndex < 4; praiseIdIndex++) {
                            System.out.printf("thread " + threadId + " :: PraiseEventId: " + _SIM_stat_REG_output_Sample.dyn_REG_get_Output_praiseId() + ".%n");
                            Output_praise0 output_subset0 = null;
                            Output_praise1 output_subset1 = null;
                            Output_praise2 output_subset2 = null;
                            Output_praise3 output_subset3 = null;
                            boolean[] bits = new boolean[64];
                            boolean[] bitsA = new boolean[32];
                            boolean[] bitsB = new boolean[32];
                            int switch_A = 0;
                            int switch_B = 0;
                            for (int i = 0; i < 64; i++) {
                                bits[i] = ((_SIM_stat_REG_input_Sample.dyn_REG_get_Input_praiseId() >> i) & 1) == 1;
                            }
                            for (int indexA = 0; indexA < 32; indexA++) {
                                bitsA[indexA] = bits[indexA];
                                bitsB[indexA] = bits[32 + indexA];
                            }
                            for (int indexB = 0; indexB < 32; indexB++) {
                                switch_A = (switch_A << 1) | (bitsA[indexB] ? 1 : 0);
                                switch_B = (switch_B << 1) | (bitsB[indexB] ? 1 : 0);
                            }
                            System.out.printf("thread " + threadId + " :: switch(" + switch_A + ", " + switch_B + ").%n");//todo SIMULATION
                            switch (switch_A) {
                                case 0:
                                    switch (switch_B) {
                                        case 0:
                                            try {
                                                output_subset0 = (Output_praise0) _SIM_stat_REG_output_Sample.dyn_REG_get_OutputSubset();
                                                System.out.printf("thread " + threadId + " :: output subset0 value: " + output_subset0.dyn_REG_get_output_praise0_value() + ".%n");
                                            } catch (NoClassDefFoundError e) {
                                                System.out.printf("thread " + threadId + " :: NoClassDefFoundError.%n");
                                            } catch (ClassCastException e) {
                                                System.out.printf("thread " + threadId + " :: ClassCastException.%n");
                                            }
                                            break;

                                        case 1:
                                            try {
                                                output_subset1 = (Output_praise1) _SIM_stat_REG_output_Sample.dyn_REG_get_OutputSubset();
                                                System.out.printf("thread " + threadId + " :: output subset1 value: " + output_subset1.dyn_REG_get_output_praise1_value() + ".%n");
                                            } catch (NoClassDefFoundError e) {
                                                System.out.printf("thread " + threadId + " :: NoClassDefFoundError.%n");
                                            } catch (ClassCastException e) {
                                                System.out.printf("thread " + threadId + " :: ClassCastException.%n");
                                            }
                                            break;

                                        case 2:
                                            try {
                                                output_subset2 = (Output_praise2) _SIM_stat_REG_output_Sample.dyn_REG_get_OutputSubset();
                                                System.out.printf("thread " + threadId + " :: output subset2 value: " + output_subset2.dyn_REG_get_output_praise2_value() + ".%n");
                                            } catch (NoClassDefFoundError e) {
                                                System.out.printf("thread " + threadId + " :: NoClassDefFoundError.%n");
                                            } catch (ClassCastException e) {
                                                System.out.printf("thread " + threadId + " :: ClassCastException.%n");
                                            }
                                            break;

                                        case 3:
                                            try {
                                                output_subset3 = (Output_praise3) _SIM_stat_REG_output_Sample.dyn_REG_get_OutputSubset();
                                                System.out.printf("thread " + threadId + " :: output subset3 value: " + output_subset3.dyn_REG_get_output_praise3_value() + ".%n");
                                            } catch (NoClassDefFoundError e) {
                                                System.out.printf("thread " + threadId + " :: NoClassDefFoundError.%n");
                                            } catch (ClassCastException e) {
                                                System.out.printf("thread " + threadId + " :: ClassCastException.%n");
                                            }
                                            obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_set_Flag_is_SystemInitialised(false);//TODO SIMULATION
                                            break;

                                        default:
                                            System.out.printf("thread " + threadId + " :: case(" + switch_A + ", " + switch_B + ").%n");//todo SIMULATION
                                            break;
                                    }
                                default:
                                    System.out.printf("thread " + threadId + " :: case(" + switch_A + ", " + switch_B + ").%n");//todo SIMULATION
                                    break;
                            }
                        }
                        System.out.printf("thread " + threadId + " :: SIM OUT =>%n");
                        System.out.printf("thread " + threadId + " :: SIM OUT =>%n");
                        System.out.printf("thread " + threadId + " :: SIM OUT =>%n");
                        System.out.printf("thread " + threadId + " :: SIM OUT =>%n");
                        System.out.printf("thread " + threadId + " :: SIM OUT =>%n");
                        System.out.printf("thread " + threadId + " :: SIM OUT =>%n");
                        obj.dyn_STRUCT_get_IO_ListenRespond().dyn_REG_set_flag__isNewOutputReady(false);
                    } else {
                        //System.out.printf("thread " + threadId + " :: CC : CLOSE ACCESS 'WriteQue_ConditionCode'.%n");//todo SIMULATION
                        //WriteQue_ConditionCode.app_FUNCT_write_End(2);//todo SIMULATION
                    }
                }
            }
            else {
                //System.out.printf("thread " + threadId + " :: CC : CLOSE ACCESS 'WriteQue_ConditionCode'.%n");//todo SIMULATION
                //WriteQue_ConditionCode.app_FUNCT_write_End(2);//todo SIMULATION
                checkPass = true;
            }
            //System.out.printf("thread " + threadId + " :: CC : OPEN ACCESS 'WriteQue_ConditionCode'.%n");//todo SIMULATION
            //WriteQue_ConditionCode.app_FUNCT_write_Start(2);//todo SIMULATION
            if(!obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised()) {
                checkPass = true;
            }
            System.out.printf("thread " + threadId + " :: CC : CLOSE ACCESS 'WriteQue_ConditionCode'.%n");//todo SIMULATION
            WriteQue_ConditionCode.app_FUNCT_write_End(2);
            System.out.printf("thread " + threadId + " :: SIM OUT => : CLOSE ACCESS 'WriteQue_SimulationIO'.%n");//todo SIMULATION
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
        long praiseEventId = _stat_REG_scanner.nextInt(); // Program waits here
        input.dyn_REG_set_Input_praiseId(praiseEventId);
        input.dyn_REG_set_InputSubset(obj, praiseEventId);
        switch(input.dyn_REG_get_Input_praiseId())
        {
            case (long)0:
                Input_praise0 input_subset0 = (Input_praise0)input.dyn_REG_get_InputSubset();
                System.out.printf("Enter input Subset0 valueA: ");
                input_subset0.dyn_REG_set_input_praise0_valueA(_stat_REG_scanner.nextFloat());
                System.out.printf("Enter input Subset0 valueB: ");
                input_subset0.dyn_REG_set_input_praise0_valueB(_stat_REG_scanner.nextFloat()); // Program waits here
                break;

            case (long)1:
                Input_praise1 input_subset1 = (Input_praise1)input.dyn_REG_get_InputSubset();
                System.out.printf("Enter input Subset1 valueA: ");
                input_subset1.dyn_REG_set_input_praise1_valueA(_stat_REG_scanner.nextFloat());
                System.out.printf("Enter input Subset1 valueB: ");
                input_subset1.dyn_REG_set_input_praise1_valueB(_stat_REG_scanner.nextFloat()); // Program waits here
                break;

            case (long)2:
                Input_praise2 input_suber2 = (Input_praise2)input.dyn_REG_get_InputSubset();
                System.out.printf("Enter input Subset2 valueA: ");
                input_suber2.dyn_REG_set_input_praise2_valueA(_stat_REG_scanner.nextFloat());
                System.out.printf("Enter input Subset2 valueB: ");
                input_suber2.dyn_REG_set_input_praise2_valueB(_stat_REG_scanner.nextFloat()); // Program waits here
                break;

            case (long)3:
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
            case (long)0:
                Input_praise0 subset_of_input_for_praise0 = (Input_praise0)_SIM_stat_REG_input_Sample.dyn_REG_get_InputSubset();
                OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_MetaData_PraiseEventId(_SIM_stat_REG_input_Sample.dyn_REG_get_Input_praiseId());
                OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise0_Value_A(subset_of_input_for_praise0.dyn_REG_get_input_praise0_valueA());
                OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise0_Value_B(subset_of_input_for_praise0.dyn_REG_get_input_praise0_valueB());
                break;

            case (long)1:
                Input_praise1 subset_of_input_for_praise1 = (Input_praise1)_SIM_stat_REG_input_Sample.dyn_REG_get_InputSubset();
                OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_MetaData_PraiseEventId(_SIM_stat_REG_input_Sample.dyn_REG_get_Input_praiseId());
                OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise0_Value_A(subset_of_input_for_praise1.dyn_REG_get_input_praise1_valueA());
                OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise0_Value_B(subset_of_input_for_praise1.dyn_REG_get_input_praise1_valueB());
                break;

            case (long)2:
                Input_praise2 subset_of_input_for_praise2 = (Input_praise2)_SIM_stat_REG_input_Sample.dyn_REG_get_InputSubset();
                OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_MetaData_PraiseEventId(_SIM_stat_REG_input_Sample.dyn_REG_get_Input_praiseId());
                OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise0_Value_A(subset_of_input_for_praise2.dyn_REG_get_input_praise2_valueA());
                OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise0_Value_B(subset_of_input_for_praise2.dyn_REG_get_input_praise2_valueB());
                break;

            case (long)3:
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