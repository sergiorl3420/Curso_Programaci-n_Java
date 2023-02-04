public class Ejercicio_02_03 {
    public static void main (String[] args){
    //He picado el código en Visual Studio Code donde no soy capazd de definir argumentos, creo que se hace en el json 
    //pero no se como y no se si es así. Se podria definir las variables a y b como una conversión de string a int
    //usando Integer.valueOf (arg[0]) y de esta manera se podrían pasar los argumentos y no darle un valor 
    //directamente a las variables a y b. Esta versión sirve para el ejercicio 2.5 mientra que el Ejercicio_02_03_2 responde
    //a lo que se "quería" para el 2.3.
    int a=5;
    int b=6;
    int resultado=areaRectangulo(a, b);
    System.out.println ("El rectángulo de "+a+" por "+b+" tiene un área de "+resultado);
    }
    private static int areaRectangulo (int a, int b){
        return a*b;
    }

}
