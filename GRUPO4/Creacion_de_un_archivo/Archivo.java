import java.io.File;
import java.io.IOException;

public class Archivo {
    public static void main(String[] args) {
        File archivo = new File("curso.txt");

        try {
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe: " + archivo.getName());
            }

            if (archivo.exists()) {
                System.out.println("Se comprobó que el archivo existe: " + archivo.getName());
            } else {
                System.out.println("Error: no se pudo comprobar la existencia del archivo.");
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al crear el archivo: " + e.getMessage());
        }
    }
}