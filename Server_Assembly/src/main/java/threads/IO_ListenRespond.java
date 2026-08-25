package threads;
import SIMULATION.Simulation;
import engine.Framework;
import engine.Global;
import libs.JavaLIB_OpenEpiCentre;
import main.IO.*;
import structs.Input;
import structs.Output;
import structs.praise_sets.*;

import static SIMULATION.Simulation._SIM_stat_REG_input_Sample;
import static SIMULATION.Simulation._SIM_stat_REG_output_Sample;

public class IO_ListenRespond {
    private static byte[] _stat_REG_Buffer_For_Input;
    private static byte[] _stat_REG_Buffer_For_Ouput;
    public static boolean _stat_REG_flag__isNewInputReady;
    public static boolean _stat_REG_flag__isNewOutputReady;

    // public.
    public IO_ListenRespond() {
        stat_CLASS_boot0_DECLAIRE_IO_ListenRespond();
        stat_REG_boot0_DECLAIRE_IO_ListenRespond();

        _stat_REG_Buffer_For_Input = null;
        _stat_REG_Buffer_For_Input = new byte[1024];
        for (int index = 0; index < _stat_REG_Buffer_For_Input.length; index++) {
            _stat_REG_Buffer_For_Input[index] = Byte.MAX_VALUE;
        }

        _stat_REG_Buffer_For_Ouput = null;
        _stat_REG_Buffer_For_Ouput = new byte[1024];
        for (int index = 0; index < _stat_REG_Buffer_For_Ouput.length; index++) {
            _stat_REG_Buffer_For_Ouput[index] = Byte.MAX_VALUE;
        }
    }

