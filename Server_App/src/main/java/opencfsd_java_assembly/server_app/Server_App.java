package opencfsd_java_assembly.server_app;
import SIMULATION.Simulation;
import engine.Framework;
import main.IO.OpenEpiCentre;
import main.IO.ServerAssembly;
public class Server_App
{
    private static Framework _stat_PGM_ClientAssembly = null;
// public.
    public static void main(String[] args) {
        System.out.printf("entered first member function, main().%n");

        System.out.printf("loading SIMULATION static class.%n");
        Simulation sim = new Simulation();
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



    }
}
