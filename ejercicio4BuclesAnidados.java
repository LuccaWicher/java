public class ejercicio4BuclesAnidados {
    public static void main(String[] args) {
        for (char inicio = 'Z'; inicio >= 'A'; inicio--) {
            for (char letra = inicio; letra >= 'A'; letra--) {
                System.out.print(letra);
            }
            System.out.println();
        }
    }
}