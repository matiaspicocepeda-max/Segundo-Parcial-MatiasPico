public class Main {
    public static void modificar(int numero) {
        numero = numero + 5;
        System.out.println("Dentro del metodo: " + numero);
    }
    public static void main(String[] args) {
        int numero = 10;
        modificar(numero);
        // Java pasa el valor primitivo por copia: el original sigue en 10.
        System.out.println("Despues del metodo: " + numero);
    }
}
