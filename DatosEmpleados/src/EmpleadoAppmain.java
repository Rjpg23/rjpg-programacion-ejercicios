import javax.swing.*;
import java.io.IOException;

public class EmpleadoAppmain {
    public static void main(String[] args) throws IOException {
        Empleado empleado = ingresarDatosEmpleado();

        int option;
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción:\n1. Modificar salario\n2. Calcular edad\n3. Calcular prestaciones\n4. Mostrar información del empleado\n5. Salir"));
            switch (option) {
                case 1:
                    double nuevoSalario = Double.parseDouble(JOptionPane.showInputDialog("\nIngrese el nuevo salario:\n"));
                    empleado.setSalario(nuevoSalario);
                    JOptionPane.showMessageDialog(null, "\nSalario actualizado.\n");
                    break;
                case 2:
                    int edad = empleado.calcularEdad();
                    JOptionPane.showMessageDialog(null, "\nLa edad del empleado es: \n" + edad + " años.");
                    break;
                case 3:
                    double prestaciones = empleado.calcularPrestaciones();
                    JOptionPane.showMessageDialog(null, "\nLas prestaciones del empleado son: \n" + prestaciones);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, empleado.toString());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (option != 5);
    }

    private static Empleado ingresarDatosEmpleado() {
        String cedula = JOptionPane.showInputDialog("\nIngrese la cédula del empleado:\n");
        String nombre = JOptionPane.showInputDialog("\nIngrese el nombre del empleado:\n");
        String apellido = JOptionPane.showInputDialog("\nIngrese el apellido del empleado:\n");
        String genero = JOptionPane.showInputDialog("\nIngrese el género del empleado:\n");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("\nIngrese el salario del empleado:\n"));
        String fechaNacimiento = JOptionPane.showInputDialog("\nIngrese la fecha de nacimiento del empleado (dd/MM/yyyy):\n");
        String fechaIngreso = JOptionPane.showInputDialog("\nIngrese la fecha de ingreso del empleado (dd/MM/yyyy):\n");

        return new Empleado(cedula, nombre, apellido, genero, salario, fechaNacimiento, fechaIngreso);
    }
}
