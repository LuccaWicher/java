import java.util.Scanner;

public class ej4BUCLE {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalVentas = 0;

        for (int dia = 1; dia <= 7; dia++) {
            System.out.print("Ingresa las ventas del día " + dia + ": ");
            double ventas = scanner.nextDouble();
            totalVentas += ventas;
        }

        System.out.println("El total de ventas de la semana es: $" + totalVentas);
        scanner.close();
    }
}
