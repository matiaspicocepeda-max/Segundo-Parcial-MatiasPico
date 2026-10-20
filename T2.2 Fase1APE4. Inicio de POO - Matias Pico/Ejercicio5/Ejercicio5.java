// Ejercicio 5: Biblioteca
public class Ejercicio5 {
    public static void main(String[] args) {
        Libro l1 = new Libro("Cien anos de soledad", "Gabriel Garcia Marquez", true);
        Libro l2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", true);
        Libro l3 = new Libro("El Principito", "Antoine de Saint-Exupery", true);
        Libro l4 = new Libro("Huasipungo", "Jorge Icaza", true);
        Libro[] libros = {l1, l2, l3, l4};

        Socio s1 = new Socio("Pedro", 0);
        Socio s2 = new Socio("Lucia", 0);
        Socio[] socios = {s1, s2};

        // El primer socio presta 2 libros
        l1.disponible = false;
        s1.librosPrestados++;
        l2.disponible = false;
        s1.librosPrestados++;

        // El segundo socio presta 1 libro
        l3.disponible = false;
        s2.librosPrestados++;

        System.out.println("--- Libros ---");
        int disponibles = 0;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].disponible) {
                System.out.println(libros[i].titulo + " : Disponible");
                disponibles++;
            } else {
                System.out.println(libros[i].titulo + " : Prestado");
            }
        }

        System.out.println("--- Socios ---");
        for (int i = 0; i < socios.length; i++) {
            System.out.println(socios[i].nombre + " : " + socios[i].librosPrestados);
        }

        System.out.println("Libros disponibles: " + disponibles);
    }
}

class Libro {
    String titulo;
    String autor;
    boolean disponible;

    Libro(String titulo, String autor, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }
}

class Socio {
    String nombre;
    int librosPrestados;

    Socio(String nombre, int librosPrestados) {
        this.nombre = nombre;
        this.librosPrestados = librosPrestados;
    }
}
