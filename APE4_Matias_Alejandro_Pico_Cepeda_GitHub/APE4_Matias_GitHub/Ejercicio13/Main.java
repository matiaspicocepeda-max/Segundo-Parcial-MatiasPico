public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Maria", "1801234567");
        Usuario u2 = new Usuario("Juan", "1807654321");
        Libro libro = new Libro("Don Quijote");
        Prestamo p1 = new Prestamo(u1, libro);
        Prestamo p2 = new Prestamo(u2, libro);
        p1.registrar();
        p2.registrar();
        System.out.println("\\nMaria devuelve el libro.");
        libro.devolver();
        p2.registrar();
    }
}
