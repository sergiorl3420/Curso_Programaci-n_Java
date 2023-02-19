package Ejemplo_04_06;
public class Ejemplo_04_06 {
	public static void main (String args[]) {
	//El objetivo es pintar un rectangulo en la consola, algo divertido :)
		int shortSide=Integer.valueOf(args[0]);
		int longSide=Integer.valueOf(args[1]);
		String s="";

		for (int i=0; i<shortSide;i++){
			for (int j=0; j<longSide; j++){
				s +="X";
			}
			s +="\n";
		}
		System.out.println(s);
	}
}