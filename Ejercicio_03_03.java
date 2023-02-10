public class Ejercicio_03_03 {
	public static void main (String args[]) {
		int numArgs=args.length;
		//En este caso me pasa lo mismo, es decir, he definido bien la variable pero dentro
		//de mi método main. En este caso el libro propone que esta variable se defina fuera
		//del método y dentro de la clase. Esto son el tipo de cosas que tengo que aprender
		//a identificar. Hay la versión _Mejorado.
		int numArgsMax=4;
		
		if (numArgs==0) {
			System.err.println("No se han recibido argumentos.");
		}
		else if (numArgs<=numArgsMax) {
			System.out.println("Se han recibido "+numArgs+" argumentos.");
		}
		else {
			System.err.println("Se han recibido demasiados argumentos.");
		}
	}
}