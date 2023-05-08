import Hilos.ThreadFactorial;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            lista.add((int) (Math.random() * 13) + 3);
        }

        ExecutorService executor= Executors.newFixedThreadPool(5);
        Future<String> task1=executor.submit(new ThreadFactorial("Hilo 1",lista));
        Future<String> task2=executor.submit(new ThreadFactorial("Hilo 2",lista));
        Future<String> task3=executor.submit(new ThreadFactorial("Hilo 3",lista));

        try{
            System.out.println(task1.get());
            System.out.println(task2.get());
            System.out.println(task3.get());

        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
