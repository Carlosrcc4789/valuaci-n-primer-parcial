import java.util.ArrayList;
import java.util.List;
class ProgramaPrincipal {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Ana", 30, 2500));
        empleados.add(new Empleado("Luis", 45, 3200));
        empleados.add(new Empleado("Marta", 28, 2800));
        empleados.add(new Empleado("Pedro", 50, 2900));
        empleados.add(new Empleado("Laura", 35, 3500));
        for (Empleado empleado : empleados) {
            empleado.aplicarAumento();
        }
        for (Empleado empleado : empleados) {
            empleado.mostrarInformacion();
        }
    }
}
