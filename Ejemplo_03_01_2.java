//En este caso voy a hacer un método que se encargue de realizar la comprobación para pasar solo a la estructura
//condicional el valor y que saque el resultado con un print.

public class Ejemplo_03_01_2 {
    public static void main (String[] args){
        double temExterior=20.0;
        boolean resultado=comparacion(temExterior);
        if (resultado){
            System.out.println ("La temperatura exterior es igual a "+temExterior+"ºC positivos");
        } else {
            System.out.println ("La temperatura exterior es igual a "+temExterior+"ºC negativos");
        }
//Aprovecho esta variación que he realizado para hacer el Ejemplo_03_02 donde se introduce la estrucra condicional
//else if, con la cual podemos controlar todos los valores que puede tomar la variable, tal y como se indica en el libro.

    }   
    private static boolean comparacion (double a){
        return a>0.0;
    } 
}
