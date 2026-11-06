public class Venta {
    int cantidad;
    public Venta(int cantidad) { this.cantidad = cantidad; }
    public void aplicar(Producto producto) {
        if (producto.reducirStock(cantidad)) {
            double total = cantidad * producto.precio;
            System.out.println("Venta realizada. Total a pagar: $" + total);
        }
    }
}
