import java.util.Scanner;
public class ejercicio66BuclesAnidados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número N: ");
        int N = scanner.nextInt();

        System.out.println("Números primos desde 2 hasta " + N + ":");
        for (int num = 2; num <= N; num++) {
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.println(num);
            }
        }
        scanner.close();
    }
}
