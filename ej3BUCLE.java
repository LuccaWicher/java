import java.util.Scanner;

public class ej3BUCLE {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número de productos: ");
        int productos = scanner.nextInt();

        for (int i = 0; i < productos; i++) {
            System.out.print("Ingresa la cantidad disponible del producto " + (i + 1) + ": ");
            int cantidad = scanner.nextInt();

            if (cantidad < 5) {
                System.out.println("Es necesario realizar un pedido para el producto " + (i + 1));
            }
        }
        scanner.close();
    }
}

