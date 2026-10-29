public static void main(String[] args) {
    System.out.println("=== EJERCICIO 1 ===");
    Autor a1 = new Autor("Gabo", "Colombiana");
    Libro l1 = new Libro("Cien Años de Soledad", 1967, a1);
    l1.mostrarInformacion();

    System.out.println("\n=== EJERCICIO 2 ===");
    Rectangulo r1 = new Rectangulo(4.0, 6.0);
    r1.mostrar();

    System.out.println("\n=== EJERCICIO 3 ===");
    Producto p1 = new Producto("Laptop", 800.0, 5);
    Venta v1 = new Venta(2);
    v1.aplicar(p1);
    p1.mostrarProducto();

    System.out.println("\n=== EJERCICIO 4 ===");
    Cuenta c1 = new Cuenta("Mateo", 500);
    Cuenta c2 = new Cuenta("Adrian", 200);
    c1.transferir(c2, 100);
    c1.transferir(c2, 1000); // Fallida

    System.out.println("\n=== EJERCICIO 5 ===");
    Usuario u1 = new Usuario("Ariel", "1234");
    Usuario u2 = new Usuario("Paulo", "5678");
    LibroBiblioteca lb = new LibroBiblioteca("Java Básico");
    new Prestamo(u1, lb).registrar();
    new Prestamo(u2, lb).registrar(); // Rechazado
}
