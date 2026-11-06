public class Prestamo {
    Usuario usuario;
    Libro libro;
    public Prestamo(Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;
    }
    public void registrar() {
        if (libro.prestar()) {
            System.out.println(usuario.nombre + " (CI " + usuario.cedula
                    + ") obtuvo el libro \"" + libro.titulo + "\".");
        } else {
            System.out.println(usuario.nombre + " (CI " + usuario.cedula
                    + ") no pudo obtener \"" + libro.titulo + "\": ya esta prestado.");
        }
    }
}
