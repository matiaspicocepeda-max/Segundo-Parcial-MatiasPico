import java.io.File;
import java.io.IOException;

public class CicloVidaArchivo {
    public static void main(String[] args) {
        File archivo = new File("datos/temporal.txt");

        try {
            File directorio = archivo.getParentFile();
            if (directorio != null && !directorio.exists()) {
                directorio.mkdirs();
            }

            if (!archivo.exists()) {
                if (archivo.createNewFile()) {
                    System.out.println("Archivo temporal creado exitosamente.");
                }
            } else {
                System.out.println("El archivo temporal ya existía.");
            }

            boolean confirmarBorrado = true; 

            if (confirmarBorrado) {
                boolean resultadoEliminacion = archivo.delete();
                System.out.println("Resultado booleano de la eliminación: " + resultadoEliminacion);
            } else {
                System.out.println("La eliminación fue cancelada.");
            }

        } catch (IOException e) {
            System.out.println("Ocurrió un error de E/S: " + e.getMessage());
        }
    }
}