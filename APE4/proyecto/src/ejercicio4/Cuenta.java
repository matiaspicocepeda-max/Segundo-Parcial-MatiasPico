package ejercicio4;

// Representa una cuenta bancaria
public class Cuenta {
    String titular;
    double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Muestra el titular y el saldo actual
    public void mostrarSaldo() {
        System.out.println(titular + " : $" + saldo);
    }

    // Retira el monto de esta cuenta y lo deposita en la cuenta destino,
    // solo si el monto es válido y hay fondos suficientes
    public void transferir(Cuenta destino, double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo = saldo - monto;
            destino.saldo = destino.saldo + monto;
            System.out.println("Transferencia exitosa de $" + monto
                    + " de " + titular + " a " + destino.titular);
        } else {
            System.out.println("Transferencia fallida: fondos insuficientes en la cuenta de "
                    + titular);
        }
    }
}