    public void dyn_App_Thread_IO(Framework obj, byte threadId) {
        System.out.printf("thread " + threadId + " :: Enter THREAD member function on thread.%n");
        boolean doneOnce = false;
        boolean checkPass = false;
        while (!checkPass) {
            WriteQue_ConditionCode.app_FUNCT_write_Start(0);
            System.out.printf("thread " + threadId + " :: IO - OUT => : OPEN ACCESS 'WriteQue_ConditionCode'.%n");//todo SIMULATION
            WriteQue_SimulationIO.app_FUNCT_write_Start(0);//todo SIMULATION
            System.out.printf("thread " + threadId + " :: IO - OUT => : OPEN ACCESS 'WriteQue_SimulationIO'.%n");//todo SIMULATION
            if (!doneOnce) {
                obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_set_Item_On_List_Of_Flag_ThreadInitialised(threadId, true);
                System.out.printf("thread " + threadId + " :: isThreadInitialised => " + obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Item_On_List_Of_Flag_ThreadInitialised(threadId) + ".%n");
                doneOnce = true;
            }
            WriteQue_SimulationIO.app_FUNCT_write_End(0);//todo SIMULATION
            System.out.printf("thread " + threadId + " :: IO - OUT => : CLOSE ACCESS 'WriteQue_SimulationIO'.%n");//todo SIMULATION
            WriteQue_ConditionCode.app_FUNCT_write_End(0);
            System.out.printf("thread " + threadId + " :: IO - OUT => : CLOSE ACCESS 'WriteQue_ConditionCode'.%n");//todo SIMULATION
            checkPass = true;
        }
        System.out.printf("thread " + threadId + " :: Initialised Thread.%n");
        checkPass = false;
        boolean temp = true;
        while (!checkPass) {
            WriteQue_ConditionCode.app_FUNCT_write_Start(0);
            System.out.printf("thread " + threadId + " :: IO - OUT => : OPEN ACCESS 'WriteQue_ConditionCode'.%n");//todo SIMULATION
            WriteQue_SimulationIO.app_FUNCT_write_Start(0);//todo SIMULATION
            System.out.printf("thread " + threadId + " :: IO - OUT => : OPEN ACCESS 'WriteQue_SimulationIO'.%n");//todo SIMULATION
            temp = true;
            for (byte index = 0; index < 3; index++) {
                if (!obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Item_On_List_Of_Flag_ThreadInitialised(index)) {
                    temp = false;
                }
            }
            if (!WriteQue_ConditionCode.app_FUNCT_get_flag_isPGM_INSTNATIATED()) {
                temp = false;
                System.out.printf("thread " + threadId + " :: PROGRAM NOT INSTANTIATED.%n");
            }
            if (!WriteQue_Simulation_InputSamples.app_FUNCT_get_flag_isPGM_INSTNATIATED()) {
                temp = false;
                System.out.printf("thread " + threadId + " :: PROGRAM NOT INSTANTIATED.%n");
            }
            if (!WriteQue_Simulation_OutputSamples.app_FUNCT_get_flag_isPGM_INSTNATIATED()) {
                temp = false;
                System.out.printf("thread " + threadId + " :: PROGRAM NOT INSTANTIATED.%n");
            }
            if (!WriteQue_SimulationIO.app_FUNCT_get_flag_isPGM_INSTNATIATED()) {
                temp = false;
                System.out.printf("thread " + threadId + " :: PROGRAM NOT INSTANTIATED.%n");
            }
            if (!OpenEpiCentre.CLIBConcurrentServerIO__app_FUNCT_get_flag_isPGM_INSTANTIATED()) {
                temp = false;
                System.out.printf("thread " + threadId + " :: PROGRAM NOT INSTANTIATED.%n");
            }
            obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_set_Flag_is_SystemInitialised(temp);
            if (obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised()) {
                checkPass = true;
            }
            WriteQue_SimulationIO.app_FUNCT_write_End(0);//todo SIMULATION
            System.out.printf("thread " + threadId + " :: IO - OUT => : CLOSE ACCESS 'WriteQue_SimulationIO'.%n");//todo SIMULATION
            WriteQue_ConditionCode.app_FUNCT_write_End(0);
            System.out.printf("thread " + threadId + " :: IO - OUT => : CLOSE ACCESS 'WriteQue_ConditionCode'.%n");//todo SIMULATION
        }
        System.out.printf("thread " + threadId + " :: Starting THREAD.%n");
        checkPass = false;
        while (!checkPass) {
            obj.dyn_STRUCT_get_IO_ListenRespond().dyn_App_Thread_Listen(obj, threadId);
            obj.dyn_STRUCT_get_IO_ListenRespond().dyn_App_Thread_Respond(obj, threadId);
            WriteQue_ConditionCode.app_FUNCT_write_Start(0);
            System.out.printf("thread " + threadId + " :: CC : OPEN ACCESS 'WriteQue_ConditionCode'.%n");//todo SIMULATION
            WriteQue_SimulationIO.app_FUNCT_write_Start(0);//todo SIMULATION
            System.out.printf("thread " + threadId + " :: OUTPUT : OPEN ACCESS 'WriteQue_SimulationIO'.%n");//todo SIMULATION
            if (!obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised()) {
                System.out.printf("thread " + threadId + " :: dyn_REG_get_Flag_is_SystemInitialised() => " + obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised() + ".%n");
                checkPass = true;
            }
            System.out.printf("thread " + threadId + " :: CC : CLOSE ACCESS 'WriteQue_SimulationIO' .%n");//todo SIMULATION
            WriteQue_ConditionCode.app_FUNCT_write_End(0);
            System.out.printf("thread " + threadId + " :: OUTPUT : CLOSE ACCESS 'WriteQue_SimulationIO'.%n");//todo SIMULATION
            WriteQue_SimulationIO.app_FUNCT_write_End(0);//todo SIMULATION
        }
        obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().app_Terminate_All_Threads(obj);
    }
        // private.
    private void app_Decode_NetworkingSteam_At_Server_Input_Recieve (Input input,byte[] buffer){
        byte[] temp = new byte[4];
        for (int index = 0; index < 4; index++) {
            temp[0] = buffer[0];
        }
        input.dyn_REG_set_Input_praiseId(Global.stat_CONVERT_ByteArray_To_Long(Global.stat_CONVERT_ByteArray_To_ReverseByteArray(temp)));
        switch ((int) input.dyn_REG_get_Input_praiseId()) {
            case 0:
                Input_praise0 subset_of_input_for_praise0 = (Input_praise0) input.dyn_REG_get_InputSubset();
                temp = new byte[4];
                for (int index = 0; index < 4; index++) {
                    temp[index] = buffer[4 + index];
                }
                subset_of_input_for_praise0.dyn_REG_set_input_praise0_valueA(Global.stat_CONVERT_ByteArray_To_Long(Global.stat_CONVERT_ByteArray_To_ReverseByteArray(temp)));
                temp = new byte[4];
                for (int index = 0; index < 4; index++) {
                    temp[index] = buffer[8 + index];
                }
                subset_of_input_for_praise0.dyn_REG_set_input_praise0_valueB(Global.stat_CONVERT_ByteArray_To_Double(Global.stat_CONVERT_ByteArray_To_ReverseByteArray(temp)));
                break;

            case 1:
                Input_praise1 subset_of_input_for_praise1 = (Input_praise1) input.dyn_REG_get_InputSubset();
                temp = new byte[4];
                for (int index = 0; index < 4; index++) {
                    temp[index] = buffer[4 + index];
                }
                subset_of_input_for_praise1.dyn_REG_set_input_praise1_valueA(Global.stat_CONVERT_ByteArray_To_Double(Global.stat_CONVERT_ByteArray_To_ReverseByteArray(temp)));
                temp = new byte[4];
                for (int index = 0; index < 4; index++) {
                    temp[index] = buffer[8 + index];
                }
                subset_of_input_for_praise1.dyn_REG_set_input_praise1_valueB(Global.stat_CONVERT_ByteArray_To_Double(Global.stat_CONVERT_ByteArray_To_ReverseByteArray(temp)));
                break;

            case 2:
                Input_praise2 subset_of_input_for_praise2 = (Input_praise2) input.dyn_REG_get_InputSubset();
                temp = new byte[4];
                for (int index = 0; index < 4; index++) {
                    temp[index] = buffer[4 + index];
                }
                subset_of_input_for_praise2.dyn_REG_set_input_praise2_valueA(Global.stat_CONVERT_ByteArray_To_Double(Global.stat_CONVERT_ByteArray_To_ReverseByteArray(temp)));
                temp = new byte[4];
                for (int index = 0; index < 4; index++) {
                    temp[index] = buffer[8 + index];
                }
                subset_of_input_for_praise2.dyn_REG_set_input_praise2_valueB(Global.stat_CONVERT_ByteArray_To_Double(Global.stat_CONVERT_ByteArray_To_ReverseByteArray(temp)));
                break;

            case 3:
                Input_praise3 subset_of_input_for_praise3 = (Input_praise3) input.dyn_REG_get_InputSubset();
                temp = new byte[4];
                for (int index = 0; index < 4; index++) {
                    temp[index] = buffer[4 + index];
                }
                subset_of_input_for_praise3.dyn_REG_set_input_praise3_valueA(Global.stat_CONVERT_ByteArray_To_Double(Global.stat_CONVERT_ByteArray_To_ReverseByteArray(temp)));
                temp = new byte[4];
                for (int index = 0; index < 4; index++) {
                    temp[index] = buffer[8 + index];
                }
                subset_of_input_for_praise3.dyn_REG_set_input_praise3_valueB(Global.stat_CONVERT_ByteArray_To_Double(Global.stat_CONVERT_ByteArray_To_ReverseByteArray(temp)));
                break;
        }
    }
    private void app_Encode_NetworkingSteam_At_Server_Output_Send (Framework obj, Output output,byte[] buffer){
        byte[] temp = Global.stat_CONVERT_ByteArray_To_ReverseByteArray(Global.stat_CONVERT_Long_To_ByteArray(output.dyn_REG_get_Output_praiseId()));
        for (int index = 0; index < 4; index++) {
            buffer[index] = temp[index];
        }
        output.dyn_REG_set_OutputSubset(obj, output.dyn_REG_get_Output_praiseId());
        switch ((int) output.dyn_REG_get_Output_praiseId()) {
            case 0:
                Output_praise0 subset_of_output_for_praise0 = (Output_praise0) output.dyn_REG_get_OutputSubset();
                temp = Global.stat_CONVERT_ByteArray_To_ReverseByteArray(Global.stat_CONVERT_Double_To_ByteArray(subset_of_output_for_praise0.dyn_REG_get_output_praise0_value()));
                for (int index = 0; index < 4; index++) {
                    buffer[index] = temp[index];
                }
                break;

            case 1:
                Output_praise1 subset_of_output_for_praise1 = (Output_praise1) output.dyn_REG_get_OutputSubset();
                temp = Global.stat_CONVERT_ByteArray_To_ReverseByteArray(Global.stat_CONVERT_Double_To_ByteArray(subset_of_output_for_praise1.dyn_REG_get_output_praise1_value()));
                for (int index = 0; index < 4; index++) {
                    buffer[index] = temp[index];
                }
                break;

            case 2:
                Output_praise2 subset_of_output_for_praise2 = (Output_praise2) output.dyn_REG_get_OutputSubset();
                temp = Global.stat_CONVERT_ByteArray_To_ReverseByteArray(Global.stat_CONVERT_Double_To_ByteArray(subset_of_output_for_praise2.dyn_REG_get_output_praise2_value()));
                for (int index = 0; index < 4; index++) {
                    buffer[index] = temp[index];
                }
                break;

            case 3:
                Output_praise3 subset_of_output_for_praise3 = (Output_praise3) output.dyn_REG_get_OutputSubset();
                temp = Global.stat_CONVERT_ByteArray_To_ReverseByteArray(Global.stat_CONVERT_Double_To_ByteArray(subset_of_output_for_praise3.dyn_REG_get_output_praise3_value()));
                for (int index = 0; index < 4; index++) {
                    buffer[index] = temp[index];
                }
                break;
        }
    }
    private void dyn_App_Thread_Listen (Framework obj,byte threadId) {
        WriteQue_ConditionCode.app_FUNCT_write_Start(0);
        //System.out.printf("thread " + threadId + " :: CC : ACCESS WriteQue_ConditionCode at Id=0.%n");//todo SIMULATION
        WriteQue_SimulationIO.app_FUNCT_write_Start(0);//todo SIMULATION
        //System.out.printf("thread " + threadId + " :: INPUT : ACCESS WriteQue_SimulationIO at Id=0.%n");//todo SIMULATION
        if (obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised()) {
            System.out.printf("thread " + threadId + " :: <= CC : udyn_REG_get_Flag_is_SystemInitialised() => " + obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised() + ".%n");//todo SIMULATION
            if (obj.dyn_STRUCT_get_IO_ListenRespond().dyn_REG_get_flag__isNewInputReady()) {
                System.out.printf("thread " + threadId + " :: <= CC : stat_REG_get_flag__isNewInputReady() => " + obj.dyn_STRUCT_get_IO_ListenRespond().dyn_REG_get_flag__isNewInputReady() + ".%n");//todo SIMULATION
                WriteQue_ConditionCode.app_FUNCT_write_End(0);
                //System.out.printf("thread " + threadId + " :: CC : CLOSE ACCESS 'WriteQue_ConditionCode'.%n");//todo SIMULATION
                //stat_App_Decode_NetworkingSteam_At_Server_Input_Recieve(obj, _SIM_stat_REG_input_Sample, stat_REG_get_Buffer__Input());
                //if (obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_isWaitingOnPraiseReturn(_SIM_stat_REG_input_Sample.dyn_REG_get_Input_praiseId())) {
                    System.out.printf("thread " + threadId + " :: IO - IN <=%n");//todo SIMULATION
                    System.out.printf("thread " + threadId + " :: IO - IN <=%n");//todo SIMULATION
                    System.out.printf("thread " + threadId + " :: IO - IN <=%n");//todo SIMULATION
                    System.out.printf("thread " + threadId + " :: IO - IN <=%n");//todo SIMULATION
                    System.out.printf("thread " + threadId + " :: IO - IN <=%n");//todo SIMULATION
                    System.out.printf("thread " + threadId + " :: IO - IN <=%n");//todo SIMULATION
                    OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_MetaData_PraiseEventId(_SIM_stat_REG_input_Sample.dyn_REG_get_Input_praiseId());
                    System.out.printf("thread " + threadId + " :: => LIB : OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_MetaData_PraiseEventId( " + _SIM_stat_REG_input_Sample.dyn_REG_get_Input_praiseId() + " ).%n");//todo SIMULATION
                    OpenEpiCentre.CLIBConcurrentServerIO__app_FUNCT_select_set_Intput_Subset(_SIM_stat_REG_input_Sample.dyn_REG_get_Input_praiseId());
                    Input_praise0 subset_of_input_for_praise0 = null;
                    Input_praise1 subset_of_input_for_praise1 = null;
                    Input_praise2 subset_of_input_for_praise2 = null;
                    Input_praise3 subset_of_input_for_praise3 = null;
                    int[] thread_Listen_switch_A = null;
                    thread_Listen_switch_A = new int[2];
                    thread_Listen_switch_A = Global.stat_CONVERT_Long_To_twoInts(_SIM_stat_REG_input_Sample.dyn_REG_get_Input_praiseId());
                    System.out.printf("thread " + threadId + " :: <= switch(" + thread_Listen_switch_A[0] + ", " + thread_Listen_switch_A[1] + ").%n");//todo SIMULATION
                    switch (thread_Listen_switch_A[0]) {
                        case 0:
                            switch (thread_Listen_switch_A[1]) {
                                case 0:
                                    try {
                                        subset_of_input_for_praise0 = (Input_praise0)_SIM_stat_REG_input_Sample.dyn_REG_get_InputSubset();
                                        OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise0_Value_A(subset_of_input_for_praise0.dyn_REG_get_input_praise0_valueA());
                                        OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise0_Value_B(subset_of_input_for_praise0.dyn_REG_get_input_praise0_valueB());
                                    } catch (NullPointerException e) {
                                        System.out.printf("thread " + threadId + " :: NullPointerException.%n");
                                    } catch (NoClassDefFoundError e) {
                                        System.out.printf("thread " + threadId + " :: NoClassDefFoundError.%n");
                                    } catch (ClassCastException e) {
                                        System.out.printf("thread " + threadId + " :: ClassCastException.%n");
                                    }
                                    break;

                                case 1:
                                    try {
                                        subset_of_input_for_praise1 = (Input_praise1) _SIM_stat_REG_input_Sample.dyn_REG_get_InputSubset();
                                        OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise1_Value_A(subset_of_input_for_praise1.dyn_REG_get_input_praise1_valueA());
                                        OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise1_Value_B(subset_of_input_for_praise1.dyn_REG_get_input_praise1_valueB());
                                    } catch (NullPointerException e) {
                                        System.out.printf("thread " + threadId + " :: NullPointerException.%n");
                                    } catch (NoClassDefFoundError e) {
                                        System.out.printf("thread " + threadId + " :: NoClassDefFoundError.%n");
                                    } catch (ClassCastException e) {
                                        System.out.printf("thread " + threadId + " :: ClassCastException.%n");
                                    }
                                    break;

                                case 2:
                                    try {
                                        subset_of_input_for_praise2 = (Input_praise2) _SIM_stat_REG_input_Sample.dyn_REG_get_InputSubset();
                                        OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise2_Value_A(subset_of_input_for_praise2.dyn_REG_get_input_praise2_valueA());
                                        OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise2_Value_B(subset_of_input_for_praise2.dyn_REG_get_input_praise2_valueB());
                                    } catch (NullPointerException e) {
                                        System.out.printf("thread " + threadId + " :: NullPointerException.%n");
                                    } catch (NoClassDefFoundError e) {
                                        System.out.printf("thread " + threadId + " :: NoClassDefFoundError.%n");
                                    } catch (ClassCastException e) {
                                        System.out.printf("thread " + threadId + " :: ClassCastException.%n");
                                    }
                                    break;

                                case 3:
                                    try {
                                        subset_of_input_for_praise3 = (Input_praise3) _SIM_stat_REG_input_Sample.dyn_REG_get_InputSubset();
                                        OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise3_Value_A(subset_of_input_for_praise3.dyn_REG_get_input_praise3_valueA());
                                        OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise3_Value_B(subset_of_input_for_praise3.dyn_REG_get_input_praise3_valueB());
                                    } catch (NullPointerException e) {
                                        System.out.printf("thread " + threadId + " :: NullPointerException.%n");
                                    } catch (NoClassDefFoundError e) {
                                        System.out.printf("thread " + threadId + " :: NoClassDefFoundError.%n");
                                    } catch (ClassCastException e) {
                                        System.out.printf("thread " + threadId + " :: ClassCastException.%n");
                                    }
                                    break;

                                default:
                                    System.out.printf("thread " + threadId + " :: done case(" + thread_Listen_switch_A[0] + ", " + thread_Listen_switch_A[1] + ").%n");//todo SIMULATION
                                    break;
                            }

                        case 2147483647:
                            switch (thread_Listen_switch_A[1]) {
                                case 2147483647:
                                    System.out.printf("thread " + threadId + " :: terminate program!%n");//todo SIMULATION
                                    break;

                                default:
                                    System.out.printf("thread " + threadId + " :: done case(" + thread_Listen_switch_A[0] + ", " + thread_Listen_switch_A[1] + ").%n");//todo SIMULATION
                                    break;
                            }
                            break;

                        default:
                            System.out.printf("thread " + threadId + " :: done case(" + thread_Listen_switch_A[0] + ", " + thread_Listen_switch_A[1] + ").%n");//todo SIMULATION
                            break;
                    }
                    OpenEpiCentre.CLIBConcurrentServerIO__app_FUNCT_flip_Input_DoubleBuffer();
                    OpenEpiCentre.CLIBConcurrentServerIO__app_FUNCT_push_To_STACK_Of_Input();
                    obj.dyn_STRUCT_get_IO_ListenRespond().dyn_REG_set_flag__isNewInputReady(false);
                    System.out.printf("thread " + threadId + " :: => CC : stat_REG_get_flag__isNewInputReady(" + obj.dyn_STRUCT_get_IO_ListenRespond().dyn_REG_get_flag__isNewInputReady() + ")%n");//todo SIMULATION
                    System.out.printf("thread " + threadId + " :: IO - IN <=%n");//todo SIMULATION
                    System.out.printf("thread " + threadId + " :: IO - IN <=%n");//todo SIMULATION
                    System.out.printf("thread " + threadId + " :: IO - IN <=%n");//todo SIMULATION
                    System.out.printf("thread " + threadId + " :: IO - IN <=%n");//todo SIMULATION
                    System.out.printf("thread " + threadId + " :: IO - IN <=%n");//todo SIMULATION
                    System.out.printf("thread " + threadId + " :: IO - IN <=%n");//todo SIMULATION
                //}
            } else {
                System.out.printf("thread " + threadId + " :: CC : CLOSE ACCESS 'WriteQue_SimulationIO'.%n");//todo SIMULATION
                WriteQue_ConditionCode.app_FUNCT_write_End(0);
            }
            System.out.printf("thread " + threadId + " :: INPUT : CLOSE ACCESS 'WriteQue_SimulationIO'.%n");//todo SIMULATION
            WriteQue_SimulationIO.app_FUNCT_write_End(0);//todo SIMULATION
        }
    }
    private void dyn_App_Thread_Respond(Framework obj, byte threadId) {
        WriteQue_ConditionCode.app_FUNCT_write_Start(0);
        System.out.printf("thread " + threadId + " :: IO - OUT : OEPN ACCESS 'WriteQue_ConditionCode'.%n");//todo SIMULATION
        WriteQue_SimulationIO.app_FUNCT_write_Start(0);//todo SIMULATION
        System.out.printf("thread " + threadId + " :: IO - OUT : OEEN ACCESS 'WriteQue_SimulationIO'.%n");//todo SIMULATION
        //System.out.printf("thread " + threadId + " CC : OPEN ACCESS WriteQue_SimulationIO at Id=0.%n");
        //WriteQue_ConditionCode.app_FUNCT_write_Start(0);
        if (OpenEpiCentre.CLIBConcurrentServerIO__dyn_REG_get_flag_isStackLoaded_ServerOutputSend()) {
            System.out.printf("thread " + threadId + " :: CLIBConcurrentServerIO__dyn_REG_get_flag_isStackLoaded_ServerOutputSend() = " + OpenEpiCentre.CLIBConcurrentServerIO__dyn_REG_get_flag_isStackLoaded_ServerOutputSend() + "%n");//todo SIMULATION
            if (!obj.dyn_STRUCT_get_IO_ListenRespond().dyn_REG_get_flag__isNewOutputReady()) {
                System.out.printf("thread " + threadId + " :: CC : dyn_REG_get_flag__isNewOutputReady() = " + obj.dyn_STRUCT_get_IO_ListenRespond().dyn_REG_get_flag__isNewOutputReady() + "%n");//todo SIMULATION
                //System.out.printf("thread " + threadId + " :: CC : CLOSE ACCESS WriteQue_ConditionCode at Id=0.%n");//todo SIMULATION
                //WriteQue_ConditionCode.app_FUNCT_write_End(0);
                OpenEpiCentre.CLIBConcurrentServerIO__app_FUNCT_pop_From_Stack_Of_Output();
                System.out.printf("thread " + threadId + " :: <= OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_get_MetaData_PraiseEventId() = " + OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_get_MetaData_PraiseEventId() + ".%n");//todo SIMULATION
                _SIM_stat_REG_output_Sample.dyn_REG_set_Output_praiseId(OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_get_MetaData_PraiseEventId());
                //if (obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_isWaitingOnPraiseReturn(_SIM_stat_REG_output_Sample.dyn_REG_get_Output_praiseId())) {
                    System.out.printf("thread " + threadId + " :: IO - OUT =>%n");//todo SIMULATION
                    System.out.printf("thread " + threadId + " :: IO - OUT =>%n");//todo SIMULATION
                    System.out.printf("thread " + threadId + " :: IO - OUT =>%n");//todo SIMULATION
                    System.out.printf("thread " + threadId + " :: IO - OUT =>%n");//todo SIMULATION
                    System.out.printf("thread " + threadId + " :: IO - OUT =>%n");//todo SIMULATION
                    System.out.printf("thread " + threadId + " :: IO - OUT =>%n");//todo SIMULATION
                    _SIM_stat_REG_output_Sample.dyn_REG_set_OutputSubset(obj, _SIM_stat_REG_output_Sample.dyn_REG_get_Output_praiseId());
                    Output_praise0 subset_of_output_for_praise0 = null;
                    Output_praise1 subset_of_output_for_praise1 = null;
                    Output_praise2 subset_of_output_for_praise2 = null;
                    Output_praise3 subset_of_output_for_praise3 = null;
                    int[] thread_Listen_switch_B = null;
                    thread_Listen_switch_B = new int[2];
                    thread_Listen_switch_B = Global.stat_CONVERT_Long_To_twoInts(_SIM_stat_REG_input_Sample.dyn_REG_get_Input_praiseId());
                    System.out.printf("thread " + threadId + " :: <= switch(" + thread_Listen_switch_B[0] + ", " + thread_Listen_switch_B[1] + ").%n");//todo SIMULATION
                    switch (thread_Listen_switch_B[0]) {
                        case 0:
                            switch (thread_Listen_switch_B[1]) {
                                case 0:
                                    try {
                                        subset_of_output_for_praise0 = (Output_praise0) _SIM_stat_REG_output_Sample.dyn_REG_get_OutputSubset();
                                        subset_of_output_for_praise0.dyn_REG_set_output_praise0_value(OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_get_Item_CLIB_OpenEpiCentre_STRUCT__Output_praise0_Value());
                                    } catch (NullPointerException e) {
                                        System.out.printf("thread " + threadId + " :: NullPointerException.%n");
                                    } catch (NoClassDefFoundError e) {
                                        System.out.printf("thread " + threadId + " :: NoClassDefFoundError.%n");
                                    } catch (ClassCastException e) {
                                        System.out.printf("thread " + threadId + " :: ClassCastException.%n");
                                    }
                                    obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_set_Flag_isWaitingOnPraiseReturn(0, false);
                                    break;

                                case 1:
                                    try {
                                        subset_of_output_for_praise1 = (Output_praise1) _SIM_stat_REG_output_Sample.dyn_REG_get_OutputSubset();
                                        subset_of_output_for_praise1.dyn_REG_set_output_praise1_value(OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_get_Item_CLIB_OpenEpiCentre_STRUCT__Output_praise1_Value());
                                    } catch (NullPointerException e) {
                                        System.out.printf("thread " + threadId + " :: NullPointerException.%n");
                                    } catch (NoClassDefFoundError e) {
                                        System.out.printf("thread " + threadId + " :: NoClassDefFoundError.%n");
                                    } catch (ClassCastException e) {
                                        System.out.printf("thread " + threadId + " :: ClassCastException.%n");
                                    }
                                    obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_set_Flag_isWaitingOnPraiseReturn(1, false);
                                    break;

                                case 2:
                                    try {
                                        subset_of_output_for_praise2 = (Output_praise2) _SIM_stat_REG_output_Sample.dyn_REG_get_OutputSubset();
                                        subset_of_output_for_praise2.dyn_REG_set_output_praise2_value(OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_get_Item_CLIB_OpenEpiCentre_STRUCT__Output_praise2_Value());
                                    } catch (NullPointerException e) {
                                        System.out.printf("thread " + threadId + " :: NullPointerException.%n");
                                    } catch (NoClassDefFoundError e) {
                                        System.out.printf("thread " + threadId + " :: NoClassDefFoundError.%n");
                                    } catch (ClassCastException e) {
                                        System.out.printf("thread " + threadId + " :: ClassCastException.%n");
                                    }
                                    obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_set_Flag_isWaitingOnPraiseReturn(2, false);
                                    break;

                                case 3:
                                    try {
                                        subset_of_output_for_praise3 = (Output_praise3) _SIM_stat_REG_output_Sample.dyn_REG_get_OutputSubset();
                                        subset_of_output_for_praise3.dyn_REG_set_output_praise3_value(OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_get_Item_CLIB_OpenEpiCentre_STRUCT__Output_praise3_Value());
                                    } catch (NullPointerException e) {
                                        System.out.printf("thread " + threadId + " :: NullPointerException.%n");
                                    } catch (NoClassDefFoundError e) {
                                        System.out.printf("thread " + threadId + " :: NoClassDefFoundError.%n");
                                    } catch (ClassCastException e) {
                                        System.out.printf("thread " + threadId + " :: ClassCastException.%n");
                                    }
                                    obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_set_Flag_isWaitingOnPraiseReturn(3, false);
                                    boolean checkPass = true;
                                    for (int index=0; index < 4; index++) {
                                        if(obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_isWaitingOnPraiseReturn(index)) {
                                            checkPass = false;
                                            break;
                                        }
                                    }
                                    if(!checkPass) {
                                        obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_set_Flag_is_SystemInitialised(false);//TODO SIMULATION EXIT
                                    }
                                    break;

                                default:
                                    System.out.printf("thread " + threadId + " :: empty case(" + thread_Listen_switch_B[0] + ", " + thread_Listen_switch_B[1] + ").%n");//todo SIMULATION
                                    break;
                            }

                        case 2147483647:
                            switch (thread_Listen_switch_B[1]) {
                                case 2147483647:
                                    System.out.printf("thread " + threadId + " :: terminate program!%n");//todo SIMULATION
                                    break;

                                default:
                                    System.out.printf("thread " + threadId + " :: empty case(" + thread_Listen_switch_B[0] + ", " + thread_Listen_switch_B[1] + ").%n");//todo SIMULATION
                                    break;
                            }
                            break;

                        default:
                            System.out.printf("thread " + threadId + " :: empty case(" + thread_Listen_switch_B[0] + ", " + thread_Listen_switch_B[1] + ").%n");//todo SIMULATION
                            break;
                    }
                    System.out.printf("thread " + threadId + " :: IO - OUT =>%n");//todo SIMULATION
                    System.out.printf("thread " + threadId + " :: IO - OUT =>%n");//todo SIMULATION
                    System.out.printf("thread " + threadId + " :: IO - OUT =>%n");//todo SIMULATION
                    System.out.printf("thread " + threadId + " :: IO - OUT =>%n");//todo SIMULATION
                    System.out.printf("thread " + threadId + " :: IO - OUT =>%n");//todo SIMULATION
                    System.out.printf("thread " + threadId + " :: IO - OUT =>%n");//todo SIMULATION
                    obj.dyn_STRUCT_get_IO_ListenRespond().dyn_REG_set_flag__isNewOutputReady(true);
                    //stat_App_Encode_NetworkingSteam_At_Server_Output_Send(obj, _SIM_stat_REG_output_Sample, stat_REG_get_Buffer__Ouput());//todo SIMULATION
               // }
            } else {
                //System.out.printf("thread " + threadId + " CC : CLOSE ACCESS WriteQue_SimulationIO at Id=0.%n");//todo SIMULATION
                //WriteQue_ConditionCode.app_FUNCT_write_End(0);//todo SIMULATION
            }
            System.out.printf("thread " + threadId + " :: IO - OUT : CLOSE ACCESS 'WriteQue_SimulationIO'.%n");//todo SIMULATION
            WriteQue_SimulationIO.app_FUNCT_write_End(0);//todo SIMULATION
            System.out.printf("thread " + threadId + " :: IO - OUT : CLOSE ACCESS 'WriteQue_ConditionCode'.%n");//todo SIMULATION
            WriteQue_ConditionCode.app_FUNCT_write_End(0);
        }
    }
    public void dyn_REG_boot1_DEFINE_IO_ListenRespond(Framework obj) {
        System.out.printf("entered dyn_REG_boot1_DEFINE_IO_ListenRespond().%n");
        stat_REG_boot1_DEFINE_Buffer__Input();
        stat_REG_boot1_DEFINE_Buffer__Ouput();
        System.out.printf("exiting dyn_REG_boot1_DEFINE_IO_ListenRespond().%n");
    }

