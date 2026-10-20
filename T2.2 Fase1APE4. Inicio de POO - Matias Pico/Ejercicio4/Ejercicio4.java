// Ejercicio 4: Cuenta de ahorro
public class Ejercicio4 {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Titular 1", 200);
        Cuenta c2 = new Cuenta("Titular 2", 350);

        Cuenta[] cuentas = {c1, c2};
        for (int i = 0; i < cuentas.length; i++) {
            Cuenta c = cuentas[i];
            int meses = 0;
            while (c.saldo < 500) {
                c.saldo += 50;
                meses++;
                System.out.println(c.titular + " : " + c.saldo);
            }
            System.out.println(c.titular + " necesito " + meses + " meses");
            System.out.println();
        }
    }
}

class Cuenta {
    String titular;
    double saldo;

    Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
}
