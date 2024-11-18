public class Persona{
    // Atributos originales
    private String nombre;
    private String apellidos;
    private long numeroDocumento;
    private int anioNacimiento;

    // Nuevos atributos
    private String paisNacimiento;
    private char genero;

    // Constructor con los nuevos atributos
    public Persona(String nombre, String apellidos, long numeroDocumento, int anioNacimiento, String paisNacimiento, char genero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroDocumento = numeroDocumento;
        this.anioNacimiento = anioNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
    }

    // Método para imprimir la información de la persona
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Número de documento de identidad: " + numeroDocumento);
        System.out.println("Año de nacimiento: " + anioNacimiento);
        System.out.println("País de nacimiento: " + paisNacimiento);
        System.out.println("Género: " + (genero == 'H' ? "Hombre" : "Mujer"));
    }

    public static void main(String[] args) {
        // Creación de dos objetos Persona
        Persona persona1 = new Persona("Pedro", "Pérez", 1053121010L, 1998, "España", 'H');
        Persona persona2 = new Persona("Luis", "León", 1053223344L, 2001, "México", 'H');

        // Imprimir los datos de cada persona
        persona1.imprimir();
        System.out.println(); // Salto de línea
        persona2.imprimir();
    }
}