    public void dyn_REG_boot2_SUBSTANTIATE_IO_ListenRespond(Framework obj) {
        System.out.printf("entered dyn_REG_boot2_SUBSTANTIATE_IO_ListenRespond().%n");
        stat_REG_boot2_SUBSTANTIATE_Buffer__Input();
        stat_REG_boot2_SUBSTANTIATE_Buffer__Ouput();
        stat_REG_boot2_SUBSTANTIATE_flag__isNewInputReady();
        stat_REG_boot2_SUBSTANTIATE_flag__isNewOutputReady();
        System.out.printf("exiting dyn_REG_boot2_SUBSTANTIATE_IO_ListenRespond().%n");
    }

    public void dyn_REG_boot3_INITIALISE_IO_ListenRespond(Framework obj, Input structDEFAULT_Input, Output structDEFAULT_Output) {
        System.out.printf("entered dyn_REG_boot3_INITIALISE_IO_ListenRespond().%n");
        stat_REG_boot3_INITIALISE_Buffer__Input(structDEFAULT_Input);
        stat_REG_boot3_INITIALISE_Buffer__Ouput(structDEFAULT_Output);
        stat_REG_boot3_INITIALISE_flag__isNewInputReady();
        stat_REG_boot3_INITIALISE_flag__isNewOutputReady();
        System.out.printf("exiting dyn_REG_boot3_INITIALISE_IO_ListenRespond().%n");
    }

