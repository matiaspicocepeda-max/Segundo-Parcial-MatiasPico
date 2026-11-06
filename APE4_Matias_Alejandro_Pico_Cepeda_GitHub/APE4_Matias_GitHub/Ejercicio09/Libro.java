public class Libro {
    String titulo;
    int anio;
    Autor autor;
    public Libro(String titulo, int anio, Autor autor) {
        this.titulo = titulo;
        this.anio = anio;
        this.autor = autor;
    }
    public void mostrarInformacion() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Anio: " + anio);
        System.out.println("Autor: " + autor.nombre + " (" + autor.nacionalidad + ")");
    }
}
