package SIMULATION;
import engine.Framework;
import main.IO.OpenEpiCentre;
import main.IO.WriteQue_SERVERINPUTRECIEVE;
import main.IO.WriteQue_SERVEROUTPUTSEND;
import main.IO.WriteQue_Simulation_IO;
import structs.Input;
import structs.Output;
import structs.praisesubsets.Input_praise0;
import structs.praisesubsets.Input_praise1;
import structs.praisesubsets.Input_praise2;
import structs.praisesubsets.Input_praise3;
import structs.praisesubsets.Output_praise0;
import structs.praisesubsets.Output_praise1;
import structs.praisesubsets.Output_praise2;
import structs.praisesubsets.Output_praise3;
import java.util.Objects;
import java.util.Scanner;

public class Simulation
{
    private static Framework obj;
    private static Input _SIM_stat_REG_input_Sample;
    private static Output _SIM_stat_REG_output_Sample;
    private static Scanner _stat_REG_scanner;
    public Simulation(Framework objIn, Input _DEFAULT_inputSample, Output _DEFAULT_outputSample)
    {
        obj = null;
        obj = objIn;
        _SIM_stat_REG_input_Sample = null;
        _SIM_stat_REG_input_Sample = _DEFAULT_inputSample;
        _SIM_stat_REG_input_Sample.dyn_REG_boot2_SUBSTANTIATE_Input();
        _SIM_stat_REG_input_Sample = _DEFAULT_inputSample;
        _SIM_stat_REG_output_Sample = null;
        _SIM_stat_REG_output_Sample = _DEFAULT_outputSample;
        _SIM_stat_REG_output_Sample.dyn_REG_boot2_SUBSTANTIATE_Output();
        _SIM_stat_REG_output_Sample = _DEFAULT_outputSample;
        _stat_REG_scanner = null;
        _stat_REG_scanner = new Scanner(System.in);
    }
    public static void Terminate_stat_REG_scanner()
    {
        _stat_REG_scanner.close();
    }
    public static void Get_Praise_Event_Id_And_Data(Input input) {
        WriteQue_Simulation_IO.app_FUNCT_write_Start(0);//SIMULATION
        System.out.printf("Enter PraiseEventId: ");
        int praiseEventId = _stat_REG_scanner.nextInt(); // Program waits here
        input.dyn_REG_set_Input_praiseId(praiseEventId);
        input.dyn_REG_set_InputSubset(obj, praiseEventId);
        switch(input.dyn_REG_get_Input_praiseId())
        {
            case (int)0:
                Input_praise0 input_subset0 = (Input_praise0)input.dyn_REG_get_InputSubset();
                System.out.printf("Enter input Subset0 valueA: ");
                input_subset0.dyn_REG_set_input_praise0_valueA(_stat_REG_scanner.nextFloat());
                System.out.printf("Enter input Subset0 valueB: ");
                input_subset0.dyn_REG_set_input_praise0_valueB(_stat_REG_scanner.nextFloat()); // Program waits here
                break;

            case (int)1:
                Input_praise1 input_subset1 = (Input_praise1)input.dyn_REG_get_InputSubset();
                System.out.printf("Enter input Subset1 valueA: ");
                input_subset1.dyn_REG_set_input_praise1_valueA(_stat_REG_scanner.nextFloat());
                System.out.printf("Enter input Subset1 valueB: ");
                input_subset1.dyn_REG_set_input_praise1_valueB(_stat_REG_scanner.nextFloat()); // Program waits here
                break;

            case (int)2:
                Input_praise2 input_suber2 = (Input_praise2)input.dyn_REG_get_InputSubset();
                System.out.printf("Enter input Subset2 valueA: ");
                input_suber2.dyn_REG_set_input_praise2_valueA(_stat_REG_scanner.nextFloat());
                System.out.printf("Enter input Subset2 valueB: ");
                input_suber2.dyn_REG_set_input_praise2_valueB(_stat_REG_scanner.nextFloat()); // Program waits here
                break;

            case (int)3:
                Input_praise3 input_suber3 = (Input_praise3)input.dyn_REG_get_InputSubset();
                System.out.printf("Enter input Subset3 valueA: ");
                input_suber3.dyn_REG_set_input_praise3_valueA(_stat_REG_scanner.nextFloat());
                System.out.printf("Enter input Subset3 valueB: ");
                input_suber3.dyn_REG_set_input_praise3_valueB(_stat_REG_scanner.nextFloat()); // Program waits here
                break;
        }
        WriteQue_Simulation_IO.app_FUNCT_write_End(0);//SIMULATION
    }
    public static void Print_PraiseEvent(Output output) {
        WriteQue_Simulation_IO.app_FUNCT_write_Start(1);//SIMULATION
        System.out.printf("PraiseEventId: " + output.dyn_REG_get_Output_praiseId());
        switch(output.dyn_REG_get_Output_praiseId())
        {
            case 0:
                Output_praise0 output_subset0 = (Output_praise0)output.dyn_REG_get_OutputSubset();
                System.out.printf("output subset0 value: " + output_subset0.dyn_REG_get_output_praise0_value());
                break;

            case 1:
                Output_praise1 output_subset1 = (Output_praise1)output.dyn_REG_get_OutputSubset();
                System.out.printf("output subset1 value: " + output_subset1.dyn_REG_get_output_praise1_value());
                break;

            case 2:
                Output_praise2 output_subset2 = (Output_praise2)output.dyn_REG_get_OutputSubset();
                System.out.printf("output subset2 value: " + output_subset2.dyn_REG_get_output_praise2_value());
                break;

            case 3:
                Output_praise3 output_subset3 = (Output_praise3)output.dyn_REG_get_OutputSubset();
                System.out.printf("output subset3 value: " + output_subset3.dyn_REG_get_output_praise3_value());
                break;
        }
        WriteQue_Simulation_IO.app_FUNCT_write_End(1);//SIMULATION
    }
    private void app_Do_Process_Of_Input(Framework obj)
    {
        WriteQue_SERVERINPUTRECIEVE.app_FUNCT_write_Start(0);
        _SIM_stat_REG_input_Sample = obj.dyn_STRUCT_get_Input();
        //_stat_REG_Buffer_For_Input = new byte[1024]; //todo network capture and write to buffer.
        //app_Decode_NetworkingSteam_At_Server_Input_Recieve(_SIM_stat_REG_input_Sample, _stat_REG_Buffer_For_Input);
        Simulation.Get_Praise_Event_Id_And_Data(_SIM_stat_REG_input_Sample);//SIMULATION
        OpenEpiCentre.app_FUNCT_select_set_Intput_Subset(_SIM_stat_REG_input_Sample.dyn_REG_get_Input_praiseId());
        switch (_SIM_stat_REG_input_Sample.dyn_REG_get_Input_praiseId())
        {
            case (int)0:
                Input_praise0 subset_of_input_for_praise0 = (Input_praise0)_SIM_stat_REG_input_Sample.dyn_REG_get_InputSubset();
                OpenEpiCentre.io_PRAISE_set_MetaData_PraiseEventId(_SIM_stat_REG_input_Sample.dyn_REG_get_Input_praiseId());
                OpenEpiCentre.io_PRAISE_set_Item_Input_praise0_Value_A(subset_of_input_for_praise0.dyn_REG_get_input_praise0_valueA());
                OpenEpiCentre.io_PRAISE_set_Item_Input_praise0_Value_B(subset_of_input_for_praise0.dyn_REG_get_input_praise0_valueB());
                break;

            case (int)1:
                Input_praise1 subset_of_input_for_praise1 = (Input_praise1)_SIM_stat_REG_input_Sample.dyn_REG_get_InputSubset();
                OpenEpiCentre.io_PRAISE_set_MetaData_PraiseEventId(_SIM_stat_REG_input_Sample.dyn_REG_get_Input_praiseId());
                OpenEpiCentre.io_PRAISE_set_Item_Input_praise0_Value_A(subset_of_input_for_praise1.dyn_REG_get_input_praise1_valueA());
                OpenEpiCentre.io_PRAISE_set_Item_Input_praise0_Value_B(subset_of_input_for_praise1.dyn_REG_get_input_praise1_valueB());
                break;

            case (int)2:
                Input_praise2 subset_of_input_for_praise2 = (Input_praise2)_SIM_stat_REG_input_Sample.dyn_REG_get_InputSubset();
                OpenEpiCentre.io_PRAISE_set_MetaData_PraiseEventId(_SIM_stat_REG_input_Sample.dyn_REG_get_Input_praiseId());
                OpenEpiCentre.io_PRAISE_set_Item_Input_praise0_Value_A(subset_of_input_for_praise2.dyn_REG_get_input_praise2_valueA());
                OpenEpiCentre.io_PRAISE_set_Item_Input_praise0_Value_B(subset_of_input_for_praise2.dyn_REG_get_input_praise2_valueB());
                break;

            case (int)3:
                Input_praise3 subset_of_input_for_praise3 = (Input_praise3)_SIM_stat_REG_input_Sample.dyn_REG_get_InputSubset();
                OpenEpiCentre.io_PRAISE_set_MetaData_PraiseEventId(_SIM_stat_REG_input_Sample.dyn_REG_get_Input_praiseId());
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
            //while(OpenEpiCentre.dyn_REG_get_flag_isStackLoaded_Server_OutputSend())
            //{
            OpenEpiCentre.app_FUNCT_pop_From_Stack_Of_Output();
            _stat_REG_output.dyn_REG_set_Output_praiseId(OpenEpiCentre.io_RPRAISE_get_MetaData_PraiseEventId());
            _stat_REG_output.dyn_REG_set_OutputSubset(obj, _stat_REG_output.dyn_REG_get_Output_praiseId());
            switch(_stat_REG_output.dyn_REG_get_Output_praiseId())
            {
                case 0:
                    Output_praise0 subset_of_output_for_praise0 = (Output_praise0)_stat_REG_output.dyn_REG_get_OutputSubset();
                    subset_of_output_for_praise0.dyn_REG_set_output_praise0_value(OpenEpiCentre.io_PRAISE_get_Item_Output_praise0_Value());
                    break;

                case 1:
                    Output_praise1 subset_of_output_for_praise1 = (Output_praise1)_stat_REG_output.dyn_REG_get_OutputSubset();
                    subset_of_output_for_praise1.dyn_REG_set_output_praise1_value(OpenEpiCentre.io_PRAISE_get_Item_Output_praise1_Value());
                    break;

                case 2:
                    Output_praise0 subset_of_output_for_praise2 = (Output_praise0)_stat_REG_output.dyn_REG_get_OutputSubset();
                    subset_of_output_for_praise2.dyn_REG_set_output_praise0_value(OpenEpiCentre.io_PRAISE_get_Item_Output_praise2_Value());
                    break;

                case 3:
                    Output_praise0 subset_of_output_for_praise3 = (Output_praise0)_stat_REG_output.dyn_REG_get_OutputSubset();
                    subset_of_output_for_praise3.dyn_REG_set_output_praise0_value(OpenEpiCentre.io_PRAISE_get_Item_Output_praise3_Value());
                    break;
            }
            app_Encode_NetworkingSteam_At_Server_Output_Send(obj, _stat_REG_output, _stat_REG_Buffer_For_Ouput);
            Simulation.Print_PraiseEvent(_stat_REG_output);
            //todo send.
            //}
            WriteQue_SERVERINPUTRECIEVE.app_FUNCT_write_End(0);
        }
    }
    public void dyn_REG_boot1_DEFINE__SIMULATION() {
        stat_REG_boot1_DEFINE__SIMULATION();
    }
    public void dyn_REG_boot2_SUBSTANTIATE__SIMULATION(Input sample) {
        stat_REG_boot2_SUBSTANTIATE__SIMULATION(sample);
    }
    public void dyn_REG_boot3_INITIALISE__SIMULATION(Input sample) {
        stat_REG_boot3_INITIALISE__SIMULATION(sample);
    }
    public void stat_REG_boot1_DEFINE__SIMULATION() {
        stat_CLASS_boot1_DEFINE_SIMULATION__stat_REG_input_Sample();
    }
    private static void stat_CLASS_boot1_DEFINE_SIMULATION__stat_REG_input_Sample() {
        _SIM_stat_REG_input_Sample = null;
    }
    public void stat_REG_boot2_SUBSTANTIATE__SIMULATION(Input sample) {
        stat_REG_boot2_SUBSTANTIATE__SIMULATION__SIM_stat_REG_input_Sample(sample);
    }
    private static void stat_REG_boot2_SUBSTANTIATE__SIMULATION__SIM_stat_REG_input_Sample(Input sample) {
        sample.dyn_REG_boot2_SUBSTANTIATE_Input();
        _SIM_stat_REG_input_Sample = sample;
    }
    public void stat_REG_boot3_INITIALISE__SIMULATION(Input sample) {
        stat_REG_boot3_INITIALISE__SIMULATION__SIM_stat_REG_input_Sample(sample);
    }
    private static void stat_REG_boot3_INITIALISE__SIMULATION__SIM_stat_REG_input_Sample(Input sample) {
        _SIM_stat_REG_input_Sample = sample;
    }
}