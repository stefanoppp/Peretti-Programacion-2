import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new Empleado("Juan", "Perez", 1, 5));
        listaEmpleados.add(new Empleado("Maria", "Gomez", 2, 3));
        listaEmpleados.add(new Empleado("Pedro", "Lopez", 3, 2));
        listaEmpleados.add(new Empleado("Luisa", "Gonzalez", 4, 4));
        listaEmpleados.add(new Empleado("Carlos", "Fernandez", 5, 1));

        Map<String, Empleado> mapaEmpleados = new HashMap<>();

        for (Empleado empleado : listaEmpleados) {
            String clave = empleado.getApellido() + "," + empleado.getNombre();
            mapaEmpleados.put(clave, empleado);
        }

        for (Map.Entry<String, Empleado> entry : mapaEmpleados.entrySet()) {
            String clave = entry.getKey();
            Empleado empleado = entry.getValue();
            System.out.println("Clave: " + clave + " - Empleado: " + empleado);
        }
    }
}
