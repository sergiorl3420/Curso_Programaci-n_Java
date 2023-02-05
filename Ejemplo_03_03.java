public class Ejemplo_03_03 {
    //Las constantes se definen dentro de la clase pero fuera del método de esta manera.
    private static final double TEM_EXTERIOR=0.0;
    //Puedo usar este nuevo concepto para reescribir el código del Ejercicio_03_02, pero en este caso
    //usando una constante (que yo voy a llamar global ya que aplica para toda la clase).
    public static void main (String[] args){
        double temExterior=TEM_EXTERIOR;
        if (comparacion(temExterior)){
            System.out.println ("La temperatura exterior es igual a "+temExterior+"ºC positivos.");
        } else if (temExterior==0.0){
            System.out.println ("La tempertura exterior es igual a "+temExterior+" ni frío ni calor, pero una manta iría bien.");
        } else {
            System.out.println ("La temperatura exterior es igual a "+temExterior+"ºC negativos.");
        }
    }
    private static boolean comparacion (double TEM_EXTERIOR){
        return TEM_EXTERIOR>0.0;
    } 
}