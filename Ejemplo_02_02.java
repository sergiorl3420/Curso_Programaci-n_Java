public class Ejemplo_02_02 {
    public static void main(String[] args) {
    //En el ejercicio que marca el libro lo que hace es pasar a cada variable uno de los argumentos
    //que habia definido anteriormente. En mi caso como no he sido capaz de pasar diferentes
    //argumentos para luego poder asignarselos a cada variable, lo que he hecho es pasar
    //a cada una de las variables (o asignar) un integer, como se puede ver para manzanas, peras y platanos.
    int numManzanas=3; 
    int numPeras=4;
    double numPlatanos=4.5;
    double numFrutas=numManzanas+numPeras+numPlatanos;

    System.out.println("He comprado un montonazo de fruta, concretamente "+numFrutas+", una pasada");
    
    }
    }

