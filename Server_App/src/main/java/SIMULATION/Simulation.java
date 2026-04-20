package SIMULATION;

import structs.Input;
import structs.Output;

import java.util.Scanner;

public class Simulation
{
    public Simulation()
    {

    }
    public static void Get_Praise_Event_Id_And_Data(Input input)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter PraiseEventId: ");
        int praiseEventId = scanner.nextInt(); // Program waits here
        input.dyn_REG_set_Input_praiseId(praiseEventId);


        scanner.close();
    }
    public static void Print_PraiseEvent(Output output)
    {

    }
}