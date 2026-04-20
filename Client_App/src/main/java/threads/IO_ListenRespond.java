package threads;
import engine.Framework;
import main.IO.WriteQue_Client_InputSend;
import main.IO.WriteQue_Client_OutputRecieve;
import structs.Input;
import structs.Output;

public class IO_ListenRespond
{
    private static byte[] _stat_REG_Buffer_For_Input;
    private static byte[] _stat_REG_Buffer_For_Ouput;
    private static Input _stat_REG_input;
    private static Output _stat_REG_output;
// public.
    public IO_ListenRespond()
    {
        _stat_REG_Buffer_For_Input = new byte[1024];
        for(int index = 0; index < _stat_REG_Buffer_For_Input.length; index++)
        {
            _stat_REG_Buffer_For_Input[index] = Byte.MAX_VALUE;
        }

        _stat_REG_Buffer_For_Ouput = new byte[1024];
        for(int index = 0; index < _stat_REG_Buffer_For_Ouput.length; index++)
        {
            _stat_REG_Buffer_For_Ouput[index] = Byte.MAX_VALUE;
        }
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
            app_Do_Process_Of_Input_Send(obj);
            app_Do_Process_Of_Output_Receive(obj);
        }
    }
// private.
    private void app_Decode_NetworkingSteam_At_CLeint_Output_Recieve(Output output, byte[] buffer)
    {
        //todo member function algorithm
    }
    private void app_Do_Process_Of_Input_Send(Framework obj)
    {
        if (obj.dyn_CLASS_get_App().dyn_CLASS_get_Data().dyn_CLASS_get_data_Control().dyn_REG_get_FlagIsLoaded_Stack_Client_InputSend())
        {
            WriteQue_Client_InputSend.app_FUNCT_write_Start(1);
            _stat_REG_Buffer_For_Input= new byte[1024];//TESTBENCH
            _stat_REG_input = obj.dyn_STRUCT_get_Input();//todo 3d graphics scanner capture of keyboard and mouse, write of data-struct input and sub set for praise event id.
            obj.dyn_CLASS_get_App().dyn_CLASS_get_Data().dyn_CLASS_get_data_Control().dyn_APP_Pop_Stack_Client_InputAction(obj, obj.dyn_CLASS_get_App().dyn_CLASS_get_Data().dyn_REG_get_doublebuffer_Client_InputSend_WRITE(obj), obj.dyn_CLASS_get_App().dyn_CLASS_get_Data().dyn_REG_get_Stack_At_Client_InputSend_List_Of_Input());
            obj.dyn_CLASS_get_App().dyn_CLASS_get_Data().dyn_CLASS_get_data_Control().dyn_APP_Flip_InputBufferToWrite();
            app_Encode_NetworkingSteam_At_Client_Input_Send(_stat_REG_input, _stat_REG_Buffer_For_Input);
            //todo send
            WriteQue_Client_InputSend.app_FUNCT_write_End(1);
        }
     }
    private void app_Do_Process_Of_Output_Receive(Framework obj)
    {
        if (obj.dyn_CLASS_get_App().dyn_CLASS_get_Data().dyn_CLASS_get_data_Control().dyn_REG_get_FlagIsLoaded_Stack_Client_OutputRecieve())
        {
            while (obj.dyn_CLASS_get_App().dyn_CLASS_get_Data().dyn_CLASS_get_data_Control().dyn_REG_get_FlagIsLoaded_Stack_Client_OutputRecieve())
            {
                WriteQue_Client_OutputRecieve.app_FUNCT_write_Start(1);
                _stat_REG_Buffer_For_Ouput = new byte[1024];
                _stat_REG_output = obj.dyn_STRUCT_get_Output();
                _stat_REG_output = obj.dyn_CLASS_get_App().dyn_CLASS_get_Data().dyn_REG_get_doublebuffer_Client_OutputRecieve_READ(obj);
                _stat_REG_output.dyn_REG_set_OutputSubset(obj, _stat_REG_output.dyn_REG_get_Output_praiseId());
                app_Decode_NetworkingSteam_At_CLeint_Output_Recieve(_stat_REG_output, _stat_REG_Buffer_For_Ouput);
                //todo write data struct input to game instance.
                WriteQue_Client_OutputRecieve.app_FUNCT_write_End(1);
            }
        }
    }
    private void app_Encode_NetworkingSteam_At_Client_Input_Send(Input input, byte[] buffer)
    {
        //todo member function algorithm
    }
}
