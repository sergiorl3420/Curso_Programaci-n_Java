public class Ejemplo_02_06 {
    public static void main (String[] args){
        //Este ejercicio sirve para ver un poco y de forma sencilla como funcionan los operadores relacionales.
        //Además, con este ejercicio se pretende seguir utilizando diferentes métodos (o funciones) en vez de incluir
        //todo directametne en el método main.
        double numPri=25.00;
        double numSeg=25.00;
        boolean solucion=comparación(numPri, numSeg);
        System.out.println(solucion);
    }
    private static boolean comparación (double a, double b){
        //Se va cambiando el oprador relacional para ver cual es el comportamiento. No he realizado la prueba
        //con Strings ya que al tratarese de un objeto tienen un comportamiento respecto a la comparación diferente
        //y aún no se cual es la definición de objeto en Java.
        return a==b;
    }
}