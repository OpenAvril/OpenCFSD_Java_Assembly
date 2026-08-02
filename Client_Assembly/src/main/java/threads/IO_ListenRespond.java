package threads;
import engine.Framework;
import engine.Global;
import main.IO.*;
import structs.Input;
import structs.Output;
import structs.praise_sets.*;

import static SIMULATION.Simulation._SIM_stat_REG_input_Sample;
import static SIMULATION.Simulation._SIM_stat_REG_output_Sample;

public class IO_ListenRespond
{
    private static byte[] _stat_REG_Buffer_For_Input;
    private static byte[] _stat_REG_Buffer_For_Ouput;
    public static boolean _stat_REG_flag__isNewInputReady;
    public static boolean _stat_REG_flag__isNewOutputReady;
    // public.
    public IO_ListenRespond() {
        stat_CLASS_boot0_DECLAIRE_IO_ListenRespond();
        stat_REG_boot0_DECLAIRE_IO_ListenRespond();
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
            WriteQue_ConditionCode.app_FUNCT_write_Start(0);
            WriteQue_SimulationIO.app_FUNCT_write_Start(0);
            if(obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised()) {
                WriteQue_ConditionCode.app_FUNCT_write_End(0);
                System.out.printf("thread " + threadId + " INPUT: ACCESS WriteQue_SimulationIO at Id=0.%n");
                if (stat_REG_get_flag__isNewInputReady()) {
                    System.out.printf("thread " + threadId + " INPUT: start.%n");

                    System.out.printf("thread " + threadId + " INPUT: end.%n");
                }

                if(stat_REG_get_flag__isNewOutputReady()) {
                    System.out.printf("thread " + threadId + " OUTPUT: start.%n");

                    System.out.printf("thread " + threadId + " OUTPUT: end.%n");
                }
            }
            else {
                WriteQue_ConditionCode.app_FUNCT_write_End(0);
                System.out.printf("thread " + threadId + " INPUT: CLOSE ACCESS WriteQue_SimulationIO at Id=0.%n");
                WriteQue_SimulationIO.app_FUNCT_write_End(0);
            }
            WriteQue_ConditionCode.app_FUNCT_write_Start(0);
            WriteQue_SimulationIO.app_FUNCT_write_Start(0);
            if(!obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().dyn_REG_get_Flag_is_SystemInitialised()) {
                System.out.printf("thread " + threadId + " OUTPUT: ACCESS WriteQue_SimulationIO at Id=0.%n");
                checkPass = true;
            }
            WriteQue_ConditionCode.app_FUNCT_write_End(0);
            System.out.printf("thread " + threadId + " OUTPUT: CLOSE ACCESS WriteQue_SimulationIO at Id=0.%n");
            WriteQue_SimulationIO.app_FUNCT_write_End(0);
        }
        obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_CLASS_get_Execute_Control().app_Terminate_All_Threads(obj);
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
        for(byte index = 0; index < 4; index++)
        {
            temp[0] = buffer[0];
        }
        input.dyn_REG_set_Input_praiseId(Global.stat_CONVERT_LsbByteArray_To_LSBUnsignedLong(Global.stat_CONVERT_MsbByteArray_To_LsbByteArray(temp)));
        input.dyn_REG_set_InputSubset(obj, Global.stat_CONVERT_LsbByteArray_To_LSBUnsignedLong(Global.stat_CONVERT_MsbByteArray_To_LsbByteArray(temp)));
        switch (input.dyn_REG_get_Input_praiseId())
        {
            case 0:
                Input_praise0 subset_of_input_for_praise0 = (Input_praise0)input.dyn_REG_get_InputSubset();
                temp = new byte[4];
                for(byte index = 0; index < 4; index++)
                {
                    temp[index] = buffer[4+index];
                }
                subset_of_input_for_praise0.dyn_REG_set_input_praise0_valueA(Global.stat_CONVERT_LsbByteArray_To_LsbDouble(Global.stat_CONVERT_MsbByteArray_To_LsbByteArray(temp)));
                temp = new byte[4];
                for(byte index = 0; index < 4; index++)
                {
                    temp[index] = buffer[8+index];
                }
                subset_of_input_for_praise0.dyn_REG_set_input_praise0_valueB(Global.stat_CONVERT_LsbByteArray_To_LsbDouble(Global.stat_CONVERT_MsbByteArray_To_LsbByteArray(temp)));
                break;

            case 1:
                Input_praise1 subset_of_input_for_praise1 = (Input_praise1)input.dyn_REG_get_InputSubset();
                temp = new byte[4];
                for(byte index = 0; index < 4; index++)
                {
                    temp[index] = buffer[4+index];
                }
                subset_of_input_for_praise1.dyn_REG_set_input_praise1_valueA(Global.stat_CONVERT_LsbByteArray_To_LsbDouble(Global.stat_CONVERT_MsbByteArray_To_LsbByteArray(temp)));
                temp = new byte[4];
                for(byte index = 0; index < 4; index++)
                {
                    temp[index] = buffer[8+index];
                }
                subset_of_input_for_praise1.dyn_REG_set_input_praise1_valueB(Global.stat_CONVERT_LsbByteArray_To_LsbDouble(Global.stat_CONVERT_MsbByteArray_To_LsbByteArray(temp)));
                break;

            case 2:
                Input_praise2 subset_of_input_for_praise2 = (Input_praise2)input.dyn_REG_get_InputSubset();
                temp = new byte[4];
                for(byte index = 0; index < 4; index++)
                {
                    temp[index] = buffer[4+index];
                }
                subset_of_input_for_praise2.dyn_REG_set_input_praise2_valueA(Global.stat_CONVERT_LsbByteArray_To_LsbDouble(Global.stat_CONVERT_MsbByteArray_To_LsbByteArray(temp)));
                temp = new byte[4];
                for(byte index = 0; index < 4; index++)
                {
                    temp[index] = buffer[8+index];
                }
                subset_of_input_for_praise2.dyn_REG_set_input_praise2_valueB(Global.stat_CONVERT_LsbByteArray_To_LsbDouble(Global.stat_CONVERT_MsbByteArray_To_LsbByteArray(temp)));
                break;

            case 3:
                Input_praise3 subset_of_input_for_praise3 = (Input_praise3)input.dyn_REG_get_InputSubset();
                temp = new byte[4];
                for(byte index = 0; index < 4; index++)
                {
                    temp[index] = buffer[4+index];
                }
                subset_of_input_for_praise3.dyn_REG_set_input_praise3_valueA(Global.stat_CONVERT_LsbByteArray_To_LsbDouble(Global.stat_CONVERT_MsbByteArray_To_LsbByteArray(temp)));
                temp = new byte[4];
                for(byte index = 0; index < 4; index++)
                {
                    temp[index] = buffer[8+index];
                }
                subset_of_input_for_praise3.dyn_REG_set_input_praise3_valueB(Global.stat_CONVERT_LsbByteArray_To_LsbDouble(Global.stat_CONVERT_MsbByteArray_To_LsbByteArray(temp)));
                break;
        }
    }
    private void stat_App_Encode_NetworkingSteam_At_Server_Output_Send(Framework obj, Output output, byte[] buffer) {
        byte[] temp = Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(Global.stat_CONVERT_LSBUnsignedLong_To_LsbByteArray(output.dyn_REG_get_Output_praiseId()));
        for(byte index = 0; index < 4; index++)
        {
            buffer[index] = temp[index];
        }
        output.dyn_REG_set_OutputSubset(obj, output.dyn_REG_get_Output_praiseId());
        switch (output.dyn_REG_get_Output_praiseId())
        {
            case 0:
                Output_praise0 subset_of_output_for_praise0 = (Output_praise0)output.dyn_REG_get_OutputSubset();
                temp = Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(Global.stat_CONVERT_LsbDouble_To_LsbByteArray(subset_of_output_for_praise0.dyn_REG_get_output_praise0_value()));
                for(byte index = 0; index < 4; index++)
                {
                    buffer[index] = temp[index];
                }
                break;

            case 1:
                Output_praise1 subset_of_output_for_praise1 = (Output_praise1)output.dyn_REG_get_OutputSubset();
                temp = Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(Global.stat_CONVERT_LsbDouble_To_LsbByteArray(subset_of_output_for_praise1.dyn_REG_get_output_praise1_value()));
                for(byte index = 0; index < 4; index++)
                {
                    buffer[index] = temp[index];
                }
                break;

            case 2:
                Output_praise2 subset_of_output_for_praise2 = (Output_praise2)output.dyn_REG_get_OutputSubset();
                temp = Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(Global.stat_CONVERT_LsbDouble_To_LsbByteArray(subset_of_output_for_praise2.dyn_REG_get_output_praise2_value()));
                for(byte index = 0; index < 4; index++)
                {
                    buffer[index] = temp[index];
                }
                break;

            case 3:
                Output_praise3 subset_of_output_for_praise3 = (Output_praise3)output.dyn_REG_get_OutputSubset();
                temp = Global.stat_CONVERT_LsbByteArray_To_MsbByteArray(Global.stat_CONVERT_LsbDouble_To_LsbByteArray(subset_of_output_for_praise3.dyn_REG_get_output_praise3_value()));
                for(byte index = 0; index < 4; index++)
                {
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
    private static void stat_CLASS_boot3_INITIALISE_IO_ListenRespond(Framework obj)  {
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
        for(int index = 0; index < _stat_REG_Buffer_For_Input.length; index++) {
            _stat_REG_Buffer_For_Input[index] = Byte.MAX_VALUE;
        }
    }
    private static void stat_REG_boot2_SUBSTANTIATE_Buffer__Ouput() {
        _stat_REG_Buffer_For_Ouput = new byte[1024];
        for(int index = 0; index < _stat_REG_Buffer_For_Ouput.length; index++) {
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
        for(int index = 0; index < _stat_REG_Buffer_For_Input.length; index++) {
            _stat_REG_Buffer_For_Input[index] = 0;
        }
    }
    private static void stat_REG_boot3_INITIALISE_Buffer__Ouput(Output structDEFAULT_Output) {
        for(int index = 0; index < _stat_REG_Buffer_For_Ouput.length; index++) {
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
        _stat_REG_flag__isNewOutputReady  = value;
    }
}