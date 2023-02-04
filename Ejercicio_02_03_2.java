//Esta segunda solución es usando de nuevo los argumentos como valor de entrada para las variables. No obstante,
//se puede hacer como el Ejemplo_02_03.java donde se define el valor de la variable y se crea un método
//para determinar el área del rectángulo.
public class Ejercicio_02_03_2 {
    public static void main (String[] args){
        int ladoA=Integer.valueOf(args[0]);
        int ladoB=Integer.valueOf(args[1]);
        int areaRect=ladoA*ladoB;
        System.out.println("El rectángulo de "+ladoA+" por "+ladoB+" tiene un área de "+areaRect);
    }
}
