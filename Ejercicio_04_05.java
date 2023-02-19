package Ejercicio_04_05;
//Sinceramente aún me cuesta familiarizarme con las estructuras iterativas, creo que de alguna manera tengo que hacer
//un mayor número de ejercicios para interiorizar este tipo de estructuras como si lo tengo con el resto de elementos
//siempre entre comillas.
public class Ejercicio_04_05 {
	private static final int LIM=10;
	public static void main (String args[]) {
		boolean find=false;
		int i=0;
		while (i<args.length && !find) {
			find=args[i].length()>LIM;
			i++;
		}
		if (find) {
			System.out.println("La "+i+" es demasiado larga.");
		}else {
			System.out.println ("Todas las palabras son correctas");
		}
	}
}