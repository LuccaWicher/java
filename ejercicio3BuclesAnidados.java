import java.util.Scanner;
public class ejercicio3BuclesAnidados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número N: ");
        int N = scanner.nextInt();

        int sumaFactoriales = 0;
        for (int num = 0; num <= N; num++) {
            int factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            sumaFactoriales += factorial;
        }

        System.out.println("La suma de los factoriales de 0 hasta " + N + " es: " + sumaFactoriales);
        scanner.close();
    }
}