    public byte[] dyn_REG_get_Buffer__Input() {
        return stat_REG_get_Buffer__Input();
    }

    public byte[] dyn_REG_get_Buffer__Ouput() {
        return stat_REG_get_Buffer__Ouput();
    }

    public boolean dyn_REG_get_flag__isNewInputReady() {
        return stat_REG_get_flag__isNewInputReady();
    }

    public boolean dyn_REG_get_flag__isNewOutputReady() {
        return stat_REG_get_flag__isNewOutputReady();
    }

    public void dyn_REG_set_flag__isNewInputReady(boolean value) {
        stat_REG_set_flag__isNewInputReady(value);
    }

    public void dyn_REG_set_flag__isNewOutputReady(boolean value) {
        stat_REG_set_flag__isNewOutputReady(value);
    }

    // private.
    private void stat_App_Decode_NetworkingSteam_At_Server_Input_Recieve(Framework obj, Input input, byte[] buffer) {
        byte[] temp = new byte[4];
        for (byte index = 0; index < 4; index++) {
            temp[0] = buffer[0];
        }
        input.dyn_REG_set_Input_praiseId(Global.stat_CONVERT_ByteArray_To_Long(Global.stat_CONVERT_ByteArray_To_ReverseByteArray(temp)));
        input.dyn_REG_set_InputSubset(obj, Global.stat_CONVERT_ByteArray_To_Long(Global.stat_CONVERT_ByteArray_To_ReverseByteArray(temp)));
        switch ((int) input.dyn_REG_get_Input_praiseId()) {
            case 0:
                Input_praise0 subset_of_input_for_praise0 = (Input_praise0) input.dyn_REG_get_InputSubset();
                temp = new byte[4];
                for (byte index = 0; index < 4; index++) {
                    temp[index] = buffer[4 + index];
                }
                subset_of_input_for_praise0.dyn_REG_set_input_praise0_valueA(Global.stat_CONVERT_ByteArray_To_Double(Global.stat_CONVERT_ByteArray_To_ReverseByteArray(temp)));
                temp = new byte[4];
                for (byte index = 0; index < 4; index++) {
                    temp[index] = buffer[8 + index];
                }
                subset_of_input_for_praise0.dyn_REG_set_input_praise0_valueB(Global.stat_CONVERT_ByteArray_To_Double(Global.stat_CONVERT_ByteArray_To_ReverseByteArray(temp)));
                break;

            case 1:
                Input_praise1 subset_of_input_for_praise1 = (Input_praise1) input.dyn_REG_get_InputSubset();
                temp = new byte[4];
                for (byte index = 0; index < 4; index++) {
                    temp[index] = buffer[4 + index];
                }
                subset_of_input_for_praise1.dyn_REG_set_input_praise1_valueA(Global.stat_CONVERT_ByteArray_To_Double(Global.stat_CONVERT_ByteArray_To_ReverseByteArray(temp)));
                temp = new byte[4];
                for (byte index = 0; index < 4; index++) {
                    temp[index] = buffer[8 + index];
                }
                subset_of_input_for_praise1.dyn_REG_set_input_praise1_valueB(Global.stat_CONVERT_ByteArray_To_Double(Global.stat_CONVERT_ByteArray_To_ReverseByteArray(temp)));
                break;

            case 2:
                Input_praise2 subset_of_input_for_praise2 = (Input_praise2) input.dyn_REG_get_InputSubset();
                temp = new byte[4];
                for (byte index = 0; index < 4; index++) {
                    temp[index] = buffer[4 + index];
                }
                subset_of_input_for_praise2.dyn_REG_set_input_praise2_valueA(Global.stat_CONVERT_ByteArray_To_Double(Global.stat_CONVERT_ByteArray_To_ReverseByteArray(temp)));
                temp = new byte[4];
                for (byte index = 0; index < 4; index++) {
                    temp[index] = buffer[8 + index];
                }
                subset_of_input_for_praise2.dyn_REG_set_input_praise2_valueB(Global.stat_CONVERT_ByteArray_To_Double(Global.stat_CONVERT_ByteArray_To_ReverseByteArray(temp)));
                break;

            case 3:
                Input_praise3 subset_of_input_for_praise3 = (Input_praise3) input.dyn_REG_get_InputSubset();
                temp = new byte[4];
                for (byte index = 0; index < 4; index++) {
                    temp[index] = buffer[4 + index];
                }
                subset_of_input_for_praise3.dyn_REG_set_input_praise3_valueA(Global.stat_CONVERT_ByteArray_To_Double(Global.stat_CONVERT_ByteArray_To_ReverseByteArray(temp)));
                temp = new byte[4];
                for (byte index = 0; index < 4; index++) {
                    temp[index] = buffer[8 + index];
                }
                subset_of_input_for_praise3.dyn_REG_set_input_praise3_valueB(Global.stat_CONVERT_ByteArray_To_Double(Global.stat_CONVERT_ByteArray_To_ReverseByteArray(temp)));
                break;
        }
    }

