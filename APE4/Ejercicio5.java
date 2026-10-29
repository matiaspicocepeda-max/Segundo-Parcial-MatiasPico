static class Usuario {
    String nombre, cedula;
    Usuario(String n, String c) { nombre = n; cedula = c; }
}

static class LibroBiblioteca {
    String titulo;
    boolean disponible = true;
    LibroBiblioteca(String t) { titulo = t; }
    boolean prestar() {
        if (disponible) { disponible = false; return true; }
        return false;
    }
}

static class Prestamo {
    Usuario usuario;
    LibroBiblioteca libro;
    Prestamo(Usuario u, LibroBiblioteca l) { usuario = u; libro = l; }
    void registrar() {
        if (libro.prestar()) {
            System.out.println("Préstamo EXITOSO para " + usuario.nombre + " (Libro: " + libro.titulo + ")");
        } else {
            System.out.println("Préstamo RECHAZADO para " + usuario.nombre + ". El libro '" + libro.titulo + "' ya está prestado.");
        }
    }
}
