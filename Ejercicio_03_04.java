public class Ejercicio_03_04 {
//Como siempre esta es mi versión para dar respuesta al ejercicio, pero voy a hacer la _Mejorado usando
//los switch, así de esta manera pruebo a usarlo y aprendo a como hacerlo.
	public static void main (String args[]) {
		int numMes=Integer.valueOf(args[0]);
		
		if (numMes==1 || numMes==3 || numMes==5 || numMes==7 || numMes==8 || numMes==10 || numMes==12) {
			System.out.println ("El mes "+numMes+" tiene 31 dias.");
		}
		else if (numMes==2) {
			System.out.println ("El mes "+numMes+" tiene 31 dias.");
		}
		else if (numMes==4 || numMes==6 || numMes==9 || numMes==11) {
			System.out.println ("El mes "+numMes+" tiene 30 dias.");
		}
		else {
			System.err.println ("El mes "+numMes+" no es un mes valido.");
		}
	}
}