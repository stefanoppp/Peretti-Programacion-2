package Hilos;
import java.util.List;
import java.util.concurrent.Callable;

public class ThreadFactorial implements Callable<String> {
    private String nombre;
    private List<Integer> lista;
    private int procesados;

    public ThreadFactorial(String nombre, List<Integer> lista) {
        this.nombre = nombre;
        this.lista = lista;
        this.procesados = 0;
    }

    @Override
    public String call() {
        System.out.println("Hilo " + this.nombre + " procesando la lista.");
        while (!lista.isEmpty()) {
            int valor = lista.remove(0);
            int resultado= calcularFactorial(valor);
            System.out.println("Hilo " + this.nombre + " procesando la lista. Valor a calcular: " + valor + ". Resultado: " + resultado + ". Quedan " + lista.size() + " elementos.");
            procesados++;
            if (resultado>3000000){
                System.out.println("Resultado mayor a 30.000.000");
            }
        }

        return "Nombre del thread: " + this.nombre + " ha procesado " + this.procesados + " elementos de la lista.";
    }

    private int calcularFactorial(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}