package Ejercicio_Adi_09;
import java.util.Scanner;
//3.- Dado un número entero determine la cantidad de dígitos que tiene.

public class Ejercicio_Adi_09 {
	public static void main (String args[]) {
		System.out.println("Conoce el numero de digitos de tu numero favorido:");
		Scanner scanner=new Scanner (System.in);
		int number=scanner.nextInt();
		String numberToWord=String.valueOf(number);
		int numberLength=numberToWord.length();
		System.out.println("Tu numero favorito tiene "+numberLength+" digitos");
		scanner.close();		
	}
}