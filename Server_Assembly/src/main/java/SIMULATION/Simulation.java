package SIMULATION;
import engine.Framework;
import engine.Global;
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

import java.util.Arrays;
import java.util.Scanner;

public class Simulation
{
    private static Framework obj;
    public static Input _SIM_stat_REG_input_Sample;
    public static Output _SIM_stat_REG_output_Sample;
    private static boolean[] _SIM_stat_REG_PraiseStarted;
    private static boolean[] _SIM_stat_REG_PraiseComplete;
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
        _SIM_stat_REG_PraiseStarted = null;
        _SIM_stat_REG_PraiseStarted = new boolean[4];
        _SIM_stat_REG_PraiseComplete = null;
        _SIM_stat_REG_PraiseComplete = new boolean[4];
        for(int i=0; i< Global.dyn_REG_get_numberOfPraises(); i++) {
            _SIM_stat_REG_PraiseStarted[i] = true;
            _SIM_stat_REG_PraiseComplete[i] = true;
        }
        for(int i=0; i< Global.dyn_REG_get_numberOfPraises(); i++) {
            _SIM_stat_REG_PraiseStarted[i] = false;
            _SIM_stat_REG_PraiseComplete[i] = false;
        }
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
                        for(long praiseIdIndex = 0; praiseIdIndex < 4; praiseIdIndex++) {
                            while (obj.dyn_STRUCT_get_IO_ListenRespond().dyn_REG_get_flag__isNewInputReady()) {

                            }
                            System.out.printf("thread " + threadId + " :: SIM IN <=%n");//todo SIMULATION
                            System.out.printf("thread " + threadId + " :: SIM IN <=%n");//todo SIMULATION
                            System.out.printf("thread " + threadId + " :: SIM IN <=%n");//todo SIMULATION
                            System.out.printf("thread " + threadId + " :: SIM IN <=%n");//todo SIMULATION
                            System.out.printf("thread " + threadId + " :: SIM IN <=%n");//todo SIMULATION
                            System.out.printf("thread " + threadId + " :: SIM IN <=%n");//todo SIMULATION
                            _SIM_stat_REG_input_Sample.dyn_REG_set_Input_praiseId(praiseIdIndex);//todo process of input
                            System.out.printf("thread " + threadId + " :: <= : PraiseEventId: " + _SIM_stat_REG_input_Sample.dyn_REG_get_Input_praiseId() + ".%n");//todo SIMULATION
                            _SIM_stat_REG_input_Sample.dyn_REG_set_InputSubset(obj, _SIM_stat_REG_input_Sample.dyn_REG_get_Input_praiseId());//todo process of input
                            Input_praise0 subset_of_SIM_input_for_praise0 = null;
                            Input_praise1 subset_of_SIM_input_for_praise1 = null;
                            Input_praise2 subset_of_SIM_input_for_praise2 = null;
                            Input_praise3 subset_of_SIM_input_for_praise3 = null;
                            int[] thread_Listen_switch_C = null;
                            thread_Listen_switch_C = new int[2];
                            thread_Listen_switch_C = Global.stat_CONVERT_Long_To_twoInts(_SIM_stat_REG_input_Sample.dyn_REG_get_Input_praiseId());
                            System.out.printf("thread " + threadId + " :: <= : switch(" + thread_Listen_switch_C[0] + ", " + thread_Listen_switch_C[1] + ").%n");//todo SIMULATION
                            switch (thread_Listen_switch_C[0]) {
                                case 0:
                                    switch (thread_Listen_switch_C[1]) {
                                        case 0:
                                            try {
                                                subset_of_SIM_input_for_praise0 = (Input_praise0)_SIM_stat_REG_input_Sample.dyn_REG_get_InputSubset();//todo process of input
                                            } catch (NullPointerException e) {
                                                System.out.printf("thread " + threadId + " :: NullPointerException.%n");
                                            } catch (NoClassDefFoundError e) {
                                                System.out.printf("thread " + threadId + " :: NoClassDefFoundError.%n");
                                            } catch (ClassCastException e) {
                                                System.out.printf("thread " + threadId + " :: ClassCastException.%n");
                                            }
                                            subset_of_SIM_input_for_praise0.dyn_REG_set_input_praise0_valueA(2.2);//todo process of input
                                            subset_of_SIM_input_for_praise0.dyn_REG_set_input_praise0_valueB(3.7);//todo process of input
                                            System.out.printf("thread " + threadId + " :: <= : value_A: " + subset_of_SIM_input_for_praise0.dyn_REG_get_input_praise0_valueA() + ".%n");//todo SIMULATION
                                            System.out.printf("thread " + threadId + " :: <= : value_B: " + subset_of_SIM_input_for_praise0.dyn_REG_get_input_praise0_valueB() + ".%n");//todo SIMULATION
                                            break;

                                        case 1:
                                            try {
                                                subset_of_SIM_input_for_praise1 = (Input_praise1)_SIM_stat_REG_input_Sample.dyn_REG_get_InputSubset();//todo process of input
                                            } catch (NullPointerException e) {
                                                System.out.printf("thread " + threadId + " :: NullPointerException.%n");
                                            } catch (NoClassDefFoundError e) {
                                                System.out.printf("thread " + threadId + " :: NoClassDefFoundError.%n");
                                            } catch (ClassCastException e) {
                                                System.out.printf("thread " + threadId + " :: ClassCastException.%n");
                                            }
                                            subset_of_SIM_input_for_praise1.dyn_REG_set_input_praise1_valueA(2.2);//todo process of input
                                            subset_of_SIM_input_for_praise1.dyn_REG_set_input_praise1_valueB(3.7);//todo process of input
                                            System.out.printf("thread " + threadId + " :: <= : value_A: " + subset_of_SIM_input_for_praise1.dyn_REG_get_input_praise1_valueA() + ".%n");//todo SIMULATION
                                            System.out.printf("thread " + threadId + " :: <= : value_B: " + subset_of_SIM_input_for_praise1.dyn_REG_get_input_praise1_valueB() + ".%n");//todo SIMULATION
                                            break;

                                        case 2:
                                            try {
                                                subset_of_SIM_input_for_praise2 = (Input_praise2)_SIM_stat_REG_input_Sample.dyn_REG_get_InputSubset();//todo process of input
                                            } catch (NullPointerException e) {
                                                System.out.printf("thread " + threadId + " :: NullPointerException.%n");
                                            } catch (NoClassDefFoundError e) {
                                                System.out.printf("thread " + threadId + " :: NoClassDefFoundError.%n");
                                            } catch (ClassCastException e) {
                                                System.out.printf("thread " + threadId + " :: ClassCastException.%n");
                                            }
                                            subset_of_SIM_input_for_praise2.dyn_REG_set_input_praise2_valueA(2.2);//todo process of input
                                            subset_of_SIM_input_for_praise2.dyn_REG_set_input_praise2_valueB(3.7);//todo process of input
                                            System.out.printf("thread " + threadId + " :: <= : value_A: " + subset_of_SIM_input_for_praise2.dyn_REG_get_input_praise2_valueA() + ".%n");//todo SIMULATION
                                            System.out.printf("thread " + threadId + " :: <= : value_B: " + subset_of_SIM_input_for_praise2.dyn_REG_get_input_praise2_valueB() + ".%n");//todo SIMULATION
                                            break;

                                        case 3:
                                            try {
                                                subset_of_SIM_input_for_praise3 = (Input_praise3)_SIM_stat_REG_input_Sample.dyn_REG_get_InputSubset();//todo process of input
                                            } catch (NullPointerException e) {
                                                System.out.printf("thread " + threadId + " :: NullPointerException.%n");
                                            } catch (NoClassDefFoundError e) {
                                                System.out.printf("thread " + threadId + " :: NoClassDefFoundError.%n");
                                            } catch (ClassCastException e) {
                                                System.out.printf("thread " + threadId + " :: ClassCastException.%n");
                                            }
                                            subset_of_SIM_input_for_praise3.dyn_REG_set_input_praise3_valueA(2.2);//todo process of input
                                            subset_of_SIM_input_for_praise3.dyn_REG_set_input_praise3_valueB(3.7);//todo process of input
                                            System.out.printf("thread " + threadId + " :: <= : value_A: " + subset_of_SIM_input_for_praise3.dyn_REG_get_input_praise3_valueA() + ".%n");//todo SIMULATION
                                            System.out.printf("thread " + threadId + " :: <= : value_B: " + subset_of_SIM_input_for_praise3.dyn_REG_get_input_praise3_valueB() + ".%n");//todo SIMULATION
                                            break;

                                        default:
                                            System.out.printf("thread " + threadId + " :: empty case(" + thread_Listen_switch_C[0] + ", " + thread_Listen_switch_C[1] + ").%n");//todo SIMULATION
                                            break;
                                    }

                                case 2147483647:
                                    switch (thread_Listen_switch_C[1]) {
                                        case 2147483647:
                                            System.out.printf("thread " + threadId + " :: terminate program!%n");//todo SIMULATION
                                            obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_set_Flag_is_SystemInitialised(false);//TODO SIMULATION
                                            break;

                                        default:
                                            System.out.printf("thread " + threadId + " :: empty case(" + thread_Listen_switch_C[0] + ", " + thread_Listen_switch_C[1] + ").%n");//todo SIMULATION
                                            break;
                                    }
                                    break;

                                default:
                                    System.out.printf("thread " + threadId + " :: empty case(" + thread_Listen_switch_C[0] + ", " + thread_Listen_switch_C[1] + ").%n");//todo SIMULATION
                                    break;
                            }
                            obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_set_Flag_isWaitingOnPraiseReturn(_SIM_stat_REG_input_Sample.dyn_REG_get_Input_praiseId(), true);
                            _SIM_stat_REG_PraiseStarted[Math.toIntExact(_SIM_stat_REG_input_Sample.dyn_REG_get_Input_praiseId())] = true;//todo SIMULATION
                            System.out.printf("thread " + threadId + " :: => dyn_REG_set_flag__isNewInputReady(" + obj.dyn_STRUCT_get_IO_ListenRespond().dyn_REG_get_flag__isNewInputReady() + ")%n");//todo SIMULATION
                            obj.dyn_STRUCT_get_IO_ListenRespond().dyn_REG_set_flag__isNewInputReady(true);
                            System.out.printf("thread " + threadId + " :: SIM IN <=%n");//todo SIMULATION
                            System.out.printf("thread " + threadId + " :: SIM IN <=%n");//todo SIMULATION
                            System.out.printf("thread " + threadId + " :: SIM IN <=%n");//todo SIMULATION
                            System.out.printf("thread " + threadId + " :: SIM IN <=%n");//todo SIMULATION
                            System.out.printf("thread " + threadId + " :: SIM IN <=%n");//todo SIMULATION
                            System.out.printf("thread " + threadId + " :: SIM IN <=%n");//todo SIMULATION
                        }
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
                //while (OpenEpiCentre.CLIBConcurrentServerIO__dyn_REG_get_flag_isStackLoaded_ServerOutputSend()) {
                    System.out.printf("thread " + threadId + " :: loop iterator : while 'is' stack loaded at output.%n");//todo SIMULATION
                    if (obj.dyn_STRUCT_get_IO_ListenRespond().dyn_REG_get_flag__isNewOutputReady()) {
                        System.out.printf("thread " + threadId + " :: stat_REG_get_flag__isNewInputReady() => " + obj.dyn_STRUCT_get_IO_ListenRespond().dyn_REG_get_flag__isNewOutputReady() + ".%n");//todo SIMULATION
                        //if (obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_isWaitingOnPraiseReturn(_SIM_stat_REG_output_Sample.dyn_REG_get_Output_praiseId())) {
                            //System.out.printf("thread " + threadId + " :: CC : CLOSE ACCESS 'WriteQue_ConditionCode'.%n");//todo SIMULATION
                            //WriteQue_ConditionCode.app_FUNCT_write_End(2);//todo SIMULATION
                            _SIM_stat_REG_output_Sample = obj.dyn_STRUCT_get_Output();
                            System.out.printf("thread " + threadId + " :: SIM OUT =>%n");
                            System.out.printf("thread " + threadId + " :: SIM OUT =>%n");
                            System.out.printf("thread " + threadId + " :: SIM OUT =>%n");
                            System.out.printf("thread " + threadId + " :: SIM OUT =>%n");
                            System.out.printf("thread " + threadId + " :: SIM OUT =>%n");
                            System.out.printf("thread " + threadId + " :: SIM OUT =>%n");
                            System.out.printf("thread " + threadId + " :: <= : PraiseEventId: " + _SIM_stat_REG_output_Sample.dyn_REG_get_Output_praiseId() + ".%n");
                            int[] thread_Listen_switch_D = null;
                            thread_Listen_switch_D = new int[2];
                            thread_Listen_switch_D = Global.stat_CONVERT_Long_To_twoInts(_SIM_stat_REG_input_Sample.dyn_REG_get_Input_praiseId());
                            Output_praise0 output_subset0 = null;
                            Output_praise1 output_subset1 = null;
                            Output_praise2 output_subset2 = null;
                            Output_praise3 output_subset3 = null;
                            System.out.printf("thread " + threadId + " :: <= : switch(" + thread_Listen_switch_D[0] + ", " + thread_Listen_switch_D[1] + ").%n");//todo SIMULATION
                            switch (thread_Listen_switch_D[0]) {
                                case 0:
                                    switch (thread_Listen_switch_D[1]) {
                                        case 0:
                                            try {
                                                output_subset0 = (Output_praise0) _SIM_stat_REG_output_Sample.dyn_REG_get_OutputSubset();
                                            } catch (NullPointerException e) {
                                                System.out.printf("thread " + threadId + " :: NullPointerException.%n");
                                            } catch (NoClassDefFoundError e) {
                                                System.out.printf("thread " + threadId + " :: NoClassDefFoundError.%n");
                                            } catch (ClassCastException e) {
                                                System.out.printf("thread " + threadId + " :: ClassCastException.%n");
                                            }
                                            assert output_subset0 != null;
                                            System.out.printf("thread " + threadId + " :: <= : output subset0 value: " + output_subset0.dyn_REG_get_output_praise0_value() + ".%n");
                                            break;

                                        case 1:
                                            try {
                                                output_subset1 = (Output_praise1) _SIM_stat_REG_output_Sample.dyn_REG_get_OutputSubset();
                                            } catch (NullPointerException e) {
                                                System.out.printf("thread " + threadId + " :: NullPointerException.%n");
                                            } catch (NoClassDefFoundError e) {
                                                System.out.printf("thread " + threadId + " :: NoClassDefFoundError.%n");
                                            } catch (ClassCastException e) {
                                                System.out.printf("thread " + threadId + " :: ClassCastException.%n");
                                            }
                                            assert output_subset1 != null;
                                            System.out.printf("thread " + threadId + " :: <= : output subset1 value: " + output_subset1.dyn_REG_get_output_praise1_value() + ".%n");
                                            break;

                                        case 2:
                                            try {
                                                output_subset2 = (Output_praise2) _SIM_stat_REG_output_Sample.dyn_REG_get_OutputSubset();
                                            } catch (NullPointerException e) {
                                                System.out.printf("thread " + threadId + " :: NullPointerException.%n");
                                            } catch (NoClassDefFoundError e) {
                                                System.out.printf("thread " + threadId + " :: NoClassDefFoundError.%n");
                                            } catch (ClassCastException e) {
                                                System.out.printf("thread " + threadId + " :: ClassCastException.%n");
                                            }
                                            assert output_subset2 != null;
                                            System.out.printf("thread " + threadId + " :: <= : output subset2 value: " + output_subset2.dyn_REG_get_output_praise2_value() + ".%n");
                                            break;

                                        case 3:
                                            try {
                                                output_subset3 = (Output_praise3) _SIM_stat_REG_output_Sample.dyn_REG_get_OutputSubset();
                                            } catch (NullPointerException e) {
                                                System.out.printf("thread " + threadId + " :: NullPointerException.%n");
                                            } catch (NoClassDefFoundError e) {
                                                System.out.printf("thread " + threadId + " :: NoClassDefFoundError.%n");
                                            } catch (ClassCastException e) {
                                                System.out.printf("thread " + threadId + " :: ClassCastException.%n");
                                            }
                                            assert output_subset3 != null;
                                            System.out.printf("thread " + threadId + " :: <= : output subset3 value: " + output_subset3.dyn_REG_get_output_praise3_value() + ".%n");
                                            break;

                                        default:
                                            try {

                                            } catch (NullPointerException e) {
                                                System.out.printf("thread " + threadId + " :: NullPointerException.%n");
                                            } catch (NoClassDefFoundError e) {
                                                System.out.printf("thread " + threadId + " :: NoClassDefFoundError.%n");
                                            } catch (ClassCastException e) {
                                                System.out.printf("thread " + threadId + " :: ClassCastException.%n");
                                            }
                                            System.out.printf("thread " + threadId + " :: empty case(" + thread_Listen_switch_D[0] + ", " + thread_Listen_switch_D[1] + ").%n");//todo SIMULATION
                                            break;
                                    }

                                case 2147483647:
                                    switch (thread_Listen_switch_D[1]) {
                                        case 2147483647:

                                            break;

                                        default:
                                            System.out.printf("thread " + threadId + " :: empty case(" + thread_Listen_switch_D[0] + ", " + thread_Listen_switch_D[1] + ").%n");//todo SIMULATION
                                            break;
                                    }
                                    break;

                                default:
                                    try {

                                    } catch (NullPointerException e) {
                                        System.out.printf("thread " + threadId + " :: NullPointerException.%n");
                                    } catch (NoClassDefFoundError e) {
                                        System.out.printf("thread " + threadId + " :: NoClassDefFoundError.%n");
                                    } catch (ClassCastException e) {
                                        System.out.printf("thread " + threadId + " :: ClassCastException.%n");
                                    }
                                    System.out.printf("thread " + threadId + " :: empty case(" + thread_Listen_switch_D[0] + ", " + thread_Listen_switch_D[1] + ").%n");//todo SIMULATION
                                    break;
                            }
                            obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_set_Flag_isWaitingOnPraiseReturn(_SIM_stat_REG_input_Sample.dyn_REG_get_Input_praiseId(), false);
                            _SIM_stat_REG_PraiseComplete[Math.toIntExact(_SIM_stat_REG_input_Sample.dyn_REG_get_Input_praiseId())] = true;
                            if(obj.dyn_CLASS_get_SIMULATION().dyn_REG_get_FLAG_isSimulationComplete()) {
                                obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_set_Flag_is_SystemInitialised(false);//TODO SIMULATION
                            }
                            System.out.printf("thread " + threadId + " :: SIM OUT =>%n");
                            System.out.printf("thread " + threadId + " :: SIM OUT =>%n");
                            System.out.printf("thread " + threadId + " :: SIM OUT =>%n");
                            System.out.printf("thread " + threadId + " :: SIM OUT =>%n");
                            System.out.printf("thread " + threadId + " :: SIM OUT =>%n");
                            System.out.printf("thread " + threadId + " :: SIM OUT =>%n");
                            obj.dyn_STRUCT_get_IO_ListenRespond().dyn_REG_set_flag__isNewOutputReady(false);
                       // }
                    } else {
                        //System.out.printf("thread " + threadId + " :: CC : CLOSE ACCESS 'WriteQue_ConditionCode'.%n");//todo SIMULATION
                        //WriteQue_ConditionCode.app_FUNCT_write_End(2);//todo SIMULATION
                    }
                //}
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
    public static void Terminate_stat_REG_scanner() {
        _stat_REG_scanner.close();
    }
    public boolean dyn_REG_get_FLAG_isSimulationComplete()
    {
        boolean result = true;
        for(int i=0; i < 4; i++) {
            if(!_SIM_stat_REG_PraiseStarted[i]) {
                result = false;
                break;
            }
            if(!_SIM_stat_REG_PraiseComplete[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
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