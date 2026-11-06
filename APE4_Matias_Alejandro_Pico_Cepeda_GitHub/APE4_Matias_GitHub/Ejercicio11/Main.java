public class Main {
    public static void main(String[] args) {
        Producto p = new Producto("Mochila", 25.0, 10);
        p.mostrarProducto();
        System.out.println("\\n-- Venta de 4 unidades --");
        Venta v1 = new Venta(4);
        v1.aplicar(p);
        p.mostrarProducto();
        System.out.println("\\n-- Venta de 8 unidades --");
        Venta v2 = new Venta(8);
        v2.aplicar(p);
        p.mostrarProducto();
    }
}
