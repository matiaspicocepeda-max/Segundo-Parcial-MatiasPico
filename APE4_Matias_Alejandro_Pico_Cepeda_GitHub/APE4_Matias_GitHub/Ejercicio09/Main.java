public class Main {
    public static void main(String[] args) {
        Autor a1 = new Autor("Gabriel Garcia Marquez", "Colombiana");
        Autor a2 = new Autor("Jorge Icaza", "Ecuatoriana");
        Libro l1 = new Libro("Cien anios de soledad", 1967, a1);
        Libro l2 = new Libro("Huasipungo", 1934, a2);
        l1.mostrarInformacion();
        System.out.println();
        l2.mostrarInformacion();
    }
}
