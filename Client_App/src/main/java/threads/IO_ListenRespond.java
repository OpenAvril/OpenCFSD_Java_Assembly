package threads;

import engine.Framework;
import structs.Input;
import structs.Output;

public class IO_ListenRespond
{
    public void dyn_APP_Thread_IO_Listen_Respond(Framework obj, byte threadId)
    {

    }
    public void Encode_NetworkingSteam_At_Client_Input(Input input, byte[] buffer)
    {
        buffer[0] = input.dyn_REG_get_praiseEventId();
        buffer[1] = input.dyn_REG_get_playerId();
        switch (input.dyn_REG_get_praiseEventId())
        {
            case 0:
                break;

            case 1:

                break;
        }
    }
    public void Decode_NetworkingSteam_At_Client_Recieve(Output output, byte[] buffer)
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
