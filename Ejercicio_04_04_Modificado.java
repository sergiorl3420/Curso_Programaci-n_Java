package Ejercicio_04_04_Modificado;
public class Ejercicio_04_04_Modificado {
	public static void main (String args[]) {
		if (args.length==1) {
			int num=Integer.valueOf(args[0]);
			int res=1;
			while (num>0) {
				res *=num;
				num--;
			//Es importante fijarse en que elemento estamos pasando la iteración para tener claro como funciona
			//el código que desarrollamos. Lo que hemos logrado es hacer el factorial de un número :)
			}
			System.out.println("Resultados: "+res);
		}else {
			System.err.println("Necesito un argumento, ni más ni menos");
		}
	}
}