public class ejercicio3BuclesYMetodos {
    public static void main(String[] args) {
        String[] clientes = {"Juan", "Ana", "Pedro", "Luis", "María"};
        double[] facturasPendientes = {300, 700, 450, 800, 600};

        enviarFacturas(clientes, facturasPendientes);
    }

    public static void enviarFacturas(String[] clientes, double[] facturasPendientes) {
        System.out.println("Clientes con facturas mayores a $500:");
        for (int i = 0; i < clientes.length; i++) {
            if (facturasPendientes[i] > 500) {
                System.out.println(clientes[i] + " - Factura: $" + facturasPendientes[i]);
            }
        }
    }
}