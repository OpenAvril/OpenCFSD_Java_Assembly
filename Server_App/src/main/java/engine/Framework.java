package engine;
import structs.*;
public class Framework
{
    private static App _stat_CLASS_App;
    private static Input _stat_STRUCT_Input;
    private static Output _stat_STRUCT_Output;
    private static User_Input _stat_STRUCT_User_Input;
    private static User_Output _stat_STRUCT_User_Output;
// public.
    public Framework() 
    {
        System.out.printf("entered CONSTRUCTOR Framework()%n");
        stat_CLASS_boot0_DECLAIRE_Framework_App();
        stat_CLASS_boot1_DEFINE_Framework_App();
        stat_CLASS_boot3_INITIALISE_Framework_App();
        stat_REG_boot0_DECLAIRE_Framework_App();
        System.out.printf("exiting CONSTRUCTOR Framework()%n");
    }
    public App dyn_CLASS_get_App()
    {
        return stat_CLASS_get_App();
    }
    public void dyn_REG_boot1_DEFINE_Framework_App(Framework obj)
    {
        System.out.printf("entered dyn_REG_boot1_DEFINE_Framework_App().%n");

        System.out.printf("exiting dyn_REG_boot1_DEFINE_Framework_App().%n");
    }
    public void dyn_REG_boot2_SUBSTANTIATE_Framework_App(Framework obj)
    {
        System.out.printf("entered dyn_REG_boot2_SUBSTANTIATE_Framework_App().%n");

        System.out.printf("exiting dyn_REG_boot2_SUBSTANTIATE_Framework_App().%n");
    }
    public void dyn_REG_boot3_INITIALISE_Framework_App(Framework obj, Input structDEFAULT_Input, Output structDEFAULT_Output)
    {
        System.out.printf("entered dyn_REG_boot3_INITIALISE_Framework_App().%n");

        System.out.printf("exiting dyn_REG_boot3_INITIALISE_Framework_App().%n");
    }
    public void dyn_REG_boot4_INSTANTIATE_Framework_App(Framework obj)
    {
        System.out.printf("entered dyn_REG_boot4_INSTANTIATE_Framework_App().%n");
        byte[] bytes;
        bytes = null;
        bytes = new byte[1];
        bytes[0] = (byte)(1);
        float praise0_Input_valueA;
        praise0_Input_valueA = (float)(1.2);
        float praise0_Input_valueB;
        praise0_Input_valueB = (float)(2.6);
        Object[] inputValues;
        inputValues = new Object[2];
        inputValues[0] = (Object)praise0_Input_valueA;
        inputValues[1] = (Object)praise0_Input_valueB;
        
        obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_REG_boot4_INSTANTIATE_Execute();

        //todo.
        
        System.out.printf("exiting dyn_REG_boot4_INSTANTIATE_Framework_App().%n");
    }
    public void dyn_STRUCT_boot0_DECLAIRE()
    {
        System.out.printf("entered stat_STRUCT_boot0_DECLAIRE().%n");
        
        System.out.printf("exiting stat_STRUCT_boot0_DECLAIRE().%n");
    }
    public void dyn_SRUCT_boot1_DEFINE()
    {
        System.out.printf("entered stat_STRUCT_boot1_DEFINE().%n");
        stat_STRUCT_boot1_DEFINE_Input();
        stat_STRUCT_boot1_DEFINE_Output();
        stat_STRUCT_boot1_DEFINE_User_Input();
        stat_STRUCT_boot1_DEFINE_User_Output();
        System.out.printf("exiting stat_STRUCT_boot1_DEFINE().%n");
    }
    public void dyn_STRUCT_boot3_INITIALISE()
    {
        System.out.printf("entered stat_STRUCT_boot3_INITIALISE().%n");
        stat_STRUCT_boot3_INITIALISE_Input();
        stat_STRUCT_boot3_INITIALISE_Output();
        stat_STRUCT_boot3_INITIALISE_User_Input();
        stat_STRUCT_boot3_INITIALISE_User_Output();
        System.out.printf("exiting stat_STRUCT_boot3_INITIALISE().%n");
    }
    public Input dyn_STRUCT_get_Input()
    {
        return stat_STRUCT_get_Input();
    }
    public Output dyn_STRUCT_get_Output()
    {
        return stat_STRUCT_get_Output();
    }
       public User_Input dyn_STRUCT_get_User_Input()
    {
        return stat_STRUCT_get_User_Input();
    }
    public User_Output dyn_STRUCT_get_User_Output()
    {
        return stat_STRUCT_get_User_Output();
    }
// private.
    private static void stat_CLASS_boot0_DECLAIRE_Framework_App()
    {
        System.out.printf("entered stat_CLASS_boot0_DECLAIRE_Framework_App().%n");

        System.out.printf("exiting stat_CLASS_boot0_DECLAIRE_Framework_App().%n");
    }
    private static void stat_CLASS_boot1_DEFINE_App()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_App().%n");
        _stat_CLASS_App = null;
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_App().%n");
    }
    private static void stat_CLASS_boot1_DEFINE_Framework_App()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_Framework_App().%n");
        stat_CLASS_boot1_DEFINE_App();
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_Framework_App().%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_App()
    {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_App().%n");
        _stat_CLASS_App = new App();
        try {
                stat_CLASS_get_App();
        } 
        catch (NullPointerException e) {
                System.out.printf("NullPointerException.%n");
        }
        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_App().%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_Framework_App()
    {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_Framework_App().%n");
        stat_CLASS_boot3_INITIALISE_App();
        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Framework_App().%n");
    }
    private static App stat_CLASS_get_App()
    {
        return _stat_CLASS_App;
    }
    private static void stat_REG_boot0_DECLAIRE_Framework_App()
    {
        System.out.printf("entered stat_REG_boot0_DECLAIRE_Framework_App().%n");

        System.out.printf("exiting stat_REG_boot0_DECLAIRE_Framework_App().%n");
    }
    private static void stat_STRUCT_boot1_DEFINE_Input()
    {
        _stat_STRUCT_Input = null;
    }
    private static void stat_STRUCT_boot1_DEFINE_Output()
    {
        _stat_STRUCT_Output = null;
    }
    private static void stat_STRUCT_boot1_DEFINE_User_Input()
    {
        _stat_STRUCT_User_Input = null;
    }
    private static void stat_STRUCT_boot1_DEFINE_User_Output()
    {
        _stat_STRUCT_User_Output = null;
    }
    private static void stat_STRUCT_boot3_INITIALISE_Input()
    {
        _stat_STRUCT_Input = new Input();
        while(stat_STRUCT_get_Input() == null) { }
    }
    private static void stat_STRUCT_boot3_INITIALISE_Output()
    {
        _stat_STRUCT_Output = new Output();
        while(stat_STRUCT_get_Output() == null) { }
    }
    private static void stat_STRUCT_boot3_INITIALISE_User_Input()
    {
        _stat_STRUCT_User_Input = new User_Input();
        while(stat_STRUCT_get_User_Input() == null) { }
    }
    private static void stat_STRUCT_boot3_INITIALISE_User_Output()
    {
        _stat_STRUCT_User_Output = new User_Output();
        while(stat_STRUCT_get_User_Output() == null) { }
    }
    private static Input stat_STRUCT_get_Input()
    {
        return _stat_STRUCT_Input;
    }
    private static Output stat_STRUCT_get_Output()
    {
        return _stat_STRUCT_Output;
    }
    private static User_Input stat_STRUCT_get_User_Input()
    {
        return _stat_STRUCT_User_Input;
    }
    private static User_Output stat_STRUCT_get_User_Output()
    {
        return _stat_STRUCT_User_Output;
    }
}