    private void stat_App_Encode_NetworkingSteam_At_Server_Output_Send(Framework obj, Output output, byte[] buffer) {
        byte[] temp = Global.stat_CONVERT_ByteArray_To_ReverseByteArray(Global.stat_CONVERT_Long_To_ByteArray(output.dyn_REG_get_Output_praiseId()));
        for (byte index = 0; index < 4; index++) {
            buffer[index] = temp[index];
        }
        output.dyn_REG_set_OutputSubset(obj, output.dyn_REG_get_Output_praiseId());
        switch ((int) output.dyn_REG_get_Output_praiseId()) {
            case 0:
                Output_praise0 subset_of_output_for_praise0 = (Output_praise0) output.dyn_REG_get_OutputSubset();
                temp = Global.stat_CONVERT_ByteArray_To_ReverseByteArray(Global.stat_CONVERT_Double_To_ByteArray(subset_of_output_for_praise0.dyn_REG_get_output_praise0_value()));
                for (byte index = 0; index < 4; index++) {
                    buffer[index] = temp[index];
                }
                break;

            case 1:
                Output_praise1 subset_of_output_for_praise1 = (Output_praise1) output.dyn_REG_get_OutputSubset();
                temp = Global.stat_CONVERT_ByteArray_To_ReverseByteArray(Global.stat_CONVERT_Double_To_ByteArray(subset_of_output_for_praise1.dyn_REG_get_output_praise1_value()));
                for (byte index = 0; index < 4; index++) {
                    buffer[index] = temp[index];
                }
                break;

            case 2:
                Output_praise2 subset_of_output_for_praise2 = (Output_praise2) output.dyn_REG_get_OutputSubset();
                temp = Global.stat_CONVERT_ByteArray_To_ReverseByteArray(Global.stat_CONVERT_Double_To_ByteArray(subset_of_output_for_praise2.dyn_REG_get_output_praise2_value()));
                for (byte index = 0; index < 4; index++) {
                    buffer[index] = temp[index];
                }
                break;

            case 3:
                Output_praise3 subset_of_output_for_praise3 = (Output_praise3) output.dyn_REG_get_OutputSubset();
                temp = Global.stat_CONVERT_ByteArray_To_ReverseByteArray(Global.stat_CONVERT_Double_To_ByteArray(subset_of_output_for_praise3.dyn_REG_get_output_praise3_value()));
                for (byte index = 0; index < 4; index++) {
                    buffer[index] = temp[index];
                }
                break;
        }
    }

