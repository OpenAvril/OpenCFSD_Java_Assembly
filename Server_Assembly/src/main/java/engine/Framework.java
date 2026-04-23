package engine;
import structs.*;
import threads.IO_ListenRespond;
import java.io.IOException;
public class Framework
{
    private static App _stat_CLASS_App;
    private static Global _stat_CLASS_Global;
    private static Algorithim _stat_STRUCT_Algorithim;
    private static Input _stat_STRUCT_Input;
    private static IO_ListenRespond _stat_STRUCT_IO_ListenRespond;
    private static Output _stat_STRUCT_Output;
    private static User_Algorithim _stat_STRUCT_User_Algorithims;
    private static User_Input _stat_STRUCT_User_Inputs;
    private static User_Output _stat_STRUCT_User_Outputs;
// public.
    public Framework() throws IOException {
        System.out.printf("entered CONSTRUCTOR Framework()%n");
        stat_CLASS_boot0_DECLAIRE_Framework_App();
        stat_CLASS_boot1_DEFINE_Framework_App();
        stat_CLASS_boot3_INITIALISE_Framework_App();
        stat_REG_boot0_DECLAIRE_Framework_App();
        System.out.printf("exiting CONSTRUCTOR Framework()%n");
    }
    public void dyn_CLASS_create_Global_and_Settings()
    {
        boot1_CLASS_DEFINE_Global();
        boot3_CLASS_INITIALISE_Global();
    }
    public App dyn_CLASS_get_App()
    {
        return stat_CLASS_get_App();
    }
    public Global dyn_CLASS_get_Global()
    {
        return stat_CLASS_get_Global();
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
    public void dyn_REG_boot4_INSTANTIATE_Framework_App(Framework obj) throws IOException {
        System.out.printf("entered dyn_REG_boot4_INSTANTIATE_Framework_App().%n");
        obj.dyn_CLASS_get_App().dyn_CLASS_get_Execute().dyn_REG_boot4_INSTANTIATE_Execute();
        System.out.printf("exiting dyn_REG_boot4_INSTANTIATE_Framework_App().%n");
    }
    public Algorithim dyn_STRUCT_get_Algorithim()
    {
        return stat_STRUCT_get_Algorithim();
    }
    public Input dyn_STRUCT_get_Input()
    {
        return stat_STRUCT_get_Input();
    }
    public Output dyn_STRUCT_get_Output()
    {
        return stat_STRUCT_get_Output();
    }
    public User_Algorithim dyn_STRUCT_get_User_Algorithim()
    {
        return stat_STRUCT_get_User_Algorithim();
    }
    public User_Input dyn_STRUCT_get_User_Input()
    {
        return stat_STRUCT_get_User_Input();
    }
    public User_Output dyn_STRUCT_get_User_Output()
    {
        return stat_STRUCT_get_User_Output();
    }
    public IO_ListenRespond dyn_STRUCT_get_IO_ListenRespond()
    {
        return stat_STRUCT_get_IO_ListenRespond();
    }
    public void dyn_STRUCT_boot0_DECLAIRE()
    {
        System.out.printf("entered stat_STRUCT_boot0_DECLAIRE().%n");

        System.out.printf("exiting stat_STRUCT_boot0_DECLAIRE().%n");
    }
    public void dyn_SRUCT_boot1_DEFINE()
    {
        System.out.printf("entered stat_STRUCT_boot1_DEFINE().%n");
        stat_STRUCT_boot1_DEFINE_User_Input();
        stat_STRUCT_boot1_DEFINE_User_Output();
        stat_STRUCT_boot1_DEFINE_User_Algorithim();
        stat_STRUCT_boot1_DEFINE_Algorithim();
        stat_STRUCT_boot1_DEFINE_Input();
        stat_STRUCT_boot1_DEFINE_Output();
        stat_STRUCT_boot1_DEFINE_IO_ListenRespond();
        System.out.printf("exiting stat_STRUCT_boot1_DEFINE().%n");
    }
    public void dyn_STRUCT_boot3_INITIALISE()
    {
        System.out.printf("entered stat_STRUCT_boot3_INITIALISE().%n");
        stat_STRUCT_boot3_INITIALISE_User_Input();
        stat_STRUCT_boot3_INITIALISE_User_Output();
        stat_STRUCT_boot3_INITIALISE_User_Algorithim();
        stat_STRUCT_boot3_INITIALISE_Algorithim();
        stat_STRUCT_boot3_INITIALISE_Input();
        stat_STRUCT_boot3_INITIALISE_Output();
        stat_STRUCT_boot3_INITIALISE_IO_ListenRespond();
        System.out.printf("exiting stat_STRUCT_boot3_INITIALISE().%n");
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
    private static void boot1_CLASS_DEFINE_Global()
    {
        System.out.printf("entered boot1_CLASS_DEFINE_Global().%n");
        _stat_CLASS_Global = null;
        System.out.printf("exiting boot1_CLASS_DEFINE_Global().%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_App() throws IOException {
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
    private static void stat_CLASS_boot3_INITIALISE_Framework_App() throws IOException {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_Framework_App().%n");
        stat_CLASS_boot3_INITIALISE_App();
        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Framework_App().%n");
    }
    private static void boot3_CLASS_INITIALISE_Global()
    {
        System.out.printf("entered boot3_CLASS_INITIALISE_Global().%n");
        _stat_CLASS_Global = new Global();
        try {
            stat_CLASS_get_Global();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
        System.out.printf("exiting boot3_CLASS_INITIALISE_Global().%n");
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
    private static void stat_STRUCT_boot1_DEFINE_Algorithim()
    {
        _stat_STRUCT_Algorithim = null;
    }
    private static void stat_STRUCT_boot1_DEFINE_Input()
    {
        _stat_STRUCT_Input = null;
    }
    private static void stat_STRUCT_boot1_DEFINE_Output()
    {
        _stat_STRUCT_Output = null;
    }
    private static void stat_STRUCT_boot1_DEFINE_User_Algorithim()
    {
        _stat_STRUCT_User_Algorithims = null;
    }
    private static void stat_STRUCT_boot1_DEFINE_User_Input()
    {
        _stat_STRUCT_User_Inputs = null;
    }
    private static void stat_STRUCT_boot1_DEFINE_User_Output()
    {
        _stat_STRUCT_User_Outputs = null;
    }
    private static void stat_STRUCT_boot1_DEFINE_IO_ListenRespond()
    {
        _stat_STRUCT_IO_ListenRespond = null;
    }
    private static void stat_STRUCT_boot3_INITIALISE_Algorithim()
    {
        _stat_STRUCT_Algorithim = new Algorithim();
        try {
            stat_STRUCT_get_Algorithim();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
    }
    private static void stat_STRUCT_boot3_INITIALISE_Input()
    {
        _stat_STRUCT_Input = new Input();
        try {
            stat_STRUCT_get_Input();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
    }
    private static void stat_STRUCT_boot3_INITIALISE_Output()
    {
        _stat_STRUCT_Output = new Output();
        try {
            stat_STRUCT_get_Output();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
    }
    private static void stat_STRUCT_boot3_INITIALISE_User_Algorithim()
    {
        _stat_STRUCT_User_Algorithims = new User_Algorithim();
        try {
            stat_STRUCT_get_User_Algorithim();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
    }
    private static void stat_STRUCT_boot3_INITIALISE_User_Input()
    {
        _stat_STRUCT_User_Inputs = new User_Input();
        try {
            stat_STRUCT_get_User_Input();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
      }
    private static void stat_STRUCT_boot3_INITIALISE_User_Output()
    {
        _stat_STRUCT_User_Outputs = new User_Output();
        try {
            stat_STRUCT_get_User_Output();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
    }
    private static void stat_STRUCT_boot3_INITIALISE_IO_ListenRespond()
    {
        _stat_STRUCT_IO_ListenRespond = new IO_ListenRespond();
        try {
            stat_STRUCT_get_IO_ListenRespond();
        }
        catch (NullPointerException e) {
            System.out.printf("NullPointerException.%n");
        }
    }
    private static Algorithim stat_STRUCT_get_Algorithim()
    {
        return _stat_STRUCT_Algorithim;
    }
    private static Input stat_STRUCT_get_Input()
    {
        return _stat_STRUCT_Input;
    }
    private static IO_ListenRespond stat_STRUCT_get_IO_ListenRespond()
    {
        return _stat_STRUCT_IO_ListenRespond;
    }
    private static Output stat_STRUCT_get_Output()
    {
        return _stat_STRUCT_Output;
    }
    private static User_Input stat_STRUCT_get_User_Input()
    {
        return _stat_STRUCT_User_Inputs;
    }
    private static User_Output stat_STRUCT_get_User_Output()
    {
        return _stat_STRUCT_User_Outputs;
    }
    private static User_Algorithim stat_STRUCT_get_User_Algorithim()
    {
        return _stat_STRUCT_User_Algorithims;
    }
    private static Global stat_CLASS_get_Global()
    {
        return _stat_CLASS_Global;
    }
}