// Ejercicio 1: Notas del curso
public class Ejercicio1 {
    public static void main(String[] args) {
        Estudiante[] estudiantes = new Estudiante[5];
        estudiantes[0] = new Estudiante("Ana", 9.0, 8.5, 9.5);
        estudiantes[1] = new Estudiante("Luis", 6.0, 5.5, 7.0);
        estudiantes[2] = new Estudiante("Maria", 4.0, 3.5, 5.0);
        estudiantes[3] = new Estudiante("Carlos", 7.0, 7.5, 6.5);
        estudiantes[4] = new Estudiante("Sofia", 5.0, 6.0, 4.5);

        int aprobados = 0;
        for (int i = 0; i < estudiantes.length; i++) {
            Estudiante e = estudiantes[i];
            e.calcularPromedio();

            String estado;
            if (e.promedio >= 7) {
                estado = "Aprobado";
                aprobados++;
            } else if (e.promedio >= 5) {
                estado = "Supletorio";
            } else {
                estado = "Reprobado";
            }
            System.out.printf(java.util.Locale.US, "%s : %.2f %s%n",
                    e.nombre, e.promedio, estado);
        }
        System.out.println("Estudiantes aprobados: " + aprobados);
    }
}

class Estudiante {
    String nombre;
    double nota1;
    double nota2;
    double nota3;
    double promedio;

    Estudiante(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    void calcularPromedio() {
        promedio = (nota1 + nota2 + nota3) / 3;
    }
}
