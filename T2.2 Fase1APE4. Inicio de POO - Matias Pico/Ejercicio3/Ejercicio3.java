// Ejercicio 3: Veterinaria
public class Ejercicio3 {
    public static void main(String[] args) {
        Mascota m1 = new Mascota("Firulais", "Perro", 5, 28.5);
        Mascota m2 = new Mascota("Michi", "Gato", 3, 4.2);
        Mascota m3 = new Mascota("Rocky", "Perro", 2, 18.0);

        Mascota[] mascotas = {m1, m2, m3};
        for (int i = 0; i < mascotas.length; i++) {
            Mascota m = mascotas[i];
            String aviso = "";
            if (m.peso > 20) {
                aviso = " Revisar peso";
            }
            System.out.printf(java.util.Locale.US, "%s : %s : %.1f%s%n",
                    m.nombre, m.especie, m.peso, aviso);
        }

        Mascota m4 = m1;
        m4.edad = m4.edad + 1;
        System.out.println("Edad de m1: " + m1.edad);

        
    }
}

class Mascota {
    String nombre;
    String especie;
    int edad;
    double peso;

    Mascota(String nombre, String especie, int edad, double peso) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
    }
}
