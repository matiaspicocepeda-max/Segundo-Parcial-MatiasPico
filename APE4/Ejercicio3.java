static class Producto {
    String nombre;
    double precio;
    int stock;
    Producto(String n, double p, int s) { nombre = n; precio = p; stock = s; }
    boolean reducirStock(int cant) {
        if (cant <= stock) { stock -= cant; return true; }
        System.out.println("Stock insuficiente.");
        return false;
    }
    void mostrarProducto() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio + " | Stock: " + stock);
    }
}

static class Venta {
    int cantidad;
    Venta(int c) { cantidad = c; }
    void aplicar(Producto p) {
        if (p.reducirStock(cantidad)) {
            System.out.println("Venta realizada. Total: $" + (cantidad * p.precio));
        } else {
            System.out.println("No se pudo procesar la venta.");
        }
    }
}
