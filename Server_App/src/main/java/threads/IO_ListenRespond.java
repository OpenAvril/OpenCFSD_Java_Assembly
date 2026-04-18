package threads;
import engine.Framework;
import engine.Global;
import main.IO.OpenEpiCentre;
import main.IO.WriteQue_SERVERINPUTRECIEVE;
import structs.Input;
import structs.Output;
public class IO_ListenRespond
{
// public.
    public void app_Thread_IO_Listen_Respond(Framework obj, byte threadId)
    {
        app_Do_Process_Of_Input(obj);
        app_Do_Process_Of_Output();
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
                break;

            case 1:

                break;
        }
    }
    private void app_Do_Process_Of_Input(Framework obj)
    {
        byte[] buffer = { Byte.MAX_VALUE };
        app_Decode_NetworkingSteam_At_Server_Input_Recieve(null, null);

    }
    private void app_Do_Process_Of_Output()
    {
        WriteQue_SERVERINPUTRECIEVE.app_FUNCT_write_Start(0);
        app_Encode_NetworkingSteam_At_Server_Output_Send();
        byte[] buffer = new byte[1024];
        netMessage.CopyTo(buffer);
        Avril_FSD.Library_For_Server_Concurrency.Select_Set_Intput_Subset(obj.Get_server().Get_execute().Get_program_ServerConcurrency(), buffer[0]);
        obj.Get_server().Get_algorithms().Get_io_ListenRespond().Decode_NetworkingSteam_At_Server_Input(obj, obj.Get_server().Get_data().Get_input_Instnace().Get_FRONT_inputDoubleBuffer(obj), buffer);
        Avril_FSD.Library_For_Server_Concurrency.Flip_InBufferToWrite(obj.Get_server().Get_execute().Get_program_ServerConcurrency());
        Avril_FSD.Library_For_Server_Concurrency.Push_Stack_InputPraises(obj.Get_server().Get_execute().Get_program_ServerConcurrency());
        if (Avril_FSD.Library_For_LaunchEnableForConcurrentThreadsAt_SERVER.Get_Flag_ConcurrentCoreState(obj.Get_server().Get_execute().Get_program_ServerConcurrency(), Avril_FSD.Library_For_LaunchEnableForConcurrentThreadsAt_SERVER.Get_coreId_To_Launch(obj.Get_server().Get_execute().Get_program_ServerConcurrency())) == Avril_FSD.Library_For_LaunchEnableForConcurrentThreadsAt_SERVER.Get_Flag_Idle(obj.Get_server().Get_execute().Get_program_ServerConcurrency()))
        {
            Avril_FSD.Library_For_LaunchEnableForConcurrentThreadsAt_SERVER.Request_Wait_Launch(obj.Get_server().Get_execute().Get_program_ServerConcurrency(), Avril_FSD.Library_For_LaunchEnableForConcurrentThreadsAt_SERVER.Get_coreId_To_Launch(obj.Get_server().Get_execute().Get_program_ServerConcurrency()));
        }
        WriteQue_SERVERINPUTRECIEVE.app_FUNCT_write_End(0);
    }
    private void app_Encode_NetworkingSteam_At_Server_Output_Send(Output output, byte[] buffer)
    {
        output.dyn_REG_set_praiseEventId(buffer[0]);
        output.dyn_REG_set_playerId(buffer[1]);
        switch (output.dyn_REG_get_praiseEventId())
        {
            case 0:

                break;

            case 1:

                break;
        }
    }
    static private void dyn_CLASS_boot1_DEFINE_IO_Listen_Respond()
    {
        System.out.printf("entered dyn_CLASS_boot1_DEFINE_IO_Listen_Respond().");//TESTBENCH

        System.out.printf("exiting dyn_CLASS_boot1_DEFINE_IO_Listen_Respond().");//TESTBENCH
    }
    static private void dyn_CLASS_boot3_INITIALISE_IO_Listen_Respond()
    {
        System.out.printf("entered dyn_CLASS_boot3_INITIALISE_IO_Listen_Respond().");//TESTBENCH

        System.out.printf("exiting dyn_CLASS_boot3_INITIALISE_IO_Listen_Respond().");//TESTBENCH
    }
    public void dyn_REG_boot0_DECLAIRE_IO_Listen_Respond()
    {
        System.out.printf("entered dyn_REG_boot0_DECLAIRE_IO_Listen_Respond().");//TESTBENCH

        System.out.printf("exiting dyn_REG_boot0_DECLAIRE_IO_Listen_Respond().");//TESTBENCH
    }
    public void dyn_REG_boot1_DEFINE_IO_Listen_Respond()
    {
        System.out.printf("entered dyn_REG_boot1_DEFINE_IO_Listen_Respond().");//TESTBENCH

        System.out.printf("exiting dyn_REG_boot1_DEFINE_IO_Listen_Respond().");//TESTBENCH
    }
    public void dyn_REG_boot2_SUBSTANTIATE_IO_Listen_Respond()
    {
        System.out.printf("entered dyn_REG_boot2_SUBSTANTIATE_IO_Listen_Respond().");//TESTBENCH

        System.out.printf("exiting dyn_REG_boot2_SUBSTANTIATE_IO_Listen_Respond().");//TESTBENCH
    }
    public void dyn_REG_boot3_INITIALISE_IO_Listen_Respond()
    {
        System.out.printf("entered dyn_REG_boot3_INITIALISE_IO_Listen_Respond().");//TESTBENCH

        System.out.printf("exiting dyn_REG_boot3_INITIALISE_IO_Listen_Respond().");//TESTBENCH
    }
    public void dyn_PGM_boot4_INSTANCIATE_IO_Listen_Respond()
    {
        System.out.printf("entered dyn_PGM_boot4_INSTANCIATE_IO_Listen_Respond().");//TESTBENCH

        System.out.printf("exiting dyn_PGM_boot4_INSTANCIATE_IO_Listen_Respond().");//TESTBENCH
    }
    public void dyn_STRUCT_boot1_DEFINE_IO_Listen_Respond()
    {
        System.out.printf("entered stat_STRUCT_boot1_DEFINE_IO_Listen_Respond().");//TESTBENCH

        System.out.printf("exiting stat_STRUCT_boot1_DEFINE_IO_Listen_Respond().");//TESTBENCH
    }
    public void dyn_STRUCT_boot3_INITIALISE_IO_Listen_Respond()
    {
        System.out.printf("entered stat_STRUCT_boot3_INITIALISE_IO_Listen_Respond().");//TESTBENCH

        System.out.printf("exiting stat_STRUCT_boot3_INITIALISE_IO_Listen_Respond().");//TESTBENCH
    }
}
