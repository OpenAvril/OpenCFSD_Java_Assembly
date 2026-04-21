package threads;
import engine.Framework;
import engine.Global;
import main.IO.*;
import structs.Input;
import structs.Output;
import structs.praisesubsets.*;
import SIMULATION.Simulation;

import java.util.Scanner;

public class IO_ListenRespond
{
    private static byte[] _stat_REG_Buffer_For_Input;
    private static byte[] _stat_REG_Buffer_For_Ouput;
    private static Input _stat_REG_input;
    private static Output _stat_REG_output;
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
    public void app_Thread_IO_Listen_Respond(Framework obj, int threadId)
    {
        System.out.printf("Enter THREAD member function on thread: " + threadId + ".%n");
        boolean doneOnce = false;
        while (!obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Item_On_List_Of_Flag_ThreadInitialised())
        {
            if (!doneOnce)
            {
                obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_set_Item_On_List_Of_Flag_ThreadInitialised(true);
                doneOnce = true;
            }
        }
        System.out.printf("Initialised Thread: " + threadId + ".%n");
        while (!obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised())
        {
            obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_set_Flag_is_SystemInitialised(true);
            for(int index = 0; index < Global.dyn_REG_get_numberOfCores(); index++)
            {
                if (!obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Item_On_List_Of_Flag_ThreadInitialised()) {
                    obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_set_Flag_is_SystemInitialised(false);
                    break;
                }
            }
            if(!WriteQue_SERVERINPUTRECIEVE.app_FUNCT_get_flag_isPGM_INSTNATIATED())
            {
                obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_set_Flag_is_SystemInitialised(false);
            }
            if(!LaunchQue_Server.app_FUNCT_get_flag_isPGM_INSTNATIATED())
            {
                obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_set_Flag_is_SystemInitialised(false);
            }
            if(!WriteQue_SERVEROUTPUTSEND.app_FUNCT_get_flag_isPGM_INSTNATIATED())
            {
                obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_set_Flag_is_SystemInitialised(false);
            }
            if(!OpenEpiCentre.app_FUNCT_get_flag_isPGM_INSTNATIATED())
            {
                obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_set_Flag_is_SystemInitialised(false);
            }
            if(!WriteQue_Simulation_IO.app_FUNCT_get_flag_isPGM_INSTNATIATED())
            {
                obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_set_Flag_is_SystemInitialised(false);
            }

        }
        System.out.printf("System Initialised - starting loop for thread " + threadId + ".%n");
        while (obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised())
        {
            WriteQue_Simulation_IO.app_FUNCT_write_Start(0);
            app_Do_Process_Of_Input(obj);
            WriteQue_Simulation_IO.app_FUNCT_write_End(0);
            if (OpenEpiCentre.dyn_REG_get_flag_isStackLoaded_Server_OutputSend())//SIMULATION
            {
                WriteQue_Simulation_IO.app_FUNCT_write_Start(1);
                app_Do_Process_Of_Output(obj);
                WriteQue_Simulation_IO.app_FUNCT_write_End(1);
            }
        }

    }
// private.
    private void app_Decode_NetworkingSteam_At_Server_Input_Recieve(Input input, byte[] buffer)
    {
        byte[] temp = new byte[4];
        for(int index = 0; index < 4; index++)
        {
            temp[0] = buffer[0];
        }
        input.dyn_REG_set_Input_praiseId(Global.stat_CONVERT_ByteArray_To_int(temp));
        switch (input.dyn_REG_get_Input_praiseId())
        {
            case 0:
                Input_praise0 subset_of_input_for_praise0 = (Input_praise0)input.dyn_REG_get_InputSubset();
                temp = new byte[4];
                for(int index = 0; index < 4; index++)
                {
                    temp[index] = buffer[4+index];
                }
                subset_of_input_for_praise0.dyn_REG_set_input_praise0_valueA(Global.stat_CONVERT_ByteArray_To_Float(temp));
                temp = new byte[4];
                for(int index = 0; index < 4; index++)
                {
                    temp[index] = buffer[8+index];
                }
                subset_of_input_for_praise0.dyn_REG_set_input_praise0_valueB(Global.stat_CONVERT_ByteArray_To_Float(temp));
                break;

            case 1:
                Input_praise1 subset_of_input_for_praise1 = (Input_praise1)input.dyn_REG_get_InputSubset();
                temp = new byte[4];
                for(int index = 0; index < 4; index++)
                {
                    temp[index] = buffer[4+index];
                }
                subset_of_input_for_praise1.dyn_REG_set_input_praise1_valueA(Global.stat_CONVERT_ByteArray_To_Float(temp));
                temp = new byte[4];
                for(int index = 0; index < 4; index++)
                {
                    temp[index] = buffer[8+index];
                }
                subset_of_input_for_praise1.dyn_REG_set_input_praise1_valueB(Global.stat_CONVERT_ByteArray_To_Float(temp));
                break;

            case 2:
                Input_praise2 subset_of_input_for_praise2 = (Input_praise2)input.dyn_REG_get_InputSubset();
                temp = new byte[4];
                for(int index = 0; index < 4; index++)
                {
                    temp[index] = buffer[4+index];
                }
                subset_of_input_for_praise2.dyn_REG_set_input_praise2_valueA(Global.stat_CONVERT_ByteArray_To_Float(temp));
                temp = new byte[4];
                for(int index = 0; index < 4; index++)
                {
                    temp[index] = buffer[8+index];
                }
                subset_of_input_for_praise2.dyn_REG_set_input_praise2_valueB(Global.stat_CONVERT_ByteArray_To_Float(temp));
                break;

            case 3:
                Input_praise3 subset_of_input_for_praise3 = (Input_praise3)input.dyn_REG_get_InputSubset();
                temp = new byte[4];
                for(int index = 0; index < 4; index++)
                {
                    temp[index] = buffer[4+index];
                }
                subset_of_input_for_praise3.dyn_REG_set_input_praise3_valueA(Global.stat_CONVERT_ByteArray_To_Float(temp));
                temp = new byte[4];
                for(int index = 0; index < 4; index++)
                {
                    temp[index] = buffer[8+index];
                }
                subset_of_input_for_praise3.dyn_REG_set_input_praise3_valueB(Global.stat_CONVERT_ByteArray_To_Float(temp));
                break;
        }
    }
    private void app_Do_Process_Of_Input(Framework obj)
    {
        WriteQue_SERVERINPUTRECIEVE.app_FUNCT_write_Start(0);
        _stat_REG_input = obj.dyn_STRUCT_get_Input();
        //_stat_REG_Buffer_For_Input = new byte[1024]; //todo network capture and write to buffer.
        //app_Decode_NetworkingSteam_At_Server_Input_Recieve(_stat_REG_input, _stat_REG_Buffer_For_Input);
        Simulation.Get_Praise_Event_Id_And_Data(_stat_REG_input);//SIMULATION
        OpenEpiCentre.app_FUNCT_select_set_Intput_Subset(_stat_REG_input.dyn_REG_get_Input_praiseId());
        switch (_stat_REG_input.dyn_REG_get_Input_praiseId())
        {
            case 0:
                Input_praise0 subset_of_input_for_praise0 = (Input_praise0)_stat_REG_input.dyn_REG_get_InputSubset();
                OpenEpiCentre.io_PRAISE_set_PraiseEventId(_stat_REG_input.dyn_REG_get_Input_praiseId());
                OpenEpiCentre.io_PRAISE_set_Item_Input_praise0_Value_A(subset_of_input_for_praise0.dyn_REG_get_input_praise0_valueA());
                OpenEpiCentre.io_PRAISE_set_Item_Input_praise0_Value_B(subset_of_input_for_praise0.dyn_REG_get_input_praise0_valueB());
                break;

            case 1:
                Input_praise1 subset_of_input_for_praise1 = (Input_praise1)_stat_REG_input.dyn_REG_get_InputSubset();
                OpenEpiCentre.io_PRAISE_set_PraiseEventId(_stat_REG_input.dyn_REG_get_Input_praiseId());
                OpenEpiCentre.io_PRAISE_set_Item_Input_praise0_Value_A(subset_of_input_for_praise1.dyn_REG_get_input_praise1_valueA());
                OpenEpiCentre.io_PRAISE_set_Item_Input_praise0_Value_B(subset_of_input_for_praise1.dyn_REG_get_input_praise1_valueB());
                break;

            case 2:
                Input_praise2 subset_of_input_for_praise2 = (Input_praise2)_stat_REG_input.dyn_REG_get_InputSubset();
                OpenEpiCentre.io_PRAISE_set_PraiseEventId(_stat_REG_input.dyn_REG_get_Input_praiseId());
                OpenEpiCentre.io_PRAISE_set_Item_Input_praise0_Value_A(subset_of_input_for_praise2.dyn_REG_get_input_praise2_valueA());
                OpenEpiCentre.io_PRAISE_set_Item_Input_praise0_Value_B(subset_of_input_for_praise2.dyn_REG_get_input_praise2_valueB());
                break;

            case 3:
                Input_praise3 subset_of_input_for_praise3 = (Input_praise3)_stat_REG_input.dyn_REG_get_InputSubset();
                OpenEpiCentre.io_PRAISE_set_PraiseEventId(_stat_REG_input.dyn_REG_get_Input_praiseId());
                OpenEpiCentre.io_PRAISE_set_Item_Input_praise0_Value_A(subset_of_input_for_praise3.dyn_REG_get_input_praise3_valueA());
                OpenEpiCentre.io_PRAISE_set_Item_Input_praise0_Value_B(subset_of_input_for_praise3.dyn_REG_get_input_praise3_valueB());
                break;
        }
        OpenEpiCentre.app_FUNCT_flip_Input_DoubleBuffer();
        OpenEpiCentre.app_FUNCT_push_To_STACK_Of_Input();
        WriteQue_SERVERINPUTRECIEVE.app_FUNCT_write_End(0);
    }
    private void app_Do_Process_Of_Output(Framework obj)
    {
        if(OpenEpiCentre.dyn_REG_get_flag_isStackLoaded_Server_OutputSend())
        {
            WriteQue_SERVEROUTPUTSEND.app_FUNCT_write_Start(0);
            _stat_REG_Buffer_For_Ouput = new byte[1024];
            _stat_REG_output = obj.dyn_STRUCT_get_Output();
            while(OpenEpiCentre.dyn_REG_get_flag_isStackLoaded_Server_OutputSend())
            {
                OpenEpiCentre.app_FUNCT_pop_From_Stack_Of_Output();
                _stat_REG_output.dyn_REG_set_Output_praiseId(OpenEpiCentre.io_RPRAISE_get_ptr_PraiseEventId());
                _stat_REG_output.dyn_REG_set_OutputSubset(obj, _stat_REG_output.dyn_REG_get_Output_praiseId());
                switch(_stat_REG_output.dyn_REG_get_Output_praiseId())
                {
                    case 0:
                        Output_praise0 subset_of_output_for_praise0 = (Output_praise0)_stat_REG_output.dyn_REG_get_OutputSubset();
                        subset_of_output_for_praise0.dyn_REG_set_output_praise0_value(OpenEpiCentre.io_PRAISE_get_Item_Output_praise0_Value());
                        break;

                    case 1:
                        Output_praise1 subset_of_output_for_praise1 = (Output_praise1)_stat_REG_output.dyn_REG_get_OutputSubset();
                        //subset_of_output_for_praise1.dyn_REG_set_output_praise1_value(OpenEpiCentre.io_PRAISE_get_Item_Output_praise1_Value());//todo
                        break;

                    case 2:
                        Output_praise0 subset_of_output_for_praise2 = (Output_praise0)_stat_REG_output.dyn_REG_get_OutputSubset();
                        //subset_of_output_for_praise2.dyn_REG_set_output_praise0_value(OpenEpiCentre.io_PRAISE_get_Item_Output_praise2_Value());//todo
                        break;

                    case 3:
                        Output_praise0 subset_of_output_for_praise3 = (Output_praise0)_stat_REG_output.dyn_REG_get_OutputSubset();
                        //subset_of_output_for_praise3.dyn_REG_set_output_praise0_value(OpenEpiCentre.io_PRAISE_get_Item_Output_praise3_Value());//todo
                        break;
                }
                app_Encode_NetworkingSteam_At_Server_Output_Send(obj, _stat_REG_output, _stat_REG_Buffer_For_Ouput);
                Simulation.Print_PraiseEvent(_stat_REG_output);
                //todo send.
            }
            WriteQue_SERVERINPUTRECIEVE.app_FUNCT_write_End(0);
        }
    }
    private void app_Encode_NetworkingSteam_At_Server_Output_Send(Framework obj, Output output, byte[] buffer)
    {
        byte[] temp = Global.stat_CONVERT_int_To_ByteArray(output.dyn_REG_get_Output_praiseId());
        for(int index = 0; index < 4; index++)
        {
            buffer[index] = temp[index];
        }
        output.dyn_REG_set_OutputSubset(obj, output.dyn_REG_get_Output_praiseId());
        switch (output.dyn_REG_get_Output_praiseId())
        {
            case 0:
                Output_praise0 subset_of_output_for_praise0 = (Output_praise0)output.dyn_REG_get_OutputSubset();
                temp = Global.stat_CONVERT_Double_To_ByteArray(subset_of_output_for_praise0.dyn_REG_get_output_praise0_value());
                for(int index = 0; index < 4; index++)
                {
                    buffer[index] = temp[index];
                }
                break;

            case 1:
                Output_praise1 subset_of_output_for_praise1 = (Output_praise1)output.dyn_REG_get_OutputSubset();
                //temp = Global.stat_CONVERT_Double_To_ByteArray(subset_of_output_for_praise1.dyn_REG_get_output_praise0_value());//todo.
                for(int index = 0; index < 4; index++)
                {
                    buffer[index] = temp[index];
                }
                break;

            case 2:
                Output_praise2 subset_of_output_for_praise2 = (Output_praise2)output.dyn_REG_get_OutputSubset();
                //temp = Global.stat_CONVERT_Double_To_ByteArray(subset_of_output_for_praise2.dyn_REG_get_output_praise0_value());//todo.
                for(int index = 0; index < 4; index++)
                {
                    buffer[index] = temp[index];
                }
                break;

            case 3:
                Output_praise3 subset_of_output_for_praise3 = (Output_praise3)output.dyn_REG_get_OutputSubset();
                //temp = Global.stat_CONVERT_Double_To_ByteArray(subset_of_output_for_praise3.dyn_REG_get_output_praise0_value());//todo.
                for(int index = 0; index < 4; index++)
                {
                    buffer[index] = temp[index];
                }
                break;
        }
    }
}
