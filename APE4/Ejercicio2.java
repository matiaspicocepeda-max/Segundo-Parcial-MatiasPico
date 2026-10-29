static class Rectangulo {
    double base, altura;
    Rectangulo(double b, double a) { base = b; altura = a; }
    double calcularArea() { return base * altura; }
    double calcularPerimetro() { return 2 * (base + altura); }
    boolean esCuadrado() { return base == altura; }
    String obtenerDescripcion() { return "Rectángulo de " + base + " x " + altura; }
    void mostrar() {
        System.out.println(obtenerDescripcion() + " | Área: " + calcularArea() + " | Perímetro: " + calcularPerimetro() + " | Cuadrado: " + esCuadrado());
    }
}
