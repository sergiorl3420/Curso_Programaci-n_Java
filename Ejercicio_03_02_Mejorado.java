public class Ejercicio_03_02_Mejorado {
	public static void main (String args[]) {
		int numArgs=args.length;
		
		if (numArgs==0) {
		//Tal y como esta con System.out.println funciona correctamente, desconozco porque
		//en el libro prefiere realizar un System.err.print, creo que es para que lo saque
		//por consola con otro color en Eclipse y así se indica que es un error y no la
		//salida correcta o esperada
			System.err.println("No se han recibido argumentos.");
		}
		else if (numArgs<=4) {
			System.out.println("Se han recibido "+numArgs+" argumentos.");
		}
		else {
			System.err.println("Se han recibido demasiados argumentos.");
		}
	}
}