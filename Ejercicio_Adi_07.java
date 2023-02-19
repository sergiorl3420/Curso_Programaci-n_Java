package Ejercicio_Adi_07;
import java.util.Scanner;
//1.- Diseñe un algoritmo que determine si un número es o no es, par positivo.
public class Ejercicio_Adi_07 {
	public static void main (String args[]) {
		System.out.println("Por favor, introduce un numero:");
		Scanner scanner=new Scanner (System.in);
		int number=scanner.nextInt();
		
		if (number%2==0 && number>=0) {
			System.out.println("El numero "+number+" es par y positivo");
		}else {
			System.out.println("El numero "+number+" no es par y positivo");
		}
		scanner.close();		
	}
}