package engine;

import structs.Input;
import structs.Output;

import java.util.List;

public class Data_Control
{
    static private boolean[] _stat_REG_Flag_Array_Of_IsWaitingOnPraiseDoWork;
    static private boolean _stat_REG_StateWRITE_doublebuffer_Client_InputSend;
    static private boolean _stat_REG_StateWRITE_doublebuffer_Client_OutputRecieve;
    static private boolean _stat_REG_FlagIsLoaded_Stack_Client_InputSend;
    static private boolean _stat_REG_FlagIsLoaded_Stack_Client_OutputRecieve;
    // public.
    public Data_Control()
    {
        System.out.printf("ntered CONSTRUCTOR Data_Control().");//TESTBENCH
        stat_CLASS_boot0_DECLAIRE_Data_Control();
        stat_CLASS_boot1_DEFINE_Data_Control();
        stat_CLASS_boot3_INITIALISE_Data_Control();
        stat_REG_boot0_DECLAIRE_Data_Control();
        System.out.printf("xiting CONSTRUCTOR Data_Control().");//TESTBENCH
    }
    public void dyn_APP_Do_Store_PraiseOutputRecieve_To_GameInstanceData(Framework obj, Output stackSlot)
    {
        switch (stackSlot.dyn_REG_get_praiseEventId())
        {
            case 0:
                break;

            case 1:
                var output_Subset_Praise1 = (Praise1_Output)stackSlot.dyn_REG_get_BufferSubset_Output();
                //obj.dyn_CLASS_get_app_Client().Get_dyn_CLASS_data().Get_gameInstance().Get_gameObjectFactory().Get_player().Get_CameraFP().Set_fowards(output_Subset_Praise1.Get_fowards());
                //obj.dyn_CLASS_get_app_Client().Get_dyn_CLASS_data().Get_gameInstance().Get_gameObjectFactory().Get_player().Get_CameraFP().Set_right(output_Subset_Praise1.Get_right());
                // obj.dyn_CLASS_get_app_Client().Get_dyn_CLASS_data().Get_gameInstance().Get_gameObjectFactory().Get_player().Get_CameraFP().Set_up(output_Subset_Praise1.Get_up());
                // Set_isPraiseActive(1, false);
                break;
        }
    }
    public void dyn_APP_Flip_InputBufferToWrite()
    {
        stat_REG_set_StateWRITE_doublebuffer_Client_InputSend(!stat_REG_get_StateWRITE_doublebuffer_Client_InputSend());
    }
    public void dyn_APP_Flip_OutputBufferToWrite()
    {
        stat_REG_set_StateWRITE_doublebuffer_Client_OutputRecieve(!stat_REG_get_StateWRITE_doublebuffer_Client_OutputRecieve());
    }
    public void dyn_APP_Push_Stack_Client_InputAction(Framework obj, List<Input> stack_Client_InputSend, Input BACK_inputDoubleBuffer)
    {
        System.out.printf("ntered dyn_APP_Push_Stack_Client_InputAction()");//TestBench
        stack_Client_InputSend.Add(BACK_inputDoubleBuffer);
        if (stack_Client_InputSend.Count > 1)
        {
            stat_REG_set_FlagIsLoaded_Stack_Client_InputSend(true);
            System.Console.WriteLine("stat_REG_set_FlagIsLoaded_Stack_Client_InputSend = true, " + "stack.count = " + stack_Client_InputSend.size());//TestBench
        }
        else
        {
            stat_REG_set_FlagIsLoaded_Stack_Client_InputSend(false);
            System.Console.WriteLine("stat_REG_set_FlagIsLoaded_Stack_Client_InputSend = false, " + "stack.count = " + stack_Client_InputSend.size());//TestBench
        }
        System.out.printf("xiting dyn_APP_Push_Stack_Client_InputAction()");//TestBench
    }
    public void dyn_APP_Push_Stack_Client_OutputRecieve(Framework obj, List<Output> stack_Client_OutputRecieves, Output FRONT_outputDoubleBuffer)
    {
        stack_Client_OutputRecieves.Add(FRONT_outputDoubleBuffer);
        if (stack_Client_OutputRecieves.Count >= 2)
        {
            stat_REG_set_FlagIsLoaded_Stack_Client_OutputSend(true);
        }
        else
        {
            stat_REG_set_FlagIsLoaded_Stack_Client_OutputSend(false);
        }
    }
    public void dyn_APP_Pop_Stack_Client_InputAction(Framework obj, Input FRONT_inputDoubleBuffer, List<Input> stack_Client_InputSend)
    {
        FRONT_inputDoubleBuffer = stack_Client_InputSend.ElementAt(1);
        stack_Client_InputSend.RemoveAt(1);
        if (stack_Client_InputSend.Count >= 2)
        {
            stat_REG_set_FlagIsLoaded_Stack_Client_InputSend(true);
        }
        else
        {
            stat_REG_set_FlagIsLoaded_Stack_Client_InputSend(false);
        }
    }
    public void dyn_APP_Pop_Stack_Client_OutputRecieve(Framework obj, Output buffer_Output_Recieve_Reference_ForCore, List<Output> stack_Client_OutputRecieves)
    {
        buffer_Output_Recieve_Reference_ForCore = stack_Client_OutputRecieves.ElementAt(1);
        stack_Client_OutputRecieves.RemoveAt(1);
        if (stack_Client_OutputRecieves.Count >= 2)
        {
            stat_REG_set_FlagIsLoaded_Stack_Client_OutputSend(true);
        }
        else
        {
            stat_REG_set_FlagIsLoaded_Stack_Client_OutputSend(false);
        }
    }
    public boolean dyn_REG_get_FlagIsLoaded_Stack_Client_InputSend()
    {
        return stat_REG_get_FlagIsLoaded_Stack_Client_InputSend();
    }
    public boolean dyn_REG_get_FlagIsLoaded_Stack_Client_OutputRecieve()
    {
        return stat_REG_get_FlagIsLoaded_Stack_Client_OutputRecieve();
    }
    public boolean dyn_REG_get_Item_On_Array_Of_IsWaitingOnPraiseDoWork(byte praiseId)
    {
        return stat_REG_get_Array_Of_IsWaitingOnPraiseDoWork()[praiseId];
    }
    public boolean dyn_REG_get_StateREAD_doublebuffer_Client_InputSend()
    {
        return !stat_REG_get_StateWRITE_doublebuffer_Client_InputSend();
    }
    public boolean dyn_REG_get_StateREAD_doublebuffer_Client_OutputRecieve()
    {
        return !stat_REG_get_StateWRITE_doublebuffer_Client_OutputRecieve();
    }
    public boolean dyn_REG_get_StateWRITE_doublebuffer_Client_InputSend()
    {
        return stat_REG_get_StateWRITE_doublebuffer_Client_InputSend();
    }
    public boolean dyn_REG_get_StateWRITE_doublebuffer_Client_OutputRecieve()
    {
        return stat_REG_get_StateWRITE_doublebuffer_Client_OutputRecieve();
    }
    public void dyn_REG_set_Item_On_Array_Of_IsWaitingOnPraiseDoWork(int praiseId, boolean newSTATE)
    {
        stat_REG_get_Array_Of_IsWaitingOnPraiseDoWork()[praiseId] = newSTATE;
    }
    public void dyn_REG_boot1_DEFINE_Data_Control()
    {
        System.out.printf("ntered dyn_REG_boot1_DEFINE_Data_Control().");//TESTBENCH

        System.out.printf("xiting dyn_REG_boot1_DEFINE_Data_Control().");//TESTBENCH
    }
    public void dyn_REG_boot2_SUBSTANTIATE_Data_Control()
    {
        System.out.printf("ntered dyn_REG_boot2_SUBSTANTIATE_Data_Control().");//TESTBENCH
        stat_REG_boot2_SUBSTANTIATE_doublebuffer_Client_InputSend();
        stat_REG_boot2_SUBSTANTIATE_doublebuffer_Client_OutputRecieve();
        stat_REG_boot2_SUBSTANTIATE_Stack_Client_InputSend();
        stat_REG_boot2_SUBSTANTIATE_Stack_Client_OutputRecieve();
        System.out.printf("xiting dyn_REG_boot2_SUBSTANTIATE_Data_Control().");//TESTBENCH
    }
    public void dyn_REG_boot3_INITIALISE_Data_Control()
    {
        System.out.printf("ntered dyn_REG_boot3_INITIALISE_Data_Control().");//TESTBENCH
        stat_REG_boot3_INITIALISE_doublebuffer_Client_InputSend();
        stat_REG_boot3_INITIALISE_doublebuffer_Client_OutputRecieve();
        stat_REG_boot3_INITIALISE_Stack_Client_InputSend();
        stat_REG_boot3_INITIALISE_Stack_Client_OutputRecieve();
        System.out.printf("xiting dyn_REG_boot3_INITIALISE_Data_Control().");//TESTBENCH
    }
    public void dyn_PGM_boot4_INSTANCIATE_Data_Control()
    {
        System.out.printf("ntered dyn_PGM_boot4_INSTANCIATE_Data_Control().");//TESTBENCH

        System.out.printf("xiting dyn_PGM_boot4_INSTANCIATE_Data_Control().");//TESTBENCH
    }
    static public void stat_CLASS_boot0_DECLAIRE_Data_Control()
    {
        System.out.printf("ntered stat_CLASS_boot0_DECLAIRE_Data_Control().");//TESTBENCH

        System.out.printf("xiting stat_CLASS_boot0_DECLAIRE_Data_Control().");//TESTBENCH
    }
    static public void stat_CLASS_boot1_DEFINE_Data_Control()
    {
        System.out.printf("ntered stat_CLASS_boot1_DEFINE_Data_Control().");//TESTBENCH

        System.out.printf("xiting stat_CLASS_boot1_DEFINE_Data_Control().");//TESTBENCH
    }
    static public void stat_CLASS_boot3_INITIALISE_Data_Control()
    {
        System.out.printf("ntered stat_CLASS_boot3_INITIALISE_Data_Control().");//TESTBENCH

        System.out.printf("xiting stat_CLASS_boot3_INITIALISE_Data_Control().");//TESTBENCH
    }
    static public void stat_REG_boot0_DECLAIRE_Data_Control()
    {
        System.out.printf("ntered stat_REG_boot0_DECLAIRE_Data_Control().");//TESTBENCH

        System.out.printf("xiting stat_REG_boot0_DECLAIRE_Data_Control().");//TESTBENCH
    }
    // private.
    static private void stat_REG_boot2_SUBSTANTIATE_doublebuffer_Client_InputSend()
    {
        System.out.printf("ntered stat_REG_boot2_SUBSTANTIATE_doublebuffer_Client_InputSend().");//TESTBENCH
        _stat_REG_StateWRITE_doublebuffer_Client_InputSend = true;
        System.out.printf("xiting stat_REG_boot2_SUBSTANTIATE_doublebuffer_Client_InputSend().");//TESTBENCH
    }
    static private void stat_REG_boot2_SUBSTANTIATE_doublebuffer_Client_OutputRecieve()
    {
        System.out.printf("ntered stat_REG_boot2_SUBSTANTIATE_doublebuffer_Client_OutputRecieve().");//TESTBENCH
        _stat_REG_StateWRITE_doublebuffer_Client_OutputRecieve = true;
        System.out.printf("xiting stat_REG_boot2_SUBSTANTIATE_doublebuffer_Client_OutputRecieve().");//TESTBENCH
    }
    static private void stat_REG_boot2_SUBSTANTIATE_Flag_Array_Of_IsWaitingOnPraiseDoWork(Framework obj)
    {
        System.out.printf("ntered stat_REG_boot2_SUBSTANTIATE_Flag_Array_Of_IsWaitingOnPraiseDoWork().");//TESTBENCH
        _stat_REG_Flag_Array_Of_IsWaitingOnPraiseDoWork = new boolean[obj.dyn_CLASS_get_app_Client().dyn_CLASS_get_global().dyn_REG_get_numberOfPraises()];
        System.out.printf("xiting stat_REG_boot2_SUBSTANTIATE_Flag_Array_Of_IsWaitingOnPraiseDoWork().");//TESTBENCH
    }
    static private void stat_REG_boot2_SUBSTANTIATE_Stack_Client_InputSend()
    {
        System.out.printf("ntered stat_REG_boot2_SUBSTANTIATE_Stack_Client_InputSend().");//TESTBENCH
        _stat_REG_FlagIsLoaded_Stack_Client_InputSend = true;
        System.out.printf("xiting stat_REG_boot2_SUBSTANTIATE_Stack_Client_InputSend().");//TESTBENCH
    }
    static private void stat_REG_boot2_SUBSTANTIATE_Stack_Client_OutputRecieve()
    {
        System.out.printf("ntered stat_REG_boot2_SUBSTANTIATE_Stack_Client_OutputRecieve().");//TESTBENCH
        _stat_REG_FlagIsLoaded_Stack_Client_OutputRecieve = true;
        System.out.printf("xiting stat_REG_boot2_SUBSTANTIATE_Stack_Client_OutputRecieve().");//TESTBENCH
    }
    static private void stat_REG_boot3_INITIALISE_doublebuffer_Client_InputSend()
    {
        System.out.printf("ntered stat_REG_boot3_INITIALISE_doublebuffer_Client_InputSend().");//TESTBENCH
        _stat_REG_StateWRITE_doublebuffer_Client_InputSend = false;
        System.out.printf("xiting stat_REG_boot3_INITIALISE_doublebuffer_Client_InputSend().");//TESTBENCH
    }
    static private void stat_REG_boot3_INITIALISE_doublebuffer_Client_OutputRecieve()
    {
        System.out.printf("ntered stat_REG_boot3_INITIALISE_doublebuffer_Client_OutputRecieve().");//TESTBENCH
        _stat_REG_StateWRITE_doublebuffer_Client_OutputRecieve = false;
        System.out.printf("xiting stat_REG_boot3_INITIALISE_doublebuffer_Client_OutputRecieve().");//TESTBENCH
    }
    static private void stat_REG_boot3_INITIALISE_Flag_Array_Of_IsWaitingOnPraiseDoWork()
    {
        System.out.printf("ntered stat_REG_boot3_INITIALISE_Flag_Array_Of_IsWaitingOnPraiseDoWork().");//TESTBENCH
        for (byte praiseId = 0; praiseId < _stat_REG_Flag_Array_Of_IsWaitingOnPraiseDoWork.length; praiseId++)
        {
            _stat_REG_Flag_Array_Of_IsWaitingOnPraiseDoWork[praiseId] = false;
        }
        System.out.printf("xiting stat_REG_boot3_INITIALISE_Flag_Array_Of_IsWaitingOnPraiseDoWork().");//TESTBENCH
    }
    static private void stat_REG_boot3_INITIALISE_Stack_Client_InputSend()
    {
        System.out.printf("ntered stat_REG_boot3_INITIALISE_Stack_Client_InputSend().");//TESTBENCH
        _stat_REG_FlagIsLoaded_Stack_Client_OutputRecieve = false;
        System.out.printf("xiting stat_REG_boot3_INITIALISE_Stack_Client_InputSend().");//TESTBENCH
    }
    static private void stat_REG_boot3_INITIALISE_Stack_Client_OutputRecieve()
    {
        System.out.printf("ntered stat_REG_boot3_INITIALISE_Stack_Client_OutputRecieve().");//TESTBENCH
        _stat_REG_FlagIsLoaded_Stack_Client_OutputRecieve = false;
        System.out.printf("xiting stat_REG_boot3_INITIALISE_Stack_Client_OutputRecieve().");//TESTBENCH
    }
    static private boolean stat_REG_get_FlagIsLoaded_Stack_Client_InputSend()
    {
        return _stat_REG_FlagIsLoaded_Stack_Client_InputSend;
    }
    static private boolean stat_REG_get_FlagIsLoaded_Stack_Client_OutputRecieve()
    {
        return _stat_REG_FlagIsLoaded_Stack_Client_OutputRecieve;
    }
    static private boolean stat_REG_get_StateWRITE_doublebuffer_Client_InputSend()
    {
        return _stat_REG_StateWRITE_doublebuffer_Client_InputSend;
    }
    static private boolean stat_REG_get_StateWRITE_doublebuffer_Client_OutputRecieve()
    {
        return _stat_REG_StateWRITE_doublebuffer_Client_OutputRecieve;
    }
    static private boolean[] stat_REG_get_Array_Of_IsWaitingOnPraiseDoWork()
    {
        return _stat_REG_Flag_Array_Of_IsWaitingOnPraiseDoWork;
    }
    static private void stat_REG_set_FlagIsLoaded_Stack_Client_InputSend(boolean value)
    {
        _stat_REG_FlagIsLoaded_Stack_Client_InputSend = value;
    }
    static private void stat_REG_set_FlagIsLoaded_Stack_Client_OutputSend(boolean value)
    {
        _stat_REG_FlagIsLoaded_Stack_Client_OutputRecieve = value;
    }
    static private void stat_REG_set_StateWRITE_doublebuffer_Client_InputSend(boolean state_Buffer_Input_ToWrite)
    {
        _stat_REG_StateWRITE_doublebuffer_Client_InputSend = state_Buffer_Input_ToWrite;
    }
    static private void stat_REG_set_StateWRITE_doublebuffer_Client_OutputRecieve(boolean state_Buffer_Output_ToWrite)
    {
        _stat_REG_StateWRITE_doublebuffer_Client_OutputRecieve = state_Buffer_Output_ToWrite;
    }
}
}
