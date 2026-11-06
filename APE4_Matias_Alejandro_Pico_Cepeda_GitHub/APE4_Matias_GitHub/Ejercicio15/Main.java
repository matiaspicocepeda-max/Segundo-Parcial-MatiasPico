public class Main {
    public static void main(String[] args) {
        Producto p1 = crear("Cuaderno", 1.5, 7);
        Producto p2 = crear("Lapiz", 0.5, 20);
        Producto p3 = crear("Mochila", 25, 6);
        Producto p4 = crear("Borrador", 0.75, 8);
        Producto[] productos = {p1, p2, p3, p4};
        System.out.println("PRODUCTOS");
        for (Producto p : productos) {
            System.out.println(p.nombre + " : " + p.precio);
        }
        // Venta de tres unidades de cuadernos y mochilas.
        p1.stock -= 3;
        p3.stock -= 3;
        System.out.println("\\nDESPUES DE LA VENTA");
        for (Producto p : productos) {
            System.out.println(p.nombre + " : " + p.precio
                    + (p.stock < 5 ? " Reponer" : ""));
        }
        double total = 0;
        for (Producto p : productos) {
            total += p.precio * p.stock;
        }
        System.out.println("\\nValor total del inventario: " + total);
    }
    private static Producto crear(String nombre, double precio, int stock) {
        Producto p = new Producto();
        p.nombre = nombre;
        p.precio = precio;
        p.stock = stock;
        return p;
    }
}
