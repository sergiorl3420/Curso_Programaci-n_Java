public class Ejercicio_03_04_Mejorado {
	private static final int MES_MAX=12;
	private static final int MES_MIN=1;
	
	public static void main (String args[]) {
		int numMes=Integer.valueOf(args[0]);
		
		if (numMes<MES_MIN || numMes>MES_MAX) {
			System.err.println ("El mes "+numMes+" no es un mes valido.");
		}
		else {
			int dias=calcularDias(numMes);
			System.out.println ("El mes "+numMes+" tiene "+dias+" dias.");
		}
	}
	
	private static int calcularDias (int numMes) {
		int numDias;
		
		switch (numMes) {
		case 2:
			numDias=28;
			break;
		case 4:
			numDias=30;
			break;
		case 6:
			numDias=30;
			break;
		case 9:
			numDias=30;
			break;
		case 11:
			numDias=30;
			break;
		default:
			numDias=31;
			break;
		}
		return numDias; //Importante, todos los metodos tienen que tener siempre un return que es el valor
		//o elemento que devuelve, además todas las variables tienen que estar definidas (IMPORTANTE!!).
	}
}
