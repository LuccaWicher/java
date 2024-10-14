public class ejercicio6BuclesYMetodos {
    public static void main(String[] args) {
        double[] facturas = {500, 1000, 1500, 2000, 2500};

        calcularImpuesto(facturas);
    }

    public static void calcularImpuesto(double[] facturas) {
        System.out.println("Facturas con impuestos:");
        for (int i = 0; i < facturas.length; i++) {
            double impuesto = facturas[i] * 0.21;
            System.out.println("Factura original: $" + facturas[i] + " - Impuesto: $" + impuesto);
        }
    }
}