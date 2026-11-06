public class Main {
    // a y b son parametros; 5 y 3 son argumentos en la llamada.
    public static int sumar(int a, int b) { return a + b; }
    public static void main(String[] args) {
        int resultado = sumar(5, 3);
        System.out.println("Resultado: " + resultado);
    }
}
