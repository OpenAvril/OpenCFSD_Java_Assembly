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
    public void app_Thread_IO_Listen_Respond(Framework obj, int threadId) {
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
            System.out.printf("INSTANTIATION Thread: " + obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised() + ".%n");

            if(!OpenEpiCentre.app_FUNCT_get_flag_isPGM_INSTNATIATED())
            {
                obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_set_Flag_is_SystemInitialised(false);
            }
            System.out.printf("INSTANTIATION OpenEpiCentre: " + OpenEpiCentre.app_FUNCT_get_flag_isPGM_INSTNATIATED() + ".%n");

            if(!WriteQue_Simulation_IO.app_FUNCT_get_flag_isPGM_INSTNATIATED())
            {
                obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_set_Flag_is_SystemInitialised(false);
            }
            System.out.printf("INSTANTIATIO WriteQue_Simulation_IO: " + WriteQue_Simulation_IO.app_FUNCT_get_flag_isPGM_INSTNATIATED() + ".%n");
        }
        System.out.printf("System Initialised - starting loop for thread " + threadId + ".%n");

        while (obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised())
        {

        }
        obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().app_Terminate_All_Threads(obj);//SIMULATION
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
