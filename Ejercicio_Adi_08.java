package Ejercicio_Adi_08;
import java.util.Scanner;
//2.- Escribir una programa que pida la nota de un examen (un número real entre 0 y 10)
//e imprima por pantalla la calificación en formato “Reprueba”, si la nota es menor que  5,
//“Aprobado” si esta entre 5 y 7 sin incluirlo, “Notable” si esta entre 7 y 9 sin incluirlo,
//“Sobresaliente” si esta entre 9 y 10 sin incluirlo y “Excelente”  si la nota es igual a 10

public class Ejercicio_Adi_08 {
	public static void main (String args[]) {
		System.out.println("Por favor, dime la nota de tu examen de programacion. Ten en cuenta que los valores se puntua del 0-10:");
		Scanner scanner=new Scanner (System.in);
		int number=scanner.nextInt();
		if (number>=0 && number<5) {
			System.out.println("Suspenso");
		}else if (number==5 || number==6 || number<7){
			System.out.println("Aprobado");
		}else if (number>=7 && number<=8) {
			System.out.println("Notable");
		}else if (number==9){
			System.out.println("Sobresaliente");
		}else if (number==10) {
			System.out.println("Excelente");
		}else {
			System.out.println("Necesito una nota valida, lee el lo que te pido por favor");
		}
		scanner.close();		
	}
}