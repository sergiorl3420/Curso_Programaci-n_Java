public class Ejemplo_03_02 {
    public static void main (String[] args){
        double temExterior=0.0;
        if (comparacion(temExterior)){
            System.out.println ("La temperatura exterior es igual a "+temExterior+"ºC positivos.");
        } else if (temExterior==0.0){
            System.out.println ("La tempertura exterior es igual a "+temExterior+" ni frío ni calor, pero una manta iría bien.");
        } else {
            System.out.println ("La temperatura exterior es igual a "+temExterior+"ºC negativos.");
        }
    }
//Aprovecho esta variación que he realizado para hacer el Ejemplo_03_02 donde se introduce la estrucra condicional
//else if, con la cual podemos controlar todos los valores que puede tomar la variable, tal y como se indica en el libro.
    private static boolean comparacion (double temp){
        return temp>0.0;
    } 
}
