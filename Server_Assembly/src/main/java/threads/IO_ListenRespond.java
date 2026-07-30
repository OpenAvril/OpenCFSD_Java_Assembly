package threads;
import engine.Framework;
import engine.Global;
import main.IO.*;
import structs.Input;
import structs.Output;
import structs.praisesubsets.*;
import SIMULATION.Simulation;

import java.util.Scanner;

import static SIMULATION.Simulation._SIM_stat_REG_input_Sample;
import static SIMULATION.Simulation._SIM_stat_REG_output_Sample;

public class IO_ListenRespond
{
    private static byte[] _stat_REG_Buffer_For_Input;
    private static byte[] _stat_REG_Buffer_For_Ouput;

// public.
    public IO_ListenRespond()
    {
        _stat_REG_Buffer_For_Input = null;
        _stat_REG_Buffer_For_Input = new byte[1024];
        for(int index = 0; index < _stat_REG_Buffer_For_Input.length; index++)
        {
            _stat_REG_Buffer_For_Input[index] = Byte.MAX_VALUE;
        }

        _stat_REG_Buffer_For_Ouput = null;
        _stat_REG_Buffer_For_Ouput = new byte[1024];
        for(int index = 0; index < _stat_REG_Buffer_For_Ouput.length; index++)
        {
            _stat_REG_Buffer_For_Ouput[index] = Byte.MAX_VALUE;
        }
    }
    public void dyn_App_Thread_IO_Listen_Respond(Framework obj, byte threadId) {
        System.out.printf("thread " + threadId + ": Enter THREAD member function on thread.%n");
        boolean doneOnce = false;
        boolean checkPass = false;
        while(!checkPass) {
            WriteQue_SimulationIO.app_FUNCT_write_Start(0);
            WriteQue_ConditionCode.app_FUNCT_write_Start(0);
            if(!doneOnce)
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
            WriteQue_ConditionCode.app_FUNCT_write_End(0);
            WriteQue_SimulationIO.app_FUNCT_write_End(0);
        }
        System.out.printf("thread " + threadId + ": Initialised Thread.%n");
        checkPass = false;
        boolean temp = true;
        while(!checkPass) {
            WriteQue_SimulationIO.app_FUNCT_write_Start(0);
            WriteQue_ConditionCode.app_FUNCT_write_Start(0);
            if(!obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised()) {
                WriteQue_ConditionCode.app_FUNCT_write_End(0);
                temp = true;
                if(!WriteQue_ConditionCode.app_FUNCT_get_flag_isPGM_INSTNATIATED()) {
                    temp = false;
                    System.out.printf("thread " + threadId + ": PROGRAM NOT INSTANTIATED.%n");
                }
                if(!WriteQue_Simulation_InputSamples.app_FUNCT_get_flag_isPGM_INSTNATIATED()) {
                    temp = false;
                    System.out.printf("thread " + threadId + ": PROGRAM NOT INSTANTIATED.%n");
                }
                if(!WriteQue_Simulation_OutputSamples.app_FUNCT_get_flag_isPGM_INSTNATIATED()) {
                    temp = false;
                    System.out.printf("thread " + threadId + ": PROGRAM NOT INSTANTIATED.%n");
                }
                if(!WriteQue_SimulationIO.app_FUNCT_get_flag_isPGM_INSTNATIATED()) {
                    temp = false;
                    System.out.printf("thread " + threadId + ": PROGRAM NOT INSTANTIATED.%n");
                }
                if(!OpenEpiCentre.CLIBConcurrentServerIO__app_FUNCT_get_flag_isPGM_INSTANTIATED()) {
                    temp = false;
                    System.out.printf("thread " + threadId + ": PROGRAM NOT INSTANTIATED.%n");
                }
            }
            obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_set_Flag_is_SystemInitialised(temp);
            if(obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised()) {
                checkPass = true;
            }
            WriteQue_ConditionCode.app_FUNCT_write_End(0);
            WriteQue_SimulationIO.app_FUNCT_write_End(0);
        }
        System.out.printf("thread " + threadId + ": FLAG SystemInitialised() => " + obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised() + ".%n");
        System.out.printf("thread " + threadId + ": System Initialised.%n");
        System.out.printf("thread " + threadId + ": System Instantiated.%n");
        System.out.printf("thread " + threadId + ": Starting THREAD.%n");
        checkPass = false;
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        while(!checkPass) {
            WriteQue_SimulationIO.app_FUNCT_write_Start(0);
            if(obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised()) {
                System.out.printf("thread " + threadId + " INPUT: ACCESS WriteQue_SimulationIO at Id=0.%n");
                if (stat_REG_get_flag__isNewInputReady()) {
                    //stat_App_Decode_NetworkingSteam_At_Server_Input_Recieve(obj, _SIM_stat_REG_input_Sample, stat_REG_get_Buffer__Input());
                    OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_MetaData_PraiseEventId(_SIM_stat_REG_input_Sample.dyn_REG_get_Input_praiseId());
                    OpenEpiCentre.CLIBConcurrentServerIO__app_FUNCT_select_set_Intput_Subset(_SIM_stat_REG_input_Sample.dyn_REG_get_Input_praiseId());
                    switch (_SIM_stat_REG_input_Sample.dyn_REG_get_Input_praiseId())
                    {
                        case (int)0:
                            Input_praise0 subset_of_input_for_praise0 = (Input_praise0)_SIM_stat_REG_input_Sample.dyn_REG_get_InputSubset();
                            OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise0_Value_A(subset_of_input_for_praise0.dyn_REG_get_input_praise0_valueA());
                            OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise0_Value_B(subset_of_input_for_praise0.dyn_REG_get_input_praise0_valueB());
                            break;

                        case (int)1:
                            Input_praise1 subset_of_input_for_praise1 = (Input_praise1)_SIM_stat_REG_input_Sample.dyn_REG_get_InputSubset();
                            OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise0_Value_A(subset_of_input_for_praise1.dyn_REG_get_input_praise1_valueA());
                            OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise0_Value_B(subset_of_input_for_praise1.dyn_REG_get_input_praise1_valueB());
                            break;

                        case (int)2:
                            Input_praise2 subset_of_input_for_praise2 = (Input_praise2)_SIM_stat_REG_input_Sample.dyn_REG_get_InputSubset();
                            OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise0_Value_A(subset_of_input_for_praise2.dyn_REG_get_input_praise2_valueA());
                            OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise0_Value_B(subset_of_input_for_praise2.dyn_REG_get_input_praise2_valueB());
                            break;

                        case (int)3:
                            Input_praise3 subset_of_input_for_praise3 = (Input_praise3)_SIM_stat_REG_input_Sample.dyn_REG_get_InputSubset();
                            OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise0_Value_A(subset_of_input_for_praise3.dyn_REG_get_input_praise3_valueA());
                            OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_set_Item_Input_praise0_Value_B(subset_of_input_for_praise3.dyn_REG_get_input_praise3_valueB());
                            break;
                    }
                    OpenEpiCentre.CLIBConcurrentServerIO__app_FUNCT_flip_Input_DoubleBuffer();
                    OpenEpiCentre.CLIBConcurrentServerIO__app_FUNCT_push_To_STACK_Of_Input();
                }
                System.out.printf("thread " + threadId + " INPUT: CLOSE ACCESS WriteQue_SimulationIO at Id=0.%n");
                WriteQue_SimulationIO.app_FUNCT_write_End(0);

                WriteQue_SimulationIO.app_FUNCT_write_Start(0);
                System.out.printf("thread " + threadId + " OUTPUT: ACCESS WriteQue_SimulationIO at Id=0.%n");
                if (OpenEpiCentre.CLIBConcurrentServerIO__dyn_REG_get_flag_isStackLoaded_ServerOutputSend()) {
                    OpenEpiCentre.CLIBConcurrentServerIO__app_FUNCT_pop_From_Stack_Of_Output();
                    _SIM_stat_REG_output_Sample.dyn_REG_set_Output_praiseId(OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_get_MetaData_PraiseEventId());
                    _SIM_stat_REG_output_Sample.dyn_REG_set_OutputSubset(obj, OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_get_MetaData_PraiseEventId());
                    switch (OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_get_MetaData_PraiseEventId())
                    {
                        case (int)0:
                            Output_praise0 subset_of_output_for_praise0 = (Output_praise0)_SIM_stat_REG_output_Sample.dyn_REG_get_OutputSubset();
                            subset_of_output_for_praise0.dyn_REG_set_output_praise0_value(OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_get_Item_CLIB_OpenEpiCentre_STRUCT__Output_praise0_Value());
                            break;

                        case (int)1:
                            Output_praise1 subset_of_output_for_praise1 = (Output_praise1)_SIM_stat_REG_output_Sample.dyn_REG_get_OutputSubset();
                            subset_of_output_for_praise1.dyn_REG_set_output_praise1_value(OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_get_Item_CLIB_OpenEpiCentre_STRUCT__Output_praise1_Value());
                            break;

                        case (int)2:
                            Output_praise2 subset_of_output_for_praise2 = (Output_praise2)_SIM_stat_REG_output_Sample.dyn_REG_get_OutputSubset();
                            subset_of_output_for_praise2.dyn_REG_set_output_praise2_value(OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_get_Item_CLIB_OpenEpiCentre_STRUCT__Output_praise0_Value());
                            break;

                        case (int)3:
                            Output_praise3 subset_of_output_for_praise3 = (Output_praise3)_SIM_stat_REG_output_Sample.dyn_REG_get_OutputSubset();
                            subset_of_output_for_praise3.dyn_REG_set_output_praise3_value(OpenEpiCentre.CLIBConcurrentServerIO__io_PRAISE_get_Item_CLIB_OpenEpiCentre_STRUCT__Output_praise0_Value());
                            break;
                    }
                    //stat_App_Encode_NetworkingSteam_At_Server_Output_Send(obj, _SIM_stat_REG_output_Sample, stat_REG_get_Buffer__Ouput());
                }
            }
            WriteQue_ConditionCode.app_FUNCT_write_Start(0);
            if(!obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised()) {
                checkPass = true;
            }
            WriteQue_ConditionCode.app_FUNCT_write_End(0);
            System.out.printf("thread " + threadId + " OUTPUT: CLOSE ACCESS WriteQue_SimulationIO at Id=0.%n");
            WriteQue_SimulationIO.app_FUNCT_write_End(0);
        }
        obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().app_Terminate_All_Threads(obj);
    }
// private.
    private void app_Decode_NetworkingSteam_At_Server_Input_Recieve(Input input, byte[] buffer)
    {
        byte[] temp = new byte[4];
        for(int index = 0; index < 4; index++)
        {
            temp[0] = buffer[0];
        }
        input.dyn_REG_set_Input_praiseId(Global.stat_CONVERT_LsbByteArray_To_LsbInt(Global.stat_CONVERT_MsbByteArray_To_LsbByteArray(temp)));
        switch (input.dyn_REG_get_Input_praiseId())
        {
            case 0:
                Input_praise0 subset_of_input_for_praise0 = (Input_praise0)input.dyn_REG_get_InputSubset();
                temp = new byte[4];
                for(int index = 0; index < 4; index++)
                {
                    temp[index] = buffer[4+index];
                }
                subset_of_input_for_praise0.dyn_REG_set_input_praise0_valueA(Global.stat_CONVERT_LsbByteArray_To_LsbFloat(Global.stat_CONVERT_MsbByteArray_To_LsbByteArray(temp)));
                temp = new byte[4];
                for(int index = 0; index < 4; index++)
                {
                    temp[index] = buffer[8+index];
                }
                subset_of_input_for_praise0.dyn_REG_set_input_praise0_valueB(Global.stat_CONVERT_LsbByteArray_To_LsbFloat(Global.stat_CONVERT_MsbByteArray_To_LsbByteArray(temp)));
                break;

            case 1:
                Input_praise1 subset_of_input_for_praise1 = (Input_praise1)input.dyn_REG_get_InputSubset();
                temp = new byte[4];
                for(int index = 0; index < 4; index++)
                {
                    temp[index] = buffer[4+index];
                }
                subset_of_input_for_praise1.dyn_REG_set_input_praise1_valueA(Global.stat_CONVERT_LsbByteArray_To_LsbFloat(Global.stat_CONVERT_MsbByteArray_To_LsbByteArray(temp)));
                temp = new byte[4];
                for(int index = 0; index < 4; index++)
                {
                    temp[index] = buffer[8+index];
                }
                subset_of_input_for_praise1.dyn_REG_set_input_praise1_valueB(Global.stat_CONVERT_LsbByteArray_To_LsbFloat(Global.stat_CONVERT_MsbByteArray_To_LsbByteArray(temp)));
                break;

            case 2:
                Input_praise2 subset_of_input_for_praise2 = (Input_praise2)input.dyn_REG_get_InputSubset();
                temp = new byte[4];
                for(int index = 0; index < 4; index++)
                {
                    temp[index] = buffer[4+index];
                }
                subset_of_input_for_praise2.dyn_REG_set_input_praise2_valueA(Global.stat_CONVERT_LsbByteArray_To_LsbFloat(Global.stat_CONVERT_MsbByteArray_To_LsbByteArray(temp)));
                temp = new byte[4];
                for(int index = 0; index < 4; index++)
                {
                    temp[index] = buffer[8+index];
                }
                subset_of_input_for_praise2.dyn_REG_set_input_praise2_valueB(Global.stat_CONVERT_LsbByteArray_To_LsbFloat(Global.stat_CONVERT_MsbByteArray_To_LsbByteArray(temp)));
                break;

            case 3:
                Input_praise3 subset_of_input_for_praise3 = (Input_praise3)input.dyn_REG_get_InputSubset();
                temp = new byte[4];
                for(int index = 0; index < 4; index++)
                {
                    temp[index] = buffer[4+index];
                }
                subset_of_input_for_praise3.dyn_REG_set_input_praise3_valueA(Global.stat_CONVERT_LsbByteArray_To_LsbFloat(Global.stat_CONVERT_MsbByteArray_To_LsbByteArray(temp)));
                temp = new byte[4];
                for(int index = 0; index < 4; index++)
                {
                    temp[index] = buffer[8+index];
                }
                subset_of_input_for_praise3.dyn_REG_set_input_praise3_valueB(Global.stat_CONVERT_LsbByteArray_To_LsbFloat(Global.stat_CONVERT_MsbByteArray_To_LsbByteArray(temp)));
                break;
        }
    }

