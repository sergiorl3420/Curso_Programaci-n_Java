public class Ejercicio_03_02 {
	public static void main (String args[]) {
		int numArgs=args.length;
		int numArgsMax=4;
		
		if (numArgs<=0) {
			System.out.print("No se han recibido argumentos.");
		}
		else if (numArgs>0 && numArgsMax<=4) {
			System.out.print("Se han recibido "+numArgs+" argumentos.");
		}
		else {
			System.out.print("Se han recibido demasiados argumentos.");
		}
	}
}
