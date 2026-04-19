package threads;
import engine.Framework;
import engine.Global;
import main.IO.OpenEpiCentre;
import main.IO.WriteQue_SERVERINPUTRECIEVE;
import structs.Input;
import structs.Output;
import structs.praisesubsets.Input_praise0;
import structs.praisesubsets.Output_praise0;

public class IO_ListenRespond
{
// public.
    public IO_ListenRespond()
    {
        
    }
    public void app_Thread_IO_Listen_Respond(Framework obj, int threadId)
    {
        boolean doneOnce = true;
        while (obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Item_On_List_Of_Flag_ThreadInitialised())
        {
            if (doneOnce)
            {
                doneOnce = false;
            }
        }
        while (obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised())
        {

        }
        while (!obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised())
        {
            app_Do_Process_Of_Input(obj);
            app_Do_Process_Of_Output(obj);
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

                break;
        }
    }
    private void app_Do_Process_Of_Input(Framework obj)
    {
        byte[] buffer = new byte[1024];//TESTBENCH
        Input input = new Input();
        app_Decode_NetworkingSteam_At_Server_Input_Recieve(input, buffer);
        OpenEpiCentre.app_FUNCT_select_set_Intput_Subset(input.dyn_REG_get_Input_praiseId());
        switch (input.dyn_REG_get_Input_praiseId())
        {
            case 0:
                Input_praise0 subset_of_input_for_praise0 = (Input_praise0)input.dyn_REG_get_InputSubset();
                OpenEpiCentre.io_PRAISE_set_PraiseEventId(input.dyn_REG_get_Input_praiseId());
                OpenEpiCentre.io_PRAISE_set_Item_Input_praise0_Value_A(subset_of_input_for_praise0.dyn_REG_get_input_praise0_valueA());
                OpenEpiCentre.io_PRAISE_set_Item_Input_praise0_Value_B(subset_of_input_for_praise0.dyn_REG_get_input_praise0_valueB());
                break;

            case 1:

                break;
        }
        OpenEpiCentre.app_FUNCT_flip_Input_DoubleBuffer();
        OpenEpiCentre.app_FUNCT_push_To_STACK_Of_Input();
    }
    private void app_Do_Process_Of_Output(Framework obj)
    {
        byte[] buffer = new byte[1024];
        Output output = new Output();
        WriteQue_SERVERINPUTRECIEVE.app_FUNCT_write_Start(0);

        app_Encode_NetworkingSteam_At_Server_Output_Send(obj, output, buffer);
    }
    private void app_Encode_NetworkingSteam_At_Server_Output_Send(Framework obj, Output output, byte[] buffer)
    {
        byte[] temp = Global.stat_CONVERT_int_To_ByteArray(output.dyn_REG_get_Output_praiseId());
        for(int index = 0; index < 4; index++)
        {
            buffer[index] = temp[index];
        }

        output.dyn_CLASS_get_Output_Control().SelectSetOutputSubset(output, obj.dyn_STRUCT_get_User_Output(), output.dyn_REG_get_Output_praiseId());
        switch (output.dyn_REG_get_Output_praiseId())
        {
            case 0:
                Output_praise0 subset_of_output_for_praise0 = (Output_praise0)output.dyn_REG_get_OutputSubset();
                subset_of_output_for_praise0.dyn_REG_get_output_praise0_value();
                break;

            case 1:

                break;
        }
    }
}
