import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el mensaje que desea guardar: ");
        String mensaje = teclado.nextLine();
        try {
            FileWriter escritor = new FileWriter("estudiantes.txt", true);

            escritor.write(mensaje + "\n");

            escritor.close();

            System.out.println("La informacion se guardo correctamente.");

        } catch (IOException e) {
            
            System.out.println("Ocurrio un error al escribir en el archivo: " + e.getMessage());
        } finally {
            teclado.close(); 
        }
    }
}