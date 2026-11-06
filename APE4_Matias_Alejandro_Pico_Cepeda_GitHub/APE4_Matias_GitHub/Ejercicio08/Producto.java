public class Producto {
    int stock;
    double precioUnitario;
    public double calcularValorTotal() {
        return stock * precioUnitario;
    }
}
