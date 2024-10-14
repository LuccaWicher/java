import java.util.Scanner;

public class ej1BUCLE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int actividades = 4;
        String[] nombresActividades = {"estudiar", "hacer ejercicios", "leer", "tiempo libre"};
        int i = 0;
        double horasTotales = 0;

        while (i < actividades) {
            System.out.print("Ingresa las horas dedicadas a " + nombresActividades[i] + ": ");
            double horas = scanner.nextDouble();
            horasTotales += horas;
            i++;
        }

        System.out.println("El tiempo total dedicado a tus actividades es: " + horasTotales + " horas.");
        scanner.close();
    }
}