    private static void stat_CLASS_boot0_DECLAIRE_IO_ListenRespond() {
        System.out.printf("entered stat_CLASS_boot0_DECLAIRE_IO_ListenRespond().%n");

        System.out.printf("exiting stat_CLASS_boot0_DECLAIRE_IO_ListenRespond().%n");
    }

    private static void stat_CLASS_boot1_DEFINE_IO_ListenRespond() {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_IO_ListenRespond().%n");

        System.out.printf("exiting stat_CLASS_boot1_DEFINE_IO_ListenRespond().%n");
    }

    private static void stat_CLASS_boot3_INITIALISE_IO_ListenRespond(Framework obj) {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_IO_ListenRespond().%n");

        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_IO_ListenRespond().%n");
    }

    private static void stat_REG_boot0_DECLAIRE_IO_ListenRespond() {
        System.out.printf("entered stat_REG_boot0_DECLAIRE_IO_ListenRespond().%n");

        System.out.printf("exiting stat_REG_boot0_DECLAIRE_IO_ListenRespond().%n");
    }

    private static void stat_REG_boot1_DEFINE_Buffer__Input() {
        System.out.printf("entered stat_REG_boot1_DEFINE_Buffer__Input().%n");
        _stat_REG_Buffer_For_Input = null;
        System.out.printf("exiting stat_REG_boot1_DEFINE_Buffer__Input().%n");
    }

