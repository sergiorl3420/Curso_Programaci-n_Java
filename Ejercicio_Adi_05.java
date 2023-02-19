package Ejercicio_Adi_05;
//El objetivo es que muestre los números del 100 al 0 utilizando la instrucción do while.
public class Ejercicio_Adi_05 {
	public static void main (String args[]) {
		System.out.println("Numeros del 100 al 0:");
		int i=100;
		do {
			System.out.println(i);
			i--;
		}while (i>=0);
	}
}