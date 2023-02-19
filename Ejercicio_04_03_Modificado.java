package Ejercicio_04_03_Modificado;
//Versión modificada usando un for each para recorrer toda la "lista o array" de argumentos y usando un for+if para
//sacar cada una de las respuesta.
public class Ejercicio_04_03_Modificado {
	private static final int MAX_LEN=5;
	private static final int SHR_REP=2;
	private static final int LOG_REP=4;
	
	public static void main (String args[]) {
		for (String s:args) {
			int lonWord=s.length();
			//Al final tengo que tener claro que las estructuras iterativas sirven para hacer una acción un número
			//x de veces y no pensar que solo sirven para recorrer una lista o un conjunto de elementos que es lo
			//que pienso siempre debido al for each. Tengo que verlo como un if repetido el número de veces que quiera.
			if (lonWord<=MAX_LEN) {
				for (int i=0;i<LOG_REP;i++) {
					System.out.print(s+" ");
				}
				System.out.print("\n");//Se puede hace directamente con System.out.println() pero como hemos visto los comandos
				//especiales por probar un poco (me gusta escribir lo se...)
			}else {
				for (int i=0;i<SHR_REP;i++) {
					System.out.print(s+" ");
				}	
				System.out.print("\n");
			}	
		}
	}
}