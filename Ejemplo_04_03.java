package Ejemplo_04_03;
public class Ejemplo_04_03 {
	private static final String CIERRE="FIN";//Se define la constante a utilizar.
	public static void main (String args[]) {
		System.out.println ("Se han recibido "+args.length+" argumentos");
		//El objetivo es buscar todos los argumentos hasta que encontremos la palabra
		//"FIN" pero sin incluirla en la lista o en lo que saca el sistema.
		int i=0;
			while (i<args.length && !args[i].equals(CIERRE)) {
		//IMPORTANTE: para coger el valor de un argumento y poder incluirlo como condición
		//se realiza el !args[i].equals(lo que se quiera incluir en este caso)
				System.out.println(args[i]);
				i++;//Muy importante incluir el avance en cualquier estructura iterativa
					//ya que de lo contrario el bucle nunca termina y se queda dentro
					//de manera infinita.
			}
		System.out.println("\"FIN\"estaba en la posición nº"+i);
	}
}