import java.util.HashMap;
import java.util.Map;

public class Empleado {
    private String nombre;
    private String apellido;
    private String legajo;
    private int aniosTrabajados;

    public Empleado(String nombre, String apellido, String legajo, int aniosTrabajados) throws IllegalArgumentException {
        if (nombre.isEmpty() || apellido.isEmpty() || legajo.isEmpty() || aniosTrabajados <= 0) {
            throw new IllegalArgumentException("Todos los campos son obligatorios y aniosTrabajados > 0");
        }
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.aniosTrabajados = aniosTrabajados;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo='" + legajo + '\'' +
                ", aniosTrabajados=" + aniosTrabajados +
                '}';
    }

    public static Empleado fromString(String cadena) throws IllegalArgumentException {
        Map<String, String> mapaCampos = new HashMap<>();

        String[] campos = cadena.split(",\\s*");

        for (String campo : campos) {
            String[] separado = campo.split("=");

            if (separado.length != 2) {
                throw new IllegalArgumentException("Cadena invalida: " + cadena);
            }

            mapaCampos.put(separado[0].toLowerCase(), separado[1]);
        }

        if (!mapaCampos.containsKey("nombre") || !mapaCampos.containsKey("apellido") || !mapaCampos.containsKey("legajo") || !mapaCampos.containsKey("aniotrabajados")) {
            throw new IllegalArgumentException("Faltan campos requeridos en la cadena: " + cadena);
        }

        String nombre = mapaCampos.get("nombre").trim();
        String apellido = mapaCampos.get("apellido").trim();
        String legajo = mapaCampos.get("legajo").trim();
        String aniosTrabajadosString = mapaCampos.get("aniotrabajados").trim();

        if (nombre.isEmpty() || apellido.isEmpty() || legajo.isEmpty() || aniosTrabajadosString.isEmpty()) {
            throw new IllegalArgumentException("Todos los campos son obligatorios y aniosTrabajados >0");
        }

        int aniosTrabajados = 0;

        try {
            aniosTrabajados = Integer.parseInt(aniosTrabajadosString);

            if (aniosTrabajados <= 0) {
                throw new IllegalArgumentException("aniosTrabajados debe ser mayor a cero");
            }
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("aniosTrabajados debe ser un valor numérico entero");
        }

        return new Empleado(nombre, apellido, legajo, aniosTrabajados);
    }
}

