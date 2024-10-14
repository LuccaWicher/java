public class ejercicio4BuclesYMetodos {
    public static void main(String[] args) {
        String[] clientes = {"Juan", "Ana", "Pedro", "Luis", "María"};
        int[] compras = {12, 8, 15, 9, 11};

        calcularDescuentos(clientes, compras);
    }

    public static void calcularDescuentos(String[] clientes, int[] compras) {
        System.out.println("Clientes con descuentos:");
        for (int i = 0; i < clientes.length; i++) {
            if (compras[i] > 10) {
                System.out.println(clientes[i] + " tiene un 10% de descuento.");
            }
        }
    }
}