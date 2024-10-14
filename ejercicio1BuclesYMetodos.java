public class ejercicio1BuclesYMetodos {
    public static void main(String[] args) {
        double[] ventas = {200, 150, 180, 220, 300, 190, 210, 160, 250, 230,
                180, 170, 190, 200, 310, 220, 240, 230, 150, 180,
                210, 190, 260, 230, 180, 200, 150, 270, 310, 200};

        double totalIngresos = calcularIngresosMensuales(ventas);
        System.out.println("El total de ingresos mensuales es: $" + totalIngresos);
    }

    public static double calcularIngresosMensuales(double[] ventas) {
        double total = 0;
        for (int i = 0; i < ventas.length; i++) {
            total += ventas[i];
        }
        return total;
    }
}