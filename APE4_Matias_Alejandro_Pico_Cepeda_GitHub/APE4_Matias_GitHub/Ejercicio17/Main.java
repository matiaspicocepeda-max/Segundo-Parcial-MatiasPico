public class Main {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta();
        c1.titular = "Carlos";
        c1.saldo = 200;
        Cuenta c2 = new Cuenta();
        c2.titular = "Laura";
        c2.saldo = 350;
        int meses1 = 0;
        int meses2 = 0;
        System.out.println("CUENTA DE " + c1.titular);
        while (c1.saldo < 500) {
            c1.saldo += 50;
            meses1++;
            System.out.println(c1.titular + " : " + c1.saldo);
        }
        System.out.println();
        System.out.println("CUENTA DE " + c2.titular);
        while (c2.saldo < 500) {
            c2.saldo += 50;
            meses2++;
            System.out.println(c2.titular + " : " + c2.saldo);
        }
        System.out.println();
        System.out.println(c1.titular + " necesito " + meses1 + " meses");
        System.out.println(c2.titular + " necesito " + meses2 + " meses");
    }
}
