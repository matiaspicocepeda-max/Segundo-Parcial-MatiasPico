public class Main {
    public static void main(String[] args) {
        Libro l1 = crearLibro("Don Quijote", "Cervantes");
        Libro l2 = crearLibro("El Principito", "Saint-Exupery");
        Libro l3 = crearLibro("Rayuela", "Cortazar");
        Libro l4 = crearLibro("Ficciones", "Borges");
        Socio s1 = new Socio();
        s1.nombre = "Maria";
        s1.librosPrestados = 0;
        Socio s2 = new Socio();
        s2.nombre = "Juan";
        s2.librosPrestados = 0;

        l1.disponible = false; s1.librosPrestados++;
        l2.disponible = false; s1.librosPrestados++;
        l3.disponible = false; s2.librosPrestados++;

        Libro[] libros = {l1, l2, l3, l4};
        int disponibles = 0;
        System.out.println("LIBROS");
        for (Libro l : libros) {
            if (l.disponible) {
                System.out.println(l.titulo + " : Disponible");
                disponibles++;
            } else {
                System.out.println(l.titulo + " : Prestado");
            }
        }
        System.out.println("\\nSOCIOS");
        System.out.println(s1.nombre + " : " + s1.librosPrestados);
        System.out.println(s2.nombre + " : " + s2.librosPrestados);
        System.out.println("\\nLibros disponibles: " + disponibles);
    }
    private static Libro crearLibro(String titulo, String autor) {
        Libro l = new Libro();
        l.titulo = titulo;
        l.autor = autor;
        l.disponible = true;
        return l;
    }
}
