public class Main {
    // Un metodo int debe devolver un valor mediante return.
    public static int sumar(int a, int b) { return a + b; }
    // Si el objetivo es solo imprimir, el retorno correcto es void.
    public static void mostrarSuma(int a, int b) {
        System.out.println("Suma: " + (a + b));
    }
    public static void main(String[] args) {
        int resultado = sumar(5, 3);
        System.out.println("Resultado con return: " + resultado);
        mostrarSuma(5, 3);
    }
}
