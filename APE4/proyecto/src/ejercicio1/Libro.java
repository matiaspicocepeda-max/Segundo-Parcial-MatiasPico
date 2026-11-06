package ejercicio1;

// Representa un libro; tiene un Autor como atributo (objeto dentro de otro objeto)
public class Libro {
    String titulo;
    int anio;
    Autor autor;

    // Constructor: recibe el título, el año y el objeto Autor
    public Libro(String titulo, int anio, Autor autor) {
        this.titulo = titulo;
        this.anio = anio;
        this.autor = autor;
    }

    // Imprime el título, el año y el nombre del autor
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Año: " + anio);
        System.out.println("Autor: " + autor.nombre);
    }
}
