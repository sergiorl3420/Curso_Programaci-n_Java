package Ejercicio_04_01_Modificado;
public class Ejercicio_04_01_Modificado {
	private static final int LIM=5;//Tomamos aqui el limite de caracteres.
	public static void main (String args[]) {
		for (String s:args) {
			if (s.length()<LIM) {
				System.out.println (s.toLowerCase());
			}else {
				System.out.println (s.toUpperCase());
			}
		}
		
	}
}