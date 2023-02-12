package Ejemplo_04_02;
public class Ejemplo_04_02 {
	private static final int NUM=3;
	public static void main (String args[]) {
		//inicializador, condicio y avance. Al final la estructura iterativa for es un bucle
		//por lo que es necesario darle una inicialización, una condición y un avance. Si no
		//damos una avance correcto no se sale del bucle hasta que la memoria se llena.
		for (int i=0; i<NUM; i++) {
			System.out.println (i);
		//i++ incrementa el valor de i en uno.
		}
	}
}