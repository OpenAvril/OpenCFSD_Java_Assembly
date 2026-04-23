package SIMULATION;
import engine.Framework;
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
    private static Scanner _stat_REG_scanner;
    public Simulation()
    {
        _stat_REG_scanner = new Scanner(System.in);
    }
    public static void Prime(Framework objPtr)
    {
        obj = null;
        obj = objPtr;
    }
    public static void Terminate_stat_REG_scanner()
    {
        _stat_REG_scanner.close();
    }
    public static void Get_Praise_Event_Id_And_Data(Input input)
    {
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
    public static void Print_PraiseEvent(Output output)
    {
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
}