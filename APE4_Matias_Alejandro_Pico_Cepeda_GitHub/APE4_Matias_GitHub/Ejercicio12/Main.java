public class Main {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Carlos", 500);
        Cuenta c2 = new Cuenta("Laura", 100);
        System.out.println("Saldos iniciales");
        c1.mostrarSaldo();
        c2.mostrarSaldo();
        System.out.println("\\nTransferencia valida (200)");
        c1.transferir(c2, 200);
        System.out.println("\\nTransferencia que falla (1000)");
        c1.transferir(c2, 1000);
        System.out.println("\\nSaldos finales");
        c1.mostrarSaldo();
        c2.mostrarSaldo();
    }
}
