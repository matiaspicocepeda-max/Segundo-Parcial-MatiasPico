package ejercicio4;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Ana", 500.0);
        Cuenta cuenta2 = new Cuenta("Luis", 200.0);

        System.out.println("--- Saldos iniciales ---");
        cuenta1.mostrarSaldo();
        cuenta2.mostrarSaldo();

        // Transferencia válida: Ana tiene fondos
        System.out.println("--- Transferencia válida ---");
        cuenta1.transferir(cuenta2, 150.0);
        cuenta1.mostrarSaldo();
        cuenta2.mostrarSaldo();

        // Transferencia que falla: Luis no tiene 1000
        System.out.println("--- Transferencia que falla ---");
        cuenta2.transferir(cuenta1, 1000.0);
        cuenta1.mostrarSaldo();
        cuenta2.mostrarSaldo();
    }
}
