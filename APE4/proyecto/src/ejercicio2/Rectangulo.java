package ejercicio2;

// Representa un rectángulo con base y altura
public class Rectangulo {
    double base;
    double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Devuelve el área (base por altura)
    public double calcularArea() {
        return base * altura;
    }

    // Devuelve el perímetro: 2 * (base + altura)
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    // Devuelve true si todos los lados son iguales
    public boolean esCuadrado() {
        return base == altura;
    }

    // Devuelve un texto como "Rectángulo de 4.0 x 6.0"
    public String obtenerDescripcion() {
        return "Rectángulo de " + base + " x " + altura;
    }

    // Imprime todos los resultados (no devuelve nada)
    public void mostrar() {
        System.out.println(obtenerDescripcion());
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("¿Es cuadrado? " + esCuadrado());
    }
}
