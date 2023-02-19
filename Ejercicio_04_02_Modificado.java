package Ejercicio_04_02_Modificado;
//Como bien planteaba en mis apuntes, este ejercicio se puede resolver tanto con la estructura
//iterativa for como con la estructura iterativa for each. En este segundo caso empleo for each.
public class Ejercicio_04_02_Modificado {
	public static void main (String args[]) {
		int i=0;
		for (String s: args) {
			System.out.println (i+") "+s);
			i++;
//Es facil, solo hay que inicilizar una variable como en el bucle for y darle un avance.
		}
	}
}