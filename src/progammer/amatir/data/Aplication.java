package progammer.amatir.data;

public class Aplication {

    public static final int PROCESSORS;

    static {
        System.out.println("Mengakses class aplication");
        PROCESSORS = Runtime.getRuntime().availableProcessors();

    }


}
