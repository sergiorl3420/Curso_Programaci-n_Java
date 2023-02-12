package Ejercicio_04_03;
public class Ejercicio_04_03 {
	private static final int MAX_LEN=5;
	public static void main (String args[]) {
		for (int i=0;i<args.length;i++) {
			int length=args[i].length();
			if (length<=MAX_LEN) {
				//Esta es mi manera de hacer, funciona sí, pero quizas no sea la mejor opción. Correcto, hay una versión Modificado
				System.out.print(args[i]+" ");
				System.out.print(args[i]+" ");
				System.out.print(args[i]+" ");
				System.out.print(args[i]+" \n");
			}else {
				System.out.print(args[i]+" ");
				System.out.print(args[i]+" \n");
			}
		}
	}
}
