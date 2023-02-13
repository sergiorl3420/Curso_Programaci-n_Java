package Ejercicio_04_04;
public class Ejercicio_04_04 {
	public static void main (String args[]){
		if (args.length==1){
			int res =1;
			for(int num=Integer.valueOf(args[0]); num>0; num--){
				res *=num;//res=res*num
			}
			System.out.println("Resultados: "+res);
		}else {
			System.err.println("Necesito un argumento, ni más ni menos");
		}
	}
}