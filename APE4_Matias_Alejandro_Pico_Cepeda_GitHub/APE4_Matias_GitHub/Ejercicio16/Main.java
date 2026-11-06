public class Main {
    public static void main(String[] args) {
        Mascota m1 = crear("Firulais", "Perro", 5, 25.5);
        Mascota m2 = crear("Michi", "Gato", 3, 4.2);
        Mascota m3 = crear("Rocky", "Perro", 2, 12);
        Mascota[] mascotas = {m1, m2, m3};
        System.out.println("MASCOTAS");
        for (Mascota m : mascotas) {
            System.out.println(m.nombre + " : " + m.especie + " : " + m.peso
                    + (m.peso > 20 ? " Revisar peso" : ""));
        }
        System.out.println("\\nEdad de m1 antes: " + m1.edad);
        Mascota m4 = m1;
        m4.edad = m4.edad + 1;
        System.out.println("Edad de m1 despues: " + m1.edad);
        // m4 y m1 guardan la referencia al mismo objeto.
    }
    private static Mascota crear(String nombre, String especie, int edad, double peso) {
        Mascota m = new Mascota();
        m.nombre = nombre;
        m.especie = especie;
        m.edad = edad;
        m.peso = peso;
        return m;
    }
}
