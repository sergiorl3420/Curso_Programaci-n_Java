package Ejercicio_Adi_10;
import java.util.Scanner;
//4.- Dado un número entero determine la suma de sus dígitos.
//Sinceramente este me ha costado un poco más pero he cogido la dinámica. 

public class Ejercicio_Adi_10 {
	public static void main (String args[]){
		System.out.println("Quieres conocer la suma de los digitos de tu numero favorito?");
		Scanner scanner=new Scanner (System.in);
		int number=scanner.nextInt();
		int digitSum=0;
		int module;
		while (number>0) {
			module=number%10;
			number=number/10;
			digitSum=digitSum+module;
		}
		System.out.println(digitSum);
		scanner.close();
	}
}
