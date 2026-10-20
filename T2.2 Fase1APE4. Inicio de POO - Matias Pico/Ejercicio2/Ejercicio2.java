// Ejercicio 2: Inventario de una tienda
public class Ejercicio2 {
    public static void main(String[] args) {
        Producto[] productos = new Producto[4];
        productos[0] = new Producto("Laptop", 800.00, 6);
        productos[1] = new Producto("Mouse", 15.00, 20);
        productos[2] = new Producto("Teclado", 35.00, 7);
        productos[3] = new Producto("Monitor", 150.00, 10);

        System.out.println("--- Productos ---");
        for (int i = 0; i < productos.length; i++) {
            System.out.printf(java.util.Locale.US, "%s : %.2f%n",
                    productos[i].nombre, productos[i].precio);
        }

        // Simulacion de venta: 3 unidades de la Laptop y 3 del Teclado
        productos[0].stock -= 3;
        productos[2].stock -= 3;

        System.out.println("--- Despues de la venta ---");
        double valorTotal = 0;
        for (int i = 0; i < productos.length; i++) {
            Producto p = productos[i];
            String aviso = "";
            if (p.stock < 5) {
                aviso = " Reponer";
            }
            System.out.printf(java.util.Locale.US, "%s : %.2f (stock: %d)%s%n",
                    p.nombre, p.precio, p.stock, aviso);
            valorTotal += p.precio * p.stock;
        }
        System.out.printf(java.util.Locale.US,
                "Valor total del inventario: %.2f%n", valorTotal);
    }
}

class Producto {
    String nombre;
    double precio;
    int stock;

    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
}
