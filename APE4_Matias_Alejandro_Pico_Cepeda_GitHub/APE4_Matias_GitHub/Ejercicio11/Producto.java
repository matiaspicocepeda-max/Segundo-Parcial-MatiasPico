public class Producto {
    String nombre;
    double precio;
    int stock;
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    public boolean reducirStock(int cantidad) {
        if (cantidad <= stock) {
            stock = stock - cantidad;
            return true;
        }
        System.out.println("Stock insuficiente.");
        return false;
    }
    public void mostrarProducto() {
        System.out.println(nombre + " | Precio: $" + precio + " | Stock: " + stock);
    }
}
