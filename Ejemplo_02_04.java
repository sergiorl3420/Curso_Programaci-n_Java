public class Ejemplo_02_04 {
    public static void main(String[] args){
        //En este ejercicio vamos a crear el primer método en Java, lo que nos permitira tener una 
        //función que podremos llamar en multiples ocasiones, en este caso nos servira para sumar diferentes
        //variables que hayamos definido, principalmente como int.
        int kilosPlatanos=7;
        double kilosManzanas=250.50;
        int kilosPeras=50;
        double kilosTomates=99.99;
        //Ahora es el momento de definir el método que nos permita operar con las diferentes variables,
        //cuando pasemos estas por el método. Concretamente buscaremos que nos sume de dos en dos
        //cada una de las variables, pero se pueden hacer más cosas.
        double totalCompra=sumar(kilosPlatanos, kilosManzanas,kilosPeras, kilosTomates);
        System.out.print(totalCompra);
    }
    private static double sumar (double a, double b, double c, double d) {
        //De la misma manera que en el método main, se pueden definir dentro del método suma
        //todas las variables que sean necesarias para el mismo. En este caso se ha hecho un
        //ejemplo sencillo para incluir dentro de la suma de cada una de las variables del main
        //el int f definido en dentro del método suma.
        int f=1000;
        return a+b+c+d+f;
    }
}