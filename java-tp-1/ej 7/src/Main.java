public class Main {
    public static void main(String[] args) {
        String empleadoString = "nombre=Pablo, apellido=Marquez, legajo=E001, aniosTrabajados=10";
        try {

            String empleadoString2 = "nombre=Pablo, apellido=, legajo=E001, aniosTrabajados=10";
            Empleado empleado2 = Empleado.fromString(empleadoString2);

            String empleadoString3 = "nombre=Pablo, apellido=Marquez, legajo=E001, aniosTrabajados=0";
            Empleado empleado3 = Empleado.fromString(empleadoString3);

            String empleadoString4 = "nombre=Pablo, apellido=Marquez, legajo=E001, aniosTrabajados=abc";
            Empleado empleado4 = Empleado.fromString(empleadoString4);

        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear el empleado: " + e.getMessage());
        }
    }
}
