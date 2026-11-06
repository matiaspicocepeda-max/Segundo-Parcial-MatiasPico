public class Libro {
    String titulo;
    boolean disponible;
    public Libro(String titulo) {
        this.titulo = titulo;
        this.disponible = true;
    }
    public boolean prestar() {
        if (disponible) {
            disponible = false;
            return true;
        }
        return false;
    }
    public void devolver() { disponible = true; }
}
