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
            app_Do_Process_Of_Input(obj);
            app_Do_Process_Of_Output(obj);
        }
    }
// private.
    private void app_Decode_NetworkingSteam_At_CLeint_Output_Recieve(Output output, byte[] buffer)
    {

    }
    private void app_Do_Process_Of_Input(Framework obj)
    {
        byte[] buffer = new byte[1024];//TESTBENCH
        Input input = new Input();

    }
    private void app_Do_Process_Of_Output(Framework obj)
    {
        byte[] buffer = new byte[1024];
        Output output = new Output();

    }
    private void app_Encode_NetworkingSteam_At_Client_Input_Send(Input input, byte[] buffer)
    {

    }
    static private void dyn_CLASS_boot1_DEFINE_IO_Listen_Respond()
    {
        System.out.print("entered dyn_CLASS_boot1_DEFINE_IO_Listen_Respond().%n");//TESTBENCH

        System.out.print("exiting dyn_CLASS_boot1_DEFINE_IO_Listen_Respond().%n");//TESTBENCH
    }
    static private void dyn_CLASS_boot3_INITIALISE_IO_Listen_Respond()
    {
        System.out.print("entered dyn_CLASS_boot3_INITIALISE_IO_Listen_Respond().%n");//TESTBENCH

        System.out.print("exiting dyn_CLASS_boot3_INITIALISE_IO_Listen_Respond().%n");//TESTBENCH
    }
    public void dyn_REG_boot0_DECLAIRE_IO_Listen_Respond()
    {
        System.out.print("entered dyn_REG_boot0_DECLAIRE_IO_Listen_Respond().%n");//TESTBENCH

        System.out.print("exiting dyn_REG_boot0_DECLAIRE_IO_Listen_Respond().%n");//TESTBENCH
    }
    public void dyn_REG_boot1_DEFINE_IO_Listen_Respond()
    {
        System.out.print("entered dyn_REG_boot1_DEFINE_IO_Listen_Respond().%n");//TESTBENCH

        System.out.print("exiting dyn_REG_boot1_DEFINE_IO_Listen_Respond().%n");//TESTBENCH
    }
    public void dyn_REG_boot2_SUBSTANTIATE_IO_Listen_Respond()
    {
        System.out.print("entered dyn_REG_boot2_SUBSTANTIATE_IO_Listen_Respond().%n");//TESTBENCH

        System.out.print("exiting dyn_REG_boot2_SUBSTANTIATE_IO_Listen_Respond().%n");//TESTBENCH
    }
    public void dyn_REG_boot3_INITIALISE_IO_Listen_Respond()
    {
        System.out.print("entered dyn_REG_boot3_INITIALISE_IO_Listen_Respond().%n");//TESTBENCH

        System.out.print("exiting dyn_REG_boot3_INITIALISE_IO_Listen_Respond().%n");//TESTBENCH
    }
    public void dyn_PGM_boot4_INSTANCIATE_IO_Listen_Respond()
    {
        System.out.print("entered dyn_PGM_boot4_INSTANCIATE_IO_Listen_Respond().%n");//TESTBENCH

        System.out.print("exiting dyn_PGM_boot4_INSTANCIATE_IO_Listen_Respond().%n");//TESTBENCH
    }
    public void dyn_STRUCT_boot1_DEFINE_IO_Listen_Respond()
    {
        System.out.print("entered stat_STRUCT_boot1_DEFINE_IO_Listen_Respond().%n");//TESTBENCH

        System.out.print("exiting stat_STRUCT_boot1_DEFINE_IO_Listen_Respond().%n");//TESTBENCH
    }
    public void dyn_STRUCT_boot3_INITIALISE_IO_Listen_Respond()
    {
        System.out.print("entered stat_STRUCT_boot3_INITIALISE_IO_Listen_Respond().%n");//TESTBENCH

        System.out.print("exiting stat_STRUCT_boot3_INITIALISE_IO_Listen_Respond().%n");//TESTBENCH
    }
}
