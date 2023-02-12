package Ejemplo_04_05;
import java.util.Scanner;

public class Ejemplo_04_05 {
	public static void main (String args[]) {
		Scanner scanner=new Scanner(System.in);
        
        System.out.println ("¿Cómo te llamas?");
        String nombre=scanner.nextLine();
        System.out.println("¡Hola, "+nombre+"! ¿Qué tal?");
        //Es mejor indicar el cierre de la variable para que no salte un "error" que indica que "scanner"
        //is never closed, parece que se queda abierto a introducir nuevos valores a través de teclado
        scanner.close();
	}
}