    private static void stat_REG_boot1_DEFINE_Buffer__Ouput() {
        System.out.printf("entered stat_REG_boot1_DEFINE_Buffer__Ouput().%n");
        _stat_REG_Buffer_For_Ouput = null;
        System.out.printf("exiting stat_REG_boot1_DEFINE_Buffer__Ouput().%n");
    }

    private static void stat_REG_boot2_SUBSTANTIATE_Buffer__Input() {
        _stat_REG_Buffer_For_Input = new byte[1024];
        for (int index = 0; index < _stat_REG_Buffer_For_Input.length; index++) {
            _stat_REG_Buffer_For_Input[index] = Byte.MAX_VALUE;
        }
    }

    private static void stat_REG_boot2_SUBSTANTIATE_Buffer__Ouput() {
        _stat_REG_Buffer_For_Ouput = new byte[1024];
        for (int index = 0; index < _stat_REG_Buffer_For_Ouput.length; index++) {
            _stat_REG_Buffer_For_Ouput[index] = Byte.MAX_VALUE;
        }
    }

    private static void stat_REG_boot2_SUBSTANTIATE_flag__isNewInputReady() {
        _stat_REG_flag__isNewInputReady = true;
    }

    private static void stat_REG_boot2_SUBSTANTIATE_flag__isNewOutputReady() {
        _stat_REG_flag__isNewOutputReady = true;
    }

