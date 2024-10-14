import java.util.Scanner;

public class ej2BUCLE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double TARIFA_POR_HORA = 15.0;

        System.out.print("Ingresa la cantidad de empleados: ");
        int empleados = scanner.nextInt();
        int i = 0;

        while (i < empleados) {
            System.out.print("Ingresa las horas trabajadas por el empleado " + (i + 1) + ": ");
            int horasTrabajadas = scanner.nextInt();
            double salario = horasTrabajadas * TARIFA_POR_HORA;
            System.out.println("El salario del empleado " + (i + 1) + " es: $" + salario);
            i++;
        }
        scanner.close();
    }
}