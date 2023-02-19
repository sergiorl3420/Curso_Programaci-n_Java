package Ejercicio_Adi_08_Modificado;
import java.util.Scanner;
//2.- Escribir una programa que pida la nota de un examen (un número real entre 0 y 10)
//e imprima por pantalla la calificación en formato “Reprueba”, si la nota es menor que  5,
//“Aprobado” si esta entre 5 y 7 sin incluirlo, “Notable” si esta entre 7 y 9 sin incluirlo,
//“Sobresaliente” si esta entre 9 y 10 sin incluirlo y “Excelente”  si la nota es igual a 10

//En este caso se emplea la estructura condicional switch

public class Ejercicio_Adi_08_Modificado {
	public static void main (String args[]) {
		System.out.println("Por favor, dime la nota de tu examen de programacion. Ten en cuenta que los valores se puntua del 0-10:");
		Scanner scanner=new Scanner (System.in);
		int number=scanner.nextInt();
		switch (number) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Suspenso");
			break;
		case 5:
		case 6:
			System.out.println("Aprobado");
			break;
		case 7:
		case 8:
			System.out.println("Notable");
			break;
		case 9:
			System.out.println("Sobresaliente");
			break;
		case 10:
			System.out.println("Excelente");
			break;
		default:
			System.out.println("Necesito una nota valida, lee el lo que te pido por favor");
		}
		scanner.close();		
	}
}
