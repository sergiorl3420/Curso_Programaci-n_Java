package Ejercicio_04_06;
import java.util.Scanner;

public class Ejercicio_04_06 {
	
	private static final String WORD="abracadabra";

	public static void main (String args[]) {
		Scanner scanner=new Scanner(System.in);
		String wordInput;
		do {
			System.out.println (" ¡Hola!, por favor, escribe \"abracadabra\"");
			wordInput=scanner.nextLine();
		}while (!wordInput.equals(WORD));
		//El problema está en que la comparativa de la variable que se esta intrduciendo no se realiza de esta
		//manera si no que se realiza de la siguiente !wordInput.equals(WORD). Me apunto este comando ya que 
		//no lo recordaba y por lo tanto no era capaz de encotrar como salir de la estructura iterativa, si sabia
		//que el problema lo tenia en el condicional del while
		System.out.println("¡pata de cabra!");
		scanner.close();
	}
}