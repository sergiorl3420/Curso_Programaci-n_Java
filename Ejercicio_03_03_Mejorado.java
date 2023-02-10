public class Ejercicio_03_03_Mejorado {
	private static final int MAX_ARGS=4;
	
	public static void main (String args[]) {
		int numArgs=args.length;
				
		if (numArgs==0) {
			System.err.println("No se han recibido argumentos.");
		}
		else if (numArgs<=MAX_ARGS) {
			System.out.println("Se han recibido "+numArgs+" argumentos.");
		}
		else {
			System.err.println("Se han recibido demasiados argumentos.");
		}
	}
}