package ejercicio1;

public class Main {
    public static void main(String[] args) {
        // Se crean los autores
        Autor autor1 = new Autor("Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("Jorge Icaza", "Ecuatoriana");

        // Se crean 2 libros asociados a sus autores
        Libro libro1 = new Libro("Cien años de soledad", 1967, autor1);
        Libro libro2 = new Libro("Huasipungo", 1934, autor2);

        libro1.mostrarInformacion();
        System.out.println();
        libro2.mostrarInformacion();
    }
}
