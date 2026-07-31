package OpenCFSD_Java_Assembly;
import engine.Framework;
import java.io.IOException;
import main.IO.ServerAssembly;
public class Main
{
    private static Framework _stat_PGM_ClientAssembly = null;
    // public.
    public static void main(String[] args) throws IOException {
        System.out.printf("entered first member function, main().%n");
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