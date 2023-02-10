public class Ejercicio_03_01_Mejorado {
	public static void main (String args[]) {
		int numArgs=args.length;
		
		if (numArgs==0) {
			System.out.print("No se han recibido argumentos.");
		}
		else {
			System.out.print("Se han recibido "+numArgs+" argumentos.");
		}
	}
}