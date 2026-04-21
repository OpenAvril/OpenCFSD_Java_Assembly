package SIMULATION;

import structs.Input;
import structs.Output;
import structs.praisesubsets.*;

import java.util.Scanner;

public class Simulation
{
    private static Scanner _stat_REG_scanner;
    public Simulation()
    {
        _stat_REG_scanner = new Scanner(System.in);
    }
    public static void Get_Praise_Event_Id_And_Data(Input input)
    {
        System.out.printf("Enter PraiseEventId: ");
        int praiseEventId = _stat_REG_scanner.nextInt(); // Program waits here
        input.dyn_REG_set_Input_praiseId(praiseEventId);
        switch(input.dyn_REG_get_Input_praiseId())
        {
            case 0:
                var input_suber0 = (Input_praise0)input.dyn_REG_get_InputSubset();
                System.out.printf("Enter input Subset0 valueA: ");
                input_suber0.dyn_REG_set_input_praise0_valueA(_stat_REG_scanner.nextFloat());
                System.out.printf("Enter input Subset0 valueB: ");
                input_suber0.dyn_REG_set_input_praise0_valueB(_stat_REG_scanner.nextFloat()); // Program waits here
                break;
        }
        _stat_REG_scanner.close();
    }
    public static void Print_PraiseEvent(Output output)
    {
        System.out.printf("Press enter to see next praise event data from server output:");
        String enterisFLAG = _stat_REG_scanner.nextLine();
        if(enterisFLAG == "")
        {
            System.out.printf("Enter PraiseEventId: " + output.dyn_REG_get_Output_praiseId());
            switch(output.dyn_REG_get_Output_praiseId())
            {
                case 0:
                    var output_subset0 = (Output_praise0)output.dyn_REG_get_OutputSubset();
                    System.out.printf("output subset0 value: " + output_subset0.dyn_REG_get_output_praise0_value());
                    break;

                case 1:
                    var output_subset1 = (Output_praise1)output.dyn_REG_get_OutputSubset();
                    System.out.printf("output subset1 value: " + output_subset1.dyn_REG_get_output_praise1_value());
                    break;

                case 2:
                    var output_subset2 = (Output_praise2)output.dyn_REG_get_OutputSubset();
                    System.out.printf("output subset2 value: " + output_subset2.dyn_REG_get_output_praise2_value());
                    break;

                case 3:
                    var output_subset3 = (Output_praise3)output.dyn_REG_get_OutputSubset();
                    System.out.printf("output subset3 value: " + output_subset3.dyn_REG_get_output_praise3_value());
                    break;
            }
            _stat_REG_scanner.close();
        }
    }
}