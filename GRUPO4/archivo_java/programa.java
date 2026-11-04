import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        File archivo = new File("estudiantes.txt");

        try (Scanner entrada = new Scanner(System.in)) {
            if (archivo.createNewFile()) {
                System.out.println("El archivo fue creado.");
            } else {
                System.out.println("El archivo ya existe.");
            }

            System.out.println("Nombre del archivo: " + archivo.getName());

            System.out.print("Ingresa el texto que deseas guardar: ");
            String texto = entrada.nextLine();

            try (FileWriter escritor = new FileWriter(archivo, true)) {
                escritor.write(texto + System.lineSeparator());
            }

            System.out.println("El texto fue guardado en " + archivo.getName() + ".");
        } catch (IOException e) {
            System.out.println("Ocurrio un error durante el proceso: " + e.getMessage());
        }
    }
}