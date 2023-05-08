import java.util.Random;
import java.util.concurrent.Callable;

public class HiloCallable implements Callable<String> {
    private String nombre;
    private int random_it;
    private int random_delay;

    // Constructor
    public HiloCallable(String nombre) {
        this.nombre = nombre;

        // Generar un número aleatorio entre 10 y 40
        Random random1 = new Random();
        this.random_it = random1.nextInt(31) + 10;

        // Generar un número aleatorio entre 50 y 999
        Random random2 = new Random();
        this.random_delay = random2.nextInt(950) + 50;
    }

    public String call() {

        try{
            Hilo.sleep(random_delay);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return "Nombre: "+this.nombre+". Iteracion: "+this.random_it+ " y delay de "+this.random_delay;
    }
}

