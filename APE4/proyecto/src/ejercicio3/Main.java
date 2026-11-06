package ejercicio3;

public class Main {
    public static void main(String[] args) {
        Producto laptop = new Producto("Laptop", 800.0, 5);
        laptop.mostrarProducto();

        // Venta válida: hay stock suficiente
        Venta venta1 = new Venta(2);
        venta1.aplicar(laptop);
        laptop.mostrarProducto();

        // Venta inválida: se piden más unidades que el stock
        Venta venta2 = new Venta(4);
        venta2.aplicar(laptop);
        laptop.mostrarProducto();
    }
}
