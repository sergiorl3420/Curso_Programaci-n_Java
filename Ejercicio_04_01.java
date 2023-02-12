package Ejercicio_04_01;
//En el día de hoy estoy claramente espeso... lo siento. He entendido que se tenia que 
//sacar el argumento en lower o upper en función del número de letras del mismo, pero no
//lo que se tiene que hacer es sacar en mayúsculas o minúsculas si el argumento tiene más o
//menos de 5 caracteres, hago otro modificado.
public class Ejercicio_04_01 {
	public static void main (String args[]) {	
	 	for (String s:args){
	 		//System.out.println (s);
			int conteo=s.length();
	 		if (conteo%2==0){
	 			String lower=s.toLowerCase();
	 			System.out.println (lower);
	 		}else{
				String upper=s.toUpperCase();
	 			System.out.println (upper);
	 		}	
	 }
}
}