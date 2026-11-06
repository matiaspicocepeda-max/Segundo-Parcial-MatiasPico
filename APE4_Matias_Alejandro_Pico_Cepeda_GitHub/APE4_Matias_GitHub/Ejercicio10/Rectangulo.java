public class Rectangulo {
    double base;
    double altura;
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double calcularArea() { return base * altura; }
    public double calcularPerimetro() { return 2 * (base + altura); }
    public boolean esCuadrado() { return base == altura; }
    public String obtenerDescripcion() {
        return "Rectangulo de " + base + " x " + altura;
    }
    public void mostrar() {
        System.out.println(obtenerDescripcion());
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
        System.out.println("Es cuadrado: " + esCuadrado());
    }
}