    private void app_Encode_NetworkingSteam_At_Server_Output_Send(Framework obj, Output output, byte[] buffer)
    {
        byte[] temp = Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(Global.stat_CONVERT_LsbInt_To_LsbByteArray(output.dyn_REG_get_Output_praiseId()));
        for(int index = 0; index < 4; index++)
        {
            buffer[index] = temp[index];
        }
        output.dyn_REG_set_OutputSubset(obj, output.dyn_REG_get_Output_praiseId());
        switch (output.dyn_REG_get_Output_praiseId())
        {
            case 0:
                Output_praise0 subset_of_output_for_praise0 = (Output_praise0)output.dyn_REG_get_OutputSubset();
                temp = Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(Global.stat_CONVERT_LsbDouble_To_LsbByteArray(subset_of_output_for_praise0.dyn_REG_get_output_praise0_value()));
                for(int index = 0; index < 4; index++)
                {
                    buffer[index] = temp[index];
                }
                break;

            case 1:
                Output_praise1 subset_of_output_for_praise1 = (Output_praise1)output.dyn_REG_get_OutputSubset();
                temp = Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(Global.stat_CONVERT_LsbDouble_To_LsbByteArray(subset_of_output_for_praise1.dyn_REG_get_output_praise1_value()));
                for(int index = 0; index < 4; index++)
                {
                    buffer[index] = temp[index];
                }
                break;

            case 2:
                Output_praise2 subset_of_output_for_praise2 = (Output_praise2)output.dyn_REG_get_OutputSubset();
                temp = Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(Global.stat_CONVERT_LsbDouble_To_LsbByteArray(subset_of_output_for_praise2.dyn_REG_get_output_praise2_value()));
                for(int index = 0; index < 4; index++)
                {
                    buffer[index] = temp[index];
                }
                break;

            case 3:
                Output_praise3 subset_of_output_for_praise3 = (Output_praise3)output.dyn_REG_get_OutputSubset();
                temp = Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(Global.stat_CONVERT_LsbDouble_To_LsbByteArray(subset_of_output_for_praise3.dyn_REG_get_output_praise3_value()));
                for(int index = 0; index < 4; index++)
                {
                    buffer[index] = temp[index];
                }
                break;
        }
    }
}
