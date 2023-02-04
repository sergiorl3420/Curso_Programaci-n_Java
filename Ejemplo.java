import java.util.ArrayList;
import java.util.List;
//Estoy ysando Visual Studio Code y no he logrado pasar diferentes argumentos como se plantea en el
//ejercicio por lo que he creado una lista formada por int y unicamente por dos elementos para
//hacer la prueba y que saque cual es el número con el print
public class Ejemplo {
    public static void main (String[] args) {
        //Crear una lista
        List<Integer> Numeros;
        //es importante importar el java.util.List ya que de lo contrario no se puede ejecutara
        Numeros=new ArrayList<>();
        //lista de tipo array
        Numeros.add(0, 1);   
        Numeros.add(1, 2);;   
        System.out.println ("El número de la lista es");
        System.out.println (Numeros.get(0));
    }
}