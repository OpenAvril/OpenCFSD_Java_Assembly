package engine;
import com.sun.jna.Pointer;
import main.IO.ConcurrentIOServer;
import main.IO.Praise0;
public class Framework
{
    private static App _stat_CLASS_App;
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
    public void dyn_REG_boot3_INITIALISE_Framework_App(Framework obj)
    {
        System.out.printf("entered dyn_REG_boot3_INITIALISE_Framework_App().%n");

        System.out.printf("exiting dyn_REG_boot3_INITIALISE_Framework_App().%n");
    }
    public void dyn_REG_boot4_INSTANTIATE_Framework_App(Framework obj)
    {
        System.out.printf("entered dyn_REG_boot4_INSTANTIATE_Framework_App().%n");
        //ConcurrentIOServer.app_FUNCT_generate_Program();
        
        byte[] bytes;
        bytes = null;
        bytes = new byte[1];
        bytes[0] = (byte)1;
        float praise0_Input_valueA;
        praise0_Input_valueA = (float)1.2;
        float praise0_Input_valueB;
        praise0_Input_valueB = (float)2.6;
        Object[] inputValues;
        inputValues = new Object[2];
        inputValues[0] = (Object)praise0_Input_valueA;
        inputValues[1] = (Object)praise0_Input_valueB;
        
        ConcurrentIOServer.app_DoPRAISE(Pointer.NULL, (byte)0, inputValues);
        //todo.
        
        System.out.printf("exiting dyn_REG_boot4_INSTANTIATE_Framework_App().%n");
    }
    public static void stat_CLASS_boot0_DECLAIRE_Framework_App()
    {
        System.out.printf("entered stat_CLASS_boot0_DECLAIRE_Framework_App().%n");

        System.out.printf("exiting stat_CLASS_boot0_DECLAIRE_Framework_App().%n");
    }
    private static void stat_CLASS_boot1_DEFINE_Framework_App()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_Framework_App().%n");
        stat_CLASS_boot1_DEFINE_App();
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_Framework_App().%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_Framework_App()
    {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_Framework_App().%n");
        stat_CLASS_boot3_INITIALISE_App();
        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Framework_App().%n");
    }
    private static void stat_REG_boot0_DECLAIRE_Framework_App()
    {
        System.out.printf("entered stat_REG_boot0_DECLAIRE_Framework_App().%n");

        System.out.printf("exiting stat_REG_boot0_DECLAIRE_Framework_App().%n");
    }
// private.
    private static void stat_CLASS_boot1_DEFINE_App()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_App().%n");
        _stat_CLASS_App = null;
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_App().%n");
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
    private static App stat_CLASS_get_App()
    {
        return _stat_CLASS_App;
    }
}