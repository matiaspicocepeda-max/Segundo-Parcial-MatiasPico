package ejercicio3;

// Representa un producto de la tienda
public class Producto {
    String nombre;
    double precio;
    int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Reduce el stock solo si alcanza; devuelve true si se pudo reducir
    public boolean reducirStock(int cantidad) {
        if (cantidad <= stock) {
            stock = stock - cantidad;
            return true;
        }
        System.out.println("Stock insuficiente.");
        return false;
    }

    // Muestra los datos del producto
    public void mostrarProducto() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio
                + " | Stock: " + stock);
    }
}
