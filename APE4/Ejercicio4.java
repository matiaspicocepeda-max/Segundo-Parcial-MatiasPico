static class Cuenta {
    String titular;
    double saldo;
    Cuenta(String t, double s) { titular = t; saldo = s; }
    void depositar(double m) { saldo += m; }
    boolean retirar(double m) {
        if (m <= saldo) { saldo -= m; return true; }
        return false;
    }
    void transferir(Cuenta destino, double monto) {
        if (retirar(monto)) {
            destino.depositar(monto);
            System.out.println("Transferencia de $" + monto + " de " + titular + " a " + destino.titular + " EXITOSA.");
        } else {
            System.out.println("Transferencia FALLIDA: Fondos insuficientes en la cuenta de " + titular);
        }
    }
    void mostrarSaldo() {
        System.out.println("Cuenta: " + titular + " | Saldo: $" + saldo);
    }
}
