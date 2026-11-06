package ejercicio5;

// Relaciona un Usuario con un Libro (colaboración entre clases)
public class Prestamo {
    Usuario usuario;
    Libro libro;

    public Prestamo(Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;
    }

    // Intenta prestar el libro y muestra un mensaje según el resultado
    public void registrar() {
        if (libro.prestar()) {
            System.out.println(usuario.nombre + " (CI " + usuario.cedula
                    + ") prestó el libro \"" + libro.titulo + "\".");
        } else {
            System.out.println("El libro \"" + libro.titulo
                    + "\" no está disponible para " + usuario.nombre + ".");
        }
    }
}
