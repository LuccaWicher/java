public class ejercicio5BuclesYMetodos {
    public static void main(String[] args) {
        int[] calificaciones = {4, 5, 3, 4, 5, 2, 5, 4, 3, 5};

        double promedio = calcularPromedioSatisfaccion(calificaciones);
        System.out.println("El promedio de satisfacción es: " + promedio);
    }

    public static double calcularPromedioSatisfaccion(int[] calificaciones) {
        int total = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            total += calificaciones[i];
        }
        return (double) total / calificaciones.length;
    }
}