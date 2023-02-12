package Ejemplo_04_04;
public class Ejemplo_04_04 {
	//En este caso es el mismo tipo de concepto que para el ejercicio 05 pero ahora se
	//utiliza la estructura condicional do while y además se requiere que ese muestre
	//la palabra FIN.
	
	private static final String CIERRE="FIN";
	
	public static void main (String args[]) {
		if (args.length!=0) {
			System.out.println ("Se han recibido "+args.length+" argumentos");
			int i=0;
			String palabra;
			//Es importante asegurarse de que los extremos funcionan ya que tal y como está
			//ahora mismo el código verifica la posición args[0] pero en el caso de que no se trabaje
			//con una variable, en estes caso palabra, no será posible realizar esto.
			do {
				palabra=args[i];	
				System.out.println(i+")"+palabra);
				i++;
			} while(!palabra.equals(CIERRE)&& i<args.length);
			//Es importante familiarizarse con la expresion args[].equals()
			System.out.println ("\"FIN\" estaba en la posicion "+i);
			}else {
				System.err.println("No se han recibido argumentos");
			}
		}		
}
//Es importante hacer siempre los test que aseguran el correcto funciomiento del cóigo y el funcionamiento
//de los extremos, en este caso si la palabra FIN está al final o al principio de la lista de argumentos.