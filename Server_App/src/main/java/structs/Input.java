package structs;
import engine.Framework;
public class Input
{
    private static int _stat_REG_Input_paiseId;
    private static Object _stat_REG_InputSubset;
// public.
    public Input() 
    {
        System.out.printf("entered STRUCT_CLASS Input()%n");
        stat_CLASS_boot0_DECLAIRE_Input();
        stat_CLASS_boot1_DEFINE_Input();
        stat_CLASS_boot3_INITIALISE_Input();
        stat_REG_boot0_DECLAIRE_Input();
        System.out.printf("exiting STRUCT_CLASS Input()%n");
    }
    public void dyn_REG_boot1_DEFINE_Input()
    {
        System.out.printf("entered dyn_REG_boot1_DEFINE_Input().%n");
        stat_REG_boot1_DEFINE_Input_paiseId();
        System.out.printf("exiting dyn_REG_boot1_DEFINE_Input().%n");
    }
    public void dyn_REG_boot2_SUBSTANTIATE_Input()
    {
        System.out.printf("entered dyn_REG_boot2_SUBSTANTIATE_Input().%n");
        stat_REG_boot2_SUBSTANTIATE_Input_paiseId();
        stat_REG_boot2_SUBSTANTIATE_InputSubset();
        System.out.printf("exiting dyn_REG_boot2_SUBSTANTIATE_Input().%n");
    }
    public void dyn_REG_boot3_INITIALISE_Input(Framework obj, User_Input objUserInput)
    {
        System.out.printf("entered dyn_REG_boot3_INITIALISE_Input().%n");
        stat_REG_boot3_INITIALISE_Input_paiseId();
        stat_REG_boot3_INITIALISE_InputSubset(objUserInput);
        System.out.printf("exiting dyn_REG_boot3_INITIALISE_Input().%n");
    }
    public void dyn_REG_boot4_INSTANTIATE_Input()
    {
        System.out.printf("entered dyn_REG_boot4_INSTANTIATE_Input().%n");

        System.out.printf("exiting dyn_REG_boot4_INSTANTIATE_Input().%n");
    }
    public int dyn_REG_get_Input_praiseId()
    {
        return stat_REG_get_Input_praiseId();
    }
    public Object dyn_REG_get_InputSubset()
    {
        return stat_REG_get_InputSubset();
    }
// private.
    private static void stat_CLASS_boot0_DECLAIRE_Input()
    {
        System.out.printf("entered stat_CLASS_boot0_DECLAIRE_Input().%n");

        System.out.printf("exiting stat_CLASS_boot0_DECLAIRE_Input().%n");
    }
    private static void stat_CLASS_boot1_DEFINE_Input()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_Input().%n");

        System.out.printf("exiting stat_CLASS_boot1_DEFINE_Input().%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_Input()
    {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_Input().%n");
        
        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Input().%n");
    }
    private static void stat_REG_boot0_DECLAIRE_Input()
    {
        System.out.printf("entered stat_REG_boot0_DECLAIRE_Input().%n");

        System.out.printf("exiting stat_REG_boot0_DECLAIRE_Input().%n");
    }
    private static void stat_REG_boot1_DEFINE_Input_paiseId()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_Input_paiseId().%n");
        _stat_REG_InputSubset = null;
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_Input_paiseId().%n");
    }
    private static void stat_REG_boot2_SUBSTANTIATE_Input_paiseId()
    {
        System.out.printf("entered stat_REG_boot2_SUBSTANTIATE_Input_paiseId().%n");
        _stat_REG_Input_paiseId = Integer.MAX_VALUE;
        System.out.printf("exiting stat_REG_boot2_SUBSTANTIATE_Input_paiseId().%n");
    }
    private static void stat_REG_boot2_SUBSTANTIATE_InputSubset()
    {
        System.out.printf("entered stat_REG_boot2_SUBSTANTIATE_InputSubset().%n");
        _stat_REG_InputSubset = new Object();
        while(stat_REG_get_InputSubset() == null) { }
        System.out.printf("exiting stat_REG_boot2_SUBSTANTIATE_InputSubset().%n");
    }
    private static void stat_REG_boot3_INITIALISE_Input_paiseId()
    {
        System.out.printf("entered stat_REG_boot3_INITIALISE_Input_paiseId().%n");
        _stat_REG_Input_paiseId = (int)(0);
        System.out.printf("exiting stat_REG_boot3_INITIALISE_Input_paiseId().%n");
    }
    private static void stat_REG_boot3_INITIALISE_InputSubset(User_Input objUserInput)
    {
        System.out.printf("entered stat_REG_boot3_INITIALISE_InputSubset().%n");
        _stat_REG_InputSubset = objUserInput.dyn_REG_get_Item_On_List_Of_InputSubsets(0);
        System.out.printf("exiting stat_REG_boot3_INITIALISE_InputSubset().%n");
    }
    private static int stat_REG_get_Input_praiseId()
    {
        return _stat_REG_Input_paiseId;
    }
    private static Object stat_REG_get_InputSubset()
    {
        return _stat_REG_InputSubset;
    }
}