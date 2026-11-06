package ejercicio5;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Ana Pérez", "1800000001");
        Usuario usuario2 = new Usuario("Luis Mora", "1800000002");
        Libro libro = new Libro("Cien años de soledad");

        Prestamo prestamo1 = new Prestamo(usuario1, libro);
        Prestamo prestamo2 = new Prestamo(usuario2, libro);

        // Dos usuarios intentan pedir el mismo libro
        prestamo1.registrar();
        prestamo2.registrar();

        // El libro se devuelve y el segundo usuario vuelve a intentarlo
        libro.devolver();
        System.out.println("El libro fue devuelto.");
        prestamo2.registrar();
    }
}
