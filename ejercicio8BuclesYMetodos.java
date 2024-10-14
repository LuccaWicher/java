public class ejercicio8BuclesYMetodos {
    public static void main(String[] args) {
        String[] empleados = {"Juan", "Ana", "Pedro", "Luis", "María"};
        int[] horasTrabajadas = {40, 38, 42, 45, 39};

        calcularPagoSemanal(empleados, horasTrabajadas);
    }

    public static void calcularPagoSemanal(String[] empleados, int[] horasTrabajadas) {
        final double TARIFA_HORA = 15.0;
        System.out.println("Pagos semanales:");
        for (int i = 0; i < empleados.length; i++) {
            double pago = horasTrabajadas[i] * TARIFA_HORA;
            System.out.println(empleados[i] + " - Pago: $" + pago);
        }
    }
}