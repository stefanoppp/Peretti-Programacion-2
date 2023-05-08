import Hilos.ThreadFactorial;
import Hilos.ThreadRunnable;

public class Main {
    public static void main(String[] args) {
        ThreadRunnable hilo_productor=new ThreadRunnable();
        hilo_productor.run();
        ThreadFactorial hilo_consumidor = new ThreadFactorial("Hilo 1", hilo_productor.getLista());
        ThreadFactorial hilo_consumidor2 = new ThreadFactorial("Hilo 1", hilo_productor.getLista());
        hilo_consumidor.start();
        hilo_consumidor2.start();

    }
}
