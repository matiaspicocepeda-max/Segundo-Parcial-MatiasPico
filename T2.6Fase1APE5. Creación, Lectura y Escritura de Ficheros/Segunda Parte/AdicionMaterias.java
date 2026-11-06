import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AdicionMaterias {
    public static void main(String[] args) {
        try {
            // Modo append activado (true) para no sobrescribir el archivo previo
            FileWriter fw = new FileWriter("materias.txt", true);
            BufferedWriter escritor = new BufferedWriter(fw);

            escritor.write("Inglés Técnico");
            escritor.newLine();
            escritor.write("Arquitectura de Computadores");
            escritor.newLine();

            escritor.close();

            System.out.println("Se agregaron las dos nuevas asignaturas sin sobrescribir el contenido previo.");

        } catch (IOException e) {
            System.out.println("Ocurrió un error al modificar el archivo: " + e.getMessage());
        }
    }
}