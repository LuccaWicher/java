public class ejercicio7BuclesYMetodos {
    public static void main(String[] args) {
        double[] compras = {400, 550, 600, 450, 700};

        aplicarDescuento(compras);
    }

    public static void aplicarDescuento(double[] compras) {
        System.out.println("Compras con descuento:");
        for (int i = 0; i < compras.length; i++) {
            if (compras[i] > 500) {
                double descuento = compras[i] * 0.15;
                double precioFinal = compras[i] - descuento;
                System.out.println("Compra original: $" + compras[i] + " - Precio con descuento: $" + precioFinal);
            }
        }
    }
}