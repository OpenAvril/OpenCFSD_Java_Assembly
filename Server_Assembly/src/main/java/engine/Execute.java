package engine;

import main.IO;
import com.sun.jna.Pointer;

public class Execute 
{
    private static Pointer _stat_PGM_ConcurrentIOServer;
// public.
    public Execute() 
    {
        System.out.printf("entered CLASS Execute()%n");
        stat_CLASS_boot0_DECLAIRE_Execute();
        stat_CLASS_boot1_DEFINE_Execute();
        stat_CLASS_boot3_INITIALISE_Execute();
        stat_REG_boot0_DECLAIRE_Execute();
        System.out.printf("exiting CLASS Execute()%n");
    }
    public void dyn_REG_boot1_DEFINE_Execute(Framework obj)
    {
        System.out.printf("entered dyn_REG_boot1_DEFINE_Execute().%n");

        System.out.printf("exiting dyn_REG_boot1_DEFINE_Execute().%n");
    }
    public void dyn_REG_boot2_SUBSTANTIATE_Execute(Framework obj)
    {
        System.out.printf("entered dyn_REG_boot2_SUBSTANTIATE_Execute().%n");

        System.out.printf("exiting dyn_REG_boot2_SUBSTANTIATE_Execute().%n");
    }
    public void dyn_REG_boot3_INITIALISE_Execute(Framework obj)
    {
        System.out.printf("entered dyn_REG_boot3_INITIALISE_Execute().%n");

        System.out.printf("exiting dyn_REG_boot3_INITIALISE_Execute().%n");
    }
    public void dyn_REG_boot4_INSTANTIATE_Execute(Framework obj)
    {
        System.out.printf("entered dyn_REG_boot4_INSTANTIATE_Execute().%n");

        System.out.printf("exiting dyn_REG_boot4_INSTANTIATE_Execute().%n");
    }
    public Pointer dyn_PGM_get_ConcurrentIOServer()
    {
        return stat_PGM_get_ConcurrentIOServer();
    }
    static private void stat_CLASS_boot0_DECLAIRE_Execute()
    {
        System.out.printf("entered stat_CLASS_boot0_DECLAIRE_Execute().%n");

        System.out.printf("exiting stat_CLASS_boot0_DECLAIRE_Execute().%n");
    }
    private static void stat_CLASS_boot1_DEFINE_Execute()
    {
        System.out.printf("entered stat_CLASS_boot1_DEFINE_Execute().%n");
        stat_PGM_boot1_DEFINE_ConcurrentIOServer();
        System.out.printf("exiting stat_CLASS_boot1_DEFINE_Execute().%n");
    }
    private static void stat_CLASS_boot3_INITIALISE_Execute()
    {
        System.out.printf("entered stat_CLASS_boot3_INITIALISE_Execute().%n");
        stat_PGM_boot3_INITIALISE_ConcurrentIOServer();
        System.out.printf("exiting stat_CLASS_boot3_INITIALISE_Execute().%n");
    }
    private static void stat_REG_boot0_DECLAIRE_Execute()
    {
            System.out.printf("entered stat_REG_boot0_DECLAIRE_Execute().%n");

            System.out.printf("exiting stat_REG_boot0_DECLAIRE_Execute().%n");
    }
// private.
    private static void stat_PGM_boot1_DEFINE_ConcurrentIOServer()
    {
        System.out.printf("entered Execute stat_PGM_boot3_INITIALISE_ConcurrentIOServer().%n");
        _stat_PGM_ConcurrentIOServer = null;
        System.out.printf("exiting Execute stat_PGM_boot3_INITIALISE_ConcurrentIOServer().%n");
    }
    private static void stat_PGM_boot3_INITIALISE_ConcurrentIOServer()
    {
        System.out.printf("entered stat_PGM_boot3_INITIALISE_ConcurrentIOServer().%n");
        try {
            _stat_PGM_ConcurrentIOServer = IO.app_FUNCT_ConcurrentIOServer_generate_Program();
        } 
        catch (NoClassDefFoundError e) {
                System.out.printf("NoClassDefFoundError.%n");
        }
        catch (NullPointerException e) {
                System.out.printf("NullPointerException.%n");
        }
        catch (UnsatisfiedLinkError e) {
            System.out.printf("UnsatisfiedLinkError.%n");
        }
        System.out.printf("exiting stat_PGM_boot3_INITIALISE_ConcurrentIOServer().%n");
    }
    private static Pointer stat_PGM_get_ConcurrentIOServer()
    {
        return _stat_PGM_ConcurrentIOServer;
    }
}