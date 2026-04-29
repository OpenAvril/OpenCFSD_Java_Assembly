package OpenCFSD_Java_Assembly;
import SIMULATION.Simulation;
import engine.Framework;
import engine.Global;
import lib.JavaLIB_OpenEpiCentre;
import main.IO.OpenEpiCentre;
import main.IO.ServerAssembly;
import java.io.IOException;
import java.util.Arrays;
public class Main
{
    private static Framework _stat_PGM_ClientAssembly = null;
    // public.
    public static void main(String[] args) throws IOException {
        System.out.printf("entered first member function, main().%n");

        System.out.printf("loading SIMULATION static class.%n");
        Simulation sim = new Simulation();//SIMULATION
        System.out.printf("done SIMULATION loading.%n");

        _stat_PGM_ClientAssembly = ServerAssembly.app_generate_Program();
        System.out.printf("==========%n");
        System.out.printf("declaration.%n");
        System.out.printf("definition.%n");
        System.out.printf("substantiation.%n");
        System.out.printf("initialisation.%n");
        System.out.printf("instantiation.%n");
        System.out.printf("running.%n");
        System.out.printf("==========%n");
        System.out.printf("SIMULATION%n");
        Simulation.Prime(_stat_PGM_ClientAssembly);
        byte[] temp = new byte[1];
        try {
            temp = JavaLIB_OpenEpiCentre.INSTANCE.dyn_REG_get_flag_isStackLoaded_Server_InputAction();
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

        System.out.printf("isStackLoaded_Server_InputAction ByteArray: " + Arrays.toString(temp) + ".%n");
        System.out.printf("isStackLoaded_Server_InputAction: " + OpenEpiCentre.dyn_REG_get_flag_isStackLoaded_Server_InputAction() + ".%n");
    }
}