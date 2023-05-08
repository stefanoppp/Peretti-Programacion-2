import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newFixedThreadPool(5);

        Future<String> task1=executor.submit(new HiloCallable("Stefano"));
        Future<String> task2=executor.submit(new HiloCallable("Juan"));
        Future<String> task3=executor.submit(new HiloCallable("Pedro"));
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