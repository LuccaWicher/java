public class ejercicio9BuclesYMetodos {
    public static void main(String[] args) {
        double[] preciosOriginales = {100, 200, 300, 400, 500};

        calcularPrecioFinal(preciosOriginales);
    }

    public static void calcularPrecioFinal(double[] preciosOriginales) {
        System.out.println("Precios finales con descuento:");
        for (int i = 0; i < preciosOriginales.length; i++) {
            double descuento = preciosOriginales[i] * 0.10;
            double precioFinal = preciosOriginales[i] - descuento;
            System.out.println("Precio original: $" + preciosOriginales[i] + " - Precio final: $" + precioFinal);
        }
    }
}