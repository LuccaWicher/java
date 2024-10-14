import java.util.Scanner;

public class ej5BUCLE {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int empleados;
        int i = 0;

        System.out.print("Ingresa el número de empleados: ");
        empleados = scanner.nextInt();

        do {
            System.out.print("Ingresa las horas trabajadas por el empleado " + (i + 1) + ": ");
            int horasTrabajadas = scanner.nextInt();

            if (horasTrabajadas > 40) {
                int horasExtras = horasTrabajadas - 40;
                System.out.println("El empleado " + (i + 1) + " trabajó " + horasExtras + " horas extras.");
            } else {
                System.out.println("El empleado " + (i + 1) + " no tiene horas extras.");
            }

            i++;
        } while (i < empleados);

        scanner.close();
    }
}
