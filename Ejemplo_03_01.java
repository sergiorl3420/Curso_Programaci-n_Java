//Este primer ejercici sirve para poner en practica la estructura condicional IF/ELSE. Se pide escribir un
//método que muestre la temperatura y que si el valor es positivo muestre "xºC positivos", en caso contrario
//mostrará "xºC negativos".

public class Ejemplo_03_01 {
    public static void main (String[] args){
    double tempExterior=-0.1; //Siemrpe se podria pasar como: double temExterior=Integer.valueOf(args[0]); pero
//en Visual Studio Code no puedo pasar argumentos como siempre y no quiero usar Eclipse. Para el futuro, quizas sea
//mejor usar argumentos ya que nos "datos" de entrada que no están en el código y se acerca más al comportamiento real
//que podría tener el código, ya que en ningún caso se iria cambiando el valor de la variable temExterior de manera manual
//(espero estar explicandome bien...).

//Estaba metiendo el condicional en otro método pero no lo he logrado, tengo que ver como hacerlo ya que
//en algunas ocasiones seguro que es mejor realizar la estuctura condicional en un método privado independiente
//lo unico que me ha fallado es que "tipo" de método definir.
    if (tempExterior>=0){
        System.out.println (tempExterior+"ºC positivos");
    } else {
        System.out.println (tempExterior+"ºC negativos");
    }
    }

}