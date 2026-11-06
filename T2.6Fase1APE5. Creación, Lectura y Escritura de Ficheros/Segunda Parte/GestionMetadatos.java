import java.io.File;
import java.io.IOException;

public class GestionMetadatos {
    public static void main(String[] args) {
        File archivo = new File("datos/prueba.txt");

        try {
            File directorio = archivo.getParentFile();
            if (directorio != null && !directorio.exists()) {
                directorio.mkdirs();
            }

            if (archivo.exists()) {
                System.out.println("El archivo ya se encontraba disponible en el disco.");
            } else {
                if (archivo.createNewFile()) {
                    System.out.println("El archivo se creó exitosamente.");
                }
            }

            System.out.println("Último nombre de la ruta (getName): " + archivo.getName());
            System.out.println("Ruta completa o relativa (getPath): " + archivo.getPath());

        } catch (IOException e) {
            System.out.println("Ocurrió un error de E/S: " + e.getMessage());
        }
    }
}