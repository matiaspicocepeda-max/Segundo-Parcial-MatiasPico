public class Main {
    public static void main(String[] args) {
        Estudiante e1 = crear("Ana", 8, 9, 7);
        Estudiante e2 = crear("Luis", 6, 5, 7);
        Estudiante e3 = crear("Maria", 4, 3, 5);
        Estudiante e4 = crear("Pedro", 10, 9, 8);
        Estudiante e5 = crear("Sofia", 7, 6, 8);
        Estudiante[] estudiantes = {e1, e2, e3, e4, e5};
        int aprobados = 0;
        System.out.println("NOTAS DEL CURSO");
        for (Estudiante e : estudiantes) {
            if (e.promedio >= 7) {
                System.out.println(e.nombre + " : " + e.promedio + " Aprobado");
                aprobados++;
            } else if (e.promedio >= 5) {
                System.out.println(e.nombre + " : " + e.promedio + " Supletorio");
            } else {
                System.out.println(e.nombre + " : " + e.promedio + " Reprobado");
            }
        }
        System.out.println("Cantidad de estudiantes que aprobaron: " + aprobados);
    }
    private static Estudiante crear(String nombre, double n1, double n2, double n3) {
        Estudiante e = new Estudiante();
        e.nombre = nombre;
        e.nota1 = n1;
        e.nota2 = n2;
        e.nota3 = n3;
        e.promedio = (n1 + n2 + n3) / 3;
        return e;
    }
}
