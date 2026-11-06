import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscritorMaterias {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("materias.txt");
            BufferedWriter escritor = new BufferedWriter(fw);

            escritor.write("Matemáticas");
            escritor.newLine();
            escritor.write("Algoritmos y Lógica de Programación");
            escritor.newLine();
            escritor.write("Física");
            escritor.newLine();
            escritor.write("Base de Datos");
            escritor.newLine();
            escritor.write("Metodología de la Investigación");
            escritor.newLine();

            escritor.close();
            
            System.out.println("El archivo 'materias.txt' se generó y escribió correctamente.");

        } catch (IOException e) {
            System.out.println("Ocurrió un error de E/S durante la escritura: " + e.getMessage());
        }
    }
}