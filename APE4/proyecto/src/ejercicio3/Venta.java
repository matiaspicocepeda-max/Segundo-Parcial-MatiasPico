package ejercicio3;

// Representa una venta de cierta cantidad de unidades
public class Venta {
    int cantidad;

    public Venta(int cantidad) {
        this.cantidad = cantidad;
    }

    // Recibe un objeto Producto como parámetro: reduce su stock y muestra el total
    public void aplicar(Producto producto) {
        if (producto.reducirStock(cantidad)) {
            double total = producto.precio * cantidad;
            System.out.println("Venta realizada: " + cantidad + " x " + producto.nombre);
            System.out.println("Total a pagar: $" + total);
        }
    }
}
