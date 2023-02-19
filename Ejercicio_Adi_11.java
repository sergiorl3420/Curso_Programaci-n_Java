package Ejercicio_Adi_11;
//5.- Imprimir por pantalla todos los múltiplos del 5, entre el rango 1 al 100

public class Ejercicio_Adi_11 {
	public static void main (String args[]) {
		for (int i=1; i<=100;i++) {
			if (i%5==0) {
				System.out.println(i);
			}
		}
	}
}