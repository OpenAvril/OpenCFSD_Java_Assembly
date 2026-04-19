package threads;
import engine.Framework;
import engine.Global;
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
            app_Do_Process_Of_Input_Send(obj);
            app_Do_Process_Of_Output_Receive(obj);
        }
    }
// private.
    private void app_Decode_NetworkingSteam_At_CLeint_Output_Recieve(Output output, byte[] buffer)
    {

    }
    private void app_Do_Process_Of_Input_Send(Framework obj)
    {
        byte[] buffer = new byte[1024];//TESTBENCH
        Input input = new Input();
 /*
        if (obj.dyn_CLASS_get_App().dyn_CLASS_get_Data().().Get_flag_IsLoaded_Stack_InputAction() == true)
        {
            Avril_FSD.Library_For_WriteEnableForThreadsAt_CLIENTINPUTACTION.Write_Start(obj.Get_client().Get_execute().Get_program_WriteQue_C_IA(), 1);
            byte[] data = new byte[64];
            obj.Get_client().Get_data().Get_data_Control().Pop_Stack_InputAction(obj, obj.Get_client().Get_data().Get_input_Instnace().Get_FRONT_inputDoubleBuffer(obj), obj.Get_client().Get_data().Get_input_Instnace().Get_stack_Client_InputSend());
            obj.Get_client().Get_data().Flip_InBufferToWrite();
            obj.Get_client().Get_algorithms().Get_io_ListenRespond().Encode_NetworkingSteam_At_Client_Input(obj, obj.Get_client().Get_data().Get_input_Instnace().Get_BACK_inputDoubleBuffer(obj), data);
            _client_SOCKET.SendMessageToConnection(_connection, data);
            Avril_FSD.Library_For_WriteEnableForThreadsAt_CLIENTINPUTACTION.Write_End(obj.Get_client().Get_execute().Get_program_WriteQue_C_IA(), 1);
        }
  */
    }
    private void app_Do_Process_Of_Output_Receive(Framework obj)
    {
        byte[] buffer = new byte[1024];
        Output output = new Output();
/*
        if (obj.Get_server().Get_data().Get_data_Control().Get_flag_IsLoaded_Stack_OutputAction())
        {
            Avril_FSD.Library_For_WriteEnableForThreadsAt_SERVEROUTPUTRECIEVE.Write_Start(Avril_FSD.Library_For_Server_Concurrency.Get_program_WriteEnableStack_ServerOutputRecieve(), 0);
            byte[] data = new byte[64];
            var output = obj.Get_server().Get_data().Get_output_Instnace().Get_FRONT_outputDoubleBuffer(obj);
            output.Get_output_Control().SelectSetOutputSubset(obj, output.Get_praiseEventId());
            obj.Get_server().Get_algorithms().Get_io_ListenRespond().Encode_NetworkingSteam_At_Server_Output(obj, output, data);
            address_CLIENT.SetAddress(info.connectionInfo.address.GetIP(), 27001);
            uint connection = _server_SOCKET.Connect(ref address_CLIENT);
            _server_SOCKET.SendMessageToConnection(connection, data);
            _server_SOCKET.CloseConnection(info.connection);
            Avril_FSD.Library_For_WriteEnableForThreadsAt_SERVEROUTPUTRECIEVE.Write_End(Avril_FSD.Library_For_Server_Concurrency.Get_program_WriteEnableStack_Serv
        }
 */
    }
    private void app_Encode_NetworkingSteam_At_Client_Input_Send(Input input, byte[] buffer)
    {

    }
}