    private static void stat_REG_boot3_INITIALISE_Buffer__Input(Input structDEFAULT_Input) {
        for (int index = 0; index < _stat_REG_Buffer_For_Input.length; index++) {
            _stat_REG_Buffer_For_Input[index] = 0;
        }
    }

    private static void stat_REG_boot3_INITIALISE_Buffer__Ouput(Output structDEFAULT_Output) {
        for (int index = 0; index < _stat_REG_Buffer_For_Ouput.length; index++) {
            _stat_REG_Buffer_For_Ouput[index] = 0;
        }
    }

    private static void stat_REG_boot3_INITIALISE_flag__isNewInputReady() {
        _stat_REG_flag__isNewInputReady = false;
    }

    private static void stat_REG_boot3_INITIALISE_flag__isNewOutputReady() {
        _stat_REG_flag__isNewOutputReady = false;
    }

    private static byte[] stat_REG_get_Buffer__Input() {
        return _stat_REG_Buffer_For_Input;
    }

    private static byte[] stat_REG_get_Buffer__Ouput() {
        return _stat_REG_Buffer_For_Ouput;
    }

    private static boolean stat_REG_get_flag__isNewInputReady() {
        return _stat_REG_flag__isNewInputReady;
    }

    private static boolean stat_REG_get_flag__isNewOutputReady() {
        return _stat_REG_flag__isNewOutputReady;
    }

    private static void stat_REG_set_flag__isNewInputReady(boolean value) {
        _stat_REG_flag__isNewInputReady = value;
    }

    private static void stat_REG_set_flag__isNewOutputReady(boolean value) {
        _stat_REG_flag__isNewOutputReady = value;
    }
}