static class Autor {
    String nombre, nacionalidad;
    Autor(String n, String nac) { nombre = n; nacionalidad = nac; }
}

static class Libro {
    String titulo;
    int anio;
    Autor autor;
    Libro(String t, int a, Autor au) { titulo = t; anio = a; autor = au; }
    void mostrarInformacion() {
        System.out.println("Título: " + titulo + " | Año: " + anio + " | Autor: " + autor.nombre);
    }
}
