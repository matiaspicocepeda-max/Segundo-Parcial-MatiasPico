public class Validador {
    public boolean verificarEdad(int edad) {
        if (edad < 0 || edad > 120) {
            System.out.println("Edad inválida");
            return false;
        }
        return true;
    }
}
