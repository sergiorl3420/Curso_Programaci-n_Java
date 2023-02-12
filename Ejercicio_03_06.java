public class Ejercicio_03_06 {
	public static void main (String args[]) {
		//Hay que determinar el valor absoluto de un float que se recibe como parámetro
		//Recuerda que cuando se incluye un argumento este es un String, por eso hay que hacer la conversión
		//a int o a float.

		float choNum=Float.valueOf(args[0]);
		
		if (choNum<0){
			float resNum=-1*choNum;
			System.out.println ("El varlor absoluto de "+choNum+" es "+resNum);
		}else{
			System.out.println ("El valor absoluto de "+choNum+" es "+choNum);
		}
	}
}
