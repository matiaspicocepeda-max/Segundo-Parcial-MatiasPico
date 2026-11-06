package ejercicio5;

// Representa un libro que puede estar disponible o prestado
public class Libro {
    String titulo;
    boolean disponible;

    public Libro(String titulo) {
        this.titulo = titulo;
        this.disponible = true; // al crearse, el libro está disponible
    }

    // Intenta prestar el libro: devuelve true si estaba disponible
    public boolean prestar() {
        if (disponible) {
            disponible = false;
            return true;
        }
        return false;
    }

    // Marca el libro como disponible otra vez
    public void devolver() {
        disponible = true;
    }
}
